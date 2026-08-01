.class public Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldGetterDelegation;
.super Lnet/bytebuddy/implementation/Implementation$Context$Default$DelegationRecord;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/Implementation$Context$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FieldGetterDelegation"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;


# direct methods
.method private constructor <init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/modifier/Visibility;Lnet/bytebuddy/description/field/FieldDescription;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/implementation/Implementation$Context$Default$DelegationRecord;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/modifier/Visibility;)V

    .line 15
    iput-object p3, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldGetterDelegation;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;Lnet/bytebuddy/description/field/FieldDescription;)V
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldGetter;

    .line 2
    .line 3
    invoke-direct {v0, p1, p4, p2}, Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldGetter;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/field/FieldDescription;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3}, Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;->getVisibility()Lnet/bytebuddy/description/modifier/Visibility;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-direct {p0, v0, p1, p4}, Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldGetterDelegation;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/modifier/Visibility;Lnet/bytebuddy/description/field/FieldDescription;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 5

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldGetterDelegation;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    .line 4
    .line 5
    invoke-interface {v1}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object v1, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    iget-object v2, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldGetterDelegation;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    .line 19
    .line 20
    invoke-static {v2}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v2}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->read()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldGetterDelegation;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    .line 29
    .line 30
    invoke-interface {p0}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const/4 v3, 0x3

    .line 39
    new-array v3, v3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    aput-object v1, v3, v4

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    aput-object v2, v3, v1

    .line 46
    .line 47
    const/4 v1, 0x2

    .line 48
    aput-object p0, v3, v1

    .line 49
    .line 50
    invoke-direct {v0, v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    new-instance p1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 58
    .line 59
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    invoke-direct {p1, p0, p2}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 68
    .line 69
    .line 70
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/implementation/Implementation$Context$Default$DelegationRecord;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldGetterDelegation;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldGetterDelegation;

    .line 30
    .line 31
    iget-object p1, p1, Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldGetterDelegation;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

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
    invoke-super {p0}, Lnet/bytebuddy/implementation/Implementation$Context$Default$DelegationRecord;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldGetterDelegation;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

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

.method public with(Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;)Lnet/bytebuddy/implementation/Implementation$Context$Default$DelegationRecord;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldGetterDelegation;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default$DelegationRecord;->methodDescription:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default$DelegationRecord;->visibility:Lnet/bytebuddy/description/modifier/Visibility;

    .line 6
    .line 7
    invoke-virtual {p1}, Lnet/bytebuddy/implementation/MethodAccessorFactory$AccessType;->getVisibility()Lnet/bytebuddy/description/modifier/Visibility;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {v2, p1}, Lnet/bytebuddy/description/modifier/Visibility;->expandTo(Lnet/bytebuddy/description/modifier/Visibility;)Lnet/bytebuddy/description/modifier/Visibility;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldGetterDelegation;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    .line 16
    .line 17
    invoke-direct {v0, v1, p1, p0}, Lnet/bytebuddy/implementation/Implementation$Context$Default$FieldGetterDelegation;-><init>(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/modifier/Visibility;Lnet/bytebuddy/description/field/FieldDescription;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method
