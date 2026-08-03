package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3843 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f12142 = "http://www.slf4j.org/codes.html#null_MDCA";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f12143 = "http://www.slf4j.org/codes.html#no_static_mdc_binder";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static org.slf4j.spi.MDCAdapter f12144;

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۤۡ$ۥ, reason: contains not printable characters */
    public static /* synthetic */ class C3844 {
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۤۡ$ۥ۟, reason: contains not printable characters */
    public static class C3845 implements java.io.Closeable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final java.lang.String f12145;

        public C3845(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.f12145 = r1
                return
        }

        public /* synthetic */ C3845(java.lang.String r1, Yue.C3843.C3844 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r1 = this;
                java.lang.String r0 = r1.f12145
                Yue.C3843.m15394(r0)
                return
        }
    }

    static {
            org.slf4j.spi.MDCAdapter r0 = m15387()     // Catch: java.lang.Exception -> L7 java.lang.NoClassDefFoundError -> L9
            Yue.C3843.f12144 = r0     // Catch: java.lang.Exception -> L7 java.lang.NoClassDefFoundError -> L9
            goto L35
        L7:
            r0 = move-exception
            goto Lb
        L9:
            r0 = move-exception
            goto L11
        Lb:
            java.lang.String r1 = "MDC binding unsuccessful."
            Yue.C6653.m25549(r1, r0)
            goto L35
        L11:
            Yue.ۥۡۢ۠ r1 = new Yue.ۥۡۢ۠
            r1.<init>()
            Yue.C3843.f12144 = r1
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L36
            java.lang.String r2 = "StaticMDCBinder"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L36
            java.lang.String r0 = "Failed to load class \"org.slf4j.impl.StaticMDCBinder\"."
            Yue.C6653.m25548(r0)
            java.lang.String r0 = "Defaulting to no-operation MDCAdapter implementation."
            Yue.C6653.m25548(r0)
            java.lang.String r0 = "See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details."
            Yue.C6653.m25548(r0)
        L35:
            return
        L36:
            throw r0
    }

    public C3843() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static org.slf4j.spi.MDCAdapter m15387() throws java.lang.NoClassDefFoundError {
            org.slf4j.impl.StaticMDCBinder r0 = org.slf4j.impl.StaticMDCBinder.getSingleton()     // Catch: java.lang.NoSuchMethodError -> L9
            org.slf4j.spi.MDCAdapter r0 = r0.getMDCA()     // Catch: java.lang.NoSuchMethodError -> L9
            return r0
        L9:
            org.slf4j.impl.StaticMDCBinder r0 = org.slf4j.impl.StaticMDCBinder.SINGLETON
            org.slf4j.spi.MDCAdapter r0 = r0.getMDCA()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m15388() {
            org.slf4j.spi.MDCAdapter r0 = Yue.C3843.f12144
            if (r0 == 0) goto L8
            r0.clear()
            return
        L8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.lang.String m15389(java.lang.String r1) throws java.lang.IllegalArgumentException {
            if (r1 == 0) goto L13
            org.slf4j.spi.MDCAdapter r0 = Yue.C3843.f12144
            if (r0 == 0) goto Lb
            java.lang.String r1 = r0.get(r1)
            return r1
        Lb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA"
            r1.<init>(r0)
            throw r1
        L13:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "key parameter cannot be null"
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.util.Map<java.lang.String, java.lang.String> m15390() {
            org.slf4j.spi.MDCAdapter r0 = Yue.C3843.f12144
            if (r0 == 0) goto L9
            java.util.Map r0 = r0.mo4585()
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static org.slf4j.spi.MDCAdapter m15391() {
            org.slf4j.spi.MDCAdapter r0 = Yue.C3843.f12144
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m15392(java.lang.String r1, java.lang.String r2) throws java.lang.IllegalArgumentException {
            if (r1 == 0) goto L12
            org.slf4j.spi.MDCAdapter r0 = Yue.C3843.f12144
            if (r0 == 0) goto La
            r0.put(r1, r2)
            return
        La:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA"
            r1.<init>(r2)
            throw r1
        L12:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "key parameter cannot be null"
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static Yue.C3843.C3845 m15393(java.lang.String r1, java.lang.String r2) throws java.lang.IllegalArgumentException {
            m15392(r1, r2)
            Yue.ۥ۠ۨۤۡ$ۥ۟ r2 = new Yue.ۥ۠ۨۤۡ$ۥ۟
            r0 = 0
            r2.<init>(r1, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m15394(java.lang.String r1) throws java.lang.IllegalArgumentException {
            if (r1 == 0) goto L12
            org.slf4j.spi.MDCAdapter r0 = Yue.C3843.f12144
            if (r0 == 0) goto La
            r0.remove(r1)
            return
        La:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA"
            r1.<init>(r0)
            throw r1
        L12:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "key parameter cannot be null"
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m15395(java.util.Map<java.lang.String, java.lang.String> r1) {
            org.slf4j.spi.MDCAdapter r0 = Yue.C3843.f12144
            if (r0 == 0) goto L8
            r0.mo4584(r1)
            return
        L8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA"
            r1.<init>(r0)
            throw r1
    }
}
