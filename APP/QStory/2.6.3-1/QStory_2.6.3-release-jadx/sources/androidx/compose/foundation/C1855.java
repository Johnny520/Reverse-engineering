package androidx.compose.foundation;

import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.C2420;
import androidx.compose.p001ui.graphics.InterfaceC2404;
import androidx.compose.p001ui.unit.LayoutDirection;
import p128.C8157;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1855 implements InterfaceC2404 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f3322;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1855 f3321 = new C1855(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1855 f3320 = new C1855(1);

    public /* synthetic */ C1855(int i) {
        this.f3322 = i;
    }

    @Override // androidx.compose.p001ui.graphics.InterfaceC2404
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC2416 mo2482(long j, LayoutDirection layoutDirection, InterfaceC8725 interfaceC8725) {
        switch (this.f3322) {
            case 0:
                float fMo1903 = interfaceC8725.mo1903(30.0f);
                return new C2420(new C8157(0.0f, -fMo1903, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fMo1903));
            default:
                float fMo19032 = interfaceC8725.mo1903(30.0f);
                return new C2420(new C8157(-fMo19032, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fMo19032, Float.intBitsToFloat((int) (j & 4294967295L))));
        }
    }
}
