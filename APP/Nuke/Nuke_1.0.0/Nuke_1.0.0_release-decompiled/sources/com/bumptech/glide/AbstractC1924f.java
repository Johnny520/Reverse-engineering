package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bumptech.glide.load.data.C1941k;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.dartcv.nuke.R;
import p000A.C0033Q0;
import p000A.C0038T0;
import p000A.C0066i0;
import p000A.C0072l0;
import p002A1.AbstractC0122K;
import p013C0.C0236c;
import p056K2.C0884j;
import p059L0.AbstractC0956b;
import p060L1.AbstractC0957a;
import p061L2.AbstractC0967g;
import p061L2.AbstractC0972l;
import p061L2.AbstractC0973m;
import p061L2.C0981u;
import p073O1.C1042d;
import p076P.AbstractC1089e0;
import p076P.AbstractC1107t;
import p077P0.AbstractC1132s;
import p077P0.C1116c;
import p077P0.C1128o;
import p078P1.InterfaceC1149k;
import p081Q.C1166i;
import p092S0.C1260M;
import p093S1.C1294f;
import p093S1.InterfaceC1289a;
import p094S2.AbstractC1300a;
import p095T.AbstractC1385s;
import p095T.C1305C;
import p095T.C1383r;
import p095T.C1386s0;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p097T1.C1416e;
import p098T2.AbstractC1421a;
import p107V1.C1499B;
import p107V1.C1502a;
import p107V1.C1507f;
import p107V1.C1508g;
import p107V1.C1525x;
import p107V1.C1527z;
import p110W0.C1577b;
import p111W1.C1596b;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1676u;
import p118X3.C1706p;
import p121Y1.C1737E;
import p121Y1.C1739G;
import p121Y1.C1740a;
import p121Y1.C1741b;
import p121Y1.C1742c;
import p121Y1.C1745f;
import p121Y1.C1746g;
import p121Y1.C1753n;
import p121Y1.C1754o;
import p121Y1.C1757r;
import p121Y1.C1761v;
import p126Z1.C1783a;
import p127Z2.AbstractC1784a;
import p128a.AbstractC1785a;
import p131a2.C1797a;
import p131a2.C1800d;
import p136b0.C1843e;
import p137b3.InterfaceC1854b;
import p142c2.C1890a;
import p142c2.C1892c;
import p142c2.C1898i;
import p148d2.C1972c;
import p149d3.AbstractC1973a;
import p153e1.C2015k;
import p163g0.C2169a;
import p163g0.C2170b;
import p163g0.C2174f;
import p164g1.AbstractC2179a;
import p169h0.AbstractC2192a;
import p169h0.InterfaceC2207p;
import p179i4.AbstractC2352g;
import p182j1.AbstractFutureC2378g;
import p182j1.C2374c;
import p182j1.C2377f;
import p204n0.C2683b;
import p204n0.C2684c;
import p208n4.AbstractC2702a;
import p208n4.C2709h;
import p211o0.C2743b;
import p211o0.C2747f;
import p211o0.C2762u;
import p222q0.C2901b;
import p234s1.C3175g;
import p245u0.C3309f;
import p275z2.C3516b;

