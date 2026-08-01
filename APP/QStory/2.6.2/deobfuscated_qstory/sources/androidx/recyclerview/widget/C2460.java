package androidx.recyclerview.widget;

import androidx.appcompat.widget.C0191;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2460 implements InterfaceC2478 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f7327;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7328;

    public C2460(int i) {
        this.f7328 = i;
        switch (i) {
            case 2:
                this.f7327 = new C2476(1);
                break;
            default:
                this.f7327 = new C2476(0);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.InterfaceC2478
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC2479 mo4853() {
        int i = this.f7328;
        Object obj = this.f7327;
        switch (i) {
        }
        return (C2476) obj;
    }

    public C2460(C0191 c0191) {
        this.f7328 = 0;
        this.f7327 = c0191;
    }
}
