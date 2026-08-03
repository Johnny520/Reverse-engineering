package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ua extends p000.o4 implements p000.h3<java.lang.CharSequence, java.lang.Integer, p000.q7<? extends java.lang.Integer, ? extends java.lang.Integer>> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ java.util.List<java.lang.String> f1083;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final /* synthetic */ boolean f1084;

    public ua(java.util.List<java.lang.String> r1, boolean r2) {
            r0 = this;
            r0.f1083 = r1
            r0.f1084 = r2
            r0.<init>()
            return
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p000.h3
    /* JADX INFO: renamed from: ۥ۟ */
    public final p000.q7<? extends java.lang.Integer, ? extends java.lang.Integer> mo184(java.lang.CharSequence r14, java.lang.Integer r15) {
            r13 = this;
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            java.lang.String r0 = "$this$$receiver"
            p000.h4.m189(r0, r14)
            java.util.List<java.lang.String> r0 = r13.f1083
            boolean r7 = r13.f1084
            r1 = 0
            r8 = 0
            if (r7 != 0) goto L4e
            int r2 = r0.size()
            r3 = 1
            if (r2 != r3) goto L4e
            int r2 = r0.size()
            if (r2 == 0) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r2 = 4
            int r14 = p000.va.m441(r14, r0, r15, r1, r2)
            if (r14 >= 0) goto L33
            goto Lda
        L33:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            ۟.q7 r15 = new ۟.q7
            r15.<init>(r14, r0)
            goto Ldb
        L3e:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "List has more than one element."
            r14.<init>(r15)
            throw r14
        L46:
            java.util.NoSuchElementException r14 = new java.util.NoSuchElementException
            java.lang.String r15 = "List is empty."
            r14.<init>(r15)
            throw r14
        L4e:
            ۟.g4 r2 = new ۟.g4
            if (r15 >= 0) goto L53
            r15 = r1
        L53:
            int r1 = r14.length()
            r2.<init>(r15, r1)
            boolean r1 = r14 instanceof java.lang.String
            if (r1 == 0) goto L9f
            int r9 = r2.f300
            int r10 = r2.f301
            if (r10 <= 0) goto L66
            if (r15 <= r9) goto L6a
        L66:
            if (r10 >= 0) goto Lda
            if (r9 > r15) goto Lda
        L6a:
            java.util.Iterator r11 = r0.iterator()
        L6e:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L8c
            java.lang.Object r12 = r11.next()
            r1 = r12
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            r3 = r14
            java.lang.String r3 = (java.lang.String) r3
            int r5 = r1.length()
            r4 = r15
            r6 = r7
            boolean r1 = p000.ta.m421(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L6e
            goto L8d
        L8c:
            r12 = r8
        L8d:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L9b
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            ۟.q7 r15 = new ۟.q7
            r15.<init>(r14, r12)
            goto Ldb
        L9b:
            if (r15 == r9) goto Lda
            int r15 = r15 + r10
            goto L6a
        L9f:
            int r1 = r2.f300
            int r2 = r2.f301
            if (r2 <= 0) goto La7
            if (r15 <= r1) goto Lab
        La7:
            if (r2 >= 0) goto Lda
            if (r1 > r15) goto Lda
        Lab:
            java.util.Iterator r3 = r0.iterator()
        Laf:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lc7
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r5.length()
            boolean r5 = p000.va.m442(r5, r14, r15, r6, r7)
            if (r5 == 0) goto Laf
            goto Lc8
        Lc7:
            r4 = r8
        Lc8:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto Ld6
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            ۟.q7 r15 = new ۟.q7
            r15.<init>(r14, r4)
            goto Ldb
        Ld6:
            if (r15 == r1) goto Lda
            int r15 = r15 + r2
            goto Lab
        Lda:
            r15 = r8
        Ldb:
            if (r15 == 0) goto Lf0
            A r14 = r15.f918
            B r15 = r15.f919
            java.lang.String r15 = (java.lang.String) r15
            int r15 = r15.length()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            ۟.q7 r8 = new ۟.q7
            r8.<init>(r14, r15)
        Lf0:
            return r8
    }
}
