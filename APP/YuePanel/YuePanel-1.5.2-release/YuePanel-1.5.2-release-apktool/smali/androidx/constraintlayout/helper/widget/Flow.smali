.class public Landroidx/constraintlayout/helper/widget/Flow;
.super Landroidx/constraintlayout/widget/ۥ۟۟۟ۧ;
.source "SourceFile"


# static fields
.field public static final ۥ۟۟ۡۤ:Ljava/lang/String; = "Flow"

.field public static final ۥ۟۟ۡۥ:I = 0x0

.field public static final ۥ۟۟ۡۦ:I = 0x1

.field public static final ۥ۟۟ۡۧ:I = 0x0

.field public static final ۥ۟۟ۡۨ:I = 0x1

.field public static final ۥ۟۟ۢ:I = 0x2

.field public static final ۥ۟۟ۢ۟:I = 0x0

.field public static final ۥ۟۟ۢ۠:I = 0x1

.field public static final ۥ۟۟ۢۡ:I = 0x2

.field public static final ۥ۟۟ۢۢ:I = 0x0

.field public static final ۥۣ۟۟ۢ:I = 0x1

.field public static final ۥ۟۟ۢۤ:I = 0x2

.field public static final ۥ۟۟ۢۥ:I = 0x0

.field public static final ۥ۟۟ۢۦ:I = 0x1

.field public static final ۥ۟۟ۢۧ:I = 0x2

.field public static final ۥ۟۟ۢۨ:I = 0x3


# instance fields
.field public ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/ۥ۟۟۟ۧ;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ۥ۟۟۟ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ۥ۟۟۟ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public onMeasure(II)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongCall"
        }
    .end annotation

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p0, v0, p1, p2}, Landroidx/constraintlayout/helper/widget/Flow;->ۥ۟۟ۡ(LYue/ۥۢۥ۟ۢ;II)V

    return-void
.end method

