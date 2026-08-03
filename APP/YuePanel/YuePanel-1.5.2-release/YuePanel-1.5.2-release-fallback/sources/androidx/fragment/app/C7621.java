package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"BanParcelableUsage"})
public final class C7621 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.C7621> CREATOR = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public java.util.ArrayList<java.lang.String> f29311;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public java.util.ArrayList<java.lang.String> f29312;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public androidx.fragment.app.C7596[] f29313;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f29314;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public java.lang.String f29315;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public java.util.ArrayList<java.lang.String> f29316;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public java.util.ArrayList<androidx.fragment.app.C7598> f29317;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public java.util.ArrayList<androidx.fragment.app.FragmentManager.C7587> f29318;

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۤ$ۥ, reason: contains not printable characters */
    public class C7622 implements android.os.Parcelable.Creator<androidx.fragment.app.C7621> {
        public C7622() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ androidx.fragment.app.C7621 createFromParcel(android.os.Parcel r1) {
                r0 = this;
                androidx.fragment.app.ۥ۟۟۟ۤ r1 = r0.m29360(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ androidx.fragment.app.C7621[] newArray(int r1) {
                r0 = this;
                androidx.fragment.app.ۥ۟۟۟ۤ[] r1 = r0.m29361(r1)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public androidx.fragment.app.C7621 m29360(android.os.Parcel r2) {
                r1 = this;
                androidx.fragment.app.ۥ۟۟۟ۤ r0 = new androidx.fragment.app.ۥ۟۟۟ۤ
                r0.<init>(r2)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public androidx.fragment.app.C7621[] m29361(int r1) {
                r0 = this;
                androidx.fragment.app.ۥ۟۟۟ۤ[] r1 = new androidx.fragment.app.C7621[r1]
                return r1
        }
    }

    static {
            androidx.fragment.app.ۥ۟۟۟ۤ$ۥ r0 = new androidx.fragment.app.ۥ۟۟۟ۤ$ۥ
            r0.<init>()
            androidx.fragment.app.C7621.CREATOR = r0
            return
    }

    public C7621() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f29315 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f29316 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f29317 = r0
            return
    }

    public C7621(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f29315 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f29316 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f29317 = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.f29311 = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.f29312 = r0
            android.os.Parcelable$Creator<androidx.fragment.app.ۥ۟> r0 = androidx.fragment.app.C7596.CREATOR
            java.lang.Object[] r0 = r2.createTypedArray(r0)
            androidx.fragment.app.ۥ۟[] r0 = (androidx.fragment.app.C7596[]) r0
            r1.f29313 = r0
            int r0 = r2.readInt()
            r1.f29314 = r0
            java.lang.String r0 = r2.readString()
            r1.f29315 = r0
            java.util.ArrayList r0 = r2.createStringArrayList()
            r1.f29316 = r0
            android.os.Parcelable$Creator<androidx.fragment.app.ۥ۟۟> r0 = androidx.fragment.app.C7598.CREATOR
            java.util.ArrayList r0 = r2.createTypedArrayList(r0)
            r1.f29317 = r0
            android.os.Parcelable$Creator<androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ> r0 = androidx.fragment.app.FragmentManager.C7587.CREATOR
            java.util.ArrayList r2 = r2.createTypedArrayList(r0)
            r1.f29318 = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.util.ArrayList<java.lang.String> r0 = r1.f29311
            r2.writeStringList(r0)
            java.util.ArrayList<java.lang.String> r0 = r1.f29312
            r2.writeStringList(r0)
            androidx.fragment.app.ۥ۟[] r0 = r1.f29313
            r2.writeTypedArray(r0, r3)
            int r3 = r1.f29314
            r2.writeInt(r3)
            java.lang.String r3 = r1.f29315
            r2.writeString(r3)
            java.util.ArrayList<java.lang.String> r3 = r1.f29316
            r2.writeStringList(r3)
            java.util.ArrayList<androidx.fragment.app.ۥ۟۟> r3 = r1.f29317
            r2.writeTypedList(r3)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$ۥ۟۟۟ۨ> r3 = r1.f29318
            r2.writeTypedList(r3)
            return
    }
}
