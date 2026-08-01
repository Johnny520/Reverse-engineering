.class public Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantArrayTranslator;
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
    name = "ConstantArrayTranslator"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field protected static final NAME:Ljava/lang/String; = "constants"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/jar/asm/Label;

    .line 4
    .line 5
    invoke-direct {v1}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v6, Lnet/bytebuddy/jar/asm/Label;

    .line 9
    .line 10
    invoke-direct {v6}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v7, Lnet/bytebuddy/jar/asm/Label;

    .line 14
    .line 15
    invoke-direct {v7}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 16
    .line 17
    .line 18
    const/16 v8, 0x19

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {v0, v8, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 22
    .line 23
    .line 24
    const/16 v3, 0xc7

    .line 25
    .line 26
    invoke-virtual {v0, v3, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 27
    .line 28
    .line 29
    const/4 v9, 0x1

    .line 30
    invoke-virtual {v0, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 31
    .line 32
    .line 33
    const/16 v10, 0xb0

    .line 34
    .line 35
    invoke-virtual {v0, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 39
    .line 40
    .line 41
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-interface {v3}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v1, v0, v3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->same(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v8, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 57
    .line 58
    .line 59
    const/16 v1, 0xbe

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 62
    .line 63
    .line 64
    const-class v3, Ljava/lang/Object;

    .line 65
    .line 66
    invoke-static {v3}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    const/16 v5, 0xbd

    .line 71
    .line 72
    invoke-virtual {v0, v5, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/16 v4, 0x3a

    .line 76
    .line 77
    invoke-virtual {v0, v4, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 78
    .line 79
    .line 80
    const/4 v11, 0x3

    .line 81
    invoke-virtual {v0, v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 82
    .line 83
    .line 84
    const/16 v4, 0x36

    .line 85
    .line 86
    const/4 v12, 0x2

    .line 87
    invoke-virtual {v0, v4, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 91
    .line 92
    .line 93
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    const-class v13, [Ljava/lang/Object;

    .line 98
    .line 99
    invoke-static {v13}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 104
    .line 105
    invoke-static {v14}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 106
    .line 107
    .line 108
    move-result-object v14

    .line 109
    new-array v15, v12, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 110
    .line 111
    aput-object v5, v15, v2

    .line 112
    .line 113
    aput-object v14, v15, v9

    .line 114
    .line 115
    invoke-static {v15}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 120
    .line 121
    .line 122
    move-result-object v14

    .line 123
    invoke-interface {v14}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 124
    .line 125
    .line 126
    move-result-object v14

    .line 127
    invoke-virtual {v4, v0, v5, v14}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->append(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;Ljava/util/List;)V

    .line 128
    .line 129
    .line 130
    const/16 v4, 0x15

    .line 131
    .line 132
    invoke-virtual {v0, v4, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v0, v8, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 139
    .line 140
    .line 141
    const/16 v1, 0xa2

    .line 142
    .line 143
    invoke-virtual {v0, v1, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0, v8, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v4, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v8, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v4, v12}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 156
    .line 157
    .line 158
    const/16 v1, 0x32

    .line 159
    .line 160
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 161
    .line 162
    .line 163
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-interface {v1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-static {v3}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-static {v3}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    filled-new-array {v3}, [Lnet/bytebuddy/jar/asm/Type;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-static {v1, v3}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    const/4 v5, 0x0

    .line 188
    const/16 v1, 0xb8

    .line 189
    .line 190
    const-string v3, "constant"

    .line 191
    .line 192
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 193
    .line 194
    .line 195
    const/16 v1, 0x53

    .line 196
    .line 197
    invoke-virtual {v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v12, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitIincInsn(II)V

    .line 201
    .line 202
    .line 203
    const/16 v1, 0xa7

    .line 204
    .line 205
    invoke-virtual {v0, v1, v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 209
    .line 210
    .line 211
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-interface {v2}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-static {v13}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    invoke-static {v2, v3}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-virtual {v1, v0, v9, v2}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->chop(Lnet/bytebuddy/jar/asm/MethodVisitor;ILjava/util/List;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0, v8, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 238
    .line 239
    .line 240
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 241
    .line 242
    const/4 v1, 0x4

    .line 243
    invoke-direct {v0, v1, v11}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 244
    .line 245
    .line 246
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2
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
    move-result-object p0

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eq p0, p1, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method
