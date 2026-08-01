package androidx.compose.foundation.text;

import android.view.View;
import androidx.compose.ui.text.input.InterfaceC2022;
import androidx.recyclerview.widget.AbstractC2484;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0966 implements InterfaceC2022 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f2754;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f2755;

    public /* synthetic */ C0966(int i, int i2) {
        this.f2755 = i;
        this.f2754 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m1871(AbstractC2484 abstractC2484) {
        View view = abstractC2484.itemView;
        this.f2755 = view.getLeft();
        this.f2754 = view.getTop();
        view.getRight();
        view.getBottom();
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2022
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int mo1872(int i) {
        if (i >= 0 && i <= this.f2755) {
            AbstractC0983.m1877(i, this.f2754, i);
        }
        return i;
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2022
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int mo1873(int i) {
        if (i >= 0 && i <= this.f2754) {
            AbstractC0983.m1876(i, this.f2755, i);
        }
        return i;
    }
}
