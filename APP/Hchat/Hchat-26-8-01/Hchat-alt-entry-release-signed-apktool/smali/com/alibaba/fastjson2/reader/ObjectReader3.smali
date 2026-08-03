.class public Lcom/alibaba/fastjson2/reader/ObjectReader3;
.super Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter<",
        "TT;>;"
    }
.end annotation


# instance fields
.field protected final fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

.field protected final fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

.field protected final fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

.field final hashCode0:J

.field final hashCode0LCase:J

.field final hashCode1:J

.field final hashCode1LCase:J

.field final hashCode2:J

.field final hashCode2LCase:J

.field protected objectReader0:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader1:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader2:Lcom/alibaba/fastjson2/reader/ObjectReader;


# direct methods
.method public varargs constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/function/Supplier<",
            "TT;>;",
            "Ljava/util/function/Function;",
            "[",
            "Lcom/alibaba/fastjson2/reader/FieldReader;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 v9, 0x0

    .line 2
    const/4 v10, 0x0

    .line 3
    const/4 v8, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move-object v1, p1

    .line 6
    move-object v2, p2

    .line 7
    move-object v3, p3

    .line 8
    move-wide/from16 v4, p4

    .line 9
    .line 10
    move-object/from16 v6, p6

    .line 11
    .line 12
    move-object/from16 v7, p7

    .line 13
    .line 14
    move-object/from16 v11, p8

    .line 15
    .line 16
    invoke-direct/range {v0 .. v11}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Ljava/lang/Class;[Ljava/lang/String;Ljava/lang/Class;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    aget-object p2, p8, p1

    .line 21
    .line 22
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 23
    .line 24
    const/4 p3, 0x1

    .line 25
    aget-object v1, p8, p3

    .line 26
    .line 27
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    aget-object v2, p8, v2

    .line 31
    .line 32
    iput-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 33
    .line 34
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 35
    .line 36
    iput-wide v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->hashCode0:J

    .line 37
    .line 38
    iget-wide v3, v1, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 39
    .line 40
    iput-wide v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->hashCode1:J

    .line 41
    .line 42
    iget-wide v3, v2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 43
    .line 44
    iput-wide v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->hashCode2:J

    .line 45
    .line 46
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 47
    .line 48
    iput-wide v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->hashCode0LCase:J

    .line 49
    .line 50
    iget-wide v3, v1, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 51
    .line 52
    iput-wide v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->hashCode1LCase:J

    .line 53
    .line 54
    iget-wide v3, v2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 55
    .line 56
    iput-wide v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->hashCode2LCase:J

    .line 57
    .line 58
    iget-object p2, p2, Lcom/alibaba/fastjson2/reader/FieldReader;->defaultValue:Ljava/lang/Object;

    .line 59
    .line 60
    if-nez p2, :cond_0

    .line 61
    .line 62
    iget-object p2, v1, Lcom/alibaba/fastjson2/reader/FieldReader;->defaultValue:Ljava/lang/Object;

    .line 63
    .line 64
    if-nez p2, :cond_0

    .line 65
    .line 66
    iget-object p2, v2, Lcom/alibaba/fastjson2/reader/FieldReader;->defaultValue:Ljava/lang/Object;

    .line 67
    .line 68
    if-eqz p2, :cond_1

    .line 69
    .line 70
    :cond_0
    move p1, p3

    .line 71
    :cond_1
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->hasDefaultValue:Z

    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public getFieldReader(J)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->hashCode0:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->hashCode1:J

    .line 11
    .line 12
    cmp-long v0, p1, v0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->hashCode2:J

    .line 20
    .line 21
    cmp-long p1, p1, v0

    .line 22
    .line 23
    if-nez p1, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_2
    const/4 p1, 0x0

    .line 29
    return-object p1
.end method

.method public getFieldReaderLCase(J)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->hashCode0LCase:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->hashCode1LCase:J

    .line 11
    .line 12
    cmp-long v0, p1, v0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->hashCode2LCase:J

    .line 20
    .line 21
    cmp-long p1, p1, v0

    .line 22
    .line 23
    if-nez p1, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_2
    const/4 p1, 0x0

    .line 29
    return-object p1
.end method

.method public initDefaultValue(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->acceptDefaultValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->acceptDefaultValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->acceptDefaultValue(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public readArrayMappingJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONReader;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "J)TT;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->serializable:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->errorOnNoneSerializable(Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 11
    .line 12
    iget-wide v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 13
    .line 14
    or-long/2addr v1, p4

    .line 15
    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->checkAutoType(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    if-eq v3, p0, :cond_1

    .line 22
    .line 23
    invoke-interface {v3}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getObjectClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 28
    .line 29
    if-eq v0, v1, :cond_1

    .line 30
    .line 31
    move-object v4, p1

    .line 32
    move-object v5, p2

    .line 33
    move-object v6, p3

    .line 34
    move-wide v7, p4

    .line 35
    invoke-interface/range {v3 .. v8}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readArrayMappingJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :cond_1
    move-object v4, p1

    .line 41
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->creator:Ljava/util/function/Supplier;

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->startArray()I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    const/4 p3, 0x3

    .line 52
    if-lez p2, :cond_2

    .line 53
    .line 54
    iget-object p4, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 55
    .line 56
    invoke-virtual {p4, v4, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    const/4 p4, 0x1

    .line 60
    if-le p2, p4, :cond_2

    .line 61
    .line 62
    iget-object p4, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 63
    .line 64
    invoke-virtual {p4, v4, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    const/4 p4, 0x2

    .line 68
    if-le p2, p4, :cond_2

    .line 69
    .line 70
    iget-object p4, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 71
    .line 72
    invoke-virtual {p4, v4, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    move p4, p3

    .line 76
    :goto_0
    if-ge p4, p2, :cond_2

    .line 77
    .line 78
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->skipValue()V

    .line 79
    .line 80
    .line 81
    add-int/lit8 p4, p4, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    :goto_1
    if-ge p3, p2, :cond_3

    .line 85
    .line 86
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->skipValue()V

    .line 87
    .line 88
    .line 89
    add-int/lit8 p3, p3, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->buildFunction:Ljava/util/function/Function;

    .line 93
    .line 94
    if-eqz p2, :cond_4

    .line 95
    .line 96
    invoke-interface {p2, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    :cond_4
    return-object p1
.end method

.method public readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONReader;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "J)TT;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->serializable:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->errorOnNoneSerializable(Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isArray()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->creator:Ljava/util/function/Supplier;

    .line 17
    .line 18
    invoke-interface {p2}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->startArray()I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    if-lez p3, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 29
    .line 30
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    if-le p3, v0, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 37
    .line 38
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x2

    .line 42
    if-le p3, v0, :cond_1

    .line 43
    .line 44
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 45
    .line 46
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x3

    .line 50
    :goto_0
    if-ge v0, p3, :cond_1

    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->skipValue()V

    .line 53
    .line 54
    .line 55
    add-int/lit8 v0, v0, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->buildFunction:Ljava/util/function/Function;

    .line 59
    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    invoke-interface {p1, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    return-object p1

    .line 67
    :cond_2
    return-object p2

    .line 68
    :cond_3
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->getTypeNameHash()J

    .line 71
    .line 72
    .line 73
    move-result-wide v3

    .line 74
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 75
    .line 76
    or-long v5, v0, p4

    .line 77
    .line 78
    move-object v1, p1

    .line 79
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReader;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    invoke-interface {v0}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getObjectClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 90
    .line 91
    if-eq v1, v2, :cond_4

    .line 92
    .line 93
    move-object v1, p1

    .line 94
    move-object v2, p2

    .line 95
    move-object v3, p3

    .line 96
    move-wide v4, p4

    .line 97
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    return-object p1

    .line 102
    :cond_4
    const/16 p2, -0x5a

    .line 103
    .line 104
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(B)Z

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    if-eqz p2, :cond_12

    .line 109
    .line 110
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->creator:Ljava/util/function/Supplier;

    .line 111
    .line 112
    const-wide/16 v2, 0x0

    .line 113
    .line 114
    if-eqz p2, :cond_5

    .line 115
    .line 116
    invoke-interface {p2}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    goto :goto_1

    .line 121
    :cond_5
    iget-object p2, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 122
    .line 123
    iget-wide p2, p2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 124
    .line 125
    or-long/2addr p2, p4

    .line 126
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 127
    .line 128
    iget-wide v6, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 129
    .line 130
    and-long/2addr p2, v6

    .line 131
    cmp-long p2, p2, v2

    .line 132
    .line 133
    if-eqz p2, :cond_6

    .line 134
    .line 135
    :try_start_0
    sget-object p2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 136
    .line 137
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 138
    .line 139
    invoke-virtual {p2, p3}, Lsun/misc/Unsafe;->allocateInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    goto :goto_1

    .line 144
    :catch_0
    move-exception v0

    .line 145
    move-object p2, v0

    .line 146
    const-string p3, "create instance error"

    .line 147
    .line 148
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-static {p1, p2}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    const/4 p1, 0x0

    .line 156
    return-object p1

    .line 157
    :cond_6
    const/4 p2, 0x0

    .line 158
    :goto_1
    if-eqz p2, :cond_7

    .line 159
    .line 160
    iget-boolean p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->hasDefaultValue:Z

    .line 161
    .line 162
    if-eqz p3, :cond_7

    .line 163
    .line 164
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/reader/ObjectReader3;->initDefaultValue(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :cond_7
    :goto_2
    const/16 p3, -0x5b

    .line 168
    .line 169
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(B)Z

    .line 170
    .line 171
    .line 172
    move-result p3

    .line 173
    if-eqz p3, :cond_9

    .line 174
    .line 175
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->buildFunction:Ljava/util/function/Function;

    .line 176
    .line 177
    if-eqz p1, :cond_8

    .line 178
    .line 179
    invoke-interface {p1, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    return-object p1

    .line 184
    :cond_8
    return-object p2

    .line 185
    :cond_9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameHashCode()J

    .line 186
    .line 187
    .line 188
    move-result-wide v6

    .line 189
    cmp-long p3, v6, v2

    .line 190
    .line 191
    if-nez p3, :cond_a

    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_a
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->hashCode0:J

    .line 195
    .line 196
    cmp-long p3, v6, v8

    .line 197
    .line 198
    if-nez p3, :cond_b

    .line 199
    .line 200
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 201
    .line 202
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_b
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->hashCode1:J

    .line 207
    .line 208
    cmp-long p3, v6, v8

    .line 209
    .line 210
    if-nez p3, :cond_c

    .line 211
    .line 212
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 213
    .line 214
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_c
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->hashCode2:J

    .line 219
    .line 220
    cmp-long p3, v6, v8

    .line 221
    .line 222
    if-nez p3, :cond_d

    .line 223
    .line 224
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 225
    .line 226
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_d
    iget-wide v6, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 231
    .line 232
    or-long/2addr v6, p4

    .line 233
    invoke-virtual {p1, v6, v7}, Lcom/alibaba/fastjson2/JSONReader;->isSupportSmartMatch(J)Z

    .line 234
    .line 235
    .line 236
    move-result p3

    .line 237
    if-nez p3, :cond_e

    .line 238
    .line 239
    invoke-virtual {p0, p1, p2, p4, p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    .line 240
    .line 241
    .line 242
    goto :goto_2

    .line 243
    :cond_e
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getNameHashCodeLCase()J

    .line 244
    .line 245
    .line 246
    move-result-wide v6

    .line 247
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->hashCode0:J

    .line 248
    .line 249
    cmp-long p3, v6, v8

    .line 250
    .line 251
    if-nez p3, :cond_f

    .line 252
    .line 253
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 254
    .line 255
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_f
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->hashCode1:J

    .line 260
    .line 261
    cmp-long p3, v6, v8

    .line 262
    .line 263
    if-nez p3, :cond_10

    .line 264
    .line 265
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 266
    .line 267
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    goto :goto_2

    .line 271
    :cond_10
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->hashCode2:J

    .line 272
    .line 273
    cmp-long p3, v6, v8

    .line 274
    .line 275
    if-nez p3, :cond_11

    .line 276
    .line 277
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 278
    .line 279
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    goto :goto_2

    .line 283
    :cond_11
    invoke-virtual {p0, p1, p2, p4, p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    .line 284
    .line 285
    .line 286
    goto :goto_2

    .line 287
    :cond_12
    new-instance p2, Ljava/lang/StringBuilder;

    .line 288
    .line 289
    const-string p3, "expect object, but "

    .line 290
    .line 291
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getType()B

    .line 295
    .line 296
    .line 297
    move-result p3

    .line 298
    invoke-static {p3}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object p3

    .line 302
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object p2

    .line 309
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    const/4 p1, 0x0

    .line 317
    return-object p1
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONReader;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "J)TT;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->serializable:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->errorOnNoneSerializable(Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/JSONReader;->jsonb:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/ObjectReader3;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    move-object v1, p0

    .line 19
    return-object p1

    .line 20
    :cond_1
    move-object v1, p0

    .line 21
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    return-object p1

    .line 32
    :cond_2
    iget-wide v2, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 33
    .line 34
    or-long/2addr v2, p4

    .line 35
    invoke-virtual {p1, v2, v3}, Lcom/alibaba/fastjson2/JSONReader;->features(J)J

    .line 36
    .line 37
    .line 38
    move-result-wide v5

    .line 39
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isArray()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const-wide/16 v7, 0x0

    .line 44
    .line 45
    if-eqz v0, :cond_7

    .line 46
    .line 47
    sget-object p4, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportArrayToBean:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 48
    .line 49
    iget-wide p4, p4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 50
    .line 51
    and-long/2addr p4, v5

    .line 52
    cmp-long p4, p4, v7

    .line 53
    .line 54
    if-eqz p4, :cond_6

    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayStart()Z

    .line 57
    .line 58
    .line 59
    iget-object p2, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->creator:Ljava/util/function/Supplier;

    .line 60
    .line 61
    invoke-interface {p2}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    iget-boolean p3, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->hasDefaultValue:Z

    .line 66
    .line 67
    if-eqz p3, :cond_3

    .line 68
    .line 69
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/reader/ObjectReader3;->initDefaultValue(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    iget-object p3, v1, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 73
    .line 74
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object p3, v1, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 78
    .line 79
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object p3, v1, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 83
    .line 84
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    .line 88
    .line 89
    .line 90
    move-result p3

    .line 91
    if-eqz p3, :cond_5

    .line 92
    .line 93
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 94
    .line 95
    .line 96
    iget-object p1, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->buildFunction:Ljava/util/function/Function;

    .line 97
    .line 98
    if-eqz p1, :cond_4

    .line 99
    .line 100
    invoke-interface {p1, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    return-object p1

    .line 105
    :cond_4
    return-object p2

    .line 106
    :cond_5
    const-string p2, "array to bean end error"

    .line 107
    .line 108
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

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

    .line 117
    :cond_6
    move-object v2, p1

    .line 118
    move-object v3, p2

    .line 119
    move-object v4, p3

    .line 120
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processObjectInputSingleItemArray(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    move-object p2, v1

    .line 125
    return-object p1

    .line 126
    :cond_7
    move-object v2, p2

    .line 127
    move-object p2, v1

    .line 128
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectStart()Z

    .line 129
    .line 130
    .line 131
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->creator:Ljava/util/function/Supplier;

    .line 132
    .line 133
    invoke-interface {v0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    iget-boolean v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->hasDefaultValue:Z

    .line 138
    .line 139
    if-eqz v0, :cond_8

    .line 140
    .line 141
    invoke-virtual {p0, v9}, Lcom/alibaba/fastjson2/reader/ObjectReader3;->initDefaultValue(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_8
    if-eqz v9, :cond_9

    .line 145
    .line 146
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->InitStringFieldAsEmpty:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 147
    .line 148
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 149
    .line 150
    and-long/2addr v0, v5

    .line 151
    cmp-long v0, v0, v7

    .line 152
    .line 153
    if-eqz v0, :cond_9

    .line 154
    .line 155
    invoke-virtual {p0, v9}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->initStringFieldAsEmpty(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :cond_9
    const/4 v0, 0x0

    .line 159
    move v6, v0

    .line 160
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectEnd()Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_a

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_a
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameHashCode()J

    .line 168
    .line 169
    .line 170
    move-result-wide v0

    .line 171
    cmp-long v3, v0, v7

    .line 172
    .line 173
    if-nez v3, :cond_b

    .line 174
    .line 175
    goto/16 :goto_2

    .line 176
    .line 177
    :cond_b
    if-nez v6, :cond_e

    .line 178
    .line 179
    const-wide v3, 0x6570797440L

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    cmp-long v3, v0, v3

    .line 185
    .line 186
    if-nez v3, :cond_e

    .line 187
    .line 188
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readTypeHashCode()J

    .line 189
    .line 190
    .line 191
    move-result-wide v0

    .line 192
    iget-object v3, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 193
    .line 194
    invoke-virtual {v3, v0, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    if-nez v0, :cond_c

    .line 199
    .line 200
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    iget-object v1, p2, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 205
    .line 206
    invoke-virtual {v3, v0, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(Ljava/lang/String;Ljava/lang/Class;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    if-nez v0, :cond_c

    .line 211
    .line 212
    goto/16 :goto_2

    .line 213
    .line 214
    :cond_c
    if-eq v0, p2, :cond_16

    .line 215
    .line 216
    move-object v1, p1

    .line 217
    move-object v3, p3

    .line 218
    move-wide v4, p4

    .line 219
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v9

    .line 223
    :goto_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 224
    .line 225
    .line 226
    iget-object p1, p2, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->buildFunction:Ljava/util/function/Function;

    .line 227
    .line 228
    if-eqz p1, :cond_d

    .line 229
    .line 230
    invoke-interface {p1, v9}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    return-object p1

    .line 235
    :cond_d
    return-object v9

    .line 236
    :cond_e
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader3;->hashCode0:J

    .line 237
    .line 238
    cmp-long v3, v0, v3

    .line 239
    .line 240
    if-nez v3, :cond_f

    .line 241
    .line 242
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 243
    .line 244
    invoke-virtual {v0, p1, v9}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    goto :goto_2

    .line 248
    :cond_f
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader3;->hashCode1:J

    .line 249
    .line 250
    cmp-long v3, v0, v3

    .line 251
    .line 252
    if-nez v3, :cond_10

    .line 253
    .line 254
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 255
    .line 256
    invoke-virtual {v0, p1, v9}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    goto :goto_2

    .line 260
    :cond_10
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader3;->hashCode2:J

    .line 261
    .line 262
    cmp-long v0, v0, v3

    .line 263
    .line 264
    if-nez v0, :cond_11

    .line 265
    .line 266
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 267
    .line 268
    invoke-virtual {v0, p1, v9}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    goto :goto_2

    .line 272
    :cond_11
    iget-wide v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 273
    .line 274
    or-long/2addr v0, p4

    .line 275
    invoke-virtual {p1, v0, v1}, Lcom/alibaba/fastjson2/JSONReader;->isSupportSmartMatch(J)Z

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-nez v0, :cond_12

    .line 280
    .line 281
    invoke-virtual {p0, p1, v9, p4, p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    .line 282
    .line 283
    .line 284
    goto :goto_2

    .line 285
    :cond_12
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getNameHashCodeLCase()J

    .line 286
    .line 287
    .line 288
    move-result-wide v0

    .line 289
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader3;->hashCode0LCase:J

    .line 290
    .line 291
    cmp-long v3, v0, v3

    .line 292
    .line 293
    if-nez v3, :cond_13

    .line 294
    .line 295
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 296
    .line 297
    invoke-virtual {v0, p1, v9}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    goto :goto_2

    .line 301
    :cond_13
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader3;->hashCode1LCase:J

    .line 302
    .line 303
    cmp-long v3, v0, v3

    .line 304
    .line 305
    if-nez v3, :cond_14

    .line 306
    .line 307
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 308
    .line 309
    invoke-virtual {v0, p1, v9}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    goto :goto_2

    .line 313
    :cond_14
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader3;->hashCode2LCase:J

    .line 314
    .line 315
    cmp-long v0, v0, v3

    .line 316
    .line 317
    if-nez v0, :cond_15

    .line 318
    .line 319
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader3;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 320
    .line 321
    invoke-virtual {v0, p1, v9}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    goto :goto_2

    .line 325
    :cond_15
    invoke-virtual {p0, p1, v9, p4, p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    .line 326
    .line 327
    .line 328
    :cond_16
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 329
    .line 330
    goto/16 :goto_0
.end method
