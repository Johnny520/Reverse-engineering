.class public abstract Lgb/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lgb/q;->a:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->account()Lg8/a;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-eqz p0, :cond_c

    .line 9
    .line 10
    invoke-virtual {p0}, Lg8/a;->c()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 29
    if-nez v1, :cond_b

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    :try_start_1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contacts()Lg8/i;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    invoke-virtual {v2, v0}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 39
    .line 40
    .line 41
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception v2

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move-object v2, v1

    .line 46
    goto :goto_1

    .line 47
    :goto_0
    :try_start_2
    new-instance v3, Lsf/f;

    .line 48
    .line 49
    invoke-direct {v3, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    move-object v2, v3

    .line 53
    :goto_1
    nop

    .line 54
    instance-of v3, v2, Lsf/f;

    .line 55
    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    move-object v2, v1

    .line 59
    :cond_1
    check-cast v2, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 60
    .line 61
    const/16 v3, 0x2a

    .line 62
    .line 63
    invoke-virtual {p0, v3}, Lg8/a;->b(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 79
    .line 80
    .line 81
    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 82
    const-string v5, ""

    .line 83
    .line 84
    if-eqz v4, :cond_4

    .line 85
    .line 86
    if-eqz v2, :cond_2

    .line 87
    .line 88
    :try_start_3
    iget-object v3, v2, Lh/Hchat/hooks/api/model/WeChatContact;->customWxId:Ljava/lang/String;

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_2
    move-object v3, v1

    .line 92
    :goto_2
    if-nez v3, :cond_3

    .line 93
    .line 94
    move-object v3, v5

    .line 95
    :cond_3
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    :cond_4
    const/4 v4, 0x4

    .line 104
    invoke-virtual {p0, v4}, Lg8/a;->b(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-eqz v4, :cond_7

    .line 124
    .line 125
    if-eqz v2, :cond_5

    .line 126
    .line 127
    iget-object v1, v2, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 128
    .line 129
    :cond_5
    if-nez v1, :cond_6

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_6
    move-object v5, v1

    .line 133
    :goto_3
    invoke-static {v5}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    :cond_7
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    const/16 v2, 0x80

    .line 146
    .line 147
    if-gt v1, v2, :cond_a

    .line 148
    .line 149
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-gt v1, v2, :cond_9

    .line 154
    .line 155
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    const/16 v2, 0x64

    .line 160
    .line 161
    if-gt v1, v2, :cond_8

    .line 162
    .line 163
    new-instance v1, Lgb/s;

    .line 164
    .line 165
    invoke-direct {v1, v0, v3, p0}, Lgb/s;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_8
    const-string p0, "\u5f53\u524d\u8d26\u53f7\u5fae\u4fe1\u6635\u79f0\u8fc7\u957f"

    .line 170
    .line 171
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 172
    .line 173
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    throw v0

    .line 177
    :cond_9
    const-string p0, "\u5f53\u524d\u8d26\u53f7\u5fae\u4fe1\u53f7\u957f\u5ea6\u5f02\u5e38"

    .line 178
    .line 179
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 180
    .line 181
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw v0

    .line 185
    :cond_a
    const-string p0, "\u5f53\u524d\u8d26\u53f7 wxid \u957f\u5ea6\u5f02\u5e38"

    .line 186
    .line 187
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 188
    .line 189
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    throw v0

    .line 193
    :cond_b
    const-string p0, "\u65e0\u6cd5\u8bfb\u53d6\u5f53\u524d\u8d26\u53f7 wxid\uff0c\u8bf7\u91cd\u542f\u5fae\u4fe1\u540e\u91cd\u8bd5"

    .line 194
    .line 195
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 196
    .line 197
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw v0

    .line 201
    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 202
    .line 203
    const-string v0, "\u5f53\u524d\u5fae\u4fe1\u8d26\u53f7\u8d44\u6599\u5c1a\u672a\u5c31\u7eea\uff0c\u8bf7\u91cd\u542f\u5fae\u4fe1\u540e\u91cd\u8bd5"

    .line 204
    .line 205
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 209
    :catchall_1
    move-exception p0

    .line 210
    new-instance v1, Lsf/f;

    .line 211
    .line 212
    invoke-direct {v1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 213
    .line 214
    .line 215
    :goto_4
    return-object v1
.end method

.method public static b(Lorg/json/JSONObject;)Lgb/c;
    .locals 8

    .line 1
    new-instance v0, Lgb/c;

    .line 2
    .line 3
    const-string v1, "commentId"

    .line 4
    .line 5
    invoke-static {v1, p0}, Lwb/en;->j(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "pluginId"

    .line 10
    .line 11
    invoke-static {v2, p0}, Lwb/en;->j(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "userNickname"

    .line 16
    .line 17
    invoke-static {v3, p0}, Lwb/en;->j(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v4, "content"

    .line 22
    .line 23
    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const-string v5, "createdAt"

    .line 31
    .line 32
    invoke-virtual {p0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    const-string v6, "canDelete"

    .line 40
    .line 41
    const/4 v7, 0x0

    .line 42
    invoke-virtual {p0, v6, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    invoke-direct/range {v0 .. v6}, Lgb/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    return-object v0
.end method

.method public static c(Lorg/json/JSONObject;)Lgb/o;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "latestVersion"

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    :goto_0
    move-object v2, v0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    const-string v0, "snapshot"

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :goto_1
    const-string v0, "files"

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const-string v4, "name"

    .line 27
    .line 28
    const-string v5, ""

    .line 29
    .line 30
    if-eqz v3, :cond_6

    .line 31
    .line 32
    invoke-static {}, La/a;->E()Luf/c;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    const/4 v0, 0x0

    .line 41
    move v8, v0

    .line 42
    :goto_2
    if-lt v8, v7, :cond_1

    .line 43
    .line 44
    invoke-static {v6}, La/a;->t(Luf/c;)Luf/c;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_6

    .line 49
    .line 50
    :goto_3
    move-object/from16 v21, v0

    .line 51
    .line 52
    goto/16 :goto_9

    .line 53
    .line 54
    :cond_1
    invoke-virtual {v3, v8}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    if-eqz v9, :cond_5

    .line 59
    .line 60
    invoke-virtual {v9, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result v10

    .line 68
    if-eqz v10, :cond_2

    .line 69
    .line 70
    move-object v12, v5

    .line 71
    goto :goto_4

    .line 72
    :cond_2
    move-object v12, v0

    .line 73
    :goto_4
    const-string v0, "text"

    .line 74
    .line 75
    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const-string v10, "content"

    .line 80
    .line 81
    invoke-virtual {v9, v10, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v13

    .line 85
    const-string v0, "encoding"

    .line 86
    .line 87
    const-string v10, "utf8"

    .line 88
    .line 89
    invoke-static {v0, v10, v9}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 94
    .line 95
    invoke-virtual {v0, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v15

    .line 99
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    :try_start_0
    const-string v0, "base64"

    .line 103
    .line 104
    invoke-virtual {v15, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_3

    .line 109
    .line 110
    const/4 v0, 0x2

    .line 111
    invoke-static {v13, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    array-length v0, v0

    .line 116
    :goto_5
    int-to-long v10, v0

    .line 117
    goto :goto_6

    .line 118
    :catchall_0
    move-exception v0

    .line 119
    goto :goto_7

    .line 120
    :cond_3
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    sget-object v0, Log/a;->a:Ljava/nio/charset/Charset;

    .line 124
    .line 125
    invoke-virtual {v13, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    array-length v0, v0

    .line 133
    goto :goto_5

    .line 134
    :goto_6
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 135
    .line 136
    .line 137
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    goto :goto_8

    .line 139
    :goto_7
    new-instance v10, Lsf/f;

    .line 140
    .line 141
    invoke-direct {v10, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 142
    .line 143
    .line 144
    move-object v0, v10

    .line 145
    :goto_8
    const-wide/16 v10, -0x1

    .line 146
    .line 147
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    instance-of v11, v0, Lsf/f;

    .line 152
    .line 153
    if-eqz v11, :cond_4

    .line 154
    .line 155
    move-object v0, v10

    .line 156
    :cond_4
    check-cast v0, Ljava/lang/Number;

    .line 157
    .line 158
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 159
    .line 160
    .line 161
    move-result-wide v10

    .line 162
    const-string v0, "size"

    .line 163
    .line 164
    invoke-virtual {v9, v0, v10, v11}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 165
    .line 166
    .line 167
    move-result-wide v16

    .line 168
    new-instance v11, Lgb/g;

    .line 169
    .line 170
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    const-string v0, "sha256"

    .line 174
    .line 175
    invoke-static {v0, v9}, Lwb/en;->j(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 180
    .line 181
    invoke-virtual {v0, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v14

    .line 185
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-direct/range {v11 .. v17}, Lgb/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v6, v11}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    :cond_5
    add-int/lit8 v8, v8, 0x1

    .line 195
    .line 196
    goto/16 :goto_2

    .line 197
    .line 198
    :cond_6
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 199
    .line 200
    goto/16 :goto_3

    .line 201
    .line 202
    :goto_9
    const-string v0, "remotePluginId"

    .line 203
    .line 204
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    if-eqz v3, :cond_7

    .line 213
    .line 214
    const-string v0, "pluginId"

    .line 215
    .line 216
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    :cond_7
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    if-eqz v3, :cond_8

    .line 225
    .line 226
    const-string v0, "id"

    .line 227
    .line 228
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    :cond_8
    move-object v7, v0

    .line 233
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    const-string v0, "sourcePluginId"

    .line 237
    .line 238
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v8

    .line 242
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    const-string v0, "displayName"

    .line 246
    .line 247
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    if-eqz v3, :cond_9

    .line 256
    .line 257
    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    :cond_9
    move-object v9, v0

    .line 262
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    const-string v0, "author"

    .line 266
    .line 267
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v10

    .line 271
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    const/4 v0, 0x0

    .line 275
    if-eqz v2, :cond_a

    .line 276
    .line 277
    const-string v3, "versionName"

    .line 278
    .line 279
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    goto :goto_a

    .line 284
    :cond_a
    move-object v3, v0

    .line 285
    :goto_a
    if-nez v3, :cond_b

    .line 286
    .line 287
    move-object v3, v5

    .line 288
    :cond_b
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    if-eqz v4, :cond_c

    .line 293
    .line 294
    const-string v3, "version"

    .line 295
    .line 296
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    :cond_c
    move-object v11, v3

    .line 301
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    const-string v3, "versionId"

    .line 305
    .line 306
    if-eqz v2, :cond_d

    .line 307
    .line 308
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    goto :goto_b

    .line 313
    :cond_d
    move-object v4, v0

    .line 314
    :goto_b
    if-nez v4, :cond_e

    .line 315
    .line 316
    move-object v4, v5

    .line 317
    :cond_e
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 318
    .line 319
    .line 320
    move-result v6

    .line 321
    if-eqz v6, :cond_f

    .line 322
    .line 323
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    :cond_f
    move-object v12, v4

    .line 328
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    if-eqz v2, :cond_10

    .line 332
    .line 333
    const-string v0, "createdAt"

    .line 334
    .line 335
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    :cond_10
    if-nez v0, :cond_11

    .line 340
    .line 341
    goto :goto_c

    .line 342
    :cond_11
    move-object v5, v0

    .line 343
    :goto_c
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    if-eqz v0, :cond_12

    .line 348
    .line 349
    const-string v0, "updatedAt"

    .line 350
    .line 351
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v5

    .line 355
    :cond_12
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 356
    .line 357
    .line 358
    move-result v0

    .line 359
    if-eqz v0, :cond_13

    .line 360
    .line 361
    const-string v0, "updateTime"

    .line 362
    .line 363
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v5

    .line 367
    :cond_13
    move-object v13, v5

    .line 368
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    const-string v0, "downloadCount"

    .line 372
    .line 373
    const-wide/16 v2, 0x0

    .line 374
    .line 375
    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 376
    .line 377
    .line 378
    move-result-wide v4

    .line 379
    cmp-long v0, v4, v2

    .line 380
    .line 381
    if-gez v0, :cond_14

    .line 382
    .line 383
    move-wide v14, v2

    .line 384
    goto :goto_d

    .line 385
    :cond_14
    move-wide v14, v4

    .line 386
    :goto_d
    const-string v0, "likeCount"

    .line 387
    .line 388
    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 389
    .line 390
    .line 391
    move-result-wide v4

    .line 392
    cmp-long v0, v4, v2

    .line 393
    .line 394
    if-gez v0, :cond_15

    .line 395
    .line 396
    move-wide/from16 v16, v2

    .line 397
    .line 398
    goto :goto_e

    .line 399
    :cond_15
    move-wide/from16 v16, v4

    .line 400
    .line 401
    :goto_e
    const-string v0, "commentCount"

    .line 402
    .line 403
    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 404
    .line 405
    .line 406
    move-result-wide v4

    .line 407
    cmp-long v0, v4, v2

    .line 408
    .line 409
    if-gez v0, :cond_16

    .line 410
    .line 411
    move-wide/from16 v18, v2

    .line 412
    .line 413
    goto :goto_f

    .line 414
    :cond_16
    move-wide/from16 v18, v4

    .line 415
    .line 416
    :goto_f
    const-string v0, "summary"

    .line 417
    .line 418
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    const-string v2, "description"

    .line 423
    .line 424
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v20

    .line 428
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    new-instance v6, Lgb/o;

    .line 432
    .line 433
    invoke-direct/range {v6 .. v21}, Lgb/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/util/List;)V

    .line 434
    .line 435
    .line 436
    return-object v6
.end method

.method public static d(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lgb/q;->a:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    invoke-static {p0}, Lgb/q;->h(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v1, "install_id"

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-interface {p0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    if-nez v3, :cond_0

    .line 35
    .line 36
    move-object v2, v1

    .line 37
    :cond_0
    if-eqz v2, :cond_1

    .line 38
    .line 39
    monitor-exit v0

    .line 40
    return-object v2

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    :try_start_1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    const-string v2, "-"

    .line 55
    .line 56
    const-string v3, ""

    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    invoke-static {v1, v2, v3, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    const-string v2, "install_id"

    .line 68
    .line 69
    invoke-interface {p0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 74
    .line 75
    .line 76
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    if-eqz p0, :cond_2

    .line 78
    .line 79
    monitor-exit v0

    .line 80
    return-object v1

    .line 81
    :cond_2
    :try_start_2
    const-string p0, "\u4fdd\u5b58\u63d2\u4ef6\u4ed3\u5e93 installId \u5931\u8d25"

    .line 82
    .line 83
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 84
    .line 85
    invoke-direct {v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 89
    :goto_0
    monitor-exit v0

    .line 90
    throw p0
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;)Lgb/m;
    .locals 5

    .line 1
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_0
    sget-object v0, Lgb/q;->a:Ljava/lang/Object;

    .line 18
    .line 19
    monitor-enter v0

    .line 20
    :try_start_0
    invoke-static {p0}, Lgb/q;->g(Landroid/content/Context;)Lorg/json/JSONObject;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-static {v3}, Lgb/q;->f(Lorg/json/JSONObject;)Lgb/m;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    iget-object v4, v3, Lgb/m;->a:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v4, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    if-eqz v4, :cond_1

    .line 57
    .line 58
    monitor-exit v0

    .line 59
    return-object v3

    .line 60
    :catchall_0
    move-exception p0

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    monitor-exit v0

    .line 63
    return-object v1

    .line 64
    :goto_0
    monitor-exit v0

    .line 65
    throw p0
.end method

.method public static f(Lorg/json/JSONObject;)Lgb/m;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    const-string v1, "remotePluginId"

    .line 5
    .line 6
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v1, v0

    .line 22
    :goto_0
    const-string v2, ""

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    move-object v1, v2

    .line 27
    :cond_1
    if-eqz p0, :cond_2

    .line 28
    .line 29
    const-string v3, "ownerToken"

    .line 30
    .line 31
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move-object p0, v0

    .line 47
    :goto_1
    if-nez p0, :cond_3

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_3
    move-object v2, p0

    .line 51
    :goto_2
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-nez p0, :cond_5

    .line 56
    .line 57
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_4

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    new-instance p0, Lgb/m;

    .line 65
    .line 66
    sget-object v0, Lgb/p;->i:Lgb/p;

    .line 67
    .line 68
    invoke-direct {p0, v1, v2, v0}, Lgb/m;-><init>(Ljava/lang/String;Ljava/lang/String;Lgb/p;)V

    .line 69
    .line 70
    .line 71
    return-object p0

    .line 72
    :cond_5
    :goto_3
    return-object v0
.end method

.method public static g(Landroid/content/Context;)Lorg/json/JSONObject;
    .locals 2

    .line 1
    invoke-static {p0}, Lgb/q;->h(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "ownerships"

    .line 6
    .line 7
    const-string v1, "{}"

    .line 8
    .line 9
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    move-object v1, p0

    .line 16
    :cond_0
    :try_start_0
    new-instance p0, Lorg/json/JSONObject;

    .line 17
    .line 18
    invoke-direct {p0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    new-instance v0, Lsf/f;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    move-object p0, v0

    .line 29
    :goto_0
    new-instance v0, Lorg/json/JSONObject;

    .line 30
    .line 31
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 32
    .line 33
    .line 34
    instance-of v1, p0, Lsf/f;

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    move-object p0, v0

    .line 39
    :cond_1
    check-cast p0, Lorg/json/JSONObject;

    .line 40
    .line 41
    return-object p0
.end method

.method public static h(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move-object p0, v0

    .line 8
    :cond_0
    const-string v0, "Hchat_script_plugin_market"

    .line 9
    .line 10
    invoke-static {p0, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static i(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lgb/q;->a:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    invoke-static {p0}, Lgb/q;->g(Landroid/content/Context;)Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lgb/q;->h(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string p1, "ownerships"

    .line 23
    .line 24
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {p0, p1, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 33
    .line 34
    .line 35
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    monitor-exit v0

    .line 39
    return-void

    .line 40
    :cond_0
    :try_start_1
    const-string p0, "\u5220\u9664\u63d2\u4ef6\u4ed3\u5e93\u5f52\u5c5e\u4fe1\u606f\u5931\u8d25"

    .line 41
    .line 42
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    monitor-exit v0

    .line 50
    throw p0
.end method

.method public static j(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    sget-object v0, Lgb/q;->a:Ljava/lang/Object;

    .line 17
    .line 18
    monitor-enter v0

    .line 19
    :try_start_0
    invoke-static {p0}, Lgb/q;->g(Landroid/content/Context;)Lorg/json/JSONObject;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {}, La/a;->E()Luf/c;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v2, v4}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_4

    .line 47
    :cond_1
    invoke-static {v2}, La/a;->t(Luf/c;)Luf/c;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    new-instance v3, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    const/4 v4, 0x0

    .line 57
    invoke-virtual {v2, v4}, Luf/c;->listIterator(I)Ljava/util/ListIterator;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    :cond_2
    :goto_1
    move-object v4, v2

    .line 62
    check-cast v4, Luf/a;

    .line 63
    .line 64
    invoke-virtual {v4}, Luf/a;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_4

    .line 69
    .line 70
    invoke-virtual {v4}, Luf/a;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    move-object v5, v4

    .line 75
    check-cast v5, Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-static {v5}, Lgb/q;->f(Lorg/json/JSONObject;)Lgb/m;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    if-eqz v5, :cond_3

    .line 86
    .line 87
    iget-object v5, v5, Lgb/m;->a:Ljava/lang/String;

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    const/4 v5, 0x0

    .line 91
    :goto_2
    invoke-static {v5, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-eqz v5, :cond_2

    .line 96
    .line 97
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_5

    .line 110
    .line 111
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    check-cast v2, Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_5
    invoke-static {p0}, Lgb/q;->h(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    const-string p1, "ownerships"

    .line 130
    .line 131
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-interface {p0, p1, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 140
    .line 141
    .line 142
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 143
    if-eqz p0, :cond_6

    .line 144
    .line 145
    monitor-exit v0

    .line 146
    return-void

    .line 147
    :cond_6
    :try_start_1
    const-string p0, "\u5220\u9664\u63d2\u4ef6\u4ed3\u5e93\u5f52\u5c5e\u4fe1\u606f\u5931\u8d25"

    .line 148
    .line 149
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 150
    .line 151
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 155
    :goto_4
    monitor-exit v0

    .line 156
    throw p0
.end method

.method public static k(Landroid/content/Context;Ljava/lang/String;Lgb/m;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    iget-object v0, p2, Lgb/m;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    iget-object v0, p2, Lgb/m;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    sget-object v0, Lgb/q;->a:Ljava/lang/Object;

    .line 27
    .line 28
    monitor-enter v0

    .line 29
    :try_start_0
    invoke-static {p0}, Lgb/q;->g(Landroid/content/Context;)Lorg/json/JSONObject;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    new-instance v2, Lorg/json/JSONObject;

    .line 34
    .line 35
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v3, "remotePluginId"

    .line 39
    .line 40
    iget-object v4, p2, Lgb/m;->a:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    const-string v3, "ownerToken"

    .line 46
    .line 47
    iget-object p2, p2, Lgb/m;->b:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v2, v3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 53
    .line 54
    .line 55
    invoke-static {p0}, Lgb/q;->h(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    const-string p1, "ownerships"

    .line 64
    .line 65
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 74
    .line 75
    .line 76
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    if-eqz p0, :cond_0

    .line 78
    .line 79
    monitor-exit v0

    .line 80
    return-void

    .line 81
    :cond_0
    :try_start_1
    const-string p0, "\u4fdd\u5b58\u63d2\u4ef6\u4ed3\u5e93\u5f52\u5c5e\u4fe1\u606f\u5931\u8d25"

    .line 82
    .line 83
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 84
    .line 85
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    :catchall_0
    move-exception p0

    .line 90
    monitor-exit v0

    .line 91
    throw p0

    .line 92
    :cond_1
    const-string p0, "\u63d2\u4ef6 ownerToken \u4e0d\u80fd\u4e3a\u7a7a"

    .line 93
    .line 94
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_2
    const-string p0, "\u8fdc\u7a0b\u63d2\u4ef6 ID \u4e0d\u80fd\u4e3a\u7a7a"

    .line 99
    .line 100
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_3
    const-string p0, "\u672c\u5730\u63d2\u4ef6 ID \u4e0d\u80fd\u4e3a\u7a7a"

    .line 105
    .line 106
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-void
.end method
