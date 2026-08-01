package org.luckypray.dexkit;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.Lambda;
import org.luckypray.dexkit.exceptions.NonUniqueResultException;
import org.luckypray.dexkit.wrap.InterfaceC5732;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p364.AbstractC8943;
import p367.C8949;
import p367.C8950;
import p367.C8951;
import p367.C8952;
import p367.InterfaceC8955;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\b\b\u0002\u0010\u0004*\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"L飘花落叶言苏子兰世楪哲/飘花落叶言子楪世苏哲兰;", "Q", "D", "Lorg/luckypray/dexkit/wrap/飘花落叶言子楪世哲兰苏;", "R", "L飘花落叶言苏子兰楪世哲/飘花落叶言子楪苏世哲兰;", "invoke", "()L飘花落叶言苏子兰楪世哲/飘花落叶言子楪苏世哲兰;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 extends Lambda implements InterfaceC6542 {
    final /* synthetic */ InterfaceC6553 $executor;
    final /* synthetic */ InterfaceC6557 $mapper;
    final /* synthetic */ AbstractC8943 $query;
    final /* synthetic */ C5742 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1(C5742 c5742, InterfaceC6553 interfaceC6553, AbstractC8943 abstractC8943, InterfaceC6557 interfaceC6557) {
        super(0);
        this.this$0 = c5742;
        this.$executor = interfaceC6553;
        this.$query = abstractC8943;
        this.$mapper = interfaceC6557;
    }

    @Override // p052.InterfaceC6542
    public final InterfaceC8955 invoke() {
        DexKitBridge dexKitBridge;
        int i;
        boolean z;
        InterfaceC8955 c8949;
        C5742 c5742 = this.this$0;
        InterfaceC6553 interfaceC6553 = this.$executor;
        AbstractC8943 abstractC8943 = this.$query;
        InterfaceC6557 interfaceC6557 = this.$mapper;
        C8952 c8952M11078 = c5742.m11078();
        C8952.m14542(c8952M11078);
        try {
            synchronized (c8952M11078.f25173) {
                dexKitBridge = c8952M11078.f25167;
                i = 1;
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
            List list = (List) interfaceC6553.invoke(dexKitBridge, abstractC8943);
            Object objM8830 = AbstractC4343.m8830(list);
            if (objM8830 != null) {
                int size = list.size();
                while (true) {
                    if (i >= size) {
                        c8949 = new C8949((InterfaceC5732) interfaceC6557.invoke(objM8830));
                        break;
                    }
                    if (!objM8830.equals(list.get(i))) {
                        c8949 = new C8950(new NonUniqueResultException(list.size()));
                        break;
                    }
                    i++;
                }
            } else {
                c8949 = new C8951();
            }
            C8952.m14541(c8952M11078);
            return c8949;
        } catch (Throwable th) {
            C8952.m14541(c8952M11078);
            throw th;
        }
    }
}
