.class public final Lxhss/ᛵᛴᛳᛶ;
.super Lxhss/ᛶᛵᛱ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛷᛴᛷᛱ:Lxhss/ᛵᛴᛳᛶ;

.field public ᛸᛲᲀᛵ:Ljava/util/ArrayList;

.field public ᛸᛴᛶᛳ:Lxhss/ᛷᛴᛱᛱ;

.field public ᲀᲇᛳᲁ:Lxhss/ᛵᛷᛲᛱ;

.field public ᲇᛴᲇᛵ:Lxhss/ᛳᛲᛶᛶ;

.field public ᲇᛶᛴᲀ:Lxhss/ᛸᲈᛴᛸ;


# direct methods
.method public static synthetic ᛵᛷᛲᛸ(Lxhss/ᛵᛴᛳᛶ;Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p2, v0

    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x5

    .line 6
    :cond_0
    const/4 p2, 0x0

    .line 7
    invoke-virtual {p0, p1, v0, p2}, Lxhss/ᛵᛴᛳᛶ;->ᛵᛲᲁᛶ(Ljava/lang/String;IZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final ᛱᲈᛳᛴ(Lxhss/ᛷᛴᛲᛲ;)V
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᛵᛷᛲᛱ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Lxhss/ᛷᛴᛲᛲ;->ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lxhss/ᛵᛴᛳᛶ;->ᲀᲇᛳᲁ:Lxhss/ᛵᛷᛲᛱ;

    .line 10
    .line 11
    return-void
.end method

.method public final varargs ᛴᲀᛸᛵ([Ljava/lang/String;)V
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    array-length v1, p1

    .line 8
    const/4 v2, 0x0

    .line 9
    move v3, v2

    .line 10
    :goto_0
    if-ge v3, v1, :cond_0

    .line 11
    .line 12
    aget-object v4, p1, v3

    .line 13
    .line 14
    new-instance v5, Lxhss/ᛳᛲᛶᛶ;

    .line 15
    .line 16
    const/4 v6, 0x5

    .line 17
    invoke-direct {v5, v4, v6, v2}, Lxhss/ᛳᛲᛶᛶ;-><init>(Ljava/lang/String;IZ)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lxhss/ᛵᛴᛳᛶ;->ᛸᛲᲀᛵ:Ljava/util/ArrayList;

    .line 32
    .line 33
    return-void
.end method

.method public final ᛵᛲᲁᛶ(Ljava/lang/String;IZ)V
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᛳᛲᛶᛶ;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, Lxhss/ᛳᛲᛶᛶ;-><init>(Ljava/lang/String;IZ)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lxhss/ᛵᛴᛳᛶ;->ᲇᛴᲇᛵ:Lxhss/ᛳᛲᛶᛶ;

    .line 7
    .line 8
    return-void
.end method

.method public final ᛸᛴᛸᛲ(Lxhss/ᛷᛴᛲᛲ;)V
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᛷᛴᛱᛱ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Lxhss/ᛷᛴᛲᛲ;->ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lxhss/ᛵᛴᛳᛶ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛴᛱᛱ;

    .line 10
    .line 11
    return-void
.end method

.method public final ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I
    .locals 8

    .line 1
    iget-object v0, p0, Lxhss/ᛵᛴᛳᛶ;->ᲇᛴᲇᛵ:Lxhss/ᛳᛲᛶᛶ;

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
    iget-object v2, p0, Lxhss/ᛵᛴᛳᛶ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛴᛳᛶ;

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
    iget-object v3, p0, Lxhss/ᛵᛴᛳᛶ;->ᲇᛶᛴᲀ:Lxhss/ᛸᲈᛴᛸ;

    .line 23
    .line 24
    if-eqz v3, :cond_2

    .line 25
    .line 26
    invoke-virtual {v3, p1}, Lxhss/ᛸᲈᛴᛸ;->ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I

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
    iget-object v4, p0, Lxhss/ᛵᛴᛳᛶ;->ᲀᲇᛳᲁ:Lxhss/ᛵᛷᛲᛱ;

    .line 33
    .line 34
    if-eqz v4, :cond_3

    .line 35
    .line 36
    invoke-virtual {v4, p1}, Lxhss/ᛵᛷᛲᛱ;->ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I

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
    iget-object v5, p0, Lxhss/ᛵᛴᛳᛶ;->ᛸᛴᛶᛳ:Lxhss/ᛷᛴᛱᛱ;

    .line 43
    .line 44
    if-eqz v5, :cond_4

    .line 45
    .line 46
    invoke-virtual {v5, p1}, Lxhss/ᛷᛴᛱᛱ;->ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    goto :goto_4

    .line 51
    :cond_4
    move v5, v1

    .line 52
    :goto_4
    iget-object p0, p0, Lxhss/ᛵᛴᛳᛶ;->ᛸᛲᲀᛵ:Ljava/util/ArrayList;

    .line 53
    .line 54
    if-eqz p0, :cond_6

    .line 55
    .line 56
    new-instance v6, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-static {p0}, Lxhss/ᛳᛲᲈᲁ;->ᲁᛴᛴᛸ(Ljava/lang/Iterable;)I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_5

    .line 74
    .line 75
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    check-cast v7, Lxhss/ᛳᛲᛶᛶ;

    .line 80
    .line 81
    invoke-virtual {v7, p1}, Lxhss/ᛳᛲᛶᛶ;->ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_5
    invoke-static {v6}, Lxhss/ᛷᲇᛵᛳ;->ᛱᛲᛸᲇ(Ljava/util/ArrayList;)[I

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p1, p0}, Lxhss/ᛱᲁᛴᲈ;->ᲀᲇᛳᲁ([I)I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    goto :goto_6

    .line 102
    :cond_6
    move p0, v1

    .line 103
    :goto_6
    const/16 v6, 0xc

    .line 104
    .line 105
    invoke-virtual {p1, v6}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛶᲈᛶ(I)V

    .line 106
    .line 107
    .line 108
    const/16 v6, 0xb

    .line 109
    .line 110
    invoke-virtual {p1, v6, v1}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 111
    .line 112
    .line 113
    const/16 v6, 0xa

    .line 114
    .line 115
    invoke-virtual {p1, v6, v1}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 116
    .line 117
    .line 118
    const/16 v6, 0x9

    .line 119
    .line 120
    invoke-virtual {p1, v6, v1}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 121
    .line 122
    .line 123
    const/16 v6, 0x8

    .line 124
    .line 125
    invoke-virtual {p1, v6, p0}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 126
    .line 127
    .line 128
    const/4 p0, 0x7

    .line 129
    invoke-virtual {p1, p0, v5}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 130
    .line 131
    .line 132
    const/4 p0, 0x6

    .line 133
    invoke-virtual {p1, p0, v4}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 134
    .line 135
    .line 136
    const/4 p0, 0x5

    .line 137
    invoke-virtual {p1, p0, v1}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 138
    .line 139
    .line 140
    const/4 p0, 0x4

    .line 141
    invoke-virtual {p1, p0, v3}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 142
    .line 143
    .line 144
    const/4 p0, 0x3

    .line 145
    invoke-virtual {p1, p0, v2}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 146
    .line 147
    .line 148
    const/4 p0, 0x2

    .line 149
    invoke-virtual {p1, p0, v1}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 150
    .line 151
    .line 152
    const/4 p0, 0x1

    .line 153
    invoke-virtual {p1, p0, v0}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, v1, v1}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛴᛶᛳ()I

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    invoke-virtual {p1, p0}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛷᲈᲈ(I)V

    .line 164
    .line 165
    .line 166
    return p0
.end method

.method public final ᲁᛷᲇᲇ(Lxhss/ᛷᛴᛲᛲ;)V
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᛵᛴᛳᛶ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Lxhss/ᛷᛴᛲᛲ;->ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lxhss/ᛵᛴᛳᛶ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛴᛳᛶ;

    .line 10
    .line 11
    return-void
.end method
