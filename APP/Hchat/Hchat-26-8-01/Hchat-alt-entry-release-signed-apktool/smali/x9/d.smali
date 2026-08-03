.class public abstract Lx9/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final b:Landroid/os/Handler;

.field public static final c:Ljava/util/concurrent/ExecutorService;

.field public static final d:Ljava/util/concurrent/ConcurrentHashMap;

.field public static volatile e:Ljava/lang/String;

.field public static volatile f:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lx9/d;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    new-instance v0, Landroid/os/Handler;

    .line 10
    .line 11
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lx9/d;->b:Landroid/os/Handler;

    .line 19
    .line 20
    new-instance v0, Lc9/q;

    .line 21
    .line 22
    const/16 v1, 0x1d

    .line 23
    .line 24
    invoke-direct {v0, v1}, Lc9/q;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lx9/d;->c:Ljava/util/concurrent/ExecutorService;

    .line 32
    .line 33
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lx9/d;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 39
    .line 40
    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p0, ""

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string v0, "(?is)<appmsg\\b[^>]*>(.*?)</appmsg>"

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-static {v1, p0, v0}, Lx9/d;->l(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "type"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lx9/d;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lx9/d;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-static {p0, v1}, Lx9/d;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, Lx9/d;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_1
    return-object v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "%keyword%"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, p1, v1}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-string p1, "%sender%"

    .line 9
    .line 10
    invoke-static {p0, p1, p2, v1}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string p1, "%wxid%"

    .line 15
    .line 16
    invoke-static {p0, p1, p3, v1}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string p1, "%content%"

    .line 21
    .line 22
    invoke-static {p0, p1, p4, v1}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string p1, "%type%"

    .line 27
    .line 28
    invoke-static {p0, p1, p5, v1}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static c(Landroid/content/Context;Lk8/o;)V
    .locals 7

    .line 1
    new-instance v2, Lx9/e;

    .line 2
    .line 3
    invoke-direct {v2, p0}, Lx9/e;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "keyword_notify_enable"

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v2, v0, v1}, Lx9/e;->a(Ljava/lang/String;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_1

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p1}, Lk8/o;->q()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    goto/16 :goto_1

    .line 24
    .line 25
    :cond_1
    iget-object v0, p1, Lk8/o;->c:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1}, Lk8/o;->d()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :cond_2
    move-object v4, v0

    .line 38
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_9

    .line 46
    .line 47
    invoke-virtual {v2, v4}, Lx9/e;->e(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    const-string v0, "keyword_notify_quiet"

    .line 55
    .line 56
    invoke-virtual {v2, v0, v1}, Lx9/e;->a(Ljava/lang/String;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_4

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_4
    const-string v0, "keyword_notify_quiet_start"

    .line 64
    .line 65
    const-string v1, "22:00:00"

    .line 66
    .line 67
    invoke-virtual {v2, v0, v1}, Lx9/e;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0}, Lx9/d;->k(Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    const-string v1, "keyword_notify_quiet_end"

    .line 76
    .line 77
    const-string v3, "08:00:00"

    .line 78
    .line 79
    invoke-virtual {v2, v1, v3}, Lx9/e;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-static {v1}, Lx9/d;->k(Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-ltz v0, :cond_8

    .line 88
    .line 89
    if-gez v1, :cond_5

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_5
    if-ne v0, v1, :cond_6

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_6
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    const/16 v5, 0xb

    .line 100
    .line 101
    invoke-virtual {v3, v5}, Ljava/util/Calendar;->get(I)I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    mul-int/lit16 v5, v5, 0xe10

    .line 106
    .line 107
    const/16 v6, 0xc

    .line 108
    .line 109
    invoke-virtual {v3, v6}, Ljava/util/Calendar;->get(I)I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    mul-int/lit8 v6, v6, 0x3c

    .line 114
    .line 115
    add-int/2addr v6, v5

    .line 116
    const/16 v5, 0xd

    .line 117
    .line 118
    invoke-virtual {v3, v5}, Ljava/util/Calendar;->get(I)I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    add-int/2addr v3, v6

    .line 123
    if-ge v0, v1, :cond_7

    .line 124
    .line 125
    if-gt v0, v3, :cond_8

    .line 126
    .line 127
    if-ge v3, v1, :cond_8

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_7
    if-ge v3, v0, :cond_9

    .line 131
    .line 132
    if-ge v3, v1, :cond_8

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_8
    :goto_0
    new-instance v0, Lb9/c;

    .line 136
    .line 137
    const/16 v5, 0x19

    .line 138
    .line 139
    move-object v1, p0

    .line 140
    move-object v3, p1

    .line 141
    invoke-direct/range {v0 .. v5}, Lb9/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 142
    .line 143
    .line 144
    sget-object p0, Lx9/d;->c:Ljava/util/concurrent/ExecutorService;

    .line 145
    .line 146
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 147
    .line 148
    .line 149
    :cond_9
    :goto_1
    return-void
.end method

.method public static d(Landroid/content/Context;Lx9/e;Lk8/o;Ljava/lang/String;)V
    .locals 20

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    iget-boolean v1, v0, Lk8/o;->h:Z

    .line 8
    .line 9
    iget-object v3, v0, Lk8/o;->e:Ljava/lang/String;

    .line 10
    .line 11
    const-string v5, "@im.chatroom"

    .line 12
    .line 13
    const-string v6, "@chatroom"

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v9, 0x1

    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Lk8/o;->j()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    invoke-static {v4, v6, v7}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    invoke-static {v4, v5, v7}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v8, v7

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    :goto_0
    move v8, v9

    .line 41
    :goto_1
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {v0}, Lk8/o;->a()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move-object v1, v3

    .line 53
    :goto_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {v0, v1}, Lx9/d;->j(Lk8/o;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v14

    .line 60
    invoke-static {v14}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    if-eqz v10, :cond_3

    .line 65
    .line 66
    goto/16 :goto_12

    .line 67
    .line 68
    :cond_3
    new-instance v10, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-static {v2, v0, v8, v1, v14}, Lx9/d;->g(Lx9/e;Lk8/o;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    :cond_4
    const-string v1, "@\u6240\u6709\u4eba"

    .line 83
    .line 84
    const-string v11, "keyword_notify_at_all"

    .line 85
    .line 86
    if-eqz v8, :cond_5

    .line 87
    .line 88
    invoke-virtual {v2, v11, v9}, Lx9/e;->a(Ljava/lang/String;Z)Z

    .line 89
    .line 90
    .line 91
    move-result v12

    .line 92
    if-eqz v12, :cond_5

    .line 93
    .line 94
    invoke-virtual {v0}, Lk8/o;->n()Z

    .line 95
    .line 96
    .line 97
    move-result v12

    .line 98
    if-eqz v12, :cond_5

    .line 99
    .line 100
    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    :cond_5
    const-string v12, "\u7fa4\u516c\u544a"

    .line 104
    .line 105
    if-eqz v8, :cond_6

    .line 106
    .line 107
    invoke-virtual {v2, v11, v9}, Lx9/e;->a(Ljava/lang/String;Z)Z

    .line 108
    .line 109
    .line 110
    move-result v11

    .line 111
    if-eqz v11, :cond_6

    .line 112
    .line 113
    invoke-virtual {v0}, Lk8/o;->e()Z

    .line 114
    .line 115
    .line 116
    move-result v11

    .line 117
    if-eqz v11, :cond_6

    .line 118
    .line 119
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    :cond_6
    const-string v11, "@\u6211"

    .line 123
    .line 124
    if-eqz v8, :cond_7

    .line 125
    .line 126
    const-string v13, "keyword_notify_at_me"

    .line 127
    .line 128
    invoke-virtual {v2, v13, v9}, Lx9/e;->a(Ljava/lang/String;Z)Z

    .line 129
    .line 130
    .line 131
    move-result v13

    .line 132
    if-eqz v13, :cond_7

    .line 133
    .line 134
    invoke-virtual {v0}, Lk8/o;->g()Z

    .line 135
    .line 136
    .line 137
    move-result v13

    .line 138
    if-eqz v13, :cond_7

    .line 139
    .line 140
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    :cond_7
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 144
    .line 145
    .line 146
    move-result v13

    .line 147
    if-eqz v13, :cond_8

    .line 148
    .line 149
    goto/16 :goto_12

    .line 150
    .line 151
    :cond_8
    iget-object v13, v0, Lk8/o;->d:Ljava/lang/String;

    .line 152
    .line 153
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 154
    .line 155
    .line 156
    move-result v15

    .line 157
    if-eqz v15, :cond_9

    .line 158
    .line 159
    invoke-virtual {v0}, Lk8/o;->c()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v13

    .line 163
    :cond_9
    const-string v0, ""

    .line 164
    .line 165
    const/4 v15, 0x0

    .line 166
    if-nez v8, :cond_a

    .line 167
    .line 168
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    if-eqz v3, :cond_e

    .line 173
    .line 174
    :goto_3
    move-object v13, v4

    .line 175
    goto :goto_6

    .line 176
    :cond_a
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 180
    .line 181
    .line 182
    move-result v16

    .line 183
    if-nez v16, :cond_b

    .line 184
    .line 185
    invoke-static {v13, v6, v7}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 186
    .line 187
    .line 188
    move-result v6

    .line 189
    if-nez v6, :cond_b

    .line 190
    .line 191
    invoke-static {v13, v5, v7}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-nez v5, :cond_b

    .line 196
    .line 197
    goto :goto_6

    .line 198
    :cond_b
    const-string v5, "^([A-Za-z0-9_\\-]+?):\\n"

    .line 199
    .line 200
    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v5, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-static {v5, v7, v3}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    if-eqz v3, :cond_c

    .line 230
    .line 231
    invoke-virtual {v3}, Log/i;->a()Ljava/util/List;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    invoke-static {v9, v3}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    check-cast v3, Ljava/lang/String;

    .line 240
    .line 241
    goto :goto_4

    .line 242
    :cond_c
    move-object v3, v15

    .line 243
    :goto_4
    if-nez v3, :cond_d

    .line 244
    .line 245
    move-object v13, v0

    .line 246
    goto :goto_5

    .line 247
    :cond_d
    move-object v13, v3

    .line 248
    :goto_5
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    if-eqz v3, :cond_e

    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_e
    :goto_6
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    if-eqz v8, :cond_17

    .line 260
    .line 261
    invoke-static {v4}, Lg4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 266
    .line 267
    .line 268
    move-result v6

    .line 269
    if-eqz v6, :cond_f

    .line 270
    .line 271
    move-object v5, v4

    .line 272
    :cond_f
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 273
    .line 274
    .line 275
    move-result v6

    .line 276
    if-nez v6, :cond_15

    .line 277
    .line 278
    invoke-virtual {v13, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v6

    .line 282
    if-nez v6, :cond_15

    .line 283
    .line 284
    if-eqz v3, :cond_10

    .line 285
    .line 286
    invoke-virtual {v3, v4, v13}, Lg8/i;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v6

    .line 290
    goto :goto_7

    .line 291
    :cond_10
    move-object v6, v15

    .line 292
    :goto_7
    if-nez v6, :cond_11

    .line 293
    .line 294
    move-object v6, v0

    .line 295
    :cond_11
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 296
    .line 297
    .line 298
    move-result v7

    .line 299
    if-eqz v7, :cond_14

    .line 300
    .line 301
    if-eqz v3, :cond_12

    .line 302
    .line 303
    invoke-virtual {v3, v13}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v15

    .line 307
    :cond_12
    if-nez v15, :cond_13

    .line 308
    .line 309
    move-object v6, v0

    .line 310
    goto :goto_8

    .line 311
    :cond_13
    move-object v6, v15

    .line 312
    :cond_14
    :goto_8
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    if-eqz v3, :cond_16

    .line 317
    .line 318
    move-object v6, v13

    .line 319
    goto :goto_9

    .line 320
    :cond_15
    const-string v6, "\u672a\u77e5\u6210\u5458"

    .line 321
    .line 322
    :cond_16
    :goto_9
    const-string v3, " | "

    .line 323
    .line 324
    invoke-static {v5, v3, v6}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    goto :goto_a

    .line 329
    :cond_17
    invoke-static {v4}, Lg4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 334
    .line 335
    .line 336
    move-result v5

    .line 337
    if-eqz v5, :cond_18

    .line 338
    .line 339
    invoke-static {v13}, Lg4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    :cond_18
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 344
    .line 345
    .line 346
    move-result v5

    .line 347
    if-eqz v5, :cond_1b

    .line 348
    .line 349
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 350
    .line 351
    .line 352
    move-result v3

    .line 353
    if-eqz v3, :cond_1a

    .line 354
    .line 355
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 356
    .line 357
    .line 358
    move-result v3

    .line 359
    if-eqz v3, :cond_19

    .line 360
    .line 361
    const-string v3, "\u672a\u77e5\u6765\u6e90"

    .line 362
    .line 363
    goto :goto_a

    .line 364
    :cond_19
    move-object v3, v4

    .line 365
    goto :goto_a

    .line 366
    :cond_1a
    move-object v3, v13

    .line 367
    :cond_1b
    :goto_a
    if-eqz v8, :cond_1c

    .line 368
    .line 369
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 370
    .line 371
    .line 372
    move-result v5

    .line 373
    if-nez v5, :cond_1c

    .line 374
    .line 375
    const-string v5, "|"

    .line 376
    .line 377
    invoke-static {v4, v5, v13}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v5

    .line 381
    move-object v13, v5

    .line 382
    goto :goto_b

    .line 383
    :cond_1c
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 384
    .line 385
    .line 386
    move-result v5

    .line 387
    if-eqz v5, :cond_1d

    .line 388
    .line 389
    move-object v13, v4

    .line 390
    :cond_1d
    :goto_b
    invoke-static {v10}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 391
    .line 392
    .line 393
    move-result-object v5

    .line 394
    invoke-static {v5}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 395
    .line 396
    .line 397
    move-result-object v5

    .line 398
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 399
    .line 400
    .line 401
    move-result-object v16

    .line 402
    :goto_c
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 403
    .line 404
    .line 405
    move-result v5

    .line 406
    if-eqz v5, :cond_29

    .line 407
    .line 408
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v5

    .line 412
    move-object v7, v5

    .line 413
    check-cast v7, Ljava/lang/String;

    .line 414
    .line 415
    if-eqz v8, :cond_1e

    .line 416
    .line 417
    const-string v5, "\u7fa4\u6d88\u606f"

    .line 418
    .line 419
    :goto_d
    move-object v15, v5

    .line 420
    goto :goto_e

    .line 421
    :cond_1e
    const-string v5, "\u597d\u53cb"

    .line 422
    .line 423
    goto :goto_d

    .line 424
    :goto_e
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 425
    .line 426
    .line 427
    move-result v5

    .line 428
    const/16 v6, 0x69d1

    .line 429
    .line 430
    if-eq v5, v6, :cond_22

    .line 431
    .line 432
    const v6, 0x19ab2d1

    .line 433
    .line 434
    .line 435
    if-eq v5, v6, :cond_20

    .line 436
    .line 437
    const v6, 0x1e95702

    .line 438
    .line 439
    .line 440
    if-eq v5, v6, :cond_1f

    .line 441
    .line 442
    goto :goto_f

    .line 443
    :cond_1f
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    move-result v5

    .line 447
    if-nez v5, :cond_21

    .line 448
    .line 449
    goto :goto_f

    .line 450
    :cond_20
    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    move-result v5

    .line 454
    if-nez v5, :cond_21

    .line 455
    .line 456
    goto :goto_f

    .line 457
    :cond_21
    sget-object v5, Lx9/c;->q:Lx9/c;

    .line 458
    .line 459
    goto :goto_10

    .line 460
    :cond_22
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v5

    .line 464
    if-nez v5, :cond_23

    .line 465
    .line 466
    :goto_f
    sget-object v5, Lx9/c;->o:Lx9/c;

    .line 467
    .line 468
    goto :goto_10

    .line 469
    :cond_23
    sget-object v5, Lx9/c;->p:Lx9/c;

    .line 470
    .line 471
    :goto_10
    iget-object v6, v5, Lx9/c;->g:Ljava/lang/String;

    .line 472
    .line 473
    invoke-virtual {v2, v6, v0}, Lx9/e;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v6

    .line 477
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 478
    .line 479
    .line 480
    move-result v10

    .line 481
    if-eqz v10, :cond_24

    .line 482
    .line 483
    iget-object v6, v5, Lx9/c;->m:Ljava/lang/String;

    .line 484
    .line 485
    :cond_24
    move-object v10, v6

    .line 486
    move-object/from16 v17, v11

    .line 487
    .line 488
    move-object/from16 v18, v12

    .line 489
    .line 490
    move-object v12, v3

    .line 491
    move-object v11, v7

    .line 492
    invoke-static/range {v10 .. v15}, Lx9/d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v3

    .line 496
    iget-object v6, v5, Lx9/c;->h:Ljava/lang/String;

    .line 497
    .line 498
    invoke-virtual {v2, v6, v0}, Lx9/e;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v6

    .line 502
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 503
    .line 504
    .line 505
    move-result v7

    .line 506
    if-eqz v7, :cond_25

    .line 507
    .line 508
    const-string v6, "%content%"

    .line 509
    .line 510
    :cond_25
    move-object v10, v6

    .line 511
    invoke-static/range {v10 .. v15}, Lx9/d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v6

    .line 515
    iget-object v7, v5, Lx9/c;->i:Ljava/lang/String;

    .line 516
    .line 517
    invoke-virtual {v2, v7, v0}, Lx9/e;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v7

    .line 521
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 522
    .line 523
    .line 524
    move-result v10

    .line 525
    if-eqz v10, :cond_26

    .line 526
    .line 527
    iget-object v7, v5, Lx9/c;->n:Ljava/lang/String;

    .line 528
    .line 529
    :cond_26
    move-object v10, v7

    .line 530
    invoke-static/range {v10 .. v15}, Lx9/d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v10

    .line 534
    const-string v7, "keyword_notify_system"

    .line 535
    .line 536
    invoke-virtual {v2, v7, v9}, Lx9/e;->a(Ljava/lang/String;Z)Z

    .line 537
    .line 538
    .line 539
    move-result v7

    .line 540
    sget-object v15, Lx9/d;->b:Landroid/os/Handler;

    .line 541
    .line 542
    if-eqz v7, :cond_27

    .line 543
    .line 544
    move-object v7, v0

    .line 545
    new-instance v0, Lx9/a;

    .line 546
    .line 547
    move-object/from16 v19, v5

    .line 548
    .line 549
    move-object v5, v3

    .line 550
    move-object/from16 v3, v19

    .line 551
    .line 552
    move-object/from16 v19, v7

    .line 553
    .line 554
    move-object v7, v11

    .line 555
    move-object v11, v1

    .line 556
    move-object/from16 v1, p0

    .line 557
    .line 558
    invoke-direct/range {v0 .. v8}, Lx9/a;-><init>(Landroid/content/Context;Lx9/e;Lx9/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v15, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 562
    .line 563
    .line 564
    goto :goto_11

    .line 565
    :cond_27
    move-object/from16 v19, v0

    .line 566
    .line 567
    move-object v7, v11

    .line 568
    move-object v11, v1

    .line 569
    move-object/from16 v1, p0

    .line 570
    .line 571
    :goto_11
    const-string v0, "keyword_notify_toast"

    .line 572
    .line 573
    invoke-virtual {v2, v0, v9}, Lx9/e;->a(Ljava/lang/String;Z)Z

    .line 574
    .line 575
    .line 576
    move-result v0

    .line 577
    if-eqz v0, :cond_28

    .line 578
    .line 579
    new-instance v0, Leb/w;

    .line 580
    .line 581
    const/4 v3, 0x7

    .line 582
    invoke-direct {v0, v1, v10, v3}, Leb/w;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v15, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 586
    .line 587
    .line 588
    :cond_28
    :try_start_0
    const-string v0, "Hchat_keyword_notification_config"

    .line 589
    .line 590
    invoke-static {v1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    const-string v3, "keyword_notify_last_time"

    .line 599
    .line 600
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 601
    .line 602
    .line 603
    move-result-wide v4

    .line 604
    invoke-interface {v0, v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    const-string v3, "keyword_notify_last_keyword"

    .line 609
    .line 610
    invoke-interface {v0, v3, v7}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 615
    .line 616
    .line 617
    :catchall_0
    move-object/from16 v4, p3

    .line 618
    .line 619
    move-object v1, v11

    .line 620
    move-object v3, v12

    .line 621
    move-object/from16 v11, v17

    .line 622
    .line 623
    move-object/from16 v12, v18

    .line 624
    .line 625
    move-object/from16 v0, v19

    .line 626
    .line 627
    goto/16 :goto_c

    .line 628
    .line 629
    :cond_29
    :goto_12
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 6

    .line 1
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_3

    .line 14
    :cond_0
    :try_start_0
    new-instance v0, Landroid/text/SpannableStringBuilder;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    move v2, v1

    .line 21
    :goto_0
    const/4 v3, 0x4

    .line 22
    invoke-static {p0, p1, v2, v1, v3}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-gez v2, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    .line 30
    .line 31
    const-string v4, "#FF9800"

    .line 32
    .line 33
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-direct {v3, v4}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    add-int/2addr v4, v2

    .line 45
    const/16 v5, 0x21

    .line 46
    .line 47
    invoke-virtual {v0, v3, v2, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    add-int/2addr v2, v3

    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    new-instance v0, Lsf/f;

    .line 58
    .line 59
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    :goto_1
    instance-of p1, v0, Lsf/f;

    .line 63
    .line 64
    if-eqz p1, :cond_2

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    move-object p0, v0

    .line 68
    :goto_2
    check-cast p0, Ljava/lang/CharSequence;

    .line 69
    .line 70
    :cond_3
    :goto_3
    return-object p0
.end method

.method public static f(Ljava/lang/String;)Z
    .locals 9

    .line 1
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

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
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, "<?xml"

    .line 18
    .line 19
    invoke-static {p0, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_3

    .line 24
    .line 25
    const-string v0, "<"

    .line 26
    .line 27
    invoke-static {p0, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    const-string v0, "<msg"

    .line 34
    .line 35
    invoke-static {p0, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_3

    .line 40
    .line 41
    const-string v0, "<appmsg"

    .line 42
    .line 43
    invoke-static {p0, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const-string v7, "[\u6587\u4ef6]"

    .line 51
    .line 52
    const-string v8, "[\u94fe\u63a5]"

    .line 53
    .line 54
    const-string v2, "[\u52a8\u753b\u8868\u60c5]"

    .line 55
    .line 56
    const-string v3, "[\u8868\u60c5]"

    .line 57
    .line 58
    const-string v4, "[\u56fe\u7247]"

    .line 59
    .line 60
    const-string v5, "[\u8bed\u97f3]"

    .line 61
    .line 62
    const-string v6, "[\u89c6\u9891]"

    .line 63
    .line 64
    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    const-string v0, "^(\\[[^\\[\\]\\s]{1,20}\\])+$"

    .line 80
    .line 81
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    xor-int/lit8 p0, p0, 0x1

    .line 97
    .line 98
    return p0

    .line 99
    :cond_3
    :goto_0
    return v1
.end method

.method public static g(Lx9/e;Lk8/o;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p1, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    const-string p2, "keyword_notify_any_group"

    .line 7
    .line 8
    invoke-virtual {p0, p2, v1}, Lx9/e;->a(Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p2, "keyword_notify_any_private"

    .line 14
    .line 15
    invoke-virtual {p0, p2, v1}, Lx9/e;->a(Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    :goto_0
    if-eqz p2, :cond_a

    .line 20
    .line 21
    invoke-virtual {p1}, Lk8/o;->h()Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    :goto_1
    move v2, v1

    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :cond_1
    invoke-virtual {p1}, Lk8/o;->k()Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    const/4 v2, 0x1

    .line 35
    if-nez p2, :cond_4

    .line 36
    .line 37
    invoke-virtual {p1}, Lk8/o;->u()Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-nez p2, :cond_4

    .line 42
    .line 43
    invoke-virtual {p1}, Lk8/o;->t()Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-nez p2, :cond_4

    .line 48
    .line 49
    invoke-virtual {p1}, Lk8/o;->f()Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-nez p2, :cond_4

    .line 54
    .line 55
    invoke-virtual {p1}, Lk8/o;->i()Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-nez p2, :cond_4

    .line 60
    .line 61
    invoke-virtual {p1}, Lk8/o;->l()Z

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    if-nez p2, :cond_4

    .line 66
    .line 67
    invoke-virtual {p1}, Lk8/o;->m()Z

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    if-nez p2, :cond_4

    .line 72
    .line 73
    invoke-virtual {p1}, Lk8/o;->r()Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-nez p2, :cond_4

    .line 78
    .line 79
    invoke-virtual {p1}, Lk8/o;->o()Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-nez p2, :cond_4

    .line 84
    .line 85
    invoke-virtual {p1}, Lk8/o;->s()Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-nez p2, :cond_4

    .line 90
    .line 91
    invoke-virtual {p1}, Lk8/o;->v()Z

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    if-nez p2, :cond_4

    .line 96
    .line 97
    if-eqz v0, :cond_2

    .line 98
    .line 99
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoipVoice()Z

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    if-eqz p2, :cond_2

    .line 104
    .line 105
    move p2, v2

    .line 106
    goto :goto_2

    .line 107
    :cond_2
    move p2, v1

    .line 108
    :goto_2
    if-nez p2, :cond_4

    .line 109
    .line 110
    if-eqz v0, :cond_3

    .line 111
    .line 112
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoipVideo()Z

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    if-eqz p2, :cond_3

    .line 117
    .line 118
    move p2, v2

    .line 119
    goto :goto_3

    .line 120
    :cond_3
    move p2, v1

    .line 121
    :goto_3
    if-eqz p2, :cond_5

    .line 122
    .line 123
    :cond_4
    invoke-virtual {p1}, Lk8/o;->p()Z

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    if-nez p2, :cond_5

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_5
    invoke-virtual {p1}, Lk8/o;->p()Z

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    if-eqz p2, :cond_6

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_6
    invoke-static {p3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    const-string p3, "text"

    .line 146
    .line 147
    iget-object p1, p1, Lk8/o;->b:Ljava/lang/String;

    .line 148
    .line 149
    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-eqz p1, :cond_7

    .line 154
    .line 155
    invoke-static {p2}, Lx9/d;->f(Ljava/lang/String;)Z

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    if-eqz p1, :cond_7

    .line 160
    .line 161
    goto :goto_5

    .line 162
    :cond_7
    if-eqz v0, :cond_8

    .line 163
    .line 164
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getType()I

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    goto :goto_4

    .line 169
    :cond_8
    move p1, v1

    .line 170
    :goto_4
    if-ne p1, v2, :cond_9

    .line 171
    .line 172
    invoke-static {p2}, Lx9/d;->f(Ljava/lang/String;)Z

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    if-eqz p1, :cond_9

    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_9
    invoke-static {p2}, Lx9/d;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    const-string p2, "57"

    .line 184
    .line 185
    invoke-static {p1, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    :goto_5
    if-eqz v2, :cond_a

    .line 190
    .line 191
    const-string p0, "\u4efb\u610f\u5173\u952e\u8bcd"

    .line 192
    .line 193
    return-object p0

    .line 194
    :cond_a
    invoke-virtual {p0}, Lx9/e;->c()Ljava/util/List;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    const-string p1, "\\b"

    .line 199
    .line 200
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    :cond_b
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result p2

    .line 208
    if-eqz p2, :cond_f

    .line 209
    .line 210
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    check-cast p2, Lx9/f;

    .line 215
    .line 216
    iget-object p3, p2, Lx9/f;->a:Ljava/lang/String;

    .line 217
    .line 218
    invoke-static {p3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-eqz v0, :cond_c

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_c
    iget-boolean p2, p2, Lx9/f;->b:Z

    .line 226
    .line 227
    if-eqz p2, :cond_e

    .line 228
    .line 229
    :try_start_0
    invoke-static {p3}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    new-instance v0, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p2

    .line 251
    const/4 v0, 0x2

    .line 252
    invoke-static {p2, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 253
    .line 254
    .line 255
    move-result-object p2

    .line 256
    invoke-virtual {p2, p4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 257
    .line 258
    .line 259
    move-result-object p2

    .line 260
    invoke-virtual {p2}, Ljava/util/regex/Matcher;->find()Z

    .line 261
    .line 262
    .line 263
    move-result p2

    .line 264
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 265
    .line 266
    .line 267
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 268
    goto :goto_7

    .line 269
    :catchall_0
    move-exception p2

    .line 270
    new-instance v0, Lsf/f;

    .line 271
    .line 272
    invoke-direct {v0, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 273
    .line 274
    .line 275
    move-object p2, v0

    .line 276
    :goto_7
    invoke-static {p4, p3, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    instance-of v2, p2, Lsf/f;

    .line 285
    .line 286
    if-eqz v2, :cond_d

    .line 287
    .line 288
    move-object p2, v0

    .line 289
    :cond_d
    check-cast p2, Ljava/lang/Boolean;

    .line 290
    .line 291
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 292
    .line 293
    .line 294
    move-result p2

    .line 295
    goto :goto_8

    .line 296
    :cond_e
    invoke-static {p4, p3, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 297
    .line 298
    .line 299
    move-result p2

    .line 300
    :goto_8
    if-eqz p2, :cond_b

    .line 301
    .line 302
    goto :goto_9

    .line 303
    :cond_f
    const/4 p3, 0x0

    .line 304
    :goto_9
    return-object p3
.end method

.method public static h(Lh/Hchat/hooks/api/model/WeChatMessage;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isQuote()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p0, "quote"

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isImage()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const-string p0, "image"

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoice()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    const-string p0, "voice"

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVideo()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    const-string p0, "video"

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_3
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isEmoji()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_4

    .line 42
    .line 43
    const-string p0, "emoji"

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_4
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isFile()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_5

    .line 51
    .line 52
    const-string p0, "file"

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_5
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isLink()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_6

    .line 60
    .line 61
    const-string p0, "link"

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_6
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isPat()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_7

    .line 69
    .line 70
    const-string p0, "pat"

    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_7
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isSystem()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_8

    .line 78
    .line 79
    const-string p0, "system"

    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_8
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoip()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_9

    .line 87
    .line 88
    const-string p0, "voip"

    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_9
    iget p0, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 92
    .line 93
    const/4 v0, 0x1

    .line 94
    if-ne p0, v0, :cond_a

    .line 95
    .line 96
    const-string p0, "text"

    .line 97
    .line 98
    return-object p0

    .line 99
    :cond_a
    const/16 v0, 0x31

    .line 100
    .line 101
    if-ne p0, v0, :cond_b

    .line 102
    .line 103
    const-string p0, "app"

    .line 104
    .line 105
    return-object p0

    .line 106
    :cond_b
    const-string p0, "unknown"

    .line 107
    .line 108
    return-object p0
.end method

.method public static i(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 10

    .line 1
    sget-object v0, Lx9/d;->e:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_4

    .line 7
    .line 8
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_7

    .line 13
    .line 14
    :try_start_0
    const-string v2, "PRAGMA database_list"

    .line 15
    .line 16
    invoke-virtual {v0, v2, v1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->query(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    new-instance v2, Lsf/f;

    .line 23
    .line 24
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    move-object v0, v2

    .line 28
    :goto_0
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 29
    .line 30
    instance-of v3, v0, Lsf/f;

    .line 31
    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    move-object v0, v2

    .line 35
    :cond_1
    check-cast v0, Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_7

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Ljava/util/Map;

    .line 52
    .line 53
    const-string v3, "file"

    .line 54
    .line 55
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move-object v2, v1

    .line 67
    :goto_2
    if-nez v2, :cond_4

    .line 68
    .line 69
    const-string v2, ""

    .line 70
    .line 71
    :cond_4
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_5

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_5
    new-instance v3, Ljava/io/File;

    .line 79
    .line 80
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    if-eqz v2, :cond_2

    .line 88
    .line 89
    new-instance v3, Ljava/io/File;

    .line 90
    .line 91
    const-string v4, "avatar"

    .line 92
    .line 93
    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-nez v4, :cond_6

    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_2

    .line 107
    .line 108
    :cond_6
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    goto :goto_3

    .line 113
    :cond_7
    move-object v0, v1

    .line 114
    :goto_3
    sput-object v0, Lx9/d;->e:Ljava/lang/String;

    .line 115
    .line 116
    if-eqz v0, :cond_b

    .line 117
    .line 118
    :goto_4
    const/4 v2, 0x0

    .line 119
    const/4 v3, 0x2

    .line 120
    :try_start_1
    const-string v4, "MD5"

    .line 121
    .line 122
    invoke-static {v4}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    sget-object v5, Log/a;->a:Ljava/nio/charset/Charset;

    .line 127
    .line 128
    invoke-virtual {p0, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4, p0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    array-length v4, p0

    .line 140
    mul-int/2addr v4, v3

    .line 141
    new-instance v5, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 144
    .line 145
    .line 146
    array-length v4, p0

    .line 147
    move v6, v2

    .line 148
    :goto_5
    if-lt v6, v4, :cond_8

    .line 149
    .line 150
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    goto :goto_7

    .line 155
    :catchall_1
    move-exception p0

    .line 156
    goto :goto_6

    .line 157
    :cond_8
    aget-byte v7, p0, v6

    .line 158
    .line 159
    ushr-int/lit8 v8, v7, 0x4

    .line 160
    .line 161
    and-int/lit8 v8, v8, 0xf

    .line 162
    .line 163
    const/16 v9, 0x10

    .line 164
    .line 165
    invoke-static {v9}, La/a;->w(I)V

    .line 166
    .line 167
    .line 168
    invoke-static {v8, v9}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    and-int/lit8 v7, v7, 0xf

    .line 179
    .line 180
    invoke-static {v9}, La/a;->w(I)V

    .line 181
    .line 182
    .line 183
    invoke-static {v7, v9}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 191
    .line 192
    .line 193
    add-int/lit8 v6, v6, 0x1

    .line 194
    .line 195
    goto :goto_5

    .line 196
    :goto_6
    new-instance v4, Lsf/f;

    .line 197
    .line 198
    invoke-direct {v4, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 199
    .line 200
    .line 201
    move-object p0, v4

    .line 202
    :goto_7
    nop

    .line 203
    instance-of v4, p0, Lsf/f;

    .line 204
    .line 205
    if-eqz v4, :cond_9

    .line 206
    .line 207
    move-object p0, v1

    .line 208
    :cond_9
    check-cast p0, Ljava/lang/String;

    .line 209
    .line 210
    if-eqz p0, :cond_b

    .line 211
    .line 212
    new-instance v4, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 215
    .line 216
    .line 217
    const/4 v5, 0x1

    .line 218
    new-array v5, v5, [C

    .line 219
    .line 220
    const/16 v6, 0x2f

    .line 221
    .line 222
    aput-char v6, v5, v2

    .line 223
    .line 224
    invoke-static {v0, v5}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    const/4 v0, 0x4

    .line 245
    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const-string v0, "/user_"

    .line 253
    .line 254
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    if-eqz p1, :cond_a

    .line 258
    .line 259
    const-string p1, "hd_"

    .line 260
    .line 261
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    :cond_a
    const-string p1, ".png"

    .line 265
    .line 266
    invoke-static {v4, p0, p1}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    new-instance p1, Ljava/io/File;

    .line 271
    .line 272
    invoke-direct {p1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 276
    .line 277
    .line 278
    move-result p1

    .line 279
    if-eqz p1, :cond_b

    .line 280
    .line 281
    move-object v1, p0

    .line 282
    :cond_b
    return-object v1
.end method

.method public static j(Lk8/o;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 2
    .line 3
    invoke-virtual {p0}, Lk8/o;->k()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const-string p0, "[\u56fe\u7247]"

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->getQuoteMsg()Lh/Hchat/hooks/api/model/WeChatQuoteMsg;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move-object v1, p0

    .line 21
    :goto_0
    const-string v2, " | \u5f15\u7528: "

    .line 22
    .line 23
    const-string v3, ""

    .line 24
    .line 25
    if-eqz v1, :cond_4

    .line 26
    .line 27
    iget-object p0, v1, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->title:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {p0}, Lx9/d;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    iget-object p1, v1, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->content:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {p1}, Lx9/d;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    invoke-static {p0, v2, p1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :cond_2
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-nez p0, :cond_c

    .line 68
    .line 69
    return-object p1

    .line 70
    :cond_4
    if-eqz v0, :cond_5

    .line 71
    .line 72
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    :cond_5
    if-nez p0, :cond_6

    .line 77
    .line 78
    move-object p0, v3

    .line 79
    :cond_6
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_7

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_7
    move-object p1, p0

    .line 87
    :goto_1
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_8

    .line 100
    .line 101
    goto/16 :goto_2

    .line 102
    .line 103
    :cond_8
    const-string p1, "<?xml"

    .line 104
    .line 105
    const/4 v0, 0x0

    .line 106
    invoke-static {p0, p1, v0}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    const/4 v0, 0x1

    .line 111
    if-nez p1, :cond_9

    .line 112
    .line 113
    const-string p1, "<msg"

    .line 114
    .line 115
    invoke-static {p0, p1, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-nez p1, :cond_9

    .line 120
    .line 121
    const-string p1, "<appmsg"

    .line 122
    .line 123
    invoke-static {p0, p1, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-nez p1, :cond_9

    .line 128
    .line 129
    const-string p1, "^[A-Za-z0-9_\\-]+:\\n"

    .line 130
    .line 131
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {p0, v3}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    return-object p0

    .line 158
    :cond_9
    invoke-static {p0}, Lx9/d;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    const-string v1, "57"

    .line 163
    .line 164
    invoke-static {p1, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    const-string v1, "content"

    .line 169
    .line 170
    const-string v4, "title"

    .line 171
    .line 172
    if-eqz p1, :cond_d

    .line 173
    .line 174
    invoke-static {p0, v4}, Lx9/d;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-static {p1}, Lx9/d;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    const-string v4, "(?is)<refermsg>(.*?)</refermsg>"

    .line 183
    .line 184
    invoke-static {v0, p0, v4}, Lx9/d;->l(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-static {p0, v1}, Lx9/d;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    invoke-static {p0}, Lx9/d;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-nez v0, :cond_a

    .line 201
    .line 202
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-nez v0, :cond_a

    .line 207
    .line 208
    invoke-static {p1, v2, p0}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    return-object p0

    .line 213
    :cond_a
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    if-nez v0, :cond_b

    .line 218
    .line 219
    return-object p1

    .line 220
    :cond_b
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 221
    .line 222
    .line 223
    move-result p1

    .line 224
    if-nez p1, :cond_c

    .line 225
    .line 226
    return-object p0

    .line 227
    :cond_c
    :goto_2
    return-object v3

    .line 228
    :cond_d
    invoke-static {p0, v4}, Lx9/d;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-static {p1}, Lx9/d;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    if-eqz v0, :cond_e

    .line 241
    .line 242
    invoke-static {p0, v1}, Lx9/d;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    invoke-static {p0}, Lx9/d;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    return-object p0

    .line 251
    :cond_e
    return-object p1
.end method

.method public static k(Ljava/lang/String;)I
    .locals 5

    .line 1
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, ":"

    .line 10
    .line 11
    filled-new-array {v0}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p0, v0}, Log/m;->G0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x2

    .line 24
    if-gt v1, v0, :cond_2

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    if-ge v0, v2, :cond_2

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-static {v0, p0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    const/16 v3, 0xa

    .line 39
    .line 40
    invoke-static {v3, v2}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    const/4 v4, 0x1

    .line 51
    invoke-static {v4, p0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Ljava/lang/String;

    .line 56
    .line 57
    if-eqz v4, :cond_0

    .line 58
    .line 59
    invoke-static {v3, v4}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    if-eqz v4, :cond_0

    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    move v4, v0

    .line 71
    :goto_0
    invoke-static {v1, p0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    check-cast p0, Ljava/lang/String;

    .line 76
    .line 77
    if-eqz p0, :cond_1

    .line 78
    .line 79
    invoke-static {v3, p0}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    if-eqz p0, :cond_1

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    :cond_1
    if-ltz v2, :cond_2

    .line 90
    .line 91
    const/16 p0, 0x18

    .line 92
    .line 93
    if-ge v2, p0, :cond_2

    .line 94
    .line 95
    if-ltz v4, :cond_2

    .line 96
    .line 97
    const/16 p0, 0x3c

    .line 98
    .line 99
    if-ge v4, p0, :cond_2

    .line 100
    .line 101
    if-ltz v0, :cond_2

    .line 102
    .line 103
    if-ge v0, p0, :cond_2

    .line 104
    .line 105
    mul-int/lit16 v2, v2, 0xe10

    .line 106
    .line 107
    invoke-static {v4, p0, v2, v0}, Lp/a;->g(IIII)I

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    return p0

    .line 112
    :cond_2
    const/4 p0, -0x1

    .line 113
    return p0
.end method

.method public static l(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-nez v0, :cond_4

    .line 8
    .line 9
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    const/16 v0, 0x22

    .line 17
    .line 18
    :try_start_0
    invoke-static {p2, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-eqz p2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->groupCount()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-lt p2, p0, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    if-nez p0, :cond_2

    .line 43
    .line 44
    :cond_1
    move-object p0, v1

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    new-instance p1, Lsf/f;

    .line 48
    .line 49
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    move-object p0, p1

    .line 53
    :cond_2
    :goto_0
    nop

    .line 54
    instance-of p1, p0, Lsf/f;

    .line 55
    .line 56
    if-eqz p1, :cond_3

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    move-object v1, p0

    .line 60
    :goto_1
    check-cast v1, Ljava/lang/String;

    .line 61
    .line 62
    :cond_4
    :goto_2
    return-object v1
.end method

.method public static m(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p0, ""

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string v0, "&lt;"

    .line 11
    .line 12
    const-string v1, "<"

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string v0, "&gt;"

    .line 20
    .line 21
    const-string v1, ">"

    .line 22
    .line 23
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string v0, "&amp;"

    .line 28
    .line 29
    const-string v1, "&"

    .line 30
    .line 31
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string v0, "&quot;"

    .line 36
    .line 37
    const-string v1, "\""

    .line 38
    .line 39
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const-string v0, "&apos;"

    .line 44
    .line 45
    const-string v1, "\'"

    .line 46
    .line 47
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const-string v0, "&#10;"

    .line 52
    .line 53
    const-string v1, "\n"

    .line 54
    .line 55
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    const-string v0, "&#13;"

    .line 60
    .line 61
    const-string v1, "\r"

    .line 62
    .line 63
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    const-string v0, "(?is)<[^>]+>"

    .line 68
    .line 69
    const-string v1, " "

    .line 70
    .line 71
    invoke-static {v0, p0, v1}, Lj8/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    const-string v0, "\\s+"

    .line 76
    .line 77
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0
.end method

.method public static n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {p1}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {p1}, Ljava/util/regex/Pattern;->quote(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v1, ">(?:<!\\[CDATA\\[(.*?)\\]\\]>|(.*?))</"

    .line 23
    .line 24
    const-string v2, ">"

    .line 25
    .line 26
    const-string v3, "(?is)<"

    .line 27
    .line 28
    invoke-static {v3, v0, v1, p1, v2}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-static {v0, p0, p1}, Lx9/d;->l(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    const/4 v0, 0x2

    .line 44
    invoke-static {v0, p0, p1}, Lx9/d;->l(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :cond_1
    return-object v0

    .line 50
    :cond_2
    :goto_0
    const-string p0, ""

    .line 51
    .line 52
    return-object p0
.end method
