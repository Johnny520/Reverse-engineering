package p078r;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import p001A0.C0023I;
import p019K.AbstractC0239b;

/* JADX INFO: renamed from: r.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1063f extends AbstractC0239b {
    public static final Parcelable.Creator<C1063f> CREATOR = null;

    /* JADX INFO: renamed from: c */
    public SparseArray f4081c;

    static {
        CREATOR = new C0023I(6);
    }

    public C1063f(Parcel r6, ClassLoader r7) {
        super(r6, r7);
        int r02 = r6.readInt();
        int[] r1 = new int[r02];
        r6.readIntArray(r1);
        Parcelable[] r62 = r6.readParcelableArray(r7);
        this.f4081c = new SparseArray(r02);
        int r72 = 0;
    L3:
        if (r72 >= r02) goto L5;
        this.f4081c.append(r1[r72], r62[r72]);
        r72 = r72 + 1;
        goto L3
    }

    @Override // p019K.AbstractC0239b, android.os.Parcelable
    public final void writeToParcel(Parcel r6, int r7) {
        super.writeToParcel(r6, r7);
        SparseArray r02 = this.f4081c;
        int r1 = 0;
        if (r02 == null) goto L5;
        int r03 = r02.size();
    L6:
        r6.writeInt(r03);
        int[] r2 = new int[r03];
        Parcelable[] r3 = new Parcelable[r03];
    L7:
        if (r1 >= r03) goto L9;
        r2[r1] = this.f4081c.keyAt(r1);
        r3[r1] = (Parcelable) this.f4081c.valueAt(r1);
        r1 = r1 + 1;
        goto L7
    L9:
        r6.writeIntArray(r2);
        r6.writeParcelableArray(r3, r7);
        return;
    L5:
        r03 = 0;
        goto L6
    }
}
