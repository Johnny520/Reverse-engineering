.class public final Ljr1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lg22;


# instance fields
.field public final h:I

.field public final i:I

.field public final j:Lpr;


# direct methods
.method public constructor <init>(IILpr;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ljr1;->h:I

    .line 5
    .line 6
    iput p2, p0, Ljr1;->i:I

    .line 7
    .line 8
    iput-object p3, p0, Ljr1;->j:Lpr;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ld11;JLd61;J)J
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Ld61;->h:Ld61;

    .line 8
    .line 9
    const/16 v1, 0x20

    .line 10
    .line 11
    if-ne p4, v0, :cond_0

    .line 12
    .line 13
    iget p4, p1, Ld11;->c:I

    .line 14
    .line 15
    shr-long v2, p5, v1

    .line 16
    .line 17
    long-to-int v0, v2

    .line 18
    sub-int/2addr p4, v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget p4, p1, Ld11;->a:I

    .line 21
    .line 22
    :goto_0
    shr-long v2, p2, v1

    .line 23
    .line 24
    long-to-int v0, v2

    .line 25
    shr-long v2, p5, v1

    .line 26
    .line 27
    long-to-int v2, v2

    .line 28
    sub-int/2addr v0, v2

    .line 29
    iget v2, p0, Ljr1;->i:I

    .line 30
    .line 31
    sub-int/2addr v0, v2

    .line 32
    if-ge v0, v2, :cond_1

    .line 33
    .line 34
    move v0, v2

    .line 35
    :cond_1
    invoke-static {p4, v2, v0}, Lci0;->D(III)I

    .line 36
    .line 37
    .line 38
    move-result p4

    .line 39
    iget v0, p1, Ld11;->b:I

    .line 40
    .line 41
    iget p1, p1, Ld11;->d:I

    .line 42
    .line 43
    add-int v3, v0, p1

    .line 44
    .line 45
    div-int/lit8 v3, v3, 0x2

    .line 46
    .line 47
    iget v4, p0, Ljr1;->h:I

    .line 48
    .line 49
    add-int v5, v3, v4

    .line 50
    .line 51
    sub-int/2addr v3, v4

    .line 52
    const-wide v6, 0xffffffffL

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    and-long/2addr p5, v6

    .line 58
    long-to-int p5, p5

    .line 59
    sub-int/2addr v3, p5

    .line 60
    add-int p6, v5, p5

    .line 61
    .line 62
    and-long/2addr p2, v6

    .line 63
    long-to-int p2, p2

    .line 64
    sub-int p3, p2, v2

    .line 65
    .line 66
    const/4 v4, 0x0

    .line 67
    const/4 v8, 0x1

    .line 68
    if-gt p6, p3, :cond_2

    .line 69
    .line 70
    move p3, v8

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    move p3, v4

    .line 73
    :goto_1
    if-lt v3, v2, :cond_3

    .line 74
    .line 75
    move p6, v8

    .line 76
    goto :goto_2

    .line 77
    :cond_3
    move p6, v4

    .line 78
    :goto_2
    if-eqz p3, :cond_4

    .line 79
    .line 80
    goto :goto_5

    .line 81
    :cond_4
    if-eqz p6, :cond_5

    .line 82
    .line 83
    move v5, v3

    .line 84
    goto :goto_5

    .line 85
    :cond_5
    sub-int p1, p2, p1

    .line 86
    .line 87
    if-le v0, p1, :cond_7

    .line 88
    .line 89
    if-ge v3, v2, :cond_6

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_6
    move v2, v3

    .line 93
    :goto_3
    move v5, v2

    .line 94
    goto :goto_5

    .line 95
    :cond_7
    sub-int/2addr p2, p5

    .line 96
    sub-int/2addr p2, v2

    .line 97
    if-ge p2, v2, :cond_8

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_8
    move v2, p2

    .line 101
    :goto_4
    if-le v5, v2, :cond_9

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_9
    :goto_5
    if-ge v5, v0, :cond_a

    .line 105
    .line 106
    move v4, v8

    .line 107
    :cond_a
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iget-object p0, p0, Ljr1;->j:Lpr;

    .line 112
    .line 113
    invoke-virtual {p0, p1}, Lpr;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    int-to-long p0, p4

    .line 117
    shl-long/2addr p0, v1

    .line 118
    int-to-long p2, v5

    .line 119
    and-long/2addr p2, v6

    .line 120
    or-long/2addr p0, p2

    .line 121
    return-wide p0
.end method
