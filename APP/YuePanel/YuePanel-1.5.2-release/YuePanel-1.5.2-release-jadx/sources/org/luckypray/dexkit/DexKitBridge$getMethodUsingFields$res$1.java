package org.luckypray.dexkit;

import Yue.AbstractC5673;
import Yue.InterfaceC5124;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m2699d2 = {"<anonymous>", "", "it", "", "invoke"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class DexKitBridge$getMethodUsingFields$res$1 extends AbstractC5673 implements InterfaceC5124<Long, byte[]> {
    final /* synthetic */ long $encodeId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexKitBridge$getMethodUsingFields$res$1(long j) {
        super(1);
        this.$encodeId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // Yue.InterfaceC5124
    public /* bridge */ /* synthetic */ byte[] invoke(Long l) {
        return invoke(l.longValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public final byte[] invoke(long j) {
        return DexKitBridge.INSTANCE.nativeGetMethodUsingFields(j, this.$encodeId);
    }
}
