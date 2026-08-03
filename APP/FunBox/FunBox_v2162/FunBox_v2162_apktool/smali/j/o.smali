.class public final Lj/o;
.super Ln/e;
.source "SourceFile"

# interfaces
.implements Ll/e;


# static fields
.field public static final c:Lj/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj/o;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj/o;-><init>(I)V

    sput-object v0, Lj/o;->c:Lj/o;

    return-void
.end method

.method static synthetic F(Lj/o;I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ln/e;->s(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method static synthetic G(Lj/o;ILj/m;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Ln/e;->A(ILjava/lang/Object;)V

    return-void
.end method

.method public static H(Lj/m;)Lj/o;
    .locals 2

    new-instance v0, Lj/o;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lj/o;-><init>(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p0}, Ln/e;->A(ILjava/lang/Object;)V

    return-object v0
.end method

.method public static I(Lj/m;Lj/m;)Lj/o;
    .locals 2

    new-instance v0, Lj/o;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lj/o;-><init>(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p0}, Ln/e;->A(ILjava/lang/Object;)V

    const/4 p0, 0x1

    invoke-virtual {v0, p0, p1}, Ln/e;->A(ILjava/lang/Object;)V

    return-object v0
.end method

.method public static J(Lj/m;Lj/m;Lj/m;)Lj/o;
    .locals 2

    new-instance v0, Lj/o;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lj/o;-><init>(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p0}, Ln/e;->A(ILjava/lang/Object;)V

    const/4 p0, 0x1

    invoke-virtual {v0, p0, p1}, Ln/e;->A(ILjava/lang/Object;)V

    const/4 p0, 0x2

    invoke-virtual {v0, p0, p2}, Ln/e;->A(ILjava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public final K(Ljava/util/BitSet;)Lj/o;
    .locals 4

    invoke-virtual {p0}, Ln/e;->B()I

    move-result v0

    invoke-virtual {p1}, Ljava/util/BitSet;->cardinality()I

    move-result v1

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    sget-object p1, Lj/o;->c:Lj/o;

    return-object p1

    :cond_0
    new-instance v1, Lj/o;

    invoke-direct {v1, v0}, Lj/o;-><init>(I)V

    const/4 v0, 0x0

    move v2, v0

    :goto_0
    invoke-virtual {p0}, Ln/e;->B()I

    move-result v3

    if-ge v0, v3, :cond_2

    invoke-virtual {p1, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {p0, v0}, Ln/e;->s(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ln/e;->A(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Ln/j;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v1}, Ln/j;->g()V

    :cond_3
    return-object v1
.end method

.method public final L(ZLjava/util/BitSet;)Lj/o;
    .locals 2

    invoke-virtual {p0}, Ln/e;->B()I

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    new-instance v1, Lj/n;

    invoke-direct {v1, p0, p2, p1}, Lj/n;-><init>(Lj/o;Ljava/util/BitSet;Z)V

    const/4 p1, 0x0

    :goto_0
    if-ge p1, v0, :cond_1

    invoke-static {v1, p1}, Lj/n;->a(Lj/n;I)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lj/n;->b(Lj/n;)Lj/o;

    move-result-object p1

    return-object p1
.end method

.method public final M(Lj/m;)Lj/o;
    .locals 5

    invoke-virtual {p0}, Ln/e;->B()I

    move-result v0

    new-instance v1, Lj/o;

    add-int/lit8 v2, v0, 0x1

    invoke-direct {v1, v2}, Lj/o;-><init>(I)V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_0

    add-int/lit8 v4, v3, 0x1

    invoke-virtual {p0, v3}, Ln/e;->s(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Ln/e;->A(ILjava/lang/Object;)V

    move v3, v4

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v2, p1}, Ln/e;->A(ILjava/lang/Object;)V

    invoke-virtual {p0}, Ln/j;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v1}, Ln/j;->g()V

    :cond_1
    return-object v1
.end method

.method public final N(I)Lj/o;
    .locals 4

    invoke-virtual {p0}, Ln/e;->B()I

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    new-instance v1, Lj/o;

    invoke-direct {v1, v0}, Lj/o;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Ln/e;->s(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj/m;

    invoke-virtual {v3, p1}, Lj/m;->q(I)Lj/m;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ln/e;->A(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ln/j;->e()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v1}, Ln/j;->g()V

    :cond_2
    return-object v1
.end method

.method public final b(I)Ll/c;
    .locals 0

    invoke-virtual {p0, p1}, Lj/o;->p(I)Lj/m;

    move-result-object p1

    invoke-virtual {p1}, Lj/m;->c()Ll/c;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1
.end method
