package fun.box001.internal.dexmaker;

import fun.box001.internal.dexformat.writer.data.C0194b;
import java.util.Arrays;

/* JADX INFO: renamed from: c.k */
/* JADX INFO: loaded from: classes.dex */
final class C0014k {

    /* JADX INFO: renamed from: a */
    final C0013j[] f55a;

    /* JADX INFO: renamed from: b */
    final C0194b f56b;

    C0014k(C0013j[] r4) {
        this.f55a = (C0013j[]) r4.clone();
        this.f56b = new C0194b(r4.length);
        int r0 = 0;
    L4:
        if (r0 >= r4.length) goto L6;
        this.f56b.m523z(r0, r4[r0].f53b);
        r0 = r0 + 1;
        goto L4
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof C0014k) == true) goto L5;
    L7:
        return false;
    L5:
        if (Arrays.equals(((C0014k) r2).f55a, this.f55a) == false) goto L7;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f55a);
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        int r1 = 0;
    L3:
        C0013j[] r2 = this.f55a;
        if (r1 >= r2.length) goto L9;
        if (r1 <= 0) goto L7;
        r0.append(", ");
    L7:
        r0.append(r2[r1]);
        r1 = r1 + 1;
        goto L3
    L9:
        return r0.toString();
    }
}
