.class public Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForArgumentSubstitution"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step<",
        "Lnet/bytebuddy/asm/MemberSubstitution$Target;",
        ">;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

.field private final index:I

.field private final substitution:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

.field private final typeDescription:Lnet/bytebuddy/description/type/TypeDescription$Generic;

.field private final typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;ILnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->substitution:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 7
    .line 8
    iput p3, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->index:I

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 11
    .line 12
    iput-object p5, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 13
    .line 14
    return-void
.end method

.method public static of(Ljava/lang/Object;I)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I)",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory<",
            "Lnet/bytebuddy/asm/MemberSubstitution$Target;",
            ">;"
        }
    .end annotation

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p0}, Lnet/bytebuddy/utility/ConstantValue$Simple;->wrap(Ljava/lang/Object;)Lnet/bytebuddy/utility/ConstantValue;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution$Factory;

    .line 8
    .line 9
    invoke-interface {p0}, Lnet/bytebuddy/utility/ConstantValue;->toStackManipulation()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {p0}, Lnet/bytebuddy/utility/ConstantValue;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {v0, v1, p0, p1}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution$Factory;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;I)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    const-string p0, "Index cannot be negative: "

    .line 26
    .line 27
    invoke-static {p1, p0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(ILjava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return-object p0
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
    iget v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->index:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;

    .line 23
    .line 24
    iget v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->index:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

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
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->substitution:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 41
    .line 42
    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->substitution:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

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
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 52
    .line 53
    iget-object v3, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription$Generic;

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
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 63
    .line 64
    iget-object p1, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-nez p0, :cond_7

    .line 71
    .line 72
    return v1

    .line 73
    :cond_7
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
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->substitution:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世(Lnet/bytebuddy/implementation/bytecode/StackManipulation;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 19
    .line 20
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Lnet/bytebuddy/description/type/TypeDescription$Generic;II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->index:I

    .line 25
    .line 26
    add-int/2addr v0, v2

    .line 27
    mul-int/2addr v0, v1

    .line 28
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v0

    .line 41
    return p0
.end method

.method public resolve(Lnet/bytebuddy/asm/MemberSubstitution$Target;Lnet/bytebuddy/description/type/TypeList$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/Map;I)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Resolution;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/asm/MemberSubstitution$Target;",
            "Lnet/bytebuddy/description/type/TypeList$Generic;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Lnet/bytebuddy/utility/JavaConstant$MethodHandle;",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;I)",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Resolution;"
        }
    .end annotation

    .line 1
    iget p3, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->index:I

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p4

    .line 7
    const/4 p5, 0x0

    .line 8
    if-ge p3, p4, :cond_1

    .line 9
    .line 10
    iget-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 11
    .line 12
    iget-object p3, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 13
    .line 14
    iget p4, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->index:I

    .line 15
    .line 16
    invoke-interface {p2, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p4

    .line 20
    check-cast p4, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 21
    .line 22
    iget-object p8, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 23
    .line 24
    invoke-interface {p1, p3, p4, p8}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-interface {p1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    if-eqz p3, :cond_0

    .line 33
    .line 34
    new-instance p3, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;

    .line 35
    .line 36
    new-instance p4, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 37
    .line 38
    iget-object p5, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->substitution:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 39
    .line 40
    iget p8, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->index:I

    .line 41
    .line 42
    invoke-interface {p2, p8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    check-cast p2, Lnet/bytebuddy/description/type/TypeDefinition;

    .line 47
    .line 48
    invoke-static {p2}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    iget p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->index:I

    .line 53
    .line 54
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-interface {p7, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, Ljava/lang/Integer;

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    invoke-virtual {p2, p0}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->storeAt(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    const/4 p2, 0x3

    .line 73
    new-array p2, p2, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 74
    .line 75
    const/4 p7, 0x0

    .line 76
    aput-object p5, p2, p7

    .line 77
    .line 78
    const/4 p5, 0x1

    .line 79
    aput-object p1, p2, p5

    .line 80
    .line 81
    const/4 p1, 0x2

    .line 82
    aput-object p0, p2, p1

    .line 83
    .line 84
    invoke-direct {p4, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 85
    .line 86
    .line 87
    invoke-direct {p3, p4, p6}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 88
    .line 89
    .line 90
    return-object p3

    .line 91
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string p3, "Cannot assign "

    .line 94
    .line 95
    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iget-object p3, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 99
    .line 100
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    iget p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->index:I

    .line 104
    .line 105
    invoke-interface {p2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    const-string p2, " to "

    .line 110
    .line 111
    invoke-static {p1, p2, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    return-object p5

    .line 115
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string p1, " has not "

    .line 124
    .line 125
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    iget p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution;->index:I

    .line 129
    .line 130
    const-string p1, " arguments"

    .line 131
    .line 132
    invoke-static {p2, p1, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-object p5
.end method
