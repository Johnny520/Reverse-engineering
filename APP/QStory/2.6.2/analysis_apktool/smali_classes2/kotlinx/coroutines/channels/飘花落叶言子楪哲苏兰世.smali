.class public final Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏兰世;
.super Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子世苏楪哲兰:Lkotlinx/coroutines/channels/BufferOverflow;


# direct methods
.method public constructor <init>(ILkotlinx/coroutines/channels/BufferOverflow;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏楪哲兰:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 5
    .line 6
    sget-object p0, Lkotlinx/coroutines/channels/BufferOverflow;->SUSPEND:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eq p2, p0, :cond_1

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    if-lt p1, p0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p0, "Buffered channel capacity must be at least 1, but "

    .line 16
    .line 17
    const-string p2, " was specified"

    .line 18
    .line 19
    invoke-static {p1, p0, p2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    throw v0

    .line 27
    :cond_1
    const-class p0, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 28
    .line 29
    sget-object p1, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-interface {p0}, Lkotlin/reflect/飘花落叶言子楪世哲兰苏;->getSimpleName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const-string p1, " instead"

    .line 40
    .line 41
    const-string p2, "This implementation does not support suspension for senders, use "

    .line 42
    .line 43
    invoke-static {p0, p2, p1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    throw v0
.end method


# virtual methods
.method public final 飘花落叶言子世兰哲苏楪(Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 15

    .line 1
    iget-object v1, p0, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏楪哲兰:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 2
    .line 3
    sget-object v2, Lkotlinx/coroutines/channels/BufferOverflow;->DROP_LATEST:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 4
    .line 5
    sget-object v8, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 6
    .line 7
    if-ne v1, v2, :cond_2

    .line 8
    .line 9
    invoke-super/range {p0 .. p1}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏哲世(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v1, v0, Lkotlinx/coroutines/channels/飘花落叶言子楪苏兰哲世;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    instance-of v1, v0, Lkotlinx/coroutines/channels/飘花落叶言子楪苏兰世哲;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-object v8

    .line 23
    :cond_1
    :goto_0
    return-object v0

    .line 24
    :cond_2
    sget-object v6, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

    .line 25
    .line 26
    sget-object v1, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏世哲:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 27
    .line 28
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lkotlinx/coroutines/channels/飘花落叶言子楪哲世兰苏;

    .line 33
    .line 34
    :cond_3
    :goto_1
    sget-object v2, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 35
    .line 36
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    const-wide v4, 0xfffffffffffffffL

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    and-long/2addr v4, v2

    .line 46
    const/4 v7, 0x0

    .line 47
    invoke-virtual {p0, v2, v3, v7}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰苏哲(JZ)Z

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    sget v9, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 52
    .line 53
    int-to-long v10, v9

    .line 54
    div-long v2, v4, v10

    .line 55
    .line 56
    rem-long v12, v4, v10

    .line 57
    .line 58
    long-to-int v12, v12

    .line 59
    iget-wide v13, v1, Lkotlinx/coroutines/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏:J

    .line 60
    .line 61
    cmp-long v13, v13, v2

    .line 62
    .line 63
    if-eqz v13, :cond_5

    .line 64
    .line 65
    invoke-virtual {p0, v2, v3, v1}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰(JLkotlinx/coroutines/channels/飘花落叶言子楪哲世兰苏;)Lkotlinx/coroutines/channels/飘花落叶言子楪哲世兰苏;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-nez v2, :cond_4

    .line 70
    .line 71
    if-eqz v7, :cond_3

    .line 72
    .line 73
    invoke-virtual {p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏世哲()Ljava/lang/Throwable;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    new-instance v1, Lkotlinx/coroutines/channels/飘花落叶言子楪苏兰世哲;

    .line 78
    .line 79
    invoke-direct {v1, v0}, Lkotlinx/coroutines/channels/飘花落叶言子楪苏兰世哲;-><init>(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    return-object v1

    .line 83
    :cond_4
    move-object v1, v2

    .line 84
    :cond_5
    move-object v0, p0

    .line 85
    move-object/from16 v3, p1

    .line 86
    .line 87
    move v2, v12

    .line 88
    invoke-static/range {v0 .. v7}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;Lkotlinx/coroutines/channels/飘花落叶言子楪哲世兰苏;ILjava/lang/Object;JLjava/lang/Object;Z)I

    .line 89
    .line 90
    .line 91
    move-result v12

    .line 92
    if-eqz v12, :cond_f

    .line 93
    .line 94
    const/4 v3, 0x1

    .line 95
    if-eq v12, v3, :cond_e

    .line 96
    .line 97
    const/4 v3, 0x2

    .line 98
    const/4 v13, 0x0

    .line 99
    if-eq v12, v3, :cond_a

    .line 100
    .line 101
    const/4 v2, 0x3

    .line 102
    if-eq v12, v2, :cond_9

    .line 103
    .line 104
    const/4 v2, 0x4

    .line 105
    if-eq v12, v2, :cond_7

    .line 106
    .line 107
    const/4 v2, 0x5

    .line 108
    if-eq v12, v2, :cond_6

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_6
    invoke-virtual {v1}, Lkotlinx/coroutines/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_7
    sget-object v2, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 116
    .line 117
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    .line 118
    .line 119
    .line 120
    move-result-wide v2

    .line 121
    cmp-long v2, v4, v2

    .line 122
    .line 123
    if-gez v2, :cond_8

    .line 124
    .line 125
    invoke-virtual {v1}, Lkotlinx/coroutines/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()V

    .line 126
    .line 127
    .line 128
    :cond_8
    invoke-virtual {p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏世哲()Ljava/lang/Throwable;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    new-instance v1, Lkotlinx/coroutines/channels/飘花落叶言子楪苏兰世哲;

    .line 133
    .line 134
    invoke-direct {v1, v0}, Lkotlinx/coroutines/channels/飘花落叶言子楪苏兰世哲;-><init>(Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    return-object v1

    .line 138
    :cond_9
    const-string v0, "unexpected"

    .line 139
    .line 140
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return-object v13

    .line 144
    :cond_a
    if-eqz v7, :cond_b

    .line 145
    .line 146
    invoke-virtual {v1}, Lkotlinx/coroutines/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏世哲()Ljava/lang/Throwable;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    new-instance v1, Lkotlinx/coroutines/channels/飘花落叶言子楪苏兰世哲;

    .line 154
    .line 155
    invoke-direct {v1, v0}, Lkotlinx/coroutines/channels/飘花落叶言子楪苏兰世哲;-><init>(Ljava/lang/Throwable;)V

    .line 156
    .line 157
    .line 158
    return-object v1

    .line 159
    :cond_b
    instance-of v3, v6, Lkotlinx/coroutines/飘花落叶言子哲世兰苏楪;

    .line 160
    .line 161
    if-eqz v3, :cond_c

    .line 162
    .line 163
    move-object v13, v6

    .line 164
    check-cast v13, Lkotlinx/coroutines/飘花落叶言子哲世兰苏楪;

    .line 165
    .line 166
    :cond_c
    if-eqz v13, :cond_d

    .line 167
    .line 168
    add-int v12, v2, v9

    .line 169
    .line 170
    invoke-interface {v13, v1, v12}, Lkotlinx/coroutines/飘花落叶言子哲世兰苏楪;->飘花落叶言子楪世苏兰哲(Lkotlinx/coroutines/internal/飘花落叶言子楪哲苏兰世;I)V

    .line 171
    .line 172
    .line 173
    :cond_d
    iget-wide v3, v1, Lkotlinx/coroutines/internal/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏:J

    .line 174
    .line 175
    mul-long/2addr v3, v10

    .line 176
    int-to-long v1, v2

    .line 177
    add-long/2addr v3, v1

    .line 178
    invoke-virtual {p0, v3, v4}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世(J)V

    .line 179
    .line 180
    .line 181
    :cond_e
    return-object v8

    .line 182
    :cond_f
    invoke-virtual {v1}, Lkotlinx/coroutines/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()V

    .line 183
    .line 184
    .line 185
    return-object v8
.end method

.method public final 飘花落叶言子世哲苏兰楪(Lkotlinx/coroutines/selects/飘花落叶言子楪世兰哲苏;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p2, v0}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏兰世;->飘花落叶言子世兰哲苏楪(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    instance-of p2, p0, Lkotlinx/coroutines/channels/飘花落叶言子楪苏兰哲世;

    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    check-cast p0, Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 11
    .line 12
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 13
    .line 14
    invoke-interface {p1, p0}, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    instance-of p0, p0, Lkotlinx/coroutines/channels/飘花落叶言子楪苏兰世哲;

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    sget-object p0, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世:Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

    .line 23
    .line 24
    invoke-interface {p1, p0}, Lkotlinx/coroutines/selects/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    const-string p0, "unreachable"

    .line 29
    .line 30
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final 飘花落叶言子世楪苏哲兰(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏兰世;->飘花落叶言子世兰哲苏楪(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    instance-of p1, p1, Lkotlinx/coroutines/channels/飘花落叶言子楪苏兰世哲;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-virtual {p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏世哲()Ljava/lang/Throwable;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    throw p0
.end method

.method public final 飘花落叶言子世苏楪兰哲()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏兰世;->飘花落叶言子世苏楪哲兰:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 2
    .line 3
    sget-object v0, Lkotlinx/coroutines/channels/BufferOverflow;->DROP_OLDEST:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final 飘花落叶言子楪兰苏哲世(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏兰世;->飘花落叶言子世兰哲苏楪(Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method
