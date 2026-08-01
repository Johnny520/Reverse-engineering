package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class q01 implements p000.InterfaceC0882ur {

    /* JADX INFO: renamed from: ε */
    public p000.q01 f8771;

    /* JADX INFO: renamed from: ζ */
    public p000.C0557mp f8772;

    /* JADX INFO: renamed from: η */
    public int f8773;

    /* JADX INFO: renamed from: θ */
    public int f8774;

    /* JADX INFO: renamed from: ι */
    public p000.q01 f8775;

    /* JADX INFO: renamed from: κ */
    public p000.q01 f8776;

    /* JADX INFO: renamed from: λ */
    public p000.d41 f8777;

    /* JADX INFO: renamed from: μ */
    public p000.q31 f8778;

    /* JADX INFO: renamed from: ν */
    public boolean f8779;

    /* JADX INFO: renamed from: ξ */
    public boolean f8780;

    /* JADX INFO: renamed from: ο */
    public boolean f8781;

    /* JADX INFO: renamed from: π */
    public boolean f8782;

    /* JADX INFO: renamed from: ρ */
    public p000.C1004y0 f8783;

    /* JADX INFO: renamed from: σ */
    public boolean f8784;

    public q01() {
            r1 = this;
            r1.<init>()
            r1.f8771 = r1
            r0 = -1
            r1.f8774 = r0
            return
    }

    /* JADX INFO: renamed from: А */
    public void mo4646(p000.q01 r1) {
            r0 = this;
            r0.f8771 = r1
            return
    }

    /* JADX INFO: renamed from: Б */
    public void mo4647(p000.q31 r1) {
            r0 = this;
            r0.f8778 = r1
            return
    }

    /* JADX INFO: renamed from: у */
    public final p000.InterfaceC0086bq m4648() {
            r3 = this;
            mp r0 = r3.f8772
            if (r0 != 0) goto L2b
            androidx.compose.ui.platform.AndroidComposeView r0 = p000.h62.m2446(r3)
            up r0 = r0.getCoroutineContext()
            androidx.compose.ui.platform.AndroidComposeView r1 = p000.h62.m2446(r3)
            up r1 = r1.getCoroutineContext()
            xn0 r2 = p000.xn0.f12226
            sp r1 = r1.mo1785(r2)
            fo0 r1 = (p000.fo0) r1
            zn0 r2 = new zn0
            r2.<init>(r1)
            up r0 = r0.mo1784(r2)
            mp r0 = p000.AbstractC1021yh.m6873(r0)
            r3.f8772 = r0
        L2b:
            return r0
    }

    /* JADX INFO: renamed from: ф */
    public boolean mo1140() {
            r0 = this;
            boolean r0 = r0 instanceof p000.C0614o8
            r0 = r0 ^ 1
            return r0
    }

    /* JADX INFO: renamed from: х */
    public void mo4649() {
            r1 = this;
            boolean r0 = r1.f8784
            if (r0 == 0) goto L9
            java.lang.String r0 = "node attached multiple times"
            p000.am0.m178(r0)
        L9:
            q31 r0 = r1.f8778
            if (r0 == 0) goto Le
            goto L13
        Le:
            java.lang.String r0 = "attach invoked on a node without a coordinator"
            p000.am0.m178(r0)
        L13:
            r0 = 1
            r1.f8784 = r0
            r1.f8781 = r0
            return
    }

    /* JADX INFO: renamed from: ц */
    public void mo4650() {
            r4 = this;
            boolean r0 = r4.f8784
            if (r0 != 0) goto L9
            java.lang.String r0 = "Cannot detach a node that is not attached"
            p000.am0.m178(r0)
        L9:
            boolean r0 = r4.f8781
            if (r0 == 0) goto L12
            java.lang.String r0 = "Must run runAttachLifecycle() before markAsDetached()"
            p000.am0.m178(r0)
        L12:
            boolean r0 = r4.f8782
            if (r0 == 0) goto L1b
            java.lang.String r0 = "Must run runDetachLifecycle() before markAsDetached()"
            p000.am0.m178(r0)
        L1b:
            r0 = 0
            r4.f8784 = r0
            mp r0 = r4.f8772
            if (r0 == 0) goto L41
            u01 r1 = new u01
            java.lang.String r2 = "The Modifier.Node was detached"
            r1.<init>(r2)
            up r2 = r0.f7238
            xn0 r3 = p000.xn0.f12226
            sp r2 = r2.mo1785(r3)
            fo0 r2 = (p000.fo0) r2
            if (r2 == 0) goto L3c
            r2.mo2180(r1)
            r0 = 0
            r4.f8772 = r0
            return
        L3c:
            java.lang.String r4 = "Scope cannot be cancelled because it does not have a job: "
            p000.C1080.m7278(r0, r4)
        L41:
            return
    }

    /* JADX INFO: renamed from: ч */
    public void mo613() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ш */
    public void mo614() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: щ */
    public void mo1141() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: э */
    public void mo4651() {
            r1 = this;
            boolean r0 = r1.f8784
            if (r0 != 0) goto L9
            java.lang.String r0 = "reset() called on an unattached node"
            p000.am0.m178(r0)
        L9:
            r1.mo1141()
            return
    }

    /* JADX INFO: renamed from: ю */
    public void mo4652() {
            r1 = this;
            boolean r0 = r1.f8784
            if (r0 != 0) goto L9
            java.lang.String r0 = "Must run markAsAttached() prior to runAttachLifecycle"
            p000.am0.m178(r0)
        L9:
            boolean r0 = r1.f8781
            if (r0 != 0) goto L12
            java.lang.String r0 = "Must run runAttachLifecycle() only once after markAsAttached()"
            p000.am0.m178(r0)
        L12:
            r0 = 0
            r1.f8781 = r0
            r1.mo613()
            r0 = 1
            r1.f8782 = r0
            return
    }

    /* JADX INFO: renamed from: я */
    public void mo4653() {
            r1 = this;
            boolean r0 = r1.f8784
            if (r0 != 0) goto L9
            java.lang.String r0 = "node detached multiple times"
            p000.am0.m178(r0)
        L9:
            q31 r0 = r1.f8778
            if (r0 == 0) goto Le
            goto L13
        Le:
            java.lang.String r0 = "detach invoked on a node without a coordinator"
            p000.am0.m178(r0)
        L13:
            boolean r0 = r1.f8782
            if (r0 != 0) goto L1c
            java.lang.String r0 = "Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()"
            p000.am0.m178(r0)
        L1c:
            r0 = 0
            r1.f8782 = r0
            y0 r0 = r1.f8783
            if (r0 == 0) goto L26
            r0.invoke()
        L26:
            r1.mo614()
            return
    }
}
