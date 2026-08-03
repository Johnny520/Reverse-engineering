.class Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;
.super LYue/ۥۢۥۣۥ$ۥ۟;
.source "SourceFile"


# instance fields
.field private startTranslationY:I

.field private startY:I

.field private final tmpLocation:[I

.field private final view:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LYue/ۥۢۥۣۥ$ۥ۟;-><init>(I)V

    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->tmpLocation:[I

    iput-object p1, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->view:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public onEnd(LYue/ۥۢۥۣۥ;)V
    .locals 1
    .param p1    # LYue/ۥۢۥۣۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object p1, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->view:Landroid/view/View;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public onPrepare(LYue/ۥۢۥۣۥ;)V
    .locals 1
    .param p1    # LYue/ۥۢۥۣۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object p1, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->view:Landroid/view/View;

    iget-object v0, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->tmpLocation:[I

    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object p1, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->tmpLocation:[I

    const/4 v0, 0x1

    aget p1, p1, v0

    iput p1, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->startY:I

    return-void
.end method

.method public onProgress(LYue/ۥۢۥۦ;Ljava/util/List;)LYue/ۥۢۥۦ;
    .locals 3
    .param p1    # LYue/ۥۢۥۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e2\u06e5\u06e6;",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06e5\u06e3\u06e5;",
            ">;)",
            "LYue/\u06e5\u06e2\u06e5\u06e6;"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢۥۣۥ;

    invoke-virtual {v0}, LYue/ۥۢۥۣۥ;->ۥ۟۟۟۠()I

    move-result v1

    invoke-static {}, LYue/ۥۢۥۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟()I

    move-result v2

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->startTranslationY:I

    const/4 v1, 0x0

    invoke-virtual {v0}, LYue/ۥۢۥۣۥ;->ۥ۟۟۟()F

    move-result v0

    invoke-static {p2, v1, v0}, Lcom/google/android/material/animation/AnimationUtils;->lerp(IIF)I

    move-result p2

    int-to-float p2, p2

    iget-object v0, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->view:Landroid/view/View;

    invoke-virtual {v0, p2}, Landroid/view/View;->setTranslationY(F)V

    :cond_1
    return-object p1
.end method

.method public onStart(LYue/ۥۢۥۣۥ;LYue/ۥۢۥۣۥ$ۥ;)LYue/ۥۢۥۣۥ$ۥ;
    .locals 1
    .param p1    # LYue/ۥۢۥۣۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۢۥۣۥ$ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object p1, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->view:Landroid/view/View;

    iget-object v0, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->tmpLocation:[I

    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object p1, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->tmpLocation:[I

    const/4 v0, 0x1

    aget p1, p1, v0

    iget v0, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->startY:I

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->startTranslationY:I

    iget-object p1, p0, Lcom/google/android/material/bottomsheet/InsetsAnimationCallback;->view:Landroid/view/View;

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    return-object p2
.end method
