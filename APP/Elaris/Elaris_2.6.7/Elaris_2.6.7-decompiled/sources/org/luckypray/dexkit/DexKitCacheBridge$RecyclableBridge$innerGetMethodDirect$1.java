package org.luckypray.dexkit;

import org.luckypray.dexkit.result.MethodData;
import org.luckypray.dexkit.wrap.DexMethod;
import p000.AbstractC0184d9;
import p000.InterfaceC0482u5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitCacheBridge$RecyclableBridge$innerGetMethodDirect$1 extends AbstractC0184d9 implements InterfaceC0482u5 {
    public static final DexKitCacheBridge$RecyclableBridge$innerGetMethodDirect$1 INSTANCE = new DexKitCacheBridge$RecyclableBridge$innerGetMethodDirect$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DexKitCacheBridge$RecyclableBridge$innerGetMethodDirect$1() {
        super(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p000.InterfaceC0482u5
    public final DexMethod invoke(MethodData methodData) {
        methodData.getClass();
        return methodData.toDexMethod();
    }
}
