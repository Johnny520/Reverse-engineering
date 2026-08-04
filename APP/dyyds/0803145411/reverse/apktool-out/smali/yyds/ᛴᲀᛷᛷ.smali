.class public final Lyyds/ᛴᲀᛷᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final ᛷᛸᲇᛶ:Lyyds/ᛷᲇᲁᛴ;


# instance fields
.field public ᛱᛳᲇ:J

.field public ᛱᲈᲁ:Z

.field public final ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

.field public final ᛲᛳᛴᛸ:Ljava/util/LinkedHashSet;

.field public final ᛲᛳᛶᲁ:Lyyds/ᛱᛴᛳᛱ;

.field public final ᛲᛴᛳᛲ:Ljava/lang/String;

.field public final ᛲᛶᛱᲈ:Lyyds/ᛳᛷᲀᛴ;

.field public ᛳᛸᛴᛶ:Lyyds/ᛷᲇᲁᛴ;

.field public ᛳᲁᲁᲇ:J

.field public final ᛵᛶᛲᲀ:Lyyds/ᛷᛷᲁᛲ;

.field public final ᛵᲀᛵᛸ:Lyyds/ᲀᛶᲁ;

.field public ᛵᲀᲈᛴ:J

.field public ᛶᛳᛶᛵ:J

.field public ᛶᛷᛲᲁ:I

.field public ᛶᛸᲀᲁ:J

.field public final ᛶᲈᛴᲈ:Lyyds/ᲁᛳᲀᛶ;

.field public final ᛷᛲᲈᛱ:Lyyds/ᛱᛷᛱᛳ;

.field public final ᛷᛵᲇᲀ:Lyyds/ᛱᛷᛱᛳ;

.field public final ᛷᲈᲈᲁ:Lyyds/ᛱᛷᛱᛳ;

.field public final ᲀᛲᛲᲇ:Lyyds/ᛷᲇᲁᛴ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᲁᛱᲀᛳ;

.field public ᲇᛱᛲ:J

.field public ᲇᲇᲇᛱ:I

.field public final ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;

