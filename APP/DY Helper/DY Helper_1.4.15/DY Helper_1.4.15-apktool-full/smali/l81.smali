.class public final Ll81;
.super Lр;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic γ:I


# direct methods
.method public constructor <init>(Lzl1;I)V
    .locals 0

    .line 1
    iput p2, p0, Ll81;->γ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p2, Landroid/graphics/Rect;

    .line 7
    .line 8
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lр;->β:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p1, p0, Lр;->α:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final θ(Landroid/view/View;)I
    .locals 1

    .line 1
    iget v0, p0, Ll81;->γ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lam1;

    .line 11
    .line 12
    iget-object p0, p0, Lр;->α:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lzl1;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lam1;

    .line 28
    .line 29
    iget-object p1, p1, Lam1;->α:Landroid/graphics/Rect;

    .line 30
    .line 31
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 32
    .line 33
    add-int/2addr p0, p1

    .line 34
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 35
    .line 36
    :goto_0
    add-int/2addr p0, p1

    .line 37
    return p0

    .line 38
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lam1;

    .line 43
    .line 44
    iget-object p0, p0, Lр;->α:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Lzl1;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Lam1;

    .line 60
    .line 61
    iget-object p1, p1, Lam1;->α:Landroid/graphics/Rect;

    .line 62
    .line 63
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 64
    .line 65
    add-int/2addr p0, p1

    .line 66
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ι(Landroid/view/View;)I
    .locals 1

    .line 1
    iget v0, p0, Ll81;->γ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lam1;

    .line 11
    .line 12
    iget-object p0, p0, Lр;->α:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lzl1;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lam1;

    .line 28
    .line 29
    iget-object p1, p1, Lam1;->α:Landroid/graphics/Rect;

    .line 30
    .line 31
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 32
    .line 33
    sub-int/2addr p0, p1

    .line 34
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 35
    .line 36
    :goto_0
    sub-int/2addr p0, p1

    .line 37
    return p0

    .line 38
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lam1;

    .line 43
    .line 44
    iget-object p0, p0, Lр;->α:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Lzl1;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Lam1;

    .line 60
    .line 61
    iget-object p1, p1, Lam1;->α:Landroid/graphics/Rect;

    .line 62
    .line 63
    iget p1, p1, Landroid/graphics/Rect;->left:I

    .line 64
    .line 65
    sub-int/2addr p0, p1

    .line 66
    iget p1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final κ()I
    .locals 1

    .line 1
    iget v0, p0, Ll81;->γ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lр;->α:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lzl1;

    .line 9
    .line 10
    iget p0, p0, Lzl1;->κ:I

    .line 11
    .line 12
    return p0

    .line 13
    :pswitch_0
    iget-object p0, p0, Lр;->α:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lzl1;

    .line 16
    .line 17
    iget p0, p0, Lzl1;->ι:I

    .line 18
    .line 19
    return p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final λ()I
    .locals 1

    .line 1
    iget v0, p0, Ll81;->γ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lр;->α:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lzl1;

    .line 9
    .line 10
    iget v0, p0, Lzl1;->κ:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lzl1;->υ()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    :goto_0
    sub-int/2addr v0, p0

    .line 17
    return v0

    .line 18
    :pswitch_0
    iget-object p0, p0, Lр;->α:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lzl1;

    .line 21
    .line 22
    iget v0, p0, Lzl1;->ι:I

    .line 23
    .line 24
    invoke-virtual {p0}, Lzl1;->χ()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    goto :goto_0

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final μ()I
    .locals 1

    .line 1
    iget v0, p0, Ll81;->γ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lр;->α:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lzl1;

    .line 9
    .line 10
    invoke-virtual {p0}, Lzl1;->υ()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    iget-object p0, p0, Lр;->α:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lzl1;

    .line 18
    .line 19
    invoke-virtual {p0}, Lzl1;->χ()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ξ()I
    .locals 1

    .line 1
    iget v0, p0, Ll81;->γ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lр;->α:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lzl1;

    .line 9
    .line 10
    iget p0, p0, Lzl1;->θ:I

    .line 11
    .line 12
    return p0

    .line 13
    :pswitch_0
    iget-object p0, p0, Lр;->α:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lzl1;

    .line 16
    .line 17
    iget p0, p0, Lzl1;->η:I

    .line 18
    .line 19
    return p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final π()I
    .locals 1

    .line 1
    iget v0, p0, Ll81;->γ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lр;->α:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lzl1;

    .line 9
    .line 10
    invoke-virtual {p0}, Lzl1;->ψ()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    iget-object p0, p0, Lр;->α:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lzl1;

    .line 18
    .line 19
    invoke-virtual {p0}, Lzl1;->φ()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final σ()I
    .locals 2

    .line 1
    iget v0, p0, Ll81;->γ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lр;->α:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lzl1;

    .line 9
    .line 10
    iget v0, p0, Lzl1;->κ:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lzl1;->ψ()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    sub-int/2addr v0, v1

    .line 17
    invoke-virtual {p0}, Lzl1;->υ()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    :goto_0
    sub-int/2addr v0, p0

    .line 22
    return v0

    .line 23
    :pswitch_0
    iget-object p0, p0, Lр;->α:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lzl1;

    .line 26
    .line 27
    iget v0, p0, Lzl1;->ι:I

    .line 28
    .line 29
    invoke-virtual {p0}, Lzl1;->φ()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    sub-int/2addr v0, v1

    .line 34
    invoke-virtual {p0}, Lzl1;->χ()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    goto :goto_0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final τ(Landroid/view/View;)I
    .locals 1

    .line 1
    iget v0, p0, Ll81;->γ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lр;->α:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lzl1;

    .line 9
    .line 10
    iget-object p0, p0, Lр;->β:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Landroid/graphics/Rect;

    .line 13
    .line 14
    invoke-virtual {v0, p0, p1}, Lzl1;->Γ(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    .line 18
    .line 19
    return p0

    .line 20
    :pswitch_0
    iget-object v0, p0, Lр;->α:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lzl1;

    .line 23
    .line 24
    iget-object p0, p0, Lр;->β:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Landroid/graphics/Rect;

    .line 27
    .line 28
    invoke-virtual {v0, p0, p1}, Lzl1;->Γ(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 29
    .line 30
    .line 31
    iget p0, p0, Landroid/graphics/Rect;->right:I

    .line 32
    .line 33
    return p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final υ(Landroid/view/View;)I
    .locals 1

    .line 1
    iget v0, p0, Ll81;->γ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lр;->α:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lzl1;

    .line 9
    .line 10
    iget-object p0, p0, Lр;->β:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Landroid/graphics/Rect;

    .line 13
    .line 14
    invoke-virtual {v0, p0, p1}, Lzl1;->Γ(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    iget p0, p0, Landroid/graphics/Rect;->top:I

    .line 18
    .line 19
    return p0

    .line 20
    :pswitch_0
    iget-object v0, p0, Lр;->α:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lzl1;

    .line 23
    .line 24
    iget-object p0, p0, Lр;->β:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Landroid/graphics/Rect;

    .line 27
    .line 28
    invoke-virtual {v0, p0, p1}, Lzl1;->Γ(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 29
    .line 30
    .line 31
    iget p0, p0, Landroid/graphics/Rect;->left:I

    .line 32
    .line 33
    return p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final φ(I)V
    .locals 1

    .line 1
    iget v0, p0, Ll81;->γ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lр;->α:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lzl1;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lzl1;->Η(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object p0, p0, Lр;->α:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lzl1;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lzl1;->Ζ(I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
