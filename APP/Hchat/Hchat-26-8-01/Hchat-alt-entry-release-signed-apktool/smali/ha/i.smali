.class public final Lha/i;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "moments_auto_like"

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
    const-string v0, "\u6309\u597d\u53cb\u3001\u5185\u5bb9\u548c\u65f6\u95f4\u89c4\u5219\u81ea\u52a8\u70b9\u8d5e"

    .line 7
    .line 8
    const-string v1, "practical"

    .line 9
    .line 10
    const-string v2, "moments_auto_like"

    .line 11
    .line 12
    const-string v3, "\u670b\u53cb\u5708\u81ea\u52a8\u70b9\u8d5e"

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
    new-instance v1, Lha/k;

    .line 5
    .line 6
    new-instance v2, Lab/b;

    .line 7
    .line 8
    const-class v0, Lha/i;

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
    const/16 v10, 0x11

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
    invoke-direct {v1, p1, v2}, Lha/k;-><init>(Lr8/g;Lab/b;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, v1, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 31
    .line 32
    const-string v0, "success_records"

    .line 33
    .line 34
    const-string v2, ""

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
    iget-object p1, v1, Lha/k;->d:Ljava/lang/Object;

    .line 50
    .line 51
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 52
    :try_start_1
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 53
    .line 54
    .line 55
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    const/4 v3, 0x0

    .line 57
    :goto_0
    if-lt v3, v2, :cond_1

    .line 58
    .line 59
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 60
    goto :goto_3

    .line 61
    :cond_1
    :try_start_3
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    if-eqz v4, :cond_2

    .line 66
    .line 67
    const-string v5, "id"

    .line 68
    .line 69
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    if-eqz v4, :cond_2

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :catchall_0
    move-exception v0

    .line 77
    goto :goto_2

    .line 78
    :cond_2
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    :goto_1
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-nez v5, :cond_3

    .line 98
    .line 99
    iget-object v5, v1, Lha/k;->g:Ljava/util/LinkedHashSet;

    .line 100
    .line 101
    invoke-virtual {v5, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 102
    .line 103
    .line 104
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :goto_2
    :try_start_4
    monitor-exit p1

    .line 108
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 109
    :catchall_1
    :goto_3
    iget-boolean p1, v1, Lha/k;->i:Z

    .line 110
    .line 111
    if-eqz p1, :cond_4

    .line 112
    .line 113
    iget-object p1, v1, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 114
    .line 115
    const-string v0, "enabled_at_seconds"

    .line 116
    .line 117
    const-wide/16 v2, 0x0

    .line 118
    .line 119
    invoke-interface {p1, v0, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 120
    .line 121
    .line 122
    move-result-wide v4

    .line 123
    cmp-long p1, v4, v2

    .line 124
    .line 125
    if-gtz p1, :cond_4

    .line 126
    .line 127
    iget-object p1, v1, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 128
    .line 129
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    const-string v0, "enabled_at_seconds"

    .line 134
    .line 135
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 136
    .line 137
    .line 138
    move-result-wide v2

    .line 139
    const-wide/16 v4, 0x3e8

    .line 140
    .line 141
    div-long/2addr v2, v4

    .line 142
    invoke-interface {p1, v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 147
    .line 148
    .line 149
    :cond_4
    iget-object p1, v1, Lha/k;->b:Landroid/content/SharedPreferences;

    .line 150
    .line 151
    iget-object v0, v1, Lha/k;->j:Lb9/b;

    .line 152
    .line 153
    invoke-interface {p1, v0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 154
    .line 155
    .line 156
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->snsApi()Lp8/d0;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    if-eqz p1, :cond_5

    .line 161
    .line 162
    new-instance v0, Lha/c;

    .line 163
    .line 164
    const/4 v2, 0x2

    .line 165
    invoke-direct {v0, v1, v2}, Lha/c;-><init>(Ljava/lang/Object;I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, v0}, Lp8/d0;->n(Lha/c;)V

    .line 169
    .line 170
    .line 171
    :cond_5
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->databaseChanges()Lo8/d;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    if-eqz p1, :cond_6

    .line 176
    .line 177
    new-instance v0, Lg8/e;

    .line 178
    .line 179
    const/4 v2, 0x5

    .line 180
    invoke-direct {v0, v1, v2}, Lg8/e;-><init>(Ljava/lang/Object;I)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, v0}, Lo8/d;->g(Lo8/c;)V

    .line 184
    .line 185
    .line 186
    :cond_6
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u670b\u53cb\u5708\u81ea\u52a8\u70b9\u8d5e"

    .line 2
    .line 3
    return-object v0
.end method
