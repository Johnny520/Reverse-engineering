.class final Lio/ktor/client/plugins/sse/SSEKt$SSE$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u82cf\u5b50\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        "request",
        "Lio/ktor/http/content/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u82cf\u5170;",
        "content",
        "<anonymous>",
        "(L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u82cf\u5b50\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;Lio/ktor/http/content/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u82cf\u5170;)Lio/ktor/http/content/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u82cf\u5170;"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.client.plugins.sse.SSEKt$SSE$2$1"
    f = "SSE.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $reconnectionTime:J

.field final synthetic $showCommentEvents:Z

.field final synthetic $showRetryEvents:Z

.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(JZZLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JZZ",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/client/plugins/sse/SSEKt$SSE$2$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-wide p1, p0, Lio/ktor/client/plugins/sse/SSEKt$SSE$2$1;->$reconnectionTime:J

    .line 2
    .line 3
    iput-boolean p3, p0, Lio/ktor/client/plugins/sse/SSEKt$SSE$2$1;->$showCommentEvents:Z

    .line 4
    .line 5
    iput-boolean p4, p0, Lio/ktor/client/plugins/sse/SSEKt$SSE$2$1;->$showRetryEvents:Z

    .line 6
    .line 7
    const/4 p1, 0x3

    .line 8
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 24
    check-cast p1, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;

    check-cast p2, Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;

    check-cast p3, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2, p3}, Lio/ktor/client/plugins/sse/SSEKt$SSE$2$1;->invoke(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u82cf\u5b50\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
            "Lio/ktor/http/content/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u82cf\u5170;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/http/content/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u82cf\u5170;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lio/ktor/client/plugins/sse/SSEKt$SSE$2$1;

    .line 2
    .line 3
    iget-wide v1, p0, Lio/ktor/client/plugins/sse/SSEKt$SSE$2$1;->$reconnectionTime:J

    .line 4
    .line 5
    iget-boolean v3, p0, Lio/ktor/client/plugins/sse/SSEKt$SSE$2$1;->$showCommentEvents:Z

    .line 6
    .line 7
    iget-boolean v4, p0, Lio/ktor/client/plugins/sse/SSEKt$SSE$2$1;->$showRetryEvents:Z

    .line 8
    .line 9
    move-object v5, p3

    .line 10
    invoke-direct/range {v0 .. v5}, Lio/ktor/client/plugins/sse/SSEKt$SSE$2$1;-><init>(JZZLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, Lio/ktor/client/plugins/sse/SSEKt$SSE$2$1;->L$0:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p2, v0, Lio/ktor/client/plugins/sse/SSEKt$SSE$2$1;->L$1:Ljava/lang/Object;

    .line 16
    .line 17
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Lio/ktor/client/plugins/sse/SSEKt$SSE$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/client/plugins/sse/SSEKt$SSE$2$1;->label:I

    .line 4
    .line 5
    if-nez v0, :cond_5

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lio/ktor/client/plugins/sse/SSEKt$SSE$2$1;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;

    .line 13
    .line 14
    iget-object v0, p0, Lio/ktor/client/plugins/sse/SSEKt$SSE$2$1;->L$1:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v6, v0

    .line 17
    check-cast v6, Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;

    .line 18
    .line 19
    sget-object v0, Lio/ktor/client/plugins/sse/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 20
    .line 21
    sget-object v1, Lio/ktor/client/plugins/sse/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;

    .line 22
    .line 23
    iget-object v1, p1, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Lio/ktor/util/飘花落叶言子楪世兰哲苏;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Lio/ktor/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lio/ktor/util/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-static {v0, v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    return-object v6

    .line 38
    :cond_0
    sget-object v0, Lio/ktor/client/plugins/sse/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;

    .line 39
    .line 40
    new-instance v2, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v3, "Sending SSE request "

    .line 43
    .line 44
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object v3, p1, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-interface {v0, v2}, L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;->trace(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object v0, Lio/ktor/client/plugins/sse/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Lio/ktor/client/plugins/sse/飘花落叶言子楪世哲苏兰;

    .line 60
    .line 61
    sget-object v2, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 62
    .line 63
    invoke-virtual {p1, v0, v2}, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Lio/ktor/client/engine/飘花落叶言子楪世苏兰哲;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    sget-object v0, Lio/ktor/client/plugins/sse/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 67
    .line 68
    invoke-virtual {v1, v0}, Lio/ktor/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lio/ktor/util/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Lkotlin/time/飘花落叶言子楪世苏哲兰;

    .line 73
    .line 74
    sget-object v2, Lio/ktor/client/plugins/sse/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 75
    .line 76
    invoke-virtual {v1, v2}, Lio/ktor/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lio/ktor/util/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, Ljava/lang/Boolean;

    .line 81
    .line 82
    sget-object v3, Lio/ktor/client/plugins/sse/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 83
    .line 84
    invoke-virtual {v1, v3}, Lio/ktor/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lio/ktor/util/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    check-cast v3, Ljava/lang/Boolean;

    .line 89
    .line 90
    sget-object v4, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 91
    .line 92
    new-instance v5, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪苏世哲兰;

    .line 93
    .line 94
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v4, v5}, Lio/ktor/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Lio/ktor/util/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v6}, Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲()L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    if-eqz v1, :cond_1

    .line 105
    .line 106
    iget-object p1, p1, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰苏世哲;

    .line 107
    .line 108
    sget-object v4, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:[Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v1}, Landroidx/appcompat/app/飘花落叶言子世苏哲兰楪;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v1}, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子哲世苏楪兰(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    const-string v4, "Content-Type"

    .line 124
    .line 125
    invoke-virtual {p1, v4}, Landroidx/compose/runtime/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲楪世苏兰(Ljava/lang/String;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 130
    .line 131
    .line 132
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    :cond_1
    new-instance v1, Lio/ktor/client/plugins/sse/飘花落叶言子楪世哲兰苏;

    .line 136
    .line 137
    if-eqz v0, :cond_2

    .line 138
    .line 139
    iget-wide v4, v0, Lkotlin/time/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:J

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_2
    iget-wide v4, p0, Lio/ktor/client/plugins/sse/SSEKt$SSE$2$1;->$reconnectionTime:J

    .line 143
    .line 144
    :goto_0
    if-eqz v2, :cond_3

    .line 145
    .line 146
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    goto :goto_1

    .line 151
    :cond_3
    iget-boolean p1, p0, Lio/ktor/client/plugins/sse/SSEKt$SSE$2$1;->$showCommentEvents:Z

    .line 152
    .line 153
    :goto_1
    if-eqz v3, :cond_4

    .line 154
    .line 155
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 156
    .line 157
    .line 158
    move-result p0

    .line 159
    :goto_2
    move-wide v2, v4

    .line 160
    move v5, p0

    .line 161
    move v4, p1

    .line 162
    goto :goto_3

    .line 163
    :cond_4
    iget-boolean p0, p0, Lio/ktor/client/plugins/sse/SSEKt$SSE$2$1;->$showRetryEvents:Z

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :goto_3
    invoke-direct/range {v1 .. v6}, Lio/ktor/client/plugins/sse/飘花落叶言子楪世哲兰苏;-><init>(JZZLio/ktor/http/content/飘花落叶言子楪哲世苏兰;)V

    .line 167
    .line 168
    .line 169
    return-object v1

    .line 170
    :cond_5
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 171
    .line 172
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    const/4 p0, 0x0

    .line 176
    return-object p0
.end method
