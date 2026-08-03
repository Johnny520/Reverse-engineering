package a;

/* JADX INFO: loaded from: classes.dex */
public final class Tf {
    public static final java.lang.ThreadLocal<a.C0195ib> d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f283a;
    public final a.C0230kb b;
    public volatile int c;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            a.Tf.d = r0
            return
    }

    public Tf(a.C0230kb r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            r1.b = r2
            r1.f283a = r3
            return
    }

    public final int a(int r4) {
            r3 = this;
            a.ib r0 = r3.b()
            r1 = 16
            int r1 = r0.a(r1)
            if (r1 == 0) goto L22
            java.lang.Object r2 = r0.d
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r0 = r0.f233a
            int r1 = r1 + r0
            int r0 = r2.getInt(r1)
            int r0 = r0 + r1
            int r0 = r0 + 4
            int r4 = r4 * 4
            int r4 = r4 + r0
            int r4 = r2.getInt(r4)
            return r4
        L22:
            r4 = 0
            return r4
    }

    public final a.C0195ib b() {
            r4 = this;
            java.lang.ThreadLocal<a.ib> r0 = a.Tf.d
            java.lang.Object r1 = r0.get()
            a.ib r1 = (a.C0195ib) r1
            if (r1 != 0) goto L12
            a.ib r1 = new a.ib
            r1.<init>()
            r0.set(r1)
        L12:
            a.kb r0 = r4.b
            a.jb r0 = r0.f546a
            r2 = 6
            int r2 = r0.a(r2)
            if (r2 == 0) goto L5c
            int r3 = r0.f233a
            int r2 = r2 + r3
            java.lang.Object r3 = r0.d
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r2)
            int r3 = r3 + r2
            int r3 = r3 + 4
            int r2 = r4.f283a
            int r2 = r2 * 4
            int r2 = r2 + r3
            java.lang.Object r3 = r0.d
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r2)
            int r3 = r3 + r2
            java.lang.Object r0 = r0.d
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r1.d = r0
            if (r0 == 0) goto L55
            r1.f233a = r3
            int r0 = r0.getInt(r3)
            int r3 = r3 - r0
            r1.b = r3
            java.lang.Object r0 = r1.d
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            short r0 = r0.getShort(r3)
            r1.c = r0
            return r1
        L55:
            r0 = 0
            r1.f233a = r0
            r1.b = r0
            r1.c = r0
        L5c:
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ", id:"
            r0.append(r1)
            a.ib r1 = r5.b()
            r2 = 4
            int r2 = r1.a(r2)
            r3 = 0
            if (r2 == 0) goto L29
            java.lang.Object r4 = r1.d
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r1 = r1.f233a
            int r2 = r2 + r1
            int r1 = r4.getInt(r2)
            goto L2a
        L29:
            r1 = r3
        L2a:
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = ", codepoints:"
            r0.append(r1)
            a.ib r1 = r5.b()
            r2 = 16
            int r2 = r1.a(r2)
            if (r2 == 0) goto L57
            int r4 = r1.f233a
            int r2 = r2 + r4
            java.lang.Object r4 = r1.d
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r4 = r4.getInt(r2)
            int r4 = r4 + r2
            java.lang.Object r1 = r1.d
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r1.getInt(r4)
            goto L58
        L57:
            r1 = r3
        L58:
            if (r3 >= r1) goto L6d
            int r2 = r5.a(r3)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r0.append(r2)
            java.lang.String r2 = " "
            r0.append(r2)
            int r3 = r3 + 1
            goto L58
        L6d:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
