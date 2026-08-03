.class public final LYue/ۥۡۨۢ۟;
.super LYue/ۥۡۨۢ۠;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements LYue/ۥ۟ۧۤۢ;
.implements LYue/ۥ۠ۦۢۨ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e1\u06e8\u06e2\u06e0<",
        "TT;>;",
        "Ljava/util/Iterator<",
        "TT;>;",
        "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        ">;",
        "LYue/\u06e5\u06e0\u06e6\u06e2\u06e8;"
    }
.end annotation


# instance fields
.field public ۥۣ۟۟۠:I

.field public ۥ۟۟۠ۤ:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۥ:Ljava/util/Iterator;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "+TT;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۦ:LYue/ۥ۟ۧۤۢ;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۡۨۢ۠;-><init>()V

    return-void
.end method


# virtual methods
.method public getContext()LYue/ۥ۟ۧۦۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    return-object v0
.end method

.method public hasNext()Z
    .locals 4

    :goto_0
    iget v0, p0, LYue/ۥۡۨۢ۟;->ۥۣ۟۟۠:I

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
    invoke-virtual {p0}, LYue/ۥۡۨۢ۟;->ۥ۟۟۟ۨ()Ljava/lang/Throwable;

    move-result-object v0

    throw v0

    :cond_1
    return v3

    :cond_2
    iget-object v0, p0, LYue/ۥۡۨۢ۟;->ۥ۟۟۠ۥ:Ljava/util/Iterator;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    iput v2, p0, LYue/ۥۡۨۢ۟;->ۥۣ۟۟۠:I

    return v3

    :cond_3
    iput-object v1, p0, LYue/ۥۡۨۢ۟;->ۥ۟۟۠ۥ:Ljava/util/Iterator;

    :cond_4
    const/4 v0, 0x5

    iput v0, p0, LYue/ۥۡۨۢ۟;->ۥۣ۟۟۠:I

    iget-object v0, p0, LYue/ۥۡۨۢ۟;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧۤۢ;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    iput-object v1, p0, LYue/ۥۡۨۢ۟;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧۤۢ;

    sget-object v1, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-static {v1}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, LYue/ۥ۟ۧۤۢ;->resumeWith(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public next()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget v0, p0, LYue/ۥۡۨۢ۟;->ۥۣ۟۟۠:I

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥۡۨۢ۟;->ۥۣ۟۟۠:I

    iget-object v0, p0, LYue/ۥۡۨۢ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, LYue/ۥۡۨۢ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    return-object v0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۡۨۢ۟;->ۥ۟۟۟ۨ()Ljava/lang/Throwable;

    move-result-object v0

    throw v0

    :cond_1
    iput v1, p0, LYue/ۥۡۨۢ۟;->ۥۣ۟۟۠:I

    iget-object v0, p0, LYue/ۥۡۨۢ۟;->ۥ۟۟۠ۥ:Ljava/util/Iterator;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_2
    invoke-virtual {p0}, LYue/ۥۡۨۢ۟;->ۥ۟۟۠۟()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    const/4 p1, 0x4

    iput p1, p0, LYue/ۥۡۨۢ۟;->ۥۣ۟۟۠:I

    return-void
.end method

.method public ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۨۢ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    const/4 p1, 0x3

    iput p1, p0, LYue/ۥۡۨۢ۟;->ۥۣ۟۟۠:I

    iput-object p2, p0, LYue/ۥۡۨۢ۟;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧۤۢ;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V

    :cond_0
    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public ۥ۟۟۟ۧ(Ljava/util/Iterator;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/util/Iterator;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator<",
            "+TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1

    :cond_0
    iput-object p1, p0, LYue/ۥۡۨۢ۟;->ۥ۟۟۠ۥ:Ljava/util/Iterator;

    const/4 p1, 0x2

    iput p1, p0, LYue/ۥۡۨۢ۟;->ۥۣ۟۟۠:I

    iput-object p2, p0, LYue/ۥۡۨۢ۟;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧۤۢ;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    invoke-static {p2}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V

    :cond_1
    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public final ۥ۟۟۟ۨ()Ljava/lang/Throwable;
    .locals 3

    iget v0, p0, LYue/ۥۡۨۢ۟;->ۥۣ۟۟۠:I

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected state of the iterator: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, LYue/ۥۡۨۢ۟;->ۥۣ۟۟۠:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Iterator has failed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    :goto_0
    return-object v0
.end method

.method public final ۥ۟۟۠()LYue/ۥ۟ۧۤۢ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۨۢ۟;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧۤۢ;

    return-object v0
.end method

.method public final ۥ۟۟۠۟()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۨۢ۟;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۡۨۢ۟;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final ۥ۟۟۠ۡ(LYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۨۢ۟;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧۤۢ;

    return-void
.end method
