.class public final Lwb/on;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Landroid/content/Context;

.field public final synthetic m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/ContentResolver;Landroid/net/Uri;Ly1/u2;Lsg/c;Landroid/content/Context;Lwf/c;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lwb/on;->h:I

    .line 23
    iput-object p1, p0, Lwb/on;->j:Ljava/lang/Object;

    iput-object p2, p0, Lwb/on;->k:Ljava/lang/Object;

    iput-object p3, p0, Lwb/on;->m:Ljava/lang/Object;

    iput-object p4, p0, Lwb/on;->p:Ljava/lang/Object;

    iput-object p5, p0, Lwb/on;->l:Landroid/content/Context;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Li0/a1;Li0/a1;Lqg/t;Li0/a1;Lwf/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwb/on;->h:I

    .line 3
    .line 4
    iput-object p1, p0, Lwb/on;->l:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/on;->n:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/on;->o:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/on;->j:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/on;->k:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/on;->p:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/on;->m:Ljava/lang/Object;

    .line 17
    .line 18
    const/4 p1, 0x2

    .line 19
    invoke-direct {p0, p1, p8}, Lyf/i;-><init>(ILwf/c;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Li0/a1;Li0/a1;Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lwf/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lwb/on;->h:I

    .line 24
    iput-object p1, p0, Lwb/on;->j:Ljava/lang/Object;

    iput-object p2, p0, Lwb/on;->k:Ljava/lang/Object;

    iput-object p3, p0, Lwb/on;->l:Landroid/content/Context;

    iput-object p4, p0, Lwb/on;->m:Ljava/lang/Object;

    iput-object p5, p0, Lwb/on;->n:Ljava/lang/Object;

    iput-object p6, p0, Lwb/on;->o:Ljava/lang/Object;

    iput-object p7, p0, Lwb/on;->p:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 11

    .line 1
    iget v0, p0, Lwb/on;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, Lwb/on;

    .line 7
    .line 8
    iget-object v0, p0, Lwb/on;->j:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, Landroid/content/ContentResolver;

    .line 12
    .line 13
    iget-object v0, p0, Lwb/on;->k:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, v0

    .line 16
    check-cast v3, Landroid/net/Uri;

    .line 17
    .line 18
    iget-object v0, p0, Lwb/on;->m:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v4, v0

    .line 21
    check-cast v4, Ly1/u2;

    .line 22
    .line 23
    iget-object v0, p0, Lwb/on;->p:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v5, v0

    .line 26
    check-cast v5, Lsg/c;

    .line 27
    .line 28
    iget-object v6, p0, Lwb/on;->l:Landroid/content/Context;

    .line 29
    .line 30
    move-object v7, p2

    .line 31
    invoke-direct/range {v1 .. v7}, Lwb/on;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;Ly1/u2;Lsg/c;Landroid/content/Context;Lwf/c;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, v1, Lwb/on;->o:Ljava/lang/Object;

    .line 35
    .line 36
    return-object v1

    .line 37
    :pswitch_0
    move-object v10, p2

    .line 38
    new-instance v2, Lwb/on;

    .line 39
    .line 40
    iget-object p1, p0, Lwb/on;->j:Ljava/lang/Object;

    .line 41
    .line 42
    move-object v3, p1

    .line 43
    check-cast v3, Li0/a1;

    .line 44
    .line 45
    iget-object p1, p0, Lwb/on;->k:Ljava/lang/Object;

    .line 46
    .line 47
    move-object v4, p1

    .line 48
    check-cast v4, Li0/a1;

    .line 49
    .line 50
    iget-object p1, p0, Lwb/on;->m:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v6, p1

    .line 53
    check-cast v6, Li0/a1;

    .line 54
    .line 55
    iget-object p1, p0, Lwb/on;->n:Ljava/lang/Object;

    .line 56
    .line 57
    move-object v7, p1

    .line 58
    check-cast v7, Li0/a1;

    .line 59
    .line 60
    iget-object p1, p0, Lwb/on;->o:Ljava/lang/Object;

    .line 61
    .line 62
    move-object v8, p1

    .line 63
    check-cast v8, Li0/a1;

    .line 64
    .line 65
    iget-object p1, p0, Lwb/on;->p:Ljava/lang/Object;

    .line 66
    .line 67
    move-object v9, p1

    .line 68
    check-cast v9, Li0/a1;

    .line 69
    .line 70
    iget-object v5, p0, Lwb/on;->l:Landroid/content/Context;

    .line 71
    .line 72
    invoke-direct/range {v2 .. v10}, Lwb/on;-><init>(Li0/a1;Li0/a1;Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lwf/c;)V

    .line 73
    .line 74
    .line 75
    return-object v2

    .line 76
    :pswitch_1
    move-object v10, p2

    .line 77
    new-instance v2, Lwb/on;

    .line 78
    .line 79
    iget-object p1, p0, Lwb/on;->n:Ljava/lang/Object;

    .line 80
    .line 81
    move-object v4, p1

    .line 82
    check-cast v4, Ljava/lang/String;

    .line 83
    .line 84
    iget-object p1, p0, Lwb/on;->o:Ljava/lang/Object;

    .line 85
    .line 86
    move-object v5, p1

    .line 87
    check-cast v5, Ljava/lang/String;

    .line 88
    .line 89
    iget-object p1, p0, Lwb/on;->j:Ljava/lang/Object;

    .line 90
    .line 91
    move-object v6, p1

    .line 92
    check-cast v6, Li0/a1;

    .line 93
    .line 94
    iget-object p1, p0, Lwb/on;->k:Ljava/lang/Object;

    .line 95
    .line 96
    move-object v7, p1

    .line 97
    check-cast v7, Li0/a1;

    .line 98
    .line 99
    iget-object p1, p0, Lwb/on;->p:Ljava/lang/Object;

    .line 100
    .line 101
    move-object v8, p1

    .line 102
    check-cast v8, Lqg/t;

    .line 103
    .line 104
    iget-object p1, p0, Lwb/on;->m:Ljava/lang/Object;

    .line 105
    .line 106
    move-object v9, p1

    .line 107
    check-cast v9, Li0/a1;

    .line 108
    .line 109
    iget-object v3, p0, Lwb/on;->l:Landroid/content/Context;

    .line 110
    .line 111
    invoke-direct/range {v2 .. v10}, Lwb/on;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Li0/a1;Li0/a1;Lqg/t;Li0/a1;Lwf/c;)V

    .line 112
    .line 113
    .line 114
    return-object v2

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lwb/on;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ltg/e;

    .line 7
    .line 8
    check-cast p2, Lwf/c;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lwb/on;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lwb/on;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lwb/on;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Lqg/t;

    .line 24
    .line 25
    check-cast p2, Lwf/c;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lwb/on;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lwb/on;

    .line 32
    .line 33
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lwb/on;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :pswitch_1
    check-cast p1, Lqg/t;

    .line 41
    .line 42
    check-cast p2, Lwf/c;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, Lwb/on;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lwb/on;

    .line 49
    .line 50
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Lwb/on;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lwb/on;->h:I

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    iget-object v3, v1, Lwb/on;->l:Landroid/content/Context;

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    sget-object v5, Lsf/n;->a:Lsf/n;

    .line 11
    .line 12
    iget-object v6, v1, Lwb/on;->p:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    iget-object v8, v1, Lwb/on;->k:Ljava/lang/Object;

    .line 16
    .line 17
    const-string v9, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    sget-object v10, Lxf/a;->g:Lxf/a;

    .line 20
    .line 21
    iget-object v11, v1, Lwb/on;->j:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v12, v1, Lwb/on;->m:Ljava/lang/Object;

    .line 24
    .line 25
    const/4 v13, 0x0

    .line 26
    const/4 v14, 0x1

    .line 27
    packed-switch v0, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    check-cast v12, Ly1/u2;

    .line 31
    .line 32
    check-cast v11, Landroid/content/ContentResolver;

    .line 33
    .line 34
    iget v0, v1, Lwb/on;->i:I

    .line 35
    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    if-eq v0, v14, :cond_2

    .line 39
    .line 40
    if-ne v0, v4, :cond_1

    .line 41
    .line 42
    iget-object v0, v1, Lwb/on;->n:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lsg/b;

    .line 45
    .line 46
    iget-object v2, v1, Lwb/on;->o:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Ltg/e;

    .line 49
    .line 50
    :try_start_0
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    :cond_0
    move-object/from16 v21, v2

    .line 54
    .line 55
    move-object v2, v0

    .line 56
    move-object/from16 v0, v21

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    goto :goto_4

    .line 61
    :cond_1
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    move-object v5, v13

    .line 65
    goto :goto_3

    .line 66
    :cond_2
    iget-object v0, v1, Lwb/on;->n:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Lsg/b;

    .line 69
    .line 70
    iget-object v2, v1, Lwb/on;->o:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, Ltg/e;

    .line 73
    .line 74
    :try_start_1
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    .line 76
    .line 77
    move-object/from16 v6, p1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object v0, v1, Lwb/on;->o:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Ltg/e;

    .line 86
    .line 87
    check-cast v8, Landroid/net/Uri;

    .line 88
    .line 89
    invoke-virtual {v11, v8, v7, v12}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 90
    .line 91
    .line 92
    :try_start_2
    check-cast v6, Lsg/c;

    .line 93
    .line 94
    new-instance v2, Lsg/b;

    .line 95
    .line 96
    invoke-direct {v2, v6}, Lsg/b;-><init>(Lsg/c;)V

    .line 97
    .line 98
    .line 99
    :goto_0
    iput-object v0, v1, Lwb/on;->o:Ljava/lang/Object;

    .line 100
    .line 101
    iput-object v2, v1, Lwb/on;->n:Ljava/lang/Object;

    .line 102
    .line 103
    iput v14, v1, Lwb/on;->i:I

    .line 104
    .line 105
    invoke-virtual {v2, v1}, Lsg/b;->b(Lyf/c;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    if-ne v6, v10, :cond_4

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_4
    move-object/from16 v21, v2

    .line 113
    .line 114
    move-object v2, v0

    .line 115
    move-object/from16 v0, v21

    .line 116
    .line 117
    :goto_1
    check-cast v6, Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    if-eqz v6, :cond_5

    .line 124
    .line 125
    invoke-virtual {v0}, Lsg/b;->c()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    sget-object v6, Ly1/v2;->a:Lf/k0;

    .line 129
    .line 130
    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    const-string v7, "animator_duration_scale"

    .line 135
    .line 136
    const/high16 v8, 0x3f800000    # 1.0f

    .line 137
    .line 138
    invoke-static {v6, v7, v8}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    new-instance v7, Ljava/lang/Float;

    .line 143
    .line 144
    invoke-direct {v7, v6}, Ljava/lang/Float;-><init>(F)V

    .line 145
    .line 146
    .line 147
    iput-object v2, v1, Lwb/on;->o:Ljava/lang/Object;

    .line 148
    .line 149
    iput-object v0, v1, Lwb/on;->n:Ljava/lang/Object;

    .line 150
    .line 151
    iput v4, v1, Lwb/on;->i:I

    .line 152
    .line 153
    invoke-interface {v2, v7, v1}, Ltg/e;->e(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 157
    if-ne v6, v10, :cond_0

    .line 158
    .line 159
    :goto_2
    move-object v5, v10

    .line 160
    goto :goto_3

    .line 161
    :cond_5
    invoke-virtual {v11, v12}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 162
    .line 163
    .line 164
    :goto_3
    return-object v5

    .line 165
    :goto_4
    invoke-virtual {v11, v12}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 166
    .line 167
    .line 168
    throw v0

    .line 169
    :pswitch_0
    check-cast v8, Li0/a1;

    .line 170
    .line 171
    check-cast v11, Li0/a1;

    .line 172
    .line 173
    iget v0, v1, Lwb/on;->i:I

    .line 174
    .line 175
    const/16 v19, 0x0

    .line 176
    .line 177
    if-eqz v0, :cond_8

    .line 178
    .line 179
    if-eq v0, v14, :cond_7

    .line 180
    .line 181
    if-ne v0, v4, :cond_6

    .line 182
    .line 183
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    move-object/from16 v0, p1

    .line 187
    .line 188
    goto :goto_7

    .line 189
    :cond_6
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    move-object v5, v13

    .line 193
    goto/16 :goto_c

    .line 194
    .line 195
    :cond_7
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_8
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    iput v14, v1, Lwb/on;->i:I

    .line 203
    .line 204
    const-wide/16 v13, 0xfa

    .line 205
    .line 206
    invoke-static {v13, v14, v1}, Lqg/v;->f(JLwf/c;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    if-ne v0, v10, :cond_9

    .line 211
    .line 212
    goto :goto_6

    .line 213
    :cond_9
    :goto_5
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 214
    .line 215
    invoke-interface {v11, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    invoke-interface {v8, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    sget-object v0, Lqg/c0;->a:Lxg/e;

    .line 222
    .line 223
    sget-object v0, Lxg/d;->i:Lxg/d;

    .line 224
    .line 225
    new-instance v15, Lw/u0;

    .line 226
    .line 227
    move-object/from16 v17, v12

    .line 228
    .line 229
    check-cast v17, Li0/a1;

    .line 230
    .line 231
    iget-object v2, v1, Lwb/on;->n:Ljava/lang/Object;

    .line 232
    .line 233
    move-object/from16 v18, v2

    .line 234
    .line 235
    check-cast v18, Li0/a1;

    .line 236
    .line 237
    const/16 v20, 0x5

    .line 238
    .line 239
    iget-object v2, v1, Lwb/on;->l:Landroid/content/Context;

    .line 240
    .line 241
    move-object/from16 v16, v2

    .line 242
    .line 243
    invoke-direct/range {v15 .. v20}, Lw/u0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 244
    .line 245
    .line 246
    iput v4, v1, Lwb/on;->i:I

    .line 247
    .line 248
    invoke-static {v0, v15, v1}, Lqg/v;->x(Lwf/g;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    if-ne v0, v10, :cond_a

    .line 253
    .line 254
    :goto_6
    move-object v5, v10

    .line 255
    goto/16 :goto_c

    .line 256
    .line 257
    :cond_a
    :goto_7
    check-cast v0, Lsf/g;

    .line 258
    .line 259
    iget-object v0, v0, Lsf/g;->g:Ljava/lang/Object;

    .line 260
    .line 261
    iget-object v2, v1, Lwb/on;->o:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v2, Li0/a1;

    .line 264
    .line 265
    check-cast v6, Li0/a1;

    .line 266
    .line 267
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    if-nez v3, :cond_b

    .line 272
    .line 273
    check-cast v0, Lgb/n;

    .line 274
    .line 275
    iget-object v3, v0, Lgb/n;->a:Ljava/util/List;

    .line 276
    .line 277
    invoke-interface {v2, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    iget v0, v0, Lgb/n;->b:I

    .line 281
    .line 282
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-interface {v6, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    goto :goto_b

    .line 290
    :cond_b
    instance-of v0, v3, Lgb/f;

    .line 291
    .line 292
    if-eqz v0, :cond_c

    .line 293
    .line 294
    move-object v0, v3

    .line 295
    check-cast v0, Lgb/f;

    .line 296
    .line 297
    iget-object v0, v0, Lgb/f;->g:Ljava/lang/String;

    .line 298
    .line 299
    const-string v4, "UPLOADER_BLACKLISTED"

    .line 300
    .line 301
    invoke-static {v0, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    if-eqz v0, :cond_c

    .line 306
    .line 307
    const-string v0, "\u5f53\u524d\u5fae\u4fe1\u8d26\u53f7\u5df2\u88ab\u7981\u6b62\u4e0a\u4f20\u5728\u7ebf\u63d2\u4ef6"

    .line 308
    .line 309
    goto :goto_a

    .line 310
    :cond_c
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    if-eqz v0, :cond_d

    .line 315
    .line 316
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    goto :goto_8

    .line 325
    :cond_d
    move-object/from16 v0, v19

    .line 326
    .line 327
    :goto_8
    if-eqz v0, :cond_f

    .line 328
    .line 329
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 330
    .line 331
    .line 332
    move-result v4

    .line 333
    if-eqz v4, :cond_e

    .line 334
    .line 335
    goto :goto_9

    .line 336
    :cond_e
    move-object/from16 v19, v0

    .line 337
    .line 338
    :cond_f
    :goto_9
    if-eqz v19, :cond_10

    .line 339
    .line 340
    move-object/from16 v0, v19

    .line 341
    .line 342
    goto :goto_a

    .line 343
    :cond_10
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    :goto_a
    invoke-interface {v8, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    check-cast v0, Ljava/util/List;

    .line 359
    .line 360
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    if-eqz v0, :cond_11

    .line 365
    .line 366
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-interface {v6, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    :cond_11
    :goto_b
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 374
    .line 375
    invoke-interface {v11, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    :goto_c
    return-object v5

    .line 379
    :pswitch_1
    check-cast v12, Li0/a1;

    .line 380
    .line 381
    check-cast v6, Lqg/t;

    .line 382
    .line 383
    check-cast v8, Li0/a1;

    .line 384
    .line 385
    check-cast v11, Li0/a1;

    .line 386
    .line 387
    iget v0, v1, Lwb/on;->i:I

    .line 388
    .line 389
    if-eqz v0, :cond_13

    .line 390
    .line 391
    if-ne v0, v14, :cond_12

    .line 392
    .line 393
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    move-object/from16 v0, p1

    .line 397
    .line 398
    goto :goto_d

    .line 399
    :cond_12
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    move-object v5, v13

    .line 403
    goto :goto_e

    .line 404
    :cond_13
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    sget-object v0, Lqg/c0;->a:Lxg/e;

    .line 408
    .line 409
    sget-object v0, Lxg/d;->i:Lxg/d;

    .line 410
    .line 411
    new-instance v4, Lwb/ln;

    .line 412
    .line 413
    iget-object v9, v1, Lwb/on;->n:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v9, Ljava/lang/String;

    .line 416
    .line 417
    iget-object v15, v1, Lwb/on;->o:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v15, Ljava/lang/String;

    .line 420
    .line 421
    invoke-direct {v4, v9, v15, v13, v14}, Lwb/ln;-><init>(Ljava/lang/String;Ljava/lang/String;Lwf/c;I)V

    .line 422
    .line 423
    .line 424
    iput v14, v1, Lwb/on;->i:I

    .line 425
    .line 426
    invoke-static {v0, v4, v1}, Lqg/v;->x(Lwf/g;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    if-ne v0, v10, :cond_14

    .line 431
    .line 432
    move-object v5, v10

    .line 433
    goto :goto_e

    .line 434
    :cond_14
    :goto_d
    check-cast v0, Lsf/g;

    .line 435
    .line 436
    iget-object v0, v0, Lsf/g;->g:Ljava/lang/Object;

    .line 437
    .line 438
    instance-of v4, v0, Lsf/f;

    .line 439
    .line 440
    if-nez v4, :cond_15

    .line 441
    .line 442
    move-object v4, v0

    .line 443
    check-cast v4, Ljava/lang/String;

    .line 444
    .line 445
    sget-object v9, Lwb/ho;->a:Log/k;

    .line 446
    .line 447
    invoke-interface {v11, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    invoke-interface {v8, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    invoke-static {v6, v11, v12, v8, v7}, Lwb/ho;->s(Lqg/t;Li0/a1;Li0/a1;Li0/a1;Z)V

    .line 454
    .line 455
    .line 456
    :cond_15
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    if-eqz v0, :cond_16

    .line 461
    .line 462
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    const-string v4, "\u53d1\u9001\u77ed\u4fe1\u9a8c\u8bc1\u7801\u5931\u8d25: "

    .line 467
    .line 468
    invoke-static {v4, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    sget-object v4, Lwb/ho;->a:Log/k;

    .line 473
    .line 474
    invoke-interface {v11, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    invoke-interface {v8, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    invoke-static {v6, v11, v12, v8, v7}, Lwb/ho;->s(Lqg/t;Li0/a1;Li0/a1;Li0/a1;Z)V

    .line 481
    .line 482
    .line 483
    :cond_16
    sget-object v0, Lwb/ho;->a:Log/k;

    .line 484
    .line 485
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    check-cast v0, Ljava/lang/String;

    .line 490
    .line 491
    invoke-static {v3, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 496
    .line 497
    .line 498
    :goto_e
    return-object v5

    .line 499
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
