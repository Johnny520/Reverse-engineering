.class public Landroidx/recyclerview/widget/LinearLayoutManager;
.super Lzl1;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljm1;


# instance fields
.field public final λ:I

.field public μ:Lbs0;

.field public final ν:Lр;

.field public final ξ:Z

.field public final ο:Z

.field public π:Z

.field public final ρ:Z

.field public final σ:[I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lzl1;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->λ:I

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ξ:Z

    .line 9
    .line 10
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ο:Z

    .line 11
    .line 12
    iput-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->π:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ρ:Z

    .line 15
    .line 16
    new-instance v1, Las0;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v1, v2}, Las0;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/4 v2, -0x1

    .line 23
    iput v2, v1, Las0;->β:I

    .line 24
    .line 25
    const/high16 v2, -0x80000000

    .line 26
    .line 27
    iput v2, v1, Las0;->γ:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    iput-boolean v2, v1, Las0;->δ:Z

    .line 31
    .line 32
    iput-boolean v2, v1, Las0;->ε:Z

    .line 33
    .line 34
    const/4 v1, 0x2

    .line 35
    new-array v1, v1, [I

    .line 36
    .line 37
    iput-object v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->σ:[I

    .line 38
    .line 39
    invoke-static {p1, p2, p3, p4}, Lzl1;->Α(Landroid/content/Context;Landroid/util/AttributeSet;II)Las0;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget p2, p1, Las0;->β:I

    .line 44
    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    if-ne p2, v0, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const-string p0, "invalid orientation:"

    .line 51
    .line 52
    invoke-static {p0, p2}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    throw p0

    .line 61
    :cond_1
    :goto_0
    const/4 p3, 0x0

    .line 62
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->β(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->λ:I

    .line 66
    .line 67
    if-ne p2, p4, :cond_2

    .line 68
    .line 69
    iget-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ν:Lр;

    .line 70
    .line 71
    if-nez p4, :cond_3

    .line 72
    .line 73
    :cond_2
    invoke-static {p0, p2}, Lр;->ε(Lzl1;I)Lр;

    .line 74
    .line 75
    .line 76
    move-result-object p4

    .line 77
    iput-object p4, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ν:Lр;

    .line 78
    .line 79
    iput p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->λ:I

    .line 80
    .line 81
    invoke-virtual {p0}, Lzl1;->Σ()V

    .line 82
    .line 83
    .line 84
    :cond_3
    iget-boolean p2, p1, Las0;->δ:Z

    .line 85
    .line 86
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->β(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-boolean p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ξ:Z

    .line 90
    .line 91
    if-ne p2, p3, :cond_4

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    iput-boolean p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ξ:Z

    .line 95
    .line 96
    invoke-virtual {p0}, Lzl1;->Σ()V

    .line 97
    .line 98
    .line 99
    :goto_1
    iget-boolean p1, p1, Las0;->ε:Z

    .line 100
    .line 101
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->и(Z)V

    .line 102
    .line 103
    .line 104
    return-void
.end method


# virtual methods
.method public final Δ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final Ε()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ξ:Z

    .line 2
    .line 3
    return p0
.end method

.method public final Ι(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final Κ(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Lzl1;->Κ(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-lez v0, :cond_2

    .line 9
    .line 10
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p0, v1, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->ж(IIZ)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    const/4 v0, -0x1

    .line 23
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    add-int/lit8 v3, v3, -0x1

    .line 31
    .line 32
    invoke-virtual {p0, v3, v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->ж(IIZ)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    if-nez p0, :cond_0

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Lam1;

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    throw v2

    .line 52
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Lam1;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    throw v2

    .line 62
    :cond_2
    return-void
.end method

.method public Λ(Lfm1;Lkm1;Lэ;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lzl1;->Λ(Lfm1;Lkm1;Lэ;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lzl1;->β:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final Μ()Landroid/os/Parcelable;
    .locals 4

    .line 1
    new-instance v0, Lcs0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-lez v1, :cond_3

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->г()V

    .line 13
    .line 14
    .line 15
    iget-boolean v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ο:Z

    .line 16
    .line 17
    iput-boolean v1, v0, Lcs0;->η:Z

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    add-int/lit8 v3, v1, -0x1

    .line 31
    .line 32
    :goto_0
    invoke-virtual {p0, v3}, Lzl1;->ρ(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ν:Lр;

    .line 37
    .line 38
    invoke-virtual {v3}, Lр;->λ()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ν:Lр;

    .line 43
    .line 44
    invoke-virtual {p0, v1}, Lр;->θ(Landroid/view/View;)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    sub-int/2addr v3, p0

    .line 49
    iput v3, v0, Lcs0;->ζ:I

    .line 50
    .line 51
    invoke-static {v1}, Lzl1;->ω(Landroid/view/View;)V

    .line 52
    .line 53
    .line 54
    throw v2

    .line 55
    :cond_1
    if-eqz v1, :cond_2

    .line 56
    .line 57
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    add-int/lit8 v3, v0, -0x1

    .line 62
    .line 63
    :cond_2
    invoke-virtual {p0, v3}, Lzl1;->ρ(I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0}, Lzl1;->ω(Landroid/view/View;)V

    .line 68
    .line 69
    .line 70
    throw v2

    .line 71
    :cond_3
    const/4 p0, -0x1

    .line 72
    iput p0, v0, Lcs0;->ε:I

    .line 73
    .line 74
    return-object v0
.end method

.method public Ξ(ILandroid/os/Bundle;)Z
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Lzl1;->Ξ(ILandroid/os/Bundle;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const v0, 0x1020037

    .line 10
    .line 11
    .line 12
    if-ne p1, v0, :cond_4

    .line 13
    .line 14
    if-eqz p2, :cond_4

    .line 15
    .line 16
    iget p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->λ:I

    .line 17
    .line 18
    const/4 v0, -0x1

    .line 19
    if-ne p1, v1, :cond_2

    .line 20
    .line 21
    const-string p1, "android.view.accessibility.action.ARGUMENT_ROW_INT"

    .line 22
    .line 23
    invoke-virtual {p2, p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-gez p1, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    iget-object p2, p0, Lzl1;->β:Landroidx/recyclerview/widget/RecyclerView;

    .line 31
    .line 32
    iget-object v0, p2, Landroidx/recyclerview/widget/RecyclerView;->ζ:Lfm1;

    .line 33
    .line 34
    iget-object p2, p2, Landroidx/recyclerview/widget/RecyclerView;->д:Lkm1;

    .line 35
    .line 36
    invoke-virtual {p0, v0, p2}, Lzl1;->Β(Lfm1;Lkm1;)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    sub-int/2addr p2, v1

    .line 41
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const-string p1, "android.view.accessibility.action.ARGUMENT_COLUMN_INT"

    .line 47
    .line 48
    invoke-virtual {p2, p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-gez p1, :cond_3

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    iget-object p2, p0, Lzl1;->β:Landroidx/recyclerview/widget/RecyclerView;

    .line 56
    .line 57
    iget-object v0, p2, Landroidx/recyclerview/widget/RecyclerView;->ζ:Lfm1;

    .line 58
    .line 59
    iget-object p2, p2, Landroidx/recyclerview/widget/RecyclerView;->д:Lkm1;

    .line 60
    .line 61
    invoke-virtual {p0, v0, p2}, Lzl1;->τ(Lfm1;Lkm1;)I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    sub-int/2addr p2, v1

    .line 66
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    :goto_0
    if-ltz p1, :cond_4

    .line 71
    .line 72
    invoke-virtual {p0}, Lzl1;->Σ()V

    .line 73
    .line 74
    .line 75
    return v1

    .line 76
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 77
    return p0
.end method

.method public Τ(ILfm1;Lkm1;)I
    .locals 3

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->λ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    return v2

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->з(ILfm1;Lkm1;)I

    .line 9
    .line 10
    .line 11
    return v2
.end method

.method public final Υ(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lzl1;->Σ()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public Φ(ILfm1;Lkm1;)I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->λ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->з(ILfm1;Lkm1;)I

    .line 8
    .line 9
    .line 10
    return v1
.end method

.method public final Ψ(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    .line 1
    new-instance v0, Lds0;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {v0, p1}, Lds0;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput p1, v0, Lds0;->α:I

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lzl1;->Ω(Lds0;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final α(I)Landroid/graphics/PointF;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    invoke-virtual {p0, p1}, Lzl1;->ρ(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Lzl1;->ω(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method public final β(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lzl1;->β:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->β(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final γ()Z
    .locals 0

    .line 1
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->λ:I

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final δ()Z
    .locals 1

    .line 1
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->λ:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final η(Lkm1;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->а(Lkm1;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public θ(Lkm1;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->б(Lkm1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public ι(Lkm1;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->в(Lkm1;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final κ(Lkm1;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->а(Lkm1;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public λ(Lkm1;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->б(Lkm1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public μ(Lkm1;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->в(Lkm1;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final ν()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, Lzl1;->ρ(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Lzl1;->ω(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0
.end method

.method public ξ()Lam1;
    .locals 1

    .line 1
    new-instance p0, Lam1;

    .line 2
    .line 3
    const/4 v0, -0x2

    .line 4
    invoke-direct {p0, v0, v0}, Lam1;-><init>(II)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public final а(Lkm1;)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->г()V

    .line 10
    .line 11
    .line 12
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ρ:Z

    .line 13
    .line 14
    xor-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->е(Z)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->д(Z)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    iget-boolean v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ρ:Z

    .line 25
    .line 26
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ν:Lр;

    .line 27
    .line 28
    move-object v5, p0

    .line 29
    move-object v1, p1

    .line 30
    invoke-static/range {v1 .. v6}, Lj81;->π(Lkm1;Lр;Landroid/view/View;Landroid/view/View;Lzl1;Z)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public final б(Lkm1;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->г()V

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ρ:Z

    .line 12
    .line 13
    xor-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->е(Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->д(Z)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p1}, Lkm1;->α()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Lam1;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    throw p0

    .line 51
    :cond_2
    :goto_0
    return-void
.end method

.method public final в(Lkm1;)I
    .locals 7

    .line 1
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->г()V

    .line 10
    .line 11
    .line 12
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ρ:Z

    .line 13
    .line 14
    xor-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->е(Z)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->д(Z)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    iget-boolean v6, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ρ:Z

    .line 25
    .line 26
    iget-object v2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ν:Lр;

    .line 27
    .line 28
    move-object v5, p0

    .line 29
    move-object v1, p1

    .line 30
    invoke-static/range {v1 .. v6}, Lj81;->ρ(Lkm1;Lр;Landroid/view/View;Landroid/view/View;Lzl1;Z)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public final г()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->μ:Lbs0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lbs0;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->μ:Lbs0;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final д(Z)Landroid/view/View;
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ο:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->ж(IIZ)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    add-int/lit8 v0, v0, -0x1

    .line 20
    .line 21
    const/4 v1, -0x1

    .line 22
    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->ж(IIZ)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final е(Z)Landroid/view/View;
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ο:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->ж(IIZ)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {p0, v0, v1, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->ж(IIZ)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final ж(IIZ)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->г()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x140

    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    const/16 p3, 0x6003

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move p3, v0

    .line 12
    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->λ:I

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    iget-object p0, p0, Lzl1;->γ:Lcw1;

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2, p3, v0}, Lcw1;->γ(IIII)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    iget-object p0, p0, Lzl1;->δ:Lcw1;

    .line 24
    .line 25
    invoke-virtual {p0, p1, p2, p3, v0}, Lcw1;->γ(IIII)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method public final з(ILfm1;Lkm1;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p2, :cond_9

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_5

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/LinearLayoutManager;->г()V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->μ:Lbs0;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/4 p2, -0x1

    .line 21
    const/4 v1, 0x1

    .line 22
    if-lez p1, :cond_1

    .line 23
    .line 24
    move v2, v1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v2, p2

    .line 27
    :goto_0
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->μ:Lbs0;

    .line 31
    .line 32
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ν:Lр;

    .line 33
    .line 34
    invoke-virtual {v3}, Lр;->ξ()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ν:Lр;

    .line 41
    .line 42
    invoke-virtual {v3}, Lр;->κ()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->μ:Lbs0;

    .line 50
    .line 51
    iput v2, p1, Lbs0;->α:I

    .line 52
    .line 53
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->σ:[I

    .line 54
    .line 55
    aput v0, p1, v0

    .line 56
    .line 57
    aput v0, p1, v1

    .line 58
    .line 59
    iget p3, p3, Lkm1;->α:I

    .line 60
    .line 61
    if-eq p3, p2, :cond_3

    .line 62
    .line 63
    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ν:Lр;

    .line 64
    .line 65
    invoke-virtual {p3}, Lр;->σ()I

    .line 66
    .line 67
    .line 68
    move-result p3

    .line 69
    goto :goto_1

    .line 70
    :cond_3
    move p3, v0

    .line 71
    :goto_1
    iget-object v3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->μ:Lbs0;

    .line 72
    .line 73
    iget v3, v3, Lbs0;->α:I

    .line 74
    .line 75
    if-ne v3, p2, :cond_4

    .line 76
    .line 77
    move p2, v0

    .line 78
    goto :goto_2

    .line 79
    :cond_4
    move p2, p3

    .line 80
    move p3, v0

    .line 81
    :goto_2
    aput p3, p1, v0

    .line 82
    .line 83
    aput p2, p1, v1

    .line 84
    .line 85
    invoke-static {v0, p3}, Ljava/lang/Math;->max(II)I

    .line 86
    .line 87
    .line 88
    aget p1, p1, v1

    .line 89
    .line 90
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 91
    .line 92
    .line 93
    if-ne v2, v1, :cond_5

    .line 94
    .line 95
    move p1, v1

    .line 96
    goto :goto_3

    .line 97
    :cond_5
    move p1, v0

    .line 98
    :goto_3
    iget-object p2, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->μ:Lbs0;

    .line 99
    .line 100
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    const/4 p2, 0x0

    .line 104
    if-eqz p1, :cond_7

    .line 105
    .line 106
    iget-object p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ν:Lр;

    .line 107
    .line 108
    invoke-virtual {p1}, Lр;->μ()I

    .line 109
    .line 110
    .line 111
    iget-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ο:Z

    .line 112
    .line 113
    if-eqz p1, :cond_6

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_6
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    add-int/lit8 v0, p1, -0x1

    .line 121
    .line 122
    :goto_4
    invoke-virtual {p0, v0}, Lzl1;->ρ(I)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->μ:Lbs0;

    .line 127
    .line 128
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-static {p1}, Lzl1;->ω(Landroid/view/View;)V

    .line 132
    .line 133
    .line 134
    throw p2

    .line 135
    :cond_7
    iget-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ο:Z

    .line 136
    .line 137
    if-eqz p1, :cond_8

    .line 138
    .line 139
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    add-int/lit8 v0, p1, -0x1

    .line 144
    .line 145
    :cond_8
    invoke-virtual {p0, v0}, Lzl1;->ρ(I)Landroid/view/View;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->μ:Lbs0;

    .line 150
    .line 151
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    iget-object p3, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->ν:Lр;

    .line 155
    .line 156
    invoke-virtual {p3}, Lр;->π()I

    .line 157
    .line 158
    .line 159
    iget-object p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->μ:Lbs0;

    .line 160
    .line 161
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-static {p1}, Lzl1;->ω(Landroid/view/View;)V

    .line 165
    .line 166
    .line 167
    throw p2

    .line 168
    :cond_9
    :goto_5
    return v0
.end method

.method public и(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->β(Ljava/lang/String;)V

    .line 3
    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->π:Z

    .line 6
    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput-boolean p1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->π:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Lzl1;->Σ()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
