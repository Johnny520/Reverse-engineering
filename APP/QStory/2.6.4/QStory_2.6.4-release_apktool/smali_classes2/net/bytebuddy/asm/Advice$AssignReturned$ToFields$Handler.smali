.class public Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$AssignReturned$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Handler"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler$Factory;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final declaringType:Lnet/bytebuddy/description/type/TypeDescription;

.field private final index:I

.field private final name:Ljava/lang/String;

.field private final typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;


# direct methods
.method public constructor <init>(ILjava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;->index:I

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;->name:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

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
    iget v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;->index:I

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;

    .line 23
    .line 24
    iget v3, p1, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;->index:I

    .line 25
    .line 26
    if-eq v2, v3, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 30
    .line 31
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

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
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;->name:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v3, p1, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;->name:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 52
    .line 53
    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

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

.method public getIndex()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;->index:I

    .line 2
    .line 3
    return p0
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
    iget v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;->index:I

    .line 13
    .line 14
    add-int/2addr v0, v2

    .line 15
    mul-int/2addr v0, v1

    .line 16
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;->name:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(Lnet/bytebuddy/description/type/TypeDescription;II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    add-int/2addr p0, v0

    .line 35
    return p0
.end method

.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/asm/Advice$ArgumentHandler;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 2

    .line 1
    iget-object p4, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-interface {p4, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 6
    .line 7
    .line 8
    move-result p4

    .line 9
    if-eqz p4, :cond_0

    .line 10
    .line 11
    new-instance p4, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForClassHierarchy;

    .line 12
    .line 13
    invoke-direct {p4, p1}, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForClassHierarchy;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p4, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForExactType;

    .line 18
    .line 19
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;->declaringType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 20
    .line 21
    invoke-direct {p4, v0}, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForExactType;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;->name:Ljava/lang/String;

    .line 25
    .line 26
    const-string v1, ""

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-static {p4, p2}, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution$Simple;->ofBeanAccessor(Lnet/bytebuddy/dynamic/scaffold/FieldLocator;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution;

    .line 35
    .line 36
    .line 37
    move-result-object p4

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;->name:Ljava/lang/String;

    .line 40
    .line 41
    invoke-interface {p4, v0}, Lnet/bytebuddy/dynamic/scaffold/FieldLocator;->locate(Ljava/lang/String;)Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution;

    .line 42
    .line 43
    .line 44
    move-result-object p4

    .line 45
    :goto_1
    invoke-interface {p4}, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution;->isResolved()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const/4 v1, 0x0

    .line 50
    if-eqz v0, :cond_7

    .line 51
    .line 52
    invoke-interface {p4}, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution;->getField()Lnet/bytebuddy/description/field/FieldDescription;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-interface {v0, p1}, Lnet/bytebuddy/description/ByteCodeElement;->isVisibleTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_6

    .line 61
    .line 62
    invoke-interface {p4}, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution;->getField()Lnet/bytebuddy/description/field/FieldDescription;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-interface {v0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    sget-object p1, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_2
    invoke-interface {p2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_5

    .line 80
    .line 81
    invoke-interface {p4}, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution;->getField()Lnet/bytebuddy/description/field/FieldDescription;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-interface {p2}, Lnet/bytebuddy/description/field/FieldDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-interface {p2}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-interface {p1, p2}, Lnet/bytebuddy/description/type/TypeDescription;->isAssignableTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    if-eqz p2, :cond_4

    .line 98
    .line 99
    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    :goto_2
    invoke-interface {p5}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-interface {p4}, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution;->getField()Lnet/bytebuddy/description/field/FieldDescription;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-interface {v0}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;->typing:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 116
    .line 117
    invoke-interface {p3, p2, v0, p0}, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-interface {p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation;->isValid()Z

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    if-eqz p2, :cond_3

    .line 126
    .line 127
    new-instance p2, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 128
    .line 129
    invoke-interface {p4}, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution;->getField()Lnet/bytebuddy/description/field/FieldDescription;

    .line 130
    .line 131
    .line 132
    move-result-object p3

    .line 133
    invoke-static {p3}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 134
    .line 135
    .line 136
    move-result-object p3

    .line 137
    invoke-interface {p3}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->write()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 138
    .line 139
    .line 140
    move-result-object p3

    .line 141
    const/4 p4, 0x4

    .line 142
    new-array p4, p4, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 143
    .line 144
    const/4 p5, 0x0

    .line 145
    aput-object p1, p4, p5

    .line 146
    .line 147
    const/4 p1, 0x1

    .line 148
    aput-object p6, p4, p1

    .line 149
    .line 150
    const/4 p1, 0x2

    .line 151
    aput-object p0, p4, p1

    .line 152
    .line 153
    const/4 p0, 0x3

    .line 154
    aput-object p3, p4, p0

    .line 155
    .line 156
    invoke-direct {p2, p4}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 157
    .line 158
    .line 159
    return-object p2

    .line 160
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    const-string p1, "Cannot assign "

    .line 163
    .line 164
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const-string p1, " to "

    .line 171
    .line 172
    invoke-interface {p4}, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution;->getField()Lnet/bytebuddy/description/field/FieldDescription;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    invoke-static {p0, p1, p2}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    return-object v1

    .line 180
    :cond_4
    new-instance p0, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    const-string p1, " does not define "

    .line 189
    .line 190
    invoke-interface {p4}, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution;->getField()Lnet/bytebuddy/description/field/FieldDescription;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    invoke-static {p0, p1, p2}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    return-object v1

    .line 198
    :cond_5
    invoke-interface {p4}, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution;->getField()Lnet/bytebuddy/description/field/FieldDescription;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    const-string p1, " from static "

    .line 203
    .line 204
    const-string p3, "Cannot access member field "

    .line 205
    .line 206
    invoke-static {p3, p0, p1, p2}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    return-object v1

    .line 210
    :cond_6
    invoke-interface {p4}, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$Resolution;->getField()Lnet/bytebuddy/description/field/FieldDescription;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    const-string p2, " is not visible to "

    .line 215
    .line 216
    invoke-static {p0, p2, p1}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    return-object v1

    .line 220
    :cond_7
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$AssignReturned$ToFields$Handler;->name:Ljava/lang/String;

    .line 221
    .line 222
    const-string p2, " for "

    .line 223
    .line 224
    const-string p3, "Cannot resolve field "

    .line 225
    .line 226
    invoke-static {p3, p0, p2, p1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    return-object v1
.end method
