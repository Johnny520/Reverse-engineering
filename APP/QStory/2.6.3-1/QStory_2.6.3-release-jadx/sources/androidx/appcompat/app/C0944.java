package androidx.appcompat.app;

import androidx.activity.ComponentActivity;
import p188.InterfaceC8560;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0944 implements InterfaceC8560 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ AppCompatActivity f623;

    public C0944(AppCompatActivity appCompatActivity) {
        this.f623 = appCompatActivity;
    }

    @Override // p188.InterfaceC8560
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo726(ComponentActivity componentActivity) {
        AppCompatActivity appCompatActivity = this.f623;
        AbstractC0941 delegate = appCompatActivity.getDelegate();
        delegate.mo790();
        appCompatActivity.getSavedStateRegistry().m13322("androidx:appcompat");
        delegate.mo788();
    }
}
