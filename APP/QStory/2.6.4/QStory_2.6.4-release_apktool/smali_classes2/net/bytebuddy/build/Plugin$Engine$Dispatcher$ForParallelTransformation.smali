.class public Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/build/Plugin$Engine$Dispatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine$Dispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForParallelTransformation"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation$EagerWork;,
        Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation$Factory;,
        Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation$WithThrowawayExecutorService;
    }
.end annotation


# instance fields
.field private deferred:I

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

.field private final futures:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/util/concurrent/Future<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final materializers:Ljava/util/concurrent/CompletionService;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CompletionService<",
            "Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable;",
            ">;"
        }
    .end annotation
.end field

.field private final preprocessings:Ljava/util/concurrent/CompletionService;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CompletionService<",
            "Ljava/util/concurrent/Callable<",
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
.method public constructor <init>(Ljava/util/concurrent/Executor;Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;Ljava/util/List;Ljava/util/Map;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
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
    iput-object p2, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->sink:Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;

    .line 5
    .line 6
    iput-object p3, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->transformed:Ljava/util/List;

    .line 7
    .line 8
    iput-object p4, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->failed:Ljava/util/Map;

    .line 9
    .line 10
    iput-object p5, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->unresolved:Ljava/util/List;

    .line 11
    .line 12
    new-instance p2, Ljava/util/concurrent/ExecutorCompletionService;

    .line 13
    .line 14
    invoke-direct {p2, p1}, Ljava/util/concurrent/ExecutorCompletionService;-><init>(Ljava/util/concurrent/Executor;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->preprocessings:Ljava/util/concurrent/CompletionService;

    .line 18
    .line 19
    new-instance p2, Ljava/util/concurrent/ExecutorCompletionService;

    .line 20
    .line 21
    invoke-direct {p2, p1}, Ljava/util/concurrent/ExecutorCompletionService;-><init>(Ljava/util/concurrent/Executor;)V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->materializers:Ljava/util/concurrent/CompletionService;

    .line 25
    .line 26
    new-instance p1, Ljava/util/HashSet;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->futures:Ljava/util/Set;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public accept(Ljava/util/concurrent/Callable;Z)V
    .locals 1
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
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->futures:Ljava/util/Set;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->materializers:Ljava/util/concurrent/CompletionService;

    .line 6
    .line 7
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation$EagerWork;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation$EagerWork;-><init>(Ljava/util/concurrent/Callable;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0, v0}, Ljava/util/concurrent/CompletionService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget p2, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->deferred:I

    .line 21
    .line 22
    add-int/lit8 p2, p2, 0x1

    .line 23
    .line 24
    iput p2, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->deferred:I

    .line 25
    .line 26
    iget-object p2, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->futures:Ljava/util/Set;

    .line 27
    .line 28
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->preprocessings:Ljava/util/concurrent/CompletionService;

    .line 29
    .line 30
    invoke-interface {p0, p1}, Ljava/util/concurrent/CompletionService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public close()V
    .locals 2

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->futures:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/util/concurrent/Future;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void
.end method

.method public complete()V
    .locals 5

    .line 1
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->deferred:I

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 6
    .line 7
    .line 8
    :goto_0
    iget v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->deferred:I

    .line 9
    .line 10
    add-int/lit8 v2, v1, -0x1

    .line 11
    .line 12
    iput v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->deferred:I

    .line 13
    .line 14
    if-lez v1, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->preprocessings:Ljava/util/concurrent/CompletionService;

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/concurrent/CompletionService;->take()Ljava/util/concurrent/Future;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->futures:Ljava/util/Set;

    .line 23
    .line 24
    invoke-interface {v2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Ljava/util/concurrent/Callable;

    .line 50
    .line 51
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->futures:Ljava/util/Set;

    .line 52
    .line 53
    iget-object v3, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->materializers:Ljava/util/concurrent/CompletionService;

    .line 54
    .line 55
    invoke-interface {v3, v1}, Ljava/util/concurrent/CompletionService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    :goto_2
    iget-object v0, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->futures:Ljava/util/Set;

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_2

    .line 70
    .line 71
    iget-object v0, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->materializers:Ljava/util/concurrent/CompletionService;

    .line 72
    .line 73
    invoke-interface {v0}, Ljava/util/concurrent/CompletionService;->take()Ljava/util/concurrent/Future;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->futures:Ljava/util/Set;

    .line 78
    .line 79
    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable;

    .line 87
    .line 88
    iget-object v1, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->sink:Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;

    .line 89
    .line 90
    iget-object v2, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->transformed:Ljava/util/List;

    .line 91
    .line 92
    iget-object v3, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->failed:Ljava/util/Map;

    .line 93
    .line 94
    iget-object v4, p0, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$ForParallelTransformation;->unresolved:Ljava/util/List;

    .line 95
    .line 96
    invoke-interface {v0, v1, v2, v3, v4}, Lnet/bytebuddy/build/Plugin$Engine$Dispatcher$Materializable;->materialize(Lnet/bytebuddy/build/Plugin$Engine$Target$Sink;Ljava/util/List;Ljava/util/Map;Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_2
    return-void

    .line 101
    :catch_0
    move-exception p0

    .line 102
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    instance-of v0, p0, Ljava/io/IOException;

    .line 107
    .line 108
    if-nez v0, :cond_5

    .line 109
    .line 110
    instance-of v0, p0, Ljava/lang/RuntimeException;

    .line 111
    .line 112
    if-nez v0, :cond_4

    .line 113
    .line 114
    instance-of v0, p0, Ljava/lang/Error;

    .line 115
    .line 116
    if-nez v0, :cond_3

    .line 117
    .line 118
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_3
    check-cast p0, Ljava/lang/Error;

    .line 123
    .line 124
    throw p0

    .line 125
    :cond_4
    check-cast p0, Ljava/lang/RuntimeException;

    .line 126
    .line 127
    throw p0

    .line 128
    :cond_5
    check-cast p0, Ljava/io/IOException;

    .line 129
    .line 130
    throw p0

    .line 131
    :catch_1
    move-exception p0

    .line 132
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 137
    .line 138
    .line 139
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    return-void
.end method
