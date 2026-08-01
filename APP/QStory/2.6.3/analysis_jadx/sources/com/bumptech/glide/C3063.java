package com.bumptech.glide;

import com.bumptech.glide.request.InterfaceC3051;
import java.util.HashSet;
import java.util.Set;
import p222.AbstractC7989;
import p232.C8065;
import p232.InterfaceC8062;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3063 implements InterfaceC8062 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ ComponentCallbacks2C3064 f9790;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8065 f9791;

    public C3063(ComponentCallbacks2C3064 componentCallbacks2C3064, C8065 c8065) {
        this.f9790 = componentCallbacks2C3064;
        this.f9791 = c8065;
    }

    @Override // p232.InterfaceC8062
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo6791(boolean z) {
        if (z) {
            synchronized (this.f9790) {
                C8065 c8065 = this.f9791;
                for (InterfaceC3051 interfaceC3051 : AbstractC7989.m13474((Set) c8065.f22246)) {
                    if (!interfaceC3051.mo6604() && !interfaceC3051.mo6593()) {
                        interfaceC3051.clear();
                        if (c8065.f22245) {
                            ((HashSet) c8065.f22244).add(interfaceC3051);
                        } else {
                            interfaceC3051.mo6599();
                        }
                    }
                }
            }
        }
    }
}
