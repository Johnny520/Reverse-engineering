package org.luckypray.dexkit;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.Lambda;
import org.luckypray.dexkit.exceptions.NonUniqueResultException;
import org.luckypray.dexkit.wrap.InterfaceC6563;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p383.AbstractC9784;
import p386.C9787;
import p386.C9788;
import p386.C9789;
import p386.C9790;
import p386.InterfaceC9793;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\b\b\u0002\u0010\u0004*\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m151d2 = {"L飘花落叶言苏子兰楪哲世/飘花落叶言子楪世苏哲兰;", "Q", "D", "Lorg/luckypray/dexkit/wrap/飘花落叶言子楪世哲兰苏;", "R", "L飘花落叶言苏子哲兰世楪/飘花落叶言子楪苏世哲兰;", "invoke", "()L飘花落叶言苏子哲兰世楪/飘花落叶言子楪苏世哲兰;", "<anonymous>"}, m152k = 3, m153mv = {1, 5, 1})
public final class DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1 extends Lambda implements InterfaceC7372 {
    final /* synthetic */ InterfaceC7383 $executor;
    final /* synthetic */ InterfaceC7387 $mapper;
    final /* synthetic */ AbstractC9784 $query;
    final /* synthetic */ C6573 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexKitCacheBridge$RecyclableBridge$getInternalSingle$loader$1$1(C6573 c6573, InterfaceC7383 interfaceC7383, AbstractC9784 abstractC9784, InterfaceC7387 interfaceC7387) {
        super(0);
        this.this$0 = c6573;
        this.$executor = interfaceC7383;
        this.$query = abstractC9784;
        this.$mapper = interfaceC7387;
    }

    @Override // p068.InterfaceC7372
    public final InterfaceC9793 invoke() {
        DexKitBridge dexKitBridge;
        int i;
        boolean z;
        InterfaceC9793 c9787;
        C6573 c6573 = this.this$0;
        InterfaceC7383 interfaceC7383 = this.$executor;
        AbstractC9784 abstractC9784 = this.$query;
        InterfaceC7387 interfaceC7387 = this.$mapper;
        C9790 c9790M11694 = c6573.m11694();
        C9790.m15133(c9790M11694);
        try {
            synchronized (c9790M11694.f25519) {
                dexKitBridge = c9790M11694.f25513;
                i = 1;
                if (dexKitBridge == null) {
                    Object objInvoke = c9790M11694.f25508.invoke();
                    c9790M11694.f25513 = (DexKitBridge) objInvoke;
                    dexKitBridge = (DexKitBridge) objInvoke;
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                c9790M11694.f25507.invoke();
            }
            List list = (List) interfaceC7383.invoke(dexKitBridge, abstractC9784);
            Object objM9374 = AbstractC5176.m9374(list);
            if (objM9374 != null) {
                int size = list.size();
                while (true) {
                    if (i >= size) {
                        c9787 = new C9787((InterfaceC6563) interfaceC7387.invoke(objM9374));
                        break;
                    }
                    if (!objM9374.equals(list.get(i))) {
                        c9787 = new C9788(new NonUniqueResultException(list.size()));
                        break;
                    }
                    i++;
                }
            } else {
                c9787 = new C9789();
            }
            C9790.m15132(c9790M11694);
            return c9787;
        } catch (Throwable th) {
            C9790.m15132(c9790M11694);
            throw th;
        }
    }
}
