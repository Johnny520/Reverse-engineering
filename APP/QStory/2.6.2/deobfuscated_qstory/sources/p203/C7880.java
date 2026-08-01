package p203;

import androidx.constraintlayout.core.SolverVariable$Type;
import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.analyzer.AbstractC2157;
import androidx.constraintlayout.core.widgets.analyzer.C2156;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p206.C7908;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7880 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C7880 f21763;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ConstraintAnchor$Type f21764;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7878 f21765;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f21766;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f21767;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C7908 f21771;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public HashSet f21768 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f21770 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f21769 = Integer.MIN_VALUE;

    public C7880(C7878 c7878, ConstraintAnchor$Type constraintAnchor$Type) {
        this.f21765 = c7878;
        this.f21764 = constraintAnchor$Type;
    }

    public final String toString() {
        return this.f21765.f21754 + ":" + this.f21764.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C7880 m13255() {
        ConstraintAnchor$Type constraintAnchor$Type = this.f21764;
        int iOrdinal = constraintAnchor$Type.ordinal();
        C7878 c7878 = this.f21765;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c7878.f21703;
            case 2:
                return c7878.f21702;
            case 3:
                return c7878.f21713;
            case 4:
                return c7878.f21712;
            default:
                C5919.m11243(constraintAnchor$Type.name());
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m13256() {
        C7880 c7880;
        if (this.f21765.f21742 == 8) {
            return 0;
        }
        int i = this.f21769;
        return (i == Integer.MIN_VALUE || (c7880 = this.f21763) == null || c7880.f21765.f21742 != 8) ? this.f21770 : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m13257() {
        if (this.f21766) {
            return this.f21767;
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13258(int i, C2156 c2156, ArrayList arrayList) {
        HashSet hashSet = this.f21768;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC2157.m3902(((C7880) it.next()).f21765, i, arrayList, c2156);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m13259(C7880 c7880, int i, int i2, boolean z) {
        if (c7880 == null) {
            m13266();
            return true;
        }
        if (!z && !m13265(c7880)) {
            return false;
        }
        this.f21763 = c7880;
        if (c7880.f21768 == null) {
            c7880.f21768 = new HashSet();
        }
        HashSet hashSet = this.f21763.f21768;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f21770 = i;
        this.f21769 = i2;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13260(C7880 c7880, int i) {
        m13259(c7880, i, Integer.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m13261() {
        return this.f21763 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m13262() {
        HashSet hashSet = this.f21768;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C7880) it.next()).m13255().m13261()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m13263() {
        C7908 c7908 = this.f21771;
        if (c7908 == null) {
            this.f21771 = new C7908(SolverVariable$Type.UNRESTRICTED);
        } else {
            c7908.m13339();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m13264(int i) {
        this.f21767 = i;
        this.f21766 = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0070 A[RETURN] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m13265(p203.C7880 r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L5
            goto L72
        L5:
            飘花落叶言子苏兰楪哲世.飘花落叶言子楪世兰苏哲 r1 = r5.f21765
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = r5.f21764
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = r4.f21764
            r3 = 1
            if (r5 != r2) goto L1d
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor$Type.BASELINE
            if (r2 != r5) goto L70
            boolean r5 = r1.f21717
            if (r5 == 0) goto L72
            飘花落叶言子苏兰楪哲世.飘花落叶言子楪世兰苏哲 r4 = r4.f21765
            boolean r4 = r4.f21717
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
            top.suzhelan.qstory.hook.item.C5919.m11243(r4)
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
            boolean r1 = r1 instanceof p203.C7888
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
            boolean r1 = r1 instanceof p203.C7888
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
        throw new UnsupportedOperationException("Method not decompiled: p203.C7880.m13265(飘花落叶言子苏兰楪哲世.飘花落叶言子楪世哲苏兰):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m13266() {
        HashSet hashSet;
        C7880 c7880 = this.f21763;
        if (c7880 != null && (hashSet = c7880.f21768) != null) {
            hashSet.remove(this);
            if (this.f21763.f21768.size() == 0) {
                this.f21763.f21768 = null;
            }
        }
        this.f21768 = null;
        this.f21763 = null;
        this.f21770 = 0;
        this.f21769 = Integer.MIN_VALUE;
        this.f21766 = false;
        this.f21767 = 0;
    }
}
