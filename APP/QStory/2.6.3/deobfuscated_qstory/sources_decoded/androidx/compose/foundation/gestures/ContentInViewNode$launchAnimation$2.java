package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2;
import androidx.compose.runtime.collection.C1224;
import com.android.dx.io.Opcodes;
import io.ktor.util.C4211;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5452;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p112.C7328;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", l = {Opcodes.REM_INT_LIT16}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class ContentInViewNode$launchAnimation$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ C0487 $animationState;
    final /* synthetic */ InterfaceC0531 $bringIntoViewSpec;
    final /* synthetic */ long $viewportAdjustmentForReverseScroll;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C0524 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6862(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", l = {Opcodes.DIV_INT_LIT8}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC5452 $animationJob;
        final /* synthetic */ C0487 $animationState;
        final /* synthetic */ InterfaceC0531 $bringIntoViewSpec;
        final /* synthetic */ long $viewportAdjustmentForReverseScroll;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C0524 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C0487 c0487, C0524 c0524, InterfaceC0531 interfaceC0531, long j, InterfaceC5452 interfaceC5452, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$animationState = c0487;
            this.this$0 = c0524;
            this.$bringIntoViewSpec = interfaceC0531;
            this.$viewportAdjustmentForReverseScroll = j;
            this.$animationJob = interfaceC5452;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C5176 invokeSuspend$lambda$0(C0524 c0524, C0487 c0487, InterfaceC5452 interfaceC5452, InterfaceC0557 interfaceC0557, float f) {
            float f2 = c0524.f1542 ? 1.0f : -1.0f;
            C0502 c0502 = c0524.f1543;
            long jM1263 = c0502.m1263(c0502.m1268(f2 * f));
            C0502 c05022 = ((C0515) interfaceC0557).f1514;
            float fM1269 = c0502.m1269(c0502.m1263(c05022.m1265(c05022.f1496, jM1263, 1))) * f2;
            if (Math.abs(fM1269) < Math.abs(f)) {
                AbstractC5399.m10508("Scroll animation cancelled because scroll was not consumed (" + fM1269 + " < " + f + ')', null, interfaceC5452);
            }
            return C5176.f14739;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C5176 invokeSuspend$lambda$1(C0524 c0524, C0487 c0487, InterfaceC0531 interfaceC0531) {
            C5176 c5176;
            C0524 c05242;
            C7328 c7328;
            boolean zM1317;
            C0541 c0541 = c0524.f1540;
            while (true) {
                C1224 c1224 = c0541.f1567;
                int i = c1224.f3520;
                c5176 = C5176.f14739;
                if (i == 0) {
                    c05242 = c0524;
                    break;
                }
                if (i == 0) {
                    C4211.m8617("MutableVector is empty.");
                    return null;
                }
                C7328 c73282 = (C7328) ((C0535) c1224.f3521[i - 1]).f1559.invoke();
                if (c73282 == null) {
                    c05242 = c0524;
                    zM1317 = true;
                } else {
                    c05242 = c0524;
                    zM1317 = C0524.m1317(c05242, c73282, 0L, 0L, 3);
                }
                if (!zM1317) {
                    break;
                }
                C1224 c12242 = c0541.f1567;
                ((C0535) c12242.m2053(c12242.f3520 - 1)).f1558.resumeWith(Result.m8745constructorimpl(c5176));
                c0524 = c05242;
            }
            if (c05242.f1539 && (c7328 = (C7328) c05242.f1541.invoke()) != null && C0524.m1317(c05242, c7328, 0L, 0L, 3)) {
                c05242.f1539 = false;
            }
            c0487.f1463 = C0524.m1316(c05242, interfaceC0531, 0L);
            return c5176;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, this.this$0, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, this.$animationJob, interfaceC4357);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC0557 interfaceC0557, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC0557, interfaceC4357)).invokeSuspend(C5176.f14739);
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
                AbstractC5185.m10210(obj);
                InterfaceC0557 interfaceC0557 = (InterfaceC0557) this.L$0;
                this.$animationState.f1463 = C0524.m1316(this.this$0, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll);
                final C0487 c0487 = this.$animationState;
                final C0524 c0524 = this.this$0;
                C0533 c0533 = new C0533(c0524, c0487, this.$animationJob, interfaceC0557, 0);
                final InterfaceC0531 interfaceC0531 = this.$bringIntoViewSpec;
                ?? r1 = new InterfaceC6543() { // from class: androidx.compose.foundation.gestures.飘花落叶言子楪兰世苏哲
                    @Override // p052.InterfaceC6543
                    public final Object invoke() {
                        return ContentInViewNode$launchAnimation$2.AnonymousClass1.invokeSuspend$lambda$1(c0524, c0487, interfaceC0531);
                    }
                };
                this.label = 1;
                if (c0487.m1252(c0533, r1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5185.m10210(obj);
            }
            return C5176.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentInViewNode$launchAnimation$2(C0524 c0524, C0487 c0487, InterfaceC0531 interfaceC0531, long j, InterfaceC4357<? super ContentInViewNode$launchAnimation$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c0524;
        this.$animationState = c0487;
        this.$bringIntoViewSpec = interfaceC0531;
        this.$viewportAdjustmentForReverseScroll = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new ContentInViewNode$launchAnimation$2(this.this$0, this.$animationState, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, interfaceC4357);
        contentInViewNode$launchAnimation$2.L$0 = obj;
        return contentInViewNode$launchAnimation$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ContentInViewNode$launchAnimation$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        CancellationException cancellationException = null;
        try {
            try {
                if (i == 0) {
                    AbstractC5185.m10210(obj);
                    InterfaceC5452 interfaceC5452M10493 = AbstractC5399.m10493(((InterfaceC5401) this.L$0).mo2430());
                    C0524 c0524 = this.this$0;
                    c0524.f1536 = true;
                    C0502 c0502 = c0524.f1543;
                    MutatePriority mutatePriority = MutatePriority.Default;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, c0524, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, interfaceC5452M10493, null);
                    this.label = 1;
                    if (c0502.m1262(mutatePriority, anonymousClass1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC5185.m10210(obj);
                }
                this.this$0.f1540.m1323();
                C0524 c05242 = this.this$0;
                c05242.f1536 = false;
                c05242.f1540.m1324(null);
                this.this$0.f1539 = false;
                return C5176.f14739;
            } catch (CancellationException e) {
                cancellationException = e;
                throw cancellationException;
            }
        } catch (Throwable th) {
            C0524 c05243 = this.this$0;
            c05243.f1536 = false;
            c05243.f1540.m1324(cancellationException);
            this.this$0.f1539 = false;
            throw th;
        }
    }
}
