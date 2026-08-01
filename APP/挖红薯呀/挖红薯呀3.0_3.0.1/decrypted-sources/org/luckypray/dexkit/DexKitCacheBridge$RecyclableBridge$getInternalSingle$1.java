package org.luckypray.dexkit;

import org.luckypray.dexkit.DexKitCacheBridge;
import p000.C0299hx;
import p000.InterfaceC0298hw;
import p000.na1;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class DexKitCacheBridge$RecyclableBridge$getInternalSingle$1 extends C0299hx implements InterfaceC0298hw {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DexKitCacheBridge$RecyclableBridge$getInternalSingle$1(Object obj) {
        super(0, 0, DexKitCacheBridge.RecyclableBridge.class, obj, "ensureUsable", "ensureUsable()V");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Possible override for method hw.invoke()Ljava/lang/Object; */
    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m5655invoke() {
        ((DexKitCacheBridge.RecyclableBridge) this.receiver).ensureUsable();
    }

    @Override // p000.InterfaceC0298hw
    public /* bridge */ /* synthetic */ Object invoke() {
        m5655invoke();
        return na1.f4229a;
    }
}
