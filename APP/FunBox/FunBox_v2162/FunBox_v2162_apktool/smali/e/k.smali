.class public final Le/k;
.super Ln/e;
.source "SourceFile"


# instance fields
.field private final c:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0, p1}, Ln/e;-><init>(I)V

    iput p2, p0, Le/k;->c:I

    return-void
.end method

.method public static I(ILjava/util/ArrayList;)Le/k;
    .locals 3

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-instance v1, Le/k;

    invoke-direct {v1, v0, p0}, Le/k;-><init>(II)V

    const/4 p0, 0x0

    :goto_0
    if-ge p0, v0, :cond_0

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/j;

    invoke-virtual {v1, p0, v2}, Ln/e;->A(ILjava/lang/Object;)V

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ln/j;->g()V

    return-object v1
.end method


# virtual methods
.method public final F()I
    .locals 2

    invoke-virtual {p0}, Ln/e;->B()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Le/k;->l(I)Le/j;

    move-result-object v0

    invoke-virtual {v0}, Le/j;->h()I

    move-result v1

    invoke-virtual {v0}, Le/j;->b()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final G()I
    .locals 7

    invoke-virtual {p0}, Ln/e;->B()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    if-ge v2, v0, :cond_3

    invoke-virtual {p0, v2}, Ln/e;->s(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le/j;

    instance-of v5, v4, Le/g;

    if-eqz v5, :cond_2

    move-object v5, v4

    check-cast v5, Le/g;

    invoke-virtual {v5}, Le/g;->y()Lk/a;

    move-result-object v5

    instance-of v6, v5, Lk/d;

    if-eqz v6, :cond_1

    check-cast v5, Lk/d;

    invoke-virtual {v4}, Le/j;->k()Le/l;

    move-result-object v4

    invoke-virtual {v4}, Le/l;->a()I

    move-result v4

    const/16 v6, 0x71

    if-ne v4, v6, :cond_0

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    move v4, v1

    :goto_1
    invoke-virtual {v5, v4}, Lk/d;->i(Z)I

    move-result v4

    goto :goto_2

    :cond_1
    move v4, v1

    :goto_2
    if-le v4, v3, :cond_2

    move v3, v4

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return v3
.end method

.method public final H()I
    .locals 1

    iget v0, p0, Le/k;->c:I

    return v0
.end method

.method public final J(Ln/d;)V
    .locals 11

    invoke-virtual {p1}, Ln/d;->j()I

    move-result v0

    invoke-virtual {p0}, Ln/e;->B()I

    move-result v1

    invoke-virtual {p1}, Ln/d;->d()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_6

    invoke-virtual {p1}, Ln/d;->k()Z

    move-result v2

    move v4, v3

    :goto_0
    if-ge v4, v1, :cond_6

    invoke-virtual {p0, v4}, Ln/e;->s(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le/j;

    invoke-virtual {v5}, Le/j;->b()I

    move-result v6

    mul-int/lit8 v6, v6, 0x2

    if-nez v6, :cond_0

    if-eqz v2, :cond_1

    :cond_0
    invoke-virtual {p1}, Ln/d;->h()I

    move-result v7

    invoke-virtual {v5}, Le/j;->q()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_2

    :cond_1
    const/4 v5, 0x0

    goto :goto_2

    :cond_2
    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "  "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Le/j;->p()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ": "

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v9

    if-nez v7, :cond_3

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v7

    goto :goto_1

    :cond_3
    sub-int/2addr v7, v9

    :goto_1
    invoke-static {v5, v9, v8, v7}, Ln/l;->d(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    move-result-object v5

    :goto_2
    if-eqz v5, :cond_4

    :goto_3
    invoke-virtual {p1, v6, v5}, Ln/d;->b(ILjava/lang/String;)V

    goto :goto_4

    :cond_4
    if-eqz v6, :cond_5

    const-string v5, ""

    goto :goto_3

    :cond_5
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_6
    :goto_5
    if-ge v3, v1, :cond_7

    invoke-virtual {p0, v3}, Ln/e;->s(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/j;

    :try_start_0
    invoke-virtual {v2, p1}, Le/j;->x(Ln/d;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "...while writing "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lb/a;->b(Ljava/lang/String;Ljava/lang/Exception;)Lb/a;

    move-result-object p1

    throw p1

    :cond_7
    invoke-virtual {p1}, Ln/d;->j()I

    move-result p1

    sub-int/2addr p1, v0

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {p0}, Le/k;->F()I

    move-result v0

    if-ne p1, v0, :cond_8

    return-void

    :cond_8
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "write length mismatch; expected "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Le/k;->F()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " but actually wrote "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
