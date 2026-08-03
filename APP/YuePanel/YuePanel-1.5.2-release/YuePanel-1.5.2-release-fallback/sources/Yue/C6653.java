package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6653 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static Yue.C6653.C6655 f23202;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static boolean f23203;

    /* JADX INFO: renamed from: Yue.ۥۣۢۥ$ۥ, reason: contains not printable characters */
    public static /* synthetic */ class C6654 {
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۥ$ۥ۟, reason: contains not printable characters */
    public static final class C6655 extends java.lang.SecurityManager {
        public C6655() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C6655(Yue.C6653.C6654 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.SecurityManager
        public java.lang.Class<?>[] getClassContext() {
                r1 = this;
                java.lang.Class[] r0 = super.getClassContext()
                return r0
        }
    }

    static {
            return
    }

    public C6653() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.Class<?> m25546() {
            Yue.ۥۣۢۥ$ۥ۟ r0 = m25547()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.Class[] r0 = r0.getClassContext()
            java.lang.Class<Yue.ۥۣۢۥ> r1 = Yue.C6653.class
            java.lang.String r1 = r1.getName()
            r2 = 0
        L13:
            int r3 = r0.length
            if (r2 >= r3) goto L26
            r3 = r0[r2]
            java.lang.String r3 = r3.getName()
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L23
            goto L26
        L23:
            int r2 = r2 + 1
            goto L13
        L26:
            int r1 = r0.length
            if (r2 >= r1) goto L31
            int r2 = r2 + 2
            int r1 = r0.length
            if (r2 >= r1) goto L31
            r0 = r0[r2]
            return r0
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.C6653.C6655 m25547() {
            Yue.ۥۣۢۥ$ۥ۟ r0 = Yue.C6653.f23202
            if (r0 == 0) goto L5
            return r0
        L5:
            boolean r0 = Yue.C6653.f23203
            if (r0 == 0) goto Lb
            r0 = 0
            return r0
        Lb:
            Yue.ۥۣۢۥ$ۥ۟ r0 = m25550()
            Yue.C6653.f23202 = r0
            r1 = 1
            Yue.C6653.f23203 = r1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m25548(java.lang.String r3) {
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SLF4J: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.println(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m25549(java.lang.String r1, java.lang.Throwable r2) {
            java.io.PrintStream r0 = java.lang.System.err
            r0.println(r1)
            java.lang.String r1 = "Reported exception:"
            r0.println(r1)
            r2.printStackTrace()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Yue.C6653.C6655 m25550() {
            r0 = 0
            Yue.ۥۣۢۥ$ۥ۟ r1 = new Yue.ۥۣۢۥ$ۥ۟     // Catch: java.lang.SecurityException -> L7
            r1.<init>(r0)     // Catch: java.lang.SecurityException -> L7
            return r1
        L7:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static boolean m25551(java.lang.String r1) {
            java.lang.String r1 = m25552(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r0 = "true"
            boolean r1 = r1.equalsIgnoreCase(r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static java.lang.String m25552(java.lang.String r1) {
            if (r1 == 0) goto L9
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.SecurityException -> L7
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
        L9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "null input"
            r1.<init>(r0)
            throw r1
    }
}
