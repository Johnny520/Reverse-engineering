.class public Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/ClassVisitorFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AttributeTranslator"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field protected static final NAME:Ljava/lang/String; = "attribute"


# instance fields
.field private final sourceAttribute:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final sourceWrapper:Lnet/bytebuddy/description/type/TypeDescription;

.field private final targetAttribute:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final targetWrapper:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->sourceAttribute:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->targetAttribute:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->sourceWrapper:Lnet/bytebuddy/description/type/TypeDescription;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->targetWrapper:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 12

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/Label;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lnet/bytebuddy/jar/asm/Label;

    .line 7
    .line 8
    invoke-direct {v1}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 9
    .line 10
    .line 11
    const/16 v2, 0x19

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-virtual {p1, v2, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 15
    .line 16
    .line 17
    const/16 v4, 0xc7

    .line 18
    .line 19
    invoke-virtual {p1, v4, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 20
    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    invoke-virtual {p1, v4}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 24
    .line 25
    .line 26
    const/16 v5, 0xb0

    .line 27
    .line 28
    invoke-virtual {p1, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-interface {v6}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-virtual {v0, p1, v6}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->same(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v2, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->targetWrapper:Lnet/bytebuddy/description/type/TypeDescription;

    .line 53
    .line 54
    invoke-interface {v0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const/16 v6, 0xc1

    .line 59
    .line 60
    invoke-virtual {p1, v6, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/16 v0, 0x99

    .line 64
    .line 65
    invoke-virtual {p1, v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v2, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->targetWrapper:Lnet/bytebuddy/description/type/TypeDescription;

    .line 72
    .line 73
    invoke-interface {v0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    const/16 v6, 0xc0

    .line 78
    .line 79
    invoke-virtual {p1, v6, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->targetWrapper:Lnet/bytebuddy/description/type/TypeDescription;

    .line 83
    .line 84
    invoke-interface {v0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iget-object v6, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->sourceAttribute:Ljava/lang/Class;

    .line 89
    .line 90
    invoke-static {v6}, Lnet/bytebuddy/jar/asm/Type;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    const/16 v7, 0xb4

    .line 95
    .line 96
    const-string v8, "delegate"

    .line 97
    .line 98
    invoke-virtual {p1, v7, v0, v8, v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {p2}, Lnet/bytebuddy/implementation/Implementation$Context;->getFrameGeneration()Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    invoke-interface {p3}, Lnet/bytebuddy/description/method/ParameterList;->asTypeList()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 116
    .line 117
    .line 118
    move-result-object p3

    .line 119
    invoke-virtual {p2, p1, p3}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->same(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;)V

    .line 120
    .line 121
    .line 122
    iget-object p2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->sourceWrapper:Lnet/bytebuddy/description/type/TypeDescription;

    .line 123
    .line 124
    invoke-interface {p2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    const/16 p3, 0xbb

    .line 129
    .line 130
    invoke-virtual {p1, p3, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 131
    .line 132
    .line 133
    const/16 p2, 0x59

    .line 134
    .line 135
    invoke-virtual {p1, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v2, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 139
    .line 140
    .line 141
    iget-object p2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->sourceWrapper:Lnet/bytebuddy/description/type/TypeDescription;

    .line 142
    .line 143
    invoke-interface {p2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    sget-object p2, Lnet/bytebuddy/jar/asm/Type;->VOID_TYPE:Lnet/bytebuddy/jar/asm/Type;

    .line 148
    .line 149
    iget-object p0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->targetAttribute:Ljava/lang/Class;

    .line 150
    .line 151
    invoke-static {p0}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/Class;)Lnet/bytebuddy/jar/asm/Type;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    filled-new-array {p0}, [Lnet/bytebuddy/jar/asm/Type;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-static {p2, p0}, Lnet/bytebuddy/jar/asm/Type;->getMethodDescriptor(Lnet/bytebuddy/jar/asm/Type;[Lnet/bytebuddy/jar/asm/Type;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v10

    .line 163
    const/4 v11, 0x0

    .line 164
    const/16 v7, 0xb7

    .line 165
    .line 166
    const-string v9, "<init>"

    .line 167
    .line 168
    move-object v6, p1

    .line 169
    invoke-virtual/range {v6 .. v11}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v6, v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 173
    .line 174
    .line 175
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 176
    .line 177
    const/4 p1, 0x3

    .line 178
    invoke-direct {p0, p1, v4}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 179
    .line 180
    .line 181
    return-object p0
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
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->sourceAttribute:Ljava/lang/Class;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->sourceAttribute:Ljava/lang/Class;

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
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->targetAttribute:Ljava/lang/Class;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->targetAttribute:Ljava/lang/Class;

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
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->sourceWrapper:Lnet/bytebuddy/description/type/TypeDescription;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->sourceWrapper:Lnet/bytebuddy/description/type/TypeDescription;

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
    iget-object p0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->targetWrapper:Lnet/bytebuddy/description/type/TypeDescription;

    .line 56
    .line 57
    iget-object p1, p1, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->targetWrapper:Lnet/bytebuddy/description/type/TypeDescription;

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
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->sourceAttribute:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/Class;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->targetAttribute:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-static {v0, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/Class;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->sourceWrapper:Lnet/bytebuddy/description/type/TypeDescription;

    .line 25
    .line 26
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object p0, p0, Lnet/bytebuddy/asm/ClassVisitorFactory$AttributeTranslator;->targetWrapper:Lnet/bytebuddy/description/type/TypeDescription;

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
