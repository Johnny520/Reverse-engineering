.class public abstract Lretrofit2/飘花落叶言子楪兰哲世苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static 飘花落叶言子楪世哲苏兰:Ljava/lang/reflect/Constructor; = null

.field public static 飘花落叶言子楪世苏兰哲:Z = true

.field public static final 飘花落叶言子楪世苏哲兰:[Ljava/lang/reflect/Type;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/reflect/Type;

    .line 3
    .line 4
    sput-object v0, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:[Ljava/lang/reflect/Type;

    .line 5
    .line 6
    return-void
.end method

.method public static 飘花落叶言子楪世兰哲苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 3

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    return-object p2

    .line 4
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    if-eqz p2, :cond_3

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    array-length v0, p2

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, v0, :cond_3

    .line 17
    .line 18
    aget-object v2, p2, v1

    .line 19
    .line 20
    if-ne v2, p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    aget-object p0, p0, v1

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    invoke-virtual {p1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Class;->getGenericInterfaces()[Ljava/lang/reflect/Type;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    aget-object p0, p0, v1

    .line 40
    .line 41
    aget-object p2, p2, v1

    .line 42
    .line 43
    invoke-static {p2, p1, p0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Class;->isInterface()Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-nez p2, :cond_6

    .line 56
    .line 57
    :goto_1
    const-class p2, Ljava/lang/Object;

    .line 58
    .line 59
    if-eq p0, p2, :cond_6

    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    if-ne p2, p1, :cond_4

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_4
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-static {p2, p1, p0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0

    .line 87
    :cond_5
    move-object p0, p2

    .line 88
    goto :goto_1

    .line 89
    :cond_6
    return-object p1
.end method

.method public static 飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p0, Ljava/lang/Class;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_1
    instance-of v1, p0, Ljava/lang/reflect/ParameterizedType;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v1, :cond_6

    .line 18
    .line 19
    instance-of v1, p1, Ljava/lang/reflect/ParameterizedType;

    .line 20
    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 25
    .line 26
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 27
    .line 28
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    if-eq v1, v3, :cond_4

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    move v1, v2

    .line 48
    goto :goto_1

    .line 49
    :cond_4
    :goto_0
    move v1, v0

    .line 50
    :goto_1
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-eqz v1, :cond_5

    .line 75
    .line 76
    if-eqz v3, :cond_5

    .line 77
    .line 78
    if-eqz p0, :cond_5

    .line 79
    .line 80
    return v0

    .line 81
    :cond_5
    return v2

    .line 82
    :cond_6
    instance-of v1, p0, Ljava/lang/reflect/GenericArrayType;

    .line 83
    .line 84
    if-eqz v1, :cond_8

    .line 85
    .line 86
    instance-of v0, p1, Ljava/lang/reflect/GenericArrayType;

    .line 87
    .line 88
    if-nez v0, :cond_7

    .line 89
    .line 90
    return v2

    .line 91
    :cond_7
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .line 92
    .line 93
    check-cast p1, Ljava/lang/reflect/GenericArrayType;

    .line 94
    .line 95
    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-interface {p1}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {p0, p1}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Z

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    return p0

    .line 108
    :cond_8
    instance-of v1, p0, Ljava/lang/reflect/WildcardType;

    .line 109
    .line 110
    if-eqz v1, :cond_b

    .line 111
    .line 112
    instance-of v1, p1, Ljava/lang/reflect/WildcardType;

    .line 113
    .line 114
    if-nez v1, :cond_9

    .line 115
    .line 116
    return v2

    .line 117
    :cond_9
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 118
    .line 119
    check-cast p1, Ljava/lang/reflect/WildcardType;

    .line 120
    .line 121
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-interface {p1}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eqz v1, :cond_a

    .line 134
    .line 135
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-interface {p1}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    if-eqz p0, :cond_a

    .line 148
    .line 149
    return v0

    .line 150
    :cond_a
    return v2

    .line 151
    :cond_b
    instance-of v1, p0, Ljava/lang/reflect/TypeVariable;

    .line 152
    .line 153
    if-eqz v1, :cond_d

    .line 154
    .line 155
    instance-of v1, p1, Ljava/lang/reflect/TypeVariable;

    .line 156
    .line 157
    if-nez v1, :cond_c

    .line 158
    .line 159
    return v2

    .line 160
    :cond_c
    check-cast p0, Ljava/lang/reflect/TypeVariable;

    .line 161
    .line 162
    check-cast p1, Ljava/lang/reflect/TypeVariable;

    .line 163
    .line 164
    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-interface {p1}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    if-ne v1, v3, :cond_d

    .line 173
    .line 174
    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-interface {p1}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result p0

    .line 186
    if-eqz p0, :cond_d

    .line 187
    .line 188
    return v0

    .line 189
    :cond_d
    return v2
.end method

.method public static 飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Type;)V
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Class;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲()V

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    return-void
.end method

.method public static final 飘花落叶言子楪世哲苏兰(Lretrofit2/飘花落叶言子楪世兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪苏哲兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p1}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲()V

    .line 12
    .line 13
    .line 14
    new-instance p1, Lretrofit2/飘花落叶言子楪兰苏世哲;

    .line 15
    .line 16
    invoke-direct {p1, p0, v1}, Lretrofit2/飘花落叶言子楪兰苏世哲;-><init>(Lretrofit2/飘花落叶言子楪世兰苏哲;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏哲世(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 20
    .line 21
    .line 22
    new-instance p1, Lretrofit2/飘花落叶言子楪兰苏哲世;

    .line 23
    .line 24
    invoke-direct {p1, v0, v1}, Lretrofit2/飘花落叶言子楪兰苏哲世;-><init>(Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0, p1}, Lretrofit2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(Lretrofit2/飘花落叶言子楪苏世兰哲;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 35
    .line 36
    return-object p0
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Lretrofit2/飘花落叶言子楪世兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪苏哲兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p1}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲()V

    .line 12
    .line 13
    .line 14
    new-instance p1, Lretrofit2/飘花落叶言子楪兰苏世哲;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {p1, p0, v1}, Lretrofit2/飘花落叶言子楪兰苏世哲;-><init>(Lretrofit2/飘花落叶言子楪世兰苏哲;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏哲世(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 21
    .line 22
    .line 23
    new-instance p1, Lretrofit2/飘花落叶言子楪兰苏哲世;

    .line 24
    .line 25
    invoke-direct {p1, v0, v1}, Lretrofit2/飘花落叶言子楪兰苏哲世;-><init>(Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p0, p1}, Lretrofit2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(Lretrofit2/飘花落叶言子楪苏世兰哲;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lkotlinx/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 36
    .line 37
    return-object p0
.end method

.method public static 飘花落叶言子楪兰世苏哲(Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Class;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static varargs 飘花落叶言子楪哲世兰苏(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;
    .locals 1

    .line 1
    sget-object v0, Lretrofit2/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:Lretrofit2/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lretrofit2/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/reflect/Method;I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p2, " ("

    .line 16
    .line 17
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p1, ")"

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/4 p2, 0x0

    .line 33
    invoke-static {p0, p2, p1, p3}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public static varargs 飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;
    .locals 1

    .line 1
    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    new-instance p3, Ljava/lang/IllegalArgumentException;

    .line 6
    .line 7
    const-string v0, "\n    for method "

    .line 8
    .line 9
    invoke-static {p2, v0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v0, "."

    .line 25
    .line 26
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-direct {p3, p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    return-object p3
.end method

.method public static final 飘花落叶言子楪哲兰世苏(Ljava/lang/Throwable;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;
    .locals 6

    .line 1
    instance-of v0, p1, Lretrofit2/KotlinExtensions$suspendAndThrow$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lretrofit2/KotlinExtensions$suspendAndThrow$1;

    .line 7
    .line 8
    iget v1, v0, Lretrofit2/KotlinExtensions$suspendAndThrow$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lretrofit2/KotlinExtensions$suspendAndThrow$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lretrofit2/KotlinExtensions$suspendAndThrow$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lretrofit2/KotlinExtensions$suspendAndThrow$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lretrofit2/KotlinExtensions$suspendAndThrow$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lretrofit2/KotlinExtensions$suspendAndThrow$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    if-eq v2, v3, :cond_1

    .line 36
    .line 37
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 38
    .line 39
    invoke-static {p1}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_1
    iget-object v0, v0, Lretrofit2/KotlinExtensions$suspendAndThrow$1;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Ljava/lang/Throwable;

    .line 46
    .line 47
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰()V

    .line 51
    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iput-object p0, v0, Lretrofit2/KotlinExtensions$suspendAndThrow$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    iput v3, v0, Lretrofit2/KotlinExtensions$suspendAndThrow$1;->label:I

    .line 60
    .line 61
    sget-object p1, Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 62
    .line 63
    invoke-interface {v0}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    new-instance v3, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 68
    .line 69
    const/4 v4, 0x5

    .line 70
    const/4 v5, 0x0

    .line 71
    invoke-direct {v3, v4, v0, p0, v5}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v2, v3}, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Ljava/lang/Runnable;)V

    .line 75
    .line 76
    .line 77
    return-object v1
.end method

.method public static 飘花落叶言子楪哲兰苏世(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/VirtualMachineError;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    instance-of v0, p0, Ljava/lang/ThreadDeath;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    instance-of v0, p0, Ljava/lang/LinkageError;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    check-cast p0, Ljava/lang/LinkageError;

    .line 15
    .line 16
    throw p0

    .line 17
    :cond_1
    check-cast p0, Ljava/lang/ThreadDeath;

    .line 18
    .line 19
    throw p0

    .line 20
    :cond_2
    check-cast p0, Ljava/lang/VirtualMachineError;

    .line 21
    .line 22
    throw p0
.end method

.method public static varargs 飘花落叶言子楪哲苏世兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;
    .locals 1

    .line 1
    sget-object v0, Lretrofit2/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:Lretrofit2/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p2}, Lretrofit2/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/reflect/Method;I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p3, " ("

    .line 16
    .line 17
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p2, ")"

    .line 24
    .line 25
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-static {p0, p1, p2, p4}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/reflect/Method;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public static 飘花落叶言子楪哲苏兰世(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 8

    .line 1
    :goto_0
    instance-of v0, p2, Ljava/lang/reflect/TypeVariable;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_6

    .line 5
    .line 6
    check-cast p2, Ljava/lang/reflect/TypeVariable;

    .line 7
    .line 8
    invoke-interface {p2}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    instance-of v2, v0, Ljava/lang/Class;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    check-cast v0, Ljava/lang/Class;

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    move-object v0, v3

    .line 21
    :goto_1
    if-nez v0, :cond_1

    .line 22
    .line 23
    goto :goto_3

    .line 24
    :cond_1
    invoke-static {p0, v0, p1}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    instance-of v4, v2, Ljava/lang/reflect/ParameterizedType;

    .line 29
    .line 30
    if-eqz v4, :cond_4

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_2
    array-length v4, v0

    .line 37
    if-ge v1, v4, :cond_3

    .line 38
    .line 39
    aget-object v4, v0, v1

    .line 40
    .line 41
    invoke-virtual {p2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    check-cast v2, Ljava/lang/reflect/ParameterizedType;

    .line 48
    .line 49
    invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    aget-object v0, v0, v1

    .line 54
    .line 55
    goto :goto_4

    .line 56
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    invoke-static {}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏()V

    .line 60
    .line 61
    .line 62
    return-object v3

    .line 63
    :cond_4
    :goto_3
    move-object v0, p2

    .line 64
    :goto_4
    if-ne v0, p2, :cond_5

    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_5
    move-object p2, v0

    .line 68
    goto :goto_0

    .line 69
    :cond_6
    instance-of v0, p2, Ljava/lang/Class;

    .line 70
    .line 71
    if-eqz v0, :cond_8

    .line 72
    .line 73
    move-object v0, p2

    .line 74
    check-cast v0, Ljava/lang/Class;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_8

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-static {p0, p1, p2}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    if-ne p2, p0, :cond_7

    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_7
    new-instance p1, Lretrofit2/飘花落叶言子世兰哲苏楪;

    .line 94
    .line 95
    invoke-direct {p1, p0}, Lretrofit2/飘花落叶言子世兰哲苏楪;-><init>(Ljava/lang/reflect/Type;)V

    .line 96
    .line 97
    .line 98
    return-object p1

    .line 99
    :cond_8
    instance-of v0, p2, Ljava/lang/reflect/GenericArrayType;

    .line 100
    .line 101
    if-eqz v0, :cond_a

    .line 102
    .line 103
    check-cast p2, Ljava/lang/reflect/GenericArrayType;

    .line 104
    .line 105
    invoke-interface {p2}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {p0, p1, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    if-ne v0, p0, :cond_9

    .line 114
    .line 115
    return-object p2

    .line 116
    :cond_9
    new-instance p1, Lretrofit2/飘花落叶言子世兰哲苏楪;

    .line 117
    .line 118
    invoke-direct {p1, p0}, Lretrofit2/飘花落叶言子世兰哲苏楪;-><init>(Ljava/lang/reflect/Type;)V

    .line 119
    .line 120
    .line 121
    return-object p1

    .line 122
    :cond_a
    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    .line 123
    .line 124
    const/4 v2, 0x1

    .line 125
    if-eqz v0, :cond_10

    .line 126
    .line 127
    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    .line 128
    .line 129
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {p0, p1, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    if-eq v3, v0, :cond_b

    .line 138
    .line 139
    move v0, v2

    .line 140
    goto :goto_5

    .line 141
    :cond_b
    move v0, v1

    .line 142
    :goto_5
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    array-length v5, v4

    .line 147
    :goto_6
    if-ge v1, v5, :cond_e

    .line 148
    .line 149
    aget-object v6, v4, v1

    .line 150
    .line 151
    invoke-static {p0, p1, v6}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    aget-object v7, v4, v1

    .line 156
    .line 157
    if-eq v6, v7, :cond_d

    .line 158
    .line 159
    if-nez v0, :cond_c

    .line 160
    .line 161
    invoke-virtual {v4}, [Ljava/lang/reflect/Type;->clone()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    move-object v4, v0

    .line 166
    check-cast v4, [Ljava/lang/reflect/Type;

    .line 167
    .line 168
    move v0, v2

    .line 169
    :cond_c
    aput-object v6, v4, v1

    .line 170
    .line 171
    :cond_d
    add-int/lit8 v1, v1, 0x1

    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_e
    if-eqz v0, :cond_f

    .line 175
    .line 176
    new-instance p0, Lretrofit2/飘花落叶言子苏楪世哲兰;

    .line 177
    .line 178
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-direct {p0, v3, p1, v4}, Lretrofit2/飘花落叶言子苏楪世哲兰;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 183
    .line 184
    .line 185
    return-object p0

    .line 186
    :cond_f
    return-object p2

    .line 187
    :cond_10
    instance-of v0, p2, Ljava/lang/reflect/WildcardType;

    .line 188
    .line 189
    if-eqz v0, :cond_12

    .line 190
    .line 191
    check-cast p2, Ljava/lang/reflect/WildcardType;

    .line 192
    .line 193
    invoke-interface {p2}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-interface {p2}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    array-length v4, v0

    .line 202
    if-ne v4, v2, :cond_11

    .line 203
    .line 204
    aget-object v3, v0, v1

    .line 205
    .line 206
    invoke-static {p0, p1, v3}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    aget-object p1, v0, v1

    .line 211
    .line 212
    if-eq p0, p1, :cond_12

    .line 213
    .line 214
    new-instance p1, Lretrofit2/飘花落叶言子苏楪世兰哲;

    .line 215
    .line 216
    new-array p2, v2, [Ljava/lang/reflect/Type;

    .line 217
    .line 218
    const-class v0, Ljava/lang/Object;

    .line 219
    .line 220
    aput-object v0, p2, v1

    .line 221
    .line 222
    new-array v0, v2, [Ljava/lang/reflect/Type;

    .line 223
    .line 224
    aput-object p0, v0, v1

    .line 225
    .line 226
    invoke-direct {p1, p2, v0}, Lretrofit2/飘花落叶言子苏楪世兰哲;-><init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 227
    .line 228
    .line 229
    return-object p1

    .line 230
    :cond_11
    array-length v0, v3

    .line 231
    if-ne v0, v2, :cond_12

    .line 232
    .line 233
    aget-object v0, v3, v1

    .line 234
    .line 235
    invoke-static {p0, p1, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    aget-object p1, v3, v1

    .line 240
    .line 241
    if-eq p0, p1, :cond_12

    .line 242
    .line 243
    new-instance p1, Lretrofit2/飘花落叶言子苏楪世兰哲;

    .line 244
    .line 245
    new-array p2, v2, [Ljava/lang/reflect/Type;

    .line 246
    .line 247
    aput-object p0, p2, v1

    .line 248
    .line 249
    sget-object p0, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:[Ljava/lang/reflect/Type;

    .line 250
    .line 251
    invoke-direct {p1, p2, p0}, Lretrofit2/飘花落叶言子苏楪世兰哲;-><init>([Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 252
    .line 253
    .line 254
    return-object p1

    .line 255
    :cond_12
    return-object p2
.end method

.method public static 飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;
    .locals 3

    .line 1
    const-string v0, "type == null"

    .line 2
    .line 3
    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Ljava/lang/Class;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Ljava/lang/Class;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    instance-of v0, p0, Ljava/lang/Class;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    check-cast p0, Ljava/lang/Class;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    invoke-static {}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲()V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_2
    instance-of v0, p0, Ljava/lang/reflect/GenericArrayType;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .line 41
    .line 42
    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :cond_3
    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    const-class p0, Ljava/lang/Object;

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_4
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    .line 67
    .line 68
    if-eqz v0, :cond_5

    .line 69
    .line 70
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 71
    .line 72
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    aget-object p0, p0, v2

    .line 77
    .line 78
    invoke-static {p0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-string v2, "Expected a Class, ParameterizedType, or GenericArrayType, but <"

    .line 86
    .line 87
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    const-string v2, "> is of type "

    .line 102
    .line 103
    invoke-static {v0, v2, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    return-object v1
.end method

.method public static 飘花落叶言子楪苏世哲兰(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;
    .locals 4

    .line 1
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-ltz p0, :cond_1

    .line 6
    .line 7
    array-length v1, v0

    .line 8
    if-ge p0, v1, :cond_1

    .line 9
    .line 10
    aget-object p0, v0, p0

    .line 11
    .line 12
    instance-of p1, p0, Ljava/lang/reflect/WildcardType;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    check-cast p0, Ljava/lang/reflect/WildcardType;

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const/4 p1, 0x0

    .line 23
    aget-object p0, p0, p1

    .line 24
    .line 25
    :cond_0
    return-object p0

    .line 26
    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    const-string v2, "Index "

    .line 29
    .line 30
    const-string v3, " not in range [0,"

    .line 31
    .line 32
    invoke-static {p0, v2, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    array-length v0, v0

    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v0, ") for "

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v1
.end method

.method public static 飘花落叶言子楪苏兰世哲(Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-class v0, Ljava/lang/Class;

    .line 6
    .line 7
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    filled-new-array {v0, v1}, [Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-class v1, Ljava/lang/invoke/MethodHandles$Lookup;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/reflect/Constructor;

    .line 24
    .line 25
    :cond_0
    const/4 v1, -0x1

    .line 26
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Ljava/lang/invoke/MethodHandles$Lookup;

    .line 39
    .line 40
    invoke-virtual {v0, p0, p1}, Ljava/lang/invoke/MethodHandles$Lookup;->unreflectSpecial(Ljava/lang/reflect/Method;Ljava/lang/Class;)Ljava/lang/invoke/MethodHandle;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0, p2}, Ljava/lang/invoke/MethodHandle;->bindTo(Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0, p3}, Ljava/lang/invoke/MethodHandle;->invokeWithArguments([Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method

.method public static 飘花落叶言子楪苏兰哲世([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Z
    .locals 4

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    .line 6
    aget-object v3, p0, v2

    .line 7
    .line 8
    invoke-virtual {p1, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    return v1
.end method

.method public static 飘花落叶言子楪苏哲世兰(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 2

    .line 1
    const-class v0, Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static {p0, v0, p1}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p0, p1, v0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-static {}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲()V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public static 飘花落叶言子楪苏哲兰世(Ljava/lang/reflect/Type;)Z
    .locals 5

    .line 1
    instance-of v0, p0, Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    array-length v0, p0

    .line 19
    move v3, v1

    .line 20
    :goto_0
    if-ge v3, v0, :cond_2

    .line 21
    .line 22
    aget-object v4, p0, v3

    .line 23
    .line 24
    invoke-static {v4}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/reflect/Type;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_1

    .line 29
    .line 30
    return v2

    .line 31
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    return v1

    .line 35
    :cond_3
    instance-of v0, p0, Ljava/lang/reflect/GenericArrayType;

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .line 40
    .line 41
    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0}, Lretrofit2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/reflect/Type;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0

    .line 50
    :cond_4
    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    .line 51
    .line 52
    if-eqz v0, :cond_5

    .line 53
    .line 54
    return v2

    .line 55
    :cond_5
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    .line 56
    .line 57
    if-eqz v0, :cond_6

    .line 58
    .line 59
    return v2

    .line 60
    :cond_6
    if-nez p0, :cond_7

    .line 61
    .line 62
    const-string v0, "null"

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    :goto_1
    const-string v2, "Expected a Class, ParameterizedType, or GenericArrayType, but <"

    .line 74
    .line 75
    const-string v3, "> is of type "

    .line 76
    .line 77
    invoke-static {v2, p0, v3, v0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    return v1
.end method


# virtual methods
.method public abstract 飘花落叶言子楪世苏哲兰(Lretrofit2/飘花落叶言子世哲兰楪苏;Ljava/lang/Object;)V
.end method
