package p000;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ab3 extends AbstractC0309ic {

    /* JADX INFO: renamed from: H */
    public final View f134H;

    /* JADX INFO: renamed from: I */
    public final tm1 f135I;

    /* JADX INFO: renamed from: J */
    public ec2 f136J;

    /* JADX INFO: renamed from: K */
    public in0 f137K;

    /* JADX INFO: renamed from: L */
    public in0 f138L;

    /* JADX INFO: renamed from: M */
    public in0 f139M;

    public ab3(Context context, in0 in0Var, eo0 eo0Var, fc2 fc2Var, int i, zv1 zv1Var) {
        View view = (View) in0Var.mo5j(context);
        tm1 tm1Var = new tm1();
        super(context, eo0Var, i, tm1Var, view, zv1Var);
        this.f134H = view;
        this.f135I = tm1Var;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objMo978d = fc2Var != null ? fc2Var.mo978d(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objMo978d instanceof SparseArray ? (SparseArray) objMo978d : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (fc2Var != null) {
            setSavableRegistryEntry(fc2Var.mo975a(strValueOf, new C0272hc(this, 2)));
        }
        C0799v6 c0799v6 = C0799v6.f11773v;
        this.f137K = c0799v6;
        this.f138L = c0799v6;
        this.f139M = c0799v6;
    }

    /* JADX INFO: renamed from: h */
    public static final void m126h(ab3 ab3Var) {
        ab3Var.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(ec2 ec2Var) {
        ec2 ec2Var2 = this.f136J;
        if (ec2Var2 != null) {
            ((C0043b5) ec2Var2).m415H();
        }
        this.f136J = ec2Var;
    }

    public final tm1 getDispatcher() {
        return this.f135I;
    }

    public final in0 getReleaseBlock() {
        return this.f139M;
    }

    public final in0 getResetBlock() {
        return this.f138L;
    }

    public /* bridge */ /* synthetic */ AbstractC0526o2 getSubCompositionView() {
        return null;
    }

    public final in0 getUpdateBlock() {
        return this.f137K;
    }

    public final void setReleaseBlock(in0 in0Var) {
        this.f139M = in0Var;
        setRelease(new C0272hc(this, 3));
    }

    public final void setResetBlock(in0 in0Var) {
        this.f138L = in0Var;
        setReset(new C0272hc(this, 4));
    }

    public final void setUpdateBlock(in0 in0Var) {
        this.f137K = in0Var;
        setUpdate(new C0272hc(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
