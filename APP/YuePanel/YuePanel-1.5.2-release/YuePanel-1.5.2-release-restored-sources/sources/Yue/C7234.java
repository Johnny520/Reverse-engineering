package Yue;

import android.os.Bundle;
import android.view.Lifecycle;
import androidx.savedstate.C1794;
import androidx.savedstate.Recreator;

/* JADX INFO: renamed from: Yue.ۥۡۧۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7234 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1217 f21841 = new C1217(null);

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final InterfaceC7235 f2753;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final C1794 f2754;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f21842;

    /* JADX INFO: renamed from: Yue.ۥۡۧۤۡ$ۥ */
    public static final class C1217 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۡۧۤۡ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1217(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ */
        public final C7234 m3519(@InterfaceC6399 InterfaceC7235 interfaceC7235) {
            C5499.m17103(interfaceC7235, "owner");
            return new C7234(interfaceC7235, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1217() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 Yue.ۥۡۧۤۢ) A[MD:(Yue.ۥۡۧۤۢ):void (m)] (LINE:1) call: Yue.ۥۡۧۤۡ.<init>(Yue.ۥۡۧۤۢ):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C7234(InterfaceC7235 interfaceC7235, C4335 c4335) {
        this(interfaceC7235);
    }

    @InterfaceC6399
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ */
    public static final C7234 m3517(@InterfaceC6399 InterfaceC7235 interfaceC7235) {
        return f21841.m3519(interfaceC7235);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final C1794 m3518() {
        return this.f2754;
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m22640() {
        Lifecycle lifecycle = this.f2753.getLifecycle();
        if (lifecycle.getState() != Lifecycle.State.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.addObserver(new Recreator(this.f2753));
        this.f2754.m30803(lifecycle);
        this.f21842 = true;
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m22641(@InterfaceC6489 Bundle bundle) {
        if (!this.f21842) {
            m22640();
        }
        Lifecycle lifecycle = this.f2753.getLifecycle();
        if (!lifecycle.getState().isAtLeast(Lifecycle.State.STARTED)) {
            this.f2754.m30804(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.getState()).toString());
    }

    @InterfaceC5922
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m22642(@InterfaceC6399 Bundle bundle) {
        C5499.m17103(bundle, "outBundle");
        this.f2754.m30805(bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7234(InterfaceC7235 interfaceC7235) {
        this.f2753 = interfaceC7235;
        this.f2754 = new C1794();
    }
}
