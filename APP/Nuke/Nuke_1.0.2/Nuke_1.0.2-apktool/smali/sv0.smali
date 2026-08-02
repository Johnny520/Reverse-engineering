.class public final Lsv0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lht2;


# instance fields
.field public final h:Lon;

.field public i:I

.field public j:I

.field public k:I

.field public l:I


# direct methods
.method public constructor <init>(Lon;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lsv0;->h:Lon;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()Lo23;
    .locals 0

    .line 1
    iget-object p0, p0, Lsv0;->h:Lon;

    .line 2
    .line 3
    invoke-interface {p0}, Lht2;->a()Lo23;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final n(Lfn;J)J
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :goto_0
    iget p2, p0, Lsv0;->k:I

    .line 5
    .line 6
    iget-object p3, p0, Lsv0;->h:Lon;

    .line 7
    .line 8
    const-wide/16 v0, -0x1

    .line 9
    .line 10
    if-nez p2, :cond_4

    .line 11
    .line 12
    iget p2, p0, Lsv0;->l:I

    .line 13
    .line 14
    int-to-long v2, p2

    .line 15
    invoke-interface {p3, v2, v3}, Lon;->skip(J)V

    .line 16
    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    iput p2, p0, Lsv0;->l:I

    .line 20
    .line 21
    iget p2, p0, Lsv0;->i:I

    .line 22
    .line 23
    and-int/lit8 p2, p2, 0x4

    .line 24
    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    iget p2, p0, Lsv0;->j:I

    .line 29
    .line 30
    invoke-static {p3}, Lug3;->l(Lon;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iput v0, p0, Lsv0;->k:I

    .line 35
    .line 36
    invoke-interface {p3}, Lon;->readByte()B

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    and-int/lit16 v1, v1, 0xff

    .line 41
    .line 42
    invoke-interface {p3}, Lon;->readByte()B

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    and-int/lit16 v2, v2, 0xff

    .line 47
    .line 48
    iput v2, p0, Lsv0;->i:I

    .line 49
    .line 50
    sget-object v2, Ltv0;->k:Ljava/util/logging/Logger;

    .line 51
    .line 52
    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_1

    .line 59
    .line 60
    sget-object v3, Ljv0;->a:Lno;

    .line 61
    .line 62
    iget v3, p0, Lsv0;->j:I

    .line 63
    .line 64
    iget v4, p0, Lsv0;->i:I

    .line 65
    .line 66
    const/4 v5, 0x1

    .line 67
    invoke-static {v5, v3, v0, v1, v4}, Ljv0;->b(ZIIII)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v2, v0}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :cond_1
    invoke-interface {p3}, Lon;->readInt()I

    .line 75
    .line 76
    .line 77
    move-result p3

    .line 78
    const v0, 0x7fffffff

    .line 79
    .line 80
    .line 81
    and-int/2addr p3, v0

    .line 82
    iput p3, p0, Lsv0;->j:I

    .line 83
    .line 84
    const/16 v0, 0x9

    .line 85
    .line 86
    if-ne v1, v0, :cond_3

    .line 87
    .line 88
    if-ne p3, p2, :cond_2

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_2
    const-string p0, "TYPE_CONTINUATION streamId changed"

    .line 92
    .line 93
    invoke-static {p0}, Lc80;->v(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const-wide/16 p0, 0x0

    .line 97
    .line 98
    return-wide p0

    .line 99
    :cond_3
    new-instance p0, Ljava/io/IOException;

    .line 100
    .line 101
    new-instance p1, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string p2, " != TYPE_CONTINUATION"

    .line 110
    .line 111
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p0

    .line 122
    :cond_4
    int-to-long v2, p2

    .line 123
    const-wide/16 v4, 0x2000

    .line 124
    .line 125
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 126
    .line 127
    .line 128
    move-result-wide v2

    .line 129
    invoke-interface {p3, p1, v2, v3}, Lht2;->n(Lfn;J)J

    .line 130
    .line 131
    .line 132
    move-result-wide p1

    .line 133
    cmp-long p3, p1, v0

    .line 134
    .line 135
    if-nez p3, :cond_5

    .line 136
    .line 137
    :goto_1
    return-wide v0

    .line 138
    :cond_5
    iget p3, p0, Lsv0;->k:I

    .line 139
    .line 140
    long-to-int v0, p1

    .line 141
    sub-int/2addr p3, v0

    .line 142
    iput p3, p0, Lsv0;->k:I

    .line 143
    .line 144
    return-wide p1
.end method
