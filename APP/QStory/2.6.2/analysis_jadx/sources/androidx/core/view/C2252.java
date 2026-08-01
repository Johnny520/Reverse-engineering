package androidx.core.view;

import androidx.fragment.app.C2325;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2252 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Runnable f6559;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final CopyOnWriteArrayList f6558 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f6557 = new HashMap();

    public C2252(Runnable runnable) {
        this.f6559 = runnable;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4200(InterfaceC2253 interfaceC2253) {
        this.f6558.remove(interfaceC2253);
        C2248 c2248 = (C2248) this.f6557.remove(interfaceC2253);
        if (c2248 != null) {
            c2248.f6549.mo4492(c2248.f6548);
            c2248.f6548 = null;
        }
        this.f6559.run();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m4201() {
        Iterator it = this.f6558.iterator();
        while (it.hasNext()) {
            if (((C2325) ((InterfaceC2253) it.next())).f6825.m4390()) {
                return true;
            }
        }
        return false;
    }
}
