.class public final Lxhss/ᲀᛸᲀᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᲇᲁᲀᲇ;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

.field public ᛳᲁᲇᛸ:I

.field public ᛷᛴᛷᛱ:I

.field public ᲇᛴᲇᛵ:I

.field public ᲇᛶᛴᲀ:I


# direct methods
.method public constructor <init>(Lxhss/ᲁᛸᛵᛳ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᲀᛸᲀᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᛷᛵᛵᲈ()Lxhss/ᛲᲁᲈᛲ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲀᛸᲀᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

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
    .locals 6

    .line 1
    :goto_0
    iget p1, p0, Lxhss/ᲀᛸᲀᛳ;->ᛷᛴᛷᛱ:I

    .line 2
    .line 3
    iget-object p2, p0, Lxhss/ᲀᛸᲀᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 4
    .line 5
    const-wide/16 v0, -0x1

    .line 6
    .line 7
    if-nez p1, :cond_4

    .line 8
    .line 9
    iget p1, p0, Lxhss/ᲀᛸᲀᛳ;->ᲇᛶᛴᲀ:I

    .line 10
    .line 11
    int-to-long v2, p1

    .line 12
    invoke-virtual {p2, v2, v3}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛶᛴᲈ(J)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput p1, p0, Lxhss/ᲀᛸᲀᛳ;->ᲇᛶᛴᲀ:I

    .line 17
    .line 18
    iget p1, p0, Lxhss/ᲀᛸᲀᛳ;->ᛳᲁᲇᛸ:I

    .line 19
    .line 20
    and-int/lit8 p1, p1, 0x4

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    iget p1, p0, Lxhss/ᲀᛸᲀᛳ;->ᲇᛴᲇᛵ:I

    .line 26
    .line 27
    invoke-static {p2}, Lxhss/ᛶᛸᛲ;->ᲈᛳᲀ(Lxhss/ᲁᛸᛵᛳ;)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iput v0, p0, Lxhss/ᲀᛸᲀᛳ;->ᛷᛴᛷᛱ:I

    .line 32
    .line 33
    invoke-virtual {p2}, Lxhss/ᲁᛸᛵᛳ;->ᲇᛴᲇᛵ()B

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    and-int/lit16 v1, v1, 0xff

    .line 38
    .line 39
    invoke-virtual {p2}, Lxhss/ᲁᛸᛵᛳ;->ᲇᛴᲇᛵ()B

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    and-int/lit16 v2, v2, 0xff

    .line 44
    .line 45
    iput v2, p0, Lxhss/ᲀᛸᲀᛳ;->ᛳᲁᲇᛸ:I

    .line 46
    .line 47
    sget-object v2, Lxhss/ᛴᛱᛱ;->ᛷᛴᛷᛱ:Ljava/util/logging/Logger;

    .line 48
    .line 49
    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_1

    .line 56
    .line 57
    sget-object v3, Lxhss/ᲁᛱᛱᲇ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛶᲈᲈ;

    .line 58
    .line 59
    iget v3, p0, Lxhss/ᲀᛸᲀᛳ;->ᲇᛴᲇᛵ:I

    .line 60
    .line 61
    iget v4, p0, Lxhss/ᲀᛸᲀᛳ;->ᛳᲁᲇᛸ:I

    .line 62
    .line 63
    const/4 v5, 0x1

    .line 64
    invoke-static {v5, v3, v0, v1, v4}, Lxhss/ᲁᛱᛱᲇ;->ᛱᛱᛲᲇ(ZIIII)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v2, v0}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    invoke-virtual {p2}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛲᲀᛵ()I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    const v0, 0x7fffffff

    .line 76
    .line 77
    .line 78
    and-int/2addr p2, v0

    .line 79
    iput p2, p0, Lxhss/ᲀᛸᲀᛳ;->ᲇᛴᲇᛵ:I

    .line 80
    .line 81
    const/16 v0, 0x9

    .line 82
    .line 83
    if-ne v1, v0, :cond_3

    .line 84
    .line 85
    if-ne p2, p1, :cond_2

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    const-string p0, "TYPE_CONTINUATION streamId changed"

    .line 89
    .line 90
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const-wide/16 p0, 0x0

    .line 94
    .line 95
    return-wide p0

    .line 96
    :cond_3
    new-instance p0, Ljava/io/IOException;

    .line 97
    .line 98
    new-instance p1, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string p2, " != TYPE_CONTINUATION"

    .line 107
    .line 108
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw p0

    .line 119
    :cond_4
    int-to-long v2, p1

    .line 120
    const-wide/16 v4, 0x2000

    .line 121
    .line 122
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 123
    .line 124
    .line 125
    move-result-wide v2

    .line 126
    invoke-virtual {p2, v2, v3, p3}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛴᛶᛳ(JLxhss/ᛴᛲᛴᛶ;)J

    .line 127
    .line 128
    .line 129
    move-result-wide p1

    .line 130
    cmp-long p3, p1, v0

    .line 131
    .line 132
    if-nez p3, :cond_5

    .line 133
    .line 134
    :goto_1
    return-wide v0

    .line 135
    :cond_5
    iget p3, p0, Lxhss/ᲀᛸᲀᛳ;->ᛷᛴᛷᛱ:I

    .line 136
    .line 137
    long-to-int v0, p1

    .line 138
    sub-int/2addr p3, v0

    .line 139
    iput p3, p0, Lxhss/ᲀᛸᲀᛳ;->ᛷᛴᛷᛱ:I

    .line 140
    .line 141
    return-wide p1
.end method
