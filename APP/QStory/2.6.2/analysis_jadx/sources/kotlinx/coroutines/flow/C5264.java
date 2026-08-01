package kotlinx.coroutines.flow;

import androidx.activity.AbstractC0053;
import kotlin.collections.AbstractC4343;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.C5224;
import kotlinx.coroutines.flow.internal.C5235;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5264 implements InterfaceC5271 {
    public final boolean equals(Object obj) {
        return obj instanceof C5264;
    }

    public final int hashCode() {
        return Long.hashCode(Long.MAX_VALUE) + (Long.hashCode(0L) * 31);
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("SharingStarted.WhileSubscribed("), AbstractC4343.m8813(new ListBuilder(2).build(), null, null, null, null, 63), ')');
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5271
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5318 mo10304(C5224 c5224) {
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this, null);
        int i = AbstractC5328.f14900;
        C5240 c5240 = new C5240(new C5235(startedWhileSubscribed$command$1, c5224, EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND), new StartedWhileSubscribed$command$2(null));
        return c5240 instanceof InterfaceC5263 ? c5240 : new C5299(c5240, AbstractC5321.f14893, AbstractC5321.f14892);
    }
}
