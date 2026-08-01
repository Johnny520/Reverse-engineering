.class public Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;
.super Lnet/bytebuddy/dynamic/loading/ClassInjector$AbstractBase;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/ClassInjector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UsingLookup"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup$MethodHandles;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field private static final METHOD_HANDLES:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup$MethodHandles;

.field private static final METHOD_HANDLES_LOOKUP:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup$MethodHandles$Lookup;

.field private static final PACKAGE_LOOKUP:I = 0x8


# instance fields
.field private final lookup:Ljava/lang/Object;


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
    sput-boolean v1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;->ACCESS_CONTROLLER:Z
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
    sput-boolean v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    :goto_0
    const-class v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup$MethodHandles;

    .line 27
    .line 28
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup$MethodHandles;

    .line 37
    .line 38
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;->METHOD_HANDLES:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup$MethodHandles;

    .line 39
    .line 40
    const-class v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup$MethodHandles$Lookup;

    .line 41
    .line 42
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup$MethodHandles$Lookup;

    .line 51
    .line 52
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;->METHOD_HANDLES_LOOKUP:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup$MethodHandles$Lookup;

    .line 53
    .line 54
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;->lookup:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
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
    sget-boolean v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;->ACCESS_CONTROLLER:Z

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

.method public static isAvailable()Z
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/utility/JavaType;->MODULE:Lnet/bytebuddy/utility/JavaType;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/bytebuddy/utility/JavaType;->isAvailable()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static of(Ljava/lang/Object;)Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;
    .locals 1

    .line 1
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;->isAvailable()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    sget-object v0, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLES_LOOKUP:Lnet/bytebuddy/utility/JavaType;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lnet/bytebuddy/utility/JavaType;->isInstance(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;->METHOD_HANDLES_LOOKUP:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup$MethodHandles$Lookup;

    .line 16
    .line 17
    invoke-interface {v0, p0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup$MethodHandles$Lookup;->lookupModes(Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    and-int/lit8 v0, v0, 0x8

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    new-instance v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;-><init>(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_0
    const-string v0, "Lookup does not imply package-access: "

    .line 32
    .line 33
    invoke-static {p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    const/4 p0, 0x0

    .line 41
    return-object p0

    .line 42
    :cond_1
    const-string v0, "Not a method handle lookup: "

    .line 43
    .line 44
    invoke-static {p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const-string p0, "The current VM does not support class definition via method handle lookups"

    .line 53
    .line 54
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0
.end method


# virtual methods
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
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;->lookup:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;->lookup:Ljava/lang/Object;

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
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;->lookup:Ljava/lang/Object;

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

.method public in(Ljava/lang/Class;)Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;"
        }
    .end annotation

    .line 1
    :try_start_0
    new-instance v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;->METHOD_HANDLES:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup$MethodHandles;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;->lookup:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-interface {v1, p1, v2}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup$MethodHandles;->privateLookupIn(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :catch_0
    move-exception v0

    .line 16
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;->lookup:Ljava/lang/Object;

    .line 23
    .line 24
    new-instance v2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v3, "Cannot access "

    .line 27
    .line 28
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string p1, " from "

    .line 35
    .line 36
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-direct {v1, p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    throw v1
.end method

.method public injectRaw(Ljava/util/Set;Lnet/bytebuddy/dynamic/ClassFileLocator;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;->lookupType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDescription;->getPackage()Lnet/bytebuddy/description/type/PackageDescription;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    new-instance v2, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Ljava/lang/String;

    .line 36
    .line 37
    const/16 v4, 0x2e

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Ljava/lang/String;->lastIndexOf(I)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-interface {v0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    const/4 v6, -0x1

    .line 48
    if-ne v4, v6, :cond_0

    .line 49
    .line 50
    const-string v4, ""

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    const/4 v6, 0x0

    .line 54
    invoke-virtual {v3, v6, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    :goto_1
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_1

    .line 63
    .line 64
    :try_start_0
    sget-object v4, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;->METHOD_HANDLES_LOOKUP:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup$MethodHandles$Lookup;

    .line 65
    .line 66
    iget-object v5, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;->lookup:Ljava/lang/Object;

    .line 67
    .line 68
    invoke-interface {p2, v3}, Lnet/bytebuddy/dynamic/ClassFileLocator;->locate(Ljava/lang/String;)Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-interface {v6}, Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;->resolve()[B

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-interface {v4, v5, v6}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup$MethodHandles$Lookup;->defineClass(Ljava/lang/Object;[B)Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :catch_0
    move-exception p0

    .line 85
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    return-object v1

    .line 89
    :cond_1
    const-string p1, " must be defined in the same package as "

    .line 90
    .line 91
    invoke-static {v3, p1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;->lookup:Ljava/lang/Object;

    .line 96
    .line 97
    invoke-static {p0, p1}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;Ljava/lang/StringBuilder;)V

    .line 98
    .line 99
    .line 100
    return-object v1

    .line 101
    :cond_2
    return-object v2

    .line 102
    :cond_3
    const-string p0, "Cannot inject array or primitive type"

    .line 103
    .line 104
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-object v1
.end method

.method public isAlive()Z
    .locals 0

    .line 1
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;->isAvailable()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public lookupType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;->METHOD_HANDLES_LOOKUP:Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup$MethodHandles$Lookup;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup;->lookup:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/dynamic/loading/ClassInjector$UsingLookup$MethodHandles$Lookup;->lookupClass(Ljava/lang/Object;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
