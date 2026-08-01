.class public final Lo4;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:I

.field public β:Ljava/lang/Object;

.field public γ:Ljava/lang/Object;

.field public δ:Ljava/lang/Object;

.field public ε:Ljava/lang/Object;

.field public ζ:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x20

    .line 5
    .line 6
    new-array v1, v0, [Lte0;

    .line 7
    .line 8
    iput-object v1, p0, Lo4;->β:Ljava/lang/Object;

    .line 9
    .line 10
    new-array v1, v0, [F

    .line 11
    .line 12
    iput-object v1, p0, Lo4;->γ:Ljava/lang/Object;

    .line 13
    .line 14
    new-array v0, v0, [B

    .line 15
    .line 16
    iput-object v0, p0, Lo4;->δ:Ljava/lang/Object;

    .line 17
    .line 18
    sget v0, Luq1;->α:I

    .line 19
    .line 20
    new-instance v0, Lc21;

    .line 21
    .line 22
    invoke-direct {v0}, Lc21;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lo4;->ε:Ljava/lang/Object;

    .line 26
    .line 27
    new-instance v0, Lc21;

    .line 28
    .line 29
    invoke-direct {v0}, Lc21;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lo4;->ζ:Ljava/lang/Object;

    .line 33
    .line 34
    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 36
    iput v0, p0, Lo4;->α:I

    .line 37
    iput-object p1, p0, Lo4;->β:Ljava/lang/Object;

    .line 38
    invoke-static {}, Lj5;->α()Lj5;

    move-result-object p1

    iput-object p1, p0, Lo4;->γ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public α()V
    .locals 5

    .line 1
    iget-object v0, p0, Lo4;->β:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_6

    .line 10
    .line 11
    iget-object v2, p0, Lo4;->δ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Loo;

    .line 14
    .line 15
    if-eqz v2, :cond_4

    .line 16
    .line 17
    iget-object v2, p0, Lo4;->ζ:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Loo;

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    new-instance v2, Loo;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v2, p0, Lo4;->ζ:Ljava/lang/Object;

    .line 29
    .line 30
    :cond_0
    iget-object v2, p0, Lo4;->ζ:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Loo;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    iput-object v3, v2, Loo;->γ:Ljava/lang/Object;

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    iput-boolean v4, v2, Loo;->β:Z

    .line 39
    .line 40
    iput-object v3, v2, Loo;->δ:Ljava/io/Serializable;

    .line 41
    .line 42
    iput-boolean v4, v2, Loo;->α:Z

    .line 43
    .line 44
    sget-object v3, Lb92;->α:Ljava/util/WeakHashMap;

    .line 45
    .line 46
    invoke-static {v0}, Lu82;->β(Landroid/view/View;)Landroid/content/res/ColorStateList;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const/4 v4, 0x1

    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    iput-boolean v4, v2, Loo;->β:Z

    .line 54
    .line 55
    iput-object v3, v2, Loo;->γ:Ljava/lang/Object;

    .line 56
    .line 57
    :cond_1
    invoke-static {v0}, Lu82;->γ(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    if-eqz v3, :cond_2

    .line 62
    .line 63
    iput-boolean v4, v2, Loo;->α:Z

    .line 64
    .line 65
    iput-object v3, v2, Loo;->δ:Ljava/io/Serializable;

    .line 66
    .line 67
    :cond_2
    iget-boolean v3, v2, Loo;->β:Z

    .line 68
    .line 69
    if-nez v3, :cond_3

    .line 70
    .line 71
    iget-boolean v3, v2, Loo;->α:Z

    .line 72
    .line 73
    if-eqz v3, :cond_4

    .line 74
    .line 75
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-static {v1, v2, p0}, Lj5;->δ(Landroid/graphics/drawable/Drawable;Loo;[I)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_4
    iget-object v2, p0, Lo4;->ε:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v2, Loo;

    .line 86
    .line 87
    if-eqz v2, :cond_5

    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {v1, v2, p0}, Lj5;->δ(Landroid/graphics/drawable/Drawable;Loo;[I)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_5
    iget-object p0, p0, Lo4;->δ:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p0, Loo;

    .line 100
    .line 101
    if-eqz p0, :cond_6

    .line 102
    .line 103
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-static {v1, p0, v0}, Lj5;->δ(Landroid/graphics/drawable/Drawable;Loo;[I)V

    .line 108
    .line 109
    .line 110
    :cond_6
    return-void
.end method

.method public β()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lo4;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Loo;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Loo;->γ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public γ()Landroid/graphics/PorterDuff$Mode;
    .locals 0

    .line 1
    iget-object p0, p0, Lo4;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Loo;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Loo;->δ:Ljava/io/Serializable;

    .line 8
    .line 9
    check-cast p0, Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public δ(Landroid/util/AttributeSet;I)V
    .locals 10

    .line 1
    iget-object v0, p0, Lo4;->β:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v4, Lkk1;->Δ:[I

    .line 10
    .line 11
    invoke-static {v1, p1, v4, p2}, Lm6;->Μ(Landroid/content/Context;Landroid/util/AttributeSet;[II)Lm6;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, v1, Lm6;->ζ:Ljava/lang/Object;

    .line 16
    .line 17
    move-object v9, v2

    .line 18
    check-cast v9, Landroid/content/res/TypedArray;

    .line 19
    .line 20
    iget-object v2, p0, Lo4;->β:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    iget-object v5, v1, Lm6;->ζ:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v6, v5

    .line 31
    check-cast v6, Landroid/content/res/TypedArray;

    .line 32
    .line 33
    sget-object v5, Lb92;->α:Ljava/util/WeakHashMap;

    .line 34
    .line 35
    const/4 v8, 0x0

    .line 36
    move-object v5, p1

    .line 37
    move v7, p2

    .line 38
    invoke-static/range {v2 .. v8}, Ly82;->β(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    :try_start_0
    invoke-virtual {v9, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    const/4 v2, -0x1

    .line 47
    if-eqz p2, :cond_0

    .line 48
    .line 49
    invoke-virtual {v9, p1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    iput p1, p0, Lo4;->α:I

    .line 54
    .line 55
    iget-object p1, p0, Lo4;->γ:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Lj5;

    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    iget v3, p0, Lo4;->α:I

    .line 64
    .line 65
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    :try_start_1
    iget-object v4, p1, Lj5;->α:Ltn1;

    .line 67
    .line 68
    invoke-virtual {v4, p2, v3}, Ltn1;->η(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 69
    .line 70
    .line 71
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 72
    :try_start_2
    monitor-exit p1

    .line 73
    if-eqz p2, :cond_0

    .line 74
    .line 75
    invoke-virtual {p0, p2}, Lo4;->η(Landroid/content/res/ColorStateList;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :catchall_0
    move-exception v0

    .line 80
    move-object p0, v0

    .line 81
    goto :goto_1

    .line 82
    :catchall_1
    move-exception v0

    .line 83
    move-object p0, v0

    .line 84
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 85
    :try_start_4
    throw p0

    .line 86
    :cond_0
    :goto_0
    const/4 p0, 0x1

    .line 87
    invoke-virtual {v9, p0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eqz p1, :cond_1

    .line 92
    .line 93
    invoke-virtual {v1, p0}, Lm6;->ψ(I)Landroid/content/res/ColorStateList;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-static {v0, p0}, Lu82;->ε(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    .line 98
    .line 99
    .line 100
    :cond_1
    const/4 p0, 0x2

    .line 101
    invoke-virtual {v9, p0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_2

    .line 106
    .line 107
    invoke-virtual {v9, p0, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    const/4 p1, 0x0

    .line 112
    invoke-static {p0, p1}, Lfw;->γ(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-static {v0, p0}, Lu82;->ζ(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 117
    .line 118
    .line 119
    :cond_2
    invoke-virtual {v1}, Lm6;->Ξ()V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :goto_1
    invoke-virtual {v1}, Lm6;->Ξ()V

    .line 124
    .line 125
    .line 126
    throw p0
.end method

.method public ε()V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lo4;->α:I

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Lo4;->η(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lo4;->α()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public ζ(I)V
    .locals 3

    .line 1
    iput p1, p0, Lo4;->α:I

    .line 2
    .line 3
    iget-object v0, p0, Lo4;->γ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lj5;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lo4;->β:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    iget-object v2, v0, Lj5;->α:Ltn1;

    .line 19
    .line 20
    invoke-virtual {v2, v1, p1}, Ltn1;->η(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 21
    .line 22
    .line 23
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    monitor-exit v0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw p0

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    :goto_0
    invoke-virtual {p0, p1}, Lo4;->η(Landroid/content/res/ColorStateList;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lo4;->α()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public η(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lo4;->δ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Loo;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Loo;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lo4;->δ:Ljava/lang/Object;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lo4;->δ:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Loo;

    .line 19
    .line 20
    iput-object p1, v0, Loo;->γ:Ljava/lang/Object;

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, v0, Loo;->β:Z

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p1, 0x0

    .line 27
    iput-object p1, p0, Lo4;->δ:Ljava/lang/Object;

    .line 28
    .line 29
    :goto_0
    invoke-virtual {p0}, Lo4;->α()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public θ(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo4;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Loo;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Loo;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lo4;->ε:Ljava/lang/Object;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lo4;->ε:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Loo;

    .line 17
    .line 18
    iput-object p1, v0, Loo;->γ:Ljava/lang/Object;

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    iput-boolean p1, v0, Loo;->β:Z

    .line 22
    .line 23
    invoke-virtual {p0}, Lo4;->α()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public ι(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo4;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Loo;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Loo;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lo4;->ε:Ljava/lang/Object;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lo4;->ε:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Loo;

    .line 17
    .line 18
    iput-object p1, v0, Loo;->δ:Ljava/io/Serializable;

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    iput-boolean p1, v0, Loo;->α:Z

    .line 22
    .line 23
    invoke-virtual {p0}, Lo4;->α()V

    .line 24
    .line 25
    .line 26
    return-void
.end method
