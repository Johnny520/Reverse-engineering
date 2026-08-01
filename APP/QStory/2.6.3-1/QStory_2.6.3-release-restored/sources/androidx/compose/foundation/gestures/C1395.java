package androidx.compose.foundation.gestures;

import androidx.appcompat.app.C0923;
import androidx.appcompat.app.C0960;
import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import com.alibaba.fastjson2.AbstractC3738;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.sequences.C5960;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.C6022;
import kotlinx.coroutines.channels.C6042;
import p068.InterfaceC7383;
import p069.AbstractC7390;
import p123.C8141;
import p221.C8731;
import p221.InterfaceC8725;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1395 extends AbstractC1397 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C0960 f1938;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C6249 f1939;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C6022 f1940;

    public C1395(C1343 c1343, C0960 c0960, InterfaceC7383 interfaceC7383, InterfaceC8725 interfaceC8725) {
        super(c1343, interfaceC7383, interfaceC8725);
        this.f1938 = c0960;
        this.f1940 = AbstractC6037.m10841(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, androidx.compose.animation.core.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, androidx.compose.foundation.gestures.飘花落叶言子苏哲楪兰世] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1905(C1395 c1395, Ref$ObjectRef ref$ObjectRef, Ref$FloatRef ref$FloatRef, C1343 c1343, Ref$ObjectRef ref$ObjectRef2, long j, ContinuationImpl continuationImpl) {
        C0042x7147264e c0042x7147264e;
        C1343 c13432;
        Ref$ObjectRef ref$ObjectRef3;
        C1395 c13952;
        Ref$ObjectRef ref$ObjectRef4;
        Ref$FloatRef ref$FloatRef2;
        boolean z;
        if (continuationImpl instanceof C0042x7147264e) {
            c0042x7147264e = (C0042x7147264e) continuationImpl;
            int i = c0042x7147264e.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0042x7147264e.label = i - Integer.MIN_VALUE;
            } else {
                c0042x7147264e = new C0042x7147264e(continuationImpl);
            }
        }
        Object objM11032 = c0042x7147264e.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c0042x7147264e.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objM11032);
            if (j < 0) {
                return Boolean.FALSE;
            }
            C0043x7147264f c0043x7147264f = new C0043x7147264f(c1395, null);
            c0042x7147264e.L$0 = c1395;
            c0042x7147264e.L$1 = ref$ObjectRef;
            c0042x7147264e.L$2 = ref$FloatRef;
            c13432 = c1343;
            c0042x7147264e.L$3 = c13432;
            ref$ObjectRef3 = ref$ObjectRef2;
            c0042x7147264e.L$4 = ref$ObjectRef3;
            c0042x7147264e.label = 1;
            objM11032 = AbstractC6231.m11032(j, c0043x7147264f, c0042x7147264e);
            if (objM11032 == coroutineSingletons) {
                return coroutineSingletons;
            }
            c13952 = c1395;
            ref$ObjectRef4 = ref$ObjectRef;
            ref$FloatRef2 = ref$FloatRef;
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Ref$ObjectRef ref$ObjectRef5 = (Ref$ObjectRef) c0042x7147264e.L$4;
            C1343 c13433 = (C1343) c0042x7147264e.L$3;
            ref$FloatRef2 = (Ref$FloatRef) c0042x7147264e.L$2;
            ref$ObjectRef4 = (Ref$ObjectRef) c0042x7147264e.L$1;
            C1395 c13953 = (C1395) c0042x7147264e.L$0;
            AbstractC6017.m10769(objM11032);
            ref$ObjectRef3 = ref$ObjectRef5;
            c13432 = c13433;
            c13952 = c13953;
        }
        C1400 c1400 = (C1400) objM11032;
        if (c1400 != null) {
            boolean z2 = ((C1400) ref$ObjectRef4.element).f1953;
            long j2 = c1400.f1955;
            ref$ObjectRef4.element = new C1400(j2, c1400.f1954, z2);
            ref$FloatRef2.element = c13432.m1830(c13432.m1823(j2));
            ref$ObjectRef3.element = AbstractC1176.m1571(0.0f, 0.0f, 30);
            C0923 c0923 = c13952.f1946;
            long j3 = c1400.f1954;
            long j4 = c1400.f1955;
            ((C8141) c0923.f572).m13067(Float.intBitsToFloat((int) (j4 >> 32)), j3);
            ((C8141) c0923.f573).m13067(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
            z = !AbstractC1362.m1857(ref$FloatRef2.element);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, androidx.compose.animation.core.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, androidx.compose.foundation.gestures.飘花落叶言子苏哲楪兰世] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1906(C1395 c1395, C1343 c1343, C1400 c1400, float f, float f2, ContinuationImpl continuationImpl) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$1;
        C6008 c6008;
        Ref$FloatRef ref$FloatRef;
        float f3;
        C1343 c13432;
        C1395 c13952 = c1395;
        c13952.getClass();
        C0923 c0923 = c13952.f1946;
        if (continuationImpl instanceof MouseWheelScrollingLogic$dispatchMouseWheelScroll$1) {
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$1 = (MouseWheelScrollingLogic$dispatchMouseWheelScroll$1) continuationImpl;
            int i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$1.label = i - Integer.MIN_VALUE;
            } else {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$1 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$1(c13952, continuationImpl);
            }
        }
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$12 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$1;
        Object obj = mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.label;
        C6008 c60082 = C6008.f15084;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = c1400;
            long j = c1400.f1954;
            c6008 = c60082;
            long j2 = c1400.f1955;
            ((C8141) c0923.f572).m13067(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((C8141) c0923.f573).m13067(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            C1400 c1400M1907 = m1907(c13952.f1940);
            if (c1400M1907 != null) {
                long j3 = c1400M1907.f1954;
                long j4 = c1400M1907.f1955;
                ((C8141) c0923.f572).m13067(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                ((C8141) c0923.f573).m13067(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                ref$ObjectRef.element = ((C1400) ref$ObjectRef.element).m1912(c1400M1907);
            }
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            float fM1829 = c1343.m1829(c1343.m1823(((C1400) ref$ObjectRef.element).f1955));
            ref$FloatRef2.element = fM1829;
            if (!AbstractC1362.m1857(fM1829)) {
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                ref$ObjectRef2.element = AbstractC1176.m1571(0.0f, 0.0f, 30);
                c13952 = c1395;
                MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(ref$FloatRef2, ref$ObjectRef2, ref$ObjectRef, f, c13952, f2, c1343, null);
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$0 = c1343;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$1 = ref$FloatRef2;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.F$0 = f2;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.label = 1;
                if (c13952.m1911(mouseWheelScrollingLogic$dispatchMouseWheelScroll$3, mouseWheelScrollingLogic$dispatchMouseWheelScroll$12) != coroutineSingletons) {
                    ref$FloatRef = ref$FloatRef2;
                    f3 = f2;
                    c13432 = c1343;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC6017.m10769(obj);
                return c60082;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f3 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.F$0;
        ref$FloatRef = (Ref$FloatRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$1;
        c13432 = (C1343) mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$0;
        AbstractC6017.m10769(obj);
        c6008 = c60082;
        long jM6871 = AbstractC3738.m6871(((C8141) c0923.f572).m13066(Float.MAX_VALUE), ((C8141) c0923.f573).m13066(Float.MAX_VALUE));
        if (jM6871 == 0) {
            float fM1824 = c13432.m1824(Math.signum(ref$FloatRef.element)) * Math.min(Math.abs(ref$FloatRef.element) / 100.0f, f3) * 1000.0f;
            if (fM1824 == 0.0f) {
                jM6871 = 0;
            } else {
                jM6871 = c13432.f1834 == Orientation.Horizontal ? AbstractC3738.m6871(fM1824, 0.0f) : AbstractC3738.m6871(0.0f, fM1824);
            }
        }
        InterfaceC7383 interfaceC7383 = c13952.f1949;
        C8731 c8731 = new C8731(jM6871);
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$0 = null;
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$1 = null;
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.label = 2;
        return interfaceC7383.invoke(c8731, mouseWheelScrollingLogic$dispatchMouseWheelScroll$12) == coroutineSingletons ? coroutineSingletons : c6008;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C1400 m1907(C6022 c6022) {
        C1400 c1400 = null;
        C5960 c5960M12604 = AbstractC7390.m12604(new NonTouchScrollingLogicKt$untilNull$1(new C1399(c6022, 0), null));
        while (c5960M12604.hasNext()) {
            C1400 c1400M1912 = (C1400) c5960M12604.next();
            if (c1400 != null) {
                c1400M1912 = c1400.m1912(c1400M1912);
            }
            c1400 = c1400M1912;
        }
        return c1400;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m1908(C2487 c2487, long j) {
        boolean zMo1847;
        C0960 c0960 = this.f1938;
        long jM1004 = c0960.m1004(c2487);
        C1343 c1343 = this.f1950;
        float fM1830 = c1343.m1830(c1343.m1823(jM1004));
        if (fM1830 == 0.0f) {
            zMo1847 = false;
        } else {
            InterfaceC1354 interfaceC1354 = c1343.f1837;
            zMo1847 = fM1830 > 0.0f ? interfaceC1354.mo1847() : interfaceC1354.mo1848();
        }
        if (!zMo1847) {
            return this.f1947;
        }
        long j2 = ((C2478) AbstractC5176.m9379(c2487.f5197)).f5153;
        c0960.getClass();
        return !(this.f1940.mo8995(new C1400(jM1004, j2, false)) instanceof C6042);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float m1909(InterfaceC1398 interfaceC1398, float f) {
        C1343 c1343 = this.f1950;
        long jM1828 = c1343.m1828(c1343.m1824(f));
        C1343 c13432 = ((C1356) interfaceC1398).f1859;
        return c1343.m1829(c1343.m1823(c13432.m1825(c13432.f1841, jM1828, 1)));
    }
}
