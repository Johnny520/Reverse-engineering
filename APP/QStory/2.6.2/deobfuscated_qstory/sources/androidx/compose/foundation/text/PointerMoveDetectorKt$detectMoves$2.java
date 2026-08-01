package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.C1627;
import androidx.compose.ui.input.pointer.InterfaceC1633;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", f = "PointerMoveDetector.kt", l = {41}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class PointerMoveDetectorKt$detectMoves$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6557 $onMove;
    final /* synthetic */ PointerEventPass $pointerEventPass;
    final /* synthetic */ InterfaceC1635 $this_detectMoves;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6861(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", f = "PointerMoveDetector.kt", l = {44}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC4359 $currentContext;
        final /* synthetic */ InterfaceC6557 $onMove;
        final /* synthetic */ PointerEventPass $pointerEventPass;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC4359 interfaceC4359, PointerEventPass pointerEventPass, InterfaceC6557 interfaceC6557, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$currentContext = interfaceC4359;
            this.$pointerEventPass = pointerEventPass;
            this.$onMove = interfaceC6557;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$pointerEventPass, this.$onMove, interfaceC4356);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC1633, interfaceC4356)).invokeSuspend(C5175.f14739);
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
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r10.label
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 != r3) goto L16
                java.lang.Object r1 = r10.L$1
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                java.lang.Object r4 = r10.L$0
                androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r4 = (androidx.compose.ui.input.pointer.InterfaceC1633) r4
                kotlin.AbstractC5184.m10206(r11)
                goto L44
            L16:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                top.suzhelan.qstory.hook.item.C5919.m11250(r10)
                return r2
            L1c:
                kotlin.AbstractC5184.m10206(r11)
                java.lang.Object r11 = r10.L$0
                androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r11 = (androidx.compose.ui.input.pointer.InterfaceC1633) r11
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
            L28:
                kotlin.coroutines.飘花落叶言子楪苏世兰哲 r4 = r10.$currentContext
                boolean r4 = kotlinx.coroutines.AbstractC5398.m10490(r4)
                if (r4 == 0) goto L8a
                androidx.compose.ui.input.pointer.PointerEventPass r4 = r10.$pointerEventPass
                r10.L$0 = r11
                r10.L$1 = r1
                r10.label = r3
                androidx.compose.ui.input.pointer.飘花落叶言子世楪兰哲苏 r11 = (androidx.compose.ui.input.pointer.C1621) r11
                java.lang.Object r4 = r11.m2989(r4, r10)
                if (r4 != r0) goto L41
                return r0
            L41:
                r9 = r4
                r4 = r11
                r11 = r9
            L44:
                androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲兰世 r11 = (androidx.compose.ui.input.pointer.C1652) r11
                int r5 = r11.f4846
                r6 = 3
                if (r5 != r6) goto L4c
                goto L53
            L4c:
                r6 = 4
                if (r5 != r6) goto L50
                goto L53
            L50:
                r6 = 5
                if (r5 != r6) goto L88
            L53:
                java.util.List r11 = r11.f4851
                java.lang.Object r11 = kotlin.collections.AbstractC4343.m8827(r11)
                androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r11 = (androidx.compose.ui.input.pointer.C1643) r11
                long r5 = r11.f4806
                飘花落叶言子世哲兰楪苏.飘花落叶言子楪世苏兰哲 r11 = new 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世苏兰哲
                r11.<init>(r5)
                T r7 = r1.element
                boolean r8 = r7 instanceof p112.C7328
                if (r8 != 0) goto L69
                goto L73
            L69:
                飘花落叶言子世哲兰楪苏.飘花落叶言子楪世苏兰哲 r7 = (p112.C7328) r7
                long r7 = r7.f19546
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 == 0) goto L72
                goto L73
            L72:
                r11 = r2
            L73:
                if (r11 == 0) goto L88
                飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r5 = r10.$onMove
                long r6 = r11.f19546
                飘花落叶言子世哲兰楪苏.飘花落叶言子楪世苏兰哲 r11 = new 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世苏兰哲
                r11.<init>(r6)
                r1.element = r11
                飘花落叶言子世哲兰楪苏.飘花落叶言子楪世苏兰哲 r11 = new 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世苏兰哲
                r11.<init>(r6)
                r5.invoke(r11)
            L88:
                r11 = r4
                goto L28
            L8a:
                kotlin.飘花落叶言子楪兰苏哲世 r10 = kotlin.C5175.f14739
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerMoveDetectorKt$detectMoves$2(InterfaceC1635 interfaceC1635, PointerEventPass pointerEventPass, InterfaceC6557 interfaceC6557, InterfaceC4356<? super PointerMoveDetectorKt$detectMoves$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_detectMoves = interfaceC1635;
        this.$pointerEventPass = pointerEventPass;
        this.$onMove = interfaceC6557;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new PointerMoveDetectorKt$detectMoves$2(this.$this_detectMoves, this.$pointerEventPass, this.$onMove, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((PointerMoveDetectorKt$detectMoves$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC4359 context = getContext();
            InterfaceC1635 interfaceC1635 = this.$this_detectMoves;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, this.$pointerEventPass, this.$onMove, null);
            this.label = 1;
            if (((C1627) interfaceC1635).m2995(anonymousClass1, this) == coroutineSingletons) {
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
