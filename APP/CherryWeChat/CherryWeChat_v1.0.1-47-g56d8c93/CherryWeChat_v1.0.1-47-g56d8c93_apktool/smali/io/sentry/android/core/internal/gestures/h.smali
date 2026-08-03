.class public abstract Lio/sentry/android/core/internal/gestures/h;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [I

    sput-object v0, Lio/sentry/android/core/internal/gestures/h;->a:[I

    return-void
.end method

.method public static a(Lio/sentry/android/core/SentryAndroidOptions;Landroid/view/View;FFLio/sentry/internal/gestures/a;)Lio/sentry/internal/gestures/b;
    .locals 10

    invoke-virtual {p0}, Lio/sentry/v2;->getGestureTargetLocators()Ljava/util/List;

    move-result-object p0

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    move-object v1, p1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v2

    if-lez v2, :cond_a

    invoke-virtual {v0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    sget-object v3, Lio/sentry/android/core/internal/gestures/h;->a:[I

    invoke-virtual {v2, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v4, 0x0

    aget v5, v3, v4

    const/4 v6, 0x1

    aget v3, v3, v6

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v7

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v8

    int-to-float v9, v5

    cmpg-float v9, p2, v9

    if-ltz v9, :cond_0

    add-int/2addr v5, v7

    int-to-float v5, v5

    cmpl-float v5, p2, v5

    if-gtz v5, :cond_0

    int-to-float v5, v3

    cmpg-float v5, p3, v5

    if-ltz v5, :cond_0

    add-int/2addr v3, v8

    int-to-float v3, v3

    cmpl-float v3, p3, v3

    if-gtz v3, :cond_0

    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_2

    move-object v3, v2

    check-cast v3, Landroid/view/ViewGroup;

    move v5, v4

    :goto_1
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v7

    if-ge v5, v7, :cond_2

    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v5

    if-ge v3, v5, :cond_0

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/android/core/internal/gestures/a;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, Lio/sentry/internal/gestures/a;->CLICKABLE:Lio/sentry/internal/gestures/a;

    if-ne p4, v7, :cond_3

    invoke-virtual {v2}, Landroid/view/View;->isClickable()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-nez v7, :cond_3

    :try_start_0
    invoke-static {v2}, Lio/sentry/android/core/internal/gestures/h;->b(Landroid/view/View;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2}, Lio/sentry/config/a;->l(Landroid/view/KeyEvent$Callback;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lio/sentry/internal/gestures/b;

    invoke-direct {v8, v2, v7, v5}, Lio/sentry/internal/gestures/b;-><init>(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :cond_3
    sget-object v7, Lio/sentry/internal/gestures/a;->SCROLLABLE:Lio/sentry/internal/gestures/a;

    if-ne p4, v7, :cond_7

    iget-boolean v5, v5, Lio/sentry/android/core/internal/gestures/a;->a:Z

    if-nez v5, :cond_4

    move v5, v4

    goto :goto_3

    :cond_4
    const-class v5, Landroidx/core/view/ScrollingView;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    :goto_3
    if-nez v5, :cond_5

    const-class v5, Landroid/widget/AbsListView;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_5

    const-class v5, Landroid/widget/ScrollView;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_6

    :cond_5
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v5

    if-nez v5, :cond_6

    move v5, v6

    goto :goto_4

    :cond_6
    move v5, v4

    :goto_4
    if-eqz v5, :cond_7

    :try_start_1
    invoke-static {v2}, Lio/sentry/android/core/internal/gestures/h;->b(Landroid/view/View;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2}, Lio/sentry/config/a;->l(Landroid/view/KeyEvent$Callback;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lio/sentry/internal/gestures/b;

    invoke-direct {v8, v2, v7, v5}, Lio/sentry/internal/gestures/b;-><init>(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_5

    :catch_0
    :cond_7
    move-object v8, p1

    :goto_5
    if-eqz v8, :cond_9

    sget-object v5, Lio/sentry/internal/gestures/a;->CLICKABLE:Lio/sentry/internal/gestures/a;

    if-ne p4, v5, :cond_8

    move-object v1, v8

    goto :goto_6

    :cond_8
    sget-object v5, Lio/sentry/internal/gestures/a;->SCROLLABLE:Lio/sentry/internal/gestures/a;

    if-ne p4, v5, :cond_9

    return-object v8

    :cond_9
    :goto_6
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_2

    :cond_a
    return-object v1
.end method

.method public static b(Landroid/view/View;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    const/high16 v1, -0x1000000

    and-int/2addr v1, v0

    if-nez v1, :cond_0

    const v1, 0xffffff

    and-int/2addr v1, v0

    if-nez v1, :cond_2

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const-string p0, ""

    return-object p0

    :cond_2
    new-instance p0, Landroid/content/res/Resources$NotFoundException;

    invoke-direct {p0}, Landroid/content/res/Resources$NotFoundException;-><init>()V

    throw p0
.end method
