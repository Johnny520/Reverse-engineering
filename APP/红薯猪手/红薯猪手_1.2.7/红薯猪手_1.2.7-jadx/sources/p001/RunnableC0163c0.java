package p001;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import p001.AbstractC0469y8;
import p001.C0215fa;
import p001.C0428v6;
import p001.C0481z7;
import p001.InterfaceC0449x1;

/* JADX INFO: renamed from: ۟.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0163c0 implements Runnable {

    /* JADX INFO: renamed from: ۥ۠ۥ, reason: contains not printable characters */
    public static final Object f1341 = new Object();

    /* JADX INFO: renamed from: ۥ۠ۦ, reason: contains not printable characters */
    public static final a f1342 = new a();

    /* JADX INFO: renamed from: ۥ۠ۧ, reason: contains not printable characters */
    public static final AtomicInteger f1343 = new AtomicInteger();

    /* JADX INFO: renamed from: ۥ۠ۨ, reason: contains not printable characters */
    public static final b f1344 = new b();

    /* JADX INFO: renamed from: ۥ */
    public final int f716 = f1343.incrementAndGet();

    /* JADX INFO: renamed from: ۥ۟ */
    public final C0481z7 f717;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C0384s1 f1345;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final InterfaceC0191e0 f1346;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final C0215fa f1347;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final String f1348;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final C0443w8 f1349;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final int f1350;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public int f1351;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final AbstractC0469y8 f1352;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public AbstractC0204f f1353;

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public ArrayList f1354;

    /* JADX INFO: renamed from: ۥ۠ */
    public Bitmap f718;

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public Future<?> f1355;

    /* JADX INFO: renamed from: ۥ۠۠, reason: contains not printable characters */
    public C0481z7.e f1356;

    /* JADX INFO: renamed from: ۥ۠ۡ, reason: contains not printable characters */
    public Exception f1357;

    /* JADX INFO: renamed from: ۥ۠ۢ, reason: contains not printable characters */
    public int f1358;

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public int f1359;

    /* JADX INFO: renamed from: ۥ۠ۤ, reason: contains not printable characters */
    public int f1360;

    /* JADX INFO: renamed from: ۟.c0$a */
    public static class a extends ThreadLocal<StringBuilder> {
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public final StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* JADX INFO: renamed from: ۟.c0$b */
    public static class b extends AbstractC0469y8 {
        @Override // p001.AbstractC0469y8
        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean mo831(C0443w8 c0443w8) {
            return true;
        }

        @Override // p001.AbstractC0469y8
        /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
        public final AbstractC0469y8.a mo1030(C0443w8 c0443w8) {
            throw new IllegalStateException("Unrecognized type of request: " + c0443w8);
        }
    }

    /* JADX INFO: renamed from: ۟.c0$c */
    public static class c implements Runnable {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC0381rb f719;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ RuntimeException f720;

        public c(InterfaceC0381rb interfaceC0381rb, RuntimeException runtimeException) {
            this.f719 = interfaceC0381rb;
            this.f720 = runtimeException;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public final void run() {
            StringBuilder sbM1039 = C0167c4.m1039("Transformation ");
            sbM1039.append(this.f719.m930());
            sbM1039.append(" crashed with exception.");
            throw new RuntimeException(sbM1039.toString(), this.f720);
        }
    }

    /* JADX INFO: renamed from: ۟.c0$d */
    public static class d implements Runnable {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ StringBuilder f721;

        public d(StringBuilder sb) {
            this.f721 = sb;
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw new NullPointerException(this.f721.toString());
        }
    }

    /* JADX INFO: renamed from: ۟.c0$e */
    public static class e implements Runnable {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC0381rb f722;

        public e(InterfaceC0381rb interfaceC0381rb) {
            this.f722 = interfaceC0381rb;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public final void run() {
            StringBuilder sbM1039 = C0167c4.m1039("Transformation ");
            sbM1039.append(this.f722.m930());
            sbM1039.append(" returned input Bitmap but recycled it.");
            throw new IllegalStateException(sbM1039.toString());
        }
    }

    /* JADX INFO: renamed from: ۟.c0$f */
    public static class f implements Runnable {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC0381rb f723;

        public f(InterfaceC0381rb interfaceC0381rb) {
            this.f723 = interfaceC0381rb;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public final void run() {
            StringBuilder sbM1039 = C0167c4.m1039("Transformation ");
            sbM1039.append(this.f723.m930());
            sbM1039.append(" mutated input Bitmap but failed to recycle the original.");
            throw new IllegalStateException(sbM1039.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0163c0(C0481z7 c0481z7, C0384s1 c0384s1, InterfaceC0191e0 interfaceC0191e0, C0215fa c0215fa, AbstractC0204f abstractC0204f, AbstractC0469y8 abstractC0469y8) {
        this.f717 = c0481z7;
        this.f1345 = c0384s1;
        this.f1346 = interfaceC0191e0;
        this.f1347 = c0215fa;
        this.f1353 = abstractC0204f;
        this.f1348 = abstractC0204f.f1432;
        C0443w8 c0443w8 = abstractC0204f.f774;
        this.f1349 = c0443w8;
        this.f1360 = c0443w8.f1854;
        this.f1350 = abstractC0204f.f1428;
        this.f1351 = abstractC0204f.f1429;
        this.f1352 = abstractC0469y8;
        this.f1359 = abstractC0469y8.mo1251();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ */
    public static Bitmap m829(List<InterfaceC0381rb> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            InterfaceC0381rb interfaceC0381rb = list.get(i);
            try {
                Bitmap bitmapM931 = interfaceC0381rb.m931();
                if (bitmapM931 == null) {
                    StringBuilder sbM1039 = C0167c4.m1039("Transformation ");
                    sbM1039.append(interfaceC0381rb.m930());
                    sbM1039.append(" returned null after ");
                    sbM1039.append(i);
                    sbM1039.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator<InterfaceC0381rb> it = list.iterator();
                    while (it.hasNext()) {
                        sbM1039.append(it.next().m930());
                        sbM1039.append('\n');
                    }
                    C0481z7.f1228.post(new d(sbM1039));
                    return null;
                }
                if (bitmapM931 == bitmap && bitmap.isRecycled()) {
                    C0481z7.f1228.post(new e(interfaceC0381rb));
                    return null;
                }
                if (bitmapM931 != bitmap && !bitmap.isRecycled()) {
                    C0481z7.f1228.post(new f(interfaceC0381rb));
                    return null;
                }
                i++;
                bitmap = bitmapM931;
            } catch (RuntimeException e2) {
                C0481z7.f1228.post(new c(interfaceC0381rb, e2));
                return null;
            }
        }
        return bitmap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Bitmap m1025(InputStream inputStream, C0443w8 c0443w8) throws IOException {
        C0349p5 c0349p5 = new C0349p5(inputStream);
        long jM1185 = c0349p5.m1185(65536);
        BitmapFactory.Options optionsM1276 = AbstractC0469y8.m1276(c0443w8);
        boolean z = optionsM1276 != null && optionsM1276.inJustDecodeBounds;
        StringBuilder sb = C0259ic.f866;
        byte[] bArr = new byte[12];
        boolean z2 = c0349p5.read(bArr, 0, 12) == 12 && "RIFF".equals(new String(bArr, 0, 4, "US-ASCII")) && "WEBP".equals(new String(bArr, 8, 4, "US-ASCII"));
        c0349p5.m1184(jM1185);
        if (!z2) {
            if (z) {
                BitmapFactory.decodeStream(c0349p5, null, optionsM1276);
                AbstractC0469y8.m968(c0443w8.f1845, c0443w8.f1846, optionsM1276.outWidth, optionsM1276.outHeight, optionsM1276, c0443w8);
                c0349p5.m1184(jM1185);
            }
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(c0349p5, null, optionsM1276);
            if (bitmapDecodeStream != null) {
                return bitmapDecodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[4096];
        while (true) {
            int i = c0349p5.read(bArr2);
            if (-1 == i) {
                break;
            }
            byteArrayOutputStream.write(bArr2, 0, i);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (z) {
            BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, optionsM1276);
            AbstractC0469y8.m968(c0443w8.f1845, c0443w8.f1846, optionsM1276.outWidth, optionsM1276.outHeight, optionsM1276, c0443w8);
        }
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, optionsM1276);
    }

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static Bitmap m1026(C0443w8 c0443w8, Bitmap bitmap, int i) {
        int i2;
        int i3;
        int i4;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int iCeil;
        int i5;
        int i6;
        int i7;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z = c0443w8.f1849;
        Matrix matrix = new Matrix();
        if (c0443w8.m1263()) {
            int i8 = c0443w8.f1845;
            int i9 = c0443w8.f1846;
            float f7 = c0443w8.f1850;
            if (f7 != 0.0f) {
                if (c0443w8.f1852) {
                    matrix.setRotate(f7, c0443w8.f1174, c0443w8.f1851);
                } else {
                    matrix.setRotate(f7);
                }
            }
            boolean z2 = true;
            if (c0443w8.f1847) {
                float f8 = i8;
                float f9 = f8 / width;
                float f10 = i9;
                float f11 = f10 / height;
                if (f9 > f11) {
                    iCeil = (int) Math.ceil((f11 / f9) * r13);
                    i7 = (height - iCeil) / 2;
                    f11 = f10 / iCeil;
                    i5 = 0;
                    f6 = f9;
                    i6 = width;
                } else {
                    int iCeil2 = (int) Math.ceil((f9 / f11) * r8);
                    f6 = f8 / iCeil2;
                    iCeil = height;
                    i5 = (width - iCeil2) / 2;
                    i6 = iCeil2;
                    i7 = 0;
                }
                if (((!z || width > i8 || height > i9) ? 1 : 0) != 0) {
                    matrix.preScale(f6, f11);
                }
                i3 = iCeil;
                i4 = i7;
                i2 = i6;
                i = i5;
            } else {
                if (c0443w8.f1848) {
                    float f12 = i8 / width;
                    float f13 = i9 / height;
                    if (f12 >= f13) {
                        f12 = f13;
                    }
                    if (z && width <= i8 && height <= i9) {
                        z2 = false;
                    }
                    if (z2) {
                        matrix.preScale(f12, f12);
                    }
                } else if ((i8 != 0 || i9 != 0) && (i8 != width || i9 != height)) {
                    if (i8 != 0) {
                        f2 = i8;
                        f3 = width;
                    } else {
                        f2 = i9;
                        f3 = height;
                    }
                    float f14 = f2 / f3;
                    if (i9 != 0) {
                        f4 = i9;
                        f5 = height;
                    } else {
                        f4 = i8;
                        f5 = width;
                    }
                    float f15 = f4 / f5;
                    if (z && width <= i8 && height <= i9) {
                        z2 = false;
                    }
                    if (z2) {
                        matrix.preScale(f14, f15);
                    }
                }
                i2 = width;
                i3 = height;
                i4 = 0;
            }
        } else {
            i2 = width;
            i3 = height;
            i4 = 0;
        }
        if (i != 0) {
            matrix.preRotate(i);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i, i4, i2, i3, matrix, true);
        if (bitmapCreateBitmap == bitmap) {
            return bitmap;
        }
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static void m1027(C0443w8 c0443w8) {
        Uri uri = c0443w8.f1842;
        String strValueOf = uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(c0443w8.f1843);
        StringBuilder sb = f1342.get();
        sb.ensureCapacity(strValueOf.length() + 8);
        sb.replace(8, sb.length(), strValueOf);
        Thread.currentThread().setName(sb.toString());
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0384s1 c0384s1;
        C0384s1 c0384s12;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                m1027(this.f1349);
                                if (this.f717.f1916) {
                                    C0259ic.m1095(this);
                                }
                                Bitmap bitmapM1029 = m1029();
                                this.f718 = bitmapM1029;
                                if (bitmapM1029 == null) {
                                    this.f1345.m1220(this);
                                } else {
                                    this.f1345.m934(this);
                                }
                            } catch (InterfaceC0449x1.b e2) {
                                if (!e2.f1185 || e2.f1186 != 504) {
                                    this.f1357 = e2;
                                }
                                c0384s1 = this.f1345;
                                c0384s1.m1220(this);
                            }
                        } catch (C0428v6.a e3) {
                            this.f1357 = e3;
                            c0384s12 = this.f1345;
                            c0384s12.m1221(this);
                        }
                    } catch (IOException e4) {
                        this.f1357 = e4;
                        c0384s12 = this.f1345;
                        c0384s12.m1221(this);
                    }
                } catch (Exception e5) {
                    this.f1357 = e5;
                    c0384s1 = this.f1345;
                    c0384s1.m1220(this);
                }
            } catch (OutOfMemoryError e6) {
                StringWriter stringWriter = new StringWriter();
                this.f1347.m855().m857(new PrintWriter(stringWriter));
                this.f1357 = new RuntimeException(stringWriter.toString(), e6);
                c0384s1 = this.f1345;
                c0384s1.m1220(this);
            }
        } finally {
            Thread.currentThread().setName("Picasso-Idle");
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m830() {
        Future<?> future;
        if (this.f1353 != null) {
            return false;
        }
        ArrayList arrayList = this.f1354;
        return (arrayList == null || arrayList.isEmpty()) && (future = this.f1355) != null && future.cancel(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final void m1028(AbstractC0204f abstractC0204f) {
        boolean zRemove;
        if (this.f1353 == abstractC0204f) {
            this.f1353 = null;
            zRemove = true;
        } else {
            ArrayList arrayList = this.f1354;
            zRemove = arrayList != null ? arrayList.remove(abstractC0204f) : false;
        }
        if (zRemove && abstractC0204f.f774.f1854 == this.f1360) {
            ArrayList arrayList2 = this.f1354;
            boolean z = (arrayList2 == null || arrayList2.isEmpty()) ? false : true;
            AbstractC0204f abstractC0204f2 = this.f1353;
            if (abstractC0204f2 != null || z) {
                i = abstractC0204f2 != null ? abstractC0204f2.f774.f1854 : 1;
                if (z) {
                    int size = this.f1354.size();
                    for (int i = 0; i < size; i++) {
                        int i2 = ((AbstractC0204f) this.f1354.get(i)).f774.f1854;
                        if (C0167c4.m1040(i2) > C0167c4.m1040(i)) {
                            i = i2;
                        }
                    }
                }
            }
            this.f1360 = i;
        }
        if (this.f717.f1916) {
            abstractC0204f.f774.m958();
            C0259ic.m1096(this, "from ");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap m1029() {
        Bitmap bitmapM1026;
        boolean z;
        boolean z2 = true;
        if ((this.f1350 & 1) == 0) {
            bitmapM1026 = ((C0238h5) this.f1346).m866(this.f1348);
            if (bitmapM1026 != null) {
                this.f1347.f795.sendEmptyMessage(0);
                this.f1356 = C0481z7.e.MEMORY;
                if (this.f717.f1916) {
                    this.f1349.m958();
                    StringBuilder sb = C0259ic.f866;
                }
                return bitmapM1026;
            }
        } else {
            bitmapM1026 = null;
        }
        C0443w8 c0443w8 = this.f1349;
        c0443w8.f1841 = this.f1359 == 0 ? 4 : this.f1351;
        AbstractC0469y8.a aVarMo1030 = this.f1352.mo1030(c0443w8);
        if (aVarMo1030 != null) {
            this.f1356 = aVarMo1030.f1213;
            this.f1358 = aVarMo1030.f1876;
            bitmapM1026 = aVarMo1030.f1214;
            if (bitmapM1026 == null) {
                InputStream inputStream = aVarMo1030.f1875;
                try {
                    Bitmap bitmapM1025 = m1025(inputStream, this.f1349);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    bitmapM1026 = bitmapM1025;
                } finally {
                    StringBuilder sb2 = C0259ic.f866;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
        }
        if (bitmapM1026 != null) {
            if (this.f717.f1916) {
                this.f1349.m958();
                StringBuilder sb3 = C0259ic.f866;
            }
            C0215fa c0215fa = this.f1347;
            c0215fa.getClass();
            int iM873 = C0259ic.m873(bitmapM1026);
            C0215fa.a aVar = c0215fa.f795;
            aVar.sendMessage(aVar.obtainMessage(2, iM873, 0));
            C0443w8 c0443w82 = this.f1349;
            if (c0443w82.m1263()) {
                z = true;
                if (!z || this.f1358 != 0) {
                    synchronized (f1341) {
                        if (this.f1349.m1263() || this.f1358 != 0) {
                            bitmapM1026 = m1026(this.f1349, bitmapM1026, this.f1358);
                            if (this.f717.f1916) {
                                this.f1349.m958();
                            }
                        }
                        List<InterfaceC0381rb> list = this.f1349.f1844;
                        if (list == null) {
                            z2 = false;
                        }
                        if (z2) {
                            bitmapM1026 = m829(list, bitmapM1026);
                            if (this.f717.f1916) {
                                this.f1349.m958();
                            }
                        }
                    }
                    if (bitmapM1026 != null) {
                        C0215fa c0215fa2 = this.f1347;
                        c0215fa2.getClass();
                        int iM8732 = C0259ic.m873(bitmapM1026);
                        C0215fa.a aVar2 = c0215fa2.f795;
                        aVar2.sendMessage(aVar2.obtainMessage(3, iM8732, 0));
                    }
                }
            } else {
                if (!(c0443w82.f1844 != null)) {
                    z = false;
                }
                if (!z) {
                    synchronized (f1341) {
                    }
                }
            }
        }
        return bitmapM1026;
    }
}
