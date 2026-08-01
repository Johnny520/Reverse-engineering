package androidx.lifecycle;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.sync.C6212;
import kotlinx.coroutines.sync.InterfaceC6215;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", m556f = "RepeatOnLifecycle.kt", m557l = {166, 110}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $block;
    final /* synthetic */ InterfaceC6215 $mutex;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1(InterfaceC6215 interfaceC6215, InterfaceC7383 interfaceC7383, InterfaceC5189<? super RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$mutex = interfaceC6215;
        this.$block = interfaceC7383;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1(this.$mutex, this.$block, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC7383 interfaceC7383;
        InterfaceC6215 interfaceC6215;
        Throwable th;
        InterfaceC6215 interfaceC62152;
        InterfaceC6215 interfaceC62153;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                InterfaceC6215 interfaceC62154 = this.$mutex;
                interfaceC7383 = this.$block;
                this.L$0 = interfaceC62154;
                this.L$1 = interfaceC7383;
                this.label = 1;
                C6212 c6212 = (C6212) interfaceC62154;
                Object objM10986 = c6212.m10986(this);
                interfaceC6215 = c6212;
                if (objM10986 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC62152 = (InterfaceC6215) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    interfaceC62153 = interfaceC62152;
                    ((C6212) interfaceC62153).m10991(null);
                    return C6008.f15084;
                } catch (Throwable th2) {
                    th = th2;
                    ((C6212) interfaceC62152).m10991(null);
                    throw th;
                }
            }
            interfaceC7383 = (InterfaceC7383) this.L$1;
            InterfaceC6215 interfaceC62155 = (InterfaceC6215) this.L$0;
            AbstractC6017.m10769(obj);
            interfaceC6215 = interfaceC62155;
            RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(interfaceC7383, null);
            this.L$0 = interfaceC6215;
            this.L$1 = null;
            this.label = 2;
            if (AbstractC6231.m11066(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) != coroutineSingletons) {
                interfaceC62153 = interfaceC6215;
                ((C6212) interfaceC62153).m10991(null);
                return C6008.f15084;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            InterfaceC6215 interfaceC62156 = interfaceC6215;
            th = th3;
            interfaceC62152 = interfaceC62156;
            ((C6212) interfaceC62152).m10991(null);
            throw th;
        }
    }
}
