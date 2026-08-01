.class public final Liw;
.super Landroidx/core/view/α;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic θ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 8
    iput p1, p0, Liw;->θ:I

    invoke-direct {p0}, Landroidx/core/view/α;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroidx/viewpager/widget/ViewPager;)V
    .locals 0

    .line 1
    const/4 p1, 0x2

    .line 2
    iput p1, p0, Liw;->θ:I

    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/core/view/α;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public γ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget v0, p0, Liw;->θ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroidx/core/view/α;->γ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-super {p0, p1, p2}, Landroidx/core/view/α;->γ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 11
    .line 12
    .line 13
    const-class p0, Landroidx/viewpager/widget/ViewPager;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityRecord;->setScrollable(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    invoke-super {p0, p1, p2}, Landroidx/core/view/α;->γ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 31
    .line 32
    .line 33
    check-cast p1, Landroidx/core/widget/NestedScrollView;

    .line 34
    .line 35
    const-class p0, Landroid/widget/ScrollView;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-lez p0, :cond_0

    .line 49
    .line 50
    const/4 p0, 0x1

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 p0, 0x0

    .line 53
    :goto_0
    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityRecord;->setScrollable(Z)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityRecord;->setScrollX(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityRecord;->setScrollY(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityRecord;->setMaxScrollX(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityRecord;->setMaxScrollY(I)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final δ(Landroid/view/View;Lэ;)V
    .locals 2

    .line 1
    iget v0, p0, Liw;->θ:I

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/core/view/α;->ε:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p2, Lэ;->α:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 9
    .line 10
    invoke-virtual {p0, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 11
    .line 12
    .line 13
    const-class p0, Landroidx/viewpager/widget/ViewPager;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p2, p0}, Lэ;->η(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    invoke-virtual {v0, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_0
    iget-object v0, p2, Lэ;->α:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 28
    .line 29
    invoke-virtual {p0, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 30
    .line 31
    .line 32
    check-cast p1, Landroidx/core/widget/NestedScrollView;

    .line 33
    .line 34
    const-class p0, Landroid/widget/ScrollView;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p2, p0}, Lэ;->η(Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_1

    .line 48
    .line 49
    invoke-virtual {p1}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-lez p0, :cond_1

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-lez v0, :cond_0

    .line 64
    .line 65
    sget-object v0, Lч;->θ:Lч;

    .line 66
    .line 67
    invoke-virtual {p2, v0}, Lэ;->β(Lч;)V

    .line 68
    .line 69
    .line 70
    sget-object v0, Lч;->ι:Lч;

    .line 71
    .line 72
    invoke-virtual {p2, v0}, Lэ;->β(Lч;)V

    .line 73
    .line 74
    .line 75
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-ge p1, p0, :cond_1

    .line 80
    .line 81
    sget-object p0, Lч;->η:Lч;

    .line 82
    .line 83
    invoke-virtual {p2, p0}, Lэ;->β(Lч;)V

    .line 84
    .line 85
    .line 86
    sget-object p0, Lч;->κ:Lч;

    .line 87
    .line 88
    invoke-virtual {p2, p0}, Lэ;->β(Lч;)V

    .line 89
    .line 90
    .line 91
    :cond_1
    return-void

    .line 92
    :pswitch_1
    iget-object v0, p2, Lэ;->α:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 93
    .line 94
    invoke-virtual {p0, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 95
    .line 96
    .line 97
    sget-object p0, Landroidx/drawerlayout/widget/DrawerLayout;->Η:[I

    .line 98
    .line 99
    sget-object p0, Lb92;->α:Ljava/util/WeakHashMap;

    .line 100
    .line 101
    invoke-virtual {p1}, Landroid/view/View;->getImportantForAccessibility()I

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    const/4 v1, 0x4

    .line 106
    if-eq p0, v1, :cond_2

    .line 107
    .line 108
    invoke-virtual {p1}, Landroid/view/View;->getImportantForAccessibility()I

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    const/4 p1, 0x2

    .line 113
    if-eq p0, p1, :cond_2

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_2
    const/4 p0, -0x1

    .line 117
    iput p0, p2, Lэ;->β:I

    .line 118
    .line 119
    const/4 p0, 0x0

    .line 120
    invoke-virtual {v0, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;)V

    .line 121
    .line 122
    .line 123
    :goto_0
    return-void

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public η(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 3

    .line 1
    iget v0, p0, Liw;->θ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroidx/core/view/α;->η(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    invoke-super {p0, p1, p2, p3}, Landroidx/core/view/α;->η(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :pswitch_1
    invoke-super {p0, p1, p2, p3}, Landroidx/core/view/α;->η(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    const/4 p3, 0x1

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    goto/16 :goto_1

    .line 24
    .line 25
    :cond_0
    check-cast p1, Landroidx/core/widget/NestedScrollView;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    const/4 v0, 0x0

    .line 32
    if-nez p0, :cond_1

    .line 33
    .line 34
    goto/16 :goto_0

    .line 35
    .line 36
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    new-instance v1, Landroid/graphics/Rect;

    .line 41
    .line 42
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Landroid/graphics/Matrix;->isIdentity()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    invoke-virtual {p1, v1}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    :cond_2
    const/16 v1, 0x1000

    .line 66
    .line 67
    if-eq p2, v1, :cond_4

    .line 68
    .line 69
    const/16 v1, 0x2000

    .line 70
    .line 71
    if-eq p2, v1, :cond_3

    .line 72
    .line 73
    const v1, 0x1020038

    .line 74
    .line 75
    .line 76
    if-eq p2, v1, :cond_3

    .line 77
    .line 78
    const v1, 0x102003a

    .line 79
    .line 80
    .line 81
    if-eq p2, v1, :cond_4

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    sub-int/2addr p0, p2

    .line 89
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    sub-int/2addr p0, p2

    .line 94
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    sub-int/2addr p2, p0

    .line 99
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    if-eq p0, p2, :cond_5

    .line 108
    .line 109
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    sub-int/2addr v0, p2

    .line 114
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    sub-int/2addr p0, p2

    .line 119
    invoke-virtual {p1, v0, p0, p3}, Landroidx/core/widget/NestedScrollView;->χ(IIZ)V

    .line 120
    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    sub-int/2addr p0, p2

    .line 128
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    sub-int/2addr p0, p2

    .line 133
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    add-int/2addr p2, p0

    .line 138
    invoke-virtual {p1}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    invoke-static {p2, p0}, Ljava/lang/Math;->min(II)I

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 147
    .line 148
    .line 149
    move-result p2

    .line 150
    if-eq p0, p2, :cond_5

    .line 151
    .line 152
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    .line 153
    .line 154
    .line 155
    move-result p2

    .line 156
    sub-int/2addr v0, p2

    .line 157
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    sub-int/2addr p0, p2

    .line 162
    invoke-virtual {p1, v0, p0, p3}, Landroidx/core/widget/NestedScrollView;->χ(IIZ)V

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_5
    :goto_0
    move p3, v0

    .line 167
    :goto_1
    return p3

    .line 168
    nop

    .line 169
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
