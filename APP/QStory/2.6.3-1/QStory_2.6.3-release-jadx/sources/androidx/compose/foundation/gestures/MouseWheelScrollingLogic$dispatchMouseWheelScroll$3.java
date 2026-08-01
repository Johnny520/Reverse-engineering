package androidx.compose.foundation.gestures;

import androidx.appcompat.app.C0923;
import androidx.compose.animation.core.C1196;
import androidx.compose.runtime.AbstractC2182;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p123.C8141;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", m556f = "MouseWheelScrollingLogic.kt", m557l = {228, 241, 261}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ Ref$ObjectRef<C1196> $animationState;
    final /* synthetic */ float $speed;
    final /* synthetic */ Ref$ObjectRef<C1400> $targetScrollDelta;
    final /* synthetic */ Ref$FloatRef $targetValue;
    final /* synthetic */ C1343 $this_dispatchMouseWheelScroll;
    final /* synthetic */ float $threshold;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C1395 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(Ref$FloatRef ref$FloatRef, Ref$ObjectRef<C1196> ref$ObjectRef, Ref$ObjectRef<C1400> ref$ObjectRef2, float f, C1395 c1395, float f2, C1343 c1343, InterfaceC5189<? super MouseWheelScrollingLogic$dispatchMouseWheelScroll$3> interfaceC5189) {
        super(2, interfaceC5189);
        this.$targetValue = ref$FloatRef;
        this.$animationState = ref$ObjectRef;
        this.$targetScrollDelta = ref$ObjectRef2;
        this.$threshold = f;
        this.this$0 = c1395;
        this.$speed = f2;
        this.$this_dispatchMouseWheelScroll = c1343;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7, types: [T, androidx.compose.foundation.gestures.飘花落叶言子苏哲楪兰世] */
    public static final boolean invokeSuspend$lambda$0(C1395 c1395, Ref$ObjectRef ref$ObjectRef, Ref$FloatRef ref$FloatRef, C1343 c1343, Ref$BooleanRef ref$BooleanRef, float f) {
        C1400 c1400M1907 = C1395.m1907(c1395.f1940);
        if (c1400M1907 != null) {
            C0923 c0923 = c1395.f1946;
            long j = c1400M1907.f1954;
            long j2 = c1400M1907.f1955;
            ((C8141) c0923.f572).m13067(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((C8141) c0923.f573).m13067(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            ?? M1912 = ((C1400) ref$ObjectRef.element).m1912(c1400M1907);
            ref$ObjectRef.element = M1912;
            ref$FloatRef.element = c1343.m1830(c1343.m1823(M1912.f1955));
            ref$BooleanRef.element = !AbstractC1362.m1857(r9 - f);
        }
        return c1400M1907 != null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(this.$targetValue, this.$animationState, this.$targetScrollDelta, this.$threshold, this.this$0, this.$speed, this.$this_dispatchMouseWheelScroll, interfaceC5189);
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0 = obj;
        return mouseWheelScrollingLogic$dispatchMouseWheelScroll$3;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC1398 interfaceC1398, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((MouseWheelScrollingLogic$dispatchMouseWheelScroll$3) create(interfaceC1398, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
    
        r0 = java.lang.Math.signum(r0) * r7.$threshold;
        r7.this$0.m1909(r6, r0);
        r2 = r7.$animationState;
        r3 = r2.element;
        r2.element = androidx.compose.animation.core.AbstractC1176.m1578(r3, ((java.lang.Number) ((androidx.compose.runtime.AbstractC2182) r3.f1544).getValue()).floatValue() + r0, 0.0f, 30);
        r0 = p069.AbstractC7390.m12617(java.lang.Math.abs(r7.$targetValue.element - ((java.lang.Number) ((androidx.compose.runtime.AbstractC2182) r7.$animationState.element.f1544).getValue()).floatValue()) / r7.$speed);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ec, code lost:
    
        if (r0 <= 100) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ee, code lost:
    
        r0 = 100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ef, code lost:
    
        r14 = r7.this$0;
        r2 = r7.$animationState.element;
        r3 = r7.$targetValue;
        r4 = r3.element;
        r18 = r1;
        r13 = new androidx.compose.foundation.gestures.C1396(r14, r7.$targetScrollDelta, r3, r7.$this_dispatchMouseWheelScroll, r18);
        r13 = r18;
        r7.L$0 = r6;
        r7.L$1 = r13;
        r7.L$2 = null;
        r7.I$0 = r0;
        r7.label = r11;
        r14.getClass();
        r3 = new kotlin.jvm.internal.Ref$FloatRef();
        r3.element = ((java.lang.Number) ((androidx.compose.runtime.AbstractC2182) r2.f1544).getValue()).floatValue();
        r15 = r0;
        r0 = androidx.compose.animation.core.AbstractC1176.m1588(r2, new java.lang.Float(r4), androidx.compose.animation.core.AbstractC1176.m1573(r0, r11, androidx.compose.animation.core.AbstractC1182.f1486), true, new androidx.compose.foundation.gestures.C1374(r3, r14, r6, r13), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x014b, code lost:
    
        if (r0 != kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x014e, code lost:
    
        r0 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0150, code lost:
    
        if (r0 != r8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0154, code lost:
    
        r14 = r6;
        r0 = r15;
     */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, androidx.compose.animation.core.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x017d -> B:36:0x017f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x018b -> B:13:0x0063). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$BooleanRef ref$BooleanRef;
        InterfaceC1398 interfaceC1398;
        Ref$BooleanRef ref$BooleanRef2;
        Object objM1905;
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = this;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.label;
        int i2 = 2;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC1398 interfaceC13982 = (InterfaceC1398) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0;
            ref$BooleanRef = new Ref$BooleanRef();
            ref$BooleanRef.element = true;
            interfaceC1398 = interfaceC13982;
        } else if (i == 1) {
            Ref$BooleanRef ref$BooleanRef3 = (Ref$BooleanRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$2;
            ref$BooleanRef = (Ref$BooleanRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$1;
            InterfaceC1398 interfaceC13983 = (InterfaceC1398) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0;
            AbstractC6017.m10769(obj);
            interfaceC1398 = interfaceC13983;
            ref$BooleanRef3.element = ((Boolean) obj).booleanValue();
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = this;
            i2 = 2;
        } else if (i == 2) {
            int i3 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.I$0;
            Ref$BooleanRef ref$BooleanRef4 = (Ref$BooleanRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$1;
            InterfaceC1398 interfaceC13984 = (InterfaceC1398) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0;
            AbstractC6017.m10769(obj);
            ref$BooleanRef2 = ref$BooleanRef4;
            InterfaceC1398 interfaceC13985 = interfaceC13984;
            if (!ref$BooleanRef2.element) {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0 = interfaceC13985;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$1 = ref$BooleanRef2;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$2 = ref$BooleanRef2;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.label = 3;
                objM1905 = C1395.m1905(mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.this$0, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$targetScrollDelta, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$targetValue, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$this_dispatchMouseWheelScroll, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$animationState, 50 - ((long) i3), mouseWheelScrollingLogic$dispatchMouseWheelScroll$3);
                if (objM1905 != coroutineSingletons) {
                    ref$BooleanRef = ref$BooleanRef2;
                    interfaceC1398 = interfaceC13985;
                    ref$BooleanRef2.element = ((Boolean) objM1905).booleanValue();
                    i2 = 2;
                }
                return coroutineSingletons;
            }
            ref$BooleanRef = ref$BooleanRef2;
            interfaceC1398 = interfaceC13985;
        } else {
            if (i != 3) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Ref$BooleanRef ref$BooleanRef5 = (Ref$BooleanRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$2;
            ref$BooleanRef = (Ref$BooleanRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$1;
            InterfaceC1398 interfaceC13986 = (InterfaceC1398) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0;
            AbstractC6017.m10769(obj);
            ref$BooleanRef2 = ref$BooleanRef5;
            interfaceC1398 = interfaceC13986;
            objM1905 = obj;
            ref$BooleanRef2.element = ((Boolean) objM1905).booleanValue();
            i2 = 2;
        }
        while (true) {
            boolean z = ref$BooleanRef.element;
            C6008 c6008 = C6008.f15084;
            if (!z) {
                return c6008;
            }
            ref$BooleanRef.element = false;
            float fFloatValue = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$targetValue.element - ((Number) ((AbstractC2182) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$animationState.element.f1544).getValue()).floatValue();
            if (!mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$targetScrollDelta.element.f1953 && Math.abs(fFloatValue) >= mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$threshold) {
                break;
            }
            Ref$BooleanRef ref$BooleanRef6 = ref$BooleanRef;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.this$0.m1909(interfaceC1398, fFloatValue);
            C1395 c1395 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.this$0;
            Ref$ObjectRef<C1400> ref$ObjectRef = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$targetScrollDelta;
            Ref$FloatRef ref$FloatRef = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$targetValue;
            C1343 c1343 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$this_dispatchMouseWheelScroll;
            Ref$ObjectRef<C1196> ref$ObjectRef2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$animationState;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0 = interfaceC1398;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$1 = ref$BooleanRef6;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$2 = ref$BooleanRef6;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.label = 1;
            InterfaceC1398 interfaceC13987 = interfaceC1398;
            Object objM19052 = C1395.m1905(c1395, ref$ObjectRef, ref$FloatRef, c1343, ref$ObjectRef2, 50L, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3);
            if (objM19052 == coroutineSingletons) {
                break;
            }
            ref$BooleanRef = ref$BooleanRef6;
            interfaceC1398 = interfaceC13987;
            ref$BooleanRef6.element = ((Boolean) objM19052).booleanValue();
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = this;
            i2 = 2;
        }
    }
}
