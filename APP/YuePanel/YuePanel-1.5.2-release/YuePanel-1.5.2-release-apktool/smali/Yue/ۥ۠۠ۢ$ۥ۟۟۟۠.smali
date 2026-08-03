.class public LYue/ۥ۠۠ۢ$ۥ۟۟۟۠;
.super Landroid/view/ViewGroup$MarginLayoutParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠۠ۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e0"
.end annotation


# static fields
.field public static final ۥ۟۟۟۟:I = 0x1

.field public static final ۥ۟۟۟۠:I = 0x2

.field public static final ۥ۟۟۟ۡ:I = 0x4


# instance fields
.field public ۥ:I

.field public ۥ۟:F

.field public ۥ۟۟:Z

.field public ۥ۟۟۟:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    const/4 p1, 0x0

    .line 7
    iput p1, p0, LYue/ۥ۠۠ۢ$ۥ۟۟۟۠;->ۥ:I

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2}, LYue/ۥ۠۠ۢ$ۥ۟۟۟۠;-><init>(II)V

    .line 9
    iput p3, p0, LYue/ۥ۠۠ۢ$ۥ۟۟۟۠;->ۥ:I

    return-void
.end method

.method public constructor <init>(LYue/ۥ۠۠ۢ$ۥ۟۟۟۠;)V
    .locals 1
    .param p1    # LYue/ۥ۠۠ۢ$ۥ۟۟۟۠;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 10
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    const/4 v0, 0x0

    .line 11
    iput v0, p0, LYue/ۥ۠۠ۢ$ۥ۟۟۟۠;->ۥ:I

    .line 12
    iget p1, p1, LYue/ۥ۠۠ۢ$ۥ۟۟۟۠;->ۥ:I

    iput p1, p0, LYue/ۥ۠۠ۢ$ۥ۟۟۟۠;->ۥ:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, LYue/ۥ۠۠ۢ$ۥ۟۟۟۠;->ۥ:I

    .line 3
    sget-object v1, LYue/ۥ۠۠ۢ;->ۥ۟۟ۥۡ:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 4
    invoke-virtual {p1, v0, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, LYue/ۥ۠۠ۢ$ۥ۟۟۟۠;->ۥ:I

    .line 5
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0
    .param p1    # Landroid/view/ViewGroup$LayoutParams;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 13
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p1, 0x0

    .line 14
    iput p1, p0, LYue/ۥ۠۠ۢ$ۥ۟۟۟۠;->ۥ:I

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
    .locals 0
    .param p1    # Landroid/view/ViewGroup$MarginLayoutParams;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 15
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    const/4 p1, 0x0

    .line 16
    iput p1, p0, LYue/ۥ۠۠ۢ$ۥ۟۟۟۠;->ۥ:I

    return-void
.end method
