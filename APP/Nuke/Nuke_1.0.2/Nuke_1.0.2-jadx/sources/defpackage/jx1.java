package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jx1 extends qu2 implements Parcelable, is2, gu2, xk1 {
    public static final Parcelable.Creator<jx1> CREATOR = new d5(3);
    public fs2 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jx1(float f) {
        vr2 vr2VarJ = ds2.j();
        fs2 fs2Var = new fs2(f, vr2VarJ.g());
        if (!(vr2VarJ instanceof hq0)) {
            fs2Var.b = new fs2(f, 1L);
        }
        this.i = fs2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pu2
    public final ru2 a() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pu2
    public final ru2 b(ru2 ru2Var, ru2 ru2Var2, ru2 ru2Var3) {
        if (((fs2) ru2Var2).c == ((fs2) ru2Var3).c) {
            return ru2Var2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pu2
    public final void c(ru2 ru2Var) {
        ru2Var.getClass();
        this.i = (fs2) ru2Var;
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
    public final float g() {
        return ((fs2) ds2.t(this.i, this)).c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gu2
    public final Object getValue() {
        return Float.valueOf(g());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(float f) {
        vr2 vr2VarJ;
        fs2 fs2Var = (fs2) ds2.h(this.i);
        if (fs2Var.c == f) {
            return;
        }
        fs2 fs2Var2 = this.i;
        synchronized (ds2.c) {
            vr2VarJ = ds2.j();
            ((fs2) ds2.o(fs2Var2, this, vr2VarJ, fs2Var)).c = f;
        }
        ds2.n(vr2VarJ, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xk1
    public final void setValue(Object obj) {
        h(((Number) obj).floatValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MutableFloatState(value=" + ((fs2) ds2.h(this.i)).c + ")@" + hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(g());
    }
}
