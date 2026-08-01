package androidx.fragment.app;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.activity.C0870;
import androidx.activity.InterfaceC0865;
import androidx.core.content.InterfaceC2998;
import androidx.core.util.InterfaceC3021;
import androidx.lifecycle.AbstractC3235;
import androidx.lifecycle.C3256;
import androidx.lifecycle.InterfaceC3254;
import p158.C8368;
import p158.InterfaceC8366;
import p267.AbstractC9004;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3152 extends AbstractC9004 implements InterfaceC2998, InterfaceC3254, InterfaceC0865, InterfaceC8366, InterfaceC3138 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final FragmentActivity f7161;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final FragmentActivity f7162;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ FragmentActivity f7163;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Handler f7164;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C3142 f7165;

    public C3152(FragmentActivity fragmentActivity) {
        this.f7163 = fragmentActivity;
        Handler handler = new Handler();
        this.f7165 = new C3142();
        this.f7162 = fragmentActivity;
        this.f7161 = fragmentActivity;
        this.f7164 = handler;
    }

    @Override // androidx.core.content.InterfaceC2998
    public final void addOnConfigurationChangedListener(InterfaceC3021 interfaceC3021) {
        this.f7163.addOnConfigurationChangedListener(interfaceC3021);
    }

    @Override // androidx.lifecycle.InterfaceC3221
    public final AbstractC3235 getLifecycle() {
        return this.f7163.mFragmentLifecycleRegistry;
    }

    @Override // androidx.activity.InterfaceC0865
    public final C0870 getOnBackPressedDispatcher() {
        return this.f7163.getOnBackPressedDispatcher();
    }

    @Override // p158.InterfaceC8366
    public final C8368 getSavedStateRegistry() {
        return this.f7163.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.InterfaceC3254
    public final C3256 getViewModelStore() {
        return this.f7163.getViewModelStore();
    }

    @Override // androidx.core.content.InterfaceC2998
    public final void removeOnConfigurationChangedListener(InterfaceC3021 interfaceC3021) {
        this.f7163.removeOnConfigurationChangedListener(interfaceC3021);
    }

    @Override // p267.AbstractC9004
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final boolean mo4976() {
        Window window = this.f7163.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p267.AbstractC9004
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final View mo4977(int i) {
        return this.f7163.findViewById(i);
    }

    @Override // androidx.fragment.app.InterfaceC3138
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo4908(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        this.f7163.onAttachFragment(abstractComponentCallbacksC3171);
    }
}
