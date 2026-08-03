.class public Landroidx/recyclerview/widget/ۥ۟۟ۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;,
        Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟:Z


# instance fields
.field public final ۥ:LYue/ۥۢ۟ۡ;
    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e2\u06df\u06e1<",
            "Landroidx/recyclerview/widget/RecyclerView$\u06e5\u06df\u06df\u06e1\u06e4;",
            "Landroidx/recyclerview/widget/\u06e5\u06df\u06df\u06e1$\u06e5;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟:LYue/ۥۣ۠ۨۢ;
    .annotation build LYue/ۥۢۥ۟ۥ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e8\u06e3\u06e2<",
            "Landroidx/recyclerview/widget/RecyclerView$\u06e5\u06df\u06df\u06e1\u06e4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LYue/ۥۢ۟ۡ;

    invoke-direct {v0}, LYue/ۥۢ۟ۡ;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ:LYue/ۥۢ۟ۡ;

    new-instance v0, LYue/ۥۣ۠ۨۢ;

    invoke-direct {v0}, LYue/ۥۣ۠ۨۢ;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ۟:LYue/ۥۣ۠ۨۢ;

    return-void
.end method


# virtual methods
.method public ۥ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۡ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;

    if-nez v0, :cond_0

    invoke-static {}, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟()Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;

    move-result-object v0

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v1, p1, v0}, LYue/ۥۢ۟ۡ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget p1, v0, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ:I

    or-int/lit8 p1, p1, 0x2

    iput p1, v0, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ:I

    iput-object p2, v0, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;

    return-void
.end method

.method public ۥ۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۡ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;

    if-nez v0, :cond_0

    invoke-static {}, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟()Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;

    move-result-object v0

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v1, p1, v0}, LYue/ۥۢ۟ۡ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget p1, v0, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ:I

    or-int/lit8 p1, p1, 0x1

    iput p1, v0, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ:I

    return-void
.end method

.method public ۥ۟۟(JLandroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ۟:LYue/ۥۣ۠ۨۢ;

    invoke-virtual {v0, p1, p2, p3}, LYue/ۥۣ۠ۨۢ;->ۥ۟۟۠۠(JLjava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۡ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;

    if-nez v0, :cond_0

    invoke-static {}, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟()Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;

    move-result-object v0

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v1, p1, v0}, LYue/ۥۢ۟ۡ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iput-object p2, v0, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;

    iget p1, v0, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ:I

    or-int/lit8 p1, p1, 0x8

    iput p1, v0, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ:I

    return-void
.end method

.method public ۥ۟۟۟۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۡ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;

    if-nez v0, :cond_0

    invoke-static {}, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟()Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;

    move-result-object v0

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v1, p1, v0}, LYue/ۥۢ۟ۡ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iput-object p2, v0, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;

    iget p1, v0, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ:I

    or-int/lit8 p1, p1, 0x4

    iput p1, v0, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ:I

    return-void
.end method

.method public ۥ۟۟۟۠()V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v0}, LYue/ۥۢ۟ۡ;->clear()V

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ۟:LYue/ۥۣ۠ۨۢ;

    invoke-virtual {v0}, LYue/ۥۣ۠ۨۢ;->ۥ۟۟۟()V

    return-void
.end method

.method public ۥ۟۟۟ۡ(J)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ۟:LYue/ۥۣ۠ۨۢ;

    invoke-virtual {v0, p1, p2}, LYue/ۥۣ۠ۨۢ;->ۥ۟۟۟ۤ(J)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;

    return-object p1
.end method

.method public ۥ۟۟۟ۢ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)Z
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۡ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;

    if-eqz p1, :cond_0

    iget p1, p1, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ:I

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥۣ۟۟۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)Z
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۡ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;

    if-eqz p1, :cond_0

    iget p1, p1, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ:I

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public ۥ۟۟۟ۤ()V
    .locals 0

    invoke-static {}, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ()V

    return-void
.end method

.method public ۥ۟۟۟ۥ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ۟۟۠۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V

    return-void
.end method

