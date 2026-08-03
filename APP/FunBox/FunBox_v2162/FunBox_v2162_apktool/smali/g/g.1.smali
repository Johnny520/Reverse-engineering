.class public final Lg/g;
.super Lg/C;
.source "SourceFile"


# instance fields
.field private final e:Lk/q;

.field private final f:Le/i;

.field private g:Lg/c;

.field private final h:Z

.field private final i:Ll/e;

.field private j:Lg/j;


# direct methods
.method public constructor <init>(Lk/q;Le/i;ZLl/b;)V
    .locals 2

    const/4 v0, 0x4

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1}, Lg/C;-><init>(II)V

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    if-eqz p4, :cond_0

    iput-object p1, p0, Lg/g;->e:Lk/q;

    iput-object p2, p0, Lg/g;->f:Le/i;

    iput-boolean p3, p0, Lg/g;->h:Z

    iput-object p4, p0, Lg/g;->i:Ll/e;

    const/4 p1, 0x0

    iput-object p1, p0, Lg/g;->g:Lg/c;

    iput-object p1, p0, Lg/g;->j:Lg/j;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "throwsList == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "code == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "ref == null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Lg/k;)V
    .locals 6

    invoke-virtual {p1}, Lg/k;->c()Lg/B;

    move-result-object v0

    invoke-virtual {p1}, Lg/k;->q()Lg/x;

    move-result-object v1

    iget-object v2, p0, Lg/g;->f:Le/i;

    invoke-virtual {v2}, Le/i;->k()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Le/i;->j()Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_0
    new-instance v3, Lg/j;

    iget-boolean v4, p0, Lg/g;->h:Z

    iget-object v5, p0, Lg/g;->e:Lk/q;

    invoke-direct {v3, v2, v4, v5}, Lg/j;-><init>(Le/i;ZLk/q;)V

    iput-object v3, p0, Lg/g;->j:Lg/j;

    invoke-virtual {v0, v3}, Lg/B;->o(Lg/C;)V

    :cond_1
    invoke-virtual {v2}, Le/i;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v2}, Le/i;->c()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/c;

    invoke-virtual {v1, v3}, Lg/x;->x(Ll/c;)V

    goto :goto_0

    :cond_2
    new-instance v0, Lg/c;

    invoke-direct {v0, v2}, Lg/c;-><init>(Le/i;)V

    iput-object v0, p0, Lg/g;->g:Lg/c;

    :cond_3
    invoke-virtual {v2}, Le/i;->e()Ljava/util/HashSet;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk/a;

    invoke-virtual {p1, v1}, Lg/k;->t(Lk/a;)V

    goto :goto_1

    :cond_4
    return-void
.end method

.method public final b()Lg/t;
    .locals 1

    sget-object v0, Lg/t;->m:Lg/t;

    return-object v0
.end method

.method protected final j(Lg/E;I)V
    .locals 1

    invoke-virtual {p1}, Lg/E;->d()Lg/k;

    move-result-object p1

    new-instance p2, Lg/f;

    invoke-direct {p2, p1}, Lg/f;-><init>(Lg/k;)V

    iget-object v0, p0, Lg/g;->f:Le/i;

    invoke-virtual {v0, p2}, Le/i;->a(Le/h;)V

    iget-object p2, p0, Lg/g;->g:Lg/c;

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, Lg/c;->a(Lg/k;)V

    iget-object p1, p0, Lg/g;->g:Lg/c;

    invoke-virtual {p1}, Lg/c;->d()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0}, Le/i;->f()Le/k;

    move-result-object p2

    invoke-virtual {p2}, Le/k;->F()I

    move-result p2

    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_1

    add-int/lit8 p2, p2, 0x1

    :cond_1
    mul-int/lit8 p2, p2, 0x2

    add-int/lit8 p2, p2, 0x10

    add-int/2addr p2, p1

    invoke-virtual {p0, p2}, Lg/C;->k(I)V

    return-void
.end method

