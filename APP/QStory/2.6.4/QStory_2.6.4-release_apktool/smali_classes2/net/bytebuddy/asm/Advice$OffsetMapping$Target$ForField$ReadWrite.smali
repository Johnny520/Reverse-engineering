.class public Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$ReadWrite;
.super Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ReadWrite"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final writeAssignment:Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/field/FieldDescription;)V
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;

    .line 2
    .line 3
    invoke-direct {p0, p1, v0, v0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$ReadWrite;-><init>(Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField;-><init>(Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$ReadWrite;->writeAssignment:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

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
    invoke-super {p0, p1}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    if-ne p0, p1, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    if-nez p1, :cond_2

    .line 14
    .line 15
    return v1

    .line 16
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-eq v2, v3, :cond_3

    .line 25
    .line 26
    return v1

    .line 27
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$ReadWrite;->writeAssignment:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$ReadWrite;

    .line 30
    .line 31
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$ReadWrite;->writeAssignment:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$ReadWrite;->writeAssignment:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    add-int/2addr p0, v0

    .line 14
    return p0
.end method

.method public resolveIncrement(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 4

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField;->resolveRead()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {p1}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$ReadWrite;->resolveWrite()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 v2, 0x4

    .line 16
    new-array v2, v2, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    aput-object v1, v2, v3

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    aput-object p1, v2, v1

    .line 23
    .line 24
    sget-object p1, Lnet/bytebuddy/implementation/bytecode/Addition;->INTEGER:Lnet/bytebuddy/implementation/bytecode/Addition;

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    aput-object p1, v2, v1

    .line 28
    .line 29
    const/4 p1, 0x3

    .line 30
    aput-object p0, v2, p1

    .line 31
    .line 32
    invoke-direct {v0, v2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method public resolveWrite()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 8

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x3

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 17
    .line 18
    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    sget-object v6, Lnet/bytebuddy/implementation/bytecode/Duplication;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Duplication;

    .line 23
    .line 24
    iget-object v7, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    .line 25
    .line 26
    invoke-interface {v7}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    invoke-virtual {v6, v7}, Lnet/bytebuddy/implementation/bytecode/Duplication;->flipOver(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    new-array v7, v4, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 35
    .line 36
    aput-object v5, v7, v3

    .line 37
    .line 38
    aput-object v6, v7, v2

    .line 39
    .line 40
    sget-object v5, Lnet/bytebuddy/implementation/bytecode/Removal;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Removal;

    .line 41
    .line 42
    aput-object v5, v7, v1

    .line 43
    .line 44
    invoke-direct {v0, v7}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    new-instance v5, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 48
    .line 49
    iget-object v6, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField$ReadWrite;->writeAssignment:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 50
    .line 51
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    .line 52
    .line 53
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-interface {p0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->write()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    new-array v4, v4, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 62
    .line 63
    aput-object v6, v4, v3

    .line 64
    .line 65
    aput-object v0, v4, v2

    .line 66
    .line 67
    aput-object p0, v4, v1

    .line 68
    .line 69
    invoke-direct {v5, v4}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 70
    .line 71
    .line 72
    return-object v5
.end method
