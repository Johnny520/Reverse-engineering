.class public final Landroidx/compose/ui/platform/飘花落叶言子楪哲苏世兰;
.super Landroidx/core/view/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪兰世哲苏:Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

.field public final synthetic 飘花落叶言子楪兰世苏哲:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

.field public final synthetic 飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/platform/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/platform/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/ui/platform/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/core/view/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲兰苏(Landroid/view/View;L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;)V
    .locals 7

    .line 1
    iget-object v0, p2, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/core/view/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Landroid/view/View$AccessibilityDelegate;

    .line 4
    .line 5
    invoke-virtual {v1, p1, v0}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Landroidx/compose/ui/platform/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 9
    .line 10
    iget-object v1, p1, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->飘花落叶言子世哲兰楪苏:Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰苏哲世()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setVisibleToUser(Z)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v2, p0, Landroidx/compose/ui/platform/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 23
    .line 24
    invoke-virtual {v2}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏哲世()Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    :goto_0
    const/4 v4, 0x0

    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    iget-object v5, v3, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪:Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;

    .line 32
    .line 33
    const/16 v6, 0x8

    .line 34
    .line 35
    invoke-virtual {v5, v6}, Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世哲兰苏(I)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {v3}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏哲世()Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    move-object v3, v4

    .line 48
    :goto_1
    if-eqz v3, :cond_3

    .line 49
    .line 50
    iget v3, v3, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰世苏:I

    .line 51
    .line 52
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    :cond_3
    const/4 v3, -0x1

    .line 57
    if-eqz v4, :cond_4

    .line 58
    .line 59
    invoke-virtual {p1}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getSemanticsOwner()Landroidx/compose/ui/semantics/飘花落叶言子楪哲兰苏世;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v5}, Landroidx/compose/ui/semantics/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    iget v5, v5, Landroidx/compose/ui/semantics/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰哲苏:I

    .line 68
    .line 69
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-ne v6, v5, :cond_5

    .line 74
    .line 75
    :cond_4
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    :cond_5
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    iput v4, p2, L飘花落叶言子哲世苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:I

    .line 84
    .line 85
    iget-object p0, p0, Landroidx/compose/ui/platform/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 86
    .line 87
    invoke-virtual {v0, p0, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setParent(Landroid/view/View;I)V

    .line 88
    .line 89
    .line 90
    iget p2, v2, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲兰世苏:I

    .line 91
    .line 92
    iget-object v2, v1, Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;->飘花落叶言子世兰楪苏哲:Landroidx/collection/飘花落叶言子世楪哲苏兰;

    .line 93
    .line 94
    invoke-virtual {v2, p2}, Landroidx/collection/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世哲兰苏(I)I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eq v2, v3, :cond_7

    .line 99
    .line 100
    invoke-virtual {p1}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getAndroidViewsHandler$ui()Landroidx/compose/ui/platform/飘花落叶言子世兰楪苏哲;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-static {v4, v2}, Landroidx/compose/ui/platform/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪哲兰世苏(Landroidx/compose/ui/platform/飘花落叶言子世兰楪苏哲;I)Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    if-eqz v4, :cond_6

    .line 109
    .line 110
    invoke-virtual {v0, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalBefore(Landroid/view/View;)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_6
    invoke-virtual {v0, p0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalBefore(Landroid/view/View;I)V

    .line 115
    .line 116
    .line 117
    :goto_2
    iget-object v2, v1, Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;->飘花落叶言子世兰苏楪哲:Ljava/lang/String;

    .line 118
    .line 119
    invoke-static {p1, p2, v0, v2}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲(Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    :cond_7
    iget-object v2, v1, Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;->飘花落叶言子世兰楪哲苏:Landroidx/collection/飘花落叶言子世楪哲苏兰;

    .line 123
    .line 124
    invoke-virtual {v2, p2}, Landroidx/collection/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世哲兰苏(I)I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eq v2, v3, :cond_9

    .line 129
    .line 130
    invoke-virtual {p1}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getAndroidViewsHandler$ui()Landroidx/compose/ui/platform/飘花落叶言子世兰楪苏哲;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-static {v3, v2}, Landroidx/compose/ui/platform/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪哲兰世苏(Landroidx/compose/ui/platform/飘花落叶言子世兰楪苏哲;I)Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    if-eqz v3, :cond_8

    .line 139
    .line 140
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalAfter(Landroid/view/View;)V

    .line 141
    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_8
    invoke-virtual {v0, p0, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setTraversalAfter(Landroid/view/View;I)V

    .line 145
    .line 146
    .line 147
    :goto_3
    iget-object p0, v1, Landroidx/compose/ui/platform/飘花落叶言子楪兰哲世苏;->飘花落叶言子世兰苏哲楪:Ljava/lang/String;

    .line 148
    .line 149
    invoke-static {p1, p2, v0, p0}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲(Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :cond_9
    return-void
.end method
