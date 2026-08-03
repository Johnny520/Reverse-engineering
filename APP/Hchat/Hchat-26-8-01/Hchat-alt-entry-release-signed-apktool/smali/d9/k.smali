.class public final Ld9/k;
.super Lyf/h;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public h:I

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V
    .locals 0

    .line 15
    iput p4, p0, Ld9/k;->g:I

    iput-object p1, p0, Ld9/k;->j:Ljava/lang/Object;

    iput-object p2, p0, Ld9/k;->k:Ljava/lang/Object;

    invoke-direct {p0, p3}, Lyf/h;-><init>(Lwf/c;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lwf/c;I)V
    .locals 0

    .line 14
    iput p3, p0, Ld9/k;->g:I

    iput-object p1, p0, Ld9/k;->k:Ljava/lang/Object;

    invoke-direct {p0, p2}, Lyf/h;-><init>(Lwf/c;)V

    return-void
.end method

.method public constructor <init>(Lwf/g;Lfg/p;Lwf/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ld9/k;->g:I

    .line 3
    .line 4
    iput-object p1, p0, Ld9/k;->j:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p2, Lyf/h;

    .line 7
    .line 8
    iput-object p2, p0, Ld9/k;->k:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {p0, p3}, Lyf/h;-><init>(Lwf/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 4

    .line 1
    iget v0, p0, Ld9/k;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ld9/k;

    .line 7
    .line 8
    iget-object v1, p0, Ld9/k;->k:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lfg/a;

    .line 11
    .line 12
    const/4 v2, 0x6

    .line 13
    invoke-direct {v0, v1, p2, v2}, Ld9/k;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, Ld9/k;->i:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, Ld9/k;

    .line 20
    .line 21
    iget-object v1, p0, Ld9/k;->j:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lfg/l;

    .line 24
    .line 25
    iget-object v2, p0, Ld9/k;->k:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Lfg/a;

    .line 28
    .line 29
    const/4 v3, 0x5

    .line 30
    invoke-direct {v0, v1, v2, p2, v3}, Ld9/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 31
    .line 32
    .line 33
    iput-object p1, v0, Ld9/k;->i:Ljava/lang/Object;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_1
    new-instance v0, Ld9/k;

    .line 37
    .line 38
    iget-object v1, p0, Ld9/k;->k:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lw/y0;

    .line 41
    .line 42
    const/4 v2, 0x4

    .line 43
    invoke-direct {v0, v1, p2, v2}, Ld9/k;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 44
    .line 45
    .line 46
    iput-object p1, v0, Ld9/k;->i:Ljava/lang/Object;

    .line 47
    .line 48
    return-object v0

    .line 49
    :pswitch_2
    new-instance v0, Ld9/k;

    .line 50
    .line 51
    iget-object v1, p0, Ld9/k;->j:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Ls1/l;

    .line 54
    .line 55
    iget-object v2, p0, Ld9/k;->k:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v2, Lgg/u;

    .line 58
    .line 59
    const/4 v3, 0x3

    .line 60
    invoke-direct {v0, v1, v2, p2, v3}, Ld9/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 61
    .line 62
    .line 63
    iput-object p1, v0, Ld9/k;->i:Ljava/lang/Object;

    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_3
    new-instance v0, Ld9/k;

    .line 67
    .line 68
    iget-object v1, p0, Ld9/k;->k:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, Lfg/a;

    .line 71
    .line 72
    const/4 v2, 0x2

    .line 73
    invoke-direct {v0, v1, p2, v2}, Ld9/k;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 74
    .line 75
    .line 76
    iput-object p1, v0, Ld9/k;->j:Ljava/lang/Object;

    .line 77
    .line 78
    return-object v0

    .line 79
    :pswitch_4
    new-instance v0, Ld9/k;

    .line 80
    .line 81
    iget-object v1, p0, Ld9/k;->j:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v1, Lwf/g;

    .line 84
    .line 85
    iget-object v2, p0, Ld9/k;->k:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v2, Lyf/h;

    .line 88
    .line 89
    invoke-direct {v0, v1, v2, p2}, Ld9/k;-><init>(Lwf/g;Lfg/p;Lwf/c;)V

    .line 90
    .line 91
    .line 92
    iput-object p1, v0, Ld9/k;->i:Ljava/lang/Object;

    .line 93
    .line 94
    return-object v0

    .line 95
    :pswitch_5
    new-instance v0, Ld9/k;

    .line 96
    .line 97
    iget-object v1, p0, Ld9/k;->k:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, Ljava/lang/Class;

    .line 100
    .line 101
    const/4 v2, 0x0

    .line 102
    invoke-direct {v0, v1, p2, v2}, Ld9/k;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 103
    .line 104
    .line 105
    iput-object p1, v0, Ld9/k;->i:Ljava/lang/Object;

    .line 106
    .line 107
    return-object v0

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ld9/k;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ls1/k0;

    .line 7
    .line 8
    check-cast p2, Lwf/c;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Ld9/k;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ld9/k;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Ld9/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Ls1/k0;

    .line 24
    .line 25
    check-cast p2, Lwf/c;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Ld9/k;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Ld9/k;

    .line 32
    .line 33
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Ld9/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :pswitch_1
    check-cast p1, Ls1/k0;

    .line 41
    .line 42
    check-cast p2, Lwf/c;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, Ld9/k;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Ld9/k;

    .line 49
    .line 50
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Ld9/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :pswitch_2
    check-cast p1, Ls1/k0;

    .line 58
    .line 59
    check-cast p2, Lwf/c;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, Ld9/k;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Ld9/k;

    .line 66
    .line 67
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Ld9/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :pswitch_3
    check-cast p1, Lng/l;

    .line 75
    .line 76
    check-cast p2, Lwf/c;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, Ld9/k;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Ld9/k;

    .line 83
    .line 84
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 85
    .line 86
    invoke-virtual {p1, p2}, Ld9/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    return-object p1

    .line 91
    :pswitch_4
    check-cast p1, Ls1/k0;

    .line 92
    .line 93
    check-cast p2, Lwf/c;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, Ld9/k;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, Ld9/k;

    .line 100
    .line 101
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 102
    .line 103
    invoke-virtual {p1, p2}, Ld9/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    return-object p1

    .line 108
    :pswitch_5
    check-cast p1, Lng/l;

    .line 109
    .line 110
    check-cast p2, Lwf/c;

    .line 111
    .line 112
    invoke-virtual {p0, p1, p2}, Ld9/k;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    check-cast p1, Ld9/k;

    .line 117
    .line 118
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 119
    .line 120
    invoke-virtual {p1, p2}, Ld9/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    return-object p1

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
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
    iget v0, v1, Ld9/k;->g:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ls1/k0;

    .line 11
    .line 12
    iget v2, v1, Ld9/k;->h:I

    .line 13
    .line 14
    sget-object v3, Ls1/l;->g:Ls1/l;

    .line 15
    .line 16
    const/4 v4, 0x3

    .line 17
    const/4 v5, 0x2

    .line 18
    const/4 v6, 0x1

    .line 19
    const/4 v7, 0x0

    .line 20
    sget-object v8, Lxf/a;->g:Lxf/a;

    .line 21
    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    if-eq v2, v6, :cond_2

    .line 25
    .line 26
    if-eq v2, v5, :cond_1

    .line 27
    .line 28
    if-ne v2, v4, :cond_0

    .line 29
    .line 30
    iget-object v2, v1, Ld9/k;->j:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Ls1/t;

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move-object/from16 v5, p1

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    goto/16 :goto_4

    .line 47
    .line 48
    :cond_1
    iget-object v2, v1, Ld9/k;->j:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Ls1/t;

    .line 51
    .line 52
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move-object/from16 v5, p1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object/from16 v2, p1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iput-object v0, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 68
    .line 69
    iput v6, v1, Ld9/k;->h:I

    .line 70
    .line 71
    const/4 v2, 0x0

    .line 72
    invoke-static {v0, v2, v3, v1}, Lm/y2;->a(Ls1/k0;ZLs1/l;Lwf/c;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    if-ne v2, v8, :cond_4

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_4
    :goto_0
    check-cast v2, Ls1/t;

    .line 80
    .line 81
    invoke-virtual {v0}, Ls1/k0;->B()Ly1/l2;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-interface {v6}, Ly1/l2;->b()J

    .line 86
    .line 87
    .line 88
    move-result-wide v9

    .line 89
    new-instance v6, La0/b;

    .line 90
    .line 91
    const/4 v11, 0x3

    .line 92
    invoke-direct {v6, v2, v7, v11}, La0/b;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 93
    .line 94
    .line 95
    iput-object v0, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 96
    .line 97
    iput-object v2, v1, Ld9/k;->j:Ljava/lang/Object;

    .line 98
    .line 99
    iput v5, v1, Ld9/k;->h:I

    .line 100
    .line 101
    invoke-virtual {v0, v9, v10, v6, v1}, Ls1/k0;->E(JLfg/p;Lyf/a;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    if-ne v5, v8, :cond_5

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_5
    :goto_1
    check-cast v5, Ljava/lang/Boolean;

    .line 109
    .line 110
    if-nez v5, :cond_b

    .line 111
    .line 112
    iget-object v5, v1, Ld9/k;->k:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v5, Lfg/a;

    .line 115
    .line 116
    invoke-interface {v5}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    :cond_6
    iput-object v0, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object v2, v1, Ld9/k;->j:Ljava/lang/Object;

    .line 122
    .line 123
    iput v4, v1, Ld9/k;->h:I

    .line 124
    .line 125
    invoke-virtual {v0, v3, v1}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    if-ne v5, v8, :cond_7

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_7
    :goto_2
    check-cast v5, Ls1/k;

    .line 133
    .line 134
    iget-object v5, v5, Ls1/k;->a:Ljava/lang/Object;

    .line 135
    .line 136
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    :cond_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    if-eqz v6, :cond_9

    .line 145
    .line 146
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    move-object v9, v6

    .line 151
    check-cast v9, Ls1/t;

    .line 152
    .line 153
    iget-wide v9, v9, Ls1/t;->a:J

    .line 154
    .line 155
    iget-wide v11, v2, Ls1/t;->a:J

    .line 156
    .line 157
    invoke-static {v9, v10, v11, v12}, Ls1/s;->e(JJ)Z

    .line 158
    .line 159
    .line 160
    move-result v9

    .line 161
    if-eqz v9, :cond_8

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_9
    move-object v6, v7

    .line 165
    :goto_3
    check-cast v6, Ls1/t;

    .line 166
    .line 167
    if-eqz v6, :cond_a

    .line 168
    .line 169
    invoke-virtual {v6}, Ls1/t;->a()V

    .line 170
    .line 171
    .line 172
    :cond_a
    if-eqz v6, :cond_b

    .line 173
    .line 174
    iget-boolean v5, v6, Ls1/t;->d:Z

    .line 175
    .line 176
    if-nez v5, :cond_6

    .line 177
    .line 178
    :cond_b
    sget-object v8, Lsf/n;->a:Lsf/n;

    .line 179
    .line 180
    :goto_4
    return-object v8

    .line 181
    :pswitch_0
    iget-object v0, v1, Ld9/k;->j:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v0, Lfg/l;

    .line 184
    .line 185
    iget-object v2, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v2, Ls1/k0;

    .line 188
    .line 189
    iget v3, v1, Ld9/k;->h:I

    .line 190
    .line 191
    const/4 v4, 0x2

    .line 192
    const/4 v5, 0x1

    .line 193
    sget-object v6, Lxf/a;->g:Lxf/a;

    .line 194
    .line 195
    if-eqz v3, :cond_e

    .line 196
    .line 197
    if-eq v3, v5, :cond_d

    .line 198
    .line 199
    if-ne v3, v4, :cond_c

    .line 200
    .line 201
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    move-object/from16 v2, p1

    .line 205
    .line 206
    goto :goto_6

    .line 207
    :cond_c
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 208
    .line 209
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    const/4 v6, 0x0

    .line 213
    goto :goto_7

    .line 214
    :cond_d
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_e
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    iput-object v2, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 222
    .line 223
    iput v5, v1, Ld9/k;->h:I

    .line 224
    .line 225
    invoke-static {v2, v1, v4}, Lm/y2;->b(Ls1/k0;Lwf/c;I)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    if-ne v3, v6, :cond_f

    .line 230
    .line 231
    goto :goto_7

    .line 232
    :cond_f
    :goto_5
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 233
    .line 234
    invoke-interface {v0, v3}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    const/4 v3, 0x0

    .line 238
    iput-object v3, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 239
    .line 240
    iput v4, v1, Ld9/k;->h:I

    .line 241
    .line 242
    sget-object v3, Ls1/l;->h:Ls1/l;

    .line 243
    .line 244
    invoke-static {v2, v3, v1}, Lm/y2;->i(Ls1/k0;Ls1/l;Lyf/a;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    if-ne v2, v6, :cond_10

    .line 249
    .line 250
    goto :goto_7

    .line 251
    :cond_10
    :goto_6
    check-cast v2, Ls1/t;

    .line 252
    .line 253
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 254
    .line 255
    invoke-interface {v0, v3}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    if-eqz v2, :cond_11

    .line 259
    .line 260
    iget-object v0, v1, Ld9/k;->k:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v0, Lfg/a;

    .line 263
    .line 264
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    :cond_11
    sget-object v6, Lsf/n;->a:Lsf/n;

    .line 268
    .line 269
    :goto_7
    return-object v6

    .line 270
    :pswitch_1
    iget-object v0, v1, Ld9/k;->k:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v0, Lw/y0;

    .line 273
    .line 274
    iget v2, v1, Ld9/k;->h:I

    .line 275
    .line 276
    const/4 v3, 0x2

    .line 277
    const/4 v4, 0x1

    .line 278
    sget-object v5, Lxf/a;->g:Lxf/a;

    .line 279
    .line 280
    if-eqz v2, :cond_14

    .line 281
    .line 282
    if-eq v2, v4, :cond_13

    .line 283
    .line 284
    if-ne v2, v3, :cond_12

    .line 285
    .line 286
    iget-object v2, v1, Ld9/k;->j:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v2, Ls1/t;

    .line 289
    .line 290
    iget-object v4, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v4, Ls1/k0;

    .line 293
    .line 294
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    move-object/from16 v6, p1

    .line 298
    .line 299
    goto :goto_a

    .line 300
    :cond_12
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 301
    .line 302
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    const/4 v5, 0x0

    .line 306
    goto :goto_c

    .line 307
    :cond_13
    iget-object v2, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v2, Ls1/k0;

    .line 310
    .line 311
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    move-object/from16 v4, p1

    .line 315
    .line 316
    goto :goto_8

    .line 317
    :cond_14
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    iget-object v2, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 321
    .line 322
    check-cast v2, Ls1/k0;

    .line 323
    .line 324
    iput-object v2, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 325
    .line 326
    iput v4, v1, Ld9/k;->h:I

    .line 327
    .line 328
    invoke-static {v2, v1, v3}, Lm/y2;->b(Ls1/k0;Lwf/c;I)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v4

    .line 332
    if-ne v4, v5, :cond_15

    .line 333
    .line 334
    goto :goto_c

    .line 335
    :cond_15
    :goto_8
    check-cast v4, Ls1/t;

    .line 336
    .line 337
    iget-wide v6, v4, Ls1/t;->c:J

    .line 338
    .line 339
    invoke-interface {v0}, Lw/y0;->d()V

    .line 340
    .line 341
    .line 342
    move-object/from16 v16, v4

    .line 343
    .line 344
    move-object v4, v2

    .line 345
    move-object/from16 v2, v16

    .line 346
    .line 347
    :goto_9
    iput-object v4, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 348
    .line 349
    iput-object v2, v1, Ld9/k;->j:Ljava/lang/Object;

    .line 350
    .line 351
    iput v3, v1, Ld9/k;->h:I

    .line 352
    .line 353
    sget-object v6, Ls1/l;->h:Ls1/l;

    .line 354
    .line 355
    invoke-virtual {v4, v6, v1}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v6

    .line 359
    if-ne v6, v5, :cond_16

    .line 360
    .line 361
    goto :goto_c

    .line 362
    :cond_16
    :goto_a
    check-cast v6, Ls1/k;

    .line 363
    .line 364
    iget-object v6, v6, Ls1/k;->a:Ljava/lang/Object;

    .line 365
    .line 366
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 367
    .line 368
    .line 369
    move-result v7

    .line 370
    const/4 v8, 0x0

    .line 371
    :goto_b
    if-ge v8, v7, :cond_18

    .line 372
    .line 373
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v9

    .line 377
    check-cast v9, Ls1/t;

    .line 378
    .line 379
    iget-wide v10, v9, Ls1/t;->a:J

    .line 380
    .line 381
    iget-wide v12, v2, Ls1/t;->a:J

    .line 382
    .line 383
    invoke-static {v10, v11, v12, v13}, Ls1/s;->e(JJ)Z

    .line 384
    .line 385
    .line 386
    move-result v10

    .line 387
    if-eqz v10, :cond_17

    .line 388
    .line 389
    iget-boolean v9, v9, Ls1/t;->d:Z

    .line 390
    .line 391
    if-eqz v9, :cond_17

    .line 392
    .line 393
    goto :goto_9

    .line 394
    :cond_17
    add-int/lit8 v8, v8, 0x1

    .line 395
    .line 396
    goto :goto_b

    .line 397
    :cond_18
    invoke-interface {v0}, Lw/y0;->c()V

    .line 398
    .line 399
    .line 400
    sget-object v5, Lsf/n;->a:Lsf/n;

    .line 401
    .line 402
    :goto_c
    return-object v5

    .line 403
    :pswitch_2
    iget-object v0, v1, Ld9/k;->k:Ljava/lang/Object;

    .line 404
    .line 405
    check-cast v0, Lgg/u;

    .line 406
    .line 407
    iget v2, v1, Ld9/k;->h:I

    .line 408
    .line 409
    sget-object v3, Lm/c1;->a:Lm/c1;

    .line 410
    .line 411
    const/4 v4, 0x2

    .line 412
    const/4 v5, 0x0

    .line 413
    const/4 v6, 0x1

    .line 414
    sget-object v7, Lxf/a;->g:Lxf/a;

    .line 415
    .line 416
    if-eqz v2, :cond_1b

    .line 417
    .line 418
    if-eq v2, v6, :cond_1a

    .line 419
    .line 420
    if-ne v2, v4, :cond_19

    .line 421
    .line 422
    iget-object v2, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 423
    .line 424
    check-cast v2, Ls1/k0;

    .line 425
    .line 426
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    move-object/from16 v8, p1

    .line 430
    .line 431
    goto/16 :goto_11

    .line 432
    .line 433
    :cond_19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 434
    .line 435
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    const/4 v7, 0x0

    .line 439
    goto/16 :goto_14

    .line 440
    .line 441
    :cond_1a
    iget-object v2, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v2, Ls1/k0;

    .line 444
    .line 445
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    move-object/from16 v8, p1

    .line 449
    .line 450
    goto :goto_d

    .line 451
    :cond_1b
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 452
    .line 453
    .line 454
    iget-object v2, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v2, Ls1/k0;

    .line 457
    .line 458
    :cond_1c
    iget-object v8, v1, Ld9/k;->j:Ljava/lang/Object;

    .line 459
    .line 460
    check-cast v8, Ls1/l;

    .line 461
    .line 462
    iput-object v2, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 463
    .line 464
    iput v6, v1, Ld9/k;->h:I

    .line 465
    .line 466
    invoke-virtual {v2, v8, v1}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v8

    .line 470
    if-ne v8, v7, :cond_1d

    .line 471
    .line 472
    goto/16 :goto_14

    .line 473
    .line 474
    :cond_1d
    :goto_d
    check-cast v8, Ls1/k;

    .line 475
    .line 476
    iget-object v9, v8, Ls1/k;->a:Ljava/lang/Object;

    .line 477
    .line 478
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 479
    .line 480
    .line 481
    move-result v10

    .line 482
    move v11, v5

    .line 483
    :goto_e
    if-ge v11, v10, :cond_25

    .line 484
    .line 485
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v12

    .line 489
    check-cast v12, Ls1/t;

    .line 490
    .line 491
    invoke-static {v12}, Ls1/s;->c(Ls1/t;)Z

    .line 492
    .line 493
    .line 494
    move-result v12

    .line 495
    if-nez v12, :cond_24

    .line 496
    .line 497
    iget v8, v8, Ls1/k;->c:I

    .line 498
    .line 499
    if-ne v8, v4, :cond_1e

    .line 500
    .line 501
    sget-object v2, Lm/e1;->a:Lm/e1;

    .line 502
    .line 503
    iput-object v2, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 504
    .line 505
    goto :goto_13

    .line 506
    :cond_1e
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 507
    .line 508
    .line 509
    move-result v8

    .line 510
    move v10, v5

    .line 511
    :goto_f
    if-ge v10, v8, :cond_21

    .line 512
    .line 513
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v11

    .line 517
    check-cast v11, Ls1/t;

    .line 518
    .line 519
    invoke-virtual {v11}, Ls1/t;->b()Z

    .line 520
    .line 521
    .line 522
    move-result v12

    .line 523
    if-nez v12, :cond_20

    .line 524
    .line 525
    iget-object v12, v2, Ls1/k0;->l:Ls1/l0;

    .line 526
    .line 527
    iget-wide v12, v12, Ls1/l0;->E:J

    .line 528
    .line 529
    invoke-virtual {v2}, Ls1/k0;->m()J

    .line 530
    .line 531
    .line 532
    move-result-wide v14

    .line 533
    invoke-static {v11, v12, v13, v14, v15}, Ls1/s;->f(Ls1/t;JJ)Z

    .line 534
    .line 535
    .line 536
    move-result v11

    .line 537
    if-eqz v11, :cond_1f

    .line 538
    .line 539
    goto :goto_10

    .line 540
    :cond_1f
    add-int/lit8 v10, v10, 0x1

    .line 541
    .line 542
    goto :goto_f

    .line 543
    :cond_20
    :goto_10
    iput-object v3, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 544
    .line 545
    goto :goto_13

    .line 546
    :cond_21
    iput-object v2, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 547
    .line 548
    iput v4, v1, Ld9/k;->h:I

    .line 549
    .line 550
    sget-object v8, Ls1/l;->i:Ls1/l;

    .line 551
    .line 552
    invoke-virtual {v2, v8, v1}, Ls1/k0;->e(Ls1/l;Lwf/c;)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v8

    .line 556
    if-ne v8, v7, :cond_22

    .line 557
    .line 558
    goto :goto_14

    .line 559
    :cond_22
    :goto_11
    check-cast v8, Ls1/k;

    .line 560
    .line 561
    iget-object v8, v8, Ls1/k;->a:Ljava/lang/Object;

    .line 562
    .line 563
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 564
    .line 565
    .line 566
    move-result v9

    .line 567
    move v10, v5

    .line 568
    :goto_12
    if-ge v10, v9, :cond_1c

    .line 569
    .line 570
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v11

    .line 574
    check-cast v11, Ls1/t;

    .line 575
    .line 576
    invoke-virtual {v11}, Ls1/t;->b()Z

    .line 577
    .line 578
    .line 579
    move-result v11

    .line 580
    if-eqz v11, :cond_23

    .line 581
    .line 582
    iput-object v3, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 583
    .line 584
    goto :goto_13

    .line 585
    :cond_23
    add-int/lit8 v10, v10, 0x1

    .line 586
    .line 587
    goto :goto_12

    .line 588
    :cond_24
    add-int/lit8 v11, v11, 0x1

    .line 589
    .line 590
    goto :goto_e

    .line 591
    :cond_25
    new-instance v2, Lm/d1;

    .line 592
    .line 593
    invoke-interface {v9, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v3

    .line 597
    check-cast v3, Ls1/t;

    .line 598
    .line 599
    invoke-direct {v2, v3}, Lm/d1;-><init>(Ls1/t;)V

    .line 600
    .line 601
    .line 602
    iput-object v2, v0, Lgg/u;->g:Ljava/lang/Object;

    .line 603
    .line 604
    :goto_13
    sget-object v7, Lsf/n;->a:Lsf/n;

    .line 605
    .line 606
    :goto_14
    return-object v7

    .line 607
    :pswitch_3
    iget v0, v1, Ld9/k;->h:I

    .line 608
    .line 609
    const/4 v2, 0x1

    .line 610
    if-eqz v0, :cond_27

    .line 611
    .line 612
    if-ne v0, v2, :cond_26

    .line 613
    .line 614
    iget-object v0, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 615
    .line 616
    iget-object v3, v1, Ld9/k;->j:Ljava/lang/Object;

    .line 617
    .line 618
    check-cast v3, Lng/l;

    .line 619
    .line 620
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 621
    .line 622
    .line 623
    goto :goto_15

    .line 624
    :cond_26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 625
    .line 626
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    const/4 v0, 0x0

    .line 630
    goto :goto_16

    .line 631
    :cond_27
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 632
    .line 633
    .line 634
    iget-object v0, v1, Ld9/k;->j:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast v0, Lng/l;

    .line 637
    .line 638
    move-object v3, v0

    .line 639
    :cond_28
    iget-object v0, v1, Ld9/k;->k:Ljava/lang/Object;

    .line 640
    .line 641
    check-cast v0, Lfg/a;

    .line 642
    .line 643
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    if-eqz v0, :cond_29

    .line 648
    .line 649
    iput-object v3, v1, Ld9/k;->j:Ljava/lang/Object;

    .line 650
    .line 651
    iput-object v0, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 652
    .line 653
    iput v2, v1, Ld9/k;->h:I

    .line 654
    .line 655
    invoke-virtual {v3, v0, v1}, Lng/l;->a(Ljava/lang/Object;Lwf/c;)V

    .line 656
    .line 657
    .line 658
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 659
    .line 660
    goto :goto_16

    .line 661
    :cond_29
    const/4 v0, 0x0

    .line 662
    :goto_15
    if-nez v0, :cond_28

    .line 663
    .line 664
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 665
    .line 666
    :goto_16
    return-object v0

    .line 667
    :pswitch_4
    iget-object v0, v1, Ld9/k;->j:Ljava/lang/Object;

    .line 668
    .line 669
    move-object v2, v0

    .line 670
    check-cast v2, Lwf/g;

    .line 671
    .line 672
    iget v0, v1, Ld9/k;->h:I

    .line 673
    .line 674
    sget-object v3, Ls1/l;->i:Ls1/l;

    .line 675
    .line 676
    const/4 v4, 0x3

    .line 677
    const/4 v5, 0x2

    .line 678
    const/4 v6, 0x1

    .line 679
    sget-object v7, Lxf/a;->g:Lxf/a;

    .line 680
    .line 681
    if-eqz v0, :cond_2d

    .line 682
    .line 683
    if-eq v0, v6, :cond_2c

    .line 684
    .line 685
    if-eq v0, v5, :cond_2b

    .line 686
    .line 687
    if-ne v0, v4, :cond_2a

    .line 688
    .line 689
    iget-object v0, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 690
    .line 691
    check-cast v0, Ls1/k0;

    .line 692
    .line 693
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 694
    .line 695
    .line 696
    goto :goto_17

    .line 697
    :cond_2a
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 698
    .line 699
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    const/4 v7, 0x0

    .line 703
    goto :goto_1b

    .line 704
    :cond_2b
    iget-object v0, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 705
    .line 706
    move-object v8, v0

    .line 707
    check-cast v8, Ls1/k0;

    .line 708
    .line 709
    :try_start_0
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 710
    .line 711
    .line 712
    goto :goto_18

    .line 713
    :catch_0
    move-exception v0

    .line 714
    goto :goto_1a

    .line 715
    :cond_2c
    iget-object v0, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 716
    .line 717
    move-object v8, v0

    .line 718
    check-cast v8, Ls1/k0;

    .line 719
    .line 720
    :try_start_1
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 721
    .line 722
    .line 723
    goto :goto_19

    .line 724
    :cond_2d
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 725
    .line 726
    .line 727
    iget-object v0, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 728
    .line 729
    check-cast v0, Ls1/k0;

    .line 730
    .line 731
    :goto_17
    move-object v8, v0

    .line 732
    :cond_2e
    :goto_18
    invoke-static {v2}, Lqg/v;->p(Lwf/g;)Z

    .line 733
    .line 734
    .line 735
    move-result v0

    .line 736
    if-eqz v0, :cond_31

    .line 737
    .line 738
    :try_start_2
    iget-object v0, v1, Ld9/k;->k:Ljava/lang/Object;

    .line 739
    .line 740
    check-cast v0, Lyf/h;

    .line 741
    .line 742
    iput-object v8, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 743
    .line 744
    iput v6, v1, Ld9/k;->h:I

    .line 745
    .line 746
    invoke-interface {v0, v8, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    if-ne v0, v7, :cond_2f

    .line 751
    .line 752
    goto :goto_1b

    .line 753
    :cond_2f
    :goto_19
    iput-object v8, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 754
    .line 755
    iput v5, v1, Ld9/k;->h:I

    .line 756
    .line 757
    invoke-static {v8, v3, v1}, La/a;->m(Ls1/k0;Ls1/l;Lyf/a;)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v0
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 761
    if-ne v0, v7, :cond_2e

    .line 762
    .line 763
    goto :goto_1b

    .line 764
    :goto_1a
    invoke-static {v2}, Lqg/v;->p(Lwf/g;)Z

    .line 765
    .line 766
    .line 767
    move-result v9

    .line 768
    if-eqz v9, :cond_30

    .line 769
    .line 770
    iput-object v8, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 771
    .line 772
    iput v4, v1, Ld9/k;->h:I

    .line 773
    .line 774
    invoke-static {v8, v3, v1}, La/a;->m(Ls1/k0;Ls1/l;Lyf/a;)Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    if-ne v0, v7, :cond_2e

    .line 779
    .line 780
    goto :goto_1b

    .line 781
    :cond_30
    throw v0

    .line 782
    :cond_31
    sget-object v7, Lsf/n;->a:Lsf/n;

    .line 783
    .line 784
    :goto_1b
    return-object v7

    .line 785
    :pswitch_5
    iget-object v0, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 786
    .line 787
    check-cast v0, Lng/l;

    .line 788
    .line 789
    iget v2, v1, Ld9/k;->h:I

    .line 790
    .line 791
    const/4 v3, 0x1

    .line 792
    if-eqz v2, :cond_33

    .line 793
    .line 794
    if-ne v2, v3, :cond_32

    .line 795
    .line 796
    iget-object v2, v1, Ld9/k;->j:Ljava/lang/Object;

    .line 797
    .line 798
    check-cast v2, Ljava/lang/Class;

    .line 799
    .line 800
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 801
    .line 802
    .line 803
    goto :goto_1e

    .line 804
    :cond_32
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 805
    .line 806
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 807
    .line 808
    .line 809
    const/4 v0, 0x0

    .line 810
    goto :goto_1f

    .line 811
    :cond_33
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 812
    .line 813
    .line 814
    iget-object v2, v1, Ld9/k;->k:Ljava/lang/Object;

    .line 815
    .line 816
    check-cast v2, Ljava/lang/Class;

    .line 817
    .line 818
    :goto_1c
    sget-object v4, Lsf/n;->a:Lsf/n;

    .line 819
    .line 820
    if-eqz v2, :cond_37

    .line 821
    .line 822
    const-class v5, Ljava/lang/Object;

    .line 823
    .line 824
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 825
    .line 826
    .line 827
    move-result v5

    .line 828
    if-nez v5, :cond_37

    .line 829
    .line 830
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 831
    .line 832
    .line 833
    move-result-object v5

    .line 834
    iput-object v0, v1, Ld9/k;->i:Ljava/lang/Object;

    .line 835
    .line 836
    iput-object v2, v1, Ld9/k;->j:Ljava/lang/Object;

    .line 837
    .line 838
    iput v3, v1, Ld9/k;->h:I

    .line 839
    .line 840
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 841
    .line 842
    .line 843
    sget-object v6, Lxf/a;->g:Lxf/a;

    .line 844
    .line 845
    if-eqz v5, :cond_34

    .line 846
    .line 847
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 848
    .line 849
    .line 850
    move-result v7

    .line 851
    if-eqz v7, :cond_34

    .line 852
    .line 853
    goto :goto_1d

    .line 854
    :cond_34
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 855
    .line 856
    .line 857
    move-result-object v5

    .line 858
    move-object v7, v0

    .line 859
    check-cast v7, Lng/k;

    .line 860
    .line 861
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 862
    .line 863
    .line 864
    move-result v8

    .line 865
    if-nez v8, :cond_35

    .line 866
    .line 867
    goto :goto_1d

    .line 868
    :cond_35
    iput-object v5, v7, Lng/k;->i:Ljava/util/Iterator;

    .line 869
    .line 870
    const/4 v4, 0x2

    .line 871
    iput v4, v7, Lng/k;->g:I

    .line 872
    .line 873
    iput-object v1, v7, Lng/k;->j:Lwf/c;

    .line 874
    .line 875
    move-object v4, v6

    .line 876
    :goto_1d
    if-ne v4, v6, :cond_36

    .line 877
    .line 878
    move-object v0, v6

    .line 879
    goto :goto_1f

    .line 880
    :cond_36
    :goto_1e
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 881
    .line 882
    .line 883
    move-result-object v2

    .line 884
    goto :goto_1c

    .line 885
    :cond_37
    move-object v0, v4

    .line 886
    :goto_1f
    return-object v0

    .line 887
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
