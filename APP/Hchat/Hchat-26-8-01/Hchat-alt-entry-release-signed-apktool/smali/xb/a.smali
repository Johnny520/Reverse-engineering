.class public final Lxb/a;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public final synthetic j:Lxb/i;

.field public final synthetic k:F


# direct methods
.method public synthetic constructor <init>(Lxb/i;FLwf/c;I)V
    .locals 0

    .line 1
    iput p4, p0, Lxb/a;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lxb/a;->j:Lxb/i;

    .line 4
    .line 5
    iput p2, p0, Lxb/a;->k:F

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
    iget p1, p0, Lxb/a;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lxb/a;

    .line 7
    .line 8
    iget v0, p0, Lxb/a;->k:F

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    iget-object v2, p0, Lxb/a;->j:Lxb/i;

    .line 12
    .line 13
    invoke-direct {p1, v2, v0, p2, v1}, Lxb/a;-><init>(Lxb/i;FLwf/c;I)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, Lxb/a;

    .line 18
    .line 19
    iget v0, p0, Lxb/a;->k:F

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    iget-object v2, p0, Lxb/a;->j:Lxb/i;

    .line 23
    .line 24
    invoke-direct {p1, v2, v0, p2, v1}, Lxb/a;-><init>(Lxb/i;FLwf/c;I)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_1
    new-instance p1, Lxb/a;

    .line 29
    .line 30
    iget v0, p0, Lxb/a;->k:F

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    iget-object v2, p0, Lxb/a;->j:Lxb/i;

    .line 34
    .line 35
    invoke-direct {p1, v2, v0, p2, v1}, Lxb/a;-><init>(Lxb/i;FLwf/c;I)V

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
    iget v0, p0, Lxb/a;->h:I

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
    invoke-virtual {p0, p1, p2}, Lxb/a;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lxb/a;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lxb/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lxb/a;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lxb/a;

    .line 28
    .line 29
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lxb/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lxb/a;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lxb/a;

    .line 41
    .line 42
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lxb/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 8

    .line 1
    iget v0, p0, Lxb/a;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lxb/a;->i:I

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
    iget-object p1, p0, Lxb/a;->j:Lxb/i;

    .line 30
    .line 31
    iget-object v2, p1, Lxb/i;->l:Li/c;

    .line 32
    .line 33
    new-instance v3, Ljava/lang/Float;

    .line 34
    .line 35
    iget v0, p0, Lxb/a;->k:F

    .line 36
    .line 37
    invoke-direct {v3, v0}, Ljava/lang/Float;-><init>(F)V

    .line 38
    .line 39
    .line 40
    iget-object v4, p1, Lxb/i;->g:Li/r0;

    .line 41
    .line 42
    iput v1, p0, Lxb/a;->i:I

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    const/16 v7, 0xc

    .line 46
    .line 47
    move-object v6, p0

    .line 48
    invoke-static/range {v2 .. v7}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    move-object v4, v6

    .line 53
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 54
    .line 55
    if-ne p1, v0, :cond_2

    .line 56
    .line 57
    move-object p1, v0

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 60
    .line 61
    :goto_1
    return-object p1

    .line 62
    :pswitch_0
    move-object v4, p0

    .line 63
    iget v0, v4, Lxb/a;->i:I

    .line 64
    .line 65
    const/4 v1, 0x1

    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    if-ne v0, v1, :cond_3

    .line 69
    .line 70
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 75
    .line 76
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const/4 p1, 0x0

    .line 80
    goto :goto_3

    .line 81
    :cond_4
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iget-object p1, v4, Lxb/a;->j:Lxb/i;

    .line 85
    .line 86
    iget-object v0, p1, Lxb/i;->k:Li/c;

    .line 87
    .line 88
    move v2, v1

    .line 89
    new-instance v1, Ljava/lang/Float;

    .line 90
    .line 91
    iget v3, v4, Lxb/a;->k:F

    .line 92
    .line 93
    invoke-direct {v1, v3}, Ljava/lang/Float;-><init>(F)V

    .line 94
    .line 95
    .line 96
    move v3, v2

    .line 97
    iget-object v2, p1, Lxb/i;->f:Li/r0;

    .line 98
    .line 99
    move v5, v3

    .line 100
    new-instance v3, Lwb/f3;

    .line 101
    .line 102
    const/4 v6, 0x5

    .line 103
    invoke-direct {v3, p1, v6}, Lwb/f3;-><init>(Lxb/i;I)V

    .line 104
    .line 105
    .line 106
    iput v5, v4, Lxb/a;->i:I

    .line 107
    .line 108
    const/4 v5, 0x4

    .line 109
    invoke-static/range {v0 .. v5}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 114
    .line 115
    if-ne p1, v0, :cond_5

    .line 116
    .line 117
    move-object p1, v0

    .line 118
    goto :goto_3

    .line 119
    :cond_5
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 120
    .line 121
    :goto_3
    return-object p1

    .line 122
    :pswitch_1
    move-object v4, p0

    .line 123
    iget v0, v4, Lxb/a;->i:I

    .line 124
    .line 125
    const/4 v1, 0x1

    .line 126
    if-eqz v0, :cond_7

    .line 127
    .line 128
    if-ne v0, v1, :cond_6

    .line 129
    .line 130
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_6
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 135
    .line 136
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    const/4 p1, 0x0

    .line 140
    goto :goto_5

    .line 141
    :cond_7
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    iget-object p1, v4, Lxb/a;->j:Lxb/i;

    .line 145
    .line 146
    iget-object v0, p1, Lxb/i;->k:Li/c;

    .line 147
    .line 148
    move v2, v1

    .line 149
    new-instance v1, Ljava/lang/Float;

    .line 150
    .line 151
    iget v3, v4, Lxb/a;->k:F

    .line 152
    .line 153
    invoke-direct {v1, v3}, Ljava/lang/Float;-><init>(F)V

    .line 154
    .line 155
    .line 156
    iget-object p1, p1, Lxb/i;->f:Li/r0;

    .line 157
    .line 158
    iput v2, v4, Lxb/a;->i:I

    .line 159
    .line 160
    const/4 v3, 0x0

    .line 161
    const/16 v5, 0xc

    .line 162
    .line 163
    move-object v2, p1

    .line 164
    invoke-static/range {v0 .. v5}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    sget-object v0, Lxf/a;->g:Lxf/a;

    .line 169
    .line 170
    if-ne p1, v0, :cond_8

    .line 171
    .line 172
    move-object p1, v0

    .line 173
    goto :goto_5

    .line 174
    :cond_8
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 175
    .line 176
    :goto_5
    return-object p1

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
