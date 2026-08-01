.class public final synthetic Lhj;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# virtual methods
.method public final onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 p0, 0x0

    .line 2
    if-eqz p2, :cond_1

    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    sparse-switch p1, :sswitch_data_0

    .line 9
    .line 10
    .line 11
    goto :goto_1

    .line 12
    :sswitch_0
    const-string p1, "comment_bg_image_blur_radius"

    .line 13
    .line 14
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :sswitch_1
    const-string p1, "comment_bg_image_blur_enabled"

    .line 22
    .line 23
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :sswitch_2
    const-string p1, "comment_bg_cropped_uri"

    .line 31
    .line 32
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :sswitch_3
    const-string p1, "comment_bg_image_uri"

    .line 40
    .line 41
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    :goto_0
    sget-object p1, Lmj;->ι:Ljava/lang/Object;

    .line 49
    .line 50
    monitor-enter p1

    .line 51
    :try_start_0
    sput-object p0, Lmj;->κ:Lij;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    monitor-exit p1

    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    monitor-exit p1

    .line 57
    throw p0

    .line 58
    :cond_1
    :goto_1
    if-eqz p2, :cond_3

    .line 59
    .line 60
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    const v0, 0x596494c9

    .line 65
    .line 66
    .line 67
    if-eq p1, v0, :cond_2

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_2
    const-string p1, "comment_bg_color"

    .line 71
    .line 72
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-eqz p1, :cond_3

    .line 77
    .line 78
    sget-object p1, Lmj;->ι:Ljava/lang/Object;

    .line 79
    .line 80
    monitor-enter p1

    .line 81
    :try_start_1
    sput-object p0, Lmj;->θ:Llj;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 82
    .line 83
    monitor-exit p1

    .line 84
    goto :goto_2

    .line 85
    :catchall_1
    move-exception p0

    .line 86
    monitor-exit p1

    .line 87
    throw p0

    .line 88
    :cond_3
    :goto_2
    sget-object p0, Lmj;->α:Lh22;

    .line 89
    .line 90
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    if-eqz p0, :cond_4

    .line 103
    .line 104
    invoke-static {}, Lmj;->φ()V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_4
    sget-object p0, Lmj;->α:Lh22;

    .line 109
    .line 110
    invoke-virtual {p0}, Lh22;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    check-cast p0, Landroid/os/Handler;

    .line 115
    .line 116
    new-instance p1, Ls0;

    .line 117
    .line 118
    const/16 p2, 0x9

    .line 119
    .line 120
    invoke-direct {p1, p2}, Ls0;-><init>(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :sswitch_data_0
    .sparse-switch
        -0x72324512 -> :sswitch_3
        -0x54cff56e -> :sswitch_2
        -0x47b6d7d9 -> :sswitch_1
        -0x26a56514 -> :sswitch_0
    .end sparse-switch
.end method
