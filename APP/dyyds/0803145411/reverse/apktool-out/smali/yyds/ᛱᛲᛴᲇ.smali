.class public final Lyyds/ᛱᛲᛴᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛱᛲᛴᲇ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛱᛲᛴᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final ᛲᲈᲁ(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final ᛵᛸᛸᛷ(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛱᛲᛴᲇ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-wide p0, -0x21ee3e68a836eL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    :pswitch_0
    return-void

    .line 15
    :pswitch_1
    const-wide p0, -0x39d31e68a836eL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :pswitch_2
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᛱᛲᛴᲇ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛱᛲᛴᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-wide v2, -0x21ee5e68a836eL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    check-cast v1, Landroid/animation/ValueAnimator;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    check-cast v1, Lyyds/ᛳᛶᛷᲈ;

    .line 26
    .line 27
    iget-object v0, v1, Lyyds/ᛳᛶᛷᲈ;->ᛶᛳᛶᛵ:Landroid/view/ViewTreeObserver;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, v1, Lyyds/ᛳᛶᛷᲈ;->ᛶᛳᛶᛵ:Landroid/view/ViewTreeObserver;

    .line 42
    .line 43
    :cond_0
    iget-object v0, v1, Lyyds/ᛳᛶᛷᲈ;->ᛶᛳᛶᛵ:Landroid/view/ViewTreeObserver;

    .line 44
    .line 45
    iget-object v1, v1, Lyyds/ᛳᛶᛷᲈ;->ᛷᛲᲈᛱ:Lyyds/ᛳᛴᛱᛶ;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_1
    const-wide p0, -0x39d33e68a836eL

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    check-cast v1, Lyyds/ᲇᛶᲀᲁ;

    .line 63
    .line 64
    const/4 p0, 0x1

    .line 65
    invoke-virtual {v1, p0}, Lyyds/ᲇᛶᲀᲁ;->ᛲᲈᲁ(Z)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_2
    check-cast v1, Lyyds/ᲁᲈᲇᛴ;

    .line 70
    .line 71
    iget-object v0, v1, Lyyds/ᲁᲈᲇᛴ;->ᛵᲀᛵᛸ:Landroid/view/ViewTreeObserver;

    .line 72
    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_2

    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, v1, Lyyds/ᲁᲈᲇᛴ;->ᛵᲀᛵᛸ:Landroid/view/ViewTreeObserver;

    .line 86
    .line 87
    :cond_2
    iget-object v0, v1, Lyyds/ᲁᲈᲇᛴ;->ᛵᲀᛵᛸ:Landroid/view/ViewTreeObserver;

    .line 88
    .line 89
    iget-object v1, v1, Lyyds/ᲁᲈᲇᛴ;->ᛷᛲᲈᛱ:Lyyds/ᛳᛴᛱᛶ;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 92
    .line 93
    .line 94
    :cond_3
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
