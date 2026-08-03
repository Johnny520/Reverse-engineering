.class public final synthetic Lca/t;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lca/e0;

.field public final synthetic h:J

.field public final synthetic i:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic j:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic k:Lwb/kv;

.field public final synthetic l:Landroid/app/Activity;

.field public final synthetic m:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Lca/e0;JLjava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;Lwb/kv;Landroid/app/Activity;Lfg/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lca/t;->g:Lca/e0;

    .line 5
    .line 6
    iput-wide p2, p0, Lca/t;->h:J

    .line 7
    .line 8
    iput-object p4, p0, Lca/t;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    iput-object p5, p0, Lca/t;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    iput-object p6, p0, Lca/t;->k:Lwb/kv;

    .line 13
    .line 14
    iput-object p7, p0, Lca/t;->l:Landroid/app/Activity;

    .line 15
    .line 16
    iput-object p8, p0, Lca/t;->m:Lfg/l;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget-wide v8, p0, Lca/t;->h:J

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_a

    .line 8
    .line 9
    iget-object v0, v0, Lj8/p;->f:Lj8/h;

    .line 10
    .line 11
    if-eqz v0, :cond_a

    .line 12
    .line 13
    invoke-virtual {v0, v8, v9}, Lj8/h;->r(J)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Lj8/h;->i(Ljava/lang/Object;)Lj8/i;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_9

    .line 22
    .line 23
    iget-object v2, v1, Lj8/i;->c:Ljava/lang/String;

    .line 24
    .line 25
    iget v1, v1, Lj8/i;->b:I

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    const/4 v4, 0x0

    .line 29
    if-ne v1, v3, :cond_6

    .line 30
    .line 31
    invoke-virtual {v0, v8, v9}, Lj8/h;->r(J)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    if-eqz v5, :cond_3

    .line 36
    .line 37
    invoke-static {v5}, Lj8/h;->k(Ljava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-eq v6, v3, :cond_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    invoke-static {v5}, Lj8/h;->l(Ljava/lang/Object;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    const-string v6, "desc"

    .line 49
    .line 50
    const-string v7, "content"

    .line 51
    .line 52
    const-string v10, "title"

    .line 53
    .line 54
    filled-new-array {v6, v7, v10}, [Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-static {v3, v6}, Lj8/h;->D(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-nez v6, :cond_1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    move-object v3, v4

    .line 70
    :goto_0
    if-eqz v3, :cond_2

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    invoke-virtual {v0, v5}, Lj8/h;->i(Ljava/lang/Object;)Lj8/i;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    if-eqz v3, :cond_3

    .line 78
    .line 79
    iget-object v3, v3, Lj8/i;->c:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-nez v5, :cond_3

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    :goto_1
    move-object v3, v4

    .line 89
    :goto_2
    if-nez v3, :cond_4

    .line 90
    .line 91
    const-string v3, ""

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :catchall_0
    move-exception v0

    .line 95
    goto :goto_5

    .line 96
    :cond_4
    :goto_3
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-eqz v5, :cond_5

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_5
    move-object v2, v3

    .line 104
    :cond_6
    :goto_4
    const/4 v3, 0x2

    .line 105
    if-eq v1, v3, :cond_7

    .line 106
    .line 107
    const/4 v3, 0x4

    .line 108
    if-ne v1, v3, :cond_8

    .line 109
    .line 110
    :cond_7
    invoke-virtual {v0, v8, v9}, Lj8/h;->v(J)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    if-eqz v0, :cond_8

    .line 115
    .line 116
    new-instance v3, Ljava/io/File;

    .line 117
    .line 118
    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-eqz v3, :cond_8

    .line 126
    .line 127
    move-object v4, v0

    .line 128
    :cond_8
    new-instance v0, Lca/z;

    .line 129
    .line 130
    invoke-direct {v0, v1, v2, v4}, Lca/z;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    move-object v5, v0

    .line 134
    goto :goto_6

    .line 135
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 136
    .line 137
    const-string v1, "\u6536\u85cf\u5185\u5bb9\u4e0d\u53ef\u7528"

    .line 138
    .line 139
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v0

    .line 143
    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 144
    .line 145
    const-string v1, "\u6536\u85cf\u63a5\u53e3\u4e0d\u53ef\u7528"

    .line 146
    .line 147
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 151
    :goto_5
    new-instance v1, Lsf/f;

    .line 152
    .line 153
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    move-object v5, v1

    .line 157
    :goto_6
    iget-object v7, p0, Lca/t;->g:Lca/e0;

    .line 158
    .line 159
    iget-object v10, v7, Lca/e0;->d:Landroid/os/Handler;

    .line 160
    .line 161
    new-instance v0, Lca/w;

    .line 162
    .line 163
    iget-object v1, p0, Lca/t;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 164
    .line 165
    iget-object v2, p0, Lca/t;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 166
    .line 167
    iget-object v3, p0, Lca/t;->k:Lwb/kv;

    .line 168
    .line 169
    iget-object v4, p0, Lca/t;->l:Landroid/app/Activity;

    .line 170
    .line 171
    iget-object v6, p0, Lca/t;->m:Lfg/l;

    .line 172
    .line 173
    invoke-direct/range {v0 .. v9}, Lca/w;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;Lwb/kv;Landroid/app/Activity;Ljava/lang/Object;Lfg/l;Lca/e0;J)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v10, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 177
    .line 178
    .line 179
    return-void
.end method
