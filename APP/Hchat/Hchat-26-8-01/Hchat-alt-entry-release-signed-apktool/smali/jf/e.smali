.class public final Ljf/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I


# direct methods
.method public constructor <init>(Lac/k;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    new-array v0, v0, [B

    .line 6
    .line 7
    iget-object v1, p1, Lac/k;->i:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/lang/String;

    .line 15
    .line 16
    const/4 v2, 0x3

    .line 17
    new-array v2, v2, [B

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    .line 22
    sget-object v3, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    .line 23
    .line 24
    invoke-direct {v0, v2, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    invoke-virtual {p1, v0}, Lac/k;->M(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lac/k;->H()V

    .line 32
    .line 33
    .line 34
    const/16 v0, 0x14

    .line 35
    .line 36
    new-array v0, v0, [B

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lac/k;->H()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lac/k;->H()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const v2, 0x12345678

    .line 52
    .line 53
    .line 54
    if-ne v0, v2, :cond_3

    .line 55
    .line 56
    invoke-virtual {p1}, Lac/k;->H()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lac/k;->H()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-virtual {p1}, Lac/k;->H()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    iput v2, p0, Ljf/e;->c:I

    .line 74
    .line 75
    invoke-virtual {p1}, Lac/k;->H()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    iput v2, p0, Ljf/e;->d:I

    .line 83
    .line 84
    invoke-virtual {p1}, Lac/k;->H()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    iput v2, p0, Ljf/e;->f:I

    .line 92
    .line 93
    invoke-virtual {p1}, Lac/k;->H()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    iput v2, p0, Ljf/e;->e:I

    .line 101
    .line 102
    invoke-virtual {p1}, Lac/k;->H()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    iput v2, p0, Ljf/e;->g:I

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    iput v2, p0, Ljf/e;->a:I

    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    iput v2, p0, Ljf/e;->b:I

    .line 122
    .line 123
    invoke-virtual {p1}, Lac/k;->H()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Lac/k;->H()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v0}, Lac/k;->a(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    const/4 v2, 0x0

    .line 137
    :goto_0
    if-ge v2, v0, :cond_2

    .line 138
    .line 139
    invoke-virtual {p1}, Lac/k;->L()I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    const/4 v4, 0x6

    .line 144
    invoke-virtual {p1, v4}, Lac/k;->M(I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    const/4 v5, 0x7

    .line 152
    if-eq v3, v5, :cond_1

    .line 153
    .line 154
    const/16 v5, 0x8

    .line 155
    .line 156
    if-eq v3, v5, :cond_0

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_0
    iput v4, p0, Ljf/e;->i:I

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_1
    iput v4, p0, Ljf/e;->h:I

    .line 163
    .line 164
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_2
    return-void

    .line 168
    :cond_3
    new-instance p1, Laf/d;

    .line 169
    .line 170
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    const-string v1, "Unexpected endian tag: 0x"

    .line 175
    .line 176
    invoke-static {v1, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw p1
.end method
