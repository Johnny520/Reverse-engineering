package a;

/* JADX INFO: loaded from: classes.dex */
public final class Q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.emoji2.text.c.d f223a;
    public final a.C0230kb b;
    public final a.P4 c;

    public static class a implements a.Q5.b<a.Xf> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a.Xf f224a;
        public final androidx.emoji2.text.c.d b;

        public a(a.Xf r1, androidx.emoji2.text.c.d r2) {
                r0 = this;
                r0.<init>()
                r0.f224a = r1
                r0.b = r2
                return
        }

        @Override // a.Q5.b
        public final a.Xf a() {
                r1 = this;
                a.Xf r0 = r1.f224a
                return r0
        }

        @Override // a.Q5.b
        public final boolean b(java.lang.CharSequence r4, int r5, int r6, a.Tf r7) {
                r3 = this;
                int r0 = r7.c
                r0 = r0 & 4
                r1 = 1
                if (r0 <= 0) goto L8
                return r1
            L8:
                a.Xf r0 = r3.f224a
                if (r0 != 0) goto L20
                a.Xf r0 = new a.Xf
                boolean r2 = r4 instanceof android.text.Spannable
                if (r2 == 0) goto L15
                android.text.Spannable r4 = (android.text.Spannable) r4
                goto L1b
            L15:
                android.text.SpannableString r2 = new android.text.SpannableString
                r2.<init>(r4)
                r4 = r2
            L1b:
                r0.<init>(r4)
                r3.f224a = r0
            L20:
                androidx.emoji2.text.c$d r4 = r3.b
                r4.getClass()
                a.Uf r4 = new a.Uf
                r4.<init>(r7)
                a.Xf r7 = r3.f224a
                r0 = 33
                r7.setSpan(r4, r5, r6, r0)
                return r1
        }
    }

    public interface b<T> {
        T a();

        boolean b(java.lang.CharSequence r1, int r2, int r3, a.Tf r4);
    }

    public static class c implements a.Q5.b<a.Q5.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f225a;

        public c(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.f225a = r1
                return
        }

        @Override // a.Q5.b
        public final a.Q5.c a() {
                r0 = this;
                return r0
        }

        @Override // a.Q5.b
        public final boolean b(java.lang.CharSequence r1, int r2, int r3, a.Tf r4) {
                r0 = this;
                java.lang.CharSequence r1 = r1.subSequence(r2, r3)
                java.lang.String r2 = r0.f225a
                boolean r1 = android.text.TextUtils.equals(r1, r2)
                if (r1 == 0) goto L16
                int r1 = r4.c
                r1 = r1 & 3
                r1 = r1 | 4
                r4.c = r1
                r1 = 0
                return r1
            L16:
                r1 = 1
                return r1
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f226a;
        public final a.C0230kb.a b;
        public a.C0230kb.a c;
        public a.C0230kb.a d;
        public int e;
        public int f;

        public d(a.C0230kb.a r2) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f226a = r0
                r1.b = r2
                r1.c = r2
                return
        }

        public final void a() {
                r1 = this;
                r0 = 1
                r1.f226a = r0
                a.kb$a r0 = r1.b
                r1.c = r0
                r0 = 0
                r1.f = r0
                return
        }

        public final boolean b() {
                r4 = this;
                a.kb$a r0 = r4.c
                a.Tf r0 = r0.b
                a.ib r0 = r0.b()
                r1 = 6
                int r1 = r0.a(r1)
                r2 = 1
                if (r1 == 0) goto L1e
                java.lang.Object r3 = r0.d
                java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
                int r0 = r0.f233a
                int r1 = r1 + r0
                byte r0 = r3.get(r1)
                if (r0 == 0) goto L1e
                return r2
            L1e:
                int r0 = r4.e
                r1 = 65039(0xfe0f, float:9.1139E-41)
                if (r0 != r1) goto L26
                return r2
            L26:
                r0 = 0
                return r0
        }
    }

    public Q5(a.C0230kb r8, androidx.emoji2.text.c.d r9, a.P4 r10, java.util.Set r11) {
            r7 = this;
            r7.<init>()
            r7.f223a = r9
            r7.b = r8
            r7.c = r10
            boolean r8 = r11.isEmpty()
            if (r8 == 0) goto L10
            goto L38
        L10:
            java.util.Iterator r8 = r11.iterator()
        L14:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L38
            java.lang.Object r9 = r8.next()
            int[] r9 = (int[]) r9
            java.lang.String r1 = new java.lang.String
            int r10 = r9.length
            r11 = 0
            r1.<init>(r9, r11, r10)
            a.Q5$c r6 = new a.Q5$c
            r6.<init>(r1)
            int r3 = r1.length()
            r2 = 0
            r4 = 1
            r5 = 1
            r0 = r7
            r0.c(r1, r2, r3, r4, r5, r6)
            goto L14
        L38:
            return
    }

    public static boolean a(android.text.Editable r6, android.view.KeyEvent r7, boolean r8) {
            int r7 = r7.getMetaState()
            boolean r7 = android.view.KeyEvent.metaStateHasNoModifiers(r7)
            r0 = 0
            if (r7 != 0) goto Lc
            goto L4b
        Lc:
            int r7 = android.text.Selection.getSelectionStart(r6)
            int r1 = android.text.Selection.getSelectionEnd(r6)
            r2 = -1
            if (r7 == r2) goto L4b
            if (r1 == r2) goto L4b
            if (r7 == r1) goto L1c
            goto L4b
        L1c:
            java.lang.Class<a.R5> r2 = a.R5.class
            java.lang.Object[] r1 = r6.getSpans(r7, r1, r2)
            a.R5[] r1 = (a.R5[]) r1
            if (r1 == 0) goto L4b
            int r2 = r1.length
            if (r2 <= 0) goto L4b
            int r2 = r1.length
            r3 = r0
        L2b:
            if (r3 >= r2) goto L4b
            r4 = r1[r3]
            int r5 = r6.getSpanStart(r4)
            int r4 = r6.getSpanEnd(r4)
            if (r8 == 0) goto L3b
            if (r5 == r7) goto L43
        L3b:
            if (r8 != 0) goto L3f
            if (r4 == r7) goto L43
        L3f:
            if (r7 <= r5) goto L48
            if (r7 >= r4) goto L48
        L43:
            r6.delete(r5, r4)
            r6 = 1
            return r6
        L48:
            int r3 = r3 + 1
            goto L2b
        L4b:
            return r0
    }

    public final boolean b(java.lang.CharSequence r8, int r9, int r10, a.Tf r11) {
            r7 = this;
            r0 = 1
            int r1 = r11.c
            r1 = r1 & 3
            r2 = 2
            r3 = 0
            if (r1 != 0) goto L61
            a.P4 r1 = r7.c
            a.ib r4 = r11.b()
            r5 = 8
            int r5 = r4.a(r5)
            if (r5 == 0) goto L21
            java.lang.Object r6 = r4.d
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            int r4 = r4.f233a
            int r5 = r5 + r4
            r6.getShort(r5)
        L21:
            r1.getClass()
            java.lang.ThreadLocal<java.lang.StringBuilder> r4 = a.P4.b
            java.lang.Object r5 = r4.get()
            if (r5 != 0) goto L34
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r4.set(r5)
        L34:
            java.lang.Object r4 = r4.get()
            java.lang.StringBuilder r4 = (java.lang.StringBuilder) r4
            r4.setLength(r3)
        L3d:
            if (r9 >= r10) goto L48
            char r5 = r8.charAt(r9)
            r4.append(r5)
            int r9 = r9 + r0
            goto L3d
        L48:
            android.text.TextPaint r8 = r1.f205a
            java.lang.String r9 = r4.toString()
            int r10 = a.C0249lc.f559a
            boolean r8 = a.C0249lc.a.a(r8, r9)
            int r9 = r11.c
            r9 = r9 & 4
            if (r8 == 0) goto L5d
            r8 = r9 | 2
            goto L5f
        L5d:
            r8 = r9 | 1
        L5f:
            r11.c = r8
        L61:
            int r8 = r11.c
            r8 = r8 & 3
            if (r8 != r2) goto L68
            return r0
        L68:
            return r3
    }

    public final <T> T c(java.lang.CharSequence r17, int r18, int r19, int r20, boolean r21, a.Q5.b<T> r22) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r22
            a.Q5$d r5 = new a.Q5$d
            a.kb r6 = r0.b
            a.kb$a r6 = r6.c
            r5.<init>(r6)
            int r6 = java.lang.Character.codePointAt(r17, r18)
            r7 = 1
            r8 = 0
            r9 = r6
            r11 = r7
            r10 = r8
            r6 = r18
        L1e:
            r8 = r6
        L1f:
            r12 = 2
            if (r6 >= r2) goto Lca
            if (r10 >= r3) goto Lca
            if (r11 == 0) goto Lca
            a.kb$a r13 = r5.c
            android.util.SparseArray<a.kb$a> r13 = r13.f547a
            if (r13 != 0) goto L2e
            r13 = 0
            goto L34
        L2e:
            java.lang.Object r13 = r13.get(r9)
            a.kb$a r13 = (a.C0230kb.a) r13
        L34:
            int r14 = r5.f226a
            r15 = 3
            if (r14 == r12) goto L48
            if (r13 != 0) goto L40
            r5.a()
        L3e:
            r13 = r7
            goto L88
        L40:
            r5.f226a = r12
            r5.c = r13
            r5.f = r7
        L46:
            r13 = r12
            goto L88
        L48:
            if (r13 == 0) goto L52
            r5.c = r13
            int r13 = r5.f
            int r13 = r13 + r7
            r5.f = r13
            goto L46
        L52:
            r13 = 65038(0xfe0e, float:9.1138E-41)
            if (r9 != r13) goto L5b
            r5.a()
            goto L3e
        L5b:
            r13 = 65039(0xfe0f, float:9.1139E-41)
            if (r9 != r13) goto L61
            goto L46
        L61:
            a.kb$a r13 = r5.c
            a.Tf r14 = r13.b
            if (r14 == 0) goto L84
            int r14 = r5.f
            if (r14 != r7) goto L7e
            boolean r13 = r5.b()
            if (r13 == 0) goto L7a
            a.kb$a r13 = r5.c
            r5.d = r13
            r5.a()
        L78:
            r13 = r15
            goto L88
        L7a:
            r5.a()
            goto L3e
        L7e:
            r5.d = r13
            r5.a()
            goto L78
        L84:
            r5.a()
            goto L3e
        L88:
            r5.e = r9
            if (r13 == r7) goto Lb8
            if (r13 == r12) goto La9
            if (r13 == r15) goto L91
            goto L1f
        L91:
            if (r21 != 0) goto L9d
            a.kb$a r12 = r5.d
            a.Tf r12 = r12.b
            boolean r12 = r0.b(r1, r8, r6, r12)
            if (r12 != 0) goto L1e
        L9d:
            a.kb$a r11 = r5.d
            a.Tf r11 = r11.b
            boolean r11 = r4.b(r1, r8, r6, r11)
            int r10 = r10 + 1
            goto L1e
        La9:
            int r12 = java.lang.Character.charCount(r9)
            int r12 = r12 + r6
            if (r12 >= r2) goto Lb5
            int r6 = java.lang.Character.codePointAt(r1, r12)
            r9 = r6
        Lb5:
            r6 = r12
            goto L1f
        Lb8:
            int r6 = java.lang.Character.codePointAt(r1, r8)
            int r6 = java.lang.Character.charCount(r6)
            int r6 = r6 + r8
            if (r6 >= r2) goto L1e
            int r8 = java.lang.Character.codePointAt(r1, r6)
            r9 = r8
            goto L1e
        Lca:
            int r2 = r5.f226a
            if (r2 != r12) goto Lf5
            a.kb$a r2 = r5.c
            a.Tf r2 = r2.b
            if (r2 == 0) goto Lf5
            int r2 = r5.f
            if (r2 > r7) goto Lde
            boolean r2 = r5.b()
            if (r2 == 0) goto Lf5
        Lde:
            if (r10 >= r3) goto Lf5
            if (r11 == 0) goto Lf5
            if (r21 != 0) goto Lee
            a.kb$a r2 = r5.c
            a.Tf r2 = r2.b
            boolean r2 = r0.b(r1, r8, r6, r2)
            if (r2 != 0) goto Lf5
        Lee:
            a.kb$a r2 = r5.c
            a.Tf r2 = r2.b
            r4.b(r1, r8, r6, r2)
        Lf5:
            java.lang.Object r1 = r4.a()
            return r1
    }
}
