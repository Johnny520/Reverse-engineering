.class public final Lxhss/ᛵᲇᲇᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/lang/Object;

.field public final ᛳᲁᲇᛸ:Ljava/lang/Object;

.field public ᛷᛴᛷᛱ:Ljava/lang/Object;

.field public ᛷᛵᛵᲈ:I

.field public ᲇᛴᲇᛵ:Ljava/lang/Object;

.field public ᲇᛶᛴᲀ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lxhss/ᛵᲇᲇᲇ;->ᛷᛵᛵᲈ:I

    .line 6
    .line 7
    iput-object p1, p0, Lxhss/ᛵᲇᲇᲇ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 8
    .line 9
    sget-object p1, Lxhss/ᛲᛳᲈᛲ;->ᛱᛱᛲᲇ:Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    const-class p1, Lxhss/ᛲᛳᲈᛲ;

    .line 12
    .line 13
    monitor-enter p1

    .line 14
    :try_start_0
    sget-object v0, Lxhss/ᛲᛳᲈᛲ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛳᲈᛲ;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-static {}, Lxhss/ᛲᛳᲈᛲ;->ᛱᛱᛲᲇ()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    sget-object v0, Lxhss/ᛲᛳᲈᛲ;->ᛳᲁᲇᛸ:Lxhss/ᛲᛳᲈᛲ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    monitor-exit p1

    .line 27
    iput-object v0, p0, Lxhss/ᛵᲇᲇᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 28
    .line 29
    return-void

    .line 30
    :goto_1
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    throw p0
.end method

.method public constructor <init>(Lxhss/ᛵᲇᲇᲇ;Lxhss/ᲁᲁᛱᲀ;Lxhss/ᲁᲁᛱᲀ;)V
    .locals 7

    .line 38
    iget-object v0, p1, Lxhss/ᛵᲇᲇᲇ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lxhss/ᲁᲁᛱᲀ;

    iget v5, p1, Lxhss/ᛵᲇᲇᲇ;->ᛷᛵᛵᲈ:I

    iget-object v0, p1, Lxhss/ᛵᲇᲇᲇ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v1 .. v6}, Lxhss/ᛵᲇᲇᲇ;-><init>(Lxhss/ᲁᲁᛱᲀ;Lxhss/ᲁᲁᛱᲀ;Lxhss/ᲁᲁᛱᲀ;ILjava/lang/String;)V

    .line 39
    iget-object p0, p1, Lxhss/ᛵᲇᲇᲇ;->ᲇᛶᛴᲀ:Ljava/lang/Object;

    check-cast p0, Lxhss/ᛵᲇᲇᲇ;

    iput-object p0, v1, Lxhss/ᛵᲇᲇᲇ;->ᲇᛶᛴᲀ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lxhss/ᲁᲁᛱᲀ;Lxhss/ᲁᲁᛱᲀ;Lxhss/ᲁᲁᛱᲀ;ILjava/lang/String;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lxhss/ᛵᲇᲇᲇ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 34
    iput-object p2, p0, Lxhss/ᛵᲇᲇᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 35
    iput-object p3, p0, Lxhss/ᛵᲇᲇᲇ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 36
    iput p4, p0, Lxhss/ᛵᲇᲇᲇ;->ᛷᛵᛵᲈ:I

    .line 37
    iput-object p5, p0, Lxhss/ᛵᲇᲇᲇ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    return-void
.end method

