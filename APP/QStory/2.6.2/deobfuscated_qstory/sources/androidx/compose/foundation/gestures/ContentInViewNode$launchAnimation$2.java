package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2;
import androidx.compose.runtime.collection.C1224;
import com.android.dx.io.Opcodes;
import io.ktor.util.C4210;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5451;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p112.C7327;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", l = {Opcodes.REM_INT_LIT16}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class ContentInViewNode$launchAnimation$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C0487 $animationState;
    final /* synthetic */ InterfaceC0531 $bringIntoViewSpec;
    final /* synthetic */ long $viewportAdjustmentForReverseScroll;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C0524 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6861(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", l = {Opcodes.DIV_INT_LIT8}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC5451 $animationJob;
        final /* synthetic */ C0487 $animationState;
        final /* synthetic */ InterfaceC0531 $bringIntoViewSpec;
        final /* synthetic */ long $viewportAdjustmentForReverseScroll;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C0524 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C0487 c0487, C0524 c0524, InterfaceC0531 interfaceC0531, long j, InterfaceC5451 interfaceC5451, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$animationState = c0487;
            this.this$0 = c0524;
            this.$bringIntoViewSpec = interfaceC0531;
            this.$viewportAdjustmentForReverseScroll = j;
            this.$animationJob = interfaceC5451;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C5175 invokeSuspend$lambda$0(C0524 c0524, C0487 c0487, InterfaceC5451 interfaceC5451, InterfaceC0557 interfaceC0557, float f) {
            float f2 = c0524.f1541 ? 1.0f : -1.0f;
            C0502 c0502 = c0524.f1542;
            long jM1253 = c0502.m1253(c0502.m1258(f2 * f));
            C0502 c05022 = ((C0515) interfaceC0557).f1513;
            float fM1259 = c0502.m1259(c0502.m1253(c05022.m1255(c05022.f1495, jM1253, 1))) * f2;
            if (Math.abs(fM1259) < Math.abs(f)) {
                AbstractC5398.m10504("Scroll animation cancelled because scroll was not consumed (" + fM1259 + " < " + f + ')', null, interfaceC5451);
            }
            return C5175.f14739;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C5175 invokeSuspend$lambda$1(C0524 c0524, C0487 c0487, InterfaceC0531 interfaceC0531) {
            C5175 c5175;
            C0524 c05242;
            C7327 c7327;
            boolean zM1307;
            C0541 c0541 = c0524.f1539;
            while (true) {
                C1224 c1224 = c0541.f1566;
                int i = c1224.f3519;
                c5175 = C5175.f14739;
                if (i == 0) {
                    c05242 = c0524;
                    break;
                }
                if (i == 0) {
                    C4210.m8627("MutableVector is empty.");
                    return null;
                }
                C7327 c73272 = (C7327) ((C0535) c1224.f3520[i - 1]).f1558.invoke();
                if (c73272 == null) {
                    c05242 = c0524;
                    zM1307 = true;
                } else {
                    c05242 = c0524;
                    zM1307 = C0524.m1307(c05242, c73272, 0L, 0L, 3);
                }
                if (!zM1307) {
                    break;
                }
                C1224 c12242 = c0541.f1566;
                ((C0535) c12242.m2043(c12242.f3519 - 1)).f1557.resumeWith(Result.m8755constructorimpl(c5175));
                c0524 = c05242;
            }
            if (c05242.f1538 && (c7327 = (C7327) c05242.f1540.invoke()) != null && C0524.m1307(c05242, c7327, 0L, 0L, 3)) {
                c05242.f1538 = false;
            }
            c0487.f1462 = C0524.m1306(c05242, interfaceC0531, 0L);
            return c5175;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, this.this$0, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, this.$animationJob, interfaceC4356);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC0557 interfaceC0557, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC0557, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.foundation.gestures.飘花落叶言子楪兰世苏哲] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5184.m10206(obj);
                InterfaceC0557 interfaceC0557 = (InterfaceC0557) this.L$0;
                this.$animationState.f1462 = C0524.m1306(this.this$0, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll);
                final C0487 c0487 = this.$animationState;
                final C0524 c0524 = this.this$0;
                C0533 c0533 = new C0533(c0524, c0487, this.$animationJob, interfaceC0557, 0);
                final InterfaceC0531 interfaceC0531 = this.$bringIntoViewSpec;
                ?? r1 = new InterfaceC6542() { // from class: androidx.compose.foundation.gestures.飘花落叶言子楪兰世苏哲
                    @Override // p052.InterfaceC6542
                    public final Object invoke() {
                        return ContentInViewNode$launchAnimation$2.AnonymousClass1.invokeSuspend$lambda$1(c0524, c0487, interfaceC0531);
                    }
                };
                this.label = 1;
                if (c0487.m1242(c0533, r1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5184.m10206(obj);
            }
            return C5175.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentInViewNode$launchAnimation$2(C0524 c0524, C0487 c0487, InterfaceC0531 interfaceC0531, long j, InterfaceC4356<? super ContentInViewNode$launchAnimation$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c0524;
        this.$animationState = c0487;
        this.$bringIntoViewSpec = interfaceC0531;
        this.$viewportAdjustmentForReverseScroll = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new ContentInViewNode$launchAnimation$2(this.this$0, this.$animationState, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, interfaceC4356);
        contentInViewNode$launchAnimation$2.L$0 = obj;
        return contentInViewNode$launchAnimation$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ContentInViewNode$launchAnimation$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        CancellationException cancellationException = null;
        try {
            try {
                if (i == 0) {
                    AbstractC5184.m10206(obj);
                    InterfaceC5451 interfaceC5451M10489 = AbstractC5398.m10489(((InterfaceC5400) this.L$0).mo2420());
                    C0524 c0524 = this.this$0;
                    c0524.f1535 = true;
                    C0502 c0502 = c0524.f1542;
                    MutatePriority mutatePriority = MutatePriority.Default;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, c0524, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, interfaceC5451M10489, null);
                    this.label = 1;
                    if (c0502.m1252(mutatePriority, anonymousClass1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC5184.m10206(obj);
                }
                this.this$0.f1539.m1313();
                C0524 c05242 = this.this$0;
                c05242.f1535 = false;
                c05242.f1539.m1314(null);
                this.this$0.f1538 = false;
                return C5175.f14739;
            } catch (CancellationException e) {
                cancellationException = e;
                throw cancellationException;
            }
        } catch (Throwable th) {
            C0524 c05243 = this.this$0;
            c05243.f1535 = false;
            c05243.f1539.m1314(cancellationException);
            this.this$0.f1538 = false;
            throw th;
        }
    }
}
