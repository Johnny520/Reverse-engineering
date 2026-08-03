package com.yuexin.panel.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.android.p001dx.p004io.Opcodes;
import com.nmmedit.protect.NativeUtil;
import java.io.File;
import java.io.PrintWriter;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class CrashMonitor {
    private static final Pattern APK_PATH_PATTERN;
    private static final String CAUSE_HOST;
    private static final String CAUSE_MODULE;
    private static final String CAUSE_OTHER_MODULE;
    private static final String CAUSE_UNKNOWN;
    private static final Object INSTALL_LOCK;
    private static final String MODULE_PACKAGE_NAME;
    private static final AtomicBoolean WRITING;
    private static volatile boolean installed;
    private static volatile Thread.UncaughtExceptionHandler previousHandler;
    private static volatile /* synthetic */ String yue_xin_qwq0;
    private static volatile /* synthetic */ String yue_xin_qwq1;
    private static volatile /* synthetic */ String yue_xin_qwq10;
    private static volatile /* synthetic */ String yue_xin_qwq100;
    private static volatile /* synthetic */ String yue_xin_qwq101;
    private static volatile /* synthetic */ String yue_xin_qwq102;
    private static volatile /* synthetic */ String yue_xin_qwq103;
    private static volatile /* synthetic */ String yue_xin_qwq104;
    private static volatile /* synthetic */ String yue_xin_qwq105;
    private static volatile /* synthetic */ String yue_xin_qwq106;
    private static volatile /* synthetic */ String yue_xin_qwq107;
    private static volatile /* synthetic */ String yue_xin_qwq108;
    private static volatile /* synthetic */ String yue_xin_qwq109;
    private static volatile /* synthetic */ String yue_xin_qwq11;
    private static volatile /* synthetic */ String yue_xin_qwq110;
    private static volatile /* synthetic */ String yue_xin_qwq111;
    private static volatile /* synthetic */ String yue_xin_qwq112;
    private static volatile /* synthetic */ String yue_xin_qwq113;
    private static volatile /* synthetic */ String yue_xin_qwq114;
    private static volatile /* synthetic */ String yue_xin_qwq115;
    private static volatile /* synthetic */ String yue_xin_qwq116;
    private static volatile /* synthetic */ String yue_xin_qwq117;
    private static volatile /* synthetic */ String yue_xin_qwq118;
    private static volatile /* synthetic */ String yue_xin_qwq119;
    private static volatile /* synthetic */ String yue_xin_qwq12;
    private static volatile /* synthetic */ String yue_xin_qwq120;
    private static volatile /* synthetic */ String yue_xin_qwq121;
    private static volatile /* synthetic */ String yue_xin_qwq122;
    private static volatile /* synthetic */ String yue_xin_qwq123;
    private static volatile /* synthetic */ String yue_xin_qwq124;
    private static volatile /* synthetic */ String yue_xin_qwq125;
    private static volatile /* synthetic */ String yue_xin_qwq126;
    private static volatile /* synthetic */ String yue_xin_qwq127;
    private static volatile /* synthetic */ String yue_xin_qwq128;
    private static volatile /* synthetic */ String yue_xin_qwq129;
    private static volatile /* synthetic */ String yue_xin_qwq13;
    private static volatile /* synthetic */ String yue_xin_qwq130;
    private static volatile /* synthetic */ String yue_xin_qwq131;
    private static volatile /* synthetic */ String yue_xin_qwq132;
    private static volatile /* synthetic */ String yue_xin_qwq133;
    private static volatile /* synthetic */ String yue_xin_qwq134;
    private static volatile /* synthetic */ String yue_xin_qwq135;
    private static volatile /* synthetic */ String yue_xin_qwq136;
    private static volatile /* synthetic */ String yue_xin_qwq137;
    private static volatile /* synthetic */ String yue_xin_qwq138;
    private static volatile /* synthetic */ String yue_xin_qwq139;
    private static volatile /* synthetic */ String yue_xin_qwq14;
    private static volatile /* synthetic */ String yue_xin_qwq140;
    private static volatile /* synthetic */ String yue_xin_qwq141;
    private static volatile /* synthetic */ String yue_xin_qwq142;
    private static volatile /* synthetic */ String yue_xin_qwq143;
    private static volatile /* synthetic */ String yue_xin_qwq144;
    private static volatile /* synthetic */ String yue_xin_qwq145;
    private static volatile /* synthetic */ String yue_xin_qwq146;
    private static volatile /* synthetic */ String yue_xin_qwq147;
    private static volatile /* synthetic */ String yue_xin_qwq148;
    private static volatile /* synthetic */ String yue_xin_qwq149;
    private static volatile /* synthetic */ String yue_xin_qwq15;
    private static volatile /* synthetic */ String yue_xin_qwq150;
    private static volatile /* synthetic */ String yue_xin_qwq151;
    private static volatile /* synthetic */ String yue_xin_qwq152;
    private static volatile /* synthetic */ String yue_xin_qwq16;
    private static volatile /* synthetic */ String yue_xin_qwq17;
    private static volatile /* synthetic */ String yue_xin_qwq18;
    private static volatile /* synthetic */ String yue_xin_qwq19;
    private static volatile /* synthetic */ String yue_xin_qwq2;
    private static volatile /* synthetic */ String yue_xin_qwq20;
    private static volatile /* synthetic */ String yue_xin_qwq21;
    private static volatile /* synthetic */ String yue_xin_qwq22;
    private static volatile /* synthetic */ String yue_xin_qwq23;
    private static volatile /* synthetic */ String yue_xin_qwq24;
    private static volatile /* synthetic */ String yue_xin_qwq25;
    private static volatile /* synthetic */ String yue_xin_qwq26;
    private static volatile /* synthetic */ String yue_xin_qwq27;
    private static volatile /* synthetic */ String yue_xin_qwq28;
    private static volatile /* synthetic */ String yue_xin_qwq29;
    private static volatile /* synthetic */ String yue_xin_qwq3;
    private static volatile /* synthetic */ String yue_xin_qwq30;
    private static volatile /* synthetic */ String yue_xin_qwq31;
    private static volatile /* synthetic */ String yue_xin_qwq32;
    private static volatile /* synthetic */ String yue_xin_qwq33;
    private static volatile /* synthetic */ String yue_xin_qwq34;
    private static volatile /* synthetic */ String yue_xin_qwq35;
    private static volatile /* synthetic */ String yue_xin_qwq36;
    private static volatile /* synthetic */ String yue_xin_qwq37;
    private static volatile /* synthetic */ String yue_xin_qwq38;
    private static volatile /* synthetic */ String yue_xin_qwq39;
    private static volatile /* synthetic */ String yue_xin_qwq4;
    private static volatile /* synthetic */ String yue_xin_qwq40;
    private static volatile /* synthetic */ String yue_xin_qwq41;
    private static volatile /* synthetic */ String yue_xin_qwq42;
    private static volatile /* synthetic */ String yue_xin_qwq43;
    private static volatile /* synthetic */ String yue_xin_qwq44;
    private static volatile /* synthetic */ String yue_xin_qwq45;
    private static volatile /* synthetic */ String yue_xin_qwq46;
    private static volatile /* synthetic */ String yue_xin_qwq47;
    private static volatile /* synthetic */ String yue_xin_qwq48;
    private static volatile /* synthetic */ String yue_xin_qwq49;
    private static volatile /* synthetic */ String yue_xin_qwq5;
    private static volatile /* synthetic */ String yue_xin_qwq50;
    private static volatile /* synthetic */ String yue_xin_qwq51;
    private static volatile /* synthetic */ String yue_xin_qwq52;
    private static volatile /* synthetic */ String yue_xin_qwq53;
    private static volatile /* synthetic */ String yue_xin_qwq54;
    private static volatile /* synthetic */ String yue_xin_qwq55;
    private static volatile /* synthetic */ String yue_xin_qwq56;
    private static volatile /* synthetic */ String yue_xin_qwq57;
    private static volatile /* synthetic */ String yue_xin_qwq58;
    private static volatile /* synthetic */ String yue_xin_qwq59;
    private static volatile /* synthetic */ String yue_xin_qwq6;
    private static volatile /* synthetic */ String yue_xin_qwq60;
    private static volatile /* synthetic */ String yue_xin_qwq61;
    private static volatile /* synthetic */ String yue_xin_qwq62;
    private static volatile /* synthetic */ String yue_xin_qwq63;
    private static volatile /* synthetic */ String yue_xin_qwq64;
    private static volatile /* synthetic */ String yue_xin_qwq65;
    private static volatile /* synthetic */ String yue_xin_qwq66;
    private static volatile /* synthetic */ String yue_xin_qwq67;
    private static volatile /* synthetic */ String yue_xin_qwq68;
    private static volatile /* synthetic */ String yue_xin_qwq69;
    private static volatile /* synthetic */ String yue_xin_qwq7;
    private static volatile /* synthetic */ String yue_xin_qwq70;
    private static volatile /* synthetic */ String yue_xin_qwq71;
    private static volatile /* synthetic */ String yue_xin_qwq72;
    private static volatile /* synthetic */ String yue_xin_qwq73;
    private static volatile /* synthetic */ String yue_xin_qwq74;
    private static volatile /* synthetic */ String yue_xin_qwq75;
    private static volatile /* synthetic */ String yue_xin_qwq76;
    private static volatile /* synthetic */ String yue_xin_qwq77;
    private static volatile /* synthetic */ String yue_xin_qwq78;
    private static volatile /* synthetic */ String yue_xin_qwq79;
    private static volatile /* synthetic */ String yue_xin_qwq8;
    private static volatile /* synthetic */ String yue_xin_qwq80;
    private static volatile /* synthetic */ String yue_xin_qwq81;
    private static volatile /* synthetic */ String yue_xin_qwq82;
    private static volatile /* synthetic */ String yue_xin_qwq83;
    private static volatile /* synthetic */ String yue_xin_qwq84;
    private static volatile /* synthetic */ String yue_xin_qwq85;
    private static volatile /* synthetic */ String yue_xin_qwq86;
    private static volatile /* synthetic */ String yue_xin_qwq87;
    private static volatile /* synthetic */ String yue_xin_qwq88;
    private static volatile /* synthetic */ String yue_xin_qwq89;
    private static volatile /* synthetic */ String yue_xin_qwq9;
    private static volatile /* synthetic */ String yue_xin_qwq90;
    private static volatile /* synthetic */ String yue_xin_qwq91;
    private static volatile /* synthetic */ String yue_xin_qwq92;
    private static volatile /* synthetic */ String yue_xin_qwq93;
    private static volatile /* synthetic */ String yue_xin_qwq94;
    private static volatile /* synthetic */ String yue_xin_qwq95;
    private static volatile /* synthetic */ String yue_xin_qwq96;
    private static volatile /* synthetic */ String yue_xin_qwq97;
    private static volatile /* synthetic */ String yue_xin_qwq98;
    private static volatile /* synthetic */ String yue_xin_qwq99;

    /* JADX INFO: renamed from: com.yuexin.panel.utils.CrashMonitor$ۥ */
    public class C2601 implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ File f4207;

        static {
            NativeUtil.classesInit0(704);
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C2601(File file) {
            this.f4207 = file;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public native void uncaughtException(Thread thread, Throwable th);
    }

    /* JADX INFO: renamed from: com.yuexin.panel.utils.CrashMonitor$ۥ۟ */
    public static final class C2602 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30818;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30819;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30820;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30821;

        /* JADX INFO: renamed from: ۥ */
        public final String f4208;

        /* JADX INFO: renamed from: ۥ۟ */
        public final String f4209;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final String f30822;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final String f30823;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final String f30824;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final String f30825;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final String f30826;

        static {
            NativeUtil.classesInit0(Opcodes.INVOKE_CUSTOM);
        }

        public C2602(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f4208 = CrashMonitor.access$300(str);
            this.f4209 = CrashMonitor.access$300(str2);
            this.f30822 = CrashMonitor.access$300(str3);
            this.f30823 = CrashMonitor.access$300(str4);
            this.f30824 = CrashMonitor.access$300(str5);
            this.f30825 = CrashMonitor.access$300(str6);
            this.f30826 = CrashMonitor.access$300(str7);
        }

        private static native /* synthetic */ String yue_xin_awa(int i);

        /* JADX INFO: renamed from: ۥ */
        public static native C2602 m5106(String str, String str2, String str3, StackTraceElement stackTraceElement, String str4, String str5);

        /* JADX INFO: renamed from: ۥ۟ */
        public static native C2602 m5107(String str);
    }

    /* JADX INFO: renamed from: com.yuexin.panel.utils.CrashMonitor$ۥ۟۟, reason: contains not printable characters */
    public static final class C9036 {

        /* JADX INFO: renamed from: ۥ */
        public final String f4210;

        /* JADX INFO: renamed from: ۥ۟ */
        public final String f4211;

        public C9036(String str, String str2) {
            this.f4210 = CrashMonitor.access$300(str);
            this.f4211 = CrashMonitor.access$300(str2);
        }
    }

    /* JADX INFO: renamed from: com.yuexin.panel.utils.CrashMonitor$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C9037 {

        /* JADX INFO: renamed from: ۥ */
        public final String f4212;

        /* JADX INFO: renamed from: ۥ۟ */
        public final String f4213;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final long f30827;

        public C9037(String str, String str2, long j) {
            this.f4212 = CrashMonitor.access$300(str);
            this.f4213 = CrashMonitor.access$300(str2);
            this.f30827 = j;
        }
    }

    static {
        NativeUtil.classesInit0(441);
        MODULE_PACKAGE_NAME = yue_xin_awa(0);
        CAUSE_HOST = yue_xin_awa(1);
        CAUSE_MODULE = yue_xin_awa(2);
        CAUSE_OTHER_MODULE = yue_xin_awa(3);
        CAUSE_UNKNOWN = yue_xin_awa(4);
        APK_PATH_PATTERN = Pattern.compile(yue_xin_awa(152));
        INSTALL_LOCK = new Object();
        WRITING = new AtomicBoolean(false);
    }

    private CrashMonitor() {
    }

    public static native /* synthetic */ void access$000(File file, Thread thread, Throwable th);

    public static native /* synthetic */ Thread.UncaughtExceptionHandler access$100();

    public static native /* synthetic */ void access$200();

    public static native /* synthetic */ String access$300(String str);

    private static native C2602 analyzeCrashCause(C9037 c9037, Thread thread, Throwable th);

    private static native boolean belongsToPackage(String str, String str2);

    private static native C9037 collectHostInfo();

    private static native void copyProcFile(String str, PrintWriter printWriter);

    private static native File createSessionDirectory(File file, String str);

    private static native String describeLoader(ClassLoader classLoader);

    private static native C9036 detectFramework();

    private static native Class<?> findClass(String str);

    private static native String findLoadedXposedModulePackage(String str, String str2);

    private static native String findXposedModulePackage(String str, String str2);

    private static native String findXposedModulePackageFromLoader(String str, String str2);

    private static native Context getContextSafely();

    private static native File getCrashJsonFile();

    private static native File getCrashRoot();

    private static native String getThrowableStack(Throwable th);

    private static native String getXposedApiVersion(Class<?> cls);

    public static native boolean hasPreviousCrash();

    public static native void install();

    private static native boolean isFrameworkFrame(String str);

    private static native boolean isHostLoader(String str);

    private static native boolean isOwnModuleLoader(String str);

    private static native boolean isXposedModule(ApplicationInfo applicationInfo);

    private static native void killAfterCrash();

    private static native boolean matchesXposedEntryNamespace(String str, String str2);

    private static native String readProcessPackageName();

    private static native Class<?> resolveFrameClass(String str, Thread thread, Throwable th);

    private static native String safe(String str);

    private static native String sanitize(String str);

    private static native void writeCrashIndex(File file, String str, String str2, String str3, String str4, String str5, Throwable th, C9037 c9037, C9036 c9036, C2602 c2602);

    private static native void writeJavaCrash(File file, Thread thread, Throwable th);

    private static native /* synthetic */ String yue_xin_awa(int i);
}
