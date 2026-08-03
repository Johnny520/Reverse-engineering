package a;

/* JADX INFO: renamed from: a.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0135f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f469a;
    public final java.lang.String b;
    public final java.util.ArrayList c;
    public final java.lang.String d;
    public final a.Me e;

    /* JADX INFO: renamed from: a.f5$a */
    public static final class a extends a.AbstractC0407u9 implements a.InterfaceC0369s7<java.lang.String> {
        public final /* synthetic */ a.C0135f5 b;

        public a(a.C0135f5 r1) {
                r0 = this;
                r0.b = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // a.InterfaceC0369s7
        public final java.lang.String a() {
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "("
                r0.<init>(r1)
                a.f5 r1 = r6.b
                java.util.ArrayList r2 = r1.c
                a.e5 r3 = a.C0117e5.b
                java.lang.String r4 = ""
                r5 = 30
                java.lang.String r2 = a.C0383t3.p0(r2, r4, r3, r5)
                r0.append(r2)
                java.lang.String r2 = ")"
                r0.append(r2)
                java.lang.String r1 = r1.d
                java.lang.String r1 = a.C0171h5.b(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                a.C0193i9.d(r0, r1)
                return r0
        }
    }

    public C0135f5(java.lang.String r10) {
            r9 = this;
            java.lang.String r0 = "descriptor"
            a.C0193i9.e(r10, r0)
            r9.<init>()
            a.f5$a r0 = new a.f5$a
            r0.<init>(r9)
            a.Me r1 = new a.Me
            r1.<init>(r0)
            r9.e = r1
            r0 = 6
            java.lang.String r1 = "->"
            r2 = 0
            int r0 = a.Be.N(r10, r1, r2, r2, r0)
            int r1 = r0 + 1
            java.lang.String r3 = "("
            r4 = 4
            int r1 = a.Be.N(r10, r3, r1, r2, r4)
            int r3 = r1 + 1
            java.lang.String r5 = ")"
            int r5 = a.Be.N(r10, r5, r3, r2, r4)
            r6 = -1
            if (r0 == r6) goto La9
            if (r1 == r6) goto La9
            if (r5 == r6) goto La9
            java.lang.String r6 = r10.substring(r2, r0)
            java.lang.String r7 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            a.C0193i9.d(r6, r7)
            java.lang.String r6 = a.C0171h5.a(r6)
            r9.f469a = r6
            int r0 = r0 + 2
            java.lang.String r0 = r10.substring(r0, r1)
            a.C0193i9.d(r0, r7)
            r9.b = r0
            java.lang.String r0 = r10.substring(r3, r5)
            a.C0193i9.d(r0, r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L5a:
            r3 = r2
        L5b:
            int r6 = r0.length()
            if (r2 >= r6) goto L87
            char r6 = r0.charAt(r2)
            r8 = 91
            if (r6 != r8) goto L6c
            int r2 = r2 + 1
            goto L5b
        L6c:
            r8 = 76
            if (r6 != r8) goto L76
            r6 = 59
            int r2 = a.Be.O(r0, r6, r2, r4)
        L76:
            int r2 = r2 + 1
            java.lang.String r3 = r0.substring(r3, r2)
            a.C0193i9.d(r3, r7)
            java.lang.String r3 = a.C0171h5.a(r3)
            r1.add(r3)
            goto L5a
        L87:
            if (r3 != r2) goto L9d
            r9.c = r1
            int r5 = r5 + 1
            java.lang.String r10 = r10.substring(r5)
            java.lang.String r0 = "(this as java.lang.String).substring(startIndex)"
            a.C0193i9.d(r10, r0)
            java.lang.String r10 = a.C0171h5.a(r10)
            r9.d = r10
            return
        L9d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unknown signString: "
            java.lang.String r0 = r1.concat(r0)
            r10.<init>(r0)
            throw r10
        La9:
            java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError
            java.lang.String r1 = "not method descriptor: "
            java.lang.String r10 = r1.concat(r10)
            r0.<init>(r10)
            throw r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L32
        L3:
            boolean r0 = r3 instanceof a.C0135f5
            if (r0 != 0) goto L8
            goto L34
        L8:
            a.f5 r3 = (a.C0135f5) r3
            java.lang.String r0 = r3.f469a
            java.lang.String r1 = r2.f469a
            boolean r0 = a.C0193i9.a(r1, r0)
            if (r0 == 0) goto L34
            java.lang.String r0 = r2.b
            java.lang.String r1 = r3.b
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 == 0) goto L34
            java.util.ArrayList r0 = r2.c
            java.util.ArrayList r1 = r3.c
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 == 0) goto L34
            java.lang.String r0 = r2.d
            java.lang.String r3 = r3.d
            boolean r3 = a.C0193i9.a(r0, r3)
            if (r3 == 0) goto L34
        L32:
            r3 = 1
            return r3
        L34:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f469a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 * 31
            int r1 = r1 + r0
            java.util.ArrayList r0 = r2.c
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r0 = r0 + r1
            java.lang.String r1 = r2.d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.f469a
            java.lang.String r1 = a.C0171h5.b(r1)
            r0.append(r1)
            java.lang.String r1 = "->"
            r0.append(r1)
            java.lang.String r1 = r2.b
            r0.append(r1)
            a.Me r1 = r2.e
            java.lang.Object r1 = r1.a()
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            a.C0193i9.d(r0, r1)
            return r0
    }
}
