package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2230;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1200 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C1210 f1562;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC2230 f1563 = AbstractC2202.m3034(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1204 f1564;

    public C1200(C1210 c1210, InterfaceC1204 interfaceC1204, String str) {
        this.f1562 = c1210;
        this.f1564 = interfaceC1204;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1201 m1619(InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872) {
        InterfaceC2230 interfaceC2230 = this.f1563;
        C1201 c1201 = (C1201) ((AbstractC2182) interfaceC2230).getValue();
        C1210 c1210 = this.f1562;
        if (c1201 == null) {
            Object objInvoke = interfaceC73872.invoke(c1210.m1626());
            Object objInvoke2 = interfaceC73872.invoke(c1210.m1626());
            InterfaceC1204 interfaceC1204 = this.f1564;
            AbstractC1189 abstractC1189 = (AbstractC1189) interfaceC1204.mo1622().invoke(objInvoke2);
            abstractC1189.mo1598();
            C1197 c1197 = new C1197(c1210, objInvoke, abstractC1189, interfaceC1204);
            c1201 = new C1201(this, c1197, interfaceC7387, interfaceC73872);
            ((AbstractC2182) interfaceC2230).setValue(c1201);
            c1210.f1593.add(c1197);
        }
        c1201.f1567 = interfaceC73872;
        c1201.f1566 = interfaceC7387;
        c1201.m1620(c1210.m1623());
        return c1201;
    }
}
