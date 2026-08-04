.class public final synthetic Lyyds/ᛵᛸᛳᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛷᛴᲈᲀ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lyyds/ᛱᲁᛲᛱ;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛱᛷᛸᲈ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛱᛷᛸᲈ;Lyyds/ᛱᲁᛲᛱ;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᛵᛸᛳᛷ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛵᛸᛳᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛷᛸᲈ;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛵᛸᛳᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛱᲁᛲᛱ;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lyyds/ᛵᛸᛳᛷ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    const/high16 v2, 0x3f000000    # 0.5f

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    const/16 v6, 0x60

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    iget-object v8, p0, Lyyds/ᛵᛸᛳᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛱᲁᛲᛱ;

    .line 14
    .line 15
    iget-object p0, p0, Lyyds/ᛵᛸᛳᛷ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛷᛸᲈ;

    .line 16
    .line 17
    check-cast p1, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    packed-switch v0, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Lyyds/ᛶᲇᛴᛴ;

    .line 28
    .line 29
    iget v0, p0, Lyyds/ᛶᲇᛴᛴ;->ᛵᛸᛸᛷ:I

    .line 30
    .line 31
    iget p0, p0, Lyyds/ᛶᲇᛴᛴ;->ᲇᲈᛵᛷ:I

    .line 32
    .line 33
    sub-int/2addr p0, v0

    .line 34
    invoke-static {p0, v6}, Ljava/lang/Math;->min(II)I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-ge v6, v5, :cond_0

    .line 39
    .line 40
    move v6, v5

    .line 41
    :cond_0
    move v9, v7

    .line 42
    move v10, v9

    .line 43
    :goto_0
    if-ge v9, v6, :cond_2

    .line 44
    .line 45
    int-to-float v11, v9

    .line 46
    add-float/2addr v11, v2

    .line 47
    int-to-float v12, p0

    .line 48
    mul-float/2addr v11, v12

    .line 49
    int-to-float v12, v6

    .line 50
    div-float/2addr v11, v12

    .line 51
    float-to-int v11, v11

    .line 52
    add-int/lit8 v12, p0, -0x1

    .line 53
    .line 54
    invoke-static {v11, v7, v12}, Lyyds/ᛳᛵᲀ;->ᲀᛲᛳᲀ(III)I

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    add-int/2addr v11, v0

    .line 59
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v11

    .line 63
    invoke-virtual {v8, p1, v11}, Lyyds/ᛱᲁᛲᛱ;->ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    check-cast v11, Ljava/lang/Number;

    .line 68
    .line 69
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result v11

    .line 73
    ushr-int/lit8 v12, v11, 0x10

    .line 74
    .line 75
    and-int/lit16 v12, v12, 0xff

    .line 76
    .line 77
    ushr-int/lit8 v13, v11, 0x8

    .line 78
    .line 79
    and-int/lit16 v13, v13, 0xff

    .line 80
    .line 81
    and-int/lit16 v11, v11, 0xff

    .line 82
    .line 83
    mul-int/lit8 v12, v12, 0x36

    .line 84
    .line 85
    mul-int/lit16 v13, v13, 0xb7

    .line 86
    .line 87
    add-int/2addr v13, v12

    .line 88
    mul-int/lit8 v11, v11, 0x13

    .line 89
    .line 90
    add-int/2addr v11, v13

    .line 91
    ushr-int/lit8 v11, v11, 0x8

    .line 92
    .line 93
    if-gt v11, v1, :cond_1

    .line 94
    .line 95
    add-int/lit8 v10, v10, 0x1

    .line 96
    .line 97
    :cond_1
    int-to-long v11, v11

    .line 98
    add-long/2addr v3, v11

    .line 99
    add-int/lit8 v9, v9, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    new-instance p0, Lyyds/ᲈᲀᛵᛳ;

    .line 103
    .line 104
    int-to-float p1, v10

    .line 105
    int-to-float v0, v6

    .line 106
    div-float/2addr p1, v0

    .line 107
    long-to-float v1, v3

    .line 108
    div-float/2addr v1, v0

    .line 109
    invoke-direct {p0, p1, v1}, Lyyds/ᲈᲀᛵᛳ;-><init>(FF)V

    .line 110
    .line 111
    .line 112
    return-object p0

    .line 113
    :pswitch_0
    iget-object p0, p0, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p0, Lyyds/ᛶᲇᛴᛴ;

    .line 116
    .line 117
    iget v0, p0, Lyyds/ᛶᲇᛴᛴ;->ᛲᲈᲁ:I

    .line 118
    .line 119
    iget p0, p0, Lyyds/ᛶᲇᛴᛴ;->ᲀᛲᛳᲀ:I

    .line 120
    .line 121
    sub-int/2addr p0, v0

    .line 122
    invoke-static {p0, v6}, Ljava/lang/Math;->min(II)I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-ge v6, v5, :cond_3

    .line 127
    .line 128
    move v6, v5

    .line 129
    :cond_3
    move v9, v7

    .line 130
    move v10, v9

    .line 131
    :goto_1
    if-ge v9, v6, :cond_5

    .line 132
    .line 133
    int-to-float v11, v9

    .line 134
    add-float/2addr v11, v2

    .line 135
    int-to-float v12, p0

    .line 136
    mul-float/2addr v11, v12

    .line 137
    int-to-float v12, v6

    .line 138
    div-float/2addr v11, v12

    .line 139
    float-to-int v11, v11

    .line 140
    add-int/lit8 v12, p0, -0x1

    .line 141
    .line 142
    invoke-static {v11, v7, v12}, Lyyds/ᛳᛵᲀ;->ᲀᛲᛳᲀ(III)I

    .line 143
    .line 144
    .line 145
    move-result v11

    .line 146
    add-int/2addr v11, v0

    .line 147
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object v11

    .line 151
    invoke-virtual {v8, v11, p1}, Lyyds/ᛱᲁᛲᛱ;->ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v11

    .line 155
    check-cast v11, Ljava/lang/Number;

    .line 156
    .line 157
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    ushr-int/lit8 v12, v11, 0x10

    .line 162
    .line 163
    and-int/lit16 v12, v12, 0xff

    .line 164
    .line 165
    ushr-int/lit8 v13, v11, 0x8

    .line 166
    .line 167
    and-int/lit16 v13, v13, 0xff

    .line 168
    .line 169
    and-int/lit16 v11, v11, 0xff

    .line 170
    .line 171
    mul-int/lit8 v12, v12, 0x36

    .line 172
    .line 173
    mul-int/lit16 v13, v13, 0xb7

    .line 174
    .line 175
    add-int/2addr v13, v12

    .line 176
    mul-int/lit8 v11, v11, 0x13

    .line 177
    .line 178
    add-int/2addr v11, v13

    .line 179
    ushr-int/lit8 v11, v11, 0x8

    .line 180
    .line 181
    if-gt v11, v1, :cond_4

    .line 182
    .line 183
    add-int/lit8 v10, v10, 0x1

    .line 184
    .line 185
    :cond_4
    int-to-long v11, v11

    .line 186
    add-long/2addr v3, v11

    .line 187
    add-int/lit8 v9, v9, 0x1

    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_5
    new-instance p0, Lyyds/ᲈᲀᛵᛳ;

    .line 191
    .line 192
    int-to-float p1, v10

    .line 193
    int-to-float v0, v6

    .line 194
    div-float/2addr p1, v0

    .line 195
    long-to-float v1, v3

    .line 196
    div-float/2addr v1, v0

    .line 197
    invoke-direct {p0, p1, v1}, Lyyds/ᲈᲀᛵᛳ;-><init>(FF)V

    .line 198
    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
