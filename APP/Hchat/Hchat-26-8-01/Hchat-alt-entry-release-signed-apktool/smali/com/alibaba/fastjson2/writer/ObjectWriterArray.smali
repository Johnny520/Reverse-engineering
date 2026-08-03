.class final Lcom/alibaba/fastjson2/writer/ObjectWriterArray;
.super Lcom/alibaba/fastjson2/writer/ObjectWriterPrimitiveImpl;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field static final INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterArray;


# instance fields
.field volatile itemObjectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

.field final itemType:Ljava/lang/reflect/Type;

.field final typeNameBytes:[B

.field final typeNameHash:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterArray;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterArray;-><init>(Ljava/lang/reflect/Type;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterArray;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterArray;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Type;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterPrimitiveImpl;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterArray;->itemType:Ljava/lang/reflect/Type;

    .line 5
    .line 6
    const-class v0, Ljava/lang/Object;

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    const-string p1, "[O"

    .line 11
    .line 12
    invoke-static {p1}, Lcom/alibaba/fastjson2/JSONB;->toBytes(Ljava/lang/String;)[B

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterArray;->typeNameBytes:[B

    .line 17
    .line 18
    const-string p1, "[0"

    .line 19
    .line 20
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    iput-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterArray;->typeNameHash:J

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v1, "["

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    check-cast p1, Ljava/lang/Class;

    .line 35
    .line 36
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1}, Lcom/alibaba/fastjson2/JSONB;->toBytes(Ljava/lang/String;)[B

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterArray;->typeNameBytes:[B

    .line 52
    .line 53
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    iput-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterArray;->typeNameHash:J

    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 8

    .line 1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/JSONWriter;->jsonb:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p6}, Lcom/alibaba/fastjson2/writer/ObjectWriterArray;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 6
    .line 7
    .line 8
    move-object p1, p0

    .line 9
    return-void

    .line 10
    :cond_0
    move-object v1, p1

    .line 11
    move-object p1, p0

    .line 12
    if-nez p2, :cond_1

    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeArrayNull()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->isRefDetect()Z

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    check-cast p2, [Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->startArray()V

    .line 25
    .line 26
    .line 27
    const/4 p4, 0x0

    .line 28
    const/4 v0, 0x0

    .line 29
    move v7, v0

    .line 30
    move-object v0, p4

    .line 31
    :goto_0
    array-length v2, p2

    .line 32
    if-ge v7, v2, :cond_8

    .line 33
    .line 34
    if-eqz v7, :cond_2

    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeComma()V

    .line 37
    .line 38
    .line 39
    :cond_2
    aget-object v2, p2, v7

    .line 40
    .line 41
    if-nez v2, :cond_3

    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 44
    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    if-ne v3, p4, :cond_4

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_4
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->isRefDetect()Z

    .line 55
    .line 56
    .line 57
    move-result p3

    .line 58
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-eqz p3, :cond_5

    .line 63
    .line 64
    invoke-static {v3}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->isNotReferenceDetect(Ljava/lang/Class;)Z

    .line 65
    .line 66
    .line 67
    move-result p3

    .line 68
    xor-int/lit8 p3, p3, 0x1

    .line 69
    .line 70
    :cond_5
    move-object p4, v3

    .line 71
    :goto_1
    if-eqz p3, :cond_6

    .line 72
    .line 73
    invoke-virtual {v1, v7, v2}, Lcom/alibaba/fastjson2/JSONWriter;->setPath(ILjava/lang/Object;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    if-eqz v3, :cond_6

    .line 78
    .line 79
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeReference(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_6
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    iget-object v4, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterArray;->itemType:Ljava/lang/reflect/Type;

    .line 91
    .line 92
    move-wide v5, p5

    .line 93
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 94
    .line 95
    .line 96
    if-eqz p3, :cond_7

    .line 97
    .line 98
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_7
    :goto_2
    add-int/lit8 v7, v7, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_8
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->endArray()V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 8

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeArrayNull()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->isRefDetect()Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    move-object p5, p2

    .line 12
    check-cast p5, [Ljava/lang/Object;

    .line 13
    .line 14
    invoke-virtual {p1, p2, p4}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteTypeInfo(Ljava/lang/Object;Ljava/lang/reflect/Type;)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterArray;->typeNameBytes:[B

    .line 21
    .line 22
    iget-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterArray;->typeNameHash:J

    .line 23
    .line 24
    invoke-virtual {p1, p2, v0, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeTypeName([BJ)Z

    .line 25
    .line 26
    .line 27
    :cond_1
    array-length p2, p5

    .line 28
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->startArray(I)V

    .line 29
    .line 30
    .line 31
    const/4 p2, 0x0

    .line 32
    const/4 p4, 0x0

    .line 33
    move p6, p4

    .line 34
    move p4, p3

    .line 35
    move-object p3, p2

    .line 36
    :goto_0
    array-length v0, p5

    .line 37
    if-ge p6, v0, :cond_7

    .line 38
    .line 39
    aget-object v3, p5, p6

    .line 40
    .line 41
    if-nez v3, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 44
    .line 45
    .line 46
    move-object v2, p1

    .line 47
    goto :goto_3

    .line 48
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-ne v0, p2, :cond_3

    .line 53
    .line 54
    move-object v1, p3

    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->isRefDetect()Z

    .line 57
    .line 58
    .line 59
    move-result p4

    .line 60
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    if-eqz p4, :cond_4

    .line 65
    .line 66
    invoke-static {v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->isNotReferenceDetect(Ljava/lang/Class;)Z

    .line 67
    .line 68
    .line 69
    move-result p2

    .line 70
    xor-int/lit8 p4, p2, 0x1

    .line 71
    .line 72
    :cond_4
    move-object v1, p3

    .line 73
    move-object p2, v0

    .line 74
    :goto_1
    if-eqz p4, :cond_5

    .line 75
    .line 76
    invoke-virtual {p1, p6, v3}, Lcom/alibaba/fastjson2/JSONWriter;->setPath(ILjava/lang/Object;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    if-eqz p3, :cond_5

    .line 81
    .line 82
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/JSONWriter;->writeReference(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    move-object v2, p1

    .line 89
    goto :goto_2

    .line 90
    :cond_5
    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    iget-object v5, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterArray;->itemType:Ljava/lang/reflect/Type;

    .line 95
    .line 96
    const-wide/16 v6, 0x0

    .line 97
    .line 98
    move-object v2, p1

    .line 99
    invoke-interface/range {v1 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 100
    .line 101
    .line 102
    if-eqz p4, :cond_6

    .line 103
    .line 104
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :cond_6
    :goto_2
    move-object p3, v1

    .line 108
    :goto_3
    add-int/lit8 p6, p6, 0x1

    .line 109
    .line 110
    move-object p1, v2

    .line 111
    goto :goto_0

    .line 112
    :cond_7
    return-void
.end method
