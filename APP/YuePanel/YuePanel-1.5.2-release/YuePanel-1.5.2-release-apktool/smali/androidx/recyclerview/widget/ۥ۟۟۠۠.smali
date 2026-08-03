.class public abstract Landroidx/recyclerview/widget/ۥ۟۟۠۠;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ۟۟۟:I = -0x80000000

.field public static final ۥ۟۟۟۟:I = 0x0

.field public static final ۥ۟۟۟۠:I = 0x1


# instance fields
.field public final ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

.field public ۥ۟:I

.field public final ۥ۟۟:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x80000000

    .line 3
    iput v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟:I

    .line 4
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟:Landroid/graphics/Rect;

    .line 5
    iput-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;Landroidx/recyclerview/widget/ۥ۟۟۠۠$ۥ;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;-><init>(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;)V

    return-void
.end method

.method public static ۥ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;)Landroidx/recyclerview/widget/ۥ۟۟۠۠;
    .locals 1

    new-instance v0, Landroidx/recyclerview/widget/ۥ۟۟۠۠$ۥ;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠$ۥ;-><init>(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;)V

    return-object v0
.end method

.method public static ۥ۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;I)Landroidx/recyclerview/widget/ۥ۟۟۠۠;
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    invoke-static {p0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;)Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "invalid orientation"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;)Landroidx/recyclerview/widget/ۥ۟۟۠۠;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;)Landroidx/recyclerview/widget/ۥ۟۟۠۠;
    .locals 1

    new-instance v0, Landroidx/recyclerview/widget/ۥ۟۟۠۠$ۥ۟;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠$ۥ۟;-><init>(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;)V

    return-object v0
.end method


# virtual methods
.method public abstract ۥ۟۟۟(Landroid/view/View;)I
.end method

.method public abstract ۥ۟۟۟۟(Landroid/view/View;)I
.end method

.method public abstract ۥ۟۟۟۠(Landroid/view/View;)I
.end method

.method public abstract ۥ۟۟۟ۡ(Landroid/view/View;)I
.end method

.method public abstract ۥ۟۟۟ۢ()I
.end method

.method public abstract ۥۣ۟۟۟()I
.end method

.method public abstract ۥ۟۟۟ۤ()I
.end method

.method public ۥ۟۟۟ۥ()Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۠;

    return-object v0
.end method

.method public abstract ۥ۟۟۟ۦ()I
.end method

.method public abstract ۥ۟۟۟ۧ()I
.end method

.method public abstract ۥ۟۟۟ۨ()I
.end method

.method public abstract ۥ۟۟۠()I
.end method

.method public ۥ۟۟۠۟()I
    .locals 2

    const/high16 v0, -0x80000000

    iget v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۠()I

    move-result v0

    iget v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟:I

    sub-int/2addr v0, v1

    :goto_0
    return v0
.end method

.method public abstract ۥ۟۟۠۠(Landroid/view/View;)I
.end method

.method public abstract ۥ۟۟۠ۡ(Landroid/view/View;)I
.end method

.method public abstract ۥ۟۟۠ۢ(Landroid/view/View;I)V
.end method

.method public abstract ۥۣ۟۟۠(I)V
.end method

.method public ۥ۟۟۠ۤ()V
    .locals 1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟۟۠()I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠۠;->ۥ۟:I

    return-void
.end method
