package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: Fl */
/* JADX INFO: loaded from: classes.dex */
public final class C0243Fl extends AbstractC0828TB {

    /* JADX INFO: renamed from: l */
    public final int f796l;

    /* JADX INFO: renamed from: m */
    public final int f797m;

    public C0243Fl(int r1) {
        this.f796l = r1;
        this.f797m = r1;
    }

    /* JADX INFO: renamed from: N */
    public final int m515N(C0110Ch r6) {
        r6.m170i(2);
        int r1 = this.f797m;
        if (r1 == 0) goto L5;
        r6.m168g(4, 0);
        ByteBuffer r3 = r6.f258a;
        int r4 = r6.f259b - 4;
        r6.f259b = r4;
        r3.putInt(r4, r1);
        r6.f261d[1] = r6.m167f();
    L5:
        int r12 = this.f796l;
        if (r12 == 0) goto L8;
        r6.m168g(4, 0);
        ByteBuffer r32 = r6.f258a;
        int r42 = r6.f259b - 4;
        r6.f259b = r42;
        r32.putInt(r42, r12);
        r6.f261d[0] = r6.m167f();
    L8:
        int r0 = r6.m165d();
        r6.m166e(r0);
        return r0;
    }
}
