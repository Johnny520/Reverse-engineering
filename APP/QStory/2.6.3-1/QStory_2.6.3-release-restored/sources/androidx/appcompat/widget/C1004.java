package androidx.appcompat.widget;

import androidx.core.view.AbstractC3100;
import androidx.core.view.InterfaceC3116;
import p208.C8647;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1004 extends AbstractC3100 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f982;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f983;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f984;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f985;

    public C1004(C8647 c8647) {
        this.f983 = 1;
        this.f984 = c8647;
        this.f982 = false;
        this.f985 = 0;
    }

    @Override // androidx.core.view.InterfaceC3116
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo884() {
        int i = this.f983;
        Object obj = this.f984;
        switch (i) {
            case 0:
                if (!this.f982) {
                    ((C0993) obj).f957.setVisibility(this.f985);
                }
                break;
            default:
                int i2 = this.f985 + 1;
                this.f985 = i2;
                C8647 c8647 = (C8647) obj;
                if (i2 == c8647.f21682.size()) {
                    InterfaceC3116 interfaceC3116 = c8647.f21679;
                    if (interfaceC3116 != null) {
                        interfaceC3116.mo884();
                    }
                    this.f985 = 0;
                    this.f982 = false;
                    c8647.f21678 = false;
                }
                break;
        }
    }

    @Override // androidx.core.view.AbstractC3100, androidx.core.view.InterfaceC3116
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo885() {
        int i = this.f983;
        Object obj = this.f984;
        switch (i) {
            case 0:
                ((C0993) obj).f957.setVisibility(0);
                break;
            default:
                if (!this.f982) {
                    this.f982 = true;
                    InterfaceC3116 interfaceC3116 = ((C8647) obj).f21679;
                    if (interfaceC3116 != null) {
                        interfaceC3116.mo885();
                    }
                    break;
                }
                break;
        }
    }

    @Override // androidx.core.view.AbstractC3100, androidx.core.view.InterfaceC3116
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void mo1168() {
        switch (this.f983) {
            case 0:
                this.f982 = true;
                break;
        }
    }

    public C1004(C0993 c0993, int i) {
        this.f983 = 0;
        this.f984 = c0993;
        this.f985 = i;
        this.f982 = false;
    }
}
