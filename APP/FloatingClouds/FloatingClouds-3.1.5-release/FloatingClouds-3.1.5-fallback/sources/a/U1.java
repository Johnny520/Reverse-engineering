package a;

/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"BanParcelableUsage"})
public final class U1 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<a.U1> CREATOR = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f284a;
    public final java.util.ArrayList b;

    public class a implements android.os.Parcelable.Creator<a.U1> {
        @Override // android.os.Parcelable.Creator
        public final a.U1 createFromParcel(android.os.Parcel r2) {
                r1 = this;
                a.U1 r0 = new a.U1
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public final a.U1[] newArray(int r1) {
                r0 = this;
                a.U1[] r1 = new a.U1[r1]
                return r1
        }
    }

    static {
            a.U1$a r0 = new a.U1$a
            r0.<init>()
            a.U1.CREATOR = r0
            return
    }

    public U1(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.f284a = r0
            android.os.Parcelable$Creator<a.T1> r0 = a.T1.CREATOR
            java.util.ArrayList r2 = r2.createTypedArrayList(r0)
            r1.b = r2
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.util.ArrayList r2 = r0.f284a
            r1.writeStringList(r2)
            java.util.ArrayList r2 = r0.b
            r1.writeTypedList(r2)
            return
    }
}
