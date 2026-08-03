package Yue;

import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: Yue.ۥۣۡۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7383 extends AbstractC7723 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final Fragment f22284;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f22285;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7383(@InterfaceC6399 Fragment fragment, @InterfaceC6399 Fragment fragment2, int i) {
        super(fragment, "Attempting to set target fragment " + fragment2 + " with request code " + i + " for fragment " + fragment);
        C5499.m17103(fragment, "fragment");
        C5499.m17103(fragment2, "targetFragment");
        this.f22284 = fragment2;
        this.f22285 = i;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final int m3591() {
        return this.f22285;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Fragment m23116() {
        return this.f22284;
    }
}
