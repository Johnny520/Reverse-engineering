.class public final Lxhss/ᛳᲇᲁᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛷᛶᛷᛲ;


# static fields
.field public static final ᲇᛶᛴᲀ:Lxhss/ᲁᛸᛱᛵ;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᲀᲀᲁᛱ;

.field public final ᛳᲁᲇᛸ:Lxhss/ᛷᛱᛳᲁ;

.field public final ᛷᛴᛷᛱ:Lxhss/ᛱᛷᲇᲁ;

.field public final ᛷᛵᛵᲈ:Lxhss/ᛵᛸᛷᛲ;

.field public ᲇᛴᲇᛵ:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const-string v0, "OkHttp-Response-Body"

    .line 2
    .line 3
    const-string v1, "Truncated"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, [Ljava/lang/String;

    .line 15
    .line 16
    array-length v2, v0

    .line 17
    rem-int/2addr v2, v1

    .line 18
    if-nez v2, :cond_3

    .line 19
    .line 20
    array-length v2, v0

    .line 21
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, [Ljava/lang/String;

    .line 26
    .line 27
    array-length v3, v2

    .line 28
    const/4 v4, 0x0

    .line 29
    move v5, v4

    .line 30
    :goto_0
    if-ge v5, v3, :cond_1

    .line 31
    .line 32
    aget-object v6, v2, v5

    .line 33
    .line 34
    if-eqz v6, :cond_0

    .line 35
    .line 36
    aget-object v6, v0, v5

    .line 37
    .line 38
    invoke-static {v6}, Lxhss/ᛲᛱᛲᲀ;->ᛵᛳᛸᲇ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    aput-object v6, v2, v5

    .line 47
    .line 48
    add-int/lit8 v5, v5, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const-string v0, "Headers cannot be null"

    .line 52
    .line 53
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    array-length v0, v2

    .line 58
    add-int/lit8 v0, v0, -0x1

    .line 59
    .line 60
    invoke-static {v4, v0, v1}, Lxhss/ᛷᛸᲀᲀ;->ᛸᛲᛷᛱ(III)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-ltz v0, :cond_2

    .line 65
    .line 66
    :goto_1
    aget-object v1, v2, v4

    .line 67
    .line 68
    add-int/lit8 v3, v4, 0x1

    .line 69
    .line 70
    aget-object v3, v2, v3

    .line 71
    .line 72
    invoke-static {v1}, Lxhss/ᛷᛸᲀᲀ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v3, v1}, Lxhss/ᛷᛸᲀᲀ;->ᲁᛲᛴᛴ(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    if-eq v4, v0, :cond_2

    .line 79
    .line 80
    add-int/lit8 v4, v4, 0x2

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    new-instance v0, Lxhss/ᲁᛸᛱᛵ;

    .line 84
    .line 85
    invoke-direct {v0, v2}, Lxhss/ᲁᛸᛱᛵ;-><init>([Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    sput-object v0, Lxhss/ᛳᲇᲁᲈ;->ᲇᛶᛴᲀ:Lxhss/ᲁᛸᛱᛵ;

    .line 89
    .line 90
    return-void

    .line 91
    :cond_3
    const-string v0, "Expected alternating header names and values"

    .line 92
    .line 93
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public constructor <init>(Lxhss/ᛵᛸᛷᛲ;Lxhss/ᲀᲀᲁᛱ;Lxhss/ᛷᛱᛳᲁ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛳᲇᲁᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛸᛷᛲ;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᛳᲇᲁᲈ;->ᛱᛱᛲᲇ:Lxhss/ᲀᲀᲁᛱ;

    .line 7
    .line 8
    iput-object p3, p0, Lxhss/ᛳᲇᲁᲈ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛱᛳᲁ;

    .line 9
    .line 10
    new-instance p1, Lxhss/ᛱᛷᲇᲁ;

    .line 11
    .line 12
    iget-object p2, p3, Lxhss/ᛷᛱᛳᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p2, Lxhss/ᲁᛸᛵᛳ;

    .line 15
    .line 16
    invoke-direct {p1, p2}, Lxhss/ᛱᛷᲇᲁ;-><init>(Lxhss/ᲁᛸᛵᛳ;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lxhss/ᛳᲇᲁᲈ;->ᛷᛴᛷᛱ:Lxhss/ᛱᛷᲇᲁ;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛳᲇᲁᲈ;->ᛱᛱᛲᲇ:Lxhss/ᲀᲀᲁᛱ;

    .line 2
    .line 3
    invoke-interface {p0}, Lxhss/ᲀᲀᲁᛱ;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛱᛱᛲᲇ()Z
    .locals 1

    .line 1
    iget p0, p0, Lxhss/ᛳᲇᲁᲈ;->ᲇᛴᲇᛵ:I

    .line 2
    .line 3
    const/4 v0, 0x6

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public final ᛳᲁᲇᛸ()Lxhss/ᛳᛵᛲᲁ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛳᲇᲁᲈ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛱᛳᲁ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛷᛴᛷᛱ(Lxhss/ᲀᛶᛷᲁ;)J
    .locals 1

    .line 1
    invoke-static {p1}, Lxhss/ᲇᲈᲀᛵ;->ᛷᛵᛵᲈ(Lxhss/ᲀᛶᛷᲁ;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-wide/16 p0, 0x0

    .line 8
    .line 9
    return-wide p0

    .line 10
    :cond_0
    iget-object p0, p1, Lxhss/ᲀᛶᛷᲁ;->ᲀᲇᛳᲁ:Lxhss/ᲁᛸᛱᛵ;

    .line 11
    .line 12
    const-string v0, "Transfer-Encoding"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lxhss/ᲁᛸᛱᛵ;->ᛷᛵᛵᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    :cond_1
    const-string v0, "chunked"

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    const-wide/16 p0, -0x1

    .line 30
    .line 31
    return-wide p0

    .line 32
    :cond_2
    invoke-static {p1}, Lxhss/ᛶᛴᲀᛲ;->ᛷᛴᛷᛱ(Lxhss/ᲀᛶᛷᲁ;)J

    .line 33
    .line 34
    .line 35
    move-result-wide p0

    .line 36
    return-wide p0
.end method

.method public final ᛷᛵᛵᲈ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛳᲇᲁᲈ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛱᛳᲁ;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lxhss/ᛱᛸᛵᛱ;

    .line 6
    .line 7
    invoke-virtual {p0}, Lxhss/ᛱᛸᛵᛱ;->flush()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final ᛸᛲᲀᛵ(Lxhss/ᛷᛶᲁᛵ;J)Lxhss/ᛱᛸᛵᲈ;
    .locals 2

    .line 1
    iget v0, p0, Lxhss/ᛳᲇᲁᲈ;->ᲇᛴᲇᛵ:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    iput v0, p0, Lxhss/ᛳᲇᲁᲈ;->ᲇᛴᲇᛵ:I

    .line 8
    .line 9
    new-instance v0, Lxhss/ᛱᛸᛵᲈ;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, p2, p3}, Lxhss/ᛱᛸᛵᲈ;-><init>(Lxhss/ᛳᲇᲁᲈ;Lxhss/ᛷᛶᲁᛵ;J)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    const-string p1, "state: "

    .line 16
    .line 17
    iget p0, p0, Lxhss/ᛳᲇᲁᲈ;->ᲇᛴᲇᛵ:I

    .line 18
    .line 19
    invoke-static {p1, p0}, Lxhss/ᛵᲈᲁᲈ;->ᛸᛴᛶᛳ(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public final ᛸᛴᛶᛳ()Lxhss/ᛳᛵᛴ;
    .locals 7

    .line 1
    iget-object v0, p0, Lxhss/ᛳᲇᲁᲈ;->ᛷᛴᛷᛱ:Lxhss/ᛱᛷᲇᲁ;

    .line 2
    .line 3
    iget v1, p0, Lxhss/ᛳᲇᲁᲈ;->ᲇᛴᲇᛵ:I

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    if-eq v1, v3, :cond_1

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    if-eq v1, v3, :cond_1

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v0, "state: "

    .line 18
    .line 19
    iget p0, p0, Lxhss/ᛳᲇᲁᲈ;->ᲇᛴᲇᛵ:I

    .line 20
    .line 21
    invoke-static {v0, p0}, Lxhss/ᛵᲈᲁᲈ;->ᛸᛴᛶᛳ(Ljava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0

    .line 26
    :cond_1
    :goto_0
    :try_start_0
    iget-object v1, v0, Lxhss/ᛱᛷᲇᲁ;->ᛷᛵᛵᲈ:Lxhss/ᲁᛸᛵᛳ;

    .line 27
    .line 28
    iget-wide v3, v0, Lxhss/ᛱᛷᲇᲁ;->ᛱᛱᛲᲇ:J

    .line 29
    .line 30
    invoke-virtual {v1, v3, v4}, Lxhss/ᲁᛸᛵᛳ;->ᲇᛸᛳᲁ(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-wide v3, v0, Lxhss/ᛱᛷᲇᲁ;->ᛱᛱᛲᲇ:J

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    int-to-long v5, v5

    .line 41
    sub-long/2addr v3, v5

    .line 42
    iput-wide v3, v0, Lxhss/ᛱᛷᲇᲁ;->ᛱᛱᛲᲇ:J

    .line 43
    .line 44
    invoke-static {v1}, Lxhss/ᲁᛵᛸᛳ;->ᛸᛶᛴᲈ(Ljava/lang/String;)Lxhss/ᛵᛶᛳ;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget v3, v1, Lxhss/ᛵᛶᛳ;->ᛱᛱᛲᲇ:I

    .line 49
    .line 50
    new-instance v4, Lxhss/ᛳᛵᛴ;

    .line 51
    .line 52
    invoke-direct {v4}, Lxhss/ᛳᛵᛴ;-><init>()V

    .line 53
    .line 54
    .line 55
    iget-object v5, v1, Lxhss/ᛵᛶᛳ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v5, Lxhss/ᲈᛲᛵᛴ;

    .line 58
    .line 59
    iput-object v5, v4, Lxhss/ᛳᛵᛴ;->ᛱᛱᛲᲇ:Lxhss/ᲈᛲᛵᛴ;

    .line 60
    .line 61
    iput v3, v4, Lxhss/ᛳᛵᛴ;->ᛳᲁᲇᛸ:I

    .line 62
    .line 63
    iget-object v1, v1, Lxhss/ᛵᛶᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Ljava/lang/String;

    .line 66
    .line 67
    iput-object v1, v4, Lxhss/ᛳᛵᛴ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v0}, Lxhss/ᛱᛷᲇᲁ;->ᛷᛵᛵᲈ()Lxhss/ᲁᛸᛱᛵ;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0}, Lxhss/ᛷᛸᲀᲀ;->ᛸᛶᲈᛶ(Lxhss/ᲁᛸᛱᛵ;)Lxhss/ᛴᲈᛱᲁ;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iput-object v0, v4, Lxhss/ᛳᛵᛴ;->ᲇᛶᛴᲀ:Lxhss/ᛴᲈᛱᲁ;

    .line 78
    .line 79
    const/16 v0, 0x64

    .line 80
    .line 81
    if-ne v3, v0, :cond_2

    .line 82
    .line 83
    iput v2, p0, Lxhss/ᛳᲇᲁᲈ;->ᲇᛴᲇᛵ:I

    .line 84
    .line 85
    return-object v4

    .line 86
    :catch_0
    move-exception v0

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    const/16 v0, 0x66

    .line 89
    .line 90
    if-gt v0, v3, :cond_3

    .line 91
    .line 92
    const/16 v0, 0xc8

    .line 93
    .line 94
    if-ge v3, v0, :cond_3

    .line 95
    .line 96
    iput v2, p0, Lxhss/ᛳᲇᲁᲈ;->ᲇᛴᲇᛵ:I

    .line 97
    .line 98
    return-object v4

    .line 99
    :cond_3
    const/4 v0, 0x4

    .line 100
    iput v0, p0, Lxhss/ᛳᲇᲁᲈ;->ᲇᛴᲇᛵ:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    .line 102
    return-object v4

    .line 103
    :goto_1
    iget-object p0, p0, Lxhss/ᛳᲇᲁᲈ;->ᛱᛱᛲᲇ:Lxhss/ᲀᲀᲁᛱ;

    .line 104
    .line 105
    invoke-interface {p0}, Lxhss/ᲀᲀᲁᛱ;->ᛷᛴᛷᛱ()Lxhss/ᛱᛷᲁᛶ;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    iget-object p0, p0, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 110
    .line 111
    iget-object p0, p0, Lxhss/ᛵᲈᛱᛳ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛶᲁᛵ;

    .line 112
    .line 113
    invoke-virtual {p0}, Lxhss/ᛷᛶᲁᛵ;->ᲀᲇᛳᲁ()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    new-instance v1, Ljava/io/IOException;

    .line 118
    .line 119
    const-string v2, "unexpected end of stream on "

    .line 120
    .line 121
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-direct {v1, p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    throw v1
.end method

.method public final ᛸᛷᲈᲈ(Lxhss/ᲁᛸᛱᛵ;Ljava/lang/String;)V
    .locals 5

    .line 1
    iget v0, p0, Lxhss/ᛳᲇᲁᲈ;->ᲇᛴᲇᛵ:I

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lxhss/ᛳᲇᲁᲈ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛱᛳᲁ;

    .line 6
    .line 7
    iget-object v1, v0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lxhss/ᛱᛸᛵᛱ;

    .line 10
    .line 11
    invoke-virtual {v1, p2}, Lxhss/ᛱᛸᛵᛱ;->ᛸᛷᲈᲈ(Ljava/lang/String;)Lxhss/ᲈᛳᲈᲀ;

    .line 12
    .line 13
    .line 14
    const-string p2, "\r\n"

    .line 15
    .line 16
    invoke-virtual {v1, p2}, Lxhss/ᛱᛸᛵᛱ;->ᛸᛷᲈᲈ(Ljava/lang/String;)Lxhss/ᲈᛳᲈᲀ;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lxhss/ᲁᛸᛱᛵ;->size()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x0

    .line 24
    :goto_0
    iget-object v3, v0, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, Lxhss/ᛱᛸᛵᛱ;

    .line 27
    .line 28
    if-ge v2, v1, :cond_0

    .line 29
    .line 30
    invoke-static {p1, v2}, Lxhss/ᛷᛸᲀᲀ;->ᛷᲁᲁ(Lxhss/ᲁᛸᛱᛵ;I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v3, v4}, Lxhss/ᛱᛸᛵᛱ;->ᛸᛷᲈᲈ(Ljava/lang/String;)Lxhss/ᲈᛳᲈᲀ;

    .line 35
    .line 36
    .line 37
    const-string v4, ": "

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Lxhss/ᛱᛸᛵᛱ;->ᛸᛷᲈᲈ(Ljava/lang/String;)Lxhss/ᲈᛳᲈᲀ;

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v2}, Lxhss/ᛷᛸᲀᲀ;->ᲇᛸᛳᲁ(Lxhss/ᲁᛸᛱᛵ;I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-interface {v3, v4}, Lxhss/ᲈᛳᲈᲀ;->ᛸᛷᲈᲈ(Ljava/lang/String;)Lxhss/ᲈᛳᲈᲀ;

    .line 47
    .line 48
    .line 49
    invoke-interface {v3, p2}, Lxhss/ᲈᛳᲈᲀ;->ᛸᛷᲈᲈ(Ljava/lang/String;)Lxhss/ᲈᛳᲈᲀ;

    .line 50
    .line 51
    .line 52
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {v3, p2}, Lxhss/ᛱᛸᛵᛱ;->ᛸᛷᲈᲈ(Ljava/lang/String;)Lxhss/ᲈᛳᲈᲀ;

    .line 56
    .line 57
    .line 58
    const/4 p1, 0x1

    .line 59
    iput p1, p0, Lxhss/ᛳᲇᲁᲈ;->ᲇᛴᲇᛵ:I

    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    const-string p1, "state: "

    .line 63
    .line 64
    iget p0, p0, Lxhss/ᛳᲇᲁᲈ;->ᲇᛴᲇᛵ:I

    .line 65
    .line 66
    invoke-static {p1, p0}, Lxhss/ᛵᲈᲁᲈ;->ᛸᛴᛶᛳ(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final ᲀᲇᛳᲁ(Lxhss/ᛴᛴᛴᛵ;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lxhss/ᛳᲇᲁᲈ;->ᛱᛱᛲᲇ:Lxhss/ᲀᲀᲁᛱ;

    .line 2
    .line 3
    invoke-interface {v0}, Lxhss/ᲀᲀᲁᛱ;->ᛷᛴᛷᛱ()Lxhss/ᛱᛷᲁᛶ;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lxhss/ᛱᛷᲁᛶ;->ᛱᛱᛲᲇ:Ljava/net/Proxy;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v2, p1, Lxhss/ᛴᛴᛴᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v2, 0x20

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v2, p1, Lxhss/ᛴᛴᛴᛵ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Lxhss/ᛷᛶᲁᛵ;

    .line 33
    .line 34
    iget-object v3, v2, Lxhss/ᛷᛶᲁᛵ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 35
    .line 36
    const-string v4, "https"

    .line 37
    .line 38
    invoke-static {v3, v4}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_0

    .line 43
    .line 44
    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 45
    .line 46
    if-ne v0, v3, :cond_0

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {v2}, Lxhss/ᛷᛶᲁᛵ;->ᛱᛱᛲᲇ()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v2}, Lxhss/ᛷᛶᲁᛵ;->ᲇᛴᲇᛵ()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    new-instance v3, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/16 v0, 0x3f

    .line 68
    .line 69
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    :cond_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    :goto_0
    const-string v0, " HTTP/1.1"

    .line 83
    .line 84
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-object p1, p1, Lxhss/ᛴᛴᛴᛵ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p1, Lxhss/ᲁᛸᛱᛵ;

    .line 94
    .line 95
    invoke-virtual {p0, p1, v0}, Lxhss/ᛳᲇᲁᲈ;->ᛸᛷᲈᲈ(Lxhss/ᲁᛸᛱᛵ;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public final ᲇᛴᲇᛵ()Lxhss/ᲀᲀᲁᛱ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛳᲇᲁᲈ;->ᛱᛱᛲᲇ:Lxhss/ᲀᲀᲁᛱ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲇᛶᛴᲀ(Lxhss/ᲀᛶᛷᲁ;)Lxhss/ᲇᲁᲀᲇ;
    .locals 10

    .line 1
    iget-object v0, p1, Lxhss/ᲀᛶᛷᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛴᛴᛵ;

    .line 2
    .line 3
    invoke-static {p1}, Lxhss/ᲇᲈᲀᛵ;->ᛷᛵᛵᲈ(Lxhss/ᲀᛶᛷᲁ;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object p1, v0, Lxhss/ᛴᛴᛴᛵ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Lxhss/ᛷᛶᲁᛵ;

    .line 12
    .line 13
    const-wide/16 v0, 0x0

    .line 14
    .line 15
    invoke-virtual {p0, p1, v0, v1}, Lxhss/ᛳᲇᲁᲈ;->ᛸᛲᲀᛵ(Lxhss/ᛷᛶᲁᛵ;J)Lxhss/ᛱᛸᛵᲈ;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    const-string v1, "Transfer-Encoding"

    .line 21
    .line 22
    iget-object v2, p1, Lxhss/ᲀᛶᛷᲁ;->ᲀᲇᛳᲁ:Lxhss/ᲁᛸᛱᛵ;

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Lxhss/ᲁᛸᛱᛵ;->ᛷᛵᛵᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/4 v2, 0x0

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    move-object v1, v2

    .line 32
    :cond_1
    const-string v3, "chunked"

    .line 33
    .line 34
    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const-string v3, "state: "

    .line 39
    .line 40
    const/4 v4, 0x5

    .line 41
    const/4 v5, 0x4

    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    iget-object p1, v0, Lxhss/ᛴᛴᛴᛵ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Lxhss/ᛷᛶᲁᛵ;

    .line 47
    .line 48
    iget v0, p0, Lxhss/ᛳᲇᲁᲈ;->ᲇᛴᲇᛵ:I

    .line 49
    .line 50
    if-ne v0, v5, :cond_2

    .line 51
    .line 52
    iput v4, p0, Lxhss/ᛳᲇᲁᲈ;->ᲇᛴᲇᛵ:I

    .line 53
    .line 54
    new-instance v0, Lxhss/ᛳᛳᛷᲇ;

    .line 55
    .line 56
    invoke-direct {v0, p0, p1}, Lxhss/ᛳᛳᛷᲇ;-><init>(Lxhss/ᛳᲇᲁᲈ;Lxhss/ᛷᛶᲁᛵ;)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_2
    iget p0, p0, Lxhss/ᛳᲇᲁᲈ;->ᲇᛴᲇᛵ:I

    .line 61
    .line 62
    invoke-static {v3, p0}, Lxhss/ᛵᲈᲁᲈ;->ᛸᛴᛶᛳ(Ljava/lang/String;I)V

    .line 63
    .line 64
    .line 65
    return-object v2

    .line 66
    :cond_3
    invoke-static {p1}, Lxhss/ᛶᛴᲀᛲ;->ᛷᛴᛷᛱ(Lxhss/ᲀᛶᛷᲁ;)J

    .line 67
    .line 68
    .line 69
    move-result-wide v6

    .line 70
    const-wide/16 v8, -0x1

    .line 71
    .line 72
    cmp-long p1, v6, v8

    .line 73
    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    iget-object p1, v0, Lxhss/ᛴᛴᛴᛵ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p1, Lxhss/ᛷᛶᲁᛵ;

    .line 79
    .line 80
    invoke-virtual {p0, p1, v6, v7}, Lxhss/ᛳᲇᲁᲈ;->ᛸᛲᲀᛵ(Lxhss/ᛷᛶᲁᛵ;J)Lxhss/ᛱᛸᛵᲈ;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :cond_4
    iget-object p1, v0, Lxhss/ᛴᛴᛴᛵ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p1, Lxhss/ᛷᛶᲁᛵ;

    .line 88
    .line 89
    iget v0, p0, Lxhss/ᛳᲇᲁᲈ;->ᲇᛴᲇᛵ:I

    .line 90
    .line 91
    if-ne v0, v5, :cond_5

    .line 92
    .line 93
    iput v4, p0, Lxhss/ᛳᲇᲁᲈ;->ᲇᛴᲇᛵ:I

    .line 94
    .line 95
    iget-object v0, p0, Lxhss/ᛳᲇᲁᲈ;->ᛱᛱᛲᲇ:Lxhss/ᲀᲀᲁᛱ;

    .line 96
    .line 97
    invoke-interface {v0}, Lxhss/ᲀᲀᲁᛱ;->ᛸᛴᛶᛳ()V

    .line 98
    .line 99
    .line 100
    new-instance v0, Lxhss/ᛶᛲᛵᛲ;

    .line 101
    .line 102
    invoke-direct {v0, p0, p1}, Lxhss/ᲈᛳᛷᲁ;-><init>(Lxhss/ᛳᲇᲁᲈ;Lxhss/ᛷᛶᲁᛵ;)V

    .line 103
    .line 104
    .line 105
    return-object v0

    .line 106
    :cond_5
    iget p0, p0, Lxhss/ᛳᲇᲁᲈ;->ᲇᛴᲇᛵ:I

    .line 107
    .line 108
    invoke-static {v3, p0}, Lxhss/ᛵᲈᲁᲈ;->ᛸᛴᛶᛳ(Ljava/lang/String;I)V

    .line 109
    .line 110
    .line 111
    return-object v2
.end method
