.class final Lcom/alibaba/fastjson2/reader/ObjectArrayReaderMultiType;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/ObjectReader;


# instance fields
.field final readers:[Lcom/alibaba/fastjson2/reader/ObjectReader;

.field final types:[Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Lcom/alibaba/fastjson2/util/MultiType;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/util/MultiType;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    new-array v1, v0, [Ljava/lang/reflect/Type;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/util/MultiType;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-ge v2, v3, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/util/MultiType;->getType(I)Ljava/lang/reflect/Type;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    aput-object v3, v1, v2

    .line 22
    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectArrayReaderMultiType;->types:[Ljava/lang/reflect/Type;

    .line 27
    .line 28
    new-array p1, v0, [Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 29
    .line 30
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectArrayReaderMultiType;->readers:[Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public createInstance(Ljava/util/Collection;J)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectArrayReaderMultiType;->types:[Ljava/lang/reflect/Type;

    .line 2
    .line 3
    array-length p1, p1

    .line 4
    new-array p1, p1, [Ljava/lang/Object;

    .line 5
    .line 6
    return-object p1
.end method

.method public getObjectReader(Lcom/alibaba/fastjson2/JSONReader;I)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectArrayReaderMultiType;->readers:[Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 2
    .line 3
    aget-object v0, v0, p2

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectArrayReaderMultiType;->types:[Ljava/lang/reflect/Type;

    .line 8
    .line 9
    aget-object v0, v0, p2

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectArrayReaderMultiType;->readers:[Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 16
    .line 17
    aput-object p1, v0, p2

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    return-object v0
.end method

.method public readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->startArray()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 p3, -0x1

    .line 6
    const/4 v0, 0x0

    .line 7
    if-ne p2, p3, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectArrayReaderMultiType;->types:[Ljava/lang/reflect/Type;

    .line 11
    .line 12
    array-length p3, p3

    .line 13
    new-array p3, p3, [Ljava/lang/Object;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, p2, :cond_3

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isReference()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readReference()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v3, ".."

    .line 29
    .line 30
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    move-object v2, p3

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-static {v2}, Lcom/alibaba/fastjson2/JSONPath;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {p1, p3, v1, v2}, Lcom/alibaba/fastjson2/JSONReader;->addResolveTask([Ljava/lang/Object;ILcom/alibaba/fastjson2/JSONPath;)V

    .line 43
    .line 44
    .line 45
    move-object v2, v0

    .line 46
    :goto_1
    move-object v4, p1

    .line 47
    move-wide v7, p4

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    invoke-virtual {p0, p1, v1}, Lcom/alibaba/fastjson2/reader/ObjectArrayReaderMultiType;->getObjectReader(Lcom/alibaba/fastjson2/JSONReader;I)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectArrayReaderMultiType;->types:[Ljava/lang/reflect/Type;

    .line 54
    .line 55
    aget-object v5, v2, v1

    .line 56
    .line 57
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    move-object v4, p1

    .line 62
    move-wide v7, p4

    .line 63
    invoke-interface/range {v3 .. v8}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    :goto_2
    aput-object v2, p3, v1

    .line 68
    .line 69
    add-int/lit8 v1, v1, 0x1

    .line 70
    .line 71
    move-object p1, v4

    .line 72
    move-wide p4, v7

    .line 73
    goto :goto_0

    .line 74
    :cond_3
    return-object p3
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/JSONReader;->jsonb:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide/16 v5, 0x0

    .line 6
    .line 7
    move-object v1, p0

    .line 8
    move-object v2, p1

    .line 9
    move-object v3, p2

    .line 10
    move-object v4, p3

    .line 11
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectArrayReaderMultiType;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    move-object v1, p0

    .line 17
    move-object v2, p1

    .line 18
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNullOrEmptyString()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/4 p2, 0x0

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    return-object p2

    .line 26
    :cond_1
    iget-object p1, v1, Lcom/alibaba/fastjson2/reader/ObjectArrayReaderMultiType;->types:[Ljava/lang/reflect/Type;

    .line 27
    .line 28
    array-length p1, p1

    .line 29
    new-array p1, p1, [Ljava/lang/Object;

    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayStart()Z

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    if-eqz p3, :cond_5

    .line 36
    .line 37
    const/4 p3, 0x0

    .line 38
    :goto_0
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 45
    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_2
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->isReference()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->readReference()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v3, ".."

    .line 59
    .line 60
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_3

    .line 65
    .line 66
    move-object v0, p1

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-static {v0}, Lcom/alibaba/fastjson2/JSONPath;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v2, p1, p3, v0}, Lcom/alibaba/fastjson2/JSONReader;->addResolveTask([Ljava/lang/Object;ILcom/alibaba/fastjson2/JSONPath;)V

    .line 73
    .line 74
    .line 75
    move-object v0, p2

    .line 76
    :goto_1
    move-wide v6, p4

    .line 77
    goto :goto_2

    .line 78
    :cond_4
    move-object v3, v2

    .line 79
    invoke-virtual {p0, v3, p3}, Lcom/alibaba/fastjson2/reader/ObjectArrayReaderMultiType;->getObjectReader(Lcom/alibaba/fastjson2/JSONReader;I)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    iget-object v0, v1, Lcom/alibaba/fastjson2/reader/ObjectArrayReaderMultiType;->types:[Ljava/lang/reflect/Type;

    .line 84
    .line 85
    aget-object v4, v0, p3

    .line 86
    .line 87
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    move-wide v6, p4

    .line 92
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    move-object v2, v3

    .line 97
    :goto_2
    aput-object v0, p1, p3

    .line 98
    .line 99
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 100
    .line 101
    .line 102
    add-int/lit8 p3, p3, 0x1

    .line 103
    .line 104
    move-wide p4, v6

    .line 105
    goto :goto_0

    .line 106
    :cond_5
    const-string p1, "TODO"

    .line 107
    .line 108
    invoke-virtual {v2, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    const/4 p1, 0x0

    .line 116
    return-object p1
.end method
