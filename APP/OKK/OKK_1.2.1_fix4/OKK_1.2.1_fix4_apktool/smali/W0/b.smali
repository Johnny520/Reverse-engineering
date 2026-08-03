.class public final LW0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements LR0/a;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:LT0/c;

.field public e:I

.field public final synthetic f:LW0/c;


# direct methods
.method public constructor <init>(LW0/c;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW0/b;->f:LW0/c;

    const/4 v0, -0x1

    iput v0, p0, LW0/b;->a:I

    iget v0, p1, LW0/c;->b:I

    iget-object p1, p1, LW0/c;->a:Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, LA0/p;->p(III)I

    move-result p1

    iput p1, p0, LW0/b;->b:I

    iput p1, p0, LW0/b;->c:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    iget v0, p0, LW0/b;->c:I

    const/4 v1, 0x0

    if-gez v0, :cond_0

    iput v1, p0, LW0/b;->a:I

    const/4 v0, 0x0

    iput-object v0, p0, LW0/b;->d:LT0/c;

    goto/16 :goto_2

    :cond_0
    iget-object v2, p0, LW0/b;->f:LW0/c;

    iget v3, v2, LW0/c;->c:I

    const/4 v4, 0x1

    iget-object v5, v2, LW0/c;->a:Ljava/lang/CharSequence;

    const/4 v6, -0x1

    if-lez v3, :cond_1

    iget v7, p0, LW0/b;->e:I

    add-int/2addr v7, v4

    iput v7, p0, LW0/b;->e:I

    if-ge v7, v3, :cond_2

    :cond_1
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-le v0, v3, :cond_3

    :cond_2
    new-instance v0, LT0/c;

    iget v1, p0, LW0/b;->b:I

    invoke-static {v5}, LW0/j;->L0(Ljava/lang/CharSequence;)I

    move-result v2

    invoke-direct {v0, v1, v2, v4}, LT0/a;-><init>(III)V

    iput-object v0, p0, LW0/b;->d:LT0/c;

    iput v6, p0, LW0/b;->c:I

    goto :goto_1

    :cond_3
    iget v0, p0, LW0/b;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v2, v2, LW0/c;->d:LP0/p;

    invoke-interface {v2, v5, v0}, LP0/p;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD0/e;

    if-nez v0, :cond_4

    new-instance v0, LT0/c;

    iget v1, p0, LW0/b;->b:I

    invoke-static {v5}, LW0/j;->L0(Ljava/lang/CharSequence;)I

    move-result v2

    invoke-direct {v0, v1, v2, v4}, LT0/a;-><init>(III)V

    iput-object v0, p0, LW0/b;->d:LT0/c;

    iput v6, p0, LW0/b;->c:I

    goto :goto_1

    :cond_4
    iget-object v2, v0, LD0/e;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object v0, v0, LD0/e;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget v3, p0, LW0/b;->b:I

    const/high16 v5, -0x80000000

    if-gt v2, v5, :cond_5

    sget-object v3, LT0/c;->d:LT0/c;

    goto :goto_0

    :cond_5
    new-instance v5, LT0/c;

    add-int/lit8 v6, v2, -0x1

    invoke-direct {v5, v3, v6, v4}, LT0/a;-><init>(III)V

    move-object v3, v5

    :goto_0
    iput-object v3, p0, LW0/b;->d:LT0/c;

    add-int/2addr v2, v0

    iput v2, p0, LW0/b;->b:I

    if-nez v0, :cond_6

    move v1, v4

    :cond_6
    add-int/2addr v2, v1

    iput v2, p0, LW0/b;->c:I

    :goto_1
    iput v4, p0, LW0/b;->a:I

    :goto_2
    return-void
.end method

.method public final hasNext()Z
    .locals 2

    iget v0, p0, LW0/b;->a:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, LW0/b;->a()V

    :cond_0
    iget v0, p0, LW0/b;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    iget v0, p0, LW0/b;->a:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, LW0/b;->a()V

    :cond_0
    iget v0, p0, LW0/b;->a:I

    if-eqz v0, :cond_1

    iget-object v0, p0, LW0/b;->d:LT0/c;

    const-string v2, "null cannot be cast to non-null type kotlin.ranges.IntRange"

    invoke-static {v0, v2}, LQ0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    iput-object v2, p0, LW0/b;->d:LT0/c;

    iput v1, p0, LW0/b;->a:I

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
