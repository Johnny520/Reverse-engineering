.class public final synthetic Lze0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lk01;

.field public final synthetic η:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lk01;Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p3, p0, Lze0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lze0;->ζ:Lk01;

    .line 4
    .line 5
    iput-object p2, p0, Lze0;->η:Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lze0;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lze0;->ζ:Lk01;

    .line 11
    .line 12
    iget-object p0, p0, Lze0;->η:Landroid/content/Context;

    .line 13
    .line 14
    iget-object v0, v0, Lk01;->β:Ljava/lang/Object;

    .line 15
    .line 16
    instance-of v5, v0, Landroid/app/Application;

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    check-cast v0, Landroid/app/Application;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v0, v2

    .line 24
    :goto_0
    if-eqz v0, :cond_2

    .line 25
    .line 26
    sget-object p0, Lr9;->α:Landroid/os/Handler;

    .line 27
    .line 28
    invoke-static {v0}, Lr9;->α(Landroid/content/Context;)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lr9;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 32
    .line 33
    invoke-virtual {p0, v4, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p0, Lq9;

    .line 41
    .line 42
    invoke-direct {p0, v4}, Lq9;-><init>(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 46
    .line 47
    .line 48
    const-string p0, "r62fe5deb53d30681"

    .line 49
    .line 50
    const-string v0, "notice lifecycle installed"

    .line 51
    .line 52
    invoke-static {p0, v0, v2, v1, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    sget-object v0, Lr9;->α:Landroid/os/Handler;

    .line 57
    .line 58
    invoke-static {p0}, Lr9;->α(Landroid/content/Context;)V

    .line 59
    .line 60
    .line 61
    :goto_1
    sget-object p0, Ls62;->α:Ls62;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_0
    iget-object v0, p0, Lze0;->ζ:Lk01;

    .line 65
    .line 66
    iget-object p0, p0, Lze0;->η:Landroid/content/Context;

    .line 67
    .line 68
    iget-object v0, v0, Lk01;->β:Ljava/lang/Object;

    .line 69
    .line 70
    instance-of v5, v0, Landroid/app/Application;

    .line 71
    .line 72
    if-eqz v5, :cond_3

    .line 73
    .line 74
    check-cast v0, Landroid/app/Application;

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_3
    move-object v0, v2

    .line 78
    :goto_2
    if-eqz v0, :cond_8

    .line 79
    .line 80
    sget-object p0, Lcom/example/dyhelper/beta/BlacklistVerifier;->α:Lcom/example/dyhelper/beta/BlacklistVerifier;

    .line 81
    .line 82
    invoke-virtual {p0, v0}, Lcom/example/dyhelper/beta/BlacklistVerifier;->ε(Landroid/content/Context;)V

    .line 83
    .line 84
    .line 85
    sget-boolean p0, Lcom/example/dyhelper/beta/BlacklistVerifier;->ο:Z

    .line 86
    .line 87
    if-eqz p0, :cond_4

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_4
    sput-boolean v3, Lcom/example/dyhelper/beta/BlacklistVerifier;->ο:Z

    .line 91
    .line 92
    new-instance p0, Lq9;

    .line 93
    .line 94
    invoke-direct {p0, v3}, Lq9;-><init>(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, p0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 98
    .line 99
    .line 100
    :goto_3
    invoke-static {v0}, Lu72;->ε(Landroid/content/Context;)V

    .line 101
    .line 102
    .line 103
    sget-object p0, Lu72;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 104
    .line 105
    invoke-virtual {p0, v4, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    const/16 v5, 0x16

    .line 110
    .line 111
    if-nez p0, :cond_6

    .line 112
    .line 113
    sget-object p0, Lu72;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 114
    .line 115
    invoke-virtual {p0, v4, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    if-nez p0, :cond_5

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_5
    sget-object p0, Lu72;->β:Landroid/os/Handler;

    .line 123
    .line 124
    new-instance v0, Lfb0;

    .line 125
    .line 126
    invoke-direct {v0, v5}, Lfb0;-><init>(I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_6
    new-instance p0, Lq9;

    .line 134
    .line 135
    const/4 v6, 0x2

    .line 136
    invoke-direct {p0, v6}, Lq9;-><init>(I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, p0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 140
    .line 141
    .line 142
    const-string p0, "r5f3b6ae7236977e4"

    .line 143
    .line 144
    const-string v0, "version update lifecycle installed"

    .line 145
    .line 146
    invoke-static {p0, v0, v2, v1, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    sget-object p0, Lu72;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 150
    .line 151
    invoke-virtual {p0, v4, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 152
    .line 153
    .line 154
    move-result p0

    .line 155
    if-nez p0, :cond_7

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_7
    sget-object p0, Lu72;->β:Landroid/os/Handler;

    .line 159
    .line 160
    new-instance v0, Lfb0;

    .line 161
    .line 162
    invoke-direct {v0, v5}, Lfb0;-><init>(I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 166
    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_8
    sget-object v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->α:Lcom/example/dyhelper/beta/BlacklistVerifier;

    .line 170
    .line 171
    invoke-virtual {v0, p0}, Lcom/example/dyhelper/beta/BlacklistVerifier;->ε(Landroid/content/Context;)V

    .line 172
    .line 173
    .line 174
    invoke-static {p0}, Lu72;->ε(Landroid/content/Context;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v4}, Lu72;->α(Z)V

    .line 178
    .line 179
    .line 180
    :goto_4
    const-string p0, "DYHelper"

    .line 181
    .line 182
    const-string v0, "\u521d\u59cb\u5316\u7248\u672c\u66f4\u65b0\u68c0\u67e5"

    .line 183
    .line 184
    invoke-static {p0, v0, v2, v1, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    sget-object p0, Ls62;->α:Ls62;

    .line 188
    .line 189
    return-object p0

    .line 190
    nop

    .line 191
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
