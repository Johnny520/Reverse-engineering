.class public abstract Lio/ktor/server/cio/backend/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Lkotlinx/io/飘花落叶言子楪世苏哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lio/ktor/http/cio/飘花落叶言子楪哲兰苏世;

    .line 2
    .line 3
    invoke-direct {v0}, Lio/ktor/http/cio/飘花落叶言子楪哲兰苏世;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪兰哲世苏:L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪哲苏兰;

    .line 7
    .line 8
    iget v1, v1, L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 9
    .line 10
    const-string v2, "Bad Request"

    .line 11
    .line 12
    const-string v3, "HTTP/1.0"

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2, v3}, Lio/ktor/http/cio/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰(ILjava/lang/CharSequence;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v1, "Connection"

    .line 18
    .line 19
    const-string v2, "close"

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Lio/ktor/http/cio/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lio/ktor/http/cio/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()V

    .line 25
    .line 26
    .line 27
    iget-object v0, v0, Lio/ktor/http/cio/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 28
    .line 29
    sput-object v0, Lio/ktor/server/cio/backend/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 30
    .line 31
    return-void
.end method

.method public static final 飘花落叶言子楪世哲苏兰(L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏兰哲;Lio/ktor/http/cio/飘花落叶言子楪苏世哲兰;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    sget-object v1, L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世兰哲苏:L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏兰哲;

    .line 8
    .line 9
    invoke-virtual {p0, v1}, L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏兰哲;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    return v0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    if-nez p1, :cond_2

    .line 18
    .line 19
    sget-object p1, L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世兰苏哲:L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏兰哲;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏兰哲;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-nez p0, :cond_1

    .line 26
    .line 27
    return v0

    .line 28
    :cond_1
    return v1

    .line 29
    :cond_2
    iget-boolean p0, p1, Lio/ktor/http/cio/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Z

    .line 30
    .line 31
    if-eqz p0, :cond_3

    .line 32
    .line 33
    return v1

    .line 34
    :cond_3
    iget-boolean p0, p1, Lio/ktor/http/cio/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Z

    .line 35
    .line 36
    if-eqz p0, :cond_4

    .line 37
    .line 38
    return v0

    .line 39
    :cond_4
    return v1
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lio/ktor/server/cio/backend/ServerPipelineKt$respondBadRequest$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/server/cio/backend/ServerPipelineKt$respondBadRequest$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$respondBadRequest$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$respondBadRequest$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/server/cio/backend/ServerPipelineKt$respondBadRequest$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lio/ktor/server/cio/backend/ServerPipelineKt$respondBadRequest$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$respondBadRequest$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$respondBadRequest$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$respondBadRequest$1;->L$1:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 40
    .line 41
    iget-object v0, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$respondBadRequest$1;->L$0:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;

    .line 44
    .line 45
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v3

    .line 55
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    new-instance p1, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    invoke-direct {p1, v2}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;-><init>(Z)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p0, p1}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    instance-of v2, v2, Lkotlinx/coroutines/channels/飘花落叶言子楪苏兰哲世;

    .line 69
    .line 70
    if-nez v2, :cond_4

    .line 71
    .line 72
    sget-object v2, Lio/ktor/server/cio/backend/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 73
    .line 74
    invoke-static {v2}, L飘花落叶言世子苏楪哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    iput-object p0, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$respondBadRequest$1;->L$0:Ljava/lang/Object;

    .line 79
    .line 80
    iput-object p1, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$respondBadRequest$1;->L$1:Ljava/lang/Object;

    .line 81
    .line 82
    iput v4, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$respondBadRequest$1;->label:I

    .line 83
    .line 84
    invoke-static {p1, v2, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Lkotlinx/io/飘花落叶言子楪苏兰世哲;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    if-ne v0, v1, :cond_3

    .line 89
    .line 90
    return-object v1

    .line 91
    :cond_3
    move-object v0, p0

    .line 92
    move-object p0, p1

    .line 93
    :goto_1
    invoke-virtual {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏()V

    .line 94
    .line 95
    .line 96
    move-object p0, v0

    .line 97
    :cond_4
    invoke-interface {p0, v3}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Throwable;)Z

    .line 98
    .line 99
    .line 100
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 101
    .line 102
    return-object p0
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;JLio/ktor/server/cio/backend/飘花落叶言子楪世哲苏兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p4, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eqz v2, :cond_5

    .line 36
    .line 37
    if-eq v2, v6, :cond_4

    .line 38
    .line 39
    if-eq v2, v5, :cond_3

    .line 40
    .line 41
    if-ne v2, v4, :cond_2

    .line 42
    .line 43
    iget-wide p0, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->J$0:J

    .line 44
    .line 45
    iget-object p2, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->L$2:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p2, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 48
    .line 49
    iget-object p3, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->L$1:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p3, Lio/ktor/server/cio/backend/飘花落叶言子楪世哲苏兰;

    .line 52
    .line 53
    iget-object v2, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->L$0:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v2, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 56
    .line 57
    :try_start_0
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    :cond_1
    move-wide p1, p0

    .line 61
    move-object p0, v2

    .line 62
    goto :goto_1

    .line 63
    :catchall_0
    move-exception p4

    .line 64
    move-object v9, p3

    .line 65
    move-object p3, p2

    .line 66
    move-wide p1, p0

    .line 67
    move-object p0, v2

    .line 68
    move-object v2, v0

    .line 69
    move-object v0, p4

    .line 70
    move-object p4, v9

    .line 71
    goto/16 :goto_5

    .line 72
    .line 73
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 74
    .line 75
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    return-object v3

    .line 79
    :cond_3
    iget-wide p0, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->J$0:J

    .line 80
    .line 81
    iget-object p2, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->L$2:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p2, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 84
    .line 85
    iget-object p3, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->L$1:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p3, Lio/ktor/server/cio/backend/飘花落叶言子楪世哲苏兰;

    .line 88
    .line 89
    iget-object v2, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->L$0:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v2, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 92
    .line 93
    :try_start_1
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_4
    iget-wide p0, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->J$0:J

    .line 98
    .line 99
    iget-object p2, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->L$1:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p2, Lio/ktor/server/cio/backend/飘花落叶言子楪世哲苏兰;

    .line 102
    .line 103
    iget-object p3, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->L$0:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p3, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 106
    .line 107
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    move-object v2, p3

    .line 111
    move-object p3, p2

    .line 112
    goto :goto_2

    .line 113
    :cond_5
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :goto_1
    new-instance p4, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$child$1;

    .line 117
    .line 118
    invoke-direct {p4, p0, v3}, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$child$1;-><init>(Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 119
    .line 120
    .line 121
    iput-object p0, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->L$0:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object p3, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->L$1:Ljava/lang/Object;

    .line 124
    .line 125
    iput-object v3, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->L$2:Ljava/lang/Object;

    .line 126
    .line 127
    iput-wide p1, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->J$0:J

    .line 128
    .line 129
    iput v6, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->label:I

    .line 130
    .line 131
    invoke-static {p1, p2}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲楪苏兰(J)J

    .line 132
    .line 133
    .line 134
    move-result-wide v7

    .line 135
    invoke-static {v7, v8, p4, v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲兰楪苏(JL飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p4

    .line 139
    if-ne p4, v1, :cond_6

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_6
    move-object v2, p0

    .line 143
    move-wide p0, p1

    .line 144
    :goto_2
    move-object p2, p4

    .line 145
    check-cast p2, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 146
    .line 147
    if-nez p2, :cond_7

    .line 148
    .line 149
    sget-object v1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_7
    :try_start_2
    iget-object p4, p3, Lio/ktor/server/cio/backend/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 153
    .line 154
    iput-object v2, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->L$0:Ljava/lang/Object;

    .line 155
    .line 156
    iput-object p3, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->L$1:Ljava/lang/Object;

    .line 157
    .line 158
    iput-object p2, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->L$2:Ljava/lang/Object;

    .line 159
    .line 160
    iput-wide p0, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->J$0:J

    .line 161
    .line 162
    iput v5, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->label:I

    .line 163
    .line 164
    invoke-static {p2, p4, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰苏哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p4

    .line 168
    if-ne p4, v1, :cond_8

    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_8
    :goto_3
    iget-object p4, p3, Lio/ktor/server/cio/backend/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 172
    .line 173
    iput-object v2, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->L$0:Ljava/lang/Object;

    .line 174
    .line 175
    iput-object p3, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->L$1:Ljava/lang/Object;

    .line 176
    .line 177
    iput-object p2, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->L$2:Ljava/lang/Object;

    .line 178
    .line 179
    iput-wide p0, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->J$0:J

    .line 180
    .line 181
    iput v4, v0, Lio/ktor/server/cio/backend/ServerPipelineKt$pipelineWriterLoop$1;->label:I

    .line 182
    .line 183
    invoke-virtual {p4, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 187
    if-ne p2, v1, :cond_1

    .line 188
    .line 189
    :goto_4
    return-object v1

    .line 190
    :goto_5
    instance-of v7, p3, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 191
    .line 192
    if-eqz v7, :cond_9

    .line 193
    .line 194
    check-cast p3, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 195
    .line 196
    invoke-static {p3, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/lang/Throwable;)V

    .line 197
    .line 198
    .line 199
    :cond_9
    move-object p3, p4

    .line 200
    move-object v0, v2

    .line 201
    goto :goto_1
.end method
