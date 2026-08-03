.class public final Le9/s;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final b:Ljava/util/Set;


# instance fields
.field public final a:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    const-string v9, "feedsapp"

    .line 2
    .line 3
    const-string v10, "blogapp"

    .line 4
    .line 5
    const-string v0, "filehelper"

    .line 6
    .line 7
    const-string v1, "fmessage"

    .line 8
    .line 9
    const-string v2, "tmessage"

    .line 10
    .line 11
    const-string v3, "qqmail"

    .line 12
    .line 13
    const-string v4, "weixin"

    .line 14
    .line 15
    const-string v5, "floatbottle"

    .line 16
    .line 17
    const-string v6, "medianote"

    .line 18
    .line 19
    const-string v7, "medianote@chatroom"

    .line 20
    .line 21
    const-string v8, "masssend"

    .line 22
    .line 23
    filled-new-array/range {v0 .. v10}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Le9/s;->b:Ljava/util/Set;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const-string v0, "Hchat_custom_notification"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    iput-object p1, p0, Le9/s;->a:Landroid/content/SharedPreferences;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Le9/c;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const-string v1, ""

    .line 14
    .line 15
    :cond_0
    move-object v3, v1

    .line 16
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    sget-object v4, Le9/s;->b:Ljava/util/Set;

    .line 33
    .line 34
    invoke-interface {v4, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    :goto_0
    return-object v2

    .line 41
    :cond_2
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    invoke-virtual {v0}, Le9/s;->d()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_5

    .line 61
    .line 62
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    move-object v5, v4

    .line 67
    check-cast v5, Le9/c;

    .line 68
    .line 69
    iget-object v5, v5, Le9/c;->b:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v5, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-eqz v5, :cond_4

    .line 76
    .line 77
    move-object v2, v4

    .line 78
    :cond_5
    check-cast v2, Le9/c;

    .line 79
    .line 80
    :goto_1
    if-eqz v2, :cond_6

    .line 81
    .line 82
    return-object v2

    .line 83
    :cond_6
    const-string v1, "@chatroom"

    .line 84
    .line 85
    const/4 v2, 0x0

    .line 86
    invoke-static {v3, v1, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    const/4 v4, 0x1

    .line 91
    if-nez v1, :cond_8

    .line 92
    .line 93
    const-string v1, "@im.chatroom"

    .line 94
    .line 95
    invoke-static {v3, v1, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_7

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_7
    move v6, v2

    .line 103
    goto :goto_3

    .line 104
    :cond_8
    :goto_2
    move v6, v4

    .line 105
    :goto_3
    const-string v1, "gh_"

    .line 106
    .line 107
    invoke-static {v3, v1, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-nez v1, :cond_a

    .line 112
    .line 113
    const-string v1, "@app"

    .line 114
    .line 115
    invoke-static {v3, v1, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-nez v1, :cond_a

    .line 120
    .line 121
    const-string v1, "newsapp"

    .line 122
    .line 123
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_9

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_9
    move v7, v2

    .line 131
    goto :goto_5

    .line 132
    :cond_a
    :goto_4
    move v7, v4

    .line 133
    :goto_5
    const-string v1, "custom_notification_ignore_wechat_dnd"

    .line 134
    .line 135
    if-eqz v6, :cond_b

    .line 136
    .line 137
    const-string v5, "custom_notification_default_group"

    .line 138
    .line 139
    invoke-virtual {v0, v5}, Le9/s;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-virtual {v0, v1}, Le9/s;->b(Ljava/lang/String;)Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    invoke-static {v5, v4, v2, v1}, Le9/r;->f(Ljava/lang/String;ZZZ)Le9/c;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    :goto_6
    move-object v2, v1

    .line 152
    goto :goto_7

    .line 153
    :cond_b
    if-eqz v7, :cond_c

    .line 154
    .line 155
    const-string v5, "custom_notification_default_official"

    .line 156
    .line 157
    invoke-virtual {v0, v5}, Le9/s;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-virtual {v0, v1}, Le9/s;->b(Ljava/lang/String;)Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    invoke-static {v5, v2, v4, v1}, Le9/r;->f(Ljava/lang/String;ZZZ)Le9/c;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    goto :goto_6

    .line 170
    :cond_c
    const-string v4, "custom_notification_default_private"

    .line 171
    .line 172
    invoke-virtual {v0, v4}, Le9/s;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    invoke-virtual {v0, v1}, Le9/s;->b(Ljava/lang/String;)Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    invoke-static {v4, v2, v2, v1}, Le9/r;->f(Ljava/lang/String;ZZZ)Le9/c;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    goto :goto_6

    .line 185
    :goto_7
    const-string v25, ""

    .line 186
    .line 187
    const v26, 0x1fffe0

    .line 188
    .line 189
    .line 190
    const/4 v8, 0x0

    .line 191
    const/4 v9, 0x0

    .line 192
    const/4 v10, 0x0

    .line 193
    const/4 v11, 0x0

    .line 194
    const/4 v12, 0x0

    .line 195
    const/4 v13, 0x0

    .line 196
    const/4 v14, 0x0

    .line 197
    const/4 v15, 0x0

    .line 198
    const/16 v16, 0x0

    .line 199
    .line 200
    const/16 v17, 0x0

    .line 201
    .line 202
    const/16 v18, 0x0

    .line 203
    .line 204
    const/16 v19, 0x0

    .line 205
    .line 206
    const/16 v20, 0x0

    .line 207
    .line 208
    const/16 v21, 0x0

    .line 209
    .line 210
    const/16 v22, 0x0

    .line 211
    .line 212
    const/16 v23, 0x0

    .line 213
    .line 214
    const-string v24, ""

    .line 215
    .line 216
    move-object v4, v3

    .line 217
    move-object v5, v3

    .line 218
    invoke-static/range {v2 .. v26}, Le9/c;->a(Le9/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZIZZZZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;I)Le9/c;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    return-object v1
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Le9/s;->a:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    goto :goto_2

    .line 18
    :goto_1
    new-instance v0, Lsf/f;

    .line 19
    .line 20
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    move-object p1, v0

    .line 24
    :goto_2
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 25
    .line 26
    instance-of v1, p1, Lsf/f;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    move-object p1, v0

    .line 31
    :cond_1
    check-cast p1, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    return p1
.end method

.method public final c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Le9/s;->a:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-interface {v1, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object p1, v0

    .line 17
    goto :goto_1

    .line 18
    :goto_0
    new-instance v1, Lsf/f;

    .line 19
    .line 20
    invoke-direct {v1, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    move-object p1, v1

    .line 24
    :goto_1
    nop

    .line 25
    instance-of v1, p1, Lsf/f;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_1
    move-object v0, p1

    .line 31
    :goto_2
    check-cast v0, Ljava/lang/String;

    .line 32
    .line 33
    return-object v0
.end method

.method public final d()Ljava/util/List;
    .locals 35

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "custom_notification_rules"

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Le9/s;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v2, "custom_notification_ignore_wechat_dnd"

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Le9/s;->b(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const-string v3, "ignoreWechatDnd"

    .line 16
    .line 17
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    sget-object v5, Ltf/t;->g:Ltf/t;

    .line 22
    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    return-object v5

    .line 26
    :cond_0
    :try_start_0
    new-instance v4, Lorg/json/JSONArray;

    .line 27
    .line 28
    invoke-direct {v4, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    const/4 v7, 0x0

    .line 41
    move v8, v7

    .line 42
    :goto_0
    if-lt v8, v6, :cond_2

    .line 43
    .line 44
    new-instance v2, Ljava/util/HashSet;

    .line 45
    .line 46
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 47
    .line 48
    .line 49
    new-instance v3, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_a

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    move-object v6, v4

    .line 69
    check-cast v6, Le9/c;

    .line 70
    .line 71
    iget-object v6, v6, Le9/c;->b:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-eqz v6, :cond_1

    .line 78
    .line 79
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :catchall_0
    move-exception v0

    .line 84
    goto/16 :goto_8

    .line 85
    .line 86
    :cond_2
    invoke-virtual {v4, v8}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    if-eqz v9, :cond_9

    .line 91
    .line 92
    const-string v10, "talker"

    .line 93
    .line 94
    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-static {v10}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v13

    .line 109
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 110
    .line 111
    .line 112
    move-result v10

    .line 113
    if-eqz v10, :cond_3

    .line 114
    .line 115
    goto/16 :goto_7

    .line 116
    .line 117
    :cond_3
    const-string v10, "id"

    .line 118
    .line 119
    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v10

    .line 123
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 124
    .line 125
    .line 126
    move-result v11

    .line 127
    if-eqz v11, :cond_4

    .line 128
    .line 129
    move-object v12, v13

    .line 130
    goto :goto_2

    .line 131
    :cond_4
    move-object v12, v10

    .line 132
    :goto_2
    const-string v10, "label"

    .line 133
    .line 134
    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 139
    .line 140
    .line 141
    move-result v11

    .line 142
    if-eqz v11, :cond_5

    .line 143
    .line 144
    move-object v14, v13

    .line 145
    goto :goto_3

    .line 146
    :cond_5
    move-object v14, v10

    .line 147
    :goto_3
    const-string v10, "group"

    .line 148
    .line 149
    const-string v11, "@chatroom"

    .line 150
    .line 151
    invoke-static {v13, v11, v7}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 152
    .line 153
    .line 154
    move-result v11

    .line 155
    const/4 v15, 0x1

    .line 156
    if-nez v11, :cond_7

    .line 157
    .line 158
    const-string v11, "@im.chatroom"

    .line 159
    .line 160
    invoke-static {v13, v11, v7}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 161
    .line 162
    .line 163
    move-result v11

    .line 164
    if-eqz v11, :cond_6

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_6
    move v11, v7

    .line 168
    goto :goto_5

    .line 169
    :cond_7
    :goto_4
    move v11, v15

    .line 170
    :goto_5
    invoke-virtual {v9, v10, v11}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    const-string v11, "official"

    .line 175
    .line 176
    invoke-virtual {v9, v11, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 177
    .line 178
    .line 179
    move-result v16

    .line 180
    const-string v11, "enabled"

    .line 181
    .line 182
    invoke-virtual {v9, v11, v15}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 183
    .line 184
    .line 185
    move-result v17

    .line 186
    const-string v11, "mode"

    .line 187
    .line 188
    invoke-virtual {v9, v11, v15}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 189
    .line 190
    .line 191
    move-result v18

    .line 192
    const-string v11, "vibrate"

    .line 193
    .line 194
    invoke-virtual {v9, v11, v15}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 195
    .line 196
    .line 197
    move-result v19

    .line 198
    const-string v11, "sound"

    .line 199
    .line 200
    invoke-virtual {v9, v11, v15}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 201
    .line 202
    .line 203
    move-result v20

    .line 204
    const-string v11, "markRead"

    .line 205
    .line 206
    invoke-virtual {v9, v11, v15}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 207
    .line 208
    .line 209
    move-result v21

    .line 210
    const-string v11, "quickReply"

    .line 211
    .line 212
    invoke-virtual {v9, v11, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 213
    .line 214
    .line 215
    move-result v22

    .line 216
    const-string v11, "quoteQuickReply"

    .line 217
    .line 218
    invoke-virtual {v9, v11, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 219
    .line 220
    .line 221
    move-result v23

    .line 222
    const-string v11, "mergeByTalker"

    .line 223
    .line 224
    invoke-virtual {v9, v11, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 225
    .line 226
    .line 227
    move-result v24

    .line 228
    const-string v11, "showDetail"

    .line 229
    .line 230
    invoke-virtual {v9, v11, v15}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 231
    .line 232
    .line 233
    move-result v25

    .line 234
    invoke-virtual {v9, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 235
    .line 236
    .line 237
    move-result v11

    .line 238
    if-eqz v11, :cond_8

    .line 239
    .line 240
    invoke-virtual {v9, v3, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 241
    .line 242
    .line 243
    move-result v11

    .line 244
    move/from16 v26, v11

    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_8
    move/from16 v26, v2

    .line 248
    .line 249
    :goto_6
    const-string v11, "muteEnable"

    .line 250
    .line 251
    invoke-virtual {v9, v11, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 252
    .line 253
    .line 254
    move-result v27

    .line 255
    const-string v11, "muteStart"

    .line 256
    .line 257
    invoke-virtual {v9, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v11

    .line 261
    const-string v15, "23:00:00"

    .line 262
    .line 263
    invoke-static {v11, v15}, Le9/r;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v28

    .line 267
    const-string v11, "muteEnd"

    .line 268
    .line 269
    invoke-virtual {v9, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v11

    .line 273
    const-string v15, "07:00:00"

    .line 274
    .line 275
    invoke-static {v11, v15}, Le9/r;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v29

    .line 279
    const-string v11, "ringtone"

    .line 280
    .line 281
    invoke-virtual {v9, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v30

    .line 285
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    const-string v11, "blockAtAll"

    .line 289
    .line 290
    invoke-virtual {v9, v11, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 291
    .line 292
    .line 293
    move-result v31

    .line 294
    const-string v11, "blockAtMe"

    .line 295
    .line 296
    invoke-virtual {v9, v11, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 297
    .line 298
    .line 299
    move-result v32

    .line 300
    const-string v11, "onlyMembers"

    .line 301
    .line 302
    invoke-virtual {v9, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v11

    .line 306
    invoke-static {v11}, Le9/r;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v33

    .line 310
    const-string v11, "blockMembers"

    .line 311
    .line 312
    invoke-virtual {v9, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v9

    .line 316
    invoke-static {v9}, Le9/r;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v34

    .line 320
    new-instance v11, Le9/c;

    .line 321
    .line 322
    move v15, v10

    .line 323
    invoke-direct/range {v11 .. v34}, Le9/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZIZZZZZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 327
    .line 328
    .line 329
    :cond_9
    :goto_7
    add-int/lit8 v8, v8, 0x1

    .line 330
    .line 331
    goto/16 :goto_0

    .line 332
    .line 333
    :goto_8
    new-instance v3, Lsf/f;

    .line 334
    .line 335
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 336
    .line 337
    .line 338
    :cond_a
    instance-of v0, v3, Lsf/f;

    .line 339
    .line 340
    if-eqz v0, :cond_b

    .line 341
    .line 342
    goto :goto_9

    .line 343
    :cond_b
    move-object v5, v3

    .line 344
    :goto_9
    check-cast v5, Ljava/util/List;

    .line 345
    .line 346
    return-object v5
.end method
