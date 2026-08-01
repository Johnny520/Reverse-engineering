package p316w;

import androidx.compose.foundation.lazy.layout.InterfaceC0406o;
import p080f9.AbstractC2368o;
import p185m8.AbstractC5081g0;
import p233q.AbstractC6083e;

/* JADX INFO: renamed from: w.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8946f implements InterfaceC0406o {

    /* JADX INFO: renamed from: a */
    public final C8939c1 f29645a;

    public C8946f(C8939c1 c8939c1) {
        this.f29645a = c8939c1;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0406o
    /* JADX INFO: renamed from: a */
    public int mo1295a() {
        return this.f29645a.m34358y().mo34312i();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0406o
    /* JADX INFO: renamed from: b */
    public int mo1296b() {
        return ((InterfaceC8964m) AbstractC5081g0.m20587u0(this.f29645a.m34358y().mo34314k())).getIndex();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0406o
    /* JADX INFO: renamed from: c */
    public int mo1297c() {
        if (this.f29645a.m34358y().mo34314k().isEmpty()) {
            return 0;
        }
        int iM24202a = AbstractC6083e.m24202a(this.f29645a.m34358y());
        int iM34322a = AbstractC8938c0.m34322a(this.f29645a.m34358y());
        if (iM34322a == 0) {
            return 1;
        }
        return AbstractC2368o.m8578e(iM24202a / iM34322a, 1);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0406o
    /* JADX INFO: renamed from: d */
    public boolean mo1298d() {
        return !this.f29645a.m34358y().mo34314k().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0406o
    /* JADX INFO: renamed from: e */
    public int mo1299e() {
        return this.f29645a.m34353t();
    }
}
