package androidx.core.view;

import androidx.fragment.app.C2325;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2252 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Runnable f6560;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final CopyOnWriteArrayList f6559 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f6558 = new HashMap();

    public C2252(Runnable runnable) {
        this.f6560 = runnable;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4210(InterfaceC2253 interfaceC2253) {
        this.f6559.remove(interfaceC2253);
        C2248 c2248 = (C2248) this.f6558.remove(interfaceC2253);
        if (c2248 != null) {
            c2248.f6550.mo4502(c2248.f6549);
            c2248.f6549 = null;
        }
        this.f6560.run();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m4211() {
        Iterator it = this.f6559.iterator();
        while (it.hasNext()) {
            if (((C2325) ((InterfaceC2253) it.next())).f6826.m4400()) {
                return true;
            }
        }
        return false;
    }
}
