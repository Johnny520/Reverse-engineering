.class public final synthetic Ll70;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 16
    iput p5, p0, Ll70;->h:I

    iput-object p1, p0, Ll70;->j:Ljava/lang/Object;

    iput-object p2, p0, Ll70;->k:Ljava/lang/Object;

    iput-object p3, p0, Ll70;->l:Ljava/lang/Object;

    iput p4, p0, Ll70;->i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>([Lsz1;Lob2;I[I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Ll70;->h:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ll70;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Ll70;->k:Ljava/lang/Object;

    .line 10
    .line 11
    iput p3, p0, Ll70;->i:I

    .line 12
    .line 13
    iput-object p4, p0, Ll70;->l:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Ll70;->h:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, La83;->a:La83;

    .line 5
    .line 6
    iget-object v3, p0, Ll70;->l:Ljava/lang/Object;

    .line 7
    .line 8
    iget v4, p0, Ll70;->i:I

    .line 9
    .line 10
    iget-object v5, p0, Ll70;->k:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object p0, p0, Ll70;->j:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p0, [Lsz1;

    .line 19
    .line 20
    check-cast v5, Lob2;

    .line 21
    .line 22
    check-cast v3, [I

    .line 23
    .line 24
    check-cast p1, Lrz1;

    .line 25
    .line 26
    array-length v0, p0

    .line 27
    move v7, v1

    .line 28
    :goto_0
    if-ge v1, v0, :cond_3

    .line 29
    .line 30
    aget-object v8, p0, v1

    .line 31
    .line 32
    add-int/lit8 v9, v7, 0x1

    .line 33
    .line 34
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v8}, Lsz1;->i()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v10

    .line 41
    instance-of v11, v10, Lmb2;

    .line 42
    .line 43
    if-eqz v11, :cond_0

    .line 44
    .line 45
    check-cast v10, Lmb2;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    move-object v10, v6

    .line 49
    :goto_1
    if-eqz v10, :cond_1

    .line 50
    .line 51
    iget-object v10, v10, Lmb2;->c:Lt20;

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_1
    move-object v10, v6

    .line 55
    :goto_2
    if-eqz v10, :cond_2

    .line 56
    .line 57
    iget v11, v8, Lsz1;->i:I

    .line 58
    .line 59
    iget-object v10, v10, Lt20;->a:Lpk;

    .line 60
    .line 61
    sget-object v12, Ld61;->h:Ld61;

    .line 62
    .line 63
    invoke-virtual {v10, v11, v4, v12}, Lpk;->a(IILd61;)I

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    goto :goto_3

    .line 68
    :cond_2
    iget-object v10, v5, Lob2;->b:Lqk;

    .line 69
    .line 70
    iget v11, v8, Lsz1;->i:I

    .line 71
    .line 72
    sub-int v11, v4, v11

    .line 73
    .line 74
    int-to-float v11, v11

    .line 75
    const/high16 v12, 0x40000000    # 2.0f

    .line 76
    .line 77
    div-float/2addr v11, v12

    .line 78
    const/high16 v12, 0x3f800000    # 1.0f

    .line 79
    .line 80
    iget v10, v10, Lqk;->a:F

    .line 81
    .line 82
    add-float/2addr v12, v10

    .line 83
    mul-float/2addr v12, v11

    .line 84
    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    :goto_3
    aget v7, v3, v7

    .line 89
    .line 90
    invoke-static {p1, v8, v7, v10}, Lrz1;->g(Lrz1;Lsz1;II)V

    .line 91
    .line 92
    .line 93
    add-int/lit8 v1, v1, 0x1

    .line 94
    .line 95
    move v7, v9

    .line 96
    goto :goto_0

    .line 97
    :cond_3
    return-object v2

    .line 98
    :pswitch_0
    check-cast p0, Lhu0;

    .line 99
    .line 100
    check-cast v5, Lpf1;

    .line 101
    .line 102
    check-cast v3, Lsz1;

    .line 103
    .line 104
    move-object v7, p1

    .line 105
    check-cast v7, Lrz1;

    .line 106
    .line 107
    iget v8, p0, Lhu0;->b:I

    .line 108
    .line 109
    iget-object p1, p0, Lhu0;->a:Ltz2;

    .line 110
    .line 111
    iget-object v9, p0, Lhu0;->c:Lq33;

    .line 112
    .line 113
    iget-object p0, p0, Lhu0;->d:Lxm0;

    .line 114
    .line 115
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    check-cast p0, Lz03;

    .line 120
    .line 121
    if-eqz p0, :cond_4

    .line 122
    .line 123
    iget-object v6, p0, Lz03;->a:Ly03;

    .line 124
    .line 125
    :cond_4
    move-object v10, v6

    .line 126
    invoke-interface {v5}, Lm11;->getLayoutDirection()Ld61;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    sget-object v0, Ld61;->i:Ld61;

    .line 131
    .line 132
    if-ne p0, v0, :cond_5

    .line 133
    .line 134
    const/4 p0, 0x1

    .line 135
    move v11, p0

    .line 136
    goto :goto_4

    .line 137
    :cond_5
    move v11, v1

    .line 138
    :goto_4
    iget v12, v3, Lsz1;->h:I

    .line 139
    .line 140
    invoke-static/range {v7 .. v12}, Ltp0;->f(Lrz1;ILq33;Ly03;ZI)Lo62;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    sget-object v0, Lqv1;->i:Lqv1;

    .line 145
    .line 146
    iget v5, v3, Lsz1;->h:I

    .line 147
    .line 148
    invoke-virtual {p1, v0, p0, v4, v5}, Ltz2;->a(Lqv1;Lo62;II)V

    .line 149
    .line 150
    .line 151
    iget-object p0, p1, Ltz2;->a:Ljx1;

    .line 152
    .line 153
    invoke-virtual {p0}, Ljx1;->g()F

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    neg-float p0, p0

    .line 158
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    invoke-static {v7, v3, p0, v1}, Lrz1;->i(Lrz1;Lsz1;II)V

    .line 163
    .line 164
    .line 165
    return-object v2

    .line 166
    :pswitch_1
    check-cast p0, Ln70;

    .line 167
    .line 168
    check-cast v5, Le11;

    .line 169
    .line 170
    check-cast v3, Lgk1;

    .line 171
    .line 172
    if-eq p1, p0, :cond_7

    .line 173
    .line 174
    instance-of p0, p1, Lpu2;

    .line 175
    .line 176
    if-eqz p0, :cond_8

    .line 177
    .line 178
    iget p0, v5, Le11;->a:I

    .line 179
    .line 180
    sub-int/2addr p0, v4

    .line 181
    invoke-virtual {v3, p1}, Lgk1;->d(Ljava/lang/Object;)I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-ltz v0, :cond_6

    .line 186
    .line 187
    iget-object v1, v3, Lgk1;->c:[I

    .line 188
    .line 189
    aget v0, v1, v0

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_6
    const v0, 0x7fffffff

    .line 193
    .line 194
    .line 195
    :goto_5
    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    .line 196
    .line 197
    .line 198
    move-result p0

    .line 199
    invoke-virtual {v3, p0, p1}, Lgk1;->g(ILjava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_7
    const-string p0, "A derived state calculation cannot read itself"

    .line 204
    .line 205
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    move-object v2, v6

    .line 209
    :cond_8
    :goto_6
    return-object v2

    .line 210
    nop

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
