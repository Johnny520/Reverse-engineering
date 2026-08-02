package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ab3 extends ic {
    public final View H;
    public final tm1 I;
    public ec2 J;
    public in0 K;
    public in0 L;
    public in0 M;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ab3(Context context, in0 in0Var, eo0 eo0Var, fc2 fc2Var, int i, zv1 zv1Var) {
        View view = (View) in0Var.j(context);
        tm1 tm1Var = new tm1();
        super(context, eo0Var, i, tm1Var, view, zv1Var);
        this.H = view;
        this.I = tm1Var;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objD = fc2Var != null ? fc2Var.d(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objD instanceof SparseArray ? (SparseArray) objD : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (fc2Var != null) {
            setSavableRegistryEntry(fc2Var.a(strValueOf, new hc(this, 2)));
        }
        v6 v6Var = v6.v;
        this.K = v6Var;
        this.L = v6Var;
        this.M = v6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void h(ab3 ab3Var) {
        ab3Var.setSavableRegistryEntry(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setSavableRegistryEntry(ec2 ec2Var) {
        ec2 ec2Var2 = this.J;
        if (ec2Var2 != null) {
            ((b5) ec2Var2).H();
        }
        this.J = ec2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final tm1 getDispatcher() {
        return this.I;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final in0 getReleaseBlock() {
        return this.M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final in0 getResetBlock() {
        return this.L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* bridge */ /* synthetic */ o2 getSubCompositionView() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final in0 getUpdateBlock() {
        return this.K;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setReleaseBlock(in0 in0Var) {
        this.M = in0Var;
        setRelease(new hc(this, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setResetBlock(in0 in0Var) {
        this.L = in0Var;
        setReset(new hc(this, 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setUpdateBlock(in0 in0Var) {
        this.K = in0Var;
        setUpdate(new hc(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
