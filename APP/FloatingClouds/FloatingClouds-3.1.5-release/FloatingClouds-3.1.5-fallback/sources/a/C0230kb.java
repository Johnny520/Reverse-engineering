package a;

/* JADX INFO: renamed from: a.kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0230kb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.C0212jb f546a;
    public final char[] b;
    public final a.C0230kb.a c;
    public final android.graphics.Typeface d;

    /* JADX INFO: renamed from: a.kb$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.util.SparseArray<a.C0230kb.a> f547a;
        public a.Tf b;

        public a() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        public a(int r2) {
                r1 = this;
                r1.<init>()
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>(r2)
                r1.f547a = r0
                return
        }

        public final void a(a.Tf r4, int r5, int r6) {
                r3 = this;
                int r0 = r4.a(r5)
                android.util.SparseArray<a.kb$a> r1 = r3.f547a
                if (r1 != 0) goto La
                r0 = 0
                goto L10
            La:
                java.lang.Object r0 = r1.get(r0)
                a.kb$a r0 = (a.C0230kb.a) r0
            L10:
                if (r0 != 0) goto L1e
                a.kb$a r0 = new a.kb$a
                r0.<init>()
                int r2 = r4.a(r5)
                r1.put(r2, r0)
            L1e:
                if (r6 <= r5) goto L26
                int r5 = r5 + 1
                r0.a(r4, r5, r6)
                return
            L26:
                r0.b = r4
                return
        }
    }

    public C0230kb(android.graphics.Typeface r7, a.C0212jb r8) {
            r6 = this;
            r6.<init>()
            r6.d = r7
            r6.f546a = r8
            a.kb$a r7 = new a.kb$a
            r0 = 1024(0x400, float:1.435E-42)
            r7.<init>(r0)
            r6.c = r7
            r7 = 6
            int r0 = r8.a(r7)
            r1 = 0
            if (r0 == 0) goto L2d
            int r2 = r8.f233a
            int r0 = r0 + r2
            java.lang.Object r2 = r8.d
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r2.getInt(r0)
            int r2 = r2 + r0
            java.lang.Object r0 = r8.d
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r0 = r0.getInt(r2)
            goto L2e
        L2d:
            r0 = r1
        L2e:
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            r6.b = r0
            int r7 = r8.a(r7)
            if (r7 == 0) goto L4f
            int r0 = r8.f233a
            int r7 = r7 + r0
            java.lang.Object r0 = r8.d
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r0 = r0.getInt(r7)
            int r0 = r0 + r7
            java.lang.Object r7 = r8.d
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            int r7 = r7.getInt(r0)
            goto L50
        L4f:
            r7 = r1
        L50:
            r8 = r1
        L51:
            if (r8 >= r7) goto Lcd
            a.Tf r0 = new a.Tf
            r0.<init>(r6, r8)
            a.ib r2 = r0.b()
            r3 = 4
            int r3 = r2.a(r3)
            if (r3 == 0) goto L6f
            java.lang.Object r4 = r2.d
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r2 = r2.f233a
            int r3 = r3 + r2
            int r2 = r4.getInt(r3)
            goto L70
        L6f:
            r2 = r1
        L70:
            int r3 = r8 * 2
            char[] r4 = r6.b
            java.lang.Character.toChars(r2, r4, r3)
            a.ib r2 = r0.b()
            r3 = 16
            int r4 = r2.a(r3)
            if (r4 == 0) goto L98
            int r5 = r2.f233a
            int r4 = r4 + r5
            java.lang.Object r5 = r2.d
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            int r5 = r5.getInt(r4)
            int r5 = r5 + r4
            java.lang.Object r2 = r2.d
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r2.getInt(r5)
            goto L99
        L98:
            r2 = r1
        L99:
            r4 = 1
            if (r2 <= 0) goto L9e
            r2 = r4
            goto L9f
        L9e:
            r2 = r1
        L9f:
            java.lang.String r5 = "invalid metadata codepoint length"
            a.C0282n9.f(r5, r2)
            a.ib r2 = r0.b()
            int r3 = r2.a(r3)
            if (r3 == 0) goto Lc3
            int r5 = r2.f233a
            int r3 = r3 + r5
            java.lang.Object r5 = r2.d
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            int r5 = r5.getInt(r3)
            int r5 = r5 + r3
            java.lang.Object r2 = r2.d
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r2.getInt(r5)
            goto Lc4
        Lc3:
            r2 = r1
        Lc4:
            int r2 = r2 - r4
            a.kb$a r3 = r6.c
            r3.a(r0, r1, r2)
            int r8 = r8 + 1
            goto L51
        Lcd:
            return
    }
}
