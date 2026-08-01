package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class y92 {

    /* JADX INFO: renamed from: α */
    public final java.util.ArrayList f12504;

    /* JADX INFO: renamed from: β */
    public long f12505;

    /* JADX INFO: renamed from: γ */
    public android.view.animation.Interpolator f12506;

    /* JADX INFO: renamed from: δ */
    public p000.z92 f12507;

    /* JADX INFO: renamed from: ε */
    public boolean f12508;

    /* JADX INFO: renamed from: ζ */
    public final p000.a52 f12509;

    public y92() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f12505 = r0
            a52 r0 = new a52
            r0.<init>(r2)
            r2.f12509 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f12504 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m6841() {
            r2 = this;
            boolean r0 = r2.f12508
            if (r0 != 0) goto L5
            return
        L5:
            java.util.ArrayList r0 = r2.f12504
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            x92 r1 = (p000.x92) r1
            r1.m6541()
            goto Lb
        L1b:
            r0 = 0
            r2.f12508 = r0
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m6842() {
            r6 = this;
            boolean r0 = r6.f12508
            if (r0 == 0) goto L5
            return
        L5:
            java.util.ArrayList r0 = r6.f12504
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r0.next()
            x92 r1 = (p000.x92) r1
            long r2 = r6.f12505
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L22
            r1.m6542(r2)
        L22:
            android.view.animation.Interpolator r2 = r6.f12506
            if (r2 == 0) goto L37
            java.lang.ref.WeakReference r3 = r1.f12083
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L37
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r3.setInterpolator(r2)
        L37:
            z92 r2 = r6.f12507
            if (r2 == 0) goto L40
            a52 r2 = r6.f12509
            r1.m6543(r2)
        L40:
            java.lang.ref.WeakReference r1 = r1.f12083
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto Lb
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r1.start()
            goto Lb
        L52:
            r0 = 1
            r6.f12508 = r0
            return
    }
}
