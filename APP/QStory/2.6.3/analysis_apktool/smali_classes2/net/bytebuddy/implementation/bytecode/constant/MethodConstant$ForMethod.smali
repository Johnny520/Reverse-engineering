.class public Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$ForMethod;
.super Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$CanCache;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForMethod"
.end annotation


# static fields
.field private static final GET_DECLARED_METHOD:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final GET_METHOD:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const-class v0, [Ljava/lang/Class;

    .line 2
    .line 3
    const-class v1, Ljava/lang/String;

    .line 4
    .line 5
    const-class v2, Ljava/lang/Class;

    .line 6
    .line 7
    :try_start_0
    new-instance v3, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    .line 8
    .line 9
    const-string v4, "getMethod"

    .line 10
    .line 11
    filled-new-array {v1, v0}, [Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-virtual {v2, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-direct {v3, v4}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 20
    .line 21
    .line 22
    sput-object v3, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$ForMethod;->GET_METHOD:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 23
    .line 24
    new-instance v3, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    .line 25
    .line 26
    const-string v4, "getDeclaredMethod"

    .line 27
    .line 28
    filled-new-array {v1, v0}, [Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v2, v4, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-direct {v3, v0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 37
    .line 38
    .line 39
    sput-object v3, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$ForMethod;->GET_DECLARED_METHOD:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    return-void

    .line 42
    :catch_0
    move-exception v0

    .line 43
    const-string v1, "Could not locate method lookup"

    .line 44
    .line 45
    invoke-static {v1, v0}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public accessorMethod()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isPublic()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$ForMethod;->GET_METHOD:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$ForMethod;->GET_DECLARED_METHOD:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 13
    .line 14
    return-object p0
.end method

.method public cached()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$CachedMethod;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$CachedMethod;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public methodName()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 4
    .line 5
    invoke-interface {p0}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
