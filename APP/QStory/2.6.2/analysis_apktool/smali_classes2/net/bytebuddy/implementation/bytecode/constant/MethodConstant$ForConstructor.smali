.class public Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$ForConstructor;
.super Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$CanCache;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForConstructor"
.end annotation


# static fields
.field private static final GET_CONSTRUCTOR:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

.field private static final GET_DECLARED_CONSTRUCTOR:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-class v0, [Ljava/lang/Class;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Class;

    .line 4
    .line 5
    :try_start_0
    new-instance v2, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    .line 6
    .line 7
    const-string v3, "getConstructor"

    .line 8
    .line 9
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-direct {v2, v3}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 18
    .line 19
    .line 20
    sput-object v2, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$ForConstructor;->GET_CONSTRUCTOR:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 21
    .line 22
    new-instance v2, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    .line 23
    .line 24
    const-string v3, "getDeclaredConstructor"

    .line 25
    .line 26
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v1, v3, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-direct {v2, v0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 35
    .line 36
    .line 37
    sput-object v2, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$ForConstructor;->GET_DECLARED_CONSTRUCTOR:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    return-void

    .line 40
    :catch_0
    move-exception v0

    .line 41
    const-string v1, "Could not locate Class::getDeclaredConstructor"

    .line 42
    .line 43
    invoke-static {v1, v0}, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
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
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$ForConstructor;->GET_CONSTRUCTOR:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$ForConstructor;->GET_DECLARED_CONSTRUCTOR:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 13
    .line 14
    return-object p0
.end method

.method public cached()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$CachedConstructor;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/bytecode/constant/MethodConstant$CachedConstructor;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public methodName()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 0

    .line 1
    sget-object p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;

    .line 2
    .line 3
    return-object p0
.end method
