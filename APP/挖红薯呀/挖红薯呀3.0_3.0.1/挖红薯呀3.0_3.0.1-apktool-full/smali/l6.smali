.class public final Ll6;
.super Loe0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lzi;
.implements Ltq;
.implements Lg50;


# instance fields
.field public final A:Ldh0;

.field public B:Lsv0;

.field public C:Ltv0;

.field public final r:Lg30;

.field public final s:Z

.field public final t:F

.field public final u:Lx1;

.field public final v:Ltm;

.field public w:Lfe;

.field public x:F

.field public y:J

.field public z:Z


# direct methods
.method public constructor <init>(Lg30;ZFLx1;Ltm;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Loe0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll6;->r:Lg30;

    .line 5
    .line 6
    iput-boolean p2, p0, Ll6;->s:Z

    .line 7
    .line 8
    iput p3, p0, Ll6;->t:F

    .line 9
    .line 10
    iput-object p4, p0, Ll6;->u:Lx1;

    .line 11
    .line 12
    iput-object p5, p0, Ll6;->v:Ltm;

    .line 13
    .line 14
    const-wide/16 p1, 0x0

    .line 15
    .line 16
    iput-wide p1, p0, Ll6;->y:J

    .line 17
    .line 18
    new-instance p1, Ldh0;

    .line 19
    .line 20
    invoke-direct {p1}, Ldh0;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Ll6;->A:Ldh0;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final B(Ld60;)V
    .locals 13

    .line 1
    iget-object v0, p1, Ld60;->d:Ldd;

    .line 2
    .line 3
    invoke-virtual {p1}, Ld60;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ll6;->w:Lfe;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    iget v2, p0, Ll6;->x:F

    .line 11
    .line 12
    iget-object v3, p0, Ll6;->u:Lx1;

    .line 13
    .line 14
    invoke-virtual {v3}, Lx1;->l()J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    iget-object v5, v1, Lfe;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v5, Lb7;

    .line 21
    .line 22
    invoke-virtual {v5}, Lb7;->d()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    check-cast v5, Ljava/lang/Number;

    .line 27
    .line 28
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    const/4 v6, 0x0

    .line 33
    cmpl-float v6, v5, v6

    .line 34
    .line 35
    if-lez v6, :cond_1

    .line 36
    .line 37
    invoke-static {v5, v3, v4}, Lff;->b(FJ)J

    .line 38
    .line 39
    .line 40
    move-result-wide v3

    .line 41
    iget-boolean v1, v1, Lfe;->a:Z

    .line 42
    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    invoke-interface {v0}, Luq;->c()J

    .line 46
    .line 47
    .line 48
    move-result-wide v5

    .line 49
    const/16 v1, 0x20

    .line 50
    .line 51
    shr-long/2addr v5, v1

    .line 52
    long-to-int v1, v5

    .line 53
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    invoke-interface {v0}, Luq;->c()J

    .line 58
    .line 59
    .line 60
    move-result-wide v5

    .line 61
    const-wide v9, 0xffffffffL

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    and-long/2addr v5, v9

    .line 67
    long-to-int v1, v5

    .line 68
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    iget-object v1, v0, Ldd;->e:Lo8;

    .line 73
    .line 74
    invoke-virtual {v1}, Lo8;->h()J

    .line 75
    .line 76
    .line 77
    move-result-wide v11

    .line 78
    invoke-virtual {v1}, Lo8;->f()Lbd;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-interface {v5}, Lbd;->i()V

    .line 83
    .line 84
    .line 85
    :try_start_0
    iget-object v5, v1, Lo8;->a:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v5, Lx1;

    .line 88
    .line 89
    iget-object v5, v5, Lx1;->e:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v5, Lo8;

    .line 92
    .line 93
    invoke-virtual {v5}, Lo8;->f()Lbd;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    const/4 v6, 0x0

    .line 98
    const/4 v7, 0x0

    .line 99
    const/4 v10, 0x1

    .line 100
    invoke-interface/range {v5 .. v10}, Lbd;->d(FFFFI)V

    .line 101
    .line 102
    .line 103
    invoke-static {p1, v3, v4, v2}, Luq;->W(Ld60;JF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Lo8;->f()Lbd;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-interface {p1}, Lbd;->g()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v11, v12}, Lo8;->q(J)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :catchall_0
    move-exception v0

    .line 118
    move-object p0, v0

    .line 119
    invoke-virtual {v1}, Lo8;->f()Lbd;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-interface {p1}, Lbd;->g()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v11, v12}, Lo8;->q(J)V

    .line 127
    .line 128
    .line 129
    throw p0

    .line 130
    :cond_0
    invoke-static {p1, v3, v4, v2}, Luq;->W(Ld60;JF)V

    .line 131
    .line 132
    .line 133
    :cond_1
    :goto_0
    iget-object p1, v0, Ldd;->e:Lo8;

    .line 134
    .line 135
    invoke-virtual {p1}, Lo8;->f()Lbd;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    iget-object v0, p0, Ll6;->C:Ltv0;

    .line 140
    .line 141
    if-eqz v0, :cond_2

    .line 142
    .line 143
    iget-wide v2, p0, Ll6;->y:J

    .line 144
    .line 145
    iget v1, p0, Ll6;->x:F

    .line 146
    .line 147
    invoke-static {v1}, Lrd0;->Q(F)I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    iget-object v4, p0, Ll6;->u:Lx1;

    .line 152
    .line 153
    invoke-virtual {v4}, Lx1;->l()J

    .line 154
    .line 155
    .line 156
    move-result-wide v4

    .line 157
    iget-object p0, p0, Ll6;->v:Ltm;

    .line 158
    .line 159
    invoke-virtual {p0}, Ltm;->invoke()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v0 .. v5}, Ltv0;->e(IJJ)V

    .line 163
    .line 164
    .line 165
    invoke-static {p1}, Lc3;->a(Lbd;)Landroid/graphics/Canvas;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    invoke-virtual {v0, p0}, Ltv0;->draw(Landroid/graphics/Canvas;)V

    .line 170
    .line 171
    .line 172
    :cond_2
    return-void
