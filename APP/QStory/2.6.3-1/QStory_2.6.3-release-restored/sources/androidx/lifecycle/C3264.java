package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3264 implements InterfaceC3221 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C3264 f7432 = new C3264();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Handler f7433;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f7438;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f7440;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f7439 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f7434 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C3219 f7436 = new C3219(this, true);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final RunnableC3204 f7437 = new Runnable() { // from class: androidx.lifecycle.飘花落叶言子世兰苏哲楪
        @Override // java.lang.Runnable
        public final void run() {
            C3264 c3264 = this.f7341;
            C3219 c3219 = c3264.f7436;
            if (c3264.f7438 == 0) {
                c3264.f7439 = true;
                c3219.m5059(Lifecycle$Event.ON_PAUSE);
            }
            if (c3264.f7440 == 0 && c3264.f7439) {
                c3219.m5059(Lifecycle$Event.ON_STOP);
                c3264.f7434 = true;
            }
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C3255 f7435 = new C3255(this);

    @Override // androidx.lifecycle.InterfaceC3221
    public final AbstractC3235 getLifecycle() {
        return this.f7436;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5086() {
        int i = this.f7438 + 1;
        this.f7438 = i;
        if (i == 1) {
            if (this.f7439) {
                this.f7436.m5059(Lifecycle$Event.ON_RESUME);
                this.f7439 = false;
            } else {
                Handler handler = this.f7433;
                handler.getClass();
                handler.removeCallbacks(this.f7437);
            }
        }
    }
}
