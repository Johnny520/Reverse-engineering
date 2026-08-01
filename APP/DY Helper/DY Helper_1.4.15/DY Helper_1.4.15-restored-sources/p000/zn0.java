package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class zn0 extends p000.fo0 {

    /* JADX INFO: renamed from: η */
    public final boolean f13196;

    public zn0(p000.fo0 r6) {
            r5 = this;
            r0 = 1
            r5.<init>(r0)
            r5.m2166(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = p000.fo0.f4053
            java.lang.Object r1 = r6.get(r5)
            pf r1 = (p000.InterfaceC0685pf) r1
            boolean r2 = r1 instanceof p000.C0722qf
            r3 = 0
            if (r2 == 0) goto L17
            qf r1 = (p000.C0722qf) r1
            goto L18
        L17:
            r1 = r3
        L18:
            r2 = 0
            if (r1 == 0) goto L3b
            fo0 r1 = r1.m1279()
        L1f:
            boolean r4 = r1.mo2161()
            if (r4 == 0) goto L26
            goto L3c
        L26:
            java.lang.Object r1 = r6.get(r1)
            pf r1 = (p000.InterfaceC0685pf) r1
            boolean r4 = r1 instanceof p000.C0722qf
            if (r4 == 0) goto L33
            qf r1 = (p000.C0722qf) r1
            goto L34
        L33:
            r1 = r3
        L34:
            if (r1 == 0) goto L3b
            fo0 r1 = r1.m1279()
            goto L1f
        L3b:
            r0 = r2
        L3c:
            r5.f13196 = r0
            return
    }

    @Override // p000.fo0
    /* JADX INFO: renamed from: Δ */
    public final boolean mo2161() {
            r0 = this;
            boolean r0 = r0.f13196
            return r0
    }

    @Override // p000.fo0
    /* JADX INFO: renamed from: Ε */
    public final boolean mo2162() {
            r0 = this;
            r0 = 1
            return r0
    }
}
