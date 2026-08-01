.class public final synthetic Lgd0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lgd0;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lgd0;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 1
    iget p1, p0, Lgd0;->ε:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object p0, p0, Lgd0;->ζ:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Lz61;

    .line 10
    .line 11
    invoke-virtual {p0}, Lz61;->invoke()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    check-cast p0, Lsm1;

    .line 16
    .line 17
    iput p2, p0, Lsm1;->ε:I

    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    check-cast p0, Lz71;

    .line 21
    .line 22
    invoke-virtual {p0}, Lz71;->invoke()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_2
    check-cast p0, Lz71;

    .line 27
    .line 28
    invoke-virtual {p0}, Lz71;->invoke()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_3
    check-cast p0, Lli0;

    .line 33
    .line 34
    iget-boolean p1, p0, Lli0;->Γ:Z

    .line 35
    .line 36
    if-nez p1, :cond_3

    .line 37
    .line 38
    iget-boolean p1, p0, Lli0;->Δ:Z

    .line 39
    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_0
    const/4 p1, 0x1

    .line 44
    iput-boolean p1, p0, Lli0;->Δ:Z

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lli0;->ζ(Z)V

    .line 47
    .line 48
    .line 49
    sget-object p2, Lvj0;->α:Lvj0;

    .line 50
    .line 51
    iget-object p2, p0, Lli0;->β:Ljava/lang/ClassLoader;

    .line 52
    .line 53
    new-instance v1, Lji0;

    .line 54
    .line 55
    invoke-direct {v1, p0}, Lji0;-><init>(Lli0;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    sget-object v2, Lvj0;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 62
    .line 63
    invoke-virtual {v2, v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-nez p1, :cond_1

    .line 68
    .line 69
    move p1, v0

    .line 70
    goto :goto_2

    .line 71
    :cond_1
    :try_start_0
    sget-object p1, Lvj0;->γ:Ljava/util/concurrent/ExecutorService;

    .line 72
    .line 73
    new-instance v3, Lii0;

    .line 74
    .line 75
    invoke-direct {v3, v1, p2}, Lii0;-><init>(Lji0;Ljava/lang/ClassLoader;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p1, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 79
    .line 80
    .line 81
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :catchall_0
    move-exception p1

    .line 85
    new-instance p2, Leo1;

    .line 86
    .line 87
    invoke-direct {p2, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    move-object p1, p2

    .line 91
    :goto_0
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    if-nez p2, :cond_2

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 99
    .line 100
    .line 101
    const-string p1, "r52bdfd08354d522"

    .line 102
    .line 103
    const-string v1, "\u4e92\u52a8\u6d88\u606f\u6e05\u7406\u4efb\u52a1\u63d0\u4ea4\u5931\u8d25"

    .line 104
    .line 105
    invoke-static {p1, v1, p2}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 109
    .line 110
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    :goto_2
    if-nez p1, :cond_3

    .line 117
    .line 118
    iput-boolean v0, p0, Lli0;->Δ:Z

    .line 119
    .line 120
    invoke-virtual {p0, v0}, Lli0;->ζ(Z)V

    .line 121
    .line 122
    .line 123
    iget-object p0, p0, Lli0;->α:Landroid/app/Activity;

    .line 124
    .line 125
    const-string p1, "\u5df2\u6709\u4e92\u52a8\u6d88\u606f\u6e05\u7406\u4efb\u52a1\u6b63\u5728\u8fd0\u884c"

    .line 126
    .line 127
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 132
    .line 133
    .line 134
    :cond_3
    :goto_3
    return-void

    .line 135
    :pswitch_4
    check-cast p0, Lnd0;

    .line 136
    .line 137
    sget-object p1, Lbe0;->α:Lbe0;

    .line 138
    .line 139
    monitor-enter p1

    .line 140
    :try_start_1
    invoke-virtual {p1}, Lbe0;->ε()V

    .line 141
    .line 142
    .line 143
    invoke-static {}, Lbe0;->β()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 148
    .line 149
    .line 150
    move-result p2

    .line 151
    if-nez p2, :cond_4

    .line 152
    .line 153
    sget-object p2, Lyd0;->κ:Lyd0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 154
    .line 155
    monitor-exit p1

    .line 156
    goto :goto_5

    .line 157
    :catchall_1
    move-exception p0

    .line 158
    goto :goto_7

    .line 159
    :cond_4
    :try_start_2
    invoke-virtual {p1}, Lbe0;->ξ()Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 164
    .line 165
    .line 166
    move-result p2

    .line 167
    if-eqz p2, :cond_5

    .line 168
    .line 169
    sget-object p2, Lyd0;->ι:Lyd0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 170
    .line 171
    monitor-exit p1

    .line 172
    goto :goto_5

    .line 173
    :cond_5
    :try_start_3
    sget-object p2, Ljz;->ε:Ljz;

    .line 174
    .line 175
    const-string v1, "clear"

    .line 176
    .line 177
    invoke-virtual {p1, v1, p2}, Lbe0;->ν(Ljava/lang/String;Ljava/util/List;)Z

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    if-eqz p2, :cond_6

    .line 182
    .line 183
    sget-object p2, Lyd0;->θ:Lyd0;

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_6
    sget-object p2, Lyd0;->μ:Lyd0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 187
    .line 188
    :goto_4
    monitor-exit p1

    .line 189
    :goto_5
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    const/4 p2, 0x3

    .line 194
    if-eq p1, p2, :cond_8

    .line 195
    .line 196
    const/4 p2, 0x7

    .line 197
    if-eq p1, p2, :cond_7

    .line 198
    .line 199
    invoke-virtual {p0}, Lnd0;->ε()V

    .line 200
    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_7
    iget-object p0, p0, Lnd0;->α:Landroid/app/Activity;

    .line 204
    .line 205
    const-string p1, "\u9690\u85cf\u540d\u5355\u4fdd\u5b58\u5931\u8d25"

    .line 206
    .line 207
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 212
    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_8
    invoke-virtual {p0}, Lnd0;->ε()V

    .line 216
    .line 217
    .line 218
    iget-object p0, p0, Lnd0;->α:Landroid/app/Activity;

    .line 219
    .line 220
    const-string p1, "\u5df2\u5168\u90e8\u6062\u590d"

    .line 221
    .line 222
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 227
    .line 228
    .line 229
    :goto_6
    return-void

    .line 230
    :goto_7
    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 231
    throw p0

    .line 232
    nop

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
