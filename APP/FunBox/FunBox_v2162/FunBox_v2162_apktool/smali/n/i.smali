.class public abstract Ln/i;
.super Ln/e;
.source "SourceFile"


# instance fields
.field private final c:Ln/g;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0, p1}, Ln/e;-><init>(I)V

    new-instance v0, Ln/g;

    invoke-direct {v0, p1}, Ln/g;-><init>(I)V

    iput-object v0, p0, Ln/i;->c:Ln/g;

    return-void
.end method


# virtual methods
.method public final F()I
    .locals 3

    iget-object v0, p0, Ln/i;->c:Ln/g;

    invoke-virtual {v0}, Ln/g;->o()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_0

    invoke-virtual {v0, v1}, Ln/g;->l(I)I

    move-result v2

    if-gez v2, :cond_0

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ln/g;->n(I)V

    return v1
.end method

.method public final G(I)I
    .locals 2

    iget-object v0, p0, Ln/i;->c:Ln/g;

    invoke-virtual {v0}, Ln/g;->o()I

    move-result v1

    if-lt p1, v1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    invoke-virtual {v0, p1}, Ln/g;->l(I)I

    move-result p1

    return p1
.end method

.method protected final H(ILn/h;)V
    .locals 5

    invoke-virtual {p0, p1}, Ln/e;->t(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln/h;

    invoke-virtual {p0, p1, p2}, Ln/e;->A(ILjava/lang/Object;)V

    const/4 v1, -0x1

    iget-object v2, p0, Ln/i;->c:Ln/g;

    if-eqz v0, :cond_0

    check-cast v0, Lj/a;

    invoke-virtual {v0}, Lj/a;->c()I

    move-result v0

    invoke-virtual {v2, v0, v1}, Ln/g;->m(II)V

    :cond_0
    check-cast p2, Lj/a;

    invoke-virtual {p2}, Lj/a;->c()I

    move-result p2

    invoke-virtual {v2}, Ln/g;->o()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    sub-int v4, p2, v0

    if-gt v3, v4, :cond_1

    invoke-virtual {v2, v1}, Ln/g;->j(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v2, p2, p1}, Ln/g;->m(II)V

    return-void
.end method
