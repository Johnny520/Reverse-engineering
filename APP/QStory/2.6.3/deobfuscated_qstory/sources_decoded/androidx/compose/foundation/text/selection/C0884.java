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
import p108.C7315;
import p108.InterfaceC7317;
import p112.C7329;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0884 implements InterfaceC1013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C0882 f2511;

    public C0884(C0882 c0882) {
        this.f2511 = c0882;
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo1744(long j) {
        C0963 c0963M1865;
        InterfaceC7317 interfaceC7317;
        C0882 c0882 = this.f2511;
        c0882.f2499 = C7329.m12525(c0882.f2499, j);
        C0943 c0943 = c0882.f2487;
        if (c0943 == null || (c0963M1865 = c0943.m1865()) == null) {
            return;
        }
        ((AbstractC1347) c0882.f2492).setValue(new C7329(C7329.m12525(c0882.f2501, c0882.f2499)));
        InterfaceC2022 interfaceC2022 = c0882.f2489;
        C7329 c7329M1769 = c0882.m1769();
        c7329M1769.getClass();
        int iM1878 = c0963M1865.m1878(c7329M1769.f19541, true);
        interfaceC2022.mo1883(iM1878);
        long jM3770 = AbstractC2048.m3770(iM1878, iM1878);
        if (C2035.m3753(jM3770, c0882.m1759().f5946)) {
            return;
        }
        C0943 c09432 = c0882.f2487;
        if ((c09432 == null || ((Boolean) ((AbstractC1347) c09432.f2679).getValue()).booleanValue()) && (interfaceC7317 = c0882.f2505) != null) {
            ((C7315) interfaceC7317).m12509(9);
        }
        c0882.f2488.invoke(C0882.m1752(c0882.m1759().f5947, jM3770));
        c0882.f2493 = new C2035(jM3770);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1746() {
        C0882 c0882 = this.f2511;
        ((AbstractC1347) c0882.f2500).setValue(null);
        ((AbstractC1347) c0882.f2492).setValue(null);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo1747(long j, C0276 c0276) {
        C0963 c0963M1865;
        C0882 c0882 = this.f2511;
        long jM1820 = AbstractC0904.m1820(c0882.m1768(true));
        C0943 c0943 = c0882.f2487;
        if (c0943 == null || (c0963M1865 = c0943.m1865()) == null) {
            return;
        }
        long jM1875 = c0963M1865.m1875(jM1820);
        c0882.f2501 = jM1875;
        ((AbstractC1347) c0882.f2492).setValue(new C7329(jM1875));
        c0882.f2499 = 0L;
        ((AbstractC1347) c0882.f2500).setValue(Handle.Cursor);
        c0882.m1753(false);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1748() {
        C0882 c0882 = this.f2511;
        ((AbstractC1347) c0882.f2500).setValue(null);
        ((AbstractC1347) c0882.f2492).setValue(null);
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    public final void onCancel() {
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1745() {
    }
}
