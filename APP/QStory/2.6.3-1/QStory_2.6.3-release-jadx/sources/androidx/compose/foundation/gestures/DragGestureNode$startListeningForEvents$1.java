package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.C6022;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", m556f = "Draggable.kt", m557l = {508, 510, 512, 519, 521, 524}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class DragGestureNode$startListeningForEvents$1 extends SuspendLambda implements InterfaceC7383 {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AbstractC1304 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/gestures/飘花落叶言子世苏兰楪哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "processDelta", "<anonymous>", "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", m556f = "Draggable.kt", m557l = {515}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00401 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ Ref$ObjectRef<AbstractC1310> $event;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AbstractC1304 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00401(Ref$ObjectRef<AbstractC1310> ref$ObjectRef, AbstractC1304 abstractC1304, InterfaceC5189<? super C00401> interfaceC5189) {
            super(2, interfaceC5189);
            this.$event = ref$ObjectRef;
            this.this$0 = abstractC1304;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C00401 c00401 = new C00401(this.$event, this.this$0, interfaceC5189);
            c00401.L$0 = obj;
            return c00401;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC7387 interfaceC7387, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00401) create(interfaceC7387, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004f -> B:24:0x0052). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0055 -> B:26:0x0056). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC7387 interfaceC7387;
            AbstractC1310 abstractC1310;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                interfaceC7387 = (InterfaceC7387) this.L$0;
                abstractC1310 = this.$event.element;
                if (abstractC1310 instanceof C1311) {
                }
                return C6008.f15084;
            }
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Ref$ObjectRef<AbstractC1310> ref$ObjectRef = (Ref$ObjectRef) this.L$1;
            interfaceC7387 = (InterfaceC7387) this.L$0;
            AbstractC6017.m10769(obj);
            T t = (AbstractC1310) obj;
            ref$ObjectRef.element = t;
            abstractC1310 = this.$event.element;
            if (!(abstractC1310 instanceof C1311) || (abstractC1310 instanceof C1322)) {
                return C6008.f15084;
            }
            C1321 c1321 = abstractC1310 instanceof C1321 ? (C1321) abstractC1310 : null;
            if (c1321 != null) {
                interfaceC7387.invoke(c1321);
            }
            ref$ObjectRef = this.$event;
            C6022 c6022 = this.this$0.f1762;
            if (c6022 == null) {
                t = 0;
                ref$ObjectRef.element = t;
                abstractC1310 = this.$event.element;
                if (abstractC1310 instanceof C1311) {
                }
                return C6008.f15084;
            }
            this.L$0 = interfaceC7387;
            this.L$1 = ref$ObjectRef;
            this.label = 1;
            obj = C6022.m10781(c6022, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            T t2 = (AbstractC1310) obj;
            ref$ObjectRef.element = t2;
            abstractC1310 = this.$event.element;
            if (abstractC1310 instanceof C1311) {
            }
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$startListeningForEvents$1(AbstractC1304 abstractC1304, InterfaceC5189<? super DragGestureNode$startListeningForEvents$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = abstractC1304;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1 = new DragGestureNode$startListeningForEvents$1(this.this$0, interfaceC5189);
        dragGestureNode$startListeningForEvents$1.L$0 = obj;
        return dragGestureNode$startListeningForEvents$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DragGestureNode$startListeningForEvents$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0104, code lost:
    
        if (androidx.compose.foundation.gestures.AbstractC1304.m1779(r9, r8) != r0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:47:0x00e3, B:43:0x00cf], limit reached: 57 */
    /* JADX WARN: Path cross not found for [B:49:0x00e7, B:19:0x005c], limit reached: 57 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[PHI: r1 r4
  0x0032: PHI (r1v14 kotlin.jvm.internal.Ref$ObjectRef) = (r1v6 kotlin.jvm.internal.Ref$ObjectRef), (r1v19 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:13:0x002f, B:39:0x00c6] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r4v8 kotlinx.coroutines.飘花落叶言子世楪哲兰苏) = (r4v5 kotlinx.coroutines.飘花落叶言子世楪哲兰苏), (r4v10 kotlinx.coroutines.飘花落叶言子世楪哲兰苏) binds: [B:13:0x002f, B:39:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[PHI: r5
  0x005c: PHI (r5v8 kotlinx.coroutines.飘花落叶言子世楪哲兰苏) = 
  (r5v0 kotlinx.coroutines.飘花落叶言子世楪哲兰苏)
  (r5v3 kotlinx.coroutines.飘花落叶言子世楪哲兰苏)
  (r5v3 kotlinx.coroutines.飘花落叶言子世楪哲兰苏)
  (r5v3 kotlinx.coroutines.飘花落叶言子世楪哲兰苏)
  (r5v6 kotlinx.coroutines.飘花落叶言子世楪哲兰苏)
  (r5v9 kotlinx.coroutines.飘花落叶言子世楪哲兰苏)
 binds: [B:18:0x0054, B:48:0x00e5, B:50:0x00f4, B:44:0x00de, B:30:0x008a, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf A[Catch: CancellationException -> 0x00e1, TryCatch #0 {CancellationException -> 0x00e1, blocks: (B:41:0x00c9, B:43:0x00cf, B:47:0x00e3, B:49:0x00e7), top: B:57:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3 A[Catch: CancellationException -> 0x00e1, TryCatch #0 {CancellationException -> 0x00e1, blocks: (B:41:0x00c9, B:43:0x00cf, B:47:0x00e3, B:49:0x00e7), top: B:57:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0107 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008a -> B:19:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00de -> B:19:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00e5 -> B:19:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00f4 -> B:19:0x005c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0104 -> B:11:0x0025). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC6233 interfaceC6233;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        InterfaceC6233 interfaceC62332;
        InterfaceC6233 interfaceC62333;
        T t;
        Object objM1822;
        T t2;
        T t3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        switch (i) {
            case 0:
                AbstractC6017.m10769(obj);
                interfaceC6233 = (InterfaceC6233) this.L$0;
                if (!AbstractC6231.m11054(interfaceC6233)) {
                    ref$ObjectRef = new Ref$ObjectRef();
                    C6022 c6022 = this.this$0.f1762;
                    if (c6022 == null) {
                        ref$ObjectRef2 = ref$ObjectRef;
                        t2 = 0;
                        ref$ObjectRef.element = t2;
                        t3 = ref$ObjectRef2.element;
                        if (t3 instanceof C1320) {
                        }
                        return coroutineSingletons;
                    }
                    this.L$0 = interfaceC6233;
                    this.L$1 = ref$ObjectRef;
                    this.L$2 = ref$ObjectRef;
                    this.label = 1;
                    obj = C6022.m10781(c6022, this);
                    if (obj != coroutineSingletons) {
                        ref$ObjectRef2 = ref$ObjectRef;
                        t2 = (AbstractC1310) obj;
                        ref$ObjectRef.element = t2;
                        t3 = ref$ObjectRef2.element;
                        if (t3 instanceof C1320) {
                            this.L$0 = interfaceC6233;
                            this.L$1 = ref$ObjectRef2;
                            this.L$2 = null;
                            this.label = 2;
                            if (AbstractC1304.m1778(this.this$0, (C1320) t3, this) != coroutineSingletons) {
                                ref$ObjectRef3 = ref$ObjectRef2;
                                interfaceC62332 = interfaceC6233;
                                AbstractC1304 abstractC1304 = this.this$0;
                                C00401 c00401 = new C00401(ref$ObjectRef3, abstractC1304, null);
                                this.L$0 = interfaceC62332;
                                this.L$1 = ref$ObjectRef3;
                                this.label = 3;
                                C1343 c1343 = ((C1358) abstractC1304).f1868;
                                objM1822 = c1343.m1822(MutatePriority.UserInput, new ScrollableNode$drag$2$1(c00401, c1343, null), this);
                                if (objM1822 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objM1822 = c6008;
                                }
                                if (objM1822 != coroutineSingletons) {
                                    interfaceC6233 = interfaceC62332;
                                    try {
                                    } catch (CancellationException unused) {
                                        interfaceC62333 = interfaceC6233;
                                        AbstractC1304 abstractC13042 = this.this$0;
                                        this.L$0 = interfaceC62333;
                                        this.L$1 = null;
                                        this.label = 6;
                                        break;
                                    }
                                    t = ref$ObjectRef3.element;
                                    if (t instanceof C1311) {
                                        this.L$0 = interfaceC6233;
                                        this.L$1 = null;
                                        this.label = 4;
                                        if (AbstractC1304.m1780(this.this$0, (C1311) t, this) != coroutineSingletons) {
                                            if (!AbstractC6231.m11054(interfaceC6233)) {
                                            }
                                        }
                                    } else {
                                        if (t instanceof C1322) {
                                            AbstractC1304 abstractC13043 = this.this$0;
                                            this.L$0 = interfaceC6233;
                                            this.L$1 = null;
                                            this.label = 5;
                                            if (AbstractC1304.m1779(abstractC13043, this) != coroutineSingletons) {
                                            }
                                        }
                                        if (!AbstractC6231.m11054(interfaceC6233)) {
                                            return c6008;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                break;
            case 1:
                ref$ObjectRef = (Ref$ObjectRef) this.L$2;
                ref$ObjectRef2 = (Ref$ObjectRef) this.L$1;
                interfaceC6233 = (InterfaceC6233) this.L$0;
                AbstractC6017.m10769(obj);
                t2 = (AbstractC1310) obj;
                ref$ObjectRef.element = t2;
                t3 = ref$ObjectRef2.element;
                if (t3 instanceof C1320) {
                }
                return coroutineSingletons;
            case 2:
                ref$ObjectRef3 = (Ref$ObjectRef) this.L$1;
                interfaceC62332 = (InterfaceC6233) this.L$0;
                AbstractC6017.m10769(obj);
                AbstractC1304 abstractC13044 = this.this$0;
                C00401 c004012 = new C00401(ref$ObjectRef3, abstractC13044, null);
                this.L$0 = interfaceC62332;
                this.L$1 = ref$ObjectRef3;
                this.label = 3;
                C1343 c13432 = ((C1358) abstractC13044).f1868;
                objM1822 = c13432.m1822(MutatePriority.UserInput, new ScrollableNode$drag$2$1(c004012, c13432, null), this);
                if (objM1822 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                }
                if (objM1822 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 3:
                ref$ObjectRef3 = (Ref$ObjectRef) this.L$1;
                interfaceC62332 = (InterfaceC6233) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                } catch (CancellationException unused2) {
                    interfaceC62333 = interfaceC62332;
                    AbstractC1304 abstractC130422 = this.this$0;
                    this.L$0 = interfaceC62333;
                    this.L$1 = null;
                    this.label = 6;
                }
                interfaceC6233 = interfaceC62332;
                t = ref$ObjectRef3.element;
                if (t instanceof C1311) {
                }
                break;
            case 4:
                interfaceC62333 = (InterfaceC6233) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                } catch (CancellationException unused3) {
                    AbstractC1304 abstractC1304222 = this.this$0;
                    this.L$0 = interfaceC62333;
                    this.L$1 = null;
                    this.label = 6;
                }
                interfaceC6233 = interfaceC62333;
                if (!AbstractC6231.m11054(interfaceC6233)) {
                }
                break;
            case 5:
                interfaceC62333 = (InterfaceC6233) this.L$0;
                AbstractC6017.m10769(obj);
                interfaceC6233 = interfaceC62333;
                if (!AbstractC6231.m11054(interfaceC6233)) {
                }
                break;
            case 6:
                interfaceC62333 = (InterfaceC6233) this.L$0;
                AbstractC6017.m10769(obj);
                interfaceC6233 = interfaceC62333;
                if (!AbstractC6231.m11054(interfaceC6233)) {
                }
                break;
            default:
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
