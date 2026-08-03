.class public Landroidx/recyclerview/widget/StaggeredGridLayoutManager;
.super Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;
.source "SourceFile"

# interfaces
.implements Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠$ۥ۟;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;,
        Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;,
        Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;,
        Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;,
        Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۠ۨ:Ljava/lang/String; = "StaggeredGridLManager"

.field public static final ۥ۟۟ۡ:Z = false

.field public static final ۥ۟۟ۡ۟:I = 0x0

.field public static final ۥ۟۟ۡ۠:I = 0x1

.field public static final ۥ۟۟ۡۡ:I = 0x0

.field public static final ۥ۟۟ۡۢ:I = 0x1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final ۥۣ۟۟ۡ:I = 0x2

.field public static final ۥ۟۟ۡۤ:I = -0x80000000

.field public static final ۥ۟۟ۡۥ:F = 0.33333334f


# instance fields
.field public ۥ:I

.field public ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

.field public ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public ۥ۟۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public ۥ۟۟۟۟:I

.field public ۥ۟۟۟۠:I

.field public final ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public ۥ۟۟۟ۢ:Z

.field public ۥۣ۟۟۟:Z

.field public ۥ۟۟۟ۤ:Ljava/util/BitSet;

.field public ۥ۟۟۟ۥ:I

.field public ۥ۟۟۟ۦ:I

.field public ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

.field public ۥ۟۟۟ۨ:I

.field public ۥ۟۟۠:Z

.field public ۥ۟۟۠۟:Z

.field public ۥ۟۟۠۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

.field public ۥ۟۟۠ۡ:I

.field public final ۥ۟۟۠ۢ:Landroid/graphics/Rect;

.field public final ۥۣ۟۟۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;

.field public ۥ۟۟۠ۤ:Z

.field public ۥ۟۟۠ۥ:Z

