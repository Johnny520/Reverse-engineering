package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.core.util.InterfaceC3021;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.C3431;
import androidx.window.reflection.Consumer2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: androidx.window.layout.adapter.extensions.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3418 implements InterfaceC3021, Consumer2 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final LinkedHashSet f8090;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ReentrantLock f8091;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C3431 f8092;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Context f8093;

    public C3418(Context context) {
        context.getClass();
        this.f8093 = context;
        this.f8091 = new ReentrantLock();
        this.f8090 = new LinkedHashSet();
    }

    @Override // androidx.core.util.InterfaceC3021
    public final void accept(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.f8091;
        reentrantLock.lock();
        try {
            C3431 c3431M5664 = AbstractC3412.m5664(this.f8093, windowLayoutInfo);
            this.f8092 = c3431M5664;
            Iterator it = this.f8090.iterator();
            while (it.hasNext()) {
                ((InterfaceC3021) it.next()).accept(c3431M5664);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5668(InterfaceC3021 interfaceC3021) {
        ReentrantLock reentrantLock = this.f8091;
        reentrantLock.lock();
        try {
            C3431 c3431 = this.f8092;
            if (c3431 != null) {
                interfaceC3021.accept(c3431);
            }
            this.f8090.add(interfaceC3021);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
