package org.luckypray.dexkit;

import Yue.AbstractC5673;
import Yue.InterfaceC5122;
import Yue.InterfaceC5124;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC7507;
import org.luckypray.dexkit.DexKitCacheBridge;
import org.luckypray.dexkit.cache.CacheBridgeRuntime;
import org.luckypray.dexkit.cache.CacheBridgeStore;
import org.luckypray.dexkit.exceptions.NoResultException;
import org.luckypray.dexkit.exceptions.NonUniqueResultException;
import org.luckypray.dexkit.wrap.ISerializable;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m2699d2 = {"<anonymous>", "Lorg/luckypray/dexkit/cache/CacheBridgeStore$SingleOutcome;", "R", "D", "Lorg/luckypray/dexkit/wrap/ISerializable;", "invoke"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
@InterfaceC7507({"SMAP\nDexKitCacheBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1\n+ 2 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge\n+ 3 CacheBridgeRuntime.kt\norg/luckypray/dexkit/cache/CacheBridgeRuntime\n*L\n1#1,1819:1\n295#2:1820\n91#3,16:1821\n*S KotlinDebug\n*F\n+ 1 DexKitCacheBridge.kt\norg/luckypray/dexkit/DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1\n*L\n1756#1:1820\n1756#1:1821,16\n*E\n"})
public final class C2921x95b222e4<R> extends AbstractC5673 implements InterfaceC5122<CacheBridgeStore.SingleOutcome<? extends R>> {
    final /* synthetic */ InterfaceC5124<DexKitBridge, D> $executor;
    final /* synthetic */ InterfaceC5124<D, R> $mapper;
    final /* synthetic */ DexKitCacheBridge.RecyclableBridge this$0;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۡ۟<? super org.luckypray.dexkit.DexKitBridge, ? extends D> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۡ۟<? super D, ? extends R> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2921x95b222e4(DexKitCacheBridge.RecyclableBridge recyclableBridge, InterfaceC5124<? super DexKitBridge, ? extends D> interfaceC5124, InterfaceC5124<? super D, ? extends R> interfaceC51242) {
        super(0);
        this.this$0 = recyclableBridge;
        this.$executor = interfaceC5124;
        this.$mapper = interfaceC51242;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // Yue.InterfaceC5122
    @InterfaceC6399
    public final CacheBridgeStore.SingleOutcome<R> invoke() {
        DexKitBridge dexKitBridge;
        boolean z;
        try {
            DexKitCacheBridge.RecyclableBridge recyclableBridge = this.this$0;
            InterfaceC5124<DexKitBridge, D> interfaceC5124 = this.$executor;
            InterfaceC5124<D, R> interfaceC51242 = this.$mapper;
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
                Object objInvoke2 = interfaceC5124.invoke(dexKitBridge);
                CacheBridgeStore.SingleOutcome<R> noResult = objInvoke2 == null ? new CacheBridgeStore.SingleOutcome.NoResult(null, 1, null) : new CacheBridgeStore.SingleOutcome.Value((ISerializable) interfaceC51242.invoke((D) objInvoke2));
                runtime.endUse();
                return noResult;
            } catch (Throwable th) {
                runtime.endUse();
                throw th;
            }
        } catch (NoResultException e) {
            return new CacheBridgeStore.SingleOutcome.NoResult(e);
        } catch (NonUniqueResultException e2) {
            return new CacheBridgeStore.SingleOutcome.NonUnique(e2);
        }
    }
}
