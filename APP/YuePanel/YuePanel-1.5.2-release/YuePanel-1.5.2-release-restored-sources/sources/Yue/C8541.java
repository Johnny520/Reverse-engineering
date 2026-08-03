package Yue;

import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: Yue.ۥۢۦ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C8541 extends AbstractC8386 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final Fragment f25372;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f25373;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8541(@InterfaceC6399 Fragment fragment, @InterfaceC6399 Fragment fragment2, int i) {
        super(fragment, "Attempting to nest fragment " + fragment + " within the view of parent fragment " + fragment2 + " via container with ID " + i + " without using parent's childFragmentManager");
        C5499.m17103(fragment, "fragment");
        C5499.m17103(fragment2, "expectedParentFragment");
        this.f25372 = fragment2;
        this.f25373 = i;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final int m4527() {
        return this.f25373;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Fragment m28408() {
        return this.f25372;
    }
}
