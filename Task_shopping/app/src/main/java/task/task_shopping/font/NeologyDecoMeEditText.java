package task.task_shopping.font;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by 201612221434 on 1/2/2017.
 */

public class NeologyDecoMeEditText extends EditText {


    public NeologyDecoMeEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public NeologyDecoMeEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public NeologyDecoMeEditText(Context context) {
        super(context);
        init();
    }

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(),
                "NeologyDeco-Medium.otf");
        setTypeface(tf);
    }
}
