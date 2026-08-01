.class public abstract Lnet/bytebuddy/asm/Advice$AssignReturned;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$PostProcessor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AssignReturned"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$AssignReturned$Factory;,
        Lnet/bytebuddy/asm/Advice$AssignReturned$Handler;,
        Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler;,
        Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;,
        Lnet/bytebuddy/asm/Advice$AssignReturned$ForScalar;,
        Lnet/bytebuddy/asm/Advice$AssignReturned$ForArray;,
        Lnet/bytebuddy/asm/Advice$AssignReturned$ToThrown;,
        Lnet/bytebuddy/asm/Advice$AssignReturned$ToReturned;,
        Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields;,
        Lnet/bytebuddy/asm/Advice$AssignReturned$ToThis;,
        Lnet/bytebuddy/asm/Advice$AssignReturned$ToAllArguments;,
        Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments;,
        Lnet/bytebuddy/asm/Advice$AssignReturned$AsScalar;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field public static final NO_INDEX:I = -0x1


# instance fields
.field protected final exceptionHandlerFactory:Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory;

.field protected final exit:Z

.field protected final skipOnDefaultValue:Z

.field protected final typeDescription:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$AssignReturned;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned;->exceptionHandlerFactory:Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory;

    .line 7
    .line 8
    iput-boolean p3, p0, Lnet/bytebuddy/asm/Advice$AssignReturned;->exit:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Lnet/bytebuddy/asm/Advice$AssignReturned;->skipOnDefaultValue:Z

    .line 11
    .line 12
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
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned;->exit:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/Advice$AssignReturned;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/asm/Advice$AssignReturned;->exit:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned;->skipOnDefaultValue:Z

    .line 30
    .line 31
    iget-boolean v3, p1, Lnet/bytebuddy/asm/Advice$AssignReturned;->skipOnDefaultValue:Z

    .line 32
    .line 33
    if-eq v2, v3, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 37
    .line 38
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$AssignReturned;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_5

    .line 45
    .line 46
    return v1

    .line 47
    :cond_5
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned;->exceptionHandlerFactory:Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory;

    .line 48
    .line 49
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$AssignReturned;->exceptionHandlerFactory:Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory;

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-nez p0, :cond_6

    .line 56
    .line 57
    return v1

    .line 58
    :cond_6
    return v0
.end method

.method public abstract getHandlers()Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lnet/bytebuddy/asm/Advice$AssignReturned$Handler;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getType()Lnet/bytebuddy/description/type/TypeDescription;
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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned;->exceptionHandlerFactory:Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory;

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
    iget-boolean v0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned;->exit:Z

    .line 27
    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-boolean p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned;->skipOnDefaultValue:Z

    .line 31
    .line 32
    add-int/2addr v2, p0

    .line 33
    return v2
.end method

.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForPostProcessor;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 11

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0}, Lnet/bytebuddy/asm/Advice$AssignReturned;->getHandlers()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lnet/bytebuddy/asm/Advice$AssignReturned;->getHandlers()Ljava/util/Collection;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    move-object v4, v3

    .line 35
    check-cast v4, Lnet/bytebuddy/asm/Advice$AssignReturned$Handler;

    .line 36
    .line 37
    invoke-virtual {p0}, Lnet/bytebuddy/asm/Advice$AssignReturned;->getType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    iget-boolean v3, p0, Lnet/bytebuddy/asm/Advice$AssignReturned;->exit:Z

    .line 42
    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    invoke-interface {p4}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->exit()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    invoke-interface {p4}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->enter()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    :goto_1
    invoke-virtual {p0, v4, v3}, Lnet/bytebuddy/asm/Advice$AssignReturned;->toLoadInstruction(Lnet/bytebuddy/asm/Advice$AssignReturned$Handler;I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    move-object v5, p1

    .line 59
    move-object v6, p2

    .line 60
    move-object v7, p3

    .line 61
    move-object v8, p4

    .line 62
    invoke-interface/range {v4 .. v10}, Lnet/bytebuddy/asm/Advice$AssignReturned$Handler;->resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    iget-object p1, p0, Lnet/bytebuddy/asm/Advice$AssignReturned;->exceptionHandlerFactory:Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory;

    .line 71
    .line 72
    new-instance p2, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 73
    .line 74
    invoke-direct {p2, v1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>(Ljava/util/List;)V

    .line 75
    .line 76
    .line 77
    move-object/from16 p3, p6

    .line 78
    .line 79
    invoke-interface {p1, p2, p3, v0}, Lnet/bytebuddy/asm/Advice$AssignReturned$ExceptionHandler$Factory;->wrap(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForPostProcessor;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iget-boolean p2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned;->skipOnDefaultValue:Z

    .line 84
    .line 85
    if-eqz p2, :cond_3

    .line 86
    .line 87
    iget-boolean p2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned;->exit:Z

    .line 88
    .line 89
    if-eqz p2, :cond_2

    .line 90
    .line 91
    invoke-interface {p4}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->exit()I

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    goto :goto_2

    .line 96
    :cond_2
    invoke-interface {p4}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->enter()I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    :goto_2
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 101
    .line 102
    invoke-static {p1, v0, p2, p0}, Lnet/bytebuddy/asm/Advice$AssignReturned$DefaultValueSkip;->of(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$ForPostProcessor;ILnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0

    .line 107
    :cond_3
    return-object p1
.end method

.method public abstract toLoadInstruction(Lnet/bytebuddy/asm/Advice$AssignReturned$Handler;I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
.end method
