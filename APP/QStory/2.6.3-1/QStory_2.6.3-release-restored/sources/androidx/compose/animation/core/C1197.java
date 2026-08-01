package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC2162;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2184;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.InterfaceC2232;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1197 implements InterfaceC2168 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ C1210 f1547;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C1145 f1548;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f1549;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC2162 f1550;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC2230 f1551;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC2230 f1552;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC2230 f1553;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public AbstractC1189 f1554;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC2232 f1555;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f1556;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC2230 f1557;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC2230 f1558;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC1204 f1559;

    public C1197(C1210 c1210, Object obj, AbstractC1189 abstractC1189, InterfaceC1204 interfaceC1204) {
        this.f1547 = c1210;
        this.f1559 = interfaceC1204;
        InterfaceC2230 interfaceC2230M3034 = AbstractC2202.m3034(obj);
        this.f1557 = interfaceC2230M3034;
        Object objInvoke = null;
        this.f1558 = AbstractC2202.m3034(AbstractC1176.m1574(0.0f, 0.0f, null, 7));
        this.f1552 = AbstractC2202.m3034(new C1220(m1611(), interfaceC1204, obj, ((AbstractC2182) interfaceC2230M3034).getValue(), abstractC1189));
        this.f1551 = AbstractC2202.m3034(Boolean.TRUE);
        this.f1555 = AbstractC2202.m3038(-1.0f);
        this.f1553 = AbstractC2202.m3034(obj);
        this.f1554 = abstractC1189;
        this.f1550 = AbstractC2202.m3036(m1612().mo1563());
        Float f = (Float) AbstractC1166.f1431.get(interfaceC1204);
        if (f != null) {
            float fFloatValue = f.floatValue();
            AbstractC1189 abstractC11892 = (AbstractC1189) interfaceC1204.mo1622().invoke(obj);
            int iMo1600 = abstractC11892.mo1600();
            for (int i = 0; i < iMo1600; i++) {
                abstractC11892.mo1597(fFloatValue, i);
            }
            objInvoke = this.f1559.mo1621().invoke(abstractC11892);
        }
        this.f1548 = AbstractC1176.m1574(0.0f, 0.0f, objInvoke, 3);
    }

    @Override // androidx.compose.runtime.InterfaceC2168
    public final Object getValue() {
        return ((AbstractC2182) this.f1553).getValue();
    }

    public final String toString() {
        return "current value: " + ((AbstractC2182) this.f1553).getValue() + ", target: " + ((AbstractC2182) this.f1557).getValue() + ", spec: " + m1611();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m1608(Object obj) {
        this.f1553.setValue(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m1609() {
        if (m1610() == -1.0f) {
            this.f1549 = true;
            if (AbstractC5227.m9466(m1612().f1622, m1612().f1621)) {
                m1608(m1612().f1622);
            } else {
                m1608(m1612().mo1559(0L));
                this.f1554 = m1612().mo1561(0L);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float m1610() {
        return ((AbstractC2184) this.f1555).m2994();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1157 m1611() {
        return (InterfaceC1157) ((AbstractC2182) this.f1558).getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1220 m1612() {
        return (C1220) ((AbstractC2182) this.f1552).getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m1613(Object obj, Object obj2, InterfaceC1157 interfaceC1157) {
        ((AbstractC2182) this.f1557).setValue(obj2);
        ((AbstractC2182) this.f1558).setValue(interfaceC1157);
        if (AbstractC5227.m9466(m1612().f1621, obj) && AbstractC5227.m9466(m1612().f1622, obj2)) {
            return;
        }
        m1614(obj, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m1614(Object obj, boolean z) {
        AbstractC2182 abstractC2182 = (AbstractC2182) this.f1557;
        boolean zM9466 = AbstractC5227.m9466(null, abstractC2182.getValue());
        AbstractC2162 abstractC2162 = this.f1550;
        InterfaceC2230 interfaceC2230 = this.f1552;
        if (zM9466) {
            ((AbstractC2182) interfaceC2230).setValue(new C1220(this.f1548, this.f1559, obj, obj, this.f1554.mo1599()));
            this.f1556 = true;
            abstractC2162.m2958(m1612().mo1563());
            return;
        }
        InterfaceC1157 interfaceC1157M1611 = (!z || this.f1549 || (m1611() instanceof C1145)) ? m1611() : this.f1548;
        C1210 c1210 = this.f1547;
        long jM1624 = c1210.m1624();
        InterfaceC2230 interfaceC22302 = c1210.f1590;
        long jMax = 0;
        ((AbstractC2182) interfaceC2230).setValue(new C1220(jM1624 <= 0 ? interfaceC1157M1611 : new C1144(interfaceC1157M1611, c1210.m1624()), this.f1559, obj, abstractC2182.getValue(), this.f1554));
        abstractC2162.m2958(m1612().mo1563());
        this.f1556 = false;
        ((AbstractC2182) interfaceC22302).setValue(Boolean.TRUE);
        if (c1210.m1630()) {
            SnapshotStateList snapshotStateList = c1210.f1593;
            int size = snapshotStateList.size();
            for (int i = 0; i < size; i++) {
                C1197 c1197 = (C1197) snapshotStateList.get(i);
                jMax = Math.max(jMax, c1197.f1550.m2957());
                c1197.m1609();
            }
            ((AbstractC2182) interfaceC22302).setValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m1615(Object obj, InterfaceC1157 interfaceC1157) {
        if (this.f1556 && AbstractC5227.m9466(obj, null)) {
            return;
        }
        InterfaceC2230 interfaceC2230 = this.f1557;
        if (AbstractC5227.m9466(((AbstractC2182) interfaceC2230).getValue(), obj) && m1610() == -1.0f) {
            return;
        }
        ((AbstractC2182) interfaceC2230).setValue(obj);
        ((AbstractC2182) this.f1558).setValue(interfaceC1157);
        Object value = m1610() == -3.0f ? obj : ((AbstractC2182) this.f1553).getValue();
        InterfaceC2230 interfaceC22302 = this.f1551;
        m1614(value, !((Boolean) ((AbstractC2182) interfaceC22302).getValue()).booleanValue());
        ((AbstractC2182) interfaceC22302).setValue(Boolean.valueOf(m1610() == -3.0f));
        if (m1610() >= 0.0f) {
            m1608(m1612().mo1559((long) (m1610() * m1612().mo1563())));
        } else if (m1610() == -3.0f) {
            m1608(obj);
        }
        this.f1556 = false;
        ((AbstractC2184) this.f1555).m2995(-1.0f);
    }
}
