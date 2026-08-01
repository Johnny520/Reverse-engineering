.class public Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$OffsetMapping;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$OffsetMapping;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForDynamicConstant"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant$Factory;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final arguments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;"
        }
    .end annotation
.end field

.field private final bootstrapName:Ljava/lang/String;

.field private final bootstrapOwner:Lnet/bytebuddy/description/type/TypeDescription;

.field private final bootstrapParameterTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end field

.field private final bootstrapReturnType:Lnet/bytebuddy/description/type/TypeDescription;

.field private final bootstrapType:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

.field private final invokedynamic:Z

.field private final name:Ljava/lang/String;

.field private final typeDescription:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->name:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapType:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapOwner:Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapName:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapReturnType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 15
    .line 16
    iput-object p7, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapParameterTypes:Ljava/util/List;

    .line 17
    .line 18
    iput-object p8, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->arguments:Ljava/util/List;

    .line 19
    .line 20
    iput-boolean p9, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->invokedynamic:Z

    .line 21
    .line 22
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
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->invokedynamic:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->invokedynamic:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapType:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapType:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->name:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->name:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapName:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapName:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_6

    .line 60
    .line 61
    return v1

    .line 62
    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 63
    .line 64
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 65
    .line 66
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v2, :cond_7

    .line 71
    .line 72
    return v1

    .line 73
    :cond_7
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapOwner:Lnet/bytebuddy/description/type/TypeDescription;

    .line 74
    .line 75
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapOwner:Lnet/bytebuddy/description/type/TypeDescription;

    .line 76
    .line 77
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-nez v2, :cond_8

    .line 82
    .line 83
    return v1

    .line 84
    :cond_8
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapReturnType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 85
    .line 86
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapReturnType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 87
    .line 88
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-nez v2, :cond_9

    .line 93
    .line 94
    return v1

    .line 95
    :cond_9
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapParameterTypes:Ljava/util/List;

    .line 96
    .line 97
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapParameterTypes:Ljava/util/List;

    .line 98
    .line 99
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-nez v2, :cond_a

    .line 104
    .line 105
    return v1

    .line 106
    :cond_a
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->arguments:Ljava/util/List;

    .line 107
    .line 108
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->arguments:Ljava/util/List;

    .line 109
    .line 110
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    if-nez p0, :cond_b

    .line 115
    .line 116
    return v1

    .line 117
    :cond_b
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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->name:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 19
    .line 20
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapType:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    add-int/2addr v2, v0

    .line 31
    mul-int/2addr v2, v1

    .line 32
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapOwner:Lnet/bytebuddy/description/type/TypeDescription;

    .line 33
    .line 34
    invoke-static {v0, v2, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapName:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v0, v1, v2}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapReturnType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 45
    .line 46
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapParameterTypes:Ljava/util/List;

    .line 51
    .line 52
    invoke-static {v2, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/util/List;II)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->arguments:Ljava/util/List;

    .line 57
    .line 58
    invoke-static {v2, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/util/List;II)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-boolean p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->invokedynamic:Z

    .line 63
    .line 64
    add-int/2addr v0, p0

    .line 65
    return v0
.end method

.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler;Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;
    .locals 6

    .line 1
    iget-object p2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapOwner:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    sget-object p3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-interface {p2, p3}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    :goto_0
    move-object v2, p1

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    iget-object p1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapOwner:Lnet/bytebuddy/description/type/TypeDescription;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :goto_1
    iget-boolean p1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->invokedynamic:Z

    .line 17
    .line 18
    iget-object p2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->name:Ljava/lang/String;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    new-instance p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForStackManipulation;

    .line 23
    .line 24
    new-instance p3, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;

    .line 25
    .line 26
    iget-object p4, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 27
    .line 28
    const/4 p5, 0x0

    .line 29
    new-array p5, p5, [Lnet/bytebuddy/description/type/TypeDescription;

    .line 30
    .line 31
    invoke-static {p4, p5}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->of(Lnet/bytebuddy/description/type/TypeDescription;[Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 32
    .line 33
    .line 34
    move-result-object p4

    .line 35
    new-instance v0, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 36
    .line 37
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapType:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 38
    .line 39
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapName:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapReturnType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 42
    .line 43
    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapParameterTypes:Ljava/util/List;

    .line 44
    .line 45
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;-><init>(Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->arguments:Ljava/util/List;

    .line 49
    .line 50
    invoke-direct {p3, p2, p4, v0, p0}, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;-><init>(Ljava/lang/String;Lnet/bytebuddy/utility/JavaConstant$MethodType;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Ljava/util/List;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p1, p3}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForStackManipulation;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 54
    .line 55
    .line 56
    return-object p1

    .line 57
    :cond_1
    new-instance p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForStackManipulation;

    .line 58
    .line 59
    new-instance p3, Lnet/bytebuddy/implementation/bytecode/constant/JavaConstantValue;

    .line 60
    .line 61
    new-instance p4, Lnet/bytebuddy/utility/JavaConstant$Dynamic;

    .line 62
    .line 63
    iget-object p5, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 64
    .line 65
    new-instance v0, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 66
    .line 67
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapType:Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;

    .line 68
    .line 69
    iget-object v3, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapName:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapReturnType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 72
    .line 73
    iget-object v5, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->bootstrapParameterTypes:Ljava/util/List;

    .line 74
    .line 75
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;-><init>(Lnet/bytebuddy/utility/JavaConstant$MethodHandle$HandleType;Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 76
    .line 77
    .line 78
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForDynamicConstant;->arguments:Ljava/util/List;

    .line 79
    .line 80
    invoke-direct {p4, p2, p5, v0, p0}, Lnet/bytebuddy/utility/JavaConstant$Dynamic;-><init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Ljava/util/List;)V

    .line 81
    .line 82
    .line 83
    invoke-direct {p3, p4}, Lnet/bytebuddy/implementation/bytecode/constant/JavaConstantValue;-><init>(Lnet/bytebuddy/utility/JavaConstant;)V

    .line 84
    .line 85
    .line 86
    invoke-direct {p1, p3}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForStackManipulation;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 87
    .line 88
    .line 89
    return-object p1
.end method
