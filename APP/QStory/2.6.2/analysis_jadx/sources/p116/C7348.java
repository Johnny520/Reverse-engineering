package p116;

import android.os.Bundle;
import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.C2386;
import java.util.Map;
import p052.InterfaceC6542;
import p130.C7501;
import p142.C7537;
import p142.C7538;
import p142.InterfaceC7536;

/* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7348 implements InterfaceC7344, InterfaceC7536 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C2386 f19580;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C7537 f19581;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C7343 f19582;

    public C7348(C7343 c7343) {
        this.f19582 = c7343;
        Object objMo1473 = c7343.mo1473("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objMo1473 instanceof Bundle ? (Bundle) objMo1473 : null;
        if (bundle != null) {
            m12515(bundle);
        }
        c7343.mo1471("androidx.savedstate.SavedStateRegistry", new C7341(this, 1));
    }

    @Override // androidx.lifecycle.InterfaceC2388
    public final AbstractC2402 getLifecycle() {
        C2386 c2386 = this.f19580;
        if (c2386 != null) {
            return c2386;
        }
        C2386 c23862 = new C2386(this, false);
        this.f19580 = c23862;
        return c23862;
    }

    @Override // p142.InterfaceC7536
    public final C7538 getSavedStateRegistry() {
        return m12515(null).f20423;
    }

    @Override // p116.InterfaceC7344
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC7337 mo1471(String str, InterfaceC6542 interfaceC6542) {
        return this.f19582.mo1471(str, interfaceC6542);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7537 m12515(Bundle bundle) {
        C7537 c7537 = this.f19581;
        if (c7537 != null) {
            return c7537;
        }
        C7537 c75372 = new C7537(new C7501(this, new C7341(this, 4)));
        this.f19581 = c75372;
        c75372.m12729(bundle);
        return c75372;
    }

    @Override // p116.InterfaceC7344
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo1473(String str) {
        return this.f19582.mo1473(str);
    }

    @Override // p116.InterfaceC7344
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Map mo1474() {
        return this.f19582.mo1474();
    }

    @Override // p116.InterfaceC7344
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1475(Object obj) {
        return this.f19582.mo1475(obj);
    }
}
