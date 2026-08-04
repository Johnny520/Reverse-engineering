.class public abstract Lyyds/ᲇᛸᛷᛳ;
.super Lyyds/ᲈᛲᲁᛳ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᛴᛳᛲ:I

.field public ᛶᛷᛲᲁ:[[Landroid/graphics/Rect;

.field public final ᲀᛲᛳᲀ:Landroid/view/WindowInsets;

.field public ᲇᲇᲇᛱ:[[Landroid/graphics/Rect;

.field public ᲇᲈᛵᛷ:Lyyds/ᛸᲀᲁᛲ;


# direct methods
.method public constructor <init>(Lyyds/ᲈᛶᲈᛴ;Landroid/view/WindowInsets;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lyyds/ᲈᛲᲁᛳ;-><init>(Lyyds/ᲈᛶᲈᛴ;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lyyds/ᲇᛸᛷᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛸᲀᲁᛲ;

    .line 6
    .line 7
    const/16 p1, 0xa

    .line 8
    .line 9
    new-array v0, p1, [[Landroid/graphics/Rect;

    .line 10
    .line 11
    iput-object v0, p0, Lyyds/ᲇᛸᛷᛳ;->ᲇᲇᲇᛱ:[[Landroid/graphics/Rect;

    .line 12
    .line 13
    new-array p1, p1, [[Landroid/graphics/Rect;

    .line 14
    .line 15
    iput-object p1, p0, Lyyds/ᲇᛸᛷᛳ;->ᛶᛷᛲᲁ:[[Landroid/graphics/Rect;

    .line 16
    .line 17
    iput-object p2, p0, Lyyds/ᲇᛸᛷᛳ;->ᲀᛲᛳᲀ:Landroid/view/WindowInsets;

    .line 18
    .line 19
    return-void
.end method

.method public static ᛲᛳᛴᛸ(II)Z
    .locals 0

    .line 1
    and-int/lit8 p0, p0, 0x6

    .line 2
    .line 3
    and-int/lit8 p1, p1, 0x6

    .line 4
    .line 5
    if-ne p0, p1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method private static ᛲᛶᛱᲈ([[Landroid/graphics/Rect;I)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([[",
            "Landroid/graphics/Rect;",
            "I)",
            "Ljava/util/List<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :goto_0
    const/16 v2, 0x200

    .line 4
    .line 5
    if-gt v1, v2, :cond_3

    .line 6
    .line 7
    and-int v2, p1, v1

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-static {v1}, Lyyds/ᛲᲇᲁᛳ;->ᛶᛷᛲᲁ(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    aget-object v2, p0, v2

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    if-nez v0, :cond_2

    .line 22
    .line 23
    move-object v0, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_2
    array-length v3, v0

    .line 26
    array-length v4, v2

    .line 27
    add-int/2addr v3, v4

    .line 28
    new-array v3, v3, [Landroid/graphics/Rect;

    .line 29
    .line 30
    array-length v4, v0

    .line 31
    const/4 v5, 0x0

    .line 32
    invoke-static {v0, v5, v3, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 33
    .line 34
    .line 35
    array-length v0, v0

    .line 36
    array-length v4, v2

    .line 37
    invoke-static {v2, v5, v3, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 38
    .line 39
    .line 40
    move-object v0, v3

    .line 41
    :goto_1
    shl-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    if-nez v0, :cond_4

    .line 45
    .line 46
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_4
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method

.method private ᛵᲀᲈᛴ(Landroid/view/View;)Lyyds/ᛱᛳᲇᛴ;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_1
    new-instance v0, Landroid/graphics/Point;

    .line 13
    .line 14
    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lyyds/ᲈᛲᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲈᛶᲈᛴ;

    .line 21
    .line 22
    iget-object p0, p0, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 23
    .line 24
    invoke-virtual {p0}, Lyyds/ᲈᛲᲁᛳ;->ᛳᲁᲁᲇ()Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_2

    .line 29
    .line 30
    iget v1, v0, Landroid/graphics/Point;->x:I

    .line 31
    .line 32
    iget v2, v0, Landroid/graphics/Point;->y:I

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v3, 0x1

    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    invoke-static/range {v1 .. v7}, Lyyds/ᛱᛳᲇᛴ;->ᛲᲈᲁ(IIZIIII)Lyyds/ᛱᛳᲇᛴ;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_2
    const/4 p0, 0x0

    .line 45
    invoke-static {p1, p0}, Lyyds/ᲇᛲᲁᛱ;->ᛷᛲᲈᛱ(Landroid/view/Display;I)Lyyds/ᛷᛲᛳᲇ;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const/4 v2, 0x1

    .line 50
    invoke-static {p1, v2}, Lyyds/ᲇᛲᲁᛱ;->ᛷᛲᲈᛱ(Landroid/view/Display;I)Lyyds/ᛷᛲᛳᲇ;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const/4 v3, 0x2

    .line 55
    invoke-static {p1, v3}, Lyyds/ᲇᛲᲁᛱ;->ᛷᛲᲈᛱ(Landroid/view/Display;I)Lyyds/ᛷᛲᛳᲇ;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    const/4 v4, 0x3

    .line 60
    invoke-static {p1, v4}, Lyyds/ᲇᛲᲁᛱ;->ᛷᛲᲈᛱ(Landroid/view/Display;I)Lyyds/ᛷᛲᛳᲇ;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget v4, v0, Landroid/graphics/Point;->x:I

    .line 65
    .line 66
    iget v5, v0, Landroid/graphics/Point;->y:I

    .line 67
    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    iget v0, v1, Lyyds/ᛷᛲᛳᲇ;->ᛵᛸᛸᛷ:I

    .line 71
    .line 72
    move v7, v0

    .line 73
    goto :goto_0

    .line 74
    :cond_3
    move v7, p0

    .line 75
    :goto_0
    if-eqz v2, :cond_4

    .line 76
    .line 77
    iget v0, v2, Lyyds/ᛷᛲᛳᲇ;->ᛵᛸᛸᛷ:I

    .line 78
    .line 79
    move v8, v0

    .line 80
    goto :goto_1

    .line 81
    :cond_4
    move v8, p0

    .line 82
    :goto_1
    if-eqz v3, :cond_5

    .line 83
    .line 84
    iget v0, v3, Lyyds/ᛷᛲᛳᲇ;->ᛵᛸᛸᛷ:I

    .line 85
    .line 86
    move v9, v0

    .line 87
    goto :goto_2

    .line 88
    :cond_5
    move v9, p0

    .line 89
    :goto_2
    if-eqz p1, :cond_6

    .line 90
    .line 91
    iget p0, p1, Lyyds/ᛷᛲᛳᲇ;->ᛵᛸᛸᛷ:I

    .line 92
    .line 93
    :cond_6
    move v10, p0

    .line 94
    const/4 v6, 0x0

    .line 95
    invoke-static/range {v4 .. v10}, Lyyds/ᛱᛳᲇᛴ;->ᛲᲈᲁ(IIZIIII)Lyyds/ᛱᛳᲇᛴ;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0
.end method

.method private ᲈᲀᛲᲀ(Lyyds/ᛸᲀᲁᛲ;)[Landroid/graphics/Rect;
    .locals 5

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v0, p1, Lyyds/ᛸᲀᲁᛲ;->ᛲᲈᲁ:I

    .line 7
    .line 8
    iget v1, p1, Lyyds/ᛸᲀᲁᛲ;->ᲇᲈᛵᛷ:I

    .line 9
    .line 10
    iget v2, p1, Lyyds/ᛸᲀᲁᛲ;->ᲀᛲᛳᲀ:I

    .line 11
    .line 12
    iget v3, p1, Lyyds/ᛸᲀᲁᛲ;->ᛵᛸᛸᛷ:I

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Landroid/graphics/Rect;

    .line 18
    .line 19
    iget p1, p1, Lyyds/ᛸᲀᲁᛲ;->ᛲᲈᲁ:I

    .line 20
    .line 21
    invoke-direct {v0, v4, v4, p1, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    if-eqz v3, :cond_1

    .line 28
    .line 29
    new-instance p1, Landroid/graphics/Rect;

    .line 30
    .line 31
    invoke-direct {p1, v4, v4, v4, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    :cond_1
    if-eqz v2, :cond_2

    .line 38
    .line 39
    new-instance p1, Landroid/graphics/Rect;

    .line 40
    .line 41
    rsub-int/lit8 v0, v2, 0x0

    .line 42
    .line 43
    invoke-direct {p1, v0, v4, v4, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    :cond_2
    if-eqz v1, :cond_3

    .line 50
    .line 51
    new-instance p1, Landroid/graphics/Rect;

    .line 52
    .line 53
    rsub-int/lit8 v0, v1, 0x0

    .line 54
    .line 55
    invoke-direct {p1, v4, v0, v4, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    :cond_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    new-array p1, p1, [Landroid/graphics/Rect;

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, [Landroid/graphics/Rect;

    .line 72
    .line 73
    return-object p0
.end method


# virtual methods
.method public abstract ᛱᲈᲁ(I)Lyyds/ᛸᲀᲁᛲ;
.end method

.method public ᛲᛴᛳᛲ(I)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lyyds/ᲇᛸᛷᛳ;->ᲇᲇᲇᛱ:[[Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lyyds/ᲇᛸᛷᛳ;->ᛲᛶᛱᲈ([[Landroid/graphics/Rect;I)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public ᛳᛸᛴᛶ(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᲇᛸᛷᛳ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    return-void
.end method

.method public ᛳᲁᲁᲇ()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲇᛸᛷᛳ;->ᲀᛲᛳᲀ:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/WindowInsets;->isRound()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public ᛵᛶᛲᲀ([Lyyds/ᛸᲀᲁᛲ;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract ᛵᲀᛵᛸ(I)Lyyds/ᛸᲀᲁᛲ;
.end method

.method public ᛶᛳᛶᛵ(Lyyds/ᛱᛳᲇᛴ;)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᛶᛸᲀᲁ([[Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, [[Landroid/graphics/Rect;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, [[Landroid/graphics/Rect;

    .line 6
    .line 7
    iput-object p1, p0, Lyyds/ᲇᛸᛷᛳ;->ᛶᛷᛲᲁ:[[Landroid/graphics/Rect;

    .line 8
    .line 9
    return-void
.end method

.method public ᛶᲈᛴᲈ([[Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, [[Landroid/graphics/Rect;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, [[Landroid/graphics/Rect;

    .line 6
    .line 7
    iput-object p1, p0, Lyyds/ᲇᛸᛷᛳ;->ᲇᲇᲇᛱ:[[Landroid/graphics/Rect;

    .line 8
    .line 9
    return-void
.end method

.method public ᛷᛲᲈᛱ(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lyyds/ᲇᛸᛷᛳ;->ᛵᲀᲈᛴ(Landroid/view/View;)Lyyds/ᛱᛳᲇᛴ;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public ᛷᛵᲇᲀ()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    :goto_0
    const/16 v1, 0x200

    .line 3
    .line 4
    if-gt v0, v1, :cond_1

    .line 5
    .line 6
    invoke-static {v0}, Lyyds/ᛲᲇᲁᛳ;->ᛶᛷᛲᲁ(I)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    iget-object v2, p0, Lyyds/ᲇᛸᛷᛳ;->ᲇᲇᲇᛱ:[[Landroid/graphics/Rect;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lyyds/ᲇᛸᛷᛳ;->ᛱᲈᲁ(I)Lyyds/ᛸᲀᲁᛲ;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-direct {p0, v3}, Lyyds/ᲇᛸᛷᛳ;->ᲈᲀᛲᲀ(Lyyds/ᛸᲀᲁᛲ;)[Landroid/graphics/Rect;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    aput-object v3, v2, v1

    .line 21
    .line 22
    const/16 v2, 0x8

    .line 23
    .line 24
    if-eq v0, v2, :cond_0

    .line 25
    .line 26
    iget-object v2, p0, Lyyds/ᲇᛸᛷᛳ;->ᛶᛷᛲᲁ:[[Landroid/graphics/Rect;

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lyyds/ᲇᛸᛷᛳ;->ᛵᲀᛵᛸ(I)Lyyds/ᛸᲀᲁᛲ;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-direct {p0, v3}, Lyyds/ᲇᛸᛷᛳ;->ᲈᲀᛲᲀ(Lyyds/ᛸᲀᲁᛲ;)[Landroid/graphics/Rect;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    aput-object v3, v2, v1

    .line 37
    .line 38
    :cond_0
    shl-int/lit8 v0, v0, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void
.end method

.method public final ᛷᲈᲈᲁ()Lyyds/ᛸᲀᲁᛲ;
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᲇᛸᛷᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛸᲀᲁᛲ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lyyds/ᲇᛸᛷᛳ;->ᲀᛲᛳᲀ:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {v1, v2, v3, v0}, Lyyds/ᛸᲀᲁᛲ;->ᛲᲈᲁ(IIII)Lyyds/ᛸᲀᲁᛲ;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lyyds/ᲇᛸᛷᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛸᲀᲁᛲ;

    .line 28
    .line 29
    :cond_0
    return-object v0
.end method

.method public ᲀᛲᛲᲇ(Lyyds/ᲈᛶᲈᛴ;)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᲇᲇᲇᛱ(I)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Landroid/graphics/Rect;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lyyds/ᲇᛸᛷᛳ;->ᛶᛷᛲᲁ:[[Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lyyds/ᲇᛸᛷᛳ;->ᛲᛶᛱᲈ([[Landroid/graphics/Rect;I)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
