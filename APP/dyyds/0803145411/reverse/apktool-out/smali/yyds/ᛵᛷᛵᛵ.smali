.class public final Lyyds/ᛵᛷᛵᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛱᛶᛲ;


# instance fields
.field public final ᲀᛲᛳᲀ:Lyyds/ᛶᛶᛵᲇ;

.field public final ᲇᲈᛵᛷ:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "Argument must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lyyds/ᛲᛳᲁ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lyyds/ᛵᛷᛵᛵ;->ᲇᲈᛵᛷ:Landroid/view/View;

    .line 10
    .line 11
    new-instance v0, Lyyds/ᛶᛶᛵᲇ;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lyyds/ᛶᛶᛵᲇ;-><init>(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lyyds/ᛵᛷᛵᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛶᛵᲇ;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Target for: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᛵᛷᛵᛵ;->ᲇᲈᛵᛷ:Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final ᛱᲈᲁ(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛷᛵᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛶᛵᲇ;

    .line 2
    .line 3
    iget-object p1, p0, Lyyds/ᛶᛶᛵᲇ;->ᛲᲈᲁ:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lyyds/ᛶᛶᛵᲇ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᛴᛵ;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    iput-object p1, p0, Lyyds/ᛶᛶᛵᲇ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᛴᛵ;

    .line 22
    .line 23
    iget-object p0, p0, Lyyds/ᛶᛶᛵᲇ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final ᛲᛳᛶᲁ(Lyyds/ᛸᛷᛷᛸ;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛷᛵᛵ;->ᲇᲈᛵᛷ:Landroid/view/View;

    .line 2
    .line 3
    const v0, 0x66090232

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final ᛲᛴᛳᛲ(Lyyds/ᛲᛷᛶᛸ;)V
    .locals 6

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛷᛵᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛶᛵᲇ;

    .line 2
    .line 3
    iget-object v0, p0, Lyyds/ᛶᛶᛵᲇ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v1, p0, Lyyds/ᛶᛶᛵᲇ;->ᛲᲈᲁ:Landroid/view/View;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    add-int/2addr v3, v2

    .line 16
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v2, v4

    .line 27
    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    invoke-virtual {p0, v5, v2, v3}, Lyyds/ᛶᛶᛵᲇ;->ᛲᲈᲁ(III)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    add-int/2addr v5, v3

    .line 44
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    iget v4, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 51
    .line 52
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-virtual {p0, v3, v4, v5}, Lyyds/ᛶᛶᛵᲇ;->ᛲᲈᲁ(III)I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    const/high16 v4, -0x80000000

    .line 61
    .line 62
    if-gtz v2, :cond_2

    .line 63
    .line 64
    if-ne v2, v4, :cond_3

    .line 65
    .line 66
    :cond_2
    if-gtz v3, :cond_6

    .line 67
    .line 68
    if-ne v3, v4, :cond_3

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-nez v2, :cond_4

    .line 76
    .line 77
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    :cond_4
    iget-object p1, p0, Lyyds/ᛶᛶᛵᲇ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᛴᛵ;

    .line 81
    .line 82
    if-nez p1, :cond_5

    .line 83
    .line 84
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    new-instance v0, Lyyds/ᲈᛱᛴᛵ;

    .line 89
    .line 90
    invoke-direct {v0, p0}, Lyyds/ᲈᛱᛴᛵ;-><init>(Lyyds/ᛶᛶᛵᲇ;)V

    .line 91
    .line 92
    .line 93
    iput-object v0, p0, Lyyds/ᛶᛶᛵᲇ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᛴᛵ;

    .line 94
    .line 95
    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 96
    .line 97
    .line 98
    :cond_5
    return-void

    .line 99
    :cond_6
    :goto_1
    invoke-virtual {p1, v2, v3}, Lyyds/ᛲᛷᛶᛸ;->ᛲᛲᲈᲈ(II)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final ᛲᲈᲁ(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᛵᛸᛸᛷ(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᛶᛷᛲᲁ()Lyyds/ᛸᛷᛷᛸ;
    .locals 2

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛷᛵᛵ;->ᲇᲈᛵᛷ:Landroid/view/View;

    .line 2
    .line 3
    const v0, 0x66090232

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x0

    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    instance-of v1, p0, Lyyds/ᛸᛷᛷᛸ;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast p0, Lyyds/ᛸᛷᛷᛸ;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    const-string p0, "You must not pass non-R.id ids to setTag(id)"

    .line 21
    .line 22
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-object v0
.end method

.method public final ᛷᛲᲈᛱ()V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᛷᲈᲈᲁ()V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᲀᛲᛳᲀ()V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᲇᲇᲇᛱ(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final ᲇᲈᛵᛷ(Lyyds/ᛲᛷᛶᛸ;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛷᛵᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛶᛵᲇ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛶᛶᛵᲇ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method
