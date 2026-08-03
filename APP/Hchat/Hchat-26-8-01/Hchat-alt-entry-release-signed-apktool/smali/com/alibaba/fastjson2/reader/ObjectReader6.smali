.class public Lcom/alibaba/fastjson2/reader/ObjectReader6;
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

.field protected final fieldReader5:Lcom/alibaba/fastjson2/reader/FieldReader;

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

.field final hashCode5:J

.field final hashCode5LCase:J

.field protected objectReader0:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader1:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader2:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader3:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader4:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader5:Lcom/alibaba/fastjson2/reader/ObjectReader;


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
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 23
    .line 24
    const/4 p3, 0x1

    .line 25
    aget-object v1, p8, p3

    .line 26
    .line 27
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    aget-object v2, p8, v2

    .line 31
    .line 32
    iput-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 33
    .line 34
    const/4 v3, 0x3

    .line 35
    aget-object v3, p8, v3

    .line 36
    .line 37
    iput-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 38
    .line 39
    const/4 v4, 0x4

    .line 40
    aget-object v4, p8, v4

    .line 41
    .line 42
    iput-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 43
    .line 44
    const/4 v5, 0x5

    .line 45
    aget-object v5, p8, v5

    .line 46
    .line 47
    iput-object v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader5:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 48
    .line 49
    iget-wide v6, p2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 50
    .line 51
    iput-wide v6, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode0:J

    .line 52
    .line 53
    iget-wide v6, v1, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 54
    .line 55
    iput-wide v6, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode1:J

    .line 56
    .line 57
    iget-wide v6, v2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 58
    .line 59
    iput-wide v6, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode2:J

    .line 60
    .line 61
    iget-wide v6, v3, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 62
    .line 63
    iput-wide v6, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode3:J

    .line 64
    .line 65
    iget-wide v6, v4, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 66
    .line 67
    iput-wide v6, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode4:J

    .line 68
    .line 69
    iget-wide v6, v5, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 70
    .line 71
    iput-wide v6, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode5:J

    .line 72
    .line 73
    iget-wide v6, p2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 74
    .line 75
    iput-wide v6, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode0LCase:J

    .line 76
    .line 77
    iget-wide v6, v1, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 78
    .line 79
    iput-wide v6, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode1LCase:J

    .line 80
    .line 81
    iget-wide v6, v2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 82
    .line 83
    iput-wide v6, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode2LCase:J

    .line 84
    .line 85
    iget-wide v6, v3, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 86
    .line 87
    iput-wide v6, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode3LCase:J

    .line 88
    .line 89
    iget-wide v6, v4, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 90
    .line 91
    iput-wide v6, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode4LCase:J

    .line 92
    .line 93
    iget-wide v6, v5, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 94
    .line 95
    iput-wide v6, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode5LCase:J

    .line 96
    .line 97
    iget-object p2, p2, Lcom/alibaba/fastjson2/reader/FieldReader;->defaultValue:Ljava/lang/Object;

    .line 98
    .line 99
    if-nez p2, :cond_0

    .line 100
    .line 101
    iget-object p2, v1, Lcom/alibaba/fastjson2/reader/FieldReader;->defaultValue:Ljava/lang/Object;

    .line 102
    .line 103
    if-nez p2, :cond_0

    .line 104
    .line 105
    iget-object p2, v2, Lcom/alibaba/fastjson2/reader/FieldReader;->defaultValue:Ljava/lang/Object;

    .line 106
    .line 107
    if-nez p2, :cond_0

    .line 108
    .line 109
    iget-object p2, v3, Lcom/alibaba/fastjson2/reader/FieldReader;->defaultValue:Ljava/lang/Object;

    .line 110
    .line 111
    if-nez p2, :cond_0

    .line 112
    .line 113
    iget-object p2, v4, Lcom/alibaba/fastjson2/reader/FieldReader;->defaultValue:Ljava/lang/Object;

    .line 114
    .line 115
    if-nez p2, :cond_0

    .line 116
    .line 117
    iget-object p2, v5, Lcom/alibaba/fastjson2/reader/FieldReader;->defaultValue:Ljava/lang/Object;

    .line 118
    .line 119
    if-eqz p2, :cond_1

    .line 120
    .line 121
    :cond_0
    move p1, p3

    .line 122
    :cond_1
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->hasDefaultValue:Z

    .line 123
    .line 124
    return-void
