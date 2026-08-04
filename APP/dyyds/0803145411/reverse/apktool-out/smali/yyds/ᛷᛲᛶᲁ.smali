.class public final Lyyds/ᛷᛲᛶᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:Lyyds/ᲈᲀᛲᛴ;

.field public ᛲᛲᲈᲈ:Z

.field public final ᛲᛳᛶᲁ:Lyyds/ᲇᲇᛲᛲ;

.field public ᛲᛴᛳᛲ:Lyyds/ᲈᲀᛲᛴ;

.field public final ᛲᲈᲁ:Landroid/widget/TextView;

.field public ᛵᛸᛸᛷ:Lyyds/ᲈᲀᛲᛴ;

.field public ᛶᛷᛲᲁ:Lyyds/ᲈᲀᛲᛴ;

.field public ᛷᛲᲈᛱ:I

.field public ᛷᛵᲇᲀ:Landroid/graphics/Typeface;

.field public ᛷᲈᲈᲁ:I

.field public ᲀᛲᛳᲀ:Lyyds/ᲈᲀᛲᛴ;

.field public ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛲᛴ;

.field public ᲇᲈᛵᛷ:Lyyds/ᲈᲀᛲᛴ;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᲈᲈᲁ:I

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᛲᲈᛱ:I

    .line 9
    .line 10
    iput-object p1, p0, Lyyds/ᛷᛲᛶᲁ;->ᛲᲈᲁ:Landroid/widget/TextView;

    .line 11
    .line 12
    new-instance v0, Lyyds/ᲇᲇᛲᛲ;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Lyyds/ᲇᲇᛲᛲ;-><init>(Landroid/widget/TextView;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lyyds/ᛷᛲᛶᲁ;->ᛲᛳᛶᲁ:Lyyds/ᲇᲇᛲᛲ;

    .line 18
    .line 19
    return-void
.end method

.method public static ᲀᛲᛳᲀ(Landroid/content/Context;Lyyds/ᛷᛴᛸᛱ;I)Lyyds/ᲈᲀᛲᛴ;
    .locals 1

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    iget-object v0, p1, Lyyds/ᛷᛴᛸᛱ;->ᛲᲈᲁ:Lyyds/ᛷᛴᲀᲈ;

    .line 3
    .line 4
    invoke-virtual {v0, p0, p2}, Lyyds/ᛷᛴᲀᲈ;->ᛶᛷᛲᲁ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    .line 7
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p1

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    new-instance p1, Lyyds/ᲈᲀᛲᛴ;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x1

    .line 17
    iput-boolean p2, p1, Lyyds/ᲈᲀᛲᛴ;->ᛵᛸᛸᛷ:Z

    .line 18
    .line 19
    iput-object p0, p1, Lyyds/ᲈᲀᛲᛴ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw p0
.end method


# virtual methods
.method public final ᛱᲈᲁ(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛷᛲᛶᲁ;->ᛱᲈᲁ:Lyyds/ᲈᲀᛲᛴ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lyyds/ᲈᲀᛲᛴ;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lyyds/ᛷᛲᛶᲁ;->ᛱᲈᲁ:Lyyds/ᲈᲀᛲᛴ;

    .line 11
    .line 12
    :cond_0
    move-object v1, v0

    .line 13
    iput-object p1, v0, Lyyds/ᲈᲀᛲᛴ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 p1, 0x0

    .line 20
    :goto_0
    iput-boolean p1, v0, Lyyds/ᲈᲀᛲᛴ;->ᛵᛸᛸᛷ:Z

    .line 21
    .line 22
    iput-object v1, p0, Lyyds/ᛷᛲᛶᲁ;->ᛵᛸᛸᛷ:Lyyds/ᲈᲀᛲᛴ;

    .line 23
    .line 24
    iput-object v1, p0, Lyyds/ᛷᛲᛶᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲈᲀᛲᛴ;

    .line 25
    .line 26
    iput-object v1, p0, Lyyds/ᛷᛲᛶᲁ;->ᲇᲈᛵᛷ:Lyyds/ᲈᲀᛲᛴ;

    .line 27
    .line 28
    iput-object v1, p0, Lyyds/ᛷᛲᛶᲁ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲀᛲᛴ;

    .line 29
    .line 30
    iput-object v1, p0, Lyyds/ᛷᛲᛶᲁ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛲᛴ;

    .line 31
    .line 32
    iput-object v1, p0, Lyyds/ᛷᛲᛶᲁ;->ᛶᛷᛲᲁ:Lyyds/ᲈᲀᛲᛴ;

    .line 33
    .line 34
    return-void
.end method

.method public final ᛲᛳᛶᲁ(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛷᛲᛶᲁ;->ᛱᲈᲁ:Lyyds/ᲈᲀᛲᛴ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lyyds/ᲈᲀᛲᛴ;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lyyds/ᛷᛲᛶᲁ;->ᛱᲈᲁ:Lyyds/ᲈᲀᛲᛴ;

    .line 11
    .line 12
    :cond_0
    move-object v1, v0

    .line 13
    iput-object p1, v0, Lyyds/ᲈᲀᛲᛴ;->ᲇᲈᛵᛷ:Ljava/io/Serializable;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 p1, 0x0

    .line 20
    :goto_0
    iput-boolean p1, v0, Lyyds/ᲈᲀᛲᛴ;->ᛲᲈᲁ:Z

    .line 21
    .line 22
    iput-object v1, p0, Lyyds/ᛷᛲᛶᲁ;->ᛵᛸᛸᛷ:Lyyds/ᲈᲀᛲᛴ;

    .line 23
    .line 24
    iput-object v1, p0, Lyyds/ᛷᛲᛶᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲈᲀᛲᛴ;

    .line 25
    .line 26
    iput-object v1, p0, Lyyds/ᛷᛲᛶᲁ;->ᲇᲈᛵᛷ:Lyyds/ᲈᲀᛲᛴ;

    .line 27
    .line 28
    iput-object v1, p0, Lyyds/ᛷᛲᛶᲁ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲀᛲᛴ;

    .line 29
    .line 30
    iput-object v1, p0, Lyyds/ᛷᛲᛶᲁ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛲᛴ;

    .line 31
    .line 32
    iput-object v1, p0, Lyyds/ᛷᛲᛶᲁ;->ᛶᛷᛲᲁ:Lyyds/ᲈᲀᛲᛴ;

    .line 33
    .line 34
    return-void
.end method

.method public final ᛲᛴᛳᛲ()Landroid/graphics/PorterDuff$Mode;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛲᛶᲁ;->ᛱᲈᲁ:Lyyds/ᲈᲀᛲᛴ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᲈᲀᛲᛴ;->ᲇᲈᛵᛷ:Ljava/io/Serializable;

    .line 6
    .line 7
    check-cast p0, Landroid/graphics/PorterDuff$Mode;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public final ᛲᲈᲁ(Landroid/graphics/drawable/Drawable;Lyyds/ᲈᲀᛲᛴ;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛷᛲᛶᲁ;->ᛲᲈᲁ:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object v0, Lyyds/ᛷᛴᛸᛱ;->ᛵᛸᛸᛷ:Landroid/graphics/PorterDuff$Mode;

    .line 12
    .line 13
    invoke-static {p1, p2, p0}, Lyyds/ᛷᛴᲀᲈ;->ᛲᛳᛶᲁ(Landroid/graphics/drawable/Drawable;Lyyds/ᲈᲀᛲᛴ;[I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final ᛵᛸᛸᛷ()V
    .locals 6

    .line 1
    iget-object v0, p0, Lyyds/ᛷᛲᛶᲁ;->ᛵᛸᛸᛷ:Lyyds/ᲈᲀᛲᛴ;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Lyyds/ᛷᛲᛶᲁ;->ᛲᲈᲁ:Landroid/widget/TextView;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lyyds/ᛷᛲᛶᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲈᲀᛲᛴ;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lyyds/ᛷᛲᛶᲁ;->ᲇᲈᛵᛷ:Lyyds/ᲈᲀᛲᛴ;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lyyds/ᛷᛲᛶᲁ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲀᛲᛴ;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :cond_0
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    aget-object v4, v0, v2

    .line 26
    .line 27
    iget-object v5, p0, Lyyds/ᛷᛲᛶᲁ;->ᛵᛸᛸᛷ:Lyyds/ᲈᲀᛲᛴ;

    .line 28
    .line 29
    invoke-virtual {p0, v4, v5}, Lyyds/ᛷᛲᛶᲁ;->ᛲᲈᲁ(Landroid/graphics/drawable/Drawable;Lyyds/ᲈᲀᛲᛴ;)V

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    aget-object v4, v0, v4

    .line 34
    .line 35
    iget-object v5, p0, Lyyds/ᛷᛲᛶᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲈᲀᛲᛴ;

    .line 36
    .line 37
    invoke-virtual {p0, v4, v5}, Lyyds/ᛷᛲᛶᲁ;->ᛲᲈᲁ(Landroid/graphics/drawable/Drawable;Lyyds/ᲈᲀᛲᛴ;)V

    .line 38
    .line 39
    .line 40
    aget-object v4, v0, v1

    .line 41
    .line 42
    iget-object v5, p0, Lyyds/ᛷᛲᛶᲁ;->ᲇᲈᛵᛷ:Lyyds/ᲈᲀᛲᛴ;

    .line 43
    .line 44
    invoke-virtual {p0, v4, v5}, Lyyds/ᛷᛲᛶᲁ;->ᛲᲈᲁ(Landroid/graphics/drawable/Drawable;Lyyds/ᲈᲀᛲᛴ;)V

    .line 45
    .line 46
    .line 47
    const/4 v4, 0x3

    .line 48
    aget-object v0, v0, v4

    .line 49
    .line 50
    iget-object v4, p0, Lyyds/ᛷᛲᛶᲁ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲀᛲᛴ;

    .line 51
    .line 52
    invoke-virtual {p0, v0, v4}, Lyyds/ᛷᛲᛶᲁ;->ᛲᲈᲁ(Landroid/graphics/drawable/Drawable;Lyyds/ᲈᲀᛲᛴ;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iget-object v0, p0, Lyyds/ᛷᛲᛶᲁ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛲᛴ;

    .line 56
    .line 57
    if-nez v0, :cond_3

    .line 58
    .line 59
    iget-object v0, p0, Lyyds/ᛷᛲᛶᲁ;->ᛶᛷᛲᲁ:Lyyds/ᲈᲀᛲᛴ;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    return-void

    .line 65
    :cond_3
    :goto_0
    invoke-static {v3}, Lyyds/ᛷᛶᲁᛱ;->ᛲᲈᲁ(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    aget-object v2, v0, v2

    .line 70
    .line 71
    iget-object v3, p0, Lyyds/ᛷᛲᛶᲁ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛲᛴ;

    .line 72
    .line 73
    invoke-virtual {p0, v2, v3}, Lyyds/ᛷᛲᛶᲁ;->ᛲᲈᲁ(Landroid/graphics/drawable/Drawable;Lyyds/ᲈᲀᛲᛴ;)V

    .line 74
    .line 75
    .line 76
    aget-object v0, v0, v1

    .line 77
    .line 78
    iget-object v1, p0, Lyyds/ᛷᛲᛶᲁ;->ᛶᛷᛲᲁ:Lyyds/ᲈᲀᛲᛴ;

    .line 79
    .line 80
    invoke-virtual {p0, v0, v1}, Lyyds/ᛷᛲᛶᲁ;->ᛲᲈᲁ(Landroid/graphics/drawable/Drawable;Lyyds/ᲈᲀᛲᛴ;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final ᛶᛷᛲᲁ(Landroid/content/Context;I)V
    .locals 5

    .line 1
    new-instance v0, Lyyds/ᛳᛷᲀᛴ;

    .line 2
    .line 3
    sget-object v1, Lyyds/ᛷᛷᛴᛳ;->ᛵᲀᲈᛴ:[I

    .line 4
    .line 5
    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-direct {v0, p1, p2}, Lyyds/ᛳᛷᲀᛴ;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0xe

    .line 13
    .line 14
    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    iget-object v4, p0, Lyyds/ᛷᛲᛶᲁ;->ᛲᲈᲁ:Landroid/widget/TextView;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p2, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {p2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    const/4 v1, -0x1

    .line 37
    invoke-virtual {p2, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-virtual {v4, v3, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-virtual {p0, p1, v0}, Lyyds/ᛷᛲᛶᲁ;->ᛷᲈᲈᲁ(Landroid/content/Context;Lyyds/ᛳᛷᲀᛴ;)V

    .line 48
    .line 49
    .line 50
    const/16 p1, 0xd

    .line 51
    .line 52
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-eqz p1, :cond_2

    .line 63
    .line 64
    invoke-static {v4, p1}, Lyyds/ᛱᛲᛵᛴ;->ᲇᲈᛵᛷ(Landroid/widget/TextView;Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-virtual {v0}, Lyyds/ᛳᛷᲀᛴ;->ᛸᛴᛵᛶ()V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᛵᲇᲀ:Landroid/graphics/Typeface;

    .line 71
    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    iget p0, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᲈᲈᲁ:I

    .line 75
    .line 76
    invoke-virtual {v4, p1, p0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 77
    .line 78
    .line 79
    :cond_3
    return-void
.end method

.method public final ᛷᲈᲈᲁ(Landroid/content/Context;Lyyds/ᛳᛷᲀᛴ;)V
    .locals 9

    .line 1
    iget v0, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᲈᲈᲁ:I

    .line 2
    .line 3
    iget-object v1, p2, Lyyds/ᛳᛷᲀᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/res/TypedArray;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iput v0, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᲈᲈᲁ:I

    .line 13
    .line 14
    const/16 v0, 0xb

    .line 15
    .line 16
    const/4 v3, -0x1

    .line 17
    invoke-virtual {v1, v0, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᛲᲈᛱ:I

    .line 22
    .line 23
    if-eq v0, v3, :cond_0

    .line 24
    .line 25
    iget v0, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᲈᲈᲁ:I

    .line 26
    .line 27
    and-int/2addr v0, v2

    .line 28
    iput v0, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᲈᲈᲁ:I

    .line 29
    .line 30
    :cond_0
    const/16 v0, 0xa

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    const/4 v5, 0x1

    .line 37
    const/16 v6, 0xc

    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    if-nez v4, :cond_5

    .line 41
    .line 42
    invoke-virtual {v1, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_e

    .line 54
    .line 55
    iput-boolean v7, p0, Lyyds/ᛷᛲᛶᲁ;->ᛲᛲᲈᲈ:Z

    .line 56
    .line 57
    invoke-virtual {v1, v5, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eq p1, v5, :cond_4

    .line 62
    .line 63
    if-eq p1, v2, :cond_3

    .line 64
    .line 65
    const/4 p2, 0x3

    .line 66
    if-eq p1, p2, :cond_2

    .line 67
    .line 68
    goto/16 :goto_5

    .line 69
    .line 70
    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 71
    .line 72
    iput-object p1, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᛵᲇᲀ:Landroid/graphics/Typeface;

    .line 73
    .line 74
    return-void

    .line 75
    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    .line 76
    .line 77
    iput-object p1, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᛵᲇᲀ:Landroid/graphics/Typeface;

    .line 78
    .line 79
    return-void

    .line 80
    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 81
    .line 82
    iput-object p1, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᛵᲇᲀ:Landroid/graphics/Typeface;

    .line 83
    .line 84
    return-void

    .line 85
    :cond_5
    :goto_0
    const/4 v4, 0x0

    .line 86
    iput-object v4, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᛵᲇᲀ:Landroid/graphics/Typeface;

    .line 87
    .line 88
    invoke-virtual {v1, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-eqz v4, :cond_6

    .line 93
    .line 94
    move v0, v6

    .line 95
    :cond_6
    iget v4, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᛲᲈᛱ:I

    .line 96
    .line 97
    iget v6, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᲈᲈᲁ:I

    .line 98
    .line 99
    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-nez p1, :cond_b

    .line 104
    .line 105
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 106
    .line 107
    iget-object v8, p0, Lyyds/ᛷᛲᛶᲁ;->ᛲᲈᲁ:Landroid/widget/TextView;

    .line 108
    .line 109
    invoke-direct {p1, v8}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    new-instance v8, Lyyds/ᛸᛸᲇᲁ;

    .line 113
    .line 114
    invoke-direct {v8, p0, v4, v6, p1}, Lyyds/ᛸᛸᲇᲁ;-><init>(Lyyds/ᛷᛲᛶᲁ;IILjava/lang/ref/WeakReference;)V

    .line 115
    .line 116
    .line 117
    :try_start_0
    iget p1, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᲈᲈᲁ:I

    .line 118
    .line 119
    invoke-virtual {p2, v0, p1, v8}, Lyyds/ᛳᛷᲀᛴ;->ᛶᛸᲀᲁ(IILyyds/ᛸᛸᲇᲁ;)Landroid/graphics/Typeface;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    if-eqz p1, :cond_9

    .line 124
    .line 125
    iget p2, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᛲᲈᛱ:I

    .line 126
    .line 127
    if-eq p2, v3, :cond_8

    .line 128
    .line 129
    invoke-static {p1, v7}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    iget p2, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᛲᲈᛱ:I

    .line 134
    .line 135
    iget v4, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᲈᲈᲁ:I

    .line 136
    .line 137
    and-int/2addr v4, v2

    .line 138
    if-eqz v4, :cond_7

    .line 139
    .line 140
    move v4, v5

    .line 141
    goto :goto_1

    .line 142
    :cond_7
    move v4, v7

    .line 143
    :goto_1
    invoke-static {p1, p2, v4}, Lyyds/ᲀᛳᛲᛸ;->ᛲᲈᲁ(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    iput-object p1, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᛵᲇᲀ:Landroid/graphics/Typeface;

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_8
    iput-object p1, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᛵᲇᲀ:Landroid/graphics/Typeface;

    .line 151
    .line 152
    :cond_9
    :goto_2
    iget-object p1, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᛵᲇᲀ:Landroid/graphics/Typeface;

    .line 153
    .line 154
    if-nez p1, :cond_a

    .line 155
    .line 156
    move p1, v5

    .line 157
    goto :goto_3

    .line 158
    :cond_a
    move p1, v7

    .line 159
    :goto_3
    iput-boolean p1, p0, Lyyds/ᛷᛲᛶᲁ;->ᛲᛲᲈᲈ:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 160
    .line 161
    :catch_0
    :cond_b
    iget-object p1, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᛵᲇᲀ:Landroid/graphics/Typeface;

    .line 162
    .line 163
    if-nez p1, :cond_e

    .line 164
    .line 165
    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    if-eqz p1, :cond_e

    .line 170
    .line 171
    iget p2, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᛲᲈᛱ:I

    .line 172
    .line 173
    if-eq p2, v3, :cond_d

    .line 174
    .line 175
    invoke-static {p1, v7}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    iget p2, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᛲᲈᛱ:I

    .line 180
    .line 181
    iget v0, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᲈᲈᲁ:I

    .line 182
    .line 183
    and-int/2addr v0, v2

    .line 184
    if-eqz v0, :cond_c

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_c
    move v5, v7

    .line 188
    :goto_4
    invoke-static {p1, p2, v5}, Lyyds/ᲀᛳᛲᛸ;->ᛲᲈᲁ(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    iput-object p1, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᛵᲇᲀ:Landroid/graphics/Typeface;

    .line 193
    .line 194
    goto :goto_5

    .line 195
    :cond_d
    iget p2, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᲈᲈᲁ:I

    .line 196
    .line 197
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    iput-object p1, p0, Lyyds/ᛷᛲᛶᲁ;->ᛷᛵᲇᲀ:Landroid/graphics/Typeface;

    .line 202
    .line 203
    :cond_e
    :goto_5
    return-void
.end method

.method public final ᲇᲇᲇᛱ(Landroid/util/AttributeSet;I)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    move/from16 v5, p2

    .line 6
    .line 7
    iget-object v1, v0, Lyyds/ᛷᛲᛶᲁ;->ᛲᲈᲁ:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v8

    .line 13
    invoke-static {}, Lyyds/ᛷᛴᛸᛱ;->ᛲᲈᲁ()Lyyds/ᛷᛴᛸᛱ;

    .line 14
    .line 15
    .line 16
    move-result-object v9

    .line 17
    sget-object v2, Lyyds/ᛷᛷᛴᛳ;->ᛱᲈᲁ:[I

    .line 18
    .line 19
    invoke-static {v8, v3, v2, v5}, Lyyds/ᛳᛷᲀᛴ;->ᛱᛳᛶᛳ(Landroid/content/Context;Landroid/util/AttributeSet;[II)Lyyds/ᛳᛷᲀᛴ;

    .line 20
    .line 21
    .line 22
    move-result-object v10

    .line 23
    move-object v3, v2

    .line 24
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v4, v10, Lyyds/ᛳᛷᲀᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v4, Landroid/content/res/TypedArray;

    .line 31
    .line 32
    sget-object v6, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 33
    .line 34
    const/4 v7, 0x0

    .line 35
    move v6, v5

    .line 36
    move-object v5, v4

    .line 37
    move-object/from16 v4, p1

    .line 38
    .line 39
    invoke-static/range {v1 .. v7}, Lyyds/ᛵᲈᲈᛸ;->ᛵᛸᛸᛷ(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 40
    .line 41
    .line 42
    move-object v7, v1

    .line 43
    move-object v3, v4

    .line 44
    move v5, v6

    .line 45
    iget-object v1, v10, Lyyds/ᛳᛷᲀᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Landroid/content/res/TypedArray;

    .line 48
    .line 49
    const/4 v11, 0x0

    .line 50
    const/4 v12, -0x1

    .line 51
    invoke-virtual {v1, v11, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    const/4 v13, 0x3

    .line 56
    invoke-virtual {v1, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_0

    .line 61
    .line 62
    invoke-virtual {v1, v13, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    invoke-static {v8, v9, v4}, Lyyds/ᛷᛲᛶᲁ;->ᲀᛲᛳᲀ(Landroid/content/Context;Lyyds/ᛷᛴᛸᛱ;I)Lyyds/ᲈᲀᛲᛴ;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    iput-object v4, v0, Lyyds/ᛷᛲᛶᲁ;->ᛵᛸᛸᛷ:Lyyds/ᲈᲀᛲᛴ;

    .line 71
    .line 72
    :cond_0
    const/4 v14, 0x1

    .line 73
    invoke-virtual {v1, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_1

    .line 78
    .line 79
    invoke-virtual {v1, v14, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    invoke-static {v8, v9, v4}, Lyyds/ᛷᛲᛶᲁ;->ᲀᛲᛳᲀ(Landroid/content/Context;Lyyds/ᛷᛴᛸᛱ;I)Lyyds/ᲈᲀᛲᛴ;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    iput-object v4, v0, Lyyds/ᛷᛲᛶᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲈᲀᛲᛴ;

    .line 88
    .line 89
    :cond_1
    const/4 v15, 0x4

    .line 90
    invoke-virtual {v1, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-eqz v4, :cond_2

    .line 95
    .line 96
    invoke-virtual {v1, v15, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    invoke-static {v8, v9, v4}, Lyyds/ᛷᛲᛶᲁ;->ᲀᛲᛳᲀ(Landroid/content/Context;Lyyds/ᛷᛴᛸᛱ;I)Lyyds/ᲈᲀᛲᛴ;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    iput-object v4, v0, Lyyds/ᛷᛲᛶᲁ;->ᲇᲈᛵᛷ:Lyyds/ᲈᲀᛲᛴ;

    .line 105
    .line 106
    :cond_2
    const/4 v4, 0x2

    .line 107
    invoke-virtual {v1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    if-eqz v6, :cond_3

    .line 112
    .line 113
    invoke-virtual {v1, v4, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    invoke-static {v8, v9, v6}, Lyyds/ᛷᛲᛶᲁ;->ᲀᛲᛳᲀ(Landroid/content/Context;Lyyds/ᛷᛴᛸᛱ;I)Lyyds/ᲈᲀᛲᛴ;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    iput-object v6, v0, Lyyds/ᛷᛲᛶᲁ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲀᛲᛴ;

    .line 122
    .line 123
    :cond_3
    const/4 v6, 0x5

    .line 124
    invoke-virtual {v1, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 125
    .line 126
    .line 127
    move-result v16

    .line 128
    if-eqz v16, :cond_4

    .line 129
    .line 130
    invoke-virtual {v1, v6, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    invoke-static {v8, v9, v4}, Lyyds/ᛷᛲᛶᲁ;->ᲀᛲᛳᲀ(Landroid/content/Context;Lyyds/ᛷᛴᛸᛱ;I)Lyyds/ᲈᲀᛲᛴ;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    iput-object v4, v0, Lyyds/ᛷᛲᛶᲁ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛲᛴ;

    .line 139
    .line 140
    :cond_4
    const/4 v4, 0x6

    .line 141
    invoke-virtual {v1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 142
    .line 143
    .line 144
    move-result v17

    .line 145
    if-eqz v17, :cond_5

    .line 146
    .line 147
    invoke-virtual {v1, v4, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    invoke-static {v8, v9, v1}, Lyyds/ᛷᛲᛶᲁ;->ᲀᛲᛳᲀ(Landroid/content/Context;Lyyds/ᛷᛴᛸᛱ;I)Lyyds/ᲈᲀᛲᛴ;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    iput-object v1, v0, Lyyds/ᛷᛲᛶᲁ;->ᛶᛷᛲᲁ:Lyyds/ᲈᲀᛲᛴ;

    .line 156
    .line 157
    :cond_5
    invoke-virtual {v10}, Lyyds/ᛳᛷᲀᛴ;->ᛸᛴᛵᛶ()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v7}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    instance-of v1, v1, Landroid/text/method/PasswordTransformationMethod;

    .line 165
    .line 166
    sget-object v10, Lyyds/ᛷᛷᛴᛳ;->ᛵᲀᲈᛴ:[I

    .line 167
    .line 168
    const/16 v4, 0xe

    .line 169
    .line 170
    const/16 v13, 0xd

    .line 171
    .line 172
    const/16 v14, 0xf

    .line 173
    .line 174
    if-eq v2, v12, :cond_9

    .line 175
    .line 176
    new-instance v6, Lyyds/ᛳᛷᲀᛴ;

    .line 177
    .line 178
    invoke-virtual {v8, v2, v10}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-direct {v6, v8, v2}, Lyyds/ᛳᛷᲀᛴ;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 183
    .line 184
    .line 185
    if-nez v1, :cond_6

    .line 186
    .line 187
    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 188
    .line 189
    .line 190
    move-result v20

    .line 191
    if-eqz v20, :cond_6

    .line 192
    .line 193
    invoke-virtual {v2, v4, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 194
    .line 195
    .line 196
    move-result v20

    .line 197
    move/from16 v21, v20

    .line 198
    .line 199
    const/16 v20, 0x1

    .line 200
    .line 201
    goto :goto_0

    .line 202
    :cond_6
    move/from16 v20, v11

    .line 203
    .line 204
    move/from16 v21, v20

    .line 205
    .line 206
    :goto_0
    invoke-virtual {v0, v8, v6}, Lyyds/ᛷᛲᛶᲁ;->ᛷᲈᲈᲁ(Landroid/content/Context;Lyyds/ᛳᛷᲀᛴ;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 210
    .line 211
    .line 212
    move-result v22

    .line 213
    if-eqz v22, :cond_7

    .line 214
    .line 215
    invoke-virtual {v2, v14}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v22

    .line 219
    goto :goto_1

    .line 220
    :cond_7
    const/16 v22, 0x0

    .line 221
    .line 222
    :goto_1
    invoke-virtual {v2, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 223
    .line 224
    .line 225
    move-result v23

    .line 226
    if-eqz v23, :cond_8

    .line 227
    .line 228
    invoke-virtual {v2, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    goto :goto_2

    .line 233
    :cond_8
    const/4 v2, 0x0

    .line 234
    :goto_2
    invoke-virtual {v6}, Lyyds/ᛳᛷᲀᛴ;->ᛸᛴᛵᛶ()V

    .line 235
    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_9
    move/from16 v20, v11

    .line 239
    .line 240
    move/from16 v21, v20

    .line 241
    .line 242
    const/4 v2, 0x0

    .line 243
    const/16 v22, 0x0

    .line 244
    .line 245
    :goto_3
    new-instance v6, Lyyds/ᛳᛷᲀᛴ;

    .line 246
    .line 247
    invoke-virtual {v8, v3, v10, v5, v11}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 248
    .line 249
    .line 250
    move-result-object v10

    .line 251
    invoke-direct {v6, v8, v10}, Lyyds/ᛳᛷᲀᛴ;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 252
    .line 253
    .line 254
    if-nez v1, :cond_a

    .line 255
    .line 256
    invoke-virtual {v10, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 257
    .line 258
    .line 259
    move-result v23

    .line 260
    if-eqz v23, :cond_a

    .line 261
    .line 262
    invoke-virtual {v10, v4, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 263
    .line 264
    .line 265
    move-result v21

    .line 266
    const/16 v20, 0x1

    .line 267
    .line 268
    :cond_a
    move/from16 v4, v21

    .line 269
    .line 270
    invoke-virtual {v10, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 271
    .line 272
    .line 273
    move-result v21

    .line 274
    if-eqz v21, :cond_b

    .line 275
    .line 276
    invoke-virtual {v10, v14}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v22

    .line 280
    :cond_b
    invoke-virtual {v10, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 281
    .line 282
    .line 283
    move-result v21

    .line 284
    if-eqz v21, :cond_c

    .line 285
    .line 286
    invoke-virtual {v10, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    :cond_c
    invoke-virtual {v10, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 291
    .line 292
    .line 293
    move-result v21

    .line 294
    const/4 v14, 0x0

    .line 295
    if-eqz v21, :cond_d

    .line 296
    .line 297
    invoke-virtual {v10, v11, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 298
    .line 299
    .line 300
    move-result v10

    .line 301
    if-nez v10, :cond_d

    .line 302
    .line 303
    invoke-virtual {v7, v11, v14}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 304
    .line 305
    .line 306
    :cond_d
    invoke-virtual {v0, v8, v6}, Lyyds/ᛷᛲᛶᲁ;->ᛷᲈᲈᲁ(Landroid/content/Context;Lyyds/ᛳᛷᲀᛴ;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v6}, Lyyds/ᛳᛷᲀᛴ;->ᛸᛴᛵᛶ()V

    .line 310
    .line 311
    .line 312
    if-nez v1, :cond_e

    .line 313
    .line 314
    if-eqz v20, :cond_e

    .line 315
    .line 316
    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setAllCaps(Z)V

    .line 317
    .line 318
    .line 319
    :cond_e
    iget-object v1, v0, Lyyds/ᛷᛲᛶᲁ;->ᛷᛵᲇᲀ:Landroid/graphics/Typeface;

    .line 320
    .line 321
    if-eqz v1, :cond_10

    .line 322
    .line 323
    iget v4, v0, Lyyds/ᛷᛲᛶᲁ;->ᛷᛲᲈᛱ:I

    .line 324
    .line 325
    if-ne v4, v12, :cond_f

    .line 326
    .line 327
    iget v4, v0, Lyyds/ᛷᛲᛶᲁ;->ᛷᲈᲈᲁ:I

    .line 328
    .line 329
    invoke-virtual {v7, v1, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 330
    .line 331
    .line 332
    goto :goto_4

    .line 333
    :cond_f
    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 334
    .line 335
    .line 336
    :cond_10
    :goto_4
    if-eqz v2, :cond_11

    .line 337
    .line 338
    invoke-static {v7, v2}, Lyyds/ᛱᛲᛵᛴ;->ᲇᲈᛵᛷ(Landroid/widget/TextView;Ljava/lang/String;)Z

    .line 339
    .line 340
    .line 341
    :cond_11
    if-eqz v22, :cond_12

    .line 342
    .line 343
    invoke-static/range {v22 .. v22}, Lyyds/ᛳᛴᛳᛲ;->ᛲᲈᲁ(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    invoke-static {v7, v1}, Lyyds/ᛳᛴᛳᛲ;->ᛵᛸᛸᛷ(Landroid/widget/TextView;Landroid/os/LocaleList;)V

    .line 348
    .line 349
    .line 350
    :cond_12
    iget-object v10, v0, Lyyds/ᛷᛲᛶᲁ;->ᛲᛳᛶᲁ:Lyyds/ᲇᲇᛲᛲ;

    .line 351
    .line 352
    iget-object v0, v10, Lyyds/ᲇᲇᛲᛲ;->ᛱᲈᲁ:Landroid/content/Context;

    .line 353
    .line 354
    sget-object v2, Lyyds/ᛷᛷᛴᛳ;->ᛲᛳᛶᲁ:[I

    .line 355
    .line 356
    invoke-virtual {v0, v3, v2, v5, v11}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    move-object v1, v0

    .line 361
    iget-object v0, v10, Lyyds/ᲇᲇᛲᛲ;->ᛶᛷᛲᲁ:Landroid/widget/TextView;

    .line 362
    .line 363
    move-object v6, v1

    .line 364
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    move-object/from16 v20, v6

    .line 369
    .line 370
    const/4 v6, 0x0

    .line 371
    move/from16 v16, v14

    .line 372
    .line 373
    const/4 v14, 0x2

    .line 374
    const/4 v15, 0x5

    .line 375
    invoke-static/range {v0 .. v6}, Lyyds/ᛵᲈᲈᛸ;->ᛵᛸᛸᛷ(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v4, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    if-eqz v0, :cond_13

    .line 383
    .line 384
    invoke-virtual {v4, v15, v11}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    iput v0, v10, Lyyds/ᲇᲇᛲᛲ;->ᛲᲈᲁ:I

    .line 389
    .line 390
    :cond_13
    const/4 v0, 0x4

    .line 391
    invoke-virtual {v4, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    const/high16 v5, -0x40800000    # -1.0f

    .line 396
    .line 397
    if-eqz v1, :cond_14

    .line 398
    .line 399
    invoke-virtual {v4, v0, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    goto :goto_5

    .line 404
    :cond_14
    move v0, v5

    .line 405
    :goto_5
    invoke-virtual {v4, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    if-eqz v1, :cond_15

    .line 410
    .line 411
    invoke-virtual {v4, v14, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 412
    .line 413
    .line 414
    move-result v1

    .line 415
    :goto_6
    const/4 v6, 0x1

    .line 416
    goto :goto_7

    .line 417
    :cond_15
    move v1, v5

    .line 418
    goto :goto_6

    .line 419
    :goto_7
    invoke-virtual {v4, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 420
    .line 421
    .line 422
    move-result v15

    .line 423
    if-eqz v15, :cond_16

    .line 424
    .line 425
    invoke-virtual {v4, v6, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 426
    .line 427
    .line 428
    move-result v15

    .line 429
    :goto_8
    const/4 v6, 0x3

    .line 430
    goto :goto_9

    .line 431
    :cond_16
    move v15, v5

    .line 432
    goto :goto_8

    .line 433
    :goto_9
    invoke-virtual {v4, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 434
    .line 435
    .line 436
    move-result v18

    .line 437
    if-eqz v18, :cond_1a

    .line 438
    .line 439
    invoke-virtual {v4, v6, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 440
    .line 441
    .line 442
    move-result v13

    .line 443
    if-lez v13, :cond_1a

    .line 444
    .line 445
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 446
    .line 447
    .line 448
    move-result-object v6

    .line 449
    invoke-virtual {v6, v13}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    .line 450
    .line 451
    .line 452
    move-result-object v6

    .line 453
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->length()I

    .line 454
    .line 455
    .line 456
    move-result v13

    .line 457
    move/from16 v21, v11

    .line 458
    .line 459
    new-array v11, v13, [I

    .line 460
    .line 461
    if-lez v13, :cond_19

    .line 462
    .line 463
    move/from16 v14, v21

    .line 464
    .line 465
    :goto_a
    if-ge v14, v13, :cond_17

    .line 466
    .line 467
    invoke-virtual {v6, v14, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 468
    .line 469
    .line 470
    move-result v24

    .line 471
    aput v24, v11, v14

    .line 472
    .line 473
    add-int/lit8 v14, v14, 0x1

    .line 474
    .line 475
    goto :goto_a

    .line 476
    :cond_17
    invoke-static {v11}, Lyyds/ᲇᲇᛲᛲ;->ᛲᲈᲁ([I)[I

    .line 477
    .line 478
    .line 479
    move-result-object v11

    .line 480
    iput-object v11, v10, Lyyds/ᲇᲇᛲᛲ;->ᛲᛴᛳᛲ:[I

    .line 481
    .line 482
    array-length v13, v11

    .line 483
    if-lez v13, :cond_18

    .line 484
    .line 485
    const/4 v14, 0x1

    .line 486
    goto :goto_b

    .line 487
    :cond_18
    move/from16 v14, v21

    .line 488
    .line 489
    :goto_b
    iput-boolean v14, v10, Lyyds/ᲇᲇᛲᛲ;->ᲇᲇᲇᛱ:Z

    .line 490
    .line 491
    if-eqz v14, :cond_19

    .line 492
    .line 493
    const/4 v14, 0x1

    .line 494
    iput v14, v10, Lyyds/ᲇᲇᛲᛲ;->ᛲᲈᲁ:I

    .line 495
    .line 496
    move/from16 v19, v14

    .line 497
    .line 498
    aget v14, v11, v21

    .line 499
    .line 500
    int-to-float v14, v14

    .line 501
    iput v14, v10, Lyyds/ᲇᲇᛲᛲ;->ᲀᛲᛳᲀ:F

    .line 502
    .line 503
    add-int/lit8 v13, v13, -0x1

    .line 504
    .line 505
    aget v11, v11, v13

    .line 506
    .line 507
    int-to-float v11, v11

    .line 508
    iput v11, v10, Lyyds/ᲇᲇᛲᛲ;->ᲇᲈᛵᛷ:F

    .line 509
    .line 510
    iput v5, v10, Lyyds/ᲇᲇᛲᛲ;->ᛵᛸᛸᛷ:F

    .line 511
    .line 512
    :cond_19
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 513
    .line 514
    .line 515
    goto :goto_c

    .line 516
    :cond_1a
    move/from16 v21, v11

    .line 517
    .line 518
    :goto_c
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v10}, Lyyds/ᲇᲇᛲᛲ;->ᛵᛸᛸᛷ()Z

    .line 522
    .line 523
    .line 524
    move-result v4

    .line 525
    const/high16 v6, 0x3f800000    # 1.0f

    .line 526
    .line 527
    if-eqz v4, :cond_24

    .line 528
    .line 529
    iget v4, v10, Lyyds/ᲇᲇᛲᛲ;->ᛲᲈᲁ:I

    .line 530
    .line 531
    const/4 v14, 0x1

    .line 532
    if-ne v4, v14, :cond_25

    .line 533
    .line 534
    iget-boolean v4, v10, Lyyds/ᲇᲇᛲᛲ;->ᲇᲇᲇᛱ:Z

    .line 535
    .line 536
    if-nez v4, :cond_21

    .line 537
    .line 538
    invoke-virtual/range {v20 .. v20}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 539
    .line 540
    .line 541
    move-result-object v4

    .line 542
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 543
    .line 544
    .line 545
    move-result-object v4

    .line 546
    cmpl-float v11, v1, v5

    .line 547
    .line 548
    if-nez v11, :cond_1b

    .line 549
    .line 550
    const/high16 v1, 0x41400000    # 12.0f

    .line 551
    .line 552
    const/4 v14, 0x2

    .line 553
    invoke-static {v14, v1, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 554
    .line 555
    .line 556
    move-result v1

    .line 557
    goto :goto_d

    .line 558
    :cond_1b
    const/4 v14, 0x2

    .line 559
    :goto_d
    cmpl-float v11, v15, v5

    .line 560
    .line 561
    if-nez v11, :cond_1c

    .line 562
    .line 563
    const/high16 v11, 0x42e00000    # 112.0f

    .line 564
    .line 565
    invoke-static {v14, v11, v4}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 566
    .line 567
    .line 568
    move-result v15

    .line 569
    :cond_1c
    cmpl-float v4, v0, v5

    .line 570
    .line 571
    if-nez v4, :cond_1d

    .line 572
    .line 573
    move v0, v6

    .line 574
    :cond_1d
    cmpg-float v4, v1, v16

    .line 575
    .line 576
    const-string v11, "px) is less or equal to (0px)"

    .line 577
    .line 578
    if-lez v4, :cond_20

    .line 579
    .line 580
    cmpg-float v4, v15, v1

    .line 581
    .line 582
    if-lez v4, :cond_1f

    .line 583
    .line 584
    cmpg-float v4, v0, v16

    .line 585
    .line 586
    if-lez v4, :cond_1e

    .line 587
    .line 588
    const/4 v14, 0x1

    .line 589
    iput v14, v10, Lyyds/ᲇᲇᛲᛲ;->ᛲᲈᲁ:I

    .line 590
    .line 591
    iput v1, v10, Lyyds/ᲇᲇᛲᛲ;->ᲀᛲᛳᲀ:F

    .line 592
    .line 593
    iput v15, v10, Lyyds/ᲇᲇᛲᛲ;->ᲇᲈᛵᛷ:F

    .line 594
    .line 595
    iput v0, v10, Lyyds/ᲇᲇᛲᛲ;->ᛵᛸᛸᛷ:F

    .line 596
    .line 597
    move/from16 v0, v21

    .line 598
    .line 599
    iput-boolean v0, v10, Lyyds/ᲇᲇᛲᛲ;->ᲇᲇᲇᛱ:Z

    .line 600
    .line 601
    goto :goto_e

    .line 602
    :cond_1e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 603
    .line 604
    new-instance v2, Ljava/lang/StringBuilder;

    .line 605
    .line 606
    const-string v3, "The auto-size step granularity ("

    .line 607
    .line 608
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 615
    .line 616
    .line 617
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 622
    .line 623
    .line 624
    throw v1

    .line 625
    :cond_1f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 626
    .line 627
    new-instance v2, Ljava/lang/StringBuilder;

    .line 628
    .line 629
    const-string v3, "Maximum auto-size text size ("

    .line 630
    .line 631
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 632
    .line 633
    .line 634
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 635
    .line 636
    .line 637
    const-string v3, "px) is less or equal to minimum auto-size text size ("

    .line 638
    .line 639
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 643
    .line 644
    .line 645
    const-string v1, "px)"

    .line 646
    .line 647
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 648
    .line 649
    .line 650
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v1

    .line 654
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    throw v0

    .line 658
    :cond_20
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 659
    .line 660
    new-instance v2, Ljava/lang/StringBuilder;

    .line 661
    .line 662
    const-string v3, "Minimum auto-size text size ("

    .line 663
    .line 664
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 665
    .line 666
    .line 667
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 668
    .line 669
    .line 670
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 671
    .line 672
    .line 673
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v1

    .line 677
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    throw v0

    .line 681
    :cond_21
    :goto_e
    invoke-virtual {v10}, Lyyds/ᲇᲇᛲᛲ;->ᛵᛸᛸᛷ()Z

    .line 682
    .line 683
    .line 684
    move-result v0

    .line 685
    if-eqz v0, :cond_25

    .line 686
    .line 687
    iget v0, v10, Lyyds/ᲇᲇᛲᛲ;->ᛲᲈᲁ:I

    .line 688
    .line 689
    const/4 v14, 0x1

    .line 690
    if-ne v0, v14, :cond_25

    .line 691
    .line 692
    iget-boolean v0, v10, Lyyds/ᲇᲇᛲᛲ;->ᲇᲇᲇᛱ:Z

    .line 693
    .line 694
    if-eqz v0, :cond_22

    .line 695
    .line 696
    iget-object v0, v10, Lyyds/ᲇᲇᛲᛲ;->ᛲᛴᛳᛲ:[I

    .line 697
    .line 698
    array-length v0, v0

    .line 699
    if-nez v0, :cond_25

    .line 700
    .line 701
    :cond_22
    iget v0, v10, Lyyds/ᲇᲇᛲᛲ;->ᲇᲈᛵᛷ:F

    .line 702
    .line 703
    iget v1, v10, Lyyds/ᲇᲇᛲᛲ;->ᲀᛲᛳᲀ:F

    .line 704
    .line 705
    sub-float/2addr v0, v1

    .line 706
    iget v1, v10, Lyyds/ᲇᲇᛲᛲ;->ᛵᛸᛸᛷ:F

    .line 707
    .line 708
    div-float/2addr v0, v1

    .line 709
    float-to-double v0, v0

    .line 710
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    .line 711
    .line 712
    .line 713
    move-result-wide v0

    .line 714
    double-to-int v0, v0

    .line 715
    const/16 v19, 0x1

    .line 716
    .line 717
    add-int/lit8 v0, v0, 0x1

    .line 718
    .line 719
    new-array v1, v0, [I

    .line 720
    .line 721
    const/4 v4, 0x0

    .line 722
    :goto_f
    if-ge v4, v0, :cond_23

    .line 723
    .line 724
    iget v11, v10, Lyyds/ᲇᲇᛲᛲ;->ᲀᛲᛳᲀ:F

    .line 725
    .line 726
    int-to-float v13, v4

    .line 727
    iget v14, v10, Lyyds/ᲇᲇᛲᛲ;->ᛵᛸᛸᛷ:F

    .line 728
    .line 729
    mul-float/2addr v13, v14

    .line 730
    add-float/2addr v13, v11

    .line 731
    invoke-static {v13}, Ljava/lang/Math;->round(F)I

    .line 732
    .line 733
    .line 734
    move-result v11

    .line 735
    aput v11, v1, v4

    .line 736
    .line 737
    add-int/lit8 v4, v4, 0x1

    .line 738
    .line 739
    goto :goto_f

    .line 740
    :cond_23
    invoke-static {v1}, Lyyds/ᲇᲇᛲᛲ;->ᛲᲈᲁ([I)[I

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    iput-object v0, v10, Lyyds/ᲇᲇᛲᛲ;->ᛲᛴᛳᛲ:[I

    .line 745
    .line 746
    goto :goto_10

    .line 747
    :cond_24
    move/from16 v0, v21

    .line 748
    .line 749
    iput v0, v10, Lyyds/ᲇᲇᛲᛲ;->ᛲᲈᲁ:I

    .line 750
    .line 751
    :cond_25
    :goto_10
    sget-object v0, Lyyds/ᛷᛷᲈᛷ;->ᛲᲈᲁ:Ljava/lang/reflect/Method;

    .line 752
    .line 753
    iget v0, v10, Lyyds/ᲇᲇᛲᛲ;->ᛲᲈᲁ:I

    .line 754
    .line 755
    if-eqz v0, :cond_27

    .line 756
    .line 757
    iget-object v0, v10, Lyyds/ᲇᲇᛲᛲ;->ᛲᛴᛳᛲ:[I

    .line 758
    .line 759
    array-length v1, v0

    .line 760
    if-lez v1, :cond_27

    .line 761
    .line 762
    invoke-static {v7}, Lyyds/ᛱᛲᛵᛴ;->ᛲᲈᲁ(Landroid/widget/TextView;)I

    .line 763
    .line 764
    .line 765
    move-result v1

    .line 766
    int-to-float v1, v1

    .line 767
    cmpl-float v1, v1, v5

    .line 768
    .line 769
    if-eqz v1, :cond_26

    .line 770
    .line 771
    iget v0, v10, Lyyds/ᲇᲇᛲᛲ;->ᲀᛲᛳᲀ:F

    .line 772
    .line 773
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 774
    .line 775
    .line 776
    move-result v0

    .line 777
    iget v1, v10, Lyyds/ᲇᲇᛲᛲ;->ᲇᲈᛵᛷ:F

    .line 778
    .line 779
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 780
    .line 781
    .line 782
    move-result v1

    .line 783
    iget v4, v10, Lyyds/ᲇᲇᛲᛲ;->ᛵᛸᛸᛷ:F

    .line 784
    .line 785
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 786
    .line 787
    .line 788
    move-result v4

    .line 789
    const/4 v5, 0x0

    .line 790
    invoke-static {v7, v0, v1, v4, v5}, Lyyds/ᛱᛲᛵᛴ;->ᛵᛸᛸᛷ(Landroid/widget/TextView;IIII)V

    .line 791
    .line 792
    .line 793
    goto :goto_11

    .line 794
    :cond_26
    const/4 v5, 0x0

    .line 795
    invoke-static {v7, v0, v5}, Lyyds/ᛱᛲᛵᛴ;->ᲀᛲᛳᲀ(Landroid/widget/TextView;[II)V

    .line 796
    .line 797
    .line 798
    :cond_27
    :goto_11
    invoke-virtual {v8, v3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 799
    .line 800
    .line 801
    move-result-object v0

    .line 802
    const/16 v1, 0x8

    .line 803
    .line 804
    invoke-virtual {v0, v1, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 805
    .line 806
    .line 807
    move-result v1

    .line 808
    if-eq v1, v12, :cond_28

    .line 809
    .line 810
    invoke-virtual {v9, v8, v1}, Lyyds/ᛷᛴᛸᛱ;->ᛵᛸᛸᛷ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 811
    .line 812
    .line 813
    move-result-object v1

    .line 814
    :goto_12
    const/16 v2, 0xd

    .line 815
    .line 816
    goto :goto_13

    .line 817
    :cond_28
    const/4 v1, 0x0

    .line 818
    goto :goto_12

    .line 819
    :goto_13
    invoke-virtual {v0, v2, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 820
    .line 821
    .line 822
    move-result v2

    .line 823
    if-eq v2, v12, :cond_29

    .line 824
    .line 825
    invoke-virtual {v9, v8, v2}, Lyyds/ᛷᛴᛸᛱ;->ᛵᛸᛸᛷ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 826
    .line 827
    .line 828
    move-result-object v2

    .line 829
    goto :goto_14

    .line 830
    :cond_29
    const/4 v2, 0x0

    .line 831
    :goto_14
    const/16 v3, 0x9

    .line 832
    .line 833
    invoke-virtual {v0, v3, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 834
    .line 835
    .line 836
    move-result v3

    .line 837
    if-eq v3, v12, :cond_2a

    .line 838
    .line 839
    invoke-virtual {v9, v8, v3}, Lyyds/ᛷᛴᛸᛱ;->ᛵᛸᛸᛷ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 840
    .line 841
    .line 842
    move-result-object v3

    .line 843
    :goto_15
    const/4 v4, 0x6

    .line 844
    goto :goto_16

    .line 845
    :cond_2a
    const/4 v3, 0x0

    .line 846
    goto :goto_15

    .line 847
    :goto_16
    invoke-virtual {v0, v4, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 848
    .line 849
    .line 850
    move-result v4

    .line 851
    if-eq v4, v12, :cond_2b

    .line 852
    .line 853
    invoke-virtual {v9, v8, v4}, Lyyds/ᛷᛴᛸᛱ;->ᛵᛸᛸᛷ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 854
    .line 855
    .line 856
    move-result-object v4

    .line 857
    goto :goto_17

    .line 858
    :cond_2b
    const/4 v4, 0x0

    .line 859
    :goto_17
    const/16 v5, 0xa

    .line 860
    .line 861
    invoke-virtual {v0, v5, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 862
    .line 863
    .line 864
    move-result v5

    .line 865
    if-eq v5, v12, :cond_2c

    .line 866
    .line 867
    invoke-virtual {v9, v8, v5}, Lyyds/ᛷᛴᛸᛱ;->ᛵᛸᛸᛷ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 868
    .line 869
    .line 870
    move-result-object v5

    .line 871
    goto :goto_18

    .line 872
    :cond_2c
    const/4 v5, 0x0

    .line 873
    :goto_18
    const/4 v10, 0x7

    .line 874
    invoke-virtual {v0, v10, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 875
    .line 876
    .line 877
    move-result v10

    .line 878
    if-eq v10, v12, :cond_2d

    .line 879
    .line 880
    invoke-virtual {v9, v8, v10}, Lyyds/ᛷᛴᛸᛱ;->ᛵᛸᛸᛷ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 881
    .line 882
    .line 883
    move-result-object v9

    .line 884
    goto :goto_19

    .line 885
    :cond_2d
    const/4 v9, 0x0

    .line 886
    :goto_19
    if-nez v5, :cond_38

    .line 887
    .line 888
    if-eqz v9, :cond_2e

    .line 889
    .line 890
    goto :goto_22

    .line 891
    :cond_2e
    if-nez v1, :cond_2f

    .line 892
    .line 893
    if-nez v2, :cond_2f

    .line 894
    .line 895
    if-nez v3, :cond_2f

    .line 896
    .line 897
    if-eqz v4, :cond_3d

    .line 898
    .line 899
    :cond_2f
    invoke-static {v7}, Lyyds/ᛷᛶᲁᛱ;->ᛲᲈᲁ(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    .line 900
    .line 901
    .line 902
    move-result-object v5

    .line 903
    const/16 v21, 0x0

    .line 904
    .line 905
    aget-object v9, v5, v21

    .line 906
    .line 907
    if-nez v9, :cond_35

    .line 908
    .line 909
    const/16 v22, 0x2

    .line 910
    .line 911
    aget-object v10, v5, v22

    .line 912
    .line 913
    if-eqz v10, :cond_30

    .line 914
    .line 915
    goto :goto_1e

    .line 916
    :cond_30
    invoke-virtual {v7}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 917
    .line 918
    .line 919
    move-result-object v5

    .line 920
    if-eqz v1, :cond_31

    .line 921
    .line 922
    goto :goto_1a

    .line 923
    :cond_31
    aget-object v1, v5, v21

    .line 924
    .line 925
    :goto_1a
    if-eqz v2, :cond_32

    .line 926
    .line 927
    goto :goto_1b

    .line 928
    :cond_32
    const/16 v19, 0x1

    .line 929
    .line 930
    aget-object v2, v5, v19

    .line 931
    .line 932
    :goto_1b
    if-eqz v3, :cond_33

    .line 933
    .line 934
    goto :goto_1c

    .line 935
    :cond_33
    const/16 v22, 0x2

    .line 936
    .line 937
    aget-object v3, v5, v22

    .line 938
    .line 939
    :goto_1c
    if-eqz v4, :cond_34

    .line 940
    .line 941
    goto :goto_1d

    .line 942
    :cond_34
    const/16 v18, 0x3

    .line 943
    .line 944
    aget-object v4, v5, v18

    .line 945
    .line 946
    :goto_1d
    invoke-virtual {v7, v1, v2, v3, v4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 947
    .line 948
    .line 949
    goto :goto_27

    .line 950
    :cond_35
    :goto_1e
    if-eqz v2, :cond_36

    .line 951
    .line 952
    :goto_1f
    const/16 v22, 0x2

    .line 953
    .line 954
    goto :goto_20

    .line 955
    :cond_36
    const/16 v19, 0x1

    .line 956
    .line 957
    aget-object v2, v5, v19

    .line 958
    .line 959
    goto :goto_1f

    .line 960
    :goto_20
    aget-object v1, v5, v22

    .line 961
    .line 962
    if-eqz v4, :cond_37

    .line 963
    .line 964
    goto :goto_21

    .line 965
    :cond_37
    const/16 v18, 0x3

    .line 966
    .line 967
    aget-object v4, v5, v18

    .line 968
    .line 969
    :goto_21
    invoke-static {v7, v9, v2, v1, v4}, Lyyds/ᛷᛶᲁᛱ;->ᛵᛸᛸᛷ(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 970
    .line 971
    .line 972
    goto :goto_27

    .line 973
    :cond_38
    :goto_22
    invoke-static {v7}, Lyyds/ᛷᛶᲁᛱ;->ᛲᲈᲁ(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;

    .line 974
    .line 975
    .line 976
    move-result-object v1

    .line 977
    if-eqz v5, :cond_39

    .line 978
    .line 979
    goto :goto_23

    .line 980
    :cond_39
    const/16 v21, 0x0

    .line 981
    .line 982
    aget-object v5, v1, v21

    .line 983
    .line 984
    :goto_23
    if-eqz v2, :cond_3a

    .line 985
    .line 986
    goto :goto_24

    .line 987
    :cond_3a
    const/16 v19, 0x1

    .line 988
    .line 989
    aget-object v2, v1, v19

    .line 990
    .line 991
    :goto_24
    if-eqz v9, :cond_3b

    .line 992
    .line 993
    goto :goto_25

    .line 994
    :cond_3b
    const/16 v22, 0x2

    .line 995
    .line 996
    aget-object v9, v1, v22

    .line 997
    .line 998
    :goto_25
    if-eqz v4, :cond_3c

    .line 999
    .line 1000
    goto :goto_26

    .line 1001
    :cond_3c
    const/16 v18, 0x3

    .line 1002
    .line 1003
    aget-object v4, v1, v18

    .line 1004
    .line 1005
    :goto_26
    invoke-static {v7, v5, v2, v9, v4}, Lyyds/ᛷᛶᲁᛱ;->ᛵᛸᛸᛷ(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 1006
    .line 1007
    .line 1008
    :cond_3d
    :goto_27
    const/16 v1, 0xb

    .line 1009
    .line 1010
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 1011
    .line 1012
    .line 1013
    move-result v2

    .line 1014
    if-eqz v2, :cond_3f

    .line 1015
    .line 1016
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 1017
    .line 1018
    .line 1019
    move-result v2

    .line 1020
    if-eqz v2, :cond_3e

    .line 1021
    .line 1022
    const/4 v5, 0x0

    .line 1023
    invoke-virtual {v0, v1, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 1024
    .line 1025
    .line 1026
    move-result v2

    .line 1027
    if-eqz v2, :cond_3e

    .line 1028
    .line 1029
    invoke-static {v8, v2}, Lyyds/ᲈᲈᲈᛴ;->ᛲᛴᛳᛲ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v2

    .line 1033
    if-eqz v2, :cond_3e

    .line 1034
    .line 1035
    goto :goto_28

    .line 1036
    :cond_3e
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v2

    .line 1040
    :goto_28
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setCompoundDrawableTintList(Landroid/content/res/ColorStateList;)V

    .line 1041
    .line 1042
    .line 1043
    :cond_3f
    const/16 v1, 0xc

    .line 1044
    .line 1045
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 1046
    .line 1047
    .line 1048
    move-result v2

    .line 1049
    if-eqz v2, :cond_40

    .line 1050
    .line 1051
    invoke-virtual {v0, v1, v12}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 1052
    .line 1053
    .line 1054
    move-result v1

    .line 1055
    const/4 v2, 0x0

    .line 1056
    invoke-static {v1, v2}, Lyyds/ᲀᲈᛸᛸ;->ᛵᛸᛸᛷ(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v1

    .line 1060
    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setCompoundDrawableTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 1061
    .line 1062
    .line 1063
    :cond_40
    const/16 v1, 0xf

    .line 1064
    .line 1065
    invoke-virtual {v0, v1, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1066
    .line 1067
    .line 1068
    move-result v1

    .line 1069
    const/16 v2, 0x12

    .line 1070
    .line 1071
    invoke-virtual {v0, v2, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1072
    .line 1073
    .line 1074
    move-result v2

    .line 1075
    const/16 v3, 0x13

    .line 1076
    .line 1077
    invoke-virtual {v0, v3, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 1078
    .line 1079
    .line 1080
    move-result v3

    .line 1081
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 1082
    .line 1083
    .line 1084
    if-eq v1, v12, :cond_42

    .line 1085
    .line 1086
    if-ltz v1, :cond_41

    .line 1087
    .line 1088
    invoke-virtual {v7, v1}, Landroid/widget/TextView;->setFirstBaselineToTopHeight(I)V

    .line 1089
    .line 1090
    .line 1091
    goto :goto_29

    .line 1092
    :cond_41
    invoke-static {}, Lyyds/ᛷᲈᲈᛶ;->ᛲᲈᲁ()V

    .line 1093
    .line 1094
    .line 1095
    return-void

    .line 1096
    :cond_42
    :goto_29
    if-eq v2, v12, :cond_45

    .line 1097
    .line 1098
    if-ltz v2, :cond_44

    .line 1099
    .line 1100
    invoke-virtual {v7}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v0

    .line 1104
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v0

    .line 1108
    invoke-virtual {v7}, Landroid/widget/TextView;->getIncludeFontPadding()Z

    .line 1109
    .line 1110
    .line 1111
    move-result v1

    .line 1112
    if-eqz v1, :cond_43

    .line 1113
    .line 1114
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 1115
    .line 1116
    goto :goto_2a

    .line 1117
    :cond_43
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 1118
    .line 1119
    :goto_2a
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 1120
    .line 1121
    .line 1122
    move-result v1

    .line 1123
    if-le v2, v1, :cond_45

    .line 1124
    .line 1125
    sub-int/2addr v2, v0

    .line 1126
    invoke-virtual {v7}, Landroid/view/View;->getPaddingLeft()I

    .line 1127
    .line 1128
    .line 1129
    move-result v0

    .line 1130
    invoke-virtual {v7}, Landroid/view/View;->getPaddingTop()I

    .line 1131
    .line 1132
    .line 1133
    move-result v1

    .line 1134
    invoke-virtual {v7}, Landroid/view/View;->getPaddingRight()I

    .line 1135
    .line 1136
    .line 1137
    move-result v4

    .line 1138
    invoke-virtual {v7, v0, v1, v4, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1139
    .line 1140
    .line 1141
    goto :goto_2b

    .line 1142
    :cond_44
    invoke-static {}, Lyyds/ᛷᲈᲈᛶ;->ᛲᲈᲁ()V

    .line 1143
    .line 1144
    .line 1145
    return-void

    .line 1146
    :cond_45
    :goto_2b
    if-eq v3, v12, :cond_47

    .line 1147
    .line 1148
    if-ltz v3, :cond_46

    .line 1149
    .line 1150
    invoke-virtual {v7}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v0

    .line 1154
    const/4 v2, 0x0

    .line 1155
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    .line 1156
    .line 1157
    .line 1158
    move-result v0

    .line 1159
    if-eq v3, v0, :cond_47

    .line 1160
    .line 1161
    sub-int/2addr v3, v0

    .line 1162
    int-to-float v0, v3

    .line 1163
    invoke-virtual {v7, v0, v6}, Landroid/widget/TextView;->setLineSpacing(FF)V

    .line 1164
    .line 1165
    .line 1166
    return-void

    .line 1167
    :cond_46
    invoke-static {}, Lyyds/ᛷᲈᲈᛶ;->ᛲᲈᲁ()V

    .line 1168
    .line 1169
    .line 1170
    :cond_47
    return-void
.end method

.method public final ᲇᲈᛵᛷ()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᛲᛶᲁ;->ᛱᲈᲁ:Lyyds/ᲈᲀᛲᛴ;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᲈᲀᛲᛴ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method
