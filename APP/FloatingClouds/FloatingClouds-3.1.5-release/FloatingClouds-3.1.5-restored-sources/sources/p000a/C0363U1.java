package p000a;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: a.U1 */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class C0363U1 implements Parcelable {
    public static final Parcelable.Creator<C0363U1> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    public final ArrayList f1362a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1363b;

    /* JADX INFO: renamed from: a.U1$a */
    public class a implements Parcelable.Creator<C0363U1> {
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final C0363U1 createFromParcel(Parcel parcel) {
            return new C0363U1(parcel);
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final C0363U1[] newArray(int i) {
            return new C0363U1[i];
        }
    }

    public C0363U1(Parcel parcel) {
        this.f1362a = parcel.createStringArrayList();
        this.f1363b = parcel.createTypedArrayList(C0345T1.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1362a);
        parcel.writeTypedList(this.f1363b);
    }
}
