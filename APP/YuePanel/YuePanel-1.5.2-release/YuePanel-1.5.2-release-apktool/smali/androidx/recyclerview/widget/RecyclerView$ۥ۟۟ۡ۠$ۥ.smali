.class public Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# static fields
.field public static final ۥ۟۟۟ۢ:I = -0x80000000


# instance fields
.field public ۥ:I

.field public ۥ۟:I

.field public ۥ۟۟:I

.field public ۥ۟۟۟:I

.field public ۥ۟۟۟۟:Landroid/view/animation/Interpolator;

.field public ۥ۟۟۟۠:Z

.field public ۥ۟۟۟ۡ:I


# direct methods
.method public constructor <init>(II)V
    .locals 2
    .param p1    # I
        .annotation build LYue/ۥۡۥۤۤ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥۡۥۤۤ;
        .end annotation
    .end param

    const/high16 v0, -0x80000000

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0, v1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;-><init>(IIILandroid/view/animation/Interpolator;)V

    return-void
.end method

.method public constructor <init>(III)V
    .locals 1
    .param p1    # I
        .annotation build LYue/ۥۡۥۤۤ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥۡۥۤۤ;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;-><init>(IIILandroid/view/animation/Interpolator;)V

    return-void
.end method

.method public constructor <init>(IIILandroid/view/animation/Interpolator;)V
    .locals 1
    .param p1    # I
        .annotation build LYue/ۥۡۥۤۤ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥۡۥۤۤ;
        .end annotation
    .end param
    .param p4    # Landroid/view/animation/Interpolator;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 4
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟:I

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟۠:Z

    .line 6
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟ۡ:I

    .line 7
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ:I

    .line 8
    iput p2, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟:I

    .line 9
    iput p3, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟:I

    .line 10
    iput-object p4, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟۟:Landroid/view/animation/Interpolator;

    return-void
.end method


# virtual methods
.method public ۥ()I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟:I

    return v0
.end method

.method public ۥ۟()I
    .locals 1
    .annotation build LYue/ۥۡۥۤۤ;
    .end annotation

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ:I

    return v0
.end method

.method public ۥ۟۟()I
    .locals 1
    .annotation build LYue/ۥۡۥۤۤ;
    .end annotation

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟:I

    return v0
.end method

.method public ۥ۟۟۟()Landroid/view/animation/Interpolator;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟۟:Landroid/view/animation/Interpolator;

    return-object v0
.end method

.method public ۥ۟۟۟۟()Z
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟:I

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟۟۠(I)V
    .locals 0

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟:I

    return-void
.end method

.method public ۥ۟۟۟ۡ(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 5

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟:I

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    const/4 v2, -0x1

    iput v2, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟:I

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->jumpToPositionForSmoothScroller(I)V

    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟۠:Z

    return-void

    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟۠:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟ۧ()V

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->mViewFlinger:Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟ۡ;

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ:I

    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟:I

    iget v3, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟:I

    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟۟:Landroid/view/animation/Interpolator;

    invoke-virtual {p1, v0, v2, v3, v4}, Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟ۡ;->ۥ۟۟۟۠(IIILandroid/view/animation/Interpolator;)V

    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟ۡ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟ۡ:I

    const/16 v0, 0xa

    if-le p1, v0, :cond_1

    const-string p1, "RecyclerView"

    const-string v0, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟۠:Z

    goto :goto_0

    :cond_2
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟ۡ:I

    :goto_0
    return-void
.end method

.method public ۥ۟۟۟ۢ(I)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟۠:Z

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟:I

    return-void
.end method

.method public ۥۣ۟۟۟(I)V
    .locals 1
    .param p1    # I
        .annotation build LYue/ۥۡۥۤۤ;
        .end annotation
    .end param

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟۠:Z

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ:I

    return-void
.end method

.method public ۥ۟۟۟ۤ(I)V
    .locals 1
    .param p1    # I
        .annotation build LYue/ۥۡۥۤۤ;
        .end annotation
    .end param

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟۠:Z

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟:I

    return-void
.end method

.method public ۥ۟۟۟ۥ(Landroid/view/animation/Interpolator;)V
    .locals 1
    .param p1    # Landroid/view/animation/Interpolator;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟۠:Z

    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟۟:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public ۥ۟۟۟ۦ(IIILandroid/view/animation/Interpolator;)V
    .locals 0
    .param p1    # I
        .annotation build LYue/ۥۡۥۤۤ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥۡۥۤۤ;
        .end annotation
    .end param
    .param p4    # Landroid/view/animation/Interpolator;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ:I

    iput p2, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟:I

    iput p3, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟:I

    iput-object p4, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟۟:Landroid/view/animation/Interpolator;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟۠:Z

    return-void
.end method

.method public final ۥ۟۟۟ۧ()V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟۟۟:Landroid/view/animation/Interpolator;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟:I

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "If you provide an interpolator, you must set a positive duration"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ;->ۥ۟۟:I

    if-lt v0, v1, :cond_2

    return-void

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Scroll duration must be a positive number"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
