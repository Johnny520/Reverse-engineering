package com.yuexin.panel.utils;

/* JADX INFO: loaded from: classes2.dex */
public final class CrashMonitor {
    private static final java.util.regex.Pattern APK_PATH_PATTERN = null;
    private static final java.lang.String CAUSE_HOST = null;
    private static final java.lang.String CAUSE_MODULE = null;
    private static final java.lang.String CAUSE_OTHER_MODULE = null;
    private static final java.lang.String CAUSE_UNKNOWN = null;
    private static final java.lang.Object INSTALL_LOCK = null;
    private static final java.lang.String MODULE_PACKAGE_NAME = null;
    private static final java.util.concurrent.atomic.AtomicBoolean WRITING = null;
    private static volatile boolean installed;
    private static volatile java.lang.Thread.UncaughtExceptionHandler previousHandler;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq0;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq1;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq10;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq100;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq101;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq102;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq103;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq104;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq105;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq106;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq107;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq108;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq109;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq11;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq110;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq111;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq112;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq113;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq114;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq115;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq116;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq117;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq118;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq119;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq12;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq120;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq121;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq122;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq123;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq124;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq125;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq126;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq127;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq128;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq129;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq13;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq130;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq131;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq132;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq133;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq134;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq135;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq136;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq137;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq138;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq139;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq14;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq140;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq141;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq142;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq143;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq144;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq145;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq146;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq147;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq148;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq149;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq15;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq150;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq151;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq152;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq16;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq17;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq18;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq19;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq2;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq20;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq21;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq22;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq23;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq24;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq25;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq26;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq27;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq28;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq29;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq3;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq30;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq31;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq32;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq33;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq34;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq35;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq36;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq37;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq38;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq39;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq4;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq40;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq41;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq42;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq43;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq44;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq45;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq46;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq47;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq48;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq49;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq5;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq50;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq51;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq52;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq53;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq54;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq55;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq56;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq57;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq58;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq59;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq6;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq60;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq61;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq62;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq63;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq64;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq65;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq66;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq67;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq68;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq69;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq7;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq70;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq71;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq72;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq73;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq74;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq75;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq76;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq77;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq78;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq79;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq8;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq80;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq81;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq82;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq83;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq84;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq85;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq86;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq87;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq88;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq89;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq9;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq90;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq91;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq92;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq93;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq94;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq95;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq96;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq97;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq98;
    private static volatile /* synthetic */ java.lang.String yue_xin_qwq99;

    /* JADX INFO: renamed from: com.yuexin.panel.utils.CrashMonitor$ۥ, reason: contains not printable characters */
    public class C7887 implements java.lang.Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ java.io.File f30639;

        static {
                r0 = 704(0x2c0, float:9.87E-43)
                com.nmmedit.protect.NativeUtil.classesInit0(r0)
                return
        }

        public C7887(java.io.File r1) {
                r0 = this;
                r0.f30639 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public native void uncaughtException(java.lang.Thread r1, java.lang.Throwable r2);
    }

    /* JADX INFO: renamed from: com.yuexin.panel.utils.CrashMonitor$ۥ۟, reason: contains not printable characters */
    public static final class C7888 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f30640;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f30641;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f30642;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f30643;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f30644;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.lang.String f30645;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.lang.String f30646;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final java.lang.String f30647;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final java.lang.String f30648;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final java.lang.String f30649;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final java.lang.String f30650;

        static {
                r0 = 252(0xfc, float:3.53E-43)
                com.nmmedit.protect.NativeUtil.classesInit0(r0)
                return
        }

        public C7888(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
                r0 = this;
                r0.<init>()
                java.lang.String r1 = com.yuexin.panel.utils.CrashMonitor.access$300(r1)
                r0.f30644 = r1
                java.lang.String r1 = com.yuexin.panel.utils.CrashMonitor.access$300(r2)
                r0.f30645 = r1
                java.lang.String r1 = com.yuexin.panel.utils.CrashMonitor.access$300(r3)
                r0.f30646 = r1
                java.lang.String r1 = com.yuexin.panel.utils.CrashMonitor.access$300(r4)
                r0.f30647 = r1
                java.lang.String r1 = com.yuexin.panel.utils.CrashMonitor.access$300(r5)
                r0.f30648 = r1
                java.lang.String r1 = com.yuexin.panel.utils.CrashMonitor.access$300(r6)
                r0.f30649 = r1
                java.lang.String r1 = com.yuexin.panel.utils.CrashMonitor.access$300(r7)
                r0.f30650 = r1
                return
        }

