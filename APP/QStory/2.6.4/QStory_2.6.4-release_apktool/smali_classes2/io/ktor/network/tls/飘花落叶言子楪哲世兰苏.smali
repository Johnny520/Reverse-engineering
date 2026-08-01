.class public final Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;
.implements Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;


# instance fields
.field public final 飘花落叶言子楪兰世苏哲:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

.field public final 飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

.field public final 飘花落叶言子楪哲兰苏世:Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;

.field public final 飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 17
    .line 18
    iput-object p2, p0, Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 19
    .line 20
    iput-object p3, p0, Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;

    .line 21
    .line 22
    iput-object p4, p0, Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰世苏哲:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 23
    .line 24
    return-void
.end method

.method public static final 飘花落叶言子世苏哲楪兰(Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p2, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p2

    .line 9
    check-cast v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;

    .line 10
    .line 11
    iget v1, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->label:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->label:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;

    .line 24
    .line 25
    invoke-direct {v0, p0, p2}, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;-><init>(Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p2, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 31
    .line 32
    iget v2, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->label:I

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v4, 0x2

    .line 36
    const/4 v5, 0x1

    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    if-eq v2, v5, :cond_3

    .line 40
    .line 41
    if-ne v2, v4, :cond_2

    .line 42
    .line 43
    iget-object p0, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->L$4:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Ljava/nio/ByteBuffer;

    .line 46
    .line 47
    iget-object p1, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->L$3:Ljava/lang/Object;

    .line 48
    .line 49
    iget-object v2, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->L$2:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲兰苏;

    .line 52
    .line 53
    iget-object v6, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v6, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 56
    .line 57
    iget-object v7, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v7, Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;

    .line 60
    .line 61
    :try_start_0
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/channels/ClosedSendChannelException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    :cond_1
    move-object p2, v2

    .line 65
    move-object v2, p1

    .line 66
    move-object p1, v6

    .line 67
    move-object v6, p0

    .line 68
    move-object p0, v7

    .line 69
    goto :goto_1

    .line 70
    :catchall_0
    move-exception p0

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
    iget-object p0, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->L$4:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p0, Ljava/nio/ByteBuffer;

    .line 82
    .line 83
    iget-object p1, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->L$3:Ljava/lang/Object;

    .line 84
    .line 85
    iget-object v2, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->L$2:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v2, L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲兰苏;

    .line 88
    .line 89
    iget-object v6, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->L$1:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v6, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 92
    .line 93
    iget-object v7, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->L$0:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v7, Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;

    .line 96
    .line 97
    :try_start_1
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catch Lkotlinx/coroutines/channels/ClosedSendChannelException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    sget-object p2, Lio/ktor/network/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世苏兰哲;

    .line 105
    .line 106
    invoke-virtual {p2}, L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子世苏楪哲兰()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    :try_start_2
    move-object v6, v2

    .line 111
    check-cast v6, Ljava/nio/ByteBuffer;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 112
    .line 113
    :goto_1
    :try_start_3
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 114
    .line 115
    .line 116
    iput-object p0, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->L$0:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object p1, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->L$1:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object p2, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->L$2:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v2, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->L$3:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object v6, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->L$4:Ljava/lang/Object;

    .line 125
    .line 126
    iput v5, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->label:I

    .line 127
    .line 128
    invoke-static {p1, v6, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世苏兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Ljava/nio/ByteBuffer;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v7
    :try_end_3
    .catch Lkotlinx/coroutines/channels/ClosedSendChannelException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 132
    if-ne v7, v1, :cond_5

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_5
    move-object v11, v7

    .line 136
    move-object v7, p0

    .line 137
    move-object p0, v6

    .line 138
    move-object v6, p1

    .line 139
    move-object p1, v2

    .line 140
    move-object v2, p2

    .line 141
    move-object p2, v11

    .line 142
    :goto_2
    :try_start_4
    check-cast p2, Ljava/lang/Number;

    .line 143
    .line 144
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 145
    .line 146
    .line 147
    move-result p2

    .line 148
    const/4 v8, -0x1

    .line 149
    if-eq p2, v8, :cond_6

    .line 150
    .line 151
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 152
    .line 153
    .line 154
    iget-object p2, v7, Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 155
    .line 156
    sget-object v8, Lio/ktor/network/tls/TLSRecordType;->ApplicationData:Lio/ktor/network/tls/TLSRecordType;

    .line 157
    .line 158
    new-instance v9, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 159
    .line 160
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 161
    .line 162
    .line 163
    invoke-static {v9, p0}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏世兰(Lkotlinx/io/飘花落叶言子楪世苏哲兰;Ljava/nio/ByteBuffer;)V

    .line 164
    .line 165
    .line 166
    new-instance v10, Lio/ktor/network/tls/飘花落叶言子楪苏兰世哲;

    .line 167
    .line 168
    invoke-direct {v10, v8, v9}, Lio/ktor/network/tls/飘花落叶言子楪苏兰世哲;-><init>(Lio/ktor/network/tls/TLSRecordType;Lkotlinx/io/飘花落叶言子楪苏兰世哲;)V

    .line 169
    .line 170
    .line 171
    iput-object v7, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->L$0:Ljava/lang/Object;

    .line 172
    .line 173
    iput-object v6, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->L$1:Ljava/lang/Object;

    .line 174
    .line 175
    iput-object v2, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->L$2:Ljava/lang/Object;

    .line 176
    .line 177
    iput-object p1, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->L$3:Ljava/lang/Object;

    .line 178
    .line 179
    iput-object p0, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->L$4:Ljava/lang/Object;

    .line 180
    .line 181
    iput v4, v0, Lio/ktor/network/tls/TLSSocket$appDataOutputLoop$1;->label:I

    .line 182
    .line 183
    invoke-interface {p2, v10, v0}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p2
    :try_end_4
    .catch Lkotlinx/coroutines/channels/ClosedSendChannelException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 187
    if-ne p2, v1, :cond_1

    .line 188
    .line 189
    :goto_3
    return-object v1

    .line 190
    :catch_0
    :cond_6
    :goto_4
    :try_start_5
    iget-object p0, v7, Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 191
    .line 192
    invoke-interface {p0, v3}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Throwable;)Z

    .line 193
    .line 194
    .line 195
    goto :goto_6

    .line 196
    :catchall_1
    move-exception p0

    .line 197
    move-object p2, v2

    .line 198
    move-object v2, p1

    .line 199
    goto :goto_7

    .line 200
    :catchall_2
    move-exception p1

    .line 201
    move-object v7, p0

    .line 202
    move-object p0, p1

    .line 203
    move-object p1, v2

    .line 204
    move-object v2, p2

    .line 205
    goto :goto_5

    .line 206
    :catch_1
    move-object v7, p0

    .line 207
    move-object p1, v2

    .line 208
    move-object v2, p2

    .line 209
    goto :goto_4

    .line 210
    :goto_5
    iget-object p2, v7, Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 211
    .line 212
    invoke-interface {p2, v3}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Throwable;)Z

    .line 213
    .line 214
    .line 215
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 216
    :goto_6
    invoke-interface {v2, p1}, L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子哲世苏楪兰(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 220
    .line 221
    return-object p0

    .line 222
    :catchall_3
    move-exception p0

    .line 223
    :goto_7
    invoke-interface {p2, v2}, L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子哲世苏楪兰(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    throw p0
.end method

.method public static final 飘花落叶言子楪兰世苏哲(Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p2, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p2

    .line 9
    check-cast v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;

    .line 10
    .line 11
    iget v1, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->label:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->label:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;

    .line 24
    .line 25
    invoke-direct {v0, p0, p2}, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;-><init>(Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p2, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 31
    .line 32
    iget v2, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->label:I

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    const/4 v4, 0x0

    .line 36
    packed-switch v2, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v4

    .line 45
    :pswitch_0
    iget-object p0, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, Ljava/lang/Throwable;

    .line 48
    .line 49
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    throw p0

    .line 53
    :pswitch_1
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_9

    .line 57
    .line 58
    :pswitch_2
    iget-object p0, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$2:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p0, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 61
    .line 62
    iget-object p1, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$1:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 65
    .line 66
    iget-object v2, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$0:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 69
    .line 70
    :try_start_0
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    :goto_1
    move-object p2, p0

    .line 74
    move-object p0, p1

    .line 75
    move-object p1, v2

    .line 76
    goto :goto_2

    .line 77
    :catchall_0
    move-exception p0

    .line 78
    goto/16 :goto_7

    .line 79
    .line 80
    :pswitch_3
    iget-object p0, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$2:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p0, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 83
    .line 84
    iget-object p1, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$1:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p1, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 87
    .line 88
    iget-object v2, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$0:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 91
    .line 92
    :try_start_1
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    .line 94
    .line 95
    :cond_1
    move-object p2, p1

    .line 96
    move-object p1, v2

    .line 97
    goto :goto_4

    .line 98
    :pswitch_4
    iget-object p0, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$2:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p0, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 101
    .line 102
    iget-object p1, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$1:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast p1, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;

    .line 105
    .line 106
    iget-object v2, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$0:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 109
    .line 110
    :try_start_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :pswitch_5
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :try_start_3
    iget-object p0, p0, Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 118
    .line 119
    :try_start_4
    invoke-interface {p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;->iterator()Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    :goto_2
    iput-object p1, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$0:Ljava/lang/Object;

    .line 124
    .line 125
    iput-object p0, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$1:Ljava/lang/Object;

    .line 126
    .line 127
    iput-object p2, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$2:Ljava/lang/Object;

    .line 128
    .line 129
    iput v3, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->label:I

    .line 130
    .line 131
    check-cast p2, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;

    .line 132
    .line 133
    invoke-virtual {p2, v0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 137
    if-ne v2, v1, :cond_2

    .line 138
    .line 139
    goto/16 :goto_a

    .line 140
    .line 141
    :cond_2
    move-object v10, p1

    .line 142
    move-object p1, p0

    .line 143
    move-object p0, p2

    .line 144
    move-object p2, v2

    .line 145
    move-object v2, v10

    .line 146
    :goto_3
    :try_start_5
    check-cast p2, Ljava/lang/Boolean;

    .line 147
    .line 148
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    if-eqz p2, :cond_5

    .line 153
    .line 154
    check-cast p0, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;

    .line 155
    .line 156
    invoke-virtual {p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    check-cast p2, Lio/ktor/network/tls/飘花落叶言子楪苏兰世哲;

    .line 161
    .line 162
    iget-object v5, p2, Lio/ktor/network/tls/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 163
    .line 164
    iget-object v6, p2, Lio/ktor/network/tls/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lio/ktor/network/tls/TLSRecordType;

    .line 165
    .line 166
    invoke-static {v5}, L飘花落叶言世子苏楪哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)J

    .line 167
    .line 168
    .line 169
    move-result-wide v7

    .line 170
    sget-object v5, Lio/ktor/network/tls/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:[I

    .line 171
    .line 172
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 173
    .line 174
    .line 175
    move-result v9

    .line 176
    aget v5, v5, v9

    .line 177
    .line 178
    const/4 v9, 0x2

    .line 179
    if-ne v5, v3, :cond_4

    .line 180
    .line 181
    iget-object p2, p2, Lio/ktor/network/tls/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 182
    .line 183
    iput-object v2, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$0:Ljava/lang/Object;

    .line 184
    .line 185
    iput-object p1, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$1:Ljava/lang/Object;

    .line 186
    .line 187
    iput-object p0, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$2:Ljava/lang/Object;

    .line 188
    .line 189
    iput v9, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->label:I

    .line 190
    .line 191
    invoke-static {v2, p2, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Lkotlinx/io/飘花落叶言子楪苏兰世哲;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 195
    if-ne p2, v1, :cond_1

    .line 196
    .line 197
    goto/16 :goto_a

    .line 198
    .line 199
    :goto_4
    :try_start_6
    iput-object p1, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$0:Ljava/lang/Object;

    .line 200
    .line 201
    iput-object p2, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$1:Ljava/lang/Object;

    .line 202
    .line 203
    iput-object p0, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$2:Ljava/lang/Object;

    .line 204
    .line 205
    const/4 v2, 0x3

    .line 206
    iput v2, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->label:I

    .line 207
    .line 208
    move-object v2, p1

    .line 209
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 210
    .line 211
    invoke-virtual {v2, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 215
    if-ne p1, v1, :cond_3

    .line 216
    .line 217
    goto/16 :goto_a

    .line 218
    .line 219
    :cond_3
    move-object p1, p2

    .line 220
    goto/16 :goto_1

    .line 221
    .line 222
    :goto_5
    move-object v2, p1

    .line 223
    move-object p1, p2

    .line 224
    goto :goto_7

    .line 225
    :catchall_1
    move-exception p0

    .line 226
    goto :goto_5

    .line 227
    :cond_4
    :try_start_7
    new-instance p0, Lio/ktor/network/tls/TLSException;

    .line 228
    .line 229
    new-instance p2, Ljava/lang/StringBuilder;

    .line 230
    .line 231
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 232
    .line 233
    .line 234
    const-string v3, "Unexpected record "

    .line 235
    .line 236
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    const-string v3, " ("

    .line 243
    .line 244
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {p2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    const-string v3, " bytes)"

    .line 251
    .line 252
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p2

    .line 259
    invoke-direct {p0, p2, v4, v9, v4}, Lio/ktor/network/tls/TLSException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    .line 260
    .line 261
    .line 262
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 263
    :cond_5
    :try_start_8
    invoke-interface {p1, v4}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲世苏兰(Ljava/util/concurrent/CancellationException;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 264
    .line 265
    .line 266
    iput-object v4, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$0:Ljava/lang/Object;

    .line 267
    .line 268
    iput-object v4, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$1:Ljava/lang/Object;

    .line 269
    .line 270
    iput-object v4, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$2:Ljava/lang/Object;

    .line 271
    .line 272
    const/4 p0, 0x4

    .line 273
    iput p0, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->label:I

    .line 274
    .line 275
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 276
    .line 277
    invoke-virtual {v2, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    if-ne p0, v1, :cond_6

    .line 282
    .line 283
    goto :goto_a

    .line 284
    :catchall_2
    move-object p1, v2

    .line 285
    goto :goto_8

    .line 286
    :goto_6
    move-object v2, p1

    .line 287
    move-object p1, p0

    .line 288
    move-object p0, p2

    .line 289
    goto :goto_7

    .line 290
    :catchall_3
    move-exception p2

    .line 291
    goto :goto_6

    .line 292
    :goto_7
    :try_start_9
    throw p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 293
    :catchall_4
    move-exception p2

    .line 294
    :try_start_a
    invoke-static {p1, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲(Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;Ljava/lang/Throwable;)V

    .line 295
    .line 296
    .line 297
    throw p2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 298
    :catchall_5
    :goto_8
    iput-object v4, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$0:Ljava/lang/Object;

    .line 299
    .line 300
    iput-object v4, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$1:Ljava/lang/Object;

    .line 301
    .line 302
    iput-object v4, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->L$2:Ljava/lang/Object;

    .line 303
    .line 304
    const/4 p0, 0x5

    .line 305
    iput p0, v0, Lio/ktor/network/tls/TLSSocket$appDataInputLoop$1;->label:I

    .line 306
    .line 307
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 308
    .line 309
    invoke-virtual {p1, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object p0

    .line 313
    if-ne p0, v1, :cond_6

    .line 314
    .line 315
    goto :goto_a

    .line 316
    :cond_6
    :goto_9
    sget-object v1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 317
    .line 318
    :goto_a
    return-object v1

    .line 319
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final dispose()V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;

    .line 2
    .line 3
    invoke-interface {p0}, Lio/ktor/network/sockets/飘花落叶言子楪世哲兰苏;->dispose()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getLocalAddress()Lio/ktor/network/sockets/飘花落叶言子楪哲兰苏世;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;

    .line 2
    .line 3
    invoke-interface {p0}, Lio/ktor/network/sockets/飘花落叶言子楪世苏哲兰;->getLocalAddress()Lio/ktor/network/sockets/飘花落叶言子楪哲兰苏世;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子哲楪兰世苏()Lkotlinx/coroutines/飘花落叶言子苏世兰楪哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;

    .line 2
    .line 3
    invoke-interface {p0}, Lio/ktor/network/sockets/飘花落叶言子楪世哲兰苏;->飘花落叶言子哲楪兰世苏()Lkotlinx/coroutines/飘花落叶言子苏世兰楪哲;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪哲世苏兰(Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;)Lio/ktor/utils/io/飘花落叶言子世楪苏哲兰;
    .locals 3

    .line 1
    new-instance v0, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 2
    .line 3
    const-string v1, "cio-tls-output-loop"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰世苏哲:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 9
    .line 10
    invoke-interface {v1, v0}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lio/ktor/network/tls/TLSSocket$attachForWriting$1;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, v2}, Lio/ktor/network/tls/TLSSocket$attachForWriting$1;-><init>(Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v0, p1, v1}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)Lio/ktor/utils/io/飘花落叶言子世楪苏哲兰;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final 飘花落叶言子楪哲苏世兰()Lio/ktor/network/sockets/飘花落叶言子楪哲兰苏世;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;

    .line 2
    .line 3
    invoke-interface {p0}, Lio/ktor/network/sockets/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏世兰()Lio/ktor/network/sockets/飘花落叶言子楪哲兰苏世;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世哲兰(Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;)Lio/ktor/utils/io/飘花落叶言子世楪哲兰苏;
    .locals 3

    .line 1
    new-instance v0, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 2
    .line 3
    const-string v1, "cio-tls-input-loop"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰世苏哲:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 9
    .line 10
    invoke-interface {v1, v0}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Lio/ktor/network/tls/TLSSocket$attachForReading$1;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, v2}, Lio/ktor/network/tls/TLSSocket$attachForReading$1;-><init>(Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v0, p1, v1}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)Lio/ktor/utils/io/飘花落叶言子世楪哲兰苏;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final 飘花落叶言子苏兰哲楪世()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/tls/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰世苏哲:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    return-object p0
.end method
