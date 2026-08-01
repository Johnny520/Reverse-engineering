.class public Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$StreamWriting;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;
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
    iput-object p1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 5
    .line 6
    return-void
.end method

.method public static toSystemError()Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$StreamWriting;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$StreamWriting;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$StreamWriting;-><init>(Ljava/io/PrintStream;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static toSystemOut()Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$StreamWriting;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$StreamWriting;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$StreamWriting;-><init>(Ljava/io/PrintStream;)V

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
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$StreamWriting;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

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
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

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

.method public onComplete(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Z)V
    .locals 1
    .param p2    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Lnet/bytebuddy/utility/JavaModule;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p4

    .line 11
    filled-new-array {p1, p2, p3, v0, p4}, [Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string p2, "[Byte Buddy] COMPLETE %s [%s, %s, %s, loaded=%b]%n"

    .line 16
    .line 17
    invoke-virtual {p0, p2, p1}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onDiscovery(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Z)V
    .locals 1
    .param p2    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Lnet/bytebuddy/utility/JavaModule;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p4

    .line 11
    filled-new-array {p1, p2, p3, v0, p4}, [Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string p2, "[Byte Buddy] DISCOVERY %s [%s, %s, %s, loaded=%b]%n"

    .line 16
    .line 17
    invoke-virtual {p0, p2, p1}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public onError(Ljava/lang/String;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;ZLjava/lang/Throwable;)V
    .locals 4
    .param p2    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Lnet/bytebuddy/utility/JavaModule;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 5
    .line 6
    const-string v2, "[Byte Buddy] ERROR %s [%s, %s, %s, loaded=%b]%n"

    .line 7
    .line 8
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    move-result-object p4

    .line 16
    filled-new-array {p1, p2, p3, v3, p4}, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {v1, v2, p1}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 24
    .line 25
    invoke-virtual {p5, p0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    .line 26
    .line 27
    .line 28
    monitor-exit v0

    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    throw p0
.end method

.method public onIgnored(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;Z)V
    .locals 1
    .param p2    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Lnet/bytebuddy/utility/JavaModule;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 2
    .line 3
    invoke-interface {p1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object p4

    .line 15
    filled-new-array {p1, p2, p3, v0, p4}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string p2, "[Byte Buddy] IGNORE %s [%s, %s, %s, loaded=%b]%n"

    .line 20
    .line 21
    invoke-virtual {p0, p2, p1}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public onTransformation(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/ClassLoader;Lnet/bytebuddy/utility/JavaModule;ZLnet/bytebuddy/dynamic/DynamicType;)V
    .locals 0
    .param p2    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Lnet/bytebuddy/utility/JavaModule;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 2
    .line 3
    invoke-interface {p1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 8
    .line 9
    .line 10
    move-result-object p5

    .line 11
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object p4

    .line 15
    filled-new-array {p1, p2, p3, p5, p4}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string p2, "[Byte Buddy] TRANSFORM %s [%s, %s, %s, loaded=%b]%n"

    .line 20
    .line 21
    invoke-virtual {p0, p2, p1}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public withErrorsOnly()Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$WithErrorsOnly;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$WithErrorsOnly;-><init>(Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public withTransformationsOnly()Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$WithTransformationsOnly;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/agent/builder/AgentBuilder$Listener$WithTransformationsOnly;-><init>(Lnet/bytebuddy/agent/builder/AgentBuilder$Listener;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
