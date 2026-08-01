.class public final Lxhss/ᲇᛷᛵᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᲇᲁᲀᲇ;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

.field public final ᛳᲁᲇᛸ:Ljava/util/zip/Inflater;

.field public ᛷᛴᛷᛱ:Z

.field public ᲇᛴᲇᛵ:I


# direct methods
.method public constructor <init>(Lxhss/ᲁᛸᛵᛳ;Ljava/util/zip/Inflater;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᲇᛷᛵᲀ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᲇᛷᛵᲀ;->ᛳᲁᲇᛸ:Ljava/util/zip/Inflater;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lxhss/ᲇᛷᛵᲀ;->ᛷᛴᛷᛱ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lxhss/ᲇᛷᛵᲀ;->ᛳᲁᲇᛸ:Ljava/util/zip/Inflater;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lxhss/ᲇᛷᛵᲀ;->ᛷᛴᛷᛱ:Z

    .line 13
    .line 14
    iget-object p0, p0, Lxhss/ᲇᛷᛵᲀ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 15
    .line 16
    invoke-virtual {p0}, Lxhss/ᲁᛸᛵᛳ;->close()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final ᛷᛵᛵᲈ()Lxhss/ᛲᲁᲈᛲ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲇᛷᛵᲀ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᲁᛸᛵᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲁᲀᲇ;

    .line 4
    .line 5
    invoke-interface {p0}, Lxhss/ᲇᲁᲀᲇ;->ᛷᛵᛵᲈ()Lxhss/ᛲᲁᲈᛲ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final ᛸᛴᛶᛳ(JLxhss/ᛴᛲᛴᛶ;)J
    .locals 7

    .line 1
    iget-object p1, p0, Lxhss/ᲇᛷᛵᲀ;->ᛳᲁᲇᛸ:Ljava/util/zip/Inflater;

    .line 2
    .line 3
    :goto_0
    iget-boolean p2, p0, Lxhss/ᲇᛷᛵᲀ;->ᛷᛴᛷᛱ:Z

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    if-nez p2, :cond_9

    .line 8
    .line 9
    const/4 p2, 0x1

    .line 10
    :try_start_0
    invoke-virtual {p3, p2}, Lxhss/ᛴᛲᛴᛶ;->ᛴᲈᛱᛴ(I)Lxhss/ᛲᛳᲁᛳ;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iget v2, p2, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 15
    .line 16
    rsub-int v2, v2, 0x2000

    .line 17
    .line 18
    int-to-long v2, v2

    .line 19
    const-wide/16 v4, 0x2000

    .line 20
    .line 21
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    long-to-int v2, v2

    .line 26
    invoke-virtual {p1}, Ljava/util/zip/Inflater;->needsInput()Z

    .line 27
    .line 28
    .line 29
    move-result v3
    :try_end_0
    .catch Ljava/util/zip/DataFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    iget-object v4, p0, Lxhss/ᲇᛷᛵᲀ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 31
    .line 32
    if-nez v3, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    :try_start_1
    invoke-virtual {v4}, Lxhss/ᲁᛸᛵᛳ;->ᛱᛱᛲᲇ()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    iget-object v3, v4, Lxhss/ᲁᛸᛵᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛲᛴᛶ;

    .line 43
    .line 44
    iget-object v3, v3, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 45
    .line 46
    iget v5, v3, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 47
    .line 48
    iget v6, v3, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 49
    .line 50
    sub-int/2addr v5, v6

    .line 51
    iput v5, p0, Lxhss/ᲇᛷᛵᲀ;->ᲇᛴᲇᛵ:I

    .line 52
    .line 53
    iget-object v3, v3, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 54
    .line 55
    invoke-virtual {p1, v3, v6, v5}, Ljava/util/zip/Inflater;->setInput([BII)V

    .line 56
    .line 57
    .line 58
    :goto_1
    iget-object v3, p2, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 59
    .line 60
    iget v5, p2, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 61
    .line 62
    invoke-virtual {p1, v3, v5, v2}, Ljava/util/zip/Inflater;->inflate([BII)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    iget v3, p0, Lxhss/ᲇᛷᛵᲀ;->ᲇᛴᲇᛵ:I

    .line 67
    .line 68
    if-nez v3, :cond_2

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    invoke-virtual {p1}, Ljava/util/zip/Inflater;->getRemaining()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    sub-int/2addr v3, v5

    .line 76
    iget v5, p0, Lxhss/ᲇᛷᛵᲀ;->ᲇᛴᲇᛵ:I

    .line 77
    .line 78
    sub-int/2addr v5, v3

    .line 79
    iput v5, p0, Lxhss/ᲇᛷᛵᲀ;->ᲇᛴᲇᛵ:I

    .line 80
    .line 81
    int-to-long v5, v3

    .line 82
    invoke-virtual {v4, v5, v6}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛶᛴᲈ(J)V

    .line 83
    .line 84
    .line 85
    :goto_2
    if-lez v2, :cond_3

    .line 86
    .line 87
    iget v3, p2, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 88
    .line 89
    add-int/2addr v3, v2

    .line 90
    iput v3, p2, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 91
    .line 92
    iget-wide v5, p3, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 93
    .line 94
    int-to-long v2, v2

    .line 95
    add-long/2addr v5, v2

    .line 96
    iput-wide v5, p3, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_3
    iget v2, p2, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 100
    .line 101
    iget v3, p2, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 102
    .line 103
    if-ne v2, v3, :cond_4

    .line 104
    .line 105
    invoke-virtual {p2}, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ()Lxhss/ᛲᛳᲁᛳ;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    iput-object v2, p3, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 110
    .line 111
    invoke-static {p2}, Lxhss/ᛲᛷᛲᲁ;->ᛷᛵᛵᲈ(Lxhss/ᛲᛳᲁᛳ;)V
    :try_end_1
    .catch Ljava/util/zip/DataFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 112
    .line 113
    .line 114
    :cond_4
    move-wide v2, v0

    .line 115
    :goto_3
    cmp-long p2, v2, v0

    .line 116
    .line 117
    if-lez p2, :cond_5

    .line 118
    .line 119
    return-wide v2

    .line 120
    :cond_5
    invoke-virtual {p1}, Ljava/util/zip/Inflater;->finished()Z

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    if-nez p2, :cond_8

    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/util/zip/Inflater;->needsDictionary()Z

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-eqz p2, :cond_6

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_6
    invoke-virtual {v4}, Lxhss/ᲁᛸᛵᛳ;->ᛱᛱᛲᲇ()Z

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    if-nez p2, :cond_7

    .line 138
    .line 139
    goto/16 :goto_0

    .line 140
    .line 141
    :cond_7
    new-instance p0, Ljava/io/EOFException;

    .line 142
    .line 143
    const-string p1, "source exhausted prematurely"

    .line 144
    .line 145
    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw p0

    .line 149
    :cond_8
    :goto_4
    const-wide/16 p0, -0x1

    .line 150
    .line 151
    return-wide p0

    .line 152
    :catch_0
    move-exception p0

    .line 153
    new-instance p1, Ljava/io/IOException;

    .line 154
    .line 155
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 156
    .line 157
    .line 158
    throw p1

    .line 159
    :cond_9
    const-string p0, "closed"

    .line 160
    .line 161
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    return-wide v0
.end method
