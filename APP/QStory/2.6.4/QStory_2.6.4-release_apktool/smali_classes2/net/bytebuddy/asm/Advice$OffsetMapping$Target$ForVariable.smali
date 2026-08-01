.class public abstract Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ForVariable"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadWrite;,
        Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadOnly;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field protected final offset:I

.field protected final readAssignment:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

.field protected final typeDefinition:Lnet/bytebuddy/description/type/TypeDefinition;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDefinition;ILnet/bytebuddy/implementation/bytecode/StackManipulation;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;->typeDefinition:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 5
    .line 6
    iput p2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;->offset:I

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;->readAssignment:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 9
    .line 10
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
    iget v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;->offset:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;

    .line 23
    .line 24
    iget v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;->offset:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;->typeDefinition:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;->typeDefinition:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;->readAssignment:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 41
    .line 42
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;->readAssignment:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

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
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;->typeDefinition:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget v0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;->offset:I

    .line 21
    .line 22
    add-int/2addr v1, v0

    .line 23
    mul-int/lit8 v1, v1, 0x1f

    .line 24
    .line 25
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;->readAssignment:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    add-int/2addr p0, v1

    .line 32
    return p0
.end method

.method public resolveRead()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 4

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;->typeDefinition:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 4
    .line 5
    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;->offset:I

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;->readAssignment:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 16
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
