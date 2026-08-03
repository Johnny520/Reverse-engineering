.class public abstract LYue/ۥ۟ۢۤ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۢۤ$ۥ;,
        LYue/ۥ۟ۢۤ$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟ۢ:F = 0.0f

.field public static final ۥ۟۟ۢ۟:F = 3.4028235E38f

.field public static final ۥ۟۟ۢ۠:F = 0.0f

.field public static final ۥ۟۟ۢۡ:I = 0x0

.field public static final ۥ۟۟ۢۢ:I = 0x1

.field public static final ۥۣ۟۟ۢ:I = 0x2

.field public static final ۥ۟۟ۢۤ:I = 0x0

.field public static final ۥ۟۟ۢۥ:I = 0x1

.field public static final ۥ۟۟ۢۦ:I = 0x1

.field public static final ۥ۟۟ۢۧ:I = 0x13b

.field public static final ۥ۟۟ۢۨ:I = 0x627

.field public static final ۥۣ۟۟:F = 3.4028235E38f

.field public static final ۥۣ۟۟۟:F = 0.2f

.field public static final ۥۣ۟۟۠:F = 1.0f

.field public static final ۥۣ۟۟ۡ:I

.field public static final ۥۣ۟۟ۢ:I = 0x1f4

.field public static final ۥۣۣ۟۟:I = 0x1f4


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥ۟ۢۤ$ۥ;

.field public final ۥ۟۟۠ۤ:Landroid/view/animation/Interpolator;

.field public final ۥ۟۟۠ۥ:Landroid/view/View;

.field public ۥ۟۟۠ۦ:Ljava/lang/Runnable;