.method public static ᛳᲁᲇᛸ(Lxhss/ᛵᲇᲇᲇ;Lxhss/ᲁᲁᛱᲀ;Lxhss/ᲁᲁᛱᲀ;)Lxhss/ᛵᲇᲇᲇ;
    .locals 7

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    iget-object v0, p0, Lxhss/ᛵᲇᲇᲇ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lxhss/ᲁᲁᛱᲀ;

    .line 8
    .line 9
    iget-object v1, p0, Lxhss/ᛵᲇᲇᲇ;->ᲇᛶᛴᲀ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lxhss/ᛵᲇᲇᲇ;

    .line 12
    .line 13
    invoke-static {v1, p1, p2}, Lxhss/ᛵᲇᲇᲇ;->ᛳᲁᲇᛸ(Lxhss/ᛵᲇᲇᲇ;Lxhss/ᲁᲁᛱᲀ;Lxhss/ᲁᲁᛱᲀ;)Lxhss/ᛵᲇᲇᲇ;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iput-object v1, p0, Lxhss/ᛵᲇᲇᲇ;->ᲇᛶᛴᲀ:Ljava/lang/Object;

    .line 18
    .line 19
    iget v2, v0, Lxhss/ᲁᲁᛱᲀ;->ᲇᛴᲇᛵ:I

    .line 20
    .line 21
    iget-object v3, p0, Lxhss/ᛵᲇᲇᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, Lxhss/ᲁᲁᛱᲀ;

    .line 24
    .line 25
    iget v4, v3, Lxhss/ᲁᲁᛱᲀ;->ᲇᛴᲇᛵ:I

    .line 26
    .line 27
    iget v5, p1, Lxhss/ᲁᲁᛱᲀ;->ᲇᛴᲇᛵ:I

    .line 28
    .line 29
    if-nez p2, :cond_1

    .line 30
    .line 31
    const v6, 0x7fffffff

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget v6, p2, Lxhss/ᲁᲁᛱᲀ;->ᲇᛴᲇᛵ:I

    .line 36
    .line 37
    :goto_0
    if-ge v5, v4, :cond_6

    .line 38
    .line 39
    if-gt v6, v2, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    if-gt v5, v2, :cond_4

    .line 43
    .line 44
    if-lt v6, v4, :cond_3

    .line 45
    .line 46
    return-object v1

    .line 47
    :cond_3
    new-instance p1, Lxhss/ᛵᲇᲇᲇ;

    .line 48
    .line 49
    invoke-direct {p1, p0, p2, v3}, Lxhss/ᛵᲇᲇᲇ;-><init>(Lxhss/ᛵᲇᲇᲇ;Lxhss/ᲁᲁᛱᲀ;Lxhss/ᲁᲁᛱᲀ;)V

    .line 50
    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_4
    if-lt v6, v4, :cond_5

    .line 54
    .line 55
    new-instance p2, Lxhss/ᛵᲇᲇᲇ;

    .line 56
    .line 57
    invoke-direct {p2, p0, v0, p1}, Lxhss/ᛵᲇᲇᲇ;-><init>(Lxhss/ᛵᲇᲇᲇ;Lxhss/ᲁᲁᛱᲀ;Lxhss/ᲁᲁᛱᲀ;)V

    .line 58
    .line 59
    .line 60
    return-object p2

    .line 61
    :cond_5
    new-instance v1, Lxhss/ᛵᲇᲇᲇ;

    .line 62
    .line 63
    invoke-direct {v1, p0, p2, v3}, Lxhss/ᛵᲇᲇᲇ;-><init>(Lxhss/ᛵᲇᲇᲇ;Lxhss/ᲁᲁᛱᲀ;Lxhss/ᲁᲁᛱᲀ;)V

    .line 64
    .line 65
    .line 66
    iput-object v1, p0, Lxhss/ᛵᲇᲇᲇ;->ᲇᛶᛴᲀ:Ljava/lang/Object;

    .line 67
    .line 68
    new-instance p2, Lxhss/ᛵᲇᲇᲇ;

    .line 69
    .line 70
    invoke-direct {p2, p0, v0, p1}, Lxhss/ᛵᲇᲇᲇ;-><init>(Lxhss/ᛵᲇᲇᲇ;Lxhss/ᲁᲁᛱᲀ;Lxhss/ᲁᲁᛱᲀ;)V

    .line 71
    .line 72
    .line 73
    return-object p2

    .line 74
    :cond_6
    :goto_1
    return-object p0
.end method


