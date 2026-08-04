package yyds;

import android.graphics.Bitmap;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: yyds.ᲁᛴᛵᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2217 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0805 f10968 = new C0805(14);

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final Object m4197(InterfaceC2213 interfaceC2213, InterfaceC0477 interfaceC0477) throws Throwable {
        AbstractC0467 abstractC0467M4643;
        InterfaceC2213 interfaceC2213M989;
        Thread threadCurrentThread = Thread.currentThread();
        InterfaceC2289 interfaceC2289 = C0135.f836;
        AbstractC0974 abstractC0974 = (AbstractC0974) interfaceC2213.mo423(interfaceC2289);
        C2586 c2586 = C2586.f12764;
        if (abstractC0974 == null) {
            abstractC0467M4643 = AbstractC2567.m4643();
            interfaceC2213M989 = AbstractC0319.m989(c2586, interfaceC2213.mo422(abstractC0467M4643), true);
            C1206 c1206 = AbstractC0221.f1238;
            if (interfaceC2213M989 != c1206 && interfaceC2213M989.mo423(interfaceC2289) == null) {
                interfaceC2213M989 = interfaceC2213M989.mo422(c1206);
            }
        } else {
            abstractC0467M4643 = (AbstractC0467) AbstractC2567.f12653.get();
            interfaceC2213M989 = AbstractC0319.m989(c2586, interfaceC2213, true);
            C1206 c12062 = AbstractC0221.f1238;
            if (interfaceC2213M989 != c12062 && interfaceC2213M989.mo423(interfaceC2289) == null) {
                interfaceC2213M989 = interfaceC2213M989.mo422(c12062);
            }
        }
        C0701 c0701 = new C0701(interfaceC2213M989, threadCurrentThread, abstractC0467M4643);
        c0701.m813(1, c0701, interfaceC0477);
        AbstractC0467 abstractC0467 = c0701.f3306;
        if (abstractC0467 != null) {
            abstractC0467.m1250(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jM1248 = abstractC0467 != null ? abstractC0467.m1248() : Long.MAX_VALUE;
                if (!(c0701.m2163() instanceof InterfaceC2067)) {
                    if (abstractC0467 != null) {
                        abstractC0467.m1242(false);
                    }
                    Object objM1137 = AbstractC0395.m1137(c0701.m2163());
                    C0417 c0417 = objM1137 instanceof C0417 ? (C0417) objM1137 : null;
                    if (c0417 == null) {
                        return objM1137;
                    }
                    throw c0417.f2152;
                }
                LockSupport.parkNanos(c0701, jM1248);
            } catch (Throwable th) {
                if (abstractC0467 != null) {
                    abstractC0467.m1242(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0701.m2143(interruptedException);
        throw interruptedException;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final String m4198(Object[] objArr, int i, int i2, AbstractC0212 abstractC0212) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == abstractC0212) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final AbstractC0381 m4199(Object obj) {
        if (obj != AbstractC1367.f6359) {
            return (AbstractC0381) obj;
        }
        C0188.m800("Does not contain segment");
        return null;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m4200(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C0188.m789(str);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final void m4201(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final void m4202(Object[] objArr, int i, int i2) {
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final Class m4203(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m4203(((ParameterizedType) type).getRawType());
        }
        throw new C2360("Cannot cast type " + type + " to java.lang.Class object.");
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final String m4204(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = AbstractC0181.f1027;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("startIndex: " + i2 + ", endIndex: 8, size: 8");
        }
        if (i2 <= 8) {
            return new String(cArr2, i2, 8 - i2);
        }
        throw new IllegalArgumentException("startIndex: " + i2 + " > endIndex: 8");
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static C0644 m4205(int i, InterfaceC1434 interfaceC1434) {
        return new C0644(new C1964(i), interfaceC1434, f10968, 14, false);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4  */
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1446 m4206(Bitmap bitmap) {
        Object c2658;
        AbstractC2328.m4341(-565775614772078L);
        try {
            Bitmap bitmapM4208 = m4208(bitmap);
            if (bitmapM4208 == null) {
                c2658 = null;
            } else {
                try {
                    C1446 c1446M3951 = AbstractC2071.m3951(bitmapM4208.getWidth(), bitmapM4208.getHeight(), new C0216(2, bitmapM4208, Bitmap.class, AbstractC2328.m4341(-582637656376174L), AbstractC2328.m4341(-582676311081838L), 0, 2));
                    if (c1446M3951 == null) {
                        if (bitmapM4208 != bitmap) {
                            bitmapM4208.recycle();
                        }
                        c2658 = null;
                    } else {
                        int i = c1446M3951.f6863;
                        int i2 = c1446M3951.f6862;
                        int i3 = c1446M3951.f6861;
                        int i4 = c1446M3951.f6860;
                        float width = bitmap.getWidth() / bitmapM4208.getWidth();
                        float height = bitmap.getHeight() / bitmapM4208.getHeight();
                        int iCeil = (int) Math.ceil(width);
                        if (iCeil < 1) {
                            iCeil = 1;
                        }
                        int iCeil2 = (int) Math.ceil(height);
                        if (iCeil2 < 1) {
                            iCeil2 = 1;
                        }
                        int iM1487 = AbstractC0598.m1487(((int) Math.floor(i4 * width)) + (i4 > 0 ? iCeil : 0), 0, bitmap.getWidth() - 1);
                        int iM14872 = AbstractC0598.m1487(((int) Math.floor(i3 * height)) + (i3 > 0 ? iCeil2 : 0), 0, bitmap.getHeight() - 1);
                        int iCeil3 = (int) Math.ceil(i2 * width);
                        if (i2 >= bitmapM4208.getWidth()) {
                            iCeil = 0;
                        }
                        int iM14873 = AbstractC0598.m1487(iCeil3 - iCeil, 1, bitmap.getWidth());
                        int iCeil4 = (int) Math.ceil(i * height);
                        if (i >= bitmapM4208.getHeight()) {
                            iCeil2 = 0;
                        }
                        C1446 c1446 = new C1446(iM1487, iM14872, iM14873, AbstractC0598.m1487(iCeil4 - iCeil2, 1, bitmap.getHeight()));
                        if (c1446.m2945() > 0) {
                            int iM2944 = c1446.m2944();
                            c2658 = c1446;
                            if (iM2944 <= 0) {
                                c2658 = null;
                            }
                            if (bitmapM4208 != bitmap) {
                                bitmapM4208.recycle();
                            }
                        }
                    }
                } catch (Throwable th) {
                    if (bitmapM4208 != bitmap) {
                        bitmapM4208.recycle();
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            c2658 = new C2658(th2);
        }
        return (C1446) (c2658 instanceof C2658 ? null : c2658);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final void m4207(InterfaceC2213 interfaceC2213, Throwable th) {
        Throwable runtimeException;
        Iterator it = AbstractC2276.f11206.iterator();
        while (it.hasNext()) {
            try {
                ((C0256) it.next()).getClass();
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC1579.m3235(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            AbstractC1579.m3235(th, new C1537(interfaceC2213));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static Bitmap m4208(Bitmap bitmap) {
        if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0 || bitmap.isRecycled()) {
            return null;
        }
        int iMax = Math.max(bitmap.getWidth(), bitmap.getHeight());
        if (iMax <= 256 && bitmap.getConfig() != Bitmap.Config.HARDWARE) {
            return bitmap;
        }
        float fMin = Math.min(1.0f, 256.0f / iMax);
        int iM748 = AbstractC0181.m748(bitmap.getWidth() * fMin);
        if (iM748 < 1) {
            iM748 = 1;
        }
        int iM7482 = AbstractC0181.m748(bitmap.getHeight() * fMin);
        if (iM7482 < 1) {
            iM7482 = 1;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, iM748, iM7482, true);
        AbstractC2328.m4341(-565943118496622L);
        if (bitmapCreateScaledBitmap.getConfig() != Bitmap.Config.HARDWARE) {
            return bitmapCreateScaledBitmap;
        }
        Bitmap bitmapCopy = bitmapCreateScaledBitmap.copy(Bitmap.Config.ARGB_8888, false);
        if (bitmapCreateScaledBitmap != bitmap) {
            bitmapCreateScaledBitmap.recycle();
        }
        return bitmapCopy;
    }
}
