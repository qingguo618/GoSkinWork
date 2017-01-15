package task.task_shopping.font;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by 201612221434 on 1/2/2017.
 */

public class NeologyDecoBoldButton extends Button {

    public NeologyDecoBoldButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public NeologyDecoBoldButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public NeologyDecoBoldButton(Context context) {
        super(context);
        init();
    }

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(),
                "NeologyDeco-Bold.otf");
        setTypeface(tf);
    }
}
