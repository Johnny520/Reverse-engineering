.class public final synthetic Lpa;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lpa;->ε:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget p0, p0, Lpa;->ε:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    sget-object p0, Lbv1;->β:Landroid/app/AlertDialog;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void

    .line 15
    :pswitch_0
    invoke-static {p1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkHook;->β(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    sget-object p0, Lia0;->α:Landroid/app/AlertDialog;

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void

    .line 27
    :pswitch_2
    sget-object p0, Los;->α:Landroid/os/Handler;

    .line 28
    .line 29
    const-string p0, "\u7528\u6237\u70b9\u51fb\u6682\u4e0d\u91cd\u542f\u6309\u94ae"

    .line 30
    .line 31
    invoke-static {p0}, Los;->φ(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Los;->ω()V

    .line 35
    .line 36
    .line 37
    sget-object p0, Los;->Ξ:Ljava/lang/Object;

    .line 38
    .line 39
    monitor-enter p0

    .line 40
    :try_start_0
    invoke-static {}, Los;->ε()V

    .line 41
    .line 42
    .line 43
    invoke-static {}, Los;->γ()V

    .line 44
    .line 45
    .line 46
    sget-object p1, Los;->Ο:Ljava/util/LinkedHashMap;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    monitor-exit p0

    .line 52
    invoke-static {v0}, Los;->κ(Z)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    monitor-exit p0

    .line 58
    throw p1

    .line 59
    :pswitch_3
    sget-object p0, Los;->α:Landroid/os/Handler;

    .line 60
    .line 61
    const-string p0, "\u7528\u6237\u70b9\u51fb\u91cd\u542f\u6309\u94ae"

    .line 62
    .line 63
    invoke-static {p0}, Los;->φ(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-static {}, Los;->ω()V

    .line 67
    .line 68
    .line 69
    :try_start_1
    invoke-static {}, Los;->ω()V

    .line 70
    .line 71
    .line 72
    sget-object p0, Los;->ο:Ljava/lang/ref/WeakReference;

    .line 73
    .line 74
    const/4 p1, 0x0

    .line 75
    if-eqz p0, :cond_2

    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    check-cast p0, Landroid/app/Activity;

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    move-object p0, p1

    .line 85
    :goto_0
    if-nez p0, :cond_3

    .line 86
    .line 87
    const-string p0, "restartApp failed, no active activity"

    .line 88
    .line 89
    const-string v0, "r459ca5a644abf82d"

    .line 90
    .line 91
    invoke-static {v0, p0, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    if-nez v1, :cond_4

    .line 108
    .line 109
    const-string p0, "restartApp failed, cannot get launch intent"

    .line 110
    .line 111
    const-string v0, "r459ca5a644abf82d"

    .line 112
    .line 113
    invoke-static {v0, p0, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_4
    const p1, 0x14008000

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 121
    .line 122
    .line 123
    sget-object p1, Los;->Ξ:Ljava/lang/Object;

    .line 124
    .line 125
    monitor-enter p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 126
    :try_start_2
    invoke-static {}, Los;->ε()V

    .line 127
    .line 128
    .line 129
    invoke-static {}, Los;->γ()V

    .line 130
    .line 131
    .line 132
    sget-object v2, Los;->Ο:Ljava/util/LinkedHashMap;

    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 135
    .line 136
    .line 137
    :try_start_3
    monitor-exit p1

    .line 138
    invoke-static {v0}, Los;->κ(Z)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 142
    .line 143
    .line 144
    :try_start_4
    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 145
    .line 146
    .line 147
    :catchall_1
    :try_start_5
    sget-object p0, Los;->α:Landroid/os/Handler;

    .line 148
    .line 149
    new-instance p1, Ls0;

    .line 150
    .line 151
    const/16 v0, 0xf

    .line 152
    .line 153
    invoke-direct {p1, v0}, Ls0;-><init>(I)V

    .line 154
    .line 155
    .line 156
    const-wide/16 v0, 0xfa

    .line 157
    .line 158
    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 159
    .line 160
    .line 161
    const-string p0, "\u5e94\u7528\u91cd\u542f\u8bf7\u6c42\u5df2\u53d1\u51fa"

    .line 162
    .line 163
    invoke-static {p0}, Los;->φ(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :catchall_2
    move-exception p0

    .line 168
    monitor-exit p1

    .line 169
    throw p0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 170
    :catch_0
    move-exception p0

    .line 171
    const-string p1, "restartApp failed"

    .line 172
    .line 173
    const-string v0, "r459ca5a644abf82d"

    .line 174
    .line 175
    invoke-static {v0, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 176
    .line 177
    .line 178
    :goto_1
    return-void

    .line 179
    :pswitch_4
    invoke-static {p1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->η(Landroid/view/View;)V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :pswitch_5
    invoke-static {p1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->τ(Landroid/view/View;)V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
