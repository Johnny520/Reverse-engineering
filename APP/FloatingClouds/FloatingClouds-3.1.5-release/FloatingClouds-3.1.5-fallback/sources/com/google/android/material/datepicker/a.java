package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
public final class a implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.a> CREATOR = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.C0391tb f1067a;
    public final a.C0391tb b;
    public final com.google.android.material.datepicker.a.c c;
    public final a.C0391tb d;
    public final int e;
    public final int f;
    public final int g;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    public class C0031a implements android.os.Parcelable.Creator<com.google.android.material.datepicker.a> {
        @Override // android.os.Parcelable.Creator
        public final com.google.android.material.datepicker.a createFromParcel(android.os.Parcel r9) {
                r8 = this;
                java.lang.Class<a.tb> r0 = a.C0391tb.class
                java.lang.ClassLoader r1 = r0.getClassLoader()
                android.os.Parcelable r1 = r9.readParcelable(r1)
                r3 = r1
                a.tb r3 = (a.C0391tb) r3
                java.lang.ClassLoader r1 = r0.getClassLoader()
                android.os.Parcelable r1 = r9.readParcelable(r1)
                r4 = r1
                a.tb r4 = (a.C0391tb) r4
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r9.readParcelable(r0)
                r6 = r0
                a.tb r6 = (a.C0391tb) r6
                java.lang.Class<com.google.android.material.datepicker.a$c> r0 = com.google.android.material.datepicker.a.c.class
                java.lang.ClassLoader r0 = r0.getClassLoader()
                android.os.Parcelable r0 = r9.readParcelable(r0)
                r5 = r0
                com.google.android.material.datepicker.a$c r5 = (com.google.android.material.datepicker.a.c) r5
                int r7 = r9.readInt()
                com.google.android.material.datepicker.a r2 = new com.google.android.material.datepicker.a
                r2.<init>(r3, r4, r5, r6, r7)
                return r2
        }

        @Override // android.os.Parcelable.Creator
        public final com.google.android.material.datepicker.a[] newArray(int r1) {
                r0 = this;
                com.google.android.material.datepicker.a[] r1 = new com.google.android.material.datepicker.a[r1]
                return r1
        }
    }

    public static final class b {
        public static final /* synthetic */ int c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.Long f1068a;
        public com.google.android.material.datepicker.a.c b;

        static {
                r0 = 1900(0x76c, float:2.662E-42)
                r1 = 0
                a.tb r0 = a.C0391tb.k(r0, r1)
                long r0 = r0.f
                a.Zf.a(r0)
                r0 = 2100(0x834, float:2.943E-42)
                r1 = 11
                a.tb r0 = a.C0391tb.k(r0, r1)
                long r0 = r0.f
                a.Zf.a(r0)
                return
        }
    }

    public interface c extends android.os.Parcelable {
        boolean f(long r1);
    }

    static {
            com.google.android.material.datepicker.a$a r0 = new com.google.android.material.datepicker.a$a
            r0.<init>()
            com.google.android.material.datepicker.a.CREATOR = r0
            return
    }

    public a(a.C0391tb r2, a.C0391tb r3, com.google.android.material.datepicker.a.c r4, a.C0391tb r5, int r6) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "start cannot be null"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "end cannot be null"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.String r0 = "validator cannot be null"
            java.util.Objects.requireNonNull(r4, r0)
            r1.f1067a = r2
            r1.b = r3
            r1.d = r5
            r1.e = r6
            r1.c = r4
            if (r5 == 0) goto L31
            java.util.Calendar r4 = r2.f697a
            java.util.Calendar r0 = r5.f697a
            int r4 = r4.compareTo(r0)
            if (r4 > 0) goto L29
            goto L31
        L29:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "start Month cannot be after current Month"
            r2.<init>(r3)
            throw r2
        L31:
            if (r5 == 0) goto L46
            java.util.Calendar r4 = r5.f697a
            java.util.Calendar r5 = r3.f697a
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L3e
            goto L46
        L3e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "current Month cannot be after end Month"
            r2.<init>(r3)
            throw r2
        L46:
            if (r6 < 0) goto L66
            r4 = 0
            java.util.Calendar r4 = a.Zf.e(r4)
            r5 = 7
            int r4 = r4.getMaximum(r5)
            if (r6 > r4) goto L66
            int r4 = r2.n(r3)
            int r4 = r4 + 1
            r1.g = r4
            int r3 = r3.c
            int r2 = r2.c
            int r3 = r3 - r2
            int r3 = r3 + 1
            r1.f = r3
            return
        L66:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "firstDayOfWeek is not valid"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.material.datepicker.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.material.datepicker.a r5 = (com.google.android.material.datepicker.a) r5
            a.tb r1 = r5.f1067a
            a.tb r3 = r4.f1067a
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L3b
            a.tb r1 = r4.b
            a.tb r3 = r5.b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3b
            a.tb r1 = r4.d
            a.tb r3 = r5.d
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L3b
            int r1 = r4.e
            int r3 = r5.e
            if (r1 != r3) goto L3b
            com.google.android.material.datepicker.a$c r1 = r4.c
            com.google.android.material.datepicker.a$c r5 = r5.c
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L3b
            return r0
        L3b:
            return r2
    }

    public final int hashCode() {
            r5 = this;
            int r0 = r5.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.google.android.material.datepicker.a$c r1 = r5.c
            a.tb r2 = r5.f1067a
            a.tb r3 = r5.b
            a.tb r4 = r5.d
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r3, r4, r0, r1}
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            a.tb r3 = r1.f1067a
            r0 = 0
            r2.writeParcelable(r3, r0)
            a.tb r3 = r1.b
            r2.writeParcelable(r3, r0)
            a.tb r3 = r1.d
            r2.writeParcelable(r3, r0)
            com.google.android.material.datepicker.a$c r3 = r1.c
            r2.writeParcelable(r3, r0)
            int r3 = r1.e
            r2.writeInt(r3)
            return
    }
}
