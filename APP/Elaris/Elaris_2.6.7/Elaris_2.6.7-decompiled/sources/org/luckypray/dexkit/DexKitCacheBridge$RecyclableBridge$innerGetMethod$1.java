package org.luckypray.dexkit;

import java.util.List;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.result.MethodData;
import p000.AbstractC0184d9;
import p000.InterfaceC0546y5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitCacheBridge$RecyclableBridge$innerGetMethod$1 extends AbstractC0184d9 implements InterfaceC0546y5 {
    public static final DexKitCacheBridge$RecyclableBridge$innerGetMethod$1 INSTANCE = new DexKitCacheBridge$RecyclableBridge$innerGetMethod$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DexKitCacheBridge$RecyclableBridge$innerGetMethod$1() {
        super(2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p000.InterfaceC0546y5
    public final List<MethodData> invoke(DexKitBridge dexKitBridge, FindMethod findMethod) {
        dexKitBridge.getClass();
        findMethod.getClass();
        return dexKitBridge.findMethod(findMethod);
    }
}