.method public final ۥ۟۟۟ۦ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;I)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۡ;->indexOfKey(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, 0x0

    if-gez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v1, p1}, LYue/ۥۢ۟ۡ;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;

    if-eqz v1, :cond_4

    iget v2, v1, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ:I

    and-int v3, v2, p2

    if-eqz v3, :cond_4

    not-int v0, p2

    and-int/2addr v0, v2

    iput v0, v1, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ:I

    const/4 v2, 0x4

    if-ne p2, v2, :cond_1

    iget-object p2, v1, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;

    goto :goto_0

    :cond_1
    const/16 v2, 0x8

    if-ne p2, v2, :cond_3

    iget-object p2, v1, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;

    :goto_0
    and-int/lit8 v0, v0, 0xc

    if-nez v0, :cond_2

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۡ;->removeAt(I)Ljava/lang/Object;

    invoke-static {v1}, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟۟(Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;)V

    :cond_2
    return-object p2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must provide flag PRE or POST"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-object v0
.end method

.method public ۥ۟۟۟ۧ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    const/16 v0, 0x8

    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ۟۟۟ۦ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;I)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۨ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    const/4 v0, 0x4

    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ۟۟۟ۦ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;I)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۠(Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ۟;)V
    .locals 6

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v0}, LYue/ۥۢ۟ۡ;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_7

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v1, v0}, LYue/ۥۢ۟ۡ;->keyAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;

    iget-object v2, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v2, v0}, LYue/ۥۢ۟ۡ;->removeAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;

    iget v3, v2, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ:I

    and-int/lit8 v4, v3, 0x3

    const/4 v5, 0x3

    if-ne v4, v5, :cond_0

    invoke-interface {p1, v1}, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ۟;->ۥ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v3, 0x1

    if-eqz v4, :cond_2

    iget-object v3, v2, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;

    if-nez v3, :cond_1

    invoke-interface {p1, v1}, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ۟;->ۥ(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V

    goto :goto_1

    :cond_1
    iget-object v4, v2, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;

    invoke-interface {p1, v1, v3, v4}, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ۟;->ۥ۟۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;)V

    goto :goto_1

    :cond_2
    and-int/lit8 v4, v3, 0xe

    const/16 v5, 0xe

    if-ne v4, v5, :cond_3

    iget-object v3, v2, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;

    iget-object v4, v2, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;

    invoke-interface {p1, v1, v3, v4}, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ۟;->ۥ۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;)V

    goto :goto_1

    :cond_3
    and-int/lit8 v4, v3, 0xc

    const/16 v5, 0xc

    if-ne v4, v5, :cond_4

    iget-object v3, v2, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;

    iget-object v4, v2, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;

    invoke-interface {p1, v1, v3, v4}, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ۟;->ۥ۟۟۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;)V

    goto :goto_1

    :cond_4
    and-int/lit8 v4, v3, 0x4

    if-eqz v4, :cond_5

    iget-object v3, v2, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;

    const/4 v4, 0x0

    invoke-interface {p1, v1, v3, v4}, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ۟;->ۥ۟۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;)V

    goto :goto_1

    :cond_5
    and-int/lit8 v3, v3, 0x8

    if-eqz v3, :cond_6

    iget-object v3, v2, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;

    iget-object v4, v2, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟۟:Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;

    invoke-interface {p1, v1, v3, v4}, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ۟;->ۥ۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟;)V

    :cond_6
    :goto_1
    invoke-static {v2}, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟۟(Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_7
    return-void
.end method

.method public ۥ۟۟۠۟(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۡ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget v0, p1, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p1, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ:I

    return-void
.end method

.method public ۥ۟۟۠۠(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ۟:LYue/ۥۣ۠ۨۢ;

    invoke-virtual {v0}, LYue/ۥۣ۠ۨۢ;->ۥ۟۟ۡۢ()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ۟:LYue/ۥۣ۠ۨۢ;

    invoke-virtual {v1, v0}, LYue/ۥۣ۠ۨۢ;->ۥۣ۟۟ۡ(I)Ljava/lang/Object;

    move-result-object v1

    if-ne p1, v1, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ۟:LYue/ۥۣ۠ۨۢ;

    invoke-virtual {v1, v0}, LYue/ۥۣ۠ۨۢ;->ۥ۟۟۠ۧ(I)V

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟ۡ;->ۥ:LYue/ۥۢ۟ۡ;

    invoke-virtual {v0, p1}, LYue/ۥۢ۟ۡ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;

    if-eqz p1, :cond_2

    invoke-static {p1}, Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;->ۥ۟۟(Landroidx/recyclerview/widget/ۥ۟۟ۡ$ۥ;)V

    :cond_2
    return-void
.end method
