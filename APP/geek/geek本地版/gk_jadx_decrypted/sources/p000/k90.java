package p000;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class k90 extends j90 {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f2738d;

    /* JADX INFO: renamed from: e */
    public final Parcel f2739e;

    /* JADX INFO: renamed from: f */
    public final int f2740f;

    /* JADX INFO: renamed from: g */
    public final int f2741g;

    /* JADX INFO: renamed from: h */
    public final String f2742h;

    /* JADX INFO: renamed from: i */
    public int f2743i;

    /* JADX INFO: renamed from: j */
    public int f2744j;

    /* JADX INFO: renamed from: k */
    public int f2745k;

    public k90(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0511n6(), new C0511n6(), new C0511n6());
    }

    @Override // p000.j90
    /* JADX INFO: renamed from: a */
    public final k90 mo1555a() {
        Parcel parcel = this.f2739e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f2744j;
        if (i == this.f2740f) {
            i = this.f2741g;
        }
        return new k90(parcel, iDataPosition, i, z30.m2767l(new StringBuilder(), this.f2742h, "  "), this.f2597a, this.f2598b, this.f2599c);
    }

    @Override // p000.j90
    /* JADX INFO: renamed from: e */
    public final boolean mo1559e(int i) {
        while (this.f2744j < this.f2741g) {
            int i2 = this.f2745k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f2744j;
            Parcel parcel = this.f2739e;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.f2745k = parcel.readInt();
            this.f2744j += i4;
        }
        return this.f2745k == i;
    }

    @Override // p000.j90
    /* JADX INFO: renamed from: h */
    public final void mo1562h(int i) {
        int i2 = this.f2743i;
        SparseIntArray sparseIntArray = this.f2738d;
        Parcel parcel = this.f2739e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.f2743i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public k90(Parcel parcel, int i, int i2, String str, C0511n6 c0511n6, C0511n6 c0511n62, C0511n6 c0511n63) {
        super(c0511n6, c0511n62, c0511n63);
        this.f2738d = new SparseIntArray();
        this.f2743i = -1;
        this.f2745k = -1;
        this.f2739e = parcel;
        this.f2740f = i;
        this.f2741g = i2;
        this.f2744j = i;
        this.f2742h = str;
    }
}
