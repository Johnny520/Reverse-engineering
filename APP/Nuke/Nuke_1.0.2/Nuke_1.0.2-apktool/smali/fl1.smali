.class public final Lfl1;
.super Ltw2;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public l:Lil1;

.field public m:Ljava/lang/Object;

.field public n:Ld60;

.field public o:Lgl1;

.field public p:I

.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:Lbl1;

.field public final synthetic s:Lgl1;

.field public final synthetic t:Lb2;

.field public final synthetic u:Ld60;


# direct methods
.method public constructor <init>(Lbl1;Lgl1;Lb2;Ld60;Lt00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lfl1;->r:Lbl1;

    .line 2
    .line 3
    iput-object p2, p0, Lfl1;->s:Lgl1;

    .line 4
    .line 5
    iput-object p3, p0, Lfl1;->t:Lb2;

    .line 6
    .line 7
    iput-object p4, p0, Lfl1;->u:Ld60;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Ltw2;-><init>(ILt00;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lj20;

    .line 2
    .line 3
    check-cast p2, Lt00;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lfl1;->p(Lt00;Ljava/lang/Object;)Lt00;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lfl1;

    .line 10
    .line 11
    sget-object p1, La83;->a:La83;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lfl1;->r(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final p(Lt00;Ljava/lang/Object;)Lt00;
    .locals 6

    .line 1
    new-instance v0, Lfl1;

    .line 2
    .line 3
    iget-object v3, p0, Lfl1;->t:Lb2;

    .line 4
    .line 5
    iget-object v4, p0, Lfl1;->u:Ld60;

    .line 6
    .line 7
    iget-object v1, p0, Lfl1;->r:Lbl1;

    .line 8
    .line 9
    iget-object v2, p0, Lfl1;->s:Lgl1;

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Lfl1;-><init>(Lbl1;Lgl1;Lb2;Ld60;Lt00;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, v0, Lfl1;->q:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lfl1;->p:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    sget-object v4, Lk20;->h:Lk20;

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    if-eq v0, v2, :cond_1

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lfl1;->m:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lgl1;

    .line 17
    .line 18
    iget-object v1, p0, Lfl1;->l:Lil1;

    .line 19
    .line 20
    iget-object p0, p0, Lfl1;->q:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Ldl1;

    .line 23
    .line 24
    :try_start_0
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto/16 :goto_4

    .line 31
    .line 32
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v3

    .line 38
    :cond_1
    iget-object v0, p0, Lfl1;->o:Lgl1;

    .line 39
    .line 40
    iget-object v2, p0, Lfl1;->n:Ld60;

    .line 41
    .line 42
    iget-object v5, p0, Lfl1;->m:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v5, Lmn0;

    .line 45
    .line 46
    iget-object v6, p0, Lfl1;->l:Lil1;

    .line 47
    .line 48
    iget-object v7, p0, Lfl1;->q:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v7, Ldl1;

    .line 51
    .line 52
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move-object p1, v6

    .line 56
    move-object v6, v5

    .line 57
    move-object v5, p1

    .line 58
    move-object p1, v0

    .line 59
    move-object v0, v7

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-static {p1}, Lfg1;->T(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lfl1;->q:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Lj20;

    .line 67
    .line 68
    new-instance v0, Ldl1;

    .line 69
    .line 70
    invoke-interface {p1}, Lj20;->g()La20;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    sget-object v5, Lsn;->K:Lsn;

    .line 75
    .line 76
    invoke-interface {p1, v5}, La20;->o(Lz10;)Ly10;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    check-cast p1, Lk21;

    .line 84
    .line 85
    iget-object v5, p0, Lfl1;->r:Lbl1;

    .line 86
    .line 87
    invoke-direct {v0, v5, p1}, Ldl1;-><init>(Lbl1;Lk21;)V

    .line 88
    .line 89
    .line 90
    iget-object p1, p0, Lfl1;->s:Lgl1;

    .line 91
    .line 92
    invoke-static {p1, v0}, Lgl1;->a(Lgl1;Ldl1;)V

    .line 93
    .line 94
    .line 95
    iget-object v5, p1, Lgl1;->b:Lkl1;

    .line 96
    .line 97
    iput-object v0, p0, Lfl1;->q:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object v5, p0, Lfl1;->l:Lil1;

    .line 100
    .line 101
    iget-object v6, p0, Lfl1;->t:Lb2;

    .line 102
    .line 103
    iput-object v6, p0, Lfl1;->m:Ljava/lang/Object;

    .line 104
    .line 105
    iget-object v7, p0, Lfl1;->u:Ld60;

    .line 106
    .line 107
    iput-object v7, p0, Lfl1;->n:Ld60;

    .line 108
    .line 109
    iput-object p1, p0, Lfl1;->o:Lgl1;

    .line 110
    .line 111
    iput v2, p0, Lfl1;->p:I

    .line 112
    .line 113
    invoke-virtual {v5, p0}, Lkl1;->d(Lu00;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    if-ne v2, v4, :cond_3

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_3
    move-object v2, v7

    .line 121
    :goto_0
    :try_start_1
    iput-object v0, p0, Lfl1;->q:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object v5, p0, Lfl1;->l:Lil1;

    .line 124
    .line 125
    iput-object p1, p0, Lfl1;->m:Ljava/lang/Object;

    .line 126
    .line 127
    iput-object v3, p0, Lfl1;->n:Ld60;

    .line 128
    .line 129
    iput-object v3, p0, Lfl1;->o:Lgl1;

    .line 130
    .line 131
    iput v1, p0, Lfl1;->p:I

    .line 132
    .line 133
    invoke-interface {v6, v2, p0}, Lmn0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 137
    if-ne p0, v4, :cond_4

    .line 138
    .line 139
    :goto_1
    return-object v4

    .line 140
    :cond_4
    move-object v1, p1

    .line 141
    move-object p1, p0

    .line 142
    move-object p0, v0

    .line 143
    move-object v0, v1

    .line 144
    move-object v1, v5

    .line 145
    :goto_2
    :try_start_2
    iget-object v0, v0, Lgl1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 146
    .line 147
    :cond_5
    invoke-virtual {v0, p0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-eqz v2, :cond_6

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 158
    if-eq v2, p0, :cond_5

    .line 159
    .line 160
    :goto_3
    check-cast v1, Lkl1;

    .line 161
    .line 162
    invoke-virtual {v1, v3}, Lkl1;->f(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    return-object p1

    .line 166
    :catchall_1
    move-exception p0

    .line 167
    goto :goto_6

    .line 168
    :catchall_2
    move-exception p0

    .line 169
    move-object v1, p1

    .line 170
    move-object p1, p0

    .line 171
    move-object p0, v0

    .line 172
    move-object v0, v1

    .line 173
    move-object v1, v5

    .line 174
    :goto_4
    :try_start_3
    iget-object v0, v0, Lgl1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 175
    .line 176
    :goto_5
    invoke-virtual {v0, p0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-nez v2, :cond_7

    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    if-ne v2, p0, :cond_7

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_7
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 190
    :goto_6
    check-cast v1, Lkl1;

    .line 191
    .line 192
    invoke-virtual {v1, v3}, Lkl1;->f(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    throw p0
.end method
