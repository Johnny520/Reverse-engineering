package p316w;

import p010a9.InterfaceC0188p;
import p121i3.AbstractC3174d;
import p121i3.C3173c;
import p121i3.InterfaceC3175e;

/* JADX INFO: renamed from: w.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8940d implements InterfaceC8981u0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0188p f29631a;

    /* JADX INFO: renamed from: b */
    public long f29632b = AbstractC3174d.m11985b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: c */
    public float f29633c;

    /* JADX INFO: renamed from: d */
    public C8979t0 f29634d;

    public C8940d(InterfaceC0188p interfaceC0188p) {
        this.f29631a = interfaceC0188p;
    }

    @Override // p316w.InterfaceC8981u0
    /* JADX INFO: renamed from: a */
    public C8979t0 mo34365a(InterfaceC3175e interfaceC3175e, long j10) {
        if (this.f29634d != null && C3173c.m11967f(this.f29632b, j10) && this.f29633c == interfaceC3175e.getDensity()) {
            C8979t0 c8979t0 = this.f29634d;
            c8979t0.getClass();
            return c8979t0;
        }
        this.f29632b = j10;
        this.f29633c = interfaceC3175e.getDensity();
        C8979t0 c8979t02 = (C8979t0) this.f29631a.invoke(interfaceC3175e, C3173c.m11962a(j10));
        this.f29634d = c8979t02;
        return c8979t02;
    }
}
