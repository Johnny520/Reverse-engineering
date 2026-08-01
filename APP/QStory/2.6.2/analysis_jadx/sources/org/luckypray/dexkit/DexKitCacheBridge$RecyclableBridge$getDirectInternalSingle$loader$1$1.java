package org.luckypray.dexkit;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.luckypray.dexkit.exceptions.NoResultException;
import org.luckypray.dexkit.exceptions.NonUniqueResultException;
import org.luckypray.dexkit.wrap.InterfaceC5732;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p367.C8949;
import p367.C8950;
import p367.C8951;
import p367.C8952;
import p367.InterfaceC8955;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"D", "Lorg/luckypray/dexkit/wrap/飘花落叶言子楪世哲兰苏;", "R", "L飘花落叶言苏子兰楪世哲/飘花落叶言子楪苏世哲兰;", "invoke", "()L飘花落叶言苏子兰楪世哲/飘花落叶言子楪苏世哲兰;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1 extends Lambda implements InterfaceC6542 {
    final /* synthetic */ InterfaceC6557 $executor;
    final /* synthetic */ InterfaceC6557 $mapper;
    final /* synthetic */ C5742 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1(C5742 c5742, InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572) {
        super(0);
        this.this$0 = c5742;
        this.$executor = interfaceC6557;
        this.$mapper = interfaceC65572;
    }

    @Override // p052.InterfaceC6542
    public final InterfaceC8955 invoke() {
        DexKitBridge dexKitBridge;
        boolean z;
        try {
            C5742 c5742 = this.this$0;
            InterfaceC6557 interfaceC6557 = this.$executor;
            InterfaceC6557 interfaceC65572 = this.$mapper;
            C8952 c8952M11078 = c5742.m11078();
            C8952.m14542(c8952M11078);
            try {
                synchronized (c8952M11078.f25173) {
                    dexKitBridge = c8952M11078.f25167;
                    if (dexKitBridge == null) {
                        Object objInvoke = c8952M11078.f25162.invoke();
                        c8952M11078.f25167 = (DexKitBridge) objInvoke;
                        dexKitBridge = (DexKitBridge) objInvoke;
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    c8952M11078.f25161.invoke();
                }
                Object objInvoke2 = interfaceC6557.invoke(dexKitBridge);
                InterfaceC8955 c8951 = objInvoke2 == null ? new C8951() : new C8949((InterfaceC5732) interfaceC65572.invoke(objInvoke2));
                C8952.m14541(c8952M11078);
                return c8951;
            } catch (Throwable th) {
                C8952.m14541(c8952M11078);
                throw th;
            }
        } catch (NoResultException e) {
            return new C8951(e);
        } catch (NonUniqueResultException e2) {
            return new C8950(e2);
        }
    }
}
