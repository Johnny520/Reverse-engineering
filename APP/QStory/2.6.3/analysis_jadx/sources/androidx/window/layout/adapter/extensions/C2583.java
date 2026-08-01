package androidx.window.layout.adapter.extensions;

import android.app.Activity;
import android.content.Context;
import androidx.core.util.InterfaceC2188;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4396;
import p077.C6971;
import p147.C7564;

/* JADX INFO: renamed from: androidx.window.layout.adapter.extensions.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2583 extends C2584 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6971 f7743;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final WindowLayoutComponent f7744;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ReentrantLock f7742 = new ReentrantLock();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LinkedHashMap f7741 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LinkedHashMap f7740 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final LinkedHashMap f7739 = new LinkedHashMap();

    public C2583(WindowLayoutComponent windowLayoutComponent, C6971 c6971) {
        this.f7744 = windowLayoutComponent;
        this.f7743 = c6971;
    }

    @Override // androidx.window.layout.adapter.extensions.C2584, p135.InterfaceC7515
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo5106(Context context, Executor executor, InterfaceC2188 interfaceC2188) {
        LinkedHashMap linkedHashMap = this.f7741;
        context.getClass();
        ReentrantLock reentrantLock = this.f7742;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f7740;
            if (multicastConsumer != null) {
                multicastConsumer.m5102(interfaceC2188);
                linkedHashMap2.put(interfaceC2188, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(interfaceC2188, context);
                multicastConsumer2.m5102(interfaceC2188);
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(EmptyList.INSTANCE));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f7739.put(multicastConsumer2, this.f7743.m12287(this.f7744, AbstractC4396.f12975.mo8917(WindowLayoutInfo.class), (Activity) context, new ExtensionWindowBackendApi1$registerLayoutChangeCallback$1$2$disposableToken$1(multicastConsumer2)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // androidx.window.layout.adapter.extensions.C2584, p135.InterfaceC7515
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo5107(InterfaceC2188 interfaceC2188) {
        LinkedHashMap linkedHashMap = this.f7741;
        LinkedHashMap linkedHashMap2 = this.f7740;
        interfaceC2188.getClass();
        ReentrantLock reentrantLock = this.f7742;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(interfaceC2188);
            if (context == null) {
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            if (multicastConsumer == null) {
                return;
            }
            LinkedHashSet linkedHashSet = multicastConsumer.f7732;
            ReentrantLock reentrantLock2 = multicastConsumer.f7733;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(interfaceC2188);
                reentrantLock2.unlock();
                linkedHashMap2.remove(interfaceC2188);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    C7564 c7564 = (C7564) this.f7739.remove(multicastConsumer);
                    if (c7564 != null) {
                        c7564.f20475.invoke(c7564.f20474, c7564.f20473);
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