.field public final ᲈᲀᛲᲀ:Lyyds/ᛲᛱᛷᲀ;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lyyds/ᛷᲇᲁᛴ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᛷᲇᲁᛴ;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    const v2, 0xffff

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lyyds/ᛷᲇᲁᛴ;->ᛵᛸᛸᛷ(II)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x5

    .line 14
    const/16 v2, 0x4000

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, Lyyds/ᛷᲇᲁᛴ;->ᛵᛸᛸᛷ(II)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lyyds/ᛴᲀᛷᛷ;->ᛷᛸᲇᛶ:Lyyds/ᛷᲇᲁᛴ;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Lyyds/ᛷᲀᲇᲈ;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lyyds/ᛷᲀᲇᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lyyds/ᲁᛱᲀᛳ;

    .line 7
    .line 8
    iput-object v0, p0, Lyyds/ᛴᲀᛷᛷ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛱᲀᛳ;

    .line 9
    .line 10
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lyyds/ᛴᲀᛷᛷ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    iget-object v0, p1, Lyyds/ᛷᲀᲇᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/lang/String;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v0, v1

    .line 26
    :goto_0
    iput-object v0, p0, Lyyds/ᛴᲀᛷᛷ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 27
    .line 28
    const/4 v0, 0x3

    .line 29
    iput v0, p0, Lyyds/ᛴᲀᛷᛷ;->ᛶᛷᛲᲁ:I

    .line 30
    .line 31
    iget-object v0, p1, Lyyds/ᛷᲀᲇᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lyyds/ᛱᛴᛳᛱ;

    .line 34
    .line 35
    iput-object v0, p0, Lyyds/ᛴᲀᛷᛷ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛴᛳᛱ;

    .line 36
    .line 37
    invoke-virtual {v0}, Lyyds/ᛱᛴᛳᛱ;->ᲇᲈᛵᛷ()Lyyds/ᛱᛷᛱᛳ;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iput-object v2, p0, Lyyds/ᛴᲀᛷᛷ;->ᛷᲈᲈᲁ:Lyyds/ᛱᛷᛱᛳ;

    .line 42
    .line 43
    invoke-virtual {v0}, Lyyds/ᛱᛴᛳᛱ;->ᲇᲈᛵᛷ()Lyyds/ᛱᛷᛱᛳ;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iput-object v2, p0, Lyyds/ᛴᲀᛷᛷ;->ᛷᛲᲈᛱ:Lyyds/ᛱᛷᛱᛳ;

    .line 48
    .line 49
    invoke-virtual {v0}, Lyyds/ᛱᛴᛳᛱ;->ᲇᲈᛵᛷ()Lyyds/ᛱᛷᛱᛳ;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Lyyds/ᛴᲀᛷᛷ;->ᛷᛵᲇᲀ:Lyyds/ᛱᛷᛱᛳ;

    .line 54
    .line 55
    sget-object v0, Lyyds/ᛲᲁᲈ;->ᛶᛷᛲᲁ:Lyyds/ᛲᲁᲈ;

    .line 56
    .line 57
    iput-object v0, p0, Lyyds/ᛴᲀᛷᛷ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 58
    .line 59
    iget-object v0, p1, Lyyds/ᛷᲀᲇᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Lyyds/ᛷᛷᲁᛲ;

    .line 62
    .line 63
    iput-object v0, p0, Lyyds/ᛴᲀᛷᛷ;->ᛵᛶᛲᲀ:Lyyds/ᛷᛷᲁᛲ;

    .line 64
    .line 65
    new-instance v0, Lyyds/ᛷᲇᲁᛴ;

    .line 66
    .line 67
    invoke-direct {v0}, Lyyds/ᛷᲇᲁᛴ;-><init>()V

    .line 68
    .line 69
    .line 70
    const/4 v2, 0x4

    .line 71
    const/high16 v3, 0x1000000

    .line 72
    .line 73
    invoke-virtual {v0, v2, v3}, Lyyds/ᛷᲇᲁᛴ;->ᛵᛸᛸᛷ(II)V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, Lyyds/ᛴᲀᛷᛷ;->ᲀᛲᛲᲇ:Lyyds/ᛷᲇᲁᛴ;

    .line 77
    .line 78
    sget-object v0, Lyyds/ᛴᲀᛷᛷ;->ᛷᛸᲇᛶ:Lyyds/ᛷᲇᲁᛴ;

    .line 79
    .line 80
    iput-object v0, p0, Lyyds/ᛴᲀᛷᛷ;->ᛳᛸᛴᛶ:Lyyds/ᛷᲇᲁᛴ;

    .line 81
    .line 82
    new-instance v2, Lyyds/ᲁᛳᲀᛶ;

    .line 83
    .line 84
    const/4 v3, 0x0

    .line 85
    invoke-direct {v2, v3}, Lyyds/ᲁᛳᲀᛶ;-><init>(I)V

    .line 86
    .line 87
    .line 88
    iput-object v2, p0, Lyyds/ᛴᲀᛷᛷ;->ᛶᲈᛴᲈ:Lyyds/ᲁᛳᲀᛶ;

    .line 89
    .line 90
    invoke-virtual {v0}, Lyyds/ᛷᲇᲁᛴ;->ᛲᲈᲁ()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    int-to-long v2, v0

    .line 95
    iput-wide v2, p0, Lyyds/ᛴᲀᛷᛷ;->ᛵᲀᲈᛴ:J

    .line 96
    .line 97
    iget-object p1, p1, Lyyds/ᛷᲀᲇᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p1, Lyyds/ᛳᛷᲀᛴ;

    .line 100
    .line 101
    if-eqz p1, :cond_1

    .line 102
    .line 103
    move-object v1, p1

    .line 104
    :cond_1
    iput-object v1, p0, Lyyds/ᛴᲀᛷᛷ;->ᛲᛶᛱᲈ:Lyyds/ᛳᛷᲀᛴ;

    .line 105
    .line 106
    new-instance p1, Lyyds/ᛲᛱᛷᲀ;

    .line 107
    .line 108
    iget-object v0, v1, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Lyyds/ᲈᲇᛲᛴ;

    .line 111
    .line 112
    invoke-direct {p1, v0}, Lyyds/ᛲᛱᛷᲀ;-><init>(Lyyds/ᲈᲇᛲᛴ;)V

    .line 113
    .line 114
    .line 115
    iput-object p1, p0, Lyyds/ᛴᲀᛷᛷ;->ᲈᲀᛲᲀ:Lyyds/ᛲᛱᛷᲀ;

    .line 116
    .line 117
    new-instance p1, Lyyds/ᲀᛶᲁ;

    .line 118
    .line 119
    new-instance v0, Lyyds/ᲁᛲᲈᛳ;

    .line 120
    .line 121
    iget-object v1, v1, Lyyds/ᛳᛷᲀᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v1, Lyyds/ᲀᲀᛵᲈ;

    .line 124
    .line 125
    invoke-direct {v0, v1}, Lyyds/ᲁᛲᲈᛳ;-><init>(Lyyds/ᲀᲀᛵᲈ;)V

    .line 126
    .line 127
    .line 128
    invoke-direct {p1, p0, v0}, Lyyds/ᲀᛶᲁ;-><init>(Lyyds/ᛴᲀᛷᛷ;Lyyds/ᲁᛲᲈᛳ;)V

    .line 129
    .line 130
    .line 131
    iput-object p1, p0, Lyyds/ᛴᲀᛷᛷ;->ᛵᲀᛵᛸ:Lyyds/ᲀᛶᲁ;

    .line 132
    .line 133
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 134
    .line 135
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 136
    .line 137
    .line 138
    iput-object p1, p0, Lyyds/ᛴᲀᛷᛷ;->ᛲᛳᛴᛸ:Ljava/util/LinkedHashSet;

    .line 139
    .line 140
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {p0, v2, v0, v1}, Lyyds/ᛴᲀᛷᛷ;->ᛲᲈᲁ(IILjava/io/IOException;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final flush()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛴᲀᛷᛷ;->ᲈᲀᛲᲀ:Lyyds/ᛲᛱᛷᲀ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛲᛱᛷᲀ;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛲᲈᲁ(IILjava/io/IOException;)V
    .locals 3

    .line 1
    sget-object v0, Lyyds/ᛴᛲᛲᲇ;->ᛲᲈᲁ:Ljava/util/TimeZone;

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0, p1}, Lyyds/ᛴᲀᛷᛷ;->ᛷᲈᲈᲁ(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    :catch_0
    monitor-enter p0

    .line 7
    :try_start_1
    iget-object p1, p0, Lyyds/ᛴᲀᛷᛷ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v0, 0x0

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Lyyds/ᛴᲀᛷᛷ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-array v1, v0, [Lyyds/ᲇᲀᲁᛵ;

    .line 23
    .line 24
    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object v1, p0, Lyyds/ᛴᲀᛷᛷ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_2

    .line 36
    :cond_0
    const/4 p1, 0x0

    .line 37
    :goto_0
    monitor-exit p0

    .line 38
    check-cast p1, [Lyyds/ᲇᲀᲁᛵ;

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    array-length v1, p1

    .line 43
    :goto_1
    if-ge v0, v1, :cond_1

    .line 44
    .line 45
    aget-object v2, p1, v0

    .line 46
    .line 47
    :try_start_2
    invoke-virtual {v2, p2, p3}, Lyyds/ᲇᲀᲁᛵ;->ᲇᲈᛵᛷ(ILjava/io/IOException;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 48
    .line 49
    .line 50
    :catch_1
    add-int/lit8 v0, v0, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    :try_start_3
    iget-object p1, p0, Lyyds/ᛴᲀᛷᛷ;->ᲈᲀᛲᲀ:Lyyds/ᛲᛱᛷᲀ;

    .line 54
    .line 55
    invoke-virtual {p1}, Lyyds/ᛲᛱᛷᲀ;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 56
    .line 57
    .line 58
    :catch_2
    :try_start_4
    iget-object p1, p0, Lyyds/ᛴᲀᛷᛷ;->ᛲᛶᛱᲈ:Lyyds/ᛳᛷᲀᛴ;

    .line 59
    .line 60
    iget-object p1, p1, Lyyds/ᛳᛷᲀᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, Lyyds/ᛲᛲᲇᲈ;

    .line 63
    .line 64
    iget-object p1, p1, Lyyds/ᛲᛲᲇᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Ljava/net/Socket;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 69
    .line 70
    .line 71
    :catch_3
    iget-object p1, p0, Lyyds/ᛴᲀᛷᛷ;->ᛷᲈᲈᲁ:Lyyds/ᛱᛷᛱᛳ;

    .line 72
    .line 73
    invoke-virtual {p1}, Lyyds/ᛱᛷᛱᛳ;->ᛲᛴᛳᛲ()V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lyyds/ᛴᲀᛷᛷ;->ᛷᛲᲈᛱ:Lyyds/ᛱᛷᛱᛳ;

    .line 77
    .line 78
    invoke-virtual {p1}, Lyyds/ᛱᛷᛱᛳ;->ᛲᛴᛳᛲ()V

    .line 79
    .line 80
    .line 81
    iget-object p0, p0, Lyyds/ᛴᲀᛷᛷ;->ᛷᛵᲇᲀ:Lyyds/ᛱᛷᛱᛳ;

    .line 82
    .line 83
    invoke-virtual {p0}, Lyyds/ᛱᛷᛱᛳ;->ᛲᛴᛳᛲ()V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :goto_2
    monitor-exit p0

    .line 88
    throw p1
.end method

.method public final ᛳᛸᛴᛶ(IJ)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lyyds/ᛴᲀᛷᛷ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const/16 v1, 0x5b

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, "] windowUpdate"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Lyyds/ᲀᛵᛷᛸ;

    .line 29
    .line 30
    invoke-direct {v1, p0, p1, p2, p3}, Lyyds/ᲀᛵᛷᛸ;-><init>(Lyyds/ᛴᲀᛷᛷ;IJ)V

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Lyyds/ᛴᲀᛷᛷ;->ᛷᲈᲈᲁ:Lyyds/ᛱᛷᛱᛳ;

    .line 34
    .line 35
    invoke-static {p0, v0, v1}, Lyyds/ᛱᛷᛱᛳ;->ᛵᛸᛸᛷ(Lyyds/ᛱᛷᛱᛳ;Ljava/lang/String;Lyyds/ᲁᛶᲁᲀ;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final ᛳᲁᲁᲇ(J)V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lyyds/ᛴᲀᛷᛷ;->ᛶᲈᛴᲈ:Lyyds/ᲁᛳᲀᛶ;

    .line 3
    .line 4
    const-wide/16 v3, 0x0

    .line 5
    .line 6
    const/4 v5, 0x2

    .line 7
    move-wide v1, p1

    .line 8
    invoke-static/range {v0 .. v5}, Lyyds/ᲁᛳᲀᛶ;->ᲀᛲᛳᲀ(Lyyds/ᲁᛳᲀᛶ;JJI)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lyyds/ᛴᲀᛷᛷ;->ᛶᲈᛴᲈ:Lyyds/ᲁᛳᲀᛶ;

    .line 12
    .line 13
    invoke-virtual {p1}, Lyyds/ᲁᛳᲀᛶ;->ᛵᛸᛸᛷ()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    iget-object p1, p0, Lyyds/ᛴᲀᛷᛷ;->ᲀᛲᛲᲇ:Lyyds/ᛷᲇᲁᛴ;

    .line 18
    .line 19
    invoke-virtual {p1}, Lyyds/ᛷᲇᲁᛴ;->ᛲᲈᲁ()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    div-int/lit8 p1, p1, 0x2

    .line 24
    .line 25
    int-to-long p1, p1

    .line 26
    cmp-long p1, v3, p1

    .line 27
    .line 28
    if-ltz p1, :cond_0

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    invoke-virtual {p0, p1, v3, v4}, Lyyds/ᛴᲀᛷᛷ;->ᛳᛸᛴᛶ(IJ)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lyyds/ᛴᲀᛷᛷ;->ᛶᲈᛴᲈ:Lyyds/ᲁᛳᲀᛶ;

    .line 35
    .line 36
    const-wide/16 v1, 0x0

    .line 37
    .line 38
    const/4 v5, 0x1

    .line 39
    invoke-static/range {v0 .. v5}, Lyyds/ᲁᛳᲀᛶ;->ᲀᛲᛳᲀ(Lyyds/ᲁᛳᲀᛶ;JJI)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    move-object p1, v0

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    :goto_0
    iget-object p1, p0, Lyyds/ᛴᲀᛷᛷ;->ᛵᛶᛲᲀ:Lyyds/ᛷᛷᲁᛲ;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    monitor-exit p0

    .line 52
    return-void

    .line 53
    :goto_1
    monitor-exit p0

    .line 54
    throw p1
.end method

.method public final ᛵᛶᛲᲀ(II)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lyyds/ᛴᲀᛷᛷ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const/16 v1, 0x5b

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, "] writeSynReset"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Lyyds/ᲁᛲᲈᛷ;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-direct {v1, p0, p1, p2, v2}, Lyyds/ᲁᛲᲈᛷ;-><init>(Lyyds/ᛴᲀᛷᛷ;III)V

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lyyds/ᛴᲀᛷᛷ;->ᛷᲈᲈᲁ:Lyyds/ᛱᛷᛱᛳ;

    .line 35
    .line 36
    invoke-static {p0, v0, v1}, Lyyds/ᛱᛷᛱᛳ;->ᛵᛸᛸᛷ(Lyyds/ᛱᛷᛱᛳ;Ljava/lang/String;Lyyds/ᲁᛶᲁᲀ;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final ᛶᛷᛲᲁ(I)Lyyds/ᲇᲀᲁᛵ;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lyyds/ᛴᲀᛷᛷ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;

    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lyyds/ᲇᲀᲁᛵ;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-object p1

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    monitor-exit p0

    .line 21
    throw p1
.end method

.method public final ᛷᲈᲈᲁ(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛴᲀᛷᛷ;->ᲈᲀᛲᲀ:Lyyds/ᛲᛱᛷᲀ;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :try_start_1
    iget-boolean v1, p0, Lyyds/ᛴᲀᛷᛷ;->ᛱᲈᲁ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 10
    monitor-exit v0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v1, 0x1

    .line 15
    :try_start_3
    iput-boolean v1, p0, Lyyds/ᛴᲀᛷᛷ;->ᛱᲈᲁ:Z

    .line 16
    .line 17
    iget v1, p0, Lyyds/ᛴᲀᛷᛷ;->ᲇᲇᲇᛱ:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 18
    .line 19
    :try_start_4
    monitor-exit p0

    .line 20
    iget-object p0, p0, Lyyds/ᛴᲀᛷᛷ;->ᲈᲀᛲᲀ:Lyyds/ᛲᛱᛷᲀ;

    .line 21
    .line 22
    sget-object v2, Lyyds/ᛶᲁᛵᛲ;->ᛲᲈᲁ:[B

    .line 23
    .line 24
    invoke-virtual {p0, v2, v1, p1}, Lyyds/ᛲᛱᛷᲀ;->ᛷᲈᲈᲁ([BII)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 25
    .line 26
    .line 27
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :catchall_1
    move-exception p1

    .line 30
    :try_start_5
    monitor-exit p0

    .line 31
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 32
    :goto_0
    monitor-exit v0

    .line 33
    throw p0
.end method

.method public final ᲇᛱᛲ(IZLyyds/ᛷᛲᲈᛲ;J)V
    .locals 8

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p4, v0

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᛴᲀᛷᛷ;->ᲈᲀᛲᲀ:Lyyds/ᛲᛱᛷᲀ;

    .line 9
    .line 10
    invoke-virtual {p0, p2, p1, p3, v3}, Lyyds/ᛲᛱᛷᲀ;->ᲇᲇᲇᛱ(ZILyyds/ᛷᛲᲈᛲ;I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    :goto_0
    cmp-long v2, p4, v0

    .line 15
    .line 16
    if-lez v2, :cond_4

    .line 17
    .line 18
    monitor-enter p0

    .line 19
    :goto_1
    :try_start_0
    iget-wide v4, p0, Lyyds/ᛴᲀᛷᛷ;->ᛶᛸᲀᲁ:J

    .line 20
    .line 21
    iget-wide v6, p0, Lyyds/ᛴᲀᛷᛷ;->ᛵᲀᲈᛴ:J

    .line 22
    .line 23
    cmp-long v2, v4, v6

    .line 24
    .line 25
    if-ltz v2, :cond_2

    .line 26
    .line 27
    iget-object v2, p0, Lyyds/ᛴᲀᛷᛷ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-interface {v2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_3

    .line 45
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 46
    .line 47
    const-string p2, "stream closed"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    :cond_2
    sub-long/2addr v6, v4

    .line 54
    :try_start_1
    invoke-static {p4, p5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    long-to-int v2, v4

    .line 59
    iget-object v4, p0, Lyyds/ᛴᲀᛷᛷ;->ᲈᲀᛲᲀ:Lyyds/ᛲᛱᛷᲀ;

    .line 60
    .line 61
    iget v4, v4, Lyyds/ᛲᛱᛷᲀ;->ᛲᛴᛳᛲ:I

    .line 62
    .line 63
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    iget-wide v4, p0, Lyyds/ᛴᲀᛷᛷ;->ᛶᛸᲀᲁ:J

    .line 68
    .line 69
    int-to-long v6, v2

    .line 70
    add-long/2addr v4, v6

    .line 71
    iput-wide v4, p0, Lyyds/ᛴᲀᛷᛷ;->ᛶᛸᲀᲁ:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    .line 73
    monitor-exit p0

    .line 74
    sub-long/2addr p4, v6

    .line 75
    iget-object v4, p0, Lyyds/ᛴᲀᛷᛷ;->ᲈᲀᛲᲀ:Lyyds/ᛲᛱᛷᲀ;

    .line 76
    .line 77
    if-eqz p2, :cond_3

    .line 78
    .line 79
    cmp-long v5, p4, v0

    .line 80
    .line 81
    if-nez v5, :cond_3

    .line 82
    .line 83
    const/4 v5, 0x1

    .line 84
    goto :goto_2

    .line 85
    :cond_3
    move v5, v3

    .line 86
    :goto_2
    invoke-virtual {v4, v5, p1, p3, v2}, Lyyds/ᛲᛱᛷᲀ;->ᲇᲇᲇᛱ(ZILyyds/ᛷᛲᲈᛲ;I)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 95
    .line 96
    .line 97
    new-instance p1, Ljava/io/InterruptedIOException;

    .line 98
    .line 99
    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    .line 100
    .line 101
    .line 102
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 103
    :goto_3
    monitor-exit p0

    .line 104
    throw p1

    .line 105
    :cond_4
    return-void
.end method

.method public final ᲇᲇᲇᛱ(I)Lyyds/ᲇᲀᲁᛵ;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lyyds/ᛴᲀᛷᛷ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;

    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lyyds/ᲇᲀᲁᛵ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-object p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    monitor-exit p0

    .line 18
    throw p1
.end method
