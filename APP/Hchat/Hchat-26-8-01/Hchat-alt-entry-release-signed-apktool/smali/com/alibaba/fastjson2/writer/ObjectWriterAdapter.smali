.class public Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/writer/ObjectWriter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/alibaba/fastjson2/writer/ObjectWriter<",
        "TT;>;"
    }
.end annotation


# static fields
.field static final TYPE:Ljava/lang/String; = "@type"


# instance fields
.field final containsNoneFieldGetter:Z

.field final features:J

.field protected final fieldWriterArray:[Lcom/alibaba/fastjson2/writer/FieldWriter;

.field final fieldWriters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/alibaba/fastjson2/writer/FieldWriter;",
            ">;"
        }
    .end annotation
.end field

.field final googleCollection:Z

.field hasFilter:Z

.field final hasValueField:Z

.field final hashCodes:[J

.field final mapping:[S

.field nameFilter:Lcom/alibaba/fastjson2/filter/NameFilter;

.field nameWithColonUTF16:[C

.field nameWithColonUTF8:[B

.field final objectClass:Ljava/lang/Class;

.field propertyFilter:Lcom/alibaba/fastjson2/filter/PropertyFilter;

.field propertyPreFilter:Lcom/alibaba/fastjson2/filter/PropertyPreFilter;

.field final serializable:Z

.field final typeKey:Ljava/lang/String;

.field typeKeyJSONB:[B

.field private typeName:Ljava/lang/String;

.field protected typeNameHash:J

.field protected typeNameJSONB:[B

.field protected typeNameSymbolCache:J

.field valueFilter:Lcom/alibaba/fastjson2/filter/ValueFilter;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/List<",
            "Lcom/alibaba/fastjson2/writer/FieldWriter;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->objectClass:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeName:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    :cond_0
    const-string p2, "@type"

    .line 17
    .line 18
    :cond_1
    iput-object p2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeKey:Ljava/lang/String;

    .line 19
    .line 20
    iput-wide p4, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->features:J

    .line 21
    .line 22
    iput-object p6, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->fieldWriters:Ljava/util/List;

    .line 23
    .line 24
    const/4 p2, 0x1

    .line 25
    const/4 p4, 0x0

    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    const-class p5, Ljava/io/Serializable;

    .line 29
    .line 30
    invoke-virtual {p5, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    move p1, p4

    .line 38
    goto :goto_1

    .line 39
    :cond_3
    :goto_0
    move p1, p2

    .line 40
    :goto_1
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->serializable:Z

    .line 41
    .line 42
    const-string p1, "com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList"

    .line 43
    .line 44
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-nez p1, :cond_5

    .line 49
    .line 50
    const-string p1, "com.google.common.collect.AbstractMapBasedMultimap$WrappedSet"

    .line 51
    .line 52
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_4

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_4
    move p1, p4

    .line 60
    goto :goto_3

    .line 61
    :cond_5
    :goto_2
    move p1, p2

    .line 62
    :goto_3
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->googleCollection:Z

    .line 63
    .line 64
    invoke-interface {p6}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    new-array p1, p1, [Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 69
    .line 70
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->fieldWriterArray:[Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 71
    .line 72
    invoke-interface {p6, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    array-length p3, p1

    .line 76
    const-wide/16 p5, 0x0

    .line 77
    .line 78
    if-ne p3, p2, :cond_6

    .line 79
    .line 80
    aget-object p3, p1, p4

    .line 81
    .line 82
    iget-wide v0, p3, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 83
    .line 84
    const-wide/high16 v2, 0x1000000000000L

    .line 85
    .line 86
    and-long/2addr v0, v2

    .line 87
    cmp-long p3, v0, p5

    .line 88
    .line 89
    if-eqz p3, :cond_6

    .line 90
    .line 91
    move p3, p2

    .line 92
    goto :goto_4

    .line 93
    :cond_6
    move p3, p4

    .line 94
    :goto_4
    iput-boolean p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->hasValueField:Z

    .line 95
    .line 96
    array-length p1, p1

    .line 97
    new-array p3, p1, [J

    .line 98
    .line 99
    move v0, p4

    .line 100
    move v1, v0

    .line 101
    :goto_5
    iget-object v2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->fieldWriterArray:[Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 102
    .line 103
    array-length v3, v2

    .line 104
    if-ge v0, v3, :cond_8

    .line 105
    .line 106
    aget-object v2, v2, v0

    .line 107
    .line 108
    iget-object v3, v2, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 109
    .line 110
    invoke-static {v3}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 111
    .line 112
    .line 113
    move-result-wide v3

    .line 114
    aput-wide v3, p3, v0

    .line 115
    .line 116
    iget-object v3, v2, Lcom/alibaba/fastjson2/writer/FieldWriter;->method:Ljava/lang/reflect/Method;

    .line 117
    .line 118
    if-eqz v3, :cond_7

    .line 119
    .line 120
    iget-wide v2, v2, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 121
    .line 122
    const-wide/high16 v4, 0x10000000000000L

    .line 123
    .line 124
    and-long/2addr v2, v4

    .line 125
    cmp-long v2, v2, p5

    .line 126
    .line 127
    if-nez v2, :cond_7

    .line 128
    .line 129
    move v1, p2

    .line 130
    :cond_7
    add-int/lit8 v0, v0, 0x1

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_8
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->containsNoneFieldGetter:Z

    .line 134
    .line 135
    invoke-static {p3, p1}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    iput-object p2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->hashCodes:[J

    .line 140
    .line 141
    invoke-static {p2}, Ljava/util/Arrays;->sort([J)V

    .line 142
    .line 143
    .line 144
    array-length p2, p2

    .line 145
    new-array p2, p2, [S

    .line 146
    .line 147
    iput-object p2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->mapping:[S

    .line 148
    .line 149
    :goto_6
    if-ge p4, p1, :cond_9

    .line 150
    .line 151
    aget-wide p5, p3, p4

    .line 152
    .line 153
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->hashCodes:[J

    .line 154
    .line 155
    invoke-static {p2, p5, p6}, Ljava/util/Arrays;->binarySearch([JJ)I

    .line 156
    .line 157
    .line 158
    move-result p2

    .line 159
    iget-object p5, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->mapping:[S

    .line 160
    .line 161
    int-to-short p6, p4

    .line 162
    aput-short p6, p5, p2

    .line 163
    .line 164
    add-int/lit8 p4, p4, 0x1

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_9
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/util/List<",
            "Lcom/alibaba/fastjson2/writer/FieldWriter;",
            ">;)V"
        }
    .end annotation

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v6, p2

    .line 168
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    return-void
.end method

.method private writeClassInfoSymbol(Lcom/alibaba/fastjson2/JSONWriter;Lcom/alibaba/fastjson2/SymbolTable;)Z
    .locals 6

    .line 1
    invoke-static {p2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-wide v1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeNameSymbolCache:J

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    cmp-long v3, v1, v3

    .line 10
    .line 11
    const/16 v4, 0x20

    .line 12
    .line 13
    const/4 v5, -0x1

    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->getTypeNameHash()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    invoke-virtual {p2, v1, v2}, Lcom/alibaba/fastjson2/SymbolTable;->getOrdinalByHashCode(J)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eq p2, v5, :cond_2

    .line 25
    .line 26
    int-to-long v1, p2

    .line 27
    shl-long/2addr v1, v4

    .line 28
    int-to-long v3, v0

    .line 29
    or-long v0, v1, v3

    .line 30
    .line 31
    iput-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeNameSymbolCache:J

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    long-to-int v3, v1

    .line 35
    if-ne v3, v0, :cond_1

    .line 36
    .line 37
    shr-long v0, v1, v4

    .line 38
    .line 39
    long-to-int p2, v0

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->getTypeNameHash()J

    .line 42
    .line 43
    .line 44
    move-result-wide v1

    .line 45
    invoke-virtual {p2, v1, v2}, Lcom/alibaba/fastjson2/SymbolTable;->getOrdinalByHashCode(J)I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-eq p2, v5, :cond_2

    .line 50
    .line 51
    int-to-long v1, p2

    .line 52
    shl-long/2addr v1, v4

    .line 53
    int-to-long v3, v0

    .line 54
    or-long v0, v1, v3

    .line 55
    .line 56
    iput-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeNameSymbolCache:J

    .line 57
    .line 58
    :cond_2
    :goto_0
    if-eq p2, v5, :cond_3

    .line 59
    .line 60
    const/16 v0, -0x6e

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeRaw(B)V

    .line 63
    .line 64
    .line 65
    neg-int p2, p2

    .line 66
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt32(I)V

    .line 67
    .line 68
    .line 69
    const/4 p1, 0x1

    .line 70
    return p1

    .line 71
    :cond_3
    const/4 p1, 0x0

    .line 72
    return p1
.end method


# virtual methods
.method public errorOnNoneSerializable()V
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->objectClass:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "not support none serializable class "

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method public getFeatures()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->features:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getFieldWriter(J)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->hashCodes:[J

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Ljava/util/Arrays;->binarySearch([JJ)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-gez p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    :cond_0
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->mapping:[S

    .line 12
    .line 13
    aget-short p1, p2, p1

    .line 14
    .line 15
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->fieldWriterArray:[Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 16
    .line 17
    aget-object p1, p2, p1

    .line 18
    .line 19
    return-object p1
.end method

.method public getFieldWriters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/alibaba/fastjson2/writer/FieldWriter;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->fieldWriters:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTypeName()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeName:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->objectClass:Ljava/lang/Class;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const-class v1, Ljava/lang/Enum;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->objectClass:Ljava/lang/Class;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->objectClass:Ljava/lang/Class;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeName:Ljava/lang/String;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->objectClass:Ljava/lang/Class;

    .line 39
    .line 40
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeName:Ljava/lang/String;

    .line 45
    .line 46
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeName:Ljava/lang/String;

    .line 47
    .line 48
    return-object v0
.end method

.method public getTypeNameHash()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeNameHash:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->getTypeName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iput-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeNameHash:J

    .line 20
    .line 21
    :cond_0
    iget-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeNameHash:J

    .line 22
    .line 23
    return-wide v0
.end method

.method public getTypeNameJSONB()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeNameJSONB:[B

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->getTypeName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Lcom/alibaba/fastjson2/JSONB;->toBytes(Ljava/lang/String;)[B

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeNameJSONB:[B

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeNameJSONB:[B

    .line 18
    .line 19
    return-object v0
.end method

.method public final hasFilter(Lcom/alibaba/fastjson2/JSONWriter;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->hasFilter:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->containsNoneFieldGetter:Z

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->hasFilter(Z)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1

    .line 16
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 17
    return p1
.end method

.method public setNameFilter(Lcom/alibaba/fastjson2/filter/NameFilter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->nameFilter:Lcom/alibaba/fastjson2/filter/NameFilter;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->hasFilter:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setPropertyFilter(Lcom/alibaba/fastjson2/filter/PropertyFilter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->propertyFilter:Lcom/alibaba/fastjson2/filter/PropertyFilter;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->hasFilter:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setPropertyPreFilter(Lcom/alibaba/fastjson2/filter/PropertyPreFilter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->propertyPreFilter:Lcom/alibaba/fastjson2/filter/PropertyPreFilter;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->hasFilter:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setValueFilter(Lcom/alibaba/fastjson2/filter/ValueFilter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->valueFilter:Lcom/alibaba/fastjson2/filter/ValueFilter;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->hasFilter:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public toJSONObject(Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONObject;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lcom/alibaba/fastjson2/JSONObject;"
        }
    .end annotation

    const-wide/16 v0, 0x0

    .line 263
    invoke-virtual {p0, p1, v0, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->toJSONObject(Ljava/lang/Object;J)Lcom/alibaba/fastjson2/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public toJSONObject(Ljava/lang/Object;J)Lcom/alibaba/fastjson2/JSONObject;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;J)",
            "Lcom/alibaba/fastjson2/JSONObject;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->fieldWriters:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_d

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 23
    .line 24
    invoke-virtual {v2, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->getFieldValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    iget-object v4, v2, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClass:Ljava/lang/Class;

    .line 29
    .line 30
    iget-wide v5, v2, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 31
    .line 32
    const-wide/high16 v7, 0x2000000000000L

    .line 33
    .line 34
    and-long/2addr v5, v7

    .line 35
    const-wide/16 v7, 0x0

    .line 36
    .line 37
    cmp-long v5, v5, v7

    .line 38
    .line 39
    if-eqz v5, :cond_3

    .line 40
    .line 41
    instance-of v4, v3, Ljava/util/Map;

    .line 42
    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    check-cast v3, Ljava/util/Map;

    .line 46
    .line 47
    invoke-virtual {v0, v3}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->getInitWriter()Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    if-nez v4, :cond_2

    .line 56
    .line 57
    sget-object v4, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 58
    .line 59
    iget-object v2, v2, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClass:Ljava/lang/Class;

    .line 60
    .line 61
    invoke-virtual {v4, v2}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    :cond_2
    invoke-interface {v4}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->getFieldWriters()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_0

    .line 78
    .line 79
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    check-cast v4, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 84
    .line 85
    invoke-virtual {v4, v3}, Lcom/alibaba/fastjson2/writer/FieldWriter;->getFieldValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    iget-object v4, v4, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v0, v4, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    if-eqz v3, :cond_6

    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    const-class v6, Ljava/util/Collection;

    .line 106
    .line 107
    invoke-virtual {v6, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    if-eqz v4, :cond_6

    .line 112
    .line 113
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    const-class v6, Lcom/alibaba/fastjson2/JSONObject;

    .line 118
    .line 119
    if-eq v4, v6, :cond_6

    .line 120
    .line 121
    const-string v4, "com.alibaba.fastjson.JSONObject"

    .line 122
    .line 123
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-nez v4, :cond_6

    .line 128
    .line 129
    check-cast v3, Ljava/util/Collection;

    .line 130
    .line 131
    new-instance v4, Lcom/alibaba/fastjson2/JSONArray;

    .line 132
    .line 133
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    invoke-direct {v4, v5}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-eqz v5, :cond_5

    .line 149
    .line 150
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    if-ne v5, p1, :cond_4

    .line 155
    .line 156
    move-object v5, v0

    .line 157
    goto :goto_3

    .line 158
    :cond_4
    invoke-static {v5}, Lcom/alibaba/fastjson2/JSON;->toJSON(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    :goto_3
    invoke-virtual {v4, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_5
    move-object v3, v4

    .line 167
    :cond_6
    if-nez v3, :cond_7

    .line 168
    .line 169
    iget-wide v4, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->features:J

    .line 170
    .line 171
    or-long/2addr v4, p2

    .line 172
    sget-object v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 173
    .line 174
    iget-wide v9, v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 175
    .line 176
    and-long/2addr v4, v9

    .line 177
    cmp-long v4, v4, v7

    .line 178
    .line 179
    if-nez v4, :cond_7

    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :cond_7
    if-ne v3, p1, :cond_8

    .line 184
    .line 185
    move-object v3, v0

    .line 186
    :cond_8
    instance-of v4, v3, Ljava/lang/Enum;

    .line 187
    .line 188
    if-eqz v4, :cond_9

    .line 189
    .line 190
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteEnumsUsingName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 191
    .line 192
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 193
    .line 194
    and-long/2addr v4, p2

    .line 195
    cmp-long v4, v4, v7

    .line 196
    .line 197
    if-eqz v4, :cond_9

    .line 198
    .line 199
    check-cast v3, Ljava/lang/Enum;

    .line 200
    .line 201
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    :cond_9
    instance-of v4, v2, Lcom/alibaba/fastjson2/writer/FieldWriterObject;

    .line 206
    .line 207
    if-eqz v4, :cond_c

    .line 208
    .line 209
    if-eqz v3, :cond_c

    .line 210
    .line 211
    instance-of v4, v3, Ljava/util/Map;

    .line 212
    .line 213
    if-nez v4, :cond_c

    .line 214
    .line 215
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->getInitWriter()Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    if-nez v4, :cond_a

    .line 220
    .line 221
    iget-object v4, v2, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldType:Ljava/lang/reflect/Type;

    .line 222
    .line 223
    iget-wide v5, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->features:J

    .line 224
    .line 225
    or-long/2addr v5, p2

    .line 226
    invoke-static {v4, v5, v6}, Lcom/alibaba/fastjson2/JSONFactory;->getObjectWriter(Ljava/lang/reflect/Type;J)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    :cond_a
    instance-of v5, v4, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;

    .line 231
    .line 232
    if-eqz v5, :cond_c

    .line 233
    .line 234
    check-cast v4, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;

    .line 235
    .line 236
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->getFieldWriters()Ljava/util/List;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    if-nez v5, :cond_b

    .line 245
    .line 246
    invoke-virtual {v4, v3}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->toJSONObject(Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONObject;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    goto :goto_4

    .line 251
    :cond_b
    invoke-static {v3}, Lcom/alibaba/fastjson2/JSON;->toJSON(Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    :cond_c
    :goto_4
    iget-object v2, v2, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 256
    .line 257
    invoke-virtual {v0, v2, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    goto/16 :goto_0

    .line 261
    .line 262
    :cond_d
    return-object v0
.end method

.method public toMap(Ljava/lang/Object;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->fieldWriters:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONObject;-><init>(I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    iget-object v2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->fieldWriters:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-ge v1, v2, :cond_0

    .line 20
    .line 21
    iget-object v2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->fieldWriters:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 28
    .line 29
    iget-object v3, v2, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v2, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->getFieldValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->objectClass:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 12

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->hasValueField:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->fieldWriterArray:[Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 7
    .line 8
    aget-object p3, p3, v1

    .line 9
    .line 10
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeValue(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-wide v2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->features:J

    .line 15
    .line 16
    or-long v2, p5, v2

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->getFeatures()J

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    or-long/2addr v2, v4

    .line 23
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BeanToArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 24
    .line 25
    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 26
    .line 27
    and-long/2addr v4, v2

    .line 28
    const-wide/16 v6, 0x0

    .line 29
    .line 30
    cmp-long v0, v4, v6

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move v0, v1

    .line 37
    :goto_0
    iget-boolean v4, p1, Lcom/alibaba/fastjson2/JSONWriter;->jsonb:Z

    .line 38
    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual/range {p0 .. p6}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->writeArrayMappingJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    invoke-virtual/range {p0 .. p6}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    iget-boolean v4, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->googleCollection:Z

    .line 52
    .line 53
    if-eqz v4, :cond_4

    .line 54
    .line 55
    move-object v2, p2

    .line 56
    check-cast v2, Ljava/util/Collection;

    .line 57
    .line 58
    sget-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;

    .line 59
    .line 60
    move-object v1, p1

    .line 61
    move-object v3, p3

    .line 62
    move-object/from16 v4, p4

    .line 63
    .line 64
    move-wide/from16 v5, p5

    .line 65
    .line 66
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_4
    move-wide/from16 v8, p5

    .line 71
    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    invoke-interface/range {p0 .. p6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeArrayMapping(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_5
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->serializable:Z

    .line 79
    .line 80
    if-nez v0, :cond_7

    .line 81
    .line 82
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ErrorOnNoneSerializable:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 83
    .line 84
    iget-wide v10, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 85
    .line 86
    and-long/2addr v10, v2

    .line 87
    cmp-long v0, v10, v6

    .line 88
    .line 89
    if-eqz v0, :cond_6

    .line 90
    .line 91
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->errorOnNoneSerializable()V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_6
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->IgnoreNoneSerializable:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 96
    .line 97
    iget-wide v10, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 98
    .line 99
    and-long/2addr v2, v10

    .line 100
    cmp-long v0, v2, v6

    .line 101
    .line 102
    if-eqz v0, :cond_7

    .line 103
    .line 104
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_7
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->hasFilter(Lcom/alibaba/fastjson2/JSONWriter;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_8

    .line 113
    .line 114
    invoke-virtual/range {p0 .. p6}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->writeWithFilter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_8
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->startObject()V

    .line 119
    .line 120
    .line 121
    iget-wide v2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->features:J

    .line 122
    .line 123
    or-long/2addr v2, v8

    .line 124
    sget-object p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 125
    .line 126
    iget-wide v10, p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 127
    .line 128
    and-long/2addr v2, v10

    .line 129
    cmp-long p3, v2, v6

    .line 130
    .line 131
    if-nez p3, :cond_9

    .line 132
    .line 133
    invoke-virtual {p1, p2, v8, v9}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteTypeInfo(Ljava/lang/Object;J)Z

    .line 134
    .line 135
    .line 136
    move-result p3

    .line 137
    if-eqz p3, :cond_a

    .line 138
    .line 139
    :cond_9
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->writeTypeInfo(Lcom/alibaba/fastjson2/JSONWriter;)Z

    .line 140
    .line 141
    .line 142
    :cond_a
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->fieldWriters:Ljava/util/List;

    .line 143
    .line 144
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 145
    .line 146
    .line 147
    move-result p3

    .line 148
    :goto_1
    if-ge v1, p3, :cond_b

    .line 149
    .line 150
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->fieldWriters:Ljava/util/List;

    .line 151
    .line 152
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    check-cast v0, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 157
    .line 158
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    add-int/lit8 v1, v1, 0x1

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_b
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->endObject()V

    .line 165
    .line 166
    .line 167
    return-void
.end method

.method public writeArrayMappingJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2, p4, p5, p6}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteTypeInfo(Ljava/lang/Object;Ljava/lang/reflect/Type;J)Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->writeClassInfo(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->fieldWriters:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/JSONWriter;->startArray(I)V

    .line 17
    .line 18
    .line 19
    const/4 p4, 0x0

    .line 20
    :goto_0
    if-ge p4, p3, :cond_1

    .line 21
    .line 22
    iget-object p5, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->fieldWriters:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {p5, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p5

    .line 28
    check-cast p5, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 29
    .line 30
    invoke-virtual {p5, p1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeValue(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    add-int/lit8 p4, p4, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-void
.end method

.method public final writeClassInfo(Lcom/alibaba/fastjson2/JSONWriter;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lcom/alibaba/fastjson2/JSONWriter;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0, p1, v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->writeClassInfoSymbol(Lcom/alibaba/fastjson2/JSONWriter;Lcom/alibaba/fastjson2/SymbolTable;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->getTypeNameJSONB()[B

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->getTypeNameHash()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    invoke-virtual {p1, v0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeTypeName([BJ)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 7

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->features:J

    .line 2
    .line 3
    or-long/2addr v0, p5

    .line 4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->getFeatures()J

    .line 5
    .line 6
    .line 7
    move-result-wide v2

    .line 8
    or-long/2addr v0, v2

    .line 9
    iget-boolean v2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->serializable:Z

    .line 10
    .line 11
    const-wide/16 v3, 0x0

    .line 12
    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ErrorOnNoneSerializable:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 16
    .line 17
    iget-wide v5, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 18
    .line 19
    and-long/2addr v5, v0

    .line 20
    cmp-long v2, v5, v3

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->errorOnNoneSerializable()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->IgnoreNoneSerializable:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 29
    .line 30
    iget-wide v5, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 31
    .line 32
    and-long/2addr v5, v0

    .line 33
    cmp-long v2, v5, v3

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->IgnoreNoneSerializable:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 42
    .line 43
    iget-wide v5, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 44
    .line 45
    and-long/2addr v0, v5

    .line 46
    cmp-long v0, v0, v3

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    invoke-virtual/range {p0 .. p6}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->writeWithFilter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 51
    .line 52
    .line 53
    move-object p1, p0

    .line 54
    return-void

    .line 55
    :cond_2
    move-object p3, p2

    .line 56
    move-object p2, p1

    .line 57
    move-object p1, p0

    .line 58
    iget-object v0, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->fieldWriterArray:[Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 59
    .line 60
    array-length v0, v0

    .line 61
    invoke-virtual {p2, p3, p4, p5, p6}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteTypeInfo(Ljava/lang/Object;Ljava/lang/reflect/Type;J)Z

    .line 62
    .line 63
    .line 64
    move-result p4

    .line 65
    if-eqz p4, :cond_3

    .line 66
    .line 67
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->writeClassInfo(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    invoke-virtual {p2}, Lcom/alibaba/fastjson2/JSONWriter;->startObject()V

    .line 71
    .line 72
    .line 73
    const/4 p4, 0x0

    .line 74
    :goto_0
    if-ge p4, v0, :cond_4

    .line 75
    .line 76
    iget-object p5, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->fieldWriters:Ljava/util/List;

    .line 77
    .line 78
    invoke-interface {p5, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p5

    .line 82
    check-cast p5, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 83
    .line 84
    invoke-virtual {p5, p2, p3}, Lcom/alibaba/fastjson2/writer/FieldWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    add-int/lit8 p4, p4, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    invoke-virtual {p2}, Lcom/alibaba/fastjson2/JSONWriter;->endObject()V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public writeTypeInfo(Lcom/alibaba/fastjson2/JSONWriter;)Z
    .locals 10

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->getTypeName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v1, p1, Lcom/alibaba/fastjson2/JSONWriter;->utf8:Z

    .line 6
    .line 7
    const/16 v2, 0x3a

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    const/16 v5, 0x22

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->nameWithColonUTF8:[B

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeKey:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    add-int v7, v1, v6

    .line 30
    .line 31
    add-int/lit8 v8, v7, 0x5

    .line 32
    .line 33
    new-array v8, v8, [B

    .line 34
    .line 35
    aput-byte v5, v8, v3

    .line 36
    .line 37
    iget-object v9, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeKey:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v9, v3, v1, v8, v4}, Ljava/lang/String;->getBytes(II[BI)V

    .line 40
    .line 41
    .line 42
    add-int/lit8 v9, v1, 0x1

    .line 43
    .line 44
    aput-byte v5, v8, v9

    .line 45
    .line 46
    add-int/lit8 v9, v1, 0x2

    .line 47
    .line 48
    aput-byte v2, v8, v9

    .line 49
    .line 50
    add-int/lit8 v2, v1, 0x3

    .line 51
    .line 52
    aput-byte v5, v8, v2

    .line 53
    .line 54
    add-int/lit8 v1, v1, 0x4

    .line 55
    .line 56
    invoke-virtual {v0, v3, v6, v8, v1}, Ljava/lang/String;->getBytes(II[BI)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 v7, v7, 0x4

    .line 60
    .line 61
    aput-byte v5, v8, v7

    .line 62
    .line 63
    iput-object v8, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->nameWithColonUTF8:[B

    .line 64
    .line 65
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->nameWithColonUTF8:[B

    .line 66
    .line 67
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNameRaw([B)V

    .line 68
    .line 69
    .line 70
    return v4

    .line 71
    :cond_1
    iget-boolean v1, p1, Lcom/alibaba/fastjson2/JSONWriter;->utf16:Z

    .line 72
    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->nameWithColonUTF16:[C

    .line 76
    .line 77
    if-nez v1, :cond_2

    .line 78
    .line 79
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeKey:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    add-int v7, v1, v6

    .line 90
    .line 91
    add-int/lit8 v8, v7, 0x5

    .line 92
    .line 93
    new-array v8, v8, [C

    .line 94
    .line 95
    aput-char v5, v8, v3

    .line 96
    .line 97
    iget-object v9, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeKey:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {v9, v3, v1, v8, v4}, Ljava/lang/String;->getChars(II[CI)V

    .line 100
    .line 101
    .line 102
    add-int/lit8 v9, v1, 0x1

    .line 103
    .line 104
    aput-char v5, v8, v9

    .line 105
    .line 106
    add-int/lit8 v9, v1, 0x2

    .line 107
    .line 108
    aput-char v2, v8, v9

    .line 109
    .line 110
    add-int/lit8 v2, v1, 0x3

    .line 111
    .line 112
    aput-char v5, v8, v2

    .line 113
    .line 114
    add-int/lit8 v1, v1, 0x4

    .line 115
    .line 116
    invoke-virtual {v0, v3, v6, v8, v1}, Ljava/lang/String;->getChars(II[CI)V

    .line 117
    .line 118
    .line 119
    add-int/lit8 v7, v7, 0x4

    .line 120
    .line 121
    aput-char v5, v8, v7

    .line 122
    .line 123
    iput-object v8, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->nameWithColonUTF16:[C

    .line 124
    .line 125
    :cond_2
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->nameWithColonUTF16:[C

    .line 126
    .line 127
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNameRaw([C)V

    .line 128
    .line 129
    .line 130
    return v4

    .line 131
    :cond_3
    iget-boolean v1, p1, Lcom/alibaba/fastjson2/JSONWriter;->jsonb:Z

    .line 132
    .line 133
    if-eqz v1, :cond_5

    .line 134
    .line 135
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeKeyJSONB:[B

    .line 136
    .line 137
    if-nez v0, :cond_4

    .line 138
    .line 139
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeKey:Ljava/lang/String;

    .line 140
    .line 141
    invoke-static {v0}, Lcom/alibaba/fastjson2/JSONB;->toBytes(Ljava/lang/String;)[B

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    iput-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeKeyJSONB:[B

    .line 146
    .line 147
    :cond_4
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeKeyJSONB:[B

    .line 148
    .line 149
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeRaw([B)V

    .line 150
    .line 151
    .line 152
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeNameJSONB:[B

    .line 153
    .line 154
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeRaw([B)V

    .line 155
    .line 156
    .line 157
    return v4

    .line 158
    :cond_5
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->typeKey:Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {p1, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeColon()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    return v4
.end method

.method public writeWithFilter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 43

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    if-nez v9, :cond_0

    .line 8
    .line 9
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-wide v4, v1, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->features:J

    .line 14
    .line 15
    or-long v4, v4, p5

    .line 16
    .line 17
    move-object/from16 v6, p4

    .line 18
    .line 19
    invoke-virtual {v3, v9, v6, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteTypeInfo(Ljava/lang/Object;Ljava/lang/reflect/Type;J)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    iget-boolean v0, v3, Lcom/alibaba/fastjson2/JSONWriter;->jsonb:Z

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->writeClassInfo(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->startObject()V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->startObject()V

    .line 37
    .line 38
    .line 39
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->writeTypeInfo(Lcom/alibaba/fastjson2/JSONWriter;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->startObject()V

    .line 44
    .line 45
    .line 46
    :goto_0
    iget-object v10, v3, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 47
    .line 48
    invoke-virtual {v10}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getFeatures()J

    .line 49
    .line 50
    .line 51
    move-result-wide v4

    .line 52
    or-long v4, v4, p5

    .line 53
    .line 54
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->IgnoreNonFieldGetter:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 55
    .line 56
    iget-wide v7, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 57
    .line 58
    and-long/2addr v4, v7

    .line 59
    const-wide/16 v11, 0x0

    .line 60
    .line 61
    cmp-long v0, v4, v11

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    const/4 v15, 0x1

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    const/4 v15, 0x0

    .line 68
    :goto_1
    invoke-virtual {v10}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getBeforeFilter()Lcom/alibaba/fastjson2/filter/BeforeFilter;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    invoke-virtual {v0, v3, v9}, Lcom/alibaba/fastjson2/filter/BeforeFilter;->writeBefore(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_4
    invoke-virtual {v10}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getPropertyPreFilter()Lcom/alibaba/fastjson2/filter/PropertyPreFilter;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    if-nez v0, :cond_5

    .line 82
    .line 83
    iget-object v0, v1, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->propertyPreFilter:Lcom/alibaba/fastjson2/filter/PropertyPreFilter;

    .line 84
    .line 85
    :cond_5
    move-object v2, v0

    .line 86
    invoke-virtual {v10}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getNameFilter()Lcom/alibaba/fastjson2/filter/NameFilter;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iget-object v4, v1, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->nameFilter:Lcom/alibaba/fastjson2/filter/NameFilter;

    .line 91
    .line 92
    if-nez v0, :cond_6

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_6
    if-eqz v4, :cond_7

    .line 96
    .line 97
    invoke-static {v4, v0}, Lcom/alibaba/fastjson2/filter/NameFilter;->compose(Lcom/alibaba/fastjson2/filter/NameFilter;Lcom/alibaba/fastjson2/filter/NameFilter;)Lcom/alibaba/fastjson2/filter/NameFilter;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    :cond_7
    move-object v4, v0

    .line 102
    :goto_2
    invoke-virtual {v10}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getContextNameFilter()Lcom/alibaba/fastjson2/filter/ContextNameFilter;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-virtual {v10}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getValueFilter()Lcom/alibaba/fastjson2/filter/ValueFilter;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iget-object v7, v1, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->valueFilter:Lcom/alibaba/fastjson2/filter/ValueFilter;

    .line 111
    .line 112
    if-nez v0, :cond_8

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_8
    if-eqz v7, :cond_9

    .line 116
    .line 117
    invoke-static {v7, v0}, Lcom/alibaba/fastjson2/filter/ValueFilter;->compose(Lcom/alibaba/fastjson2/filter/ValueFilter;Lcom/alibaba/fastjson2/filter/ValueFilter;)Lcom/alibaba/fastjson2/filter/ValueFilter;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    :cond_9
    move-object v7, v0

    .line 122
    :goto_3
    invoke-virtual {v10}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getContextValueFilter()Lcom/alibaba/fastjson2/filter/ContextValueFilter;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    invoke-virtual {v10}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getPropertyFilter()Lcom/alibaba/fastjson2/filter/PropertyFilter;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    if-nez v0, :cond_a

    .line 131
    .line 132
    iget-object v0, v1, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->propertyFilter:Lcom/alibaba/fastjson2/filter/PropertyFilter;

    .line 133
    .line 134
    :cond_a
    move-wide/from16 v16, v11

    .line 135
    .line 136
    move-object v11, v0

    .line 137
    invoke-virtual {v10}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getLabelFilter()Lcom/alibaba/fastjson2/filter/LabelFilter;

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    iget-object v0, v1, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->fieldWriters:Ljava/util/List;

    .line 142
    .line 143
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 144
    .line 145
    .line 146
    move-result v13

    .line 147
    const/4 v14, 0x0

    .line 148
    :goto_4
    if-ge v14, v13, :cond_1f

    .line 149
    .line 150
    iget-object v0, v1, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->fieldWriters:Ljava/util/List;

    .line 151
    .line 152
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    check-cast v0, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 157
    .line 158
    iget-object v6, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->field:Ljava/lang/reflect/Field;

    .line 159
    .line 160
    move-object/from16 v21, v6

    .line 161
    .line 162
    if-eqz v15, :cond_b

    .line 163
    .line 164
    iget-object v6, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->method:Ljava/lang/reflect/Method;

    .line 165
    .line 166
    move/from16 v29, v13

    .line 167
    .line 168
    move/from16 v30, v14

    .line 169
    .line 170
    if-eqz v6, :cond_c

    .line 171
    .line 172
    iget-wide v13, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 173
    .line 174
    const-wide/high16 v18, 0x10000000000000L

    .line 175
    .line 176
    and-long v13, v13, v18

    .line 177
    .line 178
    cmp-long v6, v13, v16

    .line 179
    .line 180
    if-nez v6, :cond_c

    .line 181
    .line 182
    :goto_5
    move-object/from16 v31, v2

    .line 183
    .line 184
    :goto_6
    move-object v1, v4

    .line 185
    move-object/from16 v18, v5

    .line 186
    .line 187
    move-object/from16 v20, v7

    .line 188
    .line 189
    move-object/from16 v21, v8

    .line 190
    .line 191
    goto/16 :goto_f

    .line 192
    .line 193
    :cond_b
    move/from16 v29, v13

    .line 194
    .line 195
    move/from16 v30, v14

    .line 196
    .line 197
    :cond_c
    iget-object v6, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 198
    .line 199
    if-eqz v2, :cond_d

    .line 200
    .line 201
    invoke-interface {v2, v3, v9, v6}, Lcom/alibaba/fastjson2/filter/PropertyPreFilter;->process(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/String;)Z

    .line 202
    .line 203
    .line 204
    move-result v13

    .line 205
    if-nez v13, :cond_d

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_d
    if-eqz v12, :cond_e

    .line 209
    .line 210
    iget-object v13, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->label:Ljava/lang/String;

    .line 211
    .line 212
    if-eqz v13, :cond_e

    .line 213
    .line 214
    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    .line 215
    .line 216
    .line 217
    move-result v14

    .line 218
    if-nez v14, :cond_e

    .line 219
    .line 220
    invoke-interface {v12, v13}, Lcom/alibaba/fastjson2/filter/LabelFilter;->apply(Ljava/lang/String;)Z

    .line 221
    .line 222
    .line 223
    move-result v13

    .line 224
    if-nez v13, :cond_e

    .line 225
    .line 226
    goto :goto_5

    .line 227
    :cond_e
    if-nez v4, :cond_f

    .line 228
    .line 229
    if-nez v11, :cond_f

    .line 230
    .line 231
    if-nez v7, :cond_f

    .line 232
    .line 233
    if-nez v8, :cond_f

    .line 234
    .line 235
    if-nez v5, :cond_f

    .line 236
    .line 237
    invoke-virtual {v0, v3, v9}, Lcom/alibaba/fastjson2/writer/FieldWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_f
    :try_start_0
    invoke-virtual {v0, v9}, Lcom/alibaba/fastjson2/writer/FieldWriter;->getFieldValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 245
    if-nez v13, :cond_10

    .line 246
    .line 247
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteNulls()Z

    .line 248
    .line 249
    .line 250
    move-result v14

    .line 251
    if-nez v14, :cond_10

    .line 252
    .line 253
    goto :goto_5

    .line 254
    :cond_10
    if-eqz v4, :cond_11

    .line 255
    .line 256
    invoke-interface {v4, v9, v6, v13}, Lcom/alibaba/fastjson2/filter/NameFilter;->process(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v14

    .line 260
    goto :goto_7

    .line 261
    :cond_11
    move-object v14, v6

    .line 262
    :goto_7
    if-eqz v5, :cond_12

    .line 263
    .line 264
    new-instance v18, Lcom/alibaba/fastjson2/filter/BeanContext;

    .line 265
    .line 266
    move-object/from16 v31, v2

    .line 267
    .line 268
    iget-object v2, v1, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->objectClass:Ljava/lang/Class;

    .line 269
    .line 270
    move-object/from16 v19, v2

    .line 271
    .line 272
    iget-object v2, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->method:Ljava/lang/reflect/Method;

    .line 273
    .line 274
    move-object/from16 v20, v2

    .line 275
    .line 276
    iget-object v2, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 277
    .line 278
    move-object/from16 v22, v2

    .line 279
    .line 280
    iget-object v2, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->label:Ljava/lang/String;

    .line 281
    .line 282
    move-object/from16 v23, v2

    .line 283
    .line 284
    iget-object v2, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClass:Ljava/lang/Class;

    .line 285
    .line 286
    move-object/from16 v24, v2

    .line 287
    .line 288
    iget-object v2, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldType:Ljava/lang/reflect/Type;

    .line 289
    .line 290
    move-object/from16 v25, v2

    .line 291
    .line 292
    iget-wide v2, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 293
    .line 294
    move-wide/from16 v26, v2

    .line 295
    .line 296
    iget-object v2, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->format:Ljava/lang/String;

    .line 297
    .line 298
    move-object/from16 v28, v2

    .line 299
    .line 300
    invoke-direct/range {v18 .. v28}, Lcom/alibaba/fastjson2/filter/BeanContext;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/reflect/Type;JLjava/lang/String;)V

    .line 301
    .line 302
    .line 303
    move-object/from16 v2, v18

    .line 304
    .line 305
    invoke-interface {v5, v2, v9, v14, v13}, Lcom/alibaba/fastjson2/filter/ContextNameFilter;->process(Lcom/alibaba/fastjson2/filter/BeanContext;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v14

    .line 309
    goto :goto_8

    .line 310
    :cond_12
    move-object/from16 v31, v2

    .line 311
    .line 312
    const/16 v18, 0x0

    .line 313
    .line 314
    :goto_8
    if-eqz v11, :cond_13

    .line 315
    .line 316
    invoke-interface {v11, v9, v6, v13}, Lcom/alibaba/fastjson2/filter/PropertyFilter;->apply(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v2

    .line 320
    if-nez v2, :cond_13

    .line 321
    .line 322
    move-object/from16 v3, p1

    .line 323
    .line 324
    goto/16 :goto_6

    .line 325
    .line 326
    :cond_13
    if-eqz v14, :cond_14

    .line 327
    .line 328
    if-eq v14, v6, :cond_14

    .line 329
    .line 330
    const/4 v2, 0x1

    .line 331
    goto :goto_9

    .line 332
    :cond_14
    const/4 v2, 0x0

    .line 333
    :goto_9
    if-eqz v7, :cond_15

    .line 334
    .line 335
    invoke-interface {v7, v9, v6, v13}, Lcom/alibaba/fastjson2/filter/ValueFilter;->apply(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    goto :goto_a

    .line 340
    :cond_15
    move-object v3, v13

    .line 341
    :goto_a
    if-eqz v8, :cond_18

    .line 342
    .line 343
    if-nez v18, :cond_17

    .line 344
    .line 345
    if-nez v21, :cond_16

    .line 346
    .line 347
    iget-object v6, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->method:Ljava/lang/reflect/Method;

    .line 348
    .line 349
    if-eqz v6, :cond_16

    .line 350
    .line 351
    iget-object v6, v1, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->objectClass:Ljava/lang/Class;

    .line 352
    .line 353
    move/from16 v19, v2

    .line 354
    .line 355
    iget-object v2, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 356
    .line 357
    invoke-static {v6, v2}, Lcom/alibaba/fastjson2/util/BeanUtils;->getDeclaredField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 358
    .line 359
    .line 360
    move-result-object v6

    .line 361
    move-object/from16 v35, v6

    .line 362
    .line 363
    goto :goto_b

    .line 364
    :cond_16
    move/from16 v19, v2

    .line 365
    .line 366
    move-object/from16 v35, v21

    .line 367
    .line 368
    :goto_b
    new-instance v32, Lcom/alibaba/fastjson2/filter/BeanContext;

    .line 369
    .line 370
    iget-object v2, v1, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->objectClass:Ljava/lang/Class;

    .line 371
    .line 372
    iget-object v6, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->method:Ljava/lang/reflect/Method;

    .line 373
    .line 374
    iget-object v1, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 375
    .line 376
    move-object/from16 v36, v1

    .line 377
    .line 378
    iget-object v1, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->label:Ljava/lang/String;

    .line 379
    .line 380
    move-object/from16 v37, v1

    .line 381
    .line 382
    iget-object v1, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClass:Ljava/lang/Class;

    .line 383
    .line 384
    move-object/from16 v38, v1

    .line 385
    .line 386
    iget-object v1, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldType:Ljava/lang/reflect/Type;

    .line 387
    .line 388
    move-object/from16 v39, v1

    .line 389
    .line 390
    move-object/from16 v33, v2

    .line 391
    .line 392
    iget-wide v1, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 393
    .line 394
    move-wide/from16 v40, v1

    .line 395
    .line 396
    iget-object v1, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->format:Ljava/lang/String;

    .line 397
    .line 398
    move-object/from16 v42, v1

    .line 399
    .line 400
    move-object/from16 v34, v6

    .line 401
    .line 402
    invoke-direct/range {v32 .. v42}, Lcom/alibaba/fastjson2/filter/BeanContext;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/reflect/Type;JLjava/lang/String;)V

    .line 403
    .line 404
    .line 405
    move-object/from16 v1, v32

    .line 406
    .line 407
    goto :goto_c

    .line 408
    :cond_17
    move/from16 v19, v2

    .line 409
    .line 410
    move-object/from16 v1, v18

    .line 411
    .line 412
    :goto_c
    invoke-interface {v8, v1, v9, v14, v3}, Lcom/alibaba/fastjson2/filter/ContextValueFilter;->process(Lcom/alibaba/fastjson2/filter/BeanContext;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    goto :goto_d

    .line 417
    :cond_18
    move/from16 v19, v2

    .line 418
    .line 419
    :goto_d
    if-eq v3, v13, :cond_1b

    .line 420
    .line 421
    if-eqz v19, :cond_19

    .line 422
    .line 423
    move-object/from16 v1, p1

    .line 424
    .line 425
    invoke-virtual {v1, v14}, Lcom/alibaba/fastjson2/JSONWriter;->writeName(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeColon()V

    .line 429
    .line 430
    .line 431
    goto :goto_e

    .line 432
    :cond_19
    move-object/from16 v1, p1

    .line 433
    .line 434
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 435
    .line 436
    .line 437
    :goto_e
    if-nez v3, :cond_1a

    .line 438
    .line 439
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 440
    .line 441
    .line 442
    move-object v3, v1

    .line 443
    goto/16 :goto_6

    .line 444
    .line 445
    :cond_1a
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    invoke-virtual {v0, v1, v2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->getObjectWriter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    move-object v6, v3

    .line 454
    move-object v3, v1

    .line 455
    move-object v1, v4

    .line 456
    move-object v4, v6

    .line 457
    move-object/from16 v6, p4

    .line 458
    .line 459
    move-object/from16 v18, v5

    .line 460
    .line 461
    move-object/from16 v20, v7

    .line 462
    .line 463
    move-object/from16 v21, v8

    .line 464
    .line 465
    move-object/from16 v5, p3

    .line 466
    .line 467
    move-wide/from16 v7, p5

    .line 468
    .line 469
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 470
    .line 471
    .line 472
    goto :goto_f

    .line 473
    :cond_1b
    move-object/from16 v3, p1

    .line 474
    .line 475
    move-object v1, v4

    .line 476
    move-object/from16 v18, v5

    .line 477
    .line 478
    move-object/from16 v20, v7

    .line 479
    .line 480
    move-object/from16 v21, v8

    .line 481
    .line 482
    if-nez v19, :cond_1c

    .line 483
    .line 484
    invoke-virtual {v0, v3, v9}, Lcom/alibaba/fastjson2/writer/FieldWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    goto :goto_f

    .line 488
    :cond_1c
    invoke-virtual {v3, v14}, Lcom/alibaba/fastjson2/JSONWriter;->writeName(Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeColon()V

    .line 492
    .line 493
    .line 494
    if-nez v13, :cond_1d

    .line 495
    .line 496
    iget-object v2, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClass:Ljava/lang/Class;

    .line 497
    .line 498
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->getObjectWriter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    const/4 v4, 0x0

    .line 503
    move-object/from16 v5, p3

    .line 504
    .line 505
    move-object/from16 v6, p4

    .line 506
    .line 507
    move-wide/from16 v7, p5

    .line 508
    .line 509
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 510
    .line 511
    .line 512
    goto :goto_f

    .line 513
    :cond_1d
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    invoke-virtual {v0, v3, v2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->getObjectWriter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    move-object/from16 v5, p3

    .line 522
    .line 523
    move-object/from16 v6, p4

    .line 524
    .line 525
    move-wide/from16 v7, p5

    .line 526
    .line 527
    move-object v4, v13

    .line 528
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 529
    .line 530
    .line 531
    goto :goto_f

    .line 532
    :catchall_0
    move-exception v0

    .line 533
    move-object/from16 v31, v2

    .line 534
    .line 535
    move-object v1, v4

    .line 536
    move-object/from16 v18, v5

    .line 537
    .line 538
    move-object/from16 v20, v7

    .line 539
    .line 540
    move-object/from16 v21, v8

    .line 541
    .line 542
    invoke-virtual {v10}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getFeatures()J

    .line 543
    .line 544
    .line 545
    move-result-wide v4

    .line 546
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->IgnoreErrorGetter:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 547
    .line 548
    iget-wide v6, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 549
    .line 550
    and-long/2addr v4, v6

    .line 551
    cmp-long v2, v4, v16

    .line 552
    .line 553
    if-eqz v2, :cond_1e

    .line 554
    .line 555
    :goto_f
    add-int/lit8 v14, v30, 0x1

    .line 556
    .line 557
    move-object/from16 v6, p4

    .line 558
    .line 559
    move-object v4, v1

    .line 560
    move-object/from16 v5, v18

    .line 561
    .line 562
    move-object/from16 v7, v20

    .line 563
    .line 564
    move-object/from16 v8, v21

    .line 565
    .line 566
    move/from16 v13, v29

    .line 567
    .line 568
    move-object/from16 v2, v31

    .line 569
    .line 570
    move-object/from16 v1, p0

    .line 571
    .line 572
    goto/16 :goto_4

    .line 573
    .line 574
    :cond_1e
    throw v0

    .line 575
    :cond_1f
    invoke-virtual {v10}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getAfterFilter()Lcom/alibaba/fastjson2/filter/AfterFilter;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    if-eqz v0, :cond_20

    .line 580
    .line 581
    invoke-virtual {v0, v3, v9}, Lcom/alibaba/fastjson2/filter/AfterFilter;->writeAfter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)V

    .line 582
    .line 583
    .line 584
    :cond_20
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->endObject()V

    .line 585
    .line 586
    .line 587
    return-void
.end method
