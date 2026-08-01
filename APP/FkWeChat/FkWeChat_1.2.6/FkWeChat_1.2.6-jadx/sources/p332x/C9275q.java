package p332x;

import androidx.compose.foundation.lazy.layout.InterfaceC0406o;
import p080f9.AbstractC2368o;
import p185m8.AbstractC5081g0;

/* JADX INFO: renamed from: x.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9275q implements InterfaceC0406o {

    /* JADX INFO: renamed from: a */
    public final AbstractC9242c1 f31728a;

    /* JADX INFO: renamed from: b */
    public final int f31729b;

    public C9275q(AbstractC9242c1 abstractC9242c1, int i10) {
        this.f31728a = abstractC9242c1;
        this.f31729b = i10;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0406o
    /* JADX INFO: renamed from: a */
    public int mo1295a() {
        return this.f31728a.mo35999J();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0406o
    /* JADX INFO: renamed from: b */
    public int mo1296b() {
        return Math.min(mo1295a() - 1, ((InterfaceC9269n) AbstractC5081g0.m20587u0(this.f31728a.m35994E().mo35971j())).getIndex() + this.f31729b);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0406o
    /* JADX INFO: renamed from: c */
    public int mo1297c() {
        if (this.f31728a.m35994E().mo35971j().size() == 0) {
            return 0;
        }
        int iM36042a = AbstractC9244d0.m36042a(this.f31728a.m35994E());
        int iMo35972k = this.f31728a.m35994E().mo35972k() + this.f31728a.m35994E().mo35973n();
        if (iMo35972k == 0) {
            return 1;
        }
        return AbstractC2368o.m8578e(iM36042a / iMo35972k, 1);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0406o
    /* JADX INFO: renamed from: d */
    public boolean mo1298d() {
        return !this.f31728a.m35994E().mo35971j().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0406o
    /* JADX INFO: renamed from: e */
    public int mo1299e() {
        return Math.max(0, this.f31728a.m35990A() - this.f31729b);
    }
}
