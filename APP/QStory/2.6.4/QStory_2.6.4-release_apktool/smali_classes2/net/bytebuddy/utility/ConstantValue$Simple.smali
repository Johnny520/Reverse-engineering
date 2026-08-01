.class public Lnet/bytebuddy/utility/ConstantValue$Simple;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/utility/ConstantValue;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/ConstantValue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Simple"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

.field private final typeDescription:Lnet/bytebuddy/description/type/TypeDescription;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/utility/ConstantValue$Simple;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/utility/ConstantValue$Simple;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 7
    .line 8
    return-void
.end method

.method public static wrap(Ljava/lang/Object;)Lnet/bytebuddy/utility/ConstantValue;
    .locals 1

    .line 1
    invoke-static {p0}, Lnet/bytebuddy/utility/ConstantValue$Simple;->wrapOrNull(Ljava/lang/Object;)Lnet/bytebuddy/utility/ConstantValue;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-string v0, "Not a constant value: "

    .line 9
    .line 10
    invoke-static {p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public static wrapOrNull(Ljava/lang/Object;)Lnet/bytebuddy/utility/ConstantValue;
    .locals 2
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    instance-of v0, p0, Lnet/bytebuddy/utility/ConstantValue;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lnet/bytebuddy/utility/ConstantValue;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Lnet/bytebuddy/description/type/TypeDescription;

    .line 9
    .line 10
    const-class v1, Ljava/lang/Class;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    check-cast p0, Lnet/bytebuddy/description/type/TypeDescription;

    .line 15
    .line 16
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    new-instance v0, Lnet/bytebuddy/utility/ConstantValue$Simple;

    .line 23
    .line 24
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/utility/ConstantValue$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_1
    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_2
    instance-of v0, p0, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    new-instance v0, Lnet/bytebuddy/utility/ConstantValue$Simple;

    .line 46
    .line 47
    check-cast p0, Lnet/bytebuddy/description/enumeration/EnumerationDescription;

    .line 48
    .line 49
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forEnumeration(Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {p0}, Lnet/bytebuddy/description/enumeration/EnumerationDescription;->getEnumerationType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/utility/ConstantValue$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_3
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    new-instance v0, Lnet/bytebuddy/utility/ConstantValue$Simple;

    .line 66
    .line 67
    check-cast p0, Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(Z)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 78
    .line 79
    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/utility/ConstantValue$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 84
    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_4
    instance-of v0, p0, Ljava/lang/Byte;

    .line 88
    .line 89
    if-eqz v0, :cond_5

    .line 90
    .line 91
    new-instance v0, Lnet/bytebuddy/utility/ConstantValue$Simple;

    .line 92
    .line 93
    check-cast p0, Ljava/lang/Byte;

    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/lang/Byte;->byteValue()B

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 104
    .line 105
    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/utility/ConstantValue$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 110
    .line 111
    .line 112
    return-object v0

    .line 113
    :cond_5
    instance-of v0, p0, Ljava/lang/Short;

    .line 114
    .line 115
    if-eqz v0, :cond_6

    .line 116
    .line 117
    new-instance v0, Lnet/bytebuddy/utility/ConstantValue$Simple;

    .line 118
    .line 119
    check-cast p0, Ljava/lang/Short;

    .line 120
    .line 121
    invoke-virtual {p0}, Ljava/lang/Short;->shortValue()S

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 130
    .line 131
    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/utility/ConstantValue$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 136
    .line 137
    .line 138
    return-object v0

    .line 139
    :cond_6
    instance-of v0, p0, Ljava/lang/Character;

    .line 140
    .line 141
    if-eqz v0, :cond_7

    .line 142
    .line 143
    new-instance v0, Lnet/bytebuddy/utility/ConstantValue$Simple;

    .line 144
    .line 145
    check-cast p0, Ljava/lang/Character;

    .line 146
    .line 147
    invoke-virtual {p0}, Ljava/lang/Character;->charValue()C

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 156
    .line 157
    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/utility/ConstantValue$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 162
    .line 163
    .line 164
    return-object v0

    .line 165
    :cond_7
    instance-of v0, p0, Ljava/lang/Class;

    .line 166
    .line 167
    if-eqz v0, :cond_9

    .line 168
    .line 169
    check-cast p0, Ljava/lang/Class;

    .line 170
    .line 171
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-eqz v0, :cond_8

    .line 176
    .line 177
    new-instance v0, Lnet/bytebuddy/utility/ConstantValue$Simple;

    .line 178
    .line 179
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-direct {v0, p0, v1}, Lnet/bytebuddy/utility/ConstantValue$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 192
    .line 193
    .line 194
    return-object v0

    .line 195
    :cond_8
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    return-object p0

    .line 204
    :cond_9
    instance-of v0, p0, Ljava/lang/Enum;

    .line 205
    .line 206
    if-eqz v0, :cond_a

    .line 207
    .line 208
    new-instance v0, Lnet/bytebuddy/utility/ConstantValue$Simple;

    .line 209
    .line 210
    new-instance v1, Lnet/bytebuddy/description/enumeration/EnumerationDescription$ForLoadedEnumeration;

    .line 211
    .line 212
    check-cast p0, Ljava/lang/Enum;

    .line 213
    .line 214
    invoke-direct {v1, p0}, Lnet/bytebuddy/description/enumeration/EnumerationDescription$ForLoadedEnumeration;-><init>(Ljava/lang/Enum;)V

    .line 215
    .line 216
    .line 217
    invoke-static {v1}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forEnumeration(Lnet/bytebuddy/description/enumeration/EnumerationDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-virtual {p0}, Ljava/lang/Enum;->getDeclaringClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    invoke-direct {v0, v1, p0}, Lnet/bytebuddy/utility/ConstantValue$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 230
    .line 231
    .line 232
    return-object v0

    .line 233
    :cond_a
    invoke-static {p0}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofLoadedOrNull(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
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
    iget-object v2, p0, Lnet/bytebuddy/utility/ConstantValue$Simple;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/utility/ConstantValue$Simple;

    .line 23
    .line 24
    iget-object v3, p1, Lnet/bytebuddy/utility/ConstantValue$Simple;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/utility/ConstantValue$Simple;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 34
    .line 35
    iget-object p1, p1, Lnet/bytebuddy/utility/ConstantValue$Simple;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_4

    .line 42
    .line 43
    return v1

    .line 44
    :cond_4
    return v0
.end method

.method public getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/ConstantValue$Simple;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 2
    .line 3
    return-object p0
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
    iget-object v2, p0, Lnet/bytebuddy/utility/ConstantValue$Simple;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 13
    .line 14
    invoke-static {v2, v0, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世(Lnet/bytebuddy/implementation/bytecode/StackManipulation;II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object p0, p0, Lnet/bytebuddy/utility/ConstantValue$Simple;->typeDescription:Lnet/bytebuddy/description/type/TypeDescription;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v0

    .line 25
    return p0
.end method

.method public toStackManipulation()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/ConstantValue$Simple;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 2
    .line 3
    return-object p0
.end method
