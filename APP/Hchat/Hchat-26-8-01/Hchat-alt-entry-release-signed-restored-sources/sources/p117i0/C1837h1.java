package p117i0;

import android.os.Parcel;
import android.os.Parcelable;
import p322w0.AbstractC4655f;
import p322w0.AbstractC4662m;
import p322w0.AbstractC4671v;
import p322w0.AbstractC4672w;
import p322w0.C4650a;
import p322w0.InterfaceC4663n;

/* JADX INFO: renamed from: i0.h1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1837h1 extends AbstractC4671v implements Parcelable, InterfaceC4663n, InterfaceC1854l2, InterfaceC1809a1 {
    public static final Parcelable.Creator<C1837h1> CREATOR = new C1825e1(2);

    /* JADX INFO: renamed from: h */
    public C1842i2 f6123h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1837h1(long j3) {
        AbstractC4655f abstractC4655fM9129j = AbstractC4662m.m9129j();
        C1842i2 c1842i2 = new C1842i2(abstractC4655fM9129j.mo9109g(), j3);
        if (!(abstractC4655fM9129j instanceof C4650a)) {
            c1842i2.f15551b = new C1842i2(1, j3);
        }
        this.f6123h = c1842i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.InterfaceC4670u
    /* JADX INFO: renamed from: a */
    public final AbstractC4672w mo4484a() {
        return this.f6123h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.InterfaceC4663n
    /* JADX INFO: renamed from: b */
    public final C1823e mo4485b() {
        return C1823e.f6052m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.InterfaceC4670u
    /* JADX INFO: renamed from: c */
    public final void mo4486c(AbstractC4672w abstractC4672w) {
        abstractC4672w.getClass();
        this.f6123h = (C1842i2) abstractC4672w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.InterfaceC4670u
    /* JADX INFO: renamed from: d */
    public final AbstractC4672w mo4487d(AbstractC4672w abstractC4672w, AbstractC4672w abstractC4672w2, AbstractC4672w abstractC4672w3) {
        if (((C1842i2) abstractC4672w2).f6132c == ((C1842i2) abstractC4672w3).f6132c) {
            return abstractC4672w2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final long m4564g() {
        return ((C1842i2) AbstractC4662m.m9139t(this.f6123h, this)).f6132c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1854l2
    public final Object getValue() {
        return Long.valueOf(m4564g());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m4565h(long j3) {
        AbstractC4655f abstractC4655fM9129j;
        C1842i2 c1842i2 = (C1842i2) AbstractC4662m.m9127h(this.f6123h);
        if (c1842i2.f6132c != j3) {
            C1842i2 c1842i22 = this.f6123h;
            synchronized (AbstractC4662m.f15512c) {
                abstractC4655fM9129j = AbstractC4662m.m9129j();
                ((C1842i2) AbstractC4662m.m9134o(c1842i22, this, abstractC4655fM9129j, c1842i2)).f6132c = j3;
            }
            AbstractC4662m.m9133n(abstractC4655fM9129j, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1809a1
    public final void setValue(Object obj) {
        m4565h(((Number) obj).longValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MutableLongState(value=" + ((C1842i2) AbstractC4662m.m9127h(this.f6123h)).f6132c + ")@" + hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(m4564g());
    }
}
