.class public final Lua/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final j:Ljava/util/List;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lia/t;

.field public final c:Landroid/os/Handler;

.field public final d:Lsa/c;

.field public final e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public final f:Lp4/t;

.field public g:Landroid/speech/tts/TextToSpeech;

.field public h:Z

.field public final i:Ljava/util/ArrayDeque;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "{@sender}"

    .line 2
    .line 3
    const-string v1, "{@\u6210\u5458}"

    .line 4
    .line 5
    const-string v2, "{@\u8f6c\u8d26\u7684\u4eba}"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lua/k;->j:Ljava/util/List;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lia/t;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lua/k;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lua/k;->b:Lia/t;

    .line 7
    .line 8
    new-instance p2, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lua/k;->c:Landroid/os/Handler;

    .line 18
    .line 19
    new-instance p2, Lsa/c;

    .line 20
    .line 21
    const-string v0, "Hchat_transfer_notify_manual_v1"

    .line 22
    .line 23
    const-string v1, "Hchat \u81ea\u52a8\u6536\u6b3e\u63d0\u9192"

    .line 24
    .line 25
    const-string v2, "[Hchat:TransferNotifier]"

    .line 26
    .line 27
    invoke-direct {p2, p1, v2, v0, v1}, Lsa/c;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iput-object p2, p0, Lua/k;->d:Lsa/c;

    .line 31
    .line 32
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    iput-object p2, p0, Lua/k;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 37
    .line 38
    new-instance p2, Lp4/t;

    .line 39
    .line 40
    invoke-direct {p2, p1}, Lp4/t;-><init>(Landroid/content/Context;)V

    .line 41
    .line 42
    .line 43
    iput-object p2, p0, Lua/k;->f:Lp4/t;

    .line 44
    .line 45
    new-instance p1, Ljava/util/ArrayDeque;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lua/k;->i:Ljava/util/ArrayDeque;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lk8/o;Lua/d;J)Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p2, Lk8/o;->c:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    iget-object v2, p3, Lua/d;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    iget-object v2, p2, Lk8/o;->d:Ljava/lang/String;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->e()Lg8/i;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {v3, v0}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v3

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move-object v3, p2

    .line 40
    :goto_0
    if-nez v3, :cond_2

    .line 41
    .line 42
    move-object v3, v1

    .line 43
    :cond_2
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    if-eqz v4, :cond_3

    .line 48
    .line 49
    move-object v3, v0

    .line 50
    goto :goto_2

    .line 51
    :goto_1
    new-instance v4, Lsf/f;

    .line 52
    .line 53
    invoke-direct {v4, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    move-object v3, v4

    .line 57
    :cond_3
    :goto_2
    nop

    .line 58
    instance-of v4, v3, Lsf/f;

    .line 59
    .line 60
    if-eqz v4, :cond_4

    .line 61
    .line 62
    move-object v3, v0

    .line 63
    :cond_4
    check-cast v3, Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    const/4 v4, 0x0

    .line 72
    :try_start_1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->e()Lg8/i;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    const-string v6, "@chatroom"

    .line 84
    .line 85
    invoke-static {v0, v6, v4}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-eqz v6, :cond_6

    .line 90
    .line 91
    if-eqz v5, :cond_5

    .line 92
    .line 93
    invoke-virtual {v5, v0, v2}, Lg8/i;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    goto :goto_4

    .line 98
    :catchall_1
    move-exception v0

    .line 99
    goto :goto_3

    .line 100
    :cond_5
    move-object v0, p2

    .line 101
    goto :goto_4

    .line 102
    :cond_6
    if-eqz v5, :cond_5

    .line 103
    .line 104
    invoke-virtual {v5, v2}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 108
    goto :goto_4

    .line 109
    :goto_3
    new-instance v5, Lsf/f;

    .line 110
    .line 111
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    move-object v0, v5

    .line 115
    :goto_4
    nop

    .line 116
    instance-of v5, v0, Lsf/f;

    .line 117
    .line 118
    if-eqz v5, :cond_7

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_7
    move-object p2, v0

    .line 122
    :goto_5
    check-cast p2, Ljava/lang/String;

    .line 123
    .line 124
    if-nez p2, :cond_8

    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_8
    move-object v1, p2

    .line 128
    :goto_6
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    if-eqz p2, :cond_9

    .line 133
    .line 134
    goto :goto_7

    .line 135
    :cond_9
    move-object v2, v1

    .line 136
    :goto_7
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 137
    .line 138
    iget-wide v0, p3, Lua/d;->g:D

    .line 139
    .line 140
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 141
    .line 142
    .line 143
    move-result-object p3

    .line 144
    filled-new-array {p3}, [Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p3

    .line 148
    const/4 v0, 0x1

    .line 149
    invoke-static {p3, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p3

    .line 153
    const-string v0, "%.2f"

    .line 154
    .line 155
    invoke-static {p2, v0, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    const-string p3, "transfer_time_format"

    .line 160
    .line 161
    const-string v0, "yyyy-MM-dd HH:mm:ss"

    .line 162
    .line 163
    iget-object v1, p0, Lua/k;->f:Lp4/t;

    .line 164
    .line 165
    invoke-virtual {v1, p3, v0}, Lp4/t;->y(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p3

    .line 169
    invoke-static {p4, p5, p3}, La/a;->M(JLjava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p3

    .line 173
    const-string p4, "{amount}"

    .line 174
    .line 175
    invoke-static {p1, p4, p2, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    const-string p4, "{\u91d1\u989d}"

    .line 180
    .line 181
    invoke-static {p1, p4, p2, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    const-string p2, "{talker}"

    .line 186
    .line 187
    invoke-static {p1, p2, v3, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    const-string p2, "{\u4f1a\u8bdd}"

    .line 192
    .line 193
    invoke-static {p1, p2, v3, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    const-string p2, "{sender}"

    .line 198
    .line 199
    invoke-static {p1, p2, v2, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    const-string p2, "{\u6210\u5458}"

    .line 204
    .line 205
    invoke-static {p1, p2, v2, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    const-string p2, "{@sender}"

    .line 210
    .line 211
    const-string p4, "@"

    .line 212
    .line 213
    const-string p5, "\u2005"

    .line 214
    .line 215
    invoke-static {p4, v2, p5}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-static {p1, p2, v0, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    const-string p2, "{@\u6210\u5458}"

    .line 224
    .line 225
    invoke-static {p4, v2, p5}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-static {p1, p2, v0, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    const-string p2, "{@\u8f6c\u8d26\u7684\u4eba}"

    .line 234
    .line 235
    invoke-static {p4, v2, p5}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p4

    .line 239
    invoke-static {p1, p2, p4, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    const-string p2, "{time}"

    .line 244
    .line 245
    invoke-static {p1, p2, p3, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    return-object p1
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Lk8/o;Lua/d;Ljava/util/List;JI)V
    .locals 13

    .line 1
    move/from16 v9, p8

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    if-ltz v9, :cond_3

    .line 10
    .line 11
    invoke-interface/range {p5 .. p5}, Ljava/util/Collection;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-ge v9, v0, :cond_3

    .line 16
    .line 17
    move-object/from16 v6, p5

    .line 18
    .line 19
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    move-object v10, v0

    .line 24
    check-cast v10, Lna/h;

    .line 25
    .line 26
    iget-wide v0, v10, Lna/h;->d:J

    .line 27
    .line 28
    const-wide/16 v2, 0x0

    .line 29
    .line 30
    cmp-long v4, v0, v2

    .line 31
    .line 32
    if-gez v4, :cond_0

    .line 33
    .line 34
    move-wide v0, v2

    .line 35
    :cond_0
    iget-boolean v4, v10, Lna/h;->e:Z

    .line 36
    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    const-wide/16 v4, 0x7d1

    .line 40
    .line 41
    sget-object v7, Ljg/d;->g:Ljg/a;

    .line 42
    .line 43
    invoke-virtual {v7, v2, v3, v4, v5}, Ljg/d;->e(JJ)J

    .line 44
    .line 45
    .line 46
    move-result-wide v4

    .line 47
    add-long/2addr v0, v4

    .line 48
    :cond_1
    cmp-long v4, v0, v2

    .line 49
    .line 50
    if-gez v4, :cond_2

    .line 51
    .line 52
    move-wide v11, v2

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    move-wide v11, v0

    .line 55
    :goto_0
    new-instance v0, Lua/j;

    .line 56
    .line 57
    move-object v1, p0

    .line 58
    move-object v2, p1

    .line 59
    move-object v3, p2

    .line 60
    move-object/from16 v4, p3

    .line 61
    .line 62
    move-object/from16 v5, p4

    .line 63
    .line 64
    move-wide/from16 v7, p6

    .line 65
    .line 66
    invoke-direct/range {v0 .. v10}, Lua/j;-><init>(Lua/k;Ljava/lang/String;Ljava/lang/String;Lk8/o;Lua/d;Ljava/util/List;JILna/h;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lua/k;->c:Landroid/os/Handler;

    .line 70
    .line 71
    invoke-virtual {p1, v0, v11, v12}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 72
    .line 73
    .line 74
    :cond_3
    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;Lk8/o;Lua/d;Lna/h;J)Z
    .locals 12

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    iget-object v1, v0, Lna/h;->c:Ljava/lang/String;

    .line 4
    .line 5
    iget v0, v0, Lna/h;->b:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    new-array v3, v2, [C

    .line 9
    .line 10
    const/16 v4, 0x7c

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    aput-char v4, v3, v5

    .line 14
    .line 15
    const/4 v4, 0x6

    .line 16
    invoke-static {v1, v3, v4}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    new-instance v4, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-static {v3}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v6, :cond_0

    .line 38
    .line 39
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    check-cast v6, Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v6, v4}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v6, :cond_2

    .line 63
    .line 64
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    move-object v7, v6

    .line 69
    check-cast v7, Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-nez v7, :cond_1

    .line 76
    .line 77
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eqz v4, :cond_3

    .line 86
    .line 87
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    :goto_2
    move-object v7, v1

    .line 96
    goto :goto_3

    .line 97
    :cond_3
    sget-object v1, Ljg/d;->g:Ljg/a;

    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    sget-object v4, Ljg/d;->g:Ljg/a;

    .line 104
    .line 105
    invoke-virtual {v4, v1}, Ljg/a;->g(I)I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, Ljava/lang/String;

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :goto_3
    const/4 v1, 0x2

    .line 117
    if-eq v0, v2, :cond_4

    .line 118
    .line 119
    if-eq v0, v1, :cond_4

    .line 120
    .line 121
    const/16 v3, 0x8

    .line 122
    .line 123
    if-ne v0, v3, :cond_5

    .line 124
    .line 125
    :cond_4
    move-object v6, p0

    .line 126
    move-object v8, p3

    .line 127
    move-object/from16 v9, p4

    .line 128
    .line 129
    move-wide/from16 v10, p6

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_5
    move-object v3, v7

    .line 133
    goto :goto_5

    .line 134
    :goto_4
    invoke-virtual/range {v6 .. v11}, Lua/k;->a(Ljava/lang/String;Lk8/o;Lua/d;J)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    :goto_5
    sget-object v4, Lua/k;->j:Ljava/util/List;

    .line 139
    .line 140
    if-eq v0, v1, :cond_9

    .line 141
    .line 142
    if-eqz v4, :cond_6

    .line 143
    .line 144
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_6

    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_6
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    if-eqz v6, :cond_8

    .line 160
    .line 161
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    check-cast v6, Ljava/lang/String;

    .line 166
    .line 167
    invoke-static {v7, v6, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    if-eqz v6, :cond_7

    .line 172
    .line 173
    goto :goto_7

    .line 174
    :cond_8
    :goto_6
    move v1, v5

    .line 175
    goto :goto_8

    .line 176
    :cond_9
    :goto_7
    move v1, v2

    .line 177
    :goto_8
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    move-object v6, v3

    .line 182
    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v8

    .line 186
    const-string v9, ""

    .line 187
    .line 188
    if-eqz v8, :cond_a

    .line 189
    .line 190
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    check-cast v8, Ljava/lang/String;

    .line 195
    .line 196
    invoke-static {v6, v8, v9, v5}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    goto :goto_9

    .line 201
    :cond_a
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 214
    .line 215
    .line 216
    move-result-object v8

    .line 217
    packed-switch v0, :pswitch_data_0

    .line 218
    .line 219
    .line 220
    goto/16 :goto_b

    .line 221
    .line 222
    :pswitch_0
    if-eqz v8, :cond_c

    .line 223
    .line 224
    iget-object p2, v8, Lj8/p;->f:Lj8/h;

    .line 225
    .line 226
    if-eqz p2, :cond_c

    .line 227
    .line 228
    invoke-virtual {p2, p1, v7}, Lj8/h;->A(Ljava/lang/String;Ljava/lang/String;)Z

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    if-ne p1, v2, :cond_c

    .line 233
    .line 234
    goto/16 :goto_a

    .line 235
    .line 236
    :pswitch_1
    if-eqz v6, :cond_c

    .line 237
    .line 238
    invoke-virtual {v6, p1, v3}, Lk8/g;->z(Ljava/lang/String;Ljava/lang/String;)Z

    .line 239
    .line 240
    .line 241
    move-result p1

    .line 242
    if-ne p1, v2, :cond_c

    .line 243
    .line 244
    goto :goto_a

    .line 245
    :pswitch_2
    if-eqz v8, :cond_c

    .line 246
    .line 247
    iget-object p2, v8, Lj8/p;->e:Landroidx/lifecycle/x;

    .line 248
    .line 249
    invoke-virtual {p2, p1, v7, v9}, Landroidx/lifecycle/x;->T(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 250
    .line 251
    .line 252
    move-result p1

    .line 253
    if-ne p1, v2, :cond_c

    .line 254
    .line 255
    goto :goto_a

    .line 256
    :pswitch_3
    if-eqz v8, :cond_c

    .line 257
    .line 258
    iget-object p2, v8, Lj8/p;->d:Lj8/f;

    .line 259
    .line 260
    invoke-virtual {p2, p1, v7}, Lj8/f;->v(Ljava/lang/String;Ljava/lang/String;)Z

    .line 261
    .line 262
    .line 263
    move-result p1

    .line 264
    if-ne p1, v2, :cond_c

    .line 265
    .line 266
    goto :goto_a

    .line 267
    :pswitch_4
    if-eqz v8, :cond_c

    .line 268
    .line 269
    iget-object p2, v8, Lj8/p;->c:Lbb/b;

    .line 270
    .line 271
    if-eqz p2, :cond_c

    .line 272
    .line 273
    invoke-virtual {p2, p1, v7}, Lbb/b;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 274
    .line 275
    .line 276
    move-result p1

    .line 277
    if-ne p1, v2, :cond_c

    .line 278
    .line 279
    goto :goto_a

    .line 280
    :pswitch_5
    if-eqz v8, :cond_c

    .line 281
    .line 282
    iget-object p2, v8, Lj8/p;->b:Lj8/y;

    .line 283
    .line 284
    invoke-virtual {p2, p1, v7}, Lj8/y;->t(Ljava/lang/String;Ljava/lang/String;)Z

    .line 285
    .line 286
    .line 287
    move-result p1

    .line 288
    if-ne p1, v2, :cond_c

    .line 289
    .line 290
    goto :goto_a

    .line 291
    :pswitch_6
    if-eqz v8, :cond_c

    .line 292
    .line 293
    invoke-virtual {v8, p1, v7}, Lj8/p;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 294
    .line 295
    .line 296
    move-result p1

    .line 297
    if-ne p1, v2, :cond_c

    .line 298
    .line 299
    goto :goto_a

    .line 300
    :pswitch_7
    if-eqz v1, :cond_b

    .line 301
    .line 302
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    if-nez v0, :cond_b

    .line 307
    .line 308
    if-eqz v6, :cond_c

    .line 309
    .line 310
    invoke-static {p2}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 311
    .line 312
    .line 313
    move-result-object p2

    .line 314
    invoke-virtual {v6, p1, v4, p2}, Lk8/g;->y(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    .line 315
    .line 316
    .line 317
    move-result p1

    .line 318
    if-ne p1, v2, :cond_c

    .line 319
    .line 320
    goto :goto_a

    .line 321
    :cond_b
    if-eqz v6, :cond_c

    .line 322
    .line 323
    invoke-virtual {v6, p1, v4}, Lk8/g;->x(Ljava/lang/String;Ljava/lang/String;)Z

    .line 324
    .line 325
    .line 326
    move-result p1

    .line 327
    if-ne p1, v2, :cond_c

    .line 328
    .line 329
    :goto_a
    return v2

    .line 330
    :cond_c
    :goto_b
    return v5

    .line 331
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Ljava/lang/String;)V
    .locals 6

    .line 1
    const-string v0, "hchat_transfer_"

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lua/k;->g:Landroid/speech/tts/TextToSpeech;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    new-instance v2, Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v3

    .line 16
    new-instance v5, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v3, 0x1

    .line 29
    invoke-virtual {v1, p1, v3, v2, v0}, Landroid/speech/tts/TextToSpeech;->speak(Ljava/lang/CharSequence;ILandroid/os/Bundle;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    goto :goto_1

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 p1, 0x0

    .line 41
    goto :goto_1

    .line 42
    :goto_0
    new-instance v0, Lsf/f;

    .line 43
    .line 44
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    move-object p1, v0

    .line 48
    :goto_1
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    iget-object v0, p0, Lua/k;->b:Lia/t;

    .line 55
    .line 56
    const-string v1, "\u81ea\u52a8\u6536\u6b3e\u64ad\u62a5\u5931\u8d25"

    .line 57
    .line 58
    invoke-virtual {v0, v1, p1}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    :cond_1
    return-void
.end method
