package p219;

import androidx.constraintlayout.core.SolverVariable$Type;
import androidx.constraintlayout.core.widgets.ConstraintAnchor$Type;
import androidx.constraintlayout.core.widgets.analyzer.AbstractC2990;
import androidx.constraintlayout.core.widgets.analyzer.C2989;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p222.C8738;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8710 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C8710 f22105;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ConstraintAnchor$Type f22106;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8708 f22107;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f22108;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f22109;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C8738 f22113;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public HashSet f22110 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f22112 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f22111 = Integer.MIN_VALUE;

    public C8710(C8708 c8708, ConstraintAnchor$Type constraintAnchor$Type) {
        this.f22107 = c8708;
        this.f22106 = constraintAnchor$Type;
    }

    public final String toString() {
        return this.f22107.f22096 + ":" + this.f22106.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8710 m13842() {
        ConstraintAnchor$Type constraintAnchor$Type = this.f22106;
        int iOrdinal = constraintAnchor$Type.ordinal();
        C8708 c8708 = this.f22107;
        switch (iOrdinal) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c8708.f22045;
            case 2:
                return c8708.f22044;
            case 3:
                return c8708.f22055;
            case 4:
                return c8708.f22054;
            default:
                C6755.m11863(constraintAnchor$Type.name());
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int m13843() {
        C8710 c8710;
        if (this.f22107.f22084 == 8) {
            return 0;
        }
        int i = this.f22111;
        return (i == Integer.MIN_VALUE || (c8710 = this.f22105) == null || c8710.f22107.f22084 != 8) ? this.f22112 : i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m13844() {
        if (this.f22108) {
            return this.f22109;
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m13845(int i, C2989 c2989, ArrayList arrayList) {
        HashSet hashSet = this.f22110;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC2990.m4472(((C8710) it.next()).f22107, i, arrayList, c2989);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m13846(C8710 c8710, int i, int i2, boolean z) {
        if (c8710 == null) {
            m13853();
            return true;
        }
        if (!z && !m13852(c8710)) {
            return false;
        }
        this.f22105 = c8710;
        if (c8710.f22110 == null) {
            c8710.f22110 = new HashSet();
        }
        HashSet hashSet = this.f22105.f22110;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f22112 = i;
        this.f22111 = i2;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13847(C8710 c8710, int i) {
        m13846(c8710, i, Integer.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m13848() {
        return this.f22105 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m13849() {
        HashSet hashSet = this.f22110;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C8710) it.next()).m13842().m13848()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m13850() {
        C8738 c8738 = this.f22113;
        if (c8738 == null) {
            this.f22113 = new C8738(SolverVariable$Type.UNRESTRICTED);
        } else {
            c8738.m13926();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m13851(int i) {
        this.f22109 = i;
        this.f22108 = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0070 A[RETURN] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m13852(C8710 c8710) {
        if (c8710 != null) {
            C8708 c8708 = c8710.f22107;
            ConstraintAnchor$Type constraintAnchor$Type = c8710.f22106;
            ConstraintAnchor$Type constraintAnchor$Type2 = this.f22106;
            if (constraintAnchor$Type != constraintAnchor$Type2) {
                switch (constraintAnchor$Type2) {
                    case NONE:
                    case CENTER_X:
                    case CENTER_Y:
                        break;
                    case LEFT:
                    case RIGHT:
                        boolean z = constraintAnchor$Type == ConstraintAnchor$Type.LEFT || constraintAnchor$Type == ConstraintAnchor$Type.RIGHT;
                        if (!(c8708 instanceof C8718)) {
                            return z;
                        }
                        if (z || constraintAnchor$Type == ConstraintAnchor$Type.CENTER_X) {
                        }
                        break;
                    case TOP:
                    case BOTTOM:
                        boolean z2 = constraintAnchor$Type == ConstraintAnchor$Type.TOP || constraintAnchor$Type == ConstraintAnchor$Type.BOTTOM;
                        if (!(c8708 instanceof C8718)) {
                            return z2;
                        }
                        if (z2 || constraintAnchor$Type == ConstraintAnchor$Type.CENTER_Y) {
                        }
                        break;
                    case BASELINE:
                        if (constraintAnchor$Type == ConstraintAnchor$Type.LEFT || constraintAnchor$Type == ConstraintAnchor$Type.RIGHT) {
                        }
                        break;
                    case CENTER:
                        if (constraintAnchor$Type == ConstraintAnchor$Type.BASELINE || constraintAnchor$Type == ConstraintAnchor$Type.CENTER_X || constraintAnchor$Type == ConstraintAnchor$Type.CENTER_Y) {
                        }
                        break;
                    default:
                        C6755.m11863(constraintAnchor$Type2.name());
                        return false;
                }
            } else if (constraintAnchor$Type2 != ConstraintAnchor$Type.BASELINE || (c8708.f22059 && this.f22107.f22059)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m13853() {
        HashSet hashSet;
        C8710 c8710 = this.f22105;
        if (c8710 != null && (hashSet = c8710.f22110) != null) {
            hashSet.remove(this);
            if (this.f22105.f22110.size() == 0) {
                this.f22105.f22110 = null;
            }
        }
        this.f22110 = null;
        this.f22105 = null;
        this.f22112 = 0;
        this.f22111 = Integer.MIN_VALUE;
        this.f22108 = false;
        this.f22109 = 0;
    }
}
