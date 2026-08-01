.class public Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField$Write;
.super Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Write"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField$Write$Factory;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final index:I


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField;-><init>(Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V

    .line 2
    .line 3
    .line 4
    iput p4, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField$Write;->index:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public doResolve(Lnet/bytebuddy/asm/MemberSubstitution$Target;Lnet/bytebuddy/description/type/TypeList$Generic;Ljava/util/Map;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Resolution;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/asm/MemberSubstitution$Target;",
            "Lnet/bytebuddy/description/type/TypeList$Generic;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            ")",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Resolution;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lnet/bytebuddy/asm/MemberSubstitution$Target;->isStaticDispatch()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget v0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField$Write;->index:I

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 11
    .line 12
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v1, 0x0

    .line 17
    if-ge v0, p1, :cond_2

    .line 18
    .line 19
    iget-object p1, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField;->assigner:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 20
    .line 21
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 26
    .line 27
    iget-object v3, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    .line 28
    .line 29
    invoke-interface {v3}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget-object v4, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 34
    .line 35
    invoke-interface {p1, v2, v3, v4}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {p1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    new-instance v1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;

    .line 46
    .line 47
    new-instance v2, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 48
    .line 49
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    check-cast p2, Lnet/bytebuddy/description/type/TypeDefinition;

    .line 54
    .line 55
    invoke-static {p2}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    check-cast p3, Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result p3

    .line 73
    invoke-virtual {p2, p3}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    .line 78
    .line 79
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-interface {p0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->write()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    const/4 p3, 0x4

    .line 88
    new-array p3, p3, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 89
    .line 90
    const/4 v0, 0x0

    .line 91
    aput-object p4, p3, v0

    .line 92
    .line 93
    const/4 p4, 0x1

    .line 94
    aput-object p2, p3, p4

    .line 95
    .line 96
    const/4 p2, 0x2

    .line 97
    aput-object p1, p3, p2

    .line 98
    .line 99
    const/4 p1, 0x3

    .line 100
    aput-object p0, p3, p1

    .line 101
    .line 102
    invoke-direct {v2, p3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 103
    .line 104
    .line 105
    sget-object p0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 106
    .line 107
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-direct {v1, v2, p0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 112
    .line 113
    .line 114
    return-object v1

    .line 115
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string p3, "Cannot write "

    .line 118
    .line 119
    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string p2, " to "

    .line 130
    .line 131
    iget-object p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    .line 132
    .line 133
    invoke-static {p1, p2, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    return-object v1

    .line 137
    :cond_2
    const-string p0, "Target does not define an argument with index "

    .line 138
    .line 139
    invoke-static {v0, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField;->equals(Ljava/lang/Object;)Z

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
    iget p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField$Write;->index:I

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField$Write;

    .line 30
    .line 31
    iget p1, p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField$Write;->index:I

    .line 32
    .line 33
    if-eq p0, p1, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget p0, p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$ForField$Write;->index:I

    .line 8
    .line 9
    add-int/2addr v0, p0

    .line 10
    return v0
.end method
