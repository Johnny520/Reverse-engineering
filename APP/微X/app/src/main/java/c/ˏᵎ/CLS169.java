// Decompiled by JEB v5.42.0.202606242140

package c.ˏᵎ;

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
import c.ˉˆ.CLS70.CLS69;
import c.ˉˆ.CLS70;
import c.ˊﹶ.CLS98;
import c.יᵎ.CLS246;
import c.ٴˑ.CLS584;
import c.ᐧᵎ.CLS265;
import c.ᐧᵎ.CLS270;
import c.ᐧᵎ.CLS272;
import c.ᐧᵎ.CLS585;
import c.ᐧᵎ.CLS586;
import c.ﾞʾ.CLS366;
import c.ﾞʾ.CLS841;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;

public class CLS169 {
    public static final HashMap FLD666;
    public static final HashMap FLD667;
    public static final HashMap FLD668;

    static {
        CLS169.FLD667 = new HashMap();
        CLS169.FLD668 = new HashMap();
        CLS169.FLD666 = new HashMap();
    }

    public static int MTH2317(int v, float f) {
        return (int)Math.min(((float)v) + f * ((float)v), 255.0f);
    }

    public static int MTH2318(int v, float f) {
        int v1 = Color.red(v);
        int v2 = Color.green(v);
        int v3 = CLS169.MTH2317(Color.blue(v), f);
        return Color.argb(Color.alpha(v), CLS169.MTH2317(v1, f), CLS169.MTH2317(v2, f), v3);
    }

    public static int MTH2319(BitmapFactory.Options bitmapFactory$Options0, int v, int v1) {
        return bitmapFactory$Options0.outHeight > v1 || bitmapFactory$Options0.outWidth > v ? Math.min(Math.round(((float)bitmapFactory$Options0.outHeight) / ((float)v1)), Math.round(((float)bitmapFactory$Options0.outWidth) / ((float)v))) : 1;
    }

    public static int MTH2320(int v, float f) {
        int v1 = Color.red(v);
        int v2 = Color.green(v);
        int v3 = CLS169.MTH2341(Color.blue(v), f);
        return Color.argb(Color.alpha(v), CLS169.MTH2341(v1, f), CLS169.MTH2341(v2, f), v3);
    }

    public static void MTH2321(Bitmap bitmap0, Handler.Callback handler$Callback0) {
        if(bitmap0 == null) {
            return;
        }
        if(!CLS169.MTH2332(bitmap0)) {
            bitmap0 = CLS169.MTH2338(bitmap0);
            if(!CLS169.MTH2332(bitmap0)) {
                return;
            }
        }
        CLS70.MTH1131().MTH1139(((CLS69)() -> {
            String s = CLS169.MTH2344(bitmap0);
            Bundle bundle0 = new Bundle();
            bundle0.putString("result", s);
            Message message0 = new Message();
            message0.setData(bundle0);
            handler$Callback0.handleMessage(message0);
        }));
    }

    public static Bitmap MTH2322(String s, int v, int v1) {
        return CLS584.MTH3398(s).MTH3399(v, v1).MTH3400();
    }

    public static boolean MTH2323(int v, float f) {
        int v1 = Color.red(v);
        int v2 = Color.green(v);
        int v3 = Color.blue(v);
        return ((float)v1) + ((float)v1) * f < 255.0f && ((float)v2) + ((float)v2) * f < 255.0f && ((float)v3) + f * ((float)v3) < 255.0f;
    }

    public static Bitmap MTH2324(InputStream inputStream0) {
        if(inputStream0 == null) {
            return null;
        }
        Bitmap bitmap0 = BitmapFactory.decodeStream(inputStream0);
        try {
            inputStream0.close();
        }
        catch(Exception exception0) {
            CLS185.MTH2708(exception0);
        }
        return bitmap0;
    }

    public static boolean MTH2325(int v, float f) {
        int v1 = Color.red(v);
        int v2 = Color.green(v);
        int v3 = Color.blue(v);
        return CLS169.MTH2323(v1, f) && CLS169.MTH2323(v2, f) && CLS169.MTH2323(v3, f);
    }

    // 去混淆评级： 低(20)
    public static int MTH2326(int v, float f) {
        return CLS169.MTH2325(v, f) ? CLS169.MTH2318(v, f) : CLS169.MTH2320(v, f);
    }

