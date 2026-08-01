// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import t.ᵔʾ.CLS133;

public final class CLS42 {
    public static Bitmap MTH1410(String s) {
        boolean z;
        Bitmap bitmap0 = null;
        try {
            bitmap0 = CLS33.MTH1359(s);
            if(bitmap0 == null) {
                ImageView imageView0 = new ImageView(CLS133.MTH2108());
                try {
                    CLS33.MTH1350(imageView0, s);
                    z = true;
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                    z = false;
                }
                if(z) {
                    imageView0.buildDrawingCache();
                    Bitmap bitmap1 = imageView0.getDrawingCache();
                    if(bitmap1 == null) {
                        try {
                            bitmap1 = ((BitmapDrawable)imageView0.getDrawable()).getBitmap();
                        }
                        catch(Throwable unused_ex) {
                        }
                    }
                    bitmap0 = bitmap1;
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        return bitmap0 == null ? BitmapFactory.decodeResource(CLS133.MTH2108().getResources(), CLS133.MTH2108().getApplicationInfo().icon) : bitmap0;
    }
}

