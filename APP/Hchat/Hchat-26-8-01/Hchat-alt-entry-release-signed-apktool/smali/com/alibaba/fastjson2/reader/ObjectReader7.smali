.class public Lcom/alibaba/fastjson2/reader/ObjectReader7;
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

.field protected final fieldReader6:Lcom/alibaba/fastjson2/reader/FieldReader;

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

.field final hashCode6:J

.field final hashCode6LCase:J

.field protected objectReader0:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader1:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader2:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader3:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader4:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader5:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field protected objectReader6:Lcom/alibaba/fastjson2/reader/ObjectReader;


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
    aget-object p1, p8, p1

    .line 21
    .line 22
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 23
    .line 24
    const/4 p2, 0x1

    .line 25
    aget-object p2, p8, p2

    .line 26
    .line 27
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 28
    .line 29
    const/4 p3, 0x2

    .line 30
    aget-object p3, p8, p3

    .line 31
    .line 32
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 33
    .line 34
    const/4 v1, 0x3

    .line 35
    aget-object v1, p8, v1

    .line 36
    .line 37
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 38
    .line 39
    const/4 v2, 0x4

    .line 40
    aget-object v2, p8, v2

    .line 41
    .line 42
    iput-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 43
    .line 44
    const/4 v3, 0x5

    .line 45
    aget-object v3, p8, v3

    .line 46
    .line 47
    iput-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->fieldReader5:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 48
    .line 49
    const/4 v4, 0x6

    .line 50
    aget-object v4, p8, v4

    .line 51
    .line 52
    iput-object v4, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->fieldReader6:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 53
    .line 54
    iget-wide v5, p1, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 55
    .line 56
    iput-wide v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode0:J

    .line 57
    .line 58
    iget-wide v5, p2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 59
    .line 60
    iput-wide v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode1:J

    .line 61
    .line 62
    iget-wide v5, p3, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 63
    .line 64
    iput-wide v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode2:J

    .line 65
    .line 66
    iget-wide v5, v1, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 67
    .line 68
    iput-wide v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode3:J

    .line 69
    .line 70
    iget-wide v5, v2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 71
    .line 72
    iput-wide v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode4:J

    .line 73
    .line 74
    iget-wide v5, v3, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 75
    .line 76
    iput-wide v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode5:J

    .line 77
    .line 78
    iget-wide v5, v4, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHash:J

    .line 79
    .line 80
    iput-wide v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode6:J

    .line 81
    .line 82
    iget-wide v5, p1, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 83
    .line 84
    iput-wide v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode0LCase:J

    .line 85
    .line 86
    iget-wide p1, p2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 87
    .line 88
    iput-wide p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode1LCase:J

    .line 89
    .line 90
    iget-wide p1, p3, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 91
    .line 92
    iput-wide p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode2LCase:J

    .line 93
    .line 94
    iget-wide p1, v1, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 95
    .line 96
    iput-wide p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode3LCase:J

    .line 97
    .line 98
    iget-wide p1, v2, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 99
    .line 100
    iput-wide p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode4LCase:J

    .line 101
    .line 102
    iget-wide p1, v3, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 103
    .line 104
    iput-wide p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode5LCase:J

    .line 105
    .line 106
    iget-wide p1, v4, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldNameHashLCase:J

    .line 107
    .line 108
    iput-wide p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode6LCase:J

    .line 109
    .line 110
    return-void
.end method


# virtual methods
.method public getFieldReader(J)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode0:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode1:J

    .line 11
    .line 12
    cmp-long v0, p1, v0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode2:J

    .line 20
    .line 21
    cmp-long v0, p1, v0

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_2
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode3:J

    .line 29
    .line 30
    cmp-long v0, p1, v0

    .line 31
    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode4:J

    .line 38
    .line 39
    cmp-long v0, p1, v0

    .line 40
    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_4
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode5:J

    .line 47
    .line 48
    cmp-long v0, p1, v0

    .line 49
    .line 50
    if-nez v0, :cond_5

    .line 51
    .line 52
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->fieldReader5:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_5
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode6:J

    .line 56
    .line 57
    cmp-long p1, p1, v0

    .line 58
    .line 59
    if-nez p1, :cond_6

    .line 60
    .line 61
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->fieldReader6:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 62
    .line 63
    return-object p1

    .line 64
    :cond_6
    const/4 p1, 0x0

    .line 65
    return-object p1
.end method

.method public getFieldReaderLCase(J)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode0LCase:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->fieldReader0:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode1LCase:J

    .line 11
    .line 12
    cmp-long v0, p1, v0

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->fieldReader1:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode2LCase:J

    .line 20
    .line 21
    cmp-long v0, p1, v0

    .line 22
    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->fieldReader2:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_2
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode3LCase:J

    .line 29
    .line 30
    cmp-long v0, p1, v0

    .line 31
    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->fieldReader3:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_3
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode4LCase:J

    .line 38
    .line 39
    cmp-long v0, p1, v0

    .line 40
    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->fieldReader4:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_4
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode5LCase:J

    .line 47
    .line 48
    cmp-long v0, p1, v0

    .line 49
    .line 50
    if-nez v0, :cond_5

    .line 51
    .line 52
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->fieldReader5:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_5
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->hashCode6LCase:J

    .line 56
    .line 57
    cmp-long p1, p1, v0

    .line 58
    .line 59
    if-nez p1, :cond_6

    .line 60
    .line 61
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReader7;->fieldReader6:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 62
    .line 63
    return-object p1

    .line 64
    :cond_6
    const/4 p1, 0x0

    .line 65
    return-object p1
.end method
