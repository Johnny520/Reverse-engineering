package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class nx1 extends qu2 implements Parcelable, is2 {
    public static final Parcelable.Creator<nx1> CREATOR = new mx1();
    public final ks2 i;
    public js2 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public nx1(Object obj, ks2 ks2Var) {
        this.i = ks2Var;
        vr2 vr2VarJ = ds2.j();
        js2 js2Var = new js2(vr2VarJ.g(), obj);
        if (!(vr2VarJ instanceof hq0)) {
            js2Var.b = new js2(1L, obj);
        }
        this.j = js2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pu2
    public final ru2 a() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pu2
    public final ru2 b(ru2 ru2Var, ru2 ru2Var2, ru2 ru2Var3) {
        if (this.i.c(((js2) ru2Var2).c, ((js2) ru2Var3).c)) {
            return ru2Var2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pu2
    public final void c(ru2 ru2Var) {
        ru2Var.getClass();
        this.j = (js2) ru2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.is2
    public final ks2 d() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gu2
    public final Object getValue() {
        return ((js2) ds2.t(this.j, this)).c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xk1
    public final void setValue(Object obj) {
        vr2 vr2VarJ;
        js2 js2Var = (js2) ds2.h(this.j);
        if (this.i.c(js2Var.c, obj)) {
            return;
        }
        js2 js2Var2 = this.j;
        synchronized (ds2.c) {
            vr2VarJ = ds2.j();
            ((js2) ds2.o(js2Var2, this, vr2VarJ, js2Var)).c = obj;
        }
        ds2.n(vr2VarJ, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MutableState(value=" + ((js2) ds2.h(this.j)).c + ")@" + hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        gd3 gd3Var = gd3.C;
        ks2 ks2Var = this.i;
        if (t11.l(ks2Var, gd3Var)) {
            i2 = 0;
        } else if (t11.l(ks2Var, sn.T)) {
            i2 = 1;
        } else {
            if (!t11.l(ks2Var, sn.P)) {
                s.l("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
