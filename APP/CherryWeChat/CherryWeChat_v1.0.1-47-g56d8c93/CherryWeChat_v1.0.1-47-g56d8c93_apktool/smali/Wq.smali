.class public final LWq;
.super LPj;
.source ""


# instance fields
.field public final g:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LWq;->g:I

    return-void
.end method


# virtual methods
.method public final o(Lcy;)F
    .locals 1

    check-cast p1, LXq;

    iget-object p1, p1, LXq;->B:[F

    if-eqz p1, :cond_0

    iget v0, p0, LWq;->g:I

    aget p1, p1, v0

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final z(Lcy;F)V
    .locals 3

    check-cast p1, LXq;

    iget-object v0, p1, LXq;->B:[F

    if-eqz v0, :cond_1

    iget v1, p0, LWq;->g:I

    aget v2, v0, v1

    cmpl-float v2, v2, p2

    if-eqz v2, :cond_1

    aput p2, v0, v1

    iget-object p2, p1, LXq;->D:Lrl;

    if-eqz p2, :cond_0

    invoke-virtual {p1}, LXq;->h()F

    move-result v0

    iget-object p2, p2, Lrl;->b:Ljava/lang/Object;

    check-cast p2, Lcom/google/android/material/button/MaterialButton;

    const v1, 0x3de147ae    # 0.11f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iget v1, p2, Lcom/google/android/material/button/MaterialButton;->x:I

    if-eq v1, v0, :cond_0

    iput v0, p2, Lcom/google/android/material/button/MaterialButton;->x:I

    invoke-virtual {p2}, Lcom/google/android/material/button/MaterialButton;->j()V

    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    :cond_0
    invoke-virtual {p1}, LXq;->invalidateSelf()V

    :cond_1
    return-void
.end method
