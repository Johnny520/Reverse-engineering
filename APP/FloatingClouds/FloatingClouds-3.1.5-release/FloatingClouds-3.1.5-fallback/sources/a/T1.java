package a;

/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"BanParcelableUsage"})
public final class T1 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<a.T1> CREATOR = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f268a;
    public final java.util.ArrayList<java.lang.String> b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final java.lang.String f;
    public final int g;
    public final int h;
    public final java.lang.CharSequence i;
    public final int j;
    public final java.lang.CharSequence k;
    public final java.util.ArrayList<java.lang.String> l;
    public final java.util.ArrayList<java.lang.String> m;
    public final boolean n;

    public class a implements android.os.Parcelable.Creator<a.T1> {
        @Override // android.os.Parcelable.Creator
        public final a.T1 createFromParcel(android.os.Parcel r2) {
                r1 = this;
                a.T1 r0 = new a.T1
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public final a.T1[] newArray(int r1) {
                r0 = this;
                a.T1[] r1 = new a.T1[r1]
                return r1
        }
    }

    static {
            a.T1$a r0 = new a.T1$a
            r0.<init>()
            a.T1.CREATOR = r0
            return
    }

    public T1(a.S1 r9) {
            r8 = this;
            r8.<init>()
            java.util.ArrayList<a.p7$a> r0 = r9.f636a
            int r0 = r0.size()
            int r1 = r0 * 6
            int[] r1 = new int[r1]
            r8.f268a = r1
            boolean r1 = r9.g
            if (r1 == 0) goto La3
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r8.b = r1
            int[] r1 = new int[r0]
            r8.c = r1
            int[] r1 = new int[r0]
            r8.d = r1
            r1 = 0
            r2 = r1
        L24:
            if (r1 >= r0) goto L7a
            java.util.ArrayList<a.p7$a> r3 = r9.f636a
            java.lang.Object r3 = r3.get(r1)
            a.p7$a r3 = (a.AbstractC0316p7.a) r3
            int[] r4 = r8.f268a
            int r5 = r2 + 1
            int r6 = r3.f637a
            r4[r2] = r6
            java.util.ArrayList<java.lang.String> r4 = r8.b
            androidx.fragment.app.b r6 = r3.b
            if (r6 == 0) goto L3f
            java.lang.String r6 = r6.e
            goto L40
        L3f:
            r6 = 0
        L40:
            r4.add(r6)
            int[] r4 = r8.f268a
            int r6 = r2 + 2
            boolean r7 = r3.c
            r4[r5] = r7
            int r5 = r2 + 3
            int r7 = r3.d
            r4[r6] = r7
            int r6 = r2 + 4
            int r7 = r3.e
            r4[r5] = r7
            int r5 = r2 + 5
            int r7 = r3.f
            r4[r6] = r7
            int r2 = r2 + 6
            int r6 = r3.g
            r4[r5] = r6
            int[] r4 = r8.c
            androidx.lifecycle.e$b r5 = r3.h
            int r5 = r5.ordinal()
            r4[r1] = r5
            int[] r4 = r8.d
            androidx.lifecycle.e$b r3 = r3.i
            int r3 = r3.ordinal()
            r4[r1] = r3
            int r1 = r1 + 1
            goto L24
        L7a:
            int r0 = r9.f
            r8.e = r0
            java.lang.String r0 = r9.h
            r8.f = r0
            int r0 = r9.s
            r8.g = r0
            int r0 = r9.i
            r8.h = r0
            java.lang.CharSequence r0 = r9.j
            r8.i = r0
            int r0 = r9.k
            r8.j = r0
            java.lang.CharSequence r0 = r9.l
            r8.k = r0
            java.util.ArrayList<java.lang.String> r0 = r9.m
            r8.l = r0
            java.util.ArrayList<java.lang.String> r0 = r9.n
            r8.m = r0
            boolean r9 = r9.o
            r8.n = r9
            return
        La3:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Not on back stack"
            r9.<init>(r0)
            throw r9
    }

    public T1(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            int[] r0 = r3.createIntArray()
            r2.f268a = r0
            java.util.ArrayList r0 = r3.createStringArrayList()
            r2.b = r0
            int[] r0 = r3.createIntArray()
            r2.c = r0
            int[] r0 = r3.createIntArray()
            r2.d = r0
            int r0 = r3.readInt()
            r2.e = r0
            java.lang.String r0 = r3.readString()
            r2.f = r0
            int r0 = r3.readInt()
            r2.g = r0
            int r0 = r3.readInt()
            r2.h = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r1 = r0.createFromParcel(r3)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2.i = r1
            int r1 = r3.readInt()
            r2.j = r1
            java.lang.Object r0 = r0.createFromParcel(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.k = r0
            java.util.ArrayList r0 = r3.createStringArrayList()
            r2.l = r0
            java.util.ArrayList r0 = r3.createStringArrayList()
            r2.m = r0
            int r3 = r3.readInt()
            if (r3 == 0) goto L5f
            r3 = 1
            goto L60
        L5f:
            r3 = 0
        L60:
            r2.n = r3
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
            int[] r3 = r1.f268a
            r2.writeIntArray(r3)
            java.util.ArrayList<java.lang.String> r3 = r1.b
            r2.writeStringList(r3)
            int[] r3 = r1.c
            r2.writeIntArray(r3)
            int[] r3 = r1.d
            r2.writeIntArray(r3)
            int r3 = r1.e
            r2.writeInt(r3)
            java.lang.String r3 = r1.f
            r2.writeString(r3)
            int r3 = r1.g
            r2.writeInt(r3)
            int r3 = r1.h
            r2.writeInt(r3)
            java.lang.CharSequence r3 = r1.i
            r0 = 0
            android.text.TextUtils.writeToParcel(r3, r2, r0)
            int r3 = r1.j
            r2.writeInt(r3)
            java.lang.CharSequence r3 = r1.k
            android.text.TextUtils.writeToParcel(r3, r2, r0)
            java.util.ArrayList<java.lang.String> r3 = r1.l
            r2.writeStringList(r3)
            java.util.ArrayList<java.lang.String> r3 = r1.m
            r2.writeStringList(r3)
            boolean r3 = r1.n
            r2.writeInt(r3)
            return
    }
}
