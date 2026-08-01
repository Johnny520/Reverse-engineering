.class public final Lgf1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lgf1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lgf1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lgf1;->α:Lgf1;

    .line 7
    .line 8
    return-void
.end method

.method public static α(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "__smart__"

    .line 24
    .line 25
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v2, 0x0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    move-object p0, v1

    .line 33
    goto :goto_2

    .line 34
    :cond_0
    const/16 v0, 0xa

    .line 35
    .line 36
    invoke-static {p0, v0}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    if-eqz p0, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-lez v0, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move-object p0, v2

    .line 50
    :goto_0
    if-eqz p0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    move-object p0, v2

    .line 58
    :goto_1
    if-nez p0, :cond_3

    .line 59
    .line 60
    const-string p0, ""

    .line 61
    .line 62
    :cond_3
    :goto_2
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    const-string v3, "\u667a\u80fd\u9009\u62e9"

    .line 75
    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    return-object v3

    .line 79
    :cond_4
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    const-string v4, "\u672a\u9009\u62e9"

    .line 84
    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    return-object v4

    .line 88
    :cond_5
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-static {v5, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_6

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_6
    invoke-static {}, Lgf1;->γ()Lef1;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    iget-object v1, v1, Lef1;->α:Ljava/util/List;

    .line 119
    .line 120
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-eqz v3, :cond_8

    .line 129
    .line 130
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    move-object v5, v3

    .line 135
    check-cast v5, Ldf1;

    .line 136
    .line 137
    iget-object v5, v5, Ldf1;->α:Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {v5, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    if-eqz v5, :cond_7

    .line 144
    .line 145
    move-object v2, v3

    .line 146
    :cond_8
    check-cast v2, Ldf1;

    .line 147
    .line 148
    if-eqz v2, :cond_9

    .line 149
    .line 150
    iget-object v3, v2, Ldf1;->β:Ljava/lang/String;

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_9
    const-string v1, "204"

    .line 154
    .line 155
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-eqz v1, :cond_a

    .line 160
    .line 161
    const-string v3, "\u8fa3\u6761"

    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_a
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 165
    .line 166
    .line 167
    move-result v1

    .line 168
    if-eqz v1, :cond_b

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_b
    move-object v4, v0

    .line 172
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    const-string v1, "\u98df\u7269 #"

    .line 175
    .line 176
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    :goto_4
    const-string v0, " #"

    .line 187
    .line 188
    invoke-static {v3, v0, p0}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    return-object p0
.end method

.method public static β(Lky1;)Z
    .locals 6

    .line 1
    iget v0, p0, Lky1;->δ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lky1;->α:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-wide v2, p0, Lky1;->β:J

    .line 15
    .line 16
    const-wide/16 v4, 0x0

    .line 17
    .line 18
    cmp-long v0, v2, v4

    .line 19
    .line 20
    if-lez v0, :cond_0

    .line 21
    .line 22
    iget-wide v2, p0, Lky1;->γ:J

    .line 23
    .line 24
    cmp-long p0, v2, v4

    .line 25
    .line 26
    if-lez p0, :cond_0

    .line 27
    .line 28
    return v1

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public static γ()Lef1;
    .locals 20

    .line 1
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Ljz;->ε:Ljz;

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lef1;

    .line 12
    .line 13
    invoke-direct {v0, v2, v3, v1}, Lef1;-><init>(JLjava/util/List;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 18
    .line 19
    const-string v4, "pet_elf_food_catalog_cache"

    .line 20
    .line 21
    const-string v5, "{}"

    .line 22
    .line 23
    invoke-static {v4, v5}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-direct {v0, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    new-instance v4, Leo1;

    .line 33
    .line 34
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    move-object v0, v4

    .line 38
    :goto_0
    new-instance v4, Lorg/json/JSONObject;

    .line 39
    .line 40
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 41
    .line 42
    .line 43
    instance-of v5, v0, Leo1;

    .line 44
    .line 45
    if-eqz v5, :cond_1

    .line 46
    .line 47
    move-object v0, v4

    .line 48
    :cond_1
    check-cast v0, Lorg/json/JSONObject;

    .line 49
    .line 50
    const-string v4, "foods"

    .line 51
    .line 52
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    const/4 v5, 0x0

    .line 57
    if-eqz v4, :cond_b

    .line 58
    .line 59
    invoke-static {}, Lyh;->χ()Lzt0;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    const/16 v8, 0x64

    .line 68
    .line 69
    if-le v7, v8, :cond_2

    .line 70
    .line 71
    move v7, v8

    .line 72
    :cond_2
    const/4 v8, 0x0

    .line 73
    :goto_1
    if-ge v8, v7, :cond_a

    .line 74
    .line 75
    invoke-virtual {v4, v8}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    if-nez v9, :cond_3

    .line 80
    .line 81
    goto/16 :goto_6

    .line 82
    .line 83
    :cond_3
    const-string v10, "id"

    .line 84
    .line 85
    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-static {v10}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 101
    .line 102
    .line 103
    move-result v11

    .line 104
    if-lez v11, :cond_4

    .line 105
    .line 106
    move-object v13, v10

    .line 107
    goto :goto_2

    .line 108
    :cond_4
    move-object v13, v5

    .line 109
    :goto_2
    if-nez v13, :cond_5

    .line 110
    .line 111
    goto/16 :goto_6

    .line 112
    .line 113
    :cond_5
    const-string v10, "name"

    .line 114
    .line 115
    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-static {v10}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 123
    .line 124
    .line 125
    move-result-object v10

    .line 126
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 131
    .line 132
    .line 133
    move-result v11

    .line 134
    if-lez v11, :cond_6

    .line 135
    .line 136
    move-object v14, v10

    .line 137
    goto :goto_3

    .line 138
    :cond_6
    move-object v14, v5

    .line 139
    :goto_3
    if-nez v14, :cond_7

    .line 140
    .line 141
    goto :goto_6

    .line 142
    :cond_7
    const-string v10, "price"

    .line 143
    .line 144
    invoke-static {v10, v9}, Lgf1;->δ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v15

    .line 148
    const-string v10, "duration"

    .line 149
    .line 150
    invoke-static {v10, v9}, Lgf1;->δ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Integer;

    .line 151
    .line 152
    .line 153
    move-result-object v16

    .line 154
    const-string v10, "closeness"

    .line 155
    .line 156
    invoke-static {v10, v9}, Lgf1;->δ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v17

    .line 160
    const-string v10, "icon"

    .line 161
    .line 162
    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-static {v10}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 170
    .line 171
    .line 172
    move-result-object v10

    .line 173
    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 178
    .line 179
    .line 180
    move-result v11

    .line 181
    if-lez v11, :cond_8

    .line 182
    .line 183
    move-object/from16 v18, v10

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_8
    move-object/from16 v18, v5

    .line 187
    .line 188
    :goto_4
    const-string v10, "label"

    .line 189
    .line 190
    invoke-virtual {v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v9

    .line 194
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    invoke-static {v9}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 198
    .line 199
    .line 200
    move-result-object v9

    .line 201
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v9

    .line 205
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 206
    .line 207
    .line 208
    move-result v10

    .line 209
    if-lez v10, :cond_9

    .line 210
    .line 211
    move-object/from16 v19, v9

    .line 212
    .line 213
    goto :goto_5

    .line 214
    :cond_9
    move-object/from16 v19, v5

    .line 215
    .line 216
    :goto_5
    new-instance v12, Ldf1;

    .line 217
    .line 218
    invoke-direct/range {v12 .. v19}, Ldf1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v6, v12}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    :goto_6
    add-int/lit8 v8, v8, 0x1

    .line 225
    .line 226
    goto/16 :goto_1

    .line 227
    .line 228
    :cond_a
    invoke-static {v6}, Lyh;->μ(Lzt0;)Lzt0;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    :cond_b
    if-nez v5, :cond_c

    .line 233
    .line 234
    goto :goto_7

    .line 235
    :cond_c
    move-object v1, v5

    .line 236
    :goto_7
    new-instance v4, Lef1;

    .line 237
    .line 238
    const-string v5, "updated_at"

    .line 239
    .line 240
    invoke-virtual {v0, v5, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 241
    .line 242
    .line 243
    move-result-wide v5

    .line 244
    cmp-long v0, v5, v2

    .line 245
    .line 246
    if-gez v0, :cond_d

    .line 247
    .line 248
    goto :goto_8

    .line 249
    :cond_d
    move-wide v2, v5

    .line 250
    :goto_8
    invoke-direct {v4, v2, v3, v1}, Lef1;-><init>(JLjava/util/List;)V

    .line 251
    .line 252
    .line 253
    return-object v4
.end method

.method public static δ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Integer;
    .locals 1

    .line 1
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    instance-of p1, p0, Ljava/lang/Number;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    check-cast p0, Ljava/lang/Number;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_1
    instance-of p1, p0, Ljava/lang/String;

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    check-cast p0, Ljava/lang/String;

    .line 38
    .line 39
    const/16 p1, 0xa

    .line 40
    .line 41
    invoke-static {p0, p1}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 47
    return-object p0
.end method

.method public static ε(Ljava/util/List;)Lef1;
    .locals 10

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    new-instance v2, Lorg/json/JSONObject;

    .line 6
    .line 7
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v3, "updated_at"

    .line 11
    .line 12
    invoke-virtual {v2, v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 13
    .line 14
    .line 15
    new-instance v3, Lorg/json/JSONArray;

    .line 16
    .line 17
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_7

    .line 29
    .line 30
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    check-cast v5, Ldf1;

    .line 35
    .line 36
    new-instance v6, Lorg/json/JSONObject;

    .line 37
    .line 38
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v7, "id"

    .line 42
    .line 43
    iget-object v8, v5, Ldf1;->α:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    const-string v7, "name"

    .line 49
    .line 50
    iget-object v8, v5, Ldf1;->β:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 53
    .line 54
    .line 55
    iget-object v7, v5, Ldf1;->γ:Ljava/lang/Integer;

    .line 56
    .line 57
    if-eqz v7, :cond_0

    .line 58
    .line 59
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    const-string v8, "price"

    .line 64
    .line 65
    invoke-virtual {v6, v8, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 66
    .line 67
    .line 68
    :cond_0
    iget-object v7, v5, Ldf1;->δ:Ljava/lang/Integer;

    .line 69
    .line 70
    if-eqz v7, :cond_1

    .line 71
    .line 72
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    const-string v8, "duration"

    .line 77
    .line 78
    invoke-virtual {v6, v8, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 79
    .line 80
    .line 81
    :cond_1
    iget-object v7, v5, Ldf1;->ε:Ljava/lang/Integer;

    .line 82
    .line 83
    if-eqz v7, :cond_2

    .line 84
    .line 85
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    const-string v8, "closeness"

    .line 90
    .line 91
    invoke-virtual {v6, v8, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 92
    .line 93
    .line 94
    :cond_2
    iget-object v7, v5, Ldf1;->ζ:Ljava/lang/String;

    .line 95
    .line 96
    const/4 v8, 0x0

    .line 97
    if-eqz v7, :cond_4

    .line 98
    .line 99
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    if-nez v9, :cond_3

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    move-object v7, v8

    .line 107
    :goto_1
    if-eqz v7, :cond_4

    .line 108
    .line 109
    const-string v9, "icon"

    .line 110
    .line 111
    invoke-virtual {v6, v9, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 112
    .line 113
    .line 114
    :cond_4
    iget-object v5, v5, Ldf1;->η:Ljava/lang/String;

    .line 115
    .line 116
    if-eqz v5, :cond_6

    .line 117
    .line 118
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    if-nez v7, :cond_5

    .line 123
    .line 124
    move-object v8, v5

    .line 125
    :cond_5
    if-eqz v8, :cond_6

    .line 126
    .line 127
    const-string v5, "label"

    .line 128
    .line 129
    invoke-virtual {v6, v5, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 130
    .line 131
    .line 132
    :cond_6
    invoke-virtual {v3, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_7
    const-string v4, "foods"

    .line 137
    .line 138
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 139
    .line 140
    .line 141
    sget-object v3, Lui1;->α:Ljava/lang/Object;

    .line 142
    .line 143
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    const-string v3, "pet_elf_food_catalog_cache"

    .line 151
    .line 152
    invoke-static {v3, v2}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    new-instance v2, Lef1;

    .line 156
    .line 157
    invoke-direct {v2, v0, v1, p0}, Lef1;-><init>(JLjava/util/List;)V

    .line 158
    .line 159
    .line 160
    return-object v2
.end method
