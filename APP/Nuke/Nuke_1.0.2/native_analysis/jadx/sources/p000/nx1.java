package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nx1 extends qu2 implements Parcelable, is2 {
    public static final Parcelable.Creator<nx1> CREATOR = new mx1();

    /* JADX INFO: renamed from: i */
    public final ks2 f7362i;

    /* JADX INFO: renamed from: j */
    public js2 f7363j;

    public nx1(Object obj, ks2 ks2Var) {
        this.f7362i = ks2Var;
        vr2 vr2VarM1126j = ds2.m1126j();
        js2 js2Var = new js2(vr2VarM1126j.mo79g(), obj);
        if (!(vr2VarM1126j instanceof hq0)) {
            js2Var.f9761b = new js2(1L, obj);
        }
        this.f7363j = js2Var;
    }

    @Override // p000.pu2
    /* JADX INFO: renamed from: a */
    public final ru2 mo2588a() {
        return this.f7363j;
    }

    @Override // p000.pu2
    /* JADX INFO: renamed from: b */
    public final ru2 mo2589b(ru2 ru2Var, ru2 ru2Var2, ru2 ru2Var3) {
        if (this.f7362i.mo1841c(((js2) ru2Var2).f5197c, ((js2) ru2Var3).f5197c)) {
            return ru2Var2;
        }
        return null;
    }

    @Override // p000.pu2
    /* JADX INFO: renamed from: c */
    public final void mo2590c(ru2 ru2Var) {
        ru2Var.getClass();
        this.f7363j = (js2) ru2Var;
    }

    @Override // p000.is2
    /* JADX INFO: renamed from: d */
    public final ks2 mo2391d() {
        return this.f7362i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000.gu2
    public final Object getValue() {
        return ((js2) ds2.m1136t(this.f7363j, this)).f5197c;
    }

    @Override // p000.xk1
    public final void setValue(Object obj) {
        vr2 vr2VarM1126j;
        js2 js2Var = (js2) ds2.m1124h(this.f7363j);
        if (this.f7362i.mo1841c(js2Var.f5197c, obj)) {
            return;
        }
        js2 js2Var2 = this.f7363j;
        synchronized (ds2.f2181c) {
            vr2VarM1126j = ds2.m1126j();
            ((js2) ds2.m1131o(js2Var2, this, vr2VarM1126j, js2Var)).f5197c = obj;
        }
        ds2.m1130n(vr2VarM1126j, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((js2) ds2.m1124h(this.f7363j)).f5197c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        gd3 gd3Var = gd3.f3416C;
        ks2 ks2Var = this.f7362i;
        if (t11.m5086l(ks2Var, gd3Var)) {
            i2 = 0;
        } else if (t11.m5086l(ks2Var, C0700sn.f10216T)) {
            i2 = 1;
        } else {
            if (!t11.m5086l(ks2Var, C0700sn.f10212P)) {
                C0676s.m4653l("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
