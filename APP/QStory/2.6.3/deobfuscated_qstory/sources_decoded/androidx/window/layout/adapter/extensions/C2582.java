package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.core.util.InterfaceC2188;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p077.C6971;

/* JADX INFO: renamed from: androidx.window.layout.adapter.extensions.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2582 extends C2583 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final LinkedHashMap f7736;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ReentrantLock f7737;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final LinkedHashMap f7738;

    public C2582(WindowLayoutComponent windowLayoutComponent, C6971 c6971) {
        super(windowLayoutComponent, c6971);
        this.f7737 = new ReentrantLock();
        this.f7736 = new LinkedHashMap();
        this.f7738 = new LinkedHashMap();
    }

    @Override // androidx.window.layout.adapter.extensions.C2583, androidx.window.layout.adapter.extensions.C2584, p135.InterfaceC7515
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo5106(Context context, Executor executor, InterfaceC2188 interfaceC2188) {
        LinkedHashMap linkedHashMap = this.f7736;
        context.getClass();
        ReentrantLock reentrantLock = this.f7737;
        reentrantLock.lock();
        try {
            C2585 c2585 = (C2585) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f7738;
            if (c2585 != null) {
                c2585.m5108(interfaceC2188);
                linkedHashMap2.put(interfaceC2188, context);
            } else {
                C2585 c25852 = new C2585(context);
                linkedHashMap.put(context, c25852);
                linkedHashMap2.put(interfaceC2188, context);
                c25852.m5108(interfaceC2188);
                this.f7744.addWindowLayoutInfoListener(context, c25852);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // androidx.window.layout.adapter.extensions.C2583, androidx.window.layout.adapter.extensions.C2584, p135.InterfaceC7515
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo5107(InterfaceC2188 interfaceC2188) {
        LinkedHashMap linkedHashMap = this.f7736;
        LinkedHashMap linkedHashMap2 = this.f7738;
        interfaceC2188.getClass();
        ReentrantLock reentrantLock = this.f7737;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(interfaceC2188);
            if (context == null) {
                return;
            }
            C2585 c2585 = (C2585) linkedHashMap.get(context);
            if (c2585 == null) {
                return;
            }
            ReentrantLock reentrantLock2 = c2585.f7746;
            reentrantLock2.lock();
            try {
                c2585.f7745.remove(interfaceC2188);
                reentrantLock2.unlock();
                linkedHashMap2.remove(interfaceC2188);
                if (c2585.f7745.isEmpty()) {
                    linkedHashMap.remove(context);
                    this.f7744.removeWindowLayoutInfoListener(c2585);
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
