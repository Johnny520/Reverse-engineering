.class public final Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;
.super Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final synthetic 飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世兰苏哲:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public 飘花落叶言子世哲兰苏楪(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;

    .line 4
    .line 5
    iget-object p1, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/enums/PopupPosition;

    .line 6
    .line 7
    sget-object v0, Lcom/lxj/xpopup/enums/PopupPosition;->Left:Lcom/lxj/xpopup/enums/PopupPosition;

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    sget-object v0, Lcom/lxj/xpopup/enums/PopupPosition;->Right:Lcom/lxj/xpopup/enums/PopupPosition;

    .line 28
    .line 29
    if-ne p1, v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method public final 飘花落叶言子世哲苏兰楪(Landroid/view/View;I)Z
    .locals 4

    .line 1
    iget v0, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 11
    .line 12
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子世哲兰苏楪:I

    .line 13
    .line 14
    if-ne v0, v2, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    iget-boolean v3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子苏世哲兰楪:Z

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    const/4 v3, 0x3

    .line 23
    if-ne v0, v3, :cond_4

    .line 24
    .line 25
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子苏世楪哲兰:I

    .line 26
    .line 27
    if-ne v0, p2, :cond_4

    .line 28
    .line 29
    iget-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子楪世兰苏哲:Z

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    if-eqz p2, :cond_2

    .line 33
    .line 34
    iget-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子苏世哲楪兰:Ljava/lang/ref/WeakReference;

    .line 35
    .line 36
    if-eqz p2, :cond_3

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    move-object v0, p2

    .line 43
    check-cast v0, Landroid/view/View;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    iget-object p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子苏楪哲兰世:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-nez v3, :cond_3

    .line 53
    .line 54
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    check-cast p2, Ljava/lang/ref/WeakReference;

    .line 59
    .line 60
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    move-object v0, p2

    .line 65
    check-cast v0, Landroid/view/View;

    .line 66
    .line 67
    :cond_3
    :goto_0
    if-eqz v0, :cond_4

    .line 68
    .line 69
    const/4 p2, -0x1

    .line 70
    invoke-virtual {v0, p2}, Landroid/view/View;->canScrollVertically(I)Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-eqz p2, :cond_4

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 78
    .line 79
    .line 80
    iget-object p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子苏楪哲世兰:Ljava/lang/ref/WeakReference;

    .line 81
    .line 82
    if-eqz p0, :cond_5

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    if-ne p0, p1, :cond_5

    .line 89
    .line 90
    move v1, v2

    .line 91
    :cond_5
    :goto_1
    return v1

    .line 92
    :pswitch_0
    check-cast p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 93
    .line 94
    iget p2, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪苏世兰哲:I

    .line 95
    .line 96
    if-ne p2, v2, :cond_6

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_6
    iget-object p0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪哲苏兰世:Ljava/lang/ref/WeakReference;

    .line 100
    .line 101
    if-eqz p0, :cond_7

    .line 102
    .line 103
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    if-ne p0, p1, :cond_7

    .line 108
    .line 109
    move v1, v2

    .line 110
    :cond_7
    :goto_2
    return v1

    .line 111
    :pswitch_1
    check-cast p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;

    .line 112
    .line 113
    iget-boolean p1, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪哲兰世苏:Z

    .line 114
    .line 115
    if-eqz p1, :cond_8

    .line 116
    .line 117
    iget-object p0, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰世苏哲:L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;

    .line 118
    .line 119
    invoke-virtual {p0, v2}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Z)Z

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    if-nez p0, :cond_8

    .line 124
    .line 125
    sget-object p0, Lcom/lxj/xpopup/enums/LayoutStatus;->Close:Lcom/lxj/xpopup/enums/LayoutStatus;

    .line 126
    .line 127
    if-eqz p0, :cond_8

    .line 128
    .line 129
    move v1, v2

    .line 130
    :cond_8
    return v1

    .line 131
    :pswitch_2
    return v2

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public 飘花落叶言子世楪苏兰哲()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子世楪苏兰哲()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :sswitch_0
    iget-object p0, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 14
    .line 15
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子世苏兰哲楪:Z

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子苏楪世兰哲:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget p0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子世苏哲兰楪:I

    .line 23
    .line 24
    :goto_0
    return p0

    .line 25
    :sswitch_1
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x3 -> :sswitch_0
    .end sparse-switch
