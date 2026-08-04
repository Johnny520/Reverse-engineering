.class public final Lyyds/ᲀᛳᲈᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x5

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    filled-new-array {v0, v1}, [Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lyyds/ᛱᛱᲁᲈ;->ᛲᛶᛱᲈ([Ljava/lang/Object;)Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lyyds/ᲀᛳᲈᲈ;->ᛲᲈᲁ:Ljava/util/Set;

    .line 20
    .line 21
    return-void
.end method

.method public static ᛲᛴᛳᛲ(Lcom/bytedance/im/core/model/Message;)J
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/bytedance/im/core/model/Message;->getOrderIndex()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    new-instance v0, Lyyds/ᲈᛵᛵᛴ;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    move-object p0, v0

    .line 17
    :goto_0
    const-wide/high16 v0, -0x8000000000000000L

    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    instance-of v1, p0, Lyyds/ᲈᛵᛵᛴ;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    move-object p0, v0

    .line 28
    :cond_0
    check-cast p0, Ljava/lang/Number;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    return-wide v0
.end method

.method public static ᛲᲈᲁ(Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    instance-of v0, p0, Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p0, Ljava/util/List;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p0, v1

    .line 10
    :goto_0
    if-nez p0, :cond_1

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_1
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_2
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_4

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    instance-of v2, v2, Lcom/bytedance/im/core/model/Message;

    .line 35
    .line 36
    if-nez v2, :cond_3

    .line 37
    .line 38
    :goto_1
    return-object v1

    .line 39
    :cond_4
    :goto_2
    new-instance v0, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    :cond_5
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_6

    .line 53
    .line 54
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    instance-of v2, v1, Lcom/bytedance/im/core/model/Message;

    .line 59
    .line 60
    if-eqz v2, :cond_5

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_6
    return-object v0
.end method

.method public static ᛵᛸᛸᛷ(Ljava/lang/String;Z)Lyyds/ᲁᛸᛷᛷ;
    .locals 21

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v1

    .line 5
    const-wide v3, -0x2703ce68a836eL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-static/range {p0 .. p0}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const-wide v0, -0x27045e68a836eL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lyyds/ᲀᛳᲈᲈ;->ᲇᲇᲇᛱ(Ljava/lang/String;)Lyyds/ᲁᛸᛷᛷ;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    :cond_0
    sget-object v3, Lyyds/ᛳᛶᛱᛸ;->ᛳᛷᛶᛲ:Ljava/lang/reflect/Method;

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    const/4 v5, 0x0

    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    move-object v0, v5

    .line 40
    goto :goto_2

    .line 41
    :cond_1
    :try_start_0
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v5, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    instance-of v6, v0, Ljava/lang/Boolean;

    .line 49
    .line 50
    if-eqz v6, :cond_2

    .line 51
    .line 52
    check-cast v0, Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    move-object v0, v5

    .line 58
    goto :goto_1

    .line 59
    :goto_0
    new-instance v6, Lyyds/ᲈᛵᛵᛴ;

    .line 60
    .line 61
    invoke-direct {v6, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    move-object v0, v6

    .line 65
    :goto_1
    invoke-static {v0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    if-eqz v6, :cond_3

    .line 70
    .line 71
    sget-object v7, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 72
    .line 73
    new-instance v8, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const-wide v9, -0x27091e68a836eL

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const/16 v9, 0x2e

    .line 99
    .line 100
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {v7, v3, v6}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    :cond_3
    instance-of v3, v0, Lyyds/ᲈᛵᛵᛴ;

    .line 118
    .line 119
    if-eqz v3, :cond_4

    .line 120
    .line 121
    move-object v0, v5

    .line 122
    :cond_4
    check-cast v0, Ljava/lang/Boolean;

    .line 123
    .line 124
    :goto_2
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 125
    .line 126
    invoke-static {v0, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_5

    .line 131
    .line 132
    const-wide v0, -0x2704ee68a836eL

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-static {v0}, Lyyds/ᲀᛳᲈᲈ;->ᲇᲇᲇᛱ(Ljava/lang/String;)Lyyds/ᲁᛸᛷᛷ;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    goto/16 :goto_1a

    .line 146
    .line 147
    :cond_5
    if-nez v0, :cond_6

    .line 148
    .line 149
    const-wide v0, -0x27058e68a836eL

    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-static {v0}, Lyyds/ᲀᛳᲈᲈ;->ᲇᲇᲇᛱ(Ljava/lang/String;)Lyyds/ᲁᛸᛷᛷ;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    goto/16 :goto_1a

    .line 163
    .line 164
    :cond_6
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 165
    .line 166
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-eqz v0, :cond_31

    .line 171
    .line 172
    sget-object v0, Lyyds/ᲈᛳᛱᛲ;->ᛲᲈᲁ:Lyyds/ᲈᛳᛱᛲ;

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-static {}, Lyyds/ᲈᛳᛱᛲ;->ᛲᛳᛶᲁ()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    if-nez v0, :cond_7

    .line 182
    .line 183
    const-wide v0, -0x27063e68a836eL

    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-static {v0}, Lyyds/ᲀᛳᲈᲈ;->ᲇᲇᲇᛱ(Ljava/lang/String;)Lyyds/ᲁᛸᛷᛷ;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    goto/16 :goto_1a

    .line 197
    .line 198
    :cond_7
    const/4 v3, 0x0

    .line 199
    if-nez p1, :cond_9

    .line 200
    .line 201
    invoke-static/range {p0 .. p0}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    if-nez v6, :cond_8

    .line 206
    .line 207
    move-object/from16 v6, p0

    .line 208
    .line 209
    goto/16 :goto_8

    .line 210
    .line 211
    :cond_8
    :goto_3
    move-object v6, v5

    .line 212
    goto/16 :goto_8

    .line 213
    .line 214
    :cond_9
    invoke-static/range {p0 .. p0}, Lyyds/ᛳᲇᲁᛳ;->ᛵᛶᛲᲀ(Ljava/lang/String;)Ljava/lang/Long;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    if-eqz v6, :cond_11

    .line 219
    .line 220
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 221
    .line 222
    .line 223
    move-result-wide v7

    .line 224
    const-wide/16 v9, 0x0

    .line 225
    .line 226
    cmp-long v7, v7, v9

    .line 227
    .line 228
    if-lez v7, :cond_a

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_a
    move-object v6, v5

    .line 232
    :goto_4
    if-eqz v6, :cond_11

    .line 233
    .line 234
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 235
    .line 236
    .line 237
    move-result-wide v7

    .line 238
    sget-object v9, Lyyds/ᛳᛶᛱᛸ;->ᛴᛸᛴᛸ:Ljava/lang/reflect/Method;

    .line 239
    .line 240
    new-array v10, v3, [Ljava/lang/Object;

    .line 241
    .line 242
    invoke-static {v0, v9, v10}, Lyyds/ᲀᛳᲈᲈ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Lyyds/ᛳᛵᛶᛴ;

    .line 243
    .line 244
    .line 245
    move-result-object v9

    .line 246
    iget-object v10, v9, Lyyds/ᛳᛵᛶᛴ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 247
    .line 248
    iget-boolean v9, v9, Lyyds/ᛳᛵᛶᛴ;->ᛲᲈᲁ:Z

    .line 249
    .line 250
    if-eqz v9, :cond_10

    .line 251
    .line 252
    if-nez v10, :cond_b

    .line 253
    .line 254
    goto :goto_7

    .line 255
    :cond_b
    sget-object v9, Lyyds/ᛳᛶᛱᛸ;->ᛵᲈᲇᛵ:Ljava/lang/reflect/Method;

    .line 256
    .line 257
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 258
    .line 259
    .line 260
    move-result-object v11

    .line 261
    filled-new-array {v11, v6}, [Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v6

    .line 265
    invoke-static {v10, v9, v6}, Lyyds/ᲀᛳᲈᲈ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Lyyds/ᛳᛵᛶᛴ;

    .line 266
    .line 267
    .line 268
    move-result-object v6

    .line 269
    iget-boolean v9, v6, Lyyds/ᛳᛵᛶᛴ;->ᛲᲈᲁ:Z

    .line 270
    .line 271
    if-nez v9, :cond_c

    .line 272
    .line 273
    new-instance v6, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    const-wide v9, -0x270c0e68a836eL

    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v9

    .line 284
    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v6

    .line 294
    invoke-static {v6}, Lyyds/ᲀᛳᲈᲈ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    goto :goto_3

    .line 298
    :cond_c
    iget-object v6, v6, Lyyds/ᛳᛵᛶᛴ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 299
    .line 300
    instance-of v9, v6, Ljava/lang/String;

    .line 301
    .line 302
    if-eqz v9, :cond_d

    .line 303
    .line 304
    check-cast v6, Ljava/lang/String;

    .line 305
    .line 306
    goto :goto_5

    .line 307
    :cond_d
    move-object v6, v5

    .line 308
    :goto_5
    if-eqz v6, :cond_f

    .line 309
    .line 310
    invoke-static {v6}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 311
    .line 312
    .line 313
    move-result v9

    .line 314
    if-nez v9, :cond_e

    .line 315
    .line 316
    goto :goto_6

    .line 317
    :cond_e
    move-object v6, v5

    .line 318
    :goto_6
    if-eqz v6, :cond_f

    .line 319
    .line 320
    goto :goto_8

    .line 321
    :cond_f
    new-instance v6, Ljava/lang/StringBuilder;

    .line 322
    .line 323
    const-wide v9, -0x270d2e68a836eL

    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v9

    .line 332
    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v6

    .line 342
    invoke-static {v6}, Lyyds/ᲀᛳᲈᲈ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    goto/16 :goto_3

    .line 346
    .line 347
    :cond_10
    :goto_7
    new-instance v6, Ljava/lang/StringBuilder;

    .line 348
    .line 349
    const-wide v9, -0x270afe68a836eL

    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    invoke-static {v9, v10}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v9

    .line 358
    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v6

    .line 368
    invoke-static {v6}, Lyyds/ᲀᛳᲈᲈ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    goto/16 :goto_3

    .line 372
    .line 373
    :cond_11
    const-wide v6, -0x270a4e68a836eL

    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    invoke-static {v6, v7}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v6

    .line 382
    move-object/from16 v7, p0

    .line 383
    .line 384
    invoke-virtual {v6, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v6

    .line 388
    invoke-static {v6}, Lyyds/ᲀᛳᲈᲈ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    goto/16 :goto_3

    .line 392
    .line 393
    :goto_8
    if-nez v6, :cond_12

    .line 394
    .line 395
    sget-object v0, Lyyds/ᲁᛸᛷᛷ;->ᛲᛴᛳᛲ:Lyyds/ᲁᛸᛷᛷ;

    .line 396
    .line 397
    goto/16 :goto_1a

    .line 398
    .line 399
    :cond_12
    sget-object v7, Lyyds/ᛳᛶᛱᛸ;->ᛶᛵᛸᛲ:Ljava/lang/reflect/Method;

    .line 400
    .line 401
    new-array v8, v3, [Ljava/lang/Object;

    .line 402
    .line 403
    invoke-static {v0, v7, v8}, Lyyds/ᲀᛳᲈᲈ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Lyyds/ᛳᛵᛶᛴ;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    iget-object v7, v0, Lyyds/ᛳᛵᛶᛴ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 408
    .line 409
    iget-boolean v0, v0, Lyyds/ᛳᛵᛶᛴ;->ᛲᲈᲁ:Z

    .line 410
    .line 411
    if-eqz v0, :cond_30

    .line 412
    .line 413
    if-nez v7, :cond_13

    .line 414
    .line 415
    goto/16 :goto_19

    .line 416
    .line 417
    :cond_13
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    const-wide v8, -0x27169e68a836eL

    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    const-wide v8, -0x27160e68a836eL

    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    invoke-static {v8, v9}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 442
    .line 443
    .line 444
    const/16 v1, 0xb

    .line 445
    .line 446
    invoke-virtual {v0, v1, v3}, Ljava/util/Calendar;->set(II)V

    .line 447
    .line 448
    .line 449
    const/16 v1, 0xc

    .line 450
    .line 451
    invoke-virtual {v0, v1, v3}, Ljava/util/Calendar;->set(II)V

    .line 452
    .line 453
    .line 454
    const/16 v1, 0xd

    .line 455
    .line 456
    invoke-virtual {v0, v1, v3}, Ljava/util/Calendar;->set(II)V

    .line 457
    .line 458
    .line 459
    const/16 v1, 0xe

    .line 460
    .line 461
    invoke-virtual {v0, v1, v3}, Ljava/util/Calendar;->set(II)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 465
    .line 466
    .line 467
    move-result-wide v1

    .line 468
    const/4 v8, 0x5

    .line 469
    invoke-virtual {v0, v8, v4}, Ljava/util/Calendar;->add(II)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 473
    .line 474
    .line 475
    move-result-wide v8

    .line 476
    sget-object v0, Lyyds/ᛳᛶᛱᛸ;->ᛳᛴᲇᛶ:Ljava/lang/reflect/Method;

    .line 477
    .line 478
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v10

    .line 482
    invoke-static {v7, v0, v10}, Lyyds/ᲀᛳᲈᲈ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Lyyds/ᛳᛵᛶᛴ;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    iget-object v0, v0, Lyyds/ᛳᛵᛶᛴ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 487
    .line 488
    instance-of v10, v0, Lcom/bytedance/im/core/model/Message;

    .line 489
    .line 490
    if-eqz v10, :cond_14

    .line 491
    .line 492
    check-cast v0, Lcom/bytedance/im/core/model/Message;

    .line 493
    .line 494
    goto :goto_9

    .line 495
    :cond_14
    move-object v0, v5

    .line 496
    :goto_9
    const-wide/16 v10, 0x1

    .line 497
    .line 498
    if-eqz v0, :cond_16

    .line 499
    .line 500
    invoke-static {v0}, Lyyds/ᲀᛳᲈᲈ;->ᲀᛲᛳᲀ(Lcom/bytedance/im/core/model/Message;)J

    .line 501
    .line 502
    .line 503
    move-result-wide v12

    .line 504
    cmp-long v0, v12, v8

    .line 505
    .line 506
    if-gez v0, :cond_15

    .line 507
    .line 508
    cmp-long v0, v1, v12

    .line 509
    .line 510
    if-gtz v0, :cond_15

    .line 511
    .line 512
    sget-object v0, Lyyds/ᲁᛸᛷᛷ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛸᛷᛷ;

    .line 513
    .line 514
    goto/16 :goto_1a

    .line 515
    .line 516
    :cond_15
    cmp-long v0, v10, v12

    .line 517
    .line 518
    if-gtz v0, :cond_16

    .line 519
    .line 520
    cmp-long v0, v12, v1

    .line 521
    .line 522
    if-gez v0, :cond_16

    .line 523
    .line 524
    sget-object v0, Lyyds/ᲁᛸᛷᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛸᛷᛷ;

    .line 525
    .line 526
    goto/16 :goto_1a

    .line 527
    .line 528
    :cond_16
    invoke-static {}, Lyyds/ᲈᛳᛱᛲ;->ᛷᲈᲈᲁ()Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v12

    .line 532
    sget-object v0, Lyyds/ᛳᛶᛱᛸ;->ᲇᲇᲈᲀ:Ljava/lang/reflect/Method;

    .line 533
    .line 534
    sub-long v13, v1, v10

    .line 535
    .line 536
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 537
    .line 538
    .line 539
    move-result-object v13

    .line 540
    const/16 v14, 0xc8

    .line 541
    .line 542
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 543
    .line 544
    .line 545
    move-result-object v15

    .line 546
    filled-new-array {v6, v13, v15, v5}, [Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v13

    .line 550
    invoke-static {v7, v0, v13}, Lyyds/ᲀᛳᲈᲈ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Lyyds/ᛳᛵᛶᛴ;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    iget-boolean v13, v0, Lyyds/ᛳᛵᛶᛴ;->ᛲᲈᲁ:Z

    .line 555
    .line 556
    if-nez v13, :cond_17

    .line 557
    .line 558
    const-wide v0, -0x270e2e68a836eL

    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    invoke-static {v0}, Lyyds/ᲀᛳᲈᲈ;->ᲇᲇᲇᛱ(Ljava/lang/String;)Lyyds/ᲁᛸᛷᛷ;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    goto/16 :goto_1a

    .line 576
    .line 577
    :cond_17
    iget-object v0, v0, Lyyds/ᛳᛵᛶᛴ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 578
    .line 579
    invoke-static {v0}, Lyyds/ᲀᛳᲈᲈ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    if-nez v0, :cond_18

    .line 584
    .line 585
    const-wide v0, -0x270f1e68a836eL

    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    invoke-static {v0}, Lyyds/ᲀᛳᲈᲈ;->ᲇᲇᲇᛱ(Ljava/lang/String;)Lyyds/ᲁᛸᛷᛷ;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    goto/16 :goto_1a

    .line 603
    .line 604
    :cond_18
    const-wide v16, 0x7fffffffffffffffL

    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    move-object v13, v0

    .line 610
    move/from16 v18, v3

    .line 611
    .line 612
    :goto_a
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 613
    .line 614
    .line 615
    move-result v0

    .line 616
    if-eqz v0, :cond_1a

    .line 617
    .line 618
    :cond_19
    move-object/from16 v20, v5

    .line 619
    .line 620
    move-wide/from16 p0, v10

    .line 621
    .line 622
    goto/16 :goto_13

    .line 623
    .line 624
    :cond_1a
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 625
    .line 626
    .line 627
    move-result-object v19

    .line 628
    :goto_b
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    .line 629
    .line 630
    .line 631
    move-result v0

    .line 632
    if-eqz v0, :cond_19

    .line 633
    .line 634
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    move-object v3, v0

    .line 639
    check-cast v3, Lcom/bytedance/im/core/model/Message;

    .line 640
    .line 641
    :try_start_1
    invoke-virtual {v3}, Lcom/bytedance/im/core/model/Message;->isSelf()Z

    .line 642
    .line 643
    .line 644
    move-result v0

    .line 645
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 646
    .line 647
    .line 648
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 649
    move-object/from16 v20, v5

    .line 650
    .line 651
    goto :goto_c

    .line 652
    :catchall_1
    move-exception v0

    .line 653
    move-object/from16 v20, v5

    .line 654
    .line 655
    new-instance v5, Lyyds/ᲈᛵᛵᛴ;

    .line 656
    .line 657
    invoke-direct {v5, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 658
    .line 659
    .line 660
    move-object v0, v5

    .line 661
    :goto_c
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 662
    .line 663
    move-wide/from16 p0, v10

    .line 664
    .line 665
    instance-of v10, v0, Lyyds/ᲈᛵᛵᛴ;

    .line 666
    .line 667
    if-eqz v10, :cond_1b

    .line 668
    .line 669
    move-object v0, v5

    .line 670
    :cond_1b
    check-cast v0, Ljava/lang/Boolean;

    .line 671
    .line 672
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 673
    .line 674
    .line 675
    move-result v5

    .line 676
    const-wide v10, -0x2714fe68a836eL

    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    invoke-static {v10, v11}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    invoke-virtual {v12, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 686
    .line 687
    .line 688
    move-result v0

    .line 689
    if-nez v0, :cond_1d

    .line 690
    .line 691
    :try_start_2
    invoke-virtual {v3}, Lcom/bytedance/im/core/model/Message;->getSender()J

    .line 692
    .line 693
    .line 694
    move-result-wide v10

    .line 695
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    invoke-static {v0, v12}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 700
    .line 701
    .line 702
    move-result v0

    .line 703
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 704
    .line 705
    .line 706
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 707
    goto :goto_d

    .line 708
    :catchall_2
    move-exception v0

    .line 709
    new-instance v10, Lyyds/ᲈᛵᛵᛴ;

    .line 710
    .line 711
    invoke-direct {v10, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 712
    .line 713
    .line 714
    move-object v0, v10

    .line 715
    :goto_d
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 716
    .line 717
    instance-of v11, v0, Lyyds/ᲈᛵᛵᛴ;

    .line 718
    .line 719
    if-eqz v11, :cond_1c

    .line 720
    .line 721
    move-object v0, v10

    .line 722
    :cond_1c
    check-cast v0, Ljava/lang/Boolean;

    .line 723
    .line 724
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 725
    .line 726
    .line 727
    move-result v0

    .line 728
    if-eqz v0, :cond_1d

    .line 729
    .line 730
    move v0, v4

    .line 731
    goto :goto_e

    .line 732
    :cond_1d
    const/4 v0, 0x0

    .line 733
    :goto_e
    if-nez v5, :cond_1e

    .line 734
    .line 735
    if-eqz v0, :cond_23

    .line 736
    .line 737
    :cond_1e
    :try_start_3
    invoke-virtual {v3}, Lcom/bytedance/im/core/model/Message;->isDeleted()Z

    .line 738
    .line 739
    .line 740
    move-result v0

    .line 741
    xor-int/2addr v0, v4

    .line 742
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 743
    .line 744
    .line 745
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 746
    goto :goto_f

    .line 747
    :catchall_3
    move-exception v0

    .line 748
    new-instance v5, Lyyds/ᲈᛵᛵᛴ;

    .line 749
    .line 750
    invoke-direct {v5, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 751
    .line 752
    .line 753
    move-object v0, v5

    .line 754
    :goto_f
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 755
    .line 756
    instance-of v10, v0, Lyyds/ᲈᛵᛵᛴ;

    .line 757
    .line 758
    if-eqz v10, :cond_1f

    .line 759
    .line 760
    move-object v0, v5

    .line 761
    :cond_1f
    check-cast v0, Ljava/lang/Boolean;

    .line 762
    .line 763
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 764
    .line 765
    .line 766
    move-result v0

    .line 767
    if-eqz v0, :cond_23

    .line 768
    .line 769
    :try_start_4
    sget-object v0, Lyyds/ᲀᛳᲈᲈ;->ᛲᲈᲁ:Ljava/util/Set;

    .line 770
    .line 771
    invoke-virtual {v3}, Lcom/bytedance/im/core/model/Message;->getMsgStatus()I

    .line 772
    .line 773
    .line 774
    move-result v5

    .line 775
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 776
    .line 777
    .line 778
    move-result-object v5

    .line 779
    invoke-interface {v0, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 780
    .line 781
    .line 782
    move-result v0

    .line 783
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 784
    .line 785
    .line 786
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 787
    goto :goto_10

    .line 788
    :catchall_4
    move-exception v0

    .line 789
    new-instance v5, Lyyds/ᲈᛵᛵᛴ;

    .line 790
    .line 791
    invoke-direct {v5, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 792
    .line 793
    .line 794
    move-object v0, v5

    .line 795
    :goto_10
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 796
    .line 797
    instance-of v10, v0, Lyyds/ᲈᛵᛵᛴ;

    .line 798
    .line 799
    if-eqz v10, :cond_20

    .line 800
    .line 801
    move-object v0, v5

    .line 802
    :cond_20
    check-cast v0, Ljava/lang/Boolean;

    .line 803
    .line 804
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 805
    .line 806
    .line 807
    move-result v0

    .line 808
    if-eqz v0, :cond_23

    .line 809
    .line 810
    :try_start_5
    iget v0, v3, Lcom/bytedance/im/core/model/Message;->msgType:I

    .line 811
    .line 812
    if-eq v0, v4, :cond_21

    .line 813
    .line 814
    move v0, v4

    .line 815
    goto :goto_11

    .line 816
    :cond_21
    const/4 v0, 0x0

    .line 817
    :goto_11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 818
    .line 819
    .line 820
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 821
    goto :goto_12

    .line 822
    :catchall_5
    move-exception v0

    .line 823
    new-instance v5, Lyyds/ᲈᛵᛵᛴ;

    .line 824
    .line 825
    invoke-direct {v5, v0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 826
    .line 827
    .line 828
    move-object v0, v5

    .line 829
    :goto_12
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 830
    .line 831
    instance-of v10, v0, Lyyds/ᲈᛵᛵᛴ;

    .line 832
    .line 833
    if-eqz v10, :cond_22

    .line 834
    .line 835
    move-object v0, v5

    .line 836
    :cond_22
    check-cast v0, Ljava/lang/Boolean;

    .line 837
    .line 838
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 839
    .line 840
    .line 841
    move-result v0

    .line 842
    if-eqz v0, :cond_23

    .line 843
    .line 844
    invoke-static {v3}, Lyyds/ᲀᛳᲈᲈ;->ᲀᛲᛳᲀ(Lcom/bytedance/im/core/model/Message;)J

    .line 845
    .line 846
    .line 847
    move-result-wide v10

    .line 848
    cmp-long v0, v1, v10

    .line 849
    .line 850
    if-gtz v0, :cond_23

    .line 851
    .line 852
    cmp-long v0, v10, v8

    .line 853
    .line 854
    if-gez v0, :cond_23

    .line 855
    .line 856
    sget-object v0, Lyyds/ᲁᛸᛷᛷ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛸᛷᛷ;

    .line 857
    .line 858
    goto/16 :goto_1a

    .line 859
    .line 860
    :cond_23
    move-wide/from16 v10, p0

    .line 861
    .line 862
    move-object/from16 v5, v20

    .line 863
    .line 864
    const/4 v3, 0x0

    .line 865
    goto/16 :goto_b

    .line 866
    .line 867
    :goto_13
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 868
    .line 869
    .line 870
    move-result v0

    .line 871
    if-ge v0, v14, :cond_24

    .line 872
    .line 873
    sget-object v0, Lyyds/ᲁᛸᛷᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛸᛷᛷ;

    .line 874
    .line 875
    goto/16 :goto_1a

    .line 876
    .line 877
    :cond_24
    if-lez v18, :cond_27

    .line 878
    .line 879
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 880
    .line 881
    .line 882
    move-result v0

    .line 883
    if-eqz v0, :cond_25

    .line 884
    .line 885
    goto :goto_15

    .line 886
    :cond_25
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    :goto_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 891
    .line 892
    .line 893
    move-result v3

    .line 894
    if-eqz v3, :cond_26

    .line 895
    .line 896
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 897
    .line 898
    .line 899
    move-result-object v3

    .line 900
    check-cast v3, Lcom/bytedance/im/core/model/Message;

    .line 901
    .line 902
    invoke-static {v3}, Lyyds/ᲀᛳᲈᲈ;->ᲀᛲᛳᲀ(Lcom/bytedance/im/core/model/Message;)J

    .line 903
    .line 904
    .line 905
    move-result-wide v10

    .line 906
    cmp-long v3, p0, v10

    .line 907
    .line 908
    if-gtz v3, :cond_27

    .line 909
    .line 910
    cmp-long v3, v10, v1

    .line 911
    .line 912
    if-gez v3, :cond_27

    .line 913
    .line 914
    goto :goto_14

    .line 915
    :cond_26
    :goto_15
    sget-object v0, Lyyds/ᲁᛸᛷᛷ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛸᛷᛷ;

    .line 916
    .line 917
    goto/16 :goto_1a

    .line 918
    .line 919
    :cond_27
    add-int/lit8 v0, v18, 0x1

    .line 920
    .line 921
    const/16 v3, 0x64

    .line 922
    .line 923
    if-lt v0, v3, :cond_28

    .line 924
    .line 925
    const-wide v0, -0x27104e68a836eL

    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 931
    .line 932
    .line 933
    move-result-object v0

    .line 934
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 935
    .line 936
    .line 937
    move-result-object v0

    .line 938
    invoke-static {v0}, Lyyds/ᲀᛳᲈᲈ;->ᲇᲇᲇᛱ(Ljava/lang/String;)Lyyds/ᲁᛸᛷᛷ;

    .line 939
    .line 940
    .line 941
    move-result-object v0

    .line 942
    goto/16 :goto_1a

    .line 943
    .line 944
    :cond_28
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 945
    .line 946
    .line 947
    move-result-object v3

    .line 948
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 949
    .line 950
    .line 951
    move-result v5

    .line 952
    if-nez v5, :cond_29

    .line 953
    .line 954
    move-object/from16 v5, v20

    .line 955
    .line 956
    goto :goto_17

    .line 957
    :cond_29
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 958
    .line 959
    .line 960
    move-result-object v5

    .line 961
    check-cast v5, Lcom/bytedance/im/core/model/Message;

    .line 962
    .line 963
    invoke-static {v5}, Lyyds/ᲀᛳᲈᲈ;->ᛲᛴᛳᛲ(Lcom/bytedance/im/core/model/Message;)J

    .line 964
    .line 965
    .line 966
    move-result-wide v10

    .line 967
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 968
    .line 969
    .line 970
    move-result-object v5

    .line 971
    :cond_2a
    :goto_16
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 972
    .line 973
    .line 974
    move-result v10

    .line 975
    if-eqz v10, :cond_2b

    .line 976
    .line 977
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 978
    .line 979
    .line 980
    move-result-object v10

    .line 981
    check-cast v10, Lcom/bytedance/im/core/model/Message;

    .line 982
    .line 983
    invoke-static {v10}, Lyyds/ᲀᛳᲈᲈ;->ᛲᛴᛳᛲ(Lcom/bytedance/im/core/model/Message;)J

    .line 984
    .line 985
    .line 986
    move-result-wide v10

    .line 987
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 988
    .line 989
    .line 990
    move-result-object v10

    .line 991
    invoke-virtual {v5, v10}, Ljava/lang/Long;->compareTo(Ljava/lang/Object;)I

    .line 992
    .line 993
    .line 994
    move-result v11

    .line 995
    if-lez v11, :cond_2a

    .line 996
    .line 997
    move-object v5, v10

    .line 998
    goto :goto_16

    .line 999
    :cond_2b
    :goto_17
    if-eqz v5, :cond_2f

    .line 1000
    .line 1001
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 1002
    .line 1003
    .line 1004
    move-result-wide v10

    .line 1005
    const-wide/high16 v18, -0x8000000000000000L

    .line 1006
    .line 1007
    cmp-long v3, v10, v18

    .line 1008
    .line 1009
    if-lez v3, :cond_2c

    .line 1010
    .line 1011
    cmp-long v3, v10, v16

    .line 1012
    .line 1013
    if-gez v3, :cond_2c

    .line 1014
    .line 1015
    goto :goto_18

    .line 1016
    :cond_2c
    move-object/from16 v5, v20

    .line 1017
    .line 1018
    :goto_18
    if-eqz v5, :cond_2f

    .line 1019
    .line 1020
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 1021
    .line 1022
    .line 1023
    move-result-wide v16

    .line 1024
    sget-object v3, Lyyds/ᛳᛶᛱᛸ;->ᛵᛲᛵᲁ:Ljava/lang/reflect/Method;

    .line 1025
    .line 1026
    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v10

    .line 1030
    filled-new-array {v6, v5, v10, v15}, [Ljava/lang/Object;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v5

    .line 1034
    invoke-static {v7, v3, v5}, Lyyds/ᲀᛳᲈᲈ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Lyyds/ᛳᛵᛶᛴ;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v3

    .line 1038
    iget-boolean v5, v3, Lyyds/ᛳᛵᛶᛴ;->ᛲᲈᲁ:Z

    .line 1039
    .line 1040
    if-nez v5, :cond_2d

    .line 1041
    .line 1042
    const-wide v0, -0x2712fe68a836eL

    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v0

    .line 1051
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v0

    .line 1055
    invoke-static {v0}, Lyyds/ᲀᛳᲈᲈ;->ᲇᲇᲇᛱ(Ljava/lang/String;)Lyyds/ᲁᛸᛷᛷ;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v0

    .line 1059
    goto :goto_1a

    .line 1060
    :cond_2d
    iget-object v3, v3, Lyyds/ᛳᛵᛶᛴ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 1061
    .line 1062
    invoke-static {v3}, Lyyds/ᲀᛳᲈᲈ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v13

    .line 1066
    if-nez v13, :cond_2e

    .line 1067
    .line 1068
    const-wide v0, -0x2713de68a836eL

    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v0

    .line 1077
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v0

    .line 1081
    invoke-static {v0}, Lyyds/ᲀᛳᲈᲈ;->ᲇᲇᲇᛱ(Ljava/lang/String;)Lyyds/ᲁᛸᛷᛷ;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v0

    .line 1085
    goto :goto_1a

    .line 1086
    :cond_2e
    move-wide/from16 v10, p0

    .line 1087
    .line 1088
    move/from16 v18, v0

    .line 1089
    .line 1090
    move-object/from16 v5, v20

    .line 1091
    .line 1092
    const/4 v3, 0x0

    .line 1093
    goto/16 :goto_a

    .line 1094
    .line 1095
    :cond_2f
    const-wide v0, -0x2711fe68a836eL

    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v0

    .line 1104
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v0

    .line 1108
    invoke-static {v0}, Lyyds/ᲀᛳᲈᲈ;->ᲇᲇᲇᛱ(Ljava/lang/String;)Lyyds/ᲁᛸᛷᛷ;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v0

    .line 1112
    goto :goto_1a

    .line 1113
    :cond_30
    :goto_19
    const-wide v0, -0x2707ee68a836eL

    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v0

    .line 1122
    invoke-virtual {v0, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v0

    .line 1126
    invoke-static {v0}, Lyyds/ᲀᛳᲈᲈ;->ᲇᲇᲇᛱ(Ljava/lang/String;)Lyyds/ᲁᛸᛷᛷ;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v0

    .line 1130
    :goto_1a
    return-object v0

    .line 1131
    :cond_31
    move-object/from16 v20, v5

    .line 1132
    .line 1133
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛷᲈᲈᲁ()V

    .line 1134
    .line 1135
    .line 1136
    return-object v20
.end method

.method public static ᛶᛷᛲᲁ(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 2
    .line 3
    const-wide v1, -0x27187e68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v0, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static ᲀᛲᛳᲀ(Lcom/bytedance/im/core/model/Message;)J
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/bytedance/im/core/model/Message;->getCreatedAt()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    new-instance v0, Lyyds/ᲈᛵᛵᛴ;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    move-object p0, v0

    .line 17
    :goto_0
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    instance-of v1, p0, Lyyds/ᲈᛵᛵᛴ;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    move-object p0, v0

    .line 28
    :cond_0
    check-cast p0, Ljava/lang/Number;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    return-wide v0
.end method

.method public static ᲇᲇᲇᛱ(Ljava/lang/String;)Lyyds/ᲁᛸᛷᛷ;
    .locals 3

    .line 1
    sget-object v0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 2
    .line 3
    const-wide v1, -0x27179e68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v0, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lyyds/ᲁᛸᛷᛷ;->ᛲᛴᛳᛲ:Lyyds/ᲁᛸᛷᛷ;

    .line 20
    .line 21
    return-object p0
.end method

.method public static varargs ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Lyyds/ᛳᛵᛶᛴ;
    .locals 4

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lyyds/ᛳᛵᛶᛴ;

    .line 11
    .line 12
    array-length v2, p2

    .line 13
    invoke-static {p2, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p1, p0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v1, p0, v0}, Lyyds/ᛳᛵᛶᛴ;-><init>(Ljava/lang/Object;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    new-instance v1, Lyyds/ᲈᛵᛵᛴ;

    .line 27
    .line 28
    invoke-direct {v1, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-static {v1}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    sget-object p2, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 38
    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-wide v2, -0x27151e68a836eL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const/16 v2, 0x2e

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p2, p1, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    :cond_1
    new-instance p0, Lyyds/ᛳᛵᛶᛴ;

    .line 84
    .line 85
    invoke-direct {p0}, Lyyds/ᛳᛵᛶᛴ;-><init>()V

    .line 86
    .line 87
    .line 88
    instance-of p1, v1, Lyyds/ᲈᛵᛵᛴ;

    .line 89
    .line 90
    if-eqz p1, :cond_2

    .line 91
    .line 92
    move-object v1, p0

    .line 93
    :cond_2
    check-cast v1, Lyyds/ᛳᛵᛶᛴ;

    .line 94
    .line 95
    return-object v1

    .line 96
    :cond_3
    :goto_1
    new-instance p0, Lyyds/ᛳᛵᛶᛴ;

    .line 97
    .line 98
    invoke-direct {p0}, Lyyds/ᛳᛵᛶᛴ;-><init>()V

    .line 99
    .line 100
    .line 101
    return-object p0
.end method
