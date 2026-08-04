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
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: yyds.ᛳᛳᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0561 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final CopyOnWriteArraySet f2669;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final Handler f2670;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final EnumMap f2671;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0561 f2672 = new C0561();

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final Object f2673 = new Object();

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final CopyOnWriteArraySet f2674;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final C2454 f2675;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final Object[] f2676;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final EnumMap f2677;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final long[] f2678;

    static {
        int iMo927 = EnumC0868.f3974.mo927();
        Object[] objArr = new Object[iMo927];
        for (int i = 0; i < iMo927; i++) {
            objArr[i] = new Object();
        }
        f2676 = objArr;
        f2678 = new long[EnumC0868.f3974.mo927()];
        f2671 = new EnumMap(EnumC0868.class);
        f2677 = new EnumMap(EnumC0868.class);
        f2674 = new CopyOnWriteArraySet();
        f2669 = new CopyOnWriteArraySet();
        f2670 = new Handler(Looper.getMainLooper());
        C2326 c2326M3466 = AbstractC1741.m3466();
        C1206 c1206 = AbstractC0221.f1238;
        f2675 = AbstractC1917.m3696(AbstractC0879.m1960(c2326M3466, ExecutorC2482.f12272));
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static void m1404(EnumC0868 enumC0868, String str) {
        switch (enumC0868.ordinal()) {
            case 0:
                C1509.f7142.getClass();
                AbstractC2328.m4341(-25915405534062L);
                C1509.f7156.m1581(C1509.f7179[12], str);
                break;
            case 1:
                C1509.f7142.getClass();
                AbstractC2328.m4341(-25949765272430L);
                C1509.f7271.m1581(C1509.f7179[13], str);
                break;
            case 2:
                C1509.f7142.getClass();
                AbstractC2328.m4341(-25984125010798L);
                C1509.f7189.m1581(C1509.f7179[14], str);
                break;
            case 3:
                C1509.f7142.getClass();
                AbstractC2328.m4341(-26018484749166L);
                C1509.f7176.m1581(C1509.f7179[15], str);
                break;
            case 4:
                C1509.f7142.getClass();
                AbstractC2328.m4341(-26052844487534L);
                C1509.f7243.m1581(C1509.f7179[16], str);
                break;
            case 5:
                C1509.f7142.getClass();
                AbstractC2328.m4341(-26087204225902L);
                C1509.f7153.m1581(C1509.f7179[17], str);
                break;
            case 6:
                C1509.f7142.getClass();
                AbstractC2328.m4341(-26121563964270L);
                C1509.f7204.m1581(C1509.f7179[18], str);
                break;
            default:
                C0188.m801();
                break;
        }
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static String m1405() {
        String string = UUID.randomUUID().toString();
        AbstractC2328.m4341(-545550613775214L);
        return string;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static void m1406(EnumC0868 enumC0868, String str) {
        switch (enumC0868.ordinal()) {
            case 0:
                C1509.f7142.getClass();
                AbstractC2328.m4341(-25674887365486L);
                C1509.f7118.m1581(C1509.f7179[5], str);
                break;
            case 1:
                C1509.f7142.getClass();
                AbstractC2328.m4341(-25709247103854L);
                C1509.f7126.m1581(C1509.f7179[6], str);
                break;
            case 2:
                C1509.f7142.getClass();
                AbstractC2328.m4341(-25743606842222L);
                C1509.f7224.m1581(C1509.f7179[7], str);
                break;
            case 3:
                C1509.f7142.getClass();
                AbstractC2328.m4341(-25777966580590L);
                C1509.f7208.m1581(C1509.f7179[8], str);
                break;
            case 4:
                C1509.f7142.getClass();
                AbstractC2328.m4341(-25812326318958L);
                C1509.f7214.m1581(C1509.f7179[9], str);
                break;
            case 5:
                C1509.f7142.getClass();
                AbstractC2328.m4341(-25846686057326L);
                C1509.f7122.m1581(C1509.f7179[10], str);
                break;
            case 6:
                C1509.f7142.getClass();
                AbstractC2328.m4341(-25881045795694L);
                C1509.f7103.m1581(C1509.f7179[11], str);
                break;
            default:
                C0188.m801();
                break;
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static String m1407(EnumC0868 enumC0868) {
        switch (enumC0868.ordinal()) {
            case 0:
                C1509.f7142.getClass();
                return (String) C1509.f7118.m1579(C1509.f7179[5]);
            case 1:
                C1509.f7142.getClass();
                return (String) C1509.f7126.m1579(C1509.f7179[6]);
            case 2:
                C1509.f7142.getClass();
                return (String) C1509.f7224.m1579(C1509.f7179[7]);
            case 3:
                C1509.f7142.getClass();
                return (String) C1509.f7208.m1579(C1509.f7179[8]);
            case 4:
                C1509.f7142.getClass();
                return (String) C1509.f7214.m1579(C1509.f7179[9]);
            case 5:
                C1509.f7142.getClass();
                return (String) C1509.f7122.m1579(C1509.f7179[10]);
            case 6:
                C1509.f7142.getClass();
                return (String) C1509.f7103.m1579(C1509.f7179[11]);
            default:
                C0188.m801();
                return null;
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static boolean m1408(EnumC0868 enumC0868) {
        AbstractC2328.m4341(-544240648749934L);
        return !AbstractC0473.m1313(m1407(enumC0868));
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static Bitmap m1409(int i, byte[] bArr) {
        Rect rect;
        Bitmap bitmapCreateBitmap;
        BitmapFactory.Options options = new BitmapFactory.Options();
        boolean z = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        int i2 = options.outWidth;
        if (1 > i2 || i2 > i) {
            C0188.m806(AbstractC2328.m4341(-545301505672046L));
            return null;
        }
        int i3 = options.outHeight;
        if (1 > i3 || i3 > i) {
            C0188.m806(AbstractC2328.m4341(-545387405017966L));
            return null;
        }
        int i4 = 1;
        while (true) {
            if (options.outWidth / i4 <= 384 && options.outHeight / i4 <= 384) {
                break;
            }
            i4 *= 2;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options2.inSampleSize = i4;
        options2.inScaled = false;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options2);
        if (bitmapDecodeByteArray == null) {
            return null;
        }
        int width = bitmapDecodeByteArray.getWidth();
        int height = bitmapDecodeByteArray.getHeight();
        int i5 = width * height;
        int[] iArr = new int[i5];
        bitmapDecodeByteArray.getPixels(iArr, 0, width, 0, 0, width, height);
        int i6 = -1;
        int i7 = -1;
        int i8 = 0;
        int i9 = 0;
        int i10 = width;
        int i11 = height;
        while (i8 < i5) {
            int i12 = i9 + 1;
            if ((iArr[i8] >>> 24) > 4) {
                int i13 = i9 % width;
                int i14 = i9 / width;
                if (i13 < i10) {
                    i10 = i13;
                }
                if (i13 > i6) {
                    i6 = i13;
                }
                if (i14 < i11) {
                    i11 = i14;
                }
                if (i14 > i7) {
                    i7 = i14;
                }
            }
            i8++;
            i9 = i12;
        }
        if (i6 < i10 || i7 < i11) {
            rect = new Rect(0, 0, width, height);
        } else {
            int i15 = i10 - 1;
            if (i15 < 0) {
                i15 = 0;
            }
            int i16 = i11 - 1;
            if (i16 < 0) {
                i16 = 0;
            }
            int i17 = i6 + 2;
            if (i17 <= width) {
                width = i17;
            }
            int i18 = i7 + 2;
            if (i18 <= height) {
                height = i18;
            }
            rect = new Rect(i15, i16, width, height);
        }
        int i19 = rect.left;
        int i20 = rect.top;
        int width2 = bitmapDecodeByteArray.getWidth() - rect.right;
        int height2 = bitmapDecodeByteArray.getHeight() - rect.bottom;
        int i21 = new C2807(9, 11, 1).f12493;
        if ((i19 > i21 || 9 > i19 || width2 > i21 || 9 > width2 || Math.abs(i20 - height2) > 1) && (i20 > i21 || 9 > i20 || height2 > i21 || 9 > height2 || Math.abs(i19 - width2) > 1)) {
            z = false;
        }
        if (bitmapDecodeByteArray.getWidth() == 192 && bitmapDecodeByteArray.getHeight() == 192 && bitmapDecodeByteArray.getConfig() == Bitmap.Config.ARGB_8888 && z) {
            bitmapDecodeByteArray.setDensity(0);
            bitmapCreateBitmap = bitmapDecodeByteArray;
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(192, 192, Bitmap.Config.ARGB_8888);
            AbstractC2328.m4341(-545473304363886L);
            bitmapCreateBitmap.setDensity(0);
            bitmapCreateBitmap.eraseColor(0);
            float fMin = Math.min(172.0f / rect.width(), 172.0f / rect.height());
            float fWidth = rect.width() * fMin;
            float fHeight = rect.height() * fMin;
            float f = (192.0f - fWidth) / 2.0f;
            float f2 = (192.0f - fHeight) / 2.0f;
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeByteArray, rect, new RectF(f, f2, fWidth + f, fHeight + f2), new Paint(7));
        }
        if (bitmapCreateBitmap != bitmapDecodeByteArray && !bitmapDecodeByteArray.isRecycled()) {
            bitmapDecodeByteArray.recycle();
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static Bitmap m1410(String str) {
        Object c2658;
        byte[] bArrDecode;
        int length;
        if (AbstractC0473.m1313(str) || str.length() > 1000000) {
            return null;
        }
        try {
            bArrDecode = Base64.decode(str, 2);
            length = bArrDecode.length;
        } catch (Throwable th) {
            c2658 = new C2658(th);
        }
        if (1 > length || length >= 750001) {
            throw new IllegalArgumentException(AbstractC2328.m4341(-544790404563822L).toString());
        }
        byte[] bArr = {-119, 80, 78, 71, 13, 10, 26, 10};
        if (bArrDecode.length >= 8) {
            Iterable c2807 = new C2807(0, 7, 1);
            if (!(c2807 instanceof Collection) || !((Collection) c2807).isEmpty()) {
                Iterator it = c2807.iterator();
                while (((C1953) it).f9807) {
                    int iNextInt = ((C1953) it).nextInt();
                    if (bArrDecode[iNextInt] == bArr[iNextInt]) {
                    }
                }
            }
            c2658 = m1409(512, bArrDecode);
            return (Bitmap) (c2658 instanceof C2658 ? null : c2658);
        }
        throw new IllegalArgumentException(AbstractC2328.m4341(-544876303909742L).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static Drawable m1411(Resources resources, EnumC0868 enumC0868) {
        boolean z;
        AbstractC2328.m4341(-544287893390190L);
        AbstractC2328.m4341(-544330843063150L);
        String strM1414 = m1414(enumC0868);
        Object obj = f2673;
        synchronized (obj) {
            EnumMap enumMap = f2671;
            C2726 c2726 = (C2726) enumMap.get(enumC0868);
            Object[] objArr = 0;
            if (c2726 != null) {
                if (!AbstractC1544.m3188(c2726.f13391, strM1414)) {
                    c2726 = null;
                }
                if (c2726 != null) {
                    Bitmap bitmap = c2726.f13392;
                    return bitmap != null ? new BitmapDrawable(resources, bitmap).mutate() : null;
                }
            }
            if (!m1408(enumC0868)) {
                synchronized (obj) {
                    enumMap.put(enumC0868, new C2726(null, strM1414));
                }
                return null;
            }
            synchronized (obj) {
                EnumMap enumMap2 = f2677;
                if (AbstractC1544.m3188(enumMap2.get(enumC0868), strM1414)) {
                    z = false;
                } else {
                    enumMap2.put(enumC0868, strM1414);
                    z = true;
                }
            }
            if (!z) {
                return null;
            }
            AbstractC2071.m3959(f2675, null, new C2576(enumC0868, strM1414, objArr == true ? 1 : 0, 6), 3);
            return null;
        }
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static byte[] m1412(Context context, Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            C0188.m800(AbstractC2328.m4341(-545103937176430L));
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
                    AbstractC2328.m4341(-545198426456942L);
                    return byteArray;
                }
                j += (long) i;
                if (j > 20971520) {
                    throw new IllegalArgumentException(AbstractC2328.m4341(-545146886849390L).toString());
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static void m1413(Context context, Uri uri) {
        Object c2658;
        long j;
        String type = context.getContentResolver().getType(uri);
        if (type != null && !type.startsWith(AbstractC2328.m4341(-544962203255662L))) {
            C0188.m806(AbstractC2328.m4341(-544992268026734L));
            return;
        }
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{AbstractC2328.m4341(-545026627765102L)}, null, null, null);
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
        C0188.m806(AbstractC2328.m4341(-545052397568878L));
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static String m1414(EnumC0868 enumC0868) {
        switch (enumC0868.ordinal()) {
            case 0:
                C1509.f7142.getClass();
                return (String) C1509.f7156.m1579(C1509.f7179[12]);
            case 1:
                C1509.f7142.getClass();
                return (String) C1509.f7271.m1579(C1509.f7179[13]);
            case 2:
                C1509.f7142.getClass();
                return (String) C1509.f7189.m1579(C1509.f7179[14]);
            case 3:
                C1509.f7142.getClass();
                return (String) C1509.f7176.m1579(C1509.f7179[15]);
            case 4:
                C1509.f7142.getClass();
                return (String) C1509.f7243.m1579(C1509.f7179[16]);
            case 5:
                C1509.f7142.getClass();
                return (String) C1509.f7153.m1579(C1509.f7179[17]);
            case 6:
                C1509.f7142.getClass();
                return (String) C1509.f7204.m1579(C1509.f7179[18]);
            default:
                C0188.m801();
                return null;
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static void m1415(C2041 c2041) {
        synchronized (f2676[c2041.f10154.ordinal()]) {
            m1416(c2041);
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static void m1416(C2041 c2041) {
        if (f2678[c2041.f10154.ordinal()] != c2041.f10155 || !AbstractC1544.m3188(m1414(c2041.f10154), c2041.f10156)) {
            throw new C1792(AbstractC2328.m4341(-566046197711726L));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1417(Context context, Uri uri, C2041 c2041, AbstractC1320 abstractC1320) throws Throwable {
        C1998 c1998;
        if (abstractC1320 instanceof C1998) {
            c1998 = (C1998) abstractC1320;
            int i = c1998.f10007;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1998.f10007 = i - Integer.MIN_VALUE;
            } else {
                c1998 = new C1998(this, abstractC1320);
            }
        }
        Object objM3955 = c1998.f10009;
        int i2 = c1998.f10007;
        if (i2 == 0) {
            AbstractC1544.m3189(objM3955);
            C1206 c1206 = AbstractC0221.f1238;
            ExecutorC2482 executorC2482 = ExecutorC2482.f12272;
            C1007 c1007 = new C1007(c2041, context, uri, (InterfaceC0274) null, 3);
            c1998.f10007 = 1;
            objM3955 = AbstractC2071.m3955(executorC2482, c1007, c1998);
            EnumC1765 enumC1765 = EnumC1765.f8858;
            if (objM3955 == enumC1765) {
                return enumC1765;
            }
        } else {
            if (i2 != 1) {
                C0188.m800(AbstractC2328.m4341(-544549886395246L));
                return null;
            }
            AbstractC1544.m3189(objM3955);
        }
        return ((C2248) objM3955).f11089;
    }
}
