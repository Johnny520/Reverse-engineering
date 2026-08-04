.class public final Lyyds/ᛷᛵᛱᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛷᛵᛱᛵ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛷᛵᛱᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    iget p1, p0, Lyyds/ᛷᛵᛱᛵ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    iget-object p0, p0, Lyyds/ᛷᛵᛱᛵ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lyyds/ᲁᲇᲀᛸ;

    .line 11
    .line 12
    iget-object p1, p0, Lyyds/ᲁᲇᲀᛸ;->ᲀᛲᛲᲇ:Lyyds/ᛵᛴᛵᲈ;

    .line 13
    .line 14
    iget-object v2, p0, Lyyds/ᲁᲇᲀᛸ;->ᛵᲀᲈᛴ:Landroid/os/Handler;

    .line 15
    .line 16
    iget-object p0, p0, Lyyds/ᲁᲇᲀᛸ;->ᛲᛳᛴᛸ:Lyyds/ᛴᲈᛷᛷ;

    .line 17
    .line 18
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    float-to-int v4, v4

    .line 27
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    float-to-int p2, p2

    .line 32
    if-nez v3, :cond_0

    .line 33
    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    if-ltz v4, :cond_0

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->getWidth()I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-ge v4, v5, :cond_0

    .line 49
    .line 50
    if-ltz p2, :cond_0

    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->getHeight()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-ge p2, p0, :cond_0

    .line 57
    .line 58
    const-wide/16 v3, 0xfa

    .line 59
    .line 60
    invoke-virtual {v2, p1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    if-ne v3, v1, :cond_1

    .line 65
    .line 66
    invoke-virtual {v2, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    :goto_0
    return v0

    .line 70
    :pswitch_0
    check-cast p0, Lyyds/ᛵᛱᲀᛱ;

    .line 71
    .line 72
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-ne p1, v1, :cond_2

    .line 77
    .line 78
    iget-object p1, p0, Lyyds/ᛵᛱᲀᛱ;->ᛴᛸᲁᛵ:Landroid/widget/EditText;

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const/4 v2, 0x2

    .line 85
    aget-object p1, p1, v2

    .line 86
    .line 87
    if-eqz p1, :cond_2

    .line 88
    .line 89
    iget-object p1, p0, Lyyds/ᛵᛱᲀᛱ;->ᛴᛸᲁᛵ:Landroid/widget/EditText;

    .line 90
    .line 91
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    iget-object v2, p0, Lyyds/ᛵᛱᲀᛱ;->ᛴᛸᲁᛵ:Landroid/widget/EditText;

    .line 96
    .line 97
    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    sub-int/2addr p1, v2

    .line 102
    const/high16 v2, 0x42200000    # 40.0f

    .line 103
    .line 104
    invoke-virtual {p0, v2}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᲈᲁ(F)I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    sub-int/2addr p1, v2

    .line 109
    int-to-float p1, p1

    .line 110
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    cmpl-float p1, p2, p1

    .line 115
    .line 116
    if-ltz p1, :cond_2

    .line 117
    .line 118
    iget-object p0, p0, Lyyds/ᛵᛱᲀᛱ;->ᛴᛸᲁᛵ:Landroid/widget/EditText;

    .line 119
    .line 120
    const-string p1, ""

    .line 121
    .line 122
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 123
    .line 124
    .line 125
    move v0, v1

    .line 126
    :cond_2
    return v0

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
