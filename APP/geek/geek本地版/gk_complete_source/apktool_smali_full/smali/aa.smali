.class public final Laa;
.super Lx;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Laa;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Laa;->e:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Lx;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    iget v0, p0, Laa;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lx;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-super {p0, p1, p2}, Lx;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Laa;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lcom/google/android/material/internal/CheckableImageButton;

    .line 16
    .line 17
    iget-boolean p1, p1, Lcom/google/android/material/internal/CheckableImageButton;->d:Z

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setChecked(Z)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Landroid/view/View;Lj0;)V
    .locals 6

    .line 1
    iget v0, p0, Laa;->d:I

    .line 2
    .line 3
    iget-object v1, p0, Laa;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lx;->a:Landroid/view/View$AccessibilityDelegate;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p2, p2, Lj0;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 11
    .line 12
    invoke-virtual {v2, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 13
    .line 14
    .line 15
    check-cast v1, Lcom/google/android/material/internal/NavigationMenuItemView;

    .line 16
    .line 17
    iget-boolean p1, v1, Lcom/google/android/material/internal/NavigationMenuItemView;->x:Z

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    iget-object p2, p2, Lj0;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 24
    .line 25
    invoke-virtual {v2, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 26
    .line 27
    .line 28
    check-cast v1, Lut;

    .line 29
    .line 30
    iget-object p1, v1, Lut;->c0:Landroid/view/View;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_0

    .line 37
    .line 38
    invoke-virtual {v1}, Lml;->z()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const v0, 0x7f100089

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {v1}, Lml;->z()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const v0, 0x7f100087

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    :goto_0
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setHintText(Ljava/lang/CharSequence;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_1
    iget-object v0, p2, Lj0;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 74
    .line 75
    invoke-virtual {v2, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 76
    .line 77
    .line 78
    check-cast v1, Lcom/google/android/material/button/MaterialButtonToggleGroup;

    .line 79
    .line 80
    sget v0, Lcom/google/android/material/button/MaterialButtonToggleGroup;->k:I

    .line 81
    .line 82
    instance-of v0, p1, Lcom/google/android/material/button/MaterialButton;

    .line 83
    .line 84
    const/4 v2, 0x0

    .line 85
    const/4 v3, -0x1

    .line 86
    if-nez v0, :cond_1

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_1
    move v0, v2

    .line 90
    move v4, v0

    .line 91
    :goto_1
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-ge v0, v5, :cond_4

    .line 96
    .line 97
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    if-ne v5, p1, :cond_2

    .line 102
    .line 103
    move v3, v4

    .line 104
    goto :goto_2

    .line 105
    :cond_2
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    instance-of v5, v5, Lcom/google/android/material/button/MaterialButton;

    .line 110
    .line 111
    if-eqz v5, :cond_3

    .line 112
    .line 113
    invoke-virtual {v1, v0}, Lcom/google/android/material/button/MaterialButtonToggleGroup;->c(I)Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_3

    .line 118
    .line 119
    add-int/lit8 v4, v4, 0x1

    .line 120
    .line 121
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_4
    :goto_2
    check-cast p1, Lcom/google/android/material/button/MaterialButton;

    .line 125
    .line 126
    iget-boolean p1, p1, Lcom/google/android/material/button/MaterialButton;->o:Z

    .line 127
    .line 128
    const/4 v0, 0x1

    .line 129
    invoke-static {p1, v2, v0, v3, v0}, Li0;->a(ZIIII)Li0;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p2, p1}, Lj0;->f(Li0;)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :pswitch_2
    iget-object p2, p2, Lj0;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 138
    .line 139
    invoke-virtual {v2, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 140
    .line 141
    .line 142
    check-cast v1, Lcom/google/android/material/internal/CheckableImageButton;

    .line 143
    .line 144
    iget-boolean p1, v1, Lcom/google/android/material/internal/CheckableImageButton;->e:Z

    .line 145
    .line 146
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCheckable(Z)V

    .line 147
    .line 148
    .line 149
    iget-boolean p1, v1, Lcom/google/android/material/internal/CheckableImageButton;->d:Z

    .line 150
    .line 151
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setChecked(Z)V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
