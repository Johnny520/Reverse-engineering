package androidx.compose.foundation.lazy.layout;

import androidx.compose.p001ui.layout.InterfaceC2545;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2230;
import p192.AbstractC8570;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1542 implements InterfaceC2545 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f2316;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C1542 f2317;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f2318;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1540 f2320;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f2321;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f2319 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC2230 f2322 = AbstractC2202.m3034(null);

    public C1542(Object obj, C1540 c1540) {
        this.f2321 = obj;
        this.f2320 = c1540;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m2059() {
        if (this.f2316) {
            return;
        }
        if (this.f2318 <= 0) {
            AbstractC8570.m13654("Release should only be called once");
        }
        int i = this.f2318 - 1;
        this.f2318 = i;
        if (i == 0) {
            this.f2320.f2310.remove(this);
            C1542 c1542 = this.f2317;
            if (c1542 != null) {
                c1542.m2059();
            }
            this.f2317 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1542 m2060() {
        C1542 c1542;
        if (this.f2316) {
            AbstractC8570.m13654("Pin should not be called on an already disposed item ");
        }
        if (this.f2318 == 0) {
            this.f2320.f2310.add(this);
            InterfaceC2545 interfaceC2545 = (InterfaceC2545) ((AbstractC2182) this.f2322).getValue();
            if (interfaceC2545 != null) {
                c1542 = (C1542) interfaceC2545;
                c1542.m2060();
            } else {
                c1542 = null;
            }
            this.f2317 = c1542;
        }
        this.f2318++;
        return this;
    }
}
