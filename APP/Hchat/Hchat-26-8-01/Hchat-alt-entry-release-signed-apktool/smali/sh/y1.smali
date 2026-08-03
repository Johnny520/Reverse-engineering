.class public final Lsh/y1;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:Li/c;

.field public final synthetic k:Li/r0;


# direct methods
.method public synthetic constructor <init>(Li/c;Li/r0;Lwf/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Lsh/y1;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lsh/y1;->j:Li/c;

    .line 4
    .line 5
    iput-object p2, p0, Lsh/y1;->k:Li/r0;

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
    iget p1, p0, Lsh/y1;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lsh/y1;

    .line 7
    .line 8
    iget-object v0, p0, Lsh/y1;->k:Li/r0;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    iget-object v2, p0, Lsh/y1;->j:Li/c;

    .line 12
    .line 13
    invoke-direct {p1, v2, v0, p2, v1}, Lsh/y1;-><init>(Li/c;Li/r0;Lwf/c;I)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, Lsh/y1;

    .line 18
    .line 19
    iget-object v0, p0, Lsh/y1;->k:Li/r0;

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    iget-object v2, p0, Lsh/y1;->j:Li/c;

    .line 23
    .line 24
    invoke-direct {p1, v2, v0, p2, v1}, Lsh/y1;-><init>(Li/c;Li/r0;Lwf/c;I)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_1
    new-instance p1, Lsh/y1;

    .line 29
    .line 30
    iget-object v0, p0, Lsh/y1;->k:Li/r0;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    iget-object v2, p0, Lsh/y1;->j:Li/c;

    .line 34
    .line 35
    invoke-direct {p1, v2, v0, p2, v1}, Lsh/y1;-><init>(Li/c;Li/r0;Lwf/c;I)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_2
    new-instance p1, Lsh/y1;

    .line 40
    .line 41
    iget-object v0, p0, Lsh/y1;->k:Li/r0;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    iget-object v2, p0, Lsh/y1;->j:Li/c;

    .line 45
    .line 46
    invoke-direct {p1, v2, v0, p2, v1}, Lsh/y1;-><init>(Li/c;Li/r0;Lwf/c;I)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lsh/y1;->h:I

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
    invoke-virtual {p0, p1, p2}, Lsh/y1;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lsh/y1;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lsh/y1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lsh/y1;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lsh/y1;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lsh/y1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lsh/y1;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lsh/y1;

    .line 41
    .line 42
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lsh/y1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lsh/y1;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Lsh/y1;

    .line 54
    .line 55
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Lsh/y1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lsh/y1;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lsh/y1;->i:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    move-object v4, p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    move-object v4, p0

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    move p1, v1

    .line 30
    new-instance v1, Ljava/lang/Float;

    .line 31
    .line 32
    const/high16 v0, 0x41a00000    # 20.0f

    .line 33
    .line 34
    invoke-direct {v1, v0}, Ljava/lang/Float;-><init>(F)V

    .line 35
    .line 36
    .line 37
    iput p1, p0, Lsh/y1;->i:I

    .line 38
    .line 39
    iget-object v0, p0, Lsh/y1;->j:Li/c;

    .line 40
    .line 41
    iget-object v2, p0, Lsh/y1;->k:Li/r0;

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    const/16 v5, 0xc

    .line 45
    .line 46
    move-object v4, p0

    .line 47
    invoke-static/range {v0 .. v5}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 52
    .line 53
    if-ne p1, v0, :cond_2

    .line 54
    .line 55
    move-object p1, v0

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 58
    .line 59
    :goto_1
    return-object p1

    .line 60
    :pswitch_0
    move-object v4, p0

    .line 61
    iget v0, v4, Lsh/y1;->i:I

    .line 62
    .line 63
    const/4 v1, 0x1

    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    if-ne v0, v1, :cond_3

    .line 67
    .line 68
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const/4 p1, 0x0

    .line 78
    goto :goto_3

    .line 79
    :cond_4
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    move p1, v1

    .line 83
    new-instance v1, Ljava/lang/Float;

    .line 84
    .line 85
    const/4 v0, 0x0

    .line 86
    invoke-direct {v1, v0}, Ljava/lang/Float;-><init>(F)V

    .line 87
    .line 88
    .line 89
    iput p1, v4, Lsh/y1;->i:I

    .line 90
    .line 91
    iget-object v0, v4, Lsh/y1;->j:Li/c;

    .line 92
    .line 93
    iget-object v2, v4, Lsh/y1;->k:Li/r0;

    .line 94
    .line 95
    const/4 v3, 0x0

    .line 96
    const/16 v5, 0xc

    .line 97
    .line 98
    invoke-static/range {v0 .. v5}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 103
    .line 104
    if-ne p1, v0, :cond_5

    .line 105
    .line 106
    move-object p1, v0

    .line 107
    goto :goto_3

    .line 108
    :cond_5
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 109
    .line 110
    :goto_3
    return-object p1

    .line 111
    :pswitch_1
    move-object v4, p0

    .line 112
    iget v0, v4, Lsh/y1;->i:I

    .line 113
    .line 114
    const/4 v1, 0x1

    .line 115
    if-eqz v0, :cond_7

    .line 116
    .line 117
    if-ne v0, v1, :cond_6

    .line 118
    .line 119
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_6
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 124
    .line 125
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    const/4 p1, 0x0

    .line 129
    goto :goto_5

    .line 130
    :cond_7
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    move p1, v1

    .line 134
    new-instance v1, Ljava/lang/Float;

    .line 135
    .line 136
    const/4 v0, 0x0

    .line 137
    invoke-direct {v1, v0}, Ljava/lang/Float;-><init>(F)V

    .line 138
    .line 139
    .line 140
    iput p1, v4, Lsh/y1;->i:I

    .line 141
    .line 142
    iget-object v0, v4, Lsh/y1;->j:Li/c;

    .line 143
    .line 144
    iget-object v2, v4, Lsh/y1;->k:Li/r0;

    .line 145
    .line 146
    const/4 v3, 0x0

    .line 147
    const/16 v5, 0xc

    .line 148
    .line 149
    invoke-static/range {v0 .. v5}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 154
    .line 155
    if-ne p1, v0, :cond_8

    .line 156
    .line 157
    move-object p1, v0

    .line 158
    goto :goto_5

    .line 159
    :cond_8
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 160
    .line 161
    :goto_5
    return-object p1

    .line 162
    :pswitch_2
    move-object v4, p0

    .line 163
    iget v0, v4, Lsh/y1;->i:I

    .line 164
    .line 165
    const/4 v1, 0x1

    .line 166
    if-eqz v0, :cond_a

    .line 167
    .line 168
    if-ne v0, v1, :cond_9

    .line 169
    .line 170
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_9
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 175
    .line 176
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    const/4 p1, 0x0

    .line 180
    goto :goto_7

    .line 181
    :cond_a
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    move p1, v1

    .line 185
    new-instance v1, Ljava/lang/Float;

    .line 186
    .line 187
    const/high16 v0, 0x3f800000    # 1.0f

    .line 188
    .line 189
    invoke-direct {v1, v0}, Ljava/lang/Float;-><init>(F)V

    .line 190
    .line 191
    .line 192
    iput p1, v4, Lsh/y1;->i:I

    .line 193
    .line 194
    iget-object v0, v4, Lsh/y1;->j:Li/c;

    .line 195
    .line 196
    iget-object v2, v4, Lsh/y1;->k:Li/r0;

    .line 197
    .line 198
    const/4 v3, 0x0

    .line 199
    const/16 v5, 0xc

    .line 200
    .line 201
    invoke-static/range {v0 .. v5}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 206
    .line 207
    if-ne p1, v0, :cond_b

    .line 208
    .line 209
    move-object p1, v0

    .line 210
    goto :goto_7

    .line 211
    :cond_b
    :goto_6
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 212
    .line 213
    :goto_7
    return-object p1

    .line 214
    nop

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
