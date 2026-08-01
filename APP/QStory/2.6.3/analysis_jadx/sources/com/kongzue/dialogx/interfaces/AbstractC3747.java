package com.kongzue.dialogx.interfaces;

import androidx.lifecycle.AbstractC2402;
import androidx.lifecycle.C2386;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.Lifecycle$State;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p261.AbstractC8248;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3747 implements InterfaceC2388 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2386 f11610 = new C2386(this, true);

    @Override // androidx.lifecycle.InterfaceC2388
    public final AbstractC2402 getLifecycle() {
        return this.f11610;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo8066(AbstractC3738 abstractC3738) {
        try {
            C2386 c2386 = this.f11610;
            Lifecycle$State lifecycle$State = c2386.f7019;
            Lifecycle$State lifecycle$State2 = Lifecycle$State.CREATED;
            if (lifecycle$State != lifecycle$State2) {
                c2386.m4505(lifecycle$State2);
            }
        } catch (Exception unused) {
        }
        AbstractC4922 abstractC4922 = AbstractC8248.f22823;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void mo8067(AbstractC3738 abstractC3738) {
        try {
            C2386 c2386 = this.f11610;
            Lifecycle$State lifecycle$State = c2386.f7019;
            Lifecycle$State lifecycle$State2 = Lifecycle$State.DESTROYED;
            if (lifecycle$State != lifecycle$State2) {
                c2386.m4505(lifecycle$State2);
            }
        } catch (Exception unused) {
        }
        AbstractC4922 abstractC4922 = AbstractC8248.f22823;
    }
}
