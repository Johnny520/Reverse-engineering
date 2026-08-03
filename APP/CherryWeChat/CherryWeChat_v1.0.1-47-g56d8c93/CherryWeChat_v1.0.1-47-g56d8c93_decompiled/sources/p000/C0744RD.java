package p000;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: RD */
/* JADX INFO: loaded from: classes.dex */
public final class C0744RD extends AbstractC0702QD {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f2374d;

    /* JADX INFO: renamed from: e */
    public final Parcel f2375e;

    /* JADX INFO: renamed from: f */
    public final int f2376f;

    /* JADX INFO: renamed from: g */
    public final int f2377g;

    /* JADX INFO: renamed from: h */
    public final String f2378h;

    /* JADX INFO: renamed from: i */
    public int f2379i;

    /* JADX INFO: renamed from: j */
    public int f2380j;

    /* JADX INFO: renamed from: k */
    public int f2381k;

    public C0744RD(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0521M4(0), new C0521M4(0), new C0521M4(0));
    }

    @Override // p000.AbstractC0702QD
    /* JADX INFO: renamed from: a */
    public final C0744RD mo1437a() {
        Parcel parcel = this.f2375e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f2380j;
        if (i == this.f2376f) {
            i = this.f2377g;
        }
        return new C0744RD(parcel, iDataPosition, i, AbstractC0213Ey.m410h(new StringBuilder(), this.f2378h, "  "), this.f2269a, this.f2270b, this.f2271c);
    }

    @Override // p000.AbstractC0702QD
    /* JADX INFO: renamed from: e */
    public final boolean mo1441e(int i) {
        while (this.f2380j < this.f2377g) {
            int i2 = this.f2381k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f2380j;
            Parcel parcel = this.f2375e;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.f2381k = parcel.readInt();
            this.f2380j += i4;
        }
        return this.f2381k == i;
    }

    @Override // p000.AbstractC0702QD
    /* JADX INFO: renamed from: i */
    public final void mo1445i(int i) {
        int i2 = this.f2379i;
        SparseIntArray sparseIntArray = this.f2374d;
        Parcel parcel = this.f2375e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.f2379i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public C0744RD(Parcel parcel, int i, int i2, String str, C0521M4 c0521m4, C0521M4 c0521m42, C0521M4 c0521m43) {
        super(c0521m4, c0521m42, c0521m43);
        this.f2374d = new SparseIntArray();
        this.f2379i = -1;
        this.f2381k = -1;
        this.f2375e = parcel;
        this.f2376f = i;
        this.f2377g = i2;
        this.f2380j = i;
        this.f2378h = str;
    }
}
