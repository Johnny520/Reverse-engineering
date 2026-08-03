package a;

/* JADX INFO: renamed from: a.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0043a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static java.lang.Object f384a;

    /* JADX INFO: renamed from: a.a5$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f385a;
        public final java.lang.String b;
        public final java.lang.String c;
        public final java.lang.String d;

        public a(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.f385a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                return
        }

        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof a.C0043a5.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                a.a5$a r5 = (a.C0043a5.a) r5
                java.lang.String r1 = r5.f385a
                java.lang.String r3 = r4.f385a
                boolean r1 = a.C0193i9.a(r3, r1)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.b
                java.lang.String r3 = r5.b
                boolean r1 = a.C0193i9.a(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                java.lang.String r1 = r4.c
                java.lang.String r3 = r5.c
                boolean r1 = a.C0193i9.a(r1, r3)
                if (r1 != 0) goto L2d
                return r2
            L2d:
                java.lang.String r1 = r4.d
                java.lang.String r5 = r5.d
                boolean r5 = a.C0193i9.a(r1, r5)
                if (r5 != 0) goto L38
                return r2
            L38:
                return r0
        }

        public final int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.f385a
                int r0 = r0.hashCode()
                r1 = 31
                int r0 = r0 * r1
                java.lang.String r2 = r3.b
                int r0 = a.C0487z.b(r2, r0, r1)
                java.lang.String r2 = r3.c
                int r0 = a.C0487z.b(r2, r0, r1)
                java.lang.String r1 = r3.d
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public final java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "ContactAddMaskCache(entryClassName="
                r0.<init>(r1)
                java.lang.String r1 = r3.f385a
                r0.append(r1)
                java.lang.String r1 = ", adapterClassName="
                r0.append(r1)
                java.lang.String r1 = r3.b
                r0.append(r1)
                java.lang.String r1 = ", builderClassName="
                r0.append(r1)
                java.lang.String r1 = r3.c
                r0.append(r1)
                java.lang.String r1 = ", clickListenerClassName="
                r0.append(r1)
                java.lang.String r1 = r3.d
                java.lang.String r2 = ")"
                java.lang.String r0 = a.C0487z.h(r0, r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: a.a5$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.Object f386a;

        public b(java.util.List<java.lang.String> r1) {
                r0 = this;
                r0.<init>()
                r0.f386a = r1
                return
        }

        public final boolean equals(java.lang.Object r2) {
                r1 = this;
                if (r1 != r2) goto L3
                goto L16
            L3:
                boolean r0 = r2 instanceof a.C0043a5.b
                if (r0 != 0) goto L8
                goto L14
            L8:
                a.a5$b r2 = (a.C0043a5.b) r2
                java.lang.Object r0 = r1.f386a
                java.lang.Object r2 = r2.f386a
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L16
            L14:
                r2 = 0
                return r2
            L16:
                r2 = 1
                return r2
        }

        public final int hashCode() {
                r1 = this;
                java.lang.Object r0 = r1.f386a
                int r0 = r0.hashCode()
                return r0
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "ContactCache(classNames="
                r0.<init>(r1)
                java.lang.Object r1 = r2.f386a
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: a.a5$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f387a;
        public final java.lang.String b;
        public final java.lang.String c;

        public c(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.f387a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof a.C0043a5.c
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                a.a5$c r5 = (a.C0043a5.c) r5
                java.lang.String r1 = r5.f387a
                java.lang.String r3 = r4.f387a
                boolean r1 = a.C0193i9.a(r3, r1)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.b
                java.lang.String r3 = r5.b
                boolean r1 = a.C0193i9.a(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                java.lang.String r1 = r4.c
                java.lang.String r5 = r5.c
                boolean r5 = a.C0193i9.a(r1, r5)
                if (r5 != 0) goto L2d
                return r2
            L2d:
                return r0
        }

        public final int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.f387a
                int r0 = r0.hashCode()
                r1 = 31
                int r0 = r0 * r1
                java.lang.String r2 = r3.b
                int r0 = a.C0487z.b(r2, r0, r1)
                java.lang.String r1 = r3.c
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public final java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "ContactListFields(displayListField="
                r0.<init>(r1)
                java.lang.String r1 = r3.f387a
                r0.append(r1)
                java.lang.String r1 = ", snapshotField="
                r0.append(r1)
                java.lang.String r1 = r3.b
                r0.append(r1)
                java.lang.String r1 = ", adapterField="
                r0.append(r1)
                java.lang.String r1 = r3.c
                java.lang.String r2 = ")"
                java.lang.String r0 = a.C0487z.h(r0, r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: a.a5$d */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.Object f388a;
        public final java.lang.Object b;
        public final java.lang.Object c;
        public final java.lang.Object d;
        public final java.lang.Object e;
        public final java.lang.Object f;

        public d(java.util.List<java.lang.String> r1, java.util.List<java.lang.String> r2, java.util.List<java.lang.String> r3, java.util.List<java.lang.String> r4, java.util.List<java.lang.String> r5, java.util.List<java.lang.String> r6) {
                r0 = this;
                r0.<init>()
                r0.f388a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.e = r5
                r0.f = r6
                return
        }

        public final boolean equals(java.lang.Object r3) {
                r2 = this;
                if (r2 != r3) goto L3
                goto L4d
            L3:
                boolean r0 = r3 instanceof a.C0043a5.d
                if (r0 != 0) goto L8
                goto L4b
            L8:
                a.a5$d r3 = (a.C0043a5.d) r3
                java.lang.Object r0 = r3.f388a
                java.lang.Object r1 = r2.f388a
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L15
                goto L4b
            L15:
                java.lang.Object r0 = r2.b
                java.lang.Object r1 = r3.b
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L20
                goto L4b
            L20:
                java.lang.Object r0 = r2.c
                java.lang.Object r1 = r3.c
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L2b
                goto L4b
            L2b:
                java.lang.Object r0 = r2.d
                java.lang.Object r1 = r3.d
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L36
                goto L4b
            L36:
                java.lang.Object r0 = r2.e
                java.lang.Object r1 = r3.e
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L41
                goto L4b
            L41:
                java.lang.Object r0 = r2.f
                java.lang.Object r3 = r3.f
                boolean r3 = r0.equals(r3)
                if (r3 != 0) goto L4d
            L4b:
                r3 = 0
                return r3
            L4d:
                r3 = 1
                return r3
        }

        public final int hashCode() {
                r2 = this;
                java.lang.Object r0 = r2.f388a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.Object r1 = r2.b
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                java.lang.Object r0 = r2.c
                int r0 = r0.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.Object r1 = r2.d
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                java.lang.Object r0 = r2.e
                int r0 = r0.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.Object r1 = r2.f
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "ConvMvvmListCache(adapterClassNames="
                r0.<init>(r1)
                java.lang.Object r1 = r2.f388a
                r0.append(r1)
                java.lang.String r1 = ", dataSourceClassNames="
                r0.append(r1)
                java.lang.Object r1 = r2.b
                r0.append(r1)
                java.lang.String r1 = ", itemClassNames="
                r0.append(r1)
                java.lang.Object r1 = r2.c
                r0.append(r1)
                java.lang.String r1 = ", holderClassNames="
                r0.append(r1)
                java.lang.Object r1 = r2.d
                r0.append(r1)
                java.lang.String r1 = ", requestClassNames="
                r0.append(r1)
                java.lang.Object r1 = r2.e
                r0.append(r1)
                java.lang.String r1 = ", storageClassNames="
                r0.append(r1)
                java.lang.Object r1 = r2.f
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: a.a5$e */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f389a;
        public final java.lang.String b;
        public final java.lang.String c;

        public e(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.f389a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof a.C0043a5.e
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                a.a5$e r5 = (a.C0043a5.e) r5
                java.lang.String r1 = r5.f389a
                java.lang.String r3 = r4.f389a
                boolean r1 = a.C0193i9.a(r3, r1)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.b
                java.lang.String r3 = r5.b
                boolean r1 = a.C0193i9.a(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                java.lang.String r1 = r4.c
                java.lang.String r5 = r5.c
                boolean r5 = a.C0193i9.a(r1, r5)
                if (r5 != 0) goto L2d
                return r2
            L2d:
                return r0
        }

        public final int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.f389a
                int r0 = r0.hashCode()
                r1 = 31
                int r0 = r0 * r1
                java.lang.String r2 = r3.b
                int r0 = a.C0487z.b(r2, r0, r1)
                java.lang.String r1 = r3.c
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public final java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "MsgStorageInfo(storageClass="
                r0.<init>(r1)
                java.lang.String r1 = r3.f389a
                r0.append(r1)
                java.lang.String r1 = ", insertMethod="
                r0.append(r1)
                java.lang.String r1 = r3.b
                r0.append(r1)
                java.lang.String r1 = ", msgInfoClass="
                r0.append(r1)
                java.lang.String r1 = r3.c
                java.lang.String r2 = ")"
                java.lang.String r0 = a.C0487z.h(r0, r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: a.a5$f */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f390a;
        public final java.lang.String b;

        public f(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.f390a = r1
                r0.b = r2
                return
        }

        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof a.C0043a5.f
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                a.a5$f r5 = (a.C0043a5.f) r5
                java.lang.String r1 = r5.f390a
                java.lang.String r3 = r4.f390a
                boolean r1 = a.C0193i9.a(r3, r1)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.b
                java.lang.String r5 = r5.b
                boolean r5 = a.C0193i9.a(r1, r5)
                if (r5 != 0) goto L22
                return r2
            L22:
                return r0
        }

        public final int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.f390a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r2.b
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "PopupBuildSpec(popupClassName="
                r0.<init>(r1)
                java.lang.String r1 = r2.f390a
                r0.append(r1)
                java.lang.String r1 = ", methodName="
                r0.append(r1)
                java.lang.String r1 = r2.b
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: a.a5$g */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f391a;
        public final java.lang.String b;
        public final java.lang.String c;

        public g(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.f391a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof a.C0043a5.g
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                a.a5$g r5 = (a.C0043a5.g) r5
                java.lang.String r1 = r5.f391a
                java.lang.String r3 = r4.f391a
                boolean r1 = a.C0193i9.a(r3, r1)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.b
                java.lang.String r3 = r5.b
                boolean r1 = a.C0193i9.a(r1, r3)
                if (r1 != 0) goto L22
                return r2
            L22:
                java.lang.String r1 = r4.c
                java.lang.String r5 = r5.c
                boolean r5 = a.C0193i9.a(r1, r5)
                if (r5 != 0) goto L2d
                return r2
            L2d:
                return r0
        }

        public final int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.f391a
                int r0 = r0.hashCode()
                r1 = 31
                int r0 = r0 * r1
                java.lang.String r2 = r3.b
                int r0 = a.C0487z.b(r2, r0, r1)
                java.lang.String r1 = r3.c
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public final java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "PopupCreateSpec(popupClassName="
                r0.<init>(r1)
                java.lang.String r1 = r3.f391a
                r0.append(r1)
                java.lang.String r1 = ", callbackClassName="
                r0.append(r1)
                java.lang.String r1 = r3.b
                r0.append(r1)
                java.lang.String r1 = ", methodName="
                r0.append(r1)
                java.lang.String r1 = r3.c
                java.lang.String r2 = ")"
                java.lang.String r0 = a.C0487z.h(r0, r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: a.a5$h */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.Object f392a;
        public final java.lang.Object b;
        public final java.lang.Object c;
        public final java.lang.Object d;
        public final java.lang.Object e;
        public final java.lang.Object f;
        public final java.lang.Object g;
        public final java.lang.Object h;

        public h(java.util.List<java.lang.String> r1, java.util.List<java.lang.String> r2, java.util.List<java.lang.String> r3, java.util.List<a.C0043a5.g> r4, java.util.List<a.C0043a5.f> r5, java.util.List<java.lang.String> r6, java.util.List<java.lang.String> r7, java.util.List<java.lang.String> r8) {
                r0 = this;
                r0.<init>()
                r0.f392a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.e = r5
                r0.f = r6
                r0.g = r7
                r0.h = r8
                return
        }

        public final boolean equals(java.lang.Object r3) {
                r2 = this;
                if (r2 != r3) goto L3
                goto L63
            L3:
                boolean r0 = r3 instanceof a.C0043a5.h
                if (r0 != 0) goto L8
                goto L61
            L8:
                a.a5$h r3 = (a.C0043a5.h) r3
                java.lang.Object r0 = r3.f392a
                java.lang.Object r1 = r2.f392a
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L15
                goto L61
            L15:
                java.lang.Object r0 = r2.b
                java.lang.Object r1 = r3.b
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L20
                goto L61
            L20:
                java.lang.Object r0 = r2.c
                java.lang.Object r1 = r3.c
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L2b
                goto L61
            L2b:
                java.lang.Object r0 = r2.d
                java.lang.Object r1 = r3.d
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L36
                goto L61
            L36:
                java.lang.Object r0 = r2.e
                java.lang.Object r1 = r3.e
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L41
                goto L61
            L41:
                java.lang.Object r0 = r2.f
                java.lang.Object r1 = r3.f
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L4c
                goto L61
            L4c:
                java.lang.Object r0 = r2.g
                java.lang.Object r1 = r3.g
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L57
                goto L61
            L57:
                java.lang.Object r0 = r2.h
                java.lang.Object r3 = r3.h
                boolean r3 = r0.equals(r3)
                if (r3 != 0) goto L63
            L61:
                r3 = 0
                return r3
            L63:
                r3 = 1
                return r3
        }

        public final int hashCode() {
                r2 = this;
                java.lang.Object r0 = r2.f392a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.Object r1 = r2.b
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                java.lang.Object r0 = r2.c
                int r0 = r0.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.Object r1 = r2.d
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                java.lang.Object r0 = r2.e
                int r0 = r0.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.Object r1 = r2.f
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                int r1 = r1 * 31
                java.lang.Object r0 = r2.g
                int r0 = r0.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.Object r1 = r2.h
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "QuickAddMenuCache(conversationLongClickClassNames="
                r0.<init>(r1)
                java.lang.Object r1 = r2.f392a
                r0.append(r1)
                java.lang.String r1 = ", conversationMenuCallbackClassNames="
                r0.append(r1)
                java.lang.Object r1 = r2.b
                r0.append(r1)
                java.lang.String r1 = ", popupClassNames="
                r0.append(r1)
                java.lang.Object r1 = r2.c
                r0.append(r1)
                java.lang.String r1 = ", popupCreateSpecs="
                r0.append(r1)
                java.lang.Object r1 = r2.d
                r0.append(r1)
                java.lang.String r1 = ", popupBuildSpecs="
                r0.append(r1)
                java.lang.Object r1 = r2.e
                r0.append(r1)
                java.lang.String r1 = ", popupClickHandlerClassNames="
                r0.append(r1)
                java.lang.Object r1 = r2.f
                r0.append(r1)
                java.lang.String r1 = ", popupAdapterClassNames="
                r0.append(r1)
                java.lang.Object r1 = r2.g
                r0.append(r1)
                java.lang.String r1 = ", contactMenuCallbackClassNames="
                r0.append(r1)
                java.lang.Object r1 = r2.h
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: a.a5$i */
    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.Object f393a;

        public i(java.util.List<java.lang.String> r1) {
                r0 = this;
                r0.<init>()
                r0.f393a = r1
                return
        }

        public final boolean equals(java.lang.Object r2) {
                r1 = this;
                if (r1 != r2) goto L3
                goto L16
            L3:
                boolean r0 = r2 instanceof a.C0043a5.i
                if (r0 != 0) goto L8
                goto L14
            L8:
                a.a5$i r2 = (a.C0043a5.i) r2
                java.lang.Object r0 = r1.f393a
                java.lang.Object r2 = r2.f393a
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L16
            L14:
                r2 = 0
                return r2
            L16:
                r2 = 1
                return r2
        }

        public final int hashCode() {
                r1 = this;
                java.lang.Object r0 = r1.f393a
                int r0 = r0.hashCode()
                return r0
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "RecentForwardCache(activityClassNames="
                r0.<init>(r1)
                java.lang.Object r1 = r2.f393a
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: a.a5$j */
    public static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.Object f394a;

        public j(java.util.List<java.lang.String> r1) {
                r0 = this;
                r0.<init>()
                r0.f394a = r1
                return
        }

        public final boolean equals(java.lang.Object r2) {
                r1 = this;
                if (r1 != r2) goto L3
                goto L16
            L3:
                boolean r0 = r2 instanceof a.C0043a5.j
                if (r0 != 0) goto L8
                goto L14
            L8:
                a.a5$j r2 = (a.C0043a5.j) r2
                java.lang.Object r0 = r1.f394a
                java.lang.Object r2 = r2.f394a
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L16
            L14:
                r2 = 0
                return r2
            L16:
                r2 = 1
                return r2
        }

        public final int hashCode() {
                r1 = this;
                java.lang.Object r0 = r1.f394a
                int r0 = r0.hashCode()
                return r0
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "SearchCache(searchViewClassNames="
                r0.<init>(r1)
                java.lang.Object r1 = r2.f394a
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: renamed from: a.a5$k */
    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f395a;
        public final java.lang.String b;

        public k(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.f395a = r1
                r0.b = r2
                return
        }

        public final boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof a.C0043a5.k
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                a.a5$k r5 = (a.C0043a5.k) r5
                java.lang.String r1 = r5.f395a
                java.lang.String r3 = r4.f395a
                boolean r1 = a.C0193i9.a(r3, r1)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.lang.String r1 = r4.b
                java.lang.String r5 = r5.b
                boolean r5 = a.C0193i9.a(r1, r5)
                if (r5 != 0) goto L22
                return r2
            L22:
                return r0
        }

        public final int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.f395a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r2.b
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "VersionInfoClasses(versionFormatClass="
                r0.<init>(r1)
                java.lang.String r1 = r2.f395a
                r0.append(r1)
                java.lang.String r1 = ", baselineInfoClass="
                r0.append(r1)
                java.lang.String r1 = r2.b
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static a.C0043a5.b a() {
            java.lang.String r0 = "contact_mvvm_address_v2"
            org.json.JSONObject r0 = d(r0)
            if (r0 != 0) goto L11
            java.lang.String r0 = "contact_mvvm_address"
            org.json.JSONObject r0 = d(r0)
            if (r0 != 0) goto L11
            goto L29
        L11:
            java.lang.String r1 = "classNames"
            java.util.List r1 = g(r1, r0)     // Catch: java.lang.Exception -> L29
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> L29
            if (r2 == 0) goto L23
            java.lang.String r1 = "dataClassNames"
            java.util.List r1 = g(r1, r0)     // Catch: java.lang.Exception -> L29
        L23:
            a.a5$b r0 = new a.a5$b     // Catch: java.lang.Exception -> L29
            r0.<init>(r1)     // Catch: java.lang.Exception -> L29
            return r0
        L29:
            r0 = 0
            return r0
    }

    public static a.C0043a5.d b() {
            java.lang.String r0 = "conversation_mvvm_list_v3"
            org.json.JSONObject r0 = d(r0)
            if (r0 != 0) goto L11
            java.lang.String r0 = "conversation_mvvm_list_v2"
            org.json.JSONObject r0 = d(r0)
            if (r0 != 0) goto L11
            goto L45
        L11:
            a.a5$d r1 = new a.a5$d     // Catch: java.lang.Throwable -> L3b
            java.lang.String r2 = "adapterClassNames"
            java.util.List r2 = g(r2, r0)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "dataSourceClassNames"
            java.util.List r3 = g(r3, r0)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = "itemClassNames"
            java.util.List r4 = g(r4, r0)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r5 = "holderClassNames"
            java.util.List r5 = g(r5, r0)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r6 = "requestClassNames"
            java.util.List r6 = g(r6, r0)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r7 = "storageClassNames"
            java.util.List r7 = g(r7, r0)     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L3b
            return r1
        L3b:
            r0 = move-exception
            java.lang.String r1 = "DexKitCache: parse ConvMvvm failed"
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            a.C0453x1.e(r0)
        L45:
            r0 = 0
            return r0
    }

    public static java.util.List c() {
            java.lang.String r0 = "conv_storage_class_v1"
            org.json.JSONObject r0 = d(r0)
            if (r0 == 0) goto Lf
            java.lang.String r1 = "classNames"
            java.util.List r0 = g(r1, r0)
            return r0
        Lf:
            a.Y5 r0 = a.Y5.f351a
            return r0
    }

    public static org.json.JSONObject d(java.lang.String r1) {
            java.lang.Object r0 = a.C0043a5.f384a
            if (r0 == 0) goto L13
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto Ld
            goto L13
        Ld:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L13
            r0.<init>(r1)     // Catch: java.lang.Exception -> L13
            return r0
        L13:
            r1 = 0
            return r1
    }

    public static a.C0043a5.e e() {
            java.lang.String r0 = "msg_storage_v1"
            org.json.JSONObject r0 = d(r0)
            if (r0 != 0) goto L9
            goto L3f
        L9:
            java.lang.String r1 = "storageClass"
            java.lang.String r2 = ""
            java.lang.String r1 = r0.optString(r1, r2)
            java.lang.String r3 = "insertMethod"
            java.lang.String r3 = r0.optString(r3, r2)
            java.lang.String r4 = "msgInfoClass"
            java.lang.String r0 = r0.optString(r4, r2)
            a.C0193i9.b(r1)
            boolean r2 = a.Be.P(r1)
            if (r2 != 0) goto L3f
            a.C0193i9.b(r3)
            boolean r2 = a.Be.P(r3)
            if (r2 != 0) goto L3f
            a.C0193i9.b(r0)
            boolean r2 = a.Be.P(r0)
            if (r2 == 0) goto L39
            goto L3f
        L39:
            a.a5$e r2 = new a.a5$e
            r2.<init>(r1, r3, r0)
            return r2
        L3f:
            r0 = 0
            return r0
    }

    public static boolean f() {
            java.lang.String r0 = "quick_add_menu_v10"
            org.json.JSONObject r0 = d(r0)
            r1 = 0
            if (r0 != 0) goto La
            goto L5c
        La:
            a.a5$h r2 = new a.a5$h     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "conversationLongClickClassNames"
            java.util.List r3 = g(r3, r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = "conversationMenuCallbackClassNames"
            java.util.List r4 = g(r4, r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r5 = "popupClassNames"
            java.util.List r5 = g(r5, r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = "popupCreateSpecs"
            org.json.JSONArray r6 = r0.optJSONArray(r6)     // Catch: java.lang.Throwable -> L2d
            a.Y5 r7 = a.Y5.f351a
            if (r6 == 0) goto L2f
            java.util.ArrayList r6 = k(r6)     // Catch: java.lang.Throwable -> L2d
            goto L30
        L2d:
            r0 = move-exception
            goto L53
        L2f:
            r6 = r7
        L30:
            java.lang.String r8 = "popupBuildSpecs"
            org.json.JSONArray r8 = r0.optJSONArray(r8)     // Catch: java.lang.Throwable -> L2d
            if (r8 == 0) goto L3c
            java.util.ArrayList r7 = j(r8)     // Catch: java.lang.Throwable -> L2d
        L3c:
            java.lang.String r8 = "popupClickHandlerClassNames"
            java.util.List r8 = g(r8, r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r9 = "popupAdapterClassNames"
            java.util.List r9 = g(r9, r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r10 = "contactMenuCallbackClassNames"
            java.util.List r10 = g(r10, r0)     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L2d
            r1 = r2
            goto L5c
        L53:
            java.lang.String r2 = "DexKitCache: parse QuickAddMenu failed"
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            a.C0453x1.e(r0)
        L5c:
            if (r1 == 0) goto L66
            a.a5$d r0 = b()
            if (r0 == 0) goto L66
            r0 = 1
            goto L67
        L66:
            r0 = 0
        L67:
            return r0
    }

    public static java.util.List g(java.lang.String r3, org.json.JSONObject r4) {
            org.json.JSONArray r3 = r4.optJSONArray(r3)
            if (r3 != 0) goto L9
            a.Y5 r3 = a.Y5.f351a
            return r3
        L9:
            r4 = 0
            int r0 = r3.length()
            a.f9 r4 = a.Oc.D(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = a.C0312p3.g0(r4, r1)
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L21:
            r1 = r4
            a.e9 r1 = (a.C0121e9) r1
            boolean r1 = r1.c
            if (r1 == 0) goto L39
            r1 = r4
            a.c9 r1 = (a.AbstractC0085c9) r1
            int r1 = r1.a()
            java.lang.String r2 = ""
            java.lang.String r1 = r3.optString(r1, r2)
            r0.add(r1)
            goto L21
        L39:
            return r0
    }

    public static void h(java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = "ruleId"
            a.C0193i9.e(r4, r0)
            java.lang.String r0 = "className"
            a.C0193i9.e(r5, r0)
            android.content.Context r0 = a.C0435w1.p     // Catch: java.lang.Exception -> L41
            r1 = 0
            if (r0 == 0) goto L17
            java.lang.String r2 = "dexkit_scan_cache"
            r3 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r3)     // Catch: java.lang.Exception -> L41
            goto L18
        L17:
            r0 = r1
        L18:
            java.lang.String r2 = "rule_class_"
            if (r0 == 0) goto L2f
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L2f
            java.lang.String r3 = r2.concat(r4)     // Catch: java.lang.Exception -> L41
            android.content.SharedPreferences$Editor r0 = r0.putString(r3, r5)     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L2f
            r0.apply()     // Catch: java.lang.Exception -> L41
        L2f:
            java.lang.Object r0 = a.C0043a5.f384a     // Catch: java.lang.Exception -> L41
            if (r0 == 0) goto L3e
            java.util.LinkedHashMap r1 = a.C0067ba.I(r0)     // Catch: java.lang.Exception -> L41
            java.lang.String r0 = r2.concat(r4)     // Catch: java.lang.Exception -> L41
            r1.put(r0, r5)     // Catch: java.lang.Exception -> L41
        L3e:
            a.C0043a5.f384a = r1     // Catch: java.lang.Exception -> L41
            return
        L41:
            java.lang.String r5 = "DexKitCache: putClassResult("
            java.lang.String r0 = ") failed"
            java.lang.String r4 = a.C0487z.g(r5, r4, r0)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            a.C0453x1.e(r4)
            return
    }

    public static void i(a.C0234kf r4) {
            android.content.Context r0 = a.C0435w1.p     // Catch: java.lang.Throwable -> L44
            r1 = 0
            if (r0 == 0) goto Ld
            java.lang.String r2 = "dexkit_scan_cache"
            r3 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r3)     // Catch: java.lang.Throwable -> L44
            goto Le
        Ld:
            r0 = r1
        Le:
            java.lang.String r2 = "tinker_symbols_v1"
            if (r0 == 0) goto L29
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L29
            org.json.JSONObject r3 = r4.b()     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L44
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r3)     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L29
            r0.apply()     // Catch: java.lang.Throwable -> L44
        L29:
            java.lang.Object r0 = a.C0043a5.f384a     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L41
            java.util.LinkedHashMap r1 = a.C0067ba.I(r0)     // Catch: java.lang.Throwable -> L44
            org.json.JSONObject r4 = r4.b()     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = "toString(...)"
            a.C0193i9.d(r4, r0)     // Catch: java.lang.Throwable -> L44
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L44
        L41:
            a.C0043a5.f384a = r1     // Catch: java.lang.Throwable -> L44
            return
        L44:
            r4 = move-exception
            java.lang.String r0 = "DexKitCache: putTinkerSymbols failed"
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r4}
            a.C0453x1.e(r4)
            return
    }

    public static java.util.ArrayList j(org.json.JSONArray r8) {
            int r0 = r8.length()
            r1 = 0
            a.f9 r0 = a.Oc.D(r1, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L12:
            r2 = r0
            a.e9 r2 = (a.C0121e9) r2
            boolean r2 = r2.c
            if (r2 == 0) goto L4a
            r2 = r0
            a.c9 r2 = (a.AbstractC0085c9) r2
            int r2 = r2.a()
            org.json.JSONObject r2 = r8.optJSONObject(r2)
            if (r2 != 0) goto L28
            r2 = 0
            goto L44
        L28:
            a.a5$f r3 = new a.a5$f
            java.lang.String r4 = "popupClassName"
            java.lang.String r5 = ""
            java.lang.String r4 = r2.optString(r4, r5)
            java.lang.String r6 = "optString(...)"
            a.C0193i9.d(r4, r6)
            java.lang.String r7 = "methodName"
            java.lang.String r2 = r2.optString(r7, r5)
            a.C0193i9.d(r2, r6)
            r3.<init>(r4, r2)
            r2 = r3
        L44:
            if (r2 == 0) goto L12
            r1.add(r2)
            goto L12
        L4a:
            return r1
    }

    public static java.util.ArrayList k(org.json.JSONArray r9) {
            int r0 = r9.length()
            r1 = 0
            a.f9 r0 = a.Oc.D(r1, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L12:
            r2 = r0
            a.e9 r2 = (a.C0121e9) r2
            boolean r2 = r2.c
            if (r2 == 0) goto L53
            r2 = r0
            a.c9 r2 = (a.AbstractC0085c9) r2
            int r2 = r2.a()
            org.json.JSONObject r2 = r9.optJSONObject(r2)
            if (r2 != 0) goto L28
            r2 = 0
            goto L4d
        L28:
            a.a5$g r3 = new a.a5$g
            java.lang.String r4 = "popupClassName"
            java.lang.String r5 = ""
            java.lang.String r4 = r2.optString(r4, r5)
            java.lang.String r6 = "optString(...)"
            a.C0193i9.d(r4, r6)
            java.lang.String r7 = "callbackClassName"
            java.lang.String r7 = r2.optString(r7, r5)
            a.C0193i9.d(r7, r6)
            java.lang.String r8 = "methodName"
            java.lang.String r2 = r2.optString(r8, r5)
            a.C0193i9.d(r2, r6)
            r3.<init>(r4, r7, r2)
            r2 = r3
        L4d:
            if (r2 == 0) goto L12
            r1.add(r2)
            goto L12
        L53:
            return r1
    }
}
