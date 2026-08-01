package androidx.compose.animation.core;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0374 implements InterfaceC0327 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC0343 f1274;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC0343 f1275;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f1276;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f1277;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC0358 f1278;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC0360 f1279;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public long f1280;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final AbstractC0343 f1281;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public AbstractC0343 f1282;

    public C0374(InterfaceC0349 interfaceC0349, InterfaceC0358 interfaceC0358, Object obj, Object obj2, AbstractC0343 abstractC0343) {
        this.f1279 = interfaceC0349.mo927(interfaceC0358);
        this.f1278 = interfaceC0358;
        this.f1277 = obj2;
        this.f1276 = obj;
        this.f1275 = (AbstractC0343) interfaceC0358.mo1062().invoke(obj);
        this.f1274 = (AbstractC0343) interfaceC0358.mo1062().invoke(obj2);
        this.f1281 = abstractC0343 != null ? AbstractC0330.m1026(abstractC0343) : ((AbstractC0343) interfaceC0358.mo1062().invoke(obj)).mo1039();
        this.f1280 = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f1276 + " -> " + this.f1277 + ",initial velocity: " + this.f1281 + ", duration: " + (mo1003() / 1000000) + " ms,animationSpec: " + this.f1279;
    }

    @Override // androidx.compose.animation.core.InterfaceC0327
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Object mo999(long j) {
        if (m1000(j)) {
            return this.f1277;
        }
        AbstractC0343 abstractC0343Mo443 = this.f1279.mo443(j, this.f1275, this.f1274, this.f1281);
        int iMo1040 = abstractC0343Mo443.mo1040();
        for (int i = 0; i < iMo1040; i++) {
            if (Float.isNaN(abstractC0343Mo443.mo1041(i))) {
                AbstractC0300.m928("AnimationVector cannot contain a NaN. " + abstractC0343Mo443 + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.f1278.mo1061().invoke(abstractC0343Mo443);
    }

    @Override // androidx.compose.animation.core.InterfaceC0327
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final AbstractC0343 mo1001(long j) {
        if (!m1000(j)) {
            return this.f1279.mo446(j, this.f1275, this.f1274, this.f1281);
        }
        AbstractC0343 abstractC0343 = this.f1282;
        if (abstractC0343 != null) {
            return abstractC0343;
        }
        AbstractC0343 abstractC0343Mo441 = this.f1279.mo441(this.f1275, this.f1274, this.f1281);
        this.f1282 = abstractC0343Mo441;
        return abstractC0343Mo441;
    }

    @Override // androidx.compose.animation.core.InterfaceC0327
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC0358 mo1002() {
        return this.f1278;
    }

    @Override // androidx.compose.animation.core.InterfaceC0327
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final long mo1003() {
        if (this.f1280 < 0) {
            this.f1280 = this.f1279.mo438(this.f1275, this.f1274, this.f1281);
        }
        return this.f1280;
    }

    @Override // androidx.compose.animation.core.InterfaceC0327
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1004() {
        return this.f1279.mo440();
    }

    @Override // androidx.compose.animation.core.InterfaceC0327
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo1005() {
        return this.f1277;
    }
}
