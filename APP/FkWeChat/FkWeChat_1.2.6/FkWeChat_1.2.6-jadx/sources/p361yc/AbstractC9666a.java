package p361yc;

import java.util.Iterator;
import p024b9.AbstractC1043k;
import p215oc.C5725t;
import p300uc.InterfaceC8647b;
import p345xc.InterfaceC9485c;
import p345xc.InterfaceC9487e;

/* JADX INFO: renamed from: yc.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9666a implements InterfaceC8647b {
    public /* synthetic */ AbstractC9666a(AbstractC1043k abstractC1043k) {
        this();
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m37784o(AbstractC9666a abstractC9666a, InterfaceC9485c interfaceC9485c, int i10, Object obj, boolean z10, int i11, Object obj2) {
        if (obj2 != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: readElement");
            return;
        }
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        abstractC9666a.mo37792n(interfaceC9485c, i10, obj, z10);
    }

    @Override // p300uc.InterfaceC8645a
    /* JADX INFO: renamed from: d */
    public Object mo15956d(InterfaceC9487e interfaceC9487e) {
        interfaceC9487e.getClass();
        return m37790l(interfaceC9487e, null);
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo37785g();

    /* JADX INFO: renamed from: h */
    public abstract int mo37786h(Object obj);

    /* JADX INFO: renamed from: i */
    public abstract void mo37787i(Object obj, int i10);

    /* JADX INFO: renamed from: j */
    public abstract Iterator mo37788j(Object obj);

    /* JADX INFO: renamed from: k */
    public abstract int mo37789k(Object obj);

    /* JADX INFO: renamed from: l */
    public final Object m37790l(InterfaceC9487e interfaceC9487e, Object obj) {
        Object objMo37785g;
        interfaceC9487e.getClass();
        if (obj == null || (objMo37785g = mo37794q(obj)) == null) {
            objMo37785g = mo37785g();
        }
        Object obj2 = objMo37785g;
        int iMo37786h = mo37786h(obj2);
        InterfaceC9485c interfaceC9485cMo674c = interfaceC9487e.mo674c(mo15953a());
        if (!interfaceC9485cMo674c.mo36958r()) {
            while (true) {
                int iMo788v = interfaceC9485cMo674c.mo788v(mo15953a());
                if (iMo788v == -1) {
                    break;
                }
                m37784o(this, interfaceC9485cMo674c, iMo37786h + iMo788v, obj2, false, 8, null);
            }
        } else {
            mo37791m(interfaceC9485cMo674c, obj2, iMo37786h, m37793p(interfaceC9485cMo674c, obj2));
        }
        interfaceC9485cMo674c.mo675d(mo15953a());
        return mo37795r(obj2);
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo37791m(InterfaceC9485c interfaceC9485c, Object obj, int i10, int i11);

    /* JADX INFO: renamed from: n */
    public abstract void mo37792n(InterfaceC9485c interfaceC9485c, int i10, Object obj, boolean z10);

    /* JADX INFO: renamed from: p */
    public final int m37793p(InterfaceC9485c interfaceC9485c, Object obj) {
        int iMo36959s = interfaceC9485c.mo36959s(mo15953a());
        mo37787i(obj, iMo36959s);
        return iMo36959s;
    }

    /* JADX INFO: renamed from: q */
    public abstract Object mo37794q(Object obj);

    /* JADX INFO: renamed from: r */
    public abstract Object mo37795r(Object obj);

    public AbstractC9666a() {
    }
}
