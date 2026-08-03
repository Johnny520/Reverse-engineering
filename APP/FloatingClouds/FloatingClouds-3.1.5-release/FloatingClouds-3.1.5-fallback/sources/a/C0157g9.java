package a;

/* JADX INFO: renamed from: a.g9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"BanParcelableUsage"})
public final class C0157g9 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<a.C0157g9> CREATOR = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.IntentSender f483a;
    public final android.content.Intent b;
    public final int c;
    public final int d;

    /* JADX INFO: renamed from: a.g9$a */
    public static final class a implements android.os.Parcelable.Creator<a.C0157g9> {
        @Override // android.os.Parcelable.Creator
        public final a.C0157g9 createFromParcel(android.os.Parcel r5) {
                r4 = this;
                java.lang.String r0 = "inParcel"
                a.C0193i9.e(r5, r0)
                a.g9 r0 = new a.g9
                java.lang.Class<android.content.IntentSender> r1 = android.content.IntentSender.class
                java.lang.ClassLoader r1 = r1.getClassLoader()
                android.os.Parcelable r1 = r5.readParcelable(r1)
                a.C0193i9.b(r1)
                android.content.IntentSender r1 = (android.content.IntentSender) r1
                java.lang.Class<android.content.Intent> r2 = android.content.Intent.class
                java.lang.ClassLoader r2 = r2.getClassLoader()
                android.os.Parcelable r2 = r5.readParcelable(r2)
                android.content.Intent r2 = (android.content.Intent) r2
                int r3 = r5.readInt()
                int r5 = r5.readInt()
                r0.<init>(r1, r2, r3, r5)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public final a.C0157g9[] newArray(int r1) {
                r0 = this;
                a.g9[] r1 = new a.C0157g9[r1]
                return r1
        }
    }

    static {
            a.g9$a r0 = new a.g9$a
            r0.<init>()
            a.C0157g9.CREATOR = r0
            return
    }

    public C0157g9(android.content.IntentSender r1, android.content.Intent r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f483a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
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
            java.lang.String r0 = "dest"
            a.C0193i9.e(r2, r0)
            android.content.IntentSender r0 = r1.f483a
            r2.writeParcelable(r0, r3)
            android.content.Intent r0 = r1.b
            r2.writeParcelable(r0, r3)
            int r3 = r1.c
            r2.writeInt(r3)
            int r3 = r1.d
            r2.writeInt(r3)
            return
    }
}
