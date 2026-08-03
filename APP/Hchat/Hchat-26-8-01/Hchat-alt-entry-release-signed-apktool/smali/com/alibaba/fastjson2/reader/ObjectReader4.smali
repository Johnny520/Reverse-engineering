.class public Lcom/alibaba/fastjson2/reader/ObjectReader4;
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

.field protected final fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

.field final hashCode0:J

.field final hashCode0LCase:J

.field final hashCode1:J

.field final hashCode1LCase:J

.field final hashCode2:J

.field final hashCode2LCase:J

.field final hashCode3:J

.field final hashCode3LCase:J

.field protected objectReader0:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader1:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader2:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader3:Lcom/alibaba/fastjson2/reader/ObjectReader;


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
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 23
    .line 24
    const/4 p3, 0x1

    .line 25
    aget-object v1, p8, p3

    .line 26
    .line 27
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    aget-object v2, p8, v2

    .line 31
    .line 32
    iput-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 33
    .line 34
    const/4 v3, 0x3

    .line 35
    aget-object v3, p8, v3

    .line 36
    .line 37
    iput-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 38
    .line 39
    iget-wide v4, p2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 40
    .line 41
    iput-wide v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode0:J

    .line 42
    .line 43
    iget-wide v4, v1, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 44
    .line 45
    iput-wide v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode1:J

    .line 46
    .line 47
    iget-wide v4, v2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 48
    .line 49
    iput-wide v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode2:J

    .line 50
    .line 51
    iget-wide v4, v3, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 52
    .line 53
    iput-wide v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode3:J

    .line 54
    .line 55
    iget-wide v4, p2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 56
    .line 57
    iput-wide v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode0LCase:J

    .line 58
    .line 59
    iget-wide v4, v1, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 60
    .line 61
    iput-wide v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode1LCase:J

    .line 62
    .line 63
    iget-wide v4, v2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 64
    .line 65
    iput-wide v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode2LCase:J

    .line 66
    .line 67
    iget-wide v4, v3, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 68
    .line 69
    iput-wide v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode3LCase:J

    .line 70
    .line 71
    iget-object p2, p2, Lcom/alibaba/fastjson2/reader/FieldReader;->defaultValue:Ljava/lang/Object;

    .line 72
    .line 73
    if-nez p2, :cond_0

    .line 74
    .line 75
    iget-object p2, v1, Lcom/alibaba/fastjson2/reader/FieldReader;->defaultValue:Ljava/lang/Object;

    .line 76
    .line 77
    if-nez p2, :cond_0

    .line 78
    .line 79
    iget-object p2, v2, Lcom/alibaba/fastjson2/reader/FieldReader;->defaultValue:Ljava/lang/Object;

    .line 80
    .line 81
    if-nez p2, :cond_0

    .line 82
    .line 83
    iget-object p2, v3, Lcom/alibaba/fastjson2/reader/FieldReader;->defaultValue:Ljava/lang/Object;

    .line 84
    .line 85
    if-eqz p2, :cond_1

    .line 86
    .line 87
    :cond_0
    move p1, p3

    .line 88
    :cond_1
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->hasDefaultValue:Z

    .line 89
    .line 90
    return-void
.end method


# virtual methods
.method public getFieldReader(J)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode0:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode1:J

    .line 11
    .line 12
    cmp-long v0, p1, v0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode2:J

    .line 20
    .line 21
    cmp-long v0, p1, v0

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_2
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode3:J

    .line 29
    .line 30
    cmp-long p1, p1, v0

    .line 31
    .line 32
    if-nez p1, :cond_3

    .line 33
    .line 34
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_3
    const/4 p1, 0x0

    .line 38
    return-object p1
.end method

