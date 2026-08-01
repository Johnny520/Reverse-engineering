package androidx.compose.animation.core;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1156 extends InterfaceC1195 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    float mo1494(long j, float f, float f2, float f3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    default float mo1497(float f, float f2, float f3) {
        return mo1496(mo1495(f, f2, f3), f, f2, f3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    long mo1495(float f, float f2, float f3);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    float mo1496(long j, float f, float f2, float f3);

    @Override // androidx.compose.animation.core.InterfaceC1195
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    default InterfaceC1206 mo1487(InterfaceC1204 interfaceC1204) {
        return new C1171(this);
    }
}
