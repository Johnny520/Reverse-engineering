package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.core.util.InterfaceC3021;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p093.C7800;

/* JADX INFO: renamed from: androidx.window.layout.adapter.extensions.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3415 extends C3416 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final LinkedHashMap f8081;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ReentrantLock f8082;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final LinkedHashMap f8083;

    public C3415(WindowLayoutComponent windowLayoutComponent, C7800 c7800) {
        super(windowLayoutComponent, c7800);
        this.f8082 = new ReentrantLock();
        this.f8081 = new LinkedHashMap();
        this.f8083 = new LinkedHashMap();
    }

    @Override // androidx.window.layout.adapter.extensions.C3416, androidx.window.layout.adapter.extensions.C3417, p151.InterfaceC8344
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo5666(Context context, Executor executor, InterfaceC3021 interfaceC3021) {
        LinkedHashMap linkedHashMap = this.f8081;
        context.getClass();
        ReentrantLock reentrantLock = this.f8082;
        reentrantLock.lock();
        try {
            C3418 c3418 = (C3418) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f8083;
            if (c3418 != null) {
                c3418.m5668(interfaceC3021);
                linkedHashMap2.put(interfaceC3021, context);
            } else {
                C3418 c34182 = new C3418(context);
                linkedHashMap.put(context, c34182);
                linkedHashMap2.put(interfaceC3021, context);
                c34182.m5668(interfaceC3021);
                this.f8089.addWindowLayoutInfoListener(context, c34182);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // androidx.window.layout.adapter.extensions.C3416, androidx.window.layout.adapter.extensions.C3417, p151.InterfaceC8344
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo5667(InterfaceC3021 interfaceC3021) {
        LinkedHashMap linkedHashMap = this.f8081;
        LinkedHashMap linkedHashMap2 = this.f8083;
        interfaceC3021.getClass();
        ReentrantLock reentrantLock = this.f8082;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(interfaceC3021);
            if (context == null) {
                return;
            }
            C3418 c3418 = (C3418) linkedHashMap.get(context);
            if (c3418 == null) {
                return;
            }
            ReentrantLock reentrantLock2 = c3418.f8091;
            reentrantLock2.lock();
            try {
                c3418.f8090.remove(interfaceC3021);
                reentrantLock2.unlock();
                linkedHashMap2.remove(interfaceC3021);
                if (c3418.f8090.isEmpty()) {
                    linkedHashMap.remove(context);
                    this.f8089.removeWindowLayoutInfoListener(c3418);
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
