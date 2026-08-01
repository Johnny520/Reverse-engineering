.class public Landroidx/recyclerview/widget/GridLayoutManager;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final ψ:Ljava/util/Set;


# instance fields
.field public final τ:I

.field public υ:[I

.field public φ:[Landroid/view/View;

.field public final χ:Ln;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/16 v2, 0x42

    .line 10
    .line 11
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/16 v3, 0x21

    .line 16
    .line 17
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/16 v4, 0x82

    .line 22
    .line 23
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    filled-new-array {v1, v2, v3, v4}, [Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, Landroidx/recyclerview/widget/GridLayoutManager;->ψ:Ljava/util/Set;

    .line 43
    .line 44
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->τ:I

    .line 6
    .line 7
    new-instance v0, Landroid/util/SparseIntArray;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v0, Landroid/util/SparseIntArray;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance v0, Ln;

    .line 18
    .line 19
    const/16 v1, 0x14

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ln;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->χ:Ln;

    .line 25
    .line 26
    new-instance v1, Landroid/graphics/Rect;

    .line 27
    .line 28
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-static {p1, p2, p3, p4}, Lzl1;->Α(Landroid/content/Context;Landroid/util/AttributeSet;II)Las0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget p1, p1, Las0;->γ:I

    .line 36
    .line 37
    iget p2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->τ:I

    .line 38
    .line 39
    if-ne p1, p2, :cond_0

    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    const/4 p2, 0x1

    .line 43
    if-lt p1, p2, :cond_1

    .line 44
    .line 45
    iput p1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->τ:I

    .line 46
    .line 47
    iget-object p1, v0, Ln;->ζ:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Landroid/util/SparseIntArray;

    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->clear()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lzl1;->Σ()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    const-string p0, "Span count should be at least 1. Provided "

    .line 59
    .line 60
    invoke-static {p0, p1}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    throw p0
.end method


# virtual methods
.method public final Β(Lfm1;Lkm1;)I
    .locals 3

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->λ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object p1, p0, Lzl1;->β:Landroidx/recyclerview/widget/RecyclerView;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ltl1;

    .line 11
    .line 12
    .line 13
    :cond_0
    iget p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->τ:I

    .line 14
    .line 15
    invoke-static {p0, v1}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_1
    invoke-virtual {p2}, Lkm1;->α()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, 0x1

    .line 25
    if-ge v0, v2, :cond_2

    .line 26
    .line 27
    return v1

    .line 28
    :cond_2
    invoke-virtual {p2}, Lkm1;->α()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    sub-int/2addr v0, v2

    .line 33
    invoke-virtual {p0, v0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->к(ILfm1;Lkm1;)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    add-int/2addr p0, v2

    .line 38
    return p0
.end method

.method public final Λ(Lfm1;Lkm1;Lэ;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->Λ(Lfm1;Lkm1;Lэ;)V

    .line 2
    .line 3
    .line 4
    const-class p1, Landroid/widget/GridView;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p3, p1}, Lэ;->η(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lzl1;->β:Landroidx/recyclerview/widget/RecyclerView;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final Ξ(ILandroid/os/Bundle;)Z
    .locals 4

    .line 1
    sget-object v0, Lч;->λ:Lч;

    .line 2
    .line 3
    iget-object v0, v0, Lч;->α:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->getId()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, -0x1

    .line 14
    if-ne p1, v0, :cond_5

    .line 15
    .line 16
    if-eq p1, v3, :cond_5

    .line 17
    .line 18
    move p1, v2

    .line 19
    :goto_0
    invoke-virtual {p0}, Lzl1;->σ()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-ge p1, v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lzl1;->ρ(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/view/View;->isAccessibilityFocused()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lzl1;->ρ(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    :goto_1
    if-nez v1, :cond_2

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    if-nez p2, :cond_3

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    const-string p1, "android.view.accessibility.action.ARGUMENT_DIRECTION_INT"

    .line 53
    .line 54
    invoke-virtual {p2, p1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    sget-object p2, Landroidx/recyclerview/widget/GridLayoutManager;->ψ:Ljava/util/Set;

    .line 59
    .line 60
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_4

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    iget-object p0, p0, Lzl1;->β:Landroidx/recyclerview/widget/RecyclerView;

    .line 72
    .line 73
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->ρ(Landroid/view/View;)V

    .line 74
    .line 75
    .line 76
    return v2

    .line 77
    :cond_5
    const v0, 0x1020037

    .line 78
    .line 79
    .line 80
    if-ne p1, v0, :cond_8

    .line 81
    .line 82
    if-eqz p2, :cond_8

    .line 83
    .line 84
    const-string p1, "android.view.accessibility.action.ARGUMENT_ROW_INT"

    .line 85
    .line 86
    invoke-virtual {p2, p1, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    const-string v0, "android.view.accessibility.action.ARGUMENT_COLUMN_INT"

    .line 91
    .line 92
    invoke-virtual {p2, v0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    if-eq p1, v3, :cond_7

    .line 97
    .line 98
    if-ne p2, v3, :cond_6

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_6
    iget-object p0, p0, Lzl1;->β:Landroidx/recyclerview/widget/RecyclerView;

    .line 102
    .line 103
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    throw v1

    .line 107
    :cond_7
    :goto_2
    return v2

    .line 108
    :cond_8
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->Ξ(ILandroid/os/Bundle;)Z

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    return p0
.end method

.method public final Τ(ILfm1;Lkm1;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->л()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->й()V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->Τ(ILfm1;Lkm1;)I

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public final Φ(ILfm1;Lkm1;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->л()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/GridLayoutManager;->й()V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/LinearLayoutManager;->Φ(ILfm1;Lkm1;)I

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public final ε(Lam1;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Lcb0;

    .line 2
    .line 3
    return p0
.end method

.method public final θ(Lkm1;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->б(Lkm1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final ι(Lkm1;)I
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

.method public final λ(Lkm1;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->б(Lkm1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final μ(Lkm1;)I
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

.method public final ξ()Lam1;
    .locals 2

    .line 1
    iget p0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->λ:I

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    const/4 v1, -0x2

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    new-instance p0, Lcb0;

    .line 8
    .line 9
    invoke-direct {p0, v1, v0}, Lam1;-><init>(II)V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance p0, Lcb0;

    .line 14
    .line 15
    invoke-direct {p0, v0, v1}, Lam1;-><init>(II)V

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final ο(Landroid/content/Context;Landroid/util/AttributeSet;)Lam1;
    .locals 0

    .line 1
    new-instance p0, Lcb0;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lam1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final π(Landroid/view/ViewGroup$LayoutParams;)Lam1;
    .locals 0

    .line 1
    instance-of p0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    new-instance p0, Lcb0;

    .line 6
    .line 7
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lam1;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance p0, Lcb0;

    .line 14
    .line 15
    invoke-direct {p0, p1}, Lam1;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public final τ(Lfm1;Lkm1;)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget v1, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->λ:I

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    if-ne v1, v2, :cond_1

    .line 6
    .line 7
    iget-object p1, p0, Lzl1;->β:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ltl1;

    .line 12
    .line 13
    .line 14
    :cond_0
    iget p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->τ:I

    .line 15
    .line 16
    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :cond_1
    invoke-virtual {p2}, Lkm1;->α()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-ge v1, v2, :cond_2

    .line 26
    .line 27
    return v0

    .line 28
    :cond_2
    invoke-virtual {p2}, Lkm1;->α()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    sub-int/2addr v0, v2

    .line 33
    invoke-virtual {p0, v0, p1, p2}, Landroidx/recyclerview/widget/GridLayoutManager;->к(ILfm1;Lkm1;)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    add-int/2addr p0, v2

    .line 38
    return p0
.end method

.method public final и(Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->и(Z)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 9
    .line 10
    const-string p1, "GridLayoutManager does not support stack from end. Consider using reverse layout"

    .line 11
    .line 12
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p0
.end method

.method public final й()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->φ:[Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    iget v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->τ:I

    .line 7
    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    return-void

    .line 12
    :cond_1
    :goto_0
    iget v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->τ:I

    .line 13
    .line 14
    new-array v0, v0, [Landroid/view/View;

    .line 15
    .line 16
    iput-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->φ:[Landroid/view/View;

    .line 17
    .line 18
    return-void
.end method

.method public final к(ILfm1;Lkm1;)I
    .locals 2

    .line 1
    iget-boolean p3, p3, Lkm1;->δ:Z

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->χ:Ln;

    .line 4
    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->τ:I

    .line 11
    .line 12
    invoke-static {p1, p0}, Ln;->φ(II)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    iget-object p2, p2, Lfm1;->ζ:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    iget-object p3, p2, Landroidx/recyclerview/widget/RecyclerView;->д:Lkm1;

    .line 20
    .line 21
    if-ltz p1, :cond_3

    .line 22
    .line 23
    invoke-virtual {p3}, Lkm1;->α()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-ge p1, v1, :cond_3

    .line 28
    .line 29
    iget-boolean p3, p3, Lkm1;->δ:Z

    .line 30
    .line 31
    if-nez p3, :cond_1

    .line 32
    .line 33
    move p2, p1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object p2, p2, Landroidx/recyclerview/widget/RecyclerView;->θ:Lm6;

    .line 36
    .line 37
    const/4 p3, 0x0

    .line 38
    invoke-virtual {p2, p1, p3}, Lm6;->σ(II)I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    :goto_0
    const/4 p3, -0x1

    .line 43
    if-ne p2, p3, :cond_2

    .line 44
    .line 45
    new-instance p0, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string p2, "Cannot find span size for pre layout position. "

    .line 48
    .line 49
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    const-string p1, "GridLayoutManager"

    .line 60
    .line 61
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    return p0

    .line 66
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget p0, p0, Landroidx/recyclerview/widget/GridLayoutManager;->τ:I

    .line 70
    .line 71
    invoke-static {p2, p0}, Ln;->φ(II)I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    return p0

    .line 76
    :cond_3
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 77
    .line 78
    const-string v0, "invalid position "

    .line 79
    .line 80
    const-string v1, ". State item count is "

    .line 81
    .line 82
    invoke-static {p1, v0, v1}, La12;->ζ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p3}, Lkm1;->α()I

    .line 87
    .line 88
    .line 89
    move-result p3

    .line 90
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->ν()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p0
.end method

.method public final л()V
    .locals 8

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/LinearLayoutManager;->λ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lzl1;->ι:I

    .line 7
    .line 8
    invoke-virtual {p0}, Lzl1;->χ()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    sub-int/2addr v0, v2

    .line 13
    invoke-virtual {p0}, Lzl1;->φ()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    :goto_0
    sub-int/2addr v0, v2

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    iget v0, p0, Lzl1;->κ:I

    .line 20
    .line 21
    invoke-virtual {p0}, Lzl1;->υ()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    sub-int/2addr v0, v2

    .line 26
    invoke-virtual {p0}, Lzl1;->ψ()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->υ:[I

    .line 32
    .line 33
    iget v3, p0, Landroidx/recyclerview/widget/GridLayoutManager;->τ:I

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    array-length v4, v2

    .line 38
    add-int/lit8 v5, v3, 0x1

    .line 39
    .line 40
    if-ne v4, v5, :cond_1

    .line 41
    .line 42
    array-length v4, v2

    .line 43
    sub-int/2addr v4, v1

    .line 44
    aget v4, v2, v4

    .line 45
    .line 46
    if-eq v4, v0, :cond_2

    .line 47
    .line 48
    :cond_1
    add-int/lit8 v2, v3, 0x1

    .line 49
    .line 50
    new-array v2, v2, [I

    .line 51
    .line 52
    :cond_2
    const/4 v4, 0x0

    .line 53
    aput v4, v2, v4

    .line 54
    .line 55
    div-int v5, v0, v3

    .line 56
    .line 57
    rem-int/2addr v0, v3

    .line 58
    move v6, v4

    .line 59
    :goto_2
    if-gt v1, v3, :cond_4

    .line 60
    .line 61
    add-int/2addr v4, v0

    .line 62
    if-lez v4, :cond_3

    .line 63
    .line 64
    sub-int v7, v3, v4

    .line 65
    .line 66
    if-ge v7, v0, :cond_3

    .line 67
    .line 68
    add-int/lit8 v7, v5, 0x1

    .line 69
    .line 70
    sub-int/2addr v4, v3

    .line 71
    goto :goto_3

    .line 72
    :cond_3
    move v7, v5

    .line 73
    :goto_3
    add-int/2addr v6, v7

    .line 74
    aput v6, v2, v1

    .line 75
    .line 76
    add-int/lit8 v1, v1, 0x1

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    iput-object v2, p0, Landroidx/recyclerview/widget/GridLayoutManager;->υ:[I

    .line 80
    .line 81
    return-void
.end method
