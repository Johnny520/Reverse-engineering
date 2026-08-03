.class public LSt;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LCx;
.implements LB6;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lwj;

.field public final c:I

.field public d:I

.field public final e:[Ljava/lang/String;

.field public final f:[Ljava/util/List;

.field public final g:[Z

.field public h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;

.field public final j:Ljava/lang/Object;

.field public final k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lwj;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSt;->a:Ljava/lang/String;

    iput-object p2, p0, LSt;->b:Lwj;

    iput p3, p0, LSt;->c:I

    const/4 p1, -0x1

    iput p1, p0, LSt;->d:I

    new-array p1, p3, [Ljava/lang/String;

    const/4 p2, 0x0

    :goto_0
    if-ge p2, p3, :cond_0

    const-string v0, "[UNINITIALIZED]"

    aput-object v0, p1, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    iput-object p1, p0, LSt;->e:[Ljava/lang/String;

    iget p1, p0, LSt;->c:I

    new-array p2, p1, [Ljava/util/List;

    iput-object p2, p0, LSt;->f:[Ljava/util/List;

    new-array p1, p1, [Z

    iput-object p1, p0, LSt;->g:[Z

    sget-object p1, LLf;->a:LLf;

    iput-object p1, p0, LSt;->h:Ljava/lang/Object;

    new-instance p1, LRt;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, LRt;-><init>(LSt;I)V

    const/4 p2, 0x2

    invoke-static {p2, p1}, LDc;->n(ILUi;)LDn;

    move-result-object p1

    iput-object p1, p0, LSt;->i:Ljava/lang/Object;

    new-instance p1, LRt;

    const/4 p3, 0x1

    invoke-direct {p1, p0, p3}, LRt;-><init>(LSt;I)V

    invoke-static {p2, p1}, LDc;->n(ILUi;)LDn;

    move-result-object p1

    iput-object p1, p0, LSt;->j:Ljava/lang/Object;

    new-instance p1, LRt;

    const/4 p3, 0x2

    invoke-direct {p1, p0, p3}, LRt;-><init>(LSt;I)V

    invoke-static {p2, p1}, LDc;->n(ILUi;)LDn;

    move-result-object p1

    iput-object p1, p0, LSt;->k:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, LSt;->h:Ljava/lang/Object;

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

    iget-object v0, p0, LSt;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final c()LfG;
    .locals 1

    sget-object v0, LCz;->g:LCz;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, LSt;->c:I

    return v0
.end method

.method public final e(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LSt;->e:[Ljava/lang/String;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    if-ne p0, p1, :cond_0

    goto/16 :goto_2

    :cond_0
    instance-of v0, p1, LSt;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, p1

    check-cast v0, LCx;

    invoke-interface {v0}, LCx;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LSt;->a:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    check-cast p1, LSt;

    iget-object v2, p0, LSt;->j:Ljava/lang/Object;

    invoke-interface {v2}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [LCx;

    iget-object p1, p1, LSt;->j:Ljava/lang/Object;

    invoke-interface {p1}, LDn;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [LCx;

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {v0}, LCx;->d()I

    move-result p1

    iget v2, p0, LSt;->c:I

    if-eq v2, p1, :cond_4

    goto :goto_1

    :cond_4
    move p1, v1

    :goto_0
    if-ge p1, v2, :cond_7

    invoke-virtual {p0, p1}, LSt;->j(I)LCx;

    move-result-object v3

    invoke-interface {v3}, LCx;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, p1}, LCx;->j(I)LCx;

    move-result-object v4

    invoke-interface {v4}, LCx;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {p0, p1}, LSt;->j(I)LCx;

    move-result-object v3

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

.method public f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final g()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LSt;->h:Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LSt;->k:Ljava/lang/Object;

    invoke-interface {v0}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final i(I)Ljava/util/List;
    .locals 1

    iget-object v0, p0, LSt;->f:[Ljava/util/List;

    aget-object p1, v0, p1

    if-nez p1, :cond_0

    sget-object p1, LKf;->a:LKf;

    :cond_0
    return-object p1
.end method

.method public final j(I)LCx;
    .locals 1

    iget-object v0, p0, LSt;->i:Ljava/lang/Object;

    invoke-interface {v0}, LDn;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LQm;

    aget-object p1, v0, p1

    invoke-interface {p1}, LQm;->getDescriptor()LCx;

    move-result-object p1

    return-object p1
.end method

.method public final k(I)Z
    .locals 1

    iget-object v0, p0, LSt;->g:[Z

    aget-boolean p1, v0, p1

    return p1
.end method

.method public final l(Ljava/lang/String;)V
    .locals 5

    iget v0, p0, LSt;->d:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, LSt;->d:I

    iget-object v2, p0, LSt;->e:[Ljava/lang/String;

    aput-object p1, v2, v0

    iget-object p1, p0, LSt;->g:[Z

    aput-boolean v1, p1, v0

    iget-object p1, p0, LSt;->f:[Ljava/util/List;

    const/4 v3, 0x0

    aput-object v3, p1, v0

    iget p1, p0, LSt;->c:I

    sub-int/2addr p1, v1

    if-ne v0, p1, :cond_1

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    array-length v0, v2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aget-object v4, v2, v1

    invoke-virtual {p1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput-object p1, p0, LSt;->h:Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    iget v1, p0, LSt;->c:I

    invoke-static {v0, v1}, LTB;->J(II)LGl;

    move-result-object v2

    iget-object v0, p0, LSt;->a:Ljava/lang/String;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v6, Ls;

    const/4 v0, 0x4

    invoke-direct {v6, v0, p0}, Ls;-><init>(ILjava/lang/Object;)V

    const/16 v7, 0x18

    const-string v3, ", "

    const-string v5, ")"

    invoke-static/range {v2 .. v7}, Lra;->k0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfj;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
