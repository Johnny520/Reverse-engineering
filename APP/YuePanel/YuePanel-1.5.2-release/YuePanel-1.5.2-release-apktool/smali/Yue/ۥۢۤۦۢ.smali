.class public final LYue/ۥۢۤۦۢ;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۤۦۢ$ۥ۟۟۟ۡ;,
        LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;,
        LYue/ۥۢۤۦۢ$ۥ۟۟۟۠;,
        LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;,
        LYue/ۥۢۤۦۢ$ۥ۟۟۟ۧ;,
        LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;,
        LYue/ۥۢۤۦۢ$ۥ۟۟۠ۡ;,
        LYue/ۥۢۤۦۢ$ۥ۟۟۟ۨ;,
        LYue/ۥۢۤۦۢ$ۥ۟۟۟ۢ;,
        LYue/ۥۢۤۦۢ$ۥ۟۟۠;,
        LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;,
        LYue/ۥۢۤۦۢ$ۥۣ۟۟۟;,
        LYue/ۥۢۤۦۢ$ۥ۟۟۠۠;,
        LYue/ۥۢۤۦۢ$ۥ۟۟۟ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟ۢۡ:I = 0x0

.field public static final ۥ۟۟ۢۢ:I = 0x1

.field public static final ۥۣ۟۟ۢ:I = 0x0

.field public static final ۥ۟۟ۢۤ:I = 0x1

.field public static final ۥ۟۟ۢۥ:I = 0x2

.field public static final ۥ۟۟ۢۦ:I = -0x1

.field public static ۥ۟۟ۢۧ:Z = true


# instance fields
.field public final ۥۣ۟۟۠:Landroid/graphics/Rect;

.field public final ۥ۟۟۠ۤ:Landroid/graphics/Rect;

.field public ۥ۟۟۠ۥ:LYue/ۥ۟ۦۤۧ;

.field public ۥ۟۟۠ۦ:I

.field public ۥ۟۟۠ۧ:Z

.field public ۥ۟۟۠ۨ:Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۟;

.field public ۥ۟۟ۡ:Landroidx/recyclerview/widget/LinearLayoutManager;

.field public ۥ۟۟ۡ۟:I

.field public ۥ۟۟ۡ۠:Landroid/os/Parcelable;

.field public ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

.field public ۥ۟۟ۡۢ:Landroidx/recyclerview/widget/ۥ۟۟۠ۡ;

.field public ۥۣ۟۟ۡ:LYue/ۥۡۧۥ۠;

.field public ۥ۟۟ۡۤ:LYue/ۥ۟ۦۤۧ;

.field public ۥ۟۟ۡۥ:LYue/ۥ۠ۡۦۢ;

.field public ۥ۟۟ۡۦ:LYue/ۥۣۡۥۥ;

.field public ۥ۟۟ۡۧ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;

.field public ۥ۟۟ۡۨ:Z

.field public ۥ۟۟ۢ:Z

.field public ۥ۟۟ۢ۟:I

