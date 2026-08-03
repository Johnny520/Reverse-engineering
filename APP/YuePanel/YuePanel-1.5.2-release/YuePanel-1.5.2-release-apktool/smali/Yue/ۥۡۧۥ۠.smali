.class public final LYue/ۥۡۧۥ۠;
.super Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۧۥ۠$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟ۨ:I = 0x0

.field public static final ۥ۟۟۠:I = 0x1

.field public static final ۥ۟۟۠۟:I = 0x2

.field public static final ۥ۟۟۠۠:I = 0x3

.field public static final ۥ۟۟۠ۡ:I = 0x4

.field public static final ۥ۟۟۠ۢ:I = -0x1


# instance fields
.field public ۥ:LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;

.field public final ۥ۟:LYue/ۥۢۤۦۢ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public final ۥ۟۟:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public final ۥ۟۟۟:Landroidx/recyclerview/widget/LinearLayoutManager;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public ۥ۟۟۟۟:I

.field public ۥ۟۟۟۠:I

.field public ۥ۟۟۟ۡ:LYue/ۥۡۧۥ۠$ۥ;

.field public ۥ۟۟۟ۢ:I

.field public ۥۣ۟۟۟:I

.field public ۥ۟۟۟ۤ:Z

.field public ۥ۟۟۟ۥ:Z

.field public ۥ۟۟۟ۦ:Z

.field public ۥ۟۟۟ۧ:Z


# direct methods
.method public constructor <init>(LYue/ۥۢۤۦۢ;)V
    .locals 0
    .param p1    # LYue/ۥۢۤۦۢ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۠;-><init>()V

    iput-object p1, p0, LYue/ۥۡۧۥ۠;->ۥ۟:LYue/ۥۢۤۦۢ;

    iget-object p1, p1, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    iput-object p1, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟:Landroidx/recyclerview/widget/LinearLayoutManager;

    new-instance p1, LYue/ۥۡۧۥ۠$ۥ;

    invoke-direct {p1}, LYue/ۥۡۧۥ۠$ۥ;-><init>()V

    iput-object p1, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۡ:LYue/ۥۡۧۥ۠$ۥ;

    invoke-virtual {p0}, LYue/ۥۡۧۥ۠;->ۥ۟۟۠()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 4
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget p1, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟۟:I

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    iget p1, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟۠:I

    if-eq p1, v1, :cond_1

    :cond_0
    if-ne p2, v1, :cond_1

    invoke-virtual {p0, v0}, LYue/ۥۡۧۥ۠;->ۥ۟۟۠۠(Z)V

    return-void

    :cond_1
    invoke-virtual {p0}, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۤ()Z

    move-result p1

    const/4 v2, 0x2

    if-eqz p1, :cond_3

    if-ne p2, v2, :cond_3

    iget-boolean p1, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۥ:Z

    if-eqz p1, :cond_2

    invoke-virtual {p0, v2}, LYue/ۥۡۧۥ۠;->ۥ۟۟(I)V

    iput-boolean v1, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۤ:Z

    :cond_2
    return-void

    :cond_3
    invoke-virtual {p0}, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۤ()Z

    move-result p1

    const/4 v1, -0x1

    if-eqz p1, :cond_6

    if-nez p2, :cond_6

    invoke-virtual {p0}, LYue/ۥۡۧۥ۠;->ۥ۟۟۠ۡ()V

    iget-boolean p1, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۥ:Z

    if-nez p1, :cond_4

    iget-object p1, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۡ:LYue/ۥۡۧۥ۠$ۥ;

    iget p1, p1, LYue/ۥۡۧۥ۠$ۥ;->ۥ:I

    if-eq p1, v1, :cond_5

    const/4 v3, 0x0

    invoke-virtual {p0, p1, v3, v0}, LYue/ۥۡۧۥ۠;->ۥ(IFI)V

    goto :goto_0

    :cond_4
    iget-object p1, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۡ:LYue/ۥۡۧۥ۠$ۥ;

    iget v3, p1, LYue/ۥۡۧۥ۠$ۥ;->ۥ۟۟:I

    if-nez v3, :cond_6

    iget v3, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۢ:I

    iget p1, p1, LYue/ۥۡۧۥ۠$ۥ;->ۥ:I

    if-eq v3, p1, :cond_5

    invoke-virtual {p0, p1}, LYue/ۥۡۧۥ۠;->ۥ۟(I)V

    :cond_5
    :goto_0
    invoke-virtual {p0, v0}, LYue/ۥۡۧۥ۠;->ۥ۟۟(I)V

    invoke-virtual {p0}, LYue/ۥۡۧۥ۠;->ۥ۟۟۠()V

    :cond_6
    iget p1, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟۟:I

    if-ne p1, v2, :cond_9

    if-nez p2, :cond_9

    iget-boolean p1, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۦ:Z

    if-eqz p1, :cond_9

    invoke-virtual {p0}, LYue/ۥۡۧۥ۠;->ۥ۟۟۠ۡ()V

    iget-object p1, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۡ:LYue/ۥۡۧۥ۠$ۥ;

    iget p2, p1, LYue/ۥۡۧۥ۠$ۥ;->ۥ۟۟:I

    if-nez p2, :cond_9

    iget p2, p0, LYue/ۥۡۧۥ۠;->ۥۣ۟۟۟:I

    iget p1, p1, LYue/ۥۡۧۥ۠$ۥ;->ۥ:I

    if-eq p2, p1, :cond_8

    if-ne p1, v1, :cond_7

    move p1, v0

    :cond_7
    invoke-virtual {p0, p1}, LYue/ۥۡۧۥ۠;->ۥ۟(I)V

    :cond_8
    invoke-virtual {p0, v0}, LYue/ۥۡۧۥ۠;->ۥ۟۟(I)V

    invoke-virtual {p0}, LYue/ۥۡۧۥ۠;->ۥ۟۟۠()V

    :cond_9
    return-void
