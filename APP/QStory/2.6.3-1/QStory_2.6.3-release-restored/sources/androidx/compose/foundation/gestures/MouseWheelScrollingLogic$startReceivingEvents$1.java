package androidx.compose.foundation.gestures;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.C6022;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingEvents$1", m556f = "MouseWheelScrollingLogic.kt", m557l = {109, 112}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class MouseWheelScrollingLogic$startReceivingEvents$1 extends SuspendLambda implements InterfaceC7383 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C1395 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$startReceivingEvents$1(C1395 c1395, InterfaceC5189<? super MouseWheelScrollingLogic$startReceivingEvents$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1395;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        MouseWheelScrollingLogic$startReceivingEvents$1 mouseWheelScrollingLogic$startReceivingEvents$1 = new MouseWheelScrollingLogic$startReceivingEvents$1(this.this$0, interfaceC5189);
        mouseWheelScrollingLogic$startReceivingEvents$1.L$0 = obj;
        return mouseWheelScrollingLogic$startReceivingEvents$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((MouseWheelScrollingLogic$startReceivingEvents$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (androidx.compose.foundation.gestures.C1395.m1906(r5, r6, r7, r8, r9, r10) != r0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x007c, blocks: (B:18:0x0031, B:21:0x003d, B:26:0x0050), top: B:45:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0077 -> B:45:0x0031). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        MouseWheelScrollingLogic$startReceivingEvents$1 mouseWheelScrollingLogic$startReceivingEvents$1;
        InterfaceC6233 interfaceC6233;
        Throwable th2;
        InterfaceC6233 interfaceC62332;
        boolean zM11053;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            try {
                if (i == 1) {
                    interfaceC6233 = (InterfaceC6233) this.L$0;
                    AbstractC6017.m10769(obj);
                    C1400 c1400 = (C1400) obj;
                    float fMo1904 = this.this$0.f1948.mo1904(6.0f);
                    float fMo19042 = this.this$0.f1948.mo1904(1.0f);
                    C1395 c1395 = this.this$0;
                    C1343 c1343 = c1395.f1950;
                    this.L$0 = interfaceC6233;
                    this.label = 2;
                    mouseWheelScrollingLogic$startReceivingEvents$1 = this;
                } else {
                    if (i != 2) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    interfaceC6233 = (InterfaceC6233) this.L$0;
                    AbstractC6017.m10769(obj);
                    mouseWheelScrollingLogic$startReceivingEvents$1 = this;
                    try {
                        interfaceC62332 = interfaceC6233;
                        zM11053 = AbstractC6231.m11053(interfaceC62332.mo2990());
                        C1395 c13952 = this.this$0;
                        if (zM11053) {
                            c13952.f1939 = null;
                            return C6008.f15084;
                        }
                        C6022 c6022 = c13952.f1940;
                        this.L$0 = interfaceC62332;
                        this.label = 1;
                        try {
                            c6022.getClass();
                            Object objM10781 = C6022.m10781(c6022, this);
                            if (objM10781 != coroutineSingletons) {
                                try {
                                    interfaceC6233 = interfaceC62332;
                                    obj = objM10781;
                                    C1400 c14002 = (C1400) obj;
                                    float fMo19043 = this.this$0.f1948.mo1904(6.0f);
                                    float fMo190422 = this.this$0.f1948.mo1904(1.0f);
                                    C1395 c13953 = this.this$0;
                                    C1343 c13432 = c13953.f1950;
                                    this.L$0 = interfaceC6233;
                                    this.label = 2;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    th = th2;
                                    mouseWheelScrollingLogic$startReceivingEvents$1.this$0.f1939 = null;
                                    throw th;
                                }
                                mouseWheelScrollingLogic$startReceivingEvents$1 = this;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th4) {
                            mouseWheelScrollingLogic$startReceivingEvents$1 = this;
                            th = th4;
                            mouseWheelScrollingLogic$startReceivingEvents$1.this$0.f1939 = null;
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        mouseWheelScrollingLogic$startReceivingEvents$1 = this;
                        th = th2;
                        mouseWheelScrollingLogic$startReceivingEvents$1.this$0.f1939 = null;
                        throw th;
                    }
                    this = mouseWheelScrollingLogic$startReceivingEvents$1;
                }
            } catch (Throwable th6) {
                th = th6;
                mouseWheelScrollingLogic$startReceivingEvents$1 = this;
                mouseWheelScrollingLogic$startReceivingEvents$1.this$0.f1939 = null;
                throw th;
            }
        } else {
            AbstractC6017.m10769(obj);
            interfaceC62332 = (InterfaceC6233) this.L$0;
            zM11053 = AbstractC6231.m11053(interfaceC62332.mo2990());
            C1395 c139522 = this.this$0;
            if (zM11053) {
            }
        }
    }
}
