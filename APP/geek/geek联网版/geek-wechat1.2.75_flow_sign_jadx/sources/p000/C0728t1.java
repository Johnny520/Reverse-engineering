package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;

/* JADX INFO: renamed from: t1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0728t1 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4385a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f4385a) {
            case Base64.DEFAULT /* 0 */:
                return new C0765u1(parcel);
            case Base64.NO_PADDING /* 1 */:
                C0731t4 c0731t4 = new C0731t4(parcel);
                c0731t4.f4400a = parcel.readByte() != 0;
                return c0731t4;
            case Base64.NO_WRAP /* 2 */:
                return new C0475m7(parcel);
            case 3:
                return new C0476m8((C0276gw) parcel.readParcelable(C0276gw.class.getClassLoader()), (C0276gw) parcel.readParcelable(C0276gw.class.getClassLoader()), (C0149df) parcel.readParcelable(C0149df.class.getClassLoader()), (C0276gw) parcel.readParcelable(C0276gw.class.getClassLoader()), parcel.readInt());
            case 4:
                return new C0149df(parcel.readLong());
            case 5:
                C0897xl c0897xl = new C0897xl();
                c0897xl.f5271a = parcel.readString();
                c0897xl.f5272b = parcel.readInt();
                return c0897xl;
            case 6:
                C0073bm c0073bm = new C0073bm();
                c0073bm.f741e = null;
                c0073bm.f742f = new ArrayList();
                c0073bm.f743g = new ArrayList();
                c0073bm.f737a = parcel.createTypedArrayList(C0192em.CREATOR);
                c0073bm.f738b = parcel.createStringArrayList();
                c0073bm.f739c = (C0475m7[]) parcel.createTypedArray(C0475m7.CREATOR);
                c0073bm.f740d = parcel.readInt();
                c0073bm.f741e = parcel.readString();
                c0073bm.f742f = parcel.createStringArrayList();
                c0073bm.f743g = parcel.createTypedArrayList(Bundle.CREATOR);
                c0073bm.f744h = parcel.createTypedArrayList(C0897xl.CREATOR);
                return c0073bm;
            case 7:
                return new C0192em(parcel);
            case 8:
                C0078br c0078br = new C0078br();
                c0078br.f753a = parcel.readInt();
                c0078br.f754b = parcel.readInt();
                c0078br.f755c = parcel.readInt() == 1;
                return c0078br;
            case 9:
                C0044au c0044au = new C0044au(parcel);
                c0044au.f635a = ((Integer) parcel.readValue(C0044au.class.getClassLoader())).intValue();
                return c0044au;
            case 10:
                return C0276gw.m1341a(parcel.readInt(), parcel.readInt());
            case 11:
                C0611pw c0611pw = new C0611pw(parcel);
                c0611pw.f3757a = parcel.readInt();
                return c0611pw;
            case 12:
                return new ParcelImpl(parcel);
            case 13:
                s40 s40Var = new s40();
                s40Var.f4207a = parcel.readInt();
                s40Var.f4208b = parcel.readInt();
                s40Var.f4210d = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    s40Var.f4209c = iArr;
                    parcel.readIntArray(iArr);
                }
                return s40Var;
            default:
                t40 t40Var = new t40();
                t40Var.f4401a = parcel.readInt();
                t40Var.f4402b = parcel.readInt();
                int i2 = parcel.readInt();
                t40Var.f4403c = i2;
                if (i2 > 0) {
                    int[] iArr2 = new int[i2];
                    t40Var.f4404d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i3 = parcel.readInt();
                t40Var.f4405e = i3;
                if (i3 > 0) {
                    int[] iArr3 = new int[i3];
                    t40Var.f4406f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                t40Var.f4408h = parcel.readInt() == 1;
                t40Var.f4409i = parcel.readInt() == 1;
                t40Var.f4410j = parcel.readInt() == 1;
                t40Var.f4407g = parcel.readArrayList(s40.class.getClassLoader());
                return t40Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f4385a) {
            case Base64.DEFAULT /* 0 */:
                return new C0765u1[i];
            case Base64.NO_PADDING /* 1 */:
                return new C0731t4[i];
            case Base64.NO_WRAP /* 2 */:
                return new C0475m7[i];
            case 3:
                return new C0476m8[i];
            case 4:
                return new C0149df[i];
            case 5:
                return new C0897xl[i];
            case 6:
                return new C0073bm[i];
            case 7:
                return new C0192em[i];
            case 8:
                return new C0078br[i];
            case 9:
                return new C0044au[i];
            case 10:
                return new C0276gw[i];
            case 11:
                return new C0611pw[i];
            case 12:
                return new ParcelImpl[i];
            case 13:
                return new s40[i];
            default:
                return new t40[i];
        }
    }
}
