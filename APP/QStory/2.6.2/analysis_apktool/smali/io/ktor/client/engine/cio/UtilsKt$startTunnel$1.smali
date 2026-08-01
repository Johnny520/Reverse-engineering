.class final Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.client.engine.cio.UtilsKt"
    f = "utils.kt"
    l = {
        0xee,
        0xef,
        0xf1,
        0xf8
    }
    m = "startTunnel"
.end annotation


# instance fields
.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iput-object p1, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->label:I

    .line 9
    .line 10
    and-int v1, p1, v0

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    sub-int/2addr p1, v0

    .line 15
    iput p1, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->label:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 21
    .line 22
    .line 23
    move-object p0, p1

    .line 24
    :goto_0
    iget-object p1, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->result:Ljava/lang/Object;

    .line 25
    .line 26
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 27
    .line 28
    iget v1, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->label:I

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    if-eqz v1, :cond_d

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    const/4 v4, 0x3

    .line 35
    const/4 v5, 0x2

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eq v1, v6, :cond_4

    .line 38
    .line 39
    if-eq v1, v5, :cond_3

    .line 40
    .line 41
    if-eq v1, v4, :cond_2

    .line 42
    .line 43
    if-ne v1, v3, :cond_1

    .line 44
    .line 45
    iget-object v0, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->L$1:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ljava/io/Closeable;

    .line 48
    .line 49
    iget-object p0, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->L$0:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p0, Lio/ktor/http/cio/飘花落叶言子楪哲兰苏世;

    .line 52
    .line 53
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :catchall_0
    move-exception p1

    .line 59
    goto/16 :goto_6

    .line 60
    .line 61
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v2

    .line 67
    :cond_2
    iget-object v1, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->L$1:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, Lio/ktor/http/cio/飘花落叶言子楪哲兰苏世;

    .line 70
    .line 71
    iget-object v2, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->L$0:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 74
    .line 75
    :try_start_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :catchall_1
    move-exception p0

    .line 80
    goto/16 :goto_9

    .line 81
    .line 82
    :cond_3
    iget-object v1, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->L$1:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v1, Lio/ktor/http/cio/飘花落叶言子楪哲兰苏世;

    .line 85
    .line 86
    iget-object v2, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->L$0:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 89
    .line 90
    :try_start_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    iget-object v1, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->L$2:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Lio/ktor/http/cio/飘花落叶言子楪哲兰苏世;

    .line 97
    .line 98
    iget-object v7, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->L$1:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v7, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 101
    .line 102
    iget-object v8, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->L$0:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v8, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 105
    .line 106
    :try_start_3
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    iput-object v7, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->L$0:Ljava/lang/Object;

    .line 110
    .line 111
    iput-object v1, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->L$1:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object v2, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->L$2:Ljava/lang/Object;

    .line 114
    .line 115
    iput v5, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->label:I

    .line 116
    .line 117
    check-cast v8, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 118
    .line 119
    invoke-virtual {v8, p0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    if-ne p1, v0, :cond_5

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_5
    move-object v2, v7

    .line 127
    :goto_1
    iput-object v2, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->L$0:Ljava/lang/Object;

    .line 128
    .line 129
    iput-object v1, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->L$1:Ljava/lang/Object;

    .line 130
    .line 131
    iput v4, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->label:I

    .line 132
    .line 133
    invoke-static {v2, p0}, Lio/ktor/http/cio/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    if-ne p1, v0, :cond_6

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_6
    :goto_2
    check-cast p1, Lio/ktor/http/cio/飘花落叶言子楪兰世苏哲;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 141
    .line 142
    if-eqz p1, :cond_c

    .line 143
    .line 144
    :try_start_4
    iget v4, p1, Lio/ktor/http/cio/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪兰世苏哲:I

    .line 145
    .line 146
    div-int/lit16 v4, v4, 0xc8

    .line 147
    .line 148
    if-ne v4, v6, :cond_a

    .line 149
    .line 150
    iget-object v4, p1, Lio/ktor/http/cio/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;

    .line 151
    .line 152
    sget-object v5, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:[Ljava/lang/String;

    .line 153
    .line 154
    const-string v5, "Content-Length"

    .line 155
    .line 156
    invoke-virtual {v4, v5}, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    if-eqz v4, :cond_8

    .line 161
    .line 162
    invoke-virtual {v4}, Lio/ktor/http/cio/internals/飘花落叶言子楪世苏兰哲;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 167
    .line 168
    .line 169
    move-result-wide v4

    .line 170
    iput-object v1, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->L$0:Ljava/lang/Object;

    .line 171
    .line 172
    iput-object p1, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->L$1:Ljava/lang/Object;

    .line 173
    .line 174
    const/4 v6, 0x0

    .line 175
    iput v6, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->I$0:I

    .line 176
    .line 177
    iput v3, p0, Lio/ktor/client/engine/cio/UtilsKt$startTunnel$1;->label:I

    .line 178
    .line 179
    invoke-static {v2, v4, v5, p0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世兰哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;JLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 183
    if-ne p0, v0, :cond_7

    .line 184
    .line 185
    :goto_3
    return-object v0

    .line 186
    :cond_7
    move-object v0, p1

    .line 187
    move-object p1, p0

    .line 188
    move-object p0, v1

    .line 189
    :goto_4
    :try_start_5
    check-cast p1, Ljava/lang/Number;

    .line 190
    .line 191
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 192
    .line 193
    .line 194
    move-result-wide v1

    .line 195
    new-instance p1, Ljava/lang/Long;

    .line 196
    .line 197
    invoke-direct {p1, v1, v2}, Ljava/lang/Long;-><init>(J)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 198
    .line 199
    .line 200
    move-object v1, p0

    .line 201
    move-object p1, v0

    .line 202
    goto :goto_5

    .line 203
    :catchall_2
    move-exception p0

    .line 204
    move-object v0, p1

    .line 205
    move-object p1, p0

    .line 206
    move-object p0, v1

    .line 207
    goto :goto_6

    .line 208
    :cond_8
    :goto_5
    if-eqz p1, :cond_9

    .line 209
    .line 210
    :try_start_6
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 211
    .line 212
    .line 213
    :cond_9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 217
    .line 218
    return-object p0

    .line 219
    :cond_a
    :try_start_7
    new-instance p0, Ljava/io/IOException;

    .line 220
    .line 221
    const-string v0, "Can not establish tunnel connection"

    .line 222
    .line 223
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 227
    :goto_6
    if-eqz v0, :cond_b

    .line 228
    .line 229
    :try_start_8
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 230
    .line 231
    .line 232
    goto :goto_7

    .line 233
    :catchall_3
    move-exception v0

    .line 234
    :try_start_9
    invoke-static {p1, v0}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 235
    .line 236
    .line 237
    goto :goto_7

    .line 238
    :catchall_4
    move-exception p1

    .line 239
    goto :goto_8

    .line 240
    :cond_b
    :goto_7
    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 241
    :goto_8
    :try_start_a
    throw p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 242
    :catchall_5
    move-exception p1

    .line 243
    move-object v1, p0

    .line 244
    move-object p0, p1

    .line 245
    goto :goto_9

    .line 246
    :cond_c
    :try_start_b
    new-instance p0, Ljava/io/EOFException;

    .line 247
    .line 248
    const-string p1, "Failed to parse CONNECT response: unexpected EOF"

    .line 249
    .line 250
    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    throw p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 254
    :cond_d
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    new-instance v1, Lio/ktor/http/cio/飘花落叶言子楪哲兰苏世;

    .line 258
    .line 259
    invoke-direct {v1}, Lio/ktor/http/cio/飘花落叶言子楪哲兰苏世;-><init>()V

    .line 260
    .line 261
    .line 262
    :try_start_c
    throw v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 263
    :goto_9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    throw p0
.end method
