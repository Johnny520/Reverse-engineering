package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class t62 extends kotlinx.coroutines.AbstractC0479 {

    /* JADX INFO: renamed from: η */
    public static final p000.t62 f10213 = null;

    static {
            t62 r0 = new t62
            r0.<init>()
            p000.t62.f10213 = r0
            return
    }

    @Override // kotlinx.coroutines.AbstractC0479
    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "Dispatchers.IO"
            return r0
    }

    @Override // kotlinx.coroutines.AbstractC0479
    /* JADX INFO: renamed from: ρ */
    public final void mo1950(p000.InterfaceC0880up r2, java.lang.Runnable r3) {
            r1 = this;
            jr r1 = p000.C0442jr.f5554
            r2 = 1
            aq r1 = r1.f5555
            r0 = 0
            r1.m575(r3, r2, r0)
            return
    }

    @Override // kotlinx.coroutines.AbstractC0479
    /* JADX INFO: renamed from: τ */
    public final kotlinx.coroutines.AbstractC0479 mo3393(int r2) {
            r1 = this;
            p000.h62.m2405(r2)
            int r0 = p000.y22.f12432
            if (r2 < r0) goto L8
            return r1
        L8:
            kotlinx.coroutines.α r1 = super.mo3393(r2)
            return r1
    }
}
