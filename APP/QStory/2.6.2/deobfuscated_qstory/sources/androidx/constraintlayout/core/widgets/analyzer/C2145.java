package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2145 implements InterfaceC2147 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f6320;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC2154 f6322;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f6327;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC2154 f6325 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f6324 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f6323 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public DependencyNode$Type f6321 = DependencyNode$Type.UNKNOWN;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f6326 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C2158 f6330 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f6331 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ArrayList f6328 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final ArrayList f6329 = new ArrayList();

    public C2145(AbstractC2154 abstractC2154) {
        this.f6322 = abstractC2154;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6322.f6360.f21754);
        sb.append(":");
        sb.append(this.f6321);
        sb.append("(");
        sb.append(this.f6331 ? Integer.valueOf(this.f6327) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f6329.size());
        sb.append(":d=");
        sb.append(this.f6328.size());
        sb.append(">");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void mo3868(int i) {
        if (this.f6331) {
            return;
        }
        this.f6331 = true;
        this.f6327 = i;
        for (InterfaceC2147 interfaceC2147 : this.f6328) {
            interfaceC2147.mo3871(interfaceC2147);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3869() {
        this.f6329.clear();
        this.f6328.clear();
        this.f6331 = false;
        this.f6327 = 0;
        this.f6323 = false;
        this.f6324 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3870(AbstractC2154 abstractC2154) {
        this.f6328.add(abstractC2154);
        if (this.f6331) {
            abstractC2154.mo3871(abstractC2154);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.InterfaceC2147
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo3871(InterfaceC2147 interfaceC2147) {
        ArrayList<C2145> arrayList = this.f6329;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C2145) it.next()).f6331) {
                return;
            }
        }
        this.f6323 = true;
        AbstractC2154 abstractC2154 = this.f6325;
        if (abstractC2154 != null) {
            abstractC2154.mo3871(this);
        }
        if (this.f6324) {
            this.f6322.mo3871(this);
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
        if (c2145 != null && i == 1 && c2145.f6331) {
            C2158 c2158 = this.f6330;
            if (c2158 != null) {
                if (!c2158.f6331) {
                    return;
                } else {
                    this.f6320 = this.f6326 * c2158.f6327;
                }
            }
            mo3868(c2145.f6327 + this.f6320);
        }
        AbstractC2154 abstractC21542 = this.f6325;
        if (abstractC21542 != null) {
            abstractC21542.mo3871(this);
        }
    }
}
