.class public Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper$PrefixingMethodVisitor;
.super Lnet/bytebuddy/jar/asm/MethodVisitor;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PrefixingMethodVisitor"
.end annotation


# instance fields
.field private final frameGeneration:Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

.field private final instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

.field private final name:Ljava/lang/String;

.field private final offset:I

.field private final token:Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;Ljava/lang/String;ILnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;)V
    .locals 1

    .line 1
    sget v0, Lnet/bytebuddy/utility/OpenedClassReader;->ASM_API:I

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;-><init>(ILnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper$PrefixingMethodVisitor;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper$PrefixingMethodVisitor;->token:Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper$PrefixingMethodVisitor;->name:Ljava/lang/String;

    .line 11
    .line 12
    iput p5, p0, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper$PrefixingMethodVisitor;->offset:I

    .line 13
    .line 14
    iput-object p6, p0, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper$PrefixingMethodVisitor;->frameGeneration:Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public visitCode()V
    .locals 9

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitCode()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 7
    .line 8
    iget-object v1, p0, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper$PrefixingMethodVisitor;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 9
    .line 10
    invoke-interface {v1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper$PrefixingMethodVisitor;->name:Ljava/lang/String;

    .line 15
    .line 16
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-static {v3}, Lnet/bytebuddy/jar/asm/Type;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const/16 v4, 0xb2

    .line 23
    .line 24
    invoke-virtual {v0, v4, v1, v2, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Lnet/bytebuddy/jar/asm/Label;

    .line 28
    .line 29
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 33
    .line 34
    const/16 v2, 0x99

    .line 35
    .line 36
    invoke-virtual {v1, v2, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitJumpInsn(ILnet/bytebuddy/jar/asm/Label;)V

    .line 37
    .line 38
    .line 39
    iget v1, p0, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper$PrefixingMethodVisitor;->offset:I

    .line 40
    .line 41
    iget-object v2, p0, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper$PrefixingMethodVisitor;->token:Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 42
    .line 43
    invoke-virtual {v2}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;->getParameterTypes()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_1

    .line 56
    .line 57
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Lnet/bytebuddy/description/type/TypeDescription;

    .line 62
    .line 63
    iget-object v4, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 64
    .line 65
    invoke-interface {v3}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-static {v5}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    const/16 v6, 0x15

    .line 74
    .line 75
    invoke-virtual {v5, v6}, Lnet/bytebuddy/jar/asm/Type;->getOpcode(I)I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    invoke-virtual {v4, v5, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    .line 80
    .line 81
    .line 82
    sget-object v4, Lnet/bytebuddy/utility/JavaType;->ACCESS_CONTROL_CONTEXT:Lnet/bytebuddy/utility/JavaType;

    .line 83
    .line 84
    invoke-virtual {v4}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_0

    .line 93
    .line 94
    iget-object v4, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 95
    .line 96
    const/16 v5, 0xc0

    .line 97
    .line 98
    invoke-interface {v3}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-virtual {v4, v5, v6}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :cond_0
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDefinition;->getStackSize()Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {v3}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    add-int/2addr v1, v3

    .line 114
    goto :goto_0

    .line 115
    :cond_1
    iget-object v3, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 116
    .line 117
    const/16 v1, 0x2e

    .line 118
    .line 119
    const/16 v2, 0x2f

    .line 120
    .line 121
    const-string v4, "java.security.AccessController"

    .line 122
    .line 123
    invoke-virtual {v4, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    iget-object v1, p0, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper$PrefixingMethodVisitor;->token:Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 128
    .line 129
    invoke-virtual {v1}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;->getName()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    iget-object v1, p0, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper$PrefixingMethodVisitor;->token:Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 134
    .line 135
    invoke-virtual {v1}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;->getDescriptor()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    const/4 v8, 0x0

    .line 140
    const/16 v4, 0xb8

    .line 141
    .line 142
    invoke-virtual/range {v3 .. v8}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 143
    .line 144
    .line 145
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 146
    .line 147
    iget-object v2, p0, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper$PrefixingMethodVisitor;->token:Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 148
    .line 149
    invoke-virtual {v2}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-interface {v2}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-static {v2}, Lnet/bytebuddy/jar/asm/Type;->getType(Ljava/lang/String;)Lnet/bytebuddy/jar/asm/Type;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    const/16 v3, 0xac

    .line 162
    .line 163
    invoke-virtual {v2, v3}, Lnet/bytebuddy/jar/asm/Type;->getOpcode(I)I

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    invoke-virtual {v1, v2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 168
    .line 169
    .line 170
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 171
    .line 172
    invoke-virtual {v1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 173
    .line 174
    .line 175
    iget-object v0, p0, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper$PrefixingMethodVisitor;->frameGeneration:Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 176
    .line 177
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 178
    .line 179
    iget-object p0, p0, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper$PrefixingMethodVisitor;->token:Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 180
    .line 181
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;->getParameterTypes()Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-virtual {v0, v1, p0}, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->same(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;)V

    .line 186
    .line 187
    .line 188
    return-void
.end method

.method public visitMaxs(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/jar/asm/MethodVisitor;->mv:Lnet/bytebuddy/jar/asm/MethodVisitor;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper$PrefixingMethodVisitor;->token:Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 4
    .line 5
    invoke-virtual {v1}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;->getParameterTypes()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/StackSize;->of(Ljava/util/Collection;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object p0, p0, Lnet/bytebuddy/build/AccessControllerPlugin$AccessControlWrapper$PrefixingMethodVisitor;->token:Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 14
    .line 15
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->getStackSize()Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-virtual {v0, p0, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMaxs(II)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
