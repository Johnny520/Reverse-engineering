package a;

/* JADX INFO: renamed from: a.gd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0161gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f485a;
    public final java.lang.Class<?> b;
    public final a.C0207j6 c;
    public final a.EnumC0089cd d;
    public final a.EnumC0107dd e;
    public final java.lang.reflect.Method f;
    public final java.util.Map<java.lang.String, java.lang.Object> g;

    /* JADX INFO: renamed from: a.gd$a */
    public static final class a {
        public static a.C0161gd a(java.lang.Class r8, a.EnumC0089cd r9, java.lang.reflect.Method r10, java.util.Map r11, int r12) {
                a.dd r5 = a.EnumC0107dd.f439a
                r0 = r12 & 8
                r1 = 0
                if (r0 == 0) goto L9
                r6 = r1
                goto La
            L9:
                r6 = r10
            La:
                r10 = r12 & 16
                if (r10 == 0) goto L10
                r7 = r1
                goto L11
            L10:
                r7 = r11
            L11:
                java.lang.String r10 = "clazz"
                a.C0193i9.e(r8, r10)
                a.gd r0 = new a.gd
                r1 = 1
                r3 = 0
                r2 = r8
                r4 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r0
        }
    }

    static {
            return
    }

    public C0161gd(boolean r1, java.lang.Class<?> r2, a.C0207j6 r3, a.EnumC0089cd r4, a.EnumC0107dd r5, java.lang.reflect.Method r6, java.util.Map<java.lang.String, ? extends java.lang.Object> r7) {
            r0 = this;
            r0.<init>()
            r0.f485a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            return
    }

    public final java.lang.Class<?> a(java.lang.String r3) {
            r2 = this;
            r0 = 0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.g
            if (r1 == 0) goto La
            java.lang.Object r3 = r1.get(r3)
            goto Lb
        La:
            r3 = r0
        Lb:
            boolean r1 = r3 instanceof java.lang.Class
            if (r1 == 0) goto L12
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
        L12:
            return r0
    }

    public final java.lang.String b(java.lang.String r3) {
            r2 = this;
            r0 = 0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.g
            if (r1 == 0) goto La
            java.lang.Object r3 = r1.get(r3)
            goto Lb
        La:
            r3 = r0
        Lb:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L12
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L12:
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L4c
        L3:
            boolean r0 = r3 instanceof a.C0161gd
            if (r0 != 0) goto L8
            goto L4a
        L8:
            a.gd r3 = (a.C0161gd) r3
            boolean r0 = r3.f485a
            boolean r1 = r2.f485a
            if (r1 == r0) goto L11
            goto L4a
        L11:
            java.lang.Class<?> r0 = r2.b
            java.lang.Class<?> r1 = r3.b
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 != 0) goto L1c
            goto L4a
        L1c:
            a.j6 r0 = r2.c
            a.j6 r1 = r3.c
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 != 0) goto L27
            goto L4a
        L27:
            a.cd r0 = r2.d
            a.cd r1 = r3.d
            if (r0 == r1) goto L2e
            goto L4a
        L2e:
            a.dd r0 = r2.e
            a.dd r1 = r3.e
            if (r0 == r1) goto L35
            goto L4a
        L35:
            java.lang.reflect.Method r0 = r2.f
            java.lang.reflect.Method r1 = r3.f
            boolean r0 = a.C0193i9.a(r0, r1)
            if (r0 != 0) goto L40
            goto L4a
        L40:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.g
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.g
            boolean r3 = a.C0193i9.a(r0, r3)
            if (r3 != 0) goto L4c
        L4a:
            r3 = 0
            return r3
        L4c:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f485a
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 * 31
            r1 = 0
            java.lang.Class<?> r2 = r3.b
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            a.j6 r2 = r3.c
            if (r2 != 0) goto L1c
            r2 = r1
            goto L20
        L1c:
            int r2 = r2.hashCode()
        L20:
            int r0 = r0 + r2
            int r0 = r0 * 31
            a.cd r2 = r3.d
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * 31
            a.dd r0 = r3.e
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.reflect.Method r2 = r3.f
            if (r2 != 0) goto L3b
            r2 = r1
            goto L3f
        L3b:
            int r2 = r2.hashCode()
        L3f:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.util.Map<java.lang.String, java.lang.Object> r2 = r3.g
            if (r2 != 0) goto L47
            goto L4b
        L47:
            int r1 = r2.hashCode()
        L4b:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ResolveResult(success="
            r0.<init>(r1)
            boolean r1 = r2.f485a
            r0.append(r1)
            java.lang.String r1 = ", clazz="
            r0.append(r1)
            java.lang.Class<?> r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", failureReason="
            r0.append(r1)
            a.j6 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", resolutionPath="
            r0.append(r1)
            a.cd r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", status="
            r0.append(r1)
            a.dd r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", method="
            r0.append(r1)
            java.lang.reflect.Method r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", extras="
            r0.append(r1)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
