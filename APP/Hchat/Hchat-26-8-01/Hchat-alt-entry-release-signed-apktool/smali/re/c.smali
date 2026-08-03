.class public final Lre/c;
.super Lbe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final g:Lmh/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lre/c;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lre/c;->g:Lmh/b;

    .line 8
    .line 9
    return-void
.end method

.method public static i(Li4/c0;)V
    .locals 5

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Li4/c0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lb5/h;

    .line 8
    .line 9
    new-instance v3, Lce/f;

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    invoke-direct {v3, v4}, Lce/f;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v3}, Lb5/h;->c(Ljava/util/function/BiConsumer;)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Li4/c0;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Lb5/h;

    .line 21
    .line 22
    new-instance v3, Lce/f;

    .line 23
    .line 24
    const/4 v4, 0x2

    .line 25
    invoke-direct {v3, v4}, Lce/f;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v3}, Lb5/h;->c(Ljava/util/function/BiConsumer;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Li4/c0;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Lb5/h;

    .line 34
    .line 35
    new-instance v3, Lce/f;

    .line 36
    .line 37
    const/4 v4, 0x3

    .line 38
    invoke-direct {v3, v4}, Lce/f;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v3}, Lb5/h;->c(Ljava/util/function/BiConsumer;)V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Li4/c0;->e:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Lb5/h;

    .line 47
    .line 48
    new-instance v3, Lce/f;

    .line 49
    .line 50
    const/4 v4, 0x4

    .line 51
    invoke-direct {v3, v4}, Lce/f;-><init>(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v3}, Lb5/h;->c(Ljava/util/function/BiConsumer;)V

    .line 55
    .line 56
    .line 57
    iget-object p0, p0, Li4/c0;->f:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, Lb5/h;

    .line 60
    .line 61
    new-instance v2, Lce/f;

    .line 62
    .line 63
    const/4 v3, 0x5

    .line 64
    invoke-direct {v2, v3}, Lce/f;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v2}, Lb5/h;->c(Ljava/util/function/BiConsumer;)V

    .line 68
    .line 69
    .line 70
    sget-object p0, Lre/c;->g:Lmh/b;

    .line 71
    .line 72
    invoke-interface {p0}, Lmh/b;->d()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_0

    .line 77
    .line 78
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 79
    .line 80
    .line 81
    move-result-wide v2

    .line 82
    sub-long/2addr v2, v0

    .line 83
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    const-string v1, "Apply usage data in {}ms"

    .line 88
    .line 89
    invoke-interface {p0, v0, v1}, Lmh/b;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :cond_0
    return-void
.end method

