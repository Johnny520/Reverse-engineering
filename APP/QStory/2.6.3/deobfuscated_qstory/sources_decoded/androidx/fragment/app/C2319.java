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
import p142.C7539;
import p142.InterfaceC7537;
import p251.AbstractC8175;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2319 extends AbstractC8175 implements InterfaceC2165, InterfaceC2421, InterfaceC0018, InterfaceC7537, InterfaceC2305 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final FragmentActivity f6816;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final FragmentActivity f6817;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ FragmentActivity f6818;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Handler f6819;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C2309 f6820;

    public C2319(FragmentActivity fragmentActivity) {
        this.f6818 = fragmentActivity;
        Handler handler = new Handler();
        this.f6820 = new C2309();
        this.f6817 = fragmentActivity;
        this.f6816 = fragmentActivity;
        this.f6819 = handler;
    }

    @Override // androidx.core.content.InterfaceC2165
    public final void addOnConfigurationChangedListener(InterfaceC2188 interfaceC2188) {
        this.f6818.addOnConfigurationChangedListener(interfaceC2188);
    }

    @Override // androidx.lifecycle.InterfaceC2388
    public final AbstractC2402 getLifecycle() {
        return this.f6818.mFragmentLifecycleRegistry;
    }

    @Override // androidx.activity.InterfaceC0018
    public final C0023 getOnBackPressedDispatcher() {
        return this.f6818.getOnBackPressedDispatcher();
    }

    @Override // p142.InterfaceC7537
    public final C7539 getSavedStateRegistry() {
        return this.f6818.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.InterfaceC2421
    public final C2423 getViewModelStore() {
        return this.f6818.getViewModelStore();
    }

    @Override // androidx.core.content.InterfaceC2165
    public final void removeOnConfigurationChangedListener(InterfaceC2188 interfaceC2188) {
        this.f6818.removeOnConfigurationChangedListener(interfaceC2188);
    }

    @Override // p251.AbstractC8175
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean mo4416() {
        Window window = this.f6818.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p251.AbstractC8175
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final View mo4417(int i) {
        return this.f6818.findViewById(i);
    }

    @Override // androidx.fragment.app.InterfaceC2305
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo4348(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        this.f6818.onAttachFragment(abstractComponentCallbacksC2338);
    }
}
