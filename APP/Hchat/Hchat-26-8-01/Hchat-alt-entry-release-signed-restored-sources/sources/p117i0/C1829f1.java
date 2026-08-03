package p117i0;

import android.os.Parcel;
import android.os.Parcelable;
import p322w0.AbstractC4655f;
import p322w0.AbstractC4662m;
import p322w0.AbstractC4671v;
import p322w0.AbstractC4672w;
import p322w0.C4650a;
import p322w0.InterfaceC4663n;

/* JADX INFO: renamed from: i0.f1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1829f1 extends AbstractC4671v implements Parcelable, InterfaceC4663n, InterfaceC1854l2, InterfaceC1809a1 {
    public static final Parcelable.Creator<C1829f1> CREATOR = new C1825e1(0);

    /* JADX INFO: renamed from: h */
    public C1834g2 f6063h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1829f1(float f3) {
        AbstractC4655f abstractC4655fM9129j = AbstractC4662m.m9129j();
        C1834g2 c1834g2 = new C1834g2(abstractC4655fM9129j.mo9109g(), f3);
        if (!(abstractC4655fM9129j instanceof C4650a)) {
            c1834g2.f15551b = new C1834g2(1, f3);
        }
        this.f6063h = c1834g2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.InterfaceC4670u
    /* JADX INFO: renamed from: a */
    public final AbstractC4672w mo4484a() {
        return this.f6063h;
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
        this.f6063h = (C1834g2) abstractC4672w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.InterfaceC4670u
    /* JADX INFO: renamed from: d */
    public final AbstractC4672w mo4487d(AbstractC4672w abstractC4672w, AbstractC4672w abstractC4672w2, AbstractC4672w abstractC4672w3) {
        if (((C1834g2) abstractC4672w2).f6075c == ((C1834g2) abstractC4672w3).f6075c) {
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
    public final float m4488g() {
        return ((C1834g2) AbstractC4662m.m9139t(this.f6063h, this)).f6075c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1854l2
    public final Object getValue() {
        return Float.valueOf(m4488g());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m4489h(float f3) {
        AbstractC4655f abstractC4655fM9129j;
        C1834g2 c1834g2 = (C1834g2) AbstractC4662m.m9127h(this.f6063h);
        if (c1834g2.f6075c == f3) {
            return;
        }
        C1834g2 c1834g22 = this.f6063h;
        synchronized (AbstractC4662m.f15512c) {
            abstractC4655fM9129j = AbstractC4662m.m9129j();
            ((C1834g2) AbstractC4662m.m9134o(c1834g22, this, abstractC4655fM9129j, c1834g2)).f6075c = f3;
        }
        AbstractC4662m.m9133n(abstractC4655fM9129j, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1809a1
    public final void setValue(Object obj) {
        m4489h(((Number) obj).floatValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MutableFloatState(value=" + ((C1834g2) AbstractC4662m.m9127h(this.f6063h)).f6075c + ")@" + hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeFloat(m4488g());
    }
}
