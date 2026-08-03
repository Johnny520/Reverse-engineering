.class public Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$OfFieldValue;
.super Lnet/bytebuddy/implementation/FieldAccessor$ForSetter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/FieldAccessor$ForSetter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OfFieldValue"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/implementation/FieldAccessor$ForSetter<",
        "Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;",
        ">;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final target:Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$TerminationHandler;Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter;-><init>(Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$TerminationHandler;)V

    iput-object p5, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$OfFieldValue;->target:Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation;

    return-void
.end method


# virtual methods
.method public andThen(Lnet/bytebuddy/implementation/Implementation$Composable;)Lnet/bytebuddy/implementation/Implementation$Composable;
    .locals 8

    .line 2
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;

    new-instance v7, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$OfFieldValue;

    iget-object v2, p0, Lnet/bytebuddy/implementation/FieldAccessor;->fieldLocation:Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation;

    iget-object v3, p0, Lnet/bytebuddy/implementation/FieldAccessor;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v4, p0, Lnet/bytebuddy/implementation/FieldAccessor;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    sget-object v5, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$TerminationHandler;->NON_OPERATIONAL:Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$TerminationHandler;

    iget-object v6, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$OfFieldValue;->target:Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation;

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$OfFieldValue;-><init>(Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$TerminationHandler;Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation;)V

    invoke-direct {v0, v7, p1}, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;-><init>(Lnet/bytebuddy/implementation/Implementation;Lnet/bytebuddy/implementation/Implementation$Composable;)V

    return-object v0
.end method

.method public andThen(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/implementation/Implementation;
    .locals 8

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Compound;

    new-instance v7, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$OfFieldValue;

    iget-object v2, p0, Lnet/bytebuddy/implementation/FieldAccessor;->fieldLocation:Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation;

    iget-object v3, p0, Lnet/bytebuddy/implementation/FieldAccessor;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object v4, p0, Lnet/bytebuddy/implementation/FieldAccessor;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    sget-object v5, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$TerminationHandler;->NON_OPERATIONAL:Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$TerminationHandler;

    iget-object v6, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$OfFieldValue;->target:Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation;

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$OfFieldValue;-><init>(Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$TerminationHandler;Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation;)V

    const/4 v1, 0x2

    new-array v1, v1, [Lnet/bytebuddy/implementation/Implementation;

    const/4 v2, 0x0

    aput-object v7, v1, v2

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/Implementation$Compound;-><init>([Lnet/bytebuddy/implementation/Implementation;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-ne p0, p1, :cond_1

    return v0

    :cond_1
    if-nez p1, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$OfFieldValue;->target:Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation;

    check-cast p1, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$OfFieldValue;

    iget-object p1, p1, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$OfFieldValue;->target:Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-super {p0}, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$OfFieldValue;->target:Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic initialize(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$OfFieldValue;->initialize(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;

    move-result-object p1

    return-object p1
.end method

.method public initialize(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;
    .locals 1

    .line 2
    iget-object v0, p0, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$OfFieldValue;->target:Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation;

    invoke-interface {v0, p1}, Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation;->prepare(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;

    move-result-object p1

    return-object p1
.end method

.method public prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    return-object p1
.end method

.method public bridge synthetic resolve(Ljava/lang/Object;Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "Expects its own initialized value as argument"
        value = {
            "NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE"
        }
    .end annotation

    .line 1
    check-cast p1, Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;

    invoke-virtual {p0, p1, p2, p3, p4}, Lnet/bytebuddy/implementation/FieldAccessor$ForSetter$OfFieldValue;->resolve(Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p1

    return-object p1
.end method

.method public resolve(Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 3
    .param p1    # Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
        justification = "Expects its own initialized value as argument"
        value = {
            "NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE"
        }
    .end annotation

    .line 2
    invoke-interface {p1, p4}, Lnet/bytebuddy/implementation/FieldAccessor$FieldLocation$Prepared;->resolve(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/description/field/FieldDescription;

    move-result-object p1

    .line 3
    invoke-interface {p1}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    move-result p3

    if-nez p3, :cond_1

    invoke-interface {p4}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    move-result p3

    if-nez p3, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Cannot set instance field "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " from "

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :cond_1
    :goto_0
    new-instance p3, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 6
    invoke-interface {p1}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    move-result p4

    if-eqz p4, :cond_2

    sget-object p4, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;

    goto :goto_1

    .line 7
    :cond_2
    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p4

    .line 8
    :goto_1
    invoke-static {p1}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    move-result-object v0

    invoke-interface {v0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->read()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v0

    iget-object v1, p0, Lnet/bytebuddy/implementation/FieldAccessor;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 9
    invoke-interface {p1}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p1

    invoke-interface {p2}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p2

    iget-object v2, p0, Lnet/bytebuddy/implementation/FieldAccessor;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-interface {v1, p1, p2, v2}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p1

    const/4 p2, 0x3

    new-array p2, p2, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    const/4 v1, 0x0

    aput-object p4, p2, v1

    const/4 p4, 0x1

    aput-object v0, p2, p4

    const/4 p4, 0x2

    aput-object p1, p2, p4

    invoke-direct {p3, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    return-object p3
.end method
