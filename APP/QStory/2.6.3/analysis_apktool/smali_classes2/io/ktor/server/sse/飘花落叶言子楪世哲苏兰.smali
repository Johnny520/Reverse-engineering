.class public final Lio/ktor/server/sse/飘花落叶言子楪世哲苏兰;
.super Lio/ktor/http/content/飘花落叶言子楪苏兰哲世;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;

.field public final 飘花落叶言子楪世哲苏兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

.field public final 飘花落叶言子楪世苏兰哲:Lio/ktor/server/routing/飘花落叶言子楪哲兰苏世;


# direct methods
.method public constructor <init>(Lio/ktor/server/routing/飘花落叶言子楪哲兰苏世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lio/ktor/server/sse/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Lio/ktor/server/routing/飘花落叶言子楪哲兰苏世;

    .line 8
    .line 9
    iput-object p2, p0, Lio/ktor/server/sse/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 10
    .line 11
    sget-object p1, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;

    .line 12
    .line 13
    iput-object p1, p0, Lio/ktor/server/sse/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "SSEServerContent"

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/server/sse/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lio/ktor/server/sse/SSEServerContent$writeTo$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/server/sse/SSEServerContent$writeTo$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/server/sse/SSEServerContent$writeTo$1;->label:I

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
    iput v1, v0, Lio/ktor/server/sse/SSEServerContent$writeTo$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/server/sse/SSEServerContent$writeTo$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lio/ktor/server/sse/SSEServerContent$writeTo$1;-><init>(Lio/ktor/server/sse/飘花落叶言子楪世哲苏兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/server/sse/SSEServerContent$writeTo$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/server/sse/SSEServerContent$writeTo$1;->label:I

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
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v6, :cond_3

    .line 38
    .line 39
    if-eq v2, v5, :cond_2

    .line 40
    .line 41
    if-eq v2, v4, :cond_1

    .line 42
    .line 43
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_1
    iget-object p0, v0, Lio/ktor/server/sse/SSEServerContent$writeTo$1;->L$0:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p0, Ljava/lang/Throwable;

    .line 52
    .line 53
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_5

    .line 57
    .line 58
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    iget-object p0, v0, Lio/ktor/server/sse/SSEServerContent$writeTo$1;->L$0:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 65
    .line 66
    :try_start_0
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :catchall_0
    move-exception p1

    .line 71
    move-object p2, p0

    .line 72
    move-object p0, p1

    .line 73
    goto :goto_3

    .line 74
    :cond_4
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    sget-object p2, Lio/ktor/server/sse/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;

    .line 78
    .line 79
    new-instance v2, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const-string v7, "Starting sse session for "

    .line 82
    .line 83
    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iget-object v7, p0, Lio/ktor/server/sse/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Lio/ktor/server/routing/飘花落叶言子楪哲兰苏世;

    .line 87
    .line 88
    invoke-virtual {v7}, Lio/ktor/server/routing/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲()Lio/ktor/server/request/飘花落叶言子楪世哲苏兰;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    invoke-static {v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子世楪兰哲苏(Lio/ktor/server/request/飘花落叶言子楪世哲苏兰;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-interface {p2, v2}, L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;->trace(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    new-instance p2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 107
    .line 108
    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 109
    .line 110
    .line 111
    :try_start_1
    new-instance v2, Lio/ktor/server/sse/SSEServerContent$writeTo$2;

    .line 112
    .line 113
    invoke-direct {v2, p2, p1, p0, v3}, Lio/ktor/server/sse/SSEServerContent$writeTo$2;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Lio/ktor/server/sse/飘花落叶言子楪世哲苏兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 114
    .line 115
    .line 116
    iput-object p2, v0, Lio/ktor/server/sse/SSEServerContent$writeTo$1;->L$0:Ljava/lang/Object;

    .line 117
    .line 118
    iput v6, v0, Lio/ktor/server/sse/SSEServerContent$writeTo$1;->label:I

    .line 119
    .line 120
    invoke-static {v2, v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏兰哲世(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 124
    if-ne p0, v1, :cond_5

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_5
    move-object v8, p2

    .line 128
    move-object p2, p0

    .line 129
    move-object p0, v8

    .line 130
    :goto_1
    :try_start_2
    check-cast p2, Lkotlin/飘花落叶言子楪兰苏哲世;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 131
    .line 132
    iget-object p0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast p0, Lio/ktor/server/sse/飘花落叶言子楪世哲兰苏;

    .line 135
    .line 136
    if-eqz p0, :cond_6

    .line 137
    .line 138
    iput-object v3, v0, Lio/ktor/server/sse/SSEServerContent$writeTo$1;->L$0:Ljava/lang/Object;

    .line 139
    .line 140
    iput v5, v0, Lio/ktor/server/sse/SSEServerContent$writeTo$1;->label:I

    .line 141
    .line 142
    check-cast p0, Lio/ktor/server/sse/飘花落叶言子楪世苏哲兰;

    .line 143
    .line 144
    invoke-virtual {p0, v0}, Lio/ktor/server/sse/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    if-ne p0, v1, :cond_6

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_6
    :goto_2
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 152
    .line 153
    return-object p0

    .line 154
    :catchall_1
    move-exception p0

    .line 155
    :goto_3
    iget-object p1, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p1, Lio/ktor/server/sse/飘花落叶言子楪世哲兰苏;

    .line 158
    .line 159
    if-eqz p1, :cond_7

    .line 160
    .line 161
    iput-object p0, v0, Lio/ktor/server/sse/SSEServerContent$writeTo$1;->L$0:Ljava/lang/Object;

    .line 162
    .line 163
    iput v4, v0, Lio/ktor/server/sse/SSEServerContent$writeTo$1;->label:I

    .line 164
    .line 165
    check-cast p1, Lio/ktor/server/sse/飘花落叶言子楪世苏哲兰;

    .line 166
    .line 167
    invoke-virtual {p1, v0}, Lio/ktor/server/sse/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    if-ne p1, v1, :cond_7

    .line 172
    .line 173
    :goto_4
    return-object v1

    .line 174
    :cond_7
    :goto_5
    throw p0
.end method
