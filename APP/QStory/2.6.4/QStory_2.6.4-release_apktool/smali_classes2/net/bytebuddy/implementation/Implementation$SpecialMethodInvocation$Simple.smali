.class public Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation$Simple;
.super Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation$AbstractBase;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Simple"
.end annotation


# instance fields
.field private final methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

.field private final stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

.field private final typeDescription:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation$Simple;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation$Simple;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation$Simple;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 9
    .line 10
    return-void
.end method

.method public static of(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;
    .locals 2

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;->special(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    new-instance v1, Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation$Simple;

    .line 16
    .line 17
    invoke-direct {v1, p0, p1, v0}, Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation$Simple;-><init>(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 18
    .line 19
    .line 20
    return-object v1

    .line 21
    :cond_0
    sget-object p0, Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation$Illegal;->INSTANCE:Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation$Illegal;

    .line 22
    .line 23
    return-object p0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation$Simple;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getMethodDescription()Lnet/bytebuddy/description/method/MethodDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation$Simple;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation$Simple;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    return-object p0
.end method

.method public toMethodHandle()Lnet/bytebuddy/utility/JavaConstant$MethodHandle;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation$Simple;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;->asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 8
    .line 9
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation$Simple;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 10
    .line 11
    invoke-static {v0, p0}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->ofSpecial(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public withCheckedCompatibilityTo(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;)Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation$Simple;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->asTypeToken()Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object p0, Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation$Illegal;->INSTANCE:Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation$Illegal;

    .line 15
    .line 16
    return-object p0
.end method
