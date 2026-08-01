.class public abstract Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$OffsetMapping;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$OffsetMapping;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ForArgument"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Resolved;,
        Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument$Unresolved;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field protected final readOnly:Z

.field protected final target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

.field private final typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;ZLnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 5
    .line 6
    iput-boolean p2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->readOnly:Z

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

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
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->readOnly:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->readOnly:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

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
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 41
    .line 42
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Lnet/bytebuddy/description/type/TypeDescription$Generic;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->readOnly:Z

    .line 19
    .line 20
    add-int/2addr v0, v2

    .line 21
    mul-int/2addr v0, v1

    .line 22
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v0

    .line 29
    return p0
.end method

.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler;Lnet/bytebuddy/asm/Advice$OffsetMapping$Sort;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;
    .locals 5

    .line 1
    invoke-virtual {p0, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->resolve(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/description/method/ParameterDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    iget-object p5, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 10
    .line 11
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 12
    .line 13
    invoke-interface {p3, p2, p5, v0}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-interface {p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 18
    .line 19
    .line 20
    move-result p5

    .line 21
    const/4 v0, 0x0

    .line 22
    const-string v1, " to "

    .line 23
    .line 24
    const-string v2, "Cannot assign "

    .line 25
    .line 26
    if-eqz p5, :cond_2

    .line 27
    .line 28
    iget-boolean p5, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->readOnly:Z

    .line 29
    .line 30
    if-eqz p5, :cond_0

    .line 31
    .line 32
    new-instance p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadOnly;

    .line 33
    .line 34
    invoke-interface {p1}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    invoke-interface {p1}, Lnet/bytebuddy/description/method/ParameterDescription;->getOffset()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-interface {p4, p1}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->argument(I)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-direct {p0, p3, p1, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadOnly;-><init>(Lnet/bytebuddy/description/type/TypeDefinition;ILnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 47
    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_0
    iget-object p5, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 51
    .line 52
    invoke-interface {p1}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    iget-object v4, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 57
    .line 58
    invoke-interface {p3, p5, v3, v4}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    invoke-interface {p3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 63
    .line 64
    .line 65
    move-result p5

    .line 66
    if-eqz p5, :cond_1

    .line 67
    .line 68
    new-instance p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadWrite;

    .line 69
    .line 70
    invoke-interface {p1}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 71
    .line 72
    .line 73
    move-result-object p5

    .line 74
    invoke-interface {p1}, Lnet/bytebuddy/description/method/ParameterDescription;->getOffset()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    invoke-interface {p4, p1}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->argument(I)I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    invoke-direct {p0, p5, p1, p2, p3}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable$ReadWrite;-><init>(Lnet/bytebuddy/description/type/TypeDefinition;ILnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 83
    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 95
    .line 96
    invoke-static {p2, v1, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    return-object v0

    .line 100
    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForArgument;->target:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 109
    .line 110
    invoke-static {p2, v1, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    return-object v0
.end method

.method public abstract resolve(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/description/method/ParameterDescription;
.end method
