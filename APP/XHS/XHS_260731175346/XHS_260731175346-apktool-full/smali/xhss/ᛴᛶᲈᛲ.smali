.class public final Lxhss/ᛴᛶᲈᛲ;
.super Landroid/view/WindowInsetsAnimation$Callback;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛱᛱᛲᲇ:Ljava/util/ArrayList;

.field public final ᛳᲁᲇᛸ:Ljava/util/HashMap;

.field public final ᛷᛵᛵᲈ:Lxhss/ᛳᛱᛲᲀ;


# direct methods
.method public constructor <init>(Lxhss/ᛳᛱᛲᲀ;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Landroid/view/WindowInsetsAnimation$Callback;-><init>(I)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lxhss/ᛴᛶᲈᛲ;->ᛳᲁᲇᛸ:Ljava/util/HashMap;

    .line 11
    .line 12
    iput-object p1, p0, Lxhss/ᛴᛶᲈᛲ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛱᛲᲀ;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final onEnd(Landroid/view/WindowInsetsAnimation;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lxhss/ᛴᛶᲈᛲ;->ᛷᛵᛵᲈ(Landroid/view/WindowInsetsAnimation;)Lxhss/ᲇᲇᛱᲀ;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lxhss/ᛴᛶᲈᛲ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛱᛲᲀ;

    .line 5
    .line 6
    iget-object v0, v0, Lxhss/ᛳᛱᛲᲀ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lxhss/ᛷᛴᛱᲀ;

    .line 9
    .line 10
    sget v1, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛴᲈᛱᛴ:I

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-boolean v1, v0, Lxhss/ᛷᛴᛱᲀ;->ᛷᛵᛵᲈ:Z

    .line 14
    .line 15
    iget-object p0, p0, Lxhss/ᛴᛶᲈᛲ;->ᛳᲁᲇᛸ:Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final onPrepare(Landroid/view/WindowInsetsAnimation;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lxhss/ᛴᛶᲈᛲ;->ᛷᛵᛵᲈ(Landroid/view/WindowInsetsAnimation;)Lxhss/ᲇᲇᛱᲀ;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lxhss/ᛴᛶᲈᛲ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛱᛲᲀ;

    .line 5
    .line 6
    iget-object p0, p0, Lxhss/ᛳᛱᛲᲀ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lxhss/ᛷᛴᛱᲀ;

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    iput-boolean p1, p0, Lxhss/ᛷᛴᛱᲀ;->ᛷᛵᛵᲈ:Z

    .line 12
    .line 13
    return-void
.end method

.method public final onProgress(Landroid/view/WindowInsets;Ljava/util/List;)Landroid/view/WindowInsets;
    .locals 4

    .line 1
    iget-object v0, p0, Lxhss/ᛴᛶᲈᛲ;->ᛱᛱᛲᲇ:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lxhss/ᛴᛶᲈᛲ;->ᛱᛱᛲᲇ:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    add-int/lit8 v0, v0, -0x1

    .line 28
    .line 29
    :goto_1
    if-ltz v0, :cond_1

    .line 30
    .line 31
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Landroid/view/WindowInsetsAnimation;

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Lxhss/ᛴᛶᲈᛲ;->ᛷᛵᛵᲈ(Landroid/view/WindowInsetsAnimation;)Lxhss/ᲇᲇᛱᲀ;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v1}, Landroid/view/WindowInsetsAnimation;->getFraction()F

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    iget-object v3, v2, Lxhss/ᲇᲇᛱᲀ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 46
    .line 47
    iget-object v3, v3, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v3, Landroid/view/WindowInsetsAnimation;

    .line 50
    .line 51
    invoke-virtual {v3, v1}, Landroid/view/WindowInsetsAnimation;->setFraction(F)V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lxhss/ᛴᛶᲈᛲ;->ᛱᛱᛲᲇ:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    add-int/lit8 v0, v0, -0x1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    const/4 p2, 0x0

    .line 63
    invoke-static {p2, p1}, Lxhss/ᲀᛳᛲᛶ;->ᛱᛱᛲᲇ(Landroid/view/View;Landroid/view/WindowInsets;)Lxhss/ᲀᛳᛲᛶ;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iget-object p0, p0, Lxhss/ᛴᛶᲈᛲ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛱᛲᲀ;

    .line 68
    .line 69
    iget-object p2, p0, Lxhss/ᛳᛱᛲᲀ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p2, Lxhss/ᛷᛴᛱᲀ;

    .line 72
    .line 73
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    sget v0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛴᲈᛱᛴ:I

    .line 77
    .line 78
    new-instance v0, Lxhss/ᲇᲇᛱ;

    .line 79
    .line 80
    iget-object p0, p0, Lxhss/ᛳᛱᛲᲀ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p0, Lxhss/ᲇᲇᛱ;

    .line 83
    .line 84
    invoke-direct {v0, p0}, Lxhss/ᲇᲇᛱ;-><init>(Lxhss/ᲇᲇᛱ;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2, p1, v0}, Lxhss/ᛷᛴᛱᲀ;->ᛱᛱᛲᲇ(Lxhss/ᲀᛳᛲᛶ;Lxhss/ᲇᲇᛱ;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Lxhss/ᲀᛳᛲᛶ;->ᛷᛵᛵᲈ()Landroid/view/WindowInsets;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0
.end method

.method public final onStart(Landroid/view/WindowInsetsAnimation;Landroid/view/WindowInsetsAnimation$Bounds;)Landroid/view/WindowInsetsAnimation$Bounds;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lxhss/ᛴᛶᲈᛲ;->ᛷᛵᛵᲈ(Landroid/view/WindowInsetsAnimation;)Lxhss/ᲇᲇᛱᲀ;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Landroid/view/WindowInsetsAnimation$Bounds;->getLowerBound()Landroid/graphics/Insets;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, Lxhss/ᲀᲈᲈᛸ;->ᛱᛱᛲᲇ(Landroid/graphics/Insets;)Lxhss/ᲀᲈᲈᛸ;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p2}, Landroid/view/WindowInsetsAnimation$Bounds;->getUpperBound()Landroid/graphics/Insets;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Lxhss/ᲀᲈᲈᛸ;->ᛱᛱᛲᲇ(Landroid/graphics/Insets;)Lxhss/ᲀᲈᲈᛸ;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance p2, Landroid/view/WindowInsetsAnimation$Bounds;

    .line 21
    .line 22
    invoke-virtual {p0}, Lxhss/ᲀᲈᲈᛸ;->ᛳᲁᲇᛸ()Landroid/graphics/Insets;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p1}, Lxhss/ᲀᲈᲈᛸ;->ᛳᲁᲇᛸ()Landroid/graphics/Insets;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {p2, p0, p1}, Landroid/view/WindowInsetsAnimation$Bounds;-><init>(Landroid/graphics/Insets;Landroid/graphics/Insets;)V

    .line 31
    .line 32
    .line 33
    return-object p2
.end method

.method public final ᛷᛵᛵᲈ(Landroid/view/WindowInsetsAnimation;)Lxhss/ᲇᲇᛱᲀ;
    .locals 6

    .line 1
    iget-object p0, p0, Lxhss/ᛴᛶᲈᛲ;->ᛳᲁᲇᛸ:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lxhss/ᲇᲇᛱᲀ;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lxhss/ᲇᲇᛱᲀ;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v1, Landroid/view/WindowInsetsAnimation;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    const-wide/16 v4, 0x0

    .line 21
    .line 22
    invoke-direct {v1, v2, v3, v4, v5}, Landroid/view/WindowInsetsAnimation;-><init>(ILandroid/view/animation/Interpolator;J)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lxhss/ᲇᛵᛲᲁ;

    .line 26
    .line 27
    const/16 v2, 0x18

    .line 28
    .line 29
    invoke-direct {v1, v2, p1}, Lxhss/ᲇᛵᛲᲁ;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object v1, v0, Lxhss/ᲇᲇᛱᲀ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 33
    .line 34
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    :cond_0
    return-object v0
.end method
