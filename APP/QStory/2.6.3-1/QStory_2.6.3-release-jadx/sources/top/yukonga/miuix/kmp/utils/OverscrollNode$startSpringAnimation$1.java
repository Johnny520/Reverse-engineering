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
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.utils.OverscrollNode$startSpringAnimation$1", m556f = "Overscroll.kt", m557l = {227}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class OverscrollNode$startSpringAnimation$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ float $initialVelocity;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C6899 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverscrollNode$startSpringAnimation$1(C6899 c6899, float f, InterfaceC5189<? super OverscrollNode$startSpringAnimation$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c6899;
        this.$initialVelocity = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(Ref$LongRef ref$LongRef, C6899 c6899, long j) {
        if (ref$LongRef.element == -1) {
            ref$LongRef.element = j;
            return false;
        }
        ref$LongRef.element = j;
        boolean zM11969 = c6899.f16945.m11969((j - r0) / 1.0E9f);
        c6899.m11985((float) c6899.f16945.f16878);
        c6899.f16943 = AbstractC6882.m11973(c6899.f16940, c6899.f16942) * Math.signum(c6899.f16940);
        return zM11969;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        OverscrollNode$startSpringAnimation$1 overscrollNode$startSpringAnimation$1 = new OverscrollNode$startSpringAnimation$1(this.this$0, this.$initialVelocity, interfaceC5189);
        overscrollNode$startSpringAnimation$1.L$0 = obj;
        return overscrollNode$startSpringAnimation$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((OverscrollNode$startSpringAnimation$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[Catch: all -> 0x0016, TRY_ENTER, TryCatch #0 {all -> 0x0016, blocks: (B:6:0x0012, B:19:0x005e, B:14:0x003a, B:16:0x0040), top: B:30:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005b -> B:19:0x005e). Please report as a decompilation issue!!! */
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
        int i2 = 0;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C6899 c6899 = this.this$0;
            c6899.f16945.m11970(c6899.f16940, this.$initialVelocity);
            Ref$LongRef ref$LongRef2 = new Ref$LongRef();
            ref$LongRef2.element = -1L;
            ref$LongRef = ref$LongRef2;
            BooleanValue = 0;
            if (BooleanValue == 0) {
            }
            return C6008.f15084;
        }
        if (i != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ref$LongRef = (Ref$LongRef) this.L$1;
        try {
            AbstractC6017.m10769(obj);
            BooleanValue = ((Boolean) obj).booleanValue();
            if (BooleanValue == 0 || !AbstractC6231.m11054(interfaceC6233)) {
                return C6008.f15084;
            }
            C6898 c6898 = new C6898(ref$LongRef, i2, this.this$0);
            this.L$0 = interfaceC6233;
            this.L$1 = ref$LongRef;
            this.I$0 = BooleanValue;
            this.label = 1;
            obj = AbstractC2202.m3052(getContext()).mo2865(c6898, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            BooleanValue = ((Boolean) obj).booleanValue();
            if (BooleanValue == 0) {
            }
            return C6008.f15084;
        } finally {
            float fAbs = Math.abs(this.this$0.f16940);
            C6899 c68992 = this.this$0;
            if (fAbs <= c68992.f16941) {
                c68992.m11984();
            }
        }
    }
}
