.class public final Lg/I;
.super Lg/C;
.source "SourceFile"


# instance fields
.field private final e:Ll/e;


# direct methods
.method public constructor <init>(Ll/b;)V
    .locals 2

    invoke-virtual {p1}, Ln/e;->B()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    const/4 v1, 0x4

    add-int/2addr v0, v1

    invoke-direct {p0, v1, v0}, Lg/C;-><init>(II)V

    iput-object p1, p0, Lg/I;->e:Ll/e;

    return-void
.end method


# virtual methods
.method public final a(Lg/k;)V
    .locals 4

    invoke-virtual {p1}, Lg/k;->q()Lg/x;

    move-result-object p1

    iget-object v0, p0, Lg/I;->e:Ll/e;

    move-object v1, v0

    check-cast v1, Ln/e;

    invoke-virtual {v1}, Ln/e;->B()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {v0, v2}, Ll/e;->b(I)Ll/c;

    move-result-object v3

    invoke-virtual {p1, v3}, Lg/x;->x(Ll/c;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b()Lg/t;
    .locals 1

    sget-object v0, Lg/t;->k:Lg/t;

    return-object v0
.end method

.method protected final e(Lg/C;)I
    .locals 8

    check-cast p1, Lg/I;

    iget-object p1, p1, Lg/I;->e:Ll/e;

    sget-object v0, Ll/b;->c:Ll/b;

    iget-object v0, p0, Lg/I;->e:Ll/e;

    move-object v1, v0

    check-cast v1, Ln/e;

    invoke-virtual {v1}, Ln/e;->B()I

    move-result v1

    move-object v2, p1

    check-cast v2, Ln/e;

    invoke-virtual {v2}, Ln/e;->B()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_1

    invoke-interface {v0, v5}, Ll/e;->b(I)Ll/c;

    move-result-object v6

    invoke-interface {p1, v5}, Ll/e;->b(I)Ll/c;

    move-result-object v7

    invoke-virtual {v6, v7}, Ll/c;->b(Ll/c;)I

    move-result v6

    if-eqz v6, :cond_0

    move v4, v6

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    if-ne v1, v2, :cond_2

    goto :goto_1

    :cond_2
    if-ge v1, v2, :cond_3

    const/4 v4, -0x1

    goto :goto_1

    :cond_3
    const/4 v4, 0x1

    :goto_1
    return v4
.end method

.method public final hashCode()I
    .locals 5

    sget-object v0, Ll/b;->c:Ll/b;

    iget-object v0, p0, Lg/I;->e:Ll/e;

    move-object v1, v0

    check-cast v1, Ln/e;

    invoke-virtual {v1}, Ln/e;->B()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_0

    mul-int/lit8 v3, v3, 0x1f

    invoke-interface {v0, v2}, Ll/e;->b(I)Ll/c;

    move-result-object v4

    invoke-virtual {v4}, Ll/c;->hashCode()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v3
.end method

.method protected final l(Lg/k;Ln/d;)V
    .locals 8

    invoke-virtual {p1}, Lg/k;->q()Lg/x;

    move-result-object p1

    iget-object v0, p0, Lg/I;->e:Ll/e;

    move-object v1, v0

    check-cast v1, Ln/e;

    invoke-virtual {v1}, Ln/e;->B()I

    move-result v1

    invoke-virtual {p2}, Ln/d;->d()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lg/C;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " type_list"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v3, v2}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v1}, La/b;->s(I)Ljava/lang/String;

    move-result-object v2

    const-string v4, "  size: "

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    invoke-virtual {p2, v4, v2}, Ln/d;->b(ILjava/lang/String;)V

    move v2, v3

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {v0, v2}, Ll/e;->b(I)Ll/c;

    move-result-object v4

    invoke-virtual {p1, v4}, Lg/x;->t(Ll/c;)I

    move-result v5

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "  "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v5}, La/b;->q(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " // "

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ll/c;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x2

    invoke-virtual {p2, v5, v4}, Ln/d;->b(ILjava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p2, v1}, Ln/d;->q(I)V

    :goto_1
    if-ge v3, v1, :cond_1

    invoke-interface {v0, v3}, Ll/e;->b(I)Ll/c;

    move-result-object v2

    invoke-virtual {p1, v2}, Lg/x;->t(Ll/c;)I

    move-result v2

    invoke-virtual {p2, v2}, Ln/d;->r(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final m()Ll/e;
    .locals 1

    iget-object v0, p0, Lg/I;->e:Ll/e;

    return-object v0
.end method
