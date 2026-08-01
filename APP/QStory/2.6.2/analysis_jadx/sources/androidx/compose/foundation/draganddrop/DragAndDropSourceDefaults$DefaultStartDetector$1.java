package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.gestures.AbstractC0521;
import androidx.compose.foundation.gestures.C0553;
import androidx.compose.foundation.gestures.InterfaceC0552;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.InterfaceC1633;
import com.alibaba.fastjson2.C2941;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p112.C7328;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1", f = "AndroidDragAndDropSource.android.kt", l = {45}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/draganddrop/飘花落叶言子楪苏世哲兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/draganddrop/飘花落叶言子楪苏世哲兰;)V"}, k = 3, mv = {2, 1, 0})
final class DragAndDropSourceDefaults$DefaultStartDetector$1 extends SuspendLambda implements InterfaceC6553 {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6861(c = "androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1", f = "AndroidDragAndDropSource.android.kt", l = {46}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ C0553 $pressScope;
        final /* synthetic */ InterfaceC0457 $this;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
        @InterfaceC6861(c = "androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1", f = "AndroidDragAndDropSource.android.kt", l = {48, 50, 62}, m = "invokeSuspend", v = 1)
        public static final class C04491 extends RestrictedSuspendLambda implements InterfaceC6553 {
            final /* synthetic */ InterfaceC5400 $$this$coroutineScope;
            final /* synthetic */ C0553 $pressScope;
            final /* synthetic */ InterfaceC0457 $this;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$7, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
            @InterfaceC6861(c = "androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$7", f = "AndroidDragAndDropSource.android.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class AnonymousClass7 extends SuspendLambda implements InterfaceC6550 {
                int label;

                public AnonymousClass7(InterfaceC4356<? super AnonymousClass7> interfaceC4356) {
                    super(3, interfaceC4356);
                }

                @Override // p052.InterfaceC6550
                public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return m1138invoked4ec7I((InterfaceC0552) obj, ((C7328) obj2).f19546, (InterfaceC4356) obj3);
                }

                /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
                public final Object m1138invoked4ec7I(InterfaceC0552 interfaceC0552, long j, InterfaceC4356<? super C5175> interfaceC4356) {
                    return new AnonymousClass7(interfaceC4356).invokeSuspend(C5175.f14739);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label == 0) {
                        AbstractC5184.m10206(obj);
                        return C5175.f14739;
                    }
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04491(InterfaceC5400 interfaceC5400, C0553 c0553, InterfaceC0457 interfaceC0457, InterfaceC4356<? super C04491> interfaceC4356) {
                super(2, interfaceC4356);
                this.$$this$coroutineScope = interfaceC5400;
                this.$pressScope = c0553;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$0() {
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C5175 invokeSuspend$lambda$1(InterfaceC0457 interfaceC0457, C1643 c1643, C1643 c16432, C7328 c7328) {
                long j = c1643.f4806;
                interfaceC0457.m1172();
                return C5175.f14739;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C5175 invokeSuspend$lambda$2(C1643 c1643, C7328 c7328) {
                return C5175.f14739;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C5175 invokeSuspend$lambda$4(C1643 c1643) {
                return C5175.f14739;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C5175 invokeSuspend$lambda$5(InterfaceC0457 interfaceC0457, C7328 c7328) {
                long j = c7328.f19546;
                interfaceC0457.m1172();
                return C5175.f14739;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
                C04491 c04491 = new C04491(this.$$this$coroutineScope, this.$pressScope, null, interfaceC4356);
                c04491.L$0 = obj;
                return c04491;
            }

            @Override // p052.InterfaceC6553
            public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4356<? super C5175> interfaceC4356) {
                return ((C04491) create(interfaceC1633, interfaceC4356)).invokeSuspend(C5175.f14739);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
            
                if (androidx.compose.foundation.gestures.AbstractC0468.m1235(r0, r6, r2, null, r8, r10, r6, r3, r12) == r9) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
            
                if (androidx.compose.foundation.gestures.AbstractC0503.m1270(r0, r1, r5, null, r6, r5, null, r12) == r9) goto L22;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r0 = r12.label
                    r1 = 0
                    r2 = 3
                    r3 = 1
                    r4 = 0
                    r5 = 2
                    if (r0 == 0) goto L26
                    if (r0 == r3) goto L1d
                    if (r0 == r5) goto L18
                    if (r0 != r2) goto L12
                    goto L18
                L12:
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    top.suzhelan.qstory.hook.item.C5919.m11250(r0)
                    return r4
                L18:
                    kotlin.AbstractC5184.m10206(r13)
                    goto L8a
                L1d:
                    java.lang.Object r0 = r12.L$0
                    androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r0 = (androidx.compose.ui.input.pointer.InterfaceC1633) r0
                    kotlin.AbstractC5184.m10206(r13)
                    r6 = r13
                    goto L3a
                L26:
                    kotlin.AbstractC5184.m10206(r13)
                    java.lang.Object r0 = r12.L$0
                    androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r0 = (androidx.compose.ui.input.pointer.InterfaceC1633) r0
                    androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                    r12.L$0 = r0
                    r12.label = r3
                    java.lang.Object r6 = androidx.compose.foundation.gestures.AbstractC0503.m1266(r0, r1, r6, r12)
                    if (r6 != r9) goto L3a
                    goto L89
                L3a:
                    androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r6 = (androidx.compose.ui.input.pointer.C1643) r6
                    int r8 = r6.f4818
                    if (r8 != r5) goto L6b
                    androidx.compose.foundation.draganddrop.飘花落叶言子楪世苏兰哲 r2 = new androidx.compose.foundation.draganddrop.飘花落叶言子楪世苏兰哲
                    r2.<init>()
                    androidx.compose.foundation.draganddrop.飘花落叶言子楪世哲苏兰 r8 = new androidx.compose.foundation.draganddrop.飘花落叶言子楪世哲苏兰
                    r8.<init>()
                    androidx.compose.foundation.draganddrop.飘花落叶言子楪世哲兰苏 r10 = new androidx.compose.foundation.draganddrop.飘花落叶言子楪世哲兰苏
                    r10.<init>()
                    r11 = r6
                    androidx.compose.foundation.draganddrop.飘花落叶言子楪世苏兰哲 r6 = new androidx.compose.foundation.draganddrop.飘花落叶言子楪世苏兰哲
                    r6.<init>()
                    androidx.compose.foundation.draganddrop.飘花落叶言子楪世兰苏哲 r3 = new androidx.compose.foundation.draganddrop.飘花落叶言子楪世兰苏哲
                    r3.<init>()
                    r12.L$0 = r4
                    r12.label = r5
                    r7 = r3
                    r3 = 0
                    r4 = r8
                    r5 = r10
                    r1 = r11
                    r8 = r12
                    java.lang.Object r0 = androidx.compose.foundation.gestures.AbstractC0468.m1235(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                    if (r0 != r9) goto L8a
                    goto L89
                L6b:
                    kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r1 = r12.$$this$coroutineScope
                    androidx.compose.foundation.gestures.飘花落叶言子苏兰楪哲世 r5 = r12.$pressScope
                    androidx.compose.foundation.draganddrop.飘花落叶言子楪世兰苏哲 r6 = new androidx.compose.foundation.draganddrop.飘花落叶言子楪世兰苏哲
                    r6.<init>()
                    r3 = r5
                    androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$7 r5 = new androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$7
                    r5.<init>(r4)
                    r12.L$0 = r4
                    r12.label = r2
                    r2 = r3
                    r3 = 0
                    r4 = r6
                    r6 = 0
                    r7 = r12
                    java.lang.Object r0 = androidx.compose.foundation.gestures.AbstractC0503.m1270(r0, r1, r2, r3, r4, r5, r6, r7)
                    if (r0 != r9) goto L8a
                L89:
                    return r9
                L8a:
                    kotlin.飘花落叶言子楪兰苏哲世 r0 = kotlin.C5175.f14739
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1.AnonymousClass1.C04491.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC0457 interfaceC0457, C0553 c0553, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$pressScope = c0553;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.$pressScope, interfaceC4356);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5184.m10206(obj);
                C04491 c04491 = new C04491((InterfaceC5400) this.L$0, this.$pressScope, null, null);
                this.label = 1;
                if (AbstractC0521.m1301(null, c04491, this) == coroutineSingletons) {
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

    public DragAndDropSourceDefaults$DefaultStartDetector$1(InterfaceC4356<? super DragAndDropSourceDefaults$DefaultStartDetector$1> interfaceC4356) {
        super(2, interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        DragAndDropSourceDefaults$DefaultStartDetector$1 dragAndDropSourceDefaults$DefaultStartDetector$1 = new DragAndDropSourceDefaults$DefaultStartDetector$1(interfaceC4356);
        dragAndDropSourceDefaults$DefaultStartDetector$1.L$0 = obj;
        return dragAndDropSourceDefaults$DefaultStartDetector$1;
    }

    @Override // p052.InterfaceC6553
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (obj == null) {
            return invoke((InterfaceC0457) null, (InterfaceC4356<? super C5175>) obj2);
        }
        C2941.m6336();
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            if (this.L$0 != null) {
                C2941.m6336();
                return null;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, new C0553(null), null);
            this.label = 1;
            if (AbstractC5398.m10503(anonymousClass1, this) == coroutineSingletons) {
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

    public final Object invoke(InterfaceC0457 interfaceC0457, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((DragAndDropSourceDefaults$DefaultStartDetector$1) create(interfaceC0457, interfaceC4356)).invokeSuspend(C5175.f14739);
    }
}
