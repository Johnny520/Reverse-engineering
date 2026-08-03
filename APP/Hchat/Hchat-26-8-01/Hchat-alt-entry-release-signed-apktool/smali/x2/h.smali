.class public abstract Lx2/h;
.super Landroid/view/ViewGroup;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li0/h;
.implements Lx1/s1;
.implements Lg3/e;


# instance fields
.field public final A:[I

.field public B:I

.field public C:I

.field public final D:La2/a;

.field public E:Z

.field public final F:Lx1/f0;

.field public final g:Lr1/d;

.field public final h:Landroid/view/View;

.field public final i:Lx1/r1;

.field public j:Lfg/a;

.field public k:Z

.field public l:Lfg/a;

.field public m:Lfg/a;

.field public n:Ly0/o;

.field public o:Lfg/l;

.field public p:Lu2/c;

.field public q:Lfg/l;

.field public r:Landroidx/lifecycle/q;

.field public s:Lu3/c;

.field public final t:[I

.field public u:J

.field public v:Lg3/r0;

.field public w:Lfg/l;

.field public final x:Lx2/g;

.field public final y:Lx2/g;

.field public z:Lfg/l;


# direct methods
.method public constructor <init>(Landroid/content/Context;Li0/f0;ILr1/d;Landroid/view/View;Lx1/r1;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lx2/h;->g:Lr1/d;

    .line 5
    .line 6
    iput-object p5, p0, Lx2/h;->h:Landroid/view/View;

    .line 7
    .line 8
    iput-object p6, p0, Lx2/h;->i:Lx1/r1;

    .line 9
    .line 10
    sget-object p1, Ly1/v2;->a:Lf/k0;

    .line 11
    .line 12
    const p1, 0x7f06002b

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
    new-instance p2, Lx2/a;

    .line 26
    .line 27
    move-object p3, p0

    .line 28
    check-cast p3, Lx2/v;

    .line 29
    .line 30
    invoke-direct {p2, p3, p1}, Lx2/a;-><init>(Landroid/view/ViewGroup;I)V

    .line 31
    .line 32
    .line 33
    invoke-static {p0, p2}, Lg3/q;->b(Landroid/view/View;Lg3/s;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0, p0}, Lg3/m;->b(Landroid/view/View;Lg3/e;)V

    .line 37
    .line 38
    .line 39
    sget-object p2, Lx2/f;->j:Lx2/f;

    .line 40
    .line 41
    iput-object p2, p0, Lx2/h;->j:Lfg/a;

    .line 42
    .line 43
    sget-object p2, Lx2/f;->i:Lx2/f;

    .line 44
    .line 45
    iput-object p2, p0, Lx2/h;->l:Lfg/a;

    .line 46
    .line 47
    sget-object p2, Lx2/f;->h:Lx2/f;

    .line 48
    .line 49
    iput-object p2, p0, Lx2/h;->m:Lfg/a;

    .line 50
    .line 51
    sget-object p2, Ly0/l;->a:Ly0/l;

    .line 52
    .line 53
    iput-object p2, p0, Lx2/h;->n:Ly0/o;

    .line 54
    .line 55
    invoke-static {}, Lfb/v0;->a()Lu2/d;

    .line 56
    .line 57
    .line 58
    move-result-object p5

    .line 59
    iput-object p5, p0, Lx2/h;->p:Lu2/c;

    .line 60
    .line 61
    const/4 p5, 0x2

    .line 62
    new-array p6, p5, [I

    .line 63
    .line 64
    iput-object p6, p0, Lx2/h;->t:[I

    .line 65
    .line 66
    const-wide/16 v0, 0x0

    .line 67
    .line 68
    iput-wide v0, p0, Lx2/h;->u:J

    .line 69
    .line 70
    new-instance p6, Lx2/g;

    .line 71
    .line 72
    const/4 v0, 0x1

    .line 73
    invoke-direct {p6, p3, v0}, Lx2/g;-><init>(Lx2/v;I)V

    .line 74
    .line 75
    .line 76
    iput-object p6, p0, Lx2/h;->x:Lx2/g;

    .line 77
    .line 78
    new-instance p6, Lx2/g;

    .line 79
    .line 80
    invoke-direct {p6, p3, p1}, Lx2/g;-><init>(Lx2/v;I)V

    .line 81
    .line 82
    .line 83
    iput-object p6, p0, Lx2/h;->y:Lx2/g;

    .line 84
    .line 85
    new-array p6, p5, [I

    .line 86
    .line 87
    iput-object p6, p0, Lx2/h;->A:[I

    .line 88
    .line 89
    const/high16 p6, -0x80000000

    .line 90
    .line 91
    iput p6, p0, Lx2/h;->B:I

    .line 92
    .line 93
    iput p6, p0, Lx2/h;->C:I

    .line 94
    .line 95
    new-instance p6, La2/a;

    .line 96
    .line 97
    const/16 v1, 0xd

    .line 98
    .line 99
    invoke-direct {p6, v1}, La2/a;-><init>(I)V

    .line 100
    .line 101
    .line 102
    iput-object p6, p0, Lx2/h;->D:La2/a;

    .line 103
    .line 104
    new-instance p6, Lx1/f0;

    .line 105
    .line 106
    const/4 v1, 0x3

    .line 107
    invoke-direct {p6, v1}, Lx1/f0;-><init>(I)V

    .line 108
    .line 109
    .line 110
    iput-object p3, p6, Lx1/f0;->u:Lx2/v;

    .line 111
    .line 112
    sget-object v1, Lx2/i;->a:Luf/d;

    .line 113
    .line 114
    invoke-static {p2, v1, p4}, Lr1/f;->a(Ly0/o;Lr1/a;Lr1/d;)Ly0/o;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    sget-object p4, Lx2/b;->j:Lx2/b;

    .line 119
    .line 120
    new-instance v1, Lf2/b;

    .line 121
    .line 122
    invoke-direct {v1, v0, p4}, Lf2/b;-><init>(ZLfg/l;)V

    .line 123
    .line 124
    .line 125
    invoke-interface {p2, v1}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    new-instance p4, Ls1/a0;

    .line 130
    .line 131
    invoke-direct {p4}, Ls1/a0;-><init>()V

    .line 132
    .line 133
    .line 134
    new-instance v1, Ls1/b0;

    .line 135
    .line 136
    invoke-direct {v1, p3, p1}, Ls1/b0;-><init>(Lx2/v;I)V

    .line 137
    .line 138
    .line 139
    iput-object v1, p4, Ls1/a0;->a:Ls1/b0;

    .line 140
    .line 141
    new-instance v1, Li0/c;

    .line 142
    .line 143
    invoke-direct {v1}, Li0/c;-><init>()V

    .line 144
    .line 145
    .line 146
    iget-object v2, p4, Ls1/a0;->b:Li0/c;

    .line 147
    .line 148
    if-eqz v2, :cond_0

    .line 149
    .line 150
    const/4 v3, 0x0

    .line 151
    iput-object v3, v2, Li0/c;->h:Ljava/lang/Object;

    .line 152
    .line 153
    :cond_0
    iput-object v1, p4, Ls1/a0;->b:Li0/c;

    .line 154
    .line 155
    iput-object p4, v1, Li0/c;->h:Ljava/lang/Object;

    .line 156
    .line 157
    invoke-virtual {p0, v1}, Lx2/h;->setOnRequestDisallowInterceptTouchEvent$ui(Lfg/l;)V

    .line 158
    .line 159
    .line 160
    invoke-interface {p2, p4}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    new-instance p4, Lb1/g;

    .line 165
    .line 166
    const/4 v1, 0x6

    .line 167
    invoke-direct {p4, p3, p6, p3, v1}, Lb1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 168
    .line 169
    .line 170
    invoke-static {p2, p4}, Lc1/h;->d(Ly0/o;Lfg/l;)Ly0/o;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    new-instance p4, Lx2/c;

    .line 175
    .line 176
    invoke-direct {p4, p3, p6, p5}, Lx2/c;-><init>(Lx2/v;Lx1/f0;I)V

    .line 177
    .line 178
    .line 179
    invoke-static {p2, p4}, Lv1/w;->m(Ly0/o;Lfg/l;)Ly0/o;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    new-instance p4, Lx2/m;

    .line 184
    .line 185
    new-instance v1, Ls1/b0;

    .line 186
    .line 187
    invoke-direct {v1, p3, p5}, Ls1/b0;-><init>(Lx2/v;I)V

    .line 188
    .line 189
    .line 190
    invoke-direct {p4, v1}, Lx2/m;-><init>(Ls1/b0;)V

    .line 191
    .line 192
    .line 193
    invoke-interface {p2, p4}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    iget-object p4, p0, Lx2/h;->n:Ly0/o;

    .line 198
    .line 199
    invoke-interface {p4, p2}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 200
    .line 201
    .line 202
    move-result-object p4

    .line 203
    invoke-virtual {p6, p4}, Lx1/f0;->d0(Ly0/o;)V

    .line 204
    .line 205
    .line 206
    new-instance p4, Lf1/p;

    .line 207
    .line 208
    const/4 p5, 0x5

    .line 209
    invoke-direct {p4, p6, p5, p2}, Lf1/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    iput-object p4, p0, Lx2/h;->o:Lfg/l;

    .line 213
    .line 214
    iget-object p2, p0, Lx2/h;->p:Lu2/c;

    .line 215
    .line 216
    invoke-virtual {p6, p2}, Lx1/f0;->Z(Lu2/c;)V

    .line 217
    .line 218
    .line 219
    new-instance p2, Lb1/f;

    .line 220
    .line 221
    const/16 p4, 0x12

    .line 222
    .line 223
    invoke-direct {p2, p6, p4}, Lb1/f;-><init>(Ljava/lang/Object;I)V

    .line 224
    .line 225
    .line 226
    iput-object p2, p0, Lx2/h;->q:Lfg/l;

    .line 227
    .line 228
    new-instance p2, Lx2/c;

    .line 229
    .line 230
    invoke-direct {p2, p3, p6, p1}, Lx2/c;-><init>(Lx2/v;Lx1/f0;I)V

    .line 231
    .line 232
    .line 233
    iput-object p2, p6, Lx1/f0;->S:Lx2/c;

    .line 234
    .line 235
    new-instance p1, Ls1/b0;

    .line 236
    .line 237
    invoke-direct {p1, p3, v0}, Ls1/b0;-><init>(Lx2/v;I)V

    .line 238
    .line 239
    .line 240
    iput-object p1, p6, Lx1/f0;->T:Ls1/b0;

    .line 241
    .line 242
    new-instance p1, Lx2/d;

    .line 243
    .line 244
    invoke-direct {p1, p3, p6}, Lx2/d;-><init>(Lx2/v;Lx1/f0;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p6, p1}, Lx1/f0;->c0(Lv1/n0;)V

    .line 248
    .line 249
    .line 250
    iput-object p6, p0, Lx2/h;->F:Lx1/f0;

    .line 251
    .line 252
    return-void
.end method

.method public static final synthetic d(Lx2/v;)Lx1/t1;
    .locals 0

    .line 1
    invoke-direct {p0}, Lx2/h;->getSnapshotObserver()Lx1/t1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final e(Lx2/v;III)I
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
    invoke-static {p3, p1, p2}, Lr9/e0;->r(III)I

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

.method public static f(Lb3/a;IIII)Lb3/a;
    .locals 2

    .line 1
    iget v0, p0, Lb3/a;->a:I

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
    iget v1, p0, Lb3/a;->b:I

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
    iget p2, p0, Lb3/a;->c:I

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
    iget p0, p0, Lb3/a;->d:I

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
    invoke-static {v0, v1, p2, p1}, Lb3/a;->b(IIII)Lb3/a;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method private final getSnapshotObserver()Lx1/t1;
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
    invoke-static {v0}, Lu1/a;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lx2/h;->i:Lx1/r1;

    .line 13
    .line 14
    check-cast v0, Ly1/t;

    .line 15
    .line 16
    invoke-virtual {v0}, Ly1/t;->getSnapshotObserver()Lx1/t1;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method


# virtual methods
.method public final L()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/h;->m:Lfg/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/h;->l:Lfg/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViewsInLayout()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final c(Landroid/view/View;Lg3/r0;)Lg3/r0;
    .locals 0

    .line 1
    new-instance p1, Lg3/r0;

    .line 2
    .line 3
    invoke-direct {p1, p2}, Lg3/r0;-><init>(Lg3/r0;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lx2/h;->v:Lg3/r0;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lx2/h;->g(Lg3/r0;)Lg3/r0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final g(Lg3/r0;)Lg3/r0;
    .locals 14

    .line 1
    iget-object v0, p1, Lg3/r0;->a:Lg3/n0;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-virtual {v0, v1}, Lg3/n0;->g(I)Lb3/a;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    sget-object v2, Lb3/a;->e:Lb3/a;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Lb3/a;->equals(Ljava/lang/Object;)Z

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
    invoke-virtual {v0, v1}, Lg3/n0;->h(I)Lb3/a;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1, v2}, Lb3/a;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Lg3/n0;->f()Lg3/d;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_6

    .line 33
    .line 34
    :cond_0
    iget-object v0, p0, Lx2/h;->F:Lx1/f0;

    .line 35
    .line 36
    iget-object v0, v0, Lx1/f0;->L:Lx1/b1;

    .line 37
    .line 38
    iget-object v0, v0, Lx1/b1;->c:Lx1/r;

    .line 39
    .line 40
    iget-object v1, v0, Lx1/r;->Y:Lx1/b2;

    .line 41
    .line 42
    iget-boolean v1, v1, Ly0/n;->t:Z

    .line 43
    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-wide/16 v1, 0x0

    .line 48
    .line 49
    invoke-virtual {v0, v1, v2}, Lx1/i1;->m0(J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v1

    .line 53
    invoke-static {v1, v2}, Lig/a;->W(J)J

    .line 54
    .line 55
    .line 56
    move-result-wide v1

    .line 57
    const/16 v3, 0x20

    .line 58
    .line 59
    shr-long v4, v1, v3

    .line 60
    .line 61
    long-to-int v4, v4

    .line 62
    const/4 v5, 0x0

    .line 63
    if-gez v4, :cond_2

    .line 64
    .line 65
    move v4, v5

    .line 66
    :cond_2
    const-wide v6, 0xffffffffL

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    and-long/2addr v1, v6

    .line 72
    long-to-int v1, v1

    .line 73
    if-gez v1, :cond_3

    .line 74
    .line 75
    move v1, v5

    .line 76
    :cond_3
    invoke-static {v0}, Lv1/w;->h(Lv1/t;)Lv1/t;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-interface {v2}, Lv1/t;->F()J

    .line 81
    .line 82
    .line 83
    move-result-wide v8

    .line 84
    shr-long v10, v8, v3

    .line 85
    .line 86
    long-to-int v2, v10

    .line 87
    and-long/2addr v8, v6

    .line 88
    long-to-int v8, v8

    .line 89
    iget-wide v9, v0, Lv1/b1;->i:J

    .line 90
    .line 91
    shr-long v11, v9, v3

    .line 92
    .line 93
    long-to-int v11, v11

    .line 94
    and-long/2addr v9, v6

    .line 95
    long-to-int v9, v9

    .line 96
    int-to-float v10, v11

    .line 97
    int-to-float v9, v9

    .line 98
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 99
    .line 100
    .line 101
    move-result v10

    .line 102
    int-to-long v10, v10

    .line 103
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    int-to-long v12, v9

    .line 108
    shl-long v9, v10, v3

    .line 109
    .line 110
    and-long v11, v12, v6

    .line 111
    .line 112
    or-long/2addr v9, v11

    .line 113
    invoke-virtual {v0, v9, v10}, Lx1/i1;->m0(J)J

    .line 114
    .line 115
    .line 116
    move-result-wide v9

    .line 117
    invoke-static {v9, v10}, Lig/a;->W(J)J

    .line 118
    .line 119
    .line 120
    move-result-wide v9

    .line 121
    shr-long v11, v9, v3

    .line 122
    .line 123
    long-to-int v0, v11

    .line 124
    sub-int/2addr v2, v0

    .line 125
    if-gez v2, :cond_4

    .line 126
    .line 127
    move v2, v5

    .line 128
    :cond_4
    and-long/2addr v6, v9

    .line 129
    long-to-int v0, v6

    .line 130
    sub-int/2addr v8, v0

    .line 131
    if-gez v8, :cond_5

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_5
    move v5, v8

    .line 135
    :goto_0
    if-nez v4, :cond_7

    .line 136
    .line 137
    if-nez v1, :cond_7

    .line 138
    .line 139
    if-nez v2, :cond_7

    .line 140
    .line 141
    if-nez v5, :cond_7

    .line 142
    .line 143
    :cond_6
    :goto_1
    return-object p1

    .line 144
    :cond_7
    iget-object p1, p1, Lg3/r0;->a:Lg3/n0;

    .line 145
    .line 146
    invoke-virtual {p1, v4, v1, v2, v5}, Lg3/n0;->n(IIII)Lg3/r0;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    return-object p1
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
    iget-object v1, p0, Lx2/h;->A:[I

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
    move-result v2

    .line 27
    add-int v7, v2, v1

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
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final getDensity()Lu2/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/h;->p:Lu2/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getInteropView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/h;->h:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLayoutNode()Lx1/f0;
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/h;->F:Lx1/f0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1
    iget-object v0, p0, Lx2/h;->h:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-object v0
.end method

.method public final getLifecycleOwner()Landroidx/lifecycle/q;
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/h;->r:Landroidx/lifecycle/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getModifier()Ly0/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/h;->n:Ly0/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public getNestedScrollAxes()I
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/h;->D:La2/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    return v0
.end method

.method public final getOnDensityChanged$ui()Lfg/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfg/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lx2/h;->q:Lfg/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOnModifierChanged$ui()Lfg/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfg/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lx2/h;->o:Lfg/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOnRequestDisallowInterceptTouchEvent$ui()Lfg/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfg/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lx2/h;->z:Lfg/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRelease()Lfg/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfg/a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lx2/h;->m:Lfg/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getReset()Lfg/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfg/a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lx2/h;->l:Lfg/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSavedStateRegistryOwner()Lu3/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/h;->s:Lu3/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUpdate()Lfg/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfg/a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lx2/h;->j:Lfg/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/h;->h:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public final invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lx2/h;->E:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    new-instance p1, Lb0/c;

    .line 9
    .line 10
    const/4 p2, 0x4

    .line 11
    iget-object v0, p0, Lx2/h;->y:Lx2/g;

    .line 12
    .line 13
    invoke-direct {p1, v0, p2}, Lb0/c;-><init>(Lfg/a;I)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lx2/h;->h:Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {p2, p1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p1, p0, Lx2/h;->F:Lx1/f0;

    .line 23
    .line 24
    invoke-virtual {p1}, Lx1/f0;->B()V

    .line 25
    .line 26
    .line 27
    :goto_0
    const/4 p1, 0x0

    .line 28
    return-object p1
.end method

.method public final isNestedScrollingEnabled()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/h;->h:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->isNestedScrollingEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lx2/h;->x:Lx2/g;

    .line 5
    .line 6
    invoke-virtual {v0}, Lx2/g;->invoke()Ljava/lang/Object;

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
    iget-boolean p1, p0, Lx2/h;->E:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    new-instance p1, Lb0/c;

    .line 9
    .line 10
    const/4 p2, 0x4

    .line 11
    iget-object v0, p0, Lx2/h;->y:Lx2/g;

    .line 12
    .line 13
    invoke-direct {p1, v0, p2}, Lb0/c;-><init>(Lfg/a;I)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lx2/h;->h:Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {p2, p1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object p1, p0, Lx2/h;->F:Lx1/f0;

    .line 23
    .line 24
    invoke-virtual {p1}, Lx1/f0;->B()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-super {v1}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 4
    .line 5
    .line 6
    invoke-direct {v1}, Lx2/h;->getSnapshotObserver()Lx1/t1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, Lx1/t1;->a:Lw0/s;

    .line 11
    .line 12
    iget-object v2, v0, Lw0/s;->g:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v2

    .line 15
    :try_start_0
    iget-object v0, v0, Lw0/s;->f:Lj0/b;

    .line 16
    .line 17
    iget v3, v0, Lj0/b;->i:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    :goto_0
    iget-object v7, v0, Lj0/b;->g:[Ljava/lang/Object;

    .line 22
    .line 23
    if-ge v5, v3, :cond_8

    .line 24
    .line 25
    :try_start_1
    aget-object v7, v7, v5

    .line 26
    .line 27
    check-cast v7, Lw0/r;

    .line 28
    .line 29
    iget-object v8, v7, Lw0/r;->f:Lf/k0;

    .line 30
    .line 31
    invoke-virtual {v8, v1}, Lf/k0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    check-cast v8, Lf/b0;

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
    iget-object v9, v8, Lf/b0;->b:[Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v10, v8, Lf/b0;->c:[I

    .line 45
    .line 46
    iget-object v8, v8, Lf/b0;->a:[J

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
    invoke-virtual {v7, v1, v5}, Lw0/r;->c(Ljava/lang/Object;Ljava/lang/Object;)V

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
    iget-object v4, v7, Lw0/r;->f:Lf/k0;

    .line 130
    .line 131
    invoke-virtual {v4}, Lf/k0;->j()Z

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
    iget-object v4, v0, Lj0/b;->g:[Ljava/lang/Object;

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
    sub-int v4, v3, v6

    .line 158
    .line 159
    const/4 v5, 0x0

    .line 160
    invoke-static {v7, v4, v3, v5}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    iput v4, v0, Lj0/b;->i:I
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
    iget-object p1, p0, Lx2/h;->h:Landroid/view/View;

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    invoke-virtual {p1, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onMeasure(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lx2/h;->h:Landroid/view/View;

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
    iput p1, p0, Lx2/h;->B:I

    .line 49
    .line 50
    iput p2, p0, Lx2/h;->C:I

    .line 51
    .line 52
    return-void
.end method

.method public final onNestedFling(Landroid/view/View;FFZ)Z
    .locals 7

    .line 1
    iget-object p1, p0, Lx2/h;->h:Landroid/view/View;

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
    invoke-static {p2, p3}, La/a;->d(FF)J

    .line 16
    .line 17
    .line 18
    move-result-wide v4

    .line 19
    iget-object p1, p0, Lx2/h;->g:Lr1/d;

    .line 20
    .line 21
    invoke-virtual {p1}, Lr1/d;->e()Lqg/t;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance v1, Lx2/e;

    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    move-object v3, p0

    .line 29
    move v2, p4

    .line 30
    invoke-direct/range {v1 .. v6}, Lx2/e;-><init>(ZLx2/h;JLwf/c;)V

    .line 31
    .line 32
    .line 33
    const/4 p2, 0x3

    .line 34
    const/4 p3, 0x0

    .line 35
    invoke-static {p1, p3, v1, p2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 36
    .line 37
    .line 38
    return v0
.end method

.method public final onNestedPreFling(Landroid/view/View;FF)Z
    .locals 7

    .line 1
    iget-object p1, p0, Lx2/h;->h:Landroid/view/View;

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
    invoke-static {p2, p3}, La/a;->d(FF)J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    iget-object p1, p0, Lx2/h;->g:Lr1/d;

    .line 20
    .line 21
    invoke-virtual {p1}, Lr1/d;->e()Lqg/t;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance v1, Lh0/k0;

    .line 26
    .line 27
    const/4 v6, 0x3

    .line 28
    const/4 v5, 0x0

    .line 29
    move-object v2, p0

    .line 30
    invoke-direct/range {v1 .. v6}, Lh0/k0;-><init>(Ljava/lang/Object;JLwf/c;I)V

    .line 31
    .line 32
    .line 33
    const/4 p2, 0x3

    .line 34
    invoke-static {p1, v5, v1, p2}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

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
    .locals 3

    .line 1
    iget-object p1, p0, Lx2/h;->w:Lfg/l;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    new-instance p3, Le1/c;

    .line 8
    .line 9
    iget v0, p2, Landroid/graphics/Rect;->left:I

    .line 10
    .line 11
    int-to-float v0, v0

    .line 12
    iget v1, p2, Landroid/graphics/Rect;->top:I

    .line 13
    .line 14
    int-to-float v1, v1

    .line 15
    iget v2, p2, Landroid/graphics/Rect;->right:I

    .line 16
    .line 17
    int-to-float v2, v2

    .line 18
    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    .line 19
    .line 20
    int-to-float p2, p2

    .line 21
    invoke-direct {p3, v0, v1, v2, p2}, Le1/c;-><init>(FFFF)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p3, 0x0

    .line 26
    :goto_0
    invoke-interface {p1, p3}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_1
    const/4 p1, 0x1

    .line 30
    return p1
.end method

.method public final requestDisallowInterceptTouchEvent(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx2/h;->z:Lfg/l;

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
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

.method public final setDensity(Lu2/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/h;->p:Lu2/c;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lx2/h;->p:Lu2/c;

    .line 6
    .line 7
    iget-object v0, p0, Lx2/h;->q:Lfg/l;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final setLifecycleOwner(Landroidx/lifecycle/q;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/h;->r:Landroidx/lifecycle/q;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lx2/h;->r:Landroidx/lifecycle/q;

    .line 6
    .line 7
    const v0, 0x7f06007d

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

.method public final setModifier(Ly0/o;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/h;->n:Ly0/o;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lx2/h;->n:Ly0/o;

    .line 6
    .line 7
    iget-object v0, p0, Lx2/h;->o:Lfg/l;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final setOnDensityChanged$ui(Lfg/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfg/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lx2/h;->q:Lfg/l;

    .line 2
    .line 3
    return-void
.end method

.method public final setOnModifierChanged$ui(Lfg/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfg/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lx2/h;->o:Lfg/l;

    .line 2
    .line 3
    return-void
.end method

.method public final setOnRequestDisallowInterceptTouchEvent$ui(Lfg/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfg/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lx2/h;->z:Lfg/l;

    .line 2
    .line 3
    return-void
.end method

.method public final setRelease(Lfg/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfg/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lx2/h;->m:Lfg/a;

    .line 2
    .line 3
    return-void
.end method

.method public final setReset(Lfg/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfg/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lx2/h;->l:Lfg/a;

    .line 2
    .line 3
    return-void
.end method

.method public final setSavedStateRegistryOwner(Lu3/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/h;->s:Lu3/c;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lx2/h;->s:Lu3/c;

    .line 6
    .line 7
    const v0, 0x7f060080

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

.method public final setUpdate(Lfg/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfg/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lx2/h;->j:Lfg/a;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lx2/h;->k:Z

    .line 5
    .line 6
    iget-object p1, p0, Lx2/h;->x:Lx2/g;

    .line 7
    .line 8
    invoke-virtual {p1}, Lx2/g;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method
