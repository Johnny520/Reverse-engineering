package p000;

/* JADX INFO: renamed from: l2 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0497l2 implements p000.ua0 {

    /* JADX INFO: renamed from: α */
    public final androidx.compose.p001ui.platform.AndroidComposeView f6387;

    /* JADX INFO: renamed from: β */
    public final java.lang.Object f6388;

    /* JADX INFO: renamed from: γ */
    public boolean f6389;

    /* JADX INFO: renamed from: δ */
    public final p000.ComponentCallbacks2C0416j2 f6390;

    public C0497l2(androidx.compose.p001ui.platform.AndroidComposeView r4) {
            r3 = this;
            r3.<init>()
            r3.f6387 = r4
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.f6388 = r0
            j2 r0 = new j2
            r0.<init>()
            r3.f6390 = r0
            boolean r1 = r4.isAttachedToWindow()
            if (r1 == 0) goto L2b
            android.content.Context r1 = r4.getContext()
            boolean r2 = r3.f6389
            if (r2 != 0) goto L2b
            android.content.Context r1 = r1.getApplicationContext()
            r1.registerComponentCallbacks(r0)
            r0 = 1
            r3.f6389 = r0
        L2b:
            k2 r0 = new k2
            r1 = 0
            r0.<init>(r1, r3)
            r4.addOnAttachStateChangeListener(r0)
            return
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: α */
    public final void mo3469(p000.wa0 r2) {
            r1 = this;
            java.lang.Object r1 = r1.f6388
            monitor-enter(r1)
            boolean r0 = r2.f11638     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto Ld
            r0 = 1
            r2.f11638 = r0     // Catch: java.lang.Throwable -> Lf
            r2.m6342()     // Catch: java.lang.Throwable -> Lf
        Ld:
            monitor-exit(r1)
            return
        Lf:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    @Override // p000.ua0
    /* JADX INFO: renamed from: β */
    public final p000.wa0 mo3470() {
            r2 = this;
            java.lang.Object r0 = r2.f6388
            monitor-enter(r0)
            androidx.compose.ui.platform.AndroidComposeView r2 = r2.f6387     // Catch: java.lang.Throwable -> L14
            r2.getUniqueDrawingId()     // Catch: java.lang.Throwable -> L14
            bb0 r2 = new bb0     // Catch: java.lang.Throwable -> L14
            r2.<init>()     // Catch: java.lang.Throwable -> L14
            wa0 r1 = new wa0     // Catch: java.lang.Throwable -> L14
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            return r1
        L14:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }
}