    public static Bitmap MTH2327(Drawable drawable0) {
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

    public static void MTH2328(Drawable drawable0, int v) {
        if(Build.VERSION.SDK_INT >= 21) {
            drawable0.setTint(v);
            return;
        }
        drawable0.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, ((float)Color.red(v)), 0.0f, 0.0f, 0.0f, 0.0f, ((float)Color.green(v)), 0.0f, 0.0f, 0.0f, 0.0f, ((float)Color.blue(v)), 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static String MTH2329(String s) {
        try {
            if(!CLS176.MTH2577(s)) {
                return null;
            }
            FileInputStream fileInputStream0 = new FileInputStream(s);
            String s1 = CLS169.MTH2336(fileInputStream0);
            fileInputStream0.close();
            return s1;
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return null;
        }
    }

    public static Bitmap MTH2330(String s) {
        try {
            return BitmapFactory.decodeFile(s);
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return null;
        }
    }

    // 检测为 Lambda 实现
    public static void MTH2331(String s, Handler.Callback handler$Callback0) [...]

    public static boolean MTH2332(Bitmap bitmap0) {
        try {
            int v = bitmap0.getWidth();
            int v1 = bitmap0.getHeight();
            int[] arr_v = new int[v * v1];
            bitmap0.getPixels(arr_v, 0, v, 0, 0, v, v1);
            return CLS169.MTH2333(new CLS272(((CLS270)new CLS841(((CLS265)new CLS585(v, v1, arr_v))))).MTH3499());
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return false;
        }
    }

    public static boolean MTH2333(CLS366 ﾞⁱ0) {
        try {
            new CLS246(ﾞⁱ0).MTH3257();
            return true;
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    public static void MTH2334(String s, Handler.Callback handler$Callback0) {
        CLS70.MTH1131().MTH1139(((CLS69)() -> {
            Bitmap bitmap0 = CLS169.MTH2330(s);
            if(bitmap0 == null) {
                return;
            }
            if(!CLS169.MTH2332(bitmap0)) {
                bitmap0 = CLS169.MTH2338(bitmap0);
                if(!CLS169.MTH2332(bitmap0)) {
                    return;
                }
            }
            String s1 = CLS169.MTH2344(bitmap0);
            Bundle bundle0 = new Bundle();
            bundle0.putString("result", s1);
            Message message0 = new Message();
            message0.setData(bundle0);
            handler$Callback0.handleMessage(message0);
        }));
    }

    public static Drawable MTH2335(int v) {
        if(Build.VERSION.SDK_INT < 21) {
            StateListDrawable stateListDrawable0 = new StateListDrawable();
            stateListDrawable0.addState(new int[]{0x10100A7}, new ColorDrawable(CLS169.MTH2326(v, 0.2f)));
            stateListDrawable0.addState(new int[]{0x101009C}, new ColorDrawable(CLS169.MTH2326(v, 0.4f)));
            ColorDrawable colorDrawable0 = new ColorDrawable(v);
            stateListDrawable0.addState(new int[0], colorDrawable0);
            return stateListDrawable0;
        }
        return new RippleDrawable(ColorStateList.valueOf(CLS169.MTH2326(v, 0.9f)), new ColorDrawable(v), CLS169.MTH2343(v));
    }

    public static String MTH2336(InputStream inputStream0) {
        try {
            return CLS169.MTH2344(BitmapFactory.decodeStream(inputStream0));
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return null;
        }
    }

    // 检测为 Lambda 实现
    public static void MTH2337(Bitmap bitmap0, Handler.Callback handler$Callback0) [...]

    public static Bitmap MTH2338(Bitmap bitmap0) {
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

    public static Bitmap MTH2339(String s, int v, int v1) {
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
        bitmapFactory$Options0.inSampleSize = CLS169.MTH2319(bitmapFactory$Options0, v, v1);
        bitmapFactory$Options0.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(s, bitmapFactory$Options0);
    }

    public static Bitmap MTH2340(Uri uri0) {
        String s = uri0.toString();
        HashMap hashMap0 = CLS169.FLD668;
        if(hashMap0.containsKey(s)) {
            Bitmap bitmap0 = (Bitmap)hashMap0.get(s);
            if(bitmap0 != null && !bitmap0.isRecycled()) {
                return bitmap0;
            }
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever0 = new MediaMetadataRetriever();
            mediaMetadataRetriever0.setDataSource(CLS98.MTH1323(), uri0);
            Bitmap bitmap1 = mediaMetadataRetriever0.getFrameAtTime();
            mediaMetadataRetriever0.release();
            if(bitmap1 != null) {
                hashMap0.put(s, bitmap1);
                return bitmap1;
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return null;
    }

    public static int MTH2341(int v, float f) {
        return (int)Math.max(((float)v) - f * ((float)v), 0.0f);
    }

    public static Drawable MTH2343(int v) {
        float[] arr_f = new float[8];
        Arrays.fill(arr_f, 3.0f);
        ShapeDrawable shapeDrawable0 = new ShapeDrawable(new RoundRectShape(arr_f, null, null));
        shapeDrawable0.getPaint().setColor(v);
        return shapeDrawable0;
    }

    public static String MTH2344(Bitmap bitmap0) {
        if(bitmap0 == null) {
            return null;
        }
        try {
            int v = bitmap0.getWidth();
            int v1 = bitmap0.getHeight();
            int[] arr_v = new int[v * v1];
            bitmap0.getPixels(arr_v, 0, v, 0, 0, v, v1);
            bitmap0.recycle();
            CLS272 ﾞⁱ0 = new CLS272(((CLS270)new CLS841(((CLS265)new CLS585(v, v1, arr_v)))));
            if(!CLS169.MTH2333(ﾞⁱ0.MTH3499())) {
                return null;
            }
            CLS586 ˉˎ0 = new CLS586();
            try {
                return ˉˎ0.MTH3462(ﾞⁱ0).MTH3488();
            }
            catch(Resources.NotFoundException resources$NotFoundException0) {
                CLS185.MTH2708(resources$NotFoundException0);
                return null;
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
            return null;
        }
    }

    public static Bitmap MTH2345(Uri uri0) {
        if(uri0 == null) {
            return null;
        }
        String s = uri0.toString();
        HashMap hashMap0 = CLS169.FLD668;
        if(hashMap0.containsKey(s)) {
            Bitmap bitmap0 = (Bitmap)hashMap0.get(s);
            if(bitmap0 != null && !bitmap0.isRecycled()) {
                return bitmap0;
            }
        }
        try {
            File file0 = new File(CLS176.MTH2573(CLS98.MTH1323()));
            CLS176.MTH2569(CLS176.MTH2592(uri0), file0);
            Bitmap bitmap1 = CLS169.MTH2339(file0.getAbsolutePath(), 0x40, 0x40);
            CLS176.MTH2596(file0);
            if(bitmap1 != null) {
                hashMap0.put(s, bitmap1);
                return bitmap1;
            }
        }
        catch(Throwable throwable0) {
            CLS185.MTH2708(throwable0);
        }
        return null;
    }
}

