package Yue;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: Yue.ۥۣۣ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5098 extends AbstractC8386 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6489
    public final ViewGroup f12079;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5098(@InterfaceC6399 Fragment fragment, @InterfaceC6489 ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        C5499.m17103(fragment, "fragment");
        this.f12079 = viewGroup;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public final ViewGroup m1917() {
        return this.f12079;
    }
}
