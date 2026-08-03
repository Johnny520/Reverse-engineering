.class public final synthetic Lwa/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lwa/h;


# direct methods
.method public synthetic constructor <init>(Lwa/e;ILjava/lang/String;Lwa/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lwa/c;->g:I

    .line 5
    .line 6
    iput-object p3, p0, Lwa/c;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p4, p0, Lwa/c;->i:Lwa/h;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lwa/c;->g:I

    .line 2
    .line 3
    iget-object v1, p0, Lwa/c;->h:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "hashCode"

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :cond_0
    const-string v2, "equals"

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/4 v3, 0x1

    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    if-eqz p3, :cond_1

    .line 42
    .line 43
    array-length p2, p3

    .line 44
    if-lez p2, :cond_1

    .line 45
    .line 46
    aget-object v4, p3, v5

    .line 47
    .line 48
    :cond_1
    if-ne p1, v4, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    move v3, v5

    .line 52
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :cond_3
    const-string p1, "toString"

    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    const-string p1, "HchatProtobufCallback"

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_4
    const-string p1, "[Hchat:Protobuf] Oplog\u56de\u5305\u975e\u6210\u529f\u4f46\u8bf7\u6c42\u5df2\u53d1\u9001: uri="

    .line 73
    .line 74
    const-string v2, "\u54cd\u5e94\u5931\u8d25: type="

    .line 75
    .line 76
    const-string v6, "\u54cd\u5e94: "

    .line 77
    .line 78
    const-string v7, "[Hchat:Protobuf] \u53d1\u5305\u56de\u8c03: type="

    .line 79
    .line 80
    if-nez p3, :cond_5

    .line 81
    .line 82
    goto/16 :goto_5

    .line 83
    .line 84
    :cond_5
    const-string v8, "callback"

    .line 85
    .line 86
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-virtual {v8, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    if-nez p2, :cond_6

    .line 95
    .line 96
    goto/16 :goto_5

    .line 97
    .line 98
    :cond_6
    :try_start_0
    array-length p2, p3

    .line 99
    const/4 v8, -0x1

    .line 100
    if-lez p2, :cond_7

    .line 101
    .line 102
    aget-object p2, p3, v5

    .line 103
    .line 104
    instance-of v9, p2, Ljava/lang/Number;

    .line 105
    .line 106
    if-eqz v9, :cond_7

    .line 107
    .line 108
    check-cast p2, Ljava/lang/Number;

    .line 109
    .line 110
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    goto :goto_1

    .line 115
    :cond_7
    move p2, v8

    .line 116
    :goto_1
    array-length v9, p3

    .line 117
    if-le v9, v3, :cond_8

    .line 118
    .line 119
    aget-object v9, p3, v3

    .line 120
    .line 121
    instance-of v10, v9, Ljava/lang/Number;

    .line 122
    .line 123
    if-eqz v10, :cond_8

    .line 124
    .line 125
    check-cast v9, Ljava/lang/Number;

    .line 126
    .line 127
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    :cond_8
    array-length v9, p3

    .line 132
    const/4 v10, 0x2

    .line 133
    if-le v9, v10, :cond_9

    .line 134
    .line 135
    aget-object v9, p3, v10

    .line 136
    .line 137
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    goto :goto_2

    .line 142
    :cond_9
    const-string v9, ""

    .line 143
    .line 144
    :goto_2
    array-length v10, p3

    .line 145
    const/4 v11, 0x3

    .line 146
    if-le v10, v11, :cond_a

    .line 147
    .line 148
    aget-object v4, p3, v11

    .line 149
    .line 150
    :cond_a
    invoke-static {v4}, Lwa/e;->f(Ljava/lang/Object;)[B

    .line 151
    .line 152
    .line 153
    move-result-object p3

    .line 154
    if-eqz p3, :cond_b

    .line 155
    .line 156
    invoke-static {p3}, Lig/a;->Z([B)Lorg/json/JSONObject;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    goto :goto_3

    .line 165
    :cond_b
    const-string v4, "{}"

    .line 166
    .line 167
    :goto_3
    new-instance v10, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    invoke-direct {v10, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    const-string v7, " uri="

    .line 176
    .line 177
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string v7, " errType="

    .line 184
    .line 185
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v10, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    const-string v7, " errCode="

    .line 192
    .line 193
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    const-string v7, " errMsg="

    .line 200
    .line 201
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    const-string v7, " respLen="

    .line 208
    .line 209
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    if-nez p3, :cond_c

    .line 213
    .line 214
    move p3, v5

    .line 215
    goto :goto_4

    .line 216
    :cond_c
    array-length p3, p3

    .line 217
    :goto_4
    invoke-virtual {v10, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    const-string p3, " resp="

    .line 221
    .line 222
    invoke-virtual {v10, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p3

    .line 232
    invoke-static {p3}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 233
    .line 234
    .line 235
    iget-object p3, p0, Lwa/c;->i:Lwa/h;

    .line 236
    .line 237
    if-nez p2, :cond_d

    .line 238
    .line 239
    if-nez v8, :cond_d

    .line 240
    .line 241
    :try_start_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    invoke-direct {p1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    invoke-static {p3, v3, p1}, Lwa/e;->g(Lwa/h;ZLjava/lang/String;)V

    .line 254
    .line 255
    .line 256
    goto :goto_5

    .line 257
    :cond_d
    new-instance v3, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    const-string p2, " code="

    .line 266
    .line 267
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    const-string p2, " msg="

    .line 274
    .line 275
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p2

    .line 285
    const/16 v2, 0x2a9

    .line 286
    .line 287
    if-ne v0, v2, :cond_e

    .line 288
    .line 289
    new-instance p3, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    invoke-direct {p3, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    const-string p1, " "

    .line 298
    .line 299
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    invoke-static {p1}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    goto :goto_5

    .line 313
    :cond_e
    invoke-static {p3, v5, p2}, Lwa/e;->g(Lwa/h;ZLjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 314
    .line 315
    .line 316
    :catchall_0
    :goto_5
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    return-object p1
.end method
