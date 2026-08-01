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
import p108.C7314;
import p108.C7315;
import p108.InterfaceC7316;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0881 implements InterfaceC1013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ C0882 f2476;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C2035 f2478;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean f2479 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C0276 f2477 = C0915.f2599;

    public C0881(C0882 c0882) {
        this.f2476 = c0882;
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    public final void onCancel() {
        m1733();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m1733() {
        C0882 c0882 = this.f2476;
        ((AbstractC1347) c0882.f2499).setValue(null);
        ((AbstractC1347) c0882.f2491).setValue(null);
        this.f2477 = C0915.f2599;
        c0882.m1743(true);
        C2035 c2035 = this.f2478;
        boolean zM3742 = C2035.m3742(c2035 != null ? c2035.f6003 : c0882.m1749().f5945);
        c0882.m1752(zM3742 ? HandleState.Cursor : HandleState.Selection);
        C0943 c0943 = c0882.f2486;
        if (c0943 != null) {
            ((AbstractC1347) c0943.f2677).setValue(Boolean.valueOf(!zM3742 && AbstractC0895.m1803(c0882, true)));
        }
        C0943 c09432 = c0882.f2486;
        if (c09432 != null) {
            ((AbstractC1347) c09432.f2676).setValue(Boolean.valueOf(!zM3742 && AbstractC0895.m1803(c0882, false)));
        }
        C0943 c09433 = c0882.f2486;
        if (c09433 != null) {
            ((AbstractC1347) c09433.f2680).setValue(Boolean.valueOf(zM3742 && AbstractC0895.m1803(c0882, true)));
        }
        if (this.f2479) {
            C0882.m1740(c0882, c0882.f2501);
        }
        c0882.f2501 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1734(long r10) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C0881.mo1734(long):void");
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo1737(long j, C0276 c0276) {
        long j2;
        C0963 c0963M1855;
        C0963 c0963M18552;
        C0882 c0882 = this.f2476;
        InterfaceC1395 interfaceC1395 = c0882.f2499;
        if (c0882.m1757() && ((Handle) ((AbstractC1347) interfaceC1395).getValue()) == null) {
            ((AbstractC1347) interfaceC1395).setValue(Handle.SelectionEnd);
            c0882.f2490 = -1;
            this.f2479 = true;
            this.f2477 = c0276;
            c0882.m1753();
            C0943 c0943 = c0882.f2486;
            if (c0943 == null || (c0963M18552 = c0943.m1855()) == null || !c0963M18552.m1867(j)) {
                j2 = j;
                C0943 c09432 = c0882.f2486;
                if (c09432 != null && (c0963M1855 = c09432.m1855()) != null) {
                    int iM1868 = c0963M1855.m1868(j2, true);
                    c0882.f2488.mo1873(iM1868);
                    C2013 c2013M1742 = C0882.m1742(c0882.m1749().f5946, AbstractC2048.m3760(iM1868, iM1868));
                    c0882.m1764(false);
                    InterfaceC7316 interfaceC7316 = c0882.f2504;
                    if (interfaceC7316 != null) {
                        ((C7314) interfaceC7316).m12482(0);
                    }
                    c0882.f2487.invoke(c2013M1742);
                    c0882.f2492 = new C2035(c2013M1742.f5945);
                }
                this.f2479 = false;
            } else {
                if (c0882.m1749().f5946.f6128.length() == 0) {
                    return;
                }
                c0882.m1764(false);
                long jM1739 = C0882.m1739(c0882, C2013.m3705(c0882.m1749(), null, C2035.f6002, 5), j, true, false, this.f2477, true, new C7315(0));
                j2 = j;
                c0882.f2501 = new C2035(jM1739);
                this.f2478 = new C2035(jM1739);
            }
            c0882.m1752(HandleState.None);
            c0882.f2500 = j2;
            ((AbstractC1347) c0882.f2491).setValue(new C7328(j2));
            c0882.f2498 = 0L;
        }
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo1738() {
        m1733();
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo1735() {
    }

    @Override // androidx.compose.foundation.text.InterfaceC1013
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo1736() {
    }
}
