.class public Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForSerialTransformation;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/build/Plugin$Engine$Dispatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine$Dispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForSerialTransformation"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForSerialTransformation$Factory;
    }
.end annotation


# instance fields
.field private final failed:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;>;"
        }
    .end annotation
.end field

.field private final preprocessings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/concurrent/Callable<",
            "+",
            "Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable;",
            ">;>;"
        }
    .end annotation
.end field

.field private final sink:Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;

.field private final transformed:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end field

.field private final unresolved:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;Ljava/util/List;Ljava/util/Map;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;>;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForSerialTransformation;->sink:Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForSerialTransformation;->transformed:Ljava/util/List;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForSerialTransformation;->failed:Ljava/util/Map;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForSerialTransformation;->unresolved:Ljava/util/List;

    .line 11
    .line 12
    new-instance p1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForSerialTransformation;->preprocessings:Ljava/util/List;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public accept(Ljava/util/concurrent/Callable;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "+",
            "Ljava/util/concurrent/Callable<",
            "+",
            "Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable;",
            ">;>;Z)V"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/util/concurrent/Callable;

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable;

    .line 14
    .line 15
    iget-object p2, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForSerialTransformation;->sink:Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;

    .line 16
    .line 17
    iget-object v0, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForSerialTransformation;->transformed:Ljava/util/List;

    .line 18
    .line 19
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForSerialTransformation;->failed:Ljava/util/Map;

    .line 20
    .line 21
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForSerialTransformation;->unresolved:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {p1, p2, v0, v1, p0}, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable;->materialize(Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;Ljava/util/List;Ljava/util/Map;Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForSerialTransformation;->preprocessings:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catch_0
    move-exception p0

    .line 34
    instance-of p1, p0, Ljava/io/IOException;

    .line 35
    .line 36
    if-nez p1, :cond_2

    .line 37
    .line 38
    instance-of p1, p0, Ljava/lang/RuntimeException;

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    .line 47
    .line 48
    throw p0

    .line 49
    :cond_2
    check-cast p0, Ljava/io/IOException;

    .line 50
    .line 51
    throw p0
.end method

.method public close()V
    .locals 0

    .line 1
    return-void
.end method

.method public complete()V
    .locals 6

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForSerialTransformation;->preprocessings:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/util/concurrent/Callable;

    .line 18
    .line 19
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    :try_start_0
    invoke-interface {v1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable;

    .line 30
    .line 31
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForSerialTransformation;->sink:Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;

    .line 32
    .line 33
    iget-object v3, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForSerialTransformation;->transformed:Ljava/util/List;

    .line 34
    .line 35
    iget-object v4, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForSerialTransformation;->failed:Ljava/util/Map;

    .line 36
    .line 37
    iget-object v5, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForSerialTransformation;->unresolved:Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {v1, v2, v3, v4, v5}, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable;->materialize(Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;Ljava/util/List;Ljava/util/Map;Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception p0

    .line 44
    instance-of v0, p0, Ljava/io/IOException;

    .line 45
    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    instance-of v0, p0, Ljava/lang/RuntimeException;

    .line 49
    .line 50
    if-nez v0, :cond_0

    .line 51
    .line 52
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_0
    check-cast p0, Ljava/lang/RuntimeException;

    .line 57
    .line 58
    throw p0

    .line 59
    :cond_1
    check-cast p0, Ljava/io/IOException;

    .line 60
    .line 61
    throw p0

    .line 62
    :cond_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 67
    .line 68
    .line 69
    const-string p0, "Interrupted during plugin engine completion"

    .line 70
    .line 71
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :cond_3
    return-void
.end method
