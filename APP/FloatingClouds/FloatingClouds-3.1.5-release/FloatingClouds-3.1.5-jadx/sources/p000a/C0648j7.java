package p000a;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p000a.AbstractC0553e7;

/* JADX INFO: renamed from: a.j7 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class C0648j7 implements Parcelable {
    public static final Parcelable.Creator<C0648j7> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    public ArrayList<String> f2393a;

    /* JADX INFO: renamed from: b */
    public ArrayList<String> f2394b;

    /* JADX INFO: renamed from: c */
    public C0345T1[] f2395c;

    /* JADX INFO: renamed from: d */
    public int f2396d;

    /* JADX INFO: renamed from: e */
    public String f2397e = null;

    /* JADX INFO: renamed from: f */
    public ArrayList<String> f2398f = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public ArrayList<C0363U1> f2399g = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    public ArrayList<AbstractC0553e7.g> f2400h;

    /* JADX INFO: renamed from: a.j7$a */
    public class a implements Parcelable.Creator<C0648j7> {
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final C0648j7 createFromParcel(Parcel parcel) {
            C0648j7 c0648j7 = new C0648j7();
            c0648j7.f2397e = null;
            c0648j7.f2398f = new ArrayList<>();
            c0648j7.f2399g = new ArrayList<>();
            c0648j7.f2393a = parcel.createStringArrayList();
            c0648j7.f2394b = parcel.createStringArrayList();
            c0648j7.f2395c = (C0345T1[]) parcel.createTypedArray(C0345T1.CREATOR);
            c0648j7.f2396d = parcel.readInt();
            c0648j7.f2397e = parcel.readString();
            c0648j7.f2398f = parcel.createStringArrayList();
            c0648j7.f2399g = parcel.createTypedArrayList(C0363U1.CREATOR);
            c0648j7.f2400h = parcel.createTypedArrayList(AbstractC0553e7.g.CREATOR);
            return c0648j7;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final C0648j7[] newArray(int i) {
            return new C0648j7[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f2393a);
        parcel.writeStringList(this.f2394b);
        parcel.writeTypedArray(this.f2395c, i);
        parcel.writeInt(this.f2396d);
        parcel.writeString(this.f2397e);
        parcel.writeStringList(this.f2398f);
        parcel.writeTypedList(this.f2399g);
        parcel.writeTypedList(this.f2400h);
    }
}
