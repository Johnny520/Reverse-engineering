package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;
import p009.AbstractC6183;
import p203.C7878;
import p203.C7879;
import p203.C7881;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2148 extends AbstractC2154 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ArrayList f6341;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f6342;

    public C2148(C7879 c7879, int i) {
        C7879 c78792;
        super(c7879);
        ArrayList<AbstractC2154> arrayList = new ArrayList();
        this.f6341 = arrayList;
        this.f6357 = i;
        C7879 c78793 = this.f6361;
        C7879 c7879M13274 = c78793.m13274(i);
        while (true) {
            c78792 = c78793;
            c78793 = c7879M13274;
            if (c78793 == null) {
                break;
            } else {
                c7879M13274 = c78793.m13274(this.f6357);
            }
        }
        this.f6361 = c78792;
        int i2 = this.f6357;
        arrayList.add(i2 == 0 ? c78792.f21717 : i2 == 1 ? c78792.f21716 : null);
        C7879 c7879M13280 = c78792.m13280(this.f6357);
        while (c7879M13280 != null) {
            int i3 = this.f6357;
            arrayList.add(i3 == 0 ? c7879M13280.f21717 : i3 == 1 ? c7879M13280.f21716 : null);
            c7879M13280 = c7879M13280.m13280(this.f6357);
        }
        for (AbstractC2154 abstractC2154 : arrayList) {
            int i4 = this.f6357;
            if (i4 == 0) {
                abstractC2154.f6361.f21719 = this;
            } else if (i4 == 1) {
                abstractC2154.f6361.f21718 = this;
            }
        }
        if (this.f6357 == 0 && ((C7878) this.f6361.f21691).f21675 && arrayList.size() > 1) {
            this.f6361 = ((AbstractC2154) AbstractC6183.m11586(1, arrayList)).f6361;
        }
        int i5 = this.f6357;
        C7879 c78794 = this.f6361;
        this.f6342 = i5 == 0 ? c78794.f21752 : c78794.f21748;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f6357 == 0 ? "horizontal : " : "vertical : ");
        for (AbstractC2154 abstractC2154 : this.f6341) {
            sb.append("<");
            sb.append(abstractC2154);
            sb.append("> ");
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo3889() {
        this.f6360 = null;
        Iterator it = this.f6341.iterator();
        while (it.hasNext()) {
            ((AbstractC2154) it.next()).mo3889();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo3890() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6341;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC2154) arrayList.get(i)).mo3890();
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo3891() {
        ArrayList arrayList = this.f6341;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC2154) it.next()).mo3891();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C7879 c7879 = ((AbstractC2154) arrayList.get(0)).f6361;
        C7879 c78792 = ((AbstractC2154) arrayList.get(size - 1)).f6361;
        int i = this.f6357;
        C2145 c2145 = this.f6365;
        C2145 c21452 = this.f6363;
        if (i == 0) {
            C7881 c7881 = c7879.f21710;
            C7881 c78812 = c78792.f21700;
            C2145 c2145M3900 = AbstractC2154.m3900(c7881, 0);
            int iM13284 = c7881.m13284();
            C7879 c7879M3893 = m3893();
            if (c7879M3893 != null) {
                iM13284 = c7879M3893.f21710.m13284();
            }
            if (c2145M3900 != null) {
                AbstractC2154.m3898(c21452, c2145M3900, iM13284);
            }
            C2145 c2145M39002 = AbstractC2154.m3900(c78812, 0);
            int iM132842 = c78812.m13284();
            C7879 c7879M3892 = m3892();
            if (c7879M3892 != null) {
                iM132842 = c7879M3892.f21700.m13284();
            }
            if (c2145M39002 != null) {
                AbstractC2154.m3898(c2145, c2145M39002, -iM132842);
            }
        } else {
            C7881 c78813 = c7879.f21709;
            C7881 c78814 = c78792.f21699;
            C2145 c2145M39003 = AbstractC2154.m3900(c78813, 1);
            int iM132843 = c78813.m13284();
            C7879 c7879M38932 = m3893();
            if (c7879M38932 != null) {
                iM132843 = c7879M38932.f21709.m13284();
            }
            if (c2145M39003 != null) {
                AbstractC2154.m3898(c21452, c2145M39003, iM132843);
            }
            C2145 c2145M39004 = AbstractC2154.m3900(c78814, 1);
            int iM132844 = c78814.m13284();
            C7879 c7879M38922 = m3892();
            if (c7879M38922 != null) {
                iM132844 = c7879M38922.f21699.m13284();
            }
            if (c2145M39004 != null) {
                AbstractC2154.m3898(c2145, c2145M39004, -iM132844);
            }
        }
        c21452.f6326 = this;
        c2145.f6326 = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.InterfaceC2147
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3881(androidx.constraintlayout.core.widgets.analyzer.InterfaceC2147 r27) {
        /*
            Method dump skipped, instruction units count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C2148.mo3881(androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪世哲兰苏):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C7879 m3892() {
        ArrayList arrayList = this.f6341;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C7879 c7879 = ((AbstractC2154) arrayList.get(size)).f6361;
            if (c7879.f21739 != 8) {
                return c7879;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C7879 m3893() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6341;
            if (i >= arrayList.size()) {
                return null;
            }
            C7879 c7879 = ((AbstractC2154) arrayList.get(i)).f6361;
            if (c7879.f21739 != 8) {
                return c7879;
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean mo3894() {
        ArrayList arrayList = this.f6341;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC2154) arrayList.get(i)).mo3894()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long mo3895() {
        ArrayList arrayList = this.f6341;
        int size = arrayList.size();
        long jMo3895 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC2154 abstractC2154 = (AbstractC2154) arrayList.get(i);
            jMo3895 = ((long) abstractC2154.f6365.f6321) + abstractC2154.mo3895() + jMo3895 + ((long) abstractC2154.f6363.f6321);
        }
        return jMo3895;
    }
}
