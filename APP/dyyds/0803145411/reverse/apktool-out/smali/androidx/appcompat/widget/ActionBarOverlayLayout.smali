.class public Landroidx/appcompat/widget/ActionBarOverlayLayout;
.super Landroid/view/ViewGroup;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲈᲀᛶᲇ;
.implements Lyyds/ᛷᛲᲇᛴ;
.implements Lyyds/ᛷᛶᛱᛱ;


# static fields
.field public static final ᛸᛸᛷᛱ:[I


# instance fields
.field public final ᛱᛳᛶᛳ:Lyyds/ᲁᛸᛴᲇ;

.field public ᛱᛳᲇ:I

.field public ᛱᲈᲁ:Landroid/graphics/drawable/Drawable;

.field public ᛲᛲᲈᲈ:Z

.field public final ᛲᛳᛴᛸ:Lyyds/ᛶᛵᛸᛳ;

.field public ᛲᛳᛶᲁ:Z

.field public ᛲᛴᛳᛲ:Landroidx/appcompat/widget/ContentFrameLayout;

.field public ᛲᛶᛱᲈ:Landroid/widget/OverScroller;

.field public ᛳᛸᛴᛶ:Lyyds/ᲈᛶᲈᛴ;

.field public ᛳᲁᲁᲇ:I

.field public final ᛵᛶᛲᲀ:Landroid/graphics/Rect;

.field public final ᛵᲀᛵᛸ:Lyyds/ᲀᲇᛶᲈ;

.field public ᛵᲀᲈᛴ:Lyyds/ᛶᛷᛶᛲ;

.field public final ᛶᛳᛶᛵ:Landroid/graphics/Rect;

.field public ᛶᛷᛲᲁ:Lyyds/ᛱᛵᛸᛴ;

.field public ᛶᛸᲀᲁ:Lyyds/ᲈᛶᲈᛴ;

.field public ᛶᲈᛴᲈ:Lyyds/ᲈᛶᲈᛴ;

.field public ᛷᛲᲈᛱ:Z

.field public ᛷᛵᲇᲀ:Z

.field public final ᛷᛸᲇᛶ:Lyyds/ᛶᛵᛸᛳ;

.field public ᛷᲈᲈᲁ:Z

.field public ᲀᛲᛲᲇ:Lyyds/ᲈᛶᲈᛴ;

.field public ᲀᛲᛳᲀ:I

.field public final ᲇᛱᛲ:Landroid/graphics/Rect;

.field public ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContainer;

.field public ᲇᲈᛵᛷ:I

.field public ᲈᲀᛲᲀ:Landroid/view/ViewPropertyAnimator;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const v0, 0x66040005

    .line 2
    .line 3
    .line 4
    const v1, 0x1010059

    .line 5
    .line 6
    .line 7
    filled-new-array {v0, v1}, [I

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛸᛸᛷᛱ:[I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 92
    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 p2, 0x0

    .line 5
    iput p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᲈᛵᛷ:I

    .line 6
    .line 7
    new-instance p2, Landroid/graphics/Rect;

    .line 8
    .line 9
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᛱᛲ:Landroid/graphics/Rect;

    .line 13
    .line 14
    new-instance p2, Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᛳᛶᛵ:Landroid/graphics/Rect;

    .line 20
    .line 21
    new-instance p2, Landroid/graphics/Rect;

    .line 22
    .line 23
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛵᛶᛲᲀ:Landroid/graphics/Rect;

    .line 27
    .line 28
    new-instance p2, Landroid/graphics/Rect;

    .line 29
    .line 30
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance p2, Landroid/graphics/Rect;

    .line 34
    .line 35
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance p2, Landroid/graphics/Rect;

    .line 39
    .line 40
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 41
    .line 42
    .line 43
    new-instance p2, Landroid/graphics/Rect;

    .line 44
    .line 45
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 46
    .line 47
    .line 48
    sget-object p2, Lyyds/ᲈᛶᲈᛴ;->ᛵᛸᛸᛷ:Lyyds/ᲈᛶᲈᛴ;

    .line 49
    .line 50
    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲀᛲᛲᲇ:Lyyds/ᲈᛶᲈᛴ;

    .line 51
    .line 52
    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛳᛸᛴᛶ:Lyyds/ᲈᛶᲈᛴ;

    .line 53
    .line 54
    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᲈᛴᲈ:Lyyds/ᲈᛶᲈᛴ;

    .line 55
    .line 56
    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᛸᲀᲁ:Lyyds/ᲈᛶᲈᛴ;

    .line 57
    .line 58
    new-instance p2, Lyyds/ᲀᲇᛶᲈ;

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    invoke-direct {p2, v0, p0}, Lyyds/ᲀᲇᛶᲈ;-><init>(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛵᲀᛵᛸ:Lyyds/ᲀᲇᛶᲈ;

    .line 65
    .line 66
    new-instance p2, Lyyds/ᛶᛵᛸᛳ;

    .line 67
    .line 68
    invoke-direct {p2, p0, v0}, Lyyds/ᛶᛵᛸᛳ;-><init>(Landroidx/appcompat/widget/ActionBarOverlayLayout;I)V

    .line 69
    .line 70
    .line 71
    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛳᛴᛸ:Lyyds/ᛶᛵᛸᛳ;

    .line 72
    .line 73
    new-instance p2, Lyyds/ᛶᛵᛸᛳ;

    .line 74
    .line 75
    const/4 v0, 0x1

    .line 76
    invoke-direct {p2, p0, v0}, Lyyds/ᛶᛵᛸᛳ;-><init>(Landroidx/appcompat/widget/ActionBarOverlayLayout;I)V

    .line 77
    .line 78
    .line 79
    iput-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᛸᲇᛶ:Lyyds/ᛶᛵᛸᛳ;

    .line 80
    .line 81
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛳᛶᲁ(Landroid/content/Context;)V

    .line 82
    .line 83
    .line 84
    new-instance p1, Lyyds/ᲁᛸᛴᲇ;

    .line 85
    .line 86
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛱᛳᛶᛳ:Lyyds/ᲁᛸᛴᲇ;

    .line 90
    .line 91
    return-void
.end method

.method public static ᛶᛷᛲᲁ(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lyyds/ᛲᛱᛵᛱ;

    .line 6
    .line 7
    iget v0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 8
    .line 9
    iget v1, p1, Landroid/graphics/Rect;->left:I

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    iput v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 15
    .line 16
    move v0, v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    iget v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 20
    .line 21
    iget v3, p1, Landroid/graphics/Rect;->top:I

    .line 22
    .line 23
    if-eq v1, v3, :cond_1

    .line 24
    .line 25
    iput v3, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 26
    .line 27
    move v0, v2

    .line 28
    :cond_1
    iget v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 29
    .line 30
    iget v3, p1, Landroid/graphics/Rect;->right:I

    .line 31
    .line 32
    if-eq v1, v3, :cond_2

    .line 33
    .line 34
    iput v3, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 35
    .line 36
    move v0, v2

    .line 37
    :cond_2
    if-eqz p2, :cond_3

    .line 38
    .line 39
    iget p2, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 40
    .line 41
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 42
    .line 43
    if-eq p2, p1, :cond_3

    .line 44
    .line 45
    iput p1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 46
    .line 47
    return v2

    .line 48
    :cond_3
    return v0
.end method


# virtual methods
.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Lyyds/ᛲᛱᛵᛱ;

    .line 2
    .line 3
    return p0
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛱᲈᲁ:Landroid/graphics/drawable/Drawable;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-boolean v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛳᛶᲁ:Z

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    int-to-float v0, v0

    .line 28
    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/view/View;->getTranslationY()F

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-float/2addr v2, v0

    .line 35
    const/high16 v0, 0x3f000000    # 0.5f

    .line 36
    .line 37
    add-float/2addr v2, v0

    .line 38
    float-to-int v0, v2

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v0, v1

    .line 41
    :goto_0
    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛱᲈᲁ:Landroid/graphics/drawable/Drawable;

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛱᲈᲁ:Landroid/graphics/drawable/Drawable;

    .line 48
    .line 49
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    add-int/2addr v4, v0

    .line 54
    invoke-virtual {v2, v1, v0, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 55
    .line 56
    .line 57
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛱᲈᲁ:Landroid/graphics/drawable/Drawable;

    .line 58
    .line 59
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    return-void
.end method

.method public final fitSystemWindows(Landroid/graphics/Rect;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->fitSystemWindows(Landroid/graphics/Rect;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 1
    new-instance p0, Lyyds/ᛲᛱᛵᛱ;

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    invoke-direct {p0, v0, v0}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᛲᛱᛵᛱ;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 11
    new-instance p0, Lyyds/ᛲᛱᛵᛱ;

    .line 12
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object p0
.end method

.method public getActionBarHideOffset()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    float-to-int p0, p0

    .line 10
    neg-int p0, p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public getNestedScrollAxes()I
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛱᛳᛶᛳ:Lyyds/ᲁᛸᛴᲇ;

    .line 2
    .line 3
    iget v0, p0, Lyyds/ᲁᛸᛴᲇ;->ᛲᲈᲁ:I

    .line 4
    .line 5
    iget p0, p0, Lyyds/ᲁᛸᛴᲇ;->ᛵᛸᛸᛷ:I

    .line 6
    .line 7
    or-int/2addr p0, v0

    .line 8
    return p0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᛲᲈᛱ()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᛷᛲᲁ:Lyyds/ᛱᛵᛸᛴ;

    .line 5
    .line 6
    check-cast p0, Lyyds/ᲈᲇᛳᛳ;

    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᲈᲇᛳᛳ;->ᛲᲈᲁ:Landroidx/appcompat/widget/Toolbar;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getTitle()Ljava/lang/CharSequence;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᛲᲈᛱ()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, Lyyds/ᲈᛶᲈᛴ;->ᛵᛸᛸᛷ(Landroid/view/View;Landroid/view/WindowInsets;)Lyyds/ᲈᛶᲈᛴ;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, Landroid/graphics/Rect;

    .line 9
    .line 10
    iget-object v1, p1, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 11
    .line 12
    invoke-virtual {v1}, Lyyds/ᲈᛲᲁᛳ;->ᛷᲈᲈᲁ()Lyyds/ᛸᲀᲁᛲ;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget v2, v2, Lyyds/ᛸᲀᲁᛲ;->ᛲᲈᲁ:I

    .line 17
    .line 18
    invoke-virtual {v1}, Lyyds/ᲈᛲᲁᛳ;->ᛷᲈᲈᲁ()Lyyds/ᛸᲀᲁᛲ;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    iget v3, v3, Lyyds/ᛸᲀᲁᛲ;->ᛵᛸᛸᛷ:I

    .line 23
    .line 24
    invoke-virtual {v1}, Lyyds/ᲈᛲᲁᛳ;->ᛷᲈᲈᲁ()Lyyds/ᛸᲀᲁᛲ;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    iget v4, v4, Lyyds/ᛸᲀᲁᛲ;->ᲀᛲᛳᲀ:I

    .line 29
    .line 30
    invoke-virtual {v1}, Lyyds/ᲈᛲᲁᛳ;->ᛷᲈᲈᲁ()Lyyds/ᛸᲀᲁᛲ;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    iget v5, v5, Lyyds/ᛸᲀᲁᛲ;->ᲇᲈᛵᛷ:I

    .line 35
    .line 36
    invoke-direct {v0, v2, v3, v4, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 37
    .line 38
    .line 39
    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-static {v2, v0, v3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᛷᛲᲁ(Landroid/view/View;Landroid/graphics/Rect;Z)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    sget-object v2, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 47
    .line 48
    iget-object v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᛱᛲ:Landroid/graphics/Rect;

    .line 49
    .line 50
    invoke-static {p0, p1, v2}, Lyyds/ᲈᛷᲇᛲ;->ᛲᲈᲁ(Landroid/view/View;Lyyds/ᲈᛶᲈᛴ;Landroid/graphics/Rect;)Lyyds/ᲈᛶᲈᛴ;

    .line 51
    .line 52
    .line 53
    iget p1, v2, Landroid/graphics/Rect;->left:I

    .line 54
    .line 55
    iget v3, v2, Landroid/graphics/Rect;->top:I

    .line 56
    .line 57
    iget v4, v2, Landroid/graphics/Rect;->right:I

    .line 58
    .line 59
    iget v5, v2, Landroid/graphics/Rect;->bottom:I

    .line 60
    .line 61
    invoke-virtual {v1, p1, v3, v4, v5}, Lyyds/ᲈᛲᲁᛳ;->ᛲᛲᲈᲈ(IIII)Lyyds/ᲈᛶᲈᛴ;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲀᛲᛲᲇ:Lyyds/ᲈᛶᲈᛴ;

    .line 66
    .line 67
    iget-object v3, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛳᛸᛴᛶ:Lyyds/ᲈᛶᲈᛴ;

    .line 68
    .line 69
    invoke-virtual {v3, p1}, Lyyds/ᲈᛶᲈᛴ;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    const/4 v3, 0x1

    .line 74
    if-nez p1, :cond_0

    .line 75
    .line 76
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲀᛲᛲᲇ:Lyyds/ᲈᛶᲈᛴ;

    .line 77
    .line 78
    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛳᛸᛴᛶ:Lyyds/ᲈᛶᲈᛴ;

    .line 79
    .line 80
    move v0, v3

    .line 81
    :cond_0
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᛳᛶᛵ:Landroid/graphics/Rect;

    .line 82
    .line 83
    invoke-virtual {p1, v2}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-nez v4, :cond_1

    .line 88
    .line 89
    invoke-virtual {p1, v2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    move v3, v0

    .line 94
    :goto_0
    if-eqz v3, :cond_2

    .line 95
    .line 96
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 97
    .line 98
    .line 99
    :cond_2
    invoke-virtual {v1}, Lyyds/ᲈᛲᲁᛳ;->ᛲᲈᲁ()Lyyds/ᲈᛶᲈᛴ;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    iget-object p0, p0, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 104
    .line 105
    invoke-virtual {p0}, Lyyds/ᲈᛲᲁᛳ;->ᲀᛲᛳᲀ()Lyyds/ᲈᛶᲈᛴ;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    iget-object p0, p0, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 110
    .line 111
    invoke-virtual {p0}, Lyyds/ᲈᛲᲁᛳ;->ᛵᛸᛸᛷ()Lyyds/ᲈᛶᲈᛴ;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-virtual {p0}, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ()Landroid/view/WindowInsets;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    return-object p0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛳᛶᲁ(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    sget-object p1, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->requestApplyInsets()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛱᲈᲁ()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    const/4 p4, 0x0

    .line 14
    :goto_0
    if-ge p4, p1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p5

    .line 20
    invoke-virtual {p5}, Landroid/view/View;->getVisibility()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/16 v1, 0x8

    .line 25
    .line 26
    if-eq v0, v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lyyds/ᛲᛱᛵᛱ;

    .line 33
    .line 34
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredWidth()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {p5}, Landroid/view/View;->getMeasuredHeight()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 43
    .line 44
    add-int/2addr v3, p2

    .line 45
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 46
    .line 47
    add-int/2addr v0, p3

    .line 48
    add-int/2addr v1, v3

    .line 49
    add-int/2addr v2, v0

    .line 50
    invoke-virtual {p5, v3, v0, v1, v2}, Landroid/view/View;->layout(IIII)V

    .line 51
    .line 52
    .line 53
    :cond_0
    add-int/lit8 p4, p4, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    return-void
.end method

.method public final onMeasure(II)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᛲᲈᛱ()V

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    move-object v0, p0

    .line 9
    move v2, p1

    .line 10
    move v4, p2

    .line 11
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 12
    .line 13
    .line 14
    iget-object p0, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Lyyds/ᛲᛱᛵᛱ;

    .line 21
    .line 22
    iget-object p1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iget p2, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 29
    .line 30
    add-int/2addr p1, p2

    .line 31
    iget p2, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 32
    .line 33
    add-int/2addr p1, p2

    .line 34
    const/4 p2, 0x0

    .line 35
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iget-object v1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 40
    .line 41
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    iget v3, p0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 46
    .line 47
    add-int/2addr v1, v3

    .line 48
    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 49
    .line 50
    add-int/2addr v1, p0

    .line 51
    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    iget-object v1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredState()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-static {p2, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    sget-object v3, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    and-int/lit16 v3, v3, 0x100

    .line 72
    .line 73
    const/4 v5, 0x1

    .line 74
    if-eqz v3, :cond_0

    .line 75
    .line 76
    move v3, v5

    .line 77
    goto :goto_0

    .line 78
    :cond_0
    move v3, p2

    .line 79
    :goto_0
    if-eqz v3, :cond_1

    .line 80
    .line 81
    iget v6, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲀᛲᛳᲀ:I

    .line 82
    .line 83
    iget-boolean v7, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᛲᲈᛱ:Z

    .line 84
    .line 85
    if-eqz v7, :cond_3

    .line 86
    .line 87
    iget-object v7, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 88
    .line 89
    invoke-virtual {v7}, Landroidx/appcompat/widget/ActionBarContainer;->getTabContainer()Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    if-eqz v7, :cond_3

    .line 94
    .line 95
    iget v7, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲀᛲᛳᲀ:I

    .line 96
    .line 97
    add-int/2addr v6, v7

    .line 98
    goto :goto_1

    .line 99
    :cond_1
    iget-object v6, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 100
    .line 101
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    const/16 v7, 0x8

    .line 106
    .line 107
    if-eq v6, v7, :cond_2

    .line 108
    .line 109
    iget-object v6, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 110
    .line 111
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    goto :goto_1

    .line 116
    :cond_2
    move v6, p2

    .line 117
    :cond_3
    :goto_1
    iget-object v7, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᛱᛲ:Landroid/graphics/Rect;

    .line 118
    .line 119
    iget-object v8, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛵᛶᛲᲀ:Landroid/graphics/Rect;

    .line 120
    .line 121
    invoke-virtual {v8, v7}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 122
    .line 123
    .line 124
    iget-object v7, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲀᛲᛲᲇ:Lyyds/ᲈᛶᲈᛴ;

    .line 125
    .line 126
    iput-object v7, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᲈᛴᲈ:Lyyds/ᲈᛶᲈᛴ;

    .line 127
    .line 128
    iget-boolean v9, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᲈᲈᲁ:Z

    .line 129
    .line 130
    if-nez v9, :cond_4

    .line 131
    .line 132
    if-nez v3, :cond_4

    .line 133
    .line 134
    iget v3, v8, Landroid/graphics/Rect;->top:I

    .line 135
    .line 136
    add-int/2addr v3, v6

    .line 137
    iput v3, v8, Landroid/graphics/Rect;->top:I

    .line 138
    .line 139
    iget v3, v8, Landroid/graphics/Rect;->bottom:I

    .line 140
    .line 141
    iput v3, v8, Landroid/graphics/Rect;->bottom:I

    .line 142
    .line 143
    iget-object v3, v7, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 144
    .line 145
    invoke-virtual {v3, p2, v6, p2, p2}, Lyyds/ᲈᛲᲁᛳ;->ᛲᛲᲈᲈ(IIII)Lyyds/ᲈᛶᲈᛴ;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    iput-object p2, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᲈᛴᲈ:Lyyds/ᲈᛶᲈᛴ;

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_4
    iget-object p2, v7, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 153
    .line 154
    invoke-virtual {p2}, Lyyds/ᲈᛲᲁᛳ;->ᛷᲈᲈᲁ()Lyyds/ᛸᲀᲁᛲ;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    iget p2, p2, Lyyds/ᛸᲀᲁᛲ;->ᛲᲈᲁ:I

    .line 159
    .line 160
    iget-object v3, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᲈᛴᲈ:Lyyds/ᲈᛶᲈᛴ;

    .line 161
    .line 162
    iget-object v3, v3, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 163
    .line 164
    invoke-virtual {v3}, Lyyds/ᲈᛲᲁᛳ;->ᛷᲈᲈᲁ()Lyyds/ᛸᲀᲁᛲ;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    iget v3, v3, Lyyds/ᛸᲀᲁᛲ;->ᛵᛸᛸᛷ:I

    .line 169
    .line 170
    add-int/2addr v3, v6

    .line 171
    iget-object v6, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᲈᛴᲈ:Lyyds/ᲈᛶᲈᛴ;

    .line 172
    .line 173
    iget-object v6, v6, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 174
    .line 175
    invoke-virtual {v6}, Lyyds/ᲈᛲᲁᛳ;->ᛷᲈᲈᲁ()Lyyds/ᛸᲀᲁᛲ;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    iget v6, v6, Lyyds/ᛸᲀᲁᛲ;->ᲀᛲᛳᲀ:I

    .line 180
    .line 181
    iget-object v7, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᲈᛴᲈ:Lyyds/ᲈᛶᲈᛴ;

    .line 182
    .line 183
    iget-object v7, v7, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ:Lyyds/ᲈᛲᲁᛳ;

    .line 184
    .line 185
    invoke-virtual {v7}, Lyyds/ᲈᛲᲁᛳ;->ᛷᲈᲈᲁ()Lyyds/ᛸᲀᲁᛲ;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    iget v7, v7, Lyyds/ᛸᲀᲁᛲ;->ᲇᲈᛵᛷ:I

    .line 190
    .line 191
    invoke-static {p2, v3, v6, v7}, Lyyds/ᛸᲀᲁᛲ;->ᛲᲈᲁ(IIII)Lyyds/ᛸᲀᲁᛲ;

    .line 192
    .line 193
    .line 194
    move-result-object p2

    .line 195
    iget-object v3, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᲈᛴᲈ:Lyyds/ᲈᛶᲈᛴ;

    .line 196
    .line 197
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 198
    .line 199
    const/16 v7, 0x24

    .line 200
    .line 201
    if-lt v6, v7, :cond_5

    .line 202
    .line 203
    new-instance v6, Lyyds/ᛵᲀᲈᲁ;

    .line 204
    .line 205
    invoke-direct {v6, v3}, Lyyds/ᛵᲀᲈᲁ;-><init>(Lyyds/ᲈᛶᲈᛴ;)V

    .line 206
    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_5
    const/16 v7, 0x23

    .line 210
    .line 211
    if-lt v6, v7, :cond_6

    .line 212
    .line 213
    new-instance v6, Lyyds/ᛶᲇᲈᲇ;

    .line 214
    .line 215
    invoke-direct {v6, v3}, Lyyds/ᛶᲇᲈᲇ;-><init>(Lyyds/ᲈᛶᲈᛴ;)V

    .line 216
    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_6
    const/16 v7, 0x22

    .line 220
    .line 221
    if-lt v6, v7, :cond_7

    .line 222
    .line 223
    new-instance v6, Lyyds/ᛴᛵ;

    .line 224
    .line 225
    invoke-direct {v6, v3}, Lyyds/ᛴᛵ;-><init>(Lyyds/ᲈᛶᲈᛴ;)V

    .line 226
    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_7
    const/16 v7, 0x1f

    .line 230
    .line 231
    if-lt v6, v7, :cond_8

    .line 232
    .line 233
    new-instance v6, Lyyds/ᛶᛴ;

    .line 234
    .line 235
    invoke-direct {v6, v3}, Lyyds/ᛶᛴ;-><init>(Lyyds/ᲈᛶᲈᛴ;)V

    .line 236
    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_8
    new-instance v6, Lyyds/ᛶᛷᛱ;

    .line 240
    .line 241
    invoke-direct {v6, v3}, Lyyds/ᛶᛷᛱ;-><init>(Lyyds/ᲈᛶᲈᛴ;)V

    .line 242
    .line 243
    .line 244
    :goto_2
    invoke-virtual {v6, p2}, Lyyds/ᛴᛳᛷᛶ;->ᲇᲈᛵᛷ(Lyyds/ᛸᲀᲁᛲ;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v6}, Lyyds/ᛴᛳᛷᛶ;->ᛵᛸᛸᛷ()Lyyds/ᲈᛶᲈᛴ;

    .line 248
    .line 249
    .line 250
    move-result-object p2

    .line 251
    iput-object p2, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᲈᛴᲈ:Lyyds/ᲈᛶᲈᛴ;

    .line 252
    .line 253
    :goto_3
    iget-object p2, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛴᛳᛲ:Landroidx/appcompat/widget/ContentFrameLayout;

    .line 254
    .line 255
    invoke-static {p2, v8, v5}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᛷᛲᲁ(Landroid/view/View;Landroid/graphics/Rect;Z)Z

    .line 256
    .line 257
    .line 258
    iget-object p2, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᛸᲀᲁ:Lyyds/ᲈᛶᲈᛴ;

    .line 259
    .line 260
    iget-object v3, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᲈᛴᲈ:Lyyds/ᲈᛶᲈᛴ;

    .line 261
    .line 262
    invoke-virtual {p2, v3}, Lyyds/ᲈᛶᲈᛴ;->equals(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result p2

    .line 266
    if-nez p2, :cond_9

    .line 267
    .line 268
    iget-object p2, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᲈᛴᲈ:Lyyds/ᲈᛶᲈᛴ;

    .line 269
    .line 270
    iput-object p2, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᛸᲀᲁ:Lyyds/ᲈᛶᲈᛴ;

    .line 271
    .line 272
    iget-object v3, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛴᛳᛲ:Landroidx/appcompat/widget/ContentFrameLayout;

    .line 273
    .line 274
    invoke-virtual {p2}, Lyyds/ᲈᛶᲈᛴ;->ᛲᲈᲁ()Landroid/view/WindowInsets;

    .line 275
    .line 276
    .line 277
    move-result-object p2

    .line 278
    if-eqz p2, :cond_9

    .line 279
    .line 280
    invoke-static {v3, p2}, Lyyds/ᛳᛵᛴᲈ;->ᛲᲈᲁ(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 281
    .line 282
    .line 283
    move-result-object v5

    .line 284
    invoke-virtual {v5, p2}, Landroid/view/WindowInsets;->equals(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result p2

    .line 288
    if-nez p2, :cond_9

    .line 289
    .line 290
    invoke-static {v3, v5}, Lyyds/ᲈᛶᲈᛴ;->ᛵᛸᛸᛷ(Landroid/view/View;Landroid/view/WindowInsets;)Lyyds/ᲈᛶᲈᛴ;

    .line 291
    .line 292
    .line 293
    :cond_9
    iget-object v7, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛴᛳᛲ:Landroidx/appcompat/widget/ContentFrameLayout;

    .line 294
    .line 295
    const/4 v9, 0x0

    .line 296
    const/4 v11, 0x0

    .line 297
    move-object v6, v0

    .line 298
    move v8, v2

    .line 299
    move v10, v4

    .line 300
    invoke-virtual/range {v6 .. v11}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 301
    .line 302
    .line 303
    iget-object p2, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛴᛳᛲ:Landroidx/appcompat/widget/ContentFrameLayout;

    .line 304
    .line 305
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 306
    .line 307
    .line 308
    move-result-object p2

    .line 309
    check-cast p2, Lyyds/ᛲᛱᛵᛱ;

    .line 310
    .line 311
    iget-object v3, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛴᛳᛲ:Landroidx/appcompat/widget/ContentFrameLayout;

    .line 312
    .line 313
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 314
    .line 315
    .line 316
    move-result v3

    .line 317
    iget v5, p2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 318
    .line 319
    add-int/2addr v3, v5

    .line 320
    iget v5, p2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 321
    .line 322
    add-int/2addr v3, v5

    .line 323
    invoke-static {p1, v3}, Ljava/lang/Math;->max(II)I

    .line 324
    .line 325
    .line 326
    move-result p1

    .line 327
    iget-object v3, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛴᛳᛲ:Landroidx/appcompat/widget/ContentFrameLayout;

    .line 328
    .line 329
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    iget v5, p2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 334
    .line 335
    add-int/2addr v3, v5

    .line 336
    iget p2, p2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 337
    .line 338
    add-int/2addr v3, p2

    .line 339
    invoke-static {p0, v3}, Ljava/lang/Math;->max(II)I

    .line 340
    .line 341
    .line 342
    move-result p0

    .line 343
    iget-object p2, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛴᛳᛲ:Landroidx/appcompat/widget/ContentFrameLayout;

    .line 344
    .line 345
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredState()I

    .line 346
    .line 347
    .line 348
    move-result p2

    .line 349
    invoke-static {v1, p2}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 350
    .line 351
    .line 352
    move-result p2

    .line 353
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 354
    .line 355
    .line 356
    move-result v1

    .line 357
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    add-int/2addr v3, v1

    .line 362
    add-int/2addr v3, p1

    .line 363
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 364
    .line 365
    .line 366
    move-result p1

    .line 367
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 368
    .line 369
    .line 370
    move-result v1

    .line 371
    add-int/2addr v1, p1

    .line 372
    add-int/2addr v1, p0

    .line 373
    invoke-virtual {v0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 374
    .line 375
    .line 376
    move-result p0

    .line 377
    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    .line 378
    .line 379
    .line 380
    move-result p0

    .line 381
    invoke-virtual {v0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 382
    .line 383
    .line 384
    move-result p1

    .line 385
    invoke-static {v3, p1}, Ljava/lang/Math;->max(II)I

    .line 386
    .line 387
    .line 388
    move-result p1

    .line 389
    invoke-static {p1, v2, p2}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 390
    .line 391
    .line 392
    move-result p1

    .line 393
    shl-int/lit8 p2, p2, 0x10

    .line 394
    .line 395
    invoke-static {p0, v4, p2}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 396
    .line 397
    .line 398
    move-result p0

    .line 399
    invoke-virtual {v0, p1, p0}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 400
    .line 401
    .line 402
    return-void
.end method

.method public final onNestedFling(Landroid/view/View;FFZ)Z
    .locals 9

    .line 1
    iget-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᛵᲇᲀ:Z

    .line 2
    .line 3
    if-eqz p1, :cond_2

    .line 4
    .line 5
    if-nez p4, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛶᛱᲈ:Landroid/widget/OverScroller;

    .line 9
    .line 10
    float-to-int v4, p3

    .line 11
    const/high16 v7, -0x80000000

    .line 12
    .line 13
    const v8, 0x7fffffff

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    invoke-virtual/range {v0 .. v8}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛶᛱᲈ:Landroid/widget/OverScroller;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/widget/OverScroller;->getFinalY()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    iget-object p2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 31
    .line 32
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-le p1, p2, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛱᲈᲁ()V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᛸᲇᛶ:Lyyds/ᛶᛵᛸᛳ;

    .line 42
    .line 43
    invoke-virtual {p1}, Lyyds/ᛶᛵᛸᛳ;->run()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛱᲈᲁ()V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛳᛴᛸ:Lyyds/ᛶᛵᛸᛳ;

    .line 51
    .line 52
    invoke-virtual {p1}, Lyyds/ᛶᛵᛸᛳ;->run()V

    .line 53
    .line 54
    .line 55
    :goto_0
    const/4 p1, 0x1

    .line 56
    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛲᲈᲈ:Z

    .line 57
    .line 58
    return p1

    .line 59
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 60
    return p0
.end method

.method public final onNestedPreFling(Landroid/view/View;FF)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final onNestedPreScroll(Landroid/view/View;II[I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onNestedScroll(Landroid/view/View;IIII)V
    .locals 0

    .line 1
    iget p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛱᛳᲇ:I

    .line 2
    .line 3
    add-int/2addr p1, p3

    .line 4
    iput p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛱᛳᲇ:I

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setActionBarHideOffset(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛱᛳᛶᛳ:Lyyds/ᲁᛸᛴᲇ;

    .line 2
    .line 3
    iput p3, p1, Lyyds/ᲁᛸᛴᲇ;->ᛲᲈᲁ:I

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->getActionBarHideOffset()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛱᛳᲇ:I

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛱᲈᲁ()V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛵᲀᲈᛴ:Lyyds/ᛶᛷᛶᛲ;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    check-cast p0, Lyyds/ᛳᛲᛱᛱ;

    .line 19
    .line 20
    iget-object p1, p0, Lyyds/ᛳᛲᛱᛱ;->ᲀᛲᛲᲇ:Lyyds/ᲁᛳᲀ;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {p1}, Lyyds/ᲁᛳᲀ;->ᛲᲈᲁ()V

    .line 25
    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    iput-object p1, p0, Lyyds/ᛳᛲᛱᛱ;->ᲀᛲᛲᲇ:Lyyds/ᲁᛳᲀ;

    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .locals 0

    .line 1
    and-int/lit8 p1, p3, 0x2

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-boolean p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᛵᲇᲀ:Z

    .line 15
    .line 16
    return p0

    .line 17
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final onStopNestedScroll(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᛵᲇᲀ:Z

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛲᲈᲈ:Z

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    iget p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛱᛳᲇ:I

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const-wide/16 v1, 0x258

    .line 18
    .line 19
    if-gt p1, v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛱᲈᲁ()V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛳᛴᛸ:Lyyds/ᛶᛵᛸᛳ;

    .line 25
    .line 26
    invoke-virtual {p0, p1, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛱᲈᲁ()V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᛸᲇᛶ:Lyyds/ᛶᛵᛸᛳ;

    .line 34
    .line 35
    invoke-virtual {p0, p1, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_0
    return-void
.end method

.method public final onWindowSystemUiVisibilityChanged(I)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onWindowSystemUiVisibilityChanged(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᛲᲈᛱ()V

    .line 5
    .line 6
    .line 7
    iget v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛳᲁᲁᲇ:I

    .line 8
    .line 9
    xor-int/2addr v0, p1

    .line 10
    iput p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛳᲁᲁᲇ:I

    .line 11
    .line 12
    and-int/lit8 v1, p1, 0x4

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    move v1, v3

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v1, v2

    .line 21
    :goto_0
    and-int/lit16 p1, p1, 0x100

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    move p1, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move p1, v2

    .line 28
    :goto_1
    iget-object v4, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛵᲀᲈᛴ:Lyyds/ᛶᛷᛶᛲ;

    .line 29
    .line 30
    if-eqz v4, :cond_4

    .line 31
    .line 32
    xor-int/lit8 v5, p1, 0x1

    .line 33
    .line 34
    check-cast v4, Lyyds/ᛳᛲᛱᛱ;

    .line 35
    .line 36
    iput-boolean v5, v4, Lyyds/ᛳᛲᛱᛱ;->ᛳᲁᲁᲇ:Z

    .line 37
    .line 38
    if-nez v1, :cond_3

    .line 39
    .line 40
    if-nez p1, :cond_2

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    iget-boolean p1, v4, Lyyds/ᛳᛲᛱᛱ;->ᲇᛱᛲ:Z

    .line 44
    .line 45
    if-nez p1, :cond_4

    .line 46
    .line 47
    iput-boolean v3, v4, Lyyds/ᛳᛲᛱᛱ;->ᲇᛱᛲ:Z

    .line 48
    .line 49
    invoke-virtual {v4, v3}, Lyyds/ᛳᛲᛱᛱ;->ᛲᛴᛳᛲ(Z)V

    .line 50
    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_3
    :goto_2
    iget-boolean p1, v4, Lyyds/ᛳᛲᛱᛱ;->ᲇᛱᛲ:Z

    .line 54
    .line 55
    if-eqz p1, :cond_4

    .line 56
    .line 57
    iput-boolean v2, v4, Lyyds/ᛳᛲᛱᛱ;->ᲇᛱᛲ:Z

    .line 58
    .line 59
    invoke-virtual {v4, v3}, Lyyds/ᛳᛲᛱᛱ;->ᛲᛴᛳᛲ(Z)V

    .line 60
    .line 61
    .line 62
    :cond_4
    :goto_3
    and-int/lit16 p1, v0, 0x100

    .line 63
    .line 64
    if-eqz p1, :cond_5

    .line 65
    .line 66
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛵᲀᲈᛴ:Lyyds/ᛶᛷᛶᛲ;

    .line 67
    .line 68
    if-eqz p1, :cond_5

    .line 69
    .line 70
    sget-object p1, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/view/View;->requestApplyInsets()V

    .line 73
    .line 74
    .line 75
    :cond_5
    return-void
.end method

.method public final onWindowVisibilityChanged(I)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onWindowVisibilityChanged(I)V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᲈᛵᛷ:I

    .line 5
    .line 6
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛵᲀᲈᛴ:Lyyds/ᛶᛷᛶᛲ;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    check-cast p0, Lyyds/ᛳᛲᛱᛱ;

    .line 11
    .line 12
    iput p1, p0, Lyyds/ᛳᛲᛱᛱ;->ᛱᛳᲇ:I

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setActionBarHideOffset(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛱᲈᲁ()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 20
    .line 21
    neg-int p1, p1

    .line 22
    int-to-float p1, p1

    .line 23
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public setActionBarVisibilityCallback(Lyyds/ᛶᛷᛶᛲ;)V
    .locals 1

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛵᲀᲈᛴ:Lyyds/ᛶᛷᛶᛲ;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛵᲀᲈᛴ:Lyyds/ᛶᛷᛶᛲ;

    .line 10
    .line 11
    iget v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᲈᛵᛷ:I

    .line 12
    .line 13
    check-cast p1, Lyyds/ᛳᛲᛱᛱ;

    .line 14
    .line 15
    iput v0, p1, Lyyds/ᛳᛲᛱᛱ;->ᛱᛳᲇ:I

    .line 16
    .line 17
    iget p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛳᲁᲁᲇ:I

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onWindowSystemUiVisibilityChanged(I)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->requestApplyInsets()V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public setHasNonEmbeddedTabs(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᛲᲈᛱ:Z

    .line 2
    .line 3
    return-void
.end method

.method public setHideOnContentScrollEnabled(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᛵᲇᲀ:Z

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᛵᲇᲀ:Z

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛱᲈᲁ()V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setActionBarHideOffset(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public setIcon(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᛲᲈᛱ()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᛷᛲᲁ:Lyyds/ᛱᛵᛸᛴ;

    .line 5
    .line 6
    check-cast p0, Lyyds/ᲈᲇᛳᛳ;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lyyds/ᲈᲇᛳᛳ;->ᛲᲈᲁ:Landroidx/appcompat/widget/Toolbar;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0, p1}, Lyyds/ᛶᛶᲁᲇ;->ᛲᛳᛶᲁ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    iput-object p1, p0, Lyyds/ᲈᲇᛳᛳ;->ᲇᲈᛵᛷ:Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    invoke-virtual {p0}, Lyyds/ᲈᲇᛳᛳ;->ᲀᛲᛳᲀ()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 28
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᛲᲈᛱ()V

    .line 29
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᛷᛲᲁ:Lyyds/ᛱᛵᛸᛴ;

    check-cast p0, Lyyds/ᲈᲇᛳᛳ;

    .line 30
    iput-object p1, p0, Lyyds/ᲈᲇᛳᛳ;->ᲇᲈᛵᛷ:Landroid/graphics/drawable/Drawable;

    .line 31
    invoke-virtual {p0}, Lyyds/ᲈᲇᛳᛳ;->ᲀᛲᛳᲀ()V

    return-void
.end method

.method public setLogo(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᛲᲈᛱ()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᛷᛲᲁ:Lyyds/ᛱᛵᛸᛴ;

    .line 5
    .line 6
    check-cast p0, Lyyds/ᲈᲇᛳᛳ;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lyyds/ᲈᲇᛳᛳ;->ᛲᲈᲁ:Landroidx/appcompat/widget/Toolbar;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0, p1}, Lyyds/ᛶᛶᲁᲇ;->ᛲᛳᛶᲁ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    iput-object p1, p0, Lyyds/ᲈᲇᛳᛳ;->ᛲᛴᛳᛲ:Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    invoke-virtual {p0}, Lyyds/ᲈᲇᛳᛳ;->ᲀᛲᛳᲀ()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public setOverlayMode(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᲈᲈᲁ:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget p1, p1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 14
    .line 15
    const/16 v0, 0x13

    .line 16
    .line 17
    if-ge p1, v0, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛳᛶᲁ:Z

    .line 23
    .line 24
    return-void
.end method

.method public setShowingForActionMode(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public setUiOptions(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public setWindowCallback(Landroid/view/Window$Callback;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᛲᲈᛱ()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᛷᛲᲁ:Lyyds/ᛱᛵᛸᛴ;

    .line 5
    .line 6
    check-cast p0, Lyyds/ᲈᲇᛳᛳ;

    .line 7
    .line 8
    iput-object p1, p0, Lyyds/ᲈᲇᛳᛳ;->ᛷᛲᲈᛱ:Landroid/view/Window$Callback;

    .line 9
    .line 10
    return-void
.end method

.method public setWindowTitle(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᛲᲈᛱ()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᛷᛲᲁ:Lyyds/ᛱᛵᛸᛴ;

    .line 5
    .line 6
    check-cast p0, Lyyds/ᲈᲇᛳᛳ;

    .line 7
    .line 8
    iget-boolean v0, p0, Lyyds/ᲈᲇᛳᛳ;->ᛶᛷᛲᲁ:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lyyds/ᲈᲇᛳᛳ;->ᛲᲈᲁ:Landroidx/appcompat/widget/Toolbar;

    .line 13
    .line 14
    iput-object p1, p0, Lyyds/ᲈᲇᛳᛳ;->ᛱᲈᲁ:Ljava/lang/CharSequence;

    .line 15
    .line 16
    iget v1, p0, Lyyds/ᲈᲇᛳᛳ;->ᛵᛸᛸᛷ:I

    .line 17
    .line 18
    and-int/lit8 v1, v1, 0x8

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    iget-boolean p0, p0, Lyyds/ᲈᲇᛳᛳ;->ᛶᛷᛲᲁ:Z

    .line 26
    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0, p1}, Lyyds/ᛷᲁᛵᲇ;->ᛲᛴᛳᛲ(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final ᛱᲈᲁ()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛳᛴᛸ:Lyyds/ᛶᛵᛸᛳ;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᛸᲇᛶ:Lyyds/ᛶᛵᛸᛳ;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲈᲀᛲᲀ:Landroid/view/ViewPropertyAnimator;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final ᛲᛳᛶᲁ(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛸᛸᛷᛱ:[I

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, v1, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    iput v2, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲀᛲᛳᲀ:I

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iput-object v3, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛱᲈᲁ:Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    if-nez v3, :cond_0

    .line 30
    .line 31
    move v3, v2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v3, v1

    .line 34
    :goto_0
    invoke-virtual {p0, v3}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    .line 45
    .line 46
    const/16 v3, 0x13

    .line 47
    .line 48
    if-ge v0, v3, :cond_1

    .line 49
    .line 50
    move v1, v2

    .line 51
    :cond_1
    iput-boolean v1, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛳᛶᲁ:Z

    .line 52
    .line 53
    new-instance v0, Landroid/widget/OverScroller;

    .line 54
    .line 55
    invoke-direct {v0, p1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛶᛱᲈ:Landroid/widget/OverScroller;

    .line 59
    .line 60
    return-void
.end method

.method public final ᛲᛴᛳᛲ(Landroid/view/ViewGroup;IIIII[I)V
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛵᛸᛸᛷ(Landroid/view/ViewGroup;IIIII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final ᛲᲈᲁ(Landroid/view/View;Landroid/view/View;II)V
    .locals 0

    .line 1
    if-nez p4, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public final ᛵᛸᛸᛷ(Landroid/view/ViewGroup;IIIII)V
    .locals 0

    .line 1
    if-nez p6, :cond_0

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onNestedScroll(Landroid/view/View;IIII)V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public final ᛷᛲᲈᛱ()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛴᛳᛲ:Landroidx/appcompat/widget/ContentFrameLayout;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    const v0, 0x6609004c

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroidx/appcompat/widget/ContentFrameLayout;

    .line 13
    .line 14
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛲᛴᛳᛲ:Landroidx/appcompat/widget/ContentFrameLayout;

    .line 15
    .line 16
    const v0, 0x6609004d

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Landroidx/appcompat/widget/ActionBarContainer;

    .line 24
    .line 25
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᲇᲇᲇᛱ:Landroidx/appcompat/widget/ActionBarContainer;

    .line 26
    .line 27
    const v0, 0x6609004b

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    instance-of v1, v0, Lyyds/ᛱᛵᛸᛴ;

    .line 35
    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    check-cast v0, Lyyds/ᛱᛵᛸᛴ;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    instance-of v1, v0, Landroidx/appcompat/widget/Toolbar;

    .line 42
    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 46
    .line 47
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getWrapper()Lyyds/ᛱᛵᛸᛴ;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    :goto_0
    iput-object v0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᛷᛲᲁ:Lyyds/ᛱᛵᛸᛴ;

    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const-string v0, "Can\'t make a decor toolbar out of "

    .line 63
    .line 64
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_2
    return-void
.end method

.method public final ᛷᛵᲇᲀ(Lyyds/ᛴᛴᛵᛸ;Lyyds/ᲇᛲᛸᛶ;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᛲᲈᛱ()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᛷᛲᲁ:Lyyds/ᛱᛵᛸᛴ;

    .line 5
    .line 6
    check-cast p0, Lyyds/ᲈᲇᛳᛳ;

    .line 7
    .line 8
    iget-object v0, p0, Lyyds/ᲈᲇᛳᛳ;->ᛲᲈᲁ:Landroidx/appcompat/widget/Toolbar;

    .line 9
    .line 10
    iget-object v1, p0, Lyyds/ᲈᲇᛳᛳ;->ᛲᛲᲈᲈ:Lyyds/ᛶᛴᛲᛸ;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    new-instance v1, Lyyds/ᛶᛴᛲᛸ;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-direct {v1, v2}, Lyyds/ᛶᛴᛲᛸ;-><init>(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Lyyds/ᲈᲇᛳᛳ;->ᛲᛲᲈᲈ:Lyyds/ᛶᛴᛲᛸ;

    .line 24
    .line 25
    :cond_0
    iput-object p2, v1, Lyyds/ᛶᛴᛲᛸ;->ᛶᛷᛲᲁ:Lyyds/ᲇᛲᛸᛶ;

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    iget-object p0, v0, Landroidx/appcompat/widget/Toolbar;->ᲀᛲᛳᲀ:Landroidx/appcompat/widget/ActionMenuView;

    .line 30
    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->ᲇᲇᲇᛱ()V

    .line 35
    .line 36
    .line 37
    iget-object p0, v0, Landroidx/appcompat/widget/Toolbar;->ᲀᛲᛳᲀ:Landroidx/appcompat/widget/ActionMenuView;

    .line 38
    .line 39
    iget-object p0, p0, Landroidx/appcompat/widget/ActionMenuView;->ᛵᛶᛲᲀ:Lyyds/ᛴᛴᛵᛸ;

    .line 40
    .line 41
    if-ne p0, p1, :cond_2

    .line 42
    .line 43
    :goto_0
    return-void

    .line 44
    :cond_2
    if-eqz p0, :cond_3

    .line 45
    .line 46
    iget-object p2, v0, Landroidx/appcompat/widget/Toolbar;->ᲁᛶᛴᛸ:Lyyds/ᛶᛴᛲᛸ;

    .line 47
    .line 48
    invoke-virtual {p0, p2}, Lyyds/ᛴᛴᛵᛸ;->ᛵᛶᛲᲀ(Lyyds/ᛳᛶᛵᲈ;)V

    .line 49
    .line 50
    .line 51
    iget-object p2, v0, Landroidx/appcompat/widget/Toolbar;->ᛶᲀᲈᲇ:Lyyds/ᲈᲇᛴᲈ;

    .line 52
    .line 53
    invoke-virtual {p0, p2}, Lyyds/ᛴᛴᛵᛸ;->ᛵᛶᛲᲀ(Lyyds/ᛳᛶᛵᲈ;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    iget-object p0, v0, Landroidx/appcompat/widget/Toolbar;->ᛶᲀᲈᲇ:Lyyds/ᲈᲇᛴᲈ;

    .line 57
    .line 58
    if-nez p0, :cond_4

    .line 59
    .line 60
    new-instance p0, Lyyds/ᲈᲇᛴᲈ;

    .line 61
    .line 62
    invoke-direct {p0, v0}, Lyyds/ᲈᲇᛴᲈ;-><init>(Landroidx/appcompat/widget/Toolbar;)V

    .line 63
    .line 64
    .line 65
    iput-object p0, v0, Landroidx/appcompat/widget/Toolbar;->ᛶᲀᲈᲇ:Lyyds/ᲈᲇᛴᲈ;

    .line 66
    .line 67
    :cond_4
    const/4 p0, 0x1

    .line 68
    iput-boolean p0, v1, Lyyds/ᛶᛴᛲᛸ;->ᲀᛲᛲᲇ:Z

    .line 69
    .line 70
    iget-object p0, v0, Landroidx/appcompat/widget/Toolbar;->ᛷᛵᲇᲀ:Landroid/content/Context;

    .line 71
    .line 72
    if-eqz p1, :cond_5

    .line 73
    .line 74
    invoke-virtual {p1, v1, p0}, Lyyds/ᛴᛴᛵᛸ;->ᛵᛸᛸᛷ(Lyyds/ᛳᛶᛵᲈ;Landroid/content/Context;)V

    .line 75
    .line 76
    .line 77
    iget-object p0, v0, Landroidx/appcompat/widget/Toolbar;->ᛶᲀᲈᲇ:Lyyds/ᲈᲇᛴᲈ;

    .line 78
    .line 79
    iget-object p2, v0, Landroidx/appcompat/widget/Toolbar;->ᛷᛵᲇᲀ:Landroid/content/Context;

    .line 80
    .line 81
    invoke-virtual {p1, p0, p2}, Lyyds/ᛴᛴᛵᛸ;->ᛵᛸᛸᛷ(Lyyds/ᛳᛶᛵᲈ;Landroid/content/Context;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_5
    const/4 p1, 0x0

    .line 86
    invoke-virtual {v1, p0, p1}, Lyyds/ᛶᛴᛲᛸ;->ᲀᛲᛳᲀ(Landroid/content/Context;Lyyds/ᛴᛴᛵᛸ;)V

    .line 87
    .line 88
    .line 89
    iget-object p0, v0, Landroidx/appcompat/widget/Toolbar;->ᛶᲀᲈᲇ:Lyyds/ᲈᲇᛴᲈ;

    .line 90
    .line 91
    iget-object p2, v0, Landroidx/appcompat/widget/Toolbar;->ᛷᛵᲇᲀ:Landroid/content/Context;

    .line 92
    .line 93
    invoke-virtual {p0, p2, p1}, Lyyds/ᲈᲇᛴᲈ;->ᲀᛲᛳᲀ(Landroid/content/Context;Lyyds/ᛴᛴᛵᛸ;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Lyyds/ᛶᛴᛲᛸ;->ᛲᛴᛳᛲ()V

    .line 97
    .line 98
    .line 99
    iget-object p0, v0, Landroidx/appcompat/widget/Toolbar;->ᛶᲀᲈᲇ:Lyyds/ᲈᲇᛴᲈ;

    .line 100
    .line 101
    invoke-virtual {p0}, Lyyds/ᲈᲇᛴᲈ;->ᛲᛴᛳᛲ()V

    .line 102
    .line 103
    .line 104
    :goto_1
    iget-object p0, v0, Landroidx/appcompat/widget/Toolbar;->ᲀᛲᛳᲀ:Landroidx/appcompat/widget/ActionMenuView;

    .line 105
    .line 106
    iget p1, v0, Landroidx/appcompat/widget/Toolbar;->ᛲᛲᲈᲈ:I

    .line 107
    .line 108
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionMenuView;->setPopupTheme(I)V

    .line 109
    .line 110
    .line 111
    iget-object p0, v0, Landroidx/appcompat/widget/Toolbar;->ᲀᛲᛳᲀ:Landroidx/appcompat/widget/ActionMenuView;

    .line 112
    .line 113
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/ActionMenuView;->setPresenter(Lyyds/ᛶᛴᛲᛸ;)V

    .line 114
    .line 115
    .line 116
    iput-object v1, v0, Landroidx/appcompat/widget/Toolbar;->ᲁᛶᛴᛸ:Lyyds/ᛶᛴᛲᛸ;

    .line 117
    .line 118
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->ᛳᛸᛴᛶ()V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public final ᛷᲈᲈᲁ(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛷᛲᲈᛱ()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    const-string v1, "Progress display unsupported"

    .line 6
    .line 7
    const-string v2, "ToolbarWidgetWrapper"

    .line 8
    .line 9
    if-eq p1, v0, :cond_2

    .line 10
    .line 11
    const/4 v0, 0x5

    .line 12
    if-eq p1, v0, :cond_1

    .line 13
    .line 14
    const/16 v0, 0x6d

    .line 15
    .line 16
    if-eq p1, v0, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const/4 p1, 0x1

    .line 20
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setOverlayMode(Z)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᛷᛲᲁ:Lyyds/ᛱᛵᛸᛴ;

    .line 25
    .line 26
    check-cast p0, Lyyds/ᲈᲇᛳᛳ;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    iget-object p0, p0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->ᛶᛷᛲᲁ:Lyyds/ᛱᛵᛸᛴ;

    .line 36
    .line 37
    check-cast p0, Lyyds/ᲈᲇᛳᛳ;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final ᲀᛲᛳᲀ(Landroid/view/View;I)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onStopNestedScroll(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public final ᲇᲇᲇᛱ(Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    .line 1
    if-nez p4, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final ᲇᲈᛵᛷ(II[II)V
    .locals 0

    .line 1
    return-void
.end method
