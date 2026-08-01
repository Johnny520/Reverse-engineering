.class public abstract Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$OffsetMapping;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$OffsetMapping;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ForFieldHandle"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Resolved;,
        Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved;,
        Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final access:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle;->access:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
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
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle;->access:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle;->access:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;

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
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle;->access:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;

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

.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler;Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;
    .locals 7

    .line 1
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle;->resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/description/field/FieldDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p3, :cond_1

    .line 11
    .line 12
    invoke-interface {p2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    if-nez p3, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string p0, "Cannot access non-static field "

    .line 20
    .line 21
    const-string p3, " from static method "

    .line 22
    .line 23
    invoke-static {p0, p1, p3, p2}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_1
    :goto_0
    invoke-virtual {p5, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;->isPremature(Lnet/bytebuddy/description/method/MethodDescription;)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_3

    .line 32
    .line 33
    invoke-interface {p1}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const-string p0, "Cannot access "

    .line 41
    .line 42
    const-string p2, " before super constructor call"

    .line 43
    .line 44
    invoke-static {p1, p0, p2}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_3
    :goto_1
    invoke-interface {p1}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle;->access:Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;

    .line 53
    .line 54
    if-eqz p2, :cond_4

    .line 55
    .line 56
    new-instance p2, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForStackManipulation;

    .line 57
    .line 58
    invoke-interface {p1}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;->resolve(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->toStackManipulation()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-direct {p2, p0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForStackManipulation;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 73
    .line 74
    .line 75
    return-object p2

    .line 76
    :cond_4
    new-instance p2, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForStackManipulation;

    .line 77
    .line 78
    new-instance p3, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 79
    .line 80
    invoke-interface {p1}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;->resolve(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {p0}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->toStackManipulation()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    sget-object p1, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 95
    .line 96
    const/4 p5, 0x0

    .line 97
    invoke-interface {p4, p5}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->argument(I)I

    .line 98
    .line 99
    .line 100
    move-result p4

    .line 101
    invoke-virtual {p1, p4}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    new-instance p4, Lnet/bytebuddy/description/method/MethodDescription$Latent;

    .line 106
    .line 107
    sget-object v0, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLE:Lnet/bytebuddy/utility/JavaType;

    .line 108
    .line 109
    invoke-virtual {v0}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    new-instance v2, Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 114
    .line 115
    invoke-virtual {v0}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    new-instance v3, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;

    .line 124
    .line 125
    const-class v4, Ljava/lang/Object;

    .line 126
    .line 127
    invoke-static {v4}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    const/4 v5, 0x1

    .line 132
    new-array v6, v5, [Lnet/bytebuddy/description/type/TypeDefinition;

    .line 133
    .line 134
    aput-object v4, v6, p5

    .line 135
    .line 136
    invoke-direct {v3, v6}, Lnet/bytebuddy/description/type/TypeList$Generic$Explicit;-><init>([Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 137
    .line 138
    .line 139
    const-string v4, "bindTo"

    .line 140
    .line 141
    invoke-direct {v2, v4, v5, v0, v3}, Lnet/bytebuddy/description/method/MethodDescription$Token;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V

    .line 142
    .line 143
    .line 144
    invoke-direct {p4, v1, v2}, Lnet/bytebuddy/description/method/MethodDescription$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$Token;)V

    .line 145
    .line 146
    .line 147
    invoke-static {p4}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 148
    .line 149
    .line 150
    move-result-object p4

    .line 151
    const/4 v0, 0x3

    .line 152
    new-array v0, v0, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 153
    .line 154
    aput-object p0, v0, p5

    .line 155
    .line 156
    aput-object p1, v0, v5

    .line 157
    .line 158
    const/4 p0, 0x2

    .line 159
    aput-object p4, v0, p0

    .line 160
    .line 161
    invoke-direct {p3, v0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 162
    .line 163
    .line 164
    invoke-direct {p2, p3}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForStackManipulation;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 165
    .line 166
    .line 167
    return-object p2
.end method

.method public abstract resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/description/field/FieldDescription;
.end method
