package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@android.annotation.SuppressLint({"all"})
@org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
public final class C0300 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C0300 f634 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final boolean f635 = false;

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۢۢ$ۥ, reason: contains not printable characters */
    public static final class C0301 implements java.lang.instrument.ClassFileTransformer {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public static final Yue.C0300.C0301 f636 = null;

        static {
                Yue.ۥ۟۠ۢۢ$ۥ r0 = new Yue.ۥ۟۠ۢۢ$ۥ
                r0.<init>()
                Yue.C0300.C0301.f636 = r0
                return
        }

        public C0301() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public byte[] m1328(@Yue.InterfaceC4418 java.lang.ClassLoader r1, @Yue.InterfaceC4418 java.lang.String r2, @Yue.InterfaceC4543 java.lang.Class<?> r3, @Yue.InterfaceC4418 java.security.ProtectionDomain r4, @Yue.InterfaceC4543 byte[] r5) {
                r0 = this;
                java.lang.String r3 = "kotlin/coroutines/jvm/internal/DebugProbesKt"
                boolean r2 = Yue.C3329.m13897(r2, r3)
                if (r2 != 0) goto La
                r1 = 0
                return r1
            La:
                Yue.ۥ۟۠ۢ۠ r2 = Yue.C0298.f632
                r3 = 1
                r2.m1322(r3)
                java.lang.String r2 = "DebugProbesKt.bin"
                java.io.InputStream r1 = r1.getResourceAsStream(r2)
                byte[] r1 = Yue.C0877.m5028(r1)
                return r1
        }
    }

    static {
            Yue.ۥ۟۠ۢۢ r0 = new Yue.ۥ۟۠ۢۢ
            r0.<init>()
            Yue.C0300.f634 = r0
            r0 = 0
            Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "kotlinx.coroutines.debug.enable.creation.stack.trace"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            r1 = move-exception
            goto L23
        L1d:
            r1 = r0
        L1e:
            java.lang.Object r1 = Yue.C5388.m20377(r1)     // Catch: java.lang.Throwable -> L1b
            goto L2d
        L23:
            Yue.ۥۡۦۧۤ$ۥ r2 = Yue.C5388.f20029
            java.lang.Object r1 = Yue.C5391.m20390(r1)
            java.lang.Object r1 = Yue.C5388.m20377(r1)
        L2d:
            boolean r2 = Yue.C5388.m20384(r1)
            if (r2 == 0) goto L34
            goto L35
        L34:
            r0 = r1
        L35:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L3e
            boolean r0 = r0.booleanValue()
            goto L44
        L3e:
            Yue.ۥ۟ۨۤ۟ r0 = Yue.C1746.f5439
            boolean r0 = r0.m8314()
        L44:
            Yue.C0300.f635 = r0
            return
    }

    public C0300() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m1324(sun.misc.Signal r0) {
            m1325(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m1325(sun.misc.Signal r1) {
            Yue.ۥ۟ۨۤ۟ r1 = Yue.C1746.f5439
            boolean r0 = r1.m8319()
            if (r0 == 0) goto Le
            java.io.PrintStream r0 = java.lang.System.out
            r1.m8300(r0)
            goto L15
        Le:
            java.lang.String r1 = "Cannot perform coroutines dump, debug probes are disabled"
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r1)
        L15:
            return
    }

    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m1326(@Yue.InterfaceC4543 java.lang.String r1, @Yue.InterfaceC4418 java.lang.instrument.Instrumentation r2) {
            Yue.ۥ۟۠ۢ۠ r1 = Yue.C0298.f632
            r0 = 1
            r1.m1322(r0)
            Yue.ۥ۟۠ۢۢ$ۥ r1 = Yue.C0300.C0301.f636
            java.lang.instrument.ClassFileTransformer r1 = (java.lang.instrument.ClassFileTransformer) r1
            r2.addTransformer(r1)
            Yue.ۥ۟ۨۤ۟ r1 = Yue.C1746.f5439
            boolean r2 = Yue.C0300.f635
            r1.m8330(r2)
            r1.m8317()
            Yue.ۥ۟۠ۢۢ r1 = Yue.C0300.f634
            r1.m1327()
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m1327() {
            r2 = this;
            sun.misc.Signal r0 = new sun.misc.Signal     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "TRAP"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lf
            Yue.ۥ۟۠ۢۡ r1 = new Yue.ۥ۟۠ۢۡ     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            sun.misc.Signal.handle(r0, r1)     // Catch: java.lang.Throwable -> Lf
        Lf:
            return
    }
}
