package Yue;

import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5090 extends AbstractC8386 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final String f12048;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5090(@InterfaceC6399 Fragment fragment, @InterfaceC6399 String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        C5499.m17103(fragment, "fragment");
        C5499.m17103(str, "previousFragmentId");
        this.f12048 = str;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final String m1904() {
        return this.f12048;
    }
}
