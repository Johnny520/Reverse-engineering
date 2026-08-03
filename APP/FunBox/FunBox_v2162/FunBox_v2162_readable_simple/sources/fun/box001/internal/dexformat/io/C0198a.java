package fun.box001.internal.dexformat.io;

import fun.box001.internal.dexformat.output.C0205g;
import fun.box001.internal.dexformat.writer.C0162m;

/* JADX INFO: renamed from: m.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0198a {

    /* JADX INFO: renamed from: a */
    private final C0205g f787a;

    /* JADX INFO: renamed from: b */
    private int f788b;

    public C0198a(int r2) {
        this.f787a = new C0205g(r2);
    }

    /* JADX INFO: renamed from: a */
    public final void m475a(int r4, int r5) {
        C0205g r0 = this.f787a;
        if (r4 < r0.m529o()) goto L7;
        int r1 = r4 - r0.m529o();
    L5:
        if (r1 < 0) goto L7;
        r0.m524j(-1);
        r1 = r1 - 1;
    L7:
        r0.m527m(r4, r5);
        int r52 = r5 + 1;
        if (this.f788b >= r52) goto L12;
        this.f788b = r52;
        return;
    }

    /* JADX INFO: renamed from: b */
    public final C0162m m476b(C0162m r3) {
        if (r3 != null) goto L13;
        return null;
    L13:
        int r0 = this.f787a.m526l(r3.m384i());     // Catch: IndexOutOfBoundsException -> L7
    L8:
        if (r0 < 0) goto L12;
        return r3.m390r(r0);
    L12:
        throw new RuntimeException("no mapping specified for register");
    L7:
        r0 = -1;
        goto L8
    }
}
