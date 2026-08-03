package fun.box001.internal.dexformat;

import fun.box001.internal.collections.C0016a;
import java.util.ArrayList;

/* JADX INFO: renamed from: e.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0046w {

    /* JADX INFO: renamed from: a */
    private final C0047x f269a;

    /* JADX INFO: renamed from: b */
    private ArrayList f270b;

    public C0046w(C0016a r2, int r3, int r4, int r5, int r6) {
        this.f269a = new C0047x(r2, r3, r5, r6);
        this.f270b = new ArrayList(r4);
    }

    /* JADX INFO: renamed from: a */
    public final void m195a(AbstractC0033j r2) {
        this.f269a.m204a(r2);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0033j m196b(int r3) {
        C0047x r0 = this.f269a;
        if (r3 >= r0.m212m()) goto L8;
        if (r3 >= 0) goto L7;
        return null;
    L7:
        return r0.m207g(r3);
    L8:
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final C0047x m197c() {
        ArrayList r0 = this.f270b;
        if (r0 == null) goto L11;
        int r02 = r0.size();
        int r1 = 0;
    L5:
        C0047x r2 = this.f269a;
        if (r1 >= r02) goto L8;
        r2.m204a((AbstractC0033j) this.f270b.get(r1));
        r1 = r1 + 1;
        goto L5
    L8:
        this.f270b = null;
        return r2;
    L11:
        throw new UnsupportedOperationException("already processed");
    }

    /* JADX INFO: renamed from: d */
    public final void m198d(C0029f r2) {
        this.f269a.m211l(r2);
    }

    /* JADX INFO: renamed from: e */
    public final int m199e() {
        return this.f269a.m212m();
    }
}
