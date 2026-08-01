package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ur extends d8 implements hm, xp {
    public final boolean g;

    public ur(vr r7) {
        super(r7, ff.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.g = false;
    }

    @Override // defpackage.hm
    public final Object a() {
        return this.b.getClass().getSimpleName();
    }

    public final xp d() {
        if (this.g == false) goto L5;
        return this;
    L5:
        xp r0 = this.a;
        if (r0 != null) goto L9;
        j00.a.getClass();
        this.a = this;
        return this;
    L9:
        return r0;
    }

    public final boolean equals(Object r3) {
        if (r3 != this) goto L5;
        return true;
    L5:
        if ((r3 instanceof ur) == false) goto L17;
        ur r32 = (ur) r3;
        if (c().equals(r32.c()) == true) goto L9;
        return false;
    L9:
        if (this.d.equals(r32.d) == true) goto L11;
        return false;
    L11:
        if (this.e.equals(r32.e) == true) goto L13;
        return false;
    L13:
        if (ip.i(this.b, r32.b) == false) goto L25;
        return true;
    L25:
        return false;
    L17:
        if ((r3 instanceof ur) == true) goto L19;
        return false;
    L19:
        return r3.equals(d());
    }

    public final int hashCode() {
        int r0 = c().hashCode() * 31;
        int r02 = z30.e(this.d, r0, 31);
        return this.e.hashCode() + r02;
    }

    public final String toString() {
        xp r0 = d();
        if (r0 == this) goto L7;
        return r0.toString();
    L7:
        return z30.l(new StringBuilder("property "), this.d, " (Kotlin reflection is not available)");
    }
}
