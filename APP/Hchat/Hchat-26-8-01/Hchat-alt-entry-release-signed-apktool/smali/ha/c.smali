.class public final synthetic Lha/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lgg/h;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lha/c;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lha/c;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Lgg/j;
    .locals 13

    .line 1
    iget v0, p0, Lha/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, Lgg/j;

    .line 7
    .line 8
    iget-object v0, p0, Lha/c;->b:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v3, v0

    .line 11
    check-cast v3, Lia/a0;

    .line 12
    .line 13
    const-class v0, Lia/a0;

    .line 14
    .line 15
    invoke-static {v0}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const/4 v7, 0x0

    .line 20
    const/4 v8, 0x0

    .line 21
    const/4 v2, 0x1

    .line 22
    const-string v5, "onPostStored"

    .line 23
    .line 24
    const-string v6, "onPostStored(Ljava/lang/Object;)V"

    .line 25
    .line 26
    invoke-direct/range {v1 .. v8}, Lgg/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :pswitch_0
    new-instance v2, Lgg/j;

    .line 31
    .line 32
    iget-object v0, p0, Lha/c;->b:Ljava/lang/Object;

    .line 33
    .line 34
    move-object v4, v0

    .line 35
    check-cast v4, Lha/b0;

    .line 36
    .line 37
    const-class v0, Lha/b0;

    .line 38
    .line 39
    invoke-static {v0}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    const/4 v8, 0x0

    .line 44
    const/4 v9, 0x0

    .line 45
    const/4 v3, 0x1

    .line 46
    const-string v6, "onPostStored"

    .line 47
    .line 48
    const-string v7, "onPostStored(Ljava/lang/Object;)V"

    .line 49
    .line 50
    invoke-direct/range {v2 .. v9}, Lgg/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 51
    .line 52
    .line 53
    return-object v2

    .line 54
    :pswitch_1
    new-instance v3, Lgg/j;

    .line 55
    .line 56
    iget-object v0, p0, Lha/c;->b:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v5, v0

    .line 59
    check-cast v5, Lha/k;

    .line 60
    .line 61
    const-class v0, Lha/k;

    .line 62
    .line 63
    invoke-static {v0}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    const/4 v9, 0x0

    .line 68
    const/4 v10, 0x0

    .line 69
    const/4 v4, 0x1

    .line 70
    const-string v7, "onPostStored"

    .line 71
    .line 72
    const-string v8, "onPostStored(Ljava/lang/Object;)V"

    .line 73
    .line 74
    invoke-direct/range {v3 .. v10}, Lgg/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 75
    .line 76
    .line 77
    return-object v3

    .line 78
    :pswitch_2
    new-instance v4, Lgg/j;

    .line 79
    .line 80
    iget-object v0, p0, Lha/c;->b:Ljava/lang/Object;

    .line 81
    .line 82
    move-object v6, v0

    .line 83
    check-cast v6, Lha/h;

    .line 84
    .line 85
    const-class v0, Lha/h;

    .line 86
    .line 87
    invoke-static {v0}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    const/4 v10, 0x0

    .line 92
    const/4 v11, 0x0

    .line 93
    const/4 v5, 0x1

    .line 94
    const-string v8, "onPostStored"

    .line 95
    .line 96
    const-string v9, "onPostStored(Ljava/lang/Object;)V"

    .line 97
    .line 98
    invoke-direct/range {v4 .. v11}, Lgg/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 99
    .line 100
    .line 101
    return-object v4

    .line 102
    :pswitch_3
    new-instance v5, Lgg/j;

    .line 103
    .line 104
    iget-object v0, p0, Lha/c;->b:Ljava/lang/Object;

    .line 105
    .line 106
    move-object v7, v0

    .line 107
    check-cast v7, Lha/d;

    .line 108
    .line 109
    const-class v0, Lha/d;

    .line 110
    .line 111
    invoke-static {v0}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    const/4 v11, 0x0

    .line 116
    const/4 v12, 0x0

    .line 117
    const/4 v6, 0x1

    .line 118
    const-string v9, "onPostStored"

    .line 119
    .line 120
    const-string v10, "onPostStored(Ljava/lang/Object;)V"

    .line 121
    .line 122
    invoke-direct/range {v5 .. v12}, Lgg/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 123
    .line 124
    .line 125
    return-object v5

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget v0, p0, Lha/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lha/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lia/a0;

    .line 9
    .line 10
    invoke-static {p1}, Lia/a0;->q(Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-object v2, v0, Lia/a0;->b:Lb5/c;

    .line 17
    .line 18
    monitor-enter v2

    .line 19
    :try_start_0
    invoke-virtual {v2}, Lb5/c;->J()Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3, v1}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    monitor-exit v2

    .line 28
    if-nez v3, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v0, p1}, Lia/a0;->i(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance p1, Laa/c;

    .line 35
    .line 36
    const/16 v2, 0x13

    .line 37
    .line 38
    invoke-direct {p1, v0, v2, v1}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Lia/a0;->r(Lfg/a;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    move-object p1, v0

    .line 47
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    throw p1

    .line 49
    :cond_1
    :goto_0
    return-void

    .line 50
    :pswitch_0
    iget-object v0, p0, Lha/c;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lha/b0;

    .line 53
    .line 54
    iget-object v1, v0, Lha/b0;->c:Landroid/content/SharedPreferences;

    .line 55
    .line 56
    const-string v2, "enable"

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_2

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    const-string v2, "system_notification"

    .line 67
    .line 68
    const/4 v3, 0x1

    .line 69
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-nez v2, :cond_3

    .line 74
    .line 75
    const-string v2, "toast"

    .line 76
    .line 77
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_3

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    :try_start_2
    iget-object v1, v0, Lha/b0;->e:Ljava/util/concurrent/ExecutorService;

    .line 85
    .line 86
    new-instance v2, La1/d;

    .line 87
    .line 88
    const/16 v3, 0xf

    .line 89
    .line 90
    invoke-direct {v2, v0, v3, p1}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 94
    .line 95
    .line 96
    :catchall_1
    :goto_1
    return-void

    .line 97
    :pswitch_1
    iget-object v0, p0, Lha/c;->b:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Lha/k;

    .line 100
    .line 101
    iget-object v1, v0, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 102
    .line 103
    const-string v2, "enable"

    .line 104
    .line 105
    const/4 v3, 0x0

    .line 106
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-nez v1, :cond_4

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_4
    :try_start_3
    iget-object v1, v0, Lha/k;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 114
    .line 115
    new-instance v2, La1/d;

    .line 116
    .line 117
    const/16 v3, 0xd

    .line 118
    .line 119
    invoke-direct {v2, v0, v3, p1}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 123
    .line 124
    .line 125
    :catchall_2
    :goto_2
    return-void

    .line 126
    :pswitch_2
    iget-object v0, p0, Lha/c;->b:Ljava/lang/Object;

    .line 127
    .line 128
    move-object v2, v0

    .line 129
    check-cast v2, Lha/h;

    .line 130
    .line 131
    iget-object v0, v2, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 132
    .line 133
    const-string v1, "enable"

    .line 134
    .line 135
    const/4 v3, 0x0

    .line 136
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-nez v0, :cond_5

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_5
    iget-wide v4, v2, Lha/h;->k:J

    .line 144
    .line 145
    :try_start_4
    iget-object v0, v2, Lha/h;->d:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 146
    .line 147
    new-instance v1, Lca/r;

    .line 148
    .line 149
    const/4 v6, 0x2

    .line 150
    move-object v3, p1

    .line 151
    invoke-direct/range {v1 .. v6}, Lca/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;JI)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 155
    .line 156
    .line 157
    sget-object p1, Lsf/n;->a:Lsf/n;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :catchall_3
    move-exception v0

    .line 161
    move-object p1, v0

    .line 162
    new-instance v0, Lsf/f;

    .line 163
    .line 164
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 165
    .line 166
    .line 167
    move-object p1, v0

    .line 168
    :goto_3
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    if-eqz p1, :cond_6

    .line 173
    .line 174
    iget-object v0, v2, Lha/h;->a:Lab/b;

    .line 175
    .line 176
    const-string v1, "\u63d0\u4ea4\u670b\u53cb\u5708\u81ea\u52a8\u8f6c\u53d1\u4efb\u52a1\u5931\u8d25"

    .line 177
    .line 178
    invoke-virtual {v0, v1, p1}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    :cond_6
    :goto_4
    return-void

    .line 182
    :pswitch_3
    move-object v3, p1

    .line 183
    iget-object p1, p0, Lha/c;->b:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast p1, Lha/d;

    .line 186
    .line 187
    iget-object v0, p1, Lha/d;->b:Landroid/content/SharedPreferences;

    .line 188
    .line 189
    const-string v1, "comment_enable"

    .line 190
    .line 191
    const/4 v2, 0x0

    .line 192
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-nez v0, :cond_7

    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_7
    :try_start_5
    iget-object v0, p1, Lha/d;->c:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 200
    .line 201
    new-instance v1, La1/d;

    .line 202
    .line 203
    const/16 v2, 0xb

    .line 204
    .line 205
    invoke-direct {v1, p1, v2, v3}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 209
    .line 210
    .line 211
    :catchall_4
    :goto_5
    return-void

    .line 212
    nop

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget v0, p0, Lha/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lha/c;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    instance-of v0, p1, Lgg/h;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lha/c;->a()Lgg/j;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast p1, Lgg/h;

    .line 19
    .line 20
    invoke-interface {p1}, Lgg/h;->a()Lgg/j;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {v0, p1}, Lgg/j;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_0
    return p1

    .line 31
    :pswitch_0
    instance-of v0, p1, Lha/c;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    instance-of v0, p1, Lgg/h;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Lha/c;->a()Lgg/j;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast p1, Lgg/h;

    .line 44
    .line 45
    invoke-interface {p1}, Lgg/h;->a()Lgg/j;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {v0, p1}, Lgg/j;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    const/4 p1, 0x0

    .line 55
    :goto_1
    return p1

    .line 56
    :pswitch_1
    instance-of v0, p1, Lha/c;

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    instance-of v0, p1, Lgg/h;

    .line 61
    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-virtual {p0}, Lha/c;->a()Lgg/j;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast p1, Lgg/h;

    .line 69
    .line 70
    invoke-interface {p1}, Lgg/h;->a()Lgg/j;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {v0, p1}, Lgg/j;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    goto :goto_2

    .line 79
    :cond_2
    const/4 p1, 0x0

    .line 80
    :goto_2
    return p1

    .line 81
    :pswitch_2
    instance-of v0, p1, Lha/c;

    .line 82
    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    instance-of v0, p1, Lgg/h;

    .line 86
    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    invoke-virtual {p0}, Lha/c;->a()Lgg/j;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast p1, Lgg/h;

    .line 94
    .line 95
    invoke-interface {p1}, Lgg/h;->a()Lgg/j;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {v0, p1}, Lgg/j;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    goto :goto_3

    .line 104
    :cond_3
    const/4 p1, 0x0

    .line 105
    :goto_3
    return p1

    .line 106
    :pswitch_3
    instance-of v0, p1, Lha/c;

    .line 107
    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    instance-of v0, p1, Lgg/h;

    .line 111
    .line 112
    if-eqz v0, :cond_4

    .line 113
    .line 114
    invoke-virtual {p0}, Lha/c;->a()Lgg/j;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast p1, Lgg/h;

    .line 119
    .line 120
    invoke-interface {p1}, Lgg/h;->a()Lgg/j;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {v0, p1}, Lgg/j;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    goto :goto_4

    .line 129
    :cond_4
    const/4 p1, 0x0

    .line 130
    :goto_4
    return p1

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Lha/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lha/c;->a()Lgg/j;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lgg/j;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0

    .line 15
    :pswitch_0
    invoke-virtual {p0}, Lha/c;->a()Lgg/j;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lgg/j;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0

    .line 24
    :pswitch_1
    invoke-virtual {p0}, Lha/c;->a()Lgg/j;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lgg/j;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    return v0

    .line 33
    :pswitch_2
    invoke-virtual {p0}, Lha/c;->a()Lgg/j;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Lgg/j;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    return v0

    .line 42
    :pswitch_3
    invoke-virtual {p0}, Lha/c;->a()Lgg/j;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Lgg/j;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    return v0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
