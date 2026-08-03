.class public final Lha/a0;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "moments_post_notification"

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
    const-string v0, "\u6307\u5b9a\u597d\u53cb\u53d1\u5e03\u670b\u53cb\u5708\u65f6\u63d0\u9192"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "moments_post_notification"

    .line 11
    .line 12
    const-string v3, "\u670b\u53cb\u5708\u53d1\u5e03\u901a\u77e5"

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
    new-instance v1, Lha/b0;

    .line 5
    .line 6
    new-instance v2, Lab/b;

    .line 7
    .line 8
    const-class v0, Lha/a0;

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
    const/16 v10, 0x15

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
    invoke-direct {v1, p1, v2}, Lha/b0;-><init>(Lr8/g;Lab/b;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, v1, Lha/b0;->c:Landroid/content/SharedPreferences;

    .line 31
    .line 32
    const-string v0, "enabled_at_seconds"

    .line 33
    .line 34
    const-wide/16 v2, 0x0

    .line 35
    .line 36
    invoke-interface {p1, v0, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    iget-object p1, v1, Lha/b0;->c:Landroid/content/SharedPreferences;

    .line 41
    .line 42
    const-string v0, "notified_ids"

    .line 43
    .line 44
    invoke-interface {p1, v0}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    iget-boolean v0, v1, Lha/b0;->i:Z

    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    cmp-long v2, v4, v2

    .line 53
    .line 54
    if-lez v2, :cond_0

    .line 55
    .line 56
    if-nez p1, :cond_1

    .line 57
    .line 58
    :cond_0
    iget-object p1, v1, Lha/b0;->f:Ljava/util/LinkedHashSet;

    .line 59
    .line 60
    monitor-enter p1

    .line 61
    :try_start_0
    iget-object v0, v1, Lha/b0;->f:Ljava/util/LinkedHashSet;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    monitor-exit p1

    .line 67
    iget-object p1, v1, Lha/b0;->c:Landroid/content/SharedPreferences;

    .line 68
    .line 69
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const-string v0, "enabled_at_seconds"

    .line 74
    .line 75
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 76
    .line 77
    .line 78
    move-result-wide v2

    .line 79
    const-wide/16 v4, 0x3e8

    .line 80
    .line 81
    div-long/2addr v2, v4

    .line 82
    invoke-interface {p1, v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    const-string v0, "notified_ids"

    .line 87
    .line 88
    const-string v2, "[]"

    .line 89
    .line 90
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_6

    .line 98
    .line 99
    :catchall_0
    move-exception v0

    .line 100
    monitor-exit p1

    .line 101
    throw v0

    .line 102
    :cond_1
    if-eqz v0, :cond_8

    .line 103
    .line 104
    iget-object p1, v1, Lha/b0;->c:Landroid/content/SharedPreferences;

    .line 105
    .line 106
    const-string v0, "notified_ids"

    .line 107
    .line 108
    const-string v2, ""

    .line 109
    .line 110
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-nez p1, :cond_2

    .line 115
    .line 116
    const-string p1, ""

    .line 117
    .line 118
    :cond_2
    :try_start_1
    new-instance v0, Lorg/json/JSONArray;

    .line 119
    .line 120
    invoke-direct {v0, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-static {}, La/a;->E()Luf/c;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    const/4 v3, 0x0

    .line 132
    :goto_0
    if-lt v3, v2, :cond_3

    .line 133
    .line 134
    invoke-static {p1}, La/a;->t(Luf/c;)Luf/c;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    goto :goto_3

    .line 139
    :catchall_1
    move-exception v0

    .line 140
    move-object p1, v0

    .line 141
    goto :goto_2

    .line 142
    :cond_3
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 158
    .line 159
    .line 160
    move-result v5

    .line 161
    if-nez v5, :cond_4

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_4
    const/4 v4, 0x0

    .line 165
    :goto_1
    if-eqz v4, :cond_5

    .line 166
    .line 167
    invoke-virtual {p1, v4}, Luf/c;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 168
    .line 169
    .line 170
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :goto_2
    new-instance v0, Lsf/f;

    .line 174
    .line 175
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 176
    .line 177
    .line 178
    move-object p1, v0

    .line 179
    :goto_3
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 180
    .line 181
    instance-of v2, p1, Lsf/f;

    .line 182
    .line 183
    if-eqz v2, :cond_6

    .line 184
    .line 185
    move-object p1, v0

    .line 186
    :cond_6
    check-cast p1, Ljava/util/List;

    .line 187
    .line 188
    iget-object v2, v1, Lha/b0;->f:Ljava/util/LinkedHashSet;

    .line 189
    .line 190
    monitor-enter v2

    .line 191
    :try_start_2
    iget-object v0, v1, Lha/b0;->f:Ljava/util/LinkedHashSet;

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 194
    .line 195
    .line 196
    iget-object v0, v1, Lha/b0;->f:Ljava/util/LinkedHashSet;

    .line 197
    .line 198
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-eqz v3, :cond_7

    .line 207
    .line 208
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    check-cast v3, Ljava/lang/String;

    .line 213
    .line 214
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 215
    .line 216
    .line 217
    goto :goto_4

    .line 218
    :catchall_2
    move-exception v0

    .line 219
    move-object p1, v0

    .line 220
    goto :goto_5

    .line 221
    :cond_7
    monitor-exit v2

    .line 222
    goto :goto_6

    .line 223
    :goto_5
    monitor-exit v2

    .line 224
    throw p1

    .line 225
    :cond_8
    :goto_6
    iget-object p1, v1, Lha/b0;->c:Landroid/content/SharedPreferences;

    .line 226
    .line 227
    iget-object v0, v1, Lha/b0;->j:Lb9/b;

    .line 228
    .line 229
    invoke-interface {p1, v0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 230
    .line 231
    .line 232
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi()Lp8/d0;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    if-eqz p1, :cond_9

    .line 237
    .line 238
    new-instance v0, Lha/c;

    .line 239
    .line 240
    const/4 v2, 0x3

    .line 241
    invoke-direct {v0, v1, v2}, Lha/c;-><init>(Ljava/lang/Object;I)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1, v0}, Lp8/d0;->n(Lha/c;)V

    .line 245
    .line 246
    .line 247
    :cond_9
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u670b\u53cb\u5708\u53d1\u5e03\u901a\u77e5"

    .line 2
    .line 3
    return-object v0
.end method
