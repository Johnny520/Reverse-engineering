.class public abstract Lnet/bytebuddy/build/Plugin$Engine$AbstractBase;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/build/Plugin$Engine;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AbstractBase"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public apply(Ljava/io/File;Ljava/io/File;Ljava/util/List;)Lnet/bytebuddy/build/Plugin$Engine$Summary;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/io/File;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/build/Plugin$Factory;",
            ">;)",
            "Lnet/bytebuddy/build/Plugin$Engine$Summary;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Source$ForFolder;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lnet/bytebuddy/build/Plugin$Engine$Source$ForFolder;-><init>(Ljava/io/File;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Source$ForJarFile;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Lnet/bytebuddy/build/Plugin$Engine$Source$ForJarFile;-><init>(Ljava/io/File;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {p2}, Ljava/io/File;->isDirectory()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    new-instance p1, Lnet/bytebuddy/build/Plugin$Engine$Target$ForFolder;

    .line 25
    .line 26
    invoke-direct {p1, p2}, Lnet/bytebuddy/build/Plugin$Engine$Target$ForFolder;-><init>(Ljava/io/File;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    new-instance p1, Lnet/bytebuddy/build/Plugin$Engine$Target$ForJarFile;

    .line 31
    .line 32
    invoke-direct {p1, p2}, Lnet/bytebuddy/build/Plugin$Engine$Target$ForJarFile;-><init>(Ljava/io/File;)V

    .line 33
    .line 34
    .line 35
    :goto_1
    invoke-interface {p0, v0, p1, p3}, Lnet/bytebuddy/build/Plugin$Engine;->apply(Lnet/bytebuddy/build/Plugin$Engine$Source;Lnet/bytebuddy/build/Plugin$Engine$Target;Ljava/util/List;)Lnet/bytebuddy/build/Plugin$Engine$Summary;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public varargs apply(Ljava/io/File;Ljava/io/File;[Lnet/bytebuddy/build/Plugin$Factory;)Lnet/bytebuddy/build/Plugin$Engine$Summary;
    .locals 0

    .line 40
    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Lnet/bytebuddy/build/Plugin$Engine$AbstractBase;->apply(Ljava/io/File;Ljava/io/File;Ljava/util/List;)Lnet/bytebuddy/build/Plugin$Engine$Summary;

    move-result-object p0

    return-object p0
.end method

.method public varargs apply(Lnet/bytebuddy/build/Plugin$Engine$Source;Lnet/bytebuddy/build/Plugin$Engine$Target;[Lnet/bytebuddy/build/Plugin$Factory;)Lnet/bytebuddy/build/Plugin$Engine$Summary;
    .locals 0

    .line 41
    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-interface {p0, p1, p2, p3}, Lnet/bytebuddy/build/Plugin$Engine;->apply(Lnet/bytebuddy/build/Plugin$Engine$Source;Lnet/bytebuddy/build/Plugin$Engine$Target;Ljava/util/List;)Lnet/bytebuddy/build/Plugin$Engine$Summary;

    move-result-object p0

    return-object p0
.end method

.method public varargs withErrorHandlers([Lnet/bytebuddy/build/Plugin$Engine$ErrorHandler;)Lnet/bytebuddy/build/Plugin$Engine;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Lnet/bytebuddy/build/Plugin$Engine;->withErrorHandlers(Ljava/util/List;)Lnet/bytebuddy/build/Plugin$Engine;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public withParallelTransformation(I)Lnet/bytebuddy/build/Plugin$Engine;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-lt p1, v0, :cond_0

    .line 3
    .line 4
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation$WithThrowawayExecutorService$Factory;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation$WithThrowawayExecutorService$Factory;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p0, v0}, Lnet/bytebuddy/build/Plugin$Engine;->with(Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Factory;)Lnet/bytebuddy/build/Plugin$Engine;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "Number of threads must be positive: "

    .line 15
    .line 16
    invoke-static {p1, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method
