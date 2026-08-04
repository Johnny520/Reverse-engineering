.class public abstract Lyyds/ᲇᛸᛴᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᲀᛲᛳᲀ:Lyyds/ᛷᛳᛲᛷ;

.field public static final ᲇᲈᛵᛷ:Lyyds/ᛳᛷᛶᛲ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛷᛳᛲᛷ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᲇᛸᛴᛷ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛳᛲᛷ;

    .line 7
    .line 8
    sget-object v0, Lyyds/ᛶᛶᛶ;->ᛲᲈᲁ:Ljava/lang/Integer;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/16 v1, 0x22

    .line 17
    .line 18
    if-lt v0, v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v0, Lyyds/ᲀᛸᛵᲈ;

    .line 22
    .line 23
    invoke-direct {v0}, Lyyds/ᲀᛸᛵᲈ;-><init>()V

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    new-instance v0, Lyyds/ᲈᲁᛶᛷ;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    :goto_1
    sput-object v0, Lyyds/ᲇᛸᛴᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛳᛷᛶᛲ;

    .line 33
    .line 34
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public ᛲᛴᛳᛲ(JJ)J
    .locals 9

    .line 1
    cmp-long v0, p3, p1

    .line 2
    .line 3
    if-lez v0, :cond_4

    .line 4
    .line 5
    sub-long v0, p3, p1

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v4, v0, v2

    .line 10
    .line 11
    if-lez v4, :cond_3

    .line 12
    .line 13
    neg-long p3, v0

    .line 14
    and-long/2addr p3, v0

    .line 15
    cmp-long p3, p3, v0

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    if-nez p3, :cond_2

    .line 19
    .line 20
    long-to-int p3, v0

    .line 21
    const/16 p4, 0x20

    .line 22
    .line 23
    ushr-long/2addr v0, p4

    .line 24
    long-to-int v0, v0

    .line 25
    const-wide v1, 0xffffffffL

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    if-eqz p3, :cond_0

    .line 31
    .line 32
    invoke-static {p3}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    rsub-int/lit8 p3, p3, 0x1f

    .line 37
    .line 38
    invoke-virtual {p0, p3}, Lyyds/ᲇᛸᛴᛷ;->ᛲᲈᲁ(I)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    :goto_0
    int-to-long p3, p0

    .line 43
    and-long/2addr p3, v1

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    if-ne v0, v4, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0}, Lyyds/ᲇᛸᛴᛷ;->ᛵᛸᛸᛷ()I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-static {v0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 53
    .line 54
    .line 55
    move-result p3

    .line 56
    rsub-int/lit8 p3, p3, 0x1f

    .line 57
    .line 58
    invoke-virtual {p0, p3}, Lyyds/ᲇᛸᛴᛷ;->ᛲᲈᲁ(I)I

    .line 59
    .line 60
    .line 61
    move-result p3

    .line 62
    int-to-long v3, p3

    .line 63
    shl-long p3, v3, p4

    .line 64
    .line 65
    invoke-virtual {p0}, Lyyds/ᲇᛸᛴᛷ;->ᛵᛸᛸᛷ()I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    int-to-long v3, p0

    .line 70
    and-long v0, v3, v1

    .line 71
    .line 72
    add-long/2addr p3, v0

    .line 73
    goto :goto_1

    .line 74
    :cond_2
    invoke-virtual {p0}, Lyyds/ᲇᛸᛴᛷ;->ᲇᲈᛵᛷ()J

    .line 75
    .line 76
    .line 77
    move-result-wide p3

    .line 78
    ushr-long/2addr p3, v4

    .line 79
    rem-long v5, p3, v0

    .line 80
    .line 81
    sub-long/2addr p3, v5

    .line 82
    const-wide/16 v7, 0x1

    .line 83
    .line 84
    sub-long v7, v0, v7

    .line 85
    .line 86
    add-long/2addr v7, p3

    .line 87
    cmp-long p3, v7, v2

    .line 88
    .line 89
    if-ltz p3, :cond_2

    .line 90
    .line 91
    move-wide p3, v5

    .line 92
    :goto_1
    add-long/2addr p1, p3

    .line 93
    return-wide p1

    .line 94
    :cond_3
    invoke-virtual {p0}, Lyyds/ᲇᛸᛴᛷ;->ᲇᲈᛵᛷ()J

    .line 95
    .line 96
    .line 97
    move-result-wide v0

    .line 98
    cmp-long v2, p1, v0

    .line 99
    .line 100
    if-gtz v2, :cond_3

    .line 101
    .line 102
    cmp-long v2, v0, p3

    .line 103
    .line 104
    if-gez v2, :cond_3

    .line 105
    .line 106
    return-wide v0

    .line 107
    :cond_4
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    const-string p2, ", "

    .line 116
    .line 117
    const-string p3, ")."

    .line 118
    .line 119
    const-string p4, "Random range is empty: ["

    .line 120
    .line 121
    invoke-static {p4, p0, p2, p1, p3}, Lyyds/ᛷᲈᲈᛶ;->ᛲᛳᛶᲁ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    const-wide/16 p0, 0x0

    .line 125
    .line 126
    return-wide p0
.end method

.method public abstract ᛲᲈᲁ(I)I
.end method

.method public abstract ᛵᛸᛸᛷ()I
.end method

.method public ᲀᛲᛳᲀ(II)I
    .locals 3

    .line 1
    if-le p2, p1, :cond_3

    .line 2
    .line 3
    sub-int v0, p2, p1

    .line 4
    .line 5
    if-gtz v0, :cond_1

    .line 6
    .line 7
    const/high16 v1, -0x80000000

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lyyds/ᲇᛸᛴᛷ;->ᛵᛸᛸᛷ()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-gt p1, v0, :cond_0

    .line 17
    .line 18
    if-ge v0, p2, :cond_0

    .line 19
    .line 20
    return v0

    .line 21
    :cond_1
    :goto_0
    neg-int p2, v0

    .line 22
    and-int/2addr p2, v0

    .line 23
    if-ne p2, v0, :cond_2

    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    rsub-int/lit8 p2, p2, 0x1f

    .line 30
    .line 31
    invoke-virtual {p0, p2}, Lyyds/ᲇᛸᛴᛷ;->ᛲᲈᲁ(I)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    invoke-virtual {p0}, Lyyds/ᲇᛸᛴᛷ;->ᛵᛸᛸᛷ()I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    ushr-int/lit8 p2, p2, 0x1

    .line 41
    .line 42
    rem-int v1, p2, v0

    .line 43
    .line 44
    sub-int/2addr p2, v1

    .line 45
    add-int/lit8 v2, v0, -0x1

    .line 46
    .line 47
    add-int/2addr v2, p2

    .line 48
    if-ltz v2, :cond_2

    .line 49
    .line 50
    move p0, v1

    .line 51
    :goto_1
    add-int/2addr p1, p0

    .line 52
    return p1

    .line 53
    :cond_3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-string p2, ", "

    .line 62
    .line 63
    const-string v0, ")."

    .line 64
    .line 65
    const-string v1, "Random range is empty: ["

    .line 66
    .line 67
    invoke-static {v1, p0, p2, p1, v0}, Lyyds/ᛷᲈᲈᛶ;->ᛲᛳᛶᲁ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    return p0
.end method

.method public abstract ᲇᲈᛵᛷ()J
.end method
