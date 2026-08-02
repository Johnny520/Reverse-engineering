package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kx1 extends qu2 implements Parcelable, is2, gu2, xk1 {
    public static final Parcelable.Creator<kx1> CREATOR = new C0118d5(4);

    /* JADX INFO: renamed from: i */
    public gs2 f5841i;

    public kx1(int i) {
        vr2 vr2VarM1126j = ds2.m1126j();
        gs2 gs2Var = new gs2(vr2VarM1126j.mo79g(), i);
        if (!(vr2VarM1126j instanceof hq0)) {
            gs2Var.f9761b = new gs2(1L, i);
        }
        this.f5841i = gs2Var;
    }

    @Override // p000.pu2
    /* JADX INFO: renamed from: a */
    public final ru2 mo2588a() {
        return this.f5841i;
    }

    @Override // p000.pu2
    /* JADX INFO: renamed from: b */
    public final ru2 mo2589b(ru2 ru2Var, ru2 ru2Var2, ru2 ru2Var3) {
        if (((gs2) ru2Var2).f3695c == ((gs2) ru2Var3).f3695c) {
            return ru2Var2;
        }
        return null;
    }

    @Override // p000.pu2
    /* JADX INFO: renamed from: c */
    public final void mo2590c(ru2 ru2Var) {
        ru2Var.getClass();
        this.f5841i = (gs2) ru2Var;
    }

    @Override // p000.is2
    /* JADX INFO: renamed from: d */
    public final ks2 mo2391d() {
        return C0700sn.f10216T;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final int m2759g() {
        return ((gs2) ds2.m1136t(this.f5841i, this)).f3695c;
    }

    @Override // p000.gu2
    public final Object getValue() {
        return Integer.valueOf(m2759g());
    }

    /* JADX INFO: renamed from: h */
    public final void m2760h(int i) {
        vr2 vr2VarM1126j;
        gs2 gs2Var = (gs2) ds2.m1124h(this.f5841i);
        if (gs2Var.f3695c != i) {
            gs2 gs2Var2 = this.f5841i;
            synchronized (ds2.f2181c) {
                vr2VarM1126j = ds2.m1126j();
                ((gs2) ds2.m1131o(gs2Var2, this, vr2VarM1126j, gs2Var)).f3695c = i;
            }
            ds2.m1130n(vr2VarM1126j, this);
        }
    }

    @Override // p000.xk1
    public final void setValue(Object obj) {
        m2760h(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((gs2) ds2.m1124h(this.f5841i)).f3695c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(m2759g());
    }
}