.method public getFieldReaderLCase(J)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode0LCase:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode1LCase:J

    .line 11
    .line 12
    cmp-long v0, p1, v0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode2LCase:J

    .line 20
    .line 21
    cmp-long v0, p1, v0

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_2
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode3LCase:J

    .line 29
    .line 30
    cmp-long p1, p1, v0

    .line 31
    .line 32
    if-nez p1, :cond_3

    .line 33
    .line 34
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_3
    const/4 p1, 0x0

    .line 38
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
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->acceptDefaultValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->acceptDefaultValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->acceptDefaultValue(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->acceptDefaultValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
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
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->startArray()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->creator:Ljava/util/function/Supplier;

    .line 46
    .line 47
    invoke-interface {p2}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    if-lez p1, :cond_2

    .line 52
    .line 53
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 54
    .line 55
    invoke-virtual {p3, v4, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    const/4 p3, 0x1

    .line 59
    if-le p1, p3, :cond_2

    .line 60
    .line 61
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 62
    .line 63
    invoke-virtual {p3, v4, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    const/4 p3, 0x2

    .line 67
    if-le p1, p3, :cond_2

    .line 68
    .line 69
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 70
    .line 71
    invoke-virtual {p3, v4, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    const/4 p3, 0x3

    .line 75
    if-le p1, p3, :cond_2

    .line 76
    .line 77
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 78
    .line 79
    invoke-virtual {p3, v4, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    const/4 p3, 0x4

    .line 83
    :goto_0
    if-ge p3, p1, :cond_2

    .line 84
    .line 85
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->skipValue()V

    .line 86
    .line 87
    .line 88
    add-int/lit8 p3, p3, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_2
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->buildFunction:Ljava/util/function/Function;

    .line 92
    .line 93
    if-eqz p1, :cond_3

    .line 94
    .line 95
    invoke-interface {p1, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    return-object p1

    .line 100
    :cond_3
    return-object p2
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
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

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
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

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
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 45
    .line 46
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x3

    .line 50
    if-le p3, v0, :cond_1

    .line 51
    .line 52
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 53
    .line 54
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x4

    .line 58
    :goto_0
    if-ge v0, p3, :cond_1

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->skipValue()V

    .line 61
    .line 62
    .line 63
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->buildFunction:Ljava/util/function/Function;

    .line 67
    .line 68
    if-eqz p1, :cond_2

    .line 69
    .line 70
    invoke-interface {p1, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    :cond_2
    return-object p2

    .line 76
    :cond_3
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->getTypeNameHash()J

    .line 79
    .line 80
    .line 81
    move-result-wide v3

    .line 82
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 83
    .line 84
    or-long v5, v0, p4

    .line 85
    .line 86
    move-object v1, p1

    .line 87
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReader;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    if-eqz v0, :cond_4

    .line 92
    .line 93
    invoke-interface {v0}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getObjectClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 98
    .line 99
    if-eq v1, v2, :cond_4

    .line 100
    .line 101
    move-object v1, p1

    .line 102
    move-object v2, p2

    .line 103
    move-object v3, p3

    .line 104
    move-wide v4, p4

    .line 105
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    return-object p1

    .line 110
    :cond_4
    const/16 p2, -0x5a

    .line 111
    .line 112
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(B)Z

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    if-eqz p2, :cond_14

    .line 117
    .line 118
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->creator:Ljava/util/function/Supplier;

    .line 119
    .line 120
    const-wide/16 v2, 0x0

    .line 121
    .line 122
    if-eqz p2, :cond_5

    .line 123
    .line 124
    invoke-interface {p2}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    goto :goto_1

    .line 129
    :cond_5
    iget-object p2, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 130
    .line 131
    iget-wide p2, p2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 132
    .line 133
    or-long/2addr p2, p4

    .line 134
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 135
    .line 136
    iget-wide v6, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 137
    .line 138
    and-long/2addr p2, v6

    .line 139
    cmp-long p2, p2, v2

    .line 140
    .line 141
    if-eqz p2, :cond_6

    .line 142
    .line 143
    :try_start_0
    sget-object p2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 144
    .line 145
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 146
    .line 147
    invoke-virtual {p2, p3}, Lsun/misc/Unsafe;->allocateInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 151
    goto :goto_1

    .line 152
    :catch_0
    move-exception v0

    .line 153
    move-object p2, v0

    .line 154
    const-string p3, "create instance error"

    .line 155
    .line 156
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-static {p1, p2}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    const/4 p1, 0x0

    .line 164
    return-object p1

    .line 165
    :cond_6
    const/4 p2, 0x0

    .line 166
    :goto_1
    if-eqz p2, :cond_7

    .line 167
    .line 168
    iget-boolean p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->hasDefaultValue:Z

    .line 169
    .line 170
    if-eqz p3, :cond_7

    .line 171
    .line 172
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/reader/ObjectReader4;->initDefaultValue(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    :cond_7
    :goto_2
    const/16 p3, -0x5b

    .line 176
    .line 177
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(B)Z

    .line 178
    .line 179
    .line 180
    move-result p3

    .line 181
    if-eqz p3, :cond_9

    .line 182
    .line 183
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->buildFunction:Ljava/util/function/Function;

    .line 184
    .line 185
    if-eqz p1, :cond_8

    .line 186
    .line 187
    invoke-interface {p1, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    return-object p1

    .line 192
    :cond_8
    return-object p2

    .line 193
    :cond_9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameHashCode()J

    .line 194
    .line 195
    .line 196
    move-result-wide v6

    .line 197
    cmp-long p3, v6, v2

    .line 198
    .line 199
    if-nez p3, :cond_a

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_a
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode0:J

    .line 203
    .line 204
    cmp-long p3, v6, v8

    .line 205
    .line 206
    if-nez p3, :cond_b

    .line 207
    .line 208
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 209
    .line 210
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_b
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode1:J

    .line 215
    .line 216
    cmp-long p3, v6, v8

    .line 217
    .line 218
    if-nez p3, :cond_c

    .line 219
    .line 220
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 221
    .line 222
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_c
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode2:J

    .line 227
    .line 228
    cmp-long p3, v6, v8

    .line 229
    .line 230
    if-nez p3, :cond_d

    .line 231
    .line 232
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 233
    .line 234
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_d
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode3:J

    .line 239
    .line 240
    cmp-long p3, v6, v8

    .line 241
    .line 242
    if-nez p3, :cond_e

    .line 243
    .line 244
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 245
    .line 246
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    goto :goto_2

    .line 250
    :cond_e
    iget-wide v6, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 251
    .line 252
    or-long/2addr v6, p4

    .line 253
    invoke-virtual {p1, v6, v7}, Lcom/alibaba/fastjson2/JSONReader;->isSupportSmartMatch(J)Z

    .line 254
    .line 255
    .line 256
    move-result p3

    .line 257
    if-nez p3, :cond_f

    .line 258
    .line 259
    invoke-virtual {p0, p1, p2, p4, p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    .line 260
    .line 261
    .line 262
    goto :goto_2

    .line 263
    :cond_f
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getNameHashCodeLCase()J

    .line 264
    .line 265
    .line 266
    move-result-wide v6

    .line 267
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode0LCase:J

    .line 268
    .line 269
    cmp-long p3, v6, v8

    .line 270
    .line 271
    if-nez p3, :cond_10

    .line 272
    .line 273
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 274
    .line 275
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    goto :goto_2

    .line 279
    :cond_10
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode1LCase:J

    .line 280
    .line 281
    cmp-long p3, v6, v8

    .line 282
    .line 283
    if-nez p3, :cond_11

    .line 284
    .line 285
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 286
    .line 287
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    goto :goto_2

    .line 291
    :cond_11
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode2LCase:J

    .line 292
    .line 293
    cmp-long p3, v6, v8

    .line 294
    .line 295
    if-nez p3, :cond_12

    .line 296
    .line 297
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 298
    .line 299
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    goto :goto_2

    .line 303
    :cond_12
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode3LCase:J

    .line 304
    .line 305
    cmp-long p3, v6, v8

    .line 306
    .line 307
    if-nez p3, :cond_13

    .line 308
    .line 309
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 310
    .line 311
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    goto/16 :goto_2

    .line 315
    .line 316
    :cond_13
    invoke-virtual {p0, p1, p2, p4, p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    .line 317
    .line 318
    .line 319
    goto/16 :goto_2

    .line 320
    .line 321
    :cond_14
    new-instance p2, Ljava/lang/StringBuilder;

    .line 322
    .line 323
    const-string p3, "expect object, but "

    .line 324
    .line 325
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getType()B

    .line 329
    .line 330
    .line 331
    move-result p3

    .line 332
    invoke-static {p3}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object p3

    .line 336
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object p2

    .line 343
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object p1

    .line 347
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    const/4 p1, 0x0

    .line 351
    return-object p1
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 11
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
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/ObjectReader4;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    return-object p1

    .line 30
    :cond_2
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 31
    .line 32
    or-long/2addr v0, p4

    .line 33
    invoke-virtual {p1, v0, v1}, Lcom/alibaba/fastjson2/JSONReader;->features(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v6

    .line 37
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isArray()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const-wide/16 v1, 0x0

    .line 42
    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportArrayToBean:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 46
    .line 47
    iget-wide v3, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 48
    .line 49
    and-long/2addr v3, v6

    .line 50
    cmp-long v0, v3, v1

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->readArrayMappingObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    return-object p1

    .line 59
    :cond_3
    move-object v2, p0

    .line 60
    move-object v3, p1

    .line 61
    move-object v4, p2

    .line 62
    move-object v5, p3

    .line 63
    invoke-virtual/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processObjectInputSingleItemArray(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    return-object p1

    .line 68
    :cond_4
    move-wide v4, v6

    .line 69
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectStart()Z

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->creator:Ljava/util/function/Supplier;

    .line 73
    .line 74
    invoke-interface {v0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->hasDefaultValue:Z

    .line 79
    .line 80
    if-eqz v0, :cond_5

    .line 81
    .line 82
    invoke-virtual {p0, v7}, Lcom/alibaba/fastjson2/reader/ObjectReader4;->initDefaultValue(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_5
    if-eqz v7, :cond_6

    .line 86
    .line 87
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->InitStringFieldAsEmpty:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 88
    .line 89
    iget-wide v8, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 90
    .line 91
    and-long/2addr v4, v8

    .line 92
    cmp-long v0, v4, v1

    .line 93
    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    invoke-virtual {p0, v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->initStringFieldAsEmpty(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_6
    const/4 v0, 0x0

    .line 100
    move v8, v0

    .line 101
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectEnd()Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_7

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameHashCode()J

    .line 109
    .line 110
    .line 111
    move-result-wide v0

    .line 112
    if-nez v8, :cond_b

    .line 113
    .line 114
    const-wide v4, 0x6570797440L

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    cmp-long v2, v0, v4

    .line 120
    .line 121
    if-nez v2, :cond_b

    .line 122
    .line 123
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readTypeHashCode()J

    .line 124
    .line 125
    .line 126
    move-result-wide v0

    .line 127
    iget-object v2, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 128
    .line 129
    invoke-virtual {v2, v0, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    if-nez v0, :cond_9

    .line 134
    .line 135
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 140
    .line 141
    invoke-virtual {v2, v0, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(Ljava/lang/String;Ljava/lang/Class;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    if-nez v0, :cond_9

    .line 146
    .line 147
    :cond_8
    move-wide v4, p4

    .line 148
    goto/16 :goto_2

    .line 149
    .line 150
    :cond_9
    if-eq v0, p0, :cond_8

    .line 151
    .line 152
    move-object v1, p1

    .line 153
    move-object v2, p2

    .line 154
    move-object v3, p3

    .line 155
    move-wide v4, p4

    .line 156
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    :goto_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 161
    .line 162
    .line 163
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->buildFunction:Ljava/util/function/Function;

    .line 164
    .line 165
    if-eqz p1, :cond_a

    .line 166
    .line 167
    invoke-interface {p1, v7}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    return-object p1

    .line 172
    :cond_a
    return-object v7

    .line 173
    :cond_b
    move-wide v4, p4

    .line 174
    iget-wide v9, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode0:J

    .line 175
    .line 176
    cmp-long v2, v0, v9

    .line 177
    .line 178
    if-nez v2, :cond_c

    .line 179
    .line 180
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 181
    .line 182
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    goto/16 :goto_2

    .line 186
    .line 187
    :cond_c
    iget-wide v9, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode1:J

    .line 188
    .line 189
    cmp-long v2, v0, v9

    .line 190
    .line 191
    if-nez v2, :cond_d

    .line 192
    .line 193
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 194
    .line 195
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_d
    iget-wide v9, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode2:J

    .line 200
    .line 201
    cmp-long v2, v0, v9

    .line 202
    .line 203
    if-nez v2, :cond_e

    .line 204
    .line 205
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 206
    .line 207
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    goto :goto_2

    .line 211
    :cond_e
    iget-wide v9, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode3:J

    .line 212
    .line 213
    cmp-long v0, v0, v9

    .line 214
    .line 215
    if-nez v0, :cond_f

    .line 216
    .line 217
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 218
    .line 219
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_f
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 224
    .line 225
    or-long/2addr v0, v4

    .line 226
    invoke-virtual {p1, v0, v1}, Lcom/alibaba/fastjson2/JSONReader;->isSupportSmartMatch(J)Z

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    if-nez v0, :cond_10

    .line 231
    .line 232
    invoke-virtual {p0, p1, v7, v4, v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    .line 233
    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_10
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getNameHashCodeLCase()J

    .line 237
    .line 238
    .line 239
    move-result-wide v0

    .line 240
    iget-wide v9, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode0LCase:J

    .line 241
    .line 242
    cmp-long v2, v0, v9

    .line 243
    .line 244
    if-nez v2, :cond_11

    .line 245
    .line 246
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 247
    .line 248
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_11
    iget-wide v9, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode1LCase:J

    .line 253
    .line 254
    cmp-long v2, v0, v9

    .line 255
    .line 256
    if-nez v2, :cond_12

    .line 257
    .line 258
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 259
    .line 260
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_12
    iget-wide v9, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode2LCase:J

    .line 265
    .line 266
    cmp-long v2, v0, v9

    .line 267
    .line 268
    if-nez v2, :cond_13

    .line 269
    .line 270
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 271
    .line 272
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    goto :goto_2

    .line 276
    :cond_13
    iget-wide v9, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->hashCode3LCase:J

    .line 277
    .line 278
    cmp-long v0, v0, v9

    .line 279
    .line 280
    if-nez v0, :cond_14

    .line 281
    .line 282
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader4;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 283
    .line 284
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    goto :goto_2

    .line 288
    :cond_14
    invoke-virtual {p0, p1, v7, v4, v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    .line 289
    .line 290
    .line 291
    :goto_2
    add-int/lit8 v8, v8, 0x1

    .line 292
    .line 293
    goto/16 :goto_0
.end method
