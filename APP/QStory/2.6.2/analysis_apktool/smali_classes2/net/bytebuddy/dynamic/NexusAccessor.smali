.class public Lnet/bytebuddy/dynamic/NexusAccessor;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher;,
        Lnet/bytebuddy/dynamic/NexusAccessor$InitializationAppender;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field private static final DISPATCHER:Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher;


# instance fields
.field private final referenceQueue:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue<",
            "-",
            "Ljava/lang/ClassLoader;",
            ">;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field


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
    sput-boolean v1, Lnet/bytebuddy/dynamic/NexusAccessor;->ACCESS_CONTROLLER:Z
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
    sput-boolean v0, Lnet/bytebuddy/dynamic/NexusAccessor;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    :goto_0
    sget-object v0, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;->INSTANCE:Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher$CreationAction;

    .line 27
    .line 28
    invoke-static {v0}, Lnet/bytebuddy/dynamic/NexusAccessor;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher;

    .line 33
    .line 34
    sput-object v0, Lnet/bytebuddy/dynamic/NexusAccessor;->DISPATCHER:Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher;

    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0}, Lnet/bytebuddy/dynamic/NexusAccessor;-><init>(Ljava/lang/ref/ReferenceQueue;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/ref/ReferenceQueue;)V
    .locals 0
    .param p1    # Ljava/lang/ref/ReferenceQueue;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/ReferenceQueue<",
            "-",
            "Ljava/lang/ClassLoader;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/dynamic/NexusAccessor;->referenceQueue:Ljava/lang/ref/ReferenceQueue;

    .line 5
    .line 6
    return-void
.end method

.method public static clean(Ljava/lang/ref/Reference;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/Reference<",
            "+",
            "Ljava/lang/ClassLoader;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/NexusAccessor;->DISPATCHER:Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher;->clean(Ljava/lang/ref/Reference;)V

    .line 4
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
    sget-boolean v0, Lnet/bytebuddy/dynamic/NexusAccessor;->ACCESS_CONTROLLER:Z

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

.method public static isAlive()Z
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/NexusAccessor;->DISPATCHER:Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher;->isAlive()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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
    iget-object p0, p0, Lnet/bytebuddy/dynamic/NexusAccessor;->referenceQueue:Ljava/lang/ref/ReferenceQueue;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/dynamic/NexusAccessor;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/dynamic/NexusAccessor;->referenceQueue:Ljava/lang/ref/ReferenceQueue;

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    if-eqz p0, :cond_4

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-nez p0, :cond_5

    .line 35
    .line 36
    return v1

    .line 37
    :cond_3
    if-eqz p0, :cond_5

    .line 38
    .line 39
    :cond_4
    return v1

    .line 40
    :cond_5
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
    iget-object p0, p0, Lnet/bytebuddy/dynamic/NexusAccessor;->referenceQueue:Ljava/lang/ref/ReferenceQueue;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    add-int/2addr p0, v0

    .line 20
    return p0

    .line 21
    :cond_0
    return v0
.end method

.method public register(Ljava/lang/String;Ljava/lang/ClassLoader;ILnet/bytebuddy/implementation/LoadedTypeInitializer;)V
    .locals 7
    .param p2    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-interface {p4}, Lnet/bytebuddy/implementation/LoadedTypeInitializer;->isAlive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v1, Lnet/bytebuddy/dynamic/NexusAccessor;->DISPATCHER:Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher;

    .line 8
    .line 9
    iget-object v4, p0, Lnet/bytebuddy/dynamic/NexusAccessor;->referenceQueue:Ljava/lang/ref/ReferenceQueue;

    .line 10
    .line 11
    move-object v2, p1

    .line 12
    move-object v3, p2

    .line 13
    move v5, p3

    .line 14
    move-object v6, p4

    .line 15
    invoke-interface/range {v1 .. v6}, Lnet/bytebuddy/dynamic/NexusAccessor$Dispatcher;->register(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/ref/ReferenceQueue;ILnet/bytebuddy/implementation/LoadedTypeInitializer;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method
