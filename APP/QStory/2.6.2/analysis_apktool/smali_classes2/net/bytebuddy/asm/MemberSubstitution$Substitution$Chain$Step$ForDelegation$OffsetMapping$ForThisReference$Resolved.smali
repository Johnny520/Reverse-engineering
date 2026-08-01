.class public Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Resolved;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Resolved"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

.field private final instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

.field private final optional:Z

.field private final source:Lnet/bytebuddy/asm/MemberSubstitution$Source;

.field private final targetType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

.field private final typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;Lnet/bytebuddy/asm/MemberSubstitution$Source;ZLnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/description/method/MethodDescription;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->targetType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->source:Lnet/bytebuddy/asm/MemberSubstitution$Source;

    .line 9
    .line 10
    iput-boolean p4, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->optional:Z

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 13
    .line 14
    iput-object p6, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/asm/MemberSubstitution$Target;Lnet/bytebuddy/description/type/TypeList$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Ljava/util/Map;I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/asm/MemberSubstitution$Target;",
            "Lnet/bytebuddy/description/type/TypeList$Generic;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Lnet/bytebuddy/utility/JavaConstant$MethodHandle;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;I)",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;"
        }
    .end annotation

    .line 1
    iget-object p3, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->source:Lnet/bytebuddy/asm/MemberSubstitution$Source;

    .line 2
    .line 3
    iget-object p4, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 4
    .line 5
    invoke-virtual {p3, p2, p6, p1, p4}, Lnet/bytebuddy/asm/MemberSubstitution$Source;->self(Lnet/bytebuddy/description/type/TypeList$Generic;Ljava/util/Map;Lnet/bytebuddy/asm/MemberSubstitution$Target;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const/4 p3, 0x0

    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 13
    .line 14
    invoke-virtual {p2}, Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 15
    .line 16
    .line 17
    move-result-object p4

    .line 18
    iget-object p5, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->targetType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 19
    .line 20
    iget-object p6, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 21
    .line 22
    invoke-interface {p1, p4, p5, p6}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 27
    .line 28
    .line 29
    move-result p4

    .line 30
    if-eqz p4, :cond_0

    .line 31
    .line 32
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 33
    .line 34
    invoke-virtual {p2}, Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    invoke-static {p3}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    invoke-virtual {p2}, Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;->getOffset()I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    invoke-virtual {p3, p2}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    const/4 p3, 0x2

    .line 51
    new-array p3, p3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 52
    .line 53
    const/4 p4, 0x0

    .line 54
    aput-object p2, p3, p4

    .line 55
    .line 56
    const/4 p2, 0x1

    .line 57
    aput-object p1, p3, p2

    .line 58
    .line 59
    invoke-direct {p0, p3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 60
    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string p4, "Cannot assign "

    .line 66
    .line 67
    invoke-direct {p1, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2}, Lnet/bytebuddy/asm/MemberSubstitution$Source$Value;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string p2, " to "

    .line 78
    .line 79
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->targetType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 80
    .line 81
    invoke-static {p1, p2, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    return-object p3

    .line 85
    :cond_1
    iget-boolean p2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->optional:Z

    .line 86
    .line 87
    if-eqz p2, :cond_2

    .line 88
    .line 89
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->targetType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 90
    .line 91
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/constant/DefaultValue;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :cond_2
    const-string p0, "No this reference available for "

    .line 97
    .line 98
    invoke-static {p1, p0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-object p3
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
    iget-boolean v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->optional:Z

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;

    .line 23
    .line 24
    iget-boolean v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->optional:Z

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

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
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->source:Lnet/bytebuddy/asm/MemberSubstitution$Source;

    .line 41
    .line 42
    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->source:Lnet/bytebuddy/asm/MemberSubstitution$Source;

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
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->targetType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 52
    .line 53
    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->targetType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_6

    .line 60
    .line 61
    return v1

    .line 62
    :cond_6
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 63
    .line 64
    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 65
    .line 66
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v2, :cond_7

    .line 71
    .line 72
    return v1

    .line 73
    :cond_7
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 74
    .line 75
    iget-object p1, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-nez p0, :cond_8

    .line 82
    .line 83
    return v1

    .line 84
    :cond_8
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
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->targetType:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Lnet/bytebuddy/description/type/TypeDescription$Generic;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

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
    iget-object v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->source:Lnet/bytebuddy/asm/MemberSubstitution$Source;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    add-int/2addr v0, v2

    .line 33
    mul-int/2addr v0, v1

    .line 34
    iget-boolean v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->optional:Z

    .line 35
    .line 36
    add-int/2addr v0, v2

    .line 37
    mul-int/2addr v0, v1

    .line 38
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 39
    .line 40
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;II)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    add-int/2addr p0, v0

    .line 51
    return p0
.end method
