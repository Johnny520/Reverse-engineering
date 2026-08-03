.class public final Lci/u;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Lci/u;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lci/u;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lci/u;->j:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lwf/c;I)V
    .locals 0

    .line 12
    iput p3, p0, Lci/u;->h:I

    iput-object p1, p0, Lci/u;->j:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 3

    .line 1
    iget v0, p0, Lci/u;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lci/u;

    .line 7
    .line 8
    iget-object v1, p0, Lci/u;->j:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lxb/i;

    .line 11
    .line 12
    const/4 v2, 0x7

    .line 13
    invoke-direct {v0, v1, p2, v2}, Lci/u;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, Lci/u;->i:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance p1, Lci/u;

    .line 20
    .line 21
    iget-object v0, p0, Lci/u;->i:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Landroid/content/Context;

    .line 24
    .line 25
    iget-object v1, p0, Lci/u;->j:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, Lfb/q1;

    .line 28
    .line 29
    const/4 v2, 0x6

    .line 30
    invoke-direct {p1, v0, v1, p2, v2}, Lci/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 31
    .line 32
    .line 33
    return-object p1

    .line 34
    :pswitch_1
    new-instance p1, Lci/u;

    .line 35
    .line 36
    iget-object v0, p0, Lci/u;->i:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Ljava/lang/String;

    .line 39
    .line 40
    iget-object v1, p0, Lci/u;->j:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Li0/a1;

    .line 43
    .line 44
    const/4 v2, 0x5

    .line 45
    invoke-direct {p1, v0, v1, p2, v2}, Lci/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_2
    new-instance p1, Lci/u;

    .line 50
    .line 51
    iget-object v0, p0, Lci/u;->i:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Landroid/content/Context;

    .line 54
    .line 55
    iget-object v1, p0, Lci/u;->j:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, Li0/a1;

    .line 58
    .line 59
    const/4 v2, 0x4

    .line 60
    invoke-direct {p1, v0, v1, p2, v2}, Lci/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 61
    .line 62
    .line 63
    return-object p1

    .line 64
    :pswitch_3
    new-instance v0, Lci/u;

    .line 65
    .line 66
    iget-object v1, p0, Lci/u;->j:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Ljava/lang/String;

    .line 69
    .line 70
    const/4 v2, 0x3

    .line 71
    invoke-direct {v0, v1, p2, v2}, Lci/u;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 72
    .line 73
    .line 74
    iput-object p1, v0, Lci/u;->i:Ljava/lang/Object;

    .line 75
    .line 76
    return-object v0

    .line 77
    :pswitch_4
    new-instance p1, Lci/u;

    .line 78
    .line 79
    iget-object v0, p0, Lci/u;->i:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Ljava/lang/String;

    .line 82
    .line 83
    iget-object v1, p0, Lci/u;->j:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v1, Ljava/lang/String;

    .line 86
    .line 87
    const/4 v2, 0x2

    .line 88
    invoke-direct {p1, v0, v1, p2, v2}, Lci/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 89
    .line 90
    .line 91
    return-object p1

    .line 92
    :pswitch_5
    new-instance v0, Lci/u;

    .line 93
    .line 94
    iget-object v1, p0, Lci/u;->j:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, Lf0/j;

    .line 97
    .line 98
    const/4 v2, 0x1

    .line 99
    invoke-direct {v0, v1, p2, v2}, Lci/u;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 100
    .line 101
    .line 102
    iput-object p1, v0, Lci/u;->i:Ljava/lang/Object;

    .line 103
    .line 104
    return-object v0

    .line 105
    :pswitch_6
    new-instance p1, Lci/u;

    .line 106
    .line 107
    iget-object v0, p0, Lci/u;->i:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, Lw0/p;

    .line 110
    .line 111
    iget-object v1, p0, Lci/u;->j:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v1, Lw0/p;

    .line 114
    .line 115
    const/4 v2, 0x0

    .line 116
    invoke-direct {p1, v0, v1, p2, v2}, Lci/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 117
    .line 118
    .line 119
    return-object p1

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
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
    iget v0, p0, Lci/u;->h:I

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
    invoke-virtual {p0, p1, p2}, Lci/u;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lci/u;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lci/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lci/u;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lci/u;

    .line 27
    .line 28
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Lci/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lci/u;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lci/u;

    .line 40
    .line 41
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Lci/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    return-object p2

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lci/u;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Lci/u;

    .line 52
    .line 53
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 54
    .line 55
    invoke-virtual {p1, p2}, Lci/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    return-object p2

    .line 59
    :pswitch_3
    invoke-virtual {p0, p1, p2}, Lci/u;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Lci/u;

    .line 64
    .line 65
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 66
    .line 67
    invoke-virtual {p1, p2}, Lci/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1

    .line 72
    :pswitch_4
    invoke-virtual {p0, p1, p2}, Lci/u;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast p1, Lci/u;

    .line 77
    .line 78
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 79
    .line 80
    invoke-virtual {p1, p2}, Lci/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    return-object p1

    .line 85
    :pswitch_5
    invoke-virtual {p0, p1, p2}, Lci/u;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, Lci/u;

    .line 90
    .line 91
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 92
    .line 93
    invoke-virtual {p1, p2}, Lci/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    return-object p1

    .line 98
    :pswitch_6
    invoke-virtual {p0, p1, p2}, Lci/u;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    check-cast p1, Lci/u;

    .line 103
    .line 104
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 105
    .line 106
    invoke-virtual {p1, p2}, Lci/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    return-object p2

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lci/u;->h:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    sget-object v3, Lsf/n;->a:Lsf/n;

    .line 6
    .line 7
    const/4 v4, 0x3

    .line 8
    const/4 v5, 0x0

    .line 9
    iget-object v6, p0, Lci/u;->j:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lci/u;->i:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lqg/t;

    .line 17
    .line 18
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance p1, Lxb/b;

    .line 22
    .line 23
    check-cast v6, Lxb/i;

    .line 24
    .line 25
    invoke-direct {p1, v6, v5, v1}, Lxb/b;-><init>(Lxb/i;Lwf/c;I)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v5, p1, v4}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 29
    .line 30
    .line 31
    new-instance p1, Lxb/b;

    .line 32
    .line 33
    const/4 v1, 0x2

    .line 34
    invoke-direct {p1, v6, v5, v1}, Lxb/b;-><init>(Lxb/i;Lwf/c;I)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v5, p1, v4}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 38
    .line 39
    .line 40
    new-instance p1, Lxb/b;

    .line 41
    .line 42
    invoke-direct {p1, v6, v5, v4}, Lxb/b;-><init>(Lxb/i;Lwf/c;I)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v5, p1, v4}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :pswitch_0
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lci/u;->i:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Landroid/content/Context;

    .line 55
    .line 56
    check-cast v6, Lfb/q1;

    .line 57
    .line 58
    iget-object v0, v6, Lfb/q1;->p:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {p1, v0}, Lr9/e0;->c0(Landroid/content/Context;Ljava/lang/String;)Ljava/io/Serializable;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    instance-of v0, p1, Lsf/f;

    .line 65
    .line 66
    if-eqz v0, :cond_0

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    move-object v5, p1

    .line 70
    :goto_0
    return-object v5

    .line 71
    :pswitch_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lci/u;->i:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, Ljava/lang/String;

    .line 77
    .line 78
    check-cast v6, Li0/a1;

    .line 79
    .line 80
    sget-object v0, Lwb/ho;->a:Log/k;

    .line 81
    .line 82
    invoke-interface {v6}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Ln2/s;

    .line 87
    .line 88
    iget-object v0, v0, Ln2/s;->a:Li2/g;

    .line 89
    .line 90
    iget-object v0, v0, Li2/g;->h:Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-nez v0, :cond_1

    .line 97
    .line 98
    new-instance v0, Ln2/s;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    invoke-static {v1, v1}, Li2/e0;->b(II)J

    .line 105
    .line 106
    .line 107
    move-result-wide v1

    .line 108
    const/4 v4, 0x4

    .line 109
    invoke-direct {v0, v4, p1, v1, v2}, Ln2/s;-><init>(ILjava/lang/String;J)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v6, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_1
    return-object v3

    .line 116
    :pswitch_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    check-cast v6, Li0/a1;

    .line 120
    .line 121
    new-instance p1, Lwb/nh;

    .line 122
    .line 123
    const/16 v0, 0xf

    .line 124
    .line 125
    invoke-direct {p1, v6, v0}, Lwb/nh;-><init>(Li0/a1;I)V

    .line 126
    .line 127
    .line 128
    sget-object v0, Lwb/u0;->g:Lwb/u0;

    .line 129
    .line 130
    invoke-static {v0, v2, p1}, Lwb/ho;->a6(Lwb/u0;ZLfg/p;)V

    .line 131
    .line 132
    .line 133
    return-object v3

    .line 134
    :pswitch_3
    iget-object v0, p0, Lci/u;->i:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v0, Lqg/t;

    .line 137
    .line 138
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    check-cast v6, Ljava/lang/String;

    .line 142
    .line 143
    :try_start_0
    invoke-static {v6}, Lx8/x;->d(Ljava/lang/String;)Luf/c;

    .line 144
    .line 145
    .line 146
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    goto :goto_1

    .line 148
    :catchall_0
    move-exception p1

    .line 149
    new-instance v0, Lsf/f;

    .line 150
    .line 151
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 152
    .line 153
    .line 154
    move-object p1, v0

    .line 155
    :goto_1
    new-instance v0, Lsf/g;

    .line 156
    .line 157
    invoke-direct {v0, p1}, Lsf/g;-><init>(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    return-object v0

    .line 161
    :pswitch_4
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    sget-object p1, Lx8/q;->a:Ljava/util/concurrent/ExecutorService;

    .line 165
    .line 166
    iget-object p1, p0, Lci/u;->i:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast p1, Ljava/lang/String;

    .line 169
    .line 170
    check-cast v6, Ljava/lang/String;

    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    new-array v0, v1, [C

    .line 187
    .line 188
    const/16 v1, 0x2f

    .line 189
    .line 190
    aput-char v1, v0, v2

    .line 191
    .line 192
    invoke-static {p1, v0}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 201
    .line 202
    if-eqz v0, :cond_2

    .line 203
    .line 204
    move-object p1, v1

    .line 205
    goto :goto_3

    .line 206
    :cond_2
    const-string v0, "/chat/completions"

    .line 207
    .line 208
    invoke-static {p1, v0, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    const-string v4, "/models"

    .line 213
    .line 214
    if-eqz v3, :cond_3

    .line 215
    .line 216
    invoke-static {p1, v0}, Log/m;->B0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-virtual {p1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    goto :goto_2

    .line 225
    :cond_3
    invoke-static {p1, v4, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-eqz v0, :cond_4

    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_4
    invoke-virtual {p1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    :goto_2
    invoke-static {p1, v4}, Log/m;->B0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    const-string v2, "/v1"

    .line 241
    .line 242
    invoke-static {v0, v2}, Log/m;->B0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    const-string v2, "/v1/models"

    .line 247
    .line 248
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    filled-new-array {p1, v0}, [Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    invoke-static {p1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-static {p1}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    invoke-static {p1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    :goto_3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-eqz v0, :cond_c

    .line 277
    .line 278
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    check-cast v0, Ljava/lang/String;

    .line 283
    .line 284
    :try_start_1
    new-instance v2, Lokhttp3/Request$Builder;

    .line 285
    .line 286
    invoke-direct {v2}, Lokhttp3/Request$Builder;-><init>()V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2, v0}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    const-string v2, "Content-Type"

    .line 294
    .line 295
    const-string v3, "application/json"

    .line 296
    .line 297
    invoke-virtual {v0, v2, v3}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    if-nez v2, :cond_6

    .line 306
    .line 307
    const-string v2, "Authorization"

    .line 308
    .line 309
    new-instance v3, Ljava/lang/StringBuilder;

    .line 310
    .line 311
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 312
    .line 313
    .line 314
    const-string v4, "Bearer "

    .line 315
    .line 316
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    invoke-virtual {v0, v2, v3}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 327
    .line 328
    .line 329
    goto :goto_4

    .line 330
    :catchall_1
    move-exception v0

    .line 331
    goto :goto_9

    .line 332
    :cond_6
    :goto_4
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->get()Lokhttp3/Request$Builder;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    sget-object v2, Lx8/q;->c:Lokhttp3/OkHttpClient;

    .line 341
    .line 342
    invoke-virtual {v2, v0}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-interface {v0}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 347
    .line 348
    .line 349
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 350
    :try_start_2
    invoke-virtual {v0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    if-eqz v2, :cond_7

    .line 355
    .line 356
    invoke-virtual {v2}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    goto :goto_5

    .line 361
    :catchall_2
    move-exception v2

    .line 362
    goto :goto_8

    .line 363
    :cond_7
    move-object v2, v5

    .line 364
    :goto_5
    if-nez v2, :cond_8

    .line 365
    .line 366
    const-string v2, ""

    .line 367
    .line 368
    :cond_8
    invoke-virtual {v0}, Lokhttp3/Response;->isSuccessful()Z

    .line 369
    .line 370
    .line 371
    move-result v3

    .line 372
    if-eqz v3, :cond_a

    .line 373
    .line 374
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 375
    .line 376
    .line 377
    move-result v3

    .line 378
    if-eqz v3, :cond_9

    .line 379
    .line 380
    goto :goto_6

    .line 381
    :cond_9
    invoke-static {v2}, Lx8/q;->x(Ljava/lang/String;)Ljava/util/List;

    .line 382
    .line 383
    .line 384
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 385
    goto :goto_7

    .line 386
    :cond_a
    :goto_6
    move-object v2, v1

    .line 387
    :goto_7
    :try_start_3
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 388
    .line 389
    .line 390
    goto :goto_a

    .line 391
    :goto_8
    :try_start_4
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 392
    :catchall_3
    move-exception v3

    .line 393
    :try_start_5
    invoke-static {v0, v2}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 394
    .line 395
    .line 396
    throw v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 397
    :goto_9
    new-instance v2, Lsf/f;

    .line 398
    .line 399
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 400
    .line 401
    .line 402
    :goto_a
    invoke-static {v2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    if-nez v0, :cond_b

    .line 407
    .line 408
    goto :goto_b

    .line 409
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    const-string v3, "[Hchat:AutoReply] \u62c9\u53d6\u6a21\u578b\u5217\u8868\u5931\u8d25: "

    .line 414
    .line 415
    invoke-static {v3, v2, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 416
    .line 417
    .line 418
    move-object v2, v1

    .line 419
    :goto_b
    check-cast v2, Ljava/util/List;

    .line 420
    .line 421
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    if-nez v0, :cond_5

    .line 426
    .line 427
    move-object v1, v2

    .line 428
    :cond_c
    return-object v1

    .line 429
    :pswitch_5
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    iget-object p1, p0, Lci/u;->i:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast p1, Lqg/t;

    .line 435
    .line 436
    check-cast v6, Lf0/j;

    .line 437
    .line 438
    iget-object v0, v6, Lf0/j;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 439
    .line 440
    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    check-cast v0, Lqg/r0;

    .line 445
    .line 446
    iget-object v7, v6, Lf0/j;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 447
    .line 448
    new-instance v3, Lci/j;

    .line 449
    .line 450
    invoke-direct {v3, v0, v6, v5, v4}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 451
    .line 452
    .line 453
    invoke-static {p1, v5, v3, v4}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    :cond_d
    invoke-virtual {v7, v5, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    move-result p1

    .line 461
    if-eqz p1, :cond_e

    .line 462
    .line 463
    goto :goto_c

    .line 464
    :cond_e
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object p1

    .line 468
    if-eqz p1, :cond_d

    .line 469
    .line 470
    move v1, v2

    .line 471
    :goto_c
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 472
    .line 473
    .line 474
    move-result-object p1

    .line 475
    return-object p1

    .line 476
    :pswitch_6
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    iget-object p1, p0, Lci/u;->i:Ljava/lang/Object;

    .line 480
    .line 481
    check-cast p1, Lw0/p;

    .line 482
    .line 483
    invoke-virtual {p1}, Lw0/p;->isEmpty()Z

    .line 484
    .line 485
    .line 486
    move-result p1

    .line 487
    if-eqz p1, :cond_f

    .line 488
    .line 489
    check-cast v6, Lw0/p;

    .line 490
    .line 491
    invoke-virtual {v6}, Lw0/p;->isEmpty()Z

    .line 492
    .line 493
    .line 494
    move-result p1

    .line 495
    if-eqz p1, :cond_f

    .line 496
    .line 497
    sget-object p1, Lci/x;->a:Lci/a;

    .line 498
    .line 499
    :cond_f
    return-object v3

    .line 500
    nop

    .line 501
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
