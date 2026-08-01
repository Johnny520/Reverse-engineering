package androidx.compose.material3;

import androidx.compose.material3.internal.AbstractC1134;
import androidx.compose.material3.internal.AbstractC1136;
import androidx.compose.runtime.InterfaceC1395;
import java.util.Locale;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.DateInputKt$DateInputTextField$5$1", f = "DateInput.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class DateInputKt$DateInputTextField$5$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ AbstractC1136 $calendarModel;
    final /* synthetic */ AbstractC1134 $dateInputFormat;
    final /* synthetic */ Long $initialDateMillis;
    final /* synthetic */ Locale $locale;
    final /* synthetic */ InterfaceC1395 $text$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateInputKt$DateInputTextField$5$1(Long l, AbstractC1136 abstractC1136, AbstractC1134 abstractC1134, Locale locale, InterfaceC1395 interfaceC1395, InterfaceC4357<? super DateInputKt$DateInputTextField$5$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$initialDateMillis = l;
        this.$locale = locale;
        this.$text$delegate = interfaceC1395;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new DateInputKt$DateInputTextField$5$1(this.$initialDateMillis, null, null, this.$locale, this.$text$delegate, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((DateInputKt$DateInputTextField$5$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        if (this.$initialDateMillis == null) {
            return C5176.f14739;
        }
        throw null;
    }
}