.method public static j(Lnd/b0;Lnc/b;Li4/c0;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lnc/b;->b:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lqd/j;->z(Ljava/lang/String;)Lqd/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p2, p0, v0}, Li4/c0;->c(Lnd/b0;Lqd/j;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p1, Lnc/b;->c:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lnc/a;

    .line 31
    .line 32
    invoke-static {p0, v0, p2}, Lre/c;->l(Lnd/b0;Lnc/a;Li4/c0;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-void
.end method

.method public static k(Lnd/b0;Lpc/d;Li4/c0;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iget-object p1, p1, Lpc/d;->g:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/util/HashMap;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    invoke-virtual {p1}, Ljava/util/HashMap;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 28
    .line 29
    .line 30
    move-object p1, v0

    .line 31
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lnc/b;

    .line 46
    .line 47
    invoke-static {p0, v0, p2}, Lre/c;->j(Lnd/b0;Lnc/b;Li4/c0;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    :goto_2
    return-void
.end method

.method public static l(Lnd/b0;Lnc/a;Li4/c0;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lnc/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p1, Lnc/a;->g:I

    .line 4
    .line 5
    invoke-static {p1}, Lt3/c;->b(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/16 v1, 0x10

    .line 10
    .line 11
    if-eq p1, v1, :cond_3

    .line 12
    .line 13
    const/16 v1, 0x11

    .line 14
    .line 15
    if-eq p1, v1, :cond_2

    .line 16
    .line 17
    packed-switch p1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :pswitch_0
    instance-of p1, v0, Ljf/d;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-interface {p0}, Lud/k;->n()Lud/u;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast v0, Ljf/d;

    .line 30
    .line 31
    invoke-static {p1, v0}, Lod/c;->a(Lud/u;Ljf/d;)Lod/c;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p2, p0, p1}, Li4/c0;->h(Lnd/b0;Lod/c;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    instance-of p1, v0, Lod/c;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    check-cast v0, Lod/c;

    .line 44
    .line 45
    invoke-virtual {p2, p0, v0}, Li4/c0;->h(Lnd/b0;Lod/c;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    const-class p0, Lnc/a;

    .line 50
    .line 51
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const-string p1, "Unexpected field type class: "

    .line 56
    .line 57
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_1
    check-cast v0, Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v0}, Lqd/j;->z(Ljava/lang/String;)Lqd/j;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p2, p0, p1}, Li4/c0;->c(Lnd/b0;Lqd/j;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_2
    check-cast v0, Lnc/b;

    .line 76
    .line 77
    invoke-static {p0, v0, p2}, Lre/c;->j(Lnd/b0;Lnc/b;Li4/c0;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_3
    check-cast v0, Ljava/util/List;

    .line 82
    .line 83
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_4

    .line 92
    .line 93
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Lnc/a;

    .line 98
    .line 99
    invoke-static {p0, v0, p2}, Lre/c;->l(Lnd/b0;Lnc/a;Li4/c0;)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_4
    :goto_1
    return-void

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static m(Lud/u;Lud/r;Lgf/a;Li4/c0;)V
    .locals 6

    .line 1
    iget-object v0, p3, Li4/c0;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb5/h;

    .line 4
    .line 5
    iget-object v1, p2, Lgf/a;->d:Lgf/c;

    .line 6
    .line 7
    iget-object v2, p2, Lgf/a;->b:Lac/k;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    move v4, v3

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v4, v1, Lgf/c;->b:I

    .line 15
    .line 16
    :goto_0
    if-ne v4, v3, :cond_1

    .line 17
    .line 18
    goto/16 :goto_3

    .line 19
    .line 20
    :cond_1
    iget v1, v1, Lgf/c;->d:I

    .line 21
    .line 22
    invoke-static {v1}, Lt3/c;->b(I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eq v1, v3, :cond_9

    .line 27
    .line 28
    const/4 v3, 0x3

    .line 29
    if-eq v1, v3, :cond_7

    .line 30
    .line 31
    const/16 v3, 0x10

    .line 32
    .line 33
    const/4 v4, 0x4

    .line 34
    if-eq v1, v4, :cond_5

    .line 35
    .line 36
    const/4 v2, 0x5

    .line 37
    if-eq v1, v2, :cond_2

    .line 38
    .line 39
    goto/16 :goto_3

    .line 40
    .line 41
    :cond_2
    invoke-virtual {p2}, Lgf/a;->a()V

    .line 42
    .line 43
    .line 44
    invoke-static {p2}, Lig/a;->v(Lgf/a;)Lqc/a;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    const/4 v1, 0x0

    .line 49
    if-nez p2, :cond_3

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    iget-object p2, p2, Lqc/a;->a:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-ge v4, v2, :cond_4

    .line 59
    .line 60
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    check-cast p2, Lnc/a;

    .line 65
    .line 66
    iget v2, p2, Lnc/a;->g:I

    .line 67
    .line 68
    if-ne v2, v3, :cond_4

    .line 69
    .line 70
    iget-object p2, p2, Lnc/a;->h:Ljava/lang/Object;

    .line 71
    .line 72
    move-object v1, p2

    .line 73
    check-cast v1, Lqc/d;

    .line 74
    .line 75
    :cond_4
    :goto_1
    if-eqz v1, :cond_8

    .line 76
    .line 77
    invoke-virtual {v1}, Lqc/d;->a()Ljf/h;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-static {p0, p2}, Lod/d;->d(Lud/u;Ljf/h;)Lod/d;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-virtual {p0, p2}, Lud/u;->i(Lod/d;)Lud/r;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-eqz p0, :cond_8

    .line 90
    .line 91
    iget-object p2, p0, Lud/r;->l:Lud/e;

    .line 92
    .line 93
    invoke-virtual {p3, p1, p2}, Li4/c0;->f(Lud/r;Lud/e;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, p0, p1}, Lb5/h;->a(Lnd/b0;Lnd/b0;)V

    .line 97
    .line 98
    .line 99
    iget-object p2, p0, Lud/r;->t:Lqd/j;

    .line 100
    .line 101
    invoke-virtual {p3, p1, p2}, Li4/c0;->e(Lud/r;Lqd/j;)V

    .line 102
    .line 103
    .line 104
    iget-object p0, p0, Lud/r;->k:Lod/d;

    .line 105
    .line 106
    iget-object p0, p0, Lod/d;->i:Ljava/util/List;

    .line 107
    .line 108
    new-instance p2, Lre/b;

    .line 109
    .line 110
    const/4 v0, 0x0

    .line 111
    invoke-direct {p2, p3, p1, v0}, Lre/b;-><init>(Li4/c0;Lud/r;I)V

    .line 112
    .line 113
    .line 114
    invoke-interface {p0, p2}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_5
    invoke-virtual {p2}, Lgf/a;->a()V

    .line 119
    .line 120
    .line 121
    iget-object v1, p2, Lgf/a;->n:Lsc/a;

    .line 122
    .line 123
    if-eqz v1, :cond_6

    .line 124
    .line 125
    check-cast v1, Ljf/h;

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_6
    iget p2, p2, Lgf/a;->m:I

    .line 129
    .line 130
    new-instance v1, Ljf/h;

    .line 131
    .line 132
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 133
    .line 134
    .line 135
    iget-object v4, v2, Lac/k;->j:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v4, Lff/e;

    .line 138
    .line 139
    iget v4, v4, Lff/e;->a:I

    .line 140
    .line 141
    const v5, 0xffff

    .line 142
    .line 143
    .line 144
    and-int/2addr v4, v5

    .line 145
    shl-int/lit8 v3, v4, 0x10

    .line 146
    .line 147
    and-int v4, p2, v5

    .line 148
    .line 149
    or-int/2addr v3, v4

    .line 150
    iput v3, v1, Ljf/h;->a:I

    .line 151
    .line 152
    iput p2, v1, Ljf/h;->f:I

    .line 153
    .line 154
    iput-object v2, v1, Ljf/h;->g:Lac/k;

    .line 155
    .line 156
    :goto_2
    invoke-static {p0, v1}, Lod/d;->d(Lud/u;Ljf/h;)Lod/d;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-virtual {p0, p2}, Lud/u;->i(Lod/d;)Lud/r;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    if-eqz p0, :cond_8

    .line 165
    .line 166
    iget-object p2, p0, Lud/r;->l:Lud/e;

    .line 167
    .line 168
    invoke-virtual {p3, p1, p2}, Li4/c0;->f(Lud/r;Lud/e;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, p0, p1}, Lb5/h;->a(Lnd/b0;Lnd/b0;)V

    .line 172
    .line 173
    .line 174
    iget-object p2, p0, Lud/r;->t:Lqd/j;

    .line 175
    .line 176
    invoke-virtual {p3, p1, p2}, Li4/c0;->e(Lud/r;Lqd/j;)V

    .line 177
    .line 178
    .line 179
    iget-object p0, p0, Lud/r;->k:Lod/d;

    .line 180
    .line 181
    iget-object p0, p0, Lod/d;->i:Ljava/util/List;

    .line 182
    .line 183
    new-instance p2, Lre/b;

    .line 184
    .line 185
    const/4 v0, 0x0

    .line 186
    invoke-direct {p2, p3, p1, v0}, Lre/b;-><init>(Li4/c0;Lud/r;I)V

    .line 187
    .line 188
    .line 189
    invoke-interface {p0, p2}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :cond_7
    invoke-virtual {p2}, Lgf/a;->a()V

    .line 194
    .line 195
    .line 196
    iget p2, p2, Lgf/a;->m:I

    .line 197
    .line 198
    iget-object v0, v2, Lac/k;->j:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v0, Lff/e;

    .line 201
    .line 202
    iget-object v0, v0, Lff/e;->d:Ljf/e;

    .line 203
    .line 204
    iget v0, v0, Ljf/e;->e:I

    .line 205
    .line 206
    mul-int/lit8 p2, p2, 0x8

    .line 207
    .line 208
    add-int/2addr p2, v0

    .line 209
    invoke-virtual {v2, p2}, Lac/k;->a(I)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2}, Lac/k;->L()I

    .line 213
    .line 214
    .line 215
    move-result p2

    .line 216
    invoke-virtual {v2}, Lac/k;->L()I

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    iget-object v1, v2, Lac/k;->i:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 223
    .line 224
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    invoke-virtual {v2, v0}, Lac/k;->y(I)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-virtual {v2, v1}, Lac/k;->v(I)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-virtual {v2, p2}, Lac/k;->y(I)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p2

    .line 240
    invoke-static {p0, p2}, Lod/a;->d(Lud/u;Ljava/lang/String;)Lod/a;

    .line 241
    .line 242
    .line 243
    move-result-object p2

    .line 244
    new-instance v2, Lod/c;

    .line 245
    .line 246
    invoke-static {v0}, Lqd/j;->z(Ljava/lang/String;)Lqd/j;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-direct {v2, p2, v1, v0}, Lod/c;-><init>(Lod/a;Ljava/lang/String;Lqd/j;)V

    .line 251
    .line 252
    .line 253
    iget-object p2, p0, Lud/u;->e:Lbe/k;

    .line 254
    .line 255
    invoke-virtual {p2, v2}, Lbe/k;->h(Lod/c;)Lod/c;

    .line 256
    .line 257
    .line 258
    move-result-object p2

    .line 259
    invoke-virtual {p0, p2}, Lud/u;->h(Lod/c;)Lud/g;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    if-eqz p0, :cond_8

    .line 264
    .line 265
    iget-object p2, p0, Lud/g;->k:Lud/e;

    .line 266
    .line 267
    invoke-virtual {p3, p1, p2}, Li4/c0;->f(Lud/r;Lud/e;)V

    .line 268
    .line 269
    .line 270
    iget-object p2, p3, Li4/c0;->e:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast p2, Lb5/h;

    .line 273
    .line 274
    invoke-virtual {p2, p0, p1}, Lb5/h;->a(Lnd/b0;Lnd/b0;)V

    .line 275
    .line 276
    .line 277
    iget-object p0, p0, Lud/g;->n:Lqd/j;

    .line 278
    .line 279
    invoke-virtual {p3, p1, p0}, Li4/c0;->e(Lud/r;Lqd/j;)V

    .line 280
    .line 281
    .line 282
    :cond_8
    :goto_3
    return-void

    .line 283
    :cond_9
    invoke-virtual {p2}, Lgf/a;->a()V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p2}, Lgf/a;->b()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    invoke-static {p0}, Lqd/j;->z(Ljava/lang/String;)Lqd/j;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    invoke-virtual {p3, p1, p0}, Li4/c0;->e(Lud/r;Lqd/j;)V

    .line 295
    .line 296
    .line 297
    return-void
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "UsageInfoVisitor"

    .line 2
    .line 3
    return-object v0
.end method

.method public final f(Lud/u;)V
    .locals 10

    .line 1
    iget-object v0, p1, Lud/u;->a:Lbc/g;

    .line 2
    .line 3
    iget-object v0, v0, Lbc/g;->l:Lbd/a;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lbd/a;->f(Lud/u;)Li4/c0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    :try_start_0
    invoke-static {v1}, Lre/c;->i(Li4/c0;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    move-exception v1

    .line 16
    sget-object v2, Lre/c;->g:Lmh/b;

    .line 17
    .line 18
    const-string v3, "Failed to apply cached usage data"

    .line 19
    .line 20
    invoke-interface {v2, v3, v1}, Lmh/b;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    new-instance v1, Li4/c0;

    .line 24
    .line 25
    invoke-direct {v1, p1}, Li4/c0;-><init>(Lud/u;)V

    .line 26
    .line 27
    .line 28
    iget-object v2, p1, Lud/u;->n:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_9

    .line 39
    .line 40
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Lud/e;

    .line 45
    .line 46
    iget-object v4, v3, Lud/e;->p:Lqd/j;

    .line 47
    .line 48
    new-instance v5, Lre/a;

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    invoke-direct {v5, v1, v3, v6}, Lre/a;-><init>(Li4/c0;Lud/e;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v4, v5}, Li4/c0;->i(Lqd/j;Ljava/util/function/Consumer;)V

    .line 55
    .line 56
    .line 57
    iget-object v4, v3, Lud/e;->q:Ljava/util/List;

    .line 58
    .line 59
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_2

    .line 68
    .line 69
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    check-cast v5, Lqd/j;

    .line 74
    .line 75
    new-instance v6, Lre/a;

    .line 76
    .line 77
    const/4 v7, 0x0

    .line 78
    invoke-direct {v6, v1, v3, v7}, Lre/a;-><init>(Li4/c0;Lud/e;I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v5, v6}, Li4/c0;->i(Lqd/j;Ljava/util/function/Consumer;)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    iget-object v4, v3, Lud/e;->r:Ljava/util/List;

    .line 86
    .line 87
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-eqz v5, :cond_3

    .line 96
    .line 97
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    check-cast v5, Lqd/j;

    .line 102
    .line 103
    new-instance v6, Lre/a;

    .line 104
    .line 105
    const/4 v7, 0x0

    .line 106
    invoke-direct {v6, v1, v3, v7}, Lre/a;-><init>(Li4/c0;Lud/e;I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v5, v6}, Li4/c0;->i(Lqd/j;Ljava/util/function/Consumer;)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_3
    iget-object v4, v3, Lud/e;->u:Ljava/util/List;

    .line 114
    .line 115
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    sget-object v6, Loc/c;->a:Loc/c;

    .line 124
    .line 125
    if-eqz v5, :cond_4

    .line 126
    .line 127
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    check-cast v5, Lud/g;

    .line 132
    .line 133
    iget-object v7, v5, Lud/g;->n:Lqd/j;

    .line 134
    .line 135
    new-instance v8, Lre/a;

    .line 136
    .line 137
    const/4 v9, 0x0

    .line 138
    invoke-direct {v8, v1, v3, v9}, Lre/a;-><init>(Li4/c0;Lud/e;I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1, v7, v8}, Li4/c0;->i(Lqd/j;Ljava/util/function/Consumer;)V

    .line 142
    .line 143
    .line 144
    iget-object v7, v5, Lmd/e;->g:Lmd/f;

    .line 145
    .line 146
    invoke-virtual {v7, v6}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    check-cast v6, Lpc/d;

    .line 151
    .line 152
    invoke-static {v5, v6, v1}, Lre/c;->k(Lnd/b0;Lpc/d;Li4/c0;)V

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_4
    iget-object v4, v3, Lmd/e;->g:Lmd/f;

    .line 157
    .line 158
    invoke-virtual {v4, v6}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    check-cast v4, Lpc/d;

    .line 163
    .line 164
    invoke-static {v3, v4, v1}, Lre/c;->k(Lnd/b0;Lpc/d;Li4/c0;)V

    .line 165
    .line 166
    .line 167
    iget-object v3, v3, Lud/e;->t:Ljava/util/List;

    .line 168
    .line 169
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    if-eqz v4, :cond_1

    .line 178
    .line 179
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    check-cast v4, Lud/r;

    .line 184
    .line 185
    iget-object v5, v4, Lmd/e;->g:Lmd/f;

    .line 186
    .line 187
    invoke-virtual {v5, v6}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    check-cast v5, Lpc/d;

    .line 192
    .line 193
    invoke-static {v4, v5, v1}, Lre/c;->k(Lnd/b0;Lpc/d;Li4/c0;)V

    .line 194
    .line 195
    .line 196
    sget-object v5, Loc/c;->g:Loc/c;

    .line 197
    .line 198
    iget-object v7, v4, Lmd/e;->g:Lmd/f;

    .line 199
    .line 200
    invoke-virtual {v7, v5}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    check-cast v5, Lpc/c;

    .line 205
    .line 206
    if-eqz v5, :cond_5

    .line 207
    .line 208
    iget-object v5, v5, Lpc/c;->g:Ljava/util/ArrayList;

    .line 209
    .line 210
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 215
    .line 216
    .line 217
    move-result v7

    .line 218
    if-eqz v7, :cond_5

    .line 219
    .line 220
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    check-cast v7, Lpc/d;

    .line 225
    .line 226
    invoke-static {v4, v7, v1}, Lre/c;->k(Lnd/b0;Lpc/d;Li4/c0;)V

    .line 227
    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_5
    iget-object v5, v4, Lud/r;->t:Lqd/j;

    .line 231
    .line 232
    invoke-virtual {v1, v4, v5}, Li4/c0;->e(Lud/r;Lqd/j;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v4}, Lud/r;->c()Ljava/util/List;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 244
    .line 245
    .line 246
    move-result v7

    .line 247
    if-eqz v7, :cond_6

    .line 248
    .line 249
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v7

    .line 253
    check-cast v7, Lqd/j;

    .line 254
    .line 255
    invoke-virtual {v1, v4, v7}, Li4/c0;->e(Lud/r;Lqd/j;)V

    .line 256
    .line 257
    .line 258
    goto :goto_5

    .line 259
    :cond_6
    :try_start_1
    iget-boolean v5, v4, Lud/r;->p:Z

    .line 260
    .line 261
    if-eqz v5, :cond_7

    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_7
    iget-object v5, v4, Lud/r;->n:La5/a;

    .line 265
    .line 266
    if-nez v5, :cond_8

    .line 267
    .line 268
    goto :goto_3

    .line 269
    :cond_8
    iget-object v7, v4, Lud/r;->l:Lud/e;

    .line 270
    .line 271
    iget-object v7, v7, Lud/e;->k:Lud/u;

    .line 272
    .line 273
    new-instance v8, Lcom/alibaba/fastjson2/reader/k;

    .line 274
    .line 275
    const/4 v9, 0x4

    .line 276
    invoke-direct {v8, v7, v4, v1, v9}, Lcom/alibaba/fastjson2/reader/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v5, v8}, La5/a;->r(Ljava/util/function/Consumer;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 280
    .line 281
    .line 282
    goto :goto_3

    .line 283
    :catch_1
    move-exception v5

    .line 284
    const-string v7, "Dependency scan failed"

    .line 285
    .line 286
    invoke-static {v4, v7, v5}, Lxe/h;->a(Lud/k;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 287
    .line 288
    .line 289
    goto :goto_3

    .line 290
    :cond_9
    invoke-interface {v0, p1, v1}, Lbd/a;->p(Lud/u;Li4/c0;)V

    .line 291
    .line 292
    .line 293
    invoke-static {v1}, Lre/c;->i(Li4/c0;)V

    .line 294
    .line 295
    .line 296
    return-void
.end method
