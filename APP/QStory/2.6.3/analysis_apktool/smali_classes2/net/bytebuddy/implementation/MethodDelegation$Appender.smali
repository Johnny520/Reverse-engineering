.class public Lnet/bytebuddy/implementation/MethodDelegation$Appender;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/MethodDelegation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Appender"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

.field private final compiled:Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$Compiled;

.field private final implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

.field private final processor:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record;

.field private final terminationHandler:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/Implementation$Target;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$Compiled;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->processor:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->terminationHandler:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->compiled:Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$Compiled;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 8

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->compiled:Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$Compiled;

    .line 4
    .line 5
    invoke-interface {v1, p3}, Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$Compiled;->prepare(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->processor:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record;

    .line 10
    .line 11
    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 12
    .line 13
    iget-object v5, p0, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->terminationHandler:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;

    .line 14
    .line 15
    iget-object v4, p0, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->compiled:Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$Compiled;

    .line 16
    .line 17
    invoke-interface {v4}, Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$Compiled;->invoke()Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodInvoker;

    .line 18
    .line 19
    .line 20
    move-result-object v6

    .line 21
    iget-object v7, p0, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 22
    .line 23
    move-object v4, p3

    .line 24
    invoke-interface/range {v2 .. v7}, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record;->bind(Lnet/bytebuddy/implementation/Implementation$Target;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodInvoker;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const/4 p3, 0x2

    .line 29
    new-array p3, p3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    aput-object v1, p3, v2

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    aput-object p0, p3, v1

    .line 36
    .line 37
    invoke-direct {v0, p3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    new-instance p1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 45
    .line 46
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-interface {v4}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    invoke-direct {p1, p0, p2}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 55
    .line 56
    .line 57
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/MethodDelegation$Appender;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->processor:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->processor:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->terminationHandler:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->terminationHandler:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 56
    .line 57
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_6

    .line 64
    .line 65
    return v1

    .line 66
    :cond_6
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->compiled:Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$Compiled;

    .line 67
    .line 68
    iget-object p1, p1, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->compiled:Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$Compiled;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-nez p0, :cond_7

    .line 75
    .line 76
    return v1

    .line 77
    :cond_7
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    add-int/2addr v2, v0

    .line 19
    mul-int/2addr v2, v1

    .line 20
    iget-object v0, p0, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->processor:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v2

    .line 27
    mul-int/2addr v0, v1

    .line 28
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->terminationHandler:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, v0

    .line 35
    mul-int/2addr v2, v1

    .line 36
    iget-object v0, p0, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 37
    .line 38
    invoke-static {v0, v2, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;II)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodDelegation$Appender;->compiled:Lnet/bytebuddy/implementation/MethodDelegation$ImplementationDelegate$Compiled;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    add-int/2addr p0, v0

    .line 49
    return p0
.end method
