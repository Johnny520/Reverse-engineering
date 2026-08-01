.class public Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;
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
    name = "ConstantTranslator"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field protected static final NAME:Ljava/lang/String; = "constant"


# instance fields
.field private final sourceConstantDynamic:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final sourceHandle:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final sourceType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final targetConstantDynamic:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final targetHandle:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field

.field private final targetType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling;
        value = .enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;->REVERSE_NULLABILITY:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$ValueHandling$Sort;
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0
    .param p1    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/Class;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
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
    iput-object p1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceHandle:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetHandle:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceType:Ljava/lang/Class;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetType:Ljava/lang/Class;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceConstantDynamic:Ljava/lang/Class;

    .line 13
    .line 14
    iput-object p6, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetConstantDynamic:Ljava/lang/Class;

    .line 15
    .line 16
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
    new-instance v9, Lnet/bytebuddy/jar/asm/Label;

    .line 16
    .line 17
    invoke-direct {v9}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceType:Ljava/lang/Class;

    .line 21
    .line 22
    const/16 v10, 0xc0

    .line 23
    .line 24
    const/16 v11, 0x99

    .line 25
    .line 26
    const/16 v12, 0xc1

    .line 27
    .line 28
    const/16 v13, 0xb0

    .line 29
    .line 30
    const/16 v14, 0x19

    .line 31
    .line 32
    const/4 v15, 0x0

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetType:Ljava/lang/Class;

    .line 36
    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    invoke-virtual {v1, v14, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 40
    .line 41
    .line 42
    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceType:Ljava/lang/Class;

    .line 43
    .line 44
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v1, v12, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v11, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v14, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 55
    .line 56
    .line 57
    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceType:Ljava/lang/Class;

    .line 58
    .line 59
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v1, v10, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceType:Ljava/lang/Class;

    .line 67
    .line 68
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    const-class v16, Ljava/lang/String;

    .line 73
    .line 74
    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    new-array v4, v15, [Lnet/bytebuddy/jar/asm/Type;

    .line 79
    .line 80
    invoke-static {v2, v4}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    const/4 v6, 0x0

    .line 85
    const/16 v2, 0xb6

    .line 86
    .line 87
    const-string v4, "getDescriptor"

    .line 88
    .line 89
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 90
    .line 91
    .line 92
    iget-object v1, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetType:Ljava/lang/Class;

    .line 93
    .line 94
    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    iget-object v1, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetType:Ljava/lang/Class;

    .line 99
    .line 100
    invoke-static {v1}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static/range {v16 .. v16}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    filled-new-array {v2}, [Lnet/bytebuddy/jar/asm/Type;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-static {v1, v2}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    const/16 v2, 0xb8

    .line 117
    .line 118
    const-string v4, "getType"

    .line 119
    .line 120
    move-object/from16 v1, p1

    .line 121
    .line 122
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v7}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 129
    .line 130
    .line 131
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-interface {v3}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    invoke-virtual {v2, v1, v3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->same(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;)V

    .line 144
    .line 145
    .line 146
    :cond_0
    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceHandle:Ljava/lang/Class;

    .line 147
    .line 148
    if-eqz v2, :cond_1

    .line 149
    .line 150
    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetHandle:Ljava/lang/Class;

    .line 151
    .line 152
    if-eqz v2, :cond_1

    .line 153
    .line 154
    invoke-virtual {v1, v14, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 155
    .line 156
    .line 157
    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceHandle:Ljava/lang/Class;

    .line 158
    .line 159
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {v1, v12, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, v11, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, v14, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 170
    .line 171
    .line 172
    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceHandle:Ljava/lang/Class;

    .line 173
    .line 174
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-virtual {v1, v10, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-interface {v2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetHandle:Ljava/lang/Class;

    .line 190
    .line 191
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    iget-object v4, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceHandle:Ljava/lang/Class;

    .line 196
    .line 197
    invoke-static {v4}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    filled-new-array {v4}, [Lnet/bytebuddy/jar/asm/Type;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    invoke-static {v2, v4}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    const/4 v6, 0x0

    .line 210
    const/16 v2, 0xb8

    .line 211
    .line 212
    const-string v4, "handle"

    .line 213
    .line 214
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 221
    .line 222
    .line 223
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    invoke-interface {v3}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    invoke-virtual {v2, v1, v3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->same(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;)V

    .line 236
    .line 237
    .line 238
    :cond_1
    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceConstantDynamic:Ljava/lang/Class;

    .line 239
    .line 240
    if-eqz v2, :cond_2

    .line 241
    .line 242
    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetConstantDynamic:Ljava/lang/Class;

    .line 243
    .line 244
    if-eqz v2, :cond_2

    .line 245
    .line 246
    invoke-virtual {v1, v14, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 247
    .line 248
    .line 249
    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceConstantDynamic:Ljava/lang/Class;

    .line 250
    .line 251
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    invoke-virtual {v1, v12, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1, v11, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1, v14, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 262
    .line 263
    .line 264
    iget-object v2, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceConstantDynamic:Ljava/lang/Class;

    .line 265
    .line 266
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-virtual {v1, v10, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-interface {v2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    iget-object v3, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetConstantDynamic:Ljava/lang/Class;

    .line 282
    .line 283
    invoke-static {v3}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    iget-object v0, v0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceConstantDynamic:Ljava/lang/Class;

    .line 288
    .line 289
    invoke-static {v0}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    filled-new-array {v0}, [Lnet/bytebuddy/jar/asm/Type;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-static {v3, v0}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    const/4 v5, 0x0

    .line 302
    const/16 v1, 0xb8

    .line 303
    .line 304
    const-string v3, "constantDyanmic"

    .line 305
    .line 306
    move-object/from16 v0, p1

    .line 307
    .line 308
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 309
    .line 310
    .line 311
    move-object v1, v0

    .line 312
    invoke-virtual {v1, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v1, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 316
    .line 317
    .line 318
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-interface {v2}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    invoke-virtual {v0, v1, v2}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->same(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;)V

    .line 331
    .line 332
    .line 333
    :cond_2
    invoke-virtual {v1, v14, v15}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v1, v13}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 337
    .line 338
    .line 339
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 340
    .line 341
    const/4 v1, 0x1

    .line 342
    invoke-direct {v0, v1, v1}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 343
    .line 344
    .line 345
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
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceHandle:Ljava/lang/Class;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceHandle:Ljava/lang/Class;

    .line 25
    .line 26
    if-eqz v3, :cond_3

    .line 27
    .line 28
    if-eqz v2, :cond_4

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_5

    .line 35
    .line 36
    return v1

    .line 37
    :cond_3
    if-eqz v2, :cond_5

    .line 38
    .line 39
    :cond_4
    return v1

    .line 40
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetHandle:Ljava/lang/Class;

    .line 41
    .line 42
    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetHandle:Ljava/lang/Class;

    .line 43
    .line 44
    if-eqz v3, :cond_6

    .line 45
    .line 46
    if-eqz v2, :cond_7

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_8

    .line 53
    .line 54
    return v1

    .line 55
    :cond_6
    if-eqz v2, :cond_8

    .line 56
    .line 57
    :cond_7
    return v1

    .line 58
    :cond_8
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceType:Ljava/lang/Class;

    .line 59
    .line 60
    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceType:Ljava/lang/Class;

    .line 61
    .line 62
    if-eqz v3, :cond_9

    .line 63
    .line 64
    if-eqz v2, :cond_a

    .line 65
    .line 66
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v2, :cond_b

    .line 71
    .line 72
    return v1

    .line 73
    :cond_9
    if-eqz v2, :cond_b

    .line 74
    .line 75
    :cond_a
    return v1

    .line 76
    :cond_b
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetType:Ljava/lang/Class;

    .line 77
    .line 78
    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetType:Ljava/lang/Class;

    .line 79
    .line 80
    if-eqz v3, :cond_c

    .line 81
    .line 82
    if-eqz v2, :cond_d

    .line 83
    .line 84
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-nez v2, :cond_e

    .line 89
    .line 90
    return v1

    .line 91
    :cond_c
    if-eqz v2, :cond_e

    .line 92
    .line 93
    :cond_d
    return v1

    .line 94
    :cond_e
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceConstantDynamic:Ljava/lang/Class;

    .line 95
    .line 96
    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceConstantDynamic:Ljava/lang/Class;

    .line 97
    .line 98
    if-eqz v3, :cond_f

    .line 99
    .line 100
    if-eqz v2, :cond_10

    .line 101
    .line 102
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-nez v2, :cond_11

    .line 107
    .line 108
    return v1

    .line 109
    :cond_f
    if-eqz v2, :cond_11

    .line 110
    .line 111
    :cond_10
    return v1

    .line 112
    :cond_11
    iget-object p0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetConstantDynamic:Ljava/lang/Class;

    .line 113
    .line 114
    iget-object p1, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetConstantDynamic:Ljava/lang/Class;

    .line 115
    .line 116
    if-eqz p1, :cond_12

    .line 117
    .line 118
    if-eqz p0, :cond_13

    .line 119
    .line 120
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-nez p0, :cond_14

    .line 125
    .line 126
    return v1

    .line 127
    :cond_12
    if-eqz p0, :cond_14

    .line 128
    .line 129
    :cond_13
    return v1

    .line 130
    :cond_14
    return v0
.end method

.method public hashCode()I
    .locals 2

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
    iget-object v1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceHandle:Ljava/lang/Class;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v0, v1

    .line 20
    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    .line 21
    .line 22
    iget-object v1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetHandle:Ljava/lang/Class;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    add-int/2addr v0, v1

    .line 31
    :cond_1
    mul-int/lit8 v0, v0, 0x1f

    .line 32
    .line 33
    iget-object v1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceType:Ljava/lang/Class;

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    add-int/2addr v0, v1

    .line 42
    :cond_2
    mul-int/lit8 v0, v0, 0x1f

    .line 43
    .line 44
    iget-object v1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetType:Ljava/lang/Class;

    .line 45
    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    add-int/2addr v0, v1

    .line 53
    :cond_3
    mul-int/lit8 v0, v0, 0x1f

    .line 54
    .line 55
    iget-object v1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->sourceConstantDynamic:Ljava/lang/Class;

    .line 56
    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    add-int/2addr v0, v1

    .line 64
    :cond_4
    mul-int/lit8 v0, v0, 0x1f

    .line 65
    .line 66
    iget-object p0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$ConstantTranslator;->targetConstantDynamic:Ljava/lang/Class;

    .line 67
    .line 68
    if-eqz p0, :cond_5

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    add-int/2addr p0, v0

    .line 75
    return p0

    .line 76
    :cond_5
    return v0
.end method
