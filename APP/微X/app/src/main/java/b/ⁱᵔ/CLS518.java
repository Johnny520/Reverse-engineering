// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.ScrollView;
import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ˆʿ.CLS59;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS69;
import b.ˈˈ.CLS94;
import b.ᵔʾ.CLS1228;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;

public final class CLS518 {
    public static final class CLS515 extends AsyncTask {
        public final CLS12 FLD5080;

        public CLS515(CLS1228 ʾˈ0) {
            this.FLD5080 = ʾˈ0;
        }

        @Override  // android.os.AsyncTask
        public final Object doInBackground(Object[] arr_object) {
            return CLS518.MTH7073(((URL[])arr_object)[0]);
        }

        @Override  // android.os.AsyncTask
        public final void onPostExecute(Object object0) {
            byte[] arr_b = (byte[])object0;
            super.onPostExecute(arr_b);
            CLS12 ᵔʾ0 = this.FLD5080;
            if(ᵔʾ0 != null) {
                try {
                    ᵔʾ0.MTH791(arr_b);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }

    public interface CLS516 {
        void MTH7045(Bitmap arg1);
    }

    public static final class CLS517 extends AsyncTask {
        public final CLS516 FLD5081;

        public CLS517(CLS516 ﹶﹳ$ٴـ0) {
            this.FLD5081 = ﹶﹳ$ٴـ0;
        }

        @Override  // android.os.AsyncTask
        public final Object doInBackground(Object[] arr_object) {
            URL uRL0 = ((URL[])arr_object)[0];
            if(uRL0 != null) {
                try {
                    return BitmapFactory.decodeStream(uRL0.openConnection().getInputStream());
                }
                catch(Exception exception0) {
                    CLS27.MTH893(exception0);
                }
            }
            return null;
        }

        @Override  // android.os.AsyncTask
        public final void onPostExecute(Object object0) {
            Bitmap bitmap0 = (Bitmap)object0;
            super.onPostExecute(bitmap0);
            CLS516 ﹶﹳ$ٴـ0 = this.FLD5081;
            if(ﹶﹳ$ٴـ0 != null) {
                try {
                    ﹶﹳ$ٴـ0.MTH7045(bitmap0);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }

    public static final HashMap FLD5082;
    public static final HashMap FLD5083;

    static {
        CLS518.FLD5082 = new HashMap();
        CLS518.FLD5083 = new HashMap();
        new HashMap();
    }

    public static void MTH7050(OutputStream outputStream0, String s) {
        Bitmap bitmap0 = CLS518.MTH7075(CLS66.MTH1491(CLS27.MTH900(), new File(CLS31.MTH992(s))));
        if(bitmap0 != null) {
            bitmap0.compress(Bitmap.CompressFormat.JPEG, 100, outputStream0);
        }
    }

    public static void MTH7051(OutputStream outputStream0, Bitmap bitmap0) {
        if(bitmap0 != null && outputStream0 != null) {
            try {
                bitmap0.compress(Bitmap.CompressFormat.PNG, 100, outputStream0);
                outputStream0.flush();
                outputStream0.close();
            }
            catch(Exception exception0) {
                CLS27.MTH893(exception0);
            }
        }
    }

    public static Bitmap MTH7052(String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        CLS69 ʾᵢ0 = new CLS69(s);
        if(CLS31.MTH1029(ʾᵢ0)) {
            String s1 = ʾᵢ0.MTH1563();
            HashMap hashMap0 = CLS518.FLD5083;
            if(hashMap0.containsKey(s1)) {
                Bitmap bitmap0 = (Bitmap)hashMap0.get(s1);
                if(bitmap0 != null && !bitmap0.isRecycled()) {
                    return bitmap0;
                }
            }
            try {
                Bitmap bitmap1 = CLS518.MTH7075(CLS66.MTH1491(CLS27.MTH900(), ʾᵢ0.MTH1567()));
                if(bitmap1 != null) {
                    hashMap0.put(s1, bitmap1);
                    return bitmap1;
                }
            }
            catch(Exception exception0) {
                CLS27.MTH893(exception0);
            }
        }
        return null;
    }

    public static void MTH7053(File file0, String s) {
        CLS69 ʾᵢ0 = new CLS69(file0);
        CLS69 ʾᵢ1 = new CLS69(s);
        try {
            if(!CLS31.MTH1029(ʾᵢ0)) {
                ʾᵢ0.MTH1556();
            }
            CLS518.MTH7050(ʾᵢ0.MTH1553(), ʾᵢ1.MTH1563());
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public static byte[] MTH7054(Bitmap bitmap0) {
        if(bitmap0 == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        bitmap0.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream0);
        return byteArrayOutputStream0.toByteArray();
    }

    public static Bitmap MTH7055(ScrollView scrollView0) {
        int v1 = 0;
        for(int v = 0; v < scrollView0.getChildCount(); ++v) {
            v1 += scrollView0.getChildAt(v).getHeight();
            scrollView0.getChildAt(v).setBackgroundColor(-1);
        }
        Bitmap bitmap0 = Bitmap.createBitmap(scrollView0.getMeasuredWidth(), v1, Bitmap.Config.RGB_565);
        scrollView0.draw(new Canvas(bitmap0));
        return bitmap0;
    }

    public static Bitmap MTH7056(Uri uri0, int v, int v1) {
        if(uri0 == null) {
            return null;
        }
        File file0 = new File(CLS31.MTH1013(CLS27.MTH900()));
        CLS31.MTH1037(CLS31.MTH973(uri0), file0);
        Bitmap bitmap0 = CLS518.MTH7074(v, v1, file0.getAbsolutePath());
        CLS31.MTH1011(file0);
        return bitmap0;
    }

    public static Bitmap MTH7057(Bitmap bitmap0, CLS94 ⁱˉ0) {
        Canvas canvas1;
        int v13;
        int v9;
        if(bitmap0 == null) {
            return null;
        }
        CLS59.FLD183.getClass();
        Bitmap bitmap1 = CLS59.MTH1284(ⁱˉ0);
        String s = ⁱˉ0.FLD401;
        if(bitmap1 == null && TextUtils.isEmpty(s)) {
            return bitmap0;
        }
        int v = bitmap0.getWidth();
        int v1 = bitmap0.getHeight();
        Bitmap bitmap2 = Bitmap.createBitmap(v, v1, Bitmap.Config.ARGB_8888);
        Canvas canvas0 = new Canvas(bitmap2);
        canvas0.drawBitmap(bitmap0, 0.0f, 0.0f, null);
        Paint paint0 = new Paint();
        if(bitmap1 != null && !bitmap1.isRecycled()) {
            int v2 = bitmap1.getWidth();
            int v3 = bitmap1.getHeight();
            paint0.setAlpha(ⁱˉ0.FLD402);
            int v4 = (int)(((float)v2) / (((float)v3) / (((float)v1) / 5.0f)));
            int v5 = (int)(((float)v1) / 5.0f);
            if(((float)v4) > ((float)v) / 3.0f) {
                float f = ((float)v4) / (((float)v) / 3.0f);
                v4 = (int)(((float)v) / 3.0f);
                v5 = (int)(((float)v5) / f);
            }
            int v6 = bitmap1.getWidth();
            int v7 = bitmap1.getHeight();
            Matrix matrix0 = new Matrix();
            matrix0.postScale(((float)v4) / ((float)v6), ((float)v5) / ((float)v7));
            Bitmap bitmap3 = Bitmap.createBitmap(bitmap1, 0, 0, v6, v7, matrix0, false);
            int v8 = 5;
            switch(ⁱˉ0.FLD399) {
                case 0: {
                    v9 = 5;
                    break;
                }
                case 1: {
                    v8 = v - v4 - 5;
                    v9 = 5;
                    break;
                }
                case 2: {
                    v9 = v1 - v5 - 5;
                    break;
                }
                case 3: {
                    v8 = v - v4 - 5;
                    v9 = v1 - v5 - 5;
                    break;
                }
                case 4: {
                    v8 = v / 2 - v4 / 2 - 2;
                    v9 = v1 / 2 - v5 / 2 - 2;
                    break;
                }
                default: {
                    v9 = 0;
                    v8 = 0;
                }
            }
            canvas0.drawBitmap(bitmap3, ((float)v8), ((float)v9), paint0);
        }
        if(TextUtils.isEmpty(s)) {
            canvas1 = canvas0;
        }
        else {
            Typeface typeface0 = Typeface.create("宋体", 1);
            TextPaint textPaint0 = new TextPaint();
            textPaint0.setTypeface(typeface0);
            textPaint0.setTextSize(((float)ⁱˉ0.FLD403));
            textPaint0.setColor(ⁱˉ0.FLD400);
            StaticLayout staticLayout0 = new StaticLayout(s, textPaint0, v, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            int v10 = (int)textPaint0.measureText(s);
            int v11 = staticLayout0.getHeight();
            int v12 = 20;
            switch(ⁱˉ0.FLD404) {
                case 0: {
                    v13 = 20;
                    break;
                }
                case 1: {
                    v12 = v - v10 - 20;
                    v13 = 20;
                    break;
                }
                case 2: {
                    v13 = v1 - v11 - 20;
                    break;
                }
                case 3: {
                    v13 = v1 - v11 - 20;
                    v12 = v - v10 - 20;
                    break;
                }
                case 4: {
                    v13 = v1 / 2 - v11 / 2 - 10;
                    v12 = v / 2 - v10 / 2 - 10;
                    break;
                }
                default: {
                    v12 = 0;
                    v13 = 0;
                }
            }
            canvas1 = canvas0;
            canvas1.translate(((float)v12), ((float)v13));
            staticLayout0.draw(canvas1);
            canvas1.translate(((float)(-v12)), ((float)(-v13)));
        }
        canvas1.save();
        canvas1.restore();
        return bitmap2;
    }

    public static void MTH7058(File file0, Bitmap bitmap0) {
        if(bitmap0 == null) {
            return;
        }
        try {
            if(!CLS31.MTH1001(file0)) {
                file0.createNewFile();
            }
            CLS518.MTH7051(new FileOutputStream(file0), bitmap0);
        }
        catch(Exception exception0) {
            CLS27.MTH906(file0.getAbsolutePath());
            CLS27.MTH893(exception0);
        }
    }

    public static Bitmap MTH7059(Uri uri0) {
        if(uri0 == null) {
            return null;
        }
        String s = uri0.toString();
        HashMap hashMap0 = CLS518.FLD5083;
        if(hashMap0.containsKey(s)) {
            Bitmap bitmap0 = (Bitmap)hashMap0.get(s);
            if(bitmap0 != null && !bitmap0.isRecycled()) {
                return bitmap0;
            }
        }
        try {
            File file0 = new File(CLS31.MTH1013(CLS27.MTH900()));
            CLS31.MTH1037(CLS31.MTH973(uri0), file0);
            Bitmap bitmap1 = CLS518.MTH7074(0x40, 0x40, file0.getAbsolutePath());
            CLS31.MTH1011(file0);
            if(bitmap1 != null) {
                hashMap0.put(s, bitmap1);
                return bitmap1;
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return null;
    }

    public static Bitmap MTH7060(String s) {
        try {
            return BitmapFactory.decodeFile(s);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }

    public static Bitmap MTH7061(String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        HashMap hashMap0 = CLS518.FLD5082;
        if(hashMap0.containsKey(s)) {
            Bitmap bitmap0 = (Bitmap)hashMap0.get(s);
            if(bitmap0 != null && !bitmap0.isRecycled()) {
                return bitmap0;
            }
        }
        Bitmap bitmap1 = CLS518.MTH7060(s);
        hashMap0.put(s, bitmap1);
        return bitmap1;
    }

    public static Drawable MTH7062(int v) {
        if(Build.VERSION.SDK_INT < 21) {
            StateListDrawable stateListDrawable0 = new StateListDrawable();
            stateListDrawable0.addState(new int[]{0x10100A7}, new ColorDrawable(CLS518.MTH7067(v, 0.2f)));
            stateListDrawable0.addState(new int[]{0x101009C}, new ColorDrawable(CLS518.MTH7067(v, 0.4f)));
            ColorDrawable colorDrawable0 = new ColorDrawable(v);
            stateListDrawable0.addState(new int[0], colorDrawable0);
            return stateListDrawable0;
        }
        ColorStateList colorStateList0 = ColorStateList.valueOf(CLS518.MTH7067(v, 0.9f));
        ColorDrawable colorDrawable1 = new ColorDrawable(v);
        float[] arr_f = new float[8];
        Arrays.fill(arr_f, 3.0f);
        ShapeDrawable shapeDrawable0 = new ShapeDrawable(new RoundRectShape(arr_f, null, null));
        shapeDrawable0.getPaint().setColor(v);
        return new RippleDrawable(colorStateList0, colorDrawable1, shapeDrawable0);
    }

    public static Drawable MTH7063(Activity activity0, int v) {
        return Build.VERSION.SDK_INT < 21 ? activity0.getResources().getDrawable(v) : activity0.getDrawable(v);
    }

    public static Bitmap MTH7064(Bitmap bitmap0) {
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

    public static Bitmap MTH7065(Bitmap bitmap0, int v) {
        ColorMatrixColorFilter colorMatrixColorFilter0 = new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, ((float)Color.red(v)), 0.0f, 0.0f, 0.0f, 0.0f, ((float)Color.green(v)), 0.0f, 0.0f, 0.0f, 0.0f, ((float)Color.blue(v)), 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        Paint paint0 = new Paint();
        paint0.setColorFilter(colorMatrixColorFilter0);
        paint0.setAlpha(Color.alpha(v));
        Bitmap bitmap1 = bitmap0.copy(bitmap0.getConfig(), true);
        new Canvas(bitmap1).drawBitmap(bitmap1, 0.0f, 0.0f, paint0);
        return bitmap1;
    }

    public static void MTH7066(String s, CLS1228 ʾˈ0) {
        try {
            URL uRL0 = new URL(s);
            new CLS515(ʾˈ0).execute(new URL[]{uRL0});
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public static int MTH7067(int v, float f) {
        int v1 = Color.red(v);
        int v2 = Color.green(v);
        int v3 = Color.blue(v);
        if(CLS518.MTH7069(v1, f) && CLS518.MTH7069(v2, f) && CLS518.MTH7069(v3, f)) {
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

    public static void MTH7068(String s, CLS516 ﹶﹳ$ٴـ0) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        try {
            URL uRL0 = new URL(s);
            new CLS517(ﹶﹳ$ٴـ0).execute(new URL[]{uRL0});
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public static boolean MTH7069(int v, float f) {
        int v1 = Color.red(v);
        int v2 = Color.green(v);
        int v3 = Color.blue(v);
        return ((float)v1) * f + ((float)v1) < 255.0f && ((float)v2) * f + ((float)v2) < 255.0f && f * ((float)v3) + ((float)v3) < 255.0f;
    }

    public static Bitmap MTH7070(Bitmap bitmap0) {
        int v = bitmap0.getHeight();
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
        return bitmap1;
    }

    public static void MTH7071(Drawable drawable0, int v) {
        if(Build.VERSION.SDK_INT >= 21) {
            drawable0.setTint(v);
            return;
        }
        drawable0.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, ((float)Color.red(v)), 0.0f, 0.0f, 0.0f, 0.0f, ((float)Color.green(v)), 0.0f, 0.0f, 0.0f, 0.0f, ((float)Color.blue(v)), 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    }

    public static Bitmap MTH7072(int v, int v1, String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        HashMap hashMap0 = CLS518.FLD5083;
        if(hashMap0.containsKey(s)) {
            Bitmap bitmap0 = (Bitmap)hashMap0.get(s);
            if(bitmap0 != null && !bitmap0.isRecycled()) {
                return bitmap0;
            }
        }
        Bitmap bitmap1 = ThumbnailUtils.extractThumbnail(BitmapFactory.decodeFile(s), v, v1);
        hashMap0.put(s, bitmap1);
        return bitmap1;
    }

    public static byte[] MTH7073(URL uRL0) {
        if(uRL0 == null) {
            return null;
        }
        try {
            byte[] arr_b = new byte[0x400];
            ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
            InputStream inputStream0 = uRL0.openConnection().getInputStream();
            if(inputStream0 == null) {
                return null;
            }
            int v;
            while((v = inputStream0.read(arr_b)) != -1) {
                byteArrayOutputStream0.write(arr_b, 0, v);
            }
            byteArrayOutputStream0.flush();
            byte[] arr_b1 = byteArrayOutputStream0.toByteArray();
            byteArrayOutputStream0.close();
            return arr_b1;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }

    public static Bitmap MTH7074(int v, int v1, String s) {
        int v5;
        if(!CLS31.MTH1024(s)) {
            return null;
        }
        String s1 = new CLS69(s).MTH1563();
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

    public static Bitmap MTH7075(Uri uri0) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever0 = new MediaMetadataRetriever();
            mediaMetadataRetriever0.setDataSource(CLS27.MTH900(), uri0);
            Bitmap bitmap0 = mediaMetadataRetriever0.getFrameAtTime();
            mediaMetadataRetriever0.release();
            return bitmap0;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }

    public static Bitmap MTH7076(String s) {
        Bitmap bitmap0;
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        CLS69 ʾᵢ0 = new CLS69(s);
        if(CLS31.MTH1029(ʾᵢ0)) {
            String s1 = ʾᵢ0.MTH1563();
            HashMap hashMap0 = CLS518.FLD5083;
            if(hashMap0.containsKey(s1)) {
                bitmap0 = (Bitmap)hashMap0.get(s1);
                if(bitmap0 != null && !bitmap0.isRecycled()) {
                    return bitmap0;
                }
            }
            try {
                bitmap0 = CLS518.MTH7074(0x40, 0x40, s1);
                if(bitmap0 != null) {
                    hashMap0.put(s1, bitmap0);
                    return bitmap0;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
        return null;
    }

    public static void MTH7077(File file0, Bitmap bitmap0) {
        if(bitmap0 == null) {
            return;
        }
        try {
            if(!CLS31.MTH1001(file0)) {
                file0.createNewFile();
            }
            FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
            try {
                bitmap0.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream0);
                fileOutputStream0.flush();
                fileOutputStream0.close();
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

