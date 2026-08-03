.class public Lhb/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li/q1;
.implements Lu4/h;
.implements Lz0/g;


# instance fields
.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/graphics/Typeface;Lm3/b;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhb/c;->j:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lhb/c;->g:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance p1, Ll3/t;

    .line 9
    .line 10
    const/16 v0, 0x400

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ll3/t;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lhb/c;->i:Ljava/lang/Object;

    .line 16
    .line 17
    const/4 p1, 0x6

    .line 18
    invoke-virtual {p2, p1}, Lm3/c;->a(I)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget v2, p2, Lm3/c;->g:I

    .line 26
    .line 27
    add-int/2addr v0, v2

    .line 28
    iget-object v2, p2, Lm3/c;->j:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Ljava/nio/ByteBuffer;

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    add-int/2addr v2, v0

    .line 37
    iget-object v0, p2, Lm3/c;->j:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move v0, v1

    .line 47
    :goto_0
    mul-int/lit8 v0, v0, 0x2

    .line 48
    .line 49
    new-array v0, v0, [C

    .line 50
    .line 51
    iput-object v0, p0, Lhb/c;->h:Ljava/lang/Object;

    .line 52
    .line 53
    invoke-virtual {p2, p1}, Lm3/c;->a(I)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_1

    .line 58
    .line 59
    iget v0, p2, Lm3/c;->g:I

    .line 60
    .line 61
    add-int/2addr p1, v0

    .line 62
    iget-object v0, p2, Lm3/c;->j:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    add-int/2addr v0, p1

    .line 71
    iget-object p1, p2, Lm3/c;->j:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    goto :goto_1

    .line 80
    :cond_1
    move p1, v1

    .line 81
    :goto_1
    move p2, v1

    .line 82
    :goto_2
    if-ge p2, p1, :cond_7

    .line 83
    .line 84
    new-instance v0, Ll3/u;

    .line 85
    .line 86
    invoke-direct {v0, p0, p2}, Ll3/u;-><init>(Lhb/c;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ll3/u;->b()Lm3/a;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    const/4 v3, 0x4

    .line 94
    invoke-virtual {v2, v3}, Lm3/c;->a(I)I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_2

    .line 99
    .line 100
    iget-object v4, v2, Lm3/c;->j:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v4, Ljava/nio/ByteBuffer;

    .line 103
    .line 104
    iget v2, v2, Lm3/c;->g:I

    .line 105
    .line 106
    add-int/2addr v3, v2

    .line 107
    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    goto :goto_3

    .line 112
    :cond_2
    move v2, v1

    .line 113
    :goto_3
    iget-object v3, p0, Lhb/c;->h:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v3, [C

    .line 116
    .line 117
    mul-int/lit8 v4, p2, 0x2

    .line 118
    .line 119
    invoke-static {v2, v3, v4}, Ljava/lang/Character;->toChars(I[CI)I

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Ll3/u;->b()Lm3/a;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    const/16 v3, 0x10

    .line 127
    .line 128
    invoke-virtual {v2, v3}, Lm3/c;->a(I)I

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-eqz v4, :cond_3

    .line 133
    .line 134
    iget v5, v2, Lm3/c;->g:I

    .line 135
    .line 136
    add-int/2addr v4, v5

    .line 137
    iget-object v5, v2, Lm3/c;->j:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v5, Ljava/nio/ByteBuffer;

    .line 140
    .line 141
    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    add-int/2addr v5, v4

    .line 146
    iget-object v2, v2, Lm3/c;->j:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v2, Ljava/nio/ByteBuffer;

    .line 149
    .line 150
    invoke-virtual {v2, v5}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    goto :goto_4

    .line 155
    :cond_3
    move v2, v1

    .line 156
    :goto_4
    const/4 v4, 0x1

    .line 157
    if-lez v2, :cond_4

    .line 158
    .line 159
    move v2, v4

    .line 160
    goto :goto_5

    .line 161
    :cond_4
    move v2, v1

    .line 162
    :goto_5
    if-eqz v2, :cond_6

    .line 163
    .line 164
    iget-object v2, p0, Lhb/c;->i:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v2, Ll3/t;

    .line 167
    .line 168
    invoke-virtual {v0}, Ll3/u;->b()Lm3/a;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-virtual {v5, v3}, Lm3/c;->a(I)I

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-eqz v3, :cond_5

    .line 177
    .line 178
    iget v6, v5, Lm3/c;->g:I

    .line 179
    .line 180
    add-int/2addr v3, v6

    .line 181
    iget-object v6, v5, Lm3/c;->j:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v6, Ljava/nio/ByteBuffer;

    .line 184
    .line 185
    invoke-virtual {v6, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 186
    .line 187
    .line 188
    move-result v6

    .line 189
    add-int/2addr v6, v3

    .line 190
    iget-object v3, v5, Lm3/c;->j:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 193
    .line 194
    invoke-virtual {v3, v6}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    goto :goto_6

    .line 199
    :cond_5
    move v3, v1

    .line 200
    :goto_6
    sub-int/2addr v3, v4

    .line 201
    invoke-virtual {v2, v0, v1, v3}, Ll3/t;->a(Ll3/u;II)V

    .line 202
    .line 203
    .line 204
    add-int/lit8 p2, p2, 0x1

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_6
    const-string p1, "invalid metadata codepoint length"

    .line 208
    .line 209
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    const/4 p1, 0x0

    .line 213
    throw p1

    .line 214
    :cond_7
    return-void
.end method

.method public constructor <init>(Li/z;)V
    .locals 2

    .line 216
    new-instance v0, Landroidx/lifecycle/x;

    const/16 v1, 0x15

    invoke-direct {v0, p1, v1}, Landroidx/lifecycle/x;-><init>(Ljava/lang/Object;I)V

    .line 217
    invoke-direct {p0, v0}, Lhb/c;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 215
    iput-object p1, p0, Lhb/c;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    goto :goto_3

    .line 4
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Lq8/o;->a()Landroid/app/Activity;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move-object p0, v0

    .line 17
    :goto_0
    if-eqz p0, :cond_2

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_2
    move-object p0, v0

    .line 21
    :goto_1
    if-eqz p0, :cond_3

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_3

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_3
    move-object p0, v0

    .line 31
    :goto_2
    if-eqz p0, :cond_4

    .line 32
    .line 33
    :goto_3
    new-instance v0, Lc9/t;

    .line 34
    .line 35
    const/16 v1, 0x8

    .line 36
    .line 37
    invoke-direct {v0, p0, p1, v1}, Lc9/t;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 41
    .line 42
    .line 43
    :cond_4
    return-void
.end method

.method public static B(Lhb/b;I)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lhb/b;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    const/16 v2, 0xe10

    .line 13
    .line 14
    invoke-static {p1, v0, v2}, Lr9/e0;->r(III)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    int-to-long v2, p1

    .line 19
    const-wide/16 v4, 0x3e8

    .line 20
    .line 21
    mul-long/2addr v2, v4

    .line 22
    const-wide/16 v4, 0x1f4

    .line 23
    .line 24
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    :try_start_0
    iget-object p0, p0, Lhb/b;->c:Ljava/util/concurrent/CountDownLatch;

    .line 29
    .line 30
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 31
    .line 32
    invoke-virtual {p0, v2, v3, p1}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 33
    .line 34
    .line 35
    move-result p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    return p0

    .line 37
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 42
    .line 43
    .line 44
    return v1
.end method

.method public static q(Ljava/lang/Object;)J
    .locals 10

    .line 1
    const-string v0, "getMsgID"

    .line 2
    .line 3
    const-string v1, "getId"

    .line 4
    .line 5
    const-string v2, "getMsgId"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    const-wide/16 v3, 0x0

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x3

    .line 18
    if-lt v2, v7, :cond_5

    .line 19
    .line 20
    const-string v0, "msgID"

    .line 21
    .line 22
    const-string v2, "id"

    .line 23
    .line 24
    const-string v7, "field_msgId"

    .line 25
    .line 26
    const-string v8, "msgId"

    .line 27
    .line 28
    filled-new-array {v7, v8, v0, v2}, [Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    move v0, v1

    .line 33
    :goto_1
    const/4 v2, 0x4

    .line 34
    if-lt v0, v2, :cond_0

    .line 35
    .line 36
    return-wide v3

    .line 37
    :cond_0
    aget-object v2, v7, v0

    .line 38
    .line 39
    invoke-static {p0, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    instance-of v8, v2, Ljava/lang/Number;

    .line 44
    .line 45
    if-eqz v8, :cond_1

    .line 46
    .line 47
    check-cast v2, Ljava/lang/Number;

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    move-object v2, v6

    .line 51
    :goto_2
    if-eqz v2, :cond_4

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 54
    .line 55
    .line 56
    move-result-wide v8

    .line 57
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    cmp-long v8, v8, v3

    .line 62
    .line 63
    if-lez v8, :cond_2

    .line 64
    .line 65
    move v8, v5

    .line 66
    goto :goto_3

    .line 67
    :cond_2
    move v8, v1

    .line 68
    :goto_3
    if-eqz v8, :cond_3

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_3
    move-object v2, v6

    .line 72
    :goto_4
    if-eqz v2, :cond_4

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 75
    .line 76
    .line 77
    move-result-wide v0

    .line 78
    return-wide v0

    .line 79
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_5
    aget-object v7, v0, v2

    .line 83
    .line 84
    new-array v8, v1, [Ljava/lang/Object;

    .line 85
    .line 86
    invoke-static {p0, v7, v8}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    instance-of v8, v7, Ljava/lang/Number;

    .line 91
    .line 92
    if-eqz v8, :cond_6

    .line 93
    .line 94
    check-cast v7, Ljava/lang/Number;

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_6
    move-object v7, v6

    .line 98
    :goto_5
    if-eqz v7, :cond_9

    .line 99
    .line 100
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 101
    .line 102
    .line 103
    move-result-wide v7

    .line 104
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    cmp-long v3, v7, v3

    .line 109
    .line 110
    if-lez v3, :cond_7

    .line 111
    .line 112
    goto :goto_6

    .line 113
    :cond_7
    move v5, v1

    .line 114
    :goto_6
    if-eqz v5, :cond_8

    .line 115
    .line 116
    move-object v6, v9

    .line 117
    :cond_8
    if-eqz v6, :cond_9

    .line 118
    .line 119
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 120
    .line 121
    .line 122
    move-result-wide v0

    .line 123
    return-wide v0

    .line 124
    :cond_9
    add-int/lit8 v2, v2, 0x1

    .line 125
    .line 126
    goto :goto_0
.end method

.method public static r(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {p0, p1}, Lx6/d;->a0(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public static t(Ljava/util/List;)Ljava/util/List;
    .locals 14

    .line 1
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_7

    .line 9
    .line 10
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x1

    .line 29
    if-eqz v3, :cond_a

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-static {v3}, Lhb/c;->q(Ljava/lang/Object;)J

    .line 36
    .line 37
    .line 38
    move-result-wide v6

    .line 39
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    const-wide/16 v9, 0x0

    .line 44
    .line 45
    cmp-long v9, v6, v9

    .line 46
    .line 47
    if-lez v9, :cond_8

    .line 48
    .line 49
    const-string v9, "field_isSend"

    .line 50
    .line 51
    const-string v10, "isSend"

    .line 52
    .line 53
    filled-new-array {v9, v10}, [Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    move v11, v4

    .line 58
    :goto_1
    const/4 v12, 0x2

    .line 59
    if-lt v11, v12, :cond_5

    .line 60
    .line 61
    const-string v9, "getIsSend"

    .line 62
    .line 63
    filled-new-array {v9, v10}, [Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v13

    .line 67
    move v9, v4

    .line 68
    :goto_2
    if-lt v9, v12, :cond_2

    .line 69
    .line 70
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->m()Lk8/s;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    if-eqz v3, :cond_1

    .line 82
    .line 83
    invoke-virtual {v3, v6, v7}, Lk8/s;->c(J)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    if-eqz v3, :cond_1

    .line 88
    .line 89
    iget v3, v3, Lh/Hchat/hooks/api/model/WeChatMessage;->isSend:I

    .line 90
    .line 91
    if-ne v3, v5, :cond_1

    .line 92
    .line 93
    :goto_3
    move v3, v5

    .line 94
    goto :goto_4

    .line 95
    :cond_1
    move v3, v4

    .line 96
    goto :goto_4

    .line 97
    :cond_2
    aget-object v10, v13, v9

    .line 98
    .line 99
    new-array v11, v4, [Ljava/lang/Object;

    .line 100
    .line 101
    invoke-static {v3, v10, v11}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    instance-of v11, v10, Ljava/lang/Boolean;

    .line 106
    .line 107
    if-eqz v11, :cond_3

    .line 108
    .line 109
    check-cast v10, Ljava/lang/Boolean;

    .line 110
    .line 111
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    goto :goto_4

    .line 116
    :cond_3
    instance-of v11, v10, Ljava/lang/Number;

    .line 117
    .line 118
    if-eqz v11, :cond_4

    .line 119
    .line 120
    check-cast v10, Ljava/lang/Number;

    .line 121
    .line 122
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-eqz v3, :cond_1

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_5
    aget-object v12, v9, v11

    .line 133
    .line 134
    invoke-static {v3, v12}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v12

    .line 138
    instance-of v13, v12, Ljava/lang/Boolean;

    .line 139
    .line 140
    if-eqz v13, :cond_6

    .line 141
    .line 142
    check-cast v12, Ljava/lang/Boolean;

    .line 143
    .line 144
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    goto :goto_4

    .line 149
    :cond_6
    instance-of v13, v12, Ljava/lang/Number;

    .line 150
    .line 151
    if-eqz v13, :cond_7

    .line 152
    .line 153
    check-cast v12, Ljava/lang/Number;

    .line 154
    .line 155
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-eqz v3, :cond_1

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :goto_4
    if-eqz v3, :cond_8

    .line 163
    .line 164
    move v4, v5

    .line 165
    goto :goto_5

    .line 166
    :cond_7
    add-int/lit8 v11, v11, 0x1

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_8
    :goto_5
    if-eqz v4, :cond_9

    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_9
    move-object v8, v1

    .line 173
    :goto_6
    if-eqz v8, :cond_c

    .line 174
    .line 175
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    goto/16 :goto_0

    .line 179
    .line 180
    :cond_a
    invoke-static {v0}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    if-ne v0, v2, :cond_b

    .line 197
    .line 198
    move v4, v5

    .line 199
    :cond_b
    if-eqz v4, :cond_c

    .line 200
    .line 201
    return-object p0

    .line 202
    :cond_c
    :goto_7
    return-object v1
.end method

.method public static y(Ldb/a;Ljava/lang/String;Ljava/lang/String;Lk8/g;Lj8/p;)Z
    .locals 5

    .line 1
    iget v0, p0, Ldb/a;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Ldb/a;->b:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "%friendName%"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    goto/16 :goto_1

    .line 13
    .line 14
    :pswitch_0
    if-eqz p4, :cond_6

    .line 15
    .line 16
    iget-object p0, p4, Lj8/p;->f:Lj8/h;

    .line 17
    .line 18
    if-eqz p0, :cond_6

    .line 19
    .line 20
    invoke-virtual {p0, p1, v1}, Lj8/h;->A(Ljava/lang/String;Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-ne p0, v3, :cond_6

    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    :pswitch_1
    invoke-static {v1, v2, p2, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-nez p2, :cond_6

    .line 37
    .line 38
    if-eqz p3, :cond_6

    .line 39
    .line 40
    invoke-virtual {p3, p1, p0}, Lk8/g;->z(Ljava/lang/String;Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-ne p0, v3, :cond_6

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :pswitch_2
    new-instance p2, Ljava/io/File;

    .line 48
    .line 49
    invoke-direct {p2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/io/File;->isFile()Z

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    if-eqz p3, :cond_6

    .line 57
    .line 58
    if-nez p4, :cond_0

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    iget p0, p0, Ldb/a;->a:I

    .line 62
    .line 63
    if-eq p0, v3, :cond_5

    .line 64
    .line 65
    const/4 p3, 0x2

    .line 66
    if-eq p0, p3, :cond_4

    .line 67
    .line 68
    const/4 p3, 0x3

    .line 69
    if-eq p0, p3, :cond_3

    .line 70
    .line 71
    const/4 p2, 0x4

    .line 72
    if-eq p0, p2, :cond_2

    .line 73
    .line 74
    const/4 p2, 0x5

    .line 75
    if-eq p0, p2, :cond_1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    iget-object p0, p4, Lj8/p;->b:Lj8/y;

    .line 79
    .line 80
    invoke-virtual {p0, p1, v1}, Lj8/y;->t(Ljava/lang/String;Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    return p0

    .line 85
    :cond_2
    iget-object p0, p4, Lj8/p;->d:Lj8/f;

    .line 86
    .line 87
    invoke-virtual {p0, p1, v1}, Lj8/f;->v(Ljava/lang/String;Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    return p0

    .line 92
    :cond_3
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    iget-object p2, p4, Lj8/p;->e:Landroidx/lifecycle/x;

    .line 97
    .line 98
    invoke-virtual {p2, p1, v1, p0}, Landroidx/lifecycle/x;->T(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    return p0

    .line 103
    :cond_4
    iget-object p0, p4, Lj8/p;->c:Lbb/b;

    .line 104
    .line 105
    invoke-virtual {p0, p1, v1}, Lbb/b;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    return p0

    .line 110
    :cond_5
    iget-object p0, p4, Lj8/p;->a:Lj8/n;

    .line 111
    .line 112
    const-string p2, ""

    .line 113
    .line 114
    invoke-virtual {p0, p1, v1, p2, v3}, Lj8/n;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    return p0

    .line 119
    :pswitch_3
    invoke-static {v1, v2, p2, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    if-nez p2, :cond_6

    .line 128
    .line 129
    if-eqz p3, :cond_6

    .line 130
    .line 131
    invoke-virtual {p3, p1, p0}, Lk8/g;->x(Ljava/lang/String;Ljava/lang/String;)Z

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    if-ne p0, v3, :cond_6

    .line 136
    .line 137
    :goto_0
    return v3

    .line 138
    :cond_6
    :goto_1
    return v4

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public b(Li/q;Li/q;Li/q;)J
    .locals 8

    .line 1
    invoke-virtual {p1}, Li/q;->b()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :goto_0
    if-ge v3, v0, :cond_0

    .line 9
    .line 10
    iget-object v4, p0, Lhb/c;->g:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v4, Landroidx/lifecycle/x;

    .line 13
    .line 14
    invoke-virtual {v4, v3}, Landroidx/lifecycle/x;->t(I)Li/z;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {p1, v3}, Li/q;->a(I)F

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    invoke-virtual {p2, v3}, Li/q;->a(I)F

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    invoke-virtual {p3, v3}, Li/q;->a(I)F

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    invoke-interface {v4, v5, v6, v7}, Li/z;->b(FFF)J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-wide v1
.end method

.method public c(Lp4/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lhb/c;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lp4/t;

    .line 4
    .line 5
    iget-object v0, v0, Lp4/t;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lp4/u;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lp4/u;->a(Lp4/h;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public d(Lp4/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lhb/c;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lp4/t;

    .line 4
    .line 5
    iget-object v0, v0, Lp4/t;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public e(Lu4/v;)V
    .locals 10

    .line 1
    iget-object v0, p1, Lu4/i;->h:Lu4/t;

    .line 2
    .line 3
    invoke-static {p1}, Lp4/x;->a(Lu4/i;)Lp4/j;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p1, Lu4/i;->g:Lu4/r;

    .line 8
    .line 9
    iget-object v3, p1, Lu4/d;->k:Lv4/a;

    .line 10
    .line 11
    iget v4, v2, Lu4/r;->e:I

    .line 12
    .line 13
    iget v5, v2, Lu4/r;->a:I

    .line 14
    .line 15
    const/4 v6, 0x6

    .line 16
    if-ne v4, v6, :cond_c

    .line 17
    .line 18
    iget-object v4, p0, Lhb/c;->i:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, Lp4/f;

    .line 21
    .line 22
    invoke-virtual {p0, v4}, Lhb/c;->c(Lp4/h;)V

    .line 23
    .line 24
    .line 25
    iget-boolean v2, v2, Lu4/r;->f:Z

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    iget-object p1, p1, Lu4/i;->j:Lu4/p;

    .line 30
    .line 31
    new-instance v2, Lp4/g;

    .line 32
    .line 33
    invoke-direct {v2, v1, v0, p1, v3}, Lp4/g;-><init>(Lp4/j;Lu4/t;Lu4/p;Lv4/a;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v2}, Lhb/c;->c(Lp4/h;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    invoke-virtual {p0}, Lhb/c;->i()Lu4/o;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {p1, v2}, Lp4/y;->a(Lu4/i;Lu4/o;)Lu4/p;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    iget-boolean v6, v1, Lp4/j;->e:Z

    .line 49
    .line 50
    iget v7, v1, Lp4/j;->a:I

    .line 51
    .line 52
    const/4 v8, 0x0

    .line 53
    const/4 v9, 0x1

    .line 54
    if-nez v6, :cond_2

    .line 55
    .line 56
    const/16 v6, 0x2b

    .line 57
    .line 58
    if-ne v5, v6, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    move v6, v8

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    :goto_0
    move v6, v9

    .line 64
    :goto_1
    if-eqz v2, :cond_3

    .line 65
    .line 66
    move v2, v9

    .line 67
    goto :goto_2

    .line 68
    :cond_3
    move v2, v8

    .line 69
    :goto_2
    if-ne v6, v2, :cond_b

    .line 70
    .line 71
    const/16 p1, 0x29

    .line 72
    .line 73
    if-ne v5, p1, :cond_4

    .line 74
    .line 75
    const/16 p1, 0x23

    .line 76
    .line 77
    if-eq v7, p1, :cond_4

    .line 78
    .line 79
    new-instance p1, Lp4/z;

    .line 80
    .line 81
    invoke-direct {p1, v1, v0, v4}, Lp4/l;-><init>(Lp4/j;Lu4/t;Lu4/p;)V

    .line 82
    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    new-instance p1, Lp4/g;

    .line 86
    .line 87
    invoke-direct {p1, v1, v0, v4, v3}, Lp4/g;-><init>(Lp4/j;Lu4/t;Lu4/p;Lv4/a;)V

    .line 88
    .line 89
    .line 90
    :goto_3
    iget-object v1, p0, Lhb/c;->g:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, Lp4/t;

    .line 93
    .line 94
    iget-object v1, v1, Lp4/t;->h:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Lp4/u;

    .line 97
    .line 98
    iget-object v2, v1, Lp4/u;->c:Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    sub-int/2addr v2, v9

    .line 105
    :goto_4
    const/4 v3, 0x0

    .line 106
    if-ltz v2, :cond_8

    .line 107
    .line 108
    iget-object v4, v1, Lp4/u;->c:Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    if-ge v2, v4, :cond_6

    .line 115
    .line 116
    if-gez v2, :cond_5

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_5
    iget-object v3, v1, Lp4/u;->c:Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    check-cast v3, Lp4/h;

    .line 126
    .line 127
    :cond_6
    :goto_5
    iget-object v4, v3, Lp4/h;->b:Lp4/j;

    .line 128
    .line 129
    iget v4, v4, Lp4/j;->a:I

    .line 130
    .line 131
    const/4 v5, -0x1

    .line 132
    if-eq v4, v5, :cond_7

    .line 133
    .line 134
    goto :goto_6

    .line 135
    :cond_7
    add-int/lit8 v2, v2, -0x1

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_8
    :goto_6
    const/16 v1, 0x20

    .line 139
    .line 140
    if-ne v7, v1, :cond_a

    .line 141
    .line 142
    if-eqz v3, :cond_a

    .line 143
    .line 144
    iget-object v1, v3, Lp4/h;->d:Lu4/p;

    .line 145
    .line 146
    iget-object v2, v3, Lp4/h;->b:Lp4/j;

    .line 147
    .line 148
    iget v2, v2, Lp4/j;->a:I

    .line 149
    .line 150
    const/4 v3, 0x7

    .line 151
    if-eq v2, v3, :cond_9

    .line 152
    .line 153
    const/16 v3, 0x8

    .line 154
    .line 155
    if-eq v2, v3, :cond_9

    .line 156
    .line 157
    const/16 v3, 0x9

    .line 158
    .line 159
    if-ne v2, v3, :cond_a

    .line 160
    .line 161
    :cond_9
    iget-object v2, p1, Lp4/h;->d:Lu4/p;

    .line 162
    .line 163
    iget-object v3, v2, Lz4/e;->h:[Ljava/lang/Object;

    .line 164
    .line 165
    array-length v3, v3

    .line 166
    if-lez v3, :cond_a

    .line 167
    .line 168
    iget-object v3, v1, Lz4/e;->h:[Ljava/lang/Object;

    .line 169
    .line 170
    array-length v3, v3

    .line 171
    if-le v3, v9, :cond_a

    .line 172
    .line 173
    invoke-virtual {v2, v8}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    check-cast v2, Lu4/o;

    .line 178
    .line 179
    iget v2, v2, Lu4/o;->g:I

    .line 180
    .line 181
    invoke-virtual {v1, v9}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    check-cast v1, Lu4/o;

    .line 186
    .line 187
    iget v1, v1, Lu4/o;->g:I

    .line 188
    .line 189
    if-ne v2, v1, :cond_a

    .line 190
    .line 191
    new-instance v1, Lp4/z;

    .line 192
    .line 193
    sget-object v2, Lp4/k;->c:Lp4/j;

    .line 194
    .line 195
    sget-object v3, Lu4/p;->i:Lu4/p;

    .line 196
    .line 197
    invoke-direct {v1, v2, v0, v3}, Lp4/l;-><init>(Lp4/j;Lu4/t;Lu4/p;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0, v1}, Lhb/c;->c(Lp4/h;)V

    .line 201
    .line 202
    .line 203
    :cond_a
    invoke-virtual {p0, p1}, Lhb/c;->c(Lp4/h;)V

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :cond_b
    const-string v0, "Insn with result/move-result-pseudo mismatch "

    .line 208
    .line 209
    invoke-static {p1, v0}, Lokio/a;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :cond_c
    new-instance p1, Ljava/lang/RuntimeException;

    .line 214
    .line 215
    iget v0, v2, Lu4/r;->e:I

    .line 216
    .line 217
    new-instance v1, Ljava/lang/StringBuilder;

    .line 218
    .line 219
    const-string v2, "Expected BRANCH_THROW got "

    .line 220
    .line 221
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    throw p1
.end method

.method public f(Ls1/k;Z)V
    .locals 7

    .line 1
    iget-object v0, p0, Lhb/c;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ls1/a0;

    .line 4
    .line 5
    iget-object v1, p1, Ls1/k;->a:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    move v4, v3

    .line 13
    :goto_0
    if-ge v4, v2, :cond_1

    .line 14
    .line 15
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    check-cast v5, Ls1/t;

    .line 20
    .line 21
    invoke-virtual {v5}, Ls1/t;->b()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lhb/c;->z(Ls1/k;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object v2, p0, Lhb/c;->g:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Lv1/t;

    .line 37
    .line 38
    if-eqz v2, :cond_4

    .line 39
    .line 40
    const-wide/16 v4, 0x0

    .line 41
    .line 42
    invoke-interface {v2, v4, v5}, Lv1/t;->m0(J)J

    .line 43
    .line 44
    .line 45
    move-result-wide v4

    .line 46
    new-instance v2, Lf1/p;

    .line 47
    .line 48
    const/4 v6, 0x4

    .line 49
    invoke-direct {v2, p0, v6, v0}, Lf1/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v4, v5, v2, v3}, Ls1/s;->i(Ls1/k;JLfg/l;Z)V

    .line 53
    .line 54
    .line 55
    iget-object v2, p0, Lhb/c;->h:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v2, Ls1/y;

    .line 58
    .line 59
    sget-object v4, Ls1/y;->h:Ls1/y;

    .line 60
    .line 61
    if-ne v2, v4, :cond_3

    .line 62
    .line 63
    if-eqz p2, :cond_2

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    :goto_1
    if-ge v3, p2, :cond_2

    .line 70
    .line 71
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Ls1/t;

    .line 76
    .line 77
    invoke-virtual {v2}, Ls1/t;->a()V

    .line 78
    .line 79
    .line 80
    add-int/lit8 v3, v3, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    iget-object p1, p1, Ls1/k;->b:Lh0/q0;

    .line 84
    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    iget-boolean p2, v0, Ls1/a0;->c:Z

    .line 88
    .line 89
    xor-int/lit8 p2, p2, 0x1

    .line 90
    .line 91
    iput-boolean p2, p1, Lh0/q0;->b:Z

    .line 92
    .line 93
    :cond_3
    return-void

    .line 94
    :cond_4
    const-string p1, "layoutCoordinates not set"

    .line 95
    .line 96
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public g(Li/q;Li/q;Li/q;)Li/q;
    .locals 9

    .line 1
    iget-object v0, p0, Lhb/c;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li/q;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p3}, Li/q;->c()Li/q;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lhb/c;->j:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lhb/c;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Li/q;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const-string v2, "endVelocityVector"

    .line 19
    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    invoke-virtual {v0}, Li/q;->b()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v3, 0x0

    .line 27
    :goto_0
    iget-object v4, p0, Lhb/c;->j:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Li/q;

    .line 30
    .line 31
    if-ge v3, v0, :cond_2

    .line 32
    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    iget-object v5, p0, Lhb/c;->g:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Landroidx/lifecycle/x;

    .line 38
    .line 39
    invoke-virtual {v5, v3}, Landroidx/lifecycle/x;->t(I)Li/z;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {p1, v3}, Li/q;->a(I)F

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    invoke-virtual {p2, v3}, Li/q;->a(I)F

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    invoke-virtual {p3, v3}, Li/q;->a(I)F

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    invoke-interface {v5, v6, v7, v8}, Li/z;->d(FFF)F

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    invoke-virtual {v4, v3, v5}, Li/q;->e(IF)V

    .line 60
    .line 61
    .line 62
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-static {v2}, Lgg/l;->g(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v1

    .line 69
    :cond_2
    if-eqz v4, :cond_3

    .line 70
    .line 71
    return-object v4

    .line 72
    :cond_3
    invoke-static {v2}, Lgg/l;->g(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :cond_4
    invoke-static {v2}, Lgg/l;->g(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v1
.end method

.method public h(Ljava/util/ArrayList;Ljava/util/List;IILfg/q;)Lhb/s;
    .locals 8

    .line 1
    new-instance v4, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ldb/a;

    .line 22
    .line 23
    iget-object v2, v0, Ldb/a;->b:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    iget v3, v0, Ldb/a;->a:I

    .line 40
    .line 41
    if-ltz v3, :cond_1

    .line 42
    .line 43
    const/16 v5, 0x8

    .line 44
    .line 45
    if-ge v3, v5, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move-object v0, v1

    .line 49
    :goto_1
    if-eqz v0, :cond_2

    .line 50
    .line 51
    invoke-static {v0, v2}, Ldb/a;->a(Ldb/a;Ljava/lang/String;)Ldb/a;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    :cond_2
    if-eqz v1, :cond_0

    .line 56
    .line 57
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-static {p2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v0, p1}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    new-instance p2, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    :cond_5
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_6

    .line 104
    .line 105
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    move-object v2, v0

    .line 110
    check-cast v2, Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-nez v2, :cond_5

    .line 117
    .line 118
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_6
    invoke-static {p2}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-static {p1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    if-nez p2, :cond_7

    .line 135
    .line 136
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    if-eqz p2, :cond_8

    .line 141
    .line 142
    :cond_7
    move-object v2, p0

    .line 143
    goto :goto_4

    .line 144
    :cond_8
    new-instance v3, Lhb/b;

    .line 145
    .line 146
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-direct {v3, p2}, Lhb/b;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    iget-object p2, p0, Lhb/c;->j:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 163
    .line 164
    iget-object v0, v3, Lhb/b;->a:Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {p2, v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    iget-object p2, p0, Lhb/c;->i:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast p2, Ljava/util/concurrent/ExecutorService;

    .line 172
    .line 173
    new-instance v0, Lhb/a;

    .line 174
    .line 175
    move-object v2, p0

    .line 176
    move-object v1, p1

    .line 177
    move v6, p3

    .line 178
    move v5, p4

    .line 179
    move-object v7, p5

    .line 180
    invoke-direct/range {v0 .. v7}, Lhb/a;-><init>(Ljava/util/List;Lhb/c;Lhb/b;Ljava/util/ArrayList;IILfg/q;)V

    .line 181
    .line 182
    .line 183
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 184
    .line 185
    .line 186
    new-instance p1, Lhb/s;

    .line 187
    .line 188
    new-instance p2, Laa/c;

    .line 189
    .line 190
    const/16 p3, 0xc

    .line 191
    .line 192
    invoke-direct {p2, p0, p3, v3}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    invoke-direct {p1, p2}, Lhb/s;-><init>(Lfg/a;)V

    .line 196
    .line 197
    .line 198
    return-object p1

    .line 199
    :goto_4
    return-object v1
.end method

.method public i()Lu4/o;
    .locals 3

    .line 1
    iget-object v0, p0, Lhb/c;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu4/b;

    .line 4
    .line 5
    iget v0, v0, Lu4/b;->d:I

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v1, p0, Lhb/c;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lp4/y;

    .line 13
    .line 14
    iget-object v1, v1, Lp4/y;->a:Lf1/h;

    .line 15
    .line 16
    iget-object v1, v1, Lf1/h;->i:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lu4/c;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Lu4/c;->s(I)Lu4/b;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v0, v0, Lu4/b;->b:Lh4/u;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, v1}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lu4/i;

    .line 32
    .line 33
    iget-object v1, v0, Lu4/i;->g:Lu4/r;

    .line 34
    .line 35
    iget v1, v1, Lu4/r;->a:I

    .line 36
    .line 37
    const/16 v2, 0x38

    .line 38
    .line 39
    if-eq v1, v2, :cond_1

    .line 40
    .line 41
    :goto_0
    const/4 v0, 0x0

    .line 42
    return-object v0

    .line 43
    :cond_1
    iget-object v0, v0, Lu4/i;->i:Lu4/o;

    .line 44
    .line 45
    return-object v0
.end method

.method public j(Lu4/j;)V
    .locals 6

    .line 1
    iget-object v0, p1, Lu4/i;->h:Lu4/t;

    .line 2
    .line 3
    invoke-static {p1}, Lp4/x;->a(Lu4/i;)Lp4/j;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p1, Lu4/i;->g:Lu4/r;

    .line 8
    .line 9
    iget v3, v2, Lu4/r;->e:I

    .line 10
    .line 11
    const/4 v4, 0x6

    .line 12
    if-ne v3, v4, :cond_1

    .line 13
    .line 14
    iget-boolean v2, v2, Lu4/r;->f:Z

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, Lhb/c;->i:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Lp4/f;

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Lhb/c;->c(Lp4/h;)V

    .line 23
    .line 24
    .line 25
    iget-object v2, p1, Lu4/i;->j:Lu4/p;

    .line 26
    .line 27
    iget-object v3, p1, Lu4/j;->m:Lv4/y;

    .line 28
    .line 29
    iget-object p1, p1, Lu4/j;->n:Lv4/a0;

    .line 30
    .line 31
    const/4 v4, 0x2

    .line 32
    new-array v4, v4, [Lv4/a;

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    aput-object v3, v4, v5

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    aput-object p1, v4, v3

    .line 39
    .line 40
    new-instance p1, Lp4/r;

    .line 41
    .line 42
    invoke-direct {p1, v1, v0, v2, v4}, Lp4/r;-><init>(Lp4/j;Lu4/t;Lu4/p;[Lv4/a;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1}, Lhb/c;->c(Lp4/h;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    const-string p1, "Expected call-like operation"

    .line 50
    .line 51
    invoke-static {p1}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    .line 56
    .line 57
    iget v0, v2, Lu4/r;->e:I

    .line 58
    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v2, "Expected BRANCH_THROW got "

    .line 62
    .line 63
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p1
.end method

.method public k(JLi/q;Li/q;)Li/q;
    .locals 14

    .line 1
    iget-object v0, p0, Lhb/c;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li/q;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual/range {p3 .. p3}, Li/q;->c()Li/q;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lhb/c;->i:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lhb/c;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Li/q;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const-string v2, "velocityVector"

    .line 19
    .line 20
    if-eqz v0, :cond_5

    .line 21
    .line 22
    invoke-virtual {v0}, Li/q;->b()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v3, 0x0

    .line 27
    :goto_0
    iget-object v4, p0, Lhb/c;->i:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Li/q;

    .line 30
    .line 31
    if-ge v3, v0, :cond_3

    .line 32
    .line 33
    if-eqz v4, :cond_2

    .line 34
    .line 35
    iget-object v5, p0, Lhb/c;->g:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Landroidx/lifecycle/x;

    .line 38
    .line 39
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-object/from16 v6, p4

    .line 43
    .line 44
    invoke-virtual {v6, v3}, Li/q;->a(I)F

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    const-wide/32 v8, 0xf4240

    .line 49
    .line 50
    .line 51
    div-long v8, p1, v8

    .line 52
    .line 53
    iget-object v5, v5, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v5, Lh/v0;

    .line 56
    .line 57
    invoke-virtual {v5, v7}, Lh/v0;->a(F)Lh/u0;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    iget-wide v10, v5, Lh/u0;->c:J

    .line 62
    .line 63
    const-wide/16 v12, 0x0

    .line 64
    .line 65
    cmp-long v7, v10, v12

    .line 66
    .line 67
    if-lez v7, :cond_1

    .line 68
    .line 69
    long-to-float v7, v8

    .line 70
    long-to-float v8, v10

    .line 71
    div-float/2addr v7, v8

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    const/high16 v7, 0x3f800000    # 1.0f

    .line 74
    .line 75
    :goto_1
    invoke-static {v7}, Lh/b;->a(F)Lh/a;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    iget v7, v7, Lh/a;->b:F

    .line 80
    .line 81
    iget v8, v5, Lh/u0;->a:F

    .line 82
    .line 83
    invoke-static {v8}, Ljava/lang/Math;->signum(F)F

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    mul-float/2addr v8, v7

    .line 88
    iget v5, v5, Lh/u0;->b:F

    .line 89
    .line 90
    mul-float/2addr v8, v5

    .line 91
    long-to-float v5, v10

    .line 92
    div-float/2addr v8, v5

    .line 93
    const/high16 v5, 0x447a0000    # 1000.0f

    .line 94
    .line 95
    mul-float/2addr v8, v5

    .line 96
    invoke-virtual {v4, v3, v8}, Li/q;->e(IF)V

    .line 97
    .line 98
    .line 99
    add-int/lit8 v3, v3, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    invoke-static {v2}, Lgg/l;->g(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw v1

    .line 106
    :cond_3
    if-eqz v4, :cond_4

    .line 107
    .line 108
    return-object v4

    .line 109
    :cond_4
    invoke-static {v2}, Lgg/l;->g(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v1

    .line 113
    :cond_5
    invoke-static {v2}, Lgg/l;->g(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v1
.end method

.method public l(Lu4/u;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lu4/i;->h:Lu4/t;

    .line 2
    .line 3
    invoke-static {p1}, Lp4/x;->a(Lu4/i;)Lp4/j;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p1, Lu4/i;->g:Lu4/r;

    .line 8
    .line 9
    iget v2, v2, Lu4/r;->e:I

    .line 10
    .line 11
    const/4 v3, 0x6

    .line 12
    if-ne v2, v3, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0}, Lhb/c;->i()Lu4/o;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-boolean v3, v1, Lp4/j;->e:Z

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v4, 0x0

    .line 25
    :goto_0
    if-ne v3, v4, :cond_1

    .line 26
    .line 27
    iget-object v3, p0, Lhb/c;->i:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v3, Lp4/f;

    .line 30
    .line 31
    invoke-virtual {p0, v3}, Lhb/c;->c(Lp4/h;)V

    .line 32
    .line 33
    .line 34
    new-instance v3, Lp4/z;

    .line 35
    .line 36
    invoke-static {p1, v2}, Lp4/y;->a(Lu4/i;Lu4/o;)Lu4/p;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {v3, v1, v0, p1}, Lp4/l;-><init>(Lp4/j;Lu4/t;Lu4/p;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v3}, Lhb/c;->c(Lp4/h;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    const-string v0, "Insn with result/move-result-pseudo mismatch"

    .line 48
    .line 49
    invoke-static {p1, v0}, Lokio/a;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    const-string p1, "shouldn\'t happen"

    .line 54
    .line 55
    invoke-static {p1}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public m(Lu4/l;)V
    .locals 7

    .line 1
    iget-object v0, p1, Lu4/i;->h:Lu4/t;

    .line 2
    .line 3
    iget-object v1, p1, Lu4/d;->k:Lv4/a;

    .line 4
    .line 5
    iget-object v2, p1, Lu4/i;->i:Lu4/o;

    .line 6
    .line 7
    invoke-static {p1}, Lp4/x;->a(Lu4/i;)Lp4/j;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    iget-object v4, p1, Lu4/i;->g:Lu4/r;

    .line 12
    .line 13
    iget v5, v4, Lu4/r;->a:I

    .line 14
    .line 15
    iget v4, v4, Lu4/r;->e:I

    .line 16
    .line 17
    const/4 v6, 0x1

    .line 18
    if-ne v4, v6, :cond_2

    .line 19
    .line 20
    const/4 v4, 0x3

    .line 21
    if-ne v5, v4, :cond_1

    .line 22
    .line 23
    iget-object p1, p0, Lhb/c;->j:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Lp4/y;

    .line 26
    .line 27
    iget-boolean v4, p1, Lp4/y;->i:Z

    .line 28
    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    check-cast v1, Lv4/o;

    .line 32
    .line 33
    iget v1, v1, Lv4/s;->g:I

    .line 34
    .line 35
    iget v4, p1, Lp4/y;->f:I

    .line 36
    .line 37
    iget p1, p1, Lp4/y;->h:I

    .line 38
    .line 39
    sub-int/2addr v4, p1

    .line 40
    add-int/2addr v4, v1

    .line 41
    iget-object p1, v2, Lu4/o;->h:Lw4/d;

    .line 42
    .line 43
    invoke-interface {p1}, Lw4/d;->getType()Lw4/c;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-static {v4, p1, v1}, Lu4/o;->k(ILw4/d;Lu4/k;)Lu4/o;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    new-instance v1, Lp4/z;

    .line 53
    .line 54
    invoke-static {v2, p1}, Lu4/p;->q(Lu4/o;Lu4/o;)Lu4/p;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-direct {v1, v3, v0, p1}, Lp4/l;-><init>(Lp4/j;Lu4/t;Lu4/p;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v1}, Lhb/c;->c(Lp4/h;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    return-void

    .line 65
    :cond_1
    invoke-static {p1, v2}, Lp4/y;->a(Lu4/i;Lu4/o;)Lu4/p;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    new-instance v2, Lp4/g;

    .line 70
    .line 71
    invoke-direct {v2, v3, v0, p1, v1}, Lp4/g;-><init>(Lp4/j;Lu4/t;Lu4/p;Lv4/a;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v2}, Lhb/c;->c(Lp4/h;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_2
    const-string p1, "shouldn\'t happen"

    .line 79
    .line 80
    invoke-static {p1}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public n(JLi/q;Li/q;Li/q;)Li/q;
    .locals 14

    .line 1
    iget-object v0, p0, Lhb/c;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li/q;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual/range {p5 .. p5}, Li/q;->c()Li/q;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lhb/c;->i:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lhb/c;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Li/q;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const-string v2, "velocityVector"

    .line 19
    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    invoke-virtual {v0}, Li/q;->b()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v3, 0x0

    .line 27
    :goto_0
    iget-object v4, p0, Lhb/c;->i:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Li/q;

    .line 30
    .line 31
    if-ge v3, v0, :cond_2

    .line 32
    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    iget-object v5, p0, Lhb/c;->g:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Landroidx/lifecycle/x;

    .line 38
    .line 39
    invoke-virtual {v5, v3}, Landroidx/lifecycle/x;->t(I)Li/z;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    move-object/from16 v5, p3

    .line 44
    .line 45
    invoke-virtual {v5, v3}, Li/q;->a(I)F

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    move-object/from16 v12, p4

    .line 50
    .line 51
    invoke-virtual {v12, v3}, Li/q;->a(I)F

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    move-object/from16 v13, p5

    .line 56
    .line 57
    invoke-virtual {v13, v3}, Li/q;->a(I)F

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    move-wide v10, p1

    .line 62
    invoke-interface/range {v6 .. v11}, Li/z;->c(FFFJ)F

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    invoke-virtual {v4, v3, v6}, Li/q;->e(IF)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    invoke-static {v2}, Lgg/l;->g(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :cond_2
    if-eqz v4, :cond_3

    .line 77
    .line 78
    return-object v4

    .line 79
    :cond_3
    invoke-static {v2}, Lgg/l;->g(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v1

    .line 83
    :cond_4
    invoke-static {v2}, Lgg/l;->g(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v1
.end method

.method public o(Lu4/m;)V
    .locals 6

    .line 1
    iget-object v0, p1, Lu4/i;->g:Lu4/r;

    .line 2
    .line 3
    iget-object v1, p1, Lu4/i;->i:Lu4/o;

    .line 4
    .line 5
    iget v2, v0, Lu4/r;->a:I

    .line 6
    .line 7
    const/16 v3, 0x36

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/16 v3, 0x38

    .line 13
    .line 14
    if-ne v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object v2, p1, Lu4/i;->h:Lu4/t;

    .line 18
    .line 19
    invoke-static {p1}, Lp4/x;->a(Lu4/i;)Lp4/j;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget v0, v0, Lu4/r;->e:I

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    if-eq v0, v4, :cond_5

    .line 27
    .line 28
    const/4 v5, 0x2

    .line 29
    if-eq v0, v5, :cond_5

    .line 30
    .line 31
    const/4 v5, 0x3

    .line 32
    if-eq v0, v5, :cond_4

    .line 33
    .line 34
    const/4 v5, 0x4

    .line 35
    if-eq v0, v5, :cond_3

    .line 36
    .line 37
    const/4 v4, 0x6

    .line 38
    if-ne v0, v4, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    const-string p1, "shouldn\'t happen"

    .line 42
    .line 43
    invoke-static {p1}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_3
    iget-object v0, p0, Lhb/c;->h:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lu4/b;

    .line 50
    .line 51
    iget-object v0, v0, Lu4/b;->c:Lz4/g;

    .line 52
    .line 53
    invoke-virtual {v0, v4}, Lz4/g;->n(I)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    new-instance v4, Lp4/b0;

    .line 58
    .line 59
    invoke-static {p1, v1}, Lp4/y;->a(Lu4/i;Lu4/o;)Lu4/p;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object v1, p0, Lhb/c;->j:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Lp4/y;

    .line 66
    .line 67
    iget-object v1, v1, Lp4/y;->c:Lb5/c;

    .line 68
    .line 69
    iget-object v1, v1, Lb5/c;->a:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, [Lp4/f;

    .line 72
    .line 73
    aget-object v0, v1, v0

    .line 74
    .line 75
    invoke-direct {v4, v3, v2, p1, v0}, Lp4/b0;-><init>(Lp4/j;Lu4/t;Lu4/p;Lp4/f;)V

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    :goto_0
    return-void

    .line 80
    :cond_5
    :goto_1
    new-instance v4, Lp4/z;

    .line 81
    .line 82
    invoke-static {p1, v1}, Lp4/y;->a(Lu4/i;Lu4/o;)Lu4/p;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-direct {v4, v3, v2, p1}, Lp4/l;-><init>(Lp4/j;Lu4/t;Lu4/p;)V

    .line 87
    .line 88
    .line 89
    :goto_2
    invoke-virtual {p0, v4}, Lhb/c;->c(Lp4/h;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public p(Ljava/lang/reflect/Method;Lde/robv/android/xposed/XC_MethodHook;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lhb/c;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Set;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    :try_start_0
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 14
    .line 15
    invoke-virtual {v1, p1, p2}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 16
    .line 17
    .line 18
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p2

    .line 22
    new-instance v1, Lsf/f;

    .line 23
    .line 24
    invoke-direct {v1, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    move-object p2, v1

    .line 28
    :goto_0
    invoke-static {p2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lhb/c;->h:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lia/t;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    new-instance v2, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v3, "\u591a\u9009\u64a4\u56deHook\u5b89\u88c5\u5931\u8d25: "

    .line 48
    .line 49
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {v0, p1, v1}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :cond_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 63
    .line 64
    instance-of v0, p2, Lsf/f;

    .line 65
    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    move-object p2, p1

    .line 69
    :cond_2
    check-cast p2, Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    return p1
.end method

.method public u(Lu4/g;)V
    .locals 6

    .line 1
    iget-object v0, p1, Lu4/i;->h:Lu4/t;

    .line 2
    .line 3
    iget-object v1, p1, Lu4/g;->l:Lv4/a;

    .line 4
    .line 5
    iget-object v2, p1, Lu4/g;->k:Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v3, p1, Lu4/i;->g:Lu4/r;

    .line 8
    .line 9
    iget v3, v3, Lu4/r;->e:I

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    if-ne v3, v4, :cond_0

    .line 13
    .line 14
    new-instance v3, Lp4/f;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-direct {v3, v0, v4}, Lp4/f;-><init>(Lu4/t;Z)V

    .line 18
    .line 19
    .line 20
    new-instance v4, Lp4/a;

    .line 21
    .line 22
    iget-object v5, p0, Lhb/c;->i:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v5, Lp4/f;

    .line 25
    .line 26
    invoke-direct {v4, v0, v5, v2, v1}, Lp4/a;-><init>(Lu4/t;Lp4/f;Ljava/util/ArrayList;Lv4/a;)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Lp4/b0;

    .line 30
    .line 31
    sget-object v2, Lp4/k;->G:Lp4/j;

    .line 32
    .line 33
    iget-object v5, p1, Lu4/i;->i:Lu4/o;

    .line 34
    .line 35
    invoke-static {p1, v5}, Lp4/y;->a(Lu4/i;Lu4/o;)Lu4/p;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-direct {v1, v2, v0, p1, v3}, Lp4/b0;-><init>(Lp4/j;Lu4/t;Lu4/p;Lp4/f;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lhb/c;->i:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lp4/f;

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lhb/c;->c(Lp4/h;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v1}, Lhb/c;->c(Lp4/h;)V

    .line 50
    .line 51
    .line 52
    new-instance p1, Lp4/s;

    .line 53
    .line 54
    invoke-direct {p1, v0}, Lp4/s;-><init>(Lu4/t;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1}, Lhb/c;->d(Lp4/h;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v3}, Lhb/c;->d(Lp4/h;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v4}, Lhb/c;->d(Lp4/h;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_0
    const-string p1, "shouldn\'t happen"

    .line 68
    .line 69
    invoke-static {p1}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public w(JLi/q;Li/q;Li/q;)Li/q;
    .locals 14

    .line 1
    iget-object v0, p0, Lhb/c;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li/q;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual/range {p3 .. p3}, Li/q;->c()Li/q;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lhb/c;->h:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lhb/c;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Li/q;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const-string v2, "valueVector"

    .line 19
    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    invoke-virtual {v0}, Li/q;->b()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v3, 0x0

    .line 27
    :goto_0
    iget-object v4, p0, Lhb/c;->h:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Li/q;

    .line 30
    .line 31
    if-ge v3, v0, :cond_2

    .line 32
    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    iget-object v5, p0, Lhb/c;->g:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Landroidx/lifecycle/x;

    .line 38
    .line 39
    invoke-virtual {v5, v3}, Landroidx/lifecycle/x;->t(I)Li/z;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    move-object/from16 v5, p3

    .line 44
    .line 45
    invoke-virtual {v5, v3}, Li/q;->a(I)F

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    move-object/from16 v12, p4

    .line 50
    .line 51
    invoke-virtual {v12, v3}, Li/q;->a(I)F

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    move-object/from16 v13, p5

    .line 56
    .line 57
    invoke-virtual {v13, v3}, Li/q;->a(I)F

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    move-wide v10, p1

    .line 62
    invoke-interface/range {v6 .. v11}, Li/z;->e(FFFJ)F

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    invoke-virtual {v4, v3, v6}, Li/q;->e(IF)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    invoke-static {v2}, Lgg/l;->g(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :cond_2
    if-eqz v4, :cond_3

    .line 77
    .line 78
    return-object v4

    .line 79
    :cond_3
    invoke-static {v2}, Lgg/l;->g(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v1

    .line 83
    :cond_4
    invoke-static {v2}, Lgg/l;->g(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v1
.end method

.method public x(Lu4/u;)V
    .locals 10

    .line 1
    iget-object v0, p1, Lu4/i;->h:Lu4/t;

    .line 2
    .line 3
    iget-object v1, p1, Lu4/u;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lz4/g;

    .line 6
    .line 7
    iget-object v2, p0, Lhb/c;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lu4/b;

    .line 10
    .line 11
    iget-object v3, v2, Lu4/b;->c:Lz4/g;

    .line 12
    .line 13
    iget v4, v1, Lz4/g;->i:I

    .line 14
    .line 15
    iget v5, v3, Lz4/g;->i:I

    .line 16
    .line 17
    iget v2, v2, Lu4/b;->d:I

    .line 18
    .line 19
    const/4 v6, 0x1

    .line 20
    sub-int/2addr v5, v6

    .line 21
    if-ne v4, v5, :cond_2

    .line 22
    .line 23
    invoke-virtual {v3, v4}, Lz4/g;->n(I)I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-ne v2, v5, :cond_2

    .line 28
    .line 29
    new-array v2, v4, [Lp4/f;

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    move v7, v5

    .line 33
    :goto_0
    if-ge v7, v4, :cond_0

    .line 34
    .line 35
    invoke-virtual {v3, v7}, Lz4/g;->n(I)I

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    iget-object v9, p0, Lhb/c;->j:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v9, Lp4/y;

    .line 42
    .line 43
    iget-object v9, v9, Lp4/y;->c:Lb5/c;

    .line 44
    .line 45
    iget-object v9, v9, Lb5/c;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v9, [Lp4/f;

    .line 48
    .line 49
    aget-object v8, v9, v8

    .line 50
    .line 51
    aput-object v8, v2, v7

    .line 52
    .line 53
    add-int/lit8 v7, v7, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    new-instance v3, Lp4/f;

    .line 57
    .line 58
    invoke-direct {v3, v0, v5}, Lp4/f;-><init>(Lu4/t;Z)V

    .line 59
    .line 60
    .line 61
    new-instance v4, Lp4/f;

    .line 62
    .line 63
    iget-object v5, p0, Lhb/c;->i:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v5, Lp4/f;

    .line 66
    .line 67
    iget-object v5, v5, Lp4/h;->c:Lu4/t;

    .line 68
    .line 69
    invoke-direct {v4, v5, v6}, Lp4/f;-><init>(Lu4/t;Z)V

    .line 70
    .line 71
    .line 72
    new-instance v5, Lp4/a0;

    .line 73
    .line 74
    invoke-direct {v5, v0, v4, v1, v2}, Lp4/a0;-><init>(Lu4/t;Lp4/f;Lz4/g;[Lp4/f;)V

    .line 75
    .line 76
    .line 77
    iget-boolean v1, v5, Lp4/a0;->i:Z

    .line 78
    .line 79
    if-eqz v1, :cond_1

    .line 80
    .line 81
    sget-object v1, Lp4/k;->J:Lp4/j;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    sget-object v1, Lp4/k;->K:Lp4/j;

    .line 85
    .line 86
    :goto_1
    new-instance v2, Lp4/b0;

    .line 87
    .line 88
    iget-object v6, p1, Lu4/i;->i:Lu4/o;

    .line 89
    .line 90
    invoke-static {p1, v6}, Lp4/y;->a(Lu4/i;Lu4/o;)Lu4/p;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-direct {v2, v1, v0, p1, v3}, Lp4/b0;-><init>(Lp4/j;Lu4/t;Lu4/p;Lp4/f;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v4}, Lhb/c;->c(Lp4/h;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, v2}, Lhb/c;->c(Lp4/h;)V

    .line 101
    .line 102
    .line 103
    new-instance p1, Lp4/s;

    .line 104
    .line 105
    invoke-direct {p1, v0}, Lp4/s;-><init>(Lu4/t;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, p1}, Lhb/c;->d(Lp4/h;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v3}, Lhb/c;->d(Lp4/h;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, v5}, Lhb/c;->d(Lp4/h;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_2
    const-string p1, "shouldn\'t happen"

    .line 119
    .line 120
    invoke-static {p1}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    return-void
.end method

.method public z(Ls1/k;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lhb/c;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ls1/y;

    .line 4
    .line 5
    sget-object v1, Ls1/y;->h:Ls1/y;

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lhb/c;->g:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lv1/t;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const-wide/16 v1, 0x0

    .line 16
    .line 17
    invoke-interface {v0, v1, v2}, Lv1/t;->m0(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    new-instance v2, Ls1/z;

    .line 22
    .line 23
    iget-object v3, p0, Lhb/c;->j:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Ls1/a0;

    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    invoke-direct {v2, v3, v4}, Ls1/z;-><init>(Ls1/a0;I)V

    .line 29
    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    invoke-static {p1, v0, v1, v2, v3}, Ls1/s;->i(Ls1/k;JLfg/l;Z)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const-string p1, "layoutCoordinates not set"

    .line 37
    .line 38
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    :goto_0
    sget-object p1, Ls1/y;->i:Ls1/y;

    .line 43
    .line 44
    iput-object p1, p0, Lhb/c;->h:Ljava/lang/Object;

    .line 45
    .line 46
    return-void
.end method
