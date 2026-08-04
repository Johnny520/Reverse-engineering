.class public Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
.super Lyyds/ᛴᛲᛴᛲ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Landroid/view/View;",
        ">",
        "Lyyds/\u16f4\u16f2\u16f4\u16f2;"
    }
.end annotation


# instance fields
.field public ᛱᲈᲁ:Z

.field public final ᛲᛳᛶᲁ:I

.field public ᛶᛷᛲᲁ:I

.field public final ᲇᲇᲇᛱ:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 94
    iput-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ᲇᲇᲇᛱ:Z

    const/4 v0, 0x4

    .line 95
    iput v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ᛲᛳᛶᲁ:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ᲇᲇᲇᛱ:Z

    .line 6
    .line 7
    const/4 v1, 0x4

    .line 8
    iput v1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ᛲᛳᛶᲁ:I

    .line 9
    .line 10
    sget-object v2, Lyyds/ᛵᛸᛷᲀ;->ᛲᲈᲁ:[I

    .line 11
    .line 12
    invoke-virtual {p1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    const/4 v2, 0x2

    .line 17
    invoke-virtual {p2, v2}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/4 v4, -0x1

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    iget v3, v3, Landroid/util/TypedValue;->data:I

    .line 25
    .line 26
    if-ne v3, v4, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0, v3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ᲀᛲᛱᛱ(I)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p2, v2, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {p0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ᲀᛲᛱᛱ(I)V

    .line 37
    .line 38
    .line 39
    :goto_0
    const/4 v2, 0x0

    .line 40
    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget-boolean v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ᲇᲇᲇᛱ:Z

    .line 48
    .line 49
    const/4 v4, 0x3

    .line 50
    if-ne v3, v0, :cond_1

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_1
    iput-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ᲇᲇᲇᛱ:Z

    .line 54
    .line 55
    const/4 v3, 0x6

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ᛲᛳᛶᲁ:I

    .line 59
    .line 60
    if-ne v0, v3, :cond_2

    .line 61
    .line 62
    move v5, v0

    .line 63
    move v0, v4

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ᛲᛳᛶᲁ:I

    .line 66
    .line 67
    move v5, v0

    .line 68
    :goto_1
    if-ne v5, v0, :cond_3

    .line 69
    .line 70
    :goto_2
    invoke-virtual {p2, v4, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 74
    .line 75
    .line 76
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_3
    iput v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ᛲᛳᛶᲁ:I

    .line 85
    .line 86
    if-eq v0, v3, :cond_4

    .line 87
    .line 88
    if-eq v0, v4, :cond_4

    .line 89
    .line 90
    const/4 p0, 0x5

    .line 91
    :cond_4
    const/4 p0, 0x0

    .line 92
    throw p0
.end method


# virtual methods
.method public final ᲀᛲᛱᛱ(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ᛱᲈᲁ:Z

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne p1, v1, :cond_0

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ᛱᲈᲁ:Z

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ᛶᛷᛲᲁ:I

    .line 15
    .line 16
    if-eq v0, p1, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    return-void

    .line 20
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 21
    iput-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ᛱᲈᲁ:Z

    .line 22
    .line 23
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iput p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ᛶᛷᛲᲁ:I

    .line 28
    .line 29
    return-void
.end method
