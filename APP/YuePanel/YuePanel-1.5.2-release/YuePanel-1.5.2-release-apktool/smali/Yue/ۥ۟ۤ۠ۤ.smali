.class public LYue/ۥ۟ۤ۠ۤ;
.super LYue/ۥۢۢ۟ۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۤ۠ۤ$ۥ۟۟۟;
    }
.end annotation


# static fields
.field public static final ۥۣ۟۟۠:Ljava/lang/String; = "android:changeImageTransform:matrix"

.field public static final ۥ۟۟۠ۤ:Ljava/lang/String; = "android:changeImageTransform:bounds"

.field public static final ۥ۟۟۠ۥ:[Ljava/lang/String;

.field public static final ۥ۟۟۠ۦ:Landroid/animation/TypeEvaluator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/animation/TypeEvaluator<",
            "Landroid/graphics/Matrix;",
            ">;"
        }
    .end annotation
.end field

.field public static final ۥ۟۟۠ۧ:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroid/widget/ImageView;",
            "Landroid/graphics/Matrix;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "android:changeImageTransform:matrix"

    const-string v1, "android:changeImageTransform:bounds"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۤ۠ۤ;->ۥ۟۟۠ۥ:[Ljava/lang/String;

    new-instance v0, LYue/ۥ۟ۤ۠ۤ$ۥ;

    invoke-direct {v0}, LYue/ۥ۟ۤ۠ۤ$ۥ;-><init>()V

    sput-object v0, LYue/ۥ۟ۤ۠ۤ;->ۥ۟۟۠ۦ:Landroid/animation/TypeEvaluator;

    new-instance v0, LYue/ۥ۟ۤ۠ۤ$ۥ۟;

    const-class v1, Landroid/graphics/Matrix;

    const-string v2, "animatedTransform"

    invoke-direct {v0, v1, v2}, LYue/ۥ۟ۤ۠ۤ$ۥ۟;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, LYue/ۥ۟ۤ۠ۤ;->ۥ۟۟۠ۧ:Landroid/util/Property;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥۢۢ۟ۧ;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0, p1, p2}, LYue/ۥۢۢ۟ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private ۥ۟۟ۡ۟(LYue/ۥۢۢۡۤ;Z)V
    .locals 6

    iget-object v0, p1, LYue/ۥۢۢۡۤ;->ۥ۟:Landroid/view/View;

    instance-of v1, v0, Landroid/widget/ImageView;

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    move-object v1, v0

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_1

    return-void

    :cond_1
    iget-object p1, p1, LYue/ۥۢۢۡۤ;->ۥ:Ljava/util/Map;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v4

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5, v2, v3, v4, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    const-string v0, "android:changeImageTransform:bounds"

    invoke-interface {p1, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_2

    sget p2, LYue/ۥۡۥۧ۠$ۥ;->ۥ۟۟۟ۢ:I

    invoke-virtual {v1, p2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/graphics/Matrix;

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_3

    invoke-static {v1}, LYue/ۥ۟ۤ۠ۤ;->ۥ۟۟ۡۡ(Landroid/widget/ImageView;)Landroid/graphics/Matrix;

    move-result-object p2

    :cond_3
    const-string v0, "android:changeImageTransform:matrix"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_1
    return-void
.end method

.method public static ۥ۟۟ۡ۠(Landroid/widget/ImageView;)Landroid/graphics/Matrix;
    .locals 5

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    int-to-float v1, v1

    div-float v3, v2, v1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    int-to-float p0, p0

    int-to-float v0, v0

    div-float v4, p0, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    mul-float/2addr v1, v3

    mul-float/2addr v0, v3

    sub-float/2addr v2, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    sub-float/2addr p0, v0

    div-float/2addr p0, v1

    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v0, v3, v3}, Landroid/graphics/Matrix;->postScale(FF)Z

    int-to-float v1, v2

    int-to-float p0, p0

    invoke-virtual {v0, v1, p0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    return-object v0
.end method

.method public static ۥ۟۟ۡۡ(Landroid/widget/ImageView;)Landroid/graphics/Matrix;
    .locals 2
    .param p0    # Landroid/widget/ImageView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    if-lez v0, :cond_2

    sget-object v0, LYue/ۥ۟ۤ۠ۤ$ۥ۟۟;->ۥ:[I

    invoke-virtual {p0}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    new-instance v0, Landroid/graphics/Matrix;

    invoke-virtual {p0}, Landroid/widget/ImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    return-object v0

    :cond_0
    invoke-static {p0}, LYue/ۥ۟ۤ۠ۤ;->ۥ۟۟ۡ۠(Landroid/widget/ImageView;)Landroid/graphics/Matrix;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0}, LYue/ۥ۟ۤ۠ۤ;->ۥ۟۟ۡۤ(Landroid/widget/ImageView;)Landroid/graphics/Matrix;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance v0, Landroid/graphics/Matrix;

    invoke-virtual {p0}, Landroid/widget/ImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object p0

    invoke-direct {v0, p0}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    return-object v0
.end method

.method public static ۥ۟۟ۡۤ(Landroid/widget/ImageView;)Landroid/graphics/Matrix;
    .locals 4

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    int-to-float p0, p0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p0, v0

    invoke-virtual {v1, v2, p0}, Landroid/graphics/Matrix;->postScale(FF)Z

    return-object v1
.end method


# virtual methods
.method public captureEndValues(LYue/ۥۢۢۡۤ;)V
    .locals 1
    .param p1    # LYue/ۥۢۢۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LYue/ۥ۟ۤ۠ۤ;->ۥ۟۟ۡ۟(LYue/ۥۢۢۡۤ;Z)V

    return-void
.end method

.method public captureStartValues(LYue/ۥۢۢۡۤ;)V
    .locals 1
    .param p1    # LYue/ۥۢۢۡۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, LYue/ۥ۟ۤ۠ۤ;->ۥ۟۟ۡ۟(LYue/ۥۢۢۡۤ;Z)V

    return-void
.end method

.method public createAnimator(Landroid/view/ViewGroup;LYue/ۥۢۢۡۤ;LYue/ۥۢۢۡۤ;)Landroid/animation/Animator;
    .locals 4
    .param p1    # Landroid/view/ViewGroup;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۢۢۡۤ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۢۢۡۤ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    const/4 p1, 0x0

    if-eqz p2, :cond_a

    if-nez p3, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v0, p2, LYue/ۥۢۢۡۤ;->ۥ:Ljava/util/Map;

    const-string v1, "android:changeImageTransform:bounds"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    iget-object v2, p3, LYue/ۥۢۢۡۤ;->ۥ:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Rect;

    if-eqz v0, :cond_a

    if-nez v1, :cond_1

    goto :goto_3

    :cond_1
    iget-object p2, p2, LYue/ۥۢۢۡۤ;->ۥ:Ljava/util/Map;

    const-string v2, "android:changeImageTransform:matrix"

    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/graphics/Matrix;

    iget-object v3, p3, LYue/ۥۢۢۡۤ;->ۥ:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Matrix;

    if-nez p2, :cond_2

    if-eqz v2, :cond_3

    :cond_2
    if-eqz p2, :cond_4

    invoke-virtual {p2, v2}, Landroid/graphics/Matrix;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    :cond_3
    const/4 v3, 0x1

    goto :goto_0

    :cond_4
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    if-eqz v3, :cond_5

    return-object p1

    :cond_5
    iget-object p1, p3, LYue/ۥۢۢۡۤ;->ۥ۟:Landroid/view/View;

    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p3

    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p3

    if-lez v0, :cond_9

    if-gtz p3, :cond_6

    goto :goto_1

    :cond_6
    if-nez p2, :cond_7

    sget-object p2, LYue/ۥۡ۠ۤۨ;->ۥ:Landroid/graphics/Matrix;

    :cond_7
    if-nez v2, :cond_8

    sget-object v2, LYue/ۥۡ۠ۤۨ;->ۥ:Landroid/graphics/Matrix;

    :cond_8
    sget-object p3, LYue/ۥ۟ۤ۠ۤ;->ۥ۟۟۠ۧ:Landroid/util/Property;

    invoke-virtual {p3, p1, p2}, Landroid/util/Property;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2, v2}, LYue/ۥ۟ۤ۠ۤ;->ۥ۟۟ۡۢ(Landroid/widget/ImageView;Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Landroid/animation/ObjectAnimator;

    move-result-object p3

    new-instance v0, LYue/ۥ۟ۤ۠ۤ$ۥ۟۟۟;

    invoke-direct {v0, p1, p2, v2}, LYue/ۥ۟ۤ۠ۤ$ۥ۟۟۟;-><init>(Landroid/widget/ImageView;Landroid/graphics/Matrix;Landroid/graphics/Matrix;)V

    invoke-virtual {p3, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p3, v0}, Landroid/animation/Animator;->addPauseListener(Landroid/animation/Animator$AnimatorPauseListener;)V

    invoke-virtual {p0, v0}, LYue/ۥۢۢ۟ۧ;->addListener(LYue/ۥۢۢ۟ۧ$ۥ۟۟۟ۤ;)LYue/ۥۢۢ۟ۧ;

    goto :goto_2

    :cond_9
    :goto_1
    invoke-virtual {p0, p1}, LYue/ۥ۟ۤ۠ۤ;->ۥۣ۟۟ۡ(Landroid/widget/ImageView;)Landroid/animation/ObjectAnimator;

    move-result-object p3

    :goto_2
    return-object p3

    :cond_a
    :goto_3
    return-object p1
.end method

.method public getTransitionProperties()[Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    sget-object v0, LYue/ۥ۟ۤ۠ۤ;->ۥ۟۟۠ۥ:[Ljava/lang/String;

    return-object v0
.end method

.method public isSeekingSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ۥ۟۟ۡۢ(Landroid/widget/ImageView;Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Landroid/animation/ObjectAnimator;
    .locals 2

    sget-object v0, LYue/ۥ۟ۤ۠ۤ;->ۥ۟۟۠ۧ:Landroid/util/Property;

    new-instance v1, LYue/ۥۣۢۢۡ$ۥ۟;

    invoke-direct {v1}, LYue/ۥۣۢۢۡ$ۥ۟;-><init>()V

    filled-new-array {p2, p3}, [Landroid/graphics/Matrix;

    move-result-object p2

    invoke-static {p1, v0, v1, p2}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object p1

    return-object p1
.end method

.method public final ۥۣ۟۟ۡ(Landroid/widget/ImageView;)Landroid/animation/ObjectAnimator;
    .locals 3
    .param p1    # Landroid/widget/ImageView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    sget-object v0, LYue/ۥ۟ۤ۠ۤ;->ۥ۟۟۠ۧ:Landroid/util/Property;

    sget-object v1, LYue/ۥ۟ۤ۠ۤ;->ۥ۟۟۠ۦ:Landroid/animation/TypeEvaluator;

    sget-object v2, LYue/ۥۡ۠ۤۨ;->ۥ:Landroid/graphics/Matrix;

    filled-new-array {v2, v2}, [Landroid/graphics/Matrix;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object p1

    return-object p1
.end method
