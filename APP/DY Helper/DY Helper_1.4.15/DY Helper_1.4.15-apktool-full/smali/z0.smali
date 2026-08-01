.class public final synthetic Lz0;
.super Lp80;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lf80;


# virtual methods
.method public final α(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    check-cast p2, Ljw1;

    .line 5
    .line 6
    iget-wide p1, p2, Ljw1;->α:J

    .line 7
    .line 8
    check-cast p3, La80;

    .line 9
    .line 10
    iget-object p0, p0, Lkotlin/jvm/internal/α;->receiver:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 13
    .line 14
    sget-object v1, Landroidx/compose/ui/platform/AndroidComposeView;->М:Ljava/lang/Class;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget v1, v1, Landroid/content/res/Configuration;->fontScale:F

    .line 35
    .line 36
    new-instance v3, Lzr;

    .line 37
    .line 38
    invoke-direct {v3, v2, v1}, Lzr;-><init>(FF)V

    .line 39
    .line 40
    .line 41
    new-instance v1, Len;

    .line 42
    .line 43
    invoke-direct {v1, v3, p1, p2, p3}, Len;-><init>(Lzr;JLa80;)V

    .line 44
    .line 45
    .line 46
    sget-object p1, Ln1;->α:Ln1;

    .line 47
    .line 48
    invoke-virtual {p1, p0, v0, v1}, Ln1;->α(Landroid/view/View;Lnv;Len;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_0
    invoke-static {}, Lγ;->β()V

    .line 58
    .line 59
    .line 60
    return-object v0
.end method
