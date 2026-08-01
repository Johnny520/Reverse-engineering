.class public final synthetic Lcom/example/dyhelper/ui/φ;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/example/dyhelper/ui/φ;->ε:Landroid/app/Activity;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 2
    .line 3
    const-string v0, "camp:auto"

    .line 4
    .line 5
    invoke-static {v0}, Lcom/example/dyhelper/ui/а;->ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lcom/example/dyhelper/ui/а;->ε:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/Runnable;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    sget-object v2, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 20
    .line 21
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    sget-object v1, Lcom/example/dyhelper/ui/а;->δ:Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    sget-object v2, Lcom/example/dyhelper/ui/а;->ζ:Ljava/util/LinkedHashSet;

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->clear()V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object p0, p0, Lcom/example/dyhelper/ui/φ;->ε:Landroid/app/Activity;

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    invoke-static {p0, v0}, Lcom/example/dyhelper/ui/а;->ι(Landroid/app/Activity;Z)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-static {}, Lcom/example/dyhelper/ui/а;->α()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    const/4 v1, 0x3

    .line 57
    invoke-static {p0, v1}, Lxh;->ａ(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {}, Lcom/example/dyhelper/ui/а;->α()Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    sub-int/2addr v2, v1

    .line 70
    if-gez v2, :cond_3

    .line 71
    .line 72
    move v2, v0

    .line 73
    :cond_3
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    sget-object p0, Lcom/example/dyhelper/ui/а;->γ:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;

    .line 80
    .line 81
    if-eqz p0, :cond_6

    .line 82
    .line 83
    new-instance v0, Ltv1;

    .line 84
    .line 85
    const/4 v1, 0x5

    .line 86
    invoke-direct {v0, v1}, Ltv1;-><init>(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, v0}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->δ(Lp70;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    sget-object v1, Lcom/example/dyhelper/ui/а;->γ:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;

    .line 94
    .line 95
    if-nez v1, :cond_5

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_5
    invoke-virtual {v1, p0, v2, v0}, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ζ(Ljava/util/List;IZ)V

    .line 99
    .line 100
    .line 101
    :cond_6
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 102
    .line 103
    return-object p0
.end method
