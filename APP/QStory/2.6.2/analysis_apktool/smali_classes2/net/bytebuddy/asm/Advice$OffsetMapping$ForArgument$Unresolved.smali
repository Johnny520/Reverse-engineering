.class public Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved;
.super Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Unresolved"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved$Factory;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final index:I

.field private final optional:Z


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/method/ParameterDescription;)V
    .locals 3

    .line 90
    invoke-interface {p1}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object v0

    sget-object v1, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->STATIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    invoke-interface {p1}, Lnet/bytebuddy/description/method/ParameterDescription;->getIndex()I

    move-result p1

    const/4 v2, 0x1

    invoke-direct {p0, v0, v2, v1, p1}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;ZLnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;I)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable<",
            "Lnet/bytebuddy/asm/Advice$Argument;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved$Factory;->access$100()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p2, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-static {}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved$Factory;->access$200()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {p2, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-class v2, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 30
    .line 31
    invoke-interface {v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 36
    .line 37
    const-class v2, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 38
    .line 39
    invoke-interface {v0, v2}, Lnet/bytebuddy/description/enumeration/EnumerationDescription;->load(Ljava/lang/Class;)Ljava/lang/Enum;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    move-object v5, v0

    .line 44
    check-cast v5, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 45
    .line 46
    invoke-static {}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved$Factory;->access$300()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {p2, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-class v2, Ljava/lang/Integer;

    .line 55
    .line 56
    invoke-interface {v0, v2}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    invoke-static {}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved$Factory;->access$400()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-interface {p2, v0}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-interface {p2, v1}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    check-cast p2, Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    move-object v2, p0

    .line 85
    move-object v3, p1

    .line 86
    invoke-direct/range {v2 .. v7}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;ZLnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;IZ)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;ZLnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;I)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    .line 91
    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;ZLnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;IZ)V

    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;ZLnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;IZ)V
    .locals 0

    .line 92
    invoke-direct {p0, p1, p2, p3}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;ZLnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    .line 93
    iput p4, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved;->index:I

    .line 94
    iput-boolean p5, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved;->optional:Z

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
    invoke-super {p0, p1}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->equals(Ljava/lang/Object;)Z

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
    iget v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved;->index:I

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved;

    .line 30
    .line 31
    iget v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved;->index:I

    .line 32
    .line 33
    if-eq v2, v3, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    iget-boolean p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved;->optional:Z

    .line 37
    .line 38
    iget-boolean p1, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved;->optional:Z

    .line 39
    .line 40
    if-eq p0, p1, :cond_5

    .line 41
    .line 42
    return v1

    .line 43
    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget v1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved;->index:I

    .line 8
    .line 9
    add-int/2addr v0, v1

    .line 10
    mul-int/lit8 v0, v0, 0x1f

    .line 11
    .line 12
    iget-boolean p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved;->optional:Z

    .line 13
    .line 14
    add-int/2addr v0, p0

    .line 15
    return v0
.end method

.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler;Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;
    .locals 6

    .line 1
    iget-boolean v0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved;->optional:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved;->index:I

    .line 14
    .line 15
    if-gt v0, v1, :cond_1

    .line 16
    .line 17
    iget-boolean p1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->readOnly:Z

    .line 18
    .line 19
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    new-instance p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForDefaultValue$ReadOnly;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForDefaultValue$ReadOnly;-><init>(Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_0
    new-instance p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForDefaultValue$ReadWrite;

    .line 30
    .line 31
    invoke-direct {p1, p0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForDefaultValue$ReadWrite;-><init>(Lnet/bytebuddy/description/type/TypeDefinition;)V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_1
    move-object v0, p0

    .line 36
    move-object v1, p1

    .line 37
    move-object v2, p2

    .line 38
    move-object v3, p3

    .line 39
    move-object v4, p4

    .line 40
    move-object v5, p5

    .line 41
    invoke-super/range {v0 .. v5}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler;Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method public resolve(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/description/method/ParameterDescription;
    .locals 3

    .line 46
    invoke-interface {p1}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    move-result-object v0

    .line 47
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved;->index:I

    if-le v1, v2, :cond_0

    .line 48
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/description/method/ParameterDescription;

    return-object p0

    .line 49
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " does not define an index "

    iget p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved;->index:I

    invoke-static {v0, p1, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/StringBuilder;Ljava/lang/Object;I)V

    const/4 p0, 0x0

    return-object p0
.end method
