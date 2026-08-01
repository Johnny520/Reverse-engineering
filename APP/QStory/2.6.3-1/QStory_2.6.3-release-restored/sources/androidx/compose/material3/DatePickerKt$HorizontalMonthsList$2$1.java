package androidx.compose.material3;

import androidx.compose.foundation.lazy.C1582;
import androidx.compose.foundation.lazy.C1585;
import androidx.compose.material3.internal.AbstractC1971;
import androidx.compose.runtime.AbstractC2202;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p064.C7348;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.DatePickerKt$HorizontalMonthsList$2$1", m556f = "DatePicker.kt", m557l = {1754}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class DatePickerKt$HorizontalMonthsList$2$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ AbstractC1971 $calendarModel;
    final /* synthetic */ C1582 $lazyListState;
    final /* synthetic */ InterfaceC7387 $onDisplayedMonthChange;
    final /* synthetic */ C7348 $yearRange;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$HorizontalMonthsList$2$1(C1582 c1582, InterfaceC7387 interfaceC7387, AbstractC1971 abstractC1971, C7348 c7348, InterfaceC5189<? super DatePickerKt$HorizontalMonthsList$2$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$lazyListState = c1582;
        this.$onDisplayedMonthChange = interfaceC7387;
        this.$yearRange = c7348;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new DatePickerKt$HorizontalMonthsList$2$1(this.$lazyListState, this.$onDisplayedMonthChange, null, this.$yearRange, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DatePickerKt$HorizontalMonthsList$2$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C1582 c1582 = this.$lazyListState;
            InterfaceC7387 interfaceC7387 = this.$onDisplayedMonthChange;
            C7348 c7348 = this.$yearRange;
            this.label = 1;
            int i2 = AbstractC2022.f3737;
            Object objMo9012 = AbstractC2202.m3030(new C1585(c1582, 1)).mo9012(new C2017(c1582, interfaceC7387, c7348), this);
            if (objMo9012 != coroutineSingletons) {
                objMo9012 = c6008;
            }
            if (objMo9012 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return c6008;
    }
}
