package org.luckypray.dexkit;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
final class DexKitBridge$batchFindClassUsingStrings$res$1 extends Lambda implements InterfaceC6558 {
    final /* synthetic */ byte[] $encodeBytes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexKitBridge$batchFindClassUsingStrings$res$1(byte[] bArr) {
        super(1);
        this.$encodeBytes = bArr;
    }

    @Override // p052.InterfaceC6558
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).longValue());
    }

    public final byte[] invoke(long j) {
        return DexKitBridge.nativeBatchFindClassUsingStrings(j, this.$encodeBytes);
    }
}
