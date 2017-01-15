package task.task_shopping.font;


import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by 201612221434 on 1/2/2017.
 */

public class NeologyDecoTextView extends TextView {

    public NeologyDecoTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public NeologyDecoTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public NeologyDecoTextView(Context context) {
        super(context);
        init();
    }

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(),
                "NeologyDeco.otf");
        setTypeface(tf);
    }
}
