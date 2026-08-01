.class public final Ltop/anjao2024/xp1whs/MainActivity;
.super Lgh;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ltop/anjao2024/xp1whs/App$b;


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final mServiceState:Loh0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Loh0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lgh;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Ltop/anjao2024/xp1whs/MainActivity;->mServiceState:Loh0;

    .line 10
    .line 11
    return-void
.end method

.method private final ensureAliasEnabledOnce()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getPreferences(I)Landroid/content/SharedPreferences;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const-string v2, "alias_reset_done"

    .line 7
    .line 8
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance v3, Landroid/content/ComponentName;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    new-instance v5, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v4, ".LauncherActivityAlias"

    .line 30
    .line 31
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-direct {v3, p0, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const/4 v4, 0x1

    .line 46
    invoke-virtual {p0, v3, v0, v4}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-interface {p0, v2, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public static synthetic f(Ltop/anjao2024/xp1whs/MainActivity;Loh0;Z)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ltop/anjao2024/xp1whs/MainActivity;->onCreate$lambda$4$lambda$3$lambda$2$lambda$1(Ltop/anjao2024/xp1whs/MainActivity;Loh0;Z)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic g(Ltop/anjao2024/xp1whs/MainActivity;Loh0;Lji;I)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Ltop/anjao2024/xp1whs/MainActivity;->onCreate$lambda$4$lambda$3(Ltop/anjao2024/xp1whs/MainActivity;Loh0;Lji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic h(Ltop/anjao2024/xp1whs/MainActivity;Lgp0;Lji;I)Lna1;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Ltop/anjao2024/xp1whs/MainActivity;->onCreate$lambda$4(Ltop/anjao2024/xp1whs/MainActivity;Loh0;Lji;I)Lna1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final isLauncherIconVisible()Z
    .locals 3

    .line 1
    new-instance v0, Landroid/content/ComponentName;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ".LauncherActivityAlias"

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v0, p0, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0, v0}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    const/4 v0, 0x2

    .line 36
    if-eq p0, v0, :cond_0

    .line 37
    .line 38
    const/4 p0, 0x1

    .line 39
    return p0

    .line 40
    :cond_0
    const/4 p0, 0x0

    .line 41
    return p0
.end method

.method private static final onCreate$lambda$4(Ltop/anjao2024/xp1whs/MainActivity;Loh0;Lji;I)Lna1;
    .locals 4

    .line 1
    and-int/lit8 v0, p3, 0x3

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    move v0, v3

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v2

    .line 11
    :goto_0
    and-int/2addr p3, v3

    .line 12
    check-cast p2, Lpi;

    .line 13
    .line 14
    invoke-virtual {p2, p3, v0}, Lpi;->O(IZ)Z

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    if-eqz p3, :cond_1

    .line 19
    .line 20
    new-instance p3, Led;

    .line 21
    .line 22
    const/4 v0, 0x7

    .line 23
    invoke-direct {p3, v0, p0, p1}, Led;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const p0, -0x50fd6785

    .line 27
    .line 28
    .line 29
    invoke-static {p0, p3, p2}, Lkl;->w(ILex;Lji;)Lmh;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const/16 p1, 0x30

    .line 34
    .line 35
    invoke-static {v2, p0, p2, p1, v3}, Lx71;->c(ZLww;Lji;II)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {p2}, Lpi;->R()V

    .line 40
    .line 41
    .line 42
    :goto_1
    sget-object p0, Lna1;->a:Lna1;

    .line 43
    .line 44
    return-object p0
.end method

.method private static final onCreate$lambda$4$lambda$3(Ltop/anjao2024/xp1whs/MainActivity;Loh0;Lji;I)Lna1;
    .locals 12

    .line 1
    and-int/lit8 v0, p3, 0x3

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    move v0, v3

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v2

    .line 11
    :goto_0
    and-int/2addr p3, v3

    .line 12
    move-object v9, p2

    .line 13
    check-cast v9, Lpi;

    .line 14
    .line 15
    invoke-virtual {v9, p3, v0}, Lpi;->O(IZ)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_3

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    const-string p3, "open_tab"

    .line 26
    .line 27
    invoke-virtual {p2, p3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    const-string p3, "thanks"

    .line 32
    .line 33
    invoke-static {p2, p3}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    const-string p3, "open_donate"

    .line 42
    .line 43
    invoke-virtual {p2, p3, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    iget-object p2, p0, Ltop/anjao2024/xp1whs/MainActivity;->mServiceState:Loh0;

    .line 48
    .line 49
    invoke-static {p2}, Ltop/anjao2024/xp1whs/MainActivity;->onCreate$lambda$4$lambda$3$lambda$0(Loh0;)Llf1;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-interface {p1}, Lw31;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    check-cast p2, Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    invoke-virtual {v9, p0}, Lpi;->h(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    invoke-virtual {v9, p1}, Lpi;->f(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p3

    .line 71
    or-int/2addr p2, p3

    .line 72
    invoke-virtual {v9}, Lpi;->L()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    if-nez p2, :cond_1

    .line 77
    .line 78
    sget-object p2, Lii;->a:Lr3;

    .line 79
    .line 80
    if-ne p3, p2, :cond_2

    .line 81
    .line 82
    :cond_1
    new-instance p3, Lc;

    .line 83
    .line 84
    const/16 p2, 0xb

    .line 85
    .line 86
    invoke-direct {p3, p2, p0, p1}, Lc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v9, p3}, Lpi;->g0(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :cond_2
    move-object v5, p3

    .line 93
    check-cast v5, Lsw;

    .line 94
    .line 95
    const/4 v10, 0x0

    .line 96
    const/16 v11, 0x8

    .line 97
    .line 98
    const/4 v6, 0x0

    .line 99
    invoke-static/range {v3 .. v11}, Lzc0;->B0(Llf1;ZLsw;Lpe0;IZLji;II)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    invoke-virtual {v9}, Lpi;->R()V

    .line 104
    .line 105
    .line 106
    :goto_1
    sget-object p0, Lna1;->a:Lna1;

    .line 107
    .line 108
    return-object p0
.end method

.method private static final onCreate$lambda$4$lambda$3$lambda$0(Loh0;)Llf1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loh0;",
            ")",
            "Llf1;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lw31;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Llf1;

    .line 6
    .line 7
    return-object p0
.end method

.method private static final onCreate$lambda$4$lambda$3$lambda$2$lambda$1(Ltop/anjao2024/xp1whs/MainActivity;Loh0;Z)Lna1;
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Ltop/anjao2024/xp1whs/MainActivity;->setLauncherIconVisible(Z)V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-interface {p1, p0}, Loh0;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lna1;->a:Lna1;

    .line 12
    .line 13
    return-object p0
.end method

.method private final setLauncherIconVisible(Z)V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/ComponentName;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ".LauncherActivityAlias"

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v0, p0, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    move p1, v1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p1, 0x2

    .line 33
    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0, v0, p1, v1}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 38
    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 9

    .line 1
    invoke-super {p0, p1}, Lgh;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lsx0;

    .line 5
    .line 6
    const/16 v0, 0x12

    .line 7
    .line 8
    invoke-direct {p1, v0}, Lsx0;-><init>(I)V

    .line 9
    .line 10
    .line 11
    new-instance v3, Ly51;

    .line 12
    .line 13
    const/4 v8, 0x0

    .line 14
    invoke-direct {v3, v8, v8, p1}, Ly51;-><init>(IILsw;)V

    .line 15
    .line 16
    .line 17
    sget p1, Lgr;->a:I

    .line 18
    .line 19
    sget v1, Lgr;->b:I

    .line 20
    .line 21
    new-instance v2, Lsx0;

    .line 22
    .line 23
    invoke-direct {v2, v0}, Lsx0;-><init>(I)V

    .line 24
    .line 25
    .line 26
    new-instance v4, Ly51;

    .line 27
    .line 28
    invoke-direct {v4, p1, v1, v2}, Ly51;-><init>(IILsw;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    sget-object p1, Lgr;->c:Lkr;

    .line 43
    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 47
    .line 48
    const/16 v0, 0x23

    .line 49
    .line 50
    if-lt p1, v0, :cond_0

    .line 51
    .line 52
    new-instance p1, Llr;

    .line 53
    .line 54
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    new-instance p1, Lkr;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    :goto_0
    sput-object p1, Lgr;->c:Lkr;

    .line 64
    .line 65
    :cond_1
    move-object v2, p1

    .line 66
    new-instance v1, Lca;

    .line 67
    .line 68
    const/4 v7, 0x1

    .line 69
    move-object v5, p0

    .line 70
    invoke-direct/range {v1 .. v7}, Lca;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 71
    .line 72
    .line 73
    check-cast v6, Landroid/view/ViewGroup;

    .line 74
    .line 75
    move p0, v8

    .line 76
    :goto_1
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    const/16 v0, 0x8

    .line 81
    .line 82
    const/4 v3, 0x1

    .line 83
    if-ge p0, p1, :cond_4

    .line 84
    .line 85
    add-int/lit8 p1, p0, 0x1

    .line 86
    .line 87
    invoke-virtual {v6, p0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    if-eqz p0, :cond_3

    .line 92
    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    instance-of p0, p0, Lhr;

    .line 98
    .line 99
    if-eqz p0, :cond_2

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_2
    move p0, p1

    .line 103
    goto :goto_1

    .line 104
    :cond_3
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 105
    .line 106
    invoke-direct {p0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 107
    .line 108
    .line 109
    throw p0

    .line 110
    :cond_4
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    new-instance p1, Lfr;

    .line 115
    .line 116
    invoke-direct {p1, v1, p0}, Lfr;-><init>(Lca;Landroid/content/Context;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v3}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v6, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 129
    .line 130
    .line 131
    :goto_2
    invoke-virtual {v1}, Lca;->run()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, p0}, Lkr;->b(Landroid/view/Window;)V

    .line 142
    .line 143
    .line 144
    invoke-direct {v5}, Ltop/anjao2024/xp1whs/MainActivity;->ensureAliasEnabledOnce()V

    .line 145
    .line 146
    .line 147
    invoke-direct {v5}, Ltop/anjao2024/xp1whs/MainActivity;->isLauncherIconVisible()Z

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-static {p0}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    new-instance p1, Led;

    .line 160
    .line 161
    invoke-direct {p1, v0, v5, p0}, Led;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    new-instance p0, Lmh;

    .line 165
    .line 166
    const v0, -0x5e7abfe3

    .line 167
    .line 168
    .line 169
    invoke-direct {p0, v0, v3, p1}, Lmh;-><init>(IZLex;)V

    .line 170
    .line 171
    .line 172
    sget-object p1, Lhh;->a:Landroid/view/ViewGroup$LayoutParams;

    .line 173
    .line 174
    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    const v0, 0x1020002

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    check-cast p1, Landroid/view/ViewGroup;

    .line 190
    .line 191
    invoke-virtual {p1, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    instance-of v0, p1, Lgi;

    .line 196
    .line 197
    const/4 v1, 0x0

    .line 198
    if-eqz v0, :cond_5

    .line 199
    .line 200
    check-cast p1, Lgi;

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_5
    move-object p1, v1

    .line 204
    :goto_3
    if-eqz p1, :cond_6

    .line 205
    .line 206
    invoke-virtual {p1, v1}, Lr;->setParentCompositionContext(Lsi;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p1, p0}, Lgi;->setContent(Lww;)V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :cond_6
    new-instance p1, Lgi;

    .line 214
    .line 215
    invoke-direct {p1, v5}, Lgi;-><init>(Ltop/anjao2024/xp1whs/MainActivity;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1, v1}, Lr;->setParentCompositionContext(Lsi;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1, p0}, Lgi;->setContent(Lww;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    invoke-static {p0}, Lj50;->m(Landroid/view/View;)Lx90;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    if-nez v0, :cond_7

    .line 237
    .line 238
    const v0, 0x7f060074

    .line 239
    .line 240
    .line 241
    invoke-virtual {p0, v0, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    :cond_7
    invoke-static {p0}, Lv50;->i(Landroid/view/View;)Lwc1;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    if-nez v0, :cond_8

    .line 249
    .line 250
    const v0, 0x7f060078

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0, v0, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    :cond_8
    invoke-static {p0}, Lu50;->j(Landroid/view/View;)Lnx0;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    if-nez v0, :cond_9

    .line 261
    .line 262
    const v0, 0x7f060077

    .line 263
    .line 264
    .line 265
    invoke-virtual {p0, v0, v5}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    :cond_9
    sget-object p0, Lhh;->a:Landroid/view/ViewGroup$LayoutParams;

    .line 269
    .line 270
    invoke-virtual {v5, p1, p0}, Lgh;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 271
    .line 272
    .line 273
    return-void
.end method

.method public onServiceStateChanged(Llf1;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/anjao2024/xp1whs/MainActivity;->mServiceState:Loh0;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Loh0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onStart()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ltop/anjao2024/xp1whs/App;->d:Ltop/anjao2024/xp1whs/App$a;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, p0, v1}, Ltop/anjao2024/xp1whs/App$a;->b(Ltop/anjao2024/xp1whs/App$b;Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onStop()V
    .locals 1

    .line 1
    sget-object v0, Ltop/anjao2024/xp1whs/App;->d:Ltop/anjao2024/xp1whs/App$a;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ltop/anjao2024/xp1whs/App$a;->e(Ltop/anjao2024/xp1whs/App$b;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
