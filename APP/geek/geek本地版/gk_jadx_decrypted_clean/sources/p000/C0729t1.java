package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;

/* JADX INFO: renamed from: t1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0729t1 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4481a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f4481a) {
            case Base64.DEFAULT /* 0 */:
                return new C0766u1(parcel);
            case Base64.NO_PADDING /* 1 */:
                C0732t4 c0732t4 = new C0732t4(parcel);
                c0732t4.f4495a = parcel.readByte() != 0;
                return c0732t4;
            case Base64.NO_WRAP /* 2 */:
                return new C0094c7(parcel);
            case 3:
                return new C0095c8((C0981zv) parcel.readParcelable(C0981zv.class.getClassLoader()), (C0981zv) parcel.readParcelable(C0981zv.class.getClassLoader()), (C0102cf) parcel.readParcelable(C0102cf.class.getClassLoader()), (C0981zv) parcel.readParcelable(C0981zv.class.getClassLoader()), parcel.readInt());
            case 4:
                return new C0102cf(parcel.readLong());
            case 5:
                C0823vl c0823vl = new C0823vl();
                c0823vl.f4868a = parcel.readString();
                c0823vl.f4869b = parcel.readInt();
                return c0823vl;
            case 6:
                C0971zl c0971zl = new C0971zl();
                c0971zl.f5568e = null;
                c0971zl.f5569f = new ArrayList();
                c0971zl.f5570g = new ArrayList();
                c0971zl.f5564a = parcel.createTypedArrayList(C0109cm.CREATOR);
                c0971zl.f5565b = parcel.createStringArrayList();
                c0971zl.f5566c = (C0094c7[]) parcel.createTypedArray(C0094c7.CREATOR);
                c0971zl.f5567d = parcel.readInt();
                c0971zl.f5568e = parcel.readString();
                c0971zl.f5569f = parcel.createStringArrayList();
                c0971zl.f5570g = parcel.createTypedArrayList(Bundle.CREATOR);
                c0971zl.f5571h = parcel.createTypedArrayList(C0823vl.CREATOR);
                return c0971zl;
            case 7:
                return new C0109cm(parcel);
            case 8:
                C0902xq c0902xq = new C0902xq();
                c0902xq.f5182a = parcel.readInt();
                c0902xq.f5183b = parcel.readInt();
                c0902xq.f5184c = parcel.readInt() == 1;
                return c0902xq;
            case 9:
                C0868wt c0868wt = new C0868wt(parcel);
                c0868wt.f5022a = ((Integer) parcel.readValue(C0868wt.class.getClassLoader())).intValue();
                return c0868wt;
            case 10:
                return C0981zv.m2840a(parcel.readInt(), parcel.readInt());
            case 11:
                C0313hw c0313hw = new C0313hw(parcel);
                c0313hw.f2315a = parcel.readInt();
                return c0313hw;
            case 12:
                return new ParcelImpl(parcel);
            case 13:
                l40 l40Var = new l40();
                l40Var.f3009a = parcel.readInt();
                l40Var.f3010b = parcel.readInt();
                l40Var.f3012d = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    l40Var.f3011c = iArr;
                    parcel.readIntArray(iArr);
                }
                return l40Var;
            default:
                m40 m40Var = new m40();
                m40Var.f3132a = parcel.readInt();
                m40Var.f3133b = parcel.readInt();
                int i2 = parcel.readInt();
                m40Var.f3134c = i2;
                if (i2 > 0) {
                    int[] iArr2 = new int[i2];
                    m40Var.f3135d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i3 = parcel.readInt();
                m40Var.f3136e = i3;
                if (i3 > 0) {
                    int[] iArr3 = new int[i3];
                    m40Var.f3137f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                m40Var.f3139h = parcel.readInt() == 1;
                m40Var.f3140i = parcel.readInt() == 1;
                m40Var.f3141j = parcel.readInt() == 1;
                m40Var.f3138g = parcel.readArrayList(l40.class.getClassLoader());
                return m40Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f4481a) {
            case Base64.DEFAULT /* 0 */:
                return new C0766u1[i];
            case Base64.NO_PADDING /* 1 */:
                return new C0732t4[i];
            case Base64.NO_WRAP /* 2 */:
                return new C0094c7[i];
            case 3:
                return new C0095c8[i];
            case 4:
                return new C0102cf[i];
            case 5:
                return new C0823vl[i];
            case 6:
                return new C0971zl[i];
            case 7:
                return new C0109cm[i];
            case 8:
                return new C0902xq[i];
            case 9:
                return new C0868wt[i];
            case 10:
                return new C0981zv[i];
            case 11:
                return new C0313hw[i];
            case 12:
                return new ParcelImpl[i];
            case 13:
                return new l40[i];
            default:
                return new m40[i];
        }
    }
}