.end method


# virtual methods
.method public getFieldReader(J)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode0:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode1:J

    .line 11
    .line 12
    cmp-long v0, p1, v0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode2:J

    .line 20
    .line 21
    cmp-long v0, p1, v0

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_2
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode3:J

    .line 29
    .line 30
    cmp-long v0, p1, v0

    .line 31
    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode4:J

    .line 38
    .line 39
    cmp-long v0, p1, v0

    .line 40
    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_4
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode5:J

    .line 47
    .line 48
    cmp-long p1, p1, v0

    .line 49
    .line 50
    if-nez p1, :cond_5

    .line 51
    .line 52
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader5:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_5
    const/4 p1, 0x0

    .line 56
    return-object p1
.end method

.method public getFieldReaderLCase(J)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode0LCase:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode1LCase:J

    .line 11
    .line 12
    cmp-long v0, p1, v0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode2LCase:J

    .line 20
    .line 21
    cmp-long v0, p1, v0

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_2
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode3LCase:J

    .line 29
    .line 30
    cmp-long v0, p1, v0

    .line 31
    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode4LCase:J

    .line 38
    .line 39
    cmp-long v0, p1, v0

    .line 40
    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_4
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode5LCase:J

    .line 47
    .line 48
    cmp-long p1, p1, v0

    .line 49
    .line 50
    if-nez p1, :cond_5

    .line 51
    .line 52
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader5:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_5
    const/4 p1, 0x0

    .line 56
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
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->acceptDefaultValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->acceptDefaultValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->acceptDefaultValue(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->acceptDefaultValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->acceptDefaultValue(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader5:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->acceptDefaultValue(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
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
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

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
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

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
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

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
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

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
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 86
    .line 87
    invoke-virtual {p3, v4, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    const/4 p3, 0x5

    .line 91
    if-le p2, p3, :cond_2

    .line 92
    .line 93
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader5:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 94
    .line 95
    invoke-virtual {p3, v4, p1}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    const/4 p3, 0x6

    .line 99
    :goto_0
    if-ge p3, p2, :cond_2

    .line 100
    .line 101
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->skipValue()V

    .line 102
    .line 103
    .line 104
    add-int/lit8 p3, p3, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_2
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->buildFunction:Ljava/util/function/Function;

    .line 108
    .line 109
    if-eqz p2, :cond_3

    .line 110
    .line 111
    invoke-interface {p2, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
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
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

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
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

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
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

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
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

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
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 61
    .line 62
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    const/4 v0, 0x5

    .line 66
    if-le p3, v0, :cond_1

    .line 67
    .line 68
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader5:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 69
    .line 70
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    const/4 v0, 0x6

    .line 74
    :goto_0
    if-ge v0, p3, :cond_1

    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->skipValue()V

    .line 77
    .line 78
    .line 79
    add-int/lit8 v0, v0, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->buildFunction:Ljava/util/function/Function;

    .line 83
    .line 84
    if-eqz p1, :cond_2

    .line 85
    .line 86
    invoke-interface {p1, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    return-object p1

    .line 91
    :cond_2
    return-object p2

    .line 92
    :cond_3
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->getTypeNameHash()J

    .line 95
    .line 96
    .line 97
    move-result-wide v3

    .line 98
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 99
    .line 100
    or-long v5, v0, p4

    .line 101
    .line 102
    move-object v1, p1

    .line 103
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReader;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    if-eqz v0, :cond_4

    .line 108
    .line 109
    invoke-interface {v0}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getObjectClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 114
    .line 115
    if-eq v1, v2, :cond_4

    .line 116
    .line 117
    move-object v1, p1

    .line 118
    move-object v2, p2

    .line 119
    move-object v3, p3

    .line 120
    move-wide v4, p4

    .line 121
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    return-object p1

    .line 126
    :cond_4
    const/16 p2, -0x5a

    .line 127
    .line 128
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(B)Z

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    if-eqz p2, :cond_18

    .line 133
    .line 134
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->creator:Ljava/util/function/Supplier;

    .line 135
    .line 136
    const-wide/16 v2, 0x0

    .line 137
    .line 138
    if-eqz p2, :cond_5

    .line 139
    .line 140
    invoke-interface {p2}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    goto :goto_1

    .line 145
    :cond_5
    iget-object p2, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 146
    .line 147
    iget-wide p2, p2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 148
    .line 149
    or-long/2addr p2, p4

    .line 150
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 151
    .line 152
    iget-wide v6, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 153
    .line 154
    and-long/2addr p2, v6

    .line 155
    cmp-long p2, p2, v2

    .line 156
    .line 157
    if-eqz p2, :cond_6

    .line 158
    .line 159
    :try_start_0
    sget-object p2, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 160
    .line 161
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 162
    .line 163
    invoke-virtual {p2, p3}, Lsun/misc/Unsafe;->allocateInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 167
    goto :goto_1

    .line 168
    :catch_0
    move-exception v0

    .line 169
    move-object p2, v0

    .line 170
    const-string p3, "create instance error"

    .line 171
    .line 172
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-static {p1, p2}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    const/4 p1, 0x0

    .line 180
    return-object p1

    .line 181
    :cond_6
    const/4 p2, 0x0

    .line 182
    :goto_1
    if-eqz p2, :cond_7

    .line 183
    .line 184
    iget-boolean p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->hasDefaultValue:Z

    .line 185
    .line 186
    if-eqz p3, :cond_7

    .line 187
    .line 188
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/reader/ObjectReader6;->initDefaultValue(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :cond_7
    :goto_2
    const/16 p3, -0x5b

    .line 192
    .line 193
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(B)Z

    .line 194
    .line 195
    .line 196
    move-result p3

    .line 197
    if-eqz p3, :cond_9

    .line 198
    .line 199
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->buildFunction:Ljava/util/function/Function;

    .line 200
    .line 201
    if-eqz p1, :cond_8

    .line 202
    .line 203
    invoke-interface {p1, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    return-object p1

    .line 208
    :cond_8
    return-object p2

    .line 209
    :cond_9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameHashCode()J

    .line 210
    .line 211
    .line 212
    move-result-wide v6

    .line 213
    cmp-long p3, v6, v2

    .line 214
    .line 215
    if-nez p3, :cond_a

    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_a
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode0:J

    .line 219
    .line 220
    cmp-long p3, v6, v8

    .line 221
    .line 222
    if-nez p3, :cond_b

    .line 223
    .line 224
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 225
    .line 226
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    goto :goto_2

    .line 230
    :cond_b
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode1:J

    .line 231
    .line 232
    cmp-long p3, v6, v8

    .line 233
    .line 234
    if-nez p3, :cond_c

    .line 235
    .line 236
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 237
    .line 238
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    goto :goto_2

    .line 242
    :cond_c
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode2:J

    .line 243
    .line 244
    cmp-long p3, v6, v8

    .line 245
    .line 246
    if-nez p3, :cond_d

    .line 247
    .line 248
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 249
    .line 250
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    goto :goto_2

    .line 254
    :cond_d
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode3:J

    .line 255
    .line 256
    cmp-long p3, v6, v8

    .line 257
    .line 258
    if-nez p3, :cond_e

    .line 259
    .line 260
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 261
    .line 262
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    goto :goto_2

    .line 266
    :cond_e
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode4:J

    .line 267
    .line 268
    cmp-long p3, v6, v8

    .line 269
    .line 270
    if-nez p3, :cond_f

    .line 271
    .line 272
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 273
    .line 274
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    goto :goto_2

    .line 278
    :cond_f
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode5:J

    .line 279
    .line 280
    cmp-long p3, v6, v8

    .line 281
    .line 282
    if-nez p3, :cond_10

    .line 283
    .line 284
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader5:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 285
    .line 286
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    goto :goto_2

    .line 290
    :cond_10
    iget-wide v6, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 291
    .line 292
    or-long/2addr v6, p4

    .line 293
    invoke-virtual {p1, v6, v7}, Lcom/alibaba/fastjson2/JSONReader;->isSupportSmartMatch(J)Z

    .line 294
    .line 295
    .line 296
    move-result p3

    .line 297
    if-nez p3, :cond_11

    .line 298
    .line 299
    invoke-virtual {p0, p1, p2, p4, p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    .line 300
    .line 301
    .line 302
    goto :goto_2

    .line 303
    :cond_11
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getNameHashCodeLCase()J

    .line 304
    .line 305
    .line 306
    move-result-wide v6

    .line 307
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode0LCase:J

    .line 308
    .line 309
    cmp-long p3, v6, v8

    .line 310
    .line 311
    if-nez p3, :cond_12

    .line 312
    .line 313
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 314
    .line 315
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    goto :goto_2

    .line 319
    :cond_12
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode1LCase:J

    .line 320
    .line 321
    cmp-long p3, v6, v8

    .line 322
    .line 323
    if-nez p3, :cond_13

    .line 324
    .line 325
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 326
    .line 327
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    goto/16 :goto_2

    .line 331
    .line 332
    :cond_13
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode2LCase:J

    .line 333
    .line 334
    cmp-long p3, v6, v8

    .line 335
    .line 336
    if-nez p3, :cond_14

    .line 337
    .line 338
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 339
    .line 340
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    goto/16 :goto_2

    .line 344
    .line 345
    :cond_14
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode3LCase:J

    .line 346
    .line 347
    cmp-long p3, v6, v8

    .line 348
    .line 349
    if-nez p3, :cond_15

    .line 350
    .line 351
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 352
    .line 353
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    goto/16 :goto_2

    .line 357
    .line 358
    :cond_15
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode4LCase:J

    .line 359
    .line 360
    cmp-long p3, v6, v8

    .line 361
    .line 362
    if-nez p3, :cond_16

    .line 363
    .line 364
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 365
    .line 366
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    goto/16 :goto_2

    .line 370
    .line 371
    :cond_16
    iget-wide v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode5LCase:J

    .line 372
    .line 373
    cmp-long p3, v6, v8

    .line 374
    .line 375
    if-nez p3, :cond_17

    .line 376
    .line 377
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader5:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 378
    .line 379
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    goto/16 :goto_2

    .line 383
    .line 384
    :cond_17
    invoke-virtual {p0, p1, p2, p4, p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    .line 385
    .line 386
    .line 387
    goto/16 :goto_2

    .line 388
    .line 389
    :cond_18
    new-instance p2, Ljava/lang/StringBuilder;

    .line 390
    .line 391
    const-string p3, "expect object, but "

    .line 392
    .line 393
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getType()B

    .line 397
    .line 398
    .line 399
    move-result p3

    .line 400
    invoke-static {p3}, Lcom/alibaba/fastjson2/JSONB;->typeName(B)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object p3

    .line 404
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object p2

    .line 411
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object p1

    .line 415
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    const/4 p1, 0x0

    .line 419
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
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/ObjectReader6;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

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
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/reader/ObjectReader6;->initDefaultValue(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    iget-object p3, v1, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 73
    .line 74
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object p3, v1, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 78
    .line 79
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object p3, v1, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 83
    .line 84
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object p3, v1, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 88
    .line 89
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object p3, v1, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 93
    .line 94
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iget-object p3, v1, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader5:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 98
    .line 99
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    .line 103
    .line 104
    .line 105
    move-result p3

    .line 106
    if-eqz p3, :cond_5

    .line 107
    .line 108
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 109
    .line 110
    .line 111
    iget-object p1, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->buildFunction:Ljava/util/function/Function;

    .line 112
    .line 113
    if-eqz p1, :cond_4

    .line 114
    .line 115
    invoke-interface {p1, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    return-object p1

    .line 120
    :cond_4
    return-object p2

    .line 121
    :cond_5
    const-string p2, "array to bean end error"

    .line 122
    .line 123
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    const/4 p1, 0x0

    .line 131
    return-object p1

    .line 132
    :cond_6
    move-object v2, p1

    .line 133
    move-object v3, p2

    .line 134
    move-object v4, p3

    .line 135
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processObjectInputSingleItemArray(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    move-object p2, v1

    .line 140
    return-object p1

    .line 141
    :cond_7
    move-wide v8, v2

    .line 142
    move-object v2, p2

    .line 143
    move-object p2, v1

    .line 144
    move-wide v0, v8

    .line 145
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectStart()Z

    .line 146
    .line 147
    .line 148
    iget-object v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->creator:Ljava/util/function/Supplier;

    .line 149
    .line 150
    invoke-interface {v3}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    iget-boolean v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->hasDefaultValue:Z

    .line 155
    .line 156
    if-eqz v3, :cond_8

    .line 157
    .line 158
    invoke-virtual {p0, v7}, Lcom/alibaba/fastjson2/reader/ObjectReader6;->initDefaultValue(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    :cond_8
    if-eqz v7, :cond_9

    .line 162
    .line 163
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->InitStringFieldAsEmpty:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 164
    .line 165
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 166
    .line 167
    and-long/2addr v3, v5

    .line 168
    cmp-long v0, v3, v0

    .line 169
    .line 170
    if-eqz v0, :cond_9

    .line 171
    .line 172
    invoke-virtual {p0, v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;->initStringFieldAsEmpty(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    :cond_9
    const/4 v0, 0x0

    .line 176
    move v6, v0

    .line 177
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectEnd()Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-eqz v0, :cond_a

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_a
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameHashCode()J

    .line 185
    .line 186
    .line 187
    move-result-wide v0

    .line 188
    if-nez v6, :cond_d

    .line 189
    .line 190
    const-wide v3, 0x6570797440L

    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    cmp-long v3, v0, v3

    .line 196
    .line 197
    if-nez v3, :cond_d

    .line 198
    .line 199
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readTypeHashCode()J

    .line 200
    .line 201
    .line 202
    move-result-wide v0

    .line 203
    iget-object v3, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 204
    .line 205
    invoke-virtual {v3, v0, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    if-nez v0, :cond_b

    .line 210
    .line 211
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    iget-object v1, p2, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 216
    .line 217
    invoke-virtual {v3, v0, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(Ljava/lang/String;Ljava/lang/Class;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    if-nez v0, :cond_b

    .line 222
    .line 223
    goto/16 :goto_2

    .line 224
    .line 225
    :cond_b
    if-eq v0, p2, :cond_1b

    .line 226
    .line 227
    move-object v1, p1

    .line 228
    move-object v3, p3

    .line 229
    move-wide v4, p4

    .line 230
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v7

    .line 234
    :goto_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 235
    .line 236
    .line 237
    iget-object p1, p2, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->buildFunction:Ljava/util/function/Function;

    .line 238
    .line 239
    if-eqz p1, :cond_c

    .line 240
    .line 241
    invoke-interface {p1, v7}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    return-object p1

    .line 246
    :cond_c
    return-object v7

    .line 247
    :cond_d
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode0:J

    .line 248
    .line 249
    cmp-long v3, v0, v3

    .line 250
    .line 251
    if-nez v3, :cond_e

    .line 252
    .line 253
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 254
    .line 255
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    goto/16 :goto_2

    .line 259
    .line 260
    :cond_e
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode1:J

    .line 261
    .line 262
    cmp-long v3, v0, v3

    .line 263
    .line 264
    if-nez v3, :cond_f

    .line 265
    .line 266
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 267
    .line 268
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    goto/16 :goto_2

    .line 272
    .line 273
    :cond_f
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode2:J

    .line 274
    .line 275
    cmp-long v3, v0, v3

    .line 276
    .line 277
    if-nez v3, :cond_10

    .line 278
    .line 279
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 280
    .line 281
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    goto/16 :goto_2

    .line 285
    .line 286
    :cond_10
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode3:J

    .line 287
    .line 288
    cmp-long v3, v0, v3

    .line 289
    .line 290
    if-nez v3, :cond_11

    .line 291
    .line 292
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 293
    .line 294
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    goto/16 :goto_2

    .line 298
    .line 299
    :cond_11
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode4:J

    .line 300
    .line 301
    cmp-long v3, v0, v3

    .line 302
    .line 303
    if-nez v3, :cond_12

    .line 304
    .line 305
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 306
    .line 307
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    goto/16 :goto_2

    .line 311
    .line 312
    :cond_12
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode5:J

    .line 313
    .line 314
    cmp-long v0, v0, v3

    .line 315
    .line 316
    if-nez v0, :cond_13

    .line 317
    .line 318
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader5:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 319
    .line 320
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    goto :goto_2

    .line 324
    :cond_13
    iget-wide v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 325
    .line 326
    or-long/2addr v0, p4

    .line 327
    invoke-virtual {p1, v0, v1}, Lcom/alibaba/fastjson2/JSONReader;->isSupportSmartMatch(J)Z

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    if-nez v0, :cond_14

    .line 332
    .line 333
    invoke-virtual {p0, p1, v7, p4, p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    .line 334
    .line 335
    .line 336
    goto :goto_2

    .line 337
    :cond_14
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getNameHashCodeLCase()J

    .line 338
    .line 339
    .line 340
    move-result-wide v0

    .line 341
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode0LCase:J

    .line 342
    .line 343
    cmp-long v3, v0, v3

    .line 344
    .line 345
    if-nez v3, :cond_15

    .line 346
    .line 347
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 348
    .line 349
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    goto :goto_2

    .line 353
    :cond_15
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode1LCase:J

    .line 354
    .line 355
    cmp-long v3, v0, v3

    .line 356
    .line 357
    if-nez v3, :cond_16

    .line 358
    .line 359
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 360
    .line 361
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    goto :goto_2

    .line 365
    :cond_16
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode2LCase:J

    .line 366
    .line 367
    cmp-long v3, v0, v3

    .line 368
    .line 369
    if-nez v3, :cond_17

    .line 370
    .line 371
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 372
    .line 373
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    goto :goto_2

    .line 377
    :cond_17
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode3LCase:J

    .line 378
    .line 379
    cmp-long v3, v0, v3

    .line 380
    .line 381
    if-nez v3, :cond_18

    .line 382
    .line 383
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 384
    .line 385
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    goto :goto_2

    .line 389
    :cond_18
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode4LCase:J

    .line 390
    .line 391
    cmp-long v3, v0, v3

    .line 392
    .line 393
    if-nez v3, :cond_19

    .line 394
    .line 395
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 396
    .line 397
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    goto :goto_2

    .line 401
    :cond_19
    iget-wide v3, p2, Lcom/alibaba/fastjson2/reader/ObjectReader6;->hashCode5LCase:J

    .line 402
    .line 403
    cmp-long v0, v0, v3

    .line 404
    .line 405
    if-nez v0, :cond_1a

    .line 406
    .line 407
    iget-object v0, p2, Lcom/alibaba/fastjson2/reader/ObjectReader6;->fieldReader5:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 408
    .line 409
    invoke-virtual {v0, p1, v7}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    goto :goto_2

    .line 413
    :cond_1a
    invoke-virtual {p0, p1, v7, p4, p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    .line 414
    .line 415
    .line 416
    :cond_1b
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 417
    .line 418
    goto/16 :goto_0
.end method
