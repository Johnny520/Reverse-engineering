package androidx.compose.foundation.text;

import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.C2462;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", m556f = "PointerMoveDetector.kt", m557l = {41}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class PointerMoveDetectorKt$detectMoves$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7387 $onMove;
    final /* synthetic */ PointerEventPass $pointerEventPass;
    final /* synthetic */ InterfaceC2470 $this_detectMoves;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", m556f = "PointerMoveDetector.kt", m557l = {44}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00891 extends RestrictedSuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC5192 $currentContext;
        final /* synthetic */ InterfaceC7387 $onMove;
        final /* synthetic */ PointerEventPass $pointerEventPass;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00891(InterfaceC5192 interfaceC5192, PointerEventPass pointerEventPass, InterfaceC7387 interfaceC7387, InterfaceC5189<? super C00891> interfaceC5189) {
            super(2, interfaceC5189);
            this.$currentContext = interfaceC5192;
            this.$pointerEventPass = pointerEventPass;
            this.$onMove = interfaceC7387;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C00891 c00891 = new C00891(this.$currentContext, this.$pointerEventPass, this.$onMove, interfaceC5189);
            c00891.L$0 = obj;
            return c00891;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00891) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:18:0x004c, B:23:0x0053], limit reached: 31 */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
        /* JADX WARN: Type inference failed for: r11v13, types: [T, 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世苏兰哲] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0041 -> B:15:0x0044). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC2468 interfaceC2468;
            Ref$ObjectRef ref$ObjectRef;
            C8158 c8158;
            T t;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                interfaceC2468 = (InterfaceC2468) this.L$0;
                ref$ObjectRef = new Ref$ObjectRef();
                if (AbstractC6231.m11053(this.$currentContext)) {
                }
            } else {
                if (i != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$ObjectRef = (Ref$ObjectRef) this.L$1;
                InterfaceC2468 interfaceC24682 = (InterfaceC2468) this.L$0;
                AbstractC6017.m10769(obj);
                C2487 c2487 = (C2487) obj;
                int i2 = c2487.f5192;
                if (i2 != 3 || i2 == 4 || i2 == 5) {
                    long j = ((C2478) AbstractC5176.m9379(c2487.f5197)).f5152;
                    c8158 = new C8158(j);
                    t = ref$ObjectRef.element;
                    if ((t instanceof C8158) && j == ((C8158) t).f19886) {
                        c8158 = null;
                    }
                    if (c8158 != null) {
                        InterfaceC7387 interfaceC7387 = this.$onMove;
                        long j2 = c8158.f19886;
                        ref$ObjectRef.element = new C8158(j2);
                        interfaceC7387.invoke(new C8158(j2));
                    }
                }
                interfaceC2468 = interfaceC24682;
                if (AbstractC6231.m11053(this.$currentContext)) {
                    PointerEventPass pointerEventPass = this.$pointerEventPass;
                    this.L$0 = interfaceC2468;
                    this.L$1 = ref$ObjectRef;
                    this.label = 1;
                    C2456 c2456 = (C2456) interfaceC2468;
                    Object objM3559 = c2456.m3559(pointerEventPass, this);
                    if (objM3559 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC24682 = c2456;
                    obj = objM3559;
                    C2487 c24872 = (C2487) obj;
                    int i22 = c24872.f5192;
                    if (i22 != 3) {
                    }
                    long j3 = ((C2478) AbstractC5176.m9379(c24872.f5197)).f5152;
                    c8158 = new C8158(j3);
                    t = ref$ObjectRef.element;
                    if (t instanceof C8158) {
                        c8158 = null;
                    }
                    if (c8158 != null) {
                    }
                    interfaceC2468 = interfaceC24682;
                    if (AbstractC6231.m11053(this.$currentContext)) {
                        return C6008.f15084;
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerMoveDetectorKt$detectMoves$2(InterfaceC2470 interfaceC2470, PointerEventPass pointerEventPass, InterfaceC7387 interfaceC7387, InterfaceC5189<? super PointerMoveDetectorKt$detectMoves$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_detectMoves = interfaceC2470;
        this.$pointerEventPass = pointerEventPass;
        this.$onMove = interfaceC7387;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new PointerMoveDetectorKt$detectMoves$2(this.$this_detectMoves, this.$pointerEventPass, this.$onMove, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((PointerMoveDetectorKt$detectMoves$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC5192 context = getContext();
            InterfaceC2470 interfaceC2470 = this.$this_detectMoves;
            C00891 c00891 = new C00891(context, this.$pointerEventPass, this.$onMove, null);
            this.label = 1;
            if (((C2462) interfaceC2470).m3565(c00891, this) == coroutineSingletons) {
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
