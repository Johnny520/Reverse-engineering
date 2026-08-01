.class public Lnet/bytebuddy/implementation/InvokeDynamic$Appender;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/InvokeDynamic;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Appender"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field private final instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

.field final synthetic this$0:Lnet/bytebuddy/implementation/InvokeDynamic;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/InvokeDynamic;Lnet/bytebuddy/description/type/TypeDescription;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/implementation/InvokeDynamic$Appender;->this$0:Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/InvokeDynamic$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 8

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/InvokeDynamic$Appender;->this$0:Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 2
    .line 3
    iget-object v0, v0, Lnet/bytebuddy/implementation/InvokeDynamic;->invocationProvider:Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;

    .line 4
    .line 5
    invoke-interface {v0, p3}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider;->make(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Target;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lnet/bytebuddy/implementation/InvokeDynamic$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 10
    .line 11
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic$Appender;->this$0:Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 12
    .line 13
    iget-object v3, v2, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 14
    .line 15
    iget-object v2, v2, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 16
    .line 17
    invoke-interface {v0, v1, v3, v2}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Target;->resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Target$Resolved;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 22
    .line 23
    invoke-interface {v0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Target$Resolved;->getStackManipulation()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v3, p0, Lnet/bytebuddy/implementation/InvokeDynamic$Appender;->this$0:Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 28
    .line 29
    iget-object v3, v3, Lnet/bytebuddy/implementation/InvokeDynamic;->bootstrap:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 30
    .line 31
    invoke-static {v3}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-interface {v0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Target$Resolved;->getInternalName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-interface {v0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Target$Resolved;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-interface {v0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Target$Resolved;->getParameterTypes()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    iget-object v7, p0, Lnet/bytebuddy/implementation/InvokeDynamic$Appender;->this$0:Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 48
    .line 49
    iget-object v7, v7, Lnet/bytebuddy/implementation/InvokeDynamic;->arguments:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v3, v4, v5, v6, v7}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;->dynamic(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    iget-object v4, p0, Lnet/bytebuddy/implementation/InvokeDynamic$Appender;->this$0:Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 56
    .line 57
    iget-object v4, v4, Lnet/bytebuddy/implementation/InvokeDynamic;->terminationHandler:Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;

    .line 58
    .line 59
    invoke-interface {v0}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Target$Resolved;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object p0, p0, Lnet/bytebuddy/implementation/InvokeDynamic$Appender;->this$0:Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 64
    .line 65
    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 66
    .line 67
    iget-object p0, p0, Lnet/bytebuddy/implementation/InvokeDynamic;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 68
    .line 69
    invoke-virtual {v4, p3, v0, v5, p0}, Lnet/bytebuddy/implementation/InvokeDynamic$TerminationHandler;->resolve(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    const/4 v0, 0x3

    .line 74
    new-array v0, v0, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 75
    .line 76
    const/4 v4, 0x0

    .line 77
    aput-object v2, v0, v4

    .line 78
    .line 79
    const/4 v2, 0x1

    .line 80
    aput-object v3, v0, v2

    .line 81
    .line 82
    const/4 v2, 0x2

    .line 83
    aput-object p0, v0, v2

    .line 84
    .line 85
    invoke-direct {v1, v0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    new-instance p1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 93
    .line 94
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    invoke-direct {p1, p0, p2}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 103
    .line 104
    .line 105
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/InvokeDynamic$Appender;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/InvokeDynamic$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/InvokeDynamic$Appender;->this$0:Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/implementation/InvokeDynamic$Appender;->this$0:Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/InvokeDynamic;->equals(Ljava/lang/Object;)Z

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic$Appender;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object p0, p0, Lnet/bytebuddy/implementation/InvokeDynamic$Appender;->this$0:Lnet/bytebuddy/implementation/InvokeDynamic;

    .line 19
    .line 20
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/InvokeDynamic;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v0

    .line 25
    return p0
.end method
