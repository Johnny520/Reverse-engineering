.class public final Lcom/google/android/material/button/飘花落叶言子楪苏哲世兰;
.super Landroidx/core/view/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final synthetic 飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪兰世苏哲:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/google/android/material/button/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/google/android/material/button/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/core/view/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲兰苏(Landroid/view/View;L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/google/android/material/button/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/material/button/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/core/view/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Landroid/view/View$AccessibilityDelegate;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p2, p2, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 13
    .line 14
    .line 15
    check-cast v1, Lcom/google/android/material/internal/NavigationMenuItemView;

    .line 16
    .line 17
    iget-boolean p0, v1, Lcom/google/android/material/internal/NavigationMenuItemView;->飘花落叶言子世哲苏楪兰:Z

    .line 18
    .line 19
    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const p1, 0x2412004c

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const-string p2, "AccessibilityNodeInfo.roleDescription"

    .line 38
    .line 39
    invoke-virtual {p1, p2, p0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_0
    iget-object p2, p2, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 44
    .line 45
    invoke-virtual {p0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 46
    .line 47
    .line 48
    check-cast v1, Lcom/google/android/material/internal/CheckableImageButton;

    .line 49
    .line 50
    iget-boolean p0, v1, Lcom/google/android/material/internal/CheckableImageButton;->飘花落叶言子楪兰世哲苏:Z

    .line 51
    .line 52
    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 53
    .line 54
    .line 55
    iget-boolean p0, v1, Lcom/google/android/material/internal/CheckableImageButton;->飘花落叶言子楪兰世苏哲:Z

    .line 56
    .line 57
    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_1
    iget-object v0, p2, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 62
    .line 63
    invoke-virtual {p0, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 64
    .line 65
    .line 66
    check-cast v1, Lcom/google/android/material/datepicker/MaterialCalendar;

    .line 67
    .line 68
    iget-object p0, v1, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪苏世兰:Landroid/view/View;

    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-nez p0, :cond_0

    .line 75
    .line 76
    const p0, 0x241200fc

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, p0}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世兰哲(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    goto :goto_0

    .line 84
    :cond_0
    const p0, 0x241200f9

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, p0}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世兰哲(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    :goto_0
    new-instance p1, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世哲苏兰;

    .line 92
    .line 93
    const/16 v0, 0x10

    .line 94
    .line 95
    invoke-direct {p1, v0, p0}, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世哲苏兰;-><init>(ILjava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2, p1}, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲(L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世哲苏兰;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :pswitch_2
    iget-object v0, p2, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 103
    .line 104
    invoke-virtual {p0, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 105
    .line 106
    .line 107
    check-cast v1, Lcom/google/android/material/button/MaterialButtonToggleGroup;

    .line 108
    .line 109
    sget p0, Lcom/google/android/material/button/MaterialButtonToggleGroup;->飘花落叶言子世苏哲兰楪:I

    .line 110
    .line 111
    instance-of p0, p1, Lcom/google/android/material/button/MaterialButton;

    .line 112
    .line 113
    const/4 v0, 0x0

    .line 114
    const/4 v2, -0x1

    .line 115
    if-nez p0, :cond_1

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_1
    move p0, v0

    .line 119
    move v3, p0

    .line 120
    :goto_1
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-ge p0, v4, :cond_4

    .line 125
    .line 126
    invoke-virtual {v1, p0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    if-ne v4, p1, :cond_2

    .line 131
    .line 132
    move v2, v3

    .line 133
    goto :goto_2

    .line 134
    :cond_2
    invoke-virtual {v1, p0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    instance-of v4, v4, Lcom/google/android/material/button/MaterialButton;

    .line 139
    .line 140
    if-eqz v4, :cond_3

    .line 141
    .line 142
    invoke-virtual {v1, p0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    const/16 v5, 0x8

    .line 151
    .line 152
    if-eq v4, v5, :cond_3

    .line 153
    .line 154
    add-int/lit8 v3, v3, 0x1

    .line 155
    .line 156
    :cond_3
    add-int/lit8 p0, p0, 0x1

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_4
    :goto_2
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    .line 160
    .line 161
    iget-boolean p0, p1, Lcom/google/android/material/button/MaterialButton;->飘花落叶言子世苏兰哲楪:Z

    .line 162
    .line 163
    const/4 p1, 0x1

    .line 164
    invoke-static {p0, v0, p1, v2, p1}, L飘花落叶言子世苏哲兰楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(ZIIII)L飘花落叶言子世苏哲兰楪/飘花落叶言子楪世哲兰苏;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-virtual {p2, p0}, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(L飘花落叶言子世苏哲兰楪/飘花落叶言子楪世哲兰苏;)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    nop

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public 飘花落叶言子楪世哲苏兰(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/button/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世苏哲:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroidx/core/view/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-super {p0, p1, p2}, Landroidx/core/view/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lcom/google/android/material/button/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lcom/google/android/material/internal/CheckableImageButton;

    .line 16
    .line 17
    iget-boolean p0, p0, Lcom/google/android/material/internal/CheckableImageButton;->飘花落叶言子楪兰世苏哲:Z

    .line 18
    .line 19
    invoke-virtual {p2, p0}, Landroid/view/accessibility/AccessibilityRecord;->setChecked(Z)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
