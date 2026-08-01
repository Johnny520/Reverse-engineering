.class public Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/utility/AsmClassReader;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/AsmClassReader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForClassFileApi"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi$JdkClassReader;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field protected static final DISPATCHER:Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi$JdkClassReader;


# instance fields
.field private final classReader:Ljava/lang/Object;


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
    sput-boolean v1, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->ACCESS_CONTROLLER:Z
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
    sput-boolean v0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    :goto_0
    const-class v0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-class v1, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi$JdkClassReader;

    .line 33
    .line 34
    invoke-static {v1, v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/security/PrivilegedAction;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi$JdkClassReader;

    .line 43
    .line 44
    sput-object v0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->DISPATCHER:Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi$JdkClassReader;

    .line 45
    .line 46
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->DISPATCHER:Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi$JdkClassReader;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi$JdkClassReader;->isInstance(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iput-object p1, p0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->classReader:Ljava/lang/Object;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-static {}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰()V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0
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
    sget-boolean v0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->ACCESS_CONTROLLER:Z

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
.method public accept(Lnet/bytebuddy/jar/asm/ClassVisitor;I)V
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->DISPATCHER:Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi$JdkClassReader;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->classReader:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-interface {v0, p0, p1, p2}, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi$JdkClassReader;->accept(Ljava/lang/Object;Lnet/bytebuddy/jar/asm/ClassVisitor;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->classReader:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->classReader:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    return v0
.end method

.method public getInterfaceInternalNames()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->DISPATCHER:Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi$JdkClassReader;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->classReader:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi$JdkClassReader;->getInterfaces(Ljava/lang/Object;)[Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public getInterfaceTypeName()[Ljava/lang/String;
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->DISPATCHER:Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi$JdkClassReader;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->classReader:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi$JdkClassReader;->getInterfaces(Ljava/lang/Object;)[Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getInternalName()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->DISPATCHER:Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi$JdkClassReader;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->classReader:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi$JdkClassReader;->getClassName(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getModifiers()I
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->DISPATCHER:Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi$JdkClassReader;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->classReader:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi$JdkClassReader;->getAccess(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public getSuperClassInternalName()Ljava/lang/String;
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->DISPATCHER:Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi$JdkClassReader;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->classReader:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi$JdkClassReader;->getSuperName(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getSuperClassName()Ljava/lang/String;
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->DISPATCHER:Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi$JdkClassReader;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->classReader:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi$JdkClassReader;->getSuperName(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->classReader:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public unwrap(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->classReader:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;->classReader:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {p1, p0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
.end method
