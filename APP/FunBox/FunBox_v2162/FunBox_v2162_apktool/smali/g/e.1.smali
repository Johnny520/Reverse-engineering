.class public final Lg/e;
.super Lg/r;
.source "SourceFile"


# instance fields
.field private final b:Lk/u;

.field private final c:I

.field private final d:Lk/u;

.field private e:Lg/I;

.field private final f:Lk/t;

.field private final g:Lg/d;

.field private h:Lg/l;

.field private i:Lg/a;


# direct methods
.method public constructor <init>(Lk/u;ILk/u;Ll/b;Lk/t;)V
    .locals 0

    invoke-direct {p0}, Lg/r;-><init>()V

    if-eqz p1, :cond_2

    if-eqz p4, :cond_1

    iput-object p1, p0, Lg/e;->b:Lk/u;

    iput p2, p0, Lg/e;->c:I

    iput-object p3, p0, Lg/e;->d:Lk/u;

    invoke-virtual {p4}, Ln/e;->B()I

    move-result p2

    const/4 p3, 0x0

    if-nez p2, :cond_0

    move-object p2, p3

    goto :goto_0

    :cond_0
    new-instance p2, Lg/I;

    invoke-direct {p2, p4}, Lg/I;-><init>(Ll/b;)V

    :goto_0
    iput-object p2, p0, Lg/e;->e:Lg/I;

    iput-object p5, p0, Lg/e;->f:Lk/t;

    new-instance p2, Lg/d;

    invoke-direct {p2, p1}, Lg/d;-><init>(Lk/u;)V

    iput-object p2, p0, Lg/e;->g:Lg/d;

    iput-object p3, p0, Lg/e;->h:Lg/l;

    new-instance p1, Lg/a;

    invoke-direct {p1}, Lg/a;-><init>()V

    iput-object p1, p0, Lg/e;->i:Lg/a;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "interfaces == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "thisClass == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Lg/k;)V
    .locals 6

    invoke-virtual {p1}, Lg/k;->q()Lg/x;

    move-result-object v0

    invoke-virtual {p1}, Lg/k;->c()Lg/B;

    move-result-object v1

    invoke-virtual {p1}, Lg/k;->r()Lg/B;

    move-result-object v2

    invoke-virtual {p1}, Lg/k;->p()Lg/x;

    move-result-object v3

    iget-object v4, p0, Lg/e;->b:Lk/u;

    invoke-virtual {v0, v4}, Lg/x;->v(Lk/u;)V

    iget-object v4, p0, Lg/e;->g:Lg/d;

    invoke-virtual {v4}, Lg/d;->s()Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {p1}, Lg/k;->d()Lg/B;

    move-result-object p1

    invoke-virtual {p1, v4}, Lg/B;->o(Lg/C;)V

    invoke-virtual {v4}, Lg/d;->r()Lk/c;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v4, Lg/l;

    invoke-direct {v4, p1}, Lg/l;-><init>(Lk/c;)V

    invoke-virtual {v1, v4}, Lg/B;->p(Lg/C;)Lg/C;

    move-result-object p1

    check-cast p1, Lg/l;

    iput-object p1, p0, Lg/e;->h:Lg/l;

    :cond_0
    iget-object p1, p0, Lg/e;->d:Lk/u;

    if-eqz p1, :cond_1

    invoke-virtual {v0, p1}, Lg/x;->v(Lk/u;)V

    :cond_1
    iget-object p1, p0, Lg/e;->e:Lg/I;

    if-eqz p1, :cond_2

    invoke-virtual {v2, p1}, Lg/B;->p(Lg/C;)Lg/C;

    move-result-object p1

    check-cast p1, Lg/I;

    iput-object p1, p0, Lg/e;->e:Lg/I;

    :cond_2
    iget-object p1, p0, Lg/e;->f:Lk/t;

    if-eqz p1, :cond_3

    invoke-virtual {v3, p1}, Lg/x;->u(Lk/t;)V

    :cond_3
    iget-object p1, p0, Lg/e;->i:Lg/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final b()Lg/t;
    .locals 1

    sget-object v0, Lg/t;->i:Lg/t;

    return-object v0
.end method

.method public final c()I
    .locals 1

    const/16 v0, 0x20

    return v0
.end method

