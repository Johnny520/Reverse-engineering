package org.luckypray.dexkit;

import Yue.AbstractC5673;
import Yue.InterfaceC5124;
import Yue.InterfaceC6211;
import Yue.InterfaceC6489;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m2699d2 = {"<anonymous>", "", "", "it", "", "invoke", "(J)[Ljava/lang/String;"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class DexKitBridge$getParameterNames$1 extends AbstractC5673 implements InterfaceC5124<Long, String[]> {
    final /* synthetic */ long $encodeId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexKitBridge$getParameterNames$1(long j) {
        super(1);
        this.$encodeId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // Yue.InterfaceC5124
    public /* bridge */ /* synthetic */ String[] invoke(Long l) {
        return invoke(l.longValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6489
    public final String[] invoke(long j) {
        return DexKitBridge.INSTANCE.nativeGetParameterNames(j, this.$encodeId);
    }
}
