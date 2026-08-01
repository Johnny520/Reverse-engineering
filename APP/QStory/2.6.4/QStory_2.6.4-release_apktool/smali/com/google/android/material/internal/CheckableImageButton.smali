.class public Lcom/google/android/material/internal/CheckableImageButton;
.super Landroidx/appcompat/widget/飘花落叶言子世楪兰哲苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/widget/Checkable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/internal/CheckableImageButton$SavedState;
    }
.end annotation


# static fields
.field public static final 飘花落叶言子楪兰哲世苏:[I


# instance fields
.field public 飘花落叶言子楪兰世哲苏:Z

.field public 飘花落叶言子楪兰世苏哲:Z

.field public 飘花落叶言子楪兰苏世哲:Z

.field public 飘花落叶言子楪兰苏哲世:Lcom/google/android/material/internal/飘花落叶言子楪世哲苏兰;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const v0, 0x10100a0

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lcom/google/android/material/internal/CheckableImageButton;->飘花落叶言子楪兰哲世苏:[I

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    const v0, 0x240402ef

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/飘花落叶言子世楪兰哲苏;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lcom/google/android/material/internal/CheckableImageButton;->飘花落叶言子楪兰世哲苏:Z

    .line 9
    .line 10
    iput-boolean p1, p0, Lcom/google/android/material/internal/CheckableImageButton;->飘花落叶言子楪兰苏世哲:Z

    .line 11
    .line 12
    new-instance p1, Lcom/google/android/material/button/飘花落叶言子楪苏哲世兰;

    .line 13
    .line 14
    const/4 p2, 0x2

    .line 15
    invoke-direct {p1, p0, p2}, Lcom/google/android/material/button/飘花落叶言子楪苏哲世兰;-><init>(Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, p1}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲苏兰世(Landroid/view/View;Landroidx/core/view/飘花落叶言子楪世苏兰哲;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final isChecked()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/android/material/internal/CheckableImageButton;->飘花落叶言子楪兰世苏哲:Z

    .line 2
    .line 3
    return p0
.end method

.method public final onCreateDrawableState(I)[I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/internal/CheckableImageButton;->飘花落叶言子楪兰世苏哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    add-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/view/View;->onCreateDrawableState(I)[I

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object p1, Lcom/google/android/material/internal/CheckableImageButton;->飘花落叶言子楪兰哲世苏:[I

    .line 12
    .line 13
    invoke-static {p0, p1}, Landroid/view/View;->mergeDrawableStates([I[I)[I

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onCreateDrawableState(I)[I

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/google/android/material/internal/CheckableImageButton;->飘花落叶言子楪兰苏哲世:Lcom/google/android/material/internal/飘花落叶言子楪世哲苏兰;

    .line 3
    .line 4
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/google/android/material/internal/CheckableImageButton$SavedState;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, Lcom/google/android/material/internal/CheckableImageButton$SavedState;

    .line 10
    .line 11
    iget-object v0, p1, Landroidx/customview/view/AbsSavedState;->飘花落叶言子楪哲苏兰世:Landroid/os/Parcelable;

    .line 12
    .line 13
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    iget-boolean p1, p1, Lcom/google/android/material/internal/CheckableImageButton$SavedState;->飘花落叶言子楪哲兰苏世:Z

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/google/android/material/internal/CheckableImageButton;->setChecked(Z)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/google/android/material/internal/CheckableImageButton$SavedState;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Landroidx/customview/view/AbsSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    iget-boolean p0, p0, Lcom/google/android/material/internal/CheckableImageButton;->飘花落叶言子楪兰世苏哲:Z

    .line 11
    .line 12
    iput-boolean p0, v1, Lcom/google/android/material/internal/CheckableImageButton$SavedState;->飘花落叶言子楪哲兰苏世:Z

    .line 13
    .line 14
    return-object v1
.end method

.method public setCheckable(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/internal/CheckableImageButton;->飘花落叶言子楪兰世哲苏:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/google/android/material/internal/CheckableImageButton;->飘花落叶言子楪兰世哲苏:Z

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-virtual {p0, p1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setChecked(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/internal/CheckableImageButton;->飘花落叶言子楪兰世哲苏:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/google/android/material/internal/CheckableImageButton;->飘花落叶言子楪兰世苏哲:Z

    .line 6
    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    iput-boolean p1, p0, Lcom/google/android/material/internal/CheckableImageButton;->飘花落叶言子楪兰世苏哲:Z

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 12
    .line 13
    .line 14
    const/16 p1, 0x800

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public setFocusable(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->setFocusable(Z)V

    .line 6
    .line 7
    .line 8
    if-eq v0, p1, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Lcom/google/android/material/internal/CheckableImageButton;->飘花落叶言子楪兰苏哲世:Lcom/google/android/material/internal/飘花落叶言子楪世哲苏兰;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-interface {p0}, Lcom/google/android/material/internal/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public setOnFocusableChangedListener(Lcom/google/android/material/internal/飘花落叶言子楪世哲苏兰;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/internal/CheckableImageButton;->飘花落叶言子楪兰苏哲世:Lcom/google/android/material/internal/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    return-void
.end method

.method public setPressable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/internal/CheckableImageButton;->飘花落叶言子楪兰苏世哲:Z

    .line 2
    .line 3
    return-void
.end method

.method public setPressed(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/internal/CheckableImageButton;->飘花落叶言子楪兰苏世哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->setPressed(Z)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final toggle()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/internal/CheckableImageButton;->飘花落叶言子楪兰世苏哲:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/google/android/material/internal/CheckableImageButton;->setChecked(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
