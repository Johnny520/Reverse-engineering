.class public final Lua/b;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final e:Landroid/os/Handler;

.field public final f:Ljava/util/concurrent/ConcurrentHashMap;

.field public volatile g:Z

.field public volatile h:Lua/k;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lr8/a;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lua/b;->e:Landroid/os/Handler;

    .line 14
    .line 15
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lua/b;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    return-void
.end method

.method public static l(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, "\n"

    .line 11
    .line 12
    const-string v1, "\r"

    .line 13
    .line 14
    const-string v2, "|"

    .line 15
    .line 16
    const-string v3, ","

    .line 17
    .line 18
    const-string v4, "\uff0c"

    .line 19
    .line 20
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {p1, v0}, Log/m;->G0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0, p0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    const/4 p0, 0x1

    .line 66
    return p0

    .line 67
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 68
    return p0
.end method

.method public static n(Lua/d;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lua/d;->a:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const/16 v1, 0x3a

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lua/d;->b:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lua/d;->c:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "auto_transfer"

    .line 2
    .line 3
    return-object v0
.end method

.method public final f(Lr8/g;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Ls8/d;

    .line 5
    .line 6
    const-string v0, "\u81ea\u52a8\u9886\u53d6\u5fae\u4fe1\u8f6c\u8d26"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "auto_transfer"

    .line 11
    .line 12
    const-string v3, "\u81ea\u52a8\u6536\u6b3e"

    .line 13
    .line 14
    invoke-direct {p1, v2, v3, v0, v1}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final g(Lr8/g;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lr8/e;->a:Landroid/os/Handler;

    .line 5
    .line 6
    new-instance v0, Lsh/v1;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v0, p1, v1, p0}, Lsh/v1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x8

    .line 13
    .line 14
    const-string v2, "auto_transfer"

    .line 15
    .line 16
    const-string v3, "\u81ea\u52a8\u6536\u6b3e"

    .line 17
    .line 18
    sget-object v4, Lr8/c;->j:Lr8/c;

    .line 19
    .line 20
    invoke-static {v1, v0, v2, v3, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Le9/a;

    .line 24
    .line 25
    const/16 v1, 0x9

    .line 26
    .line 27
    invoke-direct {v0, p0, v1, p1}, Le9/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const-class p1, Lf8/e;

    .line 31
    .line 32
    invoke-virtual {p0, p1, v0}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final k(Lua/c;Lk8/o;Lua/d;Lua/f;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v5, p3

    .line 6
    .line 7
    const-string v2, "confirm"

    .line 8
    .line 9
    move-object/from16 v3, p4

    .line 10
    .line 11
    invoke-virtual {v0, v5, v2, v3}, Lua/b;->m(Lua/d;Ljava/lang/String;Lua/f;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    const-string v3, "\u81ea\u52a8\u6536\u6b3e\u5931\u8d25"

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    invoke-virtual {v0, v3, v4}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    if-nez v2, :cond_1

    .line 24
    .line 25
    goto/16 :goto_2

    .line 26
    .line 27
    :cond_1
    iget-object v2, v0, Lua/b;->h:Lua/k;

    .line 28
    .line 29
    if-eqz v2, :cond_8

    .line 30
    .line 31
    invoke-static {v5}, Lua/b;->n(Lua/d;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_2

    .line 40
    .line 41
    iget-object v3, v2, Lua/k;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 42
    .line 43
    invoke-virtual {v3, v8}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto/16 :goto_2

    .line 50
    .line 51
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 52
    .line 53
    .line 54
    move-result-wide v6

    .line 55
    iget-object v3, v1, Lua/c;->B:Ljava/lang/String;

    .line 56
    .line 57
    move-object/from16 v4, p2

    .line 58
    .line 59
    invoke-virtual/range {v2 .. v7}, Lua/k;->a(Ljava/lang/String;Lk8/o;Lua/d;J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    iget-object v3, v1, Lua/c;->C:Ljava/lang/String;

    .line 64
    .line 65
    move-object/from16 v5, p3

    .line 66
    .line 67
    invoke-virtual/range {v2 .. v7}, Lua/k;->a(Ljava/lang/String;Lk8/o;Lua/d;J)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    move-object v15, v2

    .line 72
    move-object v2, v4

    .line 73
    move-wide/from16 v16, v6

    .line 74
    .line 75
    iget-boolean v10, v1, Lua/c;->v:Z

    .line 76
    .line 77
    if-nez v10, :cond_3

    .line 78
    .line 79
    iget-boolean v4, v1, Lua/c;->w:Z

    .line 80
    .line 81
    if-eqz v4, :cond_4

    .line 82
    .line 83
    :cond_3
    move-object v6, v3

    .line 84
    iget-object v3, v15, Lua/k;->d:Lsa/c;

    .line 85
    .line 86
    iget-object v7, v2, Lk8/o;->c:Ljava/lang/String;

    .line 87
    .line 88
    iget-boolean v11, v1, Lua/c;->w:Z

    .line 89
    .line 90
    iget-boolean v12, v1, Lua/c;->x:Z

    .line 91
    .line 92
    iget-boolean v13, v1, Lua/c;->z:Z

    .line 93
    .line 94
    iget-object v14, v1, Lua/c;->A:Ljava/lang/String;

    .line 95
    .line 96
    const-string v4, "\u81ea\u52a8\u6536\u6b3e"

    .line 97
    .line 98
    move-object v5, v9

    .line 99
    const v9, 0x493e0

    .line 100
    .line 101
    .line 102
    invoke-virtual/range {v3 .. v14}, Lsa/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZZZLjava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :cond_4
    iget-boolean v3, v1, Lua/c;->D:Z

    .line 106
    .line 107
    if-eqz v3, :cond_6

    .line 108
    .line 109
    iget-object v3, v1, Lua/c;->E:Ljava/lang/String;

    .line 110
    .line 111
    move-object/from16 v5, p3

    .line 112
    .line 113
    move-object v4, v2

    .line 114
    move-object v2, v15

    .line 115
    move-wide/from16 v6, v16

    .line 116
    .line 117
    invoke-virtual/range {v2 .. v7}, Lua/k;->a(Ljava/lang/String;Lk8/o;Lua/d;J)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 122
    .line 123
    .line 124
    move-result v8

    .line 125
    if-eqz v8, :cond_5

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_5
    iget-object v8, v2, Lua/k;->c:Landroid/os/Handler;

    .line 129
    .line 130
    new-instance v9, Lrb/g;

    .line 131
    .line 132
    const/4 v10, 0x4

    .line 133
    invoke-direct {v9, v2, v10, v3}, Lrb/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v8, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 137
    .line 138
    .line 139
    :goto_0
    move-object v15, v2

    .line 140
    goto :goto_1

    .line 141
    :cond_6
    move-object/from16 v5, p3

    .line 142
    .line 143
    move-object v4, v2

    .line 144
    move-wide/from16 v6, v16

    .line 145
    .line 146
    :goto_1
    iget-object v2, v4, Lk8/o;->c:Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    iget-object v3, v5, Lua/d;->c:Ljava/lang/String;

    .line 152
    .line 153
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    if-eqz v8, :cond_7

    .line 158
    .line 159
    iget-object v3, v4, Lk8/o;->d:Ljava/lang/String;

    .line 160
    .line 161
    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    iget-object v1, v1, Lua/c;->u:Ljava/util/List;

    .line 165
    .line 166
    const/4 v9, 0x0

    .line 167
    move-wide v7, v6

    .line 168
    move-object v6, v1

    .line 169
    move-object v1, v15

    .line 170
    invoke-virtual/range {v1 .. v9}, Lua/k;->b(Ljava/lang/String;Ljava/lang/String;Lk8/o;Lua/d;Ljava/util/List;JI)V

    .line 171
    .line 172
    .line 173
    :cond_8
    :goto_2
    return-void
.end method

.method public final m(Lua/d;Ljava/lang/String;Lua/f;)Z
    .locals 12

    .line 1
    iget-object v2, p1, Lua/d;->b:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p1, Lua/d;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    :cond_0
    move-object v7, v3

    .line 20
    move v6, v4

    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->payment()Li8/d;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->q()Ln8/c;

    .line 31
    .line 32
    .line 33
    move-result-object v11

    .line 34
    if-eqz v11, :cond_2

    .line 35
    .line 36
    invoke-virtual {v11}, Ln8/c;->c()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_3

    .line 41
    .line 42
    :cond_2
    move-object v7, v3

    .line 43
    move v6, v4

    .line 44
    goto :goto_1

    .line 45
    :cond_3
    new-instance v0, Ln8/a;

    .line 46
    .line 47
    move-object v5, v3

    .line 48
    iget v3, p1, Lua/d;->f:I

    .line 49
    .line 50
    move v6, v4

    .line 51
    iget-object v4, p1, Lua/d;->c:Ljava/lang/String;

    .line 52
    .line 53
    move-object v7, v5

    .line 54
    iget v5, p1, Lua/d;->e:I

    .line 55
    .line 56
    if-eqz p3, :cond_4

    .line 57
    .line 58
    iget v6, p3, Lua/f;->c:I

    .line 59
    .line 60
    :cond_4
    if-eqz p3, :cond_5

    .line 61
    .line 62
    iget-object v7, p3, Lua/f;->e:Ljava/lang/String;

    .line 63
    .line 64
    :cond_5
    if-nez v7, :cond_6

    .line 65
    .line 66
    const-string v7, ""

    .line 67
    .line 68
    :cond_6
    if-eqz p3, :cond_7

    .line 69
    .line 70
    iget-wide v8, p3, Lua/f;->d:J

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_7
    const-wide/16 v8, 0x0

    .line 74
    .line 75
    :goto_0
    iget-object v10, p1, Lua/d;->i:Ljava/lang/String;

    .line 76
    .line 77
    invoke-direct/range {v0 .. v10}, Ln8/a;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;JLjava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const-string p1, "refuse"

    .line 81
    .line 82
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    if-eqz p2, :cond_8

    .line 87
    .line 88
    invoke-virtual {v11, p1, v0}, Ln8/c;->f(Ljava/lang/String;Ln8/a;)Z

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    return p1

    .line 93
    :cond_8
    const-string p1, "confirm"

    .line 94
    .line 95
    invoke-virtual {v11, p1, v0}, Ln8/c;->f(Ljava/lang/String;Ln8/a;)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    return p1

    .line 100
    :goto_1
    if-eqz v11, :cond_9

    .line 101
    .line 102
    const/4 p1, 0x1

    .line 103
    goto :goto_2

    .line 104
    :cond_9
    move p1, v6

    .line 105
    :goto_2
    if-eqz v11, :cond_a

    .line 106
    .line 107
    invoke-virtual {v11}, Ln8/c;->c()Z

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    goto :goto_3

    .line 116
    :cond_a
    move-object p2, v7

    .line 117
    :goto_3
    new-instance p3, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    const-string v0, "\u8f6c\u8d26 API \u672a\u5c31\u7eea: api="

    .line 120
    .line 121
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string p1, " canOperate="

    .line 128
    .line 129
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p0, p1, v7}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    return v6

    .line 143
    :goto_4
    const-string p1, "\u8f6c\u8d26\u5355\u53f7\u7f3a\u5931\uff0c\u8df3\u8fc7"

    .line 144
    .line 145
    invoke-virtual {p0, p1, v7}, Lr8/a;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    return v6
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u81ea\u52a8\u6536\u6b3e"

    .line 2
    .line 3
    return-object v0
.end method
