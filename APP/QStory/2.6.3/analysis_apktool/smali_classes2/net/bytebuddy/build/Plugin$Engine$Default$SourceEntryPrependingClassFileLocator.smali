.class public Lnet/bytebuddy/build/Plugin$Engine$Default$SourceEntryPrependingClassFileLocator;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/dynamic/ClassFileLocator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SourceEntryPrependingClassFileLocator"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final delegate:Lnet/bytebuddy/dynamic/ClassFileLocator;

.field private final element:Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

.field private final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lnet/bytebuddy/build/Plugin$Engine$Source$Element;Lnet/bytebuddy/dynamic/ClassFileLocator;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$SourceEntryPrependingClassFileLocator;->name:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$SourceEntryPrependingClassFileLocator;->element:Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$SourceEntryPrependingClassFileLocator;->delegate:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$SourceEntryPrependingClassFileLocator;->delegate:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 4
    .line 5
    .line 6
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
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$SourceEntryPrependingClassFileLocator;->name:Ljava/lang/String;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/build/Plugin$Engine$Default$SourceEntryPrependingClassFileLocator;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/build/Plugin$Engine$Default$SourceEntryPrependingClassFileLocator;->name:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$SourceEntryPrependingClassFileLocator;->element:Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/build/Plugin$Engine$Default$SourceEntryPrependingClassFileLocator;->element:Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$SourceEntryPrependingClassFileLocator;->delegate:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 45
    .line 46
    iget-object p1, p1, Lnet/bytebuddy/build/Plugin$Engine$Default$SourceEntryPrependingClassFileLocator;->delegate:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

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
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$SourceEntryPrependingClassFileLocator;->name:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$SourceEntryPrependingClassFileLocator;->element:Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    add-int/2addr v2, v0

    .line 25
    mul-int/2addr v2, v1

    .line 26
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$SourceEntryPrependingClassFileLocator;->delegate:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    add-int/2addr p0, v2

    .line 33
    return p0
.end method

.method public locate(Ljava/lang/String;)Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$SourceEntryPrependingClassFileLocator;->name:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$SourceEntryPrependingClassFileLocator;->element:Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

    .line 10
    .line 11
    invoke-interface {p0}, Lnet/bytebuddy/build/Plugin$Engine$Source$Element;->getInputStream()Ljava/io/InputStream;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :try_start_0
    new-instance p1, Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution$Explicit;

    .line 16
    .line 17
    sget-object v0, Lnet/bytebuddy/utility/StreamDrainer;->DEFAULT:Lnet/bytebuddy/utility/StreamDrainer;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Lnet/bytebuddy/utility/StreamDrainer;->drain(Ljava/io/InputStream;)[B

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-direct {p1, v0}, Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution$Explicit;-><init>([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Default$SourceEntryPrependingClassFileLocator;->delegate:Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 36
    .line 37
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/ClassFileLocator;->locate(Ljava/lang/String;)Lnet/bytebuddy/dynamic/ClassFileLocator$Resolution;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method
