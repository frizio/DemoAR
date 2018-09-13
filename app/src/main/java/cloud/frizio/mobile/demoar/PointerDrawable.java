package cloud.frizio.mobile.demoar;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

// TODO 7 - Pointer
public class PointerDrawable extends Drawable {

    // TODO 8 -
    // Paint object for drawing
    private final Paint paint = new Paint();
    // Boolean flag for indicating enabled or disabled
    private boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    // TODO 9 -
    @Override
    public void draw(@NonNull Canvas canvas) {
        /*
        Draw a circle in green when enabled,
        and an (X in gray)  when disabled.
         */
        float cx = canvas.getWidth() / 2;
        float cy = canvas.getHeight() / 2;
        if (enabled) {
            paint.setColor(Color.GREEN);
            canvas.drawCircle(cx, cy, 20, paint);
        } else {
            paint.setColor(Color.RED);
            canvas.drawCircle(cx, cy, 10, paint);
        }

    }

    @Override
    public void setAlpha(int alpha) {

    }

    @Override
    public void setColorFilter(@Nullable ColorFilter colorFilter) {

    }

    @SuppressLint("WrongConstant")
    @Override
    public int getOpacity() {
        return 0;
    }
}