.field public ۥ۟۟ۢ۠:LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, LYue/ۥۢۤۦۢ;->ۥۣ۟۟۠:Landroid/graphics/Rect;

    .line 3
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۤ:Landroid/graphics/Rect;

    .line 4
    new-instance v0, LYue/ۥ۟ۦۤۧ;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, LYue/ۥ۟ۦۤۧ;-><init>(I)V

    iput-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۦۤۧ;

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۧ:Z

    .line 6
    new-instance v1, LYue/ۥۢۤۦۢ$ۥ;

    invoke-direct {v1, p0}, LYue/ۥۢۤۦۢ$ۥ;-><init>(LYue/ۥۢۤۦۢ;)V

    iput-object v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۨ:Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۟;

    const/4 v1, -0x1

    .line 7
    iput v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡ۟:I

    const/4 v2, 0x0

    .line 8
    iput-object v2, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۧ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;

    .line 9
    iput-boolean v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۨ:Z

    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ:Z

    .line 11
    iput v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ۟:I

    .line 12
    invoke-virtual {p0, p1, v2}, LYue/ۥۢۤۦۢ;->ۥ۟۟۟ۢ(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    .line 13
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, LYue/ۥۢۤۦۢ;->ۥۣ۟۟۠:Landroid/graphics/Rect;

    .line 15
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۤ:Landroid/graphics/Rect;

    .line 16
    new-instance v0, LYue/ۥ۟ۦۤۧ;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, LYue/ۥ۟ۦۤۧ;-><init>(I)V

    iput-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۦۤۧ;

    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۧ:Z

    .line 18
    new-instance v1, LYue/ۥۢۤۦۢ$ۥ;

    invoke-direct {v1, p0}, LYue/ۥۢۤۦۢ$ۥ;-><init>(LYue/ۥۢۤۦۢ;)V

    iput-object v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۨ:Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۟;

    const/4 v1, -0x1

    .line 19
    iput v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡ۟:I

    const/4 v2, 0x0

    .line 20
    iput-object v2, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۧ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;

    .line 21
    iput-boolean v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۨ:Z

    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ:Z

    .line 23
    iput v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ۟:I

    .line 24
    invoke-virtual {p0, p1, p2}, LYue/ۥۢۤۦۢ;->ۥ۟۟۟ۢ(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    .line 25
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 26
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, LYue/ۥۢۤۦۢ;->ۥۣ۟۟۠:Landroid/graphics/Rect;

    .line 27
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۤ:Landroid/graphics/Rect;

    .line 28
    new-instance p3, LYue/ۥ۟ۦۤۧ;

    const/4 v0, 0x3

    invoke-direct {p3, v0}, LYue/ۥ۟ۦۤۧ;-><init>(I)V

    iput-object p3, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۦۤۧ;

    const/4 p3, 0x0

    .line 29
    iput-boolean p3, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۧ:Z

    .line 30
    new-instance v0, LYue/ۥۢۤۦۢ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥۢۤۦۢ$ۥ;-><init>(LYue/ۥۢۤۦۢ;)V

    iput-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۨ:Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۟;

    const/4 v0, -0x1

    .line 31
    iput v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡ۟:I

    const/4 v1, 0x0

    .line 32
    iput-object v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۧ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;

    .line 33
    iput-boolean p3, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۨ:Z

    const/4 p3, 0x1

    .line 34
    iput-boolean p3, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ:Z

    .line 35
    iput v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ۟:I

    .line 36
    invoke-virtual {p0, p1, p2}, LYue/ۥۢۤۦۢ;->ۥ۟۟۟ۢ(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x15
    .end annotation

    .line 37
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 38
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, LYue/ۥۢۤۦۢ;->ۥۣ۟۟۠:Landroid/graphics/Rect;

    .line 39
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۤ:Landroid/graphics/Rect;

    .line 40
    new-instance p3, LYue/ۥ۟ۦۤۧ;

    const/4 p4, 0x3

    invoke-direct {p3, p4}, LYue/ۥ۟ۦۤۧ;-><init>(I)V

    iput-object p3, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۦۤۧ;

    const/4 p3, 0x0

    .line 41
    iput-boolean p3, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۧ:Z

    .line 42
    new-instance p4, LYue/ۥۢۤۦۢ$ۥ;

    invoke-direct {p4, p0}, LYue/ۥۢۤۦۢ$ۥ;-><init>(LYue/ۥۢۤۦۢ;)V

    iput-object p4, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۨ:Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۟;

    const/4 p4, -0x1

    .line 43
    iput p4, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡ۟:I

    const/4 v0, 0x0

    .line 44
    iput-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۧ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;

    .line 45
    iput-boolean p3, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۨ:Z

    const/4 p3, 0x1

    .line 46
    iput-boolean p3, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ:Z

    .line 47
    iput p4, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ۟:I

    .line 48
    invoke-virtual {p0, p1, p2}, LYue/ۥۢۤۦۢ;->ۥ۟۟۟ۢ(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public canScrollHorizontally(I)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result p1

    return p1
.end method

.method public canScrollVertically(I)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p1

    return p1
.end method

.method public dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray<",
            "Landroid/os/Parcelable;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Parcelable;

    instance-of v1, v0, LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;

    if-eqz v1, :cond_0

    check-cast v0, LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;

    iget v0, v0, LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;->ۥۣ۟۟۠:I

    iget-object v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->remove(I)V

    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchRestoreInstanceState(Landroid/util/SparseArray;)V

    invoke-virtual {p0}, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۡ()V

    return-void
.end method

.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .locals 1
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x17
    .end annotation

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ۠:LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;

    invoke-virtual {v0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;->ۥ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ۠:LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;

    invoke-virtual {v0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;->ۥ۟۟۟ۡ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-super {p0}, Landroid/view/ViewGroup;->getAccessibilityClassName()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public getAdapter()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;

    move-result-object v0

    return-object v0
.end method

.method public getCurrentItem()I
    .locals 1

    iget v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۦ:I

    return v0
.end method

.method public getItemDecorationCount()I
    .locals 1

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result v0

    return v0
.end method

.method public getOffscreenPageLimit()I
    .locals 1

    iget v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ۟:I

    return v0
.end method

.method public getOrientation()I
    .locals 1

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡ:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->getOrientation()I

    move-result v0

    return v0
.end method

.method public getPageSize()I
    .locals 3

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, LYue/ۥۢۤۦۢ;->getOrientation()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    :goto_0
    sub-int/2addr v1, v0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    goto :goto_0

    :goto_1
    return v1
.end method

.method public getScrollState()I
    .locals 1

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥۣ۟۟ۡ:LYue/ۥۡۧۥ۠;

    invoke-virtual {v0}, LYue/ۥۡۧۥ۠;->ۥ۟۟۟۠()I

    move-result v0

    return v0
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ۠:LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;

    invoke-virtual {v0, p1}, LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;->ۥۣ۟۟۟(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 3

    iget-object p1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iget-object v1, p0, LYue/ۥۢۤۦۢ;->ۥۣ۟۟۠:Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    iput v2, v1, Landroid/graphics/Rect;->left:I

    iget-object v1, p0, LYue/ۥۢۤۦۢ;->ۥۣ۟۟۠:Landroid/graphics/Rect;

    sub-int/2addr p4, p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p2

    sub-int/2addr p4, p2

    iput p4, v1, Landroid/graphics/Rect;->right:I

    iget-object p2, p0, LYue/ۥۢۤۦۢ;->ۥۣ۟۟۠:Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p4

    iput p4, p2, Landroid/graphics/Rect;->top:I

    iget-object p2, p0, LYue/ۥۢۤۦۢ;->ۥۣ۟۟۠:Landroid/graphics/Rect;

    sub-int/2addr p5, p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p3

    sub-int/2addr p5, p3

    iput p5, p2, Landroid/graphics/Rect;->bottom:I

    iget-object p2, p0, LYue/ۥۢۤۦۢ;->ۥۣ۟۟۠:Landroid/graphics/Rect;

    iget-object p3, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۤ:Landroid/graphics/Rect;

    const p4, 0x800033

    invoke-static {p4, p1, v0, p2, p3}, Landroid/view/Gravity;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;)V

    iget-object p1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p2, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۤ:Landroid/graphics/Rect;

    iget p3, p2, Landroid/graphics/Rect;->left:I

    iget p4, p2, Landroid/graphics/Rect;->top:I

    iget p5, p2, Landroid/graphics/Rect;->right:I

    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p1, p3, p4, p5, p2}, Landroid/view/View;->layout(IIII)V

    iget-boolean p1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۧ:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۨ()V

    :cond_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 5

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, v0, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget-object v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    iget-object v2, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredState()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    add-int/2addr v3, v4

    add-int/2addr v0, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    add-int/2addr v3, v4

    add-int/2addr v1, v3

    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v0, p1, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result p1

    shl-int/lit8 v0, v2, 0x10

    invoke-static {v1, p2, v0}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_0
    check-cast p1, LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;

    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget v0, p1, LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;->ۥ۟۟۠ۤ:I

    iput v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡ۟:I

    iget-object p1, p1, LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;->ۥ۟۟۠ۥ:Landroid/os/Parcelable;

    iput-object p1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡ۠:Landroid/os/Parcelable;

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;

    invoke-direct {v1, v0}, LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;-><init>(Landroid/os/Parcelable;)V

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    iput v0, v1, LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;->ۥۣ۟۟۠:I

    iget v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡ۟:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    iget v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۦ:I

    :cond_0
    iput v0, v1, LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;->ۥ۟۟۠ۤ:I

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡ۠:Landroid/os/Parcelable;

    if-eqz v0, :cond_1

    iput-object v0, v1, LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;->ۥ۟۟۠ۥ:Landroid/os/Parcelable;

    goto :goto_0

    :cond_1
    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;

    move-result-object v0

    instance-of v2, v0, LYue/ۥۢ۠۟ۦ;

    if-eqz v2, :cond_2

    check-cast v0, LYue/ۥۢ۠۟ۦ;

    invoke-interface {v0}, LYue/ۥۢ۠۟ۦ;->saveState()Landroid/os/Parcelable;

    move-result-object v0

    iput-object v0, v1, LYue/ۥۢۤۦۢ$ۥ۟۟۠۟;->ۥ۟۟۠ۥ:Landroid/os/Parcelable;

    :cond_2
    :goto_0
    return-object v1
.end method

.method public onViewAdded(Landroid/view/View;)V
    .locals 2

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, LYue/ۥۢۤۦۢ;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " does not support direct child views"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public performAccessibilityAction(ILandroid/os/Bundle;)Z
    .locals 1
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x10
    .end annotation

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ۠:LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;

    invoke-virtual {v0, p1, p2}, LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;->ۥ۟۟(ILandroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ۠:LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;

    invoke-virtual {v0, p1, p2}, LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;->ۥ۟۟۟ۦ(ILandroid/os/Bundle;)Z

    move-result p1

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/View;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public setAdapter(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;)V
    .locals 2
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ۠:LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;

    invoke-virtual {v1, v0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;->ۥ۟۟۟۠(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;)V

    invoke-virtual {p0, v0}, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۦ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;)V

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;)V

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۦ:I

    invoke-virtual {p0}, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۡ()V

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ۠:LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;

    invoke-virtual {v0, p1}, LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;->ۥ۟۟۟۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;)V

    invoke-virtual {p0, p1}, LYue/ۥۢۤۦۢ;->ۥ۟۟۟ۧ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;)V

    return-void
.end method

.method public setCurrentItem(I)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۢ(IZ)V

    return-void
.end method

.method public setLayoutDirection(I)V
    .locals 0
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x11
    .end annotation

    invoke-super {p0, p1}, Landroid/view/View;->setLayoutDirection(I)V

    iget-object p1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ۠:LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;

    invoke-virtual {p1}, LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;->ۥ۟۟۠۟()V

    return-void
.end method

.method public setOffscreenPageLimit(I)V
    .locals 1

    const/4 v0, 0x1

    if-ge p1, v0, :cond_1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput p1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ۟:I

    iget-object p1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    return-void
.end method

.method public setOrientation(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡ:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->setOrientation(I)V

    iget-object p1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ۠:LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;

    invoke-virtual {p1}, LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;->ۥ۟۟۠ۡ()V

    return-void
.end method

.method public setPageTransformer(LYue/ۥۢۤۦۢ$ۥ۟۟۟ۧ;)V
    .locals 3
    .param p1    # LYue/ۥۢۤۦۢ$ۥ۟۟۟ۧ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-boolean v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۨ:Z

    if-nez v1, :cond_0

    iget-object v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;

    move-result-object v1

    iput-object v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۧ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;

    const/4 v1, 0x1

    iput-boolean v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۨ:Z

    :cond_0
    iget-object v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;)V

    goto :goto_0

    :cond_1
    iget-boolean v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۨ:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۧ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;)V

    iput-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۧ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ;

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۨ:Z

    :cond_2
    :goto_0
    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۦ:LYue/ۥۣۡۥۥ;

    invoke-virtual {v0}, LYue/ۥۣۡۥۥ;->ۥ()LYue/ۥۢۤۦۢ$ۥ۟۟۟ۧ;

    move-result-object v0

    if-ne p1, v0, :cond_3

    return-void

    :cond_3
    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۦ:LYue/ۥۣۡۥۥ;

    invoke-virtual {v0, p1}, LYue/ۥۣۡۥۥ;->ۥ۟(LYue/ۥۢۤۦۢ$ۥ۟۟۟ۧ;)V

    invoke-virtual {p0}, LYue/ۥۢۤۦۢ;->ۥ۟۟۠۠()V

    return-void
.end method

.method public setUserInputEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ:Z

    iget-object p1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ۠:LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;

    invoke-virtual {p1}, LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;->ۥ۟۟۠ۢ()V

    return-void
.end method

.method public ۥ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۨ;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۨ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۨ;)V

    return-void
.end method

.method public ۥ۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۨ;I)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۨ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۨ;I)V

    return-void
