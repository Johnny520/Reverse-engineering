package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.gestures.AbstractC1344;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.focus.C2287;
import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.runtime.collection.C2059;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p128.C8158;
import p226.AbstractC8765;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", m556f = "StylusHandwriting.kt", m557l = {116, 144, 182}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class StylusHandwritingNode$suspendingPointerInputModifierNode$1$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C1676 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StylusHandwritingNode$suspendingPointerInputModifierNode$1$1(C1676 c1676, InterfaceC5189<? super StylusHandwritingNode$suspendingPointerInputModifierNode$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1676;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        StylusHandwritingNode$suspendingPointerInputModifierNode$1$1 stylusHandwritingNode$suspendingPointerInputModifierNode$1$1 = new StylusHandwritingNode$suspendingPointerInputModifierNode$1$1(this.this$0, interfaceC5189);
        stylusHandwritingNode$suspendingPointerInputModifierNode$1$1.L$0 = obj;
        return stylusHandwritingNode$suspendingPointerInputModifierNode$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((StylusHandwritingNode$suspendingPointerInputModifierNode$1$1) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0249, code lost:
    
        if (r3 != r1) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (r8 == r1) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x01b7, code lost:
    
        continue;
     */
    /* JADX WARN: Path cross not found for [B:30:0x00b0, B:25:0x008c], limit reached: 190 */
    /* JADX WARN: Path cross not found for [B:33:0x00b7, B:36:0x00bd], limit reached: 190 */
    /* JADX WARN: Path cross not found for [B:60:0x0123, B:55:0x0109], limit reached: 190 */
    /* JADX WARN: Path cross not found for [B:60:0x0123, B:58:0x011e], limit reached: 190 */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0141  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:141:0x0249 -> B:8:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00d1 -> B:41:0x00d6). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2468 interfaceC2468;
        Object objM1836;
        C2478 c2478;
        boolean z;
        PointerEventPass pointerEventPass;
        Object objM3559;
        Object obj2;
        int i;
        C2478 c24782;
        InterfaceC2468 interfaceC24682;
        Object objM35592;
        InterfaceC2468 interfaceC24683;
        Object obj3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        int i3 = 2;
        Object obj4 = null;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            interfaceC2468 = (InterfaceC2468) this.L$0;
            PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
            this.L$0 = interfaceC2468;
            this.label = 1;
            objM1836 = AbstractC1344.m1836(interfaceC2468, true, pointerEventPass2, this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c24782 = (C2478) this.L$1;
                    InterfaceC2468 interfaceC24684 = (InterfaceC2468) this.L$0;
                    AbstractC6017.m10769(obj);
                    i = 0;
                    objM35592 = obj;
                    interfaceC24683 = interfaceC24684;
                    interfaceC24682 = interfaceC24683;
                    List list = ((C2487) objM35592).f5197;
                    int size = list.size();
                    int i4 = i;
                    while (true) {
                        if (i4 >= size) {
                            obj3 = null;
                            break;
                        }
                        obj3 = list.get(i4);
                        C2478 c24783 = (C2478) obj3;
                        if (!c24783.m3582() && AbstractC2481.m3586(c24783.f5154, c24782.f5154) && c24783.f5151) {
                            break;
                        }
                        i4++;
                    }
                    C2478 c24784 = (C2478) obj3;
                    if (c24784 != null) {
                        c24784.m3584();
                        obj4 = null;
                        PointerEventPass pointerEventPass3 = PointerEventPass.Initial;
                        this.L$0 = interfaceC24682;
                        this.L$1 = c24782;
                        this.L$2 = obj4;
                        this.label = 3;
                        C2456 c2456 = (C2456) interfaceC24682;
                        objM35592 = c2456.m3559(pointerEventPass3, this);
                        interfaceC24683 = c2456;
                    }
                    return C6008.f15084;
                }
                PointerEventPass pointerEventPass4 = (PointerEventPass) this.L$2;
                c2478 = (C2478) this.L$1;
                InterfaceC2468 interfaceC24685 = (InterfaceC2468) this.L$0;
                AbstractC6017.m10769(obj);
                objM3559 = obj;
                InterfaceC2468 interfaceC24686 = interfaceC24685;
                C2487 c2487 = (C2487) objM3559;
                List list2 = c2487.f5197;
                int size2 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list2.get(i5);
                    C2478 c24785 = (C2478) obj2;
                    if (!c24785.m3582() && AbstractC2481.m3586(c24785.f5154, c2478.f5154) && c24785.f5151) {
                        break;
                    }
                    i5++;
                }
                C2478 c24786 = (C2478) obj2;
                if (c24786 != null) {
                    C2456 c24562 = (C2456) interfaceC24686;
                    if (c24786.f5153 - c2478.f5153 < c24562.m3557().mo3840()) {
                        i3 = 2;
                        if (c2487.f5195 != 2) {
                            if (C8158.m13086(C8158.m13085(c24786.f5152, c2478.f5152)) <= c24562.m3557().mo4015()) {
                                pointerEventPass = pointerEventPass4;
                                interfaceC2468 = c24562;
                                this.L$0 = interfaceC2468;
                                this.L$1 = c2478;
                                this.L$2 = pointerEventPass;
                                this.label = i3;
                                C2456 c24563 = (C2456) interfaceC2468;
                                objM3559 = c24563.m3559(pointerEventPass, this);
                                if (objM3559 != coroutineSingletons) {
                                    PointerEventPass pointerEventPass5 = pointerEventPass;
                                    interfaceC24686 = c24563;
                                    pointerEventPass4 = pointerEventPass5;
                                    C2487 c24872 = (C2487) objM3559;
                                    List list22 = c24872.f5197;
                                    int size22 = list22.size();
                                    int i52 = 0;
                                    while (true) {
                                        if (i52 < size22) {
                                        }
                                        i52++;
                                    }
                                    C2478 c247862 = (C2478) obj2;
                                    if (c247862 != null) {
                                    }
                                }
                                return coroutineSingletons;
                            }
                        }
                        if (c247862 != null) {
                            C1676 c1676 = this.this$0;
                            if (!c1676.f2717) {
                                AbstractC2961 abstractC2961M3899 = c1676.f6637;
                                C2059 c2059 = null;
                                while (true) {
                                    if (abstractC2961M3899 == null) {
                                        if (!c1676.f6637.f6624) {
                                            AbstractC8765.m13982("visitChildren called on an unattached node");
                                        }
                                        C2059 c20592 = new C2059(0, new AbstractC2961[16]);
                                        AbstractC2961 abstractC2961 = c1676.f6637;
                                        AbstractC2961 abstractC29612 = abstractC2961.f6633;
                                        if (abstractC29612 == null) {
                                            AbstractC2620.m3902(c20592, abstractC2961);
                                        } else {
                                            c20592.m2607(abstractC29612);
                                        }
                                        loop4: while (true) {
                                            int i6 = c20592.f3865;
                                            if (i6 == 0) {
                                                break;
                                            }
                                            AbstractC2961 abstractC2961M38992 = (AbstractC2961) c20592.m2613(i6 - 1);
                                            if ((abstractC2961M38992.f6630 & 1024) == 0) {
                                                AbstractC2620.m3902(c20592, abstractC2961M38992);
                                            } else {
                                                while (true) {
                                                    if (abstractC2961M38992 == null) {
                                                        break;
                                                    }
                                                    if ((abstractC2961M38992.f6636 & 1024) != 0) {
                                                        C2059 c20593 = null;
                                                        while (abstractC2961M38992 != null) {
                                                            if (abstractC2961M38992 instanceof C2287) {
                                                                ((C2287) abstractC2961M38992).m3156(7);
                                                                break loop4;
                                                            }
                                                            if ((abstractC2961M38992.f6636 & 1024) == 0 || !(abstractC2961M38992 instanceof AbstractC2623)) {
                                                                abstractC2961M38992 = AbstractC2620.m3899(c20593);
                                                            } else {
                                                                int i7 = 0;
                                                                for (AbstractC2961 abstractC29613 = ((AbstractC2623) abstractC2961M38992).f5571; abstractC29613 != null; abstractC29613 = abstractC29613.f6633) {
                                                                    if ((abstractC29613.f6636 & 1024) != 0) {
                                                                        i7++;
                                                                        if (i7 == 1) {
                                                                            abstractC2961M38992 = abstractC29613;
                                                                        } else {
                                                                            if (c20593 == null) {
                                                                                c20593 = new C2059(0, new AbstractC2961[16]);
                                                                            }
                                                                            if (abstractC2961M38992 != null) {
                                                                                c20593.m2607(abstractC2961M38992);
                                                                                abstractC2961M38992 = null;
                                                                            }
                                                                            c20593.m2607(abstractC29613);
                                                                        }
                                                                    }
                                                                }
                                                                if (i7 != 1) {
                                                                    abstractC2961M38992 = AbstractC2620.m3899(c20593);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        abstractC2961M38992 = abstractC2961M38992.f6633;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        if (abstractC2961M3899 instanceof C2287) {
                                            ((C2287) abstractC2961M3899).m3156(7);
                                            break;
                                        }
                                        if ((abstractC2961M3899.f6636 & 1024) != 0 && (abstractC2961M3899 instanceof AbstractC2623)) {
                                            int i8 = 0;
                                            for (AbstractC2961 abstractC29614 = ((AbstractC2623) abstractC2961M3899).f5571; abstractC29614 != null; abstractC29614 = abstractC29614.f6633) {
                                                if ((abstractC29614.f6636 & 1024) != 0) {
                                                    i8++;
                                                    if (i8 == 1) {
                                                        abstractC2961M3899 = abstractC29614;
                                                    } else {
                                                        if (c2059 == null) {
                                                            c2059 = new C2059(0, new AbstractC2961[16]);
                                                        }
                                                        if (abstractC2961M3899 != null) {
                                                            c2059.m2607(abstractC2961M3899);
                                                            abstractC2961M3899 = null;
                                                        }
                                                        c2059.m2607(abstractC29614);
                                                    }
                                                }
                                            }
                                            if (i8 == 1) {
                                            }
                                        }
                                        abstractC2961M3899 = AbstractC2620.m3899(c2059);
                                    }
                                }
                            }
                            i = 0;
                            this.this$0.f2718.invoke();
                            c247862.m3584();
                            c24782 = c2478;
                            interfaceC24682 = interfaceC24686;
                            PointerEventPass pointerEventPass32 = PointerEventPass.Initial;
                            this.L$0 = interfaceC24682;
                            this.L$1 = c24782;
                            this.L$2 = obj4;
                            this.label = 3;
                            C2456 c24564 = (C2456) interfaceC24682;
                            objM35592 = c24564.m3559(pointerEventPass32, this);
                            interfaceC24683 = c24564;
                        }
                        return C6008.f15084;
                    }
                }
                c247862 = null;
                if (c247862 != null) {
                }
                return C6008.f15084;
            }
            interfaceC2468 = (InterfaceC2468) this.L$0;
            AbstractC6017.m10769(obj);
            objM1836 = obj;
        }
        c2478 = (C2478) objM1836;
        int i9 = c2478.f5164;
        long j = c2478.f5152;
        if (i9 == 3 || i9 == 4) {
            int i10 = (int) (j >> 32);
            if (Float.intBitsToFloat(i10) >= 0.0f && Float.intBitsToFloat(i10) < ((int) (((C2456) interfaceC2468).f5086.f5098 >> 32))) {
                int i11 = (int) (j & 4294967295L);
                if (Float.intBitsToFloat(i11) >= 0.0f && Float.intBitsToFloat(i11) < ((int) (4294967295L & ((C2456) interfaceC2468).f5086.f5098))) {
                    z = true;
                }
                pointerEventPass = (!this.this$0.f2717 || z) ? PointerEventPass.Initial : PointerEventPass.Main;
                this.L$0 = interfaceC2468;
                this.L$1 = c2478;
                this.L$2 = pointerEventPass;
                this.label = i3;
                C2456 c245632 = (C2456) interfaceC2468;
                objM3559 = c245632.m3559(pointerEventPass, this);
                if (objM3559 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            z = false;
            if (this.this$0.f2717) {
            }
            this.L$0 = interfaceC2468;
            this.L$1 = c2478;
            this.L$2 = pointerEventPass;
            this.label = i3;
            C2456 c2456322 = (C2456) interfaceC2468;
            objM3559 = c2456322.m3559(pointerEventPass, this);
            if (objM3559 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        return C6008.f15084;
    }
}