        private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static native com.yuexin.panel.utils.CrashMonitor.C7888 m30702(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.StackTraceElement r3, java.lang.String r4, java.lang.String r5);

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static native com.yuexin.panel.utils.CrashMonitor.C7888 m30703(java.lang.String r0);
    }

    /* JADX INFO: renamed from: com.yuexin.panel.utils.CrashMonitor$ۥ۟۟, reason: contains not printable characters */
    public static final class C7889 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f30651;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.lang.String f30652;

        public C7889(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                java.lang.String r1 = com.yuexin.panel.utils.CrashMonitor.access$300(r1)
                r0.f30651 = r1
                java.lang.String r1 = com.yuexin.panel.utils.CrashMonitor.access$300(r2)
                r0.f30652 = r1
                return
        }
    }

    /* JADX INFO: renamed from: com.yuexin.panel.utils.CrashMonitor$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C7890 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f30653;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.lang.String f30654;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final long f30655;

        public C7890(java.lang.String r1, java.lang.String r2, long r3) {
                r0 = this;
                r0.<init>()
                java.lang.String r1 = com.yuexin.panel.utils.CrashMonitor.access$300(r1)
                r0.f30653 = r1
                java.lang.String r1 = com.yuexin.panel.utils.CrashMonitor.access$300(r2)
                r0.f30654 = r1
                r0.f30655 = r3
                return
        }
    }

    static {
            r0 = 441(0x1b9, float:6.18E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            r0 = 0
            java.lang.String r1 = yue_xin_awa(r0)
            com.yuexin.panel.utils.CrashMonitor.MODULE_PACKAGE_NAME = r1
            r1 = 1
            java.lang.String r1 = yue_xin_awa(r1)
            com.yuexin.panel.utils.CrashMonitor.CAUSE_HOST = r1
            r1 = 2
            java.lang.String r1 = yue_xin_awa(r1)
            com.yuexin.panel.utils.CrashMonitor.CAUSE_MODULE = r1
            r1 = 3
            java.lang.String r1 = yue_xin_awa(r1)
            com.yuexin.panel.utils.CrashMonitor.CAUSE_OTHER_MODULE = r1
            r1 = 4
            java.lang.String r1 = yue_xin_awa(r1)
            com.yuexin.panel.utils.CrashMonitor.CAUSE_UNKNOWN = r1
            r1 = 152(0x98, float:2.13E-43)
            java.lang.String r1 = yue_xin_awa(r1)
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            com.yuexin.panel.utils.CrashMonitor.APK_PATH_PATTERN = r1
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            com.yuexin.panel.utils.CrashMonitor.INSTALL_LOCK = r1
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>(r0)
            com.yuexin.panel.utils.CrashMonitor.WRITING = r1
            return
    }

    private CrashMonitor() {
            r0 = this;
            r0.<init>()
            return
    }

    public static native /* synthetic */ void access$000(java.io.File r0, java.lang.Thread r1, java.lang.Throwable r2);

    public static native /* synthetic */ java.lang.Thread.UncaughtExceptionHandler access$100();

    public static native /* synthetic */ void access$200();

    public static native /* synthetic */ java.lang.String access$300(java.lang.String r0);

    private static native com.yuexin.panel.utils.CrashMonitor.C7888 analyzeCrashCause(com.yuexin.panel.utils.CrashMonitor.C7890 r0, java.lang.Thread r1, java.lang.Throwable r2);

    private static native boolean belongsToPackage(java.lang.String r0, java.lang.String r1);

    private static native com.yuexin.panel.utils.CrashMonitor.C7890 collectHostInfo();

    private static native void copyProcFile(java.lang.String r0, java.io.PrintWriter r1);

    private static native java.io.File createSessionDirectory(java.io.File r0, java.lang.String r1);

    private static native java.lang.String describeLoader(java.lang.ClassLoader r0);

    private static native com.yuexin.panel.utils.CrashMonitor.C7889 detectFramework();

    private static native java.lang.Class<?> findClass(java.lang.String r0);

    private static native java.lang.String findLoadedXposedModulePackage(java.lang.String r0, java.lang.String r1);

    private static native java.lang.String findXposedModulePackage(java.lang.String r0, java.lang.String r1);

    private static native java.lang.String findXposedModulePackageFromLoader(java.lang.String r0, java.lang.String r1);

    private static native android.content.Context getContextSafely();

    private static native java.io.File getCrashJsonFile();

    private static native java.io.File getCrashRoot();

    private static native java.lang.String getThrowableStack(java.lang.Throwable r0);

    private static native java.lang.String getXposedApiVersion(java.lang.Class<?> r0);

    public static native boolean hasPreviousCrash();

    public static native void install();

    private static native boolean isFrameworkFrame(java.lang.String r0);

    private static native boolean isHostLoader(java.lang.String r0);

    private static native boolean isOwnModuleLoader(java.lang.String r0);

    private static native boolean isXposedModule(android.content.pm.ApplicationInfo r0);

    private static native void killAfterCrash();

    private static native boolean matchesXposedEntryNamespace(java.lang.String r0, java.lang.String r1);

    private static native java.lang.String readProcessPackageName();

    private static native java.lang.Class<?> resolveFrameClass(java.lang.String r0, java.lang.Thread r1, java.lang.Throwable r2);

    private static native java.lang.String safe(java.lang.String r0);

    private static native java.lang.String sanitize(java.lang.String r0);

    private static native void writeCrashIndex(java.io.File r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.Throwable r6, com.yuexin.panel.utils.CrashMonitor.C7890 r7, com.yuexin.panel.utils.CrashMonitor.C7889 r8, com.yuexin.panel.utils.CrashMonitor.C7888 r9);

    private static native void writeJavaCrash(java.io.File r0, java.lang.Thread r1, java.lang.Throwable r2);

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);
}
