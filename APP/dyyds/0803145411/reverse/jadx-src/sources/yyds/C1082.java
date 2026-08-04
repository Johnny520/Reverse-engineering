package yyds;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: yyds.ᛵᛴᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1082 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final C2454 f4979;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static String f4980;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static long f4984;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static C1816 f4986;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C1082 f4981 = new C1082();

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final Object f4982 = new Object();

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final CopyOnWriteArraySet f4985 = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final Handler f4983 = new Handler(Looper.getMainLooper());

    static {
        C2326 c2326M3466 = AbstractC1741.m3466();
        C1206 c1206 = AbstractC0221.f1238;
        f4979 = AbstractC1917.m3696(AbstractC0879.m1960(c2326M3466, ExecutorC2482.f12272));
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static void m2285(Context context, Uri uri) {
        Object c2658;
        long j;
        String type = context.getContentResolver().getType(uri);
        if (type != null && !type.startsWith(AbstractC2328.m4341(-562275216425838L))) {
            C0188.m806(AbstractC2328.m4341(-562305281196910L));
            return;
        }
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{AbstractC2328.m4341(-562339640935278L)}, null, null, null);
            if (cursorQuery != null) {
                try {
                    j = (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? -1L : cursorQuery.getLong(0);
                    cursorQuery.close();
                } finally {
                }
            } else {
                j = -1;
            }
            c2658 = Long.valueOf(j);
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        if (c2658 instanceof C2658) {
            c2658 = -1L;
        }
        long jLongValue = ((Number) c2658).longValue();
        if (jLongValue <= 0 || jLongValue <= 20971520) {
            return;
        }
        C0188.m806(AbstractC2328.m4341(-562365410739054L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static Drawable m2286(Resources resources) {
        int i;
        boolean z;
        AbstractC2328.m4341(-561858604598126L);
        C1509 c1509 = C1509.f7142;
        c1509.getClass();
        String str = (String) C1509.f7120.m1579(C1509.f7179[34]);
        Object obj = f4982;
        synchronized (obj) {
            C1816 c1816 = f4986;
            Object[] objArr = 0;
            if (c1816 != null) {
                if (!AbstractC1544.m3188(c1816.f9138, str)) {
                    c1816 = null;
                }
                if (c1816 != null) {
                    Bitmap bitmap = c1816.f9139;
                    return bitmap != null ? new BitmapDrawable(resources, bitmap).mutate() : null;
                }
            }
            c1509.getClass();
            if (AbstractC0473.m1313(C1509.m3113())) {
                synchronized (obj) {
                    f4986 = new C1816(null, str);
                    f4980 = null;
                }
                return null;
            }
            synchronized (obj) {
                i = 0;
                if (AbstractC1544.m3188(f4980, str)) {
                    z = false;
                } else {
                    f4980 = str;
                    z = true;
                }
            }
            if (!z) {
                return null;
            }
            AbstractC2071.m3959(f4979, null, new C1114(str, objArr == true ? 1 : 0, i), 3);
            return null;
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static Bitmap m2287(byte[] bArr) {
        int i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        int i2 = options.outWidth;
        if (1 > i2 || i2 >= 32769 || 1 > (i = options.outHeight) || i >= 32769) {
            C0188.m806(AbstractC2328.m4341(-562550094332782L));
            return null;
        }
        int i3 = 1;
        while (true) {
            if (options.outWidth / i3 <= 2160 && options.outHeight / i3 <= 3840) {
                break;
            }
            i3 *= 2;
        }
        int length = bArr.length;
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        options2.inPreferredConfig = config;
        options2.inSampleSize = i3;
        options2.inScaled = false;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, length, options2);
        if (bitmapDecodeByteArray == null) {
            return null;
        }
        float fMin = Math.min(1.0f, Math.min(1080.0f / bitmapDecodeByteArray.getWidth(), 1920.0f / bitmapDecodeByteArray.getHeight()));
        int width = (int) (bitmapDecodeByteArray.getWidth() * fMin);
        if (width < 1) {
            width = 1;
        }
        int height = (int) (bitmapDecodeByteArray.getHeight() * fMin);
        int i4 = height >= 1 ? height : 1;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, i4, config);
        AbstractC2328.m4341(-562627403744110L);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-16777216);
        canvas.drawBitmap(bitmapDecodeByteArray, new Rect(0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight()), new RectF(0.0f, 0.0f, width, i4), new Paint(7));
        if (bitmapDecodeByteArray != bitmapCreateBitmap && !bitmapDecodeByteArray.isRecycled()) {
            bitmapDecodeByteArray.recycle();
        }
        bitmapCreateBitmap.setDensity(0);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static byte[] m2288(Bitmap bitmap) throws IOException {
        int[] iArr = {88, 82, 76, 70, 62, 54, 46};
        for (int i = 0; i < 7; i++) {
            int i2 = iArr[i];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                if (!bitmap.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream)) {
                    throw new IllegalStateException(AbstractC2328.m4341(-562704713155438L).toString());
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                if (byteArray.length <= 2000000) {
                    return byteArray;
                }
            } finally {
            }
        }
        C0188.m798(AbstractC2328.m4341(-562734777926510L));
        return null;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static byte[] m2289(Context context, Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            C0188.m800(AbstractC2328.m4341(-562416950346606L));
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[16384];
            long j = 0;
            while (true) {
                int i = inputStreamOpenInputStream.read(bArr);
                if (i < 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStreamOpenInputStream.close();
                    AbstractC2328.m4341(-562511439627118L);
                    return byteArray;
                }
                j += (long) i;
                if (j > 20971520) {
                    throw new IllegalArgumentException(AbstractC2328.m4341(-562459900019566L).toString());
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static void m2290(C1641 c1641) {
        if (f4984 == c1641.f8356) {
            C1509.f7142.getClass();
            if (AbstractC1544.m3188((String) C1509.f7120.m1579(C1509.f7179[34]), (String) c1641.f8357)) {
                return;
            }
        }
        throw new C0742(AbstractC2328.m4341(-688654629110638L));
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static void m2291() {
        RunnableC0089 runnableC0089 = new RunnableC0089(3);
        if (AbstractC1544.m3188(Looper.myLooper(), Looper.getMainLooper())) {
            runnableC0089.run();
        } else {
            f4983.post(runnableC0089);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2292(Context context, Uri uri, C1641 c1641, AbstractC1320 abstractC1320) {
        C0702 c0702;
        if (abstractC1320 instanceof C0702) {
            c0702 = (C0702) abstractC1320;
            int i = c0702.f3308;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0702.f3308 = i - Integer.MIN_VALUE;
            } else {
                c0702 = new C0702(this, abstractC1320);
            }
        }
        Object objM3955 = c0702.f3310;
        int i2 = c0702.f3308;
        if (i2 == 0) {
            AbstractC1544.m3189(objM3955);
            C1206 c1206 = AbstractC0221.f1238;
            ExecutorC2482 executorC2482 = ExecutorC2482.f12272;
            C1007 c1007 = new C1007(c1641, context, uri, (InterfaceC0274) null, 2);
            c0702.f3308 = 1;
            objM3955 = AbstractC2071.m3955(executorC2482, c1007, c0702);
            EnumC1765 enumC1765 = EnumC1765.f8858;
            if (objM3955 == enumC1765) {
                return enumC1765;
            }
        } else {
            if (i2 != 1) {
                C0188.m800(AbstractC2328.m4341(-561978863682414L));
                return null;
            }
            AbstractC1544.m3189(objM3955);
        }
        return ((C2248) objM3955).f11089;
    }
}
