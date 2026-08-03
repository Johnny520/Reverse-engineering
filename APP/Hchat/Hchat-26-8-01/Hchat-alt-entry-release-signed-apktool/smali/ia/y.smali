.class public final synthetic Lia/y;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Z

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lia/a0;ZZLfg/l;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lia/y;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lia/y;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Lia/y;->h:Z

    .line 10
    .line 11
    iput-boolean p3, p0, Lia/y;->i:Z

    .line 12
    .line 13
    iput-object p4, p0, Lia/y;->k:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ls3/a;ZLfg/a;Lfg/a;ZLfg/a;Lfg/a;Ls3/e;)V
    .locals 0

    .line 16
    const/4 p3, 0x1

    iput p3, p0, Lia/y;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lia/y;->j:Ljava/lang/Object;

    iput-boolean p2, p0, Lia/y;->h:Z

    iput-boolean p5, p0, Lia/y;->i:Z

    iput-object p8, p0, Lia/y;->k:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZZLjava/util/Set;Li0/a1;)V
    .locals 1

    .line 17
    const/4 v0, 0x2

    iput v0, p0, Lia/y;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lia/y;->h:Z

    iput-boolean p2, p0, Lia/y;->i:Z

    iput-object p3, p0, Lia/y;->j:Ljava/lang/Object;

    iput-object p4, p0, Lia/y;->k:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lia/y;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lia/y;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/Set;

    .line 9
    .line 10
    iget-object v1, p0, Lia/y;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Li0/a1;

    .line 13
    .line 14
    iget-boolean v2, p0, Lia/y;->h:Z

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ljava/util/Set;

    .line 23
    .line 24
    check-cast v2, Ljava/util/Collection;

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    sget-object v0, Ltf/v;->g:Ltf/v;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-boolean v2, p0, Lia/y;->i:Z

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Ljava/util/Set;

    .line 44
    .line 45
    check-cast v0, Ljava/lang/Iterable;

    .line 46
    .line 47
    invoke-static {v2, v0}, Ltf/d0;->T(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Ljava/util/Set;

    .line 57
    .line 58
    check-cast v0, Ljava/lang/Iterable;

    .line 59
    .line 60
    invoke-static {v2, v0}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :goto_0
    invoke-interface {v1, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :goto_1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 68
    .line 69
    return-object v0

    .line 70
    :pswitch_0
    iget-object v0, p0, Lia/y;->j:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Ls3/a;

    .line 73
    .line 74
    iget-object v1, p0, Lia/y;->k:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v1, Ls3/e;

    .line 77
    .line 78
    iget-boolean v2, v0, Ls3/a;->e:Z

    .line 79
    .line 80
    iget-boolean v3, p0, Lia/y;->h:Z

    .line 81
    .line 82
    if-ne v2, v3, :cond_2

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_2
    iput-boolean v3, v0, Ls3/a;->e:Z

    .line 86
    .line 87
    iget-object v2, v0, Ls3/a;->f:Lr3/a;

    .line 88
    .line 89
    if-eqz v2, :cond_3

    .line 90
    .line 91
    iget-object v2, v2, Lr3/a;->b:Lr3/d;

    .line 92
    .line 93
    if-eqz v2, :cond_3

    .line 94
    .line 95
    invoke-virtual {v2}, Lr3/d;->a()V

    .line 96
    .line 97
    .line 98
    :cond_3
    :goto_2
    iget-boolean v2, v0, Ls3/a;->d:Z

    .line 99
    .line 100
    iget-boolean v3, p0, Lia/y;->i:Z

    .line 101
    .line 102
    if-ne v2, v3, :cond_4

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_4
    iput-boolean v3, v0, Ls3/a;->d:Z

    .line 106
    .line 107
    iget-object v2, v0, Ls3/a;->f:Lr3/a;

    .line 108
    .line 109
    if-eqz v2, :cond_5

    .line 110
    .line 111
    iget-object v2, v2, Lr3/a;->b:Lr3/d;

    .line 112
    .line 113
    if-eqz v2, :cond_5

    .line 114
    .line 115
    invoke-virtual {v2}, Lr3/d;->a()V

    .line 116
    .line 117
    .line 118
    :cond_5
    :goto_3
    iget-object v2, v1, Ls3/e;->c:Li0/j1;

    .line 119
    .line 120
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    check-cast v2, Lr3/c;

    .line 125
    .line 126
    iget-object v3, v1, Ls3/e;->b:Li0/j1;

    .line 127
    .line 128
    invoke-virtual {v3}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    check-cast v3, Ljava/util/List;

    .line 133
    .line 134
    iget-object v1, v1, Ls3/e;->d:Li0/j1;

    .line 135
    .line 136
    invoke-virtual {v1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, Ljava/util/List;

    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    iput-object v2, v0, Ls3/a;->a:Lr3/c;

    .line 152
    .line 153
    iput-object v3, v0, Ls3/a;->b:Ljava/util/List;

    .line 154
    .line 155
    iput-object v1, v0, Ls3/a;->c:Ljava/util/List;

    .line 156
    .line 157
    iget-object v1, v0, Ls3/a;->f:Lr3/a;

    .line 158
    .line 159
    if-eqz v1, :cond_6

    .line 160
    .line 161
    iget-object v1, v1, Lr3/a;->b:Lr3/d;

    .line 162
    .line 163
    if-eqz v1, :cond_6

    .line 164
    .line 165
    invoke-virtual {v1, v0}, Lr3/d;->c(Ls3/a;)V

    .line 166
    .line 167
    .line 168
    :cond_6
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 169
    .line 170
    return-object v0

    .line 171
    :pswitch_1
    iget-object v0, p0, Lia/y;->j:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v0, Lia/a0;

    .line 174
    .line 175
    iget-object v1, v0, Lia/a0;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 176
    .line 177
    iget-boolean v2, p0, Lia/y;->h:Z

    .line 178
    .line 179
    iget-boolean v3, p0, Lia/y;->i:Z

    .line 180
    .line 181
    iget-object v4, p0, Lia/y;->k:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v4, Lfg/l;

    .line 184
    .line 185
    const/4 v5, 0x0

    .line 186
    :try_start_0
    invoke-virtual {v0, v2, v3}, Lia/a0;->p(ZZ)Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 191
    .line 192
    .line 193
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 194
    goto :goto_4

    .line 195
    :catchall_0
    move-exception v2

    .line 196
    :try_start_1
    new-instance v3, Lsf/f;

    .line 197
    .line 198
    invoke-direct {v3, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 199
    .line 200
    .line 201
    move-object v2, v3

    .line 202
    :goto_4
    invoke-static {v2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    if-eqz v3, :cond_7

    .line 207
    .line 208
    iget-object v6, v0, Lia/a0;->d:Lab/b;

    .line 209
    .line 210
    const-string v7, "\u6062\u590d\u670b\u53cb\u5708\u4f2a\u4e92\u52a8\u7f13\u5b58\u5931\u8d25"

    .line 211
    .line 212
    invoke-virtual {v6, v7, v3}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    goto :goto_5

    .line 216
    :catchall_1
    move-exception v0

    .line 217
    goto :goto_6

    .line 218
    :cond_7
    :goto_5
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 219
    .line 220
    instance-of v6, v2, Lsf/f;

    .line 221
    .line 222
    if-eqz v6, :cond_8

    .line 223
    .line 224
    move-object v2, v3

    .line 225
    :cond_8
    check-cast v2, Ljava/lang/Boolean;

    .line 226
    .line 227
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 228
    .line 229
    .line 230
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 231
    invoke-virtual {v1, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 232
    .line 233
    .line 234
    iget-object v0, v0, Lia/a0;->h:Landroid/os/Handler;

    .line 235
    .line 236
    new-instance v1, Lba/e;

    .line 237
    .line 238
    const/4 v3, 0x2

    .line 239
    invoke-direct {v1, v4, v2, v3}, Lba/e;-><init>(Ljava/lang/Object;ZI)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 243
    .line 244
    .line 245
    goto/16 :goto_1

    .line 246
    .line 247
    :goto_6
    invoke-virtual {v1, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 248
    .line 249
    .line 250
    throw v0

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
