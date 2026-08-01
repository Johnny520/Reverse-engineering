// Decompiled by JEB v5.42.0.202606242140

package c.ـˉ;

import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Message;
import c.ˈⁱ.CLS95;
import c.ˎʿ.CLS626;
import c.ˎˊ.CLS117;
import c.ˎˊ.CLS832;
import c.ˑٴ.CLS137;
import c.יᴵ.CLS144.CLS142;
import c.יᴵ.CLS144;
import c.ﾞﹶ.CLS374;
import c.ﾞﹶ.CLS375;
import c.ﾞﹶ.CLS378;
import c.ﾞﹶ.CLS820;
import c.ﾞﹶ.CLS821;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;

public class CLS264 {
    public static final HashMap FLD1177;
    public static final HashMap FLD1178;
    public static final HashMap FLD1179;

    static {
        CLS264.FLD1178 = new HashMap();
        CLS264.FLD1177 = new HashMap();
        CLS264.FLD1179 = new HashMap();
    }

    public static Bitmap MTH4090(String s, int v, int v1) {
        return CLS626.MTH2308(s).MTH2309(v, v1).MTH2307();
    }

    public static boolean MTH4091(int v, float f) {
        int v1 = Color.red(v);
        int v2 = Color.green(v);
        int v3 = Color.blue(v);
        return ((float)v1) + ((float)v1) * f < 255.0f && ((float)v2) + ((float)v2) * f < 255.0f && ((float)v3) + f * ((float)v3) < 255.0f;
    }

