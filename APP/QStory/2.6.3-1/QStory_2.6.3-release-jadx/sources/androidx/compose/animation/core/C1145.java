package androidx.compose.animation.core;

import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0960;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1145 implements InterfaceC1157 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f1375;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float f1376;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f1377;

    public C1145(float f, float f2, Object obj) {
        this.f1377 = f;
        this.f1376 = f2;
        this.f1375 = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1145) {
            C1145 c1145 = (C1145) obj;
            if (c1145.f1377 == this.f1377 && c1145.f1376 == this.f1376 && AbstractC5227.m9466(c1145.f1375, this.f1375)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f1375;
        return Float.hashCode(this.f1376) + AbstractC0900.m705((obj != null ? obj.hashCode() : 0) * 31, this.f1377, 31);
    }

    @Override // androidx.compose.animation.core.InterfaceC1195
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1206 mo1487(InterfaceC1204 interfaceC1204) {
        Object obj = this.f1375;
        return new C0960(this.f1377, this.f1376, obj == null ? null : (AbstractC1189) interfaceC1204.mo1622().invoke(obj));
    }

    public /* synthetic */ C1145(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