.end method

.method public onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 3
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 p1, 0x1

    iput-boolean p1, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۥ:Z

    invoke-virtual {p0}, LYue/ۥۡۧۥ۠;->ۥ۟۟۠ۡ()V

    iget-boolean v0, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۤ:Z

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    iput-boolean v2, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۤ:Z

    if-gtz p3, :cond_1

    if-nez p3, :cond_2

    if-gez p2, :cond_0

    move p2, p1

    goto :goto_0

    :cond_0
    move p2, v2

    :goto_0
    iget-object p3, p0, LYue/ۥۡۧۥ۠;->ۥ۟:LYue/ۥۢۤۦۢ;

    invoke-virtual {p3}, LYue/ۥۢۤۦۢ;->ۥ۟۟۟ۥ()Z

    move-result p3

    if-ne p2, p3, :cond_2

    :cond_1
    iget-object p2, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۡ:LYue/ۥۡۧۥ۠$ۥ;

    iget p3, p2, LYue/ۥۡۧۥ۠$ۥ;->ۥ۟۟:I

    if-eqz p3, :cond_2

    iget p2, p2, LYue/ۥۡۧۥ۠$ۥ;->ۥ:I

    add-int/2addr p2, p1

    goto :goto_1

    :cond_2
    iget-object p2, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۡ:LYue/ۥۡۧۥ۠$ۥ;

    iget p2, p2, LYue/ۥۡۧۥ۠$ۥ;->ۥ:I

    :goto_1
    iput p2, p0, LYue/ۥۡۧۥ۠;->ۥۣ۟۟۟:I

    iget p3, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۢ:I

    if-eq p3, p2, :cond_5

    invoke-virtual {p0, p2}, LYue/ۥۡۧۥ۠;->ۥ۟(I)V

    goto :goto_2

    :cond_3
    iget p2, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟۟:I

    if-nez p2, :cond_5

    iget-object p2, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۡ:LYue/ۥۡۧۥ۠$ۥ;

    iget p2, p2, LYue/ۥۡۧۥ۠$ۥ;->ۥ:I

    if-ne p2, v1, :cond_4

    move p2, v2

    :cond_4
    invoke-virtual {p0, p2}, LYue/ۥۡۧۥ۠;->ۥ۟(I)V

    :cond_5
    :goto_2
    iget-object p2, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۡ:LYue/ۥۡۧۥ۠$ۥ;

    iget p3, p2, LYue/ۥۡۧۥ۠$ۥ;->ۥ:I

    if-ne p3, v1, :cond_6

    move p3, v2

    :cond_6
    iget v0, p2, LYue/ۥۡۧۥ۠$ۥ;->ۥ۟:F

    iget p2, p2, LYue/ۥۡۧۥ۠$ۥ;->ۥ۟۟:I

    invoke-virtual {p0, p3, v0, p2}, LYue/ۥۡۧۥ۠;->ۥ(IFI)V

    iget-object p2, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۡ:LYue/ۥۡۧۥ۠$ۥ;

    iget p3, p2, LYue/ۥۡۧۥ۠$ۥ;->ۥ:I

    iget v0, p0, LYue/ۥۡۧۥ۠;->ۥۣ۟۟۟:I

    if-eq p3, v0, :cond_7

    if-ne v0, v1, :cond_8

    :cond_7
    iget p2, p2, LYue/ۥۡۧۥ۠$ۥ;->ۥ۟۟:I

    if-nez p2, :cond_8

    iget p2, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟۠:I

    if-eq p2, p1, :cond_8

    invoke-virtual {p0, v2}, LYue/ۥۡۧۥ۠;->ۥ۟۟(I)V

    invoke-virtual {p0}, LYue/ۥۡۧۥ۠;->ۥ۟۟۠()V

    :cond_8
    return-void
