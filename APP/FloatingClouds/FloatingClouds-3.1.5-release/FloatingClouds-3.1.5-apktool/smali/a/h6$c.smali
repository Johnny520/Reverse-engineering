.class public final La/h6$c;
.super La/J;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/h6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field public final synthetic b:La/h6;


# direct methods
.method public constructor <init>(La/h6;)V
    .locals 0

    iput-object p1, p0, La/h6$c;->b:La/h6;

    invoke-direct {p0}, La/J;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)La/I;
    .locals 1

    iget-object v0, p0, La/h6$c;->b:La/h6;

    invoke-virtual {v0, p1}, La/h6;->n(I)La/I;

    move-result-object p1

    iget-object p1, p1, La/I;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    invoke-static {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->obtain(Landroid/view/accessibility/AccessibilityNodeInfo;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    new-instance v0, La/I;

    invoke-direct {v0, p1}, La/I;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    return-object v0
.end method

.method public final b(I)La/I;
    .locals 2

    const/4 v0, 0x2

    iget-object v1, p0, La/h6$c;->b:La/h6;

    if-ne p1, v0, :cond_0

    iget p1, v1, La/h6;->k:I

    goto :goto_0

    :cond_0
    iget p1, v1, La/h6;->l:I

    :goto_0
    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p0, p1}, La/h6$c;->a(I)La/I;

    move-result-object p1

    return-object p1
.end method

.method public final c(IILandroid/os/Bundle;)Z
    .locals 6

    iget-object v0, p0, La/h6$c;->b:La/h6;

    iget-object v1, v0, La/h6;->i:Lcom/google/android/material/chip/Chip;

    const/4 v2, -0x1

    if-eq p1, v2, :cond_b

    const/4 p3, 0x1

    if-eq p2, p3, :cond_a

    const/4 v2, 0x2

    if-eq p2, v2, :cond_9

    const/16 v2, 0x40

    const/high16 v3, 0x10000

    const/high16 v4, -0x80000000

    const/4 v5, 0x0

    if-eq p2, v2, :cond_5

    const/16 v2, 0x80

    if-eq p2, v2, :cond_3

    check-cast v0, Lcom/google/android/material/chip/Chip$b;

    const/16 v1, 0x10

    if-ne p2, v1, :cond_2

    iget-object p2, v0, Lcom/google/android/material/chip/Chip$b;->q:Lcom/google/android/material/chip/Chip;

    if-nez p1, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->performClick()Z

    move-result p1

    return p1

    :cond_0
    if-ne p1, p3, :cond_2

    invoke-virtual {p2, v5}, Landroid/view/View;->playSoundEffect(I)V

    iget-object p1, p2, Lcom/google/android/material/chip/Chip;->h:Landroid/view/View$OnClickListener;

    if-eqz p1, :cond_1

    invoke-interface {p1, p2}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    move v5, p3

    :cond_1
    iget-boolean p1, p2, Lcom/google/android/material/chip/Chip;->s:Z

    if-eqz p1, :cond_2

    iget-object p1, p2, Lcom/google/android/material/chip/Chip;->r:Lcom/google/android/material/chip/Chip$b;

    invoke-virtual {p1, p3, p3}, La/h6;->q(II)V

    :cond_2
    return v5

    :cond_3
    iget p2, v0, La/h6;->k:I

    if-ne p2, p1, :cond_4

    iput v4, v0, La/h6;->k:I

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    invoke-virtual {v0, p1, v3}, La/h6;->q(II)V

    return p3

    :cond_4
    return v5

    :cond_5
    iget-object p2, v0, La/h6;->h:Landroid/view/accessibility/AccessibilityManager;

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result p2

    if-nez p2, :cond_6

    goto :goto_0

    :cond_6
    iget p2, v0, La/h6;->k:I

    if-eq p2, p1, :cond_8

    if-eq p2, v4, :cond_7

    iput v4, v0, La/h6;->k:I

    iget-object v2, v0, La/h6;->i:Lcom/google/android/material/chip/Chip;

    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    invoke-virtual {v0, p2, v3}, La/h6;->q(II)V

    :cond_7
    iput p1, v0, La/h6;->k:I

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    const p2, 0x8000

    invoke-virtual {v0, p1, p2}, La/h6;->q(II)V

    return p3

    :cond_8
    :goto_0
    return v5

    :cond_9
    invoke-virtual {v0, p1}, La/h6;->j(I)Z

    move-result p1

    return p1

    :cond_a
    invoke-virtual {v0, p1}, La/h6;->p(I)Z

    move-result p1

    return p1

    :cond_b
    sget-object p1, La/ug;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p2, p3}, Landroid/view/View;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method
