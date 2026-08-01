package top.yukonga.miuix.kmp.utils;

import androidx.compose.runtime.AbstractC2202;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.utils.MiuixOverscrollEffect$startSpringAnimationY$1", m556f = "OverscrollFactory.kt", m557l = {185}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class MiuixOverscrollEffect$startSpringAnimationY$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ float $initialVelocity;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C6907 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiuixOverscrollEffect$startSpringAnimationY$1(C6907 c6907, float f, InterfaceC5189<? super MiuixOverscrollEffect$startSpringAnimationY$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c6907;
        this.$initialVelocity = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(Ref$LongRef ref$LongRef, C6907 c6907, long j) {
        if (ref$LongRef.element == -1) {
            ref$LongRef.element = j;
            return false;
        }
        ref$LongRef.element = j;
        boolean zM11969 = c6907.f16970.m11969((j - r0) / 1.0E9f);
        c6907.m11991((float) c6907.f16970.f16878);
        c6907.f16958 = AbstractC6882.m11973(c6907.f16961, c6907.f16957) * Math.signum(c6907.f16961);
        return zM11969;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        MiuixOverscrollEffect$startSpringAnimationY$1 miuixOverscrollEffect$startSpringAnimationY$1 = new MiuixOverscrollEffect$startSpringAnimationY$1(this.this$0, this.$initialVelocity, interfaceC5189);
        miuixOverscrollEffect$startSpringAnimationY$1.L$0 = obj;
        return miuixOverscrollEffect$startSpringAnimationY$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((MiuixOverscrollEffect$startSpringAnimationY$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b A[Catch: all -> 0x0018, TRY_ENTER, TryCatch #0 {all -> 0x0018, blocks: (B:6:0x0014, B:20:0x0062, B:14:0x003b, B:16:0x0041), top: B:31:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005f -> B:20:0x0062). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$LongRef ref$LongRef;
        ?? BooleanValue;
        InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C6907 c6907 = this.this$0;
            c6907.f16970.m11970(c6907.f16961, this.$initialVelocity);
            ref$LongRef = new Ref$LongRef();
            ref$LongRef.element = -1L;
            BooleanValue = 0;
            if (BooleanValue == 0) {
            }
            return C6008.f15084;
        }
        if (i != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Ref$LongRef ref$LongRef2 = (Ref$LongRef) this.L$1;
        try {
            AbstractC6017.m10769(obj);
            Ref$LongRef ref$LongRef3 = ref$LongRef2;
            BooleanValue = ((Boolean) obj).booleanValue();
            ref$LongRef = ref$LongRef3;
            if (BooleanValue == 0 || !AbstractC6231.m11054(interfaceC6233)) {
                return C6008.f15084;
            }
            C6888 c6888 = new C6888(ref$LongRef, this.this$0, i2);
            this.L$0 = interfaceC6233;
            this.L$1 = ref$LongRef;
            this.I$0 = BooleanValue;
            this.label = 1;
            Object objMo2865 = AbstractC2202.m3052(getContext()).mo2865(c6888, this);
            if (objMo2865 == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$LongRef2 = ref$LongRef;
            obj = objMo2865;
            Ref$LongRef ref$LongRef32 = ref$LongRef2;
            BooleanValue = ((Boolean) obj).booleanValue();
            ref$LongRef = ref$LongRef32;
            if (BooleanValue == 0) {
            }
            return C6008.f15084;
        } finally {
            float fAbs = Math.abs(this.this$0.f16961);
            this.this$0.getClass();
            if (fAbs <= 1.0f) {
                C6907 c69072 = this.this$0;
                c69072.m11991(0.0f);
                c69072.f16958 = 0.0f;
            }
        }
    }
}
