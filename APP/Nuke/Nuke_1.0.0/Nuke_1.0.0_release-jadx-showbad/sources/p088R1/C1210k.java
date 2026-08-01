package p088R1;

import android.util.Log;
import com.bumptech.glide.C1929k;
import com.bumptech.glide.load.data.InterfaceC1936f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import me.dartcv.nuke.BuildConfig;
import p000A.C0072l0;
import p013C0.C0236c;
import p042H1.AbstractC0636d;
import p078P1.C1147i;
import p078P1.InterfaceC1144f;
import p078P1.InterfaceC1149k;
import p078P1.InterfaceC1150l;
import p078P1.InterfaceC1151m;
import p107V1.C1517p;
import p148d2.InterfaceC1970a;
import p195l2.AbstractC2503g;
import p223q1.InterfaceC2909c;

/* JADX INFO: renamed from: R1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1210k {

    /* JADX INFO: renamed from: a */
    public final Class f4015a;

    /* JADX INFO: renamed from: b */
    public final List f4016b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1970a f4017c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2909c f4018d;

    /* JADX INFO: renamed from: e */
    public final String f4019e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1210k(Class cls, Class cls2, Class cls3, List list, InterfaceC1970a interfaceC1970a, InterfaceC2909c interfaceC2909c) {
        this.f4015a = cls;
        this.f4016b = list;
        this.f4017c = interfaceC1970a;
        this.f4018d = interfaceC2909c;
        this.f4019e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final InterfaceC1194D m2285a(int i5, int i6, C0236c c0236c, C1147i c1147i, InterfaceC1936f interfaceC1936f) {
        InterfaceC1194D interfaceC1194DMo2204a;
        InterfaceC1151m interfaceC1151m;
        int iMo39h;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Object c1204e;
        InterfaceC2909c interfaceC2909c = this.f4018d;
        List list = (List) interfaceC2909c.mo99c();
        AbstractC2503g.m4445c(list, "Argument must not be null");
        try {
            InterfaceC1194D interfaceC1194DM2286b = m2286b(interfaceC1936f, i5, i6, c1147i, list);
            interfaceC2909c.mo97a(list);
            RunnableC1209j runnableC1209j = (RunnableC1209j) c0236c.f794f;
            int i7 = c0236c.f793e;
            C1207h c1207h = runnableC1209j.f3992d;
            Class<?> cls = interfaceC1194DM2286b.get().getClass();
            InterfaceC1150l interfaceC1150lM3028g = null;
            if (i7 != 4) {
                InterfaceC1151m interfaceC1151mM2270e = c1207h.m2270e(cls);
                interfaceC1151m = interfaceC1151mM2270e;
                interfaceC1194DMo2204a = interfaceC1151mM2270e.mo2204a(runnableC1209j.f3999k, interfaceC1194DM2286b, runnableC1209j.f4003o, runnableC1209j.f4004p);
            } else {
                interfaceC1194DMo2204a = interfaceC1194DM2286b;
                interfaceC1151m = null;
            }
            if (!interfaceC1194DM2286b.equals(interfaceC1194DMo2204a)) {
                interfaceC1194DM2286b.mo2256e();
            }
            if (c1207h.f3962c.m3586a().f6555d.m3028g(interfaceC1194DMo2204a.mo2255d()) != null) {
                interfaceC1150lM3028g = c1207h.f3962c.m3586a().f6555d.m3028g(interfaceC1194DMo2204a.mo2255d());
                if (interfaceC1150lM3028g == null) {
                    throw new C1929k(interfaceC1194DMo2204a.mo2255d());
                }
                iMo39h = interfaceC1150lM3028g.mo39h(runnableC1209j.f4006r);
            } else {
                iMo39h = 3;
            }
            InterfaceC1150l interfaceC1150l = interfaceC1150lM3028g;
            InterfaceC1144f interfaceC1144f = runnableC1209j.f4014z;
            ArrayList arrayListM2267b = c1207h.m2267b();
            int size = arrayListM2267b.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    z5 = false;
                    break;
                }
                if (((C1517p) arrayListM2267b.get(i8)).f5269a.equals(interfaceC1144f)) {
                    z5 = true;
                    break;
                }
                i8++;
            }
            switch (runnableC1209j.f4005q.f4023a) {
                default:
                    z6 = true;
                    if (((z5 || i7 != 3) && i7 != 1) || iMo39h != 2) {
                    }
                case 0:
                case BuildConfig.VERSION_CODE /* 1 */:
                    z6 = false;
                    break;
            }
            if (z6) {
                if (interfaceC1150l == null) {
                    throw new C1929k(interfaceC1194DMo2204a.get().getClass());
                }
                int iM1088a = AbstractC0636d.m1088a(iMo39h);
                if (iM1088a == 0) {
                    z7 = false;
                    z8 = true;
                    c1204e = new C1204e(runnableC1209j.f4014z, runnableC1209j.f4000l);
                } else {
                    if (iM1088a != 1) {
                        throw new IllegalArgumentException("Unknown strategy: ".concat(iMo39h != 1 ? iMo39h != 2 ? iMo39h != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE"));
                    }
                    z7 = false;
                    z8 = true;
                    c1204e = new C1196F(c1207h.f3962c.f6537a, runnableC1209j.f4014z, runnableC1209j.f4000l, runnableC1209j.f4003o, runnableC1209j.f4004p, interfaceC1151m, cls, runnableC1209j.f4006r);
                }
                C1193C c1193c = (C1193C) C1193C.f3913h.mo99c();
                c1193c.f3917g = z7;
                c1193c.f3916f = z8;
                c1193c.f3915e = interfaceC1194DMo2204a;
                C0072l0 c0072l0 = runnableC1209j.f3997i;
                c0072l0.f307e = c1204e;
                c0072l0.f308f = interfaceC1150l;
                c0072l0.f309g = c1193c;
                interfaceC1194DMo2204a = c1193c;
            }
            return this.f4017c.mo98b(interfaceC1194DMo2204a, c1147i);
        } catch (Throwable th) {
            interfaceC2909c.mo97a(list);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final InterfaceC1194D m2286b(InterfaceC1936f interfaceC1936f, int i5, int i6, C1147i c1147i, List list) throws C1224y {
        List list2 = this.f4016b;
        int size = list2.size();
        InterfaceC1194D interfaceC1194DMo2202a = null;
        for (int i7 = 0; i7 < size; i7++) {
            InterfaceC1149k interfaceC1149k = (InterfaceC1149k) list2.get(i7);
            try {
                if (interfaceC1149k.mo2203b(interfaceC1936f.mo3102c(), c1147i)) {
                    interfaceC1194DMo2202a = interfaceC1149k.mo2202a(interfaceC1936f.mo3102c(), i5, i6, c1147i);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e5) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC1149k, e5);
                }
                list.add(e5);
            }
            if (interfaceC1194DMo2202a != null) {
                break;
            }
        }
        if (interfaceC1194DMo2202a != null) {
            return interfaceC1194DMo2202a;
        }
        throw new C1224y(this.f4019e, new ArrayList(list));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DecodePath{ dataClass=" + this.f4015a + ", decoders=" + this.f4016b + ", transcoder=" + this.f4017c + '}';
    }
}
