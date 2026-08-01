.class final Lcom/mr/elaris/InAppSettingsResetPage;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static resetAll(Lcom/mr/elaris/InAppSettings;Landroid/content/SharedPreferences;)V
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    :try_start_0
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    sget-object v0, Lcom/mr/elaris/Prefs;->BOOLEAN_KEYS:[Ljava/lang/String;

    .line 9
    .line 10
    array-length v1, v0

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :goto_0
    if-ge v3, v1, :cond_1

    .line 14
    .line 15
    aget-object v4, v0, v3

    .line 16
    .line 17
    invoke-static {p1, v4, v2}, Lcom/mr/elaris/Prefs;->putBoolean(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    add-int/lit8 v3, v3, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    sget-object v0, Lcom/mr/elaris/Prefs;->STRING_KEYS:[Ljava/lang/String;

    .line 24
    .line 25
    array-length v1, v0

    .line 26
    move v3, v2

    .line 27
    :goto_1
    if-ge v3, v1, :cond_2

    .line 28
    .line 29
    aget-object v4, v0, v3

    .line 30
    .line 31
    invoke-static {v4}, Lcom/mr/elaris/Prefs;->defaultString(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-static {p1, v4, v5}, Lcom/mr/elaris/Prefs;->putString(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 36
    .line 37
    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    const-string v0, "config_version"

    .line 42
    .line 43
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    invoke-interface {p1, v0, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 52
    .line 53
    .line 54
    sget-object p1, Lcom/mr/elaris/Prefs;->BOOLEAN_KEYS:[Ljava/lang/String;

    .line 55
    .line 56
    array-length v0, p1

    .line 57
    move v1, v2

    .line 58
    :goto_2
    if-ge v1, v0, :cond_3

    .line 59
    .line 60
    aget-object v3, p1, v1

    .line 61
    .line 62
    invoke-static {v3, v2}, Lcom/mr/elaris/HookEntry;->setRuntimeBool(Ljava/lang/String;Z)V

    .line 63
    .line 64
    .line 65
    add-int/lit8 v1, v1, 0x1

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    sget-object p1, Lcom/mr/elaris/Prefs;->STRING_KEYS:[Ljava/lang/String;

    .line 69
    .line 70
    array-length v0, p1

    .line 71
    :goto_3
    if-ge v2, v0, :cond_4

    .line 72
    .line 73
    aget-object v1, p1, v2

    .line 74
    .line 75
    invoke-static {v1}, Lcom/mr/elaris/Prefs;->defaultString(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-static {v1, v3}, Lcom/mr/elaris/HookEntry;->setRuntimeString(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    add-int/lit8 v2, v2, 0x1

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    const-string p1, "\u5df2\u91cd\u7f6e\u4e3a\u9ed8\u8ba4\u5173\u95ed\uff0c\u91cd\u542f QQ \u540e\u5b8c\u5168\u751f\u6548"

    .line 86
    .line 87
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :catchall_0
    const-string p1, "\u91cd\u7f6e\u5931\u8d25"

    .line 92
    .line 93
    invoke-virtual {p0, p1}, Lcom/mr/elaris/InAppSettings;->toast(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method
