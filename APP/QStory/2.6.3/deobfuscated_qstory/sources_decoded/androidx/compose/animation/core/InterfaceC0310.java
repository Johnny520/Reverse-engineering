package androidx.compose.animation.core;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0310 extends InterfaceC0349 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    float mo934(long j, float f, float f2, float f3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    default float mo937(float f, float f2, float f3) {
        return mo936(mo935(f, f2, f3), f, f2, f3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    long mo935(float f, float f2, float f3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    float mo936(long j, float f, float f2, float f3);

    @Override // androidx.compose.animation.core.InterfaceC0349
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    default InterfaceC0360 mo927(InterfaceC0358 interfaceC0358) {
        return new C0325(this);
    }
}
