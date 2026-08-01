package androidx.compose.animation.core;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1220 implements InterfaceC1173 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC1189 f1619;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC1189 f1620;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f1621;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f1622;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1204 f1623;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1206 f1624;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public long f1625;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final AbstractC1189 f1626;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public AbstractC1189 f1627;

    public C1220(InterfaceC1195 interfaceC1195, InterfaceC1204 interfaceC1204, Object obj, Object obj2, AbstractC1189 abstractC1189) {
        this.f1624 = interfaceC1195.mo1487(interfaceC1204);
        this.f1623 = interfaceC1204;
        this.f1622 = obj2;
        this.f1621 = obj;
        this.f1620 = (AbstractC1189) interfaceC1204.mo1622().invoke(obj);
        this.f1619 = (AbstractC1189) interfaceC1204.mo1622().invoke(obj2);
        this.f1626 = abstractC1189 != null ? AbstractC1176.m1586(abstractC1189) : ((AbstractC1189) interfaceC1204.mo1622().invoke(obj)).mo1599();
        this.f1625 = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f1621 + " -> " + this.f1622 + ",initial velocity: " + this.f1626 + ", duration: " + (mo1563() / 1000000) + " ms,animationSpec: " + this.f1624;
    }

    @Override // androidx.compose.animation.core.InterfaceC1173
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Object mo1559(long j) {
        if (m1560(j)) {
            return this.f1622;
        }
        AbstractC1189 abstractC1189Mo1003 = this.f1624.mo1003(j, this.f1620, this.f1619, this.f1626);
        int iMo1600 = abstractC1189Mo1003.mo1600();
        for (int i = 0; i < iMo1600; i++) {
            if (Float.isNaN(abstractC1189Mo1003.mo1601(i))) {
                AbstractC1146.m1488("AnimationVector cannot contain a NaN. " + abstractC1189Mo1003 + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.f1623.mo1621().invoke(abstractC1189Mo1003);
    }

    @Override // androidx.compose.animation.core.InterfaceC1173
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final AbstractC1189 mo1561(long j) {
        if (!m1560(j)) {
            return this.f1624.mo1006(j, this.f1620, this.f1619, this.f1626);
        }
        AbstractC1189 abstractC1189 = this.f1627;
        if (abstractC1189 != null) {
            return abstractC1189;
        }
        AbstractC1189 abstractC1189Mo1001 = this.f1624.mo1001(this.f1620, this.f1619, this.f1626);
        this.f1627 = abstractC1189Mo1001;
        return abstractC1189Mo1001;
    }

    @Override // androidx.compose.animation.core.InterfaceC1173
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC1204 mo1562() {
        return this.f1623;
    }

    @Override // androidx.compose.animation.core.InterfaceC1173
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final long mo1563() {
        if (this.f1625 < 0) {
            this.f1625 = this.f1624.mo998(this.f1620, this.f1619, this.f1626);
        }
        return this.f1625;
    }

    @Override // androidx.compose.animation.core.InterfaceC1173
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1564() {
        return this.f1624.mo1000();
    }

    @Override // androidx.compose.animation.core.InterfaceC1173
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo1565() {
        return this.f1622;
    }
}
