.class public Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Build"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final methodInvocation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

.field private final parameterStackManipulations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            ">;"
        }
    .end annotation
.end field

.field private final registeredTargetIndices:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "*",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final target:Lnet/bytebuddy/description/method/MethodDescription;

.field private final terminatingStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/method/MethodDescription;Ljava/util/Map;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Ljava/util/List;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            "Ljava/util/Map<",
            "*",
            "Ljava/lang/Integer;",
            ">;",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            ">;",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->target:Lnet/bytebuddy/description/method/MethodDescription;

    .line 5
    .line 6
    new-instance p1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {p1, p2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->registeredTargetIndices:Ljava/util/Map;

    .line 12
    .line 13
    iput-object p3, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->methodInvocation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 14
    .line 15
    new-instance p1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {p1, p4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->parameterStackManipulations:Ljava/util/List;

    .line 21
    .line 22
    iput-object p5, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->terminatingStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 5

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->parameterStackManipulations:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->methodInvocation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->terminatingStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    new-array v3, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    aput-object v2, v3, v4

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    aput-object p0, v3, v2

    .line 17
    .line 18
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {v1, p0}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>(Ljava/util/List;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->target:Lnet/bytebuddy/description/method/MethodDescription;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->target:Lnet/bytebuddy/description/method/MethodDescription;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->registeredTargetIndices:Ljava/util/Map;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->registeredTargetIndices:Ljava/util/Map;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->methodInvocation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 45
    .line 46
    iget-object v3, p1, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->methodInvocation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->parameterStackManipulations:Ljava/util/List;

    .line 56
    .line 57
    iget-object v3, p1, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->parameterStackManipulations:Ljava/util/List;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->terminatingStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 67
    .line 68
    iget-object p1, p1, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->terminatingStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

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

.method public getTarget()Lnet/bytebuddy/description/method/MethodDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->target:Lnet/bytebuddy/description/method/MethodDescription;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTargetParameterIndex(Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->registeredTargetIndices:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Integer;

    .line 8
    .line 9
    return-object p0
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->target:Lnet/bytebuddy/description/method/MethodDescription;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Lnet/bytebuddy/description/method/MethodDescription;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->registeredTargetIndices:Ljava/util/Map;

    .line 19
    .line 20
    invoke-static {v2, v0, v1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏(Ljava/util/Map;II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->methodInvocation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 25
    .line 26
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Lnet/bytebuddy/implementation/bytecode/StackManipulation;II)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->parameterStackManipulations:Ljava/util/List;

    .line 31
    .line 32
    invoke-static {v2, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/util/List;II)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->terminatingStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    add-int/2addr p0, v0

    .line 43
    return p0
.end method

.method public isValid()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->methodInvocation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->terminatingStackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 10
    .line 11
    invoke-interface {v0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;->parameterStackManipulations:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_1
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 39
    .line 40
    invoke-interface {v0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    return v0
.end method
