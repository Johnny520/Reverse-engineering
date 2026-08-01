package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2978 implements InterfaceC2980 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f6666;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC2987 f6668;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f6673;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC2987 f6671 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f6670 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f6669 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public DependencyNode$Type f6667 = DependencyNode$Type.UNKNOWN;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f6672 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C2991 f6676 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean f6677 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ArrayList f6674 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final ArrayList f6675 = new ArrayList();

    public C2978(AbstractC2987 abstractC2987) {
        this.f6668 = abstractC2987;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6668.f6706.f22096);
        sb.append(":");
        sb.append(this.f6667);
        sb.append("(");
        sb.append(this.f6677 ? Integer.valueOf(this.f6673) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f6675.size());
        sb.append(":d=");
        sb.append(this.f6674.size());
        sb.append(">");
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void mo4438(int i) {
        if (this.f6677) {
            return;
        }
        this.f6677 = true;
        this.f6673 = i;
        for (InterfaceC2980 interfaceC2980 : this.f6674) {
            interfaceC2980.mo4441(interfaceC2980);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m4439() {
        this.f6675.clear();
        this.f6674.clear();
        this.f6677 = false;
        this.f6673 = 0;
        this.f6669 = false;
        this.f6670 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4440(AbstractC2987 abstractC2987) {
        this.f6674.add(abstractC2987);
        if (this.f6677) {
            abstractC2987.mo4441(abstractC2987);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.InterfaceC2980
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo4441(InterfaceC2980 interfaceC2980) {
        ArrayList<C2978> arrayList = this.f6675;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C2978) it.next()).f6677) {
                return;
            }
        }
        this.f6669 = true;
        AbstractC2987 abstractC2987 = this.f6671;
        if (abstractC2987 != null) {
            abstractC2987.mo4441(this);
        }
        if (this.f6670) {
            this.f6668.mo4441(this);
            return;
        }
        C2978 c2978 = null;
        int i = 0;
        for (C2978 c29782 : arrayList) {
            if (!(c29782 instanceof C2991)) {
                i++;
                c2978 = c29782;
            }
        }
        if (c2978 != null && i == 1 && c2978.f6677) {
            C2991 c2991 = this.f6676;
            if (c2991 != null) {
                if (!c2991.f6677) {
                    return;
                } else {
                    this.f6666 = this.f6672 * c2991.f6673;
                }
            }
            mo4438(c2978.f6673 + this.f6666);
        }
        AbstractC2987 abstractC29872 = this.f6671;
        if (abstractC29872 != null) {
            abstractC29872.mo4441(this);
        }
    }
}
