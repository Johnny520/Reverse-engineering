package org.luckypray.dexkit;

import Yue.AbstractC5673;
import Yue.InterfaceC5122;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: org.luckypray.dexkit.DexKitCacheBridge$RecyclableBridge$innerGetMethods$buildQuery$1$1 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m2699d2 = {"<anonymous>", "Lorg/luckypray/dexkit/query/FindMethod;", "invoke"}, m2700k = 3, m2701mv = {1, 5, 1}, m2703xi = 48)
public final class C2928x24931bbd extends AbstractC5673 implements InterfaceC5122<FindMethod> {
    final /* synthetic */ FindMethod $query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2928x24931bbd(FindMethod findMethod) {
        super(0);
        this.$query = findMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // Yue.InterfaceC5122
    @InterfaceC6399
    public final FindMethod invoke() {
        return this.$query;
    }
}
