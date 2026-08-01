.class public final Lh/E;
.super Lh/u;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final c:Landroid/content/Context;

.field public final d:Lh/m;

.field public final e:Lh/j;

.field public final f:Z

.field public final g:I

.field public final h:I

.field public final i:Li/L0;

.field public final j:Lh/d;

.field public final k:Landroidx/fragment/app/E;

.field public l:Lh/v;

.field public m:Landroid/view/View;

.field public n:Landroid/view/View;

.field public o:Lh/y;

.field public p:Landroid/view/ViewTreeObserver;

.field public q:Z

.field public r:Z

.field public s:I

.field public t:I

.field public u:Z


# direct methods
.method public constructor <init>(ILandroid/content/Context;Landroid/view/View;Lh/m;Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lh/d;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1, p0}, Lh/d;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lh/E;->j:Lh/d;

    .line 11
    .line 12
    new-instance v0, Landroidx/fragment/app/E;

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-direct {v0, v1, p0}, Landroidx/fragment/app/E;-><init>(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lh/E;->k:Landroidx/fragment/app/E;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput v0, p0, Lh/E;->t:I

    .line 22
    .line 23
    iput-object p2, p0, Lh/E;->c:Landroid/content/Context;

    .line 24
    .line 25
    iput-object p4, p0, Lh/E;->d:Lh/m;

    .line 26
    .line 27
    iput-boolean p5, p0, Lh/E;->f:Z

    .line 28
    .line 29
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Lh/j;

    .line 34
    .line 35
    const v2, 0x7f0c0013

    .line 36
    .line 37
    .line 38
    invoke-direct {v1, p4, v0, p5, v2}, Lh/j;-><init>(Lh/m;Landroid/view/LayoutInflater;ZI)V

    .line 39
    .line 40
    .line 41
    iput-object v1, p0, Lh/E;->e:Lh/j;

    .line 42
    .line 43
    iput p1, p0, Lh/E;->h:I

    .line 44
    .line 45
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object p5

    .line 49
    invoke-virtual {p5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 54
    .line 55
    div-int/lit8 v0, v0, 0x2

    .line 56
    .line 57
    const v1, 0x7f070017

    .line 58
    .line 59
    .line 60
    invoke-virtual {p5, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 61
    .line 62
    .line 63
    move-result p5

    .line 64
    invoke-static {v0, p5}, Ljava/lang/Math;->max(II)I

    .line 65
    .line 66
    .line 67
    move-result p5

    .line 68
    iput p5, p0, Lh/E;->g:I

    .line 69
    .line 70
    iput-object p3, p0, Lh/E;->m:Landroid/view/View;

    .line 71
    .line 72
    new-instance p3, Li/L0;

    .line 73
    .line 74
    const/4 p5, 0x0

    .line 75
    invoke-direct {p3, p2, p5, p1}, Li/F0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 76
    .line 77
    .line 78
    iput-object p3, p0, Lh/E;->i:Li/L0;

    .line 79
    .line 80
    invoke-virtual {p4, p0, p2}, Lh/m;->b(Lh/z;Landroid/content/Context;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lh/E;->q:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lh/E;->i:Li/L0;

    .line 6
    .line 7
    iget-object v0, v0, Li/F0;->z:Li/B;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public final b(Lh/m;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/E;->d:Lh/m;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lh/E;->dismiss()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lh/E;->o:Lh/y;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-interface {v0, p1, p2}, Lh/y;->b(Lh/m;Z)V

    .line 14
    .line 15
    .line 16
    :cond_1
    :goto_0
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lh/E;->r:Z

    .line 3
    .line 4
    iget-object v0, p0, Lh/E;->e:Lh/j;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lh/j;->notifyDataSetChanged()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final dismiss()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lh/E;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lh/E;->i:Li/L0;

    .line 8
    .line 9
    invoke-virtual {v0}, Li/F0;->dismiss()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final e(Lh/y;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh/E;->o:Lh/y;

    .line 2
    .line 3
    return-void
.end method

.method public final f()Li/t0;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/E;->i:Li/L0;

    .line 2
    .line 3
    iget-object v0, v0, Li/F0;->d:Li/t0;

    .line 4
    .line 5
    return-object v0
.end method

.method public final h()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lh/E;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-boolean v0, p0, Lh/E;->q:Z

    .line 9
    .line 10
    if-nez v0, :cond_7

    .line 11
    .line 12
    iget-object v0, p0, Lh/E;->m:Landroid/view/View;

    .line 13
    .line 14
    if-eqz v0, :cond_7

    .line 15
    .line 16
    iput-object v0, p0, Lh/E;->n:Landroid/view/View;

    .line 17
    .line 18
    iget-object v0, p0, Lh/E;->i:Li/L0;

    .line 19
    .line 20
    iget-object v1, v0, Li/F0;->z:Li/B;

    .line 21
    .line 22
    invoke-virtual {v1, p0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 23
    .line 24
    .line 25
    iput-object p0, v0, Li/F0;->q:Landroid/widget/AdapterView$OnItemClickListener;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    iput-boolean v1, v0, Li/F0;->y:Z

    .line 29
    .line 30
    iget-object v2, v0, Li/F0;->z:Li/B;

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 33
    .line 34
    .line 35
    iget-object v2, p0, Lh/E;->n:Landroid/view/View;

    .line 36
    .line 37
    iget-object v3, p0, Lh/E;->p:Landroid/view/ViewTreeObserver;

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    if-nez v3, :cond_1

    .line 41
    .line 42
    move v3, v1

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move v3, v4

    .line 45
    :goto_0
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    iput-object v5, p0, Lh/E;->p:Landroid/view/ViewTreeObserver;

    .line 50
    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    iget-object v3, p0, Lh/E;->j:Lh/d;

    .line 54
    .line 55
    invoke-virtual {v5, v3}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    iget-object v3, p0, Lh/E;->k:Landroidx/fragment/app/E;

    .line 59
    .line 60
    invoke-virtual {v2, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 61
    .line 62
    .line 63
    iput-object v2, v0, Li/F0;->p:Landroid/view/View;

    .line 64
    .line 65
    iget v2, p0, Lh/E;->t:I

    .line 66
    .line 67
    iput v2, v0, Li/F0;->m:I

    .line 68
    .line 69
    iget-boolean v2, p0, Lh/E;->r:Z

    .line 70
    .line 71
    iget-object v3, p0, Lh/E;->c:Landroid/content/Context;

    .line 72
    .line 73
    iget-object v5, p0, Lh/E;->e:Lh/j;

    .line 74
    .line 75
    if-nez v2, :cond_3

    .line 76
    .line 77
    iget v2, p0, Lh/E;->g:I

    .line 78
    .line 79
    invoke-static {v5, v3, v2}, Lh/u;->m(Landroid/widget/ListAdapter;Landroid/content/Context;I)I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    iput v2, p0, Lh/E;->s:I

    .line 84
    .line 85
    iput-boolean v1, p0, Lh/E;->r:Z

    .line 86
    .line 87
    :cond_3
    iget v1, p0, Lh/E;->s:I

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Li/F0;->p(I)V

    .line 90
    .line 91
    .line 92
    const/4 v1, 0x2

    .line 93
    iget-object v2, v0, Li/F0;->z:Li/B;

    .line 94
    .line 95
    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, Lh/u;->b:Landroid/graphics/Rect;

    .line 99
    .line 100
    const/4 v2, 0x0

    .line 101
    if-eqz v1, :cond_4

    .line 102
    .line 103
    new-instance v6, Landroid/graphics/Rect;

    .line 104
    .line 105
    invoke-direct {v6, v1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    move-object v6, v2

    .line 110
    :goto_1
    iput-object v6, v0, Li/F0;->x:Landroid/graphics/Rect;

    .line 111
    .line 112
    invoke-virtual {v0}, Li/F0;->h()V

    .line 113
    .line 114
    .line 115
    iget-object v1, v0, Li/F0;->d:Li/t0;

    .line 116
    .line 117
    invoke-virtual {v1, p0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 118
    .line 119
    .line 120
    iget-boolean v6, p0, Lh/E;->u:Z

    .line 121
    .line 122
    if-eqz v6, :cond_6

    .line 123
    .line 124
    iget-object v6, p0, Lh/E;->d:Lh/m;

    .line 125
    .line 126
    iget-object v7, v6, Lh/m;->m:Ljava/lang/CharSequence;

    .line 127
    .line 128
    if-eqz v7, :cond_6

    .line 129
    .line 130
    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    const v7, 0x7f0c0012

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3, v7, v1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    check-cast v3, Landroid/widget/FrameLayout;

    .line 142
    .line 143
    const v7, 0x1020016

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    check-cast v7, Landroid/widget/TextView;

    .line 151
    .line 152
    if-eqz v7, :cond_5

    .line 153
    .line 154
    iget-object v6, v6, Lh/m;->m:Ljava/lang/CharSequence;

    .line 155
    .line 156
    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 157
    .line 158
    .line 159
    :cond_5
    invoke-virtual {v3, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1, v3, v2, v4}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    .line 163
    .line 164
    .line 165
    :cond_6
    invoke-virtual {v0, v5}, Li/F0;->m(Landroid/widget/ListAdapter;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Li/F0;->h()V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 173
    .line 174
    const-string v1, "StandardMenuPopup cannot be used without an anchor"

    .line 175
    .line 176
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final j(Lh/F;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Lh/m;->hasVisibleItems()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    new-instance v2, Lh/x;

    .line 9
    .line 10
    iget-object v5, p0, Lh/E;->n:Landroid/view/View;

    .line 11
    .line 12
    iget-object v4, p0, Lh/E;->c:Landroid/content/Context;

    .line 13
    .line 14
    iget-boolean v7, p0, Lh/E;->f:Z

    .line 15
    .line 16
    iget v3, p0, Lh/E;->h:I

    .line 17
    .line 18
    move-object v6, p1

    .line 19
    invoke-direct/range {v2 .. v7}, Lh/x;-><init>(ILandroid/content/Context;Landroid/view/View;Lh/m;Z)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lh/E;->o:Lh/y;

    .line 23
    .line 24
    iput-object p1, v2, Lh/x;->h:Lh/y;

    .line 25
    .line 26
    iget-object v0, v2, Lh/x;->i:Lh/u;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-interface {v0, p1}, Lh/z;->e(Lh/y;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-static {v6}, Lh/u;->u(Lh/m;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iput-boolean p1, v2, Lh/x;->g:Z

    .line 38
    .line 39
    iget-object v0, v2, Lh/x;->i:Lh/u;

    .line 40
    .line 41
    if-eqz v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Lh/u;->o(Z)V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-object p1, p0, Lh/E;->l:Lh/v;

    .line 47
    .line 48
    iput-object p1, v2, Lh/x;->j:Lh/v;

    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    iput-object p1, p0, Lh/E;->l:Lh/v;

    .line 52
    .line 53
    iget-object p1, p0, Lh/E;->d:Lh/m;

    .line 54
    .line 55
    invoke-virtual {p1, v1}, Lh/m;->c(Z)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lh/E;->i:Li/L0;

    .line 59
    .line 60
    iget v0, p1, Li/F0;->g:I

    .line 61
    .line 62
    invoke-virtual {p1}, Li/F0;->i()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    iget v3, p0, Lh/E;->t:I

    .line 67
    .line 68
    iget-object v4, p0, Lh/E;->m:Landroid/view/View;

    .line 69
    .line 70
    sget-object v5, Ly/L;->a:Ljava/util/WeakHashMap;

    .line 71
    .line 72
    invoke-virtual {v4}, Landroid/view/View;->getLayoutDirection()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    invoke-static {v3, v4}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    and-int/lit8 v3, v3, 0x7

    .line 81
    .line 82
    const/4 v4, 0x5

    .line 83
    if-ne v3, v4, :cond_2

    .line 84
    .line 85
    iget-object v3, p0, Lh/E;->m:Landroid/view/View;

    .line 86
    .line 87
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    add-int/2addr v0, v3

    .line 92
    :cond_2
    invoke-virtual {v2}, Lh/x;->b()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    const/4 v4, 0x1

    .line 97
    if-eqz v3, :cond_3

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_3
    iget-object v3, v2, Lh/x;->e:Landroid/view/View;

    .line 101
    .line 102
    if-nez v3, :cond_4

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    invoke-virtual {v2, v0, p1, v4, v4}, Lh/x;->d(IIZZ)V

    .line 106
    .line 107
    .line 108
    :goto_0
    iget-object p1, p0, Lh/E;->o:Lh/y;

    .line 109
    .line 110
    if-eqz p1, :cond_5

    .line 111
    .line 112
    invoke-interface {p1, v6}, Lh/y;->m(Lh/m;)Z

    .line 113
    .line 114
    .line 115
    :cond_5
    return v4

    .line 116
    :cond_6
    :goto_1
    return v1
.end method

.method public final l(Lh/m;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final n(Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh/E;->m:Landroid/view/View;

    .line 2
    .line 3
    return-void
.end method

.method public final o(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/E;->e:Lh/j;

    .line 2
    .line 3
    iput-boolean p1, v0, Lh/j;->d:Z

    .line 4
    .line 5
    return-void
.end method

.method public final onDismiss()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lh/E;->q:Z

    .line 3
    .line 4
    iget-object v1, p0, Lh/E;->d:Lh/m;

    .line 5
    .line 6
    invoke-virtual {v1, v0}, Lh/m;->c(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lh/E;->p:Landroid/view/ViewTreeObserver;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lh/E;->n:Landroid/view/View;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lh/E;->p:Landroid/view/ViewTreeObserver;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lh/E;->p:Landroid/view/ViewTreeObserver;

    .line 28
    .line 29
    iget-object v1, p0, Lh/E;->j:Lh/d;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    iput-object v0, p0, Lh/E;->p:Landroid/view/ViewTreeObserver;

    .line 36
    .line 37
    :cond_1
    iget-object v0, p0, Lh/E;->n:Landroid/view/View;

    .line 38
    .line 39
    iget-object v1, p0, Lh/E;->k:Landroidx/fragment/app/E;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lh/E;->l:Lh/v;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {v0}, Lh/v;->onDismiss()V

    .line 49
    .line 50
    .line 51
    :cond_2
    return-void
.end method

.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 p3, 0x1

    .line 6
    if-ne p1, p3, :cond_0

    .line 7
    .line 8
    const/16 p1, 0x52

    .line 9
    .line 10
    if-ne p2, p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lh/E;->dismiss()V

    .line 13
    .line 14
    .line 15
    return p3

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public final p(I)V
    .locals 0

    .line 1
    iput p1, p0, Lh/E;->t:I

    .line 2
    .line 3
    return-void
.end method

.method public final q(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/E;->i:Li/L0;

    .line 2
    .line 3
    iput p1, v0, Li/F0;->g:I

    .line 4
    .line 5
    return-void
.end method

.method public final r(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    .line 1
    check-cast p1, Lh/v;

    .line 2
    .line 3
    iput-object p1, p0, Lh/E;->l:Lh/v;

    .line 4
    .line 5
    return-void
.end method

.method public final s(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lh/E;->u:Z

    .line 2
    .line 3
    return-void
.end method

.method public final t(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh/E;->i:Li/L0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Li/F0;->k(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
