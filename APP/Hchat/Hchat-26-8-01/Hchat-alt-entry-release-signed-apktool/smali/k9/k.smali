.class public final synthetic Lk9/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# virtual methods
.method public final onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object p1, Lk9/r;->a:Lk9/r;

    .line 2
    .line 3
    if-eqz p2, :cond_3

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    sparse-switch p1, :sswitch_data_0

    .line 10
    .line 11
    .line 12
    goto :goto_1

    .line 13
    :sswitch_0
    const-string p1, "position_y"

    .line 14
    .line 15
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :sswitch_1
    const-string p1, "position_x"

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    return-void

    .line 32
    :sswitch_2
    const-string p1, "enable"

    .line 33
    .line 34
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-nez p2, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    sget-object p2, Lk9/r;->c:Landroid/content/SharedPreferences;

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    move p1, v0

    .line 52
    :goto_0
    sput-boolean p1, Lk9/r;->d:Z

    .line 53
    .line 54
    new-instance p2, Lk9/q;

    .line 55
    .line 56
    invoke-direct {p2, v0, p1}, Lk9/q;-><init>(IZ)V

    .line 57
    .line 58
    .line 59
    invoke-static {p2}, Lk9/r;->p(Lfg/a;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_3
    :goto_1
    new-instance p1, Lk/s1;

    .line 64
    .line 65
    const/4 p2, 0x1

    .line 66
    invoke-direct {p1, p2}, Lk/s1;-><init>(I)V

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, Lk9/r;->p(Lfg/a;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :sswitch_data_0
    .sparse-switch
        -0x4d6ada7d -> :sswitch_2
        0x5250fee2 -> :sswitch_1
        0x5250fee3 -> :sswitch_0
    .end sparse-switch
.end method
