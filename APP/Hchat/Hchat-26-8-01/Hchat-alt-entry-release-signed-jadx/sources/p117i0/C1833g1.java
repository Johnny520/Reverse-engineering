package p117i0;

import android.os.Parcel;
import android.os.Parcelable;
import p322w0.AbstractC4655f;
import p322w0.AbstractC4662m;
import p322w0.AbstractC4671v;
import p322w0.AbstractC4672w;
import p322w0.C4650a;
import p322w0.InterfaceC4663n;

/* JADX INFO: renamed from: i0.g1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1833g1 extends AbstractC4671v implements Parcelable, InterfaceC4663n, InterfaceC1854l2, InterfaceC1809a1 {
    public static final Parcelable.Creator<C1833g1> CREATOR = new C1825e1(1);

    /* JADX INFO: renamed from: h */
    public C1838h2 f6074h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1833g1(int i9) {
        AbstractC4655f abstractC4655fM9129j = AbstractC4662m.m9129j();
        C1838h2 c1838h2 = new C1838h2(abstractC4655fM9129j.mo9109g(), i9);
        if (!(abstractC4655fM9129j instanceof C4650a)) {
            c1838h2.f15551b = new C1838h2(1, i9);
        }
        this.f6074h = c1838h2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.InterfaceC4670u
    /* JADX INFO: renamed from: a */
    public final AbstractC4672w mo4484a() {
        return this.f6074h;
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
        this.f6074h = (C1838h2) abstractC4672w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.InterfaceC4670u
    /* JADX INFO: renamed from: d */
    public final AbstractC4672w mo4487d(AbstractC4672w abstractC4672w, AbstractC4672w abstractC4672w2, AbstractC4672w abstractC4672w3) {
        if (((C1838h2) abstractC4672w2).f6124c == ((C1838h2) abstractC4672w3).f6124c) {
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
    public final int m4492g() {
        return ((C1838h2) AbstractC4662m.m9139t(this.f6074h, this)).f6124c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1854l2
    public final Object getValue() {
        return Integer.valueOf(m4492g());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m4493h(int i9) {
        AbstractC4655f abstractC4655fM9129j;
        C1838h2 c1838h2 = (C1838h2) AbstractC4662m.m9127h(this.f6074h);
        if (c1838h2.f6124c != i9) {
            C1838h2 c1838h22 = this.f6074h;
            synchronized (AbstractC4662m.f15512c) {
                abstractC4655fM9129j = AbstractC4662m.m9129j();
                ((C1838h2) AbstractC4662m.m9134o(c1838h22, this, abstractC4655fM9129j, c1838h2)).f6124c = i9;
            }
            AbstractC4662m.m9133n(abstractC4655fM9129j, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1809a1
    public final void setValue(Object obj) {
        m4493h(((Number) obj).intValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MutableIntState(value=" + ((C1838h2) AbstractC4662m.m9127h(this.f6074h)).f6124c + ")@" + hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(m4492g());
    }
}
