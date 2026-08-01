package org.luckypray.dexkit;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import org.luckypray.dexkit.exceptions.NoResultException;
import org.luckypray.dexkit.exceptions.NonUniqueResultException;
import org.luckypray.dexkit.wrap.InterfaceC6563;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p386.C9787;
import p386.C9788;
import p386.C9789;
import p386.C9790;
import p386.InterfaceC9793;

/* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalSingle$loader$1$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"D", "Lorg/luckypray/dexkit/wrap/飘花落叶言子楪世哲兰苏;", "R", "L飘花落叶言苏子哲兰世楪/飘花落叶言子楪苏世哲兰;", "invoke", "()L飘花落叶言苏子哲兰世楪/飘花落叶言子楪苏世哲兰;", "<anonymous>"}, m152k = 3, m153mv = {1, 5, 1})
public final class C0770x95b222e4 extends Lambda implements InterfaceC7372 {
    final /* synthetic */ InterfaceC7387 $executor;
    final /* synthetic */ InterfaceC7387 $mapper;
    final /* synthetic */ C6573 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0770x95b222e4(C6573 c6573, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872) {
        super(0);
        this.this$0 = c6573;
        this.$executor = interfaceC7387;
        this.$mapper = interfaceC73872;
    }

    @Override // p068.InterfaceC7372
    public final InterfaceC9793 invoke() {
        DexKitBridge dexKitBridge;
        boolean z;
        try {
            C6573 c6573 = this.this$0;
            InterfaceC7387 interfaceC7387 = this.$executor;
            InterfaceC7387 interfaceC73872 = this.$mapper;
            C9790 c9790M11694 = c6573.m11694();
            C9790.m15133(c9790M11694);
            try {
                synchronized (c9790M11694.f25519) {
                    dexKitBridge = c9790M11694.f25513;
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
                Object objInvoke2 = interfaceC7387.invoke(dexKitBridge);
                InterfaceC9793 c9789 = objInvoke2 == null ? new C9789() : new C9787((InterfaceC6563) interfaceC73872.invoke(objInvoke2));
                C9790.m15132(c9790M11694);
                return c9789;
            } catch (Throwable th) {
                C9790.m15132(c9790M11694);
                throw th;
            }
        } catch (NoResultException e) {
            return new C9789(e);
        } catch (NonUniqueResultException e2) {
            return new C9788(e2);
        }
    }
}
