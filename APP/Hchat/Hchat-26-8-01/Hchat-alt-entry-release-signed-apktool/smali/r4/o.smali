.class public final Lr4/o;
.super Lr4/l0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final k:Li4/a;

.field public l:[B

.field public final m:Z

.field public final n:Lv4/y;


# direct methods
.method public constructor <init>(Li4/a;ZLv4/y;)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, -0x1

    .line 3
    invoke-direct {p0, v0, v1}, Lr4/l0;-><init>(II)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lr4/o;->k:Li4/a;

    .line 9
    .line 10
    iput-boolean p2, p0, Lr4/o;->m:Z

    .line 11
    .line 12
    iput-object p3, p0, Lr4/o;->n:Lv4/y;

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p1, "code == null"

    .line 16
    .line 17
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    throw p1
.end method


# virtual methods
.method public final a(Lr4/p;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final b()Lr4/b0;
    .locals 1

    .line 1
    sget-object v0, Lr4/b0;->z:Lr4/b0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j(Lr4/k0;I)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p1, p1, Lr4/o0;->b:Lr4/p;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p1, v0, v0, p2}, Lr4/o;->n(Lr4/p;Ljava/lang/String;Lz4/d;Z)[B

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lr4/o;->l:[B

    .line 10
    .line 11
    array-length p1, p1

    .line 12
    invoke-virtual {p0, p1}, Lr4/l0;->k(I)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catch_0
    move-exception p1

    .line 17
    iget-object p2, p0, Lr4/o;->n:Lv4/y;

    .line 18
    .line 19
    invoke-virtual {p2}, Lv4/w;->a()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    const-string v0, "...while placing debug info for "

    .line 24
    .line 25
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-static {p2, p1}, Lf4/a;->b(Ljava/lang/String;Ljava/lang/Exception;)Lf4/a;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    throw p1
.end method

.method public final l()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    const-string v1, "unsupported"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public final m(Lr4/p;Lz4/d;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lz4/d;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lr4/l0;->g()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, " debug info"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p2, v0}, Lz4/d;->c(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-virtual {p0, p1, v0, p2, v1}, Lr4/o;->n(Lr4/p;Ljava/lang/String;Lz4/d;Z)[B

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p1, p0, Lr4/o;->l:[B

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Lz4/d;->i([B)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final n(Lr4/p;Ljava/lang/String;Lz4/d;Z)[B
    .locals 10

    .line 1
    iget-object v0, p0, Lr4/o;->k:Li4/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Li4/a;->j()V

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Li4/a;->k:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v3, v1

    .line 9
    check-cast v3, Lp4/w;

    .line 10
    .line 11
    invoke-virtual {v0}, Li4/a;->j()V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, Li4/a;->l:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v4, v1

    .line 17
    check-cast v4, Lp4/o;

    .line 18
    .line 19
    invoke-virtual {v0}, Li4/a;->j()V

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Li4/a;->m:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lp4/i;

    .line 25
    .line 26
    invoke-virtual {v0}, Lp4/i;->o()I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    iget v7, v0, Lp4/i;->i:I

    .line 31
    .line 32
    new-instance v2, Lr4/n;

    .line 33
    .line 34
    iget-boolean v8, p0, Lr4/o;->m:Z

    .line 35
    .line 36
    iget-object v9, p0, Lr4/o;->n:Lv4/y;

    .line 37
    .line 38
    move-object v5, p1

    .line 39
    invoke-direct/range {v2 .. v9}, Lr4/n;-><init>(Lp4/w;Lp4/o;Lr4/p;IIZLv4/y;)V

    .line 40
    .line 41
    .line 42
    const-string p1, "...while encoding debug info"

    .line 43
    .line 44
    if-nez p3, :cond_0

    .line 45
    .line 46
    :try_start_0
    invoke-virtual {v2}, Lr4/n;->c()[B

    .line 47
    .line 48
    .line 49
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    return-object p1

    .line 51
    :catch_0
    move-exception v0

    .line 52
    move-object p2, v0

    .line 53
    invoke-static {p1, p2}, Lf4/a;->b(Ljava/lang/String;Ljava/lang/Exception;)Lf4/a;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    throw p1

    .line 58
    :cond_0
    iput-object p2, v2, Lr4/n;->l:Ljava/lang/String;

    .line 59
    .line 60
    iput-object p3, v2, Lr4/n;->k:Lz4/d;

    .line 61
    .line 62
    iput-boolean p4, v2, Lr4/n;->m:Z

    .line 63
    .line 64
    :try_start_1
    invoke-virtual {v2}, Lr4/n;->c()[B

    .line 65
    .line 66
    .line 67
    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 68
    return-object p1

    .line 69
    :catch_1
    move-exception v0

    .line 70
    move-object p2, v0

    .line 71
    invoke-static {p1, p2}, Lf4/a;->b(Ljava/lang/String;Ljava/lang/Exception;)Lf4/a;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    throw p1
.end method
