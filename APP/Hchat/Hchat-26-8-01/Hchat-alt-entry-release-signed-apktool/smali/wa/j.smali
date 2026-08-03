.class public abstract Lwa/j;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static volatile a:Lwa/g;

.field public static final b:Ljava/util/Map;

.field public static final c:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lwa/j;->b:Ljava/util/Map;

    .line 6
    .line 7
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lwa/j;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 13
    .line 14
    return-void
.end method

.method public static a(Ljava/lang/String;IIILjava/lang/String;Lwa/h;)Z
    .locals 12

    .line 1
    move-object/from16 v6, p5

    .line 2
    .line 3
    sget-object v1, Lwa/j;->a:Lwa/g;

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    if-eqz v6, :cond_e

    .line 9
    .line 10
    const-string p0, "Protobuf API\u672a\u5c31\u7eea"

    .line 11
    .line 12
    invoke-interface {v6, p0, v7}, Lwa/h;->c(Ljava/lang/String;Z)V

    .line 13
    .line 14
    .line 15
    return v7

    .line 16
    :cond_0
    iget-object v8, v1, Lwa/g;->f:Lwa/e;

    .line 17
    .line 18
    const-string v9, "\u901a\u7528\u53d1\u5305\u672a\u5c31\u7eea("

    .line 19
    .line 20
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 21
    .line 22
    if-eqz p4, :cond_2

    .line 23
    .line 24
    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move-object/from16 v2, p4

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    :goto_0
    move-object p0, v0

    .line 40
    goto/16 :goto_9

    .line 41
    .line 42
    :cond_2
    :goto_1
    const-string v2, "{}"

    .line 43
    .line 44
    :goto_2
    invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    const/16 v2, 0x20a

    .line 48
    .line 49
    if-ne p1, v2, :cond_5

    .line 50
    .line 51
    :try_start_1
    const-string v3, "2"

    .line 52
    .line 53
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    if-eqz v4, :cond_4

    .line 58
    .line 59
    move v3, v7

    .line 60
    :goto_3
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-ge v3, v5, :cond_7

    .line 65
    .line 66
    invoke-virtual {v4, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    if-eqz v5, :cond_3

    .line 71
    .line 72
    invoke-static {v5}, Loh/h;->g(Lorg/json/JSONObject;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    if-eqz v3, :cond_7

    .line 83
    .line 84
    invoke-static {v3}, Loh/h;->g(Lorg/json/JSONObject;)V

    .line 85
    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_5
    const/16 v3, 0xde

    .line 89
    .line 90
    if-ne p1, v3, :cond_6

    .line 91
    .line 92
    invoke-static {v0}, Loh/h;->U(Lorg/json/JSONObject;)V

    .line 93
    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_6
    const/16 v3, 0xaf

    .line 97
    .line 98
    if-ne p1, v3, :cond_7

    .line 99
    .line 100
    const-string v3, "3"

    .line 101
    .line 102
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    if-eqz v3, :cond_7

    .line 107
    .line 108
    const-string v4, "9"

    .line 109
    .line 110
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 111
    .line 112
    .line 113
    move-result-wide v10

    .line 114
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 119
    .line 120
    .line 121
    :catchall_1
    :cond_7
    :goto_4
    :try_start_2
    invoke-static {v0}, Lig/a;->q(Lorg/json/JSONObject;)[B

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-virtual {v1, p1, p0, v0, v6}, Lwa/g;->v(ILjava/lang/String;Lorg/json/JSONObject;Lwa/h;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_8

    .line 130
    .line 131
    goto :goto_6

    .line 132
    :cond_8
    invoke-virtual {v1, p1, p0}, Lwa/g;->j(ILjava/lang/String;)Lwa/f;

    .line 133
    .line 134
    .line 135
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 136
    if-eqz v0, :cond_a

    .line 137
    .line 138
    :try_start_3
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    if-eq p1, v2, :cond_a

    .line 142
    .line 143
    const/16 v2, 0x2a9

    .line 144
    .line 145
    if-ne p1, v2, :cond_9

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_9
    move-object v4, p0

    .line 149
    move v5, p1

    .line 150
    move-object v2, v0

    .line 151
    invoke-virtual/range {v1 .. v6}, Lwa/g;->s(Lwa/f;[BLjava/lang/String;ILwa/h;)Z

    .line 152
    .line 153
    .line 154
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 155
    move-object v10, v1

    .line 156
    move-object v11, v2

    .line 157
    if-eqz v0, :cond_b

    .line 158
    .line 159
    goto :goto_6

    .line 160
    :catchall_2
    move-exception v0

    .line 161
    move-object v10, v1

    .line 162
    move-object p0, v0

    .line 163
    move-object/from16 v6, p5

    .line 164
    .line 165
    goto :goto_9

    .line 166
    :cond_a
    :goto_5
    move-object v11, v0

    .line 167
    move-object v10, v1

    .line 168
    :cond_b
    :try_start_4
    iget-object v0, v10, Lwa/g;->f:Lwa/e;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 169
    .line 170
    move-object v1, p0

    .line 171
    move v2, p1

    .line 172
    move v4, p3

    .line 173
    move-object/from16 v6, p5

    .line 174
    .line 175
    move-object v5, v3

    .line 176
    move v3, p2

    .line 177
    :try_start_5
    invoke-virtual/range {v0 .. v6}, Lwa/e;->j(Ljava/lang/String;III[BLwa/h;)Z

    .line 178
    .line 179
    .line 180
    move-result p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 181
    move-object v3, v5

    .line 182
    if-eqz p2, :cond_c

    .line 183
    .line 184
    :goto_6
    const/4 p0, 0x1

    .line 185
    return p0

    .line 186
    :cond_c
    if-eqz v11, :cond_d

    .line 187
    .line 188
    :try_start_6
    iget-object p2, v11, Lwa/f;->c:Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 189
    .line 190
    if-eqz p2, :cond_d

    .line 191
    .line 192
    move-object v4, p0

    .line 193
    move v5, p1

    .line 194
    move-object/from16 v6, p5

    .line 195
    .line 196
    move-object v1, v10

    .line 197
    move-object v2, v11

    .line 198
    :try_start_7
    invoke-virtual/range {v1 .. v6}, Lwa/g;->s(Lwa/f;[BLjava/lang/String;ILwa/h;)Z

    .line 199
    .line 200
    .line 201
    move-result p0

    .line 202
    return p0

    .line 203
    :cond_d
    move-object/from16 v6, p5

    .line 204
    .line 205
    move-object v1, v10

    .line 206
    goto :goto_8

    .line 207
    :catchall_3
    move-exception v0

    .line 208
    move-object/from16 v6, p5

    .line 209
    .line 210
    :goto_7
    move-object v1, v10

    .line 211
    goto/16 :goto_0

    .line 212
    .line 213
    :goto_8
    new-instance p0, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    invoke-direct {p0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v8}, Lwa/e;->i()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    const-string p1, ")\uff0c\u4e14\u672a\u627e\u5230\u540c\u7c7b\u5df2\u6293\u8bf7\u6c42"

    .line 226
    .line 227
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    invoke-virtual {v1, v6, v7, p0}, Lwa/g;->r(Lwa/h;ZLjava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 235
    .line 236
    .line 237
    :cond_e
    return v7

    .line 238
    :catchall_4
    move-exception v0

    .line 239
    goto :goto_7

    .line 240
    :goto_9
    new-instance p1, Ljava/lang/StringBuilder;

    .line 241
    .line 242
    const-string p2, "\u53d1\u9001\u5931\u8d25: "

    .line 243
    .line 244
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    invoke-virtual {v1, v6, v7, p0}, Lwa/g;->r(Lwa/h;ZLjava/lang/String;)V

    .line 259
    .line 260
    .line 261
    return v7
.end method
