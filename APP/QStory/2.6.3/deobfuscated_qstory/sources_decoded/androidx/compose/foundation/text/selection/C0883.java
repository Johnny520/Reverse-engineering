package androidx.compose.foundation.text.selection;

import androidx.collection.C0276;
import androidx.compose.foundation.text.C0943;
import androidx.compose.foundation.text.C0963;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.InterfaceC1013;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.ui.text.input.C2013;
import p108.C7316;
import p112.C7329;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0883 implements InterfaceC1013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ boolean f2509;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C0882 f2510;

    public C0883(C0882 c0882, boolean z) {
        this.f2510 = c0882;
        this.f2509 = z;
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo1744(long j) {
        C0882 c0882 = this.f2510;
        long jM12525 = C7329.m12525(c0882.f2499, j);
        c0882.f2499 = jM12525;
        ((AbstractC1347) c0882.f2492).setValue(new C7329(C7329.m12525(c0882.f2501, jM12525)));
        C2013 c2013M1759 = c0882.m1759();
        C7329 c7329M1769 = c0882.m1769();
        c7329M1769.getClass();
        C0882.m1749(c0882, c2013M1759, c7329M1769.f19541, false, this.f2509, C0915.f2603, true, new C7316(9));
        c0882.m1753(false);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1745() {
        C0963 c0963M1865;
        boolean z = this.f2509;
        Handle handle = z ? Handle.SelectionStart : Handle.SelectionEnd;
        C0882 c0882 = this.f2510;
        ((AbstractC1347) c0882.f2500).setValue(handle);
        long jM1820 = AbstractC0904.m1820(c0882.m1768(z));
        C0943 c0943 = c0882.f2487;
        if (c0943 == null || (c0963M1865 = c0943.m1865()) == null) {
            return;
        }
        long jM1875 = c0963M1865.m1875(jM1820);
        c0882.f2501 = jM1875;
        ((AbstractC1347) c0882.f2492).setValue(new C7329(jM1875));
        c0882.f2499 = 0L;
        c0882.f2491 = -1;
        C0943 c09432 = c0882.f2487;
        if (c09432 != null) {
            ((AbstractC1347) c09432.f2679).setValue(Boolean.TRUE);
        }
        c0882.m1753(false);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1746() {
        C0882 c0882 = this.f2510;
        ((AbstractC1347) c0882.f2500).setValue(null);
        ((AbstractC1347) c0882.f2492).setValue(null);
        c0882.m1753(true);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1748() {
        C0882 c0882 = this.f2510;
        ((AbstractC1347) c0882.f2500).setValue(null);
        ((AbstractC1347) c0882.f2492).setValue(null);
        c0882.m1753(true);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    public final void onCancel() {
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo1747(long j, C0276 c0276) {
    }
}
