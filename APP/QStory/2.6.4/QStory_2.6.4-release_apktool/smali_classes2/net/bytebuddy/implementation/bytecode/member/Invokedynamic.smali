.class public Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;
.super Lnet/bytebuddy/implementation/bytecode/StackManipulation$AbstractBase;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final arguments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;"
        }
    .end annotation
.end field

.field private final bootstrap:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

.field private final name:Ljava/lang/String;

.field private final type:Lnet/bytebuddy/utility/JavaConstant$MethodType;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lnet/bytebuddy/utility/JavaConstant$MethodType;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/utility/JavaConstant$MethodType;",
            "Lnet/bytebuddy/utility/JavaConstant$MethodHandle;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->name:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->type:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->bootstrap:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->arguments:Ljava/util/List;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 4

    .line 1
    iget-object p2, p0, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->arguments:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    new-array p2, p2, [Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    :goto_0
    iget-object v1, p0, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->arguments:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ge v0, v1, :cond_0

    .line 17
    .line 18
    iget-object v1, p0, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->arguments:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lnet/bytebuddy/utility/JavaConstant;

    .line 25
    .line 26
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/constant/JavaConstantValue$Visitor;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/constant/JavaConstantValue$Visitor;

    .line 27
    .line 28
    invoke-interface {v1, v2}, Lnet/bytebuddy/utility/JavaConstant;->accept(Lnet/bytebuddy/utility/JavaConstant$Visitor;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    aput-object v1, p2, v0

    .line 33
    .line 34
    add-int/lit8 v0, v0, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->name:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v1, p0, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->type:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 40
    .line 41
    invoke-virtual {v1}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getDescriptor()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/constant/JavaConstantValue$Visitor;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/constant/JavaConstantValue$Visitor;

    .line 46
    .line 47
    iget-object v3, p0, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->bootstrap:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Lnet/bytebuddy/implementation/bytecode/constant/JavaConstantValue$Visitor;->onMethodHandle(Lnet/bytebuddy/utility/JavaConstant$MethodHandle;)Lnet/bytebuddy/jar/asm/Handle;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {p1, v0, v1, v2, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInvokeDynamicInsn(Ljava/lang/String;Ljava/lang/String;Lnet/bytebuddy/jar/asm/Handle;[Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance p1, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 57
    .line 58
    iget-object p2, p0, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->type:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 59
    .line 60
    invoke-virtual {p2}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-interface {p2}, Lnet/bytebuddy/description/type/TypeDefinition;->getStackSize()Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-virtual {p2}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    iget-object v0, p0, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->type:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 73
    .line 74
    invoke-virtual {v0}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getParameterTypes()Lnet/bytebuddy/description/type/TypeList;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeList;->getStackSize()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    sub-int/2addr p2, v0

    .line 83
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->type:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 84
    .line 85
    invoke-virtual {p0}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->getStackSize()Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    invoke-direct {p1, p2, p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;-><init>(II)V

    .line 98
    .line 99
    .line 100
    return-object p1
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->name:Ljava/lang/String;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->name:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->type:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->type:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->bootstrap:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->bootstrap:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->arguments:Ljava/util/List;

    .line 56
    .line 57
    iget-object p1, p1, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->arguments:Ljava/util/List;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->name:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->type:Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 19
    .line 20
    invoke-virtual {v2}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    add-int/2addr v2, v0

    .line 25
    mul-int/2addr v2, v1

    .line 26
    iget-object v0, p0, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->bootstrap:Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 27
    .line 28
    invoke-virtual {v0}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    add-int/2addr v0, v2

    .line 33
    mul-int/2addr v0, v1

    .line 34
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/member/Invokedynamic;->arguments:Ljava/util/List;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v0

    .line 41
    return p0
.end method
