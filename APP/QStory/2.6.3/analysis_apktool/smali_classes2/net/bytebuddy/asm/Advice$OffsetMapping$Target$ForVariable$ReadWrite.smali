.class public Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadWrite;
.super Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;
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
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDefinition;I)V
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, v0, v0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadWrite;-><init>(Lnet/bytebuddy/description/type/TypeDefinition;ILnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDefinition;ILnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;-><init>(Lnet/bytebuddy/description/type/TypeDefinition;ILnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 8
    iput-object p4, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadWrite;->writeAssignment:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

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
    invoke-super {p0, p1}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadWrite;->writeAssignment:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadWrite;

    .line 30
    .line 31
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadWrite;->writeAssignment:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

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
    invoke-super {p0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadWrite;->writeAssignment:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

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
    .locals 5

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;->typeDefinition:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;->typeDefinition:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 12
    .line 13
    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;->offset:I

    .line 18
    .line 19
    invoke-virtual {v0, p0, p1}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->increment(II)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    new-instance p1, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 25
    .line 26
    invoke-virtual {p0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;->resolveRead()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {p0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadWrite;->resolveWrite()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const/4 v3, 0x4

    .line 40
    new-array v3, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    aput-object v0, v3, v4

    .line 44
    .line 45
    aput-object v2, v3, v1

    .line 46
    .line 47
    sget-object v0, Lnet/bytebuddy/implementation/bytecode/Addition;->INTEGER:Lnet/bytebuddy/implementation/bytecode/Addition;

    .line 48
    .line 49
    const/4 v1, 0x2

    .line 50
    aput-object v0, v3, v1

    .line 51
    .line 52
    const/4 v0, 0x3

    .line 53
    aput-object p0, v3, v0

    .line 54
    .line 55
    invoke-direct {p1, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 56
    .line 57
    .line 58
    return-object p1
.end method

.method public resolveWrite()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 4

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadWrite;->writeAssignment:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;->typeDefinition:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 6
    .line 7
    invoke-static {v2}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;->offset:I

    .line 12
    .line 13
    invoke-virtual {v2, p0}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->storeAt(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/4 v2, 0x2

    .line 18
    new-array v2, v2, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    aput-object v1, v2, v3

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    aput-object p0, v2, v1

    .line 25
    .line 26
    invoke-direct {v0, v2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method
