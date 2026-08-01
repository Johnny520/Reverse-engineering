.class public final Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;
.super Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子世兰哲楪苏:I

.field public 飘花落叶言子世兰楪哲苏:I

.field public 飘花落叶言子世兰楪苏哲:I

.field public 飘花落叶言子世兰苏哲楪:I

.field public 飘花落叶言子世兰苏楪哲:I

.field public final 飘花落叶言子世哲兰楪苏:I

.field public final 飘花落叶言子世哲兰苏楪:I

.field public final 飘花落叶言子世哲苏兰楪:[C

.field public final 飘花落叶言子世哲苏楪兰:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 2
    .line 3
    return-void
.end method

.method public constructor <init>(ILcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;[B)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p2, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;Z)V

    .line 3
    .line 4
    .line 5
    const/4 p2, -0x1

    .line 6
    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰哲楪苏:I

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    iput-object p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏楪兰:Ljava/lang/String;

    .line 10
    .line 11
    div-int/lit8 p2, p1, 0x2

    .line 12
    .line 13
    new-array p2, p2, [C

    .line 14
    .line 15
    iput-object p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 16
    .line 17
    move p2, v0

    .line 18
    :goto_0
    if-ge v0, p1, :cond_0

    .line 19
    .line 20
    aget-byte v1, p3, v0

    .line 21
    .line 22
    add-int/lit8 v2, v0, 0x1

    .line 23
    .line 24
    aget-byte v2, p3, v2

    .line 25
    .line 26
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 27
    .line 28
    and-int/lit16 v2, v2, 0xff

    .line 29
    .line 30
    and-int/lit16 v1, v1, 0xff

    .line 31
    .line 32
    shl-int/lit8 v1, v1, 0x8

    .line 33
    .line 34
    or-int/2addr v1, v2

    .line 35
    int-to-char v1, v1

    .line 36
    aput-char v1, v3, p2

    .line 37
    .line 38
    add-int/lit8 v0, v0, 0x2

    .line 39
    .line 40
    add-int/lit8 p2, p2, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰楪苏:I

    .line 44
    .line 45
    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 46
    .line 47
    iget p3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 48
    .line 49
    const/16 v0, 0x1a

    .line 50
    .line 51
    if-lt p3, p2, :cond_1

    .line 52
    .line 53
    iput-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    iget-object p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 57
    .line 58
    aget-char p2, p2, p3

    .line 59
    .line 60
    iput-char p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 61
    .line 62
    :goto_1
    iget-char p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 63
    .line 64
    const-wide/16 v1, 0x0

    .line 65
    .line 66
    const-wide v3, 0x100003700L

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    const-wide/16 v5, 0x1

    .line 72
    .line 73
    const/16 p3, 0x20

    .line 74
    .line 75
    if-gt p2, p3, :cond_3

    .line 76
    .line 77
    shl-long v7, v5, p2

    .line 78
    .line 79
    and-long/2addr v7, v3

    .line 80
    cmp-long p2, v7, v1

    .line 81
    .line 82
    if-eqz p2, :cond_3

    .line 83
    .line 84
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 85
    .line 86
    add-int/lit8 p2, p2, 0x1

    .line 87
    .line 88
    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 89
    .line 90
    if-lt p2, p1, :cond_2

    .line 91
    .line 92
    iput-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 93
    .line 94
    return-void

    .line 95
    :cond_2
    iget-object p3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 96
    .line 97
    aget-char p2, p3, p2

    .line 98
    .line 99
    iput-char p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    :goto_2
    iget-char p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 103
    .line 104
    if-gt p2, p3, :cond_5

    .line 105
    .line 106
    shl-long v7, v5, p2

    .line 107
    .line 108
    and-long/2addr v7, v3

    .line 109
    cmp-long v7, v7, v1

    .line 110
    .line 111
    if-eqz v7, :cond_5

    .line 112
    .line 113
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 114
    .line 115
    add-int/lit8 p2, p2, 0x1

    .line 116
    .line 117
    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 118
    .line 119
    if-lt p2, p1, :cond_4

    .line 120
    .line 121
    iput-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 122
    .line 123
    return-void

    .line 124
    :cond_4
    iget-object v7, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 125
    .line 126
    aget-char p2, v7, p2

    .line 127
    .line 128
    iput-char p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_5
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 132
    .line 133
    add-int/lit8 p1, p1, 0x1

    .line 134
    .line 135
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 136
    .line 137
    const p1, 0xfffe

    .line 138
    .line 139
    .line 140
    if-eq p2, p1, :cond_6

    .line 141
    .line 142
    const p1, 0xfeff

    .line 143
    .line 144
    .line 145
    if-ne p2, p1, :cond_7

    .line 146
    .line 147
    :cond_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 148
    .line 149
    .line 150
    :cond_7
    iget-char p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 151
    .line 152
    const/16 p2, 0x2f

    .line 153
    .line 154
    if-ne p1, p2, :cond_8

    .line 155
    .line 156
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏世子兰哲()V

    .line 157
    .line 158
    .line 159
    :cond_8
    return-void
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;Ljava/lang/String;[CI)V
    .locals 4

    const/4 v0, 0x0

    .line 160
    invoke-direct {p0, p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;Z)V

    const/4 p1, -0x1

    .line 161
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰哲楪苏:I

    .line 162
    iput-object p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏楪兰:Ljava/lang/String;

    .line 163
    iput-object p3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 164
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 165
    iput p4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰楪苏:I

    .line 166
    iput p4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    const/16 p1, 0x1a

    if-gtz p4, :cond_0

    .line 167
    iput-char p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    return-void

    .line 168
    :cond_0
    aget-char p2, p3, v0

    iput-char p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 169
    :goto_0
    iget-char p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    const/16 v0, 0x20

    if-gt p2, v0, :cond_2

    const-wide/16 v0, 0x1

    shl-long/2addr v0, p2

    const-wide v2, 0x100003700L

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    .line 170
    iget p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    if-lt p2, p4, :cond_1

    .line 171
    iput-char p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    return-void

    .line 172
    :cond_1
    aget-char p2, p3, p2

    iput-char p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    goto :goto_0

    .line 173
    :cond_2
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    const p1, 0xfffe

    if-eq p2, p1, :cond_3

    const p1, 0xfeff

    if-ne p2, p1, :cond_4

    .line 174
    :cond_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 175
    :cond_4
    iget-char p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    const/16 p2, 0x2f

    if-ne p1, p2, :cond_5

    .line 176
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏世子兰哲()V

    :cond_5
    return-void
.end method

.method public static 飘花落叶言楪苏兰子世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;[CII)I
    .locals 12

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏兰世哲(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 10
    .line 11
    return p0

    .line 12
    :cond_0
    :goto_0
    add-int/lit8 v1, p2, 0x1

    .line 13
    .line 14
    aget-char v2, p1, p2

    .line 15
    .line 16
    const/16 v3, 0x5c

    .line 17
    .line 18
    if-ne v2, v3, :cond_3

    .line 19
    .line 20
    aget-char p2, p1, v1

    .line 21
    .line 22
    const/16 v2, 0x75

    .line 23
    .line 24
    if-ne p2, v2, :cond_1

    .line 25
    .line 26
    const/4 p2, 0x5

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/16 v2, 0x78

    .line 29
    .line 30
    if-ne p2, v2, :cond_2

    .line 31
    .line 32
    const/4 p2, 0x3

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    const/4 p2, 0x1

    .line 35
    :goto_1
    add-int/2addr p2, v1

    .line 36
    goto :goto_0

    .line 37
    :cond_3
    if-ne v2, v0, :cond_b

    .line 38
    .line 39
    const/16 v0, 0x1a

    .line 40
    .line 41
    if-ne v1, p3, :cond_4

    .line 42
    .line 43
    move p2, v1

    .line 44
    :goto_2
    move v1, v0

    .line 45
    goto :goto_3

    .line 46
    :cond_4
    add-int/lit8 p2, p2, 0x2

    .line 47
    .line 48
    aget-char v1, p1, v1

    .line 49
    .line 50
    :goto_3
    const-wide/16 v2, 0x0

    .line 51
    .line 52
    const-wide v4, 0x100003700L

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    const-wide/16 v6, 0x1

    .line 58
    .line 59
    const/16 v8, 0x20

    .line 60
    .line 61
    if-gt v1, v8, :cond_6

    .line 62
    .line 63
    shl-long v9, v6, v1

    .line 64
    .line 65
    and-long/2addr v9, v4

    .line 66
    cmp-long v9, v9, v2

    .line 67
    .line 68
    if-eqz v9, :cond_6

    .line 69
    .line 70
    if-ne p2, p3, :cond_5

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_5
    add-int/lit8 v1, p2, 0x1

    .line 74
    .line 75
    aget-char p2, p1, p2

    .line 76
    .line 77
    move v11, v1

    .line 78
    move v1, p2

    .line 79
    move p2, v11

    .line 80
    goto :goto_3

    .line 81
    :cond_6
    const/16 v9, 0x3a

    .line 82
    .line 83
    if-ne v1, v9, :cond_a

    .line 84
    .line 85
    if-ne p2, p3, :cond_7

    .line 86
    .line 87
    move v1, p2

    .line 88
    :goto_4
    move p2, v0

    .line 89
    goto :goto_5

    .line 90
    :cond_7
    add-int/lit8 v1, p2, 0x1

    .line 91
    .line 92
    aget-char p2, p1, p2

    .line 93
    .line 94
    :goto_5
    if-gt p2, v8, :cond_9

    .line 95
    .line 96
    shl-long v9, v6, p2

    .line 97
    .line 98
    and-long/2addr v9, v4

    .line 99
    cmp-long v9, v9, v2

    .line 100
    .line 101
    if-eqz v9, :cond_9

    .line 102
    .line 103
    if-ne v1, p3, :cond_8

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_8
    add-int/lit8 p2, v1, 0x1

    .line 107
    .line 108
    aget-char v1, p1, v1

    .line 109
    .line 110
    move v11, v1

    .line 111
    move v1, p2

    .line 112
    move p2, v11

    .line 113
    goto :goto_5

    .line 114
    :cond_9
    iput-char p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 115
    .line 116
    return v1

    .line 117
    :cond_a
    new-instance p0, Lcom/alibaba/fastjson2/JSONException;

    .line 118
    .line 119
    int-to-char p1, v1

    .line 120
    new-instance p2, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    const-string p3, "syntax error, expect \',\', but \'"

    .line 123
    .line 124
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string p1, "\'"

    .line 131
    .line 132
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw p0

    .line 143
    :cond_b
    move p2, v1

    .line 144
    goto/16 :goto_0
.end method

.method public static 飘花落叶言楪苏兰子哲世(Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;[CII)I
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    .line 1
    iget-char v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v5, 0x22

    const/16 v19, 0x0

    if-eq v4, v5, :cond_62

    const/16 v7, 0x27

    if-eq v4, v7, :cond_62

    const/16 v5, 0x65

    const/16 v7, 0x74

    const/16 v10, 0x53

    if-eq v4, v10, :cond_5d

    const-wide/16 v20, 0x1

    const/16 v13, 0x5b

    if-eq v4, v13, :cond_5c

    const/16 v13, 0x66

    if-eq v4, v13, :cond_50

    const/16 v13, 0x6e

    if-eq v4, v13, :cond_44

    if-eq v4, v7, :cond_38

    const/16 v7, 0x7b

    if-eq v4, v7, :cond_2a

    const/16 v7, 0x2b

    const/16 v13, 0x2d

    if-eq v4, v13, :cond_0

    if-ne v4, v7, :cond_1

    :cond_0
    if-ge v2, v3, :cond_29

    add-int/lit8 v4, v2, 0x1

    .line 2
    aget-char v2, v1, v2

    move/from16 v26, v4

    move v4, v2

    move/from16 v2, v26

    :cond_1
    const/16 v14, 0x2e

    const-wide v22, 0x100003700L

    const/16 v15, 0x39

    const/16 v11, 0x30

    if-ne v4, v14, :cond_2

    goto :goto_1

    :cond_2
    if-lt v4, v11, :cond_6

    if-gt v4, v15, :cond_6

    :cond_3
    if-ne v2, v3, :cond_4

    const/16 v4, 0x1a

    goto :goto_0

    :cond_4
    add-int/lit8 v4, v2, 0x1

    .line 3
    aget-char v2, v1, v2

    move/from16 v26, v4

    move v4, v2

    move/from16 v2, v26

    :goto_0
    if-lt v4, v11, :cond_5

    if-le v4, v15, :cond_3

    :cond_5
    const/16 v24, 0x1

    goto :goto_2

    :cond_6
    :goto_1
    move/from16 v24, v19

    :goto_2
    const/16 v9, 0x44

    const/16 v8, 0x46

    if-eqz v24, :cond_d

    const/16 v6, 0x4c

    if-ne v4, v6, :cond_7

    const/4 v6, 0x1

    goto :goto_3

    :cond_7
    move/from16 v6, v19

    :goto_3
    if-ne v4, v8, :cond_8

    const/16 v25, 0x1

    goto :goto_4

    :cond_8
    move/from16 v25, v19

    :goto_4
    or-int v6, v6, v25

    if-ne v4, v9, :cond_9

    const/16 v25, 0x1

    goto :goto_5

    :cond_9
    move/from16 v25, v19

    :goto_5
    or-int v6, v6, v25

    const/16 v12, 0x42

    if-ne v4, v12, :cond_a

    const/4 v12, 0x1

    goto :goto_6

    :cond_a
    move/from16 v12, v19

    :goto_6
    or-int/2addr v6, v12

    if-ne v4, v10, :cond_b

    const/4 v10, 0x1

    goto :goto_7

    :cond_b
    move/from16 v10, v19

    :goto_7
    or-int/2addr v6, v10

    if-eqz v6, :cond_d

    add-int/lit8 v4, v2, 0x1

    .line 4
    aget-char v2, v1, v2

    :cond_c
    :goto_8
    const/16 v5, 0x20

    goto/16 :goto_15

    :cond_d
    if-ne v4, v14, :cond_11

    if-ne v2, v3, :cond_e

    :goto_9
    const/16 v4, 0x1a

    goto :goto_b

    :cond_e
    add-int/lit8 v4, v2, 0x1

    .line 5
    aget-char v2, v1, v2

    :goto_a
    move/from16 v26, v4

    move v4, v2

    move/from16 v2, v26

    :goto_b
    if-lt v4, v11, :cond_10

    if-gt v4, v15, :cond_10

    if-ne v2, v3, :cond_f

    goto :goto_9

    :cond_f
    add-int/lit8 v4, v2, 0x1

    .line 6
    aget-char v2, v1, v2

    goto :goto_a

    :cond_10
    const/4 v6, 0x1

    goto :goto_c

    :cond_11
    move/from16 v6, v19

    :goto_c
    if-nez v24, :cond_13

    if-eqz v6, :cond_12

    goto :goto_d

    .line 7
    :cond_12
    invoke-static {v2, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰楪苏世(II)Lcom/alibaba/fastjson2/JSONException;

    move-result-object v0

    throw v0

    :cond_13
    :goto_d
    if-eq v4, v5, :cond_15

    const/16 v5, 0x45

    if-ne v4, v5, :cond_14

    goto :goto_e

    :cond_14
    move/from16 v26, v4

    move v4, v2

    move/from16 v2, v26

    goto :goto_12

    :cond_15
    :goto_e
    add-int/lit8 v4, v2, 0x1

    .line 8
    aget-char v5, v1, v2

    if-eq v5, v7, :cond_17

    if-ne v5, v13, :cond_16

    goto :goto_f

    :cond_16
    move/from16 v2, v19

    goto :goto_10

    :cond_17
    :goto_f
    if-ge v4, v3, :cond_28

    add-int/lit8 v2, v2, 0x2

    .line 9
    aget-char v5, v1, v4

    move v4, v2

    const/4 v2, 0x1

    :goto_10
    if-lt v5, v11, :cond_1a

    if-gt v5, v15, :cond_1a

    :cond_18
    if-ne v4, v3, :cond_19

    const/16 v2, 0x1a

    goto :goto_11

    :cond_19
    add-int/lit8 v2, v4, 0x1

    .line 10
    aget-char v4, v1, v4

    move/from16 v26, v4

    move v4, v2

    move/from16 v2, v26

    :goto_11
    if-lt v2, v11, :cond_1b

    if-le v2, v15, :cond_18

    goto :goto_12

    :cond_1a
    if-nez v2, :cond_27

    move v2, v5

    :cond_1b
    :goto_12
    if-eq v2, v8, :cond_1c

    if-ne v2, v9, :cond_c

    :cond_1c
    if-ne v4, v3, :cond_1d

    :goto_13
    const/16 v2, 0x1a

    goto :goto_8

    :cond_1d
    add-int/lit8 v2, v4, 0x1

    .line 11
    aget-char v4, v1, v4

    :goto_14
    move/from16 v26, v4

    move v4, v2

    move/from16 v2, v26

    goto :goto_8

    :goto_15
    if-gt v2, v5, :cond_1f

    shl-long v5, v20, v2

    and-long v5, v5, v22

    cmp-long v5, v5, v16

    if-eqz v5, :cond_1f

    if-ne v4, v3, :cond_1e

    goto :goto_13

    :cond_1e
    add-int/lit8 v2, v4, 0x1

    .line 12
    aget-char v4, v1, v4

    goto :goto_14

    :cond_1f
    const/16 v5, 0x2c

    if-ne v2, v5, :cond_24

    if-ne v4, v3, :cond_20

    :goto_16
    const/16 v2, 0x1a

    goto :goto_18

    :cond_20
    add-int/lit8 v2, v4, 0x1

    .line 13
    aget-char v4, v1, v4

    :goto_17
    move/from16 v26, v4

    move v4, v2

    move/from16 v2, v26

    :goto_18
    const/16 v5, 0x20

    if-gt v2, v5, :cond_22

    shl-long v5, v20, v2

    and-long v5, v5, v22

    cmp-long v5, v5, v16

    if-eqz v5, :cond_22

    if-ne v4, v3, :cond_21

    goto :goto_16

    :cond_21
    add-int/lit8 v2, v4, 0x1

    .line 14
    aget-char v4, v1, v4

    goto :goto_17

    :cond_22
    const/16 v1, 0x7d

    if-eq v2, v1, :cond_23

    const/16 v3, 0x5d

    if-eq v2, v3, :cond_23

    const/16 v5, 0x1a

    if-eq v2, v5, :cond_23

    const/4 v7, 0x1

    goto :goto_1a

    .line 15
    :cond_23
    invoke-static {v4, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲(II)V

    throw v18

    :cond_24
    const/16 v1, 0x7d

    const/16 v3, 0x5d

    const/16 v5, 0x1a

    if-eq v2, v1, :cond_26

    if-eq v2, v3, :cond_26

    if-ne v2, v5, :cond_25

    goto :goto_19

    .line 16
    :cond_25
    invoke-static {v4, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲(II)V

    throw v18

    :cond_26
    :goto_19
    move/from16 v7, v19

    .line 17
    :goto_1a
    iput-boolean v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    int-to-char v1, v2

    .line 18
    iput-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    return v4

    .line 19
    :cond_27
    invoke-static {v4, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰楪苏世(II)Lcom/alibaba/fastjson2/JSONException;

    move-result-object v0

    throw v0

    .line 20
    :cond_28
    invoke-static {v4, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰楪苏世(II)Lcom/alibaba/fastjson2/JSONException;

    move-result-object v0

    throw v0

    .line 21
    :cond_29
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏世兰()V

    throw v18

    :cond_2a
    const-wide v22, 0x100003700L

    .line 22
    invoke-static/range {p0 .. p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏哲世兰子(Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;[CII)I

    move-result v2

    move/from16 v4, v19

    .line 23
    :goto_1b
    iget-char v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    const/16 v6, 0x7d

    if-ne v5, v6, :cond_35

    if-ne v2, v3, :cond_2b

    :goto_1c
    const/16 v4, 0x1a

    goto :goto_1e

    :cond_2b
    add-int/lit8 v4, v2, 0x1

    .line 24
    aget-char v2, v1, v2

    :goto_1d
    move/from16 v26, v4

    move v4, v2

    move/from16 v2, v26

    :goto_1e
    const/16 v5, 0x20

    if-gt v4, v5, :cond_2d

    shl-long v5, v20, v4

    and-long v5, v5, v22

    cmp-long v5, v5, v16

    if-eqz v5, :cond_2d

    if-ne v2, v3, :cond_2c

    goto :goto_1c

    :cond_2c
    add-int/lit8 v4, v2, 0x1

    .line 25
    aget-char v2, v1, v2

    goto :goto_1d

    :cond_2d
    const/16 v5, 0x2c

    if-ne v4, v5, :cond_32

    if-ne v2, v3, :cond_2e

    :goto_1f
    const/16 v4, 0x1a

    goto :goto_21

    :cond_2e
    add-int/lit8 v4, v2, 0x1

    .line 26
    aget-char v2, v1, v2

    :goto_20
    move/from16 v26, v4

    move v4, v2

    move/from16 v2, v26

    :goto_21
    const/16 v5, 0x20

    if-gt v4, v5, :cond_30

    shl-long v5, v20, v4

    and-long v5, v5, v22

    cmp-long v5, v5, v16

    if-eqz v5, :cond_30

    if-ne v2, v3, :cond_2f

    goto :goto_1f

    :cond_2f
    add-int/lit8 v4, v2, 0x1

    .line 27
    aget-char v2, v1, v2

    goto :goto_20

    :cond_30
    const/16 v1, 0x7d

    if-eq v4, v1, :cond_31

    const/16 v3, 0x5d

    if-eq v4, v3, :cond_31

    const/16 v5, 0x1a

    if-eq v4, v5, :cond_31

    const/4 v7, 0x1

    goto :goto_23

    .line 28
    :cond_31
    invoke-static {v2, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲(II)V

    throw v18

    :cond_32
    const/16 v1, 0x7d

    const/16 v3, 0x5d

    const/16 v5, 0x1a

    if-eq v4, v1, :cond_34

    if-eq v4, v3, :cond_34

    if-ne v4, v5, :cond_33

    goto :goto_22

    .line 29
    :cond_33
    invoke-static {v2, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲(II)V

    throw v18

    :cond_34
    :goto_22
    move/from16 v7, v19

    .line 30
    :goto_23
    iput-boolean v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    int-to-char v1, v4

    .line 31
    iput-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    return v2

    :cond_35
    if-eqz v4, :cond_37

    .line 32
    iget-boolean v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    if-eqz v5, :cond_36

    goto :goto_24

    .line 33
    :cond_36
    const-string v1, "illegal value"

    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 34
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    return v19

    .line 35
    :cond_37
    :goto_24
    invoke-static {v0, v1, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏兰子世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;[CII)I

    move-result v2

    .line 36
    invoke-static {v0, v1, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏兰子哲世(Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;[CII)I

    move-result v2

    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1b

    :cond_38
    const-wide v22, 0x100003700L

    add-int/lit8 v4, v2, 0x3

    if-gt v4, v3, :cond_43

    add-int/lit8 v5, v2, -0x1

    .line 37
    invoke-static {v5, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世兰楪哲苏(I[C)Z

    move-result v5

    if-nez v5, :cond_43

    if-ne v4, v3, :cond_39

    :goto_25
    const/16 v2, 0x1a

    goto :goto_27

    :cond_39
    add-int/lit8 v2, v2, 0x4

    .line 38
    aget-char v4, v1, v4

    :goto_26
    move/from16 v26, v4

    move v4, v2

    move/from16 v2, v26

    :goto_27
    const/16 v5, 0x20

    if-gt v2, v5, :cond_3b

    shl-long v5, v20, v2

    and-long v5, v5, v22

    cmp-long v5, v5, v16

    if-eqz v5, :cond_3b

    if-ne v4, v3, :cond_3a

    goto :goto_25

    :cond_3a
    add-int/lit8 v2, v4, 0x1

    .line 39
    aget-char v4, v1, v4

    goto :goto_26

    :cond_3b
    const/16 v5, 0x2c

    if-ne v2, v5, :cond_40

    if-ne v4, v3, :cond_3c

    :goto_28
    const/16 v2, 0x1a

    goto :goto_2a

    :cond_3c
    add-int/lit8 v2, v4, 0x1

    .line 40
    aget-char v4, v1, v4

    :goto_29
    move/from16 v26, v4

    move v4, v2

    move/from16 v2, v26

    :goto_2a
    const/16 v5, 0x20

    if-gt v2, v5, :cond_3e

    shl-long v5, v20, v2

    and-long v5, v5, v22

    cmp-long v5, v5, v16

    if-eqz v5, :cond_3e

    if-ne v4, v3, :cond_3d

    goto :goto_28

    :cond_3d
    add-int/lit8 v2, v4, 0x1

    .line 41
    aget-char v4, v1, v4

    goto :goto_29

    :cond_3e
    const/16 v1, 0x7d

    if-eq v2, v1, :cond_3f

    const/16 v3, 0x5d

    if-eq v2, v3, :cond_3f

    const/16 v5, 0x1a

    if-eq v2, v5, :cond_3f

    const/4 v7, 0x1

    goto :goto_2c

    .line 42
    :cond_3f
    invoke-static {v4, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲(II)V

    throw v18

    :cond_40
    const/16 v1, 0x7d

    const/16 v3, 0x5d

    const/16 v5, 0x1a

    if-eq v2, v1, :cond_42

    if-eq v2, v3, :cond_42

    if-ne v2, v5, :cond_41

    goto :goto_2b

    .line 43
    :cond_41
    invoke-static {v4, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲(II)V

    throw v18

    :cond_42
    :goto_2b
    move/from16 v7, v19

    .line 44
    :goto_2c
    iput-boolean v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    int-to-char v1, v2

    .line 45
    iput-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    return v4

    .line 46
    :cond_43
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏世兰()V

    throw v18

    :cond_44
    const-wide v22, 0x100003700L

    add-int/lit8 v4, v2, 0x3

    if-gt v4, v3, :cond_4f

    add-int/lit8 v5, v2, -0x1

    .line 47
    invoke-static {v5, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰哲苏世(I[C)J

    move-result-wide v5

    sget-wide v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏:J

    cmp-long v5, v5, v7

    if-nez v5, :cond_4f

    if-ne v4, v3, :cond_45

    :goto_2d
    const/16 v2, 0x1a

    goto :goto_2f

    :cond_45
    add-int/lit8 v2, v2, 0x4

    .line 48
    aget-char v4, v1, v4

    :goto_2e
    move/from16 v26, v4

    move v4, v2

    move/from16 v2, v26

    :goto_2f
    const/16 v5, 0x20

    if-gt v2, v5, :cond_47

    shl-long v5, v20, v2

    and-long v5, v5, v22

    cmp-long v5, v5, v16

    if-eqz v5, :cond_47

    if-ne v4, v3, :cond_46

    goto :goto_2d

    :cond_46
    add-int/lit8 v2, v4, 0x1

    .line 49
    aget-char v4, v1, v4

    goto :goto_2e

    :cond_47
    const/16 v5, 0x2c

    if-ne v2, v5, :cond_4c

    if-ne v4, v3, :cond_48

    :goto_30
    const/16 v2, 0x1a

    goto :goto_32

    :cond_48
    add-int/lit8 v2, v4, 0x1

    .line 50
    aget-char v4, v1, v4

    :goto_31
    move/from16 v26, v4

    move v4, v2

    move/from16 v2, v26

    :goto_32
    const/16 v5, 0x20

    if-gt v2, v5, :cond_4a

    shl-long v5, v20, v2

    and-long v5, v5, v22

    cmp-long v5, v5, v16

    if-eqz v5, :cond_4a

    if-ne v4, v3, :cond_49

    goto :goto_30

    :cond_49
    add-int/lit8 v2, v4, 0x1

    .line 51
    aget-char v4, v1, v4

    goto :goto_31

    :cond_4a
    const/16 v1, 0x7d

    if-eq v2, v1, :cond_4b

    const/16 v3, 0x5d

    if-eq v2, v3, :cond_4b

    const/16 v5, 0x1a

    if-eq v2, v5, :cond_4b

    const/4 v7, 0x1

    goto :goto_34

    .line 52
    :cond_4b
    invoke-static {v4, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲(II)V

    throw v18

    :cond_4c
    const/16 v1, 0x7d

    const/16 v3, 0x5d

    const/16 v5, 0x1a

    if-eq v2, v1, :cond_4e

    if-eq v2, v3, :cond_4e

    if-ne v2, v5, :cond_4d

    goto :goto_33

    .line 53
    :cond_4d
    invoke-static {v4, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲(II)V

    throw v18

    :cond_4e
    :goto_33
    move/from16 v7, v19

    .line 54
    :goto_34
    iput-boolean v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    int-to-char v1, v2

    .line 55
    iput-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    return v4

    .line 56
    :cond_4f
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏世兰()V

    throw v18

    :cond_50
    const-wide v22, 0x100003700L

    add-int/lit8 v4, v2, 0x4

    if-gt v4, v3, :cond_5b

    .line 57
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰哲苏世(I[C)J

    move-result-wide v5

    sget-wide v7, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏哲兰世:J

    cmp-long v5, v5, v7

    if-nez v5, :cond_5b

    if-ne v4, v3, :cond_51

    :goto_35
    const/16 v2, 0x1a

    goto :goto_37

    :cond_51
    add-int/lit8 v2, v2, 0x5

    .line 58
    aget-char v4, v1, v4

    :goto_36
    move/from16 v26, v4

    move v4, v2

    move/from16 v2, v26

    :goto_37
    const/16 v5, 0x20

    if-gt v2, v5, :cond_53

    shl-long v5, v20, v2

    and-long v5, v5, v22

    cmp-long v5, v5, v16

    if-eqz v5, :cond_53

    if-ne v4, v3, :cond_52

    goto :goto_35

    :cond_52
    add-int/lit8 v2, v4, 0x1

    .line 59
    aget-char v4, v1, v4

    goto :goto_36

    :cond_53
    const/16 v5, 0x2c

    if-ne v2, v5, :cond_58

    if-ne v4, v3, :cond_54

    :goto_38
    const/16 v2, 0x1a

    goto :goto_3a

    :cond_54
    add-int/lit8 v2, v4, 0x1

    .line 60
    aget-char v4, v1, v4

    :goto_39
    move/from16 v26, v4

    move v4, v2

    move/from16 v2, v26

    :goto_3a
    const/16 v5, 0x20

    if-gt v2, v5, :cond_56

    shl-long v5, v20, v2

    and-long v5, v5, v22

    cmp-long v5, v5, v16

    if-eqz v5, :cond_56

    if-ne v4, v3, :cond_55

    goto :goto_38

    :cond_55
    add-int/lit8 v2, v4, 0x1

    .line 61
    aget-char v4, v1, v4

    goto :goto_39

    :cond_56
    const/16 v1, 0x7d

    if-eq v2, v1, :cond_57

    const/16 v3, 0x5d

    if-eq v2, v3, :cond_57

    const/16 v5, 0x1a

    if-eq v2, v5, :cond_57

    const/4 v7, 0x1

    goto :goto_3c

    .line 62
    :cond_57
    invoke-static {v4, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲(II)V

    throw v18

    :cond_58
    const/16 v1, 0x7d

    const/16 v3, 0x5d

    const/16 v5, 0x1a

    if-eq v2, v1, :cond_5a

    if-eq v2, v3, :cond_5a

    if-ne v2, v5, :cond_59

    goto :goto_3b

    .line 63
    :cond_59
    invoke-static {v4, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲(II)V

    throw v18

    :cond_5a
    :goto_3b
    move/from16 v7, v19

    .line 64
    :goto_3c
    iput-boolean v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    int-to-char v1, v2

    .line 65
    iput-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    return v4

    .line 66
    :cond_5b
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏世兰()V

    throw v18

    .line 67
    :cond_5c
    invoke-static/range {p0 .. p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏哲兰世子(Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;[CII)I

    move-result v0

    return v0

    :cond_5d
    const-wide/16 v20, 0x1

    const-wide v22, 0x100003700L

    add-int/lit8 v4, v2, 0x1

    if-ge v4, v3, :cond_61

    .line 68
    aget-char v6, v1, v2

    if-ne v6, v5, :cond_61

    aget-char v4, v1, v4

    if-ne v4, v7, :cond_61

    add-int/lit8 v4, v2, 0x2

    if-ne v4, v3, :cond_5e

    :goto_3d
    const/16 v5, 0x1a

    goto :goto_3f

    :cond_5e
    add-int/lit8 v2, v2, 0x3

    .line 69
    aget-char v5, v1, v4

    :goto_3e
    move v4, v2

    :goto_3f
    const/16 v2, 0x20

    if-gt v5, v2, :cond_60

    shl-long v6, v20, v5

    and-long v6, v6, v22

    cmp-long v2, v6, v16

    if-eqz v2, :cond_60

    if-ne v4, v3, :cond_5f

    goto :goto_3d

    :cond_5f
    add-int/lit8 v2, v4, 0x1

    .line 70
    aget-char v5, v1, v4

    goto :goto_3e

    .line 71
    :cond_60
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 72
    iput-char v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 73
    invoke-static {v0, v1, v4, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏哲兰世子(Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;[CII)I

    move-result v0

    return v0

    .line 74
    :cond_61
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏世兰()V

    throw v18

    :cond_62
    const-wide/16 v20, 0x1

    const-wide v22, 0x100003700L

    if-ne v2, v3, :cond_63

    const/16 v6, 0x1a

    goto :goto_40

    :cond_63
    add-int/lit8 v6, v2, 0x1

    .line 75
    aget-char v2, v1, v2

    move/from16 v26, v6

    move v6, v2

    move/from16 v2, v26

    :goto_40
    const/16 v7, 0x5c

    if-ne v6, v7, :cond_67

    add-int/lit8 v6, v2, 0x1

    .line 76
    aget-char v8, v1, v2

    const/16 v9, 0x75

    if-ne v8, v9, :cond_64

    add-int/lit8 v6, v2, 0x5

    goto :goto_41

    :cond_64
    const/16 v9, 0x78

    if-ne v8, v9, :cond_65

    add-int/lit8 v6, v2, 0x3

    goto :goto_41

    :cond_65
    if-eq v8, v7, :cond_66

    if-eq v8, v5, :cond_66

    .line 77
    invoke-virtual {v0, v8}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世哲兰(I)C

    :cond_66
    :goto_41
    add-int/lit8 v2, v6, 0x1

    .line 78
    aget-char v6, v1, v6

    goto :goto_40

    :cond_67
    if-ne v6, v4, :cond_72

    if-ne v2, v3, :cond_68

    :goto_42
    const/16 v5, 0x1a

    goto :goto_44

    :cond_68
    add-int/lit8 v4, v2, 0x1

    .line 79
    aget-char v5, v1, v2

    :goto_43
    move v2, v4

    :goto_44
    const/16 v4, 0x20

    if-gt v5, v4, :cond_6a

    shl-long v6, v20, v5

    and-long v6, v6, v22

    cmp-long v4, v6, v16

    if-eqz v4, :cond_6a

    if-ne v2, v3, :cond_69

    goto :goto_42

    :cond_69
    add-int/lit8 v4, v2, 0x1

    .line 80
    aget-char v5, v1, v2

    goto :goto_43

    :cond_6a
    const/16 v6, 0x2c

    if-ne v5, v6, :cond_6f

    if-ne v2, v3, :cond_6b

    const/16 v5, 0x1a

    goto :goto_45

    :cond_6b
    add-int/lit8 v4, v2, 0x1

    .line 81
    aget-char v5, v1, v2

    move v2, v4

    :goto_45
    const/16 v7, 0x20

    :goto_46
    if-gt v5, v7, :cond_6d

    shl-long v8, v20, v5

    and-long v8, v8, v22

    cmp-long v4, v8, v16

    if-eqz v4, :cond_6d

    if-ne v2, v3, :cond_6c

    const/16 v5, 0x1a

    goto :goto_46

    :cond_6c
    add-int/lit8 v4, v2, 0x1

    .line 82
    aget-char v5, v1, v2

    move v2, v4

    goto :goto_46

    :cond_6d
    const/16 v8, 0x7d

    if-eq v5, v8, :cond_6e

    const/16 v9, 0x5d

    if-eq v5, v9, :cond_6e

    const/16 v10, 0x1a

    if-eq v5, v10, :cond_6e

    const/4 v7, 0x1

    goto :goto_48

    .line 83
    :cond_6e
    invoke-static {v2, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲(II)V

    throw v18

    :cond_6f
    const/16 v8, 0x7d

    const/16 v9, 0x5d

    const/16 v10, 0x1a

    if-eq v5, v8, :cond_71

    if-eq v5, v9, :cond_71

    if-ne v5, v10, :cond_70

    goto :goto_47

    .line 84
    :cond_70
    invoke-static {v2, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲(II)V

    throw v18

    :cond_71
    :goto_47
    move/from16 v7, v19

    .line 85
    :goto_48
    iput-boolean v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 86
    iput-char v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    return v2

    :cond_72
    const/16 v6, 0x2c

    const/16 v7, 0x20

    const/16 v8, 0x7d

    const/16 v9, 0x5d

    const/16 v10, 0x1a

    add-int/lit8 v11, v2, 0x1

    .line 87
    aget-char v2, v1, v2

    move v6, v2

    move v2, v11

    goto/16 :goto_40
.end method

.method public static 飘花落叶言楪苏哲世兰子(Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;[CII)I
    .locals 7

    .line 1
    const/16 v0, 0x1a

    .line 2
    .line 3
    if-ne p2, p3, :cond_0

    .line 4
    .line 5
    move v1, p2

    .line 6
    :goto_0
    move p2, v0

    .line 7
    goto :goto_1

    .line 8
    :cond_0
    add-int/lit8 v1, p2, 0x1

    .line 9
    .line 10
    aget-char p2, p1, p2

    .line 11
    .line 12
    :goto_1
    if-eqz p2, :cond_3

    .line 13
    .line 14
    const/16 v2, 0x20

    .line 15
    .line 16
    if-gt p2, v2, :cond_1

    .line 17
    .line 18
    const-wide/16 v2, 0x1

    .line 19
    .line 20
    shl-long/2addr v2, p2

    .line 21
    const-wide v4, 0x100003700L

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr v2, v4

    .line 27
    const-wide/16 v4, 0x0

    .line 28
    .line 29
    cmp-long v2, v2, v4

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_1
    int-to-char p1, p2

    .line 35
    iput-char p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 36
    .line 37
    const/16 p1, 0x2f

    .line 38
    .line 39
    if-ne p2, p1, :cond_2

    .line 40
    .line 41
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏世子兰哲()V

    .line 44
    .line 45
    .line 46
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 47
    .line 48
    return p0

    .line 49
    :cond_2
    return v1

    .line 50
    :cond_3
    :goto_2
    if-ne v1, p3, :cond_4

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_4
    add-int/lit8 p2, v1, 0x1

    .line 54
    .line 55
    aget-char v1, p1, v1

    .line 56
    .line 57
    move v6, v1

    .line 58
    move v1, p2

    .line 59
    move p2, v6

    .line 60
    goto :goto_1
.end method

.method public static 飘花落叶言楪苏哲兰世子(Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;[CII)I
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    invoke-static/range {p0 .. p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏哲世兰子(Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;[CII)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    move v5, v4

    .line 13
    :goto_0
    iget-char v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 14
    .line 15
    const/16 v7, 0x5d

    .line 16
    .line 17
    if-ne v6, v7, :cond_b

    .line 18
    .line 19
    const/16 v5, 0x1a

    .line 20
    .line 21
    if-ne v3, v2, :cond_0

    .line 22
    .line 23
    move v6, v3

    .line 24
    :goto_1
    move v3, v5

    .line 25
    goto :goto_2

    .line 26
    :cond_0
    add-int/lit8 v6, v3, 0x1

    .line 27
    .line 28
    aget-char v3, v1, v3

    .line 29
    .line 30
    :goto_2
    const-wide/16 v8, 0x0

    .line 31
    .line 32
    const-wide v10, 0x100003700L

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    const-wide/16 v12, 0x1

    .line 38
    .line 39
    const/16 v14, 0x20

    .line 40
    .line 41
    if-gt v3, v14, :cond_2

    .line 42
    .line 43
    shl-long v15, v12, v3

    .line 44
    .line 45
    and-long/2addr v15, v10

    .line 46
    cmp-long v15, v15, v8

    .line 47
    .line 48
    if-eqz v15, :cond_2

    .line 49
    .line 50
    if-ne v6, v2, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    add-int/lit8 v3, v6, 0x1

    .line 54
    .line 55
    aget-char v6, v1, v6

    .line 56
    .line 57
    move/from16 v17, v6

    .line 58
    .line 59
    move v6, v3

    .line 60
    move/from16 v3, v17

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    const/16 v15, 0x2c

    .line 64
    .line 65
    if-ne v3, v15, :cond_6

    .line 66
    .line 67
    if-ne v6, v2, :cond_3

    .line 68
    .line 69
    move v4, v5

    .line 70
    goto :goto_3

    .line 71
    :cond_3
    add-int/lit8 v3, v6, 0x1

    .line 72
    .line 73
    aget-char v4, v1, v6

    .line 74
    .line 75
    goto :goto_5

    .line 76
    :goto_3
    move v3, v4

    .line 77
    :goto_4
    if-gt v3, v14, :cond_5

    .line 78
    .line 79
    shl-long v15, v12, v3

    .line 80
    .line 81
    and-long/2addr v15, v10

    .line 82
    cmp-long v4, v15, v8

    .line 83
    .line 84
    if-eqz v4, :cond_5

    .line 85
    .line 86
    if-ne v6, v2, :cond_4

    .line 87
    .line 88
    move v3, v5

    .line 89
    goto :goto_4

    .line 90
    :cond_4
    add-int/lit8 v3, v6, 0x1

    .line 91
    .line 92
    aget-char v4, v1, v6

    .line 93
    .line 94
    :goto_5
    move v6, v3

    .line 95
    goto :goto_3

    .line 96
    :cond_5
    const/4 v4, 0x1

    .line 97
    :cond_6
    const/4 v1, 0x0

    .line 98
    const/16 v2, 0x7d

    .line 99
    .line 100
    if-nez v4, :cond_8

    .line 101
    .line 102
    if-eq v3, v2, :cond_8

    .line 103
    .line 104
    if-eq v3, v7, :cond_8

    .line 105
    .line 106
    if-ne v3, v5, :cond_7

    .line 107
    .line 108
    goto :goto_6

    .line 109
    :cond_7
    invoke-static {v6, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲(II)V

    .line 110
    .line 111
    .line 112
    throw v1

    .line 113
    :cond_8
    :goto_6
    if-eqz v4, :cond_a

    .line 114
    .line 115
    if-eq v3, v2, :cond_9

    .line 116
    .line 117
    if-eq v3, v7, :cond_9

    .line 118
    .line 119
    if-eq v3, v5, :cond_9

    .line 120
    .line 121
    goto :goto_7

    .line 122
    :cond_9
    invoke-static {v6, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲(II)V

    .line 123
    .line 124
    .line 125
    throw v1

    .line 126
    :cond_a
    :goto_7
    iput-boolean v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 127
    .line 128
    int-to-char v1, v3

    .line 129
    iput-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 130
    .line 131
    return v6

    .line 132
    :cond_b
    if-eqz v5, :cond_d

    .line 133
    .line 134
    iget-boolean v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 135
    .line 136
    if-eqz v6, :cond_c

    .line 137
    .line 138
    goto :goto_8

    .line 139
    :cond_c
    const-string v1, "illegal value"

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return v4

    .line 149
    :cond_d
    :goto_8
    invoke-static {v0, v1, v3, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏兰子哲世(Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;[CII)I

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    add-int/lit8 v5, v5, 0x1

    .line 154
    .line 155
    goto/16 :goto_0
.end method

.method public static 飘花落叶言楪苏哲兰子世(I[C)J
    .locals 5

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子世楪哲兰苏:[B

    .line 2
    .line 3
    aget-char v1, p1, p0

    .line 4
    .line 5
    add-int/lit8 v2, p0, 0x1

    .line 6
    .line 7
    aget-char v2, p1, v2

    .line 8
    .line 9
    add-int/lit8 v3, p0, 0x2

    .line 10
    .line 11
    aget-char v3, p1, v3

    .line 12
    .line 13
    add-int/lit8 p0, p0, 0x3

    .line 14
    .line 15
    aget-char p0, p1, p0

    .line 16
    .line 17
    or-int p1, v1, v2

    .line 18
    .line 19
    or-int/2addr p1, v3

    .line 20
    or-int/2addr p1, p0

    .line 21
    const/16 v4, 0xff

    .line 22
    .line 23
    if-le p1, v4, :cond_0

    .line 24
    .line 25
    const-wide/16 p0, -0x1

    .line 26
    .line 27
    return-wide p0

    .line 28
    :cond_0
    aget-byte p1, v0, v1

    .line 29
    .line 30
    shl-int/lit8 p1, p1, 0xc

    .line 31
    .line 32
    aget-byte v1, v0, v2

    .line 33
    .line 34
    shl-int/lit8 v1, v1, 0x8

    .line 35
    .line 36
    or-int/2addr p1, v1

    .line 37
    aget-byte v1, v0, v3

    .line 38
    .line 39
    shl-int/lit8 v1, v1, 0x4

    .line 40
    .line 41
    or-int/2addr p1, v1

    .line 42
    aget-byte p0, v0, p0

    .line 43
    .line 44
    or-int/2addr p0, p1

    .line 45
    int-to-long p0, p0

    .line 46
    return-wide p0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 1
    const/4 v0, -0x1

    .line 2
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰哲楪苏:I

    .line 3
    .line 4
    if-eq v1, v0, :cond_0

    .line 5
    .line 6
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 7
    .line 8
    array-length v0, p0

    .line 9
    const/high16 v2, 0x800000

    .line 10
    .line 11
    if-ge v0, v2, :cond_0

    .line 12
    .line 13
    sget-object v0, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰苏世:[Lcom/alibaba/fastjson2/飘花落叶言子楪世兰哲苏;

    .line 14
    .line 15
    aget-object v0, v0, v1

    .line 16
    .line 17
    sget-object v1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世苏哲:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 18
    .line 19
    invoke-virtual {v1, v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->lazySet(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子世兰苏楪哲()Ljava/lang/String;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰楪哲:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪哲苏:I

    .line 7
    .line 8
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪苏哲:I

    .line 9
    .line 10
    sub-int/2addr v0, v1

    .line 11
    iget-boolean v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏哲世:Z

    .line 12
    .line 13
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    new-instance p0, Ljava/lang/String;

    .line 18
    .line 19
    invoke-direct {p0, v3, v1, v0}, Ljava/lang/String;-><init>([CII)V

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰苏楪哲:I

    .line 24
    .line 25
    new-array v0, v0, [C

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    :goto_0
    aget-char v4, v3, v1

    .line 29
    .line 30
    const/16 v5, 0x22

    .line 31
    .line 32
    const/16 v6, 0x5c

    .line 33
    .line 34
    if-ne v4, v6, :cond_5

    .line 35
    .line 36
    add-int/lit8 v4, v1, 0x1

    .line 37
    .line 38
    aget-char v7, v3, v4

    .line 39
    .line 40
    if-eq v7, v5, :cond_4

    .line 41
    .line 42
    if-eq v7, v6, :cond_4

    .line 43
    .line 44
    const/16 v5, 0x75

    .line 45
    .line 46
    if-eq v7, v5, :cond_3

    .line 47
    .line 48
    const/16 v5, 0x78

    .line 49
    .line 50
    if-eq v7, v5, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世哲兰(I)C

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    move v8, v4

    .line 57
    move v4, v1

    .line 58
    move v1, v8

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    add-int/lit8 v4, v1, 0x2

    .line 61
    .line 62
    aget-char v4, v3, v4

    .line 63
    .line 64
    add-int/lit8 v1, v1, 0x3

    .line 65
    .line 66
    aget-char v5, v3, v1

    .line 67
    .line 68
    invoke-static {v4, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世兰哲(II)C

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    goto :goto_1

    .line 73
    :cond_3
    add-int/lit8 v4, v1, 0x2

    .line 74
    .line 75
    iget v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 76
    .line 77
    invoke-static {v4, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 78
    .line 79
    .line 80
    invoke-static {v4, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪兰苏哲(I[C)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    int-to-char v4, v4

    .line 85
    add-int/lit8 v1, v1, 0x5

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    move v1, v4

    .line 89
    move v4, v7

    .line 90
    goto :goto_1

    .line 91
    :cond_5
    if-ne v4, v5, :cond_6

    .line 92
    .line 93
    new-instance v1, Ljava/lang/String;

    .line 94
    .line 95
    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([C)V

    .line 96
    .line 97
    .line 98
    iput-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰楪哲:Ljava/lang/String;

    .line 99
    .line 100
    return-object v1

    .line 101
    :cond_6
    :goto_1
    aput-char v4, v0, v2

    .line 102
    .line 103
    add-int/lit8 v1, v1, 0x1

    .line 104
    .line 105
    add-int/lit8 v2, v2, 0x1

    .line 106
    .line 107
    goto :goto_0
.end method

.method public final 飘花落叶言子世楪兰哲苏()Ljava/lang/String;
    .locals 9

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏哲世:Z

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪苏哲:I

    .line 8
    .line 9
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏楪兰:Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪哲苏:I

    .line 14
    .line 15
    invoke-virtual {v2, v0, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    new-instance v2, Ljava/lang/String;

    .line 21
    .line 22
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪哲苏:I

    .line 23
    .line 24
    sub-int/2addr p0, v0

    .line 25
    invoke-direct {v2, v1, v0, p0}, Ljava/lang/String;-><init>([CII)V

    .line 26
    .line 27
    .line 28
    return-object v2

    .line 29
    :cond_1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰苏楪哲:I

    .line 30
    .line 31
    new-array v0, v0, [C

    .line 32
    .line 33
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪苏哲:I

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    :goto_0
    iget v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪哲苏:I

    .line 37
    .line 38
    if-ge v2, v4, :cond_7

    .line 39
    .line 40
    aget-char v4, v1, v2

    .line 41
    .line 42
    const/16 v5, 0x22

    .line 43
    .line 44
    const/16 v6, 0x5c

    .line 45
    .line 46
    if-ne v4, v6, :cond_5

    .line 47
    .line 48
    add-int/lit8 v4, v2, 0x1

    .line 49
    .line 50
    aget-char v7, v1, v4

    .line 51
    .line 52
    if-eq v7, v5, :cond_4

    .line 53
    .line 54
    const/16 v5, 0x3a

    .line 55
    .line 56
    if-eq v7, v5, :cond_4

    .line 57
    .line 58
    const/16 v5, 0x40

    .line 59
    .line 60
    if-eq v7, v5, :cond_4

    .line 61
    .line 62
    if-eq v7, v6, :cond_4

    .line 63
    .line 64
    const/16 v5, 0x75

    .line 65
    .line 66
    if-eq v7, v5, :cond_3

    .line 67
    .line 68
    const/16 v5, 0x78

    .line 69
    .line 70
    if-eq v7, v5, :cond_2

    .line 71
    .line 72
    packed-switch v7, :pswitch_data_0

    .line 73
    .line 74
    .line 75
    packed-switch v7, :pswitch_data_1

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世哲兰(I)C

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    move v8, v4

    .line 83
    move v4, v2

    .line 84
    move v2, v8

    .line 85
    goto :goto_1

    .line 86
    :cond_2
    add-int/lit8 v4, v2, 0x2

    .line 87
    .line 88
    aget-char v4, v1, v4

    .line 89
    .line 90
    add-int/lit8 v2, v2, 0x3

    .line 91
    .line 92
    aget-char v5, v1, v2

    .line 93
    .line 94
    invoke-static {v4, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世兰哲(II)C

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    goto :goto_1

    .line 99
    :cond_3
    add-int/lit8 v4, v2, 0x2

    .line 100
    .line 101
    iget v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 102
    .line 103
    invoke-static {v4, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 104
    .line 105
    .line 106
    invoke-static {v4, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪兰苏哲(I[C)I

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    int-to-char v4, v4

    .line 111
    add-int/lit8 v2, v2, 0x5

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_4
    :pswitch_0
    move v2, v4

    .line 115
    move v4, v7

    .line 116
    goto :goto_1

    .line 117
    :cond_5
    if-ne v4, v5, :cond_6

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_6
    :goto_1
    aput-char v4, v0, v3

    .line 121
    .line 122
    add-int/lit8 v2, v2, 0x1

    .line 123
    .line 124
    add-int/lit8 v3, v3, 0x1

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_7
    :goto_2
    new-instance p0, Ljava/lang/String;

    .line 128
    .line 129
    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    .line 130
    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_data_0
    .packed-switch 0x2a
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    :pswitch_data_1
    .packed-switch 0x3c
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子世苏兰楪哲()J
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪苏哲:I

    .line 4
    .line 5
    const/16 v2, 0x27

    .line 6
    .line 7
    const/16 v3, 0x22

    .line 8
    .line 9
    iget-object v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 10
    .line 11
    if-lez v1, :cond_0

    .line 12
    .line 13
    add-int/lit8 v5, v1, -0x1

    .line 14
    .line 15
    aget-char v5, v4, v5

    .line 16
    .line 17
    if-ne v5, v2, :cond_0

    .line 18
    .line 19
    move v5, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v5, v3

    .line 22
    :goto_0
    const/4 v8, 0x0

    .line 23
    const-wide/16 v9, 0x0

    .line 24
    .line 25
    :goto_1
    const/16 v13, 0x2d

    .line 26
    .line 27
    const/16 v14, 0x5f

    .line 28
    .line 29
    const/16 v15, 0x78

    .line 30
    .line 31
    const-wide/16 v16, 0x0

    .line 32
    .line 33
    const/16 v6, 0x75

    .line 34
    .line 35
    const/16 v7, 0x5c

    .line 36
    .line 37
    iget v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 38
    .line 39
    const/16 v12, 0x20

    .line 40
    .line 41
    if-ge v1, v11, :cond_a

    .line 42
    .line 43
    aget-char v2, v4, v1

    .line 44
    .line 45
    if-ne v2, v7, :cond_3

    .line 46
    .line 47
    add-int/lit8 v2, v1, 0x1

    .line 48
    .line 49
    aget-char v7, v4, v2

    .line 50
    .line 51
    if-eq v7, v6, :cond_2

    .line 52
    .line 53
    if-eq v7, v15, :cond_1

    .line 54
    .line 55
    invoke-virtual {v0, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世哲兰(I)C

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    move/from16 v18, v2

    .line 60
    .line 61
    move v2, v1

    .line 62
    move/from16 v1, v18

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_1
    add-int/lit8 v2, v1, 0x2

    .line 66
    .line 67
    aget-char v2, v4, v2

    .line 68
    .line 69
    add-int/lit8 v1, v1, 0x3

    .line 70
    .line 71
    aget-char v7, v4, v1

    .line 72
    .line 73
    invoke-static {v2, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世兰哲(II)C

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    goto :goto_2

    .line 78
    :cond_2
    add-int/lit8 v2, v1, 0x2

    .line 79
    .line 80
    invoke-static {v2, v11}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 81
    .line 82
    .line 83
    invoke-static {v2, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪兰苏哲(I[C)I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    int-to-char v2, v2

    .line 88
    add-int/lit8 v1, v1, 0x5

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    if-ne v2, v5, :cond_4

    .line 92
    .line 93
    goto/16 :goto_9

    .line 94
    .line 95
    :cond_4
    :goto_2
    const/16 v7, 0xff

    .line 96
    .line 97
    if-gt v2, v7, :cond_9

    .line 98
    .line 99
    const/16 v7, 0x8

    .line 100
    .line 101
    if-ge v8, v7, :cond_9

    .line 102
    .line 103
    if-nez v8, :cond_5

    .line 104
    .line 105
    if-nez v2, :cond_5

    .line 106
    .line 107
    goto/16 :goto_8

    .line 108
    .line 109
    :cond_5
    if-eq v2, v14, :cond_7

    .line 110
    .line 111
    if-eq v2, v13, :cond_7

    .line 112
    .line 113
    if-ne v2, v12, :cond_6

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_6
    const/16 v6, 0x41

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_7
    :goto_3
    add-int/lit8 v6, v1, 0x1

    .line 120
    .line 121
    aget-char v6, v4, v6

    .line 122
    .line 123
    if-eq v6, v3, :cond_6

    .line 124
    .line 125
    const/16 v11, 0x27

    .line 126
    .line 127
    if-eq v6, v11, :cond_6

    .line 128
    .line 129
    if-eq v6, v2, :cond_6

    .line 130
    .line 131
    goto :goto_7

    .line 132
    :goto_4
    if-lt v2, v6, :cond_8

    .line 133
    .line 134
    const/16 v6, 0x5a

    .line 135
    .line 136
    if-gt v2, v6, :cond_8

    .line 137
    .line 138
    add-int/lit8 v2, v2, 0x20

    .line 139
    .line 140
    int-to-char v2, v2

    .line 141
    :cond_8
    packed-switch v8, :pswitch_data_0

    .line 142
    .line 143
    .line 144
    goto :goto_6

    .line 145
    :pswitch_0
    int-to-byte v2, v2

    .line 146
    int-to-long v6, v2

    .line 147
    const/16 v2, 0x38

    .line 148
    .line 149
    shl-long/2addr v6, v2

    .line 150
    const-wide v11, 0xffffffffffffffL

    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    :goto_5
    and-long/2addr v9, v11

    .line 156
    add-long/2addr v9, v6

    .line 157
    goto :goto_6

    .line 158
    :pswitch_1
    int-to-byte v2, v2

    .line 159
    int-to-long v6, v2

    .line 160
    const/16 v2, 0x30

    .line 161
    .line 162
    shl-long/2addr v6, v2

    .line 163
    const-wide v11, 0xffffffffffffL

    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    goto :goto_5

    .line 169
    :pswitch_2
    int-to-byte v2, v2

    .line 170
    int-to-long v6, v2

    .line 171
    const/16 v2, 0x28

    .line 172
    .line 173
    shl-long/2addr v6, v2

    .line 174
    const-wide v11, 0xffffffffffL

    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    goto :goto_5

    .line 180
    :pswitch_3
    int-to-byte v2, v2

    .line 181
    int-to-long v6, v2

    .line 182
    shl-long/2addr v6, v12

    .line 183
    const-wide v11, 0xffffffffL

    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    goto :goto_5

    .line 189
    :pswitch_4
    int-to-byte v2, v2

    .line 190
    shl-int/lit8 v2, v2, 0x18

    .line 191
    .line 192
    int-to-long v6, v2

    .line 193
    const-wide/32 v11, 0xffffff

    .line 194
    .line 195
    .line 196
    goto :goto_5

    .line 197
    :pswitch_5
    int-to-byte v2, v2

    .line 198
    shl-int/lit8 v2, v2, 0x10

    .line 199
    .line 200
    int-to-long v6, v2

    .line 201
    const-wide/32 v11, 0xffff

    .line 202
    .line 203
    .line 204
    goto :goto_5

    .line 205
    :pswitch_6
    int-to-byte v2, v2

    .line 206
    shl-int/2addr v2, v7

    .line 207
    int-to-long v6, v2

    .line 208
    const-wide/16 v11, 0xff

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :pswitch_7
    int-to-byte v2, v2

    .line 212
    int-to-long v9, v2

    .line 213
    :goto_6
    add-int/lit8 v8, v8, 0x1

    .line 214
    .line 215
    :goto_7
    add-int/lit8 v1, v1, 0x1

    .line 216
    .line 217
    const/16 v2, 0x27

    .line 218
    .line 219
    goto/16 :goto_1

    .line 220
    .line 221
    :cond_9
    :goto_8
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪苏哲:I

    .line 222
    .line 223
    move-wide/from16 v9, v16

    .line 224
    .line 225
    :cond_a
    :goto_9
    cmp-long v2, v9, v16

    .line 226
    .line 227
    if-eqz v2, :cond_b

    .line 228
    .line 229
    return-wide v9

    .line 230
    :cond_b
    const-wide v7, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    :goto_a
    if-ge v1, v11, :cond_14

    .line 236
    .line 237
    aget-char v2, v4, v1

    .line 238
    .line 239
    const/16 v9, 0x5c

    .line 240
    .line 241
    if-ne v2, v9, :cond_e

    .line 242
    .line 243
    add-int/lit8 v2, v1, 0x1

    .line 244
    .line 245
    aget-char v10, v4, v2

    .line 246
    .line 247
    if-eq v10, v6, :cond_d

    .line 248
    .line 249
    if-eq v10, v15, :cond_c

    .line 250
    .line 251
    invoke-virtual {v0, v10}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世哲兰(I)C

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    move/from16 v18, v2

    .line 256
    .line 257
    move v2, v1

    .line 258
    move/from16 v1, v18

    .line 259
    .line 260
    goto :goto_b

    .line 261
    :cond_c
    add-int/lit8 v2, v1, 0x2

    .line 262
    .line 263
    aget-char v2, v4, v2

    .line 264
    .line 265
    add-int/lit8 v1, v1, 0x3

    .line 266
    .line 267
    aget-char v10, v4, v1

    .line 268
    .line 269
    invoke-static {v2, v10}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世兰哲(II)C

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    goto :goto_b

    .line 274
    :cond_d
    add-int/lit8 v2, v1, 0x2

    .line 275
    .line 276
    invoke-static {v2, v11}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 277
    .line 278
    .line 279
    invoke-static {v2, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪兰苏哲(I[C)I

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    int-to-char v2, v2

    .line 284
    add-int/lit8 v1, v1, 0x5

    .line 285
    .line 286
    goto :goto_b

    .line 287
    :cond_e
    if-ne v2, v5, :cond_f

    .line 288
    .line 289
    goto :goto_f

    .line 290
    :cond_f
    :goto_b
    add-int/lit8 v1, v1, 0x1

    .line 291
    .line 292
    if-eq v2, v14, :cond_12

    .line 293
    .line 294
    if-eq v2, v13, :cond_12

    .line 295
    .line 296
    if-ne v2, v12, :cond_10

    .line 297
    .line 298
    goto :goto_c

    .line 299
    :cond_10
    const/16 v3, 0x27

    .line 300
    .line 301
    :cond_11
    const/16 v10, 0x41

    .line 302
    .line 303
    goto :goto_e

    .line 304
    :cond_12
    :goto_c
    aget-char v10, v4, v1

    .line 305
    .line 306
    if-eq v10, v3, :cond_10

    .line 307
    .line 308
    const/16 v3, 0x27

    .line 309
    .line 310
    if-eq v10, v3, :cond_11

    .line 311
    .line 312
    if-eq v10, v2, :cond_11

    .line 313
    .line 314
    :goto_d
    const/16 v3, 0x22

    .line 315
    .line 316
    goto :goto_a

    .line 317
    :goto_e
    const/16 v3, 0x5a

    .line 318
    .line 319
    if-lt v2, v10, :cond_13

    .line 320
    .line 321
    if-gt v2, v3, :cond_13

    .line 322
    .line 323
    add-int/lit8 v2, v2, 0x20

    .line 324
    .line 325
    int-to-char v2, v2

    .line 326
    :cond_13
    move-object/from16 v17, v4

    .line 327
    .line 328
    int-to-long v3, v2

    .line 329
    xor-long v2, v7, v3

    .line 330
    .line 331
    const-wide v7, 0x100000001b3L

    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    mul-long/2addr v7, v2

    .line 337
    move-object/from16 v4, v17

    .line 338
    .line 339
    goto :goto_d

    .line 340
    :cond_14
    :goto_f
    return-wide v7

    .line 341
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子兰世哲楪苏()Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 5
    .line 6
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 7
    .line 8
    iget-char v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 9
    .line 10
    const/16 v4, 0x74

    .line 11
    .line 12
    const/16 v5, 0x75

    .line 13
    .line 14
    const-wide/16 v6, 0x0

    .line 15
    .line 16
    iget v8, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 17
    .line 18
    const/4 v9, 0x1

    .line 19
    iget-object v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 20
    .line 21
    if-ne v3, v4, :cond_1

    .line 22
    .line 23
    add-int/lit8 v4, v2, 0x2

    .line 24
    .line 25
    array-length v11, v10

    .line 26
    if-ge v4, v11, :cond_1

    .line 27
    .line 28
    aget-char v11, v10, v2

    .line 29
    .line 30
    const/16 v12, 0x72

    .line 31
    .line 32
    if-ne v11, v12, :cond_1

    .line 33
    .line 34
    add-int/lit8 v11, v2, 0x1

    .line 35
    .line 36
    aget-char v11, v10, v11

    .line 37
    .line 38
    if-ne v11, v5, :cond_1

    .line 39
    .line 40
    aget-char v4, v10, v4

    .line 41
    .line 42
    const/16 v11, 0x65

    .line 43
    .line 44
    if-ne v4, v11, :cond_1

    .line 45
    .line 46
    add-int/lit8 v2, v2, 0x3

    .line 47
    .line 48
    :cond_0
    :goto_0
    move v3, v9

    .line 49
    goto/16 :goto_3

    .line 50
    .line 51
    :cond_1
    const/16 v4, 0x66

    .line 52
    .line 53
    if-ne v3, v4, :cond_3

    .line 54
    .line 55
    add-int/lit8 v4, v2, 0x3

    .line 56
    .line 57
    if-ge v4, v8, :cond_3

    .line 58
    .line 59
    invoke-static {v2, v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰哲苏世(I[C)J

    .line 60
    .line 61
    .line 62
    move-result-wide v11

    .line 63
    sget-wide v13, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏哲兰世:J

    .line 64
    .line 65
    cmp-long v4, v11, v13

    .line 66
    .line 67
    if-nez v4, :cond_3

    .line 68
    .line 69
    add-int/lit8 v2, v2, 0x4

    .line 70
    .line 71
    :cond_2
    :goto_1
    move v3, v1

    .line 72
    goto/16 :goto_3

    .line 73
    .line 74
    :cond_3
    const/16 v4, 0x2d

    .line 75
    .line 76
    iget-object v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 77
    .line 78
    if-eq v3, v4, :cond_4

    .line 79
    .line 80
    const/16 v4, 0x30

    .line 81
    .line 82
    if-lt v3, v4, :cond_5

    .line 83
    .line 84
    const/16 v12, 0x39

    .line 85
    .line 86
    if-gt v3, v12, :cond_5

    .line 87
    .line 88
    :cond_4
    move/from16 v16, v1

    .line 89
    .line 90
    goto/16 :goto_b

    .line 91
    .line 92
    :cond_5
    const/16 v12, 0x6e

    .line 93
    .line 94
    if-ne v3, v12, :cond_7

    .line 95
    .line 96
    add-int/lit8 v12, v2, 0x2

    .line 97
    .line 98
    array-length v13, v10

    .line 99
    if-ge v12, v13, :cond_7

    .line 100
    .line 101
    aget-char v13, v10, v2

    .line 102
    .line 103
    if-ne v13, v5, :cond_7

    .line 104
    .line 105
    add-int/lit8 v5, v2, 0x1

    .line 106
    .line 107
    aget-char v5, v10, v5

    .line 108
    .line 109
    const/16 v13, 0x6c

    .line 110
    .line 111
    if-ne v5, v13, :cond_7

    .line 112
    .line 113
    aget-char v5, v10, v12

    .line 114
    .line 115
    if-ne v5, v13, :cond_7

    .line 116
    .line 117
    iget-wide v3, v11, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 118
    .line 119
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 120
    .line 121
    iget-wide v11, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 122
    .line 123
    and-long/2addr v3, v11

    .line 124
    cmp-long v3, v3, v6

    .line 125
    .line 126
    if-nez v3, :cond_6

    .line 127
    .line 128
    iput-boolean v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 129
    .line 130
    add-int/lit8 v2, v2, 0x3

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_6
    const-string v2, "boolean value not support input null"

    .line 134
    .line 135
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return v1

    .line 143
    :cond_7
    const/16 v5, 0x22

    .line 144
    .line 145
    if-eq v3, v5, :cond_b

    .line 146
    .line 147
    const/16 v5, 0x27

    .line 148
    .line 149
    if-ne v3, v5, :cond_8

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_8
    const/16 v2, 0x5b

    .line 153
    .line 154
    if-ne v3, v2, :cond_a

    .line 155
    .line 156
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子兰世哲楪苏()Z

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    const/16 v4, 0x5d

    .line 164
    .line 165
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子哲楪兰苏世(C)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_9

    .line 170
    .line 171
    return v2

    .line 172
    :cond_9
    const-string v0, "not closed square brackets, expect ] but found : "

    .line 173
    .line 174
    invoke-static {v3, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(ILjava/lang/String;)V

    .line 175
    .line 176
    .line 177
    return v1

    .line 178
    :cond_a
    const-string v0, "syntax error : "

    .line 179
    .line 180
    invoke-static {v3, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(ILjava/lang/String;)V

    .line 181
    .line 182
    .line 183
    return v1

    .line 184
    :cond_b
    :goto_2
    add-int/lit8 v5, v2, 0x1

    .line 185
    .line 186
    array-length v11, v10

    .line 187
    const-string v12, "can not convert to boolean : "

    .line 188
    .line 189
    if-ge v5, v11, :cond_15

    .line 190
    .line 191
    aget-char v5, v10, v5

    .line 192
    .line 193
    if-ne v5, v3, :cond_15

    .line 194
    .line 195
    aget-char v3, v10, v2

    .line 196
    .line 197
    add-int/lit8 v2, v2, 0x2

    .line 198
    .line 199
    if-eq v3, v4, :cond_2

    .line 200
    .line 201
    const/16 v4, 0x4e

    .line 202
    .line 203
    if-ne v3, v4, :cond_c

    .line 204
    .line 205
    goto/16 :goto_1

    .line 206
    .line 207
    :cond_c
    const/16 v4, 0x31

    .line 208
    .line 209
    if-eq v3, v4, :cond_0

    .line 210
    .line 211
    const/16 v4, 0x59

    .line 212
    .line 213
    if-ne v3, v4, :cond_d

    .line 214
    .line 215
    goto/16 :goto_0

    .line 216
    .line 217
    :cond_d
    invoke-static {v3, v12}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(ILjava/lang/String;)V

    .line 218
    .line 219
    .line 220
    return v1

    .line 221
    :goto_3
    const/16 v4, 0x1a

    .line 222
    .line 223
    if-ne v2, v8, :cond_e

    .line 224
    .line 225
    move v5, v2

    .line 226
    :goto_4
    move v2, v4

    .line 227
    goto :goto_5

    .line 228
    :cond_e
    add-int/lit8 v5, v2, 0x1

    .line 229
    .line 230
    aget-char v2, v10, v2

    .line 231
    .line 232
    :goto_5
    const-wide v11, 0x100003700L

    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    const-wide/16 v13, 0x1

    .line 238
    .line 239
    const/16 v15, 0x20

    .line 240
    .line 241
    if-gt v2, v15, :cond_10

    .line 242
    .line 243
    shl-long v16, v13, v2

    .line 244
    .line 245
    and-long v16, v16, v11

    .line 246
    .line 247
    cmp-long v16, v16, v6

    .line 248
    .line 249
    if-eqz v16, :cond_10

    .line 250
    .line 251
    if-ne v5, v8, :cond_f

    .line 252
    .line 253
    goto :goto_4

    .line 254
    :cond_f
    add-int/lit8 v2, v5, 0x1

    .line 255
    .line 256
    aget-char v5, v10, v5

    .line 257
    .line 258
    move/from16 v18, v5

    .line 259
    .line 260
    move v5, v2

    .line 261
    move/from16 v2, v18

    .line 262
    .line 263
    goto :goto_5

    .line 264
    :cond_10
    move/from16 v16, v1

    .line 265
    .line 266
    const/16 v1, 0x2c

    .line 267
    .line 268
    if-ne v2, v1, :cond_11

    .line 269
    .line 270
    move v1, v9

    .line 271
    goto :goto_6

    .line 272
    :cond_11
    move/from16 v1, v16

    .line 273
    .line 274
    :goto_6
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 275
    .line 276
    if-eqz v1, :cond_14

    .line 277
    .line 278
    if-ne v5, v8, :cond_12

    .line 279
    .line 280
    :goto_7
    move v2, v4

    .line 281
    goto :goto_9

    .line 282
    :cond_12
    add-int/lit8 v1, v5, 0x1

    .line 283
    .line 284
    aget-char v2, v10, v5

    .line 285
    .line 286
    :goto_8
    move v5, v1

    .line 287
    :goto_9
    if-gt v2, v15, :cond_14

    .line 288
    .line 289
    shl-long v16, v13, v2

    .line 290
    .line 291
    and-long v16, v16, v11

    .line 292
    .line 293
    cmp-long v1, v16, v6

    .line 294
    .line 295
    if-eqz v1, :cond_14

    .line 296
    .line 297
    if-ne v5, v8, :cond_13

    .line 298
    .line 299
    goto :goto_7

    .line 300
    :cond_13
    add-int/lit8 v1, v5, 0x1

    .line 301
    .line 302
    aget-char v2, v10, v5

    .line 303
    .line 304
    goto :goto_8

    .line 305
    :cond_14
    iput v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 306
    .line 307
    iput-char v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 308
    .line 309
    return v3

    .line 310
    :cond_15
    move/from16 v16, v1

    .line 311
    .line 312
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    const-string v2, "true"

    .line 317
    .line 318
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    if-eqz v2, :cond_16

    .line 323
    .line 324
    goto :goto_c

    .line 325
    :cond_16
    const-string v2, "false"

    .line 326
    .line 327
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 328
    .line 329
    .line 330
    move-result v2

    .line 331
    if-eqz v2, :cond_17

    .line 332
    .line 333
    goto :goto_d

    .line 334
    :cond_17
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 335
    .line 336
    .line 337
    move-result v2

    .line 338
    if-nez v2, :cond_19

    .line 339
    .line 340
    const-string v2, "null"

    .line 341
    .line 342
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 343
    .line 344
    .line 345
    move-result v2

    .line 346
    if-eqz v2, :cond_18

    .line 347
    .line 348
    goto :goto_a

    .line 349
    :cond_18
    invoke-virtual {v12, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    return v16

    .line 357
    :cond_19
    :goto_a
    iput-boolean v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 358
    .line 359
    return v16

    .line 360
    :goto_b
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲子兰苏()Ljava/lang/Number;

    .line 361
    .line 362
    .line 363
    iget-byte v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 364
    .line 365
    if-ne v1, v9, :cond_1c

    .line 366
    .line 367
    iget-wide v1, v11, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 368
    .line 369
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->NonZeroNumberCastToBooleanAsTrue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 370
    .line 371
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 372
    .line 373
    and-long/2addr v1, v3

    .line 374
    cmp-long v1, v1, v6

    .line 375
    .line 376
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰哲苏:I

    .line 377
    .line 378
    if-eqz v1, :cond_1a

    .line 379
    .line 380
    if-nez v2, :cond_1b

    .line 381
    .line 382
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪哲兰:I

    .line 383
    .line 384
    if-nez v1, :cond_1b

    .line 385
    .line 386
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 387
    .line 388
    if-nez v1, :cond_1b

    .line 389
    .line 390
    iget v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 391
    .line 392
    if-eqz v0, :cond_1c

    .line 393
    .line 394
    goto :goto_c

    .line 395
    :cond_1a
    if-nez v2, :cond_1c

    .line 396
    .line 397
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪哲兰:I

    .line 398
    .line 399
    if-nez v1, :cond_1c

    .line 400
    .line 401
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 402
    .line 403
    if-nez v1, :cond_1c

    .line 404
    .line 405
    iget v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 406
    .line 407
    if-ne v0, v9, :cond_1c

    .line 408
    .line 409
    :cond_1b
    :goto_c
    return v9

    .line 410
    :cond_1c
    :goto_d
    return v16
.end method

.method public final 飘花落叶言子兰世楪苏哲()Ljava/math/BigDecimal;
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-char v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 4
    .line 5
    iget v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 6
    .line 7
    const/16 v3, 0x22

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    iget v6, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    iget-object v8, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 14
    .line 15
    const/4 v9, 0x0

    .line 16
    if-eq v0, v3, :cond_1

    .line 17
    .line 18
    const/16 v3, 0x27

    .line 19
    .line 20
    if-ne v0, v3, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v3, v2

    .line 24
    move v2, v7

    .line 25
    goto :goto_2

    .line 26
    :cond_1
    :goto_0
    add-int/lit8 v3, v2, 0x1

    .line 27
    .line 28
    aget-char v10, v8, v2

    .line 29
    .line 30
    if-ne v10, v0, :cond_3

    .line 31
    .line 32
    if-ne v3, v6, :cond_2

    .line 33
    .line 34
    const/16 v5, 0x1a

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    add-int/2addr v2, v4

    .line 38
    aget-char v5, v8, v3

    .line 39
    .line 40
    move v3, v2

    .line 41
    :goto_1
    iput-char v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 42
    .line 43
    iput v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子哲楪苏世兰()Z

    .line 46
    .line 47
    .line 48
    return-object v9

    .line 49
    :cond_3
    move v2, v0

    .line 50
    move v0, v10

    .line 51
    :goto_2
    const/16 v10, 0x2b

    .line 52
    .line 53
    const/16 v11, 0x2d

    .line 54
    .line 55
    const/4 v12, 0x1

    .line 56
    if-ne v0, v11, :cond_4

    .line 57
    .line 58
    iput-boolean v12, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏兰哲:Z

    .line 59
    .line 60
    add-int/lit8 v0, v3, 0x1

    .line 61
    .line 62
    aget-char v13, v8, v3

    .line 63
    .line 64
    :goto_3
    move/from16 v28, v13

    .line 65
    .line 66
    move v13, v0

    .line 67
    move/from16 v0, v28

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_4
    iput-boolean v7, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏兰哲:Z

    .line 71
    .line 72
    if-ne v0, v10, :cond_5

    .line 73
    .line 74
    add-int/lit8 v0, v3, 0x1

    .line 75
    .line 76
    aget-char v13, v8, v3

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_5
    move v13, v3

    .line 80
    :goto_4
    iput-byte v12, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 81
    .line 82
    const-wide/16 v14, 0x0

    .line 83
    .line 84
    move/from16 v16, v7

    .line 85
    .line 86
    move/from16 v19, v16

    .line 87
    .line 88
    move-wide/from16 v17, v14

    .line 89
    .line 90
    :goto_5
    const/16 v20, 0x1f

    .line 91
    .line 92
    const/16 v5, 0x39

    .line 93
    .line 94
    const-wide/16 v21, 0xa

    .line 95
    .line 96
    move-object/from16 v23, v9

    .line 97
    .line 98
    const/16 v9, 0x30

    .line 99
    .line 100
    if-lt v0, v9, :cond_a

    .line 101
    .line 102
    if-gt v0, v5, :cond_a

    .line 103
    .line 104
    if-nez v16, :cond_7

    .line 105
    .line 106
    mul-long v24, v17, v21

    .line 107
    .line 108
    or-long v26, v17, v21

    .line 109
    .line 110
    ushr-long v26, v26, v20

    .line 111
    .line 112
    cmp-long v19, v26, v14

    .line 113
    .line 114
    if-eqz v19, :cond_8

    .line 115
    .line 116
    div-long v26, v24, v21

    .line 117
    .line 118
    cmp-long v19, v26, v17

    .line 119
    .line 120
    if-nez v19, :cond_6

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_6
    move/from16 v16, v12

    .line 124
    .line 125
    :cond_7
    move-wide/from16 v26, v14

    .line 126
    .line 127
    goto :goto_7

    .line 128
    :cond_8
    :goto_6
    add-int/lit8 v0, v0, -0x30

    .line 129
    .line 130
    move-wide/from16 v26, v14

    .line 131
    .line 132
    int-to-long v14, v0

    .line 133
    add-long v17, v24, v14

    .line 134
    .line 135
    :goto_7
    if-ne v13, v6, :cond_9

    .line 136
    .line 137
    add-int/lit8 v13, v13, 0x1

    .line 138
    .line 139
    move/from16 v19, v12

    .line 140
    .line 141
    const/16 v0, 0x1a

    .line 142
    .line 143
    goto :goto_8

    .line 144
    :cond_9
    add-int/lit8 v0, v13, 0x1

    .line 145
    .line 146
    aget-char v5, v8, v13

    .line 147
    .line 148
    move v13, v0

    .line 149
    move v0, v5

    .line 150
    move/from16 v19, v12

    .line 151
    .line 152
    move-object/from16 v9, v23

    .line 153
    .line 154
    move-wide/from16 v14, v26

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_a
    move-wide/from16 v26, v14

    .line 158
    .line 159
    :goto_8
    cmp-long v14, v17, v26

    .line 160
    .line 161
    if-gez v14, :cond_b

    .line 162
    .line 163
    move/from16 v16, v12

    .line 164
    .line 165
    :cond_b
    iput-short v7, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰苏哲:S

    .line 166
    .line 167
    const/16 v14, 0x2e

    .line 168
    .line 169
    if-ne v0, v14, :cond_10

    .line 170
    .line 171
    iput-byte v4, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 172
    .line 173
    add-int/lit8 v0, v13, 0x1

    .line 174
    .line 175
    aget-char v13, v8, v13

    .line 176
    .line 177
    move/from16 v28, v13

    .line 178
    .line 179
    move v13, v0

    .line 180
    move/from16 v0, v28

    .line 181
    .line 182
    :goto_9
    if-lt v0, v9, :cond_10

    .line 183
    .line 184
    if-gt v0, v5, :cond_10

    .line 185
    .line 186
    iget-short v14, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰苏哲:S

    .line 187
    .line 188
    add-int/2addr v14, v12

    .line 189
    int-to-short v14, v14

    .line 190
    iput-short v14, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰苏哲:S

    .line 191
    .line 192
    if-nez v16, :cond_e

    .line 193
    .line 194
    mul-long v14, v17, v21

    .line 195
    .line 196
    or-long v24, v17, v21

    .line 197
    .line 198
    ushr-long v24, v24, v20

    .line 199
    .line 200
    cmp-long v19, v24, v26

    .line 201
    .line 202
    if-eqz v19, :cond_d

    .line 203
    .line 204
    div-long v24, v14, v21

    .line 205
    .line 206
    cmp-long v19, v24, v17

    .line 207
    .line 208
    if-nez v19, :cond_c

    .line 209
    .line 210
    goto :goto_a

    .line 211
    :cond_c
    move-object/from16 v25, v8

    .line 212
    .line 213
    move/from16 v16, v12

    .line 214
    .line 215
    goto :goto_b

    .line 216
    :cond_d
    :goto_a
    add-int/lit8 v0, v0, -0x30

    .line 217
    .line 218
    move-object/from16 v25, v8

    .line 219
    .line 220
    int-to-long v7, v0

    .line 221
    add-long/2addr v14, v7

    .line 222
    move-wide/from16 v17, v14

    .line 223
    .line 224
    goto :goto_b

    .line 225
    :cond_e
    move-object/from16 v25, v8

    .line 226
    .line 227
    :goto_b
    if-ne v13, v6, :cond_f

    .line 228
    .line 229
    add-int/lit8 v13, v13, 0x1

    .line 230
    .line 231
    move/from16 v19, v12

    .line 232
    .line 233
    move-wide/from16 v7, v17

    .line 234
    .line 235
    const/16 v0, 0x1a

    .line 236
    .line 237
    goto :goto_d

    .line 238
    :cond_f
    add-int/lit8 v0, v13, 0x1

    .line 239
    .line 240
    aget-char v7, v25, v13

    .line 241
    .line 242
    move v13, v0

    .line 243
    move v0, v7

    .line 244
    move/from16 v19, v12

    .line 245
    .line 246
    move-object/from16 v8, v25

    .line 247
    .line 248
    const/4 v7, 0x0

    .line 249
    goto :goto_9

    .line 250
    :goto_c
    move-wide/from16 v7, v17

    .line 251
    .line 252
    goto :goto_d

    .line 253
    :cond_10
    move-object/from16 v25, v8

    .line 254
    .line 255
    goto :goto_c

    .line 256
    :goto_d
    const/16 v14, 0x65

    .line 257
    .line 258
    if-eq v0, v14, :cond_12

    .line 259
    .line 260
    const/16 v15, 0x45

    .line 261
    .line 262
    if-ne v0, v15, :cond_11

    .line 263
    .line 264
    goto :goto_e

    .line 265
    :cond_11
    const/4 v10, 0x0

    .line 266
    goto :goto_14

    .line 267
    :cond_12
    :goto_e
    add-int/lit8 v0, v13, 0x1

    .line 268
    .line 269
    aget-char v15, v25, v13

    .line 270
    .line 271
    if-ne v15, v11, :cond_13

    .line 272
    .line 273
    move v11, v12

    .line 274
    goto :goto_f

    .line 275
    :cond_13
    const/4 v11, 0x0

    .line 276
    :goto_f
    if-nez v11, :cond_15

    .line 277
    .line 278
    if-ne v15, v10, :cond_14

    .line 279
    .line 280
    goto :goto_11

    .line 281
    :cond_14
    :goto_10
    const/4 v10, 0x0

    .line 282
    goto :goto_12

    .line 283
    :cond_15
    :goto_11
    add-int/lit8 v13, v13, 0x2

    .line 284
    .line 285
    aget-char v15, v25, v0

    .line 286
    .line 287
    move v0, v13

    .line 288
    goto :goto_10

    .line 289
    :goto_12
    if-lt v15, v9, :cond_18

    .line 290
    .line 291
    if-gt v15, v5, :cond_18

    .line 292
    .line 293
    add-int/lit8 v15, v15, -0x30

    .line 294
    .line 295
    mul-int/lit8 v10, v10, 0xa

    .line 296
    .line 297
    add-int/2addr v10, v15

    .line 298
    const/16 v13, 0x7ff

    .line 299
    .line 300
    if-gt v10, v13, :cond_17

    .line 301
    .line 302
    if-ne v0, v6, :cond_16

    .line 303
    .line 304
    add-int/lit8 v0, v0, 0x1

    .line 305
    .line 306
    move v13, v0

    .line 307
    move/from16 v19, v12

    .line 308
    .line 309
    const/16 v0, 0x1a

    .line 310
    .line 311
    goto :goto_13

    .line 312
    :cond_16
    add-int/lit8 v13, v0, 0x1

    .line 313
    .line 314
    aget-char v15, v25, v0

    .line 315
    .line 316
    move/from16 v19, v12

    .line 317
    .line 318
    move v0, v13

    .line 319
    goto :goto_12

    .line 320
    :cond_17
    const-string v0, "too large exp value : "

    .line 321
    .line 322
    invoke-static {v10, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    return-object v23

    .line 330
    :cond_18
    move v13, v0

    .line 331
    move v0, v15

    .line 332
    :goto_13
    if-eqz v11, :cond_19

    .line 333
    .line 334
    neg-int v10, v10

    .line 335
    :cond_19
    int-to-short v5, v10

    .line 336
    iput-short v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲兰苏:S

    .line 337
    .line 338
    iput-byte v4, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 339
    .line 340
    :goto_14
    if-ne v13, v3, :cond_26

    .line 341
    .line 342
    const/16 v4, 0x6e

    .line 343
    .line 344
    const/16 v5, 0x75

    .line 345
    .line 346
    const/16 v9, 0x6c

    .line 347
    .line 348
    if-ne v0, v4, :cond_1e

    .line 349
    .line 350
    add-int/lit8 v4, v13, 0x1

    .line 351
    .line 352
    aget-char v11, v25, v13

    .line 353
    .line 354
    if-ne v11, v5, :cond_1c

    .line 355
    .line 356
    add-int/lit8 v11, v13, 0x2

    .line 357
    .line 358
    aget-char v4, v25, v4

    .line 359
    .line 360
    if-ne v4, v9, :cond_1d

    .line 361
    .line 362
    add-int/lit8 v4, v13, 0x3

    .line 363
    .line 364
    aget-char v11, v25, v11

    .line 365
    .line 366
    if-ne v11, v9, :cond_1c

    .line 367
    .line 368
    iget-object v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 369
    .line 370
    iget-wide v14, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 371
    .line 372
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 373
    .line 374
    move/from16 v18, v13

    .line 375
    .line 376
    iget-wide v12, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 377
    .line 378
    and-long v11, v14, v12

    .line 379
    .line 380
    cmp-long v0, v11, v26

    .line 381
    .line 382
    if-nez v0, :cond_1b

    .line 383
    .line 384
    const/4 v0, 0x1

    .line 385
    iput-boolean v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 386
    .line 387
    if-ne v4, v6, :cond_1a

    .line 388
    .line 389
    const/16 v0, 0x1a

    .line 390
    .line 391
    goto :goto_15

    .line 392
    :cond_1a
    aget-char v0, v25, v4

    .line 393
    .line 394
    :goto_15
    add-int/lit8 v13, v18, 0x4

    .line 395
    .line 396
    move-object/from16 v9, v23

    .line 397
    .line 398
    :goto_16
    const/4 v4, 0x0

    .line 399
    const/4 v5, 0x1

    .line 400
    const/16 v19, 0x1

    .line 401
    .line 402
    goto/16 :goto_1c

    .line 403
    .line 404
    :cond_1b
    const-string v0, "long value not support input null"

    .line 405
    .line 406
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    return-object v23

    .line 414
    :cond_1c
    move v13, v4

    .line 415
    goto :goto_17

    .line 416
    :cond_1d
    move v13, v11

    .line 417
    goto :goto_17

    .line 418
    :cond_1e
    move/from16 v18, v13

    .line 419
    .line 420
    :goto_17
    const/16 v4, 0x74

    .line 421
    .line 422
    if-ne v0, v4, :cond_20

    .line 423
    .line 424
    add-int/lit8 v4, v13, 0x3

    .line 425
    .line 426
    if-gt v4, v6, :cond_20

    .line 427
    .line 428
    aget-char v11, v25, v13

    .line 429
    .line 430
    const/16 v12, 0x72

    .line 431
    .line 432
    if-ne v11, v12, :cond_20

    .line 433
    .line 434
    add-int/lit8 v11, v13, 0x1

    .line 435
    .line 436
    aget-char v11, v25, v11

    .line 437
    .line 438
    if-ne v11, v5, :cond_20

    .line 439
    .line 440
    add-int/lit8 v5, v13, 0x2

    .line 441
    .line 442
    aget-char v5, v25, v5

    .line 443
    .line 444
    if-ne v5, v14, :cond_20

    .line 445
    .line 446
    sget-object v0, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 447
    .line 448
    if-ne v4, v6, :cond_1f

    .line 449
    .line 450
    const/16 v4, 0x1a

    .line 451
    .line 452
    goto :goto_18

    .line 453
    :cond_1f
    aget-char v4, v25, v4

    .line 454
    .line 455
    :goto_18
    add-int/lit8 v13, v13, 0x4

    .line 456
    .line 457
    :goto_19
    move-object v9, v0

    .line 458
    move v0, v4

    .line 459
    goto :goto_16

    .line 460
    :cond_20
    const/16 v4, 0x66

    .line 461
    .line 462
    if-ne v0, v4, :cond_22

    .line 463
    .line 464
    add-int/lit8 v4, v13, 0x4

    .line 465
    .line 466
    if-gt v4, v6, :cond_22

    .line 467
    .line 468
    aget-char v5, v25, v13

    .line 469
    .line 470
    const/16 v11, 0x61

    .line 471
    .line 472
    if-ne v5, v11, :cond_22

    .line 473
    .line 474
    add-int/lit8 v5, v13, 0x1

    .line 475
    .line 476
    aget-char v5, v25, v5

    .line 477
    .line 478
    if-ne v5, v9, :cond_22

    .line 479
    .line 480
    add-int/lit8 v5, v13, 0x2

    .line 481
    .line 482
    aget-char v5, v25, v5

    .line 483
    .line 484
    const/16 v9, 0x73

    .line 485
    .line 486
    if-ne v5, v9, :cond_22

    .line 487
    .line 488
    add-int/lit8 v5, v13, 0x3

    .line 489
    .line 490
    aget-char v5, v25, v5

    .line 491
    .line 492
    if-ne v5, v14, :cond_22

    .line 493
    .line 494
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 495
    .line 496
    if-ne v4, v6, :cond_21

    .line 497
    .line 498
    const/16 v4, 0x1a

    .line 499
    .line 500
    goto :goto_1a

    .line 501
    :cond_21
    aget-char v4, v25, v4

    .line 502
    .line 503
    :goto_1a
    add-int/lit8 v13, v13, 0x5

    .line 504
    .line 505
    goto :goto_19

    .line 506
    :cond_22
    const/16 v4, 0x7b

    .line 507
    .line 508
    if-ne v0, v4, :cond_23

    .line 509
    .line 510
    if-nez v2, :cond_23

    .line 511
    .line 512
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 513
    .line 514
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 515
    .line 516
    .line 517
    move-wide/from16 v2, v26

    .line 518
    .line 519
    invoke-virtual {v1, v0, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲兰子苏(Ljava/util/Map;J)V

    .line 520
    .line 521
    .line 522
    const/4 v4, 0x0

    .line 523
    iput-boolean v4, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 524
    .line 525
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏兰哲世(Lcom/alibaba/fastjson2/JSONObject;)Ljava/math/BigDecimal;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    return-object v0

    .line 530
    :cond_23
    const/4 v4, 0x0

    .line 531
    const/16 v5, 0x5b

    .line 532
    .line 533
    if-ne v0, v5, :cond_25

    .line 534
    .line 535
    if-nez v2, :cond_25

    .line 536
    .line 537
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏哲世()Ljava/util/List;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 542
    .line 543
    .line 544
    move-result v0

    .line 545
    if-eqz v0, :cond_24

    .line 546
    .line 547
    const/4 v0, 0x1

    .line 548
    iput-boolean v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 549
    .line 550
    return-object v23

    .line 551
    :cond_24
    move-object/from16 v2, v23

    .line 552
    .line 553
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    return-object v2

    .line 561
    :cond_25
    :goto_1b
    move v5, v4

    .line 562
    const/4 v9, 0x0

    .line 563
    goto :goto_1c

    .line 564
    :cond_26
    move/from16 v18, v13

    .line 565
    .line 566
    const/4 v4, 0x0

    .line 567
    goto :goto_1b

    .line 568
    :goto_1c
    sub-int v11, v13, v3

    .line 569
    .line 570
    if-eqz v2, :cond_29

    .line 571
    .line 572
    if-eq v0, v2, :cond_27

    .line 573
    .line 574
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v2

    .line 578
    :try_start_0
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 579
    .line 580
    .line 581
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 582
    return-object v0

    .line 583
    :catch_0
    move-exception v0

    .line 584
    new-instance v3, Ljava/lang/StringBuilder;

    .line 585
    .line 586
    const-string v4, "cast to decimal error "

    .line 587
    .line 588
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v2

    .line 598
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    invoke-static {v1, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 603
    .line 604
    .line 605
    const/16 v23, 0x0

    .line 606
    .line 607
    return-object v23

    .line 608
    :cond_27
    if-lt v13, v6, :cond_28

    .line 609
    .line 610
    const/16 v0, 0x1a

    .line 611
    .line 612
    goto :goto_1d

    .line 613
    :cond_28
    add-int/lit8 v0, v13, 0x1

    .line 614
    .line 615
    aget-char v2, v25, v13

    .line 616
    .line 617
    move v13, v0

    .line 618
    move v0, v2

    .line 619
    :cond_29
    :goto_1d
    if-nez v5, :cond_2f

    .line 620
    .line 621
    if-nez v10, :cond_2b

    .line 622
    .line 623
    if-nez v16, :cond_2b

    .line 624
    .line 625
    const-wide/16 v26, 0x0

    .line 626
    .line 627
    cmp-long v2, v7, v26

    .line 628
    .line 629
    if-eqz v2, :cond_2b

    .line 630
    .line 631
    iget-boolean v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏兰哲:Z

    .line 632
    .line 633
    if-eqz v2, :cond_2a

    .line 634
    .line 635
    neg-long v7, v7

    .line 636
    :cond_2a
    iget-short v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰苏哲:S

    .line 637
    .line 638
    invoke-static {v7, v8, v2}, Ljava/math/BigDecimal;->valueOf(JI)Ljava/math/BigDecimal;

    .line 639
    .line 640
    .line 641
    move-result-object v9

    .line 642
    const/4 v5, 0x1

    .line 643
    :cond_2b
    if-nez v5, :cond_2c

    .line 644
    .line 645
    const/16 v17, 0x1

    .line 646
    .line 647
    add-int/lit8 v3, v3, -0x1

    .line 648
    .line 649
    move-object/from16 v2, v25

    .line 650
    .line 651
    invoke-static {v3, v11, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰苏世哲(II[C)Ljava/math/BigDecimal;

    .line 652
    .line 653
    .line 654
    move-result-object v3

    .line 655
    move-object v9, v3

    .line 656
    goto :goto_1e

    .line 657
    :cond_2c
    move-object/from16 v2, v25

    .line 658
    .line 659
    const/16 v17, 0x1

    .line 660
    .line 661
    :goto_1e
    const/16 v3, 0x4c

    .line 662
    .line 663
    if-eq v0, v3, :cond_2d

    .line 664
    .line 665
    const/16 v3, 0x46

    .line 666
    .line 667
    if-eq v0, v3, :cond_2d

    .line 668
    .line 669
    const/16 v3, 0x44

    .line 670
    .line 671
    if-eq v0, v3, :cond_2d

    .line 672
    .line 673
    const/16 v3, 0x42

    .line 674
    .line 675
    if-eq v0, v3, :cond_2d

    .line 676
    .line 677
    const/16 v3, 0x53

    .line 678
    .line 679
    if-ne v0, v3, :cond_30

    .line 680
    .line 681
    :cond_2d
    if-lt v13, v6, :cond_2e

    .line 682
    .line 683
    :goto_1f
    const/16 v0, 0x1a

    .line 684
    .line 685
    goto :goto_21

    .line 686
    :cond_2e
    add-int/lit8 v0, v13, 0x1

    .line 687
    .line 688
    aget-char v3, v2, v13

    .line 689
    .line 690
    :goto_20
    move v13, v0

    .line 691
    move v0, v3

    .line 692
    goto :goto_21

    .line 693
    :cond_2f
    move-object/from16 v2, v25

    .line 694
    .line 695
    const/16 v17, 0x1

    .line 696
    .line 697
    :cond_30
    :goto_21
    const-wide v7, 0x100003700L

    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    const-wide/16 v10, 0x1

    .line 703
    .line 704
    const/16 v3, 0x20

    .line 705
    .line 706
    if-gt v0, v3, :cond_32

    .line 707
    .line 708
    shl-long v14, v10, v0

    .line 709
    .line 710
    and-long/2addr v14, v7

    .line 711
    const-wide/16 v26, 0x0

    .line 712
    .line 713
    cmp-long v5, v14, v26

    .line 714
    .line 715
    if-eqz v5, :cond_32

    .line 716
    .line 717
    if-ne v13, v6, :cond_31

    .line 718
    .line 719
    goto :goto_1f

    .line 720
    :cond_31
    add-int/lit8 v0, v13, 0x1

    .line 721
    .line 722
    aget-char v3, v2, v13

    .line 723
    .line 724
    goto :goto_20

    .line 725
    :cond_32
    const/16 v5, 0x2c

    .line 726
    .line 727
    if-ne v0, v5, :cond_33

    .line 728
    .line 729
    move/from16 v4, v17

    .line 730
    .line 731
    :cond_33
    iput-boolean v4, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 732
    .line 733
    if-eqz v4, :cond_36

    .line 734
    .line 735
    if-ne v13, v6, :cond_34

    .line 736
    .line 737
    const/16 v4, 0x1a

    .line 738
    .line 739
    goto :goto_22

    .line 740
    :cond_34
    add-int/lit8 v0, v13, 0x1

    .line 741
    .line 742
    aget-char v4, v2, v13

    .line 743
    .line 744
    goto :goto_24

    .line 745
    :goto_22
    move v0, v4

    .line 746
    :goto_23
    if-gt v0, v3, :cond_36

    .line 747
    .line 748
    shl-long v4, v10, v0

    .line 749
    .line 750
    and-long/2addr v4, v7

    .line 751
    const-wide/16 v26, 0x0

    .line 752
    .line 753
    cmp-long v4, v4, v26

    .line 754
    .line 755
    if-eqz v4, :cond_36

    .line 756
    .line 757
    if-ne v13, v6, :cond_35

    .line 758
    .line 759
    const/16 v0, 0x1a

    .line 760
    .line 761
    goto :goto_23

    .line 762
    :cond_35
    add-int/lit8 v0, v13, 0x1

    .line 763
    .line 764
    aget-char v4, v2, v13

    .line 765
    .line 766
    :goto_24
    move v13, v0

    .line 767
    goto :goto_22

    .line 768
    :cond_36
    if-eqz v19, :cond_37

    .line 769
    .line 770
    iput-char v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 771
    .line 772
    iput v13, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 773
    .line 774
    return-object v9

    .line 775
    :cond_37
    const-string v0, "illegal input error"

    .line 776
    .line 777
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 782
    .line 783
    .line 784
    const/16 v23, 0x0

    .line 785
    .line 786
    return-object v23
.end method

.method public final 飘花落叶言子兰哲世楪苏()F
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 6
    .line 7
    const/16 v3, 0x22

    .line 8
    .line 9
    iget-object v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 10
    .line 11
    iget v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 12
    .line 13
    if-eq v1, v3, :cond_1

    .line 14
    .line 15
    const/16 v3, 0x27

    .line 16
    .line 17
    if-ne v1, v3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v3, v2

    .line 21
    move v2, v1

    .line 22
    const/4 v1, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    if-ne v2, v7, :cond_2

    .line 25
    .line 26
    move v3, v2

    .line 27
    const/16 v2, 0x1a

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    add-int/lit8 v3, v2, 0x1

    .line 31
    .line 32
    aget-char v2, v5, v2

    .line 33
    .line 34
    :goto_1
    const/16 v8, 0x2c

    .line 35
    .line 36
    const-wide/16 v11, 0x0

    .line 37
    .line 38
    if-eqz v1, :cond_4

    .line 39
    .line 40
    if-ne v2, v1, :cond_4

    .line 41
    .line 42
    if-ne v3, v7, :cond_3

    .line 43
    .line 44
    const/16 v2, 0x1a

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_3
    add-int/lit8 v1, v3, 0x1

    .line 48
    .line 49
    aget-char v2, v5, v3

    .line 50
    .line 51
    move v3, v1

    .line 52
    :goto_2
    move-wide v9, v11

    .line 53
    move-wide/from16 v22, v9

    .line 54
    .line 55
    const/4 v13, 0x1

    .line 56
    const/4 v14, 0x0

    .line 57
    const-wide/16 v16, 0x1

    .line 58
    .line 59
    goto/16 :goto_1a

    .line 60
    .line 61
    :cond_4
    const/16 v15, 0x2b

    .line 62
    .line 63
    const/16 v4, 0x2d

    .line 64
    .line 65
    const/16 v6, 0x30

    .line 66
    .line 67
    if-lt v2, v6, :cond_5

    .line 68
    .line 69
    const/16 v6, 0x39

    .line 70
    .line 71
    if-gt v2, v6, :cond_5

    .line 72
    .line 73
    rsub-int/lit8 v6, v2, 0x30

    .line 74
    .line 75
    const-wide/16 v16, 0x1

    .line 76
    .line 77
    int-to-long v9, v6

    .line 78
    goto :goto_4

    .line 79
    :cond_5
    const-wide/16 v16, 0x1

    .line 80
    .line 81
    if-eq v2, v4, :cond_7

    .line 82
    .line 83
    if-ne v2, v15, :cond_6

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_6
    move-wide/from16 v9, v16

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_7
    :goto_3
    move-wide v9, v11

    .line 90
    :goto_4
    cmp-long v6, v9, v11

    .line 91
    .line 92
    const-wide/16 v18, 0x64

    .line 93
    .line 94
    const-wide v20, -0x147ae147ae147aeL

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    move-wide/from16 v22, v11

    .line 100
    .line 101
    const/4 v11, -0x1

    .line 102
    if-gtz v6, :cond_9

    .line 103
    .line 104
    add-int/lit8 v12, v3, 0x1

    .line 105
    .line 106
    if-ge v12, v7, :cond_9

    .line 107
    .line 108
    invoke-static {v3, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 109
    .line 110
    .line 111
    move-result v12

    .line 112
    if-eq v12, v11, :cond_9

    .line 113
    .line 114
    cmp-long v6, v20, v9

    .line 115
    .line 116
    if-gtz v6, :cond_8

    .line 117
    .line 118
    mul-long v9, v9, v18

    .line 119
    .line 120
    int-to-long v11, v12

    .line 121
    sub-long/2addr v9, v11

    .line 122
    add-int/lit8 v3, v3, 0x2

    .line 123
    .line 124
    :goto_5
    move-wide/from16 v11, v22

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_8
    move-wide/from16 v9, v16

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_9
    const-wide/16 v24, 0x30

    .line 131
    .line 132
    const-wide/16 v26, 0xa

    .line 133
    .line 134
    const-wide v28, -0xcccccccccccccccL

    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    if-gtz v6, :cond_c

    .line 140
    .line 141
    if-ge v3, v7, :cond_c

    .line 142
    .line 143
    aget-char v6, v5, v3

    .line 144
    .line 145
    invoke-static {v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲楪兰苏(I)Z

    .line 146
    .line 147
    .line 148
    move-result v12

    .line 149
    if-eqz v12, :cond_b

    .line 150
    .line 151
    cmp-long v12, v28, v9

    .line 152
    .line 153
    if-gtz v12, :cond_a

    .line 154
    .line 155
    mul-long v9, v9, v26

    .line 156
    .line 157
    add-long v9, v9, v24

    .line 158
    .line 159
    const/16 v30, 0x0

    .line 160
    .line 161
    int-to-long v13, v6

    .line 162
    sub-long/2addr v9, v13

    .line 163
    add-int/lit8 v3, v3, 0x1

    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_a
    const/16 v30, 0x0

    .line 167
    .line 168
    move-wide/from16 v9, v16

    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_b
    const/16 v30, 0x0

    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_c
    const/16 v30, 0x0

    .line 175
    .line 176
    move v6, v2

    .line 177
    :goto_6
    cmp-long v13, v9, v22

    .line 178
    .line 179
    if-gtz v13, :cond_10

    .line 180
    .line 181
    if-ge v3, v7, :cond_10

    .line 182
    .line 183
    aget-char v13, v5, v3

    .line 184
    .line 185
    const/16 v14, 0x2e

    .line 186
    .line 187
    if-ne v13, v14, :cond_10

    .line 188
    .line 189
    add-int/lit8 v3, v3, 0x1

    .line 190
    .line 191
    const/4 v13, 0x0

    .line 192
    :goto_7
    cmp-long v14, v9, v22

    .line 193
    .line 194
    if-gtz v14, :cond_e

    .line 195
    .line 196
    add-int/lit8 v12, v3, 0x1

    .line 197
    .line 198
    if-ge v12, v7, :cond_e

    .line 199
    .line 200
    invoke-static {v3, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 201
    .line 202
    .line 203
    move-result v12

    .line 204
    if-eq v12, v11, :cond_e

    .line 205
    .line 206
    cmp-long v14, v20, v9

    .line 207
    .line 208
    if-gtz v14, :cond_d

    .line 209
    .line 210
    mul-long v9, v9, v18

    .line 211
    .line 212
    int-to-long v11, v12

    .line 213
    sub-long/2addr v9, v11

    .line 214
    add-int/lit8 v3, v3, 0x2

    .line 215
    .line 216
    add-int/lit8 v13, v13, 0x2

    .line 217
    .line 218
    const/4 v11, -0x1

    .line 219
    goto :goto_7

    .line 220
    :cond_d
    move-wide/from16 v9, v16

    .line 221
    .line 222
    goto :goto_7

    .line 223
    :cond_e
    if-gtz v14, :cond_11

    .line 224
    .line 225
    if-ge v3, v7, :cond_11

    .line 226
    .line 227
    aget-char v6, v5, v3

    .line 228
    .line 229
    invoke-static {v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲楪兰苏(I)Z

    .line 230
    .line 231
    .line 232
    move-result v11

    .line 233
    if-eqz v11, :cond_11

    .line 234
    .line 235
    cmp-long v11, v28, v9

    .line 236
    .line 237
    if-gtz v11, :cond_f

    .line 238
    .line 239
    mul-long v9, v9, v26

    .line 240
    .line 241
    add-long v9, v9, v24

    .line 242
    .line 243
    int-to-long v11, v6

    .line 244
    sub-long/2addr v9, v11

    .line 245
    add-int/lit8 v3, v3, 0x1

    .line 246
    .line 247
    add-int/lit8 v13, v13, 0x1

    .line 248
    .line 249
    goto :goto_8

    .line 250
    :cond_f
    move-wide/from16 v9, v16

    .line 251
    .line 252
    goto :goto_8

    .line 253
    :cond_10
    const/4 v13, 0x0

    .line 254
    :cond_11
    :goto_8
    cmp-long v11, v9, v22

    .line 255
    .line 256
    if-gtz v11, :cond_13

    .line 257
    .line 258
    if-ne v3, v7, :cond_12

    .line 259
    .line 260
    const/16 v6, 0x1a

    .line 261
    .line 262
    goto :goto_9

    .line 263
    :cond_12
    add-int/lit8 v6, v3, 0x1

    .line 264
    .line 265
    aget-char v3, v5, v3

    .line 266
    .line 267
    move/from16 v31, v6

    .line 268
    .line 269
    move v6, v3

    .line 270
    move/from16 v3, v31

    .line 271
    .line 272
    :cond_13
    :goto_9
    if-gtz v11, :cond_23

    .line 273
    .line 274
    const/16 v11, 0x65

    .line 275
    .line 276
    if-eq v6, v11, :cond_17

    .line 277
    .line 278
    const/16 v11, 0x45

    .line 279
    .line 280
    if-ne v6, v11, :cond_14

    .line 281
    .line 282
    goto :goto_b

    .line 283
    :cond_14
    const/16 v11, 0x4c

    .line 284
    .line 285
    if-eq v6, v11, :cond_15

    .line 286
    .line 287
    const/16 v11, 0x46

    .line 288
    .line 289
    if-eq v6, v11, :cond_15

    .line 290
    .line 291
    const/16 v11, 0x44

    .line 292
    .line 293
    if-eq v6, v11, :cond_15

    .line 294
    .line 295
    const/16 v11, 0x42

    .line 296
    .line 297
    if-eq v6, v11, :cond_15

    .line 298
    .line 299
    const/16 v11, 0x53

    .line 300
    .line 301
    if-ne v6, v11, :cond_23

    .line 302
    .line 303
    :cond_15
    if-ne v3, v7, :cond_16

    .line 304
    .line 305
    :goto_a
    const/16 v6, 0x1a

    .line 306
    .line 307
    goto/16 :goto_11

    .line 308
    .line 309
    :cond_16
    add-int/lit8 v6, v3, 0x1

    .line 310
    .line 311
    aget-char v3, v5, v3

    .line 312
    .line 313
    move/from16 v31, v6

    .line 314
    .line 315
    move v6, v3

    .line 316
    move/from16 v3, v31

    .line 317
    .line 318
    goto/16 :goto_11

    .line 319
    .line 320
    :cond_17
    :goto_b
    if-ne v3, v7, :cond_18

    .line 321
    .line 322
    move v6, v3

    .line 323
    const/16 v3, 0x1a

    .line 324
    .line 325
    goto :goto_c

    .line 326
    :cond_18
    add-int/lit8 v6, v3, 0x1

    .line 327
    .line 328
    aget-char v3, v5, v3

    .line 329
    .line 330
    :goto_c
    if-ne v3, v4, :cond_19

    .line 331
    .line 332
    const/4 v11, 0x1

    .line 333
    goto :goto_d

    .line 334
    :cond_19
    const/4 v11, 0x0

    .line 335
    :goto_d
    if-nez v11, :cond_1c

    .line 336
    .line 337
    if-ne v3, v15, :cond_1a

    .line 338
    .line 339
    goto :goto_e

    .line 340
    :cond_1a
    if-eq v3, v8, :cond_1b

    .line 341
    .line 342
    goto :goto_f

    .line 343
    :cond_1b
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰楪世苏()Lcom/alibaba/fastjson2/JSONException;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    throw v0

    .line 348
    :cond_1c
    :goto_e
    if-ne v6, v7, :cond_1d

    .line 349
    .line 350
    const/16 v3, 0x1a

    .line 351
    .line 352
    goto :goto_f

    .line 353
    :cond_1d
    add-int/lit8 v3, v6, 0x1

    .line 354
    .line 355
    aget-char v6, v5, v6

    .line 356
    .line 357
    move/from16 v31, v6

    .line 358
    .line 359
    move v6, v3

    .line 360
    move/from16 v3, v31

    .line 361
    .line 362
    :goto_f
    invoke-static {v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲楪兰苏(I)Z

    .line 363
    .line 364
    .line 365
    move-result v12

    .line 366
    if-eqz v12, :cond_22

    .line 367
    .line 368
    add-int/lit8 v3, v3, -0x30

    .line 369
    .line 370
    :goto_10
    if-ge v6, v7, :cond_1f

    .line 371
    .line 372
    aget-char v12, v5, v6

    .line 373
    .line 374
    invoke-static {v12}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲楪兰苏(I)Z

    .line 375
    .line 376
    .line 377
    move-result v14

    .line 378
    if-eqz v14, :cond_1f

    .line 379
    .line 380
    add-int/lit8 v12, v12, -0x30

    .line 381
    .line 382
    mul-int/lit8 v3, v3, 0xa

    .line 383
    .line 384
    add-int/2addr v3, v12

    .line 385
    const/16 v12, 0x7ff

    .line 386
    .line 387
    if-gt v3, v12, :cond_1e

    .line 388
    .line 389
    add-int/lit8 v6, v6, 0x1

    .line 390
    .line 391
    goto :goto_10

    .line 392
    :cond_1e
    const-string v0, "too large exp value : "

    .line 393
    .line 394
    invoke-static {v3, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    return v30

    .line 402
    :cond_1f
    if-eqz v11, :cond_20

    .line 403
    .line 404
    neg-int v3, v3

    .line 405
    :cond_20
    sub-int/2addr v13, v3

    .line 406
    if-ne v6, v7, :cond_21

    .line 407
    .line 408
    move v3, v6

    .line 409
    goto :goto_a

    .line 410
    :cond_21
    add-int/lit8 v3, v6, 0x1

    .line 411
    .line 412
    aget-char v6, v5, v6

    .line 413
    .line 414
    goto :goto_11

    .line 415
    :cond_22
    move v9, v6

    .line 416
    move v6, v3

    .line 417
    move v3, v9

    .line 418
    move-wide/from16 v9, v16

    .line 419
    .line 420
    :cond_23
    :goto_11
    cmp-long v11, v9, v22

    .line 421
    .line 422
    if-gtz v11, :cond_26

    .line 423
    .line 424
    if-eqz v1, :cond_26

    .line 425
    .line 426
    if-ne v6, v1, :cond_25

    .line 427
    .line 428
    if-ne v3, v7, :cond_24

    .line 429
    .line 430
    move v1, v3

    .line 431
    const/16 v3, 0x1a

    .line 432
    .line 433
    goto :goto_12

    .line 434
    :cond_24
    add-int/lit8 v1, v3, 0x1

    .line 435
    .line 436
    aget-char v3, v5, v3

    .line 437
    .line 438
    :goto_12
    move v6, v3

    .line 439
    move v3, v1

    .line 440
    goto :goto_13

    .line 441
    :cond_25
    move-wide/from16 v9, v16

    .line 442
    .line 443
    :cond_26
    :goto_13
    cmp-long v1, v9, v22

    .line 444
    .line 445
    if-gtz v1, :cond_2f

    .line 446
    .line 447
    if-nez v13, :cond_27

    .line 448
    .line 449
    long-to-float v11, v9

    .line 450
    :goto_14
    const/4 v12, 0x1

    .line 451
    goto :goto_15

    .line 452
    :cond_27
    long-to-float v11, v9

    .line 453
    float-to-long v14, v11

    .line 454
    cmp-long v12, v14, v9

    .line 455
    .line 456
    if-nez v12, :cond_29

    .line 457
    .line 458
    if-lez v13, :cond_28

    .line 459
    .line 460
    sget-object v12, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:[F

    .line 461
    .line 462
    const/16 v14, 0xb

    .line 463
    .line 464
    if-ge v13, v14, :cond_28

    .line 465
    .line 466
    aget v12, v12, v13

    .line 467
    .line 468
    div-float/2addr v11, v12

    .line 469
    goto :goto_14

    .line 470
    :cond_28
    if-gez v13, :cond_29

    .line 471
    .line 472
    sget-object v12, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:[F

    .line 473
    .line 474
    const/16 v14, -0xb

    .line 475
    .line 476
    if-le v13, v14, :cond_29

    .line 477
    .line 478
    neg-int v14, v13

    .line 479
    aget v12, v12, v14

    .line 480
    .line 481
    mul-float/2addr v11, v12

    .line 482
    goto :goto_14

    .line 483
    :cond_29
    move/from16 v11, v30

    .line 484
    .line 485
    const/4 v12, 0x0

    .line 486
    :goto_15
    if-nez v12, :cond_2c

    .line 487
    .line 488
    if-lez v13, :cond_2b

    .line 489
    .line 490
    const/16 v1, 0x80

    .line 491
    .line 492
    if-ge v13, v1, :cond_2b

    .line 493
    .line 494
    if-ne v2, v4, :cond_2a

    .line 495
    .line 496
    const/4 v11, -0x1

    .line 497
    goto :goto_16

    .line 498
    :cond_2a
    const/4 v11, 0x1

    .line 499
    :goto_16
    invoke-static {v9, v10}, Ljava/lang/Math;->abs(J)J

    .line 500
    .line 501
    .line 502
    move-result-wide v1

    .line 503
    invoke-static {v11, v13, v1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏世哲兰(IIJ)F

    .line 504
    .line 505
    .line 506
    move-result v14

    .line 507
    :goto_17
    move v2, v6

    .line 508
    :goto_18
    const/4 v13, 0x0

    .line 509
    goto :goto_1a

    .line 510
    :cond_2b
    move v2, v6

    .line 511
    move v14, v11

    .line 512
    move-wide/from16 v9, v16

    .line 513
    .line 514
    goto :goto_18

    .line 515
    :cond_2c
    if-eq v2, v4, :cond_2d

    .line 516
    .line 517
    cmpl-float v1, v11, v30

    .line 518
    .line 519
    if-eqz v1, :cond_2e

    .line 520
    .line 521
    :goto_19
    neg-float v14, v11

    .line 522
    goto :goto_17

    .line 523
    :cond_2d
    if-nez v1, :cond_2e

    .line 524
    .line 525
    goto :goto_19

    .line 526
    :cond_2e
    move v2, v6

    .line 527
    move v14, v11

    .line 528
    goto :goto_18

    .line 529
    :cond_2f
    move v2, v6

    .line 530
    move/from16 v14, v30

    .line 531
    .line 532
    goto :goto_18

    .line 533
    :goto_1a
    cmp-long v1, v9, v22

    .line 534
    .line 535
    if-lez v1, :cond_30

    .line 536
    .line 537
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪世哲苏子兰()V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲兰苏()D

    .line 541
    .line 542
    .line 543
    move-result-wide v0

    .line 544
    double-to-float v0, v0

    .line 545
    return v0

    .line 546
    :cond_30
    :goto_1b
    const-wide v9, 0x100003700L

    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    const/16 v1, 0x20

    .line 552
    .line 553
    if-gt v2, v1, :cond_32

    .line 554
    .line 555
    shl-long v11, v16, v2

    .line 556
    .line 557
    and-long/2addr v11, v9

    .line 558
    cmp-long v4, v11, v22

    .line 559
    .line 560
    if-eqz v4, :cond_32

    .line 561
    .line 562
    if-ne v3, v7, :cond_31

    .line 563
    .line 564
    const/16 v2, 0x1a

    .line 565
    .line 566
    goto :goto_1b

    .line 567
    :cond_31
    add-int/lit8 v1, v3, 0x1

    .line 568
    .line 569
    aget-char v2, v5, v3

    .line 570
    .line 571
    move v3, v1

    .line 572
    goto :goto_1b

    .line 573
    :cond_32
    if-ne v2, v8, :cond_33

    .line 574
    .line 575
    const/4 v6, 0x1

    .line 576
    goto :goto_1c

    .line 577
    :cond_33
    const/4 v6, 0x0

    .line 578
    :goto_1c
    iput-boolean v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 579
    .line 580
    if-eqz v6, :cond_36

    .line 581
    .line 582
    if-ne v3, v7, :cond_34

    .line 583
    .line 584
    move v2, v3

    .line 585
    const/16 v3, 0x1a

    .line 586
    .line 587
    goto :goto_1d

    .line 588
    :cond_34
    add-int/lit8 v2, v3, 0x1

    .line 589
    .line 590
    aget-char v3, v5, v3

    .line 591
    .line 592
    :goto_1d
    move/from16 v31, v3

    .line 593
    .line 594
    move v3, v2

    .line 595
    move/from16 v2, v31

    .line 596
    .line 597
    :goto_1e
    if-gt v2, v1, :cond_36

    .line 598
    .line 599
    shl-long v11, v16, v2

    .line 600
    .line 601
    and-long/2addr v11, v9

    .line 602
    cmp-long v4, v11, v22

    .line 603
    .line 604
    if-eqz v4, :cond_36

    .line 605
    .line 606
    if-ne v3, v7, :cond_35

    .line 607
    .line 608
    const/16 v2, 0x1a

    .line 609
    .line 610
    goto :goto_1e

    .line 611
    :cond_35
    add-int/lit8 v2, v3, 0x1

    .line 612
    .line 613
    aget-char v3, v5, v3

    .line 614
    .line 615
    goto :goto_1d

    .line 616
    :cond_36
    iput-boolean v13, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 617
    .line 618
    int-to-char v1, v2

    .line 619
    iput-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 620
    .line 621
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 622
    .line 623
    return v14
.end method

.method public final 飘花落叶言子兰哲世苏楪()[B
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 6
    .line 7
    const/16 v3, 0x78

    .line 8
    .line 9
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 10
    .line 11
    const/16 v5, 0x1a

    .line 12
    .line 13
    iget-object v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 14
    .line 15
    if-ne v1, v3, :cond_1

    .line 16
    .line 17
    if-ne v2, v4, :cond_0

    .line 18
    .line 19
    move v1, v5

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    add-int/lit8 v1, v2, 0x1

    .line 22
    .line 23
    aget-char v2, v6, v2

    .line 24
    .line 25
    move/from16 v18, v2

    .line 26
    .line 27
    move v2, v1

    .line 28
    move/from16 v1, v18

    .line 29
    .line 30
    :cond_1
    :goto_0
    const/16 v3, 0x27

    .line 31
    .line 32
    if-eq v1, v3, :cond_3

    .line 33
    .line 34
    const/16 v3, 0x22

    .line 35
    .line 36
    if-ne v1, v3, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏哲子世兰(II)Lcom/alibaba/fastjson2/JSONException;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    throw v0

    .line 44
    :cond_3
    :goto_1
    if-ne v2, v4, :cond_4

    .line 45
    .line 46
    move v3, v2

    .line 47
    :goto_2
    move v7, v5

    .line 48
    goto :goto_3

    .line 49
    :cond_4
    add-int/lit8 v3, v2, 0x1

    .line 50
    .line 51
    aget-char v7, v6, v2

    .line 52
    .line 53
    :goto_3
    const/16 v8, 0x39

    .line 54
    .line 55
    const/16 v9, 0x30

    .line 56
    .line 57
    if-lt v7, v9, :cond_5

    .line 58
    .line 59
    if-le v7, v8, :cond_6

    .line 60
    .line 61
    :cond_5
    const/16 v10, 0x41

    .line 62
    .line 63
    if-lt v7, v10, :cond_8

    .line 64
    .line 65
    const/16 v10, 0x46

    .line 66
    .line 67
    if-gt v7, v10, :cond_8

    .line 68
    .line 69
    :cond_6
    if-ne v3, v4, :cond_7

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_7
    add-int/lit8 v7, v3, 0x1

    .line 73
    .line 74
    aget-char v3, v6, v3

    .line 75
    .line 76
    move/from16 v18, v7

    .line 77
    .line 78
    move v7, v3

    .line 79
    move/from16 v3, v18

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_8
    if-ne v7, v1, :cond_18

    .line 83
    .line 84
    if-ne v3, v4, :cond_9

    .line 85
    .line 86
    move v1, v3

    .line 87
    move v3, v5

    .line 88
    goto :goto_4

    .line 89
    :cond_9
    add-int/lit8 v1, v3, 0x1

    .line 90
    .line 91
    aget-char v3, v6, v3

    .line 92
    .line 93
    :goto_4
    sub-int v7, v1, v2

    .line 94
    .line 95
    add-int/lit8 v10, v7, -0x2

    .line 96
    .line 97
    const/4 v11, 0x1

    .line 98
    if-ne v3, v5, :cond_a

    .line 99
    .line 100
    add-int/lit8 v10, v7, -0x1

    .line 101
    .line 102
    :cond_a
    rem-int/lit8 v7, v10, 0x2

    .line 103
    .line 104
    if-nez v7, :cond_17

    .line 105
    .line 106
    div-int/lit8 v10, v10, 0x2

    .line 107
    .line 108
    new-array v7, v10, [B

    .line 109
    .line 110
    const/4 v12, 0x0

    .line 111
    :goto_5
    if-ge v12, v10, :cond_d

    .line 112
    .line 113
    mul-int/lit8 v13, v12, 0x2

    .line 114
    .line 115
    add-int/2addr v13, v2

    .line 116
    aget-char v14, v6, v13

    .line 117
    .line 118
    add-int/2addr v13, v11

    .line 119
    aget-char v13, v6, v13

    .line 120
    .line 121
    const/16 v15, 0x37

    .line 122
    .line 123
    if-gt v14, v8, :cond_b

    .line 124
    .line 125
    move/from16 v16, v9

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_b
    move/from16 v16, v15

    .line 129
    .line 130
    :goto_6
    sub-int v14, v14, v16

    .line 131
    .line 132
    if-gt v13, v8, :cond_c

    .line 133
    .line 134
    move v15, v9

    .line 135
    :cond_c
    sub-int/2addr v13, v15

    .line 136
    shl-int/lit8 v14, v14, 0x4

    .line 137
    .line 138
    or-int/2addr v13, v14

    .line 139
    int-to-byte v13, v13

    .line 140
    aput-byte v13, v7, v12

    .line 141
    .line 142
    add-int/lit8 v12, v12, 0x1

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_d
    :goto_7
    const-wide/16 v8, 0x0

    .line 146
    .line 147
    const-wide v12, 0x100003700L

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    const-wide/16 v14, 0x1

    .line 153
    .line 154
    const/16 v2, 0x20

    .line 155
    .line 156
    if-gt v3, v2, :cond_f

    .line 157
    .line 158
    shl-long v16, v14, v3

    .line 159
    .line 160
    and-long v16, v16, v12

    .line 161
    .line 162
    cmp-long v10, v16, v8

    .line 163
    .line 164
    if-eqz v10, :cond_f

    .line 165
    .line 166
    if-ne v1, v4, :cond_e

    .line 167
    .line 168
    move v3, v5

    .line 169
    goto :goto_7

    .line 170
    :cond_e
    add-int/lit8 v2, v1, 0x1

    .line 171
    .line 172
    aget-char v1, v6, v1

    .line 173
    .line 174
    move v3, v1

    .line 175
    move v1, v2

    .line 176
    goto :goto_7

    .line 177
    :cond_f
    const/16 v10, 0x2c

    .line 178
    .line 179
    if-ne v3, v10, :cond_16

    .line 180
    .line 181
    if-lt v1, v4, :cond_10

    .line 182
    .line 183
    goto :goto_b

    .line 184
    :cond_10
    iput-boolean v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 185
    .line 186
    if-ne v1, v4, :cond_11

    .line 187
    .line 188
    move v3, v1

    .line 189
    :goto_8
    move v1, v5

    .line 190
    goto :goto_9

    .line 191
    :cond_11
    add-int/lit8 v3, v1, 0x1

    .line 192
    .line 193
    aget-char v1, v6, v1

    .line 194
    .line 195
    :goto_9
    if-eqz v1, :cond_14

    .line 196
    .line 197
    if-gt v1, v2, :cond_12

    .line 198
    .line 199
    shl-long v10, v14, v1

    .line 200
    .line 201
    and-long/2addr v10, v12

    .line 202
    cmp-long v10, v10, v8

    .line 203
    .line 204
    if-eqz v10, :cond_12

    .line 205
    .line 206
    goto :goto_a

    .line 207
    :cond_12
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 208
    .line 209
    iput-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 210
    .line 211
    const/16 v2, 0x2f

    .line 212
    .line 213
    if-ne v1, v2, :cond_13

    .line 214
    .line 215
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏世子兰哲()V

    .line 216
    .line 217
    .line 218
    :cond_13
    return-object v7

    .line 219
    :cond_14
    :goto_a
    if-ne v3, v4, :cond_15

    .line 220
    .line 221
    goto :goto_8

    .line 222
    :cond_15
    add-int/lit8 v1, v3, 0x1

    .line 223
    .line 224
    aget-char v3, v6, v3

    .line 225
    .line 226
    move/from16 v18, v3

    .line 227
    .line 228
    move v3, v1

    .line 229
    move/from16 v1, v18

    .line 230
    .line 231
    goto :goto_9

    .line 232
    :cond_16
    :goto_b
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 233
    .line 234
    iput-char v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 235
    .line 236
    return-object v7

    .line 237
    :cond_17
    invoke-static {v1, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏哲子世兰(II)Lcom/alibaba/fastjson2/JSONException;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    throw v0

    .line 242
    :cond_18
    invoke-static {v3, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏哲子世兰(II)Lcom/alibaba/fastjson2/JSONException;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    throw v0
.end method

.method public final 飘花落叶言子兰哲苏楪世()Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 4
    .line 5
    iget-char v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 6
    .line 7
    const/16 v3, 0x6e

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-ne v2, v3, :cond_7

    .line 11
    .line 12
    iget-object v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 13
    .line 14
    aget-char v3, v2, v1

    .line 15
    .line 16
    const/16 v5, 0x75

    .line 17
    .line 18
    if-ne v3, v5, :cond_7

    .line 19
    .line 20
    add-int/lit8 v3, v1, 0x1

    .line 21
    .line 22
    aget-char v3, v2, v3

    .line 23
    .line 24
    const/16 v5, 0x6c

    .line 25
    .line 26
    if-ne v3, v5, :cond_7

    .line 27
    .line 28
    add-int/lit8 v3, v1, 0x2

    .line 29
    .line 30
    aget-char v3, v2, v3

    .line 31
    .line 32
    if-ne v3, v5, :cond_7

    .line 33
    .line 34
    add-int/lit8 v3, v1, 0x3

    .line 35
    .line 36
    const/16 v5, 0x1a

    .line 37
    .line 38
    iget v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 39
    .line 40
    if-ne v3, v6, :cond_0

    .line 41
    .line 42
    move v3, v5

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    aget-char v3, v2, v3

    .line 45
    .line 46
    :goto_0
    add-int/lit8 v1, v1, 0x4

    .line 47
    .line 48
    :goto_1
    const-wide/16 v7, 0x0

    .line 49
    .line 50
    const-wide v9, 0x100003700L

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    const-wide/16 v11, 0x1

    .line 56
    .line 57
    const/16 v13, 0x20

    .line 58
    .line 59
    if-gt v3, v13, :cond_2

    .line 60
    .line 61
    shl-long v14, v11, v3

    .line 62
    .line 63
    and-long/2addr v14, v9

    .line 64
    cmp-long v14, v14, v7

    .line 65
    .line 66
    if-eqz v14, :cond_2

    .line 67
    .line 68
    if-ne v1, v6, :cond_1

    .line 69
    .line 70
    move v3, v5

    .line 71
    goto :goto_1

    .line 72
    :cond_1
    add-int/lit8 v3, v1, 0x1

    .line 73
    .line 74
    aget-char v1, v2, v1

    .line 75
    .line 76
    move/from16 v18, v3

    .line 77
    .line 78
    move v3, v1

    .line 79
    move/from16 v1, v18

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    const/16 v14, 0x2c

    .line 83
    .line 84
    const/4 v15, 0x1

    .line 85
    if-ne v3, v14, :cond_3

    .line 86
    .line 87
    move v4, v15

    .line 88
    :cond_3
    iput-boolean v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 89
    .line 90
    if-eqz v4, :cond_6

    .line 91
    .line 92
    if-ne v1, v6, :cond_4

    .line 93
    .line 94
    move v3, v1

    .line 95
    move v1, v5

    .line 96
    goto :goto_2

    .line 97
    :cond_4
    add-int/lit8 v3, v1, 0x1

    .line 98
    .line 99
    aget-char v1, v2, v1

    .line 100
    .line 101
    :goto_2
    move/from16 v18, v3

    .line 102
    .line 103
    move v3, v1

    .line 104
    move/from16 v1, v18

    .line 105
    .line 106
    :goto_3
    if-gt v3, v13, :cond_6

    .line 107
    .line 108
    shl-long v16, v11, v3

    .line 109
    .line 110
    and-long v16, v16, v9

    .line 111
    .line 112
    cmp-long v4, v16, v7

    .line 113
    .line 114
    if-eqz v4, :cond_6

    .line 115
    .line 116
    if-ne v1, v6, :cond_5

    .line 117
    .line 118
    move v3, v5

    .line 119
    goto :goto_3

    .line 120
    :cond_5
    add-int/lit8 v3, v1, 0x1

    .line 121
    .line 122
    aget-char v1, v2, v1

    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_6
    iput-char v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 126
    .line 127
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 128
    .line 129
    return v15

    .line 130
    :cond_7
    return v4
.end method

.method public final 飘花落叶言子兰苏世哲楪()Ljava/lang/String;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 4
    .line 5
    iget-object v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    const/16 v5, 0x27

    .line 10
    .line 11
    if-ne v1, v5, :cond_1

    .line 12
    .line 13
    iget-wide v6, v2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 14
    .line 15
    sget-object v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->DisableSingleQuote:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 16
    .line 17
    iget-wide v8, v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 18
    .line 19
    and-long/2addr v6, v8

    .line 20
    cmp-long v6, v6, v3

    .line 21
    .line 22
    if-nez v6, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏兰世楪()Lcom/alibaba/fastjson2/JSONException;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    throw v0

    .line 30
    :cond_1
    :goto_0
    const/16 v6, 0x22

    .line 31
    .line 32
    const/4 v7, 0x0

    .line 33
    if-eq v1, v6, :cond_3

    .line 34
    .line 35
    if-eq v1, v5, :cond_3

    .line 36
    .line 37
    iget-wide v5, v2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 38
    .line 39
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->AllowUnQuotedFieldNames:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 40
    .line 41
    iget-wide v8, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 42
    .line 43
    and-long/2addr v5, v8

    .line 44
    cmp-long v2, v5, v3

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    invoke-static {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲楪世兰(I)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲楪世苏()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    return-object v0

    .line 59
    :cond_2
    return-object v7

    .line 60
    :cond_3
    const/4 v2, 0x0

    .line 61
    iput-boolean v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏哲世:Z

    .line 62
    .line 63
    iget v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 64
    .line 65
    iput v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪苏哲:I

    .line 66
    .line 67
    move v6, v5

    .line 68
    :goto_1
    const-string v8, "syntax error : "

    .line 69
    .line 70
    const/16 v9, 0x20

    .line 71
    .line 72
    const/4 v10, 0x1

    .line 73
    iget-object v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 74
    .line 75
    iget v12, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 76
    .line 77
    if-ge v6, v12, :cond_d

    .line 78
    .line 79
    aget-char v13, v11, v6

    .line 80
    .line 81
    const/16 v14, 0x5c

    .line 82
    .line 83
    if-ne v13, v14, :cond_6

    .line 84
    .line 85
    iput-boolean v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏哲世:Z

    .line 86
    .line 87
    add-int/lit8 v8, v6, 0x1

    .line 88
    .line 89
    aget-char v8, v11, v8

    .line 90
    .line 91
    const/16 v9, 0x75

    .line 92
    .line 93
    if-ne v8, v9, :cond_4

    .line 94
    .line 95
    const/4 v8, 0x6

    .line 96
    goto :goto_2

    .line 97
    :cond_4
    const/16 v9, 0x78

    .line 98
    .line 99
    if-ne v8, v9, :cond_5

    .line 100
    .line 101
    const/4 v8, 0x4

    .line 102
    goto :goto_2

    .line 103
    :cond_5
    const/4 v8, 0x2

    .line 104
    :goto_2
    add-int/2addr v6, v8

    .line 105
    goto :goto_5

    .line 106
    :cond_6
    if-ne v13, v1, :cond_c

    .line 107
    .line 108
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰苏楪哲:I

    .line 109
    .line 110
    iput v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪哲苏:I

    .line 111
    .line 112
    add-int/lit8 v6, v6, 0x1

    .line 113
    .line 114
    if-ge v6, v12, :cond_7

    .line 115
    .line 116
    aget-char v2, v11, v6

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_7
    const/16 v2, 0x1a

    .line 120
    .line 121
    :goto_3
    const-wide v13, 0x100003700L

    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    const-wide/16 v15, 0x1

    .line 127
    .line 128
    if-gt v2, v9, :cond_8

    .line 129
    .line 130
    shl-long v17, v15, v2

    .line 131
    .line 132
    and-long v17, v17, v13

    .line 133
    .line 134
    cmp-long v17, v17, v3

    .line 135
    .line 136
    if-eqz v17, :cond_8

    .line 137
    .line 138
    add-int/lit8 v6, v6, 0x1

    .line 139
    .line 140
    aget-char v2, v11, v6

    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_8
    const/16 v1, 0x3a

    .line 144
    .line 145
    if-ne v2, v1, :cond_b

    .line 146
    .line 147
    add-int/2addr v6, v10

    .line 148
    if-ne v6, v12, :cond_9

    .line 149
    .line 150
    const/16 v1, 0x1a

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_9
    aget-char v1, v11, v6

    .line 154
    .line 155
    :goto_4
    if-gt v1, v9, :cond_a

    .line 156
    .line 157
    shl-long v17, v15, v1

    .line 158
    .line 159
    and-long v17, v17, v13

    .line 160
    .line 161
    cmp-long v2, v17, v3

    .line 162
    .line 163
    if-eqz v2, :cond_a

    .line 164
    .line 165
    add-int/lit8 v6, v6, 0x1

    .line 166
    .line 167
    aget-char v1, v11, v6

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_a
    add-int/lit8 v2, v6, 0x1

    .line 171
    .line 172
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 173
    .line 174
    int-to-char v1, v1

    .line 175
    iput-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 176
    .line 177
    goto :goto_6

    .line 178
    :cond_b
    invoke-static {v6, v8}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    return-object v7

    .line 186
    :cond_c
    add-int/lit8 v6, v6, 0x1

    .line 187
    .line 188
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_d
    :goto_6
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪哲苏:I

    .line 192
    .line 193
    if-lt v1, v5, :cond_18

    .line 194
    .line 195
    iget-boolean v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏哲世:Z

    .line 196
    .line 197
    if-nez v2, :cond_17

    .line 198
    .line 199
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰苏楪哲:I

    .line 200
    .line 201
    packed-switch v2, :pswitch_data_0

    .line 202
    .line 203
    .line 204
    move/from16 v27, v1

    .line 205
    .line 206
    move/from16 v28, v5

    .line 207
    .line 208
    move/from16 v22, v9

    .line 209
    .line 210
    move-object/from16 v26, v11

    .line 211
    .line 212
    const-wide/16 v17, -0x1

    .line 213
    .line 214
    goto/16 :goto_a

    .line 215
    .line 216
    :pswitch_0
    aget-char v2, v11, v5

    .line 217
    .line 218
    add-int/lit8 v10, v5, 0x1

    .line 219
    .line 220
    aget-char v10, v11, v10

    .line 221
    .line 222
    add-int/lit8 v15, v5, 0x2

    .line 223
    .line 224
    aget-char v15, v11, v15

    .line 225
    .line 226
    add-int/lit8 v16, v5, 0x3

    .line 227
    .line 228
    const-wide/16 v17, -0x1

    .line 229
    .line 230
    aget-char v3, v11, v16

    .line 231
    .line 232
    add-int/lit8 v4, v5, 0x4

    .line 233
    .line 234
    aget-char v4, v11, v4

    .line 235
    .line 236
    add-int/lit8 v16, v5, 0x5

    .line 237
    .line 238
    const/16 v19, 0x38

    .line 239
    .line 240
    aget-char v6, v11, v16

    .line 241
    .line 242
    add-int/lit8 v16, v5, 0x6

    .line 243
    .line 244
    const/16 v20, 0x30

    .line 245
    .line 246
    aget-char v7, v11, v16

    .line 247
    .line 248
    add-int/lit8 v16, v5, 0x7

    .line 249
    .line 250
    const/16 v21, 0x28

    .line 251
    .line 252
    aget-char v8, v11, v16

    .line 253
    .line 254
    add-int/lit8 v16, v5, 0x8

    .line 255
    .line 256
    move/from16 v22, v9

    .line 257
    .line 258
    aget-char v9, v11, v16

    .line 259
    .line 260
    add-int/lit8 v16, v5, 0x9

    .line 261
    .line 262
    const/16 v23, 0x18

    .line 263
    .line 264
    aget-char v12, v11, v16

    .line 265
    .line 266
    add-int/lit8 v16, v5, 0xa

    .line 267
    .line 268
    const/16 v24, 0x10

    .line 269
    .line 270
    aget-char v13, v11, v16

    .line 271
    .line 272
    add-int/lit8 v16, v5, 0xb

    .line 273
    .line 274
    const/16 v25, 0x8

    .line 275
    .line 276
    aget-char v14, v11, v16

    .line 277
    .line 278
    add-int/lit8 v16, v5, 0xc

    .line 279
    .line 280
    move-object/from16 v26, v11

    .line 281
    .line 282
    aget-char v11, v26, v16

    .line 283
    .line 284
    add-int/lit8 v16, v5, 0xd

    .line 285
    .line 286
    move/from16 v27, v1

    .line 287
    .line 288
    aget-char v1, v26, v16

    .line 289
    .line 290
    add-int/lit8 v16, v5, 0xe

    .line 291
    .line 292
    move/from16 v28, v5

    .line 293
    .line 294
    aget-char v5, v26, v16

    .line 295
    .line 296
    add-int/lit8 v16, v28, 0xf

    .line 297
    .line 298
    aget-char v0, v26, v16

    .line 299
    .line 300
    move/from16 v16, v0

    .line 301
    .line 302
    and-int/lit16 v0, v2, 0xff

    .line 303
    .line 304
    if-ne v0, v2, :cond_e

    .line 305
    .line 306
    and-int/lit16 v0, v10, 0xff

    .line 307
    .line 308
    if-ne v0, v10, :cond_e

    .line 309
    .line 310
    and-int/lit16 v0, v15, 0xff

    .line 311
    .line 312
    if-ne v0, v15, :cond_e

    .line 313
    .line 314
    and-int/lit16 v0, v3, 0xff

    .line 315
    .line 316
    if-ne v0, v3, :cond_e

    .line 317
    .line 318
    and-int/lit16 v0, v4, 0xff

    .line 319
    .line 320
    if-ne v0, v4, :cond_e

    .line 321
    .line 322
    and-int/lit16 v0, v6, 0xff

    .line 323
    .line 324
    if-ne v0, v6, :cond_e

    .line 325
    .line 326
    and-int/lit16 v0, v7, 0xff

    .line 327
    .line 328
    if-ne v0, v7, :cond_e

    .line 329
    .line 330
    and-int/lit16 v0, v8, 0xff

    .line 331
    .line 332
    if-ne v0, v8, :cond_e

    .line 333
    .line 334
    and-int/lit16 v0, v9, 0xff

    .line 335
    .line 336
    if-ne v0, v9, :cond_e

    .line 337
    .line 338
    and-int/lit16 v0, v12, 0xff

    .line 339
    .line 340
    if-ne v0, v12, :cond_e

    .line 341
    .line 342
    and-int/lit16 v0, v13, 0xff

    .line 343
    .line 344
    if-ne v0, v13, :cond_e

    .line 345
    .line 346
    and-int/lit16 v0, v14, 0xff

    .line 347
    .line 348
    if-ne v0, v14, :cond_e

    .line 349
    .line 350
    and-int/lit16 v0, v11, 0xff

    .line 351
    .line 352
    if-ne v0, v11, :cond_e

    .line 353
    .line 354
    and-int/lit16 v0, v1, 0xff

    .line 355
    .line 356
    if-ne v0, v1, :cond_e

    .line 357
    .line 358
    and-int/lit16 v0, v5, 0xff

    .line 359
    .line 360
    if-ne v0, v5, :cond_e

    .line 361
    .line 362
    move/from16 v0, v16

    .line 363
    .line 364
    move/from16 v16, v9

    .line 365
    .line 366
    and-int/lit16 v9, v0, 0xff

    .line 367
    .line 368
    if-ne v9, v0, :cond_e

    .line 369
    .line 370
    int-to-long v8, v8

    .line 371
    shl-long v8, v8, v19

    .line 372
    .line 373
    move-wide/from16 v29, v8

    .line 374
    .line 375
    int-to-long v7, v7

    .line 376
    shl-long v7, v7, v20

    .line 377
    .line 378
    add-long v8, v29, v7

    .line 379
    .line 380
    int-to-long v6, v6

    .line 381
    shl-long v6, v6, v21

    .line 382
    .line 383
    add-long/2addr v8, v6

    .line 384
    int-to-long v6, v4

    .line 385
    shl-long v6, v6, v22

    .line 386
    .line 387
    add-long/2addr v8, v6

    .line 388
    int-to-long v3, v3

    .line 389
    shl-long v3, v3, v23

    .line 390
    .line 391
    add-long/2addr v8, v3

    .line 392
    int-to-long v3, v15

    .line 393
    shl-long v3, v3, v24

    .line 394
    .line 395
    add-long/2addr v8, v3

    .line 396
    int-to-long v3, v10

    .line 397
    shl-long v3, v3, v25

    .line 398
    .line 399
    add-long/2addr v8, v3

    .line 400
    int-to-long v2, v2

    .line 401
    add-long/2addr v8, v2

    .line 402
    int-to-long v2, v0

    .line 403
    shl-long v2, v2, v19

    .line 404
    .line 405
    int-to-long v4, v5

    .line 406
    shl-long v4, v4, v20

    .line 407
    .line 408
    add-long/2addr v2, v4

    .line 409
    int-to-long v0, v1

    .line 410
    shl-long v0, v0, v21

    .line 411
    .line 412
    add-long/2addr v2, v0

    .line 413
    int-to-long v0, v11

    .line 414
    shl-long v0, v0, v22

    .line 415
    .line 416
    add-long/2addr v2, v0

    .line 417
    int-to-long v0, v14

    .line 418
    shl-long v0, v0, v23

    .line 419
    .line 420
    add-long/2addr v2, v0

    .line 421
    int-to-long v0, v13

    .line 422
    shl-long v0, v0, v24

    .line 423
    .line 424
    add-long/2addr v2, v0

    .line 425
    int-to-long v0, v12

    .line 426
    shl-long v0, v0, v25

    .line 427
    .line 428
    add-long/2addr v2, v0

    .line 429
    move/from16 v0, v16

    .line 430
    .line 431
    int-to-long v0, v0

    .line 432
    add-long/2addr v2, v0

    .line 433
    move-wide v3, v2

    .line 434
    move-wide v1, v8

    .line 435
    goto/16 :goto_b

    .line 436
    .line 437
    :pswitch_1
    move/from16 v27, v1

    .line 438
    .line 439
    move/from16 v28, v5

    .line 440
    .line 441
    move/from16 v22, v9

    .line 442
    .line 443
    move-object/from16 v26, v11

    .line 444
    .line 445
    const-wide/16 v17, -0x1

    .line 446
    .line 447
    const/16 v19, 0x38

    .line 448
    .line 449
    const/16 v20, 0x30

    .line 450
    .line 451
    const/16 v21, 0x28

    .line 452
    .line 453
    const/16 v23, 0x18

    .line 454
    .line 455
    const/16 v24, 0x10

    .line 456
    .line 457
    const/16 v25, 0x8

    .line 458
    .line 459
    aget-char v0, v26, v28

    .line 460
    .line 461
    add-int/lit8 v5, v28, 0x1

    .line 462
    .line 463
    aget-char v1, v26, v5

    .line 464
    .line 465
    add-int/lit8 v5, v28, 0x2

    .line 466
    .line 467
    aget-char v2, v26, v5

    .line 468
    .line 469
    add-int/lit8 v5, v28, 0x3

    .line 470
    .line 471
    aget-char v3, v26, v5

    .line 472
    .line 473
    add-int/lit8 v5, v28, 0x4

    .line 474
    .line 475
    aget-char v4, v26, v5

    .line 476
    .line 477
    add-int/lit8 v5, v28, 0x5

    .line 478
    .line 479
    aget-char v5, v26, v5

    .line 480
    .line 481
    add-int/lit8 v6, v28, 0x6

    .line 482
    .line 483
    aget-char v6, v26, v6

    .line 484
    .line 485
    add-int/lit8 v7, v28, 0x7

    .line 486
    .line 487
    aget-char v7, v26, v7

    .line 488
    .line 489
    add-int/lit8 v8, v28, 0x8

    .line 490
    .line 491
    aget-char v8, v26, v8

    .line 492
    .line 493
    add-int/lit8 v9, v28, 0x9

    .line 494
    .line 495
    aget-char v9, v26, v9

    .line 496
    .line 497
    add-int/lit8 v10, v28, 0xa

    .line 498
    .line 499
    aget-char v10, v26, v10

    .line 500
    .line 501
    add-int/lit8 v11, v28, 0xb

    .line 502
    .line 503
    aget-char v11, v26, v11

    .line 504
    .line 505
    add-int/lit8 v12, v28, 0xc

    .line 506
    .line 507
    aget-char v12, v26, v12

    .line 508
    .line 509
    add-int/lit8 v13, v28, 0xd

    .line 510
    .line 511
    aget-char v13, v26, v13

    .line 512
    .line 513
    add-int/lit8 v14, v28, 0xe

    .line 514
    .line 515
    aget-char v14, v26, v14

    .line 516
    .line 517
    and-int/lit16 v15, v0, 0xff

    .line 518
    .line 519
    if-ne v15, v0, :cond_e

    .line 520
    .line 521
    and-int/lit16 v15, v1, 0xff

    .line 522
    .line 523
    if-ne v15, v1, :cond_e

    .line 524
    .line 525
    and-int/lit16 v15, v2, 0xff

    .line 526
    .line 527
    if-ne v15, v2, :cond_e

    .line 528
    .line 529
    and-int/lit16 v15, v3, 0xff

    .line 530
    .line 531
    if-ne v15, v3, :cond_e

    .line 532
    .line 533
    and-int/lit16 v15, v4, 0xff

    .line 534
    .line 535
    if-ne v15, v4, :cond_e

    .line 536
    .line 537
    and-int/lit16 v15, v5, 0xff

    .line 538
    .line 539
    if-ne v15, v5, :cond_e

    .line 540
    .line 541
    and-int/lit16 v15, v6, 0xff

    .line 542
    .line 543
    if-ne v15, v6, :cond_e

    .line 544
    .line 545
    and-int/lit16 v15, v7, 0xff

    .line 546
    .line 547
    if-ne v15, v7, :cond_e

    .line 548
    .line 549
    and-int/lit16 v15, v8, 0xff

    .line 550
    .line 551
    if-ne v15, v8, :cond_e

    .line 552
    .line 553
    and-int/lit16 v15, v9, 0xff

    .line 554
    .line 555
    if-ne v15, v9, :cond_e

    .line 556
    .line 557
    and-int/lit16 v15, v10, 0xff

    .line 558
    .line 559
    if-ne v15, v10, :cond_e

    .line 560
    .line 561
    and-int/lit16 v15, v11, 0xff

    .line 562
    .line 563
    if-ne v15, v11, :cond_e

    .line 564
    .line 565
    and-int/lit16 v15, v12, 0xff

    .line 566
    .line 567
    if-ne v15, v12, :cond_e

    .line 568
    .line 569
    and-int/lit16 v15, v13, 0xff

    .line 570
    .line 571
    if-ne v15, v13, :cond_e

    .line 572
    .line 573
    and-int/lit16 v15, v14, 0xff

    .line 574
    .line 575
    if-ne v15, v14, :cond_e

    .line 576
    .line 577
    move v15, v7

    .line 578
    int-to-long v6, v6

    .line 579
    shl-long v6, v6, v20

    .line 580
    .line 581
    move-wide/from16 v29, v6

    .line 582
    .line 583
    int-to-long v5, v5

    .line 584
    shl-long v5, v5, v21

    .line 585
    .line 586
    add-long v6, v29, v5

    .line 587
    .line 588
    int-to-long v4, v4

    .line 589
    shl-long v4, v4, v22

    .line 590
    .line 591
    add-long/2addr v6, v4

    .line 592
    int-to-long v3, v3

    .line 593
    shl-long v3, v3, v23

    .line 594
    .line 595
    add-long/2addr v6, v3

    .line 596
    int-to-long v2, v2

    .line 597
    shl-long v2, v2, v24

    .line 598
    .line 599
    add-long/2addr v6, v2

    .line 600
    int-to-long v1, v1

    .line 601
    shl-long v1, v1, v25

    .line 602
    .line 603
    add-long/2addr v6, v1

    .line 604
    int-to-long v0, v0

    .line 605
    add-long/2addr v0, v6

    .line 606
    int-to-long v2, v14

    .line 607
    shl-long v2, v2, v19

    .line 608
    .line 609
    int-to-long v4, v13

    .line 610
    shl-long v4, v4, v20

    .line 611
    .line 612
    add-long/2addr v2, v4

    .line 613
    int-to-long v4, v12

    .line 614
    shl-long v4, v4, v21

    .line 615
    .line 616
    add-long/2addr v2, v4

    .line 617
    int-to-long v4, v11

    .line 618
    shl-long v4, v4, v22

    .line 619
    .line 620
    add-long/2addr v2, v4

    .line 621
    int-to-long v4, v10

    .line 622
    shl-long v4, v4, v23

    .line 623
    .line 624
    add-long/2addr v2, v4

    .line 625
    int-to-long v4, v9

    .line 626
    shl-long v4, v4, v24

    .line 627
    .line 628
    add-long/2addr v2, v4

    .line 629
    int-to-long v4, v8

    .line 630
    shl-long v4, v4, v25

    .line 631
    .line 632
    add-long/2addr v2, v4

    .line 633
    int-to-long v4, v15

    .line 634
    :goto_7
    add-long/2addr v2, v4

    .line 635
    :goto_8
    move-wide v3, v2

    .line 636
    move-wide v1, v0

    .line 637
    goto/16 :goto_b

    .line 638
    .line 639
    :pswitch_2
    move/from16 v27, v1

    .line 640
    .line 641
    move/from16 v28, v5

    .line 642
    .line 643
    move/from16 v22, v9

    .line 644
    .line 645
    move-object/from16 v26, v11

    .line 646
    .line 647
    const-wide/16 v17, -0x1

    .line 648
    .line 649
    const/16 v19, 0x38

    .line 650
    .line 651
    const/16 v20, 0x30

    .line 652
    .line 653
    const/16 v21, 0x28

    .line 654
    .line 655
    const/16 v23, 0x18

    .line 656
    .line 657
    const/16 v24, 0x10

    .line 658
    .line 659
    const/16 v25, 0x8

    .line 660
    .line 661
    aget-char v0, v26, v28

    .line 662
    .line 663
    add-int/lit8 v5, v28, 0x1

    .line 664
    .line 665
    aget-char v1, v26, v5

    .line 666
    .line 667
    add-int/lit8 v5, v28, 0x2

    .line 668
    .line 669
    aget-char v2, v26, v5

    .line 670
    .line 671
    add-int/lit8 v5, v28, 0x3

    .line 672
    .line 673
    aget-char v3, v26, v5

    .line 674
    .line 675
    add-int/lit8 v5, v28, 0x4

    .line 676
    .line 677
    aget-char v4, v26, v5

    .line 678
    .line 679
    add-int/lit8 v5, v28, 0x5

    .line 680
    .line 681
    aget-char v5, v26, v5

    .line 682
    .line 683
    add-int/lit8 v6, v28, 0x6

    .line 684
    .line 685
    aget-char v6, v26, v6

    .line 686
    .line 687
    add-int/lit8 v7, v28, 0x7

    .line 688
    .line 689
    aget-char v7, v26, v7

    .line 690
    .line 691
    add-int/lit8 v8, v28, 0x8

    .line 692
    .line 693
    aget-char v8, v26, v8

    .line 694
    .line 695
    add-int/lit8 v9, v28, 0x9

    .line 696
    .line 697
    aget-char v9, v26, v9

    .line 698
    .line 699
    add-int/lit8 v10, v28, 0xa

    .line 700
    .line 701
    aget-char v10, v26, v10

    .line 702
    .line 703
    add-int/lit8 v11, v28, 0xb

    .line 704
    .line 705
    aget-char v11, v26, v11

    .line 706
    .line 707
    add-int/lit8 v12, v28, 0xc

    .line 708
    .line 709
    aget-char v12, v26, v12

    .line 710
    .line 711
    add-int/lit8 v13, v28, 0xd

    .line 712
    .line 713
    aget-char v13, v26, v13

    .line 714
    .line 715
    and-int/lit16 v14, v0, 0xff

    .line 716
    .line 717
    if-ne v14, v0, :cond_e

    .line 718
    .line 719
    and-int/lit16 v14, v1, 0xff

    .line 720
    .line 721
    if-ne v14, v1, :cond_e

    .line 722
    .line 723
    and-int/lit16 v14, v2, 0xff

    .line 724
    .line 725
    if-ne v14, v2, :cond_e

    .line 726
    .line 727
    and-int/lit16 v14, v3, 0xff

    .line 728
    .line 729
    if-ne v14, v3, :cond_e

    .line 730
    .line 731
    and-int/lit16 v14, v4, 0xff

    .line 732
    .line 733
    if-ne v14, v4, :cond_e

    .line 734
    .line 735
    and-int/lit16 v14, v5, 0xff

    .line 736
    .line 737
    if-ne v14, v5, :cond_e

    .line 738
    .line 739
    and-int/lit16 v14, v6, 0xff

    .line 740
    .line 741
    if-ne v14, v6, :cond_e

    .line 742
    .line 743
    and-int/lit16 v14, v7, 0xff

    .line 744
    .line 745
    if-ne v14, v7, :cond_e

    .line 746
    .line 747
    and-int/lit16 v14, v8, 0xff

    .line 748
    .line 749
    if-ne v14, v8, :cond_e

    .line 750
    .line 751
    and-int/lit16 v14, v9, 0xff

    .line 752
    .line 753
    if-ne v14, v9, :cond_e

    .line 754
    .line 755
    and-int/lit16 v14, v10, 0xff

    .line 756
    .line 757
    if-ne v14, v10, :cond_e

    .line 758
    .line 759
    and-int/lit16 v14, v11, 0xff

    .line 760
    .line 761
    if-ne v14, v11, :cond_e

    .line 762
    .line 763
    and-int/lit16 v14, v12, 0xff

    .line 764
    .line 765
    if-ne v14, v12, :cond_e

    .line 766
    .line 767
    and-int/lit16 v14, v13, 0xff

    .line 768
    .line 769
    if-ne v14, v13, :cond_e

    .line 770
    .line 771
    int-to-long v14, v5

    .line 772
    shl-long v14, v14, v21

    .line 773
    .line 774
    int-to-long v4, v4

    .line 775
    shl-long v4, v4, v22

    .line 776
    .line 777
    add-long/2addr v14, v4

    .line 778
    int-to-long v3, v3

    .line 779
    shl-long v3, v3, v23

    .line 780
    .line 781
    add-long/2addr v14, v3

    .line 782
    int-to-long v2, v2

    .line 783
    shl-long v2, v2, v24

    .line 784
    .line 785
    add-long/2addr v14, v2

    .line 786
    int-to-long v1, v1

    .line 787
    shl-long v1, v1, v25

    .line 788
    .line 789
    add-long/2addr v14, v1

    .line 790
    int-to-long v0, v0

    .line 791
    add-long/2addr v0, v14

    .line 792
    int-to-long v2, v13

    .line 793
    shl-long v2, v2, v19

    .line 794
    .line 795
    int-to-long v4, v12

    .line 796
    shl-long v4, v4, v20

    .line 797
    .line 798
    add-long/2addr v2, v4

    .line 799
    int-to-long v4, v11

    .line 800
    shl-long v4, v4, v21

    .line 801
    .line 802
    add-long/2addr v2, v4

    .line 803
    int-to-long v4, v10

    .line 804
    shl-long v4, v4, v22

    .line 805
    .line 806
    add-long/2addr v2, v4

    .line 807
    int-to-long v4, v9

    .line 808
    shl-long v4, v4, v23

    .line 809
    .line 810
    add-long/2addr v2, v4

    .line 811
    int-to-long v4, v8

    .line 812
    shl-long v4, v4, v24

    .line 813
    .line 814
    add-long/2addr v2, v4

    .line 815
    int-to-long v4, v7

    .line 816
    shl-long v4, v4, v25

    .line 817
    .line 818
    add-long/2addr v2, v4

    .line 819
    int-to-long v4, v6

    .line 820
    goto/16 :goto_7

    .line 821
    .line 822
    :pswitch_3
    move/from16 v27, v1

    .line 823
    .line 824
    move/from16 v28, v5

    .line 825
    .line 826
    move/from16 v22, v9

    .line 827
    .line 828
    move-object/from16 v26, v11

    .line 829
    .line 830
    const-wide/16 v17, -0x1

    .line 831
    .line 832
    const/16 v19, 0x38

    .line 833
    .line 834
    const/16 v20, 0x30

    .line 835
    .line 836
    const/16 v21, 0x28

    .line 837
    .line 838
    const/16 v23, 0x18

    .line 839
    .line 840
    const/16 v24, 0x10

    .line 841
    .line 842
    const/16 v25, 0x8

    .line 843
    .line 844
    aget-char v0, v26, v28

    .line 845
    .line 846
    add-int/lit8 v5, v28, 0x1

    .line 847
    .line 848
    aget-char v1, v26, v5

    .line 849
    .line 850
    add-int/lit8 v5, v28, 0x2

    .line 851
    .line 852
    aget-char v2, v26, v5

    .line 853
    .line 854
    add-int/lit8 v5, v28, 0x3

    .line 855
    .line 856
    aget-char v3, v26, v5

    .line 857
    .line 858
    add-int/lit8 v5, v28, 0x4

    .line 859
    .line 860
    aget-char v4, v26, v5

    .line 861
    .line 862
    add-int/lit8 v5, v28, 0x5

    .line 863
    .line 864
    aget-char v5, v26, v5

    .line 865
    .line 866
    add-int/lit8 v6, v28, 0x6

    .line 867
    .line 868
    aget-char v6, v26, v6

    .line 869
    .line 870
    add-int/lit8 v7, v28, 0x7

    .line 871
    .line 872
    aget-char v7, v26, v7

    .line 873
    .line 874
    add-int/lit8 v8, v28, 0x8

    .line 875
    .line 876
    aget-char v8, v26, v8

    .line 877
    .line 878
    add-int/lit8 v9, v28, 0x9

    .line 879
    .line 880
    aget-char v9, v26, v9

    .line 881
    .line 882
    add-int/lit8 v10, v28, 0xa

    .line 883
    .line 884
    aget-char v10, v26, v10

    .line 885
    .line 886
    add-int/lit8 v11, v28, 0xb

    .line 887
    .line 888
    aget-char v11, v26, v11

    .line 889
    .line 890
    add-int/lit8 v12, v28, 0xc

    .line 891
    .line 892
    aget-char v12, v26, v12

    .line 893
    .line 894
    and-int/lit16 v13, v0, 0xff

    .line 895
    .line 896
    if-ne v13, v0, :cond_e

    .line 897
    .line 898
    and-int/lit16 v13, v1, 0xff

    .line 899
    .line 900
    if-ne v13, v1, :cond_e

    .line 901
    .line 902
    and-int/lit16 v13, v2, 0xff

    .line 903
    .line 904
    if-ne v13, v2, :cond_e

    .line 905
    .line 906
    and-int/lit16 v13, v3, 0xff

    .line 907
    .line 908
    if-ne v13, v3, :cond_e

    .line 909
    .line 910
    and-int/lit16 v13, v4, 0xff

    .line 911
    .line 912
    if-ne v13, v4, :cond_e

    .line 913
    .line 914
    and-int/lit16 v13, v5, 0xff

    .line 915
    .line 916
    if-ne v13, v5, :cond_e

    .line 917
    .line 918
    and-int/lit16 v13, v6, 0xff

    .line 919
    .line 920
    if-ne v13, v6, :cond_e

    .line 921
    .line 922
    and-int/lit16 v13, v7, 0xff

    .line 923
    .line 924
    if-ne v13, v7, :cond_e

    .line 925
    .line 926
    and-int/lit16 v13, v8, 0xff

    .line 927
    .line 928
    if-ne v13, v8, :cond_e

    .line 929
    .line 930
    and-int/lit16 v13, v9, 0xff

    .line 931
    .line 932
    if-ne v13, v9, :cond_e

    .line 933
    .line 934
    and-int/lit16 v13, v10, 0xff

    .line 935
    .line 936
    if-ne v13, v10, :cond_e

    .line 937
    .line 938
    and-int/lit16 v13, v11, 0xff

    .line 939
    .line 940
    if-ne v13, v11, :cond_e

    .line 941
    .line 942
    and-int/lit16 v13, v12, 0xff

    .line 943
    .line 944
    if-ne v13, v12, :cond_e

    .line 945
    .line 946
    int-to-long v13, v4

    .line 947
    shl-long v13, v13, v22

    .line 948
    .line 949
    int-to-long v3, v3

    .line 950
    shl-long v3, v3, v23

    .line 951
    .line 952
    add-long/2addr v13, v3

    .line 953
    int-to-long v2, v2

    .line 954
    shl-long v2, v2, v24

    .line 955
    .line 956
    add-long/2addr v13, v2

    .line 957
    int-to-long v1, v1

    .line 958
    shl-long v1, v1, v25

    .line 959
    .line 960
    add-long/2addr v13, v1

    .line 961
    int-to-long v0, v0

    .line 962
    add-long/2addr v0, v13

    .line 963
    int-to-long v2, v12

    .line 964
    shl-long v2, v2, v19

    .line 965
    .line 966
    int-to-long v11, v11

    .line 967
    shl-long v11, v11, v20

    .line 968
    .line 969
    add-long/2addr v2, v11

    .line 970
    int-to-long v10, v10

    .line 971
    shl-long v10, v10, v21

    .line 972
    .line 973
    add-long/2addr v2, v10

    .line 974
    int-to-long v9, v9

    .line 975
    shl-long v9, v9, v22

    .line 976
    .line 977
    add-long/2addr v2, v9

    .line 978
    int-to-long v8, v8

    .line 979
    shl-long v8, v8, v23

    .line 980
    .line 981
    add-long/2addr v2, v8

    .line 982
    int-to-long v7, v7

    .line 983
    shl-long v7, v7, v24

    .line 984
    .line 985
    add-long/2addr v2, v7

    .line 986
    int-to-long v6, v6

    .line 987
    shl-long v6, v6, v25

    .line 988
    .line 989
    add-long/2addr v2, v6

    .line 990
    int-to-long v4, v5

    .line 991
    goto/16 :goto_7

    .line 992
    .line 993
    :pswitch_4
    move/from16 v27, v1

    .line 994
    .line 995
    move/from16 v28, v5

    .line 996
    .line 997
    move/from16 v22, v9

    .line 998
    .line 999
    move-object/from16 v26, v11

    .line 1000
    .line 1001
    const-wide/16 v17, -0x1

    .line 1002
    .line 1003
    const/16 v19, 0x38

    .line 1004
    .line 1005
    const/16 v20, 0x30

    .line 1006
    .line 1007
    const/16 v21, 0x28

    .line 1008
    .line 1009
    const/16 v23, 0x18

    .line 1010
    .line 1011
    const/16 v24, 0x10

    .line 1012
    .line 1013
    const/16 v25, 0x8

    .line 1014
    .line 1015
    aget-char v0, v26, v28

    .line 1016
    .line 1017
    add-int/lit8 v5, v28, 0x1

    .line 1018
    .line 1019
    aget-char v1, v26, v5

    .line 1020
    .line 1021
    add-int/lit8 v5, v28, 0x2

    .line 1022
    .line 1023
    aget-char v2, v26, v5

    .line 1024
    .line 1025
    add-int/lit8 v5, v28, 0x3

    .line 1026
    .line 1027
    aget-char v3, v26, v5

    .line 1028
    .line 1029
    add-int/lit8 v5, v28, 0x4

    .line 1030
    .line 1031
    aget-char v4, v26, v5

    .line 1032
    .line 1033
    add-int/lit8 v5, v28, 0x5

    .line 1034
    .line 1035
    aget-char v5, v26, v5

    .line 1036
    .line 1037
    add-int/lit8 v6, v28, 0x6

    .line 1038
    .line 1039
    aget-char v6, v26, v6

    .line 1040
    .line 1041
    add-int/lit8 v7, v28, 0x7

    .line 1042
    .line 1043
    aget-char v7, v26, v7

    .line 1044
    .line 1045
    add-int/lit8 v8, v28, 0x8

    .line 1046
    .line 1047
    aget-char v8, v26, v8

    .line 1048
    .line 1049
    add-int/lit8 v9, v28, 0x9

    .line 1050
    .line 1051
    aget-char v9, v26, v9

    .line 1052
    .line 1053
    add-int/lit8 v10, v28, 0xa

    .line 1054
    .line 1055
    aget-char v10, v26, v10

    .line 1056
    .line 1057
    add-int/lit8 v11, v28, 0xb

    .line 1058
    .line 1059
    aget-char v11, v26, v11

    .line 1060
    .line 1061
    and-int/lit16 v12, v0, 0xff

    .line 1062
    .line 1063
    if-ne v12, v0, :cond_e

    .line 1064
    .line 1065
    and-int/lit16 v12, v1, 0xff

    .line 1066
    .line 1067
    if-ne v12, v1, :cond_e

    .line 1068
    .line 1069
    and-int/lit16 v12, v2, 0xff

    .line 1070
    .line 1071
    if-ne v12, v2, :cond_e

    .line 1072
    .line 1073
    and-int/lit16 v12, v3, 0xff

    .line 1074
    .line 1075
    if-ne v12, v3, :cond_e

    .line 1076
    .line 1077
    and-int/lit16 v12, v4, 0xff

    .line 1078
    .line 1079
    if-ne v12, v4, :cond_e

    .line 1080
    .line 1081
    and-int/lit16 v12, v5, 0xff

    .line 1082
    .line 1083
    if-ne v12, v5, :cond_e

    .line 1084
    .line 1085
    and-int/lit16 v12, v6, 0xff

    .line 1086
    .line 1087
    if-ne v12, v6, :cond_e

    .line 1088
    .line 1089
    and-int/lit16 v12, v7, 0xff

    .line 1090
    .line 1091
    if-ne v12, v7, :cond_e

    .line 1092
    .line 1093
    and-int/lit16 v12, v8, 0xff

    .line 1094
    .line 1095
    if-ne v12, v8, :cond_e

    .line 1096
    .line 1097
    and-int/lit16 v12, v9, 0xff

    .line 1098
    .line 1099
    if-ne v12, v9, :cond_e

    .line 1100
    .line 1101
    and-int/lit16 v12, v10, 0xff

    .line 1102
    .line 1103
    if-ne v12, v10, :cond_e

    .line 1104
    .line 1105
    and-int/lit16 v12, v11, 0xff

    .line 1106
    .line 1107
    if-ne v12, v11, :cond_e

    .line 1108
    .line 1109
    shl-int/lit8 v3, v3, 0x18

    .line 1110
    .line 1111
    shl-int/lit8 v2, v2, 0x10

    .line 1112
    .line 1113
    add-int/2addr v3, v2

    .line 1114
    shl-int/lit8 v1, v1, 0x8

    .line 1115
    .line 1116
    add-int/2addr v3, v1

    .line 1117
    add-int/2addr v3, v0

    .line 1118
    int-to-long v0, v3

    .line 1119
    int-to-long v2, v11

    .line 1120
    shl-long v2, v2, v19

    .line 1121
    .line 1122
    int-to-long v10, v10

    .line 1123
    shl-long v10, v10, v20

    .line 1124
    .line 1125
    add-long/2addr v2, v10

    .line 1126
    int-to-long v9, v9

    .line 1127
    shl-long v9, v9, v21

    .line 1128
    .line 1129
    add-long/2addr v2, v9

    .line 1130
    int-to-long v8, v8

    .line 1131
    shl-long v8, v8, v22

    .line 1132
    .line 1133
    add-long/2addr v2, v8

    .line 1134
    int-to-long v7, v7

    .line 1135
    shl-long v7, v7, v23

    .line 1136
    .line 1137
    add-long/2addr v2, v7

    .line 1138
    int-to-long v6, v6

    .line 1139
    shl-long v6, v6, v24

    .line 1140
    .line 1141
    add-long/2addr v2, v6

    .line 1142
    int-to-long v5, v5

    .line 1143
    shl-long v5, v5, v25

    .line 1144
    .line 1145
    add-long/2addr v2, v5

    .line 1146
    int-to-long v4, v4

    .line 1147
    goto/16 :goto_7

    .line 1148
    .line 1149
    :pswitch_5
    move/from16 v27, v1

    .line 1150
    .line 1151
    move/from16 v28, v5

    .line 1152
    .line 1153
    move/from16 v22, v9

    .line 1154
    .line 1155
    move-object/from16 v26, v11

    .line 1156
    .line 1157
    const-wide/16 v17, -0x1

    .line 1158
    .line 1159
    const/16 v19, 0x38

    .line 1160
    .line 1161
    const/16 v20, 0x30

    .line 1162
    .line 1163
    const/16 v21, 0x28

    .line 1164
    .line 1165
    const/16 v23, 0x18

    .line 1166
    .line 1167
    const/16 v24, 0x10

    .line 1168
    .line 1169
    const/16 v25, 0x8

    .line 1170
    .line 1171
    aget-char v0, v26, v28

    .line 1172
    .line 1173
    add-int/lit8 v5, v28, 0x1

    .line 1174
    .line 1175
    aget-char v1, v26, v5

    .line 1176
    .line 1177
    add-int/lit8 v5, v28, 0x2

    .line 1178
    .line 1179
    aget-char v2, v26, v5

    .line 1180
    .line 1181
    add-int/lit8 v5, v28, 0x3

    .line 1182
    .line 1183
    aget-char v3, v26, v5

    .line 1184
    .line 1185
    add-int/lit8 v5, v28, 0x4

    .line 1186
    .line 1187
    aget-char v4, v26, v5

    .line 1188
    .line 1189
    add-int/lit8 v5, v28, 0x5

    .line 1190
    .line 1191
    aget-char v5, v26, v5

    .line 1192
    .line 1193
    add-int/lit8 v6, v28, 0x6

    .line 1194
    .line 1195
    aget-char v6, v26, v6

    .line 1196
    .line 1197
    add-int/lit8 v7, v28, 0x7

    .line 1198
    .line 1199
    aget-char v7, v26, v7

    .line 1200
    .line 1201
    add-int/lit8 v8, v28, 0x8

    .line 1202
    .line 1203
    aget-char v8, v26, v8

    .line 1204
    .line 1205
    add-int/lit8 v9, v28, 0x9

    .line 1206
    .line 1207
    aget-char v9, v26, v9

    .line 1208
    .line 1209
    add-int/lit8 v10, v28, 0xa

    .line 1210
    .line 1211
    aget-char v10, v26, v10

    .line 1212
    .line 1213
    and-int/lit16 v11, v0, 0xff

    .line 1214
    .line 1215
    if-ne v11, v0, :cond_e

    .line 1216
    .line 1217
    and-int/lit16 v11, v1, 0xff

    .line 1218
    .line 1219
    if-ne v11, v1, :cond_e

    .line 1220
    .line 1221
    and-int/lit16 v11, v2, 0xff

    .line 1222
    .line 1223
    if-ne v11, v2, :cond_e

    .line 1224
    .line 1225
    and-int/lit16 v11, v3, 0xff

    .line 1226
    .line 1227
    if-ne v11, v3, :cond_e

    .line 1228
    .line 1229
    and-int/lit16 v11, v4, 0xff

    .line 1230
    .line 1231
    if-ne v11, v4, :cond_e

    .line 1232
    .line 1233
    and-int/lit16 v11, v5, 0xff

    .line 1234
    .line 1235
    if-ne v11, v5, :cond_e

    .line 1236
    .line 1237
    and-int/lit16 v11, v6, 0xff

    .line 1238
    .line 1239
    if-ne v11, v6, :cond_e

    .line 1240
    .line 1241
    and-int/lit16 v11, v7, 0xff

    .line 1242
    .line 1243
    if-ne v11, v7, :cond_e

    .line 1244
    .line 1245
    and-int/lit16 v11, v8, 0xff

    .line 1246
    .line 1247
    if-ne v11, v8, :cond_e

    .line 1248
    .line 1249
    and-int/lit16 v11, v9, 0xff

    .line 1250
    .line 1251
    if-ne v11, v9, :cond_e

    .line 1252
    .line 1253
    and-int/lit16 v11, v10, 0xff

    .line 1254
    .line 1255
    if-ne v11, v10, :cond_e

    .line 1256
    .line 1257
    shl-int/lit8 v2, v2, 0x10

    .line 1258
    .line 1259
    shl-int/lit8 v1, v1, 0x8

    .line 1260
    .line 1261
    add-int/2addr v2, v1

    .line 1262
    add-int/2addr v2, v0

    .line 1263
    int-to-long v0, v2

    .line 1264
    int-to-long v10, v10

    .line 1265
    shl-long v10, v10, v19

    .line 1266
    .line 1267
    int-to-long v12, v9

    .line 1268
    shl-long v12, v12, v20

    .line 1269
    .line 1270
    add-long/2addr v10, v12

    .line 1271
    int-to-long v8, v8

    .line 1272
    shl-long v8, v8, v21

    .line 1273
    .line 1274
    add-long/2addr v10, v8

    .line 1275
    int-to-long v7, v7

    .line 1276
    shl-long v7, v7, v22

    .line 1277
    .line 1278
    add-long/2addr v10, v7

    .line 1279
    int-to-long v6, v6

    .line 1280
    shl-long v6, v6, v23

    .line 1281
    .line 1282
    add-long/2addr v10, v6

    .line 1283
    int-to-long v5, v5

    .line 1284
    shl-long v5, v5, v24

    .line 1285
    .line 1286
    add-long/2addr v10, v5

    .line 1287
    int-to-long v4, v4

    .line 1288
    shl-long v4, v4, v25

    .line 1289
    .line 1290
    add-long/2addr v10, v4

    .line 1291
    int-to-long v2, v3

    .line 1292
    add-long/2addr v2, v10

    .line 1293
    goto/16 :goto_8

    .line 1294
    .line 1295
    :pswitch_6
    move/from16 v27, v1

    .line 1296
    .line 1297
    move/from16 v28, v5

    .line 1298
    .line 1299
    move/from16 v22, v9

    .line 1300
    .line 1301
    move-object/from16 v26, v11

    .line 1302
    .line 1303
    const-wide/16 v17, -0x1

    .line 1304
    .line 1305
    const/16 v19, 0x38

    .line 1306
    .line 1307
    const/16 v20, 0x30

    .line 1308
    .line 1309
    const/16 v21, 0x28

    .line 1310
    .line 1311
    const/16 v23, 0x18

    .line 1312
    .line 1313
    const/16 v24, 0x10

    .line 1314
    .line 1315
    const/16 v25, 0x8

    .line 1316
    .line 1317
    aget-char v0, v26, v28

    .line 1318
    .line 1319
    add-int/lit8 v5, v28, 0x1

    .line 1320
    .line 1321
    aget-char v1, v26, v5

    .line 1322
    .line 1323
    add-int/lit8 v5, v28, 0x2

    .line 1324
    .line 1325
    aget-char v2, v26, v5

    .line 1326
    .line 1327
    add-int/lit8 v5, v28, 0x3

    .line 1328
    .line 1329
    aget-char v3, v26, v5

    .line 1330
    .line 1331
    add-int/lit8 v5, v28, 0x4

    .line 1332
    .line 1333
    aget-char v4, v26, v5

    .line 1334
    .line 1335
    add-int/lit8 v5, v28, 0x5

    .line 1336
    .line 1337
    aget-char v5, v26, v5

    .line 1338
    .line 1339
    add-int/lit8 v6, v28, 0x6

    .line 1340
    .line 1341
    aget-char v6, v26, v6

    .line 1342
    .line 1343
    add-int/lit8 v7, v28, 0x7

    .line 1344
    .line 1345
    aget-char v7, v26, v7

    .line 1346
    .line 1347
    add-int/lit8 v8, v28, 0x8

    .line 1348
    .line 1349
    aget-char v8, v26, v8

    .line 1350
    .line 1351
    add-int/lit8 v9, v28, 0x9

    .line 1352
    .line 1353
    aget-char v9, v26, v9

    .line 1354
    .line 1355
    and-int/lit16 v10, v0, 0xff

    .line 1356
    .line 1357
    if-ne v10, v0, :cond_e

    .line 1358
    .line 1359
    and-int/lit16 v10, v1, 0xff

    .line 1360
    .line 1361
    if-ne v10, v1, :cond_e

    .line 1362
    .line 1363
    and-int/lit16 v10, v2, 0xff

    .line 1364
    .line 1365
    if-ne v10, v2, :cond_e

    .line 1366
    .line 1367
    and-int/lit16 v10, v3, 0xff

    .line 1368
    .line 1369
    if-ne v10, v3, :cond_e

    .line 1370
    .line 1371
    and-int/lit16 v10, v4, 0xff

    .line 1372
    .line 1373
    if-ne v10, v4, :cond_e

    .line 1374
    .line 1375
    and-int/lit16 v10, v5, 0xff

    .line 1376
    .line 1377
    if-ne v10, v5, :cond_e

    .line 1378
    .line 1379
    and-int/lit16 v10, v6, 0xff

    .line 1380
    .line 1381
    if-ne v10, v6, :cond_e

    .line 1382
    .line 1383
    and-int/lit16 v10, v7, 0xff

    .line 1384
    .line 1385
    if-ne v10, v7, :cond_e

    .line 1386
    .line 1387
    and-int/lit16 v10, v8, 0xff

    .line 1388
    .line 1389
    if-ne v10, v8, :cond_e

    .line 1390
    .line 1391
    and-int/lit16 v10, v9, 0xff

    .line 1392
    .line 1393
    if-ne v10, v9, :cond_e

    .line 1394
    .line 1395
    shl-int/lit8 v1, v1, 0x8

    .line 1396
    .line 1397
    add-int/2addr v1, v0

    .line 1398
    int-to-long v0, v1

    .line 1399
    int-to-long v9, v9

    .line 1400
    shl-long v9, v9, v19

    .line 1401
    .line 1402
    int-to-long v11, v8

    .line 1403
    shl-long v11, v11, v20

    .line 1404
    .line 1405
    add-long/2addr v9, v11

    .line 1406
    int-to-long v7, v7

    .line 1407
    shl-long v7, v7, v21

    .line 1408
    .line 1409
    add-long/2addr v9, v7

    .line 1410
    int-to-long v6, v6

    .line 1411
    shl-long v6, v6, v22

    .line 1412
    .line 1413
    add-long/2addr v9, v6

    .line 1414
    int-to-long v5, v5

    .line 1415
    shl-long v5, v5, v23

    .line 1416
    .line 1417
    add-long/2addr v9, v5

    .line 1418
    int-to-long v4, v4

    .line 1419
    shl-long v4, v4, v24

    .line 1420
    .line 1421
    add-long/2addr v9, v4

    .line 1422
    int-to-long v3, v3

    .line 1423
    shl-long v3, v3, v25

    .line 1424
    .line 1425
    add-long/2addr v9, v3

    .line 1426
    int-to-long v2, v2

    .line 1427
    add-long/2addr v2, v9

    .line 1428
    goto/16 :goto_8

    .line 1429
    .line 1430
    :pswitch_7
    move/from16 v27, v1

    .line 1431
    .line 1432
    move/from16 v28, v5

    .line 1433
    .line 1434
    move/from16 v22, v9

    .line 1435
    .line 1436
    move-object/from16 v26, v11

    .line 1437
    .line 1438
    const-wide/16 v17, -0x1

    .line 1439
    .line 1440
    const/16 v19, 0x38

    .line 1441
    .line 1442
    const/16 v20, 0x30

    .line 1443
    .line 1444
    const/16 v21, 0x28

    .line 1445
    .line 1446
    const/16 v23, 0x18

    .line 1447
    .line 1448
    const/16 v24, 0x10

    .line 1449
    .line 1450
    const/16 v25, 0x8

    .line 1451
    .line 1452
    aget-char v0, v26, v28

    .line 1453
    .line 1454
    add-int/lit8 v5, v28, 0x1

    .line 1455
    .line 1456
    aget-char v1, v26, v5

    .line 1457
    .line 1458
    add-int/lit8 v5, v28, 0x2

    .line 1459
    .line 1460
    aget-char v2, v26, v5

    .line 1461
    .line 1462
    add-int/lit8 v5, v28, 0x3

    .line 1463
    .line 1464
    aget-char v3, v26, v5

    .line 1465
    .line 1466
    add-int/lit8 v5, v28, 0x4

    .line 1467
    .line 1468
    aget-char v4, v26, v5

    .line 1469
    .line 1470
    add-int/lit8 v5, v28, 0x5

    .line 1471
    .line 1472
    aget-char v5, v26, v5

    .line 1473
    .line 1474
    add-int/lit8 v6, v28, 0x6

    .line 1475
    .line 1476
    aget-char v6, v26, v6

    .line 1477
    .line 1478
    add-int/lit8 v7, v28, 0x7

    .line 1479
    .line 1480
    aget-char v7, v26, v7

    .line 1481
    .line 1482
    add-int/lit8 v8, v28, 0x8

    .line 1483
    .line 1484
    aget-char v8, v26, v8

    .line 1485
    .line 1486
    and-int/lit16 v9, v0, 0xff

    .line 1487
    .line 1488
    if-ne v9, v0, :cond_e

    .line 1489
    .line 1490
    and-int/lit16 v9, v1, 0xff

    .line 1491
    .line 1492
    if-ne v9, v1, :cond_e

    .line 1493
    .line 1494
    and-int/lit16 v9, v2, 0xff

    .line 1495
    .line 1496
    if-ne v9, v2, :cond_e

    .line 1497
    .line 1498
    and-int/lit16 v9, v3, 0xff

    .line 1499
    .line 1500
    if-ne v9, v3, :cond_e

    .line 1501
    .line 1502
    and-int/lit16 v9, v4, 0xff

    .line 1503
    .line 1504
    if-ne v9, v4, :cond_e

    .line 1505
    .line 1506
    and-int/lit16 v9, v5, 0xff

    .line 1507
    .line 1508
    if-ne v9, v5, :cond_e

    .line 1509
    .line 1510
    and-int/lit16 v9, v6, 0xff

    .line 1511
    .line 1512
    if-ne v9, v6, :cond_e

    .line 1513
    .line 1514
    and-int/lit16 v9, v7, 0xff

    .line 1515
    .line 1516
    if-ne v9, v7, :cond_e

    .line 1517
    .line 1518
    and-int/lit16 v9, v8, 0xff

    .line 1519
    .line 1520
    if-ne v9, v8, :cond_e

    .line 1521
    .line 1522
    int-to-long v9, v0

    .line 1523
    int-to-long v11, v8

    .line 1524
    shl-long v11, v11, v19

    .line 1525
    .line 1526
    int-to-long v7, v7

    .line 1527
    shl-long v7, v7, v20

    .line 1528
    .line 1529
    add-long/2addr v11, v7

    .line 1530
    int-to-long v6, v6

    .line 1531
    shl-long v6, v6, v21

    .line 1532
    .line 1533
    add-long/2addr v11, v6

    .line 1534
    int-to-long v5, v5

    .line 1535
    shl-long v5, v5, v22

    .line 1536
    .line 1537
    add-long/2addr v11, v5

    .line 1538
    int-to-long v4, v4

    .line 1539
    shl-long v4, v4, v23

    .line 1540
    .line 1541
    add-long/2addr v11, v4

    .line 1542
    int-to-long v3, v3

    .line 1543
    shl-long v3, v3, v24

    .line 1544
    .line 1545
    add-long/2addr v11, v3

    .line 1546
    int-to-long v2, v2

    .line 1547
    shl-long v2, v2, v25

    .line 1548
    .line 1549
    add-long/2addr v11, v2

    .line 1550
    int-to-long v0, v1

    .line 1551
    add-long v2, v11, v0

    .line 1552
    .line 1553
    move-wide v3, v2

    .line 1554
    move-wide v1, v9

    .line 1555
    goto/16 :goto_b

    .line 1556
    .line 1557
    :pswitch_8
    move/from16 v27, v1

    .line 1558
    .line 1559
    move/from16 v28, v5

    .line 1560
    .line 1561
    move/from16 v22, v9

    .line 1562
    .line 1563
    move-object/from16 v26, v11

    .line 1564
    .line 1565
    const-wide/16 v17, -0x1

    .line 1566
    .line 1567
    const/16 v19, 0x38

    .line 1568
    .line 1569
    const/16 v20, 0x30

    .line 1570
    .line 1571
    const/16 v21, 0x28

    .line 1572
    .line 1573
    const/16 v23, 0x18

    .line 1574
    .line 1575
    const/16 v24, 0x10

    .line 1576
    .line 1577
    const/16 v25, 0x8

    .line 1578
    .line 1579
    aget-char v0, v26, v28

    .line 1580
    .line 1581
    add-int/lit8 v5, v28, 0x1

    .line 1582
    .line 1583
    aget-char v1, v26, v5

    .line 1584
    .line 1585
    add-int/lit8 v5, v28, 0x2

    .line 1586
    .line 1587
    aget-char v2, v26, v5

    .line 1588
    .line 1589
    add-int/lit8 v5, v28, 0x3

    .line 1590
    .line 1591
    aget-char v3, v26, v5

    .line 1592
    .line 1593
    add-int/lit8 v5, v28, 0x4

    .line 1594
    .line 1595
    aget-char v4, v26, v5

    .line 1596
    .line 1597
    add-int/lit8 v5, v28, 0x5

    .line 1598
    .line 1599
    aget-char v5, v26, v5

    .line 1600
    .line 1601
    add-int/lit8 v6, v28, 0x6

    .line 1602
    .line 1603
    aget-char v6, v26, v6

    .line 1604
    .line 1605
    add-int/lit8 v7, v28, 0x7

    .line 1606
    .line 1607
    aget-char v7, v26, v7

    .line 1608
    .line 1609
    and-int/lit16 v8, v0, 0xff

    .line 1610
    .line 1611
    if-ne v8, v0, :cond_e

    .line 1612
    .line 1613
    and-int/lit16 v8, v1, 0xff

    .line 1614
    .line 1615
    if-ne v8, v1, :cond_e

    .line 1616
    .line 1617
    and-int/lit16 v8, v2, 0xff

    .line 1618
    .line 1619
    if-ne v8, v2, :cond_e

    .line 1620
    .line 1621
    and-int/lit16 v8, v3, 0xff

    .line 1622
    .line 1623
    if-ne v8, v3, :cond_e

    .line 1624
    .line 1625
    and-int/lit16 v8, v4, 0xff

    .line 1626
    .line 1627
    if-ne v8, v4, :cond_e

    .line 1628
    .line 1629
    and-int/lit16 v8, v5, 0xff

    .line 1630
    .line 1631
    if-ne v8, v5, :cond_e

    .line 1632
    .line 1633
    and-int/lit16 v8, v6, 0xff

    .line 1634
    .line 1635
    if-ne v8, v6, :cond_e

    .line 1636
    .line 1637
    and-int/lit16 v8, v7, 0xff

    .line 1638
    .line 1639
    if-ne v8, v7, :cond_e

    .line 1640
    .line 1641
    int-to-long v7, v7

    .line 1642
    shl-long v7, v7, v19

    .line 1643
    .line 1644
    int-to-long v9, v6

    .line 1645
    shl-long v9, v9, v20

    .line 1646
    .line 1647
    add-long/2addr v7, v9

    .line 1648
    int-to-long v5, v5

    .line 1649
    shl-long v5, v5, v21

    .line 1650
    .line 1651
    add-long/2addr v7, v5

    .line 1652
    int-to-long v4, v4

    .line 1653
    shl-long v4, v4, v22

    .line 1654
    .line 1655
    add-long/2addr v7, v4

    .line 1656
    int-to-long v3, v3

    .line 1657
    shl-long v3, v3, v23

    .line 1658
    .line 1659
    add-long/2addr v7, v3

    .line 1660
    int-to-long v2, v2

    .line 1661
    shl-long v2, v2, v24

    .line 1662
    .line 1663
    add-long/2addr v7, v2

    .line 1664
    int-to-long v1, v1

    .line 1665
    shl-long v1, v1, v25

    .line 1666
    .line 1667
    add-long/2addr v7, v1

    .line 1668
    int-to-long v0, v0

    .line 1669
    add-long v8, v7, v0

    .line 1670
    .line 1671
    :goto_9
    move-wide v1, v8

    .line 1672
    move-wide/from16 v3, v17

    .line 1673
    .line 1674
    goto/16 :goto_b

    .line 1675
    .line 1676
    :pswitch_9
    move/from16 v27, v1

    .line 1677
    .line 1678
    move/from16 v28, v5

    .line 1679
    .line 1680
    move/from16 v22, v9

    .line 1681
    .line 1682
    move-object/from16 v26, v11

    .line 1683
    .line 1684
    const-wide/16 v17, -0x1

    .line 1685
    .line 1686
    const/16 v20, 0x30

    .line 1687
    .line 1688
    const/16 v21, 0x28

    .line 1689
    .line 1690
    const/16 v23, 0x18

    .line 1691
    .line 1692
    const/16 v24, 0x10

    .line 1693
    .line 1694
    const/16 v25, 0x8

    .line 1695
    .line 1696
    aget-char v0, v26, v28

    .line 1697
    .line 1698
    add-int/lit8 v5, v28, 0x1

    .line 1699
    .line 1700
    aget-char v1, v26, v5

    .line 1701
    .line 1702
    add-int/lit8 v5, v28, 0x2

    .line 1703
    .line 1704
    aget-char v2, v26, v5

    .line 1705
    .line 1706
    add-int/lit8 v5, v28, 0x3

    .line 1707
    .line 1708
    aget-char v3, v26, v5

    .line 1709
    .line 1710
    add-int/lit8 v5, v28, 0x4

    .line 1711
    .line 1712
    aget-char v4, v26, v5

    .line 1713
    .line 1714
    add-int/lit8 v5, v28, 0x5

    .line 1715
    .line 1716
    aget-char v5, v26, v5

    .line 1717
    .line 1718
    add-int/lit8 v6, v28, 0x6

    .line 1719
    .line 1720
    aget-char v6, v26, v6

    .line 1721
    .line 1722
    and-int/lit16 v7, v0, 0xff

    .line 1723
    .line 1724
    if-ne v7, v0, :cond_e

    .line 1725
    .line 1726
    and-int/lit16 v7, v1, 0xff

    .line 1727
    .line 1728
    if-ne v7, v1, :cond_e

    .line 1729
    .line 1730
    and-int/lit16 v7, v2, 0xff

    .line 1731
    .line 1732
    if-ne v7, v2, :cond_e

    .line 1733
    .line 1734
    and-int/lit16 v7, v3, 0xff

    .line 1735
    .line 1736
    if-ne v7, v3, :cond_e

    .line 1737
    .line 1738
    and-int/lit16 v7, v4, 0xff

    .line 1739
    .line 1740
    if-ne v7, v4, :cond_e

    .line 1741
    .line 1742
    and-int/lit16 v7, v5, 0xff

    .line 1743
    .line 1744
    if-ne v7, v5, :cond_e

    .line 1745
    .line 1746
    and-int/lit16 v7, v6, 0xff

    .line 1747
    .line 1748
    if-ne v7, v6, :cond_e

    .line 1749
    .line 1750
    int-to-long v6, v6

    .line 1751
    shl-long v6, v6, v20

    .line 1752
    .line 1753
    int-to-long v8, v5

    .line 1754
    shl-long v8, v8, v21

    .line 1755
    .line 1756
    add-long/2addr v6, v8

    .line 1757
    int-to-long v4, v4

    .line 1758
    shl-long v4, v4, v22

    .line 1759
    .line 1760
    add-long/2addr v6, v4

    .line 1761
    int-to-long v3, v3

    .line 1762
    shl-long v3, v3, v23

    .line 1763
    .line 1764
    add-long/2addr v6, v3

    .line 1765
    int-to-long v2, v2

    .line 1766
    shl-long v2, v2, v24

    .line 1767
    .line 1768
    add-long/2addr v6, v2

    .line 1769
    int-to-long v1, v1

    .line 1770
    shl-long v1, v1, v25

    .line 1771
    .line 1772
    add-long/2addr v6, v1

    .line 1773
    int-to-long v0, v0

    .line 1774
    add-long v8, v6, v0

    .line 1775
    .line 1776
    goto :goto_9

    .line 1777
    :pswitch_a
    move/from16 v27, v1

    .line 1778
    .line 1779
    move/from16 v28, v5

    .line 1780
    .line 1781
    move/from16 v22, v9

    .line 1782
    .line 1783
    move-object/from16 v26, v11

    .line 1784
    .line 1785
    const-wide/16 v17, -0x1

    .line 1786
    .line 1787
    const/16 v21, 0x28

    .line 1788
    .line 1789
    const/16 v23, 0x18

    .line 1790
    .line 1791
    const/16 v24, 0x10

    .line 1792
    .line 1793
    const/16 v25, 0x8

    .line 1794
    .line 1795
    aget-char v0, v26, v28

    .line 1796
    .line 1797
    add-int/lit8 v5, v28, 0x1

    .line 1798
    .line 1799
    aget-char v1, v26, v5

    .line 1800
    .line 1801
    add-int/lit8 v5, v28, 0x2

    .line 1802
    .line 1803
    aget-char v2, v26, v5

    .line 1804
    .line 1805
    add-int/lit8 v5, v28, 0x3

    .line 1806
    .line 1807
    aget-char v3, v26, v5

    .line 1808
    .line 1809
    add-int/lit8 v5, v28, 0x4

    .line 1810
    .line 1811
    aget-char v4, v26, v5

    .line 1812
    .line 1813
    add-int/lit8 v5, v28, 0x5

    .line 1814
    .line 1815
    aget-char v5, v26, v5

    .line 1816
    .line 1817
    and-int/lit16 v6, v0, 0xff

    .line 1818
    .line 1819
    if-ne v6, v0, :cond_e

    .line 1820
    .line 1821
    and-int/lit16 v6, v1, 0xff

    .line 1822
    .line 1823
    if-ne v6, v1, :cond_e

    .line 1824
    .line 1825
    and-int/lit16 v6, v2, 0xff

    .line 1826
    .line 1827
    if-ne v6, v2, :cond_e

    .line 1828
    .line 1829
    and-int/lit16 v6, v3, 0xff

    .line 1830
    .line 1831
    if-ne v6, v3, :cond_e

    .line 1832
    .line 1833
    and-int/lit16 v6, v4, 0xff

    .line 1834
    .line 1835
    if-ne v6, v4, :cond_e

    .line 1836
    .line 1837
    and-int/lit16 v6, v5, 0xff

    .line 1838
    .line 1839
    if-ne v6, v5, :cond_e

    .line 1840
    .line 1841
    int-to-long v5, v5

    .line 1842
    shl-long v5, v5, v21

    .line 1843
    .line 1844
    int-to-long v7, v4

    .line 1845
    shl-long v7, v7, v22

    .line 1846
    .line 1847
    add-long/2addr v5, v7

    .line 1848
    int-to-long v3, v3

    .line 1849
    shl-long v3, v3, v23

    .line 1850
    .line 1851
    add-long/2addr v5, v3

    .line 1852
    int-to-long v2, v2

    .line 1853
    shl-long v2, v2, v24

    .line 1854
    .line 1855
    add-long/2addr v5, v2

    .line 1856
    int-to-long v1, v1

    .line 1857
    shl-long v1, v1, v25

    .line 1858
    .line 1859
    add-long/2addr v5, v1

    .line 1860
    int-to-long v0, v0

    .line 1861
    add-long v8, v5, v0

    .line 1862
    .line 1863
    goto/16 :goto_9

    .line 1864
    .line 1865
    :pswitch_b
    move/from16 v27, v1

    .line 1866
    .line 1867
    move/from16 v28, v5

    .line 1868
    .line 1869
    move/from16 v22, v9

    .line 1870
    .line 1871
    move-object/from16 v26, v11

    .line 1872
    .line 1873
    const-wide/16 v17, -0x1

    .line 1874
    .line 1875
    const/16 v23, 0x18

    .line 1876
    .line 1877
    const/16 v24, 0x10

    .line 1878
    .line 1879
    const/16 v25, 0x8

    .line 1880
    .line 1881
    aget-char v0, v26, v28

    .line 1882
    .line 1883
    add-int/lit8 v5, v28, 0x1

    .line 1884
    .line 1885
    aget-char v1, v26, v5

    .line 1886
    .line 1887
    add-int/lit8 v5, v28, 0x2

    .line 1888
    .line 1889
    aget-char v2, v26, v5

    .line 1890
    .line 1891
    add-int/lit8 v5, v28, 0x3

    .line 1892
    .line 1893
    aget-char v3, v26, v5

    .line 1894
    .line 1895
    add-int/lit8 v5, v28, 0x4

    .line 1896
    .line 1897
    aget-char v4, v26, v5

    .line 1898
    .line 1899
    and-int/lit16 v5, v0, 0xff

    .line 1900
    .line 1901
    if-ne v5, v0, :cond_e

    .line 1902
    .line 1903
    and-int/lit16 v5, v1, 0xff

    .line 1904
    .line 1905
    if-ne v5, v1, :cond_e

    .line 1906
    .line 1907
    and-int/lit16 v5, v2, 0xff

    .line 1908
    .line 1909
    if-ne v5, v2, :cond_e

    .line 1910
    .line 1911
    and-int/lit16 v5, v3, 0xff

    .line 1912
    .line 1913
    if-ne v5, v3, :cond_e

    .line 1914
    .line 1915
    and-int/lit16 v5, v4, 0xff

    .line 1916
    .line 1917
    if-ne v5, v4, :cond_e

    .line 1918
    .line 1919
    int-to-long v4, v4

    .line 1920
    shl-long v4, v4, v22

    .line 1921
    .line 1922
    int-to-long v6, v3

    .line 1923
    shl-long v6, v6, v23

    .line 1924
    .line 1925
    add-long/2addr v4, v6

    .line 1926
    int-to-long v2, v2

    .line 1927
    shl-long v2, v2, v24

    .line 1928
    .line 1929
    add-long/2addr v4, v2

    .line 1930
    int-to-long v1, v1

    .line 1931
    shl-long v1, v1, v25

    .line 1932
    .line 1933
    add-long/2addr v4, v1

    .line 1934
    int-to-long v0, v0

    .line 1935
    add-long v8, v4, v0

    .line 1936
    .line 1937
    goto/16 :goto_9

    .line 1938
    .line 1939
    :pswitch_c
    move/from16 v27, v1

    .line 1940
    .line 1941
    move/from16 v28, v5

    .line 1942
    .line 1943
    move/from16 v22, v9

    .line 1944
    .line 1945
    move-object/from16 v26, v11

    .line 1946
    .line 1947
    const-wide/16 v17, -0x1

    .line 1948
    .line 1949
    const/16 v23, 0x18

    .line 1950
    .line 1951
    const/16 v24, 0x10

    .line 1952
    .line 1953
    const/16 v25, 0x8

    .line 1954
    .line 1955
    aget-char v0, v26, v28

    .line 1956
    .line 1957
    add-int/lit8 v5, v28, 0x1

    .line 1958
    .line 1959
    aget-char v1, v26, v5

    .line 1960
    .line 1961
    add-int/lit8 v5, v28, 0x2

    .line 1962
    .line 1963
    aget-char v2, v26, v5

    .line 1964
    .line 1965
    add-int/lit8 v5, v28, 0x3

    .line 1966
    .line 1967
    aget-char v3, v26, v5

    .line 1968
    .line 1969
    and-int/lit16 v4, v0, 0xff

    .line 1970
    .line 1971
    if-ne v4, v0, :cond_e

    .line 1972
    .line 1973
    and-int/lit16 v4, v1, 0xff

    .line 1974
    .line 1975
    if-ne v4, v1, :cond_e

    .line 1976
    .line 1977
    and-int/lit16 v4, v2, 0xff

    .line 1978
    .line 1979
    if-ne v4, v2, :cond_e

    .line 1980
    .line 1981
    and-int/lit16 v4, v3, 0xff

    .line 1982
    .line 1983
    if-ne v4, v3, :cond_e

    .line 1984
    .line 1985
    shl-int/lit8 v3, v3, 0x18

    .line 1986
    .line 1987
    shl-int/lit8 v2, v2, 0x10

    .line 1988
    .line 1989
    add-int/2addr v3, v2

    .line 1990
    shl-int/lit8 v1, v1, 0x8

    .line 1991
    .line 1992
    add-int/2addr v3, v1

    .line 1993
    add-int/2addr v3, v0

    .line 1994
    int-to-long v8, v3

    .line 1995
    goto/16 :goto_9

    .line 1996
    .line 1997
    :pswitch_d
    move/from16 v27, v1

    .line 1998
    .line 1999
    move/from16 v28, v5

    .line 2000
    .line 2001
    move/from16 v22, v9

    .line 2002
    .line 2003
    move-object/from16 v26, v11

    .line 2004
    .line 2005
    const-wide/16 v17, -0x1

    .line 2006
    .line 2007
    const/16 v24, 0x10

    .line 2008
    .line 2009
    const/16 v25, 0x8

    .line 2010
    .line 2011
    aget-char v0, v26, v28

    .line 2012
    .line 2013
    add-int/lit8 v5, v28, 0x1

    .line 2014
    .line 2015
    aget-char v1, v26, v5

    .line 2016
    .line 2017
    add-int/lit8 v5, v28, 0x2

    .line 2018
    .line 2019
    aget-char v2, v26, v5

    .line 2020
    .line 2021
    and-int/lit16 v3, v0, 0xff

    .line 2022
    .line 2023
    if-ne v3, v0, :cond_e

    .line 2024
    .line 2025
    and-int/lit16 v3, v1, 0xff

    .line 2026
    .line 2027
    if-ne v3, v1, :cond_e

    .line 2028
    .line 2029
    and-int/lit16 v3, v2, 0xff

    .line 2030
    .line 2031
    if-ne v3, v2, :cond_e

    .line 2032
    .line 2033
    shl-int/lit8 v2, v2, 0x10

    .line 2034
    .line 2035
    shl-int/lit8 v1, v1, 0x8

    .line 2036
    .line 2037
    add-int/2addr v2, v1

    .line 2038
    add-int/2addr v2, v0

    .line 2039
    int-to-long v8, v2

    .line 2040
    goto/16 :goto_9

    .line 2041
    .line 2042
    :cond_e
    :goto_a
    move-wide/from16 v1, v17

    .line 2043
    .line 2044
    move-wide v3, v1

    .line 2045
    :goto_b
    cmp-long v0, v1, v17

    .line 2046
    .line 2047
    move-object/from16 v5, p0

    .line 2048
    .line 2049
    iget-object v5, v5, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏楪兰:Ljava/lang/String;

    .line 2050
    .line 2051
    if-eqz v0, :cond_14

    .line 2052
    .line 2053
    cmp-long v0, v3, v17

    .line 2054
    .line 2055
    if-eqz v0, :cond_11

    .line 2056
    .line 2057
    xor-long v6, v1, v3

    .line 2058
    .line 2059
    ushr-long v8, v6, v22

    .line 2060
    .line 2061
    xor-long/2addr v6, v8

    .line 2062
    long-to-int v0, v6

    .line 2063
    sget-object v6, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰哲世:[Lcom/alibaba/fastjson2/飘花落叶言子楪苏世兰哲;

    .line 2064
    .line 2065
    and-int/lit16 v7, v0, 0x1fff

    .line 2066
    .line 2067
    aget-object v0, v6, v7

    .line 2068
    .line 2069
    if-nez v0, :cond_10

    .line 2070
    .line 2071
    if-eqz v5, :cond_f

    .line 2072
    .line 2073
    move/from16 v9, v27

    .line 2074
    .line 2075
    move/from16 v8, v28

    .line 2076
    .line 2077
    invoke-virtual {v5, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 2078
    .line 2079
    .line 2080
    move-result-object v0

    .line 2081
    :goto_c
    move-object v5, v0

    .line 2082
    goto :goto_d

    .line 2083
    :cond_f
    move/from16 v9, v27

    .line 2084
    .line 2085
    move/from16 v8, v28

    .line 2086
    .line 2087
    new-instance v0, Ljava/lang/String;

    .line 2088
    .line 2089
    sub-int v5, v9, v8

    .line 2090
    .line 2091
    move-object/from16 v11, v26

    .line 2092
    .line 2093
    invoke-direct {v0, v11, v8, v5}, Ljava/lang/String;-><init>([CII)V

    .line 2094
    .line 2095
    .line 2096
    goto :goto_c

    .line 2097
    :goto_d
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子楪苏世兰哲;

    .line 2098
    .line 2099
    invoke-direct/range {v0 .. v5}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏世兰哲;-><init>(JJLjava/lang/String;)V

    .line 2100
    .line 2101
    .line 2102
    aput-object v0, v6, v7

    .line 2103
    .line 2104
    return-object v5

    .line 2105
    :cond_10
    move-object/from16 v11, v26

    .line 2106
    .line 2107
    move/from16 v9, v27

    .line 2108
    .line 2109
    move/from16 v8, v28

    .line 2110
    .line 2111
    iget-wide v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:J

    .line 2112
    .line 2113
    cmp-long v1, v6, v1

    .line 2114
    .line 2115
    if-nez v1, :cond_15

    .line 2116
    .line 2117
    iget-wide v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:J

    .line 2118
    .line 2119
    cmp-long v1, v1, v3

    .line 2120
    .line 2121
    if-nez v1, :cond_15

    .line 2122
    .line 2123
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 2124
    .line 2125
    check-cast v0, Ljava/lang/String;

    .line 2126
    .line 2127
    return-object v0

    .line 2128
    :cond_11
    move-object/from16 v11, v26

    .line 2129
    .line 2130
    move/from16 v9, v27

    .line 2131
    .line 2132
    move/from16 v8, v28

    .line 2133
    .line 2134
    ushr-long v3, v1, v22

    .line 2135
    .line 2136
    xor-long/2addr v3, v1

    .line 2137
    long-to-int v0, v3

    .line 2138
    sget-object v3, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲:[Landroidx/recyclerview/widget/飘花落叶言子楪世苏兰哲;

    .line 2139
    .line 2140
    and-int/lit16 v0, v0, 0x1fff

    .line 2141
    .line 2142
    aget-object v4, v3, v0

    .line 2143
    .line 2144
    if-nez v4, :cond_13

    .line 2145
    .line 2146
    if-eqz v5, :cond_12

    .line 2147
    .line 2148
    invoke-virtual {v5, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 2149
    .line 2150
    .line 2151
    move-result-object v4

    .line 2152
    goto :goto_e

    .line 2153
    :cond_12
    new-instance v4, Ljava/lang/String;

    .line 2154
    .line 2155
    sub-int v5, v9, v8

    .line 2156
    .line 2157
    invoke-direct {v4, v11, v8, v5}, Ljava/lang/String;-><init>([CII)V

    .line 2158
    .line 2159
    .line 2160
    :goto_e
    new-instance v5, Landroidx/recyclerview/widget/飘花落叶言子楪世苏兰哲;

    .line 2161
    .line 2162
    invoke-direct {v5, v4, v1, v2}, Landroidx/recyclerview/widget/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;J)V

    .line 2163
    .line 2164
    .line 2165
    aput-object v5, v3, v0

    .line 2166
    .line 2167
    return-object v4

    .line 2168
    :cond_13
    iget-wide v6, v4, Landroidx/recyclerview/widget/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:J

    .line 2169
    .line 2170
    cmp-long v0, v6, v1

    .line 2171
    .line 2172
    if-nez v0, :cond_15

    .line 2173
    .line 2174
    iget-object v0, v4, Landroidx/recyclerview/widget/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 2175
    .line 2176
    check-cast v0, Ljava/lang/String;

    .line 2177
    .line 2178
    return-object v0

    .line 2179
    :cond_14
    move-object/from16 v11, v26

    .line 2180
    .line 2181
    move/from16 v9, v27

    .line 2182
    .line 2183
    move/from16 v8, v28

    .line 2184
    .line 2185
    :cond_15
    if-eqz v5, :cond_16

    .line 2186
    .line 2187
    invoke-virtual {v5, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 2188
    .line 2189
    .line 2190
    move-result-object v0

    .line 2191
    return-object v0

    .line 2192
    :cond_16
    new-instance v0, Ljava/lang/String;

    .line 2193
    .line 2194
    sub-int v1, v9, v8

    .line 2195
    .line 2196
    invoke-direct {v0, v11, v8, v1}, Ljava/lang/String;-><init>([CII)V

    .line 2197
    .line 2198
    .line 2199
    return-object v0

    .line 2200
    :pswitch_e
    move v8, v5

    .line 2201
    aget-char v0, v11, v8

    .line 2202
    .line 2203
    add-int/lit8 v5, v8, 0x1

    .line 2204
    .line 2205
    aget-char v1, v11, v5

    .line 2206
    .line 2207
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世兰苏哲楪(CC)Ljava/lang/String;

    .line 2208
    .line 2209
    .line 2210
    move-result-object v0

    .line 2211
    return-object v0

    .line 2212
    :pswitch_f
    move v8, v5

    .line 2213
    aget-char v0, v11, v8

    .line 2214
    .line 2215
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世兰苏楪哲(C)Ljava/lang/String;

    .line 2216
    .line 2217
    .line 2218
    move-result-object v0

    .line 2219
    return-object v0

    .line 2220
    :cond_17
    move-object v5, v0

    .line 2221
    invoke-virtual {v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世楪兰哲苏()Ljava/lang/String;

    .line 2222
    .line 2223
    .line 2224
    move-result-object v0

    .line 2225
    return-object v0

    .line 2226
    :cond_18
    invoke-static {v6, v8}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 2227
    .line 2228
    .line 2229
    move-result-object v0

    .line 2230
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 2231
    .line 2232
    .line 2233
    return-object v7

    .line 2234
    nop

    .line 2235
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子兰苏世楪哲()D
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 6
    .line 7
    const/16 v3, 0x22

    .line 8
    .line 9
    iget-object v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 10
    .line 11
    iget v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 12
    .line 13
    if-eq v1, v3, :cond_1

    .line 14
    .line 15
    const/16 v3, 0x27

    .line 16
    .line 17
    if-ne v1, v3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v3, v2

    .line 21
    move v2, v1

    .line 22
    const/4 v1, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    if-ne v2, v7, :cond_2

    .line 25
    .line 26
    move v3, v2

    .line 27
    const/16 v2, 0x1a

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_2
    add-int/lit8 v3, v2, 0x1

    .line 31
    .line 32
    aget-char v2, v5, v2

    .line 33
    .line 34
    :goto_1
    const/16 v8, 0x2c

    .line 35
    .line 36
    const-wide/16 v11, 0x0

    .line 37
    .line 38
    if-eqz v1, :cond_4

    .line 39
    .line 40
    if-ne v2, v1, :cond_4

    .line 41
    .line 42
    if-ne v3, v7, :cond_3

    .line 43
    .line 44
    const/16 v2, 0x1a

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_3
    add-int/lit8 v1, v3, 0x1

    .line 48
    .line 49
    aget-char v2, v5, v3

    .line 50
    .line 51
    move v3, v1

    .line 52
    :goto_2
    move-wide v9, v11

    .line 53
    move-wide/from16 v23, v9

    .line 54
    .line 55
    const/4 v13, 0x1

    .line 56
    const-wide/16 v14, 0x0

    .line 57
    .line 58
    const-wide/16 v16, 0x1

    .line 59
    .line 60
    goto/16 :goto_1a

    .line 61
    .line 62
    :cond_4
    const/16 v4, 0x2b

    .line 63
    .line 64
    const/16 v6, 0x2d

    .line 65
    .line 66
    const-wide/16 v16, 0x1

    .line 67
    .line 68
    const/16 v9, 0x30

    .line 69
    .line 70
    if-lt v2, v9, :cond_5

    .line 71
    .line 72
    const/16 v9, 0x39

    .line 73
    .line 74
    if-gt v2, v9, :cond_5

    .line 75
    .line 76
    rsub-int/lit8 v9, v2, 0x30

    .line 77
    .line 78
    int-to-long v9, v9

    .line 79
    goto :goto_4

    .line 80
    :cond_5
    if-eq v2, v6, :cond_7

    .line 81
    .line 82
    if-ne v2, v4, :cond_6

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_6
    move-wide/from16 v9, v16

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_7
    :goto_3
    move-wide v9, v11

    .line 89
    :goto_4
    cmp-long v18, v9, v11

    .line 90
    .line 91
    const-wide/16 v19, 0x64

    .line 92
    .line 93
    const-wide v21, -0x147ae147ae147aeL

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    move-wide/from16 v23, v11

    .line 99
    .line 100
    const/4 v11, -0x1

    .line 101
    if-gtz v18, :cond_9

    .line 102
    .line 103
    add-int/lit8 v12, v3, 0x1

    .line 104
    .line 105
    if-ge v12, v7, :cond_9

    .line 106
    .line 107
    invoke-static {v3, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 108
    .line 109
    .line 110
    move-result v12

    .line 111
    if-eq v12, v11, :cond_9

    .line 112
    .line 113
    cmp-long v11, v21, v9

    .line 114
    .line 115
    if-gtz v11, :cond_8

    .line 116
    .line 117
    mul-long v9, v9, v19

    .line 118
    .line 119
    int-to-long v11, v12

    .line 120
    sub-long/2addr v9, v11

    .line 121
    add-int/lit8 v3, v3, 0x2

    .line 122
    .line 123
    :goto_5
    move-wide/from16 v11, v23

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_8
    move-wide/from16 v9, v16

    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_9
    const-wide/16 v25, 0x30

    .line 130
    .line 131
    const-wide/16 v27, 0xa

    .line 132
    .line 133
    const-wide v29, -0xcccccccccccccccL

    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    if-gtz v18, :cond_c

    .line 139
    .line 140
    if-ge v3, v7, :cond_c

    .line 141
    .line 142
    aget-char v12, v5, v3

    .line 143
    .line 144
    invoke-static {v12}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲楪兰苏(I)Z

    .line 145
    .line 146
    .line 147
    move-result v18

    .line 148
    if-eqz v18, :cond_b

    .line 149
    .line 150
    cmp-long v18, v29, v9

    .line 151
    .line 152
    if-gtz v18, :cond_a

    .line 153
    .line 154
    mul-long v9, v9, v27

    .line 155
    .line 156
    add-long v9, v9, v25

    .line 157
    .line 158
    const-wide/16 v31, 0x0

    .line 159
    .line 160
    int-to-long v13, v12

    .line 161
    sub-long/2addr v9, v13

    .line 162
    add-int/lit8 v3, v3, 0x1

    .line 163
    .line 164
    goto :goto_6

    .line 165
    :cond_a
    const-wide/16 v31, 0x0

    .line 166
    .line 167
    move-wide/from16 v9, v16

    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_b
    const-wide/16 v31, 0x0

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_c
    const-wide/16 v31, 0x0

    .line 174
    .line 175
    move v12, v2

    .line 176
    :goto_6
    cmp-long v13, v9, v23

    .line 177
    .line 178
    if-gtz v13, :cond_10

    .line 179
    .line 180
    if-ge v3, v7, :cond_10

    .line 181
    .line 182
    aget-char v13, v5, v3

    .line 183
    .line 184
    const/16 v14, 0x2e

    .line 185
    .line 186
    if-ne v13, v14, :cond_10

    .line 187
    .line 188
    add-int/lit8 v3, v3, 0x1

    .line 189
    .line 190
    const/4 v13, 0x0

    .line 191
    :goto_7
    cmp-long v14, v9, v23

    .line 192
    .line 193
    if-gtz v14, :cond_e

    .line 194
    .line 195
    add-int/lit8 v15, v3, 0x1

    .line 196
    .line 197
    if-ge v15, v7, :cond_e

    .line 198
    .line 199
    invoke-static {v3, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 200
    .line 201
    .line 202
    move-result v15

    .line 203
    if-eq v15, v11, :cond_e

    .line 204
    .line 205
    cmp-long v14, v21, v9

    .line 206
    .line 207
    if-gtz v14, :cond_d

    .line 208
    .line 209
    mul-long v9, v9, v19

    .line 210
    .line 211
    int-to-long v14, v15

    .line 212
    sub-long/2addr v9, v14

    .line 213
    add-int/lit8 v3, v3, 0x2

    .line 214
    .line 215
    add-int/lit8 v13, v13, 0x2

    .line 216
    .line 217
    goto :goto_7

    .line 218
    :cond_d
    move-wide/from16 v9, v16

    .line 219
    .line 220
    goto :goto_7

    .line 221
    :cond_e
    if-gtz v14, :cond_11

    .line 222
    .line 223
    if-ge v3, v7, :cond_11

    .line 224
    .line 225
    aget-char v12, v5, v3

    .line 226
    .line 227
    invoke-static {v12}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲楪兰苏(I)Z

    .line 228
    .line 229
    .line 230
    move-result v14

    .line 231
    if-eqz v14, :cond_11

    .line 232
    .line 233
    cmp-long v14, v29, v9

    .line 234
    .line 235
    if-gtz v14, :cond_f

    .line 236
    .line 237
    mul-long v9, v9, v27

    .line 238
    .line 239
    add-long v9, v9, v25

    .line 240
    .line 241
    int-to-long v14, v12

    .line 242
    sub-long/2addr v9, v14

    .line 243
    add-int/lit8 v3, v3, 0x1

    .line 244
    .line 245
    add-int/lit8 v13, v13, 0x1

    .line 246
    .line 247
    goto :goto_8

    .line 248
    :cond_f
    move-wide/from16 v9, v16

    .line 249
    .line 250
    goto :goto_8

    .line 251
    :cond_10
    const/4 v13, 0x0

    .line 252
    :cond_11
    :goto_8
    cmp-long v14, v9, v23

    .line 253
    .line 254
    if-gtz v14, :cond_13

    .line 255
    .line 256
    if-ne v3, v7, :cond_12

    .line 257
    .line 258
    const/16 v12, 0x1a

    .line 259
    .line 260
    goto :goto_9

    .line 261
    :cond_12
    add-int/lit8 v12, v3, 0x1

    .line 262
    .line 263
    aget-char v3, v5, v3

    .line 264
    .line 265
    move/from16 v33, v12

    .line 266
    .line 267
    move v12, v3

    .line 268
    move/from16 v3, v33

    .line 269
    .line 270
    :cond_13
    :goto_9
    if-gtz v14, :cond_23

    .line 271
    .line 272
    const/16 v14, 0x65

    .line 273
    .line 274
    if-eq v12, v14, :cond_17

    .line 275
    .line 276
    const/16 v14, 0x45

    .line 277
    .line 278
    if-ne v12, v14, :cond_14

    .line 279
    .line 280
    goto :goto_a

    .line 281
    :cond_14
    const/16 v4, 0x4c

    .line 282
    .line 283
    if-eq v12, v4, :cond_15

    .line 284
    .line 285
    const/16 v4, 0x46

    .line 286
    .line 287
    if-eq v12, v4, :cond_15

    .line 288
    .line 289
    const/16 v4, 0x44

    .line 290
    .line 291
    if-eq v12, v4, :cond_15

    .line 292
    .line 293
    const/16 v4, 0x42

    .line 294
    .line 295
    if-eq v12, v4, :cond_15

    .line 296
    .line 297
    const/16 v4, 0x53

    .line 298
    .line 299
    if-ne v12, v4, :cond_23

    .line 300
    .line 301
    :cond_15
    if-ne v3, v7, :cond_16

    .line 302
    .line 303
    const/16 v12, 0x1a

    .line 304
    .line 305
    goto/16 :goto_11

    .line 306
    .line 307
    :cond_16
    add-int/lit8 v4, v3, 0x1

    .line 308
    .line 309
    aget-char v3, v5, v3

    .line 310
    .line 311
    move v12, v3

    .line 312
    move v3, v4

    .line 313
    goto/16 :goto_11

    .line 314
    .line 315
    :cond_17
    :goto_a
    if-ne v3, v7, :cond_18

    .line 316
    .line 317
    move v12, v3

    .line 318
    const/16 v3, 0x1a

    .line 319
    .line 320
    goto :goto_b

    .line 321
    :cond_18
    add-int/lit8 v12, v3, 0x1

    .line 322
    .line 323
    aget-char v3, v5, v3

    .line 324
    .line 325
    :goto_b
    if-ne v3, v6, :cond_19

    .line 326
    .line 327
    const/4 v14, 0x1

    .line 328
    goto :goto_c

    .line 329
    :cond_19
    const/4 v14, 0x0

    .line 330
    :goto_c
    if-nez v14, :cond_1c

    .line 331
    .line 332
    if-ne v3, v4, :cond_1a

    .line 333
    .line 334
    goto :goto_d

    .line 335
    :cond_1a
    if-eq v3, v8, :cond_1b

    .line 336
    .line 337
    goto :goto_e

    .line 338
    :cond_1b
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰楪世苏()Lcom/alibaba/fastjson2/JSONException;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    throw v0

    .line 343
    :cond_1c
    :goto_d
    if-ne v12, v7, :cond_1d

    .line 344
    .line 345
    const/16 v3, 0x1a

    .line 346
    .line 347
    goto :goto_e

    .line 348
    :cond_1d
    add-int/lit8 v3, v12, 0x1

    .line 349
    .line 350
    aget-char v4, v5, v12

    .line 351
    .line 352
    move v12, v3

    .line 353
    move v3, v4

    .line 354
    :goto_e
    invoke-static {v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲楪兰苏(I)Z

    .line 355
    .line 356
    .line 357
    move-result v4

    .line 358
    if-eqz v4, :cond_22

    .line 359
    .line 360
    add-int/lit8 v3, v3, -0x30

    .line 361
    .line 362
    :goto_f
    if-ge v12, v7, :cond_1f

    .line 363
    .line 364
    aget-char v4, v5, v12

    .line 365
    .line 366
    invoke-static {v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲楪兰苏(I)Z

    .line 367
    .line 368
    .line 369
    move-result v15

    .line 370
    if-eqz v15, :cond_1f

    .line 371
    .line 372
    add-int/lit8 v4, v4, -0x30

    .line 373
    .line 374
    mul-int/lit8 v3, v3, 0xa

    .line 375
    .line 376
    add-int/2addr v3, v4

    .line 377
    const/16 v4, 0x7ff

    .line 378
    .line 379
    if-gt v3, v4, :cond_1e

    .line 380
    .line 381
    add-int/lit8 v12, v12, 0x1

    .line 382
    .line 383
    goto :goto_f

    .line 384
    :cond_1e
    const-string v0, "too large exp value : "

    .line 385
    .line 386
    invoke-static {v3, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    return-wide v31

    .line 394
    :cond_1f
    if-eqz v14, :cond_20

    .line 395
    .line 396
    neg-int v3, v3

    .line 397
    :cond_20
    sub-int/2addr v13, v3

    .line 398
    if-ne v12, v7, :cond_21

    .line 399
    .line 400
    const/16 v4, 0x1a

    .line 401
    .line 402
    goto :goto_10

    .line 403
    :cond_21
    add-int/lit8 v3, v12, 0x1

    .line 404
    .line 405
    aget-char v4, v5, v12

    .line 406
    .line 407
    move v12, v3

    .line 408
    :goto_10
    move v3, v12

    .line 409
    move v12, v4

    .line 410
    goto :goto_11

    .line 411
    :cond_22
    move v9, v12

    .line 412
    move v12, v3

    .line 413
    move v3, v9

    .line 414
    move-wide/from16 v9, v16

    .line 415
    .line 416
    :cond_23
    :goto_11
    cmp-long v4, v9, v23

    .line 417
    .line 418
    if-gtz v4, :cond_26

    .line 419
    .line 420
    if-eqz v1, :cond_26

    .line 421
    .line 422
    if-ne v12, v1, :cond_25

    .line 423
    .line 424
    if-ne v3, v7, :cond_24

    .line 425
    .line 426
    move v1, v3

    .line 427
    const/16 v3, 0x1a

    .line 428
    .line 429
    goto :goto_12

    .line 430
    :cond_24
    add-int/lit8 v1, v3, 0x1

    .line 431
    .line 432
    aget-char v3, v5, v3

    .line 433
    .line 434
    :goto_12
    move v12, v3

    .line 435
    move v3, v1

    .line 436
    goto :goto_13

    .line 437
    :cond_25
    move-wide/from16 v9, v16

    .line 438
    .line 439
    :cond_26
    :goto_13
    cmp-long v1, v9, v23

    .line 440
    .line 441
    if-gtz v1, :cond_2f

    .line 442
    .line 443
    if-nez v13, :cond_27

    .line 444
    .line 445
    long-to-double v14, v9

    .line 446
    move/from16 v19, v12

    .line 447
    .line 448
    :goto_14
    const/4 v11, 0x1

    .line 449
    goto :goto_15

    .line 450
    :cond_27
    long-to-double v14, v9

    .line 451
    move/from16 v19, v12

    .line 452
    .line 453
    double-to-long v11, v14

    .line 454
    cmp-long v11, v11, v9

    .line 455
    .line 456
    if-nez v11, :cond_29

    .line 457
    .line 458
    if-lez v13, :cond_28

    .line 459
    .line 460
    sget-object v11, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:[D

    .line 461
    .line 462
    const/16 v12, 0x17

    .line 463
    .line 464
    if-ge v13, v12, :cond_28

    .line 465
    .line 466
    aget-wide v20, v11, v13

    .line 467
    .line 468
    div-double v14, v14, v20

    .line 469
    .line 470
    goto :goto_14

    .line 471
    :cond_28
    if-gez v13, :cond_29

    .line 472
    .line 473
    sget-object v11, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:[D

    .line 474
    .line 475
    const/16 v12, -0x17

    .line 476
    .line 477
    if-le v13, v12, :cond_29

    .line 478
    .line 479
    neg-int v12, v13

    .line 480
    aget-wide v20, v11, v12

    .line 481
    .line 482
    mul-double v14, v14, v20

    .line 483
    .line 484
    goto :goto_14

    .line 485
    :cond_29
    move-wide/from16 v14, v31

    .line 486
    .line 487
    const/4 v11, 0x0

    .line 488
    :goto_15
    if-nez v11, :cond_2d

    .line 489
    .line 490
    if-lez v13, :cond_2c

    .line 491
    .line 492
    const/16 v1, 0x40

    .line 493
    .line 494
    if-ge v13, v1, :cond_2c

    .line 495
    .line 496
    if-ne v2, v6, :cond_2a

    .line 497
    .line 498
    const/4 v11, -0x1

    .line 499
    goto :goto_16

    .line 500
    :cond_2a
    const/4 v11, 0x1

    .line 501
    :goto_16
    invoke-static {v9, v10}, Ljava/lang/Math;->abs(J)J

    .line 502
    .line 503
    .line 504
    move-result-wide v1

    .line 505
    invoke-static {v11, v13, v1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世兰哲苏(IIJ)D

    .line 506
    .line 507
    .line 508
    move-result-wide v14

    .line 509
    :cond_2b
    :goto_17
    move/from16 v2, v19

    .line 510
    .line 511
    :goto_18
    const/4 v13, 0x0

    .line 512
    goto :goto_1a

    .line 513
    :cond_2c
    move-wide/from16 v9, v16

    .line 514
    .line 515
    goto :goto_17

    .line 516
    :cond_2d
    if-eq v2, v6, :cond_2e

    .line 517
    .line 518
    cmpl-double v1, v14, v31

    .line 519
    .line 520
    if-eqz v1, :cond_2b

    .line 521
    .line 522
    :goto_19
    neg-double v14, v14

    .line 523
    goto :goto_17

    .line 524
    :cond_2e
    if-nez v1, :cond_2b

    .line 525
    .line 526
    goto :goto_19

    .line 527
    :cond_2f
    move/from16 v19, v12

    .line 528
    .line 529
    move/from16 v2, v19

    .line 530
    .line 531
    move-wide/from16 v14, v31

    .line 532
    .line 533
    goto :goto_18

    .line 534
    :goto_1a
    cmp-long v1, v9, v23

    .line 535
    .line 536
    if-lez v1, :cond_30

    .line 537
    .line 538
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪世哲苏子兰()V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲兰苏()D

    .line 542
    .line 543
    .line 544
    move-result-wide v0

    .line 545
    return-wide v0

    .line 546
    :cond_30
    :goto_1b
    const-wide v9, 0x100003700L

    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    const/16 v1, 0x20

    .line 552
    .line 553
    if-gt v2, v1, :cond_32

    .line 554
    .line 555
    shl-long v11, v16, v2

    .line 556
    .line 557
    and-long/2addr v11, v9

    .line 558
    cmp-long v4, v11, v23

    .line 559
    .line 560
    if-eqz v4, :cond_32

    .line 561
    .line 562
    if-ne v3, v7, :cond_31

    .line 563
    .line 564
    const/16 v2, 0x1a

    .line 565
    .line 566
    goto :goto_1b

    .line 567
    :cond_31
    add-int/lit8 v1, v3, 0x1

    .line 568
    .line 569
    aget-char v2, v5, v3

    .line 570
    .line 571
    move v3, v1

    .line 572
    goto :goto_1b

    .line 573
    :cond_32
    if-ne v2, v8, :cond_33

    .line 574
    .line 575
    const/4 v6, 0x1

    .line 576
    goto :goto_1c

    .line 577
    :cond_33
    const/4 v6, 0x0

    .line 578
    :goto_1c
    iput-boolean v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 579
    .line 580
    if-eqz v6, :cond_36

    .line 581
    .line 582
    if-ne v3, v7, :cond_34

    .line 583
    .line 584
    move v2, v3

    .line 585
    const/16 v3, 0x1a

    .line 586
    .line 587
    goto :goto_1d

    .line 588
    :cond_34
    add-int/lit8 v2, v3, 0x1

    .line 589
    .line 590
    aget-char v3, v5, v3

    .line 591
    .line 592
    :goto_1d
    move/from16 v33, v3

    .line 593
    .line 594
    move v3, v2

    .line 595
    move/from16 v2, v33

    .line 596
    .line 597
    :goto_1e
    if-gt v2, v1, :cond_36

    .line 598
    .line 599
    shl-long v11, v16, v2

    .line 600
    .line 601
    and-long/2addr v11, v9

    .line 602
    cmp-long v4, v11, v23

    .line 603
    .line 604
    if-eqz v4, :cond_36

    .line 605
    .line 606
    if-ne v3, v7, :cond_35

    .line 607
    .line 608
    const/16 v2, 0x1a

    .line 609
    .line 610
    goto :goto_1e

    .line 611
    :cond_35
    add-int/lit8 v2, v3, 0x1

    .line 612
    .line 613
    aget-char v3, v5, v3

    .line 614
    .line 615
    goto :goto_1d

    .line 616
    :cond_36
    iput-boolean v13, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 617
    .line 618
    int-to-char v1, v2

    .line 619
    iput-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 620
    .line 621
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 622
    .line 623
    return-wide v14
.end method

.method public final 飘花落叶言子兰苏哲世楪()J
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏哲世:Z

    .line 5
    .line 6
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 7
    .line 8
    iget-char v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 9
    .line 10
    add-int/lit8 v4, v2, -0x1

    .line 11
    .line 12
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪苏哲:I

    .line 13
    .line 14
    move v7, v1

    .line 15
    move v6, v3

    .line 16
    const-wide/16 v8, 0x0

    .line 17
    .line 18
    :goto_0
    const-wide/16 v16, 0x0

    .line 19
    .line 20
    const/16 v4, 0x5d

    .line 21
    .line 22
    const/16 v5, 0x5b

    .line 23
    .line 24
    const/16 v10, 0xd

    .line 25
    .line 26
    const/16 v11, 0xc

    .line 27
    .line 28
    const-wide v19, 0x100003700L

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    const-wide/16 v21, 0x1

    .line 34
    .line 35
    const/16 v13, 0x3a

    .line 36
    .line 37
    const/16 v15, 0x1a

    .line 38
    .line 39
    iget v12, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 40
    .line 41
    iget-object v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 42
    .line 43
    const/4 v14, 0x1

    .line 44
    if-gt v2, v12, :cond_a

    .line 45
    .line 46
    if-eq v6, v11, :cond_7

    .line 47
    .line 48
    if-eq v6, v10, :cond_7

    .line 49
    .line 50
    if-eq v6, v15, :cond_7

    .line 51
    .line 52
    const/16 v10, 0x26

    .line 53
    .line 54
    if-eq v6, v10, :cond_7

    .line 55
    .line 56
    if-eq v6, v13, :cond_7

    .line 57
    .line 58
    if-eq v6, v5, :cond_7

    .line 59
    .line 60
    if-eq v6, v4, :cond_7

    .line 61
    .line 62
    const/16 v10, 0x20

    .line 63
    .line 64
    if-eq v6, v10, :cond_7

    .line 65
    .line 66
    const/16 v10, 0x21

    .line 67
    .line 68
    if-eq v6, v10, :cond_7

    .line 69
    .line 70
    packed-switch v6, :pswitch_data_0

    .line 71
    .line 72
    .line 73
    packed-switch v6, :pswitch_data_1

    .line 74
    .line 75
    .line 76
    packed-switch v6, :pswitch_data_2

    .line 77
    .line 78
    .line 79
    packed-switch v6, :pswitch_data_3

    .line 80
    .line 81
    .line 82
    const/16 v10, 0x5c

    .line 83
    .line 84
    if-ne v6, v10, :cond_3

    .line 85
    .line 86
    iput-boolean v14, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏哲世:Z

    .line 87
    .line 88
    add-int/lit8 v6, v2, 0x1

    .line 89
    .line 90
    aget-char v4, v1, v2

    .line 91
    .line 92
    const/16 v5, 0x22

    .line 93
    .line 94
    if-eq v4, v5, :cond_2

    .line 95
    .line 96
    if-eq v4, v13, :cond_2

    .line 97
    .line 98
    const/16 v5, 0x40

    .line 99
    .line 100
    if-eq v4, v5, :cond_2

    .line 101
    .line 102
    if-eq v4, v10, :cond_2

    .line 103
    .line 104
    const/16 v5, 0x75

    .line 105
    .line 106
    if-eq v4, v5, :cond_1

    .line 107
    .line 108
    const/16 v5, 0x78

    .line 109
    .line 110
    if-eq v4, v5, :cond_0

    .line 111
    .line 112
    const/16 v5, 0x2a

    .line 113
    .line 114
    if-eq v4, v5, :cond_2

    .line 115
    .line 116
    const/16 v2, 0x2b

    .line 117
    .line 118
    if-eq v4, v2, :cond_2

    .line 119
    .line 120
    packed-switch v4, :pswitch_data_4

    .line 121
    .line 122
    .line 123
    packed-switch v4, :pswitch_data_5

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世哲兰(I)C

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    move/from16 v26, v6

    .line 131
    .line 132
    move v6, v2

    .line 133
    move/from16 v2, v26

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_0
    aget-char v4, v1, v6

    .line 137
    .line 138
    add-int/lit8 v5, v2, 0x2

    .line 139
    .line 140
    aget-char v5, v1, v5

    .line 141
    .line 142
    invoke-static {v4, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世兰哲(II)C

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    add-int/lit8 v2, v2, 0x3

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_1
    invoke-static {v6, v12}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 150
    .line 151
    .line 152
    invoke-static {v6, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪兰苏哲(I[C)I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    int-to-char v6, v4

    .line 157
    add-int/lit8 v2, v2, 0x5

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_2
    :pswitch_0
    move v2, v6

    .line 161
    move v6, v4

    .line 162
    :cond_3
    :goto_1
    const/16 v4, 0xff

    .line 163
    .line 164
    if-gt v6, v4, :cond_6

    .line 165
    .line 166
    const/16 v4, 0x8

    .line 167
    .line 168
    if-ge v7, v4, :cond_6

    .line 169
    .line 170
    if-nez v7, :cond_4

    .line 171
    .line 172
    if-nez v6, :cond_4

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_4
    int-to-byte v4, v6

    .line 176
    packed-switch v7, :pswitch_data_6

    .line 177
    .line 178
    .line 179
    goto :goto_3

    .line 180
    :pswitch_1
    int-to-long v4, v4

    .line 181
    const/16 v6, 0x38

    .line 182
    .line 183
    shl-long/2addr v4, v6

    .line 184
    const-wide v10, 0xffffffffffffffL

    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    :goto_2
    and-long/2addr v8, v10

    .line 190
    add-long/2addr v8, v4

    .line 191
    goto :goto_3

    .line 192
    :pswitch_2
    int-to-long v4, v4

    .line 193
    const/16 v6, 0x30

    .line 194
    .line 195
    shl-long/2addr v4, v6

    .line 196
    const-wide v10, 0xffffffffffffL

    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    goto :goto_2

    .line 202
    :pswitch_3
    int-to-long v4, v4

    .line 203
    const/16 v6, 0x28

    .line 204
    .line 205
    shl-long/2addr v4, v6

    .line 206
    const-wide v10, 0xffffffffffL

    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    goto :goto_2

    .line 212
    :pswitch_4
    int-to-long v4, v4

    .line 213
    const/16 v23, 0x20

    .line 214
    .line 215
    shl-long v4, v4, v23

    .line 216
    .line 217
    const-wide v10, 0xffffffffL

    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    goto :goto_2

    .line 223
    :pswitch_5
    shl-int/lit8 v4, v4, 0x18

    .line 224
    .line 225
    int-to-long v4, v4

    .line 226
    const-wide/32 v10, 0xffffff

    .line 227
    .line 228
    .line 229
    goto :goto_2

    .line 230
    :pswitch_6
    shl-int/lit8 v4, v4, 0x10

    .line 231
    .line 232
    int-to-long v4, v4

    .line 233
    const-wide/32 v10, 0xffff

    .line 234
    .line 235
    .line 236
    goto :goto_2

    .line 237
    :pswitch_7
    shl-int/lit8 v4, v4, 0x8

    .line 238
    .line 239
    int-to-long v4, v4

    .line 240
    const-wide/16 v10, 0xff

    .line 241
    .line 242
    goto :goto_2

    .line 243
    :pswitch_8
    int-to-long v8, v4

    .line 244
    :goto_3
    if-ne v2, v12, :cond_5

    .line 245
    .line 246
    move v6, v15

    .line 247
    goto :goto_4

    .line 248
    :cond_5
    add-int/lit8 v4, v2, 0x1

    .line 249
    .line 250
    aget-char v1, v1, v2

    .line 251
    .line 252
    move v6, v1

    .line 253
    move v2, v4

    .line 254
    :goto_4
    add-int/lit8 v7, v7, 0x1

    .line 255
    .line 256
    const/4 v1, 0x0

    .line 257
    goto/16 :goto_0

    .line 258
    .line 259
    :cond_6
    :goto_5
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪苏哲:I

    .line 260
    .line 261
    add-int/2addr v2, v14

    .line 262
    move-wide/from16 v8, v16

    .line 263
    .line 264
    goto :goto_7

    .line 265
    :cond_7
    :pswitch_9
    iput v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰苏楪哲:I

    .line 266
    .line 267
    if-ne v6, v15, :cond_8

    .line 268
    .line 269
    move v3, v2

    .line 270
    goto :goto_6

    .line 271
    :cond_8
    add-int/lit8 v3, v2, -0x1

    .line 272
    .line 273
    :goto_6
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪哲苏:I

    .line 274
    .line 275
    const/16 v10, 0x20

    .line 276
    .line 277
    if-gt v6, v10, :cond_a

    .line 278
    .line 279
    shl-long v3, v21, v6

    .line 280
    .line 281
    and-long v3, v3, v19

    .line 282
    .line 283
    cmp-long v3, v3, v16

    .line 284
    .line 285
    if-eqz v3, :cond_a

    .line 286
    .line 287
    if-ne v2, v12, :cond_9

    .line 288
    .line 289
    move v3, v15

    .line 290
    goto :goto_7

    .line 291
    :cond_9
    add-int/lit8 v3, v2, 0x1

    .line 292
    .line 293
    aget-char v2, v1, v2

    .line 294
    .line 295
    move/from16 v26, v3

    .line 296
    .line 297
    move v3, v2

    .line 298
    move/from16 v2, v26

    .line 299
    .line 300
    goto :goto_7

    .line 301
    :cond_a
    move v3, v6

    .line 302
    :goto_7
    cmp-long v4, v8, v16

    .line 303
    .line 304
    if-eqz v4, :cond_b

    .line 305
    .line 306
    goto/16 :goto_10

    .line 307
    .line 308
    :cond_b
    const-wide v4, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    move-wide v8, v4

    .line 314
    move v4, v3

    .line 315
    move v3, v2

    .line 316
    const/4 v2, 0x0

    .line 317
    :goto_8
    const/16 v10, 0x5c

    .line 318
    .line 319
    if-ne v4, v10, :cond_13

    .line 320
    .line 321
    iput-boolean v14, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏哲世:Z

    .line 322
    .line 323
    add-int/lit8 v4, v3, 0x1

    .line 324
    .line 325
    aget-char v7, v1, v3

    .line 326
    .line 327
    const/16 v5, 0x22

    .line 328
    .line 329
    const-wide v24, 0x100000001b3L

    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    if-eq v7, v5, :cond_11

    .line 335
    .line 336
    if-eq v7, v13, :cond_11

    .line 337
    .line 338
    const/16 v6, 0x40

    .line 339
    .line 340
    if-eq v7, v6, :cond_10

    .line 341
    .line 342
    if-eq v7, v10, :cond_10

    .line 343
    .line 344
    const/16 v5, 0x75

    .line 345
    .line 346
    if-eq v7, v5, :cond_f

    .line 347
    .line 348
    const/16 v5, 0x78

    .line 349
    .line 350
    if-eq v7, v5, :cond_e

    .line 351
    .line 352
    const/16 v5, 0x2a

    .line 353
    .line 354
    if-eq v7, v5, :cond_d

    .line 355
    .line 356
    const/16 v3, 0x2b

    .line 357
    .line 358
    if-eq v7, v3, :cond_c

    .line 359
    .line 360
    packed-switch v7, :pswitch_data_7

    .line 361
    .line 362
    .line 363
    packed-switch v7, :pswitch_data_8

    .line 364
    .line 365
    .line 366
    invoke-virtual {v0, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世哲兰(I)C

    .line 367
    .line 368
    .line 369
    move-result v7

    .line 370
    :cond_c
    :pswitch_a
    move/from16 v18, v3

    .line 371
    .line 372
    goto :goto_a

    .line 373
    :cond_d
    :goto_9
    const/16 v18, 0x2b

    .line 374
    .line 375
    goto :goto_a

    .line 376
    :cond_e
    const/16 v5, 0x2a

    .line 377
    .line 378
    const/16 v18, 0x2b

    .line 379
    .line 380
    aget-char v4, v1, v4

    .line 381
    .line 382
    add-int/lit8 v7, v3, 0x2

    .line 383
    .line 384
    aget-char v7, v1, v7

    .line 385
    .line 386
    invoke-static {v4, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世兰哲(II)C

    .line 387
    .line 388
    .line 389
    move-result v7

    .line 390
    add-int/lit8 v4, v3, 0x3

    .line 391
    .line 392
    goto :goto_a

    .line 393
    :cond_f
    const/16 v5, 0x2a

    .line 394
    .line 395
    const/16 v18, 0x2b

    .line 396
    .line 397
    invoke-static {v4, v12}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 398
    .line 399
    .line 400
    invoke-static {v4, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪兰苏哲(I[C)I

    .line 401
    .line 402
    .line 403
    move-result v4

    .line 404
    int-to-char v7, v4

    .line 405
    add-int/lit8 v4, v3, 0x5

    .line 406
    .line 407
    goto :goto_a

    .line 408
    :cond_10
    const/16 v5, 0x2a

    .line 409
    .line 410
    goto :goto_9

    .line 411
    :cond_11
    const/16 v5, 0x2a

    .line 412
    .line 413
    const/16 v6, 0x40

    .line 414
    .line 415
    goto :goto_9

    .line 416
    :goto_a
    int-to-long v5, v7

    .line 417
    xor-long/2addr v5, v8

    .line 418
    mul-long v5, v5, v24

    .line 419
    .line 420
    if-ne v4, v12, :cond_12

    .line 421
    .line 422
    move v3, v4

    .line 423
    move v4, v15

    .line 424
    goto :goto_b

    .line 425
    :cond_12
    add-int/lit8 v3, v4, 0x1

    .line 426
    .line 427
    aget-char v4, v1, v4

    .line 428
    .line 429
    :goto_b
    move-wide v8, v5

    .line 430
    const/16 v7, 0x5d

    .line 431
    .line 432
    goto :goto_d

    .line 433
    :cond_13
    const/16 v18, 0x2b

    .line 434
    .line 435
    const-wide v24, 0x100000001b3L

    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    if-eq v4, v11, :cond_15

    .line 441
    .line 442
    const/16 v5, 0xd

    .line 443
    .line 444
    if-eq v4, v5, :cond_15

    .line 445
    .line 446
    if-eq v4, v15, :cond_15

    .line 447
    .line 448
    if-eq v4, v13, :cond_15

    .line 449
    .line 450
    const/16 v6, 0x5b

    .line 451
    .line 452
    if-eq v4, v6, :cond_15

    .line 453
    .line 454
    const/16 v7, 0x5d

    .line 455
    .line 456
    if-eq v4, v7, :cond_15

    .line 457
    .line 458
    const/16 v5, 0x7b

    .line 459
    .line 460
    if-eq v4, v5, :cond_15

    .line 461
    .line 462
    const/16 v5, 0x7d

    .line 463
    .line 464
    if-eq v4, v5, :cond_15

    .line 465
    .line 466
    const/16 v5, 0x20

    .line 467
    .line 468
    if-eq v4, v5, :cond_15

    .line 469
    .line 470
    const/16 v5, 0x21

    .line 471
    .line 472
    if-eq v4, v5, :cond_15

    .line 473
    .line 474
    packed-switch v4, :pswitch_data_9

    .line 475
    .line 476
    .line 477
    packed-switch v4, :pswitch_data_a

    .line 478
    .line 479
    .line 480
    packed-switch v4, :pswitch_data_b

    .line 481
    .line 482
    .line 483
    int-to-long v5, v4

    .line 484
    xor-long v4, v8, v5

    .line 485
    .line 486
    mul-long v4, v4, v24

    .line 487
    .line 488
    if-ne v3, v12, :cond_14

    .line 489
    .line 490
    move v6, v3

    .line 491
    move v3, v15

    .line 492
    goto :goto_c

    .line 493
    :cond_14
    add-int/lit8 v6, v3, 0x1

    .line 494
    .line 495
    aget-char v3, v1, v3

    .line 496
    .line 497
    :goto_c
    move-wide v8, v4

    .line 498
    move v4, v3

    .line 499
    move v3, v6

    .line 500
    :goto_d
    add-int/lit8 v2, v2, 0x1

    .line 501
    .line 502
    goto/16 :goto_8

    .line 503
    .line 504
    :cond_15
    :pswitch_b
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰苏楪哲:I

    .line 505
    .line 506
    if-ne v4, v15, :cond_16

    .line 507
    .line 508
    move v2, v3

    .line 509
    goto :goto_e

    .line 510
    :cond_16
    add-int/lit8 v2, v3, -0x1

    .line 511
    .line 512
    :goto_e
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪哲苏:I

    .line 513
    .line 514
    move v2, v3

    .line 515
    move v3, v4

    .line 516
    :goto_f
    const/16 v10, 0x20

    .line 517
    .line 518
    if-gt v3, v10, :cond_18

    .line 519
    .line 520
    shl-long v4, v21, v3

    .line 521
    .line 522
    and-long v4, v4, v19

    .line 523
    .line 524
    cmp-long v4, v4, v16

    .line 525
    .line 526
    if-eqz v4, :cond_18

    .line 527
    .line 528
    if-ne v2, v12, :cond_17

    .line 529
    .line 530
    move v3, v15

    .line 531
    goto :goto_f

    .line 532
    :cond_17
    add-int/lit8 v3, v2, 0x1

    .line 533
    .line 534
    aget-char v2, v1, v2

    .line 535
    .line 536
    move/from16 v26, v3

    .line 537
    .line 538
    move v3, v2

    .line 539
    move/from16 v2, v26

    .line 540
    .line 541
    goto :goto_f

    .line 542
    :cond_18
    :goto_10
    if-ne v3, v13, :cond_1b

    .line 543
    .line 544
    if-ne v2, v12, :cond_19

    .line 545
    .line 546
    move v3, v2

    .line 547
    move v2, v15

    .line 548
    goto :goto_11

    .line 549
    :cond_19
    add-int/lit8 v3, v2, 0x1

    .line 550
    .line 551
    aget-char v2, v1, v2

    .line 552
    .line 553
    :goto_11
    move v10, v3

    .line 554
    move v3, v2

    .line 555
    move v2, v10

    .line 556
    const/16 v10, 0x20

    .line 557
    .line 558
    :goto_12
    if-gt v3, v10, :cond_1b

    .line 559
    .line 560
    shl-long v4, v21, v3

    .line 561
    .line 562
    and-long v4, v4, v19

    .line 563
    .line 564
    cmp-long v4, v4, v16

    .line 565
    .line 566
    if-eqz v4, :cond_1b

    .line 567
    .line 568
    if-ne v2, v12, :cond_1a

    .line 569
    .line 570
    move v3, v15

    .line 571
    goto :goto_12

    .line 572
    :cond_1a
    add-int/lit8 v3, v2, 0x1

    .line 573
    .line 574
    aget-char v2, v1, v2

    .line 575
    .line 576
    move/from16 v26, v3

    .line 577
    .line 578
    move v3, v2

    .line 579
    move/from16 v2, v26

    .line 580
    .line 581
    goto :goto_12

    .line 582
    :cond_1b
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 583
    .line 584
    iput-char v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 585
    .line 586
    return-wide v8

    .line 587
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_9
        :pswitch_9
        :pswitch_9
    .end packed-switch

    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    :pswitch_data_1
    .packed-switch 0x28
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
    .end packed-switch

    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    :pswitch_data_2
    .packed-switch 0x3c
        :pswitch_9
        :pswitch_9
        :pswitch_9
    .end packed-switch

    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    :pswitch_data_3
    .packed-switch 0x7b
        :pswitch_9
        :pswitch_9
        :pswitch_9
    .end packed-switch

    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    :pswitch_data_4
    .packed-switch 0x2d
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    :pswitch_data_5
    .packed-switch 0x3c
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    :pswitch_data_6
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    :pswitch_data_7
    .packed-switch 0x2d
        :pswitch_a
        :pswitch_a
        :pswitch_a
    .end packed-switch

    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    :pswitch_data_8
    .packed-switch 0x3c
        :pswitch_a
        :pswitch_a
        :pswitch_a
    .end packed-switch

    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    :pswitch_data_9
    .packed-switch 0x8
        :pswitch_b
        :pswitch_b
        :pswitch_b
    .end packed-switch

    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    :pswitch_data_a
    .packed-switch 0x28
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
        :pswitch_b
    .end packed-switch

    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    :pswitch_data_b
    .packed-switch 0x3c
        :pswitch_b
        :pswitch_b
        :pswitch_b
    .end packed-switch
.end method

.method public final 飘花落叶言子兰苏哲楪世()J
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 4
    .line 5
    const/16 v2, 0x2f

    .line 6
    .line 7
    if-ne v1, v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏世子兰哲()V

    .line 10
    .line 11
    .line 12
    iget-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 13
    .line 14
    :cond_0
    iget-object v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 15
    .line 16
    const/16 v3, 0x27

    .line 17
    .line 18
    const-wide/16 v4, 0x0

    .line 19
    .line 20
    if-ne v1, v3, :cond_2

    .line 21
    .line 22
    iget-wide v6, v2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 23
    .line 24
    sget-object v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->DisableSingleQuote:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 25
    .line 26
    iget-wide v8, v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 27
    .line 28
    and-long/2addr v6, v8

    .line 29
    cmp-long v6, v6, v4

    .line 30
    .line 31
    if-nez v6, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏兰世楪()Lcom/alibaba/fastjson2/JSONException;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    throw v0

    .line 39
    :cond_2
    :goto_0
    const/16 v6, 0x22

    .line 40
    .line 41
    iget v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 42
    .line 43
    const/16 v8, 0x75

    .line 44
    .line 45
    iget-object v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 46
    .line 47
    if-eq v1, v6, :cond_7

    .line 48
    .line 49
    if-eq v1, v3, :cond_7

    .line 50
    .line 51
    iget-wide v2, v2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 52
    .line 53
    sget-object v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->AllowUnQuotedFieldNames:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 54
    .line 55
    iget-wide v10, v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 56
    .line 57
    and-long/2addr v2, v10

    .line 58
    cmp-long v2, v2, v4

    .line 59
    .line 60
    if-eqz v2, :cond_3

    .line 61
    .line 62
    invoke-static {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲楪世兰(I)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子兰苏哲世楪()J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    return-wide v0

    .line 73
    :cond_3
    const/16 v2, 0x7d

    .line 74
    .line 75
    if-eq v1, v2, :cond_6

    .line 76
    .line 77
    iget-char v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 78
    .line 79
    const/16 v3, 0x6e

    .line 80
    .line 81
    if-ne v2, v3, :cond_4

    .line 82
    .line 83
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 84
    .line 85
    if-ge v2, v7, :cond_4

    .line 86
    .line 87
    aget-char v2, v9, v2

    .line 88
    .line 89
    if-ne v2, v8, :cond_4

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_4
    const/16 v2, 0x5b

    .line 93
    .line 94
    if-ne v1, v2, :cond_5

    .line 95
    .line 96
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪苏哲:I

    .line 97
    .line 98
    if-lez v2, :cond_5

    .line 99
    .line 100
    new-instance v2, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v3, "illegal fieldName input "

    .line 103
    .line 104
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v1, ", previous fieldName "

    .line 111
    .line 112
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世楪兰哲苏()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    goto :goto_1

    .line 127
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    const-string v3, "illegal fieldName input"

    .line 130
    .line 131
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    :goto_1
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return-wide v4

    .line 149
    :cond_6
    :goto_2
    const-wide/16 v0, -0x1

    .line 150
    .line 151
    return-wide v0

    .line 152
    :cond_7
    const/4 v2, 0x0

    .line 153
    iput-object v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰楪哲:Ljava/lang/String;

    .line 154
    .line 155
    const/4 v2, 0x0

    .line 156
    iput-boolean v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏哲世:Z

    .line 157
    .line 158
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 159
    .line 160
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪苏哲:I

    .line 161
    .line 162
    add-int/lit8 v6, v3, 0x9

    .line 163
    .line 164
    move-wide/from16 v16, v4

    .line 165
    .line 166
    const/16 v18, 0x38

    .line 167
    .line 168
    if-ge v6, v7, :cond_12

    .line 169
    .line 170
    const/16 v19, 0x30

    .line 171
    .line 172
    aget-char v11, v9, v3

    .line 173
    .line 174
    const/16 v20, 0x28

    .line 175
    .line 176
    add-int/lit8 v12, v3, 0x1

    .line 177
    .line 178
    const/16 v21, 0x18

    .line 179
    .line 180
    aget-char v13, v9, v12

    .line 181
    .line 182
    const/16 v22, 0x10

    .line 183
    .line 184
    add-int/lit8 v15, v3, 0x2

    .line 185
    .line 186
    const/16 v23, 0x20

    .line 187
    .line 188
    aget-char v14, v9, v15

    .line 189
    .line 190
    add-int/lit8 v8, v3, 0x3

    .line 191
    .line 192
    const/16 v24, 0x8

    .line 193
    .line 194
    aget-char v2, v9, v8

    .line 195
    .line 196
    add-int/lit8 v4, v3, 0x4

    .line 197
    .line 198
    aget-char v5, v9, v4

    .line 199
    .line 200
    add-int/lit8 v10, v3, 0x5

    .line 201
    .line 202
    move/from16 v26, v3

    .line 203
    .line 204
    aget-char v3, v9, v10

    .line 205
    .line 206
    move/from16 v27, v6

    .line 207
    .line 208
    add-int/lit8 v6, v26, 0x6

    .line 209
    .line 210
    move-object/from16 v28, v9

    .line 211
    .line 212
    aget-char v9, v28, v6

    .line 213
    .line 214
    move/from16 v29, v7

    .line 215
    .line 216
    add-int/lit8 v7, v26, 0x7

    .line 217
    .line 218
    move/from16 v30, v7

    .line 219
    .line 220
    aget-char v7, v28, v30

    .line 221
    .line 222
    move/from16 v31, v7

    .line 223
    .line 224
    add-int/lit8 v7, v26, 0x8

    .line 225
    .line 226
    move/from16 v32, v7

    .line 227
    .line 228
    aget-char v7, v28, v32

    .line 229
    .line 230
    if-ne v11, v1, :cond_9

    .line 231
    .line 232
    :cond_8
    :goto_3
    move-wide/from16 v2, v16

    .line 233
    .line 234
    goto/16 :goto_4

    .line 235
    .line 236
    :cond_9
    if-ne v13, v1, :cond_a

    .line 237
    .line 238
    if-eqz v11, :cond_a

    .line 239
    .line 240
    move/from16 v33, v7

    .line 241
    .line 242
    const/16 v7, 0x5c

    .line 243
    .line 244
    if-eq v11, v7, :cond_b

    .line 245
    .line 246
    const/16 v7, 0xff

    .line 247
    .line 248
    if-gt v11, v7, :cond_b

    .line 249
    .line 250
    int-to-byte v2, v11

    .line 251
    int-to-long v2, v2

    .line 252
    const/4 v4, 0x1

    .line 253
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰苏楪哲:I

    .line 254
    .line 255
    iput v12, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪哲苏:I

    .line 256
    .line 257
    move/from16 v26, v15

    .line 258
    .line 259
    goto/16 :goto_4

    .line 260
    .line 261
    :cond_a
    move/from16 v33, v7

    .line 262
    .line 263
    :cond_b
    if-ne v14, v1, :cond_c

    .line 264
    .line 265
    if-eqz v11, :cond_c

    .line 266
    .line 267
    const/16 v7, 0x5c

    .line 268
    .line 269
    if-eq v11, v7, :cond_c

    .line 270
    .line 271
    if-eq v13, v7, :cond_c

    .line 272
    .line 273
    const/16 v7, 0xff

    .line 274
    .line 275
    if-gt v11, v7, :cond_c

    .line 276
    .line 277
    if-gt v13, v7, :cond_c

    .line 278
    .line 279
    int-to-byte v2, v13

    .line 280
    shl-int/lit8 v2, v2, 0x8

    .line 281
    .line 282
    add-int/2addr v2, v11

    .line 283
    int-to-long v2, v2

    .line 284
    const/4 v4, 0x2

    .line 285
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰苏楪哲:I

    .line 286
    .line 287
    iput v15, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪哲苏:I

    .line 288
    .line 289
    move/from16 v26, v8

    .line 290
    .line 291
    goto/16 :goto_4

    .line 292
    .line 293
    :cond_c
    if-ne v2, v1, :cond_d

    .line 294
    .line 295
    if-eqz v11, :cond_d

    .line 296
    .line 297
    const/16 v7, 0x5c

    .line 298
    .line 299
    if-eq v11, v7, :cond_d

    .line 300
    .line 301
    if-eq v13, v7, :cond_d

    .line 302
    .line 303
    if-eq v14, v7, :cond_d

    .line 304
    .line 305
    const/16 v7, 0xff

    .line 306
    .line 307
    if-gt v11, v7, :cond_d

    .line 308
    .line 309
    if-gt v13, v7, :cond_d

    .line 310
    .line 311
    if-gt v14, v7, :cond_d

    .line 312
    .line 313
    int-to-byte v2, v14

    .line 314
    shl-int/lit8 v2, v2, 0x10

    .line 315
    .line 316
    shl-int/lit8 v3, v13, 0x8

    .line 317
    .line 318
    add-int/2addr v2, v3

    .line 319
    add-int/2addr v2, v11

    .line 320
    int-to-long v2, v2

    .line 321
    const/4 v5, 0x3

    .line 322
    iput v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰苏楪哲:I

    .line 323
    .line 324
    iput v8, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪哲苏:I

    .line 325
    .line 326
    move/from16 v26, v4

    .line 327
    .line 328
    goto/16 :goto_4

    .line 329
    .line 330
    :cond_d
    if-ne v5, v1, :cond_e

    .line 331
    .line 332
    if-eqz v11, :cond_e

    .line 333
    .line 334
    const/16 v7, 0x5c

    .line 335
    .line 336
    if-eq v11, v7, :cond_e

    .line 337
    .line 338
    if-eq v13, v7, :cond_e

    .line 339
    .line 340
    if-eq v14, v7, :cond_e

    .line 341
    .line 342
    if-eq v2, v7, :cond_e

    .line 343
    .line 344
    const/16 v7, 0xff

    .line 345
    .line 346
    if-gt v11, v7, :cond_e

    .line 347
    .line 348
    if-gt v13, v7, :cond_e

    .line 349
    .line 350
    if-gt v14, v7, :cond_e

    .line 351
    .line 352
    if-gt v2, v7, :cond_e

    .line 353
    .line 354
    int-to-byte v2, v2

    .line 355
    shl-int/lit8 v2, v2, 0x18

    .line 356
    .line 357
    shl-int/lit8 v3, v14, 0x10

    .line 358
    .line 359
    add-int/2addr v2, v3

    .line 360
    shl-int/lit8 v3, v13, 0x8

    .line 361
    .line 362
    add-int/2addr v2, v3

    .line 363
    add-int/2addr v2, v11

    .line 364
    int-to-long v2, v2

    .line 365
    const/4 v5, 0x4

    .line 366
    iput v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰苏楪哲:I

    .line 367
    .line 368
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪哲苏:I

    .line 369
    .line 370
    move/from16 v26, v10

    .line 371
    .line 372
    goto/16 :goto_4

    .line 373
    .line 374
    :cond_e
    if-ne v3, v1, :cond_f

    .line 375
    .line 376
    if-eqz v11, :cond_f

    .line 377
    .line 378
    const/16 v7, 0x5c

    .line 379
    .line 380
    if-eq v11, v7, :cond_f

    .line 381
    .line 382
    if-eq v13, v7, :cond_f

    .line 383
    .line 384
    if-eq v14, v7, :cond_f

    .line 385
    .line 386
    if-eq v2, v7, :cond_f

    .line 387
    .line 388
    if-eq v5, v7, :cond_f

    .line 389
    .line 390
    const/16 v7, 0xff

    .line 391
    .line 392
    if-gt v11, v7, :cond_f

    .line 393
    .line 394
    if-gt v13, v7, :cond_f

    .line 395
    .line 396
    if-gt v14, v7, :cond_f

    .line 397
    .line 398
    if-gt v2, v7, :cond_f

    .line 399
    .line 400
    if-gt v5, v7, :cond_f

    .line 401
    .line 402
    int-to-byte v3, v5

    .line 403
    int-to-long v3, v3

    .line 404
    shl-long v3, v3, v23

    .line 405
    .line 406
    int-to-long v7, v2

    .line 407
    shl-long v7, v7, v21

    .line 408
    .line 409
    add-long/2addr v3, v7

    .line 410
    int-to-long v7, v14

    .line 411
    shl-long v7, v7, v22

    .line 412
    .line 413
    add-long/2addr v3, v7

    .line 414
    int-to-long v7, v13

    .line 415
    shl-long v7, v7, v24

    .line 416
    .line 417
    add-long/2addr v3, v7

    .line 418
    int-to-long v7, v11

    .line 419
    add-long v2, v3, v7

    .line 420
    .line 421
    const/4 v4, 0x5

    .line 422
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰苏楪哲:I

    .line 423
    .line 424
    iput v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪哲苏:I

    .line 425
    .line 426
    move/from16 v26, v6

    .line 427
    .line 428
    goto/16 :goto_4

    .line 429
    .line 430
    :cond_f
    if-ne v9, v1, :cond_10

    .line 431
    .line 432
    if-eqz v11, :cond_10

    .line 433
    .line 434
    const/16 v7, 0x5c

    .line 435
    .line 436
    if-eq v11, v7, :cond_10

    .line 437
    .line 438
    if-eq v13, v7, :cond_10

    .line 439
    .line 440
    if-eq v14, v7, :cond_10

    .line 441
    .line 442
    if-eq v2, v7, :cond_10

    .line 443
    .line 444
    if-eq v5, v7, :cond_10

    .line 445
    .line 446
    if-eq v3, v7, :cond_10

    .line 447
    .line 448
    const/16 v7, 0xff

    .line 449
    .line 450
    if-gt v11, v7, :cond_10

    .line 451
    .line 452
    if-gt v13, v7, :cond_10

    .line 453
    .line 454
    if-gt v14, v7, :cond_10

    .line 455
    .line 456
    if-gt v2, v7, :cond_10

    .line 457
    .line 458
    if-gt v5, v7, :cond_10

    .line 459
    .line 460
    if-gt v3, v7, :cond_10

    .line 461
    .line 462
    int-to-byte v3, v3

    .line 463
    int-to-long v3, v3

    .line 464
    shl-long v3, v3, v20

    .line 465
    .line 466
    int-to-long v7, v5

    .line 467
    shl-long v7, v7, v23

    .line 468
    .line 469
    add-long/2addr v3, v7

    .line 470
    int-to-long v7, v2

    .line 471
    shl-long v7, v7, v21

    .line 472
    .line 473
    add-long/2addr v3, v7

    .line 474
    int-to-long v7, v14

    .line 475
    shl-long v7, v7, v22

    .line 476
    .line 477
    add-long/2addr v3, v7

    .line 478
    int-to-long v7, v13

    .line 479
    shl-long v7, v7, v24

    .line 480
    .line 481
    add-long/2addr v3, v7

    .line 482
    int-to-long v7, v11

    .line 483
    add-long v2, v3, v7

    .line 484
    .line 485
    const/4 v4, 0x6

    .line 486
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰苏楪哲:I

    .line 487
    .line 488
    iput v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪哲苏:I

    .line 489
    .line 490
    move/from16 v26, v30

    .line 491
    .line 492
    goto/16 :goto_4

    .line 493
    .line 494
    :cond_10
    move/from16 v4, v31

    .line 495
    .line 496
    if-ne v4, v1, :cond_11

    .line 497
    .line 498
    if-eqz v11, :cond_11

    .line 499
    .line 500
    const/16 v7, 0x5c

    .line 501
    .line 502
    if-eq v11, v7, :cond_11

    .line 503
    .line 504
    if-eq v13, v7, :cond_11

    .line 505
    .line 506
    if-eq v14, v7, :cond_11

    .line 507
    .line 508
    if-eq v2, v7, :cond_11

    .line 509
    .line 510
    if-eq v5, v7, :cond_11

    .line 511
    .line 512
    if-eq v3, v7, :cond_11

    .line 513
    .line 514
    if-eq v9, v7, :cond_11

    .line 515
    .line 516
    const/16 v7, 0xff

    .line 517
    .line 518
    if-gt v11, v7, :cond_11

    .line 519
    .line 520
    if-gt v13, v7, :cond_11

    .line 521
    .line 522
    if-gt v14, v7, :cond_11

    .line 523
    .line 524
    if-gt v2, v7, :cond_11

    .line 525
    .line 526
    if-gt v5, v7, :cond_11

    .line 527
    .line 528
    if-gt v3, v7, :cond_11

    .line 529
    .line 530
    if-gt v9, v7, :cond_11

    .line 531
    .line 532
    int-to-byte v4, v9

    .line 533
    int-to-long v6, v4

    .line 534
    shl-long v6, v6, v19

    .line 535
    .line 536
    int-to-long v3, v3

    .line 537
    shl-long v3, v3, v20

    .line 538
    .line 539
    add-long/2addr v6, v3

    .line 540
    int-to-long v3, v5

    .line 541
    shl-long v3, v3, v23

    .line 542
    .line 543
    add-long/2addr v6, v3

    .line 544
    int-to-long v2, v2

    .line 545
    shl-long v2, v2, v21

    .line 546
    .line 547
    add-long/2addr v6, v2

    .line 548
    int-to-long v2, v14

    .line 549
    shl-long v2, v2, v22

    .line 550
    .line 551
    add-long/2addr v6, v2

    .line 552
    int-to-long v2, v13

    .line 553
    shl-long v2, v2, v24

    .line 554
    .line 555
    add-long/2addr v6, v2

    .line 556
    int-to-long v2, v11

    .line 557
    add-long/2addr v2, v6

    .line 558
    const/4 v4, 0x7

    .line 559
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰苏楪哲:I

    .line 560
    .line 561
    move/from16 v4, v30

    .line 562
    .line 563
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪哲苏:I

    .line 564
    .line 565
    move/from16 v26, v32

    .line 566
    .line 567
    goto/16 :goto_4

    .line 568
    .line 569
    :cond_11
    move/from16 v6, v33

    .line 570
    .line 571
    if-ne v6, v1, :cond_8

    .line 572
    .line 573
    if-eqz v11, :cond_8

    .line 574
    .line 575
    const/16 v7, 0x5c

    .line 576
    .line 577
    if-eq v11, v7, :cond_8

    .line 578
    .line 579
    if-eq v13, v7, :cond_8

    .line 580
    .line 581
    if-eq v14, v7, :cond_8

    .line 582
    .line 583
    if-eq v2, v7, :cond_8

    .line 584
    .line 585
    if-eq v5, v7, :cond_8

    .line 586
    .line 587
    if-eq v3, v7, :cond_8

    .line 588
    .line 589
    if-eq v9, v7, :cond_8

    .line 590
    .line 591
    if-eq v4, v7, :cond_8

    .line 592
    .line 593
    const/16 v7, 0xff

    .line 594
    .line 595
    if-gt v11, v7, :cond_8

    .line 596
    .line 597
    if-gt v13, v7, :cond_8

    .line 598
    .line 599
    if-gt v14, v7, :cond_8

    .line 600
    .line 601
    if-gt v2, v7, :cond_8

    .line 602
    .line 603
    if-gt v5, v7, :cond_8

    .line 604
    .line 605
    if-gt v3, v7, :cond_8

    .line 606
    .line 607
    if-gt v9, v7, :cond_8

    .line 608
    .line 609
    if-gt v4, v7, :cond_8

    .line 610
    .line 611
    int-to-byte v4, v4

    .line 612
    int-to-long v6, v4

    .line 613
    shl-long v6, v6, v18

    .line 614
    .line 615
    int-to-long v8, v9

    .line 616
    shl-long v8, v8, v19

    .line 617
    .line 618
    add-long/2addr v6, v8

    .line 619
    int-to-long v3, v3

    .line 620
    shl-long v3, v3, v20

    .line 621
    .line 622
    add-long/2addr v6, v3

    .line 623
    int-to-long v3, v5

    .line 624
    shl-long v3, v3, v23

    .line 625
    .line 626
    add-long/2addr v6, v3

    .line 627
    int-to-long v2, v2

    .line 628
    shl-long v2, v2, v21

    .line 629
    .line 630
    add-long/2addr v6, v2

    .line 631
    int-to-long v2, v14

    .line 632
    shl-long v2, v2, v22

    .line 633
    .line 634
    add-long/2addr v6, v2

    .line 635
    int-to-long v2, v13

    .line 636
    shl-long v2, v2, v24

    .line 637
    .line 638
    add-long/2addr v6, v2

    .line 639
    int-to-long v2, v11

    .line 640
    add-long/2addr v2, v6

    .line 641
    move/from16 v4, v24

    .line 642
    .line 643
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰苏楪哲:I

    .line 644
    .line 645
    move/from16 v4, v32

    .line 646
    .line 647
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪哲苏:I

    .line 648
    .line 649
    move/from16 v26, v27

    .line 650
    .line 651
    goto :goto_4

    .line 652
    :cond_12
    move/from16 v26, v3

    .line 653
    .line 654
    move/from16 v29, v7

    .line 655
    .line 656
    move-object/from16 v28, v9

    .line 657
    .line 658
    const/16 v19, 0x30

    .line 659
    .line 660
    const/16 v20, 0x28

    .line 661
    .line 662
    const/16 v21, 0x18

    .line 663
    .line 664
    const/16 v22, 0x10

    .line 665
    .line 666
    const/16 v23, 0x20

    .line 667
    .line 668
    goto/16 :goto_3

    .line 669
    .line 670
    :goto_4
    cmp-long v4, v2, v16

    .line 671
    .line 672
    const/16 v5, 0x78

    .line 673
    .line 674
    if-nez v4, :cond_1b

    .line 675
    .line 676
    move/from16 v4, v26

    .line 677
    .line 678
    move/from16 v7, v29

    .line 679
    .line 680
    const/4 v6, 0x0

    .line 681
    :goto_5
    if-ge v4, v7, :cond_1a

    .line 682
    .line 683
    aget-char v8, v28, v4

    .line 684
    .line 685
    if-ne v8, v1, :cond_14

    .line 686
    .line 687
    if-nez v6, :cond_13

    .line 688
    .line 689
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪苏哲:I

    .line 690
    .line 691
    move/from16 v26, v4

    .line 692
    .line 693
    :goto_6
    move-object/from16 v9, v28

    .line 694
    .line 695
    goto/16 :goto_f

    .line 696
    .line 697
    :cond_13
    iput v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰苏楪哲:I

    .line 698
    .line 699
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪哲苏:I

    .line 700
    .line 701
    add-int/lit8 v26, v4, 0x1

    .line 702
    .line 703
    goto :goto_6

    .line 704
    :cond_14
    const/16 v9, 0x5c

    .line 705
    .line 706
    if-ne v8, v9, :cond_15

    .line 707
    .line 708
    const/4 v9, 0x1

    .line 709
    iput-boolean v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏哲世:Z

    .line 710
    .line 711
    add-int/lit8 v8, v4, 0x1

    .line 712
    .line 713
    aget-char v9, v28, v8

    .line 714
    .line 715
    const/16 v10, 0x75

    .line 716
    .line 717
    if-eq v9, v10, :cond_17

    .line 718
    .line 719
    if-eq v9, v5, :cond_16

    .line 720
    .line 721
    invoke-virtual {v0, v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世哲兰(I)C

    .line 722
    .line 723
    .line 724
    move-result v4

    .line 725
    move v9, v8

    .line 726
    move v8, v4

    .line 727
    move v4, v9

    .line 728
    :cond_15
    :goto_7
    move-object/from16 v9, v28

    .line 729
    .line 730
    :goto_8
    const/16 v10, 0xff

    .line 731
    .line 732
    goto :goto_9

    .line 733
    :cond_16
    add-int/lit8 v8, v4, 0x2

    .line 734
    .line 735
    aget-char v8, v28, v8

    .line 736
    .line 737
    add-int/lit8 v4, v4, 0x3

    .line 738
    .line 739
    aget-char v9, v28, v4

    .line 740
    .line 741
    invoke-static {v8, v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世兰哲(II)C

    .line 742
    .line 743
    .line 744
    move-result v8

    .line 745
    goto :goto_7

    .line 746
    :cond_17
    add-int/lit8 v8, v4, 0x2

    .line 747
    .line 748
    invoke-static {v8, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 749
    .line 750
    .line 751
    move-object/from16 v9, v28

    .line 752
    .line 753
    invoke-static {v8, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪兰苏哲(I[C)I

    .line 754
    .line 755
    .line 756
    move-result v8

    .line 757
    int-to-char v8, v8

    .line 758
    add-int/lit8 v4, v4, 0x5

    .line 759
    .line 760
    goto :goto_8

    .line 761
    :goto_9
    if-gt v8, v10, :cond_19

    .line 762
    .line 763
    const/16 v11, 0x8

    .line 764
    .line 765
    if-ge v6, v11, :cond_19

    .line 766
    .line 767
    if-nez v6, :cond_18

    .line 768
    .line 769
    if-nez v8, :cond_18

    .line 770
    .line 771
    goto :goto_e

    .line 772
    :cond_18
    packed-switch v6, :pswitch_data_0

    .line 773
    .line 774
    .line 775
    :goto_a
    const/16 v24, 0x8

    .line 776
    .line 777
    :goto_b
    const/16 v25, 0x1

    .line 778
    .line 779
    goto :goto_d

    .line 780
    :pswitch_0
    int-to-byte v8, v8

    .line 781
    int-to-long v11, v8

    .line 782
    shl-long v11, v11, v18

    .line 783
    .line 784
    const-wide v13, 0xffffffffffffffL

    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    :goto_c
    and-long/2addr v2, v13

    .line 790
    add-long/2addr v11, v2

    .line 791
    move-wide v2, v11

    .line 792
    goto :goto_a

    .line 793
    :pswitch_1
    int-to-byte v8, v8

    .line 794
    int-to-long v11, v8

    .line 795
    shl-long v11, v11, v19

    .line 796
    .line 797
    const-wide v13, 0xffffffffffffL

    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    goto :goto_c

    .line 803
    :pswitch_2
    int-to-byte v8, v8

    .line 804
    int-to-long v11, v8

    .line 805
    shl-long v11, v11, v20

    .line 806
    .line 807
    const-wide v13, 0xffffffffffL

    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    goto :goto_c

    .line 813
    :pswitch_3
    int-to-byte v8, v8

    .line 814
    int-to-long v11, v8

    .line 815
    shl-long v11, v11, v23

    .line 816
    .line 817
    const-wide v13, 0xffffffffL

    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    goto :goto_c

    .line 823
    :pswitch_4
    int-to-byte v8, v8

    .line 824
    shl-int/lit8 v8, v8, 0x18

    .line 825
    .line 826
    int-to-long v11, v8

    .line 827
    const-wide/32 v13, 0xffffff

    .line 828
    .line 829
    .line 830
    goto :goto_c

    .line 831
    :pswitch_5
    int-to-byte v8, v8

    .line 832
    shl-int/lit8 v8, v8, 0x10

    .line 833
    .line 834
    int-to-long v11, v8

    .line 835
    const-wide/32 v13, 0xffff

    .line 836
    .line 837
    .line 838
    goto :goto_c

    .line 839
    :pswitch_6
    int-to-byte v8, v8

    .line 840
    const/16 v24, 0x8

    .line 841
    .line 842
    shl-int/lit8 v8, v8, 0x8

    .line 843
    .line 844
    int-to-long v11, v8

    .line 845
    const-wide/16 v13, 0xff

    .line 846
    .line 847
    and-long/2addr v2, v13

    .line 848
    add-long/2addr v11, v2

    .line 849
    move-wide v2, v11

    .line 850
    goto :goto_b

    .line 851
    :pswitch_7
    const/16 v24, 0x8

    .line 852
    .line 853
    int-to-byte v2, v8

    .line 854
    int-to-long v2, v2

    .line 855
    goto :goto_b

    .line 856
    :goto_d
    add-int/lit8 v4, v4, 0x1

    .line 857
    .line 858
    add-int/lit8 v6, v6, 0x1

    .line 859
    .line 860
    move-object/from16 v28, v9

    .line 861
    .line 862
    goto/16 :goto_5

    .line 863
    .line 864
    :cond_19
    :goto_e
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪苏哲:I

    .line 865
    .line 866
    move/from16 v26, v2

    .line 867
    .line 868
    move-wide/from16 v2, v16

    .line 869
    .line 870
    goto :goto_f

    .line 871
    :cond_1a
    move-object/from16 v9, v28

    .line 872
    .line 873
    move/from16 v26, v4

    .line 874
    .line 875
    goto :goto_f

    .line 876
    :cond_1b
    move-object/from16 v9, v28

    .line 877
    .line 878
    move/from16 v7, v29

    .line 879
    .line 880
    :goto_f
    cmp-long v4, v2, v16

    .line 881
    .line 882
    if-eqz v4, :cond_1c

    .line 883
    .line 884
    :goto_10
    move/from16 v1, v26

    .line 885
    .line 886
    goto :goto_15

    .line 887
    :cond_1c
    const-wide v2, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    move/from16 v6, v26

    .line 893
    .line 894
    const/4 v4, 0x0

    .line 895
    :goto_11
    aget-char v8, v9, v6

    .line 896
    .line 897
    const-wide v10, 0x100000001b3L

    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    const/16 v12, 0x5c

    .line 903
    .line 904
    if-ne v8, v12, :cond_1f

    .line 905
    .line 906
    const/4 v13, 0x1

    .line 907
    iput-boolean v13, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏哲世:Z

    .line 908
    .line 909
    add-int/lit8 v8, v6, 0x1

    .line 910
    .line 911
    aget-char v13, v9, v8

    .line 912
    .line 913
    const/16 v14, 0x75

    .line 914
    .line 915
    if-eq v13, v14, :cond_1e

    .line 916
    .line 917
    if-eq v13, v5, :cond_1d

    .line 918
    .line 919
    invoke-virtual {v0, v13}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世哲兰(I)C

    .line 920
    .line 921
    .line 922
    move-result v6

    .line 923
    :goto_12
    const/16 v25, 0x1

    .line 924
    .line 925
    goto :goto_14

    .line 926
    :cond_1d
    add-int/lit8 v8, v6, 0x2

    .line 927
    .line 928
    aget-char v8, v9, v8

    .line 929
    .line 930
    add-int/lit8 v6, v6, 0x3

    .line 931
    .line 932
    aget-char v13, v9, v6

    .line 933
    .line 934
    invoke-static {v8, v13}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世兰哲(II)C

    .line 935
    .line 936
    .line 937
    move-result v8

    .line 938
    :goto_13
    move/from16 v25, v8

    .line 939
    .line 940
    move v8, v6

    .line 941
    move/from16 v6, v25

    .line 942
    .line 943
    goto :goto_12

    .line 944
    :cond_1e
    add-int/lit8 v8, v6, 0x2

    .line 945
    .line 946
    invoke-static {v8, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 947
    .line 948
    .line 949
    invoke-static {v8, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪兰苏哲(I[C)I

    .line 950
    .line 951
    .line 952
    move-result v8

    .line 953
    int-to-char v8, v8

    .line 954
    add-int/lit8 v6, v6, 0x5

    .line 955
    .line 956
    goto :goto_13

    .line 957
    :goto_14
    add-int/lit8 v8, v8, 0x1

    .line 958
    .line 959
    int-to-long v5, v6

    .line 960
    xor-long/2addr v2, v5

    .line 961
    mul-long/2addr v2, v10

    .line 962
    move v6, v8

    .line 963
    move/from16 v15, v23

    .line 964
    .line 965
    goto/16 :goto_1a

    .line 966
    .line 967
    :cond_1f
    const/16 v14, 0x75

    .line 968
    .line 969
    const/16 v25, 0x1

    .line 970
    .line 971
    if-ne v8, v1, :cond_27

    .line 972
    .line 973
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰苏楪哲:I

    .line 974
    .line 975
    iput v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪哲苏:I

    .line 976
    .line 977
    add-int/lit8 v26, v6, 0x1

    .line 978
    .line 979
    goto :goto_10

    .line 980
    :goto_15
    const/16 v4, 0x1a

    .line 981
    .line 982
    if-ne v1, v7, :cond_20

    .line 983
    .line 984
    move v5, v1

    .line 985
    move v1, v4

    .line 986
    goto :goto_16

    .line 987
    :cond_20
    add-int/lit8 v5, v1, 0x1

    .line 988
    .line 989
    aget-char v1, v9, v1

    .line 990
    .line 991
    :goto_16
    const-wide v10, 0x100003700L

    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    const-wide/16 v12, 0x1

    .line 997
    .line 998
    move/from16 v6, v23

    .line 999
    .line 1000
    if-gt v1, v6, :cond_22

    .line 1001
    .line 1002
    shl-long v14, v12, v1

    .line 1003
    .line 1004
    and-long/2addr v14, v10

    .line 1005
    cmp-long v6, v14, v16

    .line 1006
    .line 1007
    if-eqz v6, :cond_22

    .line 1008
    .line 1009
    if-ne v5, v7, :cond_21

    .line 1010
    .line 1011
    move v1, v4

    .line 1012
    goto :goto_17

    .line 1013
    :cond_21
    add-int/lit8 v1, v5, 0x1

    .line 1014
    .line 1015
    aget-char v5, v9, v5

    .line 1016
    .line 1017
    move/from16 v34, v5

    .line 1018
    .line 1019
    move v5, v1

    .line 1020
    move/from16 v1, v34

    .line 1021
    .line 1022
    :goto_17
    const/16 v23, 0x20

    .line 1023
    .line 1024
    goto :goto_16

    .line 1025
    :cond_22
    const/16 v6, 0x3a

    .line 1026
    .line 1027
    if-ne v1, v6, :cond_26

    .line 1028
    .line 1029
    if-ne v5, v7, :cond_23

    .line 1030
    .line 1031
    move v1, v5

    .line 1032
    move v5, v4

    .line 1033
    goto :goto_18

    .line 1034
    :cond_23
    add-int/lit8 v1, v5, 0x1

    .line 1035
    .line 1036
    aget-char v5, v9, v5

    .line 1037
    .line 1038
    :goto_18
    const/16 v15, 0x20

    .line 1039
    .line 1040
    :goto_19
    if-gt v5, v15, :cond_25

    .line 1041
    .line 1042
    shl-long v18, v12, v5

    .line 1043
    .line 1044
    and-long v18, v18, v10

    .line 1045
    .line 1046
    cmp-long v6, v18, v16

    .line 1047
    .line 1048
    if-eqz v6, :cond_25

    .line 1049
    .line 1050
    if-ne v1, v7, :cond_24

    .line 1051
    .line 1052
    move v5, v4

    .line 1053
    goto :goto_19

    .line 1054
    :cond_24
    add-int/lit8 v5, v1, 0x1

    .line 1055
    .line 1056
    aget-char v1, v9, v1

    .line 1057
    .line 1058
    move/from16 v34, v5

    .line 1059
    .line 1060
    move v5, v1

    .line 1061
    move/from16 v1, v34

    .line 1062
    .line 1063
    goto :goto_19

    .line 1064
    :cond_25
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1065
    .line 1066
    iput-char v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 1067
    .line 1068
    return-wide v2

    .line 1069
    :cond_26
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1070
    .line 1071
    const-string v3, "expect \':\', but "

    .line 1072
    .line 1073
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1074
    .line 1075
    .line 1076
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1077
    .line 1078
    .line 1079
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v1

    .line 1083
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v0

    .line 1087
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 1088
    .line 1089
    .line 1090
    return-wide v16

    .line 1091
    :cond_27
    move/from16 v15, v23

    .line 1092
    .line 1093
    add-int/lit8 v6, v6, 0x1

    .line 1094
    .line 1095
    move-wide/from16 v18, v10

    .line 1096
    .line 1097
    int-to-long v10, v8

    .line 1098
    xor-long/2addr v2, v10

    .line 1099
    mul-long v2, v2, v18

    .line 1100
    .line 1101
    :goto_1a
    add-int/lit8 v4, v4, 0x1

    .line 1102
    .line 1103
    move/from16 v23, v15

    .line 1104
    .line 1105
    const/16 v5, 0x78

    .line 1106
    .line 1107
    goto/16 :goto_11

    .line 1108
    .line 1109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子哲世兰苏楪()Z
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x6e

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 8
    .line 9
    add-int/lit8 v1, v0, 0x2

    .line 10
    .line 11
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 12
    .line 13
    if-ge v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 16
    .line 17
    aget-char v0, v1, v0

    .line 18
    .line 19
    const/16 v1, 0x75

    .line 20
    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪世苏兰哲子()V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public final 飘花落叶言子哲世楪兰苏(CCCC)Z
    .locals 7

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    goto/16 :goto_3

    .line 6
    .line 7
    :cond_0
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 8
    .line 9
    add-int/lit8 v0, p1, 0x3

    .line 10
    .line 11
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 12
    .line 13
    if-gt v0, v1, :cond_6

    .line 14
    .line 15
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 16
    .line 17
    aget-char v3, v2, p1

    .line 18
    .line 19
    if-ne v3, p2, :cond_6

    .line 20
    .line 21
    add-int/lit8 p2, p1, 0x1

    .line 22
    .line 23
    aget-char p2, v2, p2

    .line 24
    .line 25
    if-ne p2, p3, :cond_6

    .line 26
    .line 27
    add-int/lit8 p2, p1, 0x2

    .line 28
    .line 29
    aget-char p2, v2, p2

    .line 30
    .line 31
    if-eq p2, p4, :cond_1

    .line 32
    .line 33
    goto :goto_3

    .line 34
    :cond_1
    const/16 p2, 0x1a

    .line 35
    .line 36
    if-ne v0, v1, :cond_2

    .line 37
    .line 38
    :goto_0
    move p3, p2

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    add-int/lit8 p1, p1, 0x4

    .line 41
    .line 42
    aget-char p3, v2, v0

    .line 43
    .line 44
    :goto_1
    move v0, p1

    .line 45
    :goto_2
    const/16 p1, 0x20

    .line 46
    .line 47
    if-gt p3, p1, :cond_4

    .line 48
    .line 49
    const-wide/16 v3, 0x1

    .line 50
    .line 51
    shl-long/2addr v3, p3

    .line 52
    const-wide v5, 0x100003700L

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    and-long/2addr v3, v5

    .line 58
    const-wide/16 v5, 0x0

    .line 59
    .line 60
    cmp-long p1, v3, v5

    .line 61
    .line 62
    if-eqz p1, :cond_4

    .line 63
    .line 64
    if-ne v0, v1, :cond_3

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    add-int/lit8 p1, v0, 0x1

    .line 68
    .line 69
    aget-char p3, v2, v0

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_4
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 73
    .line 74
    add-int/lit8 p1, p1, 0x4

    .line 75
    .line 76
    if-ne v0, p1, :cond_5

    .line 77
    .line 78
    if-eq p3, p2, :cond_5

    .line 79
    .line 80
    const/16 p1, 0x28

    .line 81
    .line 82
    if-eq p3, p1, :cond_5

    .line 83
    .line 84
    const/16 p1, 0x5b

    .line 85
    .line 86
    if-eq p3, p1, :cond_5

    .line 87
    .line 88
    const/16 p1, 0x5d

    .line 89
    .line 90
    if-eq p3, p1, :cond_5

    .line 91
    .line 92
    const/16 p1, 0x29

    .line 93
    .line 94
    if-eq p3, p1, :cond_5

    .line 95
    .line 96
    const/16 p1, 0x3a

    .line 97
    .line 98
    if-eq p3, p1, :cond_5

    .line 99
    .line 100
    const/16 p1, 0x2c

    .line 101
    .line 102
    if-eq p3, p1, :cond_5

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_5
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 106
    .line 107
    iput-char p3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 108
    .line 109
    const/4 p0, 0x1

    .line 110
    return p0

    .line 111
    :cond_6
    :goto_3
    const/4 p0, 0x0

    .line 112
    return p0
.end method

.method public final 飘花落叶言子哲世楪苏兰()Z
    .locals 10

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x6c

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 10
    .line 11
    add-int/lit8 v1, v0, 0x2

    .line 12
    .line 13
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 14
    .line 15
    if-gt v1, v2, :cond_6

    .line 16
    .line 17
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 18
    .line 19
    aget-char v4, v3, v0

    .line 20
    .line 21
    const/16 v5, 0x61

    .line 22
    .line 23
    if-ne v4, v5, :cond_6

    .line 24
    .line 25
    add-int/lit8 v4, v0, 0x1

    .line 26
    .line 27
    aget-char v4, v3, v4

    .line 28
    .line 29
    const/16 v5, 0x78

    .line 30
    .line 31
    if-eq v4, v5, :cond_1

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_1
    const/16 v4, 0x1a

    .line 35
    .line 36
    if-ne v1, v2, :cond_2

    .line 37
    .line 38
    move v0, v1

    .line 39
    :goto_0
    move v1, v4

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    add-int/lit8 v0, v0, 0x3

    .line 42
    .line 43
    aget-char v1, v3, v1

    .line 44
    .line 45
    :goto_1
    const/16 v5, 0x20

    .line 46
    .line 47
    if-gt v1, v5, :cond_4

    .line 48
    .line 49
    const-wide/16 v5, 0x1

    .line 50
    .line 51
    shl-long/2addr v5, v1

    .line 52
    const-wide v7, 0x100003700L

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    and-long/2addr v5, v7

    .line 58
    const-wide/16 v7, 0x0

    .line 59
    .line 60
    cmp-long v5, v5, v7

    .line 61
    .line 62
    if-eqz v5, :cond_4

    .line 63
    .line 64
    if-ne v0, v2, :cond_3

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    add-int/lit8 v1, v0, 0x1

    .line 68
    .line 69
    aget-char v0, v3, v0

    .line 70
    .line 71
    move v9, v1

    .line 72
    move v1, v0

    .line 73
    move v0, v9

    .line 74
    goto :goto_1

    .line 75
    :cond_4
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 76
    .line 77
    add-int/lit8 v2, v2, 0x3

    .line 78
    .line 79
    if-ne v0, v2, :cond_5

    .line 80
    .line 81
    if-eq v1, v4, :cond_5

    .line 82
    .line 83
    const/16 v2, 0x28

    .line 84
    .line 85
    if-eq v1, v2, :cond_5

    .line 86
    .line 87
    const/16 v2, 0x5b

    .line 88
    .line 89
    if-eq v1, v2, :cond_5

    .line 90
    .line 91
    const/16 v2, 0x5d

    .line 92
    .line 93
    if-eq v1, v2, :cond_5

    .line 94
    .line 95
    const/16 v2, 0x29

    .line 96
    .line 97
    if-eq v1, v2, :cond_5

    .line 98
    .line 99
    const/16 v2, 0x3a

    .line 100
    .line 101
    if-eq v1, v2, :cond_5

    .line 102
    .line 103
    const/16 v2, 0x2c

    .line 104
    .line 105
    if-eq v1, v2, :cond_5

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_5
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 109
    .line 110
    iput-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 111
    .line 112
    const/4 p0, 0x1

    .line 113
    return p0

    .line 114
    :cond_6
    :goto_2
    const/4 p0, 0x0

    .line 115
    return p0
.end method

.method public final 飘花落叶言子哲世苏兰楪()Z
    .locals 10

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 10
    .line 11
    add-int/lit8 v2, v0, 0x4

    .line 12
    .line 13
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 14
    .line 15
    if-gt v2, v3, :cond_6

    .line 16
    .line 17
    iget-object v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 18
    .line 19
    aget-char v5, v4, v0

    .line 20
    .line 21
    const/16 v6, 0x76

    .line 22
    .line 23
    if-ne v5, v6, :cond_6

    .line 24
    .line 25
    add-int/lit8 v5, v0, 0x1

    .line 26
    .line 27
    aget-char v5, v4, v5

    .line 28
    .line 29
    const/16 v6, 0x61

    .line 30
    .line 31
    if-ne v5, v6, :cond_6

    .line 32
    .line 33
    add-int/lit8 v5, v0, 0x2

    .line 34
    .line 35
    aget-char v5, v4, v5

    .line 36
    .line 37
    const/16 v6, 0x6c

    .line 38
    .line 39
    if-ne v5, v6, :cond_6

    .line 40
    .line 41
    add-int/lit8 v5, v0, 0x3

    .line 42
    .line 43
    aget-char v5, v4, v5

    .line 44
    .line 45
    if-eq v5, v1, :cond_1

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    const/16 v1, 0x1a

    .line 49
    .line 50
    if-ne v2, v3, :cond_2

    .line 51
    .line 52
    move v0, v2

    .line 53
    :goto_0
    move v2, v1

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    add-int/lit8 v0, v0, 0x5

    .line 56
    .line 57
    aget-char v2, v4, v2

    .line 58
    .line 59
    :goto_1
    const/16 v5, 0x20

    .line 60
    .line 61
    if-gt v2, v5, :cond_4

    .line 62
    .line 63
    const-wide/16 v5, 0x1

    .line 64
    .line 65
    shl-long/2addr v5, v2

    .line 66
    const-wide v7, 0x100003700L

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    and-long/2addr v5, v7

    .line 72
    const-wide/16 v7, 0x0

    .line 73
    .line 74
    cmp-long v5, v5, v7

    .line 75
    .line 76
    if-eqz v5, :cond_4

    .line 77
    .line 78
    if-ne v0, v3, :cond_3

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    add-int/lit8 v2, v0, 0x1

    .line 82
    .line 83
    aget-char v0, v4, v0

    .line 84
    .line 85
    move v9, v2

    .line 86
    move v2, v0

    .line 87
    move v0, v9

    .line 88
    goto :goto_1

    .line 89
    :cond_4
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 90
    .line 91
    add-int/lit8 v3, v3, 0x5

    .line 92
    .line 93
    if-ne v0, v3, :cond_5

    .line 94
    .line 95
    if-eq v2, v1, :cond_5

    .line 96
    .line 97
    const/16 v1, 0x28

    .line 98
    .line 99
    if-eq v2, v1, :cond_5

    .line 100
    .line 101
    const/16 v1, 0x5b

    .line 102
    .line 103
    if-eq v2, v1, :cond_5

    .line 104
    .line 105
    const/16 v1, 0x5d

    .line 106
    .line 107
    if-eq v2, v1, :cond_5

    .line 108
    .line 109
    const/16 v1, 0x29

    .line 110
    .line 111
    if-eq v2, v1, :cond_5

    .line 112
    .line 113
    const/16 v1, 0x3a

    .line 114
    .line 115
    if-eq v2, v1, :cond_5

    .line 116
    .line 117
    const/16 v1, 0x2c

    .line 118
    .line 119
    if-eq v2, v1, :cond_5

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_5
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 123
    .line 124
    iput-char v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 125
    .line 126
    const/4 p0, 0x1

    .line 127
    return p0

    .line 128
    :cond_6
    :goto_2
    const/4 p0, 0x0

    .line 129
    return p0
.end method

.method public final 飘花落叶言子哲世苏楪兰(CCCCCC)Z
    .locals 5

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    goto/16 :goto_3

    .line 6
    .line 7
    :cond_0
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 8
    .line 9
    add-int/lit8 v0, p1, 0x5

    .line 10
    .line 11
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 12
    .line 13
    if-gt v0, v1, :cond_6

    .line 14
    .line 15
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 16
    .line 17
    aget-char v3, v2, p1

    .line 18
    .line 19
    if-ne v3, p2, :cond_6

    .line 20
    .line 21
    add-int/lit8 p2, p1, 0x1

    .line 22
    .line 23
    aget-char p2, v2, p2

    .line 24
    .line 25
    if-ne p2, p3, :cond_6

    .line 26
    .line 27
    add-int/lit8 p2, p1, 0x2

    .line 28
    .line 29
    aget-char p2, v2, p2

    .line 30
    .line 31
    if-ne p2, p4, :cond_6

    .line 32
    .line 33
    add-int/lit8 p2, p1, 0x3

    .line 34
    .line 35
    aget-char p2, v2, p2

    .line 36
    .line 37
    if-ne p2, p5, :cond_6

    .line 38
    .line 39
    add-int/lit8 p2, p1, 0x4

    .line 40
    .line 41
    aget-char p2, v2, p2

    .line 42
    .line 43
    if-eq p2, p6, :cond_1

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_1
    const/16 p2, 0x1a

    .line 47
    .line 48
    if-ne v0, v1, :cond_2

    .line 49
    .line 50
    :goto_0
    move p3, p2

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    add-int/lit8 p1, p1, 0x6

    .line 53
    .line 54
    aget-char p3, v2, v0

    .line 55
    .line 56
    :goto_1
    move v0, p1

    .line 57
    :goto_2
    const/16 p1, 0x20

    .line 58
    .line 59
    if-gt p3, p1, :cond_4

    .line 60
    .line 61
    const-wide/16 p4, 0x1

    .line 62
    .line 63
    shl-long/2addr p4, p3

    .line 64
    const-wide v3, 0x100003700L

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    and-long/2addr p4, v3

    .line 70
    const-wide/16 v3, 0x0

    .line 71
    .line 72
    cmp-long p1, p4, v3

    .line 73
    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    if-ne v0, v1, :cond_3

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    add-int/lit8 p1, v0, 0x1

    .line 80
    .line 81
    aget-char p3, v2, v0

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 85
    .line 86
    add-int/lit8 p1, p1, 0x6

    .line 87
    .line 88
    if-ne v0, p1, :cond_5

    .line 89
    .line 90
    if-eq p3, p2, :cond_5

    .line 91
    .line 92
    const/16 p1, 0x28

    .line 93
    .line 94
    if-eq p3, p1, :cond_5

    .line 95
    .line 96
    const/16 p1, 0x5b

    .line 97
    .line 98
    if-eq p3, p1, :cond_5

    .line 99
    .line 100
    const/16 p1, 0x5d

    .line 101
    .line 102
    if-eq p3, p1, :cond_5

    .line 103
    .line 104
    const/16 p1, 0x29

    .line 105
    .line 106
    if-eq p3, p1, :cond_5

    .line 107
    .line 108
    const/16 p1, 0x3a

    .line 109
    .line 110
    if-eq p3, p1, :cond_5

    .line 111
    .line 112
    const/16 p1, 0x2c

    .line 113
    .line 114
    if-eq p3, p1, :cond_5

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_5
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 118
    .line 119
    iput-char p3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 120
    .line 121
    const/4 p0, 0x1

    .line 122
    return p0

    .line 123
    :cond_6
    :goto_3
    const/4 p0, 0x0

    .line 124
    return p0
.end method

.method public final 飘花落叶言子哲楪世兰苏()Z
    .locals 10

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x5b

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 10
    .line 11
    const/16 v1, 0x1a

    .line 12
    .line 13
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 14
    .line 15
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 16
    .line 17
    if-ne v0, v2, :cond_1

    .line 18
    .line 19
    move v4, v0

    .line 20
    :goto_0
    move v0, v1

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    add-int/lit8 v4, v0, 0x1

    .line 23
    .line 24
    aget-char v0, v3, v0

    .line 25
    .line 26
    :goto_1
    if-eqz v0, :cond_4

    .line 27
    .line 28
    const/16 v5, 0x20

    .line 29
    .line 30
    if-gt v0, v5, :cond_2

    .line 31
    .line 32
    const-wide/16 v5, 0x1

    .line 33
    .line 34
    shl-long/2addr v5, v0

    .line 35
    const-wide v7, 0x100003700L

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr v5, v7

    .line 41
    const-wide/16 v7, 0x0

    .line 42
    .line 43
    cmp-long v5, v5, v7

    .line 44
    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    iput-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 49
    .line 50
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 51
    .line 52
    const/16 v1, 0x2f

    .line 53
    .line 54
    if-ne v0, v1, :cond_3

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏世子兰哲()V

    .line 57
    .line 58
    .line 59
    :cond_3
    const/4 p0, 0x1

    .line 60
    return p0

    .line 61
    :cond_4
    :goto_2
    if-ne v4, v2, :cond_5

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_5
    add-int/lit8 v0, v4, 0x1

    .line 65
    .line 66
    aget-char v4, v3, v4

    .line 67
    .line 68
    move v9, v4

    .line 69
    move v4, v0

    .line 70
    move v0, v9

    .line 71
    goto :goto_1
.end method

.method public final 飘花落叶言子哲楪世苏兰()Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 4
    .line 5
    const/16 v2, 0x5d

    .line 6
    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_0
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 12
    .line 13
    const/16 v2, 0x1a

    .line 14
    .line 15
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 16
    .line 17
    iget-object v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 18
    .line 19
    if-ne v1, v3, :cond_1

    .line 20
    .line 21
    move v5, v1

    .line 22
    :goto_0
    move v1, v2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    add-int/lit8 v5, v1, 0x1

    .line 25
    .line 26
    aget-char v1, v4, v1

    .line 27
    .line 28
    :goto_1
    if-eqz v1, :cond_8

    .line 29
    .line 30
    const-wide/16 v6, 0x0

    .line 31
    .line 32
    const-wide v8, 0x100003700L

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    const-wide/16 v10, 0x1

    .line 38
    .line 39
    const/16 v12, 0x20

    .line 40
    .line 41
    if-gt v1, v12, :cond_2

    .line 42
    .line 43
    shl-long v13, v10, v1

    .line 44
    .line 45
    and-long/2addr v13, v8

    .line 46
    cmp-long v13, v13, v6

    .line 47
    .line 48
    if-eqz v13, :cond_2

    .line 49
    .line 50
    goto :goto_4

    .line 51
    :cond_2
    const/16 v13, 0x2c

    .line 52
    .line 53
    const/4 v14, 0x1

    .line 54
    if-ne v1, v13, :cond_6

    .line 55
    .line 56
    iput-boolean v14, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 57
    .line 58
    if-ne v5, v3, :cond_3

    .line 59
    .line 60
    move v1, v5

    .line 61
    move v5, v2

    .line 62
    goto :goto_2

    .line 63
    :cond_3
    add-int/lit8 v1, v5, 0x1

    .line 64
    .line 65
    aget-char v5, v4, v5

    .line 66
    .line 67
    :goto_2
    move/from16 v17, v5

    .line 68
    .line 69
    move v5, v1

    .line 70
    move/from16 v1, v17

    .line 71
    .line 72
    :goto_3
    if-eqz v1, :cond_4

    .line 73
    .line 74
    if-gt v1, v12, :cond_6

    .line 75
    .line 76
    shl-long v15, v10, v1

    .line 77
    .line 78
    and-long/2addr v15, v8

    .line 79
    cmp-long v13, v15, v6

    .line 80
    .line 81
    if-eqz v13, :cond_6

    .line 82
    .line 83
    :cond_4
    if-ne v5, v3, :cond_5

    .line 84
    .line 85
    move v1, v2

    .line 86
    goto :goto_3

    .line 87
    :cond_5
    add-int/lit8 v1, v5, 0x1

    .line 88
    .line 89
    aget-char v5, v4, v5

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_6
    iput-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 93
    .line 94
    iput v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 95
    .line 96
    const/16 v2, 0x2f

    .line 97
    .line 98
    if-ne v1, v2, :cond_7

    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏世子兰哲()V

    .line 101
    .line 102
    .line 103
    :cond_7
    return v14

    .line 104
    :cond_8
    :goto_4
    if-ne v5, v3, :cond_9

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_9
    add-int/lit8 v1, v5, 0x1

    .line 108
    .line 109
    aget-char v5, v4, v5

    .line 110
    .line 111
    move/from16 v17, v5

    .line 112
    .line 113
    move v5, v1

    .line 114
    move/from16 v1, v17

    .line 115
    .line 116
    goto :goto_1
.end method

.method public final 飘花落叶言子哲楪兰苏世(C)Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 4
    .line 5
    iget-char v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 6
    .line 7
    :goto_0
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    const-wide v5, 0x100003700L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const-wide/16 v7, 0x1

    .line 15
    .line 16
    const/16 v9, 0x20

    .line 17
    .line 18
    const/16 v10, 0x1a

    .line 19
    .line 20
    iget v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 21
    .line 22
    iget-object v12, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 23
    .line 24
    if-gt v2, v9, :cond_1

    .line 25
    .line 26
    shl-long v13, v7, v2

    .line 27
    .line 28
    and-long/2addr v13, v5

    .line 29
    cmp-long v13, v13, v3

    .line 30
    .line 31
    if-eqz v13, :cond_1

    .line 32
    .line 33
    if-ne v1, v11, :cond_0

    .line 34
    .line 35
    move v2, v10

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    add-int/lit8 v2, v1, 0x1

    .line 38
    .line 39
    aget-char v1, v12, v1

    .line 40
    .line 41
    move v15, v2

    .line 42
    move v2, v1

    .line 43
    move v1, v15

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move/from16 v13, p1

    .line 46
    .line 47
    if-eq v2, v13, :cond_2

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    return v0

    .line 51
    :cond_2
    if-ne v1, v11, :cond_3

    .line 52
    .line 53
    move v2, v1

    .line 54
    :goto_1
    move v1, v10

    .line 55
    goto :goto_2

    .line 56
    :cond_3
    add-int/lit8 v2, v1, 0x1

    .line 57
    .line 58
    aget-char v1, v12, v1

    .line 59
    .line 60
    :goto_2
    if-eqz v1, :cond_6

    .line 61
    .line 62
    if-gt v1, v9, :cond_4

    .line 63
    .line 64
    shl-long v13, v7, v1

    .line 65
    .line 66
    and-long/2addr v13, v5

    .line 67
    cmp-long v13, v13, v3

    .line 68
    .line 69
    if-eqz v13, :cond_4

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_4
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 73
    .line 74
    iput-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 75
    .line 76
    const/16 v2, 0x2f

    .line 77
    .line 78
    const/4 v3, 0x1

    .line 79
    if-ne v1, v2, :cond_5

    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏世子兰哲()V

    .line 82
    .line 83
    .line 84
    :cond_5
    return v3

    .line 85
    :cond_6
    :goto_3
    if-ne v2, v11, :cond_7

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_7
    add-int/lit8 v1, v2, 0x1

    .line 89
    .line 90
    aget-char v2, v12, v2

    .line 91
    .line 92
    move v15, v2

    .line 93
    move v2, v1

    .line 94
    move v1, v15

    .line 95
    goto :goto_2
.end method

.method public final 飘花落叶言子哲楪苏世兰()Z
    .locals 15

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 4
    .line 5
    :goto_0
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const-wide v4, 0x100003700L

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const-wide/16 v6, 0x1

    .line 13
    .line 14
    const/16 v8, 0x20

    .line 15
    .line 16
    const/16 v9, 0x1a

    .line 17
    .line 18
    iget v10, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 19
    .line 20
    iget-object v11, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 21
    .line 22
    if-gt v1, v8, :cond_1

    .line 23
    .line 24
    shl-long v12, v6, v1

    .line 25
    .line 26
    and-long/2addr v12, v4

    .line 27
    cmp-long v12, v12, v2

    .line 28
    .line 29
    if-eqz v12, :cond_1

    .line 30
    .line 31
    if-ne v0, v10, :cond_0

    .line 32
    .line 33
    move v1, v9

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    add-int/lit8 v1, v0, 0x1

    .line 36
    .line 37
    aget-char v0, v11, v0

    .line 38
    .line 39
    move v14, v1

    .line 40
    move v1, v0

    .line 41
    move v0, v14

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/16 v12, 0x2c

    .line 44
    .line 45
    if-eq v1, v12, :cond_2

    .line 46
    .line 47
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 48
    .line 49
    iput-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return p0

    .line 53
    :cond_2
    if-ne v0, v10, :cond_3

    .line 54
    .line 55
    move v1, v0

    .line 56
    :goto_1
    move v0, v9

    .line 57
    goto :goto_2

    .line 58
    :cond_3
    add-int/lit8 v1, v0, 0x1

    .line 59
    .line 60
    aget-char v0, v11, v0

    .line 61
    .line 62
    :goto_2
    if-eqz v0, :cond_6

    .line 63
    .line 64
    if-gt v0, v8, :cond_4

    .line 65
    .line 66
    shl-long v12, v6, v0

    .line 67
    .line 68
    and-long/2addr v12, v4

    .line 69
    cmp-long v12, v12, v2

    .line 70
    .line 71
    if-eqz v12, :cond_4

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 75
    .line 76
    iput-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 77
    .line 78
    const/16 v1, 0x2f

    .line 79
    .line 80
    if-ne v0, v1, :cond_5

    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏世子兰哲()V

    .line 83
    .line 84
    .line 85
    :cond_5
    const/4 p0, 0x1

    .line 86
    return p0

    .line 87
    :cond_6
    :goto_3
    if-ne v1, v10, :cond_7

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_7
    add-int/lit8 v0, v1, 0x1

    .line 91
    .line 92
    aget-char v1, v11, v1

    .line 93
    .line 94
    move v14, v1

    .line 95
    move v1, v0

    .line 96
    move v0, v14

    .line 97
    goto :goto_2
.end method

.method public final 飘花落叶言子哲楪苏兰世()Z
    .locals 10

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 4
    .line 5
    const/16 v2, 0x49

    .line 6
    .line 7
    if-ne v1, v2, :cond_3

    .line 8
    .line 9
    add-int/lit8 v1, v0, 0x6

    .line 10
    .line 11
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 12
    .line 13
    if-ge v1, v2, :cond_3

    .line 14
    .line 15
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 16
    .line 17
    aget-char v4, v3, v0

    .line 18
    .line 19
    const/16 v5, 0x6e

    .line 20
    .line 21
    if-ne v4, v5, :cond_3

    .line 22
    .line 23
    add-int/lit8 v4, v0, 0x1

    .line 24
    .line 25
    aget-char v4, v3, v4

    .line 26
    .line 27
    const/16 v6, 0x66

    .line 28
    .line 29
    if-ne v4, v6, :cond_3

    .line 30
    .line 31
    add-int/lit8 v4, v0, 0x2

    .line 32
    .line 33
    aget-char v4, v3, v4

    .line 34
    .line 35
    const/16 v6, 0x69

    .line 36
    .line 37
    if-ne v4, v6, :cond_3

    .line 38
    .line 39
    add-int/lit8 v4, v0, 0x3

    .line 40
    .line 41
    aget-char v4, v3, v4

    .line 42
    .line 43
    if-ne v4, v5, :cond_3

    .line 44
    .line 45
    add-int/lit8 v4, v0, 0x4

    .line 46
    .line 47
    aget-char v4, v3, v4

    .line 48
    .line 49
    if-ne v4, v6, :cond_3

    .line 50
    .line 51
    add-int/lit8 v4, v0, 0x5

    .line 52
    .line 53
    aget-char v4, v3, v4

    .line 54
    .line 55
    const/16 v5, 0x74

    .line 56
    .line 57
    if-ne v4, v5, :cond_3

    .line 58
    .line 59
    aget-char v1, v3, v1

    .line 60
    .line 61
    const/16 v4, 0x79

    .line 62
    .line 63
    if-ne v1, v4, :cond_3

    .line 64
    .line 65
    add-int/lit8 v1, v0, 0x7

    .line 66
    .line 67
    const/16 v4, 0x1a

    .line 68
    .line 69
    if-ne v1, v2, :cond_0

    .line 70
    .line 71
    move v0, v1

    .line 72
    :goto_0
    move v1, v4

    .line 73
    goto :goto_1

    .line 74
    :cond_0
    add-int/lit8 v0, v0, 0x8

    .line 75
    .line 76
    aget-char v1, v3, v1

    .line 77
    .line 78
    :goto_1
    const/16 v5, 0x20

    .line 79
    .line 80
    if-gt v1, v5, :cond_2

    .line 81
    .line 82
    const-wide/16 v5, 0x1

    .line 83
    .line 84
    shl-long/2addr v5, v1

    .line 85
    const-wide v7, 0x100003700L

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    and-long/2addr v5, v7

    .line 91
    const-wide/16 v7, 0x0

    .line 92
    .line 93
    cmp-long v5, v5, v7

    .line 94
    .line 95
    if-eqz v5, :cond_2

    .line 96
    .line 97
    if-ne v0, v2, :cond_1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_1
    add-int/lit8 v1, v0, 0x1

    .line 101
    .line 102
    aget-char v0, v3, v0

    .line 103
    .line 104
    move v9, v1

    .line 105
    move v1, v0

    .line 106
    move v0, v9

    .line 107
    goto :goto_1

    .line 108
    :cond_2
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 109
    .line 110
    iput-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 111
    .line 112
    const/4 p0, 0x1

    .line 113
    return p0

    .line 114
    :cond_3
    const/4 p0, 0x0

    .line 115
    return p0
.end method

.method public final 飘花落叶言子哲苏世兰楪()Z
    .locals 10

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 4
    .line 5
    const/16 v2, 0x53

    .line 6
    .line 7
    if-ne v1, v2, :cond_3

    .line 8
    .line 9
    add-int/lit8 v1, v0, 0x1

    .line 10
    .line 11
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 12
    .line 13
    if-ge v1, v2, :cond_3

    .line 14
    .line 15
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 16
    .line 17
    aget-char v4, v3, v0

    .line 18
    .line 19
    const/16 v5, 0x65

    .line 20
    .line 21
    if-ne v4, v5, :cond_3

    .line 22
    .line 23
    aget-char v1, v3, v1

    .line 24
    .line 25
    const/16 v4, 0x74

    .line 26
    .line 27
    if-ne v1, v4, :cond_3

    .line 28
    .line 29
    add-int/lit8 v1, v0, 0x2

    .line 30
    .line 31
    const/16 v4, 0x1a

    .line 32
    .line 33
    if-ne v1, v2, :cond_0

    .line 34
    .line 35
    move v0, v1

    .line 36
    :goto_0
    move v1, v4

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    add-int/lit8 v0, v0, 0x3

    .line 39
    .line 40
    aget-char v1, v3, v1

    .line 41
    .line 42
    :goto_1
    const/16 v5, 0x20

    .line 43
    .line 44
    if-gt v1, v5, :cond_2

    .line 45
    .line 46
    const-wide/16 v5, 0x1

    .line 47
    .line 48
    shl-long/2addr v5, v1

    .line 49
    const-wide v7, 0x100003700L

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    and-long/2addr v5, v7

    .line 55
    const-wide/16 v7, 0x0

    .line 56
    .line 57
    cmp-long v5, v5, v7

    .line 58
    .line 59
    if-eqz v5, :cond_2

    .line 60
    .line 61
    if-ne v0, v2, :cond_1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    add-int/lit8 v1, v0, 0x1

    .line 65
    .line 66
    aget-char v0, v3, v0

    .line 67
    .line 68
    move v9, v1

    .line 69
    move v1, v0

    .line 70
    move v0, v9

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 73
    .line 74
    iput-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 75
    .line 76
    const/4 p0, 0x1

    .line 77
    return p0

    .line 78
    :cond_3
    const/4 p0, 0x0

    .line 79
    return p0
.end method

.method public final 飘花落叶言子哲苏世楪兰()Z
    .locals 10

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x7b

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 10
    .line 11
    const/16 v1, 0x1a

    .line 12
    .line 13
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 14
    .line 15
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 16
    .line 17
    if-ne v0, v2, :cond_1

    .line 18
    .line 19
    move v4, v0

    .line 20
    :goto_0
    move v0, v1

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    add-int/lit8 v4, v0, 0x1

    .line 23
    .line 24
    aget-char v0, v3, v0

    .line 25
    .line 26
    :goto_1
    if-eqz v0, :cond_4

    .line 27
    .line 28
    const/16 v5, 0x20

    .line 29
    .line 30
    if-gt v0, v5, :cond_2

    .line 31
    .line 32
    const-wide/16 v5, 0x1

    .line 33
    .line 34
    shl-long/2addr v5, v0

    .line 35
    const-wide v7, 0x100003700L

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr v5, v7

    .line 41
    const-wide/16 v7, 0x0

    .line 42
    .line 43
    cmp-long v5, v5, v7

    .line 44
    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    iput-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 49
    .line 50
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 51
    .line 52
    const/16 v1, 0x2f

    .line 53
    .line 54
    if-ne v0, v1, :cond_3

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏世子兰哲()V

    .line 57
    .line 58
    .line 59
    :cond_3
    const/4 p0, 0x1

    .line 60
    return p0

    .line 61
    :cond_4
    :goto_2
    if-ne v4, v2, :cond_5

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_5
    add-int/lit8 v0, v4, 0x1

    .line 65
    .line 66
    aget-char v4, v3, v4

    .line 67
    .line 68
    move v9, v4

    .line 69
    move v4, v0

    .line 70
    move v0, v9

    .line 71
    goto :goto_1
.end method

.method public final 飘花落叶言子哲苏兰楪世()V
    .locals 10

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 8
    .line 9
    if-lt v0, v3, :cond_0

    .line 10
    .line 11
    move v4, v0

    .line 12
    :goto_0
    move v0, v1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    add-int/lit8 v4, v0, 0x1

    .line 15
    .line 16
    aget-char v0, v2, v0

    .line 17
    .line 18
    :goto_1
    if-eqz v0, :cond_2

    .line 19
    .line 20
    const/16 v5, 0x20

    .line 21
    .line 22
    if-gt v0, v5, :cond_1

    .line 23
    .line 24
    const-wide/16 v5, 0x1

    .line 25
    .line 26
    shl-long/2addr v5, v0

    .line 27
    const-wide v7, 0x100003700L

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    and-long/2addr v5, v7

    .line 33
    const-wide/16 v7, 0x0

    .line 34
    .line 35
    cmp-long v5, v5, v7

    .line 36
    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 41
    .line 42
    iput-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    :goto_2
    if-ne v4, v3, :cond_3

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    add-int/lit8 v0, v4, 0x1

    .line 49
    .line 50
    aget-char v4, v2, v4

    .line 51
    .line 52
    move v9, v4

    .line 53
    move v4, v0

    .line 54
    move v0, v9

    .line 55
    goto :goto_1
.end method

.method public final 飘花落叶言子哲苏楪世兰()Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 6
    .line 7
    const/16 v3, 0x6e

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    iget v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 12
    .line 13
    iget-object v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 14
    .line 15
    if-ne v1, v3, :cond_0

    .line 16
    .line 17
    add-int/lit8 v3, v2, 0x2

    .line 18
    .line 19
    if-ge v3, v6, :cond_0

    .line 20
    .line 21
    aget-char v8, v7, v2

    .line 22
    .line 23
    const/16 v9, 0x75

    .line 24
    .line 25
    if-ne v8, v9, :cond_0

    .line 26
    .line 27
    add-int/lit8 v8, v2, 0x1

    .line 28
    .line 29
    aget-char v8, v7, v8

    .line 30
    .line 31
    const/16 v9, 0x6c

    .line 32
    .line 33
    if-ne v8, v9, :cond_0

    .line 34
    .line 35
    aget-char v3, v7, v3

    .line 36
    .line 37
    if-ne v3, v9, :cond_0

    .line 38
    .line 39
    add-int/lit8 v2, v2, 0x3

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/16 v3, 0x22

    .line 43
    .line 44
    if-eq v1, v3, :cond_1

    .line 45
    .line 46
    const/16 v3, 0x27

    .line 47
    .line 48
    if-ne v1, v3, :cond_b

    .line 49
    .line 50
    :cond_1
    if-ge v2, v6, :cond_2

    .line 51
    .line 52
    aget-char v3, v7, v2

    .line 53
    .line 54
    if-ne v3, v1, :cond_2

    .line 55
    .line 56
    add-int/2addr v2, v5

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    add-int/lit8 v3, v2, 0x4

    .line 59
    .line 60
    if-ge v3, v6, :cond_b

    .line 61
    .line 62
    invoke-static {v2, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰哲苏世(I[C)J

    .line 63
    .line 64
    .line 65
    move-result-wide v8

    .line 66
    sget-wide v10, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏:J

    .line 67
    .line 68
    cmp-long v8, v8, v10

    .line 69
    .line 70
    if-nez v8, :cond_b

    .line 71
    .line 72
    aget-char v3, v7, v3

    .line 73
    .line 74
    if-ne v3, v1, :cond_b

    .line 75
    .line 76
    add-int/lit8 v2, v2, 0x5

    .line 77
    .line 78
    :goto_0
    const/16 v1, 0x1a

    .line 79
    .line 80
    if-ne v2, v6, :cond_3

    .line 81
    .line 82
    move v3, v2

    .line 83
    :goto_1
    move v2, v1

    .line 84
    goto :goto_2

    .line 85
    :cond_3
    add-int/lit8 v3, v2, 0x1

    .line 86
    .line 87
    aget-char v2, v7, v2

    .line 88
    .line 89
    :goto_2
    const-wide/16 v8, 0x0

    .line 90
    .line 91
    const-wide v10, 0x100003700L

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    const-wide/16 v12, 0x1

    .line 97
    .line 98
    const/16 v14, 0x20

    .line 99
    .line 100
    if-gt v2, v14, :cond_5

    .line 101
    .line 102
    shl-long v15, v12, v2

    .line 103
    .line 104
    and-long/2addr v15, v10

    .line 105
    cmp-long v15, v15, v8

    .line 106
    .line 107
    if-eqz v15, :cond_5

    .line 108
    .line 109
    if-ne v3, v6, :cond_4

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_4
    add-int/lit8 v2, v3, 0x1

    .line 113
    .line 114
    aget-char v3, v7, v3

    .line 115
    .line 116
    move/from16 v17, v3

    .line 117
    .line 118
    move v3, v2

    .line 119
    move/from16 v2, v17

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_5
    const/16 v15, 0x2c

    .line 123
    .line 124
    if-ne v2, v15, :cond_6

    .line 125
    .line 126
    move v4, v5

    .line 127
    :cond_6
    iput-boolean v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 128
    .line 129
    if-eqz v4, :cond_8

    .line 130
    .line 131
    if-ne v3, v6, :cond_7

    .line 132
    .line 133
    :goto_3
    move v2, v1

    .line 134
    goto :goto_5

    .line 135
    :cond_7
    add-int/lit8 v2, v3, 0x1

    .line 136
    .line 137
    aget-char v3, v7, v3

    .line 138
    .line 139
    :goto_4
    move/from16 v17, v3

    .line 140
    .line 141
    move v3, v2

    .line 142
    move/from16 v2, v17

    .line 143
    .line 144
    :cond_8
    :goto_5
    if-gt v2, v14, :cond_a

    .line 145
    .line 146
    shl-long v15, v12, v2

    .line 147
    .line 148
    and-long/2addr v15, v10

    .line 149
    cmp-long v4, v15, v8

    .line 150
    .line 151
    if-eqz v4, :cond_a

    .line 152
    .line 153
    if-ne v3, v6, :cond_9

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_9
    add-int/lit8 v2, v3, 0x1

    .line 157
    .line 158
    aget-char v3, v7, v3

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_a
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 162
    .line 163
    iput-char v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 164
    .line 165
    return v5

    .line 166
    :cond_b
    return v4
.end method

.method public final 飘花落叶言子哲苏楪兰世()Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 4
    .line 5
    const/16 v2, 0x7d

    .line 6
    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_0
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 12
    .line 13
    const/16 v2, 0x1a

    .line 14
    .line 15
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 16
    .line 17
    iget-object v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 18
    .line 19
    if-ne v1, v3, :cond_1

    .line 20
    .line 21
    move v5, v1

    .line 22
    :goto_0
    move v1, v2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    add-int/lit8 v5, v1, 0x1

    .line 25
    .line 26
    aget-char v1, v4, v1

    .line 27
    .line 28
    :goto_1
    if-eqz v1, :cond_8

    .line 29
    .line 30
    const-wide/16 v6, 0x0

    .line 31
    .line 32
    const-wide v8, 0x100003700L

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    const-wide/16 v10, 0x1

    .line 38
    .line 39
    const/16 v12, 0x20

    .line 40
    .line 41
    if-gt v1, v12, :cond_2

    .line 42
    .line 43
    shl-long v13, v10, v1

    .line 44
    .line 45
    and-long/2addr v13, v8

    .line 46
    cmp-long v13, v13, v6

    .line 47
    .line 48
    if-eqz v13, :cond_2

    .line 49
    .line 50
    goto :goto_4

    .line 51
    :cond_2
    const/16 v13, 0x2c

    .line 52
    .line 53
    const/4 v14, 0x1

    .line 54
    if-ne v1, v13, :cond_6

    .line 55
    .line 56
    iput-boolean v14, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 57
    .line 58
    if-ne v5, v3, :cond_3

    .line 59
    .line 60
    move v1, v5

    .line 61
    move v5, v2

    .line 62
    goto :goto_2

    .line 63
    :cond_3
    add-int/lit8 v1, v5, 0x1

    .line 64
    .line 65
    aget-char v5, v4, v5

    .line 66
    .line 67
    :goto_2
    move/from16 v17, v5

    .line 68
    .line 69
    move v5, v1

    .line 70
    move/from16 v1, v17

    .line 71
    .line 72
    :goto_3
    if-eqz v1, :cond_4

    .line 73
    .line 74
    if-gt v1, v12, :cond_6

    .line 75
    .line 76
    shl-long v15, v10, v1

    .line 77
    .line 78
    and-long/2addr v15, v8

    .line 79
    cmp-long v13, v15, v6

    .line 80
    .line 81
    if-eqz v13, :cond_6

    .line 82
    .line 83
    :cond_4
    if-ne v5, v3, :cond_5

    .line 84
    .line 85
    move v1, v2

    .line 86
    goto :goto_3

    .line 87
    :cond_5
    add-int/lit8 v1, v5, 0x1

    .line 88
    .line 89
    aget-char v5, v4, v5

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_6
    iput-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 93
    .line 94
    iput v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 95
    .line 96
    const/16 v2, 0x2f

    .line 97
    .line 98
    if-ne v1, v2, :cond_7

    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏世子兰哲()V

    .line 101
    .line 102
    .line 103
    :cond_7
    return v14

    .line 104
    :cond_8
    :goto_4
    if-ne v5, v3, :cond_9

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_9
    add-int/lit8 v1, v5, 0x1

    .line 108
    .line 109
    aget-char v5, v4, v5

    .line 110
    .line 111
    move/from16 v17, v5

    .line 112
    .line 113
    move v5, v1

    .line 114
    move/from16 v1, v17

    .line 115
    .line 116
    goto :goto_1
.end method

.method public final 飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v3, v0

    .line 4
    move v2, v1

    .line 5
    move v4, v2

    .line 6
    :goto_0
    iget v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 7
    .line 8
    if-ge v2, v5, :cond_0

    .line 9
    .line 10
    move v5, v0

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    move v5, v1

    .line 13
    :goto_1
    iget v6, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 14
    .line 15
    if-ge v2, v6, :cond_1

    .line 16
    .line 17
    move v6, v0

    .line 18
    goto :goto_2

    .line 19
    :cond_1
    move v6, v1

    .line 20
    :goto_2
    and-int/2addr v5, v6

    .line 21
    const/16 v6, 0xa

    .line 22
    .line 23
    iget-object v7, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 24
    .line 25
    if-eqz v5, :cond_3

    .line 26
    .line 27
    aget-char v5, v7, v2

    .line 28
    .line 29
    if-ne v5, v6, :cond_2

    .line 30
    .line 31
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    move v4, v1

    .line 34
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    add-int/2addr v4, v0

    .line 37
    goto :goto_0

    .line 38
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    if-eqz p1, :cond_4

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-nez v5, :cond_4

    .line 50
    .line 51
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p1, ", "

    .line 55
    .line 56
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    :cond_4
    const-string p1, "offset "

    .line 60
    .line 61
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    iget p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 65
    .line 66
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string p1, ", character "

    .line 70
    .line 71
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget-char p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 75
    .line 76
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string p1, ", line "

    .line 80
    .line 81
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string p1, ", column "

    .line 88
    .line 89
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string p1, ", fastjson-version 2.0.60"

    .line 96
    .line 97
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    if-le v3, v0, :cond_5

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_5
    const/16 v6, 0x20

    .line 104
    .line 105
    :goto_3
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰楪苏:I

    .line 109
    .line 110
    const p1, 0xffff

    .line 111
    .line 112
    .line 113
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    invoke-virtual {v2, v7, v1, p0}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0
.end method

.method public final 飘花落叶言子苏兰哲世楪()V
    .locals 10

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 6
    .line 7
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 8
    .line 9
    if-lt v0, v3, :cond_0

    .line 10
    .line 11
    move v4, v0

    .line 12
    :goto_0
    move v0, v1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    add-int/lit8 v4, v0, 0x1

    .line 15
    .line 16
    aget-char v0, v2, v0

    .line 17
    .line 18
    :goto_1
    if-eqz v0, :cond_3

    .line 19
    .line 20
    const/16 v5, 0x20

    .line 21
    .line 22
    if-gt v0, v5, :cond_1

    .line 23
    .line 24
    const-wide/16 v5, 0x1

    .line 25
    .line 26
    shl-long/2addr v5, v0

    .line 27
    const-wide v7, 0x100003700L

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    and-long/2addr v5, v7

    .line 33
    const-wide/16 v7, 0x0

    .line 34
    .line 35
    cmp-long v5, v5, v7

    .line 36
    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    iput v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 41
    .line 42
    iput-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 43
    .line 44
    const/16 v1, 0x2f

    .line 45
    .line 46
    if-ne v0, v1, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏世子兰哲()V

    .line 49
    .line 50
    .line 51
    :cond_2
    return-void

    .line 52
    :cond_3
    :goto_2
    if-ne v4, v3, :cond_4

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_4
    add-int/lit8 v0, v4, 0x1

    .line 56
    .line 57
    aget-char v4, v2, v4

    .line 58
    .line 59
    move v9, v4

    .line 60
    move v4, v0

    .line 61
    move v0, v9

    .line 62
    goto :goto_1
.end method

.method public final 飘花落叶言子苏哲兰楪世()Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 4
    .line 5
    iget-wide v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 6
    .line 7
    const-wide v3, 0x200000000L

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    and-long/2addr v1, v3

    .line 13
    const-wide/16 v3, 0x0

    .line 14
    .line 15
    cmp-long v1, v1, v3

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    return v2

    .line 21
    :cond_0
    iget-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 22
    .line 23
    const/16 v5, 0x7b

    .line 24
    .line 25
    if-eq v1, v5, :cond_1

    .line 26
    .line 27
    return v2

    .line 28
    :cond_1
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 29
    .line 30
    iget v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 31
    .line 32
    if-ne v1, v5, :cond_2

    .line 33
    .line 34
    return v2

    .line 35
    :cond_2
    iget-object v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 36
    .line 37
    aget-char v7, v6, v1

    .line 38
    .line 39
    :goto_0
    const-wide v8, 0x100003700L

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    const-wide/16 v10, 0x1

    .line 45
    .line 46
    const/16 v12, 0x20

    .line 47
    .line 48
    if-gt v7, v12, :cond_4

    .line 49
    .line 50
    shl-long v13, v10, v7

    .line 51
    .line 52
    and-long/2addr v13, v8

    .line 53
    cmp-long v13, v13, v3

    .line 54
    .line 55
    if-eqz v13, :cond_4

    .line 56
    .line 57
    add-int/lit8 v1, v1, 0x1

    .line 58
    .line 59
    if-lt v1, v5, :cond_3

    .line 60
    .line 61
    return v2

    .line 62
    :cond_3
    aget-char v7, v6, v1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_4
    add-int/lit8 v13, v1, 0x6

    .line 66
    .line 67
    if-ge v13, v5, :cond_d

    .line 68
    .line 69
    add-int/lit8 v14, v1, 0x1

    .line 70
    .line 71
    aget-char v14, v6, v14

    .line 72
    .line 73
    const/16 v15, 0x24

    .line 74
    .line 75
    if-ne v14, v15, :cond_d

    .line 76
    .line 77
    add-int/lit8 v14, v1, 0x2

    .line 78
    .line 79
    aget-char v14, v6, v14

    .line 80
    .line 81
    move/from16 v16, v2

    .line 82
    .line 83
    const/16 v2, 0x72

    .line 84
    .line 85
    if-ne v14, v2, :cond_e

    .line 86
    .line 87
    add-int/lit8 v2, v1, 0x3

    .line 88
    .line 89
    aget-char v2, v6, v2

    .line 90
    .line 91
    const/16 v14, 0x65

    .line 92
    .line 93
    if-ne v2, v14, :cond_e

    .line 94
    .line 95
    add-int/lit8 v2, v1, 0x4

    .line 96
    .line 97
    aget-char v2, v6, v2

    .line 98
    .line 99
    const/16 v14, 0x66

    .line 100
    .line 101
    if-ne v2, v14, :cond_e

    .line 102
    .line 103
    add-int/lit8 v1, v1, 0x5

    .line 104
    .line 105
    aget-char v1, v6, v1

    .line 106
    .line 107
    if-eq v1, v7, :cond_5

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_5
    aget-char v1, v6, v13

    .line 111
    .line 112
    :goto_1
    if-gt v1, v12, :cond_7

    .line 113
    .line 114
    shl-long v17, v10, v1

    .line 115
    .line 116
    and-long v17, v17, v8

    .line 117
    .line 118
    cmp-long v2, v17, v3

    .line 119
    .line 120
    if-eqz v2, :cond_7

    .line 121
    .line 122
    add-int/lit8 v13, v13, 0x1

    .line 123
    .line 124
    if-lt v13, v5, :cond_6

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_6
    aget-char v1, v6, v13

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_7
    const/16 v2, 0x3a

    .line 131
    .line 132
    if-ne v1, v2, :cond_c

    .line 133
    .line 134
    const/4 v1, 0x1

    .line 135
    add-int/2addr v13, v1

    .line 136
    if-lt v13, v5, :cond_8

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_8
    aget-char v2, v6, v13

    .line 140
    .line 141
    :goto_2
    if-gt v2, v12, :cond_a

    .line 142
    .line 143
    shl-long v17, v10, v2

    .line 144
    .line 145
    and-long v17, v17, v8

    .line 146
    .line 147
    cmp-long v14, v17, v3

    .line 148
    .line 149
    if-eqz v14, :cond_a

    .line 150
    .line 151
    add-int/lit8 v13, v13, 0x1

    .line 152
    .line 153
    if-lt v13, v5, :cond_9

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_9
    aget-char v2, v6, v13

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_a
    if-ne v2, v7, :cond_c

    .line 160
    .line 161
    add-int/lit8 v2, v13, 0x1

    .line 162
    .line 163
    if-ge v2, v5, :cond_b

    .line 164
    .line 165
    aget-char v2, v6, v2

    .line 166
    .line 167
    if-eq v2, v15, :cond_b

    .line 168
    .line 169
    const/16 v3, 0x2e

    .line 170
    .line 171
    if-eq v2, v3, :cond_b

    .line 172
    .line 173
    const/16 v3, 0x40

    .line 174
    .line 175
    if-eq v2, v3, :cond_b

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_b
    iput v13, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰苏哲楪:I

    .line 179
    .line 180
    return v1

    .line 181
    :cond_c
    :goto_3
    return v16

    .line 182
    :cond_d
    move/from16 v16, v2

    .line 183
    .line 184
    :cond_e
    :goto_4
    return v16
.end method

.method public final 飘花落叶言子苏楪世哲兰()I
    .locals 6

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/16 v1, 0x27

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "string length only support string input"

    .line 14
    .line 15
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return v2

    .line 19
    :cond_1
    :goto_0
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    add-int/lit8 v3, v1, 0x8

    .line 22
    .line 23
    iget v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 24
    .line 25
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 26
    .line 27
    if-ge v3, v4, :cond_2

    .line 28
    .line 29
    array-length v5, p0

    .line 30
    if-ge v3, v5, :cond_2

    .line 31
    .line 32
    aget-char v5, p0, v1

    .line 33
    .line 34
    if-eq v5, v0, :cond_2

    .line 35
    .line 36
    add-int/lit8 v5, v1, 0x1

    .line 37
    .line 38
    aget-char v5, p0, v5

    .line 39
    .line 40
    if-eq v5, v0, :cond_2

    .line 41
    .line 42
    add-int/lit8 v5, v1, 0x2

    .line 43
    .line 44
    aget-char v5, p0, v5

    .line 45
    .line 46
    if-eq v5, v0, :cond_2

    .line 47
    .line 48
    add-int/lit8 v5, v1, 0x3

    .line 49
    .line 50
    aget-char v5, p0, v5

    .line 51
    .line 52
    if-eq v5, v0, :cond_2

    .line 53
    .line 54
    add-int/lit8 v5, v1, 0x4

    .line 55
    .line 56
    aget-char v5, p0, v5

    .line 57
    .line 58
    if-eq v5, v0, :cond_2

    .line 59
    .line 60
    add-int/lit8 v5, v1, 0x5

    .line 61
    .line 62
    aget-char v5, p0, v5

    .line 63
    .line 64
    if-eq v5, v0, :cond_2

    .line 65
    .line 66
    add-int/lit8 v5, v1, 0x6

    .line 67
    .line 68
    aget-char v5, p0, v5

    .line 69
    .line 70
    if-eq v5, v0, :cond_2

    .line 71
    .line 72
    add-int/lit8 v5, v1, 0x7

    .line 73
    .line 74
    aget-char v5, p0, v5

    .line 75
    .line 76
    if-eq v5, v0, :cond_2

    .line 77
    .line 78
    const/16 v2, 0x8

    .line 79
    .line 80
    move v1, v3

    .line 81
    :cond_2
    :goto_1
    if-ge v1, v4, :cond_4

    .line 82
    .line 83
    aget-char v3, p0, v1

    .line 84
    .line 85
    if-ne v3, v0, :cond_3

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 89
    .line 90
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    :goto_2
    return v2
.end method

.method public final 飘花落叶言楪世兰哲子苏()Ljava/lang/String;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 4
    .line 5
    const/16 v2, 0x6e

    .line 6
    .line 7
    const/16 v3, 0x27

    .line 8
    .line 9
    const/16 v4, 0x22

    .line 10
    .line 11
    if-eq v1, v4, :cond_2

    .line 12
    .line 13
    if-ne v1, v3, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    if-ne v1, v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪世苏兰哲子()V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    return-object v0

    .line 23
    :cond_1
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子世哲兰()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0

    .line 28
    :cond_2
    :goto_0
    if-ne v1, v3, :cond_3

    .line 29
    .line 30
    const-wide v5, 0x2727272727272727L    # 4.483094640249093E-120

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_3
    const-wide v5, 0x2222222222222222L

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    :goto_1
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 42
    .line 43
    iget v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 44
    .line 45
    sub-int v8, v7, v3

    .line 46
    .line 47
    and-int/lit8 v8, v8, -0x8

    .line 48
    .line 49
    add-int/2addr v8, v3

    .line 50
    move v10, v3

    .line 51
    const/4 v11, 0x0

    .line 52
    :goto_2
    const-wide/16 v12, 0x0

    .line 53
    .line 54
    const/16 v14, 0x8

    .line 55
    .line 56
    iget-object v15, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 57
    .line 58
    if-ge v10, v8, :cond_5

    .line 59
    .line 60
    invoke-static {v10, v15}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏哲世(I[C)J

    .line 61
    .line 62
    .line 63
    move-result-wide v16

    .line 64
    add-int/lit8 v9, v10, 0x4

    .line 65
    .line 66
    invoke-static {v9, v15}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏哲世(I[C)J

    .line 67
    .line 68
    .line 69
    move-result-wide v18

    .line 70
    or-long v20, v16, v18

    .line 71
    .line 72
    const-wide v22, -0xff00ff00ff0100L    # -5.82767264895205E303

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    and-long v20, v20, v22

    .line 78
    .line 79
    cmp-long v9, v20, v12

    .line 80
    .line 81
    if-nez v9, :cond_5

    .line 82
    .line 83
    shl-long v16, v16, v14

    .line 84
    .line 85
    move-wide/from16 v20, v12

    .line 86
    .line 87
    or-long v12, v16, v18

    .line 88
    .line 89
    invoke-static {v12, v13, v5, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰苏世;->飘花落叶言楪苏兰子世哲(JJ)Z

    .line 90
    .line 91
    .line 92
    move-result v9

    .line 93
    if-eqz v9, :cond_4

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    add-int/lit8 v10, v10, 0x8

    .line 97
    .line 98
    add-int/lit8 v11, v11, 0x8

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    move-wide/from16 v20, v12

    .line 102
    .line 103
    :goto_3
    const/4 v5, 0x0

    .line 104
    :goto_4
    if-ge v10, v7, :cond_21

    .line 105
    .line 106
    aget-char v6, v15, v10

    .line 107
    .line 108
    const/16 v8, 0x78

    .line 109
    .line 110
    const/16 v9, 0x75

    .line 111
    .line 112
    const/16 v12, 0x5c

    .line 113
    .line 114
    const/4 v13, 0x2

    .line 115
    const/4 v14, 0x1

    .line 116
    if-ne v6, v12, :cond_8

    .line 117
    .line 118
    add-int/lit8 v5, v10, 0x1

    .line 119
    .line 120
    aget-char v5, v15, v5

    .line 121
    .line 122
    if-ne v5, v9, :cond_6

    .line 123
    .line 124
    const/4 v13, 0x6

    .line 125
    goto :goto_5

    .line 126
    :cond_6
    if-ne v5, v8, :cond_7

    .line 127
    .line 128
    const/4 v13, 0x4

    .line 129
    :cond_7
    :goto_5
    add-int/2addr v10, v13

    .line 130
    move v5, v14

    .line 131
    const/16 v6, 0x8

    .line 132
    .line 133
    goto/16 :goto_f

    .line 134
    .line 135
    :cond_8
    if-ne v6, v1, :cond_20

    .line 136
    .line 137
    if-eqz v5, :cond_13

    .line 138
    .line 139
    new-array v5, v11, [C

    .line 140
    .line 141
    const/4 v6, 0x0

    .line 142
    :goto_6
    aget-char v10, v15, v3

    .line 143
    .line 144
    if-ne v10, v12, :cond_11

    .line 145
    .line 146
    add-int/lit8 v10, v3, 0x1

    .line 147
    .line 148
    aget-char v11, v15, v10

    .line 149
    .line 150
    if-eq v11, v4, :cond_10

    .line 151
    .line 152
    if-eq v11, v12, :cond_10

    .line 153
    .line 154
    const/16 v4, 0x62

    .line 155
    .line 156
    if-eq v11, v4, :cond_f

    .line 157
    .line 158
    const/16 v4, 0x66

    .line 159
    .line 160
    if-eq v11, v4, :cond_e

    .line 161
    .line 162
    if-eq v11, v2, :cond_d

    .line 163
    .line 164
    const/16 v4, 0x72

    .line 165
    .line 166
    if-eq v11, v4, :cond_c

    .line 167
    .line 168
    if-eq v11, v8, :cond_b

    .line 169
    .line 170
    const/16 v4, 0x74

    .line 171
    .line 172
    if-eq v11, v4, :cond_a

    .line 173
    .line 174
    if-eq v11, v9, :cond_9

    .line 175
    .line 176
    invoke-virtual {v0, v11}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世哲兰(I)C

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    :goto_7
    move/from16 v24, v10

    .line 181
    .line 182
    move v10, v3

    .line 183
    move/from16 v3, v24

    .line 184
    .line 185
    goto :goto_8

    .line 186
    :cond_9
    add-int/lit8 v4, v3, 0x2

    .line 187
    .line 188
    invoke-static {v4, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 189
    .line 190
    .line 191
    invoke-static {v4, v15}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪兰苏哲(I[C)I

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    int-to-char v10, v4

    .line 196
    add-int/lit8 v3, v3, 0x5

    .line 197
    .line 198
    goto :goto_8

    .line 199
    :cond_a
    const/16 v3, 0x9

    .line 200
    .line 201
    goto :goto_7

    .line 202
    :cond_b
    add-int/lit8 v4, v3, 0x2

    .line 203
    .line 204
    aget-char v4, v15, v4

    .line 205
    .line 206
    add-int/lit8 v3, v3, 0x3

    .line 207
    .line 208
    aget-char v10, v15, v3

    .line 209
    .line 210
    invoke-static {v4, v10}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世兰哲(II)C

    .line 211
    .line 212
    .line 213
    move-result v10

    .line 214
    goto :goto_8

    .line 215
    :cond_c
    const/16 v3, 0xd

    .line 216
    .line 217
    goto :goto_7

    .line 218
    :cond_d
    const/16 v3, 0xa

    .line 219
    .line 220
    goto :goto_7

    .line 221
    :cond_e
    const/16 v3, 0xc

    .line 222
    .line 223
    goto :goto_7

    .line 224
    :cond_f
    move v3, v10

    .line 225
    const/16 v10, 0x8

    .line 226
    .line 227
    goto :goto_8

    .line 228
    :cond_10
    move v3, v10

    .line 229
    move v10, v11

    .line 230
    goto :goto_8

    .line 231
    :cond_11
    if-ne v10, v1, :cond_12

    .line 232
    .line 233
    new-instance v1, Ljava/lang/String;

    .line 234
    .line 235
    invoke-direct {v1, v5}, Ljava/lang/String;-><init>([C)V

    .line 236
    .line 237
    .line 238
    move v10, v3

    .line 239
    goto :goto_9

    .line 240
    :cond_12
    :goto_8
    aput-char v10, v5, v6

    .line 241
    .line 242
    add-int/2addr v3, v14

    .line 243
    add-int/2addr v6, v14

    .line 244
    const/16 v4, 0x22

    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_13
    sub-int v1, v10, v3

    .line 248
    .line 249
    const/16 v2, 0x80

    .line 250
    .line 251
    if-ne v1, v14, :cond_14

    .line 252
    .line 253
    aget-char v4, v15, v3

    .line 254
    .line 255
    if-ge v4, v2, :cond_14

    .line 256
    .line 257
    invoke-static {v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世兰苏楪哲(C)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    goto :goto_9

    .line 262
    :cond_14
    if-ne v1, v13, :cond_15

    .line 263
    .line 264
    aget-char v4, v15, v3

    .line 265
    .line 266
    if-ge v4, v2, :cond_15

    .line 267
    .line 268
    add-int/lit8 v5, v3, 0x1

    .line 269
    .line 270
    aget-char v5, v15, v5

    .line 271
    .line 272
    if-ge v5, v2, :cond_15

    .line 273
    .line 274
    invoke-static {v4, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子世兰苏哲楪(CC)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    goto :goto_9

    .line 279
    :cond_15
    iget-object v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏楪兰:Ljava/lang/String;

    .line 280
    .line 281
    if-eqz v2, :cond_17

    .line 282
    .line 283
    sget v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:I

    .line 284
    .line 285
    const/16 v6, 0x8

    .line 286
    .line 287
    if-gt v4, v6, :cond_16

    .line 288
    .line 289
    sget-boolean v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲世苏兰:Z

    .line 290
    .line 291
    if-eqz v4, :cond_17

    .line 292
    .line 293
    :cond_16
    invoke-virtual {v2, v3, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    goto :goto_9

    .line 298
    :cond_17
    new-instance v2, Ljava/lang/String;

    .line 299
    .line 300
    invoke-direct {v2, v15, v3, v1}, Ljava/lang/String;-><init>([CII)V

    .line 301
    .line 302
    .line 303
    move-object v1, v2

    .line 304
    :goto_9
    iget-object v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 305
    .line 306
    iget-wide v2, v2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 307
    .line 308
    const-wide/32 v4, 0x8004000

    .line 309
    .line 310
    .line 311
    and-long/2addr v4, v2

    .line 312
    cmp-long v4, v4, v20

    .line 313
    .line 314
    if-eqz v4, :cond_18

    .line 315
    .line 316
    invoke-static {v2, v3, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世兰哲子(JLjava/lang/String;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    :cond_18
    add-int/lit8 v2, v10, 0x1

    .line 321
    .line 322
    const/16 v3, 0x1a

    .line 323
    .line 324
    if-ne v2, v7, :cond_19

    .line 325
    .line 326
    move v10, v2

    .line 327
    :goto_a
    move v2, v3

    .line 328
    goto :goto_b

    .line 329
    :cond_19
    add-int/2addr v10, v13

    .line 330
    aget-char v2, v15, v2

    .line 331
    .line 332
    :goto_b
    const-wide v4, 0x100003700L

    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    const-wide/16 v8, 0x1

    .line 338
    .line 339
    const/16 v6, 0x20

    .line 340
    .line 341
    if-gt v2, v6, :cond_1b

    .line 342
    .line 343
    shl-long v11, v8, v2

    .line 344
    .line 345
    and-long/2addr v11, v4

    .line 346
    cmp-long v11, v11, v20

    .line 347
    .line 348
    if-eqz v11, :cond_1b

    .line 349
    .line 350
    if-ne v10, v7, :cond_1a

    .line 351
    .line 352
    goto :goto_a

    .line 353
    :cond_1a
    add-int/lit8 v2, v10, 0x1

    .line 354
    .line 355
    aget-char v4, v15, v10

    .line 356
    .line 357
    move v10, v2

    .line 358
    move v2, v4

    .line 359
    goto :goto_b

    .line 360
    :cond_1b
    const/16 v11, 0x2c

    .line 361
    .line 362
    if-ne v2, v11, :cond_1c

    .line 363
    .line 364
    goto :goto_c

    .line 365
    :cond_1c
    const/4 v14, 0x0

    .line 366
    :goto_c
    iput-boolean v14, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 367
    .line 368
    if-eqz v14, :cond_1f

    .line 369
    .line 370
    if-ne v10, v7, :cond_1d

    .line 371
    .line 372
    move v2, v10

    .line 373
    move v10, v3

    .line 374
    goto :goto_d

    .line 375
    :cond_1d
    add-int/lit8 v2, v10, 0x1

    .line 376
    .line 377
    aget-char v10, v15, v10

    .line 378
    .line 379
    :goto_d
    move/from16 v24, v10

    .line 380
    .line 381
    move v10, v2

    .line 382
    move/from16 v2, v24

    .line 383
    .line 384
    :goto_e
    if-gt v2, v6, :cond_1f

    .line 385
    .line 386
    shl-long v11, v8, v2

    .line 387
    .line 388
    and-long/2addr v11, v4

    .line 389
    cmp-long v11, v11, v20

    .line 390
    .line 391
    if-eqz v11, :cond_1f

    .line 392
    .line 393
    if-ne v10, v7, :cond_1e

    .line 394
    .line 395
    move v2, v3

    .line 396
    goto :goto_e

    .line 397
    :cond_1e
    add-int/lit8 v2, v10, 0x1

    .line 398
    .line 399
    aget-char v10, v15, v10

    .line 400
    .line 401
    goto :goto_d

    .line 402
    :cond_1f
    int-to-char v2, v2

    .line 403
    iput-char v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 404
    .line 405
    iput v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 406
    .line 407
    return-object v1

    .line 408
    :cond_20
    const/16 v6, 0x8

    .line 409
    .line 410
    add-int/lit8 v10, v10, 0x1

    .line 411
    .line 412
    :goto_f
    add-int/lit8 v11, v11, 0x1

    .line 413
    .line 414
    move v14, v6

    .line 415
    const/16 v4, 0x22

    .line 416
    .line 417
    goto/16 :goto_4

    .line 418
    .line 419
    :cond_21
    const-string v1, "invalid escape character EOI"

    .line 420
    .line 421
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONException;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    throw v0
.end method

.method public final 飘花落叶言楪世兰子哲苏()Ljava/lang/String;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 4
    .line 5
    const/16 v2, 0x2f

    .line 6
    .line 7
    if-ne v1, v2, :cond_9

    .line 8
    .line 9
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 10
    .line 11
    move v3, v1

    .line 12
    :goto_0
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 13
    .line 14
    iget-object v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 15
    .line 16
    if-ge v3, v4, :cond_1

    .line 17
    .line 18
    aget-char v6, v5, v3

    .line 19
    .line 20
    if-ne v6, v2, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    :goto_1
    new-instance v2, Ljava/lang/String;

    .line 27
    .line 28
    sub-int v6, v3, v1

    .line 29
    .line 30
    invoke-direct {v2, v5, v1, v6}, Ljava/lang/String;-><init>([CII)V

    .line 31
    .line 32
    .line 33
    add-int/lit8 v1, v3, 0x1

    .line 34
    .line 35
    const/16 v6, 0x1a

    .line 36
    .line 37
    if-ne v1, v4, :cond_2

    .line 38
    .line 39
    move v3, v1

    .line 40
    :goto_2
    move v1, v6

    .line 41
    goto :goto_3

    .line 42
    :cond_2
    add-int/lit8 v3, v3, 0x2

    .line 43
    .line 44
    aget-char v1, v5, v1

    .line 45
    .line 46
    :goto_3
    const-wide/16 v7, 0x0

    .line 47
    .line 48
    const-wide v9, 0x100003700L

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    const-wide/16 v11, 0x1

    .line 54
    .line 55
    const/16 v13, 0x20

    .line 56
    .line 57
    if-gt v1, v13, :cond_4

    .line 58
    .line 59
    shl-long v14, v11, v1

    .line 60
    .line 61
    and-long/2addr v14, v9

    .line 62
    cmp-long v14, v14, v7

    .line 63
    .line 64
    if-eqz v14, :cond_4

    .line 65
    .line 66
    if-ne v3, v4, :cond_3

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    add-int/lit8 v1, v3, 0x1

    .line 70
    .line 71
    aget-char v3, v5, v3

    .line 72
    .line 73
    move/from16 v16, v3

    .line 74
    .line 75
    move v3, v1

    .line 76
    move/from16 v1, v16

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_4
    const/16 v14, 0x2c

    .line 80
    .line 81
    if-ne v1, v14, :cond_5

    .line 82
    .line 83
    const/4 v14, 0x1

    .line 84
    goto :goto_4

    .line 85
    :cond_5
    const/4 v14, 0x0

    .line 86
    :goto_4
    iput-boolean v14, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 87
    .line 88
    if-eqz v14, :cond_8

    .line 89
    .line 90
    if-ne v3, v4, :cond_6

    .line 91
    .line 92
    move v1, v3

    .line 93
    move v3, v6

    .line 94
    goto :goto_5

    .line 95
    :cond_6
    add-int/lit8 v1, v3, 0x1

    .line 96
    .line 97
    aget-char v3, v5, v3

    .line 98
    .line 99
    :goto_5
    move/from16 v16, v3

    .line 100
    .line 101
    move v3, v1

    .line 102
    move/from16 v1, v16

    .line 103
    .line 104
    :goto_6
    if-gt v1, v13, :cond_8

    .line 105
    .line 106
    shl-long v14, v11, v1

    .line 107
    .line 108
    and-long/2addr v14, v9

    .line 109
    cmp-long v14, v14, v7

    .line 110
    .line 111
    if-eqz v14, :cond_8

    .line 112
    .line 113
    if-ne v3, v4, :cond_7

    .line 114
    .line 115
    move v1, v6

    .line 116
    goto :goto_6

    .line 117
    :cond_7
    add-int/lit8 v1, v3, 0x1

    .line 118
    .line 119
    aget-char v3, v5, v3

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_8
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 123
    .line 124
    iput-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 125
    .line 126
    return-object v2

    .line 127
    :cond_9
    const-string v0, "illegal pattern"

    .line 128
    .line 129
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    const/4 v0, 0x0

    .line 133
    return-object v0
.end method

.method public final 飘花落叶言楪世兰子苏哲()Ljava/time/OffsetTime;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 4
    .line 5
    iget-char v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 6
    .line 7
    const/16 v3, 0x22

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "illegal offsetTime"

    .line 11
    .line 12
    if-eq v2, v3, :cond_0

    .line 13
    .line 14
    const/16 v3, 0x27

    .line 15
    .line 16
    if-ne v2, v3, :cond_c

    .line 17
    .line 18
    :cond_0
    iget-object v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    add-int/lit8 v3, v1, 0x8

    .line 24
    .line 25
    iget-object v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 26
    .line 27
    array-length v7, v6

    .line 28
    if-ge v3, v7, :cond_c

    .line 29
    .line 30
    iget v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 31
    .line 32
    if-ge v3, v7, :cond_c

    .line 33
    .line 34
    add-int/lit8 v8, v1, 0x2

    .line 35
    .line 36
    aget-char v8, v6, v8

    .line 37
    .line 38
    const/16 v9, 0x3a

    .line 39
    .line 40
    if-ne v8, v9, :cond_c

    .line 41
    .line 42
    add-int/lit8 v8, v1, 0x5

    .line 43
    .line 44
    aget-char v8, v6, v8

    .line 45
    .line 46
    if-ne v8, v9, :cond_c

    .line 47
    .line 48
    aget-char v8, v6, v1

    .line 49
    .line 50
    add-int/lit8 v9, v1, 0x1

    .line 51
    .line 52
    aget-char v9, v6, v9

    .line 53
    .line 54
    add-int/lit8 v10, v1, 0x3

    .line 55
    .line 56
    aget-char v10, v6, v10

    .line 57
    .line 58
    add-int/lit8 v11, v1, 0x4

    .line 59
    .line 60
    aget-char v11, v6, v11

    .line 61
    .line 62
    add-int/lit8 v12, v1, 0x6

    .line 63
    .line 64
    aget-char v12, v6, v12

    .line 65
    .line 66
    add-int/lit8 v13, v1, 0x7

    .line 67
    .line 68
    aget-char v13, v6, v13

    .line 69
    .line 70
    const/16 v14, 0x30

    .line 71
    .line 72
    if-lt v8, v14, :cond_b

    .line 73
    .line 74
    const/16 v15, 0x39

    .line 75
    .line 76
    if-gt v8, v15, :cond_b

    .line 77
    .line 78
    if-lt v9, v14, :cond_b

    .line 79
    .line 80
    if-gt v9, v15, :cond_b

    .line 81
    .line 82
    sub-int/2addr v8, v14

    .line 83
    mul-int/lit8 v8, v8, 0xa

    .line 84
    .line 85
    sub-int/2addr v9, v14

    .line 86
    add-int/2addr v9, v8

    .line 87
    if-lt v10, v14, :cond_a

    .line 88
    .line 89
    if-gt v10, v15, :cond_a

    .line 90
    .line 91
    if-lt v11, v14, :cond_a

    .line 92
    .line 93
    if-gt v11, v15, :cond_a

    .line 94
    .line 95
    sub-int/2addr v10, v14

    .line 96
    mul-int/lit8 v10, v10, 0xa

    .line 97
    .line 98
    sub-int/2addr v11, v14

    .line 99
    add-int/2addr v11, v10

    .line 100
    if-lt v12, v14, :cond_9

    .line 101
    .line 102
    if-gt v12, v15, :cond_9

    .line 103
    .line 104
    if-lt v13, v14, :cond_9

    .line 105
    .line 106
    if-gt v13, v15, :cond_9

    .line 107
    .line 108
    sub-int/2addr v12, v14

    .line 109
    mul-int/lit8 v12, v12, 0xa

    .line 110
    .line 111
    sub-int/2addr v13, v14

    .line 112
    add-int/2addr v13, v12

    .line 113
    add-int/lit8 v4, v1, 0x19

    .line 114
    .line 115
    const/4 v5, -0x1

    .line 116
    move v8, v3

    .line 117
    move v10, v5

    .line 118
    :goto_0
    const/4 v12, 0x0

    .line 119
    const/4 v14, 0x1

    .line 120
    if-ge v8, v4, :cond_4

    .line 121
    .line 122
    if-ge v8, v7, :cond_4

    .line 123
    .line 124
    array-length v15, v6

    .line 125
    if-ge v8, v15, :cond_4

    .line 126
    .line 127
    aget-char v15, v6, v8

    .line 128
    .line 129
    if-ne v10, v5, :cond_2

    .line 130
    .line 131
    const/16 v5, 0x5a

    .line 132
    .line 133
    if-eq v15, v5, :cond_1

    .line 134
    .line 135
    const/16 v5, 0x2b

    .line 136
    .line 137
    if-eq v15, v5, :cond_1

    .line 138
    .line 139
    const/16 v5, 0x2d

    .line 140
    .line 141
    if-ne v15, v5, :cond_2

    .line 142
    .line 143
    :cond_1
    sub-int v5, v8, v3

    .line 144
    .line 145
    add-int/lit8 v10, v5, -0x1

    .line 146
    .line 147
    :cond_2
    if-ne v15, v2, :cond_3

    .line 148
    .line 149
    sub-int/2addr v8, v1

    .line 150
    goto :goto_1

    .line 151
    :cond_3
    add-int/lit8 v8, v8, 0x1

    .line 152
    .line 153
    const/4 v5, -0x1

    .line 154
    goto :goto_0

    .line 155
    :cond_4
    move v8, v12

    .line 156
    :goto_1
    if-gtz v10, :cond_5

    .line 157
    .line 158
    move v2, v12

    .line 159
    goto :goto_2

    .line 160
    :cond_5
    add-int/lit8 v2, v1, 0x9

    .line 161
    .line 162
    invoke-static {v10, v2, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏哲楪兰世(II[C)I

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    :goto_2
    add-int/lit8 v3, v8, -0x9

    .line 167
    .line 168
    sub-int/2addr v3, v10

    .line 169
    if-gt v3, v14, :cond_6

    .line 170
    .line 171
    sget-object v1, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_6
    new-instance v4, Ljava/lang/String;

    .line 175
    .line 176
    add-int/lit8 v1, v1, 0x9

    .line 177
    .line 178
    add-int/2addr v1, v10

    .line 179
    invoke-direct {v4, v6, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 180
    .line 181
    .line 182
    invoke-static {v4}, Ljava/time/ZoneOffset;->of(Ljava/lang/String;)Ljava/time/ZoneOffset;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    :goto_3
    invoke-static {v9, v11, v13, v2}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    invoke-static {v2, v1}, Ljava/time/OffsetTime;->of(Ljava/time/LocalTime;Ljava/time/ZoneOffset;)Ljava/time/OffsetTime;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 195
    .line 196
    add-int/2addr v8, v14

    .line 197
    add-int/2addr v8, v2

    .line 198
    iput v8, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 199
    .line 200
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 201
    .line 202
    .line 203
    iget-char v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 204
    .line 205
    const/16 v3, 0x2c

    .line 206
    .line 207
    if-ne v2, v3, :cond_7

    .line 208
    .line 209
    move v12, v14

    .line 210
    :cond_7
    iput-boolean v12, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 211
    .line 212
    if-eqz v12, :cond_8

    .line 213
    .line 214
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 215
    .line 216
    .line 217
    :cond_8
    return-object v1

    .line 218
    :cond_9
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    return-object v4

    .line 226
    :cond_a
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    return-object v4

    .line 234
    :cond_b
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    return-object v4

    .line 242
    :cond_c
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    return-object v4
.end method

.method public final 飘花落叶言楪世兰苏子哲()Ljava/lang/String;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰苏哲楪:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 7
    .line 8
    if-ne v1, v3, :cond_0

    .line 9
    .line 10
    return-object v2

    .line 11
    :cond_0
    add-int/lit8 v4, v1, 0x1

    .line 12
    .line 13
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 14
    .line 15
    iget-object v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 16
    .line 17
    aget-char v1, v4, v1

    .line 18
    .line 19
    iput-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-char v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 26
    .line 27
    iget v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 28
    .line 29
    :goto_0
    const-wide/16 v7, 0x0

    .line 30
    .line 31
    const-wide v9, 0x100003700L

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    const-wide/16 v11, 0x1

    .line 37
    .line 38
    const/16 v13, 0x20

    .line 39
    .line 40
    const/16 v14, 0x1a

    .line 41
    .line 42
    if-gt v5, v13, :cond_2

    .line 43
    .line 44
    shl-long v15, v11, v5

    .line 45
    .line 46
    and-long/2addr v15, v9

    .line 47
    cmp-long v15, v15, v7

    .line 48
    .line 49
    if-eqz v15, :cond_2

    .line 50
    .line 51
    if-ne v6, v3, :cond_1

    .line 52
    .line 53
    move v5, v14

    .line 54
    goto :goto_0

    .line 55
    :cond_1
    add-int/lit8 v5, v6, 0x1

    .line 56
    .line 57
    aget-char v6, v4, v6

    .line 58
    .line 59
    move/from16 v17, v6

    .line 60
    .line 61
    move v6, v5

    .line 62
    move/from16 v5, v17

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    const/16 v15, 0x7d

    .line 66
    .line 67
    if-ne v5, v15, :cond_a

    .line 68
    .line 69
    if-ne v6, v3, :cond_3

    .line 70
    .line 71
    :goto_1
    move v5, v14

    .line 72
    goto :goto_3

    .line 73
    :cond_3
    add-int/lit8 v2, v6, 0x1

    .line 74
    .line 75
    aget-char v5, v4, v6

    .line 76
    .line 77
    :goto_2
    move v6, v2

    .line 78
    :goto_3
    if-gt v5, v13, :cond_5

    .line 79
    .line 80
    shl-long v15, v11, v5

    .line 81
    .line 82
    and-long/2addr v15, v9

    .line 83
    cmp-long v2, v15, v7

    .line 84
    .line 85
    if-eqz v2, :cond_5

    .line 86
    .line 87
    if-ne v6, v3, :cond_4

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    add-int/lit8 v2, v6, 0x1

    .line 91
    .line 92
    aget-char v5, v4, v6

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_5
    const/16 v2, 0x2c

    .line 96
    .line 97
    if-ne v5, v2, :cond_6

    .line 98
    .line 99
    const/4 v2, 0x1

    .line 100
    goto :goto_4

    .line 101
    :cond_6
    const/4 v2, 0x0

    .line 102
    :goto_4
    iput-boolean v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 103
    .line 104
    if-eqz v2, :cond_9

    .line 105
    .line 106
    if-ne v6, v3, :cond_7

    .line 107
    .line 108
    :goto_5
    move v5, v14

    .line 109
    goto :goto_7

    .line 110
    :cond_7
    add-int/lit8 v2, v6, 0x1

    .line 111
    .line 112
    aget-char v5, v4, v6

    .line 113
    .line 114
    :goto_6
    move v6, v2

    .line 115
    :goto_7
    if-gt v5, v13, :cond_9

    .line 116
    .line 117
    shl-long v15, v11, v5

    .line 118
    .line 119
    and-long/2addr v15, v9

    .line 120
    cmp-long v2, v15, v7

    .line 121
    .line 122
    if-eqz v2, :cond_9

    .line 123
    .line 124
    if-ne v6, v3, :cond_8

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_8
    add-int/lit8 v2, v6, 0x1

    .line 128
    .line 129
    aget-char v5, v4, v6

    .line 130
    .line 131
    goto :goto_6

    .line 132
    :cond_9
    iput-char v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 133
    .line 134
    iput v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 135
    .line 136
    return-object v1

    .line 137
    :cond_a
    const-string v0, "illegal reference : "

    .line 138
    .line 139
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    return-object v2
.end method

.method public final 飘花落叶言楪世哲兰苏子()Ljava/time/OffsetDateTime;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 4
    .line 5
    iget-char v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 6
    .line 7
    const/16 v3, 0x22

    .line 8
    .line 9
    if-eq v2, v3, :cond_0

    .line 10
    .line 11
    const/16 v4, 0x27

    .line 12
    .line 13
    if-ne v2, v4, :cond_14

    .line 14
    .line 15
    :cond_0
    iget-object v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    add-int/lit8 v4, v1, 0x13

    .line 21
    .line 22
    iget-object v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 23
    .line 24
    array-length v6, v5

    .line 25
    if-ge v4, v6, :cond_14

    .line 26
    .line 27
    iget v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 28
    .line 29
    if-ge v4, v6, :cond_14

    .line 30
    .line 31
    add-int/lit8 v7, v1, 0x4

    .line 32
    .line 33
    aget-char v7, v5, v7

    .line 34
    .line 35
    const/16 v8, 0x2d

    .line 36
    .line 37
    if-ne v7, v8, :cond_14

    .line 38
    .line 39
    add-int/lit8 v7, v1, 0x7

    .line 40
    .line 41
    aget-char v7, v5, v7

    .line 42
    .line 43
    if-ne v7, v8, :cond_14

    .line 44
    .line 45
    add-int/lit8 v7, v1, 0xa

    .line 46
    .line 47
    aget-char v7, v5, v7

    .line 48
    .line 49
    const/16 v8, 0x20

    .line 50
    .line 51
    if-eq v7, v8, :cond_1

    .line 52
    .line 53
    const/16 v9, 0x54

    .line 54
    .line 55
    if-ne v7, v9, :cond_14

    .line 56
    .line 57
    :cond_1
    add-int/lit8 v7, v1, 0xd

    .line 58
    .line 59
    aget-char v7, v5, v7

    .line 60
    .line 61
    const/16 v9, 0x3a

    .line 62
    .line 63
    if-ne v7, v9, :cond_14

    .line 64
    .line 65
    add-int/lit8 v7, v1, 0x10

    .line 66
    .line 67
    aget-char v7, v5, v7

    .line 68
    .line 69
    if-ne v7, v9, :cond_14

    .line 70
    .line 71
    invoke-static {v1, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    add-int/lit8 v7, v1, 0x5

    .line 76
    .line 77
    invoke-static {v7, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 78
    .line 79
    .line 80
    move-result v11

    .line 81
    add-int/lit8 v7, v1, 0x8

    .line 82
    .line 83
    invoke-static {v7, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 84
    .line 85
    .line 86
    move-result v12

    .line 87
    add-int/lit8 v7, v1, 0xb

    .line 88
    .line 89
    invoke-static {v7, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 90
    .line 91
    .line 92
    move-result v13

    .line 93
    add-int/lit8 v7, v1, 0xe

    .line 94
    .line 95
    invoke-static {v7, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 96
    .line 97
    .line 98
    move-result v14

    .line 99
    add-int/lit8 v7, v1, 0x11

    .line 100
    .line 101
    invoke-static {v7, v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 102
    .line 103
    .line 104
    move-result v15

    .line 105
    or-int v7, v10, v11

    .line 106
    .line 107
    or-int/2addr v7, v12

    .line 108
    or-int/2addr v7, v14

    .line 109
    or-int/2addr v7, v15

    .line 110
    if-gez v7, :cond_3

    .line 111
    .line 112
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子兰世哲()Ljava/time/ZonedDateTime;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    if-nez v0, :cond_2

    .line 117
    .line 118
    goto/16 :goto_b

    .line 119
    .line 120
    :cond_2
    invoke-virtual {v0}, Ljava/time/ZonedDateTime;->toOffsetDateTime()Ljava/time/OffsetDateTime;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    return-object v0

    .line 125
    :cond_3
    add-int/lit8 v7, v1, 0x14

    .line 126
    .line 127
    aget-char v4, v5, v4

    .line 128
    .line 129
    const/16 v9, 0x2e

    .line 130
    .line 131
    const/16 v16, 0x0

    .line 132
    .line 133
    if-ne v4, v9, :cond_4

    .line 134
    .line 135
    add-int/lit8 v1, v1, 0x15

    .line 136
    .line 137
    aget-char v4, v5, v7

    .line 138
    .line 139
    move v7, v1

    .line 140
    :cond_4
    move/from16 v1, v16

    .line 141
    .line 142
    move v9, v1

    .line 143
    :goto_0
    const/16 v8, 0x30

    .line 144
    .line 145
    if-lt v4, v8, :cond_5

    .line 146
    .line 147
    const/16 v8, 0x39

    .line 148
    .line 149
    if-gt v4, v8, :cond_5

    .line 150
    .line 151
    mul-int/lit8 v1, v1, 0xa

    .line 152
    .line 153
    add-int/lit8 v8, v4, -0x30

    .line 154
    .line 155
    add-int/2addr v1, v8

    .line 156
    add-int/lit8 v9, v9, 0x1

    .line 157
    .line 158
    if-ge v7, v6, :cond_5

    .line 159
    .line 160
    add-int/lit8 v4, v7, 0x1

    .line 161
    .line 162
    aget-char v7, v5, v7

    .line 163
    .line 164
    move/from16 v28, v7

    .line 165
    .line 166
    move v7, v4

    .line 167
    move/from16 v4, v28

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_5
    if-eqz v9, :cond_6

    .line 171
    .line 172
    sget-object v8, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲:[I

    .line 173
    .line 174
    rsub-int/lit8 v9, v9, 0x9

    .line 175
    .line 176
    and-int/lit8 v9, v9, 0xf

    .line 177
    .line 178
    aget v8, v8, v9

    .line 179
    .line 180
    mul-int/2addr v1, v8

    .line 181
    :cond_6
    sget-object v8, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 182
    .line 183
    const/16 v9, 0x5a

    .line 184
    .line 185
    const/16 v18, 0x1

    .line 186
    .line 187
    if-ne v4, v9, :cond_7

    .line 188
    .line 189
    add-int/lit8 v3, v7, 0x1

    .line 190
    .line 191
    aget-char v4, v5, v7

    .line 192
    .line 193
    move/from16 v21, v1

    .line 194
    .line 195
    move v7, v3

    .line 196
    goto :goto_4

    .line 197
    :cond_7
    if-eq v4, v2, :cond_a

    .line 198
    .line 199
    move v9, v7

    .line 200
    :goto_1
    if-ge v9, v6, :cond_9

    .line 201
    .line 202
    aget-char v3, v5, v9

    .line 203
    .line 204
    move/from16 v21, v1

    .line 205
    .line 206
    const/16 v1, 0x22

    .line 207
    .line 208
    if-ne v3, v1, :cond_8

    .line 209
    .line 210
    :goto_2
    const/4 v1, -0x1

    .line 211
    goto :goto_3

    .line 212
    :cond_8
    add-int/lit8 v9, v9, 0x1

    .line 213
    .line 214
    move/from16 v1, v21

    .line 215
    .line 216
    goto :goto_1

    .line 217
    :cond_9
    move/from16 v21, v1

    .line 218
    .line 219
    const/4 v9, -0x1

    .line 220
    goto :goto_2

    .line 221
    :goto_3
    if-eq v9, v1, :cond_b

    .line 222
    .line 223
    add-int/lit8 v1, v7, -0x1

    .line 224
    .line 225
    sub-int v3, v9, v7

    .line 226
    .line 227
    add-int/lit8 v3, v3, 0x1

    .line 228
    .line 229
    sget-object v4, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 230
    .line 231
    new-instance v4, Ljava/lang/String;

    .line 232
    .line 233
    invoke-direct {v4, v5, v1, v3}, Ljava/lang/String;-><init>([CII)V

    .line 234
    .line 235
    .line 236
    invoke-static {v4}, Ljava/time/ZoneOffset;->of(Ljava/lang/String;)Ljava/time/ZoneOffset;

    .line 237
    .line 238
    .line 239
    move-result-object v8

    .line 240
    add-int/lit8 v7, v9, 0x1

    .line 241
    .line 242
    move v4, v2

    .line 243
    goto :goto_4

    .line 244
    :cond_a
    move/from16 v21, v1

    .line 245
    .line 246
    :cond_b
    :goto_4
    if-ne v4, v2, :cond_14

    .line 247
    .line 248
    const/16 v1, 0x1a

    .line 249
    .line 250
    if-lt v7, v6, :cond_c

    .line 251
    .line 252
    move v3, v1

    .line 253
    goto :goto_5

    .line 254
    :cond_c
    add-int/lit8 v2, v7, 0x1

    .line 255
    .line 256
    aget-char v3, v5, v7

    .line 257
    .line 258
    move v7, v2

    .line 259
    :goto_5
    if-eqz v3, :cond_d

    .line 260
    .line 261
    const-wide/16 v19, 0x0

    .line 262
    .line 263
    const-wide v22, 0x100003700L

    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    const-wide/16 v24, 0x1

    .line 269
    .line 270
    const/16 v2, 0x20

    .line 271
    .line 272
    if-gt v3, v2, :cond_e

    .line 273
    .line 274
    shl-long v26, v24, v3

    .line 275
    .line 276
    and-long v26, v26, v22

    .line 277
    .line 278
    cmp-long v2, v26, v19

    .line 279
    .line 280
    if-eqz v2, :cond_e

    .line 281
    .line 282
    :cond_d
    move-object/from16 v17, v8

    .line 283
    .line 284
    const/16 v2, 0x20

    .line 285
    .line 286
    goto :goto_9

    .line 287
    :cond_e
    const/16 v2, 0x2c

    .line 288
    .line 289
    if-ne v3, v2, :cond_f

    .line 290
    .line 291
    move/from16 v2, v18

    .line 292
    .line 293
    goto :goto_6

    .line 294
    :cond_f
    move/from16 v2, v16

    .line 295
    .line 296
    :goto_6
    iput-boolean v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 297
    .line 298
    if-eqz v2, :cond_12

    .line 299
    .line 300
    if-ne v7, v6, :cond_10

    .line 301
    .line 302
    move v3, v1

    .line 303
    goto :goto_7

    .line 304
    :cond_10
    add-int/lit8 v2, v7, 0x1

    .line 305
    .line 306
    aget-char v3, v5, v7

    .line 307
    .line 308
    move v7, v2

    .line 309
    :goto_7
    const/16 v2, 0x20

    .line 310
    .line 311
    :goto_8
    if-gt v3, v2, :cond_12

    .line 312
    .line 313
    shl-long v16, v24, v3

    .line 314
    .line 315
    and-long v16, v16, v22

    .line 316
    .line 317
    cmp-long v4, v16, v19

    .line 318
    .line 319
    if-eqz v4, :cond_12

    .line 320
    .line 321
    if-ne v7, v6, :cond_11

    .line 322
    .line 323
    move v3, v1

    .line 324
    goto :goto_8

    .line 325
    :cond_11
    add-int/lit8 v3, v7, 0x1

    .line 326
    .line 327
    aget-char v4, v5, v7

    .line 328
    .line 329
    move v7, v3

    .line 330
    move v3, v4

    .line 331
    goto :goto_8

    .line 332
    :cond_12
    iput v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 333
    .line 334
    iput-char v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 335
    .line 336
    move-object/from16 v17, v8

    .line 337
    .line 338
    move/from16 v16, v21

    .line 339
    .line 340
    invoke-static/range {v10 .. v17}, Ljava/time/OffsetDateTime;->of(IIIIIIILjava/time/ZoneOffset;)Ljava/time/OffsetDateTime;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    return-object v0

    .line 345
    :goto_9
    if-ne v7, v6, :cond_13

    .line 346
    .line 347
    move v3, v1

    .line 348
    goto :goto_a

    .line 349
    :cond_13
    add-int/lit8 v3, v7, 0x1

    .line 350
    .line 351
    aget-char v4, v5, v7

    .line 352
    .line 353
    move v7, v3

    .line 354
    move v3, v4

    .line 355
    :goto_a
    move-object/from16 v8, v17

    .line 356
    .line 357
    goto :goto_5

    .line 358
    :cond_14
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子兰世哲()Ljava/time/ZonedDateTime;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    if-nez v0, :cond_15

    .line 363
    .line 364
    :goto_b
    const/4 v0, 0x0

    .line 365
    return-object v0

    .line 366
    :cond_15
    invoke-virtual {v0}, Ljava/time/ZonedDateTime;->toOffsetDateTime()Ljava/time/OffsetDateTime;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    return-object v0
.end method

.method public final 飘花落叶言楪世哲子苏兰()Ljava/util/Date;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x2

    .line 6
    .line 7
    const-wide v5, 0x100003700L

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    const-wide/16 v7, 0x1

    .line 13
    .line 14
    const/16 v9, 0x20

    .line 15
    .line 16
    const/16 v10, 0x1a

    .line 17
    .line 18
    const/4 v11, 0x0

    .line 19
    iget-object v12, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 20
    .line 21
    iget v13, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 22
    .line 23
    if-ge v2, v13, :cond_1

    .line 24
    .line 25
    aget-char v14, v12, v1

    .line 26
    .line 27
    const/16 v15, 0x75

    .line 28
    .line 29
    if-ne v14, v15, :cond_1

    .line 30
    .line 31
    add-int/lit8 v14, v1, 0x1

    .line 32
    .line 33
    aget-char v14, v12, v14

    .line 34
    .line 35
    const/16 v15, 0x6c

    .line 36
    .line 37
    if-ne v14, v15, :cond_1

    .line 38
    .line 39
    aget-char v14, v12, v2

    .line 40
    .line 41
    if-ne v14, v15, :cond_1

    .line 42
    .line 43
    add-int/lit8 v2, v1, 0x3

    .line 44
    .line 45
    if-ne v2, v13, :cond_0

    .line 46
    .line 47
    move v2, v10

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    aget-char v2, v12, v2

    .line 50
    .line 51
    :goto_0
    add-int/lit8 v1, v1, 0x4

    .line 52
    .line 53
    const-wide/16 v16, 0x0

    .line 54
    .line 55
    goto/16 :goto_7

    .line 56
    .line 57
    :cond_1
    add-int/lit8 v14, v1, 0x1

    .line 58
    .line 59
    if-ge v14, v13, :cond_14

    .line 60
    .line 61
    aget-char v15, v12, v1

    .line 62
    .line 63
    const-wide/16 v16, 0x0

    .line 64
    .line 65
    const/16 v3, 0x65

    .line 66
    .line 67
    if-ne v15, v3, :cond_14

    .line 68
    .line 69
    aget-char v4, v12, v14

    .line 70
    .line 71
    const/16 v14, 0x77

    .line 72
    .line 73
    if-ne v4, v14, :cond_14

    .line 74
    .line 75
    add-int/lit8 v1, v1, 0x3

    .line 76
    .line 77
    if-ne v1, v13, :cond_2

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    aget-char v2, v12, v2

    .line 81
    .line 82
    :goto_1
    if-gt v2, v9, :cond_4

    .line 83
    .line 84
    shl-long v14, v7, v2

    .line 85
    .line 86
    and-long/2addr v14, v5

    .line 87
    cmp-long v4, v14, v16

    .line 88
    .line 89
    if-eqz v4, :cond_4

    .line 90
    .line 91
    if-lt v1, v13, :cond_3

    .line 92
    .line 93
    :goto_2
    move v2, v10

    .line 94
    goto :goto_1

    .line 95
    :cond_3
    add-int/lit8 v2, v1, 0x1

    .line 96
    .line 97
    aget-char v1, v12, v1

    .line 98
    .line 99
    move/from16 v18, v2

    .line 100
    .line 101
    move v2, v1

    .line 102
    move/from16 v1, v18

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    add-int/lit8 v4, v1, 0x4

    .line 106
    .line 107
    const-string v14, "json syntax error, not match new Date"

    .line 108
    .line 109
    if-ge v4, v13, :cond_13

    .line 110
    .line 111
    const/16 v15, 0x44

    .line 112
    .line 113
    if-ne v2, v15, :cond_13

    .line 114
    .line 115
    aget-char v2, v12, v1

    .line 116
    .line 117
    const/16 v15, 0x61

    .line 118
    .line 119
    if-ne v2, v15, :cond_13

    .line 120
    .line 121
    add-int/lit8 v2, v1, 0x1

    .line 122
    .line 123
    aget-char v2, v12, v2

    .line 124
    .line 125
    const/16 v15, 0x74

    .line 126
    .line 127
    if-ne v2, v15, :cond_13

    .line 128
    .line 129
    add-int/lit8 v2, v1, 0x2

    .line 130
    .line 131
    aget-char v2, v12, v2

    .line 132
    .line 133
    if-ne v2, v3, :cond_13

    .line 134
    .line 135
    add-int/lit8 v1, v1, 0x3

    .line 136
    .line 137
    if-ne v1, v13, :cond_5

    .line 138
    .line 139
    :goto_3
    move v1, v10

    .line 140
    goto :goto_4

    .line 141
    :cond_5
    aget-char v1, v12, v1

    .line 142
    .line 143
    :goto_4
    if-gt v1, v9, :cond_7

    .line 144
    .line 145
    shl-long v2, v7, v1

    .line 146
    .line 147
    and-long/2addr v2, v5

    .line 148
    cmp-long v2, v2, v16

    .line 149
    .line 150
    if-eqz v2, :cond_7

    .line 151
    .line 152
    if-ne v4, v13, :cond_6

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_6
    add-int/lit8 v1, v4, 0x1

    .line 156
    .line 157
    aget-char v2, v12, v4

    .line 158
    .line 159
    move v4, v1

    .line 160
    move v1, v2

    .line 161
    goto :goto_4

    .line 162
    :cond_7
    const/16 v2, 0x28

    .line 163
    .line 164
    if-ne v1, v2, :cond_12

    .line 165
    .line 166
    if-ge v4, v13, :cond_12

    .line 167
    .line 168
    add-int/lit8 v1, v4, 0x1

    .line 169
    .line 170
    aget-char v2, v12, v4

    .line 171
    .line 172
    :goto_5
    if-gt v2, v9, :cond_9

    .line 173
    .line 174
    shl-long v3, v7, v2

    .line 175
    .line 176
    and-long/2addr v3, v5

    .line 177
    cmp-long v3, v3, v16

    .line 178
    .line 179
    if-eqz v3, :cond_9

    .line 180
    .line 181
    if-ne v1, v13, :cond_8

    .line 182
    .line 183
    move v2, v10

    .line 184
    goto :goto_5

    .line 185
    :cond_8
    add-int/lit8 v2, v1, 0x1

    .line 186
    .line 187
    aget-char v1, v12, v1

    .line 188
    .line 189
    move/from16 v18, v2

    .line 190
    .line 191
    move v2, v1

    .line 192
    move/from16 v1, v18

    .line 193
    .line 194
    goto :goto_5

    .line 195
    :cond_9
    iput-char v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 196
    .line 197
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 198
    .line 199
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪子世兰苏哲()J

    .line 200
    .line 201
    .line 202
    move-result-wide v1

    .line 203
    iget-char v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 204
    .line 205
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 206
    .line 207
    const/16 v15, 0x29

    .line 208
    .line 209
    if-ne v3, v15, :cond_11

    .line 210
    .line 211
    if-ne v4, v13, :cond_a

    .line 212
    .line 213
    move v3, v4

    .line 214
    move v4, v10

    .line 215
    goto :goto_6

    .line 216
    :cond_a
    add-int/lit8 v3, v4, 0x1

    .line 217
    .line 218
    aget-char v4, v12, v4

    .line 219
    .line 220
    :goto_6
    new-instance v11, Ljava/util/Date;

    .line 221
    .line 222
    invoke-direct {v11, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 223
    .line 224
    .line 225
    move v1, v3

    .line 226
    move v2, v4

    .line 227
    :goto_7
    if-gt v2, v9, :cond_c

    .line 228
    .line 229
    shl-long v3, v7, v2

    .line 230
    .line 231
    and-long/2addr v3, v5

    .line 232
    cmp-long v3, v3, v16

    .line 233
    .line 234
    if-eqz v3, :cond_c

    .line 235
    .line 236
    if-ne v1, v13, :cond_b

    .line 237
    .line 238
    move v2, v10

    .line 239
    goto :goto_7

    .line 240
    :cond_b
    add-int/lit8 v2, v1, 0x1

    .line 241
    .line 242
    aget-char v1, v12, v1

    .line 243
    .line 244
    move/from16 v18, v2

    .line 245
    .line 246
    move v2, v1

    .line 247
    move/from16 v1, v18

    .line 248
    .line 249
    goto :goto_7

    .line 250
    :cond_c
    const/16 v3, 0x2c

    .line 251
    .line 252
    if-ne v2, v3, :cond_d

    .line 253
    .line 254
    const/4 v3, 0x1

    .line 255
    goto :goto_8

    .line 256
    :cond_d
    const/4 v3, 0x0

    .line 257
    :goto_8
    iput-boolean v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 258
    .line 259
    if-eqz v3, :cond_10

    .line 260
    .line 261
    if-ne v1, v13, :cond_e

    .line 262
    .line 263
    move v2, v1

    .line 264
    move v1, v10

    .line 265
    goto :goto_9

    .line 266
    :cond_e
    add-int/lit8 v2, v1, 0x1

    .line 267
    .line 268
    aget-char v1, v12, v1

    .line 269
    .line 270
    :goto_9
    move/from16 v18, v2

    .line 271
    .line 272
    move v2, v1

    .line 273
    move/from16 v1, v18

    .line 274
    .line 275
    :goto_a
    if-gt v2, v9, :cond_10

    .line 276
    .line 277
    shl-long v3, v7, v2

    .line 278
    .line 279
    and-long/2addr v3, v5

    .line 280
    cmp-long v3, v3, v16

    .line 281
    .line 282
    if-eqz v3, :cond_10

    .line 283
    .line 284
    if-ne v1, v13, :cond_f

    .line 285
    .line 286
    move v2, v10

    .line 287
    goto :goto_a

    .line 288
    :cond_f
    add-int/lit8 v2, v1, 0x1

    .line 289
    .line 290
    aget-char v1, v12, v1

    .line 291
    .line 292
    goto :goto_9

    .line 293
    :cond_10
    iput-char v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 294
    .line 295
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 296
    .line 297
    return-object v11

    .line 298
    :cond_11
    invoke-static {v4, v14}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    return-object v11

    .line 306
    :cond_12
    invoke-static {v4, v14}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    return-object v11

    .line 314
    :cond_13
    invoke-static {v1, v14}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    return-object v11

    .line 322
    :cond_14
    const-string v0, "json syntax error, not match null or new Date"

    .line 323
    .line 324
    invoke-static {v1, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    return-object v11
.end method

.method public final 飘花落叶言楪世哲苏子兰()V
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 5
    .line 6
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰哲苏:I

    .line 7
    .line 8
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪哲兰:I

    .line 9
    .line 10
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 11
    .line 12
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 13
    .line 14
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏兰哲:Z

    .line 15
    .line 16
    iput-short v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲兰苏:S

    .line 17
    .line 18
    iput-short v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰苏哲:S

    .line 19
    .line 20
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 21
    .line 22
    iget-char v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 23
    .line 24
    const/4 v4, 0x5

    .line 25
    const-wide/16 v9, 0x0

    .line 26
    .line 27
    const/16 v11, 0x20

    .line 28
    .line 29
    const/4 v12, 0x2

    .line 30
    const/4 v14, 0x1

    .line 31
    iget v15, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 32
    .line 33
    const-wide v16, 0x100003700L

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    iget-object v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 39
    .line 40
    const/16 v6, 0x22

    .line 41
    .line 42
    const-wide/16 v18, 0x1

    .line 43
    .line 44
    if-eq v3, v6, :cond_1

    .line 45
    .line 46
    const/16 v7, 0x27

    .line 47
    .line 48
    if-ne v3, v7, :cond_0

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    move v7, v1

    .line 52
    move v8, v2

    .line 53
    :goto_0
    move-wide/from16 v20, v9

    .line 54
    .line 55
    goto :goto_4

    .line 56
    :cond_1
    :goto_1
    add-int/lit8 v7, v2, 0x1

    .line 57
    .line 58
    aget-char v8, v5, v2

    .line 59
    .line 60
    if-ne v8, v3, :cond_5

    .line 61
    .line 62
    if-ne v7, v15, :cond_2

    .line 63
    .line 64
    :goto_2
    const/16 v1, 0x1a

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_2
    add-int/2addr v2, v12

    .line 68
    aget-char v1, v5, v7

    .line 69
    .line 70
    move v7, v2

    .line 71
    :goto_3
    if-gt v1, v11, :cond_4

    .line 72
    .line 73
    shl-long v2, v18, v1

    .line 74
    .line 75
    and-long v2, v2, v16

    .line 76
    .line 77
    cmp-long v2, v2, v9

    .line 78
    .line 79
    if-eqz v2, :cond_4

    .line 80
    .line 81
    if-ne v7, v15, :cond_3

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    add-int/lit8 v1, v7, 0x1

    .line 85
    .line 86
    aget-char v2, v5, v7

    .line 87
    .line 88
    move v7, v1

    .line 89
    move v1, v2

    .line 90
    goto :goto_3

    .line 91
    :cond_4
    iput-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 92
    .line 93
    iput v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 94
    .line 95
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子哲楪苏世兰()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 100
    .line 101
    iput-boolean v14, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 102
    .line 103
    iput-byte v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 104
    .line 105
    return-void

    .line 106
    :cond_5
    move/from16 v20, v7

    .line 107
    .line 108
    move v7, v3

    .line 109
    move v3, v8

    .line 110
    move/from16 v8, v20

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :goto_4
    const/16 v9, 0x2b

    .line 114
    .line 115
    const-string v10, "illegal input"

    .line 116
    .line 117
    const/16 v13, 0x2d

    .line 118
    .line 119
    if-ne v3, v13, :cond_7

    .line 120
    .line 121
    if-eq v8, v15, :cond_6

    .line 122
    .line 123
    iput-boolean v14, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏兰哲:Z

    .line 124
    .line 125
    add-int/lit8 v3, v8, 0x1

    .line 126
    .line 127
    aget-char v10, v5, v8

    .line 128
    .line 129
    goto :goto_6

    .line 130
    :cond_6
    invoke-virtual {v0, v10}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_7
    if-ne v3, v9, :cond_9

    .line 139
    .line 140
    if-eq v8, v15, :cond_8

    .line 141
    .line 142
    add-int/lit8 v3, v8, 0x1

    .line 143
    .line 144
    aget-char v10, v5, v8

    .line 145
    .line 146
    move/from16 v41, v10

    .line 147
    .line 148
    move v10, v3

    .line 149
    move/from16 v3, v41

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_8
    invoke-virtual {v0, v10}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    return-void

    .line 160
    :cond_9
    move v10, v8

    .line 161
    :goto_5
    move/from16 v41, v10

    .line 162
    .line 163
    move v10, v3

    .line 164
    move/from16 v3, v41

    .line 165
    .line 166
    :goto_6
    iput-byte v14, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 167
    .line 168
    move/from16 v22, v1

    .line 169
    .line 170
    move/from16 v23, v22

    .line 171
    .line 172
    move/from16 v24, v11

    .line 173
    .line 174
    :goto_7
    const/16 v11, 0x39

    .line 175
    .line 176
    const/16 v26, 0xa

    .line 177
    .line 178
    const/16 v6, 0x30

    .line 179
    .line 180
    const v1, -0xccccccc

    .line 181
    .line 182
    .line 183
    if-lt v10, v6, :cond_d

    .line 184
    .line 185
    if-gt v10, v11, :cond_d

    .line 186
    .line 187
    if-nez v22, :cond_b

    .line 188
    .line 189
    add-int/lit8 v10, v10, -0x30

    .line 190
    .line 191
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 192
    .line 193
    mul-int/lit8 v4, v4, 0xa

    .line 194
    .line 195
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 196
    .line 197
    if-ge v4, v1, :cond_a

    .line 198
    .line 199
    :goto_8
    move/from16 v22, v14

    .line 200
    .line 201
    goto :goto_9

    .line 202
    :cond_a
    sub-int/2addr v4, v10

    .line 203
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 204
    .line 205
    if-ge v4, v1, :cond_b

    .line 206
    .line 207
    goto :goto_8

    .line 208
    :cond_b
    :goto_9
    if-ne v3, v15, :cond_c

    .line 209
    .line 210
    add-int/lit8 v3, v3, 0x1

    .line 211
    .line 212
    move/from16 v23, v14

    .line 213
    .line 214
    const/16 v10, 0x1a

    .line 215
    .line 216
    goto :goto_a

    .line 217
    :cond_c
    add-int/lit8 v1, v3, 0x1

    .line 218
    .line 219
    aget-char v10, v5, v3

    .line 220
    .line 221
    move v3, v1

    .line 222
    move/from16 v23, v14

    .line 223
    .line 224
    const/4 v1, 0x0

    .line 225
    const/4 v4, 0x5

    .line 226
    const/16 v6, 0x22

    .line 227
    .line 228
    goto :goto_7

    .line 229
    :cond_d
    :goto_a
    const/16 v4, 0x2e

    .line 230
    .line 231
    if-ne v10, v4, :cond_11

    .line 232
    .line 233
    iput-byte v12, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 234
    .line 235
    add-int/lit8 v10, v3, 0x1

    .line 236
    .line 237
    aget-char v3, v5, v3

    .line 238
    .line 239
    move/from16 v41, v10

    .line 240
    .line 241
    move v10, v3

    .line 242
    move/from16 v3, v41

    .line 243
    .line 244
    :goto_b
    if-lt v10, v6, :cond_11

    .line 245
    .line 246
    if-gt v10, v11, :cond_11

    .line 247
    .line 248
    if-nez v22, :cond_f

    .line 249
    .line 250
    add-int/lit8 v10, v10, -0x30

    .line 251
    .line 252
    iget v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 253
    .line 254
    mul-int/lit8 v11, v11, 0xa

    .line 255
    .line 256
    iput v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 257
    .line 258
    if-ge v11, v1, :cond_e

    .line 259
    .line 260
    :goto_c
    move/from16 v22, v14

    .line 261
    .line 262
    goto :goto_d

    .line 263
    :cond_e
    sub-int/2addr v11, v10

    .line 264
    iput v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 265
    .line 266
    if-ge v11, v1, :cond_f

    .line 267
    .line 268
    goto :goto_c

    .line 269
    :cond_f
    :goto_d
    iget-short v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰苏哲:S

    .line 270
    .line 271
    add-int/2addr v10, v14

    .line 272
    int-to-short v10, v10

    .line 273
    iput-short v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰苏哲:S

    .line 274
    .line 275
    if-ne v3, v15, :cond_10

    .line 276
    .line 277
    add-int/lit8 v3, v3, 0x1

    .line 278
    .line 279
    move/from16 v23, v14

    .line 280
    .line 281
    const/16 v10, 0x1a

    .line 282
    .line 283
    goto :goto_e

    .line 284
    :cond_10
    add-int/lit8 v10, v3, 0x1

    .line 285
    .line 286
    aget-char v3, v5, v3

    .line 287
    .line 288
    move v11, v10

    .line 289
    move v10, v3

    .line 290
    move v3, v11

    .line 291
    move/from16 v23, v14

    .line 292
    .line 293
    const/16 v11, 0x39

    .line 294
    .line 295
    goto :goto_b

    .line 296
    :cond_11
    :goto_e
    if-eqz v22, :cond_2a

    .line 297
    .line 298
    const/16 v29, 0x9

    .line 299
    .line 300
    iget-boolean v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏兰哲:Z

    .line 301
    .line 302
    if-eqz v1, :cond_12

    .line 303
    .line 304
    move/from16 v31, v6

    .line 305
    .line 306
    move v6, v8

    .line 307
    goto :goto_f

    .line 308
    :cond_12
    add-int/lit8 v30, v8, -0x1

    .line 309
    .line 310
    move/from16 v31, v6

    .line 311
    .line 312
    move/from16 v6, v30

    .line 313
    .line 314
    :goto_f
    iget-short v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰苏哲:S

    .line 315
    .line 316
    if-lez v9, :cond_13

    .line 317
    .line 318
    add-int/lit8 v32, v3, -0x2

    .line 319
    .line 320
    :goto_10
    sub-int v32, v32, v6

    .line 321
    .line 322
    move/from16 v13, v32

    .line 323
    .line 324
    goto :goto_11

    .line 325
    :cond_13
    add-int/lit8 v32, v3, -0x1

    .line 326
    .line 327
    goto :goto_10

    .line 328
    :goto_11
    const/16 v11, 0x26

    .line 329
    .line 330
    if-le v13, v11, :cond_16

    .line 331
    .line 332
    const/16 v4, 0x8

    .line 333
    .line 334
    iput-byte v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 335
    .line 336
    if-eqz v1, :cond_14

    .line 337
    .line 338
    add-int/lit8 v6, v6, -0x1

    .line 339
    .line 340
    :cond_14
    new-instance v1, Ljava/lang/String;

    .line 341
    .line 342
    add-int/lit8 v4, v3, -0x1

    .line 343
    .line 344
    sub-int/2addr v4, v6

    .line 345
    invoke-direct {v1, v5, v6, v4}, Ljava/lang/String;-><init>([CII)V

    .line 346
    .line 347
    .line 348
    iput-object v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰楪哲:Ljava/lang/String;

    .line 349
    .line 350
    :cond_15
    move-object/from16 v40, v5

    .line 351
    .line 352
    goto/16 :goto_1b

    .line 353
    .line 354
    :cond_16
    add-int/lit8 v1, v3, -0x1

    .line 355
    .line 356
    sub-int v13, v1, v6

    .line 357
    .line 358
    if-lez v9, :cond_17

    .line 359
    .line 360
    add-int/lit8 v13, v13, -0x1

    .line 361
    .line 362
    :cond_17
    if-gt v13, v11, :cond_29

    .line 363
    .line 364
    rem-int/lit8 v13, v13, 0x9

    .line 365
    .line 366
    if-nez v13, :cond_18

    .line 367
    .line 368
    move/from16 v13, v29

    .line 369
    .line 370
    :cond_18
    add-int/2addr v13, v6

    .line 371
    add-int/lit8 v9, v6, 0x1

    .line 372
    .line 373
    aget-char v11, v5, v6

    .line 374
    .line 375
    if-ne v11, v4, :cond_19

    .line 376
    .line 377
    add-int/2addr v6, v12

    .line 378
    aget-char v11, v5, v9

    .line 379
    .line 380
    add-int/lit8 v9, v13, 0x1

    .line 381
    .line 382
    move/from16 v41, v9

    .line 383
    .line 384
    move v9, v6

    .line 385
    move/from16 v6, v41

    .line 386
    .line 387
    goto :goto_12

    .line 388
    :cond_19
    move v6, v13

    .line 389
    :goto_12
    add-int/lit8 v11, v11, -0x30

    .line 390
    .line 391
    :goto_13
    if-ge v9, v13, :cond_1b

    .line 392
    .line 393
    aget-char v12, v5, v9

    .line 394
    .line 395
    if-ne v12, v4, :cond_1a

    .line 396
    .line 397
    add-int/lit8 v9, v9, 0x1

    .line 398
    .line 399
    aget-char v12, v5, v9

    .line 400
    .line 401
    add-int/lit8 v6, v6, 0x1

    .line 402
    .line 403
    if-ge v13, v1, :cond_1a

    .line 404
    .line 405
    add-int/lit8 v13, v13, 0x1

    .line 406
    .line 407
    :cond_1a
    add-int/lit8 v12, v12, -0x30

    .line 408
    .line 409
    mul-int/lit8 v11, v11, 0xa

    .line 410
    .line 411
    add-int/2addr v11, v12

    .line 412
    add-int/2addr v9, v14

    .line 413
    const/4 v12, 0x2

    .line 414
    goto :goto_13

    .line 415
    :cond_1b
    iput v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 416
    .line 417
    :goto_14
    if-ge v6, v1, :cond_15

    .line 418
    .line 419
    add-int/lit8 v9, v6, 0x9

    .line 420
    .line 421
    add-int/lit8 v11, v6, 0x1

    .line 422
    .line 423
    aget-char v12, v5, v6

    .line 424
    .line 425
    if-ne v12, v4, :cond_1c

    .line 426
    .line 427
    add-int/lit8 v9, v6, 0x2

    .line 428
    .line 429
    aget-char v12, v5, v11

    .line 430
    .line 431
    add-int/lit8 v6, v6, 0xa

    .line 432
    .line 433
    move v11, v9

    .line 434
    move v9, v6

    .line 435
    goto :goto_15

    .line 436
    :cond_1c
    move v6, v9

    .line 437
    :goto_15
    add-int/lit8 v12, v12, -0x30

    .line 438
    .line 439
    :goto_16
    if-ge v11, v9, :cond_1e

    .line 440
    .line 441
    aget-char v13, v5, v11

    .line 442
    .line 443
    if-ne v13, v4, :cond_1d

    .line 444
    .line 445
    add-int/lit8 v11, v11, 0x1

    .line 446
    .line 447
    aget-char v13, v5, v11

    .line 448
    .line 449
    add-int/lit8 v6, v6, 0x1

    .line 450
    .line 451
    add-int/lit8 v9, v9, 0x1

    .line 452
    .line 453
    :cond_1d
    add-int/lit8 v13, v13, -0x30

    .line 454
    .line 455
    mul-int/lit8 v12, v12, 0xa

    .line 456
    .line 457
    add-int/2addr v12, v13

    .line 458
    add-int/2addr v11, v14

    .line 459
    goto :goto_16

    .line 460
    :cond_1e
    move-wide/from16 v34, v20

    .line 461
    .line 462
    const/4 v9, 0x3

    .line 463
    :goto_17
    const-string v11, "BigInteger would overflow supported range"

    .line 464
    .line 465
    const-wide v36, 0xffffffffL

    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    if-ltz v9, :cond_23

    .line 471
    .line 472
    const-wide/32 v38, 0x3b9aca00

    .line 473
    .line 474
    .line 475
    if-eqz v9, :cond_22

    .line 476
    .line 477
    if-eq v9, v14, :cond_21

    .line 478
    .line 479
    const/4 v13, 0x2

    .line 480
    if-eq v9, v13, :cond_20

    .line 481
    .line 482
    const/4 v13, 0x3

    .line 483
    if-ne v9, v13, :cond_1f

    .line 484
    .line 485
    iget v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 486
    .line 487
    move-object/from16 v40, v5

    .line 488
    .line 489
    int-to-long v4, v11

    .line 490
    and-long v4, v4, v36

    .line 491
    .line 492
    mul-long v38, v38, v4

    .line 493
    .line 494
    add-long v4, v38, v34

    .line 495
    .line 496
    long-to-int v11, v4

    .line 497
    iput v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 498
    .line 499
    goto :goto_18

    .line 500
    :cond_1f
    new-instance v0, Ljava/lang/ArithmeticException;

    .line 501
    .line 502
    invoke-direct {v0, v11}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    throw v0

    .line 506
    :cond_20
    move-object/from16 v40, v5

    .line 507
    .line 508
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 509
    .line 510
    int-to-long v4, v4

    .line 511
    and-long v4, v4, v36

    .line 512
    .line 513
    mul-long v38, v38, v4

    .line 514
    .line 515
    add-long v4, v38, v34

    .line 516
    .line 517
    long-to-int v11, v4

    .line 518
    iput v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 519
    .line 520
    goto :goto_18

    .line 521
    :cond_21
    move-object/from16 v40, v5

    .line 522
    .line 523
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪哲兰:I

    .line 524
    .line 525
    int-to-long v4, v4

    .line 526
    and-long v4, v4, v36

    .line 527
    .line 528
    mul-long v38, v38, v4

    .line 529
    .line 530
    add-long v4, v38, v34

    .line 531
    .line 532
    long-to-int v11, v4

    .line 533
    iput v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪哲兰:I

    .line 534
    .line 535
    goto :goto_18

    .line 536
    :cond_22
    move-object/from16 v40, v5

    .line 537
    .line 538
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰哲苏:I

    .line 539
    .line 540
    int-to-long v4, v4

    .line 541
    and-long v4, v4, v36

    .line 542
    .line 543
    mul-long v38, v38, v4

    .line 544
    .line 545
    add-long v4, v38, v34

    .line 546
    .line 547
    long-to-int v11, v4

    .line 548
    iput v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰哲苏:I

    .line 549
    .line 550
    :goto_18
    ushr-long v34, v4, v24

    .line 551
    .line 552
    add-int/lit8 v9, v9, -0x1

    .line 553
    .line 554
    move-object/from16 v5, v40

    .line 555
    .line 556
    const/16 v4, 0x2e

    .line 557
    .line 558
    goto :goto_17

    .line 559
    :cond_23
    move-object/from16 v40, v5

    .line 560
    .line 561
    int-to-long v4, v12

    .line 562
    and-long v4, v4, v36

    .line 563
    .line 564
    iget v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 565
    .line 566
    int-to-long v12, v9

    .line 567
    and-long v12, v12, v36

    .line 568
    .line 569
    add-long/2addr v12, v4

    .line 570
    long-to-int v4, v12

    .line 571
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 572
    .line 573
    ushr-long v4, v12, v24

    .line 574
    .line 575
    const/4 v9, 0x2

    .line 576
    :goto_19
    if-ltz v9, :cond_28

    .line 577
    .line 578
    if-eqz v9, :cond_27

    .line 579
    .line 580
    if-eq v9, v14, :cond_26

    .line 581
    .line 582
    const/4 v13, 0x2

    .line 583
    if-eq v9, v13, :cond_25

    .line 584
    .line 585
    const/4 v13, 0x3

    .line 586
    if-ne v9, v13, :cond_24

    .line 587
    .line 588
    iget v12, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 589
    .line 590
    int-to-long v12, v12

    .line 591
    and-long v12, v12, v36

    .line 592
    .line 593
    add-long/2addr v12, v4

    .line 594
    long-to-int v4, v12

    .line 595
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 596
    .line 597
    goto :goto_1a

    .line 598
    :cond_24
    new-instance v0, Ljava/lang/ArithmeticException;

    .line 599
    .line 600
    invoke-direct {v0, v11}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    throw v0

    .line 604
    :cond_25
    iget v12, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 605
    .line 606
    int-to-long v12, v12

    .line 607
    and-long v12, v12, v36

    .line 608
    .line 609
    add-long/2addr v12, v4

    .line 610
    long-to-int v4, v12

    .line 611
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲:I

    .line 612
    .line 613
    goto :goto_1a

    .line 614
    :cond_26
    iget v12, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪哲兰:I

    .line 615
    .line 616
    int-to-long v12, v12

    .line 617
    and-long v12, v12, v36

    .line 618
    .line 619
    add-long/2addr v12, v4

    .line 620
    long-to-int v4, v12

    .line 621
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪哲兰:I

    .line 622
    .line 623
    goto :goto_1a

    .line 624
    :cond_27
    iget v12, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰哲苏:I

    .line 625
    .line 626
    int-to-long v12, v12

    .line 627
    and-long v12, v12, v36

    .line 628
    .line 629
    add-long/2addr v12, v4

    .line 630
    long-to-int v4, v12

    .line 631
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪兰哲苏:I

    .line 632
    .line 633
    :goto_1a
    ushr-long v4, v12, v24

    .line 634
    .line 635
    add-int/lit8 v9, v9, -0x1

    .line 636
    .line 637
    goto :goto_19

    .line 638
    :cond_28
    move-object/from16 v5, v40

    .line 639
    .line 640
    const/16 v4, 0x2e

    .line 641
    .line 642
    goto/16 :goto_14

    .line 643
    .line 644
    :goto_1b
    move-object/from16 v1, v40

    .line 645
    .line 646
    goto :goto_1c

    .line 647
    :cond_29
    move-object/from16 v40, v5

    .line 648
    .line 649
    new-instance v0, Ljava/lang/String;

    .line 650
    .line 651
    move-object/from16 v1, v40

    .line 652
    .line 653
    invoke-direct {v0, v1, v6, v13}, Ljava/lang/String;-><init>([CII)V

    .line 654
    .line 655
    .line 656
    const-string v1, "number too large : "

    .line 657
    .line 658
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 663
    .line 664
    .line 665
    return-void

    .line 666
    :cond_2a
    move-object v1, v5

    .line 667
    move/from16 v31, v6

    .line 668
    .line 669
    const/16 v29, 0x9

    .line 670
    .line 671
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 672
    .line 673
    neg-int v4, v4

    .line 674
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏哲楪兰:I

    .line 675
    .line 676
    :goto_1c
    const/16 v4, 0x65

    .line 677
    .line 678
    if-eq v10, v4, :cond_2b

    .line 679
    .line 680
    const/16 v5, 0x45

    .line 681
    .line 682
    if-ne v10, v5, :cond_32

    .line 683
    .line 684
    :cond_2b
    add-int/lit8 v5, v3, 0x1

    .line 685
    .line 686
    aget-char v6, v1, v3

    .line 687
    .line 688
    const/16 v9, 0x2d

    .line 689
    .line 690
    if-ne v6, v9, :cond_2c

    .line 691
    .line 692
    add-int/lit8 v3, v3, 0x2

    .line 693
    .line 694
    aget-char v6, v1, v5

    .line 695
    .line 696
    move v9, v14

    .line 697
    move/from16 v10, v31

    .line 698
    .line 699
    const/4 v5, 0x0

    .line 700
    goto :goto_1e

    .line 701
    :cond_2c
    const/16 v9, 0x2b

    .line 702
    .line 703
    if-ne v6, v9, :cond_2d

    .line 704
    .line 705
    add-int/lit8 v3, v3, 0x2

    .line 706
    .line 707
    aget-char v6, v1, v5

    .line 708
    .line 709
    :goto_1d
    move/from16 v10, v31

    .line 710
    .line 711
    const/4 v5, 0x0

    .line 712
    const/4 v9, 0x0

    .line 713
    goto :goto_1e

    .line 714
    :cond_2d
    move v3, v5

    .line 715
    goto :goto_1d

    .line 716
    :goto_1e
    if-lt v6, v10, :cond_30

    .line 717
    .line 718
    const/16 v11, 0x39

    .line 719
    .line 720
    if-gt v6, v11, :cond_30

    .line 721
    .line 722
    add-int/lit8 v6, v6, -0x30

    .line 723
    .line 724
    mul-int/lit8 v5, v5, 0xa

    .line 725
    .line 726
    add-int/2addr v5, v6

    .line 727
    const/16 v6, 0x7ff

    .line 728
    .line 729
    if-gt v5, v6, :cond_2f

    .line 730
    .line 731
    if-ne v3, v15, :cond_2e

    .line 732
    .line 733
    move/from16 v23, v14

    .line 734
    .line 735
    const/16 v10, 0x1a

    .line 736
    .line 737
    goto :goto_1f

    .line 738
    :cond_2e
    add-int/lit8 v6, v3, 0x1

    .line 739
    .line 740
    aget-char v3, v1, v3

    .line 741
    .line 742
    move/from16 v23, v6

    .line 743
    .line 744
    move v6, v3

    .line 745
    move/from16 v3, v23

    .line 746
    .line 747
    move/from16 v23, v14

    .line 748
    .line 749
    goto :goto_1e

    .line 750
    :cond_2f
    const-string v0, "too large exp value : "

    .line 751
    .line 752
    invoke-static {v5, v0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 757
    .line 758
    .line 759
    return-void

    .line 760
    :cond_30
    move v10, v6

    .line 761
    :goto_1f
    if-eqz v9, :cond_31

    .line 762
    .line 763
    neg-int v5, v5

    .line 764
    :cond_31
    int-to-short v5, v5

    .line 765
    iput-short v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲兰苏:S

    .line 766
    .line 767
    const/4 v13, 0x2

    .line 768
    iput-byte v13, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 769
    .line 770
    :cond_32
    const/4 v5, 0x6

    .line 771
    const/16 v6, 0x75

    .line 772
    .line 773
    const/4 v9, 0x4

    .line 774
    if-ne v3, v8, :cond_3c

    .line 775
    .line 776
    const/16 v11, 0x6e

    .line 777
    .line 778
    if-ne v10, v11, :cond_34

    .line 779
    .line 780
    aget-char v4, v1, v3

    .line 781
    .line 782
    if-ne v4, v6, :cond_3c

    .line 783
    .line 784
    add-int/lit8 v4, v3, 0x1

    .line 785
    .line 786
    aget-char v4, v1, v4

    .line 787
    .line 788
    const/16 v11, 0x6c

    .line 789
    .line 790
    if-ne v4, v11, :cond_3c

    .line 791
    .line 792
    add-int/lit8 v4, v3, 0x2

    .line 793
    .line 794
    aget-char v4, v1, v4

    .line 795
    .line 796
    if-ne v4, v11, :cond_3c

    .line 797
    .line 798
    add-int/lit8 v4, v3, 0x3

    .line 799
    .line 800
    iput-boolean v14, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 801
    .line 802
    const/4 v10, 0x5

    .line 803
    iput-byte v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 804
    .line 805
    if-ne v4, v15, :cond_33

    .line 806
    .line 807
    :goto_20
    move v3, v4

    .line 808
    const/16 v10, 0x1a

    .line 809
    .line 810
    goto :goto_22

    .line 811
    :cond_33
    add-int/lit8 v3, v3, 0x4

    .line 812
    .line 813
    aget-char v4, v1, v4

    .line 814
    .line 815
    :goto_21
    move v10, v4

    .line 816
    :goto_22
    move/from16 v23, v14

    .line 817
    .line 818
    goto/16 :goto_23

    .line 819
    .line 820
    :cond_34
    const/16 v11, 0x74

    .line 821
    .line 822
    if-ne v10, v11, :cond_36

    .line 823
    .line 824
    aget-char v11, v1, v3

    .line 825
    .line 826
    const/16 v12, 0x72

    .line 827
    .line 828
    if-ne v11, v12, :cond_36

    .line 829
    .line 830
    add-int/lit8 v11, v3, 0x1

    .line 831
    .line 832
    aget-char v11, v1, v11

    .line 833
    .line 834
    if-ne v11, v6, :cond_36

    .line 835
    .line 836
    add-int/lit8 v11, v3, 0x2

    .line 837
    .line 838
    aget-char v11, v1, v11

    .line 839
    .line 840
    if-ne v11, v4, :cond_36

    .line 841
    .line 842
    add-int/lit8 v4, v3, 0x3

    .line 843
    .line 844
    iput-boolean v14, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏哲兰:Z

    .line 845
    .line 846
    iput-byte v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 847
    .line 848
    if-ne v4, v15, :cond_35

    .line 849
    .line 850
    goto :goto_20

    .line 851
    :cond_35
    add-int/lit8 v3, v3, 0x4

    .line 852
    .line 853
    aget-char v4, v1, v4

    .line 854
    .line 855
    goto :goto_21

    .line 856
    :cond_36
    const/16 v4, 0x66

    .line 857
    .line 858
    if-ne v10, v4, :cond_38

    .line 859
    .line 860
    add-int/lit8 v4, v3, 0x3

    .line 861
    .line 862
    if-ge v4, v15, :cond_38

    .line 863
    .line 864
    invoke-static {v3, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰哲苏世(I[C)J

    .line 865
    .line 866
    .line 867
    move-result-wide v11

    .line 868
    sget-wide v27, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏哲兰世:J

    .line 869
    .line 870
    cmp-long v4, v11, v27

    .line 871
    .line 872
    if-nez v4, :cond_38

    .line 873
    .line 874
    add-int/lit8 v4, v3, 0x4

    .line 875
    .line 876
    const/4 v10, 0x0

    .line 877
    iput-boolean v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏哲兰:Z

    .line 878
    .line 879
    iput-byte v9, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 880
    .line 881
    if-ne v4, v15, :cond_37

    .line 882
    .line 883
    goto :goto_20

    .line 884
    :cond_37
    add-int/lit8 v3, v3, 0x5

    .line 885
    .line 886
    aget-char v4, v1, v4

    .line 887
    .line 888
    goto :goto_21

    .line 889
    :cond_38
    const/16 v4, 0x4e

    .line 890
    .line 891
    if-ne v10, v4, :cond_3a

    .line 892
    .line 893
    aget-char v11, v1, v3

    .line 894
    .line 895
    const/16 v12, 0x61

    .line 896
    .line 897
    if-ne v11, v12, :cond_3a

    .line 898
    .line 899
    add-int/lit8 v11, v3, 0x1

    .line 900
    .line 901
    aget-char v11, v1, v11

    .line 902
    .line 903
    if-ne v11, v4, :cond_3a

    .line 904
    .line 905
    add-int/lit8 v4, v3, 0x2

    .line 906
    .line 907
    iput-boolean v14, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪苏哲兰:Z

    .line 908
    .line 909
    const/16 v10, 0xe

    .line 910
    .line 911
    iput-byte v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 912
    .line 913
    if-ne v4, v15, :cond_39

    .line 914
    .line 915
    goto :goto_20

    .line 916
    :cond_39
    add-int/lit8 v3, v3, 0x3

    .line 917
    .line 918
    aget-char v4, v1, v4

    .line 919
    .line 920
    goto :goto_21

    .line 921
    :cond_3a
    const/16 v4, 0x7b

    .line 922
    .line 923
    if-ne v10, v4, :cond_3b

    .line 924
    .line 925
    if-nez v7, :cond_3b

    .line 926
    .line 927
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 928
    .line 929
    iput-char v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 930
    .line 931
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲苏兰子()Ljava/util/Map;

    .line 932
    .line 933
    .line 934
    move-result-object v1

    .line 935
    iput-object v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰哲楪:Ljava/lang/Object;

    .line 936
    .line 937
    iput-byte v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 938
    .line 939
    return-void

    .line 940
    :cond_3b
    const/16 v4, 0x5b

    .line 941
    .line 942
    if-ne v10, v4, :cond_3c

    .line 943
    .line 944
    if-nez v7, :cond_3c

    .line 945
    .line 946
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 947
    .line 948
    iput-char v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 949
    .line 950
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏哲世()Ljava/util/List;

    .line 951
    .line 952
    .line 953
    move-result-object v1

    .line 954
    iput-object v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰哲楪:Ljava/lang/Object;

    .line 955
    .line 956
    const/4 v1, 0x7

    .line 957
    iput-byte v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 958
    .line 959
    return-void

    .line 960
    :cond_3c
    :goto_23
    const/16 v4, 0x2c

    .line 961
    .line 962
    if-eqz v7, :cond_4f

    .line 963
    .line 964
    if-eq v10, v7, :cond_4d

    .line 965
    .line 966
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 967
    .line 968
    iput-char v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 969
    .line 970
    const/4 v11, 0x0

    .line 971
    iput-boolean v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲世苏:Z

    .line 972
    .line 973
    move v3, v2

    .line 974
    move v10, v11

    .line 975
    :goto_24
    aget-char v8, v1, v3

    .line 976
    .line 977
    const/16 v12, 0x78

    .line 978
    .line 979
    const/16 v13, 0x5c

    .line 980
    .line 981
    if-ne v8, v13, :cond_3f

    .line 982
    .line 983
    iput-boolean v14, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲世苏:Z

    .line 984
    .line 985
    add-int/lit8 v8, v3, 0x1

    .line 986
    .line 987
    aget-char v8, v1, v8

    .line 988
    .line 989
    if-ne v8, v6, :cond_3d

    .line 990
    .line 991
    move v8, v5

    .line 992
    goto :goto_25

    .line 993
    :cond_3d
    if-ne v8, v12, :cond_3e

    .line 994
    .line 995
    move v8, v9

    .line 996
    goto :goto_25

    .line 997
    :cond_3e
    const/4 v8, 0x2

    .line 998
    :goto_25
    add-int/2addr v3, v8

    .line 999
    const/16 v8, 0x22

    .line 1000
    .line 1001
    const/16 v12, 0x1a

    .line 1002
    .line 1003
    const/4 v13, 0x3

    .line 1004
    goto/16 :goto_2c

    .line 1005
    .line 1006
    :cond_3f
    if-ne v8, v7, :cond_4c

    .line 1007
    .line 1008
    iget-boolean v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲世苏:Z

    .line 1009
    .line 1010
    if-eqz v5, :cond_45

    .line 1011
    .line 1012
    new-array v5, v10, [C

    .line 1013
    .line 1014
    move v10, v11

    .line 1015
    :goto_26
    aget-char v3, v1, v2

    .line 1016
    .line 1017
    if-ne v3, v13, :cond_43

    .line 1018
    .line 1019
    add-int/lit8 v3, v2, 0x1

    .line 1020
    .line 1021
    aget-char v7, v1, v3

    .line 1022
    .line 1023
    if-ne v7, v6, :cond_40

    .line 1024
    .line 1025
    add-int/lit8 v3, v2, 0x2

    .line 1026
    .line 1027
    invoke-static {v3, v15}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 1028
    .line 1029
    .line 1030
    invoke-static {v3, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪兰苏哲(I[C)I

    .line 1031
    .line 1032
    .line 1033
    move-result v3

    .line 1034
    int-to-char v3, v3

    .line 1035
    add-int/lit8 v2, v2, 0x5

    .line 1036
    .line 1037
    :goto_27
    const/16 v8, 0x22

    .line 1038
    .line 1039
    goto :goto_28

    .line 1040
    :cond_40
    if-ne v7, v12, :cond_41

    .line 1041
    .line 1042
    add-int/lit8 v3, v2, 0x2

    .line 1043
    .line 1044
    aget-char v3, v1, v3

    .line 1045
    .line 1046
    add-int/lit8 v2, v2, 0x3

    .line 1047
    .line 1048
    aget-char v7, v1, v2

    .line 1049
    .line 1050
    invoke-static {v3, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世兰哲(II)C

    .line 1051
    .line 1052
    .line 1053
    move-result v3

    .line 1054
    goto :goto_27

    .line 1055
    :cond_41
    const/16 v8, 0x22

    .line 1056
    .line 1057
    if-eq v7, v13, :cond_42

    .line 1058
    .line 1059
    if-eq v7, v8, :cond_42

    .line 1060
    .line 1061
    invoke-virtual {v0, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世哲兰(I)C

    .line 1062
    .line 1063
    .line 1064
    move-result v2

    .line 1065
    move/from16 v41, v3

    .line 1066
    .line 1067
    move v3, v2

    .line 1068
    move/from16 v2, v41

    .line 1069
    .line 1070
    goto :goto_28

    .line 1071
    :cond_42
    move v2, v3

    .line 1072
    move v3, v7

    .line 1073
    goto :goto_28

    .line 1074
    :cond_43
    const/16 v8, 0x22

    .line 1075
    .line 1076
    if-ne v3, v8, :cond_44

    .line 1077
    .line 1078
    new-instance v3, Ljava/lang/String;

    .line 1079
    .line 1080
    invoke-direct {v3, v5}, Ljava/lang/String;-><init>([C)V

    .line 1081
    .line 1082
    .line 1083
    move-object/from16 v41, v3

    .line 1084
    .line 1085
    move v3, v2

    .line 1086
    move-object/from16 v2, v41

    .line 1087
    .line 1088
    goto :goto_29

    .line 1089
    :cond_44
    :goto_28
    aput-char v3, v5, v10

    .line 1090
    .line 1091
    add-int/2addr v2, v14

    .line 1092
    add-int/2addr v10, v14

    .line 1093
    goto :goto_26

    .line 1094
    :cond_45
    new-instance v2, Ljava/lang/String;

    .line 1095
    .line 1096
    iget v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1097
    .line 1098
    sub-int v6, v3, v5

    .line 1099
    .line 1100
    invoke-direct {v2, v1, v5, v6}, Ljava/lang/String;-><init>([CII)V

    .line 1101
    .line 1102
    .line 1103
    :goto_29
    add-int/2addr v3, v14

    .line 1104
    if-ne v3, v15, :cond_46

    .line 1105
    .line 1106
    move/from16 v6, v24

    .line 1107
    .line 1108
    const/16 v5, 0x1a

    .line 1109
    .line 1110
    goto :goto_2a

    .line 1111
    :cond_46
    aget-char v5, v1, v3

    .line 1112
    .line 1113
    move/from16 v6, v24

    .line 1114
    .line 1115
    :goto_2a
    if-gt v5, v6, :cond_47

    .line 1116
    .line 1117
    shl-long v6, v18, v5

    .line 1118
    .line 1119
    and-long v6, v6, v16

    .line 1120
    .line 1121
    cmp-long v6, v6, v20

    .line 1122
    .line 1123
    if-eqz v6, :cond_47

    .line 1124
    .line 1125
    add-int/lit8 v3, v3, 0x1

    .line 1126
    .line 1127
    aget-char v5, v1, v3

    .line 1128
    .line 1129
    const/16 v6, 0x20

    .line 1130
    .line 1131
    goto :goto_2a

    .line 1132
    :cond_47
    if-ne v5, v4, :cond_48

    .line 1133
    .line 1134
    move v11, v14

    .line 1135
    :cond_48
    iput-boolean v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 1136
    .line 1137
    if-eqz v11, :cond_4a

    .line 1138
    .line 1139
    add-int/lit8 v4, v3, 0x1

    .line 1140
    .line 1141
    const/16 v33, 0x2

    .line 1142
    .line 1143
    add-int/lit8 v3, v3, 0x2

    .line 1144
    .line 1145
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1146
    .line 1147
    aget-char v3, v1, v4

    .line 1148
    .line 1149
    iput-char v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 1150
    .line 1151
    :goto_2b
    iget-char v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 1152
    .line 1153
    const/16 v6, 0x20

    .line 1154
    .line 1155
    if-gt v3, v6, :cond_4b

    .line 1156
    .line 1157
    shl-long v3, v18, v3

    .line 1158
    .line 1159
    and-long v3, v3, v16

    .line 1160
    .line 1161
    cmp-long v3, v3, v20

    .line 1162
    .line 1163
    if-eqz v3, :cond_4b

    .line 1164
    .line 1165
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1166
    .line 1167
    if-lt v3, v15, :cond_49

    .line 1168
    .line 1169
    const/16 v12, 0x1a

    .line 1170
    .line 1171
    iput-char v12, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 1172
    .line 1173
    goto :goto_2b

    .line 1174
    :cond_49
    const/16 v12, 0x1a

    .line 1175
    .line 1176
    add-int/lit8 v4, v3, 0x1

    .line 1177
    .line 1178
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1179
    .line 1180
    aget-char v3, v1, v3

    .line 1181
    .line 1182
    iput-char v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 1183
    .line 1184
    goto :goto_2b

    .line 1185
    :cond_4a
    add-int/2addr v3, v14

    .line 1186
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1187
    .line 1188
    int-to-char v1, v5

    .line 1189
    iput-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 1190
    .line 1191
    :cond_4b
    iput-object v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰楪哲:Ljava/lang/String;

    .line 1192
    .line 1193
    const/4 v13, 0x3

    .line 1194
    iput-byte v13, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 1195
    .line 1196
    return-void

    .line 1197
    :cond_4c
    const/16 v8, 0x22

    .line 1198
    .line 1199
    const/16 v12, 0x1a

    .line 1200
    .line 1201
    const/4 v13, 0x3

    .line 1202
    add-int/lit8 v3, v3, 0x1

    .line 1203
    .line 1204
    :goto_2c
    add-int/lit8 v10, v10, 0x1

    .line 1205
    .line 1206
    const/16 v24, 0x20

    .line 1207
    .line 1208
    goto/16 :goto_24

    .line 1209
    .line 1210
    :cond_4d
    const/4 v11, 0x0

    .line 1211
    const/16 v12, 0x1a

    .line 1212
    .line 1213
    if-ne v3, v15, :cond_4e

    .line 1214
    .line 1215
    move v10, v12

    .line 1216
    goto :goto_2d

    .line 1217
    :cond_4e
    add-int/lit8 v2, v3, 0x1

    .line 1218
    .line 1219
    aget-char v3, v1, v3

    .line 1220
    .line 1221
    move v10, v3

    .line 1222
    move v3, v2

    .line 1223
    goto :goto_2d

    .line 1224
    :cond_4f
    const/4 v11, 0x0

    .line 1225
    const/16 v12, 0x1a

    .line 1226
    .line 1227
    :goto_2d
    const/16 v2, 0x53

    .line 1228
    .line 1229
    const/16 v5, 0x42

    .line 1230
    .line 1231
    const/16 v6, 0x44

    .line 1232
    .line 1233
    const/16 v7, 0x46

    .line 1234
    .line 1235
    const/16 v9, 0x4c

    .line 1236
    .line 1237
    if-eq v10, v9, :cond_51

    .line 1238
    .line 1239
    if-eq v10, v7, :cond_51

    .line 1240
    .line 1241
    if-eq v10, v6, :cond_51

    .line 1242
    .line 1243
    if-eq v10, v5, :cond_51

    .line 1244
    .line 1245
    if-ne v10, v2, :cond_50

    .line 1246
    .line 1247
    goto :goto_2f

    .line 1248
    :cond_50
    :goto_2e
    const/16 v6, 0x20

    .line 1249
    .line 1250
    goto :goto_33

    .line 1251
    :cond_51
    :goto_2f
    if-eq v10, v5, :cond_56

    .line 1252
    .line 1253
    if-eq v10, v6, :cond_55

    .line 1254
    .line 1255
    if-eq v10, v7, :cond_54

    .line 1256
    .line 1257
    if-eq v10, v9, :cond_53

    .line 1258
    .line 1259
    if-eq v10, v2, :cond_52

    .line 1260
    .line 1261
    goto :goto_30

    .line 1262
    :cond_52
    if-nez v22, :cond_57

    .line 1263
    .line 1264
    iget-byte v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 1265
    .line 1266
    const/4 v13, 0x2

    .line 1267
    if-eq v2, v13, :cond_57

    .line 1268
    .line 1269
    move/from16 v2, v26

    .line 1270
    .line 1271
    iput-byte v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 1272
    .line 1273
    goto :goto_30

    .line 1274
    :cond_53
    const/4 v13, 0x2

    .line 1275
    sub-int v2, v3, v8

    .line 1276
    .line 1277
    const/16 v5, 0x13

    .line 1278
    .line 1279
    if-ge v2, v5, :cond_57

    .line 1280
    .line 1281
    iget-byte v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 1282
    .line 1283
    if-eq v2, v13, :cond_57

    .line 1284
    .line 1285
    const/16 v2, 0xb

    .line 1286
    .line 1287
    iput-byte v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 1288
    .line 1289
    goto :goto_30

    .line 1290
    :cond_54
    const/16 v2, 0xc

    .line 1291
    .line 1292
    iput-byte v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 1293
    .line 1294
    goto :goto_30

    .line 1295
    :cond_55
    const/16 v2, 0xd

    .line 1296
    .line 1297
    iput-byte v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 1298
    .line 1299
    goto :goto_30

    .line 1300
    :cond_56
    if-nez v22, :cond_57

    .line 1301
    .line 1302
    iget-byte v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 1303
    .line 1304
    const/4 v13, 0x2

    .line 1305
    if-eq v2, v13, :cond_57

    .line 1306
    .line 1307
    move/from16 v2, v29

    .line 1308
    .line 1309
    iput-byte v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰:B

    .line 1310
    .line 1311
    :cond_57
    :goto_30
    if-ne v3, v15, :cond_58

    .line 1312
    .line 1313
    :goto_31
    move v10, v12

    .line 1314
    goto :goto_2e

    .line 1315
    :cond_58
    add-int/lit8 v2, v3, 0x1

    .line 1316
    .line 1317
    aget-char v3, v1, v3

    .line 1318
    .line 1319
    :goto_32
    move v10, v3

    .line 1320
    move v3, v2

    .line 1321
    goto :goto_2e

    .line 1322
    :goto_33
    if-gt v10, v6, :cond_5a

    .line 1323
    .line 1324
    shl-long v5, v18, v10

    .line 1325
    .line 1326
    and-long v5, v5, v16

    .line 1327
    .line 1328
    cmp-long v2, v5, v20

    .line 1329
    .line 1330
    if-eqz v2, :cond_5a

    .line 1331
    .line 1332
    if-ne v3, v15, :cond_59

    .line 1333
    .line 1334
    goto :goto_31

    .line 1335
    :cond_59
    add-int/lit8 v2, v3, 0x1

    .line 1336
    .line 1337
    aget-char v3, v1, v3

    .line 1338
    .line 1339
    goto :goto_32

    .line 1340
    :cond_5a
    if-ne v10, v4, :cond_5b

    .line 1341
    .line 1342
    move v11, v14

    .line 1343
    :cond_5b
    iput-boolean v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 1344
    .line 1345
    if-eqz v11, :cond_5e

    .line 1346
    .line 1347
    if-ne v3, v15, :cond_5c

    .line 1348
    .line 1349
    move v2, v3

    .line 1350
    move v3, v12

    .line 1351
    goto :goto_34

    .line 1352
    :cond_5c
    add-int/lit8 v2, v3, 0x1

    .line 1353
    .line 1354
    aget-char v3, v1, v3

    .line 1355
    .line 1356
    :goto_34
    move v10, v3

    .line 1357
    const/16 v6, 0x20

    .line 1358
    .line 1359
    :goto_35
    move v3, v2

    .line 1360
    :goto_36
    if-gt v10, v6, :cond_5e

    .line 1361
    .line 1362
    shl-long v4, v18, v10

    .line 1363
    .line 1364
    and-long v4, v4, v16

    .line 1365
    .line 1366
    cmp-long v2, v4, v20

    .line 1367
    .line 1368
    if-eqz v2, :cond_5e

    .line 1369
    .line 1370
    if-ne v3, v15, :cond_5d

    .line 1371
    .line 1372
    move v10, v12

    .line 1373
    goto :goto_36

    .line 1374
    :cond_5d
    add-int/lit8 v2, v3, 0x1

    .line 1375
    .line 1376
    aget-char v3, v1, v3

    .line 1377
    .line 1378
    move v10, v3

    .line 1379
    goto :goto_35

    .line 1380
    :cond_5e
    if-eqz v23, :cond_5f

    .line 1381
    .line 1382
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 1383
    .line 1384
    iput-char v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 1385
    .line 1386
    return-void

    .line 1387
    :cond_5f
    const-string v1, "illegal input error"

    .line 1388
    .line 1389
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v0

    .line 1393
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 1394
    .line 1395
    .line 1396
    return-void
.end method

.method public final 飘花落叶言楪世子兰哲苏()Ljava/time/LocalTime;
    .locals 10

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/16 v1, 0x27

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "localTime only support string input"

    .line 14
    .line 15
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_1
    :goto_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 22
    .line 23
    add-int/lit8 v1, v0, 0x5

    .line 24
    .line 25
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 26
    .line 27
    array-length v4, v3

    .line 28
    if-le v1, v4, :cond_3

    .line 29
    .line 30
    :cond_2
    move-object v0, v2

    .line 31
    goto :goto_3

    .line 32
    :cond_3
    add-int/lit8 v4, v0, 0x2

    .line 33
    .line 34
    aget-char v5, v3, v4

    .line 35
    .line 36
    add-int/lit8 v6, v0, 0x4

    .line 37
    .line 38
    aget-char v6, v3, v6

    .line 39
    .line 40
    add-int/lit8 v7, v0, 0x1

    .line 41
    .line 42
    aget-char v7, v3, v7

    .line 43
    .line 44
    const/16 v8, 0x3a

    .line 45
    .line 46
    if-ne v7, v8, :cond_4

    .line 47
    .line 48
    if-ne v6, v8, :cond_4

    .line 49
    .line 50
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-static {v4, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    invoke-static {v1, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    goto :goto_2

    .line 63
    :cond_4
    if-ne v5, v8, :cond_5

    .line 64
    .line 65
    if-ne v6, v8, :cond_5

    .line 66
    .line 67
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    add-int/lit8 v0, v0, 0x3

    .line 72
    .line 73
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-static {v1, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    move v9, v4

    .line 82
    move v4, v0

    .line 83
    :goto_1
    move v0, v9

    .line 84
    goto :goto_2

    .line 85
    :cond_5
    if-ne v5, v8, :cond_2

    .line 86
    .line 87
    aget-char v1, v3, v1

    .line 88
    .line 89
    if-ne v1, v8, :cond_2

    .line 90
    .line 91
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    add-int/lit8 v4, v0, 0x3

    .line 96
    .line 97
    invoke-static {v4, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    add-int/lit8 v0, v0, 0x6

    .line 102
    .line 103
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    move v9, v1

    .line 108
    move v1, v0

    .line 109
    goto :goto_1

    .line 110
    :goto_2
    invoke-static {v0, v4, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲兰世(III)Ljava/time/LocalTime;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    :goto_3
    if-nez v0, :cond_6

    .line 115
    .line 116
    return-object v2

    .line 117
    :cond_6
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 118
    .line 119
    add-int/lit8 v1, v1, 0x8

    .line 120
    .line 121
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 122
    .line 123
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 124
    .line 125
    .line 126
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 127
    .line 128
    const/16 v2, 0x2c

    .line 129
    .line 130
    if-ne v1, v2, :cond_7

    .line 131
    .line 132
    const/4 v1, 0x1

    .line 133
    goto :goto_4

    .line 134
    :cond_7
    const/4 v1, 0x0

    .line 135
    :goto_4
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 136
    .line 137
    if-eqz v1, :cond_8

    .line 138
    .line 139
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 140
    .line 141
    .line 142
    :cond_8
    return-object v0
.end method

.method public final 飘花落叶言楪世子兰苏哲()Ljava/time/LocalTime;
    .locals 10

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/16 v1, 0x27

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "localTime only support string input"

    .line 14
    .line 15
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_1
    :goto_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 22
    .line 23
    add-int/lit8 v1, v0, 0x5

    .line 24
    .line 25
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 26
    .line 27
    array-length v4, v3

    .line 28
    if-le v1, v4, :cond_3

    .line 29
    .line 30
    :cond_2
    move-object v0, v2

    .line 31
    goto :goto_2

    .line 32
    :cond_3
    add-int/lit8 v4, v0, 0x1

    .line 33
    .line 34
    aget-char v4, v3, v4

    .line 35
    .line 36
    add-int/lit8 v5, v0, 0x4

    .line 37
    .line 38
    aget-char v6, v3, v5

    .line 39
    .line 40
    add-int/lit8 v7, v0, 0x2

    .line 41
    .line 42
    aget-char v8, v3, v7

    .line 43
    .line 44
    const/16 v9, 0x3a

    .line 45
    .line 46
    if-ne v8, v9, :cond_4

    .line 47
    .line 48
    if-ne v6, v9, :cond_4

    .line 49
    .line 50
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    add-int/lit8 v0, v0, 0x3

    .line 55
    .line 56
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-static {v1, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    goto :goto_1

    .line 65
    :cond_4
    if-ne v4, v9, :cond_5

    .line 66
    .line 67
    if-ne v6, v9, :cond_5

    .line 68
    .line 69
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    invoke-static {v7, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-static {v1, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    goto :goto_1

    .line 82
    :cond_5
    if-ne v4, v9, :cond_2

    .line 83
    .line 84
    add-int/lit8 v1, v0, 0x3

    .line 85
    .line 86
    aget-char v1, v3, v1

    .line 87
    .line 88
    if-ne v1, v9, :cond_2

    .line 89
    .line 90
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    invoke-static {v7, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    invoke-static {v5, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    :goto_1
    invoke-static {v4, v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲兰世(III)Ljava/time/LocalTime;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    :goto_2
    if-nez v0, :cond_6

    .line 107
    .line 108
    return-object v2

    .line 109
    :cond_6
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 110
    .line 111
    add-int/lit8 v1, v1, 0x7

    .line 112
    .line 113
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 114
    .line 115
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 116
    .line 117
    .line 118
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 119
    .line 120
    const/16 v2, 0x2c

    .line 121
    .line 122
    if-ne v1, v2, :cond_7

    .line 123
    .line 124
    const/4 v1, 0x1

    .line 125
    goto :goto_3

    .line 126
    :cond_7
    const/4 v1, 0x0

    .line 127
    :goto_3
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 128
    .line 129
    if-eqz v1, :cond_8

    .line 130
    .line 131
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 132
    .line 133
    .line 134
    :cond_8
    return-object v0
.end method

.method public final 飘花落叶言楪世子哲兰苏()Ljava/time/LocalTime;
    .locals 8

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/16 v1, 0x27

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "localTime only support string input"

    .line 14
    .line 15
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_1
    :goto_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 22
    .line 23
    add-int/lit8 v1, v0, 0x5

    .line 24
    .line 25
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 26
    .line 27
    array-length v4, v3

    .line 28
    const/4 v5, 0x0

    .line 29
    if-le v1, v4, :cond_3

    .line 30
    .line 31
    :cond_2
    move-object v0, v2

    .line 32
    goto :goto_2

    .line 33
    :cond_3
    add-int/lit8 v1, v0, 0x2

    .line 34
    .line 35
    aget-char v4, v3, v1

    .line 36
    .line 37
    const/16 v6, 0x3a

    .line 38
    .line 39
    if-ne v4, v6, :cond_4

    .line 40
    .line 41
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    add-int/lit8 v0, v0, 0x3

    .line 46
    .line 47
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    move v4, v1

    .line 52
    move v1, v5

    .line 53
    goto :goto_1

    .line 54
    :cond_4
    add-int/lit8 v4, v0, 0x1

    .line 55
    .line 56
    aget-char v4, v3, v4

    .line 57
    .line 58
    if-ne v4, v6, :cond_2

    .line 59
    .line 60
    add-int/lit8 v4, v0, 0x3

    .line 61
    .line 62
    aget-char v4, v3, v4

    .line 63
    .line 64
    if-ne v4, v6, :cond_2

    .line 65
    .line 66
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    invoke-static {v1, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    add-int/lit8 v0, v0, 0x4

    .line 75
    .line 76
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    move v7, v1

    .line 81
    move v1, v0

    .line 82
    move v0, v7

    .line 83
    :goto_1
    invoke-static {v4, v0, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲兰世(III)Ljava/time/LocalTime;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    :goto_2
    if-nez v0, :cond_5

    .line 88
    .line 89
    return-object v2

    .line 90
    :cond_5
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 91
    .line 92
    add-int/lit8 v1, v1, 0x6

    .line 93
    .line 94
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 97
    .line 98
    .line 99
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 100
    .line 101
    const/16 v2, 0x2c

    .line 102
    .line 103
    if-ne v1, v2, :cond_6

    .line 104
    .line 105
    const/4 v5, 0x1

    .line 106
    :cond_6
    iput-boolean v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 107
    .line 108
    if-eqz v5, :cond_7

    .line 109
    .line 110
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 111
    .line 112
    .line 113
    :cond_7
    return-object v0
.end method

.method public final 飘花落叶言楪世子哲苏兰()Ljava/time/LocalTime;
    .locals 7

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/16 v1, 0x27

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "localTime only support string input"

    .line 14
    .line 15
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_1
    :goto_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 22
    .line 23
    add-int/lit8 v1, v0, 0x12

    .line 24
    .line 25
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 26
    .line 27
    array-length v4, v3

    .line 28
    if-gt v1, v4, :cond_3

    .line 29
    .line 30
    add-int/lit8 v1, v0, 0x2

    .line 31
    .line 32
    aget-char v1, v3, v1

    .line 33
    .line 34
    const/16 v4, 0x3a

    .line 35
    .line 36
    if-ne v1, v4, :cond_3

    .line 37
    .line 38
    add-int/lit8 v1, v0, 0x5

    .line 39
    .line 40
    aget-char v1, v3, v1

    .line 41
    .line 42
    if-ne v1, v4, :cond_3

    .line 43
    .line 44
    add-int/lit8 v1, v0, 0x8

    .line 45
    .line 46
    aget-char v1, v3, v1

    .line 47
    .line 48
    const/16 v4, 0x2e

    .line 49
    .line 50
    if-eq v1, v4, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    add-int/lit8 v4, v0, 0x3

    .line 58
    .line 59
    invoke-static {v4, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    add-int/lit8 v5, v0, 0x6

    .line 64
    .line 65
    invoke-static {v5, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    const/16 v6, 0x9

    .line 70
    .line 71
    add-int/2addr v0, v6

    .line 72
    invoke-static {v6, v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏哲楪兰世(II[C)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    or-int v3, v1, v4

    .line 77
    .line 78
    or-int/2addr v3, v5

    .line 79
    or-int/2addr v3, v0

    .line 80
    if-gez v3, :cond_4

    .line 81
    .line 82
    :cond_3
    :goto_1
    move-object v0, v2

    .line 83
    goto :goto_2

    .line 84
    :cond_4
    invoke-static {v1, v4, v5, v0}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    :goto_2
    if-nez v0, :cond_5

    .line 89
    .line 90
    return-object v2

    .line 91
    :cond_5
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 92
    .line 93
    add-int/lit8 v1, v1, 0x13

    .line 94
    .line 95
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 98
    .line 99
    .line 100
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 101
    .line 102
    const/16 v2, 0x2c

    .line 103
    .line 104
    if-ne v1, v2, :cond_6

    .line 105
    .line 106
    const/4 v1, 0x1

    .line 107
    goto :goto_3

    .line 108
    :cond_6
    const/4 v1, 0x0

    .line 109
    :goto_3
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 110
    .line 111
    if-eqz v1, :cond_7

    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 114
    .line 115
    .line 116
    :cond_7
    return-object v0
.end method

.method public final 飘花落叶言楪世子苏兰哲()Ljava/time/LocalTime;
    .locals 7

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/16 v1, 0x27

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "localTime only support string input"

    .line 14
    .line 15
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_1
    :goto_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 22
    .line 23
    add-int/lit8 v1, v0, 0xf

    .line 24
    .line 25
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 26
    .line 27
    array-length v4, v3

    .line 28
    if-gt v1, v4, :cond_3

    .line 29
    .line 30
    add-int/lit8 v1, v0, 0x2

    .line 31
    .line 32
    aget-char v1, v3, v1

    .line 33
    .line 34
    const/16 v4, 0x3a

    .line 35
    .line 36
    if-ne v1, v4, :cond_3

    .line 37
    .line 38
    add-int/lit8 v1, v0, 0x5

    .line 39
    .line 40
    aget-char v1, v3, v1

    .line 41
    .line 42
    if-ne v1, v4, :cond_3

    .line 43
    .line 44
    add-int/lit8 v1, v0, 0x8

    .line 45
    .line 46
    aget-char v1, v3, v1

    .line 47
    .line 48
    const/16 v4, 0x2e

    .line 49
    .line 50
    if-eq v1, v4, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    add-int/lit8 v4, v0, 0x3

    .line 58
    .line 59
    invoke-static {v4, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    add-int/lit8 v5, v0, 0x6

    .line 64
    .line 65
    invoke-static {v5, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    add-int/lit8 v0, v0, 0x9

    .line 70
    .line 71
    const/4 v6, 0x6

    .line 72
    invoke-static {v6, v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏哲楪兰世(II[C)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    or-int v3, v1, v4

    .line 77
    .line 78
    or-int/2addr v3, v5

    .line 79
    or-int/2addr v3, v0

    .line 80
    if-gez v3, :cond_4

    .line 81
    .line 82
    :cond_3
    :goto_1
    move-object v0, v2

    .line 83
    goto :goto_2

    .line 84
    :cond_4
    invoke-static {v1, v4, v5, v0}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    :goto_2
    if-nez v0, :cond_5

    .line 89
    .line 90
    return-object v2

    .line 91
    :cond_5
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 92
    .line 93
    add-int/lit8 v1, v1, 0x10

    .line 94
    .line 95
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 98
    .line 99
    .line 100
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 101
    .line 102
    const/16 v2, 0x2c

    .line 103
    .line 104
    if-ne v1, v2, :cond_6

    .line 105
    .line 106
    const/4 v1, 0x1

    .line 107
    goto :goto_3

    .line 108
    :cond_6
    const/4 v1, 0x0

    .line 109
    :goto_3
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 110
    .line 111
    if-eqz v1, :cond_7

    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 114
    .line 115
    .line 116
    :cond_7
    return-object v0
.end method

.method public final 飘花落叶言楪世子苏哲兰()Ljava/time/LocalTime;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 4
    .line 5
    const/16 v2, 0x22

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eq v1, v2, :cond_1

    .line 9
    .line 10
    const/16 v2, 0x27

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v0, "localTime only support string input"

    .line 16
    .line 17
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v3

    .line 21
    :cond_1
    :goto_0
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 22
    .line 23
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 24
    .line 25
    add-int/lit8 v2, v1, 0xc

    .line 26
    .line 27
    iget-object v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 28
    .line 29
    array-length v5, v4

    .line 30
    if-gt v2, v5, :cond_5

    .line 31
    .line 32
    add-int/lit8 v2, v1, 0x2

    .line 33
    .line 34
    aget-char v2, v4, v2

    .line 35
    .line 36
    const/16 v5, 0x3a

    .line 37
    .line 38
    if-ne v2, v5, :cond_5

    .line 39
    .line 40
    add-int/lit8 v2, v1, 0x5

    .line 41
    .line 42
    aget-char v2, v4, v2

    .line 43
    .line 44
    if-ne v2, v5, :cond_5

    .line 45
    .line 46
    add-int/lit8 v2, v1, 0x8

    .line 47
    .line 48
    aget-char v2, v4, v2

    .line 49
    .line 50
    const/16 v5, 0x2e

    .line 51
    .line 52
    if-eq v2, v5, :cond_2

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    invoke-static {v1, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    add-int/lit8 v5, v1, 0x3

    .line 60
    .line 61
    invoke-static {v5, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    add-int/lit8 v6, v1, 0x6

    .line 66
    .line 67
    invoke-static {v6, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    add-int/lit8 v7, v1, 0x9

    .line 72
    .line 73
    invoke-static {v7, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰世苏(I[C)I

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    int-to-long v7, v7

    .line 78
    add-int/lit8 v1, v1, 0xb

    .line 79
    .line 80
    invoke-static {v1, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏兰哲世(I[C)C

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    int-to-long v9, v1

    .line 85
    const/16 v1, 0x20

    .line 86
    .line 87
    shl-long/2addr v9, v1

    .line 88
    add-long/2addr v7, v9

    .line 89
    const-wide v9, 0xfff0fff0fff0L

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    and-long/2addr v9, v7

    .line 95
    const-wide v11, 0x3000300030L

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    sub-long/2addr v9, v11

    .line 101
    const-wide v11, 0xf000f000fL

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    and-long/2addr v11, v7

    .line 107
    const-wide v13, 0x600060006L

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    add-long/2addr v13, v11

    .line 113
    const-wide v15, 0xf000f000f0L

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    and-long/2addr v13, v15

    .line 119
    or-long/2addr v9, v13

    .line 120
    const-wide/16 v13, 0x0

    .line 121
    .line 122
    cmp-long v4, v9, v13

    .line 123
    .line 124
    if-eqz v4, :cond_3

    .line 125
    .line 126
    const/4 v1, -0x1

    .line 127
    goto :goto_1

    .line 128
    :cond_3
    const-wide/16 v9, 0xf

    .line 129
    .line 130
    and-long/2addr v7, v9

    .line 131
    const-wide/16 v13, 0xa

    .line 132
    .line 133
    mul-long/2addr v7, v13

    .line 134
    const/16 v4, 0x10

    .line 135
    .line 136
    shr-long v15, v11, v4

    .line 137
    .line 138
    and-long/2addr v9, v15

    .line 139
    add-long/2addr v7, v9

    .line 140
    mul-long/2addr v7, v13

    .line 141
    shr-long v9, v11, v1

    .line 142
    .line 143
    add-long/2addr v7, v9

    .line 144
    long-to-int v1, v7

    .line 145
    :goto_1
    if-lez v1, :cond_4

    .line 146
    .line 147
    const v4, 0xf4240

    .line 148
    .line 149
    .line 150
    mul-int/2addr v1, v4

    .line 151
    :cond_4
    or-int v4, v2, v5

    .line 152
    .line 153
    or-int/2addr v4, v6

    .line 154
    or-int/2addr v4, v5

    .line 155
    if-gez v4, :cond_6

    .line 156
    .line 157
    :cond_5
    :goto_2
    move-object v1, v3

    .line 158
    goto :goto_3

    .line 159
    :cond_6
    invoke-static {v2, v5, v6, v1}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    :goto_3
    if-nez v1, :cond_7

    .line 164
    .line 165
    return-object v3

    .line 166
    :cond_7
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 167
    .line 168
    add-int/lit8 v2, v2, 0xd

    .line 169
    .line 170
    iput v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 171
    .line 172
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 173
    .line 174
    .line 175
    iget-char v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 176
    .line 177
    const/16 v3, 0x2c

    .line 178
    .line 179
    if-ne v2, v3, :cond_8

    .line 180
    .line 181
    const/4 v2, 0x1

    .line 182
    goto :goto_4

    .line 183
    :cond_8
    const/4 v2, 0x0

    .line 184
    :goto_4
    iput-boolean v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 185
    .line 186
    if-eqz v2, :cond_9

    .line 187
    .line 188
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 189
    .line 190
    .line 191
    :cond_9
    return-object v1
.end method

.method public final 飘花落叶言楪世苏兰哲子()V
    .locals 15

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 4
    .line 5
    aget-char v2, v1, v0

    .line 6
    .line 7
    const/16 v3, 0x75

    .line 8
    .line 9
    if-ne v2, v3, :cond_7

    .line 10
    .line 11
    add-int/lit8 v2, v0, 0x1

    .line 12
    .line 13
    aget-char v2, v1, v2

    .line 14
    .line 15
    const/16 v3, 0x6c

    .line 16
    .line 17
    if-ne v2, v3, :cond_7

    .line 18
    .line 19
    add-int/lit8 v2, v0, 0x2

    .line 20
    .line 21
    aget-char v2, v1, v2

    .line 22
    .line 23
    if-ne v2, v3, :cond_7

    .line 24
    .line 25
    add-int/lit8 v2, v0, 0x3

    .line 26
    .line 27
    const/16 v3, 0x1a

    .line 28
    .line 29
    iget v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 30
    .line 31
    if-ne v2, v4, :cond_0

    .line 32
    .line 33
    move v2, v3

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    aget-char v2, v1, v2

    .line 36
    .line 37
    :goto_0
    add-int/lit8 v0, v0, 0x4

    .line 38
    .line 39
    :goto_1
    const-wide/16 v5, 0x0

    .line 40
    .line 41
    const-wide v7, 0x100003700L

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    const-wide/16 v9, 0x1

    .line 47
    .line 48
    const/16 v11, 0x20

    .line 49
    .line 50
    if-gt v2, v11, :cond_2

    .line 51
    .line 52
    shl-long v12, v9, v2

    .line 53
    .line 54
    and-long/2addr v12, v7

    .line 55
    cmp-long v12, v12, v5

    .line 56
    .line 57
    if-eqz v12, :cond_2

    .line 58
    .line 59
    if-ne v0, v4, :cond_1

    .line 60
    .line 61
    move v2, v3

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    add-int/lit8 v2, v0, 0x1

    .line 64
    .line 65
    aget-char v0, v1, v0

    .line 66
    .line 67
    move v14, v2

    .line 68
    move v2, v0

    .line 69
    move v0, v14

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    const/16 v12, 0x2c

    .line 72
    .line 73
    if-ne v2, v12, :cond_3

    .line 74
    .line 75
    const/4 v12, 0x1

    .line 76
    goto :goto_2

    .line 77
    :cond_3
    const/4 v12, 0x0

    .line 78
    :goto_2
    iput-boolean v12, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 79
    .line 80
    if-eqz v12, :cond_6

    .line 81
    .line 82
    if-ne v0, v4, :cond_4

    .line 83
    .line 84
    move v2, v0

    .line 85
    move v0, v3

    .line 86
    goto :goto_3

    .line 87
    :cond_4
    add-int/lit8 v2, v0, 0x1

    .line 88
    .line 89
    aget-char v0, v1, v0

    .line 90
    .line 91
    :goto_3
    move v14, v2

    .line 92
    move v2, v0

    .line 93
    move v0, v14

    .line 94
    :goto_4
    if-gt v2, v11, :cond_6

    .line 95
    .line 96
    shl-long v12, v9, v2

    .line 97
    .line 98
    and-long/2addr v12, v7

    .line 99
    cmp-long v12, v12, v5

    .line 100
    .line 101
    if-eqz v12, :cond_6

    .line 102
    .line 103
    if-ne v0, v4, :cond_5

    .line 104
    .line 105
    move v2, v3

    .line 106
    goto :goto_4

    .line 107
    :cond_5
    add-int/lit8 v2, v0, 0x1

    .line 108
    .line 109
    aget-char v0, v1, v0

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_6
    iput-char v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 113
    .line 114
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 115
    .line 116
    return-void

    .line 117
    :cond_7
    const-string p0, "json syntax error, not match null, offset "

    .line 118
    .line 119
    invoke-static {v0, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public final 飘花落叶言楪世苏兰子哲()D
    .locals 15

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 4
    .line 5
    aget-char v2, v1, v0

    .line 6
    .line 7
    const/16 v3, 0x61

    .line 8
    .line 9
    if-ne v2, v3, :cond_7

    .line 10
    .line 11
    add-int/lit8 v2, v0, 0x1

    .line 12
    .line 13
    aget-char v2, v1, v2

    .line 14
    .line 15
    const/16 v3, 0x4e

    .line 16
    .line 17
    if-ne v2, v3, :cond_7

    .line 18
    .line 19
    add-int/lit8 v2, v0, 0x2

    .line 20
    .line 21
    const/16 v3, 0x1a

    .line 22
    .line 23
    iget v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 24
    .line 25
    if-ne v2, v4, :cond_0

    .line 26
    .line 27
    move v0, v2

    .line 28
    :goto_0
    move v2, v3

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    add-int/lit8 v0, v0, 0x3

    .line 31
    .line 32
    aget-char v2, v1, v2

    .line 33
    .line 34
    :goto_1
    const-wide/16 v5, 0x0

    .line 35
    .line 36
    const-wide v7, 0x100003700L

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    const-wide/16 v9, 0x1

    .line 42
    .line 43
    const/16 v11, 0x20

    .line 44
    .line 45
    if-gt v2, v11, :cond_2

    .line 46
    .line 47
    shl-long v12, v9, v2

    .line 48
    .line 49
    and-long/2addr v12, v7

    .line 50
    cmp-long v12, v12, v5

    .line 51
    .line 52
    if-eqz v12, :cond_2

    .line 53
    .line 54
    if-lt v0, v4, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    add-int/lit8 v2, v0, 0x1

    .line 58
    .line 59
    aget-char v0, v1, v0

    .line 60
    .line 61
    move v14, v2

    .line 62
    move v2, v0

    .line 63
    move v0, v14

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    const/16 v12, 0x2c

    .line 66
    .line 67
    if-ne v2, v12, :cond_3

    .line 68
    .line 69
    const/4 v12, 0x1

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    const/4 v12, 0x0

    .line 72
    :goto_2
    iput-boolean v12, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 73
    .line 74
    if-eqz v12, :cond_6

    .line 75
    .line 76
    if-lt v0, v4, :cond_4

    .line 77
    .line 78
    move v2, v0

    .line 79
    move v0, v3

    .line 80
    goto :goto_3

    .line 81
    :cond_4
    add-int/lit8 v2, v0, 0x1

    .line 82
    .line 83
    aget-char v0, v1, v0

    .line 84
    .line 85
    :goto_3
    move v14, v2

    .line 86
    move v2, v0

    .line 87
    move v0, v14

    .line 88
    :goto_4
    if-gt v2, v11, :cond_6

    .line 89
    .line 90
    shl-long v12, v9, v2

    .line 91
    .line 92
    and-long/2addr v12, v7

    .line 93
    cmp-long v12, v12, v5

    .line 94
    .line 95
    if-eqz v12, :cond_6

    .line 96
    .line 97
    if-lt v0, v4, :cond_5

    .line 98
    .line 99
    move v2, v3

    .line 100
    goto :goto_4

    .line 101
    :cond_5
    add-int/lit8 v2, v0, 0x1

    .line 102
    .line 103
    aget-char v0, v1, v0

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_6
    int-to-char v1, v2

    .line 107
    iput-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 108
    .line 109
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 110
    .line 111
    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    .line 112
    .line 113
    return-wide v0

    .line 114
    :cond_7
    const-string p0, "json syntax error, not NaN "

    .line 115
    .line 116
    invoke-static {v0, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    const-wide/16 v0, 0x0

    .line 124
    .line 125
    return-wide v0
.end method

.method public final 飘花落叶言楪世苏哲子兰()J
    .locals 7

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const-string p0, "date only support string input"

    .line 13
    .line 14
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    return-wide v0

    .line 20
    :cond_1
    :goto_1
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 21
    .line 22
    add-int/lit8 v2, v1, 0x12

    .line 23
    .line 24
    iget v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    if-lt v2, v3, :cond_2

    .line 28
    .line 29
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 33
    .line 34
    iget-object v2, v2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Ljava/time/ZoneId;

    .line 37
    .line 38
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 39
    .line 40
    invoke-static {v3, v1, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏世哲兰楪([CILjava/time/ZoneId;)J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    iget v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 45
    .line 46
    add-int/lit8 v6, v5, 0x13

    .line 47
    .line 48
    aget-char v3, v3, v6

    .line 49
    .line 50
    if-ne v3, v0, :cond_5

    .line 51
    .line 52
    add-int/lit8 v5, v5, 0x14

    .line 53
    .line 54
    iput v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 57
    .line 58
    .line 59
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 60
    .line 61
    const/16 v3, 0x2c

    .line 62
    .line 63
    if-ne v0, v3, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    const/4 v4, 0x0

    .line 67
    :goto_2
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 68
    .line 69
    if-eqz v4, :cond_4

    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 72
    .line 73
    .line 74
    :cond_4
    return-wide v1

    .line 75
    :cond_5
    const-string v0, "illegal date input"

    .line 76
    .line 77
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    goto :goto_0
.end method

.method public final 飘花落叶言楪世苏子兰哲()Ljava/time/LocalTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/16 v1, 0x27

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "localTime only support string input"

    .line 14
    .line 15
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 22
    .line 23
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏楪哲兰世(I[C)Ljava/time/LocalTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    return-object v2

    .line 30
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0xa

    .line 33
    .line 34
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 37
    .line 38
    .line 39
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 40
    .line 41
    const/16 v2, 0x2c

    .line 42
    .line 43
    if-ne v1, v2, :cond_3

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    const/4 v1, 0x0

    .line 48
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 49
    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 53
    .line 54
    .line 55
    :cond_4
    return-object v0
.end method

.method public final 飘花落叶言楪世苏子哲兰()Ljava/time/LocalTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/16 v1, 0x27

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "localTime only support string input"

    .line 14
    .line 15
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 22
    .line 23
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏楪哲兰世(I[C)Ljava/time/LocalTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    return-object v2

    .line 30
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x9

    .line 33
    .line 34
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 37
    .line 38
    .line 39
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 40
    .line 41
    const/16 v2, 0x2c

    .line 42
    .line 43
    if-ne v1, v2, :cond_3

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    const/4 v1, 0x0

    .line 48
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 49
    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 53
    .line 54
    .line 55
    :cond_4
    return-object v0
.end method

.method public final 飘花落叶言楪子世兰苏哲()J
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 6
    .line 7
    const/16 v3, 0x22

    .line 8
    .line 9
    iget-object v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    const/16 v3, 0x27

    .line 14
    .line 15
    if-ne v1, v3, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v3, v2

    .line 19
    const/4 v2, 0x0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    add-int/lit8 v3, v2, 0x1

    .line 22
    .line 23
    aget-char v2, v4, v2

    .line 24
    .line 25
    move/from16 v21, v2

    .line 26
    .line 27
    move v2, v1

    .line 28
    move/from16 v1, v21

    .line 29
    .line 30
    :goto_1
    const/16 v6, 0x30

    .line 31
    .line 32
    const/16 v9, 0x2d

    .line 33
    .line 34
    const-wide/16 v10, 0x0

    .line 35
    .line 36
    if-lt v1, v6, :cond_2

    .line 37
    .line 38
    const/16 v6, 0x39

    .line 39
    .line 40
    if-gt v1, v6, :cond_2

    .line 41
    .line 42
    rsub-int/lit8 v6, v1, 0x30

    .line 43
    .line 44
    int-to-long v12, v6

    .line 45
    goto :goto_3

    .line 46
    :cond_2
    if-eq v1, v9, :cond_4

    .line 47
    .line 48
    const/16 v6, 0x2b

    .line 49
    .line 50
    if-ne v1, v6, :cond_3

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    const-wide/16 v12, 0x1

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_4
    :goto_2
    move-wide v12, v10

    .line 57
    :goto_3
    add-int/lit8 v6, v3, 0x1

    .line 58
    .line 59
    const/4 v14, 0x1

    .line 60
    iget v15, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 61
    .line 62
    if-ge v6, v15, :cond_7

    .line 63
    .line 64
    invoke-static {v3, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    const-wide/16 v16, 0x1

    .line 69
    .line 70
    const/4 v7, -0x1

    .line 71
    if-eq v5, v7, :cond_8

    .line 72
    .line 73
    const-wide v7, -0x147ae147ae147aeL

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    cmp-long v7, v7, v12

    .line 79
    .line 80
    if-gtz v7, :cond_5

    .line 81
    .line 82
    move v7, v14

    .line 83
    goto :goto_4

    .line 84
    :cond_5
    const/4 v7, 0x0

    .line 85
    :goto_4
    cmp-long v8, v12, v10

    .line 86
    .line 87
    if-gtz v8, :cond_6

    .line 88
    .line 89
    move v8, v14

    .line 90
    goto :goto_5

    .line 91
    :cond_6
    const/4 v8, 0x0

    .line 92
    :goto_5
    and-int/2addr v7, v8

    .line 93
    if-eqz v7, :cond_8

    .line 94
    .line 95
    const-wide/16 v6, 0x64

    .line 96
    .line 97
    mul-long/2addr v12, v6

    .line 98
    int-to-long v5, v5

    .line 99
    sub-long/2addr v12, v5

    .line 100
    add-int/lit8 v3, v3, 0x2

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_7
    const-wide/16 v16, 0x1

    .line 104
    .line 105
    :cond_8
    if-ge v3, v15, :cond_b

    .line 106
    .line 107
    aget-char v5, v4, v3

    .line 108
    .line 109
    invoke-static {v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲楪兰苏(I)Z

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    if-eqz v7, :cond_b

    .line 114
    .line 115
    const-wide v7, -0xcccccccccccccccL

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    cmp-long v7, v7, v12

    .line 121
    .line 122
    if-gtz v7, :cond_9

    .line 123
    .line 124
    move v7, v14

    .line 125
    goto :goto_6

    .line 126
    :cond_9
    const/4 v7, 0x0

    .line 127
    :goto_6
    cmp-long v8, v12, v10

    .line 128
    .line 129
    if-gtz v8, :cond_a

    .line 130
    .line 131
    move v8, v14

    .line 132
    goto :goto_7

    .line 133
    :cond_a
    const/4 v8, 0x0

    .line 134
    :goto_7
    and-int/2addr v7, v8

    .line 135
    if-eqz v7, :cond_b

    .line 136
    .line 137
    const-wide/16 v7, 0xa

    .line 138
    .line 139
    mul-long/2addr v12, v7

    .line 140
    const-wide/16 v7, 0x30

    .line 141
    .line 142
    add-long/2addr v12, v7

    .line 143
    int-to-long v7, v5

    .line 144
    sub-long/2addr v12, v7

    .line 145
    move v3, v6

    .line 146
    :cond_b
    if-ne v3, v15, :cond_c

    .line 147
    .line 148
    move v6, v3

    .line 149
    const/16 v3, 0x1a

    .line 150
    .line 151
    goto :goto_8

    .line 152
    :cond_c
    add-int/lit8 v6, v3, 0x1

    .line 153
    .line 154
    aget-char v3, v4, v3

    .line 155
    .line 156
    :goto_8
    cmp-long v7, v12, v10

    .line 157
    .line 158
    if-gtz v7, :cond_1b

    .line 159
    .line 160
    const-wide/high16 v7, -0x8000000000000000L

    .line 161
    .line 162
    cmp-long v7, v7, v12

    .line 163
    .line 164
    if-ltz v7, :cond_d

    .line 165
    .line 166
    if-ne v1, v9, :cond_1b

    .line 167
    .line 168
    :cond_d
    and-int/lit16 v7, v3, 0xff

    .line 169
    .line 170
    sget-object v8, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪兰苏:[Z

    .line 171
    .line 172
    aget-boolean v7, v8, v7

    .line 173
    .line 174
    if-eqz v7, :cond_1b

    .line 175
    .line 176
    if-eqz v2, :cond_e

    .line 177
    .line 178
    if-ne v3, v2, :cond_1b

    .line 179
    .line 180
    :cond_e
    if-eqz v2, :cond_10

    .line 181
    .line 182
    if-ne v6, v15, :cond_f

    .line 183
    .line 184
    const/16 v3, 0x1a

    .line 185
    .line 186
    goto :goto_9

    .line 187
    :cond_f
    add-int/lit8 v2, v6, 0x1

    .line 188
    .line 189
    aget-char v3, v4, v6

    .line 190
    .line 191
    move v6, v2

    .line 192
    :cond_10
    :goto_9
    const/16 v2, 0x4c

    .line 193
    .line 194
    if-eq v3, v2, :cond_11

    .line 195
    .line 196
    const/16 v2, 0x46

    .line 197
    .line 198
    if-eq v3, v2, :cond_11

    .line 199
    .line 200
    const/16 v2, 0x44

    .line 201
    .line 202
    if-eq v3, v2, :cond_11

    .line 203
    .line 204
    const/16 v2, 0x42

    .line 205
    .line 206
    if-eq v3, v2, :cond_11

    .line 207
    .line 208
    const/16 v2, 0x53

    .line 209
    .line 210
    if-ne v3, v2, :cond_13

    .line 211
    .line 212
    :cond_11
    if-ne v6, v15, :cond_12

    .line 213
    .line 214
    :goto_a
    const/16 v3, 0x1a

    .line 215
    .line 216
    goto :goto_c

    .line 217
    :cond_12
    add-int/lit8 v2, v6, 0x1

    .line 218
    .line 219
    aget-char v3, v4, v6

    .line 220
    .line 221
    :goto_b
    move v6, v2

    .line 222
    :cond_13
    :goto_c
    const-wide v7, 0x100003700L

    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    const/16 v2, 0x20

    .line 228
    .line 229
    if-gt v3, v2, :cond_15

    .line 230
    .line 231
    shl-long v18, v16, v3

    .line 232
    .line 233
    and-long v18, v18, v7

    .line 234
    .line 235
    cmp-long v18, v18, v10

    .line 236
    .line 237
    if-eqz v18, :cond_15

    .line 238
    .line 239
    if-ne v6, v15, :cond_14

    .line 240
    .line 241
    goto :goto_a

    .line 242
    :cond_14
    add-int/lit8 v2, v6, 0x1

    .line 243
    .line 244
    aget-char v3, v4, v6

    .line 245
    .line 246
    goto :goto_b

    .line 247
    :cond_15
    const/16 v5, 0x2c

    .line 248
    .line 249
    if-ne v3, v5, :cond_16

    .line 250
    .line 251
    move v5, v14

    .line 252
    goto :goto_d

    .line 253
    :cond_16
    const/4 v5, 0x0

    .line 254
    :goto_d
    iput-boolean v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 255
    .line 256
    if-eqz v5, :cond_19

    .line 257
    .line 258
    if-ne v6, v15, :cond_17

    .line 259
    .line 260
    const/16 v5, 0x1a

    .line 261
    .line 262
    goto :goto_e

    .line 263
    :cond_17
    add-int/lit8 v3, v6, 0x1

    .line 264
    .line 265
    aget-char v5, v4, v6

    .line 266
    .line 267
    goto :goto_10

    .line 268
    :goto_e
    move v3, v5

    .line 269
    :goto_f
    if-gt v3, v2, :cond_19

    .line 270
    .line 271
    shl-long v19, v16, v3

    .line 272
    .line 273
    and-long v19, v19, v7

    .line 274
    .line 275
    cmp-long v5, v19, v10

    .line 276
    .line 277
    if-eqz v5, :cond_19

    .line 278
    .line 279
    if-ne v6, v15, :cond_18

    .line 280
    .line 281
    const/16 v3, 0x1a

    .line 282
    .line 283
    goto :goto_f

    .line 284
    :cond_18
    add-int/lit8 v3, v6, 0x1

    .line 285
    .line 286
    aget-char v5, v4, v6

    .line 287
    .line 288
    :goto_10
    move v6, v3

    .line 289
    goto :goto_e

    .line 290
    :cond_19
    iput-char v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 291
    .line 292
    iput v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 293
    .line 294
    if-ne v1, v9, :cond_1a

    .line 295
    .line 296
    return-wide v12

    .line 297
    :cond_1a
    neg-long v0, v12

    .line 298
    return-wide v0

    .line 299
    :cond_1b
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏世哲兰()J

    .line 300
    .line 301
    .line 302
    move-result-wide v0

    .line 303
    return-wide v0
.end method

.method public final 飘花落叶言楪子世哲兰苏()Ljava/lang/Long;
    .locals 2

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    const/16 v1, 0x6e

    .line 12
    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子哲苏楪世兰()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪子世兰苏哲()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public final 飘花落叶言楪子世苏兰哲()I
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 6
    .line 7
    const/16 v3, 0x22

    .line 8
    .line 9
    iget-object v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    const/16 v3, 0x27

    .line 14
    .line 15
    if-ne v1, v3, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v3, v2

    .line 19
    const/4 v2, 0x0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    add-int/lit8 v3, v2, 0x1

    .line 22
    .line 23
    aget-char v2, v4, v2

    .line 24
    .line 25
    move/from16 v20, v2

    .line 26
    .line 27
    move v2, v1

    .line 28
    move/from16 v1, v20

    .line 29
    .line 30
    :goto_1
    const/16 v6, 0x2d

    .line 31
    .line 32
    const/16 v7, 0x30

    .line 33
    .line 34
    const/4 v8, 0x1

    .line 35
    if-lt v1, v7, :cond_2

    .line 36
    .line 37
    const/16 v9, 0x39

    .line 38
    .line 39
    if-gt v1, v9, :cond_2

    .line 40
    .line 41
    rsub-int/lit8 v9, v1, 0x30

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_2
    if-eq v1, v6, :cond_4

    .line 45
    .line 46
    const/16 v9, 0x2b

    .line 47
    .line 48
    if-ne v1, v9, :cond_3

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_3
    move v9, v8

    .line 52
    goto :goto_3

    .line 53
    :cond_4
    :goto_2
    const/4 v9, 0x0

    .line 54
    :goto_3
    add-int/lit8 v10, v3, 0x1

    .line 55
    .line 56
    iget v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 57
    .line 58
    if-ge v10, v11, :cond_7

    .line 59
    .line 60
    invoke-static {v3, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 61
    .line 62
    .line 63
    move-result v12

    .line 64
    const/4 v13, -0x1

    .line 65
    if-eq v12, v13, :cond_7

    .line 66
    .line 67
    const v13, -0x147ae14

    .line 68
    .line 69
    .line 70
    if-gt v13, v9, :cond_5

    .line 71
    .line 72
    move v13, v8

    .line 73
    goto :goto_4

    .line 74
    :cond_5
    const/4 v13, 0x0

    .line 75
    :goto_4
    if-gtz v9, :cond_6

    .line 76
    .line 77
    move v14, v8

    .line 78
    goto :goto_5

    .line 79
    :cond_6
    const/4 v14, 0x0

    .line 80
    :goto_5
    and-int/2addr v13, v14

    .line 81
    if-eqz v13, :cond_7

    .line 82
    .line 83
    mul-int/lit8 v9, v9, 0x64

    .line 84
    .line 85
    sub-int/2addr v9, v12

    .line 86
    add-int/lit8 v3, v3, 0x2

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_7
    if-ge v3, v11, :cond_a

    .line 90
    .line 91
    aget-char v12, v4, v3

    .line 92
    .line 93
    invoke-static {v12}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲楪兰苏(I)Z

    .line 94
    .line 95
    .line 96
    move-result v13

    .line 97
    if-eqz v13, :cond_a

    .line 98
    .line 99
    const v13, -0xccccccc

    .line 100
    .line 101
    .line 102
    if-gt v13, v9, :cond_8

    .line 103
    .line 104
    move v13, v8

    .line 105
    goto :goto_6

    .line 106
    :cond_8
    const/4 v13, 0x0

    .line 107
    :goto_6
    if-gtz v9, :cond_9

    .line 108
    .line 109
    move v14, v8

    .line 110
    goto :goto_7

    .line 111
    :cond_9
    const/4 v14, 0x0

    .line 112
    :goto_7
    and-int/2addr v13, v14

    .line 113
    if-eqz v13, :cond_a

    .line 114
    .line 115
    mul-int/lit8 v9, v9, 0xa

    .line 116
    .line 117
    add-int/2addr v9, v7

    .line 118
    sub-int/2addr v9, v12

    .line 119
    move v3, v10

    .line 120
    :cond_a
    const/16 v7, 0x1a

    .line 121
    .line 122
    if-ne v3, v11, :cond_b

    .line 123
    .line 124
    move v10, v3

    .line 125
    move v3, v7

    .line 126
    goto :goto_8

    .line 127
    :cond_b
    add-int/lit8 v10, v3, 0x1

    .line 128
    .line 129
    aget-char v3, v4, v3

    .line 130
    .line 131
    :goto_8
    if-gtz v9, :cond_1a

    .line 132
    .line 133
    const/high16 v12, -0x80000000

    .line 134
    .line 135
    if-lt v12, v9, :cond_c

    .line 136
    .line 137
    if-ne v1, v6, :cond_1a

    .line 138
    .line 139
    :cond_c
    and-int/lit16 v12, v3, 0xff

    .line 140
    .line 141
    sget-object v13, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪兰苏:[Z

    .line 142
    .line 143
    aget-boolean v12, v13, v12

    .line 144
    .line 145
    if-eqz v12, :cond_1a

    .line 146
    .line 147
    if-eqz v2, :cond_d

    .line 148
    .line 149
    if-ne v3, v2, :cond_1a

    .line 150
    .line 151
    :cond_d
    if-eqz v2, :cond_f

    .line 152
    .line 153
    if-ne v10, v11, :cond_e

    .line 154
    .line 155
    move v3, v7

    .line 156
    goto :goto_9

    .line 157
    :cond_e
    add-int/lit8 v2, v10, 0x1

    .line 158
    .line 159
    aget-char v3, v4, v10

    .line 160
    .line 161
    move v10, v2

    .line 162
    :cond_f
    :goto_9
    const/16 v2, 0x4c

    .line 163
    .line 164
    if-eq v3, v2, :cond_10

    .line 165
    .line 166
    const/16 v2, 0x46

    .line 167
    .line 168
    if-eq v3, v2, :cond_10

    .line 169
    .line 170
    const/16 v2, 0x44

    .line 171
    .line 172
    if-eq v3, v2, :cond_10

    .line 173
    .line 174
    const/16 v2, 0x42

    .line 175
    .line 176
    if-eq v3, v2, :cond_10

    .line 177
    .line 178
    const/16 v2, 0x53

    .line 179
    .line 180
    if-ne v3, v2, :cond_12

    .line 181
    .line 182
    :cond_10
    if-ne v10, v11, :cond_11

    .line 183
    .line 184
    :goto_a
    move v3, v7

    .line 185
    goto :goto_c

    .line 186
    :cond_11
    add-int/lit8 v2, v10, 0x1

    .line 187
    .line 188
    aget-char v3, v4, v10

    .line 189
    .line 190
    :goto_b
    move v10, v2

    .line 191
    :cond_12
    :goto_c
    const-wide/16 v12, 0x0

    .line 192
    .line 193
    const-wide v14, 0x100003700L

    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    const-wide/16 v16, 0x1

    .line 199
    .line 200
    const/16 v2, 0x20

    .line 201
    .line 202
    if-gt v3, v2, :cond_14

    .line 203
    .line 204
    shl-long v18, v16, v3

    .line 205
    .line 206
    and-long v18, v18, v14

    .line 207
    .line 208
    cmp-long v18, v18, v12

    .line 209
    .line 210
    if-eqz v18, :cond_14

    .line 211
    .line 212
    if-ne v10, v11, :cond_13

    .line 213
    .line 214
    goto :goto_a

    .line 215
    :cond_13
    add-int/lit8 v2, v10, 0x1

    .line 216
    .line 217
    aget-char v3, v4, v10

    .line 218
    .line 219
    goto :goto_b

    .line 220
    :cond_14
    const/16 v5, 0x2c

    .line 221
    .line 222
    if-ne v3, v5, :cond_15

    .line 223
    .line 224
    move v5, v8

    .line 225
    goto :goto_d

    .line 226
    :cond_15
    const/4 v5, 0x0

    .line 227
    :goto_d
    iput-boolean v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 228
    .line 229
    if-eqz v5, :cond_18

    .line 230
    .line 231
    if-ne v10, v11, :cond_16

    .line 232
    .line 233
    move v5, v7

    .line 234
    goto :goto_e

    .line 235
    :cond_16
    add-int/lit8 v3, v10, 0x1

    .line 236
    .line 237
    aget-char v5, v4, v10

    .line 238
    .line 239
    goto :goto_10

    .line 240
    :goto_e
    move v3, v5

    .line 241
    :goto_f
    if-gt v3, v2, :cond_18

    .line 242
    .line 243
    shl-long v18, v16, v3

    .line 244
    .line 245
    and-long v18, v18, v14

    .line 246
    .line 247
    cmp-long v5, v18, v12

    .line 248
    .line 249
    if-eqz v5, :cond_18

    .line 250
    .line 251
    if-ne v10, v11, :cond_17

    .line 252
    .line 253
    move v3, v7

    .line 254
    goto :goto_f

    .line 255
    :cond_17
    add-int/lit8 v3, v10, 0x1

    .line 256
    .line 257
    aget-char v5, v4, v10

    .line 258
    .line 259
    :goto_10
    move v10, v3

    .line 260
    goto :goto_e

    .line 261
    :cond_18
    iput-char v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 262
    .line 263
    iput v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 264
    .line 265
    if-ne v1, v6, :cond_19

    .line 266
    .line 267
    return v9

    .line 268
    :cond_19
    neg-int v0, v9

    .line 269
    return v0

    .line 270
    :cond_1a
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世哲苏兰()I

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    return v0
.end method

.method public final 飘花落叶言楪子世苏哲兰()Ljava/lang/Integer;
    .locals 2

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    const/16 v1, 0x6e

    .line 12
    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子哲苏楪世兰()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪子世苏兰哲()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public final 飘花落叶言楪子兰世哲苏()Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/16 v1, 0x27

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "date only support string input"

    .line 14
    .line 15
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 22
    .line 23
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲苏兰楪(I[C)Ljava/time/LocalDateTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    return-object v2

    .line 30
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x15

    .line 33
    .line 34
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 37
    .line 38
    .line 39
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 40
    .line 41
    const/16 v2, 0x2c

    .line 42
    .line 43
    if-ne v1, v2, :cond_3

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    const/4 v1, 0x0

    .line 48
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 49
    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 53
    .line 54
    .line 55
    :cond_4
    return-object v0
.end method

.method public final 飘花落叶言楪子兰世苏哲()Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/16 v1, 0x27

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "date only support string input"

    .line 14
    .line 15
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 22
    .line 23
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲楪兰苏(I[C)Ljava/time/LocalDateTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    return-object v2

    .line 30
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x14

    .line 33
    .line 34
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 37
    .line 38
    .line 39
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 40
    .line 41
    const/16 v2, 0x2c

    .line 42
    .line 43
    if-ne v1, v2, :cond_3

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    const/4 v1, 0x0

    .line 48
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 49
    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 53
    .line 54
    .line 55
    :cond_4
    return-object v0
.end method

.method public final 飘花落叶言楪子兰哲世苏()Ljava/time/LocalTime;
    .locals 6

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/16 v1, 0x27

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "localTime only support string input"

    .line 14
    .line 15
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_1
    :goto_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 22
    .line 23
    add-int/lit8 v1, v0, 0xa

    .line 24
    .line 25
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 26
    .line 27
    array-length v4, v3

    .line 28
    if-gt v1, v4, :cond_4

    .line 29
    .line 30
    add-int/lit8 v1, v0, 0x2

    .line 31
    .line 32
    aget-char v1, v3, v1

    .line 33
    .line 34
    const/16 v4, 0x3a

    .line 35
    .line 36
    if-ne v1, v4, :cond_4

    .line 37
    .line 38
    add-int/lit8 v1, v0, 0x5

    .line 39
    .line 40
    aget-char v1, v3, v1

    .line 41
    .line 42
    if-ne v1, v4, :cond_4

    .line 43
    .line 44
    add-int/lit8 v1, v0, 0x8

    .line 45
    .line 46
    aget-char v1, v3, v1

    .line 47
    .line 48
    const/16 v4, 0x2e

    .line 49
    .line 50
    if-eq v1, v4, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    add-int/lit8 v4, v0, 0x3

    .line 58
    .line 59
    invoke-static {v4, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    add-int/lit8 v5, v0, 0x6

    .line 64
    .line 65
    invoke-static {v5, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    add-int/lit8 v0, v0, 0x9

    .line 70
    .line 71
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰(I[C)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-lez v0, :cond_3

    .line 76
    .line 77
    const v3, 0x5f5e100

    .line 78
    .line 79
    .line 80
    mul-int/2addr v0, v3

    .line 81
    :cond_3
    or-int v3, v1, v4

    .line 82
    .line 83
    or-int/2addr v3, v5

    .line 84
    or-int/2addr v3, v4

    .line 85
    if-gez v3, :cond_5

    .line 86
    .line 87
    :cond_4
    :goto_1
    move-object v0, v2

    .line 88
    goto :goto_2

    .line 89
    :cond_5
    invoke-static {v1, v4, v5, v0}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    :goto_2
    if-nez v0, :cond_6

    .line 94
    .line 95
    return-object v2

    .line 96
    :cond_6
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 97
    .line 98
    add-int/lit8 v1, v1, 0xb

    .line 99
    .line 100
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 101
    .line 102
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 103
    .line 104
    .line 105
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 106
    .line 107
    const/16 v2, 0x2c

    .line 108
    .line 109
    if-ne v1, v2, :cond_7

    .line 110
    .line 111
    const/4 v1, 0x1

    .line 112
    goto :goto_3

    .line 113
    :cond_7
    const/4 v1, 0x0

    .line 114
    :goto_3
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 115
    .line 116
    if-eqz v1, :cond_8

    .line 117
    .line 118
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 119
    .line 120
    .line 121
    :cond_8
    return-object v0
.end method

.method public final 飘花落叶言楪子兰哲苏世()Ljava/time/LocalTime;
    .locals 6

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/16 v1, 0x27

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "localTime only support string input"

    .line 14
    .line 15
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_1
    :goto_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 22
    .line 23
    add-int/lit8 v1, v0, 0xb

    .line 24
    .line 25
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 26
    .line 27
    array-length v4, v3

    .line 28
    if-gt v1, v4, :cond_4

    .line 29
    .line 30
    add-int/lit8 v1, v0, 0x2

    .line 31
    .line 32
    aget-char v1, v3, v1

    .line 33
    .line 34
    const/16 v4, 0x3a

    .line 35
    .line 36
    if-ne v1, v4, :cond_4

    .line 37
    .line 38
    add-int/lit8 v1, v0, 0x5

    .line 39
    .line 40
    aget-char v1, v3, v1

    .line 41
    .line 42
    if-ne v1, v4, :cond_4

    .line 43
    .line 44
    add-int/lit8 v1, v0, 0x8

    .line 45
    .line 46
    aget-char v1, v3, v1

    .line 47
    .line 48
    const/16 v4, 0x2e

    .line 49
    .line 50
    if-eq v1, v4, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    add-int/lit8 v4, v0, 0x3

    .line 58
    .line 59
    invoke-static {v4, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    add-int/lit8 v5, v0, 0x6

    .line 64
    .line 65
    invoke-static {v5, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    add-int/lit8 v0, v0, 0x9

    .line 70
    .line 71
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-lez v0, :cond_3

    .line 76
    .line 77
    const v3, 0x989680

    .line 78
    .line 79
    .line 80
    mul-int/2addr v0, v3

    .line 81
    :cond_3
    or-int v3, v1, v4

    .line 82
    .line 83
    or-int/2addr v3, v5

    .line 84
    or-int/2addr v3, v4

    .line 85
    if-gez v3, :cond_5

    .line 86
    .line 87
    :cond_4
    :goto_1
    move-object v0, v2

    .line 88
    goto :goto_2

    .line 89
    :cond_5
    invoke-static {v1, v4, v5, v0}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    :goto_2
    if-nez v0, :cond_6

    .line 94
    .line 95
    return-object v2

    .line 96
    :cond_6
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 97
    .line 98
    add-int/lit8 v1, v1, 0xc

    .line 99
    .line 100
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 101
    .line 102
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 103
    .line 104
    .line 105
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 106
    .line 107
    const/16 v2, 0x2c

    .line 108
    .line 109
    if-ne v1, v2, :cond_7

    .line 110
    .line 111
    const/4 v1, 0x1

    .line 112
    goto :goto_3

    .line 113
    :cond_7
    const/4 v1, 0x0

    .line 114
    :goto_3
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 115
    .line 116
    if-eqz v1, :cond_8

    .line 117
    .line 118
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 119
    .line 120
    .line 121
    :cond_8
    return-object v0
.end method

.method public final 飘花落叶言楪子兰苏世哲(I)Ljava/time/LocalDateTime;
    .locals 6

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/16 v1, 0x27

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "date only support string input"

    .line 14
    .line 15
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_1
    :goto_0
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    add-int v1, v0, p1

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    sub-int/2addr v1, v3

    .line 25
    iget-object v4, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 26
    .line 27
    aget-char v1, v4, v1

    .line 28
    .line 29
    const/16 v5, 0x5a

    .line 30
    .line 31
    if-ne v1, v5, :cond_2

    .line 32
    .line 33
    sget-object v1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 34
    .line 35
    invoke-static {v4, v0, p1, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏世兰哲楪([CIILjava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v0}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Ljava/time/ZonedDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-static {v0, p1, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲兰苏楪(II[C)Ljava/time/LocalDateTime;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :goto_1
    if-nez v0, :cond_3

    .line 63
    .line 64
    return-object v2

    .line 65
    :cond_3
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 66
    .line 67
    add-int/2addr p1, v3

    .line 68
    add-int/2addr p1, v1

    .line 69
    iput p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 72
    .line 73
    .line 74
    iget-char p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 75
    .line 76
    const/16 v1, 0x2c

    .line 77
    .line 78
    if-ne p1, v1, :cond_4

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    const/4 v3, 0x0

    .line 82
    :goto_2
    iput-boolean v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 83
    .line 84
    if-eqz v3, :cond_5

    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 87
    .line 88
    .line 89
    :cond_5
    return-object v0
.end method

.method public final 飘花落叶言楪子哲世兰苏()Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/16 v1, 0x27

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "date only support string input"

    .line 14
    .line 15
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 22
    .line 23
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪哲兰苏(I[C)Ljava/time/LocalDateTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    return-object v2

    .line 30
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0xd

    .line 33
    .line 34
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 37
    .line 38
    .line 39
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 40
    .line 41
    const/16 v2, 0x2c

    .line 42
    .line 43
    if-ne v1, v2, :cond_3

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    const/4 v1, 0x0

    .line 48
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 49
    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 53
    .line 54
    .line 55
    :cond_4
    return-object v0
.end method

.method public final 飘花落叶言楪子哲兰世苏()Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/16 v1, 0x27

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "date only support string input"

    .line 14
    .line 15
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 22
    .line 23
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏哲兰楪(I[C)Ljava/time/LocalDateTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    return-object v2

    .line 30
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x12

    .line 33
    .line 34
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 37
    .line 38
    .line 39
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 40
    .line 41
    const/16 v2, 0x2c

    .line 42
    .line 43
    if-ne v1, v2, :cond_3

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    const/4 v1, 0x0

    .line 48
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 49
    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 53
    .line 54
    .line 55
    :cond_4
    return-object v0
.end method

.method public final 飘花落叶言楪子哲兰苏世()Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p0, "date only support string input"

    .line 13
    .line 14
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 22
    .line 23
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏兰哲楪(I[C)Ljava/time/LocalDateTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x13

    .line 30
    .line 31
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 34
    .line 35
    .line 36
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 37
    .line 38
    const/16 v2, 0x2c

    .line 39
    .line 40
    if-ne v1, v2, :cond_2

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    const/4 v1, 0x0

    .line 45
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 46
    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 50
    .line 51
    .line 52
    :cond_3
    return-object v0
.end method

.method public final 飘花落叶言楪子哲苏世兰()Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/16 v1, 0x27

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "date only support string input"

    .line 14
    .line 15
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 22
    .line 23
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世楪兰哲苏(I[C)Ljava/time/LocalDateTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    return-object v2

    .line 30
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0xf

    .line 33
    .line 34
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 37
    .line 38
    .line 39
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 40
    .line 41
    const/16 v2, 0x2c

    .line 42
    .line 43
    if-ne v1, v2, :cond_3

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    const/4 v1, 0x0

    .line 48
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 49
    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 53
    .line 54
    .line 55
    :cond_4
    return-object v0
.end method

.method public final 飘花落叶言楪子哲苏兰世()Ljava/time/LocalDateTime;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/16 v1, 0x27

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "date only support string input"

    .line 14
    .line 15
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 22
    .line 23
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪兰哲(I[C)Ljava/time/LocalDateTime;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    return-object v2

    .line 30
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x11

    .line 33
    .line 34
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 37
    .line 38
    .line 39
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 40
    .line 41
    const/16 v2, 0x2c

    .line 42
    .line 43
    if-ne v1, v2, :cond_3

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    const/4 v1, 0x0

    .line 48
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 49
    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 53
    .line 54
    .line 55
    :cond_4
    return-object v0
.end method

.method public final 飘花落叶言楪子苏世兰哲()Ljava/time/LocalDate;
    .locals 13

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 4
    .line 5
    const/16 v2, 0x22

    .line 6
    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    const/16 v2, 0x27

    .line 10
    .line 11
    if-ne v1, v2, :cond_a

    .line 12
    .line 13
    :cond_0
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    add-int/lit8 v2, v0, 0xa

    .line 19
    .line 20
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 21
    .line 22
    array-length v4, v3

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x1

    .line 25
    const/16 v7, 0x2c

    .line 26
    .line 27
    const/4 v8, 0x0

    .line 28
    iget v9, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 29
    .line 30
    const/16 v10, 0x2d

    .line 31
    .line 32
    if-ge v2, v4, :cond_5

    .line 33
    .line 34
    if-ge v2, v9, :cond_5

    .line 35
    .line 36
    add-int/lit8 v4, v0, 0x4

    .line 37
    .line 38
    aget-char v4, v3, v4

    .line 39
    .line 40
    if-ne v4, v10, :cond_5

    .line 41
    .line 42
    add-int/lit8 v4, v0, 0x7

    .line 43
    .line 44
    aget-char v4, v3, v4

    .line 45
    .line 46
    if-ne v4, v10, :cond_5

    .line 47
    .line 48
    aget-char v2, v3, v2

    .line 49
    .line 50
    if-ne v2, v1, :cond_5

    .line 51
    .line 52
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    add-int/lit8 v2, v0, 0x5

    .line 57
    .line 58
    invoke-static {v2, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    add-int/lit8 v4, v0, 0x8

    .line 63
    .line 64
    invoke-static {v4, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    or-int v4, v1, v2

    .line 69
    .line 70
    or-int/2addr v4, v3

    .line 71
    const-string v9, "read date error"

    .line 72
    .line 73
    if-ltz v4, :cond_4

    .line 74
    .line 75
    if-nez v4, :cond_1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    :try_start_0
    invoke-static {v1, v2, v3}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 79
    .line 80
    .line 81
    move-result-object v8
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    :goto_0
    add-int/lit8 v0, v0, 0xb

    .line 83
    .line 84
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 87
    .line 88
    .line 89
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 90
    .line 91
    if-ne v0, v7, :cond_2

    .line 92
    .line 93
    move v5, v6

    .line 94
    :cond_2
    iput-boolean v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 95
    .line 96
    if-eqz v5, :cond_3

    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 99
    .line 100
    .line 101
    :cond_3
    return-object v8

    .line 102
    :catch_0
    move-exception v0

    .line 103
    invoke-virtual {p0, v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    return-object v8

    .line 111
    :cond_4
    invoke-virtual {p0, v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    return-object v8

    .line 119
    :cond_5
    add-int/lit8 v2, v0, 0x11

    .line 120
    .line 121
    invoke-static {v2, v9}, Ljava/lang/Math;->min(II)I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    const/4 v4, -0x1

    .line 126
    move v9, v0

    .line 127
    move v11, v4

    .line 128
    :goto_1
    if-ge v9, v2, :cond_7

    .line 129
    .line 130
    aget-char v12, v3, v9

    .line 131
    .line 132
    if-ne v12, v1, :cond_6

    .line 133
    .line 134
    move v11, v9

    .line 135
    :cond_6
    add-int/lit8 v9, v9, 0x1

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_7
    if-eq v11, v4, :cond_9

    .line 139
    .line 140
    sub-int v1, v11, v0

    .line 141
    .line 142
    const/16 v2, 0xa

    .line 143
    .line 144
    if-le v1, v2, :cond_9

    .line 145
    .line 146
    add-int/lit8 v2, v11, -0x6

    .line 147
    .line 148
    aget-char v2, v3, v2

    .line 149
    .line 150
    if-ne v2, v10, :cond_9

    .line 151
    .line 152
    add-int/lit8 v2, v11, -0x3

    .line 153
    .line 154
    aget-char v2, v3, v2

    .line 155
    .line 156
    if-ne v2, v10, :cond_9

    .line 157
    .line 158
    add-int/lit8 v1, v1, -0x6

    .line 159
    .line 160
    invoke-static {v0, v1, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰哲世苏(II[C)I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    add-int/lit8 v1, v11, -0x5

    .line 165
    .line 166
    invoke-static {v1, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    add-int/lit8 v2, v11, -0x2

    .line 171
    .line 172
    invoke-static {v2, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    invoke-static {v0, v1, v2}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    add-int/2addr v11, v6

    .line 181
    iput v11, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 182
    .line 183
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 184
    .line 185
    .line 186
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 187
    .line 188
    if-ne v0, v7, :cond_8

    .line 189
    .line 190
    move v5, v6

    .line 191
    :cond_8
    iput-boolean v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 192
    .line 193
    if-eqz v5, :cond_9

    .line 194
    .line 195
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 196
    .line 197
    .line 198
    :cond_9
    if-eqz v8, :cond_a

    .line 199
    .line 200
    return-object v8

    .line 201
    :cond_a
    invoke-super {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏世兰哲()Ljava/time/LocalDate;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    return-object p0
.end method

.method public final 飘花落叶言楪子苏兰世哲()Ljava/time/LocalDate;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const-string p0, "localDate only support string input"

    .line 13
    .line 14
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_1
    :goto_1
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 22
    .line 23
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰苏世哲(I[C)Ljava/time/LocalDate;

    .line 24
    .line 25
    .line 26
    move-result-object v0
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x9

    .line 30
    .line 31
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 34
    .line 35
    .line 36
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 37
    .line 38
    const/16 v2, 0x2c

    .line 39
    .line 40
    if-ne v1, v2, :cond_2

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    const/4 v1, 0x0

    .line 45
    :goto_2
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 46
    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 50
    .line 51
    .line 52
    :cond_3
    return-object v0

    .line 53
    :catch_0
    move-exception v0

    .line 54
    const-string v1, "read date error"

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {p0, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0
.end method

.method public final 飘花落叶言楪子苏兰哲世()Ljava/time/LocalDate;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const-string p0, "localDate only support string input"

    .line 13
    .line 14
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :cond_1
    :goto_1
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 22
    .line 23
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰哲世苏(I[C)Ljava/time/LocalDate;

    .line 24
    .line 25
    .line 26
    move-result-object v0
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 28
    .line 29
    add-int/lit8 v1, v1, 0xa

    .line 30
    .line 31
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 34
    .line 35
    .line 36
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 37
    .line 38
    const/16 v2, 0x2c

    .line 39
    .line 40
    if-ne v1, v2, :cond_2

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    const/4 v1, 0x0

    .line 45
    :goto_2
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 46
    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 50
    .line 51
    .line 52
    :cond_3
    return-object v0

    .line 53
    :catch_0
    move-exception v0

    .line 54
    const-string v1, "read date error"

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {p0, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0
.end method

.method public final 飘花落叶言楪子苏哲世兰()Ljava/time/LocalDate;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/16 v1, 0x27

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "localDate only support string input"

    .line 14
    .line 15
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_1
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 22
    .line 23
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏(I[C)Ljava/time/LocalDate;

    .line 24
    .line 25
    .line 26
    move-result-object v0
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    return-object v2

    .line 30
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0xb

    .line 33
    .line 34
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 37
    .line 38
    .line 39
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 40
    .line 41
    const/16 v2, 0x2c

    .line 42
    .line 43
    if-ne v1, v2, :cond_3

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    const/4 v1, 0x0

    .line 48
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 49
    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 53
    .line 54
    .line 55
    :cond_4
    return-object v0

    .line 56
    :catch_0
    move-exception v0

    .line 57
    const-string v1, "read date error"

    .line 58
    .line 59
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {p0, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    return-object v2
.end method

.method public final 飘花落叶言楪子苏哲兰世()Ljava/time/LocalDate;
    .locals 3

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eq v0, v1, :cond_1

    .line 7
    .line 8
    const/16 v1, 0x27

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string p0, "localDate only support string input"

    .line 14
    .line 15
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 20
    .line 21
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 22
    .line 23
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世苏哲(I[C)Ljava/time/LocalDate;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    return-object v2

    .line 30
    :cond_2
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 31
    .line 32
    add-int/lit8 v1, v1, 0xc

    .line 33
    .line 34
    iput v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 37
    .line 38
    .line 39
    iget-char v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 40
    .line 41
    const/16 v2, 0x2c

    .line 42
    .line 43
    if-ne v1, v2, :cond_3

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    const/4 v1, 0x0

    .line 48
    :goto_1
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 49
    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 53
    .line 54
    .line 55
    :cond_4
    return-object v0
.end method

.method public final 飘花落叶言楪苏世哲兰子()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 6
    .line 7
    invoke-static {p0, v2, v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏兰子哲世(Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;[CII)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 12
    .line 13
    return-void
.end method

.method public final 飘花落叶言楪苏世哲子兰()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 4
    .line 5
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 6
    .line 7
    invoke-static {p0, v2, v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏兰子世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;[CII)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 12
    .line 13
    return-void
.end method

.method public final 飘花落叶言楪苏世子兰哲()V
    .locals 13

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iget v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 6
    .line 7
    if-ge v1, v2, :cond_a

    .line 8
    .line 9
    iget-object v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 10
    .line 11
    aget-char v4, v3, v0

    .line 12
    .line 13
    const/16 v5, 0x2a

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    const/16 v7, 0x2f

    .line 17
    .line 18
    const/4 v8, 0x1

    .line 19
    if-ne v4, v5, :cond_0

    .line 20
    .line 21
    move v4, v8

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    if-ne v4, v7, :cond_9

    .line 24
    .line 25
    move v4, v6

    .line 26
    :goto_0
    add-int/lit8 v0, v0, 0x2

    .line 27
    .line 28
    aget-char v1, v3, v1

    .line 29
    .line 30
    :goto_1
    if-eqz v4, :cond_2

    .line 31
    .line 32
    if-ne v1, v5, :cond_1

    .line 33
    .line 34
    if-gt v0, v2, :cond_1

    .line 35
    .line 36
    aget-char v1, v3, v0

    .line 37
    .line 38
    if-ne v1, v7, :cond_1

    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    :goto_2
    move v1, v8

    .line 43
    goto :goto_3

    .line 44
    :cond_1
    move v1, v6

    .line 45
    goto :goto_3

    .line 46
    :cond_2
    const/16 v9, 0xa

    .line 47
    .line 48
    if-ne v1, v9, :cond_1

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :goto_3
    const/16 v9, 0x1a

    .line 52
    .line 53
    if-eqz v1, :cond_6

    .line 54
    .line 55
    if-lt v0, v2, :cond_3

    .line 56
    .line 57
    goto :goto_6

    .line 58
    :cond_3
    aget-char v1, v3, v0

    .line 59
    .line 60
    :goto_4
    const/16 v4, 0x20

    .line 61
    .line 62
    if-gt v1, v4, :cond_5

    .line 63
    .line 64
    const-wide/16 v4, 0x1

    .line 65
    .line 66
    shl-long/2addr v4, v1

    .line 67
    const-wide v10, 0x100003700L

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    and-long/2addr v4, v10

    .line 73
    const-wide/16 v10, 0x0

    .line 74
    .line 75
    cmp-long v4, v4, v10

    .line 76
    .line 77
    if-eqz v4, :cond_5

    .line 78
    .line 79
    add-int/lit8 v0, v0, 0x1

    .line 80
    .line 81
    if-lt v0, v2, :cond_4

    .line 82
    .line 83
    goto :goto_5

    .line 84
    :cond_4
    aget-char v1, v3, v0

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_5
    move v9, v1

    .line 88
    :goto_5
    add-int/2addr v0, v8

    .line 89
    goto :goto_6

    .line 90
    :cond_6
    if-lt v0, v2, :cond_8

    .line 91
    .line 92
    :goto_6
    iput-char v9, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 93
    .line 94
    iput v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 95
    .line 96
    if-ne v9, v7, :cond_7

    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏世子兰哲()V

    .line 99
    .line 100
    .line 101
    :cond_7
    return-void

    .line 102
    :cond_8
    add-int/lit8 v1, v0, 0x1

    .line 103
    .line 104
    aget-char v0, v3, v0

    .line 105
    .line 106
    move v12, v1

    .line 107
    move v1, v0

    .line 108
    move v0, v12

    .line 109
    goto :goto_1

    .line 110
    :cond_9
    const-string v0, "parse comment error"

    .line 111
    .line 112
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_a
    const/4 v0, 0x0

    .line 121
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method public final 飘花落叶言楪苏子兰哲世(I)Ljava/time/ZonedDateTime;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-char v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 6
    .line 7
    const/16 v3, 0x22

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-eq v2, v3, :cond_1

    .line 11
    .line 12
    const/16 v3, 0x27

    .line 13
    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v0, "date only support string input"

    .line 18
    .line 19
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v4

    .line 23
    :cond_1
    :goto_0
    const/16 v2, 0x13

    .line 24
    .line 25
    if-ge v1, v2, :cond_2

    .line 26
    .line 27
    return-object v4

    .line 28
    :cond_2
    const/16 v2, 0x1e

    .line 29
    .line 30
    const/16 v3, 0x3c

    .line 31
    .line 32
    const/16 v5, 0x3b

    .line 33
    .line 34
    const/16 v6, 0x18

    .line 35
    .line 36
    const/16 v7, 0x2e

    .line 37
    .line 38
    const/16 v8, 0x54

    .line 39
    .line 40
    const/16 v9, 0x20

    .line 41
    .line 42
    const/16 v10, 0x2d

    .line 43
    .line 44
    const/16 v11, 0x3a

    .line 45
    .line 46
    const/16 v12, 0x5a

    .line 47
    .line 48
    iget-object v13, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 49
    .line 50
    if-ne v1, v2, :cond_7

    .line 51
    .line 52
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 53
    .line 54
    add-int/lit8 v14, v2, 0x1d

    .line 55
    .line 56
    aget-char v14, v13, v14

    .line 57
    .line 58
    if-ne v14, v12, :cond_7

    .line 59
    .line 60
    sget-object v12, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 61
    .line 62
    add-int/lit8 v12, v2, 0x1d

    .line 63
    .line 64
    array-length v14, v13

    .line 65
    if-gt v12, v14, :cond_6

    .line 66
    .line 67
    add-int/lit8 v12, v2, 0x4

    .line 68
    .line 69
    aget-char v12, v13, v12

    .line 70
    .line 71
    if-ne v12, v10, :cond_6

    .line 72
    .line 73
    add-int/lit8 v12, v2, 0x7

    .line 74
    .line 75
    aget-char v12, v13, v12

    .line 76
    .line 77
    if-ne v12, v10, :cond_6

    .line 78
    .line 79
    add-int/lit8 v10, v2, 0xa

    .line 80
    .line 81
    aget-char v10, v13, v10

    .line 82
    .line 83
    if-eq v10, v9, :cond_3

    .line 84
    .line 85
    if-ne v10, v8, :cond_6

    .line 86
    .line 87
    :cond_3
    add-int/lit8 v8, v2, 0xd

    .line 88
    .line 89
    aget-char v8, v13, v8

    .line 90
    .line 91
    if-ne v8, v11, :cond_6

    .line 92
    .line 93
    add-int/lit8 v8, v2, 0x10

    .line 94
    .line 95
    aget-char v8, v13, v8

    .line 96
    .line 97
    if-ne v8, v11, :cond_6

    .line 98
    .line 99
    add-int/lit8 v8, v2, 0x13

    .line 100
    .line 101
    aget-char v8, v13, v8

    .line 102
    .line 103
    if-eq v8, v7, :cond_4

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_4
    invoke-static {v2, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 107
    .line 108
    .line 109
    move-result v14

    .line 110
    add-int/lit8 v7, v2, 0x5

    .line 111
    .line 112
    invoke-static {v7, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 113
    .line 114
    .line 115
    move-result v15

    .line 116
    add-int/lit8 v7, v2, 0x8

    .line 117
    .line 118
    invoke-static {v7, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 119
    .line 120
    .line 121
    move-result v16

    .line 122
    add-int/lit8 v7, v2, 0xb

    .line 123
    .line 124
    invoke-static {v7, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    add-int/lit8 v8, v2, 0xe

    .line 129
    .line 130
    invoke-static {v8, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    add-int/lit8 v9, v2, 0x11

    .line 135
    .line 136
    invoke-static {v9, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 137
    .line 138
    .line 139
    move-result v9

    .line 140
    const/16 v10, 0x9

    .line 141
    .line 142
    add-int/lit8 v2, v2, 0x14

    .line 143
    .line 144
    invoke-static {v10, v2, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏哲楪兰世(II[C)I

    .line 145
    .line 146
    .line 147
    move-result v20

    .line 148
    or-int v2, v14, v15

    .line 149
    .line 150
    or-int v2, v2, v16

    .line 151
    .line 152
    or-int/2addr v2, v7

    .line 153
    or-int/2addr v2, v8

    .line 154
    or-int/2addr v2, v9

    .line 155
    or-int v2, v2, v20

    .line 156
    .line 157
    if-lez v2, :cond_6

    .line 158
    .line 159
    if-gt v7, v6, :cond_6

    .line 160
    .line 161
    if-gt v8, v5, :cond_6

    .line 162
    .line 163
    if-le v9, v3, :cond_5

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_5
    move/from16 v17, v7

    .line 167
    .line 168
    move/from16 v18, v8

    .line 169
    .line 170
    move/from16 v19, v9

    .line 171
    .line 172
    invoke-static/range {v14 .. v20}, Ljava/time/LocalDateTime;->of(IIIIIII)Ljava/time/LocalDateTime;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    goto :goto_2

    .line 177
    :cond_6
    :goto_1
    move-object v2, v4

    .line 178
    :goto_2
    sget-object v3, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 179
    .line 180
    invoke-static {v2, v3}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    goto/16 :goto_9

    .line 185
    .line 186
    :cond_7
    const/16 v2, 0x1d

    .line 187
    .line 188
    if-ne v1, v2, :cond_c

    .line 189
    .line 190
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 191
    .line 192
    add-int/lit8 v14, v2, 0x1c

    .line 193
    .line 194
    aget-char v14, v13, v14

    .line 195
    .line 196
    if-ne v14, v12, :cond_c

    .line 197
    .line 198
    sget-object v12, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 199
    .line 200
    add-int/lit8 v12, v2, 0x1c

    .line 201
    .line 202
    array-length v14, v13

    .line 203
    if-gt v12, v14, :cond_b

    .line 204
    .line 205
    add-int/lit8 v12, v2, 0x4

    .line 206
    .line 207
    aget-char v12, v13, v12

    .line 208
    .line 209
    if-ne v12, v10, :cond_b

    .line 210
    .line 211
    add-int/lit8 v12, v2, 0x7

    .line 212
    .line 213
    aget-char v12, v13, v12

    .line 214
    .line 215
    if-ne v12, v10, :cond_b

    .line 216
    .line 217
    add-int/lit8 v10, v2, 0xa

    .line 218
    .line 219
    aget-char v10, v13, v10

    .line 220
    .line 221
    if-eq v10, v9, :cond_8

    .line 222
    .line 223
    if-ne v10, v8, :cond_b

    .line 224
    .line 225
    :cond_8
    add-int/lit8 v8, v2, 0xd

    .line 226
    .line 227
    aget-char v8, v13, v8

    .line 228
    .line 229
    if-ne v8, v11, :cond_b

    .line 230
    .line 231
    add-int/lit8 v8, v2, 0x10

    .line 232
    .line 233
    aget-char v8, v13, v8

    .line 234
    .line 235
    if-ne v8, v11, :cond_b

    .line 236
    .line 237
    add-int/lit8 v8, v2, 0x13

    .line 238
    .line 239
    aget-char v8, v13, v8

    .line 240
    .line 241
    if-eq v8, v7, :cond_9

    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_9
    invoke-static {v2, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 245
    .line 246
    .line 247
    move-result v14

    .line 248
    add-int/lit8 v7, v2, 0x5

    .line 249
    .line 250
    invoke-static {v7, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 251
    .line 252
    .line 253
    move-result v15

    .line 254
    add-int/lit8 v7, v2, 0x8

    .line 255
    .line 256
    invoke-static {v7, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 257
    .line 258
    .line 259
    move-result v16

    .line 260
    add-int/lit8 v7, v2, 0xb

    .line 261
    .line 262
    invoke-static {v7, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 263
    .line 264
    .line 265
    move-result v7

    .line 266
    add-int/lit8 v8, v2, 0xe

    .line 267
    .line 268
    invoke-static {v8, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 269
    .line 270
    .line 271
    move-result v8

    .line 272
    add-int/lit8 v9, v2, 0x11

    .line 273
    .line 274
    invoke-static {v9, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 275
    .line 276
    .line 277
    move-result v9

    .line 278
    add-int/lit8 v2, v2, 0x14

    .line 279
    .line 280
    const/16 v10, 0x8

    .line 281
    .line 282
    invoke-static {v10, v2, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏哲楪兰世(II[C)I

    .line 283
    .line 284
    .line 285
    move-result v20

    .line 286
    or-int v2, v14, v15

    .line 287
    .line 288
    or-int v2, v2, v16

    .line 289
    .line 290
    or-int/2addr v2, v7

    .line 291
    or-int/2addr v2, v8

    .line 292
    or-int/2addr v2, v9

    .line 293
    or-int v2, v2, v20

    .line 294
    .line 295
    if-lez v2, :cond_b

    .line 296
    .line 297
    if-gt v7, v6, :cond_b

    .line 298
    .line 299
    if-gt v8, v5, :cond_b

    .line 300
    .line 301
    if-le v9, v3, :cond_a

    .line 302
    .line 303
    goto :goto_3

    .line 304
    :cond_a
    move/from16 v17, v7

    .line 305
    .line 306
    move/from16 v18, v8

    .line 307
    .line 308
    move/from16 v19, v9

    .line 309
    .line 310
    invoke-static/range {v14 .. v20}, Ljava/time/LocalDateTime;->of(IIIIIII)Ljava/time/LocalDateTime;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    goto :goto_4

    .line 315
    :cond_b
    :goto_3
    move-object v2, v4

    .line 316
    :goto_4
    sget-object v3, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 317
    .line 318
    invoke-static {v2, v3}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    goto/16 :goto_9

    .line 323
    .line 324
    :cond_c
    const/16 v2, 0x1c

    .line 325
    .line 326
    if-ne v1, v2, :cond_11

    .line 327
    .line 328
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 329
    .line 330
    add-int/lit8 v14, v2, 0x1b

    .line 331
    .line 332
    aget-char v14, v13, v14

    .line 333
    .line 334
    if-ne v14, v12, :cond_11

    .line 335
    .line 336
    sget-object v12, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 337
    .line 338
    add-int/lit8 v12, v2, 0x1b

    .line 339
    .line 340
    array-length v14, v13

    .line 341
    if-gt v12, v14, :cond_10

    .line 342
    .line 343
    add-int/lit8 v12, v2, 0x4

    .line 344
    .line 345
    aget-char v12, v13, v12

    .line 346
    .line 347
    if-ne v12, v10, :cond_10

    .line 348
    .line 349
    add-int/lit8 v12, v2, 0x7

    .line 350
    .line 351
    aget-char v12, v13, v12

    .line 352
    .line 353
    if-ne v12, v10, :cond_10

    .line 354
    .line 355
    add-int/lit8 v10, v2, 0xa

    .line 356
    .line 357
    aget-char v10, v13, v10

    .line 358
    .line 359
    if-eq v10, v9, :cond_d

    .line 360
    .line 361
    if-ne v10, v8, :cond_10

    .line 362
    .line 363
    :cond_d
    add-int/lit8 v8, v2, 0xd

    .line 364
    .line 365
    aget-char v8, v13, v8

    .line 366
    .line 367
    if-ne v8, v11, :cond_10

    .line 368
    .line 369
    add-int/lit8 v8, v2, 0x10

    .line 370
    .line 371
    aget-char v8, v13, v8

    .line 372
    .line 373
    if-ne v8, v11, :cond_10

    .line 374
    .line 375
    add-int/lit8 v8, v2, 0x13

    .line 376
    .line 377
    aget-char v8, v13, v8

    .line 378
    .line 379
    if-eq v8, v7, :cond_e

    .line 380
    .line 381
    goto :goto_5

    .line 382
    :cond_e
    invoke-static {v2, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 383
    .line 384
    .line 385
    move-result v14

    .line 386
    add-int/lit8 v7, v2, 0x5

    .line 387
    .line 388
    invoke-static {v7, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 389
    .line 390
    .line 391
    move-result v15

    .line 392
    add-int/lit8 v7, v2, 0x8

    .line 393
    .line 394
    invoke-static {v7, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 395
    .line 396
    .line 397
    move-result v16

    .line 398
    add-int/lit8 v7, v2, 0xb

    .line 399
    .line 400
    invoke-static {v7, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 401
    .line 402
    .line 403
    move-result v7

    .line 404
    add-int/lit8 v8, v2, 0xe

    .line 405
    .line 406
    invoke-static {v8, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 407
    .line 408
    .line 409
    move-result v8

    .line 410
    add-int/lit8 v9, v2, 0x11

    .line 411
    .line 412
    invoke-static {v9, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 413
    .line 414
    .line 415
    move-result v9

    .line 416
    add-int/lit8 v2, v2, 0x14

    .line 417
    .line 418
    const/4 v10, 0x7

    .line 419
    invoke-static {v10, v2, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏哲楪兰世(II[C)I

    .line 420
    .line 421
    .line 422
    move-result v20

    .line 423
    or-int v2, v14, v15

    .line 424
    .line 425
    or-int v2, v2, v16

    .line 426
    .line 427
    or-int/2addr v2, v7

    .line 428
    or-int/2addr v2, v8

    .line 429
    or-int/2addr v2, v9

    .line 430
    or-int v2, v2, v20

    .line 431
    .line 432
    if-lez v2, :cond_10

    .line 433
    .line 434
    if-gt v7, v6, :cond_10

    .line 435
    .line 436
    if-gt v8, v5, :cond_10

    .line 437
    .line 438
    if-le v9, v3, :cond_f

    .line 439
    .line 440
    goto :goto_5

    .line 441
    :cond_f
    move/from16 v17, v7

    .line 442
    .line 443
    move/from16 v18, v8

    .line 444
    .line 445
    move/from16 v19, v9

    .line 446
    .line 447
    invoke-static/range {v14 .. v20}, Ljava/time/LocalDateTime;->of(IIIIIII)Ljava/time/LocalDateTime;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    goto :goto_6

    .line 452
    :cond_10
    :goto_5
    move-object v2, v4

    .line 453
    :goto_6
    sget-object v3, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 454
    .line 455
    invoke-static {v2, v3}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    goto/16 :goto_9

    .line 460
    .line 461
    :cond_11
    const/16 v2, 0x1b

    .line 462
    .line 463
    if-ne v1, v2, :cond_16

    .line 464
    .line 465
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 466
    .line 467
    add-int/lit8 v14, v2, 0x1a

    .line 468
    .line 469
    aget-char v14, v13, v14

    .line 470
    .line 471
    if-ne v14, v12, :cond_16

    .line 472
    .line 473
    sget-object v12, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 474
    .line 475
    add-int/lit8 v12, v2, 0x1a

    .line 476
    .line 477
    array-length v14, v13

    .line 478
    if-gt v12, v14, :cond_15

    .line 479
    .line 480
    add-int/lit8 v12, v2, 0x4

    .line 481
    .line 482
    aget-char v12, v13, v12

    .line 483
    .line 484
    if-ne v12, v10, :cond_15

    .line 485
    .line 486
    add-int/lit8 v12, v2, 0x7

    .line 487
    .line 488
    aget-char v12, v13, v12

    .line 489
    .line 490
    if-ne v12, v10, :cond_15

    .line 491
    .line 492
    add-int/lit8 v10, v2, 0xa

    .line 493
    .line 494
    aget-char v10, v13, v10

    .line 495
    .line 496
    if-eq v10, v9, :cond_12

    .line 497
    .line 498
    if-ne v10, v8, :cond_15

    .line 499
    .line 500
    :cond_12
    add-int/lit8 v8, v2, 0xd

    .line 501
    .line 502
    aget-char v8, v13, v8

    .line 503
    .line 504
    if-ne v8, v11, :cond_15

    .line 505
    .line 506
    add-int/lit8 v8, v2, 0x10

    .line 507
    .line 508
    aget-char v8, v13, v8

    .line 509
    .line 510
    if-ne v8, v11, :cond_15

    .line 511
    .line 512
    add-int/lit8 v8, v2, 0x13

    .line 513
    .line 514
    aget-char v8, v13, v8

    .line 515
    .line 516
    if-eq v8, v7, :cond_13

    .line 517
    .line 518
    goto :goto_7

    .line 519
    :cond_13
    invoke-static {v2, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(I[C)I

    .line 520
    .line 521
    .line 522
    move-result v14

    .line 523
    add-int/lit8 v7, v2, 0x5

    .line 524
    .line 525
    invoke-static {v7, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 526
    .line 527
    .line 528
    move-result v15

    .line 529
    add-int/lit8 v7, v2, 0x8

    .line 530
    .line 531
    invoke-static {v7, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 532
    .line 533
    .line 534
    move-result v16

    .line 535
    add-int/lit8 v7, v2, 0xb

    .line 536
    .line 537
    invoke-static {v7, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 538
    .line 539
    .line 540
    move-result v7

    .line 541
    add-int/lit8 v8, v2, 0xe

    .line 542
    .line 543
    invoke-static {v8, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 544
    .line 545
    .line 546
    move-result v8

    .line 547
    add-int/lit8 v9, v2, 0x11

    .line 548
    .line 549
    invoke-static {v9, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(I[C)I

    .line 550
    .line 551
    .line 552
    move-result v9

    .line 553
    const/4 v10, 0x6

    .line 554
    add-int/lit8 v2, v2, 0x14

    .line 555
    .line 556
    invoke-static {v10, v2, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏哲楪兰世(II[C)I

    .line 557
    .line 558
    .line 559
    move-result v20

    .line 560
    or-int v2, v14, v15

    .line 561
    .line 562
    or-int v2, v2, v16

    .line 563
    .line 564
    or-int/2addr v2, v7

    .line 565
    or-int/2addr v2, v8

    .line 566
    or-int/2addr v2, v9

    .line 567
    or-int v2, v2, v20

    .line 568
    .line 569
    if-lez v2, :cond_15

    .line 570
    .line 571
    if-gt v7, v6, :cond_15

    .line 572
    .line 573
    if-gt v8, v5, :cond_15

    .line 574
    .line 575
    if-le v9, v3, :cond_14

    .line 576
    .line 577
    goto :goto_7

    .line 578
    :cond_14
    move/from16 v17, v7

    .line 579
    .line 580
    move/from16 v18, v8

    .line 581
    .line 582
    move/from16 v19, v9

    .line 583
    .line 584
    invoke-static/range {v14 .. v20}, Ljava/time/LocalDateTime;->of(IIIIIII)Ljava/time/LocalDateTime;

    .line 585
    .line 586
    .line 587
    move-result-object v2

    .line 588
    goto :goto_8

    .line 589
    :cond_15
    :goto_7
    move-object v2, v4

    .line 590
    :goto_8
    sget-object v3, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 591
    .line 592
    invoke-static {v2, v3}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 593
    .line 594
    .line 595
    move-result-object v2

    .line 596
    goto :goto_9

    .line 597
    :cond_16
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 598
    .line 599
    iget-object v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 600
    .line 601
    iget-object v3, v3, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 602
    .line 603
    check-cast v3, Ljava/time/ZoneId;

    .line 604
    .line 605
    invoke-static {v13, v2, v1, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏世兰哲楪([CIILjava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 606
    .line 607
    .line 608
    move-result-object v2

    .line 609
    :goto_9
    if-nez v2, :cond_17

    .line 610
    .line 611
    return-object v4

    .line 612
    :cond_17
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 613
    .line 614
    const/4 v4, 0x1

    .line 615
    add-int/2addr v1, v4

    .line 616
    add-int/2addr v1, v3

    .line 617
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 618
    .line 619
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 620
    .line 621
    .line 622
    iget-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 623
    .line 624
    const/16 v3, 0x2c

    .line 625
    .line 626
    if-ne v1, v3, :cond_18

    .line 627
    .line 628
    goto :goto_a

    .line 629
    :cond_18
    const/4 v4, 0x0

    .line 630
    :goto_a
    iput-boolean v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 631
    .line 632
    if-eqz v4, :cond_19

    .line 633
    .line 634
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 635
    .line 636
    .line 637
    :cond_19
    return-object v2
.end method

.method public final 飘花落叶言楪苏子哲世兰()Ljava/util/UUID;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 4
    .line 5
    const/16 v2, 0x6e

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪世苏兰哲子()V

    .line 11
    .line 12
    .line 13
    return-object v3

    .line 14
    :cond_0
    const/16 v2, 0x22

    .line 15
    .line 16
    if-eq v1, v2, :cond_2

    .line 17
    .line 18
    const/16 v2, 0x27

    .line 19
    .line 20
    if-ne v1, v2, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const-string v1, "syntax error, can not read uuid"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v3

    .line 33
    :cond_2
    :goto_0
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 34
    .line 35
    add-int/lit8 v4, v2, 0x24

    .line 36
    .line 37
    iget v5, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 38
    .line 39
    iget-object v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 40
    .line 41
    if-ge v4, v5, :cond_3

    .line 42
    .line 43
    aget-char v4, v6, v4

    .line 44
    .line 45
    if-ne v4, v1, :cond_3

    .line 46
    .line 47
    add-int/lit8 v4, v2, 0x8

    .line 48
    .line 49
    aget-char v4, v6, v4

    .line 50
    .line 51
    const/16 v7, 0x2d

    .line 52
    .line 53
    if-ne v4, v7, :cond_3

    .line 54
    .line 55
    add-int/lit8 v4, v2, 0xd

    .line 56
    .line 57
    aget-char v4, v6, v4

    .line 58
    .line 59
    if-ne v4, v7, :cond_3

    .line 60
    .line 61
    add-int/lit8 v4, v2, 0x12

    .line 62
    .line 63
    aget-char v4, v6, v4

    .line 64
    .line 65
    if-ne v4, v7, :cond_3

    .line 66
    .line 67
    add-int/lit8 v4, v2, 0x17

    .line 68
    .line 69
    aget-char v4, v6, v4

    .line 70
    .line 71
    if-ne v4, v7, :cond_3

    .line 72
    .line 73
    invoke-static {v2, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏哲兰子世(I[C)J

    .line 74
    .line 75
    .line 76
    move-result-wide v3

    .line 77
    add-int/lit8 v1, v2, 0x4

    .line 78
    .line 79
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏哲兰子世(I[C)J

    .line 80
    .line 81
    .line 82
    move-result-wide v7

    .line 83
    add-int/lit8 v1, v2, 0x9

    .line 84
    .line 85
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏哲兰子世(I[C)J

    .line 86
    .line 87
    .line 88
    move-result-wide v9

    .line 89
    add-int/lit8 v1, v2, 0xe

    .line 90
    .line 91
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏哲兰子世(I[C)J

    .line 92
    .line 93
    .line 94
    move-result-wide v11

    .line 95
    add-int/lit8 v1, v2, 0x13

    .line 96
    .line 97
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏哲兰子世(I[C)J

    .line 98
    .line 99
    .line 100
    move-result-wide v13

    .line 101
    add-int/lit8 v1, v2, 0x18

    .line 102
    .line 103
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏哲兰子世(I[C)J

    .line 104
    .line 105
    .line 106
    move-result-wide v15

    .line 107
    add-int/lit8 v1, v2, 0x1c

    .line 108
    .line 109
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏哲兰子世(I[C)J

    .line 110
    .line 111
    .line 112
    move-result-wide v17

    .line 113
    add-int/lit8 v1, v2, 0x20

    .line 114
    .line 115
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏哲兰子世(I[C)J

    .line 116
    .line 117
    .line 118
    move-result-wide v19

    .line 119
    add-int/lit8 v2, v2, 0x25

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_3
    add-int/lit8 v4, v2, 0x20

    .line 123
    .line 124
    if-ge v4, v5, :cond_9

    .line 125
    .line 126
    aget-char v4, v6, v4

    .line 127
    .line 128
    if-ne v4, v1, :cond_9

    .line 129
    .line 130
    invoke-static {v2, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏哲兰子世(I[C)J

    .line 131
    .line 132
    .line 133
    move-result-wide v3

    .line 134
    add-int/lit8 v1, v2, 0x4

    .line 135
    .line 136
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏哲兰子世(I[C)J

    .line 137
    .line 138
    .line 139
    move-result-wide v7

    .line 140
    add-int/lit8 v1, v2, 0x8

    .line 141
    .line 142
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏哲兰子世(I[C)J

    .line 143
    .line 144
    .line 145
    move-result-wide v9

    .line 146
    add-int/lit8 v1, v2, 0xc

    .line 147
    .line 148
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏哲兰子世(I[C)J

    .line 149
    .line 150
    .line 151
    move-result-wide v11

    .line 152
    add-int/lit8 v1, v2, 0x10

    .line 153
    .line 154
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏哲兰子世(I[C)J

    .line 155
    .line 156
    .line 157
    move-result-wide v13

    .line 158
    add-int/lit8 v1, v2, 0x14

    .line 159
    .line 160
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏哲兰子世(I[C)J

    .line 161
    .line 162
    .line 163
    move-result-wide v15

    .line 164
    add-int/lit8 v1, v2, 0x18

    .line 165
    .line 166
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏哲兰子世(I[C)J

    .line 167
    .line 168
    .line 169
    move-result-wide v17

    .line 170
    add-int/lit8 v1, v2, 0x1c

    .line 171
    .line 172
    invoke-static {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪苏哲兰子世(I[C)J

    .line 173
    .line 174
    .line 175
    move-result-wide v19

    .line 176
    add-int/lit8 v2, v2, 0x21

    .line 177
    .line 178
    :goto_1
    if-ne v2, v5, :cond_4

    .line 179
    .line 180
    move/from16 v21, v2

    .line 181
    .line 182
    const/16 v2, 0x1a

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :cond_4
    add-int/lit8 v21, v2, 0x1

    .line 186
    .line 187
    aget-char v2, v6, v2

    .line 188
    .line 189
    :goto_2
    move-wide/from16 v22, v3

    .line 190
    .line 191
    move/from16 v1, v21

    .line 192
    .line 193
    :goto_3
    const/16 v3, 0x20

    .line 194
    .line 195
    if-gt v2, v3, :cond_6

    .line 196
    .line 197
    const-wide/16 v24, 0x1

    .line 198
    .line 199
    shl-long v24, v24, v2

    .line 200
    .line 201
    const-wide v26, 0x100003700L

    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    and-long v24, v24, v26

    .line 207
    .line 208
    const-wide/16 v26, 0x0

    .line 209
    .line 210
    cmp-long v4, v24, v26

    .line 211
    .line 212
    if-eqz v4, :cond_6

    .line 213
    .line 214
    if-ne v1, v5, :cond_5

    .line 215
    .line 216
    const/16 v2, 0x1a

    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_5
    add-int/lit8 v2, v1, 0x1

    .line 220
    .line 221
    aget-char v1, v6, v1

    .line 222
    .line 223
    move/from16 v28, v2

    .line 224
    .line 225
    move v2, v1

    .line 226
    move/from16 v1, v28

    .line 227
    .line 228
    goto :goto_3

    .line 229
    :cond_6
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 230
    .line 231
    const/16 v1, 0x2c

    .line 232
    .line 233
    if-ne v2, v1, :cond_7

    .line 234
    .line 235
    const/4 v1, 0x1

    .line 236
    goto :goto_4

    .line 237
    :cond_7
    const/4 v1, 0x0

    .line 238
    :goto_4
    iput-boolean v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 239
    .line 240
    if-eqz v1, :cond_8

    .line 241
    .line 242
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子苏兰哲世楪()V

    .line 243
    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_8
    int-to-char v1, v2

    .line 247
    iput-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 248
    .line 249
    :goto_5
    new-instance v0, Ljava/util/UUID;

    .line 250
    .line 251
    const/16 v1, 0x30

    .line 252
    .line 253
    shl-long v4, v22, v1

    .line 254
    .line 255
    shl-long v6, v7, v3

    .line 256
    .line 257
    or-long/2addr v4, v6

    .line 258
    const/16 v2, 0x10

    .line 259
    .line 260
    shl-long v6, v9, v2

    .line 261
    .line 262
    or-long/2addr v4, v6

    .line 263
    or-long/2addr v4, v11

    .line 264
    shl-long v6, v13, v1

    .line 265
    .line 266
    shl-long v8, v15, v3

    .line 267
    .line 268
    or-long/2addr v6, v8

    .line 269
    shl-long v1, v17, v2

    .line 270
    .line 271
    or-long/2addr v1, v6

    .line 272
    or-long v1, v1, v19

    .line 273
    .line 274
    invoke-direct {v0, v4, v5, v1, v2}, Ljava/util/UUID;-><init>(JJ)V

    .line 275
    .line 276
    .line 277
    return-object v0

    .line 278
    :cond_9
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    if-eqz v1, :cond_a

    .line 287
    .line 288
    return-object v3

    .line 289
    :cond_a
    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    return-object v0
.end method

.method public final 飘花落叶言楪苏子哲兰世()J
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-char v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 4
    .line 5
    const/16 v2, 0x22

    .line 6
    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    const/16 v3, 0x27

    .line 10
    .line 11
    if-eq v1, v3, :cond_0

    .line 12
    .line 13
    const-wide/16 v0, -0x1

    .line 14
    .line 15
    return-wide v0

    .line 16
    :cond_0
    const/4 v3, 0x0

    .line 17
    iput-boolean v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏哲世:Z

    .line 18
    .line 19
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 20
    .line 21
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪苏哲:I

    .line 22
    .line 23
    move v7, v3

    .line 24
    const-wide/16 v8, 0x0

    .line 25
    .line 26
    :goto_0
    const/16 v10, 0x78

    .line 27
    .line 28
    const/16 v11, 0x75

    .line 29
    .line 30
    const/16 v12, 0x5c

    .line 31
    .line 32
    const/16 v13, 0x20

    .line 33
    .line 34
    const/4 v14, 0x1

    .line 35
    iget-object v15, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲苏兰楪:[C

    .line 36
    .line 37
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世哲兰苏楪:I

    .line 38
    .line 39
    const-wide/16 v16, 0x0

    .line 40
    .line 41
    if-ge v4, v3, :cond_8

    .line 42
    .line 43
    aget-char v5, v15, v4

    .line 44
    .line 45
    if-ne v5, v1, :cond_2

    .line 46
    .line 47
    if-nez v7, :cond_1

    .line 48
    .line 49
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪苏哲:I

    .line 50
    .line 51
    :goto_1
    move-wide/from16 v8, v16

    .line 52
    .line 53
    goto/16 :goto_6

    .line 54
    .line 55
    :cond_1
    iput v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰苏楪哲:I

    .line 56
    .line 57
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪哲苏:I

    .line 58
    .line 59
    add-int/lit8 v4, v4, 0x1

    .line 60
    .line 61
    goto/16 :goto_6

    .line 62
    .line 63
    :cond_2
    if-ne v5, v12, :cond_5

    .line 64
    .line 65
    iput-boolean v14, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏哲世:Z

    .line 66
    .line 67
    add-int/lit8 v5, v4, 0x1

    .line 68
    .line 69
    aget-char v6, v15, v5

    .line 70
    .line 71
    if-eq v6, v11, :cond_4

    .line 72
    .line 73
    if-eq v6, v10, :cond_3

    .line 74
    .line 75
    invoke-virtual {v0, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世哲兰(I)C

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    move/from16 v20, v5

    .line 80
    .line 81
    move v5, v4

    .line 82
    move/from16 v4, v20

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    add-int/lit8 v5, v4, 0x2

    .line 86
    .line 87
    aget-char v5, v15, v5

    .line 88
    .line 89
    add-int/lit8 v4, v4, 0x3

    .line 90
    .line 91
    aget-char v6, v15, v4

    .line 92
    .line 93
    invoke-static {v5, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世兰哲(II)C

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    goto :goto_2

    .line 98
    :cond_4
    add-int/lit8 v5, v4, 0x2

    .line 99
    .line 100
    invoke-static {v5, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 101
    .line 102
    .line 103
    invoke-static {v5, v15}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪兰苏哲(I[C)I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    int-to-char v5, v5

    .line 108
    add-int/lit8 v4, v4, 0x5

    .line 109
    .line 110
    :cond_5
    :goto_2
    const/16 v6, 0xff

    .line 111
    .line 112
    if-gt v5, v6, :cond_7

    .line 113
    .line 114
    const/16 v6, 0x8

    .line 115
    .line 116
    if-ge v7, v6, :cond_7

    .line 117
    .line 118
    if-nez v7, :cond_6

    .line 119
    .line 120
    if-nez v5, :cond_6

    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_6
    packed-switch v7, :pswitch_data_0

    .line 124
    .line 125
    .line 126
    goto :goto_4

    .line 127
    :pswitch_0
    int-to-byte v3, v5

    .line 128
    int-to-long v5, v3

    .line 129
    const/16 v3, 0x38

    .line 130
    .line 131
    shl-long/2addr v5, v3

    .line 132
    const-wide v10, 0xffffffffffffffL

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    :goto_3
    and-long/2addr v8, v10

    .line 138
    add-long/2addr v8, v5

    .line 139
    goto :goto_4

    .line 140
    :pswitch_1
    int-to-byte v3, v5

    .line 141
    int-to-long v5, v3

    .line 142
    const/16 v3, 0x30

    .line 143
    .line 144
    shl-long/2addr v5, v3

    .line 145
    const-wide v10, 0xffffffffffffL

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :pswitch_2
    int-to-byte v3, v5

    .line 152
    int-to-long v5, v3

    .line 153
    const/16 v3, 0x28

    .line 154
    .line 155
    shl-long/2addr v5, v3

    .line 156
    const-wide v10, 0xffffffffffL

    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :pswitch_3
    int-to-byte v3, v5

    .line 163
    int-to-long v5, v3

    .line 164
    shl-long/2addr v5, v13

    .line 165
    const-wide v10, 0xffffffffL

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :pswitch_4
    int-to-byte v3, v5

    .line 172
    shl-int/lit8 v3, v3, 0x18

    .line 173
    .line 174
    int-to-long v5, v3

    .line 175
    const-wide/32 v10, 0xffffff

    .line 176
    .line 177
    .line 178
    goto :goto_3

    .line 179
    :pswitch_5
    int-to-byte v3, v5

    .line 180
    shl-int/lit8 v3, v3, 0x10

    .line 181
    .line 182
    int-to-long v5, v3

    .line 183
    const-wide/32 v10, 0xffff

    .line 184
    .line 185
    .line 186
    goto :goto_3

    .line 187
    :pswitch_6
    int-to-byte v3, v5

    .line 188
    shl-int/2addr v3, v6

    .line 189
    int-to-long v5, v3

    .line 190
    const-wide/16 v10, 0xff

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :pswitch_7
    int-to-byte v3, v5

    .line 194
    int-to-long v8, v3

    .line 195
    :goto_4
    add-int/2addr v4, v14

    .line 196
    add-int/lit8 v7, v7, 0x1

    .line 197
    .line 198
    const/4 v3, 0x0

    .line 199
    goto/16 :goto_0

    .line 200
    .line 201
    :cond_7
    :goto_5
    iget v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪苏哲:I

    .line 202
    .line 203
    goto/16 :goto_1

    .line 204
    .line 205
    :cond_8
    :goto_6
    cmp-long v1, v8, v16

    .line 206
    .line 207
    if-eqz v1, :cond_9

    .line 208
    .line 209
    goto :goto_a

    .line 210
    :cond_9
    const-wide v5, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    move-wide v8, v5

    .line 216
    const/4 v1, 0x0

    .line 217
    :goto_7
    aget-char v5, v15, v4

    .line 218
    .line 219
    if-ne v5, v12, :cond_c

    .line 220
    .line 221
    iput-boolean v14, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏哲世:Z

    .line 222
    .line 223
    add-int/lit8 v5, v4, 0x1

    .line 224
    .line 225
    const-wide v18, 0x100000001b3L

    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    aget-char v6, v15, v5

    .line 231
    .line 232
    if-eq v6, v11, :cond_b

    .line 233
    .line 234
    if-eq v6, v10, :cond_a

    .line 235
    .line 236
    invoke-virtual {v0, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世哲兰(I)C

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    goto :goto_9

    .line 241
    :cond_a
    add-int/lit8 v5, v4, 0x2

    .line 242
    .line 243
    aget-char v5, v15, v5

    .line 244
    .line 245
    add-int/lit8 v4, v4, 0x3

    .line 246
    .line 247
    aget-char v6, v15, v4

    .line 248
    .line 249
    invoke-static {v5, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世兰哲(II)C

    .line 250
    .line 251
    .line 252
    move-result v5

    .line 253
    :goto_8
    move/from16 v20, v5

    .line 254
    .line 255
    move v5, v4

    .line 256
    move/from16 v4, v20

    .line 257
    .line 258
    goto :goto_9

    .line 259
    :cond_b
    add-int/lit8 v5, v4, 0x2

    .line 260
    .line 261
    invoke-static {v5, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪苏兰世;->飘花落叶言楪苏哲世兰子(II)V

    .line 262
    .line 263
    .line 264
    invoke-static {v5, v15}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世楪兰苏哲(I[C)I

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    int-to-char v5, v5

    .line 269
    add-int/lit8 v4, v4, 0x5

    .line 270
    .line 271
    goto :goto_8

    .line 272
    :goto_9
    add-int/2addr v5, v14

    .line 273
    int-to-long v6, v4

    .line 274
    xor-long/2addr v6, v8

    .line 275
    mul-long v6, v6, v18

    .line 276
    .line 277
    move v4, v5

    .line 278
    move-wide v8, v6

    .line 279
    goto :goto_e

    .line 280
    :cond_c
    const-wide v18, 0x100000001b3L

    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    if-ne v5, v2, :cond_13

    .line 286
    .line 287
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰苏楪哲:I

    .line 288
    .line 289
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪兰世苏;->飘花落叶言子世兰楪哲苏:I

    .line 290
    .line 291
    const/4 v1, 0x0

    .line 292
    iput-object v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏兰楪哲:Ljava/lang/String;

    .line 293
    .line 294
    add-int/2addr v4, v14

    .line 295
    :goto_a
    const/16 v1, 0x1a

    .line 296
    .line 297
    if-ne v4, v3, :cond_d

    .line 298
    .line 299
    move v2, v1

    .line 300
    goto :goto_b

    .line 301
    :cond_d
    aget-char v2, v15, v4

    .line 302
    .line 303
    :goto_b
    const-wide v5, 0x100003700L

    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    const-wide/16 v10, 0x1

    .line 309
    .line 310
    if-gt v2, v13, :cond_e

    .line 311
    .line 312
    shl-long v18, v10, v2

    .line 313
    .line 314
    and-long v18, v18, v5

    .line 315
    .line 316
    cmp-long v7, v18, v16

    .line 317
    .line 318
    if-eqz v7, :cond_e

    .line 319
    .line 320
    add-int/lit8 v4, v4, 0x1

    .line 321
    .line 322
    aget-char v2, v15, v4

    .line 323
    .line 324
    goto :goto_b

    .line 325
    :cond_e
    const/16 v7, 0x2c

    .line 326
    .line 327
    if-ne v2, v7, :cond_f

    .line 328
    .line 329
    move v7, v14

    .line 330
    goto :goto_c

    .line 331
    :cond_f
    const/4 v7, 0x0

    .line 332
    :goto_c
    iput-boolean v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰苏世哲:Z

    .line 333
    .line 334
    if-eqz v7, :cond_12

    .line 335
    .line 336
    add-int/lit8 v4, v4, 0x1

    .line 337
    .line 338
    if-ne v4, v3, :cond_10

    .line 339
    .line 340
    goto :goto_d

    .line 341
    :cond_10
    aget-char v1, v15, v4

    .line 342
    .line 343
    :goto_d
    if-gt v1, v13, :cond_11

    .line 344
    .line 345
    shl-long v2, v10, v1

    .line 346
    .line 347
    and-long/2addr v2, v5

    .line 348
    cmp-long v2, v2, v16

    .line 349
    .line 350
    if-eqz v2, :cond_11

    .line 351
    .line 352
    add-int/lit8 v4, v4, 0x1

    .line 353
    .line 354
    aget-char v1, v15, v4

    .line 355
    .line 356
    goto :goto_d

    .line 357
    :cond_11
    move v2, v1

    .line 358
    :cond_12
    add-int/2addr v4, v14

    .line 359
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世苏哲:I

    .line 360
    .line 361
    iput-char v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 362
    .line 363
    return-wide v8

    .line 364
    :cond_13
    add-int/lit8 v4, v4, 0x1

    .line 365
    .line 366
    int-to-long v5, v5

    .line 367
    xor-long/2addr v5, v8

    .line 368
    mul-long v5, v5, v18

    .line 369
    .line 370
    move-wide v8, v5

    .line 371
    :goto_e
    add-int/lit8 v1, v1, 0x1

    .line 372
    .line 373
    goto/16 :goto_7

    .line 374
    .line 375
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
