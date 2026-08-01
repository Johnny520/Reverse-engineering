package com.kongzue.dialogx.interfaces;

import androidx.lifecycle.AbstractC3235;
import androidx.lifecycle.C3219;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.Lifecycle$State;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p277.AbstractC9077;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4579 implements InterfaceC3221 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3219 f11955 = new C3219(this, true);

    @Override // androidx.lifecycle.InterfaceC3221
    public final AbstractC3235 getLifecycle() {
        return this.f11955;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void mo8625(AbstractC4570 abstractC4570) {
        try {
            C3219 c3219 = this.f11955;
            Lifecycle$State lifecycle$State = c3219.f7364;
            Lifecycle$State lifecycle$State2 = Lifecycle$State.CREATED;
            if (lifecycle$State != lifecycle$State2) {
                c3219.m5065(lifecycle$State2);
            }
        } catch (Exception unused) {
        }
        AbstractC5754 abstractC5754 = AbstractC9077.f23168;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void mo8626(AbstractC4570 abstractC4570) {
        try {
            C3219 c3219 = this.f11955;
            Lifecycle$State lifecycle$State = c3219.f7364;
            Lifecycle$State lifecycle$State2 = Lifecycle$State.DESTROYED;
            if (lifecycle$State != lifecycle$State2) {
                c3219.m5065(lifecycle$State2);
            }
        } catch (Exception unused) {
        }
        AbstractC5754 abstractC5754 = AbstractC9077.f23168;
    }
}
