package p203;

import androidx.constraintlayout.core.SolverVariable$Type;
import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.analyzer.AbstractC2157;
import androidx.constraintlayout.core.widgets.analyzer.C2156;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p206.C7909;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7881 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C7881 f21760;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ConstraintAnchor$Type f21761;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7879 f21762;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f21763;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f21764;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C7909 f21768;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public HashSet f21765 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f21767 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f21766 = Integer.MIN_VALUE;

    public C7881(C7879 c7879, ConstraintAnchor$Type constraintAnchor$Type) {
        this.f21762 = c7879;
        this.f21761 = constraintAnchor$Type;
    }

    public final String toString() {
        return this.f21762.f21751 + ":" + this.f21761.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C7881 m13283() {
        ConstraintAnchor$Type constraintAnchor$Type = this.f21761;
        int iOrdinal = constraintAnchor$Type.ordinal();
        C7879 c7879 = this.f21762;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c7879.f21700;
            case 2:
                return c7879.f21699;
            case 3:
                return c7879.f21710;
            case 4:
                return c7879.f21709;
            default:
                C5925.m11304(constraintAnchor$Type.name());
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m13284() {
        C7881 c7881;
        if (this.f21762.f21739 == 8) {
            return 0;
        }
        int i = this.f21766;
        return (i == Integer.MIN_VALUE || (c7881 = this.f21760) == null || c7881.f21762.f21739 != 8) ? this.f21767 : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m13285() {
        if (this.f21763) {
            return this.f21764;
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13286(int i, C2156 c2156, ArrayList arrayList) {
        HashSet hashSet = this.f21765;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC2157.m3912(((C7881) it.next()).f21762, i, arrayList, c2156);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m13287(C7881 c7881, int i, int i2, boolean z) {
        if (c7881 == null) {
            m13294();
            return true;
        }
        if (!z && !m13293(c7881)) {
            return false;
        }
        this.f21760 = c7881;
        if (c7881.f21765 == null) {
            c7881.f21765 = new HashSet();
        }
        HashSet hashSet = this.f21760.f21765;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f21767 = i;
        this.f21766 = i2;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13288(C7881 c7881, int i) {
        m13287(c7881, i, Integer.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m13289() {
        return this.f21760 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m13290() {
        HashSet hashSet = this.f21765;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C7881) it.next()).m13283().m13289()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m13291() {
        C7909 c7909 = this.f21768;
        if (c7909 == null) {
            this.f21768 = new C7909(SolverVariable$Type.UNRESTRICTED);
        } else {
            c7909.m13367();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m13292(int i) {
        this.f21764 = i;
        this.f21763 = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0070 A[RETURN] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m13293(p203.C7881 r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L5
            goto L72
        L5:
            飘花落叶言子苏兰楪哲世.飘花落叶言子楪世兰苏哲 r1 = r5.f21762
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = r5.f21761
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = r4.f21761
            r3 = 1
            if (r5 != r2) goto L1d
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor$Type.BASELINE
            if (r2 != r5) goto L70
            boolean r5 = r1.f21714
            if (r5 == 0) goto L72
            飘花落叶言子苏兰楪哲世.飘花落叶言子楪世兰苏哲 r4 = r4.f21762
            boolean r4 = r4.f21714
            if (r4 != 0) goto L70
            goto L72
        L1d:
            int r4 = r2.ordinal()
            switch(r4) {
                case 0: goto L72;
                case 1: goto L5a;
                case 2: goto L42;
                case 3: goto L5a;
                case 4: goto L42;
                case 5: goto L39;
                case 6: goto L2c;
                case 7: goto L72;
                case 8: goto L72;
                default: goto L24;
            }
        L24:
            java.lang.String r4 = r2.name()
            top.suzhelan.qstory.hook.item.C5925.m11304(r4)
            return r0
        L2c:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor$Type.BASELINE
            if (r5 == r4) goto L72
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor$Type.CENTER_X
            if (r5 == r4) goto L72
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor$Type.CENTER_Y
            if (r5 == r4) goto L72
            goto L70
        L39:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor$Type.LEFT
            if (r5 == r4) goto L72
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor$Type.RIGHT
            if (r5 != r4) goto L70
            goto L72
        L42:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor$Type.TOP
            if (r5 == r4) goto L4d
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor$Type.BOTTOM
            if (r5 != r4) goto L4b
            goto L4d
        L4b:
            r4 = r0
            goto L4e
        L4d:
            r4 = r3
        L4e:
            boolean r1 = r1 instanceof p203.C7889
            if (r1 == 0) goto L59
            if (r4 != 0) goto L70
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor$Type.CENTER_Y
            if (r5 != r4) goto L72
            goto L70
        L59:
            return r4
        L5a:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor$Type.LEFT
            if (r5 == r4) goto L65
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor$Type.RIGHT
            if (r5 != r4) goto L63
            goto L65
        L63:
            r4 = r0
            goto L66
        L65:
            r4 = r3
        L66:
            boolean r1 = r1 instanceof p203.C7889
            if (r1 == 0) goto L71
            if (r4 != 0) goto L70
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor$Type.CENTER_X
            if (r5 != r4) goto L72
        L70:
            return r3
        L71:
            return r4
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p203.C7881.m13293(飘花落叶言子苏兰楪哲世.飘花落叶言子楪世哲苏兰):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m13294() {
        HashSet hashSet;
        C7881 c7881 = this.f21760;
        if (c7881 != null && (hashSet = c7881.f21765) != null) {
            hashSet.remove(this);
            if (this.f21760.f21765.size() == 0) {
                this.f21760.f21765 = null;
            }
        }
        this.f21765 = null;
        this.f21760 = null;
        this.f21767 = 0;
        this.f21766 = Integer.MIN_VALUE;
        this.f21763 = false;
        this.f21764 = 0;
    }
}
