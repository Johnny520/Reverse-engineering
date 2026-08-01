.class public final Lcom/esotericsoftware/kryo/util/DefaultGenerics;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/esotericsoftware/kryo/util/Generics;


# instance fields
.field private arguments:[Ljava/lang/reflect/Type;

.field private argumentsSize:I

.field private depths:[I

.field private genericTypes:[Lcom/esotericsoftware/kryo/util/Generics$GenericType;

.field private genericTypesSize:I

.field private final kryo:Lcom/esotericsoftware/kryo/Kryo;


# direct methods
.method public constructor <init>(Lcom/esotericsoftware/kryo/Kryo;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x10

    .line 5
    .line 6
    new-array v1, v0, [Lcom/esotericsoftware/kryo/util/Generics$GenericType;

    .line 7
    .line 8
    iput-object v1, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->genericTypes:[Lcom/esotericsoftware/kryo/util/Generics$GenericType;

    .line 9
    .line 10
    new-array v1, v0, [I

    .line 11
    .line 12
    iput-object v1, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->depths:[I

    .line 13
    .line 14
    new-array v0, v0, [Ljava/lang/reflect/Type;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->arguments:[Ljava/lang/reflect/Type;

    .line 17
    .line 18
    iput-object p1, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->kryo:Lcom/esotericsoftware/kryo/Kryo;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public buildHierarchy(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;
    .locals 0

    .line 1
    new-instance p0, Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;-><init>(Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public getGenericTypesSize()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->genericTypesSize:I

    .line 2
    .line 3
    return p0
.end method

.method public nextGenericClass()Ljava/lang/Class;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->nextGenericTypes()[Lcom/esotericsoftware/kryo/util/Generics$GenericType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    aget-object v0, v0, v1

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->resolve(Lcom/esotericsoftware/kryo/util/Generics;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public nextGenericTypes()[Lcom/esotericsoftware/kryo/util/Generics$GenericType;
    .locals 4

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->genericTypesSize:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-lez v0, :cond_1

    .line 5
    .line 6
    add-int/lit8 v0, v0, -0x1

    .line 7
    .line 8
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->genericTypes:[Lcom/esotericsoftware/kryo/util/Generics$GenericType;

    .line 9
    .line 10
    aget-object v2, v2, v0

    .line 11
    .line 12
    iget-object v3, v2, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->arguments:[Lcom/esotericsoftware/kryo/util/Generics$GenericType;

    .line 13
    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_0
    iget-object v3, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->depths:[I

    .line 18
    .line 19
    aget v0, v3, v0

    .line 20
    .line 21
    iget-object v3, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->kryo:Lcom/esotericsoftware/kryo/Kryo;

    .line 22
    .line 23
    invoke-virtual {v3}, Lcom/esotericsoftware/kryo/Kryo;->getDepth()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    add-int/lit8 v3, v3, -0x1

    .line 28
    .line 29
    if-ne v0, v3, :cond_1

    .line 30
    .line 31
    iget-object v0, v2, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->arguments:[Lcom/esotericsoftware/kryo/util/Generics$GenericType;

    .line 32
    .line 33
    array-length v1, v0

    .line 34
    add-int/lit8 v1, v1, -0x1

    .line 35
    .line 36
    aget-object v0, v0, v1

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->pushGenericType(Lcom/esotericsoftware/kryo/util/Generics$GenericType;)V

    .line 39
    .line 40
    .line 41
    iget-object p0, v2, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->arguments:[Lcom/esotericsoftware/kryo/util/Generics$GenericType;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_1
    return-object v1
.end method

.method public popGenericType()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->genericTypesSize:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 7
    .line 8
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->depths:[I

    .line 9
    .line 10
    aget v1, v1, v0

    .line 11
    .line 12
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->kryo:Lcom/esotericsoftware/kryo/Kryo;

    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/esotericsoftware/kryo/Kryo;->getDepth()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-ge v1, v2, :cond_1

    .line 19
    .line 20
    :goto_0
    return-void

    .line 21
    :cond_1
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->genericTypes:[Lcom/esotericsoftware/kryo/util/Generics$GenericType;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    aput-object v2, v1, v0

    .line 25
    .line 26
    iput v0, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->genericTypesSize:I

    .line 27
    .line 28
    return-void
.end method

.method public popTypeVariables(I)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->argumentsSize:I

    .line 2
    .line 3
    sub-int p1, v0, p1

    .line 4
    .line 5
    iput p1, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->argumentsSize:I

    .line 6
    .line 7
    :goto_0
    if-ge p1, v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->arguments:[Ljava/lang/reflect/Type;

    .line 10
    .line 11
    add-int/lit8 v2, p1, 0x1

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    aput-object v3, v1, p1

    .line 15
    .line 16
    move p1, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void
.end method

.method public pushGenericType(Lcom/esotericsoftware/kryo/util/Generics$GenericType;)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->genericTypesSize:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->genericTypes:[Lcom/esotericsoftware/kryo/util/Generics$GenericType;

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    if-ne v1, v3, :cond_0

    .line 9
    .line 10
    array-length v3, v2

    .line 11
    shl-int/lit8 v3, v3, 0x1

    .line 12
    .line 13
    new-array v3, v3, [Lcom/esotericsoftware/kryo/util/Generics$GenericType;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-static {v2, v4, v3, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 17
    .line 18
    .line 19
    iput-object v3, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->genericTypes:[Lcom/esotericsoftware/kryo/util/Generics$GenericType;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->depths:[I

    .line 22
    .line 23
    array-length v3, v2

    .line 24
    shl-int/lit8 v3, v3, 0x1

    .line 25
    .line 26
    new-array v3, v3, [I

    .line 27
    .line 28
    invoke-static {v2, v4, v3, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 29
    .line 30
    .line 31
    iput-object v3, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->depths:[I

    .line 32
    .line 33
    :cond_0
    iput v1, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->genericTypesSize:I

    .line 34
    .line 35
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->genericTypes:[Lcom/esotericsoftware/kryo/util/Generics$GenericType;

    .line 36
    .line 37
    aput-object p1, v1, v0

    .line 38
    .line 39
    iget-object p1, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->depths:[I

    .line 40
    .line 41
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->kryo:Lcom/esotericsoftware/kryo/Kryo;

    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->getDepth()I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    aput p0, p1, v0

    .line 48
    .line 49
    return-void
.end method

.method public pushTypeVariables(Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;[Lcom/esotericsoftware/kryo/util/Generics$GenericType;)I
    .locals 10

    .line 1
    iget v0, p1, Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;->total:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_5

    .line 5
    .line 6
    iget v2, p1, Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;->rootTotal:I

    .line 7
    .line 8
    array-length v3, p2

    .line 9
    if-gt v2, v3, :cond_5

    .line 10
    .line 11
    array-length v2, p2

    .line 12
    iget-object v3, p1, Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;->counts:[I

    .line 13
    .line 14
    array-length v3, v3

    .line 15
    if-le v2, v3, :cond_0

    .line 16
    .line 17
    goto :goto_3

    .line 18
    :cond_0
    iget v2, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->argumentsSize:I

    .line 19
    .line 20
    add-int/2addr v0, v2

    .line 21
    iget-object v3, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->arguments:[Ljava/lang/reflect/Type;

    .line 22
    .line 23
    array-length v4, v3

    .line 24
    if-le v0, v4, :cond_1

    .line 25
    .line 26
    array-length v3, v3

    .line 27
    shl-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    new-array v0, v0, [Ljava/lang/reflect/Type;

    .line 34
    .line 35
    iget-object v3, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->arguments:[Ljava/lang/reflect/Type;

    .line 36
    .line 37
    invoke-static {v3, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->arguments:[Ljava/lang/reflect/Type;

    .line 41
    .line 42
    :cond_1
    iget-object v0, p1, Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;->counts:[I

    .line 43
    .line 44
    iget-object p1, p1, Lcom/esotericsoftware/kryo/util/Generics$GenericsHierarchy;->parameters:[Ljava/lang/reflect/TypeVariable;

    .line 45
    .line 46
    array-length v3, p2

    .line 47
    move v4, v1

    .line 48
    :goto_0
    if-ge v1, v3, :cond_4

    .line 49
    .line 50
    aget-object v5, p2, v1

    .line 51
    .line 52
    invoke-virtual {v5, p0}, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->resolve(Lcom/esotericsoftware/kryo/util/Generics;)Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    if-nez v5, :cond_2

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    aget v6, v0, v1

    .line 60
    .line 61
    add-int/2addr v6, v4

    .line 62
    :goto_1
    if-ge v4, v6, :cond_3

    .line 63
    .line 64
    iget-object v7, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->arguments:[Ljava/lang/reflect/Type;

    .line 65
    .line 66
    iget v8, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->argumentsSize:I

    .line 67
    .line 68
    aget-object v9, p1, v4

    .line 69
    .line 70
    aput-object v9, v7, v8

    .line 71
    .line 72
    add-int/lit8 v9, v8, 0x1

    .line 73
    .line 74
    aput-object v5, v7, v9

    .line 75
    .line 76
    add-int/lit8 v8, v8, 0x2

    .line 77
    .line 78
    iput v8, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->argumentsSize:I

    .line 79
    .line 80
    add-int/lit8 v4, v4, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_4
    iget p0, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->argumentsSize:I

    .line 87
    .line 88
    sub-int/2addr p0, v2

    .line 89
    return p0

    .line 90
    :cond_5
    :goto_3
    return v1
.end method

.method public resolveTypeVariable(Ljava/lang/reflect/TypeVariable;)Ljava/lang/Class;
    .locals 2

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->argumentsSize:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x2

    .line 4
    .line 5
    :goto_0
    if-ltz v0, :cond_2

    .line 6
    .line 7
    iget-object v1, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->arguments:[Ljava/lang/reflect/Type;

    .line 8
    .line 9
    aget-object v1, v1, v0

    .line 10
    .line 11
    if-eq v1, p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    add-int/lit8 v0, v0, -0x2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    :goto_1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->arguments:[Ljava/lang/reflect/Type;

    .line 24
    .line 25
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    aget-object p0, p0, v0

    .line 28
    .line 29
    check-cast p0, Ljava/lang/Class;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_2
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    iget v2, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->argumentsSize:I

    .line 8
    .line 9
    if-ge v1, v2, :cond_1

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const-string v2, ", "

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->arguments:[Ljava/lang/reflect/Type;

    .line 19
    .line 20
    aget-object v2, v2, v1

    .line 21
    .line 22
    check-cast v2, Ljava/lang/reflect/TypeVariable;

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v2, "="

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Lcom/esotericsoftware/kryo/util/DefaultGenerics;->arguments:[Ljava/lang/reflect/Type;

    .line 37
    .line 38
    add-int/lit8 v3, v1, 0x1

    .line 39
    .line 40
    aget-object v2, v2, v3

    .line 41
    .line 42
    check-cast v2, Ljava/lang/Class;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    add-int/lit8 v1, v1, 0x2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method
