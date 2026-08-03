.class public final synthetic Lh/Hchat/crash/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lh/Hchat/crash/d;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lh/Hchat/crash/d;->h:Landroid/app/Activity;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Lba/f;Landroid/app/Activity;)V
    .locals 0

    .line 10
    const/4 p1, 0x1

    iput p1, p0, Lh/Hchat/crash/d;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lh/Hchat/crash/d;->h:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Lh/Hchat/crash/d;->g:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lh/Hchat/crash/d;->h:Landroid/app/Activity;

    .line 9
    .line 10
    invoke-static {v0, v2, v1}, La7/a;->S(Landroid/content/Context;Lwb/u2;Z)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, Lh/Hchat/crash/d;->h:Landroid/app/Activity;

    .line 15
    .line 16
    sget-object v3, Lh/Hchat/crash/g;->a:Lh/Hchat/crash/g;

    .line 17
    .line 18
    sget-boolean v3, Lh/Hchat/crash/g;->i:Z

    .line 19
    .line 20
    if-nez v3, :cond_0

    .line 21
    .line 22
    sget-object v0, Lh/Hchat/crash/g;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_3

    .line 28
    .line 29
    :cond_0
    sget-object v3, Lh/Hchat/crash/g;->l:Ljava/lang/ref/WeakReference;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    if-ne v3, v0, :cond_8

    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-nez v3, :cond_8

    .line 42
    .line 43
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    goto/16 :goto_2

    .line 50
    .line 51
    :cond_1
    sget-object v3, Lh/Hchat/crash/g;->s:Ljava/io/File;

    .line 52
    .line 53
    const-string v4, "pendingReportFile"

    .line 54
    .line 55
    if-eqz v3, :cond_7

    .line 56
    .line 57
    invoke-static {v3}, Lh/Hchat/crash/g;->j(Ljava/io/File;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-eqz v3, :cond_5

    .line 62
    .line 63
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    const v4, 0x8000

    .line 75
    .line 76
    .line 77
    if-gt v2, v4, :cond_3

    .line 78
    .line 79
    move-object v2, v3

    .line 80
    goto :goto_0

    .line 81
    :cond_3
    invoke-static {v4, v3}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    const-string v4, "\n\n[\u65e5\u5fd7\u8f83\u957f\uff0c\u754c\u9762\u4ec5\u5c55\u793a\u90e8\u5206\u5185\u5bb9\uff1b\u70b9\u51fb\u65e5\u5fd7\u6216\u590d\u5236\u6309\u94ae\u4ecd\u4f1a\u590d\u5236\u5b8c\u6574\u5185\u5bb9]"

    .line 86
    .line 87
    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    :goto_0
    new-instance v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 92
    .line 93
    const/4 v5, 0x1

    .line 94
    invoke-direct {v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 95
    .line 96
    .line 97
    new-instance v6, Laa/c;

    .line 98
    .line 99
    const/16 v7, 0x9

    .line 100
    .line 101
    invoke-direct {v6, v4, v7, v3}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    new-instance v7, Lwb/su;

    .line 105
    .line 106
    invoke-direct {v7, v0, v3, v2}, Lwb/su;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    new-instance v2, Ls0/d;

    .line 110
    .line 111
    const v3, 0x79788a82

    .line 112
    .line 113
    .line 114
    invoke-direct {v2, v3, v7, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 115
    .line 116
    .line 117
    invoke-static {v0, v6, v2}, Lwb/y2;->P1(Landroid/app/Activity;Lfg/a;Ls0/d;)Lwb/kv;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-interface {v2}, Lwb/kv;->a()Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-eqz v3, :cond_4

    .line 126
    .line 127
    sput-object v2, Lh/Hchat/crash/g;->m:Lwb/kv;

    .line 128
    .line 129
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 130
    .line 131
    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    sput-object v1, Lh/Hchat/crash/g;->n:Ljava/lang/ref/WeakReference;

    .line 135
    .line 136
    sput-object v4, Lh/Hchat/crash/g;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_4
    invoke-virtual {v4, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 140
    .line 141
    .line 142
    sget-object v0, Lh/Hchat/crash/g;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 143
    .line 144
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_5
    :goto_1
    sget-object v0, Lh/Hchat/crash/g;->s:Ljava/io/File;

    .line 149
    .line 150
    if-eqz v0, :cond_6

    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 153
    .line 154
    .line 155
    sget-object v0, Lh/Hchat/crash/g;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 156
    .line 157
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 158
    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_6
    invoke-static {v4}, Lgg/l;->g(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v2

    .line 165
    :cond_7
    invoke-static {v4}, Lgg/l;->g(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw v2

    .line 169
    :cond_8
    :goto_2
    sget-object v0, Lh/Hchat/crash/g;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 170
    .line 171
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 172
    .line 173
    .line 174
    sget-object v0, Lh/Hchat/crash/g;->l:Ljava/lang/ref/WeakReference;

    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    check-cast v0, Landroid/app/Activity;

    .line 181
    .line 182
    if-eqz v0, :cond_a

    .line 183
    .line 184
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-nez v1, :cond_9

    .line 189
    .line 190
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    if-nez v1, :cond_9

    .line 195
    .line 196
    move-object v2, v0

    .line 197
    :cond_9
    if-eqz v2, :cond_a

    .line 198
    .line 199
    invoke-static {v2}, Lh/Hchat/crash/g;->k(Landroid/app/Activity;)V

    .line 200
    .line 201
    .line 202
    :cond_a
    :goto_3
    return-void

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
