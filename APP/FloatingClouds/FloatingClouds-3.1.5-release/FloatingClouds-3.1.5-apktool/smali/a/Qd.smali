.class public final La/Qd;
.super La/Rd;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements La/a4;
.implements La/q9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "La/Rd<",
        "TT;>;",
        "Ljava/util/Iterator<",
        "TT;>;",
        "La/a4<",
        "La/Wf;",
        ">;",
        "La/q9;"
    }
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public c:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "+TT;>;"
        }
    .end annotation
.end field

.field public d:La/a4;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/a4<",
            "-",
            "La/Wf;",
            ">;"
        }
    .end annotation
.end field


# virtual methods
.method public final a(Ljava/lang/Object;La/Cg;)V
    .locals 0

    iput-object p1, p0, La/Qd;->b:Ljava/lang/Object;

    const/4 p1, 0x3

    iput p1, p0, La/Qd;->a:I

    iput-object p2, p0, La/Qd;->d:La/a4;

    return-void
.end method

.method public final b(Ljava/util/Iterator;La/Cg;)Ljava/lang/Object;
    .locals 1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, La/Wf;->a:La/Wf;

    return-object p1

    :cond_0
    iput-object p1, p0, La/Qd;->c:Ljava/util/Iterator;

    const/4 p1, 0x2

    iput p1, p0, La/Qd;->a:I

    iput-object p2, p0, La/Qd;->d:La/a4;

    sget-object p1, La/y4;->a:La/y4;

    return-object p1
.end method

.method public final c()La/x4;
    .locals 1

    sget-object v0, La/W5;->a:La/W5;

    return-object v0
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p1}, La/xd;->b(Ljava/lang/Object;)V

    const/4 p1, 0x4

    iput p1, p0, La/Qd;->a:I

    return-void
.end method

.method public final e()Ljava/lang/RuntimeException;
    .locals 3

    iget v0, p0, La/Qd;->a:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected state of the iterator: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, La/Qd;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Iterator has failed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    return-object v0
.end method

.method public final hasNext()Z
    .locals 4

    :goto_0
    iget v0, p0, La/Qd;->a:I

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v0, v3, :cond_2

    if-eq v0, v2, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {p0}, La/Qd;->e()Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_1
    return v3

    :cond_2
    iget-object v0, p0, La/Qd;->c:Ljava/util/Iterator;

    invoke-static {v0}, La/i9;->b(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    iput v2, p0, La/Qd;->a:I

    return v3

    :cond_3
    iput-object v1, p0, La/Qd;->c:Ljava/util/Iterator;

    :cond_4
    const/4 v0, 0x5

    iput v0, p0, La/Qd;->a:I

    iget-object v0, p0, La/Qd;->d:La/a4;

    invoke-static {v0}, La/i9;->b(Ljava/lang/Object;)V

    iput-object v1, p0, La/Qd;->d:La/a4;

    sget-object v1, La/Wf;->a:La/Wf;

    invoke-interface {v0, v1}, La/a4;->d(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget v0, p0, La/Qd;->a:I

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    iput v0, p0, La/Qd;->a:I

    iget-object v0, p0, La/Qd;->b:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, La/Qd;->b:Ljava/lang/Object;

    return-object v0

    :cond_0
    invoke-virtual {p0}, La/Qd;->e()Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :cond_1
    iput v1, p0, La/Qd;->a:I

    iget-object v0, p0, La/Qd;->c:Ljava/util/Iterator;

    invoke-static {v0}, La/i9;->b(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_2
    invoke-virtual {p0}, La/Qd;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, La/Qd;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_3
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
