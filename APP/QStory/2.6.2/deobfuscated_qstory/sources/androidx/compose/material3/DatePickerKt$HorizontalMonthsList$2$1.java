package androidx.compose.material3;

import androidx.compose.foundation.lazy.C0741;
import androidx.compose.foundation.lazy.C0744;
import androidx.compose.material3.internal.AbstractC1136;
import androidx.compose.runtime.AbstractC1367;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p048.C6518;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.material3.DatePickerKt$HorizontalMonthsList$2$1", f = "DatePicker.kt", l = {1754}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class DatePickerKt$HorizontalMonthsList$2$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ AbstractC1136 $calendarModel;
    final /* synthetic */ C0741 $lazyListState;
    final /* synthetic */ InterfaceC6557 $onDisplayedMonthChange;
    final /* synthetic */ C6518 $yearRange;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$HorizontalMonthsList$2$1(C0741 c0741, InterfaceC6557 interfaceC6557, AbstractC1136 abstractC1136, C6518 c6518, InterfaceC4356<? super DatePickerKt$HorizontalMonthsList$2$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$lazyListState = c0741;
        this.$onDisplayedMonthChange = interfaceC6557;
        this.$yearRange = c6518;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new DatePickerKt$HorizontalMonthsList$2$1(this.$lazyListState, this.$onDisplayedMonthChange, null, this.$yearRange, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((DatePickerKt$HorizontalMonthsList$2$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C0741 c0741 = this.$lazyListState;
            InterfaceC6557 interfaceC6557 = this.$onDisplayedMonthChange;
            C6518 c6518 = this.$yearRange;
            this.label = 1;
            int i2 = AbstractC1187.f3391;
            Object objMo8463 = AbstractC1367.m2461(new C0744(c0741, 1)).mo8463(new C1182(c0741, interfaceC6557, c6518), this);
            if (objMo8463 != coroutineSingletons) {
                objMo8463 = c5175;
            }
            if (objMo8463 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return c5175;
    }
}
