package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2431 implements InterfaceC2388 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C2431 f7086 = new C2431();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Handler f7087;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f7092;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f7094;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f7093 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f7088 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C2386 f7090 = new C2386(this, true);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final RunnableC2371 f7091 = new Runnable() { // from class: androidx.lifecycle.飘花落叶言子世兰苏哲楪
        @Override // java.lang.Runnable
        public final void run() {
            C2431 c2431 = this.f6995;
            C2386 c2386 = c2431.f7090;
            if (c2431.f7092 == 0) {
                c2431.f7093 = true;
                c2386.m4489(Lifecycle$Event.ON_PAUSE);
            }
            if (c2431.f7094 == 0 && c2431.f7093) {
                c2386.m4489(Lifecycle$Event.ON_STOP);
                c2431.f7088 = true;
            }
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C2422 f7089 = new C2422(this);

    @Override // androidx.lifecycle.InterfaceC2388
    public final AbstractC2402 getLifecycle() {
        return this.f7090;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4516() {
        int i = this.f7092 + 1;
        this.f7092 = i;
        if (i == 1) {
            if (this.f7093) {
                this.f7090.m4489(Lifecycle$Event.ON_RESUME);
                this.f7093 = false;
            } else {
                Handler handler = this.f7087;
                handler.getClass();
                handler.removeCallbacks(this.f7091);
            }
        }
    }
}
