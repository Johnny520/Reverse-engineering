.class public final Lyyds/ᛴᛲᛶᲈ;
.super Lyyds/ᲁᛶᛱᛸ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᲈᲁ:Lyyds/ᛵᲇᛲᛱ;

.field public final ᛵᛸᛸᛷ:Lyyds/ᲈᛵᲇᛳ;

.field public ᲀᛲᛳᲀ:Lyyds/ᛲᛷᲇᛷ;

.field public ᲇᲈᛵᛷ:Lyyds/ᛲᛷᲇᛷ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᲈᛵᲇᛳ;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lyyds/ᲈᛵᲇᛳ;-><init>(Lyyds/ᛴᛲᛶᲈ;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᛴᛲᛶᲈ;->ᛵᛸᛸᛷ:Lyyds/ᲈᛵᲇᛳ;

    .line 10
    .line 11
    return-void
.end method

.method public static ᲀᛲᛳᲀ(Landroid/view/View;Lyyds/ᛲᛵᲀᛳ;)I
    .locals 1

    .line 1
    invoke-virtual {p1, p0}, Lyyds/ᛲᛵᲀᛳ;->ᛶᛷᛲᲁ(Landroid/view/View;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1, p0}, Lyyds/ᛲᛵᲀᛳ;->ᛲᛴᛳᛲ(Landroid/view/View;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    div-int/lit8 p0, p0, 0x2

    .line 10
    .line 11
    add-int/2addr p0, v0

    .line 12
    invoke-virtual {p1}, Lyyds/ᛲᛵᲀᛳ;->ᛲᛲᲈᲈ()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p1}, Lyyds/ᛲᛵᲀᛳ;->ᛱᛳᲇ()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    div-int/lit8 p1, p1, 0x2

    .line 21
    .line 22
    add-int/2addr p1, v0

    .line 23
    sub-int/2addr p0, p1

    .line 24
    return p0
.end method

.method public static ᲇᲈᛵᛷ(Lyyds/ᲇᲇᛵᛲ;Lyyds/ᛲᛵᲀᛳ;)Landroid/view/View;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lyyds/ᲇᲇᛵᛲ;->ᛶᛸᲀᲁ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-virtual {p1}, Lyyds/ᛲᛵᲀᛳ;->ᛲᛲᲈᲈ()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p1}, Lyyds/ᛲᛵᲀᛳ;->ᛱᛳᲇ()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    div-int/lit8 v3, v3, 0x2

    .line 18
    .line 19
    add-int/2addr v3, v2

    .line 20
    const v2, 0x7fffffff

    .line 21
    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    :goto_0
    if-ge v4, v0, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0, v4}, Lyyds/ᲇᲇᛵᛲ;->ᛶᲈᛴᲈ(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-virtual {p1, v5}, Lyyds/ᛲᛵᲀᛳ;->ᛶᛷᛲᲁ(Landroid/view/View;)I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    invoke-virtual {p1, v5}, Lyyds/ᛲᛵᲀᛳ;->ᛲᛴᛳᛲ(Landroid/view/View;)I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    div-int/lit8 v7, v7, 0x2

    .line 39
    .line 40
    add-int/2addr v7, v6

    .line 41
    sub-int/2addr v7, v3

    .line 42
    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-ge v6, v2, :cond_1

    .line 47
    .line 48
    move-object v1, v5

    .line 49
    move v2, v6

    .line 50
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    return-object v1
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ(Lyyds/ᲇᲇᛵᛲ;)Lyyds/ᛲᛵᲀᛳ;
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛲᛶᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛲᛷᲇᛷ;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Lyyds/ᛲᛵᲀᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lyyds/ᲇᲇᛵᛲ;

    .line 8
    .line 9
    if-eq v1, p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object v0

    .line 13
    :cond_1
    :goto_0
    new-instance v0, Lyyds/ᛲᛷᲇᛷ;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, p1, v1}, Lyyds/ᛲᛷᲇᛷ;-><init>(Lyyds/ᲇᲇᛵᛲ;I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lyyds/ᛴᛲᛶᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛲᛷᲇᛷ;

    .line 20
    .line 21
    return-object v0
.end method

.method public final ᛲᲈᲁ(Lyyds/ᛵᲇᛲᛱ;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛲᛶᲈ;->ᛲᲈᲁ:Lyyds/ᛵᲇᛲᛱ;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, p0, Lyyds/ᛴᛲᛶᲈ;->ᛵᛸᛸᛷ:Lyyds/ᲈᛵᲇᛳ;

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-object v0, v0, Lyyds/ᛵᲇᛲᛱ;->ᲀᛳᛷᛷ:Ljava/util/ArrayList;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    :cond_1
    iget-object v0, p0, Lyyds/ᛴᛲᛶᲈ;->ᛲᲈᲁ:Lyyds/ᛵᲇᛲᛱ;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v0, v2}, Lyyds/ᛵᲇᛲᛱ;->setOnFlingListener(Lyyds/ᲁᛶᛱᛸ;)V

    .line 21
    .line 22
    .line 23
    :cond_2
    iput-object p1, p0, Lyyds/ᛴᛲᛶᲈ;->ᛲᲈᲁ:Lyyds/ᛵᲇᛲᛱ;

    .line 24
    .line 25
    if-eqz p1, :cond_4

    .line 26
    .line 27
    invoke-virtual {p1}, Lyyds/ᛵᲇᛲᛱ;->getOnFlingListener()Lyyds/ᲁᛶᛱᛸ;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    iget-object p1, p0, Lyyds/ᛴᛲᛶᲈ;->ᛲᲈᲁ:Lyyds/ᛵᲇᛲᛱ;

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Lyyds/ᛵᲇᛲᛱ;->ᛲᛳᛶᲁ(Lyyds/ᲁᲈᛳᛴ;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lyyds/ᛴᛲᛶᲈ;->ᛲᲈᲁ:Lyyds/ᛵᲇᛲᛱ;

    .line 39
    .line 40
    invoke-virtual {p1, p0}, Lyyds/ᛵᲇᛲᛱ;->setOnFlingListener(Lyyds/ᲁᛶᛱᛸ;)V

    .line 41
    .line 42
    .line 43
    new-instance p1, Landroid/widget/Scroller;

    .line 44
    .line 45
    iget-object v0, p0, Lyyds/ᛴᛲᛶᲈ;->ᛲᲈᲁ:Lyyds/ᛵᲇᛲᛱ;

    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    .line 52
    .line 53
    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-direct {p1, v0, v1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lyyds/ᛴᛲᛶᲈ;->ᛶᛷᛲᲁ()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_3
    const-string p0, "An instance of OnFlingListener already set."

    .line 64
    .line 65
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_4
    :goto_0
    return-void
.end method

.method public final ᛵᛸᛸᛷ(Lyyds/ᲇᲇᛵᛲ;Landroid/view/View;)[I
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    invoke-virtual {p1}, Lyyds/ᲇᲇᛵᛲ;->ᲇᲈᛵᛷ()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lyyds/ᛴᛲᛶᲈ;->ᛲᛴᛳᛲ(Lyyds/ᲇᲇᛵᛲ;)Lyyds/ᛲᛵᲀᛳ;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {p2, v1}, Lyyds/ᛴᛲᛶᲈ;->ᲀᛲᛳᲀ(Landroid/view/View;Lyyds/ᛲᛵᲀᛳ;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    aput v1, v0, v2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    aput v2, v0, v2

    .line 23
    .line 24
    :goto_0
    invoke-virtual {p1}, Lyyds/ᲇᲇᛵᛲ;->ᛲᛴᛳᛲ()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v3, 0x1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lyyds/ᛴᛲᛶᲈ;->ᲇᲇᲇᛱ(Lyyds/ᲇᲇᛵᛲ;)Lyyds/ᛲᛵᲀᛳ;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p2, p0}, Lyyds/ᛴᛲᛶᲈ;->ᲀᛲᛳᲀ(Landroid/view/View;Lyyds/ᛲᛵᲀᛳ;)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    aput p0, v0, v3

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_1
    aput v2, v0, v3

    .line 43
    .line 44
    return-object v0
.end method

.method public final ᛶᛷᛲᲁ()V
    .locals 8

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛲᛶᲈ;->ᛲᲈᲁ:Lyyds/ᛵᲇᛲᛱ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {v0}, Lyyds/ᛵᲇᛲᛱ;->getLayoutManager()Lyyds/ᲇᲇᛵᛲ;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_1
    invoke-virtual {v0}, Lyyds/ᲇᲇᛵᛲ;->ᛲᛴᛳᛲ()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lyyds/ᛴᛲᛶᲈ;->ᲇᲇᲇᛱ(Lyyds/ᲇᲇᛵᛲ;)Lyyds/ᛲᛵᲀᛳ;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v0, v1}, Lyyds/ᛴᛲᛶᲈ;->ᲇᲈᛵᛷ(Lyyds/ᲇᲇᛵᛲ;Lyyds/ᛲᛵᲀᛳ;)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    goto :goto_0

    .line 28
    :cond_2
    invoke-virtual {v0}, Lyyds/ᲇᲇᛵᛲ;->ᲇᲈᛵᛷ()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lyyds/ᛴᛲᛶᲈ;->ᛲᛴᛳᛲ(Lyyds/ᲇᲇᛵᛲ;)Lyyds/ᛲᛵᲀᛳ;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-static {v0, v1}, Lyyds/ᛴᛲᛶᲈ;->ᲇᲈᛵᛷ(Lyyds/ᲇᲇᛵᛲ;Lyyds/ᛲᛵᲀᛳ;)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    goto :goto_0

    .line 43
    :cond_3
    const/4 v1, 0x0

    .line 44
    :goto_0
    if-nez v1, :cond_4

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_4
    invoke-virtual {p0, v0, v1}, Lyyds/ᛴᛲᛶᲈ;->ᛵᛸᛸᛷ(Lyyds/ᲇᲇᛵᛲ;Landroid/view/View;)[I

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const/4 v1, 0x0

    .line 52
    aget v3, v0, v1

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    if-nez v3, :cond_6

    .line 56
    .line 57
    aget v2, v0, v1

    .line 58
    .line 59
    if-eqz v2, :cond_5

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_5
    :goto_1
    return-void

    .line 63
    :cond_6
    :goto_2
    iget-object v2, p0, Lyyds/ᛴᛲᛶᲈ;->ᛲᲈᲁ:Lyyds/ᛵᲇᛲᛱ;

    .line 64
    .line 65
    aget v4, v0, v1

    .line 66
    .line 67
    const/high16 v6, -0x80000000

    .line 68
    .line 69
    const/4 v7, 0x0

    .line 70
    const/4 v5, 0x0

    .line 71
    invoke-virtual/range {v2 .. v7}, Lyyds/ᛵᲇᛲᛱ;->ᛴᛵᛷᛳ(IILandroid/view/animation/PathInterpolator;IZ)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final ᲇᲇᲇᛱ(Lyyds/ᲇᲇᛵᛲ;)Lyyds/ᛲᛵᲀᛳ;
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛲᛶᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛷᲇᛷ;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Lyyds/ᛲᛵᲀᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lyyds/ᲇᲇᛵᛲ;

    .line 8
    .line 9
    if-eq v1, p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object v0

    .line 13
    :cond_1
    :goto_0
    new-instance v0, Lyyds/ᛲᛷᲇᛷ;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    invoke-direct {v0, p1, v1}, Lyyds/ᛲᛷᲇᛷ;-><init>(Lyyds/ᲇᲇᛵᛲ;I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lyyds/ᛴᛲᛶᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛷᲇᛷ;

    .line 20
    .line 21
    return-object v0
.end method
