package p142j9;

import gb.AbstractC2706r0;
import gb.EnumC2691m2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p024b9.AbstractC1052o0;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1066v0;
import p024b9.C1038h0;
import p067eb.InterfaceC2096s;
import p067eb.InterfaceC2098t;
import p098g9.EnumC2563q;
import p098g9.InterfaceC2549c;
import p098g9.InterfaceC2557k;
import p098g9.InterfaceC2561o;
import p111ha.C2931r;
import p111ha.InterfaceC2937x;
import p127i9.C3364b;
import p142j9.AbstractC3659b3;
import p172l8.C4700i0;
import p185m8.AbstractC5116y;
import p215oc.C5729x;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6018l1;
import p229p9.InterfaceC6019m;
import p298u9.C8571f;
import p372z8.AbstractC9886a;

/* JADX INFO: renamed from: j9.x2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3759x2 implements InterfaceC2561o, InterfaceC3765z0 {

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ InterfaceC2557k[] f10344t = {AbstractC1052o0.m3814i(new C1038h0(C3759x2.class, "upperBounds", "getUpperBounds()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: q */
    public final InterfaceC6018l1 f10345q;

    /* JADX INFO: renamed from: r */
    public final AbstractC3659b3.a f10346r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC3763y2 f10347s;

    /* JADX INFO: renamed from: j9.x2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10348a;

        static {
            int[] iArr = new int[EnumC2691m2.values().length];
            try {
                iArr[EnumC2691m2.f7042u.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2691m2.f7043v.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2691m2.f7044w.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10348a = iArr;
        }
    }

    public C3759x2(InterfaceC3763y2 interfaceC3763y2, InterfaceC6018l1 interfaceC6018l1) {
        C3761y0 c3761y0M13903e;
        Object objMo12663M0;
        interfaceC6018l1.getClass();
        this.f10345q = interfaceC6018l1;
        this.f10346r = AbstractC3659b3.m13645b(new C3755w2(this));
        if (interfaceC3763y2 == null) {
            InterfaceC6019m interfaceC6019mMo7443b = mo13900a().mo7443b();
            interfaceC6019mMo7443b.getClass();
            if (interfaceC6019mMo7443b instanceof InterfaceC5995e) {
                objMo12663M0 = m13903e((InterfaceC5995e) interfaceC6019mMo7443b);
            } else {
                if (!(interfaceC6019mMo7443b instanceof InterfaceC5986b)) {
                    C3364b.m12576a("Unknown type parameter container: ", interfaceC6019mMo7443b);
                    throw null;
                }
                InterfaceC6019m interfaceC6019mMo7443b2 = ((InterfaceC5986b) interfaceC6019mMo7443b).mo7443b();
                interfaceC6019mMo7443b2.getClass();
                if (interfaceC6019mMo7443b2 instanceof InterfaceC5995e) {
                    c3761y0M13903e = m13903e((InterfaceC5995e) interfaceC6019mMo7443b2);
                } else {
                    InterfaceC2098t interfaceC2098t = interfaceC6019mMo7443b instanceof InterfaceC2098t ? (InterfaceC2098t) interfaceC6019mMo7443b : null;
                    if (interfaceC2098t == null) {
                        C3364b.m12576a("Non-class callable descriptor must be deserialized: ", interfaceC6019mMo7443b);
                        throw null;
                    }
                    InterfaceC2549c interfaceC2549cM38370e = AbstractC9886a.m38370e(m13901c(interfaceC2098t));
                    interfaceC2549cM38370e.getClass();
                    c3761y0M13903e = (C3761y0) interfaceC2549cM38370e;
                }
                objMo12663M0 = interfaceC6019mMo7443b.mo12663M0(new C3695j(c3761y0M13903e), C4700i0.f13910a);
            }
            interfaceC3763y2 = (InterfaceC3763y2) objMo12663M0;
        }
        this.f10347s = interfaceC3763y2;
    }

    /* JADX INFO: renamed from: f */
    public static final List m13899f(C3759x2 c3759x2) {
        List upperBounds = c3759x2.mo13900a().getUpperBounds();
        upperBounds.getClass();
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(new C3751v2((AbstractC2706r0) it.next(), null, 2, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final Class m13901c(InterfaceC2098t interfaceC2098t) {
        Class clsM32985e;
        InterfaceC2096s interfaceC2096sMo7421i0 = interfaceC2098t.mo7421i0();
        C2931r c2931r = interfaceC2096sMo7421i0 instanceof C2931r ? (C2931r) interfaceC2096sMo7421i0 : null;
        InterfaceC2937x interfaceC2937xM10693g = c2931r != null ? c2931r.m10693g() : null;
        C8571f c8571f = interfaceC2937xM10693g instanceof C8571f ? (C8571f) interfaceC2937xM10693g : null;
        if (c8571f != null && (clsM32985e = c8571f.m32985e()) != null) {
            return clsM32985e;
        }
        C3364b.m12576a("Container of deserialized member is not resolved: ", interfaceC2098t);
        return null;
    }

    @Override // p142j9.InterfaceC3765z0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC6018l1 mo13900a() {
        return this.f10345q;
    }

    /* JADX INFO: renamed from: e */
    public final C3761y0 m13903e(InterfaceC5995e interfaceC5995e) {
        Class clsM13821r = AbstractC3714m3.m13821r(interfaceC5995e);
        C3761y0 c3761y0 = (C3761y0) (clsM13821r != null ? AbstractC9886a.m38370e(clsM13821r) : null);
        if (c3761y0 != null) {
            return c3761y0;
        }
        C3728q.m13860a("Type parameter container is not resolved: ", interfaceC5995e.mo7443b());
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3759x2)) {
            return false;
        }
        C3759x2 c3759x2 = (C3759x2) obj;
        return AbstractC1061t.m3842c(this.f10347s, c3759x2.f10347s) && AbstractC1061t.m3842c(getName(), c3759x2.getName());
    }

    @Override // p098g9.InterfaceC2561o
    public String getName() {
        String strM23030c = mo13900a().getName().m23030c();
        strM23030c.getClass();
        return strM23030c;
    }

    @Override // p098g9.InterfaceC2561o
    public List getUpperBounds() {
        Object objM13649c = this.f10346r.m13649c(this, f10344t[0]);
        objM13649c.getClass();
        return (List) objM13649c;
    }

    public int hashCode() {
        return (this.f10347s.hashCode() * 31) + getName().hashCode();
    }

    @Override // p098g9.InterfaceC2561o
    /* JADX INFO: renamed from: s */
    public EnumC2563q mo9081s() {
        int i10 = a.f10348a[mo13900a().mo23995s().ordinal()];
        if (i10 == 1) {
            return EnumC2563q.f6823q;
        }
        if (i10 == 2) {
            return EnumC2563q.f6824r;
        }
        if (i10 == 3) {
            return EnumC2563q.f6825s;
        }
        C5729x.m23182a();
        return null;
    }

    public String toString() {
        return AbstractC1066v0.f3216q.m3873a(this);
    }
}
