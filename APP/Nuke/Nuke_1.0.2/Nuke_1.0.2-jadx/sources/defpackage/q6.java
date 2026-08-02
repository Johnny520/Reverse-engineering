package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q6 extends t3 {
    public final /* synthetic */ b7 k;
    public final /* synthetic */ r61 l;
    public final /* synthetic */ b7 m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q6(b7 b7Var, r61 r61Var, b7 b7Var2) {
        this.k = b7Var;
        this.l = r61Var;
        this.m = b7Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    @Override // defpackage.t3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, l4 l4Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = l4Var.a;
        this.h.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        b7 b7Var = this.k;
        h7 h7Var = b7Var.G;
        if (h7Var.o()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        r61 r61Var = this.l;
        r61 r61VarU = r61Var.u();
        while (true) {
            if (r61VarU == null) {
                r61VarU = null;
                break;
            } else if (r61VarU.M.m(8)) {
                break;
            } else {
                r61VarU = r61VarU.u();
            }
        }
        Integer numValueOf = r61VarU != null ? Integer.valueOf(r61VarU.i) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == b7Var.getSemanticsOwner().a().f) {
                numValueOf = -1;
            }
        }
        int iIntValue = numValueOf.intValue();
        l4Var.b = iIntValue;
        b7 b7Var2 = this.m;
        accessibilityNodeInfo.setParent(b7Var2, iIntValue);
        int i = r61Var.i;
        int iD = h7Var.I.d(i);
        if (iD != -1) {
            ic icVarV = eu.V(b7Var.getAndroidViewsHandler$ui(), iD);
            if (icVarV != null) {
                accessibilityNodeInfo.setTraversalBefore(icVarV);
            } else {
                accessibilityNodeInfo.setTraversalBefore(b7Var2, iD);
            }
            b7.d(b7Var, i, accessibilityNodeInfo, h7Var.K);
        }
        int iD2 = h7Var.J.d(i);
        if (iD2 != -1) {
            ic icVarV2 = eu.V(b7Var.getAndroidViewsHandler$ui(), iD2);
            if (icVarV2 != null) {
                accessibilityNodeInfo.setTraversalAfter(icVarV2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(b7Var2, iD2);
            }
            b7.d(b7Var, i, accessibilityNodeInfo, h7Var.L);
        }
    }
}
