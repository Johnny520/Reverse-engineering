.class public abstract Lnet/bytebuddy/implementation/FixedValue;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/implementation/Implementation;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/FixedValue$ForValue;,
        Lnet/bytebuddy/implementation/FixedValue$ForConstantValue;,
        Lnet/bytebuddy/implementation/FixedValue$ForArgument;,
        Lnet/bytebuddy/implementation/FixedValue$ForThisValue;,
        Lnet/bytebuddy/implementation/FixedValue$ForOriginType;,
        Lnet/bytebuddy/implementation/FixedValue$ForNullValue;,
        Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field protected final assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

.field protected final typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/bytebuddy/implementation/FixedValue;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iput-object p2, p0, Lnet/bytebuddy/implementation/FixedValue;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    return-void
.end method

.method public static argument(I)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;
    .locals 3

    if-ltz p0, :cond_0

    new-instance v0, Lnet/bytebuddy/implementation/FixedValue$ForArgument;

    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/FixedValue$ForArgument;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Argument index cannot be negative: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static nullValue()Lnet/bytebuddy/implementation/Implementation;
    .locals 1

    sget-object v0, Lnet/bytebuddy/implementation/FixedValue$ForNullValue;->INSTANCE:Lnet/bytebuddy/implementation/FixedValue$ForNullValue;

    return-object v0
.end method

.method public static originType()Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;
    .locals 1

    new-instance v0, Lnet/bytebuddy/implementation/FixedValue$ForOriginType;

    invoke-direct {v0}, Lnet/bytebuddy/implementation/FixedValue$ForOriginType;-><init>()V

    return-object v0
.end method

.method public static reference(Ljava/lang/Object;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "value$"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lnet/bytebuddy/utility/RandomString;->hashOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lnet/bytebuddy/implementation/FixedValue;->reference(Ljava/lang/Object;Ljava/lang/String;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;

    move-result-object p0

    return-object p0
.end method

.method public static reference(Ljava/lang/Object;Ljava/lang/String;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;
    .locals 1

    .line 2
    new-instance v0, Lnet/bytebuddy/implementation/FixedValue$ForValue;

    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/implementation/FixedValue$ForValue;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static self()Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;
    .locals 1

    new-instance v0, Lnet/bytebuddy/implementation/FixedValue$ForThisValue;

    invoke-direct {v0}, Lnet/bytebuddy/implementation/FixedValue$ForThisValue;-><init>()V

    return-object v0
.end method

.method public static value(Ljava/lang/Object;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;
    .locals 2

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/utility/ConstantValue$Simple;->wrapOrNull(Ljava/lang/Object;)Lnet/bytebuddy/utility/ConstantValue;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {p0}, Lnet/bytebuddy/implementation/FixedValue;->reference(Ljava/lang/Object;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;

    move-result-object p0

    goto :goto_0

    :cond_0
    new-instance p0, Lnet/bytebuddy/implementation/FixedValue$ForConstantValue;

    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/utility/ConstantValue;->toStackManipulation()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v1

    invoke-interface {v0}, Lnet/bytebuddy/utility/ConstantValue;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lnet/bytebuddy/implementation/FixedValue$ForConstantValue;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)V

    :goto_0
    return-object p0
.end method

.method public static value(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;
    .locals 2

    .line 4
    new-instance v0, Lnet/bytebuddy/implementation/FixedValue$ForConstantValue;

    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object p0

    const-class v1, Ljava/lang/Class;

    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/implementation/FixedValue$ForConstantValue;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)V

    return-object v0
.end method

.method public static value(Lnet/bytebuddy/utility/ConstantValue;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;
    .locals 2

    .line 5
    new-instance v0, Lnet/bytebuddy/implementation/FixedValue$ForConstantValue;

    invoke-interface {p0}, Lnet/bytebuddy/utility/ConstantValue;->toStackManipulation()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v1

    invoke-interface {p0}, Lnet/bytebuddy/utility/ConstantValue;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/implementation/FixedValue$ForConstantValue;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)V

    return-object v0
.end method

.method public static value(Lnet/bytebuddy/utility/JavaConstant;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;
    .locals 0

    .line 6
    invoke-static {p0}, Lnet/bytebuddy/implementation/FixedValue;->value(Lnet/bytebuddy/utility/ConstantValue;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 4

    iget-object v0, p0, Lnet/bytebuddy/implementation/FixedValue;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v1

    iget-object v2, p0, Lnet/bytebuddy/implementation/FixedValue;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-interface {v0, p4, v1, v2}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v0

    invoke-interface {v0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance p4, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v1

    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v1

    const/4 v2, 0x3

    new-array v2, v2, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    const/4 v3, 0x0

    aput-object p5, v2, v3

    const/4 p5, 0x1

    aput-object v0, v2, p5

    const/4 p5, 0x2

    aput-object v1, v2, p5

    invoke-direct {p4, v2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    invoke-virtual {p4, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    move-result-object p1

    new-instance p2, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    invoke-virtual {p1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    move-result p1

    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    move-result p3

    invoke-direct {p2, p1, p3}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    return-object p2

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "Cannot return value of type "

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p4, " for "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/FixedValue;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    check-cast p1, Lnet/bytebuddy/implementation/FixedValue;

    iget-object v3, p1, Lnet/bytebuddy/implementation/FixedValue;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/implementation/FixedValue;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    iget-object p1, p1, Lnet/bytebuddy/implementation/FixedValue;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

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

    iget-object v1, p0, Lnet/bytebuddy/implementation/FixedValue;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/implementation/FixedValue;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
