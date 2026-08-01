package androidx.compose.foundation.text;

import android.view.View;
import androidx.compose.ui.text.input.InterfaceC2022;
import androidx.recyclerview.widget.AbstractC2484;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0966 implements InterfaceC2022 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f2755;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f2756;

    public /* synthetic */ C0966(int i, int i2) {
        this.f2756 = i;
        this.f2755 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m1881(AbstractC2484 abstractC2484) {
        View view = abstractC2484.itemView;
        this.f2756 = view.getLeft();
        this.f2755 = view.getTop();
        view.getRight();
        view.getBottom();
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2022
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int mo1882(int i) {
        if (i >= 0 && i <= this.f2756) {
            AbstractC0983.m1887(i, this.f2755, i);
        }
        return i;
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2022
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int mo1883(int i) {
        if (i >= 0 && i <= this.f2755) {
            AbstractC0983.m1886(i, this.f2756, i);
        }
        return i;
    }
}
