package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.InterfaceC1633;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import p112.C7329;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {274}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class TapGestureDetectorKt$detectTapAndPress$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6551 $onPress;
    final /* synthetic */ InterfaceC6558 $onTap;
    final /* synthetic */ C0553 $pressScope;
    final /* synthetic */ InterfaceC1635 $this_detectTapAndPress;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6862(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {277, 283}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC5401 $$this$coroutineScope;
        final /* synthetic */ InterfaceC6551 $onPress;
        final /* synthetic */ InterfaceC6558 $onTap;
        final /* synthetic */ C0553 $pressScope;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
        @InterfaceC6862(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {280}, m = "invokeSuspend", v = 1)
        public static final class C04581 extends SuspendLambda implements InterfaceC6554 {
            final /* synthetic */ C1643 $down;
            final /* synthetic */ InterfaceC6551 $onPress;
            final /* synthetic */ C0553 $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04581(InterfaceC6551 interfaceC6551, C0553 c0553, C1643 c1643, InterfaceC4357<? super C04581> interfaceC4357) {
                super(2, interfaceC4357);
                this.$onPress = interfaceC6551;
                this.$pressScope = c0553;
                this.$down = c1643;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
                return new C04581(this.$onPress, this.$pressScope, this.$down, interfaceC4357);
            }

            @Override // p052.InterfaceC6554
            public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
                return ((C04581) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5185.m10210(obj);
                    InterfaceC6551 interfaceC6551 = this.$onPress;
                    C0553 c0553 = this.$pressScope;
                    C7329 c7329 = new C7329(this.$down.f4807);
                    this.label = 1;
                    if (interfaceC6551.invoke(c0553, c7329, this) == coroutineSingletons) {
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

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
        @InterfaceC6862(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6554 {
            final /* synthetic */ C0553 $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C0553 c0553, InterfaceC4357<? super AnonymousClass2> interfaceC4357) {
                super(2, interfaceC4357);
                this.$pressScope = c0553;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
                return new AnonymousClass2(this.$pressScope, interfaceC4357);
            }

            @Override // p052.InterfaceC6554
            public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
                return ((AnonymousClass2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5185.m10210(obj);
                this.$pressScope.m1338();
                return C5176.f14739;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
        @InterfaceC6862(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC6554 {
            final /* synthetic */ C0553 $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(C0553 c0553, InterfaceC4357<? super AnonymousClass3> interfaceC4357) {
                super(2, interfaceC4357);
                this.$pressScope = c0553;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
                return new AnonymousClass3(this.$pressScope, interfaceC4357);
            }

            @Override // p052.InterfaceC6554
            public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
                return ((AnonymousClass3) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5185.m10210(obj);
                this.$pressScope.m1337();
                return C5176.f14739;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC5401 interfaceC5401, InterfaceC6551 interfaceC6551, InterfaceC6558 interfaceC6558, C0553 c0553, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$$this$coroutineScope = interfaceC5401;
            this.$onPress = interfaceC6551;
            this.$onTap = interfaceC6558;
            this.$pressScope = c0553;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onTap, this.$pressScope, interfaceC4357);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC1633, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
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
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L15
                java.lang.Object r0 = r10.L$0
                kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r0 = (kotlinx.coroutines.InterfaceC5452) r0
                kotlin.AbstractC5185.m10210(r11)
                goto L75
            L15:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                top.suzhelan.qstory.hook.item.C5925.m11311(r10)
                return r4
            L1b:
                java.lang.Object r1 = r10.L$1
                kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r1 = (kotlinx.coroutines.InterfaceC5452) r1
                java.lang.Object r3 = r10.L$0
                androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r3 = (androidx.compose.ui.input.pointer.InterfaceC1633) r3
                kotlin.AbstractC5185.m10210(r11)
                goto L4e
            L27:
                kotlin.AbstractC5185.m10210(r11)
                java.lang.Object r11 = r10.L$0
                androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r11 = (androidx.compose.ui.input.pointer.InterfaceC1633) r11
                kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r1 = r10.$$this$coroutineScope
                kotlinx.coroutines.CoroutineStart r5 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1 r6 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1
                androidx.compose.foundation.gestures.飘花落叶言子苏兰楪哲世 r7 = r10.$pressScope
                r6.<init>(r7, r4)
                kotlinx.coroutines.飘花落叶言子哲楪世兰苏 r1 = kotlinx.coroutines.AbstractC5399.m10477(r1, r4, r5, r6, r3)
                r10.L$0 = r11
                r10.L$1 = r1
                r10.label = r3
                r3 = 3
                java.lang.Object r3 = androidx.compose.foundation.gestures.AbstractC0503.m1275(r11, r4, r10, r3)
                if (r3 != r0) goto L4b
                goto L73
            L4b:
                r9 = r3
                r3 = r11
                r11 = r9
            L4e:
                androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r11 = (androidx.compose.ui.input.pointer.C1643) r11
                r11.m3024()
                飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏 r5 = r10.$onPress
                飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏 r6 = androidx.compose.foundation.gestures.AbstractC0503.f1500
                if (r5 == r6) goto L65
                kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r6 = r10.$$this$coroutineScope
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1 r7 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1
                androidx.compose.foundation.gestures.飘花落叶言子苏兰楪哲世 r8 = r10.$pressScope
                r7.<init>(r5, r8, r11, r4)
                androidx.compose.foundation.gestures.AbstractC0503.m1277(r6, r1, r7)
            L65:
                r10.L$0 = r1
                r10.L$1 = r4
                r10.label = r2
                androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.ui.input.pointer.PointerEventPass.Main
                java.lang.Object r11 = androidx.compose.foundation.gestures.AbstractC0503.m1279(r3, r11, r10)
                if (r11 != r0) goto L74
            L73:
                return r0
            L74:
                r0 = r1
            L75:
                androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r11 = (androidx.compose.ui.input.pointer.C1643) r11
                if (r11 != 0) goto L86
                kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r11 = r10.$$this$coroutineScope
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2 r1 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2
                androidx.compose.foundation.gestures.飘花落叶言子苏兰楪哲世 r10 = r10.$pressScope
                r1.<init>(r10, r4)
                androidx.compose.foundation.gestures.AbstractC0503.m1277(r11, r0, r1)
                goto La3
            L86:
                r11.m3024()
                kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r1 = r10.$$this$coroutineScope
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3 r2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3
                androidx.compose.foundation.gestures.飘花落叶言子苏兰楪哲世 r3 = r10.$pressScope
                r2.<init>(r3, r4)
                androidx.compose.foundation.gestures.AbstractC0503.m1277(r1, r0, r2)
                飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r10 = r10.$onTap
                if (r10 == 0) goto La3
                long r0 = r11.f4807
                飘花落叶言子世哲兰楪苏.飘花落叶言子楪世苏兰哲 r11 = new 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世苏兰哲
                r11.<init>(r0)
                r10.invoke(r11)
            La3:
                kotlin.飘花落叶言子楪兰苏哲世 r10 = kotlin.C5176.f14739
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapAndPress$2(InterfaceC1635 interfaceC1635, InterfaceC6551 interfaceC6551, InterfaceC6558 interfaceC6558, C0553 c0553, InterfaceC4357<? super TapGestureDetectorKt$detectTapAndPress$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_detectTapAndPress = interfaceC1635;
        this.$onPress = interfaceC6551;
        this.$onTap = interfaceC6558;
        this.$pressScope = c0553;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.$this_detectTapAndPress, this.$onPress, this.$onTap, this.$pressScope, interfaceC4357);
        tapGestureDetectorKt$detectTapAndPress$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapAndPress$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TapGestureDetectorKt$detectTapAndPress$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC5401 interfaceC5401 = (InterfaceC5401) this.L$0;
            InterfaceC1635 interfaceC1635 = this.$this_detectTapAndPress;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC5401, this.$onPress, this.$onTap, this.$pressScope, null);
            this.label = 1;
            if (AbstractC0521.m1311(interfaceC1635, anonymousClass1, this) == coroutineSingletons) {
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
