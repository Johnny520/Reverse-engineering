package androidx.core.view;

import androidx.fragment.app.C3158;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3085 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Runnable f6905;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final CopyOnWriteArrayList f6904 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f6903 = new HashMap();

    public C3085(Runnable runnable) {
        this.f6905 = runnable;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4770(InterfaceC3086 interfaceC3086) {
        this.f6904.remove(interfaceC3086);
        C3081 c3081 = (C3081) this.f6903.remove(interfaceC3086);
        if (c3081 != null) {
            c3081.f6895.mo5062(c3081.f6894);
            c3081.f6894 = null;
        }
        this.f6905.run();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m4771() {
        Iterator it = this.f6904.iterator();
        while (it.hasNext()) {
            if (((C3158) ((InterfaceC3086) it.next())).f7171.m4960()) {
                return true;
            }
        }
        return false;
    }
}
