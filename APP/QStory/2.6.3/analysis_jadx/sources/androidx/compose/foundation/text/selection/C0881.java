package androidx.compose.foundation.text.selection;

import androidx.collection.C0276;
import androidx.compose.foundation.text.C0943;
import androidx.compose.foundation.text.C0963;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.InterfaceC1013;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.input.C2013;
import p108.C7315;
import p108.C7316;
import p108.InterfaceC7317;
import p112.C7329;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0881 implements InterfaceC1013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ C0882 f2477;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2035 f2479;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f2480 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C0276 f2478 = C0915.f2600;

    public C0881(C0882 c0882) {
        this.f2477 = c0882;
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    public final void onCancel() {
        m1743();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m1743() {
        C0882 c0882 = this.f2477;
        ((AbstractC1347) c0882.f2500).setValue(null);
        ((AbstractC1347) c0882.f2492).setValue(null);
        this.f2478 = C0915.f2600;
        c0882.m1753(true);
        C2035 c2035 = this.f2479;
        boolean zM3752 = C2035.m3752(c2035 != null ? c2035.f6004 : c0882.m1759().f5946);
        c0882.m1762(zM3752 ? HandleState.Cursor : HandleState.Selection);
        C0943 c0943 = c0882.f2487;
        if (c0943 != null) {
            ((AbstractC1347) c0943.f2678).setValue(Boolean.valueOf(!zM3752 && AbstractC0895.m1813(c0882, true)));
        }
        C0943 c09432 = c0882.f2487;
        if (c09432 != null) {
            ((AbstractC1347) c09432.f2677).setValue(Boolean.valueOf(!zM3752 && AbstractC0895.m1813(c0882, false)));
        }
        C0943 c09433 = c0882.f2487;
        if (c09433 != null) {
            ((AbstractC1347) c09433.f2681).setValue(Boolean.valueOf(zM3752 && AbstractC0895.m1813(c0882, true)));
        }
        if (this.f2480) {
            C0882.m1750(c0882, c0882.f2502);
        }
        c0882.f2502 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1744(long r10) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C0881.mo1744(long):void");
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo1747(long j, C0276 c0276) {
        long j2;
        C0963 c0963M1865;
        C0963 c0963M18652;
        C0882 c0882 = this.f2477;
        InterfaceC1395 interfaceC1395 = c0882.f2500;
        if (c0882.m1767() && ((Handle) ((AbstractC1347) interfaceC1395).getValue()) == null) {
            ((AbstractC1347) interfaceC1395).setValue(Handle.SelectionEnd);
            c0882.f2491 = -1;
            this.f2480 = true;
            this.f2478 = c0276;
            c0882.m1763();
            C0943 c0943 = c0882.f2487;
            if (c0943 == null || (c0963M18652 = c0943.m1865()) == null || !c0963M18652.m1877(j)) {
                j2 = j;
                C0943 c09432 = c0882.f2487;
                if (c09432 != null && (c0963M1865 = c09432.m1865()) != null) {
                    int iM1878 = c0963M1865.m1878(j2, true);
                    c0882.f2489.mo1883(iM1878);
                    C2013 c2013M1752 = C0882.m1752(c0882.m1759().f5947, AbstractC2048.m3770(iM1878, iM1878));
                    c0882.m1774(false);
                    InterfaceC7317 interfaceC7317 = c0882.f2505;
                    if (interfaceC7317 != null) {
                        ((C7315) interfaceC7317).m12509(0);
                    }
                    c0882.f2488.invoke(c2013M1752);
                    c0882.f2493 = new C2035(c2013M1752.f5946);
                }
                this.f2480 = false;
            } else {
                if (c0882.m1759().f5947.f6129.length() == 0) {
                    return;
                }
                c0882.m1774(false);
                long jM1749 = C0882.m1749(c0882, C2013.m3715(c0882.m1759(), null, C2035.f6003, 5), j, true, false, this.f2478, true, new C7316(0));
                j2 = j;
                c0882.f2502 = new C2035(jM1749);
                this.f2479 = new C2035(jM1749);
            }
            c0882.m1762(HandleState.None);
            c0882.f2501 = j2;
            ((AbstractC1347) c0882.f2492).setValue(new C7329(j2));
            c0882.f2499 = 0L;
        }
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo1748() {
        m1743();
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo1745() {
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo1746() {
    }
}
