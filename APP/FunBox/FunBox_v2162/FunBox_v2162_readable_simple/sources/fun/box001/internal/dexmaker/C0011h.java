package fun.box001.internal.dexmaker;

import fun.box001.internal.dexformat.writer.C0162m;

/* JADX INFO: renamed from: c.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0011h {

    /* JADX INFO: renamed from: a */
    private final C0004a f32a;

    /* JADX INFO: renamed from: b */
    final C0013j f33b;

    /* JADX INFO: renamed from: c */
    private int f34c;

    /* JADX INFO: renamed from: d */
    private C0162m f35d;

    private C0011h(C0004a r2, C0013j r3) {
        this.f34c = -1;
        this.f32a = r2;
        this.f33b = r3;
    }

    /* JADX INFO: renamed from: a */
    static C0011h m60a(C0004a r1, C0013j r2) {
        return new C0011h(r1, r2);
    }

    /* JADX INFO: renamed from: b */
    final int m61b(int r3) {
        this.f34c = r3;
        C0013j r0 = this.f33b;
        this.f35d = C0162m.m377m(r3, r0.f53b);
        return r0.f53b.m469f();
    }

    /* JADX INFO: renamed from: c */
    final C0162m m62c() {
        if (this.f35d != null) goto L10;
        this.f32a.m32g();
        if (this.f35d != null) goto L10;
        throw new AssertionError();
    L10:
        return this.f35d;
    }

    public final String toString() {
        return "v" + this.f34c + "(" + this.f33b + ")";
    }
}
