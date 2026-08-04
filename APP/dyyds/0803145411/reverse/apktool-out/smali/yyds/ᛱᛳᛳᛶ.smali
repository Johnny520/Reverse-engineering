.class public final Lyyds/ᛱᛳᛳᛶ;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᲈᲁ:Z

.field public final synthetic ᛵᛸᛸᛷ:Lyyds/ᛸᲁᛲᲀ;


# direct methods
.method public constructor <init>(Lyyds/ᛸᲁᛲᲀ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᛱᛳᛳᛶ;->ᛵᛸᛸᛷ:Lyyds/ᛸᲁᛲᲀ;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lyyds/ᛱᛳᛳᛶ;->ᛲᲈᲁ:Z

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lyyds/ᛱᛳᛳᛶ;->ᛲᲈᲁ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object p0, p0, Lyyds/ᛱᛳᛳᛶ;->ᛵᛸᛸᛷ:Lyyds/ᛸᲁᛲᲀ;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lyyds/ᛸᲁᛲᲀ;->ᛷᛵᲇᲀ(Landroid/view/MotionEvent;)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Lyyds/ᛸᲁᛲᲀ;->ᛵᛶᛲᲀ:Lyyds/ᛵᲇᛲᛱ;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Lyyds/ᛵᲇᛲᛱ;->ᛱᛸᲁᲇ(Landroid/view/View;)Lyyds/ᛱᛸᛳᛵ;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Lyyds/ᛸᲁᛲᲀ;->ᛵᛶᛲᲀ:Lyyds/ᛵᲇᛲᛱ;

    .line 23
    .line 24
    const v2, 0x30003

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/view/View;->getLayoutDirection()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {v2, v1}, Lyyds/ᲇᛵᛷᛶ;->ᛵᛸᛸᛷ(II)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/high16 v2, 0xff0000

    .line 36
    .line 37
    and-int/2addr v1, v2

    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    iget v2, p0, Lyyds/ᛸᲁᛲᲀ;->ᛷᛵᲇᲀ:I

    .line 46
    .line 47
    if-ne v1, v2, :cond_1

    .line 48
    .line 49
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    iput v2, p0, Lyyds/ᛸᲁᛲᲀ;->ᲇᲈᛵᛷ:F

    .line 62
    .line 63
    iput p1, p0, Lyyds/ᛸᲁᛲᲀ;->ᛲᛴᛳᛲ:F

    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    iput p1, p0, Lyyds/ᛸᲁᛲᲀ;->ᛲᛳᛶᲁ:F

    .line 67
    .line 68
    iput p1, p0, Lyyds/ᛸᲁᛲᲀ;->ᛱᲈᲁ:F

    .line 69
    .line 70
    const/4 p1, 0x2

    .line 71
    invoke-virtual {p0, v0, p1}, Lyyds/ᛸᲁᛲᲀ;->ᲇᛱᛲ(Lyyds/ᛱᛸᛳᛵ;I)V

    .line 72
    .line 73
    .line 74
    :cond_1
    :goto_0
    return-void
.end method
