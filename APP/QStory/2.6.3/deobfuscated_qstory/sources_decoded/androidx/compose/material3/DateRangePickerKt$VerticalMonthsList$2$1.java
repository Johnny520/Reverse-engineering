package androidx.compose.material3;

import androidx.compose.foundation.lazy.C0741;
import androidx.compose.foundation.lazy.C0744;
import androidx.compose.material3.internal.AbstractC1136;
import androidx.compose.runtime.AbstractC1367;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p048.C6519;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$2$1", f = "DateRangePicker.kt", l = {901}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class DateRangePickerKt$VerticalMonthsList$2$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ AbstractC1136 $calendarModel;
    final /* synthetic */ C0741 $lazyListState;
    final /* synthetic */ InterfaceC6558 $onDisplayedMonthChange;
    final /* synthetic */ C6519 $yearRange;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$VerticalMonthsList$2$1(C0741 c0741, InterfaceC6558 interfaceC6558, AbstractC1136 abstractC1136, C6519 c6519, InterfaceC4357<? super DateRangePickerKt$VerticalMonthsList$2$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$lazyListState = c0741;
        this.$onDisplayedMonthChange = interfaceC6558;
        this.$yearRange = c6519;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new DateRangePickerKt$VerticalMonthsList$2$1(this.$lazyListState, this.$onDisplayedMonthChange, null, this.$yearRange, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((DateRangePickerKt$VerticalMonthsList$2$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C0741 c0741 = this.$lazyListState;
            InterfaceC6558 interfaceC6558 = this.$onDisplayedMonthChange;
            C6519 c6519 = this.$yearRange;
            this.label = 1;
            int i2 = AbstractC1187.f3392;
            Object objMo8453 = AbstractC1367.m2470(new C0744(c0741, 1)).mo8453(new C1182(c0741, interfaceC6558, c6519), this);
            if (objMo8453 != coroutineSingletons) {
                objMo8453 = c5176;
            }
            if (objMo8453 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return c5176;
    }
}
