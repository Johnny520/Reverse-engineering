package kotlinx.coroutines.flow;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.AbstractC6051;
import p068.InterfaceC7380;
import p068.InterfaceC7381;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1", m556f = "Zip.kt", m557l = {269}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m151d2 = {"R", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1"}, m152k = 3, m153mv = {2, 2, 0})
public final class C0397xd7c321e6 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6151[] $flows;
    final /* synthetic */ InterfaceC7381 $transform$inlined;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m151d2 = {"R", "T", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/Array;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1"}, m152k = 3, m153mv = {2, 2, 0})
    @InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1$1", m556f = "Zip.kt", m557l = {SubsamplingScaleImageView.ORIENTATION_270}, m558m = "invokeSuspend", m559v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC7380 {
        final /* synthetic */ InterfaceC7381 $transform$inlined;
        int I$0;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC5189 interfaceC5189, InterfaceC7381 interfaceC7381) {
            super(3, interfaceC5189);
            this.$transform$inlined = interfaceC7381;
        }

        @Override // p068.InterfaceC7380
        public final Object invoke(InterfaceC6150 interfaceC6150, Object[] objArr, InterfaceC5189<? super C6008> interfaceC5189) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC5189, this.$transform$inlined);
            anonymousClass1.L$0 = interfaceC6150;
            anonymousClass1.L$1 = objArr;
            return anonymousClass1.invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC6150 interfaceC6150 = (InterfaceC6150) this.L$0;
            Object[] objArr = (Object[]) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                InterfaceC7381 interfaceC7381 = this.$transform$inlined;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.I$0 = 0;
                this.label = 1;
                if (interfaceC7381.invoke(interfaceC6150, obj2, obj3, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0397xd7c321e6(InterfaceC6151[] interfaceC6151Arr, InterfaceC5189 interfaceC5189, InterfaceC7381 interfaceC7381) {
        super(2, interfaceC5189);
        this.$flows = interfaceC6151Arr;
        this.$transform$inlined = interfaceC7381;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        C0397xd7c321e6 c0397xd7c321e6 = new C0397xd7c321e6(this.$flows, interfaceC5189, this.$transform$inlined);
        c0397xd7c321e6.L$0 = obj;
        return c0397xd7c321e6;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6150 interfaceC6150, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((C0397xd7c321e6) create(interfaceC6150, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC6150 interfaceC6150 = (InterfaceC6150) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6151[] interfaceC6151Arr = this.$flows;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.$transform$inlined);
            this.L$0 = null;
            this.label = 1;
            if (AbstractC6051.m10858(interfaceC6150, interfaceC6151Arr, anonymousClass1, this) == coroutineSingletons) {
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
