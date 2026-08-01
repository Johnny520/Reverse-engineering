package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cm implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.cm> CREATOR = null;
    public final java.lang.String a;
    public final java.lang.String b;
    public final boolean c;
    public final int d;
    public final int e;
    public final java.lang.String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final android.os.Bundle j;
    public final boolean k;
    public final int l;
    public android.os.Bundle m;

    static {
            t1 r0 = new t1
            r1 = 7
            r0.<init>(r1)
            defpackage.cm.CREATOR = r0
            return
    }

    public cm(android.os.Parcel r4) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = r4.readString()
            r3.a = r0
            java.lang.String r0 = r4.readString()
            r3.b = r0
            int r0 = r4.readInt()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L19
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            r3.c = r0
            int r0 = r4.readInt()
            r3.d = r0
            int r0 = r4.readInt()
            r3.e = r0
            java.lang.String r0 = r4.readString()
            r3.f = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L36
            r0 = r2
            goto L37
        L36:
            r0 = r1
        L37:
            r3.g = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L41
            r0 = r2
            goto L42
        L41:
            r0 = r1
        L42:
            r3.h = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L4c
            r0 = r2
            goto L4d
        L4c:
            r0 = r1
        L4d:
            r3.i = r0
            android.os.Bundle r0 = r4.readBundle()
            r3.j = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L5c
            r1 = r2
        L5c:
            r3.k = r1
            android.os.Bundle r0 = r4.readBundle()
            r3.m = r0
            int r4 = r4.readInt()
            r3.l = r4
            return
    }

    public cm(defpackage.ml r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1.a = r0
            java.lang.String r0 = r2.e
            r1.b = r0
            boolean r0 = r2.m
            r1.c = r0
            int r0 = r2.v
            r1.d = r0
            int r0 = r2.w
            r1.e = r0
            java.lang.String r0 = r2.x
            r1.f = r0
            boolean r0 = r2.A
            r1.g = r0
            boolean r0 = r2.l
            r1.h = r0
            boolean r0 = r2.z
            r1.i = r0
            android.os.Bundle r0 = r2.f
            r1.j = r0
            boolean r0 = r2.y
            r1.k = r0
            jq r2 = r2.K
            int r2 = r2.ordinal()
            r1.l = r2
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
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "FragmentState{"
            r0.append(r1)
            java.lang.String r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.lang.String r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ")}:"
            r0.append(r1)
            boolean r1 = r3.c
            if (r1 == 0) goto L29
            java.lang.String r1 = " fromLayout"
            r0.append(r1)
        L29:
            int r1 = r3.e
            if (r1 == 0) goto L39
            java.lang.String r2 = " id=0x"
            r0.append(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
        L39:
            java.lang.String r1 = r3.f
            if (r1 == 0) goto L4b
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L4b
            java.lang.String r2 = " tag="
            r0.append(r2)
            r0.append(r1)
        L4b:
            boolean r1 = r3.g
            if (r1 == 0) goto L54
            java.lang.String r1 = " retainInstance"
            r0.append(r1)
        L54:
            boolean r1 = r3.h
            if (r1 == 0) goto L5d
            java.lang.String r1 = " removing"
            r0.append(r1)
        L5d:
            boolean r1 = r3.i
            if (r1 == 0) goto L66
            java.lang.String r1 = " detached"
            r0.append(r1)
        L66:
            boolean r1 = r3.k
            if (r1 == 0) goto L6f
            java.lang.String r1 = " hidden"
            r0.append(r1)
        L6f:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            java.lang.String r2 = r0.b
            r1.writeString(r2)
            boolean r2 = r0.c
            r1.writeInt(r2)
            int r2 = r0.d
            r1.writeInt(r2)
            int r2 = r0.e
            r1.writeInt(r2)
            java.lang.String r2 = r0.f
            r1.writeString(r2)
            boolean r2 = r0.g
            r1.writeInt(r2)
            boolean r2 = r0.h
            r1.writeInt(r2)
            boolean r2 = r0.i
            r1.writeInt(r2)
            android.os.Bundle r2 = r0.j
            r1.writeBundle(r2)
            boolean r2 = r0.k
            r1.writeInt(r2)
            android.os.Bundle r2 = r0.m
            r1.writeBundle(r2)
            int r2 = r0.l
            r1.writeInt(r2)
            return
    }
}
