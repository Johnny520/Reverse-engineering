package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<s.g> CREATOR = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12013g;

    static {
            s.f r0 = new s.f
            r0.<init>()
            s.g.CREATOR = r0
            return
    }

    public g(int r1) {
            r0 = this;
            r0.<init>()
            r0.f12013g = r1
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof s.g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            s.g r4 = (s.g) r4
            int r1 = r3.f12013g
            int r4 = r4.f12013g
            if (r1 == r4) goto L13
            return r2
        L13:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f12013g
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DefaultLazyKey(index="
            r0.<init>(r1)
            int r1 = r3.f12013g
            r2 = 41
            java.lang.String r0 = p.a.n(r0, r1, r2)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.f12013g
            r1.writeInt(r2)
            return
    }
}
