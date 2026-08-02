package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lx1 extends qu2 implements Parcelable, is2, gu2, xk1 {
    public static final Parcelable.Creator<lx1> CREATOR = new C0118d5(5);

    /* JADX INFO: renamed from: i */
    public hs2 f6371i;

    public lx1(long j) {
        vr2 vr2VarM1126j = ds2.m1126j();
        hs2 hs2Var = new hs2(vr2VarM1126j.mo79g(), j);
        if (!(vr2VarM1126j instanceof hq0)) {
            hs2Var.f9761b = new hs2(1L, j);
        }
        this.f6371i = hs2Var;
    }

    @Override // p000.pu2
    /* JADX INFO: renamed from: a */
    public final ru2 mo2588a() {
        return this.f6371i;
    }

    @Override // p000.pu2
    /* JADX INFO: renamed from: b */
    public final ru2 mo2589b(ru2 ru2Var, ru2 ru2Var2, ru2 ru2Var3) {
        if (((hs2) ru2Var2).f4125c == ((hs2) ru2Var3).f4125c) {
            return ru2Var2;
        }
        return null;
    }

    @Override // p000.pu2
    /* JADX INFO: renamed from: c */
    public final void mo2590c(ru2 ru2Var) {
        ru2Var.getClass();
        this.f6371i = (hs2) ru2Var;
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
    public final long m2984g() {
        return ((hs2) ds2.m1136t(this.f6371i, this)).f4125c;
    }

    @Override // p000.gu2
    public final Object getValue() {
        return Long.valueOf(m2984g());
    }

    /* JADX INFO: renamed from: h */
    public final void m2985h(long j) {
        vr2 vr2VarM1126j;
        hs2 hs2Var = (hs2) ds2.m1124h(this.f6371i);
        if (hs2Var.f4125c != j) {
            hs2 hs2Var2 = this.f6371i;
            synchronized (ds2.f2181c) {
                vr2VarM1126j = ds2.m1126j();
                ((hs2) ds2.m1131o(hs2Var2, this, vr2VarM1126j, hs2Var)).f4125c = j;
            }
            ds2.m1130n(vr2VarM1126j, this);
        }
    }

    @Override // p000.xk1
    public final void setValue(Object obj) {
        m2985h(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((hs2) ds2.m1124h(this.f6371i)).f4125c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(m2984g());
    }
}
