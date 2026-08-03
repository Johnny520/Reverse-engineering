.class public final Lg/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Le/i;

.field private b:Le/e;

.field private c:[B

.field private d:I

.field private e:Ljava/util/TreeMap;


# direct methods
.method public constructor <init>(Le/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg/c;->a:Le/i;

    const/4 p1, 0x0

    iput-object p1, p0, Lg/c;->b:Le/e;

    iput-object p1, p0, Lg/c;->c:[B

    const/4 v0, 0x0

    iput v0, p0, Lg/c;->d:I

    iput-object p1, p0, Lg/c;->e:Ljava/util/TreeMap;

    return-void
.end method

.method private b()V
    .locals 1

    iget-object v0, p0, Lg/c;->b:Le/e;

    if-nez v0, :cond_0

    iget-object v0, p0, Lg/c;->a:Le/i;

    invoke-virtual {v0}, Le/i;->d()Le/e;

    move-result-object v0

    iput-object v0, p0, Lg/c;->b:Le/e;

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lg/k;)V
    .locals 9

    invoke-direct {p0}, Lg/c;->b()V

    invoke-virtual {p1}, Lg/k;->q()Lg/x;

    move-result-object p1

    iget-object v0, p0, Lg/c;->b:Le/e;

    invoke-virtual {v0}, Ln/e;->B()I

    move-result v0

    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    iput-object v1, p0, Lg/c;->e:Ljava/util/TreeMap;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v3, p0, Lg/c;->e:Ljava/util/TreeMap;

    iget-object v4, p0, Lg/c;->b:Le/e;

    invoke-virtual {v4, v2}, Le/e;->k(I)Le/d;

    move-result-object v4

    invoke-virtual {v4}, Le/d;->c()Le/c;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg/c;->e:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    move-result v0

    const v2, 0xffff

    if-gt v0, v2, :cond_6

    new-instance v0, Ln/d;

    invoke-direct {v0}, Ln/d;-><init>()V

    iget-object v2, p0, Lg/c;->e:Ljava/util/TreeMap;

    invoke-virtual {v2}, Ljava/util/TreeMap;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ln/d;->t(I)I

    move-result v2

    iput v2, p0, Lg/c;->d:I

    iget-object v2, p0, Lg/c;->e:Ljava/util/TreeMap;

    invoke-virtual {v2}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le/c;

    invoke-virtual {v4}, Ln/e;->B()I

    move-result v5

    invoke-virtual {v4}, Ln/e;->B()I

    move-result v6

    if-nez v6, :cond_2

    move v6, v1

    goto :goto_2

    :cond_2
    add-int/lit8 v6, v6, -0x1

    invoke-virtual {v4, v6}, Le/c;->j(I)Le/b;

    move-result-object v6

    invoke-virtual {v6}, Le/b;->b()Lk/u;

    move-result-object v6

    sget-object v7, Lk/u;->d:Lk/u;

    invoke-virtual {v6, v7}, Lk/u;->equals(Ljava/lang/Object;)Z

    move-result v6

    :goto_2
    invoke-virtual {v0}, Ln/d;->j()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v3, v7}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v6, :cond_3

    add-int/lit8 v5, v5, -0x1

    neg-int v3, v5

    invoke-virtual {v0, v3}, Ln/d;->s(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {v0, v5}, Ln/d;->s(I)V

    :goto_3
    move v3, v1

    :goto_4
    if-ge v3, v5, :cond_4

    invoke-virtual {v4, v3}, Le/c;->j(I)Le/b;

    move-result-object v7

    invoke-virtual {v7}, Le/b;->b()Lk/u;

    move-result-object v8

    invoke-virtual {p1, v8}, Lg/x;->r(Lk/u;)I

    move-result v8

    invoke-virtual {v0, v8}, Ln/d;->t(I)I

    invoke-virtual {v7}, Le/b;->c()I

    move-result v7

    invoke-virtual {v0, v7}, Ln/d;->t(I)I

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_4
    if-eqz v6, :cond_1

    invoke-virtual {v4, v5}, Le/c;->j(I)Le/b;

    move-result-object v3

    invoke-virtual {v3}, Le/b;->c()I

    move-result v3

    invoke-virtual {v0, v3}, Ln/d;->t(I)I

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Ln/d;->m()[B

    move-result-object p1

    iput-object p1, p0, Lg/c;->c:[B

    return-void

    :cond_6
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "too many catch handlers"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c()I
    .locals 1

    invoke-direct {p0}, Lg/c;->b()V

    iget-object v0, p0, Lg/c;->b:Le/e;

    invoke-virtual {v0}, Ln/e;->B()I

    move-result v0

    return v0
.end method

.method public final d()I
    .locals 2

    invoke-virtual {p0}, Lg/c;->c()I

    move-result v0

    mul-int/lit8 v0, v0, 0x8

    iget-object v1, p0, Lg/c;->c:[B

    array-length v1, v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final e(Ln/d;)V
    .locals 10

    invoke-direct {p0}, Lg/c;->b()V

    invoke-virtual {p1}, Ln/d;->d()Z

    move-result v0

    const-string v1, ".."

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lg/c;->b()V

    iget-object v0, p0, Lg/c;->b:Le/e;

    invoke-virtual {v0}, Ln/e;->B()I

    move-result v0

    const-string v3, "  tries:"

    invoke-virtual {p1, v2, v3}, Ln/d;->b(ILjava/lang/String;)V

    move v3, v2

    :goto_0
    const-string v4, "    "

    if-ge v3, v0, :cond_0

    iget-object v5, p0, Lg/c;->b:Le/e;

    invoke-virtual {v5, v3}, Le/e;->k(I)Le/d;

    move-result-object v5

    invoke-virtual {v5}, Le/d;->c()Le/c;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "    try "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Le/d;->d()I

    move-result v8

    invoke-static {v8}, La/b;->r(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Le/d;->b()I

    move-result v5

    invoke-static {v5}, La/b;->r(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v7, ""

    invoke-virtual {v6, v4, v7}, Le/c;->H(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x6

    invoke-virtual {p1, v6, v5}, Ln/d;->b(ILjava/lang/String;)V

    const/4 v5, 0x2

    invoke-virtual {p1, v5, v4}, Ln/d;->b(ILjava/lang/String;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const-string v0, "  handlers:"

    invoke-virtual {p1, v2, v0}, Ln/d;->b(ILjava/lang/String;)V

    iget v0, p0, Lg/c;->d:I

    iget-object v3, p0, Lg/c;->e:Ljava/util/TreeMap;

    invoke-virtual {v3}, Ljava/util/TreeMap;->size()I

    move-result v3

    invoke-static {v3}, La/b;->q(I)Ljava/lang/String;

    move-result-object v3

    const-string v5, "    size: "

    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v0, v3}, Ln/d;->b(ILjava/lang/String;)V

    iget-object v0, p0, Lg/c;->e:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    move v5, v2

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const-string v7, ": "

    if-eqz v6, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Le/c;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-eqz v3, :cond_1

    sub-int v9, v6, v5

    invoke-static {v5}, La/b;->q(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Le/c;->H(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v9, v3}, Ln/d;->b(ILjava/lang/String;)V

    :cond_1
    move v5, v6

    move-object v3, v8

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lg/c;->c:[B

    array-length v0, v0

    sub-int/2addr v0, v5

    invoke-static {v5}, La/b;->q(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Le/c;->H(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v0, v3}, Ln/d;->b(ILjava/lang/String;)V

    :cond_3
    iget-object v0, p0, Lg/c;->b:Le/e;

    invoke-virtual {v0}, Ln/e;->B()I

    move-result v0

    :goto_2
    if-ge v2, v0, :cond_5

    iget-object v3, p0, Lg/c;->b:Le/e;

    invoke-virtual {v3, v2}, Le/e;->k(I)Le/d;

    move-result-object v3

    invoke-virtual {v3}, Le/d;->d()I

    move-result v4

    invoke-virtual {v3}, Le/d;->b()I

    move-result v5

    sub-int v6, v5, v4

    const/high16 v7, 0x10000

    if-ge v6, v7, :cond_4

    invoke-virtual {p1, v4}, Ln/d;->q(I)V

    invoke-virtual {p1, v6}, Ln/d;->r(I)V

    iget-object v4, p0, Lg/c;->e:Ljava/util/TreeMap;

    invoke-virtual {v3}, Le/d;->c()Le/c;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {p1, v3}, Ln/d;->r(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "bogus exception range: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4}, La/b;->s(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, La/b;->s(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    iget-object v0, p0, Lg/c;->c:[B

    invoke-virtual {p1, v0}, Ln/d;->o([B)V

    return-void
.end method
