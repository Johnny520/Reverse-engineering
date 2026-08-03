.class public final Lc0/i;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:J

.field public k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc0/j;JLd0/e;Lc0/h;Lwf/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lc0/i;->h:I

    .line 3
    .line 4
    iput-object p1, p0, Lc0/i;->k:Ljava/lang/Object;

    .line 5
    .line 6
    iput-wide p2, p0, Lc0/i;->j:J

    .line 7
    .line 8
    iput-object p4, p0, Lc0/i;->l:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p5, p0, Lc0/i;->m:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p6}, Lyf/i;-><init>(ILwf/c;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JLjava/lang/Object;Lwf/c;I)V
    .locals 0

    .line 17
    iput p6, p0, Lc0/i;->h:I

    iput-object p1, p0, Lc0/i;->l:Ljava/lang/Object;

    iput-wide p2, p0, Lc0/i;->j:J

    iput-object p4, p0, Lc0/i;->m:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;JLwf/c;I)V
    .locals 0

    .line 18
    iput p6, p0, Lc0/i;->h:I

    iput-object p1, p0, Lc0/i;->l:Ljava/lang/Object;

    iput-object p2, p0, Lc0/i;->m:Ljava/lang/Object;

    iput-wide p3, p0, Lc0/i;->j:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 9

    .line 1
    iget v0, p0, Lc0/i;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, Lc0/i;

    .line 7
    .line 8
    iget-object p1, p0, Lc0/i;->l:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, p1

    .line 11
    check-cast v2, Ls/t;

    .line 12
    .line 13
    iget-object p1, p0, Lc0/i;->m:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, p1

    .line 16
    check-cast v3, Li/y;

    .line 17
    .line 18
    iget-wide v4, p0, Lc0/i;->j:J

    .line 19
    .line 20
    const/4 v7, 0x5

    .line 21
    move-object v6, p2

    .line 22
    invoke-direct/range {v1 .. v7}, Lc0/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLwf/c;I)V

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :pswitch_0
    move-object v7, p2

    .line 27
    new-instance v2, Lc0/i;

    .line 28
    .line 29
    iget-object p2, p0, Lc0/i;->l:Ljava/lang/Object;

    .line 30
    .line 31
    move-object v3, p2

    .line 32
    check-cast v3, Lm/o2;

    .line 33
    .line 34
    iget-object p2, p0, Lc0/i;->m:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v6, p2

    .line 37
    check-cast v6, Lgg/r;

    .line 38
    .line 39
    const/4 v8, 0x4

    .line 40
    iget-wide v4, p0, Lc0/i;->j:J

    .line 41
    .line 42
    invoke-direct/range {v2 .. v8}, Lc0/i;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lwf/c;I)V

    .line 43
    .line 44
    .line 45
    iput-object p1, v2, Lc0/i;->k:Ljava/lang/Object;

    .line 46
    .line 47
    return-object v2

    .line 48
    :pswitch_1
    move-object v7, p2

    .line 49
    new-instance v2, Lc0/i;

    .line 50
    .line 51
    iget-object p1, p0, Lc0/i;->l:Ljava/lang/Object;

    .line 52
    .line 53
    move-object v3, p1

    .line 54
    check-cast v3, Lqg/r0;

    .line 55
    .line 56
    iget-object p1, p0, Lc0/i;->m:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v6, p1

    .line 59
    check-cast v6, Ln/k;

    .line 60
    .line 61
    const/4 v8, 0x3

    .line 62
    iget-wide v4, p0, Lc0/i;->j:J

    .line 63
    .line 64
    invoke-direct/range {v2 .. v8}, Lc0/i;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lwf/c;I)V

    .line 65
    .line 66
    .line 67
    return-object v2

    .line 68
    :pswitch_2
    move-object v7, p2

    .line 69
    new-instance v2, Lc0/i;

    .line 70
    .line 71
    iget-object p2, p0, Lc0/i;->l:Ljava/lang/Object;

    .line 72
    .line 73
    move-object v3, p2

    .line 74
    check-cast v3, Lh0/p;

    .line 75
    .line 76
    iget-object p2, p0, Lc0/i;->m:Ljava/lang/Object;

    .line 77
    .line 78
    move-object v4, p2

    .line 79
    check-cast v4, Ljava/lang/CharSequence;

    .line 80
    .line 81
    iget-wide v5, p0, Lc0/i;->j:J

    .line 82
    .line 83
    const/4 v8, 0x2

    .line 84
    invoke-direct/range {v2 .. v8}, Lc0/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLwf/c;I)V

    .line 85
    .line 86
    .line 87
    iput-object p1, v2, Lc0/i;->k:Ljava/lang/Object;

    .line 88
    .line 89
    return-object v2

    .line 90
    :pswitch_3
    move-object v7, p2

    .line 91
    new-instance v2, Lc0/i;

    .line 92
    .line 93
    iget-object p1, p0, Lc0/i;->l:Ljava/lang/Object;

    .line 94
    .line 95
    move-object v3, p1

    .line 96
    check-cast v3, Lci/l0;

    .line 97
    .line 98
    iget-object p1, p0, Lc0/i;->m:Ljava/lang/Object;

    .line 99
    .line 100
    move-object v6, p1

    .line 101
    check-cast v6, Ln/k;

    .line 102
    .line 103
    const/4 v8, 0x1

    .line 104
    iget-wide v4, p0, Lc0/i;->j:J

    .line 105
    .line 106
    invoke-direct/range {v2 .. v8}, Lc0/i;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lwf/c;I)V

    .line 107
    .line 108
    .line 109
    return-object v2

    .line 110
    :pswitch_4
    move-object v7, p2

    .line 111
    new-instance v2, Lc0/i;

    .line 112
    .line 113
    iget-object p1, p0, Lc0/i;->k:Ljava/lang/Object;

    .line 114
    .line 115
    move-object v3, p1

    .line 116
    check-cast v3, Lc0/j;

    .line 117
    .line 118
    iget-object p1, p0, Lc0/i;->l:Ljava/lang/Object;

    .line 119
    .line 120
    move-object v6, p1

    .line 121
    check-cast v6, Ld0/e;

    .line 122
    .line 123
    iget-object p1, p0, Lc0/i;->m:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast p1, Lc0/h;

    .line 126
    .line 127
    iget-wide v4, p0, Lc0/i;->j:J

    .line 128
    .line 129
    move-object v8, v7

    .line 130
    move-object v7, p1

    .line 131
    invoke-direct/range {v2 .. v8}, Lc0/i;-><init>(Lc0/j;JLd0/e;Lc0/h;Lwf/c;)V

    .line 132
    .line 133
    .line 134
    return-object v2

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
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
    iget v0, p0, Lc0/i;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lqg/t;

    .line 7
    .line 8
    check-cast p2, Lwf/c;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lc0/i;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lc0/i;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lc0/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Lm/m2;

    .line 24
    .line 25
    check-cast p2, Lwf/c;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lc0/i;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lc0/i;

    .line 32
    .line 33
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lc0/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lc0/i;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lc0/i;

    .line 49
    .line 50
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Lc0/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :pswitch_2
    check-cast p1, Landroid/view/textclassifier/TextClassifier;

    .line 58
    .line 59
    check-cast p2, Lwf/c;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, Lc0/i;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Lc0/i;

    .line 66
    .line 67
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Lc0/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :pswitch_3
    check-cast p1, Lqg/t;

    .line 75
    .line 76
    check-cast p2, Lwf/c;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, Lc0/i;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Lc0/i;

    .line 83
    .line 84
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 85
    .line 86
    invoke-virtual {p1, p2}, Lc0/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    return-object p1

    .line 91
    :pswitch_4
    check-cast p1, Lqg/t;

    .line 92
    .line 93
    check-cast p2, Lwf/c;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, Lc0/i;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, Lc0/i;

    .line 100
    .line 101
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 102
    .line 103
    invoke-virtual {p1, p2}, Lc0/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    return-object p1

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lc0/i;->h:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    iget-wide v2, p0, Lc0/i;->j:J

    .line 5
    .line 6
    const/4 v6, 0x0

    .line 7
    const/4 v5, 0x2

    .line 8
    sget-object v7, Lsf/n;->a:Lsf/n;

    .line 9
    .line 10
    iget-object v8, p0, Lc0/i;->m:Ljava/lang/Object;

    .line 11
    .line 12
    const-string v9, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    sget-object v10, Lxf/a;->g:Lxf/a;

    .line 15
    .line 16
    iget-object v11, p0, Lc0/i;->l:Ljava/lang/Object;

    .line 17
    .line 18
    const/4 v12, 0x1

    .line 19
    const/4 v13, 0x0

    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    check-cast v11, Ls/t;

    .line 24
    .line 25
    iget-object v0, v11, Ls/t;->m:Li/c;

    .line 26
    .line 27
    iget v1, p0, Lc0/i;->i:I

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    if-eq v1, v12, :cond_1

    .line 32
    .line 33
    if-ne v1, v5, :cond_0

    .line 34
    .line 35
    :try_start_0
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    goto/16 :goto_3

    .line 39
    .line 40
    :cond_0
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    move-object v7, v13

    .line 44
    goto/16 :goto_4

    .line 45
    .line 46
    :cond_1
    iget-object v1, p0, Lc0/i;->k:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Li/y;

    .line 49
    .line 50
    :try_start_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :try_start_2
    iget-object v1, v0, Li/c;->d:Li0/j1;

    .line 58
    .line 59
    invoke-virtual {v1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 66
    .line 67
    .line 68
    move-result v1
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 69
    check-cast v8, Li/y;

    .line 70
    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    :try_start_3
    instance-of v1, v8, Li/r0;

    .line 74
    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    check-cast v8, Li/r0;

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    sget-object v8, Ls/u;->a:Li/r0;

    .line 81
    .line 82
    :cond_4
    :goto_0
    move-object v1, v8

    .line 83
    iget-object v8, v0, Li/c;->d:Li0/j1;

    .line 84
    .line 85
    invoke-virtual {v8}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    check-cast v8, Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-nez v8, :cond_6

    .line 96
    .line 97
    new-instance v8, Lu2/j;

    .line 98
    .line 99
    invoke-direct {v8, v2, v3}, Lu2/j;-><init>(J)V

    .line 100
    .line 101
    .line 102
    iput-object v1, p0, Lc0/i;->k:Ljava/lang/Object;

    .line 103
    .line 104
    iput v12, p0, Lc0/i;->i:I

    .line 105
    .line 106
    invoke-virtual {v0, v8, p0}, Li/c;->e(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    if-ne v8, v10, :cond_5

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_5
    :goto_1
    iget-object v8, v11, Ls/t;->c:Li/e0;

    .line 114
    .line 115
    invoke-virtual {v8}, Li/e0;->invoke()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    :cond_6
    invoke-virtual {v0}, Li/c;->d()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    check-cast v0, Lu2/j;

    .line 123
    .line 124
    iget-wide v8, v0, Lu2/j;->a:J

    .line 125
    .line 126
    invoke-static {v8, v9, v2, v3}, Lu2/j;->c(JJ)J

    .line 127
    .line 128
    .line 129
    move-result-wide v2

    .line 130
    iget-object v0, v11, Ls/t;->m:Li/c;

    .line 131
    .line 132
    move-object v8, v1

    .line 133
    new-instance v1, Lu2/j;

    .line 134
    .line 135
    invoke-direct {v1, v2, v3}, Lu2/j;-><init>(J)V

    .line 136
    .line 137
    .line 138
    new-instance v9, Leb/s0;

    .line 139
    .line 140
    invoke-direct {v9, v11, v2, v3, v12}, Leb/s0;-><init>(Ljava/lang/Object;JI)V

    .line 141
    .line 142
    .line 143
    iput-object v13, p0, Lc0/i;->k:Ljava/lang/Object;

    .line 144
    .line 145
    iput v5, p0, Lc0/i;->i:I

    .line 146
    .line 147
    const/4 v5, 0x4

    .line 148
    move-object v4, p0

    .line 149
    move-object v2, v8

    .line 150
    move-object v3, v9

    .line 151
    invoke-static/range {v0 .. v5}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    if-ne v0, v10, :cond_7

    .line 156
    .line 157
    :goto_2
    move-object v7, v10

    .line 158
    goto :goto_4

    .line 159
    :cond_7
    :goto_3
    sget v0, Ls/t;->r:I

    .line 160
    .line 161
    invoke-virtual {v11, v6}, Ls/t;->d(Z)V

    .line 162
    .line 163
    .line 164
    iput-boolean v6, v11, Ls/t;->e:Z
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_0

    .line 165
    .line 166
    :catch_0
    :goto_4
    return-object v7

    .line 167
    :pswitch_0
    check-cast v11, Lm/o2;

    .line 168
    .line 169
    iget v0, p0, Lc0/i;->i:I

    .line 170
    .line 171
    if-eqz v0, :cond_9

    .line 172
    .line 173
    if-ne v0, v12, :cond_8

    .line 174
    .line 175
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_8
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    move-object v7, v13

    .line 183
    goto :goto_5

    .line 184
    :cond_9
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    iget-object v0, p0, Lc0/i;->k:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v0, Lm/m2;

    .line 190
    .line 191
    invoke-virtual {v11, v2, v3}, Lm/o2;->g(J)F

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    check-cast v8, Lgg/r;

    .line 196
    .line 197
    new-instance v3, Lb0/k;

    .line 198
    .line 199
    invoke-direct {v3, v8, v11, v0, v1}, Lb0/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 200
    .line 201
    .line 202
    iput v12, p0, Lc0/i;->i:I

    .line 203
    .line 204
    const/4 v0, 0x0

    .line 205
    move v1, v2

    .line 206
    const/4 v2, 0x0

    .line 207
    const/16 v5, 0xc

    .line 208
    .line 209
    move-object v4, p0

    .line 210
    invoke-static/range {v0 .. v5}, Li/d;->e(FFLi/l1;Lfg/p;Lyf/i;I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    if-ne v0, v10, :cond_a

    .line 215
    .line 216
    move-object v7, v10

    .line 217
    :cond_a
    :goto_5
    return-object v7

    .line 218
    :pswitch_1
    check-cast v8, Ln/k;

    .line 219
    .line 220
    iget v0, p0, Lc0/i;->i:I

    .line 221
    .line 222
    if-eqz v0, :cond_e

    .line 223
    .line 224
    if-eq v0, v12, :cond_d

    .line 225
    .line 226
    if-eq v0, v5, :cond_c

    .line 227
    .line 228
    if-ne v0, v1, :cond_b

    .line 229
    .line 230
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    goto :goto_9

    .line 234
    :cond_b
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    move-object v7, v13

    .line 238
    goto :goto_9

    .line 239
    :cond_c
    iget-object v0, p0, Lc0/i;->k:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v0, Ln/n;

    .line 242
    .line 243
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    goto :goto_7

    .line 247
    :cond_d
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    goto :goto_6

    .line 251
    :cond_e
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    check-cast v11, Lqg/r0;

    .line 255
    .line 256
    iput v12, p0, Lc0/i;->i:I

    .line 257
    .line 258
    invoke-interface {v11, p0}, Lqg/r0;->g(Lyf/c;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    if-ne v0, v10, :cond_f

    .line 263
    .line 264
    goto :goto_8

    .line 265
    :cond_f
    :goto_6
    new-instance v0, Ln/m;

    .line 266
    .line 267
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 268
    .line 269
    .line 270
    new-instance v2, Ln/n;

    .line 271
    .line 272
    invoke-direct {v2, v0}, Ln/n;-><init>(Ln/m;)V

    .line 273
    .line 274
    .line 275
    iput-object v2, p0, Lc0/i;->k:Ljava/lang/Object;

    .line 276
    .line 277
    iput v5, p0, Lc0/i;->i:I

    .line 278
    .line 279
    invoke-virtual {v8, v0, p0}, Ln/k;->a(Ln/j;Lwf/c;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    if-ne v0, v10, :cond_10

    .line 284
    .line 285
    goto :goto_8

    .line 286
    :cond_10
    move-object v0, v2

    .line 287
    :goto_7
    iput-object v13, p0, Lc0/i;->k:Ljava/lang/Object;

    .line 288
    .line 289
    iput v1, p0, Lc0/i;->i:I

    .line 290
    .line 291
    invoke-virtual {v8, v0, p0}, Ln/k;->a(Ln/j;Lwf/c;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    if-ne v0, v10, :cond_11

    .line 296
    .line 297
    :goto_8
    move-object v7, v10

    .line 298
    :cond_11
    :goto_9
    return-object v7

    .line 299
    :pswitch_2
    iget v0, p0, Lc0/i;->i:I

    .line 300
    .line 301
    if-eqz v0, :cond_13

    .line 302
    .line 303
    if-ne v0, v12, :cond_12

    .line 304
    .line 305
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    goto :goto_a

    .line 309
    :cond_12
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    move-object v7, v13

    .line 313
    goto :goto_a

    .line 314
    :cond_13
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    iget-object v0, p0, Lc0/i;->k:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v0, Landroid/view/textclassifier/TextClassifier;

    .line 320
    .line 321
    check-cast v11, Lh0/p;

    .line 322
    .line 323
    move-object v1, v8

    .line 324
    check-cast v1, Ljava/lang/CharSequence;

    .line 325
    .line 326
    iput v12, p0, Lc0/i;->i:I

    .line 327
    .line 328
    iget-wide v2, p0, Lc0/i;->j:J

    .line 329
    .line 330
    move-object v5, p0

    .line 331
    move-object v4, v0

    .line 332
    move-object v0, v11

    .line 333
    invoke-static/range {v0 .. v5}, Lh0/p;->a(Lh0/p;Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassifier;Lyf/c;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    if-ne v0, v10, :cond_14

    .line 338
    .line 339
    move-object v7, v10

    .line 340
    :cond_14
    :goto_a
    return-object v7

    .line 341
    :pswitch_3
    check-cast v11, Lci/l0;

    .line 342
    .line 343
    iget v0, p0, Lc0/i;->i:I

    .line 344
    .line 345
    if-eqz v0, :cond_16

    .line 346
    .line 347
    if-eq v0, v12, :cond_16

    .line 348
    .line 349
    if-ne v0, v5, :cond_15

    .line 350
    .line 351
    iget-object v0, p0, Lc0/i;->k:Ljava/lang/Object;

    .line 352
    .line 353
    check-cast v0, Ln/m;

    .line 354
    .line 355
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    goto :goto_b

    .line 359
    :cond_15
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    move-object v7, v13

    .line 363
    goto :goto_c

    .line 364
    :cond_16
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    new-instance v0, Ln/m;

    .line 368
    .line 369
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 370
    .line 371
    .line 372
    check-cast v8, Ln/k;

    .line 373
    .line 374
    iput-object v0, p0, Lc0/i;->k:Ljava/lang/Object;

    .line 375
    .line 376
    iput v5, p0, Lc0/i;->i:I

    .line 377
    .line 378
    invoke-virtual {v8, v0, p0}, Ln/k;->a(Ln/j;Lwf/c;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    if-ne v1, v10, :cond_17

    .line 383
    .line 384
    move-object v7, v10

    .line 385
    goto :goto_c

    .line 386
    :cond_17
    :goto_b
    iput-object v0, v11, Lci/l0;->B:Ln/m;

    .line 387
    .line 388
    :goto_c
    return-object v7

    .line 389
    :pswitch_4
    iget v0, p0, Lc0/i;->i:I

    .line 390
    .line 391
    if-eqz v0, :cond_1a

    .line 392
    .line 393
    if-eq v0, v12, :cond_19

    .line 394
    .line 395
    if-ne v0, v5, :cond_18

    .line 396
    .line 397
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    goto :goto_f

    .line 401
    :cond_18
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    move-object v7, v13

    .line 405
    goto :goto_f

    .line 406
    :cond_19
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    goto :goto_d

    .line 410
    :cond_1a
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    iget-object v0, p0, Lc0/i;->k:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v0, Lc0/j;

    .line 416
    .line 417
    iget-object v0, v0, Lc0/j;->w:Lh0/u0;

    .line 418
    .line 419
    if-eqz v0, :cond_1b

    .line 420
    .line 421
    iput v12, p0, Lc0/i;->i:I

    .line 422
    .line 423
    new-instance v1, Lh0/u0;

    .line 424
    .line 425
    iget-object v0, v0, Lh0/u0;->j:Lh0/d1;

    .line 426
    .line 427
    invoke-direct {v1, v0, p0, v6}, Lh0/u0;-><init>(Lh0/d1;Lwf/c;I)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {v1, v7}, Lh0/u0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    if-ne v0, v10, :cond_1b

    .line 435
    .line 436
    goto :goto_e

    .line 437
    :cond_1b
    :goto_d
    check-cast v11, Ld0/e;

    .line 438
    .line 439
    check-cast v8, Lc0/h;

    .line 440
    .line 441
    iput v5, p0, Lc0/i;->i:I

    .line 442
    .line 443
    invoke-interface {v11, v8, p0}, Ld0/e;->a(Ld0/d;Lyf/i;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    if-ne v0, v10, :cond_1c

    .line 448
    .line 449
    :goto_e
    move-object v7, v10

    .line 450
    :cond_1c
    :goto_f
    return-object v7

    .line 451
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
