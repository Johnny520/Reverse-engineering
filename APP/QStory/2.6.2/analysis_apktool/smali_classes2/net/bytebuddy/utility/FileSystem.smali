.class public abstract Lnet/bytebuddy/utility/FileSystem;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm;,
        Lnet/bytebuddy/utility/FileSystem$ForLegacyVm;
    }
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field private static synthetic INSTANCE:Lnet/bytebuddy/utility/FileSystem;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "java.security.AccessController"

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v1, v0, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "net.bytebuddy.securitymanager"

    .line 9
    .line 10
    const-string v2, "true"

    .line 11
    .line 12
    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sput-boolean v1, Lnet/bytebuddy/utility/FileSystem;->ACCESS_CONTROLLER:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    return-void

    .line 23
    :catch_0
    const/4 v0, 0x1

    .line 24
    :catch_1
    sput-boolean v0, Lnet/bytebuddy/utility/FileSystem;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$000(Ljava/security/PrivilegedAction;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/utility/FileSystem;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/security/PrivilegedAction<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/AccessControllerPlugin$Enhance;
    .end annotation

    .line 1
    sget-boolean v0, Lnet/bytebuddy/utility/FileSystem;->ACCESS_CONTROLLER:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/security/PrivilegedAction;->run()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static getInstance()Lnet/bytebuddy/utility/FileSystem;
    .locals 3
    .annotation runtime Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;
        value = "INSTANCE"
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/FileSystem;->INSTANCE:Lnet/bytebuddy/utility/FileSystem;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    :try_start_0
    const-string v0, "java.nio.file.Files"

    .line 8
    .line 9
    sget-object v1, Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;->BOOTSTRAP_LOADER:Ljava/lang/ClassLoader;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static {v0, v2, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance v0, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm;

    .line 16
    .line 17
    invoke-direct {v0}, Lnet/bytebuddy/utility/FileSystem$ForNio2CapableVm;-><init>()V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    new-instance v0, Lnet/bytebuddy/utility/FileSystem$ForLegacyVm;

    .line 22
    .line 23
    invoke-direct {v0}, Lnet/bytebuddy/utility/FileSystem$ForLegacyVm;-><init>()V

    .line 24
    .line 25
    .line 26
    :goto_0
    if-nez v0, :cond_1

    .line 27
    .line 28
    sget-object v0, Lnet/bytebuddy/utility/FileSystem;->INSTANCE:Lnet/bytebuddy/utility/FileSystem;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    sput-object v0, Lnet/bytebuddy/utility/FileSystem;->INSTANCE:Lnet/bytebuddy/utility/FileSystem;

    .line 32
    .line 33
    :goto_1
    return-object v0
.end method


# virtual methods
.method public abstract copy(Ljava/io/File;Ljava/io/File;)V
.end method

.method public link(Ljava/io/File;Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/utility/FileSystem;->copy(Ljava/io/File;Ljava/io/File;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public abstract move(Ljava/io/File;Ljava/io/File;)V
.end method
