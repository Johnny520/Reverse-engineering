.class public final Lcom/example/dyhelper/ui/а;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Landroid/os/Handler;

.field public static β:Ljava/lang/ref/WeakReference;

.field public static γ:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;

.field public static final δ:Ljava/util/LinkedHashMap;

.field public static final ε:Ljava/util/LinkedHashMap;

.field public static final ζ:Ljava/util/LinkedHashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 11
    .line 12
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/example/dyhelper/ui/а;->δ:Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lcom/example/dyhelper/ui/а;->ε:Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lcom/example/dyhelper/ui/а;->ζ:Ljava/util/LinkedHashSet;

    .line 32
    .line 33
    return-void
.end method

.method public static α()Ljava/util/List;
    .locals 5

    .line 1
    sget-object v0, Lcom/example/dyhelper/ui/а;->δ:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast v0, Ljava/lang/Iterable;

    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    move-object v3, v2

    .line 32
    check-cast v3, Le52;

    .line 33
    .line 34
    sget-object v4, Lcom/example/dyhelper/ui/а;->ζ:Ljava/util/LinkedHashSet;

    .line 35
    .line 36
    iget-object v3, v3, Le52;->α:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v4, v3}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-nez v3, :cond_0

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    new-instance v0, Lqy1;

    .line 49
    .line 50
    const/4 v2, 0x5

    .line 51
    invoke-direct {v0, v2}, Lqy1;-><init>(I)V

    .line 52
    .line 53
    .line 54
    new-instance v2, Ljd1;

    .line 55
    .line 56
    const/16 v3, 0xa

    .line 57
    .line 58
    invoke-direct {v2, v3, v0}, Ljd1;-><init>(ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v2}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0
.end method

.method public static β(Landroid/content/Context;F)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 10
    .line 11
    mul-float/2addr p1, p0

    .line 12
    const/high16 p0, 0x3f000000    # 0.5f

    .line 13
    .line 14
    add-float/2addr p1, p0

    .line 15
    float-to-int p0, p1

    .line 16
    return p0
.end method

