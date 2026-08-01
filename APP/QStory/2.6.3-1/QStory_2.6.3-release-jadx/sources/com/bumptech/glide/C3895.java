package com.bumptech.glide;

import com.bumptech.glide.request.InterfaceC3883;
import java.util.HashSet;
import java.util.Set;
import p238.AbstractC8818;
import p248.C8894;
import p248.InterfaceC8891;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3895 implements InterfaceC8891 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ ComponentCallbacks2C3896 f10135;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8894 f10136;

    public C3895(ComponentCallbacks2C3896 componentCallbacks2C3896, C8894 c8894) {
        this.f10135 = componentCallbacks2C3896;
        this.f10136 = c8894;
    }

    @Override // p248.InterfaceC8891
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo7351(boolean z) {
        if (z) {
            synchronized (this.f10135) {
                C8894 c8894 = this.f10136;
                for (InterfaceC3883 interfaceC3883 : AbstractC8818.m14033((Set) c8894.f22591)) {
                    if (!interfaceC3883.mo7164() && !interfaceC3883.mo7153()) {
                        interfaceC3883.clear();
                        if (c8894.f22590) {
                            ((HashSet) c8894.f22589).add(interfaceC3883);
                        } else {
                            interfaceC3883.mo7159();
                        }
                    }
                }
            }
        }
    }
}
