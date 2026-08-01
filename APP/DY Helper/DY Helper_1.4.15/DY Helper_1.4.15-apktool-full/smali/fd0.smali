.class public final synthetic Lfd0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lnd0;

.field public final synthetic η:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lnd0;)V
    .locals 1

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Lfd0;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfd0;->η:Ljava/util/List;

    iput-object p2, p0, Lfd0;->ζ:Lnd0;

    return-void
.end method

.method public synthetic constructor <init>(Lnd0;Ljava/util/List;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lfd0;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lfd0;->ζ:Lnd0;

    .line 8
    .line 9
    iput-object p2, p0, Lfd0;->η:Ljava/util/List;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Lfd0;->ε:I

    .line 2
    .line 3
    iget-object v1, p0, Lfd0;->η:Ljava/util/List;

    .line 4
    .line 5
    iget-object p0, p0, Lfd0;->ζ:Lnd0;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lnd0;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_4

    .line 18
    .line 19
    new-instance v0, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_2

    .line 33
    .line 34
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    move-object v5, v4

    .line 39
    check-cast v5, Ljava/lang/Number;

    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 42
    .line 43
    .line 44
    move-result-wide v5

    .line 45
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    sget-object v8, Lbe0;->α:Lbe0;

    .line 50
    .line 51
    invoke-virtual {v8}, Lbe0;->ξ()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    sget-object v9, Lxc0;->α:Lxc0;

    .line 56
    .line 57
    invoke-virtual {v9}, Lxc0;->γ()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    invoke-static {v8, v9}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    new-instance v9, Lf7;

    .line 66
    .line 67
    invoke-direct {v9, v2, v8}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    new-instance v8, Ls9;

    .line 71
    .line 72
    const/16 v10, 0x1a

    .line 73
    .line 74
    invoke-direct {v8, v7, v10}, Ls9;-><init>(Ljava/lang/String;I)V

    .line 75
    .line 76
    .line 77
    new-instance v7, Ly30;

    .line 78
    .line 79
    invoke-direct {v7, v9, v2, v8}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 80
    .line 81
    .line 82
    new-instance v8, Lx30;

    .line 83
    .line 84
    invoke-direct {v8, v7}, Lx30;-><init>(Ly30;)V

    .line 85
    .line 86
    .line 87
    :cond_0
    invoke-virtual {v8}, Lx30;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    if-eqz v7, :cond_1

    .line 92
    .line 93
    invoke-virtual {v8}, Lx30;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    check-cast v7, Lxd0;

    .line 98
    .line 99
    sget-object v9, Lst;->α:Lst;

    .line 100
    .line 101
    iget-object v7, v7, Lxd0;->ε:Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {v5, v6, v7}, Lst;->ε(JLjava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    if-eqz v7, :cond_0

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_1
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    iget-object v3, p0, Lnd0;->Β:Ljava/util/LinkedHashSet;

    .line 119
    .line 120
    if-eqz v2, :cond_3

    .line 121
    .line 122
    invoke-static {v1}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    check-cast v0, Ljava/util/Collection;

    .line 127
    .line 128
    invoke-virtual {v3, v0}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Lnd0;->ε()V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_3
    invoke-static {v3, v0}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Lnd0;->ε()V

    .line 139
    .line 140
    .line 141
    sget-object v1, Lpd0;->α:Ljava/util/concurrent/ExecutorService;

    .line 142
    .line 143
    new-instance v2, Ljd0;

    .line 144
    .line 145
    invoke-direct {v2, v0, p0}, Ljd0;-><init>(Ljava/util/ArrayList;Lnd0;)V

    .line 146
    .line 147
    .line 148
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 149
    .line 150
    .line 151
    iget-object v1, p0, Lnd0;->γ:Landroid/os/Handler;

    .line 152
    .line 153
    new-instance v2, Ljd0;

    .line 154
    .line 155
    invoke-direct {v2, p0, v0}, Ljd0;-><init>(Lnd0;Ljava/util/ArrayList;)V

    .line 156
    .line 157
    .line 158
    const-wide/16 v3, 0x2ee0

    .line 159
    .line 160
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 161
    .line 162
    .line 163
    :cond_4
    :goto_1
    return-void

    .line 164
    :pswitch_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_7

    .line 173
    .line 174
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    check-cast v1, Ljava/lang/Number;

    .line 179
    .line 180
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 181
    .line 182
    .line 183
    move-result-wide v3

    .line 184
    :try_start_0
    sget-object v1, Lst;->α:Lst;

    .line 185
    .line 186
    const-string v5, ""

    .line 187
    .line 188
    invoke-virtual {v1, v3, v4, v5}, Lst;->π(JLjava/lang/String;)Lpt;

    .line 189
    .line 190
    .line 191
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    goto :goto_3

    .line 193
    :catchall_0
    move-exception v1

    .line 194
    new-instance v3, Leo1;

    .line 195
    .line 196
    invoke-direct {v3, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 197
    .line 198
    .line 199
    move-object v1, v3

    .line 200
    :goto_3
    instance-of v3, v1, Leo1;

    .line 201
    .line 202
    if-eqz v3, :cond_6

    .line 203
    .line 204
    const/4 v1, 0x0

    .line 205
    :cond_6
    check-cast v1, Lpt;

    .line 206
    .line 207
    if-eqz v1, :cond_5

    .line 208
    .line 209
    new-instance v3, Lcd0;

    .line 210
    .line 211
    invoke-direct {v3, p0, v1, v2}, Lcd0;-><init>(Lnd0;Lpt;I)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0, v3}, Lnd0;->δ(Lp70;)V

    .line 215
    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_7
    return-void

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
