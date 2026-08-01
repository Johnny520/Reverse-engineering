package androidx.compose.foundation.text.selection;

import androidx.collection.C0276;
import androidx.compose.foundation.text.C0943;
import androidx.compose.foundation.text.C0963;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.InterfaceC1013;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.input.InterfaceC2022;
import p108.C7314;
import p108.InterfaceC7316;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0884 implements InterfaceC1013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C0882 f2510;

    public C0884(C0882 c0882) {
        this.f2510 = c0882;
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo1734(long j) {
        C0963 c0963M1855;
        InterfaceC7316 interfaceC7316;
        C0882 c0882 = this.f2510;
        c0882.f2498 = C7328.m12498(c0882.f2498, j);
        C0943 c0943 = c0882.f2486;
        if (c0943 == null || (c0963M1855 = c0943.m1855()) == null) {
            return;
        }
        ((AbstractC1347) c0882.f2491).setValue(new C7328(C7328.m12498(c0882.f2500, c0882.f2498)));
        InterfaceC2022 interfaceC2022 = c0882.f2488;
        C7328 c7328M1759 = c0882.m1759();
        c7328M1759.getClass();
        int iM1868 = c0963M1855.m1868(c7328M1759.f19546, true);
        interfaceC2022.mo1873(iM1868);
        long jM3760 = AbstractC2048.m3760(iM1868, iM1868);
        if (C2035.m3743(jM3760, c0882.m1749().f5945)) {
            return;
        }
        C0943 c09432 = c0882.f2486;
        if ((c09432 == null || ((Boolean) ((AbstractC1347) c09432.f2678).getValue()).booleanValue()) && (interfaceC7316 = c0882.f2504) != null) {
            ((C7314) interfaceC7316).m12482(9);
        }
        c0882.f2487.invoke(C0882.m1742(c0882.m1749().f5946, jM3760));
        c0882.f2492 = new C2035(jM3760);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1736() {
        C0882 c0882 = this.f2510;
        ((AbstractC1347) c0882.f2499).setValue(null);
        ((AbstractC1347) c0882.f2491).setValue(null);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo1737(long j, C0276 c0276) {
        C0963 c0963M1855;
        C0882 c0882 = this.f2510;
        long jM1810 = AbstractC0904.m1810(c0882.m1758(true));
        C0943 c0943 = c0882.f2486;
        if (c0943 == null || (c0963M1855 = c0943.m1855()) == null) {
            return;
        }
        long jM1865 = c0963M1855.m1865(jM1810);
        c0882.f2500 = jM1865;
        ((AbstractC1347) c0882.f2491).setValue(new C7328(jM1865));
        c0882.f2498 = 0L;
        ((AbstractC1347) c0882.f2499).setValue(Handle.Cursor);
        c0882.m1743(false);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1738() {
        C0882 c0882 = this.f2510;
        ((AbstractC1347) c0882.f2499).setValue(null);
        ((AbstractC1347) c0882.f2491).setValue(null);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    public final void onCancel() {
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1735() {
    }
}
