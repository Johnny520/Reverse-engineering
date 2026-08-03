.class public final Lf1/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li4/k;


# instance fields
.field public final synthetic g:I

.field public h:I

.field public final i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lf1/h;->g:I

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lf1/h;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lf1/h;->g:I

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lf1/h;->i:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 53
    iput p1, p0, Lf1/h;->h:I

    const/4 p1, 0x0

    .line 54
    iput-object p1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 55
    iput-object p1, p0, Lf1/h;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Paint;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lf1/h;->g:I

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/h;->i:Ljava/lang/Object;

    const/4 p1, 0x3

    .line 38
    iput p1, p0, Lf1/h;->h:I

    return-void
.end method

.method public constructor <init>(Lg8/b;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lf1/h;->g:I

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    .line 40
    invoke-virtual {p1, v0}, Lg8/b;->g(I)I

    move-result v0

    .line 41
    iput-object p1, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 42
    new-instance p1, Lv4/e0;

    invoke-direct {p1, v0}, Lv4/e0;-><init>(I)V

    iput-object p1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 43
    new-array p1, v0, [I

    iput-object p1, p0, Lf1/h;->k:Ljava/lang/Object;

    const/4 p1, -0x1

    .line 44
    iput p1, p0, Lf1/h;->h:I

    return-void
.end method

.method public constructor <init>(Li4/c0;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lf1/h;->g:I

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/h;->k:Ljava/lang/Object;

    .line 48
    iget-object p1, p1, Li4/c0;->a:Ljava/lang/Object;

    check-cast p1, Li4/a0;

    .line 49
    iput-object p1, p0, Lf1/h;->i:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 50
    iput-object p1, p0, Lf1/h;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Li4/z;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lf1/h;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lf1/h;->k:Ljava/lang/Object;

    .line 8
    .line 9
    iput p2, p0, Lf1/h;->h:I

    .line 10
    .line 11
    new-instance p2, Ljava/util/BitSet;

    .line 12
    .line 13
    iget v0, p1, Li4/z;->d:I

    .line 14
    .line 15
    invoke-direct {p2, v0}, Ljava/util/BitSet;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object p2, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance p2, Ljava/util/BitSet;

    .line 21
    .line 22
    invoke-direct {p2, v0}, Ljava/util/BitSet;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 26
    .line 27
    const/4 p2, 0x1

    .line 28
    iput-boolean p2, p1, Li4/z;->m:Z

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>(Lu4/c;I)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lf1/h;->g:I

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p2, :cond_0

    .line 32
    iput-object p1, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 33
    iput p2, p0, Lf1/h;->h:I

    const/4 p1, 0x0

    .line 34
    iput-object p1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 35
    iput-object p1, p0, Lf1/h;->k:Ljava/lang/Object;

    return-void

    .line 36
    :cond_0
    const-string p1, "firstLabel < 0"

    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public static n(Lu4/o;)Lu4/o;
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lu4/o;->h:Lw4/d;

    .line 4
    .line 5
    invoke-interface {v0}, Lw4/d;->getType()Lw4/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lw4/c;->x:Lw4/c;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    sget-object v0, Lw4/c;->E:Lw4/c;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lu4/o;->p(Lw4/d;)Lu4/o;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :cond_0
    return-object p0
.end method


# virtual methods
.method public A(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Paint;

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne p1, v1, :cond_0

    .line 7
    .line 8
    sget-object p1, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x1

    .line 12
    if-ne p1, v1, :cond_1

    .line 13
    .line 14
    sget-object p1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    if-nez p1, :cond_2

    .line 18
    .line 19
    sget-object p1, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    sget-object p1, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 23
    .line 24
    :goto_0
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public B(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Paint;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    sget-object p1, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x2

    .line 11
    if-ne p1, v1, :cond_1

    .line 12
    .line 13
    sget-object p1, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 v1, 0x1

    .line 17
    if-ne p1, v1, :cond_2

    .line 18
    .line 19
    sget-object p1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    sget-object p1, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    .line 23
    .line 24
    :goto_0
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public C(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public D(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Paint;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne p1, v1, :cond_0

    .line 7
    .line 8
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 12
    .line 13
    :goto_0
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public E(Lz7/o;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lf1/h;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb8/c;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    if-eqz p1, :cond_2

    .line 9
    .line 10
    iget v1, p1, Lz7/c;->i:I

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    if-ge v1, v2, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    invoke-virtual {p1, v0}, Lz7/c;->sort(Ljava/util/Comparator;)V

    .line 17
    .line 18
    .line 19
    :cond_2
    :goto_0
    return-void
.end method

.method public a(IILw4/c;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li4/a0;

    .line 4
    .line 5
    if-eqz p1, :cond_1f

    .line 6
    .line 7
    const/16 v1, 0xbe

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    if-eq p1, v1, :cond_1c

    .line 12
    .line 13
    const/16 v1, 0xbf

    .line 14
    .line 15
    if-eq p1, v1, :cond_1b

    .line 16
    .line 17
    const/16 v1, 0xc2

    .line 18
    .line 19
    if-eq p1, v1, :cond_1b

    .line 20
    .line 21
    const/16 v1, 0xc3

    .line 22
    .line 23
    if-eq p1, v1, :cond_1b

    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    const/4 v4, 0x1

    .line 27
    const/4 v5, 0x2

    .line 28
    sparse-switch p1, :sswitch_data_0

    .line 29
    .line 30
    .line 31
    const/16 v6, 0x11

    .line 32
    .line 33
    const v7, 0x32132

    .line 34
    .line 35
    .line 36
    const/16 v8, 0x3213

    .line 37
    .line 38
    const/16 v9, 0x212

    .line 39
    .line 40
    packed-switch p1, :pswitch_data_0

    .line 41
    .line 42
    .line 43
    packed-switch p1, :pswitch_data_1

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1, p2}, Lf1/h;->d(II)V

    .line 47
    .line 48
    .line 49
    throw v2

    .line 50
    :pswitch_0
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Lb5/c;

    .line 53
    .line 54
    sget-object v2, Lw4/c;->r:Lw4/c;

    .line 55
    .line 56
    invoke-virtual {v0, v1, v2, v2}, Li4/a0;->g(Lb5/c;Lw4/c;Lw4/c;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_6

    .line 60
    .line 61
    :pswitch_1
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, Lb5/c;

    .line 64
    .line 65
    sget-object v2, Lw4/c;->s:Lw4/c;

    .line 66
    .line 67
    invoke-virtual {v0, v1, v2, v2}, Li4/a0;->g(Lb5/c;Lw4/c;Lw4/c;)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_6

    .line 71
    .line 72
    :pswitch_2
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, Lb5/c;

    .line 75
    .line 76
    sget-object v2, Lw4/c;->u:Lw4/c;

    .line 77
    .line 78
    invoke-virtual {v0, v1, v2, v2}, Li4/a0;->g(Lb5/c;Lw4/c;Lw4/c;)V

    .line 79
    .line 80
    .line 81
    goto/16 :goto_6

    .line 82
    .line 83
    :pswitch_3
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v1, Lb5/c;

    .line 86
    .line 87
    sget-object v2, Lw4/c;->r:Lw4/c;

    .line 88
    .line 89
    invoke-virtual {v0, v1, v2}, Li4/a0;->f(Lb5/c;Lw4/c;)V

    .line 90
    .line 91
    .line 92
    goto/16 :goto_6

    .line 93
    .line 94
    :pswitch_4
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Lb5/c;

    .line 97
    .line 98
    sget-object v2, Lw4/c;->s:Lw4/c;

    .line 99
    .line 100
    invoke-virtual {v0, v1, v2}, Li4/a0;->f(Lb5/c;Lw4/c;)V

    .line 101
    .line 102
    .line 103
    goto/16 :goto_6

    .line 104
    .line 105
    :pswitch_5
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v1, Lb5/c;

    .line 108
    .line 109
    sget-object v2, Lw4/c;->u:Lw4/c;

    .line 110
    .line 111
    invoke-virtual {v0, v1, v2}, Li4/a0;->f(Lb5/c;Lw4/c;)V

    .line 112
    .line 113
    .line 114
    goto/16 :goto_6

    .line 115
    .line 116
    :pswitch_6
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v1, Lb5/c;

    .line 119
    .line 120
    sget-object v2, Lw4/c;->t:Lw4/c;

    .line 121
    .line 122
    invoke-virtual {v0, v1, v2}, Li4/a0;->f(Lb5/c;Lw4/c;)V

    .line 123
    .line 124
    .line 125
    goto/16 :goto_6

    .line 126
    .line 127
    :pswitch_7
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v1, Lb5/c;

    .line 130
    .line 131
    iget-object v1, v1, Lb5/c;->b:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v1, Li4/n;

    .line 134
    .line 135
    invoke-virtual {v1, v3}, Li4/n;->p(I)Lw4/c;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {v2}, Lw4/c;->q()Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-eqz v2, :cond_0

    .line 144
    .line 145
    invoke-virtual {v1, v4}, Li4/n;->p(I)Lw4/c;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {v1}, Lw4/c;->q()Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_0

    .line 154
    .line 155
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v1, Lb5/c;

    .line 158
    .line 159
    invoke-virtual {v0, v5, v1}, Li4/a0;->d(ILb5/c;)V

    .line 160
    .line 161
    .line 162
    const/16 v1, 0x12

    .line 163
    .line 164
    iput v1, v0, Li4/a0;->e:I

    .line 165
    .line 166
    goto/16 :goto_6

    .line 167
    .line 168
    :cond_0
    invoke-static {}, Li4/c0;->a()Li4/b0;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    throw p1

    .line 173
    :pswitch_8
    iget-object v2, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v2, Lb5/c;

    .line 176
    .line 177
    iget-object v2, v2, Lb5/c;->b:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v2, Li4/n;

    .line 180
    .line 181
    invoke-virtual {v2, v3}, Li4/n;->p(I)Lw4/c;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    invoke-virtual {v3}, Lw4/c;->r()Z

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    if-eqz v3, :cond_3

    .line 190
    .line 191
    invoke-virtual {v2, v5}, Li4/n;->p(I)Lw4/c;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-virtual {v3}, Lw4/c;->r()Z

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    if-eqz v3, :cond_1

    .line 200
    .line 201
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v1, Lb5/c;

    .line 204
    .line 205
    invoke-virtual {v0, v5, v1}, Li4/a0;->d(ILb5/c;)V

    .line 206
    .line 207
    .line 208
    iput v9, v0, Li4/a0;->e:I

    .line 209
    .line 210
    goto/16 :goto_6

    .line 211
    .line 212
    :cond_1
    invoke-virtual {v2, v1}, Li4/n;->p(I)Lw4/c;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-virtual {v2}, Lw4/c;->q()Z

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    if-eqz v2, :cond_2

    .line 221
    .line 222
    iget-object v2, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v2, Lb5/c;

    .line 225
    .line 226
    invoke-virtual {v0, v1, v2}, Li4/a0;->d(ILb5/c;)V

    .line 227
    .line 228
    .line 229
    iput v8, v0, Li4/a0;->e:I

    .line 230
    .line 231
    goto/16 :goto_6

    .line 232
    .line 233
    :cond_2
    invoke-static {}, Li4/c0;->a()Li4/b0;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    throw p1

    .line 238
    :cond_3
    invoke-virtual {v2, v4}, Li4/n;->p(I)Lw4/c;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    invoke-virtual {v3}, Lw4/c;->q()Z

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    if-eqz v3, :cond_6

    .line 247
    .line 248
    invoke-virtual {v2, v5}, Li4/n;->p(I)Lw4/c;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-virtual {v3}, Lw4/c;->r()Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    if-eqz v3, :cond_4

    .line 257
    .line 258
    iget-object v2, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v2, Lb5/c;

    .line 261
    .line 262
    invoke-virtual {v0, v1, v2}, Li4/a0;->d(ILb5/c;)V

    .line 263
    .line 264
    .line 265
    iput v7, v0, Li4/a0;->e:I

    .line 266
    .line 267
    goto/16 :goto_6

    .line 268
    .line 269
    :cond_4
    invoke-virtual {v2, v1}, Li4/n;->p(I)Lw4/c;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-virtual {v1}, Lw4/c;->q()Z

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    if-eqz v1, :cond_5

    .line 278
    .line 279
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v1, Lb5/c;

    .line 282
    .line 283
    const/4 v2, 0x4

    .line 284
    invoke-virtual {v0, v2, v1}, Li4/a0;->d(ILb5/c;)V

    .line 285
    .line 286
    .line 287
    const v1, 0x432143

    .line 288
    .line 289
    .line 290
    iput v1, v0, Li4/a0;->e:I

    .line 291
    .line 292
    goto/16 :goto_6

    .line 293
    .line 294
    :cond_5
    invoke-static {}, Li4/c0;->a()Li4/b0;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    throw p1

    .line 299
    :cond_6
    invoke-static {}, Li4/c0;->a()Li4/b0;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    throw p1

    .line 304
    :pswitch_9
    iget-object v2, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v2, Lb5/c;

    .line 307
    .line 308
    iget-object v2, v2, Lb5/c;->b:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v2, Li4/n;

    .line 311
    .line 312
    invoke-virtual {v2, v3}, Li4/n;->p(I)Lw4/c;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    invoke-virtual {v3}, Lw4/c;->r()Z

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    if-eqz v3, :cond_8

    .line 321
    .line 322
    invoke-virtual {v2, v5}, Li4/n;->p(I)Lw4/c;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    invoke-virtual {v1}, Lw4/c;->r()Z

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    if-nez v1, :cond_7

    .line 331
    .line 332
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v1, Lb5/c;

    .line 335
    .line 336
    invoke-virtual {v0, v5, v1}, Li4/a0;->d(ILb5/c;)V

    .line 337
    .line 338
    .line 339
    iput v9, v0, Li4/a0;->e:I

    .line 340
    .line 341
    goto/16 :goto_6

    .line 342
    .line 343
    :cond_7
    invoke-static {}, Li4/c0;->a()Li4/b0;

    .line 344
    .line 345
    .line 346
    move-result-object p1

    .line 347
    throw p1

    .line 348
    :cond_8
    invoke-virtual {v2, v4}, Li4/n;->p(I)Lw4/c;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    invoke-virtual {v3}, Lw4/c;->r()Z

    .line 353
    .line 354
    .line 355
    move-result v3

    .line 356
    if-nez v3, :cond_9

    .line 357
    .line 358
    invoke-virtual {v2, v5}, Li4/n;->p(I)Lw4/c;

    .line 359
    .line 360
    .line 361
    move-result-object v2

    .line 362
    invoke-virtual {v2}, Lw4/c;->r()Z

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    if-nez v2, :cond_9

    .line 367
    .line 368
    iget-object v2, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v2, Lb5/c;

    .line 371
    .line 372
    invoke-virtual {v0, v1, v2}, Li4/a0;->d(ILb5/c;)V

    .line 373
    .line 374
    .line 375
    iput v7, v0, Li4/a0;->e:I

    .line 376
    .line 377
    goto/16 :goto_6

    .line 378
    .line 379
    :cond_9
    invoke-static {}, Li4/c0;->a()Li4/b0;

    .line 380
    .line 381
    .line 382
    move-result-object p1

    .line 383
    throw p1

    .line 384
    :pswitch_a
    iget-object v2, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast v2, Lb5/c;

    .line 387
    .line 388
    iget-object v2, v2, Lb5/c;->b:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v2, Li4/n;

    .line 391
    .line 392
    invoke-virtual {v2, v3}, Li4/n;->p(I)Lw4/c;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    invoke-virtual {v3}, Lw4/c;->r()Z

    .line 397
    .line 398
    .line 399
    move-result v3

    .line 400
    if-nez v3, :cond_c

    .line 401
    .line 402
    invoke-virtual {v2, v4}, Li4/n;->p(I)Lw4/c;

    .line 403
    .line 404
    .line 405
    move-result-object v3

    .line 406
    invoke-virtual {v3}, Lw4/c;->r()Z

    .line 407
    .line 408
    .line 409
    move-result v3

    .line 410
    if-eqz v3, :cond_a

    .line 411
    .line 412
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 413
    .line 414
    check-cast v1, Lb5/c;

    .line 415
    .line 416
    invoke-virtual {v0, v5, v1}, Li4/a0;->d(ILb5/c;)V

    .line 417
    .line 418
    .line 419
    iput v9, v0, Li4/a0;->e:I

    .line 420
    .line 421
    goto/16 :goto_6

    .line 422
    .line 423
    :cond_a
    invoke-virtual {v2, v5}, Li4/n;->p(I)Lw4/c;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    invoke-virtual {v2}, Lw4/c;->q()Z

    .line 428
    .line 429
    .line 430
    move-result v2

    .line 431
    if-eqz v2, :cond_b

    .line 432
    .line 433
    iget-object v2, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast v2, Lb5/c;

    .line 436
    .line 437
    invoke-virtual {v0, v1, v2}, Li4/a0;->d(ILb5/c;)V

    .line 438
    .line 439
    .line 440
    iput v8, v0, Li4/a0;->e:I

    .line 441
    .line 442
    goto/16 :goto_6

    .line 443
    .line 444
    :cond_b
    invoke-static {}, Li4/c0;->a()Li4/b0;

    .line 445
    .line 446
    .line 447
    move-result-object p1

    .line 448
    throw p1

    .line 449
    :cond_c
    invoke-static {}, Li4/c0;->a()Li4/b0;

    .line 450
    .line 451
    .line 452
    move-result-object p1

    .line 453
    throw p1

    .line 454
    :pswitch_b
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v1, Lb5/c;

    .line 457
    .line 458
    iget-object v1, v1, Lb5/c;->b:Ljava/lang/Object;

    .line 459
    .line 460
    check-cast v1, Li4/n;

    .line 461
    .line 462
    invoke-virtual {v1, v3}, Li4/n;->p(I)Lw4/c;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    invoke-virtual {v2}, Lw4/c;->q()Z

    .line 467
    .line 468
    .line 469
    move-result v2

    .line 470
    if-eqz v2, :cond_d

    .line 471
    .line 472
    invoke-virtual {v1, v4}, Li4/n;->p(I)Lw4/c;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    invoke-virtual {v1}, Lw4/c;->q()Z

    .line 477
    .line 478
    .line 479
    move-result v1

    .line 480
    if-eqz v1, :cond_d

    .line 481
    .line 482
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 483
    .line 484
    check-cast v1, Lb5/c;

    .line 485
    .line 486
    invoke-virtual {v0, v5, v1}, Li4/a0;->d(ILb5/c;)V

    .line 487
    .line 488
    .line 489
    iput v9, v0, Li4/a0;->e:I

    .line 490
    .line 491
    goto/16 :goto_6

    .line 492
    .line 493
    :cond_d
    invoke-static {}, Li4/c0;->a()Li4/b0;

    .line 494
    .line 495
    .line 496
    move-result-object p1

    .line 497
    throw p1

    .line 498
    :pswitch_c
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 499
    .line 500
    check-cast v1, Lb5/c;

    .line 501
    .line 502
    iget-object v1, v1, Lb5/c;->b:Ljava/lang/Object;

    .line 503
    .line 504
    check-cast v1, Li4/n;

    .line 505
    .line 506
    invoke-virtual {v1, v3}, Li4/n;->p(I)Lw4/c;

    .line 507
    .line 508
    .line 509
    move-result-object v1

    .line 510
    invoke-virtual {v1}, Lw4/c;->r()Z

    .line 511
    .line 512
    .line 513
    move-result v1

    .line 514
    if-nez v1, :cond_e

    .line 515
    .line 516
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 517
    .line 518
    check-cast v1, Lb5/c;

    .line 519
    .line 520
    invoke-virtual {v0, v4, v1}, Li4/a0;->d(ILb5/c;)V

    .line 521
    .line 522
    .line 523
    iput v6, v0, Li4/a0;->e:I

    .line 524
    .line 525
    goto/16 :goto_6

    .line 526
    .line 527
    :cond_e
    invoke-static {}, Li4/c0;->a()Li4/b0;

    .line 528
    .line 529
    .line 530
    move-result-object p1

    .line 531
    throw p1

    .line 532
    :pswitch_d
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 533
    .line 534
    check-cast v1, Lb5/c;

    .line 535
    .line 536
    iget-object v1, v1, Lb5/c;->b:Ljava/lang/Object;

    .line 537
    .line 538
    check-cast v1, Li4/n;

    .line 539
    .line 540
    invoke-virtual {v1, v3}, Li4/n;->p(I)Lw4/c;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    invoke-virtual {v2}, Lw4/c;->r()Z

    .line 545
    .line 546
    .line 547
    move-result v2

    .line 548
    if-eqz v2, :cond_f

    .line 549
    .line 550
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 551
    .line 552
    check-cast v1, Lb5/c;

    .line 553
    .line 554
    invoke-virtual {v0, v4, v1}, Li4/a0;->d(ILb5/c;)V

    .line 555
    .line 556
    .line 557
    goto :goto_0

    .line 558
    :cond_f
    invoke-virtual {v1, v4}, Li4/n;->p(I)Lw4/c;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    invoke-virtual {v1}, Lw4/c;->q()Z

    .line 563
    .line 564
    .line 565
    move-result v1

    .line 566
    if-eqz v1, :cond_10

    .line 567
    .line 568
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 569
    .line 570
    check-cast v1, Lb5/c;

    .line 571
    .line 572
    invoke-virtual {v0, v5, v1}, Li4/a0;->d(ILb5/c;)V

    .line 573
    .line 574
    .line 575
    const/16 v6, 0x2121

    .line 576
    .line 577
    :goto_0
    const/16 v1, 0x5c

    .line 578
    .line 579
    if-ne p1, v1, :cond_20

    .line 580
    .line 581
    iput v6, v0, Li4/a0;->e:I

    .line 582
    .line 583
    goto/16 :goto_6

    .line 584
    .line 585
    :cond_10
    invoke-static {}, Li4/c0;->a()Li4/b0;

    .line 586
    .line 587
    .line 588
    move-result-object p1

    .line 589
    throw p1

    .line 590
    :pswitch_e
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 591
    .line 592
    check-cast v1, Lb5/c;

    .line 593
    .line 594
    iget-object v1, v1, Lb5/c;->b:Ljava/lang/Object;

    .line 595
    .line 596
    check-cast v1, Li4/n;

    .line 597
    .line 598
    invoke-virtual {v1, v3}, Li4/n;->p(I)Lw4/c;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    invoke-virtual {v1}, Lw4/c;->r()Z

    .line 603
    .line 604
    .line 605
    move-result v1

    .line 606
    if-nez v1, :cond_11

    .line 607
    .line 608
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 609
    .line 610
    check-cast v1, Lb5/c;

    .line 611
    .line 612
    invoke-virtual {v0, v4, v1}, Li4/a0;->d(ILb5/c;)V

    .line 613
    .line 614
    .line 615
    goto/16 :goto_6

    .line 616
    .line 617
    :cond_11
    invoke-static {}, Li4/c0;->a()Li4/b0;

    .line 618
    .line 619
    .line 620
    move-result-object p1

    .line 621
    throw p1

    .line 622
    :sswitch_0
    invoke-virtual {v0}, Li4/a0;->b()V

    .line 623
    .line 624
    .line 625
    sget-object v1, Lw4/c;->w:Lw4/c;

    .line 626
    .line 627
    invoke-virtual {p0, v1}, Lf1/h;->l(Lw4/c;)V

    .line 628
    .line 629
    .line 630
    goto/16 :goto_6

    .line 631
    .line 632
    :sswitch_1
    sget-object v1, Lw4/c;->E:Lw4/c;

    .line 633
    .line 634
    if-ne p3, v1, :cond_12

    .line 635
    .line 636
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 637
    .line 638
    check-cast v1, Lb5/c;

    .line 639
    .line 640
    iget-object v1, v1, Lb5/c;->b:Ljava/lang/Object;

    .line 641
    .line 642
    check-cast v1, Li4/n;

    .line 643
    .line 644
    invoke-virtual {v1, v3}, Li4/n;->p(I)Lw4/c;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    goto :goto_1

    .line 649
    :cond_12
    move-object v1, p3

    .line 650
    :goto_1
    iget-object v2, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 651
    .line 652
    check-cast v2, Lb5/c;

    .line 653
    .line 654
    invoke-virtual {v0, v2, p3}, Li4/a0;->f(Lb5/c;Lw4/c;)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {p0, v1}, Lf1/h;->l(Lw4/c;)V

    .line 658
    .line 659
    .line 660
    goto/16 :goto_6

    .line 661
    .line 662
    :sswitch_2
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 663
    .line 664
    check-cast v1, Lb5/c;

    .line 665
    .line 666
    sget-object v2, Lw4/c;->t:Lw4/c;

    .line 667
    .line 668
    invoke-virtual {v0, v1, p3, v2}, Li4/a0;->g(Lb5/c;Lw4/c;Lw4/c;)V

    .line 669
    .line 670
    .line 671
    goto/16 :goto_6

    .line 672
    .line 673
    :sswitch_3
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 674
    .line 675
    check-cast v1, Lb5/c;

    .line 676
    .line 677
    invoke-virtual {v0, v1, p3}, Li4/a0;->f(Lb5/c;Lw4/c;)V

    .line 678
    .line 679
    .line 680
    goto/16 :goto_6

    .line 681
    .line 682
    :pswitch_f
    :sswitch_4
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 683
    .line 684
    check-cast v1, Lb5/c;

    .line 685
    .line 686
    invoke-virtual {v0, v1, p3, p3}, Li4/a0;->g(Lb5/c;Lw4/c;Lw4/c;)V

    .line 687
    .line 688
    .line 689
    goto/16 :goto_6

    .line 690
    .line 691
    :sswitch_5
    iget-object v6, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 692
    .line 693
    check-cast v6, Lb5/c;

    .line 694
    .line 695
    iget-object v6, v6, Lb5/c;->b:Ljava/lang/Object;

    .line 696
    .line 697
    check-cast v6, Li4/n;

    .line 698
    .line 699
    invoke-virtual {p3}, Lw4/c;->q()Z

    .line 700
    .line 701
    .line 702
    move-result v7

    .line 703
    if-eqz v7, :cond_13

    .line 704
    .line 705
    move v7, v5

    .line 706
    goto :goto_2

    .line 707
    :cond_13
    move v7, v1

    .line 708
    :goto_2
    invoke-virtual {v6, v7}, Li4/n;->p(I)Lw4/c;

    .line 709
    .line 710
    .line 711
    move-result-object v8

    .line 712
    iget v9, v6, Li4/n;->i:I

    .line 713
    .line 714
    if-ge v7, v9, :cond_19

    .line 715
    .line 716
    iget-object v2, v6, Li4/n;->k:Ljava/lang/Object;

    .line 717
    .line 718
    check-cast v2, [Z

    .line 719
    .line 720
    sub-int/2addr v9, v7

    .line 721
    sub-int/2addr v9, v4

    .line 722
    aget-boolean v2, v2, v9

    .line 723
    .line 724
    invoke-static {p3, v8}, Li4/c0;->b(Lw4/c;Lw4/c;)Lw4/c;

    .line 725
    .line 726
    .line 727
    move-result-object v6

    .line 728
    if-eqz v2, :cond_15

    .line 729
    .line 730
    sget-object p3, Lw4/c;->x:Lw4/c;

    .line 731
    .line 732
    if-ne v6, p3, :cond_14

    .line 733
    .line 734
    goto :goto_3

    .line 735
    :cond_14
    invoke-virtual {v6}, Lw4/c;->k()Lw4/c;

    .line 736
    .line 737
    .line 738
    move-result-object p3

    .line 739
    :cond_15
    :goto_3
    iget-object v2, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 740
    .line 741
    check-cast v2, Lb5/c;

    .line 742
    .line 743
    sget-object v7, Lw4/c;->t:Lw4/c;

    .line 744
    .line 745
    invoke-virtual {v0, v1, v2}, Li4/a0;->d(ILb5/c;)V

    .line 746
    .line 747
    .line 748
    iget-object v1, v0, Li4/a0;->b:[Lw4/d;

    .line 749
    .line 750
    aget-object v1, v1, v3

    .line 751
    .line 752
    invoke-static {v6, v1}, Lx6/d;->I(Lw4/d;Lw4/d;)Z

    .line 753
    .line 754
    .line 755
    move-result v1

    .line 756
    if-eqz v1, :cond_18

    .line 757
    .line 758
    iget-object v1, v0, Li4/a0;->b:[Lw4/d;

    .line 759
    .line 760
    aget-object v1, v1, v4

    .line 761
    .line 762
    invoke-static {v7, v1}, Lx6/d;->I(Lw4/d;Lw4/d;)Z

    .line 763
    .line 764
    .line 765
    move-result v1

    .line 766
    if-eqz v1, :cond_17

    .line 767
    .line 768
    iget-object v1, v0, Li4/a0;->b:[Lw4/d;

    .line 769
    .line 770
    aget-object v1, v1, v5

    .line 771
    .line 772
    invoke-static {p3, v1}, Lx6/d;->I(Lw4/d;Lw4/d;)Z

    .line 773
    .line 774
    .line 775
    move-result v1

    .line 776
    if-eqz v1, :cond_16

    .line 777
    .line 778
    goto/16 :goto_6

    .line 779
    .line 780
    :cond_16
    invoke-virtual {p3}, Lw4/c;->a()Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    move-result-object p1

    .line 784
    iget-object p2, v0, Li4/a0;->b:[Lw4/d;

    .line 785
    .line 786
    aget-object p2, p2, v5

    .line 787
    .line 788
    invoke-interface {p2}, Lw4/d;->getType()Lw4/c;

    .line 789
    .line 790
    .line 791
    move-result-object p2

    .line 792
    invoke-virtual {p2}, Lw4/c;->a()Ljava/lang/String;

    .line 793
    .line 794
    .line 795
    move-result-object p2

    .line 796
    invoke-static {p1, p2}, Lg1/d;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 797
    .line 798
    .line 799
    return-void

    .line 800
    :cond_17
    invoke-virtual {v7}, Lw4/c;->a()Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object p1

    .line 804
    iget-object p2, v0, Li4/a0;->b:[Lw4/d;

    .line 805
    .line 806
    aget-object p2, p2, v4

    .line 807
    .line 808
    invoke-interface {p2}, Lw4/d;->getType()Lw4/c;

    .line 809
    .line 810
    .line 811
    move-result-object p2

    .line 812
    invoke-virtual {p2}, Lw4/c;->a()Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object p2

    .line 816
    invoke-static {p1, p2}, Lg1/d;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 817
    .line 818
    .line 819
    return-void

    .line 820
    :cond_18
    invoke-virtual {v6}, Lw4/c;->a()Ljava/lang/String;

    .line 821
    .line 822
    .line 823
    move-result-object p1

    .line 824
    iget-object p2, v0, Li4/a0;->b:[Lw4/d;

    .line 825
    .line 826
    aget-object p2, p2, v3

    .line 827
    .line 828
    invoke-interface {p2}, Lw4/d;->getType()Lw4/c;

    .line 829
    .line 830
    .line 831
    move-result-object p2

    .line 832
    invoke-virtual {p2}, Lw4/c;->a()Ljava/lang/String;

    .line 833
    .line 834
    .line 835
    move-result-object p2

    .line 836
    invoke-static {p1, p2}, Lg1/d;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 837
    .line 838
    .line 839
    return-void

    .line 840
    :cond_19
    new-instance p1, Li4/b0;

    .line 841
    .line 842
    const-string p2, "stack: underflow"

    .line 843
    .line 844
    invoke-direct {p1, p2, v2}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 845
    .line 846
    .line 847
    throw p1

    .line 848
    :sswitch_6
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 849
    .line 850
    check-cast v1, Lb5/c;

    .line 851
    .line 852
    iget-object v1, v1, Lb5/c;->b:Ljava/lang/Object;

    .line 853
    .line 854
    check-cast v1, Li4/n;

    .line 855
    .line 856
    invoke-virtual {v1, v4}, Li4/n;->p(I)Lw4/c;

    .line 857
    .line 858
    .line 859
    move-result-object v1

    .line 860
    invoke-static {p3, v1}, Li4/c0;->b(Lw4/c;Lw4/c;)Lw4/c;

    .line 861
    .line 862
    .line 863
    move-result-object p3

    .line 864
    sget-object v1, Lw4/c;->x:Lw4/c;

    .line 865
    .line 866
    if-ne p3, v1, :cond_1a

    .line 867
    .line 868
    goto :goto_4

    .line 869
    :cond_1a
    invoke-virtual {p3}, Lw4/c;->k()Lw4/c;

    .line 870
    .line 871
    .line 872
    move-result-object v1

    .line 873
    :goto_4
    iget-object v2, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 874
    .line 875
    check-cast v2, Lb5/c;

    .line 876
    .line 877
    sget-object v3, Lw4/c;->t:Lw4/c;

    .line 878
    .line 879
    invoke-virtual {v0, v2, p3, v3}, Li4/a0;->g(Lb5/c;Lw4/c;Lw4/c;)V

    .line 880
    .line 881
    .line 882
    move-object p3, v1

    .line 883
    goto :goto_6

    .line 884
    :cond_1b
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 885
    .line 886
    check-cast v1, Lb5/c;

    .line 887
    .line 888
    sget-object v2, Lw4/c;->E:Lw4/c;

    .line 889
    .line 890
    invoke-virtual {v0, v1, v2}, Li4/a0;->f(Lb5/c;Lw4/c;)V

    .line 891
    .line 892
    .line 893
    goto :goto_6

    .line 894
    :cond_1c
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 895
    .line 896
    check-cast v1, Lb5/c;

    .line 897
    .line 898
    iget-object v1, v1, Lb5/c;->b:Ljava/lang/Object;

    .line 899
    .line 900
    check-cast v1, Li4/n;

    .line 901
    .line 902
    invoke-virtual {v1, v3}, Li4/n;->p(I)Lw4/c;

    .line 903
    .line 904
    .line 905
    move-result-object v1

    .line 906
    invoke-virtual {v1}, Lw4/c;->p()Z

    .line 907
    .line 908
    .line 909
    move-result v3

    .line 910
    if-nez v3, :cond_1e

    .line 911
    .line 912
    sget-object v3, Lw4/c;->x:Lw4/c;

    .line 913
    .line 914
    invoke-virtual {v1, v3}, Lw4/c;->equals(Ljava/lang/Object;)Z

    .line 915
    .line 916
    .line 917
    move-result v3

    .line 918
    if-eqz v3, :cond_1d

    .line 919
    .line 920
    goto :goto_5

    .line 921
    :cond_1d
    iget-object p1, p0, Lf1/h;->k:Ljava/lang/Object;

    .line 922
    .line 923
    check-cast p1, Li4/c0;

    .line 924
    .line 925
    new-instance p2, Ljava/lang/StringBuilder;

    .line 926
    .line 927
    const-string p3, "type mismatch: expected array type but encountered "

    .line 928
    .line 929
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 930
    .line 931
    .line 932
    invoke-virtual {v1}, Lw4/c;->a()Ljava/lang/String;

    .line 933
    .line 934
    .line 935
    move-result-object p3

    .line 936
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 937
    .line 938
    .line 939
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 940
    .line 941
    .line 942
    move-result-object p2

    .line 943
    invoke-virtual {p1, p2}, Li4/c0;->g(Ljava/lang/String;)V

    .line 944
    .line 945
    .line 946
    throw v2

    .line 947
    :cond_1e
    :goto_5
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 948
    .line 949
    check-cast v1, Lb5/c;

    .line 950
    .line 951
    sget-object v2, Lw4/c;->E:Lw4/c;

    .line 952
    .line 953
    invoke-virtual {v0, v1, v2}, Li4/a0;->f(Lb5/c;Lw4/c;)V

    .line 954
    .line 955
    .line 956
    goto :goto_6

    .line 957
    :cond_1f
    :sswitch_7
    invoke-virtual {v0}, Li4/a0;->b()V

    .line 958
    .line 959
    .line 960
    :cond_20
    :goto_6
    iput-object p3, v0, Li4/a0;->d:Lw4/c;

    .line 961
    .line 962
    iget-object p3, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 963
    .line 964
    check-cast p3, Lb5/c;

    .line 965
    .line 966
    invoke-virtual {v0, p2, p1, p3}, Li4/a0;->h(IILb5/c;)V

    .line 967
    .line 968
    .line 969
    return-void

    .line 970
    nop

    .line 971
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_7
        0x2e -> :sswitch_6
        0x4f -> :sswitch_5
        0x64 -> :sswitch_4
        0x68 -> :sswitch_4
        0x6c -> :sswitch_4
        0x70 -> :sswitch_4
        0x74 -> :sswitch_3
        0x78 -> :sswitch_2
        0x7a -> :sswitch_2
        0x7c -> :sswitch_2
        0x7e -> :sswitch_4
        0x80 -> :sswitch_4
        0x82 -> :sswitch_4
        0xac -> :sswitch_1
        0xb1 -> :sswitch_0
    .end sparse-switch

    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    :pswitch_data_0
    .packed-switch 0x57
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_d
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_f
    .end packed-switch

    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    :pswitch_data_1
    .packed-switch 0x85
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public b(IIILv4/a;I)V
    .locals 10

    .line 1
    const/16 p3, 0xd

    .line 2
    .line 3
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    const/16 v0, 0x1a

    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lf1/h;->k:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Li4/c0;

    .line 16
    .line 17
    iget-object v3, v2, Li4/c0;->f:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Ln4/a;

    .line 20
    .line 21
    iget-object v4, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v4, Li4/a0;

    .line 24
    .line 25
    const/16 v5, 0x12

    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    if-eq p1, v5, :cond_f

    .line 29
    .line 30
    const/16 v5, 0x13

    .line 31
    .line 32
    if-eq p1, v5, :cond_f

    .line 33
    .line 34
    const/16 v5, 0xbd

    .line 35
    .line 36
    if-eq p1, v5, :cond_e

    .line 37
    .line 38
    const/16 v5, 0xc5

    .line 39
    .line 40
    const/4 v7, 0x0

    .line 41
    if-eq p1, v5, :cond_c

    .line 42
    .line 43
    const/16 v5, 0xc0

    .line 44
    .line 45
    if-eq p1, v5, :cond_b

    .line 46
    .line 47
    const/16 v5, 0xc1

    .line 48
    .line 49
    if-eq p1, v5, :cond_b

    .line 50
    .line 51
    packed-switch p1, :pswitch_data_0

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4}, Li4/a0;->b()V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :pswitch_0
    invoke-virtual {v3, v0}, Ln4/a;->a(I)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    check-cast p4, Lv4/q;

    .line 66
    .line 67
    iget-object p3, p4, Lv4/q;->i:Lw4/a;

    .line 68
    .line 69
    iget-object v0, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Lb5/c;

    .line 72
    .line 73
    invoke-virtual {v4, v0, p3}, Li4/a0;->e(Lb5/c;Lw4/a;)V

    .line 74
    .line 75
    .line 76
    new-instance p3, Lv4/i;

    .line 77
    .line 78
    iget-object v0, p4, Lv4/q;->l:Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    invoke-direct {p3, p4, v1}, Lv4/i;-><init>(Lv4/q;I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-object p4, p3

    .line 91
    goto/16 :goto_5

    .line 92
    .line 93
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    filled-new-array {p1, v1, p3}, [Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    const-string p2, "invalid opcode %02x - invokedynamic requires --min-sdk-version >= %d (currently %d)"

    .line 102
    .line 103
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {v2, p1}, Li4/c0;->g(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw v6

    .line 111
    :pswitch_1
    instance-of v5, p4, Lv4/p;

    .line 112
    .line 113
    const/16 v8, 0xb8

    .line 114
    .line 115
    if-eqz v5, :cond_4

    .line 116
    .line 117
    check-cast p4, Lv4/p;

    .line 118
    .line 119
    invoke-virtual {p4}, Lv4/p;->l()Lv4/y;

    .line 120
    .line 121
    .line 122
    move-result-object p4

    .line 123
    const/16 v5, 0xb9

    .line 124
    .line 125
    if-ne p1, v5, :cond_1

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_1
    const/16 v5, 0x18

    .line 129
    .line 130
    invoke-virtual {v3, v5}, Ln4/a;->a(I)Z

    .line 131
    .line 132
    .line 133
    move-result v9

    .line 134
    if-eqz v9, :cond_2

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_2
    if-ne p1, v8, :cond_3

    .line 138
    .line 139
    const-string p1, "static"

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_3
    const-string p1, "default"

    .line 143
    .line 144
    :goto_0
    iget-object p2, p4, Lv4/w;->g:Lv4/d0;

    .line 145
    .line 146
    iget-object p2, p2, Lv4/d0;->g:Lw4/c;

    .line 147
    .line 148
    invoke-virtual {p2}, Lw4/c;->a()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    iget-object p4, p4, Lv4/w;->h:Lv4/z;

    .line 153
    .line 154
    invoke-virtual {p4}, Lv4/z;->a()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p4

    .line 158
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object p5

    .line 162
    filled-new-array {p1, p2, p4, p5, p3}, [Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    const-string p2, "invoking a %s interface method %s.%s strictly requires --min-sdk-version >= %d (blocked at current API level %d)"

    .line 167
    .line 168
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {v2, p1}, Li4/c0;->g(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    throw v6

    .line 176
    :cond_4
    :goto_1
    instance-of v5, p4, Lv4/y;

    .line 177
    .line 178
    if-eqz v5, :cond_7

    .line 179
    .line 180
    move-object v5, p4

    .line 181
    check-cast v5, Lv4/y;

    .line 182
    .line 183
    invoke-virtual {v5}, Lv4/e;->k()Z

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    if-eqz v5, :cond_7

    .line 188
    .line 189
    invoke-virtual {v3, v0}, Ln4/a;->a(I)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_6

    .line 194
    .line 195
    const/16 p3, 0xb6

    .line 196
    .line 197
    if-ne p1, p3, :cond_5

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_5
    new-instance p2, Ljava/lang/StringBuilder;

    .line 201
    .line 202
    const-string p3, "Unsupported signature polymorphic invocation ("

    .line 203
    .line 204
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    invoke-static {p1}, Li4/h;->a(I)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    const-string p1, ")"

    .line 215
    .line 216
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-virtual {v2, p1}, Li4/c0;->g(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw v6

    .line 227
    :cond_6
    const-string p1, "invoking a signature-polymorphic requires --min-sdk-version >= %d (currently %d)"

    .line 228
    .line 229
    filled-new-array {v1, p3}, [Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-virtual {v2, p1}, Li4/c0;->g(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw v6

    .line 241
    :cond_7
    :goto_2
    if-ne p1, v8, :cond_8

    .line 242
    .line 243
    const/4 v7, 0x1

    .line 244
    :cond_8
    move-object p3, p4

    .line 245
    check-cast p3, Lv4/y;

    .line 246
    .line 247
    iget-object v0, p3, Lv4/e;->i:Lw4/a;

    .line 248
    .line 249
    if-eqz v7, :cond_9

    .line 250
    .line 251
    goto :goto_3

    .line 252
    :cond_9
    iget-object v1, p3, Lv4/e;->j:Lw4/a;

    .line 253
    .line 254
    if-nez v1, :cond_a

    .line 255
    .line 256
    iget-object v1, p3, Lv4/w;->g:Lv4/d0;

    .line 257
    .line 258
    iget-object v1, v1, Lv4/d0;->g:Lw4/c;

    .line 259
    .line 260
    invoke-virtual {v0, v1}, Lw4/a;->e(Lw4/c;)Lw4/a;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    iput-object v0, p3, Lv4/e;->j:Lw4/a;

    .line 265
    .line 266
    :cond_a
    iget-object v0, p3, Lv4/e;->j:Lw4/a;

    .line 267
    .line 268
    :goto_3
    iget-object p3, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast p3, Lb5/c;

    .line 271
    .line 272
    invoke-virtual {v4, p3, v0}, Li4/a0;->e(Lb5/c;Lw4/a;)V

    .line 273
    .line 274
    .line 275
    goto/16 :goto_5

    .line 276
    .line 277
    :pswitch_2
    move-object p3, p4

    .line 278
    check-cast p3, Lv4/m;

    .line 279
    .line 280
    iget-object p3, p3, Lv4/w;->h:Lv4/z;

    .line 281
    .line 282
    invoke-virtual {p3}, Lv4/z;->k()Lw4/c;

    .line 283
    .line 284
    .line 285
    move-result-object p3

    .line 286
    iget-object v0, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v0, Lb5/c;

    .line 289
    .line 290
    sget-object v1, Lw4/c;->E:Lw4/c;

    .line 291
    .line 292
    invoke-virtual {v4, v0, v1, p3}, Li4/a0;->g(Lb5/c;Lw4/c;Lw4/c;)V

    .line 293
    .line 294
    .line 295
    goto :goto_5

    .line 296
    :pswitch_3
    move-object p3, p4

    .line 297
    check-cast p3, Lv4/m;

    .line 298
    .line 299
    iget-object p3, p3, Lv4/w;->h:Lv4/z;

    .line 300
    .line 301
    invoke-virtual {p3}, Lv4/z;->k()Lw4/c;

    .line 302
    .line 303
    .line 304
    move-result-object p3

    .line 305
    iget-object v0, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v0, Lb5/c;

    .line 308
    .line 309
    invoke-virtual {v4, v0, p3}, Li4/a0;->f(Lb5/c;Lw4/c;)V

    .line 310
    .line 311
    .line 312
    goto :goto_5

    .line 313
    :cond_b
    :pswitch_4
    iget-object p3, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast p3, Lb5/c;

    .line 316
    .line 317
    sget-object v0, Lw4/c;->E:Lw4/c;

    .line 318
    .line 319
    invoke-virtual {v4, p3, v0}, Li4/a0;->f(Lb5/c;Lw4/c;)V

    .line 320
    .line 321
    .line 322
    goto :goto_5

    .line 323
    :cond_c
    sget-object p3, Lw4/c;->w:Lw4/c;

    .line 324
    .line 325
    sget-object v0, Lw4/a;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 326
    .line 327
    new-instance v0, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    const/16 v1, 0x64

    .line 330
    .line 331
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 332
    .line 333
    .line 334
    const/16 v1, 0x28

    .line 335
    .line 336
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    :goto_4
    if-ge v7, p5, :cond_d

    .line 340
    .line 341
    const/16 v1, 0x49

    .line 342
    .line 343
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    add-int/lit8 v7, v7, 0x1

    .line 347
    .line 348
    goto :goto_4

    .line 349
    :cond_d
    const/16 v1, 0x29

    .line 350
    .line 351
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    iget-object p3, p3, Lw4/c;->g:Ljava/lang/String;

    .line 355
    .line 356
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object p3

    .line 363
    invoke-static {p3}, Lw4/a;->d(Ljava/lang/String;)Lw4/a;

    .line 364
    .line 365
    .line 366
    move-result-object p3

    .line 367
    iget-object v0, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast v0, Lb5/c;

    .line 370
    .line 371
    invoke-virtual {v4, v0, p3}, Li4/a0;->e(Lb5/c;Lw4/a;)V

    .line 372
    .line 373
    .line 374
    goto :goto_5

    .line 375
    :cond_e
    iget-object p3, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast p3, Lb5/c;

    .line 378
    .line 379
    sget-object v0, Lw4/c;->t:Lw4/c;

    .line 380
    .line 381
    invoke-virtual {v4, p3, v0}, Li4/a0;->f(Lb5/c;Lw4/c;)V

    .line 382
    .line 383
    .line 384
    goto :goto_5

    .line 385
    :cond_f
    instance-of v0, p4, Lv4/x;

    .line 386
    .line 387
    if-nez v0, :cond_10

    .line 388
    .line 389
    instance-of v0, p4, Lv4/a0;

    .line 390
    .line 391
    if-eqz v0, :cond_11

    .line 392
    .line 393
    :cond_10
    const/16 v0, 0x1c

    .line 394
    .line 395
    invoke-virtual {v3, v0}, Ln4/a;->a(I)Z

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    if-eqz v1, :cond_13

    .line 400
    .line 401
    :cond_11
    invoke-virtual {v4}, Li4/a0;->b()V

    .line 402
    .line 403
    .line 404
    :goto_5
    iput p5, v4, Li4/a0;->e:I

    .line 405
    .line 406
    if-eqz p4, :cond_12

    .line 407
    .line 408
    iput-object p4, v4, Li4/a0;->f:Lv4/a;

    .line 409
    .line 410
    iget-object p3, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast p3, Lb5/c;

    .line 413
    .line 414
    invoke-virtual {v4, p2, p1, p3}, Li4/a0;->h(IILb5/c;)V

    .line 415
    .line 416
    .line 417
    return-void

    .line 418
    :cond_12
    const-string p1, "cst == null"

    .line 419
    .line 420
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    return-void

    .line 424
    :cond_13
    invoke-virtual {p4}, Lv4/a;->j()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object p1

    .line 428
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 429
    .line 430
    .line 431
    move-result-object p2

    .line 432
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object p1

    .line 436
    const-string p2, "invalid constant type %s requires --min-sdk-version >= %d (currently %d)"

    .line 437
    .line 438
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object p1

    .line 442
    invoke-virtual {v2, p1}, Li4/c0;->g(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    throw v6

    .line 446
    nop

    .line 447
    :pswitch_data_0
    .packed-switch 0xb3
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c(IILv4/d0;Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    iget-object p2, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, Li4/a0;

    .line 4
    .line 5
    iget-object v0, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lb5/c;

    .line 8
    .line 9
    sget-object v1, Lw4/c;->t:Lw4/c;

    .line 10
    .line 11
    invoke-virtual {p2, v0, v1}, Li4/a0;->f(Lb5/c;Lw4/c;)V

    .line 12
    .line 13
    .line 14
    iput-object p4, p2, Li4/a0;->i:Ljava/util/ArrayList;

    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    iput-object p3, p2, Li4/a0;->f:Lv4/a;

    .line 19
    .line 20
    iget-object p3, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p3, Lb5/c;

    .line 23
    .line 24
    const/16 p4, 0xbc

    .line 25
    .line 26
    invoke-virtual {p2, p1, p4, p3}, Li4/a0;->h(IILb5/c;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const-string p1, "cst == null"

    .line 31
    .line 32
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public d(II)V
    .locals 1

    .line 1
    new-instance p2, Li4/b0;

    .line 2
    .line 3
    invoke-static {p1}, La/a;->W0(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "invalid opcode "

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p2, p1, v0}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 15
    .line 16
    .line 17
    throw p2
.end method

.method public e(II)V
    .locals 5

    .line 1
    iget-object v0, p0, Lf1/h;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, [I

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    move v3, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v3, v2

    .line 12
    :goto_0
    if-nez p1, :cond_1

    .line 13
    .line 14
    if-nez v3, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    if-ltz p1, :cond_7

    .line 18
    .line 19
    if-nez v3, :cond_3

    .line 20
    .line 21
    array-length p1, v0

    .line 22
    if-lt p2, p1, :cond_2

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_2
    :goto_1
    return-void

    .line 26
    :cond_3
    :goto_2
    add-int/2addr p2, v1

    .line 27
    new-instance p1, Lu4/q;

    .line 28
    .line 29
    invoke-direct {p1, p2}, Lu4/q;-><init>(I)V

    .line 30
    .line 31
    .line 32
    new-array p2, p2, [I

    .line 33
    .line 34
    const/4 v0, -0x1

    .line 35
    invoke-static {p2, v0}, Ljava/util/Arrays;->fill([II)V

    .line 36
    .line 37
    .line 38
    if-nez v3, :cond_6

    .line 39
    .line 40
    iget-object v0, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lu4/q;

    .line 43
    .line 44
    iget-object v1, v0, Lu4/q;->h:[Lu4/o;

    .line 45
    .line 46
    array-length v1, v1

    .line 47
    move v3, v2

    .line 48
    :goto_3
    if-ge v3, v1, :cond_5

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Lu4/q;->l(I)Lu4/o;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    if-eqz v4, :cond_4

    .line 55
    .line 56
    invoke-virtual {p1, v4}, Lu4/q;->m(Lu4/o;)V

    .line 57
    .line 58
    .line 59
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_5
    iget-object v0, p0, Lf1/h;->k:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, [I

    .line 65
    .line 66
    array-length v1, v0

    .line 67
    invoke-static {v0, v2, p2, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 68
    .line 69
    .line 70
    :cond_6
    iput-object p1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 71
    .line 72
    iput-object p2, p0, Lf1/h;->k:Ljava/lang/Object;

    .line 73
    .line 74
    return-void

    .line 75
    :cond_7
    const-string p1, "shouldn\'t happen"

    .line 76
    .line 77
    invoke-static {p1}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Lf1/h;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public g(IILi4/n;I)V
    .locals 2

    .line 1
    iget-object p2, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, Li4/a0;

    .line 4
    .line 5
    iget-object v0, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lb5/c;

    .line 8
    .line 9
    sget-object v1, Lw4/c;->t:Lw4/c;

    .line 10
    .line 11
    invoke-virtual {p2, v0, v1}, Li4/a0;->f(Lb5/c;Lw4/c;)V

    .line 12
    .line 13
    .line 14
    iput p4, p2, Li4/a0;->e:I

    .line 15
    .line 16
    iput-object p3, p2, Li4/a0;->h:Li4/n;

    .line 17
    .line 18
    iget-object p3, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p3, Lb5/c;

    .line 21
    .line 22
    const/16 p4, 0xab

    .line 23
    .line 24
    invoke-virtual {p2, p1, p4, p3}, Li4/a0;->h(IILb5/c;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public h(IIII)V
    .locals 2

    .line 1
    iget-object p3, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p3, Li4/a0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    packed-switch p1, :pswitch_data_1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, Lf1/h;->d(II)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    throw p1

    .line 16
    :pswitch_0
    iget-object v0, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lb5/c;

    .line 19
    .line 20
    sget-object v1, Lw4/c;->E:Lw4/c;

    .line 21
    .line 22
    invoke-virtual {p3, v0, v1}, Li4/a0;->f(Lb5/c;Lw4/c;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :pswitch_1
    invoke-virtual {p3}, Li4/a0;->b()V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :pswitch_2
    iget-object v0, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lb5/c;

    .line 33
    .line 34
    sget-object v1, Lw4/c;->E:Lw4/c;

    .line 35
    .line 36
    invoke-virtual {p3, v0, v1, v1}, Li4/a0;->g(Lb5/c;Lw4/c;Lw4/c;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :pswitch_3
    iget-object v0, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lb5/c;

    .line 43
    .line 44
    sget-object v1, Lw4/c;->t:Lw4/c;

    .line 45
    .line 46
    invoke-virtual {p3, v0, v1, v1}, Li4/a0;->g(Lb5/c;Lw4/c;Lw4/c;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :pswitch_4
    iget-object v0, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lb5/c;

    .line 53
    .line 54
    sget-object v1, Lw4/c;->t:Lw4/c;

    .line 55
    .line 56
    invoke-virtual {p3, v0, v1}, Li4/a0;->f(Lb5/c;Lw4/c;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    iput p4, p3, Li4/a0;->g:I

    .line 60
    .line 61
    iget-object p4, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p4, Lb5/c;

    .line 64
    .line 65
    invoke-virtual {p3, p2, p1, p4}, Li4/a0;->h(IILb5/c;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_data_0
    .packed-switch 0x99
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
    .end packed-switch

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    :pswitch_data_1
    .packed-switch 0xc6
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public i(IIIILw4/c;I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li4/a0;

    .line 4
    .line 5
    const/16 v1, 0x36

    .line 6
    .line 7
    if-ne p1, v1, :cond_0

    .line 8
    .line 9
    add-int/2addr p3, p2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move p3, p2

    .line 12
    :goto_0
    iget-object v2, p0, Lf1/h;->k:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Li4/c0;

    .line 15
    .line 16
    iget-object v2, v2, Li4/c0;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Li4/r;

    .line 19
    .line 20
    invoke-virtual {v2, p3, p4}, Li4/r;->o(II)Li4/q;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    const/4 v2, 0x0

    .line 25
    if-eqz p3, :cond_1

    .line 26
    .line 27
    iget-object v3, p3, Li4/q;->d:Lv4/c0;

    .line 28
    .line 29
    iget-object v3, v3, Lv4/c0;->g:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v3}, Lw4/c;->m(Ljava/lang/String;)Lw4/c;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v3}, Lw4/c;->f()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    invoke-virtual {p5}, Lw4/c;->f()I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-eq v4, v5, :cond_2

    .line 44
    .line 45
    move-object v3, p5

    .line 46
    move-object p3, v2

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move-object v3, p5

    .line 49
    :cond_2
    :goto_1
    const/16 v4, 0x15

    .line 50
    .line 51
    const/4 v5, 0x1

    .line 52
    const/4 v6, 0x0

    .line 53
    if-eq p1, v4, :cond_a

    .line 54
    .line 55
    if-eq p1, v1, :cond_7

    .line 56
    .line 57
    const/16 v1, 0x84

    .line 58
    .line 59
    if-eq p1, v1, :cond_4

    .line 60
    .line 61
    const/16 p6, 0xa9

    .line 62
    .line 63
    if-ne p1, p6, :cond_3

    .line 64
    .line 65
    goto :goto_4

    .line 66
    :cond_3
    invoke-virtual {p0, p1, p2}, Lf1/h;->d(II)V

    .line 67
    .line 68
    .line 69
    throw v2

    .line 70
    :cond_4
    if-nez p3, :cond_5

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_5
    iget-object v1, p3, Li4/q;->c:Lv4/c0;

    .line 74
    .line 75
    iget-object p3, p3, Li4/q;->e:Lv4/c0;

    .line 76
    .line 77
    if-nez v1, :cond_6

    .line 78
    .line 79
    if-nez p3, :cond_6

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_6
    new-instance v2, Lu4/k;

    .line 83
    .line 84
    invoke-direct {v2, v1, p3}, Lu4/k;-><init>(Lv4/c0;Lv4/c0;)V

    .line 85
    .line 86
    .line 87
    :goto_2
    iget-object p3, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p3, Lb5/c;

    .line 90
    .line 91
    invoke-virtual {v0}, Li4/a0;->b()V

    .line 92
    .line 93
    .line 94
    iget-object v1, v0, Li4/a0;->b:[Lw4/d;

    .line 95
    .line 96
    iget-object p3, p3, Lb5/c;->a:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p3, Li4/s;

    .line 99
    .line 100
    invoke-virtual {p3, p4}, Li4/s;->n(I)Lw4/d;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    aput-object p3, v1, v6

    .line 105
    .line 106
    iput v5, v0, Li4/a0;->c:I

    .line 107
    .line 108
    iput p4, v0, Li4/a0;->j:I

    .line 109
    .line 110
    invoke-static {p4, v3, v2}, Lu4/o;->k(ILw4/d;Lu4/k;)Lu4/o;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    iput-object p3, v0, Li4/a0;->l:Lu4/o;

    .line 115
    .line 116
    iput-object p5, v0, Li4/a0;->d:Lw4/c;

    .line 117
    .line 118
    iput p6, v0, Li4/a0;->e:I

    .line 119
    .line 120
    invoke-static {p6}, Lv4/o;->o(I)Lv4/o;

    .line 121
    .line 122
    .line 123
    move-result-object p3

    .line 124
    iput-object p3, v0, Li4/a0;->f:Lv4/a;

    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_7
    if-nez p3, :cond_8

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_8
    iget-object p6, p3, Li4/q;->c:Lv4/c0;

    .line 131
    .line 132
    iget-object p3, p3, Li4/q;->e:Lv4/c0;

    .line 133
    .line 134
    if-nez p6, :cond_9

    .line 135
    .line 136
    if-nez p3, :cond_9

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_9
    new-instance v2, Lu4/k;

    .line 140
    .line 141
    invoke-direct {v2, p6, p3}, Lu4/k;-><init>(Lv4/c0;Lv4/c0;)V

    .line 142
    .line 143
    .line 144
    :goto_3
    iget-object p3, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p3, Lb5/c;

    .line 147
    .line 148
    invoke-virtual {v0, p3, p5}, Li4/a0;->f(Lb5/c;Lw4/c;)V

    .line 149
    .line 150
    .line 151
    iput-object p5, v0, Li4/a0;->d:Lw4/c;

    .line 152
    .line 153
    invoke-static {p4, v3, v2}, Lu4/o;->k(ILw4/d;Lu4/k;)Lu4/o;

    .line 154
    .line 155
    .line 156
    move-result-object p3

    .line 157
    iput-object p3, v0, Li4/a0;->l:Lu4/o;

    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_a
    :goto_4
    iget-object p6, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast p6, Lb5/c;

    .line 163
    .line 164
    invoke-virtual {v0}, Li4/a0;->b()V

    .line 165
    .line 166
    .line 167
    iget-object v1, v0, Li4/a0;->b:[Lw4/d;

    .line 168
    .line 169
    iget-object p6, p6, Lb5/c;->a:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast p6, Li4/s;

    .line 172
    .line 173
    invoke-virtual {p6, p4}, Li4/s;->n(I)Lw4/d;

    .line 174
    .line 175
    .line 176
    move-result-object p6

    .line 177
    aput-object p6, v1, v6

    .line 178
    .line 179
    iput v5, v0, Li4/a0;->c:I

    .line 180
    .line 181
    iput p4, v0, Li4/a0;->j:I

    .line 182
    .line 183
    if-eqz p3, :cond_b

    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_b
    move v5, v6

    .line 187
    :goto_5
    iput-boolean v5, v0, Li4/a0;->k:Z

    .line 188
    .line 189
    iput-object p5, v0, Li4/a0;->d:Lw4/c;

    .line 190
    .line 191
    :goto_6
    iget-object p3, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast p3, Lb5/c;

    .line 194
    .line 195
    invoke-virtual {v0, p2, p1, p3}, Li4/a0;->h(IILb5/c;)V

    .line 196
    .line 197
    .line 198
    return-void
.end method

.method public j(IILu4/o;)V
    .locals 3

    .line 1
    iget v0, p3, Lu4/o;->g:I

    .line 2
    .line 3
    iget-object v1, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    new-instance v2, Lp4/n;

    .line 8
    .line 9
    invoke-direct {v2, p1, p2, p3}, Lp4/n;-><init>(IILu4/o;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Lu4/q;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    if-ne p2, v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1, p3}, Lu4/q;->m(Lu4/o;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lf1/h;->k:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, [I

    .line 28
    .line 29
    const/4 p2, -0x1

    .line 30
    aput p2, p1, v0

    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    invoke-virtual {p1, p3}, Lu4/q;->n(Lu4/o;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lf1/h;->k:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, [I

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    sub-int/2addr p2, v2

    .line 45
    aput p2, p1, v0

    .line 46
    .line 47
    return-void
.end method

.method public k(IILu4/o;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq p2, v1, :cond_c

    .line 7
    .line 8
    iget v1, p3, Lu4/o;->g:I

    .line 9
    .line 10
    iget-object v2, p0, Lf1/h;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, [I

    .line 13
    .line 14
    aget v1, v2, v1

    .line 15
    .line 16
    if-ltz v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lp4/n;

    .line 23
    .line 24
    iget v3, v2, Lp4/n;->g:I

    .line 25
    .line 26
    iget-object v4, v2, Lp4/n;->i:Lu4/o;

    .line 27
    .line 28
    if-ne v3, p1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v4, p3}, Lu4/o;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    iget p1, v2, Lp4/n;->h:I

    .line 37
    .line 38
    if-ne p2, p1, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p1, Lp4/n;

    .line 42
    .line 43
    iget v2, v2, Lp4/n;->g:I

    .line 44
    .line 45
    invoke-direct {p1, v2, p2, v4}, Lp4/n;-><init>(IILu4/o;)V

    .line 46
    .line 47
    .line 48
    move-object v2, p1

    .line 49
    :goto_0
    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Lu4/q;

    .line 55
    .line 56
    invoke-virtual {p1, p3}, Lu4/q;->n(Lu4/o;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    iget v0, p3, Lu4/o;->g:I

    .line 61
    .line 62
    invoke-static {p3}, Lf1/h;->n(Lu4/o;)Lu4/o;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    invoke-virtual {p0, p1, v0}, Lf1/h;->e(II)V

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Lf1/h;->k:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, [I

    .line 72
    .line 73
    aget v0, v1, v0

    .line 74
    .line 75
    if-ltz v0, :cond_2

    .line 76
    .line 77
    goto/16 :goto_7

    .line 78
    .line 79
    :cond_2
    iget-object v0, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    const/4 v2, 0x1

    .line 88
    sub-int/2addr v1, v2

    .line 89
    :goto_1
    if-ltz v1, :cond_6

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    check-cast v3, Lp4/n;

    .line 96
    .line 97
    if-nez v3, :cond_3

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_3
    iget v4, v3, Lp4/n;->g:I

    .line 101
    .line 102
    if-eq v4, p1, :cond_4

    .line 103
    .line 104
    invoke-virtual {p0, p1, p2, p3}, Lf1/h;->j(IILu4/o;)V

    .line 105
    .line 106
    .line 107
    goto :goto_7

    .line 108
    :cond_4
    iget-object v3, v3, Lp4/n;->i:Lu4/o;

    .line 109
    .line 110
    invoke-virtual {v3, p3}, Lu4/o;->i(Lu4/o;)Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_5

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_5
    :goto_2
    add-int/lit8 v1, v1, -0x1

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_6
    :goto_3
    iget-object p2, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast p2, Lu4/q;

    .line 123
    .line 124
    invoke-virtual {p2, p3}, Lu4/q;->n(Lu4/o;)V

    .line 125
    .line 126
    .line 127
    const/4 p2, 0x0

    .line 128
    invoke-virtual {v0, v1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    iget v3, p0, Lf1/h;->h:I

    .line 132
    .line 133
    add-int/2addr v3, v2

    .line 134
    iput v3, p0, Lf1/h;->h:I

    .line 135
    .line 136
    iget p3, p3, Lu4/o;->g:I

    .line 137
    .line 138
    :cond_7
    :goto_4
    add-int/lit8 v1, v1, -0x1

    .line 139
    .line 140
    if-ltz v1, :cond_9

    .line 141
    .line 142
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    check-cast p2, Lp4/n;

    .line 147
    .line 148
    if-nez p2, :cond_8

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_8
    iget-object v3, p2, Lp4/n;->i:Lu4/o;

    .line 152
    .line 153
    iget v3, v3, Lu4/o;->g:I

    .line 154
    .line 155
    if-ne v3, p3, :cond_7

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_9
    const/4 v2, 0x0

    .line 159
    :goto_5
    if-eqz v2, :cond_b

    .line 160
    .line 161
    iget-object v2, p0, Lf1/h;->k:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v2, [I

    .line 164
    .line 165
    aput v1, v2, p3

    .line 166
    .line 167
    iget p3, p2, Lp4/n;->g:I

    .line 168
    .line 169
    if-ne p3, p1, :cond_b

    .line 170
    .line 171
    iget p1, p2, Lp4/n;->h:I

    .line 172
    .line 173
    const/4 v2, 0x2

    .line 174
    if-ne v2, p1, :cond_a

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_a
    new-instance p1, Lp4/n;

    .line 178
    .line 179
    iget-object p2, p2, Lp4/n;->i:Lu4/o;

    .line 180
    .line 181
    invoke-direct {p1, p3, v2, p2}, Lp4/n;-><init>(IILu4/o;)V

    .line 182
    .line 183
    .line 184
    move-object p2, p1

    .line 185
    :goto_6
    invoke-virtual {v0, v1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    :cond_b
    :goto_7
    return-void

    .line 189
    :cond_c
    const-string p1, "shouldn\'t happen"

    .line 190
    .line 191
    invoke-static {p1}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    return-void
.end method

.method public l(Lw4/c;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li4/a0;

    .line 4
    .line 5
    iget-object v0, v0, Li4/a0;->a:Lw4/a;

    .line 6
    .line 7
    iget-object v0, v0, Lw4/a;->h:Lw4/c;

    .line 8
    .line 9
    invoke-static {v0, p1}, Lx6/d;->I(Lw4/d;Lw4/d;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object v1, p0, Lf1/h;->k:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Li4/c0;

    .line 19
    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v3, "return type mismatch: prototype indicates "

    .line 23
    .line 24
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lw4/c;->a()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v0, ", but encountered type "

    .line 35
    .line 36
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lw4/c;->a()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {v1, p1}, Li4/c0;->g(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    throw p1
.end method

.method public m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    if-ne p1, p2, :cond_0

    .line 2
    .line 3
    return-object p1

    .line 4
    :cond_0
    if-nez p1, :cond_1

    .line 5
    .line 6
    return-object p2

    .line 7
    :cond_1
    if-nez p2, :cond_2

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-class v1, Lz7/o;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    if-ne v0, v1, :cond_3

    .line 19
    .line 20
    move v0, v3

    .line 21
    goto :goto_0

    .line 22
    :cond_3
    move v0, v2

    .line 23
    :goto_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    if-ne v4, v1, :cond_4

    .line 28
    .line 29
    move v1, v3

    .line 30
    goto :goto_1

    .line 31
    :cond_4
    move v1, v2

    .line 32
    :goto_1
    if-nez v0, :cond_5

    .line 33
    .line 34
    if-nez v1, :cond_5

    .line 35
    .line 36
    new-instance v0, Lz7/o;

    .line 37
    .line 38
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {v0, p1}, Lz7/c;-><init>([Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0}, Lf1/h;->E(Lz7/o;)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_5
    if-eqz v0, :cond_7

    .line 50
    .line 51
    if-nez v1, :cond_7

    .line 52
    .line 53
    check-cast p1, Lz7/o;

    .line 54
    .line 55
    invoke-virtual {p1, p2}, Lz7/c;->c(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_6

    .line 60
    .line 61
    invoke-virtual {p1, p2}, Lz7/c;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lf1/h;->E(Lz7/o;)V

    .line 65
    .line 66
    .line 67
    :cond_6
    return-object p1

    .line 68
    :cond_7
    if-nez v0, :cond_9

    .line 69
    .line 70
    check-cast p2, Lz7/o;

    .line 71
    .line 72
    invoke-virtual {p2, p1}, Lz7/c;->c(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_8

    .line 77
    .line 78
    invoke-virtual {p2, p1}, Lz7/c;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, p2}, Lf1/h;->E(Lz7/o;)V

    .line 82
    .line 83
    .line 84
    :cond_8
    return-object p2

    .line 85
    :cond_9
    check-cast p1, Lz7/o;

    .line 86
    .line 87
    check-cast p2, Lz7/o;

    .line 88
    .line 89
    invoke-virtual {p2}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    :cond_a
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_b

    .line 98
    .line 99
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {p1, v0}, Lz7/c;->c(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-nez v1, :cond_a

    .line 108
    .line 109
    invoke-virtual {p1, v0}, Lz7/c;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move v2, v3

    .line 113
    goto :goto_2

    .line 114
    :cond_b
    if-eqz v2, :cond_c

    .line 115
    .line 116
    invoke-virtual {p0, p1}, Lf1/h;->E(Lz7/o;)V

    .line 117
    .line 118
    .line 119
    :cond_c
    return-object p1
.end method

.method public o(Ljava/lang/String;)Ljava/util/Iterator;
    .locals 3

    .line 1
    iget-object v0, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    :try_start_0
    sget-object p1, Lz7/h;->g:Lz7/h;

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-object p1

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/util/HashMap;

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    sget-object p1, Lz7/h;->g:Lz7/h;

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object p1

    .line 22
    :cond_1
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-nez p1, :cond_2

    .line 27
    .line 28
    sget-object p1, Lz7/h;->g:Lz7/h;

    .line 29
    .line 30
    monitor-exit v0

    .line 31
    return-object p1

    .line 32
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-class v2, Lz7/o;

    .line 37
    .line 38
    if-ne v1, v2, :cond_3

    .line 39
    .line 40
    check-cast p1, Lz7/o;

    .line 41
    .line 42
    invoke-virtual {p1}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    monitor-exit v0

    .line 47
    return-object p1

    .line 48
    :cond_3
    invoke-static {p1}, Lz7/q;->a(Ljava/lang/Object;)Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    monitor-exit v0

    .line 53
    return-object p1

    .line 54
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    throw p1
.end method

.method public p()I
    .locals 3

    .line 1
    iget-object v0, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeCap()Landroid/graphics/Paint$Cap;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v1, Lf1/i;->a:[I

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    aget v0, v1, v0

    .line 20
    .line 21
    :goto_0
    const/4 v1, 0x1

    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    if-eq v0, v2, :cond_2

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    return v2

    .line 32
    :cond_2
    return v1

    .line 33
    :cond_3
    :goto_1
    const/4 v0, 0x0

    .line 34
    return v0
.end method

.method public q()I
    .locals 3

    .line 1
    iget-object v0, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeJoin()Landroid/graphics/Paint$Join;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v1, Lf1/i;->b:[I

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    aget v0, v1, v0

    .line 20
    .line 21
    :goto_0
    const/4 v1, 0x1

    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    if-eq v0, v2, :cond_2

    .line 26
    .line 27
    const/4 v2, 0x3

    .line 28
    if-eq v0, v2, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    return v1

    .line 32
    :cond_2
    return v2

    .line 33
    :cond_3
    :goto_1
    const/4 v0, 0x0

    .line 34
    return v0
.end method

.method public r(ILjava/util/BitSet;)Lv4/a;
    .locals 11

    .line 1
    const-string v0, " at offset "

    .line 2
    .line 3
    const-string v1, "...while parsing cst "

    .line 4
    .line 5
    iget-object v2, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lg8/b;

    .line 8
    .line 9
    const-string v3, "Unsupported ref constant type for MethodHandle "

    .line 10
    .line 11
    const-string v4, "Unsupported MethodHandle kind: "

    .line 12
    .line 13
    const-string v5, "unknown tag byte: "

    .line 14
    .line 15
    iget-object v6, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v6, Lv4/e0;

    .line 18
    .line 19
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v7, v6, Lv4/e0;->h:[Lv4/a;

    .line 23
    .line 24
    const/4 v8, 0x0

    .line 25
    :try_start_0
    aget-object v9, v7, p1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_2

    .line 26
    .line 27
    if-eqz v9, :cond_0

    .line 28
    .line 29
    return-object v9

    .line 30
    :cond_0
    iget-object v9, p0, Lf1/h;->k:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v9, [I

    .line 33
    .line 34
    aget v9, v9, p1

    .line 35
    .line 36
    :try_start_1
    invoke-virtual {v2, v9}, Lg8/b;->e(I)I

    .line 37
    .line 38
    .line 39
    move-result v10

    .line 40
    packed-switch v10, :pswitch_data_0

    .line 41
    .line 42
    .line 43
    :pswitch_0
    new-instance p2, Ll4/c;

    .line 44
    .line 45
    invoke-static {v10}, La/a;->W0(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v5, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-direct {p2, v2, v8}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 54
    .line 55
    .line 56
    throw p2

    .line 57
    :catch_0
    move-exception p2

    .line 58
    goto/16 :goto_7

    .line 59
    .line 60
    :catch_1
    move-exception p2

    .line 61
    goto/16 :goto_8

    .line 62
    .line 63
    :pswitch_1
    add-int/lit8 v3, v9, 0x1

    .line 64
    .line 65
    invoke-virtual {v2, v3}, Lg8/b;->g(I)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    add-int/lit8 v4, v9, 0x3

    .line 70
    .line 71
    invoke-virtual {v2, v4}, Lg8/b;->g(I)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    invoke-virtual {p0, v2, p2}, Lf1/h;->r(ILjava/util/BitSet;)Lv4/a;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    check-cast p2, Lv4/z;

    .line 80
    .line 81
    new-instance v2, Lv4/q;

    .line 82
    .line 83
    invoke-direct {v2, v3, p2}, Lv4/q;-><init>(ILv4/z;)V

    .line 84
    .line 85
    .line 86
    goto/16 :goto_3

    .line 87
    .line 88
    :pswitch_2
    add-int/lit8 v3, v9, 0x1

    .line 89
    .line 90
    invoke-virtual {v2, v3}, Lg8/b;->g(I)I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    invoke-virtual {p0, v2, p2}, Lf1/h;->r(ILjava/util/BitSet;)Lv4/a;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    check-cast p2, Lv4/c0;

    .line 99
    .line 100
    iget-object p2, p2, Lv4/c0;->g:Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {p2}, Lw4/a;->b(Ljava/lang/String;)Lw4/a;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    new-instance v2, Lv4/a0;

    .line 107
    .line 108
    invoke-direct {v2, p2}, Lv4/a0;-><init>(Lw4/a;)V

    .line 109
    .line 110
    .line 111
    goto/16 :goto_3

    .line 112
    .line 113
    :pswitch_3
    add-int/lit8 v5, v9, 0x1

    .line 114
    .line 115
    invoke-virtual {v2, v5}, Lg8/b;->e(I)I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    add-int/lit8 v10, v9, 0x2

    .line 120
    .line 121
    invoke-virtual {v2, v10}, Lg8/b;->g(I)I

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    packed-switch v5, :pswitch_data_1

    .line 126
    .line 127
    .line 128
    new-instance p2, Ll4/c;

    .line 129
    .line 130
    new-instance v2, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-direct {p2, v2, v8}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 143
    .line 144
    .line 145
    throw p2

    .line 146
    :pswitch_4
    invoke-virtual {p0, v2, p2}, Lf1/h;->r(ILjava/util/BitSet;)Lv4/a;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    check-cast p2, Lv4/p;

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :pswitch_5
    invoke-virtual {p0, v2, p2}, Lf1/h;->r(ILjava/util/BitSet;)Lv4/a;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    instance-of v2, p2, Lv4/y;

    .line 158
    .line 159
    if-nez v2, :cond_2

    .line 160
    .line 161
    instance-of v2, p2, Lv4/p;

    .line 162
    .line 163
    if-eqz v2, :cond_1

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_1
    new-instance v2, Ll4/c;

    .line 167
    .line 168
    new-instance v4, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    invoke-direct {v2, p2, v8}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 185
    .line 186
    .line 187
    throw v2

    .line 188
    :pswitch_6
    invoke-virtual {p0, v2, p2}, Lf1/h;->r(ILjava/util/BitSet;)Lv4/a;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    check-cast p2, Lv4/y;

    .line 193
    .line 194
    goto :goto_0

    .line 195
    :pswitch_7
    invoke-virtual {p0, v2, p2}, Lf1/h;->r(ILjava/util/BitSet;)Lv4/a;

    .line 196
    .line 197
    .line 198
    move-result-object p2

    .line 199
    check-cast p2, Lv4/m;

    .line 200
    .line 201
    :cond_2
    :goto_0
    packed-switch v5, :pswitch_data_2

    .line 202
    .line 203
    .line 204
    const-string v2, "invalid kind: "

    .line 205
    .line 206
    invoke-static {v5, v2}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    invoke-static {v2}, Lj8/o;->t(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    :pswitch_8
    const/4 v2, 0x0

    .line 214
    goto :goto_1

    .line 215
    :pswitch_9
    const/16 v2, 0x8

    .line 216
    .line 217
    goto :goto_1

    .line 218
    :pswitch_a
    const/4 v2, 0x6

    .line 219
    goto :goto_1

    .line 220
    :pswitch_b
    const/4 v2, 0x7

    .line 221
    goto :goto_1

    .line 222
    :pswitch_c
    const/4 v2, 0x4

    .line 223
    goto :goto_1

    .line 224
    :pswitch_d
    const/4 v2, 0x5

    .line 225
    goto :goto_1

    .line 226
    :pswitch_e
    const/4 v2, 0x2

    .line 227
    goto :goto_1

    .line 228
    :pswitch_f
    const/4 v2, 0x1

    .line 229
    goto :goto_1

    .line 230
    :pswitch_10
    const/4 v2, 0x3

    .line 231
    :goto_1
    invoke-static {v2, p2}, Lv4/x;->l(ILv4/a;)Lv4/x;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    goto/16 :goto_3

    .line 236
    .line 237
    :pswitch_11
    add-int/lit8 v3, v9, 0x1

    .line 238
    .line 239
    invoke-virtual {v2, v3}, Lg8/b;->g(I)I

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    invoke-virtual {p0, v3, p2}, Lf1/h;->r(ILjava/util/BitSet;)Lv4/a;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    check-cast v3, Lv4/c0;

    .line 248
    .line 249
    add-int/lit8 v4, v9, 0x3

    .line 250
    .line 251
    invoke-virtual {v2, v4}, Lg8/b;->g(I)I

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    invoke-virtual {p0, v2, p2}, Lf1/h;->r(ILjava/util/BitSet;)Lv4/a;

    .line 256
    .line 257
    .line 258
    move-result-object p2

    .line 259
    check-cast p2, Lv4/c0;

    .line 260
    .line 261
    new-instance v2, Lv4/z;

    .line 262
    .line 263
    invoke-direct {v2, v3, p2}, Lv4/z;-><init>(Lv4/c0;Lv4/c0;)V

    .line 264
    .line 265
    .line 266
    goto/16 :goto_3

    .line 267
    .line 268
    :pswitch_12
    add-int/lit8 v3, v9, 0x1

    .line 269
    .line 270
    invoke-virtual {v2, v3}, Lg8/b;->g(I)I

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    invoke-virtual {p0, v3, p2}, Lf1/h;->r(ILjava/util/BitSet;)Lv4/a;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    check-cast v3, Lv4/d0;

    .line 279
    .line 280
    add-int/lit8 v4, v9, 0x3

    .line 281
    .line 282
    invoke-virtual {v2, v4}, Lg8/b;->g(I)I

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    invoke-virtual {p0, v2, p2}, Lf1/h;->r(ILjava/util/BitSet;)Lv4/a;

    .line 287
    .line 288
    .line 289
    move-result-object p2

    .line 290
    check-cast p2, Lv4/z;

    .line 291
    .line 292
    new-instance v2, Lv4/p;

    .line 293
    .line 294
    invoke-direct {v2, v3, p2}, Lv4/e;-><init>(Lv4/d0;Lv4/z;)V

    .line 295
    .line 296
    .line 297
    iput-object v8, v2, Lv4/p;->k:Lv4/y;

    .line 298
    .line 299
    goto/16 :goto_3

    .line 300
    .line 301
    :pswitch_13
    add-int/lit8 v3, v9, 0x1

    .line 302
    .line 303
    invoke-virtual {v2, v3}, Lg8/b;->g(I)I

    .line 304
    .line 305
    .line 306
    move-result v3

    .line 307
    invoke-virtual {p0, v3, p2}, Lf1/h;->r(ILjava/util/BitSet;)Lv4/a;

    .line 308
    .line 309
    .line 310
    move-result-object v3

    .line 311
    check-cast v3, Lv4/d0;

    .line 312
    .line 313
    add-int/lit8 v4, v9, 0x3

    .line 314
    .line 315
    invoke-virtual {v2, v4}, Lg8/b;->g(I)I

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    invoke-virtual {p0, v2, p2}, Lf1/h;->r(ILjava/util/BitSet;)Lv4/a;

    .line 320
    .line 321
    .line 322
    move-result-object p2

    .line 323
    check-cast p2, Lv4/z;

    .line 324
    .line 325
    new-instance v2, Lv4/y;

    .line 326
    .line 327
    invoke-direct {v2, v3, p2}, Lv4/e;-><init>(Lv4/d0;Lv4/z;)V

    .line 328
    .line 329
    .line 330
    goto/16 :goto_3

    .line 331
    .line 332
    :pswitch_14
    add-int/lit8 v3, v9, 0x1

    .line 333
    .line 334
    invoke-virtual {v2, v3}, Lg8/b;->g(I)I

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    invoke-virtual {p0, v3, p2}, Lf1/h;->r(ILjava/util/BitSet;)Lv4/a;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    check-cast v3, Lv4/d0;

    .line 343
    .line 344
    add-int/lit8 v4, v9, 0x3

    .line 345
    .line 346
    invoke-virtual {v2, v4}, Lg8/b;->g(I)I

    .line 347
    .line 348
    .line 349
    move-result v2

    .line 350
    invoke-virtual {p0, v2, p2}, Lf1/h;->r(ILjava/util/BitSet;)Lv4/a;

    .line 351
    .line 352
    .line 353
    move-result-object p2

    .line 354
    check-cast p2, Lv4/z;

    .line 355
    .line 356
    new-instance v2, Lv4/m;

    .line 357
    .line 358
    invoke-direct {v2, v3, p2}, Lv4/w;-><init>(Lv4/d0;Lv4/z;)V

    .line 359
    .line 360
    .line 361
    goto :goto_3

    .line 362
    :pswitch_15
    add-int/lit8 v3, v9, 0x1

    .line 363
    .line 364
    invoke-virtual {v2, v3}, Lg8/b;->g(I)I

    .line 365
    .line 366
    .line 367
    move-result v2

    .line 368
    invoke-virtual {p0, v2, p2}, Lf1/h;->r(ILjava/util/BitSet;)Lv4/a;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    goto :goto_3

    .line 373
    :pswitch_16
    add-int/lit8 v3, v9, 0x1

    .line 374
    .line 375
    invoke-virtual {v2, v3}, Lg8/b;->g(I)I

    .line 376
    .line 377
    .line 378
    move-result v2

    .line 379
    invoke-virtual {p0, v2, p2}, Lf1/h;->r(ILjava/util/BitSet;)Lv4/a;

    .line 380
    .line 381
    .line 382
    move-result-object p2

    .line 383
    check-cast p2, Lv4/c0;

    .line 384
    .line 385
    new-instance v2, Lv4/d0;

    .line 386
    .line 387
    iget-object p2, p2, Lv4/c0;->g:Ljava/lang/String;

    .line 388
    .line 389
    invoke-static {p2}, Lw4/c;->n(Ljava/lang/String;)Lw4/c;

    .line 390
    .line 391
    .line 392
    move-result-object p2

    .line 393
    invoke-direct {v2, p2}, Lv4/d0;-><init>(Lw4/c;)V

    .line 394
    .line 395
    .line 396
    goto :goto_3

    .line 397
    :pswitch_17
    add-int/lit8 p2, v9, 0x1

    .line 398
    .line 399
    invoke-virtual {v2, p2}, Lg8/b;->c(I)J

    .line 400
    .line 401
    .line 402
    move-result-wide v2

    .line 403
    new-instance p2, Lv4/k;

    .line 404
    .line 405
    invoke-direct {p2, v2, v3}, Lv4/t;-><init>(J)V

    .line 406
    .line 407
    .line 408
    :goto_2
    move-object v2, p2

    .line 409
    goto :goto_3

    .line 410
    :pswitch_18
    add-int/lit8 p2, v9, 0x1

    .line 411
    .line 412
    invoke-virtual {v2, p2}, Lg8/b;->c(I)J

    .line 413
    .line 414
    .line 415
    move-result-wide v2

    .line 416
    new-instance p2, Lv4/v;

    .line 417
    .line 418
    invoke-direct {p2, v2, v3}, Lv4/t;-><init>(J)V

    .line 419
    .line 420
    .line 421
    goto :goto_2

    .line 422
    :pswitch_19
    add-int/lit8 p2, v9, 0x1

    .line 423
    .line 424
    invoke-virtual {v2, p2}, Lg8/b;->b(I)I

    .line 425
    .line 426
    .line 427
    move-result p2

    .line 428
    new-instance v2, Lv4/n;

    .line 429
    .line 430
    invoke-direct {v2, p2}, Lv4/s;-><init>(I)V

    .line 431
    .line 432
    .line 433
    goto :goto_3

    .line 434
    :pswitch_1a
    add-int/lit8 p2, v9, 0x1

    .line 435
    .line 436
    invoke-virtual {v2, p2}, Lg8/b;->b(I)I

    .line 437
    .line 438
    .line 439
    move-result p2

    .line 440
    invoke-static {p2}, Lv4/o;->o(I)Lv4/o;

    .line 441
    .line 442
    .line 443
    move-result-object v2

    .line 444
    goto :goto_3

    .line 445
    :pswitch_1b
    invoke-virtual {p0, v9}, Lf1/h;->t(I)Lv4/c0;

    .line 446
    .line 447
    .line 448
    move-result-object v2

    .line 449
    invoke-virtual {p2, p1}, Ljava/util/BitSet;->set(I)V
    :try_end_1
    .catch Ll4/c; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 450
    .line 451
    .line 452
    :goto_3
    invoke-virtual {v6}, Lz4/j;->j()V

    .line 453
    .line 454
    .line 455
    const/4 p2, 0x1

    .line 456
    if-eqz v2, :cond_3

    .line 457
    .line 458
    invoke-virtual {v2}, Lv4/a;->i()Z

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    if-eqz v0, :cond_3

    .line 463
    .line 464
    move v0, p2

    .line 465
    goto :goto_4

    .line 466
    :cond_3
    const/4 v0, 0x0

    .line 467
    :goto_4
    if-lt p1, p2, :cond_7

    .line 468
    .line 469
    if-eqz v0, :cond_5

    .line 470
    .line 471
    array-length v0, v7

    .line 472
    sub-int/2addr v0, p2

    .line 473
    if-eq p1, v0, :cond_4

    .line 474
    .line 475
    add-int/lit8 p2, p1, 0x1

    .line 476
    .line 477
    aput-object v8, v7, p2

    .line 478
    .line 479
    goto :goto_6

    .line 480
    :cond_4
    const-string p1, "(n == size - 1) && cst.isCategory2()"

    .line 481
    .line 482
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    :goto_5
    const/4 p1, 0x0

    .line 486
    return-object p1

    .line 487
    :cond_5
    :goto_6
    if-eqz v2, :cond_6

    .line 488
    .line 489
    aget-object p2, v7, p1

    .line 490
    .line 491
    if-nez p2, :cond_6

    .line 492
    .line 493
    add-int/lit8 p2, p1, -0x1

    .line 494
    .line 495
    aget-object v0, v7, p2

    .line 496
    .line 497
    if-eqz v0, :cond_6

    .line 498
    .line 499
    invoke-virtual {v0}, Lv4/a;->i()Z

    .line 500
    .line 501
    .line 502
    move-result v0

    .line 503
    if-eqz v0, :cond_6

    .line 504
    .line 505
    aput-object v8, v7, p2

    .line 506
    .line 507
    :cond_6
    aput-object v2, v7, p1

    .line 508
    .line 509
    return-object v2

    .line 510
    :cond_7
    const-string p1, "n < 1"

    .line 511
    .line 512
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    goto :goto_5

    .line 516
    :goto_7
    new-instance v2, Ll4/c;

    .line 517
    .line 518
    invoke-direct {v2, v8, p2}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 519
    .line 520
    .line 521
    new-instance p2, Ljava/lang/StringBuilder;

    .line 522
    .line 523
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    invoke-static {p1}, La/a;->X0(I)Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object p1

    .line 530
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 534
    .line 535
    .line 536
    invoke-static {v9}, La/a;->Y0(I)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object p1

    .line 540
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 541
    .line 542
    .line 543
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object p1

    .line 547
    invoke-virtual {v2, p1}, Lf4/a;->a(Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    throw v2

    .line 551
    :goto_8
    new-instance v2, Ljava/lang/StringBuilder;

    .line 552
    .line 553
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    invoke-static {p1}, La/a;->X0(I)Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object p1

    .line 560
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 561
    .line 562
    .line 563
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 564
    .line 565
    .line 566
    invoke-static {v9}, La/a;->Y0(I)Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object p1

    .line 570
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object p1

    .line 577
    invoke-virtual {p2, p1}, Lf4/a;->a(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    throw p2

    .line 581
    :catch_2
    new-instance p2, Lf4/a;

    .line 582
    .line 583
    invoke-static {p1}, La/a;->X0(I)Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object p1

    .line 587
    const-string v0, "invalid constant pool index "

    .line 588
    .line 589
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object p1

    .line 593
    invoke-direct {p2, p1, v8}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 594
    .line 595
    .line 596
    throw p2

    .line 597
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1b
        :pswitch_0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
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
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_6
        :pswitch_4
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
    .line 658
    .line 659
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_8
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch
.end method

.method public s()V
    .locals 7

    .line 1
    iget v0, p0, Lf1/h;->h:I

    .line 2
    .line 3
    if-gez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lf1/h;->k:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, [I

    .line 8
    .line 9
    iget-object v1, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lg8/b;

    .line 12
    .line 13
    const/16 v2, 0xa

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    move v4, v3

    .line 17
    :goto_0
    array-length v5, v0

    .line 18
    const/4 v6, 0x0

    .line 19
    if-ge v4, v5, :cond_0

    .line 20
    .line 21
    aput v2, v0, v4

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lg8/b;->e(I)I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    packed-switch v5, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    :pswitch_0
    :try_start_0
    new-instance v0, Ll4/c;

    .line 31
    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v3, "unknown tag byte: "

    .line 38
    .line 39
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-static {v5}, La/a;->W0(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-direct {v0, v1, v6}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 54
    .line 55
    .line 56
    throw v0

    .line 57
    :catch_0
    move-exception v0

    .line 58
    goto :goto_3

    .line 59
    :pswitch_1
    add-int/lit8 v2, v2, 0x5

    .line 60
    .line 61
    :goto_1
    move v5, v3

    .line 62
    goto :goto_2

    .line 63
    :pswitch_2
    add-int/lit8 v2, v2, 0x3

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :pswitch_3
    add-int/lit8 v2, v2, 0x4

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :pswitch_4
    add-int/lit8 v2, v2, 0x9

    .line 70
    .line 71
    const/4 v5, 0x2

    .line 72
    goto :goto_2

    .line 73
    :pswitch_5
    add-int/lit8 v5, v2, 0x1

    .line 74
    .line 75
    invoke-virtual {v1, v5}, Lg8/b;->g(I)I

    .line 76
    .line 77
    .line 78
    move-result v5
    :try_end_0
    .catch Ll4/c; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    add-int/lit8 v5, v5, 0x3

    .line 80
    .line 81
    add-int/2addr v5, v2

    .line 82
    move v2, v5

    .line 83
    goto :goto_1

    .line 84
    :goto_2
    add-int/2addr v4, v5

    .line 85
    goto :goto_0

    .line 86
    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    const-string v3, "...while preparsing cst "

    .line 89
    .line 90
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v4}, La/a;->X0(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v3, " at offset "

    .line 101
    .line 102
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-static {v2}, La/a;->Y0(I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v0, v1}, Lf4/a;->a(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v0

    .line 120
    :cond_0
    iput v2, p0, Lf1/h;->h:I

    .line 121
    .line 122
    new-instance v1, Ljava/util/BitSet;

    .line 123
    .line 124
    array-length v2, v0

    .line 125
    invoke-direct {v1, v2}, Ljava/util/BitSet;-><init>(I)V

    .line 126
    .line 127
    .line 128
    :goto_4
    array-length v2, v0

    .line 129
    if-ge v3, v2, :cond_2

    .line 130
    .line 131
    aget v2, v0, v3

    .line 132
    .line 133
    if-eqz v2, :cond_1

    .line 134
    .line 135
    iget-object v2, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v2, Lv4/e0;

    .line 138
    .line 139
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    :try_start_1
    iget-object v2, v2, Lv4/e0;->h:[Lv4/a;

    .line 143
    .line 144
    aget-object v2, v2, v3
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    .line 145
    .line 146
    if-nez v2, :cond_1

    .line 147
    .line 148
    invoke-virtual {p0, v3, v1}, Lf1/h;->r(ILjava/util/BitSet;)Lv4/a;

    .line 149
    .line 150
    .line 151
    goto :goto_5

    .line 152
    :catch_1
    new-instance v0, Lf4/a;

    .line 153
    .line 154
    invoke-static {v3}, La/a;->X0(I)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    const-string v2, "invalid constant pool index "

    .line 159
    .line 160
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-direct {v0, v1, v6}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 165
    .line 166
    .line 167
    throw v0

    .line 168
    :cond_1
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_2
    return-void

    .line 172
    nop

    .line 173
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public t(I)Lv4/c0;
    .locals 2

    .line 1
    iget-object v0, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg8/b;

    .line 4
    .line 5
    add-int/lit8 v1, p1, 0x1

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lg8/b;->g(I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/lit8 p1, p1, 0x3

    .line 12
    .line 13
    add-int/2addr v1, p1

    .line 14
    invoke-virtual {v0, p1, v1}, Lg8/b;->n(II)Lg8/b;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :try_start_0
    new-instance v0, Lv4/c0;

    .line 19
    .line 20
    invoke-direct {v0, p1}, Lv4/c0;-><init>(Lg8/b;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :catch_0
    move-exception p1

    .line 25
    new-instance v0, Ll4/c;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-direct {v0, v1, p1}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 29
    .line 30
    .line 31
    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lf1/h;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "size = "

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 19
    .line 20
    monitor-enter v1

    .line 21
    :try_start_0
    iget-object v2, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Ljava/util/HashMap;

    .line 24
    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    monitor-exit v1

    .line 28
    const/4 v1, 0x0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    move v1, v2

    .line 38
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    throw v0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public u(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Paint;

    .line 4
    .line 5
    const/high16 v1, 0x437f0000    # 255.0f

    .line 6
    .line 7
    mul-float/2addr p1, v1

    .line 8
    float-to-double v1, p1

    .line 9
    invoke-static {v1, v2}, Ljava/lang/Math;->rint(D)D

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    double-to-float p1, v1

    .line 14
    float-to-int p1, p1

    .line 15
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public v(I)V
    .locals 3

    .line 1
    iget v0, p0, Lf1/h;->h:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput p1, p0, Lf1/h;->h:I

    .line 7
    .line 8
    iget-object v0, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/graphics/Paint;

    .line 11
    .line 12
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v2, 0x1d

    .line 15
    .line 16
    if-lt v1, v2, :cond_1

    .line 17
    .line 18
    invoke-static {p1}, Lf1/c0;->s(I)Landroid/graphics/BlendMode;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {v0, p1}, Lf1/a;->l(Landroid/graphics/Paint;Landroid/graphics/BlendMode;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    .line 27
    .line 28
    invoke-static {p1}, Lf1/c0;->z(I)Landroid/graphics/PorterDuff$Mode;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {v1, p1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public w(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-static {p1, p2}, Lf1/c0;->w(J)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public x(Lf1/n;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lf1/h;->k:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v0, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/graphics/Paint;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p1, Lf1/n;->a:Landroid/graphics/ColorFilter;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public y(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Paint;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    move p1, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    :goto_0
    xor-int/2addr p1, v1

    .line 12
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public z(Landroid/graphics/Shader;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lf1/h;->j:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v0, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/graphics/Paint;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 8
    .line 9
    .line 10
    return-void
.end method
