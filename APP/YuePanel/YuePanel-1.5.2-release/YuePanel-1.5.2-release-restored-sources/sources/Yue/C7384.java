package Yue;

import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: Yue.ۥۡۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7384 extends AbstractC8386 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean f22286;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7384(@InterfaceC6399 Fragment fragment, boolean z) {
        super(fragment, "Attempting to set user visible hint to " + z + " for fragment " + fragment);
        C5499.m17103(fragment, "fragment");
        this.f22286 = z;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m3592() {
        return this.f22286;
    }
}