.method public static γ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lcom/example/dyhelper/ui/а;->ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {p3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const-string p3, "\u8bf7\u7a0d\u540e\u91cd\u8bd5"

    .line 18
    .line 19
    :cond_0
    move-object v3, p3

    .line 20
    new-instance v0, Ld52;

    .line 21
    .line 22
    const/4 v4, -0x1

    .line 23
    sget-object v5, Lf52;->η:Lf52;

    .line 24
    .line 25
    const-wide/16 v7, 0x898

    .line 26
    .line 27
    move-object v6, p0

    .line 28
    move-object v2, p2

    .line 29
    invoke-direct/range {v0 .. v8}, Ld52;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILf52;Landroid/app/Activity;J)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lcom/example/dyhelper/ui/а;->κ(Lp70;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public static δ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/example/dyhelper/ui/а;->ε(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {p0, v0, p1, p2}, Lcom/example/dyhelper/ui/а;->γ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static ε(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    :goto_0
    if-nez p0, :cond_1

    .line 18
    .line 19
    const-string p0, "default"

    .line 20
    .line 21
    :cond_1
    const-string v0, "legacy:"

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public static ζ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    :goto_0
    if-nez p0, :cond_1

    .line 18
    .line 19
    const-string p0, "default"

    .line 20
    .line 21
    :cond_1
    return-object p0
.end method

.method public static η(Landroid/app/Activity;)Lg52;
    .locals 5

    .line 1
    new-instance v0, Lg52;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x3e

    .line 5
    .line 6
    :try_start_0
    invoke-static {}, Lui1;->Α()Z

    .line 7
    .line 8
    .line 9
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    const-string v4, "download_top_notification_alpha"

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    :try_start_1
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0, v4, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 19
    .line 20
    .line 21
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move p0, v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    :try_start_2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v3, "dyhelper_prefs"

    .line 30
    .line 31
    invoke-virtual {p0, v3, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-interface {p0, v4, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 43
    goto :goto_1

    .line 44
    :catchall_1
    move-exception p0

    .line 45
    new-instance v3, Leo1;

    .line 46
    .line 47
    invoke-direct {v3, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    move-object p0, v3

    .line 51
    :goto_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    instance-of v3, p0, Leo1;

    .line 56
    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    move-object p0, v2

    .line 60
    :cond_1
    check-cast p0, Ljava/lang/Number;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    const/16 v2, 0x64

    .line 67
    .line 68
    invoke-static {p0, v1, v2}, Lj81;->μ(III)I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    invoke-direct {v0, p0}, Lg52;-><init>(I)V

    .line 73
    .line 74
    .line 75
    return-object v0
.end method

.method public static θ()V
    .locals 4

    .line 1
    sget-object v0, Lcom/example/dyhelper/ui/а;->γ:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v2, v1

    .line 12
    :goto_0
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 13
    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    check-cast v2, Landroid/view/ViewGroup;

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move-object v2, v1

    .line 20
    :goto_1
    if-nez v2, :cond_3

    .line 21
    .line 22
    sget-object v2, Lcom/example/dyhelper/ui/а;->β:Ljava/lang/ref/WeakReference;

    .line 23
    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Landroid/view/ViewGroup;

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move-object v2, v1

    .line 34
    :cond_3
    :goto_2
    if-eqz v0, :cond_4

    .line 35
    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    :try_start_0
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    :catchall_0
    :cond_4
    sput-object v1, Lcom/example/dyhelper/ui/а;->γ:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;

    .line 42
    .line 43
    sput-object v1, Lcom/example/dyhelper/ui/а;->β:Ljava/lang/ref/WeakReference;

    .line 44
    .line 45
    return-void
.end method

.method public static ι(Landroid/app/Activity;Z)V
    .locals 10

    .line 1
    invoke-static {}, Lcom/example/dyhelper/ui/а;->α()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x3

    .line 6
    invoke-static {v0, v1}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {}, Lcom/example/dyhelper/ui/а;->α()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    sub-int/2addr v2, v1

    .line 19
    if-gez v2, :cond_0

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    sget-object p0, Lcom/example/dyhelper/ui/а;->γ:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;

    .line 29
    .line 30
    if-eqz p0, :cond_7

    .line 31
    .line 32
    new-instance p1, Ltv1;

    .line 33
    .line 34
    const/4 v0, 0x6

    .line 35
    invoke-direct {p1, v0}, Ltv1;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->δ(Lp70;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const/4 v3, 0x0

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    move-object v1, v3

    .line 55
    :goto_0
    instance-of v4, v1, Landroid/view/ViewGroup;

    .line 56
    .line 57
    if-eqz v4, :cond_3

    .line 58
    .line 59
    check-cast v1, Landroid/view/ViewGroup;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    move-object v1, v3

    .line 63
    :goto_1
    if-nez v1, :cond_4

    .line 64
    .line 65
    goto/16 :goto_4

    .line 66
    .line 67
    :cond_4
    sget-object v4, Lcom/example/dyhelper/ui/а;->γ:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;

    .line 68
    .line 69
    if-eqz v4, :cond_5

    .line 70
    .line 71
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    if-ne v5, v1, :cond_5

    .line 76
    .line 77
    :goto_2
    move-object v3, v4

    .line 78
    goto :goto_4

    .line 79
    :cond_5
    invoke-static {}, Lcom/example/dyhelper/ui/а;->θ()V

    .line 80
    .line 81
    .line 82
    :try_start_0
    new-instance v4, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;

    .line 83
    .line 84
    invoke-static {p0}, Lcom/example/dyhelper/ui/а;->η(Landroid/app/Activity;)Lg52;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    new-instance v6, Ltv1;

    .line 89
    .line 90
    const/4 v7, 0x7

    .line 91
    invoke-direct {v6, v7}, Ltv1;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-direct {v4, p0, v5, v6}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;-><init>(Landroid/app/Activity;Lg52;Ltv1;)V

    .line 95
    .line 96
    .line 97
    const-string v5, "dyhelper_top_download_notification_host"

    .line 98
    .line 99
    invoke-virtual {v4, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    const-string v6, "status_bar_height"

    .line 107
    .line 108
    const-string v7, "dimen"

    .line 109
    .line 110
    const-string v8, "android"

    .line 111
    .line 112
    invoke-virtual {v5, v6, v7, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-lez v5, :cond_6

    .line 117
    .line 118
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    invoke-virtual {v6, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    goto :goto_3

    .line 127
    :cond_6
    const/high16 v5, 0x41c00000    # 24.0f

    .line 128
    .line 129
    invoke-static {p0, v5}, Lcom/example/dyhelper/ui/а;->β(Landroid/content/Context;F)I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    :goto_3
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 134
    .line 135
    const/4 v7, -0x2

    .line 136
    const/16 v8, 0x30

    .line 137
    .line 138
    const/4 v9, -0x1

    .line 139
    invoke-direct {v6, v9, v7, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 140
    .line 141
    .line 142
    const/high16 v7, 0x40c00000    # 6.0f

    .line 143
    .line 144
    invoke-static {p0, v7}, Lcom/example/dyhelper/ui/а;->β(Landroid/content/Context;F)I

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    const/high16 v8, 0x40400000    # 3.0f

    .line 149
    .line 150
    invoke-static {p0, v8}, Lcom/example/dyhelper/ui/а;->β(Landroid/content/Context;F)I

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    sub-int/2addr v5, p0

    .line 155
    invoke-static {v7, v5}, Ljava/lang/Math;->max(II)I

    .line 156
    .line 157
    .line 158
    move-result p0

    .line 159
    iput p0, v6, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 160
    .line 161
    invoke-virtual {v1, v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 162
    .line 163
    .line 164
    new-instance p0, Ljava/lang/ref/WeakReference;

    .line 165
    .line 166
    invoke-direct {p0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    sput-object p0, Lcom/example/dyhelper/ui/а;->β:Ljava/lang/ref/WeakReference;

    .line 170
    .line 171
    sput-object v4, Lcom/example/dyhelper/ui/а;->γ:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :catchall_0
    move-exception p0

    .line 175
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    new-instance v1, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    const-string v4, "DYHelper: \u9876\u90e8\u901a\u77e5\u6dfb\u52a0\u5931\u8d25: "

    .line 182
    .line 183
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    invoke-static {p0}, Lux;->ζ(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    :goto_4
    if-nez v3, :cond_8

    .line 197
    .line 198
    :cond_7
    return-void

    .line 199
    :cond_8
    invoke-virtual {v3, v0, v2, p1}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ζ(Ljava/util/List;IZ)V

    .line 200
    .line 201
    .line 202
    return-void
.end method

.method public static κ(Lp70;)V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v0, Lr0;

    .line 20
    .line 21
    const/4 v1, 0x7

    .line 22
    invoke-direct {v0, v1, p0}, Lr0;-><init>(ILp70;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static λ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lcom/example/dyhelper/ui/а;->ε(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {p0, p1, v0, p2, p3}, Lcom/example/dyhelper/ui/а;->μ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static μ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lcom/example/dyhelper/ui/а;->ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 p2, -0x1

    .line 9
    const/16 v0, 0x64

    .line 10
    .line 11
    invoke-static {p0, p2, v0}, Lj81;->μ(III)I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    new-instance v0, Lby0;

    .line 16
    .line 17
    const/4 v6, 0x1

    .line 18
    move-object v5, p1

    .line 19
    move-object v2, p3

    .line 20
    move-object v3, p4

    .line 21
    invoke-direct/range {v0 .. v6}, Lby0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroid/app/Activity;Z)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lcom/example/dyhelper/ui/а;->κ(Lp70;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static ν(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    instance-of v0, p0, Landroid/app/Activity;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    check-cast p0, Landroid/app/Activity;

    .line 15
    .line 16
    :goto_0
    move-object v5, p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    goto :goto_0

    .line 20
    :goto_1
    if-nez v5, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    invoke-static {p1}, Lcom/example/dyhelper/ui/а;->ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const/4 p0, -0x1

    .line 28
    const/16 p1, 0x64

    .line 29
    .line 30
    invoke-static {p4, p0, p1}, Lj81;->μ(III)I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    new-instance v0, Lby0;

    .line 35
    .line 36
    const/4 v6, 0x0

    .line 37
    move-object v2, p2

    .line 38
    move-object v3, p3

    .line 39
    invoke-direct/range {v0 .. v6}, Lby0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILandroid/app/Activity;Z)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lcom/example/dyhelper/ui/а;->κ(Lp70;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public static ξ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILf52;)V
    .locals 11

    .line 1
    sget-object v10, Lcom/example/dyhelper/ui/а;->δ:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {v10, p0}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Le52;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object v2, Lcom/example/dyhelper/ui/а;->ζ:Ljava/util/LinkedHashSet;

    .line 12
    .line 13
    invoke-virtual {v2, p0}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :cond_0
    new-instance v2, Le52;

    .line 17
    .line 18
    const/4 v3, -0x1

    .line 19
    const/16 v4, 0x64

    .line 20
    .line 21
    invoke-static {p3, v3, v4}, Lj81;->μ(III)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-wide v5, v0, Le52;->ζ:J

    .line 28
    .line 29
    :goto_0
    move-wide v6, v5

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 32
    .line 33
    .line 34
    move-result-wide v5

    .line 35
    goto :goto_0

    .line 36
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 37
    .line 38
    .line 39
    move-result-wide v8

    .line 40
    move-object v1, p0

    .line 41
    move-object v3, p2

    .line 42
    move-object v5, p4

    .line 43
    move-object v0, v2

    .line 44
    move-object v2, p1

    .line 45
    invoke-direct/range {v0 .. v9}, Le52;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILf52;JJ)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v10, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    return-void
.end method
