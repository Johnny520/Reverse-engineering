package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class dp0 extends e41 implements Parcelable, wg0, x21 {
    public static final Parcelable.Creator<dp0> CREATOR = new C0534o1(4);

    /* JADX INFO: renamed from: e */
    public v21 f1165e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public dp0(int i) {
        l21 l21VarM4172j = t21.m4172j();
        v21 v21Var = new v21(i, l21VarM4172j.mo811g());
        if (!(l21VarM4172j instanceof C0668qx)) {
            v21Var.f1578b = new v21(i, 1L);
        }
        this.f1165e = v21Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.d41
    /* JADX INFO: renamed from: a */
    public final f41 mo440a() {
        return this.f1165e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.d41
    /* JADX INFO: renamed from: b */
    public final f41 mo594b(f41 f41Var, f41 f41Var2, f41 f41Var3) {
        if (((v21) f41Var2).f6390c == ((v21) f41Var3).f6390c) {
            return f41Var2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.d41
    /* JADX INFO: renamed from: c */
    public final void mo441c(f41 f41Var) {
        f41Var.getClass();
        this.f1165e = (v21) f41Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.x21
    /* JADX INFO: renamed from: d */
    public final C0496n2 mo595d() {
        return C0496n2.f4141U;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final int m720g() {
        return ((v21) t21.m4182t(this.f1165e, this)).f6390c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m721h(int i) {
        l21 l21VarM4172j;
        v21 v21Var = (v21) t21.m4170h(this.f1165e);
        if (v21Var.f6390c != i) {
            v21 v21Var2 = this.f1165e;
            synchronized (t21.f5893c) {
                l21VarM4172j = t21.m4172j();
                ((v21) t21.m4177o(v21Var2, this, l21VarM4172j, v21Var)).f6390c = i;
            }
            t21.m4176n(l21VarM4172j, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MutableIntState(value=" + ((v21) t21.m4170h(this.f1165e)).f6390c + ")@" + hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(m720g());
    }
}
