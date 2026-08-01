.class public Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/ClassVisitorFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ConstantDynamicTranslator"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field protected static final NAME:Ljava/lang/String; = "constantDyanmic"


# instance fields
.field private final sourceConstantDynamic:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final sourceHandle:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final targetConstantDynamic:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final targetHandle:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
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
    iput-object p1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->sourceConstantDynamic:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->targetConstantDynamic:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->sourceHandle:Ljava/lang/Class;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->targetHandle:Ljava/lang/Class;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    new-instance v7, Lnet/bytebuddy/jar/asm/Label;

    .line 6
    .line 7
    invoke-direct {v7}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v8, Lnet/bytebuddy/jar/asm/Label;

    .line 11
    .line 12
    invoke-direct {v8}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 13
    .line 14
    .line 15
    const/16 v9, 0x19

    .line 16
    .line 17
    const/4 v10, 0x0

    .line 18
    invoke-virtual {v1, v9, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 19
    .line 20
    .line 21
    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->sourceConstantDynamic:Ljava/lang/Class;

    .line 22
    .line 23
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    sget-object v11, Lnet/bytebuddy/jar/asm/Type;->INT_TYPE:Lnet/bytebuddy/jar/asm/Type;

    .line 28
    .line 29
    new-array v2, v10, [Lnet/bytebuddy/jar/asm/Type;

    .line 30
    .line 31
    invoke-static {v11, v2}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const/4 v6, 0x0

    .line 36
    const/16 v2, 0xb6

    .line 37
    .line 38
    const-string v4, "getBootstrapMethodArgumentCount"

    .line 39
    .line 40
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-class v12, Ljava/lang/Object;

    .line 44
    .line 45
    invoke-static {v12}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const/16 v3, 0xbd

    .line 50
    .line 51
    invoke-virtual {v1, v3, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/16 v2, 0x3a

    .line 55
    .line 56
    const/4 v13, 0x1

    .line 57
    invoke-virtual {v1, v2, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 58
    .line 59
    .line 60
    const/4 v14, 0x3

    .line 61
    invoke-virtual {v1, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 62
    .line 63
    .line 64
    const/16 v2, 0x36

    .line 65
    .line 66
    const/4 v15, 0x2

    .line 67
    invoke-virtual {v1, v2, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 71
    .line 72
    .line 73
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    const-class v16, [Ljava/lang/Object;

    .line 78
    .line 79
    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 84
    .line 85
    invoke-static {v4}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    new-array v5, v15, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 90
    .line 91
    aput-object v3, v5, v10

    .line 92
    .line 93
    aput-object v4, v5, v13

    .line 94
    .line 95
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-interface {v4}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v2, v1, v3, v4}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->append(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;Ljava/util/List;)V

    .line 108
    .line 109
    .line 110
    const/16 v2, 0x15

    .line 111
    .line 112
    invoke-virtual {v1, v2, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v9, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 116
    .line 117
    .line 118
    const/16 v3, 0xbe

    .line 119
    .line 120
    invoke-virtual {v1, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 121
    .line 122
    .line 123
    const/16 v3, 0xa2

    .line 124
    .line 125
    invoke-virtual {v1, v3, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v9, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v2, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, v9, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v2, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 138
    .line 139
    .line 140
    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->sourceConstantDynamic:Ljava/lang/Class;

    .line 141
    .line 142
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-static {v12}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    filled-new-array {v11}, [Lnet/bytebuddy/jar/asm/Type;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-static {v2, v4}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    const/16 v2, 0xb6

    .line 159
    .line 160
    const-string v4, "getBootstrapMethodArgument"

    .line 161
    .line 162
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 163
    .line 164
    .line 165
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-interface {v1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-static {v12}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-static {v12}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    filled-new-array {v2}, [Lnet/bytebuddy/jar/asm/Type;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-static {v1, v2}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    const/16 v2, 0xb8

    .line 190
    .line 191
    const-string v4, "ldc"

    .line 192
    .line 193
    move-object/from16 v1, p1

    .line 194
    .line 195
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 196
    .line 197
    .line 198
    const/16 v2, 0x53

    .line 199
    .line 200
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1, v15, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIincInsn(II)V

    .line 204
    .line 205
    .line 206
    const/16 v2, 0xa7

    .line 207
    .line 208
    invoke-virtual {v1, v2, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 212
    .line 213
    .line 214
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    invoke-interface {v3}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    invoke-static {v3, v4}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    invoke-virtual {v2, v1, v13, v3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->chop(Lnet/bytebuddy/jar/asm/MethodVisitor;ILjava/util/List;)V

    .line 235
    .line 236
    .line 237
    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->targetConstantDynamic:Ljava/lang/Class;

    .line 238
    .line 239
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    const/16 v3, 0xbb

    .line 244
    .line 245
    invoke-virtual {v1, v3, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 246
    .line 247
    .line 248
    const/16 v2, 0x59

    .line 249
    .line 250
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1, v9, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 254
    .line 255
    .line 256
    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->sourceConstantDynamic:Ljava/lang/Class;

    .line 257
    .line 258
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    const-class v7, Ljava/lang/String;

    .line 263
    .line 264
    invoke-static {v7}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    new-array v4, v10, [Lnet/bytebuddy/jar/asm/Type;

    .line 269
    .line 270
    invoke-static {v2, v4}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v5

    .line 274
    const/16 v2, 0xb6

    .line 275
    .line 276
    const-string v4, "getName"

    .line 277
    .line 278
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1, v9, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 282
    .line 283
    .line 284
    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->sourceConstantDynamic:Ljava/lang/Class;

    .line 285
    .line 286
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    invoke-static {v7}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    new-array v4, v10, [Lnet/bytebuddy/jar/asm/Type;

    .line 295
    .line 296
    invoke-static {v2, v4}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    const/16 v2, 0xb6

    .line 301
    .line 302
    const-string v4, "getDescriptor"

    .line 303
    .line 304
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v1, v9, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 308
    .line 309
    .line 310
    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->sourceConstantDynamic:Ljava/lang/Class;

    .line 311
    .line 312
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->sourceHandle:Ljava/lang/Class;

    .line 317
    .line 318
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    new-array v4, v10, [Lnet/bytebuddy/jar/asm/Type;

    .line 323
    .line 324
    invoke-static {v2, v4}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v5

    .line 328
    const/16 v2, 0xb6

    .line 329
    .line 330
    const-string v4, "getBootstrapMethod"

    .line 331
    .line 332
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 333
    .line 334
    .line 335
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    invoke-interface {v1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    iget-object v1, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->targetHandle:Ljava/lang/Class;

    .line 344
    .line 345
    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->sourceHandle:Ljava/lang/Class;

    .line 350
    .line 351
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    filled-new-array {v2}, [Lnet/bytebuddy/jar/asm/Type;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    invoke-static {v1, v2}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    const/16 v2, 0xb8

    .line 364
    .line 365
    const-string v4, "handle"

    .line 366
    .line 367
    move-object/from16 v1, p1

    .line 368
    .line 369
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v1, v9, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 373
    .line 374
    .line 375
    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->targetConstantDynamic:Ljava/lang/Class;

    .line 376
    .line 377
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    sget-object v3, Lnet/bytebuddy/jar/asm/Type;->VOID_TYPE:Lnet/bytebuddy/jar/asm/Type;

    .line 382
    .line 383
    invoke-static {v7}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 384
    .line 385
    .line 386
    move-result-object v4

    .line 387
    invoke-static {v7}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 388
    .line 389
    .line 390
    move-result-object v5

    .line 391
    iget-object v0, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->targetHandle:Ljava/lang/Class;

    .line 392
    .line 393
    invoke-static {v0}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 398
    .line 399
    .line 400
    move-result-object v6

    .line 401
    filled-new-array {v4, v5, v0, v6}, [Lnet/bytebuddy/jar/asm/Type;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-static {v3, v0}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v4

    .line 409
    const/4 v5, 0x0

    .line 410
    const/16 v1, 0xb7

    .line 411
    .line 412
    const-string v3, "<init>"

    .line 413
    .line 414
    move-object/from16 v0, p1

    .line 415
    .line 416
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 417
    .line 418
    .line 419
    move-object v1, v0

    .line 420
    const/16 v0, 0xb0

    .line 421
    .line 422
    invoke-virtual {v1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 423
    .line 424
    .line 425
    const/4 v0, 0x6

    .line 426
    invoke-virtual {v1, v0, v14}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMaxs(II)V

    .line 427
    .line 428
    .line 429
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 430
    .line 431
    invoke-direct {v1, v0, v14}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 432
    .line 433
    .line 434
    return-object v1
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
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->sourceConstantDynamic:Ljava/lang/Class;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->sourceConstantDynamic:Ljava/lang/Class;

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
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->targetConstantDynamic:Ljava/lang/Class;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->targetConstantDynamic:Ljava/lang/Class;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->sourceHandle:Ljava/lang/Class;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->sourceHandle:Ljava/lang/Class;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
    iget-object p0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->targetHandle:Ljava/lang/Class;

    .line 56
    .line 57
    iget-object p1, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->targetHandle:Ljava/lang/Class;

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_6

    .line 64
    .line 65
    return v1

    .line 66
    :cond_6
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
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->sourceConstantDynamic:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/Class;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->targetConstantDynamic:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-static {v0, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/Class;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->sourceHandle:Ljava/lang/Class;

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/Class;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object p0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantDynamicTranslator;->targetHandle:Ljava/lang/Class;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    add-int/2addr p0, v0

    .line 37
    return p0
.end method
