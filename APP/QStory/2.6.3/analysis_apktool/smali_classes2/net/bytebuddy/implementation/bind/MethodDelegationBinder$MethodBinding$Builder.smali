.class public Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;
    }
.end annotation


# instance fields
.field private final candidate:Lnet/bytebuddy/description/method/MethodDescription;

.field private final methodInvoker:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodInvoker;

.field private nextParameterIndex:I

.field private final parameterStackManipulations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            ">;"
        }
    .end annotation
.end field

.field private final registeredTargetIndices:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodInvoker;Lnet/bytebuddy/description/method/MethodDescription;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder;->methodInvoker:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodInvoker;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder;->candidate:Lnet/bytebuddy/description/method/MethodDescription;

    .line 7
    .line 8
    new-instance p1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder;->parameterStackManipulations:Ljava/util/List;

    .line 22
    .line 23
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder;->registeredTargetIndices:Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    iput p1, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder;->nextParameterIndex:I

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public append(Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder;->parameterStackManipulations:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder;->registeredTargetIndices:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-interface {p1}, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$ParameterBinding;->getIdentificationToken()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget v1, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder;->nextParameterIndex:I

    .line 13
    .line 14
    add-int/lit8 v2, v1, 0x1

    .line 15
    .line 16
    iput v2, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder;->nextParameterIndex:I

    .line 17
    .line 18
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {v0, p1, p0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-nez p0, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_0
    const/4 p0, 0x0

    .line 31
    return p0
.end method

.method public build(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding;
    .locals 8

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder;->candidate:Lnet/bytebuddy/description/method/MethodDescription;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v1, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder;->nextParameterIndex:I

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    new-instance v2, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;

    .line 16
    .line 17
    iget-object v3, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder;->candidate:Lnet/bytebuddy/description/method/MethodDescription;

    .line 18
    .line 19
    iget-object v4, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder;->registeredTargetIndices:Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    iget-object v0, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder;->methodInvoker:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodInvoker;

    .line 22
    .line 23
    invoke-interface {v0, v3}, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodInvoker;->invoke(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    iget-object v6, p0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder;->parameterStackManipulations:Ljava/util/List;

    .line 28
    .line 29
    move-object v7, p1

    .line 30
    invoke-direct/range {v2 .. v7}, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding$Builder$Build;-><init>(Lnet/bytebuddy/description/method/MethodDescription;Ljava/util/Map;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Ljava/util/List;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 31
    .line 32
    .line 33
    return-object v2

    .line 34
    :cond_0
    const-string p0, "The number of parameters bound does not equal the target\'s number of parameters"

    .line 35
    .line 36
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    return-object p0
.end method
