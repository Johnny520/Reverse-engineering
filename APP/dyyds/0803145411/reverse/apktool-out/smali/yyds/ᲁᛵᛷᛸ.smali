.class public final Lyyds/ᲁᛵᛷᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᛳᲇ:Landroid/view/View;

.field public ᛱᲈᲁ:Landroid/widget/Button;

.field public ᛲᛲᲈᲈ:Landroid/widget/TextView;

.field public ᛲᛳᛶᲁ:Landroidx/core/widget/NestedScrollView;

.field public ᛲᛴᛳᛲ:Landroidx/appcompat/app/AlertController$RecycleListView;

.field public final ᛲᲈᲁ:Landroid/content/Context;

.field public final ᛳᛸᛴᛶ:I

.field public ᛳᲁᲁᲇ:Landroid/widget/ListAdapter;

.field public final ᛵᛶᛲᲀ:I

.field public final ᛵᛸᛸᛷ:Lyyds/ᛱᲀᛱᲁ;

.field public final ᛵᲀᲈᛴ:Lyyds/ᲈᲁᛵᛶ;

.field public final ᛶᛳᛶᛵ:I

.field public ᛶᛷᛲᲁ:Landroid/widget/Button;

.field public final ᛶᛸᲀᲁ:Lyyds/ᲈᲈᛱᲀ;

.field public final ᛶᲈᛴᲈ:Z

.field public ᛷᛲᲈᛱ:Landroid/widget/ImageView;

.field public ᛷᛵᲇᲀ:Landroid/widget/TextView;

.field public ᛷᲈᲈᲁ:Landroid/graphics/drawable/Drawable;

.field public final ᲀᛲᛲᲇ:I

.field public final ᲀᛲᛳᲀ:Landroid/view/Window;

.field public ᲇᛱᛲ:I

.field public ᲇᲇᲇᛱ:Landroid/widget/Button;

.field public ᲇᲈᛵᛷ:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lyyds/ᛱᲀᛱᲁ;Landroid/view/Window;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lyyds/ᲁᛵᛷᛸ;->ᲇᛱᛲ:I

    .line 6
    .line 7
    new-instance v0, Lyyds/ᲈᲁᛵᛶ;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {v0, v1, p0}, Lyyds/ᲈᲁᛵᛶ;-><init>(ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lyyds/ᲁᛵᛷᛸ;->ᛵᲀᲈᛴ:Lyyds/ᲈᲁᛵᛶ;

    .line 14
    .line 15
    iput-object p1, p0, Lyyds/ᲁᛵᛷᛸ;->ᛲᲈᲁ:Landroid/content/Context;

    .line 16
    .line 17
    iput-object p2, p0, Lyyds/ᲁᛵᛷᛸ;->ᛵᛸᛸᛷ:Lyyds/ᛱᲀᛱᲁ;

    .line 18
    .line 19
    iput-object p3, p0, Lyyds/ᲁᛵᛷᛸ;->ᲀᛲᛳᲀ:Landroid/view/Window;

    .line 20
    .line 21
    new-instance p3, Lyyds/ᲈᲈᛱᲀ;

    .line 22
    .line 23
    invoke-direct {p3}, Landroid/os/Handler;-><init>()V

    .line 24
    .line 25
    .line 26
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 27
    .line 28
    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p3, Lyyds/ᲈᲈᛱᲀ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    iput-object p3, p0, Lyyds/ᲁᛵᛷᛸ;->ᛶᛸᲀᲁ:Lyyds/ᲈᲈᛱᲀ;

    .line 34
    .line 35
    sget-object p3, Lyyds/ᛷᛷᛴᛳ;->ᛲᛴᛳᛲ:[I

    .line 36
    .line 37
    const v0, 0x66040028

    .line 38
    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-virtual {p1, v2, p3, v0, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1, v3, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    iput p3, p0, Lyyds/ᲁᛵᛷᛸ;->ᛶᛳᛶᛵ:I

    .line 51
    .line 52
    const/4 p3, 0x2

    .line 53
    invoke-virtual {p1, p3, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 54
    .line 55
    .line 56
    const/4 p3, 0x4

    .line 57
    invoke-virtual {p1, p3, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 58
    .line 59
    .line 60
    move-result p3

    .line 61
    iput p3, p0, Lyyds/ᲁᛵᛷᛸ;->ᛵᛶᛲᲀ:I

    .line 62
    .line 63
    const/4 p3, 0x5

    .line 64
    invoke-virtual {p1, p3, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 65
    .line 66
    .line 67
    const/4 p3, 0x7

    .line 68
    invoke-virtual {p1, p3, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 69
    .line 70
    .line 71
    move-result p3

    .line 72
    iput p3, p0, Lyyds/ᲁᛵᛷᛸ;->ᲀᛲᛲᲇ:I

    .line 73
    .line 74
    const/4 p3, 0x3

    .line 75
    invoke-virtual {p1, p3, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    iput p3, p0, Lyyds/ᲁᛵᛷᛸ;->ᛳᛸᛴᛶ:I

    .line 80
    .line 81
    const/4 p3, 0x6

    .line 82
    invoke-virtual {p1, p3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 83
    .line 84
    .line 85
    move-result p3

    .line 86
    iput-boolean p3, p0, Lyyds/ᲁᛵᛷᛸ;->ᛶᲈᛴᲈ:Z

    .line 87
    .line 88
    invoke-virtual {p1, v1, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, Lyyds/ᛱᲀᛱᲁ;->ᲀᛲᛳᲀ()Lyyds/ᲇᛳᛷᛸ;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p0, v1}, Lyyds/ᲇᛳᛷᛸ;->ᛲᛴᛳᛲ(I)Z

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public static ᛲᲈᲁ(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;
    .locals 2

    .line 1
    if-nez p0, :cond_1

    .line 2
    .line 3
    instance-of p0, p1, Landroid/view/ViewStub;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    check-cast p1, Landroid/view/ViewStub;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :cond_0
    check-cast p1, Landroid/view/ViewGroup;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_1
    if-eqz p1, :cond_2

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    check-cast v0, Landroid/view/ViewGroup;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    instance-of p1, p0, Landroid/view/ViewStub;

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    check-cast p0, Landroid/view/ViewStub;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    :cond_3
    check-cast p0, Landroid/view/ViewGroup;

    .line 42
    .line 43
    return-object p0
.end method
