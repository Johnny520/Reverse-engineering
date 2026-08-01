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
import kotlin.jvm.internal.AbstractC4395;
import p077.C6970;
import p147.C7563;

/* JADX INFO: renamed from: androidx.window.layout.adapter.extensions.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2582 extends C2583 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6970 f7741;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final WindowLayoutComponent f7742;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ReentrantLock f7740 = new ReentrantLock();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final LinkedHashMap f7739 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LinkedHashMap f7738 = new LinkedHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final LinkedHashMap f7737 = new LinkedHashMap();

    public C2582(WindowLayoutComponent windowLayoutComponent, C6970 c6970) {
        this.f7742 = windowLayoutComponent;
        this.f7741 = c6970;
    }

    @Override // androidx.window.layout.adapter.extensions.C2583, p135.InterfaceC7514
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo5061(Context context, Executor executor, InterfaceC2188 interfaceC2188) {
        LinkedHashMap linkedHashMap = this.f7739;
        context.getClass();
        ReentrantLock reentrantLock = this.f7740;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f7738;
            if (multicastConsumer != null) {
                multicastConsumer.m5057(interfaceC2188);
                linkedHashMap2.put(interfaceC2188, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(interfaceC2188, context);
                multicastConsumer2.m5057(interfaceC2188);
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(EmptyList.INSTANCE));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f7737.put(multicastConsumer2, this.f7741.m12260(this.f7742, AbstractC4395.f12971.mo8927(WindowLayoutInfo.class), (Activity) context, new ExtensionWindowBackendApi1$registerLayoutChangeCallback$1$2$disposableToken$1(multicastConsumer2)));
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // androidx.window.layout.adapter.extensions.C2583, p135.InterfaceC7514
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo5062(InterfaceC2188 interfaceC2188) {
        LinkedHashMap linkedHashMap = this.f7739;
        LinkedHashMap linkedHashMap2 = this.f7738;
        interfaceC2188.getClass();
        ReentrantLock reentrantLock = this.f7740;
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
            LinkedHashSet linkedHashSet = multicastConsumer.f7730;
            ReentrantLock reentrantLock2 = multicastConsumer.f7731;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(interfaceC2188);
                reentrantLock2.unlock();
                linkedHashMap2.remove(interfaceC2188);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    C7563 c7563 = (C7563) this.f7737.remove(multicastConsumer);
                    if (c7563 != null) {
                        c7563.f20480.invoke(c7563.f20479, c7563.f20478);
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
