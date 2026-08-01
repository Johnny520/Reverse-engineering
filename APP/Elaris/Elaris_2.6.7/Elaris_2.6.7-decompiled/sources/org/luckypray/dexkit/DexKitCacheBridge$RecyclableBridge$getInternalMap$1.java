package org.luckypray.dexkit;

import org.luckypray.dexkit.DexKitCacheBridge;
import p000.AbstractC0245h6;
import p000.C0022b5;
import p000.InterfaceC0279j5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class DexKitCacheBridge$RecyclableBridge$getInternalMap$1 extends AbstractC0245h6 implements InterfaceC0279j5 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DexKitCacheBridge$RecyclableBridge$getInternalMap$1(Object obj) {
        super(0, obj, DexKitCacheBridge.RecyclableBridge.class, "ensureUsable", "ensureUsable()V");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Possible override for method j5.invoke()Ljava/lang/Object; */
    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m1223invoke() {
        ((DexKitCacheBridge.RecyclableBridge) this.receiver).ensureUsable();
    }

    @Override // p000.InterfaceC0279j5
    public /* bridge */ /* synthetic */ Object invoke() {
        m1223invoke();
        return C0022b5.f60d;
    }
}
