package kotlinx.coroutines.flow;

import androidx.activity.AbstractC0900;
import kotlin.collections.AbstractC5176;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.C6057;
import kotlinx.coroutines.flow.internal.C6068;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6097 implements InterfaceC6104 {
    public final boolean equals(Object obj) {
        return obj instanceof C6097;
    }

    public final int hashCode() {
        return Long.hashCode(Long.MAX_VALUE) + (Long.hashCode(0L) * 31);
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("SharingStarted.WhileSubscribed("), AbstractC5176.m9369(new ListBuilder(2).build(), null, null, null, null, 63), ')');
    }

    @Override // kotlinx.coroutines.flow.InterfaceC6104
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6151 mo10867(C6057 c6057) {
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this, null);
        int i = AbstractC6161.f15245;
        C6073 c6073 = new C6073(new C6068(startedWhileSubscribed$command$1, c6057, EmptyCoroutineContext.INSTANCE, -2, BufferOverflow.SUSPEND), new StartedWhileSubscribed$command$2(null));
        return c6073 instanceof InterfaceC6096 ? c6073 : new C6132(c6073, AbstractC6154.f15238, AbstractC6154.f15237);
    }
}
