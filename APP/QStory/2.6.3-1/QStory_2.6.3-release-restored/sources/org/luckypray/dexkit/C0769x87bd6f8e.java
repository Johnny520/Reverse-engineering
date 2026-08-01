package org.luckypray.dexkit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.Lambda;
import org.luckypray.dexkit.wrap.InterfaceC6563;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p386.C9790;

/* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$getDirectInternalList$loader$1$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"D", "Lorg/luckypray/dexkit/wrap/飘花落叶言子楪世哲兰苏;", "R", "", "invoke", "()Ljava/util/List;", "<anonymous>"}, m152k = 3, m153mv = {1, 5, 1})
public final class C0769x87bd6f8e extends Lambda implements InterfaceC7372 {
    final /* synthetic */ InterfaceC7387 $executor;
    final /* synthetic */ InterfaceC7387 $mapper;
    final /* synthetic */ C6573 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0769x87bd6f8e(C6573 c6573, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872) {
        super(0);
        this.this$0 = c6573;
        this.$executor = interfaceC7387;
        this.$mapper = interfaceC73872;
    }

    @Override // p068.InterfaceC7372
    public final List<InterfaceC6563> invoke() {
        DexKitBridge dexKitBridge;
        boolean z;
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
            Iterable iterable = (Iterable) interfaceC7387.invoke(dexKitBridge);
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(interfaceC73872.invoke(it.next()));
            }
            C9790.m15132(c9790M11694);
            return arrayList;
        } catch (Throwable th) {
            C9790.m15132(c9790M11694);
            throw th;
        }
    }
}
