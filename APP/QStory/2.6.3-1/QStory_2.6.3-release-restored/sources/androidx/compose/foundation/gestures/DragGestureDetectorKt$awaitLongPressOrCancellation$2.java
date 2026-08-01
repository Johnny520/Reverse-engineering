package androidx.compose.foundation.gestures;

import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", m556f = "DragGestureDetector.kt", m557l = {1079, 1101}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ Ref$ObjectRef<C2478> $currentDown;
    final /* synthetic */ Ref$BooleanRef $deepPress;
    final /* synthetic */ Ref$ObjectRef<C2478> $longPress;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$awaitLongPressOrCancellation$2(Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef<C2478> ref$ObjectRef, Ref$ObjectRef<C2478> ref$ObjectRef2, InterfaceC5189<? super DragGestureDetectorKt$awaitLongPressOrCancellation$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$deepPress = ref$BooleanRef;
        this.$currentDown = ref$ObjectRef;
        this.$longPress = ref$ObjectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.$deepPress, this.$currentDown, this.$longPress, interfaceC5189);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.L$0 = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dd A[EDGE_INSN: B:69:0x00dd->B:45:0x00dd BREAK  A[LOOP:0: B:40:0x00ca->B:44:0x00da], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x006d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v7, types: [T, androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00bc -> B:39:0x00c1). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2468 interfaceC2468;
        int i;
        Object objM3559;
        InterfaceC2468 interfaceC24682;
        C2487 c2487;
        int size;
        int i2;
        int size2;
        int i3;
        Object objM35592;
        T t;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        Object obj3 = null;
        int i5 = 2;
        int i6 = 1;
        if (i4 == 0) {
            AbstractC6017.m10769(obj);
            interfaceC2468 = (InterfaceC2468) this.L$0;
            i = 0;
            if (i != 0) {
            }
        } else {
            if (i4 == 1) {
                i = this.I$0;
                InterfaceC2468 interfaceC24683 = (InterfaceC2468) this.L$0;
                AbstractC6017.m10769(obj);
                objM3559 = obj;
                interfaceC24682 = interfaceC24683;
                c2487 = (C2487) objM3559;
                List list = c2487.f5197;
                size = list.size();
                i2 = 0;
                while (true) {
                    if (i2 >= size) {
                    }
                    i2++;
                }
                List list2 = c2487.f5197;
                size2 = list2.size();
                while (i3 < size2) {
                }
                if (c2487.f5195 != i5) {
                }
                PointerEventPass pointerEventPass = PointerEventPass.Final;
                this.L$0 = interfaceC24682;
                this.L$1 = c2487;
                this.I$0 = i;
                this.label = i5;
                C2456 c2456 = (C2456) interfaceC24682;
                objM35592 = c2456.m3559(pointerEventPass, this);
                if (objM35592 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i4 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            C2487 c24872 = (C2487) this.L$1;
            InterfaceC2468 interfaceC24684 = (InterfaceC2468) this.L$0;
            AbstractC6017.m10769(obj);
            int i7 = 1;
            objM35592 = obj;
            List list3 = ((C2487) objM35592).f5197;
            int size3 = list3.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size3) {
                    break;
                }
                if (((C2478) list3.get(i8)).m3582()) {
                    i = i7;
                    break;
                }
                i8++;
            }
            boolean zM1807 = AbstractC1309.m1807(c24872, this.$currentDown.element.f5154);
            List list4 = c24872.f5197;
            if (!zM1807) {
                int size4 = list4.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size4) {
                        obj2 = obj3;
                        break;
                    }
                    obj2 = list4.get(i9);
                    if (((C2478) obj2).f5151) {
                        break;
                    }
                    i9++;
                }
                ?? r10 = (C2478) obj2;
                if (r10 == 0) {
                    i = i7;
                    i6 = i;
                    interfaceC2468 = interfaceC24684;
                    if (i != 0) {
                        return C6008.f15084;
                    }
                    PointerEventPass pointerEventPass2 = PointerEventPass.Main;
                    this.L$0 = interfaceC2468;
                    this.L$1 = obj3;
                    this.I$0 = i;
                    this.label = i6;
                    C2456 c24562 = (C2456) interfaceC2468;
                    objM3559 = c24562.m3559(pointerEventPass2, this);
                    interfaceC24682 = c24562;
                    if (objM3559 != coroutineSingletons) {
                        c2487 = (C2487) objM3559;
                        List list5 = c2487.f5197;
                        size = list5.size();
                        i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                i = i6;
                                break;
                            }
                            if (!AbstractC2481.m3587((C2478) list5.get(i2))) {
                                break;
                            }
                            i2++;
                        }
                        List list22 = c2487.f5197;
                        size2 = list22.size();
                        for (i3 = 0; i3 < size2; i3++) {
                            C2478 c2478 = (C2478) list22.get(i3);
                            if (c2478.m3582() || AbstractC2481.m3585(c2478, ((C2456) interfaceC24682).f5086.f5098, ((C2456) interfaceC24682).m3558())) {
                                break;
                            }
                        }
                        if (c2487.f5195 != i5) {
                            i7 = 1;
                            this.$deepPress.element = true;
                            i = 1;
                        } else {
                            i7 = 1;
                        }
                        PointerEventPass pointerEventPass3 = PointerEventPass.Final;
                        this.L$0 = interfaceC24682;
                        this.L$1 = c2487;
                        this.I$0 = i;
                        this.label = i5;
                        C2456 c24563 = (C2456) interfaceC24682;
                        objM35592 = c24563.m3559(pointerEventPass3, this);
                        if (objM35592 != coroutineSingletons) {
                            interfaceC24684 = c24563;
                            c24872 = c2487;
                            List list32 = ((C2487) objM35592).f5197;
                            int size32 = list32.size();
                            int i82 = 0;
                            while (true) {
                                if (i82 >= size32) {
                                }
                                i82++;
                            }
                            boolean zM18072 = AbstractC1309.m1807(c24872, this.$currentDown.element.f5154);
                            List list42 = c24872.f5197;
                            if (!zM18072) {
                                Ref$ObjectRef<C2478> ref$ObjectRef = this.$longPress;
                                Ref$ObjectRef<C2478> ref$ObjectRef2 = this.$currentDown;
                                int size5 = list42.size();
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= size5) {
                                        t = 0;
                                        break;
                                    }
                                    t = list42.get(i10);
                                    if (AbstractC2481.m3586(((C2478) t).f5154, ref$ObjectRef2.element.f5154)) {
                                        break;
                                    }
                                    i10++;
                                }
                                ref$ObjectRef.element = t;
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                this.$currentDown.element = r10;
                this.$longPress.element = r10;
            }
            i6 = i7;
            interfaceC2468 = interfaceC24684;
            obj3 = null;
            i5 = 2;
            if (i != 0) {
            }
        }
    }
}
