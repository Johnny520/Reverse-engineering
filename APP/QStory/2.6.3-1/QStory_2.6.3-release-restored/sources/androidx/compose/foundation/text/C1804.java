package androidx.compose.foundation.text;

import android.view.View;
import androidx.compose.p001ui.text.input.InterfaceC2856;
import androidx.recyclerview.widget.AbstractC3317;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1804 implements InterfaceC2856 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f3100;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f3101;

    public /* synthetic */ C1804(int i, int i2) {
        this.f3101 = i;
        this.f3100 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m2441(AbstractC3317 abstractC3317) {
        View view = abstractC3317.itemView;
        this.f3101 = view.getLeft();
        this.f3100 = view.getTop();
        view.getRight();
        view.getBottom();
    }

    @Override // androidx.compose.p001ui.text.input.InterfaceC2856
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int mo2442(int i) {
        if (i >= 0 && i <= this.f3101) {
            AbstractC1821.m2447(i, this.f3100, i);
        }
        return i;
    }

    @Override // androidx.compose.p001ui.text.input.InterfaceC2856
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int mo2443(int i) {
        if (i >= 0 && i <= this.f3100) {
            AbstractC1821.m2446(i, this.f3101, i);
        }
        return i;
    }
}
