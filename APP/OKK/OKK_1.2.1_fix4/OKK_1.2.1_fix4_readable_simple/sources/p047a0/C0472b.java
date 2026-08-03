package p047a0;

import android.os.Parcel;
import android.util.SparseIntArray;
import p063j.C0957b;

/* JADX INFO: renamed from: a0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0472b extends AbstractC0471a {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f1053d;

    /* JADX INFO: renamed from: e */
    public final Parcel f1054e;

    /* JADX INFO: renamed from: f */
    public final int f1055f;

    /* JADX INFO: renamed from: g */
    public final int f1056g;

    /* JADX INFO: renamed from: h */
    public final String f1057h;

    /* JADX INFO: renamed from: i */
    public int f1058i;

    /* JADX INFO: renamed from: j */
    public int f1059j;

    /* JADX INFO: renamed from: k */
    public int f1060k;

    public C0472b(Parcel r9) {
        this(r9, r9.dataPosition(), r9.dataSize(), "", new C0957b(), new C0957b(), new C0957b());
    }

    @Override // p047a0.AbstractC0471a
    /* JADX INFO: renamed from: a */
    public final C0472b mo1102a() {
        Parcel r1 = this.f1054e;
        int r2 = r1.dataPosition();
        int r02 = this.f1059j;
        if (r02 != this.f1055f) goto L6;
        r02 = this.f1056g;
    L6:
        return new C0472b(r1, r2, r02, this.f1057h + "  ", this.f1050a, this.f1051b, this.f1052c);
    }

    @Override // p047a0.AbstractC0471a
    /* JADX INFO: renamed from: e */
    public final boolean mo1106e(int r5) {
    L3:
        if (this.f1059j >= this.f1056g) goto L12;
        int r02 = this.f1060k;
        if (r02 == r5) goto L6;
        if (String.valueOf(r02).compareTo(String.valueOf(r5)) > 0) goto L9;
        int r03 = this.f1059j;
        Parcel r1 = this.f1054e;
        r1.setDataPosition(r03);
        int r04 = r1.readInt();
        this.f1060k = r1.readInt();
        this.f1059j += r04;
        goto L3
    L9:
        return false;
    L6:
        return true;
    L12:
        if (this.f1060k == r5) goto L14;
        return false;
    L14:
        return true;
    }

    @Override // p047a0.AbstractC0471a
    /* JADX INFO: renamed from: h */
    public final void mo1109h(int r6) {
        int r02 = this.f1058i;
        SparseIntArray r1 = this.f1053d;
        Parcel r2 = this.f1054e;
        if (r02 < 0) goto L5;
        int r03 = r1.get(r02);
        int r3 = r2.dataPosition();
        r2.setDataPosition(r03);
        r2.writeInt(r3 - r03);
        r2.setDataPosition(r3);
    L5:
        this.f1058i = r6;
        r1.put(r6, r2.dataPosition());
        r2.writeInt(0);
        r2.writeInt(r6);
    }

    public C0472b(Parcel r1, int r2, int r3, String r4, C0957b r5, C0957b r6, C0957b r7) {
        super(r5, r6, r7);
        this.f1053d = new SparseIntArray();
        this.f1058i = -1;
        this.f1060k = -1;
        this.f1054e = r1;
        this.f1055f = r2;
        this.f1056g = r3;
        this.f1059j = r2;
        this.f1057h = r4;
    }
}
