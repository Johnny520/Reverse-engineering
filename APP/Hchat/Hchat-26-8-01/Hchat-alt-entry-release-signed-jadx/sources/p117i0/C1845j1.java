package p117i0;

import android.os.Parcel;
import android.os.Parcelable;
import gg.AbstractC1416l;
import p136j8.C2104o;
import p322w0.AbstractC4655f;
import p322w0.AbstractC4662m;
import p322w0.AbstractC4671v;
import p322w0.AbstractC4672w;
import p322w0.C4650a;
import p322w0.InterfaceC4663n;

/* JADX INFO: renamed from: i0.j1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1845j1 extends AbstractC4671v implements Parcelable, InterfaceC4663n {
    public static final Parcelable.Creator<C1845j1> CREATOR = new C1841i1();

    /* JADX INFO: renamed from: h */
    public final C1823e f6143h;

    /* JADX INFO: renamed from: i */
    public C1846j2 f6144i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1845j1(Object obj, C1823e c1823e) {
        this.f6143h = c1823e;
        AbstractC4655f abstractC4655fM9129j = AbstractC4662m.m9129j();
        C1846j2 c1846j2 = new C1846j2(obj, abstractC4655fM9129j.mo9109g());
        if (!(abstractC4655fM9129j instanceof C4650a)) {
            c1846j2.f15551b = new C1846j2(obj, 1);
        }
        this.f6144i = c1846j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.InterfaceC4670u
    /* JADX INFO: renamed from: a */
    public final AbstractC4672w mo4484a() {
        return this.f6144i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.InterfaceC4663n
    /* JADX INFO: renamed from: b */
    public final C1823e mo4485b() {
        return this.f6143h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.InterfaceC4670u
    /* JADX INFO: renamed from: c */
    public final void mo4486c(AbstractC4672w abstractC4672w) {
        abstractC4672w.getClass();
        this.f6144i = (C1846j2) abstractC4672w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.InterfaceC4670u
    /* JADX INFO: renamed from: d */
    public final AbstractC4672w mo4487d(AbstractC4672w abstractC4672w, AbstractC4672w abstractC4672w2, AbstractC4672w abstractC4672w3) {
        if (this.f6143h.m4460b(((C1846j2) abstractC4672w2).f6145c, ((C1846j2) abstractC4672w3).f6145c)) {
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
    @Override // p117i0.InterfaceC1854l2
    public final Object getValue() {
        return ((C1846j2) AbstractC4662m.m9139t(this.f6144i, this)).f6145c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1809a1
    public final void setValue(Object obj) {
        AbstractC4655f abstractC4655fM9129j;
        C1846j2 c1846j2 = (C1846j2) AbstractC4662m.m9127h(this.f6144i);
        if (this.f6143h.m4460b(c1846j2.f6145c, obj)) {
            return;
        }
        C1846j2 c1846j22 = this.f6144i;
        synchronized (AbstractC4662m.f15512c) {
            abstractC4655fM9129j = AbstractC4662m.m9129j();
            ((C1846j2) AbstractC4662m.m9134o(c1846j22, this, abstractC4655fM9129j, c1846j2)).f6145c = obj;
        }
        AbstractC4662m.m9133n(abstractC4655fM9129j, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MutableState(value=" + ((C1846j2) AbstractC4662m.m9127h(this.f6144i)).f6145c + ")@" + hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int i10;
        parcel.writeValue(getValue());
        C1823e c1823e = C1823e.f6049j;
        C1823e c1823e2 = this.f6143h;
        if (AbstractC1416l.m3825a(c1823e2, c1823e)) {
            i10 = 0;
        } else if (AbstractC1416l.m3825a(c1823e2, C1823e.f6052m)) {
            i10 = 1;
        } else {
            if (!AbstractC1416l.m3825a(c1823e2, C1823e.f6050k)) {
                C2104o.m5276A("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i10 = 2;
        }
        parcel.writeInt(i10);
    }
}
