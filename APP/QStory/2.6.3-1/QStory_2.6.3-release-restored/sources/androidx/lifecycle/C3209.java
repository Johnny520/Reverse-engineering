package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3209 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3208 f7353;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f7354 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f7355;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3203 f7356;

    public C3209(AbstractC3208 abstractC3208, InterfaceC3203 interfaceC3203) {
        this.f7353 = abstractC3208;
        this.f7356 = interfaceC3203;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5055(boolean z) {
        if (z == this.f7355) {
            return;
        }
        this.f7355 = z;
        int i = z ? 1 : -1;
        AbstractC3208 abstractC3208 = this.f7353;
        int i2 = abstractC3208.f7347;
        abstractC3208.f7347 = i + i2;
        if (!abstractC3208.f7346) {
            abstractC3208.f7346 = true;
            while (true) {
                try {
                    int i3 = abstractC3208.f7347;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    abstractC3208.f7346 = false;
                }
            }
        }
        if (this.f7355) {
            abstractC3208.m5054(this);
        }
    }
}
