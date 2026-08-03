.class public final Ls/s;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:Ls/t;


# direct methods
.method public synthetic constructor <init>(Ls/t;Lwf/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Ls/s;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Ls/s;->j:Ls/t;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Lyf/i;-><init>(ILwf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 2

    .line 1
    iget p1, p0, Ls/s;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ls/s;

    .line 7
    .line 8
    iget-object v0, p0, Ls/s;->j:Ls/t;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {p1, v0, p2, v1}, Ls/s;-><init>(Ls/t;Lwf/c;I)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, Ls/s;

    .line 16
    .line 17
    iget-object v0, p0, Ls/s;->j:Ls/t;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {p1, v0, p2, v1}, Ls/s;-><init>(Ls/t;Lwf/c;I)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_1
    new-instance p1, Ls/s;

    .line 25
    .line 26
    iget-object v0, p0, Ls/s;->j:Ls/t;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-direct {p1, v0, p2, v1}, Ls/s;-><init>(Ls/t;Lwf/c;I)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_2
    new-instance p1, Ls/s;

    .line 34
    .line 35
    iget-object v0, p0, Ls/s;->j:Ls/t;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {p1, v0, p2, v1}, Ls/s;-><init>(Ls/t;Lwf/c;I)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_3
    new-instance p1, Ls/s;

    .line 43
    .line 44
    iget-object v0, p0, Ls/s;->j:Ls/t;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-direct {p1, v0, p2, v1}, Ls/s;-><init>(Ls/t;Lwf/c;I)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
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
    iget v0, p0, Ls/s;->h:I

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
    invoke-virtual {p0, p1, p2}, Ls/s;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ls/s;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Ls/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Ls/s;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Ls/s;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Ls/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Ls/s;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Ls/s;

    .line 41
    .line 42
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Ls/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, Ls/s;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Ls/s;

    .line 54
    .line 55
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Ls/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    :pswitch_3
    invoke-virtual {p0, p1, p2}, Ls/s;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Ls/s;

    .line 67
    .line 68
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Ls/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

    .line 1
    iget v0, p0, Ls/s;->h:I

    .line 2
    .line 3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 4
    .line 5
    iget-object v2, p0, Ls/s;->j:Ls/t;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    sget-object v5, Lxf/a;->g:Lxf/a;

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget v0, p0, Ls/s;->i:I

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    if-ne v0, v6, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v4}, Lj8/o;->A(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object v1, v3

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, v2, Ls/t;->n:Li/c;

    .line 35
    .line 36
    iput v6, p0, Ls/s;->i:I

    .line 37
    .line 38
    invoke-virtual {p1, p0}, Li/c;->f(Lyf/i;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-ne p1, v5, :cond_2

    .line 43
    .line 44
    move-object v1, v5

    .line 45
    :cond_2
    :goto_0
    return-object v1

    .line 46
    :pswitch_0
    iget v0, p0, Ls/s;->i:I

    .line 47
    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    if-ne v0, v6, :cond_3

    .line 51
    .line 52
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-static {v4}, Lj8/o;->A(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    move-object v1, v3

    .line 60
    goto :goto_1

    .line 61
    :cond_4
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, v2, Ls/t;->n:Li/c;

    .line 65
    .line 66
    iput v6, p0, Ls/s;->i:I

    .line 67
    .line 68
    invoke-virtual {p1, p0}, Li/c;->f(Lyf/i;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v5, :cond_5

    .line 73
    .line 74
    move-object v1, v5

    .line 75
    :cond_5
    :goto_1
    return-object v1

    .line 76
    :pswitch_1
    iget v0, p0, Ls/s;->i:I

    .line 77
    .line 78
    if-eqz v0, :cond_7

    .line 79
    .line 80
    if-ne v0, v6, :cond_6

    .line 81
    .line 82
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_6
    invoke-static {v4}, Lj8/o;->A(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    move-object v1, v3

    .line 90
    goto :goto_2

    .line 91
    :cond_7
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iget-object p1, v2, Ls/t;->m:Li/c;

    .line 95
    .line 96
    iput v6, p0, Ls/s;->i:I

    .line 97
    .line 98
    invoke-virtual {p1, p0}, Li/c;->f(Lyf/i;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-ne p1, v5, :cond_8

    .line 103
    .line 104
    move-object v1, v5

    .line 105
    :cond_8
    :goto_2
    return-object v1

    .line 106
    :pswitch_2
    iget v0, p0, Ls/s;->i:I

    .line 107
    .line 108
    const-wide/16 v7, 0x0

    .line 109
    .line 110
    if-eqz v0, :cond_a

    .line 111
    .line 112
    if-ne v0, v6, :cond_9

    .line 113
    .line 114
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_9
    invoke-static {v4}, Lj8/o;->A(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    move-object v1, v3

    .line 122
    goto :goto_4

    .line 123
    :cond_a
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    iget-object p1, v2, Ls/t;->m:Li/c;

    .line 127
    .line 128
    new-instance v0, Lu2/j;

    .line 129
    .line 130
    invoke-direct {v0, v7, v8}, Lu2/j;-><init>(J)V

    .line 131
    .line 132
    .line 133
    iput v6, p0, Ls/s;->i:I

    .line 134
    .line 135
    invoke-virtual {p1, v0, p0}, Li/c;->e(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    if-ne p1, v5, :cond_b

    .line 140
    .line 141
    move-object v1, v5

    .line 142
    goto :goto_4

    .line 143
    :cond_b
    :goto_3
    sget p1, Ls/t;->r:I

    .line 144
    .line 145
    invoke-virtual {v2, v7, v8}, Ls/t;->e(J)V

    .line 146
    .line 147
    .line 148
    const/4 p1, 0x0

    .line 149
    invoke-virtual {v2, p1}, Ls/t;->d(Z)V

    .line 150
    .line 151
    .line 152
    :goto_4
    return-object v1

    .line 153
    :pswitch_3
    iget v0, p0, Ls/s;->i:I

    .line 154
    .line 155
    if-eqz v0, :cond_d

    .line 156
    .line 157
    if-ne v0, v6, :cond_c

    .line 158
    .line 159
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_c
    invoke-static {v4}, Lj8/o;->A(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    move-object v1, v3

    .line 167
    goto :goto_5

    .line 168
    :cond_d
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    iget-object p1, v2, Ls/t;->n:Li/c;

    .line 172
    .line 173
    new-instance v0, Ljava/lang/Float;

    .line 174
    .line 175
    const/high16 v2, 0x3f800000    # 1.0f

    .line 176
    .line 177
    invoke-direct {v0, v2}, Ljava/lang/Float;-><init>(F)V

    .line 178
    .line 179
    .line 180
    iput v6, p0, Ls/s;->i:I

    .line 181
    .line 182
    invoke-virtual {p1, v0, p0}, Li/c;->e(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    if-ne p1, v5, :cond_e

    .line 187
    .line 188
    move-object v1, v5

    .line 189
    :cond_e
    :goto_5
    return-object v1

    .line 190
    nop

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
