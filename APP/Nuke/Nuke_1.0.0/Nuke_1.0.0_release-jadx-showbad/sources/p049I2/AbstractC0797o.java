package p049I2;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.window.BackEvent;
import com.bumptech.glide.AbstractC1922d;
import com.bumptech.glide.AbstractC1926h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.luckypray.dexkit.DexKitBridge;
import p000A.C0039U;
import p000A.C0075n;
import p002A1.InterfaceC0145r;
import p004A3.AbstractC0156a;
import p004A3.C0157b;
import p007B0.C0173F;
import p008B1.AbstractC0219g;
import p008B1.C0213a;
import p008B1.C0214b;
import p008B1.C0218f;
import p011B4.AbstractC0231b;
import p027E4.C0330q;
import p028F.C0352m;
import p030F1.C0437b;
import p041H0.C0551B;
import p041H0.C0587d;
import p041H0.C0589e;
import p041H0.C0591f;
import p041H0.InterfaceC0593g;
import p056K2.C0886l;
import p056K2.C0887m;
import p056K2.C0890p;
import p056K2.C0892r;
import p056K2.EnumC0880f;
import p056K2.InterfaceC0879e;
import p061L2.AbstractC0974n;
import p061L2.C0986z;
import p076P.AbstractC1085c0;
import p076P.AbstractC1089e0;
import p092S0.C1256I;
import p092S0.C1257J;
import p092S0.C1277o;
import p095T.AbstractC1385s;
import p095T.C1324L0;
import p095T.C1357e;
import p095T.C1371l;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1347Y;
import p095T.InterfaceC1353c;
import p095T.InterfaceC1373m;
import p095T.InterfaceC1378o0;
import p096T0.AbstractC1411k;
import p106V0.AbstractC1490d;
import p110W0.C1577b;
import p110W0.C1587l;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p118X3.C1711u;
import p119Y.C1727k;
import p125Z0.C1780a;
import p125Z0.C1781b;
import p127Z2.AbstractC1784a;
import p136b0.AbstractC1848j;
import p147d1.EnumC1960j;
import p149d3.AbstractC1976d;
import p149d3.C1975c;
import p153e1.C2009e;
import p153e1.C2018n;
import p153e1.C2019o;
import p153e1.C2020p;
import p153e1.InterfaceC2007c;
import p155e3.AbstractC2030a;
import p155e3.AbstractC2031b;
import p155e3.EnumC2032c;
import p159f1.AbstractC2096b;
import p159f1.InterfaceC2095a;
import p169h0.AbstractC2192a;
import p169h0.C2194c;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p204n0.C2684c;
import p208n4.C2706e;
import p208n4.C2709h;
import p211o0.AbstractC2767z;
import p232s.C3162i;
import p244u.AbstractC3255Y;
import p244u.AbstractC3261c;
import p244u.AbstractC3273i;
import p244u.AbstractC3287t;
import p244u.C3244M;
import p244u.C3256Z;
import p244u.C3289v;
import p245u0.C3309f;
import p250v.AbstractC3349a;
import p254v4.C3365l;
import p265x4.C3469o;
import p270y3.C3493a;
import p270y3.C3494b;
import p270y3.C3496d;
import p272z.AbstractC3507e;

