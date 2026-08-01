package top.yukonga.miuix.kmp.utils;

import androidx.compose.foundation.gestures.AbstractC0521;
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
import kotlinx.coroutines.sync.C5380;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p112.C7329;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2", f = "Pressable.kt", l = {370}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class AbstractPressableNode$clickPointerInput$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6551 $onPress;
    final /* synthetic */ InterfaceC1635 $this_clickPointerInput;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AbstractC6063 this$0;

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6862(c = "top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2$1", f = "Pressable.kt", l = {371, 374}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC5401 $$this$coroutineScope;
        final /* synthetic */ InterfaceC6551 $onPress;
        final /* synthetic */ C6067 $pressScope;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ AbstractC6063 this$0;

        /* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
        @InterfaceC6862(c = "top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2$1$1", f = "Pressable.kt", l = {373}, m = "invokeSuspend", v = 2)
        public static final class C60481 extends SuspendLambda implements InterfaceC6554 {
            final /* synthetic */ C1643 $down;
            final /* synthetic */ InterfaceC6551 $onPress;
            final /* synthetic */ C6067 $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C60481(InterfaceC6551 interfaceC6551, C6067 c6067, C1643 c1643, InterfaceC4357<? super C60481> interfaceC4357) {
                super(2, interfaceC4357);
                this.$onPress = interfaceC6551;
                this.$pressScope = c6067;
                this.$down = c1643;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
                return new C60481(this.$onPress, this.$pressScope, this.$down, interfaceC4357);
            }

            @Override // p052.InterfaceC6554
            public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
                return ((C60481) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC5185.m10210(obj);
                    InterfaceC6551 interfaceC6551 = this.$onPress;
                    C6067 c6067 = this.$pressScope;
                    C7329 c7329 = new C7329(this.$down.f4807);
                    this.label = 1;
                    if (interfaceC6551.invoke(c6067, c7329, this) == coroutineSingletons) {
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

        /* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
        @InterfaceC6862(c = "top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2$1$2", f = "Pressable.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6554 {
            final /* synthetic */ C6067 $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C6067 c6067, InterfaceC4357<? super AnonymousClass2> interfaceC4357) {
                super(2, interfaceC4357);
                this.$pressScope = c6067;
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
                C6067 c6067 = this.$pressScope;
                c6067.f16586 = true;
                C5380 c5380 = c6067.f16584;
                if (c5380.m10428()) {
                    c5380.m10432(null);
                }
                return C5176.f14739;
            }
        }

        /* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
        @InterfaceC6862(c = "top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2$1$3", f = "Pressable.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC6554 {
            final /* synthetic */ C6067 $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(C6067 c6067, InterfaceC4357<? super AnonymousClass3> interfaceC4357) {
                super(2, interfaceC4357);
                this.$pressScope = c6067;
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
                C6067 c6067 = this.$pressScope;
                c6067.f16585 = true;
                C5380 c5380 = c6067.f16584;
                if (c5380.m10428()) {
                    c5380.m10432(null);
                }
                return C5176.f14739;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC5401 interfaceC5401, AbstractC6063 abstractC6063, C6067 c6067, InterfaceC6551 interfaceC6551, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$$this$coroutineScope = interfaceC5401;
            this.this$0 = abstractC6063;
            this.$pressScope = c6067;
            this.$onPress = interfaceC6551;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.this$0, this.$pressScope, this.$onPress, interfaceC4357);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC1633, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = r10.L$0
                androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r0 = (androidx.compose.ui.input.pointer.InterfaceC1633) r0
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r10.label
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L27
                if (r2 == r4) goto L23
                if (r2 != r3) goto L1d
                java.lang.Object r0 = r10.L$2
                kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r0 = (kotlinx.coroutines.InterfaceC5452) r0
                java.lang.Object r1 = r10.L$1
                androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r1 = (androidx.compose.ui.input.pointer.C1643) r1
                kotlin.AbstractC5185.m10210(r11)
                goto L69
            L1d:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                top.suzhelan.qstory.hook.item.C5925.m11311(r10)
                return r5
            L23:
                kotlin.AbstractC5185.m10210(r11)
                goto L35
            L27:
                kotlin.AbstractC5185.m10210(r11)
                r10.L$0 = r0
                r10.label = r4
                java.lang.Object r11 = androidx.compose.foundation.gestures.AbstractC0503.m1275(r0, r5, r10, r3)
                if (r11 != r1) goto L35
                goto L67
            L35:
                androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r11 = (androidx.compose.ui.input.pointer.C1643) r11
                kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r2 = r10.$$this$coroutineScope
                top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2$1$resetJob$1 r4 = new top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2$1$resetJob$1
                top.yukonga.miuix.kmp.utils.飘花落叶言子楪兰哲世苏 r6 = r10.$pressScope
                r4.<init>(r6, r5)
                r6 = 3
                kotlinx.coroutines.飘花落叶言子哲楪世兰苏 r2 = kotlinx.coroutines.AbstractC5399.m10477(r2, r5, r5, r4, r6)
                top.yukonga.miuix.kmp.utils.飘花落叶言子楪世苏兰哲 r4 = r10.this$0
                kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r6 = r10.$$this$coroutineScope
                top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2$1$1 r7 = new top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2$1$1
                飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏 r8 = r10.$onPress
                top.yukonga.miuix.kmp.utils.飘花落叶言子楪兰哲世苏 r9 = r10.$pressScope
                r7.<init>(r8, r9, r11, r5)
                top.yukonga.miuix.kmp.utils.AbstractC6063.m11416(r4, r6, r2, r7)
                r10.L$0 = r5
                r10.L$1 = r5
                r10.L$2 = r2
                r10.label = r3
                飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏 r11 = androidx.compose.foundation.gestures.AbstractC0503.f1500
                androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.ui.input.pointer.PointerEventPass.Main
                java.lang.Object r11 = androidx.compose.foundation.gestures.AbstractC0503.m1279(r0, r11, r10)
                if (r11 != r1) goto L68
            L67:
                return r1
            L68:
                r0 = r2
            L69:
                androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r11 = (androidx.compose.ui.input.pointer.C1643) r11
                top.yukonga.miuix.kmp.utils.飘花落叶言子楪世苏兰哲 r1 = r10.this$0
                kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r2 = r10.$$this$coroutineScope
                if (r11 != 0) goto L7c
                top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2$1$2 r11 = new top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2$1$2
                top.yukonga.miuix.kmp.utils.飘花落叶言子楪兰哲世苏 r10 = r10.$pressScope
                r11.<init>(r10, r5)
                top.yukonga.miuix.kmp.utils.AbstractC6063.m11416(r1, r2, r0, r11)
                goto L86
            L7c:
                top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2$1$3 r11 = new top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2$1$3
                top.yukonga.miuix.kmp.utils.飘花落叶言子楪兰哲世苏 r10 = r10.$pressScope
                r11.<init>(r10, r5)
                top.yukonga.miuix.kmp.utils.AbstractC6063.m11416(r1, r2, r0, r11)
            L86:
                kotlin.飘花落叶言子楪兰苏哲世 r10 = kotlin.C5176.f14739
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.utils.AbstractPressableNode$clickPointerInput$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractPressableNode$clickPointerInput$2(InterfaceC1635 interfaceC1635, AbstractC6063 abstractC6063, InterfaceC6551 interfaceC6551, InterfaceC4357<? super AbstractPressableNode$clickPointerInput$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_clickPointerInput = interfaceC1635;
        this.this$0 = abstractC6063;
        this.$onPress = interfaceC6551;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        AbstractPressableNode$clickPointerInput$2 abstractPressableNode$clickPointerInput$2 = new AbstractPressableNode$clickPointerInput$2(this.$this_clickPointerInput, this.this$0, this.$onPress, interfaceC4357);
        abstractPressableNode$clickPointerInput$2.L$0 = obj;
        return abstractPressableNode$clickPointerInput$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((AbstractPressableNode$clickPointerInput$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5401 interfaceC5401 = (InterfaceC5401) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C6067 c6067 = new C6067(this.$this_clickPointerInput);
            InterfaceC1635 interfaceC1635 = this.$this_clickPointerInput;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC5401, this.this$0, c6067, this.$onPress, null);
            this.L$0 = null;
            this.L$1 = null;
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
