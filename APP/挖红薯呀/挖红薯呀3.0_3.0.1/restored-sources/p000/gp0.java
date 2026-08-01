package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class gp0 extends e41 implements Parcelable, x21 {
    public static final Parcelable.Creator<gp0> CREATOR = new fp0();

    /* JADX INFO: renamed from: e */
    public final C0496n2 f2031e;

    /* JADX INFO: renamed from: f */
    public y21 f2032f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public gp0(Object obj, C0496n2 c0496n2) {
        this.f2031e = c0496n2;
        l21 l21VarM4172j = t21.m4172j();
        y21 y21Var = new y21(l21VarM4172j.mo811g(), obj);
        if (!(l21VarM4172j instanceof C0668qx)) {
            y21Var.f1578b = new y21(1L, obj);
        }
        this.f2032f = y21Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.d41
    /* JADX INFO: renamed from: a */
    public final f41 mo440a() {
        return this.f2032f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.d41
    /* JADX INFO: renamed from: b */
    public final f41 mo594b(f41 f41Var, f41 f41Var2, f41 f41Var3) {
        if (this.f2031e.m2629g(((y21) f41Var2).f7499c, ((y21) f41Var3).f7499c)) {
            return f41Var2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.d41
    /* JADX INFO: renamed from: c */
    public final void mo441c(f41 f41Var) {
        f41Var.getClass();
        this.f2032f = (y21) f41Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.x21
    /* JADX INFO: renamed from: d */
    public final C0496n2 mo595d() {
        return this.f2031e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.w31
    public final Object getValue() {
        return ((y21) t21.m4182t(this.f2032f, this)).f7499c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oh0
    public final void setValue(Object obj) {
        l21 l21VarM4172j;
        y21 y21Var = (y21) t21.m4170h(this.f2032f);
        if (this.f2031e.m2629g(y21Var.f7499c, obj)) {
            return;
        }
        y21 y21Var2 = this.f2032f;
        synchronized (t21.f5893c) {
            l21VarM4172j = t21.m4172j();
            ((y21) t21.m4177o(y21Var2, this, l21VarM4172j, y21Var)).f7499c = obj;
        }
        t21.m4176n(l21VarM4172j, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MutableState(value=" + ((y21) t21.m4170h(this.f2032f)).f7499c + ")@" + hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        C0496n2 c0496n2 = C0496n2.f4133M;
        C0496n2 c0496n22 = this.f2031e;
        if (p30.m3002l(c0496n22, c0496n2)) {
            i2 = 0;
        } else if (p30.m3002l(c0496n22, C0496n2.f4141U)) {
            i2 = 1;
        } else {
            if (!p30.m3002l(c0496n22, C0496n2.f4138R)) {
                C0921xc.m5134o("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
