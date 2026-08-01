package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC2162;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2184;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1210 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f1587;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1210 f1588;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC1207 f1589;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC2230 f1590;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC2230 f1592;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final SnapshotStateList f1593;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final SnapshotStateList f1594;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC2230 f1586 = AbstractC2202.m3034(m1626());

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC2230 f1585 = AbstractC2202.m3034(new C1198(m1626(), m1626()));

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC2162 f1584 = AbstractC2202.m3036(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final AbstractC2162 f1591 = AbstractC2202.m3036(Long.MIN_VALUE);

    public C1210(AbstractC1207 abstractC1207, C1210 c1210, String str) {
        this.f1589 = abstractC1207;
        this.f1588 = c1210;
        this.f1587 = str;
        Boolean bool = Boolean.FALSE;
        this.f1590 = AbstractC2202.m3034(bool);
        this.f1593 = new SnapshotStateList();
        this.f1594 = new SnapshotStateList();
        this.f1592 = AbstractC2202.m3034(bool);
        AbstractC2202.m3056(new C1217(this, 1));
        abstractC1207.getClass();
    }

    public final String toString() {
        SnapshotStateList snapshotStateList = this.f1593;
        int size = snapshotStateList.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((C1197) snapshotStateList.get(i)) + ", ";
        }
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC1199 m1623() {
        return (InterfaceC1199) ((AbstractC2182) this.f1585).getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long m1624() {
        C1210 c1210 = this.f1588;
        return c1210 != null ? c1210.m1624() : this.f1584.m2957();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m1625() {
        SnapshotStateList snapshotStateList = this.f1593;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((C1197) snapshotStateList.get(i)).getClass();
        }
        SnapshotStateList snapshotStateList2 = this.f1594;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((C1210) snapshotStateList2.get(i2)).m1625()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m1626() {
        return ((AbstractC2182) ((C1148) this.f1589).f1379).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long m1627() {
        SnapshotStateList snapshotStateList = this.f1593;
        int size = snapshotStateList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((C1197) snapshotStateList.get(i)).f1550.m2957());
        }
        SnapshotStateList snapshotStateList2 = this.f1594;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((C1210) snapshotStateList2.get(i2)).m1627());
        }
        return jMax;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1628(Object obj, InterfaceC2208 interfaceC2208, int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c2159.m2920(obj) : c2159.m2938(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c2159.m2920(this) ? 32 : 16;
        }
        int i3 = 0;
        if (!c2159.m2903(i2 & 1, (i2 & 19) != 18)) {
            c2159.m2899();
        } else if (m1630()) {
            c2159.m2952(467722849);
            c2159.m2937(false);
        } else {
            c2159.m2952(466062241);
            m1631(obj);
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object objM2905 = c2159.m2905();
            C2188 c2188 = C2204.f4319;
            if (z || objM2905 == c2188) {
                objM2905 = AbstractC2202.m3056(new C1217(this, i3));
                c2159.m2946(objM2905);
            }
            if (((Boolean) ((InterfaceC2168) objM2905).getValue()).booleanValue()) {
                c2159.m2952(466470356);
                Object objM29052 = c2159.m2905();
                if (objM29052 == c2188) {
                    objM29052 = AbstractC2202.m3058(EmptyCoroutineContext.INSTANCE, c2159);
                    c2159.m2946(objM29052);
                }
                InterfaceC6233 interfaceC6233 = (InterfaceC6233) objM29052;
                boolean zM2938 = c2159.m2938(interfaceC6233) | (i4 == 32);
                Object objM29053 = c2159.m2905();
                if (zM2938 || objM29053 == c2188) {
                    objM29053 = new C1218(interfaceC6233, i3, this);
                    c2159.m2946(objM29053);
                }
                AbstractC2202.m3045(interfaceC6233, this, (InterfaceC7387) objM29053, c2159);
                c2159.m2937(false);
            } else {
                c2159.m2952(467712929);
                c2159.m2937(false);
            }
            c2159.m2937(false);
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1202(i, 0, this, obj);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m1629(long j, boolean z) {
        AbstractC2162 abstractC2162 = this.f1591;
        long jM2957 = abstractC2162.m2957();
        AbstractC1207 abstractC1207 = this.f1589;
        if (jM2957 == Long.MIN_VALUE) {
            abstractC2162.m2958(j);
            ((AbstractC2182) abstractC1207.f1578).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((AbstractC2182) abstractC1207.f1578).getValue()).booleanValue()) {
            ((AbstractC2182) abstractC1207.f1578).setValue(Boolean.TRUE);
        }
        ((AbstractC2182) this.f1590).setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.f1593;
        int size = snapshotStateList.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            C1197 c1197 = (C1197) snapshotStateList.get(i);
            InterfaceC2230 interfaceC2230 = c1197.f1551;
            InterfaceC2230 interfaceC22302 = c1197.f1551;
            if (!((Boolean) ((AbstractC2182) interfaceC2230).getValue()).booleanValue()) {
                long jMo1563 = z ? c1197.m1612().mo1563() : j;
                c1197.m1608(c1197.m1612().mo1559(jMo1563));
                c1197.f1554 = c1197.m1612().mo1561(jMo1563);
                if (c1197.m1612().m1560(jMo1563)) {
                    ((AbstractC2182) interfaceC22302).setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) ((AbstractC2182) interfaceC22302).getValue()).booleanValue()) {
                z2 = false;
            }
        }
        SnapshotStateList snapshotStateList2 = this.f1594;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C1210 c1210 = (C1210) snapshotStateList2.get(i2);
            if (!AbstractC5227.m9466(((AbstractC2182) c1210.f1586).getValue(), c1210.m1626())) {
                c1210.m1629(j, z);
            }
            if (!AbstractC5227.m9466(((AbstractC2182) c1210.f1586).getValue(), c1210.m1626())) {
                z2 = false;
            }
        }
        if (z2) {
            m1632();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m1630() {
        return ((Boolean) ((AbstractC2182) this.f1592).getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m1631(Object obj) {
        InterfaceC2230 interfaceC2230 = this.f1586;
        AbstractC2182 abstractC2182 = (AbstractC2182) interfaceC2230;
        if (AbstractC5227.m9466(abstractC2182.getValue(), obj)) {
            return;
        }
        ((AbstractC2182) this.f1585).setValue(new C1198(abstractC2182.getValue(), obj));
        if (!AbstractC5227.m9466(m1626(), abstractC2182.getValue())) {
            ((AbstractC2182) ((C1148) this.f1589).f1379).setValue(abstractC2182.getValue());
        }
        ((AbstractC2182) interfaceC2230).setValue(obj);
        if (this.f1591.m2957() == Long.MIN_VALUE) {
            ((AbstractC2182) this.f1590).setValue(Boolean.TRUE);
        }
        SnapshotStateList snapshotStateList = this.f1593;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC2184) ((C1197) snapshotStateList.get(i)).f1555).m2995(-2.0f);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m1632() {
        this.f1591.m2958(Long.MIN_VALUE);
        AbstractC1207 abstractC1207 = this.f1589;
        if (abstractC1207 instanceof C1148) {
            ((AbstractC2182) ((C1148) abstractC1207).f1379).setValue(((AbstractC2182) this.f1586).getValue());
        }
        if (this.f1588 == null) {
            this.f1584.m2958(0L);
        }
        ((AbstractC2182) abstractC1207.f1578).setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.f1594;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((C1210) snapshotStateList.get(i)).m1632();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m1633(Object obj, Object obj2) {
        this.f1591.m2958(Long.MIN_VALUE);
        AbstractC1207 abstractC1207 = this.f1589;
        ((AbstractC2182) abstractC1207.f1578).setValue(Boolean.FALSE);
        boolean zM1630 = m1630();
        InterfaceC2230 interfaceC2230 = this.f1586;
        if (!zM1630 || !AbstractC5227.m9466(m1626(), obj) || !AbstractC5227.m9466(((AbstractC2182) interfaceC2230).getValue(), obj2)) {
            if (!AbstractC5227.m9466(m1626(), obj) && (abstractC1207 instanceof C1148)) {
                ((AbstractC2182) ((C1148) abstractC1207).f1379).setValue(obj);
            }
            ((AbstractC2182) interfaceC2230).setValue(obj2);
            ((AbstractC2182) this.f1592).setValue(Boolean.TRUE);
            ((AbstractC2182) this.f1585).setValue(new C1198(obj, obj2));
        }
        SnapshotStateList snapshotStateList = this.f1594;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            C1210 c1210 = (C1210) snapshotStateList.get(i);
            c1210.getClass();
            if (c1210.m1630()) {
                c1210.m1633(c1210.m1626(), ((AbstractC2182) c1210.f1586).getValue());
            }
        }
        SnapshotStateList snapshotStateList2 = this.f1593;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((C1197) snapshotStateList2.get(i2)).m1609();
        }
    }
}
