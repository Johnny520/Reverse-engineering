package p166l2;

import p120i2.AbstractC3167a;
import p215oc.C5706c;
import p235q1.InterfaceC6226t;

/* JADX INFO: renamed from: l2.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4533e implements InterfaceC6226t {

    /* JADX INFO: renamed from: b */
    public static final C4533e f13230b = new C4533e();

    /* JADX INFO: renamed from: c */
    public static Boolean f13231c;

    @Override // p235q1.InterfaceC6226t
    /* JADX INFO: renamed from: e */
    public boolean mo17626e() {
        Boolean bool = f13231c;
        if (bool != null) {
            return bool.booleanValue();
        }
        AbstractC3167a.m11957c("canFocus is read before it is written");
        C5706c.m23089a();
        return false;
    }

    @Override // p235q1.InterfaceC6226t
    /* JADX INFO: renamed from: o */
    public void mo17627o(boolean z10) {
        f13231c = Boolean.valueOf(z10);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m17628q() {
        return f13231c != null;
    }

    /* JADX INFO: renamed from: r */
    public final void m17629r() {
        f13231c = null;
    }
}
