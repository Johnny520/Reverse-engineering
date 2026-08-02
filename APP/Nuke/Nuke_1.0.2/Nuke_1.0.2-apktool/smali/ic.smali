.class public abstract Lic;
.super Landroid/view/ViewGroup;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Luw;
.implements Law1;
.implements Lgt1;


# instance fields
.field public A:Lin0;

.field public final B:[I

.field public C:I

.field public D:I

.field public final E:Lj51;

.field public F:Z

.field public final G:Lr61;

.field public final h:Ltm1;

.field public final i:Landroid/view/View;

.field public final j:Lzv1;

.field public k:Lxm0;

.field public l:Z

.field public m:Lxm0;

.field public n:Lxm0;

.field public o:Luh1;

.field public p:Lin0;

.field public q:Le70;

.field public r:Lin0;

.field public s:Lia1;

.field public t:Ltc2;

.field public final u:[I

.field public v:J

.field public w:Lcf3;

.field public x:Lin0;

.field public final y:Lhc;

.field public final z:Lhc;


# direct methods
.method public constructor <init>(Landroid/content/Context;Leo0;ILtm1;Landroid/view/View;Lzv1;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lic;->h:Ltm1;

    .line 5
    .line 6
    iput-object p5, p0, Lic;->i:Landroid/view/View;

    .line 7
    .line 8
    iput-object p6, p0, Lic;->j:Lzv1;

    .line 9
    .line 10
    sget-object p1, Lwf3;->a:Lrk1;

    .line 11
    .line 12
    const p1, 0x7908002b

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-virtual {p0, p1}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    new-instance p2, Lac;

    .line 26
    .line 27
    move-object p3, p0

    .line 28
    check-cast p3, Lab3;

    .line 29
    .line 30
    invoke-direct {p2, p3, p1}, Lac;-><init>(Landroid/view/ViewGroup;I)V

    .line 31
    .line 32
    .line 33
    invoke-static {p0, p2}, Lwa3;->b(Landroid/view/View;Lwd3;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0, p0}, Lra3;->b(Landroid/view/View;Lgt1;)V

    .line 37
    .line 38
    .line 39
    sget-object p2, Lq7;->v:Lq7;

    .line 40
    .line 41
    iput-object p2, p0, Lic;->k:Lxm0;

    .line 42
    .line 43
    sget-object p2, Lq7;->u:Lq7;

    .line 44
    .line 45
    iput-object p2, p0, Lic;->m:Lxm0;

    .line 46
    .line 47
    sget-object p2, Lq7;->t:Lq7;

    .line 48
    .line 49
    iput-object p2, p0, Lic;->n:Lxm0;

    .line 50
    .line 51
    sget-object p2, Lrh1;->a:Lrh1;

    .line 52
    .line 53
    iput-object p2, p0, Lic;->o:Luh1;

    .line 54
    .line 55
    invoke-static {}, Lup0;->a()Lh70;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    iput-object p2, p0, Lic;->q:Le70;

    .line 60
    .line 61
    const/4 p2, 0x2

    .line 62
    new-array p5, p2, [I

    .line 63
    .line 64
    iput-object p5, p0, Lic;->u:[I

    .line 65
    .line 66
    const-wide/16 p5, 0x0

    .line 67
    .line 68
    iput-wide p5, p0, Lic;->v:J

    .line 69
    .line 70
    new-instance p5, Lhc;

    .line 71
    .line 72
    const/4 p6, 0x1

    .line 73
    invoke-direct {p5, p3, p6}, Lhc;-><init>(Lab3;I)V

    .line 74
    .line 75
    .line 76
    iput-object p5, p0, Lic;->y:Lhc;

    .line 77
    .line 78
    new-instance p5, Lhc;

    .line 79
    .line 80
    invoke-direct {p5, p3, p1}, Lhc;-><init>(Lab3;I)V

    .line 81
    .line 82
    .line 83
    iput-object p5, p0, Lic;->z:Lhc;

    .line 84
    .line 85
    new-array p5, p2, [I

    .line 86
    .line 87
    iput-object p5, p0, Lic;->B:[I

    .line 88
    .line 89
    const/high16 p5, -0x80000000

    .line 90
    .line 91
    iput p5, p0, Lic;->C:I

    .line 92
    .line 93
    iput p5, p0, Lic;->D:I

    .line 94
    .line 95
    new-instance p5, Lj51;

    .line 96
    .line 97
    const/4 v0, 0x6

    .line 98
    invoke-direct {p5, v0}, Lj51;-><init>(I)V

    .line 99
    .line 100
    .line 101
    iput-object p5, p0, Lic;->E:Lj51;

    .line 102
    .line 103
    new-instance p5, Lr61;

    .line 104
    .line 105
    const/4 v0, 0x3

    .line 106
    invoke-direct {p5, v0}, Lr61;-><init>(I)V

    .line 107
    .line 108
    .line 109
    iput-object p3, p5, Lr61;->v:Lab3;

    .line 110
    .line 111
    invoke-static {p4}, Lop0;->v(Ltm1;)Luh1;

    .line 112
    .line 113
    .line 114
    move-result-object p4

    .line 115
    sget-object v0, Lv6;->u:Lv6;

    .line 116
    .line 117
    invoke-static {p4, p6, v0}, Lnn2;->a(Luh1;ZLin0;)Luh1;

    .line 118
    .line 119
    .line 120
    move-result-object p4

    .line 121
    new-instance v0, Lu12;

    .line 122
    .line 123
    invoke-direct {v0}, Lu12;-><init>()V

    .line 124
    .line 125
    .line 126
    new-instance v1, Lcc;

    .line 127
    .line 128
    invoke-direct {v1, p3, p2}, Lcc;-><init>(Lab3;I)V

    .line 129
    .line 130
    .line 131
    iput-object v1, v0, Lu12;->a:Lcc;

    .line 132
    .line 133
    new-instance v1, Lzm;

    .line 134
    .line 135
    invoke-direct {v1}, Lzm;-><init>()V

    .line 136
    .line 137
    .line 138
    iget-object v2, v0, Lu12;->b:Lzm;

    .line 139
    .line 140
    if-eqz v2, :cond_0

    .line 141
    .line 142
    const/4 v3, 0x0

    .line 143
    iput-object v3, v2, Lzm;->i:Ljava/lang/Object;

    .line 144
    .line 145
    :cond_0
    iput-object v1, v0, Lu12;->b:Lzm;

    .line 146
    .line 147
    iput-object v0, v1, Lzm;->i:Ljava/lang/Object;

    .line 148
    .line 149
    invoke-virtual {p0, v1}, Lic;->setOnRequestDisallowInterceptTouchEvent$ui(Lin0;)V

    .line 150
    .line 151
    .line 152
    invoke-interface {p4, v0}, Luh1;->c(Luh1;)Luh1;

    .line 153
    .line 154
    .line 155
    move-result-object p4

    .line 156
    new-instance v0, Lec;

    .line 157
    .line 158
    invoke-direct {v0, p3, p5, p3}, Lec;-><init>(Lab3;Lr61;Lab3;)V

    .line 159
    .line 160
    .line 161
    invoke-static {p4, v0}, Lqp0;->s(Luh1;Lin0;)Luh1;

    .line 162
    .line 163
    .line 164
    move-result-object p4

    .line 165
    new-instance v0, Lbc;

    .line 166
    .line 167
    invoke-direct {v0, p3, p5, p2}, Lbc;-><init>(Lab3;Lr61;I)V

    .line 168
    .line 169
    .line 170
    invoke-static {p4, v0}, Lt11;->E(Luh1;Lin0;)Luh1;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    new-instance p4, Lim;

    .line 175
    .line 176
    new-instance v0, Lcc;

    .line 177
    .line 178
    invoke-direct {v0, p3, p6}, Lcc;-><init>(Lab3;I)V

    .line 179
    .line 180
    .line 181
    invoke-direct {p4, v0}, Lim;-><init>(Lcc;)V

    .line 182
    .line 183
    .line 184
    invoke-interface {p2, p4}, Luh1;->c(Luh1;)Luh1;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    iget-object p4, p0, Lic;->o:Luh1;

    .line 189
    .line 190
    invoke-interface {p4, p2}, Luh1;->c(Luh1;)Luh1;

    .line 191
    .line 192
    .line 193
    move-result-object p4

    .line 194
    invoke-virtual {p5, p4}, Lr61;->d0(Luh1;)V

    .line 195
    .line 196
    .line 197
    new-instance p4, Lfa;

    .line 198
    .line 199
    const/4 p6, 0x5

    .line 200
    invoke-direct {p4, p6, p5, p2}, Lfa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    iput-object p4, p0, Lic;->p:Lin0;

    .line 204
    .line 205
    iget-object p2, p0, Lic;->q:Le70;

    .line 206
    .line 207
    invoke-virtual {p5, p2}, Lr61;->Z(Le70;)V

    .line 208
    .line 209
    .line 210
    new-instance p2, Lv5;

    .line 211
    .line 212
    invoke-direct {p2, p6, p5}, Lv5;-><init>(ILjava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    iput-object p2, p0, Lic;->r:Lin0;

    .line 216
    .line 217
    new-instance p2, Lbc;

    .line 218
    .line 219
    invoke-direct {p2, p3, p5, p1}, Lbc;-><init>(Lab3;Lr61;I)V

    .line 220
    .line 221
    .line 222
    iput-object p2, p5, Lr61;->T:Lbc;

    .line 223
    .line 224
    new-instance p2, Lcc;

    .line 225
    .line 226
    invoke-direct {p2, p3, p1}, Lcc;-><init>(Lab3;I)V

    .line 227
    .line 228
    .line 229
    iput-object p2, p5, Lr61;->U:Lcc;

    .line 230
    .line 231
    new-instance p1, Ldc;

    .line 232
    .line 233
    invoke-direct {p1, p3, p5}, Ldc;-><init>(Lab3;Lr61;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {p5, p1}, Lr61;->c0(Lnf1;)V

    .line 237
    .line 238
    .line 239
    iput-object p5, p0, Lic;->G:Lr61;

    .line 240
    .line 241
    return-void
.end method

.method public static final synthetic d(Lab3;)Lbw1;
    .locals 0

    .line 1
    invoke-direct {p0}, Lic;->getSnapshotObserver()Lbw1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final e(Lab3;III)I
    .locals 1

    .line 1
    const/high16 p0, 0x40000000    # 2.0f

    .line 2
    .line 3
    if-gez p3, :cond_3

    .line 4
    .line 5
    if-ne p1, p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, -0x2

    .line 9
    const v0, 0x7fffffff

    .line 10
    .line 11
    .line 12
    if-ne p3, p1, :cond_1

    .line 13
    .line 14
    if-eq p2, v0, :cond_1

    .line 15
    .line 16
    const/high16 p0, -0x80000000

    .line 17
    .line 18
    invoke-static {p2, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_1
    const/4 p1, -0x1

    .line 24
    if-ne p3, p1, :cond_2

    .line 25
    .line 26
    if-eq p2, v0, :cond_2

    .line 27
    .line 28
    invoke-static {p2, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0

    .line 33
    :cond_2
    const/4 p0, 0x0

    .line 34
    invoke-static {p0, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0

    .line 39
    :cond_3
    :goto_0
    invoke-static {p3, p1, p2}, Lci0;->D(III)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-static {p1, p0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0
.end method

.method public static f(Lzz0;IIII)Lzz0;
    .locals 2

    .line 1
    iget v0, p0, Lzz0;->a:I

    .line 2
    .line 3
    sub-int/2addr v0, p1

    .line 4
    const/4 p1, 0x0

    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    move v0, p1

    .line 8
    :cond_0
    iget v1, p0, Lzz0;->b:I

    .line 9
    .line 10
    sub-int/2addr v1, p2

    .line 11
    if-gez v1, :cond_1

    .line 12
    .line 13
    move v1, p1

    .line 14
    :cond_1
    iget p2, p0, Lzz0;->c:I

    .line 15
    .line 16
    sub-int/2addr p2, p3

    .line 17
    if-gez p2, :cond_2

    .line 18
    .line 19
    move p2, p1

    .line 20
    :cond_2
    iget p0, p0, Lzz0;->d:I

    .line 21
    .line 22
    sub-int/2addr p0, p4

    .line 23
    if-gez p0, :cond_3

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    move p1, p0

    .line 27
    :goto_0
    invoke-static {v0, v1, p2, p1}, Lzz0;->b(IIII)Lzz0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method private final getSnapshotObserver()Lbw1;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "Expected AndroidViewHolder to be attached when observing reads."

    .line 8
    .line 9
    invoke-static {v0}, Lkz0;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Lic;->j:Lzv1;

    .line 13
    .line 14
    check-cast p0, Lb7;

    .line 15
    .line 16
    invoke-virtual {p0}, Lb7;->getSnapshotObserver()Lbw1;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method


# virtual methods
.method public final B()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final a()V
    .locals 0

    .line 1
    iget-object p0, p0, Lic;->n:Lxm0;

    .line 2
    .line 3
    invoke-interface {p0}, Lxm0;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(Landroid/view/View;Lcf3;)Lcf3;
    .locals 0

    .line 1
    new-instance p1, Lcf3;

    .line 2
    .line 3
    invoke-direct {p1, p2}, Lcf3;-><init>(Lcf3;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lic;->w:Lcf3;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lic;->g(Lcf3;)Lcf3;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lic;->m:Lxm0;

    .line 2
    .line 3
    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViewsInLayout()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final g(Lcf3;)Lcf3;
    .locals 13

    .line 1
    iget-object v0, p1, Lcf3;->a:Lye3;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-virtual {v0, v1}, Lye3;->i(I)Lzz0;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    sget-object v2, Lzz0;->e:Lzz0;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Lzz0;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/16 v1, -0x9

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lye3;->j(I)Lzz0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1, v2}, Lzz0;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Lye3;->h()Lt90;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_6

    .line 33
    .line 34
    :cond_0
    iget-object p0, p0, Lic;->G:Lr61;

    .line 35
    .line 36
    iget-object p0, p0, Lr61;->M:Lvn1;

    .line 37
    .line 38
    iget-object p0, p0, Lvn1;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Lqz0;

    .line 41
    .line 42
    iget-object v0, p0, Lqz0;->Y:Lqx2;

    .line 43
    .line 44
    iget-boolean v0, v0, Lth1;->u:Z

    .line 45
    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const-wide/16 v0, 0x0

    .line 50
    .line 51
    invoke-virtual {p0, v0, v1}, Lzn1;->M(J)J

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    invoke-static {v0, v1}, Ltp0;->J(J)J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    const/16 v2, 0x20

    .line 60
    .line 61
    shr-long v3, v0, v2

    .line 62
    .line 63
    long-to-int v3, v3

    .line 64
    const/4 v4, 0x0

    .line 65
    if-gez v3, :cond_2

    .line 66
    .line 67
    move v3, v4

    .line 68
    :cond_2
    const-wide v5, 0xffffffffL

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    and-long/2addr v0, v5

    .line 74
    long-to-int v0, v0

    .line 75
    if-gez v0, :cond_3

    .line 76
    .line 77
    move v0, v4

    .line 78
    :cond_3
    invoke-static {p0}, Ls11;->J(Lc61;)Lc61;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-interface {v1}, Lc61;->L()J

    .line 83
    .line 84
    .line 85
    move-result-wide v7

    .line 86
    shr-long v9, v7, v2

    .line 87
    .line 88
    long-to-int v1, v9

    .line 89
    and-long/2addr v7, v5

    .line 90
    long-to-int v7, v7

    .line 91
    iget-wide v8, p0, Lsz1;->j:J

    .line 92
    .line 93
    shr-long v10, v8, v2

    .line 94
    .line 95
    long-to-int v10, v10

    .line 96
    and-long/2addr v8, v5

    .line 97
    long-to-int v8, v8

    .line 98
    int-to-float v9, v10

    .line 99
    int-to-float v8, v8

    .line 100
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 101
    .line 102
    .line 103
    move-result v9

    .line 104
    int-to-long v9, v9

    .line 105
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    int-to-long v11, v8

    .line 110
    shl-long v8, v9, v2

    .line 111
    .line 112
    and-long v10, v11, v5

    .line 113
    .line 114
    or-long/2addr v8, v10

    .line 115
    invoke-virtual {p0, v8, v9}, Lzn1;->M(J)J

    .line 116
    .line 117
    .line 118
    move-result-wide v8

    .line 119
    invoke-static {v8, v9}, Ltp0;->J(J)J

    .line 120
    .line 121
    .line 122
    move-result-wide v8

    .line 123
    shr-long v10, v8, v2

    .line 124
    .line 125
    long-to-int p0, v10

    .line 126
    sub-int/2addr v1, p0

    .line 127
    if-gez v1, :cond_4

    .line 128
    .line 129
    move v1, v4

    .line 130
    :cond_4
    and-long/2addr v5, v8

    .line 131
    long-to-int p0, v5

    .line 132
    sub-int/2addr v7, p0

    .line 133
    if-gez v7, :cond_5

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_5
    move v4, v7

    .line 137
    :goto_0
    if-nez v3, :cond_7

    .line 138
    .line 139
    if-nez v0, :cond_7

    .line 140
    .line 141
    if-nez v1, :cond_7

    .line 142
    .line 143
    if-nez v4, :cond_7

    .line 144
    .line 145
    :cond_6
    :goto_1
    return-object p1

    .line 146
    :cond_7
    iget-object p0, p1, Lcf3;->a:Lye3;

    .line 147
    .line 148
    invoke-virtual {p0, v3, v0, v1, v4}, Lye3;->r(IIII)Lcf3;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    return-object p0
.end method

.method public final gatherTransparentRegion(Landroid/graphics/Region;)Z
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Lic;->B:[I

    .line 6
    .line 7
    invoke-virtual {p0, v1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    aget v4, v1, v2

    .line 12
    .line 13
    aget v5, v1, v0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    add-int v6, v2, v4

    .line 20
    .line 21
    aget v1, v1, v0

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    add-int v7, p0, v1

    .line 28
    .line 29
    sget-object v8, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    .line 30
    .line 31
    move-object v3, p1

    .line 32
    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Region;->op(IIIILandroid/graphics/Region$Op;)Z

    .line 33
    .line 34
    .line 35
    return v0
.end method

.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final getDensity()Le70;
    .locals 0

    .line 1
    iget-object p0, p0, Lic;->q:Le70;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getInteropView()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lic;->i:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLayoutNode()Lr61;
    .locals 0

    .line 1
    iget-object p0, p0, Lic;->G:Lr61;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 1
    iget-object p0, p0, Lic;->i:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    new-instance p0, Landroid/view/ViewGroup$LayoutParams;

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    invoke-direct {p0, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-object p0
.end method

.method public final getLifecycleOwner()Lia1;
    .locals 0

    .line 1
    iget-object p0, p0, Lic;->s:Lia1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getModifier()Luh1;
    .locals 0

    .line 1
    iget-object p0, p0, Lic;->o:Luh1;

    .line 2
    .line 3
    return-object p0
.end method

.method public getNestedScrollAxes()I
    .locals 0

    .line 1
    iget-object p0, p0, Lic;->E:Lj51;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0
.end method

.method public final getOnDensityChanged$ui()Lin0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lin0;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lic;->r:Lin0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOnModifierChanged$ui()Lin0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lin0;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lic;->p:Lin0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOnRequestDisallowInterceptTouchEvent$ui()Lin0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lin0;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lic;->A:Lin0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getRelease()Lxm0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxm0;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lic;->n:Lxm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getReset()Lxm0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxm0;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lic;->m:Lxm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSavedStateRegistryOwner()Ltc2;
    .locals 0

    .line 1
    iget-object p0, p0, Lic;->t:Ltc2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getUpdate()Lxm0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxm0;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lic;->k:Lxm0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getView()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lic;->i:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method public final invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lic;->F:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    new-instance p1, Ll6;

    .line 9
    .line 10
    const/4 p2, 0x3

    .line 11
    iget-object v0, p0, Lic;->z:Lhc;

    .line 12
    .line 13
    invoke-direct {p1, v0, p2}, Ll6;-><init>(Lxm0;I)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lic;->i:Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p0, p0, Lic;->G:Lr61;

    .line 23
    .line 24
    invoke-virtual {p0}, Lr61;->C()V

    .line 25
    .line 26
    .line 27
    :goto_0
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method public final isNestedScrollingEnabled()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lic;->i:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->isNestedScrollingEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lic;->y:Lhc;

    .line 5
    .line 6
    invoke-virtual {p0}, Lhc;->a()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lic;->F:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    new-instance p1, Ll6;

    .line 9
    .line 10
    const/4 p2, 0x3

    .line 11
    iget-object v0, p0, Lic;->z:Lhc;

    .line 12
    .line 13
    invoke-direct {p1, v0, p2}, Ll6;-><init>(Lxm0;I)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lic;->i:Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object p0, p0, Lic;->G:Lr61;

    .line 23
    .line 24
    invoke-virtual {p0}, Lr61;->C()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super {v0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 4
    .line 5
    .line 6
    invoke-direct {v0}, Lic;->getSnapshotObserver()Lbw1;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v1, v1, Lbw1;->a:Lts2;

    .line 11
    .line 12
    iget-object v2, v1, Lts2;->g:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v2

    .line 15
    :try_start_0
    iget-object v1, v1, Lts2;->f:Lzk1;

    .line 16
    .line 17
    iget v3, v1, Lzk1;->j:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    :goto_0
    iget-object v7, v1, Lzk1;->h:[Ljava/lang/Object;

    .line 22
    .line 23
    if-ge v5, v3, :cond_8

    .line 24
    .line 25
    :try_start_1
    aget-object v7, v7, v5

    .line 26
    .line 27
    check-cast v7, Lss2;

    .line 28
    .line 29
    iget-object v8, v7, Lss2;->f:Lrk1;

    .line 30
    .line 31
    invoke-virtual {v8, v0}, Lrk1;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    check-cast v8, Lgk1;

    .line 36
    .line 37
    if-nez v8, :cond_1

    .line 38
    .line 39
    :cond_0
    move/from16 v16, v5

    .line 40
    .line 41
    goto :goto_4

    .line 42
    :cond_1
    iget-object v9, v8, Lgk1;->b:[Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v10, v8, Lgk1;->c:[I

    .line 45
    .line 46
    iget-object v8, v8, Lgk1;->a:[J

    .line 47
    .line 48
    array-length v11, v8

    .line 49
    add-int/lit8 v11, v11, -0x2

    .line 50
    .line 51
    if-ltz v11, :cond_0

    .line 52
    .line 53
    const/4 v12, 0x0

    .line 54
    :goto_1
    aget-wide v13, v8, v12

    .line 55
    .line 56
    move/from16 v16, v5

    .line 57
    .line 58
    not-long v4, v13

    .line 59
    const/16 v17, 0x7

    .line 60
    .line 61
    shl-long v4, v4, v17

    .line 62
    .line 63
    and-long/2addr v4, v13

    .line 64
    const-wide v17, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    and-long v4, v4, v17

    .line 70
    .line 71
    cmp-long v4, v4, v17

    .line 72
    .line 73
    if-eqz v4, :cond_4

    .line 74
    .line 75
    sub-int v4, v12, v11

    .line 76
    .line 77
    not-int v4, v4

    .line 78
    ushr-int/lit8 v4, v4, 0x1f

    .line 79
    .line 80
    const/16 v5, 0x8

    .line 81
    .line 82
    rsub-int/lit8 v4, v4, 0x8

    .line 83
    .line 84
    const/4 v15, 0x0

    .line 85
    :goto_2
    if-ge v15, v4, :cond_3

    .line 86
    .line 87
    const-wide/16 v18, 0xff

    .line 88
    .line 89
    and-long v18, v13, v18

    .line 90
    .line 91
    const-wide/16 v20, 0x80

    .line 92
    .line 93
    cmp-long v18, v18, v20

    .line 94
    .line 95
    if-gez v18, :cond_2

    .line 96
    .line 97
    shl-int/lit8 v18, v12, 0x3

    .line 98
    .line 99
    add-int v18, v18, v15

    .line 100
    .line 101
    move/from16 v19, v5

    .line 102
    .line 103
    aget-object v5, v9, v18

    .line 104
    .line 105
    aget v18, v10, v18

    .line 106
    .line 107
    invoke-virtual {v7, v0, v5}, Lss2;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_2
    move/from16 v19, v5

    .line 112
    .line 113
    :goto_3
    shr-long v13, v13, v19

    .line 114
    .line 115
    add-int/lit8 v15, v15, 0x1

    .line 116
    .line 117
    move/from16 v5, v19

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    if-ne v4, v5, :cond_5

    .line 121
    .line 122
    :cond_4
    if-eq v12, v11, :cond_5

    .line 123
    .line 124
    add-int/lit8 v12, v12, 0x1

    .line 125
    .line 126
    move/from16 v5, v16

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_5
    :goto_4
    iget-object v4, v7, Lss2;->f:Lrk1;

    .line 130
    .line 131
    invoke-virtual {v4}, Lrk1;->j()Z

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    if-nez v4, :cond_6

    .line 136
    .line 137
    add-int/lit8 v6, v6, 0x1

    .line 138
    .line 139
    goto :goto_5

    .line 140
    :cond_6
    if-lez v6, :cond_7

    .line 141
    .line 142
    iget-object v4, v1, Lzk1;->h:[Ljava/lang/Object;

    .line 143
    .line 144
    sub-int v5, v16, v6

    .line 145
    .line 146
    aget-object v7, v4, v16

    .line 147
    .line 148
    aput-object v7, v4, v5

    .line 149
    .line 150
    goto :goto_5

    .line 151
    :catchall_0
    move-exception v0

    .line 152
    goto :goto_6

    .line 153
    :cond_7
    :goto_5
    add-int/lit8 v5, v16, 0x1

    .line 154
    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :cond_8
    sub-int v0, v3, v6

    .line 158
    .line 159
    const/4 v4, 0x0

    .line 160
    invoke-static {v7, v0, v3, v4}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    iput v0, v1, Lzk1;->j:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 164
    .line 165
    monitor-exit v2

    .line 166
    return-void

    .line 167
    :goto_6
    monitor-exit v2

    .line 168
    throw v0
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    sub-int/2addr p4, p2

    .line 2
    sub-int/2addr p5, p3

    .line 3
    iget-object p0, p0, Lic;->i:Landroid/view/View;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1, p1, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onMeasure(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lic;->i:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eq v1, p0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/16 v2, 0x8

    .line 26
    .line 27
    if-ne v1, v2, :cond_1

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-virtual {p0, v1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 46
    .line 47
    .line 48
    iput p1, p0, Lic;->C:I

    .line 49
    .line 50
    iput p2, p0, Lic;->D:I

    .line 51
    .line 52
    return-void
.end method

.method public final onNestedFling(Landroid/view/View;FFZ)Z
    .locals 7

    .line 1
    iget-object p1, p0, Lic;->i:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->isNestedScrollingEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    const/high16 p1, -0x40800000    # -1.0f

    .line 12
    .line 13
    mul-float/2addr p2, p1

    .line 14
    mul-float/2addr p3, p1

    .line 15
    invoke-static {p2, p3}, Lea3;->a(FF)J

    .line 16
    .line 17
    .line 18
    move-result-wide v4

    .line 19
    iget-object p1, p0, Lic;->h:Ltm1;

    .line 20
    .line 21
    invoke-virtual {p1}, Ltm1;->c()Lj20;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance v1, Lfc;

    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    move-object v3, p0

    .line 29
    move v2, p4

    .line 30
    invoke-direct/range {v1 .. v6}, Lfc;-><init>(ZLic;JLt00;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x3

    .line 34
    const/4 p2, 0x0

    .line 35
    invoke-static {p1, p2, v1, p0}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 36
    .line 37
    .line 38
    return v0
.end method

.method public final onNestedPreFling(Landroid/view/View;FF)Z
    .locals 7

    .line 1
    iget-object p1, p0, Lic;->i:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->isNestedScrollingEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    const/high16 p1, -0x40800000    # -1.0f

    .line 12
    .line 13
    mul-float/2addr p2, p1

    .line 14
    mul-float/2addr p3, p1

    .line 15
    invoke-static {p2, p3}, Lea3;->a(FF)J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    iget-object p1, p0, Lic;->h:Ltm1;

    .line 20
    .line 21
    invoke-virtual {p1}, Ltm1;->c()Lj20;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance v1, Lgc;

    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v5, 0x0

    .line 29
    move-object v2, p0

    .line 30
    invoke-direct/range {v1 .. v6}, Lgc;-><init>(Ljava/lang/Object;JLt00;I)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x3

    .line 34
    invoke-static {p1, v5, v1, p0}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 35
    .line 36
    .line 37
    return v0
.end method

.method public final onWindowVisibilityChanged(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onWindowVisibilityChanged(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 2

    .line 1
    iget-object p0, p0, Lic;->x:Lin0;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    new-instance p1, Lo62;

    .line 8
    .line 9
    iget p3, p2, Landroid/graphics/Rect;->left:I

    .line 10
    .line 11
    int-to-float p3, p3

    .line 12
    iget v0, p2, Landroid/graphics/Rect;->top:I

    .line 13
    .line 14
    int-to-float v0, v0

    .line 15
    iget v1, p2, Landroid/graphics/Rect;->right:I

    .line 16
    .line 17
    int-to-float v1, v1

    .line 18
    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    .line 19
    .line 20
    int-to-float p2, p2

    .line 21
    invoke-direct {p1, p3, v0, v1, p2}, Lo62;-><init>(FFFF)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    :goto_0
    invoke-interface {p0, p1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_1
    const/4 p0, 0x1

    .line 30
    return p0
.end method

.method public final requestDisallowInterceptTouchEvent(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lic;->A:Lin0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, v1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setDensity(Le70;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lic;->q:Le70;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lic;->q:Le70;

    .line 6
    .line 7
    iget-object p0, p0, Lic;->r:Lin0;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0, p1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final setLifecycleOwner(Lia1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lic;->s:Lia1;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lic;->s:Lia1;

    .line 6
    .line 7
    const v0, 0x79080080

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final setModifier(Luh1;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lic;->o:Luh1;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lic;->o:Luh1;

    .line 6
    .line 7
    iget-object p0, p0, Lic;->p:Lin0;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0, p1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final setOnDensityChanged$ui(Lin0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lin0;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lic;->r:Lin0;

    .line 2
    .line 3
    return-void
.end method

.method public final setOnModifierChanged$ui(Lin0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lin0;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lic;->p:Lin0;

    .line 2
    .line 3
    return-void
.end method

.method public final setOnRequestDisallowInterceptTouchEvent$ui(Lin0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lin0;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lic;->A:Lin0;

    .line 2
    .line 3
    return-void
.end method

.method public final setRelease(Lxm0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxm0;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lic;->n:Lxm0;

    .line 2
    .line 3
    return-void
.end method

.method public final setReset(Lxm0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxm0;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lic;->m:Lxm0;

    .line 2
    .line 3
    return-void
.end method

.method public final setSavedStateRegistryOwner(Ltc2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lic;->t:Ltc2;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lic;->t:Ltc2;

    .line 6
    .line 7
    const v0, 0x79080083

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final setUpdate(Lxm0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxm0;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lic;->k:Lxm0;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lic;->l:Z

    .line 5
    .line 6
    iget-object p0, p0, Lic;->y:Lhc;

    .line 7
    .line 8
    invoke-virtual {p0}, Lhc;->a()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
