.class public final Lk/e;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:Lk/g;

.field public final synthetic k:Ln/m;


# direct methods
.method public synthetic constructor <init>(Lk/g;Ln/m;Lwf/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Lk/e;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lk/e;->j:Lk/g;

    .line 4
    .line 5
    iput-object p2, p0, Lk/e;->k:Ln/m;

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
    iget p1, p0, Lk/e;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lk/e;

    .line 7
    .line 8
    iget-object v0, p0, Lk/e;->k:Ln/m;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    iget-object v2, p0, Lk/e;->j:Lk/g;

    .line 12
    .line 13
    invoke-direct {p1, v2, v0, p2, v1}, Lk/e;-><init>(Lk/g;Ln/m;Lwf/c;I)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, Lk/e;

    .line 18
    .line 19
    iget-object v0, p0, Lk/e;->k:Ln/m;

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    iget-object v2, p0, Lk/e;->j:Lk/g;

    .line 23
    .line 24
    invoke-direct {p1, v2, v0, p2, v1}, Lk/e;-><init>(Lk/g;Ln/m;Lwf/c;I)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_1
    new-instance p1, Lk/e;

    .line 29
    .line 30
    iget-object v0, p0, Lk/e;->k:Ln/m;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    iget-object v2, p0, Lk/e;->j:Lk/g;

    .line 34
    .line 35
    invoke-direct {p1, v2, v0, p2, v1}, Lk/e;-><init>(Lk/g;Ln/m;Lwf/c;I)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_2
    new-instance p1, Lk/e;

    .line 40
    .line 41
    iget-object v0, p0, Lk/e;->k:Ln/m;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    iget-object v2, p0, Lk/e;->j:Lk/g;

    .line 45
    .line 46
    invoke-direct {p1, v2, v0, p2, v1}, Lk/e;-><init>(Lk/g;Ln/m;Lwf/c;I)V

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
    iget v0, p0, Lk/e;->h:I

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
    invoke-virtual {p0, p1, p2}, Lk/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lk/e;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lk/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lk/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lk/e;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lk/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lk/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lk/e;

    .line 41
    .line 42
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lk/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lk/e;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Lk/e;

    .line 54
    .line 55
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Lk/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 3

    .line 1
    iget v0, p0, Lk/e;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lk/e;->i:I

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
    goto :goto_0

    .line 17
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lk/e;->j:Lk/g;

    .line 28
    .line 29
    iget-object p1, p1, Lk/g;->w:Ln/k;

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    new-instance v0, Ln/n;

    .line 34
    .line 35
    iget-object v2, p0, Lk/e;->k:Ln/m;

    .line 36
    .line 37
    invoke-direct {v0, v2}, Ln/n;-><init>(Ln/m;)V

    .line 38
    .line 39
    .line 40
    iput v1, p0, Lk/e;->i:I

    .line 41
    .line 42
    invoke-virtual {p1, v0, p0}, Ln/k;->a(Ln/j;Lwf/c;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 47
    .line 48
    if-ne p1, v0, :cond_2

    .line 49
    .line 50
    move-object p1, v0

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 53
    .line 54
    :goto_1
    return-object p1

    .line 55
    :pswitch_0
    iget v0, p0, Lk/e;->i:I

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    if-ne v0, v1, :cond_3

    .line 61
    .line 62
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 p1, 0x0

    .line 72
    goto :goto_3

    .line 73
    :cond_4
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lk/e;->j:Lk/g;

    .line 77
    .line 78
    iget-object p1, p1, Lk/g;->w:Ln/k;

    .line 79
    .line 80
    if-eqz p1, :cond_5

    .line 81
    .line 82
    iput v1, p0, Lk/e;->i:I

    .line 83
    .line 84
    iget-object v0, p0, Lk/e;->k:Ln/m;

    .line 85
    .line 86
    invoke-virtual {p1, v0, p0}, Ln/k;->a(Ln/j;Lwf/c;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 91
    .line 92
    if-ne p1, v0, :cond_5

    .line 93
    .line 94
    move-object p1, v0

    .line 95
    goto :goto_3

    .line 96
    :cond_5
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 97
    .line 98
    :goto_3
    return-object p1

    .line 99
    :pswitch_1
    iget v0, p0, Lk/e;->i:I

    .line 100
    .line 101
    const/4 v1, 0x1

    .line 102
    if-eqz v0, :cond_7

    .line 103
    .line 104
    if-ne v0, v1, :cond_6

    .line 105
    .line 106
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_6
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 111
    .line 112
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    const/4 p1, 0x0

    .line 116
    goto :goto_5

    .line 117
    :cond_7
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iget-object p1, p0, Lk/e;->j:Lk/g;

    .line 121
    .line 122
    iget-object p1, p1, Lk/g;->w:Ln/k;

    .line 123
    .line 124
    if-eqz p1, :cond_8

    .line 125
    .line 126
    new-instance v0, Ln/l;

    .line 127
    .line 128
    iget-object v2, p0, Lk/e;->k:Ln/m;

    .line 129
    .line 130
    invoke-direct {v0, v2}, Ln/l;-><init>(Ln/m;)V

    .line 131
    .line 132
    .line 133
    iput v1, p0, Lk/e;->i:I

    .line 134
    .line 135
    invoke-virtual {p1, v0, p0}, Ln/k;->a(Ln/j;Lwf/c;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 140
    .line 141
    if-ne p1, v0, :cond_8

    .line 142
    .line 143
    move-object p1, v0

    .line 144
    goto :goto_5

    .line 145
    :cond_8
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 146
    .line 147
    :goto_5
    return-object p1

    .line 148
    :pswitch_2
    iget v0, p0, Lk/e;->i:I

    .line 149
    .line 150
    const/4 v1, 0x1

    .line 151
    if-eqz v0, :cond_a

    .line 152
    .line 153
    if-ne v0, v1, :cond_9

    .line 154
    .line 155
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_9
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 160
    .line 161
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    const/4 p1, 0x0

    .line 165
    goto :goto_7

    .line 166
    :cond_a
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    iget-object p1, p0, Lk/e;->j:Lk/g;

    .line 170
    .line 171
    iget-object p1, p1, Lk/g;->w:Ln/k;

    .line 172
    .line 173
    if-eqz p1, :cond_b

    .line 174
    .line 175
    new-instance v0, Ln/l;

    .line 176
    .line 177
    iget-object v2, p0, Lk/e;->k:Ln/m;

    .line 178
    .line 179
    invoke-direct {v0, v2}, Ln/l;-><init>(Ln/m;)V

    .line 180
    .line 181
    .line 182
    iput v1, p0, Lk/e;->i:I

    .line 183
    .line 184
    invoke-virtual {p1, v0, p0}, Ln/k;->a(Ln/j;Lwf/c;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 189
    .line 190
    if-ne p1, v0, :cond_b

    .line 191
    .line 192
    move-object p1, v0

    .line 193
    goto :goto_7

    .line 194
    :cond_b
    :goto_6
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 195
    .line 196
    :goto_7
    return-object p1

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
