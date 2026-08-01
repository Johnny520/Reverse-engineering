package p102h1;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.InterfaceC0572r;
import p010a9.InterfaceC0173a;

/* JADX INFO: renamed from: h1.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2836q {
    /* JADX INFO: renamed from: b */
    public static final InterfaceC2828i m10075b(InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(15454635, i10, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:57)");
        }
        interfaceC0572r.mo2163V(1967007413);
        Object[] objArr = new Object[0];
        InterfaceC2843x interfaceC2843xM10073a = C2834o.f7386u.m10073a();
        Object objMo2170f = interfaceC0572r.mo2170f();
        if (objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
            objMo2170f = new InterfaceC0173a() { // from class: h1.p
                @Override // p010a9.InterfaceC0173a
                public final Object invoke() {
                    return AbstractC2836q.m10076c();
                }
            };
            interfaceC0572r.mo2153L(objMo2170f);
        }
        C2834o c2834o = (C2834o) AbstractC2825f.m10052k(objArr, interfaceC2843xM10073a, (InterfaceC0173a) objMo2170f, interfaceC0572r, 384);
        c2834o.m10072o((InterfaceC2837r) interfaceC0572r.mo2142A(AbstractC2840u.m10083f()));
        interfaceC0572r.mo2152K();
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return c2834o;
    }

    /* JADX INFO: renamed from: c */
    public static final C2834o m10076c() {
        return new C2834o(null, 1, null);
    }
}
