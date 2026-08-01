package p163l;

import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import p010a9.InterfaceC0173a;

/* JADX INFO: renamed from: l.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4312j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4365t2 f12631a;

    /* JADX INFO: renamed from: b */
    public final Object f12632b;

    /* JADX INFO: renamed from: c */
    public final long f12633c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0173a f12634d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0512i2 f12635e;

    /* JADX INFO: renamed from: f */
    public AbstractC4357s f12636f;

    /* JADX INFO: renamed from: g */
    public long f12637g;

    /* JADX INFO: renamed from: h */
    public long f12638h = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i */
    public final InterfaceC0512i2 f12639i;

    public C4312j(Object obj, InterfaceC4365t2 interfaceC4365t2, AbstractC4357s abstractC4357s, long j10, Object obj2, long j11, boolean z10, InterfaceC0173a interfaceC0173a) {
        this.f12631a = interfaceC4365t2;
        this.f12632b = obj2;
        this.f12633c = j11;
        this.f12634d = interfaceC0173a;
        this.f12635e = AbstractC0522j5.m1773e(obj, null, 2, null);
        this.f12636f = AbstractC4362t.m17119e(abstractC4357s);
        this.f12637g = j10;
        this.f12639i = AbstractC0522j5.m1773e(Boolean.valueOf(z10), null, 2, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m16939a() {
        m16949k(false);
        this.f12634d.invoke();
    }

    /* JADX INFO: renamed from: b */
    public final long m16940b() {
        return this.f12638h;
    }

    /* JADX INFO: renamed from: c */
    public final long m16941c() {
        return this.f12637g;
    }

    /* JADX INFO: renamed from: d */
    public final long m16942d() {
        return this.f12633c;
    }

    /* JADX INFO: renamed from: e */
    public final Object m16943e() {
        return this.f12635e.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final Object m16944f() {
        return this.f12631a.mo17123b().mo27m(this.f12636f);
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC4357s m16945g() {
        return this.f12636f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m16946h() {
        return ((Boolean) this.f12639i.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public final void m16947i(long j10) {
        this.f12638h = j10;
    }

    /* JADX INFO: renamed from: j */
    public final void m16948j(long j10) {
        this.f12637g = j10;
    }

    /* JADX INFO: renamed from: k */
    public final void m16949k(boolean z10) {
        this.f12639i.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: l */
    public final void m16950l(Object obj) {
        this.f12635e.setValue(obj);
    }

    /* JADX INFO: renamed from: m */
    public final void m16951m(AbstractC4357s abstractC4357s) {
        this.f12636f = abstractC4357s;
    }
}
