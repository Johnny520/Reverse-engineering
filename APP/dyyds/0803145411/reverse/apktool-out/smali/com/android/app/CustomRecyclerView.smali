.class public Lcom/android/app/CustomRecyclerView;
.super Lyyds/ᛵᲇᛲᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛴᲇᛵᛸ:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 26
    invoke-direct {p0, p1, v0}, Lyyds/ᛵᲇᛲᛱ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, -0x1

    .line 27
    iput p1, p0, Lcom/android/app/CustomRecyclerView;->ᛴᲇᛵᛸ:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Lyyds/ᛵᲇᛲᛱ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/android/app/CustomRecyclerView;->ᛴᲇᛵᛸ:I

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    sget-object v1, Lyyds/ᛵᲇᛶᛷ;->ᛲᲈᲁ:[I

    .line 10
    .line 11
    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    iput p2, p0, Lcom/android/app/CustomRecyclerView;->ᛴᲇᛵᛸ:I

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method


# virtual methods
.method public final onMeasure(II)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/app/CustomRecyclerView;->ᛴᲇᛵᛸ:I

    .line 2
    .line 3
    if-lez v0, :cond_1

    .line 4
    .line 5
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget v0, p0, Lcom/android/app/CustomRecyclerView;->ᛴᲇᛵᛸ:I

    .line 16
    .line 17
    if-le v1, v0, :cond_1

    .line 18
    .line 19
    :cond_0
    iget p2, p0, Lcom/android/app/CustomRecyclerView;->ᛴᲇᛵᛸ:I

    .line 20
    .line 21
    const/high16 v0, -0x80000000

    .line 22
    .line 23
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    :cond_1
    invoke-super {p0, p1, p2}, Lyyds/ᛵᲇᛲᛱ;->onMeasure(II)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public setMaxHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/android/app/CustomRecyclerView;->ᛴᲇᛵᛸ:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᛵᲇᛲᛱ;->requestLayout()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
