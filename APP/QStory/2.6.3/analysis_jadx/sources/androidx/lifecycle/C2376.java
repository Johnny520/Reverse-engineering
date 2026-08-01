package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2376 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2375 f7008;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f7009 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f7010;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2370 f7011;

    public C2376(AbstractC2375 abstractC2375, InterfaceC2370 interfaceC2370) {
        this.f7008 = abstractC2375;
        this.f7011 = interfaceC2370;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4495(boolean z) {
        if (z == this.f7010) {
            return;
        }
        this.f7010 = z;
        int i = z ? 1 : -1;
        AbstractC2375 abstractC2375 = this.f7008;
        int i2 = abstractC2375.f7002;
        abstractC2375.f7002 = i + i2;
        if (!abstractC2375.f7001) {
            abstractC2375.f7001 = true;
            while (true) {
                try {
                    int i3 = abstractC2375.f7002;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    abstractC2375.f7001 = false;
                }
            }
        }
        if (this.f7010) {
            abstractC2375.m4494(this);
        }
    }
}
