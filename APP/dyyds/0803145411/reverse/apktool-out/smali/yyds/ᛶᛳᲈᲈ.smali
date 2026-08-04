.class public final Lyyds/ᛶᛳᲈᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final ᛲᛴᛳᛲ:Ljava/lang/ref/WeakReference;

.field public final ᛶᛷᛲᲁ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public ᲇᲇᲇᛱ:Landroid/view/ViewTreeObserver;

.field public final ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Landroid/view/View;Lyyds/ᛷᲀᛶᛵ;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lyyds/ᛶᛳᲈᲈ;->ᲀᛲᛳᲀ:I

    const-wide v0, -0x318fae68a836eL

    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    const-wide v0, -0x31903e68a836eL

    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lyyds/ᛶᛳᲈᲈ;->ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;

    .line 55
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lyyds/ᛶᛳᲈᲈ;->ᛲᛴᛳᛲ:Ljava/lang/ref/WeakReference;

    .line 56
    invoke-static {}, Lyyds/ᛴᛷᛷᲇ;->ᛳᲁᲁᲇ()Ljava/util/Map;

    move-result-object p1

    .line 57
    iput-object p1, p0, Lyyds/ᛶᛳᲈᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/ImageView;Lyyds/ᛷᲈᲈᛲ;Lyyds/ᛸᲀᲈᛸ;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lyyds/ᛶᛳᲈᲈ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    const-wide v0, -0x3d648e68a836eL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    const-wide v0, -0x3d651e68a836eL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    const-wide v0, -0x3d659e68a836eL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lyyds/ᛶᛳᲈᲈ;->ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 39
    .line 40
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Lyyds/ᛶᛳᲈᲈ;->ᛲᛴᛳᛲ:Ljava/lang/ref/WeakReference;

    .line 44
    .line 45
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 46
    .line 47
    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lyyds/ᛶᛳᲈᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 51
    .line 52
    return-void
.end method

