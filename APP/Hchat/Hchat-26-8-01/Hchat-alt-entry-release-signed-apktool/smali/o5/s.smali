.class public abstract Lo5/s;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/ListIterator;


# instance fields
.field public final g:La5/a;

.field public final h:I

.field public final i:I

.field public j:I


# direct methods
.method public constructor <init>(Landroidx/lifecycle/x;II)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, La5/a;

    .line 8
    .line 9
    const/4 v1, 0x5

    .line 10
    invoke-direct {v0, p2, v1, p1}, La5/a;-><init>(IILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lo5/s;->g:La5/a;

    .line 14
    .line 15
    iput p2, p0, Lo5/s;->i:I

    .line 16
    .line 17
    iput p3, p0, Lo5/s;->h:I

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public abstract a(La5/a;I)Ljava/lang/Object;
.end method

.method public final add(Ljava/lang/Object;)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Lo5/s;->j:I

    .line 2
    .line 3
    iget v1, p0, Lo5/s;->h:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 1
    iget v0, p0, Lo5/s;->j:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lo5/s;->j:I

    .line 2
    .line 3
    iget v1, p0, Lo5/s;->h:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    add-int/lit8 v1, v0, 0x1

    .line 8
    .line 9
    iput v1, p0, Lo5/s;->j:I

    .line 10
    .line 11
    iget-object v1, p0, Lo5/s;->g:La5/a;

    .line 12
    .line 13
    invoke-virtual {p0, v1, v0}, Lo5/s;->a(La5/a;I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    invoke-static {}, Lbsh/j;->e()V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    return-object v0
.end method

.method public final nextIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lo5/s;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lo5/s;->j:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iget v1, p0, Lo5/s;->i:I

    .line 6
    .line 7
    iget-object v2, p0, Lo5/s;->g:La5/a;

    .line 8
    .line 9
    iput v1, v2, La5/a;->h:I

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput v1, p0, Lo5/s;->j:I

    .line 13
    .line 14
    :goto_0
    iget v1, p0, Lo5/s;->j:I

    .line 15
    .line 16
    if-ge v1, v0, :cond_0

    .line 17
    .line 18
    add-int/lit8 v3, v1, 0x1

    .line 19
    .line 20
    iput v3, p0, Lo5/s;->j:I

    .line 21
    .line 22
    invoke-virtual {p0, v2, v1}, Lo5/s;->a(La5/a;I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    add-int/lit8 v0, v1, 0x1

    .line 27
    .line 28
    iput v0, p0, Lo5/s;->j:I

    .line 29
    .line 30
    invoke-virtual {p0, v2, v1}, Lo5/s;->a(La5/a;I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0
.end method

.method public final previousIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lo5/s;->j:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    return v0
.end method

.method public final remove()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method
