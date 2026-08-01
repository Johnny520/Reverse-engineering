package p064M1;

import android.os.Parcel;
import android.util.SparseIntArray;
import p011B4.AbstractC0231b;
import p186k.C2423e;

/* JADX INFO: renamed from: M1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0996c extends AbstractC0995b {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f3074d;

    /* JADX INFO: renamed from: e */
    public final Parcel f3075e;

    /* JADX INFO: renamed from: f */
    public final int f3076f;

    /* JADX INFO: renamed from: g */
    public final int f3077g;

    /* JADX INFO: renamed from: h */
    public final String f3078h;

    /* JADX INFO: renamed from: i */
    public int f3079i;

    /* JADX INFO: renamed from: j */
    public int f3080j;

    /* JADX INFO: renamed from: k */
    public int f3081k;

    public C0996c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C2423e(0), new C2423e(0), new C2423e(0));
    }

    @Override // p064M1.AbstractC0995b
    /* JADX INFO: renamed from: a */
    public final C0996c mo2040a() {
        Parcel parcel = this.f3075e;
        int iDataPosition = parcel.dataPosition();
        int i5 = this.f3080j;
        if (i5 == this.f3076f) {
            i5 = this.f3077g;
        }
        return new C0996c(parcel, iDataPosition, i5, AbstractC0231b.m403n(new StringBuilder(), this.f3078h, "  "), this.f3071a, this.f3072b, this.f3073c);
    }

    @Override // p064M1.AbstractC0995b
    /* JADX INFO: renamed from: e */
    public final boolean mo2044e(int i5) {
        while (this.f3080j < this.f3077g) {
            int i6 = this.f3081k;
            if (i6 == i5) {
                return true;
            }
            if (String.valueOf(i6).compareTo(String.valueOf(i5)) > 0) {
                return false;
            }
            int i7 = this.f3080j;
            Parcel parcel = this.f3075e;
            parcel.setDataPosition(i7);
            int i8 = parcel.readInt();
            this.f3081k = parcel.readInt();
            this.f3080j += i8;
        }
        return this.f3081k == i5;
    }

    @Override // p064M1.AbstractC0995b
    /* JADX INFO: renamed from: h */
    public final void mo2047h(int i5) {
        int i6 = this.f3079i;
        SparseIntArray sparseIntArray = this.f3074d;
        Parcel parcel = this.f3075e;
        if (i6 >= 0) {
            int i7 = sparseIntArray.get(i6);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i7);
            parcel.writeInt(iDataPosition - i7);
            parcel.setDataPosition(iDataPosition);
        }
        this.f3079i = i5;
        sparseIntArray.put(i5, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i5);
    }

    public C0996c(Parcel parcel, int i5, int i6, String str, C2423e c2423e, C2423e c2423e2, C2423e c2423e3) {
        super(c2423e, c2423e2, c2423e3);
        this.f3074d = new SparseIntArray();
        this.f3079i = -1;
        this.f3081k = -1;
        this.f3075e = parcel;
        this.f3076f = i5;
        this.f3077g = i6;
        this.f3080j = i5;
        this.f3078h = str;
    }
}
