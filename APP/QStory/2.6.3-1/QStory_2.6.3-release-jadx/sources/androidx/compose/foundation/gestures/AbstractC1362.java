package androidx.compose.foundation.gestures;

import androidx.appcompat.app.C0954;
import androidx.appcompat.app.C0960;
import androidx.collection.C1091;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.C2462;
import androidx.compose.p001ui.input.pointer.C2467;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import com.alibaba.fastjson2.C3776;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p126.C8150;
import p126.C8151;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1362 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1377 f1877 = new C1377(0.0f, 0.0f, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m1857(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Float m1858(C2487 c2487) {
        int i = c2487.f5192;
        List list = c2487.f5197;
        if (i != 7 && i != 8 && i != 9) {
            return null;
        }
        int size = list.size();
        float f = 1.0f;
        for (int i2 = 0; i2 < size; i2++) {
            C2478 c2478 = (C2478) list.get(i2);
            f *= c2478.f5162;
            List listM3583 = c2478.m3583();
            int size2 = listM3583.size();
            for (int i3 = 0; i3 < size2; i3++) {
                f *= ((C2467) listM3583.get(i3)).f5121;
            }
        }
        if (f == 1.0f) {
            return null;
        }
        int size3 = list.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ((C2478) list.get(i4)).m3584();
        }
        return Float.valueOf(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C8158 m1859(C2487 c2487) {
        long jM13084;
        long j;
        int i = c2487.f5192;
        List list = c2487.f5197;
        if (i != 10 && i != 11 && i != 12) {
            return null;
        }
        C2478 c2478 = (C2478) AbstractC5176.m9374(list);
        if (c2478 != null) {
            long j2 = c2478.f5163 ^ (-9223372034707292160L);
            List listM3583 = c2478.m3583();
            C8158 c8158 = new C8158(0L);
            int size = listM3583.size();
            int i2 = 0;
            while (true) {
                j = c8158.f19886;
                if (i2 >= size) {
                    break;
                }
                c8158 = new C8158(C8158.m13085(j, ((C2467) listM3583.get(i2)).f5120));
                i2++;
            }
            jM13084 = C8158.m13084(j2, j);
        } else {
            jM13084 = 0;
        }
        if (C8158.m13087(jM13084, 0L)) {
            return null;
        }
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((C2478) list.get(i3)).m3584();
        }
        return new C8158(jM13084);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8158 m1860(InterfaceC2468 interfaceC2468, C2487 c2487, InterfaceC1389 interfaceC1389) {
        long jM13084;
        long j;
        int i = c2487.f5193;
        List list = c2487.f5197;
        if ((i & 4096) == 0) {
            return null;
        }
        int i2 = c2487.f5192;
        if (i2 != 6 && i2 != 10 && i2 != 11 && i2 != 12) {
            return null;
        }
        C2462 c2462 = ((C2456) interfaceC2468).f5086;
        long jM1004 = ((C0960) interfaceC1389).m1004(c2487);
        C2478 c2478 = (C2478) AbstractC5176.m9374(list);
        if (c2478 != null) {
            long j2 = c2478.f5163 ^ (-9223372034707292160L);
            List listM3583 = c2478.m3583();
            C8158 c8158 = new C8158(0L);
            int size = listM3583.size();
            int i3 = 0;
            while (true) {
                j = c8158.f19886;
                if (i3 >= size) {
                    break;
                }
                c8158 = new C8158(C8158.m13085(j, ((C2467) listM3583.get(i3)).f5120));
                i3++;
            }
            jM13084 = C8158.m13084(j2, j);
        } else {
            jM13084 = 0;
        }
        long jM130842 = C8158.m13084(jM1004, jM13084);
        if (C8158.m13087(jM130842, 0L)) {
            return null;
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((C2478) list.get(i4)).m3584();
        }
        return new C8158(jM130842);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m1861(C8150 c8150) {
        return c8150.f19866 && !c8150.f19862;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1862(C6686 c6686, C8150 c8150, Orientation orientation, C8151 c8151, C0954 c0954, long j) {
        float fIntBitsToFloat;
        C1091 c1091 = (C1091) c0954.f660;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c8150.f19863 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c8150.f19863 & 4294967295L));
        if (m1867(c8150)) {
            c0954.f659 = 0;
            c1091.m1339();
        }
        if (!m1861(c8150) && !m1867(c8150)) {
            if (c1091.f1349 == 3) {
                int i = c0954.f659;
                c0954.f659 = i + 1;
                c1091.m1332(i, c8150);
            } else {
                c1091.m1335(c8150);
            }
            if (c0954.f659 == 3) {
                c0954.f659 = 0;
            }
            Object[] objArr = c1091.f1350;
            int i2 = c1091.f1349;
            float fIntBitsToFloat4 = 0.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((C8150) objArr[i3]).f19863 >> 32));
            }
            int i4 = c1091.f1349;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = c1091.f1350;
            float fIntBitsToFloat5 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((C8150) objArr2[i5]).f19863 & 4294967295L));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / c1091.f1349;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        if (orientation != null) {
            int i6 = c8151.f19869;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = orientation == Orientation.Horizontal ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) : (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        ((C3776) c6686.f16359).m6973(c8150.f19864, C8158.m13084(jFloatToRawIntBits, j));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final float m1863(C2487 c2487) {
        List list = c2487.f5197;
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            C2478 c2478 = (C2478) list.get(i);
            if (!c2478.f5160 || !c2478.f5151) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        if (i2 >= 2) {
            long jM1872 = m1872(c2487, true, new C1361(8));
            long jM18722 = m1872(c2487, false, new C1361(8));
            int size2 = list.size();
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i4 = 0; i4 < size2; i4++) {
                C2478 c24782 = (C2478) list.get(i4);
                if (c24782.f5151 && c24782.f5160) {
                    long j = c24782.f5152;
                    long jM13085 = C8158.m13085(c24782.f5161, jM18722);
                    long jM130852 = C8158.m13085(j, jM1872);
                    float fM1873 = m1873(jM130852) - m1873(jM13085);
                    float fM13086 = C8158.m13086(C8158.m13084(jM130852, jM13085)) / 2.0f;
                    if (fM1873 > 180.0f) {
                        fM1873 -= 360.0f;
                    } else if (fM1873 < -180.0f) {
                        fM1873 += 360.0f;
                    }
                    f2 += fM1873 * fM13086;
                    f += fM13086;
                }
            }
            if (f != 0.0f) {
                return f2 / f;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final float m1864(C2487 c2487, boolean z) {
        long jM1872 = m1872(c2487, z, new C1361(8));
        float fM13086 = 0.0f;
        if (C8158.m13087(jM1872, 9205357640488583168L)) {
            return 0.0f;
        }
        List list = c2487.f5197;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C2478 c2478 = (C2478) list.get(i2);
            if (c2478.f5151 && c2478.f5160) {
                i++;
                fM13086 = C8158.m13086(C8158.m13085(z ? c2478.f5152 : c2478.f5161, jM1872)) + fM13086;
            }
        }
        return fM13086 / i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final long m1865(C8150 c8150, Orientation orientation, C8151 c8151) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (orientation == null) {
            return c8150.f19863;
        }
        int i = c8151.f19869;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (c8150.f19863 >> 32));
        } else {
            if (i != 2) {
                return c8150.f19863;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (c8150.f19863 & 4294967295L));
        }
        if (orientation == Orientation.Horizontal) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static Object m1866(InterfaceC1354 interfaceC1354, SuspendLambda suspendLambda) {
        Object objMo1809 = interfaceC1354.mo1809(MutatePriority.Default, new ScrollExtensionsKt$stopScroll$2(null), suspendLambda);
        return objMo1809 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo1809 : C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final boolean m1867(C8150 c8150) {
        return !c8150.f19866 && c8150.f19862;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final long m1868(C8150 c8150, Orientation orientation, C8151 c8151, boolean z) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        long j2 = c8150.f19867;
        if (orientation != null) {
            int i = c8151.f19869;
            if (i == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (orientation == Orientation.Horizontal) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j = jFloatToRawIntBits3 << 32;
            }
            j2 = j | (jFloatToRawIntBits & 4294967295L);
        }
        long jM13085 = C8158.m13085(m1865(c8150, orientation, c8151), j2);
        if (z || !c8150.f19868) {
            return jM13085;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean m1869(InterfaceC2468 interfaceC2468) {
        List list = ((C2456) interfaceC2468).f5086.f5102.f5197;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((C2478) list.get(i)).f5151) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1870(C1359 c1359, InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) {
        AnchoredDraggableKt$restartable$1 anchoredDraggableKt$restartable$1;
        if (continuationImpl instanceof AnchoredDraggableKt$restartable$1) {
            anchoredDraggableKt$restartable$1 = (AnchoredDraggableKt$restartable$1) continuationImpl;
            int i = anchoredDraggableKt$restartable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anchoredDraggableKt$restartable$1.label = i - Integer.MIN_VALUE;
            } else {
                anchoredDraggableKt$restartable$1 = new AnchoredDraggableKt$restartable$1(continuationImpl);
            }
        }
        Object obj = anchoredDraggableKt$restartable$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anchoredDraggableKt$restartable$1.label;
        try {
            if (i2 == 0) {
                AbstractC6017.m10769(obj);
                AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(c1359, interfaceC7383, null);
                anchoredDraggableKt$restartable$1.label = 1;
                if (AbstractC6231.m11066(anchoredDraggableKt$restartable$2, anchoredDraggableKt$restartable$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
            }
        } catch (AnchoredDragFinishedSignal unused) {
        }
        return C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Object m1871(InterfaceC2470 interfaceC2470, InterfaceC7383 interfaceC7383, InterfaceC5189 interfaceC5189) {
        Object objM3565 = ((C2462) interfaceC2470).m3565(new ForEachGestureKt$awaitEachGesture$2(interfaceC5189.getContext(), interfaceC7383, null), interfaceC5189);
        return objM3565 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3565 : C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final long m1872(C2487 c2487, boolean z, InterfaceC7387 interfaceC7387) {
        List list = c2487.f5197;
        int size = list.size();
        long jM13084 = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C2478 c2478 = (C2478) list.get(i2);
            if (((Boolean) interfaceC7387.invoke(c2478)).booleanValue()) {
                jM13084 = C8158.m13084(jM13084, z ? c2478.f5152 : c2478.f5161);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return C8158.m13088(i, jM13084);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final float m1873(long j) {
        if (Float.intBitsToFloat((int) (j >> 32)) == 0.0f && Float.intBitsToFloat((int) (j & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(r0), Float.intBitsToFloat((int) (j & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (m1869(r7) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:19:0x0051). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1874(InterfaceC2468 interfaceC2468, PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl) {
        ForEachGestureKt$awaitAllPointersUp$3 forEachGestureKt$awaitAllPointersUp$3;
        if (baseContinuationImpl instanceof ForEachGestureKt$awaitAllPointersUp$3) {
            forEachGestureKt$awaitAllPointersUp$3 = (ForEachGestureKt$awaitAllPointersUp$3) baseContinuationImpl;
            int i = forEachGestureKt$awaitAllPointersUp$3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                forEachGestureKt$awaitAllPointersUp$3.label = i - Integer.MIN_VALUE;
            } else {
                forEachGestureKt$awaitAllPointersUp$3 = new ForEachGestureKt$awaitAllPointersUp$3(baseContinuationImpl);
            }
        }
        Object objM3559 = forEachGestureKt$awaitAllPointersUp$3.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = forEachGestureKt$awaitAllPointersUp$3.label;
        if (i2 != 0) {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            PointerEventPass pointerEventPass2 = (PointerEventPass) forEachGestureKt$awaitAllPointersUp$3.L$1;
            InterfaceC2468 interfaceC24682 = (InterfaceC2468) forEachGestureKt$awaitAllPointersUp$3.L$0;
            AbstractC6017.m10769(objM3559);
            pointerEventPass = pointerEventPass2;
            interfaceC2468 = interfaceC24682;
            List list = ((C2487) objM3559).f5197;
            int size = list.size();
            int i3 = 0;
            while (i3 < size) {
                if (((C2478) list.get(i3)).f5151) {
                    forEachGestureKt$awaitAllPointersUp$3.L$0 = interfaceC2468;
                    forEachGestureKt$awaitAllPointersUp$3.L$1 = pointerEventPass;
                    forEachGestureKt$awaitAllPointersUp$3.label = 1;
                    C2456 c2456 = (C2456) interfaceC2468;
                    objM3559 = c2456.m3559(pointerEventPass, forEachGestureKt$awaitAllPointersUp$3);
                    interfaceC2468 = c2456;
                    if (objM3559 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    List list2 = ((C2487) objM3559).f5197;
                    int size2 = list2.size();
                    int i32 = 0;
                    while (i32 < size2) {
                    }
                } else {
                    i32++;
                }
            }
            return C6008.f15084;
        }
        AbstractC6017.m10769(objM3559);
    }
}
