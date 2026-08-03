package Yue;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: Yue.ۥۢۦ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C8540 extends AbstractC8386 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final ViewGroup f25371;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8540(@InterfaceC6399 Fragment fragment, @InterfaceC6399 ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        C5499.m17103(fragment, "fragment");
        C5499.m17103(viewGroup, "container");
        this.f25371 = viewGroup;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final ViewGroup m4526() {
        return this.f25371;
    }
}
