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
import java.util.ArrayList;
import java.util.List;
import kotlin.C5176;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4360;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5451;
import kotlinx.coroutines.C5453;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.flow.C5284;
import kotlinx.coroutines.flow.C5296;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p126.C7423;
import p126.C7426;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1367 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final Object f3973 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C1318 f3971 = new C1318();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C0707 f3972 = new C0707(2);

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static final C1253 m2469(C0194[] c0194Arr, C1253 c1253, C1253 c12532) {
        C1253 c12533 = C1253.f3641;
        C1249 c1249 = new C1249(c12533);
        c1249.f3624 = c12533;
        for (C0194 c0194 : c0194Arr) {
            AbstractC1390 abstractC1390 = (AbstractC1390) c0194.f761;
            if (c0194.f762 || !c1253.containsKey(abstractC1390)) {
                c1249.put(abstractC1390, abstractC1390.m2531(c0194, (InterfaceC1325) c12532.get(abstractC1390)));
            }
        }
        return c1249.mo2172();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static final C5284 m2470(InterfaceC6543 interfaceC6543) {
        return new C5284(new SnapshotStateKt__SnapshotFlowKt$snapshotFlowImpl$1(null, interfaceC6543, null));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static final int m2471(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final void m2472(InterfaceC1373 interfaceC1373, Object obj, InterfaceC6554 interfaceC6554) {
        if (((C1324) interfaceC1373).f3838 || !AbstractC4395.m8907(((C1324) interfaceC1373).m2345(), obj)) {
            C1324 c1324 = (C1324) interfaceC1373;
            c1324.m2386(obj);
            c1324.m2364(obj, interfaceC6554);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public static final void m2473(C1235 c1235, int i, Object obj) {
        int iM2131 = c1235.m2131(i);
        Object[] objArr = c1235.f3567;
        Object obj2 = objArr[iM2131];
        objArr[iM2131] = C1369.f3974;
        if (obj == obj2) {
            return;
        }
        AbstractC1374.m2507("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static InterfaceC1395 m2474(Object obj) {
        return new ParcelableSnapshotMutableState(obj, C1353.f3922);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static final InterfaceC1395 m2475(Object obj, C1353 c1353) {
        return new ParcelableSnapshotMutableState(obj, c1353);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final AbstractC1327 m2476(long j) {
        return new ParcelableSnapshotMutableLongState(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final InterfaceC1398 m2477(int i) {
        return new ParcelableSnapshotMutableIntState(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final InterfaceC1397 m2478(float f) {
        return new ParcelableSnapshotMutableFloatState(f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public static final InterfaceC1395 m2479(Object obj, InterfaceC1373 interfaceC1373) {
        C1324 c1324 = (C1324) interfaceC1373;
        Object objM2345 = c1324.m2345();
        if (objM2345 == C1369.f3974) {
            objM2345 = m2474(obj);
            c1324.m2386(objM2345);
        }
        InterfaceC1395 interfaceC1395 = (InterfaceC1395) objM2345;
        interfaceC1395.setValue(obj);
        return interfaceC1395;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static final C1314 m2480(InterfaceC1373 interfaceC1373) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2337(Opcodes.DIV_DOUBLE_2ADDR, AbstractC1374.f3975);
        if (c1324.f3838) {
            C1235.m2089(c1324.f3852);
        }
        Object objM2348 = c1324.m2348();
        C1320 c1341 = objM2348 instanceof C1320 ? (C1320) objM2348 : null;
        if (c1341 == null) {
            c1341 = new C1341(new C1315(new C1314(c1324, c1324.f3837, c1324.f3871, c1324.f3846, c1324.f3875.f3953)), -1);
            c1324.m2385(c1341);
        }
        InterfaceC1339 interfaceC1339 = c1341.f3824;
        interfaceC1339.getClass();
        C1314 c1314 = ((C1315) interfaceC1339).f3818;
        ((AbstractC1347) c1314.f3811).setValue(c1324.m2381());
        c1324.m2377(false);
        return c1314;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static final void m2481(InterfaceC1373 interfaceC1373, InterfaceC6558 interfaceC6558) {
        ((C1324) interfaceC1373).m2364(C5176.f14739, new C1326(interfaceC6558, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static final Object m2482(C1253 c1253, AbstractC1390 abstractC1390) {
        abstractC1390.getClass();
        Object objMo2438 = c1253.get(abstractC1390);
        if (objMo2438 == null) {
            objMo2438 = abstractC1390.mo2438();
        }
        return ((InterfaceC1325) objMo2438).mo2306(c1253);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final InterfaceC1395 m2483(InterfaceC1373 interfaceC1373, Object obj, InterfaceC6554 interfaceC6554) {
        C1324 c1324 = (C1324) interfaceC1373;
        Object objM2345 = c1324.m2345();
        C1353 c1353 = C1369.f3974;
        if (objM2345 == c1353) {
            objM2345 = m2474(obj);
            c1324.m2386(objM2345);
        }
        InterfaceC1395 interfaceC1395 = (InterfaceC1395) objM2345;
        boolean zM2378 = c1324.m2378(interfaceC6554);
        Object objM23452 = c1324.m2345();
        if (zM2378 || objM23452 == c1353) {
            objM23452 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(interfaceC6554, interfaceC1395, null);
            c1324.m2386(objM23452);
        }
        m2500(c1324, C5176.f14739, (InterfaceC6554) objM23452);
        return interfaceC1395;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m2484(Object obj, InterfaceC6558 interfaceC6558, InterfaceC1373 interfaceC1373) {
        C1324 c1324 = (C1324) interfaceC1373;
        boolean zM2360 = c1324.m2360(obj);
        Object objM2345 = c1324.m2345();
        if (zM2360 || objM2345 == C1369.f3974) {
            objM2345 = new C1359(interfaceC6558);
            c1324.m2386(objM2345);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m2485(Object obj, Object obj2, InterfaceC6558 interfaceC6558, InterfaceC1373 interfaceC1373) {
        C1324 c1324 = (C1324) interfaceC1373;
        boolean zM2360 = c1324.m2360(obj) | c1324.m2360(obj2);
        Object objM2345 = c1324.m2345();
        if (zM2360 || objM2345 == C1369.f3974) {
            objM2345 = new C1359(interfaceC6558);
            c1324.m2386(objM2345);
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
    public static final void m2486(androidx.appcompat.widget.C0194[] r10, p052.InterfaceC6554 r11, androidx.compose.runtime.InterfaceC1373 r12, int r13) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.AbstractC1367.m2486(androidx.appcompat.widget.飘花落叶言子楪兰哲苏世[], 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, androidx.compose.runtime.飘花落叶言子楪苏哲世兰, int):void");
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
    public static final void m2487(androidx.appcompat.widget.C0194 r11, p052.InterfaceC6554 r12, androidx.compose.runtime.InterfaceC1373 r13, int r14) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.AbstractC1367.m2487(androidx.appcompat.widget.飘花落叶言子楪兰哲苏世, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, androidx.compose.runtime.飘花落叶言子楪苏哲世兰, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final int m2488(InterfaceC1373 interfaceC1373) {
        interfaceC1373.getClass();
        return Long.hashCode(((C1324) interfaceC1373).f3837);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final int m2489(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iM8905 = AbstractC4395.m8905(((C1309) list.get(i3)).f3800, i);
            if (iM8905 < 0) {
                i2 = i3 + 1;
            } else {
                if (iM8905 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final void m2490(InterfaceC1373 interfaceC1373, InterfaceC6558 interfaceC6558) {
        if (((C1324) interfaceC1373).f3838) {
            ((C1324) interfaceC1373).m2364(C5176.f14739, new C1326(interfaceC6558, 0));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final void m2491() {
        throw new IllegalStateException("Invalid applier");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final InterfaceC1304 m2492(InterfaceC4360 interfaceC4360) {
        InterfaceC1304 interfaceC1304 = (InterfaceC1304) interfaceC4360.get(C1353.f3924);
        if (interfaceC1304 != null) {
            return interfaceC1304;
        }
        C5925.m11311("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final void m2493(InterfaceC1373 interfaceC1373, Integer num, InterfaceC6554 interfaceC6554) {
        if (((C1324) interfaceC1373).f3838) {
            ((C1324) interfaceC1373).m2364(num, interfaceC6554);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final InterfaceC1395 m2494(C5296 c5296, C1324 c1324) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        Object value = c5296.f14880.getValue();
        boolean zM2378 = c1324.m2378(emptyCoroutineContext) | c1324.m2378(c5296);
        Object objM2345 = c1324.m2345();
        Object obj = C1369.f3974;
        if (zM2378 || objM2345 == obj) {
            objM2345 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(emptyCoroutineContext, c5296, null);
            c1324.m2386(objM2345);
        }
        InterfaceC6554 interfaceC6554 = (InterfaceC6554) objM2345;
        Object objM23452 = c1324.m2345();
        if (objM23452 == obj) {
            objM23452 = m2474(value);
            c1324.m2386(objM23452);
        }
        InterfaceC1395 interfaceC1395 = (InterfaceC1395) objM23452;
        boolean zM23782 = c1324.m2378(interfaceC6554);
        Object objM23453 = c1324.m2345();
        if (zM23782 || objM23453 == obj) {
            objM23453 = new SnapshotStateKt__ProduceStateKt$produceState$3$1(interfaceC6554, interfaceC1395, null);
            c1324.m2386(objM23453);
        }
        m2499(c5296, emptyCoroutineContext, (InterfaceC6554) objM23453, c1324);
        return interfaceC1395;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C1224 m2495() {
        C0108 c0108 = AbstractC1335.f3896;
        C1224 c1224 = (C1224) c0108.m393();
        if (c1224 != null) {
            return c1224;
        }
        C1224 c12242 = new C1224(0, new C1313[0]);
        c0108.m362(c12242);
        return c12242;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C1362 m2496(InterfaceC6543 interfaceC6543) {
        C0108 c0108 = AbstractC1335.f3897;
        return new C1362(interfaceC6543, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final void m2497(C1234 c1234, ArrayList arrayList, int i) {
        boolean zM2086 = c1234.m2086(i);
        int[] iArr = c1234.f3554;
        if (zM2086) {
            arrayList.add(c1234.m2077(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            m2497(c1234, arrayList, i3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final InterfaceC5401 m2498(EmptyCoroutineContext emptyCoroutineContext, InterfaceC1373 interfaceC1373) {
        if (emptyCoroutineContext.get(C5453.f15105) == null) {
            return new C1344(((C1324) interfaceC1373).f3835, emptyCoroutineContext);
        }
        C5451 c5451M10488 = AbstractC5399.m10488();
        c5451M10488.m10554(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return AbstractC5399.m10489(c5451M10488);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final void m2499(Object obj, Object obj2, InterfaceC6554 interfaceC6554, InterfaceC1373 interfaceC1373) {
        InterfaceC4360 interfaceC4360 = ((C1324) interfaceC1373).f3835;
        C1324 c1324 = (C1324) interfaceC1373;
        boolean zM2360 = c1324.m2360(obj) | c1324.m2360(obj2);
        Object objM2345 = c1324.m2345();
        if (zM2360 || objM2345 == C1369.f3974) {
            objM2345 = new C1307(interfaceC4360, interfaceC6554);
            c1324.m2386(objM2345);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final void m2500(InterfaceC1373 interfaceC1373, Object obj, InterfaceC6554 interfaceC6554) {
        InterfaceC4360 interfaceC4360 = ((C1324) interfaceC1373).f3835;
        C1324 c1324 = (C1324) interfaceC1373;
        boolean zM2360 = c1324.m2360(obj);
        Object objM2345 = c1324.m2345();
        if (zM2360 || objM2345 == C1369.f3974) {
            objM2345 = new C1307(interfaceC4360, interfaceC6554);
            c1324.m2386(objM2345);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m2501(C1235 c1235, List list, C1363 c1363) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iM2116 = c1235.m2116((C1230) list.get(i));
            int iM2100 = c1235.m2100(c1235.f3568, c1235.m2128(iM2116));
            Object obj = iM2100 < c1235.m2132(c1235.f3568, c1235.m2128(iM2116 + 1)) ? c1235.f3567[c1235.m2131(iM2100)] : C1369.f3974;
            C1389 c1389 = obj instanceof C1389 ? (C1389) obj : null;
            if (c1389 != null) {
                c1389.f4037 = c1363;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final void m2502(InterfaceC6543 interfaceC6543, InterfaceC1373 interfaceC1373) {
        C7423 c7423 = ((C1324) interfaceC1373).f3844.f20144.f20152;
        c7423.m12652(C7426.f20126);
        AbstractC4922.m9866(c7423, 0, interfaceC6543);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final void m2503(List list, int i, int i2) {
        int iM2489 = m2489(i, list);
        if (iM2489 < 0) {
            iM2489 = -(iM2489 + 1);
        }
        while (iM2489 < list.size() && ((C1309) list.get(iM2489)).f3800 < i2) {
        }
    }
}
