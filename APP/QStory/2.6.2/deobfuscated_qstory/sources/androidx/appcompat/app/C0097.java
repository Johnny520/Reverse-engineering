package androidx.appcompat.app;

import androidx.activity.ComponentActivity;
import p172.InterfaceC7730;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0097 implements InterfaceC7730 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ AppCompatActivity f278;

    public C0097(AppCompatActivity appCompatActivity) {
        this.f278 = appCompatActivity;
    }

    @Override // p172.InterfaceC7730
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo165(ComponentActivity componentActivity) {
        AppCompatActivity appCompatActivity = this.f278;
        AbstractC0094 delegate = appCompatActivity.getDelegate();
        delegate.mo229();
        appCompatActivity.getSavedStateRegistry().m12734("androidx:appcompat");
        delegate.mo227();
    }
}
