.class public Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Processor;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bind/MethodDelegationBinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Processor"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

.field private final bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

.field private final records:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record;",
            ">;",
            "Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;",
            "Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Processor;->records:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Processor;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Processor;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public bind(Lnet/bytebuddy/implementation/Implementation$Target;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodInvoker;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Processor;->records:Ljava/util/List;

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
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    move-object v3, v2

    .line 23
    check-cast v3, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record;

    .line 24
    .line 25
    move-object v4, p1

    .line 26
    move-object v5, p2

    .line 27
    move-object v6, p3

    .line 28
    move-object v7, p4

    .line 29
    move-object v8, p5

    .line 30
    invoke-interface/range {v3 .. v8}, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Record;->bind(Lnet/bytebuddy/implementation/Implementation$Target;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$TerminationHandler;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodInvoker;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-interface {p1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-eqz p2, :cond_0

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_0
    move-object p1, v4

    .line 44
    move-object p2, v5

    .line 45
    move-object p3, v6

    .line 46
    move-object p4, v7

    .line 47
    move-object p5, v8

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move-object v5, p2

    .line 50
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_2

    .line 55
    .line 56
    iget-object p1, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Processor;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 57
    .line 58
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Processor;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    .line 59
    .line 60
    invoke-interface {p1, p0, v5, v0}, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;->resolve(Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;Lnet/bytebuddy/description/method/MethodDescription;Ljava/util/List;)Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_2
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Processor;->records:Ljava/util/List;

    .line 66
    .line 67
    const-string p1, " allows for delegation from "

    .line 68
    .line 69
    const-string p2, "None of "

    .line 70
    .line 71
    invoke-static {p2, p0, p1, v5}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    const/4 p0, 0x0

    .line 75
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Processor;->records:Ljava/util/List;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Processor;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Processor;->records:Ljava/util/List;

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Processor;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    .line 34
    .line 35
    iget-object v3, p1, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Processor;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Processor;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 45
    .line 46
    iget-object p1, p1, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Processor;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_5

    .line 53
    .line 54
    return v1

    .line 55
    :cond_5
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Processor;->records:Ljava/util/List;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世哲兰(Ljava/util/List;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Processor;->ambiguityResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    add-int/2addr v2, v0

    .line 25
    mul-int/2addr v2, v1

    .line 26
    iget-object p0, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$Processor;->bindingResolver:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$BindingResolver;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    add-int/2addr p0, v2

    .line 33
    return p0
.end method
