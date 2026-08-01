.class public final Lzh0;
.super Lm51;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public h:Ldi0;

.field public i:Ljava/lang/Object;

.field public j:Lmm;

.field public k:Lai0;

.field public l:I

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Lvh0;

.field public final synthetic o:Lai0;

.field public final synthetic p:Li;

.field public final synthetic q:Lmm;


# direct methods
.method public constructor <init>(Lvh0;Lai0;Li;Lmm;Lik;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzh0;->n:Lvh0;

    .line 2
    .line 3
    iput-object p2, p0, Lzh0;->o:Lai0;

    .line 4
    .line 5
    iput-object p3, p0, Lzh0;->p:Li;

    .line 6
    .line 7
    iput-object p4, p0, Lzh0;->q:Lmm;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lm51;-><init>(ILik;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Lik;)Lik;
    .locals 6

    .line 1
    new-instance v0, Lzh0;

    .line 2
    .line 3
    iget-object v3, p0, Lzh0;->p:Li;

    .line 4
    .line 5
    iget-object v4, p0, Lzh0;->q:Lmm;

    .line 6
    .line 7
    iget-object v1, p0, Lzh0;->n:Lvh0;

    .line 8
    .line 9
    iget-object v2, p0, Lzh0;->o:Lai0;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lzh0;-><init>(Lvh0;Lai0;Li;Lmm;Lik;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lzh0;->m:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lyk;

    .line 2
    .line 3
    check-cast p2, Lik;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lzh0;->g(Ljava/lang/Object;Lik;)Lik;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lzh0;

    .line 10
    .line 11
    sget-object p1, Lna1;->a:Lna1;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lzh0;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lzh0;->l:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    sget-object v4, Lzk;->d:Lzk;

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
    iget-object v0, p0, Lzh0;->i:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lai0;

    .line 17
    .line 18
    iget-object v1, p0, Lzh0;->h:Ldi0;

    .line 19
    .line 20
    iget-object p0, p0, Lzh0;->m:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Lxh0;

    .line 23
    .line 24
    :try_start_0
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto/16 :goto_4

    .line 28
    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto/16 :goto_6

    .line 31
    .line 32
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v3

    .line 38
    :cond_1
    iget-object v0, p0, Lzh0;->k:Lai0;

    .line 39
    .line 40
    iget-object v2, p0, Lzh0;->j:Lmm;

    .line 41
    .line 42
    iget-object v5, p0, Lzh0;->i:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v5, Lww;

    .line 45
    .line 46
    iget-object v6, p0, Lzh0;->h:Ldi0;

    .line 47
    .line 48
    iget-object v7, p0, Lzh0;->m:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v7, Lxh0;

    .line 51
    .line 52
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

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
    goto :goto_2

    .line 61
    :cond_2
    invoke-static {p1}, Lw60;->M(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lzh0;->m:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Lyk;

    .line 67
    .line 68
    new-instance v0, Lxh0;

    .line 69
    .line 70
    invoke-interface {p1}, Lyk;->f()Lpk;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    sget-object v5, Ln2;->I:Ln2;

    .line 75
    .line 76
    invoke-interface {p1, v5}, Lpk;->l(Lok;)Lnk;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    check-cast p1, Lc40;

    .line 84
    .line 85
    iget-object v5, p0, Lzh0;->n:Lvh0;

    .line 86
    .line 87
    invoke-direct {v0, v5, p1}, Lxh0;-><init>(Lvh0;Lc40;)V

    .line 88
    .line 89
    .line 90
    iget-object p1, p0, Lzh0;->o:Lai0;

    .line 91
    .line 92
    iget-object v5, p1, Lai0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 93
    .line 94
    :goto_0
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    check-cast v6, Lxh0;

    .line 99
    .line 100
    if-eqz v6, :cond_4

    .line 101
    .line 102
    iget-object v7, v0, Lxh0;->a:Lvh0;

    .line 103
    .line 104
    iget-object v8, v6, Lxh0;->a:Lvh0;

    .line 105
    .line 106
    invoke-virtual {v7, v8}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 107
    .line 108
    .line 109
    move-result v7

    .line 110
    if-ltz v7, :cond_3

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_3
    new-instance p0, Ljava/util/concurrent/CancellationException;

    .line 114
    .line 115
    const-string p1, "Current mutation had a higher priority"

    .line 116
    .line 117
    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p0

    .line 121
    :cond_4
    :goto_1
    invoke-virtual {v5, v6, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    if-eqz v7, :cond_b

    .line 126
    .line 127
    if-eqz v6, :cond_5

    .line 128
    .line 129
    iget-object v5, v6, Lxh0;->b:Lc40;

    .line 130
    .line 131
    new-instance v6, Lcu;

    .line 132
    .line 133
    const-string v7, "Mutation interrupted"

    .line 134
    .line 135
    const/4 v8, 0x0

    .line 136
    invoke-direct {v6, v7, v8}, Ldr0;-><init>(Ljava/lang/String;I)V

    .line 137
    .line 138
    .line 139
    invoke-interface {v5, v6}, Lc40;->a(Ljava/util/concurrent/CancellationException;)V

    .line 140
    .line 141
    .line 142
    :cond_5
    iget-object v5, p1, Lai0;->b:Ldi0;

    .line 143
    .line 144
    iput-object v0, p0, Lzh0;->m:Ljava/lang/Object;

    .line 145
    .line 146
    iput-object v5, p0, Lzh0;->h:Ldi0;

    .line 147
    .line 148
    iget-object v6, p0, Lzh0;->p:Li;

    .line 149
    .line 150
    iput-object v6, p0, Lzh0;->i:Ljava/lang/Object;

    .line 151
    .line 152
    iget-object v7, p0, Lzh0;->q:Lmm;

    .line 153
    .line 154
    iput-object v7, p0, Lzh0;->j:Lmm;

    .line 155
    .line 156
    iput-object p1, p0, Lzh0;->k:Lai0;

    .line 157
    .line 158
    iput v2, p0, Lzh0;->l:I

    .line 159
    .line 160
    invoke-virtual {v5, p0}, Ldi0;->e(Ljk;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    if-ne v2, v4, :cond_6

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_6
    move-object v2, v7

    .line 168
    :goto_2
    :try_start_1
    iput-object v0, p0, Lzh0;->m:Ljava/lang/Object;

    .line 169
    .line 170
    iput-object v5, p0, Lzh0;->h:Ldi0;

    .line 171
    .line 172
    iput-object p1, p0, Lzh0;->i:Ljava/lang/Object;

    .line 173
    .line 174
    iput-object v3, p0, Lzh0;->j:Lmm;

    .line 175
    .line 176
    iput-object v3, p0, Lzh0;->k:Lai0;

    .line 177
    .line 178
    iput v1, p0, Lzh0;->l:I

    .line 179
    .line 180
    invoke-interface {v6, v2, p0}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 184
    if-ne p0, v4, :cond_7

    .line 185
    .line 186
    :goto_3
    return-object v4

    .line 187
    :cond_7
    move-object v1, p1

    .line 188
    move-object p1, p0

    .line 189
    move-object p0, v0

    .line 190
    move-object v0, v1

    .line 191
    move-object v1, v5

    .line 192
    :goto_4
    :try_start_2
    iget-object v0, v0, Lai0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 193
    .line 194
    :cond_8
    invoke-virtual {v0, p0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    if-eqz v2, :cond_9

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_9
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 205
    if-eq v2, p0, :cond_8

    .line 206
    .line 207
    :goto_5
    invoke-virtual {v1, v3}, Ldi0;->g(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    return-object p1

    .line 211
    :catchall_1
    move-exception p0

    .line 212
    goto :goto_8

    .line 213
    :catchall_2
    move-exception p0

    .line 214
    move-object v1, p1

    .line 215
    move-object p1, p0

    .line 216
    move-object p0, v0

    .line 217
    move-object v0, v1

    .line 218
    move-object v1, v5

    .line 219
    :goto_6
    :try_start_3
    iget-object v0, v0, Lai0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 220
    .line 221
    :goto_7
    invoke-virtual {v0, p0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    if-nez v2, :cond_a

    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    if-ne v2, p0, :cond_a

    .line 232
    .line 233
    goto :goto_7

    .line 234
    :cond_a
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 235
    :goto_8
    invoke-virtual {v1, v3}, Ldi0;->g(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    throw p0

    .line 239
    :cond_b
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v7

    .line 243
    if-eq v7, v6, :cond_4

    .line 244
    .line 245
    goto/16 :goto_0
.end method
