package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2376 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2375 f7007;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f7008 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f7009;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2370 f7010;

    public C2376(AbstractC2375 abstractC2375, InterfaceC2370 interfaceC2370) {
        this.f7007 = abstractC2375;
        this.f7010 = interfaceC2370;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4485(boolean z) {
        if (z == this.f7009) {
            return;
        }
        this.f7009 = z;
        int i = z ? 1 : -1;
        AbstractC2375 abstractC2375 = this.f7007;
        int i2 = abstractC2375.f7001;
        abstractC2375.f7001 = i + i2;
        if (!abstractC2375.f7000) {
            abstractC2375.f7000 = true;
            while (true) {
                try {
                    int i3 = abstractC2375.f7001;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    abstractC2375.f7000 = false;
                }
            }
        }
        if (this.f7009) {
            abstractC2375.m4484(this);
        }
    }
}
