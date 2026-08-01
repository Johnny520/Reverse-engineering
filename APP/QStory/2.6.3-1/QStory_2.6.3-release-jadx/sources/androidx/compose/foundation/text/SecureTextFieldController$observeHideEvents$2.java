package androidx.compose.foundation.text;

import com.android.p002dx.p005io.Opcodes;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.SecureTextFieldController$observeHideEvents$2", m556f = "BasicSecureTextField.kt", m557l = {Opcodes.INVOKE_POLYMORPHIC_RANGE}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "it", "<anonymous>", "(V)V"}, m152k = 3, m153mv = {2, 1, 0})
final class SecureTextFieldController$observeHideEvents$2 extends SuspendLambda implements InterfaceC7383 {
    int label;
    final /* synthetic */ AbstractC1848 this$0;

    public SecureTextFieldController$observeHideEvents$2(AbstractC1848 abstractC1848, InterfaceC5189<? super SecureTextFieldController$observeHideEvents$2> interfaceC5189) {
        super(2, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new SecureTextFieldController$observeHideEvents$2(null, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C6008 c6008, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SecureTextFieldController$observeHideEvents$2) create(c6008, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            this.label = 1;
            if (AbstractC6231.m11058(1500L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        throw null;
    }
}
