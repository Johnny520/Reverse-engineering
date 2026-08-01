package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2431 implements InterfaceC2388 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C2431 f7087 = new C2431();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Handler f7088;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f7093;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f7095;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f7094 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f7089 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C2386 f7091 = new C2386(this, true);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final RunnableC2371 f7092 = new Runnable() { // from class: androidx.lifecycle.飘花落叶言子世兰苏哲楪
        @Override // java.lang.Runnable
        public final void run() {
            C2431 c2431 = this.f6996;
            C2386 c2386 = c2431.f7091;
            if (c2431.f7093 == 0) {
                c2431.f7094 = true;
                c2386.m4499(Lifecycle$Event.ON_PAUSE);
            }
            if (c2431.f7095 == 0 && c2431.f7094) {
                c2386.m4499(Lifecycle$Event.ON_STOP);
                c2431.f7089 = true;
            }
        }
    };

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C2422 f7090 = new C2422(this);

    @Override // androidx.lifecycle.InterfaceC2388
    public final AbstractC2402 getLifecycle() {
        return this.f7091;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4526() {
        int i = this.f7093 + 1;
        this.f7093 = i;
        if (i == 1) {
            if (this.f7094) {
                this.f7091.m4499(Lifecycle$Event.ON_RESUME);
                this.f7094 = false;
            } else {
                Handler handler = this.f7088;
                handler.getClass();
                handler.removeCallbacks(this.f7092);
            }
        }
    }
}
