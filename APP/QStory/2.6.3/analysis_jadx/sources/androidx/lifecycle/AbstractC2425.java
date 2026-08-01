package androidx.lifecycle;

import java.util.Iterator;
import p139.C7532;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2425 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7532 f7071 = new C7532();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4522() {
        C7532 c7532 = this.f7071;
        if (c7532 != null && !c7532.f20411) {
            c7532.f20411 = true;
            synchronized (c7532.f20414) {
                try {
                    Iterator it = c7532.f20413.values().iterator();
                    while (it.hasNext()) {
                        C7532.m12756((AutoCloseable) it.next());
                    }
                    Iterator it2 = c7532.f20412.iterator();
                    while (it2.hasNext()) {
                        C7532.m12756((AutoCloseable) it2.next());
                    }
                    c7532.f20412.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        mo3485();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo3485() {
    }
}
