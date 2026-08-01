.class public abstract Lvg;
.super Lu50;


# instance fields
.field public c:I


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    sget-object v2, Lx50;->g:Lv50;

    .line 4
    .line 5
    invoke-direct {p0, v0, v1, v2}, Lu50;-><init>(JLv50;)V

    .line 6
    .line 7
    .line 8
    iput p1, p0, Lvg;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V
.end method

.method public abstract b()Lld;
.end method

.method public e(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2

    .line 1
    instance-of v0, p1, Lnb;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lnb;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p1, v1

    .line 10
    :goto_0
    if-eqz p1, :cond_1

    .line 11
    .line 12
    iget-object p1, p1, Lnb;->a:Ljava/lang/Throwable;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_1
    return-object v1
.end method

.method public g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    return-object p1
.end method

.method public final h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    if-eqz p1, :cond_1

    .line 7
    .line 8
    if-eqz p2, :cond_1

    .line 9
    .line 10
    invoke-static {p1, p2}, Lip;->f(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    :cond_1
    if-nez p1, :cond_2

    .line 14
    .line 15
    move-object p1, p2

    .line 16
    :cond_2
    new-instance p2, Lre;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "Fatal exception in coroutines machinery for "

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ". Please read KDoc to \'handleFatalException\' method and report this incident to maintainers"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {p1}, Lip;->l(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p2, v0, p1}, Ljava/lang/Error;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lvg;->b()Lld;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-interface {p1}, Lld;->d()Lge;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p1, p2}, Lff;->u(Lge;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public abstract i()Ljava/lang/Object;
.end method

.method public final run()V
    .locals 13

    .line 1
    sget-object v0, Lvh;->n:Lvh;

    .line 2
    .line 3
    iget-object v1, p0, Lu50;->b:Lv50;

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0}, Lvg;->b()Lld;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v3, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"

    .line 10
    .line 11
    invoke-static {v3, v2}, Lip;->m(Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    check-cast v2, Ltg;

    .line 15
    .line 16
    iget-object v3, v2, Ltg;->e:Lm50;

    .line 17
    .line 18
    iget-object v2, v2, Ltg;->g:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v4, v3, Lm50;->b:Lge;

    .line 21
    .line 22
    invoke-static {v4}, Lip;->l(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v4, v2}, Lff;->V(Lge;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    sget-object v5, Lff;->x:Ll0;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    if-eq v2, v5, :cond_0

    .line 33
    .line 34
    invoke-static {v3, v4, v2}, Lip;->b0(Lld;Lge;Ljava/lang/Object;)Lo80;

    .line 35
    .line 36
    .line 37
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception v2

    .line 40
    goto/16 :goto_6

    .line 41
    .line 42
    :cond_0
    move-object v5, v6

    .line 43
    :goto_0
    :try_start_1
    iget-object v7, v3, Lm50;->b:Lge;

    .line 44
    .line 45
    invoke-static {v7}, Lip;->l(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lvg;->i()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    invoke-virtual {p0, v8}, Lvg;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 53
    .line 54
    .line 55
    move-result-object v9

    .line 56
    if-nez v9, :cond_3

    .line 57
    .line 58
    iget v10, p0, Lvg;->c:I

    .line 59
    .line 60
    const/4 v11, 0x1

    .line 61
    if-eq v10, v11, :cond_2

    .line 62
    .line 63
    const/4 v12, 0x2

    .line 64
    if-ne v10, v12, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    const/4 v11, 0x0

    .line 68
    :cond_2
    :goto_1
    if-eqz v11, :cond_3

    .line 69
    .line 70
    sget-object v10, Lvh;->h:Lvh;

    .line 71
    .line 72
    invoke-interface {v7, v10}, Lge;->b(Lfe;)Lee;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    check-cast v7, Lmp;

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :catchall_1
    move-exception v3

    .line 80
    goto :goto_5

    .line 81
    :cond_3
    move-object v7, v6

    .line 82
    :goto_2
    if-eqz v7, :cond_4

    .line 83
    .line 84
    invoke-interface {v7}, Lmp;->a()Z

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    if-nez v10, :cond_4

    .line 89
    .line 90
    check-cast v7, Lwp;

    .line 91
    .line 92
    invoke-virtual {v7}, Lwp;->t()Ljava/util/concurrent/CancellationException;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    invoke-virtual {p0, v8, v7}, Lvg;->a(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V

    .line 97
    .line 98
    .line 99
    invoke-static {v7}, Lct;->f(Ljava/lang/Throwable;)Le10;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    invoke-virtual {v3, v7}, Lm50;->f(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_4
    if-eqz v9, :cond_5

    .line 108
    .line 109
    invoke-static {v9}, Lct;->f(Ljava/lang/Throwable;)Le10;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    invoke-virtual {v3, v7}, Lm50;->f(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_5
    invoke-virtual {p0, v8}, Lvg;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    invoke-virtual {v3, v7}, Lm50;->f(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 122
    .line 123
    .line 124
    :goto_3
    if-eqz v5, :cond_6

    .line 125
    .line 126
    :try_start_2
    invoke-virtual {v5}, Lo80;->K()Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_7

    .line 131
    .line 132
    :cond_6
    invoke-static {v4, v2}, Lff;->L(Lge;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 133
    .line 134
    .line 135
    :cond_7
    :try_start_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 136
    .line 137
    .line 138
    goto :goto_4

    .line 139
    :catchall_2
    move-exception v0

    .line 140
    invoke-static {v0}, Lct;->f(Ljava/lang/Throwable;)Le10;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    :goto_4
    invoke-static {v0}, Lf10;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {p0, v6, v0}, Lvg;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 149
    .line 150
    .line 151
    goto :goto_8

    .line 152
    :goto_5
    if-eqz v5, :cond_8

    .line 153
    .line 154
    :try_start_4
    invoke-virtual {v5}, Lo80;->K()Z

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    if-eqz v5, :cond_9

    .line 159
    .line 160
    :cond_8
    invoke-static {v4, v2}, Lff;->L(Lge;Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    :cond_9
    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 164
    :goto_6
    :try_start_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 165
    .line 166
    .line 167
    goto :goto_7

    .line 168
    :catchall_3
    move-exception v0

    .line 169
    invoke-static {v0}, Lct;->f(Ljava/lang/Throwable;)Le10;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    :goto_7
    invoke-static {v0}, Lf10;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {p0, v2, v0}, Lvg;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 178
    .line 179
    .line 180
    :goto_8
    return-void
.end method
