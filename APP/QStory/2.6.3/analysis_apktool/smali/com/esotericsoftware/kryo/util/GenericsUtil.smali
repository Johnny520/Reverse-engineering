.class public Lcom/esotericsoftware/kryo/util/GenericsUtil;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static resolveType(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 4

    .line 1
    instance-of v0, p2, Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p2

    .line 6
    :cond_0
    instance-of v0, p2, Ljava/lang/reflect/TypeVariable;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-static {p0, p1, p2, v1}, Lcom/esotericsoftware/kryo/util/GenericsUtil;->resolveTypeVariable(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Z)Ljava/lang/reflect/Type;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_1
    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    .line 21
    .line 22
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_2
    instance-of v0, p2, Ljava/lang/reflect/GenericArrayType;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-eqz v0, :cond_6

    .line 31
    .line 32
    move v0, v1

    .line 33
    :goto_0
    check-cast p2, Ljava/lang/reflect/GenericArrayType;

    .line 34
    .line 35
    invoke-interface {p2}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    instance-of v3, p2, Ljava/lang/reflect/GenericArrayType;

    .line 40
    .line 41
    if-nez v3, :cond_5

    .line 42
    .line 43
    invoke-static {p0, p1, p2}, Lcom/esotericsoftware/kryo/util/GenericsUtil;->resolveType(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    instance-of p1, p0, Ljava/lang/Class;

    .line 48
    .line 49
    if-nez p1, :cond_3

    .line 50
    .line 51
    return-object p2

    .line 52
    :cond_3
    if-ne v0, v1, :cond_4

    .line 53
    .line 54
    check-cast p0, Ljava/lang/Class;

    .line 55
    .line 56
    invoke-static {p0, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :cond_4
    check-cast p0, Ljava/lang/Class;

    .line 66
    .line 67
    new-array p1, v0, [I

    .line 68
    .line 69
    invoke-static {p0, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_6
    instance-of v0, p2, Ljava/lang/reflect/WildcardType;

    .line 82
    .line 83
    if-eqz v0, :cond_9

    .line 84
    .line 85
    check-cast p2, Ljava/lang/reflect/WildcardType;

    .line 86
    .line 87
    invoke-interface {p2}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    aget-object v0, v0, v2

    .line 92
    .line 93
    const-class v1, Ljava/lang/Object;

    .line 94
    .line 95
    if-eq v0, v1, :cond_7

    .line 96
    .line 97
    invoke-static {p0, p1, v0}, Lcom/esotericsoftware/kryo/util/GenericsUtil;->resolveType(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0

    .line 102
    :cond_7
    invoke-interface {p2}, Ljava/lang/reflect/WildcardType;->getLowerBounds()[Ljava/lang/reflect/Type;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    array-length v0, p2

    .line 107
    if-eqz v0, :cond_8

    .line 108
    .line 109
    aget-object p2, p2, v2

    .line 110
    .line 111
    invoke-static {p0, p1, p2}, Lcom/esotericsoftware/kryo/util/GenericsUtil;->resolveType(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0

    .line 116
    :cond_8
    return-object v1

    .line 117
    :cond_9
    new-instance p0, Lcom/esotericsoftware/kryo/KryoException;

    .line 118
    .line 119
    new-instance p1, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    const-string v0, "Unable to resolve type: "

    .line 122
    .line 123
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw p0
.end method

.method public static resolveTypeParameters(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;)[Ljava/lang/reflect/Type;
    .locals 4

    .line 1
    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p2, Ljava/lang/reflect/ParameterizedType;

    .line 6
    .line 7
    invoke-interface {p2}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    array-length v0, p2

    .line 12
    new-array v1, v0, [Ljava/lang/reflect/Type;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v0, :cond_0

    .line 16
    .line 17
    aget-object v3, p2, v2

    .line 18
    .line 19
    invoke-static {p0, p1, v3}, Lcom/esotericsoftware/kryo/util/GenericsUtil;->resolveType(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    aput-object v3, v1, v2

    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-object v1

    .line 29
    :cond_1
    instance-of v0, p2, Ljava/lang/reflect/GenericArrayType;

    .line 30
    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    :cond_2
    check-cast p2, Ljava/lang/reflect/GenericArrayType;

    .line 34
    .line 35
    invoke-interface {p2}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    instance-of v0, p2, Ljava/lang/reflect/GenericArrayType;

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    invoke-static {p0, p1, p2}, Lcom/esotericsoftware/kryo/util/GenericsUtil;->resolveTypeParameters(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;)[Ljava/lang/reflect/Type;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_3
    const/4 p0, 0x0

    .line 49
    return-object p0
.end method

.method private static resolveTypeVariable(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Z)Ljava/lang/reflect/Type;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ljava/lang/reflect/ParameterizedType;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    return-object p2

    .line 10
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eq v1, p0, :cond_1

    .line 16
    .line 17
    invoke-static {p0, v1, p2, v2}, Lcom/esotericsoftware/kryo/util/GenericsUtil;->resolveTypeVariable(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Z)Ljava/lang/reflect/Type;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    instance-of v3, p2, Ljava/lang/Class;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    return-object p2

    .line 26
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v1}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    array-length v4, v1

    .line 35
    :goto_0
    if-ge v2, v4, :cond_7

    .line 36
    .line 37
    aget-object v5, v1, v2

    .line 38
    .line 39
    invoke-interface {v5}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_6

    .line 48
    .line 49
    move-object v5, v0

    .line 50
    check-cast v5, Ljava/lang/reflect/ParameterizedType;

    .line 51
    .line 52
    invoke-interface {v5}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    aget-object v5, v5, v2

    .line 57
    .line 58
    instance-of v6, v5, Ljava/lang/Class;

    .line 59
    .line 60
    if-eqz v6, :cond_2

    .line 61
    .line 62
    return-object v5

    .line 63
    :cond_2
    instance-of v6, v5, Ljava/lang/reflect/ParameterizedType;

    .line 64
    .line 65
    if-eqz v6, :cond_3

    .line 66
    .line 67
    invoke-static {p0, p1, v5}, Lcom/esotericsoftware/kryo/util/GenericsUtil;->resolveType(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_3
    instance-of v6, v5, Ljava/lang/reflect/GenericArrayType;

    .line 73
    .line 74
    if-eqz v6, :cond_4

    .line 75
    .line 76
    invoke-static {p0, p1, v5}, Lcom/esotericsoftware/kryo/util/GenericsUtil;->resolveType(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :cond_4
    instance-of v6, v5, Ljava/lang/reflect/TypeVariable;

    .line 82
    .line 83
    if-eqz v6, :cond_6

    .line 84
    .line 85
    if-eqz p3, :cond_5

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_5
    return-object v5

    .line 89
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_7
    :goto_1
    return-object p2
.end method
