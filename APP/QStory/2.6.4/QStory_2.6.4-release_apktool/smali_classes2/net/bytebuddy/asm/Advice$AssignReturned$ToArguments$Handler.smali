.class public Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$AssignReturned$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Handler"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler$Factory;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final index:I

.field private final typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

.field private final value:I


# direct methods
.method public constructor <init>(IILnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;->value:I

    .line 5
    .line 6
    iput p2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;->index:I

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

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
    iget v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;->value:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;

    .line 23
    .line 24
    iget v3, p1, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;->value:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;->index:I

    .line 30
    .line 31
    iget v3, p1, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;->index:I

    .line 32
    .line 33
    if-eq v2, v3, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 37
    .line 38
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

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
    iget p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;->index:I

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
    iget v1, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;->value:I

    .line 12
    .line 13
    add-int/2addr v0, v1

    .line 14
    mul-int/lit8 v0, v0, 0x1f

    .line 15
    .line 16
    iget v1, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;->index:I

    .line 17
    .line 18
    add-int/2addr v0, v1

    .line 19
    mul-int/lit8 v0, v0, 0x1f

    .line 20
    .line 21
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    add-int/2addr p0, v0

    .line 28
    return p0
.end method

.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 3

    .line 1
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget v0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;->value:I

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-lt p1, v0, :cond_1

    .line 13
    .line 14
    invoke-interface {p5}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;->value:I

    .line 23
    .line 24
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lnet/bytebuddy/description/method/ParameterDescription;

    .line 29
    .line 30
    invoke-interface {v0}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 35
    .line 36
    invoke-interface {p3, p1, v0, v2}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {p1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-eqz p3, :cond_0

    .line 45
    .line 46
    new-instance p3, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 47
    .line 48
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 49
    .line 50
    .line 51
    move-result-object p5

    .line 52
    iget v0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;->value:I

    .line 53
    .line 54
    invoke-interface {p5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p5

    .line 58
    check-cast p5, Lnet/bytebuddy/description/method/ParameterDescription;

    .line 59
    .line 60
    invoke-interface {p5}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 61
    .line 62
    .line 63
    move-result-object p5

    .line 64
    invoke-static {p5}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 65
    .line 66
    .line 67
    move-result-object p5

    .line 68
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    iget p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;->value:I

    .line 73
    .line 74
    invoke-interface {p2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    check-cast p0, Lnet/bytebuddy/description/method/ParameterDescription;

    .line 79
    .line 80
    invoke-interface {p0}, Lnet/bytebuddy/description/method/ParameterDescription;->getOffset()I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    invoke-interface {p4, p0}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->argument(I)I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    invoke-virtual {p5, p0}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->storeAt(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    const/4 p2, 0x3

    .line 93
    new-array p2, p2, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 94
    .line 95
    const/4 p4, 0x0

    .line 96
    aput-object p6, p2, p4

    .line 97
    .line 98
    const/4 p4, 0x1

    .line 99
    aput-object p1, p2, p4

    .line 100
    .line 101
    const/4 p1, 0x2

    .line 102
    aput-object p0, p2, p1

    .line 103
    .line 104
    invoke-direct {p3, p2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 105
    .line 106
    .line 107
    return-object p3

    .line 108
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    const-string p3, "Cannot assign "

    .line 111
    .line 112
    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    iget p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;->value:I

    .line 123
    .line 124
    invoke-interface {p2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    check-cast p0, Lnet/bytebuddy/description/method/ParameterDescription;

    .line 129
    .line 130
    invoke-interface {p0}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    const-string p2, " to "

    .line 135
    .line 136
    invoke-static {p1, p2, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    return-object v1

    .line 140
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string p2, " declares less then "

    .line 149
    .line 150
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    iget p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToArguments$Handler;->value:I

    .line 154
    .line 155
    const-string p2, " parameters"

    .line 156
    .line 157
    invoke-static {p1, p2, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Ljava/lang/StringBuilder;Ljava/lang/String;I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    return-object v1
.end method
