.class final enum Lnet/bytebuddy/asm/Advice$ExceptionHandler$Default$2;
.super Lnet/bytebuddy/asm/Advice$ExceptionHandler$Default;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$ExceptionHandler$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/asm/Advice$ExceptionHandler$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/asm/Advice$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public resolve(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    const/4 p0, 0x0

    .line 2
    :try_start_0
    new-instance p1, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    .line 3
    .line 4
    const-class p2, Ljava/lang/Throwable;

    .line 5
    .line 6
    const-string v0, "printStackTrace"

    .line 7
    .line 8
    invoke-virtual {p2, v0, p0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-direct {p1, p2}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 16
    .line 17
    .line 18
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    return-object p0

    .line 20
    :catch_0
    const-string p1, "Cannot locate Throwable::printStackTrace"

    .line 21
    .line 22
    invoke-static {p1}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method
