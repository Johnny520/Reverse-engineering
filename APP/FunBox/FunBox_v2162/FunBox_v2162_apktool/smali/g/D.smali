.class public final Lg/D;
.super Lg/r;
.source "SourceFile"


# instance fields
.field private final b:Ll/a;

.field private final c:Lk/t;

.field private d:Lg/I;


# direct methods
.method public constructor <init>(Ll/a;)V
    .locals 8

    invoke-direct {p0}, Lg/r;-><init>()V

    if-eqz p1, :cond_4

    iput-object p1, p0, Lg/D;->b:Ll/a;

    invoke-virtual {p1}, Ll/a;->d()Ll/b;

    move-result-object v0

    invoke-virtual {v0}, Ln/e;->B()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/lit8 v3, v1, 0x1

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p1}, Ll/a;->e()Ll/c;

    move-result-object v3

    invoke-virtual {v3}, Ll/c;->h()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v5, 0x4c

    const/16 v6, 0x5b

    if-ne v3, v6, :cond_0

    move v3, v5

    :cond_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v3, v4

    :goto_0
    if-ge v3, v1, :cond_2

    invoke-virtual {v0, v3}, Ll/b;->r(I)Ll/c;

    move-result-object v7

    invoke-virtual {v7}, Ll/c;->h()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-ne v7, v6, :cond_1

    move v7, v5

    :cond_1
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    new-instance v0, Lk/t;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lk/t;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lg/D;->c:Lk/t;

    invoke-virtual {p1}, Ll/a;->d()Ll/b;

    move-result-object p1

    invoke-virtual {p1}, Ln/e;->B()I

    move-result v0

    if-nez v0, :cond_3

    const/4 p1, 0x0

    goto :goto_1

    :cond_3
    new-instance v0, Lg/I;

    invoke-direct {v0, p1}, Lg/I;-><init>(Ll/b;)V

    move-object p1, v0

    :goto_1
    iput-object p1, p0, Lg/D;->d:Lg/I;

    return-void

    :cond_4
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "prototype == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Lg/k;)V
    .locals 3

    invoke-virtual {p1}, Lg/k;->p()Lg/x;

    move-result-object v0

    invoke-virtual {p1}, Lg/k;->q()Lg/x;

    move-result-object v1

    invoke-virtual {p1}, Lg/k;->r()Lg/B;

    move-result-object p1

    iget-object v2, p0, Lg/D;->b:Ll/a;

    invoke-virtual {v2}, Ll/a;->e()Ll/c;

    move-result-object v2

    invoke-virtual {v1, v2}, Lg/x;->x(Ll/c;)V

    iget-object v1, p0, Lg/D;->c:Lk/t;

    invoke-virtual {v0, v1}, Lg/x;->u(Lk/t;)V

    iget-object v0, p0, Lg/D;->d:Lg/I;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Lg/B;->p(Lg/C;)Lg/C;

    move-result-object p1

    check-cast p1, Lg/I;

    iput-object p1, p0, Lg/D;->d:Lg/I;

    :cond_0
    return-void
.end method

.method public final b()Lg/t;
    .locals 1

    sget-object v0, Lg/t;->g:Lg/t;

    return-object v0
.end method

.method public final c()I
    .locals 1

    const/16 v0, 0xc

    return v0
.end method

.method public final d(Lg/k;Ln/d;)V
    .locals 10

    invoke-virtual {p1}, Lg/k;->p()Lg/x;

    move-result-object v0

    iget-object v1, p0, Lg/D;->c:Lk/t;

    invoke-virtual {v0, v1}, Lg/x;->q(Lk/t;)I

    move-result v0

    invoke-virtual {p1}, Lg/k;->q()Lg/x;

    move-result-object p1

    iget-object v2, p0, Lg/D;->b:Ll/a;

    invoke-virtual {v2}, Ll/a;->e()Ll/c;

    move-result-object v3

    invoke-virtual {p1, v3}, Lg/x;->t(Ll/c;)I

    move-result p1

    iget-object v3, p0, Lg/D;->d:Lg/I;

    const/4 v4, 0x0

    if-nez v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lg/C;->f()I

    move-result v3

    :goto_0
    invoke-virtual {p2}, Ln/d;->d()Z

    move-result v5

    if-eqz v5, :cond_3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ll/a;->e()Ll/c;

    move-result-object v6

    invoke-virtual {v6}, Ll/c;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " proto("

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ll/a;->d()Ll/b;

    move-result-object v6

    invoke-virtual {v6}, Ln/e;->B()I

    move-result v7

    move v8, v4

    :goto_1
    if-ge v8, v7, :cond_2

    if-eqz v8, :cond_1

    const-string v9, ", "

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v6, v8}, Ll/b;->r(I)Ll/c;

    move-result-object v9

    invoke-virtual {v9}, Ll/c;->a()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    const-string v6, ")"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lg/r;->g()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v7, 0x20

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v4, v5}, Ln/d;->b(ILjava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "  shorty_idx:      "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, La/b;->s(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " // "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lk/t;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x4

    invoke-virtual {p2, v4, v1}, Ln/d;->b(ILjava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v6, "  return_type_idx: "

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, La/b;->s(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ll/a;->e()Ll/c;

    move-result-object v2

    invoke-virtual {v2}, Ll/c;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v4, v1}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v3}, La/b;->s(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "  parameters_off:  "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v4, v1}, Ln/d;->b(ILjava/lang/String;)V

    :cond_3
    invoke-virtual {p2, v0}, Ln/d;->q(I)V

    invoke-virtual {p2, p1}, Ln/d;->q(I)V

    invoke-virtual {p2, v3}, Ln/d;->q(I)V

    return-void
.end method
