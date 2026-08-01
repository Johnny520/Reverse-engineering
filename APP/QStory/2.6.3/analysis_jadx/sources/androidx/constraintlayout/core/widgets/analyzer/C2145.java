package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2145 implements InterfaceC2147 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f6321;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC2154 f6323;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f6328;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC2154 f6326 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f6325 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f6324 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public DependencyNode$Type f6322 = DependencyNode$Type.UNKNOWN;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f6327 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C2158 f6331 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f6332 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ArrayList f6329 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final ArrayList f6330 = new ArrayList();

    public C2145(AbstractC2154 abstractC2154) {
        this.f6323 = abstractC2154;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6323.f6361.f21751);
        sb.append(":");
        sb.append(this.f6322);
        sb.append("(");
        sb.append(this.f6332 ? Integer.valueOf(this.f6328) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f6330.size());
        sb.append(":d=");
        sb.append(this.f6329.size());
        sb.append(">");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void mo3878(int i) {
        if (this.f6332) {
            return;
        }
        this.f6332 = true;
        this.f6328 = i;
        for (InterfaceC2147 interfaceC2147 : this.f6329) {
            interfaceC2147.mo3881(interfaceC2147);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3879() {
        this.f6330.clear();
        this.f6329.clear();
        this.f6332 = false;
        this.f6328 = 0;
        this.f6324 = false;
        this.f6325 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3880(AbstractC2154 abstractC2154) {
        this.f6329.add(abstractC2154);
        if (this.f6332) {
            abstractC2154.mo3881(abstractC2154);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.InterfaceC2147
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo3881(InterfaceC2147 interfaceC2147) {
        ArrayList<C2145> arrayList = this.f6330;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C2145) it.next()).f6332) {
                return;
            }
        }
        this.f6324 = true;
        AbstractC2154 abstractC2154 = this.f6326;
        if (abstractC2154 != null) {
            abstractC2154.mo3881(this);
        }
        if (this.f6325) {
            this.f6323.mo3881(this);
            return;
        }
        C2145 c2145 = null;
        int i = 0;
        for (C2145 c21452 : arrayList) {
            if (!(c21452 instanceof C2158)) {
                i++;
                c2145 = c21452;
            }
        }
        if (c2145 != null && i == 1 && c2145.f6332) {
            C2158 c2158 = this.f6331;
            if (c2158 != null) {
                if (!c2158.f6332) {
                    return;
                } else {
                    this.f6321 = this.f6327 * c2158.f6328;
                }
            }
            mo3878(c2145.f6328 + this.f6321);
        }
        AbstractC2154 abstractC21542 = this.f6326;
        if (abstractC21542 != null) {
            abstractC21542.mo3881(this);
        }
    }
}
