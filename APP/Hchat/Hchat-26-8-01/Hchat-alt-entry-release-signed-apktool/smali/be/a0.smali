.class public final Lbe/a0;
.super Lbe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic g:I

.field public h:Lud/u;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lbe/a0;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static k(Lud/e;Ljava/util/List;Lqd/j;Ljava/util/List;)Ljava/util/List;
    .locals 4

    .line 1
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lqd/j;->k:Lqd/e;

    .line 8
    .line 9
    invoke-virtual {p2, v0}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v1, Lbe/l0;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v1, v0, v2}, Lbe/l0;-><init>(Ljava/util/HashSet;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, v1}, Lqd/j;->C(Ljava/util/function/Function;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    new-instance p2, Lbe/z;

    .line 31
    .line 32
    const/4 v1, 0x2

    .line 33
    invoke-direct {p2, v0, v1}, Lbe/z;-><init>(Ljava/util/HashSet;I)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p3, p2}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-eqz p2, :cond_1

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_1
    invoke-virtual {p0}, Lud/e;->d0()Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-eqz p2, :cond_2

    .line 51
    .line 52
    new-instance p2, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 55
    .line 56
    .line 57
    iget-object p3, p0, Lud/e;->x:Lud/e;

    .line 58
    .line 59
    move-object v1, p0

    .line 60
    :goto_0
    if-eq p3, v1, :cond_3

    .line 61
    .line 62
    iget-object v1, p3, Lud/e;->r:Ljava/util/List;

    .line 63
    .line 64
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 65
    .line 66
    .line 67
    iget-object v1, p3, Lud/e;->x:Lud/e;

    .line 68
    .line 69
    move-object v3, v1

    .line 70
    move-object v1, p3

    .line 71
    move-object p3, v3

    .line 72
    goto :goto_0

    .line 73
    :cond_2
    move-object p2, p1

    .line 74
    :cond_3
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result p3

    .line 82
    if-eqz p3, :cond_4

    .line 83
    .line 84
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    check-cast p3, Lqd/j;

    .line 89
    .line 90
    invoke-virtual {p3}, Lqd/j;->l()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    invoke-virtual {v0, p3}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    if-eqz p2, :cond_5

    .line 103
    .line 104
    :goto_2
    return-object p1

    .line 105
    :cond_5
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    const-string p3, "Add missing generic type declarations: "

    .line 110
    .line 111
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-virtual {p0, p2}, Lnd/b0;->J(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    new-instance p0, Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    .line 125
    .line 126
    .line 127
    move-result p3

    .line 128
    add-int/2addr p3, p2

    .line 129
    invoke-direct {p0, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 133
    .line 134
    .line 135
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-interface {p1}, Ljava/util/stream/Stream;->sorted()Ljava/util/stream/Stream;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    new-instance p2, Lae/d;

    .line 144
    .line 145
    const/16 p3, 0x11

    .line 146
    .line 147
    invoke-direct {p2, p3}, Lae/d;-><init>(I)V

    .line 148
    .line 149
    .line 150
    invoke-interface {p1, p2}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    new-instance p2, Lbe/m0;

    .line 155
    .line 156
    const/4 p3, 0x0

    .line 157
    invoke-direct {p2, p3, p0}, Lbe/m0;-><init>(ILjava/util/ArrayList;)V

    .line 158
    .line 159
    .line 160
    invoke-interface {p1, p2}, Ljava/util/stream/Stream;->forEach(Ljava/util/function/Consumer;)V

    .line 161
    .line 162
    .line 163
    return-object p0
.end method

.method public static m(Lud/e;Ljava/util/List;)Ljava/util/List;
    .locals 9

    .line 1
    iget-object v0, p0, Lud/e;->q:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    new-instance v3, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    const/4 v5, 0x0

    .line 28
    :goto_0
    if-ge v5, v2, :cond_4

    .line 29
    .line 30
    if-ge v5, v4, :cond_3

    .line 31
    .line 32
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    check-cast v6, Lqd/j;

    .line 37
    .line 38
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    check-cast v7, Lqd/j;

    .line 43
    .line 44
    if-nez v6, :cond_1

    .line 45
    .line 46
    :goto_1
    move-object v6, v7

    .line 47
    goto :goto_2

    .line 48
    :cond_1
    invoke-virtual {v6}, Lqd/j;->v()Z

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    if-nez v8, :cond_2

    .line 53
    .line 54
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    const-string v8, "Incorrect class signature, class is not an object: "

    .line 59
    .line 60
    invoke-virtual {v8, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    invoke-virtual {p0, v6}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    :goto_2
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_3
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    check-cast v6, Lqd/j;

    .line 77
    .line 78
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_4
    if-ge v2, v1, :cond_5

    .line 85
    .line 86
    invoke-interface {p1, v2, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    const-string v0, "Unexpected interfaces in signature: "

    .line 95
    .line 96
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p0, p1}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :cond_5
    return-object v3
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lbe/a0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lbe/a;->e()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    const-string v0, "SignatureProcessor"

    .line 12
    .line 13
    return-object v0

    .line 14
    nop

    .line 15
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Lud/u;)V
    .locals 1

    .line 1
    iget v0, p0, Lbe/a0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lbe/a0;->h:Lud/u;

    .line 7
    .line 8
    return-void

    .line 9
    :pswitch_0
    iput-object p1, p0, Lbe/a0;->h:Lud/u;

    .line 10
    .line 11
    return-void

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public g(Lud/r;)V
    .locals 9

    .line 1
    iget v0, p0, Lbe/a0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    sget-object v0, Lmd/b;->v:Lmd/b;

    .line 8
    .line 9
    iget-object v1, p1, Lmd/e;->g:Lmd/f;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lnd/z;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    new-instance v0, Lnd/z;

    .line 20
    .line 21
    new-instance v1, Ljava/util/HashSet;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1}, Lnd/z;-><init>(Ljava/util/HashSet;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Lmd/e;->y(Loc/b;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object v1, v0, Lnd/z;->g:Ljava/util/HashSet;

    .line 33
    .line 34
    iget-boolean v2, v0, Lnd/z;->h:Z

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    if-nez v2, :cond_7

    .line 38
    .line 39
    iput-boolean v3, v0, Lnd/z;->h:Z

    .line 40
    .line 41
    iget-boolean v0, p1, Lud/r;->p:Z

    .line 42
    .line 43
    if-nez v0, :cond_7

    .line 44
    .line 45
    iget-object v0, p1, Lud/r;->z:Ljava/util/List;

    .line 46
    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    goto/16 :goto_6

    .line 50
    .line 51
    :cond_1
    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_7

    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Lud/a;

    .line 66
    .line 67
    sget-object v4, Lmd/a;->u:Lmd/a;

    .line 68
    .line 69
    iget-object v5, v2, Lmd/e;->g:Lmd/f;

    .line 70
    .line 71
    invoke-virtual {v5, v4}, Lmd/f;->a(Lmd/a;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-nez v4, :cond_4

    .line 76
    .line 77
    sget-object v4, Lmd/a;->s:Lmd/a;

    .line 78
    .line 79
    iget-object v5, v2, Lmd/e;->g:Lmd/f;

    .line 80
    .line 81
    invoke-virtual {v5, v4}, Lmd/f;->a(Lmd/a;)Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eqz v4, :cond_3

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    const/4 v4, 0x0

    .line 89
    goto :goto_2

    .line 90
    :catch_0
    move-exception v0

    .line 91
    goto :goto_5

    .line 92
    :cond_4
    :goto_1
    move v4, v3

    .line 93
    :goto_2
    new-instance v5, Ljava/util/HashSet;

    .line 94
    .line 95
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 96
    .line 97
    .line 98
    sget-object v6, Lmd/b;->F:Lmd/b;

    .line 99
    .line 100
    iget-object v7, v2, Lmd/e;->g:Lmd/f;

    .line 101
    .line 102
    invoke-virtual {v7, v6}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    check-cast v6, Lae/b;

    .line 107
    .line 108
    if-eqz v6, :cond_6

    .line 109
    .line 110
    iget-object v6, v6, Lae/b;->g:Ljava/util/List;

    .line 111
    .line 112
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-eqz v7, :cond_6

    .line 121
    .line 122
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    check-cast v7, Lae/f;

    .line 127
    .line 128
    invoke-virtual {v7}, Lae/f;->c()Z

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    if-eqz v8, :cond_5

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_5
    invoke-virtual {v7}, Lae/f;->b()Lqd/j;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    invoke-virtual {v7}, Lqd/j;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    invoke-virtual {v5, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_6
    iget-object v2, v2, Lud/a;->l:Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    if-eqz v6, :cond_2

    .line 158
    .line 159
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    check-cast v6, Lud/p;

    .line 164
    .line 165
    invoke-virtual {p0, p1, v6, v5, v4}, Lbe/a0;->j(Lud/r;Lud/p;Ljava/util/HashSet;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 166
    .line 167
    .line 168
    goto :goto_4

    .line 169
    :goto_5
    const-string v2, "Failed to analyze thrown exceptions"

    .line 170
    .line 171
    invoke-virtual {p1, v2, v0}, Lnd/b0;->M(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 172
    .line 173
    .line 174
    :cond_7
    :goto_6
    new-instance v0, Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 177
    .line 178
    .line 179
    sget-object v2, Loc/c;->i:Loc/c;

    .line 180
    .line 181
    iget-object v4, p1, Lmd/e;->g:Lmd/f;

    .line 182
    .line 183
    invoke-virtual {v4, v2}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    check-cast v2, Lpc/e;

    .line 188
    .line 189
    if-eqz v2, :cond_9

    .line 190
    .line 191
    iget-object v2, v2, Lpc/e;->g:Ljava/util/List;

    .line 192
    .line 193
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    if-nez v4, :cond_9

    .line 198
    .line 199
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v4

    .line 207
    if-eqz v4, :cond_9

    .line 208
    .line 209
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    check-cast v4, Ljava/lang/String;

    .line 214
    .line 215
    invoke-static {v4}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    invoke-virtual {p0, v4}, Lbe/a0;->o(Lqd/j;)I

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    const/4 v6, 0x4

    .line 224
    if-ne v5, v6, :cond_8

    .line 225
    .line 226
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    goto :goto_7

    .line 230
    :cond_8
    check-cast v4, Lqd/e;

    .line 231
    .line 232
    iget-object v4, v4, Lqd/e;->K:Ljava/lang/String;

    .line 233
    .line 234
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    goto :goto_7

    .line 238
    :cond_9
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    if-nez v2, :cond_a

    .line 243
    .line 244
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    const-string v2, "Byte code manipulation detected: skipped illegal throws declarations: "

    .line 249
    .line 250
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-virtual {p1, v0}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    :cond_a
    const-string p1, "java.lang.Exception"

    .line 258
    .line 259
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result p1

    .line 263
    if-eqz p1, :cond_b

    .line 264
    .line 265
    new-instance p1, La7/b;

    .line 266
    .line 267
    const/16 v0, 0xd

    .line 268
    .line 269
    invoke-direct {p1, v0}, La7/b;-><init>(I)V

    .line 270
    .line 271
    .line 272
    invoke-interface {v1, p1}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 273
    .line 274
    .line 275
    goto :goto_a

    .line 276
    :cond_b
    const-string p1, "java.lang.Throwable"

    .line 277
    .line 278
    invoke-virtual {v1, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result p1

    .line 282
    if-eqz p1, :cond_c

    .line 283
    .line 284
    new-instance p1, La7/b;

    .line 285
    .line 286
    const/16 v0, 0xe

    .line 287
    .line 288
    invoke-direct {p1, v0}, La7/b;-><init>(I)V

    .line 289
    .line 290
    .line 291
    invoke-interface {v1, p1}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 292
    .line 293
    .line 294
    goto :goto_a

    .line 295
    :cond_c
    new-instance p1, Ljava/util/ArrayList;

    .line 296
    .line 297
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 305
    .line 306
    .line 307
    move-result v2

    .line 308
    if-eqz v2, :cond_11

    .line 309
    .line 310
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    check-cast v2, Ljava/lang/String;

    .line 315
    .line 316
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    :cond_e
    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 321
    .line 322
    .line 323
    move-result v5

    .line 324
    if-eqz v5, :cond_d

    .line 325
    .line 326
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v5

    .line 330
    check-cast v5, Ljava/lang/String;

    .line 331
    .line 332
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v6

    .line 336
    if-eqz v6, :cond_f

    .line 337
    .line 338
    goto :goto_8

    .line 339
    :cond_f
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v6

    .line 343
    if-eqz v6, :cond_10

    .line 344
    .line 345
    move v5, v3

    .line 346
    goto :goto_9

    .line 347
    :cond_10
    iget-object v6, p0, Lbe/a0;->h:Lud/u;

    .line 348
    .line 349
    iget-object v6, v6, Lud/u;->s:Led/c;

    .line 350
    .line 351
    invoke-virtual {v6, v2}, Led/c;->d(Ljava/lang/String;)Ljava/util/Set;

    .line 352
    .line 353
    .line 354
    move-result-object v6

    .line 355
    invoke-interface {v6, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v5

    .line 359
    :goto_9
    if-eqz v5, :cond_e

    .line 360
    .line 361
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    goto :goto_8

    .line 365
    :cond_11
    new-instance v0, Lbe/z;

    .line 366
    .line 367
    const/4 v2, 0x0

    .line 368
    invoke-direct {v0, v1, v2}, Lbe/z;-><init>(Ljava/util/HashSet;I)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->forEach(Ljava/util/function/Consumer;)V

    .line 372
    .line 373
    .line 374
    :goto_a
    return-void

    .line 375
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public h(Lud/e;)Z
    .locals 10

    .line 1
    iget v0, p0, Lbe/a0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lbe/a;->h(Lud/e;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    invoke-static {p1}, Lvd/a;->g(Lnd/b0;)Lvd/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_3

    .line 18
    .line 19
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lvd/a;->b()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0}, Lvd/a;->e()Lqd/j;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v3, p1, Lud/e;->p:Lqd/j;

    .line 28
    .line 29
    invoke-virtual {v2}, Lqd/j;->l()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    iget-object v5, p1, Lud/e;->m:Lod/a;

    .line 34
    .line 35
    iget-object v5, v5, Lod/a;->g:Lqd/j;

    .line 36
    .line 37
    invoke-virtual {v5}, Lqd/j;->l()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-static {v4, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    const-string v2, "Incorrect class signature: super class is equals to this class"

    .line 48
    .line 49
    invoke-virtual {p1, v2}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {v2}, Lqd/j;->v()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-nez v4, :cond_2

    .line 58
    .line 59
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    const-string v4, "Incorrect class signature, class is not an object: "

    .line 64
    .line 65
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {p1, v2}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    move-object v2, v3

    .line 73
    :cond_2
    move-object v3, v2

    .line 74
    :goto_0
    const/4 v2, 0x0

    .line 75
    :goto_1
    invoke-virtual {v0}, Lvd/a;->e()Lqd/j;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    if-nez v4, :cond_4

    .line 80
    .line 81
    if-nez v2, :cond_3

    .line 82
    .line 83
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 84
    .line 85
    :cond_3
    invoke-static {p1, v2}, Lbe/a0;->m(Lud/e;Ljava/util/List;)Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-static {p1, v1, v3, v2}, Lbe/a0;->k(Lud/e;Ljava/util/List;Lqd/j;Ljava/util/List;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    iput-object v1, p1, Lud/e;->r:Ljava/util/List;

    .line 94
    .line 95
    iput-object v3, p1, Lud/e;->p:Lqd/j;

    .line 96
    .line 97
    iput-object v2, p1, Lud/e;->q:Ljava/util/List;

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :catch_0
    move-exception v1

    .line 101
    goto :goto_2

    .line 102
    :cond_4
    if-nez v2, :cond_5

    .line 103
    .line 104
    new-instance v2, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    :cond_5
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :goto_2
    iget-object v0, v0, Lvd/a;->a:Ljava/lang/String;

    .line 114
    .line 115
    new-instance v2, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    const-string v3, "Failed to parse class signature: "

    .line 118
    .line 119
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {p1, v0, v1}, Lnd/b0;->M(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    :goto_3
    iget-object v0, p1, Lud/e;->u:Ljava/util/List;

    .line 133
    .line 134
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_d

    .line 143
    .line 144
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    check-cast v1, Lud/g;

    .line 149
    .line 150
    const-string v2, "Incorrect field signature: "

    .line 151
    .line 152
    const-string v3, "Incorrect inner types in field signature: "

    .line 153
    .line 154
    invoke-static {v1}, Lvd/a;->g(Lnd/b0;)Lvd/a;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    if-nez v4, :cond_6

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_6
    iget-object v5, v4, Lvd/a;->a:Ljava/lang/String;

    .line 162
    .line 163
    iget-object v6, v1, Lud/g;->k:Lud/e;

    .line 164
    .line 165
    :try_start_1
    invoke-virtual {v4}, Lvd/a;->e()Lqd/j;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    if-nez v4, :cond_7

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_7
    invoke-virtual {p0, v4}, Lbe/a0;->p(Lqd/j;)Z

    .line 173
    .line 174
    .line 175
    move-result v7

    .line 176
    if-nez v7, :cond_8

    .line 177
    .line 178
    new-instance v2, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    invoke-virtual {v1, v2}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    goto :goto_4

    .line 194
    :catch_1
    move-exception v2

    .line 195
    goto :goto_6

    .line 196
    :cond_8
    iget-object v3, p0, Lbe/a0;->h:Lud/u;

    .line 197
    .line 198
    iget-object v3, v3, Lud/u;->i:Lfe/a;

    .line 199
    .line 200
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v4}, Lqd/j;->c()Z

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    if-eqz v3, :cond_b

    .line 208
    .line 209
    invoke-virtual {v6}, Lud/e;->d0()Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-eqz v3, :cond_9

    .line 214
    .line 215
    new-instance v3, Ljava/util/HashSet;

    .line 216
    .line 217
    iget-object v7, v6, Lud/e;->r:Ljava/util/List;

    .line 218
    .line 219
    invoke-direct {v3, v7}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 220
    .line 221
    .line 222
    iget-object v7, v6, Lud/e;->x:Lud/e;

    .line 223
    .line 224
    move-object v8, v6

    .line 225
    :goto_5
    if-eq v7, v8, :cond_a

    .line 226
    .line 227
    iget-object v8, v7, Lud/e;->r:Ljava/util/List;

    .line 228
    .line 229
    invoke-interface {v3, v8}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 230
    .line 231
    .line 232
    iget-object v8, v7, Lud/e;->x:Lud/e;

    .line 233
    .line 234
    move-object v9, v8

    .line 235
    move-object v8, v7

    .line 236
    move-object v7, v9

    .line 237
    goto :goto_5

    .line 238
    :cond_9
    iget-object v3, v6, Lud/e;->r:Ljava/util/List;

    .line 239
    .line 240
    :cond_a
    invoke-static {v6, v4, v3}, Lfe/a;->b(Lnd/b0;Lqd/j;Ljava/util/Collection;)V

    .line 241
    .line 242
    .line 243
    :cond_b
    iget-object v3, v1, Lud/g;->n:Lqd/j;

    .line 244
    .line 245
    invoke-virtual {p0, v4, v3}, Lbe/a0;->q(Lqd/j;Lqd/j;)Z

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    if-nez v3, :cond_c

    .line 250
    .line 251
    new-instance v3, Ljava/lang/StringBuilder;

    .line 252
    .line 253
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    invoke-virtual {v1, v2}, Lnd/b0;->J(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    goto/16 :goto_4

    .line 267
    .line 268
    :cond_c
    iput-object v4, v1, Lud/g;->n:Lqd/j;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 269
    .line 270
    goto/16 :goto_4

    .line 271
    .line 272
    :goto_6
    iget-object v1, v1, Lud/g;->l:Lod/c;

    .line 273
    .line 274
    iget-object v1, v1, Lod/c;->h:Ljava/lang/String;

    .line 275
    .line 276
    new-instance v3, Ljava/lang/StringBuilder;

    .line 277
    .line 278
    const-string v4, "Field signature parse error: "

    .line 279
    .line 280
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    invoke-virtual {v6, v1, v2}, Lnd/b0;->M(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 291
    .line 292
    .line 293
    goto/16 :goto_4

    .line 294
    .line 295
    :cond_d
    iget-object p1, p1, Lud/e;->t:Ljava/util/List;

    .line 296
    .line 297
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    :cond_e
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    if-eqz v0, :cond_13

    .line 306
    .line 307
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    check-cast v0, Lud/r;

    .line 312
    .line 313
    invoke-static {v0}, Lvd/a;->g(Lnd/b0;)Lvd/a;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    if-nez v1, :cond_f

    .line 318
    .line 319
    goto :goto_7

    .line 320
    :cond_f
    :try_start_2
    invoke-virtual {v1}, Lvd/a;->b()Ljava/util/List;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    iget-object v3, v0, Lud/r;->k:Lod/d;

    .line 325
    .line 326
    iget-object v3, v3, Lod/d;->i:Ljava/util/List;

    .line 327
    .line 328
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    invoke-virtual {v1, v3}, Lvd/a;->c(I)Ljava/util/List;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    invoke-virtual {v1}, Lvd/a;->e()Lqd/j;

    .line 337
    .line 338
    .line 339
    move-result-object v4

    .line 340
    invoke-virtual {p0, v4}, Lbe/a0;->p(Lqd/j;)Z

    .line 341
    .line 342
    .line 343
    move-result v5

    .line 344
    if-eqz v5, :cond_12

    .line 345
    .line 346
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 347
    .line 348
    .line 349
    move-result-object v5

    .line 350
    :cond_10
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 351
    .line 352
    .line 353
    move-result v6

    .line 354
    if-eqz v6, :cond_11

    .line 355
    .line 356
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v6

    .line 360
    check-cast v6, Lqd/j;

    .line 361
    .line 362
    invoke-virtual {p0, v6}, Lbe/a0;->p(Lqd/j;)Z

    .line 363
    .line 364
    .line 365
    move-result v6

    .line 366
    if-nez v6, :cond_10

    .line 367
    .line 368
    goto :goto_8

    .line 369
    :cond_11
    iput-object v2, v0, Lud/r;->v:Ljava/util/List;

    .line 370
    .line 371
    iget-object v2, p0, Lbe/a0;->h:Lud/u;

    .line 372
    .line 373
    iget-object v2, v2, Lud/u;->i:Lfe/a;

    .line 374
    .line 375
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    invoke-static {v0, v4}, Lfe/a;->c(Lud/r;Lqd/j;)V

    .line 379
    .line 380
    .line 381
    new-instance v5, Lbe/m;

    .line 382
    .line 383
    const/4 v6, 0x1

    .line 384
    invoke-direct {v5, v2, v6, v0}, Lbe/m;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    invoke-static {v3, v5}, Lxe/s;->c(Ljava/util/Collection;Ljava/util/function/Function;)Ljava/util/List;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    invoke-virtual {p0, v0, v1, v4, v2}, Lbe/a0;->n(Lud/r;Lvd/a;Lqd/j;Ljava/util/List;)Z

    .line 392
    .line 393
    .line 394
    move-result v2

    .line 395
    if-nez v2, :cond_e

    .line 396
    .line 397
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 398
    .line 399
    iput-object v2, v0, Lud/r;->v:Ljava/util/List;

    .line 400
    .line 401
    goto :goto_7

    .line 402
    :catch_2
    move-exception v2

    .line 403
    goto :goto_9

    .line 404
    :cond_12
    :goto_8
    iget-object v2, v1, Lvd/a;->a:Ljava/lang/String;

    .line 405
    .line 406
    new-instance v3, Ljava/lang/StringBuilder;

    .line 407
    .line 408
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 409
    .line 410
    .line 411
    const-string v4, "Incorrect inner types in method signature: "

    .line 412
    .line 413
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    invoke-virtual {v0, v2}, Lnd/b0;->L(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 424
    .line 425
    .line 426
    goto :goto_7

    .line 427
    :goto_9
    iget-object v1, v1, Lvd/a;->a:Ljava/lang/String;

    .line 428
    .line 429
    new-instance v3, Ljava/lang/StringBuilder;

    .line 430
    .line 431
    const-string v4, "Failed to parse method signature: "

    .line 432
    .line 433
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    invoke-virtual {v0, v1, v2}, Lnd/b0;->M(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 444
    .line 445
    .line 446
    goto/16 :goto_7

    .line 447
    .line 448
    :cond_13
    const/4 p1, 0x1

    .line 449
    return p1

    .line 450
    nop

    .line 451
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public i(Lud/r;Lvd/a;Ljava/util/List;)Ljava/util/List;
    .locals 6

    .line 1
    iget-object p2, p2, Lvd/a;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v0, p1, Lud/r;->k:Lod/d;

    .line 4
    .line 5
    iget-object v1, v0, Lod/d;->i:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    iget-object v2, p1, Lud/r;->l:Lud/e;

    .line 20
    .line 21
    iget-object v2, v2, Lud/e;->o:Lb5/k;

    .line 22
    .line 23
    invoke-virtual {v2}, Lb5/k;->b()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    return-object v5

    .line 30
    :cond_0
    invoke-virtual {v0}, Lod/d;->f()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    new-instance v0, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v0, p3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    check-cast p3, Lqd/j;

    .line 58
    .line 59
    invoke-virtual {v0, v4, p3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 63
    .line 64
    .line 65
    move-result p3

    .line 66
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-ne p3, v1, :cond_1

    .line 71
    .line 72
    return-object v0

    .line 73
    :cond_1
    new-instance p3, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const-string v0, "Incorrect args count in method signature: "

    .line 76
    .line 77
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-virtual {p1, p2}, Lnd/b0;->I(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-object v5

    .line 91
    :cond_2
    :goto_0
    if-ge v4, v2, :cond_4

    .line 92
    .line 93
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Lqd/j;

    .line 98
    .line 99
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    check-cast v3, Lqd/j;

    .line 104
    .line 105
    invoke-virtual {p0, v0, v3}, Lbe/a0;->q(Lqd/j;Lqd/j;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_3

    .line 110
    .line 111
    new-instance p3, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    const-string v0, "Incorrect types in method signature: "

    .line 114
    .line 115
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    invoke-virtual {p1, p2}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    return-object v5

    .line 129
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_4
    return-object p3
.end method

.method public j(Lud/r;Lud/p;Ljava/util/HashSet;Z)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p4, :cond_2

    .line 3
    .line 4
    iget-object p4, p2, Lud/p;->k:Lpd/k;

    .line 5
    .line 6
    sget-object v1, Lpd/k;->r:Lpd/k;

    .line 7
    .line 8
    if-ne p4, v1, :cond_2

    .line 9
    .line 10
    sget-object p4, Lmd/a;->s:Lmd/a;

    .line 11
    .line 12
    iget-object v1, p2, Lmd/e;->g:Lmd/f;

    .line 13
    .line 14
    invoke-virtual {v1, p4}, Lmd/f;->a(Lmd/a;)Z

    .line 15
    .line 16
    .line 17
    move-result p4

    .line 18
    if-nez p4, :cond_2

    .line 19
    .line 20
    invoke-virtual {p2, v0}, Lud/p;->S(I)Lqd/l;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    instance-of p4, p2, Lqd/r;

    .line 25
    .line 26
    if-eqz p4, :cond_1

    .line 27
    .line 28
    check-cast p2, Lqd/r;

    .line 29
    .line 30
    invoke-virtual {p2}, Lqd/r;->I()Lqd/j;

    .line 31
    .line 32
    .line 33
    move-result-object p4

    .line 34
    sget-object v0, Lqd/j;->o:Lqd/e;

    .line 35
    .line 36
    invoke-virtual {p4, v0}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    invoke-virtual {p2}, Lqd/r;->f0()Lud/p;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    if-eqz p2, :cond_0

    .line 47
    .line 48
    iget-object v0, p2, Lud/p;->k:Lpd/k;

    .line 49
    .line 50
    sget-object v1, Lpd/k;->s:Lpd/k;

    .line 51
    .line 52
    if-ne v0, v1, :cond_0

    .line 53
    .line 54
    iget-object p2, p2, Lud/p;->l:Lqd/r;

    .line 55
    .line 56
    sget-object v0, Lmd/a;->P:Lmd/a;

    .line 57
    .line 58
    iget-object p2, p2, Lmd/e;->g:Lmd/f;

    .line 59
    .line 60
    invoke-virtual {p2, v0}, Lmd/f;->a(Lmd/a;)Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-eqz p2, :cond_0

    .line 65
    .line 66
    goto/16 :goto_3

    .line 67
    .line 68
    :cond_0
    invoke-virtual {p0, p1, p4, p3}, Lbe/a0;->r(Lud/r;Lqd/j;Ljava/util/HashSet;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_1
    instance-of p4, p2, Lqd/m;

    .line 73
    .line 74
    if-eqz p4, :cond_b

    .line 75
    .line 76
    check-cast p2, Lqd/m;

    .line 77
    .line 78
    iget-object p2, p2, Lqd/l;->i:Lqd/j;

    .line 79
    .line 80
    invoke-virtual {p0, p1, p2, p3}, Lbe/a0;->r(Lud/r;Lqd/j;Ljava/util/HashSet;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_2
    iget-object p4, p2, Lud/p;->k:Lpd/k;

    .line 85
    .line 86
    sget-object v1, Lpd/k;->O:Lpd/k;

    .line 87
    .line 88
    if-ne p4, v1, :cond_b

    .line 89
    .line 90
    check-cast p2, Lpd/n;

    .line 91
    .line 92
    iget-object p2, p2, Lpd/n;->p:Lod/d;

    .line 93
    .line 94
    const/4 p4, 0x1

    .line 95
    invoke-virtual {p2, v0, p4}, Lod/d;->j(ZZ)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p4

    .line 99
    iget-object v0, p2, Lod/d;->j:Lod/a;

    .line 100
    .line 101
    iget-object v1, p0, Lbe/a0;->h:Lud/u;

    .line 102
    .line 103
    invoke-virtual {v1, v0}, Lud/u;->f(Lod/a;)Lud/e;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    sget-object v2, Lmd/b;->v:Lmd/b;

    .line 108
    .line 109
    const/4 v3, 0x0

    .line 110
    if-eqz v1, :cond_8

    .line 111
    .line 112
    iget-object v0, p2, Lod/d;->k:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v4, v1, Lud/e;->t:Ljava/util/List;

    .line 115
    .line 116
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-eqz v5, :cond_4

    .line 125
    .line 126
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    check-cast v5, Lud/r;

    .line 131
    .line 132
    iget-object v6, v5, Lud/r;->k:Lod/d;

    .line 133
    .line 134
    iget-object v6, v6, Lod/d;->k:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    if-eqz v6, :cond_3

    .line 141
    .line 142
    move-object v3, v5

    .line 143
    goto :goto_0

    .line 144
    :cond_4
    iget-object v0, v1, Lud/e;->t:Ljava/util/List;

    .line 145
    .line 146
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    if-eqz v4, :cond_6

    .line 155
    .line 156
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    check-cast v4, Lud/r;

    .line 161
    .line 162
    iget-object v5, v4, Lud/r;->k:Lod/d;

    .line 163
    .line 164
    iget-object v5, v5, Lod/d;->k:Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v5, p4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    if-eqz v5, :cond_5

    .line 171
    .line 172
    iget-object v5, v4, Lud/r;->m:Lb5/k;

    .line 173
    .line 174
    invoke-virtual {v5}, Lb5/k;->h()Z

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    if-nez v5, :cond_5

    .line 179
    .line 180
    iget-object v5, v1, Lud/e;->k:Lud/u;

    .line 181
    .line 182
    iget-object v5, v5, Lud/u;->g:Lqe/x;

    .line 183
    .line 184
    iget-object v5, v5, Lqe/x;->c:Lqe/k;

    .line 185
    .line 186
    iget-object v6, v4, Lud/r;->k:Lod/d;

    .line 187
    .line 188
    iget-object v6, v6, Lod/d;->h:Lqd/j;

    .line 189
    .line 190
    iget-object v7, p2, Lod/d;->h:Lqd/j;

    .line 191
    .line 192
    invoke-virtual {v5, v6, v7}, Lqe/k;->d(Lqd/j;Lqd/j;)Lqe/l;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    invoke-virtual {v5}, Lqe/l;->d()Z

    .line 197
    .line 198
    .line 199
    move-result v5

    .line 200
    if-eqz v5, :cond_5

    .line 201
    .line 202
    move-object v3, v4

    .line 203
    :cond_6
    :goto_0
    if-nez v3, :cond_7

    .line 204
    .line 205
    goto/16 :goto_3

    .line 206
    .line 207
    :cond_7
    invoke-virtual {p0, v3}, Lbe/a0;->g(Lud/r;)V

    .line 208
    .line 209
    .line 210
    iget-object p2, v3, Lmd/e;->g:Lmd/f;

    .line 211
    .line 212
    invoke-virtual {p2, v2}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    check-cast p2, Lnd/z;

    .line 217
    .line 218
    iget-object p4, p1, Lmd/e;->g:Lmd/f;

    .line 219
    .line 220
    invoke-virtual {p4, v2}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 221
    .line 222
    .line 223
    move-result-object p4

    .line 224
    check-cast p4, Lnd/z;

    .line 225
    .line 226
    if-eqz p4, :cond_b

    .line 227
    .line 228
    if-eqz p2, :cond_b

    .line 229
    .line 230
    iget-object p2, p2, Lnd/z;->g:Ljava/util/HashSet;

    .line 231
    .line 232
    invoke-virtual {p2}, Ljava/util/HashSet;->isEmpty()Z

    .line 233
    .line 234
    .line 235
    move-result p4

    .line 236
    if-nez p4, :cond_b

    .line 237
    .line 238
    invoke-virtual {p2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 243
    .line 244
    .line 245
    move-result p4

    .line 246
    if-eqz p4, :cond_b

    .line 247
    .line 248
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object p4

    .line 252
    check-cast p4, Ljava/lang/String;

    .line 253
    .line 254
    invoke-static {p4}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 255
    .line 256
    .line 257
    move-result-object p4

    .line 258
    invoke-virtual {p0, p1, p4, p3}, Lbe/a0;->r(Lud/r;Lqd/j;Ljava/util/HashSet;)V

    .line 259
    .line 260
    .line 261
    goto :goto_1

    .line 262
    :cond_8
    iget-object p2, p0, Lbe/a0;->h:Lud/u;

    .line 263
    .line 264
    iget-object p2, p2, Lud/u;->s:Led/c;

    .line 265
    .line 266
    iget-object v0, v0, Lod/a;->g:Lqd/j;

    .line 267
    .line 268
    invoke-virtual {p2, v0}, Led/c;->c(Lqd/j;)Led/b;

    .line 269
    .line 270
    .line 271
    move-result-object p2

    .line 272
    if-eqz p2, :cond_b

    .line 273
    .line 274
    iget-object p2, p2, Led/b;->d:Ljava/util/Map;

    .line 275
    .line 276
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 277
    .line 278
    .line 279
    move-result-object p2

    .line 280
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 281
    .line 282
    .line 283
    move-result-object p2

    .line 284
    :cond_9
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    if-eqz v0, :cond_a

    .line 289
    .line 290
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    check-cast v0, Ljava/util/Map$Entry;

    .line 295
    .line 296
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    check-cast v1, Ljava/lang/String;

    .line 301
    .line 302
    invoke-virtual {v1, p4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    if-eqz v1, :cond_9

    .line 307
    .line 308
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object p2

    .line 312
    move-object v3, p2

    .line 313
    check-cast v3, Led/d;

    .line 314
    .line 315
    :cond_a
    if-eqz v3, :cond_b

    .line 316
    .line 317
    iget-object p2, v3, Led/d;->k:Ljava/util/List;

    .line 318
    .line 319
    if-eqz p2, :cond_b

    .line 320
    .line 321
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 322
    .line 323
    .line 324
    move-result p4

    .line 325
    if-nez p4, :cond_b

    .line 326
    .line 327
    iget-object p4, p1, Lmd/e;->g:Lmd/f;

    .line 328
    .line 329
    invoke-virtual {p4, v2}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 330
    .line 331
    .line 332
    move-result-object p4

    .line 333
    check-cast p4, Lnd/z;

    .line 334
    .line 335
    if-eqz p4, :cond_b

    .line 336
    .line 337
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 338
    .line 339
    .line 340
    move-result-object p2

    .line 341
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 342
    .line 343
    .line 344
    move-result p4

    .line 345
    if-eqz p4, :cond_b

    .line 346
    .line 347
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object p4

    .line 351
    check-cast p4, Lqd/j;

    .line 352
    .line 353
    invoke-virtual {p0, p1, p4, p3}, Lbe/a0;->r(Lud/r;Lqd/j;Ljava/util/HashSet;)V

    .line 354
    .line 355
    .line 356
    goto :goto_2

    .line 357
    :cond_b
    :goto_3
    return-void
.end method

.method public l(Lqd/j;Lqd/j;)Z
    .locals 1

    .line 1
    invoke-virtual {p1, p2}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    iget-object v0, p0, Lbe/a0;->h:Lud/u;

    .line 10
    .line 11
    iget-object v0, v0, Lud/u;->s:Led/c;

    .line 12
    .line 13
    invoke-virtual {p1}, Lqd/j;->l()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p2}, Lqd/j;->l()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {v0, p1}, Led/c;->d(Ljava/lang/String;)Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1
.end method

.method public n(Lud/r;Lvd/a;Lqd/j;Ljava/util/List;)Z
    .locals 4

    .line 1
    iget-object v0, p2, Lvd/a;->a:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "Incorrect return type in method signature: "

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    iget-object v3, p1, Lud/r;->k:Lod/d;

    .line 7
    .line 8
    iget-object v3, v3, Lod/d;->h:Lqd/j;

    .line 9
    .line 10
    invoke-virtual {p0, p3, v3}, Lbe/a0;->q(Lqd/j;Lqd/j;)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    new-instance p2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-virtual {p1, p2}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return v2

    .line 32
    :catch_0
    move-exception p2

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p0, p1, p2, p4}, Lbe/a0;->i(Lud/r;Lvd/a;Ljava/util/List;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    if-nez p2, :cond_1

    .line 39
    .line 40
    return v2

    .line 41
    :cond_1
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    iput-object p2, p1, Lud/r;->u:Ljava/util/List;

    .line 46
    .line 47
    iput-object p3, p1, Lud/r;->t:Lqd/j;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    const/4 p1, 0x1

    .line 50
    return p1

    .line 51
    :goto_0
    new-instance p3, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string p4, "Type validation failed for signature: "

    .line 54
    .line 55
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    invoke-virtual {p1, p3, p2}, Lnd/b0;->M(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    return v2
.end method

.method public o(Lqd/j;)I
    .locals 2

    .line 1
    if-eqz p1, :cond_6

    .line 2
    .line 3
    sget-object v0, Lqd/j;->k:Lqd/e;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lqd/j;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    invoke-virtual {p1}, Lqd/j;->w()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_5

    .line 17
    .line 18
    iget-object v0, p0, Lbe/a0;->h:Lud/u;

    .line 19
    .line 20
    iget-object v0, v0, Lud/u;->s:Led/c;

    .line 21
    .line 22
    invoke-virtual {p1}, Lqd/j;->l()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v0, v0, Led/c;->b:Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    sget-object v0, Lqd/j;->r:Lqd/e;

    .line 36
    .line 37
    invoke-virtual {p0, p1, v0}, Lbe/a0;->l(Lqd/j;Lqd/j;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    sget-object v0, Lqd/j;->p:Lqd/e;

    .line 44
    .line 45
    invoke-virtual {p0, p1, v0}, Lbe/a0;->l(Lqd/j;Lqd/j;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    sget-object v0, Lqd/j;->o:Lqd/e;

    .line 53
    .line 54
    invoke-virtual {p0, p1, v0}, Lbe/a0;->l(Lqd/j;Lqd/j;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_3

    .line 59
    .line 60
    sget-object v0, Lqd/j;->q:Lqd/e;

    .line 61
    .line 62
    invoke-virtual {p0, p1, v0}, Lbe/a0;->l(Lqd/j;Lqd/j;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_6

    .line 67
    .line 68
    :cond_3
    const/4 p1, 0x1

    .line 69
    return p1

    .line 70
    :cond_4
    :goto_0
    const/4 p1, 0x2

    .line 71
    return p1

    .line 72
    :cond_5
    :goto_1
    const/4 p1, 0x3

    .line 73
    return p1

    .line 74
    :cond_6
    :goto_2
    const/4 p1, 0x4

    .line 75
    return p1
.end method

.method public p(Lqd/j;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Lqd/j;->k()Lqd/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-virtual {p1}, Lqd/j;->m()Lqd/j;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v2, p0, Lbe/a0;->h:Lud/u;

    .line 14
    .line 15
    invoke-virtual {v2, p1}, Lud/u;->g(Lqd/j;)Lud/e;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    invoke-virtual {v0}, Lqd/j;->m()Lqd/j;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    invoke-virtual {v0}, Lqd/j;->m()Lqd/j;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lqd/e;

    .line 33
    .line 34
    iget-object v2, v2, Lqd/e;->K:Ljava/lang/String;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    move-object v2, v0

    .line 38
    check-cast v2, Lqd/e;

    .line 39
    .line 40
    iget-object v2, v2, Lqd/e;->K:Ljava/lang/String;

    .line 41
    .line 42
    :goto_0
    const-string v3, "."

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_4

    .line 49
    .line 50
    iget-object p1, p1, Lud/e;->v:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_5

    .line 61
    .line 62
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lud/e;

    .line 67
    .line 68
    iget-object v0, v0, Lud/e;->m:Lod/a;

    .line 69
    .line 70
    invoke-virtual {v0}, Lod/a;->k()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    :goto_1
    return v1

    .line 81
    :cond_4
    iget-object v3, p0, Lbe/a0;->h:Lud/u;

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-static {v2}, Lqd/j;->x(Ljava/lang/String;)Lqd/j;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-static {v3, v2}, Lod/a;->e(Lud/u;Lqd/j;)Lod/a;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v3, v2}, Lud/u;->f(Lod/a;)Lud/e;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    if-nez v2, :cond_6

    .line 99
    .line 100
    :cond_5
    const/4 p1, 0x0

    .line 101
    return p1

    .line 102
    :cond_6
    iget-object v3, v2, Lud/e;->x:Lud/e;

    .line 103
    .line 104
    invoke-virtual {v3, p1}, Lud/e;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-nez v3, :cond_8

    .line 109
    .line 110
    iget-object v3, p1, Lud/e;->v:Ljava/util/List;

    .line 111
    .line 112
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-eqz v3, :cond_7

    .line 117
    .line 118
    new-instance v3, Ljava/util/ArrayList;

    .line 119
    .line 120
    const/4 v4, 0x5

    .line 121
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 122
    .line 123
    .line 124
    iput-object v3, p1, Lud/e;->v:Ljava/util/List;

    .line 125
    .line 126
    :cond_7
    iget-object v3, p1, Lud/e;->v:Ljava/util/List;

    .line 127
    .line 128
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    iput-object p1, v2, Lud/e;->x:Lud/e;

    .line 132
    .line 133
    iget-object v2, v2, Lud/e;->m:Lod/a;

    .line 134
    .line 135
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    iget-object v3, p1, Lud/e;->k:Lud/u;

    .line 139
    .line 140
    iget-object v4, v2, Lod/a;->g:Lqd/j;

    .line 141
    .line 142
    invoke-virtual {v2, v3, v4, v1}, Lod/a;->r(Lud/u;Lqd/j;Z)V

    .line 143
    .line 144
    .line 145
    iget-object p1, p1, Lud/e;->m:Lod/a;

    .line 146
    .line 147
    iput-object p1, v2, Lod/a;->k:Lod/a;

    .line 148
    .line 149
    :cond_8
    invoke-virtual {p0, v0}, Lbe/a0;->p(Lqd/j;)Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    return p1
.end method

.method public q(Lqd/j;Lqd/j;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lbe/a0;->h:Lud/u;

    .line 2
    .line 3
    iget-object v0, v0, Lud/u;->g:Lqe/x;

    .line 4
    .line 5
    iget-object v0, v0, Lqe/x;->c:Lqe/k;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Lqe/k;->d(Lqd/j;Lqd/j;)Lqe/l;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    sget-object v0, Lqe/l;->n:Lqe/l;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-ne p2, v0, :cond_2

    .line 15
    .line 16
    invoke-virtual {p1}, Lqd/j;->v()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {p1}, Lqd/j;->l()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    sget-object v0, Lkd/d;->a:Ljava/util/regex/Pattern;

    .line 27
    .line 28
    sget-object v0, Lxe/q;->b:Lxe/q;

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    sget-object v0, Lkd/d;->c:Ljava/util/HashSet;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    sget-object v0, Lkd/d;->b:Ljava/util/regex/Pattern;

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    const/16 v0, 0x2e

    .line 59
    .line 60
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-lez v0, :cond_2

    .line 65
    .line 66
    const-string v0, "\\."

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    array-length v0, p1

    .line 73
    move v2, v1

    .line 74
    :goto_0
    if-ge v2, v0, :cond_2

    .line 75
    .line 76
    aget-object v3, p1, v2

    .line 77
    .line 78
    invoke-static {v3}, Lkd/d;->d(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-nez v3, :cond_0

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    return v1

    .line 89
    :cond_2
    sget-object p1, Lqe/l;->l:Lqe/l;

    .line 90
    .line 91
    if-eq p2, p1, :cond_3

    .line 92
    .line 93
    const/4 p1, 0x1

    .line 94
    return p1

    .line 95
    :cond_3
    :goto_1
    return v1
.end method

.method public r(Lud/r;Lqd/j;Ljava/util/HashSet;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Lqd/j;->w()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lbe/a0;->o(Lqd/j;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x3

    .line 12
    const/4 v2, 0x1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "Thrown type has an unknown type hierarchy: "

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Lnd/b0;->J(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    if-ne v0, v2, :cond_4

    .line 30
    .line 31
    :goto_0
    invoke-virtual {p3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    :cond_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {p2}, Lqd/j;->l()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    move v0, v2

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    iget-object v3, p0, Lbe/a0;->h:Lud/u;

    .line 60
    .line 61
    iget-object v3, v3, Lud/u;->s:Led/c;

    .line 62
    .line 63
    invoke-virtual {v3, v1}, Led/c;->d(Ljava/lang/String;)Ljava/util/Set;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    :goto_1
    if-eqz v0, :cond_1

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    sget-object p3, Lmd/b;->v:Lmd/b;

    .line 75
    .line 76
    iget-object p1, p1, Lmd/e;->g:Lmd/f;

    .line 77
    .line 78
    invoke-virtual {p1, p3}, Lmd/f;->c(Loc/a;)Loc/b;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Lnd/z;

    .line 83
    .line 84
    iget-object p1, p1, Lnd/z;->g:Ljava/util/HashSet;

    .line 85
    .line 86
    invoke-virtual {p2}, Lqd/j;->l()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-virtual {p1, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    :cond_4
    :goto_2
    return-void
.end method
