package androidx.compose.runtime;

import androidx.activity.AbstractC0900;
import androidx.collection.AbstractC1125;
import androidx.collection.AbstractC1135;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.AbstractC5176;
import kotlin.collections.C5178;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.sequences.AbstractC5954;
import kotlin.sequences.AbstractC5957;
import kotlin.sequences.InterfaceC5959;
import kotlin.text.AbstractC5977;
import net.bytebuddy.description.method.MethodDescription;
import p025.AbstractC7012;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002BA\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m151d2 = {"Landroidx/compose/runtime/ComposePausableCompositionException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Landroidx/collection/飘花落叶言子苏楪世哲兰;", "", "instances", "reused", "Landroidx/collection/飘花落叶言子楪苏兰哲世;", "operations", "", "lastOperation", "", "cause", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/collection/飘花落叶言子苏楪世哲兰;Landroidx/collection/飘花落叶言子苏楪世哲兰;Landroidx/collection/飘花落叶言子楪苏兰哲世;ILjava/lang/Throwable;)V", "Lkotlin/sequences/飘花落叶言子楪苏哲世兰;", "", "operationsSequence", "()Lkotlin/sequences/飘花落叶言子楪苏哲世兰;", "Landroidx/collection/飘花落叶言子苏楪世哲兰;", "Landroidx/collection/飘花落叶言子楪苏兰哲世;", "I", "getMessage", "()Ljava/lang/String;", "getMessage$annotations", "()V", "message", "runtime"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final class ComposePausableCompositionException extends RuntimeException {
    private final AbstractC1135 instances;
    private final int lastOperation;
    private final AbstractC1125 operations;
    private final AbstractC1135 reused;

    /* JADX INFO: renamed from: androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1", m556f = "PausableComposition.kt", m557l = {579}, m558m = "invokeSuspend", m559v = 1)
    public static final class C01671 extends RestrictedSuspendLambda implements InterfaceC7383 {
        int I$0;
        int I$1;
        int I$2;
        private /* synthetic */ Object L$0;
        int label;

        public C01671(InterfaceC5189<? super C01671> interfaceC5189) {
            super(2, interfaceC5189);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C01671 c01671 = ComposePausableCompositionException.this.new C01671(interfaceC5189);
            c01671.L$0 = obj;
            return c01671;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(AbstractC5957 abstractC5957, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C01671) create(abstractC5957, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i;
            AbstractC5957 abstractC5957;
            int i2;
            int i3;
            String strM713;
            int i4;
            int i5;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = this.label;
            if (i6 == 0) {
                AbstractC6017.m10769(obj);
                i = 0;
                abstractC5957 = (AbstractC5957) this.L$0;
                i2 = 0;
                i3 = 0;
            } else {
                if (i6 != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i7 = this.I$2;
                int i8 = this.I$1;
                int i9 = this.I$0;
                abstractC5957 = (AbstractC5957) this.L$0;
                AbstractC6017.m10769(obj);
                i2 = i8;
                i3 = i7;
                i = i9;
            }
            while (i < Math.min(ComposePausableCompositionException.this.lastOperation + 10, ComposePausableCompositionException.this.operations.f1330)) {
                int i10 = i + 1;
                int iM1416 = ComposePausableCompositionException.this.operations.m1416(i);
                switch (iM1416) {
                    case 0:
                        strM713 = "up";
                        break;
                    case 1:
                        strM713 = AbstractC0900.m713(ComposePausableCompositionException.this.instances.m1441(i2), "down ");
                        i2++;
                        break;
                    case 2:
                        strM713 = "remove " + ComposePausableCompositionException.this.operations.m1416(i10) + ' ' + ComposePausableCompositionException.this.operations.m1416(i + 2);
                        i10 = i + 3;
                        break;
                    case 3:
                        strM713 = "move " + ComposePausableCompositionException.this.operations.m1416(i10) + ' ' + ComposePausableCompositionException.this.operations.m1416(i + 2) + ' ' + ComposePausableCompositionException.this.operations.m1416(i + 3);
                        i10 = i + 4;
                        break;
                    case 4:
                        strM713 = "clear";
                        break;
                    case 5:
                        i4 = i + 2;
                        i5 = i2 + 1;
                        strM713 = "insertBottomUp " + ComposePausableCompositionException.this.operations.m1416(i10) + ' ' + ComposePausableCompositionException.this.instances.m1441(i2);
                        i10 = i4;
                        i2 = i5;
                        break;
                    case 6:
                        i4 = i + 2;
                        i5 = i2 + 1;
                        strM713 = "insertTopDown " + ComposePausableCompositionException.this.operations.m1416(i10) + ' ' + ComposePausableCompositionException.this.instances.m1441(i2);
                        i10 = i4;
                        i2 = i5;
                        break;
                    case 7:
                        Object objM1441 = ComposePausableCompositionException.this.instances.m1441(i2);
                        objM1441.getClass();
                        AbstractC5220.m9447(2, objM1441);
                        i2 += 2;
                        strM713 = "apply " + ((InterfaceC7383) objM1441);
                        break;
                    case 8:
                        strM713 = "reuse " + ComposePausableCompositionException.this.reused.m1441(i3);
                        i3++;
                        break;
                    case 9:
                        strM713 = "recompose pending";
                        break;
                    default:
                        strM713 = AbstractC7012.m12147(iM1416, "unknown op: ");
                        break;
                }
                String str = i + ": " + strM713;
                this.L$0 = abstractC5957;
                this.I$0 = i10;
                this.I$1 = i2;
                this.I$2 = i3;
                this.label = 1;
                if (abstractC5957.mo10680(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i = i10;
            }
            return C6008.f15084;
        }
    }

    public ComposePausableCompositionException(AbstractC1135 abstractC1135, AbstractC1135 abstractC11352, AbstractC1125 abstractC1125, int i, Throwable th) {
        super(th);
        this.instances = abstractC1135;
        this.reused = abstractC11352;
        this.operations = abstractC1125;
        this.lastOperation = i;
    }

    private final InterfaceC5959 operationsSequence() {
        return new C5178(new C01671(null), 2);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return AbstractC5977.m10736("\n            |Failed to execute op number " + this.lastOperation + ":\n            |" + AbstractC5176.m9369(AbstractC5176.m9359(50, AbstractC5954.m10669(operationsSequence())), "\n", null, null, null, 62) + "\n            ");
    }

    public static /* synthetic */ void getMessage$annotations() {
    }
}
