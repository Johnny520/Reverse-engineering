package org.luckypray.dexkit;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.luckypray.dexkit.exceptions.NoResultException;
import org.luckypray.dexkit.exceptions.NonUniqueResultException;
import org.luckypray.dexkit.wrap.InterfaceC5733;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p370.C8958;
import p370.C8959;
import p370.C8960;
import p370.C8961;
import p370.InterfaceC8964;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"D", "Lorg/luckypray/dexkit/wrap/飘花落叶言子楪世哲兰苏;", "R", "L飘花落叶言苏子哲兰世楪/飘花落叶言子楪苏世哲兰;", "invoke", "()L飘花落叶言苏子哲兰世楪/飘花落叶言子楪苏世哲兰;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1 extends Lambda implements InterfaceC6543 {
    final /* synthetic */ InterfaceC6558 $executor;
    final /* synthetic */ InterfaceC6558 $mapper;
    final /* synthetic */ C5743 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1(C5743 c5743, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582) {
        super(0);
        this.this$0 = c5743;
        this.$executor = interfaceC6558;
        this.$mapper = interfaceC65582;
    }

    @Override // p052.InterfaceC6543
    public final InterfaceC8964 invoke() {
        DexKitBridge dexKitBridge;
        boolean z;
        try {
            C5743 c5743 = this.this$0;
            InterfaceC6558 interfaceC6558 = this.$executor;
            InterfaceC6558 interfaceC65582 = this.$mapper;
            C8961 c8961M11135 = c5743.m11135();
            C8961.m14574(c8961M11135);
            try {
                synchronized (c8961M11135.f25174) {
                    dexKitBridge = c8961M11135.f25168;
                    if (dexKitBridge == null) {
                        Object objInvoke = c8961M11135.f25163.invoke();
                        c8961M11135.f25168 = (DexKitBridge) objInvoke;
                        dexKitBridge = (DexKitBridge) objInvoke;
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    c8961M11135.f25162.invoke();
                }
                Object objInvoke2 = interfaceC6558.invoke(dexKitBridge);
                InterfaceC8964 c8960 = objInvoke2 == null ? new C8960() : new C8958((InterfaceC5733) interfaceC65582.invoke(objInvoke2));
                C8961.m14573(c8961M11135);
                return c8960;
            } catch (Throwable th) {
                C8961.m14573(c8961M11135);
                throw th;
            }
        } catch (NoResultException e) {
            return new C8960(e);
        } catch (NonUniqueResultException e2) {
            return new C8959(e2);
        }
    }
}
