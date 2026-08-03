.class public final Le/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/ArrayList;

.field private b:I

.field private c:Lj/p;

.field private d:[I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Le/s;->a:Ljava/util/ArrayList;

    const/4 p1, 0x0

    iput p1, p0, Le/s;->b:I

    const/4 p1, 0x0

    iput-object p1, p0, Le/s;->c:Lj/p;

    iput-object p1, p0, Le/s;->d:[I

    return-void
.end method

.method private a(II)V
    .locals 4

    iget-object v0, p0, Le/s;->d:[I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    if-nez p1, :cond_1

    if-nez v3, :cond_1

    return-void

    :cond_1
    if-ltz p1, :cond_5

    if-nez v3, :cond_2

    array-length p1, v0

    if-lt p2, p1, :cond_4

    :cond_2
    add-int/2addr p2, v1

    new-instance p1, Lj/p;

    invoke-direct {p1, p2}, Lj/p;-><init>(I)V

    new-array p2, p2, [I

    const/4 v0, -0x1

    invoke-static {p2, v0}, Ljava/util/Arrays;->fill([II)V

    if-nez v3, :cond_3

    iget-object v0, p0, Le/s;->c:Lj/p;

    invoke-virtual {p1, v0}, Lj/p;->n(Lj/p;)V

    iget-object v0, p0, Le/s;->d:[I

    array-length v1, v0

    invoke-static {v0, v2, p2, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_3
    iput-object p1, p0, Le/s;->c:Lj/p;

    iput-object p2, p0, Le/s;->d:[I

    :cond_4
    return-void

    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "shouldn\'t happen"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static b(IILj/m;)V
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ltz p0, :cond_1

    if-eqz p1, :cond_0

    :try_start_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "spec.getLocalItem() == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "spec == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "disposition == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "address < 0"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private c(IILj/m;)V
    .locals 2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    invoke-virtual {p3}, Lj/m;->i()I

    move-result v0

    iget-object v1, p0, Le/s;->d:[I

    aget v0, v1, v0

    if-ltz v0, :cond_1

    iget-object v1, p0, Le/s;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2, p3}, Le/s;->d(IILj/m;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "shouldn\'t happen"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static e(Lj/m;)Lj/m;
    .locals 2

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lj/m;->c()Ll/c;

    move-result-object v0

    sget-object v1, Ll/c;->p:Ll/c;

    if-ne v0, v1, :cond_0

    sget-object v0, Ll/c;->u:Ll/c;

    invoke-virtual {p0, v0}, Lj/m;->s(Ll/c;)Lj/m;

    move-result-object p0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public final d(IILj/m;)V
    .locals 5

    invoke-virtual {p3}, Lj/m;->i()I

    move-result v0

    invoke-static {p3}, Le/s;->e(Lj/m;)Lj/m;

    move-result-object p3

    invoke-direct {p0, p1, v0}, Le/s;->a(II)V

    iget-object v1, p0, Le/s;->d:[I

    aget v0, v1, v0

    if-ltz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Le/s;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    :goto_0
    const/4 v3, 0x0

    if-ltz v1, :cond_3

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le/r;

    if-nez v4, :cond_1

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    throw v3

    :cond_3
    iget-object v4, p0, Le/s;->c:Lj/p;

    invoke-virtual {v4, p3}, Lj/p;->o(Lj/m;)V

    invoke-virtual {v0, v1, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget v4, p0, Le/s;->b:I

    add-int/2addr v4, v2

    iput v4, p0, Le/s;->b:I

    :goto_1
    add-int/lit8 v1, v1, -0x1

    if-ltz v1, :cond_5

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le/r;

    if-nez v4, :cond_4

    goto :goto_1

    :cond_4
    throw v3

    :cond_5
    :goto_2
    if-eqz v2, :cond_6

    return-void

    :cond_6
    invoke-static {p1, p2, p3}, Le/s;->b(IILj/m;)V

    throw v3
.end method

.method public final f()Le/t;
    .locals 7

    const v0, 0x7fffffff

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Le/s;->a(II)V

    iget-object v0, p0, Le/s;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    iget v3, p0, Le/s;->b:I

    sub-int v3, v2, v3

    if-nez v3, :cond_0

    sget-object v0, Le/t;->c:Le/t;

    return-object v0

    :cond_0
    new-array v4, v3, [Le/r;

    if-ne v2, v3, :cond_1

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v2, v1

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le/r;

    if-eqz v5, :cond_2

    add-int/lit8 v6, v2, 0x1

    aput-object v5, v4, v2

    move v2, v6

    goto :goto_0

    :cond_3
    :goto_1
    invoke-static {v4}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    new-instance v0, Le/t;

    invoke-direct {v0, v3}, Le/t;-><init>(I)V

    :goto_2
    if-ge v1, v3, :cond_4

    aget-object v2, v4, v1

    invoke-virtual {v0, v1, v2}, Le/t;->v(ILe/r;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Ln/j;->g()V

    return-object v0
.end method

.method public final g(ILj/p;)V
    .locals 6

    invoke-virtual {p2}, Lj/p;->l()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    invoke-direct {p0, p1, v1}, Le/s;->a(II)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    iget-object v2, p0, Le/s;->c:Lj/p;

    invoke-virtual {v2, v1}, Lj/p;->k(I)Lj/m;

    move-result-object v2

    invoke-virtual {p2, v1}, Lj/p;->k(I)Lj/m;

    move-result-object v3

    invoke-static {v3}, Le/s;->e(Lj/m;)Lj/m;

    move-result-object v3

    if-nez v2, :cond_0

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_0
    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-virtual {p0, p1, v4, v2}, Le/s;->d(IILj/m;)V

    goto :goto_2

    :cond_1
    invoke-virtual {v3, v2}, Lj/m;->f(Lj/m;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {p0, p1, v4, v2}, Le/s;->d(IILj/m;)V

    :goto_1
    invoke-virtual {p0, p1, v3}, Le/s;->h(ILj/m;)V

    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final h(ILj/m;)V
    .locals 4

    invoke-virtual {p2}, Lj/m;->i()I

    move-result v0

    invoke-static {p2}, Le/s;->e(Lj/m;)Lj/m;

    move-result-object p2

    invoke-direct {p0, p1, v0}, Le/s;->a(II)V

    iget-object v1, p0, Le/s;->c:Lj/p;

    invoke-virtual {v1, v0}, Lj/p;->k(I)Lj/m;

    move-result-object v1

    invoke-virtual {p2, v1}, Lj/m;->f(Lj/m;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    iget-object v2, p0, Le/s;->c:Lj/p;

    invoke-virtual {v2, p2}, Lj/p;->j(Lj/m;)Lj/m;

    move-result-object v2

    if-eqz v2, :cond_1

    const/4 v3, 0x4

    invoke-direct {p0, p1, v3, v2}, Le/s;->c(IILj/m;)V

    :cond_1
    iget-object v2, p0, Le/s;->d:[I

    aget v2, v2, v0

    const/4 v3, 0x0

    if-nez v1, :cond_6

    if-ltz v2, :cond_3

    iget-object v1, p0, Le/s;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/r;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    throw v3

    :cond_3
    :goto_0
    if-lez v0, :cond_4

    iget-object v1, p0, Le/s;->c:Lj/p;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v2}, Lj/p;->k(I)Lj/m;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lj/m;->k()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, 0x6

    invoke-direct {p0, p1, v2, v1}, Le/s;->c(IILj/m;)V

    :cond_4
    invoke-virtual {p2}, Lj/m;->k()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_5

    iget-object v1, p0, Le/s;->c:Lj/p;

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Lj/p;->k(I)Lj/m;

    move-result-object v0

    if-eqz v0, :cond_5

    const/4 v1, 0x5

    invoke-direct {p0, p1, v1, v0}, Le/s;->c(IILj/m;)V

    :cond_5
    invoke-static {p1, v2, p2}, Le/s;->b(IILj/m;)V

    throw v3

    :cond_6
    const/4 p2, 0x3

    invoke-static {p1, p2, v1}, Le/s;->b(IILj/m;)V

    throw v3
.end method
