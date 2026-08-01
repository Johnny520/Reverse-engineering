.class public final Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:[Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;

.field public 飘花落叶言子楪世兰苏哲:Z

.field public 飘花落叶言子楪世哲兰苏:I

.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/locks/ReentrantLock;

.field public final 飘花落叶言子楪世苏兰哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

.field public final 飘花落叶言子楪世苏哲兰:I

.field public final 飘花落叶言子楪苏世兰哲:Lkotlin/collections/飘花落叶言子楪苏兰哲世;

.field public final 飘花落叶言子楪苏世哲兰:Lkotlinx/coroutines/sync/飘花落叶言子楪苏世兰哲;


# direct methods
.method public constructor <init>(IL飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:I

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    new-instance p2, Ljava/util/concurrent/locks/ReentrantLock;

    .line 9
    .line 10
    invoke-direct {p2}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/locks/ReentrantLock;

    .line 14
    .line 15
    new-array p2, p1, [Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;

    .line 16
    .line 17
    iput-object p2, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰哲苏:[Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;

    .line 18
    .line 19
    sget p2, Lkotlinx/coroutines/sync/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:I

    .line 20
    .line 21
    new-instance p2, Lkotlinx/coroutines/sync/飘花落叶言子楪苏世兰哲;

    .line 22
    .line 23
    invoke-direct {p2, p1}, Lkotlinx/coroutines/sync/飘花落叶言子楪苏世哲兰;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏世哲兰:Lkotlinx/coroutines/sync/飘花落叶言子楪苏世兰哲;

    .line 27
    .line 28
    new-instance p2, Lkotlin/collections/飘花落叶言子楪苏兰哲世;

    .line 29
    .line 30
    invoke-direct {p2, p1}, Lkotlin/collections/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iput-object p2, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏世兰哲:Lkotlin/collections/飘花落叶言子楪苏兰哲世;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/locks/ReentrantLock;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 7
    .line 8
    .line 9
    :try_start_0
    iget-object v1, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏世兰哲:Lkotlin/collections/飘花落叶言子楪苏兰哲世;

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Lkotlin/collections/飘花落叶言子楪苏兰哲世;->addLast(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏世哲兰:Lkotlinx/coroutines/sync/飘花落叶言子楪苏世兰哲;

    .line 18
    .line 19
    invoke-virtual {p0}, Lkotlinx/coroutines/sync/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 25
    .line 26
    .line 27
    throw p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Ljava/lang/StringBuilder;)V
    .locals 12

    .line 1
    const-string v0, ", "

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏世兰哲:Lkotlin/collections/飘花落叶言子楪苏兰哲世;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/locks/ReentrantLock;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-static {}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏兰世哲()Lkotlin/collections/builders/ListBuilder;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v1}, Lkotlin/collections/飘花落叶言子楪苏世兰哲;->size()I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    const/4 v5, 0x0

    .line 19
    move v6, v5

    .line 20
    :goto_0
    if-ge v6, v4, :cond_0

    .line 21
    .line 22
    invoke-virtual {v1, v6}, Lkotlin/collections/飘花落叶言子楪苏兰哲世;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    add-int/lit8 v6, v6, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    move-object p0, v0

    .line 34
    goto/16 :goto_3

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v3}, Lkotlin/collections/builders/ListBuilder;->build()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    const/16 v3, 0x9

    .line 46
    .line 47
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v3, " ("

    .line 58
    .line 59
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    new-instance v1, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    const-string v3, "capacity="

    .line 75
    .line 76
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget v3, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:I

    .line 80
    .line 81
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    new-instance v1, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    const-string v3, "permits="

    .line 100
    .line 101
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    iget-object v3, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏世哲兰:Lkotlinx/coroutines/sync/飘花落叶言子楪苏世兰哲;

    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    sget-object v4, Lkotlinx/coroutines/sync/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 110
    .line 111
    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    new-instance v0, Ljava/lang/StringBuilder;

    .line 133
    .line 134
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 135
    .line 136
    .line 137
    const-string v1, "queue=(size="

    .line 138
    .line 139
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    const-string v1, ")["

    .line 150
    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const/4 v10, 0x0

    .line 155
    const/16 v11, 0x3f

    .line 156
    .line 157
    const/4 v7, 0x0

    .line 158
    const/4 v8, 0x0

    .line 159
    const/4 v9, 0x0

    .line 160
    invoke-static/range {v6 .. v11}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲世楪苏兰(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;I)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const/16 v1, 0x5d

    .line 168
    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const-string v0, ")"

    .line 180
    .line 181
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const/16 v0, 0xa

    .line 185
    .line 186
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    iget-object p0, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰哲苏:[Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;

    .line 190
    .line 191
    array-length v1, p0

    .line 192
    move v3, v5

    .line 193
    :goto_1
    if-ge v5, v1, :cond_3

    .line 194
    .line 195
    aget-object v4, p0, v5

    .line 196
    .line 197
    add-int/lit8 v3, v3, 0x1

    .line 198
    .line 199
    new-instance v6, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 202
    .line 203
    .line 204
    const-string v7, "\t\t["

    .line 205
    .line 206
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    const-string v7, "] - "

    .line 213
    .line 214
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    if-eqz v4, :cond_1

    .line 218
    .line 219
    iget-object v7, v4, Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;

    .line 220
    .line 221
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    goto :goto_2

    .line 226
    :cond_1
    const/4 v7, 0x0

    .line 227
    :goto_2
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    if-eqz v4, :cond_2

    .line 241
    .line 242
    invoke-virtual {v4, p1}, Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/StringBuilder;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 243
    .line 244
    .line 245
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 246
    .line 247
    goto :goto_1

    .line 248
    :cond_3
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 249
    .line 250
    .line 251
    return-void

    .line 252
    :goto_3
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 253
    .line 254
    .line 255
    throw p0
.end method

.method public final 飘花落叶言子楪世哲苏兰()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/locks/ReentrantLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    :try_start_0
    iput-boolean v1, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲:Z

    .line 8
    .line 9
    iget-object p0, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰哲苏:[Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;

    .line 10
    .line 11
    array-length v1, p0

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v1, :cond_1

    .line 14
    .line 15
    aget-object v3, p0, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {v3}, Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_2

    .line 25
    :cond_0
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :goto_2
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 33
    .line 34
    .line 35
    throw p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(JLandroidx/compose/foundation/selection/飘花落叶言子楪世哲苏兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p4, Landroidx/room/coroutines/Pool$acquireWithTimeout$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Landroidx/room/coroutines/Pool$acquireWithTimeout$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/room/coroutines/Pool$acquireWithTimeout$1;->label:I

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
    iput v1, v0, Landroidx/room/coroutines/Pool$acquireWithTimeout$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/room/coroutines/Pool$acquireWithTimeout$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Landroidx/room/coroutines/Pool$acquireWithTimeout$1;-><init>(Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Landroidx/room/coroutines/Pool$acquireWithTimeout$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Landroidx/room/coroutines/Pool$acquireWithTimeout$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-wide p1, v0, Landroidx/room/coroutines/Pool$acquireWithTimeout$1;->J$0:J

    .line 38
    .line 39
    iget-object p3, v0, Landroidx/room/coroutines/Pool$acquireWithTimeout$1;->L$1:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 42
    .line 43
    iget-object v2, v0, Landroidx/room/coroutines/Pool$acquireWithTimeout$1;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v2, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 46
    .line 47
    :try_start_0
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :catchall_0
    move-exception p4

    .line 52
    goto :goto_4

    .line 53
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v4

    .line 59
    :cond_2
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :goto_1
    new-instance p4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 63
    .line 64
    invoke-direct {p4}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 65
    .line 66
    .line 67
    :try_start_1
    new-instance v2, Landroidx/room/coroutines/Pool$acquireWithTimeout$2;

    .line 68
    .line 69
    invoke-direct {v2, p4, p0, v4}, Landroidx/room/coroutines/Pool$acquireWithTimeout$2;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 70
    .line 71
    .line 72
    iput-object p3, v0, Landroidx/room/coroutines/Pool$acquireWithTimeout$1;->L$0:Ljava/lang/Object;

    .line 73
    .line 74
    iput-object p4, v0, Landroidx/room/coroutines/Pool$acquireWithTimeout$1;->L$1:Ljava/lang/Object;

    .line 75
    .line 76
    iput-wide p1, v0, Landroidx/room/coroutines/Pool$acquireWithTimeout$1;->J$0:J

    .line 77
    .line 78
    iput v3, v0, Landroidx/room/coroutines/Pool$acquireWithTimeout$1;->label:I

    .line 79
    .line 80
    invoke-static {p1, p2}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲楪苏兰(J)J

    .line 81
    .line 82
    .line 83
    move-result-wide v5

    .line 84
    const-wide/16 v7, 0x0

    .line 85
    .line 86
    cmp-long v7, v5, v7

    .line 87
    .line 88
    if-lez v7, :cond_4

    .line 89
    .line 90
    new-instance v7, Lkotlinx/coroutines/飘花落叶言子哲世兰楪苏;

    .line 91
    .line 92
    invoke-direct {v7, v5, v6, v0}, Lkotlinx/coroutines/飘花落叶言子哲世兰楪苏;-><init>(JLkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v7, v2}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世苏兰楪哲(Lkotlinx/coroutines/飘花落叶言子哲世兰楪苏;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    sget-object v5, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 100
    .line 101
    if-ne v2, v1, :cond_3

    .line 102
    .line 103
    return-object v1

    .line 104
    :cond_3
    move-object v2, p3

    .line 105
    move-object p3, p4

    .line 106
    :goto_2
    move-object p4, p3

    .line 107
    move-object p3, v2

    .line 108
    move-object v2, v0

    .line 109
    move-object v0, v4

    .line 110
    goto :goto_5

    .line 111
    :cond_4
    new-instance v2, Lkotlinx/coroutines/TimeoutCancellationException;

    .line 112
    .line 113
    const-string v5, "Timed out immediately"

    .line 114
    .line 115
    invoke-direct {v2, v5}, Lkotlinx/coroutines/TimeoutCancellationException;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 119
    :goto_3
    move-object v9, v2

    .line 120
    move-object v2, p3

    .line 121
    move-object p3, p4

    .line 122
    move-object p4, v9

    .line 123
    goto :goto_4

    .line 124
    :catchall_1
    move-exception v2

    .line 125
    goto :goto_3

    .line 126
    :goto_4
    move-object v9, p4

    .line 127
    move-object p4, p3

    .line 128
    move-object p3, v2

    .line 129
    move-object v2, v0

    .line 130
    move-object v0, v9

    .line 131
    :goto_5
    :try_start_2
    instance-of v5, v0, Lkotlinx/coroutines/TimeoutCancellationException;

    .line 132
    .line 133
    if-eqz v5, :cond_5

    .line 134
    .line 135
    invoke-interface {p3}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    goto :goto_6

    .line 139
    :catchall_2
    move-exception p1

    .line 140
    goto :goto_7

    .line 141
    :cond_5
    if-nez v0, :cond_7

    .line 142
    .line 143
    iget-object p4, p4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 144
    .line 145
    if-eqz p4, :cond_6

    .line 146
    .line 147
    return-object p4

    .line 148
    :cond_6
    :goto_6
    move-object v0, v2

    .line 149
    goto :goto_1

    .line 150
    :cond_7
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 151
    :goto_7
    iget-object p2, p4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast p2, Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;

    .line 154
    .line 155
    if-eqz p2, :cond_8

    .line 156
    .line 157
    invoke-virtual {p0, p2}, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲(Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;)V

    .line 158
    .line 159
    .line 160
    :cond_8
    throw p1
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏世兰哲:Lkotlin/collections/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    instance-of v1, p1, Landroidx/room/coroutines/Pool$acquire$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Landroidx/room/coroutines/Pool$acquire$1;

    .line 9
    .line 10
    iget v2, v1, Landroidx/room/coroutines/Pool$acquire$1;->label:I

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
    iput v2, v1, Landroidx/room/coroutines/Pool$acquire$1;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Landroidx/room/coroutines/Pool$acquire$1;

    .line 23
    .line 24
    invoke-direct {v1, p0, p1}, Landroidx/room/coroutines/Pool$acquire$1;-><init>(Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v1, Landroidx/room/coroutines/Pool$acquire$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 30
    .line 31
    iget v3, v1, Landroidx/room/coroutines/Pool$acquire$1;->label:I

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    iget-object v5, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏世哲兰:Lkotlinx/coroutines/sync/飘花落叶言子楪苏世兰哲;

    .line 35
    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    if-ne v3, v6, :cond_1

    .line 40
    .line 41
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_4

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v4

    .line 51
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iput v6, v1, Landroidx/room/coroutines/Pool$acquire$1;->label:I

    .line 55
    .line 56
    iget p1, v5, Lkotlinx/coroutines/sync/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 57
    .line 58
    sget-object v3, Lkotlinx/coroutines/sync/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 59
    .line 60
    :cond_3
    invoke-virtual {v3, v5}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-gt v6, p1, :cond_3

    .line 65
    .line 66
    sget-object v7, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 67
    .line 68
    if-lez v6, :cond_4

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    invoke-static {v1}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪苏哲兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-static {v1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏哲世(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :try_start_0
    invoke-virtual {v5, v1}, Lkotlinx/coroutines/sync/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Lkotlinx/coroutines/飘花落叶言子哲苏世楪兰;)Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-nez v6, :cond_7

    .line 84
    .line 85
    :cond_5
    invoke-virtual {v3, v5}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-gt v6, p1, :cond_5

    .line 90
    .line 91
    if-lez v6, :cond_6

    .line 92
    .line 93
    iget-object p1, v5, Lkotlinx/coroutines/sync/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Landroidx/compose/foundation/飘花落叶言子苏楪世哲兰;

    .line 94
    .line 95
    invoke-virtual {v1, v7, p1}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_6
    invoke-virtual {v5, v1}, Lkotlinx/coroutines/sync/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Lkotlinx/coroutines/飘花落叶言子哲苏世楪兰;)Z

    .line 100
    .line 101
    .line 102
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 103
    if-eqz v6, :cond_5

    .line 104
    .line 105
    :cond_7
    :goto_1
    invoke-virtual {v1}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 110
    .line 111
    if-ne p1, v1, :cond_8

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_8
    move-object p1, v7

    .line 115
    :goto_2
    if-ne p1, v1, :cond_9

    .line 116
    .line 117
    move-object v7, p1

    .line 118
    :cond_9
    :goto_3
    if-ne v7, v2, :cond_a

    .line 119
    .line 120
    return-object v2

    .line 121
    :cond_a
    :goto_4
    :try_start_1
    iget-object p1, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/locks/ReentrantLock;

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    .line 125
    .line 126
    :try_start_2
    iget-boolean v1, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲:Z

    .line 127
    .line 128
    if-nez v1, :cond_d

    .line 129
    .line 130
    invoke-virtual {v0}, Lkotlin/collections/飘花落叶言子楪苏兰哲世;->isEmpty()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_c

    .line 135
    .line 136
    iget v1, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏:I

    .line 137
    .line 138
    iget v2, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:I

    .line 139
    .line 140
    if-lt v1, v2, :cond_b

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_b
    new-instance v1, Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;

    .line 144
    .line 145
    iget-object v2, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 146
    .line 147
    invoke-interface {v2}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    check-cast v2, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;

    .line 152
    .line 153
    invoke-direct {v1, v2}, Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;-><init>(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;)V

    .line 154
    .line 155
    .line 156
    iget-object v2, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰哲苏:[Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;

    .line 157
    .line 158
    iget v3, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏:I

    .line 159
    .line 160
    add-int/lit8 v4, v3, 0x1

    .line 161
    .line 162
    iput v4, p0, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏:I

    .line 163
    .line 164
    aput-object v1, v2, v3

    .line 165
    .line 166
    invoke-virtual {v0, v1}, Lkotlin/collections/飘花落叶言子楪苏兰哲世;->addLast(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    :cond_c
    :goto_5
    invoke-virtual {v0}, Lkotlin/collections/飘花落叶言子楪苏兰哲世;->removeLast()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    check-cast p0, Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 174
    .line 175
    :try_start_3
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 176
    .line 177
    .line 178
    return-object p0

    .line 179
    :catchall_0
    move-exception p0

    .line 180
    goto :goto_7

    .line 181
    :catchall_1
    move-exception p0

    .line 182
    goto :goto_6

    .line 183
    :cond_d
    :try_start_4
    const-string p0, "Connection pool is closed"

    .line 184
    .line 185
    const/16 v0, 0x15

    .line 186
    .line 187
    invoke-static {v0, p0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏世楪兰哲(ILjava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 191
    :goto_6
    :try_start_5
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 192
    .line 193
    .line 194
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 195
    :goto_7
    invoke-virtual {v5}, Lkotlinx/coroutines/sync/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏()V

    .line 196
    .line 197
    .line 198
    throw p0

    .line 199
    :catchall_2
    move-exception p0

    .line 200
    invoke-virtual {v1}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪兰苏哲()V

    .line 201
    .line 202
    .line 203
    throw p0
.end method
