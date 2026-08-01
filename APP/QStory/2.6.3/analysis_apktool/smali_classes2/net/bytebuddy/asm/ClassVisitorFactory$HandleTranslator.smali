.class public Lnet/bytebuddy/asm/ClassVisitorFactory$HandleTranslator;
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
    name = "HandleTranslator"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field protected static final NAME:Ljava/lang/String; = "handle"


# instance fields
.field private final sourceHandle:Ljava/lang/Class;
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
    iput-object p1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$HandleTranslator;->sourceHandle:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$HandleTranslator;->targetHandle:Ljava/lang/Class;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 13

    .line 1
    new-instance v2, Lnet/bytebuddy/jar/asm/Label;

    .line 2
    .line 3
    invoke-direct {v2}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v7, 0x19

    .line 7
    .line 8
    const/4 v8, 0x0

    .line 9
    invoke-virtual {p1, v7, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 10
    .line 11
    .line 12
    const/16 v3, 0xc7

    .line 13
    .line 14
    invoke-virtual {p1, v3, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 15
    .line 16
    .line 17
    const/4 v9, 0x1

    .line 18
    invoke-virtual {p1, v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 19
    .line 20
    .line 21
    const/16 v10, 0xb0

    .line 22
    .line 23
    invoke-virtual {p1, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-interface/range {p3 .. p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-interface {v3}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v2, p1, v3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->same(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;)V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$HandleTranslator;->targetHandle:Ljava/lang/Class;

    .line 45
    .line 46
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const/16 v3, 0xbb

    .line 51
    .line 52
    invoke-virtual {p1, v3, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/16 v2, 0x59

    .line 56
    .line 57
    invoke-virtual {p1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v7, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 61
    .line 62
    .line 63
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$HandleTranslator;->sourceHandle:Ljava/lang/Class;

    .line 64
    .line 65
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    sget-object v11, Lnet/bytebuddy/jar/asm/Type;->INT_TYPE:Lnet/bytebuddy/jar/asm/Type;

    .line 70
    .line 71
    new-array v2, v8, [Lnet/bytebuddy/jar/asm/Type;

    .line 72
    .line 73
    invoke-static {v11, v2}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    const/4 v6, 0x0

    .line 78
    const/16 v2, 0xb6

    .line 79
    .line 80
    const-string v4, "getTag"

    .line 81
    .line 82
    move-object v1, p1

    .line 83
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v7, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 87
    .line 88
    .line 89
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$HandleTranslator;->sourceHandle:Ljava/lang/Class;

    .line 90
    .line 91
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    const-class v12, Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {v12}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    new-array v4, v8, [Lnet/bytebuddy/jar/asm/Type;

    .line 102
    .line 103
    invoke-static {v2, v4}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    const/16 v2, 0xb6

    .line 108
    .line 109
    const-string v4, "getOwner"

    .line 110
    .line 111
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v7, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 115
    .line 116
    .line 117
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$HandleTranslator;->sourceHandle:Ljava/lang/Class;

    .line 118
    .line 119
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-static {v12}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    new-array v4, v8, [Lnet/bytebuddy/jar/asm/Type;

    .line 128
    .line 129
    invoke-static {v2, v4}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    const/16 v2, 0xb6

    .line 134
    .line 135
    const-string v4, "getName"

    .line 136
    .line 137
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, v7, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 141
    .line 142
    .line 143
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$HandleTranslator;->sourceHandle:Ljava/lang/Class;

    .line 144
    .line 145
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-static {v12}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    new-array v4, v8, [Lnet/bytebuddy/jar/asm/Type;

    .line 154
    .line 155
    invoke-static {v2, v4}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    const/16 v2, 0xb6

    .line 160
    .line 161
    const-string v4, "getDesc"

    .line 162
    .line 163
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, v7, v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 167
    .line 168
    .line 169
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$HandleTranslator;->sourceHandle:Ljava/lang/Class;

    .line 170
    .line 171
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    sget-object v7, Lnet/bytebuddy/jar/asm/Type;->BOOLEAN_TYPE:Lnet/bytebuddy/jar/asm/Type;

    .line 176
    .line 177
    new-array v2, v8, [Lnet/bytebuddy/jar/asm/Type;

    .line 178
    .line 179
    invoke-static {v7, v2}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    const/16 v2, 0xb6

    .line 184
    .line 185
    const-string v4, "isInterface"

    .line 186
    .line 187
    invoke-virtual/range {v1 .. v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 188
    .line 189
    .line 190
    iget-object v0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$HandleTranslator;->targetHandle:Ljava/lang/Class;

    .line 191
    .line 192
    invoke-static {v0}, Lnet/bytebuddy/jar/asm/Type;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    sget-object v0, Lnet/bytebuddy/jar/asm/Type;->VOID_TYPE:Lnet/bytebuddy/jar/asm/Type;

    .line 197
    .line 198
    invoke-static {v12}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-static {v12}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    invoke-static {v12}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    filled-new-array {v11, v1, v3, v4, v7}, [Lnet/bytebuddy/jar/asm/Type;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-static {v0, v1}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v4

    .line 218
    const/4 v5, 0x0

    .line 219
    const/16 v1, 0xb7

    .line 220
    .line 221
    const-string v3, "<init>"

    .line 222
    .line 223
    move-object v0, p1

    .line 224
    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1, v10}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 228
    .line 229
    .line 230
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 231
    .line 232
    const/4 v1, 0x7

    .line 233
    invoke-direct {v0, v1, v9}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 234
    .line 235
    .line 236
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
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$HandleTranslator;->sourceHandle:Ljava/lang/Class;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/ClassVisitorFactory$HandleTranslator;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$HandleTranslator;->sourceHandle:Ljava/lang/Class;

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
    iget-object p0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$HandleTranslator;->targetHandle:Ljava/lang/Class;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$HandleTranslator;->targetHandle:Ljava/lang/Class;

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
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$HandleTranslator;->sourceHandle:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/Class;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object p0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$HandleTranslator;->targetHandle:Ljava/lang/Class;

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
