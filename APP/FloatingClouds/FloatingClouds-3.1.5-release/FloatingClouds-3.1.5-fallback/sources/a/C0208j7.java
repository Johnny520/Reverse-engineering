package a;

/* JADX INFO: renamed from: a.j7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"BanParcelableUsage"})
public final class C0208j7 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<a.C0208j7> CREATOR = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.ArrayList<java.lang.String> f529a;
    public java.util.ArrayList<java.lang.String> b;
    public a.T1[] c;
    public int d;
    public java.lang.String e;
    public java.util.ArrayList<java.lang.String> f;
    public java.util.ArrayList<a.U1> g;
    public java.util.ArrayList<a.AbstractC0119e7.g> h;

    /* JADX INFO: renamed from: a.j7$a */
    public class a implements android.os.Parcelable.Creator<a.C0208j7> {
        @Override // android.os.Parcelable.Creator
        public final a.C0208j7 createFromParcel(android.os.Parcel r3) {
                r2 = this;
                a.j7 r0 = new a.j7
                r0.<init>()
                r1 = 0
                r0.e = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.f = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.g = r1
                java.util.ArrayList r1 = r3.createStringArrayList()
                r0.f529a = r1
                java.util.ArrayList r1 = r3.createStringArrayList()
                r0.b = r1
                android.os.Parcelable$Creator<a.T1> r1 = a.T1.CREATOR
                java.lang.Object[] r1 = r3.createTypedArray(r1)
                a.T1[] r1 = (a.T1[]) r1
                r0.c = r1
                int r1 = r3.readInt()
                r0.d = r1
                java.lang.String r1 = r3.readString()
                r0.e = r1
                java.util.ArrayList r1 = r3.createStringArrayList()
                r0.f = r1
                android.os.Parcelable$Creator<a.U1> r1 = a.U1.CREATOR
                java.util.ArrayList r1 = r3.createTypedArrayList(r1)
                r0.g = r1
                android.os.Parcelable$Creator<a.e7$g> r1 = a.AbstractC0119e7.g.CREATOR
                java.util.ArrayList r3 = r3.createTypedArrayList(r1)
                r0.h = r3
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public final a.C0208j7[] newArray(int r1) {
                r0 = this;
                a.j7[] r1 = new a.C0208j7[r1]
                return r1
        }
    }

    static {
            a.j7$a r0 = new a.j7$a
            r0.<init>()
            a.C0208j7.CREATOR = r0
            return
    }

    public C0208j7() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.g = r0
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1.f529a
            r2.writeStringList(r0)
            java.util.ArrayList<java.lang.String> r0 = r1.b
            r2.writeStringList(r0)
            a.T1[] r0 = r1.c
            r2.writeTypedArray(r0, r3)
            int r3 = r1.d
            r2.writeInt(r3)
            java.lang.String r3 = r1.e
            r2.writeString(r3)
            java.util.ArrayList<java.lang.String> r3 = r1.f
            r2.writeStringList(r3)
            java.util.ArrayList<a.U1> r3 = r1.g
            r2.writeTypedList(r3)
            java.util.ArrayList<a.e7$g> r3 = r1.h
            r2.writeTypedList(r3)
            return
    }
}
