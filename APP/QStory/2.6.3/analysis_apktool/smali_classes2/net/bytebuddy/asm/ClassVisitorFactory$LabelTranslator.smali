.class public Lnet/bytebuddy/asm/ClassVisitorFactory$LabelTranslator;
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
    name = "LabelTranslator"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field protected static final NAME:Ljava/lang/String; = "label"


# instance fields
.field private final target:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$LabelTranslator;->target:Ljava/lang/Class;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 18

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
    new-instance v7, Lnet/bytebuddy/jar/asm/Label;

    .line 11
    .line 12
    invoke-direct {v7}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 13
    .line 14
    .line 15
    const/16 v8, 0x19

    .line 16
    .line 17
    const/4 v9, 0x1

    .line 18
    invoke-virtual {v1, v8, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 19
    .line 20
    .line 21
    const/16 v10, 0xc7

    .line 22
    .line 23
    invoke-virtual {v1, v10, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 27
    .line 28
    .line 29
    const/16 v11, 0xb0

    .line 30
    .line 31
    invoke-virtual {v1, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 35
    .line 36
    .line 37
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-interface {v4}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-static {v3, v4}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v2, v1, v3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->same(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;)V

    .line 58
    .line 59
    .line 60
    const/4 v12, 0x0

    .line 61
    invoke-virtual {v1, v8, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 62
    .line 63
    .line 64
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-interface {v2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    const-class v13, Ljava/util/Map;

    .line 73
    .line 74
    invoke-static {v13}, Lnet/bytebuddy/jar/asm/Type;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    const/16 v14, 0xb4

    .line 79
    .line 80
    const-string v15, "labels"

    .line 81
    .line 82
    invoke-virtual {v1, v14, v2, v15, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v8, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 86
    .line 87
    .line 88
    invoke-static {v13}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    const-class v16, Ljava/lang/Object;

    .line 93
    .line 94
    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    filled-new-array {v4}, [Lnet/bytebuddy/jar/asm/Type;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-static {v2, v4}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    const/4 v6, 0x1

    .line 111
    const/16 v2, 0xb9

    .line 112
    .line 113
    const-string v4, "get"

    .line 114
    .line 115
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 116
    .line 117
    .line 118
    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$LabelTranslator;->target:Ljava/lang/Class;

    .line 119
    .line 120
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    const/16 v3, 0xc0

    .line 125
    .line 126
    invoke-virtual {v1, v3, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 127
    .line 128
    .line 129
    const/16 v2, 0x3a

    .line 130
    .line 131
    const/4 v3, 0x2

    .line 132
    invoke-virtual {v1, v2, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v8, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, v10, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 139
    .line 140
    .line 141
    iget-object v4, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$LabelTranslator;->target:Ljava/lang/Class;

    .line 142
    .line 143
    invoke-static {v4}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    const/16 v5, 0xbb

    .line 148
    .line 149
    invoke-virtual {v1, v5, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 150
    .line 151
    .line 152
    const/16 v4, 0x59

    .line 153
    .line 154
    invoke-virtual {v1, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 155
    .line 156
    .line 157
    iget-object v4, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$LabelTranslator;->target:Ljava/lang/Class;

    .line 158
    .line 159
    invoke-static {v4}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    const-string v5, "()V"

    .line 164
    .line 165
    const/4 v6, 0x0

    .line 166
    move v10, v2

    .line 167
    const/16 v2, 0xb7

    .line 168
    .line 169
    move/from16 v17, v3

    .line 170
    .line 171
    move-object v3, v4

    .line 172
    const-string v4, "<init>"

    .line 173
    .line 174
    move/from16 v11, v17

    .line 175
    .line 176
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1, v10, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, v8, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 183
    .line 184
    .line 185
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-interface {v2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    invoke-static {v13}, Lnet/bytebuddy/jar/asm/Type;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    invoke-virtual {v1, v14, v2, v15, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, v8, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1, v8, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 204
    .line 205
    .line 206
    invoke-static {v13}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    filled-new-array {v4, v5}, [Lnet/bytebuddy/jar/asm/Type;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    invoke-static {v2, v4}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    const/4 v6, 0x1

    .line 231
    const/16 v2, 0xb9

    .line 232
    .line 233
    const-string v4, "put"

    .line 234
    .line 235
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 236
    .line 237
    .line 238
    const/16 v2, 0x57

    .line 239
    .line 240
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 244
    .line 245
    .line 246
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    iget-object v0, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$LabelTranslator;->target:Ljava/lang/Class;

    .line 251
    .line 252
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    invoke-interface {v4}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    invoke-static {v3, v4}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    invoke-virtual {v2, v1, v0, v3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->append(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;Ljava/util/List;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v1, v8, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 280
    .line 281
    .line 282
    const/16 v0, 0xb0

    .line 283
    .line 284
    invoke-virtual {v1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 285
    .line 286
    .line 287
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 288
    .line 289
    const/4 v1, 0x3

    .line 290
    invoke-direct {v0, v1, v1}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 291
    .line 292
    .line 293
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
    iget-object p0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$LabelTranslator;->target:Ljava/lang/Class;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/ClassVisitorFactory$LabelTranslator;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$LabelTranslator;->target:Ljava/lang/Class;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 1

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
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$LabelTranslator;->target:Ljava/lang/Class;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method
