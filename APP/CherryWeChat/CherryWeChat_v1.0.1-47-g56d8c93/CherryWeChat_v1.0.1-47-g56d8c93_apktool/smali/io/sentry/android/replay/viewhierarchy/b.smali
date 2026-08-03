.class public abstract Lio/sentry/android/replay/viewhierarchy/b;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:LcA;

.field public static b:Z

.field public static c:Ljava/lang/ref/WeakReference;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LcA;

    sget-object v1, Lio/sentry/android/replay/viewhierarchy/a;->b:Lio/sentry/android/replay/viewhierarchy/a;

    invoke-direct {v0, v1}, LcA;-><init>(LUi;)V

    sput-object v0, Lio/sentry/android/replay/viewhierarchy/b;->a:LcA;

    return-void
.end method

.method public static a(Landroidx/compose/ui/node/LayoutNode;Lio/sentry/android/replay/viewhierarchy/f;ZLio/sentry/v2;)Lio/sentry/android/replay/viewhierarchy/f;
    .locals 14

    move-object/from16 v1, p3

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->isPlaced()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_17

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->isAttached()Z

    move-result v0

    if-eqz v0, :cond_17

    if-eqz p2, :cond_0

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v3

    invoke-static {v3}, Landroidx/compose/ui/layout/LayoutCoordinatesKt;->findRootCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lio/sentry/android/replay/viewhierarchy/b;->c:Ljava/lang/ref/WeakReference;

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getCoordinates()Landroidx/compose/ui/layout/LayoutCoordinates;

    move-result-object v0

    sget-object v3, Lio/sentry/android/replay/viewhierarchy/b;->c:Ljava/lang/ref/WeakReference;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/layout/LayoutCoordinates;

    goto :goto_0

    :cond_1
    move-object v3, v2

    :goto_0
    invoke-static {v0, v3}, Lio/sentry/android/replay/util/d;->a(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;)Landroid/graphics/Rect;

    move-result-object v6

    const/4 v3, 0x0

    const/4 v5, 0x1

    :try_start_0
    invoke-static {p0}, Lio/sentry/android/replay/viewhierarchy/b;->d(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/compose/ui/node/NodeCoordinator;->isTransparent()Z

    move-result v7

    if-nez v7, :cond_3

    if-eqz v0, :cond_2

    sget-object v7, Landroidx/compose/ui/semantics/SemanticsProperties;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsProperties;

    invoke-virtual {v7}, Landroidx/compose/ui/semantics/SemanticsProperties;->getInvisibleToUser()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    move-result-object v7

    invoke-virtual {v0, v7}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->contains(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Z

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    move-result v7

    if-lez v7, :cond_3

    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    move-result v7

    if-lez v7, :cond_3

    move v7, v5

    goto :goto_1

    :cond_3
    move v7, v3

    :goto_1
    if-eqz v0, :cond_4

    sget-object v8, Landroidx/compose/ui/semantics/SemanticsActions;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsActions;

    invoke-virtual {v8}, Landroidx/compose/ui/semantics/SemanticsActions;->getSetText()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    move-result-object v8

    invoke-virtual {v0, v8}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->contains(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Z

    move-result v8

    if-ne v8, v5, :cond_4

    goto :goto_2

    :cond_4
    if-eqz v0, :cond_5

    sget-object v8, Landroidx/compose/ui/semantics/SemanticsProperties;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsProperties;

    invoke-virtual {v8}, Landroidx/compose/ui/semantics/SemanticsProperties;->getEditableText()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    move-result-object v8

    invoke-virtual {v0, v8}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->contains(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Z

    move-result v8

    if-ne v8, v5, :cond_5

    :goto_2
    move v8, v5

    goto :goto_3

    :cond_5
    move v8, v3

    :goto_3
    if-eqz v0, :cond_6

    sget-object v9, Landroidx/compose/ui/semantics/SemanticsProperties;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsProperties;

    invoke-virtual {v9}, Landroidx/compose/ui/semantics/SemanticsProperties;->getText()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    move-result-object v9

    invoke-virtual {v0, v9}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->contains(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Z

    move-result v9

    if-ne v9, v5, :cond_6

    goto :goto_4

    :cond_6
    if-eqz v8, :cond_10

    :goto_4
    if-eqz v7, :cond_7

    invoke-static {v0, v3, v1}, Lio/sentry/android/replay/viewhierarchy/b;->e(Landroidx/compose/ui/semantics/SemanticsConfiguration;ZLio/sentry/v2;)Z

    move-result v1

    if-eqz v1, :cond_7

    move v9, v5

    goto :goto_5

    :cond_7
    move v9, v3

    :goto_5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    if-eqz v0, :cond_8

    sget-object v5, Landroidx/compose/ui/semantics/SemanticsActions;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsActions;

    invoke-virtual {v5}, Landroidx/compose/ui/semantics/SemanticsActions;->getGetTextLayoutResult()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    move-result-object v5

    invoke-static {v0, v5}, Landroidx/compose/ui/semantics/SemanticsConfigurationKt;->getOrNull(Landroidx/compose/ui/semantics/SemanticsConfiguration;Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/semantics/AccessibilityAction;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroidx/compose/ui/semantics/AccessibilityAction;->getAction()Lkotlin/Function;

    move-result-object v0

    check-cast v0, Lfj;

    if-eqz v0, :cond_8

    invoke-interface {v0, v1}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    :cond_8
    invoke-static {p0}, Lio/sentry/android/replay/util/d;->c(Landroidx/compose/ui/node/LayoutNode;)Lio/sentry/android/replay/util/h;

    move-result-object v0

    iget-object v5, v0, Lio/sentry/android/replay/util/h;->a:Landroidx/compose/ui/graphics/Color;

    iget-boolean v0, v0, Lio/sentry/android/replay/util/h;->b:Z

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_9

    move-object v1, v2

    goto :goto_6

    :cond_9
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    :goto_6
    check-cast v1, Landroidx/compose/ui/text/TextLayoutResult;

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    move-result-object v7

    if-eqz v7, :cond_a

    invoke-virtual {v7}, Landroidx/compose/ui/text/TextLayoutInput;->getStyle()Landroidx/compose/ui/text/TextStyle;

    move-result-object v7

    if-eqz v7, :cond_a

    invoke-virtual {v7}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v10

    invoke-static {v10, v11}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    move-result-object v7

    goto :goto_7

    :cond_a
    move-object v7, v2

    :goto_7
    if-eqz v7, :cond_b

    invoke-virtual {v7}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v10

    sget-object v12, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v12}, Landroidx/compose/ui/graphics/Color$Companion;->getUnspecified-0d7_KjU()J

    move-result-wide v12

    cmp-long v10, v10, v12

    if-nez v10, :cond_b

    goto :goto_8

    :cond_b
    move-object v5, v7

    :goto_8
    if-eqz v1, :cond_c

    invoke-virtual {v1}, Landroidx/compose/ui/text/TextLayoutResult;->getLayoutInput()Landroidx/compose/ui/text/TextLayoutInput;

    move-result-object v7

    if-eqz v7, :cond_c

    invoke-virtual {v7}, Landroidx/compose/ui/text/TextLayoutInput;->getStyle()Landroidx/compose/ui/text/TextStyle;

    move-result-object v7

    if-eqz v7, :cond_c

    invoke-virtual {v7}, Landroidx/compose/ui/text/TextStyle;->getFontSize-XSAIIZE()J

    move-result-wide v10

    invoke-static {v10, v11}, Landroidx/compose/ui/unit/TextUnit;->box-impl(J)Landroidx/compose/ui/unit/TextUnit;

    move-result-object v7

    goto :goto_9

    :cond_c
    move-object v7, v2

    :goto_9
    sget-object v10, Landroidx/compose/ui/unit/TextUnit;->Companion:Landroidx/compose/ui/unit/TextUnit$Companion;

    invoke-virtual {v10}, Landroidx/compose/ui/unit/TextUnit$Companion;->getUnspecified-XSAIIZE()J

    move-result-wide v10

    if-nez v7, :cond_d

    goto :goto_a

    :cond_d
    invoke-virtual {v7}, Landroidx/compose/ui/unit/TextUnit;->unbox-impl()J

    move-result-wide v12

    invoke-static {v12, v13, v10, v11}, Landroidx/compose/ui/unit/TextUnit;->equals-impl0(JJ)Z

    move-result v3

    :goto_a
    new-instance v7, Lio/sentry/android/replay/viewhierarchy/e;

    if-eqz v1, :cond_e

    if-nez v8, :cond_e

    if-nez v3, :cond_e

    new-instance v3, Lio/sentry/android/replay/util/a;

    invoke-direct {v3, v1, v0}, Lio/sentry/android/replay/util/a;-><init>(Landroidx/compose/ui/text/TextLayoutResult;Z)V

    move-object v1, v3

    goto :goto_b

    :cond_e
    move-object v1, v2

    :goto_b
    if-eqz v5, :cond_f

    invoke-virtual {v5}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v2

    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->toArgb-8_81llA(J)I

    move-result v0

    const/high16 v2, -0x1000000

    or-int/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :cond_f
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getWidth()I

    move-result v5

    move-object v10, v6

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getHeight()I

    move-result v6

    move-object v0, v7

    iget v7, p1, Lio/sentry/android/replay/viewhierarchy/f;->c:F

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v8, p1

    invoke-direct/range {v0 .. v10}, Lio/sentry/android/replay/viewhierarchy/e;-><init>(Lio/sentry/android/replay/util/i;Ljava/lang/Integer;IIIIFLio/sentry/android/replay/viewhierarchy/f;ZLandroid/graphics/Rect;)V

    return-object v0

    :cond_10
    invoke-static {p0}, Lio/sentry/android/replay/util/d;->b(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/graphics/painter/Painter;

    move-result-object v2

    if-eqz v2, :cond_13

    if-eqz v7, :cond_11

    invoke-static {v0, v5, v1}, Lio/sentry/android/replay/viewhierarchy/b;->e(Landroidx/compose/ui/semantics/SemanticsConfiguration;ZLio/sentry/v2;)Z

    move-result v0

    if-eqz v0, :cond_11

    move v0, v5

    goto :goto_c

    :cond_11
    move v0, v3

    :goto_c
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getWidth()I

    move-result v1

    move-object v7, v2

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getHeight()I

    move-result v2

    iget v8, p1, Lio/sentry/android/replay/viewhierarchy/f;->c:F

    if-eqz v0, :cond_12

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v7, "Vector"

    invoke-static {v0, v7, v3}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v7

    if-nez v7, :cond_12

    const-string v7, "Color"

    invoke-static {v0, v7, v3}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v7

    if-nez v7, :cond_12

    const-string v7, "Brush"

    invoke-static {v0, v7, v3}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_12

    goto :goto_d

    :cond_12
    move v5, v3

    :goto_d
    new-instance v0, Lio/sentry/android/replay/viewhierarchy/d;

    move-object v4, p1

    move v3, v8

    invoke-direct/range {v0 .. v6}, Lio/sentry/android/replay/viewhierarchy/f;-><init>(IIFLio/sentry/android/replay/viewhierarchy/f;ZLandroid/graphics/Rect;)V

    return-object v0

    :cond_13
    if-eqz v7, :cond_14

    invoke-static {v0, v3, v1}, Lio/sentry/android/replay/viewhierarchy/b;->e(Landroidx/compose/ui/semantics/SemanticsConfiguration;ZLio/sentry/v2;)Z

    move-result v0

    if-eqz v0, :cond_14

    goto :goto_e

    :cond_14
    move v5, v3

    :goto_e
    new-instance v0, Lio/sentry/android/replay/viewhierarchy/c;

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getHeight()I

    move-result v2

    iget v3, p1, Lio/sentry/android/replay/viewhierarchy/f;->c:F

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lio/sentry/android/replay/viewhierarchy/f;-><init>(IIFLio/sentry/android/replay/viewhierarchy/f;ZLandroid/graphics/Rect;)V

    return-object v0

    :catchall_0
    move-exception v0

    sget-boolean v2, Lio/sentry/android/replay/viewhierarchy/b;->b:Z

    if-nez v2, :cond_15

    sput-boolean v5, Lio/sentry/android/replay/viewhierarchy/b;->b:Z

    invoke-virtual {v1}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v1

    sget-object v2, Lio/sentry/a2;->ERROR:Lio/sentry/a2;

    const-string v5, "Error retrieving semantics information from Compose tree. Most likely you\'re using\nan unsupported version of androidx.compose.ui:ui. The supported\nversion range is 1.5.0 - 1.8.0.\nIf you\'re using a newer version, please open a github issue with the version\nyou\'re using, so we can add support for it."

    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {v1, v2, v0, v5, v3}, Lio/sentry/ILogger;->n(Lio/sentry/a2;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_15
    new-instance v0, Lio/sentry/android/replay/viewhierarchy/c;

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getHeight()I

    move-result v2

    iget v3, p1, Lio/sentry/android/replay/viewhierarchy/f;->c:F

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getOuterCoordinator$ui_release()Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/compose/ui/node/NodeCoordinator;->isTransparent()Z

    move-result v5

    if-nez v5, :cond_16

    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    move-result v5

    if-lez v5, :cond_16

    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    move-result v5

    :cond_16
    const/4 v5, 0x1

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lio/sentry/android/replay/viewhierarchy/f;-><init>(IIFLio/sentry/android/replay/viewhierarchy/f;ZLandroid/graphics/Rect;)V

    return-object v0

    :cond_17
    return-object v2
.end method

.method public static b(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/f;Lio/sentry/v2;)Z
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string p1, "AndroidComposeView"

    const/4 p2, 0x0

    invoke-static {p0, p1, p2}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    return p2
.end method

.method public static c(ZLandroidx/compose/ui/semantics/SemanticsConfiguration;)Ljava/lang/String;
    .locals 0

    if-eqz p0, :cond_0

    const-string p0, "android.widget.ImageView"

    return-object p0

    :cond_0
    if-eqz p1, :cond_2

    sget-object p0, Landroidx/compose/ui/semantics/SemanticsProperties;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsProperties;

    invoke-virtual {p0}, Landroidx/compose/ui/semantics/SemanticsProperties;->getText()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->contains(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Z

    move-result p0

    if-nez p0, :cond_1

    sget-object p0, Landroidx/compose/ui/semantics/SemanticsActions;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsActions;

    invoke-virtual {p0}, Landroidx/compose/ui/semantics/SemanticsActions;->getSetText()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->contains(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Z

    move-result p0

    if-nez p0, :cond_1

    sget-object p0, Landroidx/compose/ui/semantics/SemanticsProperties;->INSTANCE:Landroidx/compose/ui/semantics/SemanticsProperties;

    invoke-virtual {p0}, Landroidx/compose/ui/semantics/SemanticsProperties;->getEditableText()Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroidx/compose/ui/semantics/SemanticsConfiguration;->contains(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Z

    move-result p0

    if-eqz p0, :cond_2

    :cond_1
    const-string p0, "android.widget.TextView"

    return-object p0

    :cond_2
    const-string p0, "android.view.View"

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/ui/semantics/SemanticsConfiguration;
    .locals 2

    sget-object v0, Lio/sentry/android/replay/viewhierarchy/b;->a:LcA;

    invoke-virtual {v0}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/semantics/SemanticsConfiguration;

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getCollapsedSemantics$ui_release()Landroidx/compose/ui/semantics/SemanticsConfiguration;

    move-result-object p0

    return-object p0
.end method

.method public static e(Landroidx/compose/ui/semantics/SemanticsConfiguration;ZLio/sentry/v2;)Z
    .locals 2

    if-eqz p0, :cond_0

    sget-object v0, Lio/sentry/android/replay/y;->a:Landroidx/compose/ui/semantics/SemanticsPropertyKey;

    invoke-static {p0, v0}, Landroidx/compose/ui/semantics/SemanticsConfigurationKt;->getOrNull(Landroidx/compose/ui/semantics/SemanticsConfiguration;Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "unmask"

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v1, "mask"

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    invoke-static {p1, p0}, Lio/sentry/android/replay/viewhierarchy/b;->c(ZLandroidx/compose/ui/semantics/SemanticsConfiguration;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object p1

    iget-object p1, p1, Lio/sentry/z2;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    :goto_1
    const/4 p0, 0x0

    return p0

    :cond_3
    invoke-virtual {p2}, Lio/sentry/v2;->getSessionReplay()Lio/sentry/z2;

    move-result-object p1

    iget-object p1, p1, Lio/sentry/z2;->c:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static f(Landroidx/compose/ui/node/LayoutNode;Lio/sentry/android/replay/viewhierarchy/f;ZLio/sentry/v2;)V
    .locals 6

    invoke-virtual {p0}, Landroidx/compose/ui/node/LayoutNode;->getChildren$ui_release()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/ui/node/LayoutNode;

    invoke-static {v4, p1, p2, p3}, Lio/sentry/android/replay/viewhierarchy/b;->a(Landroidx/compose/ui/node/LayoutNode;Lio/sentry/android/replay/viewhierarchy/f;ZLio/sentry/v2;)Lio/sentry/android/replay/viewhierarchy/f;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v4, v5, v2, p3}, Lio/sentry/android/replay/viewhierarchy/b;->f(Landroidx/compose/ui/node/LayoutNode;Lio/sentry/android/replay/viewhierarchy/f;ZLio/sentry/v2;)V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iput-object v0, p1, Lio/sentry/android/replay/viewhierarchy/f;->f:Ljava/util/ArrayList;

    return-void
.end method
