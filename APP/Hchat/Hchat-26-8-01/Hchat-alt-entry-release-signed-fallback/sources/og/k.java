package og;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements java.io.Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.regex.Pattern f9833g;

    static {
            return
    }

    public k(java.lang.String r1) {
            r0 = this;
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r1.getClass()
            r0.<init>()
            r0.f9833g = r1
            return
    }

    public k(java.lang.String r1, int r2) {
            r0 = this;
            r2 = 2
            int r2 = l3.w.f(r2)
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1, r2)
            r1.getClass()
            r0.<init>()
            r0.f9833g = r1
            return
    }

    public k(java.lang.String r3, java.util.Set r4) {
            r2 = this;
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L7:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r4.next()
            og.l r1 = (og.l) r1
            int r1 = r1.f9837g
            r0 = r0 | r1
            goto L7
        L17:
            int r4 = l3.w.f(r0)
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3, r4)
            r3.getClass()
            r2.<init>()
            r2.f9833g = r3
            return
    }

    public static og.i b(og.k r1, java.lang.String r2) {
            r1.getClass()
            r2.getClass()
            java.util.regex.Pattern r1 = r1.f9833g
            java.util.regex.Matcher r1 = r1.matcher(r2)
            r1.getClass()
            r0 = 0
            og.i r1 = a7.a.b(r1, r0, r2)
            return r1
    }

    public static ng.c c(og.k r2, java.lang.CharSequence r3) {
            r2.getClass()
            r3.getClass()
            int r0 = r3.length()
            if (r0 < 0) goto L1b
            aa.c r0 = new aa.c
            r1 = 24
            r0.<init>(r2, r1, r3)
            og.j r2 = og.j.f9832n
            ng.c r3 = new ng.c
            r3.<init>(r0, r2)
            return r3
        L1b:
            java.lang.String r2 = "Start index out of bounds: "
            java.lang.String r0 = ", input length: "
            r1 = 0
            java.lang.StringBuilder r2 = eh.a.t(r1, r2, r0)
            int r3 = r3.length()
            j8.o.e(r3, r2)
            r2 = 0
            return r2
    }

    public final boolean a(java.lang.CharSequence r2) {
            r1 = this;
            r2.getClass()
            java.util.regex.Pattern r0 = r1.f9833g
            java.util.regex.Matcher r2 = r0.matcher(r2)
            boolean r2 = r2.find()
            return r2
    }

    public final boolean d(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            java.util.regex.Pattern r0 = r1.f9833g
            java.util.regex.Matcher r2 = r0.matcher(r2)
            boolean r2 = r2.matches()
            return r2
    }

    public final java.lang.String e(java.lang.CharSequence r6, fg.l r7) {
            r5 = this;
            r6.getClass()
            java.util.regex.Pattern r0 = r5.f9833g
            java.util.regex.Matcher r0 = r0.matcher(r6)
            r0.getClass()
            r1 = 0
            og.i r0 = a7.a.b(r0, r1, r6)
            if (r0 != 0) goto L18
            java.lang.String r6 = r6.toString()
            return r6
        L18:
            int r2 = r6.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
        L21:
            lg.d r4 = r0.b()
            int r4 = r4.f8042g
            r3.append(r6, r1, r4)
            java.lang.Object r1 = r7.invoke(r0)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r3.append(r1)
            lg.d r1 = r0.b()
            int r1 = r1.f8043h
            int r1 = r1 + 1
            og.i r0 = r0.d()
            if (r1 >= r2) goto L43
            if (r0 != 0) goto L21
        L43:
            if (r1 >= r2) goto L48
            r3.append(r6, r1, r2)
        L48:
            java.lang.String r6 = r3.toString()
            return r6
    }

    public final java.lang.String f(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r2.getClass()
            java.util.regex.Pattern r0 = r1.f9833g
            java.util.regex.Matcher r2 = r0.matcher(r2)
            java.lang.String r2 = r2.replaceAll(r3)
            r2.getClass()
            return r2
    }

    public final java.lang.String toString() {
            r1 = this;
            java.util.regex.Pattern r0 = r1.f9833g
            java.lang.String r0 = r0.toString()
            r0.getClass()
            return r0
    }
}
