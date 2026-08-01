package androidx.compose.runtime;

import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3054;
import kotlin.AbstractC5184;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C5443;
import p052.InterfaceC6542;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.runtime.ProduceStateScopeImpl", f = "ProduceState.kt", l = {Opcodes.ADD_INT_LIT16}, m = "awaitDispose", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class ProduceStateScopeImpl$awaitDispose$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C1387 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProduceStateScopeImpl$awaitDispose$1(C1387 c1387, InterfaceC4356<? super ProduceStateScopeImpl$awaitDispose$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c1387;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C1387 c1387 = this.this$0;
        c1387.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new ProduceStateScopeImpl$awaitDispose$1(c1387, this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        InterfaceC6542 interfaceC6542 = null;
        try {
            if (i2 == 0) {
                AbstractC5184.m10206(obj2);
                this.L$0 = null;
                this.label = 1;
                C5443 c5443 = new C5443(1, AbstractC3054.m6602(this));
                c5443.m10539();
                if (c5443.m10536() == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC6542 = (InterfaceC6542) this.L$0;
                AbstractC5184.m10206(obj2);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            interfaceC6542.invoke();
            throw th;
        }
    }
}
