package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ni {
    public static final ThreadLocal d = null;
    public final int a;
    public final a8 b;
    public volatile int c;

    static {
        d = new ThreadLocal();
    }

    public ni(a8 r2, int r3) {
        this.c = 0;
        this.b = r2;
        this.a = r3;
    }

    public final int a(int r4) {
        vv r0 = b();
        int r1 = r0.a(16);
        if (r1 == 0) goto L6;
        ByteBuffer r2 = (ByteBuffer) r0.d;
        int r12 = r1 + r0.a;
        int r42 = r4 * 4;
        return r2.getInt(r42 + ((r2.getInt(r12) + r12) + 4));
    L6:
        return 0;
    }

    public final vv b() {
        ThreadLocal r0 = d;
        vv r1 = (vv) r0.get();
        if (r1 != null) goto L5;
        r1 = new vv();
        r0.set(r1);
    L5:
        wv r02 = (wv) this.b.a;
        int r2 = r02.a(6);
        if (r2 == 0) goto L12;
        int r22 = r2 + r02.a;
        int r3 = (((ByteBuffer) r02.d).getInt(r22) + r22) + 4;
        int r23 = (this.a * 4) + r3;
        int r32 = ((ByteBuffer) r02.d).getInt(r23) + r23;
        ByteBuffer r03 = (ByteBuffer) r02.d;
        r1.d = r03;
        if (r03 == null) goto L11;
        r1.a = r32;
        int r33 = r32 - r03.getInt(r32);
        r1.b = r33;
        r1.c = ((ByteBuffer) r1.d).getShort(r33);
        return r1;
    L11:
        r1.a = 0;
        r1.b = 0;
        r1.c = 0;
    L12:
        return r1;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(super.toString());
        r0.append(", id:");
        vv r1 = b();
        int r2 = r1.a(4);
        int r3 = 0;
        if (r2 == 0) goto L5;
        int r12 = ((ByteBuffer) r1.d).getInt(r2 + r1.a);
    L6:
        r0.append(Integer.toHexString(r12));
        r0.append(", codepoints:");
        vv r13 = b();
        int r22 = r13.a(16);
        if (r22 == 0) goto L9;
        int r23 = r22 + r13.a;
        int r14 = ((ByteBuffer) r13.d).getInt(((ByteBuffer) r13.d).getInt(r23) + r23);
    L10:
        if (r3 >= r14) goto L13;
        r0.append(Integer.toHexString(a(r3)));
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
