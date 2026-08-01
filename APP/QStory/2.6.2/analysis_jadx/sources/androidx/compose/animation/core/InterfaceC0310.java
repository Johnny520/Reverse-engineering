package androidx.compose.animation.core;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0310 extends InterfaceC0349 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    float mo933(long j, float f, float f2, float f3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    default float mo936(float f, float f2, float f3) {
        return mo935(mo934(f, f2, f3), f, f2, f3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    long mo934(float f, float f2, float f3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    float mo935(long j, float f, float f2, float f3);

    @Override // androidx.compose.animation.core.InterfaceC0349
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    default InterfaceC0360 mo926(InterfaceC0358 interfaceC0358) {
        return new C0325(this);
    }
}
