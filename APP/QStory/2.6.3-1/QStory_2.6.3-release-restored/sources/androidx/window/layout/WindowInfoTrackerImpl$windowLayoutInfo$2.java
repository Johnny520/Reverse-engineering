package androidx.window.layout;

import android.app.Activity;
import androidx.core.util.InterfaceC3021;
import androidx.profileinstaller.ExecutorC3274;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.AbstractC6043;
import kotlinx.coroutines.channels.InterfaceC6028;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2", m556f = "WindowInfoTrackerImpl.kt", m557l = {62}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Landroidx/window/layout/飘花落叶言子楪苏兰世哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class WindowInfoTrackerImpl$windowLayoutInfo$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ Activity $activity;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C3434 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerImpl$windowLayoutInfo$2(C3434 c3434, Activity activity, InterfaceC5189<? super WindowInfoTrackerImpl$windowLayoutInfo$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c3434;
        this.$activity = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invokeSuspend$lambda$0(InterfaceC6028 interfaceC6028, C3431 c3431) {
        ((AbstractC6043) interfaceC6028).mo8995(c3431);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$1(C3434 c3434, InterfaceC3021 interfaceC3021) {
        c3434.f8131.mo5667(interfaceC3021);
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        WindowInfoTrackerImpl$windowLayoutInfo$2 windowInfoTrackerImpl$windowLayoutInfo$2 = new WindowInfoTrackerImpl$windowLayoutInfo$2(this.this$0, this.$activity, interfaceC5189);
        windowInfoTrackerImpl$windowLayoutInfo$2.L$0 = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6028 interfaceC6028, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$2) create(interfaceC6028, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6028 interfaceC6028 = (InterfaceC6028) this.L$0;
            C3429 c3429 = new C3429(interfaceC6028, i2);
            this.this$0.f8131.mo5666(this.$activity, new ExecutorC3274(), c3429);
            C3433 c3433 = new C3433(this.this$0, c3429, i2);
            this.label = 1;
            if (AbstractC6037.m10838(interfaceC6028, c3433, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
