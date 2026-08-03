.class public Lcom/alibaba/fastjson2/reader/ObjectReader5;
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

.field protected final fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

.field final hashCode0:J

.field final hashCode0LCase:J

.field final hashCode1:J

.field final hashCode1LCase:J

.field final hashCode2:J

.field final hashCode2LCase:J

.field final hashCode3:J

.field final hashCode3LCase:J

.field final hashCode4:J

.field final hashCode4LCase:J

.field protected objectReader0:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader1:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader2:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader3:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader4:Lcom/alibaba/fastjson2/reader/ObjectReader;


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
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 23
    .line 24
    const/4 p3, 0x1

    .line 25
    aget-object v1, p8, p3

    .line 26
    .line 27
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    aget-object v2, p8, v2

    .line 31
    .line 32
    iput-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 33
    .line 34
    const/4 v3, 0x3

    .line 35
    aget-object v3, p8, v3

    .line 36
    .line 37
    iput-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 38
    .line 39
    const/4 v4, 0x4

    .line 40
    aget-object v4, p8, v4

    .line 41
    .line 42
    iput-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 43
    .line 44
    iget-wide v5, p2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 45
    .line 46
    iput-wide v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode0:J

    .line 47
    .line 48
    iget-wide v5, v1, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 49
    .line 50
    iput-wide v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode1:J

    .line 51
    .line 52
    iget-wide v5, v2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 53
    .line 54
    iput-wide v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode2:J

    .line 55
    .line 56
    iget-wide v5, v3, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 57
    .line 58
    iput-wide v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode3:J

    .line 59
    .line 60
    iget-wide v5, v4, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 61
    .line 62
    iput-wide v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode4:J

    .line 63
    .line 64
    iget-wide v5, p2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 65
    .line 66
    iput-wide v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode0LCase:J

    .line 67
    .line 68
    iget-wide v5, v1, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 69
    .line 70
    iput-wide v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode1LCase:J

    .line 71
    .line 72
    iget-wide v5, v2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 73
    .line 74
    iput-wide v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode2LCase:J

    .line 75
    .line 76
    iget-wide v5, v3, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 77
    .line 78
    iput-wide v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode3LCase:J

    .line 79
    .line 80
    iget-wide v5, v4, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 81
    .line 82
    iput-wide v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode4LCase:J

    .line 83
    .line 84
    iget-object p2, p2, Lcom/alibaba/fastjson2/reader/FieldReader;->defaultValue:Ljava/lang/Object;

    .line 85
    .line 86
    if-nez p2, :cond_0

    .line 87
    .line 88
    iget-object p2, v1, Lcom/alibaba/fastjson2/reader/FieldReader;->defaultValue:Ljava/lang/Object;

    .line 89
    .line 90
    if-nez p2, :cond_0

    .line 91
    .line 92
    iget-object p2, v2, Lcom/alibaba/fastjson2/reader/FieldReader;->defaultValue:Ljava/lang/Object;

    .line 93
    .line 94
    if-nez p2, :cond_0

    .line 95
    .line 96
    iget-object p2, v3, Lcom/alibaba/fastjson2/reader/FieldReader;->defaultValue:Ljava/lang/Object;

    .line 97
    .line 98
    if-nez p2, :cond_0

    .line 99
    .line 100
    iget-object p2, v4, Lcom/alibaba/fastjson2/reader/FieldReader;->defaultValue:Ljava/lang/Object;

    .line 101
    .line 102
    if-eqz p2, :cond_1

    .line 103
    .line 104
    :cond_0
    move p1, p3

    .line 105
    :cond_1
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->hasDefaultValue:Z

    .line 106
    .line 107
    return-void
.end method


# virtual methods
.method public getFieldReader(J)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode0:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode1:J

    .line 11
    .line 12
    cmp-long v0, p1, v0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode2:J

    .line 20
    .line 21
    cmp-long v0, p1, v0

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_2
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode3:J

    .line 29
    .line 30
    cmp-long v0, p1, v0

    .line 31
    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode4:J

    .line 38
    .line 39
    cmp-long p1, p1, v0

    .line 40
    .line 41
    if-nez p1, :cond_4

    .line 42
    .line 43
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_4
    const/4 p1, 0x0

    .line 47
    return-object p1
.end method

