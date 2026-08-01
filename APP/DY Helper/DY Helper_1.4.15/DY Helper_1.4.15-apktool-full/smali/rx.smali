.class public final Lrx;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final β:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final δ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ε:Ljava/util/Set;

.field public static final ζ:Ljava/util/concurrent/atomic/AtomicLong;

.field public static volatile η:J

.field public static volatile θ:Ljava/lang/ClassLoader;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lrx;->β:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lrx;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lrx;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 29
    .line 30
    const-string v17, "comment_precise_time_template_render_methods"

    .line 31
    .line 32
    const-string v18, "comment_precise_time_compose_formatter_methods"

    .line 33
    .line 34
    const-string v2, "feed_current_playback_selected_methods"

    .line 35
    .line 36
    const-string v3, "feed_current_playback_unselected_methods"

    .line 37
    .line 38
    const-string v4, "feed_auto_scroll_text_mode_field"

    .line 39
    .line 40
    const-string v5, "feed_auto_scroll_new_text_mode_field"

    .line 41
    .line 42
    const-string v6, "bottom_tab_visibility_control_methods"

    .line 43
    .line 44
    const-string v7, "home_tab_showing_bottom_tab_ids_methods"

    .line 45
    .line 46
    const-string v8, "home_tab_data_source_provider_methods"

    .line 47
    .line 48
    const-string v9, "home_tab_data_source_classes"

    .line 49
    .line 50
    const-string v10, "home_tab_data_source_list_methods"

    .line 51
    .line 52
    const-string v11, "im_stranger_list_model_factory_methods"

    .line 53
    .line 54
    const-string v12, "im_quick_share_contact_adapter_classes_v2"

    .line 55
    .line 56
    const-string v13, "spark_official_send_factory_class"

    .line 57
    .line 58
    const-string v14, "spark_official_send_callback_class"

    .line 59
    .line 60
    const-string v15, "spark_official_msg_sender_class"

    .line 61
    .line 62
    const-string v16, "comment_precise_time_template_component_classes"

    .line 63
    .line 64
    filled-new-array/range {v2 .. v18}, [Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sput-object v0, Lrx;->ε:Ljava/util/Set;

    .line 73
    .line 74
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 75
    .line 76
    const-wide/16 v1, 0x0

    .line 77
    .line 78
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 79
    .line 80
    .line 81
    sput-object v0, Lrx;->ζ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 82
    .line 83
    const-wide/16 v0, -0x1

    .line 84
    .line 85
    sput-wide v0, Lrx;->η:J

    .line 86
    .line 87
    return-void
.end method

.method public static α(Ljava/lang/ClassLoader;)Ljava/util/LinkedHashMap;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast v2, Ljava/lang/Iterable;

    .line 16
    .line 17
    invoke-static {v2}, Lxh;->Ю(Ljava/lang/Iterable;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_4

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, La80;

    .line 42
    .line 43
    if-nez v4, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    :try_start_0
    invoke-interface {v4, p0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :catchall_0
    move-exception v4

    .line 54
    new-instance v5, Leo1;

    .line 55
    .line 56
    invoke-direct {v5, v4}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    move-object v4, v5

    .line 60
    :goto_1
    invoke-static {v4}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    if-nez v5, :cond_2

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v6, "provider failed: "

    .line 70
    .line 71
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v3, ", err="

    .line 78
    .line 79
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-static {v3}, Lrx;->β(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    sget-object v4, Ljz;->ε:Ljz;

    .line 93
    .line 94
    :goto_2
    check-cast v4, Ljava/util/List;

    .line 95
    .line 96
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    :cond_3
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-eqz v4, :cond_0

    .line 105
    .line 106
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    check-cast v4, Lqx;

    .line 111
    .line 112
    iget-object v5, v4, Lqx;->α:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    if-nez v6, :cond_3

    .line 119
    .line 120
    invoke-virtual {v0, v5}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-nez v6, :cond_3

    .line 125
    .line 126
    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_4
    return-object v0
.end method

.method public static β(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "r32cd1d4d47390a2e"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static γ(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    sget-object v0, Lrx;->ζ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sput-wide v0, Lrx;->η:J

    .line 8
    .line 9
    sget-object v0, Lrx;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 13
    .line 14
    .line 15
    sput-object p0, Lrx;->θ:Ljava/lang/ClassLoader;

    .line 16
    .line 17
    sget-object v0, Lrx;->β:Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ljava/util/Map$Entry;

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Ljava/lang/String;

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, La80;

    .line 50
    .line 51
    invoke-static {v2, v1, p0}, Lrx;->θ(Ljava/lang/String;La80;Ljava/lang/ClassLoader;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    return-void
.end method

.method public static δ(Ljava/lang/String;La80;)V
    .locals 2

    .line 1
    sget-object v0, Lrx;->β:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lrx;->θ:Ljava/lang/ClassLoader;

    .line 7
    .line 8
    sget-object v1, Lrx;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-static {p0, p1, v0}, Lrx;->θ(Ljava/lang/String;La80;Ljava/lang/ClassLoader;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public static ε(Ljava/lang/String;La80;)V
    .locals 1

    .line 1
    sget-object v0, Lrx;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La80;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    if-eq v0, p1, :cond_1

    .line 12
    .line 13
    :cond_0
    sget-object p1, Lrx;->ζ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 16
    .line 17
    .line 18
    sget-object p1, Lrx;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 22
    .line 23
    .line 24
    :cond_1
    const-string p1, "provider registered: "

    .line 25
    .line 26
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Lrx;->β(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static ζ()V
    .locals 5

    .line 1
    const-string v0, "user_clear_from_settings"

    .line 2
    .line 3
    sget-object v1, Lrx;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lrx;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    sput-object v1, Lrx;->θ:Ljava/lang/ClassLoader;

    .line 16
    .line 17
    const-wide/16 v3, -0x1

    .line 18
    .line 19
    sput-wide v3, Lrx;->η:J

    .line 20
    .line 21
    const-string v1, "dexkit_prewarm_done_v3"

    .line 22
    .line 23
    invoke-static {v1}, Lui1;->Κ(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, "dexkit_module_version"

    .line 27
    .line 28
    invoke-static {v1}, Lui1;->Κ(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v1, "dexkit_dy_version"

    .line 32
    .line 33
    invoke-static {v1}, Lui1;->Κ(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v1, "dexkit_device_model"

    .line 37
    .line 38
    invoke-static {v1}, Lui1;->Κ(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :try_start_0
    sget-object v1, Lx;->Κ:Lx;

    .line 42
    .line 43
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 44
    :try_start_1
    invoke-static {}, Lx;->ν()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    if-nez v3, :cond_0

    .line 49
    .line 50
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    :try_start_3
    const-string v4, "dyhelper_dexkit_unsupported_tasks"

    .line 53
    .line 54
    invoke-virtual {v3, v4, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 67
    .line 68
    .line 69
    const-string v2, "r40ce95f0770b9235"

    .line 70
    .line 71
    const-string v3, "clear all unsupported tasks"

    .line 72
    .line 73
    invoke-static {v2, v3}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 74
    .line 75
    .line 76
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 77
    goto :goto_0

    .line 78
    :catchall_0
    move-exception v2

    .line 79
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 80
    :try_start_6
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 81
    :catchall_1
    :goto_0
    const-string v1, "reset, reason="

    .line 82
    .line 83
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v0}, Lrx;->β(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public static η(Ljava/lang/ClassLoader;Ljava/util/LinkedHashMap;)V
    .locals 18

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    check-cast v0, Ljava/lang/Iterable;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lqx;

    .line 25
    .line 26
    sget-object v2, Los;->α:Landroid/os/Handler;

    .line 27
    .line 28
    iget-object v2, v1, Lqx;->α:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v1, v1, Lqx;->β:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v2, v1}, Los;->ν(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    check-cast v0, Ljava/lang/Iterable;

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const/4 v2, 0x0

    .line 50
    move v3, v2

    .line 51
    move v4, v3

    .line 52
    move v5, v4

    .line 53
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_8

    .line 58
    .line 59
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    move-object v6, v0

    .line 64
    check-cast v6, Lqx;

    .line 65
    .line 66
    sget-object v0, Los;->α:Landroid/os/Handler;

    .line 67
    .line 68
    iget-object v0, v6, Lqx;->α:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v7, v6, Lqx;->β:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v0, v7}, Los;->Β(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :try_start_0
    iget-object v0, v6, Lqx;->γ:Lp70;

    .line 76
    .line 77
    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :catchall_0
    move-exception v0

    .line 84
    new-instance v7, Leo1;

    .line 85
    .line 86
    invoke-direct {v7, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    move-object v0, v7

    .line 90
    :goto_2
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    if-eqz v7, :cond_1

    .line 95
    .line 96
    iget-object v8, v6, Lqx;->α:Ljava/lang/String;

    .line 97
    .line 98
    new-instance v9, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string v10, "task failed: "

    .line 101
    .line 102
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v8, ", err="

    .line 109
    .line 110
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    invoke-static {v7}, Lrx;->β(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    :cond_1
    instance-of v0, v0, Leo1;

    .line 124
    .line 125
    xor-int/lit8 v7, v0, 0x1

    .line 126
    .line 127
    sget-object v8, Lox;->α:Ljava/lang/Object;

    .line 128
    .line 129
    iget-object v8, v6, Lqx;->α:Ljava/lang/String;

    .line 130
    .line 131
    invoke-static {v8}, Lox;->ν(Ljava/lang/String;)Z

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    iget-object v9, v6, Lqx;->α:Ljava/lang/String;

    .line 136
    .line 137
    const-string v10, ""

    .line 138
    .line 139
    const/16 v11, 0x3a

    .line 140
    .line 141
    invoke-static {v9, v11, v10}, Lq02;->ф(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    const/16 v11, 0x40

    .line 146
    .line 147
    invoke-static {v9, v11, v10}, Lq02;->ш(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    invoke-static {v9}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    sget-object v10, Lrx;->ε:Ljava/util/Set;

    .line 160
    .line 161
    invoke-interface {v10, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v9

    .line 165
    const/4 v10, 0x1

    .line 166
    if-nez v0, :cond_3

    .line 167
    .line 168
    if-nez v8, :cond_2

    .line 169
    .line 170
    if-eqz v9, :cond_3

    .line 171
    .line 172
    :cond_2
    move v0, v10

    .line 173
    goto :goto_3

    .line 174
    :cond_3
    move v0, v2

    .line 175
    :goto_3
    if-eqz v0, :cond_4

    .line 176
    .line 177
    add-int/lit8 v3, v3, 0x1

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 181
    .line 182
    :goto_4
    if-nez v8, :cond_7

    .line 183
    .line 184
    if-nez v9, :cond_5

    .line 185
    .line 186
    add-int/lit8 v5, v5, 0x1

    .line 187
    .line 188
    :cond_5
    sget-object v8, Lx;->Κ:Lx;

    .line 189
    .line 190
    iget-object v11, v6, Lqx;->α:Ljava/lang/String;

    .line 191
    .line 192
    new-instance v12, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    const-string v13, "prewarm finished without usable cache, actionOk="

    .line 195
    .line 196
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    const-string v7, ", optional="

    .line 203
    .line 204
    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    const-string v9, "mark unsupported: "

    .line 215
    .line 216
    const-string v12, "markUnsupported skipped, context is null, taskId="

    .line 217
    .line 218
    monitor-enter v8

    .line 219
    :try_start_1
    invoke-static {}, Lx;->ν()Landroid/content/Context;

    .line 220
    .line 221
    .line 222
    move-result-object v13

    .line 223
    if-nez v13, :cond_6

    .line 224
    .line 225
    const-string v7, "r40ce95f0770b9235"

    .line 226
    .line 227
    invoke-virtual {v12, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v9

    .line 231
    invoke-static {v7, v9}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 232
    .line 233
    .line 234
    monitor-exit v8

    .line 235
    goto/16 :goto_6

    .line 236
    .line 237
    :catchall_1
    move-exception v0

    .line 238
    goto/16 :goto_5

    .line 239
    .line 240
    :cond_6
    :try_start_2
    const-string v12, "dyhelper_dexkit_unsupported_tasks"

    .line 241
    .line 242
    invoke-virtual {v13, v12, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 243
    .line 244
    .line 245
    move-result-object v12

    .line 246
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-static {v13, v12}, Lx;->π(Landroid/content/Context;Landroid/content/SharedPreferences;)V

    .line 250
    .line 251
    .line 252
    const-string v13, "@"

    .line 253
    .line 254
    invoke-static {v11, v13, v11}, Lq02;->щ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v13

    .line 258
    invoke-static {v13}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 259
    .line 260
    .line 261
    move-result-object v13

    .line 262
    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v13

    .line 266
    new-instance v14, Lorg/json/JSONObject;

    .line 267
    .line 268
    invoke-direct {v14}, Lorg/json/JSONObject;-><init>()V

    .line 269
    .line 270
    .line 271
    const-string v15, "unsupported"

    .line 272
    .line 273
    invoke-virtual {v14, v15, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 274
    .line 275
    .line 276
    move-result-object v14

    .line 277
    const-string v15, "taskId"

    .line 278
    .line 279
    invoke-virtual {v14, v15, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 280
    .line 281
    .line 282
    move-result-object v14

    .line 283
    const-string v15, "reason"

    .line 284
    .line 285
    const/16 v2, 0x320

    .line 286
    .line 287
    invoke-static {v7, v2}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    invoke-virtual {v14, v15, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    const-string v14, "writtenAt"

    .line 296
    .line 297
    move-object/from16 v17, v11

    .line 298
    .line 299
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 300
    .line 301
    .line 302
    move-result-wide v10

    .line 303
    invoke-virtual {v2, v14, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    const-string v10, "unsupportedSchema"

    .line 308
    .line 309
    const/4 v15, 0x1

    .line 310
    invoke-virtual {v2, v10, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    const-string v10, "dexkitCacheSchema"

    .line 315
    .line 316
    const/4 v11, 0x4

    .line 317
    invoke-virtual {v2, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    const-string v10, "moduleVersionCode"

    .line 322
    .line 323
    const/16 v11, 0x3c

    .line 324
    .line 325
    invoke-virtual {v2, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    const-string v10, "moduleVersionName"

    .line 330
    .line 331
    const-string v11, "1.4.15"

    .line 332
    .line 333
    invoke-virtual {v2, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    invoke-interface {v12}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 338
    .line 339
    .line 340
    move-result-object v10

    .line 341
    invoke-static/range {v17 .. v17}, Lx;->в(Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v11

    .line 345
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    invoke-interface {v10, v11, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 354
    .line 355
    .line 356
    const-string v2, "r40ce95f0770b9235"

    .line 357
    .line 358
    new-instance v10, Ljava/lang/StringBuilder;

    .line 359
    .line 360
    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    const-string v9, ", reason="

    .line 367
    .line 368
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v7

    .line 378
    invoke-static {v2, v7}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 379
    .line 380
    .line 381
    monitor-exit v8

    .line 382
    goto :goto_6

    .line 383
    :goto_5
    :try_start_3
    monitor-exit v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 384
    throw v0

    .line 385
    :cond_7
    :goto_6
    sget-object v2, Los;->α:Landroid/os/Handler;

    .line 386
    .line 387
    iget-object v2, v6, Lqx;->α:Ljava/lang/String;

    .line 388
    .line 389
    invoke-static {v2, v0}, Los;->Α(Ljava/lang/String;Z)V

    .line 390
    .line 391
    .line 392
    const/4 v2, 0x0

    .line 393
    goto/16 :goto_1

    .line 394
    .line 395
    :cond_8
    invoke-static {}, Lrx;->ι()V

    .line 396
    .line 397
    .line 398
    invoke-virtual/range {p1 .. p1}, Ljava/util/AbstractMap;->size()I

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    const-string v1, "prewarm finished, scanned="

    .line 403
    .line 404
    const-string v2, ", ok="

    .line 405
    .line 406
    const-string v6, ", fail="

    .line 407
    .line 408
    invoke-static {v1, v0, v2, v3, v6}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    const-string v1, ", unsupported="

    .line 416
    .line 417
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    invoke-static {v0}, Lrx;->β(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    sget-object v0, Los;->α:Landroid/os/Handler;

    .line 431
    .line 432
    sget-object v1, Los;->Ξ:Ljava/lang/Object;

    .line 433
    .line 434
    monitor-enter v1

    .line 435
    :try_start_4
    invoke-static {}, Los;->γ()V

    .line 436
    .line 437
    .line 438
    sget-object v0, Los;->Ο:Ljava/util/LinkedHashMap;

    .line 439
    .line 440
    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 441
    .line 442
    .line 443
    move-result v2

    .line 444
    if-eqz v2, :cond_9

    .line 445
    .line 446
    const-string v2, "legacy_finish"

    .line 447
    .line 448
    new-instance v3, Lms;

    .line 449
    .line 450
    const-string v4, "legacy_finish"

    .line 451
    .line 452
    const-string v5, "\u9002\u914d\u5b8c\u6210"

    .line 453
    .line 454
    sget-object v6, Lns;->η:Lns;

    .line 455
    .line 456
    invoke-direct {v3, v4, v5, v6}, Lms;-><init>(Ljava/lang/String;Ljava/lang/String;Lns;)V

    .line 457
    .line 458
    .line 459
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    goto :goto_8

    .line 463
    :catchall_2
    move-exception v0

    .line 464
    goto/16 :goto_c

    .line 465
    .line 466
    :cond_9
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    check-cast v0, Ljava/lang/Iterable;

    .line 474
    .line 475
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    :cond_a
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 480
    .line 481
    .line 482
    move-result v2

    .line 483
    if-eqz v2, :cond_b

    .line 484
    .line 485
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    check-cast v2, Lms;

    .line 490
    .line 491
    iget-object v3, v2, Lms;->γ:Lns;

    .line 492
    .line 493
    sget-object v4, Lns;->θ:Lns;

    .line 494
    .line 495
    if-eq v3, v4, :cond_a

    .line 496
    .line 497
    sget-object v3, Lns;->η:Lns;

    .line 498
    .line 499
    iput-object v3, v2, Lms;->γ:Lns;

    .line 500
    .line 501
    goto :goto_7

    .line 502
    :cond_b
    :goto_8
    sget-object v0, Los;->α:Landroid/os/Handler;

    .line 503
    .line 504
    sget-object v0, Los;->Ο:Ljava/util/LinkedHashMap;

    .line 505
    .line 506
    invoke-virtual {v0}, Ljava/util/AbstractMap;->size()I

    .line 507
    .line 508
    .line 509
    move-result v2

    .line 510
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 515
    .line 516
    .line 517
    check-cast v0, Ljava/lang/Iterable;

    .line 518
    .line 519
    instance-of v3, v0, Ljava/util/Collection;

    .line 520
    .line 521
    if-eqz v3, :cond_c

    .line 522
    .line 523
    move-object v3, v0

    .line 524
    check-cast v3, Ljava/util/Collection;

    .line 525
    .line 526
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 527
    .line 528
    .line 529
    move-result v3

    .line 530
    if-eqz v3, :cond_c

    .line 531
    .line 532
    const/4 v0, 0x0

    .line 533
    goto :goto_a

    .line 534
    :cond_c
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    const/16 v16, 0x0

    .line 539
    .line 540
    :cond_d
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 541
    .line 542
    .line 543
    move-result v3

    .line 544
    if-eqz v3, :cond_f

    .line 545
    .line 546
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v3

    .line 550
    check-cast v3, Lms;

    .line 551
    .line 552
    iget-object v3, v3, Lms;->γ:Lns;

    .line 553
    .line 554
    sget-object v4, Lns;->θ:Lns;

    .line 555
    .line 556
    if-ne v3, v4, :cond_d

    .line 557
    .line 558
    add-int/lit8 v16, v16, 0x1

    .line 559
    .line 560
    if-ltz v16, :cond_e

    .line 561
    .line 562
    goto :goto_9

    .line 563
    :cond_e
    invoke-static {}, Lyh;->ф()V

    .line 564
    .line 565
    .line 566
    const/4 v0, 0x0

    .line 567
    throw v0

    .line 568
    :cond_f
    move/from16 v0, v16

    .line 569
    .line 570
    :goto_a
    new-instance v3, Ljava/lang/StringBuilder;

    .line 571
    .line 572
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 573
    .line 574
    .line 575
    const-string v4, "finishProgress called, taskCount="

    .line 576
    .line 577
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    .line 583
    const-string v2, ", failed="

    .line 584
    .line 585
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    invoke-static {v0}, Los;->φ(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 596
    .line 597
    .line 598
    monitor-exit v1

    .line 599
    invoke-static {}, Los;->σ()Z

    .line 600
    .line 601
    .line 602
    move-result v0

    .line 603
    if-eqz v0, :cond_10

    .line 604
    .line 605
    const-string v0, "finishProgress: restart already acked, dismissing dialog"

    .line 606
    .line 607
    invoke-static {v0}, Los;->φ(Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    sget-object v1, Los;->Ξ:Ljava/lang/Object;

    .line 611
    .line 612
    monitor-enter v1

    .line 613
    :try_start_5
    sget-object v0, Los;->α:Landroid/os/Handler;

    .line 614
    .line 615
    invoke-static {}, Los;->ε()V

    .line 616
    .line 617
    .line 618
    sget-object v0, Los;->Ο:Ljava/util/LinkedHashMap;

    .line 619
    .line 620
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 621
    .line 622
    .line 623
    monitor-exit v1

    .line 624
    sget-object v0, Los;->α:Landroid/os/Handler;

    .line 625
    .line 626
    new-instance v1, Ls0;

    .line 627
    .line 628
    const/16 v2, 0xc

    .line 629
    .line 630
    invoke-direct {v1, v2}, Ls0;-><init>(I)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 634
    .line 635
    .line 636
    goto :goto_b

    .line 637
    :catchall_3
    move-exception v0

    .line 638
    monitor-exit v1

    .line 639
    throw v0

    .line 640
    :cond_10
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 649
    .line 650
    .line 651
    move-result v0

    .line 652
    if-nez v0, :cond_11

    .line 653
    .line 654
    sget-object v0, Los;->α:Landroid/os/Handler;

    .line 655
    .line 656
    new-instance v1, Ls0;

    .line 657
    .line 658
    const/16 v2, 0x11

    .line 659
    .line 660
    invoke-direct {v1, v2}, Ls0;-><init>(I)V

    .line 661
    .line 662
    .line 663
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 664
    .line 665
    .line 666
    goto :goto_b

    .line 667
    :cond_11
    invoke-static {}, Los;->ξ()V

    .line 668
    .line 669
    .line 670
    invoke-static {}, Los;->Μ()V

    .line 671
    .line 672
    .line 673
    :goto_b
    invoke-static/range {p0 .. p0}, Lrx;->γ(Ljava/lang/ClassLoader;)V

    .line 674
    .line 675
    .line 676
    return-void

    .line 677
    :goto_c
    monitor-exit v1

    .line 678
    throw v0
.end method

.method public static θ(Ljava/lang/String;La80;Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-interface {p1, p2}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    sget-object p1, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    new-instance p2, Leo1;

    .line 9
    .line 10
    invoke-direct {p2, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    move-object p1, p2

    .line 14
    :goto_0
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    new-instance p2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v0, "finish listener failed: "

    .line 23
    .line 24
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p0, ", err="

    .line 31
    .line 32
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lrx;->β(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public static ι()V
    .locals 4

    .line 1
    const-string v0, "dexkit_prewarm_done_v3"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 5
    .line 6
    .line 7
    const-string v0, "dexkit_module_version"

    .line 8
    .line 9
    const/16 v1, 0x3c

    .line 10
    .line 11
    invoke-static {v0, v1}, Lui1;->Η(Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v2, "SDK_"

    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v3, "dexkit_dy_version"

    .line 31
    .line 32
    invoke-static {v3, v1}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const-string v3, "dexkit_device_model"

    .line 41
    .line 42
    invoke-static {v3, v1}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    new-instance v3, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    new-instance v2, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v3, "version info saved: module=60, dy="

    .line 60
    .line 61
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v0, ", device="

    .line 68
    .line 69
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0}, Lrx;->β(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public static κ(Ljava/lang/ClassLoader;)V
    .locals 11

    .line 1
    const-string v0, "dexkit_module_version"

    .line 2
    .line 3
    sget-object v1, Lrx;->ζ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    sget-object v3, Lrx;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    sget-wide v3, Lrx;->η:J

    .line 18
    .line 19
    cmp-long v1, v3, v1

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    sget-object v1, Lrx;->θ:Ljava/lang/ClassLoader;

    .line 24
    .line 25
    if-ne v1, p0, :cond_0

    .line 26
    .line 27
    const-string p0, "prewarm already finished for this generation and classloader, skip"

    .line 28
    .line 29
    invoke-static {p0}, Lrx;->β(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    const/4 v1, -0x1

    .line 34
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 39
    .line 40
    .line 41
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move v2, v1

    .line 44
    :goto_0
    const-string v3, "dexkit_dy_version"

    .line 45
    .line 46
    const-string v4, ""

    .line 47
    .line 48
    invoke-static {v3, v4}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    const-string v6, "dexkit_device_model"

    .line 53
    .line 54
    invoke-static {v6, v4}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 59
    .line 60
    const-string v8, "SDK_"

    .line 61
    .line 62
    invoke-static {v8, v7}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    sget-object v8, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 67
    .line 68
    if-eq v2, v1, :cond_2

    .line 69
    .line 70
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_2

    .line 75
    .line 76
    const/16 v1, 0x3c

    .line 77
    .line 78
    if-ne v2, v1, :cond_1

    .line 79
    .line 80
    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_1

    .line 85
    .line 86
    invoke-virtual {v4, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-nez v1, :cond_2

    .line 91
    .line 92
    :cond_1
    const-string v1, "version mismatch detected, forcing re-prewarm: module(saved="

    .line 93
    .line 94
    const-string v9, ", current=60), dy(saved="

    .line 95
    .line 96
    const-string v10, ", current="

    .line 97
    .line 98
    invoke-static {v2, v1, v9, v5, v10}, La12;->η(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    const-string v2, "), device(saved="

    .line 103
    .line 104
    invoke-static {v1, v7, v2, v4, v10}, Lnx;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v2, ")"

    .line 111
    .line 112
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-static {v1}, Lrx;->β(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    const-string v1, "dexkit_prewarm_done_v3"

    .line 123
    .line 124
    invoke-static {v1}, Lui1;->Κ(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-static {v0}, Lui1;->Κ(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v3}, Lui1;->Κ(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v6}, Lui1;->Κ(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    :cond_2
    sget-object v0, Lrx;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 137
    .line 138
    const/4 v1, 0x0

    .line 139
    const/4 v2, 0x1

    .line 140
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-nez v0, :cond_3

    .line 145
    .line 146
    const-string p0, "prewarm already running, skip"

    .line 147
    .line 148
    invoke-static {p0}, Lrx;->β(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_3
    new-instance v0, Ljava/lang/Thread;

    .line 153
    .line 154
    new-instance v1, Loj;

    .line 155
    .line 156
    const/4 v3, 0x3

    .line 157
    invoke-direct {v1, p0, v3}, Loj;-><init>(Ljava/lang/ClassLoader;I)V

    .line 158
    .line 159
    .line 160
    const-string p0, "r32cd1d4d47390a2e"

    .line 161
    .line 162
    invoke-direct {v0, v1, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v2}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 169
    .line 170
    .line 171
    return-void
.end method
