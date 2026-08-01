package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.core.util.InterfaceC2188;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.C2598;
import androidx.window.reflection.Consumer2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: androidx.window.layout.adapter.extensions.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2585 implements InterfaceC2188, Consumer2 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final LinkedHashSet f7745;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ReentrantLock f7746;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C2598 f7747;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f7748;

    public C2585(Context context) {
        context.getClass();
        this.f7748 = context;
        this.f7746 = new ReentrantLock();
        this.f7745 = new LinkedHashSet();
    }

    @Override // androidx.core.util.InterfaceC2188
    public final void accept(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.f7746;
        reentrantLock.lock();
        try {
            C2598 c2598M5104 = AbstractC2579.m5104(this.f7748, windowLayoutInfo);
            this.f7747 = c2598M5104;
            Iterator it = this.f7745.iterator();
            while (it.hasNext()) {
                ((InterfaceC2188) it.next()).accept(c2598M5104);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5108(InterfaceC2188 interfaceC2188) {
        ReentrantLock reentrantLock = this.f7746;
        reentrantLock.lock();
        try {
            C2598 c2598 = this.f7747;
            if (c2598 != null) {
                interfaceC2188.accept(c2598);
            }
            this.f7745.add(interfaceC2188);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