.method public setFirstHorizontalBias(F)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۦ۠(F)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setFirstHorizontalStyle(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۦۡ(I)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setFirstVerticalBias(F)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۦۢ(F)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setFirstVerticalStyle(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۦۣ(I)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setHorizontalAlign(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۦۤ(I)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setHorizontalBias(F)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۦۥ(F)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setHorizontalGap(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۦۦ(I)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setHorizontalStyle(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۦۧ(I)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setMaxElementsWrap(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۧۡ(I)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setOrientation(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۧۢ(I)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setPadding(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥۢۥ۟ۢ;->ۥۣ۟۠۠(I)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setPaddingBottom(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥۢۥ۟ۢ;->ۥۣ۟۠ۡ(I)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setPaddingLeft(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥۢۥ۟ۢ;->ۥۣۣ۟۠(I)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setPaddingRight(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥۢۥ۟ۢ;->ۥۣ۟۠ۤ(I)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setPaddingTop(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥۢۥ۟ۢ;->ۥۣ۟۠ۦ(I)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setVerticalAlign(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۢ۠;->ۥۣ۟۠ۧ(I)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setVerticalBias(F)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۧۤ(F)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setVerticalGap(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۧۥ(I)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setVerticalStyle(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۧۦ(I)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setWrapMode(I)V
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {v0, p1}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۧۧ(I)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public ۥ۟۟۠(Landroid/util/AttributeSet;)V
    .locals 6

    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ۥ۟۟۟ۧ;->ۥ۟۟۠(Landroid/util/AttributeSet;)V

    new-instance v0, LYue/ۥۣ۠ۢ۠;

    invoke-direct {v0}, LYue/ۥۣ۠ۢ۠;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    if-eqz p1, :cond_1b

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥ۟ۢۡۡ:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1a

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥ۟ۢۡۢ:I

    if-ne v3, v4, :cond_0

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۧۢ(I)V

    goto/16 :goto_1

    :cond_0
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥۣ۟ۢۡ:I

    if-ne v3, v4, :cond_1

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۢۥ۟ۢ;->ۥۣ۟۠۠(I)V

    goto/16 :goto_1

    :cond_1
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥ۟ۢۢۢ:I

    if-ne v3, v4, :cond_2

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۢۥ۟ۢ;->ۥۣ۟۠ۥ(I)V

    goto/16 :goto_1

    :cond_2
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥۣ۟ۢۢ:I

    if-ne v3, v4, :cond_3

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۢۥ۟ۢ;->ۥۣ۟۠ۢ(I)V

    goto/16 :goto_1

    :cond_3
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥ۟ۢۡۤ:I

    if-ne v3, v4, :cond_4

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۢۥ۟ۢ;->ۥۣۣ۟۠(I)V

    goto/16 :goto_1

    :cond_4
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥ۟ۢۡۥ:I

    if-ne v3, v4, :cond_5

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۢۥ۟ۢ;->ۥۣ۟۠ۦ(I)V

    goto/16 :goto_1

    :cond_5
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥ۟ۢۡۦ:I

    if-ne v3, v4, :cond_6

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۢۥ۟ۢ;->ۥۣ۟۠ۤ(I)V

    goto/16 :goto_1

    :cond_6
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥ۟ۢۡۧ:I

    if-ne v3, v4, :cond_7

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۢۥ۟ۢ;->ۥۣ۟۠ۡ(I)V

    goto/16 :goto_1

    :cond_7
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥ۟ۢۤۧ:I

    if-ne v3, v4, :cond_8

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۧۧ(I)V

    goto/16 :goto_1

    :cond_8
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥۣ۟ۢۨ:I

    if-ne v3, v4, :cond_9

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۦۧ(I)V

    goto/16 :goto_1

    :cond_9
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥ۟ۢۤۦ:I

    if-ne v3, v4, :cond_a

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۧۦ(I)V

    goto/16 :goto_1

    :cond_a
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥۣ۟ۢۢ:I

    if-ne v3, v4, :cond_b

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۦۡ(I)V

    goto/16 :goto_1

    :cond_b
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥ۟ۢۤ۟:I

    if-ne v3, v4, :cond_c

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۧ(I)V

    goto/16 :goto_1

    :cond_c
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥۣ۟ۢۤ:I

    if-ne v3, v4, :cond_d

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۦۣ(I)V

    goto/16 :goto_1

    :cond_d
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥ۟ۢۤۡ:I

    if-ne v3, v4, :cond_e

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۧ۠(I)V

    goto/16 :goto_1

    :cond_e
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥۣ۟ۢۦ:I

    const/high16 v5, 0x3f000000    # 0.5f

    if-ne v3, v4, :cond_f

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۦۥ(F)V

    goto/16 :goto_1

    :cond_f
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥۣ۟ۢۡ:I

    if-ne v3, v4, :cond_10

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۦ۠(F)V

    goto/16 :goto_1

    :cond_10
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥ۟ۢۤ:I

    if-ne v3, v4, :cond_11

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۦۨ(F)V

    goto/16 :goto_1

    :cond_11
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥۣۣ۟ۢ:I

    if-ne v3, v4, :cond_12

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۦۢ(F)V

    goto :goto_1

    :cond_12
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥ۟ۢۤ۠:I

    if-ne v3, v4, :cond_13

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۧ۟(F)V

    goto :goto_1

    :cond_13
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥ۟ۢۤۤ:I

    if-ne v3, v4, :cond_14

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۧۤ(F)V

    goto :goto_1

    :cond_14
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥۣ۟ۢۥ:I

    const/4 v5, 0x2

    if-ne v3, v4, :cond_15

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۦۤ(I)V

    goto :goto_1

    :cond_15
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥۣ۟ۢۤ:I

    if-ne v3, v4, :cond_16

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۣ۠ۢ۠;->ۥۣ۟۠ۧ(I)V

    goto :goto_1

    :cond_16
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥۣ۟ۢۧ:I

    if-ne v3, v4, :cond_17

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۦۦ(I)V

    goto :goto_1

    :cond_17
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥ۟ۢۤۥ:I

    if-ne v3, v4, :cond_18

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۧۥ(I)V

    goto :goto_1

    :cond_18
    sget v4, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥ۟ۢۤۢ:I

    if-ne v3, v4, :cond_19

    iget-object v4, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    const/4 v5, -0x1

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {v4, v3}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۧۡ(I)V

    :cond_19
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_1a
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_1b
    iget-object p1, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    iput-object p1, p0, Landroidx/constraintlayout/widget/ۥ۟۟;->ۥ۟۟۠ۦ:LYue/ۥ۠ۤۤ;

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ۥ۟۟;->ۥ۟۟۠ۨ()V

    return-void
.end method

.method public ۥ۟۟۠۟(Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ;LYue/ۥ۠ۤۤۡ;Landroidx/constraintlayout/widget/ConstraintLayout$ۥ۟;Landroid/util/SparseArray;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/constraintlayout/widget/\u06e5\u06df\u06df\u06df\u06e0$\u06e5;",
            "LYue/\u06e5\u06e0\u06e4\u06e4\u06e1;",
            "Landroidx/constraintlayout/widget/ConstraintLayout$\u06e5\u06df;",
            "Landroid/util/SparseArray<",
            "LYue/\u06e5\u06df\u06e7\u06df\u06e2;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1, p2, p3, p4}, Landroidx/constraintlayout/widget/ۥ۟۟;->ۥ۟۟۠۟(Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ;LYue/ۥ۠ۤۤۡ;Landroidx/constraintlayout/widget/ConstraintLayout$ۥ۟;Landroid/util/SparseArray;)V

    instance-of p1, p2, LYue/ۥۣ۠ۢ۠;

    if-eqz p1, :cond_0

    check-cast p2, LYue/ۥۣ۠ۢ۠;

    iget p1, p3, Landroidx/constraintlayout/widget/ConstraintLayout$ۥ۟;->ۥ۟۟ۢۦ:I

    const/4 p3, -0x1

    if-eq p1, p3, :cond_0

    invoke-virtual {p2, p1}, LYue/ۥۣ۠ۢ۠;->ۥ۟۠ۧۢ(I)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۠ۡ(LYue/ۥ۟ۧ۟ۢ;Z)V
    .locals 0

    iget-object p1, p0, Landroidx/constraintlayout/helper/widget/Flow;->ۥۣ۟۟ۡ:LYue/ۥۣ۠ۢ۠;

    invoke-virtual {p1, p2}, LYue/ۥۢۥ۟ۢ;->ۥ۟۠ۡۨ(Z)V

    return-void
.end method

.method public ۥ۟۟ۡ(LYue/ۥۢۥ۟ۢ;II)V
    .locals 2

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p3

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0, p2, v1, p3}, LYue/ۥۢۥ۟ۢ;->ۥ۟۠ۢۥ(IIII)V

    invoke-virtual {p1}, LYue/ۥۢۥ۟ۢ;->ۥ۟۠ۢ۠()I

    move-result p2

    invoke-virtual {p1}, LYue/ۥۢۥ۟ۢ;->ۥ۟۠ۢ۟()I

    move-result p1

    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    :goto_0
    return-void
.end method
