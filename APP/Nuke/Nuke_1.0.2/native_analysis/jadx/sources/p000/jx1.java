package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jx1 extends qu2 implements Parcelable, is2, gu2, xk1 {
    public static final Parcelable.Creator<jx1> CREATOR = new C0118d5(3);

    /* JADX INFO: renamed from: i */
    public fs2 f5255i;

    public jx1(float f) {
        vr2 vr2VarM1126j = ds2.m1126j();
        fs2 fs2Var = new fs2(f, vr2VarM1126j.mo79g());
        if (!(vr2VarM1126j instanceof hq0)) {
            fs2Var.f9761b = new fs2(f, 1L);
        }
        this.f5255i = fs2Var;
    }

    @Override // p000.pu2
    /* JADX INFO: renamed from: a */
    public final ru2 mo2588a() {
        return this.f5255i;
    }

    @Override // p000.pu2
    /* JADX INFO: renamed from: b */
    public final ru2 mo2589b(ru2 ru2Var, ru2 ru2Var2, ru2 ru2Var3) {
        if (((fs2) ru2Var2).f3130c == ((fs2) ru2Var3).f3130c) {
            return ru2Var2;
        }
        return null;
    }

    @Override // p000.pu2
    /* JADX INFO: renamed from: c */
    public final void mo2590c(ru2 ru2Var) {
        ru2Var.getClass();
        this.f5255i = (fs2) ru2Var;
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
    public final float m2591g() {
        return ((fs2) ds2.m1136t(this.f5255i, this)).f3130c;
    }

    @Override // p000.gu2
    public final Object getValue() {
        return Float.valueOf(m2591g());
    }

    /* JADX INFO: renamed from: h */
    public final void m2592h(float f) {
        vr2 vr2VarM1126j;
        fs2 fs2Var = (fs2) ds2.m1124h(this.f5255i);
        if (fs2Var.f3130c == f) {
            return;
        }
        fs2 fs2Var2 = this.f5255i;
        synchronized (ds2.f2181c) {
            vr2VarM1126j = ds2.m1126j();
            ((fs2) ds2.m1131o(fs2Var2, this, vr2VarM1126j, fs2Var)).f3130c = f;
        }
        ds2.m1130n(vr2VarM1126j, this);
    }

    @Override // p000.xk1
    public final void setValue(Object obj) {
        m2592h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((fs2) ds2.m1124h(this.f5255i)).f3130c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(m2591g());
    }
}
