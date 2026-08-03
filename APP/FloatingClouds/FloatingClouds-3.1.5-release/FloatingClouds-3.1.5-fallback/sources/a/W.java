package a;

/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"BanParcelableUsage"})
public final class W implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<a.W> CREATOR = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f311a;
    public final android.content.Intent b;

    public class a implements android.os.Parcelable.Creator<a.W> {
        @Override // android.os.Parcelable.Creator
        public final a.W createFromParcel(android.os.Parcel r2) {
                r1 = this;
                a.W r0 = new a.W
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public final a.W[] newArray(int r1) {
                r0 = this;
                a.W[] r1 = new a.W[r1]
                return r1
        }
    }

    static {
            a.W$a r0 = new a.W$a
            r0.<init>()
            a.W.CREATOR = r0
            return
    }

    public W(android.content.Intent r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f311a = r2
            r0.b = r1
            return
    }

    public W(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.readInt()
            r1.f311a = r0
            int r0 = r2.readInt()
            if (r0 != 0) goto L11
            r2 = 0
            goto L19
        L11:
            android.os.Parcelable$Creator r0 = android.content.Intent.CREATOR
            java.lang.Object r2 = r0.createFromParcel(r2)
            android.content.Intent r2 = (android.content.Intent) r2
        L19:
            r1.b = r2
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ActivityResult{resultCode="
            r0.<init>(r1)
            r1 = -1
            int r2 = r3.f311a
            if (r2 == r1) goto L16
            if (r2 == 0) goto L13
            java.lang.String r1 = java.lang.String.valueOf(r2)
            goto L18
        L13:
            java.lang.String r1 = "RESULT_CANCELED"
            goto L18
        L16:
            java.lang.String r1 = "RESULT_OK"
        L18:
            r0.append(r1)
            java.lang.String r1 = ", data="
            r0.append(r1)
            android.content.Intent r1 = r3.b
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r0 = r2.f311a
            r3.writeInt(r0)
            android.content.Intent r0 = r2.b
            if (r0 != 0) goto Lb
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            r3.writeInt(r1)
            if (r0 == 0) goto L14
            r0.writeToParcel(r3, r4)
        L14:
            return
    }
}