.end method

.method public ۥ۟۟()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۥ:LYue/ۥ۠ۡۦۢ;

    invoke-virtual {v0}, LYue/ۥ۠ۡۦۢ;->ۥ۟()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۥ:LYue/ۥ۠ۡۦۢ;

    invoke-virtual {v0}, LYue/ۥ۠ۡۦۢ;->ۥ۟۟۟()Z

    move-result v0

    return v0
.end method

.method public final ۥ۟۟۟۟()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠۠;
    .locals 1

    new-instance v0, LYue/ۥۢۤۦۢ$ۥ۟۟۟;

    invoke-direct {v0, p0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟;-><init>(LYue/ۥۢۤۦۢ;)V

    return-object v0
.end method

.method public ۥ۟۟۟۠(F)Z
    .locals 1
    .param p1    # F
        .annotation build LYue/ۥۡۥۤۤ;
        .end annotation

        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "SupportAnnotationUsage"
            }
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۥ:LYue/ۥ۠ۡۦۢ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۡۦۢ;->ۥ۟۟۟۟(F)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟ۡ(I)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۨ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationAt(I)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۨ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟ۢ(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    sget-boolean v0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢۧ:Z

    if-eqz v0, :cond_0

    new-instance v0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;

    invoke-direct {v0, p0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۦ;-><init>(LYue/ۥۢۤۦۢ;)V

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۢۤۦۢ$ۥ۟۟۟۠;

    invoke-direct {v0, p0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟۠;-><init>(LYue/ۥۢۤۦۢ;)V

    :goto_0
    iput-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ۠:LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;

    new-instance v0, LYue/ۥۢۤۦۢ$ۥ۟۟۠;

    invoke-direct {v0, p0, p1}, LYue/ۥۢۤۦۢ$ۥ۟۟۠;-><init>(LYue/ۥۢۤۦۢ;Landroid/content/Context;)V

    iput-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {}, LYue/ۥۢۤۤۦ;->ۥ۟۟ۡۢ()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    const/high16 v1, 0x20000

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    new-instance v0, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۢ;

    invoke-direct {v0, p0, p1}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۢ;-><init>(LYue/ۥۢۤۦۢ;Landroid/content/Context;)V

    iput-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡ:Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;)V

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setScrollingTouchSlop(I)V

    invoke-virtual {p0, p1, p2}, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۤ(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iget-object p1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {p2, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0}, LYue/ۥۢۤۦۢ;->ۥ۟۟۟۟()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠۠;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->addOnChildAttachStateChangeListener(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠۠;)V

    new-instance p1, LYue/ۥۡۧۥ۠;

    invoke-direct {p1, p0}, LYue/ۥۡۧۥ۠;-><init>(LYue/ۥۢۤۦۢ;)V

    iput-object p1, p0, LYue/ۥۢۤۦۢ;->ۥۣ۟۟ۡ:LYue/ۥۡۧۥ۠;

    new-instance p2, LYue/ۥ۠ۡۦۢ;

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p2, p0, p1, v0}, LYue/ۥ۠ۡۦۢ;-><init>(LYue/ۥۢۤۦۢ;LYue/ۥۡۧۥ۠;Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object p2, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۥ:LYue/ۥ۠ۡۦۢ;

    new-instance p1, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۨ;

    invoke-direct {p1, p0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۨ;-><init>(LYue/ۥۢۤۦۢ;)V

    iput-object p1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۢ:Landroidx/recyclerview/widget/ۥ۟۟۠ۡ;

    iget-object p2, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/ۥ۟۟۠ۥ;->attachToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    iget-object p1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p2, p0, LYue/ۥۢۤۦۢ;->ۥۣ۟۟ۡ:LYue/ۥۡۧۥ۠;

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۠;)V

    new-instance p1, LYue/ۥ۟ۦۤۧ;

    const/4 p2, 0x3

    invoke-direct {p1, p2}, LYue/ۥ۟ۦۤۧ;-><init>(I)V

    iput-object p1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۤ:LYue/ۥ۟ۦۤۧ;

    iget-object p2, p0, LYue/ۥۢۤۦۢ;->ۥۣ۟۟ۡ:LYue/ۥۡۧۥ۠;

    invoke-virtual {p2, p1}, LYue/ۥۡۧۥ۠;->ۥ۟۟۠۟(LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;)V

    new-instance p1, LYue/ۥۢۤۦۢ$ۥ۟;

    invoke-direct {p1, p0}, LYue/ۥۢۤۦۢ$ۥ۟;-><init>(LYue/ۥۢۤۦۢ;)V

    new-instance p2, LYue/ۥۢۤۦۢ$ۥ۟۟;

    invoke-direct {p2, p0}, LYue/ۥۢۤۦۢ$ۥ۟۟;-><init>(LYue/ۥۢۤۦۢ;)V

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۤ:LYue/ۥ۟ۦۤۧ;

    invoke-virtual {v0, p1}, LYue/ۥ۟ۦۤۧ;->ۥ(LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;)V

    iget-object p1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۤ:LYue/ۥ۟ۦۤۧ;

    invoke-virtual {p1, p2}, LYue/ۥ۟ۦۤۧ;->ۥ(LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;)V

    iget-object p1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ۠:LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;

    iget-object p2, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۤ:LYue/ۥ۟ۦۤۧ;

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, p2, v0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;->ۥ۟۟۟ۢ(LYue/ۥ۟ۦۤۧ;Landroidx/recyclerview/widget/RecyclerView;)V

    iget-object p1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۤ:LYue/ۥ۟ۦۤۧ;

    iget-object p2, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۦۤۧ;

    invoke-virtual {p1, p2}, LYue/ۥ۟ۦۤۧ;->ۥ(LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;)V

    new-instance p1, LYue/ۥۣۡۥۥ;

    iget-object p2, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡ:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {p1, p2}, LYue/ۥۣۡۥۥ;-><init>(Landroidx/recyclerview/widget/LinearLayoutManager;)V

    iput-object p1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۦ:LYue/ۥۣۡۥۥ;

    iget-object p2, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۤ:LYue/ۥ۟ۦۤۧ;

    invoke-virtual {p2, p1}, LYue/ۥ۟ۦۤۧ;->ۥ(LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;)V

    iget-object p1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    const/4 p2, 0x0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Landroid/view/ViewGroup;->attachViewToParent(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public ۥۣ۟۟۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->invalidateItemDecorations()V

    return-void
.end method

.method public ۥ۟۟۟ۤ()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۥ:LYue/ۥ۠ۡۦۢ;

    invoke-virtual {v0}, LYue/ۥ۠ۡۦۢ;->ۥ۟۟۟۠()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۥ()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡ:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public ۥ۟۟۟ۦ()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ:Z

    return v0
.end method

.method public final ۥ۟۟۟ۧ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$\u06e5\u06df\u06df\u06df\u06e1<",
            "*>;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۨ:Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۟;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;->registerAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۟;)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟ۨ(LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;)V
    .locals 1
    .param p1    # LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۦۤۧ;

    invoke-virtual {v0, p1}, LYue/ۥ۟ۦۤۧ;->ۥ(LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;)V

    return-void
.end method

.method public ۥ۟۟۠(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۨ;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۨ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->removeItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۨ;)V

    return-void
.end method

.method public ۥ۟۟۠۟(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->removeItemDecorationAt(I)V

    return-void
.end method

.method public ۥ۟۟۠۠()V
    .locals 5

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۦ:LYue/ۥۣۡۥۥ;

    invoke-virtual {v0}, LYue/ۥۣۡۥۥ;->ۥ()LYue/ۥۢۤۦۢ$ۥ۟۟۟ۧ;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥۣ۟۟ۡ:LYue/ۥۡۧۥ۠;

    invoke-virtual {v0}, LYue/ۥۡۧۥ۠;->ۥ۟۟۟۟()D

    move-result-wide v0

    double-to-int v2, v0

    int-to-double v3, v2

    sub-double/2addr v0, v3

    double-to-float v0, v0

    invoke-virtual {p0}, LYue/ۥۢۤۦۢ;->getPageSize()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget-object v3, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۦ:LYue/ۥۣۡۥۥ;

    invoke-virtual {v3, v2, v0, v1}, LYue/ۥۣۡۥۥ;->onPageScrolled(IFI)V

    return-void
.end method

.method public final ۥ۟۟۠ۡ()V
    .locals 4

    iget v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡ۟:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LYue/ۥۢۤۦۢ;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v2, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡ۠:Landroid/os/Parcelable;

    if-eqz v2, :cond_3

    instance-of v3, v0, LYue/ۥۢ۠۟ۦ;

    if-eqz v3, :cond_2

    move-object v3, v0

    check-cast v3, LYue/ۥۢ۠۟ۦ;

    invoke-interface {v3, v2}, LYue/ۥۢ۠۟ۦ;->ۥ(Landroid/os/Parcelable;)V

    :cond_2
    const/4 v2, 0x0

    iput-object v2, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡ۠:Landroid/os/Parcelable;

    :cond_3
    iget v2, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡ۟:I

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v2, 0x0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۦ:I

    iput v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡ۟:I

    iget-object v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ۠:LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;

    invoke-virtual {v0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;->ۥ۟۟۟ۧ()V

    return-void
.end method

.method public ۥ۟۟۠ۢ(IZ)V
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢۤۦۢ;->ۥ۟۟۟ۤ()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, LYue/ۥۢۤۦۢ;->ۥۣ۟۟۠(IZ)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot change current item when ViewPager2 is fake dragging"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥۣ۟۟۠(IZ)V
    .locals 8

    invoke-virtual {p0}, LYue/ۥۢۤۦۢ;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget p2, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡ۟:I

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡ۟:I

    :cond_0
    return-void

    :cond_1
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;->getItemCount()I

    move-result v2

    if-gtz v2, :cond_2

    return-void

    :cond_2
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iget v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۦ:I

    if-ne p1, v0, :cond_3

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥۣ۟۟ۡ:LYue/ۥۡۧۥ۠;

    invoke-virtual {v0}, LYue/ۥۡۧۥ۠;->ۥۣ۟۟۟()Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    :cond_3
    iget v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۦ:I

    if-ne p1, v0, :cond_4

    if-eqz p2, :cond_4

    return-void

    :cond_4
    int-to-double v0, v0

    iput p1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۦ:I

    iget-object v2, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۢ۠:LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;

    invoke-virtual {v2}, LYue/ۥۢۤۦۢ$ۥ۟۟۟۟;->ۥ۟۟۠۠()V

    iget-object v2, p0, LYue/ۥۢۤۦۢ;->ۥۣ۟۟ۡ:LYue/ۥۡۧۥ۠;

    invoke-virtual {v2}, LYue/ۥۡۧۥ۠;->ۥۣ۟۟۟()Z

    move-result v2

    if-nez v2, :cond_5

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥۣ۟۟ۡ:LYue/ۥۡۧۥ۠;

    invoke-virtual {v0}, LYue/ۥۡۧۥ۠;->ۥ۟۟۟۟()D

    move-result-wide v0

    :cond_5
    iget-object v2, p0, LYue/ۥۢۤۦۢ;->ۥۣ۟۟ۡ:LYue/ۥۡۧۥ۠;

    invoke-virtual {v2, p1, p2}, LYue/ۥۡۧۥ۠;->ۥ۟۟۟ۨ(IZ)V

    if-nez p2, :cond_6

    iget-object p2, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    return-void

    :cond_6
    int-to-double v2, p1

    sub-double v4, v2, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    cmpl-double p2, v4, v6

    if-lez p2, :cond_8

    iget-object p2, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    cmpl-double v0, v2, v0

    if-lez v0, :cond_7

    add-int/lit8 v0, p1, -0x3

    goto :goto_0

    :cond_7
    add-int/lit8 v0, p1, 0x3

    :goto_0
    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    iget-object p2, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, LYue/ۥۢۤۦۢ$ۥ۟۟۠ۡ;

    invoke-direct {v0, p1, p2}, LYue/ۥۢۤۦۢ$ۥ۟۟۠ۡ;-><init>(ILandroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :cond_8
    iget-object p2, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    :goto_1
    return-void
.end method

.method public final ۥ۟۟۠ۤ(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 8

    sget-object v0, LYue/ۥۡۥۧۧ$ۥ۟۟۟ۤ;->ۥۣ۟۟ۥ:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_0

    sget-object v3, LYue/ۥۡۥۧۧ$ۥ۟۟۟ۤ;->ۥۣ۟۟ۥ:[I

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, v0

    invoke-static/range {v1 .. v7}, LYue/ۥۢۤۦۡ;->ۥ(LYue/ۥۢۤۦۢ;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    :cond_0
    :try_start_0
    sget p1, LYue/ۥۡۥۧۧ$ۥ۟۟۟ۤ;->ۥۣ۟۟ۦ:I

    const/4 p2, 0x0

    invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    invoke-virtual {p0, p1}, LYue/ۥۢۤۦۢ;->setOrientation(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    throw p1
.end method

.method public ۥ۟۟۠ۥ()V
    .locals 4

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۢ:Landroidx/recyclerview/widget/ۥ۟۟۠ۡ;

    iget-object v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡ:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/ۥ۟۟۠ۡ;->findSnapView(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۢ:Landroidx/recyclerview/widget/ۥ۟۟۠ۡ;

    iget-object v2, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡ:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v1, v2, v0}, Landroidx/recyclerview/widget/ۥ۟۟۠ۡ;->calculateDistanceToFinalSnap(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;Landroid/view/View;)[I

    move-result-object v0

    const/4 v1, 0x0

    aget v1, v0, v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    aget v3, v0, v2

    if-eqz v3, :cond_2

    :cond_1
    iget-object v3, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۡ:Landroidx/recyclerview/widget/RecyclerView;

    aget v0, v0, v2

    invoke-virtual {v3, v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollBy(II)V

    :cond_2
    return-void
.end method

.method public final ۥ۟۟۠ۦ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$\u06e5\u06df\u06df\u06df\u06e1<",
            "*>;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۨ:Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۟;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;->unregisterAdapterDataObserver(Landroidx/recyclerview/widget/RecyclerView$ۥۣ۟۟۟;)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۠ۧ(LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;)V
    .locals 1
    .param p1    # LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۦۤۧ;

    invoke-virtual {v0, p1}, LYue/ۥ۟ۦۤۧ;->ۥ۟(LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;)V

    return-void
.end method

.method public ۥ۟۟۠ۨ()V
    .locals 2

    iget-object v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۢ:Landroidx/recyclerview/widget/ۥ۟۟۠ۡ;

    if-eqz v0, :cond_2

    iget-object v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡ:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/ۥ۟۟۠ۡ;->findSnapView(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡ:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPosition(Landroid/view/View;)I

    move-result v0

    iget v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۦ:I

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, LYue/ۥۢۤۦۢ;->getScrollState()I

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟ۡۤ:LYue/ۥ۟ۦۤۧ;

    invoke-virtual {v1, v0}, LYue/ۥ۟ۦۤۧ;->onPageSelected(I)V

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۢۤۦۢ;->ۥ۟۟۠ۧ:Z

    return-void

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Design assumption violated."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
