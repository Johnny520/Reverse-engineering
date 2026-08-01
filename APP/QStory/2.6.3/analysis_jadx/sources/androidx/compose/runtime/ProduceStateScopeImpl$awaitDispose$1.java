package androidx.compose.runtime;

import androidx.window.area.AbstractC2567;
import com.android.dx.io.Opcodes;
import kotlin.AbstractC5185;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C5444;
import p052.InterfaceC6543;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.runtime.ProduceStateScopeImpl", f = "ProduceState.kt", l = {Opcodes.ADD_INT_LIT16}, m = "awaitDispose", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class ProduceStateScopeImpl$awaitDispose$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C1387 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProduceStateScopeImpl$awaitDispose$1(C1387 c1387, InterfaceC4357<? super ProduceStateScopeImpl$awaitDispose$1> interfaceC4357) {
        super(interfaceC4357);
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
        InterfaceC6543 interfaceC6543 = null;
        try {
            if (i2 == 0) {
                AbstractC5185.m10210(obj2);
                this.L$0 = null;
                this.label = 1;
                C5444 c5444 = new C5444(1, AbstractC2567.m5064(this));
                c5444.m10543();
                if (c5444.m10540() == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC6543 = (InterfaceC6543) this.L$0;
                AbstractC5185.m10210(obj2);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            interfaceC6543.invoke();
            throw th;
        }
    }
}
