.class public final LT0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements LO0/a;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:LK0/h;


# direct methods
.method public constructor <init>(LK0/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT0/g;->c:LK0/h;

    .line 5
    .line 6
    const/4 p1, -0x2

    .line 7
    iput p1, p0, LT0/g;->b:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget v0, p0, LT0/g;->b:I

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    iget-object v2, p0, LT0/g;->c:LK0/h;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, v2, LK0/h;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LN0/h;

    .line 11
    .line 12
    invoke-interface {v0}, LM0/a;->b()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, v2, LK0/h;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, LM0/l;

    .line 20
    .line 21
    iget-object v1, p0, LT0/g;->a:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static {v1}, LN0/g;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, LM0/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :goto_0
    iput-object v0, p0, LT0/g;->a:Ljava/lang/Object;

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/4 v0, 0x1

    .line 37
    :goto_1
    iput v0, p0, LT0/g;->b:I

    .line 38
    .line 39
    return-void
.end method

.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, LT0/g;->b:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LT0/g;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, LT0/g;->b:I

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    return v1

    .line 14
    :cond_1
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LT0/g;->b:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LT0/g;->a()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, LT0/g;->b:I

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, LT0/g;->a:Ljava/lang/Object;

    .line 13
    .line 14
    const-string v1, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence"

    .line 15
    .line 16
    invoke-static {v0, v1}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    iput v1, p0, LT0/g;->b:I

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 26
    .line 27
    .line 28
    throw v0
.end method

.method public final remove()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method
