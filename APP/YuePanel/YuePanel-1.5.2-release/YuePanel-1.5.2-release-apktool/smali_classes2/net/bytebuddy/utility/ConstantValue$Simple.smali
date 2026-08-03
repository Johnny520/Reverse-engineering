.class public Lnet/bytebuddy/utility/ConstantValue$Simple;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/utility/ConstantValue;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/ConstantValue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Simple"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

.field private final typeDescription:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/utility/ConstantValue$Simple;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    iput-object p2, p0, Lnet/bytebuddy/utility/ConstantValue$Simple;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    return-void
.end method

.method public static wrap(Ljava/lang/Object;)Lnet/bytebuddy/utility/ConstantValue;
    .locals 3

    invoke-static {p0}, Lnet/bytebuddy/utility/ConstantValue$Simple;->wrapOrNull(Ljava/lang/Object;)Lnet/bytebuddy/utility/ConstantValue;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Not a constant value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static wrapOrNull(Ljava/lang/Object;)Lnet/bytebuddy/utility/ConstantValue;
    .locals 2
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    instance-of v0, p0, Lnet/bytebuddy/utility/ConstantValue;

    if-eqz v0, :cond_0

    check-cast p0, Lnet/bytebuddy/utility/ConstantValue;

    return-object p0

    :cond_0
    instance-of v0, p0, Lnet/bytebuddy/description/type/TypeDescription;

    const-class v1, Ljava/lang/Class;

    if-eqz v0, :cond_2

    check-cast p0, Lnet/bytebuddy/description/type/TypeDescription;

    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lnet/bytebuddy/utility/ConstantValue$Simple;

    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p0

    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/utility/ConstantValue$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)V

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_2
    instance-of v0, p0, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    if-eqz v0, :cond_3

    new-instance v0, Lnet/bytebuddy/utility/ConstantValue$Simple;

    check-cast p0, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forEnumeration(Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v1

    invoke-interface {p0}, Lnet/bytebuddy/description/enumeration/EnumerationDescription;->getEnumerationType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/utility/ConstantValue$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)V

    return-object v0

    :cond_3
    instance-of v0, p0, Ljava/lang/Boolean;

    if-eqz v0, :cond_4

    new-instance v0, Lnet/bytebuddy/utility/ConstantValue$Simple;

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(Z)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p0

    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/utility/ConstantValue$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)V

    return-object v0

    :cond_4
    instance-of v0, p0, Ljava/lang/Byte;

    if-eqz v0, :cond_5

    new-instance v0, Lnet/bytebuddy/utility/ConstantValue$Simple;

    check-cast p0, Ljava/lang/Byte;

    invoke-virtual {p0}, Ljava/lang/Byte;->byteValue()B

    move-result p0

    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p0

    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/utility/ConstantValue$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)V

    return-object v0

    :cond_5
    instance-of v0, p0, Ljava/lang/Short;

    if-eqz v0, :cond_6

    new-instance v0, Lnet/bytebuddy/utility/ConstantValue$Simple;

    check-cast p0, Ljava/lang/Short;

    invoke-virtual {p0}, Ljava/lang/Short;->shortValue()S

    move-result p0

    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p0

    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/utility/ConstantValue$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)V

    return-object v0

    :cond_6
    instance-of v0, p0, Ljava/lang/Character;

    if-eqz v0, :cond_7

    new-instance v0, Lnet/bytebuddy/utility/ConstantValue$Simple;

    check-cast p0, Ljava/lang/Character;

    invoke-virtual {p0}, Ljava/lang/Character;->charValue()C

    move-result p0

    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p0

    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/utility/ConstantValue$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)V

    return-object v0

    :cond_7
    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_9

    check-cast p0, Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-eqz v0, :cond_8

    new-instance v0, Lnet/bytebuddy/utility/ConstantValue$Simple;

    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p0

    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/utility/ConstantValue$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)V

    goto :goto_1

    :cond_8
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_9
    instance-of v0, p0, Ljava/lang/Enum;

    if-eqz v0, :cond_a

    new-instance v0, Lnet/bytebuddy/utility/ConstantValue$Simple;

    new-instance v1, Lnet/bytebuddy/description/enumeration/EnumerationDescription$ForLoadedEnumeration;

    check-cast p0, Ljava/lang/Enum;

    invoke-direct {v1, p0}, Lnet/bytebuddy/description/enumeration/EnumerationDescription$ForLoadedEnumeration;-><init>(Ljava/lang/Enum;)V

    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forEnumeration(Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Enum;->getDeclaringClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/utility/ConstantValue$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)V

    return-object v0

    :cond_a
    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofLoadedOrNull(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    move-result-object p0

    return-object p0
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
    iget-object v2, p0, Lnet/bytebuddy/utility/ConstantValue$Simple;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    check-cast p1, Lnet/bytebuddy/utility/ConstantValue$Simple;

    iget-object v3, p1, Lnet/bytebuddy/utility/ConstantValue$Simple;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/utility/ConstantValue$Simple;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    iget-object p1, p1, Lnet/bytebuddy/utility/ConstantValue$Simple;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    return v0
.end method

.method public getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 1

    iget-object v0, p0, Lnet/bytebuddy/utility/ConstantValue$Simple;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/utility/ConstantValue$Simple;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/utility/ConstantValue$Simple;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toStackManipulation()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    iget-object v0, p0, Lnet/bytebuddy/utility/ConstantValue$Simple;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    return-object v0
.end method
