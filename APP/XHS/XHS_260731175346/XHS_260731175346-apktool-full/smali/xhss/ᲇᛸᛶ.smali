.class public final Lxhss/ᲇᛸᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛳᛵᛲᲁ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public ᛳᲁᲇᛸ:Ljava/lang/Object;

.field public ᛷᛴᛷᛱ:Ljava/lang/Object;

.field public ᲇᛴᲇᛵ:Ljava/lang/Object;

.field public ᲇᛶᛴᲀ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Lxhss/ᲇᛸᛶ;->ᛱᛱᛲᲇ:I

    packed-switch p1, :pswitch_data_0

    .line 217
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 218
    new-instance p1, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object p1, p0, Lxhss/ᲇᛸᛶ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 219
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    return-void

    .line 220
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 221
    sget-object p1, Lxhss/ᛳᛴᲀᲁ;->ᛸᛲᲀᛵ:Lxhss/ᛳᛴᲀᲁ;

    iput-object p1, p0, Lxhss/ᲇᛸᛶ;->ᲇᛶᛴᲀ:Ljava/lang/Object;

    .line 222
    const-string p1, "GET"

    iput-object p1, p0, Lxhss/ᲇᛸᛶ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 223
    new-instance p1, Lxhss/ᛴᲈᛱᲁ;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lxhss/ᛴᲈᛱᲁ;-><init>(I)V

    iput-object p1, p0, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    return-void

    .line 224
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 225
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lxhss/ᲇᛸᛶ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 226
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 227
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lxhss/ᲇᛸᛶ;->ᲇᛶᛴᲀ:Ljava/lang/Object;

    return-void

    .line 228
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public constructor <init>(Landroid/graphics/Typeface;Lxhss/ᲁᛸᛱᲀ;)V
    .locals 8

    .line 1
    const/4 v0, 0x4

    .line 2
    iput v0, p0, Lxhss/ᲇᛸᛶ;->ᛱᛱᛲᲇ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lxhss/ᲇᛸᛶ;->ᲇᛶᛴᲀ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lxhss/ᲇᛸᛶ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance p1, Lxhss/ᲈᛲᛷᛳ;

    .line 12
    .line 13
    const/16 v1, 0x400

    .line 14
    .line 15
    invoke-direct {p1, v1}, Lxhss/ᲈᛲᛷᛳ;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 19
    .line 20
    const/4 p1, 0x6

    .line 21
    invoke-virtual {p2, p1}, Lxhss/ᛵᛶᛲᛵ;->ᛷᛵᛵᲈ(I)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    iget v3, p2, Lxhss/ᛵᛶᛲᛵ;->ᛱᛱᛲᲇ:I

    .line 29
    .line 30
    add-int/2addr v1, v3

    .line 31
    iget-object v3, p2, Lxhss/ᛵᛶᛲᛵ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 34
    .line 35
    invoke-virtual {v3, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    add-int/2addr v3, v1

    .line 40
    iget-object v1, p2, Lxhss/ᛵᛶᛲᛵ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 43
    .line 44
    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move v1, v2

    .line 50
    :goto_0
    mul-int/lit8 v1, v1, 0x2

    .line 51
    .line 52
    new-array v1, v1, [C

    .line 53
    .line 54
    iput-object v1, p0, Lxhss/ᲇᛸᛶ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 55
    .line 56
    invoke-virtual {p2, p1}, Lxhss/ᛵᛶᛲᛵ;->ᛷᛵᛵᲈ(I)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    iget v1, p2, Lxhss/ᛵᛶᛲᛵ;->ᛱᛱᛲᲇ:I

    .line 63
    .line 64
    add-int/2addr p1, v1

    .line 65
    iget-object v1, p2, Lxhss/ᛵᛶᛲᛵ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 68
    .line 69
    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    add-int/2addr v1, p1

    .line 74
    iget-object p1, p2, Lxhss/ᛵᛶᛲᛵ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 77
    .line 78
    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    goto :goto_1

    .line 83
    :cond_1
    move p1, v2

    .line 84
    :goto_1
    move p2, v2

    .line 85
    :goto_2
    if-ge p2, p1, :cond_7

    .line 86
    .line 87
    new-instance v1, Lxhss/ᛵᛵᲇᛷ;

    .line 88
    .line 89
    invoke-direct {v1, p0, p2}, Lxhss/ᛵᛵᲇᛷ;-><init>(Lxhss/ᲇᛸᛶ;I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Lxhss/ᛵᛵᲇᛷ;->ᛱᛱᛲᲇ()Lxhss/ᛲᲀᛴᲇ;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v3, v0}, Lxhss/ᛵᛶᛲᛵ;->ᛷᛵᛵᲈ(I)I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-eqz v4, :cond_2

    .line 101
    .line 102
    iget-object v5, v3, Lxhss/ᛵᛶᛲᛵ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v5, Ljava/nio/ByteBuffer;

    .line 105
    .line 106
    iget v3, v3, Lxhss/ᛵᛶᛲᛵ;->ᛱᛱᛲᲇ:I

    .line 107
    .line 108
    add-int/2addr v4, v3

    .line 109
    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    goto :goto_3

    .line 114
    :cond_2
    move v3, v2

    .line 115
    :goto_3
    iget-object v4, p0, Lxhss/ᲇᛸᛶ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v4, [C

    .line 118
    .line 119
    mul-int/lit8 v5, p2, 0x2

    .line 120
    .line 121
    invoke-static {v3, v4, v5}, Ljava/lang/Character;->toChars(I[CI)I

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Lxhss/ᛵᛵᲇᛷ;->ᛱᛱᛲᲇ()Lxhss/ᛲᲀᛴᲇ;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    const/16 v4, 0x10

    .line 129
    .line 130
    invoke-virtual {v3, v4}, Lxhss/ᛵᛶᛲᛵ;->ᛷᛵᛵᲈ(I)I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-eqz v5, :cond_3

    .line 135
    .line 136
    iget v6, v3, Lxhss/ᛵᛶᛲᛵ;->ᛱᛱᛲᲇ:I

    .line 137
    .line 138
    add-int/2addr v5, v6

    .line 139
    iget-object v6, v3, Lxhss/ᛵᛶᛲᛵ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v6, Ljava/nio/ByteBuffer;

    .line 142
    .line 143
    invoke-virtual {v6, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    add-int/2addr v6, v5

    .line 148
    iget-object v3, v3, Lxhss/ᛵᛶᛲᛵ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 151
    .line 152
    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    goto :goto_4

    .line 157
    :cond_3
    move v3, v2

    .line 158
    :goto_4
    const/4 v5, 0x1

    .line 159
    if-lez v3, :cond_4

    .line 160
    .line 161
    move v3, v5

    .line 162
    goto :goto_5

    .line 163
    :cond_4
    move v3, v2

    .line 164
    :goto_5
    if-eqz v3, :cond_6

    .line 165
    .line 166
    iget-object v3, p0, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v3, Lxhss/ᲈᛲᛷᛳ;

    .line 169
    .line 170
    invoke-virtual {v1}, Lxhss/ᛵᛵᲇᛷ;->ᛱᛱᛲᲇ()Lxhss/ᛲᲀᛴᲇ;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    invoke-virtual {v6, v4}, Lxhss/ᛵᛶᛲᛵ;->ᛷᛵᛵᲈ(I)I

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    if-eqz v4, :cond_5

    .line 179
    .line 180
    iget v7, v6, Lxhss/ᛵᛶᛲᛵ;->ᛱᛱᛲᲇ:I

    .line 181
    .line 182
    add-int/2addr v4, v7

    .line 183
    iget-object v7, v6, Lxhss/ᛵᛶᛲᛵ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v7, Ljava/nio/ByteBuffer;

    .line 186
    .line 187
    invoke-virtual {v7, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 188
    .line 189
    .line 190
    move-result v7

    .line 191
    add-int/2addr v7, v4

    .line 192
    iget-object v4, v6, Lxhss/ᛵᛶᛲᛵ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v4, Ljava/nio/ByteBuffer;

    .line 195
    .line 196
    invoke-virtual {v4, v7}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    goto :goto_6

    .line 201
    :cond_5
    move v4, v2

    .line 202
    :goto_6
    sub-int/2addr v4, v5

    .line 203
    invoke-virtual {v3, v1, v2, v4}, Lxhss/ᲈᛲᛷᛳ;->ᛷᛵᛵᲈ(Lxhss/ᛵᛵᲇᛷ;II)V

    .line 204
    .line 205
    .line 206
    add-int/lit8 p2, p2, 0x1

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_6
    const-string p0, "invalid metadata codepoint length"

    .line 210
    .line 211
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    const/4 p0, 0x0

    .line 215
    throw p0

    .line 216
    :cond_7
    return-void
.end method

.method public constructor <init>(Ljava/net/Socket;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lxhss/ᲇᛸᛶ;->ᛱᛱᛲᲇ:I

    .line 229
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxhss/ᲇᛸᛶ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 230
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lxhss/ᲇᛸᛶ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 231
    new-instance p1, Lxhss/ᛸᲇᲈᛶ;

    invoke-direct {p1, p0}, Lxhss/ᛸᲇᲈᛶ;-><init>(Lxhss/ᲇᛸᛶ;)V

    iput-object p1, p0, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 232
    new-instance p1, Lxhss/ᛲᛶᲈᲀ;

    invoke-direct {p1, p0}, Lxhss/ᛲᛶᲈᲀ;-><init>(Lxhss/ᲇᛸᛶ;)V

    iput-object p1, p0, Lxhss/ᲇᛸᛶ;->ᲇᛶᛴᲀ:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Z)V
    .locals 0

    .line 233
    const/4 p1, 0x5

    iput p1, p0, Lxhss/ᲇᛸᛶ;->ᛱᛱᛲᲇ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lxhss/ᲇᛸᛶ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lxhss/ᲇᛸᛶ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/net/Socket;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/net/Socket;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public declared-synchronized ᛱᛱᛲᲇ()Ljava/util/concurrent/ExecutorService;
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lxhss/ᲇᛸᛶ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 9
    .line 10
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 11
    .line 12
    new-instance v7, Ljava/util/concurrent/SynchronousQueue;

    .line 13
    .line 14
    invoke-direct {v7}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    sget-object v2, Lxhss/ᛶᛴᲀᛲ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v2, " Dispatcher"

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v8, Lxhss/ᛸᛴᲇᛵ;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-direct {v8, v0, v2}, Lxhss/ᛸᛴᲇᛵ;-><init>(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    const v3, 0x7fffffff

    .line 44
    .line 45
    .line 46
    const-wide/16 v4, 0x3c

    .line 47
    .line 48
    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 49
    .line 50
    .line 51
    iput-object v1, p0, Lxhss/ᲇᛸᛶ;->ᛳᲁᲇᛸ:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    move-object v0, v1

    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    goto :goto_1

    .line 57
    :cond_0
    :goto_0
    monitor-exit p0

    .line 58
    return-object v0

    .line 59
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    throw v0
.end method

.method public ᛳᲁᲇᛸ(Lxhss/ᛸᲇᲇᛶ;)V
    .locals 5

    .line 1
    sget-object v0, Lxhss/ᛶᛴᲀᛲ;->ᛷᛵᛵᲈ:Ljava/util/TimeZone;

    .line 2
    .line 3
    invoke-virtual {p0}, Lxhss/ᲇᛸᛶ;->ᛱᛱᛲᲇ()Ljava/util/concurrent/ExecutorService;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    monitor-enter p0

    .line 12
    :try_start_0
    iget-object v1, p0, Lxhss/ᲇᛸᛶ;->ᲇᛶᛴᲀ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/util/ArrayDeque;

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_9

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object p1, p0, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/util/ArrayDeque;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    goto/16 :goto_3

    .line 37
    .line 38
    :cond_0
    :goto_0
    iget-object p1, p0, Lxhss/ᲇᛸᛶ;->ᲇᛶᛴᲀ:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Ljava/util/ArrayDeque;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    :cond_1
    const/4 p1, 0x6

    .line 47
    const/4 v1, 0x0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    iget-object v2, p0, Lxhss/ᲇᛸᛶ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Ljava/util/ArrayDeque;

    .line 53
    .line 54
    invoke-static {v2}, Lxhss/ᛷᲇᛵᛳ;->ᛴᲈᲀᲀ(Ljava/util/Collection;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    iget-object v3, p0, Lxhss/ᲇᛸᛶ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v3, Ljava/util/ArrayDeque;

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->clear()V

    .line 63
    .line 64
    .line 65
    new-instance v3, Lxhss/ᲇᛵᛲᲁ;

    .line 66
    .line 67
    invoke-direct {v3, p1, v2}, Lxhss/ᲇᛵᛲᲁ;-><init>(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    new-instance v2, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    iget-object v3, p0, Lxhss/ᲇᛸᛶ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v3, Ljava/util/ArrayDeque;

    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-eqz v4, :cond_5

    .line 89
    .line 90
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    if-nez v3, :cond_4

    .line 95
    .line 96
    iget-object v3, p0, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v3, Ljava/util/ArrayDeque;

    .line 99
    .line 100
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->size()I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    const/16 v4, 0x40

    .line 105
    .line 106
    if-lt v3, v4, :cond_3

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    throw v1

    .line 110
    :cond_4
    new-instance p1, Ljava/lang/ClassCastException;

    .line 111
    .line 112
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 113
    .line 114
    .line 115
    throw p1

    .line 116
    :cond_5
    :goto_1
    new-instance v3, Lxhss/ᲇᛵᛲᲁ;

    .line 117
    .line 118
    invoke-direct {v3, p1, v2}, Lxhss/ᲇᛵᛲᲁ;-><init>(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    .line 120
    .line 121
    :goto_2
    monitor-exit p0

    .line 122
    iget-object p1, v3, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast p1, Ljava/util/List;

    .line 125
    .line 126
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-lez p1, :cond_8

    .line 131
    .line 132
    iget-object p1, v3, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast p1, Ljava/util/List;

    .line 135
    .line 136
    const/4 v2, 0x0

    .line 137
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    if-nez p1, :cond_7

    .line 142
    .line 143
    if-eqz v0, :cond_6

    .line 144
    .line 145
    throw v1

    .line 146
    :cond_6
    invoke-virtual {p0}, Lxhss/ᲇᛸᛶ;->ᛱᛱᛲᲇ()Ljava/util/concurrent/ExecutorService;

    .line 147
    .line 148
    .line 149
    throw v1

    .line 150
    :cond_7
    new-instance p0, Ljava/lang/ClassCastException;

    .line 151
    .line 152
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 153
    .line 154
    .line 155
    throw p0

    .line 156
    :cond_8
    return-void

    .line 157
    :cond_9
    :try_start_1
    const-string p1, "Call wasn\'t in-flight!"

    .line 158
    .line 159
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 160
    .line 161
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 165
    :goto_3
    monitor-exit p0

    .line 166
    throw p1
.end method

.method public ᛷᛴᛷᛱ()Lxhss/ᲇᲁᲀᲇ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxhss/ᛸᲇᲈᛶ;

    .line 4
    .line 5
    return-object p0
.end method

.method public ᛷᛵᛵᲈ()Lxhss/ᲀᛲᲇ;
    .locals 4

    .line 1
    iget-object v0, p0, Lxhss/ᲇᛸᛶ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lxhss/ᲇᛵᛲᲁ;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lxhss/ᲇᛸᛶ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lxhss/ᛵᛴᛷᛵ;

    .line 10
    .line 11
    if-nez v1, :cond_3

    .line 12
    .line 13
    :cond_0
    sget-object v1, Lxhss/ᛶᛳᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛶᛳᛳ;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v0, Lxhss/ᲇᛵᛲᲁ;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {v0, v2}, Lxhss/ᲇᛵᛲᲁ;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lxhss/ᲇᛸᛶ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 27
    .line 28
    :cond_1
    iget-object v2, p0, Lxhss/ᲇᛸᛶ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Lxhss/ᛵᛴᛷᛵ;

    .line 31
    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    iget-object v1, v1, Lxhss/ᛶᛳᛳ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛴᛷᛵ;

    .line 35
    .line 36
    iput-object v1, p0, Lxhss/ᲇᛸᛶ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    move-object v1, v2

    .line 40
    :cond_3
    :goto_0
    new-instance v2, Lxhss/ᲀᛲᲇ;

    .line 41
    .line 42
    iget-object v3, p0, Lxhss/ᲇᛸᛶ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, Ljava/util/EnumSet;

    .line 45
    .line 46
    iget-object p0, p0, Lxhss/ᲇᛸᛶ;->ᲇᛶᛴᲀ:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v2, v0, v1, v3, p0}, Lxhss/ᲀᛲᲇ;-><init>(Lxhss/ᲇᛵᛲᲁ;Lxhss/ᛵᛴᛷᛵ;Ljava/util/EnumSet;Ljava/util/ArrayList;)V

    .line 51
    .line 52
    .line 53
    return-object v2
.end method

.method public ᲀᲇᛳᲁ(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "ws:"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p1, v0, v1}, Lxhss/ᛲᲈᛷᛸ;->ᛱᛱᛴᲀ(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "http:"

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string v0, "wss:"

    .line 23
    .line 24
    invoke-static {p1, v0, v1}, Lxhss/ᛲᲈᛷᛸ;->ᛱᛱᛴᲀ(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x4

    .line 31
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string v0, "https:"

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :cond_1
    :goto_0
    new-instance v0, Lxhss/ᛴᲇᛴᛱ;

    .line 42
    .line 43
    invoke-direct {v0}, Lxhss/ᛴᲇᛴᛱ;-><init>()V

    .line 44
    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-virtual {v0, v1, p1}, Lxhss/ᛴᲇᛴᛱ;->ᛳᲁᲇᛸ(Lxhss/ᛷᛶᲁᛵ;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lxhss/ᛴᲇᛴᛱ;->ᛷᛵᛵᲈ()Lxhss/ᛷᛶᲁᛵ;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, p0, Lxhss/ᲇᛸᛶ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 55
    .line 56
    return-void
.end method

.method public ᲇᛴᲇᛵ()Lxhss/ᛱᲁᛷᲁ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲇᛸᛶ;->ᲇᛶᛴᲀ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxhss/ᛲᛶᲈᲀ;

    .line 4
    .line 5
    return-object p0
.end method

.method public ᲇᛶᛴᲀ(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_1

    .line 6
    .line 7
    const-string v0, "POST"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const-string v0, "PUT"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    const-string v0, "PATCH"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    const-string v0, "PROPPATCH"

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    const-string v0, "QUERY"

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_0

    .line 46
    .line 47
    const-string v0, "REPORT"

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_0

    .line 54
    .line 55
    iput-object p1, p0, Lxhss/ᲇᛸᛶ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    const-string p0, "method "

    .line 59
    .line 60
    const-string v0, " must have a request body."

    .line 61
    .line 62
    invoke-static {p0, p1, v0}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᛴᲈ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛱᛱᛲᲇ(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_1
    const-string p0, "method.isEmpty() == true"

    .line 71
    .line 72
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method
