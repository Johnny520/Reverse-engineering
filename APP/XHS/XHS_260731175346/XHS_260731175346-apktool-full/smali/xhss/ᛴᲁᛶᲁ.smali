.class public final Lxhss/ᛴᲁᛶᲁ;
.super Lxhss/ᛶᛵᛱ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛷᛴᛷᛱ:Lxhss/ᛵᛴᛳᛶ;

.field public ᛸᛴᛶᛳ:Lxhss/ᛷᛴᛱᛱ;

.field public ᲀᲇᛳᲁ:Lxhss/ᛲᛱᲁᛳ;

.field public ᲇᛴᲇᛵ:Lxhss/ᛳᛲᛶᛶ;

.field public ᲇᛶᛴᲀ:Lxhss/ᛵᛴᛳᛶ;


# direct methods
.method public static ᛵᛲᲁᛶ(Lxhss/ᛴᲁᛶᲁ;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lxhss/ᛵᛴᛳᛶ;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x5

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {v0, p1, v1, v2}, Lxhss/ᛵᛴᛳᛶ;->ᛵᛲᲁᛶ(Ljava/lang/String;IZ)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lxhss/ᛴᲁᛶᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛵᛴᛳᛶ;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I
    .locals 6

    .line 1
    iget-object v0, p0, Lxhss/ᛴᲁᛶᲁ;->ᲇᛴᲇᛵ:Lxhss/ᛳᛲᛶᛶ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lxhss/ᛳᛲᛶᛶ;->ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    iget-object v2, p0, Lxhss/ᛴᲁᛶᲁ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛴᛳᛶ;

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-virtual {v2, p1}, Lxhss/ᛵᛴᛳᛶ;->ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move v2, v1

    .line 22
    :goto_1
    iget-object v3, p0, Lxhss/ᛴᲁᛶᲁ;->ᲇᛶᛴᲀ:Lxhss/ᛵᛴᛳᛶ;

    .line 23
    .line 24
    if-eqz v3, :cond_2

    .line 25
    .line 26
    invoke-virtual {v3, p1}, Lxhss/ᛵᛴᛳᛶ;->ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    goto :goto_2

    .line 31
    :cond_2
    move v3, v1

    .line 32
    :goto_2
    iget-object v4, p0, Lxhss/ᛴᲁᛶᲁ;->ᲀᲇᛳᲁ:Lxhss/ᛲᛱᲁᛳ;

    .line 33
    .line 34
    if-eqz v4, :cond_3

    .line 35
    .line 36
    invoke-virtual {v4, p1}, Lxhss/ᛲᛱᲁᛳ;->ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    goto :goto_3

    .line 41
    :cond_3
    move v4, v1

    .line 42
    :goto_3
    iget-object p0, p0, Lxhss/ᛴᲁᛶᲁ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛴᛱᛱ;

    .line 43
    .line 44
    if-eqz p0, :cond_4

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lxhss/ᛷᛴᛱᛱ;->ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    goto :goto_4

    .line 51
    :cond_4
    move p0, v1

    .line 52
    :goto_4
    const/16 v5, 0xa

    .line 53
    .line 54
    invoke-virtual {p1, v5}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛶᲈᛶ(I)V

    .line 55
    .line 56
    .line 57
    const/16 v5, 0x9

    .line 58
    .line 59
    invoke-virtual {p1, v5, v1}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 60
    .line 61
    .line 62
    const/16 v5, 0x8

    .line 63
    .line 64
    invoke-virtual {p1, v5, v1}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 65
    .line 66
    .line 67
    const/4 v5, 0x7

    .line 68
    invoke-virtual {p1, v5, v1}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 69
    .line 70
    .line 71
    const/4 v5, 0x6

    .line 72
    invoke-virtual {p1, v5, v1}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 73
    .line 74
    .line 75
    const/4 v5, 0x5

    .line 76
    invoke-virtual {p1, v5, p0}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 77
    .line 78
    .line 79
    const/4 p0, 0x4

    .line 80
    invoke-virtual {p1, p0, v4}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 81
    .line 82
    .line 83
    const/4 p0, 0x3

    .line 84
    invoke-virtual {p1, p0, v3}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 85
    .line 86
    .line 87
    const/4 p0, 0x2

    .line 88
    invoke-virtual {p1, p0, v2}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 89
    .line 90
    .line 91
    const/4 p0, 0x1

    .line 92
    invoke-virtual {p1, p0, v1}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v1, v0}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛴᛶᛳ()I

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    invoke-virtual {p1, p0}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛷᲈᲈ(I)V

    .line 103
    .line 104
    .line 105
    return p0
.end method
