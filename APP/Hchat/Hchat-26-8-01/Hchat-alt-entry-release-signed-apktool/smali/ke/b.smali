.class public final Lke/b;
.super Lbe/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lke/b;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final g(Lud/r;)V
    .locals 8

    .line 1
    iget-boolean v0, p1, Lud/r;->p:Z

    .line 2
    .line 3
    if-nez v0, :cond_4

    .line 4
    .line 5
    iget-object v0, p1, Lud/r;->G:Lxd/b;

    .line 6
    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    iget-object v0, p1, Lud/r;->z:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_4

    .line 16
    .line 17
    sget-object v0, Lmd/b;->c:Lmd/b;

    .line 18
    .line 19
    iget-object v1, p1, Lmd/e;->g:Lmd/f;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Lmd/f;->b(Loc/a;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v1, Lke/a;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-direct {v1, v0, v2}, Lke/a;-><init>(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    iget-object v2, p1, Lud/r;->G:Lxd/b;

    .line 41
    .line 42
    invoke-static {p1, v1, v2}, Lx6/d;->h0(Lud/r;Lke/e;Lud/j;)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p1, Lud/r;->z:Ljava/util/List;

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eq v1, v2, :cond_3

    .line 56
    .line 57
    iget-object v1, p1, Lud/r;->z:Ljava/util/List;

    .line 58
    .line 59
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_3

    .line 68
    .line 69
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Lud/a;

    .line 74
    .line 75
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-nez v3, :cond_1

    .line 80
    .line 81
    iget-object v3, v2, Lud/a;->l:Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-nez v3, :cond_1

    .line 88
    .line 89
    sget-object v3, Lmd/a;->z:Lmd/a;

    .line 90
    .line 91
    iget-object v4, v2, Lmd/e;->g:Lmd/f;

    .line 92
    .line 93
    invoke-virtual {v4, v3}, Lmd/f;->a(Lmd/a;)Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-nez v3, :cond_1

    .line 98
    .line 99
    sget-object v3, Lmd/a;->s:Lmd/a;

    .line 100
    .line 101
    iget-object v4, v2, Lmd/e;->g:Lmd/f;

    .line 102
    .line 103
    invoke-virtual {v4, v3}, Lmd/f;->a(Lmd/a;)Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-nez v3, :cond_1

    .line 108
    .line 109
    sget-object v3, Lmd/a;->u:Lmd/a;

    .line 110
    .line 111
    iget-object v4, v2, Lmd/e;->g:Lmd/f;

    .line 112
    .line 113
    invoke-virtual {v4, v3}, Lmd/f;->a(Lmd/a;)Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    if-nez v3, :cond_1

    .line 118
    .line 119
    new-instance v3, Lfc/f;

    .line 120
    .line 121
    invoke-direct {v3}, Lfc/f;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3}, Lfc/f;->o()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v3}, Lfc/f;->f()V

    .line 128
    .line 129
    .line 130
    invoke-static {p1}, Lfd/g;->h(Lud/r;)Lfd/g;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    new-instance v5, Lfd/e;

    .line 135
    .line 136
    const/4 v6, 0x1

    .line 137
    invoke-direct {v5, v4, v6}, Lfd/e;-><init>(Lfd/g;Z)V

    .line 138
    .line 139
    .line 140
    iget-object v4, v2, Lud/a;->l:Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    :catch_0
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    if-eqz v6, :cond_2

    .line 151
    .line 152
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    check-cast v6, Lud/p;

    .line 157
    .line 158
    const/4 v7, 0x0

    .line 159
    :try_start_0
    invoke-virtual {v5, v6, v3, v7}, Lfd/e;->j(Lud/p;Lfc/f;Lfd/d;)V
    :try_end_0
    .catch Laf/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_2
    invoke-virtual {v3}, Lfc/f;->f()V

    .line 164
    .line 165
    .line 166
    iget-object v3, v3, Lfc/f;->a:Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    const-string v4, "*/"

    .line 173
    .line 174
    const-string v5, "*\\/"

    .line 175
    .line 176
    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    new-instance v4, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    const-string v5, "Code restructure failed: missing block: "

    .line 187
    .line 188
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string v2, ", code lost:"

    .line 195
    .line 196
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-virtual {p1, v2}, Lnd/b0;->K(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :cond_3
    new-instance v0, Lke/g;

    .line 212
    .line 213
    const/4 v1, 0x2

    .line 214
    invoke-direct {v0, v1}, Lke/g;-><init>(I)V

    .line 215
    .line 216
    .line 217
    iget-object v1, p1, Lud/r;->G:Lxd/b;

    .line 218
    .line 219
    invoke-static {p1, v0, v1}, Lx6/d;->h0(Lud/r;Lke/e;Lud/j;)V

    .line 220
    .line 221
    .line 222
    :cond_4
    :goto_2
    return-void
.end method
