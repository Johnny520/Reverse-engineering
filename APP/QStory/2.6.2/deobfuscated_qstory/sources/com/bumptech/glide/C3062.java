package com.bumptech.glide;

import com.bumptech.glide.request.InterfaceC3050;
import java.util.HashSet;
import java.util.Set;
import p222.AbstractC7988;
import p232.C8064;
import p232.InterfaceC8061;

/* JADX INFO: renamed from: com.bumptech.glide.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3062 implements InterfaceC8061 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ ComponentCallbacks2C3063 f9781;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8064 f9782;

    public C3062(ComponentCallbacks2C3063 componentCallbacks2C3063, C8064 c8064) {
        this.f9781 = componentCallbacks2C3063;
        this.f9782 = c8064;
    }

    @Override // p232.InterfaceC8061
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo6746(boolean z) {
        if (z) {
            synchronized (this.f9781) {
                C8064 c8064 = this.f9782;
                for (InterfaceC3050 interfaceC3050 : AbstractC7988.m13446((Set) c8064.f22248)) {
                    if (!interfaceC3050.mo6544() && !interfaceC3050.mo6533()) {
                        interfaceC3050.clear();
                        if (c8064.f22247) {
                            ((HashSet) c8064.f22246).add(interfaceC3050);
                        } else {
                            interfaceC3050.mo6539();
                        }
                    }
                }
            }
        }
    }
}
