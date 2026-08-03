.class public final Lk/g1;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lgb/o;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lwf/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lk/g1;->h:I

    .line 3
    .line 4
    iput-object p1, p0, Lk/g1;->k:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lk/g1;->j:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lk/g1;->l:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Lk/g1;->m:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, Lk/g1;->n:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p6, p0, Lk/g1;->o:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p7, p0, Lk/g1;->p:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p8, p0, Lk/g1;->q:Ljava/lang/Object;

    .line 19
    .line 20
    iput-object p9, p0, Lk/g1;->r:Ljava/lang/Object;

    .line 21
    .line 22
    const/4 p1, 0x2

    .line 23
    invoke-direct {p0, p1, p10}, Lyf/i;-><init>(ILwf/c;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Li0/a1;Li0/a1;Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lwf/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lk/g1;->h:I

    .line 27
    iput-object p1, p0, Lk/g1;->k:Ljava/lang/Object;

    iput-object p2, p0, Lk/g1;->l:Ljava/lang/Object;

    iput-object p3, p0, Lk/g1;->m:Ljava/lang/Object;

    iput-object p4, p0, Lk/g1;->n:Ljava/lang/Object;

    iput-object p5, p0, Lk/g1;->o:Ljava/lang/Object;

    iput-object p6, p0, Lk/g1;->p:Ljava/lang/Object;

    iput-object p7, p0, Lk/g1;->q:Ljava/lang/Object;

    iput-object p8, p0, Lk/g1;->r:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method

.method public constructor <init>(Lk/d1;Lk/h1;Lfg/p;Ljava/lang/Object;Lwf/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lk/g1;->h:I

    .line 28
    iput-object p1, p0, Lk/g1;->q:Ljava/lang/Object;

    iput-object p2, p0, Lk/g1;->p:Ljava/lang/Object;

    check-cast p3, Lyf/i;

    iput-object p3, p0, Lk/g1;->r:Ljava/lang/Object;

    iput-object p4, p0, Lk/g1;->n:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 12

    .line 1
    iget v0, p0, Lk/g1;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, Lk/g1;

    .line 7
    .line 8
    iget-object p1, p0, Lk/g1;->k:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, p1

    .line 11
    check-cast v2, Landroid/content/Context;

    .line 12
    .line 13
    iget-object p1, p0, Lk/g1;->j:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, p1

    .line 16
    check-cast v3, Lgb/o;

    .line 17
    .line 18
    iget-object p1, p0, Lk/g1;->l:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v4, p1

    .line 21
    check-cast v4, Li0/a1;

    .line 22
    .line 23
    iget-object p1, p0, Lk/g1;->m:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v5, p1

    .line 26
    check-cast v5, Li0/a1;

    .line 27
    .line 28
    iget-object p1, p0, Lk/g1;->n:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v6, p1

    .line 31
    check-cast v6, Li0/a1;

    .line 32
    .line 33
    iget-object p1, p0, Lk/g1;->o:Ljava/lang/Object;

    .line 34
    .line 35
    move-object v7, p1

    .line 36
    check-cast v7, Li0/a1;

    .line 37
    .line 38
    iget-object p1, p0, Lk/g1;->p:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v8, p1

    .line 41
    check-cast v8, Li0/a1;

    .line 42
    .line 43
    iget-object p1, p0, Lk/g1;->q:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v9, p1

    .line 46
    check-cast v9, Li0/a1;

    .line 47
    .line 48
    iget-object p1, p0, Lk/g1;->r:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v10, p1

    .line 51
    check-cast v10, Li0/a1;

    .line 52
    .line 53
    move-object v11, p2

    .line 54
    invoke-direct/range {v1 .. v11}, Lk/g1;-><init>(Landroid/content/Context;Lgb/o;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lwf/c;)V

    .line 55
    .line 56
    .line 57
    return-object v1

    .line 58
    :pswitch_0
    move-object v11, p2

    .line 59
    new-instance v2, Lk/g1;

    .line 60
    .line 61
    iget-object p2, p0, Lk/g1;->k:Ljava/lang/Object;

    .line 62
    .line 63
    move-object v3, p2

    .line 64
    check-cast v3, Li0/a1;

    .line 65
    .line 66
    iget-object p2, p0, Lk/g1;->l:Ljava/lang/Object;

    .line 67
    .line 68
    move-object v4, p2

    .line 69
    check-cast v4, Li0/a1;

    .line 70
    .line 71
    iget-object p2, p0, Lk/g1;->m:Ljava/lang/Object;

    .line 72
    .line 73
    move-object v5, p2

    .line 74
    check-cast v5, Landroid/content/Context;

    .line 75
    .line 76
    iget-object p2, p0, Lk/g1;->n:Ljava/lang/Object;

    .line 77
    .line 78
    move-object v6, p2

    .line 79
    check-cast v6, Li0/a1;

    .line 80
    .line 81
    iget-object p2, p0, Lk/g1;->o:Ljava/lang/Object;

    .line 82
    .line 83
    move-object v7, p2

    .line 84
    check-cast v7, Li0/a1;

    .line 85
    .line 86
    iget-object p2, p0, Lk/g1;->p:Ljava/lang/Object;

    .line 87
    .line 88
    move-object v8, p2

    .line 89
    check-cast v8, Li0/a1;

    .line 90
    .line 91
    iget-object p2, p0, Lk/g1;->q:Ljava/lang/Object;

    .line 92
    .line 93
    move-object v9, p2

    .line 94
    check-cast v9, Li0/a1;

    .line 95
    .line 96
    iget-object p2, p0, Lk/g1;->r:Ljava/lang/Object;

    .line 97
    .line 98
    move-object v10, p2

    .line 99
    check-cast v10, Li0/a1;

    .line 100
    .line 101
    invoke-direct/range {v2 .. v11}, Lk/g1;-><init>(Li0/a1;Li0/a1;Landroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lwf/c;)V

    .line 102
    .line 103
    .line 104
    iput-object p1, v2, Lk/g1;->j:Ljava/lang/Object;

    .line 105
    .line 106
    return-object v2

    .line 107
    :pswitch_1
    move-object v11, p2

    .line 108
    new-instance v2, Lk/g1;

    .line 109
    .line 110
    iget-object p2, p0, Lk/g1;->q:Ljava/lang/Object;

    .line 111
    .line 112
    move-object v3, p2

    .line 113
    check-cast v3, Lk/d1;

    .line 114
    .line 115
    iget-object p2, p0, Lk/g1;->p:Ljava/lang/Object;

    .line 116
    .line 117
    move-object v4, p2

    .line 118
    check-cast v4, Lk/h1;

    .line 119
    .line 120
    iget-object p2, p0, Lk/g1;->r:Ljava/lang/Object;

    .line 121
    .line 122
    move-object v5, p2

    .line 123
    check-cast v5, Lyf/i;

    .line 124
    .line 125
    iget-object v6, p0, Lk/g1;->n:Ljava/lang/Object;

    .line 126
    .line 127
    move-object v7, v11

    .line 128
    invoke-direct/range {v2 .. v7}, Lk/g1;-><init>(Lk/d1;Lk/h1;Lfg/p;Ljava/lang/Object;Lwf/c;)V

    .line 129
    .line 130
    .line 131
    iput-object p1, v2, Lk/g1;->m:Ljava/lang/Object;

    .line 132
    .line 133
    return-object v2

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lk/g1;->h:I

    .line 2
    .line 3
    check-cast p1, Lqg/t;

    .line 4
    .line 5
    check-cast p2, Lwf/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lk/g1;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lk/g1;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lk/g1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lk/g1;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lk/g1;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lk/g1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lk/g1;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lk/g1;

    .line 41
    .line 42
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lk/g1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lk/g1;->h:I

    .line 4
    .line 5
    sget-object v2, Lsf/n;->a:Lsf/n;

    .line 6
    .line 7
    const-string v3, "\u5f53\u524d\u5fae\u4fe1\u8d26\u53f7\u5df2\u88ab\u7981\u6b62\u4e0a\u4f20\u5728\u7ebf\u63d2\u4ef6"

    .line 8
    .line 9
    const-string v4, "UPLOADER_BLACKLISTED"

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    iget-object v6, v1, Lk/g1;->r:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v7, v1, Lk/g1;->q:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v8, v1, Lk/g1;->p:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v9, v1, Lk/g1;->n:Ljava/lang/Object;

    .line 19
    .line 20
    const-string v10, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    sget-object v11, Lxf/a;->g:Lxf/a;

    .line 23
    .line 24
    const/4 v12, 0x1

    .line 25
    const/4 v13, 0x0

    .line 26
    packed-switch v0, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    iget-object v0, v1, Lk/g1;->j:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lgb/o;

    .line 32
    .line 33
    iget-object v14, v1, Lk/g1;->k:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v14, Landroid/content/Context;

    .line 36
    .line 37
    iget v15, v1, Lk/g1;->i:I

    .line 38
    .line 39
    if-eqz v15, :cond_1

    .line 40
    .line 41
    if-ne v15, v12, :cond_0

    .line 42
    .line 43
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    move-object/from16 v5, p1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-static {v10}, Lj8/o;->A(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    move-object v2, v13

    .line 53
    goto/16 :goto_6

    .line 54
    .line 55
    :cond_1
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget-object v10, Lqg/c0;->a:Lxg/e;

    .line 59
    .line 60
    sget-object v10, Lxg/d;->i:Lxg/d;

    .line 61
    .line 62
    new-instance v15, Lwb/up;

    .line 63
    .line 64
    invoke-direct {v15, v14, v0, v13, v5}, Lwb/up;-><init>(Landroid/content/Context;Lgb/o;Lwf/c;I)V

    .line 65
    .line 66
    .line 67
    iput v12, v1, Lk/g1;->i:I

    .line 68
    .line 69
    invoke-static {v10, v15, v1}, Lqg/v;->x(Lwf/g;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    if-ne v5, v11, :cond_2

    .line 74
    .line 75
    move-object v2, v11

    .line 76
    goto/16 :goto_6

    .line 77
    .line 78
    :cond_2
    :goto_0
    check-cast v5, Lsf/g;

    .line 79
    .line 80
    iget-object v5, v5, Lsf/g;->g:Ljava/lang/Object;

    .line 81
    .line 82
    iget-object v10, v1, Lk/g1;->l:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v10, Li0/a1;

    .line 85
    .line 86
    invoke-interface {v10, v13}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iget-object v10, v1, Lk/g1;->m:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v10, Li0/a1;

    .line 92
    .line 93
    check-cast v9, Li0/a1;

    .line 94
    .line 95
    iget-object v11, v1, Lk/g1;->o:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v11, Li0/a1;

    .line 98
    .line 99
    check-cast v8, Li0/a1;

    .line 100
    .line 101
    check-cast v7, Li0/a1;

    .line 102
    .line 103
    check-cast v6, Li0/a1;

    .line 104
    .line 105
    invoke-static {v5}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 106
    .line 107
    .line 108
    move-result-object v15

    .line 109
    if-nez v15, :cond_6

    .line 110
    .line 111
    check-cast v5, Lsf/n;

    .line 112
    .line 113
    invoke-interface {v10, v13}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v9, v13}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    sget-object v3, Ltf/t;->g:Ltf/t;

    .line 120
    .line 121
    invoke-interface {v11, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    invoke-interface {v8}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    check-cast v3, Ljava/util/List;

    .line 129
    .line 130
    new-instance v4, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    if-eqz v5, :cond_4

    .line 144
    .line 145
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    move-object v9, v5

    .line 150
    check-cast v9, Lgb/o;

    .line 151
    .line 152
    iget-object v9, v9, Lgb/o;->a:Ljava/lang/String;

    .line 153
    .line 154
    iget-object v10, v0, Lgb/o;->a:Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v9

    .line 160
    if-nez v9, :cond_3

    .line 161
    .line 162
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_4
    invoke-interface {v8, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    check-cast v0, Ljava/lang/Number;

    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    sub-int/2addr v0, v12

    .line 180
    const/4 v3, 0x0

    .line 181
    if-gez v0, :cond_5

    .line 182
    .line 183
    move v0, v3

    .line 184
    :cond_5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-interface {v7, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    check-cast v0, Ljava/lang/Number;

    .line 196
    .line 197
    invoke-static {v0, v12, v6}, Lp/a;->u(Ljava/lang/Number;ILi0/a1;)V

    .line 198
    .line 199
    .line 200
    const-string v0, "\u7ebf\u4e0a\u63d2\u4ef6\u5df2\u5220\u9664\uff0c\u672c\u5730\u63d2\u4ef6\u4e0d\u53d7\u5f71\u54cd"

    .line 201
    .line 202
    invoke-static {v14, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 207
    .line 208
    .line 209
    goto :goto_6

    .line 210
    :cond_6
    instance-of v0, v15, Lgb/f;

    .line 211
    .line 212
    if-eqz v0, :cond_7

    .line 213
    .line 214
    move-object v0, v15

    .line 215
    check-cast v0, Lgb/f;

    .line 216
    .line 217
    iget-object v0, v0, Lgb/f;->g:Ljava/lang/String;

    .line 218
    .line 219
    invoke-static {v0, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-eqz v0, :cond_7

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_7
    invoke-virtual {v15}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    if-eqz v0, :cond_8

    .line 231
    .line 232
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    goto :goto_2

    .line 241
    :cond_8
    move-object v0, v13

    .line 242
    :goto_2
    if-eqz v0, :cond_a

    .line 243
    .line 244
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 245
    .line 246
    .line 247
    move-result v3

    .line 248
    if-eqz v3, :cond_9

    .line 249
    .line 250
    goto :goto_3

    .line 251
    :cond_9
    move-object v3, v0

    .line 252
    goto :goto_4

    .line 253
    :cond_a
    :goto_3
    move-object v3, v13

    .line 254
    :goto_4
    if-eqz v3, :cond_b

    .line 255
    .line 256
    goto :goto_5

    .line 257
    :cond_b
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    :goto_5
    const-string v0, "\u5220\u9664\u5931\u8d25: "

    .line 266
    .line 267
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-static {v14, v0, v12}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 276
    .line 277
    .line 278
    :goto_6
    return-object v2

    .line 279
    :pswitch_0
    iget-object v0, v1, Lk/g1;->l:Ljava/lang/Object;

    .line 280
    .line 281
    move-object v5, v0

    .line 282
    check-cast v5, Li0/a1;

    .line 283
    .line 284
    iget-object v0, v1, Lk/g1;->k:Ljava/lang/Object;

    .line 285
    .line 286
    move-object v14, v0

    .line 287
    check-cast v14, Li0/a1;

    .line 288
    .line 289
    iget-object v0, v1, Lk/g1;->j:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v0, Lqg/t;

    .line 292
    .line 293
    iget v0, v1, Lk/g1;->i:I

    .line 294
    .line 295
    const-string v15, ""

    .line 296
    .line 297
    if-eqz v0, :cond_d

    .line 298
    .line 299
    if-ne v0, v12, :cond_c

    .line 300
    .line 301
    :try_start_0
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 302
    .line 303
    .line 304
    move-object/from16 v0, p1

    .line 305
    .line 306
    move-object/from16 v16, v2

    .line 307
    .line 308
    goto :goto_7

    .line 309
    :catchall_0
    move-exception v0

    .line 310
    move-object/from16 v16, v2

    .line 311
    .line 312
    goto :goto_8

    .line 313
    :cond_c
    invoke-static {v10}, Lj8/o;->A(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    move-object v2, v13

    .line 317
    goto/16 :goto_15

    .line 318
    .line 319
    :cond_d
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 323
    .line 324
    invoke-interface {v14, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    invoke-interface {v5, v15}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    iget-object v0, v1, Lk/g1;->m:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v0, Landroid/content/Context;

    .line 333
    .line 334
    :try_start_1
    sget-object v10, Lqg/c0;->a:Lxg/e;

    .line 335
    .line 336
    sget-object v10, Lxg/d;->i:Lxg/d;

    .line 337
    .line 338
    new-instance v12, Lh0/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 339
    .line 340
    move-object/from16 v16, v2

    .line 341
    .line 342
    const/4 v2, 0x5

    .line 343
    :try_start_2
    invoke-direct {v12, v0, v13, v2}, Lh0/n;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 344
    .line 345
    .line 346
    iput-object v13, v1, Lk/g1;->j:Ljava/lang/Object;

    .line 347
    .line 348
    const/4 v0, 0x1

    .line 349
    iput v0, v1, Lk/g1;->i:I

    .line 350
    .line 351
    invoke-static {v10, v12, v1}, Lqg/v;->x(Lwf/g;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    if-ne v0, v11, :cond_e

    .line 356
    .line 357
    move-object v2, v11

    .line 358
    goto/16 :goto_15

    .line 359
    .line 360
    :cond_e
    :goto_7
    check-cast v0, Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 361
    .line 362
    goto :goto_9

    .line 363
    :catchall_1
    move-exception v0

    .line 364
    :goto_8
    new-instance v2, Lsf/f;

    .line 365
    .line 366
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 367
    .line 368
    .line 369
    move-object v0, v2

    .line 370
    :goto_9
    check-cast v9, Li0/a1;

    .line 371
    .line 372
    iget-object v2, v1, Lk/g1;->o:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v2, Li0/a1;

    .line 375
    .line 376
    check-cast v8, Li0/a1;

    .line 377
    .line 378
    check-cast v7, Li0/a1;

    .line 379
    .line 380
    check-cast v6, Li0/a1;

    .line 381
    .line 382
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 383
    .line 384
    .line 385
    move-result-object v10

    .line 386
    if-nez v10, :cond_1b

    .line 387
    .line 388
    check-cast v0, Ljava/util/List;

    .line 389
    .line 390
    invoke-interface {v9, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 394
    .line 395
    .line 396
    move-result v3

    .line 397
    invoke-static {v3}, Ltf/y;->a0(I)I

    .line 398
    .line 399
    .line 400
    move-result v3

    .line 401
    const/16 v4, 0x10

    .line 402
    .line 403
    if-ge v3, v4, :cond_f

    .line 404
    .line 405
    move v3, v4

    .line 406
    :cond_f
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 407
    .line 408
    invoke-direct {v5, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 409
    .line 410
    .line 411
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 416
    .line 417
    .line 418
    move-result v9

    .line 419
    if-eqz v9, :cond_12

    .line 420
    .line 421
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v9

    .line 425
    check-cast v9, Leb/c0;

    .line 426
    .line 427
    iget-object v10, v9, Leb/c0;->a:Ljava/lang/String;

    .line 428
    .line 429
    iget-object v11, v9, Leb/c0;->h:Ljava/lang/String;

    .line 430
    .line 431
    if-eqz v11, :cond_10

    .line 432
    .line 433
    goto :goto_b

    .line 434
    :cond_10
    iget-object v11, v9, Leb/c0;->b:Ljava/lang/String;

    .line 435
    .line 436
    :goto_b
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 437
    .line 438
    .line 439
    move-result v12

    .line 440
    if-eqz v12, :cond_11

    .line 441
    .line 442
    iget-object v11, v9, Leb/c0;->a:Ljava/lang/String;

    .line 443
    .line 444
    :cond_11
    invoke-interface {v5, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    goto :goto_a

    .line 448
    :cond_12
    invoke-interface {v2, v5}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 452
    .line 453
    .line 454
    move-result v2

    .line 455
    invoke-static {v2}, Ltf/y;->a0(I)I

    .line 456
    .line 457
    .line 458
    move-result v2

    .line 459
    if-ge v2, v4, :cond_13

    .line 460
    .line 461
    goto :goto_c

    .line 462
    :cond_13
    move v4, v2

    .line 463
    :goto_c
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 464
    .line 465
    invoke-direct {v2, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 466
    .line 467
    .line 468
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 469
    .line 470
    .line 471
    move-result-object v3

    .line 472
    :goto_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 473
    .line 474
    .line 475
    move-result v4

    .line 476
    if-eqz v4, :cond_15

    .line 477
    .line 478
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v4

    .line 482
    check-cast v4, Leb/c0;

    .line 483
    .line 484
    iget-object v5, v4, Leb/c0;->a:Ljava/lang/String;

    .line 485
    .line 486
    invoke-interface {v8}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v9

    .line 490
    check-cast v9, Ljava/util/Map;

    .line 491
    .line 492
    iget-object v4, v4, Leb/c0;->a:Ljava/lang/String;

    .line 493
    .line 494
    invoke-interface {v9, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v4

    .line 498
    check-cast v4, Ljava/lang/String;

    .line 499
    .line 500
    if-nez v4, :cond_14

    .line 501
    .line 502
    move-object v4, v15

    .line 503
    :cond_14
    invoke-interface {v2, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    goto :goto_d

    .line 507
    :cond_15
    invoke-interface {v8, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    invoke-interface {v7}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    check-cast v2, Ljava/util/Map;

    .line 515
    .line 516
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 517
    .line 518
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 519
    .line 520
    .line 521
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 526
    .line 527
    .line 528
    move-result-object v2

    .line 529
    :cond_16
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 530
    .line 531
    .line 532
    move-result v4

    .line 533
    if-eqz v4, :cond_19

    .line 534
    .line 535
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v4

    .line 539
    check-cast v4, Ljava/util/Map$Entry;

    .line 540
    .line 541
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v5

    .line 545
    check-cast v5, Ljava/lang/String;

    .line 546
    .line 547
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 548
    .line 549
    .line 550
    move-result v8

    .line 551
    if-eqz v8, :cond_17

    .line 552
    .line 553
    goto :goto_e

    .line 554
    :cond_17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 555
    .line 556
    .line 557
    move-result-object v8

    .line 558
    :cond_18
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 559
    .line 560
    .line 561
    move-result v9

    .line 562
    if-eqz v9, :cond_16

    .line 563
    .line 564
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v9

    .line 568
    check-cast v9, Leb/c0;

    .line 569
    .line 570
    iget-object v9, v9, Leb/c0;->a:Ljava/lang/String;

    .line 571
    .line 572
    invoke-virtual {v9, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    move-result v9

    .line 576
    if-eqz v9, :cond_18

    .line 577
    .line 578
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v5

    .line 582
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v4

    .line 586
    invoke-virtual {v3, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    goto :goto_e

    .line 590
    :cond_19
    invoke-interface {v7, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 591
    .line 592
    .line 593
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v2

    .line 597
    check-cast v2, Ljava/util/Set;

    .line 598
    .line 599
    check-cast v2, Ljava/lang/Iterable;

    .line 600
    .line 601
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 602
    .line 603
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 604
    .line 605
    .line 606
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 611
    .line 612
    .line 613
    move-result v4

    .line 614
    if-eqz v4, :cond_1a

    .line 615
    .line 616
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v4

    .line 620
    check-cast v4, Leb/c0;

    .line 621
    .line 622
    iget-object v4, v4, Leb/c0;->a:Ljava/lang/String;

    .line 623
    .line 624
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 625
    .line 626
    .line 627
    goto :goto_f

    .line 628
    :cond_1a
    invoke-static {v2, v3}, Ltf/m;->x1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    invoke-interface {v6, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 633
    .line 634
    .line 635
    goto :goto_14

    .line 636
    :cond_1b
    instance-of v0, v10, Lgb/f;

    .line 637
    .line 638
    if-eqz v0, :cond_1c

    .line 639
    .line 640
    move-object v0, v10

    .line 641
    check-cast v0, Lgb/f;

    .line 642
    .line 643
    iget-object v0, v0, Lgb/f;->g:Ljava/lang/String;

    .line 644
    .line 645
    invoke-static {v0, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 646
    .line 647
    .line 648
    move-result v0

    .line 649
    if-eqz v0, :cond_1c

    .line 650
    .line 651
    goto :goto_13

    .line 652
    :cond_1c
    invoke-virtual {v10}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    if-eqz v0, :cond_1d

    .line 657
    .line 658
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    goto :goto_10

    .line 667
    :cond_1d
    move-object v0, v13

    .line 668
    :goto_10
    if-eqz v0, :cond_1f

    .line 669
    .line 670
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 671
    .line 672
    .line 673
    move-result v2

    .line 674
    if-eqz v2, :cond_1e

    .line 675
    .line 676
    goto :goto_11

    .line 677
    :cond_1e
    move-object v3, v0

    .line 678
    goto :goto_12

    .line 679
    :cond_1f
    :goto_11
    move-object v3, v13

    .line 680
    :goto_12
    if-eqz v3, :cond_20

    .line 681
    .line 682
    goto :goto_13

    .line 683
    :cond_20
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v3

    .line 691
    :goto_13
    invoke-interface {v5, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 692
    .line 693
    .line 694
    :goto_14
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 695
    .line 696
    invoke-interface {v14, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 697
    .line 698
    .line 699
    move-object/from16 v2, v16

    .line 700
    .line 701
    :goto_15
    return-object v2

    .line 702
    :pswitch_1
    check-cast v8, Lk/h1;

    .line 703
    .line 704
    iget v0, v1, Lk/g1;->i:I

    .line 705
    .line 706
    if-eqz v0, :cond_23

    .line 707
    .line 708
    const/4 v2, 0x1

    .line 709
    if-eq v0, v2, :cond_22

    .line 710
    .line 711
    if-ne v0, v5, :cond_21

    .line 712
    .line 713
    iget-object v0, v1, Lk/g1;->j:Ljava/lang/Object;

    .line 714
    .line 715
    move-object v2, v0

    .line 716
    check-cast v2, Lk/h1;

    .line 717
    .line 718
    iget-object v0, v1, Lk/g1;->k:Ljava/lang/Object;

    .line 719
    .line 720
    move-object v3, v0

    .line 721
    check-cast v3, Lyg/b;

    .line 722
    .line 723
    iget-object v0, v1, Lk/g1;->m:Ljava/lang/Object;

    .line 724
    .line 725
    move-object v4, v0

    .line 726
    check-cast v4, Lk/f1;

    .line 727
    .line 728
    :try_start_3
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 729
    .line 730
    .line 731
    move-object/from16 v0, p1

    .line 732
    .line 733
    goto/16 :goto_17

    .line 734
    .line 735
    :catchall_2
    move-exception v0

    .line 736
    goto/16 :goto_1a

    .line 737
    .line 738
    :cond_21
    invoke-static {v10}, Lj8/o;->A(Ljava/lang/String;)V

    .line 739
    .line 740
    .line 741
    move-object v11, v13

    .line 742
    goto/16 :goto_19

    .line 743
    .line 744
    :cond_22
    iget-object v0, v1, Lk/g1;->o:Ljava/lang/Object;

    .line 745
    .line 746
    move-object v8, v0

    .line 747
    check-cast v8, Lk/h1;

    .line 748
    .line 749
    iget-object v9, v1, Lk/g1;->l:Ljava/lang/Object;

    .line 750
    .line 751
    iget-object v0, v1, Lk/g1;->j:Ljava/lang/Object;

    .line 752
    .line 753
    check-cast v0, Lfg/p;

    .line 754
    .line 755
    iget-object v2, v1, Lk/g1;->k:Ljava/lang/Object;

    .line 756
    .line 757
    check-cast v2, Lyg/b;

    .line 758
    .line 759
    iget-object v3, v1, Lk/g1;->m:Ljava/lang/Object;

    .line 760
    .line 761
    check-cast v3, Lk/f1;

    .line 762
    .line 763
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 764
    .line 765
    .line 766
    move-object v4, v3

    .line 767
    move-object v3, v2

    .line 768
    goto :goto_16

    .line 769
    :cond_23
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 770
    .line 771
    .line 772
    iget-object v0, v1, Lk/g1;->m:Ljava/lang/Object;

    .line 773
    .line 774
    check-cast v0, Lqg/t;

    .line 775
    .line 776
    new-instance v2, Lk/f1;

    .line 777
    .line 778
    check-cast v7, Lk/d1;

    .line 779
    .line 780
    invoke-interface {v0}, Lqg/t;->n()Lwf/g;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    sget-object v3, Lqg/q;->h:Lqg/q;

    .line 785
    .line 786
    invoke-interface {v0, v3}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 787
    .line 788
    .line 789
    move-result-object v0

    .line 790
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 791
    .line 792
    .line 793
    check-cast v0, Lqg/r0;

    .line 794
    .line 795
    invoke-direct {v2, v7, v0}, Lk/f1;-><init>(Lk/d1;Lqg/r0;)V

    .line 796
    .line 797
    .line 798
    invoke-static {v8, v2}, Lk/h1;->a(Lk/h1;Lk/f1;)V

    .line 799
    .line 800
    .line 801
    iget-object v0, v8, Lk/h1;->b:Lyg/b;

    .line 802
    .line 803
    move-object v3, v6

    .line 804
    check-cast v3, Lyf/i;

    .line 805
    .line 806
    iput-object v2, v1, Lk/g1;->m:Ljava/lang/Object;

    .line 807
    .line 808
    iput-object v0, v1, Lk/g1;->k:Ljava/lang/Object;

    .line 809
    .line 810
    iput-object v3, v1, Lk/g1;->j:Ljava/lang/Object;

    .line 811
    .line 812
    iput-object v9, v1, Lk/g1;->l:Ljava/lang/Object;

    .line 813
    .line 814
    iput-object v8, v1, Lk/g1;->o:Ljava/lang/Object;

    .line 815
    .line 816
    const/4 v4, 0x1

    .line 817
    iput v4, v1, Lk/g1;->i:I

    .line 818
    .line 819
    invoke-virtual {v0, v1}, Lyg/b;->d(Lyf/c;)Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    move-result-object v4

    .line 823
    if-ne v4, v11, :cond_24

    .line 824
    .line 825
    goto :goto_19

    .line 826
    :cond_24
    move-object v4, v3

    .line 827
    move-object v3, v0

    .line 828
    move-object v0, v4

    .line 829
    move-object v4, v2

    .line 830
    :goto_16
    :try_start_4
    iput-object v4, v1, Lk/g1;->m:Ljava/lang/Object;

    .line 831
    .line 832
    iput-object v3, v1, Lk/g1;->k:Ljava/lang/Object;

    .line 833
    .line 834
    iput-object v8, v1, Lk/g1;->j:Ljava/lang/Object;

    .line 835
    .line 836
    iput-object v13, v1, Lk/g1;->l:Ljava/lang/Object;

    .line 837
    .line 838
    iput-object v13, v1, Lk/g1;->o:Ljava/lang/Object;

    .line 839
    .line 840
    iput v5, v1, Lk/g1;->i:I

    .line 841
    .line 842
    invoke-interface {v0, v9, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 843
    .line 844
    .line 845
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 846
    if-ne v0, v11, :cond_25

    .line 847
    .line 848
    goto :goto_19

    .line 849
    :cond_25
    move-object v2, v8

    .line 850
    :goto_17
    :try_start_5
    iget-object v2, v2, Lk/h1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 851
    .line 852
    :cond_26
    invoke-virtual {v2, v4, v13}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 853
    .line 854
    .line 855
    move-result v5

    .line 856
    if-eqz v5, :cond_27

    .line 857
    .line 858
    goto :goto_18

    .line 859
    :cond_27
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 863
    if-eq v5, v4, :cond_26

    .line 864
    .line 865
    :goto_18
    invoke-virtual {v3, v13}, Lyg/b;->f(Ljava/lang/Object;)V

    .line 866
    .line 867
    .line 868
    move-object v11, v0

    .line 869
    :goto_19
    return-object v11

    .line 870
    :catchall_3
    move-exception v0

    .line 871
    goto :goto_1c

    .line 872
    :catchall_4
    move-exception v0

    .line 873
    move-object v2, v8

    .line 874
    :goto_1a
    :try_start_6
    iget-object v2, v2, Lk/h1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 875
    .line 876
    :goto_1b
    invoke-virtual {v2, v4, v13}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 877
    .line 878
    .line 879
    move-result v5

    .line 880
    if-nez v5, :cond_28

    .line 881
    .line 882
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 883
    .line 884
    .line 885
    move-result-object v5

    .line 886
    if-ne v5, v4, :cond_28

    .line 887
    .line 888
    goto :goto_1b

    .line 889
    :cond_28
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 890
    :goto_1c
    invoke-virtual {v3, v13}, Lyg/b;->f(Ljava/lang/Object;)V

    .line 891
    .line 892
    .line 893
    throw v0

    .line 894
    nop

    .line 895
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
