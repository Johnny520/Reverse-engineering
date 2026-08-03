.class public Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$WriteOnly;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WriteOnly"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

.field private final writeAssignment:Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$WriteOnly;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$WriteOnly;->writeAssignment:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$WriteOnly;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    check-cast p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$WriteOnly;

    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$WriteOnly;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$WriteOnly;->writeAssignment:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$WriteOnly;->writeAssignment:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$WriteOnly;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$WriteOnly;->writeAssignment:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public resolveIncrement(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot increment write-only field value"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public resolveRead()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot read write-only field value"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public resolveWrite()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 8

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x3

    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$WriteOnly;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    invoke-interface {v4}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v4, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;

    goto :goto_0

    :cond_0
    new-instance v4, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v5

    sget-object v6, Lnet/bytebuddy/implementation/bytecode/Duplication;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Duplication;

    iget-object v7, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$WriteOnly;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    invoke-interface {v7}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v7

    invoke-virtual {v6, v7}, Lnet/bytebuddy/implementation/bytecode/Duplication;->flipOver(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v6

    new-array v7, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    aput-object v5, v7, v2

    aput-object v6, v7, v1

    sget-object v5, Lnet/bytebuddy/implementation/bytecode/Removal;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Removal;

    aput-object v5, v7, v0

    invoke-direct {v4, v7}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    :goto_0
    new-instance v5, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    iget-object v6, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$WriteOnly;->writeAssignment:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    iget-object v7, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$WriteOnly;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    invoke-static {v7}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    move-result-object v7

    invoke-interface {v7}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->write()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v7

    new-array v3, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    aput-object v6, v3, v2

    aput-object v4, v3, v1

    aput-object v7, v3, v0

    invoke-direct {v5, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    return-object v5
.end method
