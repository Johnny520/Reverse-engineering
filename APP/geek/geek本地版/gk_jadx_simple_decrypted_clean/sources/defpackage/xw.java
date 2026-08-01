package defpackage;

import androidx.activity.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xw extends d8 implements hm, an, xp {
    public final int g;
    public final /* synthetic */ int h;

    public xw(int r7, Object r8) {
        this.h = r7;
        super(r8, a.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", false);
        this.g = 0;
    }

    @Override // defpackage.hm
    public final Object a() {
        switch(this.h) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((a) this.b).d();
        return vh.n;
    L6:
        ((a) this.b).d();
        return vh.n;
    }

    @Override // defpackage.an
    public final int b() {
        return 0;
    }

    public final xp d() {
        j00.a.getClass();
        return this;
    }

    public final boolean equals(Object r3) {
        if (r3 != this) goto L5;
        return true;
    L5:
        if ((r3 instanceof xw) == false) goto L19;
        xw r32 = (xw) r3;
        if (this.d.equals(r32.d) == true) goto L9;
        return false;
    L9:
        if (this.e.equals(r32.e) == true) goto L11;
        return false;
    L11:
        if (this.g == r32.g) goto L13;
        return false;
    L13:
        if (ip.i(this.b, r32.b) == true) goto L15;
        return false;
    L15:
        if (c().equals(r32.c()) == false) goto L31;
        return true;
    L31:
        return false;
    L19:
        if ((r3 instanceof xw) == false) goto L32;
        xp r0 = this.a;
        if (r0 != null) goto L24;
        d();
        this.a = this;
        r0 = this;
    L24:
        return r3.equals(r0);
    L32:
        return false;
    }

    public final int hashCode() {
        c();
        int r0 = c().hashCode() * 31;
        int r02 = z30.e(this.d, r0, 31);
        return this.e.hashCode() + r02;
    }

    public final String toString() {
        xp r0 = this.a;
        if (r0 != null) goto L5;
        d();
        this.a = this;
        r0 = this;
    L5:
        if (r0 != this) goto L7;
        String r1 = this.d;
        if ("<init>".equals(r1) == false) goto L13;
        return "constructor (Kotlin reflection is not available)";
    L13:
        return z30.j("function ", r1, " (Kotlin reflection is not available)");
    L7:
        return r0.toString();
    }
}
