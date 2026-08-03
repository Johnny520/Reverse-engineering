.class public final Lb/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroidx/lifecycle/o;


# instance fields
.field public final synthetic g:I

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lb/f;Landroidx/lifecycle/s;Lb/g;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lb/d;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lb/d;->k:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lb/d;->h:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lb/d;->i:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual {p2, p0}, Landroidx/lifecycle/s;->a(Landroidx/lifecycle/p;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Lvg/c;Li0/d;Li0/y1;Lgg/u;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lb/d;->g:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lb/d;->h:Ljava/lang/Object;

    iput-object p2, p0, Lb/d;->i:Ljava/lang/Object;

    iput-object p3, p0, Lb/d;->j:Ljava/lang/Object;

    iput-object p4, p0, Lb/d;->k:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Landroidx/lifecycle/q;Landroidx/lifecycle/k;)V
    .locals 9

    .line 1
    iget v0, p0, Lb/d;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, Ly1/t2;->a:[I

    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    aget p2, v0, p2

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    const/4 v1, 0x1

    .line 16
    packed-switch p2, :pswitch_data_1

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lokio/a;->k()V

    .line 20
    .line 21
    .line 22
    :cond_0
    :goto_0
    :pswitch_0
    move-object v6, p0

    .line 23
    goto/16 :goto_7

    .line 24
    .line 25
    :pswitch_1
    iget-object p1, p0, Lb/d;->j:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Li0/y1;

    .line 28
    .line 29
    invoke-virtual {p1}, Li0/y1;->x()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :pswitch_2
    iget-object p1, p0, Lb/d;->j:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Li0/y1;

    .line 36
    .line 37
    iget-object p2, p1, Li0/y1;->c:Ljava/lang/Object;

    .line 38
    .line 39
    monitor-enter p2

    .line 40
    :try_start_0
    iput-boolean v1, p1, Li0/y1;->t:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    monitor-exit p2

    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    move-object p1, v0

    .line 46
    monitor-exit p2

    .line 47
    throw p1

    .line 48
    :pswitch_3
    iget-object p1, p0, Lb/d;->i:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Li0/d;

    .line 51
    .line 52
    const/4 p2, 0x0

    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    iget-object p1, p1, Li0/d;->i:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Lj8/f;

    .line 58
    .line 59
    iget-object v2, p1, Lj8/f;->b:Ljava/lang/Object;

    .line 60
    .line 61
    monitor-enter v2

    .line 62
    :try_start_1
    iget-object v3, p1, Lj8/f;->b:Ljava/lang/Object;

    .line 63
    .line 64
    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 65
    :try_start_2
    iget-boolean v4, p1, Lj8/f;->a:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 66
    .line 67
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 68
    if-eqz v4, :cond_1

    .line 69
    .line 70
    :goto_1
    monitor-exit v2

    .line 71
    goto :goto_4

    .line 72
    :cond_1
    :try_start_4
    iget-object v3, p1, Lj8/f;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v3, Ljava/util/ArrayList;

    .line 75
    .line 76
    iget-object v4, p1, Lj8/f;->d:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v4, Ljava/util/ArrayList;

    .line 79
    .line 80
    iput-object v4, p1, Lj8/f;->c:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object v3, p1, Lj8/f;->d:Ljava/lang/Object;

    .line 83
    .line 84
    iput-boolean v1, p1, Lj8/f;->a:Z

    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    move v1, p2

    .line 91
    :goto_2
    if-ge v1, p1, :cond_2

    .line 92
    .line 93
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    check-cast v4, Lwf/c;

    .line 98
    .line 99
    sget-object v5, Lsf/n;->a:Lsf/n;

    .line 100
    .line 101
    invoke-interface {v4, v5}, Lwf/c;->resumeWith(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    add-int/lit8 v1, v1, 0x1

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :catchall_1
    move-exception v0

    .line 108
    move-object p1, v0

    .line 109
    goto :goto_3

    .line 110
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :catchall_2
    move-exception v0

    .line 115
    move-object p1, v0

    .line 116
    monitor-exit v3

    .line 117
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 118
    :goto_3
    monitor-exit v2

    .line 119
    throw p1

    .line 120
    :cond_3
    :goto_4
    iget-object p1, p0, Lb/d;->j:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast p1, Li0/y1;

    .line 123
    .line 124
    iget-object v1, p1, Li0/y1;->c:Ljava/lang/Object;

    .line 125
    .line 126
    monitor-enter v1

    .line 127
    :try_start_5
    iget-boolean v2, p1, Li0/y1;->t:Z

    .line 128
    .line 129
    if-eqz v2, :cond_4

    .line 130
    .line 131
    iput-boolean p2, p1, Li0/y1;->t:Z

    .line 132
    .line 133
    invoke-virtual {p1}, Li0/y1;->y()Lqg/f;

    .line 134
    .line 135
    .line 136
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 137
    goto :goto_5

    .line 138
    :catchall_3
    move-exception v0

    .line 139
    move-object p1, v0

    .line 140
    goto :goto_6

    .line 141
    :cond_4
    :goto_5
    monitor-exit v1

    .line 142
    if-eqz v0, :cond_0

    .line 143
    .line 144
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 145
    .line 146
    check-cast v0, Lqg/g;

    .line 147
    .line 148
    invoke-virtual {v0, p1}, Lqg/g;->resumeWith(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    goto/16 :goto_0

    .line 152
    .line 153
    :goto_6
    monitor-exit v1

    .line 154
    throw p1

    .line 155
    :pswitch_4
    iget-object p2, p0, Lb/d;->h:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p2, Lvg/c;

    .line 158
    .line 159
    new-instance v2, Lci/e;

    .line 160
    .line 161
    iget-object v3, p0, Lb/d;->k:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v3, Lgg/u;

    .line 164
    .line 165
    iget-object v4, p0, Lb/d;->j:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v4, Li0/y1;

    .line 168
    .line 169
    const/4 v7, 0x0

    .line 170
    const/16 v8, 0xd

    .line 171
    .line 172
    move-object v6, p0

    .line 173
    move-object v5, p1

    .line 174
    invoke-direct/range {v2 .. v8}, Lci/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 175
    .line 176
    .line 177
    invoke-static {p2, v0, v2, v1}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 178
    .line 179
    .line 180
    :goto_7
    return-void

    .line 181
    :pswitch_5
    move-object v6, p0

    .line 182
    sget-object p1, Landroidx/lifecycle/k;->ON_START:Landroidx/lifecycle/k;

    .line 183
    .line 184
    if-ne p2, p1, :cond_6

    .line 185
    .line 186
    iget-object p1, v6, Lb/d;->k:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast p1, Lb/f;

    .line 189
    .line 190
    iget-object p2, v6, Lb/d;->i:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast p2, Lb/g;

    .line 193
    .line 194
    iget-object v0, p1, Lb/f;->c:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v0, Ltf/k;

    .line 197
    .line 198
    invoke-virtual {v0, p2}, Ltf/k;->addLast(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    new-instance v0, Lb/e;

    .line 202
    .line 203
    invoke-direct {v0, p1, p2}, Lb/e;-><init>(Lb/f;Lb/g;)V

    .line 204
    .line 205
    .line 206
    iget-object p2, p2, Lb/g;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 207
    .line 208
    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 212
    .line 213
    const/16 v1, 0x21

    .line 214
    .line 215
    if-lt p2, v1, :cond_5

    .line 216
    .line 217
    invoke-virtual {p1}, Lb/f;->d()V

    .line 218
    .line 219
    .line 220
    :cond_5
    iput-object v0, v6, Lb/d;->j:Ljava/lang/Object;

    .line 221
    .line 222
    goto :goto_8

    .line 223
    :cond_6
    sget-object p1, Landroidx/lifecycle/k;->ON_STOP:Landroidx/lifecycle/k;

    .line 224
    .line 225
    if-ne p2, p1, :cond_7

    .line 226
    .line 227
    iget-object p1, v6, Lb/d;->j:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast p1, Lb/e;

    .line 230
    .line 231
    if-eqz p1, :cond_9

    .line 232
    .line 233
    invoke-virtual {p1}, Lb/e;->cancel()V

    .line 234
    .line 235
    .line 236
    goto :goto_8

    .line 237
    :cond_7
    sget-object p1, Landroidx/lifecycle/k;->ON_DESTROY:Landroidx/lifecycle/k;

    .line 238
    .line 239
    if-ne p2, p1, :cond_9

    .line 240
    .line 241
    iget-object p1, v6, Lb/d;->h:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast p1, Landroidx/lifecycle/s;

    .line 244
    .line 245
    invoke-virtual {p1, p0}, Landroidx/lifecycle/s;->f(Landroidx/lifecycle/p;)V

    .line 246
    .line 247
    .line 248
    iget-object p1, v6, Lb/d;->i:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast p1, Lb/g;

    .line 251
    .line 252
    iget-object p1, p1, Lb/g;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 253
    .line 254
    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    iget-object p1, v6, Lb/d;->j:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast p1, Lb/e;

    .line 260
    .line 261
    if-eqz p1, :cond_8

    .line 262
    .line 263
    invoke-virtual {p1}, Lb/e;->cancel()V

    .line 264
    .line 265
    .line 266
    :cond_8
    const/4 p1, 0x0

    .line 267
    iput-object p1, v6, Lb/d;->j:Ljava/lang/Object;

    .line 268
    .line 269
    :cond_9
    :goto_8
    return-void

    .line 270
    nop

    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
    .end packed-switch

    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
