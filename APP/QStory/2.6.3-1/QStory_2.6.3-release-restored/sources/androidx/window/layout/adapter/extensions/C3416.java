package androidx.window.layout.adapter.extensions;

import android.app.Activity;
import android.content.Context;
import androidx.core.util.InterfaceC3021;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5228;
import p093.C7800;
import p163.C8393;

/* JADX INFO: renamed from: androidx.window.layout.adapter.extensions.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3416 extends C3417 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7800 f8088;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final WindowLayoutComponent f8089;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ReentrantLock f8087 = new ReentrantLock();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LinkedHashMap f8086 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LinkedHashMap f8085 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final LinkedHashMap f8084 = new LinkedHashMap();

    public C3416(WindowLayoutComponent windowLayoutComponent, C7800 c7800) {
        this.f8089 = windowLayoutComponent;
        this.f8088 = c7800;
    }

    @Override // androidx.window.layout.adapter.extensions.C3417, p151.InterfaceC8344
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo5666(Context context, Executor executor, InterfaceC3021 interfaceC3021) {
        LinkedHashMap linkedHashMap = this.f8086;
        context.getClass();
        ReentrantLock reentrantLock = this.f8087;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f8085;
            if (multicastConsumer != null) {
                multicastConsumer.m5662(interfaceC3021);
                linkedHashMap2.put(interfaceC3021, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(interfaceC3021, context);
                multicastConsumer2.m5662(interfaceC3021);
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(EmptyList.INSTANCE));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f8084.put(multicastConsumer2, this.f8088.m12846(this.f8089, AbstractC5228.f13320.mo9476(WindowLayoutInfo.class), (Activity) context, new C0232xa108efe7(multicastConsumer2)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // androidx.window.layout.adapter.extensions.C3417, p151.InterfaceC8344
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo5667(InterfaceC3021 interfaceC3021) {
        LinkedHashMap linkedHashMap = this.f8086;
        LinkedHashMap linkedHashMap2 = this.f8085;
        interfaceC3021.getClass();
        ReentrantLock reentrantLock = this.f8087;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(interfaceC3021);
            if (context == null) {
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            if (multicastConsumer == null) {
                return;
            }
            LinkedHashSet linkedHashSet = multicastConsumer.f8077;
            ReentrantLock reentrantLock2 = multicastConsumer.f8078;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(interfaceC3021);
                reentrantLock2.unlock();
                linkedHashMap2.remove(interfaceC3021);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    C8393 c8393 = (C8393) this.f8084.remove(multicastConsumer);
                    if (c8393 != null) {
                        c8393.f20820.invoke(c8393.f20819, c8393.f20818);
                    }
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
