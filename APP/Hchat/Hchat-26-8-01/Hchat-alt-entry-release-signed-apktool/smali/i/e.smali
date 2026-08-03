.class public final Li/e;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:Ljava/lang/Object;

.field public j:I

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Li/n0;Lfg/l;Lwf/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Li/e;->h:I

    .line 19
    iput-object p1, p0, Li/e;->n:Ljava/lang/Object;

    check-cast p2, Lyf/i;

    iput-object p2, p0, Li/e;->o:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method

.method public constructor <init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lwf/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput v0, p0, Li/e;->h:I

    .line 3
    .line 4
    iput-object p1, p0, Li/e;->n:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Li/e;->o:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Li/e;->k:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Li/e;->l:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, Li/e;->m:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-direct {p0, p1, p6}, Lyf/i;-><init>(ILwf/c;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Lk/h1;Lfg/l;Lwf/c;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Li/e;->h:I

    .line 20
    iput-object p1, p0, Li/e;->n:Ljava/lang/Object;

    check-cast p2, Lyf/i;

    iput-object p2, p0, Li/e;->o:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method

.method public constructor <init>(Ls1/x;Lfg/l;Lfg/l;Lfg/q;Lfg/l;Lwf/c;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Li/e;->h:I

    .line 21
    iput-object p1, p0, Li/e;->k:Ljava/lang/Object;

    iput-object p2, p0, Li/e;->l:Ljava/lang/Object;

    iput-object p3, p0, Li/e;->m:Ljava/lang/Object;

    iput-object p4, p0, Li/e;->n:Ljava/lang/Object;

    iput-object p5, p0, Li/e;->o:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method

.method public constructor <init>(Lsg/g;Li/c;Li0/a1;Li0/a1;Lwf/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li/e;->h:I

    .line 22
    iput-object p1, p0, Li/e;->l:Ljava/lang/Object;

    iput-object p2, p0, Li/e;->m:Ljava/lang/Object;

    iput-object p3, p0, Li/e;->n:Ljava/lang/Object;

    iput-object p4, p0, Li/e;->o:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 9

    .line 1
    iget v0, p0, Li/e;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v1, Li/e;

    .line 7
    .line 8
    iget-object v0, p0, Li/e;->n:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, Li0/a1;

    .line 12
    .line 13
    iget-object v0, p0, Li/e;->o:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v3, v0

    .line 16
    check-cast v3, Li0/a1;

    .line 17
    .line 18
    iget-object v0, p0, Li/e;->k:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v4, v0

    .line 21
    check-cast v4, Li0/a1;

    .line 22
    .line 23
    iget-object v0, p0, Li/e;->l:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v5, v0

    .line 26
    check-cast v5, Li0/a1;

    .line 27
    .line 28
    iget-object v0, p0, Li/e;->m:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v6, v0

    .line 31
    check-cast v6, Li0/a1;

    .line 32
    .line 33
    move-object v7, p2

    .line 34
    invoke-direct/range {v1 .. v7}, Li/e;-><init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lwf/c;)V

    .line 35
    .line 36
    .line 37
    iput-object p1, v1, Li/e;->i:Ljava/lang/Object;

    .line 38
    .line 39
    return-object v1

    .line 40
    :pswitch_0
    move-object v7, p2

    .line 41
    new-instance v2, Li/e;

    .line 42
    .line 43
    iget-object p2, p0, Li/e;->k:Ljava/lang/Object;

    .line 44
    .line 45
    move-object v3, p2

    .line 46
    check-cast v3, Ls1/x;

    .line 47
    .line 48
    iget-object p2, p0, Li/e;->l:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v4, p2

    .line 51
    check-cast v4, Lfg/l;

    .line 52
    .line 53
    iget-object p2, p0, Li/e;->m:Ljava/lang/Object;

    .line 54
    .line 55
    move-object v5, p2

    .line 56
    check-cast v5, Lfg/l;

    .line 57
    .line 58
    iget-object p2, p0, Li/e;->n:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v6, p2

    .line 61
    check-cast v6, Lfg/q;

    .line 62
    .line 63
    iget-object p2, p0, Li/e;->o:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p2, Lfg/l;

    .line 66
    .line 67
    move-object v8, v7

    .line 68
    move-object v7, p2

    .line 69
    invoke-direct/range {v2 .. v8}, Li/e;-><init>(Ls1/x;Lfg/l;Lfg/l;Lfg/q;Lfg/l;Lwf/c;)V

    .line 70
    .line 71
    .line 72
    iput-object p1, v2, Li/e;->i:Ljava/lang/Object;

    .line 73
    .line 74
    return-object v2

    .line 75
    :pswitch_1
    move-object v7, p2

    .line 76
    new-instance p2, Li/e;

    .line 77
    .line 78
    iget-object v0, p0, Li/e;->n:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Lk/h1;

    .line 81
    .line 82
    iget-object v1, p0, Li/e;->o:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v1, Lyf/i;

    .line 85
    .line 86
    invoke-direct {p2, v0, v1, v7}, Li/e;-><init>(Lk/h1;Lfg/l;Lwf/c;)V

    .line 87
    .line 88
    .line 89
    iput-object p1, p2, Li/e;->m:Ljava/lang/Object;

    .line 90
    .line 91
    return-object p2

    .line 92
    :pswitch_2
    move-object v7, p2

    .line 93
    new-instance p2, Li/e;

    .line 94
    .line 95
    iget-object v0, p0, Li/e;->n:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, Li/n0;

    .line 98
    .line 99
    iget-object v1, p0, Li/e;->o:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v1, Lyf/i;

    .line 102
    .line 103
    invoke-direct {p2, v0, v1, v7}, Li/e;-><init>(Li/n0;Lfg/l;Lwf/c;)V

    .line 104
    .line 105
    .line 106
    iput-object p1, p2, Li/e;->m:Ljava/lang/Object;

    .line 107
    .line 108
    return-object p2

    .line 109
    :pswitch_3
    move-object v7, p2

    .line 110
    new-instance v2, Li/e;

    .line 111
    .line 112
    iget-object p2, p0, Li/e;->l:Ljava/lang/Object;

    .line 113
    .line 114
    move-object v3, p2

    .line 115
    check-cast v3, Lsg/g;

    .line 116
    .line 117
    iget-object p2, p0, Li/e;->m:Ljava/lang/Object;

    .line 118
    .line 119
    move-object v4, p2

    .line 120
    check-cast v4, Li/c;

    .line 121
    .line 122
    iget-object p2, p0, Li/e;->n:Ljava/lang/Object;

    .line 123
    .line 124
    move-object v5, p2

    .line 125
    check-cast v5, Li0/a1;

    .line 126
    .line 127
    iget-object p2, p0, Li/e;->o:Ljava/lang/Object;

    .line 128
    .line 129
    move-object v6, p2

    .line 130
    check-cast v6, Li0/a1;

    .line 131
    .line 132
    invoke-direct/range {v2 .. v7}, Li/e;-><init>(Lsg/g;Li/c;Li0/a1;Li0/a1;Lwf/c;)V

    .line 133
    .line 134
    .line 135
    iput-object p1, v2, Li/e;->i:Ljava/lang/Object;

    .line 136
    .line 137
    return-object v2

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Li/e;->h:I

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
    invoke-virtual {p0, p1, p2}, Li/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Li/e;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Li/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Li/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Li/e;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Li/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Li/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Li/e;

    .line 41
    .line 42
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Li/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, Li/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Li/e;

    .line 54
    .line 55
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Li/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, Li/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Li/e;

    .line 67
    .line 68
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Li/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Li/e;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li/e;->i:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Lqg/t;

    .line 10
    .line 11
    iget v0, p0, Li/e;->j:I

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    if-ne v0, v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_1
    :goto_0
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_2
    iget-object p1, p0, Li/e;->n:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Li0/a1;

    .line 33
    .line 34
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_8

    .line 45
    .line 46
    iget-object p1, p0, Li/e;->o:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Li0/a1;

    .line 49
    .line 50
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_8

    .line 61
    .line 62
    iget-object p1, p0, Li/e;->k:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, Li0/a1;

    .line 65
    .line 66
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, Landroid/media/MediaPlayer;

    .line 71
    .line 72
    if-eqz p1, :cond_7

    .line 73
    .line 74
    iget-object v0, p0, Li/e;->l:Ljava/lang/Object;

    .line 75
    .line 76
    move-object v3, v0

    .line 77
    check-cast v3, Li0/a1;

    .line 78
    .line 79
    iget-object v0, p0, Li/e;->m:Ljava/lang/Object;

    .line 80
    .line 81
    move-object v4, v0

    .line 82
    check-cast v4, Li0/a1;

    .line 83
    .line 84
    const/4 v5, 0x0

    .line 85
    :try_start_0
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-gez v0, :cond_3

    .line 90
    .line 91
    move v0, v5

    .line 92
    :cond_3
    new-instance v6, Ljava/lang/Integer;

    .line 93
    .line 94
    invoke-direct {v6, v0}, Ljava/lang/Integer;-><init>(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :catchall_0
    move-exception v0

    .line 99
    new-instance v6, Lsf/f;

    .line 100
    .line 101
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    :goto_1
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, Ljava/lang/Number;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    new-instance v7, Ljava/lang/Integer;

    .line 115
    .line 116
    invoke-direct {v7, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 117
    .line 118
    .line 119
    instance-of v0, v6, Lsf/f;

    .line 120
    .line 121
    if-eqz v0, :cond_4

    .line 122
    .line 123
    move-object v6, v7

    .line 124
    :cond_4
    check-cast v6, Ljava/lang/Number;

    .line 125
    .line 126
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-interface {v3, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    :try_start_1
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getDuration()I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-gez p1, :cond_5

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_5
    move v5, p1

    .line 145
    :goto_2
    new-instance p1, Ljava/lang/Integer;

    .line 146
    .line 147
    invoke-direct {p1, v5}, Ljava/lang/Integer;-><init>(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :catchall_1
    move-exception v0

    .line 152
    move-object p1, v0

    .line 153
    new-instance v0, Lsf/f;

    .line 154
    .line 155
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 156
    .line 157
    .line 158
    move-object p1, v0

    .line 159
    :goto_3
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    check-cast v0, Ljava/lang/Number;

    .line 164
    .line 165
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    new-instance v3, Ljava/lang/Integer;

    .line 170
    .line 171
    invoke-direct {v3, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 172
    .line 173
    .line 174
    instance-of v0, p1, Lsf/f;

    .line 175
    .line 176
    if-eqz v0, :cond_6

    .line 177
    .line 178
    move-object p1, v3

    .line 179
    :cond_6
    check-cast p1, Ljava/lang/Number;

    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-interface {v4, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    :cond_7
    iput-object v1, p0, Li/e;->i:Ljava/lang/Object;

    .line 193
    .line 194
    iput v2, p0, Li/e;->j:I

    .line 195
    .line 196
    const-wide/16 v3, 0xfa

    .line 197
    .line 198
    invoke-static {v3, v4, p0}, Lqg/v;->f(JLwf/c;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 203
    .line 204
    if-ne p1, v0, :cond_2

    .line 205
    .line 206
    move-object p1, v0

    .line 207
    goto :goto_4

    .line 208
    :cond_8
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 209
    .line 210
    :goto_4
    return-object p1

    .line 211
    :pswitch_0
    iget-object v0, p0, Li/e;->k:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v0, Ls1/x;

    .line 214
    .line 215
    iget v1, p0, Li/e;->j:I

    .line 216
    .line 217
    const/4 v2, 0x1

    .line 218
    if-eqz v1, :cond_a

    .line 219
    .line 220
    if-ne v1, v2, :cond_9

    .line 221
    .line 222
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_9
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 227
    .line 228
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    const/4 p1, 0x0

    .line 232
    goto :goto_6

    .line 233
    :cond_a
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    iget-object p1, p0, Li/e;->i:Ljava/lang/Object;

    .line 237
    .line 238
    move-object v4, p1

    .line 239
    check-cast v4, Lqg/t;

    .line 240
    .line 241
    new-instance v5, Lm/t1;

    .line 242
    .line 243
    invoke-direct {v5, v0}, Lm/t1;-><init>(Lu2/c;)V

    .line 244
    .line 245
    .line 246
    new-instance v3, Lm/t2;

    .line 247
    .line 248
    iget-object p1, p0, Li/e;->l:Ljava/lang/Object;

    .line 249
    .line 250
    move-object v6, p1

    .line 251
    check-cast v6, Lfg/l;

    .line 252
    .line 253
    iget-object p1, p0, Li/e;->m:Ljava/lang/Object;

    .line 254
    .line 255
    move-object v7, p1

    .line 256
    check-cast v7, Lfg/l;

    .line 257
    .line 258
    iget-object p1, p0, Li/e;->n:Ljava/lang/Object;

    .line 259
    .line 260
    move-object v8, p1

    .line 261
    check-cast v8, Lfg/q;

    .line 262
    .line 263
    iget-object p1, p0, Li/e;->o:Ljava/lang/Object;

    .line 264
    .line 265
    move-object v9, p1

    .line 266
    check-cast v9, Lfg/l;

    .line 267
    .line 268
    const/4 v10, 0x0

    .line 269
    invoke-direct/range {v3 .. v10}, Lm/t2;-><init>(Lqg/t;Lm/t1;Lfg/l;Lfg/l;Lfg/q;Lfg/l;Lwf/c;)V

    .line 270
    .line 271
    .line 272
    iput v2, p0, Li/e;->j:I

    .line 273
    .line 274
    invoke-static {v0, v3, p0}, La/a;->n(Ls1/x;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 279
    .line 280
    if-ne p1, v0, :cond_b

    .line 281
    .line 282
    move-object p1, v0

    .line 283
    goto :goto_6

    .line 284
    :cond_b
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 285
    .line 286
    :goto_6
    return-object p1

    .line 287
    :pswitch_1
    iget-object v0, p0, Li/e;->n:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v0, Lk/h1;

    .line 290
    .line 291
    iget v1, p0, Li/e;->j:I

    .line 292
    .line 293
    const/4 v2, 0x2

    .line 294
    const/4 v3, 0x1

    .line 295
    const/4 v4, 0x0

    .line 296
    sget-object v5, Lxf/a;->g:Lxf/a;

    .line 297
    .line 298
    if-eqz v1, :cond_e

    .line 299
    .line 300
    if-eq v1, v3, :cond_d

    .line 301
    .line 302
    if-ne v1, v2, :cond_c

    .line 303
    .line 304
    iget-object v0, p0, Li/e;->i:Ljava/lang/Object;

    .line 305
    .line 306
    move-object v1, v0

    .line 307
    check-cast v1, Lk/h1;

    .line 308
    .line 309
    iget-object v0, p0, Li/e;->k:Ljava/lang/Object;

    .line 310
    .line 311
    move-object v2, v0

    .line 312
    check-cast v2, Lyg/b;

    .line 313
    .line 314
    iget-object v0, p0, Li/e;->m:Ljava/lang/Object;

    .line 315
    .line 316
    move-object v3, v0

    .line 317
    check-cast v3, Lk/f1;

    .line 318
    .line 319
    :try_start_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 320
    .line 321
    .line 322
    goto/16 :goto_9

    .line 323
    .line 324
    :catchall_2
    move-exception v0

    .line 325
    move-object p1, v0

    .line 326
    goto/16 :goto_c

    .line 327
    .line 328
    :cond_c
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 329
    .line 330
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    const/4 v5, 0x0

    .line 334
    goto/16 :goto_b

    .line 335
    .line 336
    :cond_d
    iget-object v0, p0, Li/e;->l:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v0, Lk/h1;

    .line 339
    .line 340
    iget-object v1, p0, Li/e;->i:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v1, Lfg/l;

    .line 343
    .line 344
    iget-object v3, p0, Li/e;->k:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v3, Lyg/b;

    .line 347
    .line 348
    iget-object v6, p0, Li/e;->m:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v6, Lk/f1;

    .line 351
    .line 352
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    :goto_7
    move-object p1, v0

    .line 356
    goto :goto_8

    .line 357
    :cond_e
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    iget-object p1, p0, Li/e;->m:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast p1, Lqg/t;

    .line 363
    .line 364
    new-instance v1, Lk/f1;

    .line 365
    .line 366
    invoke-interface {p1}, Lqg/t;->n()Lwf/g;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    sget-object v6, Lqg/q;->h:Lqg/q;

    .line 371
    .line 372
    invoke-interface {p1, v6}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    check-cast p1, Lqg/r0;

    .line 380
    .line 381
    sget-object v6, Lk/d1;->g:Lk/d1;

    .line 382
    .line 383
    invoke-direct {v1, v6, p1}, Lk/f1;-><init>(Lk/d1;Lqg/r0;)V

    .line 384
    .line 385
    .line 386
    invoke-static {v0, v1}, Lk/h1;->a(Lk/h1;Lk/f1;)V

    .line 387
    .line 388
    .line 389
    iget-object p1, v0, Lk/h1;->b:Lyg/b;

    .line 390
    .line 391
    iget-object v6, p0, Li/e;->o:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast v6, Lyf/i;

    .line 394
    .line 395
    iput-object v1, p0, Li/e;->m:Ljava/lang/Object;

    .line 396
    .line 397
    iput-object p1, p0, Li/e;->k:Ljava/lang/Object;

    .line 398
    .line 399
    iput-object v6, p0, Li/e;->i:Ljava/lang/Object;

    .line 400
    .line 401
    iput-object v0, p0, Li/e;->l:Ljava/lang/Object;

    .line 402
    .line 403
    iput v3, p0, Li/e;->j:I

    .line 404
    .line 405
    invoke-virtual {p1, p0}, Lyg/b;->d(Lyf/c;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    if-ne v3, v5, :cond_f

    .line 410
    .line 411
    goto :goto_b

    .line 412
    :cond_f
    move-object v3, v6

    .line 413
    move-object v6, v1

    .line 414
    move-object v1, v3

    .line 415
    move-object v3, p1

    .line 416
    goto :goto_7

    .line 417
    :goto_8
    :try_start_3
    iput-object v6, p0, Li/e;->m:Ljava/lang/Object;

    .line 418
    .line 419
    iput-object v3, p0, Li/e;->k:Ljava/lang/Object;

    .line 420
    .line 421
    iput-object p1, p0, Li/e;->i:Ljava/lang/Object;

    .line 422
    .line 423
    iput-object v4, p0, Li/e;->l:Ljava/lang/Object;

    .line 424
    .line 425
    iput v2, p0, Li/e;->j:I

    .line 426
    .line 427
    invoke-interface {v1, p0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 431
    if-ne v0, v5, :cond_10

    .line 432
    .line 433
    goto :goto_b

    .line 434
    :cond_10
    move-object v1, p1

    .line 435
    move-object p1, v0

    .line 436
    move-object v2, v3

    .line 437
    move-object v3, v6

    .line 438
    :goto_9
    :try_start_4
    iget-object v0, v1, Lk/h1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 439
    .line 440
    :cond_11
    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v1

    .line 444
    if-eqz v1, :cond_12

    .line 445
    .line 446
    goto :goto_a

    .line 447
    :cond_12
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 451
    if-eq v1, v3, :cond_11

    .line 452
    .line 453
    :goto_a
    invoke-virtual {v2, v4}, Lyg/b;->f(Ljava/lang/Object;)V

    .line 454
    .line 455
    .line 456
    move-object v5, p1

    .line 457
    :goto_b
    return-object v5

    .line 458
    :catchall_3
    move-exception v0

    .line 459
    move-object p1, v0

    .line 460
    goto :goto_e

    .line 461
    :catchall_4
    move-exception v0

    .line 462
    move-object v1, p1

    .line 463
    move-object p1, v0

    .line 464
    move-object v2, v3

    .line 465
    move-object v3, v6

    .line 466
    :goto_c
    :try_start_5
    iget-object v0, v1, Lk/h1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 467
    .line 468
    :goto_d
    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v1

    .line 472
    if-nez v1, :cond_13

    .line 473
    .line 474
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    if-ne v1, v3, :cond_13

    .line 479
    .line 480
    goto :goto_d

    .line 481
    :cond_13
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 482
    :goto_e
    invoke-virtual {v2, v4}, Lyg/b;->f(Ljava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    throw p1

    .line 486
    :pswitch_2
    iget-object v0, p0, Li/e;->n:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast v0, Li/n0;

    .line 489
    .line 490
    iget v1, p0, Li/e;->j:I

    .line 491
    .line 492
    const/4 v2, 0x2

    .line 493
    const/4 v3, 0x1

    .line 494
    const/4 v4, 0x0

    .line 495
    sget-object v5, Lxf/a;->g:Lxf/a;

    .line 496
    .line 497
    if-eqz v1, :cond_16

    .line 498
    .line 499
    if-eq v1, v3, :cond_15

    .line 500
    .line 501
    if-ne v1, v2, :cond_14

    .line 502
    .line 503
    iget-object v0, p0, Li/e;->i:Ljava/lang/Object;

    .line 504
    .line 505
    move-object v1, v0

    .line 506
    check-cast v1, Li/n0;

    .line 507
    .line 508
    iget-object v0, p0, Li/e;->k:Ljava/lang/Object;

    .line 509
    .line 510
    move-object v2, v0

    .line 511
    check-cast v2, Lyg/b;

    .line 512
    .line 513
    iget-object v0, p0, Li/e;->m:Ljava/lang/Object;

    .line 514
    .line 515
    move-object v3, v0

    .line 516
    check-cast v3, Li/m0;

    .line 517
    .line 518
    :try_start_6
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 519
    .line 520
    .line 521
    goto/16 :goto_13

    .line 522
    .line 523
    :catchall_5
    move-exception v0

    .line 524
    move-object p1, v0

    .line 525
    goto/16 :goto_16

    .line 526
    .line 527
    :cond_14
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 528
    .line 529
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    const/4 v5, 0x0

    .line 533
    goto/16 :goto_15

    .line 534
    .line 535
    :cond_15
    iget-object v0, p0, Li/e;->l:Ljava/lang/Object;

    .line 536
    .line 537
    check-cast v0, Li/n0;

    .line 538
    .line 539
    iget-object v1, p0, Li/e;->i:Ljava/lang/Object;

    .line 540
    .line 541
    check-cast v1, Lfg/l;

    .line 542
    .line 543
    iget-object v3, p0, Li/e;->k:Ljava/lang/Object;

    .line 544
    .line 545
    check-cast v3, Lyg/b;

    .line 546
    .line 547
    iget-object v6, p0, Li/e;->m:Ljava/lang/Object;

    .line 548
    .line 549
    check-cast v6, Li/m0;

    .line 550
    .line 551
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    :goto_f
    move-object p1, v0

    .line 555
    goto :goto_12

    .line 556
    :cond_16
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    iget-object p1, p0, Li/e;->m:Ljava/lang/Object;

    .line 560
    .line 561
    check-cast p1, Lqg/t;

    .line 562
    .line 563
    new-instance v1, Li/m0;

    .line 564
    .line 565
    invoke-interface {p1}, Lqg/t;->n()Lwf/g;

    .line 566
    .line 567
    .line 568
    move-result-object p1

    .line 569
    sget-object v6, Lqg/q;->h:Lqg/q;

    .line 570
    .line 571
    invoke-interface {p1, v6}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 572
    .line 573
    .line 574
    move-result-object p1

    .line 575
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    check-cast p1, Lqg/r0;

    .line 579
    .line 580
    invoke-direct {v1, p1}, Li/m0;-><init>(Lqg/r0;)V

    .line 581
    .line 582
    .line 583
    iget-object v6, v0, Li/n0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 584
    .line 585
    :goto_10
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object p1

    .line 589
    move-object v7, p1

    .line 590
    check-cast v7, Li/m0;

    .line 591
    .line 592
    if-eqz v7, :cond_18

    .line 593
    .line 594
    sget-object p1, Li/k0;->g:Li/k0;

    .line 595
    .line 596
    invoke-virtual {p1, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 597
    .line 598
    .line 599
    move-result p1

    .line 600
    if-ltz p1, :cond_17

    .line 601
    .line 602
    goto :goto_11

    .line 603
    :cond_17
    new-instance p1, Ljava/util/concurrent/CancellationException;

    .line 604
    .line 605
    const-string v0, "Current mutation had a higher priority"

    .line 606
    .line 607
    invoke-direct {p1, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    throw p1

    .line 611
    :cond_18
    :goto_11
    invoke-virtual {v6, v7, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 612
    .line 613
    .line 614
    move-result p1

    .line 615
    if-eqz p1, :cond_1f

    .line 616
    .line 617
    if-eqz v7, :cond_19

    .line 618
    .line 619
    iget-object p1, v7, Li/m0;->a:Lqg/r0;

    .line 620
    .line 621
    new-instance v6, Li/l0;

    .line 622
    .line 623
    const-string v7, "Mutation interrupted"

    .line 624
    .line 625
    const/4 v8, 0x0

    .line 626
    invoke-direct {v6, v7, v8}, Li/l0;-><init>(Ljava/lang/String;I)V

    .line 627
    .line 628
    .line 629
    invoke-interface {p1, v6}, Lqg/r0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 630
    .line 631
    .line 632
    :cond_19
    iget-object p1, v0, Li/n0;->b:Lyg/b;

    .line 633
    .line 634
    iget-object v6, p0, Li/e;->o:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast v6, Lyf/i;

    .line 637
    .line 638
    iput-object v1, p0, Li/e;->m:Ljava/lang/Object;

    .line 639
    .line 640
    iput-object p1, p0, Li/e;->k:Ljava/lang/Object;

    .line 641
    .line 642
    iput-object v6, p0, Li/e;->i:Ljava/lang/Object;

    .line 643
    .line 644
    iput-object v0, p0, Li/e;->l:Ljava/lang/Object;

    .line 645
    .line 646
    iput v3, p0, Li/e;->j:I

    .line 647
    .line 648
    invoke-virtual {p1, p0}, Lyg/b;->d(Lyf/c;)Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v3

    .line 652
    if-ne v3, v5, :cond_1a

    .line 653
    .line 654
    goto :goto_15

    .line 655
    :cond_1a
    move-object v3, v6

    .line 656
    move-object v6, v1

    .line 657
    move-object v1, v3

    .line 658
    move-object v3, p1

    .line 659
    goto :goto_f

    .line 660
    :goto_12
    :try_start_7
    iput-object v6, p0, Li/e;->m:Ljava/lang/Object;

    .line 661
    .line 662
    iput-object v3, p0, Li/e;->k:Ljava/lang/Object;

    .line 663
    .line 664
    iput-object p1, p0, Li/e;->i:Ljava/lang/Object;

    .line 665
    .line 666
    iput-object v4, p0, Li/e;->l:Ljava/lang/Object;

    .line 667
    .line 668
    iput v2, p0, Li/e;->j:I

    .line 669
    .line 670
    invoke-interface {v1, p0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 674
    if-ne v0, v5, :cond_1b

    .line 675
    .line 676
    goto :goto_15

    .line 677
    :cond_1b
    move-object v1, p1

    .line 678
    move-object p1, v0

    .line 679
    move-object v2, v3

    .line 680
    move-object v3, v6

    .line 681
    :goto_13
    :try_start_8
    iget-object v0, v1, Li/n0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 682
    .line 683
    :cond_1c
    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 684
    .line 685
    .line 686
    move-result v1

    .line 687
    if-eqz v1, :cond_1d

    .line 688
    .line 689
    goto :goto_14

    .line 690
    :cond_1d
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 694
    if-eq v1, v3, :cond_1c

    .line 695
    .line 696
    :goto_14
    invoke-virtual {v2, v4}, Lyg/b;->f(Ljava/lang/Object;)V

    .line 697
    .line 698
    .line 699
    move-object v5, p1

    .line 700
    :goto_15
    return-object v5

    .line 701
    :catchall_6
    move-exception v0

    .line 702
    move-object p1, v0

    .line 703
    goto :goto_18

    .line 704
    :catchall_7
    move-exception v0

    .line 705
    move-object v1, p1

    .line 706
    move-object p1, v0

    .line 707
    move-object v2, v3

    .line 708
    move-object v3, v6

    .line 709
    :goto_16
    :try_start_9
    iget-object v0, v1, Li/n0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 710
    .line 711
    :goto_17
    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 712
    .line 713
    .line 714
    move-result v1

    .line 715
    if-nez v1, :cond_1e

    .line 716
    .line 717
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v1

    .line 721
    if-ne v1, v3, :cond_1e

    .line 722
    .line 723
    goto :goto_17

    .line 724
    :cond_1e
    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 725
    :goto_18
    invoke-virtual {v2, v4}, Lyg/b;->f(Ljava/lang/Object;)V

    .line 726
    .line 727
    .line 728
    throw p1

    .line 729
    :cond_1f
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object p1

    .line 733
    if-eq p1, v7, :cond_18

    .line 734
    .line 735
    goto/16 :goto_10

    .line 736
    .line 737
    :pswitch_3
    iget-object v0, p0, Li/e;->l:Ljava/lang/Object;

    .line 738
    .line 739
    check-cast v0, Lsg/g;

    .line 740
    .line 741
    iget v1, p0, Li/e;->j:I

    .line 742
    .line 743
    const/4 v2, 0x1

    .line 744
    if-eqz v1, :cond_21

    .line 745
    .line 746
    if-ne v1, v2, :cond_20

    .line 747
    .line 748
    iget-object v1, p0, Li/e;->k:Ljava/lang/Object;

    .line 749
    .line 750
    check-cast v1, Lsg/b;

    .line 751
    .line 752
    iget-object v3, p0, Li/e;->i:Ljava/lang/Object;

    .line 753
    .line 754
    check-cast v3, Lqg/t;

    .line 755
    .line 756
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 757
    .line 758
    .line 759
    goto :goto_1a

    .line 760
    :cond_20
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 761
    .line 762
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 763
    .line 764
    .line 765
    const/4 p1, 0x0

    .line 766
    goto :goto_1d

    .line 767
    :cond_21
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 768
    .line 769
    .line 770
    iget-object p1, p0, Li/e;->i:Ljava/lang/Object;

    .line 771
    .line 772
    check-cast p1, Lqg/t;

    .line 773
    .line 774
    invoke-interface {v0}, Lsg/g;->iterator()Lsg/b;

    .line 775
    .line 776
    .line 777
    move-result-object v1

    .line 778
    move-object v3, p1

    .line 779
    :goto_19
    iput-object v3, p0, Li/e;->i:Ljava/lang/Object;

    .line 780
    .line 781
    iput-object v1, p0, Li/e;->k:Ljava/lang/Object;

    .line 782
    .line 783
    iput v2, p0, Li/e;->j:I

    .line 784
    .line 785
    invoke-virtual {v1, p0}, Lsg/b;->b(Lyf/c;)Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    move-result-object p1

    .line 789
    sget-object v4, Lxf/a;->g:Lxf/a;

    .line 790
    .line 791
    if-ne p1, v4, :cond_22

    .line 792
    .line 793
    move-object p1, v4

    .line 794
    goto :goto_1d

    .line 795
    :cond_22
    :goto_1a
    check-cast p1, Ljava/lang/Boolean;

    .line 796
    .line 797
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 798
    .line 799
    .line 800
    move-result p1

    .line 801
    if-eqz p1, :cond_25

    .line 802
    .line 803
    invoke-virtual {v1}, Lsg/b;->c()Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object p1

    .line 807
    invoke-interface {v0}, Lsg/g;->d()Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object v4

    .line 811
    instance-of v5, v4, Lsg/i;

    .line 812
    .line 813
    const/4 v6, 0x0

    .line 814
    if-nez v5, :cond_23

    .line 815
    .line 816
    goto :goto_1b

    .line 817
    :cond_23
    move-object v4, v6

    .line 818
    :goto_1b
    if-nez v4, :cond_24

    .line 819
    .line 820
    move-object v8, p1

    .line 821
    goto :goto_1c

    .line 822
    :cond_24
    move-object v8, v4

    .line 823
    :goto_1c
    new-instance v7, Lci/e;

    .line 824
    .line 825
    iget-object p1, p0, Li/e;->m:Ljava/lang/Object;

    .line 826
    .line 827
    move-object v9, p1

    .line 828
    check-cast v9, Li/c;

    .line 829
    .line 830
    iget-object p1, p0, Li/e;->n:Ljava/lang/Object;

    .line 831
    .line 832
    move-object v10, p1

    .line 833
    check-cast v10, Li0/a1;

    .line 834
    .line 835
    iget-object p1, p0, Li/e;->o:Ljava/lang/Object;

    .line 836
    .line 837
    move-object v11, p1

    .line 838
    check-cast v11, Li0/a1;

    .line 839
    .line 840
    const/4 v12, 0x0

    .line 841
    const/4 v13, 0x4

    .line 842
    invoke-direct/range {v7 .. v13}, Lci/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 843
    .line 844
    .line 845
    const/4 p1, 0x3

    .line 846
    invoke-static {v3, v6, v7, p1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 847
    .line 848
    .line 849
    goto :goto_19

    .line 850
    :cond_25
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 851
    .line 852
    :goto_1d
    return-object p1

    .line 853
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
