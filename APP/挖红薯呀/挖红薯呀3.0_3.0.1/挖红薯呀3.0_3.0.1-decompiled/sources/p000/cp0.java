package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class cp0 extends e41 implements Parcelable, x21, w31, oh0 {
    public static final Parcelable.Creator<cp0> CREATOR = new C0534o1(3);

    /* JADX INFO: renamed from: e */
    public u21 f872e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cp0(float f) {
        l21 l21VarM4172j = t21.m4172j();
        u21 u21Var = new u21(f, l21VarM4172j.mo811g());
        if (!(l21VarM4172j instanceof C0668qx)) {
            u21Var.f1578b = new u21(f, 1L);
        }
        this.f872e = u21Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.d41
    /* JADX INFO: renamed from: a */
    public final f41 mo440a() {
        return this.f872e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.d41
    /* JADX INFO: renamed from: b */
    public final f41 mo594b(f41 f41Var, f41 f41Var2, f41 f41Var3) {
        if (((u21) f41Var2).f6116c == ((u21) f41Var3).f6116c) {
            return f41Var2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.d41
    /* JADX INFO: renamed from: c */
    public final void mo441c(f41 f41Var) {
        f41Var.getClass();
        this.f872e = (u21) f41Var;
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
    public final float m596g() {
        return ((u21) t21.m4182t(this.f872e, this)).f6116c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.w31
    public final Object getValue() {
        return Float.valueOf(m596g());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m597h(float f) {
        l21 l21VarM4172j;
        u21 u21Var = (u21) t21.m4170h(this.f872e);
        if (u21Var.f6116c == f) {
            return;
        }
        u21 u21Var2 = this.f872e;
        synchronized (t21.f5893c) {
            l21VarM4172j = t21.m4172j();
            ((u21) t21.m4177o(u21Var2, this, l21VarM4172j, u21Var)).f6116c = f;
        }
        t21.m4176n(l21VarM4172j, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oh0
    public final void setValue(Object obj) {
        m597h(((Number) obj).floatValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MutableFloatState(value=" + ((u21) t21.m4170h(this.f872e)).f6116c + ")@" + hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(m596g());
    }
}
