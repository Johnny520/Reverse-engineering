.class abstract Lbsh/ExecutingInvocable;
.super Lbsh/Invocable;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field private final isVarargs:Z

.field private final parameterCount:I

.field private final parameterTypes:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final varArgsType:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Executable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<M:",
            "Ljava/lang/reflect/Executable;",
            ":",
            "Ljava/lang/reflect/Member;",
            ">(TM;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lbsh/Invocable;-><init>(Ljava/lang/reflect/AccessibleObject;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/reflect/Executable;->getParameterTypes()[Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lbsh/ExecutingInvocable;->parameterTypes:[Ljava/lang/Class;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/reflect/Executable;->getParameterCount()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Lbsh/ExecutingInvocable;->parameterCount:I

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/reflect/Executable;->isVarArgs()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput-boolean p1, p0, Lbsh/ExecutingInvocable;->isVarargs:Z

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    if-le v0, p1, :cond_0

    .line 24
    .line 25
    sub-int/2addr v0, p1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    iput v0, p0, Lbsh/Invocable;->lastParameterIndex:I

    .line 29
    .line 30
    invoke-virtual {p0}, Lbsh/ExecutingInvocable;->isVarArgs()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, Lbsh/ExecutingInvocable;->getParameterTypes()[Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget v0, p0, Lbsh/Invocable;->lastParameterIndex:I

    .line 41
    .line 42
    aget-object p1, p1, v0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    sget-object p1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 46
    .line 47
    :goto_1
    iput-object p1, p0, Lbsh/ExecutingInvocable;->varArgsType:Ljava/lang/Class;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public collectParamaters(Ljava/lang/Object;[Ljava/lang/Object;)Lbsh/Invocable$ParameterType;
    .locals 5

    .line 1
    invoke-super {p0, p1, p2}, Lbsh/Invocable;->collectParamaters(Ljava/lang/Object;[Ljava/lang/Object;)Lbsh/Invocable$ParameterType;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lbsh/ExecutingInvocable;->isVarArgs()Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_5

    .line 10
    .line 11
    invoke-virtual {p0}, Lbsh/Invocable;->getLastParameterIndex()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    array-length v1, p2

    .line 16
    const/4 v2, 0x1

    .line 17
    if-ge p1, v1, :cond_4

    .line 18
    .line 19
    invoke-virtual {p0}, Lbsh/Invocable;->getLastParameterIndex()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    aget-object p1, p2, p1

    .line 24
    .line 25
    invoke-virtual {p0}, Lbsh/ExecutingInvocable;->getParameterCount()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    array-length v3, p2

    .line 30
    if-ne v1, v3, :cond_0

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    invoke-virtual {p0}, Lbsh/ExecutingInvocable;->getVarArgsComponentType()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v3}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    iget-object p2, p0, Lbsh/Invocable;->parameters:Ljava/util/List;

    .line 63
    .line 64
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_0
    invoke-virtual {p0}, Lbsh/ExecutingInvocable;->getParameterCount()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    array-length v3, p2

    .line 73
    if-ne v1, v3, :cond_2

    .line 74
    .line 75
    if-eqz p1, :cond_2

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_2

    .line 86
    .line 87
    const-class v1, [Ljava/lang/Object;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    invoke-virtual {v1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_2

    .line 98
    .line 99
    check-cast p1, [Ljava/lang/Object;

    .line 100
    .line 101
    invoke-virtual {p0}, Lbsh/ExecutingInvocable;->getVarArgsComponentType()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    array-length v1, p1

    .line 106
    invoke-static {p2, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    :goto_0
    array-length v1, p1

    .line 111
    if-ge v0, v1, :cond_1

    .line 112
    .line 113
    aget-object v1, p1, v0

    .line 114
    .line 115
    invoke-virtual {p0}, Lbsh/ExecutingInvocable;->getVarArgsComponentType()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-super {p0, v1, v3}, Lbsh/Invocable;->coerceToType(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-static {p2, v0, v1}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    add-int/lit8 v0, v0, 0x1

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_1
    iget-object p1, p0, Lbsh/Invocable;->parameters:Ljava/util/List;

    .line 130
    .line 131
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_2
    array-length p1, p2

    .line 136
    invoke-virtual {p0}, Lbsh/Invocable;->getLastParameterIndex()I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    sub-int/2addr p1, v1

    .line 141
    invoke-virtual {p0}, Lbsh/ExecutingInvocable;->getVarArgsComponentType()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-static {v1, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    :goto_1
    if-ge v0, p1, :cond_3

    .line 150
    .line 151
    invoke-virtual {p0}, Lbsh/Invocable;->getLastParameterIndex()I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    add-int/2addr v3, v0

    .line 156
    aget-object v3, p2, v3

    .line 157
    .line 158
    invoke-virtual {p0}, Lbsh/ExecutingInvocable;->getVarArgsComponentType()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-super {p0, v3, v4}, Lbsh/Invocable;->coerceToType(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-static {v1, v0, v3}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    add-int/lit8 v0, v0, 0x1

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_3
    iget-object p1, p0, Lbsh/Invocable;->parameters:Ljava/util/List;

    .line 173
    .line 174
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    :goto_2
    move v0, v2

    .line 178
    goto :goto_3

    .line 179
    :cond_4
    iget-object p1, p0, Lbsh/Invocable;->parameters:Ljava/util/List;

    .line 180
    .line 181
    invoke-virtual {p0}, Lbsh/ExecutingInvocable;->getVarArgsComponentType()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    invoke-static {p2, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_5
    if-eqz p2, :cond_6

    .line 194
    .line 195
    invoke-virtual {p0}, Lbsh/Invocable;->getLastParameterIndex()I

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    array-length v1, p2

    .line 200
    if-ge p1, v1, :cond_6

    .line 201
    .line 202
    iget-object p1, p0, Lbsh/Invocable;->parameters:Ljava/util/List;

    .line 203
    .line 204
    invoke-virtual {p0}, Lbsh/Invocable;->getLastParameterIndex()I

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    aget-object p2, p2, v1

    .line 209
    .line 210
    invoke-virtual {p0}, Lbsh/ExecutingInvocable;->getParameterTypes()[Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-virtual {p0}, Lbsh/Invocable;->getLastParameterIndex()I

    .line 215
    .line 216
    .line 217
    move-result v2

    .line 218
    aget-object v1, v1, v2

    .line 219
    .line 220
    invoke-super {p0, p2, v1}, Lbsh/Invocable;->coerceToType(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p2

    .line 224
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    :cond_6
    :goto_3
    new-instance p1, Lbsh/Invocable$ParameterType;

    .line 228
    .line 229
    iget-object p2, p0, Lbsh/Invocable;->parameters:Ljava/util/List;

    .line 230
    .line 231
    invoke-direct {p1, p2, v0}, Lbsh/Invocable$ParameterType;-><init>(Ljava/util/List;Z)V

    .line 232
    .line 233
    .line 234
    return-object p1
.end method

.method public getParameterCount()I
    .locals 1

    .line 1
    iget v0, p0, Lbsh/ExecutingInvocable;->parameterCount:I

    .line 2
    .line 3
    return v0
.end method

.method public getParameterTypes()[Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/ExecutingInvocable;->parameterTypes:[Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public getVarArgsComponentType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lbsh/ExecutingInvocable;->getVarArgsType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lbsh/Types;->arrayElementType(Ljava/lang/Class;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getVarArgsType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/ExecutingInvocable;->varArgsType:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public isVarArgs()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lbsh/ExecutingInvocable;->isVarargs:Z

    .line 2
    .line 3
    return v0
.end method

.method public lookup(Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/MethodHandle;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/ExecutingInvocable;->isVarArgs()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lbsh/ExecutingInvocable;->getVarArgsType()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/invoke/MethodHandle;->asVarargsCollector(Ljava/lang/Class;)Ljava/lang/invoke/MethodHandle;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :cond_0
    return-object p1
.end method
