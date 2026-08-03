.class public final Lj/c;
.super Ln/i;
.source "SourceFile"


# instance fields
.field private d:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, Ln/i;-><init>(I)V

    const/4 p1, -0x1

    iput p1, p0, Lj/c;->d:I

    return-void
.end method


# virtual methods
.method public final I()I
    .locals 4

    invoke-virtual {p0}, Ln/e;->B()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Ln/e;->t(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj/a;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lj/a;->b()Lj/h;

    move-result-object v3

    invoke-virtual {v3}, Ln/e;->B()I

    move-result v3

    add-int/2addr v3, v2

    move v2, v3

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public final J()I
    .locals 8

    iget v0, p0, Lj/c;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    new-instance v0, Lj/b;

    invoke-direct {v0}, Lj/b;-><init>()V

    invoke-virtual {p0}, Ln/e;->B()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-virtual {p0, v3}, Lj/c;->n(I)Lj/a;

    move-result-object v4

    invoke-virtual {v4}, Lj/a;->b()Lj/h;

    move-result-object v4

    invoke-virtual {v4}, Ln/e;->B()I

    move-result v5

    move v6, v2

    :goto_1
    if-ge v6, v5, :cond_0

    invoke-virtual {v4, v6}, Lj/h;->o(I)Lj/g;

    move-result-object v7

    invoke-virtual {v7, v0}, Lj/g;->b(Lj/f;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lj/b;->e()I

    move-result v0

    iput v0, p0, Lj/c;->d:I

    :cond_2
    iget v0, p0, Lj/c;->d:I

    return v0
.end method

.method public final K(I)Lj/a;
    .locals 2

    invoke-virtual {p0, p1}, Ln/i;->G(I)I

    move-result v0

    if-ltz v0, :cond_0

    invoke-virtual {p0, v0}, Lj/c;->n(I)Lj/a;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, La/b;->q(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "no such label: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final L(ILj/a;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Ln/i;->H(ILn/h;)V

    const/4 p1, -0x1

    iput p1, p0, Lj/c;->d:I

    return-void
.end method
