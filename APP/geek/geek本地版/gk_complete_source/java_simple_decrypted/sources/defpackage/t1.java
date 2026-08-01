package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t1 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ t1(int r1) {
        this.a = r1;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel r9) {
        switch(this.a) {
            case 0: goto L64;
            case 1: goto L57;
            case 2: goto L56;
            case 3: goto L54;
            case 4: goto L52;
            case 5: goto L49;
            case 6: goto L47;
            case 7: goto L46;
            case 8: goto L39;
            case 9: goto L37;
            case 10: goto L36;
            case 11: goto L33;
            case 12: goto L32;
            case 13: goto L23;
            default: goto L4;
        };
    L4:
        m40 r0 = new m40();
        r0.a = r9.readInt();
        r0.b = r9.readInt();
        int r1 = r9.readInt();
        r0.c = r1;
        if (r1 <= 0) goto L7;
        int[] r12 = new int[r1];
        r0.d = r12;
        r9.readIntArray(r12);
    L7:
        int r13 = r9.readInt();
        r0.e = r13;
        if (r13 <= 0) goto L10;
        int[] r14 = new int[r13];
        r0.f = r14;
        r9.readIntArray(r14);
    L10:
        boolean r2 = false;
        if (r9.readInt() != 1) goto L13;
        boolean r15 = true;
    L14:
        r0.h = r15;
        if (r9.readInt() != 1) goto L17;
        boolean r16 = true;
    L18:
        r0.i = r16;
        if (r9.readInt() != 1) goto L21;
        r2 = true;
    L21:
        r0.j = r2;
        r0.g = r9.readArrayList(l40.class.getClassLoader());
        return r0;
    L17:
        r16 = false;
        goto L18
    L13:
        r15 = false;
        goto L14
    L23:
        l40 r02 = new l40();
        r02.a = r9.readInt();
        r02.b = r9.readInt();
        boolean r22 = true;
        if (r9.readInt() == 1) goto L27;
        r22 = false;
    L27:
        r02.d = r22;
        int r17 = r9.readInt();
        if (r17 <= 0) goto L30;
        int[] r18 = new int[r17];
        r02.c = r18;
        r9.readIntArray(r18);
    L30:
        return r02;
    L33:
        hw r03 = new hw(r9);
        r03.a = r9.readInt();
        return r03;
    L37:
        wt r04 = new wt(r9);
        r04.a = ((Integer) r9.readValue(wt.class.getClassLoader())).intValue();
        return r04;
    L39:
        xq r05 = new xq();
        r05.a = r9.readInt();
        r05.b = r9.readInt();
        boolean r19 = true;
        if (r9.readInt() == 1) goto L43;
        r19 = false;
    L43:
        r05.c = r19;
        return r05;
    L47:
        zl r06 = new zl();
        r06.e = null;
        r06.f = new ArrayList();
        r06.g = new ArrayList();
        r06.a = r9.createTypedArrayList(cm.CREATOR);
        r06.b = r9.createStringArrayList();
        r06.c = (c7[]) r9.createTypedArray(c7.CREATOR);
        r06.d = r9.readInt();
        r06.e = r9.readString();
        r06.f = r9.createStringArrayList();
        r06.g = r9.createTypedArrayList(Bundle.CREATOR);
        r06.h = r9.createTypedArrayList(vl.CREATOR);
        return r06;
    L49:
        vl r07 = new vl();
        r07.a = r9.readString();
        r07.b = r9.readInt();
        return r07;
    L57:
        t4 r08 = new t4(r9);
        if (r9.readByte() == 0) goto L60;
        boolean r92 = true;
    L61:
        r08.a = r92;
        return r08;
    L60:
        r92 = false;
        goto L61
    L32:
        return new ParcelImpl(r9);
    L36:
        return zv.a(r9.readInt(), r9.readInt());
    L46:
        return new cm(r9);
    L52:
        return new cf(r9.readLong());
    L54:
        return new c8((zv) r9.readParcelable(zv.class.getClassLoader()), (zv) r9.readParcelable(zv.class.getClassLoader()), (cf) r9.readParcelable(cf.class.getClassLoader()), (zv) r9.readParcelable(zv.class.getClassLoader()), r9.readInt());
    L56:
        return new c7(r9);
    L64:
        return new u1(r9);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r2) {
        switch(this.a) {
            case 0: goto L33;
            case 1: goto L31;
            case 2: goto L29;
            case 3: goto L27;
            case 4: goto L25;
            case 5: goto L23;
            case 6: goto L21;
            case 7: goto L19;
            case 8: goto L17;
            case 9: goto L15;
            case 10: goto L13;
            case 11: goto L11;
            case 12: goto L9;
            case 13: goto L7;
            default: goto L5;
        };
    L5:
        return new m40[r2];
    L7:
        return new l40[r2];
    L9:
        return new ParcelImpl[r2];
    L11:
        return new hw[r2];
    L13:
        return new zv[r2];
    L15:
        return new wt[r2];
    L17:
        return new xq[r2];
    L19:
        return new cm[r2];
    L21:
        return new zl[r2];
    L23:
        return new vl[r2];
    L25:
        return new cf[r2];
    L27:
        return new c8[r2];
    L29:
        return new c7[r2];
    L31:
        return new t4[r2];
    L33:
        return new u1[r2];
    }
}
