package androidx.compose.animation.core;

import androidx.compose.foundation.layout.C1462;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2230;
import androidx.window.area.AbstractC3400;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1177 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C1150 f1469;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC2230 f1470;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC2230 f1471;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1196 f1472;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f1473;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1204 f1474;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AbstractC1189 f1475;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C1145 f1476;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public AbstractC1189 f1477;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AbstractC1189 f1478;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public AbstractC1189 f1479;

    public C1177(InterfaceC1204 interfaceC1204, Object obj, Object obj2) {
        this.f1474 = interfaceC1204;
        this.f1473 = obj2;
        C1196 c1196 = new C1196(interfaceC1204, obj, null, 60);
        this.f1472 = c1196;
        this.f1471 = AbstractC2202.m3034(Boolean.FALSE);
        this.f1470 = AbstractC2202.m3034(obj);
        this.f1469 = new C1150();
        this.f1476 = new C1145(obj2);
        AbstractC1189 abstractC1189 = c1196.f1545;
        boolean z = abstractC1189 instanceof C1193;
        AbstractC1189 abstractC11892 = z ? AbstractC1176.f1452 : abstractC1189 instanceof C1194 ? AbstractC1176.f1451 : abstractC1189 instanceof C1186 ? AbstractC1176.f1464 : AbstractC1176.f1463;
        this.f1475 = abstractC11892;
        AbstractC1189 abstractC11893 = z ? AbstractC1176.f1456 : abstractC1189 instanceof C1194 ? AbstractC1176.f1455 : abstractC1189 instanceof C1186 ? AbstractC1176.f1454 : AbstractC1176.f1453;
        this.f1478 = abstractC11893;
        this.f1479 = abstractC11892;
        this.f1477 = abstractC11893;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Object m1589(C1177 c1177, Object obj, InterfaceC1195 interfaceC1195, Object obj2, C1462 c1462, InterfaceC5189 interfaceC5189, int i) {
        if ((i & 2) != 0) {
            interfaceC1195 = c1177.f1476;
        }
        InterfaceC1195 interfaceC11952 = interfaceC1195;
        if ((i & 4) != 0) {
            obj2 = c1177.f1474.mo1621().invoke(c1177.f1472.f1545);
        }
        if ((i & 8) != 0) {
            c1462 = null;
        }
        Object objM1593 = c1177.m1593();
        InterfaceC1204 interfaceC1204 = c1177.f1474;
        return c1177.m1592(new C1220(interfaceC11952, interfaceC1204, objM1593, obj, (AbstractC1189) interfaceC1204.mo1622().invoke(obj2)), obj2, c1462, interfaceC5189);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m1590(C1177 c1177) {
        C1196 c1196 = c1177.f1472;
        c1196.f1545.mo1598();
        c1196.f1542 = Long.MIN_VALUE;
        ((AbstractC2182) c1177.f1471).setValue(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m1591(Object obj, InterfaceC5189 interfaceC5189) {
        Object objM1492 = C1150.m1492(this.f1469, new Animatable$snapTo$2(this, obj, null), interfaceC5189);
        return objM1492 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1492 : C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object m1592(InterfaceC1173 interfaceC1173, Object obj, InterfaceC7387 interfaceC7387, InterfaceC5189 interfaceC5189) {
        return C1150.m1492(this.f1469, new Animatable$runAnimation$2(this, obj, interfaceC1173, this.f1472.f1542, interfaceC7387, null), interfaceC5189);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m1593() {
        return ((AbstractC2182) this.f1472.f1544).getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m1594(Object obj) {
        if (!AbstractC5227.m9466(this.f1479, this.f1475) || !AbstractC5227.m9466(this.f1477, this.f1478)) {
            InterfaceC1204 interfaceC1204 = this.f1474;
            AbstractC1189 abstractC1189 = (AbstractC1189) interfaceC1204.mo1622().invoke(obj);
            int iMo1600 = abstractC1189.mo1600();
            boolean z = false;
            for (int i = 0; i < iMo1600; i++) {
                if (abstractC1189.mo1601(i) < this.f1479.mo1601(i) || abstractC1189.mo1601(i) > this.f1477.mo1601(i)) {
                    abstractC1189.mo1597(AbstractC3400.m5631(abstractC1189.mo1601(i), this.f1479.mo1601(i), this.f1477.mo1601(i)), i);
                    z = true;
                }
            }
            if (z) {
                return interfaceC1204.mo1621().invoke(abstractC1189);
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m1595(Float f, Float f2) {
        InterfaceC1204 interfaceC1204 = this.f1474;
        AbstractC1189 abstractC1189 = (AbstractC1189) interfaceC1204.mo1622().invoke(f);
        if (abstractC1189 == null) {
            abstractC1189 = this.f1475;
        }
        AbstractC1189 abstractC11892 = (AbstractC1189) interfaceC1204.mo1622().invoke(f2);
        if (abstractC11892 == null) {
            abstractC11892 = this.f1478;
        }
        int iMo1600 = abstractC1189.mo1600();
        for (int i = 0; i < iMo1600; i++) {
            if (abstractC1189.mo1601(i) > abstractC11892.mo1601(i)) {
                AbstractC1146.m1488("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + abstractC1189 + " is greater than upper bound " + abstractC11892 + " on index " + i);
            }
        }
        this.f1479 = abstractC1189;
        this.f1477 = abstractC11892;
        if (((Boolean) ((AbstractC2182) this.f1471).getValue()).booleanValue()) {
            return;
        }
        Object objM1594 = m1594(m1593());
        if (AbstractC5227.m9466(objM1594, m1593())) {
            return;
        }
        ((AbstractC2182) this.f1472.f1544).setValue(objM1594);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object m1596(SuspendLambda suspendLambda) {
        Object objM1492 = C1150.m1492(this.f1469, new Animatable$stop$2(this, null), suspendLambda);
        return objM1492 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1492 : C6008.f15084;
    }

    public /* synthetic */ C1177(Object obj, C1203 c1203, Object obj2, int i) {
        this(c1203, obj, (i & 4) != 0 ? null : obj2);
    }
}
