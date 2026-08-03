package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
public final class b implements com.google.android.material.datepicker.a.c {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.b> CREATOR = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1069a;

    public class a implements android.os.Parcelable.Creator<com.google.android.material.datepicker.b> {
        @Override // android.os.Parcelable.Creator
        public final com.google.android.material.datepicker.b createFromParcel(android.os.Parcel r4) {
                r3 = this;
                com.google.android.material.datepicker.b r0 = new com.google.android.material.datepicker.b
                long r1 = r4.readLong()
                r0.<init>(r1)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public final com.google.android.material.datepicker.b[] newArray(int r1) {
                r0 = this;
                com.google.android.material.datepicker.b[] r1 = new com.google.android.material.datepicker.b[r1]
                return r1
        }
    }

    static {
            com.google.android.material.datepicker.b$a r0 = new com.google.android.material.datepicker.b$a
            r0.<init>()
            com.google.android.material.datepicker.b.CREATOR = r0
            return
    }

    public b(long r1) {
            r0 = this;
            r0.<init>()
            r0.f1069a = r1
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.material.datepicker.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.material.datepicker.b r8 = (com.google.android.material.datepicker.b) r8
            long r3 = r7.f1069a
            long r5 = r8.f1069a
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L15
            return r0
        L15:
            return r2
    }

    @Override // com.google.android.material.datepicker.a.c
    public final boolean f(long r3) {
            r2 = this;
            long r0 = r2.f1069a
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 < 0) goto L8
            r3 = 1
            return r3
        L8:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f1069a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            long r0 = r2.f1069a
            r3.writeLong(r0)
            return
    }
}
