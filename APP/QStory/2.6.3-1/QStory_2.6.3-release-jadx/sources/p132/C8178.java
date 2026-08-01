package p132;

import android.os.Bundle;
import androidx.lifecycle.AbstractC3235;
import androidx.lifecycle.C3219;
import java.util.Map;
import p068.InterfaceC7372;
import p146.C8331;
import p158.C8367;
import p158.C8368;
import p158.InterfaceC8366;

/* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8178 implements InterfaceC8174, InterfaceC8366 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C3219 f19920;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C8367 f19921;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C8173 f19922;

    public C8178(C8173 c8173) {
        this.f19922 = c8173;
        Object objMo2043 = c8173.mo2043("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objMo2043 instanceof Bundle ? (Bundle) objMo2043 : null;
        if (bundle != null) {
            m13101(bundle);
        }
        c8173.mo2041("androidx.savedstate.SavedStateRegistry", new C8171(this, 1));
    }

    @Override // androidx.lifecycle.InterfaceC3221
    public final AbstractC3235 getLifecycle() {
        C3219 c3219 = this.f19920;
        if (c3219 != null) {
            return c3219;
        }
        C3219 c32192 = new C3219(this, false);
        this.f19920 = c32192;
        return c32192;
    }

    @Override // p158.InterfaceC8366
    public final C8368 getSavedStateRegistry() {
        return m13101(null).f20763;
    }

    @Override // p132.InterfaceC8174
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC8167 mo2041(String str, InterfaceC7372 interfaceC7372) {
        return this.f19922.mo2041(str, interfaceC7372);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8367 m13101(Bundle bundle) {
        C8367 c8367 = this.f19921;
        if (c8367 != null) {
            return c8367;
        }
        C8367 c83672 = new C8367(new C8331(this, new C8171(this, 4)));
        this.f19921 = c83672;
        c83672.m13317(bundle);
        return c83672;
    }

    @Override // p132.InterfaceC8174
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo2043(String str) {
        return this.f19922.mo2043(str);
    }

    @Override // p132.InterfaceC8174
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Map mo2044() {
        return this.f19922.mo2044();
    }

    @Override // p132.InterfaceC8174
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo2045(Object obj) {
        return this.f19922.mo2045(obj);
    }
}
