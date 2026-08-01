package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.activity.C0023;
import androidx.activity.InterfaceC0018;
import androidx.core.content.InterfaceC2165;
import androidx.core.util.InterfaceC2188;
import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.C2423;
import androidx.lifecycle.InterfaceC2421;
import p142.C7538;
import p142.InterfaceC7536;
import p392.AbstractC9124;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2319 extends AbstractC9124 implements InterfaceC2165, InterfaceC2421, InterfaceC0018, InterfaceC7536, InterfaceC2305 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C2309 f6815;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Handler f6816;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ FragmentActivity f6817;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final FragmentActivity f6818;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final FragmentActivity f6819;

    public C2319(FragmentActivity fragmentActivity) {
        this.f6817 = fragmentActivity;
        Handler handler = new Handler();
        this.f6815 = new C2309();
        this.f6818 = fragmentActivity;
        this.f6819 = fragmentActivity;
        this.f6816 = handler;
    }

    @Override // androidx.core.content.InterfaceC2165
    public final void addOnConfigurationChangedListener(InterfaceC2188 interfaceC2188) {
        this.f6817.addOnConfigurationChangedListener(interfaceC2188);
    }

    @Override // androidx.lifecycle.InterfaceC2388
    public final AbstractC2402 getLifecycle() {
        return this.f6817.mFragmentLifecycleRegistry;
    }

    @Override // androidx.activity.InterfaceC0018
    public final C0023 getOnBackPressedDispatcher() {
        return this.f6817.getOnBackPressedDispatcher();
    }

    @Override // p142.InterfaceC7536
    public final C7538 getSavedStateRegistry() {
        return this.f6817.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.InterfaceC2421
    public final C2423 getViewModelStore() {
        return this.f6817.getViewModelStore();
    }

    @Override // androidx.core.content.InterfaceC2165
    public final void removeOnConfigurationChangedListener(InterfaceC2188 interfaceC2188) {
        this.f6817.removeOnConfigurationChangedListener(interfaceC2188);
    }

    @Override // androidx.fragment.app.InterfaceC2305
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo4338(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        this.f6817.onAttachFragment(abstractComponentCallbacksC2338);
    }

    @Override // p392.AbstractC9124
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean mo4406() {
        Window window = this.f6817.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p392.AbstractC9124
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final View mo4407(int i) {
        return this.f6817.findViewById(i);
    }
}
