package p000;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ja3 extends ia3 {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f4937d;

    /* JADX INFO: renamed from: e */
    public final Parcel f4938e;

    /* JADX INFO: renamed from: f */
    public final int f4939f;

    /* JADX INFO: renamed from: g */
    public final int f4940g;

    /* JADX INFO: renamed from: h */
    public final String f4941h;

    /* JADX INFO: renamed from: i */
    public int f4942i;

    /* JADX INFO: renamed from: j */
    public int f4943j;

    /* JADX INFO: renamed from: k */
    public int f4944k;

    public ja3(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0276hg(0), new C0276hg(0), new C0276hg(0));
    }

    @Override // p000.ia3
    /* JADX INFO: renamed from: a */
    public final ja3 mo2308a() {
        Parcel parcel = this.f4938e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f4943j;
        if (i == this.f4939f) {
            i = this.f4940g;
        }
        return new ja3(parcel, iDataPosition, i, hk1.m2211j(new StringBuilder(), this.f4941h, "  "), this.f4511a, this.f4512b, this.f4513c);
    }

    @Override // p000.ia3
    /* JADX INFO: renamed from: e */
    public final boolean mo2312e(int i) {
        while (true) {
            int i2 = this.f4943j;
            int i3 = this.f4944k;
            if (i2 >= this.f4940g) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.f4943j;
            Parcel parcel = this.f4938e;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.f4944k = parcel.readInt();
            this.f4943j += i5;
        }
    }

    @Override // p000.ia3
    /* JADX INFO: renamed from: h */
    public final void mo2315h(int i) {
        int i2 = this.f4942i;
        SparseIntArray sparseIntArray = this.f4937d;
        Parcel parcel = this.f4938e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.f4942i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public ja3(Parcel parcel, int i, int i2, String str, C0276hg c0276hg, C0276hg c0276hg2, C0276hg c0276hg3) {
        super(c0276hg, c0276hg2, c0276hg3);
        this.f4937d = new SparseIntArray();
        this.f4942i = -1;
        this.f4944k = -1;
        this.f4938e = parcel;
        this.f4939f = i;
        this.f4940g = i2;
        this.f4943j = i;
        this.f4941h = str;
    }
}