.method public final d(Lg/k;Ln/d;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-virtual/range {p2 .. p2}, Ln/d;->d()Z

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lg/k;->q()Lg/x;

    move-result-object v3

    iget-object v4, v0, Lg/e;->b:Lk/u;

    invoke-virtual {v3, v4}, Lg/x;->r(Lk/u;)I

    move-result v5

    const/4 v6, -0x1

    iget-object v7, v0, Lg/e;->d:Lk/u;

    if-nez v7, :cond_0

    move v3, v6

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v7}, Lg/x;->r(Lk/u;)I

    move-result v3

    :goto_0
    iget-object v8, v0, Lg/e;->e:Lg/I;

    const/4 v9, 0x0

    if-nez v8, :cond_1

    move v8, v9

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lg/C;->f()I

    move-result v8

    :goto_1
    iget-object v10, v0, Lg/e;->i:Lg/a;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v10, v0, Lg/e;->f:Lk/t;

    if-nez v10, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lg/k;->p()Lg/x;

    move-result-object v6

    invoke-virtual {v6, v10}, Lg/x;->q(Lk/t;)I

    move-result v6

    :goto_2
    iget-object v11, v0, Lg/e;->g:Lg/d;

    invoke-virtual {v11}, Lg/d;->s()Z

    move-result v12

    if-eqz v12, :cond_3

    move v11, v9

    goto :goto_3

    :cond_3
    invoke-virtual {v11}, Lg/C;->f()I

    move-result v11

    :goto_3
    iget-object v12, v0, Lg/e;->h:Lg/l;

    if-nez v12, :cond_4

    move v12, v9

    goto :goto_4

    :cond_4
    invoke-virtual {v12}, Lg/C;->f()I

    move-result v12

    :goto_4
    iget v13, v0, Lg/e;->c:I

    if-eqz v2, :cond_8

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lg/r;->g()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v14, 0x20

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lk/u;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v9, v2}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v5}, La/b;->s(I)Ljava/lang/String;

    move-result-object v2

    const-string v4, "  class_idx:           "

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    invoke-virtual {v1, v4, v2}, Ln/d;->b(ILjava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v14, "  access_flags:        "

    invoke-direct {v2, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v13}, La/b;->f(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Ln/d;->b(ILjava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v14, "  superclass_idx:      "

    invoke-direct {v2, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, La/b;->s(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, " // "

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, "<none>"

    if-nez v7, :cond_5

    move-object v7, v15

    goto :goto_5

    :cond_5
    invoke-virtual {v7}, Lk/u;->a()Ljava/lang/String;

    move-result-object v7

    :goto_5
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v8}, La/b;->s(I)Ljava/lang/String;

    move-result-object v2

    const-string v7, "  interfaces_off:      "

    invoke-virtual {v7, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Ln/d;->b(ILjava/lang/String;)V

    if-eqz v8, :cond_6

    iget-object v2, v0, Lg/e;->e:Lg/I;

    invoke-virtual {v2}, Lg/I;->m()Ll/e;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ln/e;

    invoke-virtual {v7}, Ln/e;->B()I

    move-result v7

    move v4, v9

    :goto_6
    if-ge v4, v7, :cond_6

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v0, "    "

    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v2, v4}, Ll/e;->b(I)Ll/c;

    move-result-object v0

    invoke-virtual {v0}, Ll/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v9, 0x0

    invoke-virtual {v1, v9, v0}, Ln/d;->b(ILjava/lang/String;)V

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v0, p0

    const/4 v9, 0x0

    goto :goto_6

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "  source_file_idx:     "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, La/b;->s(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v10, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v10}, Lk/t;->a()Ljava/lang/String;

    move-result-object v15

    :goto_7
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x4

    invoke-virtual {v1, v2, v0}, Ln/d;->b(ILjava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {v0}, La/b;->s(I)Ljava/lang/String;

    move-result-object v4

    const-string v0, "  annotations_off:     "

    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v11}, La/b;->s(I)Ljava/lang/String;

    move-result-object v0

    const-string v4, "  class_data_off:      "

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v12}, La/b;->s(I)Ljava/lang/String;

    move-result-object v0

    const-string v4, "  static_values_off:   "

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ln/d;->b(ILjava/lang/String;)V

    :cond_8
    invoke-virtual {v1, v5}, Ln/d;->q(I)V

    invoke-virtual {v1, v13}, Ln/d;->q(I)V

    invoke-virtual {v1, v3}, Ln/d;->q(I)V

    invoke-virtual {v1, v8}, Ln/d;->q(I)V

    invoke-virtual {v1, v6}, Ln/d;->q(I)V

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ln/d;->q(I)V

    invoke-virtual {v1, v11}, Ln/d;->q(I)V

    invoke-virtual {v1, v12}, Ln/d;->q(I)V

    return-void
.end method

.method public final i(Lg/n;)V
    .locals 1

    iget-object v0, p0, Lg/e;->g:Lg/d;

    invoke-virtual {v0, p1}, Lg/d;->m(Lg/n;)V

    return-void
.end method

.method public final j(Lg/n;)V
    .locals 1

    iget-object v0, p0, Lg/e;->g:Lg/d;

    invoke-virtual {v0, p1}, Lg/d;->n(Lg/n;)V

    return-void
.end method

.method public final k()Ll/e;
    .locals 1

    iget-object v0, p0, Lg/e;->e:Lg/I;

    if-nez v0, :cond_0

    sget-object v0, Ll/b;->c:Ll/b;

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lg/I;->m()Ll/e;

    move-result-object v0

    return-object v0
.end method

.method public final l()Lk/u;
    .locals 1

    iget-object v0, p0, Lg/e;->d:Lk/u;

    return-object v0
.end method

.method public final m()Lk/u;
    .locals 1

    iget-object v0, p0, Lg/e;->b:Lk/u;

    return-object v0
.end method
