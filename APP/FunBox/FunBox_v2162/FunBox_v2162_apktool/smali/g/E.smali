.class public abstract Lg/E;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lg/k;

.field private final c:I

.field private d:I

.field private e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lg/k;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_1

    if-lez p3, :cond_0

    add-int/lit8 v0, p3, -0x1

    and-int/2addr v0, p3

    if-nez v0, :cond_0

    iput-object p1, p0, Lg/E;->a:Ljava/lang/String;

    iput-object p2, p0, Lg/E;->b:Lg/k;

    iput p3, p0, Lg/E;->c:I

    const/4 p1, -0x1

    iput p1, p0, Lg/E;->d:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lg/E;->e:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid alignment"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "file == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public abstract a(Lg/s;)I
.end method

.method public final b(I)I
    .locals 1

    if-ltz p1, :cond_1

    iget v0, p0, Lg/E;->d:I

    if-ltz v0, :cond_0

    add-int/2addr v0, p1

    return v0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "fileOffset not yet set"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "relative < 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lg/E;->c:I

    return v0
.end method

.method public final d()Lg/k;
    .locals 1

    iget-object v0, p0, Lg/E;->b:Lg/k;

    return-object v0
.end method

.method public final e()I
    .locals 2

    iget v0, p0, Lg/E;->d:I

    if-ltz v0, :cond_0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "fileOffset not set"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract f()Ljava/util/Collection;
.end method

.method public final g()V
    .locals 1

    invoke-virtual {p0}, Lg/E;->k()V

    invoke-virtual {p0}, Lg/E;->h()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg/E;->e:Z

    return-void
.end method

.method protected abstract h()V
.end method

.method public final i(I)I
    .locals 1

    if-ltz p1, :cond_1

    iget v0, p0, Lg/E;->d:I

    if-gez v0, :cond_0

    iget v0, p0, Lg/E;->c:I

    add-int/lit8 v0, v0, -0x1

    add-int/2addr p1, v0

    not-int v0, v0

    and-int/2addr p1, v0

    iput p1, p0, Lg/E;->d:I

    return p1

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "fileOffset already set"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "fileOffset < 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected final j()V
    .locals 2

    iget-boolean v0, p0, Lg/E;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "not prepared"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected final k()V
    .locals 2

    iget-boolean v0, p0, Lg/E;->e:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "already prepared"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract l()I
.end method

.method public final m(Ln/d;)V
    .locals 4

    invoke-virtual {p0}, Lg/E;->j()V

    iget v0, p0, Lg/E;->c:I

    invoke-virtual {p1, v0}, Ln/d;->a(I)V

    invoke-virtual {p1}, Ln/d;->j()I

    move-result v0

    iget v1, p0, Lg/E;->d:I

    if-gez v1, :cond_0

    iput v0, p0, Lg/E;->d:I

    goto :goto_0

    :cond_0
    if-ne v1, v0, :cond_3

    :goto_0
    invoke-virtual {p1}, Ln/d;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "\n"

    const/4 v2, 0x0

    iget-object v3, p0, Lg/E;->a:Ljava/lang/String;

    if-eqz v3, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Ln/d;->b(ILjava/lang/String;)V

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {p1, v2, v1}, Ln/d;->b(ILjava/lang/String;)V

    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, Lg/E;->n(Ln/d;)V

    return-void

    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "alignment mismatch: for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", but expected "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lg/E;->d:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected abstract n(Ln/d;)V
.end method