.end method

.method public final l(J)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ll6;->z:Z

    .line 3
    .line 4
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Lb60;->B:Lym;

    .line 9
    .line 10
    invoke-static {p1, p2}, Lo30;->C(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    iput-wide p1, p0, Ll6;->y:J

    .line 15
    .line 16
    iget p1, p0, Ll6;->t:F

    .line 17
    .line 18
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    iget-wide p1, p0, Ll6;->y:J

    .line 25
    .line 26
    const/16 v1, 0x20

    .line 27
    .line 28
    shr-long v2, p1, v1

    .line 29
    .line 30
    long-to-int v2, v2

    .line 31
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    const-wide v3, 0xffffffffL

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr p1, v3

    .line 41
    long-to-int p1, p1

    .line 42
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    int-to-long v5, p2

    .line 51
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    int-to-long p1, p1

    .line 56
    shl-long v1, v5, v1

    .line 57
    .line 58
    and-long/2addr p1, v3

    .line 59
    or-long/2addr p1, v1

    .line 60
    invoke-static {p1, p2}, Lok0;->c(J)F

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    const/high16 p2, 0x40000000    # 2.0f

    .line 65
    .line 66
    div-float/2addr p1, p2

    .line 67
    iget-boolean p2, p0, Ll6;->s:Z

    .line 68
    .line 69
    if-eqz p2, :cond_1

    .line 70
    .line 71
    const/high16 p2, 0x41200000    # 10.0f

    .line 72
    .line 73
    invoke-interface {v0, p2}, Lym;->p(F)F

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    add-float/2addr p1, p2

    .line 78
    goto :goto_0

    .line 79
    :cond_0
    invoke-interface {v0, p1}, Lym;->p(F)F

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    :cond_1
    :goto_0
    iput p1, p0, Ll6;->x:F

    .line 84
    .line 85
    iget-object p1, p0, Ll6;->A:Ldh0;

    .line 86
    .line 87
    iget-object p2, p1, Ldh0;->a:[Ljava/lang/Object;

    .line 88
    .line 89
    iget v0, p1, Ldh0;->b:I

    .line 90
    .line 91
    const/4 v1, 0x0

    .line 92
    :goto_1
    if-ge v1, v0, :cond_2

    .line 93
    .line 94
    aget-object v2, p2, v1

    .line 95
    .line 96
    check-cast v2, Lls0;

    .line 97
    .line 98
    invoke-virtual {p0, v2}, Ll6;->w0(Lls0;)V

    .line 99
    .line 100
    .line 101
    add-int/lit8 v1, v1, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_2
    invoke-virtual {p1}, Ldh0;->d()V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final l0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final o0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Loe0;->k0()Lyk;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Le;

    .line 6
    .line 7
    const/16 v2, 0x9

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, p0, v3, v2}, Le;-><init>(Ljava/lang/Object;Lik;I)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x3

    .line 14
    invoke-static {v0, v3, v1, p0}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final p0()V
    .locals 5

    .line 1
    iget-object v0, p0, Ll6;->B:Lsv0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Ll6;->C:Ltv0;

    .line 7
    .line 8
    invoke-static {p0}, Lkl;->r(Ltq;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Lsv0;->g:Ld;

    .line 12
    .line 13
    iget-object v2, v1, Ld;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-virtual {v2, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ltv0;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v2}, Ltv0;->c()V

    .line 26
    .line 27
    .line 28
    iget-object v3, v1, Ld;->e:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 31
    .line 32
    invoke-virtual {v3, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Ltv0;

    .line 37
    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    iget-object v1, v1, Ld;->f:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    invoke-interface {v1, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Ll6;

    .line 49
    .line 50
    :cond_0
    invoke-interface {v3, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    iget-object p0, v0, Lsv0;->f:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method

.method public final w0(Lls0;)V
    .locals 11

    .line 1
    instance-of v0, p1, Ljs0;

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    move-object v2, p1

    .line 6
    check-cast v2, Ljs0;

    .line 7
    .line 8
    iget-wide v4, p0, Ll6;->y:J

    .line 9
    .line 10
    iget p1, p0, Ll6;->x:F

    .line 11
    .line 12
    iget-object v0, p0, Ll6;->B:Lsv0;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_3

    .line 18
    :cond_0
    sget-object v0, Lr4;->e:Lg41;

    .line 19
    .line 20
    invoke-static {p0, v0}, Lpf1;->r(Lzi;Lat0;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Landroid/view/View;

    .line 25
    .line 26
    :goto_0
    instance-of v3, v0, Landroid/view/ViewGroup;

    .line 27
    .line 28
    if-nez v3, :cond_2

    .line 29
    .line 30
    move-object v3, v0

    .line 31
    check-cast v3, Landroid/view/View;

    .line 32
    .line 33
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    instance-of v6, v3, Landroid/view/View;

    .line 38
    .line 39
    if-eqz v6, :cond_1

    .line 40
    .line 41
    move-object v0, v3

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const-string p0, "Couldn\'t find a valid parent for "

    .line 44
    .line 45
    const-string p1, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"

    .line 46
    .line 47
    invoke-static {p0, v0, p1}, Lxc;->h(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    check-cast v0, Landroid/view/ViewGroup;

    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    move v6, v1

    .line 58
    :goto_1
    if-ge v6, v3, :cond_4

    .line 59
    .line 60
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    instance-of v8, v7, Lsv0;

    .line 65
    .line 66
    if-eqz v8, :cond_3

    .line 67
    .line 68
    check-cast v7, Lsv0;

    .line 69
    .line 70
    move-object v0, v7

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    new-instance v3, Lsv0;

    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    invoke-direct {v3, v6}, Lsv0;-><init>(Landroid/content/Context;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 85
    .line 86
    .line 87
    move-object v0, v3

    .line 88
    :goto_2
    iput-object v0, p0, Ll6;->B:Lsv0;

    .line 89
    .line 90
    :goto_3
    iget-object v3, v0, Lsv0;->e:Ljava/util/ArrayList;

    .line 91
    .line 92
    iget-object v6, v0, Lsv0;->g:Ld;

    .line 93
    .line 94
    iget-object v7, v6, Ld;->e:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v7, Ljava/util/LinkedHashMap;

    .line 97
    .line 98
    iget-object v8, v6, Ld;->e:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v8, Ljava/util/LinkedHashMap;

    .line 101
    .line 102
    iget-object v6, v6, Ld;->f:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v6, Ljava/util/LinkedHashMap;

    .line 105
    .line 106
    invoke-virtual {v7, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    check-cast v7, Ltv0;

    .line 111
    .line 112
    if-eqz v7, :cond_5

    .line 113
    .line 114
    goto :goto_7

    .line 115
    :cond_5
    iget-object v7, v0, Lsv0;->f:Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 121
    .line 122
    .line 123
    move-result v9

    .line 124
    const/4 v10, 0x0

    .line 125
    if-eqz v9, :cond_6

    .line 126
    .line 127
    move-object v7, v10

    .line 128
    goto :goto_4

    .line 129
    :cond_6
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    :goto_4
    check-cast v7, Ltv0;

    .line 134
    .line 135
    if-nez v7, :cond_b

    .line 136
    .line 137
    iget v7, v0, Lsv0;->h:I

    .line 138
    .line 139
    invoke-static {v3}, Lo30;->r(Ljava/util/List;)I

    .line 140
    .line 141
    .line 142
    move-result v9

    .line 143
    if-le v7, v9, :cond_7

    .line 144
    .line 145
    new-instance v7, Ltv0;

    .line 146
    .line 147
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    invoke-direct {v7, v9}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_7
    iget v7, v0, Lsv0;->h:I

    .line 162
    .line 163
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    move-object v7, v3

    .line 168
    check-cast v7, Ltv0;

    .line 169
    .line 170
    invoke-virtual {v6, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    check-cast v3, Ll6;

    .line 175
    .line 176
    if-eqz v3, :cond_9

    .line 177
    .line 178
    iput-object v10, v3, Ll6;->C:Ltv0;

    .line 179
    .line 180
    invoke-static {v3}, Lkl;->r(Ltq;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v8, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v9

    .line 187
    check-cast v9, Ltv0;

    .line 188
    .line 189
    if-eqz v9, :cond_8

    .line 190
    .line 191
    invoke-interface {v6, v9}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v9

    .line 195
    check-cast v9, Ll6;

    .line 196
    .line 197
    :cond_8
    invoke-interface {v8, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v7}, Ltv0;->c()V

    .line 201
    .line 202
    .line 203
    :cond_9
    :goto_5
    iget v3, v0, Lsv0;->h:I

    .line 204
    .line 205
    iget v9, v0, Lsv0;->d:I

    .line 206
    .line 207
    add-int/lit8 v9, v9, -0x1

    .line 208
    .line 209
    if-ge v3, v9, :cond_a

    .line 210
    .line 211
    add-int/lit8 v3, v3, 0x1

    .line 212
    .line 213
    iput v3, v0, Lsv0;->h:I

    .line 214
    .line 215
    goto :goto_6

    .line 216
    :cond_a
    iput v1, v0, Lsv0;->h:I

    .line 217
    .line 218
    :cond_b
    :goto_6
    invoke-interface {v8, p0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    invoke-interface {v6, v7, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    :goto_7
    invoke-static {p1}, Lrd0;->Q(F)I

    .line 225
    .line 226
    .line 227
    move-result v6

    .line 228
    iget-object p1, p0, Ll6;->u:Lx1;

    .line 229
    .line 230
    invoke-virtual {p1}, Lx1;->l()J

    .line 231
    .line 232
    .line 233
    move-result-wide v8

    .line 234
    iget-object p1, p0, Ll6;->v:Ltm;

    .line 235
    .line 236
    invoke-virtual {p1}, Ltm;->invoke()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move p1, v1

    .line 240
    move-object v1, v7

    .line 241
    move-wide v7, v8

    .line 242
    new-instance v9, Lk6;

    .line 243
    .line 244
    invoke-direct {v9, p1, p0}, Lk6;-><init>(ILjava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    iget-boolean v3, p0, Ll6;->s:Z

    .line 248
    .line 249
    invoke-virtual/range {v1 .. v9}, Ltv0;->b(Ljs0;ZJIJLk6;)V

    .line 250
    .line 251
    .line 252
    iput-object v1, p0, Ll6;->C:Ltv0;

    .line 253
    .line 254
    invoke-static {p0}, Lkl;->r(Ltq;)V

    .line 255
    .line 256
    .line 257
    return-void

    .line 258
    :cond_c
    instance-of v0, p1, Lks0;

    .line 259
    .line 260
    if-eqz v0, :cond_d

    .line 261
    .line 262
    iget-object p0, p0, Ll6;->C:Ltv0;

    .line 263
    .line 264
    if-eqz p0, :cond_e

    .line 265
    .line 266
    invoke-virtual {p0}, Ltv0;->d()V

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    :cond_d
    instance-of p1, p1, Lis0;

    .line 271
    .line 272
    if-eqz p1, :cond_e

    .line 273
    .line 274
    iget-object p0, p0, Ll6;->C:Ltv0;

    .line 275
    .line 276
    if-eqz p0, :cond_e

    .line 277
    .line 278
    invoke-virtual {p0}, Ltv0;->d()V

    .line 279
    .line 280
    .line 281
    :cond_e
    return-void
.end method