.end method

.method public final ۥ(IFI)V
    .locals 1

    iget-object v0, p0, LYue/ۥۡۧۥ۠;->ۥ:LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;->onPageScrolled(IFI)V

    :cond_0
    return-void
.end method

.method public final ۥ۟(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥۡۧۥ۠;->ۥ:LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;->onPageSelected(I)V

    :cond_0
    return-void
.end method

.method public final ۥ۟۟(I)V
    .locals 2

    iget v0, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟۟:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget v0, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟۠:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟۠:I

    if-ne v0, p1, :cond_1

    return-void

    :cond_1
    iput p1, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟۠:I

    iget-object v0, p0, LYue/ۥۡۧۥ۠;->ۥ:LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;->onPageScrollStateChanged(I)V

    :cond_2
    return-void
.end method

.method public final ۥ۟۟۟()I
    .locals 1

    iget-object v0, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟۟()D
    .locals 5

    invoke-virtual {p0}, LYue/ۥۡۧۥ۠;->ۥ۟۟۠ۡ()V

    iget-object v0, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۡ:LYue/ۥۡۧۥ۠$ۥ;

    iget v1, v0, LYue/ۥۡۧۥ۠$ۥ;->ۥ:I

    int-to-double v1, v1

    iget v0, v0, LYue/ۥۡۧۥ۠$ۥ;->ۥ۟:F

    float-to-double v3, v0

    add-double/2addr v1, v3

    return-wide v1
.end method

.method public ۥ۟۟۟۠()I
    .locals 1

    iget v0, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟۠:I

    return v0
.end method

.method public ۥ۟۟۟ۡ()Z
    .locals 2

    iget v0, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟۠:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public ۥ۟۟۟ۢ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۧ:Z

    return v0
.end method

.method public ۥۣ۟۟۟()Z
    .locals 1

    iget v0, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟۠:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۥ۟۟۟ۤ()Z
    .locals 3

    iget v0, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟۟:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x4

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method public ۥ۟۟۟ۥ()V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟۟:I

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LYue/ۥۡۧۥ۠;->ۥ۟۟۠۠(Z)V

    return-void
.end method

.method public ۥ۟۟۟ۦ()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۦ:Z

    return-void
.end method

.method public ۥ۟۟۟ۧ()V
    .locals 3

    invoke-virtual {p0}, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۡ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۧ:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۧ:Z

    invoke-virtual {p0}, LYue/ۥۡۧۥ۠;->ۥ۟۟۠ۡ()V

    iget-object v1, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۡ:LYue/ۥۡۧۥ۠$ۥ;

    iget v2, v1, LYue/ۥۡۧۥ۠$ۥ;->ۥ۟۟:I

    if-nez v2, :cond_2

    iget v1, v1, LYue/ۥۡۧۥ۠$ۥ;->ۥ:I

    iget v2, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۢ:I

    if-eq v1, v2, :cond_1

    invoke-virtual {p0, v1}, LYue/ۥۡۧۥ۠;->ۥ۟(I)V

    :cond_1
    invoke-virtual {p0, v0}, LYue/ۥۡۧۥ۠;->ۥ۟۟(I)V

    invoke-virtual {p0}, LYue/ۥۡۧۥ۠;->ۥ۟۟۠()V

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, LYue/ۥۡۧۥ۠;->ۥ۟۟(I)V

    :goto_0
    return-void
.end method

.method public ۥ۟۟۟ۨ(IZ)V
    .locals 2

    const/4 v0, 0x2

    if-eqz p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    const/4 p2, 0x3

    :goto_0
    iput p2, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟۟:I

    const/4 p2, 0x0

    iput-boolean p2, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۧ:Z

    iget v1, p0, LYue/ۥۡۧۥ۠;->ۥۣ۟۟۟:I

    if-eq v1, p1, :cond_1

    const/4 p2, 0x1

    :cond_1
    iput p1, p0, LYue/ۥۡۧۥ۠;->ۥۣ۟۟۟:I

    invoke-virtual {p0, v0}, LYue/ۥۡۧۥ۠;->ۥ۟۟(I)V

    if-eqz p2, :cond_2

    invoke-virtual {p0, p1}, LYue/ۥۡۧۥ۠;->ۥ۟(I)V

    :cond_2
    return-void
.end method

.method public final ۥ۟۟۠()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟۟:I

    iput v0, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟۠:I

    iget-object v1, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۡ:LYue/ۥۡۧۥ۠$ۥ;

    invoke-virtual {v1}, LYue/ۥۡۧۥ۠$ۥ;->ۥ()V

    const/4 v1, -0x1

    iput v1, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۢ:I

    iput v1, p0, LYue/ۥۡۧۥ۠;->ۥۣ۟۟۟:I

    iput-boolean v0, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۤ:Z

    iput-boolean v0, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۥ:Z

    iput-boolean v0, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۧ:Z

    iput-boolean v0, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۦ:Z

    return-void
.end method

.method public ۥ۟۟۠۟(LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۧۥ۠;->ۥ:LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;

    return-void
.end method

.method public final ۥ۟۟۠۠(Z)V
    .locals 2

    iput-boolean p1, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۧ:Z

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    iput p1, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟۟:I

    iget p1, p0, LYue/ۥۡۧۥ۠;->ۥۣ۟۟۟:I

    const/4 v1, -0x1

    if-eq p1, v1, :cond_1

    iput p1, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۢ:I

    iput v1, p0, LYue/ۥۡۧۥ۠;->ۥۣ۟۟۟:I

    goto :goto_1

    :cond_1
    iget p1, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۢ:I

    if-ne p1, v1, :cond_2

    invoke-virtual {p0}, LYue/ۥۡۧۥ۠;->ۥ۟۟۟()I

    move-result p1

    iput p1, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۢ:I

    :cond_2
    :goto_1
    invoke-virtual {p0, v0}, LYue/ۥۡۧۥ۠;->ۥ۟۟(I)V

    return-void
.end method

.method public final ۥ۟۟۠ۡ()V
    .locals 8

    iget-object v0, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۡ:LYue/ۥۡۧۥ۠$ۥ;

    iget-object v1, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v1

    iput v1, v0, LYue/ۥۡۧۥ۠$ۥ;->ۥ:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, LYue/ۥۡۧۥ۠$ۥ;->ۥ()V

    return-void

    :cond_0
    iget-object v2, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findViewByPosition(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, LYue/ۥۡۧۥ۠$ۥ;->ۥ()V

    return-void

    :cond_1
    iget-object v2, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getLeftDecorationWidth(Landroid/view/View;)I

    move-result v2

    iget-object v3, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getRightDecorationWidth(Landroid/view/View;)I

    move-result v3

    iget-object v4, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v4, v1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getTopDecorationHeight(Landroid/view/View;)I

    move-result v4

    iget-object v5, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v5, v1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getBottomDecorationHeight(Landroid/view/View;)I

    move-result v5

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    instance-of v7, v6, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v7, :cond_2

    check-cast v6, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v7, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v2, v7

    iget v7, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v3, v7

    iget v7, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v4, v7

    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v5, v6

    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v6

    add-int/2addr v6, v4

    add-int/2addr v6, v5

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v5

    add-int/2addr v5, v2

    add-int/2addr v5, v3

    iget-object v3, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->getOrientation()I

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    sub-int/2addr v1, v2

    iget-object v2, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, LYue/ۥۡۧۥ۠;->ۥ۟:LYue/ۥۢۤۦۢ;

    invoke-virtual {v2}, LYue/ۥۢۤۦۢ;->ۥ۟۟۟ۥ()Z

    move-result v2

    if-eqz v2, :cond_3

    neg-int v1, v1

    :cond_3
    move v6, v5

    goto :goto_0

    :cond_4
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    sub-int/2addr v1, v4

    iget-object v2, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    :goto_0
    neg-int v1, v1

    iput v1, v0, LYue/ۥۡۧۥ۠$ۥ;->ۥ۟۟:I

    if-gez v1, :cond_6

    new-instance v1, LYue/ۥ۟۠ۦ;

    iget-object v2, p0, LYue/ۥۡۧۥ۠;->ۥ۟۟۟:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, v2}, LYue/ۥ۟۠ۦ;-><init>(Landroidx/recyclerview/widget/LinearLayoutManager;)V

    invoke-virtual {v1}, LYue/ۥ۟۠ۦ;->ۥ۟۟۟()Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    iget v0, v0, LYue/ۥۡۧۥ۠$ۥ;->ۥ۟۟:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v3, "Page can only be offset by a positive amount, not by %d"

    invoke-static {v2, v3, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    if-nez v6, :cond_7

    const/4 v1, 0x0

    goto :goto_1

    :cond_7
    int-to-float v1, v1

    int-to-float v2, v6

    div-float/2addr v1, v2

    :goto_1
    iput v1, v0, LYue/ۥۡۧۥ۠$ۥ;->ۥ۟:F

    return-void
.end method
