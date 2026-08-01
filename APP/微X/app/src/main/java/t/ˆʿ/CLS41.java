// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build.VERSION;
import android.renderscript.Allocation.MipmapControl;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;
import t.ˊﾞ.CLS106;
import t.ᵔʾ.CLS125;
import t.ᵔʾ.CLS133;

public final class CLS41 {
    public static final HashMap FLD488;
    public static final HashMap FLD489;
    public static final HashMap FLD490;

    static {
        CLS41.FLD488 = new HashMap();
        CLS41.FLD490 = new HashMap();
        CLS41.FLD489 = new HashMap();
    }

    public static Bitmap MTH1392(Uri uri0) {
        Bitmap bitmap1;
        HashMap hashMap0 = CLS41.FLD488;
        if(hashMap0.containsKey(uri0.toString())) {
            Bitmap bitmap0 = (Bitmap)hashMap0.get(uri0.toString());
            if(bitmap0 != null && !bitmap0.isRecycled()) {
                return bitmap0;
            }
        }
        InputStream inputStream0 = CLS125.MTH2027(uri0);
        if(inputStream0 == null) {
            bitmap1 = null;
        }
        else {
            Bitmap bitmap2 = BitmapFactory.decodeStream(inputStream0);
            try {
                inputStream0.close();
            }
            catch(Exception exception0) {
                CLS133.MTH2113(exception0);
            }
            bitmap1 = bitmap2;
        }
        hashMap0.put(uri0.toString(), bitmap1);
        return bitmap1;
    }

    public static Bitmap MTH1393(String s) {
        try {
            return BitmapFactory.decodeFile(s);
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
            return null;
        }
    }

