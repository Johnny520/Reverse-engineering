.class public Lcom/esotericsoftware/kryo/util/Generics$GenericType;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/util/Generics;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GenericType"
.end annotation


# instance fields
.field arguments:[Lcom/esotericsoftware/kryo/util/Generics$GenericType;

.field type:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->initialize(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private initialize(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;)V
    .locals 5

    .line 1
    instance-of v0, p3, Ljava/lang/reflect/ParameterizedType;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p3, Ljava/lang/reflect/ParameterizedType;

    .line 7
    .line 8
    invoke-interface {p3}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Class;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->type:Ljava/lang/reflect/Type;

    .line 15
    .line 16
    invoke-interface {p3}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    array-length v0, p3

    .line 21
    new-array v2, v0, [Lcom/esotericsoftware/kryo/util/Generics$GenericType;

    .line 22
    .line 23
    iput-object v2, p0, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->arguments:[Lcom/esotericsoftware/kryo/util/Generics$GenericType;

    .line 24
    .line 25
    :goto_0
    if-ge v1, v0, :cond_2

    .line 26
    .line 27
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->arguments:[Lcom/esotericsoftware/kryo/util/Generics$GenericType;

    .line 28
    .line 29
    new-instance v3, Lcom/esotericsoftware/kryo/util/Generics$GenericType;

    .line 30
    .line 31
    aget-object v4, p3, v1

    .line 32
    .line 33
    invoke-direct {v3, p1, p2, v4}, Lcom/esotericsoftware/kryo/util/Generics$GenericType;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;)V

    .line 34
    .line 35
    .line 36
    aput-object v3, v2, v1

    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    instance-of v0, p3, Ljava/lang/reflect/GenericArrayType;

    .line 42
    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    move v2, v0

    .line 47
    :goto_1
    check-cast p3, Ljava/lang/reflect/GenericArrayType;

    .line 48
    .line 49
    invoke-interface {p3}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    instance-of v3, p3, Ljava/lang/reflect/GenericArrayType;

    .line 54
    .line 55
    if-nez v3, :cond_3

    .line 56
    .line 57
    invoke-direct {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->initialize(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p1, p2, p3}, Lcom/esotericsoftware/kryo/util/GenericsUtil;->resolveType(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    instance-of p2, p1, Ljava/lang/Class;

    .line 65
    .line 66
    if-eqz p2, :cond_2

    .line 67
    .line 68
    if-ne v2, v0, :cond_1

    .line 69
    .line 70
    check-cast p1, Ljava/lang/Class;

    .line 71
    .line 72
    invoke-static {p1, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->type:Ljava/lang/reflect/Type;

    .line 81
    .line 82
    return-void

    .line 83
    :cond_1
    check-cast p1, Ljava/lang/Class;

    .line 84
    .line 85
    new-array p2, v2, [I

    .line 86
    .line 87
    invoke-static {p1, p2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->type:Ljava/lang/reflect/Type;

    .line 96
    .line 97
    :cond_2
    return-void

    .line 98
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    invoke-static {p1, p2, p3}, Lcom/esotericsoftware/kryo/util/GenericsUtil;->resolveType(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->type:Ljava/lang/reflect/Type;

    .line 106
    .line 107
    return-void
.end method


# virtual methods
.method public getType()Ljava/lang/reflect/Type;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->type:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTypeParameters()[Lcom/esotericsoftware/kryo/util/Generics$GenericType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->arguments:[Lcom/esotericsoftware/kryo/util/Generics$GenericType;

    .line 2
    .line 3
    return-object p0
.end method

.method public resolve(Lcom/esotericsoftware/kryo/util/Generics;)Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->type:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    instance-of v0, p0, Ljava/lang/Class;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Ljava/lang/Class;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    check-cast p0, Ljava/lang/reflect/TypeVariable;

    .line 11
    .line 12
    invoke-interface {p1, p0}, Lcom/esotericsoftware/kryo/util/Generics;->resolveTypeVariable(Ljava/lang/reflect/TypeVariable;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->type:Ljava/lang/reflect/Type;

    .line 9
    .line 10
    instance-of v2, v1, Ljava/lang/Class;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_3

    .line 14
    .line 15
    check-cast v1, Ljava/lang/Class;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-static {v1}, Lcom/esotericsoftware/kryo/util/Util;->getElementClass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->arguments:[Lcom/esotericsoftware/kryo/util/Generics$GenericType;

    .line 35
    .line 36
    if-eqz v1, :cond_4

    .line 37
    .line 38
    const/16 v1, 0x3c

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->arguments:[Lcom/esotericsoftware/kryo/util/Generics$GenericType;

    .line 44
    .line 45
    array-length v1, v1

    .line 46
    move v4, v3

    .line 47
    :goto_0
    if-ge v4, v1, :cond_2

    .line 48
    .line 49
    if-lez v4, :cond_1

    .line 50
    .line 51
    const-string v5, ", "

    .line 52
    .line 53
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    :cond_1
    iget-object v5, p0, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->arguments:[Lcom/esotericsoftware/kryo/util/Generics$GenericType;

    .line 57
    .line 58
    aget-object v5, v5, v4

    .line 59
    .line 60
    invoke-virtual {v5}, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    add-int/lit8 v4, v4, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    const/16 v1, 0x3e

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    move v2, v3

    .line 84
    :cond_4
    :goto_1
    if-eqz v2, :cond_5

    .line 85
    .line 86
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->type:Ljava/lang/reflect/Type;

    .line 87
    .line 88
    check-cast p0, Ljava/lang/Class;

    .line 89
    .line 90
    invoke-static {p0}, Lcom/esotericsoftware/kryo/util/Util;->getDimensionCount(Ljava/lang/Class;)I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    :goto_2
    if-ge v3, p0, :cond_5

    .line 95
    .line 96
    const-string v1, "[]"

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    add-int/lit8 v3, v3, 0x1

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0
.end method
