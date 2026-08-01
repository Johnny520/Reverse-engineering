.class public abstract Lio/ktor/server/engine/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "io.ktor.server.engine.DefaultTransform"

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sput-object v0, Lio/ktor/server/engine/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪子哲兰世/飘花落叶言子楪世苏兰哲;

    .line 11
    .line 12
    return-void
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Ljava/nio/charset/Charset;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lio/ktor/server/engine/DefaultTransformKt$readText$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/server/engine/DefaultTransformKt$readText$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/server/engine/DefaultTransformKt$readText$1;->label:I

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
    iput v1, v0, Lio/ktor/server/engine/DefaultTransformKt$readText$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/server/engine/DefaultTransformKt$readText$1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lio/ktor/server/engine/DefaultTransformKt$readText$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/server/engine/DefaultTransformKt$readText$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/server/engine/DefaultTransformKt$readText$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lio/ktor/server/engine/DefaultTransformKt$readText$1;->L$0:Ljava/lang/Object;

    .line 37
    .line 38
    move-object p1, p0

    .line 39
    check-cast p1, Ljava/nio/charset/Charset;

    .line 40
    .line 41
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0

    .line 52
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput-object p1, v0, Lio/ktor/server/engine/DefaultTransformKt$readText$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    iput v3, v0, Lio/ktor/server/engine/DefaultTransformKt$readText$1;->label:I

    .line 58
    .line 59
    const-wide v2, 0x7fffffffffffffffL

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    invoke-static {p0, v2, v3, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世哲苏(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    if-ne p2, v1, :cond_3

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_3
    :goto_1
    check-cast p2, Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 72
    .line 73
    invoke-interface {p2}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏()Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-eqz p0, :cond_4

    .line 78
    .line 79
    const-string p0, ""

    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_4
    :try_start_0
    sget-object p0, Lkotlin/text/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/nio/charset/Charset;

    .line 83
    .line 84
    invoke-static {p1, p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-nez p0, :cond_6

    .line 89
    .line 90
    sget-object p0, Lkotlin/text/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:Ljava/nio/charset/Charset;

    .line 91
    .line 92
    invoke-static {p1, p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-eqz p0, :cond_5

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    new-instance p0, Ljava/io/InputStreamReader;

    .line 103
    .line 104
    invoke-static {p2}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)Lkotlinx/io/飘花落叶言子楪苏兰哲世;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-direct {p0, v0, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 109
    .line 110
    .line 111
    invoke-static {p0}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子世苏楪哲兰(Ljava/io/InputStreamReader;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    goto :goto_3

    .line 116
    :catchall_0
    move-exception p0

    .line 117
    goto :goto_4

    .line 118
    :cond_6
    :goto_2
    invoke-static {p2}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰哲世(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    :goto_3
    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    .line 123
    .line 124
    .line 125
    return-object p0

    .line 126
    :goto_4
    invoke-interface {p2}, Ljava/lang/AutoCloseable;->close()V

    .line 127
    .line 128
    .line 129
    throw p0
.end method
