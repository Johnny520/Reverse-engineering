.class public Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/widget/ۥ۟۟۟۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public ۥ:Z

.field public ۥ۟:I

.field public ۥ۟۟:I

.field public ۥ۟۟۟:F

.field public ۥ۟۟۟۟:F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ:Z

    iput v0, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ۟:I

    iput v0, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ۟۟:I

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ۟۟۟:F

    const/high16 v0, 0x7fc00000    # Float.NaN

    iput v0, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ۟۟۟۟:F

    return-void
.end method


# virtual methods
.method public ۥ(Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;)V
    .locals 1

    iget-boolean v0, p1, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ:Z

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ:Z

    iget v0, p1, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ۟:I

    iput v0, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ۟:I

    iget v0, p1, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ۟۟۟:F

    iput v0, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ۟۟۟:F

    iget v0, p1, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ۟۟۟۟:F

    iput v0, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ۟۟۟۟:F

    iget p1, p1, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ۟۟:I

    iput p1, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ۟۟:I

    return-void
.end method

.method public ۥ۟(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    sget-object v0, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥ۟ۧ۟ۦ:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x1

    iput-boolean p2, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ:Z

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_4

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v1

    sget v2, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥ۟ۧ۟ۨ:I

    if-ne v1, v2, :cond_0

    iget v2, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ۟۟۟:F

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ۟۟۟:F

    goto :goto_1

    :cond_0
    sget v2, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥ۟ۧ۟ۧ:I

    if-ne v1, v2, :cond_1

    iget v2, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ۟:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ۟:I

    invoke-static {}, Landroidx/constraintlayout/widget/ۥ۟۟۟۠;->ۥ۟()[I

    move-result-object v1

    iget v2, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ۟:I

    aget v1, v1, v2

    iput v1, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ۟:I

    goto :goto_1

    :cond_1
    sget v2, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥ۟ۧ۠۠:I

    if-ne v1, v2, :cond_2

    iget v2, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ۟۟:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ۟۟:I

    goto :goto_1

    :cond_2
    sget v2, Landroidx/constraintlayout/widget/ۥ۟۟۟ۥ$ۥ۟۟۟ۧ;->ۥ۟ۧ۠۟:I

    if-ne v1, v2, :cond_3

    iget v2, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ۟۟۟۟:F

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    iput v1, p0, Landroidx/constraintlayout/widget/ۥ۟۟۟۠$ۥ۟۟۟;->ۥ۟۟۟۟:F

    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method
