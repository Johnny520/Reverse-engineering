.class public final LYue/ۥ۟ۦۤۧ;
.super LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;
.source "SourceFile"


# instance fields
.field public final ۥ:Ljava/util/List;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06e4\u06e6\u06e2$\u06e5\u06df\u06df\u06df\u06e4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, LYue/ۥ۟ۦۤۧ;->ۥ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LYue/ۥ۟ۦۤۧ;->ۥ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;

    invoke-virtual {v1, p1}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;->onPageScrollStateChanged(I)V
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, LYue/ۥ۟ۦۤۧ;->ۥ۟۟(Ljava/util/ConcurrentModificationException;)V

    :cond_0
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 2
    .param p3    # I
        .annotation build LYue/ۥۡۥۤۤ;
        .end annotation
    .end param

    :try_start_0
    iget-object v0, p0, LYue/ۥ۟ۦۤۧ;->ۥ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;

    invoke-virtual {v1, p1, p2, p3}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;->onPageScrolled(IFI)V
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, LYue/ۥ۟ۦۤۧ;->ۥ۟۟(Ljava/util/ConcurrentModificationException;)V

    :cond_0
    return-void
.end method

.method public onPageSelected(I)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LYue/ۥ۟ۦۤۧ;->ۥ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;

    invoke-virtual {v1, p1}, LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;->onPageSelected(I)V
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, LYue/ۥ۟ۦۤۧ;->ۥ۟۟(Ljava/util/ConcurrentModificationException;)V

    :cond_0
    return-void
.end method

.method public ۥ(LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۦۤۧ;->ۥ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public ۥ۟(LYue/ۥۢۤۦۢ$ۥ۟۟۟ۤ;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۦۤۧ;->ۥ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۥ۟۟(Ljava/util/ConcurrentModificationException;)V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Adding and removing callbacks during dispatch to callbacks is not supported"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
