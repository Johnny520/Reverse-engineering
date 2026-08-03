.class public final synthetic Lc9/p;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic j:Landroid/app/Activity;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;Lwb/kv;Landroid/app/Activity;Lfg/l;I)V
    .locals 0

    .line 22
    iput p8, p0, Lc9/p;->g:I

    iput-object p1, p0, Lc9/p;->k:Ljava/lang/Object;

    iput-boolean p2, p0, Lc9/p;->h:Z

    iput-object p3, p0, Lc9/p;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p4, p0, Lc9/p;->l:Ljava/lang/Object;

    iput-object p5, p0, Lc9/p;->m:Ljava/lang/Object;

    iput-object p6, p0, Lc9/p;->j:Landroid/app/Activity;

    iput-object p7, p0, Lc9/p;->n:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;Landroid/app/Activity;Ljava/lang/Object;Lfg/l;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lc9/p;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lc9/p;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    iput-object p2, p0, Lc9/p;->j:Landroid/app/Activity;

    .line 10
    .line 11
    iput-object p3, p0, Lc9/p;->k:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lc9/p;->l:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lc9/p;->m:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, Lc9/p;->n:Ljava/lang/Object;

    .line 18
    .line 19
    iput-boolean p7, p0, Lc9/p;->h:Z

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    iget v0, p0, Lc9/p;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc9/p;->k:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v8, v0

    .line 9
    check-cast v8, Lhb/i0;

    .line 10
    .line 11
    iget-boolean v0, p0, Lc9/p;->h:Z

    .line 12
    .line 13
    iget-object v2, p0, Lc9/p;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    iget-object v1, p0, Lc9/p;->l:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v3, v1

    .line 18
    check-cast v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    iget-object v1, p0, Lc9/p;->m:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v4, v1

    .line 23
    check-cast v4, Lwb/kv;

    .line 24
    .line 25
    iget-object v5, p0, Lc9/p;->j:Landroid/app/Activity;

    .line 26
    .line 27
    iget-object v1, p0, Lc9/p;->n:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v7, v1

    .line 30
    check-cast v7, Lhb/x;

    .line 31
    .line 32
    :try_start_0
    sget-object v1, Lhb/m;->a:Lhb/l;

    .line 33
    .line 34
    invoke-static {v0}, Lhb/m;->c(Z)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    move-object v6, v0

    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    new-instance v1, Lsf/f;

    .line 42
    .line 43
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    move-object v6, v1

    .line 47
    :goto_0
    iget-object v0, v8, Lhb/i0;->c:Landroid/os/Handler;

    .line 48
    .line 49
    new-instance v1, Lca/j;

    .line 50
    .line 51
    invoke-direct/range {v1 .. v8}, Lca/j;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;Lwb/kv;Landroid/app/Activity;Ljava/lang/Object;Lhb/x;Lhb/i0;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_0
    iget-object v0, p0, Lc9/p;->k:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v8, v0

    .line 61
    check-cast v8, Lca/e0;

    .line 62
    .line 63
    iget-boolean v0, p0, Lc9/p;->h:Z

    .line 64
    .line 65
    iget-object v2, p0, Lc9/p;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 66
    .line 67
    iget-object v1, p0, Lc9/p;->l:Ljava/lang/Object;

    .line 68
    .line 69
    move-object v3, v1

    .line 70
    check-cast v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 71
    .line 72
    iget-object v1, p0, Lc9/p;->m:Ljava/lang/Object;

    .line 73
    .line 74
    move-object v4, v1

    .line 75
    check-cast v4, Lwb/kv;

    .line 76
    .line 77
    iget-object v5, p0, Lc9/p;->j:Landroid/app/Activity;

    .line 78
    .line 79
    iget-object v1, p0, Lc9/p;->n:Ljava/lang/Object;

    .line 80
    .line 81
    move-object v7, v1

    .line 82
    check-cast v7, Lca/l;

    .line 83
    .line 84
    :try_start_1
    sget-object v1, Lhb/m;->a:Lhb/l;

    .line 85
    .line 86
    invoke-static {v0}, Lhb/m;->c(Z)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 90
    move-object v6, v0

    .line 91
    goto :goto_1

    .line 92
    :catchall_1
    move-exception v0

    .line 93
    new-instance v1, Lsf/f;

    .line 94
    .line 95
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    move-object v6, v1

    .line 99
    :goto_1
    iget-object v0, v8, Lca/e0;->d:Landroid/os/Handler;

    .line 100
    .line 101
    new-instance v1, Lca/j;

    .line 102
    .line 103
    invoke-direct/range {v1 .. v8}, Lca/j;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;Lwb/kv;Landroid/app/Activity;Ljava/lang/Object;Lca/l;Lca/e0;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :pswitch_1
    iget-object v0, p0, Lc9/p;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 111
    .line 112
    iget-object v1, p0, Lc9/p;->j:Landroid/app/Activity;

    .line 113
    .line 114
    iget-object v12, p0, Lc9/p;->k:Ljava/lang/Object;

    .line 115
    .line 116
    iget-object v2, p0, Lc9/p;->l:Ljava/lang/Object;

    .line 117
    .line 118
    move-object v3, v2

    .line 119
    check-cast v3, Lfg/l;

    .line 120
    .line 121
    iget-object v2, p0, Lc9/p;->m:Ljava/lang/Object;

    .line 122
    .line 123
    move-object v5, v2

    .line 124
    check-cast v5, Ljava/lang/String;

    .line 125
    .line 126
    iget-object v2, p0, Lc9/p;->n:Ljava/lang/Object;

    .line 127
    .line 128
    move-object v6, v2

    .line 129
    check-cast v6, Ljava/lang/String;

    .line 130
    .line 131
    iget-boolean v10, p0, Lc9/p;->h:Z

    .line 132
    .line 133
    sget-object v2, Lc9/b0;->a:Landroid/os/Handler;

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-nez v0, :cond_3

    .line 140
    .line 141
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-nez v0, :cond_3

    .line 146
    .line 147
    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-eqz v0, :cond_0

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_0
    instance-of v0, v12, Lsf/f;

    .line 155
    .line 156
    if-nez v0, :cond_2

    .line 157
    .line 158
    move-object v2, v12

    .line 159
    check-cast v2, Ljava/util/List;

    .line 160
    .line 161
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-eqz v0, :cond_1

    .line 166
    .line 167
    const-string v0, "\u6ca1\u6709\u53ef\u9009\u62e9\u7684\u4f1a\u8bdd"

    .line 168
    .line 169
    invoke-static {v1, v0}, Lc9/b0;->h(Landroid/app/Activity;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_1
    new-instance v4, Lbi/c;

    .line 174
    .line 175
    const/4 v0, 0x6

    .line 176
    invoke-direct {v4, v0}, Lbi/c;-><init>(I)V

    .line 177
    .line 178
    .line 179
    const/4 v9, 0x0

    .line 180
    const/16 v11, 0xb80

    .line 181
    .line 182
    const/4 v7, 0x1

    .line 183
    const/4 v8, 0x0

    .line 184
    invoke-static/range {v1 .. v11}, Lwb/y2;->U1(Landroid/app/Activity;Ljava/util/List;Lfg/l;Lfg/a;Ljava/lang/String;Ljava/lang/String;ZLc9/v;Ljava/util/Set;ZI)V

    .line 185
    .line 186
    .line 187
    :cond_2
    :goto_2
    invoke-static {v12}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    if-eqz v0, :cond_3

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    const-string v3, "[Hchat:ConversationGroup] "

    .line 198
    .line 199
    const-string v4, " \u8bfb\u53d6\u4f1a\u8bdd\u5931\u8d25: "

    .line 200
    .line 201
    invoke-static {v3, v5, v4, v2, v0}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 202
    .line 203
    .line 204
    const-string v0, "\u8bfb\u53d6\u4f1a\u8bdd\u5931\u8d25"

    .line 205
    .line 206
    invoke-static {v1, v0}, Lc9/b0;->h(Landroid/app/Activity;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    :cond_3
    :goto_3
    return-void

    .line 210
    nop

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