.field public ۥ۟۟۠ۧ:[F

.field public ۥ۟۟۠ۨ:[F

.field public ۥ۟۟ۡ:I

.field public ۥ۟۟ۡ۟:I

.field public ۥ۟۟ۡ۠:[F

.field public ۥ۟۟ۡۡ:[F

.field public ۥ۟۟ۡۢ:[F

.field public ۥۣ۟۟ۡ:Z

.field public ۥ۟۟ۡۤ:Z

.field public ۥ۟۟ۡۥ:Z

.field public ۥ۟۟ۡۦ:Z

.field public ۥ۟۟ۡۧ:Z

.field public ۥ۟۟ۡۨ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v0

    sput v0, LYue/ۥ۟ۢۤ;->ۥۣ۟۟ۡ:I

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 4
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LYue/ۥ۟ۢۤ$ۥ;

    invoke-direct {v0}, LYue/ۥ۟ۢۤ$ۥ;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۢۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۢۤ$ۥ;

    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۤ:Landroid/view/animation/Interpolator;

    const/4 v0, 0x2

    new-array v1, v0, [F

    fill-array-data v1, :array_0

    iput-object v1, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۧ:[F

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    new-array v2, v0, [F

    fill-array-data v2, :array_1

    iput-object v2, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۨ:[F

    new-array v2, v0, [F

    fill-array-data v2, :array_2

    iput-object v2, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡ۠:[F

    new-array v2, v0, [F

    fill-array-data v2, :array_3

    iput-object v2, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡۡ:[F

    new-array v0, v0, [F

    fill-array-data v0, :array_4

    iput-object v0, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡۢ:[F

    iput-object p1, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۥ:Landroid/view/View;

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const v0, 0x44c4e000    # 1575.0f

    mul-float/2addr v0, p1

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v0, v2

    float-to-int v0, v0

    const v3, 0x439d8000    # 315.0f

    mul-float/2addr p1, v3

    add-float/2addr p1, v2

    float-to-int p1, p1

    int-to-float v0, v0

    invoke-virtual {p0, v0, v0}, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۡ(FF)LYue/ۥ۟ۢۤ;

    int-to-float p1, p1

    invoke-virtual {p0, p1, p1}, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۢ(FF)LYue/ۥ۟ۢۤ;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, LYue/ۥ۟ۢۤ;->ۥ۟۟۟ۨ(I)LYue/ۥ۟ۢۤ;

    invoke-virtual {p0, v1, v1}, LYue/ۥ۟ۢۤ;->ۥ۟۟۠۠(FF)LYue/ۥ۟ۢۤ;

    const p1, 0x3e4ccccd    # 0.2f

    invoke-virtual {p0, p1, p1}, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۥ(FF)LYue/ۥ۟ۢۤ;

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-virtual {p0, p1, p1}, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۦ(FF)LYue/ۥ۟ۢۤ;

    sget p1, LYue/ۥ۟ۢۤ;->ۥۣ۟۟ۡ:I

    invoke-virtual {p0, p1}, LYue/ۥ۟ۢۤ;->ۥ۟۟۟ۧ(I)LYue/ۥ۟ۢۤ;

    const/16 p1, 0x1f4

    invoke-virtual {p0, p1}, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۤ(I)LYue/ۥ۟ۢۤ;

    invoke-virtual {p0, p1}, LYue/ۥ۟ۢۤ;->ۥۣ۟۟۠(I)LYue/ۥ۟ۢۤ;

    return-void

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x7f7fffff    # Float.MAX_VALUE
        0x7f7fffff    # Float.MAX_VALUE
    .end array-data

    :array_2
    .array-data 4
        0x0
        0x0
    .end array-data

    :array_3
    .array-data 4
        0x0
        0x0
    .end array-data

    :array_4
    .array-data 4
        0x7f7fffff    # Float.MAX_VALUE
        0x7f7fffff    # Float.MAX_VALUE
    .end array-data
.end method

.method public static ۥ۟۟۟۟(FFF)F
    .locals 1

    cmpl-float v0, p0, p2

    if-lez v0, :cond_0

    return p2

    :cond_0
    cmpg-float p2, p0, p1

    if-gez p2, :cond_1

    return p1

    :cond_1
    return p0
.end method

.method public static ۥ۟۟۟۠(III)I
    .locals 0

    if-le p0, p2, :cond_0

    return p2

    :cond_0
    if-ge p0, p1, :cond_1

    return p1

    :cond_1
    return p0
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    iget-boolean v0, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡۧ:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v2, :cond_1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_3

    const/4 p1, 0x3

    if-eq v0, p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LYue/ۥ۟ۢۤ;->ۥ۟۟۟ۥ()V

    goto :goto_0

    :cond_2
    iput-boolean v2, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡۥ:Z

    iput-boolean v1, p0, LYue/ۥ۟ۢۤ;->ۥۣ۟۟ۡ:Z

    :cond_3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    iget-object v4, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۥ:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {p0, v1, v0, v3, v4}, LYue/ۥ۟ۢۤ;->ۥ۟۟۟(IFFF)F

    move-result v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    iget-object v3, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۥ:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p0, v2, p2, p1, v3}, LYue/ۥ۟ۢۤ;->ۥ۟۟۟(IFFF)F

    move-result p1

    iget-object p2, p0, LYue/ۥ۟ۢۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۢۤ$ۥ;

    invoke-virtual {p2, v0, p1}, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟ۦ(FF)V

    iget-boolean p1, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡۦ:Z

    if-nez p1, :cond_4

    invoke-virtual {p0}, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۧ()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۨ()V

    :cond_4
    :goto_0
    iget-boolean p1, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡۨ:Z

    if-eqz p1, :cond_5

    iget-boolean p1, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡۦ:Z

    if-eqz p1, :cond_5

    move v1, v2

    :cond_5
    return v1
.end method

.method public abstract ۥ(I)Z
.end method

.method public abstract ۥ۟(I)Z
.end method

.method public ۥ۟۟()V
    .locals 8

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x0

    move-wide v0, v2

    invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v0

    iget-object v1, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۥ:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    return-void
.end method

.method public final ۥ۟۟۟(IFFF)F
    .locals 3

    iget-object v0, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۧ:[F

    aget v0, v0, p1

    iget-object v1, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۨ:[F

    aget v1, v1, p1

    invoke-virtual {p0, v0, p3, v1, p2}, LYue/ۥ۟ۢۤ;->ۥ۟۟۟ۢ(FFFF)F

    move-result p2

    const/4 p3, 0x0

    cmpl-float v0, p2, p3

    if-nez v0, :cond_0

    return p3

    :cond_0
    iget-object p3, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡ۠:[F

    aget p3, p3, p1

    iget-object v1, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡۡ:[F

    aget v1, v1, p1

    iget-object v2, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡۢ:[F

    aget p1, v2, p1

    mul-float/2addr p3, p4

    if-lez v0, :cond_1

    mul-float/2addr p2, p3

    invoke-static {p2, v1, p1}, LYue/ۥ۟ۢۤ;->ۥ۟۟۟۟(FFF)F

    move-result p1

    return p1

    :cond_1
    neg-float p2, p2

    mul-float/2addr p2, p3

    invoke-static {p2, v1, p1}, LYue/ۥ۟ۢۤ;->ۥ۟۟۟۟(FFF)F

    move-result p1

    neg-float p1, p1

    return p1
.end method

.method public final ۥ۟۟۟ۡ(FF)F
    .locals 5

    const/4 v0, 0x0

    cmpl-float v1, p2, v0

    if-nez v1, :cond_0

    return v0

    :cond_0
    iget v1, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡ:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    cmpg-float v1, p1, v0

    if-gez v1, :cond_4

    neg-float p2, p2

    div-float/2addr p1, p2

    return p1

    :cond_2
    cmpg-float v3, p1, p2

    if-gez v3, :cond_4

    cmpl-float v3, p1, v0

    const/high16 v4, 0x3f800000    # 1.0f

    if-ltz v3, :cond_3

    div-float/2addr p1, p2

    sub-float/2addr v4, p1

    return v4

    :cond_3
    iget-boolean p1, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡۦ:Z

    if-eqz p1, :cond_4

    if-ne v1, v2, :cond_4

    return v4

    :cond_4
    :goto_0
    return v0
.end method

.method public final ۥ۟۟۟ۢ(FFFF)F
    .locals 1

    mul-float/2addr p1, p2

    const/4 v0, 0x0

    invoke-static {p1, v0, p3}, LYue/ۥ۟ۢۤ;->ۥ۟۟۟۟(FFF)F

    move-result p1

    invoke-virtual {p0, p4, p1}, LYue/ۥ۟ۢۤ;->ۥ۟۟۟ۡ(FF)F

    move-result p3

    sub-float/2addr p2, p4

    invoke-virtual {p0, p2, p1}, LYue/ۥ۟ۢۤ;->ۥ۟۟۟ۡ(FF)F

    move-result p1

    sub-float/2addr p1, p3

    cmpg-float p2, p1, v0

    if-gez p2, :cond_0

    iget-object p2, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۤ:Landroid/view/animation/Interpolator;

    neg-float p1, p1

    invoke-interface {p2, p1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result p1

    neg-float p1, p1

    goto :goto_0

    :cond_0
    cmpl-float p2, p1, v0

    if-lez p2, :cond_1

    iget-object p2, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۤ:Landroid/view/animation/Interpolator;

    invoke-interface {p2, p1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result p1

    :goto_0
    const/high16 p2, -0x40800000    # -1.0f

    const/high16 p3, 0x3f800000    # 1.0f

    invoke-static {p1, p2, p3}, LYue/ۥ۟ۢۤ;->ۥ۟۟۟۟(FFF)F

    move-result p1

    return p1

    :cond_1
    return v0
.end method

.method public ۥۣ۟۟۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡۧ:Z

    return v0
.end method

.method public ۥ۟۟۟ۤ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡۨ:Z

    return v0
.end method

.method public final ۥ۟۟۟ۥ()V
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡۤ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡۦ:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۢۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۢۤ$ۥ;

    invoke-virtual {v0}, LYue/ۥ۟ۢۤ$ۥ;->ۥۣ۟۟۟()V

    :goto_0
    return-void
.end method

.method public abstract ۥ۟۟۟ۦ(II)V
.end method

.method public ۥ۟۟۟ۧ(I)LYue/ۥ۟ۢۤ;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput p1, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡ۟:I

    return-object p0
.end method

.method public ۥ۟۟۟ۨ(I)LYue/ۥ۟ۢۤ;
    .locals 0
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iput p1, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡ:I

    return-object p0
.end method

.method public ۥ۟۟۠(Z)LYue/ۥ۟ۢۤ;
    .locals 1

    iget-boolean v0, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡۧ:Z

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    invoke-virtual {p0}, LYue/ۥ۟ۢۤ;->ۥ۟۟۟ۥ()V

    :cond_0
    iput-boolean p1, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡۧ:Z

    return-object p0
.end method

.method public ۥ۟۟۠۟(Z)LYue/ۥ۟ۢۤ;
    .locals 0

    iput-boolean p1, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡۨ:Z

    return-object p0
.end method

.method public ۥ۟۟۠۠(FF)LYue/ۥ۟ۢۤ;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۨ:[F

    const/4 v1, 0x0

    aput p1, v0, v1

    const/4 p1, 0x1

    aput p2, v0, p1

    return-object p0
.end method

.method public ۥ۟۟۠ۡ(FF)LYue/ۥ۟ۢۤ;
    .locals 3
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡۢ:[F

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr p1, v1

    const/4 v2, 0x0

    aput p1, v0, v2

    const/4 p1, 0x1

    div-float/2addr p2, v1

    aput p2, v0, p1

    return-object p0
.end method

.method public ۥ۟۟۠ۢ(FF)LYue/ۥ۟ۢۤ;
    .locals 3
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡۡ:[F

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr p1, v1

    const/4 v2, 0x0

    aput p1, v0, v2

    const/4 p1, 0x1

    div-float/2addr p2, v1

    aput p2, v0, p1

    return-object p0
.end method

.method public ۥۣ۟۟۠(I)LYue/ۥ۟ۢۤ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۢۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۢۤ$ۥ;

    invoke-virtual {v0, p1}, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟ۤ(I)V

    return-object p0
.end method

.method public ۥ۟۟۠ۤ(I)LYue/ۥ۟ۢۤ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۢۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۢۤ$ۥ;

    invoke-virtual {v0, p1}, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟ۥ(I)V

    return-object p0
.end method

.method public ۥ۟۟۠ۥ(FF)LYue/ۥ۟ۢۤ;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۧ:[F

    const/4 v1, 0x0

    aput p1, v0, v1

    const/4 p1, 0x1

    aput p2, v0, p1

    return-object p0
.end method

.method public ۥ۟۟۠ۦ(FF)LYue/ۥ۟ۢۤ;
    .locals 3
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡ۠:[F

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr p1, v1

    const/4 v2, 0x0

    aput p1, v0, v2

    const/4 p1, 0x1

    div-float/2addr p2, v1

    aput p2, v0, p1

    return-object p0
.end method

.method public ۥ۟۟۠ۧ()Z
    .locals 2

    iget-object v0, p0, LYue/ۥ۟ۢۤ;->ۥۣ۟۟۠:LYue/ۥ۟ۢۤ$ۥ;

    invoke-virtual {v0}, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟۠()I

    move-result v1

    invoke-virtual {v0}, LYue/ۥ۟ۢۤ$ۥ;->ۥ۟۟۟()I

    move-result v0

    if-eqz v1, :cond_0

    invoke-virtual {p0, v1}, LYue/ۥ۟ۢۤ;->ۥ۟(I)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, LYue/ۥ۟ۢۤ;->ۥ(I)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۥ۟۟۠ۨ()V
    .locals 6

    iget-object v0, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۦ:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥ۟ۢۤ$ۥ۟;

    invoke-direct {v0, p0}, LYue/ۥ۟ۢۤ$ۥ۟;-><init>(LYue/ۥ۟ۢۤ;)V

    iput-object v0, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۦ:Ljava/lang/Runnable;

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡۦ:Z

    iput-boolean v0, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡۤ:Z

    iget-boolean v1, p0, LYue/ۥ۟ۢۤ;->ۥۣ۟۟ۡ:Z

    if-nez v1, :cond_1

    iget v1, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟ۡ۟:I

    if-lez v1, :cond_1

    iget-object v2, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۥ:Landroid/view/View;

    iget-object v3, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۦ:Ljava/lang/Runnable;

    int-to-long v4, v1

    invoke-static {v2, v3, v4, v5}, LYue/ۥۢۤۤۦ;->ۥ۟۠۠۟(Landroid/view/View;Ljava/lang/Runnable;J)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, LYue/ۥ۟ۢۤ;->ۥ۟۟۠ۦ:Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    :goto_0
    iput-boolean v0, p0, LYue/ۥ۟ۢۤ;->ۥۣ۟۟ۡ:Z

    return-void
.end method
