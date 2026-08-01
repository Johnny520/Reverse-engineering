.class public Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/ClassVisitorFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FrameTranslator"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field protected static final NAME:Ljava/lang/String; = "frames"


# instance fields
.field private final sourceLabel:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final targetLabel:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;->sourceLabel:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;->targetLabel:Ljava/lang/Class;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    new-instance v2, Lnet/bytebuddy/jar/asm/Label;

    .line 6
    .line 7
    invoke-direct {v2}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v6, Lnet/bytebuddy/jar/asm/Label;

    .line 11
    .line 12
    invoke-direct {v6}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v7, Lnet/bytebuddy/jar/asm/Label;

    .line 16
    .line 17
    invoke-direct {v7}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v8, Lnet/bytebuddy/jar/asm/Label;

    .line 21
    .line 22
    invoke-direct {v8}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v9, Lnet/bytebuddy/jar/asm/Label;

    .line 26
    .line 27
    invoke-direct {v9}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 28
    .line 29
    .line 30
    const/16 v10, 0x19

    .line 31
    .line 32
    const/4 v11, 0x1

    .line 33
    invoke-virtual {v1, v10, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 34
    .line 35
    .line 36
    const/16 v3, 0xc7

    .line 37
    .line 38
    invoke-virtual {v1, v3, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 42
    .line 43
    .line 44
    const/16 v12, 0xb0

    .line 45
    .line 46
    invoke-virtual {v1, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 50
    .line 51
    .line 52
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-interface {v4}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-static {v3, v4}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v2, v1, v3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->same(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v10, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 76
    .line 77
    .line 78
    const/16 v2, 0xbe

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 81
    .line 82
    .line 83
    const-class v13, Ljava/lang/Object;

    .line 84
    .line 85
    invoke-static {v13}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    const/16 v4, 0xbd

    .line 90
    .line 91
    invoke-virtual {v1, v4, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const/16 v3, 0x3a

    .line 95
    .line 96
    const/4 v14, 0x2

    .line 97
    invoke-virtual {v1, v3, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 98
    .line 99
    .line 100
    const/4 v15, 0x3

    .line 101
    invoke-virtual {v1, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 102
    .line 103
    .line 104
    const/16 v3, 0x36

    .line 105
    .line 106
    invoke-virtual {v1, v3, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 110
    .line 111
    .line 112
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    const-class v16, [Ljava/lang/Object;

    .line 117
    .line 118
    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    sget-object v17, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 123
    .line 124
    invoke-static/range {v17 .. v17}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    new-array v12, v14, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 129
    .line 130
    move-object/from16 v18, v5

    .line 131
    .line 132
    const/4 v5, 0x0

    .line 133
    aput-object v4, v12, v5

    .line 134
    .line 135
    aput-object v18, v12, v11

    .line 136
    .line 137
    invoke-static {v12}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 142
    .line 143
    .line 144
    move-result-object v12

    .line 145
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 146
    .line 147
    .line 148
    move-result-object v18

    .line 149
    invoke-interface/range {v18 .. v18}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    invoke-static {v12, v5}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    invoke-virtual {v3, v1, v4, v5}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->append(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;Ljava/util/List;)V

    .line 158
    .line 159
    .line 160
    const/16 v12, 0x15

    .line 161
    .line 162
    invoke-virtual {v1, v12, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, v10, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 169
    .line 170
    .line 171
    const/16 v2, 0xa2

    .line 172
    .line 173
    invoke-virtual {v1, v2, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1, v10, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1, v12, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, v10, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1, v12, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 186
    .line 187
    .line 188
    const/16 v2, 0x32

    .line 189
    .line 190
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 191
    .line 192
    .line 193
    iget-object v3, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;->sourceLabel:Ljava/lang/Class;

    .line 194
    .line 195
    invoke-static {v3}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    const/16 v4, 0xc1

    .line 200
    .line 201
    invoke-virtual {v1, v4, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 202
    .line 203
    .line 204
    const/16 v3, 0x99

    .line 205
    .line 206
    invoke-virtual {v1, v3, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 207
    .line 208
    .line 209
    const/4 v3, 0x0

    .line 210
    invoke-virtual {v1, v10, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1, v10, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1, v12, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 220
    .line 221
    .line 222
    iget-object v4, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;->sourceLabel:Ljava/lang/Class;

    .line 223
    .line 224
    invoke-static {v4}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    const/16 v5, 0xc0

    .line 229
    .line 230
    invoke-virtual {v1, v5, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    invoke-interface {v4}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    iget-object v5, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;->targetLabel:Ljava/lang/Class;

    .line 242
    .line 243
    invoke-static {v5}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    iget-object v0, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;->sourceLabel:Ljava/lang/Class;

    .line 248
    .line 249
    invoke-static {v0}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    filled-new-array {v0}, [Lnet/bytebuddy/jar/asm/Type;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-static {v5, v0}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    const/4 v5, 0x0

    .line 262
    const/16 v1, 0xb7

    .line 263
    .line 264
    move/from16 v19, v3

    .line 265
    .line 266
    const-string v3, "label"

    .line 267
    .line 268
    move-object v2, v4

    .line 269
    move-object v4, v0

    .line 270
    move-object/from16 v0, p1

    .line 271
    .line 272
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 273
    .line 274
    .line 275
    const/16 v1, 0xa7

    .line 276
    .line 277
    invoke-virtual {v0, v1, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 281
    .line 282
    .line 283
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    invoke-static/range {v17 .. v17}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    new-array v5, v14, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 296
    .line 297
    aput-object v3, v5, v19

    .line 298
    .line 299
    aput-object v4, v5, v11

    .line 300
    .line 301
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 314
    .line 315
    .line 316
    move-result-object v5

    .line 317
    invoke-interface {v5}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 322
    .line 323
    .line 324
    move-result-object v9

    .line 325
    invoke-static/range {v17 .. v17}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 326
    .line 327
    .line 328
    move-result-object v18

    .line 329
    new-array v1, v14, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 330
    .line 331
    aput-object v9, v1, v19

    .line 332
    .line 333
    aput-object v18, v1, v11

    .line 334
    .line 335
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    invoke-static {v4, v5, v1}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    invoke-virtual {v2, v0, v3, v1}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->full(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;Ljava/util/List;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0, v10, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0, v12, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 350
    .line 351
    .line 352
    const/16 v1, 0x32

    .line 353
    .line 354
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 358
    .line 359
    .line 360
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    invoke-static/range {v17 .. v17}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    invoke-static {v13}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 373
    .line 374
    .line 375
    move-result-object v4

    .line 376
    new-array v5, v15, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 377
    .line 378
    aput-object v2, v5, v19

    .line 379
    .line 380
    aput-object v3, v5, v11

    .line 381
    .line 382
    aput-object v4, v5, v14

    .line 383
    .line 384
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 397
    .line 398
    .line 399
    move-result-object v4

    .line 400
    invoke-interface {v4}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 401
    .line 402
    .line 403
    move-result-object v4

    .line 404
    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 405
    .line 406
    .line 407
    move-result-object v5

    .line 408
    invoke-static/range {v17 .. v17}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 409
    .line 410
    .line 411
    move-result-object v7

    .line 412
    new-array v9, v14, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 413
    .line 414
    aput-object v5, v9, v19

    .line 415
    .line 416
    aput-object v7, v9, v11

    .line 417
    .line 418
    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 419
    .line 420
    .line 421
    move-result-object v5

    .line 422
    invoke-static {v3, v4, v5}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    invoke-virtual {v1, v0, v2, v3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->full(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;Ljava/util/List;)V

    .line 427
    .line 428
    .line 429
    const/16 v1, 0x53

    .line 430
    .line 431
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v0, v15, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIincInsn(II)V

    .line 435
    .line 436
    .line 437
    const/16 v1, 0xa7

    .line 438
    .line 439
    invoke-virtual {v0, v1, v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v0, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 443
    .line 444
    .line 445
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 458
    .line 459
    .line 460
    move-result-object v3

    .line 461
    invoke-interface {v3}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 466
    .line 467
    .line 468
    move-result-object v4

    .line 469
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 470
    .line 471
    .line 472
    move-result-object v4

    .line 473
    invoke-static {v2, v3, v4}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    invoke-virtual {v1, v0, v11, v2}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->chop(Lnet/bytebuddy/jar/asm/MethodVisitor;ILjava/util/List;)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v0, v10, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 481
    .line 482
    .line 483
    const/16 v1, 0xb0

    .line 484
    .line 485
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 486
    .line 487
    .line 488
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 489
    .line 490
    const/4 v1, 0x5

    .line 491
    const/4 v2, 0x4

    .line 492
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 493
    .line 494
    .line 495
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;->sourceLabel:Ljava/lang/Class;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;->sourceLabel:Ljava/lang/Class;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;->targetLabel:Ljava/lang/Class;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;->targetLabel:Ljava/lang/Class;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;->sourceLabel:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/Class;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object p0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$FrameTranslator;->targetLabel:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v0

    .line 25
    return p0
.end method
