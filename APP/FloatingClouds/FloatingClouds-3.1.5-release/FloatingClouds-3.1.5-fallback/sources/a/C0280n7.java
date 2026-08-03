package a;

/* JADX INFO: renamed from: a.n7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"BanParcelableUsage"})
public final class C0280n7 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<a.C0280n7> CREATOR = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f598a;
    public final java.lang.String b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final java.lang.String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final java.lang.String m;
    public final int n;
    public final boolean o;

    /* JADX INFO: renamed from: a.n7$a */
    public class a implements android.os.Parcelable.Creator<a.C0280n7> {
        @Override // android.os.Parcelable.Creator
        public final a.C0280n7 createFromParcel(android.os.Parcel r2) {
                r1 = this;
                a.n7 r0 = new a.n7
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public final a.C0280n7[] newArray(int r1) {
                r0 = this;
                a.n7[] r1 = new a.C0280n7[r1]
                return r1
        }
    }

    static {
            a.n7$a r0 = new a.n7$a
            r0.<init>()
            a.C0280n7.CREATOR = r0
            return
    }

    public C0280n7(android.os.Parcel r4) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = r4.readString()
            r3.f598a = r0
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
            if (r0 == 0) goto L24
            r0 = r2
            goto L25
        L24:
            r0 = r1
        L25:
            r3.d = r0
            int r0 = r4.readInt()
            r3.e = r0
            int r0 = r4.readInt()
            r3.f = r0
            java.lang.String r0 = r4.readString()
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
            int r0 = r4.readInt()
            if (r0 == 0) goto L57
            r0 = r2
            goto L58
        L57:
            r0 = r1
        L58:
            r3.j = r0
            int r0 = r4.readInt()
            if (r0 == 0) goto L62
            r0 = r2
            goto L63
        L62:
            r0 = r1
        L63:
            r3.k = r0
            int r0 = r4.readInt()
            r3.l = r0
            java.lang.String r0 = r4.readString()
            r3.m = r0
            int r0 = r4.readInt()
            r3.n = r0
            int r4 = r4.readInt()
            if (r4 == 0) goto L7e
            r1 = r2
        L7e:
            r3.o = r1
            return
    }

    public C0280n7(androidx.fragment.app.b r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1.f598a = r0
            java.lang.String r0 = r2.e
            r1.b = r0
            boolean r0 = r2.n
            r1.c = r0
            boolean r0 = r2.p
            r1.d = r0
            int r0 = r2.x
            r1.e = r0
            int r0 = r2.y
            r1.f = r0
            java.lang.String r0 = r2.z
            r1.g = r0
            boolean r0 = r2.C
            r1.h = r0
            boolean r0 = r2.l
            r1.i = r0
            boolean r0 = r2.B
            r1.j = r0
            boolean r0 = r2.A
            r1.k = r0
            androidx.lifecycle.e$b r0 = r2.N
            int r0 = r0.ordinal()
            r1.l = r0
            java.lang.String r0 = r2.h
            r1.m = r0
            int r0 = r2.i
            r1.n = r0
            boolean r2 = r2.I
            r1.o = r2
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
            java.lang.String r1 = r3.f598a
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
            boolean r1 = r3.d
            if (r1 == 0) goto L32
            java.lang.String r1 = " dynamicContainer"
            r0.append(r1)
        L32:
            int r1 = r3.f
            if (r1 == 0) goto L42
            java.lang.String r2 = " id=0x"
            r0.append(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
        L42:
            java.lang.String r1 = r3.g
            if (r1 == 0) goto L54
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L54
            java.lang.String r2 = " tag="
            r0.append(r2)
            r0.append(r1)
        L54:
            boolean r1 = r3.h
            if (r1 == 0) goto L5d
            java.lang.String r1 = " retainInstance"
            r0.append(r1)
        L5d:
            boolean r1 = r3.i
            if (r1 == 0) goto L66
            java.lang.String r1 = " removing"
            r0.append(r1)
        L66:
            boolean r1 = r3.j
            if (r1 == 0) goto L6f
            java.lang.String r1 = " detached"
            r0.append(r1)
        L6f:
            boolean r1 = r3.k
            if (r1 == 0) goto L78
            java.lang.String r1 = " hidden"
            r0.append(r1)
        L78:
            java.lang.String r1 = r3.m
            if (r1 == 0) goto L8e
            java.lang.String r2 = " targetWho="
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " targetRequestCode="
            r0.append(r1)
            int r1 = r3.n
            r0.append(r1)
        L8e:
            boolean r1 = r3.o
            if (r1 == 0) goto L97
            java.lang.String r1 = " userVisibleHint"
            r0.append(r1)
        L97:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.f598a
            r1.writeString(r2)
            java.lang.String r2 = r0.b
            r1.writeString(r2)
            boolean r2 = r0.c
            r1.writeInt(r2)
            boolean r2 = r0.d
            r1.writeInt(r2)
            int r2 = r0.e
            r1.writeInt(r2)
            int r2 = r0.f
            r1.writeInt(r2)
            java.lang.String r2 = r0.g
            r1.writeString(r2)
            boolean r2 = r0.h
            r1.writeInt(r2)
            boolean r2 = r0.i
            r1.writeInt(r2)
            boolean r2 = r0.j
            r1.writeInt(r2)
            boolean r2 = r0.k
            r1.writeInt(r2)
            int r2 = r0.l
            r1.writeInt(r2)
            java.lang.String r2 = r0.m
            r1.writeString(r2)
            int r2 = r0.n
            r1.writeInt(r2)
            boolean r2 = r0.o
            r1.writeInt(r2)
            return
    }
}
