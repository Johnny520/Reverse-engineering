.class public final Lsx;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Ljava/lang/String;

.field public final β:Ljava/lang/String;

.field public final γ:Ljava/lang/String;

.field public final δ:Ljava/util/ArrayList;

.field public final ε:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsx;->α:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lsx;->β:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lsx;->γ:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lsx;->δ:Ljava/util/ArrayList;

    .line 11
    .line 12
    iput-boolean p5, p0, Lsx;->ε:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lsx;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lsx;

    .line 10
    .line 11
    iget-object v0, p0, Lsx;->α:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, Lsx;->α:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, Lsx;->β:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p1, Lsx;->β:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-object v0, p0, Lsx;->γ:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, Lsx;->γ:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-object v0, p0, Lsx;->δ:Ljava/util/ArrayList;

    .line 45
    .line 46
    iget-object v1, p1, Lsx;->δ:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget-boolean p0, p0, Lsx;->ε:Z

    .line 56
    .line 57
    iget-boolean p1, p1, Lsx;->ε:Z

    .line 58
    .line 59
    if-eq p0, p1, :cond_6

    .line 60
    .line 61
    :goto_0
    const/4 p0, 0x0

    .line 62
    return p0

    .line 63
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 64
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lsx;->α:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lsx;->β:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lsx;->γ:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lsx;->δ:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-boolean p0, p0, Lsx;->ε:Z

    .line 31
    .line 32
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    add-int/2addr p0, v2

    .line 37
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", methodName="

    .line 2
    .line 3
    const-string v1, ", returnType="

    .line 4
    .line 5
    const-string v2, "DyDexMethodRef(className="

    .line 6
    .line 7
    iget-object v3, p0, Lsx;->α:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lsx;->β:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lsx;->γ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", parameterTypes="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lsx;->δ:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", isStatic="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, ")"

    .line 36
    .line 37
    iget-boolean p0, p0, Lsx;->ε:Z

    .line 38
    .line 39
    invoke-static {v0, p0, v1}, Llz1;->σ(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public final α(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v2, Lbx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    iget-object v2, v0, Lsx;->α:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v1, v2}, Lbx;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    :cond_0
    const/16 v17, 0x0

    .line 19
    .line 20
    goto/16 :goto_d

    .line 21
    .line 22
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    .line 23
    .line 24
    const/16 v5, 0xa

    .line 25
    .line 26
    iget-object v6, v0, Lsx;->δ:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-static {v6, v5}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-eqz v7, :cond_b

    .line 44
    .line 45
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    check-cast v7, Ljava/lang/String;

    .line 50
    .line 51
    sget-object v8, Lbx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 52
    .line 53
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    sparse-switch v8, :sswitch_data_0

    .line 61
    .line 62
    .line 63
    goto/16 :goto_1

    .line 64
    .line 65
    :sswitch_0
    const-string v8, "short"

    .line 66
    .line 67
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    if-nez v8, :cond_2

    .line 72
    .line 73
    goto/16 :goto_1

    .line 74
    .line 75
    :cond_2
    sget-object v7, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 76
    .line 77
    goto/16 :goto_2

    .line 78
    .line 79
    :sswitch_1
    const-string v8, "float"

    .line 80
    .line 81
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    if-nez v8, :cond_3

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    sget-object v7, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :sswitch_2
    const-string v8, "boolean"

    .line 92
    .line 93
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    if-nez v8, :cond_4

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :sswitch_3
    const-string v8, "void"

    .line 104
    .line 105
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    if-nez v8, :cond_5

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_5
    sget-object v7, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :sswitch_4
    const-string v8, "long"

    .line 116
    .line 117
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    if-nez v8, :cond_6

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_6
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :sswitch_5
    const-string v8, "char"

    .line 128
    .line 129
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    if-nez v8, :cond_7

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_7
    sget-object v7, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :sswitch_6
    const-string v8, "byte"

    .line 140
    .line 141
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    if-nez v8, :cond_8

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_8
    sget-object v7, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :sswitch_7
    const-string v8, "int"

    .line 152
    .line 153
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    if-nez v8, :cond_9

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_9
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :sswitch_8
    const-string v8, "double"

    .line 164
    .line 165
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    if-nez v8, :cond_a

    .line 170
    .line 171
    :goto_1
    invoke-static {v1, v7}, Lbx;->α(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    goto :goto_2

    .line 176
    :cond_a
    sget-object v7, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 177
    .line 178
    :goto_2
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :cond_b
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    iget-boolean v5, v0, Lsx;->ε:Z

    .line 188
    .line 189
    iget-object v7, v0, Lsx;->γ:Ljava/lang/String;

    .line 190
    .line 191
    iget-object v8, v0, Lsx;->β:Ljava/lang/String;

    .line 192
    .line 193
    const-class v9, Ljava/lang/Object;

    .line 194
    .line 195
    const/4 v10, 0x0

    .line 196
    const/4 v11, 0x1

    .line 197
    if-eqz v1, :cond_c

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_c
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-eqz v1, :cond_d

    .line 209
    .line 210
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    check-cast v1, Ljava/lang/Class;

    .line 215
    .line 216
    if-eqz v1, :cond_10

    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_d
    :goto_4
    invoke-static {v4}, Lxh;->Ж(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    new-array v1, v10, [Ljava/lang/Class;

    .line 224
    .line 225
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    move-object v1, v0

    .line 230
    check-cast v1, [Ljava/lang/Class;

    .line 231
    .line 232
    move-object v4, v2

    .line 233
    :goto_5
    if-eqz v4, :cond_10

    .line 234
    .line 235
    invoke-virtual {v4, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    if-nez v0, :cond_10

    .line 240
    .line 241
    :try_start_0
    array-length v0, v1

    .line 242
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    check-cast v0, [Ljava/lang/Class;

    .line 247
    .line 248
    invoke-virtual {v4, v8, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 249
    .line 250
    .line 251
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 252
    goto :goto_6

    .line 253
    :catchall_0
    move-exception v0

    .line 254
    new-instance v12, Leo1;

    .line 255
    .line 256
    invoke-direct {v12, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 257
    .line 258
    .line 259
    move-object v0, v12

    .line 260
    :goto_6
    instance-of v12, v0, Leo1;

    .line 261
    .line 262
    if-eqz v12, :cond_e

    .line 263
    .line 264
    const/4 v0, 0x0

    .line 265
    :cond_e
    check-cast v0, Ljava/lang/reflect/Method;

    .line 266
    .line 267
    if-eqz v0, :cond_f

    .line 268
    .line 269
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    move-result-object v12

    .line 273
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v12

    .line 277
    invoke-virtual {v12, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v12

    .line 281
    if-eqz v12, :cond_f

    .line 282
    .line 283
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 284
    .line 285
    .line 286
    move-result v12

    .line 287
    invoke-static {v12}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 288
    .line 289
    .line 290
    move-result v12

    .line 291
    if-ne v12, v5, :cond_f

    .line 292
    .line 293
    invoke-virtual {v0, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 294
    .line 295
    .line 296
    return-object v0

    .line 297
    :cond_f
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    goto :goto_5

    .line 302
    :cond_10
    :goto_7
    if-eqz v2, :cond_0

    .line 303
    .line 304
    invoke-virtual {v2, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    if-nez v0, :cond_0

    .line 309
    .line 310
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    array-length v1, v0

    .line 318
    move v4, v10

    .line 319
    :goto_8
    if-ge v4, v1, :cond_17

    .line 320
    .line 321
    aget-object v12, v0, v4

    .line 322
    .line 323
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v13

    .line 327
    invoke-static {v13, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v13

    .line 331
    if-nez v13, :cond_11

    .line 332
    .line 333
    :goto_9
    const/16 v17, 0x0

    .line 334
    .line 335
    goto :goto_b

    .line 336
    :cond_11
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    move-result-object v13

    .line 340
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v13

    .line 344
    invoke-virtual {v13, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    move-result v13

    .line 348
    if-nez v13, :cond_12

    .line 349
    .line 350
    goto :goto_9

    .line 351
    :cond_12
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 352
    .line 353
    .line 354
    move-result v13

    .line 355
    invoke-static {v13}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 356
    .line 357
    .line 358
    move-result v13

    .line 359
    if-eq v13, v5, :cond_13

    .line 360
    .line 361
    goto :goto_9

    .line 362
    :cond_13
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    move-result-object v13

    .line 366
    array-length v14, v13

    .line 367
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 368
    .line 369
    .line 370
    move-result v15

    .line 371
    if-eq v14, v15, :cond_14

    .line 372
    .line 373
    goto :goto_9

    .line 374
    :cond_14
    array-length v14, v13

    .line 375
    move v15, v10

    .line 376
    :goto_a
    if-ge v15, v14, :cond_16

    .line 377
    .line 378
    aget-object v16, v13, v15

    .line 379
    .line 380
    const/16 v17, 0x0

    .line 381
    .line 382
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v10

    .line 390
    invoke-virtual {v3, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v3

    .line 394
    if-nez v3, :cond_15

    .line 395
    .line 396
    :goto_b
    add-int/lit8 v4, v4, 0x1

    .line 397
    .line 398
    const/4 v10, 0x0

    .line 399
    goto :goto_8

    .line 400
    :cond_15
    add-int/lit8 v15, v15, 0x1

    .line 401
    .line 402
    const/4 v10, 0x0

    .line 403
    goto :goto_a

    .line 404
    :cond_16
    const/16 v17, 0x0

    .line 405
    .line 406
    goto :goto_c

    .line 407
    :cond_17
    const/16 v17, 0x0

    .line 408
    .line 409
    move-object/from16 v12, v17

    .line 410
    .line 411
    :goto_c
    if-eqz v12, :cond_18

    .line 412
    .line 413
    invoke-virtual {v12, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 414
    .line 415
    .line 416
    return-object v12

    .line 417
    :cond_18
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    const/4 v10, 0x0

    .line 422
    goto :goto_7

    .line 423
    :goto_d
    return-object v17

    .line 424
    nop

    .line 425
    :sswitch_data_0
    .sparse-switch
        -0x4f08842f -> :sswitch_8
        0x197ef -> :sswitch_7
        0x2e6108 -> :sswitch_6
        0x2e9356 -> :sswitch_5
        0x32c67c -> :sswitch_4
        0x375194 -> :sswitch_3
        0x3db6c28 -> :sswitch_2
        0x5d0225c -> :sswitch_1
        0x685847c -> :sswitch_0
    .end sparse-switch
.end method
