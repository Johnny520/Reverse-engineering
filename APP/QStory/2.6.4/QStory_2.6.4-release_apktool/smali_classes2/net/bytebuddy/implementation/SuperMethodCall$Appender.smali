.class public Lnet/bytebuddy/implementation/SuperMethodCall$Appender;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/SuperMethodCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Appender"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/SuperMethodCall$Appender$TerminationHandler;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

.field private final terminationHandler:Lnet/bytebuddy/implementation/SuperMethodCall$Appender$TerminationHandler;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/Implementation$Target;Lnet/bytebuddy/implementation/SuperMethodCall$Appender$TerminationHandler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/SuperMethodCall$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/SuperMethodCall$Appender;->terminationHandler:Lnet/bytebuddy/implementation/SuperMethodCall$Appender$TerminationHandler;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 5

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/SuperMethodCall$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 2
    .line 3
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->asSignatureToken()Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Lnet/bytebuddy/implementation/Implementation$Target;->invokeDominant(Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;)Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->asTypeToken()Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0, v1}, Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;->withCheckedCompatibilityTo(Lnet/bytebuddy/description/method/MethodDescription$TypeToken;)Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 26
    .line 27
    invoke-static {p3}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->allArgumentsOf(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess$MethodLoading;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess$MethodLoading;->prependThisReference()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-object p0, p0, Lnet/bytebuddy/implementation/SuperMethodCall$Appender;->terminationHandler:Lnet/bytebuddy/implementation/SuperMethodCall$Appender$TerminationHandler;

    .line 36
    .line 37
    invoke-virtual {p0, p3}, Lnet/bytebuddy/implementation/SuperMethodCall$Appender$TerminationHandler;->of(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const/4 v3, 0x3

    .line 42
    new-array v3, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    aput-object v2, v3, v4

    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    aput-object v0, v3, v2

    .line 49
    .line 50
    const/4 v0, 0x2

    .line 51
    aput-object p0, v3, v0

    .line 52
    .line 53
    invoke-direct {v1, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    new-instance p1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 61
    .line 62
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    invoke-direct {p1, p0, p2}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 71
    .line 72
    .line 73
    return-object p1

    .line 74
    :cond_0
    const-string p0, "Cannot call super (or default) method for "

    .line 75
    .line 76
    invoke-static {p0, p3}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;Lnet/bytebuddy/description/method/MethodDescription;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const/4 p0, 0x0

    .line 84
    return-object p0
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/SuperMethodCall$Appender;->terminationHandler:Lnet/bytebuddy/implementation/SuperMethodCall$Appender$TerminationHandler;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/SuperMethodCall$Appender;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/SuperMethodCall$Appender;->terminationHandler:Lnet/bytebuddy/implementation/SuperMethodCall$Appender$TerminationHandler;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/SuperMethodCall$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/implementation/SuperMethodCall$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

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
    iget-object v1, p0, Lnet/bytebuddy/implementation/SuperMethodCall$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object p0, p0, Lnet/bytebuddy/implementation/SuperMethodCall$Appender;->terminationHandler:Lnet/bytebuddy/implementation/SuperMethodCall$Appender$TerminationHandler;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    add-int/2addr p0, v1

    .line 27
    return p0
.end method
