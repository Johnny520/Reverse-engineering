.class public final Lg/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ld/a;

.field private final b:Lg/B;

.field private final c:Lg/B;

.field private final d:Lg/B;

.field private final e:Lg/B;

.field private final f:Lg/x;

.field private final g:Lg/x;

.field private final h:Lg/x;

.field private final i:Lg/o;

.field private final j:Lg/z;

.field private final k:Lg/b;

.field private final l:Lg/B;

.field private final m:Lg/b;

.field private final n:Lg/x;

.field private final o:Lg/B;

.field private final p:Lg/x;

.field private final q:[Lg/E;

.field private r:I


# direct methods
.method public constructor <init>(Ld/a;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lg/k;->a:Ld/a;

    new-instance v2, Lg/x;

    const/4 v3, 0x4

    invoke-direct {v2, v0, v3}, Lg/x;-><init>(Lg/k;I)V

    iput-object v2, v0, Lg/k;->p:Lg/x;

    new-instance v11, Lg/B;

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-direct {v11, v4, v0, v3, v5}, Lg/B;-><init>(Ljava/lang/String;Lg/k;II)V

    iput-object v11, v0, Lg/k;->c:Lg/B;

    new-instance v10, Lg/B;

    const-string v6, "word_data"

    const/4 v7, 0x2

    invoke-direct {v10, v6, v0, v3, v7}, Lg/B;-><init>(Ljava/lang/String;Lg/k;II)V

    iput-object v10, v0, Lg/k;->b:Lg/B;

    new-instance v12, Lg/B;

    const-string v3, "string_data"

    const/4 v6, 0x3

    invoke-direct {v12, v3, v0, v5, v6}, Lg/B;-><init>(Ljava/lang/String;Lg/k;II)V

    iput-object v12, v0, Lg/k;->e:Lg/B;

    new-instance v14, Lg/B;

    invoke-direct {v14, v4, v0, v5, v5}, Lg/B;-><init>(Ljava/lang/String;Lg/k;II)V

    iput-object v14, v0, Lg/k;->l:Lg/B;

    new-instance v13, Lg/B;

    const-string v3, "byte_data"

    invoke-direct {v13, v3, v0, v5, v7}, Lg/B;-><init>(Ljava/lang/String;Lg/k;II)V

    iput-object v13, v0, Lg/k;->o:Lg/B;

    new-instance v3, Lg/x;

    invoke-direct {v3, v0, v7}, Lg/x;-><init>(Lg/k;I)V

    iput-object v3, v0, Lg/k;->f:Lg/x;

    new-instance v4, Lg/x;

    invoke-direct {v4, v0, v6}, Lg/x;-><init>(Lg/k;I)V

    iput-object v4, v0, Lg/k;->g:Lg/x;

    new-instance v6, Lg/x;

    invoke-direct {v6, v0, v5}, Lg/x;-><init>(Lg/k;I)V

    iput-object v6, v0, Lg/k;->h:Lg/x;

    new-instance v7, Lg/o;

    invoke-direct {v7, v0}, Lg/o;-><init>(Lg/k;)V

    iput-object v7, v0, Lg/k;->i:Lg/o;

    new-instance v8, Lg/z;

    invoke-direct {v8, v0}, Lg/z;-><init>(Lg/k;)V

    iput-object v8, v0, Lg/k;->j:Lg/z;

    new-instance v9, Lg/b;

    invoke-direct {v9, v0, v5}, Lg/b;-><init>(Lg/k;I)V

    iput-object v9, v0, Lg/k;->k:Lg/b;

    new-instance v15, Lg/B;

    move-object/from16 v16, v14

    const-string v14, "map"

    move-object/from16 v17, v13

    const/4 v13, 0x4

    invoke-direct {v15, v14, v0, v13, v5}, Lg/B;-><init>(Ljava/lang/String;Lg/k;II)V

    iput-object v15, v0, Lg/k;->d:Lg/B;

    const/16 v13, 0x1a

    iget v1, v1, Ld/a;->a:I

    const/4 v14, 0x0

    if-lt v1, v13, :cond_0

    goto :goto_0

    :cond_0
    move v5, v14

    :goto_0
    if-eqz v5, :cond_1

    new-instance v13, Lg/b;

    invoke-direct {v13, v0, v14}, Lg/b;-><init>(Lg/k;I)V

    iput-object v13, v0, Lg/k;->m:Lg/b;

    new-instance v5, Lg/x;

    invoke-direct {v5, v0, v14}, Lg/x;-><init>(Lg/k;I)V

    iput-object v5, v0, Lg/k;->n:Lg/x;

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v6

    move-object v14, v5

    move-object v5, v7

    move-object v6, v8

    move-object v7, v9

    move-object v8, v13

    move-object v9, v14

    move-object/from16 v13, v17

    move-object/from16 v14, v16

    filled-new-array/range {v1 .. v15}, [Lg/E;

    move-result-object v1

    iput-object v1, v0, Lg/k;->q:[Lg/E;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    iput-object v1, v0, Lg/k;->m:Lg/b;

    iput-object v1, v0, Lg/k;->n:Lg/x;

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v6

    move-object v5, v7

    move-object v6, v8

    move-object v7, v9

    move-object v8, v10

    move-object v9, v11

    move-object v10, v12

    move-object/from16 v11, v17

    move-object/from16 v12, v16

    move-object v13, v15

    filled-new-array/range {v1 .. v13}, [Lg/E;

    move-result-object v1

    iput-object v1, v0, Lg/k;->q:[Lg/E;

    :goto_1
    const/4 v1, -0x1

    iput v1, v0, Lg/k;->r:I

    return-void
.end method


# virtual methods
.method public final a(Lg/e;)V
    .locals 1

    iget-object v0, p0, Lg/k;->k:Lg/b;

    invoke-virtual {v0, p1}, Lg/b;->p(Lg/e;)V

    return-void
.end method

.method final b(Lk/a;)Lg/r;
    .locals 1

    instance-of v0, p1, Lk/t;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg/k;->f:Lg/x;

    invoke-virtual {v0, p1}, Lg/x;->p(Lk/a;)Lg/r;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lk/u;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lg/k;->g:Lg/x;

    invoke-virtual {v0, p1}, Lg/x;->p(Lk/a;)Lg/r;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Lk/d;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lg/k;->j:Lg/z;

    invoke-virtual {v0, p1}, Lg/z;->p(Lk/a;)Lg/r;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method final c()Lg/B;
    .locals 1

    iget-object v0, p0, Lg/k;->o:Lg/B;

    return-object v0
.end method

.method final d()Lg/B;
    .locals 1

    iget-object v0, p0, Lg/k;->l:Lg/B;

    return-object v0
.end method

.method public final e()Lg/b;
    .locals 1

    iget-object v0, p0, Lg/k;->k:Lg/b;

    return-object v0
.end method

.method public final f()Ld/a;
    .locals 1

    iget-object v0, p0, Lg/k;->a:Ld/a;

    return-object v0
.end method

.method public final g()Lg/o;
    .locals 1

    iget-object v0, p0, Lg/k;->i:Lg/o;

    return-object v0
.end method

.method public final h()I
    .locals 2

    iget v0, p0, Lg/k;->r:I

    if-ltz v0, :cond_0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "file size not yet known"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method final i()Lg/B;
    .locals 1

    iget-object v0, p0, Lg/k;->b:Lg/B;

    return-object v0
.end method

.method final j()Lg/B;
    .locals 1

    iget-object v0, p0, Lg/k;->d:Lg/B;

    return-object v0
.end method

.method final k()Lg/B;
    .locals 1

    iget-object v0, p0, Lg/k;->d:Lg/B;

    return-object v0
.end method

.method public final l()Lg/x;
    .locals 1

    iget-object v0, p0, Lg/k;->n:Lg/x;

    return-object v0
.end method

.method public final m()Lg/z;
    .locals 1

    iget-object v0, p0, Lg/k;->j:Lg/z;

    return-object v0
.end method

.method final n()Lg/x;
    .locals 1

    iget-object v0, p0, Lg/k;->h:Lg/x;

    return-object v0
.end method

.method final o()Lg/B;
    .locals 1

    iget-object v0, p0, Lg/k;->e:Lg/B;

    return-object v0
.end method

.method final p()Lg/x;
    .locals 1

    iget-object v0, p0, Lg/k;->f:Lg/x;

    return-object v0
.end method

.method public final q()Lg/x;
    .locals 1

    iget-object v0, p0, Lg/k;->g:Lg/x;

    return-object v0
.end method

.method final r()Lg/B;
    .locals 1

    iget-object v0, p0, Lg/k;->c:Lg/B;

    return-object v0
.end method

.method final s()Lg/B;
    .locals 1

    iget-object v0, p0, Lg/k;->b:Lg/B;

    return-object v0
.end method

.method final t(Lk/a;)V
    .locals 1

    if-eqz p1, :cond_3

    instance-of v0, p1, Lk/t;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg/k;->f:Lg/x;

    check-cast p1, Lk/t;

    invoke-virtual {v0, p1}, Lg/x;->u(Lk/t;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lk/u;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lg/k;->g:Lg/x;

    check-cast p1, Lk/u;

    invoke-virtual {v0, p1}, Lg/x;->v(Lk/u;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lk/d;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lg/k;->j:Lg/z;

    check-cast p1, Lk/d;

    invoke-virtual {v0, p1}, Lg/z;->r(Lk/d;)V

    :cond_2
    :goto_0
    return-void

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "cst == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final u()[B
    .locals 12

    iget-object v0, p0, Lg/k;->k:Lg/b;

    invoke-virtual {v0}, Lg/E;->g()V

    iget-object v0, p0, Lg/k;->l:Lg/B;

    invoke-virtual {v0}, Lg/E;->g()V

    iget-object v0, p0, Lg/k;->b:Lg/B;

    invoke-virtual {v0}, Lg/E;->g()V

    iget-object v0, p0, Lg/k;->a:Ld/a;

    iget v1, v0, Ld/a;->a:I

    const/16 v2, 0x1a

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-lt v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    iget-object v5, p0, Lg/k;->m:Lg/b;

    if-eqz v1, :cond_1

    invoke-virtual {v5}, Lg/E;->g()V

    :cond_1
    iget-object v1, p0, Lg/k;->o:Lg/B;

    invoke-virtual {v1}, Lg/E;->g()V

    iget v0, v0, Ld/a;->a:I

    if-lt v0, v2, :cond_2

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_1
    iget-object v0, p0, Lg/k;->n:Lg/x;

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Lg/E;->g()V

    :cond_3
    iget-object v1, p0, Lg/k;->j:Lg/z;

    invoke-virtual {v1}, Lg/E;->g()V

    iget-object v1, p0, Lg/k;->i:Lg/o;

    invoke-virtual {v1}, Lg/E;->g()V

    iget-object v1, p0, Lg/k;->h:Lg/x;

    invoke-virtual {v1}, Lg/E;->g()V

    iget-object v1, p0, Lg/k;->c:Lg/B;

    invoke-virtual {v1}, Lg/E;->g()V

    iget-object v1, p0, Lg/k;->g:Lg/x;

    invoke-virtual {v1}, Lg/E;->g()V

    iget-object v1, p0, Lg/k;->f:Lg/x;

    invoke-virtual {v1}, Lg/E;->g()V

    iget-object v1, p0, Lg/k;->e:Lg/B;

    invoke-virtual {v1}, Lg/E;->g()V

    iget-object v1, p0, Lg/k;->p:Lg/x;

    invoke-virtual {v1}, Lg/E;->g()V

    iget-object v1, p0, Lg/k;->q:[Lg/E;

    array-length v2, v1

    move v3, v4

    move v6, v3

    :goto_2
    const-string v7, "...while writing section "

    if-ge v3, v2, :cond_9

    aget-object v8, v1, v3

    if-eq v8, v5, :cond_4

    if-ne v8, v0, :cond_5

    :cond_4
    invoke-virtual {v8}, Lg/E;->f()Ljava/util/Collection;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v8, v6}, Lg/E;->i(I)I

    move-result v9

    if-lt v9, v6, :cond_8

    iget-object v6, p0, Lg/k;->d:Lg/B;

    if-ne v8, v6, :cond_6

    :try_start_0
    invoke-static {v1, v6}, Lg/u;->m([Lg/E;Lg/B;)V

    invoke-virtual {v6}, Lg/E;->g()V

    :cond_6
    instance-of v6, v8, Lg/B;

    if-eqz v6, :cond_7

    move-object v6, v8

    check-cast v6, Lg/B;

    invoke-virtual {v6}, Lg/B;->q()V

    :cond_7
    invoke-virtual {v8}, Lg/E;->l()I

    move-result v6
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr v6, v9

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lb/a;->b(Ljava/lang/String;Ljava/lang/Exception;)Lb/a;

    move-result-object v0

    throw v0

    :cond_8
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "bogus placement for section "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    iput v6, p0, Lg/k;->r:I

    new-array v3, v6, [B

    new-instance v6, Ln/d;

    invoke-direct {v6, v3}, Ln/d;-><init>([B)V

    :goto_4
    if-ge v4, v2, :cond_e

    const/4 v8, 0x0

    :try_start_1
    aget-object v9, v1, v4

    if-eq v9, v5, :cond_a

    if-ne v9, v0, :cond_b

    :cond_a
    invoke-virtual {v9}, Lg/E;->f()Ljava/util/Collection;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_b

    goto :goto_5

    :cond_b
    invoke-virtual {v9}, Lg/E;->e()I

    move-result v10

    invoke-virtual {v6}, Ln/d;->j()I

    move-result v11

    sub-int/2addr v10, v11

    if-ltz v10, :cond_c

    invoke-virtual {v6, v10}, Ln/d;->u(I)V

    invoke-virtual {v9, v6}, Lg/E;->m(Ln/d;)V

    :goto_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_c
    new-instance v0, Lb/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "excess write of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    neg-int v2, v10

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v8}, Lb/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    move-exception v0

    instance-of v1, v0, Lb/a;

    if-eqz v1, :cond_d

    check-cast v0, Lb/a;

    goto :goto_6

    :cond_d
    new-instance v1, Lb/a;

    invoke-direct {v1, v8, v0}, Lb/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    move-object v0, v1

    :goto_6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb/a;->a(Ljava/lang/String;)V

    throw v0

    :cond_e
    invoke-virtual {v6}, Ln/d;->j()I

    move-result v0

    iget v1, p0, Lg/k;->r:I

    if-ne v0, v1, :cond_10

    invoke-virtual {v6}, Ln/d;->j()I

    move-result v0

    const-string v1, "unexpected digest write: "

    :try_start_2
    const-string v2, "SHA-1"

    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2
    :try_end_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_3

    const/16 v4, 0x20

    sub-int/2addr v0, v4

    invoke-virtual {v2, v3, v4, v0}, Ljava/security/MessageDigest;->update([BII)V

    const/16 v0, 0xc

    const/16 v4, 0x14

    :try_start_3
    invoke-virtual {v2, v3, v0, v4}, Ljava/security/MessageDigest;->digest([BII)I

    move-result v2
    :try_end_3
    .catch Ljava/security/DigestException; {:try_start_3 .. :try_end_3} :catch_2

    if-ne v2, v4, :cond_f

    invoke-virtual {v6}, Ln/d;->j()I

    move-result v1

    new-instance v2, Ljava/util/zip/Adler32;

    invoke-direct {v2}, Ljava/util/zip/Adler32;-><init>()V

    sub-int/2addr v1, v0

    invoke-virtual {v2, v3, v0, v1}, Ljava/util/zip/Adler32;->update([BII)V

    invoke-virtual {v2}, Ljava/util/zip/Adler32;->getValue()J

    move-result-wide v0

    long-to-int v0, v0

    int-to-byte v1, v0

    const/16 v2, 0x8

    aput-byte v1, v3, v2

    shr-int/lit8 v1, v0, 0x8

    int-to-byte v1, v1

    const/16 v2, 0x9

    aput-byte v1, v3, v2

    shr-int/lit8 v1, v0, 0x10

    int-to-byte v1, v1

    const/16 v2, 0xa

    aput-byte v1, v3, v2

    shr-int/lit8 v0, v0, 0x18

    int-to-byte v0, v0

    const/16 v1, 0xb

    aput-byte v0, v3, v1

    invoke-virtual {v6}, Ln/d;->i()[B

    move-result-object v0

    return-object v0

    :cond_f
    :try_start_4
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " bytes"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catch Ljava/security/DigestException; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_3
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_10
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "foreshortened write"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
