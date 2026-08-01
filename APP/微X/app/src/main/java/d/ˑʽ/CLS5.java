// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.ThumbnailUtils;
import android.os.Build.VERSION;
import android.text.TextUtils;
import d.יʻ.CLS63;
import d.יʻ.CLS69;
import d.ᵎʻ.CLS119;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;

public final class CLS5 {
    public static final HashMap FLD37;

    static {
        new HashMap();
        CLS5.FLD37 = new HashMap();
    }

    public static void MTH394(Drawable drawable0, int v) {
        if(Build.VERSION.SDK_INT >= 21) {
            drawable0.setTint(v);
            return;
        }
        drawable0.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, ((float)Color.red(v)), 0.0f, 0.0f, 0.0f, 0.0f, ((float)Color.green(v)), 0.0f, 0.0f, 0.0f, 0.0f, ((float)Color.blue(v)), 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static Bitmap MTH395(String s) {
        int v4;
        if(!(TextUtils.isEmpty(s) ? false : CLS63.MTH771(new File(s)))) {
            return null;
        }
        String s1 = new CLS119(s).MTH1166();
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        int v = 1;
        bitmapFactory$Options0.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s1, bitmapFactory$Options0);
        int v1 = 0x40;
        int v2 = bitmapFactory$Options0.outWidth;
        int v3 = bitmapFactory$Options0.outHeight;
        double f = ((double)v2) * 1.0 / ((double)v3);
        if(Double.compare(f, 1.0) > 0) {
            v1 = (int)(64.0 / f);
            v4 = 0x40;
        }
        else {
            v4 = (int)(64.0 * f);
        }
        if(v3 > v1 || v2 > v4) {
            v = Math.min(Math.round(((float)v3) / ((float)v1)), Math.round(((float)v2) / ((float)v4)));
        }
        bitmapFactory$Options0.inSampleSize = v;
        bitmapFactory$Options0.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(s1, bitmapFactory$Options0);
    }

    public static int MTH396(int v, float f) {
        int v1 = Color.red(v);
        int v2 = Color.green(v);
        int v3 = Color.blue(v);
        if(CLS5.MTH397(v1, f) && CLS5.MTH397(v2, f) && CLS5.MTH397(v3, f)) {
            int v4 = Color.red(v);
            int v5 = Color.green(v);
            float f1 = (float)Color.blue(v);
            return Color.argb(Color.alpha(v), ((int)Math.min(f * ((float)v4) + ((float)v4), 255.0f)), ((int)Math.min(f * ((float)v5) + ((float)v5), 255.0f)), ((int)Math.min(f * f1 + f1, 255.0f)));
        }
        int v6 = Color.red(v);
        int v7 = Color.green(v);
        float f2 = (float)Color.blue(v);
        return Color.argb(Color.alpha(v), ((int)Math.max(((float)v6) - f * ((float)v6), 0.0f)), ((int)Math.max(((float)v7) - f * ((float)v7), 0.0f)), ((int)Math.max(f2 - f * f2, 0.0f)));
    }

    public static boolean MTH397(int v, float f) {
        int v1 = Color.red(v);
        int v2 = Color.green(v);
        int v3 = Color.blue(v);
        return ((float)v1) * f + ((float)v1) < 255.0f && ((float)v2) * f + ((float)v2) < 255.0f && f * ((float)v3) + ((float)v3) < 255.0f;
    }

    public static Bitmap MTH398(String s) {
        Bitmap bitmap0;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        CLS119 ⁱٴ0 = new CLS119(s);
        if(CLS63.MTH772(ⁱٴ0)) {
            String s1 = ⁱٴ0.MTH1166();
            HashMap hashMap0 = CLS5.FLD37;
            if(hashMap0.containsKey(s1)) {
                bitmap0 = (Bitmap)hashMap0.get(s1);
                if(bitmap0 != null && !bitmap0.isRecycled()) {
                    return bitmap0;
                }
            }
            try {
                bitmap0 = ThumbnailUtils.createVideoThumbnail(s1, 1);
                if(bitmap0 != null) {
                    hashMap0.put(s1, bitmap0);
                    return bitmap0;
                }
            }
            catch(Exception exception0) {
                CLS69.MTH797(exception0);
            }
        }
        return null;
    }

    public static Bitmap MTH399(String s) {
        Bitmap bitmap0;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        CLS119 ⁱٴ0 = new CLS119(s);
        if(CLS63.MTH772(ⁱٴ0)) {
            String s1 = ⁱٴ0.MTH1166();
            HashMap hashMap0 = CLS5.FLD37;
            if(hashMap0.containsKey(s1)) {
                bitmap0 = (Bitmap)hashMap0.get(s1);
                if(bitmap0 != null && !bitmap0.isRecycled()) {
                    return bitmap0;
                }
            }
            try {
                bitmap0 = CLS5.MTH395(s1);
                if(bitmap0 != null) {
                    hashMap0.put(s1, bitmap0);
                    return bitmap0;
                }
            }
            catch(Throwable throwable0) {
                CLS69.MTH797(throwable0);
            }
        }
        return null;
    }

    public static Drawable MTH400(int v) {
        if(Build.VERSION.SDK_INT < 21) {
            StateListDrawable stateListDrawable0 = new StateListDrawable();
            stateListDrawable0.addState(new int[]{0x10100A7}, new ColorDrawable(CLS5.MTH396(v, 0.2f)));
            stateListDrawable0.addState(new int[]{0x101009C}, new ColorDrawable(CLS5.MTH396(v, 0.4f)));
            ColorDrawable colorDrawable0 = new ColorDrawable(v);
            stateListDrawable0.addState(new int[0], colorDrawable0);
            return stateListDrawable0;
        }
        ColorStateList colorStateList0 = ColorStateList.valueOf(CLS5.MTH396(v, 0.9f));
        ColorDrawable colorDrawable1 = new ColorDrawable(v);
        float[] arr_f = new float[8];
        Arrays.fill(arr_f, 3.0f);
        ShapeDrawable shapeDrawable0 = new ShapeDrawable(new RoundRectShape(arr_f, null, null));
        shapeDrawable0.getPaint().setColor(v);
        return new RippleDrawable(colorStateList0, colorDrawable1, shapeDrawable0);
    }
}

