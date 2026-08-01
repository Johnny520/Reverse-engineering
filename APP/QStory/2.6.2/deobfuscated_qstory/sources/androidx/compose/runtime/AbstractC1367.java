package androidx.compose.runtime;

import androidx.appcompat.app.C0108;
import androidx.appcompat.widget.C0194;
import androidx.compose.foundation.lazy.layout.C0707;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.runtime.composer.gapbuffer.C1230;
import androidx.compose.runtime.composer.gapbuffer.C1234;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.internal.C1249;
import androidx.compose.runtime.internal.C1253;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3054;
import java.util.ArrayList;
import java.util.List;
import kotlin.C5175;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4359;
import kotlin.jvm.internal.AbstractC4394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5450;
import kotlinx.coroutines.C5452;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.flow.C5283;
import kotlinx.coroutines.flow.C5295;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p126.C7422;
import p126.C7425;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1367 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final Object f3972 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C1318 f3970 = new C1318();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C0707 f3971 = new C0707(2);

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static final C1253 m2459(C0194[] c0194Arr, C1253 c1253, C1253 c12532) {
        C1253 c12533 = C1253.f3640;
        C1249 c1249 = new C1249(c12533);
        c1249.f3623 = c12533;
        for (C0194 c0194 : c0194Arr) {
            AbstractC1390 abstractC1390 = (AbstractC1390) c0194.f761;
            if (c0194.f762 || !c1253.containsKey(abstractC1390)) {
                c1249.put(abstractC1390, abstractC1390.m2521(c0194, (InterfaceC1325) c12532.get(abstractC1390)));
            }
        }
        return c1249.mo2162();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static final int m2460(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final C5283 m2461(InterfaceC6542 interfaceC6542) {
        return new C5283(new SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1(null, interfaceC6542, null));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final void m2462(C1235 c1235, int i, Object obj) {
        int iM2121 = c1235.m2121(i);
        Object[] objArr = c1235.f3566;
        Object obj2 = objArr[iM2121];
        objArr[iM2121] = C1369.f3973;
        if (obj == obj2) {
            return;
        }
        AbstractC1374.m2497("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final InterfaceC1395 m2463(Object obj, InterfaceC1373 interfaceC1373) {
        C1324 c1324 = (C1324) interfaceC1373;
        Object objM2335 = c1324.m2335();
        if (objM2335 == C1369.f3973) {
            objM2335 = m2465(obj);
            c1324.m2376(objM2335);
        }
        InterfaceC1395 interfaceC1395 = (InterfaceC1395) objM2335;
        interfaceC1395.setValue(obj);
        return interfaceC1395;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public static final void m2464(InterfaceC1373 interfaceC1373, Object obj, InterfaceC6553 interfaceC6553) {
        if (((C1324) interfaceC1373).f3837 || !AbstractC4394.m8917(((C1324) interfaceC1373).m2335(), obj)) {
            C1324 c1324 = (C1324) interfaceC1373;
            c1324.m2376(obj);
            c1324.m2354(obj, interfaceC6553);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static InterfaceC1395 m2465(Object obj) {
        return new ParcelableSnapshotMutableState(obj, C1353.f3921);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final InterfaceC1395 m2466(Object obj, C1353 c1353) {
        return new ParcelableSnapshotMutableState(obj, c1353);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final AbstractC1327 m2467(long j) {
        return new ParcelableSnapshotMutableLongState(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final InterfaceC1398 m2468(int i) {
        return new ParcelableSnapshotMutableIntState(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final InterfaceC1397 m2469(float f) {
        return new ParcelableSnapshotMutableFloatState(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final void m2470() {
        throw new IllegalStateException("Invalid applier");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final C1314 m2471(InterfaceC1373 interfaceC1373) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2327(Opcodes.DIV_DOUBLE_2ADDR, AbstractC1374.f3974);
        if (c1324.f3837) {
            C1235.m2079(c1324.f3851);
        }
        Object objM2338 = c1324.m2338();
        C1320 c1341 = objM2338 instanceof C1320 ? (C1320) objM2338 : null;
        if (c1341 == null) {
            c1341 = new C1341(new C1315(new C1314(c1324, c1324.f3836, c1324.f3870, c1324.f3845, c1324.f3874.f3952)), -1);
            c1324.m2375(c1341);
        }
        InterfaceC1339 interfaceC1339 = c1341.f3823;
        interfaceC1339.getClass();
        C1314 c1314 = ((C1315) interfaceC1339).f3817;
        ((AbstractC1347) c1314.f3810).setValue(c1324.m2371());
        c1324.m2367(false);
        return c1314;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final void m2472(InterfaceC1373 interfaceC1373, InterfaceC6557 interfaceC6557) {
        ((C1324) interfaceC1373).m2354(C5175.f14739, new C1326(interfaceC6557, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final Object m2473(C1253 c1253, AbstractC1390 abstractC1390) {
        abstractC1390.getClass();
        Object objMo2428 = c1253.get(abstractC1390);
        if (objMo2428 == null) {
            objMo2428 = abstractC1390.mo2428();
        }
        return ((InterfaceC1325) objMo2428).mo2296(c1253);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static final InterfaceC1395 m2474(InterfaceC1373 interfaceC1373, Object obj, InterfaceC6553 interfaceC6553) {
        C1324 c1324 = (C1324) interfaceC1373;
        Object objM2335 = c1324.m2335();
        C1353 c1353 = C1369.f3973;
        if (objM2335 == c1353) {
            objM2335 = m2465(obj);
            c1324.m2376(objM2335);
        }
        InterfaceC1395 interfaceC1395 = (InterfaceC1395) objM2335;
        boolean zM2368 = c1324.m2368(interfaceC6553);
        Object objM23352 = c1324.m2335();
        if (zM2368 || objM23352 == c1353) {
            objM23352 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(interfaceC6553, interfaceC1395, null);
            c1324.m2376(objM23352);
        }
        m2490(c1324, C5175.f14739, (InterfaceC6553) objM23352);
        return interfaceC1395;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m2475(Object obj, InterfaceC6557 interfaceC6557, InterfaceC1373 interfaceC1373) {
        C1324 c1324 = (C1324) interfaceC1373;
        boolean zM2350 = c1324.m2350(obj);
        Object objM2335 = c1324.m2335();
        if (zM2350 || objM2335 == C1369.f3973) {
            objM2335 = new C1359(interfaceC6557);
            c1324.m2376(objM2335);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m2476(Object obj, Object obj2, InterfaceC6557 interfaceC6557, InterfaceC1373 interfaceC1373) {
        C1324 c1324 = (C1324) interfaceC1373;
        boolean zM2350 = c1324.m2350(obj) | c1324.m2350(obj2);
        Object objM2335 = c1324.m2335();
        if (zM2350 || objM2335 == C1369.f3973) {
            objM2335 = new C1359(interfaceC6557);
            c1324.m2376(objM2335);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2477(androidx.appcompat.widget.C0194[] r10, p052.InterfaceC6553 r11, androidx.compose.runtime.InterfaceC1373 r12, int r13) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.AbstractC1367.m2477(androidx.appcompat.widget.飘花落叶言子楪兰哲苏世[], 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, androidx.compose.runtime.飘花落叶言子楪苏哲世兰, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2478(androidx.appcompat.widget.C0194 r11, p052.InterfaceC6553 r12, androidx.compose.runtime.InterfaceC1373 r13, int r14) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.AbstractC1367.m2478(androidx.appcompat.widget.飘花落叶言子楪兰哲苏世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, androidx.compose.runtime.飘花落叶言子楪苏哲世兰, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final int m2479(InterfaceC1373 interfaceC1373) {
        interfaceC1373.getClass();
        return Long.hashCode(((C1324) interfaceC1373).f3836);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final int m2480(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iM8915 = AbstractC4394.m8915(((C1309) list.get(i3)).f3799, i);
            if (iM8915 < 0) {
                i2 = i3 + 1;
            } else {
                if (iM8915 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final void m2481(InterfaceC1373 interfaceC1373, InterfaceC6557 interfaceC6557) {
        if (((C1324) interfaceC1373).f3837) {
            ((C1324) interfaceC1373).m2354(C5175.f14739, new C1326(interfaceC6557, 0));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final InterfaceC1304 m2482(InterfaceC4359 interfaceC4359) {
        InterfaceC1304 interfaceC1304 = (InterfaceC1304) interfaceC4359.get(C1353.f3923);
        if (interfaceC1304 != null) {
            return interfaceC1304;
        }
        C5919.m11250("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final void m2483(InterfaceC1373 interfaceC1373, Integer num, InterfaceC6553 interfaceC6553) {
        if (((C1324) interfaceC1373).f3837) {
            ((C1324) interfaceC1373).m2354(num, interfaceC6553);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final InterfaceC1395 m2484(C5295 c5295, C1324 c1324) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        Object value = c5295.f14880.getValue();
        boolean zM2368 = c1324.m2368(emptyCoroutineContext) | c1324.m2368(c5295);
        Object objM2335 = c1324.m2335();
        Object obj = C1369.f3973;
        if (zM2368 || objM2335 == obj) {
            objM2335 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(emptyCoroutineContext, c5295, null);
            c1324.m2376(objM2335);
        }
        InterfaceC6553 interfaceC6553 = (InterfaceC6553) objM2335;
        Object objM23352 = c1324.m2335();
        if (objM23352 == obj) {
            objM23352 = m2465(value);
            c1324.m2376(objM23352);
        }
        InterfaceC1395 interfaceC1395 = (InterfaceC1395) objM23352;
        boolean zM23682 = c1324.m2368(interfaceC6553);
        Object objM23353 = c1324.m2335();
        if (zM23682 || objM23353 == obj) {
            objM23353 = new SnapshotStateKt__ProduceStateKt$produceState$3$1(interfaceC6553, interfaceC1395, null);
            c1324.m2376(objM23353);
        }
        m2489(c5295, emptyCoroutineContext, (InterfaceC6553) objM23353, c1324);
        return interfaceC1395;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C1224 m2485() {
        C0108 c0108 = AbstractC1335.f3895;
        C1224 c1224 = (C1224) c0108.m391();
        if (c1224 != null) {
            return c1224;
        }
        C1224 c12242 = new C1224(0, new C1313[0]);
        c0108.m361(c12242);
        return c12242;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C1362 m2486(InterfaceC6542 interfaceC6542) {
        C0108 c0108 = AbstractC1335.f3896;
        return new C1362(interfaceC6542, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final void m2487(C1234 c1234, ArrayList arrayList, int i) {
        boolean zM2076 = c1234.m2076(i);
        int[] iArr = c1234.f3553;
        if (zM2076) {
            arrayList.add(c1234.m2067(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            m2487(c1234, arrayList, i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final InterfaceC5400 m2488(EmptyCoroutineContext emptyCoroutineContext, InterfaceC1373 interfaceC1373) {
        if (emptyCoroutineContext.get(C5452.f15105) == null) {
            return new C1344(((C1324) interfaceC1373).f3834, emptyCoroutineContext);
        }
        C5450 c5450M10484 = AbstractC5398.m10484();
        c5450M10484.m10550(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return AbstractC5398.m10485(c5450M10484);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final void m2489(Object obj, Object obj2, InterfaceC6553 interfaceC6553, InterfaceC1373 interfaceC1373) {
        InterfaceC4359 interfaceC4359 = ((C1324) interfaceC1373).f3834;
        C1324 c1324 = (C1324) interfaceC1373;
        boolean zM2350 = c1324.m2350(obj) | c1324.m2350(obj2);
        Object objM2335 = c1324.m2335();
        if (zM2350 || objM2335 == C1369.f3973) {
            objM2335 = new C1307(interfaceC4359, interfaceC6553);
            c1324.m2376(objM2335);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final void m2490(InterfaceC1373 interfaceC1373, Object obj, InterfaceC6553 interfaceC6553) {
        InterfaceC4359 interfaceC4359 = ((C1324) interfaceC1373).f3834;
        C1324 c1324 = (C1324) interfaceC1373;
        boolean zM2350 = c1324.m2350(obj);
        Object objM2335 = c1324.m2335();
        if (zM2350 || objM2335 == C1369.f3973) {
            objM2335 = new C1307(interfaceC4359, interfaceC6553);
            c1324.m2376(objM2335);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m2491(C1235 c1235, List list, C1363 c1363) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iM2106 = c1235.m2106((C1230) list.get(i));
            int iM2090 = c1235.m2090(c1235.f3567, c1235.m2118(iM2106));
            Object obj = iM2090 < c1235.m2122(c1235.f3567, c1235.m2118(iM2106 + 1)) ? c1235.f3566[c1235.m2121(iM2090)] : C1369.f3973;
            C1389 c1389 = obj instanceof C1389 ? (C1389) obj : null;
            if (c1389 != null) {
                c1389.f4036 = c1363;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final void m2492(InterfaceC6542 interfaceC6542, InterfaceC1373 interfaceC1373) {
        C7422 c7422 = ((C1324) interfaceC1373).f3843.f20149.f20157;
        c7422.m12623(C7425.f20131);
        AbstractC3054.m6592(c7422, 0, interfaceC6542);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final void m2493(List list, int i, int i2) {
        int iM2480 = m2480(i, list);
        if (iM2480 < 0) {
            iM2480 = -(iM2480 + 1);
        }
        while (iM2480 < list.size() && ((C1309) list.get(iM2480)).f3799 < i2) {
        }
    }
}
