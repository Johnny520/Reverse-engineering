package androidx.appcompat.app;

import androidx.activity.ComponentActivity;
import p172.InterfaceC7731;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0097 implements InterfaceC7731 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ AppCompatActivity f278;

    public C0097(AppCompatActivity appCompatActivity) {
        this.f278 = appCompatActivity;
    }

    @Override // p172.InterfaceC7731
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo166(ComponentActivity componentActivity) {
        AppCompatActivity appCompatActivity = this.f278;
        AbstractC0094 delegate = appCompatActivity.getDelegate();
        delegate.mo230();
        appCompatActivity.getSavedStateRegistry().m12763("androidx:appcompat");
        delegate.mo228();
    }
}
