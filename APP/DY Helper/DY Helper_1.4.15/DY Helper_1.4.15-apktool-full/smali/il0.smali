.class public abstract Lil0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final β:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lil0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lil0;->β:Ljava/util/Set;

    .line 19
    .line 20
    return-void
.end method

.method public static α(Landroid/app/Activity;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Lui1;->Α()Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const-string v1, "immersive_status_bar_enabled"

    .line 9
    .line 10
    invoke-static {v1, v0}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    :cond_0
    move v1, v0

    .line 16
    :goto_0
    :try_start_1
    invoke-static {}, Lui1;->Α()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    const-string v2, "immersive_navigation_bar_enabled"

    .line 23
    .line 24
    invoke-static {v2, v0}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 28
    :catchall_1
    :cond_1
    if-nez v1, :cond_6

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-nez p0, :cond_3

    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_3
    const/4 v0, 0x1

    .line 41
    :try_start_2
    invoke-virtual {p0, v0}, Landroid/view/Window;->setDecorFitsSystemWindows(Z)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/Window;->getInsetsController()Landroid/view/WindowInsetsController;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-nez v0, :cond_4

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Landroid/view/View;->getWindowInsetsController()Landroid/view/WindowInsetsController;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :cond_4
    if-eqz v0, :cond_5

    .line 59
    .line 60
    invoke-static {}, Landroid/view/WindowInsets$Type;->statusBars()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-static {}, Landroid/view/WindowInsets$Type;->navigationBars()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    or-int/2addr v1, v2

    .line 69
    invoke-interface {v0, v1}, Landroid/view/WindowInsetsController;->show(I)V

    .line 70
    .line 71
    .line 72
    :cond_5
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    new-instance v1, Lν;

    .line 77
    .line 78
    const/16 v2, 0x14

    .line 79
    .line 80
    invoke-direct {v1, v2, p0}, Lν;-><init>(ILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :catchall_2
    move-exception p0

    .line 88
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    const-string v0, "r1b353e12c09e991a"

    .line 93
    .line 94
    :goto_1
    invoke-static {v0, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_6
    :goto_2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    if-nez p0, :cond_7

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_7
    :try_start_3
    invoke-static {p0, v1, v0}, Lil0;->β(Landroid/view/Window;ZZ)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    new-instance v3, Lhl0;

    .line 113
    .line 114
    invoke-direct {v3, p0, v1, v0}, Lhl0;-><init>(Landroid/view/Window;ZZ)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :catchall_3
    move-exception p0

    .line 122
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    const-string v0, "r772aa46bd612940c"

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :goto_3
    return-void
.end method

.method public static β(Landroid/view/Window;ZZ)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/Window;->setDecorFitsSystemWindows(Z)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/Window;->getInsetsController()Landroid/view/WindowInsetsController;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Landroid/view/View;->getWindowInsetsController()Landroid/view/WindowInsetsController;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :cond_0
    if-nez v1, :cond_5

    .line 20
    .line 21
    const/16 v0, 0x400

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Landroid/view/Window;->addFlags(I)V

    .line 26
    .line 27
    .line 28
    const/16 v0, 0x800

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Landroid/view/Window;->clearFlags(I)V

    .line 31
    .line 32
    .line 33
    const/16 v0, 0x504

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0, v0}, Landroid/view/Window;->clearFlags(I)V

    .line 37
    .line 38
    .line 39
    const/16 v0, 0x100

    .line 40
    .line 41
    :goto_0
    if-eqz p2, :cond_2

    .line 42
    .line 43
    or-int/lit16 v0, v0, 0x202

    .line 44
    .line 45
    :cond_2
    if-nez p1, :cond_3

    .line 46
    .line 47
    if-eqz p2, :cond_4

    .line 48
    .line 49
    :cond_3
    or-int/lit16 v0, v0, 0x1000

    .line 50
    .line 51
    :cond_4
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_5
    if-eqz p1, :cond_6

    .line 60
    .line 61
    invoke-static {}, Landroid/view/WindowInsets$Type;->statusBars()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    :cond_6
    if-eqz p2, :cond_7

    .line 66
    .line 67
    invoke-static {}, Landroid/view/WindowInsets$Type;->navigationBars()I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    or-int/2addr v0, p0

    .line 72
    :cond_7
    if-eqz v0, :cond_8

    .line 73
    .line 74
    invoke-interface {v1, v0}, Landroid/view/WindowInsetsController;->hide(I)V

    .line 75
    .line 76
    .line 77
    :cond_8
    const/4 p0, 0x2

    .line 78
    invoke-interface {v1, p0}, Landroid/view/WindowInsetsController;->setSystemBarsBehavior(I)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public static γ()V
    .locals 3

    .line 1
    new-instance v0, Loj0;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, Loj0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const-class v1, Landroid/os/Bundle;

    .line 8
    .line 9
    filled-new-array {v1, v0}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-class v1, Landroid/app/Activity;

    .line 14
    .line 15
    const-string v2, "onCreate"

    .line 16
    .line 17
    invoke-static {v1, v2, v0}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 18
    .line 19
    .line 20
    new-instance v0, Loj0;

    .line 21
    .line 22
    const/16 v2, 0x8

    .line 23
    .line 24
    invoke-direct {v0, v2}, Loj0;-><init>(I)V

    .line 25
    .line 26
    .line 27
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v2, "onResume"

    .line 32
    .line 33
    invoke-static {v1, v2, v0}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 34
    .line 35
    .line 36
    new-instance v0, Loj0;

    .line 37
    .line 38
    const/16 v2, 0x9

    .line 39
    .line 40
    invoke-direct {v0, v2}, Loj0;-><init>(I)V

    .line 41
    .line 42
    .line 43
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v2, "onWindowFocusChanged"

    .line 50
    .line 51
    invoke-static {v1, v2, v0}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 52
    .line 53
    .line 54
    new-instance v0, Loj0;

    .line 55
    .line 56
    const/16 v2, 0xa

    .line 57
    .line 58
    invoke-direct {v0, v2}, Loj0;-><init>(I)V

    .line 59
    .line 60
    .line 61
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const-string v2, "onDestroy"

    .line 66
    .line 67
    invoke-static {v1, v2, v0}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 68
    .line 69
    .line 70
    return-void
.end method
