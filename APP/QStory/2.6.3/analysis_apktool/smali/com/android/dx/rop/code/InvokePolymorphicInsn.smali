.class public Lcom/android/dx/rop/code/InvokePolymorphicInsn;
.super Lcom/android/dx/rop/code/Insn;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field private static final DEFAULT_DESCRIPTOR:Lcom/android/dx/rop/cst/CstString;

.field private static final VARHANDLE_COMPARE_AND_SET_DESCRIPTOR:Lcom/android/dx/rop/cst/CstString;

.field private static final VARHANDLE_SET_DESCRIPTOR:Lcom/android/dx/rop/cst/CstString;


# instance fields
.field private final callSiteMethod:Lcom/android/dx/rop/cst/CstMethodRef;

.field private final callSiteProto:Lcom/android/dx/rop/cst/CstProtoRef;

.field private final catches:Lcom/android/dx/rop/type/TypeList;

.field private final polymorphicMethod:Lcom/android/dx/rop/cst/CstMethodRef;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    const-string v1, "([Ljava/lang/Object;)Ljava/lang/Object;"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->DEFAULT_DESCRIPTOR:Lcom/android/dx/rop/cst/CstString;

    .line 9
    .line 10
    new-instance v0, Lcom/android/dx/rop/cst/CstString;

    .line 11
    .line 12
    const-string v1, "([Ljava/lang/Object;)V"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->VARHANDLE_SET_DESCRIPTOR:Lcom/android/dx/rop/cst/CstString;

    .line 18
    .line 19
    new-instance v0, Lcom/android/dx/rop/cst/CstString;

    .line 20
    .line 21
    const-string v1, "([Ljava/lang/Object;)Z"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lcom/android/dx/rop/cst/CstString;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->VARHANDLE_COMPARE_AND_SET_DESCRIPTOR:Lcom/android/dx/rop/cst/CstString;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/CstMethodRef;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0, p3}, Lcom/android/dx/rop/code/Insn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    const/4 p3, 0x6

    .line 10
    if-ne p2, p3, :cond_3

    .line 11
    .line 12
    if-eqz p4, :cond_2

    .line 13
    .line 14
    iput-object p4, p0, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->catches:Lcom/android/dx/rop/type/TypeList;

    .line 15
    .line 16
    if-eqz p5, :cond_1

    .line 17
    .line 18
    invoke-virtual {p5}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->isSignaturePolymorphic()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iput-object p5, p0, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->callSiteMethod:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 25
    .line 26
    invoke-static {p5}, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->makePolymorphicMethod(Lcom/android/dx/rop/cst/CstMethodRef;)Lcom/android/dx/rop/cst/CstMethodRef;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->polymorphicMethod:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 31
    .line 32
    invoke-static {p5}, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->makeCallSiteProto(Lcom/android/dx/rop/cst/CstMethodRef;)Lcom/android/dx/rop/cst/CstProtoRef;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->callSiteProto:Lcom/android/dx/rop/cst/CstProtoRef;

    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    const-string p0, "callSiteMethod is not signature polymorphic"

    .line 40
    .line 41
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0

    .line 45
    :cond_1
    const-string p0, "callSiteMethod == null"

    .line 46
    .line 47
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :cond_2
    const-string p0, "catches == null"

    .line 52
    .line 53
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v0

    .line 57
    :cond_3
    const-string p0, "opcode with invalid branchingness: "

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/android/dx/rop/code/Rop;->getBranchingness()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世哲苏兰(ILjava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v0
.end method

.method private static makeCallSiteProto(Lcom/android/dx/rop/cst/CstMethodRef;)Lcom/android/dx/rop/cst/CstProtoRef;
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/rop/cst/CstProtoRef;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {p0, v1}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->getPrototype(Z)Lcom/android/dx/rop/type/Prototype;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-direct {v0, p0}, Lcom/android/dx/rop/cst/CstProtoRef;-><init>(Lcom/android/dx/rop/type/Prototype;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method private static makePolymorphicMethod(Lcom/android/dx/rop/cst/CstMethodRef;)Lcom/android/dx/rop/cst/CstMethodRef;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMemberRef;->getDefiningClass()Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMemberRef;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/android/dx/rop/cst/CstNat;->getName()Lcom/android/dx/rop/cst/CstString;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMemberRef;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Lcom/android/dx/rop/cst/CstNat;->getName()Lcom/android/dx/rop/cst/CstString;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Lcom/android/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    sget-object v3, Lcom/android/dx/rop/cst/CstType;->METHOD_HANDLE:Lcom/android/dx/rop/cst/CstType;

    .line 26
    .line 27
    invoke-virtual {v0, v3}, Lcom/android/dx/rop/cst/CstType;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    const-string v3, "invoke"

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    const-string v3, "invokeExact"

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    :cond_0
    new-instance p0, Lcom/android/dx/rop/cst/CstNat;

    .line 50
    .line 51
    sget-object v2, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->DEFAULT_DESCRIPTOR:Lcom/android/dx/rop/cst/CstString;

    .line 52
    .line 53
    invoke-direct {p0, v1, v2}, Lcom/android/dx/rop/cst/CstNat;-><init>(Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;)V

    .line 54
    .line 55
    .line 56
    new-instance v1, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 57
    .line 58
    invoke-direct {v1, v0, p0}, Lcom/android/dx/rop/cst/CstMethodRef;-><init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstNat;)V

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_1
    sget-object v3, Lcom/android/dx/rop/cst/CstType;->VAR_HANDLE:Lcom/android/dx/rop/cst/CstType;

    .line 63
    .line 64
    invoke-virtual {v0, v3}, Lcom/android/dx/rop/cst/CstType;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_21

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    const/4 v4, -0x1

    .line 78
    sparse-switch v3, :sswitch_data_0

    .line 79
    .line 80
    .line 81
    goto/16 :goto_0

    .line 82
    .line 83
    :sswitch_0
    const-string v3, "weakCompareAndSetRelease"

    .line 84
    .line 85
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-nez v2, :cond_2

    .line 90
    .line 91
    goto/16 :goto_0

    .line 92
    .line 93
    :cond_2
    const/16 v4, 0x1e

    .line 94
    .line 95
    goto/16 :goto_0

    .line 96
    .line 97
    :sswitch_1
    const-string v3, "getAndSetAcquire"

    .line 98
    .line 99
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-nez v2, :cond_3

    .line 104
    .line 105
    goto/16 :goto_0

    .line 106
    .line 107
    :cond_3
    const/16 v4, 0x1d

    .line 108
    .line 109
    goto/16 :goto_0

    .line 110
    .line 111
    :sswitch_2
    const-string v3, "compareAndExchange"

    .line 112
    .line 113
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-nez v2, :cond_4

    .line 118
    .line 119
    goto/16 :goto_0

    .line 120
    .line 121
    :cond_4
    const/16 v4, 0x1c

    .line 122
    .line 123
    goto/16 :goto_0

    .line 124
    .line 125
    :sswitch_3
    const-string v3, "getAndBitwiseOr"

    .line 126
    .line 127
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-nez v2, :cond_5

    .line 132
    .line 133
    goto/16 :goto_0

    .line 134
    .line 135
    :cond_5
    const/16 v4, 0x1b

    .line 136
    .line 137
    goto/16 :goto_0

    .line 138
    .line 139
    :sswitch_4
    const-string v3, "getAndBitwiseXorAcquire"

    .line 140
    .line 141
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-nez v2, :cond_6

    .line 146
    .line 147
    goto/16 :goto_0

    .line 148
    .line 149
    :cond_6
    const/16 v4, 0x1a

    .line 150
    .line 151
    goto/16 :goto_0

    .line 152
    .line 153
    :sswitch_5
    const-string v3, "getAndAddAcquire"

    .line 154
    .line 155
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-nez v2, :cond_7

    .line 160
    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    :cond_7
    const/16 v4, 0x19

    .line 164
    .line 165
    goto/16 :goto_0

    .line 166
    .line 167
    :sswitch_6
    const-string v3, "compareAndExchangeAcquire"

    .line 168
    .line 169
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-nez v2, :cond_8

    .line 174
    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :cond_8
    const/16 v4, 0x18

    .line 178
    .line 179
    goto/16 :goto_0

    .line 180
    .line 181
    :sswitch_7
    const-string v3, "getOpaque"

    .line 182
    .line 183
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-nez v2, :cond_9

    .line 188
    .line 189
    goto/16 :goto_0

    .line 190
    .line 191
    :cond_9
    const/16 v4, 0x17

    .line 192
    .line 193
    goto/16 :goto_0

    .line 194
    .line 195
    :sswitch_8
    const-string v3, "setOpaque"

    .line 196
    .line 197
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    if-nez v2, :cond_a

    .line 202
    .line 203
    goto/16 :goto_0

    .line 204
    .line 205
    :cond_a
    const/16 v4, 0x16

    .line 206
    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :sswitch_9
    const-string v3, "getAndBitwiseAndAcquire"

    .line 210
    .line 211
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    if-nez v2, :cond_b

    .line 216
    .line 217
    goto/16 :goto_0

    .line 218
    .line 219
    :cond_b
    const/16 v4, 0x15

    .line 220
    .line 221
    goto/16 :goto_0

    .line 222
    .line 223
    :sswitch_a
    const-string v3, "getAndSet"

    .line 224
    .line 225
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    if-nez v2, :cond_c

    .line 230
    .line 231
    goto/16 :goto_0

    .line 232
    .line 233
    :cond_c
    const/16 v4, 0x14

    .line 234
    .line 235
    goto/16 :goto_0

    .line 236
    .line 237
    :sswitch_b
    const-string v3, "getAndAdd"

    .line 238
    .line 239
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-nez v2, :cond_d

    .line 244
    .line 245
    goto/16 :goto_0

    .line 246
    .line 247
    :cond_d
    const/16 v4, 0x13

    .line 248
    .line 249
    goto/16 :goto_0

    .line 250
    .line 251
    :sswitch_c
    const-string v3, "getVolatile"

    .line 252
    .line 253
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    if-nez v2, :cond_e

    .line 258
    .line 259
    goto/16 :goto_0

    .line 260
    .line 261
    :cond_e
    const/16 v4, 0x12

    .line 262
    .line 263
    goto/16 :goto_0

    .line 264
    .line 265
    :sswitch_d
    const-string v3, "setVolatile"

    .line 266
    .line 267
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    if-nez v2, :cond_f

    .line 272
    .line 273
    goto/16 :goto_0

    .line 274
    .line 275
    :cond_f
    const/16 v4, 0x11

    .line 276
    .line 277
    goto/16 :goto_0

    .line 278
    .line 279
    :sswitch_e
    const-string v3, "getAndBitwiseOrAcquire"

    .line 280
    .line 281
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    if-nez v2, :cond_10

    .line 286
    .line 287
    goto/16 :goto_0

    .line 288
    .line 289
    :cond_10
    const/16 v4, 0x10

    .line 290
    .line 291
    goto/16 :goto_0

    .line 292
    .line 293
    :sswitch_f
    const-string v3, "set"

    .line 294
    .line 295
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    if-nez v2, :cond_11

    .line 300
    .line 301
    goto/16 :goto_0

    .line 302
    .line 303
    :cond_11
    const/16 v4, 0xf

    .line 304
    .line 305
    goto/16 :goto_0

    .line 306
    .line 307
    :sswitch_10
    const-string v3, "get"

    .line 308
    .line 309
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v2

    .line 313
    if-nez v2, :cond_12

    .line 314
    .line 315
    goto/16 :goto_0

    .line 316
    .line 317
    :cond_12
    const/16 v4, 0xe

    .line 318
    .line 319
    goto/16 :goto_0

    .line 320
    .line 321
    :sswitch_11
    const-string v3, "getAndSetRelease"

    .line 322
    .line 323
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    if-nez v2, :cond_13

    .line 328
    .line 329
    goto/16 :goto_0

    .line 330
    .line 331
    :cond_13
    const/16 v4, 0xd

    .line 332
    .line 333
    goto/16 :goto_0

    .line 334
    .line 335
    :sswitch_12
    const-string v3, "getAcquire"

    .line 336
    .line 337
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v2

    .line 341
    if-nez v2, :cond_14

    .line 342
    .line 343
    goto/16 :goto_0

    .line 344
    .line 345
    :cond_14
    const/16 v4, 0xc

    .line 346
    .line 347
    goto/16 :goto_0

    .line 348
    .line 349
    :sswitch_13
    const-string v3, "setRelease"

    .line 350
    .line 351
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    if-nez v2, :cond_15

    .line 356
    .line 357
    goto/16 :goto_0

    .line 358
    .line 359
    :cond_15
    const/16 v4, 0xb

    .line 360
    .line 361
    goto/16 :goto_0

    .line 362
    .line 363
    :sswitch_14
    const-string v3, "weakCompareAndSetAcquire"

    .line 364
    .line 365
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v2

    .line 369
    if-nez v2, :cond_16

    .line 370
    .line 371
    goto/16 :goto_0

    .line 372
    .line 373
    :cond_16
    const/16 v4, 0xa

    .line 374
    .line 375
    goto/16 :goto_0

    .line 376
    .line 377
    :sswitch_15
    const-string v3, "weakCompareAndSetPlain"

    .line 378
    .line 379
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v2

    .line 383
    if-nez v2, :cond_17

    .line 384
    .line 385
    goto/16 :goto_0

    .line 386
    .line 387
    :cond_17
    const/16 v4, 0x9

    .line 388
    .line 389
    goto/16 :goto_0

    .line 390
    .line 391
    :sswitch_16
    const-string v3, "getAndBitwiseXorRelease"

    .line 392
    .line 393
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    move-result v2

    .line 397
    if-nez v2, :cond_18

    .line 398
    .line 399
    goto/16 :goto_0

    .line 400
    .line 401
    :cond_18
    const/16 v4, 0x8

    .line 402
    .line 403
    goto/16 :goto_0

    .line 404
    .line 405
    :sswitch_17
    const-string v3, "getAndBitwiseXor"

    .line 406
    .line 407
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    move-result v2

    .line 411
    if-nez v2, :cond_19

    .line 412
    .line 413
    goto :goto_0

    .line 414
    :cond_19
    const/4 v4, 0x7

    .line 415
    goto :goto_0

    .line 416
    :sswitch_18
    const-string v3, "getAndBitwiseAnd"

    .line 417
    .line 418
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    move-result v2

    .line 422
    if-nez v2, :cond_1a

    .line 423
    .line 424
    goto :goto_0

    .line 425
    :cond_1a
    const/4 v4, 0x6

    .line 426
    goto :goto_0

    .line 427
    :sswitch_19
    const-string v3, "getAndAddRelease"

    .line 428
    .line 429
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v2

    .line 433
    if-nez v2, :cond_1b

    .line 434
    .line 435
    goto :goto_0

    .line 436
    :cond_1b
    const/4 v4, 0x5

    .line 437
    goto :goto_0

    .line 438
    :sswitch_1a
    const-string v3, "weakCompareAndSet"

    .line 439
    .line 440
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v2

    .line 444
    if-nez v2, :cond_1c

    .line 445
    .line 446
    goto :goto_0

    .line 447
    :cond_1c
    const/4 v4, 0x4

    .line 448
    goto :goto_0

    .line 449
    :sswitch_1b
    const-string v3, "compareAndExchangeRelease"

    .line 450
    .line 451
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-result v2

    .line 455
    if-nez v2, :cond_1d

    .line 456
    .line 457
    goto :goto_0

    .line 458
    :cond_1d
    const/4 v4, 0x3

    .line 459
    goto :goto_0

    .line 460
    :sswitch_1c
    const-string v3, "compareAndSet"

    .line 461
    .line 462
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    move-result v2

    .line 466
    if-nez v2, :cond_1e

    .line 467
    .line 468
    goto :goto_0

    .line 469
    :cond_1e
    const/4 v4, 0x2

    .line 470
    goto :goto_0

    .line 471
    :sswitch_1d
    const-string v3, "getAndBitwiseAndRelease"

    .line 472
    .line 473
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    move-result v2

    .line 477
    if-nez v2, :cond_1f

    .line 478
    .line 479
    goto :goto_0

    .line 480
    :cond_1f
    const/4 v4, 0x1

    .line 481
    goto :goto_0

    .line 482
    :sswitch_1e
    const-string v3, "getAndBitwiseOrRelease"

    .line 483
    .line 484
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    move-result v2

    .line 488
    if-nez v2, :cond_20

    .line 489
    .line 490
    goto :goto_0

    .line 491
    :cond_20
    const/4 v4, 0x0

    .line 492
    :goto_0
    packed-switch v4, :pswitch_data_0

    .line 493
    .line 494
    .line 495
    goto :goto_1

    .line 496
    :pswitch_0
    new-instance p0, Lcom/android/dx/rop/cst/CstNat;

    .line 497
    .line 498
    sget-object v2, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->VARHANDLE_SET_DESCRIPTOR:Lcom/android/dx/rop/cst/CstString;

    .line 499
    .line 500
    invoke-direct {p0, v1, v2}, Lcom/android/dx/rop/cst/CstNat;-><init>(Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;)V

    .line 501
    .line 502
    .line 503
    new-instance v1, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 504
    .line 505
    invoke-direct {v1, v0, p0}, Lcom/android/dx/rop/cst/CstMethodRef;-><init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstNat;)V

    .line 506
    .line 507
    .line 508
    return-object v1

    .line 509
    :pswitch_1
    new-instance p0, Lcom/android/dx/rop/cst/CstNat;

    .line 510
    .line 511
    sget-object v2, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->VARHANDLE_COMPARE_AND_SET_DESCRIPTOR:Lcom/android/dx/rop/cst/CstString;

    .line 512
    .line 513
    invoke-direct {p0, v1, v2}, Lcom/android/dx/rop/cst/CstNat;-><init>(Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;)V

    .line 514
    .line 515
    .line 516
    new-instance v1, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 517
    .line 518
    invoke-direct {v1, v0, p0}, Lcom/android/dx/rop/cst/CstMethodRef;-><init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstNat;)V

    .line 519
    .line 520
    .line 521
    return-object v1

    .line 522
    :pswitch_2
    new-instance p0, Lcom/android/dx/rop/cst/CstNat;

    .line 523
    .line 524
    sget-object v2, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->DEFAULT_DESCRIPTOR:Lcom/android/dx/rop/cst/CstString;

    .line 525
    .line 526
    invoke-direct {p0, v1, v2}, Lcom/android/dx/rop/cst/CstNat;-><init>(Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;)V

    .line 527
    .line 528
    .line 529
    new-instance v1, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 530
    .line 531
    invoke-direct {v1, v0, p0}, Lcom/android/dx/rop/cst/CstMethodRef;-><init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstNat;)V

    .line 532
    .line 533
    .line 534
    return-object v1

    .line 535
    :cond_21
    :goto_1
    const-string v0, "Unknown signature polymorphic method: "

    .line 536
    .line 537
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMemberRef;->toHuman()Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object p0

    .line 541
    invoke-static {p0, v0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    const/4 p0, 0x0

    .line 545
    return-object p0

    .line 546
    nop

    .line 547
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
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public accept(Lcom/android/dx/rop/code/Insn$Visitor;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lcom/android/dx/rop/code/Insn$Visitor;->visitInvokePolymorphicInsn(Lcom/android/dx/rop/code/InvokePolymorphicInsn;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public getCallSiteMethod()Lcom/android/dx/rop/cst/CstMethodRef;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->callSiteMethod:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCallSiteProto()Lcom/android/dx/rop/cst/CstProtoRef;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->callSiteProto:Lcom/android/dx/rop/cst/CstProtoRef;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCatches()Lcom/android/dx/rop/type/TypeList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->catches:Lcom/android/dx/rop/type/TypeList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getInlineString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->getPolymorphicMethod()Lcom/android/dx/rop/cst/CstMethodRef;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lcom/android/dx/rop/cst/CstMemberRef;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, " "

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->getCallSiteProto()Lcom/android/dx/rop/cst/CstProtoRef;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Lcom/android/dx/rop/cst/CstProtoRef;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->catches:Lcom/android/dx/rop/type/TypeList;

    .line 37
    .line 38
    invoke-static {p0}, Lcom/android/dx/rop/code/ThrowingInsn;->toCatchString(Lcom/android/dx/rop/type/TypeList;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public getPolymorphicMethod()Lcom/android/dx/rop/cst/CstMethodRef;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->polymorphicMethod:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 2
    .line 3
    return-object p0
.end method

.method public withAddedCatch(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/code/Insn;
    .locals 6

    .line 1
    new-instance v0, Lcom/android/dx/rop/code/InvokePolymorphicInsn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget-object v4, p0, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->catches:Lcom/android/dx/rop/type/TypeList;

    .line 16
    .line 17
    invoke-interface {v4, p1}, Lcom/android/dx/rop/type/TypeList;->withAddedType(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/type/TypeList;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual {p0}, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->getCallSiteMethod()Lcom/android/dx/rop/cst/CstMethodRef;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-direct/range {v0 .. v5}, Lcom/android/dx/rop/code/InvokePolymorphicInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/CstMethodRef;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public withNewRegisters(Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/rop/code/Insn;
    .locals 6

    .line 1
    new-instance v0, Lcom/android/dx/rop/code/InvokePolymorphicInsn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v4, p0, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->catches:Lcom/android/dx/rop/type/TypeList;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->getCallSiteMethod()Lcom/android/dx/rop/cst/CstMethodRef;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    move-object v3, p2

    .line 18
    invoke-direct/range {v0 .. v5}, Lcom/android/dx/rop/code/InvokePolymorphicInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/CstMethodRef;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public withRegisterOffset(I)Lcom/android/dx/rop/code/Insn;
    .locals 6

    .line 1
    new-instance v0, Lcom/android/dx/rop/code/InvokePolymorphicInsn;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getOpcode()Lcom/android/dx/rop/code/Rop;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Insn;->getSources()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {v3, p1}, Lcom/android/dx/rop/code/RegisterSpecList;->withOffset(I)Lcom/android/dx/rop/code/RegisterSpecList;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v4, p0, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->catches:Lcom/android/dx/rop/type/TypeList;

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/android/dx/rop/code/InvokePolymorphicInsn;->getCallSiteMethod()Lcom/android/dx/rop/cst/CstMethodRef;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-direct/range {v0 .. v5}, Lcom/android/dx/rop/code/InvokePolymorphicInsn;-><init>(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/SourcePosition;Lcom/android/dx/rop/code/RegisterSpecList;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/CstMethodRef;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method
