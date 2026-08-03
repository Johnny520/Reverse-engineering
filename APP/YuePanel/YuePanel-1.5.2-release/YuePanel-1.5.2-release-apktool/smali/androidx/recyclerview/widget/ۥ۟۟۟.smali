.class public Landroidx/recyclerview/widget/ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ۟;,
        Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ۟۟;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟ۢ:Ljava/util/concurrent/Executor;


# instance fields
.field public final ۥ:LYue/ۥ۠ۧۢۦ;

.field public final ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/recyclerview/widget/\u06e5\u06df\u06df<",
            "TT;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟:Ljava/util/concurrent/Executor;

.field public final ۥ۟۟۟:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/recyclerview/widget/\u06e5\u06df\u06df\u06df$\u06e5\u06df<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟۟:Ljava/util/List;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟۠:Ljava/util/List;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟ۡ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ۟۟;

    invoke-direct {v0}, Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ۟۟;-><init>()V

    sput-object v0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟ۢ:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>(LYue/ۥ۠ۧۢۦ;Landroidx/recyclerview/widget/ۥ۟۟;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۧۢۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/recyclerview/widget/ۥ۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e7\u06e2\u06e6;",
            "Landroidx/recyclerview/widget/\u06e5\u06df\u06df<",
            "TT;>;)V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟:Ljava/util/List;

    .line 6
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟۠:Ljava/util/List;

    .line 7
    iput-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ:LYue/ۥ۠ۧۢۦ;

    .line 8
    iput-object p2, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟;

    .line 9
    invoke-virtual {p2}, Landroidx/recyclerview/widget/ۥ۟۟;->ۥ۟۟()Ljava/util/concurrent/Executor;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 10
    invoke-virtual {p2}, Landroidx/recyclerview/widget/ۥ۟۟;->ۥ۟۟()Ljava/util/concurrent/Executor;

    move-result-object p1

    iput-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟:Ljava/util/concurrent/Executor;

    goto :goto_0

    .line 11
    :cond_0
    sget-object p1, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟ۢ:Ljava/util/concurrent/Executor;

    iput-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟:Ljava/util/concurrent/Executor;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView$\u06e5\u06df\u06df\u06df\u06e1;",
            "Landroidx/recyclerview/widget/\u06e5\u06df\u06df\u06df\u06e1$\u06e5\u06df\u06df\u06df<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/recyclerview/widget/ۥ۟;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/ۥ۟;-><init>(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۡ;)V

    new-instance p1, Landroidx/recyclerview/widget/ۥ۟۟$ۥ;

    invoke-direct {p1, p2}, Landroidx/recyclerview/widget/ۥ۟۟$ۥ;-><init>(Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟۟;)V

    .line 2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/ۥ۟۟$ۥ;->ۥ()Landroidx/recyclerview/widget/ۥ۟۟;

    move-result-object p1

    .line 3
    invoke-direct {p0, v0, p1}, Landroidx/recyclerview/widget/ۥ۟۟۟;-><init>(LYue/ۥ۠ۧۢۦ;Landroidx/recyclerview/widget/ۥ۟۟;)V

    return-void
.end method


# virtual methods
.method public ۥ(Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ۟;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/\u06e5\u06df\u06df\u06df$\u06e5\u06df<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
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

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟۠:Ljava/util/List;

    return-object v0
.end method

.method public ۥ۟۟(Ljava/util/List;Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟;Ljava/lang/Runnable;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;",
            "Landroidx/recyclerview/widget/\u06e5\u06df\u06df\u06df\u06e1$\u06e5\u06df\u06df;",
            "Ljava/lang/Runnable;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟۠:Ljava/util/List;

    iput-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟۠:Ljava/util/List;

    iget-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ:LYue/ۥ۠ۧۢۦ;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟;->ۥ۟۟۟۠(LYue/ۥ۠ۧۢۦ;)V

    invoke-virtual {p0, v0, p3}, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟(Ljava/util/List;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ۥ۟۟۟(Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
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

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ۟;

    iget-object v2, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟۠:Ljava/util/List;

    invoke-interface {v1, p1, v2}, Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ۟;->ۥ(Ljava/util/List;Ljava/util/List;)V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    :cond_1
    return-void
.end method

.method public ۥ۟۟۟۟(Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ۟;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/\u06e5\u06df\u06df\u06df$\u06e5\u06df<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public ۥ۟۟۟۠(Ljava/util/List;)V
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

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟ۡ(Ljava/util/List;Ljava/lang/Runnable;)V

    return-void
.end method

.method public ۥ۟۟۟ۡ(Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 8
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

    iget v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟ۡ:I

    add-int/lit8 v5, v0, 0x1

    iput v5, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟ۡ:I

    iget-object v3, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟۟:Ljava/util/List;

    if-ne p1, v3, :cond_1

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟۠:Ljava/util/List;

    const/4 v1, 0x0

    if-nez p1, :cond_2

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result p1

    const/4 v2, 0x0

    iput-object v2, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟۠:Ljava/util/List;

    iget-object v2, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ:LYue/ۥ۠ۧۢۦ;

    invoke-interface {v2, v1, p1}, LYue/ۥ۠ۧۢۦ;->ۥ۟۟(II)V

    invoke-virtual {p0, v0, p2}, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟(Ljava/util/List;Ljava/lang/Runnable;)V

    return-void

    :cond_2
    if-nez v3, :cond_3

    iput-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟۟:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟۠:Ljava/util/List;

    iget-object v2, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ:LYue/ۥ۠ۧۢۦ;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-interface {v2, v1, p1}, LYue/ۥ۠ۧۢۦ;->ۥ۟(II)V

    invoke-virtual {p0, v0, p2}, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟(Ljava/util/List;Ljava/lang/Runnable;)V

    return-void

    :cond_3
    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟:Landroidx/recyclerview/widget/ۥ۟۟;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/ۥ۟۟;->ۥ()Ljava/util/concurrent/Executor;

    move-result-object v0

    new-instance v7, Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ;

    move-object v1, v7

    move-object v2, p0

    move-object v4, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ;-><init>(Landroidx/recyclerview/widget/ۥ۟۟۟;Ljava/util/List;Ljava/util/List;ILjava/lang/Runnable;)V

    invoke-interface {v0, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
