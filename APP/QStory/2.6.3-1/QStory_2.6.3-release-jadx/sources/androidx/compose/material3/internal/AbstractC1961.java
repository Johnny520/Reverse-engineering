package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.C1481;
import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import p068.InterfaceC7383;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.material3.internal.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1961 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f3616 = 0;

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00c4 -> B:54:0x012a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0106 -> B:46:0x0107). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0128 -> B:54:0x012a). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2576(C1481 c1481, ContinuationImpl continuationImpl) {
        C0164x2966ccbb c0164x2966ccbb;
        float fIntBitsToFloat;
        float f;
        Ref$LongRef ref$LongRef;
        InterfaceC2468 interfaceC2468;
        InterfaceC7383 interfaceC7383;
        int size;
        int i;
        Object obj;
        float f2;
        Object obj2;
        C2478 c2478;
        Object obj3;
        if (continuationImpl instanceof C0164x2966ccbb) {
            c0164x2966ccbb = (C0164x2966ccbb) continuationImpl;
            int i2 = c0164x2966ccbb.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0164x2966ccbb.label = i2 - Integer.MIN_VALUE;
            } else {
                c0164x2966ccbb = new C0164x2966ccbb(continuationImpl);
            }
        }
        Object objM3559 = c0164x2966ccbb.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = c0164x2966ccbb.label;
        Object obj4 = null;
        if (i3 == 0) {
            AbstractC6017.m10769(objM3559);
            throw null;
        }
        if (i3 == 1) {
            fIntBitsToFloat = c0164x2966ccbb.F$1;
            f = c0164x2966ccbb.F$0;
            Ref$LongRef ref$LongRef2 = (Ref$LongRef) c0164x2966ccbb.L$2;
            InterfaceC2468 interfaceC24682 = (InterfaceC2468) c0164x2966ccbb.L$1;
            InterfaceC7383 interfaceC73832 = (InterfaceC7383) c0164x2966ccbb.L$0;
            AbstractC6017.m10769(objM3559);
            ref$LongRef = ref$LongRef2;
            interfaceC2468 = interfaceC24682;
            interfaceC7383 = interfaceC73832;
            C2487 c2487 = (C2487) objM3559;
            List list = c2487.f5197;
            size = list.size();
            i = 0;
            while (true) {
                if (i < size) {
                }
                i++;
                obj4 = obj;
                f = f2;
            }
            obj2.getClass();
            c2478 = (C2478) obj2;
            if (!c2478.m3582()) {
            }
            return obj;
        }
        if (i3 != 2) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fIntBitsToFloat = c0164x2966ccbb.F$1;
        f = c0164x2966ccbb.F$0;
        C2478 c24782 = (C2478) c0164x2966ccbb.L$3;
        ref$LongRef = (Ref$LongRef) c0164x2966ccbb.L$2;
        InterfaceC2468 interfaceC24683 = (InterfaceC2468) c0164x2966ccbb.L$1;
        interfaceC7383 = (InterfaceC7383) c0164x2966ccbb.L$0;
        AbstractC6017.m10769(objM3559);
        obj = null;
        InterfaceC2468 interfaceC24684 = interfaceC24683;
        if (!c24782.m3582()) {
            InterfaceC2468 interfaceC24685 = interfaceC24684;
            c0164x2966ccbb.L$0 = interfaceC7383;
            c0164x2966ccbb.L$1 = interfaceC24685;
            c0164x2966ccbb.L$2 = ref$LongRef;
            obj4 = obj;
            c0164x2966ccbb.L$3 = obj4;
            c0164x2966ccbb.F$0 = f;
            c0164x2966ccbb.F$1 = fIntBitsToFloat;
            c0164x2966ccbb.label = 1;
            objM3559 = ((C2456) interfaceC24685).m3559(PointerEventPass.Main, c0164x2966ccbb);
            if (objM3559 != coroutineSingletons) {
                interfaceC2468 = interfaceC24685;
                C2487 c24872 = (C2487) objM3559;
                List list2 = c24872.f5197;
                size = list2.size();
                i = 0;
                while (true) {
                    if (i < size) {
                        obj = obj4;
                        f2 = f;
                        obj2 = obj;
                        break;
                    }
                    obj2 = list2.get(i);
                    obj = obj4;
                    f2 = f;
                    if (AbstractC2481.m3586(((C2478) obj2).f5154, ref$LongRef.element)) {
                        break;
                    }
                    i++;
                    obj4 = obj;
                    f = f2;
                }
                obj2.getClass();
                c2478 = (C2478) obj2;
                if (!c2478.m3582()) {
                    if (AbstractC2481.m3587(c2478)) {
                        List list3 = c24872.f5197;
                        int size2 = list3.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                obj3 = obj;
                                break;
                            }
                            obj3 = list3.get(i4);
                            if (((C2478) obj3).f5151) {
                                break;
                            }
                            i4++;
                        }
                        C2478 c24783 = (C2478) obj3;
                        if (c24783 != null) {
                            ref$LongRef.element = c24783.f5154;
                            f = f2;
                            interfaceC24685 = interfaceC2468;
                        }
                    } else {
                        fIntBitsToFloat += Float.intBitsToFloat((int) (c2478.f5152 >> 32)) - Float.intBitsToFloat((int) (c2478.f5161 >> 32));
                        if (Math.abs(fIntBitsToFloat) < f2) {
                            PointerEventPass pointerEventPass = PointerEventPass.Final;
                            c0164x2966ccbb.L$0 = interfaceC7383;
                            c0164x2966ccbb.L$1 = interfaceC2468;
                            c0164x2966ccbb.L$2 = ref$LongRef;
                            c0164x2966ccbb.L$3 = c2478;
                            f = f2;
                            c0164x2966ccbb.F$0 = f;
                            c0164x2966ccbb.F$1 = fIntBitsToFloat;
                            c0164x2966ccbb.label = 2;
                            C2456 c2456 = (C2456) interfaceC2468;
                            if (c2456.m3559(pointerEventPass, c0164x2966ccbb) != coroutineSingletons) {
                                c24782 = c2478;
                                interfaceC24684 = c2456;
                                if (!c24782.m3582()) {
                                }
                            }
                        } else {
                            f = f2;
                            interfaceC7383.invoke(c2478, new Float(fIntBitsToFloat - (Math.signum(fIntBitsToFloat) * f)));
                            if (c2478.m3582()) {
                                return c2478;
                            }
                            fIntBitsToFloat = 0.0f;
                            interfaceC24685 = interfaceC2468;
                        }
                    }
                    c0164x2966ccbb.L$0 = interfaceC7383;
                    c0164x2966ccbb.L$1 = interfaceC24685;
                    c0164x2966ccbb.L$2 = ref$LongRef;
                    obj4 = obj;
                    c0164x2966ccbb.L$3 = obj4;
                    c0164x2966ccbb.F$0 = f;
                    c0164x2966ccbb.F$1 = fIntBitsToFloat;
                    c0164x2966ccbb.label = 1;
                    objM3559 = ((C2456) interfaceC24685).m3559(PointerEventPass.Main, c0164x2966ccbb);
                    if (objM3559 != coroutineSingletons) {
                    }
                }
            }
            return coroutineSingletons;
        }
        return obj;
    }
}
