package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0354 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C0364 f1217;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1395 f1218 = AbstractC1367.m2474(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC0358 f1219;

    public C0354(C0364 c0364, InterfaceC0358 interfaceC0358, String str) {
        this.f1217 = c0364;
        this.f1219 = interfaceC0358;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0355 m1059(InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582) {
        InterfaceC1395 interfaceC1395 = this.f1218;
        C0355 c0355 = (C0355) ((AbstractC1347) interfaceC1395).getValue();
        C0364 c0364 = this.f1217;
        if (c0355 == null) {
            Object objInvoke = interfaceC65582.invoke(c0364.m1066());
            Object objInvoke2 = interfaceC65582.invoke(c0364.m1066());
            InterfaceC0358 interfaceC0358 = this.f1219;
            AbstractC0343 abstractC0343 = (AbstractC0343) interfaceC0358.mo1062().invoke(objInvoke2);
            abstractC0343.mo1038();
            C0351 c0351 = new C0351(c0364, objInvoke, abstractC0343, interfaceC0358);
            c0355 = new C0355(this, c0351, interfaceC6558, interfaceC65582);
            ((AbstractC1347) interfaceC1395).setValue(c0355);
            c0364.f1248.add(c0351);
        }
        c0355.f1222 = interfaceC65582;
        c0355.f1221 = interfaceC6558;
        c0355.m1060(c0364.m1063());
        return c0355;
    }
}
