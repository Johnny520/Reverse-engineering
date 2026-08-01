package androidx.appcompat.widget;

import androidx.core.view.AbstractC2267;
import androidx.core.view.InterfaceC2283;
import p192.C7817;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0157 extends AbstractC2267 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f637;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f638;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f639;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f640;

    public C0157(C7817 c7817) {
        this.f638 = 1;
        this.f639 = c7817;
        this.f637 = false;
        this.f640 = 0;
    }

    @Override // androidx.core.view.InterfaceC2283
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo323() {
        int i = this.f638;
        Object obj = this.f639;
        switch (i) {
            case 0:
                if (!this.f637) {
                    ((C0146) obj).f612.setVisibility(this.f640);
                }
                break;
            default:
                int i2 = this.f640 + 1;
                this.f640 = i2;
                C7817 c7817 = (C7817) obj;
                if (i2 == c7817.f21340.size()) {
                    InterfaceC2283 interfaceC2283 = c7817.f21337;
                    if (interfaceC2283 != null) {
                        interfaceC2283.mo323();
                    }
                    this.f640 = 0;
                    this.f637 = false;
                    c7817.f21336 = false;
                }
                break;
        }
    }

    @Override // androidx.core.view.AbstractC2267, androidx.core.view.InterfaceC2283
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo324() {
        int i = this.f638;
        Object obj = this.f639;
        switch (i) {
            case 0:
                ((C0146) obj).f612.setVisibility(0);
                break;
            default:
                if (!this.f637) {
                    this.f637 = true;
                    InterfaceC2283 interfaceC2283 = ((C7817) obj).f21337;
                    if (interfaceC2283 != null) {
                        interfaceC2283.mo324();
                    }
                    break;
                }
                break;
        }
    }

    @Override // androidx.core.view.AbstractC2267, androidx.core.view.InterfaceC2283
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void mo607() {
        switch (this.f638) {
            case 0:
                this.f637 = true;
                break;
        }
    }

    public C0157(C0146 c0146, int i) {
        this.f638 = 0;
        this.f639 = c0146;
        this.f640 = i;
        this.f637 = false;
    }
}
