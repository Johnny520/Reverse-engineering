.class public Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader;
.implements Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ArgumentProvider;
.implements Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForStackManipulation"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

.field private final typeDefinition:Lnet/bytebuddy/description/type/TypeDefinition;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Ljava/lang/reflect/Type;)V
    .locals 0

    .line 1
    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDefinition;)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDefinition;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 4
    iput-object p2, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;->typeDefinition:Lnet/bytebuddy/description/type/TypeDefinition;

    return-void
.end method

.method public static of(Ljava/lang/Object;)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$Factory;
    .locals 2
    .param p0    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    if-nez p0, :cond_0

    sget-object p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForNullConstant;->INSTANCE:Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForNullConstant;

    return-object p0

    :cond_0
    invoke-static {p0}, Lnet/bytebuddy/utility/ConstantValue$Simple;->wrapOrNull(Ljava/lang/Object;)Lnet/bytebuddy/utility/ConstantValue;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForInstance$Factory;

    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForInstance$Factory;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;

    invoke-interface {v0}, Lnet/bytebuddy/utility/ConstantValue;->toStackManipulation()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v1

    invoke-interface {v0}, Lnet/bytebuddy/utility/ConstantValue;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDefinition;)V

    move-object v0, p0

    :goto_0
    return-object v0
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
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    check-cast p1, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;

    iget-object v3, p1, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;->typeDefinition:Lnet/bytebuddy/description/type/TypeDefinition;

    iget-object p1, p1, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;->typeDefinition:Lnet/bytebuddy/description/type/TypeDefinition;

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

    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;->typeDefinition:Lnet/bytebuddy/description/type/TypeDefinition;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public make(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ArgumentProvider;
    .locals 0

    return-object p0
.end method

.method public prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    return-object p1
.end method

.method public resolve(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/method/MethodDescription;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ")",
            "Ljava/util/List<",
            "Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public toStackManipulation(Lnet/bytebuddy/description/method/ParameterDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 2

    iget-object v0, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;->typeDefinition:Lnet/bytebuddy/description/type/TypeDefinition;

    invoke-interface {v0}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v0

    invoke-interface {p1}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v1

    invoke-interface {p2, v0, v1, p3}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p2

    invoke-interface {p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    move-result p3

    if-eqz p3, :cond_0

    new-instance p1, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    iget-object p3, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    const/4 v0, 0x2

    new-array v0, v0, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    const/4 v1, 0x0

    aput-object p3, v0, v1

    const/4 p3, 0x1

    aput-object p2, v0, p3

    invoke-direct {p1, v0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    return-object p1

    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Cannot assign "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " to "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lnet/bytebuddy/implementation/MethodCall$ArgumentLoader$ForStackManipulation;->typeDefinition:Lnet/bytebuddy/description/type/TypeDefinition;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
