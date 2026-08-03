.class public final synthetic Lwb/dh;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lf1/g;

.field public final synthetic i:Lwb/c0;

.field public final synthetic j:J


# direct methods
.method public synthetic constructor <init>(Lf1/g;Lwb/c0;JI)V
    .locals 0

    .line 1
    iput p5, p0, Lwb/dh;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/dh;->h:Lf1/g;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/dh;->i:Lwb/c0;

    .line 6
    .line 7
    iput-wide p3, p0, Lwb/dh;->j:J

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lwb/dh;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v1, p1

    .line 7
    check-cast v1, Lh1/d;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    const/16 v8, 0x3e

    .line 14
    .line 15
    iget-object v2, p0, Lwb/dh;->h:Lf1/g;

    .line 16
    .line 17
    const-wide/16 v3, 0x0

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    invoke-static/range {v1 .. v8}, Lh1/d;->U(Lh1/d;Lf1/g;JFLf1/n;II)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lwb/dh;->i:Lwb/c0;

    .line 25
    .line 26
    iget p1, p1, Lwb/c0;->a:F

    .line 27
    .line 28
    const/high16 v0, 0x43b40000    # 360.0f

    .line 29
    .line 30
    div-float/2addr p1, v0

    .line 31
    const/4 v0, 0x0

    .line 32
    const/high16 v2, 0x3f800000    # 1.0f

    .line 33
    .line 34
    invoke-static {p1, v0, v2}, Lr9/e0;->q(FFF)F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-interface {v1}, Lh1/d;->a()J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    const-wide v8, 0xffffffffL

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    and-long/2addr v2, v8

    .line 48
    long-to-int v0, v2

    .line 49
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    mul-float/2addr v0, p1

    .line 54
    invoke-interface {v1}, Lh1/d;->a()J

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    const/16 p1, 0x20

    .line 59
    .line 60
    shr-long/2addr v2, p1

    .line 61
    long-to-int v2, v2

    .line 62
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    const/high16 v10, 0x40000000    # 2.0f

    .line 67
    .line 68
    div-float/2addr v2, v10

    .line 69
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    int-to-long v2, v2

    .line 74
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    int-to-long v4, v4

    .line 79
    shl-long/2addr v2, p1

    .line 80
    and-long/2addr v4, v8

    .line 81
    or-long v5, v2, v4

    .line 82
    .line 83
    const/16 v7, 0x78

    .line 84
    .line 85
    iget-wide v2, p0, Lwb/dh;->j:J

    .line 86
    .line 87
    const/high16 v4, 0x41200000    # 10.0f

    .line 88
    .line 89
    invoke-static/range {v1 .. v7}, Lh1/d;->O(Lh1/d;JFJI)V

    .line 90
    .line 91
    .line 92
    sget-wide v2, Lf1/w;->c:J

    .line 93
    .line 94
    invoke-interface {v1}, Lh1/d;->a()J

    .line 95
    .line 96
    .line 97
    move-result-wide v4

    .line 98
    shr-long/2addr v4, p1

    .line 99
    long-to-int v4, v4

    .line 100
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    div-float/2addr v4, v10

    .line 105
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    int-to-long v4, v4

    .line 110
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    int-to-long v6, v0

    .line 115
    shl-long/2addr v4, p1

    .line 116
    and-long/2addr v6, v8

    .line 117
    or-long v5, v4, v6

    .line 118
    .line 119
    const/16 v7, 0x78

    .line 120
    .line 121
    const/high16 v4, 0x40c00000    # 6.0f

    .line 122
    .line 123
    invoke-static/range {v1 .. v7}, Lh1/d;->O(Lh1/d;JFJI)V

    .line 124
    .line 125
    .line 126
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 127
    .line 128
    return-object p1

    .line 129
    :pswitch_0
    move-object v0, p1

    .line 130
    check-cast v0, Lh1/d;

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    const/4 v6, 0x0

    .line 136
    const/16 v7, 0x3e

    .line 137
    .line 138
    iget-object v1, p0, Lwb/dh;->h:Lf1/g;

    .line 139
    .line 140
    const-wide/16 v2, 0x0

    .line 141
    .line 142
    const/4 v4, 0x0

    .line 143
    const/4 v5, 0x0

    .line 144
    invoke-static/range {v0 .. v7}, Lh1/d;->U(Lh1/d;Lf1/g;JFLf1/n;II)V

    .line 145
    .line 146
    .line 147
    iget-object p1, p0, Lwb/dh;->i:Lwb/c0;

    .line 148
    .line 149
    iget v1, p1, Lwb/c0;->b:F

    .line 150
    .line 151
    invoke-interface {v0}, Lh1/d;->a()J

    .line 152
    .line 153
    .line 154
    move-result-wide v2

    .line 155
    const/16 v4, 0x20

    .line 156
    .line 157
    shr-long/2addr v2, v4

    .line 158
    long-to-int v2, v2

    .line 159
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    mul-float/2addr v2, v1

    .line 164
    const/high16 v1, 0x3f800000    # 1.0f

    .line 165
    .line 166
    iget p1, p1, Lwb/c0;->c:F

    .line 167
    .line 168
    sub-float/2addr v1, p1

    .line 169
    invoke-interface {v0}, Lh1/d;->a()J

    .line 170
    .line 171
    .line 172
    move-result-wide v5

    .line 173
    const-wide v7, 0xffffffffL

    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    and-long/2addr v5, v7

    .line 179
    long-to-int p1, v5

    .line 180
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    mul-float/2addr p1, v1

    .line 185
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    int-to-long v1, v1

    .line 190
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    int-to-long v5, p1

    .line 195
    shl-long/2addr v1, v4

    .line 196
    and-long v3, v5, v7

    .line 197
    .line 198
    or-long v4, v1, v3

    .line 199
    .line 200
    const/high16 v3, 0x41100000    # 9.0f

    .line 201
    .line 202
    const/16 v6, 0x78

    .line 203
    .line 204
    iget-wide v1, p0, Lwb/dh;->j:J

    .line 205
    .line 206
    invoke-static/range {v0 .. v6}, Lh1/d;->O(Lh1/d;JFJI)V

    .line 207
    .line 208
    .line 209
    sget-wide v1, Lf1/w;->c:J

    .line 210
    .line 211
    const/high16 v3, 0x40b00000    # 5.5f

    .line 212
    .line 213
    invoke-static/range {v0 .. v6}, Lh1/d;->O(Lh1/d;JFJI)V

    .line 214
    .line 215
    .line 216
    goto :goto_0

    .line 217
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
