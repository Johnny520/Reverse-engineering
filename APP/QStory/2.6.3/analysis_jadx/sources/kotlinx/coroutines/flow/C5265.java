package kotlinx.coroutines.flow;

import androidx.activity.AbstractC0053;
import kotlin.collections.AbstractC4344;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.C5225;
import kotlinx.coroutines.flow.internal.C5236;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5265 implements InterfaceC5272 {
    public final boolean equals(Object obj) {
        return obj instanceof C5265;
    }

    public final int hashCode() {
        return Long.hashCode(Long.MAX_VALUE) + (Long.hashCode(0L) * 31);
    }

    public final String toString() {
        return AbstractC0053.m148(new StringBuilder("SharingStarted.WhileSubscribed("), AbstractC4344.m8810(new ListBuilder(2).build(), null, null, null, null, 63), ')');
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5272
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5319 mo10308(C5225 c5225) {
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this, null);
        int i = AbstractC5329.f14900;
        C5241 c5241 = new C5241(new C5236(startedWhileSubscribed$command$1, c5225, EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND), new StartedWhileSubscribed$command$2(null));
        return c5241 instanceof InterfaceC5264 ? c5241 : new C5300(c5241, AbstractC5322.f14893, AbstractC5322.f14892);
    }
}
