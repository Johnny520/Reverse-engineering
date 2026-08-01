package org.luckypray.dexkit;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"<anonymous>", "", "it", "", "invoke", "(J)Ljava/lang/Integer;"}, m152k = 3, m153mv = {1, 5, 1}, m155xi = 48)
final class DexKitBridge$getDexNum$1 extends Lambda implements InterfaceC7387 {
    public static final DexKitBridge$getDexNum$1 INSTANCE = new DexKitBridge$getDexNum$1();

    public DexKitBridge$getDexNum$1() {
        super(1);
    }

    @Override // p068.InterfaceC7387
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).longValue());
    }

    public final Integer invoke(long j) {
        return Integer.valueOf(DexKitBridge.nativeGetDexNum(j));
    }
}
