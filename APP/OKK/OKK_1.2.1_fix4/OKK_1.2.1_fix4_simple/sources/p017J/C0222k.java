package p017J;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import p037U.C0360U;
import p037U.C0361V;
import p037U.C0384t;

/* JADX INFO: renamed from: J.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0222k implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f463a;

    public /* synthetic */ C0222k(int r1) {
        this.f463a = r1;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r5) {
        switch(this.f463a) {
            case 0: goto L39;
            case 1: goto L33;
            case 2: goto L25;
            case 3: goto L6;
            default: goto L5;
        };
    L6:
        C0361V r02 = new C0361V();
        r02.f751a = r5.readInt();
        r02.f752b = r5.readInt();
        int r1 = r5.readInt();
        r02.f753c = r1;
        if (r1 <= 0) goto L9;
        int[] r12 = new int[r1];
        r02.f754d = r12;
        r5.readIntArray(r12);
    L9:
        int r13 = r5.readInt();
        r02.f755e = r13;
        if (r13 <= 0) goto L12;
        int[] r14 = new int[r13];
        r02.f756f = r14;
        r5.readIntArray(r14);
    L12:
        boolean r2 = false;
        if (r5.readInt() != 1) goto L15;
        boolean r15 = true;
    L16:
        r02.f758h = r15;
        if (r5.readInt() != 1) goto L19;
        boolean r16 = true;
    L20:
        r02.f759i = r16;
        if (r5.readInt() != 1) goto L23;
        r2 = true;
    L23:
        r02.f760j = r2;
        r02.f757g = r5.readArrayList(C0360U.class.getClassLoader());
        return r02;
    L19:
        r16 = false;
        goto L20
    L15:
        r15 = false;
        goto L16
    L25:
        C0360U r03 = new C0360U();
        r03.f747a = r5.readInt();
        r03.f748b = r5.readInt();
        boolean r22 = true;
        if (r5.readInt() == 1) goto L29;
        r22 = false;
    L29:
        r03.f750d = r22;
        int r17 = r5.readInt();
        if (r17 <= 0) goto L32;
        int[] r18 = new int[r17];
        r03.f749c = r18;
        r5.readIntArray(r18);
    L32:
        return r03;
    L33:
        C0384t r04 = new C0384t();
        r04.f869a = r5.readInt();
        r04.f870b = r5.readInt();
        boolean r19 = true;
        if (r5.readInt() == 1) goto L37;
        r19 = false;
    L37:
        r04.f871c = r19;
        return r04;
    L39:
        C0223l r05 = new C0223l(r5);
        r05.f464a = r5.readInt();
        return r05;
    L5:
        return new ParcelImpl(r5);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r2) {
        switch(this.f463a) {
            case 0: goto L13;
            case 1: goto L11;
            case 2: goto L9;
            case 3: goto L7;
            default: goto L5;
        };
    L5:
        return new ParcelImpl[r2];
    L7:
        return new C0361V[r2];
    L9:
        return new C0360U[r2];
    L11:
        return new C0384t[r2];
    L13:
        return new C0223l[r2];
    }
}
