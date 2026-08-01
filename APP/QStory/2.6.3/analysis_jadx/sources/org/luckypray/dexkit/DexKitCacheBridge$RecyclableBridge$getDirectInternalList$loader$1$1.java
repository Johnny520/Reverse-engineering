package org.luckypray.dexkit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.Lambda;
import org.luckypray.dexkit.wrap.InterfaceC5733;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p370.C8961;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"D", "Lorg/luckypray/dexkit/wrap/飘花落叶言子楪世哲兰苏;", "R", "", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1 extends Lambda implements InterfaceC6543 {
    final /* synthetic */ InterfaceC6558 $executor;
    final /* synthetic */ InterfaceC6558 $mapper;
    final /* synthetic */ C5743 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1(C5743 c5743, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582) {
        super(0);
        this.this$0 = c5743;
        this.$executor = interfaceC6558;
        this.$mapper = interfaceC65582;
    }

    @Override // p052.InterfaceC6543
    public final List<InterfaceC5733> invoke() {
        DexKitBridge dexKitBridge;
        boolean z;
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
            Iterable iterable = (Iterable) interfaceC6558.invoke(dexKitBridge);
            ArrayList arrayList = new ArrayList(AbstractC4345.m8822(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(interfaceC65582.invoke(it.next()));
            }
            C8961.m14573(c8961M11135);
            return arrayList;
        } catch (Throwable th) {
            C8961.m14573(c8961M11135);
            throw th;
        }
    }
}
