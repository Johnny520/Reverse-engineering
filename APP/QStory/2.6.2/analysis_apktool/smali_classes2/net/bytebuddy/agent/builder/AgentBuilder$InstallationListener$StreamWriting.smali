.class public Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$StreamWriting;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StreamWriting"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field protected static final PREFIX:Ljava/lang/String; = "[Byte Buddy]"


# instance fields
.field private final printStream:Ljava/io/PrintStream;


# direct methods
.method public constructor <init>(Ljava/io/PrintStream;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 5
    .line 6
    return-void
.end method

.method public static toSystemError()Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$StreamWriting;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$StreamWriting;-><init>(Ljava/io/PrintStream;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static toSystemOut()Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$StreamWriting;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$StreamWriting;-><init>(Ljava/io/PrintStream;)V

    .line 6
    .line 7
    .line 8
    return-object v0
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
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$StreamWriting;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$StreamWriting;->printStream:Ljava/io/PrintStream;

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
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$StreamWriting;->printStream:Ljava/io/PrintStream;

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

.method public onAfterWarmUp(Ljava/util/Map;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;[B>;",
            "Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;",
            "Z)V"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const-string p3, "transformed"

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string p3, "not transformed"

    .line 9
    .line 10
    :goto_0
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    filled-new-array {p3, p2, p1}, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string p2, "[Byte Buddy] AFTER_WARMUP %s %s on %s%n"

    .line 19
    .line 20
    invoke-virtual {p0, p2, p1}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public onBeforeInstall(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 2
    .line 3
    const-string v0, "[Byte Buddy] BEFORE_INSTALL %s on %s%n"

    .line 4
    .line 5
    filled-new-array {p2, p1}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, v0, p1}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onBeforeWarmUp(Ljava/util/Set;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;",
            "Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 2
    .line 3
    const-string v0, "[Byte Buddy] BEFORE_WARMUP %s on %s%n"

    .line 4
    .line 5
    filled-new-array {p2, p1}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, v0, p1}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onError(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 5
    .line 6
    const-string v2, "[Byte Buddy] ERROR %s on %s%n"

    .line 7
    .line 8
    filled-new-array {p2, p1}, [Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v1, v2, p1}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 16
    .line 17
    invoke-virtual {p3, p0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    .line 18
    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object p3

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p0
.end method

.method public onInstall(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 2
    .line 3
    const-string v0, "[Byte Buddy] INSTALL %s on %s%n"

    .line 4
    .line 5
    filled-new-array {p2, p1}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, v0, p1}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onReset(Ljava/lang/instrument/Instrumentation;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 2
    .line 3
    const-string v0, "[Byte Buddy] RESET %s on %s%n"

    .line 4
    .line 5
    filled-new-array {p2, p1}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, v0, p1}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onWarmUpError(Ljava/lang/Class;Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;Ljava/lang/Throwable;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lnet/bytebuddy/agent/builder/ResettableClassFileTransformer;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 5
    .line 6
    const-string v2, "[Byte Buddy] ERROR_WARMUP %s on %s%n"

    .line 7
    .line 8
    filled-new-array {p2, p1}, [Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v1, v2, p1}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$InstallationListener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 16
    .line 17
    invoke-virtual {p3, p0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    .line 18
    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p0
.end method
