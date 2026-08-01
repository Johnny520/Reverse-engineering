package androidx.compose.foundation;

import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1585;
import androidx.compose.ui.graphics.InterfaceC1569;
import androidx.compose.ui.unit.LayoutDirection;
import p112.C7328;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1017 implements InterfaceC1569 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f2977;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1017 f2976 = new C1017(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1017 f2975 = new C1017(1);

    public /* synthetic */ C1017(int i) {
        this.f2977 = i;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1569
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC1581 mo1922(long j, LayoutDirection layoutDirection, InterfaceC7896 interfaceC7896) {
        switch (this.f2977) {
            case 0:
                float fMo1343 = interfaceC7896.mo1343(30.0f);
                return new C1585(new C7328(0.0f, -fMo1343, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fMo1343));
            default:
                float fMo13432 = interfaceC7896.mo1343(30.0f);
                return new C1585(new C7328(-fMo13432, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fMo13432, Float.intBitsToFloat((int) (j & 4294967295L))));
        }
    }
}
