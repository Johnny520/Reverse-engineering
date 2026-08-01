.class public Lnet/bytebuddy/implementation/bytecode/constant/FieldConstant;
.super Lnet/bytebuddy/implementation/bytecode/StackManipulation$AbstractBase;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/bytecode/constant/FieldConstant$Cached;
    }
.end annotation


# instance fields
.field private final fieldDescription:Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/bytecode/constant/FieldConstant;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 6

    .line 1
    :try_start_0
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/bytecode/constant/FieldConstant;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 4
    .line 5
    invoke-interface {v1}, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;

    .line 14
    .line 15
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/constant/FieldConstant;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 16
    .line 17
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v2, p0}, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    new-instance p0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    .line 25
    .line 26
    const-class v3, Ljava/lang/Class;

    .line 27
    .line 28
    const-string v4, "getDeclaredField"

    .line 29
    .line 30
    const-class v5, Ljava/lang/String;

    .line 31
    .line 32
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-direct {p0, v3}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const/4 v3, 0x3

    .line 48
    new-array v3, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    aput-object v1, v3, v4

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    aput-object v2, v3, v1

    .line 55
    .line 56
    const/4 v1, 0x2

    .line 57
    aput-object p0, v3, v1

    .line 58
    .line 59
    invoke-direct {v0, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 63
    .line 64
    .line 65
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    return-object p0

    .line 67
    :catch_0
    move-exception p0

    .line 68
    const-string p1, "Cannot locate Class::getDeclaredField"

    .line 69
    .line 70
    invoke-static {p1, p0}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    const/4 p0, 0x0

    .line 74
    return-object p0
.end method

.method public cached()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/constant/FieldConstant$Cached;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/bytecode/constant/FieldConstant$Cached;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    if-eqz p1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    check-cast p1, Lnet/bytebuddy/implementation/bytecode/constant/FieldConstant;

    .line 19
    .line 20
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/constant/FieldConstant;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 21
    .line 22
    iget-object p1, p1, Lnet/bytebuddy/implementation/bytecode/constant/FieldConstant;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0

    .line 29
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/constant/FieldConstant;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
