.class Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapEntry;
.super Lcom/alibaba/fastjson2/reader/ObjectReaderPrimitive;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field volatile keyReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field final keyType:Ljava/lang/reflect/Type;

.field volatile valueReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field final valueType:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V
    .locals 1

    .line 1
    const-class v0, Ljava/util/Map$Entry;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderPrimitive;-><init>(Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapEntry;->keyType:Ljava/lang/reflect/Type;

    .line 7
    .line 8
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapEntry;->valueType:Ljava/lang/reflect/Type;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->startArray()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne v0, v1, :cond_4

    .line 7
    .line 8
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapEntry;->keyType:Ljava/lang/reflect/Type;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readAny()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object v2, p1

    .line 17
    move-object v3, p2

    .line 18
    move-object v4, p3

    .line 19
    move-wide v5, p4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapEntry;->keyReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapEntry;->keyType:Ljava/lang/reflect/Type;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapEntry;->keyReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 32
    .line 33
    :cond_1
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapEntry;->keyReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 34
    .line 35
    move-object v2, p1

    .line 36
    move-object v3, p2

    .line 37
    move-object v4, p3

    .line 38
    move-wide v5, p4

    .line 39
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :goto_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapEntry;->valueType:Ljava/lang/reflect/Type;

    .line 44
    .line 45
    if-nez p1, :cond_2

    .line 46
    .line 47
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader;->readAny()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapEntry;->valueReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 53
    .line 54
    if-nez p1, :cond_3

    .line 55
    .line 56
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapEntry;->valueType:Ljava/lang/reflect/Type;

    .line 57
    .line 58
    invoke-virtual {v2, p1}, Lcom/alibaba/fastjson2/JSONReader;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapEntry;->valueReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 63
    .line 64
    :cond_3
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapEntry;->valueReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 65
    .line 66
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    :goto_1
    new-instance p2, Ljava/util/AbstractMap$SimpleEntry;

    .line 71
    .line 72
    invoke-direct {p2, v0, p1}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-object p2

    .line 76
    :cond_4
    move-object v2, p1

    .line 77
    new-instance p1, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    const-string p2, "entryCnt must be 2, but "

    .line 80
    .line 81
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {v2, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const/4 p1, 0x0

    .line 99
    return-object p1
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectStart()Z

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readAny()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/16 v1, 0x3a

    .line 9
    .line 10
    invoke-virtual {p1, v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(C)Z

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapEntry;->valueType:Ljava/lang/reflect/Type;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readAny()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    move-object v3, p1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapEntry;->valueReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapEntry;->valueType:Ljava/lang/reflect/Type;

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Lcom/alibaba/fastjson2/JSONReader;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapEntry;->valueReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 34
    .line 35
    :cond_1
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapEntry;->valueReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 36
    .line 37
    move-object v3, p1

    .line 38
    move-object v4, p2

    .line 39
    move-object v5, p3

    .line 40
    move-wide v6, p4

    .line 41
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    :goto_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectEnd()Z

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 49
    .line 50
    .line 51
    new-instance p1, Ljava/util/AbstractMap$SimpleEntry;

    .line 52
    .line 53
    invoke-direct {p1, v0, p2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-object p1
.end method
