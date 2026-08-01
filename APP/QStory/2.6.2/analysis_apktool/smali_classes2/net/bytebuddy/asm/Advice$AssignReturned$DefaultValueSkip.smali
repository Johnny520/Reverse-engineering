.class public Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$AssignReturned;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DefaultValueSkip"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final dispatcher:Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

.field private final offset:I

.field private final stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

.field private final stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForPostProcessor;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForPostProcessor;ILnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForPostProcessor;

    .line 7
    .line 8
    iput p3, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;->offset:I

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;->dispatcher:Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

    .line 11
    .line 12
    return-void
.end method

.method public static of(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForPostProcessor;ILnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    .line 1
    invoke-interface {p3}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    invoke-interface {p3, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_4

    .line 14
    .line 15
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    invoke-interface {p3, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_4

    .line 22
    .line 23
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    invoke-interface {p3, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_4

    .line 30
    .line 31
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    invoke-interface {p3, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 40
    .line 41
    invoke-interface {p3, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 49
    .line 50
    invoke-interface {p3, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    sget-object p3, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;->LONG:Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 60
    .line 61
    invoke-interface {p3, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    sget-object p3, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;->FLOAT:Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 71
    .line 72
    invoke-interface {p3, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    sget-object p3, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;->DOUBLE:Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    const-string p0, "Cannot apply skip for "

    .line 82
    .line 83
    invoke-static {p3, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const/4 p0, 0x0

    .line 87
    return-object p0

    .line 88
    :cond_4
    :goto_0
    sget-object p3, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;->INTEGER:Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_5
    sget-object p3, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;->REFERENCE:Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

    .line 92
    .line 93
    :goto_1
    new-instance v0, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;

    .line 94
    .line 95
    invoke-direct {v0, p0, p1, p2, p3}, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForPostProcessor;ILnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;)V

    .line 96
    .line 97
    .line 98
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/jar/asm/Label;

    .line 2
    .line 3
    invoke-direct {v0}, Lnet/bytebuddy/jar/asm/Label;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;->dispatcher:Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

    .line 7
    .line 8
    iget v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;->offset:I

    .line 9
    .line 10
    invoke-virtual {v1, p1, v2, v0}, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;ILnet/bytebuddy/jar/asm/Label;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 15
    .line 16
    invoke-interface {v2, p1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/implementation/Implementation$Context;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {v1, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;->aggregate(Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;)Lnet/bytebuddy/implementation/bytecode/StackManipulation$Size;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {p1, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLabel(Lnet/bytebuddy/jar/asm/Label;)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForPostProcessor;

    .line 32
    .line 33
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {p0, p1, v0}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForPostProcessor;->injectIntermediateFrame(Lnet/bytebuddy/jar/asm/MethodVisitor;Ljava/util/List;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    .line 39
    .line 40
    .line 41
    return-object p2
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
    iget v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;->offset:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;

    .line 23
    .line 24
    iget v3, p1, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;->offset:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;->dispatcher:Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;->dispatcher:Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 41
    .line 42
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_5

    .line 49
    .line 50
    return v1

    .line 51
    :cond_5
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForPostProcessor;

    .line 52
    .line 53
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForPostProcessor;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-nez p0, :cond_6

    .line 60
    .line 61
    return v1

    .line 62
    :cond_6
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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Lnet/bytebuddy/implementation/bytecode/StackManipulation;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;->stackMapFrameHandler:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForPostProcessor;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    add-int/2addr v2, v0

    .line 25
    mul-int/2addr v2, v1

    .line 26
    iget v0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;->offset:I

    .line 27
    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;->dispatcher:Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip$Dispatcher;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    add-int/2addr p0, v2

    .line 37
    return p0
.end method

.method public isValid()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
