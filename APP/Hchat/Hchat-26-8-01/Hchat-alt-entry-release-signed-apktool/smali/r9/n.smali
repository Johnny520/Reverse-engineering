.class public final synthetic Lr9/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:Lr9/d0;

.field public final synthetic h:Landroid/widget/TextView;

.field public final synthetic i:Landroid/view/ViewGroup;

.field public final synthetic j:Landroid/view/View;

.field public final synthetic k:Z

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Lr9/d0;Landroid/widget/TextView;Landroid/view/ViewGroup;Landroid/view/View;ZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr9/n;->g:Lr9/d0;

    .line 5
    .line 6
    iput-object p2, p0, Lr9/n;->h:Landroid/widget/TextView;

    .line 7
    .line 8
    iput-object p3, p0, Lr9/n;->i:Landroid/view/ViewGroup;

    .line 9
    .line 10
    iput-object p4, p0, Lr9/n;->j:Landroid/view/View;

    .line 11
    .line 12
    iput-boolean p5, p0, Lr9/n;->k:Z

    .line 13
    .line 14
    iput p6, p0, Lr9/n;->l:I

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v1, p0, Lr9/n;->h:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v2, p0, Lr9/n;->i:Landroid/view/ViewGroup;

    .line 8
    .line 9
    iget-object v3, p0, Lr9/n;->j:Landroid/view/View;

    .line 10
    .line 11
    iget-boolean v4, p0, Lr9/n;->k:Z

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    if-ne v0, v2, :cond_8

    .line 15
    .line 16
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-lez v0, :cond_8

    .line 21
    .line 22
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-lez v0, :cond_8

    .line 27
    .line 28
    invoke-static {v3, v2}, Lr9/d0;->P(Landroid/view/View;Landroid/view/View;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    new-instance v0, Landroid/graphics/Rect;

    .line 36
    .line 37
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    invoke-direct {v0, v5, v5, v6, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v3, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    instance-of v7, v6, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 56
    .line 57
    if-eqz v7, :cond_1

    .line 58
    .line 59
    check-cast v6, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const/4 v6, 0x0

    .line 63
    :goto_0
    if-eqz v6, :cond_8

    .line 64
    .line 65
    if-eqz v4, :cond_4

    .line 66
    .line 67
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    sub-int/2addr v3, v2

    .line 76
    iget v0, v0, Landroid/graphics/Rect;->right:I

    .line 77
    .line 78
    sub-int/2addr v3, v0

    .line 79
    if-gez v3, :cond_2

    .line 80
    .line 81
    move v3, v5

    .line 82
    :cond_2
    invoke-virtual {v6}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-ne v0, v3, :cond_3

    .line 87
    .line 88
    iget v0, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 89
    .line 90
    if-eq v0, v3, :cond_7

    .line 91
    .line 92
    :cond_3
    invoke-virtual {v6, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 93
    .line 94
    .line 95
    iput v3, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    iget v0, v0, Landroid/graphics/Rect;->left:I

    .line 99
    .line 100
    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    sub-int/2addr v0, v2

    .line 105
    if-gez v0, :cond_5

    .line 106
    .line 107
    move v0, v5

    .line 108
    :cond_5
    invoke-virtual {v6}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-ne v2, v0, :cond_6

    .line 113
    .line 114
    iget v2, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 115
    .line 116
    if-eq v2, v0, :cond_7

    .line 117
    .line 118
    :cond_6
    invoke-virtual {v6, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 119
    .line 120
    .line 121
    iput v0, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 122
    .line 123
    :goto_1
    invoke-virtual {v1, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 124
    .line 125
    .line 126
    :cond_7
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 127
    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_8
    :goto_2
    const/4 v0, 0x4

    .line 131
    iget v6, p0, Lr9/n;->l:I

    .line 132
    .line 133
    if-ge v6, v0, :cond_9

    .line 134
    .line 135
    add-int/lit8 v5, v6, 0x1

    .line 136
    .line 137
    iget-object v0, p0, Lr9/n;->g:Lr9/d0;

    .line 138
    .line 139
    invoke-virtual/range {v0 .. v5}, Lr9/d0;->z0(Landroid/widget/TextView;Landroid/view/ViewGroup;Landroid/view/View;ZI)V

    .line 140
    .line 141
    .line 142
    goto :goto_3

    .line 143
    :cond_9
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 144
    .line 145
    .line 146
    :goto_3
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 147
    .line 148
    return-object v0
.end method
