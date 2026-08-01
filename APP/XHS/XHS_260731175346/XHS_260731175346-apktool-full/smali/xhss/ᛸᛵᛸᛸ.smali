.class public final Lxhss/ᛸᛵᛸᛸ;
.super Lxhss/ᲈᛷᲇᛳ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᲀᲇᛳᲁ:Lxhss/ᲀᛶᛶᲀ;


# instance fields
.field public final ᲇᛶᛴᲀ:Lxhss/ᛵᛶᛳ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lxhss/ᛸᛵᛸᛸ;

    .line 2
    .line 3
    invoke-static {v0}, Lxhss/ᲁᲇᛴᲀ;->ᛱᛱᛲᲇ(Ljava/lang/Class;)Lxhss/ᲀᛶᛶᲀ;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lxhss/ᛸᛵᛸᛸ;->ᲀᲇᛳᲁ:Lxhss/ᲀᛶᛶᲀ;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lxhss/ᛵᛶᛳ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lxhss/ᛳᛳᛵᛱ;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛸᛵᛸᛸ;->ᲇᛶᛴᲀ:Lxhss/ᛵᛶᛳ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛸᛵᛸᛸ;->ᲇᛶᛴᲀ:Lxhss/ᛵᛶᛳ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lxhss/ᛵᛶᛳ;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ᛷᛵᛵᲈ(Ljava/lang/String;Lxhss/ᛴᛴᛴᛷ;Ljava/lang/Object;Lxhss/ᛵᲈᛷ;)V
    .locals 6

    .line 1
    iget-object p2, p4, Lxhss/ᛵᲈᛷ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛲᲇ;

    .line 2
    .line 3
    iget-object v0, p0, Lxhss/ᛸᛵᛸᛸ;->ᲇᛶᛴᲀ:Lxhss/ᛵᛶᛳ;

    .line 4
    .line 5
    iget-object v1, v0, Lxhss/ᛵᛶᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/Integer;

    .line 8
    .line 9
    iget-object v2, v0, Lxhss/ᛵᛶᛳ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p3, p4}, Lxhss/ᲈᛷᲇᛳ;->ᛸᛷᲈᲈ(Ljava/lang/String;Ljava/lang/Object;Lxhss/ᛵᲈᛷ;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    goto/16 :goto_3

    .line 20
    .line 21
    :cond_0
    iget v0, v0, Lxhss/ᛵᛶᛳ;->ᛱᛱᛲᲇ:I

    .line 22
    .line 23
    invoke-static {v0}, Lxhss/ᛴᛸᛲᛳ;->ᲀᛷᲁᲀ(I)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v3, 0x0

    .line 28
    sget-object v4, Lxhss/ᛸᛵᛸᛸ;->ᲀᲇᛳᲁ:Lxhss/ᲀᛶᛶᲀ;

    .line 29
    .line 30
    if-eqz v0, :cond_6

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    if-eq v0, v5, :cond_3

    .line 34
    .line 35
    const/4 v3, 0x2

    .line 36
    if-eq v0, v3, :cond_1

    .line 37
    .line 38
    goto/16 :goto_3

    .line 39
    .line 40
    :cond_1
    iget-object p2, p2, Lxhss/ᲀᛲᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 41
    .line 42
    invoke-virtual {p2, p3}, Lxhss/ᲇᛵᛲᲁ;->ᲇᛸᛳᲁ(Ljava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-ge v0, v1, :cond_9

    .line 59
    .line 60
    if-nez p2, :cond_2

    .line 61
    .line 62
    goto/16 :goto_3

    .line 63
    .line 64
    :cond_2
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {p0}, Lxhss/ᛳᛳᛵᛱ;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    filled-new-array {p2, v2, v3, v5}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    const-string v2, "Slice between indexes on array with length: {}. From index: {} to: {}. Input: {}"

    .line 81
    .line 82
    invoke-interface {v4, v2, p2}, Lxhss/ᲀᛶᛶᲀ;->ᛱᛱᛲᲇ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :goto_0
    if-ge v0, v1, :cond_9

    .line 86
    .line 87
    invoke-virtual {p0, v0, p1, p3, p4}, Lxhss/ᛳᛳᛵᛱ;->ᛳᲁᲇᛸ(ILjava/lang/String;Ljava/lang/Object;Lxhss/ᛵᲈᛷ;)V

    .line 88
    .line 89
    .line 90
    add-int/lit8 v0, v0, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    iget-object p2, p2, Lxhss/ᲀᛲᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 94
    .line 95
    invoke-virtual {p2, p3}, Lxhss/ᲇᛵᛲᲁ;->ᲇᛸᛳᲁ(Ljava/lang/Object;)I

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-nez p2, :cond_4

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-gez v0, :cond_5

    .line 107
    .line 108
    add-int/2addr v0, p2

    .line 109
    :cond_5
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {p0}, Lxhss/ᛳᛳᛵᛱ;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    filled-new-array {p2, v1, v2}, [Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    const-string v1, "Slice to index on array with length: {}. From index: 0 to: {}. Input: {}"

    .line 130
    .line 131
    invoke-interface {v4, v1, p2}, Lxhss/ᲀᛶᛶᲀ;->ᛱᛱᛲᲇ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    :goto_1
    if-ge v3, v0, :cond_9

    .line 135
    .line 136
    invoke-virtual {p0, v3, p1, p3, p4}, Lxhss/ᛳᛳᛵᛱ;->ᛳᲁᲇᛸ(ILjava/lang/String;Ljava/lang/Object;Lxhss/ᛵᲈᛷ;)V

    .line 137
    .line 138
    .line 139
    add-int/lit8 v3, v3, 0x1

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_6
    iget-object p2, p2, Lxhss/ᲀᛲᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 143
    .line 144
    invoke-virtual {p2, p3}, Lxhss/ᲇᛵᛲᲁ;->ᲇᛸᛳᲁ(Ljava/lang/Object;)I

    .line 145
    .line 146
    .line 147
    move-result p2

    .line 148
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-gez v0, :cond_7

    .line 153
    .line 154
    add-int/2addr v0, p2

    .line 155
    :cond_7
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    add-int/lit8 v3, p2, -0x1

    .line 168
    .line 169
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-virtual {p0}, Lxhss/ᛳᛳᛵᛱ;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    filled-new-array {v1, v2, v3, v5}, [Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    const-string v2, "Slice from index on array with length: {}. From index: {} to: {}. Input: {}"

    .line 182
    .line 183
    invoke-interface {v4, v2, v1}, Lxhss/ᲀᛶᛶᲀ;->ᛱᛱᛲᲇ(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    if-eqz p2, :cond_9

    .line 187
    .line 188
    if-lt v0, p2, :cond_8

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_8
    :goto_2
    if-ge v0, p2, :cond_9

    .line 192
    .line 193
    invoke-virtual {p0, v0, p1, p3, p4}, Lxhss/ᛳᛳᛵᛱ;->ᛳᲁᲇᛸ(ILjava/lang/String;Ljava/lang/Object;Lxhss/ᛵᲈᛷ;)V

    .line 194
    .line 195
    .line 196
    add-int/lit8 v0, v0, 0x1

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_9
    :goto_3
    return-void
.end method

.method public final ᲀᲇᛳᲁ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
