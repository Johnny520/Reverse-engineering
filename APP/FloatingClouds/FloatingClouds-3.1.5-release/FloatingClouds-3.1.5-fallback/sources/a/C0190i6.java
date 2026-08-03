package a;

/* JADX INFO: renamed from: a.i6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0190i6 extends a.r {
    public static final android.os.Parcelable.Creator<a.C0190i6> CREATOR = null;
    public final a.C0162ge<java.lang.String, android.os.Bundle> c;

    /* JADX INFO: renamed from: a.i6$a */
    public class a implements android.os.Parcelable.ClassLoaderCreator<a.C0190i6> {
        @Override // android.os.Parcelable.Creator
        public final java.lang.Object createFromParcel(android.os.Parcel r3) {
                r2 = this;
                a.i6 r0 = new a.i6
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final a.C0190i6 createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                r1 = this;
                a.i6 r0 = new a.i6
                r0.<init>(r2, r3)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public final java.lang.Object[] newArray(int r1) {
                r0 = this;
                a.i6[] r1 = new a.C0190i6[r1]
                return r1
        }
    }

    static {
            a.i6$a r0 = new a.i6$a
            r0.<init>()
            a.C0190i6.CREATOR = r0
            return
    }

    public C0190i6(android.os.Parcel r6, java.lang.ClassLoader r7) {
            r5 = this;
            r5.<init>(r6, r7)
            int r7 = r6.readInt()
            java.lang.String[] r0 = new java.lang.String[r7]
            r6.readStringArray(r0)
            android.os.Bundle[] r1 = new android.os.Bundle[r7]
            android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
            r6.readTypedArray(r1, r2)
            a.ge r6 = new a.ge
            r6.<init>()
            if (r7 != 0) goto L23
            int[] r2 = a.C0435w1.i
            r6.f486a = r2
            java.lang.Object[] r2 = a.C0435w1.j
            r6.b = r2
            goto L26
        L23:
            r6.a(r7)
        L26:
            r2 = 0
            r6.c = r2
            r5.c = r6
            r6 = 0
        L2c:
            if (r6 >= r7) goto L3a
            a.ge<java.lang.String, android.os.Bundle> r2 = r5.c
            r3 = r0[r6]
            r4 = r1[r6]
            r2.put(r3, r4)
            int r6 = r6 + 1
            goto L2c
        L3a:
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ExtendableSavedState{"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " states="
            r0.append(r1)
            a.ge<java.lang.String, android.os.Bundle> r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // a.r, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r7, int r8) {
            r6 = this;
            super.writeToParcel(r7, r8)
            a.ge<java.lang.String, android.os.Bundle> r8 = r6.c
            int r0 = r8.c
            r7.writeInt(r0)
            java.lang.String[] r1 = new java.lang.String[r0]
            android.os.Bundle[] r2 = new android.os.Bundle[r0]
            r3 = 0
            r4 = r3
        L10:
            if (r4 >= r0) goto L25
            java.lang.Object r5 = r8.h(r4)
            java.lang.String r5 = (java.lang.String) r5
            r1[r4] = r5
            java.lang.Object r5 = r8.j(r4)
            android.os.Bundle r5 = (android.os.Bundle) r5
            r2[r4] = r5
            int r4 = r4 + 1
            goto L10
        L25:
            r7.writeStringArray(r1)
            r7.writeTypedArray(r2, r3)
            return
    }
}
