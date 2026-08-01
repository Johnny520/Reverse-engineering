package androidx.compose.runtime;

import p010a9.InterfaceC0188p;
import p150k1.AbstractC3913f;
import p172l8.C4700i0;

/* JADX INFO: renamed from: androidx.compose.runtime.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0468c0 {

    /* JADX INFO: renamed from: a */
    public static int f1309a = AbstractC3913f.f11375a.m15594a();

    /* JADX INFO: renamed from: b */
    public static final Object f1310b = new C0582s2("provider");

    /* JADX INFO: renamed from: c */
    public static final Object f1311c = new C0582s2("provider");

    /* JADX INFO: renamed from: d */
    public static final Object f1312d = new C0582s2("compositionLocalMap");

    /* JADX INFO: renamed from: e */
    public static final Object f1313e = new C0582s2("providerValues");

    /* JADX INFO: renamed from: f */
    public static final Object f1314f = new C0582s2("providers");

    /* JADX INFO: renamed from: g */
    public static final Object f1315g = new C0582s2("reference");

    /* JADX INFO: renamed from: a */
    public static C4700i0 m1547a(InterfaceC0465b4 interfaceC0465b4, int i10, Object obj) {
        if (obj instanceof InterfaceC0544n) {
            interfaceC0465b4.mo1541e((InterfaceC0544n) obj);
        }
        if (obj instanceof C0479d4) {
            interfaceC0465b4.mo1539c((C0479d4) obj);
        }
        if (obj instanceof C0534l3) {
            ((C0534l3) obj).m1850A();
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static final void m1548b(String str) {
        throw new C0558p("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    /* JADX INFO: renamed from: c */
    public static final Void m1549c(String str) {
        throw new C0558p("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    /* JADX INFO: renamed from: d */
    public static final int m1550d() {
        return f1309a;
    }

    /* JADX INFO: renamed from: e */
    public static final Object m1551e() {
        return f1312d;
    }

    /* JADX INFO: renamed from: f */
    public static final Object m1552f() {
        return f1310b;
    }

    /* JADX INFO: renamed from: g */
    public static final Object m1553g() {
        return f1311c;
    }

    /* JADX INFO: renamed from: h */
    public static final Object m1554h() {
        return f1314f;
    }

    /* JADX INFO: renamed from: i */
    public static final Object m1555i() {
        return f1315g;
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m1556j() {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static final void m1557k(C0556o4 c0556o4, final InterfaceC0465b4 interfaceC0465b4) {
        c0556o4.m2054X(c0556o4.m2060a0(), new InterfaceC0188p() { // from class: androidx.compose.runtime.b0
            @Override // p010a9.InterfaceC0188p
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC0468c0.m1547a(interfaceC0465b4, ((Integer) obj).intValue(), obj2);
            }
        });
        c0556o4.m2033M0();
    }

    /* JADX INFO: renamed from: l */
    public static final void m1558l() {
    }

    /* JADX INFO: renamed from: m */
    public static final void m1559m(int i10, int i11, int i12, String str) {
    }
}
