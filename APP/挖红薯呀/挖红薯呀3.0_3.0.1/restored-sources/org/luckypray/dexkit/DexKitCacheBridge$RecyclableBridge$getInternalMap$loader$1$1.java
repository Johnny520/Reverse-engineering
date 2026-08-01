package org.luckypray.dexkit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.luckypray.dexkit.DexKitCacheBridge;
import org.luckypray.dexkit.cache.CacheBridgeRuntime;
import org.luckypray.dexkit.query.base.BaseFinder;
import p000.AbstractC1001ze;
import p000.InterfaceC0298hw;
import p000.InterfaceC0742sw;
import p000.InterfaceC0904ww;
import p000.c50;
import p000.md0;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1 extends c50 implements InterfaceC0298hw {
    final /* synthetic */ InterfaceC0904ww $executor;
    final /* synthetic */ InterfaceC0742sw $mapper;

    /* JADX INFO: Incorrect field signature: TQ; */
    final /* synthetic */ BaseFinder $query;
    final /* synthetic */ DexKitCacheBridge.RecyclableBridge this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lorg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge;Lww;TQ;Lsw;)V */
    public DexKitCacheBridge$RecyclableBridge$getInternalMap$loader$1$1(DexKitCacheBridge.RecyclableBridge recyclableBridge, InterfaceC0904ww interfaceC0904ww, BaseFinder baseFinder, InterfaceC0742sw interfaceC0742sw) {
        super(0);
        this.this$0 = recyclableBridge;
        this.$executor = interfaceC0904ww;
        this.$query = baseFinder;
        this.$mapper = interfaceC0742sw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // p000.InterfaceC0298hw
    public final Map<String, List<R>> invoke() {
        DexKitBridge dexKitBridge;
        boolean z;
        DexKitCacheBridge.RecyclableBridge recyclableBridge = this.this$0;
        InterfaceC0904ww interfaceC0904ww = this.$executor;
        BaseFinder baseFinder = this.$query;
        InterfaceC0742sw interfaceC0742sw = this.$mapper;
        CacheBridgeRuntime runtime = recyclableBridge.getRuntime();
        runtime.beginUse();
        try {
            synchronized (runtime.lifecycleLock) {
                dexKitBridge = runtime.bridge;
                if (dexKitBridge == null) {
                    Object objInvoke = runtime.createBridge.invoke();
                    runtime.bridge = (DexKitBridge) objInvoke;
                    dexKitBridge = (DexKitBridge) objInvoke;
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                runtime.notifyBridgeCreated.invoke();
            }
            Map map = (Map) interfaceC0904ww.invoke(dexKitBridge, baseFinder);
            LinkedHashMap linkedHashMap = new LinkedHashMap(md0.m2495x(map.size()));
            for (Object obj : map.entrySet()) {
                Object key = ((Map.Entry) obj).getKey();
                Iterable iterable = (Iterable) ((Map.Entry) obj).getValue();
                ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(iterable));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(interfaceC0742sw.invoke(it.next()));
                }
                linkedHashMap.put(key, arrayList);
            }
            runtime.endUse();
            return linkedHashMap;
        } catch (Throwable th) {
            runtime.endUse();
            throw th;
        }
    }
}
