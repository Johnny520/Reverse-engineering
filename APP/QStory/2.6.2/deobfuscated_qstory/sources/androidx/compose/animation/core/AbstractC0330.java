package androidx.compose.animation.core;

import androidx.activity.C0016;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.C1369;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.snapshots.AbstractC1274;
import androidx.compose.runtime.snapshots.AbstractC1286;
import androidx.compose.ui.C2119;
import androidx.compose.ui.InterfaceC2126;
import kotlin.C5175;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0330 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0347 f1111 = new C0347(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0348 f1110 = new C0348(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C0340 f1109 = new C0340(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C0339 f1108 = new C0339(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C0347 f1107 = new C0347(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C0348 f1106 = new C0348(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C0340 f1119 = new C0340(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C0339 f1118 = new C0339(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final float[] f1122 = new float[91];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C0357 f1123 = new C0357(new C0016(2), new C0016(19));

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C0357 f1120 = new C0357(new C0016(3), new C0016(4));

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C0357 f1121 = new C0357(new C0016(5), new C0016(6));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C0357 f1113 = new C0357(new C0016(7), new C0016(8));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C0357 f1112 = new C0357(new C0016(9), new C0016(10));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C0357 f1116 = new C0357(new C0016(11), new C0016(12));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C0357 f1117 = new C0357(new C0016(13), new C0016(14));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C0357 f1114 = new C0357(new C0016(15), new C0016(16));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C0357 f1115 = new C0357(new C0016(17), new C0016(18));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Object m1006(C0357 c0357, Object obj, Object obj2, Float f, InterfaceC0349 interfaceC0349, InterfaceC6553 interfaceC6553, SuspendLambda suspendLambda) {
        AbstractC0343 abstractC0343Mo1038;
        InterfaceC6557 interfaceC6557 = c0357.f1229;
        if (f == null || (abstractC0343Mo1038 = (AbstractC0343) interfaceC6557.invoke(f)) == null) {
            abstractC0343Mo1038 = ((AbstractC0343) interfaceC6557.invoke(obj)).mo1038();
        }
        AbstractC0343 abstractC0343 = abstractC0343Mo1038;
        Object objM1007 = m1007(new C0350(c0357, obj, abstractC0343, 56), new C0374(interfaceC0349, c0357, obj, obj2, abstractC0343), Long.MIN_VALUE, new C0372(interfaceC6553, 2, c0357), suspendLambda);
        return objM1007 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1007 : C5175.f14739;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r14v0, types: [T, androidx.compose.animation.core.飘花落叶言子楪苏世兰哲] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1007(androidx.compose.animation.core.C0350 r24, androidx.compose.animation.core.InterfaceC0327 r25, long r26, final p052.InterfaceC6557 r28, kotlin.coroutines.jvm.internal.ContinuationImpl r29) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AbstractC0330.m1007(androidx.compose.animation.core.飘花落叶言子楪苏哲兰世, androidx.compose.animation.core.飘花落叶言子楪世兰哲苏, long, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m1008(C0364 c0364, C0351 c0351, Float f, Float f2, InterfaceC0311 interfaceC0311, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(867041821);
        int i2 = (c1324.m2350(c0364) ? 4 : 2) | i | (c1324.m2350(c0351) ? 32 : 16) | (c1324.m2350(f) ? 256 : 128) | (c1324.m2350(f2) ? 2048 : 1024) | (c1324.m2350(interfaceC0311) ? 16384 : 8192);
        if (!c1324.m2333(i2 & 1, (i2 & 9363) != 9362)) {
            c1324.m2329();
        } else if (c0364.m1069()) {
            c0351.m1052(f, f2, interfaceC0311);
        } else {
            c0351.m1054(f2, interfaceC0311);
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0366(c0364, c0351, f, f2, interfaceC0311, i, 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C0350 m1009(InterfaceC0358 interfaceC0358, Object obj, Object obj2) {
        return new C0350(interfaceC0358, obj, (AbstractC0343) interfaceC0358.mo1061().invoke(obj2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C0350 m1010(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new C0350(f1123, Float.valueOf(f), new C0347(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C0331 m1011(float f) {
        return new C0331(Float.valueOf(f), f1123, Float.valueOf(0.01f), 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static C0362 m1012(int i, int i2, InterfaceC0335 interfaceC0335) {
        if ((i2 & 1) != 0) {
            i = 300;
        }
        int i3 = (i2 & 2) != 0 ? 0 : 90;
        if ((i2 & 4) != 0) {
            interfaceC0335 = AbstractC0336.f1142;
        }
        return new C0362(i, i3, interfaceC0335);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static C0299 m1013(float f, float f2, Object obj, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new C0299(f, f2, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final void m1014(C0345 c0345, C0350 c0350) {
        ((AbstractC1347) c0350.f1199).setValue(((AbstractC1347) c0345.f1183).getValue());
        AbstractC0343 abstractC0343 = c0350.f1200;
        AbstractC0343 abstractC03432 = c0345.f1182;
        int iMo1039 = abstractC0343.mo1039();
        for (int i = 0; i < iMo1039; i++) {
            abstractC0343.mo1036(abstractC03432.mo1040(i), i);
        }
        c0350.f1196 = c0345.f1188;
        c0350.f1197 = c0345.f1189;
        c0350.f1198 = ((Boolean) ((AbstractC1347) c0345.f1190).getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C0364 m1015(Object obj, String str, InterfaceC1373 interfaceC1373, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        C1324 c1324 = (C1324) interfaceC1373;
        Object objM2335 = c1324.m2335();
        C1353 c1353 = C1369.f3973;
        if (objM2335 == c1353) {
            objM2335 = new C0364(new C0302(obj), null, str);
            c1324.m2376(objM2335);
        }
        C0364 c0364 = (C0364) objM2335;
        c0364.m1067(obj, c1324, (i & 8) | 48 | (i & 14));
        Object objM23352 = c1324.m2335();
        if (objM23352 == c1353) {
            objM23352 = new C0363(c0364, 1);
            c1324.m2376(objM23352);
        }
        AbstractC1367.m2475(c0364, (InterfaceC6557) objM23352, c1324);
        return c0364;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C0354 m1016(C0364 c0364, InterfaceC0358 interfaceC0358, String str, InterfaceC1373 interfaceC1373, int i, int i2) {
        C0355 c0355;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zM2350 = ((C1324) interfaceC1373).m2350(c0364);
        C1324 c1324 = (C1324) interfaceC1373;
        Object objM2335 = c1324.m2335();
        C1353 c1353 = C1369.f3973;
        if (zM2350 || objM2335 == c1353) {
            objM2335 = new C0354(c0364, interfaceC0358, str);
            c1324.m2376(objM2335);
        }
        C0354 c0354 = (C0354) objM2335;
        boolean zM23502 = c1324.m2350(c0364) | c1324.m2368(c0354);
        Object objM23352 = c1324.m2335();
        if (zM23502 || objM23352 == c1353) {
            objM23352 = new C0372(c0364, c0354, 4);
            c1324.m2376(objM23352);
        }
        AbstractC1367.m2475(c0354, (InterfaceC6557) objM23352, c1324);
        if (c0364.m1069() && (c0355 = (C0355) ((AbstractC1347) c0354.f1218).getValue()) != null) {
            C0364 c03642 = c0354.f1217;
            c0355.f1223.m1052(c0355.f1222.invoke(c03642.m1062().mo1056()), c0355.f1222.invoke(c03642.m1062().mo1055()), (InterfaceC0311) c0355.f1221.invoke(c03642.m1062()));
        }
        return c0354;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static C0350 m1017(C0350 c0350, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = ((Number) ((AbstractC1347) c0350.f1199).getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((C0347) c0350.f1200).f1193;
        }
        return new C0350(c0350.f1201, Float.valueOf(f), new C0347(f2), c0350.f1197, c0350.f1196, c0350.f1198);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static C0306 m1018(InterfaceC0338 interfaceC0338, RepeatMode repeatMode, long j, int i) {
        if ((i & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        return new C0306(interfaceC0338, repeatMode, j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C0364 m1019(AbstractC0361 abstractC0361, String str, InterfaceC1373 interfaceC1373, int i) {
        int i2 = 0;
        boolean z = (((i & 14) ^ 6) > 4 && ((C1324) interfaceC1373).m2350(abstractC0361)) || (i & 6) == 4;
        C1324 c1324 = (C1324) interfaceC1373;
        Object objM2335 = c1324.m2335();
        Object obj = C1369.f3973;
        if (z || objM2335 == obj) {
            AbstractC1286 abstractC1286M2221 = AbstractC1274.m2221();
            InterfaceC6557 interfaceC6557Mo2193 = abstractC1286M2221 != null ? abstractC1286M2221.mo2193() : null;
            AbstractC1286 abstractC1286M2233 = AbstractC1274.m2233(abstractC1286M2221);
            try {
                Object c0364 = new C0364(abstractC0361, null, str);
                AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
                c1324.m2376(c0364);
                objM2335 = c0364;
            } catch (Throwable th) {
                AbstractC1274.m2227(abstractC1286M2221, abstractC1286M2233, interfaceC6557Mo2193);
                throw th;
            }
        }
        C0364 c03642 = (C0364) objM2335;
        c1324.m2382(-1356604288);
        c03642.m1067(((AbstractC1347) ((C0302) abstractC0361).f1033).getValue(), c1324, 0);
        c1324.m2367(false);
        boolean zM2350 = c1324.m2350(c03642);
        Object objM23352 = c1324.m2335();
        if (zM2350 || objM23352 == obj) {
            objM23352 = new C0363(c03642, i2);
            c1324.m2376(objM23352);
        }
        AbstractC1367.m2475(c03642, (InterfaceC6557) objM23352, c1324);
        return c03642;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final void m1020(C0345 c0345, long j, float f, InterfaceC0327 interfaceC0327, C0350 c0350, InterfaceC6557 interfaceC6557) {
        long jMo1002 = f == 0.0f ? interfaceC0327.mo1002() : (long) ((j - c0345.f1185) / f);
        c0345.f1189 = j;
        ((AbstractC1347) c0345.f1183).setValue(interfaceC0327.mo998(jMo1002));
        c0345.f1182 = interfaceC0327.mo1000(jMo1002);
        if (interfaceC0327.m999(jMo1002)) {
            c0345.f1188 = c0345.f1189;
            ((AbstractC1347) c0345.f1190).setValue(Boolean.FALSE);
        }
        m1014(c0345, c0350);
        interfaceC6557.invoke(c0345);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final float m1021(InterfaceC4359 interfaceC4359) {
        InterfaceC2126 interfaceC2126 = (InterfaceC2126) interfaceC4359.get(C2119.f6262);
        float fMo1276 = interfaceC2126 != null ? interfaceC2126.mo1276() : 1.0f;
        if (fMo1276 >= 0.0f) {
            return fMo1276;
        }
        AbstractC0300.m927("negative scale factor");
        return fMo1276;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final Object m1022(C0350 c0350, InterfaceC0334 interfaceC0334, boolean z, InterfaceC6557 interfaceC6557, ContinuationImpl continuationImpl) {
        Object objM1007 = m1007(c0350, new C0342(interfaceC0334, c0350.f1201, ((AbstractC1347) c0350.f1199).getValue(), c0350.f1200), z ? c0350.f1197 : Long.MIN_VALUE, interfaceC6557, continuationImpl);
        return objM1007 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1007 : C5175.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static Object m1023(float f, float f2, InterfaceC0349 interfaceC0349, InterfaceC6553 interfaceC6553, SuspendLambda suspendLambda, int i) {
        if ((i & 8) != 0) {
            interfaceC0349 = m1013(0.0f, 0.0f, null, 7);
        }
        Object objM1006 = m1006(f1123, new Float(f), new Float(f2), new Float(0.0f), interfaceC0349, interfaceC6553, suspendLambda);
        return objM1006 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1006 : C5175.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static /* synthetic */ Object m1024(C0350 c0350, Object obj, InterfaceC0349 interfaceC0349, boolean z, InterfaceC6557 interfaceC6557, ContinuationImpl continuationImpl, int i) {
        if ((i & 2) != 0) {
            interfaceC0349 = m1013(0.0f, 0.0f, null, 7);
        }
        InterfaceC0349 interfaceC03492 = interfaceC0349;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            interfaceC6557 = new C0016(1);
        }
        return m1027(c0350, obj, interfaceC03492, z2, interfaceC6557, continuationImpl);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final AbstractC0343 m1025(AbstractC0343 abstractC0343) {
        AbstractC0343 abstractC0343Mo1038 = abstractC0343.mo1038();
        int iMo1039 = abstractC0343Mo1038.mo1039();
        for (int i = 0; i < iMo1039; i++) {
            abstractC0343Mo1038.mo1036(abstractC0343.mo1040(i), i);
        }
        return abstractC0343Mo1038;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C0316 m1026(C0315 c0315, float f, float f2, final C0306 c0306, InterfaceC1373 interfaceC1373) {
        final Float fValueOf = Float.valueOf(f);
        final Float fValueOf2 = Float.valueOf(f2);
        C1324 c1324 = (C1324) interfaceC1373;
        Object objM2335 = c1324.m2335();
        C1353 c1353 = C1369.f3973;
        if (objM2335 == c1353) {
            objM2335 = new C0316(c0315, fValueOf, fValueOf2, c0306);
            c1324.m2376(objM2335);
        }
        final C0316 c0316 = (C0316) objM2335;
        boolean zM2368 = c1324.m2368(c0306);
        Object objM23352 = c1324.m2335();
        if (zM2368 || objM23352 == c1353) {
            objM23352 = new InterfaceC6542() { // from class: androidx.compose.animation.core.飘花落叶言子世苏哲兰楪
                @Override // p052.InterfaceC6542
                public final Object invoke() {
                    C0316 c03162 = c0316;
                    Float f3 = c03162.f1068;
                    Float f4 = fValueOf;
                    boolean zEquals = f4.equals(f3);
                    Float f5 = fValueOf2;
                    if (!zEquals || !f5.equals(c03162.f1066)) {
                        c03162.f1068 = f4;
                        c03162.f1066 = f5;
                        c03162.f1062 = new C0374(c0306, AbstractC0330.f1123, f4, f5, null);
                        ((AbstractC1347) c03162.f1063.f1059).setValue(Boolean.TRUE);
                        c03162.f1061 = false;
                        c03162.f1064 = true;
                    }
                    return C5175.f14739;
                }
            };
            c1324.m2376(objM23352);
        }
        AbstractC1367.m2492((InterfaceC6542) objM23352, c1324);
        boolean zM23682 = c1324.m2368(c0315);
        Object objM23353 = c1324.m2335();
        if (zM23682 || objM23353 == c1353) {
            objM23353 = new C0372(c0315, 1, c0316);
            c1324.m2376(objM23353);
        }
        AbstractC1367.m2475(c0316, (InterfaceC6557) objM23353, c1324);
        return c0316;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final Object m1027(C0350 c0350, Object obj, InterfaceC0349 interfaceC0349, boolean z, InterfaceC6557 interfaceC6557, ContinuationImpl continuationImpl) {
        Object objM1007 = m1007(c0350, new C0374(interfaceC0349, c0350.f1201, ((AbstractC1347) c0350.f1199).getValue(), obj, c0350.f1200), z ? c0350.f1197 : Long.MIN_VALUE, interfaceC6557, continuationImpl);
        return objM1007 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1007 : C5175.f14739;
    }
}
