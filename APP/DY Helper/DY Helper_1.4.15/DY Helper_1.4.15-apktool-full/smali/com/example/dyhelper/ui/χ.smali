.class public final synthetic Lcom/example/dyhelper/ui/χ;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object p0, Lcom/example/dyhelper/ui/а;->ζ:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->clear()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/example/dyhelper/ui/а;->δ:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/util/Collection;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 15
    .line 16
    .line 17
    sget-object p0, Lcom/example/dyhelper/ui/а;->γ:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    new-instance v0, Ltv1;

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    invoke-direct {v0, v1}, Ltv1;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->δ(Lp70;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    sget-object p0, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 32
    .line 33
    invoke-static {}, Lcom/example/dyhelper/ui/а;->θ()V

    .line 34
    .line 35
    .line 36
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 37
    .line 38
    return-object p0
.end method
