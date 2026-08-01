package org.luckypray.dexkit;

import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(J)V", "<anonymous>"}, m152k = 3, m153mv = {1, 5, 1})
final class DexKitBridge$initFullCache$1 extends Lambda implements InterfaceC7387 {
    public static final DexKitBridge$initFullCache$1 INSTANCE = new DexKitBridge$initFullCache$1();

    public DexKitBridge$initFullCache$1() {
        super(1);
    }

    @Override // p068.InterfaceC7387
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return C6008.f15084;
    }

    public final void invoke(long j) {
        DexKitBridge.nativeInitFullCache(j);
    }
}