# virtual methods
.method public ᛱᛱᛲᲇ(Landroid/util/AttributeSet;I)V
    .locals 10

    .line 1
    iget-object v0, p0, Lxhss/ᛵᲇᲇᲇ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/widget/TextView;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v4, Lxhss/ᛳᛷᲈ;->ᛸᛴᛶᛳ:[I

    .line 10
    .line 11
    const/4 v9, 0x0

    .line 12
    invoke-virtual {v1, p1, v4, p2, v9}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    iget-object v2, p0, Lxhss/ᛵᲇᲇᲇ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, Landroid/widget/TextView;

    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    sget v5, Lxhss/ᛷᛱᛴᛴ;->ᛷᛵᛵᲈ:I

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    move-object v5, p1

    .line 28
    move v7, p2

    .line 29
    invoke-static/range {v2 .. v8}, Lxhss/ᛴᲇᛱ;->ᛱᛱᛲᲇ(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 30
    .line 31
    .line 32
    :try_start_0
    invoke-virtual {v6, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    const/4 p2, -0x1

    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    invoke-virtual {v6, v9, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    iput p1, p0, Lxhss/ᛵᲇᲇᲇ;->ᛷᛵᛵᲈ:I

    .line 44
    .line 45
    iget-object p1, p0, Lxhss/ᛵᲇᲇᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Lxhss/ᛲᛳᲈᛲ;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    iget v3, p0, Lxhss/ᛵᲇᲇᲇ;->ᛷᛵᛵᲈ:I

    .line 54
    .line 55
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    :try_start_1
    iget-object v4, p1, Lxhss/ᛲᛳᲈᛲ;->ᛷᛵᛵᲈ:Lxhss/ᛱᲈᲁᛴ;

    .line 57
    .line 58
    invoke-virtual {v4, v2, v3}, Lxhss/ᛱᲈᲁᛴ;->ᲀᲇᛳᲁ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 59
    .line 60
    .line 61
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 62
    :try_start_2
    monitor-exit p1

    .line 63
    if-eqz v2, :cond_0

    .line 64
    .line 65
    invoke-virtual {p0, v2}, Lxhss/ᛵᲇᲇᲇ;->ᲇᛴᲇᛵ(Landroid/content/res/ColorStateList;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception v0

    .line 70
    move-object p0, v0

    .line 71
    goto :goto_2

    .line 72
    :catchall_1
    move-exception v0

    .line 73
    move-object p0, v0

    .line 74
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 75
    :try_start_4
    throw p0

    .line 76
    :cond_0
    :goto_0
    const/4 p0, 0x1

    .line 77
    invoke-virtual {v6, p0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_2

    .line 82
    .line 83
    invoke-virtual {v6, p0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_1

    .line 88
    .line 89
    invoke-virtual {v6, p0, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_1

    .line 94
    .line 95
    invoke-static {v1, p1}, Lxhss/ᛶᲈᛴᛲ;->ᛷᲁᲁ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-eqz p1, :cond_1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    invoke-virtual {v6, p0}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    :goto_1
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 107
    .line 108
    .line 109
    :cond_2
    const/4 p0, 0x2

    .line 110
    invoke-virtual {v6, p0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-eqz p1, :cond_3

    .line 115
    .line 116
    invoke-virtual {v6, p0, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    invoke-static {p0}, Lxhss/ᛴᛵᛵᲈ;->ᛷᛵᛵᲈ(I)Landroid/graphics/PorterDuff$Mode;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 125
    .line 126
    .line 127
    :cond_3
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :goto_2
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 132
    .line 133
    .line 134
    throw p0
.end method

.method public ᛷᛵᛵᲈ()V
    .locals 5

    .line 1
    iget-object v0, p0, Lxhss/ᛵᲇᲇᲇ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/widget/TextView;

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
    iget-object v2, p0, Lxhss/ᛵᲇᲇᲇ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Lxhss/ᛵᛳᛱᲇ;

    .line 14
    .line 15
    if-eqz v2, :cond_4

    .line 16
    .line 17
    iget-object v2, p0, Lxhss/ᛵᲇᲇᲇ;->ᲇᛶᛴᲀ:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lxhss/ᛵᛳᛱᲇ;

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    new-instance v2, Lxhss/ᛵᛳᛱᲇ;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v2, p0, Lxhss/ᛵᲇᲇᲇ;->ᲇᛶᛴᲀ:Ljava/lang/Object;

    .line 29
    .line 30
    :cond_0
    const/4 v3, 0x0

    .line 31
    iput-object v3, v2, Lxhss/ᛵᛳᛱᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    iput-boolean v4, v2, Lxhss/ᛵᛳᛱᲇ;->ᛱᛱᛲᲇ:Z

    .line 35
    .line 36
    iput-object v3, v2, Lxhss/ᛵᛳᛱᲇ;->ᲇᛴᲇᛵ:Ljava/io/Serializable;

    .line 37
    .line 38
    iput-boolean v4, v2, Lxhss/ᛵᛳᛱᲇ;->ᛷᛵᛵᲈ:Z

    .line 39
    .line 40
    sget v3, Lxhss/ᛷᛱᛴᛴ;->ᛷᛵᛵᲈ:I

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/view/View;->getBackgroundTintList()Landroid/content/res/ColorStateList;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    const/4 v4, 0x1

    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    iput-boolean v4, v2, Lxhss/ᛵᛳᛱᲇ;->ᛱᛱᛲᲇ:Z

    .line 50
    .line 51
    iput-object v3, v2, Lxhss/ᛵᛳᛱᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 52
    .line 53
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    iput-boolean v4, v2, Lxhss/ᛵᛳᛱᲇ;->ᛷᛵᛵᲈ:Z

    .line 60
    .line 61
    iput-object v3, v2, Lxhss/ᛵᛳᛱᲇ;->ᲇᛴᲇᛵ:Ljava/io/Serializable;

    .line 62
    .line 63
    :cond_2
    iget-boolean v3, v2, Lxhss/ᛵᛳᛱᲇ;->ᛱᛱᛲᲇ:Z

    .line 64
    .line 65
    if-nez v3, :cond_3

    .line 66
    .line 67
    iget-boolean v3, v2, Lxhss/ᛵᛳᛱᲇ;->ᛷᛵᛵᲈ:Z

    .line 68
    .line 69
    if-eqz v3, :cond_4

    .line 70
    .line 71
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    sget-object v0, Lxhss/ᛲᛳᲈᛲ;->ᛱᛱᛲᲇ:Landroid/graphics/PorterDuff$Mode;

    .line 76
    .line 77
    invoke-static {v1, v2, p0}, Lxhss/ᛱᲈᲁᛴ;->ᛸᛲᲀᛵ(Landroid/graphics/drawable/Drawable;Lxhss/ᛵᛳᛱᲇ;[I)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_4
    iget-object v2, p0, Lxhss/ᛵᲇᲇᲇ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, Lxhss/ᛵᛳᛱᲇ;

    .line 84
    .line 85
    if-eqz v2, :cond_5

    .line 86
    .line 87
    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    sget-object v0, Lxhss/ᛲᛳᲈᛲ;->ᛱᛱᛲᲇ:Landroid/graphics/PorterDuff$Mode;

    .line 92
    .line 93
    invoke-static {v1, v2, p0}, Lxhss/ᛱᲈᲁᛴ;->ᛸᛲᲀᛵ(Landroid/graphics/drawable/Drawable;Lxhss/ᛵᛳᛱᲇ;[I)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_5
    iget-object p0, p0, Lxhss/ᛵᲇᲇᲇ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p0, Lxhss/ᛵᛳᛱᲇ;

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
    sget-object v2, Lxhss/ᛲᛳᲈᛲ;->ᛱᛱᛲᲇ:Landroid/graphics/PorterDuff$Mode;

    .line 108
    .line 109
    invoke-static {v1, p0, v0}, Lxhss/ᛱᲈᲁᛴ;->ᛸᛲᲀᛵ(Landroid/graphics/drawable/Drawable;Lxhss/ᛵᛳᛱᲇ;[I)V

    .line 110
    .line 111
    .line 112
    :cond_6
    return-void
.end method

.method public ᲇᛴᲇᛵ(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lxhss/ᛵᲇᲇᲇ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lxhss/ᛵᛳᛱᲇ;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lxhss/ᛵᛳᛱᲇ;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lxhss/ᛵᲇᲇᲇ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 15
    .line 16
    :cond_0
    iput-object p1, v0, Lxhss/ᛵᛳᛱᲇ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, v0, Lxhss/ᛵᛳᛱᲇ;->ᛱᛱᛲᲇ:Z

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    iput-object p1, p0, Lxhss/ᛵᲇᲇᲇ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 24
    .line 25
    :goto_0
    invoke-virtual {p0}, Lxhss/ᛵᲇᲇᲇ;->ᛷᛵᛵᲈ()V

    .line 26
    .line 27
    .line 28
    return-void
.end method
