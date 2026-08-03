.class public Lcom/google/android/material/navigation/DrawerLayoutUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation


# static fields
.field private static final DEFAULT_SCRIM_ALPHA:I

.field private static final DEFAULT_SCRIM_COLOR:I = -0x67000000


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/high16 v0, -0x67000000

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    sput v0, Lcom/google/android/material/navigation/DrawerLayoutUtils;->DEFAULT_SCRIM_ALPHA:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getScrimCloseAnimatorListener(LYue/ۥ۠۠ۢ;Landroid/view/View;)Landroid/animation/Animator$AnimatorListener;
    .locals 1
    .param p0    # LYue/ۥ۠۠ۢ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Lcom/google/android/material/navigation/DrawerLayoutUtils$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/material/navigation/DrawerLayoutUtils$1;-><init>(LYue/ۥ۠۠ۢ;Landroid/view/View;)V

    return-object v0
.end method

.method public static getScrimCloseAnimatorUpdateListener(LYue/ۥ۠۠ۢ;)Landroid/animation/ValueAnimator$AnimatorUpdateListener;
    .locals 1
    .param p0    # LYue/ۥ۠۠ۢ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, LYue/ۥ۠۠ۢ۟;

    invoke-direct {v0, p0}, LYue/ۥ۠۠ۢ۟;-><init>(LYue/ۥ۠۠ۢ;)V

    return-object v0
.end method

.method private static synthetic lambda$getScrimCloseAnimatorUpdateListener$0(LYue/ۥ۠۠ۢ;Landroid/animation/ValueAnimator;)V
    .locals 2

    sget v0, Lcom/google/android/material/navigation/DrawerLayoutUtils;->DEFAULT_SCRIM_ALPHA:I

    const/4 v1, 0x0

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/google/android/material/animation/AnimationUtils;->lerp(IIF)I

    move-result p1

    const/high16 v0, -0x67000000

    invoke-static {v0, p1}, LYue/ۥ۟ۥۤ۟;->ۥ۟۟ۡۢ(II)I

    move-result p1

    invoke-virtual {p0, p1}, LYue/ۥ۠۠ۢ;->setScrimColor(I)V

    return-void
.end method

.method public static synthetic ۥ(LYue/ۥ۠۠ۢ;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/material/navigation/DrawerLayoutUtils;->lambda$getScrimCloseAnimatorUpdateListener$0(LYue/ۥ۠۠ۢ;Landroid/animation/ValueAnimator;)V

    return-void
.end method
