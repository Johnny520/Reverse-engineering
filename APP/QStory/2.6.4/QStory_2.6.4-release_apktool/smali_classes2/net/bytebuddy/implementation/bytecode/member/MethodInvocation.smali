.class public final enum Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$HandleType;,
        Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$HandleInvocation;,
        Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;,
        Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$OfGenericMethod;,
        Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;,
        Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$IllegalInvocation;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

.field public static final enum INTERFACE:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

.field public static final enum INTERFACE_PRIVATE:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

.field public static final enum SPECIAL:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

.field public static final enum SPECIAL_CONSTRUCTOR:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

.field public static final enum STATIC:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

.field public static final enum VIRTUAL:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

.field public static final enum VIRTUAL_PRIVATE:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;


# instance fields
.field private final handle:I

.field private final legacyHandle:I

.field private final legacyOpcode:I

.field private final opcode:I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 2
    .line 3
    const/16 v5, 0xb6

    .line 4
    .line 5
    const/4 v6, 0x5

    .line 6
    const-string v1, "VIRTUAL"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/16 v3, 0xb6

    .line 10
    .line 11
    const/4 v4, 0x5

    .line 12
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;-><init>(Ljava/lang/String;IIIII)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->VIRTUAL:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 16
    .line 17
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 18
    .line 19
    const/16 v6, 0xb9

    .line 20
    .line 21
    const/16 v7, 0x9

    .line 22
    .line 23
    const-string v2, "INTERFACE"

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    const/16 v4, 0xb9

    .line 27
    .line 28
    const/16 v5, 0x9

    .line 29
    .line 30
    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;-><init>(Ljava/lang/String;IIIII)V

    .line 31
    .line 32
    .line 33
    sput-object v1, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->INTERFACE:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 34
    .line 35
    new-instance v2, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 36
    .line 37
    const/16 v7, 0xb8

    .line 38
    .line 39
    const/4 v8, 0x6

    .line 40
    const-string v3, "STATIC"

    .line 41
    .line 42
    const/4 v4, 0x2

    .line 43
    const/16 v5, 0xb8

    .line 44
    .line 45
    const/4 v6, 0x6

    .line 46
    invoke-direct/range {v2 .. v8}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;-><init>(Ljava/lang/String;IIIII)V

    .line 47
    .line 48
    .line 49
    sput-object v2, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->STATIC:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 50
    .line 51
    new-instance v3, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 52
    .line 53
    const/16 v8, 0xb7

    .line 54
    .line 55
    const/4 v9, 0x7

    .line 56
    const-string v4, "SPECIAL"

    .line 57
    .line 58
    const/4 v5, 0x3

    .line 59
    const/16 v6, 0xb7

    .line 60
    .line 61
    const/4 v7, 0x7

    .line 62
    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;-><init>(Ljava/lang/String;IIIII)V

    .line 63
    .line 64
    .line 65
    sput-object v3, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->SPECIAL:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 66
    .line 67
    new-instance v4, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 68
    .line 69
    const/16 v9, 0xb7

    .line 70
    .line 71
    const/16 v10, 0x8

    .line 72
    .line 73
    const-string v5, "SPECIAL_CONSTRUCTOR"

    .line 74
    .line 75
    const/4 v6, 0x4

    .line 76
    const/16 v7, 0xb7

    .line 77
    .line 78
    const/16 v8, 0x8

    .line 79
    .line 80
    invoke-direct/range {v4 .. v10}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;-><init>(Ljava/lang/String;IIIII)V

    .line 81
    .line 82
    .line 83
    sput-object v4, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->SPECIAL_CONSTRUCTOR:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 84
    .line 85
    new-instance v5, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 86
    .line 87
    const/16 v10, 0xb7

    .line 88
    .line 89
    const/4 v11, 0x7

    .line 90
    const-string v6, "VIRTUAL_PRIVATE"

    .line 91
    .line 92
    const/4 v7, 0x5

    .line 93
    const/16 v8, 0xb6

    .line 94
    .line 95
    const/4 v9, 0x5

    .line 96
    invoke-direct/range {v5 .. v11}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;-><init>(Ljava/lang/String;IIIII)V

    .line 97
    .line 98
    .line 99
    sput-object v5, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->VIRTUAL_PRIVATE:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 100
    .line 101
    new-instance v6, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 102
    .line 103
    const/16 v11, 0xb7

    .line 104
    .line 105
    const/4 v12, 0x7

    .line 106
    const-string v7, "INTERFACE_PRIVATE"

    .line 107
    .line 108
    const/4 v8, 0x6

    .line 109
    const/16 v9, 0xb9

    .line 110
    .line 111
    const/16 v10, 0x9

    .line 112
    .line 113
    invoke-direct/range {v6 .. v12}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;-><init>(Ljava/lang/String;IIIII)V

    .line 114
    .line 115
    .line 116
    sput-object v6, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->INTERFACE_PRIVATE:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 117
    .line 118
    filled-new-array/range {v0 .. v6}, [Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 123
    .line 124
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IIIII)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIII)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->opcode:I

    .line 5
    .line 6
    iput p4, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->handle:I

    .line 7
    .line 8
    iput p5, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->legacyOpcode:I

    .line 9
    .line 10
    iput p6, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->legacyHandle:I

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic access$000(Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;)I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->opcode:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$100(Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;)I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->legacyOpcode:I

    .line 2
    .line 3
    return p0
.end method

.method public static invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;
    .locals 2

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->isTypeInitializer()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$IllegalInvocation;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$IllegalInvocation;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;

    .line 17
    .line 18
    sget-object v1, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->STATIC:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;-><init>(Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_1
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;

    .line 34
    .line 35
    sget-object v1, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->SPECIAL_CONSTRUCTOR:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;-><init>(Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isPrivate()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;

    .line 51
    .line 52
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {v1}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isInterface()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    sget-object v1, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->INTERFACE_PRIVATE:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    sget-object v1, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->VIRTUAL_PRIVATE:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 66
    .line 67
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;-><init>(Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)V

    .line 71
    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_4
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-interface {v0}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isInterface()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;

    .line 85
    .line 86
    sget-object v1, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->INTERFACE:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;-><init>(Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)V

    .line 92
    .line 93
    .line 94
    return-object v0

    .line 95
    :cond_5
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;

    .line 96
    .line 97
    sget-object v1, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->VIRTUAL:Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$Invocation;-><init>(Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)V

    .line 103
    .line 104
    .line 105
    return-object v0
.end method

.method public static invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;
    .locals 3

    .line 106
    invoke-interface {p0}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    move-result-object v0

    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 107
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v1

    invoke-interface {v1}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v2

    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 108
    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object p0

    return-object p0

    .line 109
    :cond_0
    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object v0

    invoke-static {p0, v0}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$OfGenericMethod;->of(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    move-result-object p0

    return-object p0
.end method

.method public static lookup()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 6

    .line 1
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$Latent;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLES:Lnet/bytebuddy/utility/JavaType;

    .line 4
    .line 5
    invoke-virtual {v1}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 10
    .line 11
    sget-object v3, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLES_LOOKUP:Lnet/bytebuddy/utility/JavaType;

    .line 12
    .line 13
    invoke-virtual {v3}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v4, "lookup"

    .line 22
    .line 23
    const/16 v5, 0x9

    .line 24
    .line 25
    invoke-direct {v2, v4, v5, v3}, Lnet/bytebuddy/description/method/MethodDescription$Token;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/description/method/MethodDescription$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$Token;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->$VALUES:[Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;

    .line 8
    .line 9
    return-object v0
.end method
