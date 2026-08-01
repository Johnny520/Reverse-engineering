.class public abstract Lcom/android/dx/rop/cst/CstBaseMethodRef;
.super Lcom/android/dx/rop/cst/CstMemberRef;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private instancePrototype:Lcom/android/dx/rop/type/Prototype;

.field private final prototype:Lcom/android/dx/rop/type/Prototype;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstNat;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/android/dx/rop/cst/CstMemberRef;-><init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstNat;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMemberRef;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstNat;->getDescriptor()Lcom/android/dx/rop/cst/CstString;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->isSignaturePolymorphic()Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, Lcom/android/dx/rop/type/Prototype;->fromDescriptor(Ljava/lang/String;)Lcom/android/dx/rop/type/Prototype;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lcom/android/dx/rop/cst/CstBaseMethodRef;->prototype:Lcom/android/dx/rop/type/Prototype;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {p1}, Lcom/android/dx/rop/type/Prototype;->intern(Ljava/lang/String;)Lcom/android/dx/rop/type/Prototype;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lcom/android/dx/rop/cst/CstBaseMethodRef;->prototype:Lcom/android/dx/rop/type/Prototype;

    .line 34
    .line 35
    :goto_0
    const/4 p1, 0x0

    .line 36
    iput-object p1, p0, Lcom/android/dx/rop/cst/CstBaseMethodRef;->instancePrototype:Lcom/android/dx/rop/type/Prototype;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final compareTo0(Lcom/android/dx/rop/cst/Constant;)I
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/android/dx/rop/cst/CstMemberRef;->compareTo0(Lcom/android/dx/rop/cst/Constant;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    check-cast p1, Lcom/android/dx/rop/cst/CstBaseMethodRef;

    .line 9
    .line 10
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstBaseMethodRef;->prototype:Lcom/android/dx/rop/type/Prototype;

    .line 11
    .line 12
    iget-object p1, p1, Lcom/android/dx/rop/cst/CstBaseMethodRef;->prototype:Lcom/android/dx/rop/type/Prototype;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/type/Prototype;->compareTo(Lcom/android/dx/rop/type/Prototype;)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public final getParameterWordCount(Z)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->getPrototype(Z)Lcom/android/dx/rop/type/Prototype;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Prototype;->getParameterTypes()Lcom/android/dx/rop/type/StdTypeList;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lcom/android/dx/rop/type/StdTypeList;->getWordCount()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final getPrototype()Lcom/android/dx/rop/type/Prototype;
    .locals 0

    .line 29
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstBaseMethodRef;->prototype:Lcom/android/dx/rop/type/Prototype;

    return-object p0
.end method

.method public final getPrototype(Z)Lcom/android/dx/rop/type/Prototype;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstBaseMethodRef;->prototype:Lcom/android/dx/rop/type/Prototype;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/android/dx/rop/cst/CstBaseMethodRef;->instancePrototype:Lcom/android/dx/rop/type/Prototype;

    .line 7
    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMemberRef;->getDefiningClass()Lcom/android/dx/rop/cst/CstType;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstType;->getClassType()Lcom/android/dx/rop/type/Type;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v0, p0, Lcom/android/dx/rop/cst/CstBaseMethodRef;->prototype:Lcom/android/dx/rop/type/Prototype;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lcom/android/dx/rop/type/Prototype;->withFirstParameter(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/Prototype;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lcom/android/dx/rop/cst/CstBaseMethodRef;->instancePrototype:Lcom/android/dx/rop/type/Prototype;

    .line 25
    .line 26
    :cond_1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstBaseMethodRef;->instancePrototype:Lcom/android/dx/rop/type/Prototype;

    .line 27
    .line 28
    return-object p0
.end method

.method public final getType()Lcom/android/dx/rop/type/Type;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstBaseMethodRef;->prototype:Lcom/android/dx/rop/type/Prototype;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/type/Prototype;->getReturnType()Lcom/android/dx/rop/type/Type;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final isClassInit()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMemberRef;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstNat;->isClassInit()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final isInstanceInit()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMemberRef;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstNat;->isInstanceInit()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final isSignaturePolymorphic()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMemberRef;->getDefiningClass()Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/android/dx/rop/cst/CstType;->METHOD_HANDLE:Lcom/android/dx/rop/cst/CstType;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/android/dx/rop/cst/CstType;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMemberRef;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstNat;->getName()Lcom/android/dx/rop/cst/CstString;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const-string v0, "invoke"

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    const-string v0, "invokeExact"

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-nez p0, :cond_0

    .line 45
    .line 46
    goto/16 :goto_1

    .line 47
    .line 48
    :cond_0
    return v3

    .line 49
    :cond_1
    sget-object v1, Lcom/android/dx/rop/cst/CstType;->VAR_HANDLE:Lcom/android/dx/rop/cst/CstType;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lcom/android/dx/rop/cst/CstType;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_21

    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMemberRef;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstNat;->getName()Lcom/android/dx/rop/cst/CstString;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    const/4 v1, -0x1

    .line 77
    sparse-switch v0, :sswitch_data_0

    .line 78
    .line 79
    .line 80
    goto/16 :goto_0

    .line 81
    .line 82
    :sswitch_0
    const-string v0, "weakCompareAndSetRelease"

    .line 83
    .line 84
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-nez p0, :cond_2

    .line 89
    .line 90
    goto/16 :goto_0

    .line 91
    .line 92
    :cond_2
    const/16 v1, 0x1e

    .line 93
    .line 94
    goto/16 :goto_0

    .line 95
    .line 96
    :sswitch_1
    const-string v0, "getAndSetAcquire"

    .line 97
    .line 98
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    if-nez p0, :cond_3

    .line 103
    .line 104
    goto/16 :goto_0

    .line 105
    .line 106
    :cond_3
    const/16 v1, 0x1d

    .line 107
    .line 108
    goto/16 :goto_0

    .line 109
    .line 110
    :sswitch_2
    const-string v0, "compareAndExchange"

    .line 111
    .line 112
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-nez p0, :cond_4

    .line 117
    .line 118
    goto/16 :goto_0

    .line 119
    .line 120
    :cond_4
    const/16 v1, 0x1c

    .line 121
    .line 122
    goto/16 :goto_0

    .line 123
    .line 124
    :sswitch_3
    const-string v0, "getAndBitwiseOr"

    .line 125
    .line 126
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    if-nez p0, :cond_5

    .line 131
    .line 132
    goto/16 :goto_0

    .line 133
    .line 134
    :cond_5
    const/16 v1, 0x1b

    .line 135
    .line 136
    goto/16 :goto_0

    .line 137
    .line 138
    :sswitch_4
    const-string v0, "getAndBitwiseXorAcquire"

    .line 139
    .line 140
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    if-nez p0, :cond_6

    .line 145
    .line 146
    goto/16 :goto_0

    .line 147
    .line 148
    :cond_6
    const/16 v1, 0x1a

    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :sswitch_5
    const-string v0, "getAndAddAcquire"

    .line 153
    .line 154
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    if-nez p0, :cond_7

    .line 159
    .line 160
    goto/16 :goto_0

    .line 161
    .line 162
    :cond_7
    const/16 v1, 0x19

    .line 163
    .line 164
    goto/16 :goto_0

    .line 165
    .line 166
    :sswitch_6
    const-string v0, "compareAndExchangeAcquire"

    .line 167
    .line 168
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    if-nez p0, :cond_8

    .line 173
    .line 174
    goto/16 :goto_0

    .line 175
    .line 176
    :cond_8
    const/16 v1, 0x18

    .line 177
    .line 178
    goto/16 :goto_0

    .line 179
    .line 180
    :sswitch_7
    const-string v0, "getOpaque"

    .line 181
    .line 182
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result p0

    .line 186
    if-nez p0, :cond_9

    .line 187
    .line 188
    goto/16 :goto_0

    .line 189
    .line 190
    :cond_9
    const/16 v1, 0x17

    .line 191
    .line 192
    goto/16 :goto_0

    .line 193
    .line 194
    :sswitch_8
    const-string v0, "setOpaque"

    .line 195
    .line 196
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result p0

    .line 200
    if-nez p0, :cond_a

    .line 201
    .line 202
    goto/16 :goto_0

    .line 203
    .line 204
    :cond_a
    const/16 v1, 0x16

    .line 205
    .line 206
    goto/16 :goto_0

    .line 207
    .line 208
    :sswitch_9
    const-string v0, "getAndBitwiseAndAcquire"

    .line 209
    .line 210
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result p0

    .line 214
    if-nez p0, :cond_b

    .line 215
    .line 216
    goto/16 :goto_0

    .line 217
    .line 218
    :cond_b
    const/16 v1, 0x15

    .line 219
    .line 220
    goto/16 :goto_0

    .line 221
    .line 222
    :sswitch_a
    const-string v0, "getAndSet"

    .line 223
    .line 224
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result p0

    .line 228
    if-nez p0, :cond_c

    .line 229
    .line 230
    goto/16 :goto_0

    .line 231
    .line 232
    :cond_c
    const/16 v1, 0x14

    .line 233
    .line 234
    goto/16 :goto_0

    .line 235
    .line 236
    :sswitch_b
    const-string v0, "getAndAdd"

    .line 237
    .line 238
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result p0

    .line 242
    if-nez p0, :cond_d

    .line 243
    .line 244
    goto/16 :goto_0

    .line 245
    .line 246
    :cond_d
    const/16 v1, 0x13

    .line 247
    .line 248
    goto/16 :goto_0

    .line 249
    .line 250
    :sswitch_c
    const-string v0, "getVolatile"

    .line 251
    .line 252
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result p0

    .line 256
    if-nez p0, :cond_e

    .line 257
    .line 258
    goto/16 :goto_0

    .line 259
    .line 260
    :cond_e
    const/16 v1, 0x12

    .line 261
    .line 262
    goto/16 :goto_0

    .line 263
    .line 264
    :sswitch_d
    const-string v0, "setVolatile"

    .line 265
    .line 266
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result p0

    .line 270
    if-nez p0, :cond_f

    .line 271
    .line 272
    goto/16 :goto_0

    .line 273
    .line 274
    :cond_f
    const/16 v1, 0x11

    .line 275
    .line 276
    goto/16 :goto_0

    .line 277
    .line 278
    :sswitch_e
    const-string v0, "getAndBitwiseOrAcquire"

    .line 279
    .line 280
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result p0

    .line 284
    if-nez p0, :cond_10

    .line 285
    .line 286
    goto/16 :goto_0

    .line 287
    .line 288
    :cond_10
    const/16 v1, 0x10

    .line 289
    .line 290
    goto/16 :goto_0

    .line 291
    .line 292
    :sswitch_f
    const-string v0, "set"

    .line 293
    .line 294
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result p0

    .line 298
    if-nez p0, :cond_11

    .line 299
    .line 300
    goto/16 :goto_0

    .line 301
    .line 302
    :cond_11
    const/16 v1, 0xf

    .line 303
    .line 304
    goto/16 :goto_0

    .line 305
    .line 306
    :sswitch_10
    const-string v0, "get"

    .line 307
    .line 308
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result p0

    .line 312
    if-nez p0, :cond_12

    .line 313
    .line 314
    goto/16 :goto_0

    .line 315
    .line 316
    :cond_12
    const/16 v1, 0xe

    .line 317
    .line 318
    goto/16 :goto_0

    .line 319
    .line 320
    :sswitch_11
    const-string v0, "getAndSetRelease"

    .line 321
    .line 322
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result p0

    .line 326
    if-nez p0, :cond_13

    .line 327
    .line 328
    goto/16 :goto_0

    .line 329
    .line 330
    :cond_13
    const/16 v1, 0xd

    .line 331
    .line 332
    goto/16 :goto_0

    .line 333
    .line 334
    :sswitch_12
    const-string v0, "getAcquire"

    .line 335
    .line 336
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result p0

    .line 340
    if-nez p0, :cond_14

    .line 341
    .line 342
    goto/16 :goto_0

    .line 343
    .line 344
    :cond_14
    const/16 v1, 0xc

    .line 345
    .line 346
    goto/16 :goto_0

    .line 347
    .line 348
    :sswitch_13
    const-string v0, "setRelease"

    .line 349
    .line 350
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    move-result p0

    .line 354
    if-nez p0, :cond_15

    .line 355
    .line 356
    goto/16 :goto_0

    .line 357
    .line 358
    :cond_15
    const/16 v1, 0xb

    .line 359
    .line 360
    goto/16 :goto_0

    .line 361
    .line 362
    :sswitch_14
    const-string v0, "weakCompareAndSetAcquire"

    .line 363
    .line 364
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result p0

    .line 368
    if-nez p0, :cond_16

    .line 369
    .line 370
    goto/16 :goto_0

    .line 371
    .line 372
    :cond_16
    const/16 v1, 0xa

    .line 373
    .line 374
    goto/16 :goto_0

    .line 375
    .line 376
    :sswitch_15
    const-string v0, "weakCompareAndSetPlain"

    .line 377
    .line 378
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result p0

    .line 382
    if-nez p0, :cond_17

    .line 383
    .line 384
    goto/16 :goto_0

    .line 385
    .line 386
    :cond_17
    const/16 v1, 0x9

    .line 387
    .line 388
    goto/16 :goto_0

    .line 389
    .line 390
    :sswitch_16
    const-string v0, "getAndBitwiseXorRelease"

    .line 391
    .line 392
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result p0

    .line 396
    if-nez p0, :cond_18

    .line 397
    .line 398
    goto/16 :goto_0

    .line 399
    .line 400
    :cond_18
    const/16 v1, 0x8

    .line 401
    .line 402
    goto/16 :goto_0

    .line 403
    .line 404
    :sswitch_17
    const-string v0, "getAndBitwiseXor"

    .line 405
    .line 406
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-result p0

    .line 410
    if-nez p0, :cond_19

    .line 411
    .line 412
    goto :goto_0

    .line 413
    :cond_19
    const/4 v1, 0x7

    .line 414
    goto :goto_0

    .line 415
    :sswitch_18
    const-string v0, "getAndBitwiseAnd"

    .line 416
    .line 417
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result p0

    .line 421
    if-nez p0, :cond_1a

    .line 422
    .line 423
    goto :goto_0

    .line 424
    :cond_1a
    const/4 v1, 0x6

    .line 425
    goto :goto_0

    .line 426
    :sswitch_19
    const-string v0, "getAndAddRelease"

    .line 427
    .line 428
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    move-result p0

    .line 432
    if-nez p0, :cond_1b

    .line 433
    .line 434
    goto :goto_0

    .line 435
    :cond_1b
    const/4 v1, 0x5

    .line 436
    goto :goto_0

    .line 437
    :sswitch_1a
    const-string v0, "weakCompareAndSet"

    .line 438
    .line 439
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    move-result p0

    .line 443
    if-nez p0, :cond_1c

    .line 444
    .line 445
    goto :goto_0

    .line 446
    :cond_1c
    const/4 v1, 0x4

    .line 447
    goto :goto_0

    .line 448
    :sswitch_1b
    const-string v0, "compareAndExchangeRelease"

    .line 449
    .line 450
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    move-result p0

    .line 454
    if-nez p0, :cond_1d

    .line 455
    .line 456
    goto :goto_0

    .line 457
    :cond_1d
    const/4 v1, 0x3

    .line 458
    goto :goto_0

    .line 459
    :sswitch_1c
    const-string v0, "compareAndSet"

    .line 460
    .line 461
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 462
    .line 463
    .line 464
    move-result p0

    .line 465
    if-nez p0, :cond_1e

    .line 466
    .line 467
    goto :goto_0

    .line 468
    :cond_1e
    const/4 v1, 0x2

    .line 469
    goto :goto_0

    .line 470
    :sswitch_1d
    const-string v0, "getAndBitwiseAndRelease"

    .line 471
    .line 472
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    move-result p0

    .line 476
    if-nez p0, :cond_1f

    .line 477
    .line 478
    goto :goto_0

    .line 479
    :cond_1f
    move v1, v3

    .line 480
    goto :goto_0

    .line 481
    :sswitch_1e
    const-string v0, "getAndBitwiseOrRelease"

    .line 482
    .line 483
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    move-result p0

    .line 487
    if-nez p0, :cond_20

    .line 488
    .line 489
    goto :goto_0

    .line 490
    :cond_20
    move v1, v2

    .line 491
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 492
    .line 493
    .line 494
    goto :goto_1

    .line 495
    :pswitch_0
    return v3

    .line 496
    :cond_21
    :goto_1
    return v2

    .line 497
    :sswitch_data_0
    .sparse-switch
        -0x74054ecc -> :sswitch_1e
        -0x64896c60 -> :sswitch_1d
        -0x639aefb0 -> :sswitch_1c
        -0x4d038cae -> :sswitch_1b
        -0x42a27c48 -> :sswitch_1a
        -0x41bf8e59 -> :sswitch_19
        -0x3d910599 -> :sswitch_18
        -0x3d90af15 -> :sswitch_17
        -0x2f5b5f64 -> :sswitch_16
        -0x21ce070e -> :sswitch_15
        -0xe5aaa02 -> :sswitch_14
        -0xdc04ebb -> :sswitch_13
        -0x7976360 -> :sswitch_12
        -0x23e5d3a -> :sswitch_11
        0x18f56 -> :sswitch_10
        0x1bc62 -> :sswitch_f
        0x594ea03 -> :sswitch_e
        0x6099c1e -> :sswitch_d
        0xb513b12 -> :sswitch_c
        0x10d9c640 -> :sswitch_b
        0x10da0a01 -> :sswitch_a
        0x1510cc6f -> :sswitch_9
        0x1c0e5b23 -> :sswitch_8
        0x28d92717 -> :sswitch_7
        0x2c96ac21 -> :sswitch_6
        0x37daaa76 -> :sswitch_5
        0x4a3ed96b -> :sswitch_4
        0x50983b53 -> :sswitch_3
        0x58737ef5 -> :sswitch_2
        0x775bdb95 -> :sswitch_1
        0x780b1d2f -> :sswitch_0
    .end sparse-switch

    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
