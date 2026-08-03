package fun.box001.internal.dexmaker;

import fun.box001.internal.collections.C0016a;
import fun.box001.internal.dexformat.C0020D;
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
    private final C0004a f13c = new C0004a(this);

    public C0006c(C0012i c0012i, int i2) {
        this.f11a = c0012i;
        this.f12b = i2;
    }

    /* JADX INFO: renamed from: b */
    final boolean m44b() {
        return (this.f12b & 65546) != 0;
    }

    /* JADX INFO: renamed from: c */
    final boolean m45c() {
        return (this.f12b & 8) != 0;
    }

    /* JADX INFO: renamed from: d */
    final C0103n m46d(C0016a c0016a) {
        int i2 = this.f12b;
        int i3 = i2 & 1024;
        C0012i c0012i = this.f11a;
        if (i3 != 0 || (i2 & 256) != 0) {
            return new C0103n(c0012i.f40e, i2, null, C0194b.f722c);
        }
        C0004a c0004a = this.f13c;
        return new C0103n(c0012i.f40e, i2, C0020D.m83i(new C0117b(c0004a.m41r()), c0004a.m38o(), c0016a), C0194b.f722c);
    }
}
