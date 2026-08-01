// Decompiled by JEB v5.42.0.202606242140

package t.ˈˈ;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.NinePatchDrawable;
import java.util.ArrayList;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
public class CLS74 extends Enum {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS284 extends CLS74 {
        public CLS284() {
            super("NinePatch", 0);
        }

        @Override  // t.ˈˈ.CLS74
        public final CLS75 MTH1580(Bitmap bitmap0) {
            return CLS75.MTH1588(bitmap0.getNinePatchChunk());
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS285 extends CLS74 {
        public CLS285() {
            super("PlainImage", 2);
        }

        @Override  // t.ˈˈ.CLS74
        public final CLS75 MTH1580(Bitmap bitmap0) {
            return CLS75.MTH1593();
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS286 extends CLS74 {
        public CLS286() {
            super("RawNinePatch", 1);
        }

        @Override  // t.ˈˈ.CLS74
        public final CLS75 MTH1580(Bitmap bitmap0) {
            try {
                return CLS75.MTH1589(bitmap0);
            }
            catch(CLS79 unused_ex) {
                return CLS75.MTH1593();
            }
            catch(CLS78 unused_ex) {
                return CLS75.MTH1593();
            }
        }

        @Override  // t.ˈˈ.CLS74
        public final Bitmap MTH1581(Resources resources0, Bitmap bitmap0, CLS75 ˊﾞ0) {
            Bitmap bitmap1 = Bitmap.createBitmap(bitmap0, 1, 1, bitmap0.getWidth() - 2, bitmap0.getHeight() - 2);
            int v = resources0.getDisplayMetrics().densityDpi;
            float f = ((float)v) / ((float)bitmap0.getDensity());
            if(f != 1.0f) {
                bitmap1 = Bitmap.createScaledBitmap(bitmap1, Math.round(((float)bitmap1.getWidth()) * f), Math.round(((float)bitmap1.getHeight()) * f), true);
                bitmap1.setDensity(v);
                ˊﾞ0.FLD573 = new Rect(Math.round(((float)ˊﾞ0.FLD573.left) * f), Math.round(((float)ˊﾞ0.FLD573.top) * f), Math.round(((float)ˊﾞ0.FLD573.right) * f), Math.round(((float)ˊﾞ0.FLD573.bottom) * f));
                CLS286.MTH1573(f, ˊﾞ0.FLD572);
                CLS286.MTH1573(f, ˊﾞ0.FLD574);
            }
            return bitmap1;
        }

        public static void MTH1573(float f, ArrayList arrayList0) {
            for(Object object0: arrayList0) {
                ((CLS76)object0).FLD576 = Math.round(((float)((CLS76)object0).FLD576) * f);
                ((CLS76)object0).FLD577 = Math.round(((float)((CLS76)object0).FLD577) * f);
            }
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public final class CLS287 extends CLS74 {
        public CLS287() {
            super("NULL", 3);
        }

        @Override  // t.ˈˈ.CLS74
        public final NinePatchDrawable MTH1582(Resources resources0, Bitmap bitmap0) {
            return null;
        }
    }

    public static final enum CLS284 FLD568;
    public static final enum CLS285 FLD569;
    public static final enum CLS286 FLD570;
    public static final CLS74[] FLD571;

    static {
        CLS284 ˆٴ$ˆٴ0 = new CLS284();
        CLS74.FLD568 = ˆٴ$ˆٴ0;
        CLS286 ˆٴ$ᵔʾ0 = new CLS286();
        CLS74.FLD570 = ˆٴ$ᵔʾ0;
        CLS285 ˆٴ$ٴـ0 = new CLS285();
        CLS74.FLD569 = ˆٴ$ٴـ0;
        CLS74.FLD571 = new CLS74[]{ˆٴ$ˆٴ0, ˆٴ$ᵔʾ0, ˆٴ$ٴـ0, new CLS287()};
    }

    public CLS74(String s, int v) {
        super(s, v);
    }

    public static CLS74 valueOf(String s) {
        return (CLS74)Enum.valueOf(CLS74.class, s);
    }

    public static CLS74[] values() {
        return (CLS74[])CLS74.FLD571.clone();
    }

    public CLS75 MTH1580(Bitmap bitmap0) {
        return CLS75.MTH1593();
    }

    public Bitmap MTH1581(Resources resources0, Bitmap bitmap0, CLS75 ˊﾞ0) {
        return bitmap0;
    }

    public NinePatchDrawable MTH1582(Resources resources0, Bitmap bitmap0) {
        CLS75 ˊﾞ0 = this.MTH1580(bitmap0);
        byte[] arr_b = ˊﾞ0.MTH1590();
        return new NinePatchDrawable(resources0, this.MTH1581(resources0, bitmap0, ˊﾞ0), arr_b, ˊﾞ0.FLD573, null);
    }
}

