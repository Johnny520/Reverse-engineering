package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.InterfaceC2000;
import androidx.compose.p001ui.input.pointer.C2462;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import com.android.p002dx.p005io.Opcodes;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1", m556f = "BasicTooltip.kt", m557l = {249}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class BasicTooltipKt$handleGestures$2$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC2000 $state;
    final /* synthetic */ InterfaceC2470 $this_pointerInput;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1", m556f = "BasicTooltip.kt", m557l = {Opcodes.INVOKE_CUSTOM_RANGE}, m558m = "invokeSuspend")
    public static final class C01621 extends RestrictedSuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC6233 $$this$coroutineScope;
        final /* synthetic */ InterfaceC2000 $state;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
        @InterfaceC7691(m555c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1", m556f = "BasicTooltip.kt", m557l = {258}, m558m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC7383 {
            final /* synthetic */ InterfaceC2000 $state;
            int label;

            public AnonymousClass1(InterfaceC2000 interfaceC2000, InterfaceC5189<? super AnonymousClass1> interfaceC5189) {
                super(2, interfaceC5189);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
                return new AnonymousClass1(null, interfaceC5189);
            }

            @Override // p068.InterfaceC7383
            public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
                return ((AnonymousClass1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC6017.m10769(obj);
                    MutatePriority mutatePriority = MutatePriority.Default;
                    this.label = 1;
                    throw null;
                }
                if (i == 1) {
                    AbstractC6017.m10769(obj);
                    return C6008.f15084;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01621(InterfaceC6233 interfaceC6233, InterfaceC2000 interfaceC2000, InterfaceC5189<? super C01621> interfaceC5189) {
            super(2, interfaceC5189);
            this.$$this$coroutineScope = interfaceC6233;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C01621 c01621 = new C01621(this.$$this$coroutineScope, null, interfaceC5189);
            c01621.L$0 = obj;
            return c01621;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C01621) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0034 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0032 -> B:12:0x0035). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r7.label
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L16
                java.lang.Object r1 = r7.L$1
                androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.p001ui.input.pointer.PointerEventPass) r1
                java.lang.Object r4 = r7.L$0
                androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r4 = (androidx.compose.p001ui.input.pointer.InterfaceC2468) r4
                kotlin.AbstractC6017.m10769(r8)
                goto L35
            L16:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                top.suzhelan.qstory.hook.item.C6755.m11870(r7)
                return r3
            L1c:
                kotlin.AbstractC6017.m10769(r8)
                java.lang.Object r8 = r7.L$0
                androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r8 = (androidx.compose.p001ui.input.pointer.InterfaceC2468) r8
                androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.p001ui.input.pointer.PointerEventPass.Main
            L25:
                r7.L$0 = r8
                r7.L$1 = r1
                r7.label = r2
                r4 = r8
                androidx.compose.ui.input.pointer.飘花落叶言子世楪兰哲苏 r4 = (androidx.compose.p001ui.input.pointer.C2456) r4
                java.lang.Object r8 = r4.m3559(r1, r7)
                if (r8 != r0) goto L35
                return r0
            L35:
                androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世 r8 = (androidx.compose.p001ui.input.pointer.C2487) r8
                java.util.List r5 = r8.f5197
                r6 = 0
                java.lang.Object r5 = r5.get(r6)
                androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r5 = (androidx.compose.p001ui.input.pointer.C2478) r5
                int r5 = r5.f5164
                r6 = 2
                if (r5 != r6) goto L5b
                int r8 = r8.f5192
                r5 = 4
                if (r8 != r5) goto L56
                kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r8 = r7.$$this$coroutineScope
                androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1 r5 = new androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1
                r5.<init>(r3, r3)
                r6 = 3
                kotlinx.coroutines.AbstractC6231.m11036(r8, r3, r3, r5, r6)
                goto L5b
            L56:
                r5 = 5
                if (r8 == r5) goto L5a
                goto L5b
            L5a:
                throw r3
            L5b:
                r8 = r4
                goto L25
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1.C01621.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$handleGestures$2$1(InterfaceC2470 interfaceC2470, InterfaceC2000 interfaceC2000, InterfaceC5189<? super BasicTooltipKt$handleGestures$2$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_pointerInput = interfaceC2470;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        BasicTooltipKt$handleGestures$2$1 basicTooltipKt$handleGestures$2$1 = new BasicTooltipKt$handleGestures$2$1(this.$this_pointerInput, null, interfaceC5189);
        basicTooltipKt$handleGestures$2$1.L$0 = obj;
        return basicTooltipKt$handleGestures$2$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((BasicTooltipKt$handleGestures$2$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
            InterfaceC2470 interfaceC2470 = this.$this_pointerInput;
            C01621 c01621 = new C01621(interfaceC6233, null, null);
            this.label = 1;
            if (((C2462) interfaceC2470).m3565(c01621, this) == coroutineSingletons) {
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