/* JADX INFO: renamed from: com.bumptech.glide.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1924f {

    /* JADX INFO: renamed from: b */
    public static C2747f f6526b;

    /* JADX INFO: renamed from: c */
    public static C2743b f6527c;

    /* JADX INFO: renamed from: d */
    public static C2901b f6528d;

    /* JADX INFO: renamed from: e */
    public static long f6529e;

    /* JADX INFO: renamed from: f */
    public static Method f6530f;

    /* JADX INFO: renamed from: g */
    public static C3309f f6531g;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6532a;

    public /* synthetic */ AbstractC1924f(int i5) {
        this.f6532a = i5;
    }

    /* JADX INFO: renamed from: A */
    public static final boolean m3491A(Throwable th, InterfaceC1599a interfaceC1599a) {
        List listM1987K;
        Object objInvoke;
        AbstractC1665j.m2985e(th, "<this>");
        Integer num = AbstractC1421a.f5078a;
        C2174f c2174f = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            AbstractC1665j.m2984d(suppressed, "getSuppressed(...)");
            listM1987K = AbstractC0972l.m1987K(suppressed);
        } else {
            Method method = AbstractC1300a.f4660b;
            listM1987K = (method == null || (objInvoke = method.invoke(th, null)) == null) ? C0981u.f3047d : AbstractC0972l.m1987K((Throwable[]) objInvoke);
        }
        int size = listM1987K.size();
        boolean z5 = false;
        for (int i5 = 0; i5 < size; i5++) {
            if (((Throwable) listM1987K.get(i5)) instanceof C2174f) {
                return false;
            }
        }
        try {
            C2169a c2169a = (C2169a) interfaceC1599a.mo6a();
            if (c2169a != null && !c2169a.f7128a.isEmpty()) {
                z5 = true;
            }
            if (z5) {
                AbstractC1665j.m2982b(c2169a);
                c2174f = new C2174f(c2169a);
            }
        } catch (Throwable th2) {
            c2174f = th2;
        }
        if (c2174f != null) {
            AbstractC2352g.m4193f(th, c2174f);
        }
        return z5;
    }

    /* JADX INFO: renamed from: a */
    public static final void m3492a(long j5, C1260M c1260m, C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-684938728);
        int i6 = (c1383r.m2580e(j5) ? 4 : 2) | i5 | (c1383r.m2582f(c1260m) ? 32 : 16);
        if ((i5 & 384) == 0) {
            i6 |= c1383r.m2586h(c1843e) ? 256 : 128;
        }
        if (c1383r.m2560O(i6 & 1, (i6 & 147) != 146)) {
            C1305C c1305c = AbstractC1089e0.f3432a;
            AbstractC1385s.m2612b(new C1386s0[]{AbstractC1107t.f3615a.mo2399a(new C2762u(j5)), c1305c.mo2399a(((C1260M) c1383r.m2590j(c1305c)).m2345d(c1260m))}, c1843e, c1383r, ((i6 >> 3) & 112) | 8);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C1166i(j5, c1260m, c1843e, i5);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m3493b(Object[] objArr, int i5, int i6, AbstractC0967g abstractC0967g) {
        StringBuilder sb = new StringBuilder((i6 * 3) + 2);
        sb.append("[");
        for (int i7 = 0; i7 < i6; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i5 + i7];
            if (obj == abstractC0967g) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: c */
    public static void m3494c(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m3495d(ArrayList arrayList) {
        List list;
        long j5;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = C0981u.f3047d;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int iM4208u = AbstractC2352g.m4208u(arrayList);
                int i5 = 0;
                while (i5 < iM4208u) {
                    i5++;
                    Object obj2 = arrayList.get(i5);
                    C1128o c1128o = (C1128o) obj2;
                    C1128o c1128o2 = (C1128o) obj;
                    arrayList2.add(new C2683b((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (c1128o2.m2170g().m4651b() >> 32)) - Float.intBitsToFloat((int) (c1128o.m2170g().m4651b() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (c1128o2.m2170g().m4651b() & 4294967295L)) - Float.intBitsToFloat((int) (c1128o.m2170g().m4651b() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j5 = ((C2683b) AbstractC0973m.m2012S(list)).f8556a;
            } else {
                if (list.isEmpty()) {
                    AbstractC2179a.m4008b("Empty collection can't be reduced.");
                }
                Object objM2012S = AbstractC0973m.m2012S(list);
                int iM4208u2 = AbstractC2352g.m4208u(list);
                if (1 <= iM4208u2) {
                    int i6 = 1;
                    while (true) {
                        objM2012S = new C2683b(C2683b.m4647e(((C2683b) objM2012S).f8556a, ((C2683b) list.get(i6)).f8556a));
                        if (i6 == iM4208u2) {
                            break;
                        }
                        i6++;
                    }
                }
                j5 = ((C2683b) objM2012S).f8556a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j5)) >= Float.intBitsToFloat((int) (j5 >> 32))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static void m3496h(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i5 = inputStream.read(bArr);
        while (i5 >= 0) {
            outputStream.write(bArr, 0, i5);
            i5 = inputStream.read(bArr);
        }
    }

    /* JADX INFO: renamed from: i */
    public static C1930l m3497i(ComponentCallbacks2C1921c componentCallbacks2C1921c, ArrayList arrayList) {
        InterfaceC1149k c1740a;
        InterfaceC1149k c1746g;
        InterfaceC1289a interfaceC1289a;
        int i5;
        String str;
        Class cls;
        InterfaceC1289a interfaceC1289a2 = componentCallbacks2C1921c.f6514d;
        C1294f c1294f = componentCallbacks2C1921c.f6517g;
        C1927i c1927i = componentCallbacks2C1921c.f6516f;
        Context applicationContext = c1927i.getApplicationContext();
        C1753n c1753n = c1927i.f6544h;
        C1930l c1930l = new C1930l();
        C1754o c1754o = new C1754o();
        C1706p c1706p = c1930l.f6558g;
        synchronized (c1706p) {
            c1706p.f5857a.add(c1754o);
        }
        int i6 = Build.VERSION.SDK_INT;
        C1761v c1761v = new C1761v();
        C1706p c1706p2 = c1930l.f6558g;
        synchronized (c1706p2) {
            c1706p2.f5857a.add(c1761v);
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListM3591e = c1930l.m3591e();
        C1890a c1890a = new C1890a(applicationContext, arrayListM3591e, interfaceC1289a2, c1294f);
        C1739G c1739g = new C1739G(interfaceC1289a2, new C1577b(9));
        C1757r c1757r = new C1757r(c1930l.m3591e(), resources.getDisplayMetrics(), interfaceC1289a2, c1294f);
        if (i6 < 28 || !((Map) c1753n.f6028e).containsKey(AbstractC1922d.class)) {
            C1745f c1745f = new C1745f(c1757r, 0);
            c1740a = new C1740a(2, c1757r, c1294f);
            c1746g = c1745f;
        } else {
            C1746g c1746g2 = new C1746g(1);
            c1746g = new C1746g(0);
            c1740a = c1746g2;
        }
        if (i6 >= 28) {
            i5 = i6;
            interfaceC1289a = interfaceC1289a2;
            c1930l.m3590d("Animation", InputStream.class, Drawable.class, new C1797a(new C0038T0(26, arrayListM3591e, c1294f), 1));
            c1930l.m3590d("Animation", ByteBuffer.class, Drawable.class, new C1797a(new C0038T0(26, arrayListM3591e, c1294f), 0));
        } else {
            interfaceC1289a = interfaceC1289a2;
            i5 = i6;
        }
        C1800d c1800d = new C1800d(applicationContext);
        C1741b c1741b = new C1741b(c1294f);
        C0236c c0236c = new C0236c();
        C1972c c1972c = new C1972c(1);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        c1930l.m3587a(ByteBuffer.class, new C1527z(5));
        c1930l.m3587a(InputStream.class, new C0066i0(24, c1294f));
        c1930l.m3590d("Bitmap", ByteBuffer.class, Bitmap.class, c1746g);
        c1930l.m3590d("Bitmap", InputStream.class, Bitmap.class, c1740a);
        String str2 = Build.FINGERPRINT;
        if ("robolectric".equals(str2)) {
            str = str2;
            cls = ParcelFileDescriptor.class;
        } else {
            str = str2;
            cls = ParcelFileDescriptor.class;
            c1930l.m3590d("Bitmap", cls, Bitmap.class, new C1745f(c1757r, 1));
        }
        InterfaceC1289a interfaceC1289a3 = interfaceC1289a;
        c1930l.m3590d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new C1739G(interfaceC1289a3, new C1577b(6)));
        c1930l.m3590d("Bitmap", cls, Bitmap.class, c1739g);
        C1527z c1527z = C1527z.f5295e;
        c1930l.m3589c(Bitmap.class, Bitmap.class, c1527z);
        c1930l.m3590d("Bitmap", Bitmap.class, Bitmap.class, new C1737E(0));
        c1930l.m3588b(Bitmap.class, c1741b);
        c1930l.m3590d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C1740a(resources, c1746g));
        c1930l.m3590d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C1740a(resources, c1740a));
        c1930l.m3590d("BitmapDrawable", cls, BitmapDrawable.class, new C1740a(resources, c1739g));
        c1930l.m3588b(BitmapDrawable.class, new C0038T0(23, interfaceC1289a3, c1741b));
        c1930l.m3590d("Animation", InputStream.class, C1892c.class, new C1898i(arrayListM3591e, c1890a, c1294f));
        c1930l.m3590d("Animation", ByteBuffer.class, C1892c.class, c1890a);
        c1930l.m3588b(C1892c.class, new C1577b(14));
        c1930l.m3589c(C1042d.class, C1042d.class, c1527z);
        c1930l.m3590d("Bitmap", C1042d.class, Bitmap.class, new C1742c(interfaceC1289a3));
        c1930l.m3590d("legacy_append", Uri.class, Drawable.class, c1800d);
        c1930l.m3590d("legacy_append", Uri.class, Bitmap.class, new C1740a(1, c1800d, interfaceC1289a3));
        c1930l.m3594h(new C1783a(0));
        c1930l.m3589c(File.class, ByteBuffer.class, new C1527z(6));
        c1930l.m3589c(File.class, InputStream.class, new C1507f(new C1527z(9)));
        c1930l.m3590d("legacy_append", File.class, File.class, new C1737E(2));
        c1930l.m3589c(File.class, cls, new C1507f(new C1527z(8)));
        c1930l.m3589c(File.class, File.class, c1527z);
        c1930l.m3594h(new C1941k(c1294f));
        if (!"robolectric".equals(str)) {
            c1930l.m3594h(new C1783a(2));
        }
        C1416e c1416e = new C1416e(applicationContext, 3);
        C1416e c1416e2 = new C1416e(applicationContext, 1);
        C1416e c1416e3 = new C1416e(applicationContext, 2);
        Class cls2 = Integer.TYPE;
        c1930l.m3589c(cls2, InputStream.class, c1416e);
        c1930l.m3589c(Integer.class, InputStream.class, c1416e);
        c1930l.m3589c(cls2, AssetFileDescriptor.class, c1416e2);
        c1930l.m3589c(Integer.class, AssetFileDescriptor.class, c1416e2);
        c1930l.m3589c(cls2, Drawable.class, c1416e3);
        c1930l.m3589c(Integer.class, Drawable.class, c1416e3);
        c1930l.m3589c(Uri.class, InputStream.class, new C1416e(applicationContext, 6));
        c1930l.m3589c(Uri.class, AssetFileDescriptor.class, new C1416e(applicationContext, 5));
        C1525x c1525x = new C1525x(resources, 2);
        C1525x c1525x2 = new C1525x(resources, 0);
        C1525x c1525x3 = new C1525x(resources, 1);
        c1930l.m3589c(Integer.class, Uri.class, c1525x);
        c1930l.m3589c(cls2, Uri.class, c1525x);
        c1930l.m3589c(Integer.class, AssetFileDescriptor.class, c1525x2);
        c1930l.m3589c(cls2, AssetFileDescriptor.class, c1525x2);
        c1930l.m3589c(Integer.class, InputStream.class, c1525x3);
        c1930l.m3589c(cls2, InputStream.class, c1525x3);
        c1930l.m3589c(String.class, InputStream.class, new C0066i0(22));
        c1930l.m3589c(Uri.class, InputStream.class, new C0066i0(22));
        c1930l.m3589c(String.class, InputStream.class, new C1527z(13));
        c1930l.m3589c(String.class, cls, new C1527z(12));
        c1930l.m3589c(String.class, AssetFileDescriptor.class, new C1527z(11));
        c1930l.m3589c(Uri.class, InputStream.class, new C1502a(applicationContext.getAssets(), 1));
        c1930l.m3589c(Uri.class, AssetFileDescriptor.class, new C1502a(applicationContext.getAssets(), 0));
        c1930l.m3589c(Uri.class, InputStream.class, new C1416e(applicationContext, 7));
        c1930l.m3589c(Uri.class, InputStream.class, new C1416e(applicationContext, 8));
        if (i5 >= 29) {
            c1930l.m3589c(Uri.class, InputStream.class, new C1596b(applicationContext, InputStream.class));
            c1930l.m3589c(Uri.class, cls, new C1596b(applicationContext, cls));
        }
        boolean zContainsKey = ((Map) c1753n.f6028e).containsKey(AbstractC1926h.class);
        c1930l.m3589c(Uri.class, InputStream.class, new C1499B(contentResolver, zContainsKey, 2));
        c1930l.m3589c(Uri.class, cls, new C1499B(contentResolver, zContainsKey, 1));
        c1930l.m3589c(Uri.class, AssetFileDescriptor.class, new C1499B(contentResolver, zContainsKey, 0));
        c1930l.m3589c(Uri.class, InputStream.class, new C1527z(14));
        c1930l.m3589c(URL.class, InputStream.class, new C1577b(4));
        c1930l.m3589c(Uri.class, File.class, new C1416e(applicationContext, 4));
        c1930l.m3589c(C1508g.class, InputStream.class, new C0066i0(26));
        c1930l.m3589c(byte[].class, ByteBuffer.class, new C1527z(2));
        c1930l.m3589c(byte[].class, InputStream.class, new C1527z(4));
        c1930l.m3589c(Uri.class, Uri.class, c1527z);
        c1930l.m3589c(Drawable.class, Drawable.class, c1527z);
        c1930l.m3590d("legacy_append", Drawable.class, Drawable.class, new C1737E(1));
        c1930l.m3595i(Bitmap.class, BitmapDrawable.class, new C1525x(resources, 3));
        c1930l.m3595i(Bitmap.class, byte[].class, c0236c);
        c1930l.m3595i(Drawable.class, byte[].class, new C0072l0(interfaceC1289a3, c0236c, c1972c, 18));
        c1930l.m3595i(C1892c.class, byte[].class, c1972c);
        C1739G c1739g2 = new C1739G(interfaceC1289a3, new C1577b(7));
        c1930l.m3590d("legacy_append", ByteBuffer.class, Bitmap.class, c1739g2);
        c1930l.m3590d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C1740a(resources, c1739g2));
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return c1930l;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC0122K m3498j(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                AbstractC1665j.m2982b(objNewInstance);
                return (AbstractC0122K) objNewInstance;
            } catch (IllegalAccessException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            } catch (InstantiationException e6) {
                throw new RuntimeException("Cannot create an instance of " + cls, e6);
            }
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final ArrayList m3499k(C2169a c2169a) {
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = c2169a.f7128a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        while (i5 < size) {
            int i6 = i5 + 1;
            C2170b c2170b = (C2170b) list.get(i5);
            int i7 = c2170b.f7129a;
            int length = iArr.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    i8 = -1;
                    break;
                }
                if (i7 == iArr[i8]) {
                    break;
                }
                i8++;
            }
            if (!(i8 >= 0)) {
                if (c2170b.f7129a == 100) {
                    int i9 = i5 + 2;
                    if (i9 < size && ((C2170b) list.get(i9)).f7129a == 1000) {
                        break;
                    }
                    if (!arrayList.isEmpty()) {
                        arrayList.remove(AbstractC2352g.m4208u(arrayList));
                    }
                } else {
                    arrayList.add(c2170b);
                }
            }
            i5 = i6;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public static final long m3500l(long j5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: m */
    public static final ViewParent m3501m(View view) {
        AbstractC1665j.m2985e(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m3502n() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0957a.m1971a();
        }
        try {
            if (f6530f == null) {
                f6529e = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f6530f = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f6530f.invoke(null, Long.valueOf(f6529e))).booleanValue();
        } catch (Exception e5) {
            if (!(e5 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e5);
                return false;
            }
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX INFO: renamed from: o */
    public static boolean m3503o(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* JADX INFO: renamed from: p */
    public static InterfaceC2207p m3504p(InterfaceC2207p interfaceC2207p, InterfaceC1599a interfaceC1599a) {
        AbstractC1665j.m2985e(interfaceC2207p, "$this$nukeClick");
        AbstractC1665j.m2985e(interfaceC1599a, "onClick");
        return AbstractC2192a.m4014a(interfaceC2207p, new C0033Q0(3, interfaceC1599a));
    }

    /* JADX INFO: renamed from: q */
    public static String m3505q(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        StringBuilder sb = new StringBuilder("sha256/");
        C2709h c2709h = C2709h.f8630g;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        AbstractC1665j.m2984d(encoded, "getEncoded(...)");
        int length = encoded.length;
        int i5 = 0;
        AbstractC1926h.m3564g(encoded.length, 0, length);
        byte[] bArrM1996T = AbstractC0972l.m1996T(encoded, 0, length);
        C2709h c2709h2 = new C2709h(bArrM1996T);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArrM1996T, 0, c2709h2.mo4732a());
        byte[] bArrDigest = messageDigest.digest();
        AbstractC1665j.m2982b(bArrDigest);
        new C2709h(bArrDigest);
        byte[] bArr = AbstractC2702a.f8615a;
        AbstractC1665j.m2985e(bArr, "map");
        byte[] bArr2 = new byte[((bArrDigest.length + 2) / 3) * 4];
        int length2 = bArrDigest.length - (bArrDigest.length % 3);
        int i6 = 0;
        while (i5 < length2) {
            byte b2 = bArrDigest[i5];
            int i7 = i5 + 2;
            byte b5 = bArrDigest[i5 + 1];
            i5 += 3;
            byte b6 = bArrDigest[i7];
            bArr2[i6] = bArr[(b2 & 255) >> 2];
            bArr2[i6 + 1] = bArr[((b2 & 3) << 4) | ((b5 & 255) >> 4)];
            int i8 = i6 + 3;
            bArr2[i6 + 2] = bArr[((b5 & 15) << 2) | ((b6 & 255) >> 6)];
            i6 += 4;
            bArr2[i8] = bArr[b6 & 63];
        }
        int length3 = bArrDigest.length - length2;
        if (length3 == 1) {
            byte b7 = bArrDigest[i5];
            bArr2[i6] = bArr[(b7 & 255) >> 2];
            bArr2[i6 + 1] = bArr[(b7 & 3) << 4];
            bArr2[i6 + 2] = 61;
            bArr2[i6 + 3] = 61;
        } else if (length3 == 2) {
            int i9 = i5 + 1;
            byte b8 = bArrDigest[i5];
            byte b9 = bArrDigest[i9];
            bArr2[i6] = bArr[(b8 & 255) >> 2];
            bArr2[i6 + 1] = bArr[((b8 & 3) << 4) | ((b9 & 255) >> 4)];
            bArr2[i6 + 2] = bArr[(b9 & 15) << 2];
            bArr2[i6 + 3] = 61;
        }
        sb.append(new String(bArr2, AbstractC1973a.f6662a));
        return sb.toString();
    }

    /* JADX INFO: renamed from: t */
    public static final void m3506t(Object[] objArr, int i5, int i6) {
        AbstractC1665j.m2985e(objArr, "<this>");
        while (i5 < i6) {
            objArr[i5] = null;
            i5++;
        }
    }

    /* JADX INFO: renamed from: u */
    public static C1753n m3507u(Object obj) {
        if (obj instanceof InterfaceC1854b) {
            return new C1753n(29, new C3516b(AbstractC1784a.m3238x((InterfaceC1854b) obj), obj));
        }
        if (obj instanceof Class) {
            return new C1753n(29, new C3516b((Class) obj, obj));
        }
        return new C1753n(29, new C3516b(obj.getClass(), obj));
    }

    /* JADX INFO: renamed from: v */
    public static final C2015k m3508v(C2684c c2684c) {
        return new C2015k(Math.round(c2684c.f8558a), Math.round(c2684c.f8559b), Math.round(c2684c.f8560c), Math.round(c2684c.f8561d));
    }

    /* JADX INFO: renamed from: w */
    public static final void m3509w(C1128o c1128o, C3175g c3175g) {
        AccessibilityNodeInfo accessibilityNodeInfo = c3175g.f9931a;
        Object objM4272g = c1128o.m2173k().f3702d.m4272g(AbstractC1132s.f3743f);
        if (objM4272g == null) {
            objM4272g = null;
        }
        C1116c c1116c = (C1116c) objM4272g;
        if (c1116c != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(c1116c.f3637a, c1116c.f3638b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object objM4272g2 = c1128o.m2173k().f3702d.m4272g(AbstractC1132s.f3742e);
        if ((objM4272g2 != null ? objM4272g2 : null) != null) {
            List listM2163j = C1128o.m2163j(4, c1128o);
            int size = listM2163j.size();
            for (int i5 = 0; i5 < size; i5++) {
                C1128o c1128o2 = (C1128o) listM2163j.get(i5);
                if (c1128o2.m2173k().f3702d.m4268c(AbstractC1132s.f3730I)) {
                    arrayList.add(c1128o2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zM3495d = m3495d(arrayList);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zM3495d ? 1 : arrayList.size(), zM3495d ? arrayList.size() : 1, false, 0));
    }

    /* JADX INFO: renamed from: x */
    public static final void m3510x(C1128o c1128o, C3175g c3175g) {
        Object objM4272g = c1128o.m2173k().f3702d.m4272g(AbstractC1132s.f3744g);
        if (objM4272g == null) {
            objM4272g = null;
        }
        if (objM4272g != null) {
            throw new ClassCastException();
        }
        C1128o c1128oM2174l = c1128o.m2174l();
        if (c1128oM2174l == null) {
            return;
        }
        Object objM4272g2 = c1128oM2174l.m2173k().f3702d.m4272g(AbstractC1132s.f3742e);
        if (objM4272g2 == null) {
            objM4272g2 = null;
        }
        if (objM4272g2 != null) {
            Object objM4272g3 = c1128oM2174l.m2173k().f3702d.m4272g(AbstractC1132s.f3743f);
            C1116c c1116c = (C1116c) (objM4272g3 != null ? objM4272g3 : null);
            if (c1116c == null || (c1116c.f3637a >= 0 && c1116c.f3638b >= 0)) {
                if (c1128o.m2173k().f3702d.m4268c(AbstractC1132s.f3730I)) {
                    ArrayList arrayList = new ArrayList();
                    List listM2163j = C1128o.m2163j(4, c1128oM2174l);
                    int size = listM2163j.size();
                    int i5 = 0;
                    for (int i6 = 0; i6 < size; i6++) {
                        C1128o c1128o2 = (C1128o) listM2163j.get(i6);
                        if (c1128o2.m2173k().f3702d.m4268c(AbstractC1132s.f3730I)) {
                            arrayList.add(c1128o2);
                            if (c1128o2.f3710c.m840v() < c1128o.f3710c.m840v()) {
                                i5++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zM3495d = m3495d(arrayList);
                    int i7 = zM3495d ? 0 : i5;
                    int i8 = zM3495d ? i5 : 0;
                    Object objM4272g4 = c1128o.m2173k().f3702d.m4272g(AbstractC1132s.f3730I);
                    if (objM4272g4 == null) {
                        objM4272g4 = Boolean.FALSE;
                    }
                    c3175g.f9931a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i7, 1, i8, 1, false, ((Boolean) objM4272g4).booleanValue()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m3511y(Window window, boolean z5) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 35) {
            AbstractC0956b.m1967e(window, z5);
        } else {
            if (i5 >= 30) {
                AbstractC0956b.m1966d(window, z5);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z5 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* JADX INFO: renamed from: z */
    public static final Class m3512z(String str) {
        Object objM3229o;
        Object objM3229o2;
        ClassLoader classLoader;
        try {
            classLoader = AbstractC1785a.f6096b;
        } catch (Throwable th) {
            objM3229o = AbstractC1784a.m3229o(th);
        }
        if (classLoader == null) {
            AbstractC1665j.m2991k("hostClassLoader");
            throw null;
        }
        objM3229o = classLoader.loadClass(str);
        if (!(objM3229o instanceof C0884j)) {
            Class cls = (Class) objM3229o;
            AbstractC1665j.m2982b(cls);
            return cls;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null) {
            try {
                objM3229o2 = contextClassLoader.loadClass(str);
            } catch (Throwable th2) {
                objM3229o2 = AbstractC1784a.m3229o(th2);
            }
            if (!(objM3229o2 instanceof C0884j)) {
                Class cls2 = (Class) objM3229o2;
                AbstractC1665j.m2982b(cls2);
                return cls2;
            }
        }
        return Class.forName(str);
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo3513e(AbstractFutureC2378g abstractFutureC2378g, C2374c c2374c);

    /* JADX INFO: renamed from: f */
    public abstract boolean mo3514f(AbstractFutureC2378g abstractFutureC2378g, Object obj, Object obj2);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo3515g(AbstractFutureC2378g abstractFutureC2378g, C2377f c2377f, C2377f c2377f2);

    public int hashCode() {
        switch (this.f6532a) {
            case 18:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo3516r(C2377f c2377f, C2377f c2377f2);

    /* JADX INFO: renamed from: s */
    public abstract void mo3517s(C2377f c2377f, Thread thread);

    public String toString() {
        switch (this.f6532a) {
            case 18:
                String strM2978b = AbstractC1676u.m2995a(getClass()).m2978b();
                AbstractC1665j.m2982b(strM2978b);
                return strM2978b;
            default:
                return super.toString();
        }
    }
}
