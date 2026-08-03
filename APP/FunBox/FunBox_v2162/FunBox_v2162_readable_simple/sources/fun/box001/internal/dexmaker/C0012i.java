package fun.box001.internal.dexmaker;

import fun.box001.internal.dexformat.writer.code.C0187q;
import fun.box001.internal.dexformat.writer.code.C0188r;
import fun.box001.internal.dexformat.writer.code.C0190t;

/* JADX INFO: renamed from: c.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0012i {

    /* JADX INFO: renamed from: a */
    final C0013j f36a;

    /* JADX INFO: renamed from: b */
    final C0013j f37b;

    /* JADX INFO: renamed from: c */
    final String f38c;

    /* JADX INFO: renamed from: d */
    final C0014k f39d;

    /* JADX INFO: renamed from: e */
    final C0187q f40e;

    C0012i(C0013j r2, C0013j r3, String r4, C0014k r5) {
        if (r2 == null) goto L9;
        if (r3 == null) goto L9;
        if (r4 == null) goto L9;
        this.f36a = r2;
        this.f37b = r3;
        this.f38c = r4;
        this.f39d = r5;
        C0188r r32 = new C0188r(new C0190t(r4), new C0190t(m63a(false)));
        this.f40e = new C0187q(r2.f54c, r32);
        return;
    L9:
        throw null;
    }

    /* JADX INFO: renamed from: a */
    final String m63a(boolean r5) {
        StringBuilder r0 = new StringBuilder("(");
        if (r5 == false) goto L5;
        r0.append(this.f36a.f52a);
    L5:
        C0013j[] r52 = this.f39d.f55a;
        int r1 = r52.length;
        int r2 = 0;
    L6:
        if (r2 >= r1) goto L8;
        r0.append(r52[r2].f52a);
        r2 = r2 + 1;
        goto L6
    L8:
        r0.append(")");
        r0.append(this.f37b.f52a);
        return r0.toString();
    }

    public final boolean equals(Object r3) {
        if ((r3 instanceof C0012i) == false) goto L13;
        C0012i r32 = (C0012i) r3;
        if (r32.f36a.equals(this.f36a) == false) goto L13;
        if (r32.f38c.equals(this.f38c) == false) goto L13;
        if (r32.f39d.equals(this.f39d) == false) goto L13;
        if (r32.f37b.equals(this.f37b) == false) goto L13;
        return true;
    L13:
        return false;
    }

    public final int hashCode() {
        int r0 = (this.f36a.hashCode() + 527) * 31;
        int r1 = (((this.f38c.hashCode() + r0) * 31) + this.f39d.hashCode()) * 31;
        return this.f37b.hashCode() + r1;
    }

    public final String toString() {
        return this.f36a + "." + this.f38c + "(" + this.f39d + ")";
    }
}
