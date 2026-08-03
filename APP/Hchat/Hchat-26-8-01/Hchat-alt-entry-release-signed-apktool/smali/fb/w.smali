.class public final Lfb/w;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lokhttp3/Dns;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lfb/w;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lfb/w;->t(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v0, Lorg/json/JSONObject;

    .line 12
    .line 13
    invoke-virtual {p3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    invoke-direct {v0, p3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    if-nez p3, :cond_0

    .line 25
    .line 26
    const-string p3, "hchat_message_id"

    .line 27
    .line 28
    invoke-virtual {v0, p3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-nez p1, :cond_1

    .line 36
    .line 37
    const-string p1, "hchat_runtime_state"

    .line 38
    .line 39
    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {p0, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;I)Ljava/lang/String;
    .locals 1

    .line 1
    and-int/lit8 p3, p3, 0x8

    .line 2
    .line 3
    const-string v0, ""

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    move-object p2, v0

    .line 8
    :cond_0
    invoke-static {p0, v0, p2, p1}, Lfb/w;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

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
    const-string v0, "\\s+"

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string v0, " "

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const/16 v0, 0x20

    .line 35
    .line 36
    invoke-static {v0, p0}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    const-string p0, "\u672a\u547d\u540d\u914d\u7f6e"

    .line 47
    .line 48
    :cond_0
    return-object p0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-static {p0}, Lfb/w;->t(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    move v2, v1

    .line 24
    :goto_0
    if-lt v2, v0, :cond_1

    .line 25
    .line 26
    :goto_1
    return v1

    .line 27
    :cond_1
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    const-string v4, "hchat_message_id"

    .line 34
    .line 35
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    const/4 v3, 0x0

    .line 41
    :goto_2
    invoke-static {v3, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_3

    .line 46
    .line 47
    const/4 p0, 0x1

    .line 48
    return p0

    .line 49
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;Lfb/v;)Lfb/t0;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "Hchat_script_plugin_config"

    .line 5
    .line 6
    invoke-static {p0, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lfb/w;->i(Landroid/content/SharedPreferences;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {p1}, Lfb/w;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Lfb/t0;

    .line 40
    .line 41
    iget-object v1, v1, Lfb/t0;->b:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v1, p1}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const-string p0, "\u914d\u7f6e\u540d\u79f0\u5df2\u5b58\u5728"

    .line 51
    .line 52
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_2
    :goto_1
    new-instance v0, Lfb/t0;

    .line 58
    .line 59
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    const-string v2, ""

    .line 71
    .line 72
    const/4 v3, 0x0

    .line 73
    const-string v4, "-"

    .line 74
    .line 75
    invoke-static {v1, v4, v2, v3}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-static {p2}, Lfb/w;->q(Lfb/v;)Lfb/v;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-direct {v0, v1, p1, p2}, Lfb/t0;-><init>(Ljava/lang/String;Ljava/lang/String;Lfb/v;)V

    .line 84
    .line 85
    .line 86
    invoke-static {p0, v0}, Lfb/w;->x(Landroid/content/Context;Lfb/t0;)V

    .line 87
    .line 88
    .line 89
    return-object v0
.end method

.method public static f(Lorg/json/JSONObject;)Lfb/v;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "mcpServers"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    const-string v4, ""

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    invoke-static {}, La/a;->E()Luf/c;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    move v7, v2

    .line 24
    :goto_0
    if-lt v7, v6, :cond_0

    .line 25
    .line 26
    invoke-static {v5}, La/a;->t(Luf/c;)Luf/c;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    :goto_1
    move-object v10, v1

    .line 33
    goto :goto_2

    .line 34
    :cond_0
    invoke-virtual {v1, v7}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    if-eqz v8, :cond_1

    .line 39
    .line 40
    new-instance v9, Lfb/r0;

    .line 41
    .line 42
    add-int/lit8 v10, v7, 0x1

    .line 43
    .line 44
    new-instance v11, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v12, "mcp-"

    .line 47
    .line 48
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v11

    .line 58
    const-string v12, "id"

    .line 59
    .line 60
    invoke-virtual {v8, v12, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v11

    .line 64
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance v12, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v13, "MCP "

    .line 70
    .line 71
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    const-string v12, "name"

    .line 82
    .line 83
    invoke-virtual {v8, v12, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v10

    .line 87
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    const-string v12, "enabled"

    .line 91
    .line 92
    invoke-virtual {v8, v12, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 93
    .line 94
    .line 95
    move-result v14

    .line 96
    const-string v12, "endpoint"

    .line 97
    .line 98
    invoke-virtual {v8, v12, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v12

    .line 102
    const-string v13, "authorization"

    .line 103
    .line 104
    invoke-static {v12, v13, v4, v8}, Lj8/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v13

    .line 108
    move-object/from16 v17, v11

    .line 109
    .line 110
    move-object v11, v10

    .line 111
    move-object/from16 v10, v17

    .line 112
    .line 113
    invoke-direct/range {v9 .. v14}, Lfb/r0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5, v9}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    :cond_1
    add-int/lit8 v7, v7, 0x1

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_2
    const-string v1, "mcpEnabled"

    .line 123
    .line 124
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    const-string v2, "mcpEndpoint"

    .line 129
    .line 130
    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    const-string v5, "mcpAuthorization"

    .line 135
    .line 136
    invoke-static {v2, v5, v4, v0}, Lj8/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    invoke-static {v2, v5, v1}, Lfb/w;->m(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    goto :goto_1

    .line 145
    :goto_2
    new-instance v5, Lfb/v;

    .line 146
    .line 147
    const-string v1, "apiBaseUrl"

    .line 148
    .line 149
    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    const-string v2, "apiEndpoint"

    .line 154
    .line 155
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    const-string v1, "apiPath"

    .line 163
    .line 164
    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    const-string v1, "apiKey"

    .line 169
    .line 170
    invoke-static {v7, v1, v4, v0}, Lj8/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    const-string v1, "model"

    .line 175
    .line 176
    const-string v2, "deepseek-ai/DeepSeek-V3"

    .line 177
    .line 178
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v9

    .line 182
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    const-string v1, "autoCompactEnabled"

    .line 186
    .line 187
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 188
    .line 189
    .line 190
    move-result v11

    .line 191
    const-string v1, "compactTokenThreshold"

    .line 192
    .line 193
    const/16 v2, 0x5dc0

    .line 194
    .line 195
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 196
    .line 197
    .line 198
    move-result v12

    .line 199
    const-string v1, "webSearchEnabled"

    .line 200
    .line 201
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 202
    .line 203
    .line 204
    move-result v13

    .line 205
    const-string v1, "workspaceWriteApprovalMode"

    .line 206
    .line 207
    const-string v2, "ask"

    .line 208
    .line 209
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v14

    .line 213
    const-string v1, "promptCacheMode"

    .line 214
    .line 215
    const-string v2, "force"

    .line 216
    .line 217
    invoke-static {v14, v1, v2, v0}, Lj8/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v15

    .line 221
    const-string v1, "endpointMode"

    .line 222
    .line 223
    const-string v2, "openai_compatible"

    .line 224
    .line 225
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v16

    .line 229
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-direct/range {v5 .. v16}, Lfb/v;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-static {v5}, Lfb/w;->q(Lfb/v;)Lfb/v;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    return-object v0
.end method

.method public static g(Landroid/content/Context;Ljava/lang/String;)Lfb/t0;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "Hchat_script_plugin_config"

    .line 5
    .line 6
    invoke-static {p0, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Lfb/w;->i(Landroid/content/SharedPreferences;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x1

    .line 19
    if-le v1, v2, :cond_8

    .line 20
    .line 21
    new-instance v1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    move-object v4, v3

    .line 41
    check-cast v4, Lfb/t0;

    .line 42
    .line 43
    iget-object v4, v4, Lfb/t0;->a:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v4, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-nez v4, :cond_0

    .line 50
    .line 51
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eq v2, v0, :cond_7

    .line 64
    .line 65
    const-string v0, "script_plugin_agent_active_profile"

    .line 66
    .line 67
    const-string v2, ""

    .line 68
    .line 69
    invoke-interface {p0, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-nez v0, :cond_2

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    move-object v2, v0

    .line 77
    :goto_1
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_4

    .line 82
    .line 83
    :cond_3
    invoke-static {v1}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, Lfb/t0;

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_6

    .line 99
    .line 100
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    move-object v3, v0

    .line 105
    check-cast v3, Lfb/t0;

    .line 106
    .line 107
    iget-object v3, v3, Lfb/t0;->a:Ljava/lang/String;

    .line 108
    .line 109
    invoke-static {v3, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-eqz v3, :cond_5

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_6
    const/4 v0, 0x0

    .line 117
    :goto_2
    move-object p1, v0

    .line 118
    check-cast p1, Lfb/t0;

    .line 119
    .line 120
    if-eqz p1, :cond_3

    .line 121
    .line 122
    :goto_3
    iget-object v0, p1, Lfb/t0;->a:Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {p0, v1, v0}, Lfb/w;->y(Landroid/content/SharedPreferences;Ljava/util/List;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-object p1

    .line 128
    :cond_7
    const-string p0, "\u914d\u7f6e\u4e0d\u5b58\u5728"

    .line 129
    .line 130
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :goto_4
    const/4 p0, 0x0

    .line 134
    return-object p0

    .line 135
    :cond_8
    const-string p0, "\u81f3\u5c11\u4fdd\u7559\u4e00\u4e2a\u914d\u7f6e"

    .line 136
    .line 137
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    goto :goto_4
.end method

.method public static h(Ljava/util/List;)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, "chat"

    .line 2
    .line 3
    const-string v1, "completions"

    .line 4
    .line 5
    const-string v2, "v1"

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
    invoke-static {p0, v0}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v5, 0x0

    .line 20
    const/16 v6, 0x3e

    .line 21
    .line 22
    const-string v2, "/"

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-static/range {v1 .. v6}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const-string v0, "/"

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public static i(Landroid/content/SharedPreferences;)Ljava/util/List;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "script_plugin_agent_profiles_v1"

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    move-object v0, v2

    .line 14
    :cond_0
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v4, 0x0

    .line 19
    sget-object v5, Ltf/t;->g:Ltf/t;

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    goto/16 :goto_5

    .line 24
    .line 25
    :cond_1
    :try_start_0
    new-instance v3, Lorg/json/JSONArray;

    .line 26
    .line 27
    invoke-direct {v3, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, La/a;->E()Luf/c;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    move v7, v4

    .line 39
    :goto_0
    if-lt v7, v6, :cond_2

    .line 40
    .line 41
    invoke-static {v0}, La/a;->t(Luf/c;)Luf/c;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    goto :goto_3

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    invoke-virtual {v3, v7}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    if-eqz v8, :cond_4

    .line 53
    .line 54
    const-string v9, "id"

    .line 55
    .line 56
    invoke-virtual {v8, v9, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-static {v9}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v9

    .line 71
    const-string v10, "name"

    .line 72
    .line 73
    invoke-virtual {v8, v10, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-static {v10}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    const-string v11, "config"

    .line 89
    .line 90
    invoke-virtual {v8, v11}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    if-eqz v8, :cond_4

    .line 95
    .line 96
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v11

    .line 100
    if-nez v11, :cond_4

    .line 101
    .line 102
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v11

    .line 106
    if-eqz v11, :cond_3

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    new-instance v11, Lfb/t0;

    .line 110
    .line 111
    invoke-static {v8}, Lfb/w;->f(Lorg/json/JSONObject;)Lfb/v;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    invoke-direct {v11, v9, v10, v8}, Lfb/t0;-><init>(Ljava/lang/String;Ljava/lang/String;Lfb/v;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v11}, Luf/c;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    .line 120
    .line 121
    :cond_4
    :goto_1
    add-int/lit8 v7, v7, 0x1

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :goto_2
    new-instance v3, Lsf/f;

    .line 125
    .line 126
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    move-object v0, v3

    .line 130
    :goto_3
    nop

    .line 131
    instance-of v3, v0, Lsf/f;

    .line 132
    .line 133
    if-eqz v3, :cond_5

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_5
    move-object v5, v0

    .line 137
    :goto_4
    check-cast v5, Ljava/util/List;

    .line 138
    .line 139
    :goto_5
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-nez v0, :cond_6

    .line 144
    .line 145
    return-object v5

    .line 146
    :cond_6
    new-instance v0, Lfb/t0;

    .line 147
    .line 148
    new-instance v5, Lfb/v;

    .line 149
    .line 150
    const-string v3, "script_plugin_agent_api_base"

    .line 151
    .line 152
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    if-nez v3, :cond_7

    .line 157
    .line 158
    move-object v6, v2

    .line 159
    goto :goto_6

    .line 160
    :cond_7
    move-object v6, v3

    .line 161
    :goto_6
    const-string v3, "script_plugin_agent_api_path"

    .line 162
    .line 163
    const-string v7, "/chat/completions"

    .line 164
    .line 165
    invoke-interface {v1, v3, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    if-nez v3, :cond_8

    .line 170
    .line 171
    move-object v7, v2

    .line 172
    goto :goto_7

    .line 173
    :cond_8
    move-object v7, v3

    .line 174
    :goto_7
    const-string v3, "script_plugin_agent_api_key"

    .line 175
    .line 176
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    if-nez v3, :cond_9

    .line 181
    .line 182
    move-object v8, v2

    .line 183
    goto :goto_8

    .line 184
    :cond_9
    move-object v8, v3

    .line 185
    :goto_8
    const-string v3, "script_plugin_agent_model"

    .line 186
    .line 187
    const-string v9, "deepseek-ai/DeepSeek-V3"

    .line 188
    .line 189
    invoke-interface {v1, v3, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    if-nez v3, :cond_a

    .line 194
    .line 195
    move-object v9, v2

    .line 196
    goto :goto_9

    .line 197
    :cond_a
    move-object v9, v3

    .line 198
    :goto_9
    const-string v3, "script_plugin_agent_mcp_enable"

    .line 199
    .line 200
    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    const-string v4, "script_plugin_agent_mcp_endpoint"

    .line 205
    .line 206
    invoke-interface {v1, v4, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    if-nez v4, :cond_b

    .line 211
    .line 212
    move-object v4, v2

    .line 213
    :cond_b
    const-string v10, "script_plugin_agent_mcp_authorization"

    .line 214
    .line 215
    invoke-interface {v1, v10, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v10

    .line 219
    if-nez v10, :cond_c

    .line 220
    .line 221
    move-object v10, v2

    .line 222
    :cond_c
    invoke-static {v4, v10, v3}, Lfb/w;->m(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    const-string v3, "script_plugin_agent_auto_compact"

    .line 227
    .line 228
    const/4 v4, 0x1

    .line 229
    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 230
    .line 231
    .line 232
    move-result v11

    .line 233
    const-string v3, "script_plugin_agent_compact_token_threshold"

    .line 234
    .line 235
    const/16 v12, 0x5dc0

    .line 236
    .line 237
    invoke-interface {v1, v3, v12}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    const/16 v12, 0x7d0

    .line 242
    .line 243
    const v13, 0xf4240

    .line 244
    .line 245
    .line 246
    invoke-static {v3, v12, v13}, Lr9/e0;->r(III)I

    .line 247
    .line 248
    .line 249
    move-result v12

    .line 250
    const-string v3, "script_plugin_agent_web_search_enabled"

    .line 251
    .line 252
    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 253
    .line 254
    .line 255
    move-result v13

    .line 256
    const-string v3, "script_plugin_agent_workspace_write_approval"

    .line 257
    .line 258
    const-string v4, "ask"

    .line 259
    .line 260
    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    if-nez v3, :cond_d

    .line 265
    .line 266
    move-object v14, v2

    .line 267
    goto :goto_a

    .line 268
    :cond_d
    move-object v14, v3

    .line 269
    :goto_a
    const-string v15, "force"

    .line 270
    .line 271
    const-string v16, "openai_compatible"

    .line 272
    .line 273
    invoke-direct/range {v5 .. v16}, Lfb/v;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-static {v5}, Lfb/w;->q(Lfb/v;)Lfb/v;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    const-string v3, "default"

    .line 281
    .line 282
    const-string v4, "\u9ed8\u8ba4\u914d\u7f6e"

    .line 283
    .line 284
    invoke-direct {v0, v3, v4, v2}, Lfb/t0;-><init>(Ljava/lang/String;Ljava/lang/String;Lfb/v;)V

    .line 285
    .line 286
    .line 287
    invoke-static {v0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    invoke-static {v1, v2, v3}, Lfb/w;->y(Landroid/content/SharedPreferences;Ljava/util/List;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    invoke-static {v0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    return-object v0
.end method

.method public static j(Ljava/lang/String;Ljava/util/List;Lfb/y;Ljava/lang/String;Ljava/lang/String;)I
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-static {p4}, Lfb/w;->k(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    move v0, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v0, v2

    .line 27
    :goto_0
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    add-int/2addr p0, v3

    .line 43
    :goto_1
    if-eqz v0, :cond_6

    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-interface {p1, v3}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    :cond_2
    invoke-interface {v3}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_4

    .line 58
    .line 59
    invoke-interface {v3}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Lfb/c;

    .line 64
    .line 65
    iget-object v5, v4, Lfb/c;->a:Ljava/lang/String;

    .line 66
    .line 67
    const-string v6, "user"

    .line 68
    .line 69
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_3

    .line 74
    .line 75
    iget-object v4, v4, Lfb/c;->c:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {p4, v4}, Lfb/w;->d(Ljava/lang/String;Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-nez v4, :cond_3

    .line 82
    .line 83
    move v4, v1

    .line 84
    goto :goto_2

    .line 85
    :cond_3
    move v4, v2

    .line 86
    :goto_2
    if-eqz v4, :cond_2

    .line 87
    .line 88
    invoke-interface {v3}, Ljava/util/ListIterator;->nextIndex()I

    .line 89
    .line 90
    .line 91
    move-result p4

    .line 92
    goto :goto_3

    .line 93
    :cond_4
    const/4 p4, -0x1

    .line 94
    :goto_3
    if-ltz p4, :cond_5

    .line 95
    .line 96
    invoke-static {p4, p1}, Ltf/m;->q1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    goto :goto_4

    .line 101
    :cond_5
    sget-object p1, Ltf/t;->g:Ltf/t;

    .line 102
    .line 103
    :cond_6
    :goto_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result p4

    .line 111
    if-eqz p4, :cond_b

    .line 112
    .line 113
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p4

    .line 117
    check-cast p4, Lfb/c;

    .line 118
    .line 119
    iget-object v3, p4, Lfb/c;->b:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    iget-object v4, p4, Lfb/c;->h:Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    add-int/2addr v4, v3

    .line 132
    iget-object v3, p4, Lfb/c;->i:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    add-int/2addr v3, v4

    .line 139
    add-int/2addr v3, p0

    .line 140
    iget-object p0, p4, Lfb/c;->l:Lfb/a1;

    .line 141
    .line 142
    if-eqz p0, :cond_7

    .line 143
    .line 144
    iget-object p0, p0, Lfb/a1;->b:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    goto :goto_6

    .line 151
    :cond_7
    move p0, v2

    .line 152
    :goto_6
    add-int/2addr v3, p0

    .line 153
    if-nez v0, :cond_8

    .line 154
    .line 155
    invoke-static {p3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 156
    .line 157
    .line 158
    move-result p0

    .line 159
    if-eqz p0, :cond_8

    .line 160
    .line 161
    iget-object p0, p4, Lfb/c;->j:Ljava/util/List;

    .line 162
    .line 163
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    if-eqz v4, :cond_8

    .line 172
    .line 173
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    check-cast v4, Lfb/q1;

    .line 178
    .line 179
    iget-object v5, v4, Lfb/q1;->c:Ljava/lang/String;

    .line 180
    .line 181
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    iget-object v6, v4, Lfb/q1;->d:Ljava/lang/String;

    .line 186
    .line 187
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    add-int/2addr v6, v5

    .line 192
    iget-object v5, v4, Lfb/q1;->e:Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 195
    .line 196
    .line 197
    move-result v5

    .line 198
    add-int/2addr v5, v6

    .line 199
    iget-object v4, v4, Lfb/q1;->f:Ljava/lang/String;

    .line 200
    .line 201
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    add-int/2addr v4, v5

    .line 206
    add-int/2addr v3, v4

    .line 207
    goto :goto_7

    .line 208
    :cond_8
    iget-object p0, p4, Lfb/c;->k:Ljava/util/List;

    .line 209
    .line 210
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 215
    .line 216
    .line 217
    move-result p4

    .line 218
    if-eqz p4, :cond_a

    .line 219
    .line 220
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p4

    .line 224
    check-cast p4, Lfb/a;

    .line 225
    .line 226
    iget-object v4, p4, Lfb/a;->a:Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    iget-object v5, p4, Lfb/a;->c:Ljava/lang/String;

    .line 233
    .line 234
    const-string v6, "image/"

    .line 235
    .line 236
    invoke-static {v5, v6, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 237
    .line 238
    .line 239
    move-result v5

    .line 240
    if-eqz v5, :cond_9

    .line 241
    .line 242
    const/16 p4, 0xfa0

    .line 243
    .line 244
    goto :goto_9

    .line 245
    :cond_9
    iget-wide v5, p4, Lfb/a;->d:J

    .line 246
    .line 247
    const-wide/16 v7, 0x3e8

    .line 248
    .line 249
    const-wide/32 v9, 0x80000

    .line 250
    .line 251
    .line 252
    invoke-static/range {v5 .. v10}, Lr9/e0;->s(JJJ)J

    .line 253
    .line 254
    .line 255
    move-result-wide v5

    .line 256
    long-to-int p4, v5

    .line 257
    :goto_9
    add-int/2addr v4, p4

    .line 258
    add-int/2addr v3, v4

    .line 259
    goto :goto_8

    .line 260
    :cond_a
    move p0, v3

    .line 261
    goto/16 :goto_5

    .line 262
    .line 263
    :cond_b
    if-eqz p2, :cond_c

    .line 264
    .line 265
    iget-object p1, p2, Lfb/y;->b:Ljava/lang/String;

    .line 266
    .line 267
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 268
    .line 269
    .line 270
    move-result p1

    .line 271
    iget-object p3, p2, Lfb/y;->a:Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 274
    .line 275
    .line 276
    move-result p3

    .line 277
    add-int/2addr p3, p1

    .line 278
    iget-object p1, p2, Lfb/y;->e:Ljava/lang/String;

    .line 279
    .line 280
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 281
    .line 282
    .line 283
    move-result p1

    .line 284
    add-int/2addr p1, p3

    .line 285
    add-int/lit16 p1, p1, 0x100

    .line 286
    .line 287
    add-int/2addr p0, p1

    .line 288
    :cond_c
    div-int/lit8 p0, p0, 0x4

    .line 289
    .line 290
    if-ge p0, v1, :cond_d

    .line 291
    .line 292
    return v1

    .line 293
    :cond_d
    return p0
.end method

.method public static k(Ljava/lang/String;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    new-instance v0, Lsf/f;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    instance-of p0, v0, Lsf/f;

    .line 25
    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    :cond_1
    check-cast v0, Lorg/json/JSONArray;

    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    if-eqz v0, :cond_7

    .line 33
    .line 34
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-static {p0, v2}, Lr9/e0;->r0(II)Llg/d;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    instance-of v3, v2, Ljava/util/Collection;

    .line 43
    .line 44
    if-eqz v3, :cond_3

    .line 45
    .line 46
    move-object v3, v2

    .line 47
    check-cast v3, Ljava/util/Collection;

    .line 48
    .line 49
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_3

    .line 54
    .line 55
    :cond_2
    move v0, v1

    .line 56
    goto :goto_2

    .line 57
    :cond_3
    invoke-virtual {v2}, Llg/b;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    :cond_4
    move-object v3, v2

    .line 62
    check-cast v3, Llg/c;

    .line 63
    .line 64
    iget-boolean v4, v3, Llg/c;->i:Z

    .line 65
    .line 66
    if-eqz v4, :cond_2

    .line 67
    .line 68
    invoke-virtual {v3}, Llg/c;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, Ljava/lang/Number;

    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    if-eqz v3, :cond_5

    .line 83
    .line 84
    move v3, v1

    .line 85
    goto :goto_1

    .line 86
    :cond_5
    move v3, p0

    .line 87
    :goto_1
    if-nez v3, :cond_4

    .line 88
    .line 89
    move v0, p0

    .line 90
    :goto_2
    if-ne v0, v1, :cond_6

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_6
    move v1, p0

    .line 94
    :goto_3
    move p0, v1

    .line 95
    :cond_7
    return p0
.end method

.method public static l(Lfb/v;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    iget-object v1, p0, Lfb/v;->a:Ljava/lang/String;

    .line 3
    .line 4
    iget-object v2, p0, Lfb/v;->k:Ljava/lang/String;

    .line 5
    .line 6
    iget-object p0, p0, Lfb/v;->d:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v1, v2, p0, v0}, Lfb/w;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 13
    .line 14
    .line 15
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    new-instance v1, Lsf/f;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    move-object p0, v1

    .line 24
    :goto_0
    nop

    .line 25
    instance-of v1, p0, Lsf/f;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    :cond_0
    check-cast p0, Landroid/net/Uri;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    if-eqz p0, :cond_4

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const-string v3, "http"

    .line 40
    .line 41
    invoke-static {v2, v3}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const-string v3, "https"

    .line 52
    .line 53
    invoke-static {v2, v3}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    :cond_1
    invoke-virtual {p0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-eqz p0, :cond_2

    .line 64
    .line 65
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-eqz p0, :cond_3

    .line 70
    .line 71
    :cond_2
    move v0, v1

    .line 72
    :cond_3
    return v0

    .line 73
    :cond_4
    return v1
.end method

.method public static m(Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;
    .locals 6

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
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    if-nez p2, :cond_0

    .line 14
    .line 15
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    new-instance v0, Lfb/r0;

    .line 19
    .line 20
    const-string v1, "legacy"

    .line 21
    .line 22
    const-string v2, "MCP 1"

    .line 23
    .line 24
    move-object v3, p0

    .line 25
    move-object v4, p1

    .line 26
    move v5, p2

    .line 27
    invoke-direct/range {v0 .. v5}, Lfb/r0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public static n(Landroid/content/Context;)Lfb/t0;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "Hchat_script_plugin_config"

    .line 5
    .line 6
    invoke-static {p0, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Lfb/w;->i(Landroid/content/SharedPreferences;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "script_plugin_agent_active_profile"

    .line 15
    .line 16
    const-string v2, ""

    .line 17
    .line 18
    invoke-interface {p0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v2, p0

    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    move-object v3, v1

    .line 41
    check-cast v3, Lfb/t0;

    .line 42
    .line 43
    iget-object v3, v3, Lfb/t0;->a:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v3, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    const/4 v1, 0x0

    .line 53
    :goto_1
    check-cast v1, Lfb/t0;

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    return-object v1

    .line 58
    :cond_3
    invoke-static {v0}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, Lfb/t0;

    .line 63
    .line 64
    return-object p0
.end method

.method public static o(Ljava/lang/String;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 20

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_9

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    move-object v3, v2

    .line 24
    check-cast v3, Lfb/c;

    .line 25
    .line 26
    iget-object v2, v3, Lfb/c;->a:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v4, v3, Lfb/c;->j:Ljava/util/List;

    .line 29
    .line 30
    const-string v5, "tool"

    .line 31
    .line 32
    invoke-static {v2, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_8

    .line 37
    .line 38
    iget-object v2, v3, Lfb/c;->d:Ljava/lang/String;

    .line 39
    .line 40
    move-object/from16 v5, p0

    .line 41
    .line 42
    invoke-static {v2, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    new-instance v12, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v6, :cond_5

    .line 63
    .line 64
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    move-object v7, v6

    .line 69
    check-cast v7, Lfb/q1;

    .line 70
    .line 71
    iget-object v8, v7, Lfb/q1;->b:Ljava/lang/String;

    .line 72
    .line 73
    const-string v9, "workspace"

    .line 74
    .line 75
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-nez v8, :cond_3

    .line 80
    .line 81
    iget-object v7, v7, Lfb/q1;->m:Ljava/lang/String;

    .line 82
    .line 83
    const-string v8, "hchat_workspace_"

    .line 84
    .line 85
    const/4 v9, 0x0

    .line 86
    invoke-static {v7, v8, v9}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-eqz v7, :cond_4

    .line 91
    .line 92
    :cond_3
    const/4 v9, 0x1

    .line 93
    :cond_4
    if-nez v9, :cond_2

    .line 94
    .line 95
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_6

    .line 104
    .line 105
    const/4 v3, 0x0

    .line 106
    goto :goto_2

    .line 107
    :cond_6
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-ne v2, v4, :cond_7

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_7
    const-wide/16 v17, 0x0

    .line 119
    .line 120
    const v19, 0x3fdff

    .line 121
    .line 122
    .line 123
    const/4 v4, 0x0

    .line 124
    const/4 v5, 0x0

    .line 125
    const/4 v6, 0x0

    .line 126
    const/4 v7, 0x0

    .line 127
    const/4 v8, 0x0

    .line 128
    const/4 v9, 0x0

    .line 129
    const/4 v10, 0x0

    .line 130
    const/4 v11, 0x0

    .line 131
    const/4 v13, 0x0

    .line 132
    const/4 v14, 0x0

    .line 133
    const/4 v15, 0x0

    .line 134
    const/16 v16, 0x0

    .line 135
    .line 136
    invoke-static/range {v3 .. v19}, Lfb/c;->a(Lfb/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfb/y;ZLjava/lang/String;JI)Lfb/c;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    :cond_8
    :goto_2
    if-eqz v3, :cond_0

    .line 141
    .line 142
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto/16 :goto_0

    .line 146
    .line 147
    :cond_9
    return-object v0
.end method

.method public static p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 18

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static/range {p1 .. p1}, Lfb/w;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x6

    .line 19
    const-string v3, "v1"

    .line 20
    .line 21
    const-string v4, "/chat/completions"

    .line 22
    .line 23
    const/4 v5, 0x1

    .line 24
    const-string v6, "/"

    .line 25
    .line 26
    const-string v7, "https://"

    .line 27
    .line 28
    const/4 v8, 0x0

    .line 29
    const-string v9, "://"

    .line 30
    .line 31
    const/4 v10, 0x0

    .line 32
    const/16 v11, 0x2f

    .line 33
    .line 34
    const-string v12, ""

    .line 35
    .line 36
    sparse-switch v1, :sswitch_data_0

    .line 37
    .line 38
    .line 39
    goto/16 :goto_b

    .line 40
    .line 41
    :sswitch_0
    const-string v1, "deepseek"

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_0

    .line 48
    .line 49
    goto/16 :goto_b

    .line 50
    .line 51
    :cond_0
    invoke-static/range {p0 .. p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

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
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_1

    .line 64
    .line 65
    goto/16 :goto_18

    .line 66
    .line 67
    :cond_1
    invoke-static {v0, v9, v8}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-nez v1, :cond_2

    .line 72
    .line 73
    new-instance v1, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    :cond_2
    move-object v1, v0

    .line 86
    :try_start_0
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 87
    .line 88
    .line 89
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    goto :goto_0

    .line 91
    :catchall_0
    move-exception v0

    .line 92
    new-instance v3, Lsf/f;

    .line 93
    .line 94
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    move-object v0, v3

    .line 98
    :goto_0
    nop

    .line 99
    instance-of v3, v0, Lsf/f;

    .line 100
    .line 101
    if-eqz v3, :cond_3

    .line 102
    .line 103
    move-object v0, v10

    .line 104
    :cond_3
    check-cast v0, Landroid/net/Uri;

    .line 105
    .line 106
    if-eqz v0, :cond_c

    .line 107
    .line 108
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    if-eqz v3, :cond_c

    .line 113
    .line 114
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-eqz v3, :cond_4

    .line 119
    .line 120
    goto/16 :goto_4

    .line 121
    .line 122
    :cond_4
    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    if-eqz v3, :cond_c

    .line 127
    .line 128
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_5

    .line 133
    .line 134
    goto/16 :goto_4

    .line 135
    .line 136
    :cond_5
    invoke-virtual {v0}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    if-nez v1, :cond_6

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_6
    move-object v12, v1

    .line 144
    :goto_1
    new-array v1, v5, [C

    .line 145
    .line 146
    aput-char v11, v1, v8

    .line 147
    .line 148
    invoke-static {v12, v1, v2}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    new-instance v2, Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    :cond_7
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-eqz v3, :cond_8

    .line 166
    .line 167
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    move-object v4, v3

    .line 172
    check-cast v4, Ljava/lang/String;

    .line 173
    .line 174
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    if-nez v4, :cond_7

    .line 179
    .line 180
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_8
    invoke-static {v2}, La/a;->X(Ljava/util/Collection;)Llg/d;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-virtual {v1}, Llg/b;->iterator()Ljava/util/Iterator;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    :cond_9
    :goto_3
    move-object v3, v1

    .line 193
    check-cast v3, Llg/c;

    .line 194
    .line 195
    iget-boolean v4, v3, Llg/c;->i:Z

    .line 196
    .line 197
    const-string v7, "chat"

    .line 198
    .line 199
    if-eqz v4, :cond_a

    .line 200
    .line 201
    invoke-virtual {v3}, Llg/c;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    move-object v4, v3

    .line 206
    check-cast v4, Ljava/lang/Number;

    .line 207
    .line 208
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    check-cast v4, Ljava/lang/String;

    .line 217
    .line 218
    invoke-static {v7, v4, v5}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    if-eqz v4, :cond_9

    .line 223
    .line 224
    move-object v10, v3

    .line 225
    goto :goto_3

    .line 226
    :cond_a
    check-cast v10, Ljava/lang/Integer;

    .line 227
    .line 228
    if-eqz v10, :cond_b

    .line 229
    .line 230
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    invoke-static {v1, v2}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    :cond_b
    const-string v1, "completions"

    .line 239
    .line 240
    filled-new-array {v7, v1}, [Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    invoke-static {v1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-static {v2, v1}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 249
    .line 250
    .line 251
    move-result-object v12

    .line 252
    const/16 v16, 0x0

    .line 253
    .line 254
    const/16 v17, 0x3e

    .line 255
    .line 256
    const-string v13, "/"

    .line 257
    .line 258
    const/4 v14, 0x0

    .line 259
    const/4 v15, 0x0

    .line 260
    invoke-static/range {v12 .. v17}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->encodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    new-array v1, v5, [C

    .line 288
    .line 289
    aput-char v11, v1, v8

    .line 290
    .line 291
    invoke-static {v0, v1}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v12

    .line 295
    goto/16 :goto_18

    .line 296
    .line 297
    :cond_c
    :goto_4
    new-array v0, v5, [C

    .line 298
    .line 299
    aput-char v11, v0, v8

    .line 300
    .line 301
    invoke-static {v1, v0}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    invoke-static {v0, v4}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v12

    .line 309
    goto/16 :goto_18

    .line 310
    .line 311
    :sswitch_1
    const-string v1, "gemini"

    .line 312
    .line 313
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    if-nez v0, :cond_d

    .line 318
    .line 319
    goto/16 :goto_b

    .line 320
    .line 321
    :cond_d
    invoke-static/range {p0 .. p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    if-eqz v1, :cond_e

    .line 334
    .line 335
    goto/16 :goto_18

    .line 336
    .line 337
    :cond_e
    invoke-static {v0, v9, v8}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    if-nez v1, :cond_f

    .line 342
    .line 343
    new-instance v1, Ljava/lang/StringBuilder;

    .line 344
    .line 345
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    :cond_f
    move-object v1, v0

    .line 356
    :try_start_1
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 357
    .line 358
    .line 359
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 360
    goto :goto_5

    .line 361
    :catchall_1
    move-exception v0

    .line 362
    new-instance v4, Lsf/f;

    .line 363
    .line 364
    invoke-direct {v4, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 365
    .line 366
    .line 367
    move-object v0, v4

    .line 368
    :goto_5
    nop

    .line 369
    instance-of v4, v0, Lsf/f;

    .line 370
    .line 371
    if-eqz v4, :cond_10

    .line 372
    .line 373
    move-object v0, v10

    .line 374
    :cond_10
    check-cast v0, Landroid/net/Uri;

    .line 375
    .line 376
    if-eqz v0, :cond_1a

    .line 377
    .line 378
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    if-eqz v4, :cond_1a

    .line 383
    .line 384
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 385
    .line 386
    .line 387
    move-result v4

    .line 388
    if-eqz v4, :cond_11

    .line 389
    .line 390
    goto/16 :goto_9

    .line 391
    .line 392
    :cond_11
    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v4

    .line 396
    if-eqz v4, :cond_1a

    .line 397
    .line 398
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 399
    .line 400
    .line 401
    move-result v4

    .line 402
    if-eqz v4, :cond_12

    .line 403
    .line 404
    goto/16 :goto_9

    .line 405
    .line 406
    :cond_12
    invoke-virtual {v0}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    if-nez v1, :cond_13

    .line 411
    .line 412
    goto :goto_6

    .line 413
    :cond_13
    move-object v12, v1

    .line 414
    :goto_6
    new-array v1, v5, [C

    .line 415
    .line 416
    aput-char v11, v1, v8

    .line 417
    .line 418
    invoke-static {v12, v1, v2}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    new-instance v2, Ljava/util/ArrayList;

    .line 423
    .line 424
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 425
    .line 426
    .line 427
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    :cond_14
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 432
    .line 433
    .line 434
    move-result v4

    .line 435
    if-eqz v4, :cond_15

    .line 436
    .line 437
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v4

    .line 441
    move-object v7, v4

    .line 442
    check-cast v7, Ljava/lang/String;

    .line 443
    .line 444
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 445
    .line 446
    .line 447
    move-result v7

    .line 448
    if-nez v7, :cond_14

    .line 449
    .line 450
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    goto :goto_7

    .line 454
    :cond_15
    invoke-static {v2}, La/a;->X(Ljava/util/Collection;)Llg/d;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    invoke-virtual {v1}, Llg/b;->iterator()Ljava/util/Iterator;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    :cond_16
    :goto_8
    move-object v4, v1

    .line 463
    check-cast v4, Llg/c;

    .line 464
    .line 465
    iget-boolean v7, v4, Llg/c;->i:Z

    .line 466
    .line 467
    const-string v9, "v1beta"

    .line 468
    .line 469
    if-eqz v7, :cond_18

    .line 470
    .line 471
    invoke-virtual {v4}, Llg/c;->next()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v4

    .line 475
    move-object v7, v4

    .line 476
    check-cast v7, Ljava/lang/Number;

    .line 477
    .line 478
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 479
    .line 480
    .line 481
    move-result v7

    .line 482
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v12

    .line 486
    check-cast v12, Ljava/lang/String;

    .line 487
    .line 488
    invoke-static {v9, v12, v5}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 489
    .line 490
    .line 491
    move-result v9

    .line 492
    if-nez v9, :cond_17

    .line 493
    .line 494
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v7

    .line 498
    check-cast v7, Ljava/lang/String;

    .line 499
    .line 500
    invoke-static {v7, v3}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 501
    .line 502
    .line 503
    move-result v7

    .line 504
    if-eqz v7, :cond_16

    .line 505
    .line 506
    :cond_17
    move-object v10, v4

    .line 507
    goto :goto_8

    .line 508
    :cond_18
    check-cast v10, Ljava/lang/Integer;

    .line 509
    .line 510
    if-eqz v10, :cond_19

    .line 511
    .line 512
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 513
    .line 514
    .line 515
    move-result v1

    .line 516
    invoke-static {v1, v2}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    :cond_19
    invoke-static {v2, v9}, Ltf/m;->G1(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 521
    .line 522
    .line 523
    move-result-object v12

    .line 524
    const/16 v16, 0x0

    .line 525
    .line 526
    const/16 v17, 0x3e

    .line 527
    .line 528
    const-string v13, "/"

    .line 529
    .line 530
    const/4 v14, 0x0

    .line 531
    const/4 v15, 0x0

    .line 532
    invoke-static/range {v12 .. v17}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->encodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    new-array v1, v5, [C

    .line 560
    .line 561
    aput-char v11, v1, v8

    .line 562
    .line 563
    invoke-static {v0, v1}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v12

    .line 567
    goto/16 :goto_18

    .line 568
    .line 569
    :cond_1a
    :goto_9
    new-array v0, v5, [C

    .line 570
    .line 571
    aput-char v11, v0, v8

    .line 572
    .line 573
    invoke-static {v1, v0}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    const-string v1, "/v1beta"

    .line 578
    .line 579
    :goto_a
    invoke-static {v0, v1}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v12

    .line 583
    goto/16 :goto_18

    .line 584
    .line 585
    :sswitch_2
    const-string v1, "custom_url"

    .line 586
    .line 587
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    move-result v0

    .line 591
    if-nez v0, :cond_1b

    .line 592
    .line 593
    goto :goto_b

    .line 594
    :cond_1b
    invoke-static/range {p0 .. p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    return-object v0

    .line 603
    :sswitch_3
    const-string v1, "anthropic"

    .line 604
    .line 605
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 606
    .line 607
    .line 608
    move-result v0

    .line 609
    if-nez v0, :cond_27

    .line 610
    .line 611
    :goto_b
    invoke-static/range {p0 .. p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 620
    .line 621
    .line 622
    move-result v1

    .line 623
    if-eqz v1, :cond_1c

    .line 624
    .line 625
    goto/16 :goto_18

    .line 626
    .line 627
    :cond_1c
    invoke-static {v0, v9, v8}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 628
    .line 629
    .line 630
    move-result v1

    .line 631
    if-nez v1, :cond_1d

    .line 632
    .line 633
    new-instance v1, Ljava/lang/StringBuilder;

    .line 634
    .line 635
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    :cond_1d
    invoke-static/range {p2 .. p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 646
    .line 647
    .line 648
    move-result v1

    .line 649
    if-nez v1, :cond_1e

    .line 650
    .line 651
    new-array v1, v5, [C

    .line 652
    .line 653
    aput-char v11, v1, v8

    .line 654
    .line 655
    invoke-static {v0, v1}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    invoke-static {v1, v4, v8}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 660
    .line 661
    .line 662
    move-result v1

    .line 663
    if-nez v1, :cond_1e

    .line 664
    .line 665
    new-array v1, v5, [C

    .line 666
    .line 667
    aput-char v11, v1, v8

    .line 668
    .line 669
    invoke-static {v0, v1}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    invoke-static/range {p2 .. p2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 674
    .line 675
    .line 676
    move-result-object v1

    .line 677
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v1

    .line 681
    new-array v3, v5, [C

    .line 682
    .line 683
    aput-char v11, v3, v8

    .line 684
    .line 685
    invoke-static {v1, v3}, Log/m;->W0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object v1

    .line 689
    invoke-static {v0, v6, v1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    :cond_1e
    move-object v1, v0

    .line 694
    :try_start_2
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 695
    .line 696
    .line 697
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 698
    goto :goto_c

    .line 699
    :catchall_2
    move-exception v0

    .line 700
    new-instance v3, Lsf/f;

    .line 701
    .line 702
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 703
    .line 704
    .line 705
    move-object v0, v3

    .line 706
    :goto_c
    nop

    .line 707
    instance-of v3, v0, Lsf/f;

    .line 708
    .line 709
    if-eqz v3, :cond_1f

    .line 710
    .line 711
    move-object v0, v10

    .line 712
    :cond_1f
    check-cast v0, Landroid/net/Uri;

    .line 713
    .line 714
    if-eqz v0, :cond_23

    .line 715
    .line 716
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 717
    .line 718
    .line 719
    move-result-object v3

    .line 720
    if-eqz v3, :cond_23

    .line 721
    .line 722
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 723
    .line 724
    .line 725
    move-result v3

    .line 726
    if-eqz v3, :cond_20

    .line 727
    .line 728
    goto :goto_e

    .line 729
    :cond_20
    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 730
    .line 731
    .line 732
    move-result-object v3

    .line 733
    if-eqz v3, :cond_23

    .line 734
    .line 735
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 736
    .line 737
    .line 738
    move-result v3

    .line 739
    if-eqz v3, :cond_21

    .line 740
    .line 741
    goto :goto_e

    .line 742
    :cond_21
    invoke-virtual {v0}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    move-result-object v1

    .line 746
    if-nez v1, :cond_22

    .line 747
    .line 748
    goto :goto_d

    .line 749
    :cond_22
    move-object v12, v1

    .line 750
    :goto_d
    invoke-static {v12}, Lfb/w;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 751
    .line 752
    .line 753
    move-result-object v1

    .line 754
    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 755
    .line 756
    .line 757
    move-result-object v0

    .line 758
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->encodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 763
    .line 764
    .line 765
    move-result-object v0

    .line 766
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 767
    .line 768
    .line 769
    move-result-object v0

    .line 770
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 771
    .line 772
    .line 773
    new-array v1, v5, [C

    .line 774
    .line 775
    aput-char v11, v1, v8

    .line 776
    .line 777
    invoke-static {v0, v1}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v12

    .line 781
    goto/16 :goto_18

    .line 782
    .line 783
    :cond_23
    :goto_e
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 784
    .line 785
    .line 786
    move-result-object v0

    .line 787
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    new-array v1, v5, [C

    .line 792
    .line 793
    aput-char v11, v1, v8

    .line 794
    .line 795
    invoke-static {v0, v1}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    invoke-static {v0, v9, v8, v8, v2}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 800
    .line 801
    .line 802
    move-result v1

    .line 803
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 804
    .line 805
    .line 806
    move-result-object v2

    .line 807
    if-ltz v1, :cond_24

    .line 808
    .line 809
    move-object v10, v2

    .line 810
    :cond_24
    if-eqz v10, :cond_25

    .line 811
    .line 812
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 813
    .line 814
    .line 815
    move-result v1

    .line 816
    add-int/lit8 v1, v1, 0x3

    .line 817
    .line 818
    goto :goto_f

    .line 819
    :cond_25
    move v1, v8

    .line 820
    :goto_f
    const/4 v2, 0x4

    .line 821
    invoke-static {v0, v11, v1, v2}, Log/m;->q0(Ljava/lang/CharSequence;CII)I

    .line 822
    .line 823
    .line 824
    move-result v1

    .line 825
    if-gez v1, :cond_26

    .line 826
    .line 827
    const-string v1, "/v1/chat/completions"

    .line 828
    .line 829
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    :goto_10
    move-object v12, v0

    .line 834
    goto/16 :goto_18

    .line 835
    .line 836
    :cond_26
    invoke-virtual {v0, v8, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 837
    .line 838
    .line 839
    move-result-object v2

    .line 840
    new-array v3, v5, [C

    .line 841
    .line 842
    aput-char v11, v3, v8

    .line 843
    .line 844
    invoke-static {v2, v3}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 845
    .line 846
    .line 847
    move-result-object v2

    .line 848
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 849
    .line 850
    .line 851
    move-result-object v0

    .line 852
    invoke-static {v0}, Lfb/w;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 853
    .line 854
    .line 855
    move-result-object v0

    .line 856
    invoke-static {v2, v0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    goto :goto_10

    .line 861
    :cond_27
    invoke-static/range {p0 .. p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object v0

    .line 869
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 870
    .line 871
    .line 872
    move-result v1

    .line 873
    if-eqz v1, :cond_28

    .line 874
    .line 875
    goto/16 :goto_18

    .line 876
    .line 877
    :cond_28
    invoke-static {v0, v9, v8}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 878
    .line 879
    .line 880
    move-result v1

    .line 881
    if-nez v1, :cond_29

    .line 882
    .line 883
    new-instance v1, Ljava/lang/StringBuilder;

    .line 884
    .line 885
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 886
    .line 887
    .line 888
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 889
    .line 890
    .line 891
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 892
    .line 893
    .line 894
    move-result-object v0

    .line 895
    :cond_29
    move-object v1, v0

    .line 896
    :try_start_3
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 897
    .line 898
    .line 899
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 900
    goto :goto_11

    .line 901
    :catchall_3
    move-exception v0

    .line 902
    new-instance v4, Lsf/f;

    .line 903
    .line 904
    invoke-direct {v4, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 905
    .line 906
    .line 907
    move-object v0, v4

    .line 908
    :goto_11
    nop

    .line 909
    instance-of v4, v0, Lsf/f;

    .line 910
    .line 911
    if-eqz v4, :cond_2a

    .line 912
    .line 913
    move-object v0, v10

    .line 914
    :cond_2a
    check-cast v0, Landroid/net/Uri;

    .line 915
    .line 916
    if-eqz v0, :cond_36

    .line 917
    .line 918
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 919
    .line 920
    .line 921
    move-result-object v4

    .line 922
    if-eqz v4, :cond_36

    .line 923
    .line 924
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 925
    .line 926
    .line 927
    move-result v4

    .line 928
    if-eqz v4, :cond_2b

    .line 929
    .line 930
    goto/16 :goto_17

    .line 931
    .line 932
    :cond_2b
    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 933
    .line 934
    .line 935
    move-result-object v4

    .line 936
    if-eqz v4, :cond_36

    .line 937
    .line 938
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 939
    .line 940
    .line 941
    move-result v4

    .line 942
    if-eqz v4, :cond_2c

    .line 943
    .line 944
    goto/16 :goto_17

    .line 945
    .line 946
    :cond_2c
    invoke-virtual {v0}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;

    .line 947
    .line 948
    .line 949
    move-result-object v1

    .line 950
    if-nez v1, :cond_2d

    .line 951
    .line 952
    goto :goto_12

    .line 953
    :cond_2d
    move-object v12, v1

    .line 954
    :goto_12
    new-array v1, v5, [C

    .line 955
    .line 956
    aput-char v11, v1, v8

    .line 957
    .line 958
    invoke-static {v12, v1, v2}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 959
    .line 960
    .line 961
    move-result-object v1

    .line 962
    new-instance v2, Ljava/util/ArrayList;

    .line 963
    .line 964
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 965
    .line 966
    .line 967
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 968
    .line 969
    .line 970
    move-result-object v1

    .line 971
    :cond_2e
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 972
    .line 973
    .line 974
    move-result v4

    .line 975
    if-eqz v4, :cond_2f

    .line 976
    .line 977
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 978
    .line 979
    .line 980
    move-result-object v4

    .line 981
    move-object v7, v4

    .line 982
    check-cast v7, Ljava/lang/String;

    .line 983
    .line 984
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 985
    .line 986
    .line 987
    move-result v7

    .line 988
    if-nez v7, :cond_2e

    .line 989
    .line 990
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 991
    .line 992
    .line 993
    goto :goto_13

    .line 994
    :cond_2f
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 995
    .line 996
    .line 997
    move-result v1

    .line 998
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 999
    .line 1000
    .line 1001
    move-result-object v1

    .line 1002
    :cond_30
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 1003
    .line 1004
    .line 1005
    move-result v4

    .line 1006
    if-eqz v4, :cond_31

    .line 1007
    .line 1008
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v4

    .line 1012
    check-cast v4, Ljava/lang/String;

    .line 1013
    .line 1014
    invoke-static {v4, v3}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 1015
    .line 1016
    .line 1017
    move-result v4

    .line 1018
    if-eqz v4, :cond_30

    .line 1019
    .line 1020
    invoke-interface {v1}, Ljava/util/ListIterator;->nextIndex()I

    .line 1021
    .line 1022
    .line 1023
    move-result v1

    .line 1024
    goto :goto_14

    .line 1025
    :cond_31
    const/4 v1, -0x1

    .line 1026
    :goto_14
    invoke-static {v2}, La/a;->X(Ljava/util/Collection;)Llg/d;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v4

    .line 1030
    invoke-virtual {v4}, Llg/b;->iterator()Ljava/util/Iterator;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v4

    .line 1034
    :cond_32
    :goto_15
    move-object v7, v4

    .line 1035
    check-cast v7, Llg/c;

    .line 1036
    .line 1037
    iget-boolean v9, v7, Llg/c;->i:Z

    .line 1038
    .line 1039
    const-string v12, "messages"

    .line 1040
    .line 1041
    if-eqz v9, :cond_33

    .line 1042
    .line 1043
    invoke-virtual {v7}, Llg/c;->next()Ljava/lang/Object;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v7

    .line 1047
    move-object v9, v7

    .line 1048
    check-cast v9, Ljava/lang/Number;

    .line 1049
    .line 1050
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 1051
    .line 1052
    .line 1053
    move-result v9

    .line 1054
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v9

    .line 1058
    check-cast v9, Ljava/lang/String;

    .line 1059
    .line 1060
    invoke-static {v12, v9, v5}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1061
    .line 1062
    .line 1063
    move-result v9

    .line 1064
    if-eqz v9, :cond_32

    .line 1065
    .line 1066
    move-object v10, v7

    .line 1067
    goto :goto_15

    .line 1068
    :cond_33
    check-cast v10, Ljava/lang/Integer;

    .line 1069
    .line 1070
    if-ltz v1, :cond_34

    .line 1071
    .line 1072
    invoke-static {v1, v2}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v2

    .line 1076
    goto :goto_16

    .line 1077
    :cond_34
    if-eqz v10, :cond_35

    .line 1078
    .line 1079
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 1080
    .line 1081
    .line 1082
    move-result v1

    .line 1083
    invoke-static {v1, v2}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v2

    .line 1087
    :cond_35
    :goto_16
    filled-new-array {v3, v12}, [Ljava/lang/String;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v1

    .line 1091
    invoke-static {v1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v1

    .line 1095
    invoke-static {v2, v1}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v12

    .line 1099
    const/16 v16, 0x0

    .line 1100
    .line 1101
    const/16 v17, 0x3e

    .line 1102
    .line 1103
    const-string v13, "/"

    .line 1104
    .line 1105
    const/4 v14, 0x0

    .line 1106
    const/4 v15, 0x0

    .line 1107
    invoke-static/range {v12 .. v17}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v1

    .line 1111
    invoke-virtual {v6, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v1

    .line 1115
    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v0

    .line 1119
    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->encodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v0

    .line 1123
    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v0

    .line 1127
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v0

    .line 1131
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1132
    .line 1133
    .line 1134
    new-array v1, v5, [C

    .line 1135
    .line 1136
    aput-char v11, v1, v8

    .line 1137
    .line 1138
    invoke-static {v0, v1}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v12

    .line 1142
    goto :goto_18

    .line 1143
    :cond_36
    :goto_17
    new-array v0, v5, [C

    .line 1144
    .line 1145
    aput-char v11, v0, v8

    .line 1146
    .line 1147
    invoke-static {v1, v0}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v0

    .line 1151
    const-string v1, "/v1/messages"

    .line 1152
    .line 1153
    goto/16 :goto_a

    .line 1154
    .line 1155
    :goto_18
    return-object v12

    .line 1156
    nop

    .line 1157
    :sswitch_data_0
    .sparse-switch
        -0x7f0b3094 -> :sswitch_3
        -0x5e41a05f -> :sswitch_2
        -0x4a7a6dcb -> :sswitch_1
        0x25847564 -> :sswitch_0
    .end sparse-switch
.end method

.method public static q(Lfb/v;)Lfb/v;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lfb/v;->k:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v1}, Lfb/w;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v9

    .line 9
    iget-object v1, v0, Lfb/v;->a:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v2, v0, Lfb/v;->b:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v1, v9, v2}, Lfb/w;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, v0, Lfb/v;->c:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v3, v0, Lfb/v;->d:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget-object v4, v0, Lfb/v;->e:Ljava/util/List;

    .line 38
    .line 39
    new-instance v5, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-static {v4}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    const/4 v6, 0x0

    .line 53
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    const/4 v8, 0x0

    .line 58
    if-eqz v7, :cond_3

    .line 59
    .line 60
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    add-int/lit8 v10, v6, 0x1

    .line 65
    .line 66
    if-ltz v6, :cond_2

    .line 67
    .line 68
    move-object v11, v7

    .line 69
    check-cast v11, Lfb/r0;

    .line 70
    .line 71
    iget-object v6, v11, Lfb/r0;->a:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-eqz v7, :cond_0

    .line 86
    .line 87
    const-string v6, "mcp-"

    .line 88
    .line 89
    invoke-static {v10, v6}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    :cond_0
    move-object v12, v6

    .line 94
    iget-object v6, v11, Lfb/r0;->b:Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    const-string v7, "\\s+"

    .line 105
    .line 106
    invoke-static {v7}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v7, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    const-string v7, " "

    .line 121
    .line 122
    invoke-virtual {v6, v7}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    const/16 v7, 0x20

    .line 130
    .line 131
    invoke-static {v7, v6}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    if-eqz v7, :cond_1

    .line 140
    .line 141
    const-string v6, "MCP "

    .line 142
    .line 143
    invoke-static {v10, v6}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    :cond_1
    move-object v13, v6

    .line 148
    iget-object v6, v11, Lfb/r0;->d:Ljava/lang/String;

    .line 149
    .line 150
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v15

    .line 158
    iget-object v6, v11, Lfb/r0;->e:Ljava/lang/String;

    .line 159
    .line 160
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v16

    .line 168
    const/16 v17, 0x4

    .line 169
    .line 170
    const/4 v14, 0x0

    .line 171
    invoke-static/range {v11 .. v17}, Lfb/r0;->a(Lfb/r0;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;I)Lfb/r0;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move v6, v10

    .line 179
    goto :goto_0

    .line 180
    :cond_2
    invoke-static {}, La/a;->Q0()V

    .line 181
    .line 182
    .line 183
    throw v8

    .line 184
    :cond_3
    new-instance v4, Ljava/util/HashSet;

    .line 185
    .line 186
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 187
    .line 188
    .line 189
    new-instance v6, Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    :cond_4
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    if-eqz v7, :cond_5

    .line 203
    .line 204
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    move-object v10, v7

    .line 209
    check-cast v10, Lfb/r0;

    .line 210
    .line 211
    iget-object v10, v10, Lfb/r0;->a:Ljava/lang/String;

    .line 212
    .line 213
    invoke-virtual {v4, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v10

    .line 217
    if-eqz v10, :cond_4

    .line 218
    .line 219
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_5
    iget v4, v0, Lfb/v;->g:I

    .line 224
    .line 225
    const/16 v5, 0x7d0

    .line 226
    .line 227
    const v7, 0xf4240

    .line 228
    .line 229
    .line 230
    invoke-static {v4, v5, v7}, Lr9/e0;->r(III)I

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    iget-object v4, v0, Lfb/v;->i:Ljava/lang/String;

    .line 235
    .line 236
    const-string v7, "ask"

    .line 237
    .line 238
    invoke-static {v4, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v10

    .line 242
    if-nez v10, :cond_7

    .line 243
    .line 244
    const-string v10, "always_allow"

    .line 245
    .line 246
    invoke-static {v4, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v10

    .line 250
    if-eqz v10, :cond_6

    .line 251
    .line 252
    goto :goto_2

    .line 253
    :cond_6
    move-object v4, v8

    .line 254
    :cond_7
    :goto_2
    if-eqz v4, :cond_8

    .line 255
    .line 256
    move-object v7, v4

    .line 257
    :cond_8
    iget-object v4, v0, Lfb/v;->j:Ljava/lang/String;

    .line 258
    .line 259
    const-string v10, "auto"

    .line 260
    .line 261
    invoke-static {v4, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v10

    .line 265
    const-string v11, "force"

    .line 266
    .line 267
    if-nez v10, :cond_9

    .line 268
    .line 269
    invoke-static {v4, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v10

    .line 273
    if-nez v10, :cond_9

    .line 274
    .line 275
    const-string v10, "off"

    .line 276
    .line 277
    invoke-static {v4, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v10

    .line 281
    if-eqz v10, :cond_a

    .line 282
    .line 283
    :cond_9
    move-object v8, v4

    .line 284
    :cond_a
    if-eqz v8, :cond_b

    .line 285
    .line 286
    goto :goto_3

    .line 287
    :cond_b
    move-object v8, v11

    .line 288
    :goto_3
    const/16 v10, 0xa0

    .line 289
    .line 290
    move-object v4, v6

    .line 291
    const/4 v6, 0x0

    .line 292
    invoke-static/range {v0 .. v10}, Lfb/v;->a(Lfb/v;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lfb/v;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    return-object v0
.end method

.method public static r(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "openai_compatible"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    const-string v1, "openai"

    .line 10
    .line 11
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    const-string v1, "deepseek"

    .line 18
    .line 19
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    const-string v1, "openrouter"

    .line 26
    .line 27
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    const-string v1, "siliconflow"

    .line 34
    .line 35
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    const-string v1, "gemini"

    .line 42
    .line 43
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_1

    .line 48
    .line 49
    const-string v1, "anthropic"

    .line 50
    .line 51
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-nez v1, :cond_1

    .line 56
    .line 57
    const-string v1, "custom_url"

    .line 58
    .line 59
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    const/4 v1, 0x0

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 69
    :goto_1
    if-eqz v1, :cond_2

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    const/4 p0, 0x0

    .line 73
    :goto_2
    if-eqz p0, :cond_3

    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_3
    return-object v0
.end method

.method public static s(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v1, v0, [C

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const/16 v3, 0x2f

    .line 6
    .line 7
    aput-char v3, v1, v2

    .line 8
    .line 9
    const/4 v3, 0x6

    .line 10
    invoke-static {p0, v1, v3}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    move-object v4, v3

    .line 34
    check-cast v4, Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-nez v4, :cond_0

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eqz p0, :cond_2

    .line 51
    .line 52
    const-string p0, "/v1/chat/completions"

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    :cond_3
    invoke-interface {p0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_4

    .line 68
    .line 69
    invoke-interface {p0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Ljava/lang/String;

    .line 74
    .line 75
    const-string v4, "v1"

    .line 76
    .line 77
    invoke-static {v3, v4}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_3

    .line 82
    .line 83
    invoke-interface {p0}, Ljava/util/ListIterator;->nextIndex()I

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    goto :goto_1

    .line 88
    :cond_4
    const/4 p0, -0x1

    .line 89
    :goto_1
    if-ltz p0, :cond_5

    .line 90
    .line 91
    invoke-static {p0, v1}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0}, Lfb/w;->h(Ljava/util/List;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0

    .line 100
    :cond_5
    invoke-static {v1}, La/a;->X(Ljava/util/Collection;)Llg/d;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {p0}, Llg/b;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    const/4 v3, 0x0

    .line 109
    :cond_6
    :goto_2
    move-object v4, p0

    .line 110
    check-cast v4, Llg/c;

    .line 111
    .line 112
    iget-boolean v5, v4, Llg/c;->i:Z

    .line 113
    .line 114
    if-eqz v5, :cond_9

    .line 115
    .line 116
    invoke-virtual {v4}, Llg/c;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    move-object v5, v4

    .line 121
    check-cast v5, Ljava/lang/Number;

    .line 122
    .line 123
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    check-cast v6, Ljava/lang/String;

    .line 132
    .line 133
    const-string v7, "chat"

    .line 134
    .line 135
    invoke-static {v6, v7}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    if-nez v6, :cond_7

    .line 140
    .line 141
    move v5, v2

    .line 142
    goto :goto_3

    .line 143
    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 144
    .line 145
    invoke-static {v5, v1}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    check-cast v5, Ljava/lang/String;

    .line 150
    .line 151
    if-eqz v5, :cond_8

    .line 152
    .line 153
    const-string v6, "completions"

    .line 154
    .line 155
    invoke-static {v6, v5, v0}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    goto :goto_3

    .line 160
    :cond_8
    move v5, v0

    .line 161
    :goto_3
    if-eqz v5, :cond_6

    .line 162
    .line 163
    move-object v3, v4

    .line 164
    goto :goto_2

    .line 165
    :cond_9
    check-cast v3, Ljava/lang/Integer;

    .line 166
    .line 167
    if-eqz v3, :cond_a

    .line 168
    .line 169
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 170
    .line 171
    .line 172
    move-result p0

    .line 173
    invoke-static {p0, v1}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-static {p0}, Lfb/w;->h(Ljava/util/List;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    return-object p0

    .line 182
    :cond_a
    invoke-static {v1}, Lfb/w;->h(Ljava/util/List;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    return-object p0
.end method

.method public static t(Ljava/lang/String;)Lorg/json/JSONArray;
    .locals 1

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
    new-instance p0, Lorg/json/JSONArray;

    .line 8
    .line 9
    invoke-direct {p0}, Lorg/json/JSONArray;-><init>()V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    new-instance v0, Lsf/f;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-nez p0, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    new-instance v0, Lorg/json/JSONArray;

    .line 33
    .line 34
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 35
    .line 36
    .line 37
    :goto_1
    check-cast v0, Lorg/json/JSONArray;

    .line 38
    .line 39
    return-object v0
.end method

.method public static u(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lfb/t0;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const-string v0, "Hchat_script_plugin_config"

    .line 8
    .line 9
    invoke-static {p0, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lfb/w;->i(Landroid/content/SharedPreferences;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x0

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    move-object v4, v2

    .line 33
    check-cast v4, Lfb/t0;

    .line 34
    .line 35
    iget-object v4, v4, Lfb/t0;->a:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v4, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move-object v2, v3

    .line 45
    :goto_0
    check-cast v2, Lfb/t0;

    .line 46
    .line 47
    if-eqz v2, :cond_6

    .line 48
    .line 49
    invoke-static {p2}, Lfb/w;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    goto :goto_4

    .line 60
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_5

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, Lfb/t0;

    .line 75
    .line 76
    iget-object v4, v1, Lfb/t0;->a:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v4, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-nez v4, :cond_3

    .line 83
    .line 84
    iget-object v1, v1, Lfb/t0;->b:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v1, p2}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_3

    .line 91
    .line 92
    const/4 v1, 0x1

    .line 93
    goto :goto_2

    .line 94
    :cond_3
    const/4 v1, 0x0

    .line 95
    :goto_2
    if-nez v1, :cond_4

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    const-string p0, "\u914d\u7f6e\u540d\u79f0\u5df2\u5b58\u5728"

    .line 99
    .line 100
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :goto_3
    const/4 p0, 0x0

    .line 104
    return-object p0

    .line 105
    :cond_5
    :goto_4
    const/4 p1, 0x5

    .line 106
    invoke-static {v2, p2, v3, p1}, Lfb/t0;->a(Lfb/t0;Ljava/lang/String;Lfb/v;I)Lfb/t0;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-static {p0, p1}, Lfb/w;->x(Landroid/content/Context;Lfb/t0;)V

    .line 111
    .line 112
    .line 113
    return-object p1

    .line 114
    :cond_6
    const-string p0, "\u914d\u7f6e\u4e0d\u5b58\u5728"

    .line 115
    .line 116
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    goto :goto_3
.end method

.method public static v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lfb/w;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, ""

    .line 15
    .line 16
    invoke-static {p0, p1, v0}, Lfb/w;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string v1, "gemini"

    .line 21
    .line 22
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_4

    .line 27
    .line 28
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string p2, "models/"

    .line 45
    .line 46
    invoke-static {p1, p2}, Log/m;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-nez p2, :cond_4

    .line 55
    .line 56
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-eqz p2, :cond_0

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_0
    if-eqz p3, :cond_1

    .line 64
    .line 65
    const-string p2, "streamGenerateContent"

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    const-string p2, "generateContent"

    .line 69
    .line 70
    :goto_0
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    if-nez v1, :cond_2

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    move-object v0, v1

    .line 82
    :goto_1
    const/4 v1, 0x1

    .line 83
    new-array v1, v1, [C

    .line 84
    .line 85
    const/16 v2, 0x2f

    .line 86
    .line 87
    const/4 v3, 0x0

    .line 88
    aput-char v2, v1, v3

    .line 89
    .line 90
    invoke-static {v0, v1}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {p1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    const-string v1, "/models/"

    .line 99
    .line 100
    const-string v2, ":"

    .line 101
    .line 102
    invoke-static {v0, v1, p1, v2, p2}, Lbc/e;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0, p1}, Landroid/net/Uri$Builder;->encodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    if-eqz p3, :cond_3

    .line 115
    .line 116
    const-string p1, "alt"

    .line 117
    .line 118
    const-string p2, "sse"

    .line 119
    .line 120
    invoke-virtual {p0, p1, p2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 121
    .line 122
    .line 123
    :cond_3
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    :cond_4
    :goto_2
    return-object p0
.end method

.method public static w(Landroid/content/Context;Lfb/v;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lfb/w;->n(Landroid/content/Context;)Lfb/t0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {p1}, Lfb/w;->q(Lfb/v;)Lfb/v;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v1, 0x3

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {v0, v2, p1, v1}, Lfb/t0;->a(Lfb/t0;Ljava/lang/String;Lfb/v;I)Lfb/t0;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p0, p1}, Lfb/w;->x(Landroid/content/Context;Lfb/t0;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static x(Landroid/content/Context;Lfb/t0;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "Hchat_script_plugin_config"

    .line 5
    .line 6
    invoke-static {p0, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Lfb/w;->i(Landroid/content/SharedPreferences;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p1, Lfb/t0;->b:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v0}, Lfb/w;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v2, p1, Lfb/t0;->c:Lfb/v;

    .line 26
    .line 27
    invoke-static {v2}, Lfb/w;->q(Lfb/v;)Lfb/v;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const/4 v3, 0x1

    .line 32
    invoke-static {p1, v0, v2, v3}, Lfb/t0;->a(Lfb/t0;Ljava/lang/String;Lfb/v;I)Lfb/t0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object v0, p1, Lfb/t0;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const/4 v3, 0x0

    .line 43
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_1

    .line 48
    .line 49
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    check-cast v4, Lfb/t0;

    .line 54
    .line 55
    iget-object v4, v4, Lfb/t0;->a:Ljava/lang/String;

    .line 56
    .line 57
    invoke-static {v4, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_0

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    const/4 v3, -0x1

    .line 68
    :goto_1
    if-ltz v3, :cond_2

    .line 69
    .line 70
    invoke-virtual {v1, v3, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    :goto_2
    invoke-static {p0, v1, v0}, Lfb/w;->y(Landroid/content/SharedPreferences;Ljava/util/List;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public static y(Landroid/content/SharedPreferences;Ljava/util/List;Ljava/lang/String;)V
    .locals 18

    .line 1
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    move-object v3, v1

    .line 16
    check-cast v3, Lfb/t0;

    .line 17
    .line 18
    iget-object v3, v3, Lfb/t0;->a:Ljava/lang/String;

    .line 19
    .line 20
    move-object/from16 v4, p2

    .line 21
    .line 22
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v1, 0x0

    .line 30
    :goto_0
    check-cast v1, Lfb/t0;

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    invoke-static/range {p1 .. p1}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    move-object v1, v0

    .line 40
    check-cast v1, Lfb/t0;

    .line 41
    .line 42
    :goto_1
    iget-object v0, v1, Lfb/t0;->c:Lfb/v;

    .line 43
    .line 44
    iget-object v3, v0, Lfb/v;->e:Ljava/util/List;

    .line 45
    .line 46
    iget-object v4, v0, Lfb/v;->a:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v5, v0, Lfb/v;->k:Ljava/lang/String;

    .line 49
    .line 50
    const-string v6, ""

    .line 51
    .line 52
    invoke-static {v4, v5, v6}, Lfb/w;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    const-string v7, "openai_compatible"

    .line 57
    .line 58
    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    const/4 v7, 0x0

    .line 63
    const/4 v8, 0x1

    .line 64
    if-eqz v5, :cond_3

    .line 65
    .line 66
    const-string v5, "/chat/completions"

    .line 67
    .line 68
    invoke-static {v4, v5, v8}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    if-eqz v9, :cond_3

    .line 73
    .line 74
    const/16 v9, 0x11

    .line 75
    .line 76
    invoke-static {v9, v4}, Log/m;->k0(ILjava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    new-array v9, v8, [C

    .line 81
    .line 82
    const/16 v10, 0x2f

    .line 83
    .line 84
    aput-char v10, v9, v7

    .line 85
    .line 86
    invoke-static {v4, v9}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    new-instance v9, Lsf/e;

    .line 91
    .line 92
    invoke-direct {v9, v4, v5}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_3
    new-instance v9, Lsf/e;

    .line 97
    .line 98
    invoke-direct {v9, v4, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :goto_2
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    :cond_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-eqz v5, :cond_5

    .line 110
    .line 111
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    move-object v10, v5

    .line 116
    check-cast v10, Lfb/r0;

    .line 117
    .line 118
    iget-boolean v10, v10, Lfb/r0;->c:Z

    .line 119
    .line 120
    if-eqz v10, :cond_4

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_5
    const/4 v5, 0x0

    .line 124
    :goto_3
    check-cast v5, Lfb/r0;

    .line 125
    .line 126
    if-eqz v5, :cond_6

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_6
    invoke-static {v3}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    move-object v5, v3

    .line 134
    check-cast v5, Lfb/r0;

    .line 135
    .line 136
    :goto_4
    new-instance v3, Lorg/json/JSONArray;

    .line 137
    .line 138
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v10

    .line 149
    if-eqz v10, :cond_10

    .line 150
    .line 151
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v10

    .line 155
    check-cast v10, Lfb/t0;

    .line 156
    .line 157
    new-instance v11, Lorg/json/JSONObject;

    .line 158
    .line 159
    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    .line 160
    .line 161
    .line 162
    iget-object v12, v10, Lfb/t0;->a:Ljava/lang/String;

    .line 163
    .line 164
    const-string v13, "id"

    .line 165
    .line 166
    invoke-virtual {v11, v13, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 167
    .line 168
    .line 169
    iget-object v12, v10, Lfb/t0;->b:Ljava/lang/String;

    .line 170
    .line 171
    const-string v14, "name"

    .line 172
    .line 173
    invoke-virtual {v11, v14, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 174
    .line 175
    .line 176
    iget-object v10, v10, Lfb/t0;->c:Lfb/v;

    .line 177
    .line 178
    invoke-static {v10}, Lfb/w;->q(Lfb/v;)Lfb/v;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    iget-object v12, v10, Lfb/v;->e:Ljava/util/List;

    .line 183
    .line 184
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object v15

    .line 188
    :cond_7
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v16

    .line 192
    if-eqz v16, :cond_8

    .line 193
    .line 194
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v16

    .line 198
    move-object/from16 v2, v16

    .line 199
    .line 200
    check-cast v2, Lfb/r0;

    .line 201
    .line 202
    iget-boolean v2, v2, Lfb/r0;->c:Z

    .line 203
    .line 204
    if-eqz v2, :cond_7

    .line 205
    .line 206
    goto :goto_6

    .line 207
    :cond_8
    const/16 v16, 0x0

    .line 208
    .line 209
    :goto_6
    check-cast v16, Lfb/r0;

    .line 210
    .line 211
    if-eqz v16, :cond_9

    .line 212
    .line 213
    :goto_7
    move-object/from16 v2, v16

    .line 214
    .line 215
    goto :goto_8

    .line 216
    :cond_9
    invoke-static {v12}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    move-object/from16 v16, v2

    .line 221
    .line 222
    check-cast v16, Lfb/r0;

    .line 223
    .line 224
    goto :goto_7

    .line 225
    :goto_8
    new-instance v15, Lorg/json/JSONObject;

    .line 226
    .line 227
    invoke-direct {v15}, Lorg/json/JSONObject;-><init>()V

    .line 228
    .line 229
    .line 230
    const-string v7, "apiEndpoint"

    .line 231
    .line 232
    iget-object v8, v10, Lfb/v;->a:Ljava/lang/String;

    .line 233
    .line 234
    invoke-virtual {v15, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 235
    .line 236
    .line 237
    const-string v7, "endpointMode"

    .line 238
    .line 239
    iget-object v8, v10, Lfb/v;->k:Ljava/lang/String;

    .line 240
    .line 241
    invoke-virtual {v15, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 242
    .line 243
    .line 244
    const-string v7, "apiKey"

    .line 245
    .line 246
    iget-object v8, v10, Lfb/v;->c:Ljava/lang/String;

    .line 247
    .line 248
    invoke-virtual {v15, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 249
    .line 250
    .line 251
    const-string v7, "model"

    .line 252
    .line 253
    iget-object v8, v10, Lfb/v;->d:Ljava/lang/String;

    .line 254
    .line 255
    invoke-virtual {v15, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 256
    .line 257
    .line 258
    if-eqz v2, :cond_a

    .line 259
    .line 260
    iget-boolean v7, v2, Lfb/r0;->c:Z

    .line 261
    .line 262
    const/4 v8, 0x1

    .line 263
    if-ne v7, v8, :cond_a

    .line 264
    .line 265
    const/4 v8, 0x1

    .line 266
    goto :goto_9

    .line 267
    :cond_a
    const/4 v8, 0x0

    .line 268
    :goto_9
    const-string v7, "mcpEnabled"

    .line 269
    .line 270
    invoke-virtual {v15, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 271
    .line 272
    .line 273
    if-eqz v2, :cond_b

    .line 274
    .line 275
    iget-object v7, v2, Lfb/r0;->d:Ljava/lang/String;

    .line 276
    .line 277
    goto :goto_a

    .line 278
    :cond_b
    const/4 v7, 0x0

    .line 279
    :goto_a
    if-nez v7, :cond_c

    .line 280
    .line 281
    move-object v7, v6

    .line 282
    :cond_c
    const-string v8, "mcpEndpoint"

    .line 283
    .line 284
    invoke-virtual {v15, v8, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 285
    .line 286
    .line 287
    if-eqz v2, :cond_d

    .line 288
    .line 289
    iget-object v2, v2, Lfb/r0;->e:Ljava/lang/String;

    .line 290
    .line 291
    goto :goto_b

    .line 292
    :cond_d
    const/4 v2, 0x0

    .line 293
    :goto_b
    if-nez v2, :cond_e

    .line 294
    .line 295
    move-object v2, v6

    .line 296
    :cond_e
    const-string v7, "mcpAuthorization"

    .line 297
    .line 298
    invoke-virtual {v15, v7, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 299
    .line 300
    .line 301
    new-instance v2, Lorg/json/JSONArray;

    .line 302
    .line 303
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 304
    .line 305
    .line 306
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 307
    .line 308
    .line 309
    move-result-object v7

    .line 310
    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 311
    .line 312
    .line 313
    move-result v8

    .line 314
    if-eqz v8, :cond_f

    .line 315
    .line 316
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v8

    .line 320
    check-cast v8, Lfb/r0;

    .line 321
    .line 322
    new-instance v12, Lorg/json/JSONObject;

    .line 323
    .line 324
    invoke-direct {v12}, Lorg/json/JSONObject;-><init>()V

    .line 325
    .line 326
    .line 327
    move-object/from16 p1, v4

    .line 328
    .line 329
    iget-object v4, v8, Lfb/r0;->a:Ljava/lang/String;

    .line 330
    .line 331
    invoke-virtual {v12, v13, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 332
    .line 333
    .line 334
    iget-object v4, v8, Lfb/r0;->b:Ljava/lang/String;

    .line 335
    .line 336
    invoke-virtual {v12, v14, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 337
    .line 338
    .line 339
    const-string v4, "enabled"

    .line 340
    .line 341
    move-object/from16 v17, v6

    .line 342
    .line 343
    iget-boolean v6, v8, Lfb/r0;->c:Z

    .line 344
    .line 345
    invoke-virtual {v12, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 346
    .line 347
    .line 348
    const-string v4, "endpoint"

    .line 349
    .line 350
    iget-object v6, v8, Lfb/r0;->d:Ljava/lang/String;

    .line 351
    .line 352
    invoke-virtual {v12, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 353
    .line 354
    .line 355
    const-string v4, "authorization"

    .line 356
    .line 357
    iget-object v6, v8, Lfb/r0;->e:Ljava/lang/String;

    .line 358
    .line 359
    invoke-virtual {v12, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2, v12}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 363
    .line 364
    .line 365
    move-object/from16 v4, p1

    .line 366
    .line 367
    move-object/from16 v6, v17

    .line 368
    .line 369
    goto :goto_c

    .line 370
    :cond_f
    move-object/from16 p1, v4

    .line 371
    .line 372
    move-object/from16 v17, v6

    .line 373
    .line 374
    const-string v4, "mcpServers"

    .line 375
    .line 376
    invoke-virtual {v15, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 377
    .line 378
    .line 379
    const-string v2, "autoCompactEnabled"

    .line 380
    .line 381
    iget-boolean v4, v10, Lfb/v;->f:Z

    .line 382
    .line 383
    invoke-virtual {v15, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 384
    .line 385
    .line 386
    const-string v2, "compactTokenThreshold"

    .line 387
    .line 388
    iget v4, v10, Lfb/v;->g:I

    .line 389
    .line 390
    invoke-virtual {v15, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 391
    .line 392
    .line 393
    const-string v2, "webSearchEnabled"

    .line 394
    .line 395
    iget-boolean v4, v10, Lfb/v;->h:Z

    .line 396
    .line 397
    invoke-virtual {v15, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 398
    .line 399
    .line 400
    const-string v2, "workspaceWriteApprovalMode"

    .line 401
    .line 402
    iget-object v4, v10, Lfb/v;->i:Ljava/lang/String;

    .line 403
    .line 404
    invoke-virtual {v15, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 405
    .line 406
    .line 407
    const-string v2, "promptCacheMode"

    .line 408
    .line 409
    iget-object v4, v10, Lfb/v;->j:Ljava/lang/String;

    .line 410
    .line 411
    invoke-virtual {v15, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 412
    .line 413
    .line 414
    const-string v2, "config"

    .line 415
    .line 416
    invoke-virtual {v11, v2, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v3, v11}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 420
    .line 421
    .line 422
    move-object/from16 v4, p1

    .line 423
    .line 424
    const/4 v7, 0x0

    .line 425
    const/4 v8, 0x1

    .line 426
    goto/16 :goto_5

    .line 427
    .line 428
    :cond_10
    move-object/from16 v17, v6

    .line 429
    .line 430
    invoke-interface/range {p0 .. p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    const-string v4, "script_plugin_agent_profiles_v1"

    .line 435
    .line 436
    invoke-virtual {v3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    invoke-interface {v2, v4, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 441
    .line 442
    .line 443
    move-result-object v2

    .line 444
    const-string v3, "script_plugin_agent_active_profile"

    .line 445
    .line 446
    iget-object v1, v1, Lfb/t0;->a:Ljava/lang/String;

    .line 447
    .line 448
    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    iget-object v2, v9, Lsf/e;->g:Ljava/lang/Object;

    .line 453
    .line 454
    check-cast v2, Ljava/lang/String;

    .line 455
    .line 456
    const-string v3, "script_plugin_agent_api_base"

    .line 457
    .line 458
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    iget-object v2, v9, Lsf/e;->h:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast v2, Ljava/lang/String;

    .line 465
    .line 466
    const-string v3, "script_plugin_agent_api_path"

    .line 467
    .line 468
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    const-string v2, "script_plugin_agent_api_key"

    .line 473
    .line 474
    iget-object v3, v0, Lfb/v;->c:Ljava/lang/String;

    .line 475
    .line 476
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 477
    .line 478
    .line 479
    move-result-object v1

    .line 480
    const-string v2, "script_plugin_agent_model"

    .line 481
    .line 482
    iget-object v3, v0, Lfb/v;->d:Ljava/lang/String;

    .line 483
    .line 484
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    if-eqz v5, :cond_11

    .line 489
    .line 490
    iget-boolean v2, v5, Lfb/r0;->c:Z

    .line 491
    .line 492
    const/4 v8, 0x1

    .line 493
    if-ne v2, v8, :cond_11

    .line 494
    .line 495
    move v7, v8

    .line 496
    goto :goto_d

    .line 497
    :cond_11
    const/4 v7, 0x0

    .line 498
    :goto_d
    const-string v2, "script_plugin_agent_mcp_enable"

    .line 499
    .line 500
    invoke-interface {v1, v2, v7}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    if-eqz v5, :cond_12

    .line 505
    .line 506
    iget-object v2, v5, Lfb/r0;->d:Ljava/lang/String;

    .line 507
    .line 508
    goto :goto_e

    .line 509
    :cond_12
    const/4 v2, 0x0

    .line 510
    :goto_e
    if-nez v2, :cond_13

    .line 511
    .line 512
    move-object/from16 v2, v17

    .line 513
    .line 514
    :cond_13
    const-string v3, "script_plugin_agent_mcp_endpoint"

    .line 515
    .line 516
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 517
    .line 518
    .line 519
    move-result-object v1

    .line 520
    if-eqz v5, :cond_14

    .line 521
    .line 522
    iget-object v2, v5, Lfb/r0;->e:Ljava/lang/String;

    .line 523
    .line 524
    goto :goto_f

    .line 525
    :cond_14
    const/4 v2, 0x0

    .line 526
    :goto_f
    if-nez v2, :cond_15

    .line 527
    .line 528
    move-object/from16 v6, v17

    .line 529
    .line 530
    goto :goto_10

    .line 531
    :cond_15
    move-object v6, v2

    .line 532
    :goto_10
    const-string v2, "script_plugin_agent_mcp_authorization"

    .line 533
    .line 534
    invoke-interface {v1, v2, v6}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 535
    .line 536
    .line 537
    move-result-object v1

    .line 538
    const-string v2, "script_plugin_agent_auto_compact"

    .line 539
    .line 540
    iget-boolean v3, v0, Lfb/v;->f:Z

    .line 541
    .line 542
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 543
    .line 544
    .line 545
    move-result-object v1

    .line 546
    const-string v2, "script_plugin_agent_compact_token_threshold"

    .line 547
    .line 548
    iget v3, v0, Lfb/v;->g:I

    .line 549
    .line 550
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 551
    .line 552
    .line 553
    move-result-object v1

    .line 554
    const-string v2, "script_plugin_agent_web_search_enabled"

    .line 555
    .line 556
    iget-boolean v3, v0, Lfb/v;->h:Z

    .line 557
    .line 558
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    const-string v2, "script_plugin_agent_workspace_write_approval"

    .line 563
    .line 564
    iget-object v0, v0, Lfb/v;->i:Ljava/lang/String;

    .line 565
    .line 566
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 571
    .line 572
    .line 573
    return-void
.end method


# virtual methods
.method public lookup(Ljava/lang/String;)Ljava/util/List;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget v0, v1, Lfb/w;->a:I

    .line 6
    .line 7
    const/16 v3, 0x2e

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v6, Ltf/t;->g:Ltf/t;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    :try_start_0
    sget-object v0, Lokhttp3/Dns;->SYSTEM:Lokhttp3/Dns;

    .line 20
    .line 21
    invoke-interface {v0, v2}, Lokhttp3/Dns;->lookup(Ljava/lang/String;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    move-object v8, v0

    .line 26
    const/4 v9, 0x0

    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception v0

    .line 29
    move-object v9, v0

    .line 30
    move-object v8, v6

    .line 31
    :goto_0
    sget-object v0, Lfb/h2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 32
    .line 33
    new-instance v0, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v10

    .line 42
    :cond_0
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v11

    .line 46
    if-eqz v11, :cond_1

    .line 47
    .line 48
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v11

    .line 52
    move-object v12, v11

    .line 53
    check-cast v12, Ljava/net/InetAddress;

    .line 54
    .line 55
    invoke-static {v12}, Lfb/h2;->i(Ljava/net/InetAddress;)Z

    .line 56
    .line 57
    .line 58
    move-result v12

    .line 59
    if-nez v12, :cond_0

    .line 60
    .line 61
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    if-nez v10, :cond_2

    .line 70
    .line 71
    goto/16 :goto_15

    .line 72
    .line 73
    :cond_2
    sget-object v0, Lfb/h2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 74
    .line 75
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-string v10, "["

    .line 84
    .line 85
    invoke-static {v0, v10}, Log/m;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const-string v10, "]"

    .line 90
    .line 91
    invoke-static {v0, v10}, Log/m;->B0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const/16 v10, 0x3a

    .line 96
    .line 97
    invoke-static {v0, v10}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 98
    .line 99
    .line 100
    move-result v10

    .line 101
    if-nez v10, :cond_4

    .line 102
    .line 103
    sget-object v10, Lfb/h2;->f:Log/k;

    .line 104
    .line 105
    invoke-virtual {v10, v0}, Log/k;->d(Ljava/lang/String;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_3

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_3
    move v0, v4

    .line 113
    goto :goto_3

    .line 114
    :cond_4
    :goto_2
    move v0, v5

    .line 115
    :goto_3
    const-string v10, ""

    .line 116
    .line 117
    if-eqz v0, :cond_5

    .line 118
    .line 119
    move-object v11, v6

    .line 120
    goto :goto_7

    .line 121
    :cond_5
    new-instance v11, Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v12

    .line 130
    :cond_6
    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v13

    .line 134
    if-eqz v13, :cond_a

    .line 135
    .line 136
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v13

    .line 140
    move-object v14, v13

    .line 141
    check-cast v14, Ljava/net/InetAddress;

    .line 142
    .line 143
    invoke-virtual {v14}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v14

    .line 147
    if-nez v14, :cond_7

    .line 148
    .line 149
    move-object v14, v10

    .line 150
    :cond_7
    const/16 v15, 0x25

    .line 151
    .line 152
    invoke-static {v14, v15}, Log/m;->M0(Ljava/lang/String;C)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v14

    .line 156
    sget-object v15, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 157
    .line 158
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v14, v15}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v14

    .line 165
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    const-string v15, "."

    .line 169
    .line 170
    invoke-static {v14, v15}, Log/m;->B0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v14

    .line 174
    const-string v15, "fdfe:dcba:9876::"

    .line 175
    .line 176
    invoke-virtual {v14, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v15

    .line 180
    if-nez v15, :cond_9

    .line 181
    .line 182
    const-string v15, "fdfe:dcba:9876:"

    .line 183
    .line 184
    invoke-static {v14, v15, v4}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 185
    .line 186
    .line 187
    move-result v14

    .line 188
    if-eqz v14, :cond_8

    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_8
    move v14, v4

    .line 192
    goto :goto_6

    .line 193
    :cond_9
    :goto_5
    move v14, v5

    .line 194
    :goto_6
    if-eqz v14, :cond_6

    .line 195
    .line 196
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_a
    :goto_7
    if-nez v0, :cond_b

    .line 201
    .line 202
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-nez v0, :cond_c

    .line 207
    .line 208
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-nez v0, :cond_b

    .line 213
    .line 214
    goto :goto_8

    .line 215
    :cond_b
    move-object/from16 v16, v8

    .line 216
    .line 217
    goto/16 :goto_14

    .line 218
    .line 219
    :cond_c
    :goto_8
    sget-object v0, Lfb/h2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 220
    .line 221
    const-string v0, "type"

    .line 222
    .line 223
    new-array v12, v5, [C

    .line 224
    .line 225
    aput-char v3, v12, v4

    .line 226
    .line 227
    invoke-static {v2, v12}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    sget-object v12, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 232
    .line 233
    invoke-static {v12, v3, v12}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 238
    .line 239
    .line 240
    move-result-wide v12

    .line 241
    sget-object v14, Lfb/h2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 242
    .line 243
    invoke-virtual {v14, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v15

    .line 247
    check-cast v15, Lfb/b2;

    .line 248
    .line 249
    move-object/from16 v16, v8

    .line 250
    .line 251
    if-eqz v15, :cond_e

    .line 252
    .line 253
    iget-wide v7, v15, Lfb/b2;->b:J

    .line 254
    .line 255
    cmp-long v7, v7, v12

    .line 256
    .line 257
    if-lez v7, :cond_d

    .line 258
    .line 259
    goto :goto_9

    .line 260
    :cond_d
    const/4 v15, 0x0

    .line 261
    :goto_9
    if-eqz v15, :cond_e

    .line 262
    .line 263
    iget-object v0, v15, Lfb/b2;->a:Ljava/util/List;

    .line 264
    .line 265
    goto/16 :goto_13

    .line 266
    .line 267
    :cond_e
    :try_start_1
    const-string v7, "https://cloudflare-dns.com/dns-query"

    .line 268
    .line 269
    invoke-static {v7}, Lfb/h2;->r(Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v7}, Lokhttp3/HttpUrl;->newBuilder()Lokhttp3/HttpUrl$Builder;

    .line 277
    .line 278
    .line 279
    move-result-object v7

    .line 280
    const-string v8, "name"

    .line 281
    .line 282
    invoke-virtual {v7, v8, v3}, Lokhttp3/HttpUrl$Builder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 283
    .line 284
    .line 285
    move-result-object v7

    .line 286
    const-string v8, "A"

    .line 287
    .line 288
    invoke-virtual {v7, v0, v8}, Lokhttp3/HttpUrl$Builder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 289
    .line 290
    .line 291
    move-result-object v7

    .line 292
    invoke-virtual {v7}, Lokhttp3/HttpUrl$Builder;->build()Lokhttp3/HttpUrl;

    .line 293
    .line 294
    .line 295
    move-result-object v7

    .line 296
    new-instance v8, Lokhttp3/Request$Builder;

    .line 297
    .line 298
    invoke-direct {v8}, Lokhttp3/Request$Builder;-><init>()V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v8, v7}, Lokhttp3/Request$Builder;->url(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;

    .line 302
    .line 303
    .line 304
    move-result-object v7

    .line 305
    const-string v8, "Accept"

    .line 306
    .line 307
    const-string v15, "application/dns-json"

    .line 308
    .line 309
    invoke-virtual {v7, v8, v15}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 310
    .line 311
    .line 312
    move-result-object v7

    .line 313
    const-string v8, "User-Agent"

    .line 314
    .line 315
    const-string v15, "Mozilla/5.0 (Linux; Android 14) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Mobile Safari/537.36 Hchat-Plugin-Agent/1.1"

    .line 316
    .line 317
    invoke-virtual {v7, v8, v15}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 318
    .line 319
    .line 320
    move-result-object v7

    .line 321
    invoke-virtual {v7}, Lokhttp3/Request$Builder;->get()Lokhttp3/Request$Builder;

    .line 322
    .line 323
    .line 324
    move-result-object v7

    .line 325
    invoke-virtual {v7}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 326
    .line 327
    .line 328
    move-result-object v7

    .line 329
    sget-object v8, Lfb/h2;->c:Lsf/i;

    .line 330
    .line 331
    invoke-virtual {v8}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v8

    .line 335
    check-cast v8, Lokhttp3/OkHttpClient;

    .line 336
    .line 337
    invoke-virtual {v8, v7}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 338
    .line 339
    .line 340
    move-result-object v7

    .line 341
    invoke-interface {v7}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 342
    .line 343
    .line 344
    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 345
    :try_start_2
    invoke-virtual {v7}, Lokhttp3/Response;->isSuccessful()Z

    .line 346
    .line 347
    .line 348
    move-result v8

    .line 349
    if-nez v8, :cond_10

    .line 350
    .line 351
    :cond_f
    :goto_a
    move-object v5, v6

    .line 352
    goto/16 :goto_e

    .line 353
    .line 354
    :cond_10
    invoke-virtual {v7}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 355
    .line 356
    .line 357
    move-result-object v8

    .line 358
    if-eqz v8, :cond_f

    .line 359
    .line 360
    invoke-virtual {v8}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v8

    .line 364
    if-eqz v8, :cond_f

    .line 365
    .line 366
    new-instance v15, Lorg/json/JSONObject;

    .line 367
    .line 368
    invoke-direct {v15, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    const-string v8, "Status"

    .line 372
    .line 373
    const/4 v5, -0x1

    .line 374
    invoke-virtual {v15, v8, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 375
    .line 376
    .line 377
    move-result v5

    .line 378
    if-eqz v5, :cond_11

    .line 379
    .line 380
    goto :goto_a

    .line 381
    :cond_11
    const-string v5, "Answer"

    .line 382
    .line 383
    invoke-virtual {v15, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 384
    .line 385
    .line 386
    move-result-object v5

    .line 387
    if-eqz v5, :cond_f

    .line 388
    .line 389
    invoke-static {}, La/a;->E()Luf/c;

    .line 390
    .line 391
    .line 392
    move-result-object v8

    .line 393
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    .line 394
    .line 395
    .line 396
    move-result v15

    .line 397
    :goto_b
    if-lt v4, v15, :cond_13

    .line 398
    .line 399
    invoke-static {v8}, La/a;->t(Luf/c;)Luf/c;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    new-instance v4, Ljava/util/HashSet;

    .line 404
    .line 405
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 406
    .line 407
    .line 408
    new-instance v5, Ljava/util/ArrayList;

    .line 409
    .line 410
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 411
    .line 412
    .line 413
    const/4 v8, 0x0

    .line 414
    invoke-virtual {v0, v8}, Luf/c;->listIterator(I)Ljava/util/ListIterator;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    :cond_12
    :goto_c
    move-object v8, v0

    .line 419
    check-cast v8, Luf/a;

    .line 420
    .line 421
    invoke-virtual {v8}, Luf/a;->hasNext()Z

    .line 422
    .line 423
    .line 424
    move-result v10

    .line 425
    if-eqz v10, :cond_18

    .line 426
    .line 427
    invoke-virtual {v8}, Luf/a;->next()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v8

    .line 431
    move-object v10, v8

    .line 432
    check-cast v10, Ljava/net/InetAddress;

    .line 433
    .line 434
    invoke-virtual {v10}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v10

    .line 438
    invoke-virtual {v4, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    move-result v10

    .line 442
    if-eqz v10, :cond_12

    .line 443
    .line 444
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    goto :goto_c

    .line 448
    :catchall_0
    move-exception v0

    .line 449
    move-object v1, v0

    .line 450
    goto :goto_f

    .line 451
    :cond_13
    invoke-virtual {v5, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    if-eqz v1, :cond_16

    .line 456
    .line 457
    move/from16 v18, v4

    .line 458
    .line 459
    move-object/from16 v19, v5

    .line 460
    .line 461
    const/4 v4, 0x0

    .line 462
    invoke-virtual {v1, v0, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 463
    .line 464
    .line 465
    move-result v5

    .line 466
    const/4 v4, 0x1

    .line 467
    if-eq v5, v4, :cond_14

    .line 468
    .line 469
    goto :goto_d

    .line 470
    :cond_14
    const-string v4, "data"

    .line 471
    .line 472
    invoke-virtual {v1, v4, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    sget-object v4, Lfb/h2;->f:Log/k;

    .line 488
    .line 489
    invoke-virtual {v4, v1}, Log/k;->d(Ljava/lang/String;)Z

    .line 490
    .line 491
    .line 492
    move-result v4

    .line 493
    if-nez v4, :cond_15

    .line 494
    .line 495
    goto :goto_d

    .line 496
    :cond_15
    invoke-static {v1}, Lfb/h2;->k(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 497
    .line 498
    .line 499
    move-result-object v1

    .line 500
    if-eqz v1, :cond_17

    .line 501
    .line 502
    invoke-static {v1}, Lfb/h2;->i(Ljava/net/InetAddress;)Z

    .line 503
    .line 504
    .line 505
    move-result v4

    .line 506
    if-nez v4, :cond_17

    .line 507
    .line 508
    invoke-virtual {v8, v1}, Luf/c;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 509
    .line 510
    .line 511
    goto :goto_d

    .line 512
    :cond_16
    move/from16 v18, v4

    .line 513
    .line 514
    move-object/from16 v19, v5

    .line 515
    .line 516
    :cond_17
    :goto_d
    add-int/lit8 v4, v18, 0x1

    .line 517
    .line 518
    move-object/from16 v1, p0

    .line 519
    .line 520
    move-object/from16 v5, v19

    .line 521
    .line 522
    goto :goto_b

    .line 523
    :cond_18
    :goto_e
    :try_start_3
    invoke-interface {v7}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 524
    .line 525
    .line 526
    goto :goto_11

    .line 527
    :catchall_1
    move-exception v0

    .line 528
    goto :goto_10

    .line 529
    :goto_f
    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 530
    :catchall_2
    move-exception v0

    .line 531
    :try_start_5
    invoke-static {v7, v1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 532
    .line 533
    .line 534
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 535
    :goto_10
    new-instance v5, Lsf/f;

    .line 536
    .line 537
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 538
    .line 539
    .line 540
    :goto_11
    instance-of v0, v5, Lsf/f;

    .line 541
    .line 542
    if-eqz v0, :cond_19

    .line 543
    .line 544
    goto :goto_12

    .line 545
    :cond_19
    move-object v6, v5

    .line 546
    :goto_12
    check-cast v6, Ljava/util/List;

    .line 547
    .line 548
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    if-nez v0, :cond_1a

    .line 553
    .line 554
    new-instance v0, Lfb/b2;

    .line 555
    .line 556
    const-wide/32 v4, 0x493e0

    .line 557
    .line 558
    .line 559
    add-long/2addr v12, v4

    .line 560
    invoke-direct {v0, v6, v12, v13}, Lfb/b2;-><init>(Ljava/util/List;J)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v14, v3, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    :cond_1a
    move-object v0, v6

    .line 567
    :goto_13
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 568
    .line 569
    .line 570
    move-result v1

    .line 571
    if-nez v1, :cond_1b

    .line 572
    .line 573
    goto :goto_15

    .line 574
    :cond_1b
    :goto_14
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 575
    .line 576
    .line 577
    move-result v0

    .line 578
    if-nez v0, :cond_1c

    .line 579
    .line 580
    move-object v0, v11

    .line 581
    :goto_15
    return-object v0

    .line 582
    :cond_1c
    sget-object v0, Lfb/h2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 583
    .line 584
    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    :cond_1d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 589
    .line 590
    .line 591
    move-result v1

    .line 592
    if-eqz v1, :cond_1e

    .line 593
    .line 594
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v1

    .line 598
    move-object v3, v1

    .line 599
    check-cast v3, Ljava/net/InetAddress;

    .line 600
    .line 601
    invoke-static {v3}, Lfb/h2;->i(Ljava/net/InetAddress;)Z

    .line 602
    .line 603
    .line 604
    move-result v3

    .line 605
    if-eqz v3, :cond_1d

    .line 606
    .line 607
    move-object v7, v1

    .line 608
    goto :goto_16

    .line 609
    :cond_1e
    const/4 v7, 0x0

    .line 610
    :goto_16
    check-cast v7, Ljava/net/InetAddress;

    .line 611
    .line 612
    if-nez v7, :cond_20

    .line 613
    .line 614
    if-eqz v9, :cond_1f

    .line 615
    .line 616
    goto :goto_17

    .line 617
    :cond_1f
    new-instance v9, Ljava/net/UnknownHostException;

    .line 618
    .line 619
    const-string v0, "\u57df\u540d\u89e3\u6790\u5931\u8d25: "

    .line 620
    .line 621
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    invoke-direct {v9, v0}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 626
    .line 627
    .line 628
    :goto_17
    throw v9

    .line 629
    :cond_20
    new-instance v0, Ljava/net/UnknownHostException;

    .line 630
    .line 631
    invoke-virtual {v7}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    move-result-object v1

    .line 635
    const-string v2, "\u62d2\u7edd\u8bbf\u95ee\u5185\u7f51\u5730\u5740: "

    .line 636
    .line 637
    invoke-static {v2, v1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v1

    .line 641
    invoke-direct {v0, v1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 642
    .line 643
    .line 644
    throw v0

    .line 645
    :pswitch_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    const/4 v4, 0x1

    .line 649
    new-array v0, v4, [C

    .line 650
    .line 651
    const/16 v17, 0x0

    .line 652
    .line 653
    aput-char v3, v0, v17

    .line 654
    .line 655
    invoke-static {v2, v0}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    const-string v1, "cloudflare-dns.com"

    .line 660
    .line 661
    invoke-static {v0, v1}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 662
    .line 663
    .line 664
    move-result v0

    .line 665
    if-eqz v0, :cond_21

    .line 666
    .line 667
    const/4 v0, 0x4

    .line 668
    new-array v1, v0, [B

    .line 669
    .line 670
    fill-array-data v1, :array_0

    .line 671
    .line 672
    .line 673
    invoke-static {v1}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 674
    .line 675
    .line 676
    move-result-object v1

    .line 677
    new-array v0, v0, [B

    .line 678
    .line 679
    fill-array-data v0, :array_1

    .line 680
    .line 681
    .line 682
    invoke-static {v0}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    filled-new-array {v1, v0}, [Ljava/net/InetAddress;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    goto :goto_18

    .line 695
    :cond_21
    sget-object v0, Lokhttp3/Dns;->SYSTEM:Lokhttp3/Dns;

    .line 696
    .line 697
    invoke-interface {v0, v2}, Lokhttp3/Dns;->lookup(Ljava/lang/String;)Ljava/util/List;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    :goto_18
    return-object v0

    .line 702
    nop

    .line 703
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch

    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    :array_0
    .array-data 1
        0x1t
        0x1t
        0x1t
        0x1t
    .end array-data

    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    :array_1
    .array-data 1
        0x1t
        0x0t
        0x0t
        0x1t
    .end array-data
.end method
