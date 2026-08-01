.class public abstract Lnet/bytebuddy/implementation/FixedValue;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

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

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/FixedValue;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/implementation/FixedValue;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 7
    .line 8
    return-void
.end method

.method public static argument(I)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;
    .locals 1

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    new-instance v0, Lnet/bytebuddy/implementation/FixedValue$ForArgument;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/FixedValue$ForArgument;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    const-string v0, "Argument index cannot be negative: "

    .line 10
    .line 11
    invoke-static {p0, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public static nullValue()Lnet/bytebuddy/implementation/Implementation;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/FixedValue$ForNullValue;->INSTANCE:Lnet/bytebuddy/implementation/FixedValue$ForNullValue;

    .line 2
    .line 3
    return-object v0
.end method

.method public static originType()Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/FixedValue$ForOriginType;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/implementation/FixedValue$ForOriginType;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static reference(Ljava/lang/Object;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "value$"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lnet/bytebuddy/utility/RandomString;->hashOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p0, v0}, Lnet/bytebuddy/implementation/FixedValue;->reference(Ljava/lang/Object;Ljava/lang/String;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static reference(Ljava/lang/Object;Ljava/lang/String;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;
    .locals 1

    .line 24
    new-instance v0, Lnet/bytebuddy/implementation/FixedValue$ForValue;

    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/implementation/FixedValue$ForValue;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static self()Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/FixedValue$ForThisValue;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/implementation/FixedValue$ForThisValue;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static value(Ljava/lang/Object;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;
    .locals 2

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/utility/ConstantValue$Simple;->wrapOrNull(Ljava/lang/Object;)Lnet/bytebuddy/utility/ConstantValue;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lnet/bytebuddy/implementation/FixedValue;->reference(Ljava/lang/Object;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Lnet/bytebuddy/implementation/FixedValue$ForConstantValue;

    .line 13
    .line 14
    invoke-interface {v0}, Lnet/bytebuddy/utility/ConstantValue;->toStackManipulation()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v0}, Lnet/bytebuddy/utility/ConstantValue;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-direct {p0, v1, v0}, Lnet/bytebuddy/implementation/FixedValue$ForConstantValue;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public static value(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;
    .locals 2

    .line 26
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

    .line 27
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

    .line 28
    invoke-static {p0}, Lnet/bytebuddy/implementation/FixedValue;->value(Lnet/bytebuddy/utility/ConstantValue;)Lnet/bytebuddy/implementation/FixedValue$AssignerConfigurable;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;
    .locals 3

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/implementation/FixedValue;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 2
    .line 3
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object p0, p0, Lnet/bytebuddy/implementation/FixedValue;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 8
    .line 9
    invoke-interface {v0, p4, v1, p0}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    new-instance p4, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 20
    .line 21
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v1, 0x3

    .line 30
    new-array v1, v1, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    aput-object p5, v1, v2

    .line 34
    .line 35
    const/4 p5, 0x1

    .line 36
    aput-object p0, v1, p5

    .line 37
    .line 38
    const/4 p0, 0x2

    .line 39
    aput-object v0, v1, p0

    .line 40
    .line 41
    invoke-direct {p4, v1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p4, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    new-instance p1, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;

    .line 49
    .line 50
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->getMaximalSize()I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    invoke-direct {p1, p0, p2}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Size;-><init>(II)V

    .line 59
    .line 60
    .line 61
    return-object p1

    .line 62
    :cond_0
    const-string p0, "Cannot return value of type "

    .line 63
    .line 64
    const-string p1, " for "

    .line 65
    .line 66
    invoke-static {p0, p4, p1, p3}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x0

    .line 70
    return-object p0
.end method

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
    iget-object v2, p0, Lnet/bytebuddy/implementation/FixedValue;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/FixedValue;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/implementation/FixedValue;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/implementation/FixedValue;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/implementation/FixedValue;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

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
    const/16 v1, 0x1f

    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    iget-object v2, p0, Lnet/bytebuddy/implementation/FixedValue;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object p0, p0, Lnet/bytebuddy/implementation/FixedValue;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v0

    .line 25
    return p0
.end method
