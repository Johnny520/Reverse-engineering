// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.app.Activity;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.widget.ImageView;

public final class CLS180 extends ImageView {
    public static final Paint FLD1265;
    public static Bitmap FLD1266;
    public static final Canvas FLD1267;
    public static float FLD1268;

    static {
        CLS180.FLD1265 = new Paint();
        CLS180.FLD1267 = new Canvas();
    }

    public CLS180(Activity activity0) {
        super(activity0);
    }

    @Override  // android.widget.ImageView
    public final void onDraw(Canvas canvas0) {
        try {
            int v = this.getMeasuredWidth();
            int v1 = this.getMeasuredHeight();
            if(v > 0 && v1 > 0) {
                Paint paint0 = CLS180.FLD1265;
                Canvas canvas1 = CLS180.FLD1267;
                if(CLS180.FLD1266 == null) {
                    Bitmap bitmap0 = Bitmap.createBitmap(v, v1, Bitmap.Config.ARGB_8888);
                    CLS180.FLD1266 = bitmap0;
                    canvas1.setBitmap(bitmap0);
                    CLS180.FLD1268 = (float)(Math.min(v, v1) / 2);
                    BitmapShader bitmapShader0 = new BitmapShader(CLS180.FLD1266, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                    paint0.setAntiAlias(true);
                    paint0.setShader(bitmapShader0);
                }
                super.onDraw(canvas1);
                canvas0.drawCircle(((float)(this.getWidth() / 2)), ((float)(this.getHeight() / 2)), CLS180.FLD1268, paint0);
            }
        }
        catch(OutOfMemoryError unused_ex) {
            super.onDraw(canvas0);
        }
    }
}

