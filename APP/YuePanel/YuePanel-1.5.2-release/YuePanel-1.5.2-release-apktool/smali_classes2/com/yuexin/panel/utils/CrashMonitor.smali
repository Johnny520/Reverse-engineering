.class public final Lcom/yuexin/panel/utils/CrashMonitor;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yuexin/panel/utils/CrashMonitor$ۥ۟۟۟;,
        Lcom/yuexin/panel/utils/CrashMonitor$ۥ۟۟;,
        Lcom/yuexin/panel/utils/CrashMonitor$ۥ۟;
    }
.end annotation


# static fields
.field private static final APK_PATH_PATTERN:Ljava/util/regex/Pattern;

.field private static final CAUSE_HOST:Ljava/lang/String;

.field private static final CAUSE_MODULE:Ljava/lang/String;

.field private static final CAUSE_OTHER_MODULE:Ljava/lang/String;

.field private static final CAUSE_UNKNOWN:Ljava/lang/String;

.field private static final INSTALL_LOCK:Ljava/lang/Object;

.field private static final MODULE_PACKAGE_NAME:Ljava/lang/String;

.field private static final WRITING:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static volatile installed:Z

.field private static volatile previousHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

.field private static volatile synthetic yue_xin_qwq0:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq1:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq10:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq100:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq101:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq102:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq103:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq104:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq105:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq106:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq107:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq108:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq109:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq11:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq110:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq111:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq112:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq113:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq114:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq115:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq116:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq117:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq118:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq119:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq12:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq120:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq121:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq122:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq123:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq124:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq125:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq126:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq127:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq128:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq129:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq13:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq130:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq131:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq132:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq133:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq134:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq135:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq136:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq137:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq138:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq139:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq14:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq140:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq141:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq142:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq143:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq144:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq145:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq146:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq147:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq148:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq149:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq15:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq150:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq151:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq152:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq16:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq17:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq18:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq19:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq2:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq20:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq21:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq22:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq23:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq24:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq25:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq26:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq27:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq28:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq29:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq3:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq30:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq31:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq32:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq33:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq34:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq35:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq36:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq37:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq38:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq39:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq4:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq40:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq41:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq42:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq43:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq44:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq45:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq46:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq47:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq48:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq49:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq5:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq50:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq51:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq52:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq53:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq54:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq55:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq56:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq57:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq58:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq59:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq6:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq60:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq61:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq62:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq63:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq64:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq65:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq66:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq67:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq68:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq69:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq7:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq70:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq71:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq72:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq73:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq74:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq75:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq76:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq77:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq78:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq79:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq8:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq80:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq81:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq82:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq83:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq84:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq85:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq86:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq87:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq88:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq89:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq9:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq90:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq91:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq92:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq93:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq94:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq95:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq96:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq97:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq98:Ljava/lang/String;

.field private static volatile synthetic yue_xin_qwq99:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x1b9

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/yuexin/panel/utils/CrashMonitor;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/yuexin/panel/utils/CrashMonitor;->MODULE_PACKAGE_NAME:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v1}, Lcom/yuexin/panel/utils/CrashMonitor;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/yuexin/panel/utils/CrashMonitor;->CAUSE_HOST:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-static {v1}, Lcom/yuexin/panel/utils/CrashMonitor;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/yuexin/panel/utils/CrashMonitor;->CAUSE_MODULE:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-static {v1}, Lcom/yuexin/panel/utils/CrashMonitor;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/yuexin/panel/utils/CrashMonitor;->CAUSE_OTHER_MODULE:Ljava/lang/String;

    const/4 v1, 0x4

    invoke-static {v1}, Lcom/yuexin/panel/utils/CrashMonitor;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/yuexin/panel/utils/CrashMonitor;->CAUSE_UNKNOWN:Ljava/lang/String;

    const/16 v1, 0x98

    invoke-static {v1}, Lcom/yuexin/panel/utils/CrashMonitor;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    sput-object v1, Lcom/yuexin/panel/utils/CrashMonitor;->APK_PATH_PATTERN:Ljava/util/regex/Pattern;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    sput-object v1, Lcom/yuexin/panel/utils/CrashMonitor;->INSTALL_LOCK:Ljava/lang/Object;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v1, Lcom/yuexin/panel/utils/CrashMonitor;->WRITING:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native synthetic access$000(Ljava/io/File;Ljava/lang/Thread;Ljava/lang/Throwable;)V
.end method

.method public static native synthetic access$100()Ljava/lang/Thread$UncaughtExceptionHandler;
.end method

.method public static native synthetic access$200()V
.end method

.method public static native synthetic access$300(Ljava/lang/String;)Ljava/lang/String;
.end method

.method private static native analyzeCrashCause(Lcom/yuexin/panel/utils/CrashMonitor$ۥ۟۟۟;Ljava/lang/Thread;Ljava/lang/Throwable;)Lcom/yuexin/panel/utils/CrashMonitor$ۥ۟;
.end method

.method private static native belongsToPackage(Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method private static native collectHostInfo()Lcom/yuexin/panel/utils/CrashMonitor$ۥ۟۟۟;
.end method

.method private static native copyProcFile(Ljava/lang/String;Ljava/io/PrintWriter;)V
.end method

.method private static native createSessionDirectory(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
.end method

.method private static native describeLoader(Ljava/lang/ClassLoader;)Ljava/lang/String;
.end method

.method private static native detectFramework()Lcom/yuexin/panel/utils/CrashMonitor$ۥ۟۟;
.end method

.method private static native findClass(Ljava/lang/String;)Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

.method private static native findLoadedXposedModulePackage(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method private static native findXposedModulePackage(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method private static native findXposedModulePackageFromLoader(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method private static native getContextSafely()Landroid/content/Context;
.end method

.method private static native getCrashJsonFile()Ljava/io/File;
.end method

.method private static native getCrashRoot()Ljava/io/File;
.end method

.method private static native getThrowableStack(Ljava/lang/Throwable;)Ljava/lang/String;
.end method

.method private static native getXposedApiVersion(Ljava/lang/Class;)Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation
.end method

.method public static native hasPreviousCrash()Z
.end method

.method public static native install()V
.end method

.method private static native isFrameworkFrame(Ljava/lang/String;)Z
.end method

.method private static native isHostLoader(Ljava/lang/String;)Z
.end method

.method private static native isOwnModuleLoader(Ljava/lang/String;)Z
.end method

.method private static native isXposedModule(Landroid/content/pm/ApplicationInfo;)Z
.end method

.method private static native killAfterCrash()V
.end method

.method private static native matchesXposedEntryNamespace(Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method private static native readProcessPackageName()Ljava/lang/String;
.end method

.method private static native resolveFrameClass(Ljava/lang/String;Ljava/lang/Thread;Ljava/lang/Throwable;)Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Thread;",
            "Ljava/lang/Throwable;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

.method private static native safe(Ljava/lang/String;)Ljava/lang/String;
.end method

.method private static native sanitize(Ljava/lang/String;)Ljava/lang/String;
.end method

.method private static native writeCrashIndex(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lcom/yuexin/panel/utils/CrashMonitor$ۥ۟۟۟;Lcom/yuexin/panel/utils/CrashMonitor$ۥ۟۟;Lcom/yuexin/panel/utils/CrashMonitor$ۥ۟;)V
.end method

.method private static native writeJavaCrash(Ljava/io/File;Ljava/lang/Thread;Ljava/lang/Throwable;)V
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method
