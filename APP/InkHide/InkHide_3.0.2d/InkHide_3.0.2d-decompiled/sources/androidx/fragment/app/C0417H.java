package androidx.fragment.app;

import androidx.lifecycle.C0464P;
import androidx.lifecycle.C0486u;
import androidx.lifecycle.EnumC0478m;
import androidx.lifecycle.InterfaceC0465Q;
import androidx.lifecycle.InterfaceC0474i;
import p024M.C0190d;
import p024M.C0191e;
import p024M.InterfaceC0192f;

/* JADX INFO: renamed from: androidx.fragment.app.H */
/* JADX INFO: loaded from: classes.dex */
public final class C0417H implements InterfaceC0474i, InterfaceC0192f, InterfaceC0465Q {

    /* JADX INFO: renamed from: b */
    public final C0464P f1266b;

    /* JADX INFO: renamed from: c */
    public C0486u f1267c = null;

    /* JADX INFO: renamed from: d */
    public C0191e f1268d = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0417H(AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l, C0464P c0464p) {
        this.f1266b = c0464p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p024M.InterfaceC0192f
    /* JADX INFO: renamed from: b */
    public final C0190d mo405b() {
        m807e();
        return (C0190d) this.f1268d.f547d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0484s
    /* JADX INFO: renamed from: c */
    public final C0486u mo636c() {
        m807e();
        return this.f1267c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m806d(EnumC0478m enumC0478m) {
        this.f1267c.m930d(enumC0478m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m807e() {
        if (this.f1267c == null) {
            this.f1267c = new C0486u(this);
            this.f1268d = new C0191e(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0465Q
    public final C0464P getViewModelStore() {
        m807e();
        return this.f1266b;
    }
}