    public static Bitmap MTH4092(String s, int v, int v1) {
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s, bitmapFactory$Options0);
        double f = ((double)bitmapFactory$Options0.outWidth) * 1.0 / ((double)bitmapFactory$Options0.outHeight);
        if(f > ((double)v) * 1.0 / ((double)v1)) {
            v1 = (int)(((double)v) / f);
        }
        else {
            v = (int)(((double)v1) * f);
        }
        bitmapFactory$Options0.inSampleSize = CLS264.MTH4109(bitmapFactory$Options0, v, v1);
        bitmapFactory$Options0.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(s, bitmapFactory$Options0);
    }

    public static String MTH4094(String s) {
        try {
            if(!CLS262.MTH4045(s)) {
                return null;
            }
            FileInputStream fileInputStream0 = new FileInputStream(s);
            String s1 = CLS264.MTH4102(fileInputStream0);
            fileInputStream0.close();
            return s1;
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return null;
        }
    }

    public static void MTH4095(String s, Handler.Callback handler$Callback0) {
        CLS144.MTH2583().MTH2589(((CLS142)() -> {
            Bitmap bitmap0 = CLS264.MTH4099(s);
            if(bitmap0 == null) {
                return;
            }
            if(!CLS264.MTH4107(bitmap0)) {
                bitmap0 = CLS264.MTH4111(bitmap0);
                if(!CLS264.MTH4107(bitmap0)) {
                    return;
                }
            }
            String s1 = CLS264.MTH4103(bitmap0);
            Bundle bundle0 = new Bundle();
            bundle0.putString("result", s1);
            Message message0 = new Message();
            message0.setData(bundle0);
            handler$Callback0.handleMessage(message0);
        }));
    }

    public static Bitmap MTH4096(Drawable drawable0) {
        if(drawable0 instanceof BitmapDrawable) {
            return ((BitmapDrawable)drawable0).getBitmap();
        }
        if(drawable0 instanceof NinePatchDrawable) {
            Bitmap bitmap0 = Bitmap.createBitmap(drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight(), (drawable0.getOpacity() == -1 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888));
            Canvas canvas0 = new Canvas(bitmap0);
            drawable0.setBounds(0, 0, drawable0.getIntrinsicWidth(), drawable0.getIntrinsicHeight());
            drawable0.draw(canvas0);
            return bitmap0;
        }
        return null;
    }

    // 去混淆评级： 低(20)
    public static int MTH4097(int v, float f) {
        return CLS264.MTH4116(v, f) ? CLS264.MTH4110(v, f) : CLS264.MTH4100(v, f);
    }

    // 检测为 Lambda 实现
    public static void MTH4098(String s, Handler.Callback handler$Callback0) [...]

    public static Bitmap MTH4099(String s) {
        try {
            return BitmapFactory.decodeFile(s);
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return null;
        }
    }

    public static int MTH4100(int v, float f) {
        int v1 = Color.red(v);
        int v2 = Color.green(v);
        int v3 = CLS264.MTH4105(Color.blue(v), f);
        return Color.argb(Color.alpha(v), CLS264.MTH4105(v1, f), CLS264.MTH4105(v2, f), v3);
    }

    public static Drawable MTH4101(int v) {
        float[] arr_f = new float[8];
        Arrays.fill(arr_f, 3.0f);
        ShapeDrawable shapeDrawable0 = new ShapeDrawable(new RoundRectShape(arr_f, null, null));
        shapeDrawable0.getPaint().setColor(v);
        return shapeDrawable0;
    }

    public static String MTH4102(InputStream inputStream0) {
        try {
            return CLS264.MTH4103(BitmapFactory.decodeStream(inputStream0));
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return null;
        }
    }

    public static String MTH4103(Bitmap bitmap0) {
        if(bitmap0 == null) {
            return null;
        }
        try {
            int v = bitmap0.getWidth();
            int v1 = bitmap0.getHeight();
            int[] arr_v = new int[v * v1];
            bitmap0.getPixels(arr_v, 0, v, 0, 0, v, v1);
            bitmap0.recycle();
            CLS374 ʻᵢ0 = new CLS374(((CLS375)new CLS832(((CLS378)new CLS820(v, v1, arr_v)))));
            if(!CLS264.MTH4108(ʻᵢ0.MTH5087())) {
                return null;
            }
            CLS821 ᵔﹶ0 = new CLS821();
            try {
                return ᵔﹶ0.MTH5134(ʻᵢ0).MTH5121();
            }
            catch(Resources.NotFoundException resources$NotFoundException0) {
                CLS204.MTH3257(resources$NotFoundException0);
                return null;
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return null;
        }
    }

    public static Drawable MTH4104(int v) {
        if(Build.VERSION.SDK_INT < 21) {
            StateListDrawable stateListDrawable0 = new StateListDrawable();
            stateListDrawable0.addState(new int[]{0x10100A7}, new ColorDrawable(CLS264.MTH4097(v, 0.2f)));
            stateListDrawable0.addState(new int[]{0x101009C}, new ColorDrawable(CLS264.MTH4097(v, 0.4f)));
            ColorDrawable colorDrawable0 = new ColorDrawable(v);
            stateListDrawable0.addState(new int[0], colorDrawable0);
            return stateListDrawable0;
        }
        return new RippleDrawable(ColorStateList.valueOf(CLS264.MTH4097(v, 0.9f)), new ColorDrawable(v), CLS264.MTH4101(v));
    }

    public static int MTH4105(int v, float f) {
        return (int)Math.max(((float)v) - f * ((float)v), 0.0f);
    }

    public static Bitmap MTH4106(InputStream inputStream0) {
        if(inputStream0 == null) {
            return null;
        }
        Bitmap bitmap0 = BitmapFactory.decodeStream(inputStream0);
        try {
            inputStream0.close();
        }
        catch(Exception exception0) {
            CLS204.MTH3257(exception0);
        }
        return bitmap0;
    }

    public static boolean MTH4107(Bitmap bitmap0) {
        try {
            int v = bitmap0.getWidth();
            int v1 = bitmap0.getHeight();
            int[] arr_v = new int[v * v1];
            bitmap0.getPixels(arr_v, 0, v, 0, 0, v, v1);
            return CLS264.MTH4108(new CLS374(((CLS375)new CLS832(((CLS378)new CLS820(v, v1, arr_v))))).MTH5087());
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
            return false;
        }
    }

    public static boolean MTH4108(CLS117 ʻᵢ0) {
        try {
            new CLS137(ʻᵢ0).MTH2536();
            return true;
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    public static int MTH4109(BitmapFactory.Options bitmapFactory$Options0, int v, int v1) {
        return bitmapFactory$Options0.outHeight > v1 || bitmapFactory$Options0.outWidth > v ? Math.min(Math.round(((float)bitmapFactory$Options0.outHeight) / ((float)v1)), Math.round(((float)bitmapFactory$Options0.outWidth) / ((float)v))) : 1;
    }

    public static int MTH4110(int v, float f) {
        int v1 = Color.red(v);
        int v2 = Color.green(v);
        int v3 = CLS264.MTH4113(Color.blue(v), f);
        return Color.argb(Color.alpha(v), CLS264.MTH4113(v1, f), CLS264.MTH4113(v2, f), v3);
    }

    public static Bitmap MTH4111(Bitmap bitmap0) {
        int v = bitmap0.getHeight();
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap0.getWidth(), v, Bitmap.Config.ARGB_8888);
        Canvas canvas0 = new Canvas(bitmap1);
        Paint paint0 = new Paint();
        ColorMatrix colorMatrix0 = new ColorMatrix();
        colorMatrix0.setSaturation(0.0f);
        ColorMatrix colorMatrix1 = new ColorMatrix();
        colorMatrix1.set(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        colorMatrix1.preConcat(colorMatrix0);
        paint0.setColorFilter(new ColorMatrixColorFilter(colorMatrix1));
        canvas0.drawBitmap(bitmap0, 0.0f, 0.0f, paint0);
        return bitmap1;
    }

    public static Bitmap MTH4112(Uri uri0) {
        if(uri0 == null) {
            return null;
        }
        String s = uri0.toString();
        HashMap hashMap0 = CLS264.FLD1177;
        if(hashMap0.containsKey(s)) {
            Bitmap bitmap0 = (Bitmap)hashMap0.get(s);
            if(bitmap0 != null && !bitmap0.isRecycled()) {
                return bitmap0;
            }
        }
        try {
            File file0 = new File(CLS262.MTH4040(CLS95.MTH2017()));
            CLS262.MTH4060(CLS262.MTH4062(uri0), file0);
            Bitmap bitmap1 = CLS264.MTH4092(file0.getAbsolutePath(), 0x40, 0x40);
            CLS262.MTH4065(file0);
            if(bitmap1 != null) {
                hashMap0.put(s, bitmap1);
                return bitmap1;
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return null;
    }

    public static int MTH4113(int v, float f) {
        return (int)Math.min(((float)v) + f * ((float)v), 255.0f);
    }

    public static Bitmap MTH4114(Uri uri0) {
        String s = uri0.toString();
        HashMap hashMap0 = CLS264.FLD1177;
        if(hashMap0.containsKey(s)) {
            Bitmap bitmap0 = (Bitmap)hashMap0.get(s);
            if(bitmap0 != null && !bitmap0.isRecycled()) {
                return bitmap0;
            }
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever0 = new MediaMetadataRetriever();
            mediaMetadataRetriever0.setDataSource(CLS95.MTH2017(), uri0);
            Bitmap bitmap1 = mediaMetadataRetriever0.getFrameAtTime();
            mediaMetadataRetriever0.release();
            if(bitmap1 != null) {
                hashMap0.put(s, bitmap1);
                return bitmap1;
            }
        }
        catch(Throwable throwable0) {
            CLS204.MTH3257(throwable0);
        }
        return null;
    }

    public static void MTH4115(Drawable drawable0, int v) {
        if(Build.VERSION.SDK_INT >= 21) {
            drawable0.setTint(v);
            return;
        }
        drawable0.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, ((float)Color.red(v)), 0.0f, 0.0f, 0.0f, 0.0f, ((float)Color.green(v)), 0.0f, 0.0f, 0.0f, 0.0f, ((float)Color.blue(v)), 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static boolean MTH4116(int v, float f) {
        int v1 = Color.red(v);
        int v2 = Color.green(v);
        int v3 = Color.blue(v);
        return CLS264.MTH4091(v1, f) && CLS264.MTH4091(v2, f) && CLS264.MTH4091(v3, f);
    }

    public static void MTH4117(Bitmap bitmap0, Handler.Callback handler$Callback0) {
        if(bitmap0 == null) {
            return;
        }
        if(!CLS264.MTH4107(bitmap0)) {
            bitmap0 = CLS264.MTH4111(bitmap0);
            if(!CLS264.MTH4107(bitmap0)) {
                return;
            }
        }
        CLS144.MTH2583().MTH2589(((CLS142)() -> {
            String s = CLS264.MTH4103(bitmap0);
            Bundle bundle0 = new Bundle();
            bundle0.putString("result", s);
            Message message0 = new Message();
            message0.setData(bundle0);
            handler$Callback0.handleMessage(message0);
        }));
    }

    // 检测为 Lambda 实现
    public static void MTH4118(Bitmap bitmap0, Handler.Callback handler$Callback0) [...]
}

