.class public final Lyyds/ᛳᛶᲇᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᛴᛳᛲ:Landroid/view/animation/BaseInterpolator;

.field public ᛲᲈᲁ:I

.field public ᛵᛸᛸᛷ:I

.field public ᛶᛷᛲᲁ:I

.field public ᲀᛲᛳᲀ:I

.field public ᲇᲇᲇᛱ:Z

.field public ᲇᲈᛵᛷ:I


# virtual methods
.method public final ᛲᲈᲁ(Lyyds/ᛵᲇᛲᛱ;)V
    .locals 6

    .line 1
    iget v0, p0, Lyyds/ᛳᛶᲇᲁ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ltz v0, :cond_0

    .line 5
    .line 6
    const/4 v2, -0x1

    .line 7
    iput v2, p0, Lyyds/ᛳᛶᲇᲁ;->ᲇᲈᛵᛷ:I

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lyyds/ᛵᲇᛲᛱ;->ᛲᲀᛲᛲ(I)V

    .line 10
    .line 11
    .line 12
    iput-boolean v1, p0, Lyyds/ᛳᛶᲇᲁ;->ᲇᲇᲇᛱ:Z

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-boolean v0, p0, Lyyds/ᛳᛶᲇᲁ;->ᲇᲇᲇᛱ:Z

    .line 16
    .line 17
    if-eqz v0, :cond_5

    .line 18
    .line 19
    iget-object v0, p0, Lyyds/ᛳᛶᲇᲁ;->ᛲᛴᛳᛲ:Landroid/view/animation/BaseInterpolator;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget v3, p0, Lyyds/ᛳᛶᲇᲁ;->ᲀᛲᛳᲀ:I

    .line 25
    .line 26
    if-lt v3, v2, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const-string p0, "If you provide an interpolator, you must set a positive duration"

    .line 30
    .line 31
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    :goto_0
    iget v3, p0, Lyyds/ᛳᛶᲇᲁ;->ᲀᛲᛳᲀ:I

    .line 36
    .line 37
    if-lt v3, v2, :cond_4

    .line 38
    .line 39
    iget-object p1, p1, Lyyds/ᛵᲇᛲᛱ;->ᛴᛸᲁᛵ:Lyyds/ᛵᲀᛲᛲ;

    .line 40
    .line 41
    iget v4, p0, Lyyds/ᛳᛶᲇᲁ;->ᛲᲈᲁ:I

    .line 42
    .line 43
    iget v5, p0, Lyyds/ᛳᛶᲇᲁ;->ᛵᛸᛸᛷ:I

    .line 44
    .line 45
    invoke-virtual {p1, v4, v5, v3, v0}, Lyyds/ᛵᲀᛲᛲ;->ᲀᛲᛳᲀ(IIILandroid/view/animation/Interpolator;)V

    .line 46
    .line 47
    .line 48
    iget p1, p0, Lyyds/ᛳᛶᲇᲁ;->ᛶᛷᛲᲁ:I

    .line 49
    .line 50
    add-int/2addr p1, v2

    .line 51
    iput p1, p0, Lyyds/ᛳᛶᲇᲁ;->ᛶᛷᛲᲁ:I

    .line 52
    .line 53
    const/16 v0, 0xa

    .line 54
    .line 55
    if-le p1, v0, :cond_3

    .line 56
    .line 57
    const-string p1, "RecyclerView"

    .line 58
    .line 59
    const-string v0, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary"

    .line 60
    .line 61
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    .line 63
    .line 64
    :cond_3
    iput-boolean v1, p0, Lyyds/ᛳᛶᲇᲁ;->ᲇᲇᲇᛱ:Z

    .line 65
    .line 66
    return-void

    .line 67
    :cond_4
    const-string p0, "Scroll duration must be a positive number"

    .line 68
    .line 69
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_5
    iput v1, p0, Lyyds/ᛳᛶᲇᲁ;->ᛶᛷᛲᲁ:I

    .line 74
    .line 75
    return-void
.end method
