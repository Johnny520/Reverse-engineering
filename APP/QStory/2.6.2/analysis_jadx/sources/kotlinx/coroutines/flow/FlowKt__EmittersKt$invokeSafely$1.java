package kotlinx.coroutines.flow;

import com.android.dx.io.Opcodes;
import kotlin.AbstractC5184;
import kotlin.AbstractC5186;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", l = {Opcodes.MUL_INT_LIT16}, m = "invokeSafely$FlowKt__EmittersKt", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class FlowKt__EmittersKt$invokeSafely$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public FlowKt__EmittersKt$invokeSafely$1(InterfaceC4356<? super FlowKt__EmittersKt$invokeSafely$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new FlowKt__EmittersKt$invokeSafely$1<>(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                AbstractC5184.m10206(obj2);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                throw null;
            }
            if (i2 != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj2);
            return C5175.f14739;
        } catch (Throwable th) {
            if (0 != 0 && null != th) {
                AbstractC5186.m10212(th, null);
            }
            throw th;
        }
    }
}
