package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5502 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C5502.C5503 f20356 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC5504 f20357;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final androidx.savedstate.C7816 f20358;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f20359;

    /* JADX INFO: renamed from: Yue.ۥۡۧۤۡ$ۥ, reason: contains not printable characters */
    public static final class C5503 {
        public C5503() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C5503(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        @Yue.InterfaceC3427
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C5502 m20700(@Yue.InterfaceC4418 Yue.InterfaceC5504 r3) {
                r2 = this;
                java.lang.String r0 = "owner"
                Yue.C3329.m13906(r3, r0)
                Yue.ۥۡۧۤۡ r0 = new Yue.ۥۡۧۤۡ
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }
    }

    static {
            Yue.ۥۡۧۤۡ$ۥ r0 = new Yue.ۥۡۧۤۡ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C5502.f20356 = r0
            return
    }

    public C5502(Yue.InterfaceC5504 r1) {
            r0 = this;
            r0.<init>()
            r0.f20357 = r1
            androidx.savedstate.ۥ r1 = new androidx.savedstate.ۥ
            r1.<init>()
            r0.f20358 = r1
            return
    }

    public /* synthetic */ C5502(Yue.InterfaceC5504 r1, Yue.C1769 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final Yue.C5502 m20695(@Yue.InterfaceC4418 Yue.InterfaceC5504 r1) {
            Yue.ۥۡۧۤۡ$ۥ r0 = Yue.C5502.f20356
            Yue.ۥۡۧۤۡ r1 = r0.m20700(r1)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final androidx.savedstate.C7816 m20696() {
            r1 = this;
            androidx.savedstate.ۥ r0 = r1.f20358
            return r0
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m20697() {
            r3 = this;
            Yue.ۥۡۧۤۢ r0 = r3.f20357
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            if (r1 != r2) goto L21
            androidx.savedstate.Recreator r1 = new androidx.savedstate.Recreator
            Yue.ۥۡۧۤۢ r2 = r3.f20357
            r1.<init>(r2)
            r0.addObserver(r1)
            androidx.savedstate.ۥ r1 = r3.f20358
            r1.m30363(r0)
            r0 = 1
            r3.f20359 = r0
            return
        L21:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Restarter must be created only during owner's initialization stage"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m20698(@Yue.InterfaceC4543 android.os.Bundle r4) {
            r3 = this;
            boolean r0 = r3.f20359
            if (r0 != 0) goto L7
            r3.m20697()
        L7:
            Yue.ۥۡۧۤۢ r0 = r3.f20357
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r1 = r1.isAtLeast(r2)
            r1 = r1 ^ 1
            if (r1 == 0) goto L21
            androidx.savedstate.ۥ r0 = r3.f20358
            r0.m30364(r4)
            return
        L21:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "performRestore cannot be called when owner is "
            r4.append(r1)
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Yue.InterfaceC3875
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m20699(@Yue.InterfaceC4418 android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = "outBundle"
            Yue.C3329.m13906(r2, r0)
            androidx.savedstate.ۥ r0 = r1.f20358
            r0.m30365(r2)
            return
    }
}
