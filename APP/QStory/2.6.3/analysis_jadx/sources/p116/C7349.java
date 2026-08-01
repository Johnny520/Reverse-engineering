package p116;

import android.os.Bundle;
import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.C2386;
import java.util.Map;
import p052.InterfaceC6543;
import p130.C7502;
import p142.C7538;
import p142.C7539;
import p142.InterfaceC7537;

/* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7349 implements InterfaceC7345, InterfaceC7537 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C2386 f19575;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C7538 f19576;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C7344 f19577;

    public C7349(C7344 c7344) {
        this.f19577 = c7344;
        Object objMo1483 = c7344.mo1483("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objMo1483 instanceof Bundle ? (Bundle) objMo1483 : null;
        if (bundle != null) {
            m12542(bundle);
        }
        c7344.mo1481("androidx.savedstate.SavedStateRegistry", new C7342(this, 1));
    }

    @Override // androidx.lifecycle.InterfaceC2388
    public final AbstractC2402 getLifecycle() {
        C2386 c2386 = this.f19575;
        if (c2386 != null) {
            return c2386;
        }
        C2386 c23862 = new C2386(this, false);
        this.f19575 = c23862;
        return c23862;
    }

    @Override // p142.InterfaceC7537
    public final C7539 getSavedStateRegistry() {
        return m12542(null).f20418;
    }

    @Override // p116.InterfaceC7345
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC7338 mo1481(String str, InterfaceC6543 interfaceC6543) {
        return this.f19577.mo1481(str, interfaceC6543);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7538 m12542(Bundle bundle) {
        C7538 c7538 = this.f19576;
        if (c7538 != null) {
            return c7538;
        }
        C7538 c75382 = new C7538(new C7502(this, new C7342(this, 4)));
        this.f19576 = c75382;
        c75382.m12758(bundle);
        return c75382;
    }

    @Override // p116.InterfaceC7345
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo1483(String str) {
        return this.f19577.mo1483(str);
    }

    @Override // p116.InterfaceC7345
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Map mo1484() {
        return this.f19577.mo1484();
    }

    @Override // p116.InterfaceC7345
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1485(Object obj) {
        return this.f19577.mo1485(obj);
    }
}
