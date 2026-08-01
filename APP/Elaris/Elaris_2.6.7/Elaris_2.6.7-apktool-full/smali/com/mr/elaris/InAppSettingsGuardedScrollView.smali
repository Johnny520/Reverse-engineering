.class Lcom/mr/elaris/InAppSettingsGuardedScrollView;
.super Landroid/widget/ScrollView;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field private blockingRightSwipe:Z

.field private downX:F

.field private downY:F

.field private final settings:Lcom/mr/elaris/InAppSettings;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettings;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsGuardedScrollView;->settings:Lcom/mr/elaris/InAppSettings;

    .line 5
    .line 6
    return-void
.end method

.method private isBlockedRightSwipe(FF)Z
    .locals 2

    .line 1
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    iget-object v0, p0, Lcom/mr/elaris/InAppSettingsGuardedScrollView;->settings:Lcom/mr/elaris/InAppSettings;

    .line 6
    .line 7
    const/high16 v1, 0x40c00000    # 6.0f

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-float v0, v0

    .line 14
    cmpl-float v0, p1, v0

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-lez v0, :cond_0

    .line 18
    .line 19
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 20
    .line 21
    mul-float/2addr p2, v0

    .line 22
    cmpl-float p2, p1, p2

    .line 23
    .line 24
    if-lez p2, :cond_0

    .line 25
    .line 26
    iget-object p0, p0, Lcom/mr/elaris/InAppSettingsGuardedScrollView;->settings:Lcom/mr/elaris/InAppSettings;

    .line 27
    .line 28
    const/high16 p2, 0x42800000    # 64.0f

    .line 29
    .line 30
    invoke-virtual {p0, p2}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    int-to-float p0, p0

    .line 35
    cmpl-float p0, p1, p0

    .line 36
    .line 37
    if-lez p0, :cond_0

    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :cond_0
    return v1
.end method

.method private requestAncestorsDisallowIntercept(Z)V
    .locals 1

    .line 1
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-interface {p0, p1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 8
    .line 9
    .line 10
    instance-of v0, p0, Landroid/view/View;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    check-cast p0, Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    :cond_1
    :goto_1
    return-void
.end method


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    :try_start_0
    invoke-direct {p0, v0}, Lcom/mr/elaris/InAppSettingsGuardedScrollView;->requestAncestorsDisallowIntercept(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    :catchall_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iput v0, p0, Lcom/mr/elaris/InAppSettingsGuardedScrollView;->downX:F

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iput v0, p0, Lcom/mr/elaris/InAppSettingsGuardedScrollView;->downY:F

    .line 31
    .line 32
    iput-boolean v2, p0, Lcom/mr/elaris/InAppSettingsGuardedScrollView;->blockingRightSwipe:Z

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v3, 0x2

    .line 36
    if-ne v1, v3, :cond_3

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iget v2, p0, Lcom/mr/elaris/InAppSettingsGuardedScrollView;->downX:F

    .line 43
    .line 44
    sub-float/2addr v1, v2

    .line 45
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    iget v3, p0, Lcom/mr/elaris/InAppSettingsGuardedScrollView;->downY:F

    .line 50
    .line 51
    sub-float/2addr v2, v3

    .line 52
    iget-boolean v3, p0, Lcom/mr/elaris/InAppSettingsGuardedScrollView;->blockingRightSwipe:Z

    .line 53
    .line 54
    if-nez v3, :cond_2

    .line 55
    .line 56
    invoke-direct {p0, v1, v2}, Lcom/mr/elaris/InAppSettingsGuardedScrollView;->isBlockedRightSwipe(FF)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    iput-boolean v0, p0, Lcom/mr/elaris/InAppSettingsGuardedScrollView;->blockingRightSwipe:Z

    .line 63
    .line 64
    :try_start_1
    invoke-direct {p0, v0}, Lcom/mr/elaris/InAppSettingsGuardedScrollView;->requestAncestorsDisallowIntercept(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 65
    .line 66
    .line 67
    :catchall_1
    return v0

    .line 68
    :cond_2
    iget-boolean v1, p0, Lcom/mr/elaris/InAppSettingsGuardedScrollView;->blockingRightSwipe:Z

    .line 69
    .line 70
    if-eqz v1, :cond_5

    .line 71
    .line 72
    return v0

    .line 73
    :cond_3
    if-ne v1, v0, :cond_4

    .line 74
    .line 75
    iget-boolean v1, p0, Lcom/mr/elaris/InAppSettingsGuardedScrollView;->blockingRightSwipe:Z

    .line 76
    .line 77
    if-eqz v1, :cond_5

    .line 78
    .line 79
    iput-boolean v2, p0, Lcom/mr/elaris/InAppSettingsGuardedScrollView;->blockingRightSwipe:Z

    .line 80
    .line 81
    return v0

    .line 82
    :cond_4
    const/4 v3, 0x3

    .line 83
    if-ne v1, v3, :cond_5

    .line 84
    .line 85
    iget-boolean v1, p0, Lcom/mr/elaris/InAppSettingsGuardedScrollView;->blockingRightSwipe:Z

    .line 86
    .line 87
    if-eqz v1, :cond_5

    .line 88
    .line 89
    iput-boolean v2, p0, Lcom/mr/elaris/InAppSettingsGuardedScrollView;->blockingRightSwipe:Z

    .line 90
    .line 91
    return v0

    .line 92
    :cond_5
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    return p0
.end method
