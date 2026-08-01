.class public abstract Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;
.implements Lnet/bytebuddy/description/ModifierReviewable$ForFieldDescription;
.implements Lnet/bytebuddy/description/ModifierReviewable$ForMethodDescription;
.implements Lnet/bytebuddy/description/ModifierReviewable$ForParameterDescription;
.implements Lnet/bytebuddy/description/ModifierReviewable$ForModuleDescription;
.implements Lnet/bytebuddy/description/ModifierReviewable$ForModuleRequirement;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/ModifierReviewable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AbstractBase"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private matchesMask(I)Z
    .locals 0

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    and-int/2addr p0, p1

    .line 6
    if-ne p0, p1, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method


# virtual methods
.method public getEnumerationState()Lnet/bytebuddy/description/modifier/EnumerationState;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isEnum()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lnet/bytebuddy/description/modifier/EnumerationState;->ENUMERATION:Lnet/bytebuddy/description/modifier/EnumerationState;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object p0, Lnet/bytebuddy/description/modifier/EnumerationState;->PLAIN:Lnet/bytebuddy/description/modifier/EnumerationState;

    .line 11
    .line 12
    return-object p0
.end method

.method public getFieldManifestation()Lnet/bytebuddy/description/modifier/FieldManifestation;
    .locals 2

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    and-int/lit8 v0, p0, 0x50

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    const/16 v1, 0x10

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    const/16 v1, 0x40

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    sget-object p0, Lnet/bytebuddy/description/modifier/FieldManifestation;->VOLATILE:Lnet/bytebuddy/description/modifier/FieldManifestation;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    const-string v0, "Unexpected modifiers: "

    .line 21
    .line 22
    invoke-static {p0, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return-object p0

    .line 31
    :cond_1
    sget-object p0, Lnet/bytebuddy/description/modifier/FieldManifestation;->FINAL:Lnet/bytebuddy/description/modifier/FieldManifestation;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    sget-object p0, Lnet/bytebuddy/description/modifier/FieldManifestation;->PLAIN:Lnet/bytebuddy/description/modifier/FieldManifestation;

    .line 35
    .line 36
    return-object p0
.end method

.method public getFieldPersistence()Lnet/bytebuddy/description/modifier/FieldPersistence;
    .locals 2

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    and-int/lit16 v0, p0, 0x80

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const/16 v1, 0x80

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    sget-object p0, Lnet/bytebuddy/description/modifier/FieldPersistence;->TRANSIENT:Lnet/bytebuddy/description/modifier/FieldPersistence;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string v0, "Unexpected modifiers: "

    .line 17
    .line 18
    invoke-static {p0, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0

    .line 27
    :cond_1
    sget-object p0, Lnet/bytebuddy/description/modifier/FieldPersistence;->PLAIN:Lnet/bytebuddy/description/modifier/FieldPersistence;

    .line 28
    .line 29
    return-object p0
.end method

.method public getMandate()Lnet/bytebuddy/description/modifier/Mandate;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isMandated()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lnet/bytebuddy/description/modifier/Mandate;->MANDATED:Lnet/bytebuddy/description/modifier/Mandate;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object p0, Lnet/bytebuddy/description/modifier/Mandate;->PLAIN:Lnet/bytebuddy/description/modifier/Mandate;

    .line 11
    .line 12
    return-object p0
.end method

.method public getMethodManifestation()Lnet/bytebuddy/description/modifier/MethodManifestation;
    .locals 2

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    and-int/lit16 v0, p0, 0x550

    .line 6
    .line 7
    if-eqz v0, :cond_6

    .line 8
    .line 9
    const/16 v1, 0x10

    .line 10
    .line 11
    if-eq v0, v1, :cond_5

    .line 12
    .line 13
    const/16 v1, 0x40

    .line 14
    .line 15
    if-eq v0, v1, :cond_4

    .line 16
    .line 17
    const/16 v1, 0x50

    .line 18
    .line 19
    if-eq v0, v1, :cond_3

    .line 20
    .line 21
    const/16 v1, 0x100

    .line 22
    .line 23
    if-eq v0, v1, :cond_2

    .line 24
    .line 25
    const/16 v1, 0x110

    .line 26
    .line 27
    if-eq v0, v1, :cond_1

    .line 28
    .line 29
    const/16 v1, 0x400

    .line 30
    .line 31
    if-ne v0, v1, :cond_0

    .line 32
    .line 33
    sget-object p0, Lnet/bytebuddy/description/modifier/MethodManifestation;->ABSTRACT:Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_0
    const-string v0, "Unexpected modifiers: "

    .line 37
    .line 38
    invoke-static {p0, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_1
    sget-object p0, Lnet/bytebuddy/description/modifier/MethodManifestation;->FINAL_NATIVE:Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_2
    sget-object p0, Lnet/bytebuddy/description/modifier/MethodManifestation;->NATIVE:Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_3
    sget-object p0, Lnet/bytebuddy/description/modifier/MethodManifestation;->FINAL_BRIDGE:Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_4
    sget-object p0, Lnet/bytebuddy/description/modifier/MethodManifestation;->BRIDGE:Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_5
    sget-object p0, Lnet/bytebuddy/description/modifier/MethodManifestation;->FINAL:Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_6
    sget-object p0, Lnet/bytebuddy/description/modifier/MethodManifestation;->PLAIN:Lnet/bytebuddy/description/modifier/MethodManifestation;

    .line 63
    .line 64
    return-object p0
.end method

.method public getMethodStrictness()Lnet/bytebuddy/description/modifier/MethodStrictness;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isStrict()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lnet/bytebuddy/description/modifier/MethodStrictness;->STRICT:Lnet/bytebuddy/description/modifier/MethodStrictness;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object p0, Lnet/bytebuddy/description/modifier/MethodStrictness;->PLAIN:Lnet/bytebuddy/description/modifier/MethodStrictness;

    .line 11
    .line 12
    return-object p0
.end method

.method public getOpenness()Lnet/bytebuddy/description/modifier/Openness;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isOpen()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lnet/bytebuddy/description/modifier/Openness;->OPEN:Lnet/bytebuddy/description/modifier/Openness;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object p0, Lnet/bytebuddy/description/modifier/Openness;->CLOSED:Lnet/bytebuddy/description/modifier/Openness;

    .line 11
    .line 12
    return-object p0
.end method

.method public getOwnership()Lnet/bytebuddy/description/modifier/Ownership;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isStatic()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lnet/bytebuddy/description/modifier/Ownership;->STATIC:Lnet/bytebuddy/description/modifier/Ownership;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object p0, Lnet/bytebuddy/description/modifier/Ownership;->MEMBER:Lnet/bytebuddy/description/modifier/Ownership;

    .line 11
    .line 12
    return-object p0
.end method

.method public getParameterManifestation()Lnet/bytebuddy/description/modifier/ParameterManifestation;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isFinal()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lnet/bytebuddy/description/modifier/ParameterManifestation;->FINAL:Lnet/bytebuddy/description/modifier/ParameterManifestation;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object p0, Lnet/bytebuddy/description/modifier/ParameterManifestation;->PLAIN:Lnet/bytebuddy/description/modifier/ParameterManifestation;

    .line 11
    .line 12
    return-object p0
.end method

.method public getProvisioningState()Lnet/bytebuddy/description/modifier/ProvisioningState;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isMandated()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lnet/bytebuddy/description/modifier/ProvisioningState;->MANDATED:Lnet/bytebuddy/description/modifier/ProvisioningState;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object p0, Lnet/bytebuddy/description/modifier/ProvisioningState;->PLAIN:Lnet/bytebuddy/description/modifier/ProvisioningState;

    .line 11
    .line 12
    return-object p0
.end method

.method public getRequiredPhase()Lnet/bytebuddy/description/modifier/RequiredPhase;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isStaticPhase()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lnet/bytebuddy/description/modifier/RequiredPhase;->STATIC:Lnet/bytebuddy/description/modifier/RequiredPhase;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object p0, Lnet/bytebuddy/description/modifier/RequiredPhase;->ALWAYS:Lnet/bytebuddy/description/modifier/RequiredPhase;

    .line 11
    .line 12
    return-object p0
.end method

.method public getSynchronizationState()Lnet/bytebuddy/description/modifier/SynchronizationState;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isSynchronized()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lnet/bytebuddy/description/modifier/SynchronizationState;->SYNCHRONIZED:Lnet/bytebuddy/description/modifier/SynchronizationState;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object p0, Lnet/bytebuddy/description/modifier/SynchronizationState;->PLAIN:Lnet/bytebuddy/description/modifier/SynchronizationState;

    .line 11
    .line 12
    return-object p0
.end method

.method public getSyntheticState()Lnet/bytebuddy/description/modifier/SyntheticState;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isSynthetic()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lnet/bytebuddy/description/modifier/SyntheticState;->SYNTHETIC:Lnet/bytebuddy/description/modifier/SyntheticState;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object p0, Lnet/bytebuddy/description/modifier/SyntheticState;->PLAIN:Lnet/bytebuddy/description/modifier/SyntheticState;

    .line 11
    .line 12
    return-object p0
.end method

.method public getTransitivity()Lnet/bytebuddy/description/modifier/Transitivity;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isTransitive()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lnet/bytebuddy/description/modifier/Transitivity;->TRANSITIVE:Lnet/bytebuddy/description/modifier/Transitivity;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object p0, Lnet/bytebuddy/description/modifier/Transitivity;->NONE:Lnet/bytebuddy/description/modifier/Transitivity;

    .line 11
    .line 12
    return-object p0
.end method

.method public getTypeManifestation()Lnet/bytebuddy/description/modifier/TypeManifestation;
    .locals 2

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    and-int/lit16 v0, p0, 0x2610

    .line 6
    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    const/16 v1, 0x10

    .line 10
    .line 11
    if-eq v0, v1, :cond_3

    .line 12
    .line 13
    const/16 v1, 0x400

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    const/16 v1, 0x600

    .line 18
    .line 19
    if-eq v0, v1, :cond_1

    .line 20
    .line 21
    const/16 v1, 0x2600

    .line 22
    .line 23
    if-ne v0, v1, :cond_0

    .line 24
    .line 25
    sget-object p0, Lnet/bytebuddy/description/modifier/TypeManifestation;->ANNOTATION:Lnet/bytebuddy/description/modifier/TypeManifestation;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_0
    const-string v0, "Unexpected modifiers: "

    .line 29
    .line 30
    invoke-static {p0, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    return-object p0

    .line 39
    :cond_1
    sget-object p0, Lnet/bytebuddy/description/modifier/TypeManifestation;->INTERFACE:Lnet/bytebuddy/description/modifier/TypeManifestation;

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_2
    sget-object p0, Lnet/bytebuddy/description/modifier/TypeManifestation;->ABSTRACT:Lnet/bytebuddy/description/modifier/TypeManifestation;

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_3
    sget-object p0, Lnet/bytebuddy/description/modifier/TypeManifestation;->FINAL:Lnet/bytebuddy/description/modifier/TypeManifestation;

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_4
    sget-object p0, Lnet/bytebuddy/description/modifier/TypeManifestation;->PLAIN:Lnet/bytebuddy/description/modifier/TypeManifestation;

    .line 49
    .line 50
    return-object p0
.end method

.method public getVisibility()Lnet/bytebuddy/description/modifier/Visibility;
    .locals 2

    .line 1
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    and-int/lit8 v0, p0, 0x7

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_2

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    sget-object p0, Lnet/bytebuddy/description/modifier/Visibility;->PROTECTED:Lnet/bytebuddy/description/modifier/Visibility;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    const-string v0, "Unexpected modifiers: "

    .line 22
    .line 23
    invoke-static {p0, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return-object p0

    .line 32
    :cond_1
    sget-object p0, Lnet/bytebuddy/description/modifier/Visibility;->PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_2
    sget-object p0, Lnet/bytebuddy/description/modifier/Visibility;->PUBLIC:Lnet/bytebuddy/description/modifier/Visibility;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_3
    sget-object p0, Lnet/bytebuddy/description/modifier/Visibility;->PACKAGE_PRIVATE:Lnet/bytebuddy/description/modifier/Visibility;

    .line 39
    .line 40
    return-object p0
.end method

.method public isAbstract()Z
    .locals 1

    .line 1
    const/16 v0, 0x400

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->matchesMask(I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isAnnotation()Z
    .locals 1

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->matchesMask(I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isBridge()Z
    .locals 1

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->matchesMask(I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isDeprecated()Z
    .locals 1

    .line 1
    const/high16 v0, 0x20000

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->matchesMask(I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isEnum()Z
    .locals 1

    .line 1
    const/16 v0, 0x4000

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->matchesMask(I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isFinal()Z
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->matchesMask(I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isInterface()Z
    .locals 1

    .line 1
    const/16 v0, 0x200

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->matchesMask(I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isMandated()Z
    .locals 1

    .line 1
    const v0, 0x8000

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->matchesMask(I)Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public isNative()Z
    .locals 1

    .line 1
    const/16 v0, 0x100

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->matchesMask(I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isOpen()Z
    .locals 1

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->matchesMask(I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isPackagePrivate()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isPublic()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isProtected()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->isPrivate()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public isPrivate()Z
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->matchesMask(I)Z

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
.end method

.method public isProtected()Z
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->matchesMask(I)Z

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
.end method

.method public isPublic()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->matchesMask(I)Z

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
.end method

.method public isStatic()Z
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->matchesMask(I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isStaticPhase()Z
    .locals 1

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->matchesMask(I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isStrict()Z
    .locals 1

    .line 1
    const/16 v0, 0x800

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->matchesMask(I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isSynchronized()Z
    .locals 1

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->matchesMask(I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isSynthetic()Z
    .locals 1

    .line 1
    const/16 v0, 0x1000

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->matchesMask(I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isTransient()Z
    .locals 1

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->matchesMask(I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isTransitive()Z
    .locals 1

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->matchesMask(I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isVarArgs()Z
    .locals 1

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->matchesMask(I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isVolatile()Z
    .locals 1

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/ModifierReviewable$AbstractBase;->matchesMask(I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
