.class public abstract Landroidx/recyclerview/widget/ۥ۟۟۠ۧ;
.super Landroidx/recyclerview/widget/ۥ۟۟۠ۦ$ۥ۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T2:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/recyclerview/widget/\u06e5\u06df\u06df\u06e0\u06e6$\u06e5\u06df<",
        "TT2;>;"
    }
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;)V
    .locals 0

    invoke-direct {p0}, Landroidx/recyclerview/widget/ۥ۟۟۠ۦ$ۥ۟;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۧ;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;

    return-void
.end method


# virtual methods
.method public ۥ(II)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۧ;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;->notifyItemMoved(II)V

    return-void
.end method

.method public ۥ۟(II)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۧ;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;->notifyItemRangeInserted(II)V

    return-void
.end method

.method public ۥ۟۟(II)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۧ;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;->notifyItemRangeRemoved(II)V

    return-void
.end method

.method public ۥ۟۟۟(IILjava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۧ;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;->notifyItemRangeChanged(IILjava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟۟ۢ(II)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠ۧ;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;->notifyItemRangeChanged(II)V

    return-void
.end method
