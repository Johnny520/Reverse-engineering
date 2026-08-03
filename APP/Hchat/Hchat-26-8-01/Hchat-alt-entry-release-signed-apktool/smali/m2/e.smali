.class public final Lm2/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lm2/d;


# instance fields
.field public final a:Ll3/w;

.field public final b:Lm2/a;

.field public final c:Lb/e;

.field public final d:Lm2/h;

.field public final e:Lm/a;


# direct methods
.method public constructor <init>(Ll3/w;Lm2/a;)V
    .locals 5

    .line 1
    sget-object v0, Lm2/f;->a:Lb/e;

    .line 2
    .line 3
    new-instance v1, Lm2/h;

    .line 4
    .line 5
    sget-object v2, Lm2/f;->a:Lb/e;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v2, Lm2/h;->a:Lm2/g;

    .line 11
    .line 12
    sget-object v3, Lq2/h;->a:Lrg/e;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v2, v3}, Lf8/i;->q0(Lwf/e;Lwf/g;)Lwf/g;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget-object v3, Lwf/h;->g:Lwf/h;

    .line 22
    .line 23
    invoke-interface {v2, v3}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    new-instance v3, Lqg/g1;

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    invoke-direct {v3, v4}, Lqg/t0;-><init>(Lqg/r0;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v2, v3}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v2}, Lqg/v;->a(Lwf/g;)Lvg/c;

    .line 38
    .line 39
    .line 40
    new-instance v2, Lm/a;

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    invoke-direct {v2, v3}, Lm/a;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lm2/e;->a:Ll3/w;

    .line 50
    .line 51
    iput-object p2, p0, Lm2/e;->b:Lm2/a;

    .line 52
    .line 53
    iput-object v0, p0, Lm2/e;->c:Lb/e;

    .line 54
    .line 55
    iput-object v1, p0, Lm2/e;->d:Lm2/h;

    .line 56
    .line 57
    iput-object v2, p0, Lm2/e;->e:Lm/a;

    .line 58
    .line 59
    new-instance p1, Lb0/d0;

    .line 60
    .line 61
    const/16 p2, 0x1c

    .line 62
    .line 63
    invoke-direct {p1, p0, p2}, Lb0/d0;-><init>(Ljava/lang/Object;I)V

    .line 64
    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final a(Lm2/q;)Lm2/r;
    .locals 6

    .line 1
    iget-object v0, p0, Lm2/e;->c:Lb/e;

    .line 2
    .line 3
    iget-object v1, v0, Lb/e;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ll3/w;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-object v2, v0, Lb/e;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Lf/r;

    .line 11
    .line 12
    invoke-virtual {v2, p1}, Lf/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lm2/r;

    .line 17
    .line 18
    if-eqz v2, :cond_2

    .line 19
    .line 20
    iget-boolean v3, v2, Lm2/r;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    monitor-exit v1

    .line 25
    return-object v2

    .line 26
    :cond_0
    :try_start_1
    iget-object v2, v0, Lb/e;->i:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Lf/r;

    .line 29
    .line 30
    iget-object v3, v2, Lf/r;->g:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v3, La2/a;

    .line 33
    .line 34
    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    :try_start_2
    iget-object v4, v2, Lf/r;->f:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v4, Landroidx/lifecycle/e0;

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object v4, v4, Landroidx/lifecycle/e0;->a:Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    invoke-virtual {v4, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    if-eqz v4, :cond_1

    .line 49
    .line 50
    iget v5, v2, Lf/r;->c:I

    .line 51
    .line 52
    add-int/lit8 v5, v5, -0x1

    .line 53
    .line 54
    iput v5, v2, Lf/r;->c:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    :goto_0
    :try_start_3
    monitor-exit v3

    .line 60
    check-cast v4, Lm2/r;

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :catchall_1
    move-exception p1

    .line 64
    goto/16 :goto_8

    .line 65
    .line 66
    :goto_1
    monitor-exit v3

    .line 67
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 68
    :cond_2
    :goto_2
    monitor-exit v1

    .line 69
    :try_start_4
    iget-object v1, p0, Lm2/e;->d:Lm2/h;

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v1, p1, Lm2/q;->a:Lm2/p;

    .line 75
    .line 76
    iget-object v2, p0, Lm2/e;->e:Lm/a;

    .line 77
    .line 78
    iget-object v2, v2, Lm/a;->h:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v2, Ll3/w;

    .line 81
    .line 82
    iget v3, p1, Lm2/q;->c:I

    .line 83
    .line 84
    iget-object v4, p1, Lm2/q;->b:Lm2/k;

    .line 85
    .line 86
    if-eqz v1, :cond_5

    .line 87
    .line 88
    instance-of v5, v1, Lm2/b;

    .line 89
    .line 90
    if-eqz v5, :cond_3

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_3
    instance-of v5, v1, Lm2/m;

    .line 94
    .line 95
    if-eqz v5, :cond_4

    .line 96
    .line 97
    check-cast v1, Lm2/m;

    .line 98
    .line 99
    invoke-virtual {v2, v1, v4, v3}, Ll3/w;->i(Lm2/m;Lm2/k;I)Landroid/graphics/Typeface;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    goto :goto_4

    .line 104
    :cond_4
    const/4 v1, 0x0

    .line 105
    goto :goto_5

    .line 106
    :cond_5
    :goto_3
    iget v1, v2, Ll3/w;->g:I

    .line 107
    .line 108
    packed-switch v1, :pswitch_data_0

    .line 109
    .line 110
    .line 111
    const/4 v1, 0x0

    .line 112
    invoke-static {v1, v4, v3}, Ll3/w;->h(Ljava/lang/String;Lm2/k;I)Landroid/graphics/Typeface;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    goto :goto_4

    .line 117
    :pswitch_0
    const/4 v1, 0x0

    .line 118
    invoke-static {v1, v4, v3}, Ll3/w;->g(Ljava/lang/String;Lm2/k;I)Landroid/graphics/Typeface;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    :goto_4
    new-instance v2, Lm2/r;

    .line 123
    .line 124
    invoke-direct {v2, v1}, Lm2/r;-><init>(Landroid/graphics/Typeface;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 125
    .line 126
    .line 127
    move-object v1, v2

    .line 128
    :goto_5
    if-eqz v1, :cond_7

    .line 129
    .line 130
    iget-object v2, v0, Lb/e;->h:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v2, Ll3/w;

    .line 133
    .line 134
    monitor-enter v2

    .line 135
    :try_start_5
    iget-object v3, v0, Lb/e;->i:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v3, Lf/r;

    .line 138
    .line 139
    invoke-virtual {v3, p1}, Lf/r;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    if-nez v3, :cond_6

    .line 144
    .line 145
    iget-boolean v3, v1, Lm2/r;->h:Z

    .line 146
    .line 147
    if-eqz v3, :cond_6

    .line 148
    .line 149
    iget-object v0, v0, Lb/e;->i:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v0, Lf/r;

    .line 152
    .line 153
    invoke-virtual {v0, p1, v1}, Lf/r;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 154
    .line 155
    .line 156
    goto :goto_6

    .line 157
    :catchall_2
    move-exception p1

    .line 158
    goto :goto_7

    .line 159
    :cond_6
    :goto_6
    monitor-exit v2

    .line 160
    return-object v1

    .line 161
    :goto_7
    monitor-exit v2

    .line 162
    throw p1

    .line 163
    :cond_7
    :try_start_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 164
    .line 165
    const-string v0, "Could not load font"

    .line 166
    .line 167
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw p1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 171
    :catch_0
    move-exception p1

    .line 172
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 173
    .line 174
    const-string v1, "Could not load font"

    .line 175
    .line 176
    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    throw v0

    .line 180
    :goto_8
    monitor-exit v1

    .line 181
    throw p1

    .line 182
    nop

    .line 183
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lm2/p;Lm2/k;II)Lm2/r;
    .locals 6

    .line 1
    new-instance v0, Lm2/q;

    .line 2
    .line 3
    iget-object v1, p0, Lm2/e;->b:Lm2/a;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget v1, v1, Lm2/a;->g:I

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    const v2, 0x7fffffff

    .line 13
    .line 14
    .line 15
    if-ne v1, v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget p2, p2, Lm2/k;->g:I

    .line 19
    .line 20
    add-int/2addr p2, v1

    .line 21
    const/4 v1, 0x1

    .line 22
    const/16 v2, 0x3e8

    .line 23
    .line 24
    invoke-static {p2, v1, v2}, Lr9/e0;->r(III)I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    new-instance v1, Lm2/k;

    .line 29
    .line 30
    invoke-direct {v1, p2}, Lm2/k;-><init>(I)V

    .line 31
    .line 32
    .line 33
    move-object v2, v1

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    move-object v2, p2

    .line 36
    :goto_1
    iget-object p2, p0, Lm2/e;->a:Ll3/w;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    move-object v1, p1

    .line 43
    move v3, p3

    .line 44
    move v4, p4

    .line 45
    invoke-direct/range {v0 .. v5}, Lm2/q;-><init>(Lm2/p;Lm2/k;IILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lm2/e;->a(Lm2/q;)Lm2/r;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1
.end method
