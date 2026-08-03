.class public abstract Landroidx/recyclerview/widget/ۥ۟۟۠;
.super Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "VH:",
        "Landroidx/recyclerview/widget/RecyclerView$\u06e5\u06df\u06df\u06e1\u06e4;",
        ">",
        "Landroidx/recyclerview/widget/RecyclerView$\u06e5\u06df\u06df\u06df\u06e1<",
        "TVH;>;"
    }
.end annotation


# instance fields
.field public final ۥ:Landroidx/recyclerview/widget/ۥ۟۟۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/recyclerview/widget/\u06e5\u06df\u06df\u06df<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/recyclerview/widget/\u06e5\u06df\u06df\u06df$\u06e5\u06df<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/ۥ۟۟;)V
    .locals 3
    .param p1    # Landroidx/recyclerview/widget/ۥ۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/\u06e5\u06df\u06df<",
            "TT;>;)V"
        }
    .end annotation

    .line 6
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;-><init>()V

    .line 7
    new-instance v0, Landroidx/recyclerview/widget/ۥ۟۟۠$ۥ;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/ۥ۟۟۠$ۥ;-><init>(Landroidx/recyclerview/widget/ۥ۟۟۠;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ۟;

    .line 8
    new-instance v1, Landroidx/recyclerview/widget/ۥ۟۟۟;

    new-instance v2, Landroidx/recyclerview/widget/ۥ۟;

    invoke-direct {v2, p0}, Landroidx/recyclerview/widget/ۥ۟;-><init>(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;)V

    invoke-direct {v1, v2, p1}, Landroidx/recyclerview/widget/ۥ۟۟۟;-><init>(LYue/ۥ۠ۧۢۦ;Landroidx/recyclerview/widget/ۥ۟۟;)V

    iput-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠;->ۥ:Landroidx/recyclerview/widget/ۥ۟۟۟;

    .line 9
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ(Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ۟;)V

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟;)V
    .locals 4
    .param p1    # Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/\u06e5\u06df\u06df\u06df\u06e1$\u06e5\u06df\u06df\u06df<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;-><init>()V

    .line 2
    new-instance v0, Landroidx/recyclerview/widget/ۥ۟۟۠$ۥ;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/ۥ۟۟۠$ۥ;-><init>(Landroidx/recyclerview/widget/ۥ۟۟۠;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ۟;

    .line 3
    new-instance v1, Landroidx/recyclerview/widget/ۥ۟۟۟;

    new-instance v2, Landroidx/recyclerview/widget/ۥ۟;

    invoke-direct {v2, p0}, Landroidx/recyclerview/widget/ۥ۟;-><init>(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;)V

    new-instance v3, Landroidx/recyclerview/widget/ۥ۟۟$ۥ;

    invoke-direct {v3, p1}, Landroidx/recyclerview/widget/ۥ۟۟$ۥ;-><init>(Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟;)V

    .line 4
    invoke-virtual {v3}, Landroidx/recyclerview/widget/ۥ۟۟$ۥ;->ۥ()Landroidx/recyclerview/widget/ۥ۟۟;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Landroidx/recyclerview/widget/ۥ۟۟۟;-><init>(LYue/ۥ۠ۧۢۦ;Landroidx/recyclerview/widget/ۥ۟۟;)V

    iput-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۠;->ۥ:Landroidx/recyclerview/widget/ۥ۟۟۟;

    .line 5
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ(Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ۟;)V

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠;->ۥ:Landroidx/recyclerview/widget/ۥ۟۟۟;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public ۥ۟()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠;->ۥ:Landroidx/recyclerview/widget/ۥ۟۟۟;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠;->ۥ:Landroidx/recyclerview/widget/ۥ۟۟۟;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟(Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    return-void
.end method

.method public ۥ۟۟۟۟(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠;->ۥ:Landroidx/recyclerview/widget/ۥ۟۟۟;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟۠(Ljava/util/List;)V

    return-void
.end method

.method public ۥ۟۟۟۠(Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;",
            "Ljava/lang/Runnable;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۠;->ۥ:Landroidx/recyclerview/widget/ۥ۟۟۟;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟ۡ(Ljava/util/List;Ljava/lang/Runnable;)V

    return-void
.end method
