.class public final Lw/d0;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:Ls1/x;

.field public final synthetic k:Lw/y0;


# direct methods
.method public synthetic constructor <init>(Ls1/x;Lw/y0;Lwf/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Lw/d0;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lw/d0;->j:Ls1/x;

    .line 4
    .line 5
    iput-object p2, p0, Lw/d0;->k:Lw/y0;

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


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 3

    .line 1
    iget p1, p0, Lw/d0;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lw/d0;

    .line 7
    .line 8
    iget-object v0, p0, Lw/d0;->k:Lw/y0;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    iget-object v2, p0, Lw/d0;->j:Ls1/x;

    .line 12
    .line 13
    invoke-direct {p1, v2, v0, p2, v1}, Lw/d0;-><init>(Ls1/x;Lw/y0;Lwf/c;I)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, Lw/d0;

    .line 18
    .line 19
    iget-object v0, p0, Lw/d0;->k:Lw/y0;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    iget-object v2, p0, Lw/d0;->j:Ls1/x;

    .line 23
    .line 24
    invoke-direct {p1, v2, v0, p2, v1}, Lw/d0;-><init>(Ls1/x;Lw/y0;Lwf/c;I)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_1
    new-instance p1, Lw/d0;

    .line 29
    .line 30
    iget-object v0, p0, Lw/d0;->k:Lw/y0;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    iget-object v2, p0, Lw/d0;->j:Ls1/x;

    .line 34
    .line 35
    invoke-direct {p1, v2, v0, p2, v1}, Lw/d0;-><init>(Ls1/x;Lw/y0;Lwf/c;I)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lw/d0;->h:I

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
    invoke-virtual {p0, p1, p2}, Lw/d0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lw/d0;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lw/d0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lw/d0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lw/d0;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lw/d0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lw/d0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lw/d0;

    .line 41
    .line 42
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lw/d0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lw/d0;->h:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, Lw/d0;->k:Lw/y0;

    .line 7
    .line 8
    iget-object v4, v0, Lw/d0;->j:Ls1/x;

    .line 9
    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    sget-object v6, Lxf/a;->g:Lxf/a;

    .line 13
    .line 14
    sget-object v7, Lsf/n;->a:Lsf/n;

    .line 15
    .line 16
    const/4 v8, 0x1

    .line 17
    const/4 v9, 0x0

    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    iget v1, v0, Lw/d0;->i:I

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    if-ne v1, v8, :cond_1

    .line 26
    .line 27
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    move-object v6, v7

    .line 31
    goto :goto_3

    .line 32
    :cond_1
    invoke-static {v5}, Lj8/o;->A(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    move-object v6, v9

    .line 36
    goto :goto_3

    .line 37
    :cond_2
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iput v8, v0, Lw/d0;->i:I

    .line 41
    .line 42
    new-instance v1, Lh0/y;

    .line 43
    .line 44
    const/4 v5, 0x2

    .line 45
    invoke-direct {v1, v3, v5}, Lh0/y;-><init>(Lw/y0;I)V

    .line 46
    .line 47
    .line 48
    new-instance v9, Lw/t0;

    .line 49
    .line 50
    invoke-direct {v9, v3, v2}, Lw/t0;-><init>(Lw/y0;I)V

    .line 51
    .line 52
    .line 53
    new-instance v14, Lw/t0;

    .line 54
    .line 55
    invoke-direct {v14, v3, v8}, Lw/t0;-><init>(Lw/y0;I)V

    .line 56
    .line 57
    .line 58
    new-instance v13, Lb0/t;

    .line 59
    .line 60
    const/16 v2, 0x17

    .line 61
    .line 62
    invoke-direct {v13, v3, v2}, Lb0/t;-><init>(Ljava/lang/Object;I)V

    .line 63
    .line 64
    .line 65
    sget v2, Lm/j0;->a:F

    .line 66
    .line 67
    new-instance v12, Lf0/h;

    .line 68
    .line 69
    invoke-direct {v12, v1, v5}, Lf0/h;-><init>(Ljava/lang/Object;I)V

    .line 70
    .line 71
    .line 72
    new-instance v15, Lb0/d0;

    .line 73
    .line 74
    const/16 v1, 0x19

    .line 75
    .line 76
    invoke-direct {v15, v9, v1}, Lb0/d0;-><init>(Ljava/lang/Object;I)V

    .line 77
    .line 78
    .line 79
    new-instance v11, Lk/s1;

    .line 80
    .line 81
    invoke-direct {v11, v5}, Lk/s1;-><init>(I)V

    .line 82
    .line 83
    .line 84
    new-instance v10, Lci/d;

    .line 85
    .line 86
    const/16 v16, 0x0

    .line 87
    .line 88
    invoke-direct/range {v10 .. v16}, Lci/d;-><init>(Lk/s1;Lf0/h;Lb0/t;Lw/t0;Lb0/d0;Lwf/c;)V

    .line 89
    .line 90
    .line 91
    invoke-static {v4, v10, v0}, La/a;->n(Ls1/x;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    if-ne v1, v6, :cond_3

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_3
    move-object v1, v7

    .line 99
    :goto_0
    if-ne v1, v6, :cond_4

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    move-object v1, v7

    .line 103
    :goto_1
    if-ne v1, v6, :cond_5

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    move-object v1, v7

    .line 107
    :goto_2
    if-ne v1, v6, :cond_0

    .line 108
    .line 109
    :goto_3
    return-object v6

    .line 110
    :pswitch_0
    iget v1, v0, Lw/d0;->i:I

    .line 111
    .line 112
    if-eqz v1, :cond_8

    .line 113
    .line 114
    if-ne v1, v8, :cond_7

    .line 115
    .line 116
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :cond_6
    move-object v6, v7

    .line 120
    goto :goto_5

    .line 121
    :cond_7
    invoke-static {v5}, Lj8/o;->A(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    move-object v6, v9

    .line 125
    goto :goto_5

    .line 126
    :cond_8
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iput v8, v0, Lw/d0;->i:I

    .line 130
    .line 131
    new-instance v1, Ld9/k;

    .line 132
    .line 133
    const/4 v2, 0x4

    .line 134
    invoke-direct {v1, v3, v9, v2}, Ld9/k;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 135
    .line 136
    .line 137
    invoke-static {v4, v1, v0}, La/a;->n(Ls1/x;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    if-ne v1, v6, :cond_9

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_9
    move-object v1, v7

    .line 145
    :goto_4
    if-ne v1, v6, :cond_6

    .line 146
    .line 147
    :goto_5
    return-object v6

    .line 148
    :pswitch_1
    iget v1, v0, Lw/d0;->i:I

    .line 149
    .line 150
    if-eqz v1, :cond_b

    .line 151
    .line 152
    if-ne v1, v8, :cond_a

    .line 153
    .line 154
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    goto :goto_7

    .line 158
    :cond_a
    invoke-static {v5}, Lj8/o;->A(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    move-object v6, v9

    .line 162
    goto :goto_8

    .line 163
    :cond_b
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    iput v8, v0, Lw/d0;->i:I

    .line 167
    .line 168
    new-instance v1, Lw/u0;

    .line 169
    .line 170
    invoke-direct {v1, v4, v3, v9, v2}, Lw/u0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 171
    .line 172
    .line 173
    invoke-static {v1, v0}, Lqg/v;->e(Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    if-ne v1, v6, :cond_c

    .line 178
    .line 179
    goto :goto_6

    .line 180
    :cond_c
    move-object v1, v7

    .line 181
    :goto_6
    if-ne v1, v6, :cond_d

    .line 182
    .line 183
    goto :goto_8

    .line 184
    :cond_d
    :goto_7
    move-object v6, v7

    .line 185
    :goto_8
    return-object v6

    .line 186
    nop

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
