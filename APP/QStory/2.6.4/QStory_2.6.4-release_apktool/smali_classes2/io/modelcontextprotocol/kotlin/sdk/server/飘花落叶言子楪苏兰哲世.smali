.class public abstract Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public static final 飘花落叶言子楪世苏哲兰(Lio/ktor/server/websocket/飘花落叶言子楪世兰苏哲;Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    instance-of v1, v0, Lio/modelcontextprotocol/kotlin/sdk/server/WebSocketMcpKtorServerExtensionsKt$createMcpServer$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lio/modelcontextprotocol/kotlin/sdk/server/WebSocketMcpKtorServerExtensionsKt$createMcpServer$1;

    .line 9
    .line 10
    iget v2, v1, Lio/modelcontextprotocol/kotlin/sdk/server/WebSocketMcpKtorServerExtensionsKt$createMcpServer$1;->label:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lio/modelcontextprotocol/kotlin/sdk/server/WebSocketMcpKtorServerExtensionsKt$createMcpServer$1;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lio/modelcontextprotocol/kotlin/sdk/server/WebSocketMcpKtorServerExtensionsKt$createMcpServer$1;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lio/modelcontextprotocol/kotlin/sdk/server/WebSocketMcpKtorServerExtensionsKt$createMcpServer$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Lio/modelcontextprotocol/kotlin/sdk/server/WebSocketMcpKtorServerExtensionsKt$createMcpServer$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 30
    .line 31
    iget v3, v1, Lio/modelcontextprotocol/kotlin/sdk/server/WebSocketMcpKtorServerExtensionsKt$createMcpServer$1;->label:I

    .line 32
    .line 33
    sget-object v4, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x1

    .line 37
    const/4 v7, 0x2

    .line 38
    const/4 v8, 0x0

    .line 39
    if-eqz v3, :cond_4

    .line 40
    .line 41
    if-eq v3, v6, :cond_3

    .line 42
    .line 43
    if-eq v3, v7, :cond_2

    .line 44
    .line 45
    if-ne v3, v5, :cond_1

    .line 46
    .line 47
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_6

    .line 51
    .line 52
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v8

    .line 58
    :cond_2
    iget-object v3, v1, Lio/modelcontextprotocol/kotlin/sdk/server/WebSocketMcpKtorServerExtensionsKt$createMcpServer$1;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v3, Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪苏世哲兰;

    .line 61
    .line 62
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    iget-object v3, v1, Lio/modelcontextprotocol/kotlin/sdk/server/WebSocketMcpKtorServerExtensionsKt$createMcpServer$1;->L$1:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v3, Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪苏世哲兰;

    .line 69
    .line 70
    iget-object v6, v1, Lio/modelcontextprotocol/kotlin/sdk/server/WebSocketMcpKtorServerExtensionsKt$createMcpServer$1;->L$0:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v6, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 73
    .line 74
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    new-instance v0, Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪哲世苏兰;

    .line 82
    .line 83
    move-object/from16 v3, p0

    .line 84
    .line 85
    invoke-direct {v0, v3}, Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪哲世苏兰;-><init>(Lio/ktor/server/websocket/飘花落叶言子楪世兰苏哲;)V

    .line 86
    .line 87
    .line 88
    new-instance v3, Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪苏世哲兰;

    .line 89
    .line 90
    new-instance v9, L飘花落叶言世子苏哲楪兰/飘花落叶言子苏哲兰楪世;

    .line 91
    .line 92
    invoke-direct {v9}, L飘花落叶言世子苏哲楪兰/飘花落叶言子苏哲兰楪世;-><init>()V

    .line 93
    .line 94
    .line 95
    if-nez p1, :cond_5

    .line 96
    .line 97
    new-instance v10, Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪苏哲世兰;

    .line 98
    .line 99
    new-instance v11, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲世子苏;

    .line 100
    .line 101
    new-instance v12, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰苏子哲世;

    .line 102
    .line 103
    invoke-direct {v12}, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰苏子哲世;-><init>()V

    .line 104
    .line 105
    .line 106
    new-instance v13, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰苏哲子世;

    .line 107
    .line 108
    invoke-direct {v13}, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰苏哲子世;-><init>()V

    .line 109
    .line 110
    .line 111
    new-instance v14, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲子苏世;

    .line 112
    .line 113
    invoke-direct {v14}, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲子苏世;-><init>()V

    .line 114
    .line 115
    .line 116
    const/4 v15, 0x7

    .line 117
    invoke-direct {v11, v12, v13, v14, v15}, L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲世子苏;-><init>(L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰苏子哲世;L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰苏哲子世;L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲子苏世;I)V

    .line 118
    .line 119
    .line 120
    invoke-direct {v10, v11}, Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪苏哲世兰;-><init>(L飘花落叶言世子苏哲楪兰/飘花落叶言楪兰哲世子苏;)V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_5
    move-object/from16 v10, p1

    .line 125
    .line 126
    :goto_1
    invoke-direct {v3, v9, v10}, Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪苏世哲兰;-><init>(L飘花落叶言世子苏哲楪兰/飘花落叶言子苏哲兰楪世;Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪苏哲世兰;)V

    .line 127
    .line 128
    .line 129
    move-object/from16 v9, p2

    .line 130
    .line 131
    iput-object v9, v1, Lio/modelcontextprotocol/kotlin/sdk/server/WebSocketMcpKtorServerExtensionsKt$createMcpServer$1;->L$0:Ljava/lang/Object;

    .line 132
    .line 133
    iput-object v3, v1, Lio/modelcontextprotocol/kotlin/sdk/server/WebSocketMcpKtorServerExtensionsKt$createMcpServer$1;->L$1:Ljava/lang/Object;

    .line 134
    .line 135
    iput v6, v1, Lio/modelcontextprotocol/kotlin/sdk/server/WebSocketMcpKtorServerExtensionsKt$createMcpServer$1;->label:I

    .line 136
    .line 137
    invoke-virtual {v3, v0, v1}, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏兰世哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    if-ne v0, v2, :cond_6

    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_6
    move-object v6, v9

    .line 145
    :goto_2
    iput-object v3, v1, Lio/modelcontextprotocol/kotlin/sdk/server/WebSocketMcpKtorServerExtensionsKt$createMcpServer$1;->L$0:Ljava/lang/Object;

    .line 146
    .line 147
    iput-object v8, v1, Lio/modelcontextprotocol/kotlin/sdk/server/WebSocketMcpKtorServerExtensionsKt$createMcpServer$1;->L$1:Ljava/lang/Object;

    .line 148
    .line 149
    iput v7, v1, Lio/modelcontextprotocol/kotlin/sdk/server/WebSocketMcpKtorServerExtensionsKt$createMcpServer$1;->label:I

    .line 150
    .line 151
    invoke-interface {v6, v3, v1}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    if-ne v0, v2, :cond_7

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_7
    :goto_3
    iput-object v8, v1, Lio/modelcontextprotocol/kotlin/sdk/server/WebSocketMcpKtorServerExtensionsKt$createMcpServer$1;->L$0:Ljava/lang/Object;

    .line 159
    .line 160
    iput v5, v1, Lio/modelcontextprotocol/kotlin/sdk/server/WebSocketMcpKtorServerExtensionsKt$createMcpServer$1;->label:I

    .line 161
    .line 162
    iget-object v0, v3, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏兰世哲;

    .line 163
    .line 164
    if-eqz v0, :cond_8

    .line 165
    .line 166
    check-cast v0, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏兰哲世;

    .line 167
    .line 168
    invoke-static {v0, v1}, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    if-ne v0, v2, :cond_8

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_8
    move-object v0, v4

    .line 176
    :goto_4
    if-ne v0, v2, :cond_9

    .line 177
    .line 178
    :goto_5
    return-object v2

    .line 179
    :cond_9
    :goto_6
    return-object v4
.end method
