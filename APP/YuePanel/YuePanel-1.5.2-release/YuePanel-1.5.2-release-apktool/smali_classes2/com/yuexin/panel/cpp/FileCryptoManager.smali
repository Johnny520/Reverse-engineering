.class public final Lcom/yuexin/panel/cpp/FileCryptoManager;
.super Ljava/lang/Object;


# static fields
.field public static final ۥ:Ljava/lang/String; = "YPNK2:"

.field public static final ۥ۟:Ljava/lang/String; = "YPNV2:"

.field public static final ۥ۟۟:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    :try_start_0
    const-string v0, "miao"

    invoke-static {v0}, LYue/ۥۡۢ۠ۨ;->ۥ۟۟(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lcom/yuexin/panel/cpp/FileCryptoManager;->ۥ۟۟:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native nativeDecrypt([B)[B
.end method

.method private static native nativeDecryptJavaString(J)[B
.end method

.method private static native nativeDecryptReadFile(Ljava/lang/String;)[B
.end method

.method private static native nativeEncrypt([B)[B
.end method

.method private static native nativeEncryptWriteFile(Ljava/lang/String;[B)Z
.end method

.method private static native nativeInstallCrashHandler(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)Z
.end method

.method public static native ۥ(J)[B
.end method

.method public static native ۥ۟(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native ۥ۟۟۟(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native ۥ۟۟۟۟(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native ۥ۟۟۟۠(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native ۥ۟۟۟ۡ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native ۥ۟۟۟ۢ(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static native ۥۣ۟۟۟(Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public static native ۥ۟۟۟ۤ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)Z
.end method

.method public static native ۥ۟۟۟ۥ()Z
.end method

.method public static native ۥ۟۟۟ۦ(Ljava/lang/String;)Z
.end method

.method public static native ۥ۟۟۟ۧ(Ljava/lang/String;)Z
.end method
