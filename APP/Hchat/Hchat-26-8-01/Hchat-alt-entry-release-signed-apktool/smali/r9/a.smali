.class public final Lr9/a;
.super Lr8/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public e:Lr9/d0;


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "hchat_extra"

    .line 2
    .line 3
    return-object v0
.end method

.method public final f(Lr8/g;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 5
    .line 6
    const-class v0, Lr9/e0;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    const-string v1, "Hchat_wekit_port_config"

    .line 10
    .line 11
    invoke-static {p1, v1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    monitor-exit v0

    .line 26
    goto/16 :goto_2

    .line 27
    .line 28
    :cond_0
    :try_start_1
    const-string v3, "Hchat_extra_config"

    .line 29
    .line 30
    invoke-static {p1, v3}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-interface {p1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_a

    .line 43
    .line 44
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_9

    .line 61
    .line 62
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Ljava/util/Map$Entry;

    .line 67
    .line 68
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Ljava/lang/String;

    .line 73
    .line 74
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    instance-of v5, v3, Ljava/lang/Boolean;

    .line 79
    .line 80
    if-eqz v5, :cond_2

    .line 81
    .line 82
    check-cast v3, Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    invoke-interface {p1, v4, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :catchall_0
    move-exception p1

    .line 93
    goto/16 :goto_3

    .line 94
    .line 95
    :cond_2
    instance-of v5, v3, Ljava/lang/Float;

    .line 96
    .line 97
    if-eqz v5, :cond_3

    .line 98
    .line 99
    check-cast v3, Ljava/lang/Number;

    .line 100
    .line 101
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    invoke-interface {p1, v4, v3}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_3
    instance-of v5, v3, Ljava/lang/Integer;

    .line 110
    .line 111
    if-eqz v5, :cond_4

    .line 112
    .line 113
    check-cast v3, Ljava/lang/Number;

    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    invoke-interface {p1, v4, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_4
    instance-of v5, v3, Ljava/lang/Long;

    .line 124
    .line 125
    if-eqz v5, :cond_5

    .line 126
    .line 127
    check-cast v3, Ljava/lang/Number;

    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 130
    .line 131
    .line 132
    move-result-wide v5

    .line 133
    invoke-interface {p1, v4, v5, v6}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_5
    instance-of v5, v3, Ljava/lang/String;

    .line 138
    .line 139
    if-eqz v5, :cond_6

    .line 140
    .line 141
    check-cast v3, Ljava/lang/String;

    .line 142
    .line 143
    invoke-interface {p1, v4, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 144
    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_6
    instance-of v5, v3, Ljava/util/Set;

    .line 148
    .line 149
    if-eqz v5, :cond_1

    .line 150
    .line 151
    check-cast v3, Ljava/lang/Iterable;

    .line 152
    .line 153
    new-instance v5, Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    :cond_7
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    if-eqz v6, :cond_8

    .line 167
    .line 168
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    instance-of v7, v6, Ljava/lang/String;

    .line 173
    .line 174
    if-eqz v7, :cond_7

    .line 175
    .line 176
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_8
    invoke-static {v5}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-interface {p1, v4, v3}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    .line 185
    .line 186
    .line 187
    goto/16 :goto_0

    .line 188
    .line 189
    :cond_9
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 190
    .line 191
    .line 192
    :cond_a
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 201
    .line 202
    .line 203
    monitor-exit v0

    .line 204
    :goto_2
    new-instance p1, Lha/k0;

    .line 205
    .line 206
    const-string v0, "hchat_message_time"

    .line 207
    .line 208
    const-string v1, "\u6d88\u606f\u663e\u793a\u65f6\u95f4"

    .line 209
    .line 210
    const-string v2, "\u5728\u804a\u5929\u6d88\u606f\u65c1\u663e\u793a\u65f6\u95f4\u3001\u7c7b\u578b\u7b49\u8be6\u60c5"

    .line 211
    .line 212
    const-string v3, "practical"

    .line 213
    .line 214
    invoke-direct {p1, v0, v1, v2, v3}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 218
    .line 219
    .line 220
    new-instance p1, Lha/k0;

    .line 221
    .line 222
    const-string v0, "hchat_group_member_history"

    .line 223
    .line 224
    const-string v1, "\u5386\u53f2\u53d1\u8a00\u8bb0\u5f55"

    .line 225
    .line 226
    const-string v2, "\u5728\u7fa4\u6210\u5458\u8d44\u6599\u9875\u67e5\u770b\u5386\u53f2\u53d1\u8a00\u8bb0\u5f55"

    .line 227
    .line 228
    const-string v3, "practical"

    .line 229
    .line 230
    invoke-direct {p1, v0, v1, v2, v3}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 234
    .line 235
    .line 236
    new-instance p1, Lha/k0;

    .line 237
    .line 238
    const-string v0, "hchat_red_packet_details"

    .line 239
    .line 240
    const-string v1, "\u7ea2\u5305\u663e\u793a\u8be6\u60c5"

    .line 241
    .line 242
    const-string v2, "\u7ea2\u5305\u8be6\u60c5\u9875\u663e\u793a\u91d1\u989d\u3001\u4e2a\u6570\u548c\u9886\u53d6\u65f6\u95f4"

    .line 243
    .line 244
    const-string v3, "practical"

    .line 245
    .line 246
    invoke-direct {p1, v0, v1, v2, v3}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 250
    .line 251
    .line 252
    new-instance p1, Lha/k0;

    .line 253
    .line 254
    const-string v0, "hchat_skip_web_risk"

    .line 255
    .line 256
    const-string v1, "\u8df3\u8fc7\u7f51\u9875\u98ce\u9669"

    .line 257
    .line 258
    const-string v2, "\u8df3\u8fc7\u5fae\u4fe1 WebView \u9ad8\u98ce\u9669\u7f51\u9875\u62e6\u622a\u63d0\u793a"

    .line 259
    .line 260
    const-string v3, "practical"

    .line 261
    .line 262
    invoke-direct {p1, v0, v1, v2, v3}, Lvb/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p0, p1}, Lr8/a;->h(Lvb/a;)V

    .line 266
    .line 267
    .line 268
    return-void

    .line 269
    :goto_3
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 270
    throw p1
.end method

.method public final g(Lr8/g;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lr9/d0;

    .line 5
    .line 6
    new-instance v1, Lia/t;

    .line 7
    .line 8
    const-class v2, Lr9/a;

    .line 9
    .line 10
    invoke-static {v2}, Leh/a;->i(Ljava/lang/Class;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    const/4 v8, 0x0

    .line 15
    const/16 v9, 0x14

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    const-string v5, "logError"

    .line 19
    .line 20
    const-string v6, "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    move-object v3, p0

    .line 24
    invoke-direct/range {v1 .. v9}, Lia/t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, p1, v1}, Lr9/d0;-><init>(Lr8/g;Lia/t;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, v3, Lr9/a;->e:Lr9/d0;

    .line 31
    .line 32
    new-instance p1, Li/e0;

    .line 33
    .line 34
    const/16 v0, 0xf

    .line 35
    .line 36
    invoke-direct {p1, p0, v0}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 37
    .line 38
    .line 39
    const/16 v0, 0xc

    .line 40
    .line 41
    const-string v1, "hchat_extra"

    .line 42
    .line 43
    const-string v2, "\u5206\u652f\u6269\u5c55\u529f\u80fd"

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    invoke-static {v0, p1, v1, v2, v4}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 47
    .line 48
    .line 49
    new-instance p1, Lq9/a;

    .line 50
    .line 51
    const/4 v0, 0x2

    .line 52
    invoke-direct {p1, p0, v0}, Lq9/a;-><init>(Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    const-class v0, Lf8/e;

    .line 56
    .line 57
    invoke-virtual {p0, v0, p1}, Lr8/a;->i(Ljava/lang/Class;Lf8/d;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final name()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "\u5206\u652f\u6269\u5c55\u529f\u80fd"

    .line 2
    .line 3
    return-object v0
.end method
