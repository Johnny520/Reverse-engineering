.class public abstract Lbsh/飘花落叶言子世苏楪兰哲;
.super Lbsh/飘花落叶言子世哲苏楪兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子世楪哲兰苏:Z

.field public final 飘花落叶言子世楪哲苏兰:I

.field public final 飘花落叶言子世楪苏兰哲:[Ljava/lang/Class;

.field public final 飘花落叶言子世楪苏哲兰:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Executable;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lbsh/飘花落叶言子世哲苏楪兰;-><init>(Ljava/lang/reflect/AccessibleObject;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/reflect/Executable;->getParameterTypes()[Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lbsh/飘花落叶言子世苏楪兰哲;->飘花落叶言子世楪苏兰哲:[Ljava/lang/Class;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/reflect/Executable;->getParameterCount()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iput v1, p0, Lbsh/飘花落叶言子世苏楪兰哲;->飘花落叶言子世楪哲苏兰:I

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/reflect/Executable;->isVarArgs()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput-boolean p1, p0, Lbsh/飘花落叶言子世苏楪兰哲;->飘花落叶言子世楪哲兰苏:Z

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    if-le v1, v2, :cond_0

    .line 24
    .line 25
    sub-int/2addr v1, v2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v1, 0x0

    .line 28
    :goto_0
    iput v1, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    aget-object p1, v0, v1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    sget-object p1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    :goto_1
    iput-object p1, p0, Lbsh/飘花落叶言子世苏楪兰哲;->飘花落叶言子世楪苏哲兰:Ljava/lang/Class;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏()[Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/飘花落叶言子世苏楪兰哲;->飘花落叶言子世楪苏兰哲:[Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲()I
    .locals 0

    .line 1
    iget p0, p0, Lbsh/飘花落叶言子世苏楪兰哲;->飘花落叶言子世楪哲苏兰:I

    .line 2
    .line 3
    return p0
.end method

.method public 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;[Ljava/lang/Object;)Lbsh/飘花落叶言子世哲楪兰苏;
    .locals 7

    .line 1
    invoke-super {p0, p1, p2}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;[Ljava/lang/Object;)Lbsh/飘花落叶言子世哲楪兰苏;

    .line 2
    .line 3
    .line 4
    iget p1, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 5
    .line 6
    iget-object v0, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰哲世苏:Ljava/util/ArrayList;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iget-boolean v2, p0, Lbsh/飘花落叶言子世苏楪兰哲;->飘花落叶言子世楪哲兰苏:Z

    .line 10
    .line 11
    if-eqz v2, :cond_5

    .line 12
    .line 13
    array-length v2, p2

    .line 14
    const/4 v3, 0x1

    .line 15
    iget-object v4, p0, Lbsh/飘花落叶言子世苏楪兰哲;->飘花落叶言子世楪苏哲兰:Ljava/lang/Class;

    .line 16
    .line 17
    if-ge p1, v2, :cond_4

    .line 18
    .line 19
    aget-object p1, p2, p1

    .line 20
    .line 21
    array-length v2, p2

    .line 22
    iget v5, p0, Lbsh/飘花落叶言子世苏楪兰哲;->飘花落叶言子世楪哲苏兰:I

    .line 23
    .line 24
    if-ne v5, v2, :cond_0

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    invoke-static {v4}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;)Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-virtual {v6}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-virtual {v2, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_0

    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_0
    array-length v2, p2

    .line 61
    if-ne v5, v2, :cond_2

    .line 62
    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_2

    .line 74
    .line 75
    const-class v2, [Ljava/lang/Object;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v2, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_2

    .line 86
    .line 87
    check-cast p1, [Ljava/lang/Object;

    .line 88
    .line 89
    invoke-static {v4}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;)Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    array-length p2, p1

    .line 94
    invoke-static {p0, p2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    :goto_0
    array-length p2, p1

    .line 99
    if-ge v1, p2, :cond_1

    .line 100
    .line 101
    aget-object p2, p1, v1

    .line 102
    .line 103
    invoke-static {v4}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;)Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-static {v2, p2}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-static {p0, v1, p2}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    add-int/lit8 v1, v1, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_1
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_2
    array-length p1, p2

    .line 122
    iget v2, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 123
    .line 124
    sub-int/2addr p1, v2

    .line 125
    invoke-static {v4}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;)Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-static {v2, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    :goto_1
    if-ge v1, p1, :cond_3

    .line 134
    .line 135
    iget v5, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 136
    .line 137
    add-int/2addr v5, v1

    .line 138
    aget-object v5, p2, v5

    .line 139
    .line 140
    invoke-static {v4}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;)Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    invoke-static {v6, v5}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    invoke-static {v2, v1, v5}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    add-int/lit8 v1, v1, 0x1

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_3
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    :goto_2
    move v1, v3

    .line 158
    goto :goto_3

    .line 159
    :cond_4
    invoke-static {v4}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;)Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-static {p0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_5
    array-length v2, p2

    .line 172
    if-ge p1, v2, :cond_6

    .line 173
    .line 174
    aget-object p2, p2, p1

    .line 175
    .line 176
    iget-object p0, p0, Lbsh/飘花落叶言子世苏楪兰哲;->飘花落叶言子世楪苏兰哲:[Ljava/lang/Class;

    .line 177
    .line 178
    aget-object p0, p0, p1

    .line 179
    .line 180
    invoke-static {p0, p2}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    :cond_6
    :goto_3
    new-instance p0, Lbsh/飘花落叶言子世哲楪兰苏;

    .line 188
    .line 189
    invoke-direct {p0, v0, v1}, Lbsh/飘花落叶言子世哲楪兰苏;-><init>(Ljava/util/ArrayList;Z)V

    .line 190
    .line 191
    .line 192
    return-object p0
.end method

.method public final 飘花落叶言子楪哲苏世兰()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lbsh/飘花落叶言子世苏楪兰哲;->飘花落叶言子世楪哲兰苏:Z

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子楪苏世兰哲()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/飘花落叶言子世苏楪兰哲;->飘花落叶言子世楪苏哲兰:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-static {p0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Class;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
