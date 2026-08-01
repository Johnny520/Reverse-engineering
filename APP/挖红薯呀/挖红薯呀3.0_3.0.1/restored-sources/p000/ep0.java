package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ep0 extends e41 implements Parcelable, x21, w31, oh0 {
    public static final Parcelable.Creator<ep0> CREATOR = new C0534o1(5);

    /* JADX INFO: renamed from: e */
    public w21 f1502e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ep0(long j) {
        l21 l21VarM4172j = t21.m4172j();
        w21 w21Var = new w21(l21VarM4172j.mo811g(), j);
        if (!(l21VarM4172j instanceof C0668qx)) {
            w21Var.f1578b = new w21(1L, j);
        }
        this.f1502e = w21Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.d41
    /* JADX INFO: renamed from: a */
    public final f41 mo440a() {
        return this.f1502e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.d41
    /* JADX INFO: renamed from: b */
    public final f41 mo594b(f41 f41Var, f41 f41Var2, f41 f41Var3) {
        if (((w21) f41Var2).f6905c == ((w21) f41Var3).f6905c) {
            return f41Var2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.d41
    /* JADX INFO: renamed from: c */
    public final void mo441c(f41 f41Var) {
        f41Var.getClass();
        this.f1502e = (w21) f41Var;
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
    public final long m951g() {
        return ((w21) t21.m4182t(this.f1502e, this)).f6905c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.w31
    public final Object getValue() {
        return Long.valueOf(m951g());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m952h(long j) {
        l21 l21VarM4172j;
        w21 w21Var = (w21) t21.m4170h(this.f1502e);
        if (w21Var.f6905c != j) {
            w21 w21Var2 = this.f1502e;
            synchronized (t21.f5893c) {
                l21VarM4172j = t21.m4172j();
                ((w21) t21.m4177o(w21Var2, this, l21VarM4172j, w21Var)).f6905c = j;
            }
            t21.m4176n(l21VarM4172j, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oh0
    public final void setValue(Object obj) {
        m952h(((Number) obj).longValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MutableLongState(value=" + ((w21) t21.m4170h(this.f1502e)).f6905c + ")@" + hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(m951g());
    }
}
