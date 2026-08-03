.class public final synthetic Lfb/e1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lfb/e1;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lfb/e1;->h:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Lk8/g;Ljava/lang/String;)V
    .locals 0

    .line 10
    const/4 p1, 0x1

    iput p1, p0, Lfb/e1;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lfb/e1;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Lfb/e1;->g:I

    .line 2
    .line 3
    iget-object v1, p0, Lfb/e1;->h:Ljava/lang/String;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, Lk8/g;->q:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 9
    .line 10
    :try_start_0
    invoke-static {v1}, Lk8/g;->f(Ljava/lang/String;)[B

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eqz v2, :cond_3

    .line 15
    .line 16
    array-length v3, v2

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    sget-object v3, Lk8/g;->p:Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    const/16 v5, 0x40

    .line 27
    .line 28
    if-lt v4, v5, :cond_2

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Ljava/lang/String;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v2

    .line 52
    goto :goto_2

    .line 53
    :cond_1
    const/4 v4, 0x0

    .line 54
    :goto_0
    if-eqz v4, :cond_2

    .line 55
    .line 56
    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    :cond_3
    :goto_1
    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :goto_2
    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    throw v2

    .line 70
    :pswitch_0
    sget-object v0, Lfb/g1;->g:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 71
    .line 72
    sget-object v2, Lfb/g1;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 73
    .line 74
    sget-object v3, Lfb/g1;->a:Lfb/g1;

    .line 75
    .line 76
    :cond_4
    :goto_3
    :try_start_1
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, Lsf/e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 81
    .line 82
    if-eqz v3, :cond_5

    .line 83
    .line 84
    :try_start_2
    iget-object v4, v3, Lsf/e;->g:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v4, Landroid/content/Context;

    .line 87
    .line 88
    iget-object v3, v3, Lsf/e;->h:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v3, Lfb/d1;

    .line 91
    .line 92
    invoke-static {v4, v3}, Lfb/g1;->n(Landroid/content/Context;Lfb/d1;)V

    .line 93
    .line 94
    .line 95
    sget-object v3, Lsf/n;->a:Lsf/n;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :catchall_1
    move-exception v3

    .line 99
    :try_start_3
    new-instance v4, Lsf/f;

    .line 100
    .line 101
    invoke-direct {v4, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    move-object v3, v4

    .line 105
    :goto_4
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    if-eqz v3, :cond_4

    .line 110
    .line 111
    new-instance v4, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    const-string v5, "[Hchat:ScriptAgent] \u5f02\u6b65\u4fdd\u5b58\u4f1a\u8bdd\u5931\u8d25: "

    .line 117
    .line 118
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    invoke-static {v4, v3}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :catchall_2
    move-exception v3

    .line 133
    goto :goto_5

    .line 134
    :cond_5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_6

    .line 142
    .line 143
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, Lsf/e;

    .line 148
    .line 149
    if-eqz v0, :cond_6

    .line 150
    .line 151
    iget-object v1, v0, Lsf/e;->g:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v1, Landroid/content/Context;

    .line 154
    .line 155
    iget-object v0, v0, Lsf/e;->h:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, Lfb/d1;

    .line 158
    .line 159
    invoke-static {v1, v0}, Lfb/g1;->o(Landroid/content/Context;Lfb/d1;)V

    .line 160
    .line 161
    .line 162
    :cond_6
    return-void

    .line 163
    :goto_5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-eqz v0, :cond_7

    .line 171
    .line 172
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    check-cast v0, Lsf/e;

    .line 177
    .line 178
    if-eqz v0, :cond_7

    .line 179
    .line 180
    iget-object v1, v0, Lsf/e;->g:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v1, Landroid/content/Context;

    .line 183
    .line 184
    iget-object v0, v0, Lsf/e;->h:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v0, Lfb/d1;

    .line 187
    .line 188
    invoke-static {v1, v0}, Lfb/g1;->o(Landroid/content/Context;Lfb/d1;)V

    .line 189
    .line 190
    .line 191
    :cond_7
    throw v3

    .line 192
    nop

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
