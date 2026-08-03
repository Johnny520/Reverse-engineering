.class public Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;
.super Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df"
.end annotation


# static fields
.field public static final ۥ۟۟۟ۡ:I = -0x1


# instance fields
.field public ۥ۟۟۟۟:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

.field public ۥ۟۟۟۠:Z


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠۟;-><init>(II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠۟;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠۟;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠۟;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠۟;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠۟;-><init>(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠۟;)V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟۟ۢ()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۟:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    iget v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟۟:I

    return v0
.end method

.method public ۥۣ۟۟۟()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۠:Z

    return v0
.end method

.method public ۥ۟۟۟ۤ(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۠:Z

    return-void
.end method