.method public static ᛲᲈᲁ(Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 5

    .line 1
    instance-of v0, p0, Lyyds/ᛷᲀᛶᛵ;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p0, Landroid/widget/ImageView;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    check-cast p0, Landroid/view/ViewGroup;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x0

    .line 24
    :goto_0
    if-ge v1, v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const-wide v3, -0x3192de68a836eL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    invoke-static {v2, p1}, Lyyds/ᛶᛳᲈᲈ;->ᛲᲈᲁ(Landroid/view/View;Ljava/util/ArrayList;)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    return-void
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᛶᛳᲈᲈ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p0}, Lyyds/ᛶᛳᲈᲈ;->ᲀᛲᛳᲀ()V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    new-instance v0, Lyyds/ᲈᛵᛵᛴ;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object p0, v0

    .line 20
    :goto_0
    invoke-static {p0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    sget-object v0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 27
    .line 28
    const-wide v2, -0x3d669e68a836eL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v0, v2, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return v1

    .line 41
    :pswitch_0
    invoke-virtual {p0}, Lyyds/ᛶᛳᲈᲈ;->ᲇᲈᛵᛷ()V

    .line 42
    .line 43
    .line 44
    return v1

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛶᛳᲈᲈ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-wide v0, -0x3d65fe68a836eL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object v0, p0, Lyyds/ᛶᛳᲈᲈ;->ᲇᲇᲇᛱ:Landroid/view/ViewTreeObserver;

    .line 19
    .line 20
    if-ne v0, p1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    iput-object p1, p0, Lyyds/ᛶᛳᲈᲈ;->ᲇᲇᲇᛱ:Landroid/view/ViewTreeObserver;

    .line 35
    .line 36
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    return-void

    .line 40
    :pswitch_0
    const-wide v0, -0x3190be68a836eL

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object v0, p0, Lyyds/ᛶᛳᲈᲈ;->ᲇᲇᲇᛱ:Landroid/view/ViewTreeObserver;

    .line 53
    .line 54
    if-ne v0, p1, :cond_2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    if-eqz v0, :cond_3

    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    iput-object p1, p0, Lyyds/ᛶᛳᲈᲈ;->ᲇᲇᲇᛱ:Landroid/view/ViewTreeObserver;

    .line 69
    .line 70
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 71
    .line 72
    .line 73
    :goto_1
    iget-object p1, p0, Lyyds/ᛶᛳᲈᲈ;->ᛲᛴᛳᛲ:Ljava/lang/ref/WeakReference;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Lyyds/ᛷᲀᛶᛵ;

    .line 80
    .line 81
    if-eqz p1, :cond_4

    .line 82
    .line 83
    sget-object v0, Lyyds/ᛸᛵᲈᛷ;->ᲇᲇᲇᛱ:Lyyds/ᛸᛵᲈᛷ;

    .line 84
    .line 85
    invoke-virtual {p1}, Lyyds/ᛷᲀᛶᛵ;->ᛲᲈᲁ()Lyyds/ᲇᲁᲁᛱ;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v1, v1, Lyyds/ᲇᲁᲁᛱ;->ᛱᲈᲁ:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Lyyds/ᛷᲀᛶᛵ;->ᛲᲈᲁ()Lyyds/ᲇᲁᲁᛱ;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const/4 v2, 0x1

    .line 99
    iput-boolean v2, v0, Lyyds/ᲇᲁᲁᛱ;->ᛷᲈᲈᲁ:Z

    .line 100
    .line 101
    new-instance v0, Lyyds/ᲈᛷᛲᛸ;

    .line 102
    .line 103
    const/4 v2, 0x4

    .line 104
    invoke-direct {v0, p1, v2, v1}, Lyyds/ᲈᛷᛲᛸ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 108
    .line 109
    .line 110
    :cond_4
    invoke-virtual {p0}, Lyyds/ᛶᛳᲈᲈ;->ᲇᲈᛵᛷ()V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 3

    .line 1
    iget p1, p0, Lyyds/ᛶᛳᲈᲈ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    const-wide v1, -0x3d664e68a836eL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lyyds/ᛶᛳᲈᲈ;->ᲇᲇᲇᛱ:Landroid/view/ViewTreeObserver;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iput-object v0, p0, Lyyds/ᛶᛳᲈᲈ;->ᲇᲇᲇᛱ:Landroid/view/ViewTreeObserver;

    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_0
    const-wide v1, -0x31910e68a836eL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lyyds/ᛶᛳᲈᲈ;->ᲇᲇᲇᛱ:Landroid/view/ViewTreeObserver;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    iput-object v0, p0, Lyyds/ᛶᛳᲈᲈ;->ᲇᲇᲇᛱ:Landroid/view/ViewTreeObserver;

    .line 53
    .line 54
    iget-object p0, p0, Lyyds/ᛶᛳᲈᲈ;->ᛲᛴᛳᛲ:Ljava/lang/ref/WeakReference;

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, Lyyds/ᛷᲀᛶᛵ;

    .line 61
    .line 62
    if-eqz p0, :cond_2

    .line 63
    .line 64
    sget-object p1, Lyyds/ᛸᛵᲈᛷ;->ᲇᲇᲇᛱ:Lyyds/ᛸᛵᲈᛷ;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {p0}, Lyyds/ᛸᛵᲈᛷ;->ᛷᲇᛲᛱ(Lyyds/ᛷᲀᛶᛵ;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lyyds/ᛷᲀᛶᛵ;->ᛲᲈᲁ()Lyyds/ᲇᲁᲁᛱ;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    const/4 v0, 0x0

    .line 77
    iput-boolean v0, p1, Lyyds/ᲇᲁᲁᛱ;->ᛲᛳᛶᲁ:Z

    .line 78
    .line 79
    invoke-virtual {p0}, Lyyds/ᛷᲀᛶᛵ;->ᛲᲈᲁ()Lyyds/ᲇᲁᲁᛱ;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    const/4 p1, 0x1

    .line 84
    iput-boolean p1, p0, Lyyds/ᲇᲁᲁᛱ;->ᛷᲈᲈᲁ:Z

    .line 85
    .line 86
    :cond_2
    return-void

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public ᛵᛸᛸᛷ()V
    .locals 6

    .line 1
    iget-object v0, p0, Lyyds/ᛶᛳᲈᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Map;

    .line 4
    .line 5
    const-wide v1, -0x31921e68a836eL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    iget-object v1, p0, Lyyds/ᛶᛳᲈᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Ljava/util/Map;

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    new-instance v2, Ljava/util/ArrayList;

    .line 23
    .line 24
    const/16 v3, 0xa

    .line 25
    .line 26
    invoke-static {v1, v3}, Lyyds/ᛱᛱᛵᛲ;->ᛳᛸᛴᛶ(Ljava/lang/Iterable;I)I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Ljava/util/Map$Entry;

    .line 48
    .line 49
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    new-instance v5, Lkotlin/Pair;

    .line 58
    .line 59
    invoke-direct {v5, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    goto :goto_2

    .line 68
    :cond_0
    iget-object p0, p0, Lyyds/ᛶᛳᲈᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p0, Ljava/util/Map;

    .line 71
    .line 72
    invoke-interface {p0}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    .line 75
    monitor-exit v0

    .line 76
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    check-cast v0, Lkotlin/Pair;

    .line 91
    .line 92
    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Landroid/widget/ImageView;

    .line 97
    .line 98
    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Ljava/lang/Integer;

    .line 103
    .line 104
    invoke-virtual {v1}, Landroid/widget/ImageView;->getImageAlpha()I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-nez v2, :cond_1

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageAlpha(I)V

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_2
    return-void

    .line 119
    :goto_2
    monitor-exit v0

    .line 120
    throw p0
.end method

.method public ᲀᛲᛳᲀ()V
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛶᛳᲈᲈ;->ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/widget/ImageView;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, p0, Lyyds/ᛶᛳᲈᲈ;->ᛲᛴᛳᛲ:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lyyds/ᛷᲈᲈᛲ;

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object p0, p0, Lyyds/ᛶᛳᲈᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lyyds/ᛸᲀᲈᛸ;

    .line 32
    .line 33
    if-nez p0, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    if-ne v2, v3, :cond_3

    .line 45
    .line 46
    sget-object v2, Lyyds/ᲁᛱᛴᲁ;->ᲇᲇᲇᛱ:Lyyds/ᲁᛱᛴᲁ;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v1, p0}, Lyyds/ᲁᛱᛴᲁ;->ᛶᛴᛱᛲ(Landroid/widget/ImageView;Lyyds/ᛷᲈᲈᛲ;Lyyds/ᛸᲀᲈᛸ;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    :goto_0
    return-void
.end method

.method public ᲇᲈᛵᛷ()V
    .locals 7

    .line 1
    iget-object v0, p0, Lyyds/ᛶᛳᲈᲈ;->ᲇᲈᛵᛷ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/View;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, p0, Lyyds/ᛶᛳᲈᲈ;->ᛲᛴᛳᛲ:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lyyds/ᛷᲀᛶᛵ;

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    :goto_0
    return-void

    .line 23
    :cond_1
    invoke-virtual {v1}, Lyyds/ᛷᲀᛶᛵ;->ᛲᲈᲁ()Lyyds/ᲇᲁᲁᛱ;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-boolean v2, v2, Lyyds/ᲇᲁᲁᛱ;->ᲇᲇᲇᛱ:Z

    .line 28
    .line 29
    if-eqz v2, :cond_4

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    if-ne v2, v3, :cond_4

    .line 40
    .line 41
    new-instance v2, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v2}, Lyyds/ᛶᛳᲈᲈ;->ᛲᲈᲁ(Landroid/view/View;Ljava/util/ArrayList;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_3

    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    check-cast v3, Landroid/widget/ImageView;

    .line 64
    .line 65
    invoke-virtual {v3}, Landroid/widget/ImageView;->getImageAlpha()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_2

    .line 70
    .line 71
    iget-object v4, p0, Lyyds/ᛶᛳᲈᲈ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v4, Ljava/util/Map;

    .line 74
    .line 75
    const-wide v5, -0x31915e68a836eL

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    invoke-static {v5, v6}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3}, Landroid/widget/ImageView;->getImageAlpha()I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-interface {v4, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    const/4 v4, 0x0

    .line 95
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageAlpha(I)V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_3
    sget-object p0, Lyyds/ᛸᛵᲈᛷ;->ᲇᲇᲇᛱ:Lyyds/ᛸᛵᲈᛷ;

    .line 100
    .line 101
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-static {v0, v1}, Lyyds/ᛸᛵᲈᛷ;->ᛴᛸᲁᛵ(Landroid/view/View;Lyyds/ᛷᲀᛶᛵ;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_4
    invoke-virtual {p0}, Lyyds/ᛶᛳᲈᲈ;->ᛵᛸᛸᛷ()V

    .line 109
    .line 110
    .line 111
    const/16 p0, 0x8

    .line 112
    .line 113
    invoke-virtual {v1, p0}, Landroid/view/View;->setVisibility(I)V

    .line 114
    .line 115
    .line 116
    return-void
.end method
