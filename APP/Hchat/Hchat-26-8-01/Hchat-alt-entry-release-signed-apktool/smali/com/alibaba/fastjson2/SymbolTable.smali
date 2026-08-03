.class public final Lcom/alibaba/fastjson2/SymbolTable;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field private final hashCode64:J

.field private final hashCodes:[J

.field private final hashCodesOrigin:[J

.field private final mapping:[S

.field private final names:[Ljava/lang/String;


# direct methods
.method public varargs constructor <init>([Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 136
    invoke-static {p1}, Lcom/alibaba/fastjson2/SymbolTable;->classNames([Ljava/lang/Class;)[Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/SymbolTable;-><init>([Ljava/lang/String;)V

    return-void
.end method

.method public varargs constructor <init>([Ljava/lang/String;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/TreeSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    .line 7
    .line 8
    .line 9
    array-length v1, p1

    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    if-ge v3, v1, :cond_0

    .line 13
    .line 14
    aget-object v4, p1, v3

    .line 15
    .line 16
    invoke-virtual {v0, v4}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    add-int/lit8 v3, v3, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v0}, Ljava/util/TreeSet;->size()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    new-array p1, p1, [Ljava/lang/String;

    .line 27
    .line 28
    iput-object p1, p0, Lcom/alibaba/fastjson2/SymbolTable;->names:[Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    move v0, v2

    .line 35
    :goto_1
    iget-object v1, p0, Lcom/alibaba/fastjson2/SymbolTable;->names:[Ljava/lang/String;

    .line 36
    .line 37
    array-length v3, v1

    .line 38
    if-ge v0, v3, :cond_2

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    iget-object v1, p0, Lcom/alibaba/fastjson2/SymbolTable;->names:[Ljava/lang/String;

    .line 47
    .line 48
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Ljava/lang/String;

    .line 53
    .line 54
    aput-object v3, v1, v0

    .line 55
    .line 56
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    array-length p1, v1

    .line 60
    new-array v0, p1, [J

    .line 61
    .line 62
    move v1, v2

    .line 63
    :goto_2
    iget-object v3, p0, Lcom/alibaba/fastjson2/SymbolTable;->names:[Ljava/lang/String;

    .line 64
    .line 65
    array-length v4, v3

    .line 66
    if-ge v1, v4, :cond_3

    .line 67
    .line 68
    aget-object v3, v3, v1

    .line 69
    .line 70
    invoke-static {v3}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 71
    .line 72
    .line 73
    move-result-wide v3

    .line 74
    aput-wide v3, v0, v1

    .line 75
    .line 76
    add-int/lit8 v1, v1, 0x1

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    iput-object v0, p0, Lcom/alibaba/fastjson2/SymbolTable;->hashCodesOrigin:[J

    .line 80
    .line 81
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iput-object v1, p0, Lcom/alibaba/fastjson2/SymbolTable;->hashCodes:[J

    .line 86
    .line 87
    invoke-static {v1}, Ljava/util/Arrays;->sort([J)V

    .line 88
    .line 89
    .line 90
    array-length v1, v1

    .line 91
    new-array v1, v1, [S

    .line 92
    .line 93
    iput-object v1, p0, Lcom/alibaba/fastjson2/SymbolTable;->mapping:[S

    .line 94
    .line 95
    move v1, v2

    .line 96
    :goto_3
    if-ge v1, p1, :cond_4

    .line 97
    .line 98
    aget-wide v3, v0, v1

    .line 99
    .line 100
    iget-object v5, p0, Lcom/alibaba/fastjson2/SymbolTable;->hashCodes:[J

    .line 101
    .line 102
    invoke-static {v5, v3, v4}, Ljava/util/Arrays;->binarySearch([JJ)I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    iget-object v4, p0, Lcom/alibaba/fastjson2/SymbolTable;->mapping:[S

    .line 107
    .line 108
    int-to-short v5, v1

    .line 109
    aput-short v5, v4, v3

    .line 110
    .line 111
    add-int/lit8 v1, v1, 0x1

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    const-wide v3, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    :goto_4
    if-ge v2, p1, :cond_5

    .line 120
    .line 121
    aget-wide v5, v0, v2

    .line 122
    .line 123
    xor-long/2addr v3, v5

    .line 124
    const-wide v5, 0x100000001b3L

    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    mul-long/2addr v3, v5

    .line 130
    add-int/lit8 v2, v2, 0x1

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_5
    iput-wide v3, p0, Lcom/alibaba/fastjson2/SymbolTable;->hashCode64:J

    .line 134
    .line 135
    return-void
.end method

.method private static varargs classNames([Ljava/lang/Class;)[Ljava/lang/String;
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    new-array v0, v0, [Ljava/lang/String;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    array-length v2, p0

    .line 6
    if-ge v1, v2, :cond_0

    .line 7
    .line 8
    aget-object v2, p0, v1

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    aput-object v2, v0, v1

    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-object v0
.end method


# virtual methods
.method public getHashCode(I)J
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/SymbolTable;->hashCodesOrigin:[J

    .line 2
    .line 3
    add-int/lit8 p1, p1, -0x1

    .line 4
    .line 5
    aget-wide v1, v0, p1

    .line 6
    .line 7
    return-wide v1
.end method

.method public getName(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/SymbolTable;->names:[Ljava/lang/String;

    .line 2
    .line 3
    add-int/lit8 p1, p1, -0x1

    .line 4
    .line 5
    aget-object p1, v0, p1

    .line 6
    .line 7
    return-object p1
.end method

.method public getNameByHashCode(J)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/SymbolTable;->hashCodes:[J

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
    iget-object p2, p0, Lcom/alibaba/fastjson2/SymbolTable;->mapping:[S

    .line 12
    .line 13
    aget-short p1, p2, p1

    .line 14
    .line 15
    iget-object p2, p0, Lcom/alibaba/fastjson2/SymbolTable;->names:[Ljava/lang/String;

    .line 16
    .line 17
    aget-object p1, p2, p1

    .line 18
    .line 19
    return-object p1
.end method

.method public getOrdinal(Ljava/lang/String;)I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/SymbolTable;->hashCodes:[J

    .line 2
    .line 3
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-static {v0, v1, v2}, Ljava/util/Arrays;->binarySearch([JJ)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-gez p1, :cond_0

    .line 12
    .line 13
    const/4 p1, -0x1

    .line 14
    return p1

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/SymbolTable;->mapping:[S

    .line 16
    .line 17
    aget-short p1, v0, p1

    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    return p1
.end method

.method public getOrdinalByHashCode(J)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/SymbolTable;->hashCodes:[J

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
    const/4 p1, -0x1

    .line 10
    return p1

    .line 11
    :cond_0
    iget-object p2, p0, Lcom/alibaba/fastjson2/SymbolTable;->mapping:[S

    .line 12
    .line 13
    aget-short p1, p2, p1

    .line 14
    .line 15
    add-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    return p1
.end method

.method public hashCode64()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/SymbolTable;->hashCode64:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/SymbolTable;->names:[Ljava/lang/String;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    return v0
.end method