.method protected final l(Lg/k;Ln/d;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    invoke-virtual/range {p2 .. p2}, Ln/d;->d()Z

    move-result v2

    iget-object v3, v1, Lg/g;->f:Le/i;

    invoke-virtual {v3}, Le/i;->f()Le/k;

    move-result-object v4

    invoke-virtual {v4}, Le/k;->H()I

    move-result v4

    invoke-virtual {v3}, Le/i;->f()Le/k;

    move-result-object v5

    invoke-virtual {v5}, Le/k;->G()I

    move-result v5

    iget-object v6, v1, Lg/g;->e:Lk/q;

    iget-boolean v7, v1, Lg/g;->h:Z

    invoke-virtual {v6, v7}, Lk/d;->i(Z)I

    move-result v7

    invoke-virtual {v3}, Le/i;->f()Le/k;

    move-result-object v8

    invoke-virtual {v8}, Le/k;->F()I

    move-result v8

    and-int/lit8 v9, v8, 0x1

    const/4 v10, 0x0

    if-eqz v9, :cond_0

    const/4 v9, 0x1

    goto :goto_0

    :cond_0
    move v9, v10

    :goto_0
    iget-object v11, v1, Lg/g;->g:Lg/c;

    if-nez v11, :cond_1

    move v11, v10

    goto :goto_1

    :cond_1
    invoke-virtual {v11}, Lg/c;->c()I

    move-result v11

    :goto_1
    iget-object v12, v1, Lg/g;->j:Lg/j;

    if-nez v12, :cond_2

    move v12, v10

    goto :goto_2

    :cond_2
    invoke-virtual {v12}, Lg/C;->f()I

    move-result v12

    :goto_2
    const/4 v13, 0x2

    if-eqz v2, :cond_6

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lg/C;->h()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v15, 0x20

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Lk/p;->a()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0, v10, v14}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v4}, La/b;->q(I)Ljava/lang/String;

    move-result-object v14

    const-string v15, "  registers_size: "

    invoke-virtual {v15, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0, v13, v14}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v7}, La/b;->q(I)Ljava/lang/String;

    move-result-object v14

    const-string v15, "  ins_size:       "

    invoke-virtual {v15, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0, v13, v14}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v5}, La/b;->q(I)Ljava/lang/String;

    move-result-object v14

    const-string v15, "  outs_size:      "

    invoke-virtual {v15, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0, v13, v14}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v11}, La/b;->q(I)Ljava/lang/String;

    move-result-object v14

    const-string v15, "  tries_size:     "

    invoke-virtual {v15, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0, v13, v14}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v12}, La/b;->s(I)Ljava/lang/String;

    move-result-object v14

    const-string v15, "  debug_off:      "

    invoke-virtual {v15, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const/4 v15, 0x4

    invoke-virtual {v0, v15, v14}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v8}, La/b;->s(I)Ljava/lang/String;

    move-result-object v14

    const-string v13, "  insns_size:     "

    invoke-virtual {v13, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0, v15, v13}, Ln/d;->b(ILjava/lang/String;)V

    iget-object v13, v1, Lg/g;->i:Ll/e;

    move-object v14, v13

    check-cast v14, Ln/e;

    invoke-virtual {v14}, Ln/e;->B()I

    move-result v15

    if-eqz v15, :cond_6

    new-instance v15, Ljava/lang/StringBuilder;

    const-string v10, "  throws "

    invoke-direct {v15, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14}, Ln/e;->B()I

    move-result v10

    if-nez v10, :cond_3

    const-string v10, "<empty>"

    move-object/from16 v16, v6

    goto :goto_4

    :cond_3
    new-instance v14, Ljava/lang/StringBuilder;

    move-object/from16 v16, v6

    const/16 v6, 0x64

    invoke-direct {v14, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v6, 0x0

    :goto_3
    if-ge v6, v10, :cond_5

    move/from16 v17, v10

    if-eqz v6, :cond_4

    const-string v10, ", "

    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    invoke-interface {v13, v6}, Ll/e;->b(I)Ll/c;

    move-result-object v10

    invoke-virtual {v10}, Ll/c;->a()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v6, 0x1

    move/from16 v10, v17

    goto :goto_3

    :cond_5
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    :goto_4
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v10, 0x0

    invoke-virtual {v0, v10, v6}, Ln/d;->b(ILjava/lang/String;)V

    goto :goto_5

    :cond_6
    move-object/from16 v16, v6

    :goto_5
    invoke-virtual {v0, v4}, Ln/d;->r(I)V

    invoke-virtual {v0, v7}, Ln/d;->r(I)V

    invoke-virtual {v0, v5}, Ln/d;->r(I)V

    invoke-virtual {v0, v11}, Ln/d;->r(I)V

    invoke-virtual {v0, v12}, Ln/d;->q(I)V

    invoke-virtual {v0, v8}, Ln/d;->q(I)V

    invoke-virtual {v3}, Le/i;->f()Le/k;

    move-result-object v3

    :try_start_0
    invoke-virtual {v3, v0}, Le/k;->J(Ln/d;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v3, v1, Lg/g;->g:Lg/c;

    if-eqz v3, :cond_9

    if-eqz v9, :cond_8

    if-eqz v2, :cond_7

    const-string v3, "  padding: 0"

    const/4 v4, 0x2

    invoke-virtual {v0, v4, v3}, Ln/d;->b(ILjava/lang/String;)V

    :cond_7
    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ln/d;->r(I)V

    goto :goto_6

    :cond_8
    const/4 v3, 0x0

    :goto_6
    iget-object v4, v1, Lg/g;->g:Lg/c;

    invoke-virtual {v4, v0}, Lg/c;->e(Ln/d;)V

    goto :goto_7

    :cond_9
    const/4 v3, 0x0

    :goto_7
    if-eqz v2, :cond_a

    iget-object v2, v1, Lg/g;->j:Lg/j;

    if-eqz v2, :cond_a

    const-string v2, "  debug info"

    invoke-virtual {v0, v3, v2}, Ln/d;->b(ILjava/lang/String;)V

    iget-object v2, v1, Lg/g;->j:Lg/j;

    move-object/from16 v3, p1

    invoke-virtual {v2, v3, v0}, Lg/j;->m(Lg/k;Ln/d;)V

    :cond_a
    return-void

    :catch_0
    move-exception v0

    move-object v2, v0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "...while writing instructions for "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {v16 .. v16}, Lk/p;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lb/a;->b(Ljava/lang/String;Ljava/lang/Exception;)Lb/a;

    move-result-object v0

    throw v0
.end method

.method public final m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg/g;->e:Lk/q;

    invoke-virtual {v0}, Lk/p;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CodeItem{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lg/g;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
