package org.luckypray.dexkit;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m151d2 = {"<anonymous>", "", "it", "", "invoke"}, m152k = 3, m153mv = {1, 5, 1}, m155xi = 48)
final class DexKitBridge$getMethodData$1 extends Lambda implements InterfaceC7387 {
    final /* synthetic */ String $descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexKitBridge$getMethodData$1(String str) {
        super(1);
        this.$descriptor = str;
    }

    @Override // p068.InterfaceC7387
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).longValue());
    }

    public final byte[] invoke(long j) {
        return DexKitBridge.nativeGetMethodData(j, this.$descriptor);
    }
}
