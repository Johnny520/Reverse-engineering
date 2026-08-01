package p303v;

import androidx.compose.foundation.lazy.layout.InterfaceC0406o;
import p080f9.AbstractC2368o;
import p185m8.AbstractC5081g0;
import p233q.AbstractC6084f;

/* JADX INFO: renamed from: v.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8699i implements InterfaceC0406o {

    /* JADX INFO: renamed from: a */
    public final C8722t0 f28894a;

    /* JADX INFO: renamed from: b */
    public final int f28895b;

    public C8699i(C8722t0 c8722t0, int i10) {
        this.f28894a = c8722t0;
        this.f28895b = i10;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0406o
    /* JADX INFO: renamed from: a */
    public int mo1295a() {
        return this.f28894a.m33474B().mo33393i();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0406o
    /* JADX INFO: renamed from: b */
    public int mo1296b() {
        return Math.min(mo1295a() - 1, ((InterfaceC8709n) AbstractC5081g0.m20587u0(this.f28894a.m33474B().mo33395k())).getIndex() + this.f28895b);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0406o
    /* JADX INFO: renamed from: c */
    public int mo1297c() {
        if (this.f28894a.m33474B().mo33395k().isEmpty()) {
            return 0;
        }
        int iM24208d = AbstractC6084f.m24208d(this.f28894a.m33474B());
        int iM33514a = AbstractC8731y.m33514a(this.f28894a.m33474B());
        if (iM33514a == 0) {
            return 1;
        }
        return AbstractC2368o.m8578e(iM24208d / iM33514a, 1);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0406o
    /* JADX INFO: renamed from: d */
    public boolean mo1298d() {
        return !this.f28894a.m33474B().mo33395k().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0406o
    /* JADX INFO: renamed from: e */
    public int mo1299e() {
        return Math.max(0, this.f28894a.m33498w() - this.f28895b);
    }
}