.field public ۥ۟۟۠ۦ:[I

.field public final ۥ۟۟۠ۧ:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(II)V
    .locals 2

    .line 20
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;-><init>()V

    const/4 v0, -0x1

    .line 21
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    const/4 v1, 0x0

    .line 22
    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۢ:Z

    .line 23
    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    .line 24
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۥ:I

    const/high16 v0, -0x80000000

    .line 25
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۦ:I

    .line 26
    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    invoke-direct {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    const/4 v0, 0x2

    .line 27
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۨ:I

    .line 28
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۢ:Landroid/graphics/Rect;

    .line 29
    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;

    .line 30
    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۤ:Z

    const/4 v0, 0x1

    .line 31
    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۥ:Z

    .line 32
    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۧ:Ljava/lang/Runnable;

    .line 33
    iput p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    .line 34
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۨ(I)V

    .line 35
    new-instance p1, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    invoke-direct {p1}, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    .line 36
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۠()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;-><init>()V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۢ:Z

    .line 4
    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    .line 5
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۥ:I

    const/high16 v0, -0x80000000

    .line 6
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۦ:I

    .line 7
    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    invoke-direct {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    const/4 v0, 0x2

    .line 8
    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۨ:I

    .line 9
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۢ:Landroid/graphics/Rect;

    .line 10
    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;

    .line 11
    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۤ:Z

    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۥ:Z

    .line 13
    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۧ:Ljava/lang/Runnable;

    .line 14
    invoke-static {p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getProperties(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠$ۥ۟۟۟;

    move-result-object p1

    .line 15
    iget p2, p1, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠$ۥ۟۟۟;->ۥ:I

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->setOrientation(I)V

    .line 16
    iget p2, p1, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠$ۥ۟۟۟;->ۥ۟:I

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۨ(I)V

    .line 17
    iget-boolean p1, p1, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠$ۥ۟۟۟;->ۥ۟۟:Z

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->setReverseLayout(Z)V

    .line 18
    new-instance p1, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    invoke-direct {p1}, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    .line 19
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۠()V

    return-void
.end method

.method private convertFocusDirectionToLayoutDirection(I)I
    .locals 4

    const/4 v0, -0x1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_b

    const/4 v2, 0x2

    if-eq p1, v2, :cond_8

    const/16 v2, 0x11

    const/high16 v3, -0x80000000

    if-eq p1, v2, :cond_6

    const/16 v2, 0x21

    if-eq p1, v2, :cond_4

    const/16 v0, 0x42

    if-eq p1, v0, :cond_2

    const/16 v0, 0x82

    if-eq p1, v0, :cond_0

    return v3

    :cond_0
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    if-ne p1, v1, :cond_1

    goto :goto_0

    :cond_1
    move v1, v3

    :goto_0
    return v1

    :cond_2
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    move v1, v3

    :goto_1
    return v1

    :cond_4
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    move v0, v3

    :goto_2
    return v0

    :cond_6
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    if-nez p1, :cond_7

    goto :goto_3

    :cond_7
    move v0, v3

    :goto_3
    return v0

    :cond_8
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    if-ne p1, v1, :cond_9

    return v1

    :cond_9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->isLayoutRTL()Z

    move-result p1

    if-eqz p1, :cond_a

    return v0

    :cond_a
    return v1

    :cond_b
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    if-ne p1, v1, :cond_c

    return v0

    :cond_c
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->isLayoutRTL()Z

    move-result p1

    if-eqz p1, :cond_d

    return v1

    :cond_d
    return v0
.end method

.method private ۥ۟۟۠(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I
    .locals 6

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۥ:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۨ(Z)Landroid/view/View;

    move-result-object v2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۥ:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۧ(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۥ:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v5}, Landroidx/recyclerview/widget/ۥۣ۟۟۠;->ۥ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;Landroidx/recyclerview/widget/ۥ۟۟۠۠;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;Z)I

    move-result p1

    return p1
.end method

.method private ۥ۟۟۠۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I
    .locals 7

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۥ:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۨ(Z)Landroid/view/View;

    move-result-object v2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۥ:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۧ(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۥ:Z

    iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v6}, Landroidx/recyclerview/widget/ۥۣ۟۟۠;->ۥ۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;Landroidx/recyclerview/widget/ۥ۟۟۠۠;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;ZZ)I

    move-result p1

    return p1
.end method

.method private ۥ۟۟۠۠(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I
    .locals 6

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۥ:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۨ(Z)Landroid/view/View;

    move-result-object v2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۥ:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۧ(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۥ:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v5}, Landroidx/recyclerview/widget/ۥۣ۟۟۠;->ۥ۟۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;Landroidx/recyclerview/widget/ۥ۟۟۠۠;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;Z)I

    move-result p1

    return p1
.end method

.method private ۥ۟۟ۢۦ(Landroid/view/View;IIZ)V
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۢ:Landroid/graphics/Rect;

    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->calculateItemDecorationsForChild(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۢ:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v2, v2, Landroid/graphics/Rect;->right:I

    add-int/2addr v3, v2

    invoke-virtual {p0, p2, v1, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۤۥ(III)I

    move-result p2

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۢ:Landroid/graphics/Rect;

    iget v3, v2, Landroid/graphics/Rect;->top:I

    add-int/2addr v1, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v3, v2

    invoke-virtual {p0, p3, v1, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۤۥ(III)I

    move-result p3

    if-eqz p4, :cond_0

    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->shouldReMeasureChild(Landroid/view/View;IILandroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠۟;)Z

    move-result p4

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->shouldMeasureChild(Landroid/view/View;IILandroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠۟;)Z

    move-result p4

    :goto_0
    if-eqz p4, :cond_1

    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    :cond_1
    return-void
.end method

.method private ۥۣ۟۟ۥ()V
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->isLayoutRTL()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۢ:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    goto :goto_1

    :cond_1
    :goto_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۢ:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    :goto_1
    return-void
.end method


# virtual methods
.method public assertNotInLayoutOrScroll(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public canScrollHorizontally()Z
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public canScrollVertically()Z
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public checkLayoutParams(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠۟;)Z
    .locals 0

    instance-of p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;

    return p1
.end method

.method public collectAdjacentPrefetchPositions(IILandroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠$ۥ۟۟;)V
    .locals 4
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildCount()I

    move-result p2

    if-eqz p2, :cond_7

    if-nez p1, :cond_1

    goto/16 :goto_5

    :cond_1
    invoke-virtual {p0, p1, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟(ILandroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)V

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۦ:[I

    if-eqz p1, :cond_2

    array-length p1, p1

    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge p1, p2, :cond_3

    :cond_2
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    new-array p1, p1, [I

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۦ:[I

    :cond_3
    const/4 p1, 0x0

    move p2, p1

    move v0, p2

    :goto_1
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge p2, v1, :cond_6

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    iget v2, v1, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_4

    iget v1, v1, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟۠:I

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v2, v2, p2

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠ۤ(I)I

    move-result v2

    :goto_2
    sub-int/2addr v1, v2

    goto :goto_3

    :cond_4
    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v2, v2, p2

    iget v1, v1, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟ۡ:I

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠۠(I)I

    move-result v1

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    iget v2, v2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟ۡ:I

    goto :goto_2

    :goto_3
    if-ltz v1, :cond_5

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۦ:[I

    aput v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    :cond_5
    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_6
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۦ:[I

    invoke-static {p2, p1, v0}, Ljava/util/Arrays;->sort([III)V

    :goto_4
    if-ge p1, v0, :cond_7

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)Z

    move-result p2

    if-eqz p2, :cond_7

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    iget p2, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟:I

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۦ:[I

    aget v1, v1, p1

    invoke-interface {p4, p2, v1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠$ۥ۟۟;->ۥ(II)V

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    iget v1, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟:I

    iget v2, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟:I

    add-int/2addr v1, v2

    iput v1, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟:I

    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    :cond_7
    :goto_5
    return-void
.end method

.method public computeHorizontalScrollExtent(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I
    .locals 0

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I

    move-result p1

    return p1
.end method

.method public computeHorizontalScrollOffset(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I
    .locals 0

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I

    move-result p1

    return p1
.end method

.method public computeHorizontalScrollRange(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I
    .locals 0

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۠(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I

    move-result p1

    return p1
.end method

.method public computeScrollVectorForPosition(I)Landroid/graphics/PointF;
    .locals 3

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۦ(I)I

    move-result p1

    new-instance v0, Landroid/graphics/PointF;

    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    const/4 v2, 0x0

    if-nez v1, :cond_1

    int-to-float p1, p1

    iput p1, v0, Landroid/graphics/PointF;->x:F

    iput v2, v0, Landroid/graphics/PointF;->y:F

    goto :goto_0

    :cond_1
    iput v2, v0, Landroid/graphics/PointF;->x:F

    int-to-float p1, p1

    iput p1, v0, Landroid/graphics/PointF;->y:F

    :goto_0
    return-object v0
.end method

.method public computeVerticalScrollExtent(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I
    .locals 0

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I

    move-result p1

    return p1
.end method

.method public computeVerticalScrollOffset(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I
    .locals 0

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I

    move-result p1

    return p1
.end method

.method public computeVerticalScrollRange(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I
    .locals 0

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۠(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I

    move-result p1

    return p1
.end method

.method public generateDefaultLayoutParams()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠۟;
    .locals 3

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    const/4 v1, -0x1

    const/4 v2, -0x2

    if-nez v0, :cond_0

    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;

    invoke-direct {v0, v2, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;-><init>(II)V

    return-object v0

    :cond_0
    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;

    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;-><init>(II)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠۟;
    .locals 1

    .line 1
    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;

    invoke-direct {v0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠۟;
    .locals 1

    .line 2
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    .line 4
    :cond_0
    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public getColumnCountForAccessibility(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getColumnCountForAccessibility(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I

    move-result p1

    return p1
.end method

.method public getOrientation()I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    return v0
.end method

.method public getReverseLayout()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۢ:Z

    return v0
.end method

.method public getRowCountForAccessibility(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    if-nez v0, :cond_0

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getRowCountForAccessibility(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I

    move-result p1

    return p1
.end method

.method public isAutoMeasureEnabled()Z
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۨ:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isLayoutRTL()Z
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public offsetChildrenHorizontal(I)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->offsetChildrenHorizontal(I)V

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠ۦ(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public offsetChildrenVertical(I)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->offsetChildrenVertical(I)V

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠ۦ(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->onDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;)V

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۧ:Ljava/lang/Runnable;

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 p2, 0x0

    :goto_0
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge p2, v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v0, v0, p2

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟۟()V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    return-void
.end method

.method public onFocusSearchFailed(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)Landroid/view/View;
    .locals 8
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->findContainingItemView(Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v1

    :cond_1
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۥ()V

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->convertFocusDirectionToLayoutDirection(I)I

    move-result p2

    const/high16 v0, -0x80000000

    if-ne p2, v0, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;

    iget-boolean v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۠:Z

    iget-object v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۟:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    const/4 v3, 0x1

    if-ne p2, v3, :cond_3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۡۧ()I

    move-result v4

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۡۥ()I

    move-result v4

    :goto_0
    invoke-virtual {p0, v4, p4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۤۢ(ILandroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)V

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۧ(I)V

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    iget v6, v5, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟:I

    add-int/2addr v6, v4

    iput v6, v5, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟:I

    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v6}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۠()I

    move-result v6

    int-to-float v6, v6

    const v7, 0x3eaaaaab

    mul-float/2addr v6, v7

    float-to-int v6, v6

    iput v6, v5, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟:I

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    iput-boolean v3, v5, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟ۢ:Z

    const/4 v6, 0x0

    iput-boolean v6, v5, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ:Z

    invoke-virtual {p0, p3, v5, p4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۤ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I

    iget-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    iput-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠:Z

    if-nez v2, :cond_4

    invoke-virtual {v0, v4, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠ۡ(II)Landroid/view/View;

    move-result-object p3

    if-eqz p3, :cond_4

    if-eq p3, p1, :cond_4

    return-object p3

    :cond_4
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟(I)Z

    move-result p3

    if-eqz p3, :cond_6

    iget p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    sub-int/2addr p3, v3

    :goto_1
    if-ltz p3, :cond_8

    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object p4, p4, p3

    invoke-virtual {p4, v4, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠ۡ(II)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_5

    if-eq p4, p1, :cond_5

    return-object p4

    :cond_5
    add-int/lit8 p3, p3, -0x1

    goto :goto_1

    :cond_6
    move p3, v6

    :goto_2
    iget p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge p3, p4, :cond_8

    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object p4, p4, p3

    invoke-virtual {p4, v4, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠ۡ(II)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_7

    if-eq p4, p1, :cond_7

    return-object p4

    :cond_7
    add-int/lit8 p3, p3, 0x1

    goto :goto_2

    :cond_8
    iget-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۢ:Z

    xor-int/2addr p3, v3

    const/4 p4, -0x1

    if-ne p2, p4, :cond_9

    move p4, v3

    goto :goto_3

    :cond_9
    move p4, v6

    :goto_3
    if-ne p3, p4, :cond_a

    move p3, v3

    goto :goto_4

    :cond_a
    move p3, v6

    :goto_4
    if-nez v2, :cond_c

    if-eqz p3, :cond_b

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟ۡ()I

    move-result p4

    goto :goto_5

    :cond_b
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟ۤ()I

    move-result p4

    :goto_5
    invoke-virtual {p0, p4}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->findViewByPosition(I)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_c

    if-eq p4, p1, :cond_c

    return-object p4

    :cond_c
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟(I)Z

    move-result p2

    if-eqz p2, :cond_10

    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    sub-int/2addr p2, v3

    :goto_6
    if-ltz p2, :cond_13

    iget p4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟۟:I

    if-ne p2, p4, :cond_d

    goto :goto_8

    :cond_d
    if-eqz p3, :cond_e

    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object p4, p4, p2

    invoke-virtual {p4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟ۡ()I

    move-result p4

    goto :goto_7

    :cond_e
    iget-object p4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object p4, p4, p2

    invoke-virtual {p4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟ۤ()I

    move-result p4

    :goto_7
    invoke-virtual {p0, p4}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->findViewByPosition(I)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_f

    if-eq p4, p1, :cond_f

    return-object p4

    :cond_f
    :goto_8
    add-int/lit8 p2, p2, -0x1

    goto :goto_6

    :cond_10
    :goto_9
    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v6, p2, :cond_13

    if-eqz p3, :cond_11

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object p2, p2, v6

    invoke-virtual {p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟ۡ()I

    move-result p2

    goto :goto_a

    :cond_11
    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object p2, p2, v6

    invoke-virtual {p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟ۤ()I

    move-result p2

    :goto_a
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->findViewByPosition(I)Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_12

    if-eq p2, p1, :cond_12

    return-object p2

    :cond_12
    add-int/lit8 v6, v6, 0x1

    goto :goto_9

    :cond_13
    return-object v1
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildCount()I

    move-result v0

    if-lez v0, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۨ(Z)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۧ(Z)Landroid/view/View;

    move-result-object v0

    if-eqz v1, :cond_2

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPosition(Landroid/view/View;)I

    move-result v1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPosition(Landroid/view/View;)I

    move-result v0

    if-ge v1, v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    nop

    :cond_2
    :goto_0
    return-void
.end method

.method public onInitializeAccessibilityNodeInfoForItem(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;Landroid/view/View;LYue/ۥ۟۟ۥۧ;)V
    .locals 6

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    instance-of p2, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;

    if-nez p2, :cond_0

    invoke-super {p0, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->onInitializeAccessibilityNodeInfoForItem(Landroid/view/View;LYue/ۥ۟۟ۥۧ;)V

    return-void

    :cond_0
    check-cast p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;

    iget p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    const/4 p3, 0x1

    if-nez p2, :cond_2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟ۢ()I

    move-result v0

    iget-boolean p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۠:Z

    if-eqz p1, :cond_1

    iget p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    :cond_1
    move v1, p3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-static/range {v0 .. v5}, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۤ(IIIIZZ)LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;

    move-result-object p1

    invoke-virtual {p4, p1}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠۟۠(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟ۢ()I

    move-result v2

    iget-boolean p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۠:Z

    if-eqz p1, :cond_3

    iget p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    :cond_3
    move v3, p3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-static/range {v0 .. v5}, LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۤ(IIIIZZ)LYue/ۥ۟۟ۥۧ$ۥ۟۟۟ۡ;

    move-result-object p1

    invoke-virtual {p4, p1}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠۟۠(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public onItemsAdded(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    const/4 p1, 0x1

    invoke-virtual {p0, p2, p3, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۢ(III)V

    return-void
.end method

.method public onItemsChanged(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;->ۥ۟()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->requestLayout()V

    return-void
.end method

.method public onItemsMoved(Landroidx/recyclerview/widget/RecyclerView;III)V
    .locals 0

    const/16 p1, 0x8

    invoke-virtual {p0, p2, p3, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۢ(III)V

    return-void
.end method

.method public onItemsRemoved(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    const/4 p1, 0x2

    invoke-virtual {p0, p2, p3, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۢ(III)V

    return-void
.end method

.method public onItemsUpdated(Landroidx/recyclerview/widget/RecyclerView;IILjava/lang/Object;)V
    .locals 0

    const/4 p1, 0x4

    invoke-virtual {p0, p2, p3, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۢ(III)V

    return-void
.end method

.method public onLayoutChildren(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۢۨ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;Z)V

    return-void
.end method

.method public onLayoutCompleted(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->onLayoutCompleted(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)V

    const/4 p1, -0x1

    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۥ:I

    const/high16 p1, -0x80000000

    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۦ:I

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟()V

    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->requestLayout()V

    :cond_0
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

    if-eqz v0, :cond_0

    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;)V

    return-object v0

    :cond_0
    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

    invoke-direct {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;-><init>()V

    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۢ:Z

    iput-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟ۡ۟:Z

    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠:Z

    iput-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟ۡ۠:Z

    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۟:Z

    iput-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟ۡۡ:Z

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v3, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;->ۥ:[I

    if-eqz v3, :cond_1

    iput-object v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟۠ۨ:[I

    array-length v3, v3

    iput v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟۠ۧ:I

    iget-object v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;->ۥ۟:Ljava/util/List;

    iput-object v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟ۡ:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟۠ۧ:I

    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildCount()I

    move-result v1

    if-lez v1, :cond_5

    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠:Z

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۡۧ()I

    move-result v1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۡۥ()I

    move-result v1

    :goto_1
    iput v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥۣ۟۟۠:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۡ()I

    move-result v1

    iput v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:I

    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    iput v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟۠ۥ:I

    new-array v1, v1, [I

    iput-object v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟۠ۦ:[I

    :goto_2
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v2, v1, :cond_6

    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠:Z

    const/high16 v3, -0x80000000

    if-eqz v1, :cond_3

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v1, v1, v2

    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠۠(I)I

    move-result v1

    if-eq v1, v3, :cond_4

    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥۣ۟۟۟()I

    move-result v3

    :goto_3
    sub-int/2addr v1, v3

    goto :goto_4

    :cond_3
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v1, v1, v2

    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠ۤ(I)I

    move-result v1

    if-eq v1, v3, :cond_4

    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۨ()I

    move-result v3

    goto :goto_3

    :cond_4
    :goto_4
    iget-object v3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟۠ۦ:[I

    aput v1, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    const/4 v1, -0x1

    iput v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥۣ۟۟۠:I

    iput v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:I

    iput v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟۠ۥ:I

    :cond_6
    return-object v0
.end method

.method public onScrollStateChanged(I)V
    .locals 0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ()Z

    :cond_0
    return-void
.end method

.method public scrollBy(ILandroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, p1, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟(ILandroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    invoke-virtual {p0, p2, v0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۤ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I

    move-result p3

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    iget v0, v0, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟:I

    if-ge v0, p3, :cond_1

    goto :goto_0

    :cond_1
    if-gez p1, :cond_2

    neg-int p1, p3

    goto :goto_0

    :cond_2
    move p1, p3

    :goto_0
    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    neg-int v0, p1

    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥۣ۟۟۠(I)V

    iget-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    iput-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠:Z

    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    iput v1, p3, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟:I

    invoke-virtual {p0, p2, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۡ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;)V

    return p1

    :cond_3
    :goto_1
    return v1
.end method

.method public scrollHorizontallyBy(ILandroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->scrollBy(ILandroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I

    move-result p1

    return p1
.end method

.method public scrollToPosition(I)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

    if-eqz v0, :cond_0

    iget v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥۣ۟۟۠:I

    if-eq v1, p1, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ()V

    :cond_0
    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۥ:I

    const/high16 p1, -0x80000000

    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۦ:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->requestLayout()V

    return-void
.end method

.method public scrollToPositionWithOffset(II)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ()V

    :cond_0
    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۥ:I

    iput p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۦ:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->requestLayout()V

    return-void
.end method

.method public scrollVerticallyBy(ILandroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->scrollBy(ILandroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I

    move-result p1

    return p1
.end method

.method public setMeasuredDimension(Landroid/graphics/Rect;II)V
    .locals 4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPaddingBottom()I

    move-result v2

    add-int/2addr v1, v2

    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    add-int/2addr p1, v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getMinimumHeight()I

    move-result v1

    invoke-static {p3, p1, v1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->chooseSize(III)I

    move-result p1

    iget p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۠:I

    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    mul-int/2addr p3, v1

    add-int/2addr p3, v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getMinimumWidth()I

    move-result v0

    invoke-static {p2, p3, v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->chooseSize(III)I

    move-result p2

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result p1

    add-int/2addr p1, v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getMinimumWidth()I

    move-result v0

    invoke-static {p2, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->chooseSize(III)I

    move-result p2

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۠:I

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    mul-int/2addr p1, v0

    add-int/2addr p1, v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getMinimumHeight()I

    move-result v0

    invoke-static {p3, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->chooseSize(III)I

    move-result p1

    :goto_0
    invoke-virtual {p0, p2, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->setMeasuredDimension(II)V

    return-void
.end method

.method public setOrientation(I)V
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "invalid orientation."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    if-ne p1, v0, :cond_2

    return-void

    :cond_2
    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->requestLayout()V

    return-void
.end method

.method public setReverseLayout(Z)V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

    if-eqz v0, :cond_0

    iget-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟ۡ۟:Z

    if-eq v1, p1, :cond_0

    iput-boolean p1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟ۡ۟:Z

    :cond_0
    iput-boolean p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۢ:Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->requestLayout()V

    return-void
.end method

.method public smoothScrollToPosition(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;I)V
    .locals 0

    new-instance p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۧ;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Landroidx/recyclerview/widget/ۥ۟۟۟ۧ;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠;->setTargetPosition(I)V

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->startSmoothScroll(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡ۠;)V

    return-void
.end method

.method public supportsPredictiveItemAnimations()Z
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۥ۟۟۟ۡ(Landroid/view/View;)V
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ(Landroid/view/View;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۥ۟۟۟ۢ(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;)V
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

    iget v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟۠ۥ:I

    if-lez v1, :cond_3

    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ne v1, v2, :cond_2

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v0, v1, :cond_3

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟۟()V

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

    iget-object v2, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟۠ۦ:[I

    aget v2, v2, v0

    const/high16 v3, -0x80000000

    if-eq v2, v3, :cond_1

    iget-boolean v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟ۡ۠:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥۣ۟۟۟()I

    move-result v1

    :goto_1
    add-int/2addr v2, v1

    goto :goto_2

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۨ()I

    move-result v1

    goto :goto_1

    :cond_1
    :goto_2
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v1, v1, v0

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟ۡ۟(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟()V

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

    iget v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:I

    iput v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥۣ۟۟۠:I

    :cond_3
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

    iget-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟ۡۡ:Z

    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۟:Z

    iget-boolean v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟ۡ۟:Z

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->setReverseLayout(Z)V

    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۥ()V

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

    iget v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥۣ۟۟۠:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_4

    iput v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۥ:I

    iget-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟ۡ۠:Z

    iput-boolean v1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟:Z

    goto :goto_3

    :cond_4
    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    iput-boolean v1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟:Z

    :goto_3
    iget p1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟۠ۧ:I

    const/4 v1, 0x1

    if-le p1, v1, :cond_5

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    iget-object v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟۠ۨ:[I

    iput-object v1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;->ۥ:[I

    iget-object v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟ۡ:Ljava/util/List;

    iput-object v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;->ۥ۟:Ljava/util/List;

    :cond_5
    return-void
.end method

.method public ۥۣ۟۟۟()Z
    .locals 6

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    const/high16 v2, -0x80000000

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠۠(I)I

    move-result v0

    const/4 v3, 0x1

    move v4, v3

    :goto_0
    iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v4, v5, :cond_1

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v5, v5, v4

    invoke-virtual {v5, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠۠(I)I

    move-result v5

    if-eq v5, v0, :cond_0

    return v1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return v3
.end method

.method public ۥ۟۟۟ۤ()Z
    .locals 6

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    const/high16 v2, -0x80000000

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠ۤ(I)I

    move-result v0

    const/4 v3, 0x1

    move v4, v3

    :goto_0
    iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v4, v5, :cond_1

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v5, v5, v4

    invoke-virtual {v5, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠ۤ(I)I

    move-result v5

    if-eq v5, v0, :cond_0

    return v1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return v3
.end method

.method public final ۥ۟۟۟ۥ(Landroid/view/View;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;)V
    .locals 1

    iget p3, p3, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟۟:I

    const/4 v0, 0x1

    if-ne p3, v0, :cond_1

    iget-boolean p3, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۠:Z

    if-eqz p3, :cond_0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    iget-object p2, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۟:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    iget-boolean p3, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۠:Z

    if-eqz p3, :cond_2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۠(Landroid/view/View;)V

    goto :goto_0

    :cond_2
    iget-object p2, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۟:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟ۡ(Landroid/view/View;)V

    :goto_0
    return-void
.end method

.method public final ۥ۟۟۟ۦ(I)I
    .locals 3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildCount()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-nez v0, :cond_1

    iget-boolean p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    if-eqz p1, :cond_0

    move v1, v2

    :cond_0
    return v1

    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۡۥ()I

    move-result v0

    if-ge p1, v0, :cond_2

    move p1, v2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    if-eq p1, v0, :cond_3

    goto :goto_1

    :cond_3
    move v1, v2

    :goto_1
    return v1
.end method

.method public ۥ۟۟۟ۧ()Z
    .locals 7

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۨ:I

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۡۧ()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۡۥ()I

    move-result v2

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۡۥ()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۡۧ()I

    move-result v2

    :goto_0
    const/4 v3, 0x1

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۢۤ()Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_2

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;->ۥ۟()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->requestSimpleAnimationsInNextLayout()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->requestLayout()V

    return v3

    :cond_2
    iget-boolean v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۤ:Z

    if-nez v4, :cond_3

    return v1

    :cond_3
    iget-boolean v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    const/4 v5, -0x1

    if-eqz v4, :cond_4

    move v4, v5

    goto :goto_1

    :cond_4
    move v4, v3

    :goto_1
    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    add-int/2addr v2, v3

    invoke-virtual {v6, v0, v2, v4, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;->ۥ۟۟۟۟(IIIZ)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;

    move-result-object v6

    if-nez v6, :cond_5

    iput-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۤ:Z

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;->ۥ۟۟۟(I)I

    return v1

    :cond_5
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    iget v2, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;->ۥۣ۟۟۠:I

    mul-int/2addr v4, v5

    invoke-virtual {v1, v0, v2, v4, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;->ۥ۟۟۟۟(IIIZ)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;

    move-result-object v0

    if-nez v0, :cond_6

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    iget v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;->ۥۣ۟۟۠:I

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;->ۥ۟۟۟(I)I

    goto :goto_2

    :cond_6
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    iget v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;->ۥۣ۟۟۠:I

    add-int/2addr v0, v3

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;->ۥ۟۟۟(I)I

    :goto_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->requestSimpleAnimationsInNextLayout()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->requestLayout()V

    return v3

    :cond_7
    :goto_3
    return v1
.end method

.method public final ۥ۟۟۟ۨ(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;)Z
    .locals 3

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠۟()I

    move-result v0

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥۣ۟۟۟()I

    move-result v2

    if-ge v0, v2, :cond_1

    iget-object v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠ۢ(Landroid/view/View;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;

    move-result-object p1

    iget-boolean p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۠:Z

    xor-int/lit8 p1, p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥۣ۟۟۠()I

    move-result v0

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۨ()I

    move-result v2

    if-le v0, v2, :cond_1

    iget-object v0, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠ۢ(Landroid/view/View;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;

    move-result-object p1

    iget-boolean p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۠:Z

    xor-int/lit8 p1, p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final ۥ۟۟۠ۡ(I)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;
    .locals 4

    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;

    invoke-direct {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;-><init>()V

    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    new-array v1, v1, [I

    iput-object v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;->ۥ۟۟۠ۥ:[I

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v1, v2, :cond_0

    iget-object v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;->ۥ۟۟۠ۥ:[I

    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v3, v3, v1

    invoke-virtual {v3, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠۠(I)I

    move-result v3

    sub-int v3, p1, v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ۥ۟۟۠ۢ(I)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;
    .locals 4

    new-instance v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;

    invoke-direct {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;-><init>()V

    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    new-array v1, v1, [I

    iput-object v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;->ۥ۟۟۠ۥ:[I

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v1, v2, :cond_0

    iget-object v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;->ۥ۟۟۠ۥ:[I

    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v3, v3, v1

    invoke-virtual {v3, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠ۤ(I)I

    move-result v3

    sub-int/2addr v3, p1

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ۥۣ۟۟۠()V
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    invoke-static {p0, v0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;I)Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    move-result-object v0

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    rsub-int/lit8 v0, v0, 0x1

    invoke-static {p0, v0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;I)Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    move-result-object v0

    iput-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    return-void
.end method

.method public final ۥ۟۟۠ۤ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I
    .locals 16

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۤ:Ljava/util/BitSet;

    iget v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-virtual {v0, v9, v1, v10}, Ljava/util/BitSet;->set(IIZ)V

    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    iget-boolean v0, v0, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥۣ۟۟۟:Z

    if-eqz v0, :cond_1

    iget v0, v8, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟۟:I

    if-ne v0, v10, :cond_0

    const v0, 0x7fffffff

    :goto_0
    move v11, v0

    goto :goto_1

    :cond_0
    const/high16 v0, -0x80000000

    goto :goto_0

    :cond_1
    iget v0, v8, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟۟:I

    if-ne v0, v10, :cond_2

    iget v0, v8, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟ۡ:I

    iget v1, v8, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟:I

    add-int/2addr v0, v1

    goto :goto_0

    :cond_2
    iget v0, v8, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟۠:I

    iget v1, v8, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟:I

    sub-int/2addr v0, v1

    goto :goto_0

    :goto_1
    iget v0, v8, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟۟:I

    invoke-virtual {v6, v0, v11}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۤ(II)V

    iget-boolean v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    if-eqz v0, :cond_3

    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥۣ۟۟۟()I

    move-result v0

    :goto_2
    move v12, v0

    goto :goto_3

    :cond_3
    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۨ()I

    move-result v0

    goto :goto_2

    :goto_3
    move v0, v9

    :goto_4
    invoke-virtual/range {p2 .. p3}, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)Z

    move-result v1

    const/4 v2, -0x1

    if-eqz v1, :cond_4

    iget-object v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    iget-boolean v1, v1, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥۣ۟۟۟:Z

    if-nez v1, :cond_5

    iget-object v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۤ:Ljava/util/BitSet;

    invoke-virtual {v1}, Ljava/util/BitSet;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_5

    :cond_4
    move v3, v9

    goto/16 :goto_17

    :cond_5
    :goto_5
    invoke-virtual {v8, v7}, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;)Landroid/view/View;

    move-result-object v13

    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;

    invoke-virtual {v14}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠۟;->ۥ۟()I

    move-result v0

    iget-object v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;->ۥ۟۟۟ۡ(I)I

    move-result v1

    if-ne v1, v2, :cond_6

    move v3, v10

    goto :goto_6

    :cond_6
    move v3, v9

    :goto_6
    if-eqz v3, :cond_8

    iget-boolean v1, v14, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۠:Z

    if-eqz v1, :cond_7

    iget-object v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v1, v1, v9

    goto :goto_7

    :cond_7
    invoke-virtual {v6, v8}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۢۡ(Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    move-result-object v1

    :goto_7
    iget-object v4, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    invoke-virtual {v4, v0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;->ۥ۟۟۟ۨ(ILandroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;)V

    :goto_8
    move-object v15, v1

    goto :goto_9

    :cond_8
    iget-object v4, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v1, v4, v1

    goto :goto_8

    :goto_9
    iput-object v15, v14, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۟:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    iget v1, v8, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟۟:I

    if-ne v1, v10, :cond_9

    invoke-virtual {v6, v13}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->addView(Landroid/view/View;)V

    goto :goto_a

    :cond_9
    invoke-virtual {v6, v13, v9}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->addView(Landroid/view/View;I)V

    :goto_a
    invoke-virtual {v6, v13, v14, v9}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۢۧ(Landroid/view/View;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;Z)V

    iget v1, v8, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟۟:I

    if-ne v1, v10, :cond_c

    iget-boolean v1, v14, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۠:Z

    if-eqz v1, :cond_a

    invoke-virtual {v6, v12}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۡۨ(I)I

    move-result v1

    goto :goto_b

    :cond_a
    invoke-virtual {v15, v12}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠۠(I)I

    move-result v1

    :goto_b
    iget-object v4, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v4, v13}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟۟(Landroid/view/View;)I

    move-result v4

    add-int/2addr v4, v1

    if-eqz v3, :cond_b

    iget-boolean v5, v14, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۠:Z

    if-eqz v5, :cond_b

    invoke-virtual {v6, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۡ(I)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;

    move-result-object v5

    iput v2, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;->ۥ۟۟۠ۤ:I

    iput v0, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;->ۥۣ۟۟۠:I

    iget-object v9, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    invoke-virtual {v9, v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;->ۥ(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;)V

    :cond_b
    move v5, v4

    move v4, v1

    goto :goto_d

    :cond_c
    iget-boolean v1, v14, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۠:Z

    if-eqz v1, :cond_d

    invoke-virtual {v6, v12}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۢ۠(I)I

    move-result v1

    goto :goto_c

    :cond_d
    invoke-virtual {v15, v12}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠ۤ(I)I

    move-result v1

    :goto_c
    iget-object v4, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v4, v13}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟۟(Landroid/view/View;)I

    move-result v4

    sub-int v4, v1, v4

    if-eqz v3, :cond_e

    iget-boolean v5, v14, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۠:Z

    if-eqz v5, :cond_e

    invoke-virtual {v6, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۢ(I)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;

    move-result-object v5

    iput v10, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;->ۥ۟۟۠ۤ:I

    iput v0, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;->ۥۣ۟۟۠:I

    iget-object v9, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    invoke-virtual {v9, v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;->ۥ(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;)V

    :cond_e
    move v5, v1

    :goto_d
    iget-boolean v1, v14, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۠:Z

    if-eqz v1, :cond_12

    iget v1, v8, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟:I

    if-ne v1, v2, :cond_12

    if-eqz v3, :cond_f

    iput-boolean v10, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۤ:Z

    goto :goto_10

    :cond_f
    iget v1, v8, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟۟:I

    if-ne v1, v10, :cond_10

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟()Z

    move-result v1

    :goto_e
    xor-int/2addr v1, v10

    goto :goto_f

    :cond_10
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۤ()Z

    move-result v1

    goto :goto_e

    :goto_f
    if-eqz v1, :cond_12

    iget-object v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;->ۥ۟۟۟۠(I)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;

    move-result-object v0

    if-eqz v0, :cond_11

    iput-boolean v10, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟$ۥ;->ۥ۟۟۠ۦ:Z

    :cond_11
    iput-boolean v10, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۤ:Z

    :cond_12
    :goto_10
    invoke-virtual {v6, v13, v14, v8}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۥ(Landroid/view/View;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;)V

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->isLayoutRTL()Z

    move-result v0

    if-eqz v0, :cond_14

    iget v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    if-ne v0, v10, :cond_14

    iget-boolean v0, v14, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۠:Z

    if-eqz v0, :cond_13

    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥۣ۟۟۟()I

    move-result v0

    goto :goto_11

    :cond_13
    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥۣ۟۟۟()I

    move-result v0

    iget v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    sub-int/2addr v1, v10

    iget v2, v15, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟۟:I

    sub-int/2addr v1, v2

    iget v2, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۠:I

    mul-int/2addr v1, v2

    sub-int/2addr v0, v1

    :goto_11
    iget-object v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v1, v13}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟۟(Landroid/view/View;)I

    move-result v1

    sub-int v1, v0, v1

    move v9, v0

    move v3, v1

    goto :goto_13

    :cond_14
    iget-boolean v0, v14, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۠:Z

    if-eqz v0, :cond_15

    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۨ()I

    move-result v0

    goto :goto_12

    :cond_15
    iget v0, v15, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟۟:I

    iget v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۠:I

    mul-int/2addr v0, v1

    iget-object v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۨ()I

    move-result v1

    add-int/2addr v0, v1

    :goto_12
    iget-object v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v1, v13}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟۟(Landroid/view/View;)I

    move-result v1

    add-int/2addr v1, v0

    move v3, v0

    move v9, v1

    :goto_13
    iget v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    if-ne v0, v10, :cond_16

    move-object/from16 v0, p0

    move-object v1, v13

    move v2, v3

    move v3, v4

    move v4, v9

    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->layoutDecoratedWithMargins(Landroid/view/View;IIII)V

    goto :goto_14

    :cond_16
    move-object/from16 v0, p0

    move-object v1, v13

    move v2, v4

    move v4, v5

    move v5, v9

    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->layoutDecoratedWithMargins(Landroid/view/View;IIII)V

    :goto_14
    iget-boolean v0, v14, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۠:Z

    if-eqz v0, :cond_17

    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    iget v0, v0, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟۟:I

    invoke-virtual {v6, v0, v11}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۤ(II)V

    goto :goto_15

    :cond_17
    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    iget v0, v0, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟۟:I

    invoke-virtual {v6, v15, v0, v11}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۤۤ(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;II)V

    :goto_15
    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    invoke-virtual {v6, v7, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۡ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;)V

    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    iget-boolean v0, v0, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟ۢ:Z

    if-eqz v0, :cond_18

    invoke-virtual {v13}, Landroid/view/View;->hasFocusable()Z

    move-result v0

    if-eqz v0, :cond_18

    iget-boolean v0, v14, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۠:Z

    if-eqz v0, :cond_19

    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۤ:Ljava/util/BitSet;

    invoke-virtual {v0}, Ljava/util/BitSet;->clear()V

    :cond_18
    const/4 v3, 0x0

    goto :goto_16

    :cond_19
    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۤ:Ljava/util/BitSet;

    iget v1, v15, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟۟:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Ljava/util/BitSet;->set(IZ)V

    :goto_16
    move v9, v3

    move v0, v10

    goto/16 :goto_4

    :goto_17
    if-nez v0, :cond_1a

    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    invoke-virtual {v6, v7, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۡ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;)V

    :cond_1a
    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    iget v0, v0, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟۟:I

    if-ne v0, v2, :cond_1b

    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۨ()I

    move-result v0

    invoke-virtual {v6, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۢ۠(I)I

    move-result v0

    iget-object v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۨ()I

    move-result v1

    sub-int/2addr v1, v0

    goto :goto_18

    :cond_1b
    iget-object v0, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥۣ۟۟۟()I

    move-result v0

    invoke-virtual {v6, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۡۨ(I)I

    move-result v0

    iget-object v1, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥۣ۟۟۟()I

    move-result v1

    sub-int v1, v0, v1

    :goto_18
    if-lez v1, :cond_1c

    iget v0, v8, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v9

    goto :goto_19

    :cond_1c
    move v9, v3

    :goto_19
    return v9
.end method

.method public ۥ۟۟۠ۥ([I)[I
    .locals 3

    if-nez p1, :cond_0

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    new-array p1, p1, [I

    goto :goto_0

    :cond_0
    array-length v0, p1

    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-lt v0, v1, :cond_2

    :goto_0
    const/4 v0, 0x0

    :goto_1
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟۠()I

    move-result v1

    aput v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-object p1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Provided int[]\'s size must be more than or equal to span count. Expected:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", array size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟۟۠ۦ(I)I
    .locals 4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPosition(Landroid/view/View;)I

    move-result v3

    if-ltz v3, :cond_0

    if-ge v3, p1, :cond_0

    return v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public ۥ۟۟۠ۧ(Z)Landroid/view/View;
    .locals 7

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۨ()I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥۣ۟۟۟()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x0

    :goto_0
    if-ltz v2, :cond_4

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v5, v4}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۡ(Landroid/view/View;)I

    move-result v5

    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v6, v4}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟(Landroid/view/View;)I

    move-result v6

    if-le v6, v0, :cond_3

    if-lt v5, v1, :cond_0

    goto :goto_2

    :cond_0
    if-le v6, v1, :cond_2

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    if-nez v3, :cond_3

    move-object v3, v4

    goto :goto_2

    :cond_2
    :goto_1
    return-object v4

    :cond_3
    :goto_2
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_4
    return-object v3
.end method

.method public ۥ۟۟۠ۨ(Z)Landroid/view/View;
    .locals 8

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۨ()I

    move-result v0

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥۣ۟۟۟()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildCount()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_4

    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v6, v5}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۡ(Landroid/view/View;)I

    move-result v6

    iget-object v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v7, v5}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟(Landroid/view/View;)I

    move-result v7

    if-le v7, v0, :cond_3

    if-lt v6, v1, :cond_0

    goto :goto_2

    :cond_0
    if-ge v6, v0, :cond_2

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    if-nez v3, :cond_3

    move-object v3, v5

    goto :goto_2

    :cond_2
    :goto_1
    return-object v5

    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    return-object v3
.end method

.method public ۥ۟۟ۡ()I
    .locals 2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۧ(Z)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۨ(Z)Landroid/view/View;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    const/4 v0, -0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPosition(Landroid/view/View;)I

    move-result v0

    :goto_1
    return v0
.end method

.method public ۥ۟۟ۡ۟([I)[I
    .locals 3

    if-nez p1, :cond_0

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    new-array p1, p1, [I

    goto :goto_0

    :cond_0
    array-length v0, p1

    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-lt v0, v1, :cond_2

    :goto_0
    const/4 v0, 0x0

    :goto_1
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟ۢ()I

    move-result v1

    aput v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-object p1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Provided int[]\'s size must be more than or equal to span count. Expected:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", array size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟۟ۡ۠([I)[I
    .locals 3

    if-nez p1, :cond_0

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    new-array p1, p1, [I

    goto :goto_0

    :cond_0
    array-length v0, p1

    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-lt v0, v1, :cond_2

    :goto_0
    const/4 v0, 0x0

    :goto_1
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥۣ۟۟۟()I

    move-result v1

    aput v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-object p1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Provided int[]\'s size must be more than or equal to span count. Expected:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", array size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟۟ۡۡ(I)I
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPosition(Landroid/view/View;)I

    move-result v1

    if-ltz v1, :cond_0

    if-ge v1, p1, :cond_0

    return v1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public ۥ۟۟ۡۢ([I)[I
    .locals 3

    if-nez p1, :cond_0

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    new-array p1, p1, [I

    goto :goto_0

    :cond_0
    array-length v0, p1

    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-lt v0, v1, :cond_2

    :goto_0
    const/4 v0, 0x0

    :goto_1
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟ۥ()I

    move-result v1

    aput v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-object p1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Provided int[]\'s size must be more than or equal to span count. Expected:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", array size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥۣ۟۟ۡ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;Z)V
    .locals 2

    const/high16 v0, -0x80000000

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۡۨ(I)I

    move-result v1

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥۣ۟۟۟()I

    move-result v0

    sub-int/2addr v0, v1

    if-lez v0, :cond_1

    neg-int v1, v0

    invoke-virtual {p0, v1, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->scrollBy(ILandroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I

    move-result p1

    neg-int p1, p1

    sub-int/2addr v0, p1

    if-eqz p3, :cond_1

    if-lez v0, :cond_1

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥۣ۟۟۠(I)V

    :cond_1
    return-void
.end method

.method public final ۥ۟۟ۡۤ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;Z)V
    .locals 2

    const v0, 0x7fffffff

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۢ۠(I)I

    move-result v1

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۨ()I

    move-result v0

    sub-int/2addr v1, v0

    if-lez v1, :cond_1

    invoke-virtual {p0, v1, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->scrollBy(ILandroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I

    move-result p1

    sub-int/2addr v1, p1

    if-eqz p3, :cond_1

    if-lez v1, :cond_1

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    neg-int p2, v1

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥۣ۟۟۠(I)V

    :cond_1
    return-void
.end method

.method public ۥ۟۟ۡۥ()I
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPosition(Landroid/view/View;)I

    move-result v1

    :goto_0
    return v1
.end method

.method public ۥ۟۟ۡۦ()I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۨ:I

    return v0
.end method

.method public ۥ۟۟ۡۧ()I
    .locals 1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPosition(Landroid/view/View;)I

    move-result v0

    :goto_0
    return v0
.end method

.method public final ۥ۟۟ۡۨ(I)I
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠۠(I)I

    move-result v0

    const/4 v1, 0x1

    :goto_0
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠۠(I)I

    move-result v2

    if-le v2, v0, :cond_0

    move v0, v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public final ۥ۟۟ۢ(I)I
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠ۤ(I)I

    move-result v0

    const/4 v1, 0x1

    :goto_0
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠ۤ(I)I

    move-result v2

    if-le v2, v0, :cond_0

    move v0, v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public final ۥ۟۟ۢ۟(I)I
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠۠(I)I

    move-result v0

    const/4 v1, 0x1

    :goto_0
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠۠(I)I

    move-result v2

    if-ge v2, v0, :cond_0

    move v0, v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public final ۥ۟۟ۢ۠(I)I
    .locals 3

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠ۤ(I)I

    move-result v0

    const/4 v1, 0x1

    :goto_0
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠ۤ(I)I

    move-result v2

    if-ge v2, v0, :cond_0

    move v0, v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public final ۥ۟۟ۢۡ(Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;)Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;
    .locals 7

    iget v0, p1, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟۟:I

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟(I)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    sub-int/2addr v0, v1

    const/4 v2, -0x1

    move v3, v2

    goto :goto_0

    :cond_0
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    const/4 v0, 0x0

    move v3, v1

    :goto_0
    iget p1, p1, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟۟:I

    const/4 v4, 0x0

    if-ne p1, v1, :cond_3

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۨ()I

    move-result p1

    const v1, 0x7fffffff

    :goto_1
    if-eq v0, v2, :cond_2

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v5, v5, v0

    invoke-virtual {v5, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠۠(I)I

    move-result v6

    if-ge v6, v1, :cond_1

    move-object v4, v5

    move v1, v6

    :cond_1
    add-int/2addr v0, v3

    goto :goto_1

    :cond_2
    return-object v4

    :cond_3
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥۣ۟۟۟()I

    move-result p1

    const/high16 v1, -0x80000000

    :goto_2
    if-eq v0, v2, :cond_5

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v5, v5, v0

    invoke-virtual {v5, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠ۤ(I)I

    move-result v6

    if-le v6, v1, :cond_4

    move-object v4, v5

    move v1, v6

    :cond_4
    add-int/2addr v0, v3

    goto :goto_2

    :cond_5
    return-object v4
.end method

.method public ۥ۟۟ۢۢ()I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    return v0
.end method

.method public final ۥۣ۟۟ۢ(III)V
    .locals 6

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۡۧ()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۡۥ()I

    move-result v0

    :goto_0
    const/16 v1, 0x8

    if-ne p3, v1, :cond_2

    if-ge p1, p2, :cond_1

    add-int/lit8 v2, p2, 0x1

    :goto_1
    move v3, p1

    goto :goto_2

    :cond_1
    add-int/lit8 v2, p1, 0x1

    move v3, p2

    goto :goto_2

    :cond_2
    add-int v2, p1, p2

    goto :goto_1

    :goto_2
    iget-object v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;->ۥ۟۟۟ۢ(I)I

    const/4 v4, 0x1

    if-eq p3, v4, :cond_5

    const/4 v5, 0x2

    if-eq p3, v5, :cond_4

    if-eq p3, v1, :cond_3

    goto :goto_3

    :cond_3
    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    invoke-virtual {p3, p1, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;->ۥ۟۟۟ۥ(II)V

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    invoke-virtual {p1, p2, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;->ۥ۟۟۟ۤ(II)V

    goto :goto_3

    :cond_4
    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    invoke-virtual {p3, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;->ۥ۟۟۟ۥ(II)V

    goto :goto_3

    :cond_5
    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    invoke-virtual {p3, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;->ۥ۟۟۟ۤ(II)V

    :goto_3
    if-gt v2, v0, :cond_6

    return-void

    :cond_6
    iget-boolean p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۡۥ()I

    move-result p1

    goto :goto_4

    :cond_7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۡۧ()I

    move-result p1

    :goto_4
    if-gt v3, p1, :cond_8

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->requestLayout()V

    :cond_8
    return-void
.end method

.method public ۥ۟۟ۢۤ()Landroid/view/View;
    .locals 12

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildCount()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    new-instance v2, Ljava/util/BitSet;

    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    invoke-direct {v2, v3}, Ljava/util/BitSet;-><init>(I)V

    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-virtual {v2, v4, v3, v5}, Ljava/util/BitSet;->set(IIZ)V

    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    const/4 v6, -0x1

    if-ne v3, v5, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->isLayoutRTL()Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v6

    :goto_0
    iget-boolean v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    if-eqz v7, :cond_1

    move v0, v6

    goto :goto_1

    :cond_1
    move v1, v4

    :goto_1
    if-ge v1, v0, :cond_2

    move v6, v5

    :cond_2
    :goto_2
    if-eq v1, v0, :cond_c

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    check-cast v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;

    iget-object v9, v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۟:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    iget v9, v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟۟:I

    invoke-virtual {v2, v9}, Ljava/util/BitSet;->get(I)Z

    move-result v9

    if-eqz v9, :cond_4

    iget-object v9, v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۟:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    invoke-virtual {p0, v9}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۨ(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;)Z

    move-result v9

    if-eqz v9, :cond_3

    return-object v7

    :cond_3
    iget-object v9, v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۟:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    iget v9, v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟۟:I

    invoke-virtual {v2, v9}, Ljava/util/BitSet;->clear(I)V

    :cond_4
    iget-boolean v9, v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۠:Z

    if-eqz v9, :cond_5

    goto :goto_6

    :cond_5
    add-int v9, v1, v6

    if-eq v9, v0, :cond_b

    invoke-virtual {p0, v9}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    iget-boolean v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    if-eqz v10, :cond_7

    iget-object v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v10, v7}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟(Landroid/view/View;)I

    move-result v10

    iget-object v11, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v11, v9}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟(Landroid/view/View;)I

    move-result v11

    if-ge v10, v11, :cond_6

    return-object v7

    :cond_6
    if-ne v10, v11, :cond_b

    goto :goto_3

    :cond_7
    iget-object v10, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v10, v7}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۡ(Landroid/view/View;)I

    move-result v10

    iget-object v11, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v11, v9}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۡ(Landroid/view/View;)I

    move-result v11

    if-le v10, v11, :cond_8

    return-object v7

    :cond_8
    if-ne v10, v11, :cond_b

    :goto_3
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;

    iget-object v8, v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۟:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    iget v8, v8, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟۟:I

    iget-object v9, v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۟:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    iget v9, v9, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟۟:I

    sub-int/2addr v8, v9

    if-gez v8, :cond_9

    move v8, v5

    goto :goto_4

    :cond_9
    move v8, v4

    :goto_4
    if-gez v3, :cond_a

    move v9, v5

    goto :goto_5

    :cond_a
    move v9, v4

    :goto_5
    if-eq v8, v9, :cond_b

    return-object v7

    :cond_b
    :goto_6
    add-int/2addr v1, v6

    goto :goto_2

    :cond_c
    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥ۟۟ۢۥ()V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;->ۥ۟()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->requestLayout()V

    return-void
.end method

.method public final ۥ۟۟ۢۧ(Landroid/view/View;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;Z)V
    .locals 6

    iget-boolean v0, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۠:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۡ:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getHeight()I

    move-result v2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getHeightMode()I

    move-result v3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPaddingTop()I

    move-result v4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPaddingBottom()I

    move-result v5

    add-int/2addr v4, v5

    iget p2, p2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {v2, v3, v4, p2, v1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildMeasureSpec(IIIIZ)I

    move-result p2

    invoke-direct {p0, p1, v0, p2, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۢۦ(Landroid/view/View;IIZ)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getWidthMode()I

    move-result v2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPaddingLeft()I

    move-result v3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPaddingRight()I

    move-result v4

    add-int/2addr v3, v4

    iget p2, p2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v0, v2, v3, p2, v1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildMeasureSpec(IIIIZ)I

    move-result p2

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۡ:I

    invoke-direct {p0, p1, p2, v0, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۢۦ(Landroid/view/View;IIZ)V

    goto :goto_0

    :cond_1
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    const/4 v2, 0x0

    if-ne v0, v1, :cond_2

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۠:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getWidthMode()I

    move-result v3

    iget v4, p2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v0, v3, v2, v4, v2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildMeasureSpec(IIIIZ)I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getHeight()I

    move-result v2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getHeightMode()I

    move-result v3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPaddingTop()I

    move-result v4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPaddingBottom()I

    move-result v5

    add-int/2addr v4, v5

    iget p2, p2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {v2, v3, v4, p2, v1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildMeasureSpec(IIIIZ)I

    move-result p2

    invoke-direct {p0, p1, v0, p2, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۢۦ(Landroid/view/View;IIZ)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getWidthMode()I

    move-result v3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPaddingLeft()I

    move-result v4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getPaddingRight()I

    move-result v5

    add-int/2addr v4, v5

    iget v5, p2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v0, v3, v4, v5, v1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildMeasureSpec(IIIIZ)I

    move-result v0

    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۠:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getHeightMode()I

    move-result v3

    iget p2, p2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {v1, v3, v2, p2, v2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildMeasureSpec(IIIIZ)I

    move-result p2

    invoke-direct {p0, p1, v0, p2, p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۢۦ(Landroid/view/View;IIZ)V

    :goto_0
    return-void
.end method

.method public final ۥ۟۟ۢۨ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;Z)V
    .locals 8

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

    const/4 v2, -0x1

    if-nez v1, :cond_0

    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۥ:I

    if-eq v1, v2, :cond_1

    :cond_0
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;->ۥ۟۟۟()I

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->removeAndRecycleAllViews(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;)V

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟()V

    return-void

    :cond_1
    iget-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟۟۟:Z

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۥ:I

    if-ne v1, v2, :cond_3

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    move v1, v3

    goto :goto_1

    :cond_3
    :goto_0
    move v1, v4

    :goto_1
    if-eqz v1, :cond_5

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟()V

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

    if-eqz v5, :cond_4

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۢ(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;)V

    goto :goto_2

    :cond_4
    invoke-direct {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۥ()V

    iget-boolean v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    iput-boolean v5, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟:Z

    :goto_2
    invoke-virtual {p0, p2, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۤۡ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;)V

    iput-boolean v4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟۟۟:Z

    :cond_5
    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

    if-nez v5, :cond_7

    iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۥ:I

    if-ne v5, v2, :cond_7

    iget-boolean v5, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟:Z

    iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠:Z

    if-ne v5, v6, :cond_6

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->isLayoutRTL()Z

    move-result v5

    iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۟:Z

    if-eq v5, v6, :cond_7

    :cond_6
    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;

    invoke-virtual {v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟;->ۥ۟()V

    iput-boolean v4, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟۟:Z

    :cond_7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildCount()I

    move-result v5

    if-lez v5, :cond_e

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

    if-eqz v5, :cond_8

    iget v5, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟۠ۥ:I

    if-ge v5, v4, :cond_e

    :cond_8
    iget-boolean v5, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟۟:Z

    if-eqz v5, :cond_a

    move v1, v3

    :goto_3
    iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v1, v5, :cond_e

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v5, v5, v1

    invoke-virtual {v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟۟()V

    iget v5, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟:I

    const/high16 v6, -0x80000000

    if-eq v5, v6, :cond_9

    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v6, v6, v1

    invoke-virtual {v6, v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟ۡ۟(I)V

    :cond_9
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_a
    if-nez v1, :cond_c

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;

    iget-object v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟۟۠:[I

    if-nez v1, :cond_b

    goto :goto_5

    :cond_b
    move v1, v3

    :goto_4
    iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v1, v5, :cond_e

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v5, v5, v1

    invoke-virtual {v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟۟()V

    iget-object v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;

    iget-object v6, v6, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟۟۠:[I

    aget v6, v6, v1

    invoke-virtual {v5, v6}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟ۡ۟(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_c
    :goto_5
    move v1, v3

    :goto_6
    iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v1, v5, :cond_d

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v5, v5, v1

    iget-boolean v6, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    iget v7, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟:I

    invoke-virtual {v5, v6, v7}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟(ZI)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_d
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    invoke-virtual {v1, v5}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟۟([Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;)V

    :cond_e
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->detachAndScrapAttachedViews(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;)V

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    iput-boolean v3, v1, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ:Z

    iput-boolean v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۤ:Z

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۠()I

    move-result v1

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۤ(I)V

    iget v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ:I

    invoke-virtual {p0, v1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۤۢ(ILandroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)V

    iget-boolean v1, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟:Z

    if-eqz v1, :cond_f

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۧ(I)V

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    invoke-virtual {p0, p1, v1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۤ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I

    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۧ(I)V

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    iget v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ:I

    iget v5, v1, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟:I

    add-int/2addr v2, v5

    iput v2, v1, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟:I

    invoke-virtual {p0, p1, v1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۤ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I

    goto :goto_7

    :cond_f
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۧ(I)V

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    invoke-virtual {p0, p1, v1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۤ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۧ(I)V

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    iget v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ:I

    iget v5, v1, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟:I

    add-int/2addr v2, v5

    iput v2, v1, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟:I

    invoke-virtual {p0, p1, v1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۤ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)I

    :goto_7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۤ()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildCount()I

    move-result v1

    if-lez v1, :cond_11

    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    if-eqz v1, :cond_10

    invoke-virtual {p0, p1, p2, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۡ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;Z)V

    invoke-virtual {p0, p1, p2, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۡۤ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;Z)V

    goto :goto_8

    :cond_10
    invoke-virtual {p0, p1, p2, v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۡۤ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;Z)V

    invoke-virtual {p0, p1, p2, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۡ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;Z)V

    :cond_11
    :goto_8
    if-eqz p3, :cond_13

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;->ۥ۟۟۟ۤ()Z

    move-result p3

    if-nez p3, :cond_13

    iget p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۨ:I

    if-eqz p3, :cond_13

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildCount()I

    move-result p3

    if-lez p3, :cond_13

    iget-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۤ:Z

    if-nez p3, :cond_12

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۢۤ()Landroid/view/View;

    move-result-object p3

    if-eqz p3, :cond_13

    :cond_12
    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۧ:Ljava/lang/Runnable;

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->removeCallbacks(Ljava/lang/Runnable;)Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۧ()Z

    move-result p3

    if-eqz p3, :cond_13

    goto :goto_9

    :cond_13
    move v4, v3

    :goto_9
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;->ۥ۟۟۟ۤ()Z

    move-result p3

    if-eqz p3, :cond_14

    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;

    invoke-virtual {p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟()V

    :cond_14
    iget-boolean p3, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟:Z

    iput-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠:Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->isLayoutRTL()Z

    move-result p3

    iput-boolean p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۟:Z

    if-eqz v4, :cond_15

    iget-object p3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;

    invoke-virtual {p3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟()V

    invoke-virtual {p0, p1, p2, v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۢۨ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;Z)V

    :cond_15
    return-void
.end method

.method public final ۥۣ۟۟(I)Z
    .locals 4

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_2

    if-ne p1, v1, :cond_0

    move p1, v3

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    if-eq p1, v0, :cond_1

    move v2, v3

    :cond_1
    return v2

    :cond_2
    if-ne p1, v1, :cond_3

    move p1, v3

    goto :goto_1

    :cond_3
    move p1, v2

    :goto_1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    if-ne p1, v0, :cond_4

    move p1, v3

    goto :goto_2

    :cond_4
    move p1, v2

    :goto_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->isLayoutRTL()Z

    move-result v0

    if-ne p1, v0, :cond_5

    move v2, v3

    :cond_5
    return v2
.end method

.method public ۥۣ۟۟۟(ILandroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)V
    .locals 4

    const/4 v0, 0x1

    if-lez p1, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۡۧ()I

    move-result v1

    move v2, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۡۥ()I

    move-result v1

    const/4 v2, -0x1

    :goto_0
    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    iput-boolean v0, v3, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ:Z

    invoke-virtual {p0, v1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۤۢ(ILandroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)V

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۧ(I)V

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    iget v0, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟:I

    add-int/2addr v1, v0

    iput v1, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟:I

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    iput p1, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟:I

    return-void
.end method

.method public final ۥۣ۟۟۠(Landroid/view/View;)V
    .locals 2

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟ۡ(Landroid/view/View;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۥۣ۟۟ۡ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;)V
    .locals 2

    iget-boolean v0, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ:Z

    if-eqz v0, :cond_6

    iget-boolean v0, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥۣ۟۟۟:Z

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    iget v0, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟:I

    const/4 v1, -0x1

    if-nez v0, :cond_2

    iget v0, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟۟:I

    if-ne v0, v1, :cond_1

    iget p2, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟ۡ:I

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۢ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;I)V

    goto :goto_2

    :cond_1
    iget p2, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟۠:I

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣۣ۟۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;I)V

    goto :goto_2

    :cond_2
    iget v0, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟۟:I

    if-ne v0, v1, :cond_4

    iget v0, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟۠:I

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۢ(I)I

    move-result v1

    sub-int/2addr v0, v1

    if-gez v0, :cond_3

    iget p2, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟ۡ:I

    goto :goto_0

    :cond_3
    iget v1, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟ۡ:I

    iget p2, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟:I

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    sub-int p2, v1, p2

    :goto_0
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۢ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;I)V

    goto :goto_2

    :cond_4
    iget v0, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟ۡ:I

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۢ۟(I)I

    move-result v0

    iget v1, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟ۡ:I

    sub-int/2addr v0, v1

    if-gez v0, :cond_5

    iget p2, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟۠:I

    goto :goto_1

    :cond_5
    iget v1, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟۠:I

    iget p2, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟:I

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    add-int/2addr p2, v1

    :goto_1
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣۣ۟۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;I)V

    :cond_6
    :goto_2
    return-void
.end method

.method public final ۥۣ۟۟ۢ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;I)V
    .locals 6

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_5

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۡ(Landroid/view/View;)I

    move-result v3

    if-lt v3, p2, :cond_5

    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۠ۡ(Landroid/view/View;)I

    move-result v3

    if-lt v3, p2, :cond_5

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;

    iget-boolean v4, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۠:Z

    if-eqz v4, :cond_2

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v4, v5, :cond_1

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v5, v5, v4

    iget-object v5, v5, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ne v5, v1, :cond_0

    return-void

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    iget v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v3, v4, :cond_4

    iget-object v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v4, v4, v3

    invoke-virtual {v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠ۧ()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    iget-object v4, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۟:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    iget-object v4, v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ne v4, v1, :cond_3

    return-void

    :cond_3
    iget-object v3, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۟:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠ۧ()V

    :cond_4
    invoke-virtual {p0, v2, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->removeAndRecycleView(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_5
    return-void
.end method

.method public final ۥۣۣ۟۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;I)V
    .locals 5

    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildCount()I

    move-result v0

    if-lez v0, :cond_5

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟(Landroid/view/View;)I

    move-result v2

    if-gt v2, p2, :cond_5

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۠۠(Landroid/view/View;)I

    move-result v2

    if-gt v2, p2, :cond_5

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;

    iget-boolean v3, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۠:Z

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    move v2, v0

    :goto_1
    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v2, v3, :cond_1

    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v3, v3, v2

    iget-object v3, v3, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ne v3, v4, :cond_0

    return-void

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v0, v2, :cond_4

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v2, v2, v0

    invoke-virtual {v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠ۨ()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_2
    iget-object v0, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۟:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    iget-object v0, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne v0, v4, :cond_3

    return-void

    :cond_3
    iget-object v0, v2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۟:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠ۨ()V

    :cond_4
    invoke-virtual {p0, v1, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->removeAndRecycleView(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠ۦ;)V

    goto :goto_0

    :cond_5
    return-void
.end method

.method public final ۥۣ۟۟ۤ()V
    .locals 9

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۦ()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move v3, v1

    :goto_0
    if-ge v3, v0, :cond_3

    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    iget-object v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v5, v4}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟۟(Landroid/view/View;)I

    move-result v5

    int-to-float v5, v5

    cmpg-float v6, v5, v2

    if-gez v6, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥۣ۟۟۟()Z

    move-result v4

    if-eqz v4, :cond_2

    const/high16 v4, 0x3f800000    # 1.0f

    mul-float/2addr v5, v4

    iget v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    int-to-float v4, v4

    div-float/2addr v5, v4

    :cond_2
    invoke-static {v2, v5}, Ljava/lang/Math;->max(FF)F

    move-result v2

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    iget v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۠:I

    iget v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    int-to-float v4, v4

    mul-float/2addr v2, v4

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget-object v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۦ()I

    move-result v4

    const/high16 v5, -0x80000000

    if-ne v4, v5, :cond_4

    iget-object v4, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v4}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۠()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    :cond_4
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟ۤ(I)V

    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۠:I

    if-ne v2, v3, :cond_5

    return-void

    :cond_5
    :goto_2
    if-ge v1, v0, :cond_9

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;

    iget-boolean v5, v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۠:Z

    if-eqz v5, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->isLayoutRTL()Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_7

    iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    if-ne v5, v6, :cond_7

    iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    add-int/lit8 v7, v5, -0x1

    iget-object v4, v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۟:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    iget v4, v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟۟:I

    sub-int/2addr v7, v4

    neg-int v7, v7

    iget v8, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۠:I

    mul-int/2addr v7, v8

    sub-int/2addr v5, v6

    sub-int/2addr v5, v4

    neg-int v4, v5

    mul-int/2addr v4, v3

    sub-int/2addr v7, v4

    invoke-virtual {v2, v7}, Landroid/view/View;->offsetLeftAndRight(I)V

    goto :goto_3

    :cond_7
    iget-object v4, v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟;->ۥ۟۟۟۟:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    iget v4, v4, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟۟:I

    iget v5, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۠:I

    mul-int/2addr v5, v4

    mul-int/2addr v4, v3

    iget v7, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۟:I

    if-ne v7, v6, :cond_8

    sub-int/2addr v5, v4

    invoke-virtual {v2, v5}, Landroid/view/View;->offsetLeftAndRight(I)V

    goto :goto_3

    :cond_8
    sub-int/2addr v5, v4

    invoke-virtual {v2, v5}, Landroid/view/View;->offsetTopAndBottom(I)V

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_9
    return-void
.end method

.method public ۥۣ۟۟ۦ(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۨ:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_2

    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۨ:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->requestLayout()V

    return-void
.end method

.method public final ۥۣ۟۟ۧ(I)V
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    iput p1, v0, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟۟:I

    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    const/4 v2, 0x1

    const/4 v3, -0x1

    if-ne p1, v3, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-ne v1, p1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    iput v2, v0, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟:I

    return-void
.end method

.method public ۥۣ۟۟ۨ(I)V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-eq p1, v0, :cond_1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۢۥ()V

    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    new-instance p1, Ljava/util/BitSet;

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    invoke-direct {p1, v0}, Ljava/util/BitSet;-><init>(I)V

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۤ:Ljava/util/BitSet;

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    new-array p1, p1, [Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    iput-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    const/4 p1, 0x0

    :goto_0
    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    new-instance v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    invoke-direct {v1, p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;-><init>(Landroidx/recyclerview/widget/StaggeredGridLayoutManager;I)V

    aput-object v1, v0, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->requestLayout()V

    :cond_1
    return-void
.end method

.method public final ۥ۟۟ۤ(II)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v1, v1, v0

    iget-object v1, v1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟:[Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;

    aget-object v1, v1, v0

    invoke-virtual {p0, v1, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۤۤ(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;II)V

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۥ۟۟ۤ۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;)Z
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;->ۥ۟۟۟()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۡۡ(I)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;->ۥ۟۟۟()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۦ(I)I

    move-result p1

    :goto_0
    iput p1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ:I

    const/high16 p1, -0x80000000

    iput p1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟:I

    const/4 p1, 0x1

    return p1
.end method

.method public ۥ۟۟ۤ۠(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;)Z
    .locals 5

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;->ۥ۟۟۟ۤ()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_f

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۥ:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    goto/16 :goto_7

    :cond_0
    const/high16 v3, -0x80000000

    if-ltz v0, :cond_e

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;->ۥ۟۟۟()I

    move-result p1

    if-lt v0, p1, :cond_1

    goto/16 :goto_6

    :cond_1
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠۠:Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;

    const/4 v0, 0x1

    if-eqz p1, :cond_3

    iget v4, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥۣ۟۟۠:I

    if-eq v4, v2, :cond_3

    iget p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۟;->ۥ۟۟۠ۥ:I

    if-ge p1, v0, :cond_2

    goto :goto_0

    :cond_2
    iput v3, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟:I

    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۥ:I

    iput p1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ:I

    goto/16 :goto_5

    :cond_3
    :goto_0
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۥ:I

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->findViewByPosition(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_b

    iget-boolean v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۡۧ()I

    move-result v1

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۡۥ()I

    move-result v1

    :goto_1
    iput v1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ:I

    iget v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۦ:I

    if-eq v1, v3, :cond_6

    iget-boolean v1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟:Z

    if-eqz v1, :cond_5

    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥۣ۟۟۟()I

    move-result v1

    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۦ:I

    sub-int/2addr v1, v2

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟(Landroid/view/View;)I

    move-result p1

    sub-int/2addr v1, p1

    iput v1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟:I

    goto :goto_2

    :cond_5
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۨ()I

    move-result v1

    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۦ:I

    add-int/2addr v1, v2

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۡ(Landroid/view/View;)I

    move-result p1

    sub-int/2addr v1, p1

    iput v1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟:I

    :goto_2
    return v0

    :cond_6
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟۟(Landroid/view/View;)I

    move-result v1

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۠()I

    move-result v2

    if-le v1, v2, :cond_8

    iget-boolean p1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟:Z

    if-eqz p1, :cond_7

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥۣ۟۟۟()I

    move-result p1

    goto :goto_3

    :cond_7
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۨ()I

    move-result p1

    :goto_3
    iput p1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟:I

    return v0

    :cond_8
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۡ(Landroid/view/View;)I

    move-result v1

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۨ()I

    move-result v2

    sub-int/2addr v1, v2

    if-gez v1, :cond_9

    neg-int p1, v1

    iput p1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟:I

    return v0

    :cond_9
    iget-object v1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥۣ۟۟۟()I

    move-result v1

    iget-object v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟(Landroid/view/View;)I

    move-result p1

    sub-int/2addr v1, p1

    if-gez v1, :cond_a

    iput v1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟:I

    return v0

    :cond_a
    iput v3, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟:I

    goto :goto_5

    :cond_b
    iget p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۥ:I

    iput p1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ:I

    iget v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۦ:I

    if-ne v2, v3, :cond_d

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۦ(I)I

    move-result p1

    if-ne p1, v0, :cond_c

    move v1, v0

    :cond_c
    iput-boolean v1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟:Z

    invoke-virtual {p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ()V

    goto :goto_4

    :cond_d
    invoke-virtual {p2, v2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟(I)V

    :goto_4
    iput-boolean v0, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ۟۟۟:Z

    :goto_5
    return v0

    :cond_e
    :goto_6
    iput v2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۥ:I

    iput v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۦ:I

    :cond_f
    :goto_7
    return v1
.end method

.method public ۥ۟۟ۤۡ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۤ۠(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟ۤ۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ()V

    const/4 p1, 0x0

    iput p1, p2, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟;->ۥ:I

    return-void
.end method

.method public final ۥ۟۟ۤۢ(ILandroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;)V
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    const/4 v1, 0x0

    iput v1, v0, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟:I

    iput p1, v0, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->isSmoothScrolling()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۡ;->ۥ۟۟۟ۡ()I

    move-result p2

    const/4 v0, -0x1

    if-eq p2, v0, :cond_2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥۣ۟۟۟:Z

    if-ge p2, p1, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    if-ne v0, p1, :cond_1

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۠()I

    move-result p1

    move p2, v1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۠()I

    move-result p1

    move p2, p1

    move p1, v1

    goto :goto_1

    :cond_2
    move p1, v1

    move p2, p1

    :goto_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;->getClipToPadding()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۨ()I

    move-result v3

    sub-int/2addr v3, p2

    iput v3, v0, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟۠:I

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥۣ۟۟۟()I

    move-result v0

    add-int/2addr v0, p1

    iput v0, p2, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟ۡ:I

    goto :goto_2

    :cond_3
    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    iget-object v3, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۢ()I

    move-result v3

    add-int/2addr v3, p1

    iput v3, v0, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟ۡ:I

    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    neg-int p2, p2

    iput p2, p1, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟۠:I

    :goto_2
    iget-object p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۡ:Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;

    iput-boolean v1, p1, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ۟۟۟ۢ:Z

    iput-boolean v2, p1, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥ:Z

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۦ()I

    move-result p2

    if-nez p2, :cond_4

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۢ()I

    move-result p2

    if-nez p2, :cond_4

    move v1, v2

    :cond_4
    iput-boolean v1, p1, Landroidx/recyclerview/widget/ۥ۟۟۟ۦ;->ۥۣ۟۟۟:Z

    return-void
.end method

.method public ۥۣ۟۟ۤ(I)V
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ:I

    div-int v0, p1, v0

    iput v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟۠:I

    iget-object v0, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟:Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۟ۦ()I

    move-result v0

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۠ۡ:I

    return-void
.end method

.method public final ۥ۟۟ۤۤ(Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;II)V
    .locals 3

    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-ne p2, v1, :cond_0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥۣ۟۟۠()I

    move-result p2

    add-int/2addr p2, v0

    if-gt p2, p3, :cond_1

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۤ:Ljava/util/BitSet;

    iget p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟۟:I

    invoke-virtual {p2, p1, v2}, Ljava/util/BitSet;->set(IZ)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۠۟()I

    move-result p2

    sub-int/2addr p2, v0

    if-lt p2, p3, :cond_1

    iget-object p2, p0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->ۥ۟۟۟ۤ:Ljava/util/BitSet;

    iget p1, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$ۥ۟۟۟۠;->ۥ۟۟۟۟:I

    invoke-virtual {p2, p1, v2}, Ljava/util/BitSet;->set(IZ)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ۥ۟۟ۤۥ(III)I
    .locals 2

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    return p1

    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_2

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    return p1

    :cond_2
    :goto_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    sub-int/2addr p1, p2

    sub-int/2addr p1, p3

    const/4 p2, 0x0

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    return p1
.end method
