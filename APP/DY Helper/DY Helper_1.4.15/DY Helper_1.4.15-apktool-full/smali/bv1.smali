.class public final Lbv1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lbv1;

.field public static β:Landroid/app/AlertDialog;

.field public static final γ:Landroid/os/Handler;

.field public static δ:Lqu1;

.field public static ε:Lpu1;

.field public static ζ:Ljava/lang/String;

.field public static final η:Ljava/util/ArrayList;

.field public static final θ:Ljava/util/ArrayList;

.field public static final ι:Ljava/util/ArrayList;

.field public static κ:Landroid/widget/ScrollView;

.field public static λ:Landroid/widget/LinearLayout;

.field public static μ:Landroid/widget/TextView;

.field public static ν:Landroid/widget/LinearLayout;

.field public static ξ:Landroid/widget/LinearLayout;

.field public static final ο:Ljava/util/LinkedHashSet;

.field public static final π:Lh22;

.field public static final ρ:Lh22;

.field public static final σ:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Lbv1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbv1;->α:Lbv1;

    .line 7
    .line 8
    new-instance v0, Landroid/os/Handler;

    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lbv1;->γ:Landroid/os/Handler;

    .line 18
    .line 19
    sget-object v0, Lpu1;->ε:Lpu1;

    .line 20
    .line 21
    sput-object v0, Lbv1;->ε:Lpu1;

    .line 22
    .line 23
    const-string v0, ""

    .line 24
    .line 25
    sput-object v0, Lbv1;->ζ:Ljava/lang/String;

    .line 26
    .line 27
    new-instance v0, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lbv1;->η:Ljava/util/ArrayList;

    .line 33
    .line 34
    new-instance v0, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lbv1;->θ:Ljava/util/ArrayList;

    .line 40
    .line 41
    new-instance v0, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lbv1;->ι:Ljava/util/ArrayList;

    .line 47
    .line 48
    const-string v11, "clean_progress_bar_restore_alpha_on_pause"

    .line 49
    .line 50
    const-string v12, "clean_progress_bar_only_in_clean_mode"

    .line 51
    .line 52
    const-string v1, "clean_mode_enabled"

    .line 53
    .line 54
    const-string v2, "clean_right_panel_alpha"

    .line 55
    .line 56
    const-string v3, "clean_bottom_info_alpha"

    .line 57
    .line 58
    const-string v4, "clean_top_bar_alpha"

    .line 59
    .line 60
    const-string v5, "clean_auto_hide"

    .line 61
    .line 62
    const-string v6, "clean_touch_restore_controls"

    .line 63
    .line 64
    const-string v7, "clean_pause_show_bottom_bar"

    .line 65
    .line 66
    const-string v8, "clean_auto_hide_delay"

    .line 67
    .line 68
    const-string v9, "clean_progress_bar_enabled"

    .line 69
    .line 70
    const-string v10, "clean_progress_bar_alpha"

    .line 71
    .line 72
    filled-new-array/range {v1 .. v12}, [Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {}, Ls1;->ω()Ljava/util/LinkedHashSet;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-static {v0, v1}, Lg81;->ο(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    sput-object v0, Lbv1;->ο:Ljava/util/LinkedHashSet;

    .line 89
    .line 90
    new-instance v0, Lkt0;

    .line 91
    .line 92
    const/16 v1, 0x1c

    .line 93
    .line 94
    invoke-direct {v0, v1}, Lkt0;-><init>(I)V

    .line 95
    .line 96
    .line 97
    new-instance v1, Lh22;

    .line 98
    .line 99
    invoke-direct {v1, v0}, Lh22;-><init>(Lp70;)V

    .line 100
    .line 101
    .line 102
    sput-object v1, Lbv1;->π:Lh22;

    .line 103
    .line 104
    new-instance v0, Lkt0;

    .line 105
    .line 106
    const/16 v1, 0x1d

    .line 107
    .line 108
    invoke-direct {v0, v1}, Lkt0;-><init>(I)V

    .line 109
    .line 110
    .line 111
    new-instance v1, Lh22;

    .line 112
    .line 113
    invoke-direct {v1, v0}, Lh22;-><init>(Lp70;)V

    .line 114
    .line 115
    .line 116
    sput-object v1, Lbv1;->ρ:Lh22;

    .line 117
    .line 118
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 119
    .line 120
    const-wide/16 v1, 0x0

    .line 121
    .line 122
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 123
    .line 124
    .line 125
    sput-object v0, Lbv1;->σ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 126
    .line 127
    return-void
.end method

.method public static Α()I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "voice_replace_audio_list"

    .line 3
    .line 4
    const-string v2, ""

    .line 5
    .line 6
    invoke-static {v1, v2}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    move v1, v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v2, Lorg/json/JSONArray;

    .line 19
    .line 20
    invoke-direct {v2, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    goto :goto_1

    .line 32
    :catchall_0
    move-exception v1

    .line 33
    new-instance v2, Leo1;

    .line 34
    .line 35
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    move-object v1, v2

    .line 39
    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    instance-of v2, v1, Leo1;

    .line 44
    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    move-object v1, v0

    .line 48
    :cond_1
    check-cast v1, Ljava/lang/Number;

    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    return v0
.end method

.method public static Β()Z
    .locals 5

    .line 1
    :try_start_0
    sget-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->π:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_4

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Ljava/lang/String;

    .line 27
    .line 28
    sget-object v2, Lcom/example/dyhelper/ui/GestureAreaView;->ρ:Ljava/util/List;

    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, Ljava/lang/String;

    .line 54
    .line 55
    sget-object v4, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 56
    .line 57
    invoke-static {v1, v3}, Li2;->ω(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    const-string v4, "\u65e0"

    .line 62
    .line 63
    invoke-static {v3, v4}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-static {v3}, Li2;->υ(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    const-string v4, "\u6a21\u5757\u83dc\u5355"

    .line 72
    .line 73
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    if-eqz v3, :cond_3

    .line 78
    .line 79
    const/4 v0, 0x1

    .line 80
    return v0

    .line 81
    :catchall_0
    :cond_4
    :goto_1
    const/4 v0, 0x0

    .line 82
    return v0
.end method

.method public static Γ(Landroid/view/View;F)V
    .locals 2

    .line 1
    new-instance v0, Lou;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1, p1}, Lou;-><init>(IF)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static Δ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "#"

    .line 5
    .line 6
    invoke-static {p0, v0, p0}, Lq02;->щ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 19
    .line 20
    invoke-static {v0, p0, v0}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static Ε(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lbv1;->ο:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lug;->α:Ltg;

    .line 10
    .line 11
    const-string v0, "settings_ui"

    .line 12
    .line 13
    invoke-static {p0, v0}, Ltg;->Ω(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public static Ζ(Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-static {v2, v1}, Lj81;->Σ(II)Lxm0;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    const-string v4, "\n"

    .line 16
    .line 17
    new-instance v8, Lcl1;

    .line 18
    .line 19
    const/4 v1, 0x5

    .line 20
    invoke-direct {v8, v1, v0}, Lcl1;-><init>(ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    const/16 v9, 0x1e

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v7, 0x0

    .line 28
    invoke-static/range {v3 .. v9}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    invoke-static {p0}, Lj81;->Θ(Ljava/lang/String;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    const/16 v6, 0x3e

    .line 41
    .line 42
    const-string v1, "\n"

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    const/4 v3, 0x0

    .line 46
    const/4 v4, 0x0

    .line 47
    invoke-static/range {v0 .. v6}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 p0, 0x0

    .line 53
    :goto_0
    if-nez p0, :cond_1

    .line 54
    .line 55
    const-string p0, ""

    .line 56
    .line 57
    :cond_1
    return-object p0
.end method

.method public static Η(Landroid/app/Activity;La80;)V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Lmu1;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/app/Fragment;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, Lmu1;->ε:La80;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v1, "DYHelper_ImagePicker"

    .line 17
    .line 18
    invoke-virtual {p1, v0, v1}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception p1

    .line 27
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v0, "\u542f\u52a8\u56fe\u7247\u9009\u62e9\u5668\u5931\u8d25: "

    .line 32
    .line 33
    invoke-static {v0, p1}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const/4 v0, 0x4

    .line 38
    const-string v1, "DYHelper"

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-static {v1, p1, v2, v0, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    const-string p1, "\u65e0\u6cd5\u6253\u5f00\u76f8\u518c"

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public static Θ(Landroid/content/Context;Ljava/lang/String;ZLandroid/widget/Switch;Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Li81;->τ(Landroid/content/Context;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-static {p1, p4}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eq p2, p1, :cond_0

    .line 21
    .line 22
    invoke-static {p0}, Li81;->Α(Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p3}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eq p0, p1, :cond_2

    .line 30
    .line 31
    new-instance p0, Ljg;

    .line 32
    .line 33
    const/4 p2, 0x4

    .line 34
    invoke-direct {p0, p3, p1, p2}, Ljg;-><init>(Ljava/lang/Object;ZI)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p3, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-static {p1, p2}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    :cond_2
    :goto_0
    return-void
.end method

.method public static Ι(ILandroid/content/Context;Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Li81;->τ(Landroid/content/Context;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Li81;->Α(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :cond_0
    invoke-static {p2, p0}, Lui1;->Η(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method public static Κ()Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v0, Lq71;->ζ:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0xa

    .line 8
    .line 9
    invoke-static {v0, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v1}, Lex0;->Κ(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/16 v2, 0x10

    .line 18
    .line 19
    if-ge v1, v2, :cond_0

    .line 20
    .line 21
    move v1, v2

    .line 22
    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    move-object v3, v1

    .line 42
    check-cast v3, Ln71;

    .line 43
    .line 44
    iget-object v3, v3, Ln71;->α:Ljava/lang/String;

    .line 45
    .line 46
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    sget-object v0, Lq71;->α:Lq71;

    .line 51
    .line 52
    invoke-static {}, Lq71;->χ()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-static {}, Lxv1;->α()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const/4 v3, 0x0

    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_2

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_5

    .line 79
    .line 80
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v2, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    check-cast v4, Ln71;

    .line 91
    .line 92
    if-eqz v4, :cond_3

    .line 93
    .line 94
    invoke-virtual {v4, v0}, Ln71;->α(Z)Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    const/4 v5, 0x1

    .line 99
    if-ne v4, v5, :cond_3

    .line 100
    .line 101
    add-int/lit8 v3, v3, 0x1

    .line 102
    .line 103
    if-ltz v3, :cond_4

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_4
    invoke-static {}, Lyh;->ф()V

    .line 107
    .line 108
    .line 109
    const/4 v0, 0x0

    .line 110
    throw v0

    .line 111
    :cond_5
    :goto_2
    if-nez v3, :cond_6

    .line 112
    .line 113
    const-string v0, "\u672a\u9009\u62e9"

    .line 114
    .line 115
    return-object v0

    .line 116
    :cond_6
    const-string v0, "\u5df2\u9009 "

    .line 117
    .line 118
    const-string v1, " \u9879"

    .line 119
    .line 120
    invoke-static {v0, v3, v1}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    return-object v0
.end method

.method public static Λ(Ljava/lang/String;I)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-le v0, p1, :cond_0

    .line 9
    .line 10
    invoke-static {p0, p1}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string p1, "..."

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :cond_0
    return-object p0
.end method

.method public static Μ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp70;)V
    .locals 1

    .line 1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance p1, Lwt1;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-direct {p1, p2, p4}, Lwt1;-><init>(ILp70;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p3, p1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string p1, "\u53d6\u6d88"

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-virtual {p0, p1, p2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static final Ν(Landroid/app/Activity;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 11
    .line 12
    .line 13
    const/16 p1, 0xb

    .line 14
    .line 15
    invoke-static {p0, p1}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    int-to-float p0, p0

    .line 20
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public static final Ξ(Lum1;Lwu1;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {v0, v1, v0}, Lux;->Ε(Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v2, p0, Lum1;->ε:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/lang/CharSequence;

    .line 10
    .line 11
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    move-object v2, v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v2, p0, Lum1;->ε:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v2}, Lux;->Δ(Ljava/lang/String;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v3, Lgx0;

    .line 31
    .line 32
    invoke-direct {v3, v2}, Lgx0;-><init>(Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    iput-object v3, p1, Lwu1;->ε:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lum1;->ε:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Ljava/lang/CharSequence;

    .line 43
    .line 44
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    new-instance v4, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string p1, "/"

    .line 76
    .line 77
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    :goto_1
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-eqz p1, :cond_2

    .line 95
    .line 96
    const-string p1, "\u6682\u65e0 DyLog \u65e5\u5fd7\u3002\u6ce8\u610f\uff1a\u53ea\u6709\u901a\u8fc7 DyLog.log/d/e \u5199\u5165\u7684\u65e5\u5fd7\u624d\u4f1a\u663e\u793a\u3002"

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_2
    iget-object p1, p0, Lum1;->ε:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p1, Ljava/lang/CharSequence;

    .line 102
    .line 103
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-nez p1, :cond_3

    .line 108
    .line 109
    iget-object p1, p0, Lum1;->ε:Ljava/lang/Object;

    .line 110
    .line 111
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    new-instance v2, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    const-string v3, "\u7b5b\u9009 TAG\uff1a"

    .line 122
    .line 123
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string p1, " \u00b7 \u663e\u793a "

    .line 130
    .line 131
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string p1, " / "

    .line 138
    .line 139
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const-string p1, " \u6761"

    .line 143
    .line 144
    invoke-static {v2, v0, p1}, Lnx;->κ(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    goto :goto_2

    .line 149
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    const-string p2, "\u5171 "

    .line 154
    .line 155
    const-string v0, " \u6761\u65e5\u5fd7 \u00b7 \u6700\u65b0\u65e5\u5fd7\u5728\u6700\u4e0a\u65b9"

    .line 156
    .line 157
    invoke-static {p2, p1, v0}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    :goto_2
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 162
    .line 163
    .line 164
    iget-object p1, p0, Lum1;->ε:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast p1, Ljava/lang/CharSequence;

    .line 167
    .line 168
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-eqz p1, :cond_4

    .line 173
    .line 174
    const-string p1, "\u6682\u65e0 DyLog \u65e5\u5fd7\n\u53ea\u6709\u901a\u8fc7 DyLog.log / DyLog.d / DyLog.e \u5199\u5165\u7684\u65e5\u5fd7\u4f1a\u663e\u793a"

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_4
    iget-object p1, p0, Lum1;->ε:Ljava/lang/Object;

    .line 178
    .line 179
    new-instance p2, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    const-string p3, "\u6ca1\u6709\u5339\u914d TAG\u300c"

    .line 182
    .line 183
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const-string p1, "\u300d\u7684\u65e5\u5fd7"

    .line 190
    .line 191
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    :goto_3
    invoke-virtual {p4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 199
    .line 200
    .line 201
    iget-object p1, p0, Lum1;->ε:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast p1, Ljava/lang/CharSequence;

    .line 204
    .line 205
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    xor-int/2addr p1, v1

    .line 210
    invoke-virtual {p5, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 211
    .line 212
    .line 213
    iget-object p0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast p0, Ljava/lang/CharSequence;

    .line 216
    .line 217
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 218
    .line 219
    .line 220
    move-result p0

    .line 221
    if-nez p0, :cond_5

    .line 222
    .line 223
    const/high16 p0, 0x3f800000    # 1.0f

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_5
    const p0, 0x3ee66666    # 0.45f

    .line 227
    .line 228
    .line 229
    :goto_4
    invoke-virtual {p5, p0}, Landroid/view/View;->setAlpha(F)V

    .line 230
    .line 231
    .line 232
    return-void
.end method

.method public static final Ο(Ljava/util/LinkedHashMap;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    check-cast p0, Ljava/lang/Iterable;

    .line 9
    .line 10
    move-object v0, p0

    .line 11
    check-cast v0, Ljava/util/Collection;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    return v1

    .line 21
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    if-ltz v1, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-static {}, Lyh;->ф()V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    throw p0

    .line 56
    :cond_3
    return v1
.end method

.method public static final Π(Landroid/widget/TextView;Ljava/util/List;Landroid/widget/TextView;Ljava/util/LinkedHashMap;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "\u53ef\u8fc7\u6ee4\u53f3\u4fa7\u63a7\u4ef6\uff1a"

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p1, " \u4e2a"

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p3}, Lbv1;->Ο(Ljava/util/LinkedHashMap;)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-lez p0, :cond_0

    .line 32
    .line 33
    invoke-static {p3}, Lbv1;->Ο(Ljava/util/LinkedHashMap;)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    const-string p1, "\u5f53\u524d\u5df2\u52fe\u9009\u9690\u85cf "

    .line 38
    .line 39
    const-string p3, " \u9879\uff0c\u4fdd\u5b58\u540e\u91cd\u8fdb\u89c6\u9891\u9875\u751f\u6548"

    .line 40
    .line 41
    invoke-static {p1, p0, p3}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const-string p0, "\u52fe\u9009\u540e\u70b9\u51fb\u4fdd\u5b58\u5373\u53ef\u751f\u6548"

    .line 47
    .line 48
    :goto_0
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public static final Ρ(Lzc0;Lqm1;Lum1;Lum1;Lum1;Lum1;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/String;Ljava/util/LinkedHashSet;)V
    .locals 11

    .line 1
    invoke-static/range {p11 .. p11}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 10
    .line 11
    invoke-static {v1, v0, v1}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p2, Lum1;->ε:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iget-object v2, p4, Lum1;->ε:Ljava/lang/Object;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    check-cast v2, Ljava/util/List;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    check-cast v2, Ljava/lang/Iterable;

    .line 29
    .line 30
    new-instance v0, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    move-object v4, v3

    .line 50
    check-cast v4, Llu1;

    .line 51
    .line 52
    iget-object v4, v4, Llu1;->ε:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v5, p2, Lum1;->ε:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v5, Ljava/lang/CharSequence;

    .line 57
    .line 58
    const/4 v7, 0x0

    .line 59
    invoke-static {v4, v5, v7}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_1

    .line 64
    .line 65
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move-object v2, v0

    .line 70
    :goto_1
    iput-object v2, p3, Lum1;->ε:Ljava/lang/Object;

    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 73
    .line 74
    .line 75
    move-object v3, p1

    .line 76
    move-object v6, p2

    .line 77
    move-object v1, p3

    .line 78
    move-object v0, p4

    .line 79
    move-object/from16 v5, p5

    .line 80
    .line 81
    move-object/from16 v9, p6

    .line 82
    .line 83
    move-object/from16 v2, p7

    .line 84
    .line 85
    move-object/from16 v4, p8

    .line 86
    .line 87
    move-object/from16 v7, p9

    .line 88
    .line 89
    move-object/from16 v8, p10

    .line 90
    .line 91
    move-object/from16 v10, p12

    .line 92
    .line 93
    invoke-static/range {v0 .. v10}, Lbv1;->Τ(Lum1;Lum1;Landroid/widget/TextView;Lqm1;Landroid/widget/TextView;Lum1;Lum1;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Ljava/util/LinkedHashSet;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public static final Σ(Lum1;Lqm1;Lum1;Landroid/widget/EditText;Ljava/util/Set;Ljava/util/HashSet;Ljava/util/LinkedHashSet;Lum1;Lum1;Lzc0;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Ljava/util/List;ZLjava/lang/Throwable;)V
    .locals 13

    .line 1
    move-object/from16 v0, p17

    .line 2
    .line 3
    iput-object v0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 4
    .line 5
    move/from16 v0, p16

    .line 6
    .line 7
    iput-boolean v0, p1, Lqm1;->ε:Z

    .line 8
    .line 9
    move-object/from16 v0, p15

    .line 10
    .line 11
    iput-object v0, p2, Lum1;->ε:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Llu1;

    .line 28
    .line 29
    iget-object v2, v2, Llu1;->β:Ljava/lang/String;

    .line 30
    .line 31
    move-object/from16 v3, p4

    .line 32
    .line 33
    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v6, :cond_1

    .line 38
    .line 39
    move-object/from16 v6, p5

    .line 40
    .line 41
    invoke-virtual {v6, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    move-object/from16 v12, p6

    .line 46
    .line 47
    if-nez v7, :cond_0

    .line 48
    .line 49
    invoke-virtual {v12, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move-object/from16 v6, p5

    .line 54
    .line 55
    move-object/from16 v12, p6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move-object/from16 v12, p6

    .line 59
    .line 60
    invoke-virtual/range {p3 .. p3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    const/4 v0, 0x0

    .line 72
    :goto_1
    if-nez v0, :cond_4

    .line 73
    .line 74
    const-string v0, ""

    .line 75
    .line 76
    :cond_4
    move-object v5, p0

    .line 77
    move-object v1, p1

    .line 78
    move-object v4, p2

    .line 79
    move-object/from16 v2, p7

    .line 80
    .line 81
    move-object/from16 v3, p8

    .line 82
    .line 83
    move-object/from16 v7, p10

    .line 84
    .line 85
    move-object/from16 v8, p11

    .line 86
    .line 87
    move-object/from16 v9, p12

    .line 88
    .line 89
    move-object/from16 v10, p13

    .line 90
    .line 91
    move-object/from16 v6, p14

    .line 92
    .line 93
    move-object v11, v0

    .line 94
    move-object/from16 v0, p9

    .line 95
    .line 96
    invoke-static/range {v0 .. v12}, Lbv1;->Ρ(Lzc0;Lqm1;Lum1;Lum1;Lum1;Lum1;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/String;Ljava/util/LinkedHashSet;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public static final Τ(Lum1;Lum1;Landroid/widget/TextView;Lqm1;Landroid/widget/TextView;Lum1;Lum1;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Ljava/util/LinkedHashSet;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object p1, p1, Lum1;->ε:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iget-object p0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Ljava/lang/Iterable;

    .line 20
    .line 21
    instance-of v1, p0, Ljava/util/Collection;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    move-object v1, p0

    .line 27
    check-cast v1, Ljava/util/Collection;

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    move v1, v2

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    move v1, v2

    .line 42
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Llu1;

    .line 53
    .line 54
    iget-object v3, v3, Llu1;->β:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {p10, v3}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_1

    .line 61
    .line 62
    add-int/lit8 v1, v1, 0x1

    .line 63
    .line 64
    if-ltz v1, :cond_2

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-static {}, Lyh;->ф()V

    .line 68
    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    throw p0

    .line 72
    :cond_3
    :goto_1
    iget-boolean p0, p3, Lqm1;->ε:Z

    .line 73
    .line 74
    if-eqz p0, :cond_4

    .line 75
    .line 76
    if-nez v0, :cond_4

    .line 77
    .line 78
    const-string p0, "\u52a0\u8f7d\u4e2d"

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    new-instance p0, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string p10, "/"

    .line 90
    .line 91
    invoke-virtual {p0, p10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    :goto_2
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 102
    .line 103
    .line 104
    iget-boolean p0, p3, Lqm1;->ε:Z

    .line 105
    .line 106
    if-eqz p0, :cond_5

    .line 107
    .line 108
    if-nez v0, :cond_5

    .line 109
    .line 110
    const-string p0, "\u6b63\u5728\u52a0\u8f7d\u5b8c\u6574\u4f1a\u8bdd\u5217\u8868\u2026"

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_5
    if-eqz p0, :cond_6

    .line 114
    .line 115
    if-lez v0, :cond_6

    .line 116
    .line 117
    const-string p0, "\u5df2\u663e\u793a\u7f13\u5b58 "

    .line 118
    .line 119
    const-string p1, " \u4e2a\uff0c\u6b63\u5728\u540e\u53f0\u5237\u65b0\u2026"

    .line 120
    .line 121
    invoke-static {p0, v0, p1}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    goto :goto_3

    .line 126
    :cond_6
    iget-object p0, p5, Lum1;->ε:Ljava/lang/Object;

    .line 127
    .line 128
    if-eqz p0, :cond_8

    .line 129
    .line 130
    if-nez v0, :cond_8

    .line 131
    .line 132
    check-cast p0, Ljava/lang/Throwable;

    .line 133
    .line 134
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    if-nez p0, :cond_7

    .line 139
    .line 140
    const-string p0, "\u672a\u77e5\u9519\u8bef"

    .line 141
    .line 142
    :cond_7
    const-string p1, "\u52a0\u8f7d\u5931\u8d25\uff1a"

    .line 143
    .line 144
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    goto :goto_3

    .line 149
    :cond_8
    const-string p2, " \u4e2a"

    .line 150
    .line 151
    if-eqz p0, :cond_9

    .line 152
    .line 153
    if-lez v0, :cond_9

    .line 154
    .line 155
    const-string p0, "\u540e\u53f0\u5237\u65b0\u5931\u8d25\uff0c\u5df2\u663e\u793a\u7f13\u5b58 "

    .line 156
    .line 157
    invoke-static {p0, v0, p2}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    goto :goto_3

    .line 162
    :cond_9
    if-nez v0, :cond_a

    .line 163
    .line 164
    const-string p0, "\u6682\u672a\u83b7\u53d6\u5230\u4f1a\u8bdd\u5217\u8868\uff0c\u8bf7\u5148\u8fdb\u5165\u4e00\u6b21\u6d88\u606f\u9875\u540e\u518d\u8bd5"

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_a
    iget-object p0, p6, Lum1;->ε:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast p0, Ljava/lang/CharSequence;

    .line 170
    .line 171
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 172
    .line 173
    .line 174
    move-result p0

    .line 175
    if-nez p0, :cond_b

    .line 176
    .line 177
    const-string p0, " / "

    .line 178
    .line 179
    const-string p5, " \u4e2a \u00b7 \u5df2\u9009 "

    .line 180
    .line 181
    const-string p10, "\u5339\u914d "

    .line 182
    .line 183
    invoke-static {p10, p1, p0, v0, p5}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-static {p0, v1, p2}, Lnx;->κ(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    goto :goto_3

    .line 192
    :cond_b
    const-string p0, "\u5171 "

    .line 193
    .line 194
    const-string p1, " \u4e2a\u4f1a\u8bdd \u00b7 \u5df2\u9009 "

    .line 195
    .line 196
    invoke-static {p0, v0, p1, v1, p2}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    :goto_3
    invoke-virtual {p4, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 201
    .line 202
    .line 203
    iget-boolean p0, p3, Lqm1;->ε:Z

    .line 204
    .line 205
    if-eqz p0, :cond_c

    .line 206
    .line 207
    const-string p0, "\u6b63\u5728\u52a0\u8f7d\u4f1a\u8bdd\u2026"

    .line 208
    .line 209
    goto :goto_4

    .line 210
    :cond_c
    iget-object p0, p6, Lum1;->ε:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast p0, Ljava/lang/CharSequence;

    .line 213
    .line 214
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 215
    .line 216
    .line 217
    move-result p0

    .line 218
    if-nez p0, :cond_d

    .line 219
    .line 220
    const-string p0, "\u6ca1\u6709\u5339\u914d\u7684\u4f1a\u8bdd"

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_d
    const-string p0, "\u6682\u65e0\u4f1a\u8bdd\u6570\u636e\n\u8bf7\u5148\u8fdb\u5165\u4e00\u6b21\u6d88\u606f\u9875\u540e\u518d\u8bd5"

    .line 224
    .line 225
    :goto_4
    invoke-virtual {p7, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 226
    .line 227
    .line 228
    new-instance p0, Ljava/lang/StringBuilder;

    .line 229
    .line 230
    const-string p1, "\u4fdd\u5b58 "

    .line 231
    .line 232
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    const-string p1, " \u4e2a\u4f1a\u8bdd\u89c4\u5219"

    .line 239
    .line 240
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    invoke-virtual {p8, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 248
    .line 249
    .line 250
    iget-boolean p0, p3, Lqm1;->ε:Z

    .line 251
    .line 252
    if-eqz p0, :cond_e

    .line 253
    .line 254
    if-eqz v0, :cond_f

    .line 255
    .line 256
    :cond_e
    const/4 v2, 0x1

    .line 257
    :cond_f
    invoke-virtual {p9, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 258
    .line 259
    .line 260
    if-eqz v2, :cond_10

    .line 261
    .line 262
    const/high16 p0, 0x3f800000    # 1.0f

    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_10
    const p0, 0x3ee66666    # 0.45f

    .line 266
    .line 267
    .line 268
    :goto_5
    invoke-virtual {p9, p0}, Landroid/view/View;->setAlpha(F)V

    .line 269
    .line 270
    .line 271
    return-void
.end method

.method public static final Υ(Lum1;Lqm1;Lqm1;Lum1;)Ljava/lang/String;
    .locals 7

    .line 1
    iget-object p0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "{time:"

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, "}"

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    filled-new-array {p0}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Lyh;->г([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-boolean p0, p1, Lqm1;->ε:Z

    .line 31
    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    const-string p0, "{location}"

    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-boolean p0, p2, Lqm1;->ε:Z

    .line 40
    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    const-string p0, "{id}"

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_1
    iget-object p0, p3, Lum1;->ε:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v1, p0

    .line 51
    check-cast v1, Ljava/lang/CharSequence;

    .line 52
    .line 53
    const/4 v5, 0x0

    .line 54
    const/16 v6, 0x3e

    .line 55
    .line 56
    const/4 v2, 0x0

    .line 57
    const/4 v3, 0x0

    .line 58
    const/4 v4, 0x0

    .line 59
    invoke-static/range {v0 .. v6}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method public static final Φ(Lum1;Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lum1;Lqm1;Lqm1;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-static {p1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    :goto_0
    if-eqz p1, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const-string p1, "yyyy-MM-dd HH:mm"

    .line 35
    .line 36
    :goto_1
    iput-object p1, p0, Lum1;->ε:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-static {p0, p6, p7, p5}, Lbv1;->Υ(Lum1;Lqm1;Lqm1;Lum1;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object v0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    :try_start_0
    new-instance v1, Ljava/text/SimpleDateFormat;

    .line 50
    .line 51
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-direct {v1, v0, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 56
    .line 57
    .line 58
    new-instance v0, Ljava/util/Date;

    .line 59
    .line 60
    const-wide v2, 0x18fd2d00800L

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :catchall_0
    const-string v0, "2024-06-01 16:00"

    .line 77
    .line 78
    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 85
    .line 86
    .line 87
    const/4 v2, 0x0

    .line 88
    move v3, v2

    .line 89
    :goto_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-ge v3, v4, :cond_6

    .line 94
    .line 95
    const/16 v4, 0x7b

    .line 96
    .line 97
    const/4 v5, 0x4

    .line 98
    invoke-static {p1, v4, v3, v5}, Lq02;->г(Ljava/lang/CharSequence;CII)I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-gez v4, :cond_2

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    invoke-virtual {v1, p1, v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    goto :goto_6

    .line 112
    :cond_2
    invoke-virtual {v1, p1, v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    add-int/lit8 v3, v4, 0x1

    .line 116
    .line 117
    const/16 v6, 0x7d

    .line 118
    .line 119
    invoke-static {p1, v6, v3, v5}, Lq02;->г(Ljava/lang/CharSequence;CII)I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-gez v5, :cond_3

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    invoke-virtual {v1, p1, v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    goto :goto_6

    .line 133
    :cond_3
    invoke-virtual {p1, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    const-string v6, "time"

    .line 138
    .line 139
    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-nez v6, :cond_5

    .line 144
    .line 145
    const-string v6, "createTime"

    .line 146
    .line 147
    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-nez v6, :cond_5

    .line 152
    .line 153
    const-string v6, "time:"

    .line 154
    .line 155
    invoke-static {v3, v6, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    if-nez v6, :cond_5

    .line 160
    .line 161
    const-string v6, "createTime:"

    .line 162
    .line 163
    invoke-static {v3, v6, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    if-eqz v3, :cond_4

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_4
    add-int/lit8 v3, v5, 0x1

    .line 171
    .line 172
    invoke-virtual {v1, p1, v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_5
    :goto_4
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    :goto_5
    add-int/lit8 v3, v5, 0x1

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_6
    :goto_6
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    const-string v0, "{location}"

    .line 187
    .line 188
    const-string v1, "\u4e0a\u6d77"

    .line 189
    .line 190
    invoke-static {p1, v0, v1}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    const-string v0, "{id}"

    .line 195
    .line 196
    const-string v1, "7123456789012345678"

    .line 197
    .line 198
    invoke-static {p1, v0, v1}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    const-string v0, "\u9884\u89c8\uff1a"

    .line 203
    .line 204
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 209
    .line 210
    .line 211
    invoke-static {p0, p6, p7, p5}, Lbv1;->Υ(Lum1;Lqm1;Lqm1;Lum1;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    invoke-virtual {p3, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 216
    .line 217
    .line 218
    iget-object p0, p5, Lum1;->ε:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast p0, Ljava/lang/CharSequence;

    .line 221
    .line 222
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    if-eqz p1, :cond_7

    .line 227
    .line 228
    const-string p0, "\u7a7a\u683c"

    .line 229
    .line 230
    :cond_7
    invoke-virtual {p4, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 231
    .line 232
    .line 233
    return-void
.end method

.method public static Χ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILa80;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p4}, Landroid/widget/TextView;->setInputType(I)V

    .line 13
    .line 14
    .line 15
    const/16 p2, 0x10

    .line 16
    .line 17
    invoke-static {p0, p2}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    const/16 p4, 0xc

    .line 22
    .line 23
    invoke-static {p0, p4}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-static {p0, p2}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-static {p0, p4}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 32
    .line 33
    .line 34
    move-result p4

    .line 35
    invoke-virtual {v0, p3, v1, v2, p4}, Landroid/view/View;->setPadding(IIII)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    .line 43
    .line 44
    .line 45
    move-result p3

    .line 46
    invoke-virtual {v0, p3}, Landroid/widget/EditText;->setSelection(I)V

    .line 47
    .line 48
    .line 49
    new-instance p3, Landroid/app/AlertDialog$Builder;

    .line 50
    .line 51
    invoke-direct {p3, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p3, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const/4 p3, 0x1

    .line 59
    invoke-static {p0, p3}, Lnx;->β(Landroid/app/Activity;I)Landroid/widget/LinearLayout;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    const/16 p4, 0x18

    .line 64
    .line 65
    invoke-static {p0, p4}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-static {p0, p2}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    invoke-static {p0, p4}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 74
    .line 75
    .line 76
    move-result p4

    .line 77
    const/16 v2, 0x8

    .line 78
    .line 79
    invoke-static {p0, v2}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    invoke-virtual {p3, v1, p2, p4, p0}, Landroid/view/View;->setPadding(IIII)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, p3}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    new-instance p1, Lbc0;

    .line 94
    .line 95
    const/16 p2, 0xa

    .line 96
    .line 97
    invoke-direct {p1, p5, p2, v0}, Lbc0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    const-string p2, "\u786e\u5b9a"

    .line 101
    .line 102
    invoke-virtual {p0, p2, p1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    const-string p1, "\u53d6\u6d88"

    .line 107
    .line 108
    const/4 p2, 0x0

    .line 109
    invoke-virtual {p0, p1, p2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method public static Ω(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;ILa80;)V
    .locals 2

    .line 1
    new-instance v0, Lsm1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p3, v0, Lsm1;->ε:I

    .line 7
    .line 8
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p2, [Ljava/lang/CharSequence;

    .line 18
    .line 19
    new-instance p1, Lgd0;

    .line 20
    .line 21
    const/4 v1, 0x4

    .line 22
    invoke-direct {p1, v1, v0}, Lgd0;-><init>(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p2, p3, p1}, Landroid/app/AlertDialog$Builder;->setSingleChoiceItems([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance p1, Lbc0;

    .line 30
    .line 31
    const/16 p2, 0x8

    .line 32
    .line 33
    invoke-direct {p1, p4, p2, v0}, Lbc0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    const-string p2, "\u786e\u5b9a"

    .line 37
    .line 38
    invoke-virtual {p0, p2, p1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const-string p1, "\u53d6\u6d88"

    .line 43
    .line 44
    const/4 p2, 0x0

    .line 45
    invoke-virtual {p0, p1, p2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public static α(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/util/List;Z)V
    .locals 6

    .line 1
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    add-int/lit8 v2, v0, 0x1

    .line 17
    .line 18
    if-ltz v0, :cond_1

    .line 19
    .line 20
    check-cast v1, Lys1;

    .line 21
    .line 22
    if-lez v0, :cond_0

    .line 23
    .line 24
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object v0, v1, Lys1;->β:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v3, v1, Lys1;->γ:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v4, v1, Lys1;->α:Ljava/lang/String;

    .line 36
    .line 37
    iget-boolean v5, v1, Lys1;->δ:Z

    .line 38
    .line 39
    invoke-static {v4, v5}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    new-instance v5, Lnt1;

    .line 44
    .line 45
    invoke-direct {v5, p3, p1, v1}, Lnt1;-><init>(ZLandroid/content/Context;Lys1;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p1, v0, v3, v4, v5}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 53
    .line 54
    .line 55
    move v0, v2

    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-static {}, Lyh;->х()V

    .line 58
    .line 59
    .line 60
    const/4 p0, 0x0

    .line 61
    throw p0

    .line 62
    :cond_2
    return-void
.end method

.method public static β(Landroid/widget/LinearLayout;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lbv1;->κ(Landroid/content/Context;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static γ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static δ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)V
    .locals 0

    .line 1
    invoke-static {p1, p2, p3, p4, p5}, Lbv1;->τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static ε(Landroid/view/View;Z)V
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p1, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/high16 v1, 0x3f800000    # 1.0f

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const/16 v2, 0x8

    .line 34
    .line 35
    invoke-static {p1, v2}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    int-to-float p1, p1

    .line 40
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0, v0}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    const-wide/16 v0, 0xdc

    .line 60
    .line 61
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    new-instance p1, Landroid/view/animation/DecelerateInterpolator;

    .line 66
    .line 67
    invoke-direct {p1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_1
    invoke-virtual {p0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_2
    if-nez p1, :cond_3

    .line 86
    .line 87
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-nez p1, :cond_3

    .line 92
    .line 93
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    const/4 v1, 0x6

    .line 109
    invoke-static {v0, v1}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    int-to-float v0, v0

    .line 114
    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    const-wide/16 v0, 0x96

    .line 119
    .line 120
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 125
    .line 126
    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    new-instance v0, Lmt1;

    .line 134
    .line 135
    const/4 v1, 0x0

    .line 136
    invoke-direct {v0, p0, v1}, Lmt1;-><init>(Landroid/view/View;I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 144
    .line 145
    .line 146
    :cond_3
    :goto_0
    return-void
.end method

.method public static ζ(Landroid/view/View;Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/4 v0, 0x0

    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->isLongClickable()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    :cond_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/view/View;->setLongClickable(Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 33
    .line 34
    .line 35
    :cond_2
    instance-of p1, p0, Landroid/view/ViewGroup;

    .line 36
    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    check-cast p0, Landroid/view/ViewGroup;

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    move v1, v0

    .line 46
    :goto_0
    if-ge v1, p1, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {v2, v0}, Lbv1;->ζ(Landroid/view/View;Z)V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v1, v1, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    :goto_1
    return-void
.end method

.method public static η(Landroid/app/Activity;Ljava/lang/String;)Landroid/widget/LinearLayout;
    .locals 4

    .line 1
    invoke-static {p0}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p0, p1}, Lbv1;->γ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, p0}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lbv1;->φ()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {v1}, Li81;->τ(Landroid/content/Context;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    const-string p1, "\u672a\u68c0\u6d4b\u5230\u8d26\u53f7"

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    if-eqz v1, :cond_1

    .line 33
    .line 34
    const-string p1, "\u5df2\u901a\u8fc7"

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const-string p1, "\u70b9\u51fb\u68c0\u67e5"

    .line 38
    .line 39
    :goto_0
    new-instance v1, Lg71;

    .line 40
    .line 41
    const/16 v2, 0x19

    .line 42
    .line 43
    invoke-direct {v1, p0, v2}, Lg71;-><init>(Landroid/app/Activity;I)V

    .line 44
    .line 45
    .line 46
    const-string v2, "\u5185\u6d4b\u72b6\u6001"

    .line 47
    .line 48
    const-string v3, "\u70b9\u51fb\u540e\u8054\u7f51\u68c0\u67e5\u5f53\u524d\u8d26\u53f7\u662f\u5426\u62e5\u6709\u5185\u6d4b\u8d44\u683c"

    .line 49
    .line 50
    invoke-static {p0, v2, p1, v3, v1}, Lbv1;->ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 55
    .line 56
    .line 57
    return-object v0
.end method

.method public static θ(Landroid/content/Context;)Landroid/widget/LinearLayout;
    .locals 6

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    .line 11
    .line 12
    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 13
    .line 14
    .line 15
    sget-object v3, Lbv1;->δ:Lqu1;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    const-string v5, "theme"

    .line 19
    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    iget-object v3, v3, Lqu1;->β:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 29
    .line 30
    .line 31
    const/16 v3, 0xe

    .line 32
    .line 33
    invoke-static {p0, v3}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    int-to-float v3, v3

    .line 38
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 39
    .line 40
    .line 41
    invoke-static {p0, v1}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    sget-object v3, Lbv1;->δ:Lqu1;

    .line 46
    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    iget-object v3, v3, Lqu1;->φ:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-virtual {v2, p0, v3}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 59
    .line 60
    .line 61
    new-instance p0, Landroid/widget/LinearLayout$LayoutParams;

    .line 62
    .line 63
    const/4 v2, -0x1

    .line 64
    const/4 v3, -0x2

    .line 65
    invoke-direct {p0, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Landroid/view/View;->setClipToOutline(Z)V

    .line 72
    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_0
    invoke-static {v5}, Lln0;->и(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v4

    .line 79
    :cond_1
    invoke-static {v5}, Lln0;->и(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v4
.end method

.method public static ι(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;
    .locals 10

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 8
    .line 9
    .line 10
    const/16 v2, 0x10

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 13
    .line 14
    .line 15
    invoke-static {p0, v2}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/16 v4, 0xd

    .line 20
    .line 21
    invoke-static {p0, v4}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    const/16 v6, 0xe

    .line 26
    .line 27
    invoke-static {p0, v6}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    invoke-static {p0, v4}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-virtual {v0, v3, v5, v6, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 36
    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    invoke-virtual {v0, v3}, Landroid/view/View;->setClickable(Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 43
    .line 44
    .line 45
    sget-object v4, Lbv1;->δ:Lqu1;

    .line 46
    .line 47
    const-string v5, "theme"

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    if-eqz v4, :cond_4

    .line 51
    .line 52
    iget-object v4, v4, Lqu1;->υ:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    invoke-static {v4}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-static {v1}, Llz1;->ζ(I)Landroid/graphics/drawable/GradientDrawable;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    new-instance v8, Landroid/graphics/drawable/RippleDrawable;

    .line 67
    .line 68
    invoke-direct {v8, v4, v7, v6}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v8}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 72
    .line 73
    .line 74
    new-instance v4, Landroid/widget/LinearLayout;

    .line 75
    .line 76
    invoke-direct {v4, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 80
    .line 81
    .line 82
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 83
    .line 84
    const/4 v8, -0x2

    .line 85
    const/high16 v9, 0x3f800000    # 1.0f

    .line 86
    .line 87
    invoke-direct {v7, v1, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 91
    .line 92
    .line 93
    new-instance v7, Landroid/widget/TextView;

    .line 94
    .line 95
    invoke-direct {v7, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    .line 100
    .line 101
    const/high16 p1, 0x41600000    # 14.0f

    .line 102
    .line 103
    invoke-virtual {v7, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 104
    .line 105
    .line 106
    sget-object p1, Lbv1;->δ:Lqu1;

    .line 107
    .line 108
    if-eqz p1, :cond_3

    .line 109
    .line 110
    iget-object p1, p1, Lqu1;->η:Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {p1, v7, v6, v3}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 116
    .line 117
    .line 118
    new-instance p1, Landroid/widget/TextView;

    .line 119
    .line 120
    invoke-direct {p1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 124
    .line 125
    .line 126
    const/high16 p3, 0x41400000    # 12.0f

    .line 127
    .line 128
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 129
    .line 130
    .line 131
    sget-object p3, Lbv1;->δ:Lqu1;

    .line 132
    .line 133
    if-eqz p3, :cond_2

    .line 134
    .line 135
    iget-object p3, p3, Lqu1;->ι:Ljava/lang/String;

    .line 136
    .line 137
    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 138
    .line 139
    .line 140
    move-result p3

    .line 141
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 142
    .line 143
    .line 144
    const/4 p3, 0x3

    .line 145
    invoke-static {p0, p3}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 146
    .line 147
    .line 148
    move-result v7

    .line 149
    invoke-virtual {p1, v1, v7, v1, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 156
    .line 157
    .line 158
    new-instance p1, Landroid/widget/LinearLayout;

    .line 159
    .line 160
    invoke-direct {p1, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 167
    .line 168
    .line 169
    new-instance v2, Landroid/widget/TextView;

    .line 170
    .line 171
    invoke-direct {v2, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 175
    .line 176
    .line 177
    const/high16 p2, 0x41500000    # 13.0f

    .line 178
    .line 179
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 180
    .line 181
    .line 182
    sget-object p2, Lbv1;->δ:Lqu1;

    .line 183
    .line 184
    if-eqz p2, :cond_1

    .line 185
    .line 186
    iget-object p2, p2, Lqu1;->θ:Ljava/lang/String;

    .line 187
    .line 188
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 189
    .line 190
    .line 191
    move-result p2

    .line 192
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 193
    .line 194
    .line 195
    const/4 p2, 0x6

    .line 196
    invoke-static {p0, p2}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 197
    .line 198
    .line 199
    move-result p2

    .line 200
    invoke-static {p0, p3}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    const/4 v7, 0x4

    .line 205
    invoke-static {p0, v7}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    invoke-static {p0, p3}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 210
    .line 211
    .line 212
    move-result p3

    .line 213
    invoke-virtual {v2, p2, v4, v8, p3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 214
    .line 215
    .line 216
    const/16 p2, 0x78

    .line 217
    .line 218
    invoke-static {p0, p2}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 219
    .line 220
    .line 221
    move-result p2

    .line 222
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setMaxWidth(I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 226
    .line 227
    .line 228
    sget-object p2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 229
    .line 230
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 234
    .line 235
    .line 236
    new-instance p2, Landroid/widget/TextView;

    .line 237
    .line 238
    invoke-direct {p2, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 239
    .line 240
    .line 241
    const-string p3, "\u203a"

    .line 242
    .line 243
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 244
    .line 245
    .line 246
    const/high16 p3, 0x41a00000    # 20.0f

    .line 247
    .line 248
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 249
    .line 250
    .line 251
    sget-object p3, Lbv1;->δ:Lqu1;

    .line 252
    .line 253
    if-eqz p3, :cond_0

    .line 254
    .line 255
    iget-object p3, p3, Lqu1;->ι:Ljava/lang/String;

    .line 256
    .line 257
    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 258
    .line 259
    .line 260
    move-result p3

    .line 261
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 262
    .line 263
    .line 264
    invoke-static {p0, v7}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 265
    .line 266
    .line 267
    move-result p0

    .line 268
    invoke-virtual {p2, p0, v1, v1, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 275
    .line 276
    .line 277
    new-instance p0, Lc9;

    .line 278
    .line 279
    const/16 p1, 0xd

    .line 280
    .line 281
    invoke-direct {p0, v0, p4, v2, p1}, Lc9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 285
    .line 286
    .line 287
    const p0, 0x3f7c28f6    # 0.985f

    .line 288
    .line 289
    .line 290
    invoke-static {v0, p0}, Lbv1;->Γ(Landroid/view/View;F)V

    .line 291
    .line 292
    .line 293
    return-object v0

    .line 294
    :cond_0
    invoke-static {v5}, Lln0;->и(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    throw v6

    .line 298
    :cond_1
    invoke-static {v5}, Lln0;->и(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    throw v6

    .line 302
    :cond_2
    invoke-static {v5}, Lln0;->и(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    throw v6

    .line 306
    :cond_3
    invoke-static {v5}, Lln0;->и(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    throw v6

    .line 310
    :cond_4
    invoke-static {v5}, Lln0;->и(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    throw v6
.end method

.method public static κ(Landroid/content/Context;)Landroid/view/View;
    .locals 4

    .line 1
    new-instance v0, Landroid/view/View;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lbv1;->δ:Lqu1;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v1, v1, Lqu1;->ζ:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-static {p0, v2}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v3, -0x1

    .line 27
    invoke-direct {v1, v3, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 28
    .line 29
    .line 30
    const/16 v2, 0x10

    .line 31
    .line 32
    invoke-static {p0, v2}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    iput p0, v1, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_0
    const-string p0, "theme"

    .line 43
    .line 44
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    throw p0
.end method

.method public static λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;
    .locals 4

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    const/high16 p1, 0x41400000    # 12.0f

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 12
    .line 13
    .line 14
    sget-object p1, Lbv1;->δ:Lqu1;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object p1, p1, Lqu1;->ι:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 25
    .line 26
    .line 27
    const/16 p1, 0x11

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 30
    .line 31
    .line 32
    const/16 p1, 0x10

    .line 33
    .line 34
    invoke-static {p0, p1}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/16 v2, 0xe

    .line 39
    .line 40
    invoke-static {p0, v2}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-static {p0, p1}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    const/4 v3, 0x6

    .line 49
    invoke-static {p0, v3}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-virtual {v0, v1, v2, p1, p0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 54
    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_0
    const-string p0, "theme"

    .line 58
    .line 59
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 p0, 0x0

    .line 63
    throw p0
.end method

.method public static μ(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "\r"

    .line 5
    .line 6
    const-string v1, "\n"

    .line 7
    .line 8
    invoke-static {p0, v0, v1}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Lq02;->к(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/16 v1, 0xa

    .line 19
    .line 20
    invoke-static {p0, v1}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_2

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    move-object v3, v2

    .line 75
    check-cast v3, Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-nez v3, :cond_1

    .line 82
    .line 83
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_3

    .line 92
    .line 93
    const-string p0, "\u672a\u8bbe\u7f6e"

    .line 94
    .line 95
    return-object p0

    .line 96
    :cond_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    const/4 v2, 0x1

    .line 101
    const/4 v3, 0x0

    .line 102
    if-ne v0, v2, :cond_4

    .line 103
    .line 104
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    check-cast p0, Ljava/lang/String;

    .line 109
    .line 110
    const/16 v0, 0x12

    .line 111
    .line 112
    invoke-static {p0, v0}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0

    .line 117
    :cond_4
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    const/4 v4, 0x2

    .line 122
    if-ne v0, v4, :cond_5

    .line 123
    .line 124
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, Ljava/lang/String;

    .line 129
    .line 130
    invoke-static {v0, v1}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    check-cast p0, Ljava/lang/String;

    .line 139
    .line 140
    invoke-static {p0, v1}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    const-string v1, ", "

    .line 145
    .line 146
    invoke-static {v0, v1, p0}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    return-object p0

    .line 151
    :cond_5
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    check-cast v0, Ljava/lang/String;

    .line 156
    .line 157
    invoke-static {v0, v1}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    new-instance v1, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v0, " \u7b49 "

    .line 174
    .line 175
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    const-string p0, " \u9879"

    .line 182
    .line 183
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    return-object p0
.end method

.method public static ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lhk0;->α:Lym1;

    .line 2
    .line 3
    invoke-static {p0}, Lhk0;->ε(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/16 v0, 0xa

    .line 8
    .line 9
    const/16 v1, 0x21b5

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const/16 v1, 0x12

    .line 19
    .line 20
    invoke-static {v0, v1}, Lbv1;->Λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "{time}"

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-static {p0, v1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-nez p0, :cond_0

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_0
    invoke-static {p1}, Lhk0;->δ(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const/16 p1, 0xe

    .line 39
    .line 40
    invoke-static {p0, p1}, Lbv1;->Λ(Ljava/lang/String;I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string p1, " \u00b7 "

    .line 45
    .line 46
    invoke-static {v0, p1, p0}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public static ξ(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    new-instance v1, Lorg/json/JSONArray;

    .line 3
    .line 4
    invoke-direct {v1, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-static {v0, v2}, Lj81;->Σ(II)Lxm0;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    new-instance v3, Ljava/util/ArrayList;

    .line 16
    .line 17
    const/16 v4, 0xa

    .line 18
    .line 19
    invoke-static {v2, v4}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Lvm0;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    :goto_0
    move-object v4, v2

    .line 31
    check-cast v4, Lwm0;

    .line 32
    .line 33
    iget-boolean v4, v4, Lwm0;->η:Z

    .line 34
    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    move-object v4, v2

    .line 38
    check-cast v4, Lwm0;

    .line 39
    .line 40
    invoke-virtual {v4}, Lwm0;->nextInt()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    invoke-static {p0}, Lj81;->Θ(Ljava/lang/String;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    :cond_0
    sget-object p0, Ljz;->ε:Ljz;

    .line 57
    .line 58
    if-nez v3, :cond_1

    .line 59
    .line 60
    move-object v3, p0

    .line 61
    :cond_1
    invoke-virtual {v3, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_2

    .line 66
    .line 67
    const-string p0, "\u672a\u8bbe\u7f6e"

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    const/4 v1, 0x1

    .line 75
    if-eq p0, v1, :cond_4

    .line 76
    .line 77
    const/4 v2, 0x2

    .line 78
    if-eq p0, v2, :cond_3

    .line 79
    .line 80
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    new-instance v1, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string p0, " \u7b49 "

    .line 97
    .line 98
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string p0, " \u9879"

    .line 105
    .line 106
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    goto :goto_1

    .line 114
    :cond_3
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    new-instance v1, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string p0, ", "

    .line 131
    .line 132
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    goto :goto_1

    .line 143
    :cond_4
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    check-cast p0, Ljava/lang/String;

    .line 148
    .line 149
    :goto_1
    return-object p0
.end method

.method public static ο(Landroid/app/Activity;I)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, ""

    .line 8
    .line 9
    :cond_0
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const-string v2, "unknown"

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    move-object v0, v2

    .line 18
    :cond_1
    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 19
    .line 20
    const/16 v3, 0x21

    .line 21
    .line 22
    if-lt v1, v3, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {}, Lц;->β()Landroid/content/pm/PackageManager$PackageInfoFlags;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {p0, v0, v1}, Lц;->α(Landroid/content/pm/PackageManager;Ljava/lang/String;Landroid/content/pm/PackageManager$PackageInfoFlags;)Landroid/content/pm/PackageInfo;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-virtual {p0, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    :goto_0
    invoke-virtual {p0}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    new-instance v1, Liu1;

    .line 53
    .line 54
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 55
    .line 56
    if-nez p0, :cond_3

    .line 57
    .line 58
    move-object p0, v2

    .line 59
    :cond_3
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-direct {v1, v0, p0, v3}, Liu1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    new-instance v3, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v4, "\u8bfb\u53d6\u5bbf\u4e3b\u7248\u672c\u4fe1\u606f\u5931\u8d25: "

    .line 74
    .line 75
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    const-string v3, "DYHelper"

    .line 86
    .line 87
    invoke-static {v3, v1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    new-instance v1, Liu1;

    .line 91
    .line 92
    invoke-direct {v1, v0, v2, v2}, Liu1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :goto_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const-string v0, "# DyLog \u65e5\u5fd7\u5bfc\u51fa\n"

    .line 98
    .line 99
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v2, "# \u5bbf\u4e3b\u5305\u540d: "

    .line 105
    .line 106
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iget-object v2, v1, Liu1;->α:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v2, "\n"

    .line 115
    .line 116
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    new-instance v0, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string v3, "# \u5bbf\u4e3b\u7248\u672c\u53f7: "

    .line 129
    .line 130
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    iget-object v3, v1, Liu1;->β:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    new-instance v0, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    const-string v3, "# \u5bbf\u4e3b\u7248\u672c\u7801: "

    .line 151
    .line 152
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    iget-object v1, v1, Liu1;->γ:Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const-string v0, "# \u6a21\u5757\u5305\u540d: com.example.dyhelper\n# \u6a21\u5757\u7248\u672c\u53f7: 1.4.15\n# \u6a21\u5757\u7248\u672c\u7801: 60\n"

    .line 171
    .line 172
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 176
    .line 177
    const-string v1, "yyyy-MM-dd HH:mm:ss"

    .line 178
    .line 179
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-direct {v0, v1, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 184
    .line 185
    .line 186
    new-instance v1, Ljava/util/Date;

    .line 187
    .line 188
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    new-instance v1, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    const-string v3, "# \u5bfc\u51fa\u65f6\u95f4: "

    .line 198
    .line 199
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    new-instance v0, Ljava/lang/StringBuilder;

    .line 216
    .line 217
    const-string v1, "# \u65e5\u5fd7\u603b\u6570: "

    .line 218
    .line 219
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    return-object p0
.end method

.method public static π(Landroid/content/Context;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;La80;)Landroid/widget/LinearLayout;
    .locals 14

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    move/from16 v1, p4

    .line 4
    .line 5
    move-object/from16 v2, p5

    .line 6
    .line 7
    new-instance v3, Landroid/widget/LinearLayout;

    .line 8
    .line 9
    invoke-direct {v3, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 14
    .line 15
    .line 16
    const/16 v5, 0x10

    .line 17
    .line 18
    invoke-static {p0, v5}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    const/16 v7, 0xd

    .line 23
    .line 24
    invoke-static {p0, v7}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 25
    .line 26
    .line 27
    move-result v8

    .line 28
    invoke-static {p0, v5}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 29
    .line 30
    .line 31
    move-result v9

    .line 32
    invoke-static {p0, v7}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    invoke-virtual {v3, v6, v8, v9, v7}, Landroid/view/View;->setPadding(IIII)V

    .line 37
    .line 38
    .line 39
    new-instance v6, Landroid/widget/LinearLayout;

    .line 40
    .line 41
    invoke-direct {v6, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    const/4 v7, 0x0

    .line 45
    invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v6, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 49
    .line 50
    .line 51
    new-instance v5, Landroid/widget/TextView;

    .line 52
    .line 53
    invoke-direct {v5, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    .line 58
    .line 59
    const/high16 v8, 0x41600000    # 14.0f

    .line 60
    .line 61
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 62
    .line 63
    .line 64
    sget-object v8, Lbv1;->δ:Lqu1;

    .line 65
    .line 66
    const-string v9, "theme"

    .line 67
    .line 68
    const/4 v10, 0x0

    .line 69
    if-eqz v8, :cond_6

    .line 70
    .line 71
    iget-object v8, v8, Lqu1;->η:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5, v10, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 81
    .line 82
    .line 83
    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    .line 84
    .line 85
    const/4 v11, -0x2

    .line 86
    const/high16 v12, 0x3f800000    # 1.0f

    .line 87
    .line 88
    invoke-direct {v8, v7, v11, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v5, v8}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 95
    .line 96
    .line 97
    new-instance v5, Landroid/widget/TextView;

    .line 98
    .line 99
    invoke-direct {v5, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 100
    .line 101
    .line 102
    new-instance v8, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    .line 119
    .line 120
    const/high16 v8, 0x41400000    # 12.0f

    .line 121
    .line 122
    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 123
    .line 124
    .line 125
    sget-object v11, Lbv1;->δ:Lqu1;

    .line 126
    .line 127
    if-eqz v11, :cond_5

    .line 128
    .line 129
    iget-object v11, v11, Lqu1;->σ:Ljava/lang/String;

    .line 130
    .line 131
    invoke-static {v11, v5, v10, v4}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 132
    .line 133
    .line 134
    const/16 v4, 0x8

    .line 135
    .line 136
    invoke-static {p0, v4}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    const/4 v12, 0x3

    .line 141
    invoke-static {p0, v12}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 142
    .line 143
    .line 144
    move-result v13

    .line 145
    invoke-static {p0, v4}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    invoke-static {p0, v12}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 150
    .line 151
    .line 152
    move-result v12

    .line 153
    invoke-virtual {v5, v11, v13, v4, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 154
    .line 155
    .line 156
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    .line 157
    .line 158
    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 159
    .line 160
    .line 161
    sget-object v11, Lbv1;->δ:Lqu1;

    .line 162
    .line 163
    if-eqz v11, :cond_4

    .line 164
    .line 165
    iget-object v11, v11, Lqu1;->τ:Ljava/lang/String;

    .line 166
    .line 167
    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 168
    .line 169
    .line 170
    move-result v11

    .line 171
    invoke-virtual {v4, v11}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 172
    .line 173
    .line 174
    const/16 v11, 0x9

    .line 175
    .line 176
    invoke-static {p0, v11}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 177
    .line 178
    .line 179
    move-result v11

    .line 180
    int-to-float v11, v11

    .line 181
    invoke-virtual {v4, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v5, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v3, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 191
    .line 192
    .line 193
    new-instance v4, Landroid/widget/TextView;

    .line 194
    .line 195
    invoke-direct {v4, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 196
    .line 197
    .line 198
    move-object/from16 v6, p6

    .line 199
    .line 200
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 204
    .line 205
    .line 206
    sget-object v6, Lbv1;->δ:Lqu1;

    .line 207
    .line 208
    if-eqz v6, :cond_3

    .line 209
    .line 210
    iget-object v6, v6, Lqu1;->ι:Ljava/lang/String;

    .line 211
    .line 212
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 213
    .line 214
    .line 215
    move-result v6

    .line 216
    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 217
    .line 218
    .line 219
    const/4 v6, 0x5

    .line 220
    invoke-static {p0, v6}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 221
    .line 222
    .line 223
    move-result v6

    .line 224
    const/16 v8, 0xa

    .line 225
    .line 226
    invoke-static {p0, v8}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 227
    .line 228
    .line 229
    move-result v8

    .line 230
    invoke-virtual {v4, v7, v6, v7, v8}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 234
    .line 235
    .line 236
    new-instance v4, Landroid/widget/SeekBar;

    .line 237
    .line 238
    invoke-direct {v4, p0}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;)V

    .line 239
    .line 240
    .line 241
    sub-int p0, p3, v1

    .line 242
    .line 243
    invoke-virtual {v4, p0}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 244
    .line 245
    .line 246
    sub-int/2addr v0, v1

    .line 247
    invoke-static {v0, v7, p0}, Lj81;->μ(III)I

    .line 248
    .line 249
    .line 250
    move-result p0

    .line 251
    invoke-virtual {v4, p0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 252
    .line 253
    .line 254
    sget-object p0, Lbv1;->δ:Lqu1;

    .line 255
    .line 256
    if-eqz p0, :cond_2

    .line 257
    .line 258
    iget-object p0, p0, Lqu1;->σ:Ljava/lang/String;

    .line 259
    .line 260
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 261
    .line 262
    .line 263
    move-result p0

    .line 264
    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    invoke-virtual {v4, p0}, Landroid/widget/ProgressBar;->setProgressTintList(Landroid/content/res/ColorStateList;)V

    .line 269
    .line 270
    .line 271
    sget-object p0, Lbv1;->δ:Lqu1;

    .line 272
    .line 273
    if-eqz p0, :cond_1

    .line 274
    .line 275
    iget-object p0, p0, Lqu1;->δ:Ljava/lang/String;

    .line 276
    .line 277
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 278
    .line 279
    .line 280
    move-result p0

    .line 281
    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    invoke-virtual {v4, p0}, Landroid/widget/ProgressBar;->setProgressBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 286
    .line 287
    .line 288
    sget-object p0, Lbv1;->δ:Lqu1;

    .line 289
    .line 290
    if-eqz p0, :cond_0

    .line 291
    .line 292
    iget-object p0, p0, Lqu1;->σ:Ljava/lang/String;

    .line 293
    .line 294
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 295
    .line 296
    .line 297
    move-result p0

    .line 298
    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    invoke-virtual {v4, p0}, Landroid/widget/AbsSeekBar;->setThumbTintList(Landroid/content/res/ColorStateList;)V

    .line 303
    .line 304
    .line 305
    new-instance p0, Lru1;

    .line 306
    .line 307
    move-object/from16 v0, p7

    .line 308
    .line 309
    invoke-direct {p0, v1, v5, v2, v0}, Lru1;-><init>(ILandroid/widget/TextView;Ljava/lang/String;La80;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v4, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 316
    .line 317
    .line 318
    return-object v3

    .line 319
    :cond_0
    invoke-static {v9}, Lln0;->и(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    throw v10

    .line 323
    :cond_1
    invoke-static {v9}, Lln0;->и(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    throw v10

    .line 327
    :cond_2
    invoke-static {v9}, Lln0;->и(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    throw v10

    .line 331
    :cond_3
    invoke-static {v9}, Lln0;->и(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    throw v10

    .line 335
    :cond_4
    invoke-static {v9}, Lln0;->и(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    throw v10

    .line 339
    :cond_5
    invoke-static {v9}, Lln0;->и(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    throw v10

    .line 343
    :cond_6
    invoke-static {v9}, Lln0;->и(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    throw v10
.end method

.method public static final ρ(Landroid/app/Activity;Lsm1;Ljava/util/List;Landroid/widget/LinearLayout;Landroid/view/View;)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_d

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_d

    .line 18
    .line 19
    sget-object v0, Lbv1;->β:Landroid/app/AlertDialog;

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    goto/16 :goto_4

    .line 24
    .line 25
    :cond_0
    iget v0, v2, Lsm1;->ε:I

    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x4

    .line 28
    .line 29
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-le v0, v3, :cond_1

    .line 34
    .line 35
    move v0, v3

    .line 36
    :cond_1
    :goto_0
    iget v3, v2, Lsm1;->ε:I

    .line 37
    .line 38
    if-ge v3, v0, :cond_c

    .line 39
    .line 40
    add-int/lit8 v5, v3, 0x1

    .line 41
    .line 42
    iput v5, v2, Lsm1;->ε:I

    .line 43
    .line 44
    move-object/from16 v5, p2

    .line 45
    .line 46
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, Lou1;

    .line 51
    .line 52
    iget-object v6, v3, Lou1;->α:Lpu1;

    .line 53
    .line 54
    iget-object v12, v3, Lou1;->β:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v13, v3, Lou1;->γ:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v14, v3, Lou1;->δ:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v7, v3, Lou1;->ε:La80;

    .line 61
    .line 62
    invoke-interface {v7, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    check-cast v7, Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    iget-object v3, v3, Lou1;->ζ:Lp80;

    .line 73
    .line 74
    sget-object v8, Lpu1;->ε:Lpu1;

    .line 75
    .line 76
    if-eq v6, v8, :cond_b

    .line 77
    .line 78
    invoke-interface {v3, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    check-cast v3, Landroid/view/View;

    .line 83
    .line 84
    sget-object v8, Lx01;->α:Lx01;

    .line 85
    .line 86
    invoke-virtual {v8, v1}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    const v9, 0x7f0c005a

    .line 91
    .line 92
    .line 93
    const/4 v10, 0x0

    .line 94
    const/4 v11, 0x0

    .line 95
    invoke-virtual {v8, v9, v10, v11}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-object v15, v8

    .line 103
    check-cast v15, Landroid/widget/LinearLayout;

    .line 104
    .line 105
    const v8, 0x7f090286

    .line 106
    .line 107
    .line 108
    invoke-virtual {v15, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    check-cast v8, Landroid/widget/LinearLayout;

    .line 113
    .line 114
    const v9, 0x7f090288

    .line 115
    .line 116
    .line 117
    invoke-virtual {v15, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    check-cast v9, Landroid/widget/TextView;

    .line 122
    .line 123
    const v11, 0x7f090284

    .line 124
    .line 125
    .line 126
    invoke-virtual {v15, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object v11

    .line 130
    check-cast v11, Landroid/widget/TextView;

    .line 131
    .line 132
    const v10, 0x7f090283

    .line 133
    .line 134
    .line 135
    invoke-virtual {v15, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    check-cast v10, Landroid/widget/TextView;

    .line 140
    .line 141
    move/from16 v17, v0

    .line 142
    .line 143
    const v0, 0x7f090285

    .line 144
    .line 145
    .line 146
    invoke-virtual {v15, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, Landroid/widget/FrameLayout;

    .line 151
    .line 152
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 153
    .line 154
    invoke-virtual {v13, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v9, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 162
    .line 163
    .line 164
    sget-object v5, Lbv1;->δ:Lqu1;

    .line 165
    .line 166
    const-string v18, "theme"

    .line 167
    .line 168
    if-eqz v5, :cond_a

    .line 169
    .line 170
    iget-object v5, v5, Lqu1;->ι:Ljava/lang/String;

    .line 171
    .line 172
    move/from16 v19, v7

    .line 173
    .line 174
    const/4 v7, 0x1

    .line 175
    const/4 v2, 0x0

    .line 176
    invoke-static {v5, v9, v2, v7}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 177
    .line 178
    .line 179
    sget-object v2, Lbv1;->δ:Lqu1;

    .line 180
    .line 181
    if-eqz v2, :cond_9

    .line 182
    .line 183
    iget-object v2, v2, Lqu1;->ι:Ljava/lang/String;

    .line 184
    .line 185
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    invoke-virtual {v10, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 190
    .line 191
    .line 192
    const/16 v2, 0x8

    .line 193
    .line 194
    if-eqz v19, :cond_4

    .line 195
    .line 196
    const/4 v5, 0x0

    .line 197
    invoke-virtual {v11, v5}, Landroid/view/View;->setVisibility(I)V

    .line 198
    .line 199
    .line 200
    sget-object v9, Lbv1;->δ:Lqu1;

    .line 201
    .line 202
    if-eqz v9, :cond_3

    .line 203
    .line 204
    iget-object v9, v9, Lqu1;->κ:Ljava/lang/String;

    .line 205
    .line 206
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 207
    .line 208
    .line 209
    move-result v9

    .line 210
    invoke-virtual {v11, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 211
    .line 212
    .line 213
    const/4 v9, 0x0

    .line 214
    invoke-virtual {v11, v9, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 215
    .line 216
    .line 217
    new-instance v9, Landroid/graphics/drawable/GradientDrawable;

    .line 218
    .line 219
    invoke-direct {v9}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 220
    .line 221
    .line 222
    sget-object v5, Lbv1;->δ:Lqu1;

    .line 223
    .line 224
    if-eqz v5, :cond_2

    .line 225
    .line 226
    iget-object v5, v5, Lqu1;->λ:Ljava/lang/String;

    .line 227
    .line 228
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    invoke-virtual {v9, v5}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 233
    .line 234
    .line 235
    const/16 v5, 0x9

    .line 236
    .line 237
    invoke-static {v1, v5}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    int-to-float v5, v5

    .line 242
    invoke-virtual {v9, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v11, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 246
    .line 247
    .line 248
    goto :goto_1

    .line 249
    :cond_2
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    const/16 v16, 0x0

    .line 253
    .line 254
    throw v16

    .line 255
    :cond_3
    const/16 v16, 0x0

    .line 256
    .line 257
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    throw v16

    .line 261
    :cond_4
    invoke-virtual {v11, v2}, Landroid/view/View;->setVisibility(I)V

    .line 262
    .line 263
    .line 264
    :goto_1
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 268
    .line 269
    .line 270
    const-string v3, "settings_section_expanded_"

    .line 271
    .line 272
    invoke-virtual {v3, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    invoke-static {v3, v7}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 277
    .line 278
    .line 279
    move-result v3

    .line 280
    if-eqz v3, :cond_5

    .line 281
    .line 282
    const/4 v11, 0x0

    .line 283
    goto :goto_2

    .line 284
    :cond_5
    move v11, v2

    .line 285
    :goto_2
    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    .line 286
    .line 287
    .line 288
    if-eqz v3, :cond_6

    .line 289
    .line 290
    const/high16 v2, 0x42b40000    # 90.0f

    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_6
    const/4 v2, 0x0

    .line 294
    :goto_3
    invoke-virtual {v10, v2}, Landroid/view/View;->setRotation(F)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v8, v7}, Landroid/view/View;->setClickable(Z)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v8, v7}, Landroid/view/View;->setFocusable(Z)V

    .line 301
    .line 302
    .line 303
    new-instance v7, Lvj;

    .line 304
    .line 305
    move-object v9, v10

    .line 306
    move-object v10, v8

    .line 307
    const/4 v8, 0x3

    .line 308
    move-object v11, v0

    .line 309
    invoke-direct/range {v7 .. v12}, Lvj;-><init>(ILandroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v10, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 313
    .line 314
    .line 315
    const v0, 0x3f7c28f6    # 0.985f

    .line 316
    .line 317
    .line 318
    invoke-static {v10, v0}, Lbv1;->Γ(Landroid/view/View;F)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v4, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 322
    .line 323
    .line 324
    new-instance v0, Lnu1;

    .line 325
    .line 326
    const-string v2, " "

    .line 327
    .line 328
    invoke-static {v13, v2, v14}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    invoke-direct {v0, v6, v15, v2}, Lnu1;-><init>(Lpu1;Landroid/widget/LinearLayout;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    sget-object v2, Lbv1;->η:Ljava/util/ArrayList;

    .line 336
    .line 337
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    sget-object v0, Lbv1;->μ:Landroid/widget/TextView;

    .line 341
    .line 342
    if-eqz v0, :cond_7

    .line 343
    .line 344
    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 348
    .line 349
    .line 350
    :cond_7
    invoke-virtual/range {p3 .. p4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {p3 .. p4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 354
    .line 355
    .line 356
    sget-object v0, Lbv1;->ξ:Landroid/widget/LinearLayout;

    .line 357
    .line 358
    if-eqz v0, :cond_8

    .line 359
    .line 360
    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 364
    .line 365
    .line 366
    :cond_8
    move-object/from16 v2, p1

    .line 367
    .line 368
    move/from16 v0, v17

    .line 369
    .line 370
    goto/16 :goto_0

    .line 371
    .line 372
    :cond_9
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    const/16 v16, 0x0

    .line 376
    .line 377
    throw v16

    .line 378
    :cond_a
    const/16 v16, 0x0

    .line 379
    .line 380
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    throw v16

    .line 384
    :cond_b
    const-string v0, "Failed requirement."

    .line 385
    .line 386
    invoke-static {v0}, Lγ;->ν(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    return-void

    .line 390
    :cond_c
    invoke-static {}, Lbv1;->ω()V

    .line 391
    .line 392
    .line 393
    move-object/from16 v2, p1

    .line 394
    .line 395
    iget v0, v2, Lsm1;->ε:I

    .line 396
    .line 397
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 398
    .line 399
    .line 400
    move-result v3

    .line 401
    if-ge v0, v3, :cond_d

    .line 402
    .line 403
    new-instance v0, Lv8;

    .line 404
    .line 405
    const/4 v6, 0x6

    .line 406
    move-object/from16 v3, p2

    .line 407
    .line 408
    move-object/from16 v5, p4

    .line 409
    .line 410
    invoke-direct/range {v0 .. v6}, Lv8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 411
    .line 412
    .line 413
    sget-object v1, Lbv1;->γ:Landroid/os/Handler;

    .line 414
    .line 415
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 416
    .line 417
    .line 418
    :cond_d
    :goto_4
    return-void
.end method

.method public static σ(Landroid/content/Context;Lys1;Ljava/lang/String;)Landroid/widget/LinearLayout;
    .locals 2

    .line 1
    invoke-static {p0}, Lbv1;->θ(Landroid/content/Context;)Landroid/widget/LinearLayout;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {v0, p0, p1, v1}, Lbv1;->α(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/util/List;Z)V

    .line 11
    .line 12
    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {v0, p0}, Lbv1;->β(Landroid/widget/LinearLayout;Landroid/content/Context;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, p0, p2}, Lbv1;->γ(Landroid/widget/LinearLayout;Landroid/content/Context;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    :goto_0
    return-object v0
.end method

.method public static τ(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLe80;)Landroid/widget/LinearLayout;
    .locals 7

    .line 1
    new-instance v0, Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 8
    .line 9
    .line 10
    const/16 v2, 0x10

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 13
    .line 14
    .line 15
    invoke-static {p0, v2}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/16 v3, 0xd

    .line 20
    .line 21
    invoke-static {p0, v3}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/16 v5, 0xc

    .line 26
    .line 27
    invoke-static {p0, v5}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    invoke-static {p0, v3}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-virtual {v0, v2, v4, v5, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 36
    .line 37
    .line 38
    const/4 v2, 0x1

    .line 39
    invoke-virtual {v0, v2}, Landroid/view/View;->setClickable(Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 43
    .line 44
    .line 45
    new-instance v3, Landroid/widget/LinearLayout;

    .line 46
    .line 47
    invoke-direct {v3, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 51
    .line 52
    .line 53
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 54
    .line 55
    const/4 v5, -0x2

    .line 56
    const/high16 v6, 0x3f800000    # 1.0f

    .line 57
    .line 58
    invoke-direct {v4, v1, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 62
    .line 63
    .line 64
    new-instance v4, Landroid/widget/TextView;

    .line 65
    .line 66
    invoke-direct {v4, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    .line 71
    .line 72
    const/high16 p1, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 75
    .line 76
    .line 77
    sget-object p1, Lbv1;->δ:Lqu1;

    .line 78
    .line 79
    const-string v5, "theme"

    .line 80
    .line 81
    const/4 v6, 0x0

    .line 82
    if-eqz p1, :cond_3

    .line 83
    .line 84
    iget-object p1, p1, Lqu1;->η:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {p1, v4, v6, v2}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 90
    .line 91
    .line 92
    new-instance p1, Landroid/widget/TextView;

    .line 93
    .line 94
    invoke-direct {p1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 98
    .line 99
    .line 100
    const/high16 p2, 0x41400000    # 12.0f

    .line 101
    .line 102
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 103
    .line 104
    .line 105
    sget-object p2, Lbv1;->δ:Lqu1;

    .line 106
    .line 107
    if-eqz p2, :cond_2

    .line 108
    .line 109
    iget-object p2, p2, Lqu1;->ι:Ljava/lang/String;

    .line 110
    .line 111
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 116
    .line 117
    .line 118
    const/4 p2, 0x3

    .line 119
    invoke-static {p0, p2}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    invoke-virtual {p1, v1, p2, v1, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 130
    .line 131
    .line 132
    new-instance p1, Landroid/widget/Switch;

    .line 133
    .line 134
    invoke-direct {p1, p0}, Landroid/widget/Switch;-><init>(Landroid/content/Context;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, p3}, Landroid/widget/Switch;->setChecked(Z)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, v1}, Landroid/widget/Switch;->setShowText(Z)V

    .line 141
    .line 142
    .line 143
    const/16 p2, 0x30

    .line 144
    .line 145
    invoke-static {p0, p2}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setMinWidth(I)V

    .line 150
    .line 151
    .line 152
    new-instance p0, Landroid/content/res/ColorStateList;

    .line 153
    .line 154
    const p2, 0x10100a0

    .line 155
    .line 156
    .line 157
    filled-new-array {p2}, [I

    .line 158
    .line 159
    .line 160
    move-result-object p3

    .line 161
    new-array v2, v1, [I

    .line 162
    .line 163
    filled-new-array {p3, v2}, [[I

    .line 164
    .line 165
    .line 166
    move-result-object p3

    .line 167
    const/4 v2, -0x1

    .line 168
    filled-new-array {v2, v2}, [I

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-direct {p0, p3, v2}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1, p0}, Landroid/widget/Switch;->setThumbTintList(Landroid/content/res/ColorStateList;)V

    .line 176
    .line 177
    .line 178
    new-instance p0, Landroid/content/res/ColorStateList;

    .line 179
    .line 180
    filled-new-array {p2}, [I

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    new-array p3, v1, [I

    .line 185
    .line 186
    filled-new-array {p2, p3}, [[I

    .line 187
    .line 188
    .line 189
    move-result-object p2

    .line 190
    sget-object p3, Lbv1;->δ:Lqu1;

    .line 191
    .line 192
    if-eqz p3, :cond_1

    .line 193
    .line 194
    iget-object p3, p3, Lqu1;->κ:Ljava/lang/String;

    .line 195
    .line 196
    invoke-static {p3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 197
    .line 198
    .line 199
    move-result p3

    .line 200
    sget-object v1, Lbv1;->δ:Lqu1;

    .line 201
    .line 202
    if-eqz v1, :cond_0

    .line 203
    .line 204
    iget-object v1, v1, Lqu1;->ψ:Ljava/lang/String;

    .line 205
    .line 206
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    filled-new-array {p3, v1}, [I

    .line 211
    .line 212
    .line 213
    move-result-object p3

    .line 214
    invoke-direct {p0, p2, p3}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1, p0}, Landroid/widget/Switch;->setTrackTintList(Landroid/content/res/ColorStateList;)V

    .line 218
    .line 219
    .line 220
    new-instance p0, Lka0;

    .line 221
    .line 222
    const/4 p2, 0x2

    .line 223
    invoke-direct {p0, p4, p1, p2}, Lka0;-><init>(Lm80;Landroid/widget/CompoundButton;I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p1, p0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 230
    .line 231
    .line 232
    new-instance p0, Ll9;

    .line 233
    .line 234
    const/16 p2, 0xc

    .line 235
    .line 236
    invoke-direct {p0, v0, p2, p1}, Ll9;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 240
    .line 241
    .line 242
    const p0, 0x3f7c28f6    # 0.985f

    .line 243
    .line 244
    .line 245
    invoke-static {v0, p0}, Lbv1;->Γ(Landroid/view/View;F)V

    .line 246
    .line 247
    .line 248
    return-object v0

    .line 249
    :cond_0
    invoke-static {v5}, Lln0;->и(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    throw v6

    .line 253
    :cond_1
    invoke-static {v5}, Lln0;->и(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    throw v6

    .line 257
    :cond_2
    invoke-static {v5}, Lln0;->и(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    throw v6

    .line 261
    :cond_3
    invoke-static {v5}, Lln0;->и(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    throw v6
.end method

.method public static υ(Landroid/content/Context;Ljava/lang/String;Z)Z
    .locals 3

    .line 1
    const-string v0, "volume_key_enabled"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    move v0, p2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {v0, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    :goto_0
    const-string v1, "share_panel_enabled"

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    invoke-static {v1, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    :goto_1
    if-nez v0, :cond_3

    .line 30
    .line 31
    if-nez p2, :cond_3

    .line 32
    .line 33
    invoke-static {}, Lbv1;->Β()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    const-string p1, "\u8bf7\u81f3\u5c11\u4fdd\u7559\u97f3\u91cf\u952e\u3001\u5206\u4eab\u83dc\u5355\u6216\u624b\u52bf\u6a21\u5757\u83dc\u5355\u4e2d\u7684\u4e00\u4e2a\u5165\u53e3"

    .line 41
    .line 42
    const/4 p2, 0x0

    .line 43
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 48
    .line 49
    .line 50
    return p2

    .line 51
    :cond_3
    :goto_2
    return v2
.end method

.method public static φ()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lui1;->κ()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object v0, Lx9;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    sget-object v0, Lx9;->θ:Ljava/lang/String;

    .line 14
    .line 15
    :cond_0
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method

.method public static χ(Landroid/content/Context;I)I
    .locals 1

    .line 1
    int-to-float p1, p1

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-static {v0, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    float-to-int p0, p0

    .line 16
    return p0
.end method

.method public static ψ()Ljava/util/List;
    .locals 10

    .line 1
    new-instance v0, Lku1;

    .line 2
    .line 3
    const-string v1, "\u4f5c\u8005\u5934\u50cf"

    .line 4
    .line 5
    const-string v2, "\u9690\u85cf\u53f3\u4fa7\u5934\u50cf\u4e3b\u6a21\u5757\uff1b\u4f1a\u8fde\u5e26\u5f71\u54cd\u5934\u50cf\u533a\u57df\u9644\u5c5e\u80fd\u529b"

    .line 6
    .line 7
    const-string v3, "avatar"

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, Lku1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lku1;

    .line 13
    .line 14
    const-string v2, "\u5173\u6ce8\u6309\u94ae"

    .line 15
    .line 16
    const-string v3, "\u4ec5\u8fc7\u6ee4\u5934\u50cf\u533a\u57df Follow \u6269\u5c55\uff0c\u4e0d\u79fb\u9664\u6574\u4e2a\u5934\u50cf\u6a21\u5757"

    .line 17
    .line 18
    const-string v4, "follow"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, Lku1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v2, Lku1;

    .line 24
    .line 25
    const-string v3, "\u65e5\u5e38\u5706\u5708"

    .line 26
    .line 27
    const-string v4, "\u4ec5\u8fc7\u6ee4\u5934\u50cf\u533a\u57df ColorRing \u6269\u5c55"

    .line 28
    .line 29
    const-string v5, "color_ring"

    .line 30
    .line 31
    invoke-direct {v2, v5, v3, v4}, Lku1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    new-instance v3, Lku1;

    .line 35
    .line 36
    const-string v4, "\u70b9\u8d5e\u6309\u94ae"

    .line 37
    .line 38
    const-string v5, "\u8fc7\u6ee4 FeedDiggModule"

    .line 39
    .line 40
    const-string v6, "digg"

    .line 41
    .line 42
    invoke-direct {v3, v6, v4, v5}, Lku1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    new-instance v4, Lku1;

    .line 46
    .line 47
    const-string v5, "\u8bc4\u8bba\u6309\u94ae"

    .line 48
    .line 49
    const-string v6, "\u8fc7\u6ee4 FeedCommentModule"

    .line 50
    .line 51
    const-string v7, "comment"

    .line 52
    .line 53
    invoke-direct {v4, v7, v5, v6}, Lku1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    new-instance v5, Lku1;

    .line 57
    .line 58
    const-string v6, "\u6536\u85cf\u6309\u94ae"

    .line 59
    .line 60
    const-string v7, "\u8fc7\u6ee4 FeedCollectModule"

    .line 61
    .line 62
    const-string v8, "collect"

    .line 63
    .line 64
    invoke-direct {v5, v8, v6, v7}, Lku1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    new-instance v6, Lku1;

    .line 68
    .line 69
    const-string v7, "\u5206\u4eab\u6309\u94ae"

    .line 70
    .line 71
    const-string v8, "\u8fc7\u6ee4 FeedShareModule"

    .line 72
    .line 73
    const-string v9, "share"

    .line 74
    .line 75
    invoke-direct {v6, v9, v7, v8}, Lku1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    filled-new-array/range {v0 .. v6}, [Lku1;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0
.end method

.method public static ω()V
    .locals 9

    .line 1
    sget-object v0, Lbv1;->ζ:Ljava/lang/String;

    .line 2
    .line 3
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    if-lez v1, :cond_0

    .line 19
    .line 20
    move v1, v3

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v1, v2

    .line 23
    :goto_0
    sget-object v4, Lbv1;->η:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    move v5, v2

    .line 30
    :cond_1
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-eqz v6, :cond_5

    .line 35
    .line 36
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    check-cast v6, Lnu1;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    iget-object v7, v6, Lnu1;->γ:Ljava/lang/String;

    .line 45
    .line 46
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 47
    .line 48
    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {v7, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    goto :goto_3

    .line 60
    :cond_2
    sget-object v7, Lbv1;->ε:Lpu1;

    .line 61
    .line 62
    sget-object v8, Lpu1;->ε:Lpu1;

    .line 63
    .line 64
    if-ne v7, v8, :cond_3

    .line 65
    .line 66
    :goto_2
    move v7, v3

    .line 67
    goto :goto_3

    .line 68
    :cond_3
    iget-object v8, v6, Lnu1;->α:Lpu1;

    .line 69
    .line 70
    if-ne v8, v7, :cond_4

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    move v7, v2

    .line 74
    :goto_3
    iget-object v6, v6, Lnu1;->β:Landroid/widget/LinearLayout;

    .line 75
    .line 76
    invoke-static {v6, v7}, Lbv1;->ε(Landroid/view/View;Z)V

    .line 77
    .line 78
    .line 79
    if-eqz v7, :cond_1

    .line 80
    .line 81
    add-int/lit8 v5, v5, 0x1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_5
    sget-object v0, Lbv1;->ν:Landroid/widget/LinearLayout;

    .line 85
    .line 86
    if-nez v5, :cond_6

    .line 87
    .line 88
    move v2, v3

    .line 89
    :cond_6
    invoke-static {v0, v2}, Lbv1;->ε(Landroid/view/View;Z)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public static а(Landroid/content/Context;)V
    .locals 11

    .line 1
    invoke-static {}, Lpu1;->values()[Lpu1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lbv1;->θ:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-eqz v4, :cond_b

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    add-int/lit8 v5, v3, 0x1

    .line 24
    .line 25
    const/4 v6, 0x0

    .line 26
    if-ltz v3, :cond_a

    .line 27
    .line 28
    check-cast v4, Landroid/widget/TextView;

    .line 29
    .line 30
    aget-object v3, v0, v3

    .line 31
    .line 32
    sget-object v7, Lbv1;->ε:Lpu1;

    .line 33
    .line 34
    const/4 v8, 0x1

    .line 35
    if-ne v3, v7, :cond_0

    .line 36
    .line 37
    move v3, v8

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    move v3, v2

    .line 40
    :goto_1
    const-string v7, "theme"

    .line 41
    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    sget-object v9, Lbv1;->δ:Lqu1;

    .line 45
    .line 46
    if-eqz v9, :cond_1

    .line 47
    .line 48
    iget-object v9, v9, Lqu1;->η:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v9

    .line 54
    goto :goto_2

    .line 55
    :cond_1
    invoke-static {v7}, Lln0;->и(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v6

    .line 59
    :cond_2
    sget-object v9, Lbv1;->δ:Lqu1;

    .line 60
    .line 61
    if-eqz v9, :cond_9

    .line 62
    .line 63
    iget-object v9, v9, Lqu1;->θ:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v9

    .line 69
    :goto_2
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v6, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 73
    .line 74
    .line 75
    new-instance v9, Landroid/graphics/drawable/GradientDrawable;

    .line 76
    .line 77
    invoke-direct {v9}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 78
    .line 79
    .line 80
    if-eqz v3, :cond_4

    .line 81
    .line 82
    sget-object v10, Lbv1;->δ:Lqu1;

    .line 83
    .line 84
    if-eqz v10, :cond_3

    .line 85
    .line 86
    iget-object v10, v10, Lqu1;->γ:Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    goto :goto_3

    .line 93
    :cond_3
    invoke-static {v7}, Lln0;->и(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw v6

    .line 97
    :cond_4
    move v10, v2

    .line 98
    :goto_3
    invoke-virtual {v9, v10}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 99
    .line 100
    .line 101
    const/16 v10, 0xa

    .line 102
    .line 103
    invoke-static {p0, v10}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    int-to-float v10, v10

    .line 108
    invoke-virtual {v9, v10}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 109
    .line 110
    .line 111
    if-eqz v3, :cond_6

    .line 112
    .line 113
    invoke-static {p0, v8}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    sget-object v10, Lbv1;->δ:Lqu1;

    .line 118
    .line 119
    if-eqz v10, :cond_5

    .line 120
    .line 121
    iget-object v6, v10, Lqu1;->φ:Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {v6}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    invoke-virtual {v9, v8, v6}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 128
    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_5
    invoke-static {v7}, Lln0;->и(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw v6

    .line 135
    :cond_6
    :goto_4
    invoke-virtual {v4, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    const v6, 0x3f7ae148    # 0.98f

    .line 143
    .line 144
    .line 145
    const/high16 v7, 0x3f800000    # 1.0f

    .line 146
    .line 147
    if-eqz v3, :cond_7

    .line 148
    .line 149
    move v8, v7

    .line 150
    goto :goto_5

    .line 151
    :cond_7
    move v8, v6

    .line 152
    :goto_5
    invoke-virtual {v4, v8}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    if-eqz v3, :cond_8

    .line 157
    .line 158
    move v6, v7

    .line 159
    :cond_8
    invoke-virtual {v4, v6}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    const-wide/16 v6, 0xdc

    .line 164
    .line 165
    invoke-virtual {v3, v6, v7}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    new-instance v4, Landroid/view/animation/DecelerateInterpolator;

    .line 170
    .line 171
    invoke-direct {v4}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3, v4}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-virtual {v3}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 179
    .line 180
    .line 181
    move v3, v5

    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :cond_9
    invoke-static {v7}, Lln0;->и(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw v6

    .line 188
    :cond_a
    invoke-static {}, Lyh;->х()V

    .line 189
    .line 190
    .line 191
    throw v6

    .line 192
    :cond_b
    return-void
.end method


# virtual methods
.method public final Ψ(Landroid/app/Activity;)V
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget v1, v1, Landroid/content/res/Configuration;->uiMode:I

    .line 12
    .line 13
    and-int/lit8 v1, v1, 0x30

    .line 14
    .line 15
    const/16 v2, 0x20

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v1, v3

    .line 23
    :goto_0
    new-instance v2, Lqu1;

    .line 24
    .line 25
    invoke-direct {v2, v1}, Lqu1;-><init>(Z)V

    .line 26
    .line 27
    .line 28
    sput-object v2, Lbv1;->δ:Lqu1;

    .line 29
    .line 30
    sget-object v1, Lbv1;->η:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 33
    .line 34
    .line 35
    sget-object v2, Lbv1;->θ:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 38
    .line 39
    .line 40
    sget-object v5, Lbv1;->ι:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 43
    .line 44
    .line 45
    sget-object v5, Lpu1;->ε:Lpu1;

    .line 46
    .line 47
    sput-object v5, Lbv1;->ε:Lpu1;

    .line 48
    .line 49
    const-string v5, ""

    .line 50
    .line 51
    sput-object v5, Lbv1;->ζ:Ljava/lang/String;

    .line 52
    .line 53
    const/4 v5, 0x0

    .line 54
    sput-object v5, Lbv1;->λ:Landroid/widget/LinearLayout;

    .line 55
    .line 56
    sput-object v5, Lbv1;->μ:Landroid/widget/TextView;

    .line 57
    .line 58
    sput-object v5, Lbv1;->ν:Landroid/widget/LinearLayout;

    .line 59
    .line 60
    sput-object v5, Lbv1;->ξ:Landroid/widget/LinearLayout;

    .line 61
    .line 62
    sget-object v6, Lx01;->α:Lx01;

    .line 63
    .line 64
    invoke-virtual {v6, v0}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    const v7, 0x7f0c0038

    .line 69
    .line 70
    .line 71
    invoke-virtual {v6, v7, v5, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    const v7, 0x7f09028e

    .line 79
    .line 80
    .line 81
    invoke-virtual {v6, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    const v8, 0x7f09029a

    .line 86
    .line 87
    .line 88
    invoke-virtual {v6, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    const v9, 0x7f09029f

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    check-cast v9, Landroid/widget/TextView;

    .line 100
    .line 101
    const v10, 0x7f09029e

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    check-cast v10, Landroid/widget/TextView;

    .line 109
    .line 110
    const v11, 0x7f09029c

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v11

    .line 117
    check-cast v11, Landroid/widget/TextView;

    .line 118
    .line 119
    const v12, 0x7f090291

    .line 120
    .line 121
    .line 122
    invoke-virtual {v6, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object v12

    .line 126
    const v13, 0x7f090290

    .line 127
    .line 128
    .line 129
    invoke-virtual {v6, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 130
    .line 131
    .line 132
    move-result-object v13

    .line 133
    const v14, 0x7f09029d

    .line 134
    .line 135
    .line 136
    invoke-virtual {v6, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 137
    .line 138
    .line 139
    move-result-object v14

    .line 140
    check-cast v14, Landroid/widget/TextView;

    .line 141
    .line 142
    const v15, 0x7f09028d

    .line 143
    .line 144
    .line 145
    invoke-virtual {v6, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 146
    .line 147
    .line 148
    move-result-object v15

    .line 149
    check-cast v15, Landroid/widget/EditText;

    .line 150
    .line 151
    const v3, 0x7f09029b

    .line 152
    .line 153
    .line 154
    invoke-virtual {v6, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    check-cast v3, Landroid/widget/TextView;

    .line 159
    .line 160
    const v4, 0x7f090299

    .line 161
    .line 162
    .line 163
    invoke-virtual {v6, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    const v5, 0x7f090295

    .line 168
    .line 169
    .line 170
    invoke-virtual {v6, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    move-object/from16 v17, v1

    .line 175
    .line 176
    sget-object v1, Lbv1;->δ:Lqu1;

    .line 177
    .line 178
    const-string v18, "theme"

    .line 179
    .line 180
    if-eqz v1, :cond_30

    .line 181
    .line 182
    iget-object v1, v1, Lqu1;->α:Ljava/lang/String;

    .line 183
    .line 184
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    invoke-virtual {v7, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 189
    .line 190
    .line 191
    sget-object v1, Lbv1;->δ:Lqu1;

    .line 192
    .line 193
    if-eqz v1, :cond_2f

    .line 194
    .line 195
    iget-object v1, v1, Lqu1;->α:Ljava/lang/String;

    .line 196
    .line 197
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    invoke-virtual {v8, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 202
    .line 203
    .line 204
    sget-object v1, Lbv1;->δ:Lqu1;

    .line 205
    .line 206
    if-eqz v1, :cond_2e

    .line 207
    .line 208
    iget-object v1, v1, Lqu1;->α:Ljava/lang/String;

    .line 209
    .line 210
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    invoke-virtual {v12, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 215
    .line 216
    .line 217
    sget-object v1, Lbv1;->δ:Lqu1;

    .line 218
    .line 219
    if-eqz v1, :cond_2d

    .line 220
    .line 221
    iget-object v1, v1, Lqu1;->α:Ljava/lang/String;

    .line 222
    .line 223
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    invoke-virtual {v4, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 228
    .line 229
    .line 230
    sget-object v1, Lbv1;->δ:Lqu1;

    .line 231
    .line 232
    if-eqz v1, :cond_2c

    .line 233
    .line 234
    iget-object v1, v1, Lqu1;->η:Ljava/lang/String;

    .line 235
    .line 236
    const/4 v4, 0x1

    .line 237
    const/4 v7, 0x0

    .line 238
    invoke-static {v1, v9, v7, v4}, Llz1;->ω(Ljava/lang/String;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 239
    .line 240
    .line 241
    sget-object v1, Lbv1;->δ:Lqu1;

    .line 242
    .line 243
    if-eqz v1, :cond_2b

    .line 244
    .line 245
    iget-object v1, v1, Lqu1;->ι:Ljava/lang/String;

    .line 246
    .line 247
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 252
    .line 253
    .line 254
    sget-object v1, Lbv1;->δ:Lqu1;

    .line 255
    .line 256
    if-eqz v1, :cond_2a

    .line 257
    .line 258
    iget-object v1, v1, Lqu1;->θ:Ljava/lang/String;

    .line 259
    .line 260
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    invoke-virtual {v11, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 265
    .line 266
    .line 267
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    .line 268
    .line 269
    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 270
    .line 271
    .line 272
    sget-object v4, Lbv1;->δ:Lqu1;

    .line 273
    .line 274
    if-eqz v4, :cond_29

    .line 275
    .line 276
    iget-object v4, v4, Lqu1;->δ:Ljava/lang/String;

    .line 277
    .line 278
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 279
    .line 280
    .line 281
    move-result v4

    .line 282
    invoke-virtual {v1, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 283
    .line 284
    .line 285
    const/4 v4, 0x1

    .line 286
    invoke-virtual {v1, v4}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v11, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 290
    .line 291
    .line 292
    new-instance v1, Lpa;

    .line 293
    .line 294
    const/4 v4, 0x6

    .line 295
    invoke-direct {v1, v4}, Lpa;-><init>(I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v11, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 299
    .line 300
    .line 301
    const v1, 0x3f666666    # 0.9f

    .line 302
    .line 303
    .line 304
    invoke-static {v11, v1}, Lbv1;->Γ(Landroid/view/View;F)V

    .line 305
    .line 306
    .line 307
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    .line 308
    .line 309
    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 310
    .line 311
    .line 312
    sget-object v7, Lbv1;->δ:Lqu1;

    .line 313
    .line 314
    if-eqz v7, :cond_28

    .line 315
    .line 316
    iget-object v7, v7, Lqu1;->δ:Ljava/lang/String;

    .line 317
    .line 318
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 319
    .line 320
    .line 321
    move-result v7

    .line 322
    invoke-virtual {v1, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 323
    .line 324
    .line 325
    const/16 v7, 0xe

    .line 326
    .line 327
    invoke-static {v0, v7}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 328
    .line 329
    .line 330
    move-result v8

    .line 331
    int-to-float v8, v8

    .line 332
    invoke-virtual {v1, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v13, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 336
    .line 337
    .line 338
    sget-object v1, Lbv1;->δ:Lqu1;

    .line 339
    .line 340
    if-eqz v1, :cond_27

    .line 341
    .line 342
    iget-object v1, v1, Lqu1;->ι:Ljava/lang/String;

    .line 343
    .line 344
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 345
    .line 346
    .line 347
    move-result v1

    .line 348
    invoke-virtual {v14, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 349
    .line 350
    .line 351
    sget-object v1, Lbv1;->δ:Lqu1;

    .line 352
    .line 353
    if-eqz v1, :cond_26

    .line 354
    .line 355
    iget-object v1, v1, Lqu1;->ι:Ljava/lang/String;

    .line 356
    .line 357
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    invoke-virtual {v15, v1}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 362
    .line 363
    .line 364
    sget-object v1, Lbv1;->δ:Lqu1;

    .line 365
    .line 366
    if-eqz v1, :cond_25

    .line 367
    .line 368
    iget-object v1, v1, Lqu1;->η:Ljava/lang/String;

    .line 369
    .line 370
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    invoke-virtual {v15, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 375
    .line 376
    .line 377
    const/4 v1, 0x1

    .line 378
    invoke-virtual {v15, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v15, v1}, Landroid/view/View;->setClickable(Z)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v15, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v15, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v15, v1}, Landroid/widget/TextView;->setCursorVisible(Z)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v15, v1}, Landroid/widget/TextView;->setInputType(I)V

    .line 394
    .line 395
    .line 396
    const/4 v8, 0x3

    .line 397
    invoke-virtual {v15, v8}, Landroid/widget/TextView;->setImeOptions(I)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v15, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 401
    .line 402
    .line 403
    new-instance v9, Lsu;

    .line 404
    .line 405
    invoke-direct {v9, v0, v15, v8}, Lsu;-><init>(Landroid/app/Activity;Landroid/widget/EditText;I)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v15, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 409
    .line 410
    .line 411
    new-instance v8, Ltu;

    .line 412
    .line 413
    invoke-direct {v8, v0, v15}, Ltu;-><init>(Landroid/app/Activity;Landroid/widget/EditText;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v15, v8}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v13, v1}, Landroid/view/View;->setClickable(Z)V

    .line 420
    .line 421
    .line 422
    new-instance v8, Lsu;

    .line 423
    .line 424
    const/4 v9, 0x4

    .line 425
    invoke-direct {v8, v0, v15, v9}, Lsu;-><init>(Landroid/app/Activity;Landroid/widget/EditText;I)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v13, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v12, v1}, Landroid/view/View;->setClickable(Z)V

    .line 432
    .line 433
    .line 434
    new-instance v8, Lsu;

    .line 435
    .line 436
    const/4 v10, 0x5

    .line 437
    invoke-direct {v8, v0, v15, v10}, Lsu;-><init>(Landroid/app/Activity;Landroid/widget/EditText;I)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v12, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v14, v1}, Landroid/view/View;->setClickable(Z)V

    .line 444
    .line 445
    .line 446
    new-instance v1, Lsu;

    .line 447
    .line 448
    invoke-direct {v1, v0, v15, v4}, Lsu;-><init>(Landroid/app/Activity;Landroid/widget/EditText;I)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v14, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 452
    .line 453
    .line 454
    sget-object v1, Lbv1;->δ:Lqu1;

    .line 455
    .line 456
    if-eqz v1, :cond_24

    .line 457
    .line 458
    iget-object v1, v1, Lqu1;->α:Ljava/lang/String;

    .line 459
    .line 460
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 461
    .line 462
    .line 463
    move-result v1

    .line 464
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 465
    .line 466
    .line 467
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    .line 468
    .line 469
    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 470
    .line 471
    .line 472
    sget-object v8, Lbv1;->δ:Lqu1;

    .line 473
    .line 474
    if-eqz v8, :cond_23

    .line 475
    .line 476
    iget-object v8, v8, Lqu1;->ι:Ljava/lang/String;

    .line 477
    .line 478
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 479
    .line 480
    .line 481
    move-result v8

    .line 482
    invoke-virtual {v1, v8}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 483
    .line 484
    .line 485
    const/4 v8, 0x1

    .line 486
    invoke-virtual {v1, v8}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {v3, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 490
    .line 491
    .line 492
    new-instance v1, Lfu1;

    .line 493
    .line 494
    const/4 v8, 0x0

    .line 495
    invoke-direct {v1, v15, v8}, Lfu1;-><init>(Landroid/widget/EditText;I)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v3, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 499
    .line 500
    .line 501
    new-instance v1, Lmd0;

    .line 502
    .line 503
    invoke-direct {v1, v9, v3}, Lmd0;-><init>(ILjava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v15, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 507
    .line 508
    .line 509
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    .line 510
    .line 511
    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 512
    .line 513
    .line 514
    sget-object v3, Lbv1;->δ:Lqu1;

    .line 515
    .line 516
    if-eqz v3, :cond_22

    .line 517
    .line 518
    iget-object v3, v3, Lqu1;->χ:Ljava/lang/String;

    .line 519
    .line 520
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 521
    .line 522
    .line 523
    move-result v3

    .line 524
    invoke-virtual {v1, v3}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 525
    .line 526
    .line 527
    const/16 v3, 0xc

    .line 528
    .line 529
    invoke-static {v0, v3}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 530
    .line 531
    .line 532
    move-result v8

    .line 533
    int-to-float v8, v8

    .line 534
    invoke-virtual {v1, v8}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v5, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 541
    .line 542
    .line 543
    const v1, 0x7f090292

    .line 544
    .line 545
    .line 546
    invoke-virtual {v6, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 551
    .line 552
    .line 553
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    const v1, 0x7f090298

    .line 557
    .line 558
    .line 559
    invoke-virtual {v6, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 560
    .line 561
    .line 562
    move-result-object v1

    .line 563
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 567
    .line 568
    .line 569
    const v1, 0x7f090294

    .line 570
    .line 571
    .line 572
    invoke-virtual {v6, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    const v1, 0x7f090293

    .line 583
    .line 584
    .line 585
    invoke-virtual {v6, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 593
    .line 594
    .line 595
    const v1, 0x7f090297

    .line 596
    .line 597
    .line 598
    invoke-virtual {v6, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 606
    .line 607
    .line 608
    const v1, 0x7f090296

    .line 609
    .line 610
    .line 611
    invoke-virtual {v6, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 619
    .line 620
    .line 621
    invoke-static {}, Lpu1;->values()[Lpu1;

    .line 622
    .line 623
    .line 624
    move-result-object v1

    .line 625
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 626
    .line 627
    .line 628
    move-result-object v2

    .line 629
    const/4 v5, 0x0

    .line 630
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 631
    .line 632
    .line 633
    move-result v8

    .line 634
    if-eqz v8, :cond_2

    .line 635
    .line 636
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v8

    .line 640
    add-int/lit8 v9, v5, 0x1

    .line 641
    .line 642
    if-ltz v5, :cond_1

    .line 643
    .line 644
    check-cast v8, Landroid/widget/TextView;

    .line 645
    .line 646
    aget-object v5, v1, v5

    .line 647
    .line 648
    const/4 v10, 0x1

    .line 649
    invoke-virtual {v8, v10}, Landroid/view/View;->setClickable(Z)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v8, v10}, Landroid/view/View;->setFocusable(Z)V

    .line 653
    .line 654
    .line 655
    new-instance v10, Lc9;

    .line 656
    .line 657
    const/16 v11, 0xf

    .line 658
    .line 659
    invoke-direct {v10, v5, v8, v0, v11}, Lc9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 660
    .line 661
    .line 662
    invoke-virtual {v8, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 663
    .line 664
    .line 665
    const v5, 0x3f75c28f    # 0.96f

    .line 666
    .line 667
    .line 668
    invoke-static {v8, v5}, Lbv1;->Γ(Landroid/view/View;F)V

    .line 669
    .line 670
    .line 671
    move v5, v9

    .line 672
    goto :goto_1

    .line 673
    :cond_1
    invoke-static {}, Lyh;->х()V

    .line 674
    .line 675
    .line 676
    const/16 v16, 0x0

    .line 677
    .line 678
    throw v16

    .line 679
    :cond_2
    invoke-static {v0}, Lbv1;->а(Landroid/content/Context;)V

    .line 680
    .line 681
    .line 682
    const v1, 0x7f09028c

    .line 683
    .line 684
    .line 685
    invoke-virtual {v6, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 686
    .line 687
    .line 688
    move-result-object v1

    .line 689
    check-cast v1, Landroid/widget/LinearLayout;

    .line 690
    .line 691
    const v2, 0x7f09028f

    .line 692
    .line 693
    .line 694
    invoke-virtual {v6, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 695
    .line 696
    .line 697
    move-result-object v2

    .line 698
    check-cast v2, Landroid/widget/ScrollView;

    .line 699
    .line 700
    sput-object v2, Lbv1;->κ:Landroid/widget/ScrollView;

    .line 701
    .line 702
    sput-object v1, Lbv1;->λ:Landroid/widget/LinearLayout;

    .line 703
    .line 704
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 705
    .line 706
    .line 707
    invoke-static {}, Lui1;->Α()Z

    .line 708
    .line 709
    .line 710
    move-result v2

    .line 711
    invoke-static {}, Lbv1;->φ()Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object v5

    .line 715
    const/16 v16, 0x0

    .line 716
    .line 717
    invoke-static/range {v16 .. v16}, Li81;->τ(Landroid/content/Context;)Z

    .line 718
    .line 719
    .line 720
    move-result v8

    .line 721
    if-nez v2, :cond_4

    .line 722
    .line 723
    sget-object v9, Lbv1;->δ:Lqu1;

    .line 724
    .line 725
    if-eqz v9, :cond_3

    .line 726
    .line 727
    iget-object v9, v9, Lqu1;->ο:Ljava/lang/String;

    .line 728
    .line 729
    goto :goto_2

    .line 730
    :cond_3
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 731
    .line 732
    .line 733
    throw v16

    .line 734
    :cond_4
    if-eqz v8, :cond_6

    .line 735
    .line 736
    sget-object v9, Lbv1;->δ:Lqu1;

    .line 737
    .line 738
    if-eqz v9, :cond_5

    .line 739
    .line 740
    iget-object v9, v9, Lqu1;->λ:Ljava/lang/String;

    .line 741
    .line 742
    goto :goto_2

    .line 743
    :cond_5
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 744
    .line 745
    .line 746
    throw v16

    .line 747
    :cond_6
    sget-object v9, Lbv1;->δ:Lqu1;

    .line 748
    .line 749
    if-eqz v9, :cond_21

    .line 750
    .line 751
    iget-object v9, v9, Lqu1;->ν:Ljava/lang/String;

    .line 752
    .line 753
    :goto_2
    if-nez v2, :cond_8

    .line 754
    .line 755
    sget-object v10, Lbv1;->δ:Lqu1;

    .line 756
    .line 757
    if-eqz v10, :cond_7

    .line 758
    .line 759
    iget-object v10, v10, Lqu1;->ξ:Ljava/lang/String;

    .line 760
    .line 761
    goto :goto_3

    .line 762
    :cond_7
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 763
    .line 764
    .line 765
    throw v16

    .line 766
    :cond_8
    if-eqz v8, :cond_a

    .line 767
    .line 768
    sget-object v10, Lbv1;->δ:Lqu1;

    .line 769
    .line 770
    if-eqz v10, :cond_9

    .line 771
    .line 772
    iget-object v10, v10, Lqu1;->κ:Ljava/lang/String;

    .line 773
    .line 774
    goto :goto_3

    .line 775
    :cond_9
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 776
    .line 777
    .line 778
    throw v16

    .line 779
    :cond_a
    sget-object v10, Lbv1;->δ:Lqu1;

    .line 780
    .line 781
    if-eqz v10, :cond_20

    .line 782
    .line 783
    iget-object v10, v10, Lqu1;->μ:Ljava/lang/String;

    .line 784
    .line 785
    :goto_3
    if-nez v2, :cond_b

    .line 786
    .line 787
    const-string v5, "\u914d\u7f6e\u672a\u521d\u59cb\u5316\uff0c\u90e8\u5206\u9879\u76ee\u53ef\u80fd\u65e0\u6cd5\u4fdd\u5b58"

    .line 788
    .line 789
    goto :goto_4

    .line 790
    :cond_b
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 791
    .line 792
    .line 793
    move-result v11

    .line 794
    if-eqz v11, :cond_c

    .line 795
    .line 796
    const-string v5, "\u914d\u7f6e\u5df2\u5c31\u7eea\uff0c\u6682\u672a\u68c0\u6d4b\u5230\u5f53\u524d\u8d26\u53f7"

    .line 797
    .line 798
    goto :goto_4

    .line 799
    :cond_c
    const-string v11, "\u914d\u7f6e\u5df2\u5c31\u7eea \u00b7 \u5f53\u524d\u8d26\u53f7 "

    .line 800
    .line 801
    if-eqz v8, :cond_d

    .line 802
    .line 803
    const-string v12, " \u00b7 \u5185\u6d4b\u5df2\u901a\u8fc7"

    .line 804
    .line 805
    invoke-static {v11, v5, v12}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 806
    .line 807
    .line 808
    move-result-object v5

    .line 809
    goto :goto_4

    .line 810
    :cond_d
    const-string v12, " \u00b7 \u975e\u5185\u6d4b\u72b6\u6001"

    .line 811
    .line 812
    invoke-static {v11, v5, v12}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v5

    .line 816
    :goto_4
    new-instance v11, Landroid/widget/LinearLayout;

    .line 817
    .line 818
    invoke-direct {v11, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 819
    .line 820
    .line 821
    const/4 v12, 0x0

    .line 822
    invoke-virtual {v11, v12}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 823
    .line 824
    .line 825
    const/16 v12, 0x10

    .line 826
    .line 827
    invoke-virtual {v11, v12}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 828
    .line 829
    .line 830
    invoke-static {v0, v7}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 831
    .line 832
    .line 833
    move-result v13

    .line 834
    const/16 v14, 0xa

    .line 835
    .line 836
    invoke-static {v0, v14}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 837
    .line 838
    .line 839
    move-result v15

    .line 840
    invoke-static {v0, v7}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 841
    .line 842
    .line 843
    move-result v4

    .line 844
    invoke-static {v0, v14}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 845
    .line 846
    .line 847
    move-result v12

    .line 848
    invoke-virtual {v11, v13, v15, v4, v12}, Landroid/view/View;->setPadding(IIII)V

    .line 849
    .line 850
    .line 851
    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    .line 852
    .line 853
    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 854
    .line 855
    .line 856
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 857
    .line 858
    .line 859
    move-result v9

    .line 860
    invoke-virtual {v4, v9}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 861
    .line 862
    .line 863
    invoke-static {v0, v7}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 864
    .line 865
    .line 866
    move-result v9

    .line 867
    int-to-float v9, v9

    .line 868
    invoke-virtual {v4, v9}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 869
    .line 870
    .line 871
    invoke-virtual {v11, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 872
    .line 873
    .line 874
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 875
    .line 876
    const/4 v9, -0x1

    .line 877
    const/4 v12, -0x2

    .line 878
    invoke-direct {v4, v9, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 879
    .line 880
    .line 881
    invoke-static {v0, v3}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 882
    .line 883
    .line 884
    move-result v13

    .line 885
    iput v13, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 886
    .line 887
    invoke-virtual {v11, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 888
    .line 889
    .line 890
    new-instance v4, Landroid/widget/TextView;

    .line 891
    .line 892
    invoke-direct {v4, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 893
    .line 894
    .line 895
    if-nez v2, :cond_e

    .line 896
    .line 897
    const-string v2, "!"

    .line 898
    .line 899
    goto :goto_5

    .line 900
    :cond_e
    if-eqz v8, :cond_f

    .line 901
    .line 902
    const-string v2, "\u03b2"

    .line 903
    .line 904
    goto :goto_5

    .line 905
    :cond_f
    const-string v2, "i"

    .line 906
    .line 907
    :goto_5
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 908
    .line 909
    .line 910
    const/high16 v2, 0x41500000    # 13.0f

    .line 911
    .line 912
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 913
    .line 914
    .line 915
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 916
    .line 917
    .line 918
    move-result v8

    .line 919
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 920
    .line 921
    .line 922
    const/16 v8, 0x11

    .line 923
    .line 924
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 925
    .line 926
    .line 927
    const/4 v13, 0x1

    .line 928
    const/4 v15, 0x0

    .line 929
    invoke-virtual {v4, v15, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 930
    .line 931
    .line 932
    new-instance v15, Landroid/graphics/drawable/GradientDrawable;

    .line 933
    .line 934
    invoke-direct {v15}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 935
    .line 936
    .line 937
    sget-object v2, Lbv1;->δ:Lqu1;

    .line 938
    .line 939
    if-eqz v2, :cond_1f

    .line 940
    .line 941
    iget-object v2, v2, Lqu1;->β:Ljava/lang/String;

    .line 942
    .line 943
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 944
    .line 945
    .line 946
    move-result v2

    .line 947
    invoke-virtual {v15, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 948
    .line 949
    .line 950
    invoke-virtual {v15, v13}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 951
    .line 952
    .line 953
    invoke-virtual {v4, v15}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 954
    .line 955
    .line 956
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 957
    .line 958
    const/16 v13, 0x18

    .line 959
    .line 960
    invoke-static {v0, v13}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 961
    .line 962
    .line 963
    move-result v15

    .line 964
    invoke-static {v0, v13}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 965
    .line 966
    .line 967
    move-result v13

    .line 968
    invoke-direct {v2, v15, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 969
    .line 970
    .line 971
    invoke-virtual {v4, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 972
    .line 973
    .line 974
    invoke-virtual {v11, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 975
    .line 976
    .line 977
    new-instance v2, Landroid/widget/TextView;

    .line 978
    .line 979
    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 980
    .line 981
    .line 982
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 983
    .line 984
    .line 985
    const/high16 v4, 0x41400000    # 12.0f

    .line 986
    .line 987
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 988
    .line 989
    .line 990
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 991
    .line 992
    .line 993
    move-result v5

    .line 994
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 995
    .line 996
    .line 997
    invoke-static {v0, v14}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 998
    .line 999
    .line 1000
    move-result v5

    .line 1001
    const/4 v10, 0x0

    .line 1002
    invoke-virtual {v2, v5, v10, v10, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1003
    .line 1004
    .line 1005
    const/4 v13, 0x1

    .line 1006
    invoke-virtual {v2, v13}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 1007
    .line 1008
    .line 1009
    sget-object v5, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 1010
    .line 1011
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 1012
    .line 1013
    .line 1014
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 1015
    .line 1016
    const/high16 v13, 0x3f800000    # 1.0f

    .line 1017
    .line 1018
    invoke-direct {v5, v10, v12, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual {v2, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v11, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {v1, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1028
    .line 1029
    .line 1030
    const-string v2, "\u90e8\u5206\u8bbe\u7f6e\u9700\u8981\u5207\u6362\u9875\u9762\u6216\u91cd\u542f\u6296\u97f3\u540e\u751f\u6548"

    .line 1031
    .line 1032
    invoke-static {v0, v2}, Lbv1;->λ(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v2

    .line 1036
    sput-object v2, Lbv1;->μ:Landroid/widget/TextView;

    .line 1037
    .line 1038
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1039
    .line 1040
    .line 1041
    new-instance v2, Landroid/widget/LinearLayout;

    .line 1042
    .line 1043
    invoke-direct {v2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1044
    .line 1045
    .line 1046
    const/4 v10, 0x1

    .line 1047
    invoke-virtual {v2, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual {v2, v8}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1051
    .line 1052
    .line 1053
    const/16 v5, 0x8

    .line 1054
    .line 1055
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1056
    .line 1057
    .line 1058
    const/16 v10, 0x12

    .line 1059
    .line 1060
    invoke-static {v0, v10}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1061
    .line 1062
    .line 1063
    move-result v11

    .line 1064
    const/16 v14, 0x1c

    .line 1065
    .line 1066
    invoke-static {v0, v14}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1067
    .line 1068
    .line 1069
    move-result v15

    .line 1070
    invoke-static {v0, v10}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1071
    .line 1072
    .line 1073
    move-result v13

    .line 1074
    invoke-static {v0, v14}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1075
    .line 1076
    .line 1077
    move-result v14

    .line 1078
    invoke-virtual {v2, v11, v15, v13, v14}, Landroid/view/View;->setPadding(IIII)V

    .line 1079
    .line 1080
    .line 1081
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    .line 1082
    .line 1083
    invoke-direct {v11, v9, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1084
    .line 1085
    .line 1086
    const/16 v13, 0x10

    .line 1087
    .line 1088
    invoke-static {v0, v13}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1089
    .line 1090
    .line 1091
    move-result v14

    .line 1092
    iput v14, v11, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1093
    .line 1094
    invoke-virtual {v2, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1095
    .line 1096
    .line 1097
    new-instance v11, Landroid/graphics/drawable/GradientDrawable;

    .line 1098
    .line 1099
    invoke-direct {v11}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 1100
    .line 1101
    .line 1102
    sget-object v13, Lbv1;->δ:Lqu1;

    .line 1103
    .line 1104
    if-eqz v13, :cond_1e

    .line 1105
    .line 1106
    iget-object v13, v13, Lqu1;->β:Ljava/lang/String;

    .line 1107
    .line 1108
    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1109
    .line 1110
    .line 1111
    move-result v13

    .line 1112
    invoke-virtual {v11, v13}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 1113
    .line 1114
    .line 1115
    invoke-static {v0, v7}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1116
    .line 1117
    .line 1118
    move-result v7

    .line 1119
    int-to-float v7, v7

    .line 1120
    invoke-virtual {v11, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 1121
    .line 1122
    .line 1123
    const/4 v13, 0x1

    .line 1124
    invoke-static {v0, v13}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1125
    .line 1126
    .line 1127
    move-result v7

    .line 1128
    sget-object v13, Lbv1;->δ:Lqu1;

    .line 1129
    .line 1130
    if-eqz v13, :cond_1d

    .line 1131
    .line 1132
    iget-object v13, v13, Lqu1;->φ:Ljava/lang/String;

    .line 1133
    .line 1134
    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1135
    .line 1136
    .line 1137
    move-result v13

    .line 1138
    invoke-virtual {v11, v7, v13}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual {v2, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1142
    .line 1143
    .line 1144
    new-instance v7, Landroid/widget/TextView;

    .line 1145
    .line 1146
    invoke-direct {v7, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1147
    .line 1148
    .line 1149
    const-string v11, "\u672a\u627e\u5230\u5339\u914d\u9879"

    .line 1150
    .line 1151
    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1152
    .line 1153
    .line 1154
    const/high16 v11, 0x41800000    # 16.0f

    .line 1155
    .line 1156
    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1157
    .line 1158
    .line 1159
    const/4 v13, 0x1

    .line 1160
    const/4 v15, 0x0

    .line 1161
    invoke-virtual {v7, v15, v13}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 1162
    .line 1163
    .line 1164
    sget-object v11, Lbv1;->δ:Lqu1;

    .line 1165
    .line 1166
    if-eqz v11, :cond_1c

    .line 1167
    .line 1168
    iget-object v11, v11, Lqu1;->η:Ljava/lang/String;

    .line 1169
    .line 1170
    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1171
    .line 1172
    .line 1173
    move-result v11

    .line 1174
    invoke-virtual {v7, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1175
    .line 1176
    .line 1177
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual {v2, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1181
    .line 1182
    .line 1183
    const-string v7, "\u6362\u4e2a\u5173\u952e\u8bcd\uff0c\u6216\u5207\u56de\u201c\u5168\u90e8\u201d\u5206\u7c7b\u770b\u770b"

    .line 1184
    .line 1185
    invoke-static {v0, v7, v4}, Llz1;->θ(Landroid/app/Activity;Ljava/lang/String;F)Landroid/widget/TextView;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v4

    .line 1189
    sget-object v7, Lbv1;->δ:Lqu1;

    .line 1190
    .line 1191
    if-eqz v7, :cond_1b

    .line 1192
    .line 1193
    iget-object v7, v7, Lqu1;->ι:Ljava/lang/String;

    .line 1194
    .line 1195
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1196
    .line 1197
    .line 1198
    move-result v7

    .line 1199
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1200
    .line 1201
    .line 1202
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 1203
    .line 1204
    .line 1205
    const/4 v7, 0x6

    .line 1206
    invoke-static {v0, v7}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1207
    .line 1208
    .line 1209
    move-result v7

    .line 1210
    const/4 v11, 0x0

    .line 1211
    invoke-virtual {v4, v11, v7, v11, v11}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1212
    .line 1213
    .line 1214
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1215
    .line 1216
    .line 1217
    sput-object v2, Lbv1;->ν:Landroid/widget/LinearLayout;

    .line 1218
    .line 1219
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1220
    .line 1221
    .line 1222
    const-string v2, "settings_group_link_dismissed"

    .line 1223
    .line 1224
    invoke-static {v2, v11}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 1225
    .line 1226
    .line 1227
    move-result v2

    .line 1228
    const/4 v4, 0x2

    .line 1229
    const v7, 0x3f7c28f6    # 0.985f

    .line 1230
    .line 1231
    .line 1232
    if-nez v2, :cond_16

    .line 1233
    .line 1234
    const-string v2, "https://t.me/MFDYHelper"

    .line 1235
    .line 1236
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v2

    .line 1240
    new-instance v13, Landroid/widget/LinearLayout;

    .line 1241
    .line 1242
    invoke-direct {v13, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 1243
    .line 1244
    .line 1245
    invoke-virtual {v13, v11}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 1246
    .line 1247
    .line 1248
    const/16 v11, 0x10

    .line 1249
    .line 1250
    invoke-virtual {v13, v11}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 1251
    .line 1252
    .line 1253
    invoke-static {v0, v11}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1254
    .line 1255
    .line 1256
    move-result v14

    .line 1257
    invoke-static {v0, v3}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1258
    .line 1259
    .line 1260
    move-result v11

    .line 1261
    invoke-static {v0, v5}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1262
    .line 1263
    .line 1264
    move-result v15

    .line 1265
    invoke-static {v0, v3}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1266
    .line 1267
    .line 1268
    move-result v10

    .line 1269
    invoke-virtual {v13, v14, v11, v15, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 1270
    .line 1271
    .line 1272
    const/4 v10, 0x1

    .line 1273
    invoke-virtual {v13, v10}, Landroid/view/View;->setClickable(Z)V

    .line 1274
    .line 1275
    .line 1276
    invoke-virtual {v13, v10}, Landroid/view/View;->setFocusable(Z)V

    .line 1277
    .line 1278
    .line 1279
    sget-object v10, Lbv1;->δ:Lqu1;

    .line 1280
    .line 1281
    if-eqz v10, :cond_15

    .line 1282
    .line 1283
    iget-object v10, v10, Lqu1;->υ:Ljava/lang/String;

    .line 1284
    .line 1285
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1286
    .line 1287
    .line 1288
    move-result v10

    .line 1289
    invoke-static {v10}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v10

    .line 1293
    new-instance v11, Landroid/graphics/drawable/GradientDrawable;

    .line 1294
    .line 1295
    invoke-direct {v11}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 1296
    .line 1297
    .line 1298
    sget-object v14, Lbv1;->δ:Lqu1;

    .line 1299
    .line 1300
    if-eqz v14, :cond_14

    .line 1301
    .line 1302
    iget-object v14, v14, Lqu1;->β:Ljava/lang/String;

    .line 1303
    .line 1304
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1305
    .line 1306
    .line 1307
    move-result v14

    .line 1308
    invoke-virtual {v11, v14}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 1309
    .line 1310
    .line 1311
    invoke-static {v0, v5}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1312
    .line 1313
    .line 1314
    move-result v14

    .line 1315
    int-to-float v14, v14

    .line 1316
    invoke-virtual {v11, v14}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 1317
    .line 1318
    .line 1319
    const/4 v14, 0x1

    .line 1320
    invoke-static {v0, v14}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1321
    .line 1322
    .line 1323
    move-result v15

    .line 1324
    sget-object v14, Lbv1;->δ:Lqu1;

    .line 1325
    .line 1326
    if-eqz v14, :cond_13

    .line 1327
    .line 1328
    iget-object v14, v14, Lqu1;->φ:Ljava/lang/String;

    .line 1329
    .line 1330
    invoke-static {v14}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1331
    .line 1332
    .line 1333
    move-result v14

    .line 1334
    invoke-virtual {v11, v15, v14}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 1335
    .line 1336
    .line 1337
    new-instance v14, Landroid/graphics/drawable/RippleDrawable;

    .line 1338
    .line 1339
    const/4 v15, 0x0

    .line 1340
    invoke-direct {v14, v10, v11, v15}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 1341
    .line 1342
    .line 1343
    invoke-virtual {v13, v14}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1344
    .line 1345
    .line 1346
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 1347
    .line 1348
    invoke-direct {v10, v9, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1349
    .line 1350
    .line 1351
    invoke-static {v0, v3}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1352
    .line 1353
    .line 1354
    move-result v3

    .line 1355
    iput v3, v10, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1356
    .line 1357
    const/16 v11, 0x10

    .line 1358
    .line 1359
    invoke-static {v0, v11}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1360
    .line 1361
    .line 1362
    move-result v3

    .line 1363
    iput v3, v10, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1364
    .line 1365
    invoke-virtual {v13, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1366
    .line 1367
    .line 1368
    new-instance v3, Landroid/widget/TextView;

    .line 1369
    .line 1370
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1371
    .line 1372
    .line 1373
    const-string v10, "DYHelper\u7fa4\u7ec4https://t.me/MFDYHelper"

    .line 1374
    .line 1375
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1376
    .line 1377
    .line 1378
    const/high16 v10, 0x41500000    # 13.0f

    .line 1379
    .line 1380
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1381
    .line 1382
    .line 1383
    sget-object v10, Lbv1;->δ:Lqu1;

    .line 1384
    .line 1385
    if-eqz v10, :cond_12

    .line 1386
    .line 1387
    iget-object v10, v10, Lqu1;->σ:Ljava/lang/String;

    .line 1388
    .line 1389
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1390
    .line 1391
    .line 1392
    move-result v10

    .line 1393
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1394
    .line 1395
    .line 1396
    const/4 v10, 0x1

    .line 1397
    const/4 v15, 0x0

    .line 1398
    invoke-virtual {v3, v15, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 1399
    .line 1400
    .line 1401
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 1402
    .line 1403
    const/high16 v11, 0x3f800000    # 1.0f

    .line 1404
    .line 1405
    const/4 v14, 0x0

    .line 1406
    invoke-direct {v10, v14, v12, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 1407
    .line 1408
    .line 1409
    invoke-virtual {v3, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1410
    .line 1411
    .line 1412
    invoke-virtual {v13, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1413
    .line 1414
    .line 1415
    new-instance v3, Landroid/widget/TextView;

    .line 1416
    .line 1417
    invoke-direct {v3, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1418
    .line 1419
    .line 1420
    const-string v10, "\u00d7"

    .line 1421
    .line 1422
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1423
    .line 1424
    .line 1425
    const/high16 v10, 0x41b00000    # 22.0f

    .line 1426
    .line 1427
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setTextSize(F)V

    .line 1428
    .line 1429
    .line 1430
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 1431
    .line 1432
    .line 1433
    const-string v8, "\u5173\u95ed\u7fa4\u7ec4\u63d0\u793a"

    .line 1434
    .line 1435
    invoke-virtual {v3, v8}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 1436
    .line 1437
    .line 1438
    sget-object v8, Lbv1;->δ:Lqu1;

    .line 1439
    .line 1440
    if-eqz v8, :cond_11

    .line 1441
    .line 1442
    iget-object v8, v8, Lqu1;->ι:Ljava/lang/String;

    .line 1443
    .line 1444
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1445
    .line 1446
    .line 1447
    move-result v8

    .line 1448
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 1449
    .line 1450
    .line 1451
    const/4 v10, 0x1

    .line 1452
    invoke-virtual {v3, v10}, Landroid/view/View;->setClickable(Z)V

    .line 1453
    .line 1454
    .line 1455
    invoke-virtual {v3, v10}, Landroid/view/View;->setFocusable(Z)V

    .line 1456
    .line 1457
    .line 1458
    const/16 v8, 0x28

    .line 1459
    .line 1460
    invoke-static {v0, v8}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1461
    .line 1462
    .line 1463
    move-result v10

    .line 1464
    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setMinWidth(I)V

    .line 1465
    .line 1466
    .line 1467
    invoke-static {v0, v8}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1468
    .line 1469
    .line 1470
    move-result v8

    .line 1471
    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setMinHeight(I)V

    .line 1472
    .line 1473
    .line 1474
    sget-object v8, Lbv1;->δ:Lqu1;

    .line 1475
    .line 1476
    if-eqz v8, :cond_10

    .line 1477
    .line 1478
    iget-object v8, v8, Lqu1;->υ:Ljava/lang/String;

    .line 1479
    .line 1480
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 1481
    .line 1482
    .line 1483
    move-result v8

    .line 1484
    invoke-static {v8}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v8

    .line 1488
    new-instance v10, Landroid/graphics/drawable/GradientDrawable;

    .line 1489
    .line 1490
    invoke-direct {v10}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 1491
    .line 1492
    .line 1493
    const/4 v14, 0x0

    .line 1494
    invoke-virtual {v10, v14}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 1495
    .line 1496
    .line 1497
    const/4 v14, 0x1

    .line 1498
    invoke-virtual {v10, v14}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 1499
    .line 1500
    .line 1501
    new-instance v11, Landroid/graphics/drawable/RippleDrawable;

    .line 1502
    .line 1503
    const/4 v15, 0x0

    .line 1504
    invoke-direct {v11, v8, v10, v15}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 1505
    .line 1506
    .line 1507
    invoke-virtual {v3, v11}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1508
    .line 1509
    .line 1510
    new-instance v8, Lxs;

    .line 1511
    .line 1512
    invoke-direct {v8, v13, v4}, Lxs;-><init>(Landroid/widget/LinearLayout;I)V

    .line 1513
    .line 1514
    .line 1515
    invoke-virtual {v3, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1516
    .line 1517
    .line 1518
    invoke-virtual {v13, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1519
    .line 1520
    .line 1521
    new-instance v3, Ll9;

    .line 1522
    .line 1523
    const/16 v8, 0xd

    .line 1524
    .line 1525
    invoke-direct {v3, v0, v8, v2}, Ll9;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 1526
    .line 1527
    .line 1528
    invoke-virtual {v13, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1529
    .line 1530
    .line 1531
    new-instance v2, Lt61;

    .line 1532
    .line 1533
    invoke-direct {v2, v4, v0}, Lt61;-><init>(ILjava/lang/Object;)V

    .line 1534
    .line 1535
    .line 1536
    invoke-virtual {v13, v2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 1537
    .line 1538
    .line 1539
    invoke-static {v13, v7}, Lbv1;->Γ(Landroid/view/View;F)V

    .line 1540
    .line 1541
    .line 1542
    sput-object v13, Lbv1;->ξ:Landroid/widget/LinearLayout;

    .line 1543
    .line 1544
    invoke-virtual {v1, v13}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1545
    .line 1546
    .line 1547
    goto :goto_6

    .line 1548
    :cond_10
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1549
    .line 1550
    .line 1551
    const/16 v16, 0x0

    .line 1552
    .line 1553
    throw v16

    .line 1554
    :cond_11
    const/16 v16, 0x0

    .line 1555
    .line 1556
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1557
    .line 1558
    .line 1559
    throw v16

    .line 1560
    :cond_12
    const/16 v16, 0x0

    .line 1561
    .line 1562
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1563
    .line 1564
    .line 1565
    throw v16

    .line 1566
    :cond_13
    const/16 v16, 0x0

    .line 1567
    .line 1568
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1569
    .line 1570
    .line 1571
    throw v16

    .line 1572
    :cond_14
    const/16 v16, 0x0

    .line 1573
    .line 1574
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1575
    .line 1576
    .line 1577
    throw v16

    .line 1578
    :cond_15
    const/16 v16, 0x0

    .line 1579
    .line 1580
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1581
    .line 1582
    .line 1583
    throw v16

    .line 1584
    :cond_16
    :goto_6
    invoke-virtual/range {v17 .. v17}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v1

    .line 1588
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1589
    .line 1590
    .line 1591
    move-result v2

    .line 1592
    if-eqz v2, :cond_17

    .line 1593
    .line 1594
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v2

    .line 1598
    check-cast v2, Lnu1;

    .line 1599
    .line 1600
    iget-object v2, v2, Lnu1;->β:Landroid/widget/LinearLayout;

    .line 1601
    .line 1602
    const/4 v14, 0x0

    .line 1603
    invoke-virtual {v2, v14}, Landroid/view/View;->setVisibility(I)V

    .line 1604
    .line 1605
    .line 1606
    goto :goto_7

    .line 1607
    :cond_17
    sget-object v1, Lbv1;->ν:Landroid/widget/LinearLayout;

    .line 1608
    .line 1609
    if-eqz v1, :cond_18

    .line 1610
    .line 1611
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1612
    .line 1613
    .line 1614
    :cond_18
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 1615
    .line 1616
    invoke-direct {v1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1617
    .line 1618
    .line 1619
    invoke-virtual {v1, v6}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v1

    .line 1623
    const/4 v10, 0x1

    .line 1624
    invoke-virtual {v1, v10}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v1

    .line 1628
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v1

    .line 1632
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v2

    .line 1636
    if-eqz v2, :cond_19

    .line 1637
    .line 1638
    const v3, 0x106000d

    .line 1639
    .line 1640
    .line 1641
    invoke-virtual {v2, v3}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 1642
    .line 1643
    .line 1644
    const v3, 0x3f0ccccd    # 0.55f

    .line 1645
    .line 1646
    .line 1647
    invoke-virtual {v2, v3}, Landroid/view/Window;->setDimAmount(F)V

    .line 1648
    .line 1649
    .line 1650
    invoke-virtual {v2, v4}, Landroid/view/Window;->addFlags(I)V

    .line 1651
    .line 1652
    .line 1653
    :cond_19
    invoke-virtual {v6, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1654
    .line 1655
    .line 1656
    sput-object v1, Lbv1;->β:Landroid/app/AlertDialog;

    .line 1657
    .line 1658
    new-instance v2, Lz90;

    .line 1659
    .line 1660
    const/4 v10, 0x1

    .line 1661
    invoke-direct {v2, v10}, Lz90;-><init>(I)V

    .line 1662
    .line 1663
    .line 1664
    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 1665
    .line 1666
    .line 1667
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 1668
    .line 1669
    .line 1670
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1671
    .line 1672
    .line 1673
    move-result-object v1

    .line 1674
    if-eqz v1, :cond_1a

    .line 1675
    .line 1676
    const v2, 0x20008

    .line 1677
    .line 1678
    .line 1679
    invoke-virtual {v1, v2}, Landroid/view/Window;->clearFlags(I)V

    .line 1680
    .line 1681
    .line 1682
    const/16 v11, 0x10

    .line 1683
    .line 1684
    invoke-virtual {v1, v11}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 1685
    .line 1686
    .line 1687
    invoke-virtual {v1, v9, v9}, Landroid/view/Window;->setLayout(II)V

    .line 1688
    .line 1689
    .line 1690
    :cond_1a
    const/4 v1, 0x0

    .line 1691
    invoke-virtual {v6, v1}, Landroid/view/View;->setAlpha(F)V

    .line 1692
    .line 1693
    .line 1694
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v2

    .line 1698
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1699
    .line 1700
    .line 1701
    const/16 v3, 0x12

    .line 1702
    .line 1703
    invoke-static {v2, v3}, Lbv1;->χ(Landroid/content/Context;I)I

    .line 1704
    .line 1705
    .line 1706
    move-result v2

    .line 1707
    int-to-float v2, v2

    .line 1708
    invoke-virtual {v6, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 1709
    .line 1710
    .line 1711
    invoke-virtual {v6, v7}, Landroid/view/View;->setScaleX(F)V

    .line 1712
    .line 1713
    .line 1714
    invoke-virtual {v6, v7}, Landroid/view/View;->setScaleY(F)V

    .line 1715
    .line 1716
    .line 1717
    invoke-virtual {v6}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v2

    .line 1721
    const/high16 v11, 0x3f800000    # 1.0f

    .line 1722
    .line 1723
    invoke-virtual {v2, v11}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 1724
    .line 1725
    .line 1726
    move-result-object v2

    .line 1727
    invoke-virtual {v2, v1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 1728
    .line 1729
    .line 1730
    move-result-object v1

    .line 1731
    invoke-virtual {v1, v11}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 1732
    .line 1733
    .line 1734
    move-result-object v1

    .line 1735
    invoke-virtual {v1, v11}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 1736
    .line 1737
    .line 1738
    move-result-object v1

    .line 1739
    const-wide/16 v2, 0x118

    .line 1740
    .line 1741
    invoke-virtual {v1, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 1742
    .line 1743
    .line 1744
    move-result-object v1

    .line 1745
    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    .line 1746
    .line 1747
    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 1748
    .line 1749
    .line 1750
    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v1

    .line 1754
    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 1755
    .line 1756
    .line 1757
    new-instance v1, Lhg1;

    .line 1758
    .line 1759
    const/16 v2, 0x9

    .line 1760
    .line 1761
    invoke-direct {v1, v0, v2}, Lhg1;-><init>(Landroid/app/Activity;I)V

    .line 1762
    .line 1763
    .line 1764
    invoke-virtual {v6, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1765
    .line 1766
    .line 1767
    return-void

    .line 1768
    :cond_1b
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1769
    .line 1770
    .line 1771
    const/16 v16, 0x0

    .line 1772
    .line 1773
    throw v16

    .line 1774
    :cond_1c
    const/16 v16, 0x0

    .line 1775
    .line 1776
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1777
    .line 1778
    .line 1779
    throw v16

    .line 1780
    :cond_1d
    const/16 v16, 0x0

    .line 1781
    .line 1782
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1783
    .line 1784
    .line 1785
    throw v16

    .line 1786
    :cond_1e
    const/16 v16, 0x0

    .line 1787
    .line 1788
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1789
    .line 1790
    .line 1791
    throw v16

    .line 1792
    :cond_1f
    const/16 v16, 0x0

    .line 1793
    .line 1794
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1795
    .line 1796
    .line 1797
    throw v16

    .line 1798
    :cond_20
    const/16 v16, 0x0

    .line 1799
    .line 1800
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1801
    .line 1802
    .line 1803
    throw v16

    .line 1804
    :cond_21
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1805
    .line 1806
    .line 1807
    throw v16

    .line 1808
    :cond_22
    const/16 v16, 0x0

    .line 1809
    .line 1810
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1811
    .line 1812
    .line 1813
    throw v16

    .line 1814
    :cond_23
    const/16 v16, 0x0

    .line 1815
    .line 1816
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1817
    .line 1818
    .line 1819
    throw v16

    .line 1820
    :cond_24
    const/16 v16, 0x0

    .line 1821
    .line 1822
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1823
    .line 1824
    .line 1825
    throw v16

    .line 1826
    :cond_25
    const/16 v16, 0x0

    .line 1827
    .line 1828
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1829
    .line 1830
    .line 1831
    throw v16

    .line 1832
    :cond_26
    const/16 v16, 0x0

    .line 1833
    .line 1834
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1835
    .line 1836
    .line 1837
    throw v16

    .line 1838
    :cond_27
    const/16 v16, 0x0

    .line 1839
    .line 1840
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1841
    .line 1842
    .line 1843
    throw v16

    .line 1844
    :cond_28
    const/16 v16, 0x0

    .line 1845
    .line 1846
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1847
    .line 1848
    .line 1849
    throw v16

    .line 1850
    :cond_29
    const/16 v16, 0x0

    .line 1851
    .line 1852
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1853
    .line 1854
    .line 1855
    throw v16

    .line 1856
    :cond_2a
    const/16 v16, 0x0

    .line 1857
    .line 1858
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1859
    .line 1860
    .line 1861
    throw v16

    .line 1862
    :cond_2b
    const/16 v16, 0x0

    .line 1863
    .line 1864
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1865
    .line 1866
    .line 1867
    throw v16

    .line 1868
    :cond_2c
    const/16 v16, 0x0

    .line 1869
    .line 1870
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1871
    .line 1872
    .line 1873
    throw v16

    .line 1874
    :cond_2d
    const/16 v16, 0x0

    .line 1875
    .line 1876
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1877
    .line 1878
    .line 1879
    throw v16

    .line 1880
    :cond_2e
    const/16 v16, 0x0

    .line 1881
    .line 1882
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1883
    .line 1884
    .line 1885
    throw v16

    .line 1886
    :cond_2f
    const/16 v16, 0x0

    .line 1887
    .line 1888
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1889
    .line 1890
    .line 1891
    throw v16

    .line 1892
    :cond_30
    const/16 v16, 0x0

    .line 1893
    .line 1894
    invoke-static/range {v18 .. v18}, Lln0;->и(Ljava/lang/String;)V

    .line 1895
    .line 1896
    .line 1897
    throw v16
.end method
