package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1;
import androidx.compose.foundation.gestures.AbstractC1344;
import androidx.compose.foundation.gestures.AbstractC1362;
import androidx.compose.foundation.gestures.C1394;
import androidx.compose.foundation.gestures.InterfaceC1393;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import com.alibaba.fastjson2.C3775;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1", m556f = "AndroidDragAndDropSource.android.kt", m557l = {45}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/foundation/draganddrop/飘花落叶言子楪苏世哲兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/draganddrop/飘花落叶言子楪苏世哲兰;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class DragAndDropSourceDefaults$DefaultStartDetector$1 extends SuspendLambda implements InterfaceC7383 {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1", m556f = "AndroidDragAndDropSource.android.kt", m557l = {46}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00301 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ C1394 $pressScope;
        final /* synthetic */ InterfaceC1300 $this;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
        @InterfaceC7691(m555c = "androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1", m556f = "AndroidDragAndDropSource.android.kt", m557l = {48, 50, 62}, m558m = "invokeSuspend", m559v = 1)
        public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC7383 {
            final /* synthetic */ InterfaceC6233 $$this$coroutineScope;
            final /* synthetic */ C1394 $pressScope;
            final /* synthetic */ InterfaceC1300 $this;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$7, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            @Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
            @InterfaceC7691(m555c = "androidx.compose.foundation.draganddrop.DragAndDropSourceDefaults$DefaultStartDetector$1$1$1$7", m556f = "AndroidDragAndDropSource.android.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
            public static final class AnonymousClass7 extends SuspendLambda implements InterfaceC7380 {
                int label;

                public AnonymousClass7(InterfaceC5189<? super AnonymousClass7> interfaceC5189) {
                    super(3, interfaceC5189);
                }

                @Override // p068.InterfaceC7380
                public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return m1699invoked4ec7I((InterfaceC1393) obj, ((C8158) obj2).f19886, (InterfaceC5189) obj3);
                }

                /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
                public final Object m1699invoked4ec7I(InterfaceC1393 interfaceC1393, long j, InterfaceC5189<? super C6008> interfaceC5189) {
                    return new AnonymousClass7(interfaceC5189).invokeSuspend(C6008.f15084);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label == 0) {
                        AbstractC6017.m10769(obj);
                        return C6008.f15084;
                    }
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC6233 interfaceC6233, C1394 c1394, InterfaceC1300 interfaceC1300, InterfaceC5189<? super AnonymousClass1> interfaceC5189) {
                super(2, interfaceC5189);
                this.$$this$coroutineScope = interfaceC6233;
                this.$pressScope = c1394;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invokeSuspend$lambda$0() {
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C6008 invokeSuspend$lambda$1(InterfaceC1300 interfaceC1300, C2478 c2478, C2478 c24782, C8158 c8158) {
                long j = c2478.f5152;
                interfaceC1300.m1742();
                return C6008.f15084;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C6008 invokeSuspend$lambda$2(C2478 c2478, C8158 c8158) {
                return C6008.f15084;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C6008 invokeSuspend$lambda$4(C2478 c2478) {
                return C6008.f15084;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C6008 invokeSuspend$lambda$5(InterfaceC1300 interfaceC1300, C8158 c8158) {
                long j = c8158.f19886;
                interfaceC1300.m1742();
                return C6008.f15084;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$pressScope, null, interfaceC5189);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // p068.InterfaceC7383
            public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
                return ((AnonymousClass1) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
            }

            /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
            
                if (androidx.compose.foundation.gestures.AbstractC1309.m1805(r0, r6, r2, null, r8, r10, r6, r3, r12) == r9) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
            
                if (androidx.compose.foundation.gestures.AbstractC1344.m1840(r0, r1, r5, null, r6, r5, null, r12) == r9) goto L22;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                InterfaceC2468 interfaceC2468;
                Object objM1836;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                final int i2 = 0;
                final int i3 = 1;
                if (i == 0) {
                    AbstractC6017.m10769(obj);
                    interfaceC2468 = (InterfaceC2468) this.L$0;
                    PointerEventPass pointerEventPass = PointerEventPass.Initial;
                    this.L$0 = interfaceC2468;
                    this.label = 1;
                    objM1836 = AbstractC1344.m1836(interfaceC2468, false, pointerEventPass, this);
                    if (objM1836 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        AbstractC6017.m10769(obj);
                        return C6008.f15084;
                    }
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC2468 = (InterfaceC2468) this.L$0;
                AbstractC6017.m10769(obj);
                objM1836 = obj;
                C2478 c2478 = (C2478) objM1836;
                if (c2478.f5164 == 2) {
                    InterfaceC7372 interfaceC7372 = new InterfaceC7372() { // from class: androidx.compose.foundation.draganddrop.飘花落叶言子楪世苏兰哲
                        @Override // p068.InterfaceC7372
                        public final Object invoke() {
                            switch (i2) {
                                case 0:
                                    return Boolean.valueOf(DragAndDropSourceDefaults$DefaultStartDetector$1.C00301.AnonymousClass1.invokeSuspend$lambda$0());
                                default:
                                    return C6008.f15084;
                            }
                        }
                    };
                    C1296 c1296 = new C1296();
                    C1295 c1295 = new C1295();
                    InterfaceC7372 interfaceC73722 = new InterfaceC7372() { // from class: androidx.compose.foundation.draganddrop.飘花落叶言子楪世苏兰哲
                        @Override // p068.InterfaceC7372
                        public final Object invoke() {
                            switch (i3) {
                                case 0:
                                    return Boolean.valueOf(DragAndDropSourceDefaults$DefaultStartDetector$1.C00301.AnonymousClass1.invokeSuspend$lambda$0());
                                default:
                                    return C6008.f15084;
                            }
                        }
                    };
                    InterfaceC7387 interfaceC7387 = new InterfaceC7387() { // from class: androidx.compose.foundation.draganddrop.飘花落叶言子楪世兰苏哲
                        @Override // p068.InterfaceC7387
                        public final Object invoke(Object obj2) {
                            switch (i2) {
                                case 0:
                                    return DragAndDropSourceDefaults$DefaultStartDetector$1.C00301.AnonymousClass1.invokeSuspend$lambda$4((C2478) obj2);
                                default:
                                    return DragAndDropSourceDefaults$DefaultStartDetector$1.C00301.AnonymousClass1.invokeSuspend$lambda$5(null, (C8158) obj2);
                            }
                        }
                    };
                    this.L$0 = null;
                    this.label = 2;
                } else {
                    InterfaceC6233 interfaceC6233 = this.$$this$coroutineScope;
                    C1394 c1394 = this.$pressScope;
                    InterfaceC7387 interfaceC73872 = new InterfaceC7387() { // from class: androidx.compose.foundation.draganddrop.飘花落叶言子楪世兰苏哲
                        @Override // p068.InterfaceC7387
                        public final Object invoke(Object obj2) {
                            switch (i3) {
                                case 0:
                                    return DragAndDropSourceDefaults$DefaultStartDetector$1.C00301.AnonymousClass1.invokeSuspend$lambda$4((C2478) obj2);
                                default:
                                    return DragAndDropSourceDefaults$DefaultStartDetector$1.C00301.AnonymousClass1.invokeSuspend$lambda$5(null, (C8158) obj2);
                            }
                        }
                    };
                    AnonymousClass7 anonymousClass7 = new AnonymousClass7(null);
                    this.L$0 = null;
                    this.label = 3;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00301(InterfaceC1300 interfaceC1300, C1394 c1394, InterfaceC5189<? super C00301> interfaceC5189) {
            super(2, interfaceC5189);
            this.$pressScope = c1394;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C00301 c00301 = new C00301(null, this.$pressScope, interfaceC5189);
            c00301.L$0 = obj;
            return c00301;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00301) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1((InterfaceC6233) this.L$0, this.$pressScope, null, null);
                this.label = 1;
                if (AbstractC1362.m1871(null, anonymousClass1, this) == coroutineSingletons) {
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

    public DragAndDropSourceDefaults$DefaultStartDetector$1(InterfaceC5189<? super DragAndDropSourceDefaults$DefaultStartDetector$1> interfaceC5189) {
        super(2, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        DragAndDropSourceDefaults$DefaultStartDetector$1 dragAndDropSourceDefaults$DefaultStartDetector$1 = new DragAndDropSourceDefaults$DefaultStartDetector$1(interfaceC5189);
        dragAndDropSourceDefaults$DefaultStartDetector$1.L$0 = obj;
        return dragAndDropSourceDefaults$DefaultStartDetector$1;
    }

    @Override // p068.InterfaceC7383
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (obj == null) {
            return invoke((InterfaceC1300) null, (InterfaceC5189<? super C6008>) obj2);
        }
        C3775.m6954();
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            if (this.L$0 != null) {
                C3775.m6954();
                return null;
            }
            C00301 c00301 = new C00301(null, new C1394(null), null);
            this.label = 1;
            if (AbstractC6231.m11066(c00301, this) == coroutineSingletons) {
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

    public final Object invoke(InterfaceC1300 interfaceC1300, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DragAndDropSourceDefaults$DefaultStartDetector$1) create(interfaceC1300, interfaceC5189)).invokeSuspend(C6008.f15084);
    }
}
