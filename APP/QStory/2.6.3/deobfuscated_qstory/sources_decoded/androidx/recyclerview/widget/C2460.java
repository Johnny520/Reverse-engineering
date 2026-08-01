package androidx.recyclerview.widget;

import androidx.appcompat.widget.C0191;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2460 implements InterfaceC2478 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f7328;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7329;

    public C2460(int i) {
        this.f7329 = i;
        switch (i) {
            case 2:
                this.f7328 = new C2476(1);
                break;
            default:
                this.f7328 = new C2476(0);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC2478
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC2479 mo4863() {
        int i = this.f7329;
        Object obj = this.f7328;
        switch (i) {
        }
        return (C2476) obj;
    }

    public C2460(C0191 c0191) {
        this.f7329 = 0;
        this.f7328 = c0191;
    }
}
