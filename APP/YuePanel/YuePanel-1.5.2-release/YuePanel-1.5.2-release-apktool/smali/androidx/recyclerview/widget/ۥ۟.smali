.class public final Landroidx/recyclerview/widget/ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۧۢۦ;


# instance fields
.field public final ۥۣ۟۟۠:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/ۥ۟;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;

    return-void
.end method


# virtual methods
.method public ۥ(II)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;->notifyItemMoved(II)V

    return-void
.end method

.method public ۥ۟(II)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;->notifyItemRangeInserted(II)V

    return-void
.end method

.method public ۥ۟۟(II)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;->notifyItemRangeRemoved(II)V

    return-void
.end method

.method public ۥ۟۟۟(IILjava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;->notifyItemRangeChanged(IILjava/lang/Object;)V

    return-void
.end method
