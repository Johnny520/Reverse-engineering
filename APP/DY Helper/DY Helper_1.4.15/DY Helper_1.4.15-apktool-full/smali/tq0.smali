.class public final Ltq0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;


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
    sput-object v0, Ltq0;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    return-void
.end method

.method public static final α(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {p0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 23
    .line 24
    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 25
    .line 26
    instance-of v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 27
    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    move-object v3, v2

    .line 31
    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 32
    .line 33
    invoke-virtual {v3, v1, v1, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {p0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    new-instance v1, Ljb;

    .line 40
    .line 41
    const/16 v2, 0x1b

    .line 42
    .line 43
    invoke-direct {v1, p0, v2}, Ljb;-><init>(Landroid/view/View;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const-string v1, " reason="

    .line 58
    .line 59
    const-string v2, " view="

    .line 60
    .line 61
    const-string v3, "\u5df2\u9690\u85cf\u53f3\u4fa7\u63a7\u4ef6 control="

    .line 62
    .line 63
    invoke-static {v3, p1, v1, p2, v2}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    const-string p1, "FeedRightControlsHideLegacy"

    .line 75
    .line 76
    const/4 p2, 0x0

    .line 77
    invoke-static {p1, p0, p2, v0, p2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public static β(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 3

    .line 1
    :goto_0
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    const-class v1, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 13
    .line 14
    .line 15
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    goto :goto_1

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    new-instance v2, Leo1;

    .line 19
    .line 20
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    move-object v1, v2

    .line 24
    :goto_1
    instance-of v2, v1, Leo1;

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    move-object v0, v1

    .line 30
    :goto_2
    check-cast v0, Ljava/lang/reflect/Field;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    return-object v0
.end method

.method public static γ(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    goto :goto_0

    .line 6
    :catchall_0
    move-exception p0

    .line 7
    new-instance v0, Leo1;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    move-object p0, v0

    .line 13
    :goto_0
    instance-of v0, p0, Leo1;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    move-object p0, v1

    .line 19
    :cond_0
    check-cast p0, Ljava/lang/Class;

    .line 20
    .line 21
    const/4 v0, 0x4

    .line 22
    const-string v2, " class="

    .line 23
    .line 24
    const-string v3, "FeedRightControlsHideLegacy"

    .line 25
    .line 26
    if-nez p0, :cond_1

    .line 27
    .line 28
    const-string p0, "\u672a\u627e\u5230\u53f3\u4fa7\u63a7\u4ef6\u6a21\u5757\u7c7b control="

    .line 29
    .line 30
    invoke-static {p0, p2, v2, p1}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {v3, p0, v1, v0, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    sget-object v4, Lxq0;->α:Lxq0;

    .line 39
    .line 40
    new-instance v5, Lsq0;

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    invoke-direct {v5, v6, p0, p2}, Lsq0;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v6, "onCreateView"

    .line 47
    .line 48
    invoke-virtual {v4, p0, v6, v5}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 49
    .line 50
    .line 51
    new-instance v5, Lsq0;

    .line 52
    .line 53
    const/4 v6, 0x1

    .line 54
    invoke-direct {v5, v6, p0, p2}, Lsq0;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v6, "onViewCreated"

    .line 58
    .line 59
    invoke-virtual {v4, p0, v6, v5}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 60
    .line 61
    .line 62
    const-string p0, "\u5df2\u5b89\u88c5\u53f3\u4fa7\u63a7\u4ef6\u6a21\u5757\u65e7\u7248 Hook control="

    .line 63
    .line 64
    invoke-static {p0, p2, v2, p1}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-static {v3, p0, v1, v0, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method
