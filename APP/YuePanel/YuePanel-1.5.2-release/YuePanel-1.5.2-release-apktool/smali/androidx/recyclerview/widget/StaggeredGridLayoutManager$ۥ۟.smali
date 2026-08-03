.class public Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public ۥ:I

.field public ۥ۟:I

.field public ۥ۟۟:Z

.field public ۥ۟۟۟:Z

.field public ۥ۟۟۟۟:Z

.field public ۥ۟۟۟۠:[I

.field public final synthetic ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;)V
    .locals 0

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟()V

    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥۣ۟۟۟()I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۨ()I

    move-result v0

    :goto_0
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟:I

    return-void
.end method

.method public ۥ۟(I)V
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥۣ۟۟۟()I

    move-result v0

    sub-int/2addr v0, p1

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۨ()I

    move-result v0

    add-int/2addr v0, p1

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟:I

    :goto_0
    return-void
.end method

.method public ۥ۟۟()V
    .locals 2

    const/4 v0, -0x1

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ:I

    const/high16 v1, -0x80000000

    iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟:I

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟:Z

    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟۟:Z

    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟۟۟:Z

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟۟۠:[I

    if-eqz v1, :cond_0

    invoke-static {v1, v0}, Ljava/util/Arrays;->fill([II)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟([Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;)V
    .locals 5

    array-length v0, p1

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟۟۠:[I

    if-eqz v1, :cond_0

    array-length v1, v1

    if-ge v1, v0, :cond_1

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    iget-object v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    array-length v1, v1

    new-array v1, v1, [I

    iput-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟۟۠:[I

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟۟۠:[I

    aget-object v3, p1, v1

    const/high16 v4, -0x80000000

    invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠ۤ(I)I

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
