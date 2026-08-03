package fun.box001.internal.dexmaker;

import fun.box001.internal.collections.C0016a;
import fun.box001.internal.dexformat.C0020D;
import fun.box001.internal.dexformat.C0032i;
import fun.box001.internal.dexformat.annotations.C0117b;
import fun.box001.internal.dexformat.instructions.C0103n;
import fun.box001.internal.dexformat.writer.data.C0194b;

/* JADX INFO: renamed from: c.c */
/* JADX INFO: loaded from: classes.dex */
final class C0006c {

    /* JADX INFO: renamed from: a */
    final C0012i f11a;

    /* JADX INFO: renamed from: b */
    private final int f12b;

    /* JADX INFO: renamed from: c */
    private final C0004a f13c;

    public C0006c(C0012i r1, int r2) {
        this.f11a = r1;
        this.f12b = r2;
        this.f13c = new C0004a(this);
    }

    /* JADX INFO: renamed from: a */
    static /* bridge */ /* synthetic */ C0004a m43a(C0006c r0) {
        return r0.f13c;
    }

    /* JADX INFO: renamed from: b */
    final boolean m44b() {
        if ((this.f12b & 65546) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: c */
    final boolean m45c() {
        if ((this.f12b & 8) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: d */
    final C0103n m46d(C0016a r6) {
        int r0 = this.f12b;
        int r1 = r0 & 1024;
        C0012i r2 = this.f11a;
        if (r1 != 0) goto L10;
        if ((r0 & 256) != 0) goto L10;
        C0004a r3 = this.f13c;
        C0032i r62 = C0020D.m83i(new C0117b(r3.m41r()), r3.m38o(), r6);
        return new C0103n(r2.f40e, r0, r62, C0194b.f722c);
    L10:
        return new C0103n(r2.f40e, r0, null, C0194b.f722c);
    }
}
