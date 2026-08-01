package androidx.lifecycle;

import java.util.Iterator;
import p155.C8361;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3258 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8361 f7416 = new C8361();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5082() {
        C8361 c8361 = this.f7416;
        if (c8361 != null && !c8361.f20756) {
            c8361.f20756 = true;
            synchronized (c8361.f20759) {
                try {
                    Iterator it = c8361.f20758.values().iterator();
                    while (it.hasNext()) {
                        C8361.m13315((AutoCloseable) it.next());
                    }
                    Iterator it2 = c8361.f20757.iterator();
                    while (it2.hasNext()) {
                        C8361.m13315((AutoCloseable) it2.next());
                    }
                    c8361.f20757.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        mo4045();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo4045() {
    }
}
