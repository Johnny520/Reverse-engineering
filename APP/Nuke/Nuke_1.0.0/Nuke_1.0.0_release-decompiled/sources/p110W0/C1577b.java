package p110W0;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p001A0.InterfaceC0101a;
import p061L2.AbstractC0974n;
import p074O2.InterfaceC1050h;
import p078P1.C1147i;
import p078P1.InterfaceC1150l;
import p088R1.InterfaceC1194D;
import p093S1.InterfaceC1289a;
import p107V1.C1508g;
import p107V1.C1524w;
import p107V1.C1526y;
import p107V1.InterfaceC1518q;
import p107V1.InterfaceC1519r;
import p117X2.AbstractC1665j;
import p118X3.EnumC1716z;
import p121Y1.InterfaceC1756q;
import p128a.AbstractC1785a;
import p142c2.C1892c;
import p149d3.AbstractC1983k;
import p154e2.InterfaceC2024c;
import p179i4.C2350e;
import p179i4.InterfaceC2357l;
import p179i4.InterfaceC2359n;
import p186k.AbstractC2415L;
import p186k.C2408E;
import p186k.C2435q;
import p195l2.AbstractC2498b;
import p208n4.C2706e;

/* JADX INFO: renamed from: W0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1577b implements InterfaceC1591p, InterfaceC1519r, InterfaceC1756q, InterfaceC1150l, InterfaceC2024c, InterfaceC1050h, InterfaceC0101a, InterfaceC2357l {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5491d;

    public /* synthetic */ C1577b(int i5) {
        this.f5491d = i5;
    }

    /* JADX INFO: renamed from: i */
    public static final float m2843i(float f2, float[] fArr, float[] fArr2) {
        float f5;
        float f6;
        float f7;
        float f8;
        float fAbs = Math.abs(f2);
        float fSignum = Math.signum(f2);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i5 = -(iBinarySearch + 1);
        int i6 = i5 - 1;
        if (i6 >= fArr.length - 1) {
            float f9 = fArr[fArr.length - 1];
            float f10 = fArr2[fArr.length - 1];
            if (f9 == 0.0f) {
                return 0.0f;
            }
            return (f10 / f9) * f2;
        }
        if (i6 == -1) {
            float f11 = fArr[0];
            f7 = fArr2[0];
            f8 = f11;
            f6 = 0.0f;
            f5 = 0.0f;
        } else {
            float f12 = fArr[i6];
            float f13 = fArr[i5];
            f5 = fArr2[i6];
            f6 = f12;
            f7 = fArr2[i5];
            f8 = f13;
        }
        return (((f7 - f5) * Math.max(0.0f, Math.min(1.0f, f6 == f8 ? 0.0f : (fAbs - f6) / (f8 - f6)))) + f5) * fSignum;
    }

    /* JADX INFO: renamed from: l */
    public static ArrayList m2844l(List list) {
        AbstractC1665j.m2985e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC1716z) obj) != EnumC1716z.f5944f) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0974n.m2029K(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC1716z) it.next()).f5952d);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: m */
    public static byte[] m2845m(List list) {
        AbstractC1665j.m2985e(list, "protocols");
        C2706e c2706e = new C2706e();
        for (String str : m2844l(list)) {
            c2706e.m4705G(str.length());
            c2706e.m4711M(str);
        }
        return c2706e.m4726t(c2706e.f8629e);
    }

    /* JADX INFO: renamed from: o */
    public static Typeface m2846o(String str, C1587l c1587l, int i5) {
        if (i5 == 0 && AbstractC1665j.m2981a(c1587l, C1587l.f5502f) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), c1587l.f5507d, i5 == 1);
    }

    /* JADX INFO: renamed from: q */
    public static Typeface m2847q(String str, C1587l c1587l, int i5) {
        if (i5 == 0 && AbstractC1665j.m2981a(c1587l, C1587l.f5502f) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iM3251l = AbstractC1785a.m3251l(c1587l, i5);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iM3251l) : Typeface.create(str, iM3251l);
    }

    @Override // p179i4.InterfaceC2357l
    /* JADX INFO: renamed from: a */
    public boolean mo2848a(SSLSocket sSLSocket) {
        return AbstractC1983k.m3656S(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // p078P1.InterfaceC1140b
    /* JADX INFO: renamed from: c */
    public boolean mo34c(Object obj, File file, C1147i c1147i) throws Throwable {
        try {
            AbstractC2498b.m4441d(((C1892c) ((InterfaceC1194D) obj).get()).f6426d.f6425a.f6444a.f3264d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e5) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e5);
            return false;
        }
    }

    @Override // p179i4.InterfaceC2357l
    /* JADX INFO: renamed from: e */
    public InterfaceC2359n mo2849e(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new C2350e(superclass);
    }

    @Override // p107V1.InterfaceC1519r
    /* JADX INFO: renamed from: g */
    public InterfaceC1518q mo68g(C1524w c1524w) {
        return new C1526y(c1524w.m2789a(C1508g.class, InputStream.class), 1);
    }

    @Override // p078P1.InterfaceC1150l
    /* JADX INFO: renamed from: h */
    public int mo39h(C1147i c1147i) {
        return 1;
    }

    /* JADX INFO: renamed from: k */
    public void m2850k(InterfaceC2024c interfaceC2024c) {
        interfaceC2024c.mo2852x();
    }

    /* JADX INFO: renamed from: r */
    public Typeface m2851r(C1589n c1589n, C1587l c1587l, int i5) {
        switch (this.f5491d) {
            case 2:
                return m2846o(c1589n.f5509d, c1587l, i5);
            default:
                String strConcat = c1589n.f5509d;
                int i6 = c1587l.f5507d / 100;
                if (i6 >= 0 && i6 < 2) {
                    strConcat = strConcat.concat("-thin");
                } else if (2 <= i6 && i6 < 4) {
                    strConcat = strConcat.concat("-light");
                } else if (i6 != 4) {
                    if (i6 == 5) {
                        strConcat = strConcat.concat("-medium");
                    } else if ((6 > i6 || i6 >= 8) && 8 <= i6 && i6 < 11) {
                        strConcat = strConcat.concat("-black");
                    }
                }
                Typeface typeface = null;
                if (strConcat.length() != 0) {
                    Typeface typefaceM2847q = m2847q(strConcat, c1587l, i5);
                    if (!AbstractC1665j.m2981a(typefaceM2847q, Typeface.create(Typeface.DEFAULT, AbstractC1785a.m3251l(c1587l, i5))) && !AbstractC1665j.m2981a(typefaceM2847q, m2847q(null, c1587l, i5))) {
                        typeface = typefaceM2847q;
                    }
                }
                return typeface == null ? m2847q(c1589n.f5509d, c1587l, i5) : typeface;
        }
    }

    public String toString() {
        switch (this.f5491d) {
            case 24:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    public C1577b() {
        this.f5491d = 0;
        new C2435q(16);
        long[] jArr = AbstractC2415L.f7816a;
        new C2408E();
    }

    @Override // p121Y1.InterfaceC1756q
    /* JADX INFO: renamed from: s */
    public void mo50s() {
    }

    @Override // p154e2.InterfaceC2024c
    /* JADX INFO: renamed from: x */
    public void mo2852x() {
    }

    @Override // p121Y1.InterfaceC1756q
    /* JADX INFO: renamed from: b */
    public void mo33b(InterfaceC1289a interfaceC1289a, Bitmap bitmap) {
    }
}
