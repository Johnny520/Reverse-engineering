.class public Lcom/alibaba/fastjson2/reader/FieldReaderMapMethod;
.super Lcom/alibaba/fastjson2/reader/FieldReaderObject;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/alibaba/fastjson2/reader/FieldReaderObject<",
        "TT;>;"
    }
.end annotation


# instance fields
.field protected final arrayToMapDuplicateHandler:Ljava/util/function/BiConsumer;

.field protected final arrayToMapKey:Ljava/lang/String;

.field protected final namingStrategy:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

.field protected final valueType:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/util/function/BiConsumer;Ljava/lang/String;Ljava/util/function/BiConsumer;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p12}, Lcom/alibaba/fastjson2/reader/FieldReaderObject;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/util/function/BiConsumer;)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/TypeUtils;->getMapValueType(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    iput-object p2, p1, Lcom/alibaba/fastjson2/reader/FieldReaderMapMethod;->valueType:Ljava/lang/reflect/Type;

    .line 10
    .line 11
    iput-object p13, p1, Lcom/alibaba/fastjson2/reader/FieldReaderMapMethod;->arrayToMapKey:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {p7}, Lcom/alibaba/fastjson2/PropertyNamingStrategy;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    iput-object p2, p1, Lcom/alibaba/fastjson2/reader/FieldReaderMapMethod;->namingStrategy:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 18
    .line 19
    iput-object p14, p1, Lcom/alibaba/fastjson2/reader/FieldReaderMapMethod;->arrayToMapDuplicateHandler:Ljava/util/function/BiConsumer;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public acceptAny(Ljava/lang/Object;Ljava/lang/Object;J)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Object;",
            "J)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReaderMapMethod;->arrayToMapKey:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v0, p2, Ljava/util/Collection;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/reader/FieldReaderObject;->getObjectReader(Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0, p3, p4}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(J)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    move-object v1, v0

    .line 22
    check-cast v1, Ljava/util/Map;

    .line 23
    .line 24
    move-object v2, p2

    .line 25
    check-cast v2, Ljava/util/Collection;

    .line 26
    .line 27
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/FieldReaderMapMethod;->arrayToMapKey:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/FieldReaderMapMethod;->namingStrategy:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 30
    .line 31
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/FieldReaderMapMethod;->valueType:Ljava/lang/reflect/Type;

    .line 32
    .line 33
    iget-wide v5, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->features:J

    .line 34
    .line 35
    or-long/2addr p3, v5

    .line 36
    invoke-static {p2, p3, p4}, Lcom/alibaba/fastjson2/JSONFactory;->getObjectReader(Ljava/lang/reflect/Type;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    iget-object v6, p0, Lcom/alibaba/fastjson2/reader/FieldReaderMapMethod;->arrayToMapDuplicateHandler:Ljava/util/function/BiConsumer;

    .line 41
    .line 42
    invoke-static/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/FieldReaderObject;->arrayToMap(Ljava/util/Map;Ljava/util/Collection;Ljava/lang/String;Lcom/alibaba/fastjson2/PropertyNamingStrategy;Lcom/alibaba/fastjson2/reader/ObjectReader;Ljava/util/function/BiConsumer;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1, v1}, Lcom/alibaba/fastjson2/reader/FieldReaderObject;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Lcom/alibaba/fastjson2/reader/FieldReader;->acceptAny(Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONReader;",
            "TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReaderMapMethod;->arrayToMapKey:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isArray()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/FieldReaderObject;->getObjectReader(Lcom/alibaba/fastjson2/JSONReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-wide v1, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->features:J

    .line 16
    .line 17
    invoke-interface {v0, v1, v2}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(J)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    move-object v1, v0

    .line 22
    check-cast v1, Ljava/util/Map;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReaderMapMethod;->valueType:Ljava/lang/reflect/Type;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->readArray(Ljava/lang/reflect/Type;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/FieldReaderMapMethod;->arrayToMapKey:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/FieldReaderMapMethod;->namingStrategy:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 33
    .line 34
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/FieldReaderMapMethod;->valueType:Ljava/lang/reflect/Type;

    .line 35
    .line 36
    iget-wide v5, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->features:J

    .line 37
    .line 38
    invoke-static {p1, v5, v6}, Lcom/alibaba/fastjson2/JSONFactory;->getObjectReader(Ljava/lang/reflect/Type;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    iget-object v6, p0, Lcom/alibaba/fastjson2/reader/FieldReaderMapMethod;->arrayToMapDuplicateHandler:Ljava/util/function/BiConsumer;

    .line 43
    .line 44
    invoke-static/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/FieldReaderObject;->arrayToMap(Ljava/util/Map;Ljava/util/Collection;Ljava/lang/String;Lcom/alibaba/fastjson2/PropertyNamingStrategy;Lcom/alibaba/fastjson2/reader/ObjectReader;Ljava/util/function/BiConsumer;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p2, v1}, Lcom/alibaba/fastjson2/reader/FieldReaderObject;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReaderObject;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method
