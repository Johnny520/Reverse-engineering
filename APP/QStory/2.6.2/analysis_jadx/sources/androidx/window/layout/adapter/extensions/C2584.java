package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.core.util.InterfaceC2188;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.C2597;
import androidx.window.reflection.Consumer2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: androidx.window.layout.adapter.extensions.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2584 implements InterfaceC2188, Consumer2 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final LinkedHashSet f7743;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ReentrantLock f7744;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C2597 f7745;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f7746;

    public C2584(Context context) {
        context.getClass();
        this.f7746 = context;
        this.f7744 = new ReentrantLock();
        this.f7743 = new LinkedHashSet();
    }

    @Override // androidx.core.util.InterfaceC2188
    public final void accept(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.f7744;
        reentrantLock.lock();
        try {
            C2597 c2597M5059 = AbstractC2578.m5059(this.f7746, windowLayoutInfo);
            this.f7745 = c2597M5059;
            Iterator it = this.f7743.iterator();
            while (it.hasNext()) {
                ((InterfaceC2188) it.next()).accept(c2597M5059);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5063(InterfaceC2188 interfaceC2188) {
        ReentrantLock reentrantLock = this.f7744;
        reentrantLock.lock();
        try {
            C2597 c2597 = this.f7745;
            if (c2597 != null) {
                interfaceC2188.accept(c2597);
            }
            this.f7743.add(interfaceC2188);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
