package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;
import p007.AbstractC6136;
import p203.C7877;
import p203.C7878;
import p203.C7880;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2148 extends AbstractC2154 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ArrayList f6340;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f6341;

    public C2148(C7878 c7878, int i) {
        C7878 c78782;
        super(c7878);
        ArrayList<AbstractC2154> arrayList = new ArrayList();
        this.f6340 = arrayList;
        this.f6356 = i;
        C7878 c78783 = this.f6360;
        C7878 c7878M13246 = c78783.m13246(i);
        while (true) {
            c78782 = c78783;
            c78783 = c7878M13246;
            if (c78783 == null) {
                break;
            } else {
                c7878M13246 = c78783.m13246(this.f6356);
            }
        }
        this.f6360 = c78782;
        int i2 = this.f6356;
        arrayList.add(i2 == 0 ? c78782.f21720 : i2 == 1 ? c78782.f21719 : null);
        C7878 c7878M13252 = c78782.m13252(this.f6356);
        while (c7878M13252 != null) {
            int i3 = this.f6356;
            arrayList.add(i3 == 0 ? c7878M13252.f21720 : i3 == 1 ? c7878M13252.f21719 : null);
            c7878M13252 = c7878M13252.m13252(this.f6356);
        }
        for (AbstractC2154 abstractC2154 : arrayList) {
            int i4 = this.f6356;
            if (i4 == 0) {
                abstractC2154.f6360.f21722 = this;
            } else if (i4 == 1) {
                abstractC2154.f6360.f21721 = this;
            }
        }
        if (this.f6356 == 0 && ((C7877) this.f6360.f21694).f21678 && arrayList.size() > 1) {
            this.f6360 = ((AbstractC2154) AbstractC6136.m11555(1, arrayList)).f6360;
        }
        int i5 = this.f6356;
        C7878 c78784 = this.f6360;
        this.f6341 = i5 == 0 ? c78784.f21755 : c78784.f21751;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f6356 == 0 ? "horizontal : " : "vertical : ");
        for (AbstractC2154 abstractC2154 : this.f6340) {
            sb.append("<");
            sb.append(abstractC2154);
            sb.append("> ");
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo3879() {
        this.f6359 = null;
        Iterator it = this.f6340.iterator();
        while (it.hasNext()) {
            ((AbstractC2154) it.next()).mo3879();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo3880() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6340;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC2154) arrayList.get(i)).mo3880();
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo3881() {
        ArrayList arrayList = this.f6340;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC2154) it.next()).mo3881();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C7878 c7878 = ((AbstractC2154) arrayList.get(0)).f6360;
        C7878 c78782 = ((AbstractC2154) arrayList.get(size - 1)).f6360;
        int i = this.f6356;
        C2145 c2145 = this.f6364;
        C2145 c21452 = this.f6362;
        if (i == 0) {
            C7880 c7880 = c7878.f21713;
            C7880 c78802 = c78782.f21703;
            C2145 c2145M3890 = AbstractC2154.m3890(c7880, 0);
            int iM13256 = c7880.m13256();
            C7878 c7878M3883 = m3883();
            if (c7878M3883 != null) {
                iM13256 = c7878M3883.f21713.m13256();
            }
            if (c2145M3890 != null) {
                AbstractC2154.m3888(c21452, c2145M3890, iM13256);
            }
            C2145 c2145M38902 = AbstractC2154.m3890(c78802, 0);
            int iM132562 = c78802.m13256();
            C7878 c7878M3882 = m3882();
            if (c7878M3882 != null) {
                iM132562 = c7878M3882.f21703.m13256();
            }
            if (c2145M38902 != null) {
                AbstractC2154.m3888(c2145, c2145M38902, -iM132562);
            }
        } else {
            C7880 c78803 = c7878.f21712;
            C7880 c78804 = c78782.f21702;
            C2145 c2145M38903 = AbstractC2154.m3890(c78803, 1);
            int iM132563 = c78803.m13256();
            C7878 c7878M38832 = m3883();
            if (c7878M38832 != null) {
                iM132563 = c7878M38832.f21712.m13256();
            }
            if (c2145M38903 != null) {
                AbstractC2154.m3888(c21452, c2145M38903, iM132563);
            }
            C2145 c2145M38904 = AbstractC2154.m3890(c78804, 1);
            int iM132564 = c78804.m13256();
            C7878 c7878M38822 = m3882();
            if (c7878M38822 != null) {
                iM132564 = c7878M38822.f21702.m13256();
            }
            if (c2145M38904 != null) {
                AbstractC2154.m3888(c2145, c2145M38904, -iM132564);
            }
        }
        c21452.f6325 = this;
        c2145.f6325 = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.InterfaceC2147
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3871(androidx.constraintlayout.core.widgets.analyzer.InterfaceC2147 r27) {
        /*
            Method dump skipped, instruction units count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.C2148.mo3871(androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪世哲兰苏):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C7878 m3882() {
        ArrayList arrayList = this.f6340;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C7878 c7878 = ((AbstractC2154) arrayList.get(size)).f6360;
            if (c7878.f21742 != 8) {
                return c7878;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C7878 m3883() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6340;
            if (i >= arrayList.size()) {
                return null;
            }
            C7878 c7878 = ((AbstractC2154) arrayList.get(i)).f6360;
            if (c7878.f21742 != 8) {
                return c7878;
            }
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean mo3884() {
        ArrayList arrayList = this.f6340;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC2154) arrayList.get(i)).mo3884()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long mo3885() {
        ArrayList arrayList = this.f6340;
        int size = arrayList.size();
        long jMo3885 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC2154 abstractC2154 = (AbstractC2154) arrayList.get(i);
            jMo3885 = ((long) abstractC2154.f6364.f6320) + abstractC2154.mo3885() + jMo3885 + ((long) abstractC2154.f6362.f6320);
        }
        return jMo3885;
    }
}