/* JADX INFO: renamed from: I2.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0797o {

    /* JADX INFO: renamed from: a */
    public static volatile ExecutorService f2571a;

    /* JADX INFO: renamed from: b */
    public static C3309f f2572b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static final void m1373A(Spannable spannable, long j5, int i5, int i6) {
        if (j5 != 16) {
            spannable.setSpan(new ForegroundColorSpan(AbstractC2767z.m4952w(j5)), i5, i6, 33);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static final void m1374B(Spannable spannable, long j5, InterfaceC2007c interfaceC2007c, int i5, int i6) {
        long jM3709b = C2019o.m3709b(j5);
        if (C2020p.m3712a(jM3709b, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(AbstractC1784a.m3200N(interfaceC2007c.mo276e0(j5)), false), i5, i6, 33);
        } else if (C2020p.m3712a(jM3709b, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(C2019o.m3710c(j5)), i5, i6, 33);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static final void m1375C(Spannable spannable, C1781b c1781b, int i5, int i6) {
        if (c1781b != null) {
            ArrayList arrayList = new ArrayList(AbstractC0974n.m2029K(c1781b, 10));
            Iterator it = c1781b.f6090d.iterator();
            while (it.hasNext()) {
                arrayList.add(((C1780a) it.next()).f6088a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i5, i6, 33);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085 A[PHI: r8
  0x0085: PHI (r8v2 long) = (r8v0 long), (r8v1 long), (r8v1 long), (r8v1 long), (r8v1 long) binds: [B:31:0x0083, B:47:0x00b1, B:50:0x00b7, B:42:0x009d, B:36:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m1376D(long j5, EnumC2032c enumC2032c) {
        long j6;
        AbstractC1665j.m2985e(enumC2032c, "unit");
        EnumC2032c enumC2032c2 = EnumC2032c.NANOSECONDS;
        long jM3227m = AbstractC1784a.m3227m(4611686018426999999L, enumC2032c2, enumC2032c);
        if ((-jM3227m) <= j5 && j5 <= jM3227m) {
            long jM3227m2 = AbstractC1784a.m3227m(j5, enumC2032c, enumC2032c2);
            C1577b c1577b = AbstractC2030a.f6765d;
            long j7 = jM3227m2 << 1;
            int i5 = AbstractC2031b.f6768a;
            return j7;
        }
        EnumC2032c enumC2032c3 = EnumC2032c.MILLISECONDS;
        if (enumC2032c.compareTo(enumC2032c3) < 0) {
            return m1388m(AbstractC1926h.m3569l(AbstractC1784a.m3226l(j5, enumC2032c, enumC2032c3)));
        }
        long jSignum = Long.signum(j5);
        if (j5 < -9223372036854775807L) {
            j5 = -9223372036854775807L;
        }
        long jAbs = Math.abs(j5);
        AbstractC1665j.m2985e(enumC2032c, "unit");
        int iOrdinal = enumC2032c.ordinal();
        if (iOrdinal == 2) {
            j6 = 1;
        } else if (iOrdinal == 3) {
            j6 = 1000;
        } else if (iOrdinal == 4) {
            j6 = 60000;
        } else if (iOrdinal == 5) {
            j6 = 3600000;
        } else {
            if (iOrdinal != 6) {
                throw new IllegalStateException(("Wrong unit for millisMultiplier: " + enumC2032c).toString());
            }
            j6 = 86400000;
        }
        long j8 = 0;
        if (jAbs == 0) {
            jAbs = j8;
        } else {
            j8 = 4611686018427387903L;
            if (jAbs == 1) {
                if (j6 <= 4611686018427387903L) {
                    jAbs = j6;
                }
            } else if (j6 != 1) {
                int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(jAbs)) - Long.numberOfLeadingZeros(j6);
                if (iNumberOfLeadingZeros < 63) {
                    jAbs *= j6;
                } else if (iNumberOfLeadingZeros <= 63) {
                    jAbs *= j6;
                    if (jAbs > 4611686018427387903L) {
                    }
                }
            } else if (jAbs > 4611686018427387903L) {
            }
        }
        return m1388m(jAbs * jSignum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final C2009e m1377a(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f5 = context.getResources().getDisplayMetrics().density;
        InterfaceC2095a interfaceC2095aM3873a = AbstractC2096b.m3873a(f2);
        if (interfaceC2095aM3873a == null) {
            interfaceC2095aM3873a = new C2018n(f2);
        }
        return new C2009e(f5, f2, interfaceC2095aM3873a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m1378b(Boolean bool, Object obj, InterfaceC0145r interfaceC0145r, InterfaceC1601c interfaceC1601c, InterfaceC1373m interfaceC1373m, int i5) {
        int i6;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(696924721);
        if ((i5 & 6) == 0) {
            i6 = (c1383r.m2586h(bool) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c1383r.m2586h(obj) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= 128;
        }
        if ((i5 & 3072) == 0) {
            i6 |= c1383r.m2586h(interfaceC1601c) ? 2048 : 1024;
        }
        if (c1383r.m2560O(i6 & 1, (i6 & 1171) != 1170)) {
            c1383r.m2565T();
            if ((i5 & 1) == 0 || c1383r.m2606y()) {
                interfaceC0145r = (InterfaceC0145r) c1383r.m2590j(AbstractC0219g.f765a);
            } else {
                c1383r.m2563R();
            }
            int i7 = i6 & (-897);
            c1383r.m2598q();
            boolean zM2582f = c1383r.m2582f(bool) | c1383r.m2582f(obj) | c1383r.m2582f(interfaceC0145r);
            Object objM2558L = c1383r.m2558L();
            if (zM2582f || objM2558L == C1371l.f4833a) {
                objM2558L = new C0218f(interfaceC0145r.getLifecycle());
                c1383r.m2585g0(objM2558L);
            }
            m1379c(interfaceC0145r, (C0218f) objM2558L, interfaceC1601c, c1383r, (i7 >> 3) & 896);
        } else {
            c1383r.m2563R();
        }
        InterfaceC0145r interfaceC0145r2 = interfaceC0145r;
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0213a(bool, obj, interfaceC0145r2, interfaceC1601c, i5, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m1379c(InterfaceC0145r interfaceC0145r, C0218f c0218f, InterfaceC1601c interfaceC1601c, InterfaceC1373m interfaceC1373m, int i5) {
        int i6;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(228371534);
        if ((i5 & 6) == 0) {
            i6 = (c1383r.m2586h(interfaceC0145r) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i6 |= c1383r.m2586h(c0218f) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i6 |= c1383r.m2586h(interfaceC1601c) ? 256 : 128;
        }
        if (c1383r.m2560O(i6 & 1, (i6 & 147) != 146)) {
            boolean zM2586h = c1383r.m2586h(c0218f) | ((i6 & 896) == 256) | c1383r.m2586h(interfaceC0145r);
            Object objM2558L = c1383r.m2558L();
            if (zM2586h || objM2558L == C1371l.f4833a) {
                objM2558L = new C0075n(interfaceC0145r, c0218f, interfaceC1601c);
                c1383r.m2585g0(objM2558L);
            }
            AbstractC1385s.m2614d(interfaceC0145r, c0218f, (InterfaceC1601c) objM2558L, c1383r);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0214b(interfaceC0145r, c0218f, interfaceC1601c, i5, 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m1380d(List list, InterfaceC2207p interfaceC2207p, InterfaceC1373m interfaceC1373m, int i5) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-1726395527);
        if (c1383r.m2560O(i5 & 1, (i5 & 19) != 18)) {
            C0157b c0157b = (C0157b) c1383r.m2590j(AbstractC0156a.f563i);
            float f2 = 0;
            AbstractC1085c0.m2142a(AbstractC3261c.m5521h(interfaceC2207p.mo4021c(AbstractC3261c.f10087c), 230), AbstractC3507e.m5761a(8), c0157b.f575l, f2, f2, AbstractC1848j.m3314c(-1348046082, new C3494b(list, c0157b, 0), c1383r), c1383r, 12804096, 72);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0352m(i5, 16, list, interfaceC2207p);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final C0437b m1381e(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new C0437b(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final void m1382f(C3493a c3493a, InterfaceC2207p interfaceC2207p, InterfaceC1373m interfaceC1373m, int i5) {
        InterfaceC2207p interfaceC2207p2;
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(-776231868);
        int i6 = i5 | (c1383r.m2582f(c3493a) ? 4 : 2) | 48;
        if (c1383r.m2560O(i6 & 1, (i6 & 19) != 18)) {
            C0157b c0157b = (C0157b) c1383r.m2590j(AbstractC0156a.f563i);
            InterfaceC2207p interfaceC2207pM5529p = AbstractC3261c.m5529p(AbstractC3261c.f10087c, 18, 14);
            C3256Z c3256zM5504a = AbstractC3255Y.m5504a(AbstractC3273i.f10114e, C2194c.f7170n, c1383r, 54);
            int iHashCode = Long.hashCode(c1383r.f4882T);
            InterfaceC1378o0 interfaceC1378o0M2593l = c1383r.m2593l();
            InterfaceC2207p interfaceC2207pM4016c = AbstractC2192a.m4016c(c1383r, interfaceC2207pM5529p);
            InterfaceC0593g.f1909a.getClass();
            C0551B c0551b = C0591f.f1902b;
            c1383r.m2571Z();
            if (c1383r.f4881S) {
                c1383r.m2592k(c0551b);
            } else {
                c1383r.m2591j0();
            }
            C0589e c0589e = C0591f.f1905e;
            AbstractC1385s.m2635y(c1383r, c0589e, c3256zM5504a);
            C0589e c0589e2 = C0591f.f1904d;
            AbstractC1385s.m2635y(c1383r, c0589e2, interfaceC1378o0M2593l);
            Integer numValueOf = Integer.valueOf(iHashCode);
            C0589e c0589e3 = C0591f.f1906f;
            AbstractC1385s.m2627q(c1383r, numValueOf, c0589e3);
            C0587d c0587d = C0591f.f1907g;
            AbstractC1385s.m2631u(c1383r, c0587d);
            C0589e c0589e4 = C0591f.f1903c;
            AbstractC1385s.m2635y(c1383r, c0589e4, interfaceC2207pM4016c);
            if (1.0f <= 0.0d) {
                AbstractC3349a.m5598a("invalid weight; must be greater than zero");
            }
            C3244M c3244m = new C3244M(1.0f, true);
            C3289v c3289vM5564a = AbstractC3287t.m5564a(AbstractC3273i.m5549g(4), C2194c.f7171o, c1383r, 6);
            int iHashCode2 = Long.hashCode(c1383r.f4882T);
            InterfaceC1378o0 interfaceC1378o0M2593l2 = c1383r.m2593l();
            InterfaceC2207p interfaceC2207pM4016c2 = AbstractC2192a.m4016c(c1383r, c3244m);
            c1383r.m2571Z();
            if (c1383r.f4881S) {
                c1383r.m2592k(c0551b);
            } else {
                c1383r.m2591j0();
            }
            AbstractC1385s.m2635y(c1383r, c0589e, c3289vM5564a);
            AbstractC1385s.m2635y(c1383r, c0589e2, interfaceC1378o0M2593l2);
            AbstractC1385s.m2627q(c1383r, Integer.valueOf(iHashCode2), c0589e3);
            AbstractC1385s.m2631u(c1383r, c0587d);
            AbstractC1385s.m2635y(c1383r, c0589e4, interfaceC2207pM4016c2);
            AbstractC1089e0.m2146b(c3493a.f10890a, null, c0157b.f577n, AbstractC1926h.m3579v(16), C1587l.f5504h, null, AbstractC1926h.m3579v(0), null, 0L, 0, false, 0, 0, null, c1383r, 102260736, 0, 261802);
            AbstractC1089e0.m2146b(c3493a.f10891b, null, c0157b.f578o, AbstractC1926h.m3579v(13), null, null, AbstractC1926h.m3579v(0), null, AbstractC1926h.m3579v(18), 0, false, 0, 0, null, c1383r, 100687872, 48, 259818);
            c1383r = c1383r;
            c1383r.m2597p(true);
            AbstractC1085c0.m2142a(null, AbstractC3507e.m5761a(8), c0157b.f579p, 0.0f, 0.0f, AbstractC1848j.m3314c(-2015904125, new C3496d(c0157b, 0), c1383r), c1383r, 12582912, 121);
            c1383r.m2597p(true);
            interfaceC2207p2 = C2204m.f7185a;
        } else {
            c1383r.m2563R();
            interfaceC2207p2 = interfaceC2207p;
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0352m(i5, 17, c3493a, interfaceC2207p2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final long m1383g(long j5, long j6) {
        if (j5 != 4611686018427387903L && j5 != -4611686018427387903L) {
            return (j6 == 4611686018427387903L || j6 == -4611686018427387903L) ? j6 : AbstractC1926h.m3569l(j5 + j6);
        }
        if ((-4611686018427387903L >= j6 || j6 >= 4611686018427387903L) && (j6 ^ j5) < 0) {
            return 9223372036854759646L;
        }
        return j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m1384h(long j5, C2706e c2706e, int i5, ArrayList arrayList, int i6, int i7, ArrayList arrayList2) {
        int i8;
        int i9;
        ArrayList arrayList3;
        long j6;
        int i10;
        int i11 = i5;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i6 >= i7) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i12 = i6; i12 < i7; i12++) {
            if (((C2709h) arrayList4.get(i12)).mo4732a() < i11) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        C2709h c2709h = (C2709h) arrayList.get(i6);
        C2709h c2709h2 = (C2709h) arrayList4.get(i7 - 1);
        if (i11 == c2709h.mo4732a()) {
            int iIntValue = ((Number) arrayList5.get(i6)).intValue();
            int i13 = i6 + 1;
            C2709h c2709h3 = (C2709h) arrayList4.get(i13);
            i8 = i13;
            i9 = iIntValue;
            c2709h = c2709h3;
        } else {
            i8 = i6;
            i9 = -1;
        }
        if (c2709h.mo4735d(i11) == c2709h2.mo4735d(i11)) {
            int iMin = Math.min(c2709h.mo4732a(), c2709h2.mo4732a());
            int i14 = 0;
            for (int i15 = i11; i15 < iMin && c2709h.mo4735d(i15) == c2709h2.mo4735d(i15); i15++) {
                i14++;
            }
            long j7 = 4;
            long j8 = (c2706e.f8629e / j7) + j5 + ((long) 2) + ((long) i14) + 1;
            c2706e.m4708J(-i14);
            c2706e.m4708J(i9);
            int i16 = i11 + i14;
            while (i11 < i16) {
                c2706e.m4708J(c2709h.mo4735d(i11) & 255);
                i11++;
            }
            if (i8 + 1 == i7) {
                if (i16 != ((C2709h) arrayList4.get(i8)).mo4732a()) {
                    throw new IllegalStateException("Check failed.");
                }
                c2706e.m4708J(((Number) arrayList5.get(i8)).intValue());
                return;
            } else {
                C2706e c2706e2 = new C2706e();
                c2706e.m4708J(((int) ((c2706e2.f8629e / j7) + j8)) * (-1));
                m1384h(j8, c2706e2, i16, arrayList4, i8, i7, arrayList5);
                c2706e.m4704F(c2706e2);
                return;
            }
        }
        int i17 = 1;
        for (int i18 = i8 + 1; i18 < i7; i18++) {
            if (((C2709h) arrayList4.get(i18 - 1)).mo4735d(i11) != ((C2709h) arrayList4.get(i18)).mo4735d(i11)) {
                i17++;
            }
        }
        long j9 = 4;
        long j10 = (c2706e.f8629e / j9) + j5 + ((long) 2) + ((long) (i17 * 2));
        c2706e.m4708J(i17);
        c2706e.m4708J(i9);
        for (int i19 = i8; i19 < i7; i19++) {
            int iMo4735d = ((C2709h) arrayList4.get(i19)).mo4735d(i11);
            if (i19 == i8 || iMo4735d != ((C2709h) arrayList4.get(i19 - 1)).mo4735d(i11)) {
                c2706e.m4708J(iMo4735d & 255);
            }
        }
        C2706e c2706e3 = new C2706e();
        int i20 = i8;
        while (i20 < i7) {
            byte bMo4735d = ((C2709h) arrayList4.get(i20)).mo4735d(i11);
            int i21 = i20 + 1;
            int i22 = i21;
            while (true) {
                if (i22 >= i7) {
                    i22 = i7;
                    break;
                } else if (bMo4735d != ((C2709h) arrayList4.get(i22)).mo4735d(i11)) {
                    break;
                } else {
                    i22++;
                }
            }
            if (i21 == i22 && i11 + 1 == ((C2709h) arrayList4.get(i20)).mo4732a()) {
                c2706e.m4708J(((Number) arrayList5.get(i20)).intValue());
                arrayList3 = arrayList5;
                j6 = j10;
                i10 = i22;
            } else {
                c2706e.m4708J(((int) ((c2706e3.f8629e / j9) + j10)) * (-1));
                arrayList3 = arrayList5;
                j6 = j10;
                i10 = i22;
                m1384h(j6, c2706e3, i11 + 1, arrayList, i20, i10, arrayList3);
                arrayList4 = arrayList;
            }
            j10 = j6;
            i20 = i10;
            arrayList5 = arrayList3;
        }
        c2706e.m4704F(c2706e3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final InterfaceC1347Y m1385j(C3162i c3162i, InterfaceC1373m interfaceC1373m) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        Object objM2558L = c1383r.m2558L();
        C1357e c1357e = C1371l.f4833a;
        if (objM2558L == c1357e) {
            objM2558L = AbstractC1385s.m2629s(Boolean.FALSE);
            c1383r.m2585g0(objM2558L);
        }
        InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) objM2558L;
        Object objM2558L2 = c1383r.m2558L();
        if (objM2558L2 == c1357e) {
            objM2558L2 = new C0039U(c3162i, interfaceC1347Y, null, 23);
            c1383r.m2585g0(objM2558L2);
        }
        AbstractC1385s.m2615e(c1383r, (InterfaceC1603e) objM2558L2, c3162i);
        return interfaceC1347Y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static int m1386k(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final boolean m1387l(C2684c c2684c, float f2, float f5) {
        float f6 = c2684c.f8558a;
        if (f2 > c2684c.f8560c || f6 > f2) {
            return false;
        }
        return f5 <= c2684c.f8561d && c2684c.f8559b <= f5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final long m1388m(long j5) {
        long j6 = (j5 << 1) + 1;
        AbstractC2030a.f6765d.getClass();
        int i5 = AbstractC2031b.f6768a;
        return j6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static C3365l m1389n(DexKitBridge dexKitBridge, C3469o c3469o) {
        AbstractC1665j.m2985e(dexKitBridge, "bridge");
        int iM4685b = c3469o.m4685b(4);
        int i5 = iM4685b != 0 ? c3469o.f8592b.getInt(iM4685b + c3469o.f8591a) : 0;
        int iM4685b2 = c3469o.m4685b(6);
        int i6 = iM4685b2 != 0 ? c3469o.f8592b.getInt(iM4685b2 + c3469o.f8591a) : 0;
        int iM4685b3 = c3469o.m4685b(8);
        int i7 = iM4685b3 != 0 ? c3469o.f8592b.getInt(iM4685b3 + c3469o.f8591a) : 0;
        int iM4685b4 = c3469o.m4685b(10);
        int i8 = iM4685b4 != 0 ? c3469o.f8592b.getInt(iM4685b4 + c3469o.f8591a) : 0;
        int iM4685b5 = c3469o.m4685b(12);
        String strM4687d = iM4685b5 != 0 ? c3469o.m4687d(iM4685b5 + c3469o.f8591a) : null;
        AbstractC1665j.m2982b(strM4687d);
        int iM4685b6 = c3469o.m4685b(14);
        return new C3365l(dexKitBridge, i5, i6, i7, i8, strM4687d, iM4685b6 != 0 ? c3469o.f8592b.getInt(iM4685b6 + c3469o.f8591a) : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static C1711u m1390o(String str) {
        AbstractC1665j.m2985e(str, "<this>");
        C0173F c0173fM2994a = C1711u.f5877d.m2994a(str, 0);
        if (c0173fM2994a == null) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        if (((C0986z) c0173fM2994a.f615h) == null) {
            c0173fM2994a.f615h = new C0986z(c0173fM2994a);
        }
        C0986z c0986z = (C0986z) c0173fM2994a.f615h;
        AbstractC1665j.m2982b(c0986z);
        String str2 = (String) c0986z.get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        AbstractC1665j.m2984d(lowerCase, "toLowerCase(...)");
        if (((C0986z) c0173fM2994a.f615h) == null) {
            c0173fM2994a.f615h = new C0986z(c0173fM2994a);
        }
        C0986z c0986z2 = (C0986z) c0173fM2994a.f615h;
        AbstractC1665j.m2982b(c0986z2);
        String lowerCase2 = ((String) c0986z2.get(2)).toLowerCase(locale);
        AbstractC1665j.m2984d(lowerCase2, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        int i5 = c0173fM2994a.m253h().f6141e;
        while (true) {
            int i6 = i5 + 1;
            if (i6 >= str.length()) {
                return new C1711u(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            C0173F c0173fM2994a2 = C1711u.f5878e.m2994a(str, i6);
            if (c0173fM2994a2 == null) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(i6);
                AbstractC1665j.m2984d(strSubstring, "substring(...)");
                sb.append(strSubstring);
                sb.append("\" for: \"");
                throw new IllegalArgumentException(AbstractC0231b.m402m(sb, str, '\"').toString());
            }
            C1727k c1727k = (C1727k) c0173fM2994a2.f614g;
            C1975c c1975cM3059b = c1727k.m3059b(1);
            String str3 = c1975cM3059b != null ? c1975cM3059b.f6672a : null;
            if (str3 == null) {
                i5 = c0173fM2994a2.m253h().f6141e;
            } else {
                C1975c c1975cM3059b2 = c1727k.m3059b(2);
                String strSubstring2 = c1975cM3059b2 != null ? c1975cM3059b2.f6672a : null;
                if (strSubstring2 == null) {
                    C1975c c1975cM3059b3 = c1727k.m3059b(3);
                    AbstractC1665j.m2982b(c1975cM3059b3);
                    strSubstring2 = c1975cM3059b3.f6672a;
                } else if (strSubstring2.length() > 0 && AbstractC1926h.m3572o(strSubstring2.charAt(0), '\'', false) && strSubstring2.length() > 0 && AbstractC1926h.m3572o(strSubstring2.charAt(AbstractC1976d.m3632Z(strSubstring2)), '\'', false) && strSubstring2.length() > 2) {
                    strSubstring2 = strSubstring2.substring(1, strSubstring2.length() - 1);
                    AbstractC1665j.m2984d(strSubstring2, "substring(...)");
                }
                arrayList.add(str3);
                arrayList.add(strSubstring2);
                i5 = c0173fM2994a2.m253h().f6141e;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final float m1391p(Layout layout, int i5, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i5);
        ThreadLocal threadLocal = AbstractC1411k.f5056a;
        if (layout.getEllipsisCount(i5) <= 0 || layout.getParagraphDirection(i5) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i5) + layout.getLineStart(i5)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i5);
        if ((paragraphAlignment == null ? -1 : AbstractC1490d.f5200a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final float m1392q(Layout layout, int i5, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = AbstractC1411k.f5056a;
        if (layout.getEllipsisCount(i5) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i5) != -1 || layout.getWidth() >= layout.getLineRight(i5)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i5) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i5) + layout.getLineStart(i5)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i5);
        if ((paragraphAlignment != null ? AbstractC1490d.f5200a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i5);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i5);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static Executor m1393r() {
        if (f2571a == null) {
            synchronized (AbstractC0797o.class) {
                try {
                    if (f2571a == null) {
                        f2571a = Executors.newCachedThreadPool();
                    }
                } finally {
                }
            }
        }
        return f2571a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final EnumC1960j m1394s(C1257J c1257j, int i5) {
        C1256I c1256i = c1257j.f4526a;
        C1277o c1277o = c1257j.f4527b;
        if (c1256i.f4516a.f4563e.length() != 0) {
            int iM2363d = c1277o.m2363d(i5);
            if ((i5 != 0 && iM2363d == c1277o.m2363d(i5 - 1)) || (i5 != c1256i.f4516a.f4563e.length() && iM2363d == c1277o.m2363d(i5 + 1))) {
                return c1257j.m2324a(i5);
            }
        }
        return c1257j.m2330g(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static InterfaceC0879e m1395t(EnumC0880f enumC0880f, InterfaceC1599a interfaceC1599a) {
        C0890p c0890p = C0890p.f2779a;
        int iOrdinal = enumC0880f.ordinal();
        if (iOrdinal == 0) {
            return new C0887m(interfaceC1599a);
        }
        if (iOrdinal == 1) {
            C0886l c0886l = new C0886l();
            c0886l.f2773d = interfaceC1599a;
            c0886l.f2774e = c0890p;
            return c0886l;
        }
        if (iOrdinal != 2) {
            throw new C0330q();
        }
        C0892r c0892r = new C0892r();
        c0892r.f2781d = interfaceC1599a;
        c0892r.f2782e = c0890p;
        return c0892r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static C0887m m1396u(InterfaceC1599a interfaceC1599a) {
        AbstractC1665j.m2985e(interfaceC1599a, "initializer");
        return new C0887m(interfaceC1599a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static void m1397v(SharedPreferencesC0796n sharedPreferencesC0796n, C0793k c0793k, byte b2, String str, int i5) {
        HashMap map = sharedPreferencesC0796n.f2553f;
        if (b2 == 1) {
            byte[] bArr = (byte[]) c0793k.f2539g;
            int i6 = c0793k.f2537e;
            c0793k.f2537e = i6 + 1;
            map.put(str, new C0785c(i5, bArr[i6] == 1));
            return;
        }
        if (b2 == 2) {
            map.put(str, new C0788f(i5, c0793k.m1344h()));
            return;
        }
        if (b2 == 3) {
            map.put(str, new C0787e(Float.intBitsToFloat(c0793k.m1344h()), i5));
            return;
        }
        if (b2 == 4) {
            long jM1345i = c0793k.m1345i(c0793k.f2537e);
            c0793k.f2537e += 8;
            map.put(str, new C0789g(jM1345i, i5));
            return;
        }
        long jM1345i2 = c0793k.m1345i(c0793k.f2537e);
        c0793k.f2537e += 8;
        double dLongBitsToDouble = Double.longBitsToDouble(jM1345i2);
        C0786d c0786d = new C0786d();
        c0786d.f2526a = i5;
        c0786d.f2528b = dLongBitsToDouble;
        map.put(str, c0786d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static void m1398w(SharedPreferencesC0796n sharedPreferencesC0796n, C0793k c0793k, byte b2, String str, int i5, int i6, byte b5) throws Exception {
        Object objM1347k;
        byte b6 = b2;
        HashMap map = sharedPreferencesC0796n.f2553f;
        boolean z5 = b6 == 9 || b6 == 10 || b6 == 11;
        int iM1344h = z5 ? c0793k.m1344h() : c0793k.m1346j() & 65535;
        int i7 = z5 ? 4 : 2;
        boolean z6 = (b5 & 64) != 0;
        if (z6 && iM1344h != 32) {
            throw new IllegalStateException("name size not match");
        }
        switch (b6) {
            case 9:
                b6 = 6;
                break;
            case 10:
                b6 = 7;
                break;
            case 11:
                b6 = 8;
                break;
        }
        if (b6 == 6) {
            map.put(str, new C0791i(i6, i5 + i7, z6 ? c0793k.m1347k(iM1344h) : c0793k.m1347k(iM1344h), iM1344h, z6));
            return;
        }
        if (b6 == 7) {
            if (z6) {
                objM1347k = c0793k.m1347k(iM1344h);
            } else {
                c0793k.getClass();
                objM1347k = new byte[iM1344h];
                System.arraycopy((byte[]) c0793k.f2539g, c0793k.f2537e, objM1347k, 0, iM1344h);
                c0793k.f2537e += iM1344h;
            }
            map.put(str, new C0783a(i6, i5 + i7, objM1347k, iM1344h, z6));
            return;
        }
        if (z6) {
            map.put(str, new C0790h(i6, i5 + i7, c0793k.m1347k(iM1344h), iM1344h, true));
            return;
        }
        C0793k c0793k2 = sharedPreferencesC0796n.f2555h;
        byte[] bArr = (byte[]) c0793k2.f2539g;
        int i8 = c0793k2.f2537e;
        c0793k2.f2537e = i8 + 1;
        int i9 = bArr[i8] & 255;
        String strM1347k = c0793k2.m1347k(i9);
        C0800r c0800r = (C0800r) sharedPreferencesC0796n.f2550c.get(strM1347k);
        int i10 = iM1344h - (i9 + 1);
        if (i10 < 0) {
            throw new Exception("parse dara failed");
        }
        if (c0800r != null) {
            try {
                map.put(str, new C0790h(i6, i5 + 2, c0800r.m1404a((byte[]) c0793k2.f2539g, c0793k2.f2537e, i10), iM1344h, false));
            } catch (Exception e5) {
                Log.e("FastKV", sharedPreferencesC0796n.f2549b, e5);
            }
        } else {
            AbstractC1922d.m3430k(sharedPreferencesC0796n, "object with tag: " + strM1347k + " without encoder");
        }
        c0793k.f2537e = i5 + i7 + iM1344h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a3, code lost:
    
        throw new java.lang.Exception("parse dara failed");
     */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m1399x(SharedPreferencesC0796n sharedPreferencesC0796n, boolean z5) {
        int iM1344h;
        SharedPreferencesC0796n sharedPreferencesC0796n2;
        if (z5) {
            AbstractC1922d.m3430k(sharedPreferencesC0796n, "miss cipher");
            return false;
        }
        C0793k c0793k = sharedPreferencesC0796n.f2555h;
        String str = sharedPreferencesC0796n.f2549b;
        c0793k.f2537e = 12;
        while (true) {
            try {
                int i5 = c0793k.f2537e;
                int i6 = sharedPreferencesC0796n.f2551d;
                boolean z6 = true;
                if (i5 >= i6) {
                    if (i5 == i6) {
                        return true;
                    }
                    Log.e("FastKV", str, new Exception("parse dara failed"));
                    return false;
                }
                byte[] bArr = (byte[]) c0793k.f2539g;
                int i7 = i5 + 1;
                c0793k.f2537e = i7;
                byte b2 = bArr[i5];
                byte b5 = (byte) (b2 & 63);
                if (b5 < 1 || b5 > 11) {
                    break;
                }
                int i8 = i5 + 2;
                c0793k.f2537e = i8;
                int i9 = bArr[i7] & 255;
                if (i9 == 0) {
                    throw new IllegalStateException("invalid key size");
                }
                if (b2 < 0) {
                    c0793k.f2537e = i8 + i9;
                    if (b5 <= 5) {
                        iM1344h = SharedPreferencesC0796n.f2546y[b5];
                    } else {
                        if (b5 != 9 && b5 != 10 && b5 != 11) {
                            z6 = false;
                        }
                        iM1344h = z6 ? c0793k.m1344h() : c0793k.m1346j() & 65535;
                    }
                    int i10 = c0793k.f2537e + iM1344h;
                    c0793k.f2537e = i10;
                    sharedPreferencesC0796n.f2560m = (i10 - i5) + sharedPreferencesC0796n.f2560m;
                    ArrayList arrayList = sharedPreferencesC0796n.f2561n;
                    C0799q c0799q = new C0799q();
                    c0799q.f2575d = i5;
                    c0799q.f2576e = i10;
                    arrayList.add(c0799q);
                } else {
                    String strM1347k = c0793k.m1347k(i9);
                    int i11 = c0793k.f2537e;
                    if (b5 <= 5) {
                        m1397v(sharedPreferencesC0796n, c0793k, b5, strM1347k, i11);
                        sharedPreferencesC0796n2 = sharedPreferencesC0796n;
                    } else {
                        sharedPreferencesC0796n2 = sharedPreferencesC0796n;
                        m1398w(sharedPreferencesC0796n2, c0793k, b5, strM1347k, i11, i5, b2);
                    }
                    sharedPreferencesC0796n = sharedPreferencesC0796n2;
                }
            } catch (Exception e5) {
                Log.e("FastKV", str, e5);
                return false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final void m1400y(C1324L0 c1324l0, InterfaceC1353c interfaceC1353c, int i5) {
        while (true) {
            int i6 = c1324l0.f4744v;
            if (i5 > i6 && i5 < c1324l0.f4743u) {
                return;
            }
            if (i6 == 0 && i5 == 0) {
                return;
            }
            c1324l0.m2462M();
            if (c1324l0.m2494y(c1324l0.f4744v)) {
                interfaceC1353c.mo788n();
            }
            c1324l0.m2479j();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static final float m1401z(long j5, float f2, InterfaceC2007c interfaceC2007c) {
        float fM3710c;
        long jM3709b = C2019o.m3709b(j5);
        if (C2020p.m3712a(jM3709b, 4294967296L)) {
            if (interfaceC2007c.mo282p() <= 1.05d) {
                return interfaceC2007c.mo276e0(j5);
            }
            fM3710c = C2019o.m3710c(j5) / C2019o.m3710c(interfaceC2007c.mo280k0(f2));
        } else {
            if (!C2020p.m3712a(jM3709b, 8589934592L)) {
                return Float.NaN;
            }
            fM3710c = C2019o.m3710c(j5);
        }
        return fM3710c * f2;
    }

    /* JADX INFO: renamed from: i */
    public abstract List mo1402i(String str, List list);
}
