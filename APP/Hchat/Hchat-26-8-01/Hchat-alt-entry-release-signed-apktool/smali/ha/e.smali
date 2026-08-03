.class public final Lha/e;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "moments_auto_forward"

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
    new-instance p1, Laa/g;

    .line 5
    .line 6
    const-string v0, "\u6309\u597d\u53cb\u548c\u5185\u5bb9\u89c4\u5219\u9759\u9ed8\u8f6c\u53d1\u670b\u53cb\u5708"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "moments_auto_forward"

    .line 11
    .line 12
    const-string v3, "\u670b\u53cb\u5708\u81ea\u52a8\u8f6c\u53d1"

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
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v1, Lha/h;

    .line 5
    .line 6
    new-instance v2, Lab/b;

    .line 7
    .line 8
    const-class v0, Lha/e;

    .line 9
    .line 10
    invoke-static {v0}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    const-string v6, "logError"

    .line 15
    .line 16
    const-string v7, "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    const/16 v10, 0x10

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    const/4 v8, 0x0

    .line 23
    move-object v4, p0

    .line 24
    invoke-direct/range {v2 .. v10}, Lab/b;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v1, p1, v2}, Lha/h;-><init>(Lr8/g;Lab/b;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, v1, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 31
    .line 32
    const-string v0, "handled_ids"

    .line 33
    .line 34
    const-string v2, "[]"

    .line 35
    .line 36
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-nez p1, :cond_0

    .line 41
    .line 42
    const-string p1, ""

    .line 43
    .line 44
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 45
    .line 46
    invoke-direct {v0, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, v1, Lha/h;->f:Ljava/lang/Object;

    .line 50
    .line 51
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    :try_start_1
    iget-object v2, v1, Lha/h;->h:Ljava/util/LinkedHashSet;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->clear()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 58
    .line 59
    .line 60
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 61
    const/4 v3, 0x0

    .line 62
    :goto_0
    if-lt v3, v2, :cond_1

    .line 63
    .line 64
    :try_start_2
    monitor-exit p1

    .line 65
    sget-object p1, Lsf/n;->a:Lsf/n;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 66
    .line 67
    goto :goto_5

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    move-object p1, v0

    .line 70
    goto :goto_4

    .line 71
    :cond_1
    :try_start_3
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-nez v5, :cond_2

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    const/4 v4, 0x0

    .line 94
    :goto_1
    if-eqz v4, :cond_3

    .line 95
    .line 96
    iget-object v5, v1, Lha/h;->h:Ljava/util/LinkedHashSet;

    .line 97
    .line 98
    invoke-virtual {v5, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :catchall_1
    move-exception v0

    .line 103
    goto :goto_3

    .line 104
    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :goto_3
    :try_start_4
    monitor-exit p1

    .line 108
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 109
    :goto_4
    new-instance v0, Lsf/f;

    .line 110
    .line 111
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    move-object p1, v0

    .line 115
    :goto_5
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    if-eqz p1, :cond_4

    .line 120
    .line 121
    iget-object v2, v1, Lha/h;->f:Ljava/lang/Object;

    .line 122
    .line 123
    monitor-enter v2

    .line 124
    :try_start_5
    iget-object v0, v1, Lha/h;->h:Ljava/util/LinkedHashSet;

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 127
    .line 128
    .line 129
    monitor-exit v2

    .line 130
    iget-object v0, v1, Lha/h;->a:Lab/b;

    .line 131
    .line 132
    const-string v2, "\u8bfb\u53d6\u670b\u53cb\u5708\u81ea\u52a8\u8f6c\u53d1\u53bb\u91cd\u8bb0\u5f55\u5931\u8d25"

    .line 133
    .line 134
    invoke-virtual {v0, v2, p1}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    goto :goto_6

    .line 138
    :catchall_2
    move-exception v0

    .line 139
    move-object p1, v0

    .line 140
    monitor-exit v2

    .line 141
    throw p1

    .line 142
    :cond_4
    :goto_6
    iget-object p1, v1, Lha/h;->e:Ljava/lang/Object;

    .line 143
    .line 144
    monitor-enter p1

    .line 145
    :try_start_6
    iget-boolean v0, v1, Lha/h;->j:Z

    .line 146
    .line 147
    if-eqz v0, :cond_6

    .line 148
    .line 149
    iget-wide v2, v1, Lha/h;->k:J

    .line 150
    .line 151
    const-wide/16 v4, 0x1

    .line 152
    .line 153
    add-long/2addr v2, v4

    .line 154
    iput-wide v2, v1, Lha/h;->k:J

    .line 155
    .line 156
    iget-object v0, v1, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 157
    .line 158
    const-string v2, "enabled_at_seconds"

    .line 159
    .line 160
    const-wide/16 v3, 0x0

    .line 161
    .line 162
    invoke-interface {v0, v2, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 163
    .line 164
    .line 165
    move-result-wide v5

    .line 166
    cmp-long v0, v5, v3

    .line 167
    .line 168
    if-lez v0, :cond_5

    .line 169
    .line 170
    iget-object v0, v1, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 171
    .line 172
    const-string v2, "handled_ids"

    .line 173
    .line 174
    invoke-interface {v0, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-nez v0, :cond_6

    .line 179
    .line 180
    goto :goto_7

    .line 181
    :catchall_3
    move-exception v0

    .line 182
    goto :goto_8

    .line 183
    :cond_5
    :goto_7
    invoke-virtual {v1}, Lha/h;->a()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 184
    .line 185
    .line 186
    :cond_6
    monitor-exit p1

    .line 187
    iget-object p1, v1, Lha/h;->b:Landroid/content/SharedPreferences;

    .line 188
    .line 189
    iget-object v0, v1, Lha/h;->l:Lb9/b;

    .line 190
    .line 191
    invoke-interface {p1, v0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 192
    .line 193
    .line 194
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi()Lp8/d0;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    if-eqz p1, :cond_7

    .line 199
    .line 200
    new-instance v0, Lha/c;

    .line 201
    .line 202
    const/4 v2, 0x1

    .line 203
    invoke-direct {v0, v1, v2}, Lha/c;-><init>(Ljava/lang/Object;I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p1, v0}, Lp8/d0;->n(Lha/c;)V

    .line 207
    .line 208
    .line 209
    :cond_7
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->databaseChanges()Lo8/d;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    if-eqz p1, :cond_8

    .line 214
    .line 215
    new-instance v0, Lg8/e;

    .line 216
    .line 217
    const/4 v2, 0x4

    .line 218
    invoke-direct {v0, v1, v2}, Lg8/e;-><init>(Ljava/lang/Object;I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1, v0}, Lo8/d;->g(Lo8/c;)V

    .line 222
    .line 223
    .line 224
    :cond_8
    return-void

    .line 225
    :goto_8
    monitor-exit p1

    .line 226
    throw v0
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u670b\u53cb\u5708\u81ea\u52a8\u8f6c\u53d1"

    .line 2
    .line 3
    return-object v0
.end method
