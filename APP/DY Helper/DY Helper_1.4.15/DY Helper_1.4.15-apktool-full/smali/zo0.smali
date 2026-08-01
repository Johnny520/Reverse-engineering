.class public final Lzo0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:[B

.field public β:I

.field public γ:I

.field public δ:I

.field public ε:I

.field public ζ:[I

.field public η:I

.field public θ:Z

.field public ι:I

.field public κ:I

.field public λ:I

.field public μ:I

.field public ν:I

.field public ξ:[I

.field public ο:I

.field public π:[B


# virtual methods
.method public final α(ILjava/io/OutputStream;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lzo0;->π:[B

    .line 2
    .line 3
    iget v1, p0, Lzo0;->μ:I

    .line 4
    .line 5
    iget-object v2, p0, Lzo0;->ξ:[I

    .line 6
    .line 7
    iget v3, p0, Lzo0;->ν:I

    .line 8
    .line 9
    aget v2, v2, v3

    .line 10
    .line 11
    and-int/2addr v1, v2

    .line 12
    iput v1, p0, Lzo0;->μ:I

    .line 13
    .line 14
    if-lez v3, :cond_0

    .line 15
    .line 16
    shl-int v2, p1, v3

    .line 17
    .line 18
    or-int/2addr v1, v2

    .line 19
    iput v1, p0, Lzo0;->μ:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iput p1, p0, Lzo0;->μ:I

    .line 23
    .line 24
    :goto_0
    iget v1, p0, Lzo0;->δ:I

    .line 25
    .line 26
    add-int/2addr v3, v1

    .line 27
    iput v3, p0, Lzo0;->ν:I

    .line 28
    .line 29
    :goto_1
    iget v1, p0, Lzo0;->ν:I

    .line 30
    .line 31
    const/16 v2, 0xfe

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/16 v4, 0x8

    .line 35
    .line 36
    if-lt v1, v4, :cond_2

    .line 37
    .line 38
    iget v1, p0, Lzo0;->μ:I

    .line 39
    .line 40
    and-int/lit16 v1, v1, 0xff

    .line 41
    .line 42
    int-to-byte v1, v1

    .line 43
    iget v5, p0, Lzo0;->ο:I

    .line 44
    .line 45
    add-int/lit8 v6, v5, 0x1

    .line 46
    .line 47
    iput v6, p0, Lzo0;->ο:I

    .line 48
    .line 49
    aput-byte v1, v0, v5

    .line 50
    .line 51
    if-lt v6, v2, :cond_1

    .line 52
    .line 53
    if-lez v6, :cond_1

    .line 54
    .line 55
    invoke-virtual {p2, v6}, Ljava/io/OutputStream;->write(I)V

    .line 56
    .line 57
    .line 58
    iget v1, p0, Lzo0;->ο:I

    .line 59
    .line 60
    invoke-virtual {p2, v0, v3, v1}, Ljava/io/OutputStream;->write([BII)V

    .line 61
    .line 62
    .line 63
    iput v3, p0, Lzo0;->ο:I

    .line 64
    .line 65
    :cond_1
    iget v1, p0, Lzo0;->μ:I

    .line 66
    .line 67
    shr-int/2addr v1, v4

    .line 68
    iput v1, p0, Lzo0;->μ:I

    .line 69
    .line 70
    iget v1, p0, Lzo0;->ν:I

    .line 71
    .line 72
    sub-int/2addr v1, v4

    .line 73
    iput v1, p0, Lzo0;->ν:I

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    iget v1, p0, Lzo0;->η:I

    .line 77
    .line 78
    iget v5, p0, Lzo0;->ε:I

    .line 79
    .line 80
    if-gt v1, v5, :cond_3

    .line 81
    .line 82
    iget-boolean v1, p0, Lzo0;->θ:Z

    .line 83
    .line 84
    if-eqz v1, :cond_6

    .line 85
    .line 86
    :cond_3
    iget-boolean v1, p0, Lzo0;->θ:Z

    .line 87
    .line 88
    const/4 v5, 0x1

    .line 89
    if-eqz v1, :cond_4

    .line 90
    .line 91
    iget v1, p0, Lzo0;->ι:I

    .line 92
    .line 93
    iput v1, p0, Lzo0;->δ:I

    .line 94
    .line 95
    shl-int v1, v5, v1

    .line 96
    .line 97
    sub-int/2addr v1, v5

    .line 98
    iput v1, p0, Lzo0;->ε:I

    .line 99
    .line 100
    iput-boolean v3, p0, Lzo0;->θ:Z

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    iget v1, p0, Lzo0;->δ:I

    .line 104
    .line 105
    add-int/2addr v1, v5

    .line 106
    iput v1, p0, Lzo0;->δ:I

    .line 107
    .line 108
    const/16 v6, 0xc

    .line 109
    .line 110
    if-ne v1, v6, :cond_5

    .line 111
    .line 112
    const/16 v1, 0x1000

    .line 113
    .line 114
    iput v1, p0, Lzo0;->ε:I

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_5
    shl-int v1, v5, v1

    .line 118
    .line 119
    sub-int/2addr v1, v5

    .line 120
    iput v1, p0, Lzo0;->ε:I

    .line 121
    .line 122
    :cond_6
    :goto_2
    iget v1, p0, Lzo0;->λ:I

    .line 123
    .line 124
    if-ne p1, v1, :cond_9

    .line 125
    .line 126
    :goto_3
    iget p1, p0, Lzo0;->ν:I

    .line 127
    .line 128
    if-lez p1, :cond_8

    .line 129
    .line 130
    iget p1, p0, Lzo0;->μ:I

    .line 131
    .line 132
    and-int/lit16 p1, p1, 0xff

    .line 133
    .line 134
    int-to-byte p1, p1

    .line 135
    iget v1, p0, Lzo0;->ο:I

    .line 136
    .line 137
    add-int/lit8 v5, v1, 0x1

    .line 138
    .line 139
    iput v5, p0, Lzo0;->ο:I

    .line 140
    .line 141
    aput-byte p1, v0, v1

    .line 142
    .line 143
    if-lt v5, v2, :cond_7

    .line 144
    .line 145
    if-lez v5, :cond_7

    .line 146
    .line 147
    invoke-virtual {p2, v5}, Ljava/io/OutputStream;->write(I)V

    .line 148
    .line 149
    .line 150
    iget p1, p0, Lzo0;->ο:I

    .line 151
    .line 152
    invoke-virtual {p2, v0, v3, p1}, Ljava/io/OutputStream;->write([BII)V

    .line 153
    .line 154
    .line 155
    iput v3, p0, Lzo0;->ο:I

    .line 156
    .line 157
    :cond_7
    iget p1, p0, Lzo0;->μ:I

    .line 158
    .line 159
    shr-int/2addr p1, v4

    .line 160
    iput p1, p0, Lzo0;->μ:I

    .line 161
    .line 162
    iget p1, p0, Lzo0;->ν:I

    .line 163
    .line 164
    sub-int/2addr p1, v4

    .line 165
    iput p1, p0, Lzo0;->ν:I

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_8
    iget p1, p0, Lzo0;->ο:I

    .line 169
    .line 170
    if-lez p1, :cond_9

    .line 171
    .line 172
    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write(I)V

    .line 173
    .line 174
    .line 175
    iget p1, p0, Lzo0;->ο:I

    .line 176
    .line 177
    invoke-virtual {p2, v0, v3, p1}, Ljava/io/OutputStream;->write([BII)V

    .line 178
    .line 179
    .line 180
    iput v3, p0, Lzo0;->ο:I

    .line 181
    .line 182
    :cond_9
    return-void
.end method
