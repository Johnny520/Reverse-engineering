package androidx.compose.animation.core;

import androidx.activity.C0863;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.InterfaceC2959;
import androidx.compose.p001ui.platform.C2742;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.snapshots.AbstractC2109;
import androidx.compose.runtime.snapshots.AbstractC2121;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1176 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1193 f1456 = new C1193(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1194 f1455 = new C1194(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1186 f1454 = new C1186(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C1185 f1453 = new C1185(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C1193 f1452 = new C1193(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C1194 f1451 = new C1194(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C1186 f1464 = new C1186(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C1185 f1463 = new C1185(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final float[] f1467 = new float[91];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C1203 f1468 = new C1203(new C0863(2), new C0863(19));

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C1203 f1465 = new C1203(new C0863(3), new C0863(4));

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C1203 f1466 = new C1203(new C0863(5), new C0863(6));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C1203 f1458 = new C1203(new C0863(7), new C0863(8));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C1203 f1457 = new C1203(new C0863(9), new C0863(10));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C1203 f1461 = new C1203(new C0863(11), new C0863(12));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C1203 f1462 = new C1203(new C0863(13), new C0863(14));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C1203 f1459 = new C1203(new C0863(15), new C0863(16));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C1203 f1460 = new C1203(new C0863(17), new C0863(18));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Object m1567(C1203 c1203, Object obj, Object obj2, Float f, InterfaceC1195 interfaceC1195, InterfaceC7383 interfaceC7383, SuspendLambda suspendLambda) {
        AbstractC1189 abstractC1189Mo1599;
        InterfaceC7387 interfaceC7387 = c1203.f1574;
        if (f == null || (abstractC1189Mo1599 = (AbstractC1189) interfaceC7387.invoke(f)) == null) {
            abstractC1189Mo1599 = ((AbstractC1189) interfaceC7387.invoke(obj)).mo1599();
        }
        AbstractC1189 abstractC1189 = abstractC1189Mo1599;
        Object objM1568 = m1568(new C1196(c1203, obj, abstractC1189, 56), new C1220(interfaceC1195, c1203, obj, obj2, abstractC1189), Long.MIN_VALUE, new C1218(interfaceC7383, 2, c1203), suspendLambda);
        return objM1568 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1568 : C6008.f15084;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r14v0, types: [T, androidx.compose.animation.core.飘花落叶言子楪苏世兰哲] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1568(C1196 c1196, InterfaceC1173 interfaceC1173, long j, final InterfaceC7387 interfaceC7387, ContinuationImpl continuationImpl) {
        SuspendAnimationKt$animate$4 suspendAnimationKt$animate$4;
        final Ref$ObjectRef ref$ObjectRef;
        final C1196 c11962;
        C1196 c11963;
        final float fM1582;
        InterfaceC7387 interfaceC73872;
        Ref$ObjectRef ref$ObjectRef2;
        Object objMo2865;
        InterfaceC7387 interfaceC73873;
        C1191 c1191;
        C1191 c11912;
        Object objMo28652;
        final InterfaceC1173 interfaceC11732 = interfaceC1173;
        C2742 c2742 = C2742.f5967;
        if (continuationImpl instanceof SuspendAnimationKt$animate$4) {
            suspendAnimationKt$animate$4 = (SuspendAnimationKt$animate$4) continuationImpl;
            int i = suspendAnimationKt$animate$4.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                suspendAnimationKt$animate$4.label = i - Integer.MIN_VALUE;
            } else {
                suspendAnimationKt$animate$4 = new SuspendAnimationKt$animate$4(continuationImpl);
            }
        }
        SuspendAnimationKt$animate$4 suspendAnimationKt$animate$42 = suspendAnimationKt$animate$4;
        Object obj = suspendAnimationKt$animate$42.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = suspendAnimationKt$animate$42.label;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            final Object objMo1559 = interfaceC11732.mo1559(0L);
            final AbstractC1189 abstractC1189Mo1561 = interfaceC11732.mo1561(0L);
            ref$ObjectRef = new Ref$ObjectRef();
            if (j == Long.MIN_VALUE) {
                try {
                    fM1582 = m1582(suspendAnimationKt$animate$42.getContext());
                    c11962 = c1196;
                } catch (CancellationException e) {
                    e = e;
                    c11962 = c1196;
                }
                try {
                    interfaceC73872 = new InterfaceC7387() { // from class: androidx.compose.animation.core.飘花落叶言子世兰哲苏楪
                        /* JADX WARN: Type inference failed for: r0v0, types: [T, androidx.compose.animation.core.飘花落叶言子楪苏世兰哲] */
                        @Override // p068.InterfaceC7387
                        public final Object invoke(Object obj2) {
                            long jLongValue = ((Long) obj2).longValue();
                            InterfaceC1173 interfaceC11733 = interfaceC11732;
                            InterfaceC1204 interfaceC1204Mo1562 = interfaceC11733.mo1562();
                            Object objMo1565 = interfaceC11733.mo1565();
                            C1196 c11964 = c11962;
                            ?? c11913 = new C1191(objMo1559, interfaceC1204Mo1562, abstractC1189Mo1561, jLongValue, objMo1565, jLongValue, new C1216(c11964, 1));
                            AbstractC1176.m1581(c11913, jLongValue, fM1582, interfaceC11733, c11964, interfaceC7387);
                            ref$ObjectRef.element = c11913;
                            return C6008.f15084;
                        }
                    };
                    ref$ObjectRef2 = ref$ObjectRef;
                } catch (CancellationException e2) {
                    e = e2;
                    c11963 = c11962;
                    c1191 = (C1191) ref$ObjectRef.element;
                    if (c1191 != null) {
                    }
                    c11912 = (C1191) ref$ObjectRef.element;
                    if (c11912 != null) {
                        c11963.f1543 = false;
                    }
                    throw e;
                }
                try {
                    suspendAnimationKt$animate$42.L$0 = c11962;
                    suspendAnimationKt$animate$42.L$1 = interfaceC11732;
                    suspendAnimationKt$animate$42.L$2 = interfaceC7387;
                    suspendAnimationKt$animate$42.L$3 = ref$ObjectRef2;
                    suspendAnimationKt$animate$42.label = 1;
                    if (!interfaceC11732.mo1564()) {
                        objMo2865 = AbstractC2202.m3052(suspendAnimationKt$animate$42.getContext()).mo2865(new C1219(interfaceC73872, i3), suspendAnimationKt$animate$42);
                    } else {
                        if (suspendAnimationKt$animate$42.getContext().get(c2742) != null) {
                            throw new ClassCastException();
                        }
                        objMo2865 = AbstractC2202.m3052(suspendAnimationKt$animate$42.getContext()).mo2865(interfaceC73872, suspendAnimationKt$animate$42);
                    }
                    if (objMo2865 != coroutineSingletons) {
                        c11963 = c11962;
                        interfaceC73873 = interfaceC7387;
                        ref$ObjectRef = ref$ObjectRef2;
                    }
                    return coroutineSingletons;
                } catch (CancellationException e3) {
                    e = e3;
                    c11963 = c11962;
                    ref$ObjectRef = ref$ObjectRef2;
                    c1191 = (C1191) ref$ObjectRef.element;
                    if (c1191 != null) {
                    }
                    c11912 = (C1191) ref$ObjectRef.element;
                    if (c11912 != null) {
                    }
                    throw e;
                }
            }
            ref$ObjectRef2 = ref$ObjectRef;
            try {
                ?? c11913 = new C1191(objMo1559, interfaceC11732.mo1562(), abstractC1189Mo1561, j, interfaceC11732.mo1565(), j, new C1216(c1196, 0));
                m1581(c11913, j, m1582(suspendAnimationKt$animate$42.getContext()), interfaceC11732, c1196, interfaceC7387);
                ref$ObjectRef2.element = c11913;
                c11963 = c1196;
                interfaceC11732 = interfaceC1173;
                interfaceC73873 = interfaceC7387;
                ref$ObjectRef = ref$ObjectRef2;
            } catch (CancellationException e4) {
                e = e4;
                c11963 = c1196;
                ref$ObjectRef = ref$ObjectRef2;
                c1191 = (C1191) ref$ObjectRef.element;
                if (c1191 != null) {
                    ((AbstractC2182) c1191.f1535).setValue(Boolean.FALSE);
                }
                c11912 = (C1191) ref$ObjectRef.element;
                if (c11912 != null && c11912.f1534 == c11963.f1542) {
                    c11963.f1543 = false;
                }
                throw e;
            }
        } else {
            if (i2 != 1 && i2 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$ObjectRef = (Ref$ObjectRef) suspendAnimationKt$animate$42.L$3;
            interfaceC73873 = (InterfaceC7387) suspendAnimationKt$animate$42.L$2;
            interfaceC11732 = (InterfaceC1173) suspendAnimationKt$animate$42.L$1;
            c11963 = (C1196) suspendAnimationKt$animate$42.L$0;
            try {
                AbstractC6017.m10769(obj);
            } catch (CancellationException e5) {
                e = e5;
                c1191 = (C1191) ref$ObjectRef.element;
                if (c1191 != null) {
                }
                c11912 = (C1191) ref$ObjectRef.element;
                if (c11912 != null) {
                }
                throw e;
            }
        }
        do {
            T t = ref$ObjectRef.element;
            t.getClass();
            if (!((Boolean) ((AbstractC2182) ((C1191) t).f1535).getValue()).booleanValue()) {
                return C6008.f15084;
            }
            final float fM15822 = m1582(suspendAnimationKt$animate$42.getContext());
            final Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef;
            final InterfaceC7387 interfaceC73874 = interfaceC73873;
            final InterfaceC1173 interfaceC11733 = interfaceC11732;
            final C1196 c11964 = c11963;
            try {
                InterfaceC7387 interfaceC73875 = new InterfaceC7387() { // from class: androidx.compose.animation.core.飘花落叶言子苏楪世兰哲
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // p068.InterfaceC7387
                    public final Object invoke(Object obj2) {
                        long jLongValue = ((Long) obj2).longValue();
                        T t2 = ref$ObjectRef3.element;
                        t2.getClass();
                        AbstractC1176.m1581((C1191) t2, jLongValue, fM15822, interfaceC11733, c11964, interfaceC73874);
                        return C6008.f15084;
                    }
                };
                ref$ObjectRef = ref$ObjectRef3;
                interfaceC11732 = interfaceC11733;
                c11963 = c11964;
                interfaceC73873 = interfaceC73874;
                suspendAnimationKt$animate$42.L$0 = c11963;
                suspendAnimationKt$animate$42.L$1 = interfaceC11732;
                suspendAnimationKt$animate$42.L$2 = interfaceC73873;
                suspendAnimationKt$animate$42.L$3 = ref$ObjectRef;
                suspendAnimationKt$animate$42.label = 2;
                if (!interfaceC11732.mo1564()) {
                    objMo28652 = AbstractC2202.m3052(suspendAnimationKt$animate$42.getContext()).mo2865(new C1219(interfaceC73875, i3), suspendAnimationKt$animate$42);
                } else {
                    if (suspendAnimationKt$animate$42.getContext().get(c2742) != null) {
                        throw new ClassCastException();
                    }
                    objMo28652 = AbstractC2202.m3052(suspendAnimationKt$animate$42.getContext()).mo2865(interfaceC73875, suspendAnimationKt$animate$42);
                }
            } catch (CancellationException e6) {
                e = e6;
                ref$ObjectRef = ref$ObjectRef3;
                c11963 = c11964;
                c1191 = (C1191) ref$ObjectRef.element;
                if (c1191 != null) {
                }
                c11912 = (C1191) ref$ObjectRef.element;
                if (c11912 != null) {
                }
                throw e;
            }
        } while (objMo28652 != coroutineSingletons);
        return coroutineSingletons;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m1569(C1210 c1210, C1197 c1197, Float f, Float f2, InterfaceC1157 interfaceC1157, InterfaceC2208 interfaceC2208, int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(867041821);
        int i2 = (c2159.m2920(c1210) ? 4 : 2) | i | (c2159.m2920(c1197) ? 32 : 16) | (c2159.m2920(f) ? 256 : 128) | (c2159.m2920(f2) ? 2048 : 1024) | (c2159.m2920(interfaceC1157) ? 16384 : 8192);
        if (!c2159.m2903(i2 & 1, (i2 & 9363) != 9362)) {
            c2159.m2899();
        } else if (c1210.m1630()) {
            c1197.m1613(f, f2, interfaceC1157);
        } else {
            c1197.m1615(f2, interfaceC1157);
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1212(c1210, c1197, f, f2, interfaceC1157, i, 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C1196 m1570(InterfaceC1204 interfaceC1204, Object obj, Object obj2) {
        return new C1196(interfaceC1204, obj, (AbstractC1189) interfaceC1204.mo1622().invoke(obj2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C1196 m1571(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new C1196(f1468, Float.valueOf(f), new C1193(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C1177 m1572(float f) {
        return new C1177(Float.valueOf(f), f1468, Float.valueOf(0.01f), 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static C1208 m1573(int i, int i2, InterfaceC1181 interfaceC1181) {
        if ((i2 & 1) != 0) {
            i = 300;
        }
        int i3 = (i2 & 2) != 0 ? 0 : 90;
        if ((i2 & 4) != 0) {
            interfaceC1181 = AbstractC1182.f1487;
        }
        return new C1208(i, i3, interfaceC1181);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static C1145 m1574(float f, float f2, Object obj, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new C1145(f, f2, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final void m1575(C1191 c1191, C1196 c1196) {
        ((AbstractC2182) c1196.f1544).setValue(((AbstractC2182) c1191.f1528).getValue());
        AbstractC1189 abstractC1189 = c1196.f1545;
        AbstractC1189 abstractC11892 = c1191.f1527;
        int iMo1600 = abstractC1189.mo1600();
        for (int i = 0; i < iMo1600; i++) {
            abstractC1189.mo1597(abstractC11892.mo1601(i), i);
        }
        c1196.f1541 = c1191.f1533;
        c1196.f1542 = c1191.f1534;
        c1196.f1543 = ((Boolean) ((AbstractC2182) c1191.f1535).getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C1210 m1576(Object obj, String str, InterfaceC2208 interfaceC2208, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        C2159 c2159 = (C2159) interfaceC2208;
        Object objM2905 = c2159.m2905();
        C2188 c2188 = C2204.f4319;
        if (objM2905 == c2188) {
            objM2905 = new C1210(new C1148(obj), null, str);
            c2159.m2946(objM2905);
        }
        C1210 c1210 = (C1210) objM2905;
        c1210.m1628(obj, c2159, (i & 8) | 48 | (i & 14));
        Object objM29052 = c2159.m2905();
        if (objM29052 == c2188) {
            objM29052 = new C1209(c1210, 1);
            c2159.m2946(objM29052);
        }
        AbstractC2202.m3044(c1210, (InterfaceC7387) objM29052, c2159);
        return c1210;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C1200 m1577(C1210 c1210, InterfaceC1204 interfaceC1204, String str, InterfaceC2208 interfaceC2208, int i, int i2) {
        C1201 c1201;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zM2920 = ((C2159) interfaceC2208).m2920(c1210);
        C2159 c2159 = (C2159) interfaceC2208;
        Object objM2905 = c2159.m2905();
        C2188 c2188 = C2204.f4319;
        if (zM2920 || objM2905 == c2188) {
            objM2905 = new C1200(c1210, interfaceC1204, str);
            c2159.m2946(objM2905);
        }
        C1200 c1200 = (C1200) objM2905;
        boolean zM29202 = c2159.m2920(c1210) | c2159.m2938(c1200);
        Object objM29052 = c2159.m2905();
        if (zM29202 || objM29052 == c2188) {
            objM29052 = new C1218(c1210, c1200, 4);
            c2159.m2946(objM29052);
        }
        AbstractC2202.m3044(c1200, (InterfaceC7387) objM29052, c2159);
        if (c1210.m1630() && (c1201 = (C1201) ((AbstractC2182) c1200.f1563).getValue()) != null) {
            C1210 c12102 = c1200.f1562;
            c1201.f1568.m1613(c1201.f1567.invoke(c12102.m1623().mo1617()), c1201.f1567.invoke(c12102.m1623().mo1616()), (InterfaceC1157) c1201.f1566.invoke(c12102.m1623()));
        }
        return c1200;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static C1196 m1578(C1196 c1196, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = ((Number) ((AbstractC2182) c1196.f1544).getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((C1193) c1196.f1545).f1538;
        }
        return new C1196(c1196.f1546, Float.valueOf(f), new C1193(f2), c1196.f1542, c1196.f1541, c1196.f1543);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static C1152 m1579(InterfaceC1184 interfaceC1184, RepeatMode repeatMode, long j, int i) {
        if ((i & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        return new C1152(interfaceC1184, repeatMode, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C1210 m1580(AbstractC1207 abstractC1207, String str, InterfaceC2208 interfaceC2208, int i) {
        int i2 = 0;
        boolean z = (((i & 14) ^ 6) > 4 && ((C2159) interfaceC2208).m2920(abstractC1207)) || (i & 6) == 4;
        C2159 c2159 = (C2159) interfaceC2208;
        Object objM2905 = c2159.m2905();
        Object obj = C2204.f4319;
        if (z || objM2905 == obj) {
            AbstractC2121 abstractC2121M2791 = AbstractC2109.m2791();
            InterfaceC7387 interfaceC7387Mo2763 = abstractC2121M2791 != null ? abstractC2121M2791.mo2763() : null;
            AbstractC2121 abstractC2121M2803 = AbstractC2109.m2803(abstractC2121M2791);
            try {
                Object c1210 = new C1210(abstractC1207, null, str);
                AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
                c2159.m2946(c1210);
                objM2905 = c1210;
            } catch (Throwable th) {
                AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
                throw th;
            }
        }
        C1210 c12102 = (C1210) objM2905;
        c2159.m2952(-1356604288);
        c12102.m1628(((AbstractC2182) ((C1148) abstractC1207).f1378).getValue(), c2159, 0);
        c2159.m2937(false);
        boolean zM2920 = c2159.m2920(c12102);
        Object objM29052 = c2159.m2905();
        if (zM2920 || objM29052 == obj) {
            objM29052 = new C1209(c12102, i2);
            c2159.m2946(objM29052);
        }
        AbstractC2202.m3044(c12102, (InterfaceC7387) objM29052, c2159);
        return c12102;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final void m1581(C1191 c1191, long j, float f, InterfaceC1173 interfaceC1173, C1196 c1196, InterfaceC7387 interfaceC7387) {
        long jMo1563 = f == 0.0f ? interfaceC1173.mo1563() : (long) ((j - c1191.f1530) / f);
        c1191.f1534 = j;
        ((AbstractC2182) c1191.f1528).setValue(interfaceC1173.mo1559(jMo1563));
        c1191.f1527 = interfaceC1173.mo1561(jMo1563);
        if (interfaceC1173.m1560(jMo1563)) {
            c1191.f1533 = c1191.f1534;
            ((AbstractC2182) c1191.f1535).setValue(Boolean.FALSE);
        }
        m1575(c1191, c1196);
        interfaceC7387.invoke(c1191);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final float m1582(InterfaceC5192 interfaceC5192) {
        InterfaceC2959 interfaceC2959 = (InterfaceC2959) interfaceC5192.get(C2952.f6608);
        float fMo1846 = interfaceC2959 != null ? interfaceC2959.mo1846() : 1.0f;
        if (fMo1846 >= 0.0f) {
            return fMo1846;
        }
        AbstractC1146.m1488("negative scale factor");
        return fMo1846;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final Object m1583(C1196 c1196, InterfaceC1180 interfaceC1180, boolean z, InterfaceC7387 interfaceC7387, ContinuationImpl continuationImpl) {
        Object objM1568 = m1568(c1196, new C1188(interfaceC1180, c1196.f1546, ((AbstractC2182) c1196.f1544).getValue(), c1196.f1545), z ? c1196.f1542 : Long.MIN_VALUE, interfaceC7387, continuationImpl);
        return objM1568 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1568 : C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Object m1584(float f, float f2, InterfaceC1195 interfaceC1195, InterfaceC7383 interfaceC7383, SuspendLambda suspendLambda, int i) {
        if ((i & 8) != 0) {
            interfaceC1195 = m1574(0.0f, 0.0f, null, 7);
        }
        Object objM1567 = m1567(f1468, new Float(f), new Float(f2), new Float(0.0f), interfaceC1195, interfaceC7383, suspendLambda);
        return objM1567 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1567 : C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static /* synthetic */ Object m1585(C1196 c1196, Object obj, InterfaceC1195 interfaceC1195, boolean z, InterfaceC7387 interfaceC7387, ContinuationImpl continuationImpl, int i) {
        if ((i & 2) != 0) {
            interfaceC1195 = m1574(0.0f, 0.0f, null, 7);
        }
        InterfaceC1195 interfaceC11952 = interfaceC1195;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            interfaceC7387 = new C0863(1);
        }
        return m1588(c1196, obj, interfaceC11952, z2, interfaceC7387, continuationImpl);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final AbstractC1189 m1586(AbstractC1189 abstractC1189) {
        AbstractC1189 abstractC1189Mo1599 = abstractC1189.mo1599();
        int iMo1600 = abstractC1189Mo1599.mo1600();
        for (int i = 0; i < iMo1600; i++) {
            abstractC1189Mo1599.mo1597(abstractC1189.mo1601(i), i);
        }
        return abstractC1189Mo1599;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C1162 m1587(C1161 c1161, float f, float f2, final C1152 c1152, InterfaceC2208 interfaceC2208) {
        final Float fValueOf = Float.valueOf(f);
        final Float fValueOf2 = Float.valueOf(f2);
        C2159 c2159 = (C2159) interfaceC2208;
        Object objM2905 = c2159.m2905();
        C2188 c2188 = C2204.f4319;
        if (objM2905 == c2188) {
            objM2905 = new C1162(c1161, fValueOf, fValueOf2, c1152);
            c2159.m2946(objM2905);
        }
        final C1162 c1162 = (C1162) objM2905;
        boolean zM2938 = c2159.m2938(c1152);
        Object objM29052 = c2159.m2905();
        if (zM2938 || objM29052 == c2188) {
            objM29052 = new InterfaceC7372() { // from class: androidx.compose.animation.core.飘花落叶言子世苏哲兰楪
                @Override // p068.InterfaceC7372
                public final Object invoke() {
                    C1162 c11622 = c1162;
                    Float f3 = c11622.f1413;
                    Float f4 = fValueOf;
                    boolean zEquals = f4.equals(f3);
                    Float f5 = fValueOf2;
                    if (!zEquals || !f5.equals(c11622.f1411)) {
                        c11622.f1413 = f4;
                        c11622.f1411 = f5;
                        c11622.f1407 = new C1220(c1152, AbstractC1176.f1468, f4, f5, null);
                        ((AbstractC2182) c11622.f1408.f1404).setValue(Boolean.TRUE);
                        c11622.f1406 = false;
                        c11622.f1409 = true;
                    }
                    return C6008.f15084;
                }
            };
            c2159.m2946(objM29052);
        }
        AbstractC2202.m3062((InterfaceC7372) objM29052, c2159);
        boolean zM29382 = c2159.m2938(c1161);
        Object objM29053 = c2159.m2905();
        if (zM29382 || objM29053 == c2188) {
            objM29053 = new C1218(c1161, 1, c1162);
            c2159.m2946(objM29053);
        }
        AbstractC2202.m3044(c1162, (InterfaceC7387) objM29053, c2159);
        return c1162;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final Object m1588(C1196 c1196, Object obj, InterfaceC1195 interfaceC1195, boolean z, InterfaceC7387 interfaceC7387, ContinuationImpl continuationImpl) {
        Object objM1568 = m1568(c1196, new C1220(interfaceC1195, c1196.f1546, ((AbstractC2182) c1196.f1544).getValue(), obj, c1196.f1545), z ? c1196.f1542 : Long.MIN_VALUE, interfaceC7387, continuationImpl);
        return objM1568 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1568 : C6008.f15084;
    }
}
