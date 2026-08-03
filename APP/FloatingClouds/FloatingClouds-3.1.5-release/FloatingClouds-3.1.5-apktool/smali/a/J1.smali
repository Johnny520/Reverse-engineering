.class public final La/J1;
.super La/ge;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "La/ge<",
        "TK;TV;>;",
        "Ljava/util/Map<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public h:La/I1;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, La/ge;-><init>()V

    return-void
.end method

.method public constructor <init>(La/ge;)V
    .locals 4

    .line 2
    invoke-direct {p0}, La/ge;-><init>()V

    if-eqz p1, :cond_1

    .line 3
    iget v0, p1, La/ge;->c:I

    .line 4
    iget v1, p0, La/ge;->c:I

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, La/ge;->b(I)V

    .line 5
    iget v1, p0, La/ge;->c:I

    const/4 v2, 0x0

    if-nez v1, :cond_0

    if-lez v0, :cond_1

    .line 6
    iget-object v1, p1, La/ge;->a:[I

    iget-object v3, p0, La/ge;->a:[I

    invoke-static {v1, v2, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 7
    iget-object p1, p1, La/ge;->b:[Ljava/lang/Object;

    iget-object v1, p0, La/ge;->b:[Ljava/lang/Object;

    shl-int/lit8 v3, v0, 0x1

    invoke-static {p1, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8
    iput v0, p0, La/ge;->c:I

    return-void

    :cond_0
    :goto_0
    if-ge v2, v0, :cond_1

    .line 9
    invoke-virtual {p1, v2}, La/ge;->h(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v2}, La/ge;->j(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v1, v3}, La/ge;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final entrySet()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, La/J1;->h:La/I1;

    if-nez v0, :cond_0

    new-instance v0, La/I1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, La/I1;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, La/J1;->h:La/I1;

    :cond_0
    iget-object v0, p0, La/J1;->h:La/I1;

    iget-object v1, v0, La/Z9;->a:La/Z9$b;

    if-nez v1, :cond_1

    new-instance v1, La/Z9$b;

    invoke-direct {v1, v0}, La/Z9$b;-><init>(La/Z9;)V

    iput-object v1, v0, La/Z9;->a:La/Z9$b;

    :cond_1
    iget-object v0, v0, La/Z9;->a:La/Z9$b;

    return-object v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, La/J1;->h:La/I1;

    if-nez v0, :cond_0

    new-instance v0, La/I1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, La/I1;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, La/J1;->h:La/I1;

    :cond_0
    iget-object v0, p0, La/J1;->h:La/I1;

    iget-object v1, v0, La/Z9;->b:La/Z9$c;

    if-nez v1, :cond_1

    new-instance v1, La/Z9$c;

    invoke-direct {v1, v0}, La/Z9$c;-><init>(La/Z9;)V

    iput-object v1, v0, La/Z9;->b:La/Z9$c;

    :cond_1
    iget-object v0, v0, La/Z9;->b:La/Z9$c;

    return-object v0
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "+TK;+TV;>;)V"
        }
    .end annotation

    iget v0, p0, La/ge;->c:I

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, La/ge;->b(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, La/ge;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final values()Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    iget-object v0, p0, La/J1;->h:La/I1;

    if-nez v0, :cond_0

    new-instance v0, La/I1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, La/I1;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, La/J1;->h:La/I1;

    :cond_0
    iget-object v0, p0, La/J1;->h:La/I1;

    iget-object v1, v0, La/Z9;->c:La/Z9$e;

    if-nez v1, :cond_1

    new-instance v1, La/Z9$e;

    invoke-direct {v1, v0}, La/Z9$e;-><init>(La/Z9;)V

    iput-object v1, v0, La/Z9;->c:La/Z9$e;

    :cond_1
    iget-object v0, v0, La/Z9;->c:La/Z9$e;

    return-object v0
.end method
