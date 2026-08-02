package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kx1 extends qu2 implements Parcelable, is2, gu2, xk1 {
    public static final Parcelable.Creator<kx1> CREATOR = new d5(4);
    public gs2 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kx1(int i) {
        vr2 vr2VarJ = ds2.j();
        gs2 gs2Var = new gs2(vr2VarJ.g(), i);
        if (!(vr2VarJ instanceof hq0)) {
            gs2Var.b = new gs2(1L, i);
        }
        this.i = gs2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pu2
    public final ru2 a() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pu2
    public final ru2 b(ru2 ru2Var, ru2 ru2Var2, ru2 ru2Var3) {
        if (((gs2) ru2Var2).c == ((gs2) ru2Var3).c) {
            return ru2Var2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pu2
    public final void c(ru2 ru2Var) {
        ru2Var.getClass();
        this.i = (gs2) ru2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.is2
    public final ks2 d() {
        return sn.T;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int g() {
        return ((gs2) ds2.t(this.i, this)).c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gu2
    public final Object getValue() {
        return Integer.valueOf(g());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(int i) {
        vr2 vr2VarJ;
        gs2 gs2Var = (gs2) ds2.h(this.i);
        if (gs2Var.c != i) {
            gs2 gs2Var2 = this.i;
            synchronized (ds2.c) {
                vr2VarJ = ds2.j();
                ((gs2) ds2.o(gs2Var2, this, vr2VarJ, gs2Var)).c = i;
            }
            ds2.n(vr2VarJ, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xk1
    public final void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MutableIntState(value=" + ((gs2) ds2.h(this.i)).c + ")@" + hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(g());
    }
}
