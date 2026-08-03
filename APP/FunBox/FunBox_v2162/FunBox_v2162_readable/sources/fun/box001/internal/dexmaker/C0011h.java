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
    private int f34c = -1;

    /* JADX INFO: renamed from: d */
    private C0162m f35d;

    private C0011h(C0004a c0004a, C0013j c0013j) {
        this.f32a = c0004a;
        this.f33b = c0013j;
    }

    /* JADX INFO: renamed from: a */
    static C0011h m60a(C0004a c0004a, C0013j c0013j) {
        return new C0011h(c0004a, c0013j);
    }

    /* JADX INFO: renamed from: b */
    final int m61b(int i2) {
        this.f34c = i2;
        C0013j c0013j = this.f33b;
        this.f35d = C0162m.m377m(i2, c0013j.f53b);
        return c0013j.f53b.m469f();
    }

    /* JADX INFO: renamed from: c */
    final C0162m m62c() {
        if (this.f35d == null) {
            this.f32a.m32g();
            if (this.f35d == null) {
                throw new AssertionError();
            }
        }
        return this.f35d;
    }

    public final String toString() {
        return "v" + this.f34c + "(" + this.f33b + ")";
    }
}
