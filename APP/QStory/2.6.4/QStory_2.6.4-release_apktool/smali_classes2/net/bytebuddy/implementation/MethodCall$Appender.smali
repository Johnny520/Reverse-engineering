.class public Lnet/bytebuddy/implementation/MethodCall$Appender;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/MethodCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Appender"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field private final argumentProviders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ArgumentProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

.field private final methodInvoker:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker;

.field private final methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator;

.field private final targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler;

.field private final terminationHandler:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler;

.field final synthetic this$0:Lnet/bytebuddy/implementation/MethodCall;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/MethodCall;Lnet/bytebuddy/implementation/Implementation$Target;Lnet/bytebuddy/implementation/MethodCall$TerminationHandler;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/MethodCall;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 7
    .line 8
    iget-object v0, p1, Lnet/bytebuddy/implementation/MethodCall;->methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;

    .line 9
    .line 10
    invoke-interface {p2}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v0, v1}, Lnet/bytebuddy/implementation/MethodCall$MethodLocator$Factory;->make(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/MethodCall$MethodLocator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator;

    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    iget-object v1, p1, Lnet/bytebuddy/implementation/MethodCall;->argumentLoaders:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->argumentProviders:Ljava/util/List;

    .line 32
    .line 33
    iget-object v0, p1, Lnet/bytebuddy/implementation/MethodCall;->argumentLoaders:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;

    .line 50
    .line 51
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->argumentProviders:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v1, p2}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;->make(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ArgumentProvider;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    iget-object v0, p1, Lnet/bytebuddy/implementation/MethodCall;->methodInvoker:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;

    .line 62
    .line 63
    invoke-interface {p2}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-interface {v0, v1}, Lnet/bytebuddy/implementation/MethodCall$MethodInvoker$Factory;->make(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/MethodCall$MethodInvoker;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->methodInvoker:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker;

    .line 72
    .line 73
    iget-object p1, p1, Lnet/bytebuddy/implementation/MethodCall;->targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;

    .line 74
    .line 75
    invoke-interface {p1, p2}, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Factory;->make(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/MethodCall$TargetHandler;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iput-object p1, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler;

    .line 80
    .line 81
    iput-object p3, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->terminationHandler:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler;

    .line 82
    .line 83
    return-void
.end method

.method public static synthetic access$000(Lnet/bytebuddy/implementation/MethodCall$Appender;)Lnet/bytebuddy/implementation/MethodCall$TargetHandler;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 5

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler;

    .line 2
    .line 3
    invoke-interface {v0, p3}, Lnet/bytebuddy/implementation/MethodCall$TargetHandler;->resolve(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Resolved;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 8
    .line 9
    new-instance v2, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 10
    .line 11
    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->terminationHandler:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler;

    .line 12
    .line 13
    invoke-interface {v3}, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler;->prepare()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {p0, p3, v0}, Lnet/bytebuddy/implementation/MethodCall$Appender;->toInvokedMethod(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Resolved;)Lnet/bytebuddy/description/method/MethodDescription;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual {p0, p3, v4, v0}, Lnet/bytebuddy/implementation/MethodCall$Appender;->toStackManipulation(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Resolved;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const/4 v0, 0x2

    .line 26
    new-array v0, v0, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    aput-object v3, v0, v4

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    aput-object p0, v0, v3

    .line 33
    .line 34
    invoke-direct {v2, v0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-direct {v1, p0, p1}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 50
    .line 51
    .line 52
    return-object v1
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/MethodCall$Appender;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodCall$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodCall$Appender;->methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->argumentProviders:Ljava/util/List;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodCall$Appender;->argumentProviders:Ljava/util/List;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->methodInvoker:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker;

    .line 56
    .line 57
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodCall$Appender;->methodInvoker:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler;

    .line 67
    .line 68
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodCall$Appender;->targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler;

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_7

    .line 75
    .line 76
    return v1

    .line 77
    :cond_7
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->terminationHandler:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler;

    .line 78
    .line 79
    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodCall$Appender;->terminationHandler:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler;

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-nez v2, :cond_8

    .line 86
    .line 87
    return v1

    .line 88
    :cond_8
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/MethodCall;

    .line 89
    .line 90
    iget-object p1, p1, Lnet/bytebuddy/implementation/MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/MethodCall;

    .line 91
    .line 92
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/MethodCall;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-nez p0, :cond_9

    .line 97
    .line 98
    return v1

    .line 99
    :cond_9
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

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
    iget-object v0, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->argumentProviders:Ljava/util/List;

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/util/List;II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->methodInvoker:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v2, v0

    .line 41
    mul-int/2addr v2, v1

    .line 42
    iget-object v0, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->targetHandler:Lnet/bytebuddy/implementation/MethodCall$TargetHandler;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    add-int/2addr v0, v2

    .line 49
    mul-int/2addr v0, v1

    .line 50
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->terminationHandler:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    add-int/2addr v2, v0

    .line 57
    mul-int/2addr v2, v1

    .line 58
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/MethodCall;

    .line 59
    .line 60
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/MethodCall;->hashCode()I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    add-int/2addr p0, v2

    .line 65
    return p0
.end method

.method public toInvokedMethod(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Resolved;)Lnet/bytebuddy/description/method/MethodDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->methodLocator:Lnet/bytebuddy/implementation/MethodCall$MethodLocator;

    .line 2
    .line 3
    invoke-interface {p2}, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Resolved;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-interface {p0, p2, p1}, Lnet/bytebuddy/implementation/MethodCall$MethodLocator;->resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/description/method/MethodDescription;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public toStackManipulation(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Resolved;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->argumentProviders:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ArgumentProvider;

    .line 23
    .line 24
    invoke-interface {v2, p1, p2}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ArgumentProvider;->resolve(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/method/MethodDescription;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-ne v2, v3, :cond_2

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    new-instance v2, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_1

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader;

    .line 74
    .line 75
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    check-cast v4, Lnet/bytebuddy/description/method/ParameterDescription;

    .line 80
    .line 81
    iget-object v5, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/MethodCall;

    .line 82
    .line 83
    iget-object v6, v5, Lnet/bytebuddy/implementation/MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 84
    .line 85
    iget-object v5, v5, Lnet/bytebuddy/implementation/MethodCall;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 86
    .line 87
    invoke-interface {v3, v4, v6, v5}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader;->toStackManipulation(Lnet/bytebuddy/description/method/ParameterDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 96
    .line 97
    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/MethodCall;

    .line 98
    .line 99
    iget-object v3, v1, Lnet/bytebuddy/implementation/MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 100
    .line 101
    iget-object v1, v1, Lnet/bytebuddy/implementation/MethodCall;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 102
    .line 103
    invoke-interface {p3, p2, v3, v1}, Lnet/bytebuddy/implementation/MethodCall$TargetHandler$Resolved;->toStackManipulation(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 108
    .line 109
    invoke-direct {v1, v2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>(Ljava/util/List;)V

    .line 110
    .line 111
    .line 112
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->methodInvoker:Lnet/bytebuddy/implementation/MethodCall$MethodInvoker;

    .line 113
    .line 114
    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->implementationTarget:Lnet/bytebuddy/implementation/Implementation$Target;

    .line 115
    .line 116
    invoke-interface {v2, p2, v3}, Lnet/bytebuddy/implementation/MethodCall$MethodInvoker;->toStackManipulation(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    iget-object v3, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->terminationHandler:Lnet/bytebuddy/implementation/MethodCall$TerminationHandler;

    .line 121
    .line 122
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodCall$Appender;->this$0:Lnet/bytebuddy/implementation/MethodCall;

    .line 123
    .line 124
    iget-object v4, p0, Lnet/bytebuddy/implementation/MethodCall;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 125
    .line 126
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodCall;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 127
    .line 128
    invoke-interface {v3, p2, p1, v4, p0}, Lnet/bytebuddy/implementation/MethodCall$TerminationHandler;->toStackManipulation(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    const/4 p1, 0x4

    .line 133
    new-array p1, p1, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 134
    .line 135
    const/4 p2, 0x0

    .line 136
    aput-object p3, p1, p2

    .line 137
    .line 138
    const/4 p2, 0x1

    .line 139
    aput-object v1, p1, p2

    .line 140
    .line 141
    const/4 p2, 0x2

    .line 142
    aput-object v2, p1, p2

    .line 143
    .line 144
    const/4 p2, 0x3

    .line 145
    aput-object p0, p1, p2

    .line 146
    .line 147
    invoke-direct {v0, p1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 148
    .line 149
    .line 150
    return-object v0

    .line 151
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    const-string p2, " arguments"

    .line 164
    .line 165
    const-string p3, " does not accept "

    .line 166
    .line 167
    invoke-static {p0, p3, p1, p2}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/StringBuilder;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    const/4 p0, 0x0

    .line 171
    return-object p0
.end method
