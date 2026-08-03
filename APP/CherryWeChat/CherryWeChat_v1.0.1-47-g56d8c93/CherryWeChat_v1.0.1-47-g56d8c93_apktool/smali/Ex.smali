.class public final LEx;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LCx;
.implements LB6;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:LfG;

.field public final c:I

.field public final d:Ljava/util/HashSet;

.field public final e:[Ljava/lang/String;

.field public final f:[LCx;

.field public final g:[Ljava/util/List;

.field public final h:[Z

.field public final i:Ljava/util/Map;

.field public final j:[LCx;

.field public final k:LcA;


# direct methods
.method public constructor <init>(Ljava/lang/String;LfG;ILjava/util/List;LG9;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEx;->a:Ljava/lang/String;

    iput-object p2, p0, LEx;->b:LfG;

    iput p3, p0, LEx;->c:I

    iget-object p1, p5, LG9;->b:Ljava/util/ArrayList;

    new-instance p2, Ljava/util/HashSet;

    const/16 p3, 0xc

    invoke-static {p1, p3}, Lta;->d0(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-static {p3}, Luq;->K(I)I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/HashSet;-><init>(I)V

    invoke-static {p1, p2}, Lra;->p0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    iput-object p2, p0, LEx;->d:Ljava/util/HashSet;

    const/4 p2, 0x0

    new-array p3, p2, [Ljava/lang/String;

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, LEx;->e:[Ljava/lang/String;

    iget-object p1, p5, LG9;->d:Ljava/util/ArrayList;

    invoke-static {p1}, Lcr;->l(Ljava/util/List;)[LCx;

    move-result-object p1

    iput-object p1, p0, LEx;->f:[LCx;

    iget-object p1, p5, LG9;->e:Ljava/util/ArrayList;

    new-array p3, p2, [Ljava/util/List;

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/util/List;

    iput-object p1, p0, LEx;->g:[Ljava/util/List;

    iget-object p1, p5, LG9;->f:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p3

    new-array p3, p3, [Z

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/Boolean;

    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p5

    add-int/lit8 v0, p2, 0x1

    aput-boolean p5, p3, p2

    move p2, v0

    goto :goto_0

    :cond_0
    iput-object p3, p0, LEx;->h:[Z

    iget-object p1, p0, LEx;->e:[Ljava/lang/String;

    new-instance p2, Ljl;

    new-instance p3, LQ4;

    const/4 p5, 0x0

    invoke-direct {p3, p5, p1}, LQ4;-><init>(ILjava/lang/Object;)V

    const/4 p1, 0x0

    invoke-direct {p2, p1, p3}, Ljl;-><init>(ILjava/lang/Object;)V

    new-instance p1, Ljava/util/ArrayList;

    const/16 p3, 0xa

    invoke-static {p2, p3}, Lta;->d0(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p2}, Ljl;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    move-object p3, p2

    check-cast p3, Lx;

    iget-object p5, p3, Lx;->c:Ljava/lang/Object;

    check-cast p5, Ljava/util/Iterator;

    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_1

    invoke-virtual {p3}, Lx;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lil;

    iget-object p5, p3, Lil;->b:Ljava/lang/Object;

    iget p3, p3, Lil;->a:I

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    new-instance v0, LEt;

    invoke-direct {v0, p5, p3}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-static {p1}, Luq;->M(Ljava/util/ArrayList;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, LEx;->i:Ljava/util/Map;

    invoke-static {p4}, Lcr;->l(Ljava/util/List;)[LCx;

    move-result-object p1

    iput-object p1, p0, LEx;->j:[LCx;

    new-instance p1, LQ4;

    const/4 p2, 0x6

    invoke-direct {p1, p2, p0}, LQ4;-><init>(ILjava/lang/Object;)V

    new-instance p2, LcA;

    invoke-direct {p2, p1}, LcA;-><init>(LUi;)V

    iput-object p2, p0, LEx;->k:LcA;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, LEx;->i:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_0
    const/4 p1, -0x3

    return p1
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LEx;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final c()LfG;
    .locals 1

    iget-object v0, p0, LEx;->b:LfG;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, LEx;->c:I

    return v0
.end method

.method public final e(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LEx;->e:[Ljava/lang/String;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    if-ne p0, p1, :cond_0

    goto :goto_2

    :cond_0
    instance-of v0, p1, LEx;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, p1

    check-cast v0, LCx;

    invoke-interface {v0}, LCx;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LEx;->a:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    check-cast p1, LEx;

    iget-object v2, p0, LEx;->j:[LCx;

    iget-object p1, p1, LEx;->j:[LCx;

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {v0}, LCx;->d()I

    move-result p1

    iget v2, p0, LEx;->c:I

    if-eq v2, p1, :cond_4

    goto :goto_1

    :cond_4
    move p1, v1

    :goto_0
    if-ge p1, v2, :cond_7

    iget-object v3, p0, LEx;->f:[LCx;

    aget-object v4, v3, p1

    invoke-interface {v4}, LCx;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, p1}, LCx;->j(I)LCx;

    move-result-object v5

    invoke-interface {v5}, LCx;->b()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_1

    :cond_5
    aget-object v3, v3, p1

    invoke-interface {v3}, LCx;->c()LfG;

    move-result-object v3

    invoke-interface {v0, p1}, LCx;->j(I)LCx;

    move-result-object v4

    invoke-interface {v4}, LCx;->c()LfG;

    move-result-object v4

    invoke-static {v3, v4}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :goto_1
    return v1

    :cond_6
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_7
    :goto_2
    const/4 p1, 0x1

    return p1
.end method

.method public final f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final g()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LEx;->d:Ljava/util/HashSet;

    return-object v0
.end method

.method public final h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, LEx;->k:LcA;

    invoke-virtual {v0}, LcA;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final i(I)Ljava/util/List;
    .locals 1

    iget-object v0, p0, LEx;->g:[Ljava/util/List;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final j(I)LCx;
    .locals 1

    iget-object v0, p0, LEx;->f:[LCx;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final k(I)Z
    .locals 1

    iget-object v0, p0, LEx;->h:[Z

    aget-boolean p1, v0, p1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    iget v1, p0, LEx;->c:I

    invoke-static {v0, v1}, LTB;->J(II)LGl;

    move-result-object v2

    iget-object v0, p0, LEx;->a:Ljava/lang/String;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ls;

    const/4 v0, 0x6

    invoke-direct {v6, v0, p0}, Ls;-><init>(ILjava/lang/Object;)V

    const/16 v7, 0x18

    const-string v3, ", "

    const-string v5, ")"

    invoke-static/range {v2 .. v7}, Lra;->k0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfj;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
