package androidx.recyclerview.widget;

import androidx.appcompat.widget.C1038;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3293 implements InterfaceC3311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f7673;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7674;

    public C3293(int i) {
        this.f7674 = i;
        switch (i) {
            case 2:
                this.f7673 = new C3309(1);
                break;
            default:
                this.f7673 = new C3309(0);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC3311
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC3312 mo5423() {
        int i = this.f7674;
        Object obj = this.f7673;
        switch (i) {
        }
        return (C3309) obj;
    }

    public C3293(C1038 c1038) {
        this.f7674 = 0;
        this.f7673 = c1038;
    }
}
