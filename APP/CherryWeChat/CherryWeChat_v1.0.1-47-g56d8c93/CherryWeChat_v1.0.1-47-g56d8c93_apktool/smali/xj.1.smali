.class public final Lxj;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;
.implements LMm;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lyj;


# direct methods
.method public constructor <init>(Lyj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxj;->c:Lyj;

    const/4 p1, -0x2

    iput p1, p0, Lxj;->b:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget v0, p0, Lxj;->b:I

    const/4 v1, -0x2

    iget-object v2, p0, Lxj;->c:Lyj;

    if-ne v0, v1, :cond_0

    iget-object v0, v2, Lyj;->a:LUi;

    invoke-interface {v0}, LUi;->a()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, v2, Lyj;->b:Lfj;

    iget-object v1, p0, Lxj;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lxj;->a:Ljava/lang/Object;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    :goto_1
    iput v0, p0, Lxj;->b:I

    return-void
.end method

.method public final hasNext()Z
    .locals 2

    iget v0, p0, Lxj;->b:I

    if-gez v0, :cond_0

    invoke-virtual {p0}, Lxj;->a()V

    :cond_0
    iget v0, p0, Lxj;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lxj;->b:I

    if-gez v0, :cond_0

    invoke-virtual {p0}, Lxj;->a()V

    :cond_0
    iget v0, p0, Lxj;->b:I

    if-eqz v0, :cond_1

    iget-object v0, p0, Lxj;->a:Ljava/lang/Object;

    const/4 v1, -0x1

    iput v1, p0, Lxj;->b:I

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
