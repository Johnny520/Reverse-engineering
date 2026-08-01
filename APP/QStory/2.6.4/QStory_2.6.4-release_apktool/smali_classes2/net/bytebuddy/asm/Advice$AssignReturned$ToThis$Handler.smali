.class public Lnet/bytebuddy/asm/Advice$AssignReturned$ToThis$Handler;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$AssignReturned$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$AssignReturned$ToThis;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Handler"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$AssignReturned$ToThis$Handler$Factory;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final exit:Z

.field private final index:I

.field private final typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;


# direct methods
.method public constructor <init>(ILnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToThis$Handler;->index:I

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToThis$Handler;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 7
    .line 8
    iput-boolean p3, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToThis$Handler;->exit:Z

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
    iget v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToThis$Handler;->index:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/Advice$AssignReturned$ToThis$Handler;

    .line 23
    .line 24
    iget v3, p1, Lnet/bytebuddy/asm/Advice$AssignReturned$ToThis$Handler;->index:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-boolean v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToThis$Handler;->exit:Z

    .line 30
    .line 31
    iget-boolean v3, p1, Lnet/bytebuddy/asm/Advice$AssignReturned$ToThis$Handler;->exit:Z

    .line 32
    .line 33
    if-eq v2, v3, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToThis$Handler;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 37
    .line 38
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$AssignReturned$ToThis$Handler;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-nez p0, :cond_5

    .line 45
    .line 46
    return v1

    .line 47
    :cond_5
    return v0
.end method

.method public getIndex()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToThis$Handler;->index:I

    .line 2
    .line 3
    return p0
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
    iget v1, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToThis$Handler;->index:I

    .line 12
    .line 13
    add-int/2addr v0, v1

    .line 14
    mul-int/lit8 v0, v0, 0x1f

    .line 15
    .line 16
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToThis$Handler;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/2addr v1, v0

    .line 23
    mul-int/lit8 v1, v1, 0x1f

    .line 24
    .line 25
    iget-boolean p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToThis$Handler;->exit:Z

    .line 26
    .line 27
    add-int/2addr v1, p0

    .line 28
    return v1
.end method

.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 2

    .line 1
    invoke-interface {p2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    iget-boolean v0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToThis$Handler;->exit:Z

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string p0, "Cannot assign this reference in constructor prior to initialization for "

    .line 20
    .line 21
    invoke-static {p0, p2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;Lnet/bytebuddy/description/method/MethodDescription;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object v1

    .line 29
    :cond_1
    :goto_0
    invoke-interface {p5}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToThis$Handler;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 38
    .line 39
    invoke-interface {p3, p2, v0, p0}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-interface {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_2

    .line 48
    .line 49
    new-instance p1, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 50
    .line 51
    sget-object p2, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 52
    .line 53
    const/4 p3, 0x0

    .line 54
    invoke-interface {p4, p3}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->argument(I)I

    .line 55
    .line 56
    .line 57
    move-result p4

    .line 58
    invoke-virtual {p2, p4}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->storeAt(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    const/4 p4, 0x3

    .line 63
    new-array p4, p4, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 64
    .line 65
    aput-object p6, p4, p3

    .line 66
    .line 67
    const/4 p3, 0x1

    .line 68
    aput-object p0, p4, p3

    .line 69
    .line 70
    const/4 p0, 0x2

    .line 71
    aput-object p2, p4, p0

    .line 72
    .line 73
    invoke-direct {p1, p4}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 74
    .line 75
    .line 76
    return-object p1

    .line 77
    :cond_2
    const-string p0, "Cannot assign "

    .line 78
    .line 79
    const-string p2, " to "

    .line 80
    .line 81
    invoke-static {p0, p5, p2, p1}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    return-object v1

    .line 85
    :cond_3
    const-string p0, "Cannot assign this reference for static method "

    .line 86
    .line 87
    invoke-static {p0, p2}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;Lnet/bytebuddy/description/method/MethodDescription;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-object v1
.end method
