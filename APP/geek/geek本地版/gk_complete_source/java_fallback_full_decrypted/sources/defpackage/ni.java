package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ni {
    public static final java.lang.ThreadLocal d = null;
    public final int a;
    public final defpackage.a8 b;
    public volatile int c;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            defpackage.ni.d = r0
            return
    }

    public ni(defpackage.a8 r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            r1.b = r2
            r1.a = r3
            return
    }

    public final int a(int r4) {
            r3 = this;
            vv r0 = r3.b()
            r1 = 16
            int r1 = r0.a(r1)
            if (r1 == 0) goto L22
            java.lang.Object r2 = r0.d
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r0 = r0.a
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

    public final defpackage.vv b() {
            r4 = this;
            java.lang.ThreadLocal r0 = defpackage.ni.d
            java.lang.Object r1 = r0.get()
            vv r1 = (defpackage.vv) r1
            if (r1 != 0) goto L12
            vv r1 = new vv
            r1.<init>()
            r0.set(r1)
        L12:
            a8 r0 = r4.b
            java.lang.Object r0 = r0.a
            wv r0 = (defpackage.wv) r0
            r2 = 6
            int r2 = r0.a(r2)
            if (r2 == 0) goto L5e
            int r3 = r0.a
            int r2 = r2 + r3
            java.lang.Object r3 = r0.d
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r2)
            int r3 = r3 + r2
            int r3 = r3 + 4
            int r2 = r4.a
            int r2 = r2 * 4
            int r2 = r2 + r3
            java.lang.Object r3 = r0.d
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r2)
            int r3 = r3 + r2
            java.lang.Object r0 = r0.d
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r1.d = r0
            if (r0 == 0) goto L57
            r1.a = r3
            int r0 = r0.getInt(r3)
            int r3 = r3 - r0
            r1.b = r3
            java.lang.Object r0 = r1.d
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            short r0 = r0.getShort(r3)
            r1.c = r0
            return r1
        L57:
            r0 = 0
            r1.a = r0
            r1.b = r0
            r1.c = r0
        L5e:
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
            vv r1 = r5.b()
            r2 = 4
            int r2 = r1.a(r2)
            r3 = 0
            if (r2 == 0) goto L29
            java.lang.Object r4 = r1.d
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r1 = r1.a
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
            vv r1 = r5.b()
            r2 = 16
            int r2 = r1.a(r2)
            if (r2 == 0) goto L57
            int r4 = r1.a
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
