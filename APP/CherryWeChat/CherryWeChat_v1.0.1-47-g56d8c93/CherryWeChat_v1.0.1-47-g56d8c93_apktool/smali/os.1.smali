.class public final Los;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ltc;
.implements Lsc;


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:LXt;

.field public c:I

.field public d:Lwu;

.field public e:Lsc;

.field public f:Ljava/util/List;

.field public g:Z


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;LXt;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Los;->b:LXt;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    iput-object p1, p0, Los;->a:Ljava/util/ArrayList;

    const/4 p1, 0x0

    iput p1, p0, Los;->c:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must not be empty."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 2

    iget-object v0, p0, Los;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltc;

    invoke-interface {v0}, Ltc;->a()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Los;->f:Ljava/util/List;

    const-string v1, "Argument must not be null"

    invoke-static {v1, v0}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Los;->g()V

    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Los;->f:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v1, p0, Los;->b:LXt;

    invoke-interface {v1, v0}, LXt;->a(Ljava/lang/Object;)Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Los;->f:Ljava/util/List;

    iget-object v0, p0, Los;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltc;

    invoke-interface {v1}, Ltc;->c()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final cancel()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Los;->g:Z

    iget-object v0, p0, Los;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltc;

    invoke-interface {v1}, Ltc;->cancel()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d(Lwu;Lsc;)V
    .locals 1

    iput-object p1, p0, Los;->d:Lwu;

    iput-object p2, p0, Los;->e:Lsc;

    iget-object p2, p0, Los;->b:LXt;

    invoke-interface {p2}, LXt;->c()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    iput-object p2, p0, Los;->f:Ljava/util/List;

    iget-object p2, p0, Los;->a:Ljava/util/ArrayList;

    iget v0, p0, Los;->c:I

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ltc;

    invoke-interface {p2, p1, p0}, Ltc;->d(Lwu;Lsc;)V

    iget-boolean p1, p0, Los;->g:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Los;->cancel()V

    :cond_0
    return-void
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Los;->e:Lsc;

    invoke-interface {v0, p1}, Lsc;->e(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Los;->g()V

    return-void
.end method

.method public final f()I
    .locals 2

    iget-object v0, p0, Los;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltc;

    invoke-interface {v0}, Ltc;->f()I

    move-result v0

    return v0
.end method

.method public final g()V
    .locals 4

    iget-boolean v0, p0, Los;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Los;->c:I

    iget-object v1, p0, Los;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_1

    iget v0, p0, Los;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Los;->c:I

    iget-object v0, p0, Los;->d:Lwu;

    iget-object v1, p0, Los;->e:Lsc;

    invoke-virtual {p0, v0, v1}, Los;->d(Lwu;Lsc;)V

    return-void

    :cond_1
    iget-object v0, p0, Los;->f:Ljava/util/List;

    invoke-static {v0}, LQj;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Los;->e:Lsc;

    new-instance v1, LTj;

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Los;->f:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v3, "Fetch failed"

    invoke-direct {v1, v3, v2}, LTj;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {v0, v1}, Lsc;->b(Ljava/lang/Exception;)V

    return-void
.end method
