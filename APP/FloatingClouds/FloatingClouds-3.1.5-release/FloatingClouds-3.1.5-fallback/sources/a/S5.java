package a;

/* JADX INFO: loaded from: classes.dex */
public final class S5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.S5.b f256a;

    public static class a extends a.S5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.widget.TextView f257a;
        public final a.O5 b;
        public boolean c;

        public a(android.widget.TextView r2) {
                r1 = this;
                r1.<init>()
                r1.f257a = r2
                r0 = 1
                r1.c = r0
                a.O5 r0 = new a.O5
                r0.<init>(r2)
                r1.b = r0
                return
        }

        @Override // a.S5.b
        public final android.text.InputFilter[] a(android.text.InputFilter[] r7) {
                r6 = this;
                boolean r0 = r6.c
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L3e
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>(r2)
                r2 = r1
            Lc:
                int r3 = r7.length
                if (r2 >= r3) goto L1b
                r3 = r7[r2]
                boolean r4 = r3 instanceof a.O5
                if (r4 == 0) goto L18
                r0.put(r2, r3)
            L18:
                int r2 = r2 + 1
                goto Lc
            L1b:
                int r2 = r0.size()
                if (r2 != 0) goto L22
                return r7
            L22:
                int r2 = r7.length
                int r3 = r7.length
                int r4 = r0.size()
                int r3 = r3 - r4
                android.text.InputFilter[] r3 = new android.text.InputFilter[r3]
                r4 = r1
            L2c:
                if (r1 >= r2) goto L3d
                int r5 = r0.indexOfKey(r1)
                if (r5 >= 0) goto L3a
                r5 = r7[r1]
                r3[r4] = r5
                int r4 = r4 + 1
            L3a:
                int r1 = r1 + 1
                goto L2c
            L3d:
                return r3
            L3e:
                int r0 = r7.length
                r3 = r1
            L40:
                a.O5 r4 = r6.b
                if (r3 >= r0) goto L4c
                r5 = r7[r3]
                if (r5 != r4) goto L49
                return r7
            L49:
                int r3 = r3 + 1
                goto L40
            L4c:
                int r3 = r7.length
                int r3 = r3 + r2
                android.text.InputFilter[] r2 = new android.text.InputFilter[r3]
                java.lang.System.arraycopy(r7, r1, r2, r1, r0)
                r2[r0] = r4
                return r2
        }

        @Override // a.S5.b
        public final boolean b() {
                r1 = this;
                boolean r0 = r1.c
                return r0
        }

        @Override // a.S5.b
        public final void c(boolean r2) {
                r1 = this;
                if (r2 == 0) goto Lf
                android.widget.TextView r2 = r1.f257a
                android.text.method.TransformationMethod r0 = r2.getTransformationMethod()
                android.text.method.TransformationMethod r0 = r1.e(r0)
                r2.setTransformationMethod(r0)
            Lf:
                return
        }

        @Override // a.S5.b
        public final void d(boolean r2) {
                r1 = this;
                r1.c = r2
                android.widget.TextView r2 = r1.f257a
                android.text.method.TransformationMethod r0 = r2.getTransformationMethod()
                android.text.method.TransformationMethod r0 = r1.e(r0)
                r2.setTransformationMethod(r0)
                android.text.InputFilter[] r0 = r2.getFilters()
                android.text.InputFilter[] r0 = r1.a(r0)
                r2.setFilters(r0)
                return
        }

        @Override // a.S5.b
        public final android.text.method.TransformationMethod e(android.text.method.TransformationMethod r2) {
                r1 = this;
                boolean r0 = r1.c
                if (r0 == 0) goto L14
                boolean r0 = r2 instanceof a.U5
                if (r0 == 0) goto L9
                return r2
            L9:
                boolean r0 = r2 instanceof android.text.method.PasswordTransformationMethod
                if (r0 == 0) goto Le
                return r2
            Le:
                a.U5 r0 = new a.U5
                r0.<init>(r2)
                return r0
            L14:
                boolean r0 = r2 instanceof a.U5
                if (r0 == 0) goto L1c
                a.U5 r2 = (a.U5) r2
                android.text.method.TransformationMethod r2 = r2.f287a
            L1c:
                return r2
        }
    }

    public static class b {
        public android.text.InputFilter[] a(android.text.InputFilter[] r1) {
                r0 = this;
                r0 = 0
                throw r0
        }

        public boolean b() {
                r0 = this;
                r0 = 0
                throw r0
        }

        public void c(boolean r1) {
                r0 = this;
                r0 = 0
                throw r0
        }

        public void d(boolean r1) {
                r0 = this;
                r0 = 0
                throw r0
        }

        public android.text.method.TransformationMethod e(android.text.method.TransformationMethod r1) {
                r0 = this;
                r0 = 0
                throw r0
        }
    }

    public static class c extends a.S5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.S5.a f258a;

        public c(android.widget.TextView r2) {
                r1 = this;
                r1.<init>()
                a.S5$a r0 = new a.S5$a
                r0.<init>(r2)
                r1.f258a = r0
                return
        }

        @Override // a.S5.b
        public final android.text.InputFilter[] a(android.text.InputFilter[] r2) {
                r1 = this;
                androidx.emoji2.text.c r0 = androidx.emoji2.text.c.k
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                if (r0 != 0) goto La
                return r2
            La:
                a.S5$a r0 = r1.f258a
                android.text.InputFilter[] r2 = r0.a(r2)
                return r2
        }

        @Override // a.S5.b
        public final boolean b() {
                r1 = this;
                a.S5$a r0 = r1.f258a
                boolean r0 = r0.c
                return r0
        }

        @Override // a.S5.b
        public final void c(boolean r2) {
                r1 = this;
                androidx.emoji2.text.c r0 = androidx.emoji2.text.c.k
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                if (r0 != 0) goto La
                return
            La:
                a.S5$a r0 = r1.f258a
                r0.c(r2)
                return
        }

        @Override // a.S5.b
        public final void d(boolean r3) {
                r2 = this;
                androidx.emoji2.text.c r0 = androidx.emoji2.text.c.k
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                a.S5$a r1 = r2.f258a
                if (r0 != 0) goto Le
                r1.c = r3
                return
            Le:
                r1.d(r3)
                return
        }

        @Override // a.S5.b
        public final android.text.method.TransformationMethod e(android.text.method.TransformationMethod r2) {
                r1 = this;
                androidx.emoji2.text.c r0 = androidx.emoji2.text.c.k
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                if (r0 != 0) goto La
                return r2
            La:
                a.S5$a r0 = r1.f258a
                android.text.method.TransformationMethod r2 = r0.e(r2)
                return r2
        }
    }

    public S5(android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            a.S5$c r0 = new a.S5$c
            r0.<init>(r2)
            r1.f256a = r0
            return
    }
}
