.class public final synthetic Lr4;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr4;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lr4;->ζ:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget v0, p0, Lr4;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lr4;->ζ:Landroid/content/Context;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    :try_start_0
    sget-object v0, Lx9;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object p0, v0

    .line 19
    :goto_0
    invoke-static {p0}, Lx9;->ο(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    move-object p0, v0

    .line 27
    new-instance v0, Leo1;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    move-object p0, v0

    .line 33
    :goto_1
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const-string v0, "beta verifier warm-up failed: "

    .line 44
    .line 45
    invoke-static {v0, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const/4 v0, 0x4

    .line 50
    const-string v2, "DYHelper"

    .line 51
    .line 52
    invoke-static {v2, p0, v1, v0, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    return-void

    .line 56
    :pswitch_0
    new-instance v0, Lgj1;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    sget-object v1, Lxb;->π:Lrk0;

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    invoke-static {p0, v0, v1, v2}, Lxb;->з(Landroid/content/Context;Ljava/util/concurrent/Executor;Lhj1;Z)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_1
    new-instance v3, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 69
    .line 70
    new-instance v9, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 71
    .line 72
    invoke-direct {v9}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 73
    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    const/4 v5, 0x1

    .line 77
    const-wide/16 v6, 0x0

    .line 78
    .line 79
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 80
    .line 81
    invoke-direct/range {v3 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 82
    .line 83
    .line 84
    new-instance v0, Lr4;

    .line 85
    .line 86
    const/4 v1, 0x2

    .line 87
    invoke-direct {v0, p0, v1}, Lr4;-><init>(Landroid/content/Context;I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :pswitch_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 95
    .line 96
    const/4 v2, 0x1

    .line 97
    const/16 v3, 0x21

    .line 98
    .line 99
    if-lt v0, v3, :cond_7

    .line 100
    .line 101
    new-instance v4, Landroid/content/ComponentName;

    .line 102
    .line 103
    const-string v5, "androidx.appcompat.app.AppLocalesMetadataHolderService"

    .line 104
    .line 105
    invoke-direct {v4, p0, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-virtual {v5, v4}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-eq v5, v2, :cond_7

    .line 117
    .line 118
    const-string v5, "locale"

    .line 119
    .line 120
    if-lt v0, v3, :cond_4

    .line 121
    .line 122
    sget-object v0, Landroidx/appcompat/app/α;->λ:Ld7;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    new-instance v3, Ly6;

    .line 128
    .line 129
    invoke-direct {v3, v0}, Ly6;-><init>(Ld7;)V

    .line 130
    .line 131
    .line 132
    :cond_2
    invoke-virtual {v3}, Ly6;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_3

    .line 137
    .line 138
    invoke-virtual {v3}, Ly6;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, Landroidx/appcompat/app/α;

    .line 149
    .line 150
    if-eqz v0, :cond_2

    .line 151
    .line 152
    check-cast v0, Landroidx/appcompat/app/β;

    .line 153
    .line 154
    iget-object v0, v0, Landroidx/appcompat/app/β;->ο:Landroid/content/Context;

    .line 155
    .line 156
    if-eqz v0, :cond_2

    .line 157
    .line 158
    invoke-virtual {v0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    :cond_3
    if-eqz v1, :cond_5

    .line 163
    .line 164
    invoke-static {v1}, Lt4;->α(Ljava/lang/Object;)Landroid/os/LocaleList;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    new-instance v1, Lcv0;

    .line 169
    .line 170
    new-instance v3, Ldv0;

    .line 171
    .line 172
    invoke-direct {v3, v0}, Ldv0;-><init>(Landroid/os/LocaleList;)V

    .line 173
    .line 174
    .line 175
    invoke-direct {v1, v3}, Lcv0;-><init>(Ldv0;)V

    .line 176
    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_4
    sget-object v1, Landroidx/appcompat/app/α;->η:Lcv0;

    .line 180
    .line 181
    if-eqz v1, :cond_5

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_5
    sget-object v1, Lcv0;->β:Lcv0;

    .line 185
    .line 186
    :goto_2
    iget-object v0, v1, Lcv0;->α:Ldv0;

    .line 187
    .line 188
    iget-object v0, v0, Ldv0;->α:Landroid/os/LocaleList;

    .line 189
    .line 190
    invoke-virtual {v0}, Landroid/os/LocaleList;->isEmpty()Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_6

    .line 195
    .line 196
    invoke-static {p0}, Lyh;->м(Landroid/content/Context;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-virtual {p0, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    if-eqz v1, :cond_6

    .line 205
    .line 206
    invoke-static {v0}, Ls4;->α(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-static {v1, v0}, Lt4;->β(Ljava/lang/Object;Landroid/os/LocaleList;)V

    .line 211
    .line 212
    .line 213
    :cond_6
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-virtual {p0, v4, v2, v2}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 218
    .line 219
    .line 220
    :cond_7
    sput-boolean v2, Landroidx/appcompat/app/α;->κ:Z

    .line 221
    .line 222
    return-void

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
