.class final Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u696a\u5170\u82cf\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u54f2\u5b50\u82cf\u5170\u4e16;",
        ">",
        "Lkotlin/coroutines/jvm/internal/ContinuationImpl;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.modelcontextprotocol.kotlin.sdk.shared.Protocol"
    f = "Protocol.kt"
    l = {
        0x189,
        0x18d,
        0x190
    }
    m = "request"
.end annotation


# instance fields
.field J$0:J

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏世兰哲;


# direct methods
.method public constructor <init>(Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/modelcontextprotocol/kotlin/sdk/shared/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->this$0:Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iput-object v1, v0, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->result:Ljava/lang/Object;

    .line 6
    .line 7
    iget v1, v0, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->label:I

    .line 8
    .line 9
    const/high16 v2, -0x80000000

    .line 10
    .line 11
    or-int/2addr v1, v2

    .line 12
    iput v1, v0, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->label:I

    .line 13
    .line 14
    iget-object v4, v0, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->this$0:Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏世兰哲;

    .line 15
    .line 16
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    instance-of v1, v0, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget v1, v0, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->label:I

    .line 24
    .line 25
    and-int v3, v1, v2

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    sub-int/2addr v1, v2

    .line 30
    iput v1, v0, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->label:I

    .line 31
    .line 32
    move-object v1, v0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;

    .line 35
    .line 36
    invoke-direct {v1, v4, v0}, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;-><init>(Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object v0, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->result:Ljava/lang/Object;

    .line 40
    .line 41
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 42
    .line 43
    iget v3, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->label:I

    .line 44
    .line 45
    const/4 v9, 0x0

    .line 46
    const/4 v10, 0x3

    .line 47
    const/4 v11, 0x2

    .line 48
    const/4 v12, 0x1

    .line 49
    if-eqz v3, :cond_4

    .line 50
    .line 51
    if-eq v3, v12, :cond_3

    .line 52
    .line 53
    if-eq v3, v11, :cond_2

    .line 54
    .line 55
    if-eq v3, v10, :cond_1

    .line 56
    .line 57
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    move-object v0, v9

    .line 63
    goto/16 :goto_8

    .line 64
    .line 65
    :cond_1
    iget-object v2, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->L$1:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, Lkotlinx/coroutines/TimeoutCancellationException;

    .line 68
    .line 69
    iget-object v1, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->L$0:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;

    .line 72
    .line 73
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_9

    .line 77
    .line 78
    :cond_2
    iget-wide v3, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->J$0:J

    .line 79
    .line 80
    iget-object v5, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->L$2:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v5, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 83
    .line 84
    iget-object v6, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->L$1:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v6, Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;

    .line 87
    .line 88
    iget-object v7, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->L$0:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v7, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏哲世子兰;

    .line 91
    .line 92
    :try_start_0
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    .line 94
    .line 95
    goto/16 :goto_8

    .line 96
    .line 97
    :catch_0
    move-exception v0

    .line 98
    goto/16 :goto_6

    .line 99
    .line 100
    :cond_3
    iget-wide v3, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->J$0:J

    .line 101
    .line 102
    iget-object v5, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->L$2:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v5, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 105
    .line 106
    iget-object v6, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->L$1:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v6, Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;

    .line 109
    .line 110
    iget-object v7, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->L$0:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v7, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏哲世子兰;

    .line 113
    .line 114
    :try_start_1
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 115
    .line 116
    .line 117
    goto/16 :goto_4

    .line 118
    .line 119
    :cond_4
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    sget-object v0, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰子哲苏世/飘花落叶言子楪世苏哲兰;

    .line 123
    .line 124
    new-instance v3, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏世哲兰;

    .line 125
    .line 126
    invoke-direct {v3, v9, v10}, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;I)V

    .line 127
    .line 128
    .line 129
    invoke-interface {v0, v3}, L飘花落叶言楪兰子哲苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 130
    .line 131
    .line 132
    invoke-static {}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲()Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    iget-object v6, v4, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏兰世哲;

    .line 137
    .line 138
    if-eqz v6, :cond_13

    .line 139
    .line 140
    iget-object v0, v4, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪苏哲世兰;

    .line 141
    .line 142
    iget-boolean v0, v0, Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Z

    .line 143
    .line 144
    if-ne v0, v12, :cond_e

    .line 145
    .line 146
    iget-object v0, v9, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世兰苏哲:L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲世苏兰;

    .line 147
    .line 148
    move-object v3, v4

    .line 149
    check-cast v3, Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪苏世哲兰;

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    sget-object v5, Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰子哲苏世/飘花落叶言子楪世苏哲兰;

    .line 155
    .line 156
    new-instance v8, Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪世哲兰苏;

    .line 157
    .line 158
    invoke-direct {v8, v12, v0}, Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪世哲兰苏;-><init>(IL飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲世苏兰;)V

    .line 159
    .line 160
    .line 161
    invoke-interface {v5, v8}, L飘花落叶言楪兰子哲苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v0}, L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲世苏兰;->getValue()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v8

    .line 168
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 169
    .line 170
    .line 171
    move-result v13

    .line 172
    const v14, -0x23a3dfe4

    .line 173
    .line 174
    .line 175
    const/16 v15, 0x29

    .line 176
    .line 177
    if-eq v13, v14, :cond_a

    .line 178
    .line 179
    const v14, 0x348172

    .line 180
    .line 181
    .line 182
    if-eq v13, v14, :cond_9

    .line 183
    .line 184
    const v14, 0x1c319743

    .line 185
    .line 186
    .line 187
    if-eq v13, v14, :cond_5

    .line 188
    .line 189
    goto/16 :goto_3

    .line 190
    .line 191
    :cond_5
    const-string v13, "sampling/createMessage"

    .line 192
    .line 193
    invoke-virtual {v8, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    if-nez v8, :cond_6

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :cond_6
    iget-object v3, v3, Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世:L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;

    .line 201
    .line 202
    if-eqz v3, :cond_7

    .line 203
    .line 204
    iget-object v3, v3, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_7
    move-object v3, v9

    .line 208
    :goto_1
    if-eqz v3, :cond_8

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_8
    new-instance v1, Landroidx/window/area/飘花落叶言子楪世兰哲苏;

    .line 212
    .line 213
    const/16 v2, 0xb

    .line 214
    .line 215
    invoke-direct {v1, v2}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 216
    .line 217
    .line 218
    invoke-interface {v5, v1}, L飘花落叶言楪兰子哲苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 219
    .line 220
    .line 221
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 222
    .line 223
    invoke-interface {v0}, L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲世苏兰;->getValue()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    new-instance v2, Ljava/lang/StringBuilder;

    .line 228
    .line 229
    const-string v3, "Client does not support sampling (required for "

    .line 230
    .line 231
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    throw v1

    .line 248
    :cond_9
    const-string v0, "ping"

    .line 249
    .line 250
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    goto :goto_3

    .line 254
    :cond_a
    const-string v5, "roots/list"

    .line 255
    .line 256
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v5

    .line 260
    if-nez v5, :cond_b

    .line 261
    .line 262
    goto :goto_3

    .line 263
    :cond_b
    iget-object v3, v3, Lio/modelcontextprotocol/kotlin/sdk/server/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世:L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;

    .line 264
    .line 265
    if-eqz v3, :cond_c

    .line 266
    .line 267
    iget-object v3, v3, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子楪兰苏哲/飘花落叶言子楪哲兰世苏;

    .line 268
    .line 269
    goto :goto_2

    .line 270
    :cond_c
    move-object v3, v9

    .line 271
    :goto_2
    if-eqz v3, :cond_d

    .line 272
    .line 273
    goto :goto_3

    .line 274
    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 275
    .line 276
    invoke-interface {v0}, L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲世苏兰;->getValue()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    new-instance v2, Ljava/lang/StringBuilder;

    .line 281
    .line 282
    const-string v3, "Client does not support listing roots (required for "

    .line 283
    .line 284
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    throw v1

    .line 301
    :cond_e
    :goto_3
    sget-object v0, L飘花落叶言世子楪兰苏哲/飘花落叶言世楪子苏哲兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/String;

    .line 302
    .line 303
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    new-instance v0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;

    .line 307
    .line 308
    iget-object v3, v9, L飘花落叶言世子楪兰苏哲/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世兰苏哲:L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲世苏兰;

    .line 309
    .line 310
    invoke-interface {v3}, L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲世苏兰;->getValue()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    invoke-static {}, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰()L飘花落叶言世苏兰哲楪子/飘花落叶言子楪世苏兰哲;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    sget-object v8, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏哲世子兰;->Companion:L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏哲子兰世;

    .line 322
    .line 323
    invoke-virtual {v8}, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏哲子兰世;->serializer()L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 324
    .line 325
    .line 326
    move-result-object v8

    .line 327
    check-cast v8, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;

    .line 328
    .line 329
    invoke-virtual {v5, v8, v9}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;

    .line 330
    .line 331
    .line 332
    move-result-object v5

    .line 333
    invoke-direct {v0, v3, v5}, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;-><init>(Ljava/lang/String;L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;)V

    .line 334
    .line 335
    .line 336
    iget-object v3, v4, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲:Ljava/util/LinkedHashMap;

    .line 337
    .line 338
    new-instance v5, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪世哲兰苏;

    .line 339
    .line 340
    invoke-direct {v5, v7}, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪世哲兰苏;-><init>(Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;)V

    .line 341
    .line 342
    .line 343
    iget-object v8, v0, L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰哲子世;

    .line 344
    .line 345
    invoke-interface {v3, v8, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    new-instance v3, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$cancel$1;

    .line 349
    .line 350
    move-object v5, v8

    .line 351
    const/4 v8, 0x0

    .line 352
    invoke-direct/range {v3 .. v8}, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$cancel$1;-><init>(Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏世兰哲;L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰哲子世;Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏兰世哲;Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 353
    .line 354
    .line 355
    sget-wide v13, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:J

    .line 356
    .line 357
    :try_start_2
    new-instance v6, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$5;

    .line 358
    .line 359
    invoke-direct {v6, v4, v0, v5, v9}, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$5;-><init>(Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏世兰哲;L飘花落叶言世子楪兰苏哲/飘花落叶言子哲苏世楪兰;L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏兰哲子世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 360
    .line 361
    .line 362
    iput-object v9, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->L$0:Ljava/lang/Object;

    .line 363
    .line 364
    iput-object v7, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->L$1:Ljava/lang/Object;

    .line 365
    .line 366
    iput-object v3, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->L$2:Ljava/lang/Object;

    .line 367
    .line 368
    iput-wide v13, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->J$0:J

    .line 369
    .line 370
    iput v12, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->label:I

    .line 371
    .line 372
    invoke-static {v13, v14}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世苏兰楪哲(J)J

    .line 373
    .line 374
    .line 375
    move-result-wide v4

    .line 376
    const-wide/16 v15, 0x0

    .line 377
    .line 378
    cmp-long v0, v4, v15

    .line 379
    .line 380
    if-lez v0, :cond_10

    .line 381
    .line 382
    new-instance v0, Lkotlinx/coroutines/飘花落叶言子哲世楪兰苏;

    .line 383
    .line 384
    invoke-direct {v0, v4, v5, v1}, Lkotlinx/coroutines/飘花落叶言子哲世楪兰苏;-><init>(JLkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 385
    .line 386
    .line 387
    invoke-static {v0, v6}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世苏哲楪兰(Lkotlinx/coroutines/飘花落叶言子哲世楪兰苏;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v0
    :try_end_2
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_2 .. :try_end_2} :catch_1

    .line 391
    if-ne v0, v2, :cond_f

    .line 392
    .line 393
    goto/16 :goto_7

    .line 394
    .line 395
    :cond_f
    move-object v5, v3

    .line 396
    move-object v6, v7

    .line 397
    move-object v7, v9

    .line 398
    move-wide v3, v13

    .line 399
    :goto_4
    :try_start_3
    iput-object v7, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->L$0:Ljava/lang/Object;

    .line 400
    .line 401
    iput-object v6, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->L$1:Ljava/lang/Object;

    .line 402
    .line 403
    iput-object v5, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->L$2:Ljava/lang/Object;

    .line 404
    .line 405
    iput-wide v3, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->J$0:J

    .line 406
    .line 407
    iput v11, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->label:I

    .line 408
    .line 409
    move-object v0, v6

    .line 410
    check-cast v0, Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;

    .line 411
    .line 412
    invoke-virtual {v0, v1}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子世苏哲兰楪(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v0
    :try_end_3
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_3 .. :try_end_3} :catch_0

    .line 416
    if-ne v0, v2, :cond_11

    .line 417
    .line 418
    goto :goto_7

    .line 419
    :cond_10
    :try_start_4
    new-instance v0, Lkotlinx/coroutines/TimeoutCancellationException;

    .line 420
    .line 421
    const-string v4, "Timed out immediately"

    .line 422
    .line 423
    invoke-direct {v0, v4}, Lkotlinx/coroutines/TimeoutCancellationException;-><init>(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    throw v0
    :try_end_4
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_4 .. :try_end_4} :catch_1

    .line 427
    :goto_5
    move-object v5, v3

    .line 428
    move-object v6, v7

    .line 429
    move-object v7, v9

    .line 430
    move-wide v3, v13

    .line 431
    goto :goto_6

    .line 432
    :catch_1
    move-exception v0

    .line 433
    goto :goto_5

    .line 434
    :goto_6
    sget-object v8, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰子哲苏世/飘花落叶言子楪世苏哲兰;

    .line 435
    .line 436
    new-instance v11, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪世兰苏哲;

    .line 437
    .line 438
    invoke-direct {v11, v3, v4, v7}, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪世兰苏哲;-><init>(JL飘花落叶言世子楪兰苏哲/飘花落叶言楪苏哲世子兰;)V

    .line 439
    .line 440
    .line 441
    invoke-interface {v8, v11}, L飘花落叶言楪兰子哲苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 442
    .line 443
    .line 444
    new-instance v7, Lio/modelcontextprotocol/kotlin/sdk/McpError;

    .line 445
    .line 446
    sget-object v8, Lio/modelcontextprotocol/kotlin/sdk/ErrorCode$Defined;->RequestTimeout:Lio/modelcontextprotocol/kotlin/sdk/ErrorCode$Defined;

    .line 447
    .line 448
    invoke-virtual {v8}, Lio/modelcontextprotocol/kotlin/sdk/ErrorCode$Defined;->getCode()I

    .line 449
    .line 450
    .line 451
    move-result v8

    .line 452
    new-instance v11, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;

    .line 453
    .line 454
    invoke-static {v3, v4}, Lkotlin/time/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(J)J

    .line 455
    .line 456
    .line 457
    move-result-wide v3

    .line 458
    new-instance v12, Ljava/lang/Long;

    .line 459
    .line 460
    invoke-direct {v12, v3, v4}, Ljava/lang/Long;-><init>(J)V

    .line 461
    .line 462
    .line 463
    invoke-static {v12}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Number;)L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪兰哲苏;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    new-instance v4, Lkotlin/Pair;

    .line 468
    .line 469
    const-string v12, "timeout"

    .line 470
    .line 471
    invoke-direct {v4, v12, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    filled-new-array {v4}, [Lkotlin/Pair;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    invoke-static {v3}, Lkotlin/collections/飘花落叶言子楪兰哲苏世;->飘花落叶言子哲楪世苏兰([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    .line 479
    .line 480
    .line 481
    move-result-object v3

    .line 482
    invoke-direct {v11, v3}, L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;-><init>(Ljava/util/Map;)V

    .line 483
    .line 484
    .line 485
    const-string v3, "Request timed out"

    .line 486
    .line 487
    invoke-direct {v7, v8, v3, v11}, Lio/modelcontextprotocol/kotlin/sdk/McpError;-><init>(ILjava/lang/String;L飘花落叶言世苏兰哲楪子/飘花落叶言子世楪苏兰哲;)V

    .line 488
    .line 489
    .line 490
    iput-object v6, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->L$0:Ljava/lang/Object;

    .line 491
    .line 492
    iput-object v0, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->L$1:Ljava/lang/Object;

    .line 493
    .line 494
    iput-object v9, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->L$2:Ljava/lang/Object;

    .line 495
    .line 496
    iput v10, v1, Lio/modelcontextprotocol/kotlin/sdk/shared/Protocol$request$1;->label:I

    .line 497
    .line 498
    invoke-interface {v5, v7, v1}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    if-ne v1, v2, :cond_12

    .line 503
    .line 504
    :goto_7
    move-object v0, v2

    .line 505
    :cond_11
    :goto_8
    return-object v0

    .line 506
    :cond_12
    move-object v2, v0

    .line 507
    move-object v1, v6

    .line 508
    :goto_9
    check-cast v1, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;

    .line 509
    .line 510
    invoke-virtual {v1, v2}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 511
    .line 512
    .line 513
    throw v2

    .line 514
    :cond_13
    new-instance v0, Ljava/lang/Error;

    .line 515
    .line 516
    const-string v1, "Not connected"

    .line 517
    .line 518
    invoke-direct {v0, v1}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    throw v0
.end method
