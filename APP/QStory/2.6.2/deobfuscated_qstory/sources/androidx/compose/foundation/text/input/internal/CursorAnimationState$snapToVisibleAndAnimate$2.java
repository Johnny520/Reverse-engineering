package androidx.compose.foundation.text.input.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5451;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Z"}, k = 3, mv = {2, 1, 0})
final class CursorAnimationState$snapToVisibleAndAnimate$2 extends SuspendLambda implements InterfaceC6553 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C0874 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6861(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", l = {72, 77, 79, 81}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC5451 $oldJob;
        int label;
        final /* synthetic */ C0874 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC5451 interfaceC5451, C0874 c0874, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$oldJob = interfaceC5451;
            this.this$0 = c0874;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(this.$oldJob, this.this$0, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
        
            if (kotlinx.coroutines.AbstractC5398.m10495(500, r10) != r0) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0067 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:8:0x0017, B:36:0x0079, B:30:0x005e, B:33:0x0067, B:14:0x0024, B:15:0x0028, B:28:0x0058, B:29:0x005d, B:23:0x0040, B:25:0x004f), top: B:40:0x000d }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0076 -> B:36:0x0079). Please report as a decompilation issue!!! */
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
                r3 = 500(0x1f4, double:2.47E-321)
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 4
                r7 = 3
                r8 = 2
                r9 = 1
                if (r1 == 0) goto L30
                if (r1 == r9) goto L2c
                if (r1 == r8) goto L28
                if (r1 == r7) goto L24
                if (r1 != r6) goto L1d
                kotlin.AbstractC5184.m10206(r11)     // Catch: java.lang.Throwable -> L1b
                goto L79
            L1b:
                r11 = move-exception
                goto L83
            L1d:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                top.suzhelan.qstory.hook.item.C5919.m11250(r10)
                r10 = 0
                return r10
            L24:
                kotlin.AbstractC5184.m10206(r11)     // Catch: java.lang.Throwable -> L1b
                goto L67
            L28:
                kotlin.AbstractC5184.m10206(r11)     // Catch: java.lang.Throwable -> L1b
                goto L58
            L2c:
                kotlin.AbstractC5184.m10206(r11)
                goto L40
            L30:
                kotlin.AbstractC5184.m10206(r11)
                kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r11 = r10.$oldJob
                if (r11 == 0) goto L40
                r10.label = r9
                java.lang.Object r11 = kotlinx.coroutines.AbstractC5398.m10502(r11, r10)
                if (r11 != r0) goto L40
                goto L78
            L40:
                androidx.compose.foundation.text.input.internal.飘花落叶言子楪哲苏兰世 r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
                androidx.compose.runtime.飘花落叶言子苏楪哲世兰 r11 = r11.f2457     // Catch: java.lang.Throwable -> L1b
                androidx.compose.runtime.飘花落叶言子哲苏楪世兰 r11 = (androidx.compose.runtime.AbstractC1349) r11     // Catch: java.lang.Throwable -> L1b
                r11.m2425(r5)     // Catch: java.lang.Throwable -> L1b
                androidx.compose.foundation.text.input.internal.飘花落叶言子楪哲苏兰世 r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
                boolean r11 = r11.f2459     // Catch: java.lang.Throwable -> L1b
                if (r11 != 0) goto L5e
                r10.label = r8     // Catch: java.lang.Throwable -> L1b
                kotlin.coroutines.intrinsics.CoroutineSingletons r11 = kotlinx.coroutines.AbstractC5398.m10500(r10)     // Catch: java.lang.Throwable -> L1b
                if (r11 != r0) goto L58
                goto L78
            L58:
                kotlin.KotlinNothingValueException r11 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L1b
                r11.<init>()     // Catch: java.lang.Throwable -> L1b
                throw r11     // Catch: java.lang.Throwable -> L1b
            L5e:
                r10.label = r7     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r11 = kotlinx.coroutines.AbstractC5398.m10495(r3, r10)     // Catch: java.lang.Throwable -> L1b
                if (r11 != r0) goto L67
                goto L78
            L67:
                androidx.compose.foundation.text.input.internal.飘花落叶言子楪哲苏兰世 r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
                androidx.compose.runtime.飘花落叶言子苏楪哲世兰 r11 = r11.f2457     // Catch: java.lang.Throwable -> L1b
                androidx.compose.runtime.飘花落叶言子哲苏楪世兰 r11 = (androidx.compose.runtime.AbstractC1349) r11     // Catch: java.lang.Throwable -> L1b
                r11.m2425(r2)     // Catch: java.lang.Throwable -> L1b
                r10.label = r6     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r11 = kotlinx.coroutines.AbstractC5398.m10495(r3, r10)     // Catch: java.lang.Throwable -> L1b
                if (r11 != r0) goto L79
            L78:
                return r0
            L79:
                androidx.compose.foundation.text.input.internal.飘花落叶言子楪哲苏兰世 r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
                androidx.compose.runtime.飘花落叶言子苏楪哲世兰 r11 = r11.f2457     // Catch: java.lang.Throwable -> L1b
                androidx.compose.runtime.飘花落叶言子哲苏楪世兰 r11 = (androidx.compose.runtime.AbstractC1349) r11     // Catch: java.lang.Throwable -> L1b
                r11.m2425(r5)     // Catch: java.lang.Throwable -> L1b
                goto L5e
            L83:
                androidx.compose.foundation.text.input.internal.飘花落叶言子楪哲苏兰世 r10 = r10.this$0
                androidx.compose.runtime.飘花落叶言子苏楪哲世兰 r10 = r10.f2457
                androidx.compose.runtime.飘花落叶言子哲苏楪世兰 r10 = (androidx.compose.runtime.AbstractC1349) r10
                r10.m2425(r2)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CursorAnimationState$snapToVisibleAndAnimate$2(C0874 c0874, InterfaceC4356<? super CursorAnimationState$snapToVisibleAndAnimate$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c0874;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        CursorAnimationState$snapToVisibleAndAnimate$2 cursorAnimationState$snapToVisibleAndAnimate$2 = new CursorAnimationState$snapToVisibleAndAnimate$2(this.this$0, interfaceC4356);
        cursorAnimationState$snapToVisibleAndAnimate$2.L$0 = obj;
        return cursorAnimationState$snapToVisibleAndAnimate$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super Boolean> interfaceC4356) {
        return ((CursorAnimationState$snapToVisibleAndAnimate$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        InterfaceC5400 interfaceC5400 = (InterfaceC5400) this.L$0;
        InterfaceC5451 interfaceC5451 = (InterfaceC5451) this.this$0.f2458.getAndSet(null);
        C0874 c0874 = this.this$0;
        AtomicReference atomicReference = c0874.f2458;
        C5416 c5416M10473 = AbstractC5398.m10473(interfaceC5400, null, null, new AnonymousClass1(interfaceC5451, c0874, null), 3);
        while (true) {
            if (atomicReference.compareAndSet(null, c5416M10473)) {
                z = true;
                break;
            }
            if (atomicReference.get() != null) {
                z = false;
                break;
            }
        }
        return Boolean.valueOf(z);
    }
}
