package a;

/* JADX INFO: renamed from: a.wd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0447wd<T> implements java.io.Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f752a;

    /* JADX INFO: renamed from: a.wd$a */
    public static final class a implements java.io.Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.Throwable f753a;

        public a(java.lang.Throwable r2) {
                r1 = this;
                java.lang.String r0 = "exception"
                a.C0193i9.e(r2, r0)
                r1.<init>()
                r1.f753a = r2
                return
        }

        public final boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof a.C0447wd.a
                if (r0 == 0) goto L12
                a.wd$a r2 = (a.C0447wd.a) r2
                java.lang.Throwable r2 = r2.f753a
                java.lang.Throwable r0 = r1.f753a
                boolean r2 = a.C0193i9.a(r0, r2)
                if (r2 == 0) goto L12
                r2 = 1
                return r2
            L12:
                r2 = 0
                return r2
        }

        public final int hashCode() {
                r1 = this;
                java.lang.Throwable r0 = r1.f753a
                int r0 = r0.hashCode()
                return r0
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Failure("
                r0.<init>(r1)
                java.lang.Throwable r1 = r2.f753a
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public /* synthetic */ C0447wd(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.f752a = r1
            return
    }

    public static final java.lang.Throwable a(java.lang.Object r1) {
            boolean r0 = r1 instanceof a.C0447wd.a
            if (r0 == 0) goto L9
            a.wd$a r1 = (a.C0447wd.a) r1
            java.lang.Throwable r1 = r1.f753a
            return r1
        L9:
            r1 = 0
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof a.C0447wd
            if (r0 != 0) goto L5
            goto L11
        L5:
            a.wd r2 = (a.C0447wd) r2
            java.lang.Object r2 = r2.f752a
            java.lang.Object r0 = r1.f752a
            boolean r2 = a.C0193i9.a(r0, r2)
            if (r2 != 0) goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.f752a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.Object r0 = r3.f752a
            boolean r1 = r0 instanceof a.C0447wd.a
            if (r1 == 0) goto Ld
            a.wd$a r0 = (a.C0447wd.a) r0
            java.lang.String r0 = r0.toString()
            return r0
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Success("
            r1.<init>(r2)
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
