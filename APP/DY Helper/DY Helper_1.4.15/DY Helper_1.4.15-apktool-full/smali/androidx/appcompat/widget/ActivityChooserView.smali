.class public Landroidx/appcompat/widget/ActivityChooserView;
.super Landroid/view/ViewGroup;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/ActivityChooserView$InnerLayout;
    }
.end annotation


# instance fields
.field public final ε:Lf;

.field public final ζ:Lg;

.field public final η:Landroid/view/View;

.field public final θ:Landroid/widget/FrameLayout;

.field public final ι:Landroid/widget/ImageView;

.field public final κ:Landroid/widget/FrameLayout;

.field public λ:Lｘ;

.field public final μ:Ld;

.field public ν:Landroidx/appcompat/widget/θ;

.field public ξ:Landroid/widget/PopupWindow$OnDismissListener;

.field public ο:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 184
    invoke-direct {p0, p1, v0, v1}, Landroidx/appcompat/widget/ActivityChooserView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 183
    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/ActivityChooserView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 9

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lc;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lc;-><init>(Landroidx/appcompat/widget/ActivityChooserView;I)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Ld;

    .line 11
    .line 12
    invoke-direct {v0, v1, p0}, Ld;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->μ:Ld;

    .line 16
    .line 17
    sget-object v4, Lkk1;->ε:[I

    .line 18
    .line 19
    invoke-virtual {p1, p2, v4, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    sget-object v0, Lb92;->α:Ljava/util/WeakHashMap;

    .line 24
    .line 25
    const/4 v8, 0x0

    .line 26
    move-object v2, p0

    .line 27
    move-object v3, p1

    .line 28
    move-object v5, p2

    .line 29
    move v7, p3

    .line 30
    invoke-static/range {v2 .. v8}, Ly82;->β(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    const/4 p1, 0x4

    .line 35
    invoke-virtual {v6, p0, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 36
    .line 37
    .line 38
    invoke-virtual {v6, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    const p3, 0x7f0c0006

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, p3, v2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    new-instance p2, Lg;

    .line 60
    .line 61
    invoke-direct {p2, v2}, Lg;-><init>(Landroidx/appcompat/widget/ActivityChooserView;)V

    .line 62
    .line 63
    .line 64
    iput-object p2, v2, Landroidx/appcompat/widget/ActivityChooserView;->ζ:Lg;

    .line 65
    .line 66
    const p3, 0x7f090039

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    iput-object p3, v2, Landroidx/appcompat/widget/ActivityChooserView;->η:Landroid/view/View;

    .line 74
    .line 75
    invoke-virtual {p3}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 76
    .line 77
    .line 78
    const p3, 0x7f0900fc

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    check-cast p3, Landroid/widget/FrameLayout;

    .line 86
    .line 87
    iput-object p3, v2, Landroidx/appcompat/widget/ActivityChooserView;->κ:Landroid/widget/FrameLayout;

    .line 88
    .line 89
    invoke-virtual {p3, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p3, p2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 93
    .line 94
    .line 95
    const v0, 0x7f0901dc

    .line 96
    .line 97
    .line 98
    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    check-cast p3, Landroid/widget/ImageView;

    .line 103
    .line 104
    const p3, 0x7f090144

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    check-cast p3, Landroid/widget/FrameLayout;

    .line 112
    .line 113
    invoke-virtual {p3, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 114
    .line 115
    .line 116
    new-instance p2, Le;

    .line 117
    .line 118
    invoke-direct {p2}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p3, p2}, Landroid/view/View;->setAccessibilityDelegate(Landroid/view/View$AccessibilityDelegate;)V

    .line 122
    .line 123
    .line 124
    new-instance p2, Lｏ;

    .line 125
    .line 126
    invoke-direct {p2, v2, p3}, Lｏ;-><init>(Landroidx/appcompat/widget/ActivityChooserView;Landroid/widget/FrameLayout;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p3, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 130
    .line 131
    .line 132
    iput-object p3, v2, Landroidx/appcompat/widget/ActivityChooserView;->θ:Landroid/widget/FrameLayout;

    .line 133
    .line 134
    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    check-cast p2, Landroid/widget/ImageView;

    .line 139
    .line 140
    iput-object p2, v2, Landroidx/appcompat/widget/ActivityChooserView;->ι:Landroid/widget/ImageView;

    .line 141
    .line 142
    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 143
    .line 144
    .line 145
    new-instance p1, Lf;

    .line 146
    .line 147
    invoke-direct {p1, v2}, Lf;-><init>(Landroidx/appcompat/widget/ActivityChooserView;)V

    .line 148
    .line 149
    .line 150
    iput-object p1, v2, Landroidx/appcompat/widget/ActivityChooserView;->ε:Lf;

    .line 151
    .line 152
    new-instance p2, Lc;

    .line 153
    .line 154
    invoke-direct {p2, v2, p0}, Lc;-><init>(Landroidx/appcompat/widget/ActivityChooserView;I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, p2}, Landroid/widget/BaseAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    iget p1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 169
    .line 170
    div-int/lit8 p1, p1, 0x2

    .line 171
    .line 172
    const p2, 0x7f070017

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 176
    .line 177
    .line 178
    move-result p0

    .line 179
    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    .line 180
    .line 181
    .line 182
    return-void
.end method


# virtual methods
.method public getDataModel()Lb;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ε:Lf;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return-object p0
.end method

.method public getListPopupWindow()Landroidx/appcompat/widget/θ;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ν:Landroidx/appcompat/widget/θ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/appcompat/widget/θ;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const v2, 0x7f0400bc

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-direct {v0, v1, v4, v2, v3}, Landroidx/appcompat/widget/θ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ν:Landroidx/appcompat/widget/θ;

    .line 20
    .line 21
    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->ε:Lf;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/θ;->ρ(Landroid/widget/ListAdapter;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ν:Landroidx/appcompat/widget/θ;

    .line 27
    .line 28
    iput-object p0, v0, Landroidx/appcompat/widget/θ;->τ:Landroid/view/View;

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    iput-boolean v1, v0, Landroidx/appcompat/widget/θ;->Δ:Z

    .line 32
    .line 33
    iget-object v0, v0, Landroidx/appcompat/widget/θ;->Ε:Lm5;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ν:Landroidx/appcompat/widget/θ;

    .line 39
    .line 40
    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->ζ:Lg;

    .line 41
    .line 42
    iput-object v1, v0, Landroidx/appcompat/widget/θ;->υ:Landroid/widget/AdapterView$OnItemClickListener;

    .line 43
    .line 44
    iget-object v0, v0, Landroidx/appcompat/widget/θ;->Ε:Lm5;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ν:Landroidx/appcompat/widget/θ;

    .line 50
    .line 51
    return-object p0
.end method

.method public final onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ε:Lf;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ο:Z

    .line 11
    .line 12
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ε:Lf;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/appcompat/widget/ActivityChooserView;->μ:Ld;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->β()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->α()V

    .line 31
    .line 32
    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    iput-boolean v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ο:Z

    .line 35
    .line 36
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    sub-int/2addr p4, p2

    .line 2
    sub-int/2addr p5, p3

    .line 3
    iget-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->η:Landroid/view/View;

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    invoke-virtual {p1, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->β()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->α()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->κ:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    const/high16 v0, 0x40000000    # 2.0f

    .line 14
    .line 15
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView;->η:Landroid/view/View;

    .line 20
    .line 21
    invoke-virtual {p0, v0, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public setActivityChooserModel(Lb;)V
    .locals 1

    .line 1
    iget-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->ε:Lf;

    .line 2
    .line 3
    iget-object v0, p1, Lf;->ε:Landroidx/appcompat/widget/ActivityChooserView;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/appcompat/widget/ActivityChooserView;->ε:Lf;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->β()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->α()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->β()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    iget-boolean p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ο:Z

    .line 29
    .line 30
    if-nez p0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const-string p0, "No data model. Did you call #setDataModel?"

    .line 37
    .line 38
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    :goto_0
    return-void
.end method

.method public setDefaultActionButtonContentDescription(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public setExpandActivityOverflowButtonContentDescription(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ι:Landroid/widget/ImageView;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setExpandActivityOverflowButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->ι:Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setInitialActivityCount(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->ξ:Landroid/widget/PopupWindow$OnDismissListener;

    .line 2
    .line 3
    return-void
.end method

.method public setProvider(Lｘ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView;->λ:Lｘ;

    .line 2
    .line 3
    return-void
.end method

.method public final α()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->β()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->getListPopupWindow()Landroidx/appcompat/widget/θ;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroidx/appcompat/widget/θ;->dismiss()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    iget-object p0, p0, Landroidx/appcompat/widget/ActivityChooserView;->μ:Ld;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final β()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActivityChooserView;->getListPopupWindow()Landroidx/appcompat/widget/θ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Landroidx/appcompat/widget/θ;->Ε:Lm5;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method
