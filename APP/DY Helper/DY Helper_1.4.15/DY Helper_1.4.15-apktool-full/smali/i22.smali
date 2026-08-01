.class public final Li22;
.super Lwb2;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final ζ:Ljava/util/HashMap;

.field public final synthetic η:Landroidx/core/view/insets/α;


# direct methods
.method public constructor <init>(Landroidx/core/view/insets/α;)V
    .locals 0

    .line 1
    iput-object p1, p0, Li22;->η:Landroidx/core/view/insets/α;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lwb2;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance p1, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Li22;->ζ:Ljava/util/HashMap;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final α(Lyb2;)V
    .locals 4

    .line 1
    iget-object v0, p0, Li22;->η:Landroidx/core/view/insets/α;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/core/view/insets/α;->β:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v1, p1, Lyb2;->α:Ly21;

    .line 6
    .line 7
    iget-object v1, v1, Ly21;->ε:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Landroid/view/WindowInsetsAnimation;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/view/WindowInsetsAnimation;->getTypeMask()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit16 v1, v1, 0x207

    .line 16
    .line 17
    if-eqz v1, :cond_3

    .line 18
    .line 19
    iget-object p0, p0, Li22;->ζ:Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    const/4 p1, 0x1

    .line 29
    sub-int/2addr p0, p1

    .line 30
    :goto_0
    if-ltz p0, :cond_3

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lyj1;

    .line 37
    .line 38
    iget v2, v1, Lyj1;->γ:I

    .line 39
    .line 40
    if-lez v2, :cond_0

    .line 41
    .line 42
    move v3, p1

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    const/4 v3, 0x0

    .line 45
    :goto_1
    add-int/lit8 v2, v2, -0x1

    .line 46
    .line 47
    iput v2, v1, Lyj1;->γ:I

    .line 48
    .line 49
    if-eqz v3, :cond_2

    .line 50
    .line 51
    if-nez v2, :cond_2

    .line 52
    .line 53
    iget-object v1, v1, Lyj1;->α:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    sub-int/2addr v2, p1

    .line 60
    if-gez v2, :cond_1

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_1
    invoke-static {v2, v1}, Llz1;->κ(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    throw p0

    .line 68
    :cond_2
    :goto_2
    add-int/lit8 p0, p0, -0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    return-void
.end method

.method public final β(Lyb2;)V
    .locals 2

    .line 1
    iget-object p0, p0, Li22;->η:Landroidx/core/view/insets/α;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/core/view/insets/α;->β:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object p1, p1, Lyb2;->α:Ly21;

    .line 6
    .line 7
    iget-object p1, p1, Ly21;->ε:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Landroid/view/WindowInsetsAnimation;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/WindowInsetsAnimation;->getTypeMask()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    and-int/lit16 p1, p1, 0x207

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    add-int/lit8 p1, p1, -0x1

    .line 24
    .line 25
    :goto_0
    if-ltz p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lyj1;

    .line 32
    .line 33
    iget v1, v0, Lyj1;->γ:I

    .line 34
    .line 35
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    iput v1, v0, Lyj1;->γ:I

    .line 38
    .line 39
    add-int/lit8 p1, p1, -0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    return-void
.end method

.method public final γ(Loc2;Ljava/util/List;)Loc2;
    .locals 6

    .line 1
    iget-object v0, p0, Li22;->η:Landroidx/core/view/insets/α;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/core/view/insets/α;->β:Ljava/util/ArrayList;

    .line 4
    .line 5
    new-instance v1, Landroid/graphics/RectF;

    .line 6
    .line 7
    const/high16 v2, 0x3f800000    # 1.0f

    .line 8
    .line 9
    invoke-direct {v1, v2, v2, v2, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/lit8 v2, v2, -0x1

    .line 17
    .line 18
    :goto_0
    if-ltz v2, :cond_4

    .line 19
    .line 20
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lyb2;

    .line 25
    .line 26
    iget-object v4, p0, Li22;->ζ:Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Ljava/lang/Integer;

    .line 33
    .line 34
    if-eqz v4, :cond_3

    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    iget-object v3, v3, Lyb2;->α:Ly21;

    .line 41
    .line 42
    iget-object v3, v3, Ly21;->ε:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, Landroid/view/WindowInsetsAnimation;

    .line 45
    .line 46
    invoke-virtual {v3}, Landroid/view/WindowInsetsAnimation;->getAlpha()F

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    and-int/lit8 v5, v4, 0x1

    .line 51
    .line 52
    if-eqz v5, :cond_0

    .line 53
    .line 54
    iput v3, v1, Landroid/graphics/RectF;->left:F

    .line 55
    .line 56
    :cond_0
    and-int/lit8 v5, v4, 0x2

    .line 57
    .line 58
    if-eqz v5, :cond_1

    .line 59
    .line 60
    iput v3, v1, Landroid/graphics/RectF;->top:F

    .line 61
    .line 62
    :cond_1
    and-int/lit8 v5, v4, 0x4

    .line 63
    .line 64
    if-eqz v5, :cond_2

    .line 65
    .line 66
    iput v3, v1, Landroid/graphics/RectF;->right:F

    .line 67
    .line 68
    :cond_2
    and-int/lit8 v4, v4, 0x8

    .line 69
    .line 70
    if-eqz v4, :cond_3

    .line 71
    .line 72
    iput v3, v1, Landroid/graphics/RectF;->bottom:F

    .line 73
    .line 74
    :cond_3
    add-int/lit8 v2, v2, -0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_4
    iget-object p0, p1, Loc2;->α:Llc2;

    .line 78
    .line 79
    const/16 p2, 0x207

    .line 80
    .line 81
    invoke-virtual {p0, p2}, Llc2;->η(I)Lnm0;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    const/16 v1, 0x40

    .line 86
    .line 87
    invoke-virtual {p0, v1}, Llc2;->η(I)Lnm0;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p2, p0}, Lnm0;->α(Lnm0;Lnm0;)Lnm0;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    add-int/lit8 p0, p0, -0x1

    .line 99
    .line 100
    :goto_1
    if-ltz p0, :cond_6

    .line 101
    .line 102
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    check-cast p2, Lyj1;

    .line 107
    .line 108
    iget-object p2, p2, Lyj1;->α:Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    add-int/lit8 v1, v1, -0x1

    .line 115
    .line 116
    if-gez v1, :cond_5

    .line 117
    .line 118
    add-int/lit8 p0, p0, -0x1

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_5
    invoke-static {v1, p2}, Llz1;->κ(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    throw p0

    .line 126
    :cond_6
    return-object p1
.end method

.method public final δ(Lyb2;Lcw1;)Lcw1;
    .locals 5

    .line 1
    iget-object v0, p1, Lyb2;->α:Ly21;

    .line 2
    .line 3
    iget-object v0, v0, Ly21;->ε:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/view/WindowInsetsAnimation;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/WindowInsetsAnimation;->getTypeMask()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    and-int/lit16 v0, v0, 0x207

    .line 12
    .line 13
    if-eqz v0, :cond_4

    .line 14
    .line 15
    iget-object v0, p2, Lcw1;->η:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lnm0;

    .line 18
    .line 19
    iget-object v1, p2, Lcw1;->ζ:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lnm0;

    .line 22
    .line 23
    iget v2, v0, Lnm0;->α:I

    .line 24
    .line 25
    iget v3, v1, Lnm0;->α:I

    .line 26
    .line 27
    if-eq v2, v3, :cond_0

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v2, 0x0

    .line 32
    :goto_0
    iget v3, v0, Lnm0;->β:I

    .line 33
    .line 34
    iget v4, v1, Lnm0;->β:I

    .line 35
    .line 36
    if-eq v3, v4, :cond_1

    .line 37
    .line 38
    or-int/lit8 v2, v2, 0x2

    .line 39
    .line 40
    :cond_1
    iget v3, v0, Lnm0;->γ:I

    .line 41
    .line 42
    iget v4, v1, Lnm0;->γ:I

    .line 43
    .line 44
    if-eq v3, v4, :cond_2

    .line 45
    .line 46
    or-int/lit8 v2, v2, 0x4

    .line 47
    .line 48
    :cond_2
    iget v0, v0, Lnm0;->δ:I

    .line 49
    .line 50
    iget v1, v1, Lnm0;->δ:I

    .line 51
    .line 52
    if-eq v0, v1, :cond_3

    .line 53
    .line 54
    or-int/lit8 v2, v2, 0x8

    .line 55
    .line 56
    :cond_3
    iget-object p0, p0, Li22;->ζ:Ljava/util/HashMap;

    .line 57
    .line 58
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    :cond_4
    return-object p2
.end method
