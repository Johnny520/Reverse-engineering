package androidx.compose.foundation.text.input.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5452;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Z"}, k = 3, mv = {2, 1, 0})
final class CursorAnimationState$snapToVisibleAndAnimate$2 extends SuspendLambda implements InterfaceC6554 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C0874 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6862(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", l = {72, 77, 79, 81}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC5452 $oldJob;
        int label;
        final /* synthetic */ C0874 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC5452 interfaceC5452, C0874 c0874, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$oldJob = interfaceC5452;
            this.this$0 = c0874;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass1(this.$oldJob, this.this$0, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
        
            if (kotlinx.coroutines.AbstractC5399.m10499(500, r10) != r0) goto L36;
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
                kotlin.AbstractC5185.m10210(r11)     // Catch: java.lang.Throwable -> L1b
                goto L79
            L1b:
                r11 = move-exception
                goto L83
            L1d:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                top.suzhelan.qstory.hook.item.C5925.m11311(r10)
                r10 = 0
                return r10
            L24:
                kotlin.AbstractC5185.m10210(r11)     // Catch: java.lang.Throwable -> L1b
                goto L67
            L28:
                kotlin.AbstractC5185.m10210(r11)     // Catch: java.lang.Throwable -> L1b
                goto L58
            L2c:
                kotlin.AbstractC5185.m10210(r11)
                goto L40
            L30:
                kotlin.AbstractC5185.m10210(r11)
                kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r11 = r10.$oldJob
                if (r11 == 0) goto L40
                r10.label = r9
                java.lang.Object r11 = kotlinx.coroutines.AbstractC5399.m10506(r11, r10)
                if (r11 != r0) goto L40
                goto L78
            L40:
                androidx.compose.foundation.text.input.internal.飘花落叶言子楪哲苏兰世 r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
                androidx.compose.runtime.飘花落叶言子苏楪哲世兰 r11 = r11.f2458     // Catch: java.lang.Throwable -> L1b
                androidx.compose.runtime.飘花落叶言子哲苏楪世兰 r11 = (androidx.compose.runtime.AbstractC1349) r11     // Catch: java.lang.Throwable -> L1b
                r11.m2435(r5)     // Catch: java.lang.Throwable -> L1b
                androidx.compose.foundation.text.input.internal.飘花落叶言子楪哲苏兰世 r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
                boolean r11 = r11.f2460     // Catch: java.lang.Throwable -> L1b
                if (r11 != 0) goto L5e
                r10.label = r8     // Catch: java.lang.Throwable -> L1b
                kotlin.coroutines.intrinsics.CoroutineSingletons r11 = kotlinx.coroutines.AbstractC5399.m10504(r10)     // Catch: java.lang.Throwable -> L1b
                if (r11 != r0) goto L58
                goto L78
            L58:
                kotlin.KotlinNothingValueException r11 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L1b
                r11.<init>()     // Catch: java.lang.Throwable -> L1b
                throw r11     // Catch: java.lang.Throwable -> L1b
            L5e:
                r10.label = r7     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r11 = kotlinx.coroutines.AbstractC5399.m10499(r3, r10)     // Catch: java.lang.Throwable -> L1b
                if (r11 != r0) goto L67
                goto L78
            L67:
                androidx.compose.foundation.text.input.internal.飘花落叶言子楪哲苏兰世 r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
                androidx.compose.runtime.飘花落叶言子苏楪哲世兰 r11 = r11.f2458     // Catch: java.lang.Throwable -> L1b
                androidx.compose.runtime.飘花落叶言子哲苏楪世兰 r11 = (androidx.compose.runtime.AbstractC1349) r11     // Catch: java.lang.Throwable -> L1b
                r11.m2435(r2)     // Catch: java.lang.Throwable -> L1b
                r10.label = r6     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r11 = kotlinx.coroutines.AbstractC5399.m10499(r3, r10)     // Catch: java.lang.Throwable -> L1b
                if (r11 != r0) goto L79
            L78:
                return r0
            L79:
                androidx.compose.foundation.text.input.internal.飘花落叶言子楪哲苏兰世 r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
                androidx.compose.runtime.飘花落叶言子苏楪哲世兰 r11 = r11.f2458     // Catch: java.lang.Throwable -> L1b
                androidx.compose.runtime.飘花落叶言子哲苏楪世兰 r11 = (androidx.compose.runtime.AbstractC1349) r11     // Catch: java.lang.Throwable -> L1b
                r11.m2435(r5)     // Catch: java.lang.Throwable -> L1b
                goto L5e
            L83:
                androidx.compose.foundation.text.input.internal.飘花落叶言子楪哲苏兰世 r10 = r10.this$0
                androidx.compose.runtime.飘花落叶言子苏楪哲世兰 r10 = r10.f2458
                androidx.compose.runtime.飘花落叶言子哲苏楪世兰 r10 = (androidx.compose.runtime.AbstractC1349) r10
                r10.m2435(r2)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CursorAnimationState$snapToVisibleAndAnimate$2(C0874 c0874, InterfaceC4357<? super CursorAnimationState$snapToVisibleAndAnimate$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c0874;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        CursorAnimationState$snapToVisibleAndAnimate$2 cursorAnimationState$snapToVisibleAndAnimate$2 = new CursorAnimationState$snapToVisibleAndAnimate$2(this.this$0, interfaceC4357);
        cursorAnimationState$snapToVisibleAndAnimate$2.L$0 = obj;
        return cursorAnimationState$snapToVisibleAndAnimate$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super Boolean> interfaceC4357) {
        return ((CursorAnimationState$snapToVisibleAndAnimate$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        InterfaceC5401 interfaceC5401 = (InterfaceC5401) this.L$0;
        InterfaceC5452 interfaceC5452 = (InterfaceC5452) this.this$0.f2459.getAndSet(null);
        C0874 c0874 = this.this$0;
        AtomicReference atomicReference = c0874.f2459;
        C5417 c5417M10477 = AbstractC5399.m10477(interfaceC5401, null, null, new AnonymousClass1(interfaceC5452, c0874, null), 3);
        while (true) {
            if (atomicReference.compareAndSet(null, c5417M10477)) {
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
