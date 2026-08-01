package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.core.util.InterfaceC2188;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p077.C6970;

/* JADX INFO: renamed from: androidx.window.layout.adapter.extensions.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2581 extends C2582 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final LinkedHashMap f7734;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ReentrantLock f7735;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final LinkedHashMap f7736;

    public C2581(WindowLayoutComponent windowLayoutComponent, C6970 c6970) {
        super(windowLayoutComponent, c6970);
        this.f7735 = new ReentrantLock();
        this.f7734 = new LinkedHashMap();
        this.f7736 = new LinkedHashMap();
    }

    @Override // androidx.window.layout.adapter.extensions.C2582, androidx.window.layout.adapter.extensions.C2583, p135.InterfaceC7514
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo5061(Context context, Executor executor, InterfaceC2188 interfaceC2188) {
        LinkedHashMap linkedHashMap = this.f7734;
        context.getClass();
        ReentrantLock reentrantLock = this.f7735;
        reentrantLock.lock();
        try {
            C2584 c2584 = (C2584) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f7736;
            if (c2584 != null) {
                c2584.m5063(interfaceC2188);
                linkedHashMap2.put(interfaceC2188, context);
            } else {
                C2584 c25842 = new C2584(context);
                linkedHashMap.put(context, c25842);
                linkedHashMap2.put(interfaceC2188, context);
                c25842.m5063(interfaceC2188);
                this.f7742.addWindowLayoutInfoListener(context, c25842);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // androidx.window.layout.adapter.extensions.C2582, androidx.window.layout.adapter.extensions.C2583, p135.InterfaceC7514
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo5062(InterfaceC2188 interfaceC2188) {
        LinkedHashMap linkedHashMap = this.f7734;
        LinkedHashMap linkedHashMap2 = this.f7736;
        interfaceC2188.getClass();
        ReentrantLock reentrantLock = this.f7735;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(interfaceC2188);
            if (context == null) {
                return;
            }
            C2584 c2584 = (C2584) linkedHashMap.get(context);
            if (c2584 == null) {
                return;
            }
            ReentrantLock reentrantLock2 = c2584.f7744;
            reentrantLock2.lock();
            try {
                c2584.f7743.remove(interfaceC2188);
                reentrantLock2.unlock();
                linkedHashMap2.remove(interfaceC2188);
                if (c2584.f7743.isEmpty()) {
                    linkedHashMap.remove(context);
                    this.f7742.removeWindowLayoutInfoListener(c2584);
                }
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
