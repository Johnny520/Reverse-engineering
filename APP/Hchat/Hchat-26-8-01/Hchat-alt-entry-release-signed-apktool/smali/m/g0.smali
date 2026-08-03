.class public final Lm/g0;
.super Lyf/h;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public g:I

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lwb/ad;

.field public final synthetic j:Lc9/w0;

.field public final synthetic k:Lc9/w0;

.field public final synthetic l:Lc9/q0;


# direct methods
.method public constructor <init>(Lwb/ad;Lc9/w0;Lc9/w0;Lc9/q0;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm/g0;->i:Lwb/ad;

    .line 2
    .line 3
    iput-object p2, p0, Lm/g0;->j:Lc9/w0;

    .line 4
    .line 5
    iput-object p3, p0, Lm/g0;->k:Lc9/w0;

    .line 6
    .line 7
    iput-object p4, p0, Lm/g0;->l:Lc9/q0;

    .line 8
    .line 9
    invoke-direct {p0, p5}, Lyf/h;-><init>(Lwf/c;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 6

    .line 1
    new-instance v0, Lm/g0;

    .line 2
    .line 3
    iget-object v3, p0, Lm/g0;->k:Lc9/w0;

    .line 4
    .line 5
    iget-object v4, p0, Lm/g0;->l:Lc9/q0;

    .line 6
    .line 7
    iget-object v1, p0, Lm/g0;->i:Lwb/ad;

    .line 8
    .line 9
    iget-object v2, p0, Lm/g0;->j:Lc9/w0;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lm/g0;-><init>(Lwb/ad;Lc9/w0;Lc9/w0;Lc9/q0;Lwf/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lm/g0;->h:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ls1/k0;

    .line 2
    .line 3
    check-cast p2, Lwf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lm/g0;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lm/g0;

    .line 10
    .line 11
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lm/g0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lm/g0;->g:I

    .line 2
    .line 3
    iget-object v1, p0, Lm/g0;->k:Lc9/w0;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    sget-object v5, Lxf/a;->g:Lxf/a;

    .line 9
    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    if-eq v0, v4, :cond_2

    .line 13
    .line 14
    if-eq v0, v3, :cond_1

    .line 15
    .line 16
    if-ne v0, v2, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lm/g0;->h:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ls1/k0;

    .line 21
    .line 22
    :try_start_0
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    goto/16 :goto_3

    .line 26
    .line 27
    :catch_0
    move-exception p1

    .line 28
    goto/16 :goto_6

    .line 29
    .line 30
    :cond_0
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    return-object p1

    .line 37
    :cond_1
    iget-object v0, p0, Lm/g0;->h:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Ls1/k0;

    .line 40
    .line 41
    :try_start_1
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    iget-object v0, p0, Lm/g0;->h:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ls1/k0;

    .line 48
    .line 49
    :try_start_2
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    invoke-static {p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lm/g0;->h:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v0, p1

    .line 59
    check-cast v0, Ls1/k0;

    .line 60
    .line 61
    :try_start_3
    iput-object v0, p0, Lm/g0;->h:Ljava/lang/Object;

    .line 62
    .line 63
    iput v4, p0, Lm/g0;->g:I

    .line 64
    .line 65
    invoke-static {v0, p0, v3}, Lm/y2;->b(Ls1/k0;Lwf/c;I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-ne p1, v5, :cond_4

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    :goto_0
    check-cast p1, Ls1/t;

    .line 73
    .line 74
    iget-wide v6, p1, Ls1/t;->a:J

    .line 75
    .line 76
    iput-object v0, p0, Lm/g0;->h:Ljava/lang/Object;

    .line 77
    .line 78
    iput v3, p0, Lm/g0;->g:I

    .line 79
    .line 80
    invoke-static {v0, v6, v7, p0}, Lm/j0;->b(Ls1/k0;JLyf/a;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-ne p1, v5, :cond_5

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_5
    :goto_1
    check-cast p1, Ls1/t;

    .line 88
    .line 89
    if-eqz p1, :cond_a

    .line 90
    .line 91
    iget-object v3, p0, Lm/g0;->i:Lwb/ad;

    .line 92
    .line 93
    iget-object v4, v3, Lwb/ad;->h:Li0/a1;

    .line 94
    .line 95
    iget-object v6, v3, Lwb/ad;->i:Li0/a1;

    .line 96
    .line 97
    iget-object v3, v3, Lwb/ad;->j:Li0/a1;

    .line 98
    .line 99
    const/4 v7, 0x0

    .line 100
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    invoke-interface {v4, v7}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 108
    .line 109
    invoke-interface {v6, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    check-cast v3, Lfg/l;

    .line 117
    .line 118
    invoke-interface {v3, v4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    iget-wide v3, p1, Ls1/t;->a:J

    .line 122
    .line 123
    iget-object p1, p0, Lm/g0;->l:Lc9/q0;

    .line 124
    .line 125
    new-instance v6, Lb0/d0;

    .line 126
    .line 127
    const/16 v7, 0x1a

    .line 128
    .line 129
    invoke-direct {v6, p1, v7}, Lb0/d0;-><init>(Ljava/lang/Object;I)V

    .line 130
    .line 131
    .line 132
    iput-object v0, p0, Lm/g0;->h:Ljava/lang/Object;

    .line 133
    .line 134
    iput v2, p0, Lm/g0;->g:I

    .line 135
    .line 136
    invoke-static {v0, v3, v4, v6, p0}, Lm/j0;->d(Ls1/k0;JLfg/l;Lyf/a;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    if-ne p1, v5, :cond_6

    .line 141
    .line 142
    :goto_2
    return-object v5

    .line 143
    :cond_6
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    if-eqz p1, :cond_9

    .line 150
    .line 151
    iget-object p1, v0, Ls1/k0;->l:Ls1/l0;

    .line 152
    .line 153
    iget-object p1, p1, Ls1/l0;->z:Ls1/k;

    .line 154
    .line 155
    iget-object p1, p1, Ls1/k;->a:Ljava/lang/Object;

    .line 156
    .line 157
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    const/4 v2, 0x0

    .line 162
    :goto_4
    if-ge v2, v0, :cond_8

    .line 163
    .line 164
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    check-cast v3, Ls1/t;

    .line 169
    .line 170
    invoke-static {v3}, Ls1/s;->c(Ls1/t;)Z

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    if-eqz v4, :cond_7

    .line 175
    .line 176
    invoke-virtual {v3}, Ls1/t;->a()V

    .line 177
    .line 178
    .line 179
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_8
    iget-object p1, p0, Lm/g0;->j:Lc9/w0;

    .line 183
    .line 184
    invoke-virtual {p1}, Lc9/w0;->invoke()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    goto :goto_5

    .line 188
    :cond_9
    invoke-virtual {v1}, Lc9/w0;->invoke()Ljava/lang/Object;
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_0

    .line 189
    .line 190
    .line 191
    :cond_a
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 192
    .line 193
    return-object p1

    .line 194
    :goto_6
    invoke-virtual {v1}, Lc9/w0;->invoke()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    throw p1
.end method
