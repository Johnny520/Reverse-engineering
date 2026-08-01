package androidx.compose.runtime;

import androidx.activity.AbstractC0053;
import androidx.collection.AbstractC0278;
import androidx.collection.AbstractC0288;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.collections.AbstractC4343;
import kotlin.collections.C4345;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.AbstractC4387;
import kotlin.sequences.AbstractC5121;
import kotlin.sequences.AbstractC5124;
import kotlin.sequences.InterfaceC5126;
import kotlin.text.AbstractC5144;
import net.bytebuddy.description.method.MethodDescription;
import p007.AbstractC6136;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002BA\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/ComposePausableCompositionException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Landroidx/collection/飘花落叶言子苏楪世哲兰;", "", "instances", "reused", "Landroidx/collection/飘花落叶言子楪苏兰哲世;", "operations", "", "lastOperation", "", "cause", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroidx/collection/飘花落叶言子苏楪世哲兰;Landroidx/collection/飘花落叶言子苏楪世哲兰;Landroidx/collection/飘花落叶言子楪苏兰哲世;ILjava/lang/Throwable;)V", "Lkotlin/sequences/飘花落叶言子楪苏哲世兰;", "", "operationsSequence", "()Lkotlin/sequences/飘花落叶言子楪苏哲世兰;", "Landroidx/collection/飘花落叶言子苏楪世哲兰;", "Landroidx/collection/飘花落叶言子楪苏兰哲世;", "I", "getMessage", "()Ljava/lang/String;", "getMessage$annotations", "()V", "message", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ComposePausableCompositionException extends RuntimeException {
    private final AbstractC0288 instances;
    private final int lastOperation;
    private final AbstractC0278 operations;
    private final AbstractC0288 reused;

    /* JADX INFO: renamed from: androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/sequences/飘花落叶言子楪苏兰世哲;", "", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/sequences/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6861(c = "androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1", f = "PausableComposition.kt", l = {579}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC6553 {
        int I$0;
        int I$1;
        int I$2;
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            AnonymousClass1 anonymousClass1 = ComposePausableCompositionException.this.new AnonymousClass1(interfaceC4356);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(AbstractC5124 abstractC5124, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(abstractC5124, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i;
            AbstractC5124 abstractC5124;
            int i2;
            int i3;
            String strM153;
            int i4;
            int i5;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = this.label;
            if (i6 == 0) {
                AbstractC5184.m10206(obj);
                i = 0;
                abstractC5124 = (AbstractC5124) this.L$0;
                i2 = 0;
                i3 = 0;
            } else {
                if (i6 != 1) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i7 = this.I$2;
                int i8 = this.I$1;
                int i9 = this.I$0;
                abstractC5124 = (AbstractC5124) this.L$0;
                AbstractC5184.m10206(obj);
                i2 = i8;
                i3 = i7;
                i = i9;
            }
            while (i < Math.min(ComposePausableCompositionException.this.lastOperation + 10, ComposePausableCompositionException.this.operations.f985)) {
                int i10 = i + 1;
                int iM855 = ComposePausableCompositionException.this.operations.m855(i);
                switch (iM855) {
                    case 0:
                        strM153 = "up";
                        break;
                    case 1:
                        strM153 = AbstractC0053.m153(ComposePausableCompositionException.this.instances.m880(i2), "down ");
                        i2++;
                        break;
                    case 2:
                        strM153 = "remove " + ComposePausableCompositionException.this.operations.m855(i10) + ' ' + ComposePausableCompositionException.this.operations.m855(i + 2);
                        i10 = i + 3;
                        break;
                    case 3:
                        strM153 = "move " + ComposePausableCompositionException.this.operations.m855(i10) + ' ' + ComposePausableCompositionException.this.operations.m855(i + 2) + ' ' + ComposePausableCompositionException.this.operations.m855(i + 3);
                        i10 = i + 4;
                        break;
                    case 4:
                        strM153 = "clear";
                        break;
                    case 5:
                        i4 = i + 2;
                        i5 = i2 + 1;
                        strM153 = "insertBottomUp " + ComposePausableCompositionException.this.operations.m855(i10) + ' ' + ComposePausableCompositionException.this.instances.m880(i2);
                        i10 = i4;
                        i2 = i5;
                        break;
                    case 6:
                        i4 = i + 2;
                        i5 = i2 + 1;
                        strM153 = "insertTopDown " + ComposePausableCompositionException.this.operations.m855(i10) + ' ' + ComposePausableCompositionException.this.instances.m880(i2);
                        i10 = i4;
                        i2 = i5;
                        break;
                    case 7:
                        Object objM880 = ComposePausableCompositionException.this.instances.m880(i2);
                        objM880.getClass();
                        AbstractC4387.m8898(2, objM880);
                        i2 += 2;
                        strM153 = "apply " + ((InterfaceC6553) objM880);
                        break;
                    case 8:
                        strM153 = "reuse " + ComposePausableCompositionException.this.reused.m880(i3);
                        i3++;
                        break;
                    case 9:
                        strM153 = "recompose pending";
                        break;
                    default:
                        strM153 = AbstractC6136.m11556(iM855, "unknown op: ");
                        break;
                }
                String str = i + ": " + strM153;
                this.L$0 = abstractC5124;
                this.I$0 = i10;
                this.I$1 = i2;
                this.I$2 = i3;
                this.label = 1;
                if (abstractC5124.mo10117(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i = i10;
            }
            return C5175.f14739;
        }
    }

    public ComposePausableCompositionException(AbstractC0288 abstractC0288, AbstractC0288 abstractC02882, AbstractC0278 abstractC0278, int i, Throwable th) {
        super(th);
        this.instances = abstractC0288;
        this.reused = abstractC02882;
        this.operations = abstractC0278;
        this.lastOperation = i;
    }

    private final InterfaceC5126 operationsSequence() {
        return new C4345(new AnonymousClass1(null), 2);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return AbstractC5144.m10173("\n            |Failed to execute op number " + this.lastOperation + ":\n            |" + AbstractC4343.m8813(AbstractC4343.m8803(50, AbstractC5121.m10106(operationsSequence())), "\n", null, null, null, 62) + "\n            ");
    }

    public static /* synthetic */ void getMessage$annotations() {
    }
}