.end method

.method public 飘花落叶言子世楪苏哲兰(Landroid/view/View;)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子世楪苏哲兰(Landroid/view/View;)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 14
    .line 15
    iget p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪苏兰哲世:I

    .line 16
    .line 17
    iget p0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪哲苏世兰:I

    .line 18
    .line 19
    add-int/2addr p1, p0

    .line 20
    return p1

    .line 21
    :pswitch_1
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子世苏兰哲楪(Landroid/view/View;FF)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x5

    .line 6
    const/4 v4, 0x3

    .line 7
    const/4 v5, 0x0

    .line 8
    iget-object p0, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    cmpg-float v0, p3, v5

    .line 14
    .line 15
    check-cast p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 16
    .line 17
    const/4 v1, 0x6

    .line 18
    if-gez v0, :cond_2

    .line 19
    .line 20
    iget-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子楪世苏兰哲:Z

    .line 21
    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    :cond_0
    :goto_0
    move v3, v4

    .line 25
    goto/16 :goto_3

    .line 26
    .line 27
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 32
    .line 33
    .line 34
    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子世苏楪兰哲:I

    .line 35
    .line 36
    if-le p2, p3, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    iget-boolean v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子世苏兰哲楪:Z

    .line 40
    .line 41
    if-eqz v0, :cond_7

    .line 42
    .line 43
    invoke-virtual {p0, p1, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子世苏哲楪兰(Landroid/view/View;F)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_7

    .line 48
    .line 49
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    cmpg-float p2, p2, v0

    .line 58
    .line 59
    if-gez p2, :cond_3

    .line 60
    .line 61
    iget p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子楪世哲兰苏:I

    .line 62
    .line 63
    int-to-float p2, p2

    .line 64
    cmpl-float p2, p3, p2

    .line 65
    .line 66
    if-gtz p2, :cond_d

    .line 67
    .line 68
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子苏楪世兰哲:I

    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子世楪苏哲兰()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    add-int/2addr v0, p3

    .line 79
    div-int/lit8 v0, v0, 0x2

    .line 80
    .line 81
    if-le p2, v0, :cond_4

    .line 82
    .line 83
    goto/16 :goto_3

    .line 84
    .line 85
    :cond_4
    iget-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子楪世苏兰哲:Z

    .line 86
    .line 87
    if-eqz p2, :cond_5

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子世楪苏哲兰()I

    .line 95
    .line 96
    .line 97
    move-result p3

    .line 98
    sub-int/2addr p2, p3

    .line 99
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 104
    .line 105
    .line 106
    move-result p3

    .line 107
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子世苏楪兰哲:I

    .line 108
    .line 109
    sub-int/2addr p3, v0

    .line 110
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 111
    .line 112
    .line 113
    move-result p3

    .line 114
    if-ge p2, p3, :cond_6

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_6
    :goto_1
    move v3, v1

    .line 118
    goto :goto_3

    .line 119
    :cond_7
    cmpl-float v0, p3, v5

    .line 120
    .line 121
    const/4 v3, 0x4

    .line 122
    if-eqz v0, :cond_a

    .line 123
    .line 124
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 129
    .line 130
    .line 131
    move-result p3

    .line 132
    cmpl-float p2, p2, p3

    .line 133
    .line 134
    if-lez p2, :cond_8

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_8
    iget-boolean p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子楪世苏兰哲:Z

    .line 138
    .line 139
    if-eqz p2, :cond_9

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_9
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子世苏楪兰哲:I

    .line 147
    .line 148
    sub-int p3, p2, p3

    .line 149
    .line 150
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 151
    .line 152
    .line 153
    move-result p3

    .line 154
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子世苏哲兰楪:I

    .line 155
    .line 156
    sub-int/2addr p2, v0

    .line 157
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    if-ge p3, p2, :cond_d

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_a
    :goto_2
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    iget-boolean p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子楪世苏兰哲:Z

    .line 169
    .line 170
    if-eqz p3, :cond_b

    .line 171
    .line 172
    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子世苏楪哲兰:I

    .line 173
    .line 174
    sub-int p3, p2, p3

    .line 175
    .line 176
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 177
    .line 178
    .line 179
    move-result p3

    .line 180
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子世苏哲兰楪:I

    .line 181
    .line 182
    sub-int/2addr p2, v0

    .line 183
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 184
    .line 185
    .line 186
    move-result p2

    .line 187
    if-ge p3, p2, :cond_d

    .line 188
    .line 189
    goto/16 :goto_0

    .line 190
    .line 191
    :cond_b
    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子世苏楪兰哲:I

    .line 192
    .line 193
    if-ge p2, p3, :cond_c

    .line 194
    .line 195
    iget p3, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子世苏哲兰楪:I

    .line 196
    .line 197
    sub-int p3, p2, p3

    .line 198
    .line 199
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 200
    .line 201
    .line 202
    move-result p3

    .line 203
    if-ge p2, p3, :cond_6

    .line 204
    .line 205
    goto/16 :goto_0

    .line 206
    .line 207
    :cond_c
    sub-int p3, p2, p3

    .line 208
    .line 209
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 210
    .line 211
    .line 212
    move-result p3

    .line 213
    iget v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子世苏哲兰楪:I

    .line 214
    .line 215
    sub-int/2addr p2, v0

    .line 216
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 217
    .line 218
    .line 219
    move-result p2

    .line 220
    if-ge p3, p2, :cond_d

    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_d
    :goto_3
    invoke-virtual {p0, p1, v3, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子世苏哲兰楪(Landroid/view/View;IZ)V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :pswitch_0
    check-cast p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 228
    .line 229
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;

    .line 230
    .line 231
    invoke-virtual {v0, p2}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子世哲楪苏兰(F)Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-eqz v0, :cond_e

    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_e
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;

    .line 239
    .line 240
    invoke-virtual {v0, p1, p2}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏楪兰世哲(Landroid/view/View;F)Z

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    if-eqz v0, :cond_f

    .line 245
    .line 246
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;

    .line 247
    .line 248
    invoke-virtual {v0, p2, p3}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子世哲苏楪兰(FF)Z

    .line 249
    .line 250
    .line 251
    move-result p2

    .line 252
    if-nez p2, :cond_12

    .line 253
    .line 254
    iget-object p2, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;

    .line 255
    .line 256
    invoke-virtual {p2, p1}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子世哲楪兰苏(Landroid/view/View;)Z

    .line 257
    .line 258
    .line 259
    move-result p2

    .line 260
    if-eqz p2, :cond_11

    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_f
    cmpl-float v0, p2, v5

    .line 264
    .line 265
    if-eqz v0, :cond_10

    .line 266
    .line 267
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 268
    .line 269
    .line 270
    move-result p2

    .line 271
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 272
    .line 273
    .line 274
    move-result p3

    .line 275
    cmpl-float p2, p2, p3

    .line 276
    .line 277
    if-lez p2, :cond_10

    .line 278
    .line 279
    goto :goto_5

    .line 280
    :cond_10
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 281
    .line 282
    .line 283
    move-result p2

    .line 284
    iget-object p3, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;

    .line 285
    .line 286
    invoke-virtual {p3}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰哲世苏()I

    .line 287
    .line 288
    .line 289
    move-result p3

    .line 290
    sub-int p3, p2, p3

    .line 291
    .line 292
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 293
    .line 294
    .line 295
    move-result p3

    .line 296
    iget-object v0, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;

    .line 297
    .line 298
    invoke-virtual {v0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰哲苏世()I

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    sub-int/2addr p2, v0

    .line 303
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 304
    .line 305
    .line 306
    move-result p2

    .line 307
    if-ge p3, p2, :cond_12

    .line 308
    .line 309
    :cond_11
    :goto_4
    move v3, v4

    .line 310
    :cond_12
    :goto_5
    invoke-virtual {p0, p1, v3, v2}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪兰世哲苏(Landroid/view/View;IZ)V

    .line 311
    .line 312
    .line 313
    return-void

    .line 314
    :pswitch_1
    check-cast p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;

    .line 315
    .line 316
    iget-object p3, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰世哲苏:Landroid/view/View;

    .line 317
    .line 318
    const/16 v0, 0xd

    .line 319
    .line 320
    if-ne p1, p3, :cond_13

    .line 321
    .line 322
    cmpl-float p3, p2, v5

    .line 323
    .line 324
    if-nez p3, :cond_13

    .line 325
    .line 326
    iget-boolean p1, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪哲兰苏世:Z

    .line 327
    .line 328
    if-eqz p1, :cond_1a

    .line 329
    .line 330
    new-instance p1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 331
    .line 332
    invoke-direct {p1, p0, v0}, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;-><init>(Ljava/lang/Object;I)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 336
    .line 337
    .line 338
    goto/16 :goto_7

    .line 339
    .line 340
    :cond_13
    iget-object p3, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 341
    .line 342
    if-ne p1, p3, :cond_14

    .line 343
    .line 344
    iget-boolean v2, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子世楪哲兰苏:Z

    .line 345
    .line 346
    if-eqz v2, :cond_14

    .line 347
    .line 348
    iget-boolean v2, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子世楪兰苏哲:Z

    .line 349
    .line 350
    if-nez v2, :cond_14

    .line 351
    .line 352
    const/high16 v2, -0x3c060000    # -500.0f

    .line 353
    .line 354
    cmpg-float v2, p2, v2

    .line 355
    .line 356
    if-gez v2, :cond_14

    .line 357
    .line 358
    new-instance p1, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 359
    .line 360
    invoke-direct {p1, p0, v0}, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;-><init>(Ljava/lang/Object;I)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 364
    .line 365
    .line 366
    goto :goto_7

    .line 367
    :cond_14
    iget-object v0, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪哲苏兰世:Lcom/lxj/xpopup/enums/PopupPosition;

    .line 368
    .line 369
    sget-object v2, Lcom/lxj/xpopup/enums/PopupPosition;->Left:Lcom/lxj/xpopup/enums/PopupPosition;

    .line 370
    .line 371
    if-ne v0, v2, :cond_17

    .line 372
    .line 373
    const/high16 v0, -0x3b860000    # -1000.0f

    .line 374
    .line 375
    cmpg-float p2, p2, v0

    .line 376
    .line 377
    if-gez p2, :cond_15

    .line 378
    .line 379
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    .line 380
    .line 381
    .line 382
    move-result p2

    .line 383
    neg-int p2, p2

    .line 384
    goto :goto_6

    .line 385
    :cond_15
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    .line 386
    .line 387
    .line 388
    move-result p2

    .line 389
    neg-int p2, p2

    .line 390
    div-int/lit8 p2, p2, 0x2

    .line 391
    .line 392
    iget-object p3, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 393
    .line 394
    invoke-virtual {p3}, Landroid/view/View;->getLeft()I

    .line 395
    .line 396
    .line 397
    move-result p3

    .line 398
    if-ge p3, p2, :cond_16

    .line 399
    .line 400
    iget-object p2, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 401
    .line 402
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 403
    .line 404
    .line 405
    move-result p2

    .line 406
    neg-int v1, p2

    .line 407
    :cond_16
    move p2, v1

    .line 408
    goto :goto_6

    .line 409
    :cond_17
    const/high16 p3, 0x447a0000    # 1000.0f

    .line 410
    .line 411
    cmpl-float p2, p2, p3

    .line 412
    .line 413
    if-lez p2, :cond_18

    .line 414
    .line 415
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 416
    .line 417
    .line 418
    move-result p2

    .line 419
    goto :goto_6

    .line 420
    :cond_18
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 421
    .line 422
    .line 423
    move-result p2

    .line 424
    iget-object p3, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 425
    .line 426
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    .line 427
    .line 428
    .line 429
    move-result p3

    .line 430
    div-int/lit8 p3, p3, 0x2

    .line 431
    .line 432
    sub-int/2addr p2, p3

    .line 433
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 434
    .line 435
    .line 436
    move-result p3

    .line 437
    if-ge p3, p2, :cond_19

    .line 438
    .line 439
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 440
    .line 441
    .line 442
    move-result p2

    .line 443
    iget-object p3, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 444
    .line 445
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    .line 446
    .line 447
    .line 448
    move-result p3

    .line 449
    sub-int/2addr p2, p3

    .line 450
    goto :goto_6

    .line 451
    :cond_19
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 452
    .line 453
    .line 454
    move-result p2

    .line 455
    :goto_6
    iget-object p3, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰世苏哲:L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;

    .line 456
    .line 457
    iget-object v0, p0, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 458
    .line 459
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 460
    .line 461
    .line 462
    move-result p1

    .line 463
    invoke-virtual {p3, v0, p2, p1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世(Landroid/view/View;II)Z

    .line 464
    .line 465
    .line 466
    sget-object p1, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 467
    .line 468
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 469
    .line 470
    .line 471
    :cond_1a
    :goto_7
    return-void

    .line 472
    :pswitch_2
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 473
    .line 474
    .line 475
    move-result p2

    .line 476
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 477
    .line 478
    .line 479
    move-result p2

    .line 480
    check-cast p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;

    .line 481
    .line 482
    iget p3, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪兰世苏哲:I

    .line 483
    .line 484
    if-le p2, p3, :cond_1b

    .line 485
    .line 486
    goto :goto_8

    .line 487
    :cond_1b
    iget-object p2, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪哲兰苏世:L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;

    .line 488
    .line 489
    iget-object p3, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪哲苏兰世:L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏世兰哲;

    .line 490
    .line 491
    invoke-virtual {p2, p3, v1, v1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世(Landroid/view/View;II)Z

    .line 492
    .line 493
    .line 494
    iget-object p2, p0, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪哲兰苏世:L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;

    .line 495
    .line 496
    invoke-virtual {p2, p1, v1, v1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世(Landroid/view/View;II)Z

    .line 497
    .line 498
    .line 499
    sget-object p1, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 500
    .line 501
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 502
    .line 503
    .line 504
    :goto_8
    return-void

    .line 505
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子世苏兰楪哲(Landroid/view/View;IIII)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 9
    .line 10
    invoke-virtual {v1, p3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子楪兰苏哲世(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 15
    .line 16
    iget-object p0, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪哲兰世苏:Ljava/lang/ref/WeakReference;

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Landroid/view/View;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    :goto_0
    if-eqz p0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    check-cast p3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 35
    .line 36
    if-eqz p3, :cond_1

    .line 37
    .line 38
    iget-object p4, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 41
    .line 42
    .line 43
    move-result p5

    .line 44
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-virtual {p4, p3, p5, p1}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏世兰楪哲(Landroid/view/ViewGroup$MarginLayoutParams;II)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    iget-object p0, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪兰苏世哲:Ljava/util/LinkedHashSet;

    .line 55
    .line 56
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-nez p1, :cond_3

    .line 61
    .line 62
    iget-object p1, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;

    .line 63
    .line 64
    invoke-virtual {p1, p2}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰(I)F

    .line 65
    .line 66
    .line 67
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-nez p1, :cond_2

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    invoke-static {p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏世兰(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    throw p0

    .line 83
    :cond_3
    :goto_1
    return-void

    .line 84
    :pswitch_1
    check-cast v1, Lcom/lxj/xpopup/widget/PopupDrawerLayout;

    .line 85
    .line 86
    iget-object p3, v1, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰世哲苏:Landroid/view/View;

    .line 87
    .line 88
    if-ne p1, p3, :cond_4

    .line 89
    .line 90
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    iget-object p2, v1, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰世哲苏:Landroid/view/View;

    .line 95
    .line 96
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    const/4 p5, 0x0

    .line 101
    invoke-virtual {p3, p5, p5, p1, p2}, Landroid/view/View;->layout(IIII)V

    .line 102
    .line 103
    .line 104
    iget-object p1, v1, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 105
    .line 106
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    add-int/2addr p1, p4

    .line 111
    invoke-static {v1, p1}, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪世苏哲兰(Lcom/lxj/xpopup/widget/PopupDrawerLayout;I)I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    iget-object p2, v1, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 116
    .line 117
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 118
    .line 119
    .line 120
    move-result p3

    .line 121
    iget-object p4, v1, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 122
    .line 123
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    .line 124
    .line 125
    .line 126
    move-result p4

    .line 127
    add-int/2addr p4, p1

    .line 128
    iget-object p5, v1, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰苏世哲:Landroid/view/View;

    .line 129
    .line 130
    invoke-virtual {p5}, Landroid/view/View;->getBottom()I

    .line 131
    .line 132
    .line 133
    move-result p5

    .line 134
    invoke-virtual {p2, p1, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, p1}, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲兰苏楪(I)V

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_4
    invoke-virtual {p0, p2}, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲兰苏楪(I)V

    .line 142
    .line 143
    .line 144
    :goto_2
    return-void

    .line 145
    :pswitch_2
    check-cast v1, Lcom/lxj/xpopup/widget/PhotoViewContainer;

    .line 146
    .line 147
    iget-object p0, v1, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪哲苏兰世:L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏世兰哲;

    .line 148
    .line 149
    if-eq p1, p0, :cond_5

    .line 150
    .line 151
    invoke-virtual {p0, p5}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 152
    .line 153
    .line 154
    :cond_5
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    int-to-float p0, p0

    .line 159
    const/high16 p2, 0x3f800000    # 1.0f

    .line 160
    .line 161
    mul-float/2addr p0, p2

    .line 162
    iget p3, v1, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪兰世哲苏:I

    .line 163
    .line 164
    int-to-float p3, p3

    .line 165
    div-float/2addr p0, p3

    .line 166
    const p3, 0x3e4ccccd    # 0.2f

    .line 167
    .line 168
    .line 169
    mul-float/2addr p0, p3

    .line 170
    sub-float/2addr p2, p0

    .line 171
    iget-object p0, v1, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪哲苏兰世:L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏世兰哲;

    .line 172
    .line 173
    invoke-virtual {p0, p2}, Landroid/view/View;->setScaleX(F)V

    .line 174
    .line 175
    .line 176
    iget-object p0, v1, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪哲苏兰世:L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏世兰哲;

    .line 177
    .line 178
    invoke-virtual {p0, p2}, Landroid/view/View;->setScaleY(F)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, p2}, Landroid/view/View;->setScaleX(F)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1, p2}, Landroid/view/View;->setScaleY(F)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    nop

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public 飘花落叶言子世苏哲兰楪(I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    if-ne p1, v1, :cond_0

    .line 11
    .line 12
    check-cast p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 13
    .line 14
    iget-boolean p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子世哲楪兰苏:Z

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子世苏楪兰哲(I)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :pswitch_1
    if-ne p1, v1, :cond_1

    .line 23
    .line 24
    check-cast p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 25
    .line 26
    iget-boolean p1, p0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪苏世哲兰:Z

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪哲兰苏世(I)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public 飘花落叶言子楪世兰哲苏(Landroid/view/View;II)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    invoke-super {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰哲苏(Landroid/view/View;II)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_1
    check-cast v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->飘花落叶言子世楪苏哲兰()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-virtual {p0}, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {p2, p1, p0}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪世哲兰苏(III)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :pswitch_2
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0

    .line 33
    :pswitch_3
    check-cast v1, Lcom/lxj/xpopup/widget/PhotoViewContainer;

    .line 34
    .line 35
    iget-object p0, v1, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪哲苏兰世:L飘花落叶言子兰苏哲世楪/飘花落叶言子楪苏世兰哲;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    div-int/lit8 p3, p3, 0x2

    .line 42
    .line 43
    add-int/2addr p3, p0

    .line 44
    iget p0, v1, Lcom/lxj/xpopup/widget/PhotoViewContainer;->飘花落叶言子楪兰世哲苏:I

    .line 45
    .line 46
    if-ltz p3, :cond_0

    .line 47
    .line 48
    invoke-static {p3, p0}, Ljava/lang/Math;->min(II)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    neg-int p1, p3

    .line 54
    invoke-static {p1, p0}, Ljava/lang/Math;->min(II)I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    neg-int p0, p0

    .line 59
    :goto_0
    return p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public 飘花落叶言子楪世兰苏哲(Landroid/view/View;I)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/lxj/xpopup/widget/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪世兰苏哲(Landroid/view/View;I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :pswitch_1
    check-cast v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 19
    .line 20
    iget-object p0, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;

    .line 21
    .line 22
    invoke-virtual {p0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子世楪哲苏兰()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    iget-object p1, v1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;

    .line 27
    .line 28
    invoke-virtual {p1}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子世楪苏兰哲()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    invoke-static {p2, p0, p1}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪世哲兰苏(III)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :pswitch_2
    check-cast v1, Lcom/lxj/xpopup/widget/PopupDrawerLayout;

    .line 38
    .line 39
    iget-object p0, v1, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪兰世哲苏:Landroid/view/View;

    .line 40
    .line 41
    if-ne p1, p0, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-static {v1, p2}, Lcom/lxj/xpopup/widget/PopupDrawerLayout;->飘花落叶言子楪世苏哲兰(Lcom/lxj/xpopup/widget/PopupDrawerLayout;I)I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    :goto_0
    return p2

    .line 49
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
