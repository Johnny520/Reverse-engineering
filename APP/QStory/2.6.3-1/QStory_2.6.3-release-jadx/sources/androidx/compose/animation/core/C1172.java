package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1172 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f1443;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public AbstractC1189 f1444;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC1189 f1445;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public AbstractC1189 f1446;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1155 f1447;

    public C1172(InterfaceC1155 interfaceC1155) {
        this.f1447 = interfaceC1155;
        this.f1443 = interfaceC1155.mo999();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC1189 m1558(long j, AbstractC1189 abstractC1189, AbstractC1189 abstractC11892) {
        if (this.f1445 == null) {
            this.f1445 = abstractC1189.mo1599();
        }
        AbstractC1189 abstractC11893 = this.f1445;
        if (abstractC11893 == null) {
            AbstractC5227.m9467("velocityVector");
            throw null;
        }
        int iMo1600 = abstractC11893.mo1600();
        int i = 0;
        while (true) {
            AbstractC1189 abstractC11894 = this.f1445;
            if (i >= iMo1600) {
                if (abstractC11894 != null) {
                    return abstractC11894;
                }
                AbstractC5227.m9467("velocityVector");
                throw null;
            }
            if (abstractC11894 == null) {
                AbstractC5227.m9467("velocityVector");
                throw null;
            }
            abstractC1189.getClass();
            abstractC11894.mo1597(this.f1447.mo996(abstractC11892.mo1601(i), j), i);
            i++;
        }
    }
}
