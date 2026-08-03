package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: YB */
/* JADX INFO: loaded from: classes.dex */
public final class C1043YB {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f3331d = null;

    /* JADX INFO: renamed from: a */
    public final int f3332a;

    /* JADX INFO: renamed from: b */
    public final C2428qs f3333b;

    /* JADX INFO: renamed from: c */
    public volatile int f3334c;

    static {
        f3331d = new ThreadLocal();
    }

    public C1043YB(C2428qs r2, int r3) {
        this.f3334c = 0;
        this.f3333b = r2;
        this.f3332a = r3;
    }

    /* JADX INFO: renamed from: a */
    public final int m1991a(int r4) {
        C0636Or r0 = m1992b();
        int r1 = r0.m4624a(16);
        if (r1 == 0) goto L6;
        ByteBuffer r2 = (ByteBuffer) r0.f8037d;
        int r12 = r1 + r0.f8034a;
        int r42 = r4 * 4;
        return r2.getInt(r42 + ((r2.getInt(r12) + r12) + 4));
    L6:
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final C0636Or m1992b() {
        ThreadLocal r0 = f3331d;
        C0636Or r1 = (C0636Or) r0.get();
        if (r1 != null) goto L5;
        r1 = new C0636Or();
        r0.set(r1);
    L5:
        C0679Pr r02 = (C0679Pr) this.f3333b.f8520a;
        int r2 = r02.m4624a(6);
        if (r2 == 0) goto L12;
        int r22 = r2 + r02.f8034a;
        int r3 = (((ByteBuffer) r02.f8037d).getInt(r22) + r22) + 4;
        int r23 = (this.f3332a * 4) + r3;
        int r32 = ((ByteBuffer) r02.f8037d).getInt(r23) + r23;
        ByteBuffer r03 = (ByteBuffer) r02.f8037d;
        r1.f8037d = r03;
        if (r03 == null) goto L11;
        r1.f8034a = r32;
        int r33 = r32 - r03.getInt(r32);
        r1.f8035b = r33;
        r1.f8036c = ((ByteBuffer) r1.f8037d).getShort(r33);
        return r1;
    L11:
        r1.f8034a = 0;
        r1.f8035b = 0;
        r1.f8036c = 0;
    L12:
        return r1;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(super.toString());
        r0.append(", id:");
        C0636Or r1 = m1992b();
        int r2 = r1.m4624a(4);
        int r3 = 0;
        if (r2 == 0) goto L5;
        int r12 = ((ByteBuffer) r1.f8037d).getInt(r2 + r1.f8034a);
    L6:
        r0.append(Integer.toHexString(r12));
        r0.append(", codepoints:");
        C0636Or r13 = m1992b();
        int r22 = r13.m4624a(16);
        if (r22 == 0) goto L9;
        int r23 = r22 + r13.f8034a;
        int r14 = ((ByteBuffer) r13.f8037d).getInt(((ByteBuffer) r13.f8037d).getInt(r23) + r23);
    L10:
        if (r3 >= r14) goto L13;
        r0.append(Integer.toHexString(m1991a(r3)));
        r0.append(" ");
        r3 = r3 + 1;
        goto L10
    L13:
        return r0.toString();
    L9:
        r14 = 0;
        goto L10
    L5:
        r12 = 0;
        goto L6
    }
}
