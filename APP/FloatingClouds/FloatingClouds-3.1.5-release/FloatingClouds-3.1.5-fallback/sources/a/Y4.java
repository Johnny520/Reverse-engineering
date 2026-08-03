package a;

/* JADX INFO: loaded from: classes.dex */
public final class Y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f350a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final a.Me d;

    public static final class a extends a.AbstractC0407u9 implements a.InterfaceC0369s7<java.lang.String> {
        public final /* synthetic */ a.Y4 b;

        public a(a.Y4 r1) {
                r0 = this;
                r0.b = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // a.InterfaceC0369s7
        public final java.lang.String a() {
                r1 = this;
                a.Y4 r0 = r1.b
                java.lang.String r0 = r0.c
                java.lang.String r0 = a.C0171h5.b(r0)
                return r0
        }
    }

    public Y4(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "descriptor"
            a.C0193i9.e(r6, r0)
            r5.<init>()
            a.Y4$a r0 = new a.Y4$a
            r0.<init>(r5)
            a.Me r1 = new a.Me
            r1.<init>(r0)
            r5.d = r1
            r0 = 6
            java.lang.String r1 = "->"
            r2 = 0
            int r0 = a.Be.N(r6, r1, r2, r2, r0)
            int r1 = r0 + 1
            r3 = 4
            java.lang.String r4 = ":"
            int r1 = a.Be.N(r6, r4, r1, r2, r3)
            r3 = -1
            if (r0 == r3) goto L56
            if (r1 == r3) goto L56
            java.lang.String r2 = r6.substring(r2, r0)
            java.lang.String r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            a.C0193i9.d(r2, r3)
            java.lang.String r2 = a.C0171h5.a(r2)
            r5.f350a = r2
            int r0 = r0 + 2
            java.lang.String r0 = r6.substring(r0, r1)
            a.C0193i9.d(r0, r3)
            r5.b = r0
            int r1 = r1 + 1
            java.lang.String r6 = r6.substring(r1)
            java.lang.String r0 = "(this as java.lang.String).substring(startIndex)"
            a.C0193i9.d(r6, r0)
            java.lang.String r6 = a.C0171h5.a(r6)
            r5.c = r6
            return
        L56:
            java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError
            java.lang.String r1 = "not field descriptor: "
            java.lang.String r6 = r1.concat(r6)
            r0.<init>(r6)
            throw r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof a.Y4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a.Y4 r5 = (a.Y4) r5
            java.lang.String r1 = r5.f350a
            java.lang.String r3 = r4.f350a
            boolean r1 = a.C0193i9.a(r3, r1)
            if (r1 == 0) goto L2b
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 == 0) goto L2b
            java.lang.String r1 = r4.c
            java.lang.String r5 = r5.c
            boolean r5 = a.C0193i9.a(r1, r5)
            if (r5 == 0) goto L2b
            return r0
        L2b:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f350a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 * 31
            int r1 = r1 + r0
            java.lang.String r0 = r2.c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.f350a
            java.lang.String r1 = a.C0171h5.b(r1)
            r0.append(r1)
            java.lang.String r1 = "->"
            r0.append(r1)
            java.lang.String r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            a.Me r1 = r2.d
            java.lang.Object r1 = r1.a()
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            a.C0193i9.d(r0, r1)
            return r0
    }
}
