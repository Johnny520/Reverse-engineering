package fun.box001.internal.dexmaker;

import fun.box001.internal.collections.C0016a;
import fun.box001.internal.dexformat.instructions.C0094e;
import fun.box001.internal.dexformat.instructions.C0103n;
import fun.box001.internal.dexformat.writer.code.C0190t;
import fun.box001.internal.dexformat.writer.code.C0191u;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: c.e */
/* JADX INFO: loaded from: classes.dex */
final class C0008e {

    /* JADX INFO: renamed from: a */
    private final C0013j f14a;

    /* JADX INFO: renamed from: b */
    private boolean f15b;

    /* JADX INFO: renamed from: c */
    private int f16c;

    /* JADX INFO: renamed from: d */
    private C0013j f17d;

    /* JADX INFO: renamed from: e */
    private String f18e;

    /* JADX INFO: renamed from: f */
    private C0014k f19f;

    /* JADX INFO: renamed from: g */
    private C0094e f20g;

    /* JADX INFO: renamed from: h */
    private final LinkedHashMap f21h;

    /* JADX INFO: renamed from: i */
    private final LinkedHashMap f22i;

    C0008e(C0013j r2) {
        this.f21h = new LinkedHashMap();
        this.f22i = new LinkedHashMap();
        this.f14a = r2;
    }

    /* JADX INFO: renamed from: a */
    static /* bridge */ /* synthetic */ boolean m49a(C0008e r0) {
        return r0.f15b;
    }

    /* JADX INFO: renamed from: b */
    static /* bridge */ /* synthetic */ LinkedHashMap m50b(C0008e r0) {
        return r0.f22i;
    }

    /* JADX INFO: renamed from: c */
    static /* bridge */ /* synthetic */ void m51c(C0008e r1) {
        r1.f15b = true;
    }

    /* JADX INFO: renamed from: d */
    static /* bridge */ /* synthetic */ void m52d(C0008e r1) {
        r1.f16c = 1;
    }

    /* JADX INFO: renamed from: e */
    static /* bridge */ /* synthetic */ void m53e(C0008e r0, C0014k r1) {
        r0.f19f = r1;
    }

    /* JADX INFO: renamed from: f */
    static /* bridge */ /* synthetic */ void m54f(C0008e r1) {
        r1.f18e = "I";
    }

    /* JADX INFO: renamed from: g */
    static /* bridge */ /* synthetic */ void m55g(C0008e r0, C0013j r1) {
        r0.f17d = r1;
    }

    /* JADX INFO: renamed from: h */
    final C0094e m56h() {
        boolean r0 = this.f15b;
        LinkedHashMap r1 = this.f22i;
        LinkedHashMap r2 = this.f21h;
        C0013j r3 = this.f14a;
        if (r0 == false) goto L21;
        C0016a r02 = new C0016a();
        r02.f64a = 13;
        C0191u r6 = r3.f54c;
        if (this.f20g != null) goto L19;
        this.f20g = new C0094e(r6, this.f16c, this.f17d.f54c, this.f19f.f56b, new C0190t(this.f18e));
        Iterator r12 = r1.values().iterator();
    L8:
        if (r12.hasNext() == false) goto L13;
        C0006c r32 = (C0006c) r12.next();
        C0103n r4 = r32.m46d(r02);
        if (r32.m44b() == true) goto L11;
        this.f20g.m276j(r4);
        goto L8
    L11:
        this.f20g.m275i(r4);
        goto L8
    L13:
        Iterator r03 = r2.values().iterator();
        if (r03.hasNext() == false) goto L19;
        AbstractC0007d.m47a(r03.next());
        throw null;
    L19:
        return this.f20g;
    L21:
        throw new IllegalStateException("Undeclared type " + r3 + " declares members: " + r2.keySet() + " " + r1.keySet());
    }
}
