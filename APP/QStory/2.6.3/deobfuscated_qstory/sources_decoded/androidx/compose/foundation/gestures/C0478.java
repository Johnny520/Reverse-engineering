package androidx.compose.foundation.gestures;

import androidx.compose.runtime.AbstractC1347;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0478 implements InterfaceC0507 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C0477 f1444;

    public C0478(C0477 c0477) {
        this.f1444 = c0477;
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0507
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float mo1251(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        C0477 c0477 = this.f1444;
        float fFloatValue = ((Number) c0477.f1443.invoke(Float.valueOf(f))).floatValue();
        ((AbstractC1347) c0477.f1439).setValue(Boolean.valueOf(fFloatValue > 0.0f));
        ((AbstractC1347) c0477.f1438).setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
