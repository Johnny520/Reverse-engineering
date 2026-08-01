.class public Lnet/bytebuddy/asm/Advice$AssignReturned$ToAllArguments$Handler;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$AssignReturned$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$AssignReturned$ToAllArguments;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Handler"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$AssignReturned$ToAllArguments$Handler$Factory;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final index:I

.field private final typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;


# direct methods
.method public constructor <init>(ILnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToAllArguments$Handler;->index:I

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToAllArguments$Handler;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 7
    .line 8
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
    iget v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToAllArguments$Handler;->index:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/Advice$AssignReturned$ToAllArguments$Handler;

    .line 23
    .line 24
    iget v3, p1, Lnet/bytebuddy/asm/Advice$AssignReturned$ToAllArguments$Handler;->index:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToAllArguments$Handler;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 30
    .line 31
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$AssignReturned$ToAllArguments$Handler;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    return v0
.end method

.method public getIndex()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToAllArguments$Handler;->index:I

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
    iget v1, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToAllArguments$Handler;->index:I

    .line 12
    .line 13
    add-int/2addr v0, v1

    .line 14
    mul-int/lit8 v0, v0, 0x1f

    .line 15
    .line 16
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToAllArguments$Handler;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    add-int/2addr p0, v0

    .line 23
    return p0
.end method

.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    new-instance v2, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface/range {p5 .. p5}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x1

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v7, 0x2

    .line 26
    const-string v8, " to "

    .line 27
    .line 28
    const-string v9, "Cannot assign "

    .line 29
    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    invoke-interface/range {p5 .. p5}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    const-class v10, [Ljava/lang/Object;

    .line 37
    .line 38
    invoke-static {v10}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 39
    .line 40
    .line 41
    move-result-object v11

    .line 42
    iget-object v12, v0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToAllArguments$Handler;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 43
    .line 44
    invoke-interface {v1, v3, v11, v12}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-interface {v3}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 49
    .line 50
    .line 51
    move-result v11

    .line 52
    if-eqz v11, :cond_0

    .line 53
    .line 54
    invoke-static {v10}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    new-instance v11, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 59
    .line 60
    new-array v12, v7, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 61
    .line 62
    aput-object p6, v12, v6

    .line 63
    .line 64
    aput-object v3, v12, v5

    .line 65
    .line 66
    invoke-direct {v11, v12}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    move-object/from16 v3, p5

    .line 71
    .line 72
    invoke-static {v9, v3, v8, v10}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-object v4

    .line 76
    :cond_1
    move-object/from16 v3, p5

    .line 77
    .line 78
    move-object/from16 v11, p6

    .line 79
    .line 80
    move-object v10, v3

    .line 81
    :goto_0
    invoke-interface/range {p2 .. p2}, Lnet/bytebuddy/description/method/MethodDescription;->getParameters()Lnet/bytebuddy/description/method/ParameterList;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v12

    .line 93
    if-eqz v12, :cond_3

    .line 94
    .line 95
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v12

    .line 99
    check-cast v12, Lnet/bytebuddy/description/method/ParameterDescription;

    .line 100
    .line 101
    invoke-interface {v10}, Lnet/bytebuddy/description/type/TypeDescription;->getComponentType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 102
    .line 103
    .line 104
    move-result-object v13

    .line 105
    invoke-interface {v13}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 106
    .line 107
    .line 108
    move-result-object v13

    .line 109
    invoke-interface {v12}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 110
    .line 111
    .line 112
    move-result-object v14

    .line 113
    iget-object v15, v0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToAllArguments$Handler;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 114
    .line 115
    invoke-interface {v1, v13, v14, v15}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 116
    .line 117
    .line 118
    move-result-object v13

    .line 119
    invoke-interface {v13}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 120
    .line 121
    .line 122
    move-result v14

    .line 123
    if-eqz v14, :cond_2

    .line 124
    .line 125
    new-instance v14, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 126
    .line 127
    invoke-interface {v12}, Lnet/bytebuddy/description/method/ParameterDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 128
    .line 129
    .line 130
    move-result-object v15

    .line 131
    invoke-static {v15}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 132
    .line 133
    .line 134
    move-result-object v15

    .line 135
    invoke-interface {v12}, Lnet/bytebuddy/description/method/ParameterDescription;->getOffset()I

    .line 136
    .line 137
    .line 138
    move-result v12

    .line 139
    move-object/from16 p1, v4

    .line 140
    .line 141
    move-object/from16 v4, p4

    .line 142
    .line 143
    invoke-interface {v4, v12}, Lnet/bytebuddy/asm/Advice$ArgumentHandler;->argument(I)I

    .line 144
    .line 145
    .line 146
    move-result v12

    .line 147
    invoke-virtual {v15, v12}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->storeAt(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 148
    .line 149
    .line 150
    move-result-object v12

    .line 151
    new-array v15, v7, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 152
    .line 153
    aput-object v13, v15, v6

    .line 154
    .line 155
    aput-object v12, v15, v5

    .line 156
    .line 157
    invoke-direct {v14, v15}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-object/from16 v4, p1

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_2
    move-object/from16 p1, v4

    .line 167
    .line 168
    invoke-interface {v10}, Lnet/bytebuddy/description/type/TypeDescription;->getComponentType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-static {v9, v0, v8, v12}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    return-object p1

    .line 176
    :cond_3
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 177
    .line 178
    invoke-interface {v10}, Lnet/bytebuddy/description/type/TypeDescription;->getComponentType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-virtual {v1, v2}, Lnet/bytebuddy/implementation/bytecode/collection/ArrayAccess;->forEach(Ljava/util/List;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    const/4 v2, 0x3

    .line 191
    new-array v2, v2, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 192
    .line 193
    aput-object v11, v2, v6

    .line 194
    .line 195
    aput-object v1, v2, v5

    .line 196
    .line 197
    sget-object v1, Lnet/bytebuddy/implementation/bytecode/Removal;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Removal;

    .line 198
    .line 199
    aput-object v1, v2, v7

    .line 200
    .line 201
    invoke-direct {v0, v2}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 202
    .line 203
    .line 204
    return-object v0
.end method
