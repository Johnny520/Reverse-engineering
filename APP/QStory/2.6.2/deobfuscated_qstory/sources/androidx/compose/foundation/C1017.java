package androidx.compose.foundation;

import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.C1585;
import androidx.compose.ui.graphics.InterfaceC1569;
import androidx.compose.ui.unit.LayoutDirection;
import p112.C7327;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1017 implements InterfaceC1569 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f2976;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1017 f2975 = new C1017(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1017 f2974 = new C1017(1);

    public /* synthetic */ C1017(int i) {
        this.f2976 = i;
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1569
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC1581 mo1912(long j, LayoutDirection layoutDirection, InterfaceC7895 interfaceC7895) {
        switch (this.f2976) {
            case 0:
                float fMo1333 = interfaceC7895.mo1333(30.0f);
                return new C1585(new C7327(0.0f, -fMo1333, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fMo1333));
            default:
                float fMo13332 = interfaceC7895.mo1333(30.0f);
                return new C1585(new C7327(-fMo13332, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fMo13332, Float.intBitsToFloat((int) (j & 4294967295L))));
        }
    }
}
