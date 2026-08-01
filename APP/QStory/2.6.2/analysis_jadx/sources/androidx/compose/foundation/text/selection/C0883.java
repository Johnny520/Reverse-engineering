package androidx.compose.foundation.text.selection;

import androidx.collection.C0276;
import androidx.compose.foundation.text.C0943;
import androidx.compose.foundation.text.C0963;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.InterfaceC1013;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.ui.text.input.C2013;
import p108.C7315;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0883 implements InterfaceC1013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ boolean f2508;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C0882 f2509;

    public C0883(C0882 c0882, boolean z) {
        this.f2509 = c0882;
        this.f2508 = z;
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo1734(long j) {
        C0882 c0882 = this.f2509;
        long jM12498 = C7328.m12498(c0882.f2498, j);
        c0882.f2498 = jM12498;
        ((AbstractC1347) c0882.f2491).setValue(new C7328(C7328.m12498(c0882.f2500, jM12498)));
        C2013 c2013M1749 = c0882.m1749();
        C7328 c7328M1759 = c0882.m1759();
        c7328M1759.getClass();
        C0882.m1739(c0882, c2013M1749, c7328M1759.f19546, false, this.f2508, C0915.f2602, true, new C7315(9));
        c0882.m1743(false);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1735() {
        C0963 c0963M1855;
        boolean z = this.f2508;
        Handle handle = z ? Handle.SelectionStart : Handle.SelectionEnd;
        C0882 c0882 = this.f2509;
        ((AbstractC1347) c0882.f2499).setValue(handle);
        long jM1810 = AbstractC0904.m1810(c0882.m1758(z));
        C0943 c0943 = c0882.f2486;
        if (c0943 == null || (c0963M1855 = c0943.m1855()) == null) {
            return;
        }
        long jM1865 = c0963M1855.m1865(jM1810);
        c0882.f2500 = jM1865;
        ((AbstractC1347) c0882.f2491).setValue(new C7328(jM1865));
        c0882.f2498 = 0L;
        c0882.f2490 = -1;
        C0943 c09432 = c0882.f2486;
        if (c09432 != null) {
            ((AbstractC1347) c09432.f2678).setValue(Boolean.TRUE);
        }
        c0882.m1743(false);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1736() {
        C0882 c0882 = this.f2509;
        ((AbstractC1347) c0882.f2499).setValue(null);
        ((AbstractC1347) c0882.f2491).setValue(null);
        c0882.m1743(true);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1738() {
        C0882 c0882 = this.f2509;
        ((AbstractC1347) c0882.f2499).setValue(null);
        ((AbstractC1347) c0882.f2491).setValue(null);
        c0882.m1743(true);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    public final void onCancel() {
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo1737(long j, C0276 c0276) {
    }
}
