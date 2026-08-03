.class public abstract Lg4/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public static A(Ljava/util/ArrayList;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x6

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lnc/a;

    .line 15
    .line 16
    iget v0, p0, Lnc/a;->g:I

    .line 17
    .line 18
    const/16 v1, 0x10

    .line 19
    .line 20
    if-eq v0, v1, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object p0, p0, Lnc/a;->h:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lqc/d;

    .line 26
    .line 27
    invoke-virtual {p0}, Lqc/d;->b()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    const/4 v1, 0x5

    .line 32
    if-eq v0, v1, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-virtual {p0}, Lqc/d;->a()Ljf/h;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget-object v0, p0, Ljf/h;->c:Ljava/lang/String;

    .line 40
    .line 41
    const-string v1, "Ljava/lang/invoke/LambdaMetafactory;"

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_3

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    iget-object p0, p0, Ljf/h;->b:Ljava/lang/String;

    .line 51
    .line 52
    const-string v0, "metafactory"

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_5

    .line 59
    .line 60
    const-string v0, "altMetafactory"

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_4

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_4
    :goto_0
    return v2

    .line 70
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 71
    return p0
.end method

.method public static final B(Ljava/lang/Object;)J
    .locals 10

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    if-eqz p0, :cond_5

    .line 4
    .line 5
    const-string v2, "localId"

    .line 6
    .line 7
    const-string v3, "id"

    .line 8
    .line 9
    const-string v4, "field_localId"

    .line 10
    .line 11
    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    :goto_0
    const/4 v5, 0x3

    .line 18
    if-lt v4, v5, :cond_0

    .line 19
    .line 20
    return-wide v0

    .line 21
    :cond_0
    aget-object v5, v2, v4

    .line 22
    .line 23
    invoke-static {p0, v5}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    instance-of v6, v5, Ljava/lang/Number;

    .line 28
    .line 29
    const/4 v7, 0x0

    .line 30
    if-eqz v6, :cond_1

    .line 31
    .line 32
    check-cast v5, Ljava/lang/Number;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move-object v5, v7

    .line 36
    :goto_1
    if-eqz v5, :cond_4

    .line 37
    .line 38
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 39
    .line 40
    .line 41
    move-result-wide v5

    .line 42
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 47
    .line 48
    .line 49
    move-result-wide v8

    .line 50
    cmp-long v6, v8, v0

    .line 51
    .line 52
    if-lez v6, :cond_2

    .line 53
    .line 54
    const/4 v6, 0x1

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    move v6, v3

    .line 57
    :goto_2
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eqz v6, :cond_3

    .line 66
    .line 67
    move-object v7, v5

    .line 68
    :cond_3
    if-eqz v7, :cond_4

    .line 69
    .line 70
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 71
    .line 72
    .line 73
    move-result-wide v0

    .line 74
    return-wide v0

    .line 75
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_5
    return-wide v0
.end method

.method public static C(Ljava/lang/String;)Ljava/util/List;
    .locals 13

    .line 1
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 2
    .line 3
    if-eqz p0, :cond_6

    .line 4
    .line 5
    :try_start_0
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_6

    .line 12
    .line 13
    :cond_0
    new-instance v0, Lorg/json/JSONArray;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    const/4 v3, 0x0

    .line 28
    move v4, v3

    .line 29
    :goto_0
    if-lt v4, v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    check-cast p0, Ljava/lang/Iterable;

    .line 39
    .line 40
    invoke-static {p0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    goto :goto_4

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    move-object p0, v0

    .line 47
    goto :goto_3

    .line 48
    :cond_1
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    if-eqz v5, :cond_4

    .line 53
    .line 54
    const-string v6, "targetId"

    .line 55
    .line 56
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_2

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_2
    const-string v6, "label"

    .line 79
    .line 80
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-eqz v7, :cond_3

    .line 89
    .line 90
    move-object v10, v8

    .line 91
    goto :goto_1

    .line 92
    :cond_3
    move-object v10, v6

    .line 93
    :goto_1
    const-string v6, "enabled"

    .line 94
    .line 95
    invoke-virtual {v5, v6, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 96
    .line 97
    .line 98
    move-result v12

    .line 99
    const-string v6, "templateId"

    .line 100
    .line 101
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    new-instance v7, Lua/h;

    .line 109
    .line 110
    move-object v9, v8

    .line 111
    invoke-direct/range {v7 .. v12}, Lua/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 112
    .line 113
    .line 114
    invoke-interface {p0, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    .line 116
    .line 117
    :cond_4
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :goto_3
    new-instance v0, Lsf/f;

    .line 121
    .line 122
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    move-object p0, v0

    .line 126
    :goto_4
    nop

    .line 127
    instance-of v0, p0, Lsf/f;

    .line 128
    .line 129
    if-eqz v0, :cond_5

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_5
    move-object v1, p0

    .line 133
    :goto_5
    check-cast v1, Ljava/util/List;

    .line 134
    .line 135
    :cond_6
    :goto_6
    return-object v1
.end method

.method public static D(Ljava/lang/String;Lorg/json/JSONObject;)Lua/i;
    .locals 42

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "notifyText"

    .line 4
    .line 5
    const-string v2, "\u5df2\u6536\u6b3e {amount} \u5143"

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "id"

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :cond_0
    move-object v4, v2

    .line 32
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const-string v2, "name"

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    move-object/from16 v5, p0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move-object v5, v2

    .line 51
    :goto_0
    const-string v2, "enabled"

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    const-string v2, "delayMode"

    .line 59
    .line 60
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    const-string v2, "delayMs"

    .line 65
    .line 66
    const-wide/16 v8, 0x0

    .line 67
    .line 68
    invoke-virtual {v0, v2, v8, v9}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 69
    .line 70
    .line 71
    move-result-wide v10

    .line 72
    const-string v2, "randomMinMs"

    .line 73
    .line 74
    invoke-virtual {v0, v2, v8, v9}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 75
    .line 76
    .line 77
    move-result-wide v12

    .line 78
    const-string v2, "randomMaxMs"

    .line 79
    .line 80
    invoke-virtual {v0, v2, v8, v9}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 81
    .line 82
    .line 83
    move-result-wide v8

    .line 84
    const-string v2, "receiveAccount"

    .line 85
    .line 86
    const-string v14, "default"

    .line 87
    .line 88
    invoke-virtual {v0, v2, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v14

    .line 92
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    const-string v2, "listMode"

    .line 96
    .line 97
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 98
    .line 99
    .line 100
    move-result v15

    .line 101
    const-string v2, "whitelist"

    .line 102
    .line 103
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v16

    .line 107
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    const-string v2, "blacklist"

    .line 111
    .line 112
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v17

    .line 116
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    const-string v2, "amountEnabled"

    .line 120
    .line 121
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 122
    .line 123
    .line 124
    move-result v18

    .line 125
    const-string v2, "amountCondition"

    .line 126
    .line 127
    const/4 v3, 0x1

    .line 128
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 129
    .line 130
    .line 131
    move-result v19

    .line 132
    const-string v2, "amountValue"

    .line 133
    .line 134
    const-string v3, "0"

    .line 135
    .line 136
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v20

    .line 140
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    const-string v2, "amountAction"

    .line 144
    .line 145
    const/4 v3, 0x0

    .line 146
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 147
    .line 148
    .line 149
    move-result v21

    .line 150
    const-string v2, "keywordMode"

    .line 151
    .line 152
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 153
    .line 154
    .line 155
    move-result v22

    .line 156
    const-string v2, "keywords"

    .line 157
    .line 158
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v23

    .line 162
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    const-string v2, "quietEnabled"

    .line 166
    .line 167
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 168
    .line 169
    .line 170
    move-result v24

    .line 171
    const-string v2, "quietStartSecond"

    .line 172
    .line 173
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 174
    .line 175
    .line 176
    move-result v25

    .line 177
    const-string v2, "quietEndSecond"

    .line 178
    .line 179
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 180
    .line 181
    .line 182
    move-result v26

    .line 183
    const-string v2, "refundRejected"

    .line 184
    .line 185
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 186
    .line 187
    .line 188
    move-result v27

    .line 189
    const-string v2, "replySteps"

    .line 190
    .line 191
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    if-eqz v2, :cond_2

    .line 196
    .line 197
    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    goto :goto_1

    .line 202
    :cond_2
    const/4 v2, 0x0

    .line 203
    :goto_1
    invoke-static {v2}, La7/a;->J(Ljava/lang/String;)Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v28

    .line 207
    const-string v2, "notificationConfigured"

    .line 208
    .line 209
    const-string v3, "notifySystemEnabled"

    .line 210
    .line 211
    move-object/from16 v29, v4

    .line 212
    .line 213
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 214
    .line 215
    .line 216
    move-result v4

    .line 217
    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    const/4 v4, 0x0

    .line 222
    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 223
    .line 224
    .line 225
    move-result v30

    .line 226
    const-string v3, "notifyToastEnabled"

    .line 227
    .line 228
    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 229
    .line 230
    .line 231
    move-result v31

    .line 232
    const-string v3, "notifySoundEnabled"

    .line 233
    .line 234
    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 235
    .line 236
    .line 237
    move-result v32

    .line 238
    const-string v3, "notifySoundMode"

    .line 239
    .line 240
    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 241
    .line 242
    .line 243
    move-result v33

    .line 244
    const-string v3, "notifyVibrateEnabled"

    .line 245
    .line 246
    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 247
    .line 248
    .line 249
    move-result v34

    .line 250
    const-string v3, "notifySoundUri"

    .line 251
    .line 252
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v35

    .line 256
    invoke-virtual/range {v35 .. v35}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    const-string v3, "notifyToastText"

    .line 263
    .line 264
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v37

    .line 268
    invoke-virtual/range {v37 .. v37}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    const-string v3, "announceEnabled"

    .line 272
    .line 273
    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 274
    .line 275
    .line 276
    move-result v38

    .line 277
    const-string v3, "announceText"

    .line 278
    .line 279
    const-string v4, "\u6536\u5230\u8f6c\u8d26 {amount} \u5143"

    .line 280
    .line 281
    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v39

    .line 285
    invoke-virtual/range {v39 .. v39}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    new-instance v3, Lua/i;

    .line 289
    .line 290
    move-wide/from16 v40, v12

    .line 291
    .line 292
    move-wide v12, v8

    .line 293
    move-wide v8, v10

    .line 294
    move-wide/from16 v10, v40

    .line 295
    .line 296
    move-object/from16 v36, v1

    .line 297
    .line 298
    move-object/from16 v4, v29

    .line 299
    .line 300
    move/from16 v29, v2

    .line 301
    .line 302
    invoke-direct/range {v3 .. v39}, Lua/i;-><init>(Ljava/lang/String;Ljava/lang/String;ZIJJJLjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZILjava/lang/String;IILjava/lang/String;ZIIZLjava/util/List;ZZZZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 303
    .line 304
    .line 305
    return-object v3
.end method

.method public static E(Ljava/lang/String;)Ljava/util/List;
    .locals 8

    .line 1
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 2
    .line 3
    if-eqz p0, :cond_4

    .line 4
    .line 5
    :try_start_0
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_4

    .line 12
    :cond_0
    new-instance v1, Lorg/json/JSONArray;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, La/a;->E()Luf/c;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x0

    .line 26
    :goto_0
    if-lt v3, v2, :cond_1

    .line 27
    .line 28
    invoke-static {p0}, La/a;->t(Luf/c;)Luf/c;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    goto :goto_2

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    add-int/lit8 v5, v3, 0x1

    .line 42
    .line 43
    new-instance v6, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v7, "\u6a21\u677f "

    .line 49
    .line 50
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-static {v5, v4}, Lg4/a;->D(Ljava/lang/String;Lorg/json/JSONObject;)Lua/i;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {p0, v4}, Luf/c;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :goto_1
    new-instance v1, Lsf/f;

    .line 71
    .line 72
    invoke-direct {v1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    move-object p0, v1

    .line 76
    :goto_2
    nop

    .line 77
    instance-of v1, p0, Lsf/f;

    .line 78
    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_3
    move-object v0, p0

    .line 83
    :goto_3
    check-cast v0, Ljava/util/List;

    .line 84
    .line 85
    :cond_4
    :goto_4
    return-object v0
.end method

.method public static final F([F[FI[F)V
    .locals 16

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v1, "At least one point must be provided"

    .line 6
    .line 7
    invoke-static {v1}, Lu1/a;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v1, 0x2

    .line 11
    if-lt v1, v0, :cond_1

    .line 12
    .line 13
    add-int/lit8 v1, v0, -0x1

    .line 14
    .line 15
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 16
    .line 17
    new-array v3, v2, [[F

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    move v5, v4

    .line 21
    :goto_0
    if-ge v5, v2, :cond_2

    .line 22
    .line 23
    new-array v6, v0, [F

    .line 24
    .line 25
    aput-object v6, v3, v5

    .line 26
    .line 27
    add-int/lit8 v5, v5, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    move v5, v4

    .line 31
    :goto_1
    const/high16 v6, 0x3f800000    # 1.0f

    .line 32
    .line 33
    if-ge v5, v0, :cond_4

    .line 34
    .line 35
    aget-object v7, v3, v4

    .line 36
    .line 37
    aput v6, v7, v5

    .line 38
    .line 39
    const/4 v6, 0x1

    .line 40
    :goto_2
    if-ge v6, v2, :cond_3

    .line 41
    .line 42
    add-int/lit8 v7, v6, -0x1

    .line 43
    .line 44
    aget-object v7, v3, v7

    .line 45
    .line 46
    aget v7, v7, v5

    .line 47
    .line 48
    aget v8, p0, v5

    .line 49
    .line 50
    mul-float/2addr v7, v8

    .line 51
    aget-object v8, v3, v6

    .line 52
    .line 53
    aput v7, v8, v5

    .line 54
    .line 55
    add-int/lit8 v6, v6, 0x1

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    new-array v5, v2, [[F

    .line 62
    .line 63
    move v7, v4

    .line 64
    :goto_3
    if-ge v7, v2, :cond_5

    .line 65
    .line 66
    new-array v8, v0, [F

    .line 67
    .line 68
    aput-object v8, v5, v7

    .line 69
    .line 70
    add-int/lit8 v7, v7, 0x1

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_5
    new-array v7, v2, [[F

    .line 74
    .line 75
    move v8, v4

    .line 76
    :goto_4
    if-ge v8, v2, :cond_6

    .line 77
    .line 78
    new-array v9, v2, [F

    .line 79
    .line 80
    aput-object v9, v7, v8

    .line 81
    .line 82
    add-int/lit8 v8, v8, 0x1

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_6
    move v8, v4

    .line 86
    :goto_5
    if-ge v8, v2, :cond_d

    .line 87
    .line 88
    aget-object v9, v5, v8

    .line 89
    .line 90
    aget-object v10, v3, v8

    .line 91
    .line 92
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-static {v10, v4, v9, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 99
    .line 100
    .line 101
    move v10, v4

    .line 102
    :goto_6
    if-ge v10, v8, :cond_8

    .line 103
    .line 104
    aget-object v11, v5, v10

    .line 105
    .line 106
    invoke-static {v9, v11}, Lg4/a;->l([F[F)F

    .line 107
    .line 108
    .line 109
    move-result v12

    .line 110
    move v13, v4

    .line 111
    :goto_7
    if-ge v13, v0, :cond_7

    .line 112
    .line 113
    aget v14, v9, v13

    .line 114
    .line 115
    aget v15, v11, v13

    .line 116
    .line 117
    mul-float/2addr v15, v12

    .line 118
    sub-float/2addr v14, v15

    .line 119
    aput v14, v9, v13

    .line 120
    .line 121
    add-int/lit8 v13, v13, 0x1

    .line 122
    .line 123
    goto :goto_7

    .line 124
    :cond_7
    add-int/lit8 v10, v10, 0x1

    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_8
    invoke-static {v9, v9}, Lg4/a;->l([F[F)F

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    float-to-double v10, v10

    .line 132
    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    .line 133
    .line 134
    .line 135
    move-result-wide v10

    .line 136
    double-to-float v10, v10

    .line 137
    const v11, 0x358637bd    # 1.0E-6f

    .line 138
    .line 139
    .line 140
    cmpg-float v12, v10, v11

    .line 141
    .line 142
    if-gez v12, :cond_9

    .line 143
    .line 144
    move v10, v11

    .line 145
    :cond_9
    div-float v10, v6, v10

    .line 146
    .line 147
    move v11, v4

    .line 148
    :goto_8
    if-ge v11, v0, :cond_a

    .line 149
    .line 150
    aget v12, v9, v11

    .line 151
    .line 152
    mul-float/2addr v12, v10

    .line 153
    aput v12, v9, v11

    .line 154
    .line 155
    add-int/lit8 v11, v11, 0x1

    .line 156
    .line 157
    goto :goto_8

    .line 158
    :cond_a
    aget-object v10, v7, v8

    .line 159
    .line 160
    move v11, v4

    .line 161
    :goto_9
    if-ge v11, v2, :cond_c

    .line 162
    .line 163
    if-ge v11, v8, :cond_b

    .line 164
    .line 165
    const/4 v12, 0x0

    .line 166
    goto :goto_a

    .line 167
    :cond_b
    aget-object v12, v3, v11

    .line 168
    .line 169
    invoke-static {v9, v12}, Lg4/a;->l([F[F)F

    .line 170
    .line 171
    .line 172
    move-result v12

    .line 173
    :goto_a
    aput v12, v10, v11

    .line 174
    .line 175
    add-int/lit8 v11, v11, 0x1

    .line 176
    .line 177
    goto :goto_9

    .line 178
    :cond_c
    add-int/lit8 v8, v8, 0x1

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_d
    move v0, v1

    .line 182
    :goto_b
    const/4 v2, -0x1

    .line 183
    if-ge v2, v0, :cond_f

    .line 184
    .line 185
    aget-object v2, v5, v0

    .line 186
    .line 187
    move-object/from16 v3, p1

    .line 188
    .line 189
    invoke-static {v2, v3}, Lg4/a;->l([F[F)F

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    aget-object v4, v7, v0

    .line 194
    .line 195
    add-int/lit8 v6, v0, 0x1

    .line 196
    .line 197
    if-gt v6, v1, :cond_e

    .line 198
    .line 199
    move v8, v1

    .line 200
    :goto_c
    aget v9, v4, v8

    .line 201
    .line 202
    aget v10, p3, v8

    .line 203
    .line 204
    mul-float/2addr v9, v10

    .line 205
    sub-float/2addr v2, v9

    .line 206
    if-eq v8, v6, :cond_e

    .line 207
    .line 208
    add-int/lit8 v8, v8, -0x1

    .line 209
    .line 210
    goto :goto_c

    .line 211
    :cond_e
    aget v4, v4, v0

    .line 212
    .line 213
    div-float/2addr v2, v4

    .line 214
    aput v2, p3, v0

    .line 215
    .line 216
    add-int/lit8 v0, v0, -0x1

    .line 217
    .line 218
    goto :goto_b

    .line 219
    :cond_f
    return-void
.end method

.method public static final G(Ljava/io/InputStream;)[B
    .locals 3

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    const/16 v1, 0x2000

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v0}, Lg4/a;->j(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    return-object p0
.end method

.method public static H(Ljava/lang/Object;Ljava/util/LinkedHashSet;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_5

    .line 8
    .line 9
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    filled-new-array {v2}, [Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    invoke-static {v4}, Ltf/y;->a0(I)I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-direct {v3, v5}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3}, Ltf/l;->J0([Ljava/lang/Object;Ljava/util/LinkedHashSet;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    :goto_0
    if-eqz v2, :cond_4

    .line 41
    .line 42
    const-class v5, Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-nez v5, :cond_4

    .line 49
    .line 50
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    :cond_1
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v6, :cond_3

    .line 63
    .line 64
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    check-cast v6, Ljava/lang/reflect/Field;

    .line 69
    .line 70
    invoke-static {v6, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    if-eqz v6, :cond_1

    .line 75
    .line 76
    instance-of v7, v6, Landroid/widget/ListView;

    .line 77
    .line 78
    if-eqz v7, :cond_2

    .line 79
    .line 80
    check-cast v6, Landroid/widget/ListView;

    .line 81
    .line 82
    invoke-virtual {v6}, Landroid/widget/ListView;->getHeaderViewsCount()I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    const-string v7, "com.tencent.mm.plugin.fav.ui.adapter."

    .line 95
    .line 96
    invoke-static {v7, v6, v1}, Leh/a;->z(Ljava/lang/String;Ljava/lang/Object;Z)Z

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-eqz v7, :cond_1

    .line 101
    .line 102
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    goto :goto_0

    .line 111
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_e

    .line 120
    .line 121
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    new-instance v5, Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    :cond_6
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    if-eqz v6, :cond_7

    .line 147
    .line 148
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    move-object v7, v6

    .line 153
    check-cast v7, Ljava/lang/reflect/Method;

    .line 154
    .line 155
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 156
    .line 157
    .line 158
    move-result v8

    .line 159
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    if-nez v8, :cond_6

    .line 164
    .line 165
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    array-length v8, v8

    .line 170
    if-ne v8, v4, :cond_6

    .line 171
    .line 172
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    aget-object v8, v8, v1

    .line 177
    .line 178
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 179
    .line 180
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v8

    .line 184
    if-eqz v8, :cond_6

    .line 185
    .line 186
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    move-result-object v8

    .line 190
    sget-object v9, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 191
    .line 192
    invoke-static {v8, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v8

    .line 196
    if-nez v8, :cond_6

    .line 197
    .line 198
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    invoke-virtual {v7}, Ljava/lang/Class;->isPrimitive()Z

    .line 203
    .line 204
    .line 205
    move-result v7

    .line 206
    if-nez v7, :cond_6

    .line 207
    .line 208
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_7
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 217
    .line 218
    .line 219
    move-result v6

    .line 220
    if-eqz v6, :cond_5

    .line 221
    .line 222
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    check-cast v6, Ljava/lang/Number;

    .line 227
    .line 228
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 229
    .line 230
    .line 231
    move-result v6

    .line 232
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    :cond_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 237
    .line 238
    .line 239
    move-result v8

    .line 240
    if-eqz v8, :cond_8

    .line 241
    .line 242
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v8

    .line 246
    check-cast v8, Ljava/lang/Number;

    .line 247
    .line 248
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 249
    .line 250
    .line 251
    move-result v8

    .line 252
    sub-int v8, v6, v8

    .line 253
    .line 254
    add-int/lit8 v9, v8, -0x1

    .line 255
    .line 256
    add-int/lit8 v10, v6, -0x1

    .line 257
    .line 258
    filled-new-array {v9, v8, v10, v6}, [I

    .line 259
    .line 260
    .line 261
    move-result-object v8

    .line 262
    new-instance v9, Ljava/util/LinkedHashSet;

    .line 263
    .line 264
    const/4 v10, 0x4

    .line 265
    invoke-static {v10}, Ltf/y;->a0(I)I

    .line 266
    .line 267
    .line 268
    move-result v11

    .line 269
    invoke-direct {v9, v11}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 270
    .line 271
    .line 272
    move v11, v1

    .line 273
    :goto_3
    if-ge v11, v10, :cond_a

    .line 274
    .line 275
    aget v12, v8, v11

    .line 276
    .line 277
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 278
    .line 279
    .line 280
    move-result-object v12

    .line 281
    invoke-interface {v9, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    add-int/lit8 v11, v11, 0x1

    .line 285
    .line 286
    goto :goto_3

    .line 287
    :cond_a
    invoke-static {v9}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 288
    .line 289
    .line 290
    move-result-object v8

    .line 291
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 292
    .line 293
    .line 294
    move-result-object v8

    .line 295
    :cond_b
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 296
    .line 297
    .line 298
    move-result v9

    .line 299
    if-eqz v9, :cond_9

    .line 300
    .line 301
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v9

    .line 305
    check-cast v9, Ljava/lang/Number;

    .line 306
    .line 307
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 308
    .line 309
    .line 310
    move-result v9

    .line 311
    if-gez v9, :cond_c

    .line 312
    .line 313
    goto :goto_4

    .line 314
    :cond_c
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 315
    .line 316
    .line 317
    move-result-object v10

    .line 318
    :cond_d
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 319
    .line 320
    .line 321
    move-result v11

    .line 322
    if-eqz v11, :cond_b

    .line 323
    .line 324
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v11

    .line 328
    check-cast v11, Ljava/lang/reflect/Method;

    .line 329
    .line 330
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 331
    .line 332
    .line 333
    move-result-object v12

    .line 334
    filled-new-array {v12}, [Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v12

    .line 338
    invoke-static {v11, v0, v12}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v11

    .line 342
    invoke-static {v11}, Lg4/a;->z(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v12

    .line 346
    if-eqz v12, :cond_d

    .line 347
    .line 348
    return-object v11

    .line 349
    :cond_e
    :goto_5
    const/4 p0, 0x0

    .line 350
    return-object p0
.end method

.method public static I(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_17

    .line 3
    .line 4
    const/4 v1, 0x4

    .line 5
    if-gt p0, v1, :cond_17

    .line 6
    .line 7
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_7

    .line 14
    .line 15
    :cond_0
    invoke-static {p1}, Lg4/a;->z(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_1
    instance-of v1, p1, [Ljava/lang/Object;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    check-cast p1, [Ljava/lang/Object;

    .line 28
    .line 29
    array-length v1, p1

    .line 30
    :goto_0
    if-ge v2, v1, :cond_17

    .line 31
    .line 32
    aget-object v3, p1, v2

    .line 33
    .line 34
    add-int/lit8 v4, p0, 0x1

    .line 35
    .line 36
    invoke-static {v4, v3, p2}, Lg4/a;->I(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    return-object v3

    .line 43
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    instance-of v1, p1, Ljava/util/Collection;

    .line 47
    .line 48
    if-eqz v1, :cond_5

    .line 49
    .line 50
    check-cast p1, Ljava/lang/Iterable;

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_17

    .line 61
    .line 62
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    add-int/lit8 v2, p0, 0x1

    .line 67
    .line 68
    invoke-static {v2, v1, p2}, Lg4/a;->I(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-eqz v1, :cond_4

    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_5
    instance-of v1, p1, Landroid/view/View;

    .line 76
    .line 77
    if-eqz v1, :cond_6

    .line 78
    .line 79
    check-cast p1, Landroid/view/View;

    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    add-int/lit8 p0, p0, 0x1

    .line 86
    .line 87
    invoke-static {p0, p1, p2}, Lg4/a;->I(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0

    .line 92
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const-string v3, "java."

    .line 101
    .line 102
    invoke-static {v1, v3, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-nez v3, :cond_17

    .line 107
    .line 108
    const-string v3, "android."

    .line 109
    .line 110
    invoke-static {v1, v3, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_7

    .line 115
    .line 116
    goto/16 :goto_7

    .line 117
    .line 118
    :cond_7
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 119
    .line 120
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 121
    .line 122
    .line 123
    new-instance v3, Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    :goto_1
    const-class v5, Ljava/lang/Object;

    .line 133
    .line 134
    if-eqz v4, :cond_b

    .line 135
    .line 136
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    if-nez v6, :cond_b

    .line 141
    .line 142
    invoke-static {v4}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    :cond_8
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v6

    .line 154
    if-eqz v6, :cond_a

    .line 155
    .line 156
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    check-cast v6, Ljava/lang/reflect/Field;

    .line 161
    .line 162
    invoke-static {v6, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    if-eqz v6, :cond_8

    .line 167
    .line 168
    instance-of v7, v6, Ljava/lang/Number;

    .line 169
    .line 170
    if-eqz v7, :cond_9

    .line 171
    .line 172
    check-cast v6, Ljava/lang/Number;

    .line 173
    .line 174
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_9
    const-string v7, "com.tencent.mm.plugin.fav.ui."

    .line 187
    .line 188
    invoke-static {v7, v6, v2}, Leh/a;->z(Ljava/lang/String;Ljava/lang/Object;Z)Z

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    if-eqz v7, :cond_8

    .line 193
    .line 194
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_a
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    goto :goto_1

    .line 203
    :cond_b
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    :cond_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    if-eqz v3, :cond_d

    .line 212
    .line 213
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    invoke-static {v3, v1}, Lg4/a;->H(Ljava/lang/Object;Ljava/util/LinkedHashSet;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v3

    .line 221
    if-eqz v3, :cond_c

    .line 222
    .line 223
    move-object v0, v3

    .line 224
    :cond_d
    if-eqz v0, :cond_e

    .line 225
    .line 226
    return-object v0

    .line 227
    :cond_e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    :goto_3
    if-eqz v0, :cond_13

    .line 232
    .line 233
    invoke-virtual {v0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v1

    .line 237
    if-nez v1, :cond_13

    .line 238
    .line 239
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    :cond_f
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    if-eqz v2, :cond_12

    .line 252
    .line 253
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    check-cast v2, Ljava/lang/reflect/Field;

    .line 258
    .line 259
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    invoke-virtual {v3}, Ljava/lang/Class;->isPrimitive()Z

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    if-nez v3, :cond_f

    .line 268
    .line 269
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    const-class v4, Ljava/lang/String;

    .line 274
    .line 275
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    if-eqz v3, :cond_10

    .line 280
    .line 281
    goto :goto_4

    .line 282
    :cond_10
    invoke-static {v2, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    if-eqz v2, :cond_f

    .line 287
    .line 288
    invoke-static {v2}, Lg4/a;->z(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v3

    .line 292
    if-eqz v3, :cond_11

    .line 293
    .line 294
    return-object v2

    .line 295
    :cond_11
    add-int/lit8 v3, p0, 0x1

    .line 296
    .line 297
    invoke-static {v3, v2, p2}, Lg4/a;->I(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    if-eqz v2, :cond_f

    .line 302
    .line 303
    return-object v2

    .line 304
    :cond_12
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    goto :goto_3

    .line 309
    :cond_13
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 310
    .line 311
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 312
    .line 313
    .line 314
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    move-result-object p2

    .line 318
    :goto_5
    if-eqz p2, :cond_16

    .line 319
    .line 320
    invoke-virtual {p2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-nez v0, :cond_16

    .line 325
    .line 326
    invoke-static {p2}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    :cond_14
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 335
    .line 336
    .line 337
    move-result v1

    .line 338
    if-eqz v1, :cond_15

    .line 339
    .line 340
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    check-cast v1, Ljava/lang/reflect/Field;

    .line 345
    .line 346
    invoke-static {v1, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    if-eqz v1, :cond_14

    .line 351
    .line 352
    instance-of v2, v1, Ljava/lang/Number;

    .line 353
    .line 354
    if-eqz v2, :cond_14

    .line 355
    .line 356
    check-cast v1, Ljava/lang/Number;

    .line 357
    .line 358
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 359
    .line 360
    .line 361
    move-result v1

    .line 362
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    invoke-interface {p0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    goto :goto_6

    .line 370
    :cond_15
    invoke-virtual {p2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    move-result-object p2

    .line 374
    goto :goto_5

    .line 375
    :cond_16
    invoke-static {p1, p0}, Lg4/a;->H(Ljava/lang/Object;Ljava/util/LinkedHashSet;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object p0

    .line 379
    return-object p0

    .line 380
    :cond_17
    :goto_7
    return-object v0
.end method

.method public static final J(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast v0, Ljava/util/Set;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {v1, p0, v0}, Lg4/a;->I(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static K(Ljava/lang/Class;)Lm/a;
    .locals 3

    .line 1
    new-instance v0, Lm/a;

    .line 2
    .line 3
    new-instance v1, Lr6/c;

    .line 4
    .line 5
    sget-object v2, Lr6/b;->g:Lr6/b;

    .line 6
    .line 7
    invoke-direct {v1, p0, v2}, Lr6/c;-><init>(Ljava/lang/Class;Lr6/b;)V

    .line 8
    .line 9
    .line 10
    const/16 p0, 0xa

    .line 11
    .line 12
    invoke-direct {v0, v1, p0}, Lm/a;-><init>(Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public static final L(Lf/v;)I
    .locals 10

    .line 1
    iget v0, p0, Lf/v;->b:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Lf/v;->c(I)I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    :cond_0
    iget v2, p0, Lf/v;->b:I

    .line 9
    .line 10
    if-eqz v2, :cond_3

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lf/v;->c(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ne v2, v1, :cond_3

    .line 17
    .line 18
    iget v2, p0, Lf/v;->b:I

    .line 19
    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    iget-object v3, p0, Lf/v;->a:[I

    .line 23
    .line 24
    add-int/lit8 v2, v2, -0x1

    .line 25
    .line 26
    aget v2, v3, v2

    .line 27
    .line 28
    invoke-virtual {p0, v0, v2}, Lf/v;->e(II)V

    .line 29
    .line 30
    .line 31
    iget v2, p0, Lf/v;->b:I

    .line 32
    .line 33
    add-int/lit8 v2, v2, -0x1

    .line 34
    .line 35
    invoke-virtual {p0, v2}, Lf/v;->d(I)V

    .line 36
    .line 37
    .line 38
    iget v2, p0, Lf/v;->b:I

    .line 39
    .line 40
    ushr-int/lit8 v3, v2, 0x1

    .line 41
    .line 42
    move v4, v0

    .line 43
    :goto_0
    if-ge v4, v3, :cond_0

    .line 44
    .line 45
    invoke-virtual {p0, v4}, Lf/v;->c(I)I

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    add-int/lit8 v6, v4, 0x1

    .line 50
    .line 51
    mul-int/lit8 v6, v6, 0x2

    .line 52
    .line 53
    add-int/lit8 v7, v6, -0x1

    .line 54
    .line 55
    invoke-virtual {p0, v7}, Lf/v;->c(I)I

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    if-ge v6, v2, :cond_1

    .line 60
    .line 61
    invoke-virtual {p0, v6}, Lf/v;->c(I)I

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    if-le v9, v8, :cond_1

    .line 66
    .line 67
    if-le v9, v5, :cond_0

    .line 68
    .line 69
    invoke-virtual {p0, v4, v9}, Lf/v;->e(II)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v6, v5}, Lf/v;->e(II)V

    .line 73
    .line 74
    .line 75
    move v4, v6

    .line 76
    goto :goto_0

    .line 77
    :cond_1
    if-le v8, v5, :cond_0

    .line 78
    .line 79
    invoke-virtual {p0, v4, v8}, Lf/v;->e(II)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v7, v5}, Lf/v;->e(II)V

    .line 83
    .line 84
    .line 85
    move v4, v7

    .line 86
    goto :goto_0

    .line 87
    :cond_2
    const-string p0, "IntList is empty."

    .line 88
    .line 89
    invoke-static {p0}, Lj8/o;->l(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    const/4 p0, 0x0

    .line 93
    return p0

    .line 94
    :cond_3
    return v1
.end method

.method public static final M(Ll0/g;ILjava/lang/Integer;)Ljava/util/ArrayList;
    .locals 7

    .line 1
    new-instance v0, Lx0/j;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lx0/j;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ll0/g;->q(I)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p0, p1}, Ll0/g;->a(I)Ll0/b;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    :goto_0
    if-ltz p1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ll0/g;->k(I)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    iget-object v3, p0, Ll0/g;->b:[I

    .line 23
    .line 24
    invoke-virtual {p0, v3, p1}, Ll0/g;->p([II)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    sget-object v3, Li0/l;->a:Li0/e;

    .line 30
    .line 31
    :goto_1
    invoke-virtual {p0, p1}, Ll0/g;->i(I)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    iget-object v5, p0, Ll0/g;->a:Ll0/h;

    .line 36
    .line 37
    invoke-virtual {v5, p1}, Ll0/h;->g(I)Ll0/c;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {v0, v4, v3, p1, p2}, Lf1/n0;->m(ILjava/lang/Object;Ll0/c;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    if-ltz v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Ll0/g;->a(I)Ll0/b;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0, v1}, Ll0/g;->q(I)I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    move-object v6, v2

    .line 55
    move-object v2, p1

    .line 56
    move p1, v1

    .line 57
    move v1, p2

    .line 58
    move-object p2, v6

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move p1, v1

    .line 61
    move-object p2, v2

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    iget-object p0, v0, Lf1/n0;->g:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p0, Ljava/util/ArrayList;

    .line 66
    .line 67
    return-object p0
.end method

.method public static N(Lz4/d;IJ)V
    .locals 2

    .line 1
    invoke-static {p2, p3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    rsub-int/lit8 v0, v0, 0x40

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    :cond_0
    add-int/lit8 v0, v0, 0x7

    .line 11
    .line 12
    shr-int/lit8 v0, v0, 0x3

    .line 13
    .line 14
    mul-int/lit8 v1, v0, 0x8

    .line 15
    .line 16
    rsub-int/lit8 v1, v1, 0x40

    .line 17
    .line 18
    shr-long/2addr p2, v1

    .line 19
    add-int/lit8 v1, v0, -0x1

    .line 20
    .line 21
    shl-int/lit8 v1, v1, 0x5

    .line 22
    .line 23
    or-int/2addr p1, v1

    .line 24
    invoke-virtual {p0, p1}, Lz4/d;->j(I)V

    .line 25
    .line 26
    .line 27
    :goto_0
    if-lez v0, :cond_1

    .line 28
    .line 29
    long-to-int p1, p2

    .line 30
    int-to-byte p1, p1

    .line 31
    invoke-virtual {p0, p1}, Lz4/d;->j(I)V

    .line 32
    .line 33
    .line 34
    const/16 p1, 0x8

    .line 35
    .line 36
    shr-long/2addr p2, p1

    .line 37
    add-int/lit8 v0, v0, -0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    return-void
.end method

.method public static O(Lz4/d;IJ)V
    .locals 2

    .line 1
    invoke-static {p2, p3}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    rsub-int/lit8 v0, v0, 0x40

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    :cond_0
    add-int/lit8 v0, v0, 0x7

    .line 11
    .line 12
    shr-int/lit8 v0, v0, 0x3

    .line 13
    .line 14
    add-int/lit8 v1, v0, -0x1

    .line 15
    .line 16
    shl-int/lit8 v1, v1, 0x5

    .line 17
    .line 18
    or-int/2addr p1, v1

    .line 19
    invoke-virtual {p0, p1}, Lz4/d;->j(I)V

    .line 20
    .line 21
    .line 22
    :goto_0
    if-lez v0, :cond_1

    .line 23
    .line 24
    long-to-int p1, p2

    .line 25
    int-to-byte p1, p1

    .line 26
    invoke-virtual {p0, p1}, Lz4/d;->j(I)V

    .line 27
    .line 28
    .line 29
    const/16 p1, 0x8

    .line 30
    .line 31
    shr-long/2addr p2, p1

    .line 32
    add-int/lit8 v0, v0, -0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-void
.end method

.method public static final a(Ljava/lang/String;)Lz0/e;
    .locals 1

    .line 1
    new-instance v0, Lz0/e;

    .line 2
    .line 3
    invoke-static {p0}, Lac/p;->N(Ljava/lang/Object;)Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Lz0/e;-><init>(Ljava/util/Set;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static final b(Ljava/lang/String;JJJJJZLi/c;Li0/a1;Lfg/a;Ly0/o;Lu2/f;Ls0/d;Li0/h0;I)V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p5

    .line 4
    .line 5
    move/from16 v3, p11

    .line 6
    .line 7
    move-object/from16 v4, p12

    .line 8
    .line 9
    move-object/from16 v5, p13

    .line 10
    .line 11
    move-object/from16 v6, p14

    .line 12
    .line 13
    move-object/from16 v7, p15

    .line 14
    .line 15
    move-object/from16 v8, p16

    .line 16
    .line 17
    move-object/from16 v9, p18

    .line 18
    .line 19
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const v10, -0x1cbc2c41

    .line 26
    .line 27
    .line 28
    invoke-virtual {v9, v10}, Li0/h0;->b0(I)Li0/h0;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v9, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v10

    .line 35
    if-eqz v10, :cond_0

    .line 36
    .line 37
    const/4 v10, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v10, 0x2

    .line 40
    :goto_0
    or-int v10, p19, v10

    .line 41
    .line 42
    move-wide/from16 v13, p1

    .line 43
    .line 44
    invoke-virtual {v9, v13, v14}, Li0/h0;->e(J)Z

    .line 45
    .line 46
    .line 47
    move-result v15

    .line 48
    const/16 v16, 0x10

    .line 49
    .line 50
    if-eqz v15, :cond_1

    .line 51
    .line 52
    const/16 v15, 0x20

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move/from16 v15, v16

    .line 56
    .line 57
    :goto_1
    or-int/2addr v10, v15

    .line 58
    const/4 v15, 0x0

    .line 59
    invoke-virtual {v9, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v18

    .line 63
    const/16 v19, 0x80

    .line 64
    .line 65
    const/16 v20, 0x100

    .line 66
    .line 67
    if-eqz v18, :cond_2

    .line 68
    .line 69
    move/from16 v18, v20

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    move/from16 v18, v19

    .line 73
    .line 74
    :goto_2
    or-int v10, v10, v18

    .line 75
    .line 76
    move-wide/from16 v13, p3

    .line 77
    .line 78
    invoke-virtual {v9, v13, v14}, Li0/h0;->e(J)Z

    .line 79
    .line 80
    .line 81
    move-result v18

    .line 82
    if-eqz v18, :cond_3

    .line 83
    .line 84
    const/16 v18, 0x800

    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_3
    const/16 v18, 0x400

    .line 88
    .line 89
    :goto_3
    or-int v10, v10, v18

    .line 90
    .line 91
    invoke-virtual {v9, v1, v2}, Li0/h0;->e(J)Z

    .line 92
    .line 93
    .line 94
    move-result v18

    .line 95
    if-eqz v18, :cond_4

    .line 96
    .line 97
    const/16 v18, 0x4000

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_4
    const/16 v18, 0x2000

    .line 101
    .line 102
    :goto_4
    or-int v10, v10, v18

    .line 103
    .line 104
    move-wide/from16 v13, p7

    .line 105
    .line 106
    invoke-virtual {v9, v13, v14}, Li0/h0;->e(J)Z

    .line 107
    .line 108
    .line 109
    move-result v18

    .line 110
    if-eqz v18, :cond_5

    .line 111
    .line 112
    const/high16 v18, 0x20000

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_5
    const/high16 v18, 0x10000

    .line 116
    .line 117
    :goto_5
    or-int v10, v10, v18

    .line 118
    .line 119
    move-wide/from16 v13, p9

    .line 120
    .line 121
    invoke-virtual {v9, v13, v14}, Li0/h0;->e(J)Z

    .line 122
    .line 123
    .line 124
    move-result v18

    .line 125
    if-eqz v18, :cond_6

    .line 126
    .line 127
    const/high16 v18, 0x100000

    .line 128
    .line 129
    goto :goto_6

    .line 130
    :cond_6
    const/high16 v18, 0x80000

    .line 131
    .line 132
    :goto_6
    or-int v10, v10, v18

    .line 133
    .line 134
    invoke-virtual {v9, v3}, Li0/h0;->g(Z)Z

    .line 135
    .line 136
    .line 137
    move-result v18

    .line 138
    if-eqz v18, :cond_7

    .line 139
    .line 140
    const/high16 v18, 0x800000

    .line 141
    .line 142
    goto :goto_7

    .line 143
    :cond_7
    const/high16 v18, 0x400000

    .line 144
    .line 145
    :goto_7
    or-int v10, v10, v18

    .line 146
    .line 147
    invoke-virtual {v9, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v18

    .line 151
    if-eqz v18, :cond_8

    .line 152
    .line 153
    const/high16 v18, 0x4000000

    .line 154
    .line 155
    goto :goto_8

    .line 156
    :cond_8
    const/high16 v18, 0x2000000

    .line 157
    .line 158
    :goto_8
    or-int v10, v10, v18

    .line 159
    .line 160
    invoke-virtual {v9, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v18

    .line 164
    if-eqz v18, :cond_9

    .line 165
    .line 166
    const/16 v17, 0x4

    .line 167
    .line 168
    goto :goto_9

    .line 169
    :cond_9
    const/16 v17, 0x2

    .line 170
    .line 171
    :goto_9
    const/16 v18, 0xc00

    .line 172
    .line 173
    or-int v17, v18, v17

    .line 174
    .line 175
    invoke-virtual {v9, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v18

    .line 179
    if-eqz v18, :cond_a

    .line 180
    .line 181
    const/16 v16, 0x20

    .line 182
    .line 183
    :cond_a
    or-int v16, v17, v16

    .line 184
    .line 185
    invoke-virtual {v9, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v17

    .line 189
    if-eqz v17, :cond_b

    .line 190
    .line 191
    move/from16 v19, v20

    .line 192
    .line 193
    :cond_b
    or-int v12, v16, v19

    .line 194
    .line 195
    const v16, 0x12492493

    .line 196
    .line 197
    .line 198
    and-int v15, v10, v16

    .line 199
    .line 200
    const v11, 0x12492492

    .line 201
    .line 202
    .line 203
    if-ne v15, v11, :cond_d

    .line 204
    .line 205
    and-int/lit16 v11, v12, 0x493

    .line 206
    .line 207
    const/16 v12, 0x492

    .line 208
    .line 209
    if-eq v11, v12, :cond_c

    .line 210
    .line 211
    goto :goto_a

    .line 212
    :cond_c
    const/4 v11, 0x0

    .line 213
    goto :goto_b

    .line 214
    :cond_d
    :goto_a
    const/4 v11, 0x1

    .line 215
    :goto_b
    and-int/lit8 v12, v10, 0x1

    .line 216
    .line 217
    invoke-virtual {v9, v12, v11}, Li0/h0;->S(IZ)Z

    .line 218
    .line 219
    .line 220
    move-result v11

    .line 221
    if-eqz v11, :cond_32

    .line 222
    .line 223
    sget-object v11, Ly1/h1;->u:Li0/m2;

    .line 224
    .line 225
    invoke-virtual {v9, v11}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v11

    .line 229
    check-cast v11, Ly1/o2;

    .line 230
    .line 231
    check-cast v11, Ly1/v1;

    .line 232
    .line 233
    invoke-virtual {v11}, Ly1/v1;->a()J

    .line 234
    .line 235
    .line 236
    move-result-wide v11

    .line 237
    invoke-static {v11, v12}, Lu2/h;->a(J)F

    .line 238
    .line 239
    .line 240
    move-result v11

    .line 241
    invoke-static {v9}, Lxh/i;->a(Li0/h0;)Z

    .line 242
    .line 243
    .line 244
    move-result v12

    .line 245
    invoke-virtual {v9, v12}, Li0/h0;->g(Z)Z

    .line 246
    .line 247
    .line 248
    move-result v15

    .line 249
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v13

    .line 253
    sget-object v14, Li0/l;->a:Li0/e;

    .line 254
    .line 255
    if-nez v15, :cond_e

    .line 256
    .line 257
    if-ne v13, v14, :cond_10

    .line 258
    .line 259
    :cond_e
    if-eqz v12, :cond_f

    .line 260
    .line 261
    sget-object v13, Ly0/b;->k:Ly0/g;

    .line 262
    .line 263
    goto :goto_c

    .line 264
    :cond_f
    sget-object v13, Ly0/b;->n:Ly0/g;

    .line 265
    .line 266
    :goto_c
    invoke-virtual {v9, v13}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    :cond_10
    check-cast v13, Ly0/c;

    .line 270
    .line 271
    sget-object v15, Ly1/i0;->b:Li0/m2;

    .line 272
    .line 273
    invoke-virtual {v9, v15}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v15

    .line 277
    check-cast v15, Landroid/content/Context;

    .line 278
    .line 279
    sget-object v0, Ly1/h1;->h:Li0/m2;

    .line 280
    .line 281
    invoke-virtual {v9, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    check-cast v0, Lu2/c;

    .line 286
    .line 287
    invoke-interface {v0}, Lu2/c;->d()F

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    move/from16 v22, v0

    .line 292
    .line 293
    sget-object v0, Ly1/i0;->f:Li0/m2;

    .line 294
    .line 295
    invoke-virtual {v9, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    check-cast v0, Landroid/view/View;

    .line 300
    .line 301
    invoke-virtual {v0}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    invoke-virtual {v9, v15}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v23

    .line 309
    invoke-virtual {v9, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v24

    .line 313
    or-int v23, v23, v24

    .line 314
    .line 315
    move-object/from16 v24, v0

    .line 316
    .line 317
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    if-nez v23, :cond_12

    .line 322
    .line 323
    if-ne v0, v14, :cond_11

    .line 324
    .line 325
    goto :goto_d

    .line 326
    :cond_11
    move/from16 v25, v10

    .line 327
    .line 328
    move/from16 v26, v11

    .line 329
    .line 330
    goto :goto_10

    .line 331
    :cond_12
    :goto_d
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 332
    .line 333
    const-string v3, "android"

    .line 334
    .line 335
    move/from16 v25, v10

    .line 336
    .line 337
    const-string v10, "dimen"

    .line 338
    .line 339
    move/from16 v26, v11

    .line 340
    .line 341
    const-string v11, "rounded_corner_radius_bottom"

    .line 342
    .line 343
    move-object/from16 v27, v15

    .line 344
    .line 345
    const/16 v15, 0x1f

    .line 346
    .line 347
    if-lt v0, v15, :cond_16

    .line 348
    .line 349
    if-eqz v24, :cond_14

    .line 350
    .line 351
    invoke-static/range {v24 .. v24}, La1/c;->i(Landroid/view/WindowInsets;)Landroid/view/RoundedCorner;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    if-eqz v0, :cond_14

    .line 356
    .line 357
    invoke-static {v0}, La1/c;->b(Landroid/view/RoundedCorner;)I

    .line 358
    .line 359
    .line 360
    move-result v0

    .line 361
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 362
    .line 363
    .line 364
    move-result-object v15

    .line 365
    if-lez v0, :cond_13

    .line 366
    .line 367
    goto :goto_e

    .line 368
    :cond_13
    const/4 v15, 0x0

    .line 369
    :goto_e
    if-eqz v15, :cond_14

    .line 370
    .line 371
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 372
    .line 373
    .line 374
    move-result v0

    .line 375
    goto :goto_f

    .line 376
    :cond_14
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v27 .. v27}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-virtual {v0, v11, v10, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 384
    .line 385
    .line 386
    move-result v0

    .line 387
    if-lez v0, :cond_15

    .line 388
    .line 389
    invoke-virtual/range {v27 .. v27}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 390
    .line 391
    .line 392
    move-result-object v3

    .line 393
    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    goto :goto_f

    .line 398
    :cond_15
    const/4 v0, 0x0

    .line 399
    goto :goto_f

    .line 400
    :cond_16
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    invoke-virtual/range {v27 .. v27}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-virtual {v0, v11, v10, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    if-lez v0, :cond_15

    .line 412
    .line 413
    invoke-virtual/range {v27 .. v27}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    invoke-virtual {v3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 418
    .line 419
    .line 420
    move-result v0

    .line 421
    :goto_f
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-virtual {v9, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    :goto_10
    check-cast v0, Ljava/lang/Number;

    .line 429
    .line 430
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    int-to-float v0, v0

    .line 435
    div-float v0, v0, v22

    .line 436
    .line 437
    invoke-static/range {p7 .. p8}, Lu2/h;->b(J)F

    .line 438
    .line 439
    .line 440
    move-result v3

    .line 441
    invoke-virtual {v9, v0}, Li0/h0;->c(F)Z

    .line 442
    .line 443
    .line 444
    move-result v10

    .line 445
    invoke-virtual {v9, v3}, Li0/h0;->c(F)Z

    .line 446
    .line 447
    .line 448
    move-result v3

    .line 449
    or-int/2addr v3, v10

    .line 450
    invoke-virtual {v9, v12}, Li0/h0;->g(Z)Z

    .line 451
    .line 452
    .line 453
    move-result v10

    .line 454
    or-int/2addr v3, v10

    .line 455
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v10

    .line 459
    if-nez v3, :cond_17

    .line 460
    .line 461
    if-ne v10, v14, :cond_1a

    .line 462
    .line 463
    :cond_17
    if-eqz v12, :cond_18

    .line 464
    .line 465
    const/4 v3, 0x0

    .line 466
    int-to-float v10, v3

    .line 467
    goto :goto_11

    .line 468
    :cond_18
    invoke-static/range {p7 .. p8}, Lu2/h;->b(J)F

    .line 469
    .line 470
    .line 471
    move-result v10

    .line 472
    :goto_11
    sub-float/2addr v0, v10

    .line 473
    new-instance v3, Lu2/f;

    .line 474
    .line 475
    invoke-direct {v3, v0}, Lu2/f;-><init>(F)V

    .line 476
    .line 477
    .line 478
    const/16 v0, 0x20

    .line 479
    .line 480
    int-to-float v0, v0

    .line 481
    new-instance v10, Lu2/f;

    .line 482
    .line 483
    invoke-direct {v10, v0}, Lu2/f;-><init>(F)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v3, v10}, Lu2/f;->compareTo(Ljava/lang/Object;)I

    .line 487
    .line 488
    .line 489
    move-result v0

    .line 490
    if-gez v0, :cond_19

    .line 491
    .line 492
    move-object v3, v10

    .line 493
    :cond_19
    new-instance v10, Lu2/f;

    .line 494
    .line 495
    iget v0, v3, Lu2/f;->g:F

    .line 496
    .line 497
    invoke-direct {v10, v0}, Lu2/f;-><init>(F)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v9, v10}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 501
    .line 502
    .line 503
    :cond_1a
    check-cast v10, Lu2/f;

    .line 504
    .line 505
    iget v0, v10, Lu2/f;->g:F

    .line 506
    .line 507
    const/4 v3, 0x0

    .line 508
    invoke-static {v0, v9, v3}, Lbi/k;->b(FLi0/h0;I)Lf1/r0;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    invoke-static {v6, v9}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 513
    .line 514
    .line 515
    move-result-object v10

    .line 516
    if-eqz v8, :cond_1b

    .line 517
    .line 518
    const v11, 0x122fff4b

    .line 519
    .line 520
    .line 521
    invoke-virtual {v9, v11}, Li0/h0;->a0(I)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v9, v3}, Li0/h0;->p(Z)V

    .line 525
    .line 526
    .line 527
    iget v3, v8, Lu2/f;->g:F

    .line 528
    .line 529
    :goto_12
    move/from16 v29, v3

    .line 530
    .line 531
    goto :goto_16

    .line 532
    :cond_1b
    const v3, 0x123098f6

    .line 533
    .line 534
    .line 535
    invoke-virtual {v9, v3}, Li0/h0;->a0(I)V

    .line 536
    .line 537
    .line 538
    sget-object v3, Lp/s1;->v:Ljava/util/WeakHashMap;

    .line 539
    .line 540
    invoke-static {v9}, Lp/c;->e(Li0/h0;)Lp/s1;

    .line 541
    .line 542
    .line 543
    move-result-object v3

    .line 544
    iget-object v3, v3, Lp/s1;->f:Lp/b;

    .line 545
    .line 546
    invoke-static {v3, v9}, Lp/d;->d(Lp/b;Li0/h0;)Lp/j0;

    .line 547
    .line 548
    .line 549
    move-result-object v3

    .line 550
    invoke-virtual {v3}, Lp/j0;->c()F

    .line 551
    .line 552
    .line 553
    move-result v3

    .line 554
    invoke-static {v9}, Lp/c;->e(Li0/h0;)Lp/s1;

    .line 555
    .line 556
    .line 557
    move-result-object v11

    .line 558
    iget-object v11, v11, Lp/s1;->a:Lp/b;

    .line 559
    .line 560
    invoke-static {v11, v9}, Lp/d;->d(Lp/b;Li0/h0;)Lp/j0;

    .line 561
    .line 562
    .line 563
    move-result-object v11

    .line 564
    invoke-virtual {v11}, Lp/j0;->c()F

    .line 565
    .line 566
    .line 567
    move-result v11

    .line 568
    invoke-static {v9}, Lp/c;->e(Li0/h0;)Lp/s1;

    .line 569
    .line 570
    .line 571
    move-result-object v15

    .line 572
    iget-object v15, v15, Lp/s1;->b:Lp/b;

    .line 573
    .line 574
    invoke-static {v15, v9}, Lp/d;->d(Lp/b;Li0/h0;)Lp/j0;

    .line 575
    .line 576
    .line 577
    move-result-object v15

    .line 578
    invoke-virtual {v15}, Lp/j0;->c()F

    .line 579
    .line 580
    .line 581
    move-result v15

    .line 582
    new-instance v6, Lu2/f;

    .line 583
    .line 584
    invoke-direct {v6, v3}, Lu2/f;-><init>(F)V

    .line 585
    .line 586
    .line 587
    new-instance v3, Lu2/f;

    .line 588
    .line 589
    invoke-direct {v3, v11}, Lu2/f;-><init>(F)V

    .line 590
    .line 591
    .line 592
    new-instance v11, Lu2/f;

    .line 593
    .line 594
    invoke-direct {v11, v15}, Lu2/f;-><init>(F)V

    .line 595
    .line 596
    .line 597
    invoke-virtual {v3, v11}, Lu2/f;->compareTo(Ljava/lang/Object;)I

    .line 598
    .line 599
    .line 600
    move-result v15

    .line 601
    if-ltz v15, :cond_1c

    .line 602
    .line 603
    goto :goto_13

    .line 604
    :cond_1c
    move-object v3, v11

    .line 605
    :goto_13
    invoke-virtual {v6, v3}, Lu2/f;->compareTo(Ljava/lang/Object;)I

    .line 606
    .line 607
    .line 608
    move-result v11

    .line 609
    if-ltz v11, :cond_1d

    .line 610
    .line 611
    :goto_14
    const/4 v3, 0x0

    .line 612
    goto :goto_15

    .line 613
    :cond_1d
    move-object v6, v3

    .line 614
    goto :goto_14

    .line 615
    :goto_15
    invoke-virtual {v9, v3}, Li0/h0;->p(Z)V

    .line 616
    .line 617
    .line 618
    iget v3, v6, Lu2/f;->g:F

    .line 619
    .line 620
    goto :goto_12

    .line 621
    :goto_16
    const/16 v3, 0x1a4

    .line 622
    .line 623
    int-to-float v3, v3

    .line 624
    invoke-static {v7, v3}, Lp/h1;->o(Ly0/o;F)Ly0/o;

    .line 625
    .line 626
    .line 627
    move-result-object v3

    .line 628
    if-eqz v12, :cond_1e

    .line 629
    .line 630
    const v6, 0x3f2aaaab

    .line 631
    .line 632
    .line 633
    mul-float v11, v26, v6

    .line 634
    .line 635
    goto :goto_17

    .line 636
    :cond_1e
    const/high16 v11, 0x7fc00000    # Float.NaN

    .line 637
    .line 638
    :goto_17
    const/4 v6, 0x0

    .line 639
    const/4 v15, 0x1

    .line 640
    invoke-static {v3, v6, v11, v15}, Lp/h1;->g(Ly0/o;FFI)Ly0/o;

    .line 641
    .line 642
    .line 643
    move-result-object v3

    .line 644
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v11

    .line 648
    if-ne v11, v14, :cond_1f

    .line 649
    .line 650
    new-instance v11, Lwb/lp;

    .line 651
    .line 652
    const/16 v15, 0x1a

    .line 653
    .line 654
    invoke-direct {v11, v5, v15}, Lwb/lp;-><init>(Li0/a1;I)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v9, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 658
    .line 659
    .line 660
    :cond_1f
    check-cast v11, Lfg/l;

    .line 661
    .line 662
    invoke-static {v3, v11}, Lv1/w;->m(Ly0/o;Lfg/l;)Ly0/o;

    .line 663
    .line 664
    .line 665
    move-result-object v3

    .line 666
    sget-object v15, Ly0/l;->a:Ly0/l;

    .line 667
    .line 668
    const/high16 v16, 0xe000000

    .line 669
    .line 670
    if-eqz v12, :cond_24

    .line 671
    .line 672
    const v12, 0x123b2272

    .line 673
    .line 674
    .line 675
    invoke-virtual {v9, v12}, Li0/h0;->a0(I)V

    .line 676
    .line 677
    .line 678
    and-int v12, v25, v16

    .line 679
    .line 680
    const/high16 v6, 0x4000000

    .line 681
    .line 682
    if-eq v12, v6, :cond_21

    .line 683
    .line 684
    invoke-virtual {v9, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 685
    .line 686
    .line 687
    move-result v6

    .line 688
    if-eqz v6, :cond_20

    .line 689
    .line 690
    goto :goto_18

    .line 691
    :cond_20
    const/4 v6, 0x0

    .line 692
    goto :goto_19

    .line 693
    :cond_21
    :goto_18
    const/4 v6, 0x1

    .line 694
    :goto_19
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object v12

    .line 698
    if-nez v6, :cond_23

    .line 699
    .line 700
    if-ne v12, v14, :cond_22

    .line 701
    .line 702
    goto :goto_1a

    .line 703
    :cond_22
    const/4 v6, 0x0

    .line 704
    goto :goto_1b

    .line 705
    :cond_23
    :goto_1a
    new-instance v12, Lxh/a;

    .line 706
    .line 707
    const/4 v6, 0x0

    .line 708
    invoke-direct {v12, v4, v6}, Lxh/a;-><init>(Li/c;I)V

    .line 709
    .line 710
    .line 711
    invoke-virtual {v9, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 712
    .line 713
    .line 714
    :goto_1b
    check-cast v12, Lfg/l;

    .line 715
    .line 716
    invoke-static {v15, v12}, Lf1/c0;->m(Ly0/o;Lfg/l;)Ly0/o;

    .line 717
    .line 718
    .line 719
    move-result-object v12

    .line 720
    invoke-virtual {v9, v6}, Li0/h0;->p(Z)V

    .line 721
    .line 722
    .line 723
    goto/16 :goto_1e

    .line 724
    .line 725
    :cond_24
    const v6, 0x123f1ec8

    .line 726
    .line 727
    .line 728
    invoke-virtual {v9, v6}, Li0/h0;->a0(I)V

    .line 729
    .line 730
    .line 731
    sget-object v6, Lp/s1;->v:Ljava/util/WeakHashMap;

    .line 732
    .line 733
    invoke-static {v9}, Lp/c;->e(Li0/h0;)Lp/s1;

    .line 734
    .line 735
    .line 736
    move-result-object v6

    .line 737
    iget-object v6, v6, Lp/s1;->e:Lp/b;

    .line 738
    .line 739
    invoke-static {v6, v9}, Lp/d;->d(Lp/b;Li0/h0;)Lp/j0;

    .line 740
    .line 741
    .line 742
    move-result-object v6

    .line 743
    invoke-virtual {v6}, Lp/j0;->a()F

    .line 744
    .line 745
    .line 746
    move-result v6

    .line 747
    invoke-static {v9}, Lp/c;->e(Li0/h0;)Lp/s1;

    .line 748
    .line 749
    .line 750
    move-result-object v12

    .line 751
    iget-object v12, v12, Lp/s1;->a:Lp/b;

    .line 752
    .line 753
    invoke-static {v12, v9}, Lp/d;->d(Lp/b;Li0/h0;)Lp/j0;

    .line 754
    .line 755
    .line 756
    move-result-object v12

    .line 757
    invoke-virtual {v12}, Lp/j0;->a()F

    .line 758
    .line 759
    .line 760
    move-result v12

    .line 761
    add-float/2addr v12, v6

    .line 762
    invoke-static/range {p7 .. p8}, Lu2/h;->a(J)F

    .line 763
    .line 764
    .line 765
    move-result v6

    .line 766
    invoke-virtual {v9, v12}, Li0/h0;->c(F)Z

    .line 767
    .line 768
    .line 769
    move-result v22

    .line 770
    invoke-virtual {v9, v6}, Li0/h0;->c(F)Z

    .line 771
    .line 772
    .line 773
    move-result v6

    .line 774
    or-int v6, v22, v6

    .line 775
    .line 776
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v11

    .line 780
    if-nez v6, :cond_25

    .line 781
    .line 782
    if-ne v11, v14, :cond_26

    .line 783
    .line 784
    :cond_25
    invoke-static/range {p7 .. p8}, Lu2/h;->a(J)F

    .line 785
    .line 786
    .line 787
    move-result v6

    .line 788
    add-float/2addr v6, v12

    .line 789
    new-instance v11, Lu2/f;

    .line 790
    .line 791
    invoke-direct {v11, v6}, Lu2/f;-><init>(F)V

    .line 792
    .line 793
    .line 794
    invoke-virtual {v9, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 795
    .line 796
    .line 797
    :cond_26
    check-cast v11, Lu2/f;

    .line 798
    .line 799
    iget v6, v11, Lu2/f;->g:F

    .line 800
    .line 801
    invoke-virtual {v9, v6}, Li0/h0;->c(F)Z

    .line 802
    .line 803
    .line 804
    move-result v11

    .line 805
    and-int v12, v25, v16

    .line 806
    .line 807
    const/high16 v7, 0x4000000

    .line 808
    .line 809
    if-eq v12, v7, :cond_28

    .line 810
    .line 811
    invoke-virtual {v9, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 812
    .line 813
    .line 814
    move-result v7

    .line 815
    if-eqz v7, :cond_27

    .line 816
    .line 817
    goto :goto_1c

    .line 818
    :cond_27
    const/4 v7, 0x0

    .line 819
    goto :goto_1d

    .line 820
    :cond_28
    :goto_1c
    const/4 v7, 0x1

    .line 821
    :goto_1d
    or-int/2addr v7, v11

    .line 822
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v11

    .line 826
    if-nez v7, :cond_29

    .line 827
    .line 828
    if-ne v11, v14, :cond_2a

    .line 829
    .line 830
    :cond_29
    new-instance v11, Lm/e3;

    .line 831
    .line 832
    const/4 v7, 0x3

    .line 833
    invoke-direct {v11, v5, v6, v4, v7}, Lm/e3;-><init>(Ljava/lang/Object;FLjava/lang/Object;I)V

    .line 834
    .line 835
    .line 836
    invoke-virtual {v9, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 837
    .line 838
    .line 839
    :cond_2a
    check-cast v11, Lfg/l;

    .line 840
    .line 841
    invoke-static {v15, v11}, Lf1/c0;->m(Ly0/o;Lfg/l;)Ly0/o;

    .line 842
    .line 843
    .line 844
    move-result-object v12

    .line 845
    const/4 v6, 0x0

    .line 846
    invoke-virtual {v9, v6}, Li0/h0;->p(Z)V

    .line 847
    .line 848
    .line 849
    :goto_1e
    invoke-interface {v3, v12}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 850
    .line 851
    .line 852
    move-result-object v3

    .line 853
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 854
    .line 855
    .line 856
    move-result-object v6

    .line 857
    if-ne v6, v14, :cond_2b

    .line 858
    .line 859
    sget-object v6, Lxh/h;->a:Lxh/h;

    .line 860
    .line 861
    invoke-virtual {v9, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 862
    .line 863
    .line 864
    :cond_2b
    check-cast v6, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 865
    .line 866
    sget-object v7, Lsf/n;->a:Lsf/n;

    .line 867
    .line 868
    invoke-static {v3, v7, v6}, Ls1/h0;->a(Ly0/o;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Ly0/o;

    .line 869
    .line 870
    .line 871
    move-result-object v3

    .line 872
    invoke-static {v3, v0}, Lc1/h;->b(Ly0/o;Lf1/r0;)Ly0/o;

    .line 873
    .line 874
    .line 875
    move-result-object v0

    .line 876
    sget-object v3, Lf1/c0;->b:Lf1/m0;

    .line 877
    .line 878
    invoke-static {v0, v1, v2, v3}, Lk/n;->g(Ly0/o;JLf1/r0;)Ly0/o;

    .line 879
    .line 880
    .line 881
    move-result-object v0

    .line 882
    invoke-static/range {p9 .. p10}, Lu2/h;->b(J)F

    .line 883
    .line 884
    .line 885
    move-result v3

    .line 886
    invoke-static/range {p9 .. p10}, Lu2/h;->a(J)F

    .line 887
    .line 888
    .line 889
    move-result v6

    .line 890
    invoke-static {v0, v3, v6}, Lp/d;->m(Ly0/o;FF)Ly0/o;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    if-eqz p11, :cond_2c

    .line 895
    .line 896
    sget-object v3, Lp/d;->e:Lo9/e;

    .line 897
    .line 898
    invoke-static {v15, v3}, Lp/d;->t(Ly0/o;Lfg/l;)Ly0/o;

    .line 899
    .line 900
    .line 901
    move-result-object v3

    .line 902
    sget-object v6, Lp/d;->f:Lo9/e;

    .line 903
    .line 904
    invoke-static {v3, v6}, Lp/d;->t(Ly0/o;Lfg/l;)Ly0/o;

    .line 905
    .line 906
    .line 907
    move-result-object v3

    .line 908
    sget-object v6, Lp/d;->g:Lo9/e;

    .line 909
    .line 910
    invoke-static {v3, v6}, Lp/d;->t(Ly0/o;Lfg/l;)Ly0/o;

    .line 911
    .line 912
    .line 913
    move-result-object v3

    .line 914
    goto :goto_1f

    .line 915
    :cond_2c
    move-object v3, v15

    .line 916
    :goto_1f
    sget-object v6, Lp/h1;->c:Lp/a0;

    .line 917
    .line 918
    invoke-interface {v3, v6}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 919
    .line 920
    .line 921
    move-result-object v3

    .line 922
    invoke-virtual {v9, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 923
    .line 924
    .line 925
    move-result v6

    .line 926
    invoke-virtual {v9}, Li0/h0;->P()Ljava/lang/Object;

    .line 927
    .line 928
    .line 929
    move-result-object v11

    .line 930
    if-nez v6, :cond_2d

    .line 931
    .line 932
    if-ne v11, v14, :cond_2e

    .line 933
    .line 934
    :cond_2d
    new-instance v11, Lxh/g;

    .line 935
    .line 936
    const/4 v6, 0x0

    .line 937
    invoke-direct {v11, v10, v6}, Lxh/g;-><init>(Li0/a1;I)V

    .line 938
    .line 939
    .line 940
    invoke-virtual {v9, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 941
    .line 942
    .line 943
    :cond_2e
    check-cast v11, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 944
    .line 945
    invoke-static {v3, v7, v11}, Ls1/h0;->a(Ly0/o;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Ly0/o;

    .line 946
    .line 947
    .line 948
    move-result-object v3

    .line 949
    invoke-static/range {p7 .. p8}, Lu2/h;->b(J)F

    .line 950
    .line 951
    .line 952
    move-result v6

    .line 953
    const/4 v7, 0x2

    .line 954
    const/4 v10, 0x0

    .line 955
    invoke-static {v3, v6, v10, v7}, Lp/d;->n(Ly0/o;FFI)Ly0/o;

    .line 956
    .line 957
    .line 958
    move-result-object v27

    .line 959
    invoke-static/range {p7 .. p8}, Lu2/h;->a(J)F

    .line 960
    .line 961
    .line 962
    move-result v31

    .line 963
    const/16 v32, 0x5

    .line 964
    .line 965
    const/16 v28, 0x0

    .line 966
    .line 967
    const/16 v30, 0x0

    .line 968
    .line 969
    invoke-static/range {v27 .. v32}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 970
    .line 971
    .line 972
    move-result-object v3

    .line 973
    sget-object v6, Ly0/b;->g:Ly0/g;

    .line 974
    .line 975
    const/4 v7, 0x0

    .line 976
    invoke-static {v6, v7}, Lp/o;->d(Ly0/g;Z)Lv1/n0;

    .line 977
    .line 978
    .line 979
    move-result-object v6

    .line 980
    iget-wide v10, v9, Li0/h0;->T:J

    .line 981
    .line 982
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 983
    .line 984
    .line 985
    move-result v7

    .line 986
    invoke-virtual {v9}, Li0/h0;->l()Ls0/h;

    .line 987
    .line 988
    .line 989
    move-result-object v10

    .line 990
    invoke-static {v9, v3}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 991
    .line 992
    .line 993
    move-result-object v3

    .line 994
    sget-object v11, Lx1/g;->f:Lx1/f;

    .line 995
    .line 996
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 997
    .line 998
    .line 999
    sget-object v11, Lx1/f;->b:Lx1/y;

    .line 1000
    .line 1001
    invoke-virtual {v9}, Li0/h0;->d0()V

    .line 1002
    .line 1003
    .line 1004
    iget-boolean v12, v9, Li0/h0;->S:Z

    .line 1005
    .line 1006
    if-eqz v12, :cond_2f

    .line 1007
    .line 1008
    invoke-virtual {v9, v11}, Li0/h0;->k(Lfg/a;)V

    .line 1009
    .line 1010
    .line 1011
    goto :goto_20

    .line 1012
    :cond_2f
    invoke-virtual {v9}, Li0/h0;->n0()V

    .line 1013
    .line 1014
    .line 1015
    :goto_20
    sget-object v12, Lx1/f;->e:Lx1/e;

    .line 1016
    .line 1017
    invoke-static {v12, v9, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1018
    .line 1019
    .line 1020
    sget-object v6, Lx1/f;->d:Lx1/e;

    .line 1021
    .line 1022
    invoke-static {v6, v9, v10}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1023
    .line 1024
    .line 1025
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v7

    .line 1029
    sget-object v10, Lx1/f;->f:Lx1/e;

    .line 1030
    .line 1031
    invoke-static {v9, v7, v10}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 1032
    .line 1033
    .line 1034
    sget-object v7, Lx1/f;->g:Lx1/d;

    .line 1035
    .line 1036
    invoke-static {v7, v9}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 1037
    .line 1038
    .line 1039
    sget-object v14, Lx1/f;->c:Lx1/e;

    .line 1040
    .line 1041
    invoke-static {v14, v9, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1042
    .line 1043
    .line 1044
    invoke-static {v0, v13}, Lp/r;->a(Ly0/o;Ly0/c;)Ly0/o;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v0

    .line 1048
    sget-object v3, Lp/j;->c:Lp/e;

    .line 1049
    .line 1050
    sget-object v13, Ly0/b;->s:Ly0/e;

    .line 1051
    .line 1052
    const/4 v1, 0x0

    .line 1053
    invoke-static {v3, v13, v9, v1}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v2

    .line 1057
    iget-wide v3, v9, Li0/h0;->T:J

    .line 1058
    .line 1059
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 1060
    .line 1061
    .line 1062
    move-result v1

    .line 1063
    invoke-virtual {v9}, Li0/h0;->l()Ls0/h;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v3

    .line 1067
    invoke-static {v9, v0}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v0

    .line 1071
    invoke-virtual {v9}, Li0/h0;->d0()V

    .line 1072
    .line 1073
    .line 1074
    iget-boolean v4, v9, Li0/h0;->S:Z

    .line 1075
    .line 1076
    if-eqz v4, :cond_30

    .line 1077
    .line 1078
    invoke-virtual {v9, v11}, Li0/h0;->k(Lfg/a;)V

    .line 1079
    .line 1080
    .line 1081
    goto :goto_21

    .line 1082
    :cond_30
    invoke-virtual {v9}, Li0/h0;->n0()V

    .line 1083
    .line 1084
    .line 1085
    :goto_21
    invoke-static {v12, v9, v2}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1086
    .line 1087
    .line 1088
    invoke-static {v6, v9, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1089
    .line 1090
    .line 1091
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v1

    .line 1095
    invoke-static {v9, v1, v10}, Li0/r;->t(Li0/h0;Ljava/lang/Integer;Lfg/p;)V

    .line 1096
    .line 1097
    .line 1098
    invoke-static {v7, v9}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 1099
    .line 1100
    .line 1101
    invoke-static {v14, v9, v0}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 1102
    .line 1103
    .line 1104
    if-nez p0, :cond_31

    .line 1105
    .line 1106
    const v0, -0x222c1e80

    .line 1107
    .line 1108
    .line 1109
    invoke-virtual {v9, v0}, Li0/h0;->a0(I)V

    .line 1110
    .line 1111
    .line 1112
    const/4 v3, 0x0

    .line 1113
    invoke-virtual {v9, v3}, Li0/h0;->p(Z)V

    .line 1114
    .line 1115
    .line 1116
    goto :goto_22

    .line 1117
    :cond_31
    const/4 v3, 0x0

    .line 1118
    const v0, -0x222c1e7f

    .line 1119
    .line 1120
    .line 1121
    invoke-virtual {v9, v0}, Li0/h0;->a0(I)V

    .line 1122
    .line 1123
    .line 1124
    const/high16 v0, 0x3f800000    # 1.0f

    .line 1125
    .line 1126
    invoke-static {v15, v0}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v26

    .line 1130
    const/16 v0, 0xc

    .line 1131
    .line 1132
    int-to-float v0, v0

    .line 1133
    const/16 v31, 0x7

    .line 1134
    .line 1135
    const/16 v27, 0x0

    .line 1136
    .line 1137
    const/16 v28, 0x0

    .line 1138
    .line 1139
    const/16 v29, 0x0

    .line 1140
    .line 1141
    move/from16 v30, v0

    .line 1142
    .line 1143
    invoke-static/range {v26 .. v31}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v1

    .line 1147
    sget-object v0, Lbi/m;->a:Li0/m2;

    .line 1148
    .line 1149
    invoke-virtual {v9, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v0

    .line 1153
    check-cast v0, Lbi/l;

    .line 1154
    .line 1155
    iget-object v0, v0, Lbi/l;->n:Li0/j1;

    .line 1156
    .line 1157
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v0

    .line 1161
    check-cast v0, Li2/n0;

    .line 1162
    .line 1163
    iget-object v0, v0, Li2/n0;->a:Li2/f0;

    .line 1164
    .line 1165
    iget-wide v6, v0, Li2/f0;->b:J

    .line 1166
    .line 1167
    move-wide v4, v6

    .line 1168
    sget-object v6, Lm2/k;->j:Lm2/k;

    .line 1169
    .line 1170
    new-instance v10, Lt2/k;

    .line 1171
    .line 1172
    const/4 v7, 0x3

    .line 1173
    invoke-direct {v10, v7}, Lt2/k;-><init>(I)V

    .line 1174
    .line 1175
    .line 1176
    shl-int/lit8 v0, v25, 0x3

    .line 1177
    .line 1178
    and-int/lit16 v0, v0, 0x380

    .line 1179
    .line 1180
    const v2, 0x180030

    .line 1181
    .line 1182
    .line 1183
    or-int v20, v0, v2

    .line 1184
    .line 1185
    const/16 v21, 0x0

    .line 1186
    .line 1187
    const v22, 0x3fba8

    .line 1188
    .line 1189
    .line 1190
    const/4 v7, 0x0

    .line 1191
    const-wide/16 v8, 0x0

    .line 1192
    .line 1193
    const-wide/16 v11, 0x0

    .line 1194
    .line 1195
    const/4 v13, 0x0

    .line 1196
    const/4 v14, 0x0

    .line 1197
    const/4 v15, 0x0

    .line 1198
    const/16 v16, 0x0

    .line 1199
    .line 1200
    const/16 v17, 0x0

    .line 1201
    .line 1202
    const/16 v18, 0x0

    .line 1203
    .line 1204
    move-object/from16 v0, p0

    .line 1205
    .line 1206
    move-wide/from16 v2, p1

    .line 1207
    .line 1208
    move-object/from16 v19, p18

    .line 1209
    .line 1210
    invoke-static/range {v0 .. v22}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 1211
    .line 1212
    .line 1213
    move-object/from16 v9, v19

    .line 1214
    .line 1215
    const/4 v3, 0x0

    .line 1216
    invoke-virtual {v9, v3}, Li0/h0;->p(Z)V

    .line 1217
    .line 1218
    .line 1219
    :goto_22
    const v0, -0x2226072d

    .line 1220
    .line 1221
    .line 1222
    invoke-virtual {v9, v0}, Li0/h0;->a0(I)V

    .line 1223
    .line 1224
    .line 1225
    invoke-virtual {v9, v3}, Li0/h0;->p(Z)V

    .line 1226
    .line 1227
    .line 1228
    const/4 v0, 0x6

    .line 1229
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v0

    .line 1233
    move-object/from16 v1, p17

    .line 1234
    .line 1235
    invoke-virtual {v1, v9, v0}, Ls0/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1236
    .line 1237
    .line 1238
    const/4 v15, 0x1

    .line 1239
    invoke-virtual {v9, v15}, Li0/h0;->p(Z)V

    .line 1240
    .line 1241
    .line 1242
    invoke-virtual {v9, v15}, Li0/h0;->p(Z)V

    .line 1243
    .line 1244
    .line 1245
    goto :goto_23

    .line 1246
    :cond_32
    move-object/from16 v1, p17

    .line 1247
    .line 1248
    invoke-virtual {v9}, Li0/h0;->V()V

    .line 1249
    .line 1250
    .line 1251
    :goto_23
    invoke-virtual {v9}, Li0/h0;->t()Li0/r1;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v0

    .line 1255
    if-eqz v0, :cond_33

    .line 1256
    .line 1257
    move-object v2, v0

    .line 1258
    new-instance v0, Lxh/b;

    .line 1259
    .line 1260
    move-wide/from16 v4, p3

    .line 1261
    .line 1262
    move-wide/from16 v6, p5

    .line 1263
    .line 1264
    move-wide/from16 v8, p7

    .line 1265
    .line 1266
    move-wide/from16 v10, p9

    .line 1267
    .line 1268
    move/from16 v12, p11

    .line 1269
    .line 1270
    move-object/from16 v13, p12

    .line 1271
    .line 1272
    move-object/from16 v14, p13

    .line 1273
    .line 1274
    move-object/from16 v15, p14

    .line 1275
    .line 1276
    move-object/from16 v16, p15

    .line 1277
    .line 1278
    move-object/from16 v17, p16

    .line 1279
    .line 1280
    move/from16 v19, p19

    .line 1281
    .line 1282
    move-object/from16 v18, v1

    .line 1283
    .line 1284
    move-object/from16 v33, v2

    .line 1285
    .line 1286
    move-object/from16 v1, p0

    .line 1287
    .line 1288
    move-wide/from16 v2, p1

    .line 1289
    .line 1290
    invoke-direct/range {v0 .. v19}, Lxh/b;-><init>(Ljava/lang/String;JJJJJZLi/c;Li0/a1;Lfg/a;Ly0/o;Lu2/f;Ls0/d;I)V

    .line 1291
    .line 1292
    .line 1293
    move-object/from16 v2, v33

    .line 1294
    .line 1295
    iput-object v0, v2, Li0/r1;->d:Lfg/p;

    .line 1296
    .line 1297
    :cond_33
    return-void
.end method

.method public static final c(JJJJJLs0/d;Ly0/o;Ljava/lang/String;ZLfg/a;ZLu2/f;Ls0/d;Li0/h0;II)V
    .locals 45

    .line 1
    move-object/from16 v11, p10

    .line 2
    .line 3
    move-object/from16 v0, p18

    .line 4
    .line 5
    move/from16 v1, p19

    .line 6
    .line 7
    move/from16 v2, p20

    .line 8
    .line 9
    const v3, 0x71b36def

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v3}, Li0/h0;->b0(I)Li0/h0;

    .line 13
    .line 14
    .line 15
    and-int/lit8 v3, v1, 0x6

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0, v4}, Li0/h0;->g(Z)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    const/4 v3, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v3, 0x2

    .line 29
    :goto_0
    or-int/2addr v3, v1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v3, v1

    .line 32
    :goto_1
    and-int/lit8 v7, v1, 0x30

    .line 33
    .line 34
    move-wide/from16 v12, p0

    .line 35
    .line 36
    if-nez v7, :cond_3

    .line 37
    .line 38
    invoke-virtual {v0, v12, v13}, Li0/h0;->e(J)Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    if-eqz v7, :cond_2

    .line 43
    .line 44
    const/16 v7, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v7, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr v3, v7

    .line 50
    :cond_3
    and-int/lit16 v7, v1, 0x180

    .line 51
    .line 52
    move-wide/from16 v8, p2

    .line 53
    .line 54
    if-nez v7, :cond_5

    .line 55
    .line 56
    invoke-virtual {v0, v8, v9}, Li0/h0;->e(J)Z

    .line 57
    .line 58
    .line 59
    move-result v17

    .line 60
    if-eqz v17, :cond_4

    .line 61
    .line 62
    const/16 v17, 0x100

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    const/16 v17, 0x80

    .line 66
    .line 67
    :goto_3
    or-int v3, v3, v17

    .line 68
    .line 69
    :cond_5
    and-int/lit16 v7, v1, 0xc00

    .line 70
    .line 71
    const/16 v18, 0x400

    .line 72
    .line 73
    const/16 v19, 0x800

    .line 74
    .line 75
    if-nez v7, :cond_7

    .line 76
    .line 77
    move-wide/from16 v6, p4

    .line 78
    .line 79
    invoke-virtual {v0, v6, v7}, Li0/h0;->e(J)Z

    .line 80
    .line 81
    .line 82
    move-result v21

    .line 83
    if-eqz v21, :cond_6

    .line 84
    .line 85
    move/from16 v21, v19

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_6
    move/from16 v21, v18

    .line 89
    .line 90
    :goto_4
    or-int v3, v3, v21

    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_7
    move-wide/from16 v6, p4

    .line 94
    .line 95
    :goto_5
    and-int/lit16 v10, v1, 0x6000

    .line 96
    .line 97
    const/16 v22, 0x2000

    .line 98
    .line 99
    const/16 v23, 0x4000

    .line 100
    .line 101
    move-wide/from16 v4, p6

    .line 102
    .line 103
    if-nez v10, :cond_9

    .line 104
    .line 105
    invoke-virtual {v0, v4, v5}, Li0/h0;->e(J)Z

    .line 106
    .line 107
    .line 108
    move-result v25

    .line 109
    if-eqz v25, :cond_8

    .line 110
    .line 111
    move/from16 v25, v23

    .line 112
    .line 113
    goto :goto_6

    .line 114
    :cond_8
    move/from16 v25, v22

    .line 115
    .line 116
    :goto_6
    or-int v3, v3, v25

    .line 117
    .line 118
    :cond_9
    const/high16 v25, 0x30000

    .line 119
    .line 120
    and-int v26, v1, v25

    .line 121
    .line 122
    const/high16 v27, 0x10000

    .line 123
    .line 124
    const/high16 v28, 0x20000

    .line 125
    .line 126
    move-wide/from16 v14, p8

    .line 127
    .line 128
    if-nez v26, :cond_b

    .line 129
    .line 130
    invoke-virtual {v0, v14, v15}, Li0/h0;->e(J)Z

    .line 131
    .line 132
    .line 133
    move-result v29

    .line 134
    if-eqz v29, :cond_a

    .line 135
    .line 136
    move/from16 v29, v28

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_a
    move/from16 v29, v27

    .line 140
    .line 141
    :goto_7
    or-int v3, v3, v29

    .line 142
    .line 143
    :cond_b
    const/high16 v29, 0x180000

    .line 144
    .line 145
    and-int v29, v1, v29

    .line 146
    .line 147
    if-nez v29, :cond_d

    .line 148
    .line 149
    invoke-virtual {v0, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v29

    .line 153
    if-eqz v29, :cond_c

    .line 154
    .line 155
    const/high16 v29, 0x100000

    .line 156
    .line 157
    goto :goto_8

    .line 158
    :cond_c
    const/high16 v29, 0x80000

    .line 159
    .line 160
    :goto_8
    or-int v3, v3, v29

    .line 161
    .line 162
    :cond_d
    const/high16 v29, 0xc00000

    .line 163
    .line 164
    and-int v29, v1, v29

    .line 165
    .line 166
    move-object/from16 v10, p11

    .line 167
    .line 168
    if-nez v29, :cond_f

    .line 169
    .line 170
    invoke-virtual {v0, v10}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v30

    .line 174
    if-eqz v30, :cond_e

    .line 175
    .line 176
    const/high16 v30, 0x800000

    .line 177
    .line 178
    goto :goto_9

    .line 179
    :cond_e
    const/high16 v30, 0x400000

    .line 180
    .line 181
    :goto_9
    or-int v3, v3, v30

    .line 182
    .line 183
    :cond_f
    const/high16 v30, 0x6000000

    .line 184
    .line 185
    and-int v30, v1, v30

    .line 186
    .line 187
    move-object/from16 v1, p12

    .line 188
    .line 189
    if-nez v30, :cond_11

    .line 190
    .line 191
    invoke-virtual {v0, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result v30

    .line 195
    if-eqz v30, :cond_10

    .line 196
    .line 197
    const/high16 v30, 0x4000000

    .line 198
    .line 199
    goto :goto_a

    .line 200
    :cond_10
    const/high16 v30, 0x2000000

    .line 201
    .line 202
    :goto_a
    or-int v3, v3, v30

    .line 203
    .line 204
    :cond_11
    const/high16 v30, 0x30000000

    .line 205
    .line 206
    and-int v30, p19, v30

    .line 207
    .line 208
    const/4 v1, 0x0

    .line 209
    if-nez v30, :cond_13

    .line 210
    .line 211
    invoke-virtual {v0, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v30

    .line 215
    if-eqz v30, :cond_12

    .line 216
    .line 217
    const/high16 v30, 0x20000000

    .line 218
    .line 219
    goto :goto_b

    .line 220
    :cond_12
    const/high16 v30, 0x10000000

    .line 221
    .line 222
    :goto_b
    or-int v3, v3, v30

    .line 223
    .line 224
    :cond_13
    and-int/lit8 v30, v2, 0x6

    .line 225
    .line 226
    move/from16 v1, p13

    .line 227
    .line 228
    if-nez v30, :cond_15

    .line 229
    .line 230
    invoke-virtual {v0, v1}, Li0/h0;->g(Z)Z

    .line 231
    .line 232
    .line 233
    move-result v31

    .line 234
    if-eqz v31, :cond_14

    .line 235
    .line 236
    const/16 v31, 0x4

    .line 237
    .line 238
    goto :goto_c

    .line 239
    :cond_14
    const/16 v31, 0x2

    .line 240
    .line 241
    :goto_c
    or-int v31, v2, v31

    .line 242
    .line 243
    goto :goto_d

    .line 244
    :cond_15
    move/from16 v31, v2

    .line 245
    .line 246
    :goto_d
    and-int/lit8 v32, v2, 0x30

    .line 247
    .line 248
    move-object/from16 v1, p14

    .line 249
    .line 250
    if-nez v32, :cond_17

    .line 251
    .line 252
    invoke-virtual {v0, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v32

    .line 256
    if-eqz v32, :cond_16

    .line 257
    .line 258
    const/16 v16, 0x20

    .line 259
    .line 260
    goto :goto_e

    .line 261
    :cond_16
    const/16 v16, 0x10

    .line 262
    .line 263
    :goto_e
    or-int v31, v31, v16

    .line 264
    .line 265
    :cond_17
    move/from16 v43, v3

    .line 266
    .line 267
    and-int/lit16 v3, v2, 0x180

    .line 268
    .line 269
    if-nez v3, :cond_19

    .line 270
    .line 271
    const/4 v3, 0x0

    .line 272
    invoke-virtual {v0, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v16

    .line 276
    if-eqz v16, :cond_18

    .line 277
    .line 278
    const/16 v21, 0x100

    .line 279
    .line 280
    goto :goto_f

    .line 281
    :cond_18
    const/16 v21, 0x80

    .line 282
    .line 283
    :goto_f
    or-int v31, v31, v21

    .line 284
    .line 285
    :cond_19
    and-int/lit16 v3, v2, 0xc00

    .line 286
    .line 287
    if-nez v3, :cond_1b

    .line 288
    .line 289
    move/from16 v3, p15

    .line 290
    .line 291
    invoke-virtual {v0, v3}, Li0/h0;->g(Z)Z

    .line 292
    .line 293
    .line 294
    move-result v16

    .line 295
    if-eqz v16, :cond_1a

    .line 296
    .line 297
    move/from16 v18, v19

    .line 298
    .line 299
    :cond_1a
    or-int v31, v31, v18

    .line 300
    .line 301
    goto :goto_10

    .line 302
    :cond_1b
    move/from16 v3, p15

    .line 303
    .line 304
    :goto_10
    and-int/lit16 v3, v2, 0x6000

    .line 305
    .line 306
    if-nez v3, :cond_1d

    .line 307
    .line 308
    move-object/from16 v3, p16

    .line 309
    .line 310
    invoke-virtual {v0, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v16

    .line 314
    if-eqz v16, :cond_1c

    .line 315
    .line 316
    move/from16 v22, v23

    .line 317
    .line 318
    :cond_1c
    or-int v31, v31, v22

    .line 319
    .line 320
    goto :goto_11

    .line 321
    :cond_1d
    move-object/from16 v3, p16

    .line 322
    .line 323
    :goto_11
    and-int v16, v2, v25

    .line 324
    .line 325
    move-object/from16 v2, p17

    .line 326
    .line 327
    if-nez v16, :cond_1f

    .line 328
    .line 329
    invoke-virtual {v0, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v16

    .line 333
    if-eqz v16, :cond_1e

    .line 334
    .line 335
    move/from16 v27, v28

    .line 336
    .line 337
    :cond_1e
    or-int v31, v31, v27

    .line 338
    .line 339
    :cond_1f
    const v16, 0x12492493

    .line 340
    .line 341
    .line 342
    and-int v2, v43, v16

    .line 343
    .line 344
    const v3, 0x12492492

    .line 345
    .line 346
    .line 347
    if-ne v2, v3, :cond_21

    .line 348
    .line 349
    const v2, 0x12493

    .line 350
    .line 351
    .line 352
    and-int v2, v31, v2

    .line 353
    .line 354
    const v3, 0x12492

    .line 355
    .line 356
    .line 357
    if-eq v2, v3, :cond_20

    .line 358
    .line 359
    goto :goto_12

    .line 360
    :cond_20
    const/4 v2, 0x0

    .line 361
    goto :goto_13

    .line 362
    :cond_21
    :goto_12
    const/4 v2, 0x1

    .line 363
    :goto_13
    and-int/lit8 v3, v43, 0x1

    .line 364
    .line 365
    invoke-virtual {v0, v3, v2}, Li0/h0;->S(IZ)Z

    .line 366
    .line 367
    .line 368
    move-result v2

    .line 369
    if-eqz v2, :cond_30

    .line 370
    .line 371
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v2

    .line 375
    const/4 v3, 0x0

    .line 376
    sget-object v5, Li0/l;->a:Li0/e;

    .line 377
    .line 378
    if-ne v2, v5, :cond_22

    .line 379
    .line 380
    const v2, 0x38d1b717    # 1.0E-4f

    .line 381
    .line 382
    .line 383
    invoke-static {v3, v2}, Li/d;->a(FF)Li/c;

    .line 384
    .line 385
    .line 386
    move-result-object v2

    .line 387
    invoke-virtual {v0, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 388
    .line 389
    .line 390
    :cond_22
    check-cast v2, Li/c;

    .line 391
    .line 392
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v4

    .line 396
    const v6, 0x3c23d70a    # 0.01f

    .line 397
    .line 398
    .line 399
    if-ne v4, v5, :cond_23

    .line 400
    .line 401
    invoke-static {v3, v6}, Li/d;->a(FF)Li/c;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    invoke-virtual {v0, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    :cond_23
    check-cast v4, Li/c;

    .line 409
    .line 410
    const/4 v7, 0x0

    .line 411
    invoke-static {v7, v0}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v7

    .line 419
    if-ne v7, v5, :cond_24

    .line 420
    .line 421
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 422
    .line 423
    invoke-static {v7}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 424
    .line 425
    .line 426
    move-result-object v7

    .line 427
    invoke-virtual {v0, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    :cond_24
    move-object/from16 v32, v7

    .line 431
    .line 432
    check-cast v32, Li0/a1;

    .line 433
    .line 434
    sget-object v7, Ly1/h1;->h:Li0/m2;

    .line 435
    .line 436
    invoke-virtual {v0, v7}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v7

    .line 440
    check-cast v7, Lu2/c;

    .line 441
    .line 442
    sget-object v18, Lp/s1;->v:Ljava/util/WeakHashMap;

    .line 443
    .line 444
    invoke-static {v0}, Lp/c;->e(Li0/h0;)Lp/s1;

    .line 445
    .line 446
    .line 447
    move-result-object v6

    .line 448
    iget-object v6, v6, Lp/s1;->c:Lp/b;

    .line 449
    .line 450
    sget-object v8, Ly1/h1;->q:Li0/m2;

    .line 451
    .line 452
    invoke-virtual {v0, v8}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v8

    .line 456
    check-cast v8, Ly1/g2;

    .line 457
    .line 458
    invoke-static {v0}, Lxh/i;->a(Li0/h0;)Z

    .line 459
    .line 460
    .line 461
    move-result v9

    .line 462
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 463
    .line 464
    and-int/lit8 v12, v43, 0xe

    .line 465
    .line 466
    const/4 v13, 0x4

    .line 467
    if-ne v12, v13, :cond_25

    .line 468
    .line 469
    const/4 v12, 0x1

    .line 470
    goto :goto_14

    .line 471
    :cond_25
    const/4 v12, 0x0

    .line 472
    :goto_14
    invoke-virtual {v0, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    move-result v13

    .line 476
    or-int/2addr v12, v13

    .line 477
    invoke-virtual {v0, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    move-result v13

    .line 481
    or-int/2addr v12, v13

    .line 482
    invoke-virtual {v0, v9}, Li0/h0;->g(Z)Z

    .line 483
    .line 484
    .line 485
    move-result v13

    .line 486
    or-int/2addr v12, v13

    .line 487
    invoke-virtual {v0, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    move-result v13

    .line 491
    or-int/2addr v12, v13

    .line 492
    invoke-virtual {v0, v7}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    move-result v13

    .line 496
    or-int/2addr v12, v13

    .line 497
    invoke-virtual {v0, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-result v13

    .line 501
    or-int/2addr v12, v13

    .line 502
    invoke-virtual {v0, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    move-result v13

    .line 506
    or-int/2addr v12, v13

    .line 507
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v13

    .line 511
    if-nez v12, :cond_27

    .line 512
    .line 513
    if-ne v13, v5, :cond_26

    .line 514
    .line 515
    goto :goto_15

    .line 516
    :cond_26
    move-object/from16 v33, v2

    .line 517
    .line 518
    move-object/from16 v38, v4

    .line 519
    .line 520
    move/from16 v34, v9

    .line 521
    .line 522
    goto :goto_16

    .line 523
    :cond_27
    :goto_15
    new-instance v31, Lwb/zp;

    .line 524
    .line 525
    const/16 v40, 0x0

    .line 526
    .line 527
    move-object/from16 v33, v2

    .line 528
    .line 529
    move-object/from16 v39, v3

    .line 530
    .line 531
    move-object/from16 v38, v4

    .line 532
    .line 533
    move-object/from16 v35, v6

    .line 534
    .line 535
    move-object/from16 v36, v7

    .line 536
    .line 537
    move-object/from16 v37, v8

    .line 538
    .line 539
    move/from16 v34, v9

    .line 540
    .line 541
    invoke-direct/range {v31 .. v40}, Lwb/zp;-><init>(Li0/a1;Li/c;ZLp/r1;Lu2/c;Ly1/g2;Li/c;Li0/a1;Lwf/c;)V

    .line 542
    .line 543
    .line 544
    move-object/from16 v13, v31

    .line 545
    .line 546
    invoke-virtual {v0, v13}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 547
    .line 548
    .line 549
    :goto_16
    check-cast v13, Lfg/p;

    .line 550
    .line 551
    invoke-static {v13, v0, v10}, Li0/r;->f(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v2

    .line 558
    if-ne v2, v5, :cond_28

    .line 559
    .line 560
    invoke-static {v0}, Li0/r;->n(Li0/h0;)Lqg/t;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    invoke-virtual {v0, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 565
    .line 566
    .line 567
    :cond_28
    check-cast v2, Lqg/t;

    .line 568
    .line 569
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v3

    .line 573
    if-ne v3, v5, :cond_29

    .line 574
    .line 575
    new-instance v3, Li0/f1;

    .line 576
    .line 577
    const/high16 v4, 0x3f800000    # 1.0f

    .line 578
    .line 579
    invoke-direct {v3, v4}, Li0/f1;-><init>(F)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v0, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 583
    .line 584
    .line 585
    :cond_29
    check-cast v3, Li0/f1;

    .line 586
    .line 587
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v4

    .line 591
    if-ne v4, v5, :cond_2a

    .line 592
    .line 593
    new-instance v4, Li0/g1;

    .line 594
    .line 595
    const/4 v6, 0x0

    .line 596
    invoke-direct {v4, v6}, Li0/g1;-><init>(I)V

    .line 597
    .line 598
    .line 599
    invoke-virtual {v0, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 600
    .line 601
    .line 602
    :cond_2a
    move-object/from16 v39, v4

    .line 603
    .line 604
    check-cast v39, Li0/g1;

    .line 605
    .line 606
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v4

    .line 610
    if-ne v4, v5, :cond_2b

    .line 611
    .line 612
    const v6, 0x3c23d70a    # 0.01f

    .line 613
    .line 614
    .line 615
    const/4 v8, 0x0

    .line 616
    invoke-static {v8, v6}, Li/d;->a(FF)Li/c;

    .line 617
    .line 618
    .line 619
    move-result-object v4

    .line 620
    invoke-virtual {v0, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 621
    .line 622
    .line 623
    :cond_2b
    check-cast v4, Li/c;

    .line 624
    .line 625
    invoke-static {v1, v0}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 626
    .line 627
    .line 628
    move-result-object v6

    .line 629
    sget-object v8, Ly1/h1;->u:Li0/m2;

    .line 630
    .line 631
    invoke-virtual {v0, v8}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v8

    .line 635
    check-cast v8, Ly1/o2;

    .line 636
    .line 637
    check-cast v8, Ly1/v1;

    .line 638
    .line 639
    invoke-virtual {v8}, Ly1/v1;->a()J

    .line 640
    .line 641
    .line 642
    move-result-wide v8

    .line 643
    invoke-static {v8, v9}, Lu2/h;->a(J)F

    .line 644
    .line 645
    .line 646
    move-result v8

    .line 647
    invoke-interface {v7, v8}, Lu2/c;->x0(F)F

    .line 648
    .line 649
    .line 650
    move-result v26

    .line 651
    invoke-virtual {v0, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 652
    .line 653
    .line 654
    move-result v7

    .line 655
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v8

    .line 659
    if-nez v7, :cond_2c

    .line 660
    .line 661
    if-ne v8, v5, :cond_2d

    .line 662
    .line 663
    :cond_2c
    new-instance v8, Lwb/ht;

    .line 664
    .line 665
    const/4 v10, 0x1

    .line 666
    invoke-direct {v8, v6, v10}, Lwb/ht;-><init>(Li0/a1;I)V

    .line 667
    .line 668
    .line 669
    invoke-virtual {v0, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 670
    .line 671
    .line 672
    :cond_2d
    move-object/from16 v19, v8

    .line 673
    .line 674
    check-cast v19, Lfg/a;

    .line 675
    .line 676
    invoke-virtual {v0, v4}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 677
    .line 678
    .line 679
    move-result v6

    .line 680
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v7

    .line 684
    if-nez v6, :cond_2e

    .line 685
    .line 686
    if-ne v7, v5, :cond_2f

    .line 687
    .line 688
    :cond_2e
    new-instance v7, Lb0/g;

    .line 689
    .line 690
    const/4 v5, 0x0

    .line 691
    const/4 v6, 0x2

    .line 692
    invoke-direct {v7, v4, v3, v5, v6}, Lb0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 693
    .line 694
    .line 695
    invoke-virtual {v0, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 696
    .line 697
    .line 698
    :cond_2f
    move-object/from16 v18, v7

    .line 699
    .line 700
    check-cast v18, Lfg/l;

    .line 701
    .line 702
    invoke-interface/range {v32 .. v32}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object v5

    .line 706
    new-instance v16, Lxh/c;

    .line 707
    .line 708
    move-wide/from16 v28, p0

    .line 709
    .line 710
    move-wide/from16 v30, p2

    .line 711
    .line 712
    move-object/from16 v23, p11

    .line 713
    .line 714
    move-object/from16 v27, p12

    .line 715
    .line 716
    move/from16 v21, p13

    .line 717
    .line 718
    move-object/from16 v40, p16

    .line 719
    .line 720
    move-object/from16 v42, p17

    .line 721
    .line 722
    move-object/from16 v17, v2

    .line 723
    .line 724
    move-object/from16 v41, v3

    .line 725
    .line 726
    move-object/from16 v20, v4

    .line 727
    .line 728
    move-wide/from16 v36, v14

    .line 729
    .line 730
    move-object/from16 v24, v33

    .line 731
    .line 732
    move/from16 v25, v34

    .line 733
    .line 734
    move-object/from16 v22, v38

    .line 735
    .line 736
    move-wide/from16 v32, p4

    .line 737
    .line 738
    move-wide/from16 v34, p6

    .line 739
    .line 740
    move/from16 v38, p15

    .line 741
    .line 742
    invoke-direct/range {v16 .. v42}, Lxh/c;-><init>(Lqg/t;Lfg/l;Lfg/a;Li/c;ZLi/c;Ly0/o;Li/c;ZFLjava/lang/String;JJJJJZLi0/g1;Lu2/f;Li0/f1;Ls0/d;)V

    .line 743
    .line 744
    .line 745
    move-object/from16 v2, v16

    .line 746
    .line 747
    const v3, -0x3ec03a37

    .line 748
    .line 749
    .line 750
    invoke-static {v3, v2, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 751
    .line 752
    .line 753
    move-result-object v2

    .line 754
    shr-int/lit8 v3, v43, 0xc

    .line 755
    .line 756
    and-int/lit16 v3, v3, 0x380

    .line 757
    .line 758
    or-int/lit8 v3, v3, 0x30

    .line 759
    .line 760
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 761
    .line 762
    .line 763
    move-result-object v3

    .line 764
    invoke-virtual {v11, v5, v2, v0, v3}, Ls0/d;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    goto :goto_17

    .line 768
    :cond_30
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 769
    .line 770
    .line 771
    :goto_17
    invoke-virtual {v0}, Li0/h0;->t()Li0/r1;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    if-eqz v0, :cond_31

    .line 776
    .line 777
    move-object v2, v0

    .line 778
    new-instance v0, Lxh/d;

    .line 779
    .line 780
    move-wide/from16 v3, p2

    .line 781
    .line 782
    move-wide/from16 v5, p4

    .line 783
    .line 784
    move-wide/from16 v7, p6

    .line 785
    .line 786
    move-wide/from16 v9, p8

    .line 787
    .line 788
    move-object/from16 v12, p11

    .line 789
    .line 790
    move-object/from16 v13, p12

    .line 791
    .line 792
    move/from16 v14, p13

    .line 793
    .line 794
    move/from16 v16, p15

    .line 795
    .line 796
    move-object/from16 v17, p16

    .line 797
    .line 798
    move-object/from16 v18, p17

    .line 799
    .line 800
    move/from16 v19, p19

    .line 801
    .line 802
    move/from16 v20, p20

    .line 803
    .line 804
    move-object v15, v1

    .line 805
    move-object/from16 v44, v2

    .line 806
    .line 807
    move-wide/from16 v1, p0

    .line 808
    .line 809
    invoke-direct/range {v0 .. v20}, Lxh/d;-><init>(JJJJJLs0/d;Ly0/o;Ljava/lang/String;ZLfg/a;ZLu2/f;Ls0/d;II)V

    .line 810
    .line 811
    .line 812
    move-object/from16 v2, v44

    .line 813
    .line 814
    iput-object v0, v2, Li0/r1;->d:Lfg/p;

    .line 815
    .line 816
    :cond_31
    return-void
.end method

.method public static final d(FF)J
    .locals 4

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    int-to-long v0, p0

    .line 6
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    int-to-long p0, p0

    .line 11
    const/16 v2, 0x20

    .line 12
    .line 13
    shl-long/2addr v0, v2

    .line 14
    const-wide v2, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long/2addr p0, v2

    .line 20
    or-long/2addr p0, v0

    .line 21
    return-wide p0
.end method

.method public static final e(Lf/v;I)V
    .locals 3

    .line 1
    iget v0, p0, Lf/v;->b:I

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Lf/v;->c(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eq v0, p1, :cond_0

    .line 11
    .line 12
    iget v0, p0, Lf/v;->b:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, -0x1

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lf/v;->c(I)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-ne v0, p1, :cond_1

    .line 21
    .line 22
    :cond_0
    return-void

    .line 23
    :cond_1
    iget v0, p0, Lf/v;->b:I

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lf/v;->a(I)V

    .line 26
    .line 27
    .line 28
    :goto_0
    if-lez v0, :cond_2

    .line 29
    .line 30
    add-int/lit8 v1, v0, 0x1

    .line 31
    .line 32
    ushr-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    add-int/lit8 v1, v1, -0x1

    .line 35
    .line 36
    invoke-virtual {p0, v1}, Lf/v;->c(I)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-le p1, v2, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0, v0, v2}, Lf/v;->e(II)V

    .line 43
    .line 44
    .line 45
    move v0, v1

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-virtual {p0, v0, p1}, Lf/v;->e(II)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static final f(Lm/a;Ls1/t;J)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    iget-object v1, v1, Lm/a;->h:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lt1/b;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v4, v1, Lt1/b;->b:Lt1/d;

    .line 15
    .line 16
    iget-object v5, v1, Lt1/b;->a:Lt1/d;

    .line 17
    .line 18
    invoke-static {v0}, Ls1/s;->b(Ls1/t;)Z

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    iget-wide v7, v0, Ls1/t;->b:J

    .line 23
    .line 24
    const-wide/16 v9, 0x0

    .line 25
    .line 26
    const/4 v11, 0x0

    .line 27
    const/4 v12, 0x0

    .line 28
    if-eqz v6, :cond_0

    .line 29
    .line 30
    iget-object v6, v5, Lt1/d;->d:[Lt1/a;

    .line 31
    .line 32
    invoke-static {v11, v6}, Ltf/l;->x0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput v12, v5, Lt1/d;->e:I

    .line 36
    .line 37
    iget-object v6, v4, Lt1/d;->d:[Lt1/a;

    .line 38
    .line 39
    invoke-static {v11, v6}, Ltf/l;->x0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iput v12, v4, Lt1/d;->e:I

    .line 43
    .line 44
    iput-wide v9, v1, Lt1/b;->c:J

    .line 45
    .line 46
    :cond_0
    invoke-static {v0}, Ls1/s;->d(Ls1/t;)Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-nez v6, :cond_3

    .line 51
    .line 52
    iget-object v6, v0, Ls1/t;->m:Ljava/util/ArrayList;

    .line 53
    .line 54
    if-nez v6, :cond_1

    .line 55
    .line 56
    sget-object v6, Ltf/t;->g:Ltf/t;

    .line 57
    .line 58
    :cond_1
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 59
    .line 60
    .line 61
    move-result v13

    .line 62
    move v14, v12

    .line 63
    :goto_0
    if-ge v14, v13, :cond_2

    .line 64
    .line 65
    invoke-interface {v6, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v15

    .line 69
    check-cast v15, Ls1/c;

    .line 70
    .line 71
    iget-wide v9, v15, Ls1/c;->a:J

    .line 72
    .line 73
    move/from16 v16, v13

    .line 74
    .line 75
    iget-wide v12, v15, Ls1/c;->e:J

    .line 76
    .line 77
    invoke-static {v12, v13, v2, v3}, Le1/b;->e(JJ)J

    .line 78
    .line 79
    .line 80
    move-result-wide v12

    .line 81
    invoke-virtual {v1, v9, v10, v12, v13}, Lt1/b;->a(JJ)V

    .line 82
    .line 83
    .line 84
    add-int/lit8 v14, v14, 0x1

    .line 85
    .line 86
    move/from16 v13, v16

    .line 87
    .line 88
    const-wide/16 v9, 0x0

    .line 89
    .line 90
    const/4 v12, 0x0

    .line 91
    goto :goto_0

    .line 92
    :cond_2
    iget-wide v9, v0, Ls1/t;->n:J

    .line 93
    .line 94
    invoke-static {v9, v10, v2, v3}, Le1/b;->e(JJ)J

    .line 95
    .line 96
    .line 97
    move-result-wide v2

    .line 98
    invoke-virtual {v1, v7, v8, v2, v3}, Lt1/b;->a(JJ)V

    .line 99
    .line 100
    .line 101
    :cond_3
    invoke-static {v0}, Ls1/s;->d(Ls1/t;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_4

    .line 106
    .line 107
    iget-wide v2, v1, Lt1/b;->c:J

    .line 108
    .line 109
    sub-long v2, v7, v2

    .line 110
    .line 111
    const-wide/16 v9, 0x28

    .line 112
    .line 113
    cmp-long v0, v2, v9

    .line 114
    .line 115
    if-lez v0, :cond_4

    .line 116
    .line 117
    iget-object v0, v5, Lt1/d;->d:[Lt1/a;

    .line 118
    .line 119
    invoke-static {v11, v0}, Ltf/l;->x0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    const/4 v0, 0x0

    .line 123
    iput v0, v5, Lt1/d;->e:I

    .line 124
    .line 125
    iget-object v2, v4, Lt1/d;->d:[Lt1/a;

    .line 126
    .line 127
    invoke-static {v11, v2}, Ltf/l;->x0(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    iput v0, v4, Lt1/d;->e:I

    .line 131
    .line 132
    const-wide/16 v2, 0x0

    .line 133
    .line 134
    iput-wide v2, v1, Lt1/b;->c:J

    .line 135
    .line 136
    :cond_4
    iput-wide v7, v1, Lt1/b;->c:J

    .line 137
    .line 138
    return-void
.end method

.method public static g(Lud/r;Lgf/a;ZLjava/util/ArrayList;)Lpd/l;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    iget-object v2, v0, Lud/r;->l:Lud/e;

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    check-cast v3, Lnc/a;

    .line 13
    .line 14
    iget-object v3, v3, Lnc/a;->h:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Lqc/d;

    .line 17
    .line 18
    invoke-virtual {v3}, Lqc/d;->b()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    invoke-static {v4}, Lj8/b;->a(I)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-nez v4, :cond_a

    .line 27
    .line 28
    iget-object v4, v2, Lud/e;->k:Lud/u;

    .line 29
    .line 30
    const/4 v5, 0x2

    .line 31
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    check-cast v5, Lnc/a;

    .line 36
    .line 37
    iget-object v5, v5, Lnc/a;->h:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v5, Lmc/a;

    .line 40
    .line 41
    iget-object v6, v2, Lud/e;->m:Lod/a;

    .line 42
    .line 43
    const-string v7, ""

    .line 44
    .line 45
    invoke-static {v4, v6, v7, v5}, Lod/d;->c(Lud/u;Lod/a;Ljava/lang/String;Lmc/a;)Lod/d;

    .line 46
    .line 47
    .line 48
    move-result-object v9

    .line 49
    invoke-virtual {v3}, Lqc/d;->b()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    new-instance v8, Lpd/l;

    .line 54
    .line 55
    const/4 v12, 0x0

    .line 56
    const/4 v11, 0x7

    .line 57
    move-object/from16 v10, p1

    .line 58
    .line 59
    move/from16 v13, p2

    .line 60
    .line 61
    invoke-direct/range {v8 .. v13}, Lpd/n;-><init>(Lod/d;Lgf/a;IZZ)V

    .line 62
    .line 63
    .line 64
    iput v5, v8, Lpd/l;->r:I

    .line 65
    .line 66
    iget-object v6, v9, Lod/d;->h:Lqd/j;

    .line 67
    .line 68
    invoke-static {v4, v6}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    const/4 v7, 0x1

    .line 73
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    check-cast v9, Lnc/a;

    .line 78
    .line 79
    iget-object v9, v9, Lnc/a;->h:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v9, Ljava/lang/String;

    .line 82
    .line 83
    const/4 v10, 0x3

    .line 84
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    check-cast v10, Lnc/a;

    .line 89
    .line 90
    iget-object v10, v10, Lnc/a;->h:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v10, Lmc/a;

    .line 93
    .line 94
    invoke-static {v4, v6, v9, v10}, Lod/d;->c(Lud/u;Lod/a;Ljava/lang/String;Lmc/a;)Lod/d;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    iput-object v6, v8, Lpd/l;->q:Lod/d;

    .line 99
    .line 100
    invoke-virtual {v3}, Lqc/d;->a()Ljf/h;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-static {v4, v3}, Lod/d;->d(Lud/u;Ljf/h;)Lod/d;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-static {v5}, Lr9/e0;->w(I)I

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    iget-object v9, v3, Lod/d;->i:Ljava/util/List;

    .line 113
    .line 114
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    const/4 v11, 0x0

    .line 119
    if-eq v6, v7, :cond_0

    .line 120
    .line 121
    move v12, v7

    .line 122
    goto :goto_0

    .line 123
    :cond_0
    move v12, v11

    .line 124
    :goto_0
    if-eqz v12, :cond_1

    .line 125
    .line 126
    add-int/lit8 v10, v10, 0x1

    .line 127
    .line 128
    :cond_1
    new-instance v13, Lpd/n;

    .line 129
    .line 130
    invoke-direct {v13, v3, v6, v10}, Lpd/n;-><init>(Lod/d;II)V

    .line 131
    .line 132
    .line 133
    iget-object v6, v8, Lud/p;->m:Ljava/util/List;

    .line 134
    .line 135
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 136
    .line 137
    .line 138
    move-result v14

    .line 139
    :goto_1
    if-ge v11, v14, :cond_2

    .line 140
    .line 141
    invoke-virtual {v8, v11}, Lud/p;->S(I)Lqd/l;

    .line 142
    .line 143
    .line 144
    move-result-object v15

    .line 145
    invoke-virtual {v15}, Lqd/l;->H()Lqd/l;

    .line 146
    .line 147
    .line 148
    move-result-object v15

    .line 149
    invoke-virtual {v13, v15}, Lud/p;->I(Lqd/l;)V

    .line 150
    .line 151
    .line 152
    add-int/lit8 v11, v11, 0x1

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_2
    if-le v10, v14, :cond_5

    .line 156
    .line 157
    if-eqz v12, :cond_3

    .line 158
    .line 159
    add-int/lit8 v11, v14, -0x1

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_3
    move v11, v14

    .line 163
    :goto_2
    if-ge v14, v10, :cond_5

    .line 164
    .line 165
    if-gez v11, :cond_4

    .line 166
    .line 167
    iget-object v12, v3, Lod/d;->j:Lod/a;

    .line 168
    .line 169
    iget-object v12, v12, Lod/a;->g:Lqd/j;

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_4
    add-int/lit8 v12, v11, 0x1

    .line 173
    .line 174
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v11

    .line 178
    check-cast v11, Lqd/j;

    .line 179
    .line 180
    move/from16 v16, v12

    .line 181
    .line 182
    move-object v12, v11

    .line 183
    move/from16 v11, v16

    .line 184
    .line 185
    :goto_3
    new-instance v15, Lqd/p;

    .line 186
    .line 187
    const-string v7, "v"

    .line 188
    .line 189
    invoke-static {v14, v7}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    invoke-direct {v15, v7, v12}, Lqd/p;-><init>(Ljava/lang/String;Lqd/j;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v13, v15}, Lud/p;->I(Lqd/l;)V

    .line 197
    .line 198
    .line 199
    add-int/lit8 v14, v14, 0x1

    .line 200
    .line 201
    const/4 v7, 0x1

    .line 202
    goto :goto_2

    .line 203
    :cond_5
    const/16 v7, 0x8

    .line 204
    .line 205
    if-ne v5, v7, :cond_6

    .line 206
    .line 207
    new-instance v5, Ltd/a;

    .line 208
    .line 209
    iget-object v7, v13, Lpd/n;->p:Lod/d;

    .line 210
    .line 211
    invoke-direct {v5, v0, v13, v7}, Ltd/a;-><init>(Lud/r;Lpd/n;Lod/d;)V

    .line 212
    .line 213
    .line 214
    iput-object v5, v8, Lpd/l;->s:Lpd/b;

    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_6
    iput-object v13, v8, Lpd/l;->s:Lpd/b;

    .line 218
    .line 219
    :goto_4
    invoke-virtual {v4, v3}, Lud/u;->i(Lod/d;)Lud/r;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    if-eqz v0, :cond_7

    .line 224
    .line 225
    iget-object v3, v8, Lpd/l;->s:Lpd/b;

    .line 226
    .line 227
    invoke-virtual {v3, v0}, Lmd/e;->y(Loc/b;)V

    .line 228
    .line 229
    .line 230
    iget-object v3, v0, Lud/r;->m:Lb5/k;

    .line 231
    .line 232
    invoke-virtual {v3}, Lb5/k;->i()Z

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    if-eqz v3, :cond_7

    .line 237
    .line 238
    iget-object v3, v0, Lud/r;->l:Lud/e;

    .line 239
    .line 240
    invoke-virtual {v3, v2}, Lud/e;->equals(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    if-eqz v2, :cond_7

    .line 245
    .line 246
    sget-object v2, Lmd/a;->s:Lmd/a;

    .line 247
    .line 248
    invoke-virtual {v0, v2}, Lmd/e;->w(Lmd/a;)V

    .line 249
    .line 250
    .line 251
    const/4 v0, 0x1

    .line 252
    iput-boolean v0, v8, Lpd/l;->t:Z

    .line 253
    .line 254
    :cond_7
    iget-boolean v0, v8, Lpd/l;->t:Z

    .line 255
    .line 256
    if-nez v0, :cond_8

    .line 257
    .line 258
    const/4 v0, 0x5

    .line 259
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    check-cast v0, Lnc/a;

    .line 264
    .line 265
    iget-object v0, v0, Lnc/a;->h:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v0, Lmc/a;

    .line 268
    .line 269
    invoke-interface {v0}, Lmc/a;->c()Ljava/util/List;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    new-instance v1, Lme/a;

    .line 274
    .line 275
    const/4 v2, 0x6

    .line 276
    invoke-direct {v1, v2}, Lme/a;-><init>(I)V

    .line 277
    .line 278
    .line 279
    invoke-static {v0, v1}, Lxe/s;->c(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-interface {v0, v9}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    iput-boolean v0, v8, Lpd/l;->u:Z

    .line 288
    .line 289
    :cond_8
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    if-eqz v1, :cond_9

    .line 298
    .line 299
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    check-cast v1, Lqd/l;

    .line 304
    .line 305
    sget-object v2, Lmd/a;->q:Lmd/a;

    .line 306
    .line 307
    invoke-virtual {v1, v2}, Lmd/e;->w(Lmd/a;)V

    .line 308
    .line 309
    .line 310
    goto :goto_5

    .line 311
    :cond_9
    return-object v8

    .line 312
    :cond_a
    const-string v0, "Not yet supported"

    .line 313
    .line 314
    invoke-static {v0}, Lah/a;->k(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    const/4 v0, 0x0

    .line 318
    return-object v0
.end method

.method public static final h(Ll0/k;Ljava/lang/Integer;ILjava/lang/Integer;)Ljava/util/List;
    .locals 5

    .line 1
    iget-boolean v0, p0, Ll0/k;->w:Z

    .line 2
    .line 3
    if-nez v0, :cond_9

    .line 4
    .line 5
    invoke-virtual {p0}, Ll0/k;->p()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_9

    .line 10
    .line 11
    new-instance v0, Lx0/j;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lx0/j;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget p3, p0, Ll0/k;->v:I

    .line 24
    .line 25
    if-gez p3, :cond_1

    .line 26
    .line 27
    iget-object p3, p0, Ll0/k;->b:[I

    .line 28
    .line 29
    invoke-virtual {p0, p3, p2}, Ll0/k;->E([II)I

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    :cond_1
    :goto_0
    if-nez p1, :cond_3

    .line 34
    .line 35
    iget p1, p0, Ll0/k;->i:I

    .line 36
    .line 37
    iget-object v1, p0, Ll0/k;->b:[I

    .line 38
    .line 39
    invoke-virtual {p0, p2}, Ll0/k;->r(I)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {p0, v1, v2}, Ll0/k;->N([II)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    sub-int/2addr p1, v1

    .line 48
    iget-object v1, p0, Ll0/k;->s:Lf/w;

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    invoke-virtual {v1, p2}, Lf/k;->b(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Lf/f0;

    .line 57
    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    iget v1, v1, Lf/f0;->b:I

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    const/4 v1, 0x0

    .line 64
    :goto_1
    add-int/2addr p1, v1

    .line 65
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    :cond_3
    invoke-virtual {p0, p2}, Ll0/k;->r(I)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    mul-int/lit8 v1, v1, 0x5

    .line 74
    .line 75
    iget-object v2, p0, Ll0/k;->b:[I

    .line 76
    .line 77
    array-length v3, v2

    .line 78
    if-ge v1, v3, :cond_4

    .line 79
    .line 80
    invoke-virtual {p0, p2}, Ll0/k;->s(I)I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    goto :goto_3

    .line 85
    :cond_4
    if-ltz p3, :cond_5

    .line 86
    .line 87
    invoke-virtual {p0, v2, p3}, Ll0/k;->E([II)I

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    goto :goto_2

    .line 92
    :cond_5
    move p2, p3

    .line 93
    :goto_2
    invoke-virtual {p0, p3}, Ll0/k;->s(I)I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    goto :goto_5

    .line 98
    :goto_3
    if-ltz p2, :cond_8

    .line 99
    .line 100
    invoke-virtual {p0, p2}, Ll0/k;->r(I)I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    iget-object v3, p0, Ll0/k;->b:[I

    .line 105
    .line 106
    mul-int/lit8 v2, v2, 0x5

    .line 107
    .line 108
    add-int/lit8 v2, v2, 0x1

    .line 109
    .line 110
    aget v2, v3, v2

    .line 111
    .line 112
    const/high16 v3, 0x20000000

    .line 113
    .line 114
    and-int/2addr v2, v3

    .line 115
    if-eqz v2, :cond_6

    .line 116
    .line 117
    invoke-virtual {p0, p2}, Ll0/k;->t(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    goto :goto_4

    .line 122
    :cond_6
    sget-object v2, Li0/l;->a:Li0/e;

    .line 123
    .line 124
    :goto_4
    invoke-virtual {p0, p2}, Ll0/k;->O(I)Ll0/c;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-virtual {v0, v1, v2, v3, p1}, Lf1/n0;->m(ILjava/lang/Object;Ll0/c;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, p2}, Ll0/k;->b(I)Ll0/b;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    if-ltz p3, :cond_7

    .line 136
    .line 137
    iget-object p2, p0, Ll0/k;->b:[I

    .line 138
    .line 139
    invoke-virtual {p0, p2, p3}, Ll0/k;->E([II)I

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    invoke-virtual {p0, p3}, Ll0/k;->s(I)I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    :goto_5
    move v4, p3

    .line 148
    move p3, p2

    .line 149
    move p2, v4

    .line 150
    goto :goto_3

    .line 151
    :cond_7
    move p2, p3

    .line 152
    goto :goto_3

    .line 153
    :cond_8
    iget-object p0, v0, Lf1/n0;->g:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast p0, Ljava/util/ArrayList;

    .line 156
    .line 157
    return-object p0

    .line 158
    :cond_9
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 159
    .line 160
    return-object p0
.end method

.method public static i(Lud/r;)V
    .locals 14

    .line 1
    sget-object v0, Lmd/a;->l0:Lmd/a;

    .line 2
    .line 3
    iget-object v1, p0, Lmd/e;->g:Lmd/f;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    :try_start_0
    iget-object v0, p0, Lud/r;->z:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    new-instance v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    new-instance v2, Lbe/m0;

    .line 24
    .line 25
    const/4 v3, 0x3

    .line 26
    invoke-direct {v2, v3, v1}, Lbe/m0;-><init>(ILjava/util/ArrayList;)V

    .line 27
    .line 28
    .line 29
    iget-object v3, p0, Lud/r;->C:Lud/a;

    .line 30
    .line 31
    new-instance v4, Lae/d;

    .line 32
    .line 33
    const/16 v5, 0x1b

    .line 34
    .line 35
    invoke-direct {v4, v5}, Lae/d;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v3, v4, v2}, La/a;->d1(Lud/r;Lud/a;Ljava/util/function/Function;Ljava/util/function/Consumer;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    new-array v3, v0, [I

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    move v5, v4

    .line 49
    :goto_0
    if-ge v5, v2, :cond_1

    .line 50
    .line 51
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    check-cast v6, Lud/a;

    .line 56
    .line 57
    iget v6, v6, Lud/a;->j:I

    .line 58
    .line 59
    aput v6, v3, v5

    .line 60
    .line 61
    add-int/lit8 v5, v5, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    goto/16 :goto_8

    .line 66
    .line 67
    :catch_0
    move-exception v0

    .line 68
    goto/16 :goto_7

    .line 69
    .line 70
    :catch_1
    move-exception v0

    .line 71
    goto/16 :goto_7

    .line 72
    .line 73
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    move v6, v4

    .line 78
    :goto_1
    if-ge v6, v5, :cond_2

    .line 79
    .line 80
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    check-cast v7, Lud/a;

    .line 85
    .line 86
    iput v6, v7, Lud/a;->j:I

    .line 87
    .line 88
    add-int/lit8 v6, v6, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    new-instance v5, Lae/d;

    .line 92
    .line 93
    const/16 v6, 0x1c

    .line 94
    .line 95
    invoke-direct {v5, v6}, Lae/d;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-static {v1, v5}, Lf8/i;->h(Ljava/util/ArrayList;Ljava/util/function/Function;)[Lud/a;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    check-cast v6, Lud/a;

    .line 107
    .line 108
    sget-object v7, Lxe/g;->g:Lxe/g;

    .line 109
    .line 110
    iput-object v7, v6, Lud/a;->q:Ljava/util/BitSet;

    .line 111
    .line 112
    const/4 v7, 0x0

    .line 113
    iput-object v7, v6, Lud/a;->t:Lud/a;

    .line 114
    .line 115
    const/4 v6, 0x1

    .line 116
    move v8, v6

    .line 117
    :goto_2
    if-ge v8, v2, :cond_5

    .line 118
    .line 119
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    check-cast v9, Lud/a;

    .line 124
    .line 125
    aget-object v10, v5, v8

    .line 126
    .line 127
    iput-object v10, v9, Lud/a;->t:Lud/a;

    .line 128
    .line 129
    new-instance v11, Ljava/util/BitSet;

    .line 130
    .line 131
    array-length v12, v5

    .line 132
    invoke-direct {v11, v12}, Ljava/util/BitSet;-><init>(I)V

    .line 133
    .line 134
    .line 135
    :goto_3
    iget v12, v10, Lud/a;->j:I

    .line 136
    .line 137
    invoke-virtual {v11, v12}, Ljava/util/BitSet;->get(I)Z

    .line 138
    .line 139
    .line 140
    move-result v13

    .line 141
    if-eqz v13, :cond_3

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_3
    invoke-virtual {v11, v12}, Ljava/util/BitSet;->set(I)V

    .line 145
    .line 146
    .line 147
    iget-object v10, v10, Lud/a;->p:Ljava/util/BitSet;

    .line 148
    .line 149
    if-eqz v10, :cond_4

    .line 150
    .line 151
    invoke-virtual {v11, v10}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    .line 152
    .line 153
    .line 154
    :goto_4
    iput-object v11, v9, Lud/a;->q:Ljava/util/BitSet;

    .line 155
    .line 156
    add-int/lit8 v8, v8, 0x1

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_4
    aget-object v10, v5, v12

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_5
    :goto_5
    if-ge v6, v2, :cond_6

    .line 163
    .line 164
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    check-cast v5, Lud/a;

    .line 169
    .line 170
    new-instance v8, Ljava/util/BitSet;

    .line 171
    .line 172
    invoke-direct {v8, v2}, Ljava/util/BitSet;-><init>(I)V

    .line 173
    .line 174
    .line 175
    iget-object v9, v5, Lud/a;->q:Ljava/util/BitSet;

    .line 176
    .line 177
    invoke-virtual {v9}, Ljava/util/BitSet;->stream()Ljava/util/stream/IntStream;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    new-instance v10, Lce/q;

    .line 182
    .line 183
    invoke-direct {v10, v8, v3}, Lce/q;-><init>(Ljava/util/BitSet;[I)V

    .line 184
    .line 185
    .line 186
    invoke-interface {v9, v10}, Ljava/util/stream/IntStream;->forEach(Ljava/util/function/IntConsumer;)V

    .line 187
    .line 188
    .line 189
    aget v9, v3, v6

    .line 190
    .line 191
    invoke-virtual {v8, v9}, Ljava/util/BitSet;->clear(I)V

    .line 192
    .line 193
    .line 194
    iput-object v8, v5, Lud/a;->q:Ljava/util/BitSet;

    .line 195
    .line 196
    add-int/lit8 v6, v6, 0x1

    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_6
    sub-int/2addr v0, v2

    .line 200
    if-eqz v0, :cond_9

    .line 201
    .line 202
    iget-object v1, p0, Lud/r;->z:Ljava/util/List;

    .line 203
    .line 204
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    :cond_7
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-eqz v2, :cond_8

    .line 213
    .line 214
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    check-cast v2, Lud/a;

    .line 219
    .line 220
    iget-object v3, v2, Lud/a;->q:Ljava/util/BitSet;

    .line 221
    .line 222
    if-nez v3, :cond_7

    .line 223
    .line 224
    sget-object v3, Lxe/g;->g:Lxe/g;

    .line 225
    .line 226
    iput-object v3, v2, Lud/a;->q:Ljava/util/BitSet;

    .line 227
    .line 228
    iput-object v7, v2, Lud/a;->t:Lud/a;

    .line 229
    .line 230
    iget-object v2, v2, Lud/a;->l:Ljava/util/ArrayList;

    .line 231
    .line 232
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    add-int/2addr v4, v2

    .line 237
    goto :goto_6

    .line 238
    :cond_8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 239
    .line 240
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 241
    .line 242
    .line 243
    const-string v2, "Infinite loop detected, blocks: "

    .line 244
    .line 245
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    const-string v0, ", insns: "

    .line 252
    .line 253
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-virtual {p0, v0}, Lnd/b0;->J(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 264
    .line 265
    .line 266
    :cond_9
    invoke-virtual {p0}, Lud/r;->f0()V

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    :goto_7
    :try_start_1
    const-string v1, "Failed to build post-dominance tree"

    .line 271
    .line 272
    invoke-virtual {p0, v1, v0}, Lnd/b0;->M(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 273
    .line 274
    .line 275
    invoke-virtual {p0}, Lud/r;->f0()V

    .line 276
    .line 277
    .line 278
    return-void

    .line 279
    :goto_8
    invoke-virtual {p0}, Lud/r;->f0()V

    .line 280
    .line 281
    .line 282
    throw v0
.end method

.method public static final j(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    .locals 6

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    :goto_0
    if-ltz v1, :cond_0

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    invoke-virtual {p1, v0, v4, v1}, Ljava/io/OutputStream;->write([BII)V

    .line 15
    .line 16
    .line 17
    int-to-long v4, v1

    .line 18
    add-long/2addr v2, v4

    .line 19
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-wide v2
.end method

.method public static k(Ljava/lang/String;)Ljava/lang/String;
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
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string p0, ""

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_7

    .line 18
    .line 19
    :try_start_0
    invoke-virtual {v0, p0}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 20
    .line 21
    .line 22
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v1

    .line 25
    new-instance v2, Lsf/f;

    .line 26
    .line 27
    invoke-direct {v2, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    move-object v1, v2

    .line 31
    :goto_0
    nop

    .line 32
    instance-of v2, v1, Lsf/f;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    move-object v1, v3

    .line 38
    :cond_1
    check-cast v1, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 39
    .line 40
    if-eqz v1, :cond_5

    .line 41
    .line 42
    invoke-virtual {v1}, Lh/Hchat/hooks/api/model/WeChatContact;->isOfficialAccount()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_5

    .line 47
    .line 48
    iget-object v2, v1, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-nez v4, :cond_2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    move-object v2, v3

    .line 58
    :goto_1
    if-eqz v2, :cond_3

    .line 59
    .line 60
    return-object v2

    .line 61
    :cond_3
    iget-object v1, v1, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-nez v2, :cond_4

    .line 68
    .line 69
    move-object v3, v1

    .line 70
    :cond_4
    if-eqz v3, :cond_5

    .line 71
    .line 72
    return-object v3

    .line 73
    :cond_5
    invoke-virtual {v0, p0}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_6

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_6
    move-object p0, v0

    .line 85
    :cond_7
    :goto_2
    return-object p0
.end method

.method public static final l([F[F)F
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    :goto_0
    if-ge v2, v0, :cond_0

    .line 5
    .line 6
    aget v3, p0, v2

    .line 7
    .line 8
    aget v4, p1, v2

    .line 9
    .line 10
    mul-float/2addr v3, v4

    .line 11
    add-float/2addr v1, v3

    .line 12
    add-int/lit8 v2, v2, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return v1
.end method

.method public static m(Lac/o;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lac/o;->b:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, " "

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string p1, "FastKV"

    .line 24
    .line 25
    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static final n(Ll0/g;Li0/o;II)Ljava/lang/Integer;
    .locals 5

    .line 1
    iget-object v0, p0, Ll0/g;->b:[I

    .line 2
    .line 3
    :goto_0
    const/4 v1, 0x0

    .line 4
    if-ge p2, p3, :cond_5

    .line 5
    .line 6
    mul-int/lit8 v2, p2, 0x5

    .line 7
    .line 8
    add-int/lit8 v2, v2, 0x3

    .line 9
    .line 10
    aget v2, v0, v2

    .line 11
    .line 12
    add-int/2addr v2, p2

    .line 13
    invoke-virtual {p0, p2}, Ll0/g;->j(I)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_3

    .line 18
    .line 19
    invoke-virtual {p0, p2}, Ll0/g;->i(I)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/16 v4, 0xce

    .line 24
    .line 25
    if-ne v3, v4, :cond_3

    .line 26
    .line 27
    invoke-virtual {p0, v0, p2}, Ll0/g;->p([II)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    sget-object v4, Li0/m;->e:Li0/d1;

    .line 32
    .line 33
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_3

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-virtual {p0, p2, v3}, Ll0/g;->h(II)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    instance-of v4, v3, Li0/k0;

    .line 45
    .line 46
    if-eqz v4, :cond_0

    .line 47
    .line 48
    check-cast v3, Li0/k0;

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    move-object v3, v1

    .line 52
    :goto_1
    if-eqz v3, :cond_1

    .line 53
    .line 54
    iget-object v3, v3, Li0/k0;->a:Li0/a2;

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_1
    move-object v3, v1

    .line 58
    :goto_2
    instance-of v4, v3, Li0/e0;

    .line 59
    .line 60
    if-eqz v4, :cond_2

    .line 61
    .line 62
    move-object v1, v3

    .line 63
    check-cast v1, Li0/e0;

    .line 64
    .line 65
    :cond_2
    if-eqz v1, :cond_3

    .line 66
    .line 67
    iget-object v1, v1, Li0/e0;->g:Li0/f0;

    .line 68
    .line 69
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :cond_3
    invoke-virtual {p0, p2}, Ll0/g;->d(I)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_4

    .line 85
    .line 86
    add-int/lit8 p2, p2, 0x1

    .line 87
    .line 88
    invoke-static {p0, p1, p2, v2}, Lg4/a;->n(Ll0/g;Li0/o;II)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    if-eqz p2, :cond_4

    .line 93
    .line 94
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0

    .line 103
    :cond_4
    move p2, v2

    .line 104
    goto :goto_0

    .line 105
    :cond_5
    return-object v1
.end method

.method public static o(Lk9/j;)Lk9/c;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lk9/j;->a:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v1, p0, Lk9/j;->c:Ljava/lang/String;

    .line 7
    .line 8
    const-string v2, "module_settings"

    .line 9
    .line 10
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    sget-object p0, Lk9/c;->h:Lk9/c;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    iget-object p0, p0, Lk9/j;->d:Ljava/lang/String;

    .line 20
    .line 21
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const-string v1, "scan"

    .line 31
    .line 32
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_a

    .line 37
    .line 38
    const-string v1, "scanner"

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-static {p0, v1, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    goto :goto_4

    .line 48
    :cond_1
    const-string v1, "moments"

    .line 49
    .line 50
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_9

    .line 55
    .line 56
    const-string v1, ".sns."

    .line 57
    .line 58
    invoke-static {p0, v1, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_2
    const-string v1, "finder"

    .line 66
    .line 67
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-nez v1, :cond_8

    .line 72
    .line 73
    const-string v1, ".finder."

    .line 74
    .line 75
    invoke-static {p0, v1, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    const-string v1, "favorite"

    .line 83
    .line 84
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-nez v1, :cond_7

    .line 89
    .line 90
    const-string v1, ".fav."

    .line 91
    .line 92
    invoke-static {p0, v1, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_4

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    const-string v1, "wallet"

    .line 100
    .line 101
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_6

    .line 106
    .line 107
    const-string v0, ".mall."

    .line 108
    .line 109
    invoke-static {p0, v0, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_6

    .line 114
    .line 115
    const-string v0, ".wallet"

    .line 116
    .line 117
    invoke-static {p0, v0, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    if-eqz p0, :cond_5

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_5
    sget-object p0, Lk9/c;->n:Lk9/c;

    .line 125
    .line 126
    return-object p0

    .line 127
    :cond_6
    :goto_0
    sget-object p0, Lk9/c;->m:Lk9/c;

    .line 128
    .line 129
    return-object p0

    .line 130
    :cond_7
    :goto_1
    sget-object p0, Lk9/c;->l:Lk9/c;

    .line 131
    .line 132
    return-object p0

    .line 133
    :cond_8
    :goto_2
    sget-object p0, Lk9/c;->k:Lk9/c;

    .line 134
    .line 135
    return-object p0

    .line 136
    :cond_9
    :goto_3
    sget-object p0, Lk9/c;->j:Lk9/c;

    .line 137
    .line 138
    return-object p0

    .line 139
    :cond_a
    :goto_4
    sget-object p0, Lk9/c;->i:Lk9/c;

    .line 140
    .line 141
    return-object p0
.end method

.method public static p(Lorg/luckypray/dexkit/DexKitBridge;Ljh/p;)Lhh/o;
    .locals 14

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xa

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lg6/c;->b(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v2, p1, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    iget v3, p1, Lg6/c;->a:I

    .line 16
    .line 17
    add-int/2addr v0, v3

    .line 18
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v0, v1

    .line 24
    :goto_0
    const/high16 v2, 0x20000

    .line 25
    .line 26
    and-int v3, v0, v2

    .line 27
    .line 28
    if-lez v3, :cond_1

    .line 29
    .line 30
    xor-int/2addr v0, v2

    .line 31
    or-int/lit8 v0, v0, 0x20

    .line 32
    .line 33
    :cond_1
    move v7, v0

    .line 34
    const/4 v0, 0x4

    .line 35
    invoke-virtual {p1, v0}, Lg6/c;->b(I)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object v2, p1, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 42
    .line 43
    iget v3, p1, Lg6/c;->a:I

    .line 44
    .line 45
    add-int/2addr v0, v3

    .line 46
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    move v4, v0

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move v4, v1

    .line 53
    :goto_1
    const/4 v0, 0x6

    .line 54
    invoke-virtual {p1, v0}, Lg6/c;->b(I)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    iget-object v2, p1, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 61
    .line 62
    iget v3, p1, Lg6/c;->a:I

    .line 63
    .line 64
    add-int/2addr v0, v3

    .line 65
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    move v5, v0

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    move v5, v1

    .line 72
    :goto_2
    const/16 v0, 0x8

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Lg6/c;->b(I)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    iget-object v2, p1, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 81
    .line 82
    iget v3, p1, Lg6/c;->a:I

    .line 83
    .line 84
    add-int/2addr v0, v3

    .line 85
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    move v6, v0

    .line 90
    goto :goto_3

    .line 91
    :cond_4
    move v6, v1

    .line 92
    :goto_3
    const/16 v0, 0xc

    .line 93
    .line 94
    invoke-virtual {p1, v0}, Lg6/c;->b(I)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_5

    .line 99
    .line 100
    iget v2, p1, Lg6/c;->a:I

    .line 101
    .line 102
    add-int/2addr v0, v2

    .line 103
    invoke-virtual {p1, v0}, Lg6/c;->d(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    goto :goto_4

    .line 108
    :cond_5
    const/4 v0, 0x0

    .line 109
    :goto_4
    if-nez v0, :cond_6

    .line 110
    .line 111
    const-string v0, ""

    .line 112
    .line 113
    :cond_6
    move-object v8, v0

    .line 114
    const/16 v0, 0xe

    .line 115
    .line 116
    invoke-virtual {p1, v0}, Lg6/c;->b(I)I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-eqz v0, :cond_7

    .line 121
    .line 122
    iget-object v2, p1, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 123
    .line 124
    iget v3, p1, Lg6/c;->a:I

    .line 125
    .line 126
    add-int/2addr v0, v3

    .line 127
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    move v9, v0

    .line 132
    goto :goto_5

    .line 133
    :cond_7
    move v9, v1

    .line 134
    :goto_5
    new-instance v10, Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 137
    .line 138
    .line 139
    const/16 v0, 0x10

    .line 140
    .line 141
    invoke-virtual {p1, v0}, Lg6/c;->b(I)I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-eqz v2, :cond_8

    .line 146
    .line 147
    invoke-virtual {p1, v2}, Lg6/c;->f(I)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    goto :goto_6

    .line 152
    :cond_8
    move v2, v1

    .line 153
    :goto_6
    move v3, v1

    .line 154
    :goto_7
    if-ge v3, v2, :cond_a

    .line 155
    .line 156
    invoke-virtual {p1, v0}, Lg6/c;->b(I)I

    .line 157
    .line 158
    .line 159
    move-result v11

    .line 160
    if-eqz v11, :cond_9

    .line 161
    .line 162
    iget-object v12, p1, Lg6/c;->b:Ljava/nio/ByteBuffer;

    .line 163
    .line 164
    invoke-virtual {p1, v11}, Lg6/c;->e(I)I

    .line 165
    .line 166
    .line 167
    move-result v11

    .line 168
    mul-int/lit8 v13, v3, 0x4

    .line 169
    .line 170
    add-int/2addr v13, v11

    .line 171
    invoke-virtual {v12, v13}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 172
    .line 173
    .line 174
    move-result v11

    .line 175
    goto :goto_8

    .line 176
    :cond_9
    move v11, v1

    .line 177
    :goto_8
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object v11

    .line 181
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    add-int/lit8 v3, v3, 0x1

    .line 185
    .line 186
    goto :goto_7

    .line 187
    :cond_a
    new-instance v2, Lhh/o;

    .line 188
    .line 189
    move-object v3, p0

    .line 190
    invoke-direct/range {v2 .. v10}, Lhh/o;-><init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILjava/util/ArrayList;)V

    .line 191
    .line 192
    .line 193
    return-object v2
.end method

.method public static final q(Lm2/k;I)I
    .locals 2

    .line 1
    sget-object v0, Lm2/k;->h:Lm2/k;

    .line 2
    .line 3
    iget p0, p0, Lm2/k;->g:I

    .line 4
    .line 5
    iget v0, v0, Lm2/k;->g:I

    .line 6
    .line 7
    invoke-static {p0, v0}, Lgg/l;->c(II)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-ltz p0, :cond_0

    .line 14
    .line 15
    move p0, v1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move p0, v0

    .line 18
    :goto_0
    if-ne p1, v1, :cond_1

    .line 19
    .line 20
    move p1, v1

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move p1, v0

    .line 23
    :goto_1
    if-eqz p1, :cond_2

    .line 24
    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    const/4 p0, 0x3

    .line 28
    return p0

    .line 29
    :cond_2
    if-eqz p0, :cond_3

    .line 30
    .line 31
    return v1

    .line 32
    :cond_3
    if-eqz p1, :cond_4

    .line 33
    .line 34
    const/4 p0, 0x2

    .line 35
    return p0

    .line 36
    :cond_4
    return v0
.end method

.method public static r(Li0/h0;)Lbi/b;
    .locals 1

    .line 1
    sget-object v0, Lbi/d;->a:Li0/m2;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lbi/b;

    .line 8
    .line 9
    return-object p0
.end method

.method public static s(Ljava/lang/Object;)Lv4/f0;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lv4/r;->g:Lv4/r;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    check-cast p0, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    sget-object p0, Lv4/f;->i:Lv4/f;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    sget-object p0, Lv4/f;->h:Lv4/f;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_2
    instance-of v0, p0, Ljava/lang/Byte;

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    check-cast p0, Ljava/lang/Byte;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Byte;->byteValue()B

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    new-instance v0, Lv4/g;

    .line 35
    .line 36
    invoke-direct {v0, p0}, Lv4/s;-><init>(I)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_3
    instance-of v0, p0, Ljava/lang/Character;

    .line 41
    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    check-cast p0, Ljava/lang/Character;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Character;->charValue()C

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    new-instance v0, Lv4/j;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Lv4/s;-><init>(I)V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_4
    instance-of v0, p0, Ljava/lang/Double;

    .line 57
    .line 58
    if-eqz v0, :cond_5

    .line 59
    .line 60
    check-cast p0, Ljava/lang/Double;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 63
    .line 64
    .line 65
    move-result-wide v0

    .line 66
    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    new-instance p0, Lv4/k;

    .line 71
    .line 72
    invoke-direct {p0, v0, v1}, Lv4/t;-><init>(J)V

    .line 73
    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_5
    instance-of v0, p0, Ljava/lang/Float;

    .line 77
    .line 78
    if-eqz v0, :cond_6

    .line 79
    .line 80
    check-cast p0, Ljava/lang/Float;

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    invoke-static {p0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    new-instance v0, Lv4/n;

    .line 91
    .line 92
    invoke-direct {v0, p0}, Lv4/s;-><init>(I)V

    .line 93
    .line 94
    .line 95
    return-object v0

    .line 96
    :cond_6
    instance-of v0, p0, Ljava/lang/Integer;

    .line 97
    .line 98
    if-eqz v0, :cond_7

    .line 99
    .line 100
    check-cast p0, Ljava/lang/Integer;

    .line 101
    .line 102
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    invoke-static {p0}, Lv4/o;->o(I)Lv4/o;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :cond_7
    instance-of v0, p0, Ljava/lang/Long;

    .line 112
    .line 113
    if-eqz v0, :cond_8

    .line 114
    .line 115
    check-cast p0, Ljava/lang/Long;

    .line 116
    .line 117
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 118
    .line 119
    .line 120
    move-result-wide v0

    .line 121
    new-instance p0, Lv4/v;

    .line 122
    .line 123
    invoke-direct {p0, v0, v1}, Lv4/t;-><init>(J)V

    .line 124
    .line 125
    .line 126
    return-object p0

    .line 127
    :cond_8
    instance-of v0, p0, Ljava/lang/Short;

    .line 128
    .line 129
    if-eqz v0, :cond_9

    .line 130
    .line 131
    check-cast p0, Ljava/lang/Short;

    .line 132
    .line 133
    invoke-virtual {p0}, Ljava/lang/Short;->shortValue()S

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    new-instance v0, Lv4/b0;

    .line 138
    .line 139
    invoke-direct {v0, p0}, Lv4/s;-><init>(I)V

    .line 140
    .line 141
    .line 142
    return-object v0

    .line 143
    :cond_9
    instance-of v0, p0, Ljava/lang/String;

    .line 144
    .line 145
    if-eqz v0, :cond_a

    .line 146
    .line 147
    new-instance v0, Lv4/c0;

    .line 148
    .line 149
    check-cast p0, Ljava/lang/String;

    .line 150
    .line 151
    invoke-direct {v0, p0}, Lv4/c0;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-object v0

    .line 155
    :cond_a
    instance-of v0, p0, Ljava/lang/Class;

    .line 156
    .line 157
    if-eqz v0, :cond_b

    .line 158
    .line 159
    new-instance v0, Lv4/d0;

    .line 160
    .line 161
    check-cast p0, Ljava/lang/Class;

    .line 162
    .line 163
    invoke-static {p0}, Lg4/j;->a(Ljava/lang/Class;)Lg4/j;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    iget-object p0, p0, Lg4/j;->b:Lw4/c;

    .line 168
    .line 169
    invoke-direct {v0, p0}, Lv4/d0;-><init>(Lw4/c;)V

    .line 170
    .line 171
    .line 172
    return-object v0

    .line 173
    :cond_b
    instance-of v0, p0, Lg4/j;

    .line 174
    .line 175
    if-eqz v0, :cond_c

    .line 176
    .line 177
    new-instance v0, Lv4/d0;

    .line 178
    .line 179
    check-cast p0, Lg4/j;

    .line 180
    .line 181
    iget-object p0, p0, Lg4/j;->b:Lw4/c;

    .line 182
    .line 183
    invoke-direct {v0, p0}, Lv4/d0;-><init>(Lw4/c;)V

    .line 184
    .line 185
    .line 186
    return-object v0

    .line 187
    :cond_c
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 188
    .line 189
    new-instance v1, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    const-string v2, "Not a constant: "

    .line 192
    .line 193
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw v0
.end method

.method public static final t(Lz0/m;)[Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p0, Lz0/e;

    .line 5
    .line 6
    iget-object p0, p0, Lz0/e;->b:Ljava/util/Set;

    .line 7
    .line 8
    check-cast p0, Ljava/util/Collection;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    new-array v0, v0, [Ljava/lang/String;

    .line 12
    .line 13
    invoke-interface {p0, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, [Ljava/lang/String;

    .line 18
    .line 19
    return-object p0
.end method

.method public static u(Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    const-string v1, "path"

    .line 3
    .line 4
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :catch_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string p1, "DexPathList"

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/16 v2, 0x5d

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    const/16 v4, 0x5b

    .line 32
    .line 33
    if-eqz v1, :cond_4

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    add-int/lit8 v1, p1, 0xb

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    add-int/lit8 p1, p1, 0xf

    .line 46
    .line 47
    if-le v5, p1, :cond_7

    .line 48
    .line 49
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-ne v2, v4, :cond_7

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-ne v0, v4, :cond_7

    .line 68
    .line 69
    if-ltz v1, :cond_7

    .line 70
    .line 71
    const/4 p0, 0x2

    .line 72
    invoke-virtual {p1, p0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    const-string p1, ","

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    move p1, v3

    .line 83
    :goto_0
    array-length v0, p0

    .line 84
    if-ge p1, v0, :cond_1

    .line 85
    .line 86
    aget-object v0, p0, p1

    .line 87
    .line 88
    const/16 v1, 0x22

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    aget-object v2, p0, p1

    .line 95
    .line 96
    invoke-virtual {v2, v1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-lez v0, :cond_0

    .line 101
    .line 102
    if-ge v0, v1, :cond_0

    .line 103
    .line 104
    aget-object v2, p0, p1

    .line 105
    .line 106
    add-int/lit8 v0, v0, 0x1

    .line 107
    .line 108
    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    aput-object v0, p0, p1

    .line 113
    .line 114
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    .line 121
    .line 122
    array-length v0, p0

    .line 123
    :goto_1
    if-ge v3, v0, :cond_3

    .line 124
    .line 125
    aget-object v1, p0, v3

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-lez v2, :cond_2

    .line 132
    .line 133
    const/16 v2, 0x3a

    .line 134
    .line 135
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    :cond_2
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    add-int/lit8 v3, v3, 0x1

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_3
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    goto :goto_3

    .line 149
    :cond_4
    invoke-virtual {p0, v4}, Ljava/lang/String;->lastIndexOf(I)I

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    const/4 v1, -0x1

    .line 154
    if-ne p1, v1, :cond_5

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_5
    add-int/2addr p1, v0

    .line 158
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    :goto_2
    invoke-virtual {p0, v2}, Ljava/lang/String;->indexOf(I)I

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-ne p1, v1, :cond_6

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_6
    invoke-virtual {p0, v3, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    :cond_7
    :goto_3
    return-object p0
.end method

.method public static v(Ljava/lang/String;)[Ljava/io/File;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "dexPath="

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, -0x1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    const/16 v1, 0x2c

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/16 v3, 0x8

    .line 22
    .line 23
    if-ne v1, v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    :cond_1
    :goto_0
    const-string v1, ":"

    .line 35
    .line 36
    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    array-length v1, p0

    .line 41
    const/4 v3, 0x0

    .line 42
    :goto_1
    if-ge v3, v1, :cond_d

    .line 43
    .line 44
    aget-object v4, p0, v3

    .line 45
    .line 46
    const-string v5, "/data/app/"

    .line 47
    .line 48
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-nez v5, :cond_2

    .line 53
    .line 54
    goto/16 :goto_5

    .line 55
    .line 56
    :cond_2
    const-string v5, ".apk"

    .line 57
    .line 58
    invoke-virtual {v4, v5}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    add-int/lit8 v6, v6, -0x4

    .line 67
    .line 68
    if-eq v5, v6, :cond_3

    .line 69
    .line 70
    goto/16 :goto_5

    .line 71
    .line 72
    :cond_3
    const-string v6, "/"

    .line 73
    .line 74
    invoke-virtual {v4, v6, v5}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;I)I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    const/16 v7, 0x9

    .line 79
    .line 80
    if-ne v5, v7, :cond_4

    .line 81
    .line 82
    goto/16 :goto_5

    .line 83
    .line 84
    :cond_4
    add-int/lit8 v5, v5, -0x1

    .line 85
    .line 86
    invoke-virtual {v4, v6, v5}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;I)I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-ne v5, v2, :cond_5

    .line 91
    .line 92
    goto/16 :goto_5

    .line 93
    .line 94
    :cond_5
    const-string v6, "-"

    .line 95
    .line 96
    invoke-virtual {v4, v6, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-ne v6, v2, :cond_6

    .line 101
    .line 102
    goto/16 :goto_5

    .line 103
    .line 104
    :cond_6
    add-int/lit8 v5, v5, 0x1

    .line 105
    .line 106
    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    const-string v5, "/data/data/"

    .line 111
    .line 112
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    new-instance v6, Ljava/io/File;

    .line 117
    .line 118
    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    const/4 v7, 0x0

    .line 126
    if-eqz v5, :cond_7

    .line 127
    .line 128
    invoke-virtual {v6}, Ljava/io/File;->canWrite()Z

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    if-eqz v5, :cond_7

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_7
    move-object v6, v7

    .line 136
    :goto_2
    if-nez v6, :cond_a

    .line 137
    .line 138
    :try_start_0
    const-string v5, "android.os.Process"

    .line 139
    .line 140
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    const-string v6, "myUid"

    .line 145
    .line 146
    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    invoke-virtual {v5, v7, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    check-cast v5, Ljava/lang/Integer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :catch_0
    move-object v5, v7

    .line 158
    :goto_3
    if-nez v5, :cond_8

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_8
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    const v6, 0x186a0

    .line 166
    .line 167
    .line 168
    div-int/2addr v5, v6

    .line 169
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    filled-new-array {v5, v4}, [Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    const-string v5, "/data/user/%d/%s"

    .line 178
    .line 179
    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    new-instance v5, Ljava/io/File;

    .line 184
    .line 185
    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    if-eqz v4, :cond_9

    .line 193
    .line 194
    invoke-virtual {v5}, Ljava/io/File;->canWrite()Z

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    if-eqz v4, :cond_9

    .line 199
    .line 200
    move-object v7, v5

    .line 201
    :cond_9
    :goto_4
    move-object v6, v7

    .line 202
    :cond_a
    if-eqz v6, :cond_c

    .line 203
    .line 204
    new-instance v4, Ljava/io/File;

    .line 205
    .line 206
    const-string v5, "cache"

    .line 207
    .line 208
    invoke-direct {v4, v6, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    if-nez v5, :cond_b

    .line 216
    .line 217
    invoke-virtual {v4}, Ljava/io/File;->mkdir()Z

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    if-eqz v5, :cond_c

    .line 222
    .line 223
    :cond_b
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    if-eqz v5, :cond_c

    .line 228
    .line 229
    invoke-virtual {v4}, Ljava/io/File;->canWrite()Z

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    if-eqz v5, :cond_c

    .line 234
    .line 235
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    :cond_c
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 239
    .line 240
    goto/16 :goto_1

    .line 241
    .line 242
    :cond_d
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 243
    .line 244
    .line 245
    move-result p0

    .line 246
    new-array p0, p0, [Ljava/io/File;

    .line 247
    .line 248
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    check-cast p0, [Ljava/io/File;

    .line 253
    .line 254
    return-object p0
.end method

.method public static w(Lh/Hchat/dexkit/DexBridgeHolder;Landroid/content/Context;)Lfb/j0;
    .locals 9

    .line 1
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Lh/Hchat/dexkit/DexBridgeHolder;->getApkPath()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 11
    .line 12
    .line 13
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    new-instance v1, Lsf/f;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    move-object v0, v1

    .line 22
    :goto_0
    new-instance v1, Ljava/io/File;

    .line 23
    .line 24
    invoke-virtual {p0}, Lh/Hchat/dexkit/DexBridgeHolder;->getApkPath()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    instance-of v2, v0, Lsf/f;

    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    move-object v0, v1

    .line 36
    :cond_0
    check-cast v0, Ljava/io/File;

    .line 37
    .line 38
    new-instance v1, Lfb/j0;

    .line 39
    .line 40
    invoke-virtual {p0}, Lh/Hchat/dexkit/DexBridgeHolder;->getDexKitBridge()Lorg/luckypray/dexkit/DexKitBridge;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    sget-object v2, Lfb/n0;->a:Ljava/util/Set;

    .line 55
    .line 56
    invoke-static {v0}, Lfb/n0;->c0(Ljava/io/File;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {p0}, Lh/Hchat/dexkit/DexBridgeHolder;->getHostClassLoader()Ljava/lang/ClassLoader;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    const/4 v8, 0x0

    .line 69
    const-string v6, "current_wechat_apk"

    .line 70
    .line 71
    move-object v2, p1

    .line 72
    invoke-direct/range {v1 .. v8}, Lfb/j0;-><init>(Landroid/content/Context;Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 73
    .line 74
    .line 75
    return-object v1
.end method

.method public static final x(II)I
    .locals 0

    .line 1
    shr-int/2addr p0, p1

    .line 2
    and-int/lit8 p0, p0, 0x1f

    .line 3
    .line 4
    return p0
.end method

.method public static y(Lac/o;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lac/o;->b:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, " "

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string p1, "FastKV"

    .line 24
    .line 25
    invoke-static {p1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static z(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_5

    .line 3
    .line 4
    invoke-static {p0}, Lg4/a;->B(Ljava/lang/Object;)J

    .line 5
    .line 6
    .line 7
    move-result-wide v1

    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    cmp-long v1, v1, v3

    .line 11
    .line 12
    if-gtz v1, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    const-string v1, "field_type"

    .line 16
    .line 17
    invoke-static {p0, v1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    instance-of v2, v1, Ljava/lang/Number;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    check-cast v1, Ljava/lang/Number;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v1, v3

    .line 30
    :goto_0
    if-eqz v1, :cond_2

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    const-string v1, "type"

    .line 38
    .line 39
    invoke-static {p0, v1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    instance-of v2, v1, Ljava/lang/Number;

    .line 44
    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    move-object v3, v1

    .line 48
    check-cast v3, Ljava/lang/Number;

    .line 49
    .line 50
    :cond_3
    if-eqz v3, :cond_4

    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    goto :goto_1

    .line 57
    :cond_4
    move v1, v0

    .line 58
    :goto_1
    if-lez v1, :cond_5

    .line 59
    .line 60
    const-string v1, "field_favProto"

    .line 61
    .line 62
    invoke-static {p0, v1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-eqz p0, :cond_5

    .line 67
    .line 68
    const/4 p0, 0x1

    .line 69
    return p0

    .line 70
    :cond_5
    :goto_2
    return v0
.end method
