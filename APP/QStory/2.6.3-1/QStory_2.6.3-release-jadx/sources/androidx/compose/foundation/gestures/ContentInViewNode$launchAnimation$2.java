package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2;
import androidx.compose.runtime.collection.C2059;
import com.android.p002dx.p005io.Opcodes;
import io.ktor.util.C5043;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p128.C8157;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", m556f = "ContentInViewNode.kt", m557l = {Opcodes.REM_INT_LIT16}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class ContentInViewNode$launchAnimation$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C1328 $animationState;
    final /* synthetic */ InterfaceC1372 $bringIntoViewSpec;
    final /* synthetic */ long $viewportAdjustmentForReverseScroll;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C1365 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", m556f = "ContentInViewNode.kt", m557l = {Opcodes.DIV_INT_LIT8}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00361 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC6284 $animationJob;
        final /* synthetic */ C1328 $animationState;
        final /* synthetic */ InterfaceC1372 $bringIntoViewSpec;
        final /* synthetic */ long $viewportAdjustmentForReverseScroll;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C1365 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00361(C1328 c1328, C1365 c1365, InterfaceC1372 interfaceC1372, long j, InterfaceC6284 interfaceC6284, InterfaceC5189<? super C00361> interfaceC5189) {
            super(2, interfaceC5189);
            this.$animationState = c1328;
            this.this$0 = c1365;
            this.$bringIntoViewSpec = interfaceC1372;
            this.$viewportAdjustmentForReverseScroll = j;
            this.$animationJob = interfaceC6284;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C6008 invokeSuspend$lambda$0(C1365 c1365, C1328 c1328, InterfaceC6284 interfaceC6284, InterfaceC1398 interfaceC1398, float f) {
            float f2 = c1365.f1887 ? 1.0f : -1.0f;
            C1343 c1343 = c1365.f1888;
            long jM1823 = c1343.m1823(c1343.m1828(f2 * f));
            C1343 c13432 = ((C1356) interfaceC1398).f1859;
            float fM1829 = c1343.m1829(c1343.m1823(c13432.m1825(c13432.f1841, jM1823, 1))) * f2;
            if (Math.abs(fM1829) < Math.abs(f)) {
                AbstractC6231.m11067("Scroll animation cancelled because scroll was not consumed (" + fM1829 + " < " + f + ')', null, interfaceC6284);
            }
            return C6008.f15084;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C6008 invokeSuspend$lambda$1(C1365 c1365, C1328 c1328, InterfaceC1372 interfaceC1372) {
            C6008 c6008;
            C1365 c13652;
            C8157 c8157;
            boolean zM1877;
            C1382 c1382 = c1365.f1885;
            while (true) {
                C2059 c2059 = c1382.f1912;
                int i = c2059.f3865;
                c6008 = C6008.f15084;
                if (i == 0) {
                    c13652 = c1365;
                    break;
                }
                if (i == 0) {
                    C5043.m9176("MutableVector is empty.");
                    return null;
                }
                C8157 c81572 = (C8157) ((C1376) c2059.f3866[i - 1]).f1904.invoke();
                if (c81572 == null) {
                    c13652 = c1365;
                    zM1877 = true;
                } else {
                    c13652 = c1365;
                    zM1877 = C1365.m1877(c13652, c81572, 0L, 0L, 3);
                }
                if (!zM1877) {
                    break;
                }
                C2059 c20592 = c1382.f1912;
                ((C1376) c20592.m2613(c20592.f3865 - 1)).f1903.resumeWith(Result.m9304constructorimpl(c6008));
                c1365 = c13652;
            }
            if (c13652.f1884 && (c8157 = (C8157) c13652.f1886.invoke()) != null && C1365.m1877(c13652, c8157, 0L, 0L, 3)) {
                c13652.f1884 = false;
            }
            c1328.f1808 = C1365.m1876(c13652, interfaceC1372, 0L);
            return c6008;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C00361 c00361 = new C00361(this.$animationState, this.this$0, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, this.$animationJob, interfaceC5189);
            c00361.L$0 = obj;
            return c00361;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC1398 interfaceC1398, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00361) create(interfaceC1398, interfaceC5189)).invokeSuspend(C6008.f15084);
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
                AbstractC6017.m10769(obj);
                InterfaceC1398 interfaceC1398 = (InterfaceC1398) this.L$0;
                this.$animationState.f1808 = C1365.m1876(this.this$0, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll);
                final C1328 c1328 = this.$animationState;
                final C1365 c1365 = this.this$0;
                C1374 c1374 = new C1374(c1365, c1328, this.$animationJob, interfaceC1398, 0);
                final InterfaceC1372 interfaceC1372 = this.$bringIntoViewSpec;
                ?? r1 = new InterfaceC7372() { // from class: androidx.compose.foundation.gestures.飘花落叶言子楪兰世苏哲
                    @Override // p068.InterfaceC7372
                    public final Object invoke() {
                        return ContentInViewNode$launchAnimation$2.C00361.invokeSuspend$lambda$1(c1365, c1328, interfaceC1372);
                    }
                };
                this.label = 1;
                if (c1328.m1812(c1374, r1, this) == coroutineSingletons) {
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
    public ContentInViewNode$launchAnimation$2(C1365 c1365, C1328 c1328, InterfaceC1372 interfaceC1372, long j, InterfaceC5189<? super ContentInViewNode$launchAnimation$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1365;
        this.$animationState = c1328;
        this.$bringIntoViewSpec = interfaceC1372;
        this.$viewportAdjustmentForReverseScroll = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new ContentInViewNode$launchAnimation$2(this.this$0, this.$animationState, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, interfaceC5189);
        contentInViewNode$launchAnimation$2.L$0 = obj;
        return contentInViewNode$launchAnimation$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ContentInViewNode$launchAnimation$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        CancellationException cancellationException = null;
        try {
            try {
                if (i == 0) {
                    AbstractC6017.m10769(obj);
                    InterfaceC6284 interfaceC6284M11052 = AbstractC6231.m11052(((InterfaceC6233) this.L$0).mo2990());
                    C1365 c1365 = this.this$0;
                    c1365.f1881 = true;
                    C1343 c1343 = c1365.f1888;
                    MutatePriority mutatePriority = MutatePriority.Default;
                    C00361 c00361 = new C00361(this.$animationState, c1365, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, interfaceC6284M11052, null);
                    this.label = 1;
                    if (c1343.m1822(mutatePriority, c00361, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC6017.m10769(obj);
                }
                this.this$0.f1885.m1883();
                C1365 c13652 = this.this$0;
                c13652.f1881 = false;
                c13652.f1885.m1884(null);
                this.this$0.f1884 = false;
                return C6008.f15084;
            } catch (CancellationException e) {
                cancellationException = e;
                throw cancellationException;
            }
        } catch (Throwable th) {
            C1365 c13653 = this.this$0;
            c13653.f1881 = false;
            c13653.f1885.m1884(cancellationException);
            this.this$0.f1884 = false;
            throw th;
        }
    }
}
