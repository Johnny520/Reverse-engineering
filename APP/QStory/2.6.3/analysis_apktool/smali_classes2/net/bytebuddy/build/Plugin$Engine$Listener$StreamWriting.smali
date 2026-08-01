.class public Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;
.super Lnet/bytebuddy/build/Plugin$Engine$Listener$Adapter;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine$Listener;
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
    invoke-direct {p0}, Lnet/bytebuddy/build/Plugin$Engine$Listener$Adapter;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 5
    .line 6
    return-void
.end method

.method public static toSystemError()Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;-><init>(Ljava/io/PrintStream;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static toSystemOut()Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;-><init>(Ljava/io/PrintStream;)V

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
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

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
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

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

.method public onComplete(Lnet/bytebuddy/description/type/TypeDescription;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 2
    .line 3
    const-string v0, "[Byte Buddy] COMPLETE %s"

    .line 4
    .line 5
    filled-new-array {p1}, [Ljava/lang/Object;

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

.method public onDiscovery(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 2
    .line 3
    const-string v0, "[Byte Buddy] DISCOVERY %s"

    .line 4
    .line 5
    filled-new-array {p1}, [Ljava/lang/Object;

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

.method public onError(Lnet/bytebuddy/build/Plugin;Ljava/lang/Throwable;)V
    .locals 3

    .line 25
    iget-object v0, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

    monitor-enter v0

    .line 26
    :try_start_0
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

    const-string v2, "[Byte Buddy] ERROR %s"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 27
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

    invoke-virtual {p2, p0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V

    .line 28
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public onError(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/build/Plugin;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 5
    .line 6
    const-string v2, "[Byte Buddy] ERROR %s for %s"

    .line 7
    .line 8
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v1, v2, p1}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

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

.method public onIgnored(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/build/Plugin;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 2
    .line 3
    const-string v0, "[Byte Buddy] IGNORE %s for %s"

    .line 4
    .line 5
    filled-new-array {p1, p2}, [Ljava/lang/Object;

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

.method public onLiveInitializer(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 2
    .line 3
    const-string v0, "[Byte Buddy] LIVE %s on %s"

    .line 4
    .line 5
    filled-new-array {p1, p2}, [Ljava/lang/Object;

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

.method public onManifest(Ljava/util/jar/Manifest;)V
    .locals 1
    .param p1    # Ljava/util/jar/Manifest;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v0, "[Byte Buddy] MANIFEST %b"

    .line 17
    .line 18
    invoke-virtual {p0, v0, p1}, Ljava/io/PrintStream;->printf(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onResource(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 2
    .line 3
    const-string v0, "[Byte Buddy] RESOURCE %s"

    .line 4
    .line 5
    filled-new-array {p1}, [Ljava/lang/Object;

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

.method public onTransformation(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/build/Plugin;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 2
    .line 3
    const-string v0, "[Byte Buddy] TRANSFORM %s for %s"

    .line 4
    .line 5
    filled-new-array {p1, p2}, [Ljava/lang/Object;

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

.method public onUnresolved(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Listener$StreamWriting;->printStream:Ljava/io/PrintStream;

    .line 2
    .line 3
    const-string v0, "[Byte Buddy] UNRESOLVED %s"

    .line 4
    .line 5
    filled-new-array {p1}, [Ljava/lang/Object;

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

.method public withErrorsOnly()Lnet/bytebuddy/build/Plugin$Engine$Listener;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Listener$WithErrorsOnly;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/build/Plugin$Engine$Listener$WithErrorsOnly;-><init>(Lnet/bytebuddy/build/Plugin$Engine$Listener;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public withTransformationsOnly()Lnet/bytebuddy/build/Plugin$Engine$Listener;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Listener$WithTransformationsOnly;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/build/Plugin$Engine$Listener$WithTransformationsOnly;-><init>(Lnet/bytebuddy/build/Plugin$Engine$Listener;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
