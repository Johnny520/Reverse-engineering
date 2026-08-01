package androidx.compose.material3;

import androidx.compose.foundation.lazy.C1582;
import androidx.compose.material3.internal.AbstractC1968;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p064.C7348;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1", m556f = "DatePicker.kt", m557l = {1653}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class DatePickerKt$DatePickerContent$2$4$2$2$1$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ AbstractC1968 $displayedMonth;
    final /* synthetic */ C1582 $monthsListState;
    final /* synthetic */ int $year;
    final /* synthetic */ C7348 $yearRange;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$DatePickerContent$2$4$2$2$1$1$1(C1582 c1582, int i, C7348 c7348, AbstractC1968 abstractC1968, InterfaceC5189<? super DatePickerKt$DatePickerContent$2$4$2$2$1$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$monthsListState = c1582;
        this.$year = i;
        this.$yearRange = c7348;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new DatePickerKt$DatePickerContent$2$4$2$2$1$1$1(this.$monthsListState, this.$year, this.$yearRange, null, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DatePickerKt$DatePickerContent$2$4$2$2$1$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            int i2 = this.$yearRange.f18163;
            throw null;
        }
        if (i == 1) {
            AbstractC6017.m10769(obj);
            return C6008.f15084;
        }
        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
