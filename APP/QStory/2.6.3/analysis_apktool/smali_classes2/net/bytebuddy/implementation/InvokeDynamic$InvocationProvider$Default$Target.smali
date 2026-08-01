.class public Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Target;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Target"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final argumentProviders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;",
            ">;"
        }
    .end annotation
.end field

.field private final instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

.field private final internalName:Ljava/lang/String;

.field private final returnType:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Lnet/bytebuddy/description/method/MethodDescription;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;",
            ">;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;->internalName:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;->returnType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;->argumentProviders:Ljava/util/List;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;->internalName:Ljava/lang/String;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;->internalName:Ljava/lang/String;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;->returnType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;->returnType:Lnet/bytebuddy/description/type/TypeDescription;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;->argumentProviders:Ljava/util/List;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;->argumentProviders:Ljava/util/List;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 56
    .line 57
    iget-object p1, p1, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;->internalName:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;->returnType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 19
    .line 20
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;->argumentProviders:Ljava/util/List;

    .line 25
    .line 26
    invoke-static {v2, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/util/List;II)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object p0, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    add-int/2addr p0, v0

    .line 37
    return p0
.end method

.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Target$Resolved;
    .locals 6

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;->argumentProviders:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-array v0, v0, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;->argumentProviders:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/4 v3, 0x0

    .line 21
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;

    .line 32
    .line 33
    iget-object v5, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 34
    .line 35
    invoke-interface {v4, p1, v5, p2, p3}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider;->resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-interface {v4}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved;->getLoadedTypes()Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 44
    .line 45
    .line 46
    add-int/lit8 v5, v3, 0x1

    .line 47
    .line 48
    invoke-interface {v4}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved;->getLoadInstruction()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    aput-object v4, v0, v3

    .line 53
    .line 54
    move v3, v5

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    new-instance p1, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Target$Resolved$Simple;

    .line 57
    .line 58
    new-instance p2, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 59
    .line 60
    invoke-direct {p2, v0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 61
    .line 62
    .line 63
    iget-object p3, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;->internalName:Ljava/lang/String;

    .line 64
    .line 65
    iget-object p0, p0, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Default$Target;->returnType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 66
    .line 67
    invoke-direct {p1, p2, p3, p0, v1}, Lnet/bytebuddy/implementation/InvokeDynamic$InvocationProvider$Target$Resolved$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 68
    .line 69
    .line 70
    return-object p1
.end method
