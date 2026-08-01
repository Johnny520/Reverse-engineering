package androidx.compose.foundation.gestures;

import androidx.compose.runtime.AbstractC2182;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1319 implements InterfaceC1348 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C1318 f1789;

    public C1319(C1318 c1318) {
        this.f1789 = c1318;
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC1348
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float mo1811(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        C1318 c1318 = this.f1789;
        float fFloatValue = ((Number) c1318.f1788.invoke(Float.valueOf(f))).floatValue();
        ((AbstractC2182) c1318.f1784).setValue(Boolean.valueOf(fFloatValue > 0.0f));
        ((AbstractC2182) c1318.f1783).setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
