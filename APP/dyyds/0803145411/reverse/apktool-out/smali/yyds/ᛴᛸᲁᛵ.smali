.class public final synthetic Lyyds/ᛴᛸᲁᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:D

.field public final synthetic ᲀᛲᛳᲀ:Lyyds/ᛷᲈᛳᛲ;

.field public final synthetic ᲇᲇᲇᛱ:Landroid/view/View;

.field public final synthetic ᲇᲈᛵᛷ:D


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛷᲈᛳᛲ;DDLandroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛴᛸᲁᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛷᲈᛳᛲ;

    .line 5
    .line 6
    iput-wide p2, p0, Lyyds/ᛴᛸᲁᛵ;->ᲇᲈᛵᛷ:D

    .line 7
    .line 8
    iput-wide p4, p0, Lyyds/ᛴᛸᲁᛵ;->ᛲᛴᛳᛲ:D

    .line 9
    .line 10
    iput-object p6, p0, Lyyds/ᛴᛸᲁᛵ;->ᲇᲇᲇᛱ:Landroid/view/View;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛸᲁᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛷᲈᛳᛲ;

    .line 2
    .line 3
    iget-object v1, v0, Lyyds/ᛷᲈᛳᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛴᛲᲀ;

    .line 4
    .line 5
    invoke-virtual {v1}, Lyyds/ᛳᛴᛲᲀ;->ᛶᛷᛲᲁ()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lyyds/ᛳᛴᛲᲀ;->ᲇᲇᲇᛱ()V

    .line 9
    .line 10
    .line 11
    iget v2, v1, Lyyds/ᛳᛴᛲᲀ;->ᛶᛷᛲᲁ:I

    .line 12
    .line 13
    int-to-double v2, v2

    .line 14
    iget-wide v4, p0, Lyyds/ᛴᛸᲁᛵ;->ᲇᲈᛵᛷ:D

    .line 15
    .line 16
    mul-double/2addr v2, v4

    .line 17
    iget-object v4, v1, Lyyds/ᛳᛴᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛸᛵᲈ;

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v4, v4, Lyyds/ᛴᛸᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛵ;

    .line 24
    .line 25
    if-nez v4, :cond_1

    .line 26
    .line 27
    :goto_0
    move v4, v5

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    :goto_1
    int-to-double v6, v4

    .line 34
    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    .line 35
    .line 36
    div-double/2addr v6, v8

    .line 37
    sub-double/2addr v2, v6

    .line 38
    double-to-int v2, v2

    .line 39
    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    iget v3, v1, Lyyds/ᛳᛴᛲᲀ;->ᛱᲈᲁ:I

    .line 44
    .line 45
    int-to-double v3, v3

    .line 46
    iget-wide v6, p0, Lyyds/ᛴᛸᲁᛵ;->ᛲᛴᛳᛲ:D

    .line 47
    .line 48
    mul-double/2addr v3, v6

    .line 49
    iget-object v6, v1, Lyyds/ᛳᛴᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛸᛵᲈ;

    .line 50
    .line 51
    if-nez v6, :cond_2

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    iget-object v6, v6, Lyyds/ᛴᛸᛵᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛵᛵ;

    .line 55
    .line 56
    if-nez v6, :cond_3

    .line 57
    .line 58
    :goto_2
    move v6, v5

    .line 59
    goto :goto_3

    .line 60
    :cond_3
    invoke-virtual {v6}, Landroid/view/View;->getHeight()I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    :goto_3
    int-to-double v6, v6

    .line 65
    div-double/2addr v6, v8

    .line 66
    sub-double/2addr v3, v6

    .line 67
    double-to-int v3, v3

    .line 68
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    int-to-float v2, v2

    .line 73
    int-to-float v3, v3

    .line 74
    float-to-int v2, v2

    .line 75
    float-to-int v3, v3

    .line 76
    iget-object v4, v1, Lyyds/ᛳᛴᛲᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛴᛸᛵᲈ;

    .line 77
    .line 78
    if-nez v4, :cond_4

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_4
    iget-object v5, v4, Lyyds/ᛴᛸᛵᲈ;->ᛲᛴᛳᛲ:Landroid/view/WindowManager$LayoutParams;

    .line 82
    .line 83
    iget v6, v5, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 84
    .line 85
    const/16 v7, 0x33

    .line 86
    .line 87
    if-ne v6, v7, :cond_5

    .line 88
    .line 89
    iget v6, v5, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 90
    .line 91
    if-ne v6, v2, :cond_5

    .line 92
    .line 93
    iget v6, v5, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 94
    .line 95
    if-ne v6, v3, :cond_5

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_5
    iput v2, v5, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 99
    .line 100
    iput v3, v5, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 101
    .line 102
    iput v7, v5, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 103
    .line 104
    invoke-virtual {v4}, Lyyds/ᛴᛸᛵᲈ;->ᛷᲈᲈᲁ()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Lyyds/ᛳᛴᛲᲀ;->ᛲᛴᛳᛲ()V

    .line 108
    .line 109
    .line 110
    :goto_4
    new-instance v1, Lyyds/ᛲᛳᛵᛱ;

    .line 111
    .line 112
    const/4 v2, 0x1

    .line 113
    invoke-direct {v1, v2, v0}, Lyyds/ᛲᛳᛵᛱ;-><init>(ILjava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    iget-object p0, p0, Lyyds/ᛴᛸᲁᛵ;->ᲇᲇᲇᛱ:Landroid/view/View;

    .line 117
    .line 118
    invoke-virtual {p0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 119
    .line 120
    .line 121
    return-void
.end method
