.class public final synthetic Lcom/example/dyhelper/ui/ψ;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;

.field public final synthetic ζ:Ljava/util/LinkedHashMap;


# direct methods
.method public synthetic constructor <init>(Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;Ljava/util/LinkedHashMap;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/example/dyhelper/ui/ψ;->ε:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/example/dyhelper/ui/ψ;->ζ:Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/ui/ψ;->ε:Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;

    .line 2
    .line 3
    iget v1, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->ρ:F

    .line 4
    .line 5
    const v2, 0x3f7ae148    # 0.98f

    .line 6
    .line 7
    .line 8
    cmpg-float v1, v1, v2

    .line 9
    .line 10
    if-gez v1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    iget-object v1, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->κ:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Ljava/util/Map$Entry;

    .line 34
    .line 35
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Ljava/lang/String;

    .line 40
    .line 41
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;

    .line 46
    .line 47
    iget-object v4, p0, Lcom/example/dyhelper/ui/ψ;->ζ:Ljava/util/LinkedHashMap;

    .line 48
    .line 49
    invoke-virtual {v4, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    check-cast v3, Ljava/lang/Float;

    .line 54
    .line 55
    if-eqz v3, :cond_1

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    int-to-float v4, v4

    .line 66
    sub-float/2addr v3, v4

    .line 67
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    const/high16 v5, 0x3f000000    # 0.5f

    .line 72
    .line 73
    cmpg-float v4, v4, v5

    .line 74
    .line 75
    if-lez v4, :cond_1

    .line 76
    .line 77
    invoke-virtual {v2, v3}, Landroid/view/View;->setTranslationY(F)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    const/4 v3, 0x0

    .line 85
    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    iget-object v3, v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->θ:Landroid/view/animation/PathInterpolator;

    .line 90
    .line 91
    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    const-wide/16 v3, 0x168

    .line 96
    .line 97
    invoke-virtual {v2, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_2
    :goto_1
    return-void
.end method
