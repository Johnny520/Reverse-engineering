.class public Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/utility/AsmClassWriter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/AsmClassWriter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForClassFileApi"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi$JdkClassWriter;
    }
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field private static final DISPATCHER:Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi$JdkClassWriter;


# instance fields
.field private final classWriter:Lnet/bytebuddy/jar/asm/ClassVisitor;


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
    sput-boolean v1, Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi;->ACCESS_CONTROLLER:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    const/4 v0, 0x1

    .line 24
    :catch_1
    sput-boolean v0, Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    :goto_0
    const-class v0, Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-class v1, Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi$JdkClassWriter;

    .line 33
    .line 34
    invoke-static {v1, v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/security/PrivilegedAction;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi$JdkClassWriter;

    .line 43
    .line 44
    sput-object v0, Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi;->DISPATCHER:Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi$JdkClassWriter;

    .line 45
    .line 46
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/jar/asm/ClassVisitor;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi;->DISPATCHER:Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi$JdkClassWriter;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi$JdkClassWriter;->isInstance(Lnet/bytebuddy/jar/asm/ClassVisitor;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iput-object p1, p0, Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi;->classWriter:Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p0, "Not a JDK class writer: "

    .line 16
    .line 17
    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    throw p0
.end method

.method public static synthetic access$300()Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi$JdkClassWriter;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi;->DISPATCHER:Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi$JdkClassWriter;

    .line 2
    .line 3
    return-object v0
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
    sget-boolean v0, Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi;->ACCESS_CONTROLLER:Z

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


# virtual methods
.method public getBinaryRepresentation()[B
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi;->DISPATCHER:Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi$JdkClassWriter;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi;->classWriter:Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi$JdkClassWriter;->toByteArray(Lnet/bytebuddy/jar/asm/ClassVisitor;)[B

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getVisitor()Lnet/bytebuddy/jar/asm/ClassVisitor;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassWriter$ForClassFileApi;->classWriter:Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 2
    .line 3
    return-object p0
.end method
