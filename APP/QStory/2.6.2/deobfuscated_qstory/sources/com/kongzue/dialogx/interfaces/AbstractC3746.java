package com.kongzue.dialogx.interfaces;

import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.C2386;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.Lifecycle$State;
import p033.AbstractC6325;
import p261.AbstractC8247;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3746 implements InterfaceC2388 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2386 f11605 = new C2386(this, true);

    @Override // androidx.lifecycle.InterfaceC2388
    public final AbstractC2402 getLifecycle() {
        return this.f11605;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo8079(AbstractC3737 abstractC3737) {
        try {
            C2386 c2386 = this.f11605;
            Lifecycle$State lifecycle$State = c2386.f7018;
            Lifecycle$State lifecycle$State2 = Lifecycle$State.CREATED;
            if (lifecycle$State != lifecycle$State2) {
                c2386.m4495(lifecycle$State2);
            }
        } catch (Exception unused) {
        }
        AbstractC6325 abstractC6325 = AbstractC8247.f22824;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void mo8080(AbstractC3737 abstractC3737) {
        try {
            C2386 c2386 = this.f11605;
            Lifecycle$State lifecycle$State = c2386.f7018;
            Lifecycle$State lifecycle$State2 = Lifecycle$State.DESTROYED;
            if (lifecycle$State != lifecycle$State2) {
                c2386.m4495(lifecycle$State2);
            }
        } catch (Exception unused) {
        }
        AbstractC6325 abstractC6325 = AbstractC8247.f22824;
    }
}