    public static Bitmap MTH1394(String s, int v, int v1) {
        int v5;
        if(!CLS125.MTH2024(s)) {
            return null;
        }
        String s1 = new CLS106(s).MTH1848();
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s1, bitmapFactory$Options0);
        int v2 = v1;
        int v3 = bitmapFactory$Options0.outWidth;
        int v4 = bitmapFactory$Options0.outHeight;
        double f = ((double)v3) * 1.0 / ((double)v4);
        if(f > ((double)v) * 1.0 / ((double)v2)) {
            v2 = (int)(((double)v) / f);
            v5 = v;
        }
        else {
            v5 = (int)(((double)v2) * f);
        }
        bitmapFactory$Options0.inSampleSize = v4 > v2 || v3 > v5 ? Math.min(Math.round(((float)v4) / ((float)v2)), Math.round(((float)v3) / ((float)v5))) : 1;
        bitmapFactory$Options0.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(s1, bitmapFactory$Options0);
    }

    public static boolean MTH1395(int v, float f) {
        int v1 = Color.red(v);
        int v2 = Color.green(v);
        int v3 = Color.blue(v);
        return ((float)v1) * f + ((float)v1) < 255.0f && ((float)v2) * f + ((float)v2) < 255.0f && f * ((float)v3) + ((float)v3) < 255.0f;
    }

    public static Bitmap MTH1396(Uri uri0, int v, int v1) {
        HashMap hashMap0 = CLS41.FLD488;
        if(hashMap0.containsKey(uri0.toString())) {
            Bitmap bitmap0 = (Bitmap)hashMap0.get(uri0.toString());
            if(bitmap0 != null && !bitmap0.isRecycled()) {
                return bitmap0;
            }
        }
        File file0 = new File(CLS125.MTH2028(CLS133.MTH2108()));
        CLS125.MTH2036(CLS125.MTH2027(uri0), file0);
        Bitmap bitmap1 = CLS41.MTH1394(file0.getAbsolutePath(), v, v1);
        CLS125.MTH2041(file0);
        hashMap0.put(uri0.toString(), bitmap1);
        return bitmap1;
    }

    public static Bitmap MTH1397(Bitmap bitmap0, int v) {
        if(bitmap0 == null) {
            return null;
        }
        Bitmap bitmap1 = bitmap0.copy(bitmap0.getConfig(), true);
        Paint paint0 = new Paint();
        paint0.setColorFilter(new LightingColorFilter(v, 1));
        new Canvas(bitmap1).drawBitmap(bitmap1, 0.0f, 0.0f, paint0);
        return bitmap1;
    }

    public static Bitmap MTH1398(String s) {
        Bitmap bitmap0;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        CLS106 ٴـ0 = new CLS106(s);
        if(CLS125.MTH2022(ٴـ0)) {
            String s1 = ٴـ0.MTH1848();
            HashMap hashMap0 = CLS41.FLD490;
            if(hashMap0.containsKey(s1)) {
                bitmap0 = (Bitmap)hashMap0.get(s1);
                if(bitmap0 != null && !bitmap0.isRecycled()) {
                    return bitmap0;
                }
            }
            try {
                bitmap0 = CLS41.MTH1394(s1, 0x40, 0x40);
                if(bitmap0 != null) {
                    hashMap0.put(s1, bitmap0);
                    return bitmap0;
                }
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
        }
        return null;
    }

    public static Bitmap MTH1399(Context context0, JSONObject jSONObject0, Bitmap bitmap0) {
        if(bitmap0 == null) {
            return null;
        }
        try {
            if(jSONObject0.has("c")) {
                String s = jSONObject0.getString("c");
                if(!TextUtils.isEmpty(s) && Color.alpha(CLS46.MTH1447(s)) != 0) {
                    bitmap0 = CLS41.MTH1397(bitmap0, CLS46.MTH1447(s));
                }
            }
            if(jSONObject0.has("b")) {
                int v = jSONObject0.getInt("b");
                if(v != 0) {
                    return CLS41.MTH1408(context0, bitmap0, v);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        return bitmap0;
    }

    public static Drawable MTH1400(int v) {
        if(Build.VERSION.SDK_INT < 21) {
            StateListDrawable stateListDrawable0 = new StateListDrawable();
            stateListDrawable0.addState(new int[]{0x10100A7}, new ColorDrawable(CLS41.MTH1407(v, 0.2f)));
            stateListDrawable0.addState(new int[]{0x101009C}, new ColorDrawable(CLS41.MTH1407(v, 0.4f)));
            ColorDrawable colorDrawable0 = new ColorDrawable(v);
            stateListDrawable0.addState(new int[0], colorDrawable0);
            return stateListDrawable0;
        }
        ColorStateList colorStateList0 = ColorStateList.valueOf(CLS41.MTH1407(v, 0.9f));
        ColorDrawable colorDrawable1 = new ColorDrawable(v);
        float[] arr_f = new float[8];
        Arrays.fill(arr_f, 3.0f);
        ShapeDrawable shapeDrawable0 = new ShapeDrawable(new RoundRectShape(arr_f, null, null));
        shapeDrawable0.getPaint().setColor(v);
        return new RippleDrawable(colorStateList0, colorDrawable1, shapeDrawable0);
    }

    public static void MTH1401(Drawable drawable0, int v) {
        if(Build.VERSION.SDK_INT >= 21) {
            drawable0.setTint(v);
            return;
        }
        drawable0.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, ((float)Color.red(v)), 0.0f, 0.0f, 0.0f, 0.0f, ((float)Color.green(v)), 0.0f, 0.0f, 0.0f, 0.0f, ((float)Color.blue(v)), 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static Bitmap MTH1402(Bitmap bitmap0, float f) {
        return bitmap0 == null ? null : Bitmap.createScaledBitmap(bitmap0, ((int)(((float)bitmap0.getWidth()) * f)), ((int)(((float)bitmap0.getHeight()) * f)), true);
    }

    public static Bitmap MTH1403(Bitmap bitmap0) {
        if(bitmap0 == null) {
            return null;
        }
        int v = bitmap0.getHeight();
        HashMap hashMap0 = CLS41.FLD489;
        if(hashMap0.containsKey(bitmap0)) {
            return (Bitmap)hashMap0.get(bitmap0);
        }
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap0.getWidth(), bitmap0.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas0 = new Canvas(bitmap1);
        Paint paint0 = new Paint();
        Rect rect0 = new Rect(0, 0, bitmap0.getWidth(), bitmap0.getHeight());
        RectF rectF0 = new RectF(rect0);
        paint0.setAntiAlias(true);
        canvas0.drawARGB(0, 0, 0, 0);
        paint0.setColor(0xFF424242);
        float f = (float)(v / 2);
        canvas0.drawRoundRect(rectF0, f, f, paint0);
        paint0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas0.drawBitmap(bitmap0, rect0, rect0, paint0);
        hashMap0.put(bitmap0, bitmap1);
        return bitmap1;
    }

    public static Bitmap MTH1404(Bitmap bitmap0, int v) {
        ColorMatrixColorFilter colorMatrixColorFilter0 = new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, ((float)Color.red(v)), 0.0f, 0.0f, 0.0f, 0.0f, ((float)Color.green(v)), 0.0f, 0.0f, 0.0f, 0.0f, ((float)Color.blue(v)), 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        Paint paint0 = new Paint();
        paint0.setColorFilter(colorMatrixColorFilter0);
        paint0.setAlpha(Color.alpha(v));
        Bitmap bitmap1 = bitmap0.copy(bitmap0.getConfig(), true);
        new Canvas(bitmap1).drawBitmap(bitmap1, 0.0f, 0.0f, paint0);
        return bitmap1;
    }

    public static Bitmap MTH1405(Uri uri0) {
        if(uri0 == null) {
            return null;
        }
        String s = uri0.toString();
        HashMap hashMap0 = CLS41.FLD490;
        if(hashMap0.containsKey(s)) {
            Bitmap bitmap0 = (Bitmap)hashMap0.get(s);
            if(bitmap0 != null && !bitmap0.isRecycled()) {
                return bitmap0;
            }
        }
        try {
            File file0 = new File(CLS125.MTH2028(CLS133.MTH2108()));
            CLS125.MTH2036(CLS125.MTH2027(uri0), file0);
            Bitmap bitmap1 = CLS41.MTH1394(file0.getAbsolutePath(), 0x40, 0x40);
            CLS125.MTH2041(file0);
            if(bitmap1 != null) {
                hashMap0.put(s, bitmap1);
                return bitmap1;
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        return null;
    }

    public static Bitmap MTH1406(Bitmap bitmap0) {
        if(bitmap0 != null) {
            int v = bitmap0.getWidth();
            int v1 = bitmap0.getHeight();
            int v2 = (int)Math.floor(((float)v) * (512.0f / ((float)v)));
            int v3 = (int)Math.floor(512.0f / ((float)v) * ((float)v1));
            if(v2 > 0x200 || v3 > 0x200) {
                v2 = (int)Math.floor(((float)v) * (512.0f / ((float)v1)));
                v3 = (int)Math.floor(((float)v1) * (512.0f / ((float)v1)));
            }
            Bitmap bitmap1 = Bitmap.createScaledBitmap(bitmap0, v2, v3, true);
            Bitmap bitmap2 = Bitmap.createBitmap(0x200, 0x200, Bitmap.Config.ARGB_8888);
            Canvas canvas0 = new Canvas(bitmap2);
            Paint paint0 = new Paint();
            paint0.setColor(0xFF000000);
            paint0.setStyle(Paint.Style.FILL);
            canvas0.drawRect(0.0f, 0.0f, ((float)canvas0.getWidth()), ((float)canvas0.getHeight()), paint0);
            float f = ((float)v2) / ((float)v3);
            canvas0.drawBitmap(bitmap1, (f >= 1.0f ? 0.0f : ((float)(0x200 - v2)) / 2.0f), (f < 1.0f ? 0.0f : ((float)(0x200 - v3)) / 2.0f), null);
            return bitmap2;
        }
        return null;
    }

    public static int MTH1407(int v, float f) {
        int v1 = Color.red(v);
        int v2 = Color.green(v);
        int v3 = Color.blue(v);
        if(CLS41.MTH1395(v1, f) && CLS41.MTH1395(v2, f) && CLS41.MTH1395(v3, f)) {
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

    public static Bitmap MTH1408(Context context0, Bitmap bitmap0, int v) {
        int[] arr_v8;
        if(bitmap0 == null) {
            return null;
        }
        Bitmap bitmap1 = bitmap0.copy(bitmap0.getConfig(), true);
        if(v < 1) {
            return bitmap1;
        }
        if(Build.VERSION.SDK_INT > 16) {
            try {
                RenderScript renderScript0 = RenderScript.create(context0);
                Allocation allocation0 = Allocation.createFromBitmap(renderScript0, bitmap0, Allocation.MipmapControl.MIPMAP_NONE, 1);
                Allocation allocation1 = Allocation.createTyped(renderScript0, allocation0.getType());
                ScriptIntrinsicBlur scriptIntrinsicBlur0 = ScriptIntrinsicBlur.create(renderScript0, Element.U8_4(renderScript0));
                scriptIntrinsicBlur0.setRadius(((float)v));
                scriptIntrinsicBlur0.setInput(allocation0);
                scriptIntrinsicBlur0.forEach(allocation1);
                allocation1.copyTo(bitmap1);
                return bitmap1;
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
        }
        int v1 = bitmap1.getWidth();
        int v2 = bitmap1.getHeight();
        int v3 = v1 * v2;
        int[] arr_v = new int[v3];
        bitmap1.getPixels(arr_v, 0, v1, 0, 0, v1, v2);
        int v4 = v * 2 + 1;
        int[] arr_v1 = new int[v3];
        int[] arr_v2 = new int[v3];
        int[] arr_v3 = new int[v3];
        int[] arr_v4 = new int[Math.max(v1, v2)];
        int v5 = v4 + 1 >> 1;
        int v6 = v5 * v5;
        int[] arr_v5 = new int[v6 * 0x100];
        for(int v7 = 0; v7 < v6 * 0x100; ++v7) {
            arr_v5[v7] = v7 / v6;
        }
        int[][] arr2_v = new int[v4][3];
        int v9 = 0;
        int v10 = 0;
        for(int v8 = 0; v8 < v2; ++v8) {
            int v11 = 0;
            int v12 = 0;
            int v13 = 0;
            int v14 = 0;
            int v15 = 0;
            int v16 = 0;
            int v17 = 0;
            int v18 = 0;
            int v19 = -v;
            int v20 = 0;
            while(v19 <= v) {
                int v21 = arr_v[Math.min(v1 - 1, Math.max(v19, 0)) + v9];
                int[] arr_v6 = arr2_v[v19 + v];
                arr_v6[0] = (v21 & 0xFF0000) >> 16;
                arr_v6[1] = (v21 & 0xFF00) >> 8;
                arr_v6[2] = v21 & 0xFF;
                int v22 = v + 1 - Math.abs(v19);
                int v23 = arr_v6[0];
                v20 += v23 * v22;
                int v24 = arr_v6[1];
                v11 = v24 * v22 + v11;
                int v25 = arr_v6[2];
                v12 = v22 * v25 + v12;
                if(v19 > 0) {
                    v16 += v23;
                    v17 += v24;
                    v18 += v25;
                }
                else {
                    v13 += v23;
                    v14 += v24;
                    v15 += v25;
                }
                ++v19;
            }
            int v26 = v;
            int v27 = v20;
            int v28 = 0;
            while(v28 < v1) {
                arr_v1[v9] = arr_v5[v27];
                arr_v2[v9] = arr_v5[v11];
                arr_v3[v9] = arr_v5[v12];
                int[] arr_v7 = arr2_v[(v26 - v + v4) % v4];
                int v29 = v13 - arr_v7[0];
                int v30 = v14 - arr_v7[1];
                int v31 = v15 - arr_v7[2];
                if(v8 == 0) {
                    arr_v8 = arr_v5;
                    arr_v4[v28] = Math.min(v28 + v + 1, v1 - 1);
                }
                else {
                    arr_v8 = arr_v5;
                }
                int v32 = arr_v[v10 + arr_v4[v28]];
                int v33 = (v32 & 0xFF0000) >> 16;
                arr_v7[0] = v33;
                int v34 = (v32 & 0xFF00) >> 8;
                arr_v7[1] = v34;
                arr_v7[2] = v32 & 0xFF;
                int v35 = v16 + v33;
                int v36 = v17 + v34;
                int v37 = v18 + (v32 & 0xFF);
                v27 = v27 - v13 + v35;
                v11 = v11 - v14 + v36;
                v12 = v12 - v15 + v37;
                v26 = (v26 + 1) % v4;
                int[] arr_v9 = arr2_v[v26 % v4];
                int v38 = arr_v9[0];
                v13 = v29 + v38;
                int v39 = arr_v9[1];
                v14 = v30 + v39;
                v15 = v31 + arr_v9[2];
                v16 = v35 - v38;
                v17 = v36 - v39;
                v18 = v37 - arr_v9[2];
                ++v9;
                ++v28;
                arr_v5 = arr_v8;
            }
            v10 += v1;
        }
        for(int v40 = 0; v40 < v1; ++v40) {
            int v41 = 0;
            int v42 = 0;
            int v43 = 0;
            int v44 = 0;
            int v45 = 0;
            int v46 = 0;
            int v47 = 0;
            int v48 = -v;
            int v49 = -v * v1;
            int v50 = 0;
            int v51 = 0;
            while(v48 <= v) {
                int v52 = Math.max(0, v49) + v40;
                int[] arr_v10 = arr2_v[v48 + v];
                arr_v10[0] = arr_v1[v52];
                arr_v10[1] = arr_v2[v52];
                arr_v10[2] = arr_v3[v52];
                int v53 = v + 1 - Math.abs(v48);
                v50 = arr_v1[v52] * v53 + v50;
                v51 = arr_v2[v52] * v53 + v51;
                v41 = arr_v3[v52] * v53 + v41;
                if(v48 > 0) {
                    v45 += arr_v10[0];
                    v46 += arr_v10[1];
                    v47 += arr_v10[2];
                }
                else {
                    v42 += arr_v10[0];
                    v43 += arr_v10[1];
                    v44 += arr_v10[2];
                }
                if(v48 < v2 - 1) {
                    v49 += v1;
                }
                ++v48;
            }
            int v54 = v;
            int v55 = v40;
            for(int v56 = 0; v56 < v2; ++v56) {
                arr_v[v55] = arr_v[v55] & 0xFF000000 | arr_v5[v50] << 16 | arr_v5[v51] << 8 | arr_v5[v41];
                int[] arr_v11 = arr2_v[(v54 - v + v4) % v4];
                int v57 = v42 - arr_v11[0];
                int v58 = v43 - arr_v11[1];
                int v59 = v44 - arr_v11[2];
                if(v40 == 0) {
                    arr_v4[v56] = Math.min(v56 + (v + 1), v2 - 1) * v1;
                }
                int v60 = arr_v4[v56] + v40;
                int v61 = arr_v1[v60];
                arr_v11[0] = v61;
                int v62 = arr_v2[v60];
                arr_v11[1] = v62;
                int v63 = arr_v3[v60];
                arr_v11[2] = v63;
                int v64 = v45 + v61;
                int v65 = v46 + v62;
                int v66 = v47 + v63;
                v50 = v50 - v42 + v64;
                v51 = v51 - v43 + v65;
                v41 = v41 - v44 + v66;
                v54 = (v54 + 1) % v4;
                int[] arr_v12 = arr2_v[v54];
                int v67 = arr_v12[0];
                v42 = v57 + v67;
                int v68 = arr_v12[1];
                v43 = v58 + v68;
                v44 = v59 + arr_v12[2];
                v45 = v64 - v67;
                v46 = v65 - v68;
                v47 = v66 - arr_v12[2];
                v55 += v1;
            }
        }
        bitmap1.setPixels(arr_v, 0, v1, 0, 0, v1, v2);
        return bitmap1;
    }

    public static Bitmap MTH1409(String s) {
        Bitmap bitmap1;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        CLS106 ٴـ0 = new CLS106(s);
        if(CLS125.MTH2022(ٴـ0)) {
            String s1 = ٴـ0.MTH1848();
            HashMap hashMap0 = CLS41.FLD490;
            if(hashMap0.containsKey(s1)) {
                Bitmap bitmap0 = (Bitmap)hashMap0.get(s1);
                if(bitmap0 != null && !bitmap0.isRecycled()) {
                    return bitmap0;
                }
            }
            try {
                Uri uri0 = CLS33.MTH1344(CLS133.MTH2108(), new File(ٴـ0.MTH1848()));
                try {
                    MediaMetadataRetriever mediaMetadataRetriever0 = new MediaMetadataRetriever();
                    mediaMetadataRetriever0.setDataSource(CLS133.MTH2108(), uri0);
                    bitmap1 = mediaMetadataRetriever0.getFrameAtTime();
                    mediaMetadataRetriever0.release();
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                    bitmap1 = null;
                }
                if(bitmap1 != null) {
                    hashMap0.put(s1, bitmap1);
                    return bitmap1;
                }
            }
            catch(Exception exception0) {
                CLS133.MTH2113(exception0);
            }
        }
        return null;
    }
}

