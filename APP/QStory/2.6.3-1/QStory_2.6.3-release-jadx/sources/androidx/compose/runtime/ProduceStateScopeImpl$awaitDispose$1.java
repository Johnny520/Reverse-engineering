package androidx.compose.runtime;

import androidx.window.area.AbstractC3400;
import com.android.p002dx.p005io.Opcodes;
import kotlin.AbstractC6017;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C6276;
import p068.InterfaceC7372;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.runtime.ProduceStateScopeImpl", m556f = "ProduceState.kt", m557l = {Opcodes.ADD_INT_LIT16}, m558m = "awaitDispose", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class ProduceStateScopeImpl$awaitDispose$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C2222 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProduceStateScopeImpl$awaitDispose$1(C2222 c2222, InterfaceC5189<? super ProduceStateScopeImpl$awaitDispose$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c2222;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C2222 c2222 = this.this$0;
        c2222.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new ProduceStateScopeImpl$awaitDispose$1(c2222, this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        InterfaceC7372 interfaceC7372 = null;
        try {
            if (i2 == 0) {
                AbstractC6017.m10769(obj2);
                this.L$0 = null;
                this.label = 1;
                C6276 c6276 = new C6276(1, AbstractC3400.m5624(this));
                c6276.m11102();
                if (c6276.m11099() == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC7372 = (InterfaceC7372) this.L$0;
                AbstractC6017.m10769(obj2);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            interfaceC7372.invoke();
            throw th;
        }
    }
}
