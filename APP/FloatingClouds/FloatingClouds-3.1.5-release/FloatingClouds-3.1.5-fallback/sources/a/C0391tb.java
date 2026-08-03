package a;

/* JADX INFO: renamed from: a.tb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0391tb implements java.lang.Comparable<a.C0391tb>, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<a.C0391tb> CREATOR = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Calendar f697a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public java.lang.String g;

    /* JADX INFO: renamed from: a.tb$a */
    public class a implements android.os.Parcelable.Creator<a.C0391tb> {
        @Override // android.os.Parcelable.Creator
        public final a.C0391tb createFromParcel(android.os.Parcel r2) {
                r1 = this;
                int r0 = r2.readInt()
                int r2 = r2.readInt()
                a.tb r2 = a.C0391tb.k(r0, r2)
                return r2
        }

        @Override // android.os.Parcelable.Creator
        public final a.C0391tb[] newArray(int r1) {
                r0 = this;
                a.tb[] r1 = new a.C0391tb[r1]
                return r1
        }
    }

    static {
            a.tb$a r0 = new a.tb$a
            r0.<init>()
            a.C0391tb.CREATOR = r0
            return
    }

    public C0391tb(java.util.Calendar r4) {
            r3 = this;
            r3.<init>()
            r0 = 5
            r1 = 1
            r4.set(r0, r1)
            java.util.Calendar r4 = a.Zf.c(r4)
            r3.f697a = r4
            r2 = 2
            int r2 = r4.get(r2)
            r3.b = r2
            int r1 = r4.get(r1)
            r3.c = r1
            r1 = 7
            int r1 = r4.getMaximum(r1)
            r3.d = r1
            int r0 = r4.getActualMaximum(r0)
            r3.e = r0
            long r0 = r4.getTimeInMillis()
            r3.f = r0
            return
    }

    public static a.C0391tb k(int r2, int r3) {
            r0 = 0
            java.util.Calendar r0 = a.Zf.e(r0)
            r1 = 1
            r0.set(r1, r2)
            r2 = 2
            r0.set(r2, r3)
            a.tb r2 = new a.tb
            r2.<init>(r0)
            return r2
    }

    public static a.C0391tb l(long r1) {
            r0 = 0
            java.util.Calendar r0 = a.Zf.e(r0)
            r0.setTimeInMillis(r1)
            a.tb r1 = new a.tb
            r1.<init>(r0)
            return r1
    }

    @Override // java.lang.Comparable
    public final int compareTo(a.C0391tb r2) {
            r1 = this;
            a.tb r2 = (a.C0391tb) r2
            java.util.Calendar r0 = r1.f697a
            java.util.Calendar r2 = r2.f697a
            int r2 = r0.compareTo(r2)
            return r2
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
            boolean r1 = r5 instanceof a.C0391tb
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a.tb r5 = (a.C0391tb) r5
            int r1 = r5.b
            int r3 = r4.b
            if (r3 != r1) goto L19
            int r1 = r4.c
            int r5 = r5.c
            if (r1 != r5) goto L19
            return r0
        L19:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r2.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public final java.lang.String m() {
            r4 = this;
            java.lang.String r0 = r4.g
            if (r0 != 0) goto L1f
            java.util.Calendar r0 = r4.f697a
            long r0 = r0.getTimeInMillis()
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r3 = "yMMMM"
            android.icu.text.DateFormat r2 = a.Zf.b(r3, r2)
            java.util.Date r3 = new java.util.Date
            r3.<init>(r0)
            java.lang.String r0 = r2.format(r3)
            r4.g = r0
        L1f:
            java.lang.String r0 = r4.g
            return r0
    }

    public final int n(a.C0391tb r3) {
            r2 = this;
            java.util.Calendar r0 = r2.f697a
            boolean r0 = r0 instanceof java.util.GregorianCalendar
            if (r0 == 0) goto L14
            int r0 = r3.c
            int r1 = r2.c
            int r0 = r0 - r1
            int r0 = r0 * 12
            int r3 = r3.b
            int r1 = r2.b
            int r3 = r3 - r1
            int r3 = r3 + r0
            return r3
        L14:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Only Gregorian calendars are supported."
            r3.<init>(r0)
            throw r3
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.c
            r1.writeInt(r2)
            int r2 = r0.b
            r1.writeInt(r2)
            return
    }
}
