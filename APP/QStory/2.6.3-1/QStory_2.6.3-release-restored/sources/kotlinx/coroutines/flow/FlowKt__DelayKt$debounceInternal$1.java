package kotlinx.coroutines.flow;

import com.android.p002dx.p005io.Opcodes;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.C6036;
import kotlinx.coroutines.channels.InterfaceC6031;
import kotlinx.coroutines.flow.internal.AbstractC6051;
import kotlinx.coroutines.selects.AbstractC6204;
import kotlinx.coroutines.selects.C6201;
import p068.InterfaceC7380;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", m556f = "Delay.kt", m557l = {Opcodes.XOR_INT_LIT16, 415}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"T", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "downstream", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;)V"}, m152k = 3, m153mv = {2, 2, 0})
final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC6151 $this_debounceInternal;
    final /* synthetic */ InterfaceC7387 $timeoutMillisSelector;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1(InterfaceC7387 interfaceC7387, InterfaceC6151 interfaceC6151, InterfaceC5189<? super FlowKt__DelayKt$debounceInternal$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$timeoutMillisSelector = interfaceC7387;
        this.$this_debounceInternal = interfaceC6151;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC6150 interfaceC6150, InterfaceC5189<? super C6008> interfaceC5189) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.$timeoutMillisSelector, this.$this_debounceInternal, interfaceC5189);
        flowKt__DelayKt$debounceInternal$1.L$0 = interfaceC6233;
        flowKt__DelayKt$debounceInternal$1.L$1 = interfaceC6150;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        if (r2.emit(r10, r16) == r3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f A[PHI: r1 r2 r4 r9
  0x009f: PHI (r1v3 kotlin.jvm.internal.Ref$LongRef) = (r1v5 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef) binds: [B:28:0x009d, B:15:0x0066, B:21:0x0081] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r2v2 kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲) = 
  (r2v8 kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲)
  (r2v9 kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲)
  (r2v9 kotlinx.coroutines.flow.飘花落叶言子楪苏世兰哲)
 binds: [B:28:0x009d, B:15:0x0066, B:21:0x0081] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r4v3 kotlin.jvm.internal.Ref$ObjectRef) = 
  (r4v5 kotlin.jvm.internal.Ref$ObjectRef)
  (r4v6 kotlin.jvm.internal.Ref$ObjectRef)
  (r4v6 kotlin.jvm.internal.Ref$ObjectRef)
 binds: [B:28:0x009d, B:15:0x0066, B:21:0x0081] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r9v3 kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲) = 
  (r9v4 kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲)
  (r9v5 kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲)
  (r9v5 kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲)
 binds: [B:28:0x009d, B:15:0x0066, B:21:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e6 -> B:7:0x002c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        InterfaceC6031 interfaceC6031;
        Ref$LongRef ref$LongRef;
        Ref$ObjectRef ref$ObjectRef2;
        C6201 c6201;
        InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
        InterfaceC6150 interfaceC6150 = (InterfaceC6150) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C6036 c6036M10836 = AbstractC6037.m10836(interfaceC6233, null, 0, new FlowKt__DelayKt$debounceInternal$1$values$1(this.$this_debounceInternal, null), 3);
            ref$ObjectRef = new Ref$ObjectRef();
            interfaceC6031 = c6036M10836;
            if (ref$ObjectRef.element != AbstractC6051.f15150) {
            }
        } else {
            if (i == 1) {
                ref$LongRef = (Ref$LongRef) this.L$4;
                ref$ObjectRef = (Ref$ObjectRef) this.L$3;
                interfaceC6031 = (InterfaceC6031) this.L$2;
                AbstractC6017.m10769(obj);
                ref$ObjectRef.element = null;
                InterfaceC6150 interfaceC61502 = interfaceC6150;
                Ref$LongRef ref$LongRef2 = ref$LongRef;
                ref$ObjectRef2 = ref$ObjectRef;
                c6201 = new C6201(getContext());
                if (ref$ObjectRef2.element != 0) {
                }
                c6201.m10980(interfaceC6031.mo10809(), new FlowKt__DelayKt$debounceInternal$1$3$2(ref$ObjectRef2, interfaceC61502, null));
                this.L$0 = null;
                this.L$1 = interfaceC61502;
                this.L$2 = interfaceC6031;
                this.L$3 = ref$ObjectRef2;
                this.L$4 = null;
                this.L$5 = null;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 2;
                if (c6201.m10978(this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$ObjectRef2 = (Ref$ObjectRef) this.L$3;
            InterfaceC6031 interfaceC60312 = (InterfaceC6031) this.L$2;
            AbstractC6017.m10769(obj);
            interfaceC6031 = interfaceC60312;
            ref$ObjectRef = ref$ObjectRef2;
            if (ref$ObjectRef.element != AbstractC6051.f15150) {
                ref$LongRef = new Ref$LongRef();
                Object obj2 = ref$ObjectRef.element;
                if (obj2 != null) {
                    InterfaceC7387 interfaceC7387 = this.$timeoutMillisSelector;
                    C5317 c5317 = AbstractC6051.f15152;
                    if (obj2 == c5317) {
                        obj2 = null;
                    }
                    long jLongValue = ((Number) interfaceC7387.invoke(obj2)).longValue();
                    ref$LongRef.element = jLongValue;
                    if (jLongValue < 0) {
                        C6755.m11869("Debounce timeout should not be negative");
                        return null;
                    }
                    if (jLongValue != 0) {
                        InterfaceC6150 interfaceC615022 = interfaceC6150;
                        Ref$LongRef ref$LongRef22 = ref$LongRef;
                        ref$ObjectRef2 = ref$ObjectRef;
                        c6201 = new C6201(getContext());
                        if (ref$ObjectRef2.element != 0) {
                            AbstractC6204.m10985(c6201, ref$LongRef22.element, new FlowKt__DelayKt$debounceInternal$1$3$1(interfaceC615022, ref$ObjectRef2, null));
                        }
                        c6201.m10980(interfaceC6031.mo10809(), new FlowKt__DelayKt$debounceInternal$1$3$2(ref$ObjectRef2, interfaceC615022, null));
                        this.L$0 = null;
                        this.L$1 = interfaceC615022;
                        this.L$2 = interfaceC6031;
                        this.L$3 = ref$ObjectRef2;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.label = 2;
                        if (c6201.m10978(this) != coroutineSingletons) {
                            interfaceC6150 = interfaceC615022;
                            ref$ObjectRef = ref$ObjectRef2;
                        }
                    } else {
                        Object obj3 = ref$ObjectRef.element;
                        if (obj3 == c5317) {
                            obj3 = null;
                        }
                        this.L$0 = null;
                        this.L$1 = interfaceC6150;
                        this.L$2 = interfaceC6031;
                        this.L$3 = ref$ObjectRef;
                        this.L$4 = ref$LongRef;
                        this.L$5 = null;
                        this.label = 1;
                    }
                    return coroutineSingletons;
                }
                if (ref$ObjectRef.element != AbstractC6051.f15150) {
                    return C6008.f15084;
                }
            }
        }
    }
}
