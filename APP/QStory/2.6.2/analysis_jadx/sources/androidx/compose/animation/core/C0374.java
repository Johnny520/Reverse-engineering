package androidx.compose.animation.core;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
        this.f1279 = interfaceC0349.mo926(interfaceC0358);
        this.f1278 = interfaceC0358;
        this.f1277 = obj2;
        this.f1276 = obj;
        this.f1275 = (AbstractC0343) interfaceC0358.mo1061().invoke(obj);
        this.f1274 = (AbstractC0343) interfaceC0358.mo1061().invoke(obj2);
        this.f1281 = abstractC0343 != null ? AbstractC0330.m1025(abstractC0343) : ((AbstractC0343) interfaceC0358.mo1061().invoke(obj)).mo1038();
        this.f1280 = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f1276 + " -> " + this.f1277 + ",initial velocity: " + this.f1281 + ", duration: " + (mo1002() / 1000000) + " ms,animationSpec: " + this.f1279;
    }

    @Override // androidx.compose.animation.core.InterfaceC0327
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Object mo998(long j) {
        if (m999(j)) {
            return this.f1277;
        }
        AbstractC0343 abstractC0343Mo444 = this.f1279.mo444(j, this.f1275, this.f1274, this.f1281);
        int iMo1039 = abstractC0343Mo444.mo1039();
        for (int i = 0; i < iMo1039; i++) {
            if (Float.isNaN(abstractC0343Mo444.mo1040(i))) {
                AbstractC0300.m927("AnimationVector cannot contain a NaN. " + abstractC0343Mo444 + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.f1278.mo1060().invoke(abstractC0343Mo444);
    }

    @Override // androidx.compose.animation.core.InterfaceC0327
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final AbstractC0343 mo1000(long j) {
        if (!m999(j)) {
            return this.f1279.mo451(j, this.f1275, this.f1274, this.f1281);
        }
        AbstractC0343 abstractC0343 = this.f1282;
        if (abstractC0343 != null) {
            return abstractC0343;
        }
        AbstractC0343 abstractC0343Mo446 = this.f1279.mo446(this.f1275, this.f1274, this.f1281);
        this.f1282 = abstractC0343Mo446;
        return abstractC0343Mo446;
    }

    @Override // androidx.compose.animation.core.InterfaceC0327
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC0358 mo1001() {
        return this.f1278;
    }

    @Override // androidx.compose.animation.core.InterfaceC0327
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final long mo1002() {
        if (this.f1280 < 0) {
            this.f1280 = this.f1279.mo437(this.f1275, this.f1274, this.f1281);
        }
        return this.f1280;
    }

    @Override // androidx.compose.animation.core.InterfaceC0327
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1003() {
        return this.f1279.mo439();
    }

    @Override // androidx.compose.animation.core.InterfaceC0327
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo1004() {
        return this.f1277;
    }
}