.method public getFieldReaderLCase(J)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode0LCase:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode1LCase:J

    .line 11
    .line 12
    cmp-long v0, p1, v0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode2LCase:J

    .line 20
    .line 21
    cmp-long v0, p1, v0

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_2
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode3LCase:J

    .line 29
    .line 30
    cmp-long v0, p1, v0

    .line 31
    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode4LCase:J

    .line 38
    .line 39
    cmp-long p1, p1, v0

    .line 40
    .line 41
    if-nez p1, :cond_4

    .line 42
    .line 43
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_4
    const/4 p1, 0x0

    .line 47
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
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->acceptDefaultValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->acceptDefaultValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->acceptDefaultValue(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->acceptDefaultValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->acceptDefaultValue(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
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
    if-lez p2, :cond_2

    .line 52
    .line 53
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 54
    .line 55
    invoke-virtual {p3, v4, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    const/4 p3, 0x1

    .line 59
    if-le p2, p3, :cond_2

    .line 60
    .line 61
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 62
    .line 63
    invoke-virtual {p3, v4, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    const/4 p3, 0x2

    .line 67
    if-le p2, p3, :cond_2

    .line 68
    .line 69
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 70
    .line 71
    invoke-virtual {p3, v4, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    const/4 p3, 0x3

    .line 75
    if-le p2, p3, :cond_2

    .line 76
    .line 77
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 78
    .line 79
    invoke-virtual {p3, v4, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    const/4 p3, 0x4

    .line 83
    if-le p2, p3, :cond_2

    .line 84
    .line 85
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 86
    .line 87
    invoke-virtual {p3, v4, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    const/4 p3, 0x5

    .line 91
    :goto_0
    if-ge p3, p2, :cond_2

    .line 92
    .line 93
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->skipValue()V

    .line 94
    .line 95
    .line 96
    add-int/lit8 p3, p3, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->buildFunction:Ljava/util/function/Function;

    .line 100
    .line 101
    if-eqz p2, :cond_3

    .line 102
    .line 103
    invoke-interface {p2, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    :cond_3
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
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

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
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

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
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

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
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 53
    .line 54
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x4

    .line 58
    if-le p3, v0, :cond_1

    .line 59
    .line 60
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 61
    .line 62
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    const/4 v0, 0x5

    .line 66
    :goto_0
    if-ge v0, p3, :cond_1

    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->skipValue()V

    .line 69
    .line 70
    .line 71
    add-int/lit8 v0, v0, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->buildFunction:Ljava/util/function/Function;

    .line 75
    .line 76
    if-eqz p1, :cond_2

    .line 77
    .line 78
    invoke-interface {p1, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    return-object p1

    .line 83
    :cond_2
    return-object p2

    .line 84
    :cond_3
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->getTypeNameHash()J

    .line 87
    .line 88
    .line 89
    move-result-wide v3

    .line 90
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 91
    .line 92
    or-long v5, v0, p4

    .line 93
    .line 94
    move-object v1, p1

    .line 95
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReader;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    if-eqz v0, :cond_4

    .line 100
    .line 101
    invoke-interface {v0}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getObjectClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 106
    .line 107
    if-eq v1, v2, :cond_4

    .line 108
    .line 109
    move-object v1, p1

    .line 110
    move-object v2, p2

    .line 111
    move-object v3, p3

    .line 112
    move-wide v4, p4

    .line 113
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    return-object p1

    .line 118
    :cond_4
    const/16 p2, -0x5a

    .line 119
    .line 120
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(B)Z

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    if-eqz p2, :cond_16

    .line 125
    .line 126
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->creator:Ljava/util/function/Supplier;

    .line 127
    .line 128
    const-wide/16 v2, 0x0

    .line 129
    .line 130
    if-eqz p2, :cond_5

    .line 131
    .line 132
    invoke-interface {p2}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    goto :goto_1

    .line 137
    :cond_5
    iget-object p2, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 138
    .line 139
    iget-wide p2, p2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 140
    .line 141
    or-long/2addr p2, p4

    .line 142
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 143
    .line 144
    iget-wide v6, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 145
    .line 146
    and-long/2addr p2, v6

    .line 147
    cmp-long p2, p2, v2

    .line 148
    .line 149
    if-eqz p2, :cond_6

    .line 150
    .line 151
    :try_start_0
    sget-object p2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 152
    .line 153
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 154
    .line 155
    invoke-virtual {p2, p3}, Lsun/misc/Unsafe;->allocateInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 159
    goto :goto_1

    .line 160
    :catch_0
    move-exception v0

    .line 161
    move-object p2, v0

    .line 162
    const-string p3, "create instance error"

    .line 163
    .line 164
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-static {p1, p2}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 169
    .line 170
    .line 171
    const/4 p1, 0x0

    .line 172
    return-object p1

    .line 173
    :cond_6
    const/4 p2, 0x0

    .line 174
    :goto_1
    if-eqz p2, :cond_7

    .line 175
    .line 176
    iget-boolean p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->hasDefaultValue:Z

    .line 177
    .line 178
    if-eqz p3, :cond_7

    .line 179
    .line 180
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/reader/ObjectReader5;->initDefaultValue(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    :cond_7
    :goto_2
    const/16 p3, -0x5b

    .line 184
    .line 185
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(B)Z

    .line 186
    .line 187
    .line 188
    move-result p3

    .line 189
    if-eqz p3, :cond_9

    .line 190
    .line 191
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->buildFunction:Ljava/util/function/Function;

    .line 192
    .line 193
    if-eqz p1, :cond_8

    .line 194
    .line 195
    invoke-interface {p1, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    return-object p1

    .line 200
    :cond_8
    return-object p2

    .line 201
    :cond_9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameHashCode()J

    .line 202
    .line 203
    .line 204
    move-result-wide v6

    .line 205
    cmp-long p3, v6, v2

    .line 206
    .line 207
    if-nez p3, :cond_a

    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_a
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode0:J

    .line 211
    .line 212
    cmp-long p3, v6, v8

    .line 213
    .line 214
    if-nez p3, :cond_b

    .line 215
    .line 216
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 217
    .line 218
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_b
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode1:J

    .line 223
    .line 224
    cmp-long p3, v6, v8

    .line 225
    .line 226
    if-nez p3, :cond_c

    .line 227
    .line 228
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 229
    .line 230
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    goto :goto_2

    .line 234
    :cond_c
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode2:J

    .line 235
    .line 236
    cmp-long p3, v6, v8

    .line 237
    .line 238
    if-nez p3, :cond_d

    .line 239
    .line 240
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 241
    .line 242
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_d
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode3:J

    .line 247
    .line 248
    cmp-long p3, v6, v8

    .line 249
    .line 250
    if-nez p3, :cond_e

    .line 251
    .line 252
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 253
    .line 254
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_e
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode4:J

    .line 259
    .line 260
    cmp-long p3, v6, v8

    .line 261
    .line 262
    if-nez p3, :cond_f

    .line 263
    .line 264
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 265
    .line 266
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    goto :goto_2

    .line 270
    :cond_f
    iget-wide v6, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 271
    .line 272
    or-long/2addr v6, p4

    .line 273
    invoke-virtual {p1, v6, v7}, Lcom/alibaba/fastjson2/JSONReader;->isSupportSmartMatch(J)Z

    .line 274
    .line 275
    .line 276
    move-result p3

    .line 277
    if-nez p3, :cond_10

    .line 278
    .line 279
    invoke-virtual {p0, p1, p2, p4, p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    .line 280
    .line 281
    .line 282
    goto :goto_2

    .line 283
    :cond_10
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getNameHashCodeLCase()J

    .line 284
    .line 285
    .line 286
    move-result-wide v6

    .line 287
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode0LCase:J

    .line 288
    .line 289
    cmp-long p3, v6, v8

    .line 290
    .line 291
    if-nez p3, :cond_11

    .line 292
    .line 293
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 294
    .line 295
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    goto :goto_2

    .line 299
    :cond_11
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode1LCase:J

    .line 300
    .line 301
    cmp-long p3, v6, v8

    .line 302
    .line 303
    if-nez p3, :cond_12

    .line 304
    .line 305
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 306
    .line 307
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    goto :goto_2

    .line 311
    :cond_12
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode2LCase:J

    .line 312
    .line 313
    cmp-long p3, v6, v8

    .line 314
    .line 315
    if-nez p3, :cond_13

    .line 316
    .line 317
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 318
    .line 319
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    goto/16 :goto_2

    .line 323
    .line 324
    :cond_13
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode3LCase:J

    .line 325
    .line 326
    cmp-long p3, v6, v8

    .line 327
    .line 328
    if-nez p3, :cond_14

    .line 329
    .line 330
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 331
    .line 332
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    goto/16 :goto_2

    .line 336
    .line 337
    :cond_14
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode4LCase:J

    .line 338
    .line 339
    cmp-long p3, v6, v8

    .line 340
    .line 341
    if-nez p3, :cond_15

    .line 342
    .line 343
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 344
    .line 345
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    goto/16 :goto_2

    .line 349
    .line 350
    :cond_15
    invoke-virtual {p0, p1, p2, p4, p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    .line 351
    .line 352
    .line 353
    goto/16 :goto_2

    .line 354
    .line 355
    :cond_16
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getType()B

    .line 356
    .line 357
    .line 358
    move-result p1

    .line 359
    invoke-static {p1}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object p1

    .line 363
    const-string p2, "expect object, but "

    .line 364
    .line 365
    invoke-static {p1, p2}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    const/4 p1, 0x0

    .line 369
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
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/ObjectReader5;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

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
    const-wide/16 v2, 0x0

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
    cmp-long p4, p4, v2

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
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/reader/ObjectReader5;->initDefaultValue(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    iget-object p3, v1, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 73
    .line 74
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object p3, v1, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 78
    .line 79
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object p3, v1, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 83
    .line 84
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object p3, v1, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 88
    .line 89
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object p3, v1, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 93
    .line 94
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    .line 98
    .line 99
    .line 100
    move-result p3

    .line 101
    if-eqz p3, :cond_5

    .line 102
    .line 103
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 104
    .line 105
    .line 106
    iget-object p1, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->buildFunction:Ljava/util/function/Function;

    .line 107
    .line 108
    if-eqz p1, :cond_4

    .line 109
    .line 110
    invoke-interface {p1, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    return-object p1

    .line 115
    :cond_4
    return-object p2

    .line 116
    :cond_5
    const-string p2, "array to bean end error"

    .line 117
    .line 118
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    const/4 p1, 0x0

    .line 126
    return-object p1

    .line 127
    :cond_6
    move-object v2, p1

    .line 128
    move-object v3, p2

    .line 129
    move-object v4, p3

    .line 130
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processObjectInputSingleItemArray(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    move-object p2, v1

    .line 135
    return-object p1

    .line 136
    :cond_7
    move-wide v8, v2

    .line 137
    move-object v2, p2

    .line 138
    move-object p2, v1

    .line 139
    move-wide v0, v8

    .line 140
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectStart()Z

    .line 141
    .line 142
    .line 143
    iget-object v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->creator:Ljava/util/function/Supplier;

    .line 144
    .line 145
    invoke-interface {v3}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    iget-boolean v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->hasDefaultValue:Z

    .line 150
    .line 151
    if-eqz v3, :cond_8

    .line 152
    .line 153
    invoke-virtual {p0, v7}, Lcom/alibaba/fastjson2/reader/ObjectReader5;->initDefaultValue(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    :cond_8
    if-eqz v7, :cond_9

    .line 157
    .line 158
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->InitStringFieldAsEmpty:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 159
    .line 160
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 161
    .line 162
    and-long/2addr v3, v5

    .line 163
    cmp-long v0, v3, v0

    .line 164
    .line 165
    if-eqz v0, :cond_9

    .line 166
    .line 167
    invoke-virtual {p0, v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->initStringFieldAsEmpty(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    :cond_9
    const/4 v0, 0x0

    .line 171
    move v6, v0

    .line 172
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectEnd()Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_a

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_a
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameHashCode()J

    .line 180
    .line 181
    .line 182
    move-result-wide v0

    .line 183
    if-nez v6, :cond_c

    .line 184
    .line 185
    const-wide v3, 0x6570797440L

    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    cmp-long v3, v0, v3

    .line 191
    .line 192
    if-nez v3, :cond_c

    .line 193
    .line 194
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readTypeHashCode()J

    .line 195
    .line 196
    .line 197
    move-result-wide v0

    .line 198
    iget-object v3, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 199
    .line 200
    invoke-virtual {v3, v0, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    if-nez v0, :cond_b

    .line 205
    .line 206
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    iget-object v1, p2, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 211
    .line 212
    invoke-virtual {v3, v0, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(Ljava/lang/String;Ljava/lang/Class;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    if-nez v0, :cond_b

    .line 217
    .line 218
    goto/16 :goto_2

    .line 219
    .line 220
    :cond_b
    if-eq v0, p2, :cond_1a

    .line 221
    .line 222
    move-object v1, p1

    .line 223
    move-object v3, p3

    .line 224
    move-wide v4, p4

    .line 225
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    goto :goto_1

    .line 230
    :cond_c
    const-wide/16 v3, -0x1

    .line 231
    .line 232
    cmp-long v3, v0, v3

    .line 233
    .line 234
    if-nez v3, :cond_e

    .line 235
    .line 236
    :goto_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 237
    .line 238
    .line 239
    iget-object p1, p2, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->buildFunction:Ljava/util/function/Function;

    .line 240
    .line 241
    if-eqz p1, :cond_d

    .line 242
    .line 243
    invoke-interface {p1, v7}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    return-object p1

    .line 248
    :cond_d
    return-object v7

    .line 249
    :cond_e
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode0:J

    .line 250
    .line 251
    cmp-long v3, v0, v3

    .line 252
    .line 253
    if-nez v3, :cond_f

    .line 254
    .line 255
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 256
    .line 257
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    goto/16 :goto_2

    .line 261
    .line 262
    :cond_f
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode1:J

    .line 263
    .line 264
    cmp-long v3, v0, v3

    .line 265
    .line 266
    if-nez v3, :cond_10

    .line 267
    .line 268
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 269
    .line 270
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    goto/16 :goto_2

    .line 274
    .line 275
    :cond_10
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode2:J

    .line 276
    .line 277
    cmp-long v3, v0, v3

    .line 278
    .line 279
    if-nez v3, :cond_11

    .line 280
    .line 281
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 282
    .line 283
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    goto/16 :goto_2

    .line 287
    .line 288
    :cond_11
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode3:J

    .line 289
    .line 290
    cmp-long v3, v0, v3

    .line 291
    .line 292
    if-nez v3, :cond_12

    .line 293
    .line 294
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 295
    .line 296
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    goto :goto_2

    .line 300
    :cond_12
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode4:J

    .line 301
    .line 302
    cmp-long v0, v0, v3

    .line 303
    .line 304
    if-nez v0, :cond_13

    .line 305
    .line 306
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 307
    .line 308
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    goto :goto_2

    .line 312
    :cond_13
    iget-wide v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 313
    .line 314
    or-long/2addr v0, p4

    .line 315
    invoke-virtual {p1, v0, v1}, Lcom/alibaba/fastjson2/JSONReader;->isSupportSmartMatch(J)Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    if-nez v0, :cond_14

    .line 320
    .line 321
    invoke-virtual {p0, p1, v7, p4, p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    .line 322
    .line 323
    .line 324
    goto :goto_2

    .line 325
    :cond_14
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getNameHashCodeLCase()J

    .line 326
    .line 327
    .line 328
    move-result-wide v0

    .line 329
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode0LCase:J

    .line 330
    .line 331
    cmp-long v3, v0, v3

    .line 332
    .line 333
    if-nez v3, :cond_15

    .line 334
    .line 335
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 336
    .line 337
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    goto :goto_2

    .line 341
    :cond_15
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode1LCase:J

    .line 342
    .line 343
    cmp-long v3, v0, v3

    .line 344
    .line 345
    if-nez v3, :cond_16

    .line 346
    .line 347
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 348
    .line 349
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    goto :goto_2

    .line 353
    :cond_16
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode2LCase:J

    .line 354
    .line 355
    cmp-long v3, v0, v3

    .line 356
    .line 357
    if-nez v3, :cond_17

    .line 358
    .line 359
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 360
    .line 361
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    goto :goto_2

    .line 365
    :cond_17
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode3LCase:J

    .line 366
    .line 367
    cmp-long v3, v0, v3

    .line 368
    .line 369
    if-nez v3, :cond_18

    .line 370
    .line 371
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 372
    .line 373
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    goto :goto_2

    .line 377
    :cond_18
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader5;->hashCode4LCase:J

    .line 378
    .line 379
    cmp-long v0, v0, v3

    .line 380
    .line 381
    if-nez v0, :cond_19

    .line 382
    .line 383
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader5;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 384
    .line 385
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    goto :goto_2

    .line 389
    :cond_19
    invoke-virtual {p0, p1, v7, p4, p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    .line 390
    .line 391
    .line 392
    :cond_1a
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 393
    .line 394
    goto/16 :goto_0
.end method
