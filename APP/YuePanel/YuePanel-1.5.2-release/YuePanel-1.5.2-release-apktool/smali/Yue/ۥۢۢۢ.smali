.class public final LYue/ۥۢۢۢ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements LYue/ۥ۠ۦۢۨ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;",
        "LYue/\u06e5\u06e0\u06e6\u06e2\u06e8;"
    }
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۣ۠ۡ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "TT;",
            "Ljava/util/Iterator<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/Iterator<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۥ:Ljava/util/Iterator;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "+TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Iterator;LYue/ۥۣ۠ۡ۟;)V
    .locals 0
    .param p1    # Ljava/util/Iterator;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;+",
            "Ljava/util/Iterator<",
            "+TT;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LYue/ۥۢۢۢ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۡ۟;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, LYue/ۥۢۢۢ;->ۥ۟۟۠ۤ:Ljava/util/List;

    iput-object p1, p0, LYue/ۥۢۢۢ;->ۥ۟۟۠ۥ:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۢۢ;->ۥ۟۟۠ۥ:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۢۢ;->ۥ۟۟۠ۥ:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LYue/ۥۢۢۢ;->ۥ(Ljava/lang/Object;)V

    return-object v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۢۢ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۡ۟;

    invoke-interface {v0, p1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Iterator;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۢۢۢ;->ۥ۟۟۠ۤ:Ljava/util/List;

    iget-object v1, p0, LYue/ۥۢۢۢ;->ۥ۟۟۠ۥ:Ljava/util/Iterator;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput-object p1, p0, LYue/ۥۢۢۢ;->ۥ۟۟۠ۥ:Ljava/util/Iterator;

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, LYue/ۥۢۢۢ;->ۥ۟۟۠ۥ:Ljava/util/Iterator;

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, LYue/ۥۢۢۢ;->ۥ۟۟۠ۤ:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_1

    iget-object p1, p0, LYue/ۥۢۢۢ;->ۥ۟۟۠ۤ:Ljava/util/List;

    invoke-static {p1}, LYue/ۥ۟ۥۢ۠;->ۥ۟۠ۨۥ(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Iterator;

    iput-object p1, p0, LYue/ۥۢۢۢ;->ۥ۟۟۠ۥ:Ljava/util/Iterator;

    iget-object p1, p0, LYue/ۥۢۢۢ;->ۥ۟۟۠ۤ:Ljava/util/List;

    invoke-static {p1}, LYue/ۥ۟ۥۡۨ;->ۥ۟۟ۦۧ(Ljava/util/List;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
