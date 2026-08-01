package androidx.lifecycle;

import java.util.Iterator;
import p139.C7531;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2425 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7531 f7070 = new C7531();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4512() {
        C7531 c7531 = this.f7070;
        if (c7531 != null && !c7531.f20416) {
            c7531.f20416 = true;
            synchronized (c7531.f20419) {
                try {
                    Iterator it = c7531.f20418.values().iterator();
                    while (it.hasNext()) {
                        C7531.m12727((AutoCloseable) it.next());
                    }
                    Iterator it2 = c7531.f20417.iterator();
                    while (it2.hasNext()) {
                        C7531.m12727((AutoCloseable) it2.next());
                    }
                    c7531.f20417.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        mo3475();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo3475() {
    }
}
